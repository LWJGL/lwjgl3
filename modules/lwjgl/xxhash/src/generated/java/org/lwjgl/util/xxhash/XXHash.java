/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class XXHash {

    static { LibXXHash.initialize(); }

    public static final int
        XXH_OK    = 0,
        XXH_ERROR = 1;

    public static final int
        XXH_VERSION_MAJOR   = 0,
        XXH_VERSION_MINOR   = 8,
        XXH_VERSION_RELEASE = 3;

    public static final int XXH_VERSION_NUMBER = (XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE);

    public static final int
        XXH3_SECRET_SIZE_MIN     = 0x88,
        XXH3_INTERNALBUFFER_SIZE = 256,
        XXH3_SECRET_DEFAULT_SIZE = 192,
        XXH3_MIDSIZE_MAX         = 240;

    protected XXHash() {
        throw new UnsupportedOperationException();
    }

    // --- [ XXH32 ] ---

    /** {@code XXH32_hash_t XXH32(void const * input, size_t length, XXH32_hash_t seed)} */
    public static native int nXXH32(long input, long length, int seed);

    /** {@code XXH32_hash_t XXH32(void const * input, size_t length, XXH32_hash_t seed)} */
    @NativeType("XXH32_hash_t")
    public static int XXH32(@NativeType("void const *") @Nullable ByteBuffer input, @NativeType("XXH32_hash_t") int seed) {
        return nXXH32(memAddressSafe(input), remainingSafe(input), seed);
    }

    // --- [ XXH32_createState ] ---

    /** {@code XXH32_state_t * XXH32_createState(void)} */
    public static native long nXXH32_createState();

    /** {@code XXH32_state_t * XXH32_createState(void)} */
    @NativeType("XXH32_state_t *")
    public static @Nullable XXH32State XXH32_createState() {
        long __result = nXXH32_createState();
        return XXH32State.createSafe(__result);
    }

    // --- [ XXH32_freeState ] ---

    /** {@code XXH_errorcode XXH32_freeState(XXH32_state_t * statePtr)} */
    public static native int nXXH32_freeState(long statePtr);

    /** {@code XXH_errorcode XXH32_freeState(XXH32_state_t * statePtr)} */
    @NativeType("XXH_errorcode")
    public static int XXH32_freeState(@NativeType("XXH32_state_t *") XXH32State statePtr) {
        return nXXH32_freeState(statePtr.address());
    }

    // --- [ XXH32_copyState ] ---

    /** {@code void XXH32_copyState(XXH32_state_t * dst_state, XXH32_state_t const * src_state)} */
    public static native void nXXH32_copyState(long dst_state, long src_state);

    /** {@code void XXH32_copyState(XXH32_state_t * dst_state, XXH32_state_t const * src_state)} */
    public static void XXH32_copyState(@NativeType("XXH32_state_t *") XXH32State dst_state, @NativeType("XXH32_state_t const *") XXH32State src_state) {
        nXXH32_copyState(dst_state.address(), src_state.address());
    }

    // --- [ XXH32_reset ] ---

    /** {@code XXH_errorcode XXH32_reset(XXH32_state_t * statePtr, XXH32_hash_t seed)} */
    public static native int nXXH32_reset(long statePtr, int seed);

    /** {@code XXH_errorcode XXH32_reset(XXH32_state_t * statePtr, XXH32_hash_t seed)} */
    @NativeType("XXH_errorcode")
    public static int XXH32_reset(@NativeType("XXH32_state_t *") XXH32State statePtr, @NativeType("XXH32_hash_t") int seed) {
        return nXXH32_reset(statePtr.address(), seed);
    }

    // --- [ XXH32_update ] ---

    /** {@code XXH_errorcode XXH32_update(XXH32_state_t * statePtr, void const * input, size_t length)} */
    public static native int nXXH32_update(long statePtr, long input, long length);

    /** {@code XXH_errorcode XXH32_update(XXH32_state_t * statePtr, void const * input, size_t length)} */
    @NativeType("XXH_errorcode")
    public static int XXH32_update(@NativeType("XXH32_state_t *") XXH32State statePtr, @NativeType("void const *") @Nullable ByteBuffer input) {
        return nXXH32_update(statePtr.address(), memAddressSafe(input), remainingSafe(input));
    }

    // --- [ XXH32_digest ] ---

    /** {@code XXH32_hash_t XXH32_digest(XXH32_state_t const * statePtr)} */
    public static native int nXXH32_digest(long statePtr);

    /** {@code XXH32_hash_t XXH32_digest(XXH32_state_t const * statePtr)} */
    @NativeType("XXH32_hash_t")
    public static int XXH32_digest(@NativeType("XXH32_state_t const *") XXH32State statePtr) {
        return nXXH32_digest(statePtr.address());
    }

    // --- [ XXH32_canonicalFromHash ] ---

    /** {@code void XXH32_canonicalFromHash(XXH32_canonical_t * dst, XXH32_hash_t hash)} */
    public static native void nXXH32_canonicalFromHash(long dst, int hash);

    /** {@code void XXH32_canonicalFromHash(XXH32_canonical_t * dst, XXH32_hash_t hash)} */
    public static void XXH32_canonicalFromHash(@NativeType("XXH32_canonical_t *") XXH32Canonical dst, @NativeType("XXH32_hash_t") int hash) {
        nXXH32_canonicalFromHash(dst.address(), hash);
    }

    // --- [ XXH32_hashFromCanonical ] ---

    /** {@code XXH32_hash_t XXH32_hashFromCanonical(XXH32_canonical_t const * src)} */
    public static native int nXXH32_hashFromCanonical(long src);

    /** {@code XXH32_hash_t XXH32_hashFromCanonical(XXH32_canonical_t const * src)} */
    @NativeType("XXH32_hash_t")
    public static int XXH32_hashFromCanonical(@NativeType("XXH32_canonical_t const *") XXH32Canonical src) {
        return nXXH32_hashFromCanonical(src.address());
    }

    // --- [ XXH64 ] ---

    /** {@code XXH64_hash_t XXH64(void const * input, size_t length, XXH64_hash_t seed)} */
    public static native long nXXH64(long input, long length, long seed);

    /** {@code XXH64_hash_t XXH64(void const * input, size_t length, XXH64_hash_t seed)} */
    @NativeType("XXH64_hash_t")
    public static long XXH64(@NativeType("void const *") @Nullable ByteBuffer input, @NativeType("XXH64_hash_t") long seed) {
        return nXXH64(memAddressSafe(input), remainingSafe(input), seed);
    }

    // --- [ XXH64_createState ] ---

    /** {@code XXH64_state_t * XXH64_createState(void)} */
    public static native long nXXH64_createState();

    /** {@code XXH64_state_t * XXH64_createState(void)} */
    @NativeType("XXH64_state_t *")
    public static @Nullable XXH64State XXH64_createState() {
        long __result = nXXH64_createState();
        return XXH64State.createSafe(__result);
    }

    // --- [ XXH64_freeState ] ---

    /** {@code XXH_errorcode XXH64_freeState(XXH64_state_t * statePtr)} */
    public static native int nXXH64_freeState(long statePtr);

    /** {@code XXH_errorcode XXH64_freeState(XXH64_state_t * statePtr)} */
    @NativeType("XXH_errorcode")
    public static int XXH64_freeState(@NativeType("XXH64_state_t *") XXH64State statePtr) {
        return nXXH64_freeState(statePtr.address());
    }

    // --- [ XXH64_copyState ] ---

    /** {@code void XXH64_copyState(XXH64_state_t * dst_state, XXH64_state_t const * src_state)} */
    public static native void nXXH64_copyState(long dst_state, long src_state);

    /** {@code void XXH64_copyState(XXH64_state_t * dst_state, XXH64_state_t const * src_state)} */
    public static void XXH64_copyState(@NativeType("XXH64_state_t *") XXH64State dst_state, @NativeType("XXH64_state_t const *") XXH64State src_state) {
        nXXH64_copyState(dst_state.address(), src_state.address());
    }

    // --- [ XXH64_reset ] ---

    /** {@code XXH_errorcode XXH64_reset(XXH64_state_t * statePtr, XXH64_hash_t seed)} */
    public static native int nXXH64_reset(long statePtr, long seed);

    /** {@code XXH_errorcode XXH64_reset(XXH64_state_t * statePtr, XXH64_hash_t seed)} */
    @NativeType("XXH_errorcode")
    public static int XXH64_reset(@NativeType("XXH64_state_t *") XXH64State statePtr, @NativeType("XXH64_hash_t") long seed) {
        return nXXH64_reset(statePtr.address(), seed);
    }

    // --- [ XXH64_update ] ---

    /** {@code XXH_errorcode XXH64_update(XXH64_state_t * statePtr, void const * input, size_t length)} */
    public static native int nXXH64_update(long statePtr, long input, long length);

    /** {@code XXH_errorcode XXH64_update(XXH64_state_t * statePtr, void const * input, size_t length)} */
    @NativeType("XXH_errorcode")
    public static int XXH64_update(@NativeType("XXH64_state_t *") XXH64State statePtr, @NativeType("void const *") @Nullable ByteBuffer input) {
        return nXXH64_update(statePtr.address(), memAddressSafe(input), remainingSafe(input));
    }

    // --- [ XXH64_digest ] ---

    /** {@code XXH64_hash_t XXH64_digest(XXH64_state_t const * statePtr)} */
    public static native long nXXH64_digest(long statePtr);

    /** {@code XXH64_hash_t XXH64_digest(XXH64_state_t const * statePtr)} */
    @NativeType("XXH64_hash_t")
    public static long XXH64_digest(@NativeType("XXH64_state_t const *") XXH64State statePtr) {
        return nXXH64_digest(statePtr.address());
    }

    // --- [ XXH64_canonicalFromHash ] ---

    /** {@code void XXH64_canonicalFromHash(XXH64_canonical_t * dst, XXH64_hash_t hash)} */
    public static native void nXXH64_canonicalFromHash(long dst, long hash);

    /** {@code void XXH64_canonicalFromHash(XXH64_canonical_t * dst, XXH64_hash_t hash)} */
    public static void XXH64_canonicalFromHash(@NativeType("XXH64_canonical_t *") XXH64Canonical dst, @NativeType("XXH64_hash_t") long hash) {
        nXXH64_canonicalFromHash(dst.address(), hash);
    }

    // --- [ XXH64_hashFromCanonical ] ---

    /** {@code XXH64_hash_t XXH64_hashFromCanonical(XXH64_canonical_t const * src)} */
    public static native long nXXH64_hashFromCanonical(long src);

    /** {@code XXH64_hash_t XXH64_hashFromCanonical(XXH64_canonical_t const * src)} */
    @NativeType("XXH64_hash_t")
    public static long XXH64_hashFromCanonical(@NativeType("XXH64_canonical_t const *") XXH64Canonical src) {
        return nXXH64_hashFromCanonical(src.address());
    }

    // --- [ XXH3_64bits ] ---

    /** {@code XXH64_hash_t XXH3_64bits(void const * data, size_t len)} */
    public static native long nXXH3_64bits(long data, long len);

    /** {@code XXH64_hash_t XXH3_64bits(void const * data, size_t len)} */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits(@NativeType("void const *") ByteBuffer data) {
        return nXXH3_64bits(memAddress(data), data.remaining());
    }

    // --- [ XXH3_64bits_withSeed ] ---

    /** {@code XXH64_hash_t XXH3_64bits_withSeed(void const * data, size_t len, XXH64_hash_t seed)} */
    public static native long nXXH3_64bits_withSeed(long data, long len, long seed);

    /** {@code XXH64_hash_t XXH3_64bits_withSeed(void const * data, size_t len, XXH64_hash_t seed)} */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_withSeed(@NativeType("void const *") ByteBuffer data, @NativeType("XXH64_hash_t") long seed) {
        return nXXH3_64bits_withSeed(memAddress(data), data.remaining(), seed);
    }

    // --- [ XXH3_64bits_withSecret ] ---

    /** {@code XXH64_hash_t XXH3_64bits_withSecret(void const * data, size_t len, void const * secret, size_t secretSize)} */
    public static native long nXXH3_64bits_withSecret(long data, long len, long secret, long secretSize);

    /** {@code XXH64_hash_t XXH3_64bits_withSecret(void const * data, size_t len, void const * secret, size_t secretSize)} */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_withSecret(@NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_withSecret(memAddress(data), data.remaining(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_createState ] ---

    /** {@code XXH3_state_t * XXH3_createState(void)} */
    public static native long nXXH3_createState();

    /** {@code XXH3_state_t * XXH3_createState(void)} */
    @NativeType("XXH3_state_t *")
    public static @Nullable XXH3State XXH3_createState() {
        long __result = nXXH3_createState();
        return XXH3State.createSafe(__result);
    }

    // --- [ XXH3_freeState ] ---

    /** {@code XXH_errorcode XXH3_freeState(XXH3_state_t * statePtr)} */
    public static native int nXXH3_freeState(long statePtr);

    /** {@code XXH_errorcode XXH3_freeState(XXH3_state_t * statePtr)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_freeState(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        return nXXH3_freeState(statePtr.address());
    }

    // --- [ XXH3_copyState ] ---

    /** {@code void XXH3_copyState(XXH3_state_t * dst_state, XXH3_state_t const * srct_state)} */
    public static native void nXXH3_copyState(long dst_state, long srct_state);

    /** {@code void XXH3_copyState(XXH3_state_t * dst_state, XXH3_state_t const * srct_state)} */
    public static void XXH3_copyState(@NativeType("XXH3_state_t *") XXH3State dst_state, @NativeType("XXH3_state_t const *") XXH3State srct_state) {
        nXXH3_copyState(dst_state.address(), srct_state.address());
    }

    // --- [ XXH3_64bits_reset ] ---

    /** {@code XXH_errorcode XXH3_64bits_reset(XXH3_state_t * statePtr)} */
    public static native int nXXH3_64bits_reset(long statePtr);

    /** {@code XXH_errorcode XXH3_64bits_reset(XXH3_state_t * statePtr)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        return nXXH3_64bits_reset(statePtr.address());
    }

    // --- [ XXH3_64bits_reset_withSeed ] ---

    /** {@code XXH_errorcode XXH3_64bits_reset_withSeed(XXH3_state_t * statePtr, XXH64_hash_t seed)} */
    public static native int nXXH3_64bits_reset_withSeed(long statePtr, long seed);

    /** {@code XXH_errorcode XXH3_64bits_reset_withSeed(XXH3_state_t * statePtr, XXH64_hash_t seed)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("XXH64_hash_t") long seed) {
        return nXXH3_64bits_reset_withSeed(statePtr.address(), seed);
    }

    // --- [ XXH3_64bits_reset_withSecret ] ---

    /** {@code XXH_errorcode XXH3_64bits_reset_withSecret(XXH3_state_t * statePtr, void const * secret, size_t secretSize)} */
    public static native int nXXH3_64bits_reset_withSecret(long statePtr, long secret, long secretSize);

    /** {@code XXH_errorcode XXH3_64bits_reset_withSecret(XXH3_state_t * statePtr, void const * secret, size_t secretSize)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSecret(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_reset_withSecret(statePtr.address(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_64bits_update ] ---

    /** {@code XXH_errorcode XXH3_64bits_update(XXH3_state_t * statePtr, void const * input, size_t length)} */
    public static native int nXXH3_64bits_update(long statePtr, long input, long length);

    /** {@code XXH_errorcode XXH3_64bits_update(XXH3_state_t * statePtr, void const * input, size_t length)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_update(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") @Nullable ByteBuffer input) {
        return nXXH3_64bits_update(statePtr.address(), memAddressSafe(input), remainingSafe(input));
    }

    // --- [ XXH3_64bits_digest ] ---

    /** {@code XXH64_hash_t XXH3_64bits_digest(XXH3_state_t const * statePtr)} */
    public static native long nXXH3_64bits_digest(long statePtr);

    /** {@code XXH64_hash_t XXH3_64bits_digest(XXH3_state_t const * statePtr)} */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_digest(@NativeType("XXH3_state_t const *") XXH3State statePtr) {
        return nXXH3_64bits_digest(statePtr.address());
    }

    // --- [ XXH3_128bits ] ---

    /** {@code XXH128_hash_t XXH3_128bits(void const * data, size_t len)} */
    public static native void nXXH3_128bits(long data, long len, long __result);

    /** {@code XXH128_hash_t XXH3_128bits(void const * data, size_t len)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits(@NativeType("void const *") ByteBuffer data, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits(memAddress(data), data.remaining(), __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_withSeed ] ---

    /** {@code XXH128_hash_t XXH3_128bits_withSeed(void const * data, size_t len, XXH64_hash_t seed)} */
    public static native void nXXH3_128bits_withSeed(long data, long len, long seed, long __result);

    /** {@code XXH128_hash_t XXH3_128bits_withSeed(void const * data, size_t len, XXH64_hash_t seed)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSeed(@NativeType("void const *") ByteBuffer data, @NativeType("XXH64_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits_withSeed(memAddress(data), data.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_withSecret ] ---

    /** {@code XXH128_hash_t XXH3_128bits_withSecret(void const * data, size_t len, void const * secret, size_t secretSize)} */
    public static native void nXXH3_128bits_withSecret(long data, long len, long secret, long secretSize, long __result);

    /** {@code XXH128_hash_t XXH3_128bits_withSecret(void const * data, size_t len, void const * secret, size_t secretSize)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSecret(@NativeType("void const *") ByteBuffer data, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        nXXH3_128bits_withSecret(memAddress(data), data.remaining(), memAddress(secret), secret.remaining(), __result.address());
        return __result;
    }

    // --- [ XXH3_128bits_reset ] ---

    /** {@code XXH_errorcode XXH3_128bits_reset(XXH3_state_t * statePtr)} */
    public static native int nXXH3_128bits_reset(long statePtr);

    /** {@code XXH_errorcode XXH3_128bits_reset(XXH3_state_t * statePtr)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        return nXXH3_128bits_reset(statePtr.address());
    }

    // --- [ XXH3_128bits_reset_withSeed ] ---

    /** {@code XXH_errorcode XXH3_128bits_reset_withSeed(XXH3_state_t * statePtr, XXH64_hash_t seed)} */
    public static native int nXXH3_128bits_reset_withSeed(long statePtr, long seed);

    /** {@code XXH_errorcode XXH3_128bits_reset_withSeed(XXH3_state_t * statePtr, XXH64_hash_t seed)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("XXH64_hash_t") long seed) {
        return nXXH3_128bits_reset_withSeed(statePtr.address(), seed);
    }

    // --- [ XXH3_128bits_reset_withSecret ] ---

    /** {@code XXH_errorcode XXH3_128bits_reset_withSecret(XXH3_state_t * statePtr, void const * secret, size_t secretSize)} */
    public static native int nXXH3_128bits_reset_withSecret(long statePtr, long secret, long secretSize);

    /** {@code XXH_errorcode XXH3_128bits_reset_withSecret(XXH3_state_t * statePtr, void const * secret, size_t secretSize)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSecret(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_128bits_reset_withSecret(statePtr.address(), memAddress(secret), secret.remaining());
    }

    // --- [ XXH3_128bits_update ] ---

    /** {@code XXH_errorcode XXH3_128bits_update(XXH3_state_t * statePtr, void const * input, size_t length)} */
    public static native int nXXH3_128bits_update(long statePtr, long input, long length);

    /** {@code XXH_errorcode XXH3_128bits_update(XXH3_state_t * statePtr, void const * input, size_t length)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_update(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") @Nullable ByteBuffer input) {
        return nXXH3_128bits_update(statePtr.address(), memAddressSafe(input), remainingSafe(input));
    }

    // --- [ XXH3_128bits_digest ] ---

    /** {@code XXH128_hash_t XXH3_128bits_digest(XXH3_state_t const * statePtr)} */
    public static native void nXXH3_128bits_digest(long statePtr, long __result);

    /** {@code XXH128_hash_t XXH3_128bits_digest(XXH3_state_t const * statePtr)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_digest(@NativeType("XXH3_state_t const *") XXH3State statePtr, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH3_128bits_digest(statePtr.address(), __result.address());
        return __result;
    }

    // --- [ XXH128_isEqual ] ---

    /** {@code int XXH128_isEqual(XXH128_hash_t h1, XXH128_hash_t h2)} */
    public static native int nXXH128_isEqual(long h1, long h2);

    /** {@code int XXH128_isEqual(XXH128_hash_t h1, XXH128_hash_t h2)} */
    @NativeType("int")
    public static boolean XXH128_isEqual(@NativeType("XXH128_hash_t") XXH128Hash h1, @NativeType("XXH128_hash_t") XXH128Hash h2) {
        return nXXH128_isEqual(h1.address(), h2.address()) != 0;
    }

    // --- [ XXH128_cmp ] ---

    /** {@code int XXH128_cmp(void const * h128_1, void const * h128_2)} */
    public static native int nXXH128_cmp(long h128_1, long h128_2);

    /** {@code int XXH128_cmp(void const * h128_1, void const * h128_2)} */
    public static int XXH128_cmp(@NativeType("void const *") ByteBuffer h128_1, @NativeType("void const *") ByteBuffer h128_2) {
        if (CHECKS) {
            check(h128_1, XXH128Hash.SIZEOF);
            check(h128_2, XXH128Hash.SIZEOF);
        }
        return nXXH128_cmp(memAddress(h128_1), memAddress(h128_2));
    }

    // --- [ XXH128_canonicalFromHash ] ---

    /** {@code void XXH128_canonicalFromHash(XXH128_canonical_t * dst, XXH128_hash_t hash)} */
    public static native void nXXH128_canonicalFromHash(long dst, long hash);

    /** {@code void XXH128_canonicalFromHash(XXH128_canonical_t * dst, XXH128_hash_t hash)} */
    public static void XXH128_canonicalFromHash(@NativeType("XXH128_canonical_t *") XXH128Canonical dst, @NativeType("XXH128_hash_t") XXH128Hash hash) {
        nXXH128_canonicalFromHash(dst.address(), hash.address());
    }

    // --- [ XXH128_hashFromCanonical ] ---

    /** {@code XXH128_hash_t XXH128_hashFromCanonical(XXH128_canonical_t const * src)} */
    public static native void nXXH128_hashFromCanonical(long src, long __result);

    /** {@code XXH128_hash_t XXH128_hashFromCanonical(XXH128_canonical_t const * src)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH128_hashFromCanonical(@NativeType("XXH128_canonical_t const *") XXH128Canonical src, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH128_hashFromCanonical(src.address(), __result.address());
        return __result;
    }

    // --- [ XXH3_INITSTATE ] ---

    /** {@code void XXH3_INITSTATE(XXH3_state_t * statePtr)} */
    public static native void nXXH3_INITSTATE(long statePtr);

    /** {@code void XXH3_INITSTATE(XXH3_state_t * statePtr)} */
    public static void XXH3_INITSTATE(@NativeType("XXH3_state_t *") XXH3State statePtr) {
        nXXH3_INITSTATE(statePtr.address());
    }

    // --- [ XXH128 ] ---

    /** {@code XXH128_hash_t XXH128(void const * data, size_t len, XXH64_hash_t seed)} */
    public static native void nXXH128(long data, long len, long seed, long __result);

    /** {@code XXH128_hash_t XXH128(void const * data, size_t len, XXH64_hash_t seed)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH128(@NativeType("void const *") ByteBuffer data, @NativeType("XXH64_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        nXXH128(memAddress(data), data.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_generateSecret ] ---

    /** {@code XXH_errorcode XXH3_generateSecret(void * secretBuffer, size_t secretSize, void const * customSeed, size_t customSeedSize)} */
    public static native int nXXH3_generateSecret(long secretBuffer, long secretSize, long customSeed, long customSeedSize);

    /** {@code XXH_errorcode XXH3_generateSecret(void * secretBuffer, size_t secretSize, void const * customSeed, size_t customSeedSize)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_generateSecret(@NativeType("void *") ByteBuffer secretBuffer, @NativeType("void const *") @Nullable ByteBuffer customSeed) {
        if (CHECKS) {
            check(secretBuffer, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_generateSecret(memAddress(secretBuffer), secretBuffer.remaining(), memAddressSafe(customSeed), remainingSafe(customSeed));
    }

    // --- [ XXH3_generateSecret_fromSeed ] ---

    /** {@code void XXH3_generateSecret_fromSeed(void * secretBuffer, XXH64_hash_t seed)} */
    public static native void nXXH3_generateSecret_fromSeed(long secretBuffer, long seed);

    /** {@code void XXH3_generateSecret_fromSeed(void * secretBuffer, XXH64_hash_t seed)} */
    public static void XXH3_generateSecret_fromSeed(@NativeType("void *") ByteBuffer secretBuffer, @NativeType("XXH64_hash_t") long seed) {
        if (CHECKS) {
            check(secretBuffer, XXH3_SECRET_DEFAULT_SIZE);
        }
        nXXH3_generateSecret_fromSeed(memAddress(secretBuffer), seed);
    }

    // --- [ XXH3_64bits_withSecretandSeed ] ---

    /** {@code XXH64_hash_t XXH3_64bits_withSecretandSeed(void const * data, size_t len, void const * secret, size_t secretSize, XXH64_hash_t seed)} */
    public static native long nXXH3_64bits_withSecretandSeed(long data, long len, long secret, long secretSize, long seed);

    /** {@code XXH64_hash_t XXH3_64bits_withSecretandSeed(void const * data, size_t len, void const * secret, size_t secretSize, XXH64_hash_t seed)} */
    @NativeType("XXH64_hash_t")
    public static long XXH3_64bits_withSecretandSeed(@NativeType("void const *") @Nullable ByteBuffer data, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_withSecretandSeed(memAddressSafe(data), remainingSafe(data), memAddress(secret), secret.remaining(), seed);
    }

    // --- [ XXH3_128bits_withSecretandSeed ] ---

    /** {@code XXH128_hash_t XXH3_128bits_withSecretandSeed(void const * input, size_t length, void const * secret, size_t secretSize, XXH64_hash_t seed)} */
    public static native void nXXH3_128bits_withSecretandSeed(long input, long length, long secret, long secretSize, long seed, long __result);

    /** {@code XXH128_hash_t XXH3_128bits_withSecretandSeed(void const * input, size_t length, void const * secret, size_t secretSize, XXH64_hash_t seed)} */
    @NativeType("XXH128_hash_t")
    public static XXH128Hash XXH3_128bits_withSecretandSeed(@NativeType("void const *") @Nullable ByteBuffer input, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed, @NativeType("XXH128_hash_t") XXH128Hash __result) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        nXXH3_128bits_withSecretandSeed(memAddressSafe(input), remainingSafe(input), memAddress(secret), secret.remaining(), seed, __result.address());
        return __result;
    }

    // --- [ XXH3_64bits_reset_withSecretandSeed ] ---

    /** {@code XXH_errorcode XXH3_64bits_reset_withSecretandSeed(XXH3_state_t * statePtr, void const * secret, size_t secretSize, XXH64_hash_t seed64)} */
    public static native int nXXH3_64bits_reset_withSecretandSeed(long statePtr, long secret, long secretSize, long seed64);

    /** {@code XXH_errorcode XXH3_64bits_reset_withSecretandSeed(XXH3_state_t * statePtr, void const * secret, size_t secretSize, XXH64_hash_t seed64)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_64bits_reset_withSecretandSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed64) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_64bits_reset_withSecretandSeed(statePtr.address(), memAddress(secret), secret.remaining(), seed64);
    }

    // --- [ XXH3_128bits_reset_withSecretandSeed ] ---

    /** {@code XXH_errorcode XXH3_128bits_reset_withSecretandSeed(XXH3_state_t * statePtr, void const * secret, size_t secretSize, XXH64_hash_t seed64)} */
    public static native int nXXH3_128bits_reset_withSecretandSeed(long statePtr, long secret, long secretSize, long seed64);

    /** {@code XXH_errorcode XXH3_128bits_reset_withSecretandSeed(XXH3_state_t * statePtr, void const * secret, size_t secretSize, XXH64_hash_t seed64)} */
    @NativeType("XXH_errorcode")
    public static int XXH3_128bits_reset_withSecretandSeed(@NativeType("XXH3_state_t *") XXH3State statePtr, @NativeType("void const *") ByteBuffer secret, @NativeType("XXH64_hash_t") long seed64) {
        if (CHECKS) {
            check(secret, XXH3_SECRET_SIZE_MIN);
        }
        return nXXH3_128bits_reset_withSecretandSeed(statePtr.address(), memAddress(secret), secret.remaining(), seed64);
    }

}