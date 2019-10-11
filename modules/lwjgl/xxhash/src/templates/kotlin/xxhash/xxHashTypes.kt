/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash

import org.lwjgl.generator.*

val XXH32_hash_t = typedef(uint32_t, "XXH32_hash_t")
val XXH64_hash_t = typedef(uint64_t, "XXH32_hash_t")

val XXH32_state_t = struct(Module.XXHASH, "XXH32State", nativeName = "XXH32_state_t", mutable = false) {
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

val XXH64_state_t = struct(Module.XXHASH, "XXH64State", nativeName = "XXH64_state_t", mutable = false) {
    documentation = "64-bit XXH state for stack allocation. Unstable API."

    XXH64_hash_t("total_len", "")
    XXH64_hash_t("v1", "")
    XXH64_hash_t("v2", "")
    XXH64_hash_t("v3", "")
    XXH64_hash_t("v4", "")
    XXH64_hash_t("mem64", "")[4]
    XXH32_hash_t("memsize", "")
    XXH32_hash_t("reserved32", "required for padding anyway")
    XXH64_hash_t("reserved64", "never read nor write, might be removed in a future version")
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

val XXH3_state_t = struct(Module.XXHASH, "XXH3State", nativeName = "XXH3_state_t", mutable = false) {
    documentation = "XXH3 state for stack allocation. Unstable API."

    /*XXH_ALIGN(64) */XXH64_hash_t("acc", "")[8]
    /*XXH_ALIGN(64) */unsigned_char("customSecret", "")[192]
    /*XXH_ALIGN(64) */unsigned_char("buffer", "")[256]
    XXH32_hash_t("bufferedSize", "")
    XXH32_hash_t("nbStripesPerBlock", "")
    XXH32_hash_t("nbStripesSoFar", "")
    XXH32_hash_t("secretLimit", "")
    XXH32_hash_t("reserved32", "")
    XXH32_hash_t("reserved32_2", "")
    XXH64_hash_t("totalLen", "")
    XXH64_hash_t("seed", "")
    XXH64_hash_t("reserved64", "")
    unsigned_char.const.p("secret", "")
}

val XXH128_hash_t = struct(Module.XXHASH, "XXH128Hash", nativeName = "XXH128_hash_t", mutable = false) {
    XXH64_hash_t("low64", "")
    XXH64_hash_t("high64", "")
}

val XXH128_canonical_t = struct(Module.XXHASH, "XXH128Canonical", nativeName= "XXH128_canonical_t", mutable = false) {
    documentation = "128-bit canonical representation."

    unsigned_char("digest", "the digest in canonical representation")[16]
}