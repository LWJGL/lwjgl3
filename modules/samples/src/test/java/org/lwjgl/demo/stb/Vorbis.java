/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.stb;

import org.lwjgl.glfw.*;
import org.lwjgl.openal.*;
import org.lwjgl.opengl.*;
import org.lwjgl.stb.*;
import org.lwjgl.system.*;
import org.lwjgl.system.windows.*;

import java.io.*;
import java.nio.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.openal.AL11.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.openal.SOFTDirectChannels.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBEasyFont.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.User32.*;

/** stb_vorbis demo */
public final class Vorbis implements AutoCloseable {

    /*
    Vorbis           : UI state and event loop (GLFW)
    VorbisTrack      : Vorbis decoding state (stb_vorbis)
    AudioRenderer    : Stream decoding and audio playback (OpenAL)
    GraphicsRenderer : UI rendering (OpenGL)

    There are 3 threads:

    - Main/UI thread  : loads the Vorbis file and runs the UI event loop (with blocking glfwWaitEvents)
    - Audio thread    : stream decoding/playback (ticks at 30Hz)
    - Graphics thread : renders the current UI state (vsync)

    ProgressUpdater  : Used to query the audio playback progress from the rendering thread (at 60fps)
     */

    private final AtomicBoolean paused      = new AtomicBoolean();
    private final AtomicInteger sampleIndex = new AtomicInteger();

    private final VorbisTrack track;

    private ProgressUpdater progressUpdater;

    private final long window;

    private float
        clientW,
        clientH;

    private int
        framebufferW,
        framebufferH;

    private float
        scaleX,
        scaleY;

    private double
        cursorX,
        cursorY;

    private boolean buttonPressed;

    private Vorbis(String filePath) {
        track = new VorbisTrack(filePath, sampleIndex);

        if (Platform.get() == Platform.WINDOWS) {
            // DPI changes work perfectly on Java 9, which is PER_MONITOR_AWARE.

            // Java 8 is only SYSTEM_AWARE. The call below will work and
            // dpi-aware functions will return the correct values for each
            // monitor, but the OpenGL framebuffer will be scaled automatically
            // by the system on monitors that do not match the system DPI. This
            // causes rendering problems.
            //
            // Workaround: Build a custom executable and launch the JVM using JNI
            // after calling SetProcessDpiAwarenessContext(DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE)

            if (User32.Functions.SetThreadDpiAwarenessContext != NULL) {
                SetThreadDpiAwarenessContext(IsValidDpiAwarenessContext(DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2)
                    ? DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2
                    : DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE);
            }
        }

        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);
        glfwWindowHint(GLFW_SAMPLES, 8);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        window = glfwCreateWindow(640, 320, "stb_vorbis demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }
        try (MemoryStack s = stackPush()) {
            IntBuffer pw = s.mallocInt(1);
            IntBuffer ph = s.mallocInt(1);

            glfwGetFramebufferSize(window, pw, ph);
            changedFramebufferSize(window, pw.get(0), ph.get(0));
        }

        // Center window
        long monitor = glfwGetPrimaryMonitor();

        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(monitor));
        glfwSetWindowPos(
            window,
            (vidmode.width() - (int)(clientW * scaleX)) / 2,
            (vidmode.height() - (int)(clientH * scaleY)) / 2
        );

