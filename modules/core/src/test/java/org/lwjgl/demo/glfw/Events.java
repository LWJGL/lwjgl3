/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Map;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** GLFW events demo. */
public final class Events {

	private static final GLFWMonitorCallback monitorCB = new GLFWMonitorCallback() {
		@Override
		public void invoke(long monitor, int event) {
			printEvent("Monitor", "[0x%X] %s", monitor, event == GLFW_CONNECTED ? "connected" : "disconnected");
		}
	};

	private static final GLFWWindowPosCallback     windowPosCB     = new GLFWWindowPosCallback() {
		@Override
		public void invoke(long window, int xpos, int ypos) {
			printEvent("moved to %d, %d", window, xpos, ypos);
		}
	};
	private static final GLFWWindowSizeCallback    windowSizeCB    = new GLFWWindowSizeCallback() {
		@Override
		public void invoke(long window, int width, int height) {
			printEvent("resized to %d x %d", window, width, height);
		}
	};
	private static final GLFWWindowCloseCallback   windowCloseCB   = new GLFWWindowCloseCallback() {
		@Override
		public void invoke(long window) {
			printEvent("closed", window);
		}
	};
	private static final GLFWWindowRefreshCallback windowRefreshCB = new GLFWWindowRefreshCallback() {
		@Override
		public void invoke(long window) {
			printEvent("refreshed", window);
		}
	};
	private static final GLFWWindowFocusCallback   windowFocusCB   = new GLFWWindowFocusCallback() {
		@Override
		public void invoke(long window, int focused) {
			printEvent(focused == 0 ? "lost focus" : "gained focus", window);
		}
	};
	private static final GLFWWindowIconifyCallback windowIconifyCB = new GLFWWindowIconifyCallback() {
		@Override
		public void invoke(long window, int iconified) {
			printEvent(iconified == 0 ? "restored" : "iconified", window);
		}
	};

	private static final GLFWFramebufferSizeCallback framebufferSizeCB = new GLFWFramebufferSizeCallback() {
		@Override
		public void invoke(long window, int width, int height) {
			printEvent("framebuffer resized to %d x %d", window, width, height);
		}
	};

