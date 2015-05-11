/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libffi.*
import org.lwjgl.opengl.*

fun LibFFI() = "LibFFI".nativeClass(packageName = FFI_PACKAGE, prefix = "FFI_") {
	javaImport (
		"static org.lwjgl.system.libffi.LibFFIConstants.*"
	)

	nativeImport (
		"ffi.h"
	)

	documentation =
		"""
		Native bindings to the ${url("https://sourceware.org/libffi", "libffi")} library.

		The foreign function interface provides a mechanism by which a function can generate a call to another function at runtime without requiring knowledge
		of the called function's interface at compile time. This enables use of native libraries that LWJGL does not provide bindings for.

		libffi assumes that you have a pointer to the function you wish to call and that you know the number and types of arguments to pass it, as well as the
		return type of the function.

		The first thing you must do is create an ##FFICIF object that matches the signature of the function you wish to call. This is a separate step
		because it is common to make multiple calls using a single ##FFICIF. The {@code cif} in {@code ffi_cif} stands for Call InterFace. To prepare a
		call interface object, use the function #prep_cif(). To call a function using an initialized {@code ffi_cif}, use the #call() function.

		<strong>LWJGL note</strong>: The closure and raw APIs are not exposed.
		"""
	
	ShortConstant(
		"Types used to create custom ##FFICIF.",

		"TYPE_VOID" _ 0.s,
		"TYPE_INT" _ 1.s,
		"TYPE_FLOAT" _ 2.s,
		"TYPE_DOUBLE" _ 3.s,
		"TYPE_LONGDOUBLE" expr "FFI_TYPE_DOUBLE()",
		"TYPE_UINT8" _ 5.s,
		"TYPE_SINT8" _ 6.s,
		"TYPE_UINT16" _ 7.s,
		"TYPE_SINT16" _ 8.s,
		"TYPE_UINT32" _ 9.s,
		"TYPE_SINT32" _ 10.s,
		"TYPE_UINT64" _ 11.s,
		"TYPE_SINT64" _ 12.s,
		"TYPE_STRUCT" _ 13.s,
		"TYPE_POINTER" _ 14.s
	)

	val ABI = IntConstant(
		"ABI enumeration.",

		// x86
		"SYSV" _ 1,

		// Win32
		"STDCALL" _ 2,
		"THISCALL" _ 3,
		"FASTCALL" _ 4,
		"MS_CDECL" _ 5,

		// Win64
		"WIN64" _ 1,

		// Unix
		"UNIX64" _ 2,

		"DEFAULT_ABI" expr "FFI_DEFAULT_ABI()"
	).javaDocLinks

	IntConstant(
		"Status codes.",

		"OK" _ 0,
		"BAD_TYPEDEF" _ 1,
		"BAD_ABI" _ 2
	)
	
	LongConstant(
		"Data types. These are the addresses of libffi's predefined ##FFIType structs.",

		"ffi_type_void" expr "ffi_type_void()",

		"ffi_type_uint8" expr "ffi_type_uint8()",
		"ffi_type_sint8" expr "ffi_type_sint8()",
		"ffi_type_uint16" expr "ffi_type_uint16()",
		"ffi_type_sint16" expr "ffi_type_sint16()",
		"ffi_type_uint32" expr "ffi_type_uint32()",
		"ffi_type_sint32" expr "ffi_type_sint32()",
		"ffi_type_uint64" expr "ffi_type_uint64()",
		"ffi_type_sint64" expr "ffi_type_sint64()",

		"ffi_type_uchar" expr "ffi_type_uchar()",
		"ffi_type_schar" expr "ffi_type_schar()",
		"ffi_type_sshort" expr "ffi_type_sshort()",
		"ffi_type_ushort" expr "ffi_type_ushort()",
		"ffi_type_uint" expr "ffi_type_uint()",
		"ffi_type_sint" expr "ffi_type_sint()",
		"ffi_type_ulong" expr "ffi_type_ulong()",
		"ffi_type_slong" expr "ffi_type_slong()",

		"ffi_type_float" expr "ffi_type_float()",
		"ffi_type_double" expr "ffi_type_double()",
		"ffi_type_longdouble" expr "ffi_type_longdouble()",

		"ffi_type_pointer" expr "ffi_type_pointer()"
	).noPrefix()

	ffi_status(
		"prep_cif",
		"Prepares an ##FFICIF structure for use with #call().",

		ffi_cif_p.IN("cif", "the ##FFICIF structure to prepare"),
		ffi_abi.IN("abi", "the calling convention to use", ABI),
		AutoSize("atypes") _ unsigned_int.IN("nargs", "the number of arguments"),
		ffi_type_p.IN("rtype", "points to an ##FFIType that describes the data type, size and alignment of the return value"),
		nullable _ ffi_type_pp.IN("atypes", "an array of {@code nargs} pointers to ##FFIType structs that describe the data type, size and alignment of each argument"),

		returnDoc =
		"""
		Upon successful completion, {@code ffi_prep_cif} returns #OK. It will return #BAD_TYPEDEF if {@code cif} is $NULL or
		{@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, #BAD_ABI will be returned.
		"""
	)

	ffi_status(
		"prep_cif_var",
		"Prepares an ##FFICIF structure for use with #call() for variadic functions.",

		ffi_cif_p.IN("cif", "the ##FFICIF structure to prepare"),
		ffi_abi.IN("abi", "the calling convention to use", ABI),
		unsigned_int.IN("nfixedargs", "the number of fixed (non-variadic) arguments"),
		AutoSize("atypes") _ unsigned_int.IN("ntotalargs", "the total number of arguments"),
		ffi_type_p.IN("rtype", "points to an ##FFIType that describes the data type, size and alignment of the return value"),
		ffi_type_pp.IN("atypes", "an array of {@code ntotalargs} pointers to ##FFIType structs that describe the data type, size and alignment of each argument"),

		returnDoc =
		"""
		Upon successful completion, {@code ffi_prep_cif} returns #OK. It will return #BAD_TYPEDEF if {@code cif} is $NULL or
		{@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, #BAD_ABI will be returned.
		"""
	)

	void(
		"call",
		"Provides a simple mechanism for invoking a function without requiring knowledge of the function's interface at compile time.",

		ffi_cif_p.IN(
			"cif",
			"a ##FFICIF structure. It must be initialized with #prep_cif() or #prep_cif_var() before it is used with {@code ffi_call}."
		),
		FFI_FN_TYPE.IN("fn", "the function to call"),
		nullable _ void_p.IN(
			"rvalue",
			"""
			a pointer to storage in which to place the returned value. The storage must be sizeof(ffi_arg) or larger for non-floating point types. For
			smaller-sized return value types, the ffi_arg or ffi_sarg integral type must be used to hold the return value.
			"""
		),
		nullable _ void_pp.IN("avalue", "an array of pointers from which the argument values are retrieved")
	)

	void_p(
		"closure_alloc",
	    "Allocates an ##FFIClosure structure.",

	    autoSizeResult _ size_t.IN("size", "the number of bytes to allocate", "FFIClosure##SIZEOF"),
	    Check(1) _ void_pp.OUT("code", "a buffer in which to place the returned executable address"),

	    returnDoc = "a pointer to the writable address"
	)

	void(
		"closure_free",
	    "Frees memory allocated using #closure_alloc().",

	    void_p.IN("writable", "the address of an ##FFIClosure structure")
	)

	ffi_status(
		"prep_closure_loc",
	    "",

	    ffi_closure_p.IN("closure", "the address of an ##FFIClosure object; this is the writable address returned by #closure_alloc()."),
	    ffi_cif_p.IN("cif", "the ##FFICIF describing the function parameters"),
	    FFI_CLOSURE_FUN.IN("fun", "the function which will be called when the closure is invoked"),
	    nullable _ voidptr.IN("user_data", "an arbitrary datum that is passed, uninterpreted, to your closure function"),
	    voidptr.IN("codeloc", "the executable address returned by #closure_alloc().")
	)
}