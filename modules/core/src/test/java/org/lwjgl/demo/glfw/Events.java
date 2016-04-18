/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL;

import java.io.IOException;
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

	private static final GLFWMonitorCallback monitorCB = GLFWMonitorCallback.create((monitor, event) -> printEvent(
		"Monitor", "%s", monitor, event == GLFW_CONNECTED ? "connected" : "disconnected"
	));

	private static final GLFWJoystickCallback joystickCB = GLFWJoystickCallback.create((joy, event) -> printEvent(
		"Joystick", "%s %s", joy, glfwGetJoystickName(joy), event == GLFW_CONNECTED ? "connected" : "disconnected"
	));

	private static final GLFWWindowPosCallback     windowPosCB     = GLFWWindowPosCallback.create((window, xpos, ypos) -> printEvent(
		"moved to %d, %d", window, xpos, ypos
	));
	private static final GLFWWindowSizeCallback    windowSizeCB    = GLFWWindowSizeCallback.create((window, width, height) -> printEvent(
		"resized to %d x %d", window, width, height
	));
	private static final GLFWWindowCloseCallback   windowCloseCB   = GLFWWindowCloseCallback.create(window -> printEvent(
		"closed", window
	));
	private static final GLFWWindowRefreshCallback windowRefreshCB = GLFWWindowRefreshCallback.create(window -> printEvent(
		"refreshed", window
	));
	private static final GLFWWindowFocusCallback   windowFocusCB   = GLFWWindowFocusCallback.create((window, focused) -> printEvent(
		focused ? "gained focus" : "lost focus", window
	));
	private static final GLFWWindowIconifyCallback windowIconifyCB = GLFWWindowIconifyCallback.create((window, iconified) -> printEvent(
		iconified ? "iconified" : "restored", window
	));

	private static final GLFWFramebufferSizeCallback framebufferSizeCB = GLFWFramebufferSizeCallback.create((window, width, height) -> printEvent(
		"framebuffer resized to %d x %d", window, width, height
	));

	private static final Map<Integer, String> KEY_CODES = apiClassTokens((field, value) -> field.getName().startsWith("GLFW_KEY_"), null, GLFW.class);
	private static final GLFWKeyCallback      keyCB     = GLFWKeyCallback.create((window, key, scancode, action, mods) -> {
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
			glfwSetWindowShouldClose(window, true);
	});

	private static final GLFWCharCallback charCB = GLFWCharCallback.create((window, codepoint) -> printEvent(
		"char %s", window, Character.toString((char)codepoint)
	));

	private static final GLFWCharModsCallback charModsCB = GLFWCharModsCallback.create((window, codepoint, mods) -> printEvent(
		"char mods %s%s", window, getModState(mods), Character.toString((char)codepoint)
	));

	private static final GLFWMouseButtonCallback mouseButtonCB = GLFWMouseButtonCallback.create((window, button, action, mods) -> {
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
	});

	private static final GLFWCursorPosCallback cursorPosCB = GLFWCursorPosCallback.create((window, xpos, ypos) -> printEvent(
		"cursor moved to %f, %f", window, xpos, ypos
	));

	private static final GLFWCursorEnterCallback cursorEnterCB = GLFWCursorEnterCallback.create((window, entered) -> printEvent(
		"cursor %s", window, entered ? "entered" : "left"
	));

	private static final GLFWScrollCallback scrollCB = GLFWScrollCallback.create((window, xoffset, yoffset) -> printEvent(
		"scroll by %f, %f", window, xoffset, yoffset
	));

	private static final GLFWDropCallback dropCB = GLFWDropCallback.create((window, count, names) -> {
		printEvent("drop %d file%s", window, count, count == 1 ? "" : "s");

		GLFWDropCallback.apply(count, names, (int index, String name) -> System.out.format("\t%d: %s%n", index + 1, name));
	});

	private Events() {
	}

	public static void main(String[] args) {
		GLFWErrorCallback errorCB = GLFWErrorCallback.createPrint(System.err);
		glfwSetErrorCallback(errorCB);

		System.err.println("---- [ Error callback test ] ----");
		glfwDefaultWindowHints();
		System.err.println("---- [ Error callback done ] ----");

		if ( !glfwInit() )
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
		glfwSetJoystickCallback(joystickCB);

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
		while ( !glfwWindowShouldClose(window) ) {
			glfwWaitEvents();

			glClear(GL_COLOR_BUFFER_BIT);
			glfwSwapBuffers(window);
		}

		Callbacks.glfwFreeCallbacks(window);
		joystickCB.free();
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