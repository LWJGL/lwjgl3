/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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

	macro..charASCII_p("JEMALLOC_VERSION", "Returns the version string.")
	macro..int("JEMALLOC_VERSION_MAJOR", "Returns the major version.")
	macro..int("JEMALLOC_VERSION_MINOR", "Returns the minor version.")
	macro..int("JEMALLOC_VERSION_BUGFIX", "Returns the bugfix version.")
	macro..int("JEMALLOC_VERSION_NREV", "Returns the revision number.")
	macro..charASCII_p("JEMALLOC_VERSION_GID", "Returns the globally unique identifier (git commit hash).")

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

	macro..unsigned_int(
		"MALLOCX_ZERO",
		"""
		Initialize newly allocated memory to contain zero bytes. In the growing reallocation case, the real size prior to reallocation defines the boundary
		between untouched bytes and those that are initialized to contain zero bytes. If this macro is absent, newly allocated memory is uninitialized.
		"""
	)

	unsigned_int(
		"MALLOCX_TCACHE",
		"""
		Use the thread-specific cache (tcache) specified by the identifier {@code tc}, which must have been acquired via the {@code tcache.create} mallctl.
		This macro does not validate that {@code tc} specifies a valid identifier.
		""",

		unsigned_int.IN("tc", "the thread-specific cache")
	)

	macro..unsigned_int(
		"MALLOCX_TCACHE_NONE",
		"""
		Do not use a thread-specific cache (tcache).  Unless #MALLOCX_TCACHE() or {@code MALLOCX_TCACHE_NONE} is specified, an automatically managed tcache
		will be used under many circumstances. This macro cannot be used in the same {@code flags} argument as {@code MALLOCX_TCACHE(tc)}.
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