/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class STBImageWrite {

    static { LibSTB.initialize(); }

    protected STBImageWrite() {
        throw new UnsupportedOperationException();
    }

    // --- [ stbi_write_png ] ---

    /** {@code int stbi_write_png(char const * filename, int w, int h, int comp, void const * data, int stride_in_bytes)} */
    public static native int nstbi_write_png(long filename, int w, int h, int comp, long data, int stride_in_bytes);

    /** {@code int stbi_write_png(char const * filename, int w, int h, int comp, void const * data, int stride_in_bytes)} */
    @NativeType("int")
    public static boolean stbi_write_png(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int stride_in_bytes) {
        if (CHECKS) {
            checkNT1(filename);
            check(data, (stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h);
        }
        return nstbi_write_png(memAddress(filename), w, h, comp, memAddress(data), stride_in_bytes) != 0;
    }

    /** {@code int stbi_write_png(char const * filename, int w, int h, int comp, void const * data, int stride_in_bytes)} */
    @NativeType("int")
    public static boolean stbi_write_png(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int stride_in_bytes) {
        if (CHECKS) {
            check(data, (stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_png(filenameEncoded, w, h, comp, memAddress(data), stride_in_bytes) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_write_png_compression_level ] ---

    private static native long nstbi_write_png_compression_level();

    @NativeType("int *")
    private static IntBuffer stbi_write_png_compression_level() {
        long __result = nstbi_write_png_compression_level();
        return memIntBuffer(__result, 1);
    }

    /** {@code int * stbi_write_png_compression_level(void)} */
    public static final IntBuffer stbi_write_png_compression_level = stbi_write_png_compression_level();

    // --- [ stbi_write_force_png_filter ] ---

    private static native long nstbi_write_force_png_filter();

    @NativeType("int *")
    private static IntBuffer stbi_write_force_png_filter() {
        long __result = nstbi_write_force_png_filter();
        return memIntBuffer(__result, 1);
    }

    /** {@code int * stbi_write_force_png_filter(void)} */
    public static final IntBuffer stbi_write_force_png_filter = stbi_write_force_png_filter();

    // --- [ stbi_zlib_compress ] ---

    private static native long nstbi_zlib_compress();

    @NativeType("unsigned char * (*) (unsigned char *, int, int *, int) *")
    private static PointerBuffer stbi_zlib_compress() {
        long __result = nstbi_zlib_compress();
        return memPointerBuffer(__result, 1);
    }

    /** {@code unsigned char * (*) (unsigned char *, int, int *, int) * stbi_zlib_compress(void)} */
    public static final PointerBuffer stbi_zlib_compress = stbi_zlib_compress();

    // --- [ stbi_write_bmp ] ---

    /** {@code int stbi_write_bmp(char const * filename, int w, int h, int comp, void const * data)} */
    public static native int nstbi_write_bmp(long filename, int w, int h, int comp, long data);

    /** {@code int stbi_write_bmp(char const * filename, int w, int h, int comp, void const * data)} */
    @NativeType("int")
    public static boolean stbi_write_bmp(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            checkNT1(filename);
            check(data, w * h * comp);
        }
        return nstbi_write_bmp(memAddress(filename), w, h, comp, memAddress(data)) != 0;
    }

    /** {@code int stbi_write_bmp(char const * filename, int w, int h, int comp, void const * data)} */
    @NativeType("int")
    public static boolean stbi_write_bmp(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_bmp(filenameEncoded, w, h, comp, memAddress(data)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_write_tga ] ---

    /** {@code int stbi_write_tga(char const * filename, int w, int h, int comp, void const * data)} */
    public static native int nstbi_write_tga(long filename, int w, int h, int comp, long data);

    /** {@code int stbi_write_tga(char const * filename, int w, int h, int comp, void const * data)} */
    @NativeType("int")
    public static boolean stbi_write_tga(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            checkNT1(filename);
            check(data, w * h * comp);
        }
        return nstbi_write_tga(memAddress(filename), w, h, comp, memAddress(data)) != 0;
    }

    /** {@code int stbi_write_tga(char const * filename, int w, int h, int comp, void const * data)} */
    @NativeType("int")
    public static boolean stbi_write_tga(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_tga(filenameEncoded, w, h, comp, memAddress(data)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_write_tga_with_rle ] ---

    private static native long nstbi_write_tga_with_rle();

    @NativeType("int *")
    private static IntBuffer stbi_write_tga_with_rle() {
        long __result = nstbi_write_tga_with_rle();
        return memIntBuffer(__result, 1);
    }

    /** {@code int * stbi_write_tga_with_rle(void)} */
    public static final IntBuffer stbi_write_tga_with_rle = stbi_write_tga_with_rle();

    // --- [ stbi_write_hdr ] ---

    /** {@code int stbi_write_hdr(char const * filename, int w, int h, int comp, float const * data)} */
    public static native int nstbi_write_hdr(long filename, int w, int h, int comp, long data);

    /** {@code int stbi_write_hdr(char const * filename, int w, int h, int comp, float const * data)} */
    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            checkNT1(filename);
            check(data, w * h * comp);
        }
        return nstbi_write_hdr(memAddress(filename), w, h, comp, memAddress(data)) != 0;
    }

    /** {@code int stbi_write_hdr(char const * filename, int w, int h, int comp, float const * data)} */
    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_hdr(filenameEncoded, w, h, comp, memAddress(data)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_write_jpg ] ---

    /** {@code int stbi_write_jpg(char const * filename, int w, int h, int comp, void const * data, int quality)} */
    public static native int nstbi_write_jpg(long filename, int w, int h, int comp, long data, int quality);

    /** {@code int stbi_write_jpg(char const * filename, int w, int h, int comp, void const * data, int quality)} */
    @NativeType("int")
    public static boolean stbi_write_jpg(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int quality) {
        if (CHECKS) {
            checkNT1(filename);
            check(data, w * h * comp);
        }
        return nstbi_write_jpg(memAddress(filename), w, h, comp, memAddress(data), quality) != 0;
    }

    /** {@code int stbi_write_jpg(char const * filename, int w, int h, int comp, void const * data, int quality)} */
    @NativeType("int")
    public static boolean stbi_write_jpg(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int quality) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_jpg(filenameEncoded, w, h, comp, memAddress(data), quality) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbi_write_png_to_func ] ---

    /** {@code int stbi_write_png_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data, int stride_in_bytes)} */
    public static native int nstbi_write_png_to_func(long func, long context, int w, int h, int comp, long data, int stride_in_bytes);

    /** {@code int stbi_write_png_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data, int stride_in_bytes)} */
    @NativeType("int")
    public static boolean stbi_write_png_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int stride_in_bytes) {
        if (CHECKS) {
            check(data, (stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h);
        }
        return nstbi_write_png_to_func(func.address(), context, w, h, comp, memAddress(data), stride_in_bytes) != 0;
    }

    // --- [ stbi_write_bmp_to_func ] ---

    /** {@code int stbi_write_bmp_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data)} */
    public static native int nstbi_write_bmp_to_func(long func, long context, int w, int h, int comp, long data);

    /** {@code int stbi_write_bmp_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data)} */
    @NativeType("int")
    public static boolean stbi_write_bmp_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        return nstbi_write_bmp_to_func(func.address(), context, w, h, comp, memAddress(data)) != 0;
    }

    // --- [ stbi_write_tga_to_func ] ---

    /** {@code int stbi_write_tga_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data)} */
    public static native int nstbi_write_tga_to_func(long func, long context, int w, int h, int comp, long data);

    /** {@code int stbi_write_tga_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data)} */
    @NativeType("int")
    public static boolean stbi_write_tga_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        return nstbi_write_tga_to_func(func.address(), context, w, h, comp, memAddress(data)) != 0;
    }

    // --- [ stbi_write_hdr_to_func ] ---

    /** {@code int stbi_write_hdr_to_func(stbi_write_func * func, void * context, int w, int h, int comp, float const * data)} */
    public static native int nstbi_write_hdr_to_func(long func, long context, int w, int h, int comp, long data);

    /** {@code int stbi_write_hdr_to_func(stbi_write_func * func, void * context, int w, int h, int comp, float const * data)} */
    @NativeType("int")
    public static boolean stbi_write_hdr_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        return nstbi_write_hdr_to_func(func.address(), context, w, h, comp, memAddress(data)) != 0;
    }

    // --- [ stbi_write_jpg_to_func ] ---

    /** {@code int stbi_write_jpg_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data, int quality)} */
    public static native int nstbi_write_jpg_to_func(long func, long context, int w, int h, int comp, long data, int quality);

    /** {@code int stbi_write_jpg_to_func(stbi_write_func * func, void * context, int w, int h, int comp, void const * data, int quality)} */
    public static int stbi_write_jpg_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("void const *") ByteBuffer data, int quality) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        return nstbi_write_jpg_to_func(func.address(), context, w, h, comp, memAddress(data), quality);
    }

    // --- [ stbi_flip_vertically_on_write ] ---

    /** {@code void stbi_flip_vertically_on_write(int flip_boolean)} */
    public static native void nstbi_flip_vertically_on_write(int flip_boolean);

    /** {@code void stbi_flip_vertically_on_write(int flip_boolean)} */
    public static void stbi_flip_vertically_on_write(@NativeType("int") boolean flip_boolean) {
        nstbi_flip_vertically_on_write(flip_boolean ? 1 : 0);
    }

    /** {@code int stbi_write_hdr(char const * filename, int w, int h, int comp, float const * data)} */
    public static native int nstbi_write_hdr(long filename, int w, int h, int comp, float[] data);

    /** {@code int stbi_write_hdr(char const * filename, int w, int h, int comp, float const * data)} */
    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") ByteBuffer filename, int w, int h, int comp, @NativeType("float const *") float[] data) {
        if (CHECKS) {
            checkNT1(filename);
            check(data, w * h * comp);
        }
        return nstbi_write_hdr(memAddress(filename), w, h, comp, data) != 0;
    }

    /** {@code int stbi_write_hdr(char const * filename, int w, int h, int comp, float const * data)} */
    @NativeType("int")
    public static boolean stbi_write_hdr(@NativeType("char const *") CharSequence filename, int w, int h, int comp, @NativeType("float const *") float[] data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstbi_write_hdr(filenameEncoded, w, h, comp, data) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code int stbi_write_hdr_to_func(stbi_write_func * func, void * context, int w, int h, int comp, float const * data)} */
    public static native int nstbi_write_hdr_to_func(long func, long context, int w, int h, int comp, float[] data);

    /** {@code int stbi_write_hdr_to_func(stbi_write_func * func, void * context, int w, int h, int comp, float const * data)} */
    @NativeType("int")
    public static boolean stbi_write_hdr_to_func(@NativeType("stbi_write_func *") STBIWriteCallbackI func, @NativeType("void *") long context, int w, int h, int comp, @NativeType("float const *") float[] data) {
        if (CHECKS) {
            check(data, w * h * comp);
        }
        return nstbi_write_hdr_to_func(func.address(), context, w, h, comp, data) != 0;
    }

}