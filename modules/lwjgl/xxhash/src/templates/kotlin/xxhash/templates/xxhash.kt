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

        XXH3 is a new hash algorithm, featuring improved speed performance for both small and large inputs. See full speed analysis at:
        <a href="http://fastcompression.blogspot.com/2019/03/presenting-xxh3.html">Presenting XXH3</a>
        
        In general, expect XXH3 to run about ~2x faster on large inputs, and &gt;3x faster on small ones, though exact differences depend on platform.
 
        The algorithm is portable, will generate the same hash on all platforms. It benefits greatly from vectorization units, but does not require it.

        XXH3 offers 2 variants, {@code _64bits} and {@code _128bits}. When only 64 bits are needed, prefer calling the {@code _64bits} variant: it reduces the
        amount of mixing, resulting in faster speed on small inputs. It's also generally simpler to manipulate a scalar return type than a struct.

        The XXH3 algorithm is still considered experimental. Produced results can still change between versions. Results produced by v0.7.x are not comparable
        with results from v0.7.y. It's nonetheless possible to use XXH3 for ephemeral data (local sessions), but avoid storing values in long-term storage for
        later reads.

        The API supports one-shot hashing, streaming mode, and custom secrets.
        """

    EnumConstant(
        "Error codes.",

        "OK".enum,
        "ERROR".enum
    )

    IntConstant("The major version number.", "VERSION_MAJOR".."0")
    IntConstant("The minor version number.", "VERSION_MINOR".."7")
    IntConstant("The release version number.", "VERSION_RELEASE".."2")

    IntConstant(
        "The version number",
        "VERSION_NUMBER".."(XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE)"
    )

    IntConstant(
        "",
        "3_SECRET_SIZE_MIN"..136
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
        XXH32_hash_t("seed", "the seed that can be used to alter the result predictably")
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
        XXH32_hash_t("seed", "the seed that can be used to alter the hashing result predictably")
    )

    XXH_errorcode(
        "32_update",
        """
        Streaming functions generate the xxHash value from an incrememtal input. This method is slower than single-call functions, due to state management. For
        small inputs, prefer #32().

        XXH state must first be allocated, using #32_createState().

        Start a new hash by initializing state with a seed, using #32_reset().

        Then, feed the hash state by calling #32_update() as many times as necessary. Obviously, input must be allocated and read accessible. The function
        returns an error code, with 0 meaning OK, and any other value meaning there is an error.

        Finally, a hash value can be produced anytime, by using #32_digest(). This function returns the 32-bits hash as an int.

        It's still possible to continue inserting input into the hash state after a digest, and generate some new hash values later on, by calling again
        #32_digest().

        When done, release the state, using #32_freeState().
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
        Default return values from XXH functions are basic unsigned 32 and 64 bits. This the simplest and fastest format for further post-processing. However,
        this leaves open the question of what is the order of bytes, since little and big endian conventions will write the same number differently.

        The canonical representation settles this issue, by mandating big-endian convention, aka, the same convention as human-readable numbers (large digits
        first). When writing hash values to storage, sending them over a network, or printing them, it's highly recommended to use the canonical
        representation, to ensure portability across a wider range of systems, present and future.

        The following functions allow transformation of hash values into and from canonical format.
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
        XXH64_hash_t("seed", "the seed that can be used to alter the result predictably")
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
        XXH64_hash_t("seed", "the seed that can be used to alter the hashing result predictably")
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

    XXH64_hash_t(
        "3_64bits",
        """
        Default 64-bit variant, using default secret and default seed of 0.

        It's the fastest variant.
        """,

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", "")
    )

    XXH64_hash_t(
        "3_64bits_withSecret",
        """
        It's possible to provide any blob of bytes as a "secret" to generate the hash. This makes it more difficult for an external actor to prepare an
        intentional collision.

        The secret <b>must</b> be large enough (&ge; #3_SECRET_SIZE_MIN). It should consist of random bytes. Avoid repeating same character, or sequences of
        bytes, and especially avoid swathes of {@code \0}. Failure to respect these conditions will result in a poor quality hash.
        """,

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", "")
    )

    XXH64_hash_t(
        "3_64bits_withSeed",
        """
        This variant generates on the fly a custom secret, based on the default secret, altered using the {@code seed} value.

        While this operation is decently fast, note that it's not completely free. Note {@code seed==0} produces same results as #3_64bits().
        """,

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        XXH64_hash_t("seed", "")
    )

    XXH3_state_t.p(
        "3_createState",
        "",

        void()
    )

    XXH_errorcode(
        "3_freeState",
        "",

        XXH3_state_t.p("statePtr", "")
    )

    void(
        "3_copyState",
        "",

        XXH3_state_t.p("dst_state", ""),
        XXH3_state_t.const.p("srct_state", "")
    )

    XXH_errorcode(
        "3_64bits_reset",
        """
        Initialize with default parameters.
        
        Result will be equivalent to #3_64bits().
        """,

        XXH3_state_t.p("statePtr", "")
    )

    XXH_errorcode(
        "3_64bits_reset_withSeed",
        """
        Generate a custom secret from {@code seed}, and store it into {@code state}.
        
        Digest will be equivalent to #3_64bits_withSeed().
        """,

        XXH3_state_t.p("statePtr", ""),
        XXH64_hash_t("seed", "")
    )

    XXH_errorcode(
        "3_64bits_reset_withSecret",
        """
        {@code secret} is referenced, and must outlive the hash streaming session.
        
        {@code secretSize} must be &ge; #3_SECRET_SIZE_MIN.
        """,

        XXH3_state_t.p("statePtr", ""),
        void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", "")
    )

    XXH_errorcode(
        "3_64bits_update",
        "",

        XXH3_state_t.p("statePtr", ""),
        void.const.p("input", ""),
        AutoSize("input")..size_t("length", "")
    )

    XXH64_hash_t(
        "3_64bits_digest",
        "",

        XXH3_state_t.const.p("statePtr", "")
    )

    XXH128_hash_t(
        "128",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        XXH64_hash_t("seed", "")
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
        XXH64_hash_t("seed", "")
    )

    XXH128_hash_t(
        "3_128bits_withSecret",
        "",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", "")
    )

    XXH_errorcode(
        "3_128bits_reset",
        "",

        XXH3_state_t.p("statePtr", "")
    )

    XXH_errorcode(
        "3_128bits_reset_withSeed",
        "",

        XXH3_state_t.p("statePtr", ""),
        XXH64_hash_t("seed", "")
    )

    XXH_errorcode(
        "3_128bits_reset_withSecret",
        "",

        XXH3_state_t.p("statePtr", ""),
        void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", "")
    )

    XXH_errorcode(
        "3_128bits_update",
        "",

        XXH3_state_t.p("statePtr", ""),
        void.const.p("input", ""),
        AutoSize("input")..size_t("length", "")
    )

    XXH128_hash_t(
        "3_128bits_digest",
        "",

        XXH3_state_t.const.p("statePtr", "")
    )

    intb(
        "128_isEqual",
        "Returns 1 if equal, 0 if different.",

        XXH128_hash_t("h1", ""),
        XXH128_hash_t("h2", "")
    )

    int(
        "128_cmp",
        "This comparator is compatible with stdlib's {@code qsort()}.",

        Check("XXH128Hash.SIZEOF")..void.const.p("h128_1", ""),
        Check("XXH128Hash.SIZEOF")..void.const.p("h128_2", "")
    )

    void(
        "128_canonicalFromHash",
        "",

        XXH128_canonical_t.p("dst", ""),
        XXH128_hash_t("hash", "")
    )

    XXH128_hash_t(
        "128_hashFromCanonical",
        "",

        XXH128_canonical_t.const.p("src", "")
    )
}