        glfwSetFramebufferSizeCallback(window, this::changedFramebufferSize);

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (action == GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
                case GLFW_KEY_HOME:
                    track.rewind();
                    break;
                case GLFW_KEY_LEFT:
                    track.skip(-1);
                    break;
                case GLFW_KEY_RIGHT:
                    track.skip(1);
                    break;
                case GLFW_KEY_SPACE:
                    paused.set(!paused.get());
                    break;
            }
        });

        glfwSetMouseButtonCallback(window, (window, button, action, mods) -> {
            if (button != GLFW_MOUSE_BUTTON_LEFT) {
                return;
            }

            buttonPressed = action == GLFW_PRESS;
            if (!buttonPressed) {
                return;
            }

            seek(track, cursorX, cursorY);
        });

        glfwSetCursorPosCallback(window, (window, xpos, ypos) -> {
            cursorX = (xpos / scaleX - clientW * 0.5);
            cursorY = (ypos / scaleY - clientH * 0.5);

            if (buttonPressed) {
                seek(track, cursorX, cursorY);
            }
        });
    }

    private void changedFramebufferSize(long window, int width, int height) {
        this.framebufferW = width;
        this.framebufferH = height;

        try (MemoryStack s = stackPush()) {
            FloatBuffer px = s.mallocFloat(1);
            FloatBuffer py = s.mallocFloat(1);

            glfwGetWindowContentScale(window, px, py);

            if (scaleX != px.get(0) || scaleY != py.get(0)) {
                scaleX = px.get(0);
                scaleY = py.get(0);

                System.out.println("New content scale: " + scaleX + " x " + scaleY);
            }
        }

        this.clientW = width / scaleX;
        this.clientH = height / scaleY;
    }

    @Override
    public void close() {
        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);

        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    public static void main(String[] args) {
        String filePath;
        if (args.length == 0) {
            System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.Vorbis -Dargs=<path>' to load a different Ogg Vorbis file.\n");
            filePath = "demo/phero.ogg";
        } else {
            filePath = args[0];
        }

        try (Vorbis vorbis = new Vorbis(filePath)) {
            vorbis.runEventLoop();
        }
    }

    private void runEventLoop() {
        AtomicBoolean hasError = new AtomicBoolean();

        CountDownLatch audioLatch = new CountDownLatch(1);
        Thread audioThread = new Thread(() -> {
            try (AudioRenderer audioRenderer = new AudioRenderer(track)) {
                progressUpdater = audioRenderer.getProgressUpdater();

                if (!audioRenderer.play()) {
                    System.err.println("Playback failed.");
                    glfwSetWindowShouldClose(window, true);
                }

                audioLatch.countDown();
                while (!glfwWindowShouldClose(window)) {
                    if (!paused.get()) {
                        if (!audioRenderer.update(true)) {
                            System.err.println("Playback failed.");
                            glfwSetWindowShouldClose(window, true);
                        }
                    }
                    sleep(1000 / 30);
                }
            } catch (Throwable t) {
                t.printStackTrace();
                hasError.set(true);
                audioLatch.countDown();
            }
        });
        audioThread.start();

        CountDownLatch graphicsLatch = new CountDownLatch(1);
        Thread graphicsThread = new Thread(new Runnable() {
            int sampleIndexLast = -1;

            @Override
            public void run() {
                glfwMakeContextCurrent(window);
                try (GraphicsRenderer graphicsRenderer = new GraphicsRenderer()) {
                    try {
                        audioLatch.await();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }

                    glfwSetWindowRefreshCallback(window, window -> {
                        if (clientW != 0 && clientH != 0) {
                            // This is called on the UI thread, but rendering happens asynchronously in
                            // the rendering thread. The UI thread blocks here, until the next v-sync
                            // has completed. This effectively eliminates all rendering artifacts when
                            // the window is resized.
                            graphicsRenderer.awaitVSync();
                        }
                    });

                    graphicsLatch.countDown();

                    progressUpdater.makeCurrent(true);
                    while (!glfwWindowShouldClose(window)) {
                        progressUpdater.updateProgress();
                        int sampleIndexCurr = sampleIndex.get();
                        if (sampleIndexCurr == sampleIndexLast || clientW == 0 || clientH == 0) {
                            sleep(1000 / 60);
                            continue;
                        }
                        sampleIndexLast = sampleIndexCurr;

                        float progress = sampleIndex.get() / (float)(track.samplesLength);
                        graphicsRenderer.render(
                            framebufferW, framebufferH,
                            clientW, clientH,
                            progress, progress * track.samplesSec
                        );
                        glfwSwapBuffers(window);
                        graphicsRenderer.signalVSync();
                    }
                    progressUpdater.makeCurrent(false);
                } catch (Throwable t) {
                    t.printStackTrace();
                    hasError.set(true);
                    graphicsLatch.countDown();
                }
            }
        });
        graphicsThread.start();

        try {
            graphicsLatch.await();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        glfwShowWindow(window);
        while (!glfwWindowShouldClose(window) && !hasError.get()) {
            glfwWaitEvents();
        }

        try {
            graphicsThread.join();
            audioThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void seek(VorbisTrack track, double cursorX, double cursorY) {
        if (cursorX < -254.0 || 254.0 < cursorX) {
            return;
        }

        if (cursorY < -30.0 || 30.0 < cursorY) {
            return;
        }

        track.skipTo((float)((cursorX + 254.0) / 508.0));
    }

    private static class VorbisTrack implements AutoCloseable {
        private final ByteBuffer encodedAudio;

        private final long handle;

        private final int channels;
        private final int sampleRate;

        final int   samplesLength;
        final float samplesSec;

        private final AtomicInteger sampleIndex;

        VorbisTrack(String filePath, AtomicInteger sampleIndex) {
            try {
                encodedAudio = ioResourceToByteBuffer(filePath, 256 * 1024);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (MemoryStack stack = stackPush()) {
                IntBuffer error = stack.mallocInt(1);
                handle = stb_vorbis_open_memory(encodedAudio, error, null);
                if (handle == NULL) {
                    throw new RuntimeException("Failed to open Ogg Vorbis file. Error: " + error.get(0));
                }

                STBVorbisInfo info = STBVorbisInfo.malloc(stack);
                print(info);
                this.channels = info.channels();
                this.sampleRate = info.sample_rate();
            }

            this.samplesLength = stb_vorbis_stream_length_in_samples(handle);
            this.samplesSec = stb_vorbis_stream_length_in_seconds(handle);

            this.sampleIndex = sampleIndex;
            sampleIndex.set(0);
        }

        @Override
        public void close() {
            stb_vorbis_close(handle);
        }

        void progressBy(int samples) {
            sampleIndex.set(sampleIndex.get() + samples);
        }

        void setSampleIndex(int sampleIndex) {
            this.sampleIndex.set(sampleIndex);
        }

        void rewind() {
            seek(0);
        }

        void skip(int direction) {
            seek(min(max(0, stb_vorbis_get_sample_offset(handle) + direction * sampleRate), samplesLength));
        }

        void skipTo(float offset0to1) {
            seek(round(samplesLength * offset0to1));
        }

        // called from audio thread
        synchronized int getSamples(ShortBuffer pcm) {
            return stb_vorbis_get_samples_short_interleaved(handle, channels, pcm);
        }

        // called from UI thread
        private synchronized void seek(int sampleIndex) {
            stb_vorbis_seek(handle, sampleIndex);
            setSampleIndex(sampleIndex);
        }

        private void print(STBVorbisInfo info) {
            System.out.println("stream length, samples: " + stb_vorbis_stream_length_in_samples(handle));
            System.out.println("stream length, seconds: " + stb_vorbis_stream_length_in_seconds(handle));

            System.out.println();

            stb_vorbis_get_info(handle, info);

            System.out.println("channels = " + info.channels());
            System.out.println("sampleRate = " + info.sample_rate());
            System.out.println("maxFrameSize = " + info.max_frame_size());
            System.out.println("setupMemoryRequired = " + info.setup_memory_required());
            System.out.println("setupTempMemoryRequired() = " + info.setup_temp_memory_required());
            System.out.println("tempMemoryRequired = " + info.temp_memory_required());
        }
    }

    interface ProgressUpdater {
        void makeCurrent(boolean current);
        void updateProgress();
    }

    private static class AudioRenderer implements AutoCloseable {
        private static final int BUFFER_SIZE = 1024 * 8;

        private final VorbisTrack track;

        private final int format;

        private final long device;
        private final long context;

        private final int       source;
        private final IntBuffer buffers;

        private final ShortBuffer pcm;

        long bufferOffset; // offset of last processed buffer
        long offset; // bufferOffset + offset of current buffer
        long lastOffset; // last offset update

        AudioRenderer(VorbisTrack track) {
            this.track = track;

            switch (track.channels) {
                case 1:
                    this.format = AL_FORMAT_MONO16;
                    break;
                case 2:
                    this.format = AL_FORMAT_STEREO16;
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported number of channels: " + track.channels);
            }

            device = alcOpenDevice((ByteBuffer)null);
            if (device == NULL) {
                throw new IllegalStateException("Failed to open the default device.");
            }

            context = alcCreateContext(device, (IntBuffer)null);
            if (context == NULL) {
                throw new IllegalStateException("Failed to create an OpenAL context.");
            }

            this.pcm = memAllocShort(BUFFER_SIZE);

            alcSetThreadContext(context);

            ALCCapabilities deviceCaps = ALC.createCapabilities(device);
            AL.createCapabilities(deviceCaps);

            source = alGenSources();
            alSourcei(source, AL_DIRECT_CHANNELS_SOFT, AL_TRUE);

            buffers = memAllocInt(2);
            alGenBuffers(buffers);
        }

        @Override
        public void close() {
            alDeleteBuffers(buffers);
            alDeleteSources(source);

            memFree(buffers);
            memFree(pcm);

            alcSetThreadContext(NULL);
            alcDestroyContext(context);
            alcCloseDevice(device);
        }

        private int stream(int buffer) {
            int samples = 0;

            while (samples < BUFFER_SIZE) {
                pcm.position(samples);
                int samplesPerChannel = track.getSamples(pcm);
                if (samplesPerChannel == 0) {
                    break;
                }

                samples += samplesPerChannel * track.channels;
            }

            if (samples != 0) {
                pcm.position(0);
                pcm.limit(samples);
                alBufferData(buffer, format, pcm, track.sampleRate);
                pcm.limit(BUFFER_SIZE);
            }

            return samples;
        }

        boolean play() {
            for (int i = 0; i < buffers.limit(); i++) {
                if (stream(buffers.get(i)) == 0) {
                    return false;
                }
            }

            alSourceQueueBuffers(source, buffers);
            alSourcePlay(source);

            return true;
        }

        boolean update(boolean loop) {
            int processed = alGetSourcei(source, AL_BUFFERS_PROCESSED);

            for (int i = 0; i < processed; i++) {
                bufferOffset += BUFFER_SIZE / track.channels;

                int buffer = alSourceUnqueueBuffers(source);

                if (stream(buffer) == 0) {
                    boolean shouldExit = true;

                    if (loop) {
                        track.rewind();
                        lastOffset = offset = bufferOffset = 0;
                        shouldExit = stream(buffer) == 0;
                    }

                    if (shouldExit) {
                        return false;
                    }
                }
                alSourceQueueBuffers(source, buffer);
            }

            if (processed == 2) {
                alSourcePlay(source);
            }

            return true;
        }

        public ProgressUpdater getProgressUpdater() {
            return new ProgressUpdater() {
                @Override
                public void makeCurrent(boolean current) {
                    alcSetThreadContext(current ? context : NULL);
                }

                @Override
                public void updateProgress() {
                    offset = bufferOffset + alGetSourcei(source, AL_SAMPLE_OFFSET);
                    track.progressBy((int)(offset - lastOffset));
                    lastOffset = offset;
                }
            };
        }
    }

    private static class GraphicsRenderer implements AutoCloseable {
        private final Callback debugProc;

        private final ByteBuffer charBuffer;

        private final Phaser waitForVSync;

        GraphicsRenderer() {
            // Create context
            GL.createCapabilities();
            debugProc = GLUtil.setupDebugMessageCallback();

            glfwSwapInterval(1);

            charBuffer = memAlloc(256 * 270);

            glEnableClientState(GL_VERTEX_ARRAY);
            glVertexPointer(2, GL_FLOAT, 16, charBuffer);

            glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f); // BG color

            waitForVSync = new Phaser() {
                @Override
                protected boolean onAdvance(int phase, int registeredParties) {
                    return false; // never terminate
                }
            };
        }

        @Override
        public void close() {
            memFree(charBuffer);
            if (debugProc != null) {
                debugProc.free();
            }
        }

        void render(
            int framebufferW, int framebufferH,
            float clientW, float clientH,
            float progress, float progressTime
        ) {
            glViewport(0, 0, framebufferW, framebufferH);

            glClear(GL_COLOR_BUFFER_BIT);

            glMatrixMode(GL_PROJECTION);
            glLoadIdentity();
            glOrtho(0.0, clientW, clientH, 0.0, -1.0, 1.0);
            glMatrixMode(GL_MODELVIEW);

            // Progress bar
            glPushMatrix();
            glTranslatef(clientW * 0.5f, clientH * 0.5f, 0.0f);
            glBegin(GL_QUADS);
            {
                glColor3f(0.5f * 43f / 255f, 0.5f * 43f / 255f, 0.5f * 43f / 255f);
                glVertex2f(-256.0f, -32.0f);
                glVertex2f(256.0f, -32.0f);
                glVertex2f(256.0f, 32.0f);
                glVertex2f(-256.0f, 32.0f);

                glColor3f(0.5f, 0.5f, 0.0f);

                glVertex2f(-254.0f, -30.0f);
                glVertex2f(-254.0f + progress * 508.0f, -30.0f);
                glVertex2f(-254.0f + progress * 508.0f, 30.0f);
                glVertex2f(-254.0f, 30.0f);
            }
            glEnd();
            glPopMatrix();

            glColor3f(169f / 255f, 183f / 255f, 198f / 255f); // Text color

            // Progress text
            int minutes = (int)floor(progressTime / 60.0);
            int seconds = (int)floor(progressTime - minutes * 60.0);
            int millis  = (int)floor((progressTime - minutes * 60.0 - seconds) * 100.0);
            int quads   = stb_easy_font_print(clientW * 0.5f - 21, clientH * 0.5f - 4, String.format("%02d:%02d.%02d", minutes, seconds, millis), null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            // HUD
            quads = stb_easy_font_print(4, 4, "Press HOME to rewind", null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            quads = stb_easy_font_print(4, 20, "Press LEFT/RIGHT or LMB to seek", null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            quads = stb_easy_font_print(4, 36, "Press SPACE to pause/resume", null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);
        }

        // Called from the UI thread
        void awaitVSync() {
            // 2. wait for the rendering thread to signal that the v-sync is complete
            waitForVSync.awaitAdvance(
                // 1. signal the rendering thread to wait for v-sync
                waitForVSync.register()
            );
        }

        // Called from the rendering thread
        void signalVSync() {
            if (waitForVSync.getRegisteredParties() != 0) {
                // wait for the v-sync to finish
                glFinish();
                waitForVSync.arriveAndDeregister();
            }
        }
    }

}