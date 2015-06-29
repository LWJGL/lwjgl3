/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.system.windows.*

val GLFWWin32 = "GLFWWin32".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "windows", prefix = "GLFW") {
	nativeDirective("#define GLFW_EXPOSE_NATIVE_WIN32")
	nativeDirective("#define GLFW_EXPOSE_NATIVE_WGL")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	documentation = "Native bindings to the GLFW library's Win32 native access functions."

	(const _ charUTF8_p)(
		"GetWin32Adapter",
	    """
	    Returns the adapter device name of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
	    returnDoc = "The UTF-8 encoded adapter device name (for example `\\\\.\\DISPLAY1`) of the specified monitor, or $NULL if an error occurred.",
	    since = "GLFW 3.1"
	)

	(const _ charUTF8_p)(
		"GetWin32Monitor",
	    """
	    Returns the display device name of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
		returnDoc = "The UTF-8 encoded display device name (for example `\\\\.\\DISPLAY1\\Monitor0`) of the specified monitor, or $NULL if an error occurred.",
		since = "GLFW 3.1"
	)

	HWND(
		"GetWin32Window",
		"""
		Returns the ${code("HWND")} of the specified window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the GLFW window"),
		returnDoc = "The ${code("HWND")} of the specified window, or $NULL if an error occurred.",
		since = "GLFW 3.0"
	)

	HGLRC(
		"GetWGLContext",
		"""
		Returns the ${code("HGLRC")} of the specified window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the GLFW window"),
	    returnDoc = "The ${code("HGLRC")} of the specified window, or $NULL if an error occurred.",
	    since = "GLFW 3.0"
	)
}