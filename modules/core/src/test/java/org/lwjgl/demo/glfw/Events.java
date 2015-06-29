/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.TokenFilter;
import org.lwjgl.demo.util.ClosureGC;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GLContext;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Map;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.MemoryUtil.*;

/** GLFW events demo. */
public final class Events {

	private Events() {
	}

	public static void main(String[] args) {
		System.setProperty(
			"org.lwjgl.system.libffi.ClosureRegistry",
			"org.lwjgl.demo.util.ClosureGC"
		);

		glfwSetErrorCallback(errorCallbackPrint(System.out));

		System.out.println("---- [ Error callback test ] ----");
		glfwDefaultWindowHints();
		System.out.println("---- [ Error callback done ] ----");

		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		System.out.println("GLFW initialized");

		try {
			demo();
		} finally {
			glfwTerminate();
			ClosureGC.get().gc();
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
			Class.forName("STBImage"); // Skip if the stb bindings are not available

			ByteBuffer png;
			try {
				png = ioResourceToByteBuffer("demo/cursor.png", 1024);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			IntBuffer w = BufferUtils.createIntBuffer(1);
			IntBuffer h = BufferUtils.createIntBuffer(1);
			IntBuffer comp = BufferUtils.createIntBuffer(1);

			ByteBuffer pixels = stbi_load_from_memory(png, w, h, comp, 0);

			ByteBuffer img = GLFWimage.malloc(w.get(0), h.get(0), pixels);
			long cursor = glfwCreateCursor(img, 0, 8);

			glfwSetCursor(window, cursor);
		} catch (ClassNotFoundException e) {
			// ignore
		}

		glfwSetMonitorCallback(new GLFWMonitorCallback() {
			@Override
			public void invoke(long monitor, int event) {
				printEvent("Monitor", "[0x%X] %s", monitor, event == GLFW_CONNECTED ? "connected" : "disconnected");
			}
		});

		glfwSetWindowPosCallback(window, new GLFWWindowPosCallback() {
			@Override
			public void invoke(long window, int xpos, int ypos) {
				printEvent("moved to %d, %d", window, xpos, ypos);
			}
		});

		glfwSetWindowSizeCallback(window, new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				printEvent("resized to %d x %d", window, width, height);
			}
		});

		glfwSetWindowCloseCallback(window, new GLFWWindowCloseCallback() {
			@Override
			public void invoke(long window) {
				printEvent("closed", window);
			}
		});

		glfwSetWindowRefreshCallback(window, new GLFWWindowRefreshCallback() {
			@Override
			public void invoke(long window) {
				printEvent("refreshed", window);
			}
		});

		glfwSetWindowFocusCallback(window, new GLFWWindowFocusCallback() {
			@Override
			public void invoke(long window, int focused) {
				printEvent(focused == 0 ? "lost focus" : "gained focus", window);
			}
		});

		glfwSetWindowIconifyCallback(window, new GLFWWindowIconifyCallback() {
			@Override
			public void invoke(long window, int iconified) {
				printEvent(iconified == 0 ? "restored" : "iconified", window);
			}
		});

		glfwSetFramebufferSizeCallback(window, new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				printEvent("framebuffer resized to %d x %d", window, width, height);
			}
		});

		glfwSetKeyCallback(window, new GLFWKeyCallback() {
			private final Map<Integer, String> KEY_CODES = LWJGLUtil.getClassTokens(new TokenFilter() {
				@Override
				public boolean accept(Field field, int value) {
					return field.getName().startsWith("GLFW_KEY_");
				}
			}, null, GLFW.class);

			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
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

				printEvent("key %s[%s - %d] was %s", window, getModState(mods), KEY_CODES.get(key), scancode, state);

				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					glfwSetWindowShouldClose(window, 1);
			}
		});

		glfwSetCharCallback(window, new GLFWCharCallback() {
			@Override
			public void invoke(long window, int codepoint) {
				printEvent("char %s", window, Character.toString((char)codepoint));
			}
		});

		glfwSetCharModsCallback(window, new GLFWCharModsCallback() {
			@Override
			public void invoke(long window, int codepoint, int mods) {
				printEvent("char mods %s%s", window, getModState(mods), Character.toString((char)codepoint));
			}
		});

		glfwSetMouseButtonCallback(window, new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
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
				printEvent("mouse button %s[0x%X] was %s", window, getModState(mods), button, state);
			}
		});

		glfwSetCursorPosCallback(window, new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double xpos, double ypos) {
				printEvent("cursor moved to %f, %f", window, xpos, ypos);
			}
		});

		glfwSetCursorEnterCallback(window, new GLFWCursorEnterCallback() {
			@Override
			public void invoke(long window, int entered) {
				printEvent("cursor %s", window, entered == 0 ? "left" : "entered");
			}
		});

		glfwSetScrollCallback(window, new GLFWScrollCallback() {
			@Override
			public void invoke(long window, double xoffset, double yoffset) {
				printEvent("scroll by %f, %f", window, xoffset, yoffset);
			}
		});

		glfwSetDropCallback(window, new GLFWDropCallback() {
			@Override
			public void invoke(long window, int count, long names) {
				printEvent("drop %d file%s", window, count, count == 1 ? "" : "s");

				dropCallbackNamesApply(count, names, new DropConsumerString() {
					@Override
					public void accept(int index, String name) {
						System.out.format("\t%d: %s%n", index + 1, name);
					}
				});
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

	private static void printEvent(String format, long window, Object... args) {
		printEvent("Window", format, window, args);
	}

	private static void printEvent(String type, String format, long object, Object... args) {
		Object[] formatArgs = new Object[3 + args.length];

		formatArgs[0] = glfwGetTime();
		formatArgs[1] = type;
		formatArgs[2] = object;
		System.arraycopy(args, 0, formatArgs, 3, args.length);

		System.out.format("%.3f: %s [0x%X] " + format + "%n", formatArgs);
	}

}