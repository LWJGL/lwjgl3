/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val dlfcn = "DynamicLinkLoader".nativeClass(LINUX_PACKAGE) {
	nativeImport (
		"LinuxLWJGL.h",
		"<dlfcn.h>"
	)

	documentation = "Native bindings to <dlfcn.h>."

	val Modes = IntConstant(
		"The {@code mode} argument to #dlopen() contains one of the following.",

		"RTLD_LAZY" _ 0x00001,
		"RTLD_NOW" _ 0x00002,
		"RTLD_BINDING_MASK" _ 0x3,
		"RTLD_NOLOAD" _ 0x00004,
		"RTLD_DEEPBIND" _ 0x00008
	).javaDocLinks + " #RTLD_GLOBAL #RTLD_LOCAL #RTLD_NODELETE"

	IntConstant(
		"""
		If the following bit is set in the {@code mode} argument to #dlopen(), the symbols of the loaded object and its dependencies are made visible as
		if the object were linked directly into the program.
		""",

		"RTLD_GLOBAL" _ 0x00100
	)

	IntConstant(
		"""
		Unix98 demands the following flag which is the inverse to #RTLD_GLOBAL. The implementation does this by default and so we can define the value
		to zero.
		""",

		"RTLD_LOCAL" _ 0
	)

	IntConstant(
		"Do not delete object when closed.",

		"RTLD_NODELETE" _ 0x01000
	)

	voidptr(
		"dlopen",
		"""
		Loads the dynamic library file named by the null-terminated string {@code filename} and returns an opaque "handle" for the dynamic library. If
		{@code filename} is $NULL, then the returned handle is for the main program.
		""",

		const _ nullable _ charASCII_p.IN("filename", "the name of the dynamic library to open, or $NULL"),
		int.IN("mode", "a bitfield", Modes, LinkMode.BITFIELD)
	)

	charASCII_p(
		"dlerror",
		"""
		Returns a human readable string describing the most recent error that occurred from #dlopen(), #dlsym() or #dlclose() since
		the last call to {@code dlerror()}. It returns $NULL if no errors have occurred since initialization or since it was last called.
		"""
	)

	voidptr(
		"dlsym",
		"""
		Takes a "handle" of a dynamic library returned by #dlopen() and the null-terminated symbol name, returning the address where that symbol is loaded
		into memory. If the symbol is not found, in the specified library or any of the libraries that were automatically loaded by #dlopen() when that
		library was loaded, {@code dlsym()} returns $NULL.
		""",

		voidptr.IN("handle", "the dynamic library handle"),
		const _ charASCII_p.IN("name", "the symbol name")
	)

	int(
		"dlclose",
		"""
		Decrements the reference count on the dynamic library handle handle. If the reference count drops to zero and no other loaded libraries use symbols in
		it, then the dynamic library is unloaded.
		""",

		voidptr.IN("handle", "the dynamic library to close")
	)

}