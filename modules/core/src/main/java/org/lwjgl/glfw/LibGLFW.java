/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;
import org.lwjgl.Pointer;
import org.lwjgl.system.FunctionProvider;

/**
 * This class initializes the GLFW native library on first access. The library instance is intentionally {@code static final} to improve JIT constant
 * propagation. The expectation is that if this class is accessed, GLFW will be used extensivelly and never unloaded, so performance is prioritized over
 * flexibility.
 */
final class LibGLFW {

	static final GLFW __GLFW;

	static final GLFWNativeCocoa __GLFWNativeCocoa;
	static final GLFWNativeWin32 __GLFWNativeWin32;
	static final GLFWNativeX11   __GLFWNativeX11;

	static final GLFWNativeEGL  __GLFWNativeEGL;
	static final GLFWNativeGLX  __GLFWNativeGLX;
	static final GLFWNativeNSGL __GLFWNativeNSGL;
	static final GLFWNativeWGL  __GLFWNativeWGL;

	// TODO: Refactor when GLFW adds client library selection
	static {
		FunctionProvider functionProvider = LWJGLUtil.loadLibraryNative(System.getProperty("org.lwjgl.glfw.libname", Pointer.BITS64 ? "glfw" : "glfw32"));

		__GLFW = new GLFW(functionProvider);

		__GLFWNativeCocoa = LWJGLUtil.getPlatform() == Platform.MACOSX ? new GLFWNativeCocoa(functionProvider) : null;
		__GLFWNativeWin32 = LWJGLUtil.getPlatform() == Platform.WINDOWS ? new GLFWNativeWin32(functionProvider) : null;
		__GLFWNativeX11 = LWJGLUtil.getPlatform() == Platform.LINUX ? new GLFWNativeX11(functionProvider) : null;

		boolean EGL = Boolean.getBoolean("org.lwjgl.glfw.EGL");

		if ( EGL ) {
			__GLFWNativeEGL = new GLFWNativeEGL(functionProvider);

			__GLFWNativeGLX = null;
			__GLFWNativeNSGL = null;
			__GLFWNativeWGL = null;
		} else {
			__GLFWNativeEGL = null;

			__GLFWNativeGLX = LWJGLUtil.getPlatform() == Platform.LINUX ? new GLFWNativeGLX(functionProvider) : null;
			__GLFWNativeNSGL = LWJGLUtil.getPlatform() == Platform.MACOSX ? new GLFWNativeNSGL(functionProvider) : null;
			__GLFWNativeWGL = LWJGLUtil.getPlatform() == Platform.WINDOWS ? new GLFWNativeWGL(functionProvider) : null;
		}
	}

	private LibGLFW() {}

}