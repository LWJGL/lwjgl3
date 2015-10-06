/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.xxhash.templates

import org.lwjgl.generator.*
import org.lwjgl.system.xxhash.*

val xxhash = "XXHash".nativeClass(XXHASH_PACKAGE, prefixMethod = "XXH") {
	nativeDirective(
"""DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711))
#endif
#include "xxhash.c"
ENABLE_WARNINGS()""")

	documentation =
		"""
		Native bindings to <a href="https://github.com/Cyan4973/xxHash">xxhash</a>.

		xxHash is an extremely fast Hash algorithm, running at RAM speed limits. It also successfully passes all tests from the SMHasher suite.
		"""

	EnumConstant(
		"Error codes.",

	    "OK".enum,
	    "ERROR".enum
	)

	// Simple Hash Functions

	val XXH32 = unsigned_int(
		"32",
		"""
		Calculates the 32-bits hash of sequence {@code length} bytes stored at memory address {@code input}.

        This function successfully passes all SMHasher tests.
		""",

		const..void_p.IN(
			"input",
			"the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible)."
		),
		AutoSize("input")..size_t.IN("length", "the number of bytes stored at memory address {@code input}"),
		unsigned_int.IN("seed", "the seed that can be used to alter the result predictably")
	)

	unsigned_long_long(
		"64",
		"64-bit version of #32(). Faster on 64-bits systems. Slower on 32-bits systems.",

		XXH32["input"],
		XXH32["length"],
		unsigned_long_long.IN("seed", "the seed that can be used to alter the result predictably")
	)

	// Advanced Hash Functions

	XXH32_state_t_p(
		"32_createState",
		"""
		Creates memory for {@link XXH32State}. The state must then be initialized using #32_reset() before first use.

		<b>LWJGL note</b>: This function simply delegates to the system {@code malloc()} function.
		"""
	)

	XXH_errorcode(
		"32_freeState",
		"""
		Frees the specified {@link XXH32State}.

		<b>LWJGL note</b>: This function simply delegates to the system {@code free()} function.
		""",

		XXH32_state_t_p.IN("statePtr", "the state to free")
	)

	XXH64_state_t_p(
		"64_createState",
		"64-bit version of #32_createState()."
	)

	XXH_errorcode(
		"64_freeState",
		"64-bit version of #32_freeState().",

		XXH64_state_t_p.IN("statePtr", "the state to free")
	)

	XXH_errorcode(
		"32_reset",
		"Resets the specified {@link XXH32State}.",

		XXH32_state_t_p.IN("statePtr", "the {@link XXH32State} to reset"),
		unsigned_int.IN("seed", "the seed that can be used to alter the hashing result predictably")
	)

	XXH_errorcode(
		"32_update",
		"""
		Calculate the xxHash of an input provided in multiple smaller packets, as opposed to an input provided as a single block.

		The XXH state space must first be allocated.

		Start a new hash by initializing state with a seed, using #32_reset().

		Then, feed the hash state by calling #32_update() as many times as necessary. Obviously, input must be valid, meaning allocated and read accessible.
		The function returns an error code, with 0 meaning OK, and any other value meaning there is an error.
		""",

		XXH32_state_t_p.IN("statePtr", "the {@link XXH32State} to use"),
		XXH32["input"],
		XXH32["length"]
	)

	unsigned_int(
		"32_digest",
		"""
		Returns the final 32-bits hash of the specified {@link #XXH32State}.

		You can nonetheless continue feeding the hash state with more input, and therefore get some new hashes, by calling again #32_digest().

		When you are done, don't forget to free XXH state space, using #32_freeState().
		""",

		const..XXH32_state_t_p.IN("statePtr", "the {@link XXH32State} to use")
	)

	XXH_errorcode(
		"64_reset",
		"64-bit version of #32_reset().",

		XXH64_state_t_p.IN("statePtr", "the {@link XXH64State} to reset"),
		unsigned_long_long.IN("seed", "the seed that can be used to alter the hashing result predictably")
	)

	XXH_errorcode(
		"64_update",
		"64-bit version of #32_update().",

		XXH64_state_t_p.IN("statePtr", "the {@link XXH64State} to use"),
		XXH32["input"],
		XXH32["length"]
	)

	unsigned_long_long(
		"64_digest",
		"64-bit version of #32_digest().",

		const..XXH64_state_t_p.IN("statePtr", "the {@link XXH64State} to use")
	)
}