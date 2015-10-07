/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libffi.*

fun LibFFIConstants() = "LibFFIConstants".nativeClass(packageName = FFI_PACKAGE) {
	nativeImport (
		"ffi.h"
	)

	access = Access.INTERNAL
	documentation = "Defines methods that return platform-specific constant values that are used by {@link LibFFI}."

	Macro..short("FFI_TYPE_DOUBLE", "Returns the LibFFI#FFI_TYPE_DOUBLE value.")
	Macro..int("FFI_DEFAULT_ABI", "Returns the LibFFI#FFI_DEFAULT_ABI value.")

	Macro..(Address..voidptr)("ffi_type_void", "Returns the address of the {@code ffi_type_void} struct.")

	Macro..(Address..voidptr)("ffi_type_uint8", "Returns the address of the {@code ffi_type_uint8} struct.")
	Macro..(Address..voidptr)("ffi_type_sint8", "Returns the address of the {@code ffi_type_sint8} struct.")
	Macro..(Address..voidptr)("ffi_type_uint16", "Returns the address of the {@code ffi_type_uint16} struct.")
	Macro..(Address..voidptr)("ffi_type_sint16", "Returns the address of the {@code ffi_type_sint16} struct.")
	Macro..(Address..voidptr)("ffi_type_uint32", "Returns the address of the {@code ffi_type_uint32} struct.")
	Macro..(Address..voidptr)("ffi_type_sint32", "Returns the address of the {@code ffi_type_sint32} struct.")
	Macro..(Address..voidptr)("ffi_type_uint64", "Returns the address of the {@code ffi_type_uint64} struct.")
	Macro..(Address..voidptr)("ffi_type_sint64", "Returns the address of the {@code ffi_type_sint64} struct.")

	Macro..(Address..voidptr)("ffi_type_uchar", "Returns the address of the {@code ffi_type_uchar} struct.")
	Macro..(Address..voidptr)("ffi_type_schar", "Returns the address of the {@code ffi_type_schar} struct.")
	Macro..(Address..voidptr)("ffi_type_ushort", "Returns the address of the {@code ffi_type_ushort} struct.")
	Macro..(Address..voidptr)("ffi_type_sshort", "Returns the address of the {@code ffi_type_sshort} struct.")
	Macro..(Address..voidptr)("ffi_type_uint", "Returns the address of the {@code ffi_type_uint} struct.")
	Macro..(Address..voidptr)("ffi_type_sint", "Returns the address of the {@code ffi_type_sint} struct.")
	Macro..(Address..voidptr)("ffi_type_ulong", "Returns the address of the {@code ffi_type_ulong} struct.")
	Macro..(Address..voidptr)("ffi_type_slong", "Returns the address of the {@code ffi_type_slong} struct.")

	Macro..(Address..voidptr)("ffi_type_float", "Returns the address of the {@code ffi_type_float} struct.")
	Macro..(Address..voidptr)("ffi_type_double", "Returns the address of the {@code ffi_type_double} struct.")
	Macro..(Address..voidptr)("ffi_type_longdouble", "Returns the address of the {@code ffi_type_longdouble} struct.")

	Macro..(Address..voidptr)("ffi_type_pointer", "Returns the address of the {@code ffi_type_pointer} struct.")
}