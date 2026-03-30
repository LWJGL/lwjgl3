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

public class HarfBuzzRaster {

    private static final SharedLibrary HARFBUZZ = Library.loadNative(HarfBuzzRaster.class, "org.lwjgl.harfbuzz", Configuration.HARFBUZZ_RASTER_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("harfbuzz-raster")), true);

    /** Contains the function pointers loaded from the harfbuzz {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            image_create_or_fail               = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_create_or_fail"),
            image_reference                    = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_reference"),
            image_destroy                      = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_destroy"),
            image_set_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_set_user_data"),
            image_get_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_get_user_data"),
            image_configure                    = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_configure"),
            image_clear                        = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_clear"),
            image_get_buffer                   = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_get_buffer"),
            image_get_extents                  = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_get_extents"),
            image_get_format                   = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_get_format"),
            image_deserialize_from_png_or_fail = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_deserialize_from_png_or_fail"),
            image_serialize_to_png_or_fail     = apiGetFunctionAddress(HARFBUZZ, "hb_raster_image_serialize_to_png_or_fail"),
            draw_create_or_fail                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_create_or_fail"),
            draw_reference                     = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_reference"),
            draw_destroy                       = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_destroy"),
            draw_set_user_data                 = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_set_user_data"),
            draw_get_user_data                 = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_get_user_data"),
            draw_set_transform                 = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_set_transform"),
            draw_set_scale_factor              = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_set_scale_factor"),
            draw_get_scale_factor              = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_get_scale_factor"),
            draw_get_transform                 = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_get_transform"),
            draw_set_extents                   = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_set_extents"),
            draw_get_extents                   = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_get_extents"),
            draw_set_glyph_extents             = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_set_glyph_extents"),
            draw_get_funcs                     = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_get_funcs"),
            draw_glyph                         = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_glyph"),
            draw_render                        = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_render"),
            draw_reset                         = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_reset"),
            draw_recycle_image                 = apiGetFunctionAddress(HARFBUZZ, "hb_raster_draw_recycle_image"),
            paint_create_or_fail               = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_create_or_fail"),
            paint_reference                    = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_reference"),
            paint_destroy                      = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_destroy"),
            paint_set_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_user_data"),
            paint_get_user_data                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_get_user_data"),
            paint_set_transform                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_transform"),
            paint_get_transform                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_get_transform"),
            paint_set_scale_factor             = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_scale_factor"),
            paint_get_scale_factor             = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_get_scale_factor"),
            paint_set_extents                  = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_extents"),
            paint_get_extents                  = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_get_extents"),
            paint_set_glyph_extents            = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_glyph_extents"),
            paint_set_foreground               = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_foreground"),
            paint_clear_custom_palette_colors  = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_clear_custom_palette_colors"),
            paint_set_custom_palette_color     = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_set_custom_palette_color"),
            paint_get_funcs                    = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_get_funcs"),
            paint_glyph                        = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_glyph"),
            paint_render                       = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_render"),
            paint_reset                        = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_reset"),
            paint_recycle_image                = apiGetFunctionAddress(HARFBUZZ, "hb_raster_paint_recycle_image");

    }

    /** Returns the harfbuzz {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HARFBUZZ;
    }

    public static final int
        HB_RASTER_FORMAT_A8     = 0,
        HB_RASTER_FORMAT_BGRA32 = 1;

    protected HarfBuzzRaster() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_raster_image_create_or_fail ] ---

    /** {@code hb_raster_image_t * hb_raster_image_create_or_fail(void)} */
    @NativeType("hb_raster_image_t *")
    public static long hb_raster_image_create_or_fail() {
        long __functionAddress = Functions.image_create_or_fail;
        return invokeP(__functionAddress);
    }

    // --- [ hb_raster_image_reference ] ---

    /** {@code hb_raster_image_t * hb_raster_image_reference(hb_raster_image_t * image)} */
    @NativeType("hb_raster_image_t *")
    public static long hb_raster_image_reference(@NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.image_reference;
        if (CHECKS) {
            check(image);
        }
        return invokePP(image, __functionAddress);
    }

    // --- [ hb_raster_image_destroy ] ---

    /** {@code void hb_raster_image_destroy(hb_raster_image_t * image)} */
    public static void hb_raster_image_destroy(@NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.image_destroy;
        if (CHECKS) {
            check(image);
        }
        invokePV(image, __functionAddress);
    }

    // --- [ hb_raster_image_set_user_data ] ---

    /** {@code hb_bool_t hb_raster_image_set_user_data(hb_raster_image_t * image, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_raster_image_set_user_data(long image, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.image_set_user_data;
        if (CHECKS) {
            check(image);
        }
        return invokePPPPI(image, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_image_set_user_data(hb_raster_image_t * image, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_image_set_user_data(@NativeType("hb_raster_image_t *") long image, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_raster_image_set_user_data(image, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_raster_image_get_user_data ] ---

    /** {@code void * hb_raster_image_get_user_data(hb_raster_image_t * image, hb_user_data_key_t * key)} */
    public static long nhb_raster_image_get_user_data(long image, long key) {
        long __functionAddress = Functions.image_get_user_data;
        if (CHECKS) {
            check(image);
        }
        return invokePPP(image, key, __functionAddress);
    }

    /** {@code void * hb_raster_image_get_user_data(hb_raster_image_t * image, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_raster_image_get_user_data(@NativeType("hb_raster_image_t *") long image, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_raster_image_get_user_data(image, key.address());
    }

    // --- [ hb_raster_image_configure ] ---

    /** {@code hb_bool_t hb_raster_image_configure(hb_raster_image_t * image, hb_raster_format_t format, hb_raster_extents_t const * extents)} */
    public static int nhb_raster_image_configure(long image, int format, long extents) {
        long __functionAddress = Functions.image_configure;
        if (CHECKS) {
            check(image);
        }
        return invokePPI(image, format, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_image_configure(hb_raster_image_t * image, hb_raster_format_t format, hb_raster_extents_t const * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_image_configure(@NativeType("hb_raster_image_t *") long image, @NativeType("hb_raster_format_t") int format, @NativeType("hb_raster_extents_t const *") hb_raster_extents_t extents) {
        return nhb_raster_image_configure(image, format, extents.address()) != 0;
    }

    // --- [ hb_raster_image_clear ] ---

    /** {@code void hb_raster_image_clear(hb_raster_image_t * image)} */
    public static void hb_raster_image_clear(@NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.image_clear;
        if (CHECKS) {
            check(image);
        }
        invokePV(image, __functionAddress);
    }

    // --- [ hb_raster_image_get_buffer ] ---

    /** {@code uint8_t const * hb_raster_image_get_buffer(hb_raster_image_t * image)} */
    public static long nhb_raster_image_get_buffer(long image) {
        long __functionAddress = Functions.image_get_buffer;
        if (CHECKS) {
            check(image);
        }
        return invokePP(image, __functionAddress);
    }

    /** {@code uint8_t const * hb_raster_image_get_buffer(hb_raster_image_t * image)} */
    @NativeType("uint8_t const *")
    public static @Nullable ByteBuffer hb_raster_image_get_buffer(@NativeType("hb_raster_image_t *") long image, @NativeType("size_t") long length) {
        long __result = nhb_raster_image_get_buffer(image);
        return memByteBufferSafe(__result, (int)length);
    }

    // --- [ hb_raster_image_get_extents ] ---

    /** {@code void hb_raster_image_get_extents(hb_raster_image_t * image, hb_raster_extents_t * extents)} */
    public static void nhb_raster_image_get_extents(long image, long extents) {
        long __functionAddress = Functions.image_get_extents;
        if (CHECKS) {
            check(image);
        }
        invokePPV(image, extents, __functionAddress);
    }

    /** {@code void hb_raster_image_get_extents(hb_raster_image_t * image, hb_raster_extents_t * extents)} */
    public static void hb_raster_image_get_extents(@NativeType("hb_raster_image_t *") long image, @NativeType("hb_raster_extents_t *") hb_raster_extents_t extents) {
        nhb_raster_image_get_extents(image, extents.address());
    }

    // --- [ hb_raster_image_get_format ] ---

    /** {@code hb_raster_format_t hb_raster_image_get_format(hb_raster_image_t * image)} */
    @NativeType("hb_raster_format_t")
    public static int hb_raster_image_get_format(@NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.image_get_format;
        if (CHECKS) {
            check(image);
        }
        return invokePI(image, __functionAddress);
    }

    // --- [ hb_raster_image_deserialize_from_png_or_fail ] ---

    /** {@code hb_bool_t hb_raster_image_deserialize_from_png_or_fail(hb_raster_image_t * image, hb_blob_t * png)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_image_deserialize_from_png_or_fail(@NativeType("hb_raster_image_t *") long image, @NativeType("hb_blob_t *") long png) {
        long __functionAddress = Functions.image_deserialize_from_png_or_fail;
        if (CHECKS) {
            check(image);
            check(png);
        }
        return invokePPI(image, png, __functionAddress) != 0;
    }

    // --- [ hb_raster_image_serialize_to_png_or_fail ] ---

    /** {@code hb_blob_t * hb_raster_image_serialize_to_png_or_fail(hb_raster_image_t * image)} */
    @NativeType("hb_blob_t *")
    public static long hb_raster_image_serialize_to_png_or_fail(@NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.image_serialize_to_png_or_fail;
        if (CHECKS) {
            check(image);
        }
        return invokePP(image, __functionAddress);
    }

    // --- [ hb_raster_draw_create_or_fail ] ---

    /** {@code hb_raster_draw_t * hb_raster_draw_create_or_fail(void)} */
    @NativeType("hb_raster_draw_t *")
    public static long hb_raster_draw_create_or_fail() {
        long __functionAddress = Functions.draw_create_or_fail;
        return invokeP(__functionAddress);
    }

    // --- [ hb_raster_draw_reference ] ---

    /** {@code hb_raster_draw_t * hb_raster_draw_reference(hb_raster_draw_t * draw)} */
    @NativeType("hb_raster_draw_t *")
    public static long hb_raster_draw_reference(@NativeType("hb_raster_draw_t *") long draw) {
        long __functionAddress = Functions.draw_reference;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_raster_draw_destroy ] ---

    /** {@code void hb_raster_draw_destroy(hb_raster_draw_t * draw)} */
    public static void hb_raster_draw_destroy(@NativeType("hb_raster_draw_t *") long draw) {
        long __functionAddress = Functions.draw_destroy;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_raster_draw_set_user_data ] ---

    /** {@code hb_bool_t hb_raster_draw_set_user_data(hb_raster_draw_t * draw, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_raster_draw_set_user_data(long draw, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.draw_set_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPPPI(draw, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_draw_set_user_data(hb_raster_draw_t * draw, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_draw_set_user_data(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_raster_draw_set_user_data(draw, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_raster_draw_get_user_data ] ---

    /** {@code void * hb_raster_draw_get_user_data(hb_raster_draw_t * draw, hb_user_data_key_t * key)} */
    public static long nhb_raster_draw_get_user_data(long draw, long key) {
        long __functionAddress = Functions.draw_get_user_data;
        if (CHECKS) {
            check(draw);
        }
        return invokePPP(draw, key, __functionAddress);
    }

    /** {@code void * hb_raster_draw_get_user_data(hb_raster_draw_t * draw, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_raster_draw_get_user_data(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_raster_draw_get_user_data(draw, key.address());
    }

    // --- [ hb_raster_draw_set_transform ] ---

    /** {@code void hb_raster_draw_set_transform(hb_raster_draw_t * draw, float xx, float yx, float xy, float yy, float dx, float dy)} */
    public static void hb_raster_draw_set_transform(@NativeType("hb_raster_draw_t *") long draw, float xx, float yx, float xy, float yy, float dx, float dy) {
        long __functionAddress = Functions.draw_set_transform;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    // --- [ hb_raster_draw_set_scale_factor ] ---

    /** {@code void hb_raster_draw_set_scale_factor(hb_raster_draw_t * draw, float x_scale_factor, float y_scale_factor)} */
    public static void hb_raster_draw_set_scale_factor(@NativeType("hb_raster_draw_t *") long draw, float x_scale_factor, float y_scale_factor) {
        long __functionAddress = Functions.draw_set_scale_factor;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, x_scale_factor, y_scale_factor, __functionAddress);
    }

    // --- [ hb_raster_draw_get_scale_factor ] ---

    /** {@code void hb_raster_draw_get_scale_factor(hb_raster_draw_t * draw, float * x_scale_factor, float * y_scale_factor)} */
    public static void nhb_raster_draw_get_scale_factor(long draw, long x_scale_factor, long y_scale_factor) {
        long __functionAddress = Functions.draw_get_scale_factor;
        if (CHECKS) {
            check(draw);
        }
        invokePPPV(draw, x_scale_factor, y_scale_factor, __functionAddress);
    }

    /** {@code void hb_raster_draw_get_scale_factor(hb_raster_draw_t * draw, float * x_scale_factor, float * y_scale_factor)} */
    public static void hb_raster_draw_get_scale_factor(@NativeType("hb_raster_draw_t *") long draw, @NativeType("float *") @Nullable FloatBuffer x_scale_factor, @NativeType("float *") @Nullable FloatBuffer y_scale_factor) {
        if (CHECKS) {
            checkSafe(x_scale_factor, 1);
            checkSafe(y_scale_factor, 1);
        }
        nhb_raster_draw_get_scale_factor(draw, memAddressSafe(x_scale_factor), memAddressSafe(y_scale_factor));
    }

    // --- [ hb_raster_draw_get_transform ] ---

    /** {@code void hb_raster_draw_get_transform(hb_raster_draw_t * draw, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void nhb_raster_draw_get_transform(long draw, long xx, long yx, long xy, long yy, long dx, long dy) {
        long __functionAddress = Functions.draw_get_transform;
        if (CHECKS) {
            check(draw);
        }
        invokePPPPPPPV(draw, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    /** {@code void hb_raster_draw_get_transform(hb_raster_draw_t * draw, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void hb_raster_draw_get_transform(@NativeType("hb_raster_draw_t *") long draw, @NativeType("float *") @Nullable FloatBuffer xx, @NativeType("float *") @Nullable FloatBuffer yx, @NativeType("float *") @Nullable FloatBuffer xy, @NativeType("float *") @Nullable FloatBuffer yy, @NativeType("float *") @Nullable FloatBuffer dx, @NativeType("float *") @Nullable FloatBuffer dy) {
        if (CHECKS) {
            checkSafe(xx, 1);
            checkSafe(yx, 1);
            checkSafe(xy, 1);
            checkSafe(yy, 1);
            checkSafe(dx, 1);
            checkSafe(dy, 1);
        }
        nhb_raster_draw_get_transform(draw, memAddressSafe(xx), memAddressSafe(yx), memAddressSafe(xy), memAddressSafe(yy), memAddressSafe(dx), memAddressSafe(dy));
    }

    // --- [ hb_raster_draw_set_extents ] ---

    /** {@code void hb_raster_draw_set_extents(hb_raster_draw_t * draw, hb_raster_extents_t const * extents)} */
    public static void nhb_raster_draw_set_extents(long draw, long extents) {
        long __functionAddress = Functions.draw_set_extents;
        if (CHECKS) {
            check(draw);
        }
        invokePPV(draw, extents, __functionAddress);
    }

    /** {@code void hb_raster_draw_set_extents(hb_raster_draw_t * draw, hb_raster_extents_t const * extents)} */
    public static void hb_raster_draw_set_extents(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_raster_extents_t const *") hb_raster_extents_t extents) {
        nhb_raster_draw_set_extents(draw, extents.address());
    }

    // --- [ hb_raster_draw_get_extents ] ---

    /** {@code hb_bool_t hb_raster_draw_get_extents(hb_raster_draw_t * draw, hb_raster_extents_t * extents)} */
    public static int nhb_raster_draw_get_extents(long draw, long extents) {
        long __functionAddress = Functions.draw_get_extents;
        if (CHECKS) {
            check(draw);
        }
        return invokePPI(draw, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_draw_get_extents(hb_raster_draw_t * draw, hb_raster_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_draw_get_extents(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_raster_extents_t *") hb_raster_extents_t extents) {
        return nhb_raster_draw_get_extents(draw, extents.address()) != 0;
    }

    // --- [ hb_raster_draw_set_glyph_extents ] ---

    /** {@code hb_bool_t hb_raster_draw_set_glyph_extents(hb_raster_draw_t * draw, hb_glyph_extents_t const * glyph_extents)} */
    public static int nhb_raster_draw_set_glyph_extents(long draw, long glyph_extents) {
        long __functionAddress = Functions.draw_set_glyph_extents;
        if (CHECKS) {
            check(draw);
        }
        return invokePPI(draw, glyph_extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_draw_set_glyph_extents(hb_raster_draw_t * draw, hb_glyph_extents_t const * glyph_extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_draw_set_glyph_extents(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_glyph_extents_t const *") hb_glyph_extents_t glyph_extents) {
        return nhb_raster_draw_set_glyph_extents(draw, glyph_extents.address()) != 0;
    }

    // --- [ hb_raster_draw_get_funcs ] ---

    /** {@code hb_draw_funcs_t * hb_raster_draw_get_funcs(void)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_raster_draw_get_funcs() {
        long __functionAddress = Functions.draw_get_funcs;
        return invokeP(__functionAddress);
    }

    // --- [ hb_raster_draw_glyph ] ---

    /** {@code void hb_raster_draw_glyph(hb_raster_draw_t * draw, hb_font_t * font, hb_codepoint_t glyph, float pen_x, float pen_y)} */
    public static void hb_raster_draw_glyph(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, float pen_x, float pen_y) {
        long __functionAddress = Functions.draw_glyph;
        if (CHECKS) {
            check(draw);
            check(font);
        }
        invokePPV(draw, font, glyph, pen_x, pen_y, __functionAddress);
    }

    // --- [ hb_raster_draw_render ] ---

    /** {@code hb_raster_image_t * hb_raster_draw_render(hb_raster_draw_t * draw)} */
    @NativeType("hb_raster_image_t *")
    public static long hb_raster_draw_render(@NativeType("hb_raster_draw_t *") long draw) {
        long __functionAddress = Functions.draw_render;
        if (CHECKS) {
            check(draw);
        }
        return invokePP(draw, __functionAddress);
    }

    // --- [ hb_raster_draw_reset ] ---

    /** {@code void hb_raster_draw_reset(hb_raster_draw_t * draw)} */
    public static void hb_raster_draw_reset(@NativeType("hb_raster_draw_t *") long draw) {
        long __functionAddress = Functions.draw_reset;
        if (CHECKS) {
            check(draw);
        }
        invokePV(draw, __functionAddress);
    }

    // --- [ hb_raster_draw_recycle_image ] ---

    /** {@code void hb_raster_draw_recycle_image(hb_raster_draw_t * draw, hb_raster_image_t * image)} */
    public static void hb_raster_draw_recycle_image(@NativeType("hb_raster_draw_t *") long draw, @NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.draw_recycle_image;
        if (CHECKS) {
            check(draw);
            check(image);
        }
        invokePPV(draw, image, __functionAddress);
    }

    // --- [ hb_raster_paint_create_or_fail ] ---

    /** {@code hb_raster_paint_t * hb_raster_paint_create_or_fail(void)} */
    @NativeType("hb_raster_paint_t *")
    public static long hb_raster_paint_create_or_fail() {
        long __functionAddress = Functions.paint_create_or_fail;
        return invokeP(__functionAddress);
    }

    // --- [ hb_raster_paint_reference ] ---

    /** {@code hb_raster_paint_t * hb_raster_paint_reference(hb_raster_paint_t * paint)} */
    @NativeType("hb_raster_paint_t *")
    public static long hb_raster_paint_reference(@NativeType("hb_raster_paint_t *") long paint) {
        long __functionAddress = Functions.paint_reference;
        if (CHECKS) {
            check(paint);
        }
        return invokePP(paint, __functionAddress);
    }

    // --- [ hb_raster_paint_destroy ] ---

    /** {@code void hb_raster_paint_destroy(hb_raster_paint_t * paint)} */
    public static void hb_raster_paint_destroy(@NativeType("hb_raster_paint_t *") long paint) {
        long __functionAddress = Functions.paint_destroy;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_raster_paint_set_user_data ] ---

    /** {@code hb_bool_t hb_raster_paint_set_user_data(hb_raster_paint_t * paint, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_raster_paint_set_user_data(long paint, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.paint_set_user_data;
        if (CHECKS) {
            check(paint);
        }
        return invokePPPPI(paint, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_paint_set_user_data(hb_raster_paint_t * paint, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_paint_set_user_data(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_raster_paint_set_user_data(paint, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_raster_paint_get_user_data ] ---

    /** {@code void * hb_raster_paint_get_user_data(hb_raster_paint_t * paint, hb_user_data_key_t * key)} */
    public static long nhb_raster_paint_get_user_data(long paint, long key) {
        long __functionAddress = Functions.paint_get_user_data;
        if (CHECKS) {
            check(paint);
        }
        return invokePPP(paint, key, __functionAddress);
    }

    /** {@code void * hb_raster_paint_get_user_data(hb_raster_paint_t * paint, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_raster_paint_get_user_data(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_raster_paint_get_user_data(paint, key.address());
    }

    // --- [ hb_raster_paint_set_transform ] ---

    /** {@code void hb_raster_paint_set_transform(hb_raster_paint_t * paint, float xx, float yx, float xy, float yy, float dx, float dy)} */
    public static void hb_raster_paint_set_transform(@NativeType("hb_raster_paint_t *") long paint, float xx, float yx, float xy, float yy, float dx, float dy) {
        long __functionAddress = Functions.paint_set_transform;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    // --- [ hb_raster_paint_get_transform ] ---

    /** {@code void hb_raster_paint_get_transform(hb_raster_paint_t * paint, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void nhb_raster_paint_get_transform(long paint, long xx, long yx, long xy, long yy, long dx, long dy) {
        long __functionAddress = Functions.paint_get_transform;
        if (CHECKS) {
            check(paint);
        }
        invokePPPPPPPV(paint, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    /** {@code void hb_raster_paint_get_transform(hb_raster_paint_t * paint, float * xx, float * yx, float * xy, float * yy, float * dx, float * dy)} */
    public static void hb_raster_paint_get_transform(@NativeType("hb_raster_paint_t *") long paint, @NativeType("float *") @Nullable FloatBuffer xx, @NativeType("float *") @Nullable FloatBuffer yx, @NativeType("float *") @Nullable FloatBuffer xy, @NativeType("float *") @Nullable FloatBuffer yy, @NativeType("float *") @Nullable FloatBuffer dx, @NativeType("float *") @Nullable FloatBuffer dy) {
        if (CHECKS) {
            checkSafe(xx, 1);
            checkSafe(yx, 1);
            checkSafe(xy, 1);
            checkSafe(yy, 1);
            checkSafe(dx, 1);
            checkSafe(dy, 1);
        }
        nhb_raster_paint_get_transform(paint, memAddressSafe(xx), memAddressSafe(yx), memAddressSafe(xy), memAddressSafe(yy), memAddressSafe(dx), memAddressSafe(dy));
    }

    // --- [ hb_raster_paint_set_scale_factor ] ---

    /** {@code void hb_raster_paint_set_scale_factor(hb_raster_paint_t * paint, float x_scale_factor, float y_scale_factor)} */
    public static void hb_raster_paint_set_scale_factor(@NativeType("hb_raster_paint_t *") long paint, float x_scale_factor, float y_scale_factor) {
        long __functionAddress = Functions.paint_set_scale_factor;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, x_scale_factor, y_scale_factor, __functionAddress);
    }

    // --- [ hb_raster_paint_get_scale_factor ] ---

    /** {@code void hb_raster_paint_get_scale_factor(hb_raster_paint_t * paint, float * x_scale_factor, float * y_scale_factor)} */
    public static void nhb_raster_paint_get_scale_factor(long paint, long x_scale_factor, long y_scale_factor) {
        long __functionAddress = Functions.paint_get_scale_factor;
        if (CHECKS) {
            check(paint);
        }
        invokePPPV(paint, x_scale_factor, y_scale_factor, __functionAddress);
    }

    /** {@code void hb_raster_paint_get_scale_factor(hb_raster_paint_t * paint, float * x_scale_factor, float * y_scale_factor)} */
    public static void hb_raster_paint_get_scale_factor(@NativeType("hb_raster_paint_t *") long paint, @NativeType("float *") @Nullable FloatBuffer x_scale_factor, @NativeType("float *") @Nullable FloatBuffer y_scale_factor) {
        if (CHECKS) {
            checkSafe(x_scale_factor, 1);
            checkSafe(y_scale_factor, 1);
        }
        nhb_raster_paint_get_scale_factor(paint, memAddressSafe(x_scale_factor), memAddressSafe(y_scale_factor));
    }

    // --- [ hb_raster_paint_set_extents ] ---

    /** {@code void hb_raster_paint_set_extents(hb_raster_paint_t * paint, hb_raster_extents_t const * extents)} */
    public static void nhb_raster_paint_set_extents(long paint, long extents) {
        long __functionAddress = Functions.paint_set_extents;
        if (CHECKS) {
            check(paint);
        }
        invokePPV(paint, extents, __functionAddress);
    }

    /** {@code void hb_raster_paint_set_extents(hb_raster_paint_t * paint, hb_raster_extents_t const * extents)} */
    public static void hb_raster_paint_set_extents(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_raster_extents_t const *") hb_raster_extents_t extents) {
        nhb_raster_paint_set_extents(paint, extents.address());
    }

    // --- [ hb_raster_paint_get_extents ] ---

    /** {@code hb_bool_t hb_raster_paint_get_extents(hb_raster_paint_t * paint, hb_raster_extents_t * extents)} */
    public static int nhb_raster_paint_get_extents(long paint, long extents) {
        long __functionAddress = Functions.paint_get_extents;
        if (CHECKS) {
            check(paint);
        }
        return invokePPI(paint, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_paint_get_extents(hb_raster_paint_t * paint, hb_raster_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_paint_get_extents(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_raster_extents_t *") hb_raster_extents_t extents) {
        return nhb_raster_paint_get_extents(paint, extents.address()) != 0;
    }

    // --- [ hb_raster_paint_set_glyph_extents ] ---

    /** {@code hb_bool_t hb_raster_paint_set_glyph_extents(hb_raster_paint_t * paint, hb_glyph_extents_t const * glyph_extents)} */
    public static int nhb_raster_paint_set_glyph_extents(long paint, long glyph_extents) {
        long __functionAddress = Functions.paint_set_glyph_extents;
        if (CHECKS) {
            check(paint);
        }
        return invokePPI(paint, glyph_extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_raster_paint_set_glyph_extents(hb_raster_paint_t * paint, hb_glyph_extents_t const * glyph_extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_paint_set_glyph_extents(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_glyph_extents_t const *") hb_glyph_extents_t glyph_extents) {
        return nhb_raster_paint_set_glyph_extents(paint, glyph_extents.address()) != 0;
    }

    // --- [ hb_raster_paint_set_foreground ] ---

    /** {@code void hb_raster_paint_set_foreground(hb_raster_paint_t * paint, hb_color_t foreground)} */
    public static void hb_raster_paint_set_foreground(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_color_t") int foreground) {
        long __functionAddress = Functions.paint_set_foreground;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, foreground, __functionAddress);
    }

    // --- [ hb_raster_paint_clear_custom_palette_colors ] ---

    /** {@code void hb_raster_paint_clear_custom_palette_colors(hb_raster_paint_t * paint)} */
    public static void hb_raster_paint_clear_custom_palette_colors(@NativeType("hb_raster_paint_t *") long paint) {
        long __functionAddress = Functions.paint_clear_custom_palette_colors;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_raster_paint_set_custom_palette_color ] ---

    /** {@code hb_bool_t hb_raster_paint_set_custom_palette_color(hb_raster_paint_t * paint, unsigned int color_index, hb_color_t color)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_paint_set_custom_palette_color(@NativeType("hb_raster_paint_t *") long paint, @NativeType("unsigned int") int color_index, @NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.paint_set_custom_palette_color;
        if (CHECKS) {
            check(paint);
        }
        return invokePI(paint, color_index, color, __functionAddress) != 0;
    }

    // --- [ hb_raster_paint_get_funcs ] ---

    /** {@code hb_paint_funcs_t * hb_raster_paint_get_funcs(void)} */
    @NativeType("hb_paint_funcs_t *")
    public static long hb_raster_paint_get_funcs() {
        long __functionAddress = Functions.paint_get_funcs;
        return invokeP(__functionAddress);
    }

    // --- [ hb_raster_paint_glyph ] ---

    /** {@code hb_bool_t hb_raster_paint_glyph(hb_raster_paint_t * paint, hb_font_t * font, hb_codepoint_t glyph, float pen_x, float pen_y, unsigned int palette, hb_color_t foreground)} */
    @NativeType("hb_bool_t")
    public static boolean hb_raster_paint_glyph(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, float pen_x, float pen_y, @NativeType("unsigned int") int palette, @NativeType("hb_color_t") int foreground) {
        long __functionAddress = Functions.paint_glyph;
        if (CHECKS) {
            check(paint);
            check(font);
        }
        return invokePPI(paint, font, glyph, pen_x, pen_y, palette, foreground, __functionAddress) != 0;
    }

    // --- [ hb_raster_paint_render ] ---

    /** {@code hb_raster_image_t * hb_raster_paint_render(hb_raster_paint_t * paint)} */
    @NativeType("hb_raster_image_t *")
    public static long hb_raster_paint_render(@NativeType("hb_raster_paint_t *") long paint) {
        long __functionAddress = Functions.paint_render;
        if (CHECKS) {
            check(paint);
        }
        return invokePP(paint, __functionAddress);
    }

    // --- [ hb_raster_paint_reset ] ---

    /** {@code void hb_raster_paint_reset(hb_raster_paint_t * paint)} */
    public static void hb_raster_paint_reset(@NativeType("hb_raster_paint_t *") long paint) {
        long __functionAddress = Functions.paint_reset;
        if (CHECKS) {
            check(paint);
        }
        invokePV(paint, __functionAddress);
    }

    // --- [ hb_raster_paint_recycle_image ] ---

    /** {@code void hb_raster_paint_recycle_image(hb_raster_paint_t * paint, hb_raster_image_t * image)} */
    public static void hb_raster_paint_recycle_image(@NativeType("hb_raster_paint_t *") long paint, @NativeType("hb_raster_image_t *") long image) {
        long __functionAddress = Functions.paint_recycle_image;
        if (CHECKS) {
            check(paint);
            check(image);
        }
        invokePPV(paint, image, __functionAddress);
    }

}