/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.harfbuzz.HarfBuzz.*;

public class HarfBuzzVector {

    private static final SharedLibrary HARFBUZZ = Library.loadNative(HarfBuzzVector.class, "org.lwjgl.harfbuzz", Configuration.HARFBUZZ_VECTOR_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("harfbuzz-vector")), true);

    /** Contains the function pointers loaded from the harfbuzz {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            draw_create_or_fail               = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_create_or_fail"),
            draw_reference                    = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_reference"),
            draw_destroy                      = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_destroy"),
            draw_set_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_set_user_data"),
            draw_get_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_get_user_data"),
            draw_set_transform                = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_set_transform"),
            draw_get_transform                = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_get_transform"),
            draw_set_scale_factor             = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_set_scale_factor"),
            draw_get_scale_factor             = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_get_scale_factor"),
            draw_set_extents                  = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_set_extents"),
            draw_get_extents                  = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_get_extents"),
            draw_set_glyph_extents            = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_set_glyph_extents"),
            draw_get_funcs                    = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_get_funcs"),
            draw_glyph                        = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_glyph"),
            svg_set_flat                      = apiGetFunctionAddress(HARFBUZZ, "hb_vector_svg_set_flat"),
            svg_set_precision                 = apiGetFunctionAddress(HARFBUZZ, "hb_vector_svg_set_precision"),
            draw_render                       = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_render"),
            draw_reset                        = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_reset"),
            draw_recycle_blob                 = apiGetFunctionAddress(HARFBUZZ, "hb_vector_draw_recycle_blob"),
            paint_create_or_fail              = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_create_or_fail"),
            paint_reference                   = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_reference"),
            paint_destroy                     = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_destroy"),
            paint_set_user_data               = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_user_data"),
            paint_get_user_data               = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_get_user_data"),
            paint_set_transform               = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_transform"),
            paint_get_transform               = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_get_transform"),
            paint_set_scale_factor            = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_scale_factor"),
            paint_get_scale_factor            = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_get_scale_factor"),
            paint_set_extents                 = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_extents"),
            paint_get_extents                 = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_get_extents"),
            paint_set_glyph_extents           = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_glyph_extents"),
            paint_set_foreground              = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_foreground"),
            paint_set_palette                 = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_palette"),
            paint_set_custom_palette_color    = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_set_custom_palette_color"),
            paint_clear_custom_palette_colors = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_clear_custom_palette_colors"),
            paint_get_funcs                   = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_get_funcs"),
            paint_glyph                       = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_glyph"),
            svg_paint_set_flat                = apiGetFunctionAddress(HARFBUZZ, "hb_vector_svg_paint_set_flat"),
            svg_paint_set_precision           = apiGetFunctionAddress(HARFBUZZ, "hb_vector_svg_paint_set_precision"),
            paint_render                      = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_render"),
            paint_reset                       = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_reset"),
            paint_recycle_blob                = apiGetFunctionAddress(HARFBUZZ, "hb_vector_paint_recycle_blob");

    }

    /** Returns the harfbuzz {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HARFBUZZ;
    }

    public static final int
        HB_VECTOR_FORMAT_INVALID = HB_TAG_NONE,
        HB_VECTOR_FORMAT_SVG     = HB_TAG ('s','v','g',' ');

    public static final int
        HB_VECTOR_EXTENTS_MODE_NONE   = 0,
        HB_VECTOR_EXTENTS_MODE_EXPAND = 1;

    protected HarfBuzzVector() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_vector_draw_create_or_fail ] ---

    /** {@code hb_vector_draw_t * hb_vector_draw_create_or_fail(hb_vector_format_t format)} */
    @NativeType("hb_vector_draw_t *")
    public static long hb_vector_draw_create_or_fail(@NativeType("hb_vector_format_t") int format) {
        long __functionAddress = Functions.draw_create_or_fail;
        return invokeP(format, __functionAddress);
    }

    // --- [ hb_vector_draw_reference ] ---

    /** {@code hb_vector_draw_t * hb_vector_draw_reference(hb_vector_draw_t * draw)} */
    @NativeType("hb_vector_draw_t *")
    public static long hb_vector_draw_reference(@NativeType("hb_vector_draw_t *") long draw) {
        long __functionAddress = Functions.draw_reference;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_vector_draw_destroy ] ---

    /** {@code void hb_vector_draw_destroy(hb_vector_draw_t * draw)} */
    public static void hb_vector_draw_destroy(@NativeType("hb_vector_draw_t *") long draw) {
        long __functionAddress = Functions.draw_destroy;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_vector_draw_set_user_data ] ---

    /** {@code hb_bool_t hb_vector_draw_set_user_data(hb_vector_draw_t * draw, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_vector_draw_set_user_data(long draw, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.draw_set_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPPPI(draw, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_vector_draw_set_user_data(hb_vector_draw_t * draw, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_draw_set_user_data(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_vector_draw_set_user_data(draw, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_vector_draw_get_user_data ] ---

    /** {@code void * hb_vector_draw_get_user_data(hb_vector_draw_t * draw, hb_user_data_key_t * key)} */
    public static long nhb_vector_draw_get_user_data(long draw, long key) {
        long __functionAddress = Functions.draw_get_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPP(draw, key, __functionAddress);
    }

    /** {@code void * hb_vector_draw_get_user_data(hb_vector_draw_t * draw, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_vector_draw_get_user_data(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_vector_draw_get_user_data(draw, key.address());
    }

    // --- [ hb_vector_draw_set_transform ] ---

    /** {@code void hb_vector_draw_set_transform(hb_vector_draw_t * draw, float xx, float yx, float xy, float yy, float dx, float dy)} */
    public static void hb_vector_draw_set_transform(@NativeType("hb_vector_draw_t *") long draw, float xx, float yx, float xy, float yy, float dx, float dy) {
        long __functionAddress = Functions.draw_set_transform;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    // --- [ hb_vector_draw_get_transform ] ---

    /** {@code void hb_vector_draw_get_transform(hb_vector_draw_t * draw, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void nhb_vector_draw_get_transform(long draw, long xx, long yx, long xy, long yy, long dx, long dy) {
        long __functionAddress = Functions.draw_get_transform;
        if (CHECKS) {
            check(draw);
        }
        invokePPPPPPPV(draw, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    /** {@code void hb_vector_draw_get_transform(hb_vector_draw_t * draw, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void hb_vector_draw_get_transform(@NativeType("hb_vector_draw_t *") long draw, @NativeType("float *") @Nullable FloatBuffer xx, @NativeType("float *") @Nullable FloatBuffer yx, @NativeType("float *") @Nullable FloatBuffer xy, @NativeType("float *") @Nullable FloatBuffer yy, @NativeType("float *") @Nullable FloatBuffer dx, @NativeType("float *") @Nullable FloatBuffer dy) {
        if (CHECKS) {
            checkSafe(xx, 1);
            checkSafe(yx, 1);
            checkSafe(xy, 1);
            checkSafe(yy, 1);
            checkSafe(dx, 1);
            checkSafe(dy, 1);
        }
        nhb_vector_draw_get_transform(draw, memAddressSafe(xx), memAddressSafe(yx), memAddressSafe(xy), memAddressSafe(yy), memAddressSafe(dx), memAddressSafe(dy));
    }

    // --- [ hb_vector_draw_set_scale_factor ] ---

    /** {@code void hb_vector_draw_set_scale_factor(hb_vector_draw_t * draw, float x_scale_factor, float y_scale_factor)} */
    public static void hb_vector_draw_set_scale_factor(@NativeType("hb_vector_draw_t *") long draw, float x_scale_factor, float y_scale_factor) {
        long __functionAddress = Functions.draw_set_scale_factor;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, x_scale_factor, y_scale_factor, __functionAddress);
    }

    // --- [ hb_vector_draw_get_scale_factor ] ---

    /** {@code void hb_vector_draw_get_scale_factor(hb_vector_draw_t * draw, float * x_scale_factor, float * y_scale_factor)} */
    public static void nhb_vector_draw_get_scale_factor(long draw, long x_scale_factor, long y_scale_factor) {
        long __functionAddress = Functions.draw_get_scale_factor;
        if (CHECKS) {
            check(draw);
        }
        invokePPPV(draw, x_scale_factor, y_scale_factor, __functionAddress);
    }

    /** {@code void hb_vector_draw_get_scale_factor(hb_vector_draw_t * draw, float * x_scale_factor, float * y_scale_factor)} */
    public static void hb_vector_draw_get_scale_factor(@NativeType("hb_vector_draw_t *") long draw, @NativeType("float *") @Nullable FloatBuffer x_scale_factor, @NativeType("float *") @Nullable FloatBuffer y_scale_factor) {
        if (CHECKS) {
            checkSafe(x_scale_factor, 1);
            checkSafe(y_scale_factor, 1);
        }
        nhb_vector_draw_get_scale_factor(draw, memAddressSafe(x_scale_factor), memAddressSafe(y_scale_factor));
    }

    // --- [ hb_vector_draw_set_extents ] ---

    /** {@code void hb_vector_draw_set_extents(hb_vector_draw_t * draw, hb_vector_extents_t const * extents)} */
    public static void nhb_vector_draw_set_extents(long draw, long extents) {
        long __functionAddress = Functions.draw_set_extents;
        if (CHECKS) {
            check(draw);
        }
        invokePPV(draw, extents, __functionAddress);
    }

    /** {@code void hb_vector_draw_set_extents(hb_vector_draw_t * draw, hb_vector_extents_t const * extents)} */
    public static void hb_vector_draw_set_extents(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_vector_extents_t const *") hb_vector_extents_t extents) {
        nhb_vector_draw_set_extents(draw, extents.address());
    }

    // --- [ hb_vector_draw_get_extents ] ---

    /** {@code hb_bool_t hb_vector_draw_get_extents(hb_vector_draw_t * draw, hb_vector_extents_t * extents)} */
    public static int nhb_vector_draw_get_extents(long draw, long extents) {
        long __functionAddress = Functions.draw_get_extents;
        if (CHECKS) {
            check(draw);
        }
        return invokePPI(draw, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_vector_draw_get_extents(hb_vector_draw_t * draw, hb_vector_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_draw_get_extents(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_vector_extents_t *") hb_vector_extents_t extents) {
        return nhb_vector_draw_get_extents(draw, extents.address()) != 0;
    }

    // --- [ hb_vector_draw_set_glyph_extents ] ---

    /** {@code hb_bool_t hb_vector_draw_set_glyph_extents(hb_vector_draw_t * draw, hb_glyph_extents_t const * glyph_extents)} */
    public static int nhb_vector_draw_set_glyph_extents(long draw, long glyph_extents) {
        long __functionAddress = Functions.draw_set_glyph_extents;
        if (CHECKS) {
            check(draw);
        }
        return invokePPI(draw, glyph_extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_vector_draw_set_glyph_extents(hb_vector_draw_t * draw, hb_glyph_extents_t const * glyph_extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_draw_set_glyph_extents(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_glyph_extents_t const *") hb_glyph_extents_t glyph_extents) {
        return nhb_vector_draw_set_glyph_extents(draw, glyph_extents.address()) != 0;
    }

    // --- [ hb_vector_draw_get_funcs ] ---

    /** {@code hb_draw_funcs_t * hb_vector_draw_get_funcs(void)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_vector_draw_get_funcs() {
        long __functionAddress = Functions.draw_get_funcs;
        return invokeP(__functionAddress);
    }

    // --- [ hb_vector_draw_glyph ] ---

    /** {@code hb_bool_t hb_vector_draw_glyph(hb_vector_draw_t * draw, hb_font_t * font, hb_codepoint_t glyph, float pen_x, float pen_y, hb_vector_extents_mode_t extents_mode)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_draw_glyph(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, float pen_x, float pen_y, @NativeType("hb_vector_extents_mode_t") int extents_mode) {
        long __functionAddress = Functions.draw_glyph;
        if (CHECKS) {
            check(draw);
            check(font);
        }
        return invokePPI(draw, font, glyph, pen_x, pen_y, extents_mode, __functionAddress) != 0;
    }

    // --- [ hb_vector_svg_set_flat ] ---

    /** {@code void hb_vector_svg_set_flat(hb_vector_draw_t * draw, hb_bool_t flat)} */
    public static void hb_vector_svg_set_flat(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_bool_t") boolean flat) {
        long __functionAddress = Functions.svg_set_flat;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, flat ? 1 : 0, __functionAddress);
    }

    // --- [ hb_vector_svg_set_precision ] ---

    /** {@code void hb_vector_svg_set_precision(hb_vector_draw_t * draw, unsigned int precision)} */
    public static void hb_vector_svg_set_precision(@NativeType("hb_vector_draw_t *") long draw, @NativeType("unsigned int") int precision) {
        long __functionAddress = Functions.svg_set_precision;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, precision, __functionAddress);
    }

    // --- [ hb_vector_draw_render ] ---

    /** {@code hb_blob_t * hb_vector_draw_render(hb_vector_draw_t * draw)} */
    @NativeType("hb_blob_t *")
    public static long hb_vector_draw_render(@NativeType("hb_vector_draw_t *") long draw) {
        long __functionAddress = Functions.draw_render;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_vector_draw_reset ] ---

    /** {@code void hb_vector_draw_reset(hb_vector_draw_t * draw)} */
    public static void hb_vector_draw_reset(@NativeType("hb_vector_draw_t *") long draw) {
        long __functionAddress = Functions.draw_reset;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_vector_draw_recycle_blob ] ---

    /** {@code void hb_vector_draw_recycle_blob(hb_vector_draw_t * draw, hb_blob_t * blob)} */
    public static void hb_vector_draw_recycle_blob(@NativeType("hb_vector_draw_t *") long draw, @NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.draw_recycle_blob;
        if (CHECKS) {
            check(draw);
            check(blob);
        }
        invokePPV(draw, blob, __functionAddress);
    }

    // --- [ hb_vector_paint_create_or_fail ] ---

    /** {@code hb_vector_paint_t * hb_vector_paint_create_or_fail(hb_vector_format_t format)} */
    @NativeType("hb_vector_paint_t *")
    public static long hb_vector_paint_create_or_fail(@NativeType("hb_vector_format_t") int format) {
        long __functionAddress = Functions.paint_create_or_fail;
        return invokeP(format, __functionAddress);
    }

    // --- [ hb_vector_paint_reference ] ---

    /** {@code hb_vector_paint_t * hb_vector_paint_reference(hb_vector_paint_t * paint)} */
    @NativeType("hb_vector_paint_t *")
    public static long hb_vector_paint_reference(@NativeType("hb_vector_paint_t *") long paint) {
        long __functionAddress = Functions.paint_reference;
        if (CHECKS) {
            check(paint);
        }
        return invokePP(paint, __functionAddress);
    }

    // --- [ hb_vector_paint_destroy ] ---

    /** {@code void hb_vector_paint_destroy(hb_vector_paint_t * paint)} */
    public static void hb_vector_paint_destroy(@NativeType("hb_vector_paint_t *") long paint) {
        long __functionAddress = Functions.paint_destroy;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_vector_paint_set_user_data ] ---

    /** {@code hb_bool_t hb_vector_paint_set_user_data(hb_vector_paint_t * paint, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_vector_paint_set_user_data(long paint, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.paint_set_user_data;
        if (CHECKS) {
            check(paint);
        }
        return invokePPPPI(paint, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_vector_paint_set_user_data(hb_vector_paint_t * paint, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_paint_set_user_data(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_vector_paint_set_user_data(paint, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_vector_paint_get_user_data ] ---

    /** {@code void * hb_vector_paint_get_user_data(hb_vector_paint_t * paint, hb_user_data_key_t * key)} */
    public static long nhb_vector_paint_get_user_data(long paint, long key) {
        long __functionAddress = Functions.paint_get_user_data;
        if (CHECKS) {
            check(paint);
        }
        return invokePPP(paint, key, __functionAddress);
    }

    /** {@code void * hb_vector_paint_get_user_data(hb_vector_paint_t * paint, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_vector_paint_get_user_data(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_vector_paint_get_user_data(paint, key.address());
    }

    // --- [ hb_vector_paint_set_transform ] ---

    /** {@code void hb_vector_paint_set_transform(hb_vector_paint_t * paint, float xx, float yx, float xy, float yy, float dx, float dy)} */
    public static void hb_vector_paint_set_transform(@NativeType("hb_vector_paint_t *") long paint, float xx, float yx, float xy, float yy, float dx, float dy) {
        long __functionAddress = Functions.paint_set_transform;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    // --- [ hb_vector_paint_get_transform ] ---

    /** {@code void hb_vector_paint_get_transform(hb_vector_paint_t * paint, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void nhb_vector_paint_get_transform(long paint, long xx, long yx, long xy, long yy, long dx, long dy) {
        long __functionAddress = Functions.paint_get_transform;
        if (CHECKS) {
            check(paint);
        }
        invokePPPPPPPV(paint, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    /** {@code void hb_vector_paint_get_transform(hb_vector_paint_t * paint, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void hb_vector_paint_get_transform(@NativeType("hb_vector_paint_t *") long paint, @NativeType("float *") @Nullable FloatBuffer xx, @NativeType("float *") @Nullable FloatBuffer yx, @NativeType("float *") @Nullable FloatBuffer xy, @NativeType("float *") @Nullable FloatBuffer yy, @NativeType("float *") @Nullable FloatBuffer dx, @NativeType("float *") @Nullable FloatBuffer dy) {
        if (CHECKS) {
            checkSafe(xx, 1);
            checkSafe(yx, 1);
            checkSafe(xy, 1);
            checkSafe(yy, 1);
            checkSafe(dx, 1);
            checkSafe(dy, 1);
        }
        nhb_vector_paint_get_transform(paint, memAddressSafe(xx), memAddressSafe(yx), memAddressSafe(xy), memAddressSafe(yy), memAddressSafe(dx), memAddressSafe(dy));
    }

    // --- [ hb_vector_paint_set_scale_factor ] ---

    /** {@code void hb_vector_paint_set_scale_factor(hb_vector_paint_t * paint, float x_scale_factor, float y_scale_factor)} */
    public static void hb_vector_paint_set_scale_factor(@NativeType("hb_vector_paint_t *") long paint, float x_scale_factor, float y_scale_factor) {
        long __functionAddress = Functions.paint_set_scale_factor;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, x_scale_factor, y_scale_factor, __functionAddress);
    }

    // --- [ hb_vector_paint_get_scale_factor ] ---

    /** {@code void hb_vector_paint_get_scale_factor(hb_vector_paint_t * paint, float * x_scale_factor, float * y_scale_factor)} */
    public static void nhb_vector_paint_get_scale_factor(long paint, long x_scale_factor, long y_scale_factor) {
        long __functionAddress = Functions.paint_get_scale_factor;
        if (CHECKS) {
            check(paint);
        }
        invokePPPV(paint, x_scale_factor, y_scale_factor, __functionAddress);
    }

    /** {@code void hb_vector_paint_get_scale_factor(hb_vector_paint_t * paint, float * x_scale_factor, float * y_scale_factor)} */
    public static void hb_vector_paint_get_scale_factor(@NativeType("hb_vector_paint_t *") long paint, @NativeType("float *") @Nullable FloatBuffer x_scale_factor, @NativeType("float *") @Nullable FloatBuffer y_scale_factor) {
        if (CHECKS) {
            checkSafe(x_scale_factor, 1);
            checkSafe(y_scale_factor, 1);
        }
        nhb_vector_paint_get_scale_factor(paint, memAddressSafe(x_scale_factor), memAddressSafe(y_scale_factor));
    }

    // --- [ hb_vector_paint_set_extents ] ---

    /** {@code void hb_vector_paint_set_extents(hb_vector_paint_t * paint, hb_vector_extents_t const * extents)} */
    public static void nhb_vector_paint_set_extents(long paint, long extents) {
        long __functionAddress = Functions.paint_set_extents;
        if (CHECKS) {
            check(paint);
        }
        invokePPV(paint, extents, __functionAddress);
    }

    /** {@code void hb_vector_paint_set_extents(hb_vector_paint_t * paint, hb_vector_extents_t const * extents)} */
    public static void hb_vector_paint_set_extents(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_vector_extents_t const *") hb_vector_extents_t extents) {
        nhb_vector_paint_set_extents(paint, extents.address());
    }

    // --- [ hb_vector_paint_get_extents ] ---

    /** {@code hb_bool_t hb_vector_paint_get_extents(hb_vector_paint_t * paint, hb_vector_extents_t * extents)} */
    public static int nhb_vector_paint_get_extents(long paint, long extents) {
        long __functionAddress = Functions.paint_get_extents;
        if (CHECKS) {
            check(paint);
        }
        return invokePPI(paint, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_vector_paint_get_extents(hb_vector_paint_t * paint, hb_vector_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_paint_get_extents(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_vector_extents_t *") hb_vector_extents_t extents) {
        return nhb_vector_paint_get_extents(paint, extents.address()) != 0;
    }

    // --- [ hb_vector_paint_set_glyph_extents ] ---

    /** {@code hb_bool_t hb_vector_paint_set_glyph_extents(hb_vector_paint_t * paint, hb_glyph_extents_t const * glyph_extents)} */
    public static int nhb_vector_paint_set_glyph_extents(long paint, long glyph_extents) {
        long __functionAddress = Functions.paint_set_glyph_extents;
        if (CHECKS) {
            check(paint);
        }
        return invokePPI(paint, glyph_extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_vector_paint_set_glyph_extents(hb_vector_paint_t * paint, hb_glyph_extents_t const * glyph_extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_paint_set_glyph_extents(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_glyph_extents_t const *") hb_glyph_extents_t glyph_extents) {
        return nhb_vector_paint_set_glyph_extents(paint, glyph_extents.address()) != 0;
    }

    // --- [ hb_vector_paint_set_foreground ] ---

    /** {@code void hb_vector_paint_set_foreground(hb_vector_paint_t * paint, hb_color_t foreground)} */
    public static void hb_vector_paint_set_foreground(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_color_t") int foreground) {
        long __functionAddress = Functions.paint_set_foreground;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, foreground, __functionAddress);
    }

    // --- [ hb_vector_paint_set_palette ] ---

    /** {@code void hb_vector_paint_set_palette(hb_vector_paint_t * paint, int palette)} */
    public static void hb_vector_paint_set_palette(@NativeType("hb_vector_paint_t *") long paint, int palette) {
        long __functionAddress = Functions.paint_set_palette;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, palette, __functionAddress);
    }

    // --- [ hb_vector_paint_set_custom_palette_color ] ---

    /** {@code void hb_vector_paint_set_custom_palette_color(hb_vector_paint_t * paint, unsigned int color_index, hb_color_t color)} */
    public static void hb_vector_paint_set_custom_palette_color(@NativeType("hb_vector_paint_t *") long paint, @NativeType("unsigned int") int color_index, @NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.paint_set_custom_palette_color;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, color_index, color, __functionAddress);
    }

    // --- [ hb_vector_paint_clear_custom_palette_colors ] ---

    /** {@code void hb_vector_paint_clear_custom_palette_colors(hb_vector_paint_t * paint)} */
    public static void hb_vector_paint_clear_custom_palette_colors(@NativeType("hb_vector_paint_t *") long paint) {
        long __functionAddress = Functions.paint_clear_custom_palette_colors;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_vector_paint_get_funcs ] ---

    /** {@code hb_paint_funcs_t * hb_vector_paint_get_funcs(void)} */
    @NativeType("hb_paint_funcs_t *")
    public static long hb_vector_paint_get_funcs() {
        long __functionAddress = Functions.paint_get_funcs;
        return invokeP(__functionAddress);
    }

    // --- [ hb_vector_paint_glyph ] ---

    /** {@code hb_bool_t hb_vector_paint_glyph(hb_vector_paint_t * paint, hb_font_t * font, hb_codepoint_t glyph, float pen_x, float pen_y, hb_vector_extents_mode_t extents_mode)} */
    @NativeType("hb_bool_t")
    public static boolean hb_vector_paint_glyph(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, float pen_x, float pen_y, @NativeType("hb_vector_extents_mode_t") int extents_mode) {
        long __functionAddress = Functions.paint_glyph;
        if (CHECKS) {
            check(paint);
            check(font);
        }
        return invokePPI(paint, font, glyph, pen_x, pen_y, extents_mode, __functionAddress) != 0;
    }

    // --- [ hb_vector_svg_paint_set_flat ] ---

    /** {@code void hb_vector_svg_paint_set_flat(hb_vector_paint_t * paint, hb_bool_t flat)} */
    public static void hb_vector_svg_paint_set_flat(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_bool_t") boolean flat) {
        long __functionAddress = Functions.svg_paint_set_flat;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, flat ? 1 : 0, __functionAddress);
    }

    // --- [ hb_vector_svg_paint_set_precision ] ---

    /** {@code void hb_vector_svg_paint_set_precision(hb_vector_paint_t * paint, unsigned int precision)} */
    public static void hb_vector_svg_paint_set_precision(@NativeType("hb_vector_paint_t *") long paint, @NativeType("unsigned int") int precision) {
        long __functionAddress = Functions.svg_paint_set_precision;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, precision, __functionAddress);
    }

    // --- [ hb_vector_paint_render ] ---

    /** {@code hb_blob_t * hb_vector_paint_render(hb_vector_paint_t * paint)} */
    @NativeType("hb_blob_t *")
    public static long hb_vector_paint_render(@NativeType("hb_vector_paint_t *") long paint) {
        long __functionAddress = Functions.paint_render;
        if (CHECKS) {
            check(paint);
        }
        return invokePP(paint, __functionAddress);
    }

    // --- [ hb_vector_paint_reset ] ---

    /** {@code void hb_vector_paint_reset(hb_vector_paint_t * paint)} */
    public static void hb_vector_paint_reset(@NativeType("hb_vector_paint_t *") long paint) {
        long __functionAddress = Functions.paint_reset;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_vector_paint_recycle_blob ] ---

    /** {@code void hb_vector_paint_recycle_blob(hb_vector_paint_t * paint, hb_blob_t * blob)} */
    public static void hb_vector_paint_recycle_blob(@NativeType("hb_vector_paint_t *") long paint, @NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.paint_recycle_blob;
        if (CHECKS) {
            check(paint);
            check(blob);
        }
        invokePPV(paint, blob, __functionAddress);
    }

}