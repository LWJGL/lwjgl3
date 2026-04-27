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

public class HarfBuzzGPU {

    private static final SharedLibrary HARFBUZZ = Library.loadNative(HarfBuzzGPU.class, "org.lwjgl.harfbuzz", Configuration.HARFBUZZ_GPU_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("harfbuzz-gpu")), true);

    /** Contains the function pointers loaded from the harfbuzz {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            shader_source                     = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_shader_source"),
            draw_shader_source                = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_shader_source"),
            draw_create_or_fail               = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_create_or_fail"),
            draw_reference                    = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_reference"),
            draw_destroy                      = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_destroy"),
            draw_set_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_set_user_data"),
            draw_get_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_get_user_data"),
            draw_set_scale                    = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_set_scale"),
            draw_get_scale                    = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_get_scale"),
            draw_get_funcs                    = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_get_funcs"),
            draw_glyph                        = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_glyph"),
            draw_glyph_or_fail                = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_glyph_or_fail"),
            draw_encode                       = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_encode"),
            draw_clear                        = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_clear"),
            draw_reset                        = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_reset"),
            draw_recycle_blob                 = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_recycle_blob"),
            paint_create_or_fail              = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_create_or_fail"),
            paint_reference                   = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_reference"),
            paint_destroy                     = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_destroy"),
            paint_set_user_data               = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_set_user_data"),
            paint_get_user_data               = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_get_user_data"),
            paint_get_funcs                   = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_get_funcs"),
            paint_set_palette                 = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_set_palette"),
            paint_get_palette                 = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_get_palette"),
            paint_clear_custom_palette_colors = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_clear_custom_palette_colors"),
            paint_set_custom_palette_color    = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_set_custom_palette_color"),
            paint_set_scale                   = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_set_scale"),
            paint_get_scale                   = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_get_scale"),
            paint_glyph                       = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_glyph"),
            paint_glyph_or_fail               = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_glyph_or_fail"),
            paint_encode                      = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_encode"),
            paint_clear                       = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_clear"),
            paint_reset                       = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_reset"),
            paint_recycle_blob                = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_recycle_blob"),
            paint_shader_source               = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_paint_shader_source");

    }

    /** Returns the harfbuzz {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HARFBUZZ;
    }

    public static final int
        HB_GPU_SHADER_LANG_INVALID = 0,
        HB_GPU_SHADER_LANG_GLSL    = 1,
        HB_GPU_SHADER_LANG_WGSL    = 2,
        HB_GPU_SHADER_LANG_MSL     = 3,
        HB_GPU_SHADER_LANG_HLSL    = 4;

    public static final int
        HB_GPU_SHADER_STAGE_VERTEX   = 0,
        HB_GPU_SHADER_STAGE_FRAGMENT = 1;

    protected HarfBuzzGPU() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_gpu_shader_source ] ---

    /** {@code char const * hb_gpu_shader_source(hb_gpu_shader_stage_t stage, hb_gpu_shader_lang_t lang)} */
    public static long nhb_gpu_shader_source(int stage, int lang) {
        long __functionAddress = Functions.shader_source;
        return invokeP(stage, lang, __functionAddress);
    }

    /** {@code char const * hb_gpu_shader_source(hb_gpu_shader_stage_t stage, hb_gpu_shader_lang_t lang)} */
    @NativeType("char const *")
    public static @Nullable String hb_gpu_shader_source(@NativeType("hb_gpu_shader_stage_t") int stage, @NativeType("hb_gpu_shader_lang_t") int lang) {
        long __result = nhb_gpu_shader_source(stage, lang);
        return memUTF8Safe(__result);
    }

    // --- [ hb_gpu_draw_shader_source ] ---

    /** {@code char const * hb_gpu_draw_shader_source(hb_gpu_shader_stage_t stage, hb_gpu_shader_lang_t lang)} */
    public static long nhb_gpu_draw_shader_source(int stage, int lang) {
        long __functionAddress = Functions.draw_shader_source;
        return invokeP(stage, lang, __functionAddress);
    }

    /** {@code char const * hb_gpu_draw_shader_source(hb_gpu_shader_stage_t stage, hb_gpu_shader_lang_t lang)} */
    @NativeType("char const *")
    public static @Nullable String hb_gpu_draw_shader_source(@NativeType("hb_gpu_shader_stage_t") int stage, @NativeType("hb_gpu_shader_lang_t") int lang) {
        long __result = nhb_gpu_draw_shader_source(stage, lang);
        return memUTF8Safe(__result);
    }

    // --- [ hb_gpu_draw_create_or_fail ] ---

    /** {@code hb_gpu_draw_t * hb_gpu_draw_create_or_fail(void)} */
    @NativeType("hb_gpu_draw_t *")
    public static long hb_gpu_draw_create_or_fail() {
        long __functionAddress = Functions.draw_create_or_fail;
        return invokeP(__functionAddress);
    }

    // --- [ hb_gpu_draw_reference ] ---

    /** {@code hb_gpu_draw_t * hb_gpu_draw_reference(hb_gpu_draw_t * draw)} */
    @NativeType("hb_gpu_draw_t *")
    public static long hb_gpu_draw_reference(@NativeType("hb_gpu_draw_t *") long draw) {
        long __functionAddress = Functions.draw_reference;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_gpu_draw_destroy ] ---

    /** {@code void hb_gpu_draw_destroy(hb_gpu_draw_t * draw)} */
    public static void hb_gpu_draw_destroy(@NativeType("hb_gpu_draw_t *") long draw) {
        long __functionAddress = Functions.draw_destroy;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_gpu_draw_set_user_data ] ---

    /** {@code hb_bool_t hb_gpu_draw_set_user_data(hb_gpu_draw_t * draw, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_gpu_draw_set_user_data(long draw, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.draw_set_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPPPI(draw, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_gpu_draw_set_user_data(hb_gpu_draw_t * draw, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_gpu_draw_set_user_data(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_gpu_draw_set_user_data(draw, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_gpu_draw_get_user_data ] ---

    /** {@code void * hb_gpu_draw_get_user_data(hb_gpu_draw_t const * draw, hb_user_data_key_t * key)} */
    public static long nhb_gpu_draw_get_user_data(long draw, long key) {
        long __functionAddress = Functions.draw_get_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPP(draw, key, __functionAddress);
    }

    /** {@code void * hb_gpu_draw_get_user_data(hb_gpu_draw_t const * draw, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_gpu_draw_get_user_data(@NativeType("hb_gpu_draw_t const *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_gpu_draw_get_user_data(draw, key.address());
    }

    // --- [ hb_gpu_draw_set_scale ] ---

    /** {@code void hb_gpu_draw_set_scale(hb_gpu_draw_t * draw, int x_scale, int y_scale)} */
    public static void hb_gpu_draw_set_scale(@NativeType("hb_gpu_draw_t *") long draw, int x_scale, int y_scale) {
        long __functionAddress = Functions.draw_set_scale;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, x_scale, y_scale, __functionAddress);
    }

    // --- [ hb_gpu_draw_get_scale ] ---

    /** {@code void hb_gpu_draw_get_scale(hb_gpu_draw_t const * draw, int * x_scale, int * y_scale)} */
    public static void nhb_gpu_draw_get_scale(long draw, long x_scale, long y_scale) {
        long __functionAddress = Functions.draw_get_scale;
        if (CHECKS) {
            check(draw);
        }
        invokePPPV(draw, x_scale, y_scale, __functionAddress);
    }

    /** {@code void hb_gpu_draw_get_scale(hb_gpu_draw_t const * draw, int * x_scale, int * y_scale)} */
    public static void hb_gpu_draw_get_scale(@NativeType("hb_gpu_draw_t const *") long draw, @NativeType("int *") @Nullable IntBuffer x_scale, @NativeType("int *") @Nullable IntBuffer y_scale) {
        if (CHECKS) {
            checkSafe(x_scale, 1);
            checkSafe(y_scale, 1);
        }
        nhb_gpu_draw_get_scale(draw, memAddressSafe(x_scale), memAddressSafe(y_scale));
    }

    // --- [ hb_gpu_draw_get_funcs ] ---

    /** {@code hb_draw_funcs_t * hb_gpu_draw_get_funcs(hb_gpu_draw_t const * draw)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_gpu_draw_get_funcs(@NativeType("hb_gpu_draw_t const *") long draw) {
        long __functionAddress = Functions.draw_get_funcs;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_gpu_draw_glyph ] ---

    /** {@code void hb_gpu_draw_glyph(hb_gpu_draw_t * draw, hb_font_t * font, hb_codepoint_t glyph)} */
    public static void hb_gpu_draw_glyph(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.draw_glyph;
        if (CHECKS) {
            check(draw);
            check(font);
        }
        invokePPV(draw, font, glyph, __functionAddress);
    }

    // --- [ hb_gpu_draw_glyph_or_fail ] ---

    /** {@code hb_bool_t hb_gpu_draw_glyph_or_fail(hb_gpu_draw_t * draw, hb_font_t * font, hb_codepoint_t glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_gpu_draw_glyph_or_fail(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.draw_glyph_or_fail;
        if (CHECKS) {
            check(draw);
            check(font);
        }
        return invokePPI(draw, font, glyph, __functionAddress) != 0;
    }

    // --- [ hb_gpu_draw_encode ] ---

    /** {@code hb_blob_t * hb_gpu_draw_encode(hb_gpu_draw_t * draw, hb_glyph_extents_t * extents)} */
    public static long nhb_gpu_draw_encode(long draw, long extents) {
        long __functionAddress = Functions.draw_encode;
        if (CHECKS) {
            check(draw);
        }
        return invokePPP(draw, extents, __functionAddress);
    }

    /** {@code hb_blob_t * hb_gpu_draw_encode(hb_gpu_draw_t * draw, hb_glyph_extents_t * extents)} */
    @NativeType("hb_blob_t *")
    public static long hb_gpu_draw_encode(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_glyph_extents_t *") @Nullable hb_glyph_extents_t extents) {
        return nhb_gpu_draw_encode(draw, memAddressSafe(extents));
    }

    // --- [ hb_gpu_draw_clear ] ---

    /** {@code void hb_gpu_draw_clear(hb_gpu_draw_t * draw)} */
    public static void hb_gpu_draw_clear(@NativeType("hb_gpu_draw_t *") long draw) {
        long __functionAddress = Functions.draw_clear;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_gpu_draw_reset ] ---

    /** {@code void hb_gpu_draw_reset(hb_gpu_draw_t * draw)} */
    public static void hb_gpu_draw_reset(@NativeType("hb_gpu_draw_t *") long draw) {
        long __functionAddress = Functions.draw_reset;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_gpu_draw_recycle_blob ] ---

    /** {@code void hb_gpu_draw_recycle_blob(hb_gpu_draw_t * draw, hb_blob_t * blob)} */
    public static void hb_gpu_draw_recycle_blob(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.draw_recycle_blob;
        if (CHECKS) {
            check(draw);
            check(blob);
        }
        invokePPV(draw, blob, __functionAddress);
    }

    // --- [ hb_gpu_paint_create_or_fail ] ---

    /** {@code hb_gpu_paint_t * hb_gpu_paint_create_or_fail(void)} */
    @NativeType("hb_gpu_paint_t *")
    public static long hb_gpu_paint_create_or_fail() {
        long __functionAddress = Functions.paint_create_or_fail;
        return invokeP(__functionAddress);
    }

    // --- [ hb_gpu_paint_reference ] ---

    /** {@code hb_gpu_paint_t * hb_gpu_paint_reference(hb_gpu_paint_t * paint)} */
    @NativeType("hb_gpu_paint_t *")
    public static long hb_gpu_paint_reference(@NativeType("hb_gpu_paint_t *") long paint) {
        long __functionAddress = Functions.paint_reference;
        if (CHECKS) {
            check(paint);
        }
        return invokePP(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_destroy ] ---

    /** {@code void hb_gpu_paint_destroy(hb_gpu_paint_t * paint)} */
    public static void hb_gpu_paint_destroy(@NativeType("hb_gpu_paint_t *") long paint) {
        long __functionAddress = Functions.paint_destroy;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_set_user_data ] ---

    /** {@code hb_bool_t hb_gpu_paint_set_user_data(hb_gpu_paint_t * paint, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_gpu_paint_set_user_data(long paint, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.paint_set_user_data;
        if (CHECKS) {
            check(paint);
        }
        return invokePPPPI(paint, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_gpu_paint_set_user_data(hb_gpu_paint_t * paint, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_gpu_paint_set_user_data(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_gpu_paint_set_user_data(paint, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_gpu_paint_get_user_data ] ---

    /** {@code void * hb_gpu_paint_get_user_data(hb_gpu_paint_t const * paint, hb_user_data_key_t * key)} */
    public static long nhb_gpu_paint_get_user_data(long paint, long key) {
        long __functionAddress = Functions.paint_get_user_data;
        if (CHECKS) {
            check(paint);
        }
        return invokePPP(paint, key, __functionAddress);
    }

    /** {@code void * hb_gpu_paint_get_user_data(hb_gpu_paint_t const * paint, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_gpu_paint_get_user_data(@NativeType("hb_gpu_paint_t const *") long paint, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_gpu_paint_get_user_data(paint, key.address());
    }

    // --- [ hb_gpu_paint_get_funcs ] ---

    /** {@code hb_paint_funcs_t * hb_gpu_paint_get_funcs(hb_gpu_paint_t const * paint)} */
    @NativeType("hb_paint_funcs_t *")
    public static long hb_gpu_paint_get_funcs(@NativeType("hb_gpu_paint_t const *") long paint) {
        long __functionAddress = Functions.paint_get_funcs;
        if (CHECKS) {
            check(paint);
        }
        return invokePP(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_set_palette ] ---

    /** {@code void hb_gpu_paint_set_palette(hb_gpu_paint_t * paint, unsigned palette)} */
    public static void hb_gpu_paint_set_palette(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("unsigned") int palette) {
        long __functionAddress = Functions.paint_set_palette;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, palette, __functionAddress);
    }

    // --- [ hb_gpu_paint_get_palette ] ---

    /** {@code unsigned hb_gpu_paint_get_palette(hb_gpu_paint_t const * paint)} */
    @NativeType("unsigned")
    public static int hb_gpu_paint_get_palette(@NativeType("hb_gpu_paint_t const *") long paint) {
        long __functionAddress = Functions.paint_get_palette;
        if (CHECKS) {
            check(paint);
        }
        return invokePI(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_clear_custom_palette_colors ] ---

    /** {@code void hb_gpu_paint_clear_custom_palette_colors(hb_gpu_paint_t * paint)} */
    public static void hb_gpu_paint_clear_custom_palette_colors(@NativeType("hb_gpu_paint_t *") long paint) {
        long __functionAddress = Functions.paint_clear_custom_palette_colors;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_set_custom_palette_color ] ---

    /** {@code hb_bool_t hb_gpu_paint_set_custom_palette_color(hb_gpu_paint_t * paint, unsigned int color_index, hb_color_t color)} */
    @NativeType("hb_bool_t")
    public static boolean hb_gpu_paint_set_custom_palette_color(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("unsigned int") int color_index, @NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.paint_set_custom_palette_color;
        if (CHECKS) {
            check(paint);
        }
        return invokePI(paint, color_index, color, __functionAddress) != 0;
    }

    // --- [ hb_gpu_paint_set_scale ] ---

    /** {@code void hb_gpu_paint_set_scale(hb_gpu_paint_t * paint, int x_scale, int y_scale)} */
    public static void hb_gpu_paint_set_scale(@NativeType("hb_gpu_paint_t *") long paint, int x_scale, int y_scale) {
        long __functionAddress = Functions.paint_set_scale;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, x_scale, y_scale, __functionAddress);
    }

    // --- [ hb_gpu_paint_get_scale ] ---

    /** {@code void hb_gpu_paint_get_scale(hb_gpu_paint_t const * paint, int * x_scale, int * y_scale)} */
    public static void nhb_gpu_paint_get_scale(long paint, long x_scale, long y_scale) {
        long __functionAddress = Functions.paint_get_scale;
        if (CHECKS) {
            check(paint);
        }
        invokePPPV(paint, x_scale, y_scale, __functionAddress);
    }

    /** {@code void hb_gpu_paint_get_scale(hb_gpu_paint_t const * paint, int * x_scale, int * y_scale)} */
    public static void hb_gpu_paint_get_scale(@NativeType("hb_gpu_paint_t const *") long paint, @NativeType("int *") @Nullable IntBuffer x_scale, @NativeType("int *") @Nullable IntBuffer y_scale) {
        if (CHECKS) {
            checkSafe(x_scale, 1);
            checkSafe(y_scale, 1);
        }
        nhb_gpu_paint_get_scale(paint, memAddressSafe(x_scale), memAddressSafe(y_scale));
    }

    // --- [ hb_gpu_paint_glyph ] ---

    /** {@code void hb_gpu_paint_glyph(hb_gpu_paint_t * paint, hb_font_t * font, hb_codepoint_t glyph)} */
    public static void hb_gpu_paint_glyph(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.paint_glyph;
        if (CHECKS) {
            check(paint);
            check(font);
        }
        invokePPV(paint, font, glyph, __functionAddress);
    }

    // --- [ hb_gpu_paint_glyph_or_fail ] ---

    /** {@code hb_bool_t hb_gpu_paint_glyph_or_fail(hb_gpu_paint_t * paint, hb_font_t * font, hb_codepoint_t glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_gpu_paint_glyph_or_fail(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.paint_glyph_or_fail;
        if (CHECKS) {
            check(paint);
            check(font);
        }
        return invokePPI(paint, font, glyph, __functionAddress) != 0;
    }

    // --- [ hb_gpu_paint_encode ] ---

    /** {@code hb_blob_t * hb_gpu_paint_encode(hb_gpu_paint_t * paint, hb_glyph_extents_t * extents)} */
    public static long nhb_gpu_paint_encode(long paint, long extents) {
        long __functionAddress = Functions.paint_encode;
        if (CHECKS) {
            check(paint);
        }
        return invokePPP(paint, extents, __functionAddress);
    }

    /** {@code hb_blob_t * hb_gpu_paint_encode(hb_gpu_paint_t * paint, hb_glyph_extents_t * extents)} */
    @NativeType("hb_blob_t *")
    public static long hb_gpu_paint_encode(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("hb_glyph_extents_t *") hb_glyph_extents_t extents) {
        return nhb_gpu_paint_encode(paint, extents.address());
    }

    // --- [ hb_gpu_paint_clear ] ---

    /** {@code void hb_gpu_paint_clear(hb_gpu_paint_t * paint)} */
    public static void hb_gpu_paint_clear(@NativeType("hb_gpu_paint_t *") long paint) {
        long __functionAddress = Functions.paint_clear;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_reset ] ---

    /** {@code void hb_gpu_paint_reset(hb_gpu_paint_t * paint)} */
    public static void hb_gpu_paint_reset(@NativeType("hb_gpu_paint_t *") long paint) {
        long __functionAddress = Functions.paint_reset;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_gpu_paint_recycle_blob ] ---

    /** {@code void hb_gpu_paint_recycle_blob(hb_gpu_paint_t * paint, hb_blob_t * blob)} */
    public static void hb_gpu_paint_recycle_blob(@NativeType("hb_gpu_paint_t *") long paint, @NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.paint_recycle_blob;
        if (CHECKS) {
            check(paint);
            check(blob);
        }
        invokePPV(paint, blob, __functionAddress);
    }

    // --- [ hb_gpu_paint_shader_source ] ---

    /** {@code char const * hb_gpu_paint_shader_source(hb_gpu_shader_stage_t stage, hb_gpu_shader_lang_t lang)} */
    public static long nhb_gpu_paint_shader_source(int stage, int lang) {
        long __functionAddress = Functions.paint_shader_source;
        return invokeP(stage, lang, __functionAddress);
    }

    /** {@code char const * hb_gpu_paint_shader_source(hb_gpu_shader_stage_t stage, hb_gpu_shader_lang_t lang)} */
    @NativeType("char const *")
    public static @Nullable String hb_gpu_paint_shader_source(@NativeType("hb_gpu_shader_stage_t") int stage, @NativeType("hb_gpu_shader_lang_t") int lang) {
        long __result = nhb_gpu_paint_shader_source(stage, lang);
        return memUTF8Safe(__result);
    }

}