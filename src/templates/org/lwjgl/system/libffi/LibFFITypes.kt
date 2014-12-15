/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi

import org.lwjgl.generator.*

val FFI_PACKAGE = "org.lwjgl.system.libffi"

val unsigned = IntegerType("unsigned", PrimitiveMapping.INT, unsigned = true)

val ffi_abi = typedef(int, "ffi_abi")
val ffi_status = typedef(int, "ffi_abi")

val FFI_FN_TYPE = PointerType("FFI_FN_TYPE", includesPointer = true)

val ffi_type_p = PointerType("ffi_type")
val ffi_type_pp = PointerType(ffi_type_p)
val ffi_type = struct(FFI_PACKAGE, "FFIType", structName = "ffi_type") {
	documentation = "Contains information about a libffi type."
	nativeImport("ffi.h")
	size_t.member("size")
	unsigned_short.member("alignment")
	unsigned_short.member("type")
	ffi_type_pp.member("elements") // TODO: self-reference here...
}.nativeType

val ffi_cif = struct(FFI_PACKAGE, "FFICIF", structName = "ffi_cif") {
	documentation = "Contains information about a libffi call interface."
	nativeImport("ffi.h")

	ffi_abi.member("abi")
	unsigned.member("nargs")
	ffi_type_pp.member("arg_types")
	ffi_type_p.member("rtype")
	unsigned.member("bytes")
	unsigned.member("flags")
}.nativeType
val ffi_cif_p = StructType(ffi_cif)

// Closures

val ffi_closure = struct(FFI_PACKAGE, "FFIClosure", structName = "ffi_closure", malloc = false) {
	documentation = "The libffi closure structure."
	nativeImport("ffi.h")

	ffi_cif_p.member("cif")
	voidptr.member("fun")
	voidptr.member("user_data")
}.nativeType
val ffi_closure_p = StructType(ffi_closure)
val FFI_CLOSURE_FUN = PointerType(name = "FFI_CLOSURE_FUN", includesPointer = true)