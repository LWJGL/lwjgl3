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
#include "lwjgl_malloc.h"
#if defined(LWJGL_arm64) || defined(LWJGL_arm32)
    #define XXH_INLINE_ALL
    #include "xxhash.h"
#else
    #include "xxh_x86dispatch.c"
    #include "xxh_x86dispatch.h"
#endif
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to ${url("https://github.com/Cyan4973/xxHash", "xxhash")}.

        xxHash is an extremely fast Hash algorithm, running at RAM speed limits. It also successfully passes all tests from the SMHasher suite.

        A 64-bit version, named XXH64, is available since r35. It offers much better speed, but for 64-bit applications only.
        
        <h3>Streaming</h3>

        Streaming functions generate the xxHash value from an incremental input. This method is slower than single-call functions, due to state management. For
        small inputs, prefer #32() and #64(), which are better optimized.

        XXH state must first be allocated, using #32_createState().

        Start a new hash by initializing state with a seed, using #32_reset().

        Then, feed the hash state by calling #32_update() as many times as necessary. Obviously, input must be allocated and read accessible. The function
        returns an error code, with 0 meaning OK, and any other value meaning there is an error.

        Finally, a hash value can be produced anytime, by using #32_digest(). This function returns the 32-bits hash as an int.

        It's still possible to continue inserting input into the hash state after a digest, and generate some new hash values later on, by calling again
        #32_digest().

        When done, release the state, using #32_freeState().
        
        Example code for incrementally hashing a file:
        ${codeBlock("""
\#include <stdio.h>
\#include <xxhash.h>
\#define BUFFER_SIZE 256

// Note: XXH64 and XXH3 use the same interface.
XXH32_hash_t
hashFile(FILE* stream)
{
    XXH32_state_t* state;
    unsigned char buf[BUFFER_SIZE];
    size_t amt;
    XXH32_hash_t hash;

    state = XXH32_createState();       // Create a state
    assert(state != NULL);             // Error check here
    XXH32_reset(state, 0xbaad5eed);    // Reset state with our seed
    while ((amt = fread(buf, 1, sizeof(buf), stream)) != 0) {
        XXH32_update(state, buf, amt); // Hash the file in chunks
    }
    hash = XXH32_digest(state);        // Finalize the hash
    XXH32_freeState(state);            // Clean up
    return hash;
}""")}

        <h3>Canonical representation</h3>

        The default return values from XXH functions are unsigned 32 and 64 bit integers. This the simplest and fastest format for further post-processing.

        However, this leaves open the question of what is the order on the byte level, since little and big endian conventions will store the same number
        differently.

        The canonical representation settles this issue by mandating big-endian convention, the same convention as human-readable numbers (large digits first).

        When writing hash values to storage, sending them over a network, or printing them, it's highly recommended to use the canonical representation to
        ensure portability across a wider range of systems, present and future.

        <h3>XXH3</h3>

        XXH3 is a more recent hash algorithm featuring:
        ${ul(
            "Improved speed for both small and large inputs",
            "True 64-bit and 128-bit outputs",
            "SIMD acceleration",
            "Improved 32-bit viability"
        )}

        Speed analysis methodology is explained here:

        ${url("https://fastcompression.blogspot.com/2019/03/presenting-xxh3.html")}

        Compared to XXH64, expect XXH3 to run approximately ~2x faster on large inputs and &gt;3x faster on small ones, exact differences vary depending on
        platform.

        XXH3's speed benefits greatly from SIMD and 64-bit arithmetic, but does not require it. Any 32-bit and 64-bit targets that can run XXH32 smoothly can
        run XXH3 at competitive speeds, even without vector support. Further details are explained in the implementation.

        Optimized implementations are provided for AVX512, AVX2, SSE2, NEON, POWER8, ZVector and scalar targets. This can be controlled via the XXH_VECTOR
        macro.
        
        XXH3 implementation is portable:
        ${ul(
            "it has a generic C90 formulation that can be compiled on any platform,",
            "all implementations generage exactly the same hash value on all platforms.",
            "Starting from v0.8.0, it's also labelled \"stable\", meaning that any future version will also generate the same hash value."
        )}

        XXH3 offers 2 variants, {@code _64bits} and {@code _128bits}. When only 64 bits are needed, prefer invoking the {@code _64bits} variant, as it reduces
        the amount of mixing, resulting in faster speed on small inputs. It's also generally simpler to manipulate a scalar return type than a struct.

        The API supports one-shot hashing, streaming mode, and custom secrets.
        
        <h3>*_withSecretandSeed()</h3>

        These variants generate hash values using either {@code seed} for "short" keys (&lt; {@code XXH3_MIDSIZE_MAX = 240 bytes}) or {@code secret} for
        "large" keys (&ge; {@code XXH3_MIDSIZE_MAX}).

        This generally benefits speed, compared to {@code _withSeed()} or {@code _withSecret()}. {@code _withSeed()} has to generate the secret on the fly for
        "large" keys. It's fast, but can be perceptible for "not so large" keys (&lt; 1 KB). {@code _withSecret()} has to generate the masks on the fly for
        "small" keys, which requires more instructions than {@code _withSeed()} variants. Therefore, {@code _withSecretandSeed} variant combines the best of
        both worlds.

        When {@code secret} has been generated by #3_generateSecret_fromSeed(), this variant produces <b>exactly</b> the same results as {@code _withSeed()`}
        variant, hence offering only a pure speed benefit on "large" input, by skipping the need to regenerate the secret for every large input.

        Another usage scenario is to hash the secret to a 64-bit hash value, for example with #3_64bits(), which then becomes the seed, and then employ both
        the seed and the secret in {@code _withSecretandSeed()}. On top of speed, an added benefit is that each bit in the secret has a 50% chance to swap each
        bit in the output, via its impact to the seed. This is not guaranteed when using the secret directly in "small data" scenarios, because only portions
        of the secret are employed for small data.
        """

    EnumConstant(
        "Error codes.",

        "OK".enum,
        "ERROR".enum
    )

    IntConstant("The major version number.", "VERSION_MAJOR".."0")
    IntConstant("The minor version number.", "VERSION_MINOR".."8")
    IntConstant("The release version number.", "VERSION_RELEASE".."1")

    IntConstant(
        "The version number",
        "VERSION_NUMBER".."(XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE)"
    )

    IntConstant("The bare minimum size for a custom secret.", "XXH3_SECRET_SIZE_MIN"..136).noPrefix()
    IntConstant(
        """
        The size of the internal XXH3 buffer.

        This is the optimal update size for incremental hashing.
        """,

        "XXH3_INTERNALBUFFER_SIZE".."256"
    ).noPrefix()
    IntConstant(
        """
        Default size of the secret buffer (and {@code XXH3_kSecret}).

        This is the size used in {@code XXH3_kSecret} and the seeded functions.

        Not to be confused with #XXH3_SECRET_SIZE_MIN.
        """,
        "XXH3_SECRET_DEFAULT_SIZE".."192"
    ).noPrefix()

    // 32-bits hash

    val XXH32 = XXH32_hash_t(
        "32",
        """
        Calculates the 32-bit hash of {@code input} using xxHash32.

        Speed on Core 2 Duo @ 3 GHz (single thread, SMHasher benchmark): 5.4 GB/s

        The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
        {@code input} may be #NULL.
        """,

        nullable..void.const.p("input", "the block of data to be hashed, at least {@code length} bytes in size"),
        AutoSize("input")..size_t("length", "the length of {@code input}, in bytes"),
        XXH32_hash_t("seed", "the 32-bit seed to alter the hash's output predictably"),

        returnDoc = "the calculated 32-bit hash value"
    )

    XXH32_state_t.p(
        "32_createState",
        """
        Allocates an {@code XXH32_state_t}.
 
        Must be freed with #32_freeState().

        <b>LWJGL note</b>: This function delegates to the memory allocator configured by LWJGL.
        """,
        void(),

        returnDoc = "an allocated {@code XXH32_state_t} on success, #NULL on failure"
    )

    XXH_errorcode(
        "32_freeState",
        """
        Frees an {@code XXH32_state_t}.

        Must be allocated with #32_createState().
        """,

        XXH32_state_t.p("statePtr", "the state to free")
    )

    void(
        "32_copyState",
        """
        Copies one {@code XXH32_state_t} to another.
        
        {@code dst_state} and {@code src_state} must not be #NULL and must not overlap.
        """,

        XXH32_state_t.p("dst_state", "the state to copy to"),
        XXH32_state_t.const.p("src_state", "the state to copy from")
    )

    XXH_errorcode(
        "32_reset",
        """
        Resets an {@code XXH32_state_t} to begin a new hash.

        This function resets and seeds a state. Call it before #32_update().
        """,

        XXH32_state_t.p("statePtr", "the state struct to reset"),
        XXH32_hash_t("seed", "the 32-bit seed to alter the hash result predictably"),

        returnDoc = "#OK on success, #ERROR on failure"
    )

    XXH_errorcode(
        "32_update",
        """
        Consumes a block of {@code input} to an {@code XXH32_state_t}.

        Call this to incrementally consume blocks of data.
        
        The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
        {@code input} may be #NULL.
        """,

        XXH32_state_t.p("statePtr", "the state struct to update"),
        XXH32["input"],
        XXH32["length"],

        returnDoc = "#OK on success, #ERROR on failure"
    )

    XXH32_hash_t(
        "32_digest",
        """
        Returns the calculated hash value from an {@code XXH32_state_t}.
        
        Calling {@code XXH32_digest()} will not affect {@code statePtr}, so you can update, digest, and update again.
        """,

        XXH32_state_t.const.p("statePtr", "the state struct to calculate the hash from"),

        returnDoc = "the calculated xxHash32 value from that state"
    )

    void(
        "32_canonicalFromHash",
        "Converts an {@code XXH32_hash_t} to a big endian {@code XXH32_canonical_t}.",

        XXH32_canonical_t.p("dst", "the {@code XXH32_canonical_t} pointer to be stored to."),
        XXH32_hash_t("hash", "the {@code XXH32_hash_t} to be converted")
    )

    XXH32_hash_t(
        "32_hashFromCanonical",
        "Converts an {@code XXH32_canonical_t} to a native {@code XXH32_hash_t}.",

        XXH32_canonical_t.const.p("src", "the {@code XXH32_canonical_t} to convert")
    )

    // 64-bits hash

    XXH64_hash_t(
        "64",
        """
        Calculates the 64-bit hash of {@code input} using xxHash64.

        This function usually runs faster on 64-bit systems, but slower on 32-bit systems.
        
        The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
        {@code input} may be #NULL.
        """,

        XXH32["input"],
        XXH32["length"],
        XXH64_hash_t("seed", "the 64-bit seed to alter the hash's output predictably"),

        returnDoc = "the calculated 64-bit hash"
    )

    XXH64_state_t.p(
        "64_createState",
        """
        Allocates an {@code XXH64_state_t}.
 
        Must be freed with #64_freeState().

        <b>LWJGL note</b>: This function delegates to the memory allocator configured by LWJGL.
        """,
        void(),

        returnDoc = "an allocated {@code XXH64_state_t} on success, #NULL on failure"
    )

    XXH_errorcode(
        "64_freeState",
        """
        Frees an {@code XXH64_state_t}.

        Must be allocated with #64_createState().
        """,

        XXH64_state_t.p("statePtr", "the state to free")
    )

    void(
        "64_copyState",
        """
        Copies one {@code XXH64_state_t} to another.
        
        {@code dst_state} and {@code src_state} must not be #NULL and must not overlap.
        """,

        XXH64_state_t.p("dst_state", "the state to copy to"),
        XXH64_state_t.const.p("src_state", "the state to copy from")
    )

    XXH_errorcode(
        "64_reset",
        """
        Resets an {@code XXH64_state_t} to begin a new hash.

        This function resets and seeds a state. Call it before #64_update().
        """,

        XXH64_state_t.p("statePtr", "the state struct to reset"),
        XXH64_hash_t("seed", "the 64-bit seed to alter the hash result predictably")
    )

    XXH_errorcode(
        "64_update",
        """
        Consumes a block of {@code input} to an {@code XXH64_state_t}.

        Call this to incrementally consume blocks of data.
        
        The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
        {@code input} may be #NULL.
        """,

        XXH64_state_t.p("statePtr", "the state struct to update"),
        XXH32["input"],
        XXH32["length"]
    )

    XXH64_hash_t(
        "64_digest",
        """
        Returns the calculated hash value from an {@code XXH64_state_t}.
        
        Calling {@code XXH64_digest()} will not affect {@code statePtr}, so you can update, digest, and update again.
        """,

        XXH64_state_t.const.p("statePtr", "the state struct to calculate the hash from"),

        returnDoc = "the calculated xxHash64 value from that state"
    )

    void(
        "64_canonicalFromHash",
        "Converts an {@code XXH64_hash_t} to a big endian {@code XXH64_canonical_t}.",

        XXH64_canonical_t.p("dst", "the {@code XXH64_canonical_t} pointer to be stored to."),
        XXH64_hash_t("hash", "the {@code XXH64_hash_t} to be converted")
    )

    XXH64_hash_t(
        "64_hashFromCanonical",
        "Converts an {@code XXH64_canonical_t} to a native {@code XXH64_hash_t}.",

        XXH64_canonical_t.const.p("src", "the {@code XXH64_canonical_t} to convert")
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
        "3_64bits_withSeed",
        """
        This variant generates on the fly a custom secret, based on the default secret, altered using the {@code seed} value.

        While this operation is decently fast, note that it's not completely free. Note {@code seed==0} produces same results as #3_64bits().
        """,

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        XXH64_hash_t("seed", "")
    )

    XXH64_hash_t(
        "3_64bits_withSecret",
        """
        It's possible to provide any blob of bytes as a "secret" to generate the hash. This makes it more difficult for an external actor to prepare an
        intentional collision. The main condition is that {@code secretSize} <b>must</b> be large enough (&ge; #XXH3_SECRET_SIZE_MIN).

        However, the quality of the secret impacts the dispersion of the hash algorithm. Therefore, the secret <b>must</b> look like a bunch of random bytes.
        Avoid "trivial" or structured data such as repeated sequences or a text document. Whenever in doubt about the "randomness" of the blob of bytes,
        consider employing #3_generateSecret() instead. It will generate a proper high entropy secret derived from the blob of bytes. Another advantage of
        using {@code XXH3_generateSecret()} is that it guarantees that all bits within the initial blob of bytes will impact every bit of the output. This is
        not necessarily the case when using the blob of bytes directly because, when hashing <b>small</b> inputs, only a portion of the secret is employed.
        """,

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", "")
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
        
        Similar to one-shot API, {@code secretSize} must be &ge; #XXH3_SECRET_SIZE_MIN, and the quality of produced hash values depends on secret's entrop
        (secret's content should look like a bunch of random bytes). When in doubt about the randomness of a candidate {@code secret}, consider employing
        #3_generateSecret() instead (see below).
        """,

        XXH3_state_t.p("statePtr", ""),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
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
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
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
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
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
        "This comparator is compatible with stdlib's {@code qsort()/bsearch()}.",

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

    void(
        "3_INITSTATE",
        """
        Initializes a stack-allocated {@code XXH3_state_t}.

        When the {@code XXH3_state_t} structure is merely emplaced on stack, it should be initialized with {@code XXH3_INITSTATE()} or a {@code memset()} in
        case its first reset uses {@code XXH3_NNbits_reset_withSeed()}. This init can be omitted if the first reset uses default or {@code _withSecret} mode.
        This operation isn't necessary when the state is created with #3_createState().
        
        Note that this doesn't prepare the state for a streaming operation, it's still necessary to use {@code XXH3_NNbits_reset*()} afterwards.
        """,

        XXH3_state_t.p("statePtr", "")
    )

    XXH128_hash_t(
        "128",
        "Simple alias to pre-selected {@code XXH3_128bits} variant.",

        void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        XXH64_hash_t("seed", "")
    )

    XXH_errorcode(
        "3_generateSecret",
        """
        Derives a high-entropy secret from any user-defined content, named {@code customSeed}.

        The generated secret can be used in combination with {@code *_withSecret()} functions.  The {@code _withSecret()} variants are useful to provide a
        higher level of protection than 64-bit seed, as it becomes much more difficult for an external actor to guess how to impact the calculation logic.

        The function accepts as input a custom seed of any length and any content, and derives from it a high-entropy secret of length {@code secretSize} into
        an already allocated buffer {@code secretBuffer}. {@code secretSize} must be &ge; #XXH3_SECRET_SIZE_MIN.

        The generated secret can then be used with any {@code *_withSecret()} variant. Functions #3_128bits_withSecret(), #3_64bits_withSecret(),
        #3_128bits_reset_withSecret() and #3_64bits_reset_withSecret() are part of this list. They all accept a {@code secret} parameter which must be large
        enough for implementation reasons (&ge; #XXH3_SECRET_SIZE_MIN) <i>and</i> feature very high entropy (consist of random-looking bytes). These conditions can
        be a high bar to meet, so {@code XXH3_generateSecret()} can be employed to ensure proper quality.
 
        {@code customSeed} can be anything. It can have any size, even small ones, and its content can be anything, even "poor entropy" sources such as a bunch
        of zeroes. The resulting {@code secret} will nonetheless provide all required qualities.
 
        When {@code customSeedSize} &gt; 0, supplying #NULL as {@code customSeed} is undefined behavior.
        """,

        Check("XXH3_SECRET_SIZE_MIN")..void.p("secretBuffer", ""),
        AutoSize("secretBuffer")..size_t("secretSize", ""),
        nullable..void.const.p("customSeed", ""),
        AutoSize("customSeed")..size_t("customSeedSize", "")
    )

    void(
        "3_generateSecret_fromSeed",
        """
        Generate the same secret as the {@code _withSeed()} variants.

        The resulting secret has a length of #XXH3_SECRET_DEFAULT_SIZE (necessarily). {@code secretBuffer} must be already allocated, of size at least
        {@code XXH3_SECRET_DEFAULT_SIZE} bytes.

        The generated secret can be used in combination with {@code *_withSecret()} and {@code _withSecretandSeed()} variants. This generator is notably useful
        in combination with {@code _withSecretandSeed()}, as a way to emulate a faster {@code _withSeed()} variant.
        """,

        Check("XXH3_SECRET_DEFAULT_SIZE")..void.p("secretBuffer", ""),
        XXH64_hash_t("seed", "")
    )

    XXH64_hash_t(
        "3_64bits_withSecretandSeed",
        "",

        nullable..void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", ""),
        XXH64_hash_t("seed", "")
    )

    XXH128_hash_t(
        "3_128bits_withSecretandSeed",
        "",

        nullable..void.const.p("data", ""),
        AutoSize("data")..size_t("len", ""),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", ""),
        XXH64_hash_t("seed", "")
    )

    XXH_errorcode(
        "3_64bits_reset_withSecretandSeed",
        "",

        XXH3_state_t.p("statePtr", ""),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", ""),
        XXH64_hash_t("seed64", "")
    )

    XXH_errorcode(
        "3_128bits_reset_withSecretandSeed",
        "",

        XXH3_state_t.p("statePtr", ""),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret", ""),
        AutoSize("secret")..size_t("secretSize", ""),
        XXH64_hash_t("seed64", "")
    )
}