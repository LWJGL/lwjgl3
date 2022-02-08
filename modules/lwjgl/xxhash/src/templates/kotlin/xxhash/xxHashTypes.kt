/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash

import org.lwjgl.generator.*

val XXH32_hash_t = typedef(uint32_t, "XXH32_hash_t")
val XXH64_hash_t = typedef(uint64_t, "XXH64_hash_t")

val XXH32_state_t = struct(Module.XXHASH, "XXH32State", nativeName = "XXH32_state_t", mutable = false) {
    documentation = "The opaque state struct for the XXH32 streaming API."

    XXH32_hash_t("total_len_32", "total length hashed, modulo {@code 2^32}")
    XXH32_hash_t("large_len", "whether the hash is &ge; 16 (handles {@code total_len_32} overflow)")
    XXH32_hash_t("v", "accumulator lanes")[4]
    XXH32_hash_t("mem32", "internal buffer for partial reads. Treated as {@code unsigned char[16]}.")[4]
    XXH32_hash_t("memsize", "amount of data in {@code mem32}")
    XXH32_hash_t("reserved", "reserved field. Do not read or write to it, it may be removed.")
}

val XXH64_state_t = struct(Module.XXHASH, "XXH64State", nativeName = "XXH64_state_t", mutable = false) {
    documentation = "The opaque state struct for the XXH64 streaming API."

    XXH64_hash_t("total_len", "total length hashed. This is always 64-bit.")
    XXH64_hash_t("v", "accumulator lanes")[4]
    XXH64_hash_t("mem64", "internal buffer for partial reads. Treated as {@code unsigned char[32]}.")[4]
    XXH32_hash_t("memsize", "amount of data in {@code mem64}")
    XXH32_hash_t("reserved32", "reserved field, needed for padding anyways")
    XXH64_hash_t("reserved64", "reserved field. Do not read or write to it, it may be removed.")
}

val XXH_errorcode = "XXH_errorcode".enumType

val XXH32_canonical_t = struct(Module.XXHASH, "XXH32Canonical", nativeName = "XXH32_canonical_t", mutable = false) {
    documentation = "Canonical (big endian) representation of {@code XXH32_hash_t}."

    unsigned_char("digest", "hash bytes, big endian")[4]
}

val XXH64_canonical_t = struct(Module.XXHASH, "XXH64Canonical", nativeName = "XXH64_canonical_t", mutable = false) {
    documentation = "64-bit canonical representation."

    unsigned_char("digest", "the digest in canonical representation")[8]
}

val XXH3_state_t = struct(Module.XXHASH, "XXH3State", nativeName = "XXH3_state_t", mutable = false) {
    documentation =
        """
        The state struct for the XXH3 streaming API.

        This structure has a strict alignment requirement of 64 bytes! Do not allocate this with {@code malloc()}, it will not be sufficiently aligned. Use
        #XXH3_createState() and #XXH3_freeState(), or stack allocation.
        """
    javaImport("static org.lwjgl.util.xxhash.XXHash.*")
    alignas(64)

    /*XXH_ALIGN(64) */XXH64_hash_t("acc", "the 8 accumulators. Similar to {@code v} in {@code XXH32_state_s} and {@code XXH64_state_s}.")[8]
    /*XXH_ALIGN(64) */unsigned_char("customSecret", "used to store a custom secret generated from a seed")["XXH3_SECRET_DEFAULT_SIZE"]
    padding("64 - (XXH3_SECRET_DEFAULT_SIZE & 63)", "(XXH3_SECRET_DEFAULT_SIZE & 63) != 0")
    /*XXH_ALIGN(64) */unsigned_char("buffer", "the internal buffer. See {@code XXH32_state_s::mem32}.")[256]
    XXH32_hash_t("bufferedSize", "the amount of memory in {@code buffer}, See {@code XXH32_state_s::memsize}.")
    XXH32_hash_t("useSeed", "reserved field. Needed for padding on 64-bit.")
    size_t("nbStripesSoFar", "number or stripes processed")
    XXH64_hash_t("totalLen", "total length hashed. 64-bit even on 32-bit targets.")
    size_t("nbStripesPerBlock", "number of stripes per block")
    size_t("secretLimit", "size of {@code customSecret} or {@code extSecret}")
    XXH64_hash_t("seed", "seed for {@code _withSeed} variants. Must be zero otherwise, see {@code XXH3_INITSTATE()}.")
    XXH64_hash_t("reserved64", "reserved field")
    unsigned_char.const.p("extSecret", "reference to an external secret for the {@code _withSecret} variants, #NULL for other variants")
}

val XXH128_hash_t = struct(Module.XXHASH, "XXH128Hash", nativeName = "XXH128_hash_t", mutable = false) {
    documentation =
        """
        The return value from 128-bit hashes.

        Stored in little endian order, although the fields themselves are in native endianness.
        """

    XXH64_hash_t("low64", "{@code value & 0xFFFFFFFFFFFFFFFF}")
    XXH64_hash_t("high64", "{@code value >> 64}")
}

val XXH128_canonical_t = struct(Module.XXHASH, "XXH128Canonical", nativeName= "XXH128_canonical_t", mutable = false) {
    documentation = "128-bit canonical representation."

    unsigned_char("digest", "the digest in canonical representation")[16]
}