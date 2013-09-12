/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.macosx.*

// TODO: This was done quickly, needs more work
fun dlfcn() = "DynamicLinkLoader".nativeClass(MACOSX_PACKAGE) {
	nativeImport (
		"MacOSXLWJGL.h",
		"<dlfcn.h>"
	)

	javaDoc("Native bindings to <dlfcn.h>.")

	val Modes = IntConstant.block(
		"The {@code mode} argument to {@link #dlopen} contains one of the following:",

		"RTLD_LAZY" _ 0x1,
		"RTLD_NOW" _ 0x2,
		"RTLD_LOCAL" _ 0x4,
		"RTLD_GLOBAL" _ 0x8,
	    "RTLD_NOLOAD" _ 0x10,
	    "RTLD_NODELETE" _ 0x80,
	    "RTLD_FIRST" _ 0x100
	).toJavaDocLinks()

	voidptr.func(
		"dlopen",
		"""
		Loads and links a dynamic library or bundle.
		""",

		mods(const, nullable) _ charASCII_p.IN("path", "path to the image to open"),
		int.IN(
			"mode",
			"""
			specifies when the loaded image’s external symbols are bound to their definitions in dependent libraries (lazy or at load time) and the visibility
			of the image's exported symbols (global or local). The value of this parameter is made up by ORing one binding behavior value with one visibility
			specification value.
			""",
			Modes)
	)

	charASCII_p.func(
		"dlerror",
		"""
		Returns a human readable string describing the most recent error that occurred from {@link #dlopen}, {@link #dlsym} or {@link #dlclose} since the last
		call to {@code dlerror()}. It returns $NULL if no errors have occurred since initialization or since it was last called.
		"""
	)

	voidptr.func(
		"dlsym",
		"""
		Returns the address of a symbol.
		""",

		voidptr.IN(
			"handle",
			"""
			a handle obtained by a call to {@link #dlopen}, or a special handle. If the handle was obtained by a call to {@link #dlopen}, it must not have been
			closed with a call to {@link #dlclose}. These are the possible special-handle values: RTLD_DEFAULT, and RTLD_NEXT.
			"""
		),
		const _ charASCII_p.IN("name", "the null-terminated character string containing the C name of the symbol being sought")
	)

	int.func(
		"dlclose",
		"""
		Closes a dynamic library or bundle.

		This function decreases the reference count of the image referenced by handle. When the reference count for handle becomes 0, the termination routines
		in the image are called, and the image is removed from the address space of the current process. After that point, handle is rendered invalid.
		""",

		voidptr.IN("handle", "a handle obtained through a call to {@link #dlopen}.")
	)

}