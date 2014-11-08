/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.glfw.*
import org.lwjgl.system.linux.*
import org.lwjgl.system.windows.WCHAR_p

val GLFWLinux = "GLFWLinux".nativeClass(packageName = LINUX_PACKAGE, prefix = "GLFW") {
	nativeDefine("GLFW_EXPOSE_NATIVE_X11")
	nativeDefine("GLFW_EXPOSE_NATIVE_GLX")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	documentation = "Native bindings to the GLFW library's Linux native access functions."

	Display_p.func(
		"GetX11Display",
		"""
		Returns the ${code("Display")} used by GLFW.

		Note: This function may be called from any thread. Access is not synchronized.
		""",
	    returnDoc = "The ${code("Display")} used by GLFW, or $NULL if an error occurred.",
	    since = "GLFW 3.0"
	)

	RRCrtc.func(
		"GetX11Adapter",
	    """
	    Returns the ${code("RRCrtc")} of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
	    returnDoc = "The ${code("RRCrtc")} of the specified monitor, or $None if an error occurred.",
	    since = "GLFW 3.1"
	)

	RROutput.func(
		"GetX11Monitor",
		"""
		Returns the ${code("RROutput")} of the specified monitor.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWmonitor.IN("monitor", "the GLFW monitor"),
		returnDoc = "The ${code("RROutput")} of the specified monitor, or $None if an error occurred.",
		since = "GLFW 3.1"
	)

	Window.func(
		"GetX11Window",
		"""
		Returns the ${code("Window")} of the specified window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "a GLFW window"),
		returnDoc = " The ${code("Window")} of the specified window, or $None if an error occurred.",
		since = "GLFW 3.0"
	)

	GLXContext.func(
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