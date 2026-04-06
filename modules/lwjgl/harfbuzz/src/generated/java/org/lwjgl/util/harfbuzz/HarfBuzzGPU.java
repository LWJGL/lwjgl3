/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

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
            shader_fragment_source = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_shader_fragment_source"),
            shader_vertex_source   = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_shader_vertex_source"),
            draw_create_or_fail    = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_create_or_fail"),
            draw_reference         = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_reference"),
            draw_destroy           = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_destroy"),
            draw_set_user_data     = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_set_user_data"),
            draw_get_user_data     = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_get_user_data"),
            draw_set_scale         = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_set_scale"),
            draw_get_funcs         = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_get_funcs"),
            draw_glyph             = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_glyph"),
            draw_encode            = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_encode"),
            draw_get_extents       = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_get_extents"),
            draw_reset             = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_reset"),
            draw_recycle_blob      = apiGetFunctionAddress(HARFBUZZ, "hb_gpu_draw_recycle_blob");

    }

    /** Returns the harfbuzz {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HARFBUZZ;
    }

    public static final int
        HB_GPU_SHADER_LANG_GLSL = 0,
        HB_GPU_SHADER_LANG_WGSL = 1,
        HB_GPU_SHADER_LANG_MSL  = 2,
        HB_GPU_SHADER_LANG_HLSL = 3;

    protected HarfBuzzGPU() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_gpu_shader_fragment_source ] ---

    /** {@code char const * hb_gpu_shader_fragment_source(hb_gpu_shader_lang_t lang)} */
    public static long nhb_gpu_shader_fragment_source(int lang) {
        long __functionAddress = Functions.shader_fragment_source;
        return invokeP(lang, __functionAddress);
    }

    /** {@code char const * hb_gpu_shader_fragment_source(hb_gpu_shader_lang_t lang)} */
    @NativeType("char const *")
    public static @Nullable String hb_gpu_shader_fragment_source(@NativeType("hb_gpu_shader_lang_t") int lang) {
        long __result = nhb_gpu_shader_fragment_source(lang);
        return memUTF8Safe(__result);
    }

    // --- [ hb_gpu_shader_vertex_source ] ---

    /** {@code char const * hb_gpu_shader_vertex_source(hb_gpu_shader_lang_t lang)} */
    public static long nhb_gpu_shader_vertex_source(int lang) {
        long __functionAddress = Functions.shader_vertex_source;
        return invokeP(lang, __functionAddress);
    }

    /** {@code char const * hb_gpu_shader_vertex_source(hb_gpu_shader_lang_t lang)} */
    @NativeType("char const *")
    public static @Nullable String hb_gpu_shader_vertex_source(@NativeType("hb_gpu_shader_lang_t") int lang) {
        long __result = nhb_gpu_shader_vertex_source(lang);
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

    /** {@code void * hb_gpu_draw_get_user_data(hb_gpu_draw_t * draw, hb_user_data_key_t * key)} */
    public static long nhb_gpu_draw_get_user_data(long draw, long key) {
        long __functionAddress = Functions.draw_get_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPP(draw, key, __functionAddress);
    }

    /** {@code void * hb_gpu_draw_get_user_data(hb_gpu_draw_t * draw, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_gpu_draw_get_user_data(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
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

    // --- [ hb_gpu_draw_get_funcs ] ---

    /** {@code hb_draw_funcs_t * hb_gpu_draw_get_funcs(void)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_gpu_draw_get_funcs() {
        long __functionAddress = Functions.draw_get_funcs;
        return invokeP(__functionAddress);
    }

    // --- [ hb_gpu_draw_glyph ] ---

    /** {@code void hb_gpu_draw_glyph(hb_gpu_draw_t * draw, hb_font_t * font, hb_codepoint_t codepoint)} */
    public static void hb_gpu_draw_glyph(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int codepoint) {
        long __functionAddress = Functions.draw_glyph;
        if (CHECKS) {
            check(draw);
            check(font);
        }
        invokePPV(draw, font, codepoint, __functionAddress);
    }

    // --- [ hb_gpu_draw_encode ] ---

    /** {@code hb_blob_t * hb_gpu_draw_encode(hb_gpu_draw_t * draw)} */
    @NativeType("hb_blob_t *")
    public static long hb_gpu_draw_encode(@NativeType("hb_gpu_draw_t *") long draw) {
        long __functionAddress = Functions.draw_encode;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_gpu_draw_get_extents ] ---

    /** {@code void hb_gpu_draw_get_extents(hb_gpu_draw_t * draw, hb_glyph_extents_t * extents)} */
    public static void nhb_gpu_draw_get_extents(long draw, long extents) {
        long __functionAddress = Functions.draw_get_extents;
        if (CHECKS) {
            check(draw);
        }
        invokePPV(draw, extents, __functionAddress);
    }

    /** {@code void hb_gpu_draw_get_extents(hb_gpu_draw_t * draw, hb_glyph_extents_t * extents)} */
    public static void hb_gpu_draw_get_extents(@NativeType("hb_gpu_draw_t *") long draw, @NativeType("hb_glyph_extents_t *") hb_glyph_extents_t extents) {
        nhb_gpu_draw_get_extents(draw, extents.address());
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

}