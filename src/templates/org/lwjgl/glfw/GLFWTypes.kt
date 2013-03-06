/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw

import org.lwjgl.generator.*

val GLFW_PACKAGE = "org.lwjgl.glfw"

val VOID = NativeType("VOID", TypeMapping.VOID)

val int = PrimitiveType("int", PrimitiveMapping.INT)
val short = PrimitiveType("short", PrimitiveMapping.SHORT)

val int_p = PointerType("int", PointerMapping.DATA_INT)

val charASCII_p = CharSequenceType(name = "char", charMapping = CharMapping.ASCII)


val GLFWvidmode = StructType(
	name = "GLFWvidmode",
	definition = struct(GLFW_PACKAGE, "GLFWvidmode") {
		nativeImport ("glfw3.h")
		int.member("width")
		int.member("height")
		int.member("redBits")
		int.member("blueBits")
		int.member("greenBits")
	}
)
val GLFWvidmode_p = PointerType(GLFWvidmode)
val GLFWmonitor = PointerType(name = "GLFWmonitor")
val GLFWmonitor_p = PointerType(GLFWmonitor)
val GLFWwindow = PointerType(name = "GLFWwindow")