/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.XXHASH,
        """
        Contains bindings to ${url("https://github.com/Cyan4973/xxHash", "xxHash")}, an extremely fash non-cryptographic hash algorithm.

        xxHash successfully completes the ${url("https://github.com/aappleby/smhasher", "SMHasher")} test suite which evaluates collision, dispersion and
        randomness qualities of hash functions.
        """
    )

    Generator.registerLibraryInit(Module.XXHASH, "LibXXHash", "xxhash", setupAllocator = true)
}

val unsigned_long_long = IntegerType("long long", PrimitiveMapping.LONG, unsigned = true)

val XXH32_hash_t = typedef(unsigned_int, "XXH32_hash_t")
val XXH64_hash_t = typedef(unsigned_long_long, "XXH32_hash_t")

val XXH32_state_t = struct(Module.XXHASH, "XXH32State", nativeName = "XXH32_state_t") {
    documentation = "32-bit XXH state for stack allocation. Unstable API."

    unsigned.member("total_len_32", "")
    unsigned.member("large_len", "")
    unsigned.member("v1", "")
    unsigned.member("v2", "")
    unsigned.member("v3", "")
    unsigned.member("v4", "")
    unsigned.array("mem32", "", size = 4)
    unsigned.member("memsize", "")
    unsigned.member("reserved", "")
}

val XXH64_state_t = struct(Module.XXHASH, "XXH64State", nativeName = "XXH64_state_t") {
    documentation = "64-bit XXH state for stack allocation. Unstable API."

    unsigned_long_long.member("total_len", "")
    unsigned_long_long.member("v1", "")
    unsigned_long_long.member("v2", "")
    unsigned_long_long.member("v3", "")
    unsigned_long_long.member("v4", "")
    unsigned_long_long.array("mem64", "", size = 4)
    unsigned.member("memsize", "")
    unsigned.array("reserved", "", size = 2)
}

val XXH_errorcode = "XXH_errorcode".enumType

val XXH32_canonical_t = struct(Module.XXHASH, "XXH32Canonical", nativeName = "XXH32_canonical_t", mutable = false) {
    documentation = "32-bit canonical representation."

    unsigned_char.array("digest", "the digest in canonical representation", size = 4)
}

val XXH64_canonical_t = struct(Module.XXHASH, "XXH64Canonical", nativeName = "XXH64_canonical_t", mutable = false) {
    documentation = "64-bit canonical representation."

    unsigned_char.array("digest", "the digest in canonical representation", size = 8)
}