/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.glfw.*
import org.lwjgl.system.macosx.*

fun GLFWMacOSX() = "GLFWMacOSX".nativeClass(packageName = MACOSX_PACKAGE, prefix = "GLFW") {
	nativeDefine("GLFW_EXPOSE_NATIVE_COCOA")
	nativeDefine("GLFW_EXPOSE_NATIVE_NSGL")

	nativeImport(
		"glfw3.h",
		"glfw3native.h"
	)

	documentation = "Native bindings to the GLFW library's MacOS X native access functions."

	id.func(
		"GetCocoaWindow",
		"Returns the ${code("NSWindow")} of the given GLFW window.",

		GLFWwindow.IN("window", "the GLFW window")
	)

	id.func(
		"GetNSGLContext",
		"Returns the ${code("NSOpenGLContext")} of the given GLFW window.",

		GLFWwindow.IN("window", "the GLFW window")
	)

}