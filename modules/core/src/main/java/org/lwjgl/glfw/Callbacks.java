/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw;

import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.Callback;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Utility class for GLFW callbacks.
 *
 * <p>This class has been designed to work well with {@code import static}.</p>
 */
public final class Callbacks {

	private Callbacks() {}

	/**
	 * Resets all callbacks for the specified GLFW window to {@code NULL} and {@link Callback#free frees} all previously set callbacks.
	 *
	 * @param window the GLFW window
	 */
	public static void glfwFreeCallbacks(long window) {
		if ( Checks.CHECKS )
			checkPointer(window);

		long[] callbacks = {
			invokePPP(GLFW.Functions.SetWindowPosCallback, window, NULL),
			invokePPP(GLFW.Functions.SetWindowSizeCallback, window, NULL),
			invokePPP(GLFW.Functions.SetWindowCloseCallback, window, NULL),
			invokePPP(GLFW.Functions.SetWindowRefreshCallback, window, NULL),
			invokePPP(GLFW.Functions.SetWindowFocusCallback, window, NULL),
			invokePPP(GLFW.Functions.SetWindowIconifyCallback, window, NULL),
			invokePPP(GLFW.Functions.SetFramebufferSizeCallback, window, NULL),
			invokePPP(GLFW.Functions.SetKeyCallback, window, NULL),
			invokePPP(GLFW.Functions.SetCharCallback, window, NULL),
			invokePPP(GLFW.Functions.SetCharModsCallback, window, NULL),
			invokePPP(GLFW.Functions.SetMouseButtonCallback, window, NULL),
			invokePPP(GLFW.Functions.SetCursorPosCallback, window, NULL),
			invokePPP(GLFW.Functions.SetCursorEnterCallback, window, NULL),
			invokePPP(GLFW.Functions.SetScrollCallback, window, NULL),
			invokePPP(GLFW.Functions.SetDropCallback, window, NULL)
		};

		for ( long callback : callbacks ) {
			if ( callback != NULL )
				Callback.free(callback);
		}
	}

	/**
	 * Invokes the specified callbacks using the current window and framebuffer sizes of the specified GLFW window.
	 *
	 * @param window             the GLFW window
	 * @param windowsizefun      the window size callback, may be null
	 * @param framebuffersizefun the framebuffer size callback, may be null
	 */
	public static void glfwInvoke(long window, GLFWWindowSizeCallback windowsizefun, GLFWFramebufferSizeCallback framebuffersizefun) {
		if ( Checks.CHECKS )
			checkPointer(window);

		MemoryStack stack = stackPush();

		try {
			IntBuffer x = stack.mallocInt(1);
			IntBuffer y = stack.mallocInt(1);

			if ( framebuffersizefun != null ) {
				glfwGetFramebufferSize(window, x, y);
				framebuffersizefun.invoke(window, x.get(0), y.get(0));
			}

			if ( windowsizefun != null ) {
				glfwGetWindowSize(window, x, y);
				windowsizefun.invoke(window, x.get(0), y.get(0));
			}
		} finally {
			stack.pop();
		}
	}

}