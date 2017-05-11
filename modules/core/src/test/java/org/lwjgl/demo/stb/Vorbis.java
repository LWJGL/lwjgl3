/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.stb;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.openal.*;
import org.lwjgl.opengl.*;
import org.lwjgl.stb.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.openal.SOFTDirectChannels.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBEasyFont.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * STB Vorbis demo.
 *
 * <p>Playback will pause while handling window events. In a real application, this can be fixed by running the decoder in a different thread.</p>
 */
public final class Vorbis {

    private Vorbis() {
    }

    public static void main(String[] args) {
        String filePath;
        if (args.length == 0) {
            System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.Vorbis -Dargs=<path>' to load a different Ogg Vorbis file.\n");
            filePath = "demo/phero.ogg";
        } else {
            filePath = args[0];
        }

        long device = alcOpenDevice((ByteBuffer)null);
        if (device == NULL) {
            throw new IllegalStateException("Failed to open the default device.");
        }

        ALCCapabilities deviceCaps = ALC.createCapabilities(device);

        long context = alcCreateContext(device, (IntBuffer)null);
        if (context == NULL) {
            throw new IllegalStateException("Failed to create an OpenAL context.");
        }

        alcSetThreadContext(context);
        AL.createCapabilities(deviceCaps);

        int source = alGenSources();
        alSourcei(source, AL_DIRECT_CHANNELS_SOFT, AL_TRUE);

        IntBuffer buffers = BufferUtils.createIntBuffer(2);
        alGenBuffers(buffers);

        Decoder  decoder  = null;
        Renderer renderer = null;
        try {
            decoder = new Decoder(filePath);
            renderer = new Renderer(decoder, "STB Vorbis Demo");
            long window = renderer.window;

            if (!decoder.play(source, buffers)) {
                System.err.println("Playback failed.");
                glfwSetWindowShouldClose(window, true);
            }

            while (!glfwWindowShouldClose(window)) {
                if (!renderer.paused && !decoder.update(source, true)) {
                    System.err.println("Playback failed.");
                    glfwSetWindowShouldClose(window, true);
                }

                float progress = decoder.getProgress();
                float time     = decoder.getProgressTime(progress);

                renderer.render(progress, time);
            }
        } finally {
            if (renderer != null) {
                renderer.destroy();
            }

            if (decoder != null) {
                stb_vorbis_close(decoder.handle);
            }

            alDeleteBuffers(buffers);
            alDeleteSources(source);

            alcSetThreadContext(NULL);
            alcDestroyContext(context);
            alcCloseDevice(device);
        }
    }

    private static class Decoder {

        private static final int BUFFER_SIZE = 1024 * 4;

        final ByteBuffer vorbis;

        final long handle;
        final int  channels;
        final int  sampleRate;
        final int  format;

        final int   lengthSamples;
        final float lengthSeconds;

        final ShortBuffer pcm;

        int samplesLeft;

