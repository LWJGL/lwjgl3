/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.glfw.*
import org.lwjgl.system.linux.*

val GLFWLinux = "GLFWLinux".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "linux", prefix = "GLFW") {
	nativeDirective("#define GLFW_EXPOSE_NATIVE_X11")
	nativeDirective("#define GLFW_EXPOSE_NATIVE_GLX")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	documentation = "Native bindings to the GLFW library's Linux native access functions."

	Display_p(
		"GetX11Display",
		"""
		Returns the ${code("Display")} used by GLFW.

		Note: This function may be called from any thread. Access is not synchronized.
		""",
	    returnDoc = "The ${code("Display")} used by GLFW, or $NULL if an error occurred.",
	    since = "GLFW 3.0"
	)

	RRCrtc(
		"GetX11Adapter",
	    """
	    Returns the ${code("RRCrtc")} of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
	    returnDoc = "The ${code("RRCrtc")} of the specified monitor, or X##None if an error occurred.",
	    since = "GLFW 3.1"
	)

	RROutput(
		"GetX11Monitor",
		"""
		Returns the ${code("RROutput")} of the specified monitor.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWmonitor.IN("monitor", "the GLFW monitor"),
		returnDoc = "The ${code("RROutput")} of the specified monitor, or X##None if an error occurred.",
		since = "GLFW 3.1"
	)

	Window(
		"GetX11Window",
		"""
		Returns the ${code("Window")} of the specified window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "a GLFW window"),
		returnDoc = " The ${code("Window")} of the specified window, or X##None if an error occurred.",
		since = "GLFW 3.0"
	)

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