/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi

import org.lwjgl.generator.*

val FFI_PACKAGE = "org.lwjgl.system.libffi"

fun config() {
	packageInfo(
		FFI_PACKAGE,
		"""
		Contains bindings to the <a href="https://sourceware.org/libffi/">libffi</a>, a portable, high level programming interface to various calling
		conventions. This allows a programmer to call any function specified by a call interface description at run-time.

		libffi is used internally by LWJGL to implement native function callbacks that invoke Java methods. This is done via the
		{@link org.lwjgl.system.libffi.Closure Closure} class. LWJGL users with native programming experience may also use libffi to invoke native functions
		for which LWJGL provides no bindings.
		"""
	)
}

val ffi_abi = "ffi_abi".enumType
val ffi_status = "ffi_status".enumType

val FFI_FN_TYPE = "FFI_FN_TYPE".opaque_p

val ffi_type_p = struct_p(FFI_PACKAGE, "FFIType", nativeName = "ffi_type") {
	documentation = "Contains information about a libffi type."

	size_t.member("size", "set by libffi; you should initialize it to zero.")
	unsigned_short.member("alignment", "set by libffi; you should initialize it to zero.")
	unsigned_short.member("type", "for a structure, this should be set to LibFFI#FFI_TYPE_STRUCT.")
	this.nativeType.p.p.member("elements", "a null-terminated array of pointers to {@code ffi_type} objects. There is one element per field of the struct.") // self-reference
}
val ffi_type_pp = ffi_type_p.p

val ffi_cif_p = struct_p(FFI_PACKAGE, "FFICIF", nativeName = "ffi_cif", mutable = false) {
	documentation = "Contains information about a libffi call interface."

	ffi_abi.member("abi", "")
	unsigned.member("nargs", "")
	ffi_type_pp.member("arg_types", "")
	ffi_type_p.member("rtype", "")
	unsigned.member("bytes", "")
	unsigned.member("flags", "")
}

// Closures

val ffi_closure_p = struct_p(FFI_PACKAGE, "FFIClosure", nativeName = "ffi_closure", mutable = false, nativeLayout = true /* complex "tramboline" padding */) {
	documentation = "The libffi closure structure."
	nativeImport("ffi.h")

	ffi_cif_p.member("cif", "")
	voidptr.member("fun", "")
	voidptr.member("user_data", "")
}
val FFI_CLOSURE_FUN = "FFI_CLOSURE_FUN".opaque_p