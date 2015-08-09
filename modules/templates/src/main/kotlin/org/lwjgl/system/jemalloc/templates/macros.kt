/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.jemalloc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.jemalloc.*

val jemalloc_macros = "JEmacros".nativeClass(JEMALLOC_PACKAGE) {
	nativeDirective(
		"""DISABLE_WARNINGS()
#include "jemalloc.h"
ENABLE_WARNINGS()""")

	documentation = "Macros for jemalloc."

	// Versions

	macro _ charASCII_p("JEMALLOC_VERSION", "Returns the version string.")
	macro _ int("JEMALLOC_VERSION_MAJOR", "Returns the major version.")
	macro _ int("JEMALLOC_VERSION_MINOR", "Returns the minor version.")
	macro _ int("JEMALLOC_VERSION_BUGFIX", "Returns the bugfix version.")
	macro _ int("JEMALLOC_VERSION_NREV", "Returns the revision number.")
	macro _ charASCII_p("JEMALLOC_VERSION_GID", "Returns the globally unique identifier (git commit hash).")

	// Non-standard API

	unsigned_int(
		"MALLOCX_LG_ALIGN",
		"""
		Align the memory allocation to start at an address that is a multiple of {@code (1 << la)}. This macro does not validate that {@code la} is within the
		valid range.
		""",

		unsigned_int.IN("la", "the alignment shift")
	)

	unsigned_int(
		"MALLOCX_ALIGN",
		"""
		Align the memory allocation to start at an address that is a multiple of {@code a}, where {@code a} is a power of two. This macro does not validate
		that {@code a} is a power of 2.
		""",

		size_t.IN("a", "the alignment")
	)

	macro _ unsigned_int(
		"MALLOCX_ZERO",
		"""
		Initialize newly allocated memory to contain zero bytes. In the growing reallocation case, the real size prior to reallocation defines the boundary
		between untouched bytes and those that are initialized to contain zero bytes. If this macro is absent, newly allocated memory is uninitialized.
		"""
	)

	unsigned_int(
		"MALLOCX_ARENA",
		"""
		Use the arena specified by the index {@code a} (and by necessity bypass the thread cache). This macro has no effect for huge regions, nor for regions
		that were allocated via an arena other than the one specified. This macro does not validate that {@code a} specifies an arena index in the valid range.
	    """,

		unsigned_int.IN("a", "the arena index")
	)
}