	private static final GLFWKeyCallback keyCB = new GLFWKeyCallback() {
		private final Map<Integer, String> KEY_CODES = apiClassTokens(new TokenFilter() {
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
	};

	private static final GLFWCharCallback charCB = new GLFWCharCallback() {
		@Override
		public void invoke(long window, int codepoint) {
			printEvent("char %s", window, Character.toString((char)codepoint));
		}
	};

	private static final GLFWCharModsCallback charModsCB = new GLFWCharModsCallback() {
		@Override
		public void invoke(long window, int codepoint, int mods) {
			printEvent("char mods %s%s", window, getModState(mods), Character.toString((char)codepoint));
		}
	};

	private static final GLFWMouseButtonCallback mouseButtonCB = new GLFWMouseButtonCallback() {
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
	};

	private static final GLFWCursorPosCallback cursorPosCB = new GLFWCursorPosCallback() {
		@Override
		public void invoke(long window, double xpos, double ypos) {
			printEvent("cursor moved to %f, %f", window, xpos, ypos);
		}
	};

	private static final GLFWCursorEnterCallback cursorEnterCB = new GLFWCursorEnterCallback() {
		@Override
		public void invoke(long window, int entered) {
			printEvent("cursor %s", window, entered == 0 ? "left" : "entered");
		}
	};

	private static final GLFWScrollCallback scrollCB = new GLFWScrollCallback() {
		@Override
		public void invoke(long window, double xoffset, double yoffset) {
			printEvent("scroll by %f, %f", window, xoffset, yoffset);
		}
	};

	private static final GLFWDropCallback dropCB = new GLFWDropCallback() {
		@Override
		public void invoke(long window, int count, long names) {
			printEvent("drop %d file%s", window, count, count == 1 ? "" : "s");

			GLFWDropCallback.apply(count, names, new ConsumerString() {
				@Override
				public void accept(int index, String name) {
					System.out.format("\t%d: %s%n", index + 1, name);
				}
			});
		}
	};

	private Events() {
	}

	public static void main(String[] args) {
		GLFWErrorCallback errorCB = GLFWErrorCallback.createPrint(System.err);
		glfwSetErrorCallback(errorCB);

		System.err.println("---- [ Error callback test ] ----");
		glfwDefaultWindowHints();
		System.err.println("---- [ Error callback done ] ----");

		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		System.out.println("GLFW initialized");

		try {
			demo();
		} finally {
			glfwTerminate();
			errorCB.free();
		}
	}

	private static void demo() {
		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);

		long window = glfwCreateWindow(640, 480, "GLFW Event Demo", NULL, NULL);
		if ( window == NULL )
			throw new IllegalStateException("Failed to create GLFW window.");

		System.out.println("Window opened.");

		IntBuffer w = memAllocInt(1);
		IntBuffer h = memAllocInt(1);
		IntBuffer comp = memAllocInt(1);

		long cursor;

		// Cursor
		{
			ByteBuffer png;
			try {
				png = ioResourceToByteBuffer("demo/cursor.png", 1024);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			ByteBuffer pixels = stbi_load_from_memory(png, w, h, comp, 0);

			GLFWImage img = GLFWImage.malloc().set(w.get(0), h.get(0), pixels);

			cursor = glfwCreateCursor(img, 0, 8);
			glfwSetCursor(window, cursor);

			img.free();
			stbi_image_free(pixels);
		}

		// Icons
		{
			ByteBuffer icon16;
			ByteBuffer icon32;
			try {
				icon16 = ioResourceToByteBuffer("lwjgl16.png", 2048);
				icon32 = ioResourceToByteBuffer("lwjgl32.png", 4096);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			GLFWImage.Buffer icons = GLFWImage.malloc(2);

			ByteBuffer pixels16 = stbi_load_from_memory(icon16, w, h, comp, 4);
			icons
				.position(0)
				.width(w.get(0))
				.height(h.get(0))
				.pixels(pixels16);

			ByteBuffer pixels32 = stbi_load_from_memory(icon32, w, h, comp, 4);
			icons
				.position(1)
				.width(w.get(0))
				.height(h.get(0))
				.pixels(pixels32);

			icons.position(0);
			glfwSetWindowIcon(window, icons);

			stbi_image_free(pixels32);
			stbi_image_free(pixels16);
			icons.free();
		}

		memFree(comp);
		memFree(h);
		memFree(w);

		glfwSetMonitorCallback(monitorCB);

		glfwSetWindowPosCallback(window, windowPosCB);
		glfwSetWindowSizeCallback(window, windowSizeCB);
		glfwSetWindowCloseCallback(window, windowCloseCB);
		glfwSetWindowRefreshCallback(window, windowRefreshCB);
		glfwSetWindowFocusCallback(window, windowFocusCB);
		glfwSetWindowIconifyCallback(window, windowIconifyCB);

		glfwSetFramebufferSizeCallback(window, framebufferSizeCB);

		glfwSetKeyCallback(window, keyCB);
		glfwSetCharCallback(window, charCB);
		glfwSetCharModsCallback(window, charModsCB);
		glfwSetMouseButtonCallback(window, mouseButtonCB);
		glfwSetCursorPosCallback(window, cursorPosCB);
		glfwSetCursorEnterCallback(window, cursorEnterCB);
		glfwSetScrollCallback(window, scrollCB);
		glfwSetDropCallback(window, dropCB);

		glfwMakeContextCurrent(window);
		GL.createCapabilities();

		glfwShowWindow(window);
		glfwSwapInterval(1);

		glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
		while ( glfwWindowShouldClose(window) == 0 ) {
			glfwWaitEvents();

			glClear(GL_COLOR_BUFFER_BIT);
			glfwSwapBuffers(window);
		}

		Callbacks.glfwFreeCallbacks(window);
		monitorCB.free();

		glfwDestroyCursor(cursor);
		glfwDestroyWindow(window);
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