        Decoder(String filePath) {
            try {
                vorbis = ioResourceToByteBuffer(filePath, 256 * 1024);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            IntBuffer error = BufferUtils.createIntBuffer(1);
            handle = stb_vorbis_open_memory(vorbis, error, null);
            if (handle == NULL) {
                throw new RuntimeException("Failed to open Ogg Vorbis file. Error: " + error.get(0));
            }

            try (STBVorbisInfo info = STBVorbisInfo.malloc()) {
                Decoder.getInfo(handle, info);
                this.channels = info.channels();
                this.sampleRate = info.sample_rate();
            }

            this.format = getFormat(channels);

            this.lengthSamples = stb_vorbis_stream_length_in_samples(handle);
            this.lengthSeconds = stb_vorbis_stream_length_in_seconds(handle);

            this.pcm = BufferUtils.createShortBuffer(BUFFER_SIZE);

            samplesLeft = lengthSamples;
        }

        private static void getInfo(long decoder, STBVorbisInfo info) {
            System.out.println("stream length, samples: " + stb_vorbis_stream_length_in_samples(decoder));
            System.out.println("stream length, seconds: " + stb_vorbis_stream_length_in_seconds(decoder));

            System.out.println();

            stb_vorbis_get_info(decoder, info);

            System.out.println("channels = " + info.channels());
            System.out.println("sampleRate = " + info.sample_rate());
            System.out.println("maxFrameSize = " + info.max_frame_size());
            System.out.println("setupMemoryRequired = " + info.setup_memory_required());
            System.out.println("setupTempMemoryRequired() = " + info.setup_temp_memory_required());
            System.out.println("tempMemoryRequired = " + info.temp_memory_required());
        }

        private static int getFormat(int channels) {
            switch (channels) {
                case 1:
                    return AL_FORMAT_MONO16;
                case 2:
                    return AL_FORMAT_STEREO16;
                default:
                    throw new UnsupportedOperationException("Unsupported number of channels: " + channels);
            }
        }

        private boolean stream(int buffer) {
            int samples = 0;

            while (samples < BUFFER_SIZE) {
                pcm.position(samples);
                int samplesPerChannel = stb_vorbis_get_samples_short_interleaved(handle, channels, pcm);
                if (samplesPerChannel == 0) {
                    break;
                }

                samples += samplesPerChannel * channels;
            }

            if (samples == 0) {
                return false;
            }

            pcm.position(0);
            alBufferData(buffer, format, pcm, sampleRate);
            samplesLeft -= samples / channels;

            return true;
        }

        float getProgress() {
            return 1.0f - samplesLeft / (float)(lengthSamples);
        }

        float getProgressTime(float progress) {
            return progress * lengthSeconds;
        }

        void rewind() {
            stb_vorbis_seek_start(handle);
            samplesLeft = lengthSamples;
        }

        void skip(int direction) {
            seek(min(max(0, stb_vorbis_get_sample_offset(handle) + direction * sampleRate), lengthSamples));
        }

        void skipTo(float offset0to1) {
            seek(round(lengthSamples * offset0to1));
        }

        private void seek(int sample_number) {
            stb_vorbis_seek(handle, sample_number);
            samplesLeft = lengthSamples - sample_number;
        }

        boolean play(int source, IntBuffer buffers) {
            for (int i = 0; i < buffers.limit(); i++) {
                if (!stream(buffers.get(i))) {
                    return false;
                }
            }

            alSourceQueueBuffers(source, buffers);
            alSourcePlay(source);

            return true;
        }

        boolean update(int source, boolean loop) {
            int processed = alGetSourcei(source, AL_BUFFERS_PROCESSED);

            for (int i = 0; i < processed; i++) {
                int buffer = alSourceUnqueueBuffers(source);

                if (!stream(buffer)) {
                    boolean shouldExit = true;

                    if (loop) {
                        rewind();
                        shouldExit = !stream(buffer);
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

    }

    private static class Renderer {

        private static final int WIDTH  = 640;
        private static final int HEIGHT = 320;

        private final GLFWErrorCallback           errorCallback;
        private final GLFWFramebufferSizeCallback framebufferSizeCallback;
        private final GLFWKeyCallback             keyCallback;
        private final GLFWCursorPosCallback       cursorPosCallback;
        private final GLFWMouseButtonCallback     mouseButtonCallback;

        private final Callback debugProc;

        private final long window;

        private final ByteBuffer charBuffer;

        private boolean paused;

        private double cursorX, cursorY;

        private boolean buttonPressed;

        Renderer(Decoder decoder, String title) {
            errorCallback = GLFWErrorCallback.createPrint().set();
            if (!glfwInit()) {
                throw new IllegalStateException("Unable to initialize GLFW");
            }

            glfwDefaultWindowHints();
            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
            glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE);

            window = glfwCreateWindow(WIDTH, HEIGHT, title, NULL, NULL);
            if (window == NULL) {
                throw new RuntimeException("Failed to create the GLFW window");
            }

            framebufferSizeCallback = new GLFWFramebufferSizeCallback() {
                @Override
                public void invoke(long window, int width, int height) {
                    glViewport(0, 0, width, height);
                }
            }.set(window);

            keyCallback = new GLFWKeyCallback() {
                @Override
                public void invoke(long window, int key, int scancode, int action, int mods) {
                    if (action == GLFW_RELEASE) {
                        return;
                    }

                    switch (key) {
                        case GLFW_KEY_ESCAPE:
                            glfwSetWindowShouldClose(window, true);
                            break;
                        case GLFW_KEY_HOME:
                            decoder.rewind();
                            break;
                        case GLFW_KEY_LEFT:
                            decoder.skip(-1);
                            break;
                        case GLFW_KEY_RIGHT:
                            decoder.skip(1);
                            break;
                        case GLFW_KEY_SPACE:
                            paused = !paused;
                            break;
                    }
                }
            }.set(window);

            mouseButtonCallback = new GLFWMouseButtonCallback() {
                @Override
                public void invoke(long window, int button, int action, int mods) {
                    if (button != GLFW_MOUSE_BUTTON_LEFT) {
                        return;
                    }

                    buttonPressed = action == GLFW_PRESS;
                    if (!buttonPressed) {
                        return;
                    }

                    seek(decoder);
                }
            }.set(window);

            cursorPosCallback = new GLFWCursorPosCallback() {
                @Override
                public void invoke(long window, double xpos, double ypos) {
                    cursorX = xpos - WIDTH * 0.5f;
                    cursorY = ypos - HEIGHT * 0.5f;

                    if (buttonPressed) {
                        seek(decoder);
                    }
                }
            }.set(window);

            // Center window
            GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

            glfwSetWindowPos(
                window,
                (vidmode.width() - WIDTH) / 2,
                (vidmode.height() - HEIGHT) / 2
            );

            // Create context
            glfwMakeContextCurrent(window);
            GL.createCapabilities();
            debugProc = GLUtil.setupDebugMessageCallback();

            glfwSwapInterval(1);
            glfwShowWindow(window);

            glMatrixMode(GL_PROJECTION);
            glLoadIdentity();
            glOrtho(0.0, WIDTH, HEIGHT, 0.0, -1.0, 1.0);
            glMatrixMode(GL_MODELVIEW);

            charBuffer = BufferUtils.createByteBuffer(256 * 270);

            glEnableClientState(GL_VERTEX_ARRAY);
            glVertexPointer(2, GL_FLOAT, 16, charBuffer);

            glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f); // BG color
        }

        private void seek(Decoder decoder) {
            if (cursorX < -254.0 || 254.0 < cursorX) {
                return;
            }

            if (cursorY < -30.0 || 30.0 < cursorY) {
                return;
            }

            decoder.skipTo((float)((cursorX + 254.0) / 508.0));
        }

        void render(float progress, float time) {
            glfwPollEvents();
            glClear(GL_COLOR_BUFFER_BIT);

            // Progress bar
            glPushMatrix();
            glTranslatef(WIDTH * 0.5f, HEIGHT * 0.5f, 0.0f);
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
            int minutes = (int)floor(time / 60.0f);
            int seconds = (int)floor((time - minutes * 60.0f));
            int quads   = stb_easy_font_print(WIDTH * 0.5f - 13, HEIGHT * 0.5f - 4, String.format("%02d:%02d", minutes, seconds), null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            // HUD
            quads = stb_easy_font_print(4, 4, "Press HOME to rewind", null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            quads = stb_easy_font_print(4, 20, "Press LEFT/RIGHT or LMB to seek", null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            quads = stb_easy_font_print(4, 36, "Press SPACE to pause/resume", null, charBuffer);
            glDrawArrays(GL_QUADS, 0, quads * 4);

            glfwSwapBuffers(window);
        }

        void destroy() {
            if (debugProc != null) {
                debugProc.free();
            }

            glfwFreeCallbacks(window);
            glfwDestroyWindow(window);

            glfwTerminate();
            glfwSetErrorCallback(null).free();
        }

    }

}