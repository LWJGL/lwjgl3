/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.PointerBuffer;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.GLFWimage;
import org.lwjgl.system.glfw.MonitorCallback;
import org.lwjgl.system.glfw.WindowCallback;

import java.io.IOException;
import java.nio.ByteBuffer;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;

/** GLFW events demo. */
public final class Events {

	private Events() {
	}

	public static void main(String[] args) {
		glfwSetErrorCallback(ErrorCallback.Util.getDefault());
		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		System.out.println("GLFW initialized");

		try {
			demo();
		} finally {
			glfwTerminate();
		}
	}

	private static void demo() {
		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);

		long window = glfwCreateWindow(640, 480, "GLFW Event Demo", NULL, NULL);
		if ( window == 0L )
			throw new IllegalStateException("Failed to create GLFW window.");

		System.out.println("Window opened.");

		try {
			ImageData pixels = ioImageResourceToByteBuffer("demo/cursor.png");

			ByteBuffer img = GLFWimage.malloc(pixels.width, pixels.height, pixels.data);
			long cursor = glfwCreateCursor(img, 0, 8);

			glfwSetCursor(window, cursor);
		} catch (IOException e) {
			e.printStackTrace();
		}

		glfwSetMonitorCallback(MonitorCallback.Util.getDefault());

		WindowCallback.set(window, new WindowCallback() {
			@Override
			public void windowPos(long window, int xpos, int ypos) {
				printEvent(window, "moved to %d, %d", xpos, ypos);
			}

			@Override
			public void windowSize(long window, int width, int height) {
				printEvent(window, "resized to %d x %d", width, height);
			}

			@Override
			public void windowClose(long window) {
				printEvent(window, "closed");
			}

			@Override
			public void windowRefresh(long window) {
				printEvent(window, "refreshed");
			}

			@Override
			public void windowFocus(long window, int focused) {
				printEvent(window, focused == 0 ? "lost focus" : "gained focus");
			}

			@Override
			public void windowIconify(long window, int iconified) {
				printEvent(window, iconified == 0 ? "restored" : "iconified");
			}

			@Override
			public void framebufferSize(long window, int width, int height) {
				printEvent(window, "framebuffer resized to %d x %d", width, height);
			}

			@Override
			public void key(long window, int key, int scancode, int action, int mods) {
				String state;
				switch ( action ) {
					case GLFW_RELEASE:
						state = "released";
						break;
					case GLFW_PRESS:
						state = "pressed";
						break;
					case GLFW_REPEAT:
						state = "repeated";
						break;
					default:
						throw new IllegalArgumentException(String.format("Unsupported key action: 0x%X", action));
				}

				printEvent(window, "key %s[0x%X - %d] was %s", getModState(mods), key, scancode, state);

				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					glfwSetWindowShouldClose(window, 1);
			}

			@Override
			public void character(long window, int codepoint) {
				printEvent(window, "char %s", Character.toString((char)codepoint));
			}

			@Override
			public void charMods(long window, int codepoint, int mods) {
				printEvent(window, "char mods %s%s", getModState(mods), Character.toString((char)codepoint));
			}

			@Override
			public void mouseButton(long window, int button, int action, int mods) {
				String state;
				switch ( action ) {
					case GLFW_RELEASE:
						state = "released";
						break;
					case GLFW_PRESS:
						state = "pressed";
						break;
					default:
						throw new IllegalArgumentException(String.format("Unsupported mouse button action: 0x%X", action));
				}
				printEvent(window, "mouse button %s[0x%X] was %s", getModState(mods), button, state);
			}

			@Override
			public void cursorPos(long window, double xpos, double ypos) {
				printEvent(window, "cursor moved to %f, %f", xpos, ypos);
			}

			@Override
			public void cursorEnter(long window, int entered) {
				printEvent(window, "cursor %s", entered == 0 ? "left" : "entered");
			}

			@Override
			public void scroll(long window, double xoffset, double yoffset) {
				printEvent(window, "scroll by %f, %f", xoffset, yoffset);
			}

			@Override
			public void drop(long window, int count, long names) {
				printEvent(window, "drop %d file%s", count, count == 1 ? "" : "s");

				PointerBuffer nameBuffer = memPointerBuffer(names, count);
				for ( int i = 0; i < count; i++ ) {
					System.out.format("\t%d: %s%n", i + 1, memDecodeUTF8(memByteBufferNT1(nameBuffer.get(i))));
				}
			}
		});

		glfwMakeContextCurrent(window);
		GLContext.createFromCurrent();

		glfwShowWindow(window);
		glfwSwapInterval(1);

		glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
		while ( glfwWindowShouldClose(window) == 0 ) {
			glfwWaitEvents();

			glClear(GL_COLOR_BUFFER_BIT);
			glfwSwapBuffers(window);
		}
	}

	private static String getModState(int mods) {
		if ( mods == 0 )
			return "";

		StringBuilder modState = new StringBuilder(16);
		if ( (mods & GLFW_MOD_SHIFT) != 0 )
			modState.append("SHIFT+");
		if ( (mods & GLFW_MOD_CONTROL) != 0 )
			modState.append("CONTROL+");
		if ( (mods & GLFW_MOD_ALT) != 0 )
			modState.append("ALT+");
		if ( (mods & GLFW_MOD_SUPER) != 0 )
			modState.append("SUPER+");

		return modState.toString();
	}

	private static void printEvent(long window, String format, Object... args) {
		Object[] formatArgs = new Object[2 + args.length];

		formatArgs[0] = glfwGetTime();
		formatArgs[1] = window;
		System.arraycopy(args, 0, formatArgs, 2, args.length);

		System.out.format("%.3f: Window [%d] " + format + "%n", formatArgs);
	}

}