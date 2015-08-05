/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.egl.*

val GLFWEGL = dependsOn(Binding.EGL) {
	"GLFWEGL".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "egl", prefix = "GLFW") {
		nativeDirective(
"""#ifdef LWJGL_WINDOWS
	#define GLFW_EXPOSE_NATIVE_WIN32
#endif
#ifdef LWJGL_LINUX
	#define GLFW_EXPOSE_NATIVE_X11
#endif
#define GLFW_EXPOSE_NATIVE_EGL"""
		)

		nativeImport(
			"glfw3.h",
			"glfw3native.h"
		)

		javaImport(
			"org.lwjgl.egl.EGL10"
		)

		documentation = "Native bindings to the GLFW library's EGL native access functions."

		EGLDisplay(
			"GetEGLDisplay",
			"""
			Returns the {@code EGLDisplay} used by GLFW.

			This function may be called from any thread. Access is not synchronized.
			""",

			returnDoc = "the {@code EGLDisplay} used by GLFW, or EGL10##EGL_NO_DISPLAY if an error occured"
		)

		EGLContext(
			"GetEGLContext",
			"""
			Returns the {@code EGLContext} of the specified window.

			This function may be called from any thread. Access is not synchronized.
			""",

			GLFWwindow.IN("window", "a GLFW window"),

			returnDoc = "the {@code EGLContext} of the specified window, or EGL10##EGL_NO_CONTEXT if an error occurred"
		)

		EGLSurface(
			"GetEGLSurface",
			"""
			Returns the {@code EGLSurface} of the specified window.

			This function may be called from any thread. Access is not synchronized.
			""",

			GLFWwindow.IN("window", ""),

			returnDoc = "the {@code EGLSurface} of the specified window, or EGL10##EGL_NO_SURFACE if an error occurred"
		)
	}
}
