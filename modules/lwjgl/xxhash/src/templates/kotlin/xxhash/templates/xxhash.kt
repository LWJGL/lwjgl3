/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash.templates

import org.lwjgl.generator.*
import xxhash.*

val xxhash = "XXHash".nativeClass(Module.XXHASH, prefix = "XXH", prefixMethod = "XXH") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define XXH_INLINE_ALL
#include "lwjgl_malloc.h"
#include "xxhash.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to ${url("https://github.com/Cyan4973/xxHash", "xxhash")}.

        xxHash is an extremely fast Hash algorithm, running at RAM speed limits. It also successfully passes all tests from the SMHasher suite.

        A 64-bit version, named XXH64, is available since r35. It offers much better speed, but for 64-bit applications only.

        <h3>XXH3</h3>

 * XXH3 is a new hash algorithm,
 * featuring vastly improved speed performance
 * for both small and large inputs.
 * A full speed analysis will be published,
 * it requires a lot more space than this comment can handle.
 * In general, expect XXH3 to run about ~2x faster on large inputs,
 * and >3x faster on small ones, though exact difference depend on platform.
 *
 * The algorithm is portable, will generate the same hash on all platforms.
 * It benefits greatly from vectorization units, but does not require it.
 *
 * XXH3 offers 2 variants, _64bits and _128bits.
 * When only 64 bits are needed, prefer calling the _64bits variant :
 * it reduces the amount of mixing, resulting in faster speed on small inputs.
 * It's also generally simpler to manipulate a scalar type than a struct.
 * Note : the low 64-bit field of the _128bits variant is the same as _64bits result.
 *
 * The XXH3 algorithm is still considered experimental.
 * It's possible to use it for ephemeral data, but avoid storing long-term values for later re-use.
 * While labelled experimental, the produced result can still change between versions.
 *
 * The API currently supports one-shot hashing only.
 * The full version will include streaming capability, and canonical representation
 * Long term optional feature may include custom secret keys, and secret key generation.
 *
 * There are still a number of opened questions that community can influence during the experimental period.
 * I'm trying to list a few of them below, though don't consider this list as complete.
 *
 * - 128-bits output type : currently defined as a structure of 2 64-bits fields.
 *                          That's because 128-bit values do not exist in C standard.
 *                          Note that it means that, at byte level, result is not identical depending on endianess.
 *                          However, at field level, they are identical on all platforms.
 *                          The canonical representation will solve the issue of identical byte-level representation across platforms,
 *                          which is necessary for serialization.
 *                          Would there be a better representation for a 128-bit hash result ?
 *                          Are the names of the inner 64-bit fields important ? Should they be changed ?
 *
 * - Canonical representation : for the 64-bit variant, canonical representation is the same as XXH64() (aka big-endian).
 *                          What should it be for the 128-bit variant ?
 *                          Since it's no longer a scalar value, big-endian representation is no longer an obvious choice.
 *                          One possibility : represent it as the concatenation of two 64-bits canonical representation (aka 2x big-endian)
 *                          Another one : represent it in the same order as natural order in the struct for little-endian platforms.
 *                                        Less consistent with existing convention for XXH32/XXH64, but may be more natural for little-endian platforms.
 *
 * - Associated functions for 128-bit hash : simple things, such as checking if 2 hashes are equal, become more difficult with struct.
 *                          Granted, it's not terribly difficult to create a comparator, but it's still a workload.
 *                          Would it be beneficial to declare and define a comparator function for XXH128_hash_t ?
 *                          Are there other operations on XXH128_hash_t which would be desirable ?
 *
 * - Variant compatibility : The low 64-bit field of the _128bits variant is the same as the result of _64bits.
 *                          This is not a compulsory behavior. It just felt that it "wouldn't hurt", and might even help in some (unidentified) cases.
 *                          But it might influence the design of XXH128_hash_t, in ways which may block other possibilities.
 *                          Good idea, bad idea ?
 *
 * - Seed type for 128-bits variant : currently, it's a single 64-bit value, like the 64-bit variant.
 *                          It could be argued that it's more logical to offer a 128-bit seed input parameter for a 128-bit hash.
 *                          Although it's also more difficult to use, since it requires to declare and pass a structure instead of a value.
 *                          It would either replace current choice, or add a new one.
 *                          Farmhash, for example, offers both variants (the 128-bits seed variant is called `doubleSeed`).
 *                          If both 64-bit and 128-bit seeds are possible, which variant should be called XXH128 ?
 *
 * - Result for len==0 : Currently, the result of hashing a zero-length input is the seed.
 *                          This mimics the behavior of a crc : in which case, a seed is effectively an accumulator, so it's not updated if input is empty.
 *                          Consequently, by default, when no seed specified, it returns zero. That part seems okay (it used to be a request for XXH32/XXH64).
 *                          But is it still fine to return the seed when the seed is non-zero ?
 *                          Are there use case which would depend on this behavior, or would prefer a mixing of the seed ?
        """

    EnumConstant(
        "Error codes.",

        "OK".enum,
        "ERROR".enum
    )

    IntConstant("The major version number.", "VERSION_MAJOR".."0")
    IntConstant("The minor version number.", "VERSION_MINOR".."7")
    IntConstant("The release version number.", "VERSION_RELEASE".."0")

    IntConstant(
        "The version number",
        "VERSION_NUMBER".."(XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE)"
    )

    // 32-bits hash

    val XXH32 = XXH32_hash_t(
        "32",
        "Calculates the 32-bits hash of sequence {@code length} bytes stored at memory address {@code input}.",

        void.const.p(
            "input",
            "the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible)."
        ),
        AutoSize("input")..size_t("length", "the number of bytes stored at memory address {@code input}"),
        unsigned_int("seed", "the seed that can be used to alter the result predictably")
    )

    XXH32_state_t.p(
        "32_createState",
        """
        Creates memory for {@code XXH32_state_t}. The state must then be initialized using #32_reset() before first use.

        <b>LWJGL note</b>: This function simply delegates to the system {@code malloc()} function.
        """,
        void()
    )

    XXH_errorcode(
        "32_freeState",
        "Frees the specified {@code XXH32_state_t}.",

        XXH32_state_t.p("statePtr", "the state to free")
    )

    void(
        "32_copyState",
        "",

        XXH32_state_t.p("dst_state", ""),
        XXH32_state_t.const.p("src_state", "")
    )

    XXH_errorcode(
        "32_reset",
        "Resets the specified {@code XXH32_state_t}.",

        XXH32_state_t.p("statePtr", "the {@code XXH32_state_t} to reset"),
        unsigned_int("seed", "the seed that can be used to alter the hashing result predictably")
    )

    XXH_errorcode(
        "32_update",
        """
        These functions generate the xxHash of an input provided in multiple segments. Note that, for small input, they are slower than single-call functions,
        due to state management. For small input, prefer #32().

        XXH state must first be allocated, using #32_createState().

        Start a new hash by initializing state with a seed, using #32_reset().

        Then, feed the hash state by calling #32_update() as many times as necessary. Obviously, input must be allocated and read accessible. The function
        returns an error code, with 0 meaning OK, and any other value meaning there is an error.

        Finally, a hash value can be produced anytime, by using #32_digest(). This function returns the 32-bits hash as an int.

        It's still possible to continue inserting input into the hash state after a digest, and generate some new hashes later on, by calling again
        #32_digest().

        When done, free XXH state space.
        """,

        XXH32_state_t.p("statePtr", "the {@code XXH32_state_t} to use"),
        XXH32["input"],
        XXH32["length"]
    )

    XXH32_hash_t(
        "32_digest",
        "Returns the final 32-bits hash of the specified {@code XXH32_state_t}.",

        XXH32_state_t.const.p("statePtr", "the {@code XXH32_state_t} to use")
    )

    void(
        "32_canonicalFromHash",
        """
        Default result type for XXH functions are primitive unsigned 32 and 64 bits.

        The canonical representation uses human-readable write convention, aka big-endian (large digits first). These functions allow transformation of hash
        result into and from its canonical format. This way, hash values can be written into a file / memory, remaining comparable across different systems.
        """,

        XXH32_canonical_t.p("dst", "the destination canonical representation"),
        XXH32_hash_t("hash", "the source hash")
    )

    XXH32_hash_t(
        "32_hashFromCanonical",
        "Transforms the specified canonical representation to a primitive value.",

        XXH32_canonical_t.const.p("src", "the source canonical representation")
    )

    // 64-bits hash

    XXH64_hash_t(
        "64",
        """
        64-bit version of #32().

        This function runs 2x faster on 64-bits systems, but slower on 32-bits systems.
        """,

        XXH32["input"],
        XXH32["length"],
        unsigned_long_long("seed", "the seed that can be used to alter the result predictably")
    )

    XXH64_state_t.p(
        "64_createState",
        "64-bit version of #32_createState().",
        void()
    )

    XXH_errorcode(
        "64_freeState",
        "64-bit version of #32_freeState().",

        XXH64_state_t.p("statePtr", "the state to free")
    )

    void(
        "64_copyState",
        "",

        XXH64_state_t.p("dst_state", ""),
        XXH64_state_t.const.p("src_state", "")
    )

    XXH_errorcode(
        "64_reset",
        "64-bit version of #32_reset().",

        XXH64_state_t.p("statePtr", "the {@code XXH64_state_t} to reset"),
        unsigned_long_long("seed", "the seed that can be used to alter the hashing result predictably")
    )

    XXH_errorcode(
        "64_update",
        "64-bit version of #32_update().",

        XXH64_state_t.p("statePtr", "the {@code XXH64_state_t} to use"),
        XXH32["input"],
        XXH32["length"]
    )

    XXH64_hash_t(
        "64_digest",
        "64-bit version of #32_digest().",

        XXH64_state_t.const.p("statePtr", "the {@code XXH64_state_t} to use")
    )

    void(
        "64_canonicalFromHash",
        "64-bit version of #32_canonicalFromHash().",

        XXH64_canonical_t.p("dst", "the destination canonical representation"),
        XXH64_hash_t("hash", "the source hash")
    )

    XXH64_hash_t(
        "64_hashFromCanonical",
        "64-bit version of #32_hashFromCanonical().",

        XXH64_canonical_t.const.p("src", "the source canonical representation")
    )

    XXH128_hash_t(
        "128",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        unsigned_long_long("seed", "")
    )

    XXH64_hash_t(
        "3_64bits",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", "")
    )

    XXH64_hash_t(
        "3_64bits_withSeed",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        unsigned_long_long("seed", "")
    )

    XXH128_hash_t(
        "3_128bits",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", "")
    )

    XXH128_hash_t(
        "3_128bits_withSeed",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        unsigned_long_long("seed", "")
    )
}