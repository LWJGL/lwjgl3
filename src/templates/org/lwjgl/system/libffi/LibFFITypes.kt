/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi

import org.lwjgl.generator.*

val FFI_PACKAGE = "org.lwjgl.system.libffi"

val size_t = PrimitiveType("size_t", PrimitiveMapping.PTR)
val unsigned = IntegerType("unsigned", PrimitiveMapping.INT, unsigned = true)

val ffi_abi = typedef(int, "ffi_abi")
val ffi_status = typedef(int, "ffi_abi")

val FFI_FN_TYPE = PointerType("FFI_FN_TYPE", includesPointer = true)

val ffi_type = StructType(
	struct(FFI_PACKAGE, "ffi_type") {
		documentation = "Contains information about a libffi type."
		nativeImport("ffi.h")
		size_t.member("size")
		unsigned_short.member("alignment")
		unsigned_short.member("type")
		void_pp.member("elements") // TODO: self-reference here...
	}
)
val ffi_type_p = StructType(ffi_type)
val ffi_type_pp = PointerType(ffi_type_p)

val ffi_cif = StructType(
	struct(FFI_PACKAGE, "ffi_cif") {
		documentation = "Contains information about a libffi call interface."
		nativeImport("ffi.h")

		ffi_abi.member("abi")
		unsigned.member("nargs")
		ffi_type_pp.member("arg_types")
		ffi_type_p.member("rtype")
		unsigned.member("bytes")
		unsigned.member("flags")
	}
)
val ffi_cif_p = StructType(ffi_cif)

/*
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

val GLFWmousebuttonfun = PointerType(name = "GLFWmousebuttonfun", includesPointer = true)

val GLFWcursorposfun = PointerType(name = "GLFWcursorposfun", includesPointer = true)
val GLFWcursorenterfun = PointerType(name = "GLFWcursorenterfun", includesPointer = true)

val GLFWscrollfun = PointerType(name = "GLFWscrollfun", includesPointer = true)

// OpenGL

//val GLFWglproc = PointerType("GLFWglproc")
*/