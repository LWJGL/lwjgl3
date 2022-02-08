/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a target="_blank" href="https://github.com/Cyan4973/xxHash">xxhash</a>.
 * 
 * <p>xxHash is an extremely fast Hash algorithm, running at RAM speed limits. It also successfully passes all tests from the SMHasher suite.</p>
 * 
 * <p>A 64-bit version, named XXH64, is available since r35. It offers much better speed, but for 64-bit applications only.</p>
 * 
 * <h3>Streaming</h3>
 * 
 * <p>Streaming functions generate the xxHash value from an incremental input. This method is slower than single-call functions, due to state management. For
 * small inputs, prefer {@link #XXH32 32} and {@link #XXH64 64}, which are better optimized.</p>
 * 
 * <p>XXH state must first be allocated, using {@link #XXH32_createState 32_createState}.</p>
 * 
 * <p>Start a new hash by initializing state with a seed, using {@link #XXH32_reset 32_reset}.</p>
 * 
 * <p>Then, feed the hash state by calling {@link #XXH32_update 32_update} as many times as necessary. Obviously, input must be allocated and read accessible. The function
 * returns an error code, with 0 meaning OK, and any other value meaning there is an error.</p>
 * 
 * <p>Finally, a hash value can be produced anytime, by using {@link #XXH32_digest 32_digest}. This function returns the 32-bits hash as an int.</p>
 * 
 * <p>It's still possible to continue inserting input into the hash state after a digest, and generate some new hash values later on, by calling again
 * {@link #XXH32_digest 32_digest}.</p>
 * 
 * <p>When done, release the state, using {@link #XXH32_freeState 32_freeState}.</p>
 * 
 * <p>Example code for incrementally hashing a file:</p>
 * 
 * <pre><code>
 * #include &lt;stdio.h&gt;
 * #include &lt;xxhash.h&gt;
 * #define BUFFER_SIZE 256
 * 
 * // Note: XXH64 and XXH3 use the same interface.
 * XXH32_hash_t
 * hashFile(FILE* stream)
 * {
 *     XXH32_state_t* state;
 *     unsigned char buf[BUFFER_SIZE];
 *     size_t amt;
 *     XXH32_hash_t hash;
 * 
 *     state = XXH32_createState();       // Create a state
 *     assert(state != NULL);             // Error check here
 *     XXH32_reset(state, 0xbaad5eed);    // Reset state with our seed
 *     while ((amt = fread(buf, 1, sizeof(buf), stream)) != 0) {
 *         XXH32_update(state, buf, amt); // Hash the file in chunks
 *     }
 *     hash = XXH32_digest(state);        // Finalize the hash
 *     XXH32_freeState(state);            // Clean up
 *     return hash;
 * }</code></pre>
 * 
 * <h3>Canonical representation</h3>
 * 
 * <p>The default return values from XXH functions are unsigned 32 and 64 bit integers. This the simplest and fastest format for further post-processing.</p>
 * 
 * <p>However, this leaves open the question of what is the order on the byte level, since little and big endian conventions will store the same number
 * differently.</p>
 * 
 * <p>The canonical representation settles this issue by mandating big-endian convention, the same convention as human-readable numbers (large digits first).</p>
 * 
 * <p>When writing hash values to storage, sending them over a network, or printing them, it's highly recommended to use the canonical representation to
 * ensure portability across a wider range of systems, present and future.</p>
 * 
 * <h3>XXH3</h3>
 * 
 * <p>XXH3 is a more recent hash algorithm featuring:</p>
 * 
 * <ul>
 * <li>Improved speed for both small and large inputs</li>
 * <li>True 64-bit and 128-bit outputs</li>
 * <li>SIMD acceleration</li>
 * <li>Improved 32-bit viability</li>
 * </ul>
 * 
 * <p>Speed analysis methodology is explained here:</p>
 * 
 * <p><a target="_blank" href="https://fastcompression.blogspot.com/2019/03/presenting-xxh3.html">https://fastcompression.blogspot.com/2019/03/presenting-xxh3.html</a></p>
 * 
 * <p>Compared to XXH64, expect XXH3 to run approximately ~2x faster on large inputs and &gt;3x faster on small ones, exact differences vary depending on
 * platform.</p>
 * 
 * <p>XXH3's speed benefits greatly from SIMD and 64-bit arithmetic, but does not require it. Any 32-bit and 64-bit targets that can run XXH32 smoothly can
 * run XXH3 at competitive speeds, even without vector support. Further details are explained in the implementation.</p>
 * 
 * <p>Optimized implementations are provided for AVX512, AVX2, SSE2, NEON, POWER8, ZVector and scalar targets. This can be controlled via the XXH_VECTOR
 * macro.</p>
 * 
 * <p>XXH3 implementation is portable:</p>
 * 
 * <ul>
 * <li>it has a generic C90 formulation that can be compiled on any platform,</li>
 * <li>all implementations generage exactly the same hash value on all platforms.</li>
 * <li>Starting from v0.8.0, it's also labelled "stable", meaning that any future version will also generate the same hash value.</li>
 * </ul>
 * 
 * <p>XXH3 offers 2 variants, {@code _64bits} and {@code _128bits}. When only 64 bits are needed, prefer invoking the {@code _64bits} variant, as it reduces
 * the amount of mixing, resulting in faster speed on small inputs. It's also generally simpler to manipulate a scalar return type than a struct.</p>
 * 
 * <p>The API supports one-shot hashing, streaming mode, and custom secrets.</p>
 * 
 * <h3>*_withSecretandSeed()</h3>
 * 
 * <p>These variants generate hash values using either {@code seed} for "short" keys (&lt; {@code XXH3_MIDSIZE_MAX = 240 bytes}) or {@code secret} for
 * "large" keys (&ge; {@code XXH3_MIDSIZE_MAX}).</p>
 * 
 * <p>This generally benefits speed, compared to {@code _withSeed()} or {@code _withSecret()}. {@code _withSeed()} has to generate the secret on the fly for
 * "large" keys. It's fast, but can be perceptible for "not so large" keys (&lt; 1 KB). {@code _withSecret()} has to generate the masks on the fly for
 * "small" keys, which requires more instructions than {@code _withSeed()} variants. Therefore, {@code _withSecretandSeed} variant combines the best of
 * both worlds.</p>
 * 
 * <p>When {@code secret} has been generated by {@link #XXH3_generateSecret_fromSeed 3_generateSecret_fromSeed}, this variant produces <b>exactly</b> the same results as {@code _withSeed()`}
 * variant, hence offering only a pure speed benefit on "large" input, by skipping the need to regenerate the secret for every large input.</p>
 * 
 * <p>Another usage scenario is to hash the secret to a 64-bit hash value, for example with {@link #XXH3_64bits 3_64bits}, which then becomes the seed, and then employ both
 * the seed and the secret in {@code _withSecretandSeed()}. On top of speed, an added benefit is that each bit in the secret has a 50% chance to swap each
 * bit in the output, via its impact to the seed. This is not guaranteed when using the secret directly in "small data" scenarios, because only portions
 * of the secret are employed for small data.</p>
 */
public class XXHash {

    static { LibXXHash.initialize(); }

    /**
     * Error codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XXH_OK OK}</li>
     * <li>{@link #XXH_ERROR ERROR}</li>
     * </ul>
     */
    public static final int
        XXH_OK    = 0,
        XXH_ERROR = 1;

    /** The major version number. */
    public static final int XXH_VERSION_MAJOR = 0;

    /** The minor version number. */
    public static final int XXH_VERSION_MINOR = 8;

    /** The release version number. */
    public static final int XXH_VERSION_RELEASE = 1;

    /** The version number */
    public static final int XXH_VERSION_NUMBER = (XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE);

    /** The bare minimum size for a custom secret. */
    public static final int XXH3_SECRET_SIZE_MIN = 0x88;

    /**
     * The size of the internal XXH3 buffer.
     * 
     * <p>This is the optimal update size for incremental hashing.</p>
     */
    public static final int XXH3_INTERNALBUFFER_SIZE = 256;

    /**
     * Default size of the secret buffer (and {@code XXH3_kSecret}).
     * 
     * <p>This is the size used in {@code XXH3_kSecret} and the seeded functions.</p>
     * 
     * <p>Not to be confused with {@link #XXH3_SECRET_SIZE_MIN}.</p>
     */
    public static final int XXH3_SECRET_DEFAULT_SIZE = 192;

    protected XXHash() {
        throw new UnsupportedOperationException();
    }

    // --- [ XXH32 ] ---

    /**
     * Unsafe version of: {@link #XXH32}
     *
     * @param length the length of {@code input}, in bytes
     */
    public static native int nXXH32(long input, long length, int seed);

    /**
     * Calculates the 32-bit hash of {@code input} using xxHash32.
     * 
     * <p>Speed on Core 2 Duo @ 3 GHz (single thread, SMHasher benchmark): 5.4 GB/s</p>
     * 
     * <p>The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
     * {@code input} may be {@code NULL}.</p>
     *
     * @param input the block of data to be hashed, at least {@code length} bytes in size
     * @param seed  the 32-bit seed to alter the hash's output predictably
     *
     * @return the calculated 32-bit hash value
     */
    @NativeType("XXH32_hash_t")
    public static int XXH32(@Nullable @NativeType("void const *") ByteBuffer input, @NativeType("XXH32_hash_t") int seed) {
        return nXXH32(memAddressSafe(input), remainingSafe(input), seed);
    }

    // --- [ XXH32_createState ] ---

    /** Unsafe version of: {@link #XXH32_createState} */
    public static native long nXXH32_createState();

    /**
     * Allocates an {@code XXH32_state_t}.
     * 
     * <p>Must be freed with {@link #XXH32_freeState 32_freeState}.</p>
     * 
     * <p><b>LWJGL note</b>: This function delegates to the memory allocator configured by LWJGL.</p>
     *
     * @return an allocated {@code XXH32_state_t} on success, {@code NULL} on failure
     */
    @Nullable
    @NativeType("XXH32_state_t *")
    public static XXH32State XXH32_createState() {
        long __result = nXXH32_createState();
        return XXH32State.createSafe(__result);
    }

    // --- [ XXH32_freeState ] ---

    /** Unsafe version of: {@link #XXH32_freeState} */
    public static native int nXXH32_freeState(long statePtr);

    /**
     * Frees an {@code XXH32_state_t}.
     * 
     * <p>Must be allocated with {@link #XXH32_createState 32_createState}.</p>
     *
     * @param statePtr the state to free
     */
    @NativeType("XXH_errorcode")
    public static int XXH32_freeState(@NativeType("XXH32_state_t *") XXH32State statePtr) {
        return nXXH32_freeState(statePtr.address());
    }

    // --- [ XXH32_copyState ] ---

    /** Unsafe version of: {@link #XXH32_copyState} */
    public static native void nXXH32_copyState(long dst_state, long src_state);

    /**
     * Copies one {@code XXH32_state_t} to another.
     * 
     * <p>{@code dst_state} and {@code src_state} must not be {@code NULL} and must not overlap.</p>
     *
     * @param dst_state the state to copy to
     * @param src_state the state to copy from
     */
    public static void XXH32_copyState(@NativeType("XXH32_state_t *") XXH32State dst_state, @NativeType("XXH32_state_t const *") XXH32State src_state) {
        nXXH32_copyState(dst_state.address(), src_state.address());
    }

    // --- [ XXH32_reset ] ---

    /** Unsafe version of: {@link #XXH32_reset} */
    public static native int nXXH32_reset(long statePtr, int seed);

    /**
     * Resets an {@code XXH32_state_t} to begin a new hash.
     * 
     * <p>This function resets and seeds a state. Call it before {@link #XXH32_update 32_update}.</p>
     *
     * @param statePtr the state struct to reset
     * @param seed     the 32-bit seed to alter the hash result predictably
     *
     * @return {@link #XXH_OK OK} on success, {@link #XXH_ERROR ERROR} on failure
     */
    @NativeType("XXH_errorcode")
    public static int XXH32_reset(@NativeType("XXH32_state_t *") XXH32State statePtr, @NativeType("XXH32_hash_t") int seed) {
        return nXXH32_reset(statePtr.address(), seed);
    }

    // --- [ XXH32_update ] ---

    /**
     * Unsafe version of: {@link #XXH32_update}
     *
     * @param length the length of {@code input}, in bytes
     */
    public static native int nXXH32_update(long statePtr, long input, long length);

    /**
     * Consumes a block of {@code input} to an {@code XXH32_state_t}.
     * 
     * <p>Call this to incrementally consume blocks of data.</p>
     * 
     * <p>The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
     * {@code input} may be {@code NULL}.</p>
     *
     * @param statePtr the state struct to update
     * @param input    the block of data to be hashed, at least {@code length} bytes in size
     *
     * @return {@link #XXH_OK OK} on success, {@link #XXH_ERROR ERROR} on failure
     */
    @NativeType("XXH_errorcode")
    public static int XXH32_update(@NativeType("XXH32_state_t *") XXH32State statePtr, @Nullable @NativeType("void const *") ByteBuffer input) {
        return nXXH32_update(statePtr.address(), memAddressSafe(input), remainingSafe(input));
    }

    // --- [ XXH32_digest ] ---

    /** Unsafe version of: {@link #XXH32_digest} */
    public static native int nXXH32_digest(long statePtr);

    /**
     * Returns the calculated hash value from an {@code XXH32_state_t}.
     * 
     * <p>Calling {@code XXH32_digest()} will not affect {@code statePtr}, so you can update, digest, and update again.</p>
     *
     * @param statePtr the state struct to calculate the hash from
     *
     * @return the calculated xxHash32 value from that state
     */
    @NativeType("XXH32_hash_t")
    public static int XXH32_digest(@NativeType("XXH32_state_t const *") XXH32State statePtr) {
        return nXXH32_digest(statePtr.address());
    }

    // --- [ XXH32_canonicalFromHash ] ---

    /** Unsafe version of: {@link #XXH32_canonicalFromHash} */
    public static native void nXXH32_canonicalFromHash(long dst, int hash);

    /**
     * Converts an {@code XXH32_hash_t} to a big endian {@code XXH32_canonical_t}.
     *
     * @param dst  the {@code XXH32_canonical_t} pointer to be stored to.
     * @param hash the {@code XXH32_hash_t} to be converted
     */
    public static void XXH32_canonicalFromHash(@NativeType("XXH32_canonical_t *") XXH32Canonical dst, @NativeType("XXH32_hash_t") int hash) {
        nXXH32_canonicalFromHash(dst.address(), hash);
    }

    // --- [ XXH32_hashFromCanonical ] ---

    /** Unsafe version of: {@link #XXH32_hashFromCanonical} */
    public static native int nXXH32_hashFromCanonical(long src);

    /**
     * Converts an {@code XXH32_canonical_t} to a native {@code XXH32_hash_t}.
     *
     * @param src the {@code XXH32_canonical_t} to convert
     */
    @NativeType("XXH32_hash_t")
    public static int XXH32_hashFromCanonical(@NativeType("XXH32_canonical_t const *") XXH32Canonical src) {
        return nXXH32_hashFromCanonical(src.address());
    }

    // --- [ XXH64 ] ---

    /**
     * Unsafe version of: {@link #XXH64}
     *
     * @param length the length of {@code input}, in bytes
     */
    public static native long nXXH64(long input, long length, long seed);

    /**
     * Calculates the 64-bit hash of {@code input} using xxHash64.
     * 
     * <p>This function usually runs faster on 64-bit systems, but slower on 32-bit systems.</p>
     * 
     * <p>The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
     * {@code input} may be {@code NULL}.</p>
     *
     * @param input the block of data to be hashed, at least {@code length} bytes in size
     * @param seed  the 64-bit seed to alter the hash's output predictably
     *
     * @return the calculated 64-bit hash
     */
    @NativeType("XXH64_hash_t")
    public static long XXH64(@Nullable @NativeType("void const *") ByteBuffer input, @NativeType("XXH64_hash_t") long seed) {
        return nXXH64(memAddressSafe(input), remainingSafe(input), seed);
    }

    // --- [ XXH64_createState ] ---

    /** Unsafe version of: {@link #XXH64_createState} */
    public static native long nXXH64_createState();

    /**
     * Allocates an {@code XXH64_state_t}.
     * 
     * <p>Must be freed with {@link #XXH64_freeState 64_freeState}.</p>
     * 
     * <p><b>LWJGL note</b>: This function delegates to the memory allocator configured by LWJGL.</p>
     *
     * @return an allocated {@code XXH64_state_t} on success, {@code NULL} on failure
     */
    @Nullable
    @NativeType("XXH64_state_t *")
    public static XXH64State XXH64_createState() {
        long __result = nXXH64_createState();
        return XXH64State.createSafe(__result);
    }

    // --- [ XXH64_freeState ] ---

    /** Unsafe version of: {@link #XXH64_freeState} */
    public static native int nXXH64_freeState(long statePtr);

    /**
     * Frees an {@code XXH64_state_t}.
     * 
     * <p>Must be allocated with {@link #XXH64_createState 64_createState}.</p>
     *
     * @param statePtr the state to free
     */
    @NativeType("XXH_errorcode")
    public static int XXH64_freeState(@NativeType("XXH64_state_t *") XXH64State statePtr) {
        return nXXH64_freeState(statePtr.address());
    }

    // --- [ XXH64_copyState ] ---

    /** Unsafe version of: {@link #XXH64_copyState} */
    public static native void nXXH64_copyState(long dst_state, long src_state);

    /**
     * Copies one {@code XXH64_state_t} to another.
     * 
     * <p>{@code dst_state} and {@code src_state} must not be {@code NULL} and must not overlap.</p>
     *
     * @param dst_state the state to copy to
     * @param src_state the state to copy from
     */
    public static void XXH64_copyState(@NativeType("XXH64_state_t *") XXH64State dst_state, @NativeType("XXH64_state_t const *") XXH64State src_state) {
        nXXH64_copyState(dst_state.address(), src_state.address());
    }

    // --- [ XXH64_reset ] ---

    /** Unsafe version of: {@link #XXH64_reset} */
    public static native int nXXH64_reset(long statePtr, long seed);

    /**
     * Resets an {@code XXH64_state_t} to begin a new hash.
     * 
     * <p>This function resets and seeds a state. Call it before {@link #XXH64_update 64_update}.</p>
     *
     * @param statePtr the state struct to reset
     * @param seed     the 64-bit seed to alter the hash result predictably
     */
    @NativeType("XXH_errorcode")
    public static int XXH64_reset(@NativeType("XXH64_state_t *") XXH64State statePtr, @NativeType("XXH64_hash_t") long seed) {
        return nXXH64_reset(statePtr.address(), seed);
    }

    // --- [ XXH64_update ] ---

    /**
     * Unsafe version of: {@link #XXH64_update}
     *
     * @param length the length of {@code input}, in bytes
     */
    public static native int nXXH64_update(long statePtr, long input, long length);

    /**
     * Consumes a block of {@code input} to an {@code XXH64_state_t}.
     * 
     * <p>Call this to incrementally consume blocks of data.</p>
     * 
     * <p>The memory between {@code input} and {@code input + length} must be valid, readable, contiguous memory. However, if {@code length} is {@code 0},
     * {@code input} may be {@code NULL}.</p>
     *
     * @param statePtr the state struct to update
     * @param input    the block of data to be hashed, at least {@code length} bytes in size
     */
    @NativeType("XXH_errorcode")
    public static int XXH64_update(@NativeType("XXH64_state_t *") XXH64State statePtr, @Nullable @NativeType("void const *") ByteBuffer input) {
        return nXXH64_update(statePtr.address(), memAddressSafe(input), remainingSafe(input));
    }

    // --- [ XXH64_digest ] ---

    /** Unsafe version of: {@link #XXH64_digest} */
    public static native long nXXH64_digest(long statePtr);

    /**
     * Returns the calculated hash value from an {@code XXH64_state_t}.
     * 
     * <p>Calling {@code XXH64_digest()} will not affect {@code statePtr}, so you can update, digest, and update again.</p>
     *
     * @param statePtr the state struct to calculate the hash from
     *
     * @return the calculated xxHash64 value from that state
     */
    @NativeType("XXH64_hash_t")
    public static long XXH64_digest(@NativeType("XXH64_state_t const *") XXH64State statePtr) {
        return nXXH64_digest(statePtr.address());
    }

    // --- [ XXH64_canonicalFromHash ] ---

    /** Unsafe version of: {@link #XXH64_canonicalFromHash} */
    public static native void nXXH64_canonicalFromHash(long dst, long hash);

    /**
     * Converts an {@code XXH64_hash_t} to a big endian {@code XXH64_canonical_t}.
     *
     * @param dst  the {@code XXH64_canonical_t} pointer to be stored to.
     * @param hash the {@code XXH64_hash_t} to be converted
     */
    public static void XXH64_canonicalFromHash(@NativeType("XXH64_canonical_t *") XXH64Canonical dst, @NativeType("XXH64_hash_t") long hash) {
        nXXH64_canonicalFromHash(dst.address(), hash);
    }

    // --- [ XXH64_hashFromCanonical ] ---

    /** Unsafe version of: {@link #XXH64_hashFromCanonical} */
    public static native long nXXH64_hashFromCanonical(long src);

    /**
     * Converts an {@code XXH64_canonical_t} to a native {@code XXH64_hash_t}.
     *
     * @param src the {@code XXH64_canonical_t} to convert
     */
    @NativeType("XXH64_hash_t")
    public static long XXH64_hashFromCanonical(@NativeType("XXH64_canonical_t const *") XXH64Canonical src) {
        return nXXH64_hashFromCanonical(src.address());
    }

    // --- [ XXH3_64bits ] ---

    /** Unsafe version of: {@link #XXH3_64bits} */
    public static native long nXXH3_64bits(long data, long len);

    /**
     * Default 64-bit variant, using default secret and default seed of 0.
     * 
     * <p>It's the fastest variant.</p>
     */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits(@NativeType("void const *") ByteBuffer data) {
        return nXXH3_64bits(memAddress(data), data.remaining());
    }

    // --- [ XXH3_64bits_withSeed ] ---

    /** Unsafe version of: {@link #XXH3_64bits_withSeed} */
    public static native long nXXH3_64bits_withSeed(long data, long len, long seed);

    /**
     * This variant generates on the fly a custom secret, based on the default secret, altered using the {@code seed} value.
     * 
     * <p>While this operation is decently fast, note that it's not completely free. Note {@code seed==0} produces same results as {@link #XXH3_64bits 3_64bits}.</p>
     */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_withSeed(@NativeType("void const *") ByteBuffer data, @NativeType("XXH64_hash_t") long seed) {
        return nXXH3_64bits_withSeed(memAddress(data), data.remaining(), seed);
    }

    // --- [ XXH3_64bits_withSecret ] ---

    /** Unsafe version of: {@link #XXH3_64bits_withSecret} */
    public static native long nXXH3_64bits_withSecret(long data, long len, long secret, long secretSize);

    /**
     * It's possible to provide any blob of bytes as a "secret" to generate the hash. This makes it more difficult for an external actor to prepare an
     * intentional collision. The main condition is that {@code secretSize} <b>must</b> be large enough (&ge; {@link #XXH3_SECRET_SIZE_MIN}).
     * 
     * <p>However, the quality of the secret impacts the dispersion of the hash algorithm. Therefore, the secret <b>must</b> look like a bunch of random bytes.
     * Avoid "trivial" or structured data such as repeated sequences or a text document. Whenever in doubt about the "randomness" of the blob of bytes,
     * consider employing {@link #XXH3_generateSecret 3_generateSecret} instead. It will generate a proper high entropy secret derived from the blob of bytes. Another advantage of
     * using {@code XXH3_generateSecret()} is that it guarantees that all bits within the initial blob of bytes will impact every bit of the output. This is
     * not necessarily the case when using the blob of bytes directly because, when hashing <b>small</b> inputs, only a portion of the secret is employed.</p>
     */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_withSecret(@NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_withSecret(memAddress(data), data.remaining(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_createState ] ---

    public static native long nXXH3_createState();

    @Nullable
    @NativeType("XXH3_state_t *")
    public static XXH3State XXH3_createState() {
        long __result = nXXH3_createState();
        return XXH3State.createSafe(__result);
    }

    // --- [ XXH3_freeState ] ---

    public static native int nXXH3_freeState(long statePtr);

    @NativeType("XXH_errorcode")
    public static int XXH3_freeState(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        return nXXH3_freeState(statePtr.address());
    }

    // --- [ XXH3_copyState ] ---

    public static native void nXXH3_copyState(long dst_state, long srct_state);

    public static void XXH3_copyState(@NativeType("XXH3_state_t *") XXH3State dst_state, @NativeType("XXH3_state_t const *") XXH3State srct_state) {
        nXXH3_copyState(dst_state.address(), srct_state.address());
    }

    // --- [ XXH3_64bits_reset ] ---

    /** Unsafe version of: {@link #XXH3_64bits_reset} */
    public static native int nXXH3_64bits_reset(long statePtr);

    /**
     * Initialize with default parameters.
     * 
     * <p>Result will be equivalent to {@link #XXH3_64bits 3_64bits}.</p>
     */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        return nXXH3_64bits_reset(statePtr.address());
    }

    // --- [ XXH3_64bits_reset_withSeed ] ---

    /** Unsafe version of: {@link #XXH3_64bits_reset_withSeed} */
    public static native int nXXH3_64bits_reset_withSeed(long statePtr, long seed);

    /**
     * Generate a custom secret from {@code seed}, and store it into {@code state}.
     * 
     * <p>Digest will be equivalent to {@link #XXH3_64bits_withSeed 3_64bits_withSeed}.</p>
     */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("XXH64_hash_t") long seed) {
        return nXXH3_64bits_reset_withSeed(statePtr.address(), seed);
    }

    // --- [ XXH3_64bits_reset_withSecret ] ---

    /** Unsafe version of: {@link #XXH3_64bits_reset_withSecret} */
    public static native int nXXH3_64bits_reset_withSecret(long statePtr, long secret, long secretSize);

    /**
     * {@code secret} is referenced, and must outlive the hash streaming session.
     * 
     * <p>Similar to one-shot API, {@code secretSize} must be &ge; {@link #XXH3_SECRET_SIZE_MIN}, and the quality of produced hash values depends on secret's entrop
     * (secret's content should look like a bunch of random bytes). When in doubt about the randomness of a candidate {@code secret}, consider employing
     * {@link #XXH3_generateSecret 3_generateSecret} instead (see below).</p>
     */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSecret(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_reset_withSecret(statePtr.address(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_64bits_update ] ---

    public static native int nXXH3_64bits_update(long statePtr, long input, long length);

    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_update(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer input) {
        return nXXH3_64bits_update(statePtr.address(), memAddress(input), input.remaining());
    }

    // --- [ XXH3_64bits_digest ] ---

    public static native long nXXH3_64bits_digest(long statePtr);

    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_digest(@NativeType("XXH3_state_t const *") XXH3State statePtr) {
        return nXXH3_64bits_digest(statePtr.address());
    }

    // --- [ XXH3_128bits ] ---

    public static native void nXXH3_128bits(long data, long len, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits(@NativeType("void const *") ByteBuffer data, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits(memAddress(data), data.remaining(), __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_withSeed ] ---

    public static native void nXXH3_128bits_withSeed(long data, long len, long seed, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSeed(@NativeType("void const *") ByteBuffer data, @NativeType("XXH64_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits_withSeed(memAddress(data), data.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_withSecret ] ---

    public static native void nXXH3_128bits_withSecret(long data, long len, long secret, long secretSize, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSecret(@NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        nXXH3_128bits_withSecret(memAddress(data), data.remaining(), memAddress(secret), secret.remaining(), __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_reset ] ---

    public static native int nXXH3_128bits_reset(long statePtr);

    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        return nXXH3_128bits_reset(statePtr.address());
    }

    // --- [ XXH3_128bits_reset_withSeed ] ---

    public static native int nXXH3_128bits_reset_withSeed(long statePtr, long seed);

    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("XXH64_hash_t") long seed) {
        return nXXH3_128bits_reset_withSeed(statePtr.address(), seed);
    }

    // --- [ XXH3_128bits_reset_withSecret ] ---

    public static native int nXXH3_128bits_reset_withSecret(long statePtr, long secret, long secretSize);

    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSecret(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_128bits_reset_withSecret(statePtr.address(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_128bits_update ] ---

    public static native int nXXH3_128bits_update(long statePtr, long input, long length);

    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_update(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer input) {
        return nXXH3_128bits_update(statePtr.address(), memAddress(input), input.remaining());
    }

    // --- [ XXH3_128bits_digest ] ---

    public static native void nXXH3_128bits_digest(long statePtr, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_digest(@NativeType("XXH3_state_t const *") XXH3State statePtr, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits_digest(statePtr.address(), __result.address());
        return __result;
    }

    // --- [ XXH128_isEqual ] ---

    /** Unsafe version of: {@link #XXH128_isEqual} */
    public static native int nXXH128_isEqual(long h1, long h2);

    /** Returns 1 if equal, 0 if different. */
    @NativeType("int")
    public static boolean XXH128_isEqual(@NativeType("XXH128_hash_t") XXH128Hash h1, @NativeType("XXH128_hash_t") XXH128Hash h2) {
        return nXXH128_isEqual(h1.address(), h2.address()) != 0;
    }

    // --- [ XXH128_cmp ] ---

    /** Unsafe version of: {@link #XXH128_cmp} */
    public static native int nXXH128_cmp(long h128_1, long h128_2);

    /** This comparator is compatible with stdlib's {@code qsort()/bsearch()}. */
    public static int XXH128_cmp(@NativeType("void const *") ByteBuffer h128_1, @NativeType("void const *") ByteBuffer h128_2) {
        if (CHECKS) {
            check(h128_1, XXH128Hash.SIZEOF);
            check(h128_2, XXH128Hash.SIZEOF);
        }
        return nXXH128_cmp(memAddress(h128_1), memAddress(h128_2));
    }

    // --- [ XXH128_canonicalFromHash ] ---

    public static native void nXXH128_canonicalFromHash(long dst, long hash);

    public static void XXH128_canonicalFromHash(@NativeType("XXH128_canonical_t *") XXH128Canonical dst, @NativeType("XXH128_hash_t") XXH128Hash hash) {
        nXXH128_canonicalFromHash(dst.address(), hash.address());
    }

    // --- [ XXH128_hashFromCanonical ] ---

    public static native void nXXH128_hashFromCanonical(long src, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH128_hashFromCanonical(@NativeType("XXH128_canonical_t const *") XXH128Canonical src, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH128_hashFromCanonical(src.address(), __result.address());
        return __result;
    }

    // --- [ XXH3_INITSTATE ] ---

    /** Unsafe version of: {@link #XXH3_INITSTATE} */
    public static native void nXXH3_INITSTATE(long statePtr);

    /**
     * Initializes a stack-allocated {@code XXH3_state_t}.
     * 
     * <p>When the {@code XXH3_state_t} structure is merely emplaced on stack, it should be initialized with {@code XXH3_INITSTATE()} or a {@code memset()} in
     * case its first reset uses {@code XXH3_NNbits_reset_withSeed()}. This init can be omitted if the first reset uses default or {@code _withSecret} mode.
     * This operation isn't necessary when the state is created with {@link #XXH3_createState 3_createState}.</p>
     * 
     * <p>Note that this doesn't prepare the state for a streaming operation, it's still necessary to use {@code XXH3_NNbits_reset*()} afterwards.</p>
     */
    public static void XXH3_INITSTATE(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        nXXH3_INITSTATE(statePtr.address());
    }

    // --- [ XXH128 ] ---

    /** Unsafe version of: {@link #XXH128} */
    public static native void nXXH128(long data, long len, long seed, long __result);

    /** Simple alias to pre-selected {@code XXH3_128bits} variant. */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH128(@NativeType("void const *") ByteBuffer data, @NativeType("XXH64_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH128(memAddress(data), data.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_generateSecret ] ---

    /** Unsafe version of: {@link #XXH3_generateSecret} */
    public static native int nXXH3_generateSecret(long secretBuffer, long secretSize, long customSeed, long customSeedSize);

    /**
     * Derives a high-entropy secret from any user-defined content, named {@code customSeed}.
     * 
     * <p>The generated secret can be used in combination with {@code *_withSecret()} functions.  The {@code _withSecret()} variants are useful to provide a
     * higher level of protection than 64-bit seed, as it becomes much more difficult for an external actor to guess how to impact the calculation logic.</p>
     * 
     * <p>The function accepts as input a custom seed of any length and any content, and derives from it a high-entropy secret of length {@code secretSize} into
     * an already allocated buffer {@code secretBuffer}. {@code secretSize} must be &ge; {@link #XXH3_SECRET_SIZE_MIN}.</p>
     * 
     * <p>The generated secret can then be used with any {@code *_withSecret()} variant. Functions {@link #XXH3_128bits_withSecret 3_128bits_withSecret}, {@link #XXH3_64bits_withSecret 3_64bits_withSecret},
     * {@link #XXH3_128bits_reset_withSecret 3_128bits_reset_withSecret} and {@link #XXH3_64bits_reset_withSecret 3_64bits_reset_withSecret} are part of this list. They all accept a {@code secret} parameter which must be large
     * enough for implementation reasons (&ge; {@link #XXH3_SECRET_SIZE_MIN}) <i>and</i> feature very high entropy (consist of random-looking bytes). These conditions can
     * be a high bar to meet, so {@code XXH3_generateSecret()} can be employed to ensure proper quality.</p>
     * 
     * <p>{@code customSeed} can be anything. It can have any size, even small ones, and its content can be anything, even "poor entropy" sources such as a bunch
     * of zeroes. The resulting {@code secret} will nonetheless provide all required qualities.</p>
     * 
     * <p>When {@code customSeedSize} &gt; 0, supplying {@code NULL} as {@code customSeed} is undefined behavior.</p>
     */
    @NativeType("XXH_errorcode")
    public static int XXH3_generateSecret(@NativeType("void *") ByteBuffer secretBuffer, @Nullable @NativeType("void const *") ByteBuffer customSeed) {
        if (CHECKS) {
            check(secretBuffer, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_generateSecret(memAddress(secretBuffer), secretBuffer.remaining(), memAddressSafe(customSeed), remainingSafe(customSeed));
    }

    // --- [ XXH3_generateSecret_fromSeed ] ---

    /** Unsafe version of: {@link #XXH3_generateSecret_fromSeed} */
    public static native void nXXH3_generateSecret_fromSeed(long secretBuffer, long seed);

    /**
     * Generate the same secret as the {@code _withSeed()} variants.
     * 
     * <p>The resulting secret has a length of {@link #XXH3_SECRET_DEFAULT_SIZE} (necessarily). {@code secretBuffer} must be already allocated, of size at least
     * {@code XXH3_SECRET_DEFAULT_SIZE} bytes.</p>
     * 
     * <p>The generated secret can be used in combination with {@code *_withSecret()} and {@code _withSecretandSeed()} variants. This generator is notably useful
     * in combination with {@code _withSecretandSeed()}, as a way to emulate a faster {@code _withSeed()} variant.</p>
     */
    public static void XXH3_generateSecret_fromSeed(@NativeType("void *") ByteBuffer secretBuffer, @NativeType("XXH64_hash_t") long seed) {
        if (CHECKS) {
            check(secretBuffer, XXH3_SECRET_DEFAULT_SIZE);
        }
        nXXH3_generateSecret_fromSeed(memAddress(secretBuffer), seed);
    }

    // --- [ XXH3_64bits_withSecretandSeed ] ---

    public static native long nXXH3_64bits_withSecretandSeed(long data, long len, long secret, long secretSize, long seed);

    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_withSecretandSeed(@Nullable @NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_withSecretandSeed(memAddressSafe(data), remainingSafe(data), memAddress(secret), secret.remaining(), seed);
    }

    // --- [ XXH3_128bits_withSecretandSeed ] ---

    public static native void nXXH3_128bits_withSecretandSeed(long data, long len, long secret, long secretSize, long seed, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSecretandSeed(@Nullable @NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        nXXH3_128bits_withSecretandSeed(memAddressSafe(data), remainingSafe(data), memAddress(secret), secret.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_64bits_reset_withSecretandSeed ] ---

    public static native int nXXH3_64bits_reset_withSecretandSeed(long statePtr, long secret, long secretSize, long seed64);

    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSecretandSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed64) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_reset_withSecretandSeed(statePtr.address(), memAddress(secret), secret.remaining(), seed64);
    }

    // --- [ XXH3_128bits_reset_withSecretandSeed ] ---

    public static native int nXXH3_128bits_reset_withSecretandSeed(long statePtr, long secret, long secretSize, long seed64);

    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSecretandSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed64) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_128bits_reset_withSecretandSeed(statePtr.address(), memAddress(secret), secret.remaining(), seed64);
    }

}