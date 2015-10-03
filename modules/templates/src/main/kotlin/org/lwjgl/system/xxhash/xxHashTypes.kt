/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.xxhash

import org.lwjgl.generator.*

val XXHASH_PACKAGE = "org.lwjgl.system.xxhash"

val unsigned_long_long = IntegerType("long long", PrimitiveMapping.LONG, unsigned = true)

val XXH32_state_t_p = struct_p(XXHASH_PACKAGE, "XXH32State", structName = "XXH32_state_t", mutable = false) {
	nativeImport("xxhash.h")
	documentation = "State used by the advanced 32-bit {@link XXHash} functions."
}

val XXH64_state_t_p = struct_p(XXHASH_PACKAGE, "XXH64State", structName = "XXH64_state_t", mutable = false) {
	nativeImport("xxhash.h")
	documentation = "State used by the advanced 64-bit {@link XXHash} functions."
}

val XXH_errorcode = typedef(int, "XXH_errorcode")