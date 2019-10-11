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
 * <h3>XXH3</h3>
 * 
 * <p>XXH3 is a new hash algorithm, featuring improved speed performance for both small and large inputs. See full speed analysis at:
 * <a href="http://fastcompression.blogspot.com/2019/03/presenting-xxh3.html">Presenting XXH3</a></p>
 * 
 * <p>In general, expect XXH3 to run about ~2x faster on large inputs, and &gt;3x faster on small ones, though exact differences depend on platform.</p>
 * 
 * <p>The algorithm is portable, will generate the same hash on all platforms. It benefits greatly from vectorization units, but does not require it.</p>
 * 
 * <p>XXH3 offers 2 variants, {@code _64bits} and {@code _128bits}. When only 64 bits are needed, prefer calling the {@code _64bits} variant: it reduces the
 * amount of mixing, resulting in faster speed on small inputs. It's also generally simpler to manipulate a scalar return type than a struct.</p>
 * 
 * <p>The XXH3 algorithm is still considered experimental. Produced results can still change between versions. Results produced by v0.7.x are not comparable
 * with results from v0.7.y. It's nonetheless possible to use XXH3 for ephemeral data (local sessions), but avoid storing values in long-term storage for
 * later reads.</p>
 * 
 * <p>The API supports one-shot hashing, streaming mode, and custom secrets.</p>
 */
public class XXHash {

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
    public static final int XXH_VERSION_MINOR = 7;

    /** The release version number. */
    public static final int XXH_VERSION_RELEASE = 2;

    /** The version number */
    public static final int XXH_VERSION_NUMBER = (XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE);

    public static final int XXH_3_SECRET_SIZE_MIN = 0x88;

    static { LibXXHash.initialize(); }

    protected XXHash() {
        throw new UnsupportedOperationException();
    }

    // --- [ XXH32 ] ---

    /**
     * Unsafe version of: {@link #XXH32}
     *
     * @param length the number of bytes stored at memory address {@code input}
     */
    public static native int nXXH32(long input, long length, int seed);

    /**
     * Calculates the 32-bits hash of sequence {@code length} bytes stored at memory address {@code input}.
     *
     * @param input the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
     * @param seed  the seed that can be used to alter the result predictably
     */
    @NativeType("XXH32_hash_t")
    public static int XXH32(@NativeType("void const *") ByteBuffer input, @NativeType("XXH32_hash_t") int seed) {
        return nXXH32(memAddress(input), input.remaining(), seed);
    }

    // --- [ XXH32_createState ] ---

    /** Unsafe version of: {@link #XXH32_createState} */
    public static native long nXXH32_createState();

    /**
     * Creates memory for {@code XXH32_state_t}. The state must then be initialized using {@link #XXH32_reset 32_reset} before first use.
     * 
     * <p><b>LWJGL note</b>: This function simply delegates to the system {@code malloc()} function.</p>
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
     * Frees the specified {@code XXH32_state_t}.
     *
     * @param statePtr the state to free
     */
    @NativeType("XXH_errorcode")
    public static int XXH32_freeState(@NativeType("XXH32_state_t *") XXH32State statePtr) {
        return nXXH32_freeState(statePtr.address());
    }

    // --- [ XXH32_copyState ] ---

    public static native void nXXH32_copyState(long dst_state, long src_state);

    public static void XXH32_copyState(@NativeType("XXH32_state_t *") XXH32State dst_state, @NativeType("XXH32_state_t const *") XXH32State src_state) {
        nXXH32_copyState(dst_state.address(), src_state.address());
    }

    // --- [ XXH32_reset ] ---

    /** Unsafe version of: {@link #XXH32_reset} */
    public static native int nXXH32_reset(long statePtr, int seed);

