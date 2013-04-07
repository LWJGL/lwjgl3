/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw

import org.lwjgl.generator.*

val GLFW_PACKAGE = "org.lwjgl.system.glfw"

// void

val void = NativeType("void", TypeMapping.VOID)
val void_p = PointerType("void", PointerMapping.DATA)
val void_pp = PointerType(void_p)

val voidptr = PointerType("void") // Naked pointer

// numeric

val unsigned_char = PrimitiveType("unsigned char", PrimitiveMapping.BYTE)
val unsigned_short = PrimitiveType("unsigned short", PrimitiveMapping.SHORT)
val int = PrimitiveType("int", PrimitiveMapping.INT)
val float = PrimitiveType("float", PrimitiveMapping.FLOAT)
val double = PrimitiveType("double", PrimitiveMapping.DOUBLE)

val unsigned_char_p = PointerType(unsigned_char)
val int_p = PointerType(int)
val float_p = PointerType(float)
val double_p = PointerType(double)

// strings

val charASCII_p = CharSequenceType(name = "char", charMapping = CharMapping.ASCII)
val charASCII_pp = PointerType(charASCII_p)

val charUTF8_p = CharSequenceType(name = "char", charMapping = CharMapping.UTF8)
val charUTF8_pp = PointerType(charUTF8_p)

// structs

val GLFWmonitor = PointerType("GLFWmonitor")
val GLFWmonitor_p = PointerType(GLFWmonitor)

val GLFWwindow = PointerType("GLFWwindow")

val GLFWvidmode = StructType(
	struct(GLFW_PACKAGE, "GLFWvidmode") {
		javaDoc("Video mode.")
		nativeImport("glfw3.h")
		int.member("width")
		int.member("height")
		int.member("redBits")
		int.member("blueBits")
		int.member("greenBits")
	}
)

val GLFW_GAMMA_RAMP_SIZE = 256
val GLFWgammaramp = StructType(
	struct(GLFW_PACKAGE, "GLFWgammaramp") {
		javaDoc("Gamma ramp.")
		nativeImport("glfw3.h")
		unsigned_short.member("red", size = GLFW_GAMMA_RAMP_SIZE)
		unsigned_short.member("green", size = GLFW_GAMMA_RAMP_SIZE)
		unsigned_short.member("blue", size = GLFW_GAMMA_RAMP_SIZE)
	}
)
val GLFWgammaramp_p = StructType(GLFWgammaramp)

// callback functions

val GLFWerrorfun = PointerType(name = "GLFWerrorfun", includesPointer = true)
val GLFWmonitorfun = PointerType(name = "GLFWmonitorfun", includesPointer = true)

val GLFWwindowposfun = PointerType(name = "GLFWwindowposfun", includesPointer = true)
val GLFWwindowsizefun = PointerType(name = "GLFWwindowsizefun", includesPointer = true)
val GLFWwindowclosefun = PointerType(name = "GLFWwindowclosefun", includesPointer = true)
val GLFWwindowrefreshfun = PointerType(name = "GLFWwindowrefreshfun", includesPointer = true)
val GLFWwindowfocusfun = PointerType(name = "GLFWwindowfocusfun", includesPointer = true)
val GLFWwindowiconifyfun = PointerType(name = "GLFWwindowiconifyfun", includesPointer = true)

val GLFWkeyfun = PointerType(name = "GLFWkeyfun", includesPointer = true)
val GLFWcharfun = PointerType(name = "GLFWcharfun", includesPointer = true)

val GLFWmousebuttonfun = PointerType(name = "GLFWmousebuttonfun", includesPointer = true)

val GLFWcursorposfun = PointerType(name = "GLFWcursorposfun", includesPointer = true)
val GLFWcursorenterfun = PointerType(name = "GLFWcursorenterfun", includesPointer = true)

val GLFWscrollfun = PointerType(name = "GLFWscrollfun", includesPointer = true)

// OpenGL

//val GLFWglproc = PointerType("GLFWglproc")