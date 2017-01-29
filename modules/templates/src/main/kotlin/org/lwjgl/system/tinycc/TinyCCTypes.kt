/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.tinycc

import org.lwjgl.generator.*

val TINYCC_PACKAGE = "org.lwjgl.system.tinycc"

fun config() {
	packageInfo(
		TINYCC_PACKAGE,
		"""
		Contains bindings to the <a href="http://bellard.org/tcc/">TinyCC</a> library.

		TinyCC (aka TCC) is a small but hyper fast C compiler. Unlike other C compilers, it is meant to be self-relying: you do not need an external assembler
		or linker because TCC does that for you.

		TCC compiles so fast that even for big projects Makefiles may not be necessary.

		TCC not only supports ANSI C, but also most of the new ISO C99 standard and many GNUC extensions including inline assembly.

		TCC can also be used to make C scripts, i.e. pieces of C source that you run as a Perl or Python script. Compilation is so fast that your script will
		be as fast as if it was an executable.

		TCC can also automatically generate memory and bound checks (see section 6. TinyCC Memory and Bound checks) while allowing all C pointers operations.
		TCC can do these checks even if non patched libraries are used.

		With libtcc, you can use TCC as a backend for dynamic code generation.
		"""
	)
}

val TINYCC_BINDING = simpleBinding("tinycc", """Configuration.TINYCC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("tcc"))""", bundledWithLWJGL = true)

val TCCState_p = "TCCState".opaque_p

val error_func = "void (*error_func)(void *opaque, const char *msg)".callback(
	TINYCC_PACKAGE, void, "ErrorCallback",
	"Will be called when an error or warning occurs.",

	opaque_p.IN("opaque", ""),
	charASCII_p.IN("msg", "")
)