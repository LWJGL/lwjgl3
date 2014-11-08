/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*
import org.lwjgl.system.windows.*

val GLFWWin32 = "GLFWWin32".nativeClass(packageName = WINDOWS_PACKAGE, prefix = "GLFW") {
	nativeDefine("GLFW_EXPOSE_NATIVE_WIN32")
	nativeDefine("GLFW_EXPOSE_NATIVE_WGL")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	documentation = "Native bindings to the GLFW library's Win32 native access functions."

	(const _ charUTF8_p).func(
		"GetWin32Adapter",
	    """
	    Returns the adapter device name of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
	    returnDoc = "The UTF-8 encoded adapter device name (for example `\\\\.\\DISPLAY1`) of the specified monitor, or $NULL if an error occurred.",
	    since = "GLFW 3.1"
	)

	(const _ charUTF8_p).func(
		"GetWin32Monitor",
	    """
	    Returns the display device name of the specified monitor.

	    Note: This function may be called from any thread. Access is not synchronized.
	    """,

	    GLFWmonitor.IN("monitor", "the GLFW monitor"),
		returnDoc = "The UTF-8 encoded display device name (for example `\\\\.\\DISPLAY1\\Monitor0`) of the specified monitor, or $NULL if an error occurred.",
		since = "GLFW 3.1"
	)

	HWND.func(
		"GetWin32Window",
		"""
		Returns the ${code("HWND")} of the specified window.

		Note: This function may be called from any thread. Access is not synchronized.
		""",

		GLFWwindow.IN("window", "the GLFW window"),
		returnDoc = "The ${code("HWND")} of the specified window, or $NULL if an error occurred.",
		since = "GLFW 3.0"
	)

	HGLRC.func(
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