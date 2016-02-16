/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.xxhash

import org.lwjgl.generator.*

val XXHASH_PACKAGE = "org.lwjgl.system.xxhash"

fun config() {
	packageInfo(
		XXHASH_PACKAGE,
		"""
		Contains bindings to <a href="https://github.com/Cyan4973/xxHash">xxHash</a>, an extremely fash non-cryptographic hash algorithm.

		xxHash successfully completes the <a href="https://code.google.com/p/smhasher/wiki/SMHasher">SMHasher</a> test suite which evaluates collision,
		dispersion and randomness qualities of hash functions.
		"""
	)
}

val unsigned_long_long = IntegerType("long long", PrimitiveMapping.LONG, unsigned = true)

val XXH32_state_t_p = struct_p(XXHASH_PACKAGE, "XXH32State", nativeName = "XXH32_state_t", mutable = false) {
	nativeImport("xxhash.h")
	documentation = "State used by the advanced 32-bit {@link XXHash} functions."
}

val XXH64_state_t_p = struct_p(XXHASH_PACKAGE, "XXH64State", nativeName = "XXH64_state_t", mutable = false) {
	nativeImport("xxhash.h")
	documentation = "State used by the advanced 64-bit {@link XXHash} functions."
}

val XXH_errorcode = "XXH_errorcode".enumType