/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*
import org.lwjgl.system.windows.*

fun GLFWWin32() = "GLFWWin32".nativeClass(packageName = WINDOWS_PACKAGE, prefix = "GLFW") {
	nativeDefine("GLFW_EXPOSE_NATIVE_WIN32")
	nativeDefine("GLFW_EXPOSE_NATIVE_WGL")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	javaDoc("Native bindings to the GLFW library's Win32 native access functions.")

	HWND.func(
		"GetWin32Window",
		"Returns the ${code("HWND")} of the given GLFW window.",

		GLFWwindow.IN("window", "the GLFW window")
	)

	HGLRC.func(
		"GetWGLContext",
	    "Returns the ${code("HGLRC")} of the given GLFW window.",

	    GLFWwindow.IN("window", "the GLFW window")
	)

}