    /**
     * Resets the specified {@code XXH32_state_t}.
     *
     * @param statePtr the {@code XXH32_state_t} to reset
     * @param seed     the seed that can be used to alter the hashing result predictably
     */
    @NativeType("XXH_errorcode")
    public static int XXH32_reset(@NativeType("XXH32_state_t *") XXH32State statePtr, @NativeType("XXH32_hash_t") int seed) {
        return nXXH32_reset(statePtr.address(), seed);
    }

    // --- [ XXH32_update ] ---

    /**
     * Unsafe version of: {@link #XXH32_update}
     *
     * @param length the number of bytes stored at memory address {@code input}
     */
    public static native int nXXH32_update(long statePtr, long input, long length);

    /**
     * Streaming functions generate the xxHash value from an incrememtal input. This method is slower than single-call functions, due to state management. For
     * small inputs, prefer {@link #XXH32 32}.
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
     * @param statePtr the {@code XXH32_state_t} to use
     * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
     */
    @NativeType("XXH_errorcode")
    public static int XXH32_update(@NativeType("XXH32_state_t *") XXH32State statePtr, @NativeType("void const *") ByteBuffer input) {
        return nXXH32_update(statePtr.address(), memAddress(input), input.remaining());
    }

    // --- [ XXH32_digest ] ---

    /** Unsafe version of: {@link #XXH32_digest} */
    public static native int nXXH32_digest(long statePtr);

    /**
     * Returns the final 32-bits hash of the specified {@code XXH32_state_t}.
     *
     * @param statePtr the {@code XXH32_state_t} to use
     */
    @NativeType("XXH32_hash_t")
    public static int XXH32_digest(@NativeType("XXH32_state_t const *") XXH32State statePtr) {
        return nXXH32_digest(statePtr.address());
    }

    // --- [ XXH32_canonicalFromHash ] ---

    /** Unsafe version of: {@link #XXH32_canonicalFromHash} */
    public static native void nXXH32_canonicalFromHash(long dst, int hash);

    /**
     * Default return values from XXH functions are basic unsigned 32 and 64 bits. This the simplest and fastest format for further post-processing. However,
     * this leaves open the question of what is the order of bytes, since little and big endian conventions will write the same number differently.
     * 
     * <p>The canonical representation settles this issue, by mandating big-endian convention, aka, the same convention as human-readable numbers (large digits
     * first). When writing hash values to storage, sending them over a network, or printing them, it's highly recommended to use the canonical
     * representation, to ensure portability across a wider range of systems, present and future.</p>
     * 
     * <p>The following functions allow transformation of hash values into and from canonical format.</p>
     *
     * @param dst  the destination canonical representation
     * @param hash the source hash
     */
    public static void XXH32_canonicalFromHash(@NativeType("XXH32_canonical_t *") XXH32Canonical dst, @NativeType("XXH32_hash_t") int hash) {
        nXXH32_canonicalFromHash(dst.address(), hash);
    }

    // --- [ XXH32_hashFromCanonical ] ---

    /** Unsafe version of: {@link #XXH32_hashFromCanonical} */
    public static native int nXXH32_hashFromCanonical(long src);

    /**
     * Transforms the specified canonical representation to a primitive value.
     *
     * @param src the source canonical representation
     */
    @NativeType("XXH32_hash_t")
    public static int XXH32_hashFromCanonical(@NativeType("XXH32_canonical_t const *") XXH32Canonical src) {
        return nXXH32_hashFromCanonical(src.address());
    }

    // --- [ XXH64 ] ---

    /**
     * Unsafe version of: {@link #XXH64}
     *
     * @param length the number of bytes stored at memory address {@code input}
     */
    public static native long nXXH64(long input, long length, long seed);

    /**
     * 64-bit version of {@link #XXH32 32}.
     * 
     * <p>This function runs 2x faster on 64-bits systems, but slower on 32-bits systems.</p>
     *
     * @param input the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
     * @param seed  the seed that can be used to alter the result predictably
     */
    @NativeType("XXH32_hash_t")
    public static long XXH64(@NativeType("void const *") ByteBuffer input, @NativeType("XXH32_hash_t") long seed) {
        return nXXH64(memAddress(input), input.remaining(), seed);
    }

