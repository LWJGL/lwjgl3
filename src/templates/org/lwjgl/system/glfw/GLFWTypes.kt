/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw

import org.lwjgl.generator.*

val GLFW_PACKAGE = "org.lwjgl.system.glfw"

val GLFWmonitor = PointerType("GLFWmonitor")
val GLFWmonitor_p = PointerType(GLFWmonitor)

val GLFWwindow = PointerType("GLFWwindow")

val GLFWvidmode = StructType(
	struct(GLFW_PACKAGE, "GLFWvidmode") {
		documentation = "Video mode."
		nativeImport("glfw3.h")
		int.member("width")
		int.member("height")
		int.member("redBits")
		int.member("greenBits")
		int.member("blueBits")
		int.member("refreshRate")
	}
)
val GLFWvidmode_p = StructType(GLFWvidmode)

val GLFWgammaramp = StructType(
	struct(GLFW_PACKAGE, "GLFWgammaramp") {
		documentation = "Gamma ramp."
		nativeImport("glfw3.h")
		unsigned_short_p.member("red")
		unsigned_short_p.member("green")
		unsigned_short_p.member("blue")
		unsigned_int.member("size")
	}
)
val GLFWgammaramp_p = StructType(GLFWgammaramp)

val GLFWcursor = PointerType("GLFWcursor")

val GLFWimage = StructType(
	struct(GLFW_PACKAGE, "GLFWimage") {
		documentation = "Image data."
		nativeImport("glfw3.h")
		int.member("width")
		int.member("height")
		unsigned_char_p.member("pixels")
	}
)
val GLFWimage_p = StructType(GLFWimage)

// callback functions

val GLFWerrorfun = PointerType(name = "GLFWerrorfun", includesPointer = true)
val GLFWmonitorfun = PointerType(name = "GLFWmonitorfun", includesPointer = true)

val GLFWwindowposfun = PointerType(name = "GLFWwindowposfun", includesPointer = true)
val GLFWwindowsizefun = PointerType(name = "GLFWwindowsizefun", includesPointer = true)
val GLFWwindowclosefun = PointerType(name = "GLFWwindowclosefun", includesPointer = true)
val GLFWwindowrefreshfun = PointerType(name = "GLFWwindowrefreshfun", includesPointer = true)
val GLFWwindowfocusfun = PointerType(name = "GLFWwindowfocusfun", includesPointer = true)
val GLFWwindowiconifyfun = PointerType(name = "GLFWwindowiconifyfun", includesPointer = true)

val GLFWframebuffersizefun = PointerType(name = "GLFWframebuffersizefun", includesPointer = true)

val GLFWkeyfun = PointerType(name = "GLFWkeyfun", includesPointer = true)
val GLFWcharfun = PointerType(name = "GLFWcharfun", includesPointer = true)
val GLFWcharmodsfun = PointerType(name = "GLFWcharmodsfun", includesPointer = true)

val GLFWmousebuttonfun = PointerType(name = "GLFWmousebuttonfun", includesPointer = true)

val GLFWcursorposfun = PointerType(name = "GLFWcursorposfun", includesPointer = true)
val GLFWcursorenterfun = PointerType(name = "GLFWcursorenterfun", includesPointer = true)

val GLFWscrollfun = PointerType(name = "GLFWscrollfun", includesPointer = true)

val GLFWdropfun = PointerType(name = "GLFWdropfun", includesPointer = true)

// OpenGL

val GLFWglproc = PointerType("GLFWglproc")