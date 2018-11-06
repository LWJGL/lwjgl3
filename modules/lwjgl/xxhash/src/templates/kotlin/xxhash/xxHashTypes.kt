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

val XXH32_hash_t = typedef(unsigned_int, "XXH32_hash_t")
val XXH64_hash_t = typedef(unsigned_long_long, "XXH32_hash_t")

val XXH32_state_t = struct(Module.XXHASH, "XXH32State", nativeName = "XXH32_state_t") {
    documentation = "32-bit XXH state for stack allocation. Unstable API."

    unsigned("total_len_32", "")
    unsigned("large_len", "")
    unsigned("v1", "")
    unsigned("v2", "")
    unsigned("v3", "")
    unsigned("v4", "")
    unsigned("mem32", "")[4]
    unsigned("memsize", "")
    unsigned("reserved", "")
}

val XXH64_state_t = struct(Module.XXHASH, "XXH64State", nativeName = "XXH64_state_t") {
    documentation = "64-bit XXH state for stack allocation. Unstable API."

    unsigned_long_long("total_len", "")
    unsigned_long_long("v1", "")
    unsigned_long_long("v2", "")
    unsigned_long_long("v3", "")
    unsigned_long_long("v4", "")
    unsigned_long_long("mem64", "")[4]
    unsigned("memsize", "")
    unsigned("reserved", "")[2]
}

val XXH_errorcode = "XXH_errorcode".enumType

val XXH32_canonical_t = struct(Module.XXHASH, "XXH32Canonical", nativeName = "XXH32_canonical_t", mutable = false) {
    documentation = "32-bit canonical representation."

    unsigned_char("digest", "the digest in canonical representation")[4]
}

val XXH64_canonical_t = struct(Module.XXHASH, "XXH64Canonical", nativeName = "XXH64_canonical_t", mutable = false) {
    documentation = "64-bit canonical representation."

    unsigned_char("digest", "the digest in canonical representation")[8]
}