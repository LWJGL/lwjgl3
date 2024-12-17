/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class STBImage {

    static { LibSTB.initialize(); }

    public static final int
        STBI_default    = 0,
        STBI_grey       = 1,
        STBI_grey_alpha = 2,
        STBI_rgb        = 3,
        STBI_rgb_alpha  = 4;

    protected STBImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ stbi_load ] ---

    /** {@code stbi_uc * stbi_load(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load(long filename, long x, long y, long channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load(memAddress(filename), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    /** {@code stbi_uc * stbi_load(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load(filenameEncoded, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
            return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_load_from_memory ] ---

    /** {@code stbi_uc * stbi_load_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_from_memory(long buffer, int len, long x, long y, long channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_from_callbacks ] ---

    /** {@code stbi_uc * stbi_load_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_from_callbacks(long clbk, long user, long x, long y, long channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_gif_from_memory ] ---

    /** {@code stbi_uc * stbi_load_gif_from_memory(stbi_uc const * buffer, int len, int ** delays, int * x, int * y, int * z, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_gif_from_memory(long buffer, int len, long delays, long x, long y, long z, long channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load_gif_from_memory(stbi_uc const * buffer, int len, int ** delays, int * x, int * y, int * z, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load_gif_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int **") PointerBuffer delays, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer z, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(delays, 1);
            check(x, 1);
            check(y, 1);
            check(z, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_gif_from_memory(memAddress(buffer), buffer.remaining(), memAddress(delays), memAddress(x), memAddress(y), memAddress(z), memAddress(channels_in_file), desired_channels);
        return memByteBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * z.get(z.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_16 ] ---

    /** {@code stbi_us * stbi_load_16(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_16(long filename, long x, long y, long channels_in_file, int desired_channels);

    /** {@code stbi_us * stbi_load_16(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16(memAddress(filename), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    /** {@code stbi_us * stbi_load_16(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load_16(filenameEncoded, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
            return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_load_16_from_memory ] ---

    /** {@code stbi_us * stbi_load_16_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_16_from_memory(long buffer, int len, long x, long y, long channels_in_file, int desired_channels);

    /** {@code stbi_us * stbi_load_16_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_load_16_from_callbacks ] ---

    /** {@code stbi_us * stbi_load_16_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_16_from_callbacks(long clbk, long user, long x, long y, long channels_in_file, int desired_channels);

    /** {@code stbi_us * stbi_load_16_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_16_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memShortBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_loadf ] ---

    /** {@code float * stbi_loadf(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_loadf(long filename, long x, long y, long channels_in_file, int desired_channels);

    /** {@code float * stbi_loadf(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf(memAddress(filename), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    /** {@code float * stbi_loadf(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_loadf(filenameEncoded, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
            return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_loadf_from_memory ] ---

    /** {@code float * stbi_loadf_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_loadf_from_memory(long buffer, int len, long x, long y, long channels_in_file, int desired_channels);

    /** {@code float * stbi_loadf_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_loadf_from_callbacks ] ---

    /** {@code float * stbi_loadf_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_loadf_from_callbacks(long clbk, long user, long x, long y, long channels_in_file, int desired_channels);

    /** {@code float * stbi_loadf_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_loadf_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(channels_in_file), desired_channels);
        return memFloatBufferSafe(__result, x.get(x.position()) * y.get(y.position()) * (desired_channels != 0 ? desired_channels : channels_in_file.get(channels_in_file.position())));
    }

    // --- [ stbi_hdr_to_ldr_gamma ] ---

    /** {@code void stbi_hdr_to_ldr_gamma(float gamma)} */
    public static native void stbi_hdr_to_ldr_gamma(float gamma);

    // --- [ stbi_hdr_to_ldr_scale ] ---

    /** {@code void stbi_hdr_to_ldr_scale(float scale)} */
    public static native void stbi_hdr_to_ldr_scale(float scale);

    // --- [ stbi_ldr_to_hdr_gamma ] ---

    /** {@code void stbi_ldr_to_hdr_gamma(float gamma)} */
    public static native void stbi_ldr_to_hdr_gamma(float gamma);

    // --- [ stbi_ldr_to_hdr_scale ] ---

    /** {@code void stbi_ldr_to_hdr_scale(float scale)} */
    public static native void stbi_ldr_to_hdr_scale(float scale);

    // --- [ stbi_is_hdr ] ---

    /** {@code int stbi_is_hdr(char const * filename)} */
    public static native int nstbi_is_hdr(long filename);

    /** {@code int stbi_is_hdr(char const * filename)} */
    @NativeType("int")
    public static boolean stbi_is_hdr(@NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nstbi_is_hdr(memAddress(filename)) != 0;
    }

    /** {@code int stbi_is_hdr(char const * filename)} */
    @NativeType("int")
    public static boolean stbi_is_hdr(@NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_is_hdr(filenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_is_hdr_from_memory ] ---

    /** {@code int stbi_is_hdr_from_memory(stbi_uc const * buffer, int len)} */
    public static native int nstbi_is_hdr_from_memory(long buffer, int len);

    /** {@code int stbi_is_hdr_from_memory(stbi_uc const * buffer, int len)} */
    @NativeType("int")
    public static boolean stbi_is_hdr_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer) {
        return nstbi_is_hdr_from_memory(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ stbi_is_hdr_from_callbacks ] ---

    /** {@code int stbi_is_hdr_from_callbacks(stbi_io_callbacks const * clbk, void * user)} */
    public static native int nstbi_is_hdr_from_callbacks(long clbk, long user);

    /** {@code int stbi_is_hdr_from_callbacks(stbi_io_callbacks const * clbk, void * user)} */
    @NativeType("int")
    public static boolean stbi_is_hdr_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user) {
        if (CHECKS) {
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_is_hdr_from_callbacks(clbk.address(), user) != 0;
    }

    // --- [ stbi_failure_reason ] ---

    /** {@code char const * stbi_failure_reason(void)} */
    public static native long nstbi_failure_reason();

    /** {@code char const * stbi_failure_reason(void)} */
    @NativeType("char const *")
    public static @Nullable String stbi_failure_reason() {
        long __result = nstbi_failure_reason();
        return memASCIISafe(__result);
    }

    // --- [ stbi_image_free ] ---

    /** {@code void stbi_image_free(void * retval_from_stbi_load)} */
    public static native void nstbi_image_free(long retval_from_stbi_load);

    /** {@code void stbi_image_free(void * retval_from_stbi_load)} */
    public static void stbi_image_free(@NativeType("void *") ByteBuffer retval_from_stbi_load) {
        nstbi_image_free(memAddress(retval_from_stbi_load));
    }

    /** {@code void stbi_image_free(void * retval_from_stbi_load)} */
    public static void stbi_image_free(@NativeType("void *") ShortBuffer retval_from_stbi_load) {
        nstbi_image_free(memAddress(retval_from_stbi_load));
    }

    /** {@code void stbi_image_free(void * retval_from_stbi_load)} */
    public static void stbi_image_free(@NativeType("void *") FloatBuffer retval_from_stbi_load) {
        nstbi_image_free(memAddress(retval_from_stbi_load));
    }

    // --- [ stbi_info ] ---

    /** {@code int stbi_info(char const * filename, int * x, int * y, int * comp)} */
    public static native int nstbi_info(long filename, long x, long y, long comp);

    /** {@code int stbi_info(char const * filename, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info(memAddress(filename), memAddress(x), memAddress(y), memAddress(comp)) != 0;
    }

    /** {@code int stbi_info(char const * filename, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_info(filenameEncoded, memAddress(x), memAddress(y), memAddress(comp)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_info_from_memory ] ---

    /** {@code int stbi_info_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * comp)} */
    public static native int nstbi_info_from_memory(long buffer, int len, long x, long y, long comp);

    /** {@code int stbi_info_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info_from_memory(memAddress(buffer), buffer.remaining(), memAddress(x), memAddress(y), memAddress(comp)) != 0;
    }

    // --- [ stbi_info_from_callbacks ] ---

    /** {@code int stbi_info_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * comp)} */
    public static native int nstbi_info_from_callbacks(long clbk, long user, long x, long y, long comp);

    /** {@code int stbi_info_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y, @NativeType("int *") IntBuffer comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_info_from_callbacks(clbk.address(), user, memAddress(x), memAddress(y), memAddress(comp)) != 0;
    }

    // --- [ stbi_is_16_bit ] ---

    /** {@code int stbi_is_16_bit(char const * filename)} */
    public static native int nstbi_is_16_bit(long filename);

    /** {@code int stbi_is_16_bit(char const * filename)} */
    @NativeType("int")
    public static boolean stbi_is_16_bit(@NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nstbi_is_16_bit(memAddress(filename)) != 0;
    }

    /** {@code int stbi_is_16_bit(char const * filename)} */
    @NativeType("int")
    public static boolean stbi_is_16_bit(@NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_is_16_bit(filenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_is_16_bit_from_memory ] ---

    /** {@code int stbi_is_16_bit_from_memory(stbi_uc const * buffer, int len)} */
    public static native int nstbi_is_16_bit_from_memory(long buffer, int len);

    /** {@code int stbi_is_16_bit_from_memory(stbi_uc const * buffer, int len)} */
    @NativeType("int")
    public static boolean stbi_is_16_bit_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer) {
        return nstbi_is_16_bit_from_memory(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ stbi_is_16_bit_from_callbacks ] ---

    /** {@code int stbi_is_16_bit_from_callbacks(stbi_io_callbacks const * clbk, void * user)} */
    public static native int nstbi_is_16_bit_from_callbacks(long clbk, long user);

    /** {@code int stbi_is_16_bit_from_callbacks(stbi_io_callbacks const * clbk, void * user)} */
    @NativeType("int")
    public static boolean stbi_is_16_bit_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user) {
        if (CHECKS) {
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_is_16_bit_from_callbacks(clbk.address(), user) != 0;
    }

    // --- [ stbi_set_unpremultiply_on_load ] ---

    /** {@code void stbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply)} */
    public static native void nstbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply);

    /** {@code void stbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply)} */
    public static void stbi_set_unpremultiply_on_load(@NativeType("int") boolean flag_true_if_should_unpremultiply) {
        nstbi_set_unpremultiply_on_load(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    // --- [ stbi_convert_iphone_png_to_rgb ] ---

    /** {@code void stbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert)} */
    public static native void nstbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert);

    /** {@code void stbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert)} */
    public static void stbi_convert_iphone_png_to_rgb(@NativeType("int") boolean flag_true_if_should_convert) {
        nstbi_convert_iphone_png_to_rgb(flag_true_if_should_convert ? 1 : 0);
    }

    // --- [ stbi_set_flip_vertically_on_load ] ---

    /** {@code void stbi_set_flip_vertically_on_load(int flag_true_if_should_flip)} */
    public static native void nstbi_set_flip_vertically_on_load(int flag_true_if_should_flip);

    /** {@code void stbi_set_flip_vertically_on_load(int flag_true_if_should_flip)} */
    public static void stbi_set_flip_vertically_on_load(@NativeType("int") boolean flag_true_if_should_flip) {
        nstbi_set_flip_vertically_on_load(flag_true_if_should_flip ? 1 : 0);
    }

    // --- [ stbi_set_unpremultiply_on_load_thread ] ---

    /** {@code void stbi_set_unpremultiply_on_load_thread(int flag_true_if_should_unpremultiply)} */
    public static native void nstbi_set_unpremultiply_on_load_thread(int flag_true_if_should_unpremultiply);

    /** {@code void stbi_set_unpremultiply_on_load_thread(int flag_true_if_should_unpremultiply)} */
    public static void stbi_set_unpremultiply_on_load_thread(@NativeType("int") boolean flag_true_if_should_unpremultiply) {
        nstbi_set_unpremultiply_on_load_thread(flag_true_if_should_unpremultiply ? 1 : 0);
    }

    // --- [ stbi_convert_iphone_png_to_rgb_thread ] ---

    /** {@code void stbi_convert_iphone_png_to_rgb_thread(int flag_true_if_should_convert)} */
    public static native void nstbi_convert_iphone_png_to_rgb_thread(int flag_true_if_should_convert);

    /** {@code void stbi_convert_iphone_png_to_rgb_thread(int flag_true_if_should_convert)} */
    public static void stbi_convert_iphone_png_to_rgb_thread(@NativeType("int") boolean flag_true_if_should_convert) {
        nstbi_convert_iphone_png_to_rgb_thread(flag_true_if_should_convert ? 1 : 0);
    }

    // --- [ stbi_set_flip_vertically_on_load_thread ] ---

    /** {@code void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip)} */
    public static native void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip);

    // --- [ stbi_zlib_decode_malloc_guesssize ] ---

    /** {@code char * stbi_zlib_decode_malloc_guesssize(char const * buffer, int len, int initial_size, int * outlen)} */
    public static native long nstbi_zlib_decode_malloc_guesssize(long buffer, int len, int initial_size, long outlen);

    /** {@code char * stbi_zlib_decode_malloc_guesssize(char const * buffer, int len, int initial_size, int * outlen)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer stbi_zlib_decode_malloc_guesssize(@NativeType("char const *") ByteBuffer buffer, int initial_size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc_guesssize(memAddress(buffer), buffer.remaining(), initial_size, memAddress(outlen));
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_malloc_guesssize_headerflag ] ---

    /** {@code char * stbi_zlib_decode_malloc_guesssize_headerflag(char const * buffer, int len, int initial_size, int * outlen, int parse_header)} */
    public static native long nstbi_zlib_decode_malloc_guesssize_headerflag(long buffer, int len, int initial_size, long outlen, int parse_header);

    /** {@code char * stbi_zlib_decode_malloc_guesssize_headerflag(char const * buffer, int len, int initial_size, int * outlen, int parse_header)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer stbi_zlib_decode_malloc_guesssize_headerflag(@NativeType("char const *") ByteBuffer buffer, int initial_size, @NativeType("int") boolean parse_header) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc_guesssize_headerflag(memAddress(buffer), buffer.remaining(), initial_size, memAddress(outlen), parse_header ? 1 : 0);
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_malloc ] ---

    /** {@code char * stbi_zlib_decode_malloc(char const * buffer, int len, int * outlen)} */
    public static native long nstbi_zlib_decode_malloc(long buffer, int len, long outlen);

    /** {@code char * stbi_zlib_decode_malloc(char const * buffer, int len, int * outlen)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer stbi_zlib_decode_malloc(@NativeType("char const *") ByteBuffer buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_malloc(memAddress(buffer), buffer.remaining(), memAddress(outlen));
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_buffer ] ---

    /** {@code int stbi_zlib_decode_buffer(char * obuffer, int olen, char const * ibuffer, int ilen)} */
    public static native int nstbi_zlib_decode_buffer(long obuffer, int olen, long ibuffer, int ilen);

    /** {@code int stbi_zlib_decode_buffer(char * obuffer, int olen, char const * ibuffer, int ilen)} */
    public static int stbi_zlib_decode_buffer(@NativeType("char *") ByteBuffer obuffer, @NativeType("char const *") ByteBuffer ibuffer) {
        return nstbi_zlib_decode_buffer(memAddress(obuffer), obuffer.remaining(), memAddress(ibuffer), ibuffer.remaining());
    }

    // --- [ stbi_zlib_decode_noheader_malloc ] ---

    /** {@code char * stbi_zlib_decode_noheader_malloc(char const * buffer, int len, int * outlen)} */
    public static native long nstbi_zlib_decode_noheader_malloc(long buffer, int len, long outlen);

    /** {@code char * stbi_zlib_decode_noheader_malloc(char const * buffer, int len, int * outlen)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer stbi_zlib_decode_noheader_malloc(@NativeType("char const *") ByteBuffer buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outlen = stack.callocInt(1);
            long __result = nstbi_zlib_decode_noheader_malloc(memAddress(buffer), buffer.remaining(), memAddress(outlen));
            return memByteBufferSafe(__result, outlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_zlib_decode_noheader_buffer ] ---

    /** {@code int stbi_zlib_decode_noheader_buffer(char * obuffer, int olen, char const * ibuffer, int ilen)} */
    public static native int nstbi_zlib_decode_noheader_buffer(long obuffer, int olen, long ibuffer, int ilen);

    /** {@code int stbi_zlib_decode_noheader_buffer(char * obuffer, int olen, char const * ibuffer, int ilen)} */
    public static int stbi_zlib_decode_noheader_buffer(@NativeType("char *") ByteBuffer obuffer, @NativeType("char const *") ByteBuffer ibuffer) {
        return nstbi_zlib_decode_noheader_buffer(memAddress(obuffer), obuffer.remaining(), memAddress(ibuffer), ibuffer.remaining());
    }

    /** {@code stbi_uc * stbi_load(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load(long filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load(memAddress(filename), x, y, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code stbi_uc * stbi_load(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load(filenameEncoded, x, y, channels_in_file, desired_channels);
            return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code stbi_uc * stbi_load_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_from_memory(long buffer, int len, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_from_memory(memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code stbi_uc * stbi_load_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_from_callbacks(long clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code stbi_uc * stbi_load_gif_from_memory(stbi_uc const * buffer, int len, int ** delays, int * x, int * y, int * z, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_gif_from_memory(long buffer, int len, long delays, int[] x, int[] y, int[] z, int[] channels_in_file, int desired_channels);

    /** {@code stbi_uc * stbi_load_gif_from_memory(stbi_uc const * buffer, int len, int ** delays, int * x, int * y, int * z, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_uc *")
    public static @Nullable ByteBuffer stbi_load_gif_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int **") PointerBuffer delays, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] z, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(delays, 1);
            check(x, 1);
            check(y, 1);
            check(z, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_gif_from_memory(memAddress(buffer), buffer.remaining(), memAddress(delays), x, y, z, channels_in_file, desired_channels);
        return memByteBufferSafe(__result, x[0] * y[0] * z[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code stbi_us * stbi_load_16(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_16(long filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code stbi_us * stbi_load_16(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16(memAddress(filename), x, y, channels_in_file, desired_channels);
        return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code stbi_us * stbi_load_16(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_load_16(filenameEncoded, x, y, channels_in_file, desired_channels);
            return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code stbi_us * stbi_load_16_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_16_from_memory(long buffer, int len, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code stbi_us * stbi_load_16_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_load_16_from_memory(memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code stbi_us * stbi_load_16_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_load_16_from_callbacks(long clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code stbi_us * stbi_load_16_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("stbi_us *")
    public static @Nullable ShortBuffer stbi_load_16_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_load_16_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return memShortBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code float * stbi_loadf(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_loadf(long filename, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code float * stbi_loadf(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf(memAddress(filename), x, y, channels_in_file, desired_channels);
        return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code float * stbi_loadf(char const * filename, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = nstbi_loadf(filenameEncoded, x, y, channels_in_file, desired_channels);
            return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code float * stbi_loadf_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_loadf_from_memory(long buffer, int len, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code float * stbi_loadf_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
        }
        long __result = nstbi_loadf_from_memory(memAddress(buffer), buffer.remaining(), x, y, channels_in_file, desired_channels);
        return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code float * stbi_loadf_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    public static native long nstbi_loadf_from_callbacks(long clbk, long user, int[] x, int[] y, int[] channels_in_file, int desired_channels);

    /** {@code float * stbi_loadf_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * channels_in_file, int desired_channels)} */
    @NativeType("float *")
    public static @Nullable FloatBuffer stbi_loadf_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] channels_in_file, int desired_channels) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(channels_in_file, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        long __result = nstbi_loadf_from_callbacks(clbk.address(), user, x, y, channels_in_file, desired_channels);
        return memFloatBufferSafe(__result, x[0] * y[0] * (desired_channels != 0 ? desired_channels : channels_in_file[0]));
    }

    /** {@code int stbi_info(char const * filename, int * x, int * y, int * comp)} */
    public static native int nstbi_info(long filename, int[] x, int[] y, int[] comp);

    /** {@code int stbi_info(char const * filename, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            checkNT1(filename);
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info(memAddress(filename), x, y, comp) != 0;
    }

    /** {@code int stbi_info(char const * filename, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_info(filenameEncoded, x, y, comp) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code int stbi_info_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * comp)} */
    public static native int nstbi_info_from_memory(long buffer, int len, int[] x, int[] y, int[] comp);

    /** {@code int stbi_info_from_memory(stbi_uc const * buffer, int len, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info_from_memory(@NativeType("stbi_uc const *") ByteBuffer buffer, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
        }
        return nstbi_info_from_memory(memAddress(buffer), buffer.remaining(), x, y, comp) != 0;
    }

    /** {@code int stbi_info_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * comp)} */
    public static native int nstbi_info_from_callbacks(long clbk, long user, int[] x, int[] y, int[] comp);

    /** {@code int stbi_info_from_callbacks(stbi_io_callbacks const * clbk, void * user, int * x, int * y, int * comp)} */
    @NativeType("int")
    public static boolean stbi_info_from_callbacks(@NativeType("stbi_io_callbacks const *") STBIIOCallbacks clbk, @NativeType("void *") long user, @NativeType("int *") int[] x, @NativeType("int *") int[] y, @NativeType("int *") int[] comp) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(comp, 1);
            STBIIOCallbacks.validate(clbk.address());
        }
        return nstbi_info_from_callbacks(clbk.address(), user, x, y, comp) != 0;
    }

}