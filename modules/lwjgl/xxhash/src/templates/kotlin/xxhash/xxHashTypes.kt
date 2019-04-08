/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash

import org.lwjgl.generator.*

val XXH32_hash_t = typedef(unsigned_int, "XXH32_hash_t")
val XXH64_hash_t = typedef(unsigned_long_long, "XXH32_hash_t")

val XXH32_state_t = struct(Module.XXHASH, "XXH32State", nativeName = "XXH32_state_t") {
    documentation = "32-bit XXH state for stack allocation. Unstable API."

    XXH32_hash_t("total_len_32", "")
    XXH32_hash_t("large_len", "")
    XXH32_hash_t("v1", "")
    XXH32_hash_t("v2", "")
    XXH32_hash_t("v3", "")
    XXH32_hash_t("v4", "")
    XXH32_hash_t("mem32", "")[4]
    XXH32_hash_t("memsize", "")
    XXH32_hash_t("reserved", "")
}

val XXH64_state_t = struct(Module.XXHASH, "XXH64State", nativeName = "XXH64_state_t") {
    documentation = "64-bit XXH state for stack allocation. Unstable API."

    XXH64_hash_t("total_len", "")
    XXH64_hash_t("v1", "")
    XXH64_hash_t("v2", "")
    XXH64_hash_t("v3", "")
    XXH64_hash_t("v4", "")
    XXH64_hash_t("mem64", "")[4]
    XXH32_hash_t("memsize", "")
    XXH32_hash_t("reserved", "")[2]
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

val XXH128_hash_t = struct(Module.XXHASH, "XXH128Hash", nativeName = "XXH128_hash_t", mutable = false) {
    XXH64_hash_t("low64", "")
    XXH64_hash_t("high64", "high64")
}