/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash

import org.lwjgl.generator.*

val XXH32_hash_t = typedef(uint32_t, "XXH32_hash_t")
val XXH64_hash_t = typedef(uint64_t, "XXH64_hash_t")

val XXH32_state_t = struct(Module.XXHASH, "XXH32State", nativeName = "XXH32_state_t", mutable = false) {
    XXH32_hash_t("total_len_32")
    XXH32_hash_t("large_len")
    XXH32_hash_t("acc")[4]
    unsigned_char("buffer")[16]
    XXH32_hash_t("bufferedSize")
    XXH32_hash_t("reserved")
}

val XXH64_state_t = struct(Module.XXHASH, "XXH64State", nativeName = "XXH64_state_t", mutable = false) {
    XXH64_hash_t("total_len")
    XXH64_hash_t("acc")[4]
    unsigned_char("buffer")[32]
    XXH32_hash_t("bufferedSize")
    XXH32_hash_t("reserved32")
    XXH64_hash_t("reserved64")
}

val XXH_errorcode = "XXH_errorcode".enumType

val XXH32_canonical_t = struct(Module.XXHASH, "XXH32Canonical", nativeName = "XXH32_canonical_t", mutable = false) {
    unsigned_char("digest")[4]
}

val XXH64_canonical_t = struct(Module.XXHASH, "XXH64Canonical", nativeName = "XXH64_canonical_t", mutable = false) {
    unsigned_char("digest")[8]
}

val XXH3_state_t = struct(Module.XXHASH, "XXH3State", nativeName = "XXH3_state_t", mutable = false) {
    javaImport("static org.lwjgl.util.xxhash.XXHash.*")
    alignas(64)

    /*XXH_ALIGN(64) */XXH64_hash_t("acc")[8]
    /*XXH_ALIGN(64) */unsigned_char("customSecret")["XXH3_SECRET_DEFAULT_SIZE"]
    padding("64 - (XXH3_SECRET_DEFAULT_SIZE & 63)", "(XXH3_SECRET_DEFAULT_SIZE & 63) != 0")
    /*XXH_ALIGN(64) */unsigned_char("buffer")[256]
    XXH32_hash_t("bufferedSize")
    XXH32_hash_t("useSeed")
    size_t("nbStripesSoFar")
    XXH64_hash_t("totalLen")
    size_t("nbStripesPerBlock")
    size_t("secretLimit")
    XXH64_hash_t("seed")
    XXH64_hash_t("reserved64")
    unsigned_char.const.p("extSecret")
}

val XXH128_hash_t = struct(Module.XXHASH, "XXH128Hash", nativeName = "XXH128_hash_t", mutable = false) {
    XXH64_hash_t("low64")
    XXH64_hash_t("high64")
}

val XXH128_canonical_t = struct(Module.XXHASH, "XXH128Canonical", nativeName= "XXH128_canonical_t", mutable = false) {
    unsigned_char("digest")[16]
}