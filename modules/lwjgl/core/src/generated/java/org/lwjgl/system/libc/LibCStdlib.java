/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class LibCStdlib {

    static { Library.initialize(); }

    protected LibCStdlib() {
        throw new UnsupportedOperationException();
    }

    // --- [ malloc ] ---

    /** {@code void * malloc(size_t size)} */
    public static native long nmalloc(long size);

    /** {@code void * malloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer malloc(@NativeType("size_t") long size) {
        long __result = nmalloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ calloc ] ---

    /** {@code void * calloc(size_t nmemb, size_t size)} */
    public static native long ncalloc(long nmemb, long size);

    /** {@code void * calloc(size_t nmemb, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer calloc(@NativeType("size_t") long nmemb, @NativeType("size_t") long size) {
        long __result = ncalloc(nmemb, size);
        return memByteBufferSafe(__result, (int)nmemb * (int)size);
    }

    // --- [ realloc ] ---

    /** {@code void * realloc(void * ptr, size_t size)} */
    public static native long nrealloc(long ptr, long size);

    /** {@code void * realloc(void * ptr, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer realloc(@NativeType("void *") @Nullable ByteBuffer ptr, @NativeType("size_t") long size) {
        long __result = nrealloc(memAddressSafe(ptr), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ free ] ---

    /** {@code void free(void * ptr)} */
    public static native void nfree(long ptr);

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable ByteBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable ShortBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable IntBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable LongBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable FloatBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable DoubleBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    /** {@code void free(void * ptr)} */
    public static void free(@NativeType("void *") @Nullable PointerBuffer ptr) {
        nfree(memAddressSafe(ptr));
    }

    // --- [ aligned_alloc ] ---

    /** {@code void * aligned_alloc(size_t alignment, size_t size)} */
    public static native long naligned_alloc(long alignment, long size);

    /** {@code void * aligned_alloc(size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = naligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ aligned_free ] ---

    /** {@code void aligned_free(void * ptr)} */
    public static native void naligned_free(long ptr);

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable ByteBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable ShortBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable IntBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable LongBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable FloatBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable DoubleBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

    /** {@code void aligned_free(void * ptr)} */
    public static void aligned_free(@NativeType("void *") @Nullable PointerBuffer ptr) {
        naligned_free(memAddressSafe(ptr));
    }

}