    // --- [ XXH64_createState ] ---

    /** Unsafe version of: {@link #XXH64_createState} */
    public static native long nXXH64_createState();

    /** 64-bit version of {@link #XXH32_createState 32_createState}. */
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
     * 64-bit version of {@link #XXH32_freeState 32_freeState}.
     *
     * @param statePtr the state to free
     */
    @NativeType("XXH_errorcode")
    public static int XXH64_freeState(@NativeType("XXH64_state_t *") XXH64State statePtr) {
        return nXXH64_freeState(statePtr.address());
    }

    // --- [ XXH64_copyState ] ---

    public static native void nXXH64_copyState(long dst_state, long src_state);

    public static void XXH64_copyState(@NativeType("XXH64_state_t *") XXH64State dst_state, @NativeType("XXH64_state_t const *") XXH64State src_state) {
        nXXH64_copyState(dst_state.address(), src_state.address());
    }

    // --- [ XXH64_reset ] ---

    /** Unsafe version of: {@link #XXH64_reset} */
    public static native int nXXH64_reset(long statePtr, long seed);

    /**
     * 64-bit version of {@link #XXH32_reset 32_reset}.
     *
     * @param statePtr the {@code XXH64_state_t} to reset
     * @param seed     the seed that can be used to alter the hashing result predictably
     */
    @NativeType("XXH_errorcode")
    public static int XXH64_reset(@NativeType("XXH64_state_t *") XXH64State statePtr, @NativeType("XXH32_hash_t") long seed) {
        return nXXH64_reset(statePtr.address(), seed);
    }

    // --- [ XXH64_update ] ---

    /**
     * Unsafe version of: {@link #XXH64_update}
     *
     * @param length the number of bytes stored at memory address {@code input}
     */
    public static native int nXXH64_update(long statePtr, long input, long length);

    /**
     * 64-bit version of {@link #XXH32_update 32_update}.
     *
     * @param statePtr the {@code XXH64_state_t} to use
     * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
     */
    @NativeType("XXH_errorcode")
    public static int XXH64_update(@NativeType("XXH64_state_t *") XXH64State statePtr, @NativeType("void const *") ByteBuffer input) {
        return nXXH64_update(statePtr.address(), memAddress(input), input.remaining());
    }

    // --- [ XXH64_digest ] ---

    /** Unsafe version of: {@link #XXH64_digest} */
    public static native long nXXH64_digest(long statePtr);

    /**
     * 64-bit version of {@link #XXH32_digest 32_digest}.
     *
     * @param statePtr the {@code XXH64_state_t} to use
     */
    @NativeType("XXH32_hash_t")
    public static long XXH64_digest(@NativeType("XXH64_state_t const *") XXH64State statePtr) {
        return nXXH64_digest(statePtr.address());
    }

    // --- [ XXH64_canonicalFromHash ] ---

    /** Unsafe version of: {@link #XXH64_canonicalFromHash} */
    public static native void nXXH64_canonicalFromHash(long dst, long hash);

    /**
     * 64-bit version of {@link #XXH32_canonicalFromHash 32_canonicalFromHash}.
     *
     * @param dst  the destination canonical representation
     * @param hash the source hash
     */
    public static void XXH64_canonicalFromHash(@NativeType("XXH64_canonical_t *") XXH64Canonical dst, @NativeType("XXH32_hash_t") long hash) {
        nXXH64_canonicalFromHash(dst.address(), hash);
    }

    // --- [ XXH64_hashFromCanonical ] ---

    /** Unsafe version of: {@link #XXH64_hashFromCanonical} */
    public static native long nXXH64_hashFromCanonical(long src);

    /**
     * 64-bit version of {@link #XXH32_hashFromCanonical 32_hashFromCanonical}.
     *
     * @param src the source canonical representation
     */
    @NativeType("XXH32_hash_t")
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
    @NativeType("XXH32_hash_t")
    public static long XXH3_64bits(@NativeType("void const *") ByteBuffer data) {
        return nXXH3_64bits(memAddress(data), data.remaining());
    }

    // --- [ XXH3_64bits_withSecret ] ---

    /** Unsafe version of: {@link #XXH3_64bits_withSecret} */
    public static native long nXXH3_64bits_withSecret(long data, long len, long secret, long secretSize);

    /**
     * It's possible to provide any blob of bytes as a "secret" to generate the hash. This makes it more difficult for an external actor to prepare an
     * intentional collision.
     * 
     * <p>The secret <b>must</b> be large enough (&ge; {@link #XXH_3_SECRET_SIZE_MIN 3_SECRET_SIZE_MIN}). It should consist of random bytes. Avoid repeating same character, or sequences of
     * bytes, and especially avoid swathes of {@code \0}. Failure to respect these conditions will result in a poor quality hash.</p>
     */
    @NativeType("XXH32_hash_t")
    public static long XXH3_64bits_withSecret(@NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret) {
        return nXXH3_64bits_withSecret(memAddress(data), data.remaining(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_64bits_withSeed ] ---

    /** Unsafe version of: {@link #XXH3_64bits_withSeed} */
    public static native long nXXH3_64bits_withSeed(long data, long len, long seed);

    /**
     * This variant generates on the fly a custom secret, based on the default secret, altered using the {@code seed} value.
     * 
     * <p>While this operation is decently fast, note that it's not completely free. Note {@code seed==0} produces same results as {@link #XXH3_64bits 3_64bits}.</p>
     */
    @NativeType("XXH32_hash_t")
    public static long XXH3_64bits_withSeed(@NativeType("void const *") ByteBuffer data, @NativeType("XXH32_hash_t") long seed) {
        return nXXH3_64bits_withSeed(memAddress(data), data.remaining(), seed);
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
    public static int XXH3_64bits_reset_withSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("XXH32_hash_t") long seed) {
        return nXXH3_64bits_reset_withSeed(statePtr.address(), seed);
    }

    // --- [ XXH3_64bits_reset_withSecret ] ---

    /** Unsafe version of: {@link #XXH3_64bits_reset_withSecret} */
    public static native int nXXH3_64bits_reset_withSecret(long statePtr, long secret, long secretSize);

    /**
     * {@code secret} is referenced, and must outlive the hash streaming session.
     * 
     * <p>{@code secretSize} must be &ge; {@link #XXH_3_SECRET_SIZE_MIN 3_SECRET_SIZE_MIN}.</p>
     */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSecret(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret) {
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

    @NativeType("XXH32_hash_t")
    public static long XXH3_64bits_digest(@NativeType("XXH3_state_t const *") XXH3State statePtr) {
        return nXXH3_64bits_digest(statePtr.address());
    }

    // --- [ XXH128 ] ---

    public static native void nXXH128(long data, long len, long seed, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH128(@NativeType("void const *") ByteBuffer data, @NativeType("XXH32_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH128(memAddress(data), data.remaining(), seed, __result.address());
        return __result;
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
    public static XXH128Hash XXH3_128bits_withSeed(@NativeType("void const *") ByteBuffer data, @NativeType("XXH32_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits_withSeed(memAddress(data), data.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_withSecret ] ---

    public static native void nXXH3_128bits_withSecret(long data, long len, long secret, long secretSize, long __result);

    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSecret(@NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH128_hash_t") XXH128Hash __result) {
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
    public static int XXH3_128bits_reset_withSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("XXH32_hash_t") long seed) {
        return nXXH3_128bits_reset_withSeed(statePtr.address(), seed);
    }

    // --- [ XXH3_128bits_reset_withSecret ] ---

    public static native int nXXH3_128bits_reset_withSecret(long statePtr, long secret, long secretSize);

    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSecret(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret) {
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

    /** This comparator is compatible with stdlib's {@code qsort()}. */
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

}