/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.stb;

import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWFramebufferSizeCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWvidmode;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.ALContext;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.libffi.Closure;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.openal.AL10.*;
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
		if ( args.length == 0 ) {
			System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.stb.Vorbis -Dargs=<path>' to load a different Ogg Vorbis file.\n");
			filePath = "demo/phero.ogg";
		} else
			filePath = args[0];

		ALContext al = ALContext.create(null, 48000, 60, false);

		int source = alGenSources();

		IntBuffer buffers = BufferUtils.createIntBuffer(2);
		alGenBuffers(buffers);

		Decoder decoder = null;
		Renderer renderer = null;
		try {
			decoder = new Decoder(filePath);
			renderer = new Renderer(decoder, "STB Vorbis Demo");
			long window = renderer.window;

			if ( !decoder.play(source, buffers) ) {
				System.err.println("Playback failed.");
				glfwSetWindowShouldClose(window, GL_TRUE);
			}

			while ( glfwWindowShouldClose(window) == GL_FALSE ) {
				if ( !renderer.paused && !decoder.update(source, true) ) {
					System.err.println("Playback failed.");
					glfwSetWindowShouldClose(window, GL_TRUE);
				}

				float progress = decoder.getProgress();
				float time = decoder.getProgressTime(progress);

				renderer.render(progress, time);
			}
		} finally {
			if ( renderer != null )
				renderer.destroy();

			if ( decoder != null )
				stb_vorbis_close(decoder.handle);

			alDeleteBuffers(buffers);
			alDeleteSources(source);

			AL.destroy(al);
		}
	}

	private static class Decoder {

		private static final int BUFFER_SIZE = 1024 * 4;

		final long handle;
		final int  channels;
		final int  sampleRate;
		final int  format;

		final int   lengthSamples;
		final float lengthSeconds;

		final ByteBuffer pcm;

		int samplesLeft;

		Decoder(String filePath) {
			ByteBuffer vorbis;
			try {
				vorbis = ioResourceToByteBuffer(filePath, 256 * 1024);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			IntBuffer error = BufferUtils.createIntBuffer(1);
			handle = stb_vorbis_open_memory(vorbis, error, null);
			if ( handle == NULL )
				throw new RuntimeException("Failed to open Ogg Vorbis file. Error: " + error.get(0));

			STBVorbisInfo info = Decoder.getInfo(handle);

			this.channels = info.getChannels();
			this.sampleRate = info.getSampleRate();
			this.format = getFormat(channels);

			this.lengthSamples = stb_vorbis_stream_length_in_samples(handle);
			this.lengthSeconds = stb_vorbis_stream_length_in_seconds(handle);

			this.pcm = BufferUtils.createByteBuffer(BUFFER_SIZE * 2);
		}

		private static STBVorbisInfo getInfo(long decoder) {
			System.out.println("stream length, samples: " + stb_vorbis_stream_length_in_samples(decoder));
			System.out.println("stream length, seconds: " + stb_vorbis_stream_length_in_seconds(decoder));

			System.out.println();

			STBVorbisInfo info = new STBVorbisInfo();
			stb_vorbis_get_info(decoder, info.buffer());

			System.out.println("channels = " + info.getChannels());
			System.out.println("sampleRate = " + info.getSampleRate());
			System.out.println("maxFrameSize = " + info.getMaxFrameSize());
			System.out.println("setupMemoryRequired = " + info.getSetupMemoryRequired());
			System.out.println("setupTempMemoryRequired() = " + info.getSetupTempMemoryRequired());
			System.out.println("tempMemoryRequired = " + info.getTempMemoryRequired());

			return info;
		}

		private static int getFormat(int channels) {
			switch ( channels ) {
				case 1:
					return AL_FORMAT_MONO16;
				case 2:
					return AL_FORMAT_STEREO16;
				default:
					throw new UnsupportedOperationException("Unsupported number of channels: " + channels);
			}
		}

		private boolean stream(int buffer) {
			int size = 0;

			while ( size < BUFFER_SIZE ) {
				pcm.position(size * 2);
				int result = stb_vorbis_get_samples_short_interleaved(handle, channels, pcm, BUFFER_SIZE - size);
				if ( result == 0 )
					break;

				size += result * channels;
			}

			if ( size == 0 )
				return false;

			pcm.position(0);
			alBufferData(buffer, format, pcm, size * 2, sampleRate);
			samplesLeft -= size;

			return true;
		}

		float getProgress() {
			return 1.0f - samplesLeft / (float)(lengthSamples * channels);
		}

		float getProgressTime(float progress) {
			return progress * lengthSeconds;
		}

		void rewind() {
			stb_vorbis_seek_start(handle);
			samplesLeft = stb_vorbis_stream_length_in_samples(handle) * channels;
		}

		boolean play(int source, IntBuffer buffers) {
			for ( int i = 0; i < buffers.limit(); i++ ) {
				if ( !stream(buffers.get(i)) )
					return false;
			}

			alSourceQueueBuffers(source, buffers);
			alSourcePlay(source);

			samplesLeft = stb_vorbis_stream_length_in_samples(handle) * channels;

			return true;
		}

		boolean update(int source, boolean loop) {
			int processed = alGetSourcei(source, AL_BUFFERS_PROCESSED);

			for ( int i = 0; i < processed; i++ ) {
				int buffer = alSourceUnqueueBuffers(source);

				if ( !stream(buffer) ) {
					boolean shouldExit = true;

					if ( loop ) {
						rewind();
						shouldExit = !stream(buffer);
					}

					if ( shouldExit )
						return false;
				}
				alSourceQueueBuffers(source, buffer);
			}

			if ( processed == 2 )
				alSourcePlay(source);

			return true;
		}

	}

	private static class Renderer {

		private static final int WIDTH  = 640;
		private static final int HEIGHT = 320;

		private final GLFWErrorCallback           errorfun;
		private final GLFWFramebufferSizeCallback framebufferSizefun;
		private final GLFWKeyCallback             keyfun;

		private final Closure debugProc;

		private final long window;

		private final ByteBuffer charBuffer;

		private int width, height;

		private boolean paused;

		Renderer(final Decoder decoder, String title) {
			glfwSetErrorCallback(errorfun = errorCallbackPrint(System.err));
			if ( glfwInit() != GL11.GL_TRUE )
				throw new IllegalStateException("Unable to initialize GLFW");

			glfwDefaultWindowHints();
			glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
			glfwWindowHint(GLFW_RESIZABLE, GL_FALSE);

			width = WIDTH;
			height = HEIGHT;
			window = glfwCreateWindow(width, height, title, NULL, NULL);
			if ( window == NULL )
				throw new RuntimeException("Failed to create the GLFW window");

			glfwSetKeyCallback(window, keyfun = new GLFWKeyCallback() {
				@Override
				public void invoke(long window, int key, int scancode, int action, int mods) {
					if ( action == GLFW_RELEASE )
						return;

					switch ( key ) {
						case GLFW_KEY_ESCAPE:
							glfwSetWindowShouldClose(window, GL_TRUE);
							break;
						case GLFW_KEY_R:
							decoder.rewind();
							break;
						case GLFW_KEY_SPACE:
							paused = !paused;
							break;
					}
				}
			});
			glfwSetFramebufferSizeCallback(window, framebufferSizefun = new GLFWFramebufferSizeCallback() {
				@Override
				public void invoke(long window, int width, int height) {
					Renderer.this.width = width;
					Renderer.this.height = height;

					updateViewport();
				}
			});

			// Center window
			GLFWvidmode vidmode = new GLFWvidmode(glfwGetVideoMode(glfwGetPrimaryMonitor()));

			glfwSetWindowPos(
				window,
				(vidmode.getWidth() - width) / 2,
				(vidmode.getHeight() - height) / 2
			);

			// Create context
			glfwMakeContextCurrent(window);
			debugProc = GLContext.createFromCurrent().setupDebugMessageCallback();

			glfwSwapInterval(1);
			glfwShowWindow(window);

			// Handle HiDPI displays
			IntBuffer w = BufferUtils.createIntBuffer(1);
			IntBuffer h = BufferUtils.createIntBuffer(1);
			glfwGetFramebufferSize(window, w, h);

			if ( w.get(0) != width || h.get(0) != height )
				framebufferSizefun.invoke(window, w.get(0), h.get(0));

			charBuffer = BufferUtils.createByteBuffer(256 * 270);

			glEnableClientState(GL_VERTEX_ARRAY);
			glVertexPointer(2, GL_FLOAT, 16, charBuffer);

			glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f); // BG color
		}

		private void updateViewport() {
			if ( width == 0 || height == 0 )
				return;

			glViewport(0, 0, width, height);

			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			glOrtho(0.0, WIDTH, HEIGHT, 0.0, -1.0, 1.0);

			glMatrixMode(GL_MODELVIEW);
			glLoadIdentity();
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
			int quads = stb_easy_font_print(WIDTH * 0.5f - 13, HEIGHT * 0.5f - 4, String.format("%02d:%02d", minutes, seconds), null, charBuffer);
			glDrawArrays(GL_QUADS, 0, quads * 4);

			// HUD
			quads = stb_easy_font_print(4, 4, "Press R to rewind", null, charBuffer);
			glDrawArrays(GL_QUADS, 0, quads * 4);

			quads = stb_easy_font_print(4, 20, "Press SPACE to pause/resume", null, charBuffer);
			glDrawArrays(GL_QUADS, 0, quads * 4);

			glfwSwapBuffers(window);
		}

		void destroy() {
			glfwDestroyWindow(window);

			if ( debugProc != null )
				debugProc.release();
			framebufferSizefun.release();
			keyfun.release();
			glfwTerminate();
			errorfun.release();
		}

	}

}