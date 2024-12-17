/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MSDFGenExt {

    static { LibMsdfGen.initialize(); }

    public static final int
        MSDF_FONT_SCALING_NONE          = 0,
        MSDF_FONT_SCALING_EM_NORMALIZED = 1,
        MSDF_FONT_SCALING_LEGACY        = 2;

    protected MSDFGenExt() {
        throw new UnsupportedOperationException();
    }

    // --- [ msdf_ft_set_load_callback ] ---

    /** {@code int msdf_ft_set_load_callback(void * (*) (char const *) callback)} */
    public static native int nmsdf_ft_set_load_callback(long callback);

    /** {@code int msdf_ft_set_load_callback(void * (*) (char const *) callback)} */
    public static int msdf_ft_set_load_callback(@NativeType("void * (*) (char const *)") MSDFGenFTLoadCallbackI callback) {
        return nmsdf_ft_set_load_callback(callback.address());
    }

    // --- [ msdf_ft_get_load_callback ] ---

    /** {@code void * (*) (char const *) msdf_ft_get_load_callback(void)} */
    public static native long nmsdf_ft_get_load_callback();

    /** {@code void * (*) (char const *) msdf_ft_get_load_callback(void)} */
    @NativeType("void * (*) (char const *)")
    public static @Nullable MSDFGenFTLoadCallback msdf_ft_get_load_callback() {
        return MSDFGenFTLoadCallback.createSafe(nmsdf_ft_get_load_callback());
    }

    // --- [ msdf_ft_init ] ---

    /** {@code int msdf_ft_init(msdf_ft_handle * handle)} */
    public static native int nmsdf_ft_init(long handle);

    /** {@code int msdf_ft_init(msdf_ft_handle * handle)} */
    public static int msdf_ft_init(@NativeType("msdf_ft_handle *") PointerBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nmsdf_ft_init(memAddress(handle));
    }

    // --- [ msdf_ft_load_font ] ---

    /** {@code int msdf_ft_load_font(msdf_ft_handle handle, char const * fileName, msdf_ft_font_handle * font)} */
    public static native int nmsdf_ft_load_font(long handle, long fileName, long font);

    /** {@code int msdf_ft_load_font(msdf_ft_handle handle, char const * fileName, msdf_ft_font_handle * font)} */
    public static int msdf_ft_load_font(@NativeType("msdf_ft_handle") long handle, @NativeType("char const *") ByteBuffer fileName, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(handle);
            checkNT1(fileName);
            check(font, 1);
        }
        return nmsdf_ft_load_font(handle, memAddress(fileName), memAddress(font));
    }

    /** {@code int msdf_ft_load_font(msdf_ft_handle handle, char const * fileName, msdf_ft_font_handle * font)} */
    public static int msdf_ft_load_font(@NativeType("msdf_ft_handle") long handle, @NativeType("char const *") CharSequence fileName, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(handle);
            check(font, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nmsdf_ft_load_font(handle, fileNameEncoded, memAddress(font));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ msdf_ft_adopt_font ] ---

    /** {@code int msdf_ft_adopt_font(void * face, msdf_ft_font_handle * font)} */
    public static native int nmsdf_ft_adopt_font(long face, long font);

    /** {@code int msdf_ft_adopt_font(void * face, msdf_ft_font_handle * font)} */
    public static int msdf_ft_adopt_font(@NativeType("void *") long face, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(face);
            check(font, 1);
        }
        return nmsdf_ft_adopt_font(face, memAddress(font));
    }

    // --- [ msdf_ft_load_font_data ] ---

    /** {@code int msdf_ft_load_font_data(msdf_ft_handle handle, void const * data, size_t size, msdf_ft_font_handle * font)} */
    public static native int nmsdf_ft_load_font_data(long handle, long data, long size, long font);

    /** {@code int msdf_ft_load_font_data(msdf_ft_handle handle, void const * data, size_t size, msdf_ft_font_handle * font)} */
    public static int msdf_ft_load_font_data(@NativeType("msdf_ft_handle") long handle, @NativeType("void const *") ByteBuffer data, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(handle);
            check(font, 1);
        }
        return nmsdf_ft_load_font_data(handle, memAddress(data), data.remaining(), memAddress(font));
    }

    // --- [ msdf_ft_font_load_glyph ] ---

    /** {@code int msdf_ft_font_load_glyph(msdf_ft_font_handle font, unsigned cp, int coordinateScaling, msdf_shape_handle * shape)} */
    public static native int nmsdf_ft_font_load_glyph(long font, int cp, int coordinateScaling, long shape);

    /** {@code int msdf_ft_font_load_glyph(msdf_ft_font_handle font, unsigned cp, int coordinateScaling, msdf_shape_handle * shape)} */
    public static int msdf_ft_font_load_glyph(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int cp, int coordinateScaling, @NativeType("msdf_shape_handle *") PointerBuffer shape) {
        if (CHECKS) {
            check(font);
            check(shape, 1);
        }
        return nmsdf_ft_font_load_glyph(font, cp, coordinateScaling, memAddress(shape));
    }

    // --- [ msdf_ft_font_load_glyph_by_index ] ---

    /** {@code int msdf_ft_font_load_glyph_by_index(msdf_ft_font_handle font, unsigned index, int coordinateScaling, msdf_shape_handle * shape)} */
    public static native int nmsdf_ft_font_load_glyph_by_index(long font, int index, int coordinateScaling, long shape);

    /** {@code int msdf_ft_font_load_glyph_by_index(msdf_ft_font_handle font, unsigned index, int coordinateScaling, msdf_shape_handle * shape)} */
    public static int msdf_ft_font_load_glyph_by_index(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int index, int coordinateScaling, @NativeType("msdf_shape_handle *") PointerBuffer shape) {
        if (CHECKS) {
            check(font);
            check(shape, 1);
        }
        return nmsdf_ft_font_load_glyph_by_index(font, index, coordinateScaling, memAddress(shape));
    }

    // --- [ msdf_ft_font_get_glyph_index ] ---

    /** {@code int msdf_ft_font_get_glyph_index(msdf_ft_font_handle font, unsigned cp, unsigned * index)} */
    public static native int nmsdf_ft_font_get_glyph_index(long font, int cp, long index);

    /** {@code int msdf_ft_font_get_glyph_index(msdf_ft_font_handle font, unsigned cp, unsigned * index)} */
    public static int msdf_ft_font_get_glyph_index(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int cp, @NativeType("unsigned *") IntBuffer index) {
        if (CHECKS) {
            check(font);
            check(index, 1);
        }
        return nmsdf_ft_font_get_glyph_index(font, cp, memAddress(index));
    }

    // --- [ msdf_ft_font_get_kerning ] ---

    /** {@code int msdf_ft_font_get_kerning(msdf_ft_font_handle font, unsigned cp1, unsigned cp2, double * kerning)} */
    public static native int nmsdf_ft_font_get_kerning(long font, int cp1, int cp2, long kerning);

    /** {@code int msdf_ft_font_get_kerning(msdf_ft_font_handle font, unsigned cp1, unsigned cp2, double * kerning)} */
    public static int msdf_ft_font_get_kerning(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int cp1, @NativeType("unsigned") int cp2, @NativeType("double *") DoubleBuffer kerning) {
        if (CHECKS) {
            check(font);
            check(kerning, 1);
        }
        return nmsdf_ft_font_get_kerning(font, cp1, cp2, memAddress(kerning));
    }

    // --- [ msdf_ft_font_get_kerning_by_index ] ---

    /** {@code int msdf_ft_font_get_kerning_by_index(msdf_ft_font_handle font, unsigned index1, unsigned index2, double * kerning)} */
    public static native int nmsdf_ft_font_get_kerning_by_index(long font, int index1, int index2, long kerning);

    /** {@code int msdf_ft_font_get_kerning_by_index(msdf_ft_font_handle font, unsigned index1, unsigned index2, double * kerning)} */
    public static int msdf_ft_font_get_kerning_by_index(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int index1, @NativeType("unsigned") int index2, @NativeType("double *") DoubleBuffer kerning) {
        if (CHECKS) {
            check(font);
            check(kerning, 1);
        }
        return nmsdf_ft_font_get_kerning_by_index(font, index1, index2, memAddress(kerning));
    }

    // --- [ msdf_ft_font_destroy ] ---

    /** {@code void msdf_ft_font_destroy(msdf_ft_font_handle font)} */
    public static native void nmsdf_ft_font_destroy(long font);

    /** {@code void msdf_ft_font_destroy(msdf_ft_font_handle font)} */
    public static void msdf_ft_font_destroy(@NativeType("msdf_ft_font_handle") long font) {
        if (CHECKS) {
            check(font);
        }
        nmsdf_ft_font_destroy(font);
    }

    // --- [ msdf_ft_deinit ] ---

    /** {@code void msdf_ft_deinit(msdf_ft_handle handle)} */
    public static native void nmsdf_ft_deinit(long handle);

    /** {@code void msdf_ft_deinit(msdf_ft_handle handle)} */
    public static void msdf_ft_deinit(@NativeType("msdf_ft_handle") long handle) {
        if (CHECKS) {
            check(handle);
        }
        nmsdf_ft_deinit(handle);
    }

}