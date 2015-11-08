/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw;

import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.libffi.Closure;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Utility class for GLFW callbacks.
 * <p/>
 * This class has been designed to work well with {@code import static}.
 */
public final class Callbacks {

	private Callbacks() {}

	/**
	 * Resets all callbacks for the specified GLFW window to {@code NULL} and {@link Closure#release releases} all previously set callbacks.
	 *
	 * @param window the GLFW window
	 */
	public static void glfwReleaseCallbacks(long window) {
		if ( Checks.CHECKS )
			checkPointer(window);

		GLFW glfw = GLFW.getInstance();
		long[] callbacks = {
			invokePPP(glfw.SetWindowPosCallback, window, NULL),
			invokePPP(glfw.SetWindowSizeCallback, window, NULL),
			invokePPP(glfw.SetWindowCloseCallback, window, NULL),
			invokePPP(glfw.SetWindowRefreshCallback, window, NULL),
			invokePPP(glfw.SetWindowFocusCallback, window, NULL),
			invokePPP(glfw.SetWindowIconifyCallback, window, NULL),
			invokePPP(glfw.SetFramebufferSizeCallback, window, NULL),
			invokePPP(glfw.SetKeyCallback, window, NULL),
			invokePPP(glfw.SetCharCallback, window, NULL),
			invokePPP(glfw.SetCharModsCallback, window, NULL),
			invokePPP(glfw.SetMouseButtonCallback, window, NULL),
			invokePPP(glfw.SetCursorPosCallback, window, NULL),
			invokePPP(glfw.SetCursorEnterCallback, window, NULL),
			invokePPP(glfw.SetScrollCallback, window, NULL),
			invokePPP(glfw.SetDropCallback, window, NULL)
		};

		for ( long callback : callbacks ) {
			if ( callback != NULL )
				Closure.release(callback);
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

		APIBuffer buffer = apiBuffer();

		if ( framebuffersizefun != null ) {
			nglfwGetFramebufferSize(window, buffer.address() + 0, buffer.address() + 4);
			framebuffersizefun.invoke(window, buffer.intValue(0), buffer.intValue(4));
		}

		if ( windowsizefun != null ) {
			nglfwGetWindowSize(window, buffer.address() + 0, buffer.address() + 4);
			windowsizefun.invoke(window, buffer.intValue(0), buffer.intValue(4));
		}
	}

}