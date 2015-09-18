/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.glfw.*

val GLFWNativeGLX = "GLFWNativeGLX".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "linux", prefix = "GLFW", binding = GLFWBinding) {
	documentation = "Native bindings to the GLFW library's GLX native access functions."

	GLXContext(
		"GetGLXContext",
		"""
		Returns the ${code("GLXContext")} of the specified window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "a GLFW window"),
		returnDoc = " The ${code("GLXContext")} of the specified window, or $NULL if an error occurred.",
		since = "GLFW 3.0"
	)
}