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

val FFI_FN_TYPE = "FFI_FN_TYPE".opaque_p

val ffi_type_p = "ffi_type".p
val ffi_type_pp = ffi_type_p.p
val ffi_type = struct(FFI_PACKAGE, "FFIType", structName = "ffi_type") {
	documentation = "Contains information about a libffi type."
	nativeImport("ffi.h")
	size_t.member("size")
	unsigned_short.member("alignment")
	unsigned_short.member("type")
	ffi_type_pp.member("elements") // TODO: self-reference here...
}.nativeType

val ffi_cif_p = struct_p(FFI_PACKAGE, "FFICIF", structName = "ffi_cif", mutable = false) {
	documentation = "Contains information about a libffi call interface."
	nativeImport("ffi.h")

	ffi_abi.member("abi")
	unsigned.member("nargs")
	ffi_type_pp.member("arg_types")
	ffi_type_p.member("rtype")
	unsigned.member("bytes")
	unsigned.member("flags")
}

// Closures

val ffi_closure_p = struct_p(FFI_PACKAGE, "FFIClosure", structName = "ffi_closure", mutable = false) {
	documentation = "The libffi closure structure."
	nativeImport("ffi.h")

	ffi_cif_p.member("cif")
	voidptr.member("fun")
	voidptr.member("user_data")
}
val FFI_CLOSURE_FUN = "FFI_CLOSURE_FUN".opaque_p