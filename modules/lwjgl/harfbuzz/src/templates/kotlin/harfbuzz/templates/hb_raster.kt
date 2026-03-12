/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz.templates

import org.lwjgl.generator.*
import harfbuzz.*

val hb_raster = "HarfBuzzRaster".nativeClass(Module.HARFBUZZ, prefix = "HB", prefixMethod = "hb_", binding = HARFBUZZ_RASTER_BINDING) {
    EnumConstant(
        "RASTER_FORMAT_A8".enum("0"),
        "RASTER_FORMAT_BGRA32".enum
    )

    hb_raster_image_t.p(
        "raster_image_create_or_fail",

        void()
    )

    hb_raster_image_t.p(
        "raster_image_reference",

        hb_raster_image_t.p("image")
    )

    void(
        "raster_image_destroy",

        hb_raster_image_t.p("image")
    )

    hb_bool_t(
        "raster_image_set_user_data",

        hb_raster_image_t.p("image"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "raster_image_get_user_data",

        hb_raster_image_t.p("image"),
        hb_user_data_key_t.p("key")
    )

    hb_bool_t(
        "raster_image_configure",

        hb_raster_image_t.p("image"),
        hb_raster_format_t("format"),
        hb_raster_extents_t.const.p("extents")
    )

    void(
        "raster_image_clear",

        hb_raster_image_t.p("image")
    )

    uint8_t.const.p(
        "raster_image_get_buffer",

        hb_raster_image_t.p("image"),
        AutoSizeResult..Virtual..size_t("length")
    )

    void(
        "raster_image_get_extents",

        hb_raster_image_t.p("image"),
        hb_raster_extents_t.p("extents")
    )

    hb_raster_format_t(
        "raster_image_get_format",

        hb_raster_image_t.p("image")
    )

    hb_bool_t(
        "raster_image_deserialize_from_png_or_fail",

        hb_raster_image_t.p("image"),
        hb_blob_t.p("png")
    )

    hb_blob_t.p(
        "raster_image_serialize_to_png_or_fail",

        hb_raster_image_t.p("image")
    )

    hb_raster_draw_t.p(
        "raster_draw_create_or_fail",

        void()
    )

    hb_raster_draw_t.p(
        "raster_draw_reference",

        hb_raster_draw_t.p("draw")
    )

    void(
        "raster_draw_destroy",

        hb_raster_draw_t.p("draw")
    )

    hb_bool_t(
        "raster_draw_set_user_data",

        hb_raster_draw_t.p("draw"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "raster_draw_get_user_data",

        hb_raster_draw_t.p("draw"),
        hb_user_data_key_t.p("key")
    )

    void(
        "raster_draw_set_transform",

        hb_raster_draw_t.p("draw"),
        float("xx"), float("yx"),
        float("xy"), float("yy"),
        float("dx"), float("dy")
    )

    void(
        "raster_draw_set_scale_factor",

        hb_raster_draw_t.p("draw"),
        float("x_scale_factor"),
        float("y_scale_factor")
    )

    void(
        "raster_draw_get_scale_factor",

        hb_raster_draw_t.p("draw"),
        Check(1)..nullable..float.p("x_scale_factor"),
        Check(1)..nullable..float.p("y_scale_factor")
    )

    void(
        "raster_draw_get_transform",

        hb_raster_draw_t.p("draw"),
        Check(1)..nullable..float.p("xx"), Check(1)..nullable..float.p("yx"),
        Check(1)..nullable..float.p("xy"), Check(1)..nullable..float.p("yy"),
        Check(1)..nullable..float.p("dx"), Check(1)..nullable..float.p("dy")
    )

    void(
        "raster_draw_set_extents",

        hb_raster_draw_t.p("draw"),
        hb_raster_extents_t.const.p("extents")
    )

    hb_bool_t(
        "raster_draw_get_extents",

        hb_raster_draw_t.p("draw"),
        hb_raster_extents_t.p("extents")
    )

    hb_bool_t(
        "raster_draw_set_glyph_extents",

        hb_raster_draw_t.p("draw"),
        hb_glyph_extents_t.const.p("glyph_extents")
    )

    hb_draw_funcs_t.p(
        "raster_draw_get_funcs",

        void()
    )

    void(
        "raster_draw_glyph",

        hb_raster_draw_t.p("draw"),
        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        float("pen_x"),
        float("pen_y")
    )

    hb_raster_image_t.p(
        "raster_draw_render",

        hb_raster_draw_t.p("draw")
    )

    void(
        "raster_draw_reset",

        hb_raster_draw_t.p("draw")
    )

    void(
        "raster_draw_recycle_image",

        hb_raster_draw_t.p("draw"),
        hb_raster_image_t.p("image")
    )

    hb_raster_paint_t.p(
        "raster_paint_create_or_fail",

        void()
    )

    hb_raster_paint_t.p(
        "raster_paint_reference",

        hb_raster_paint_t.p("paint")
    )

    void(
        "raster_paint_destroy",

        hb_raster_paint_t.p("paint")
    )

    hb_bool_t(
        "raster_paint_set_user_data",

        hb_raster_paint_t.p("paint"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "raster_paint_get_user_data",

        hb_raster_paint_t.p("paint"),
        hb_user_data_key_t.p("key")
    )

    void(
        "raster_paint_set_transform",

        hb_raster_paint_t.p("paint"),
        float("xx"), float("yx"),
        float("xy"), float("yy"),
        float("dx"), float("dy")
    )

    void(
        "raster_paint_get_transform",

        hb_raster_paint_t.p("paint"),
        Check(1)..nullable..float.p("xx"), Check(1)..nullable..float.p("yx"),
        Check(1)..nullable..float.p("xy"), Check(1)..nullable..float.p("yy"),
        Check(1)..nullable..float.p("dx"), Check(1)..nullable..float.p("dy")
    )

    void(
        "raster_paint_set_scale_factor",

        hb_raster_paint_t.p("paint"),
        float("x_scale_factor"),
        float("y_scale_factor")
    )

    void(
        "raster_paint_get_scale_factor",

        hb_raster_paint_t.p("paint"),
        Check(1)..nullable..float.p("x_scale_factor"),
        Check(1)..nullable..float.p("y_scale_factor")
    )

    void(
        "raster_paint_set_extents",

        hb_raster_paint_t.p("paint"),
        hb_raster_extents_t.const.p("extents")
    )

    hb_bool_t(
        "raster_paint_get_extents",

        hb_raster_paint_t.p("paint"),
        hb_raster_extents_t.p("extents")
    )

    hb_bool_t(
        "raster_paint_set_glyph_extents",

        hb_raster_paint_t.p("paint"),
        hb_glyph_extents_t.const.p("glyph_extents")
    )

    void(
        "raster_paint_set_foreground",

        hb_raster_paint_t.p("paint"),
        hb_color_t("foreground")
    )

    void(
        "raster_paint_clear_custom_palette_colors",

        hb_raster_paint_t.p("paint")
    )

    hb_bool_t(
        "raster_paint_set_custom_palette_color",

        hb_raster_paint_t.p("paint"),
        unsigned_int("color_index"),
        hb_color_t("color")
    )

    hb_paint_funcs_t.p(
        "raster_paint_get_funcs",

        void()
    )

    hb_bool_t(
        "raster_paint_glyph",

        hb_raster_paint_t.p("paint"),
        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        float("pen_x"),
        float("pen_y"),
        unsigned_int("palette"),
        hb_color_t("foreground")
    )

    hb_raster_image_t.p(
        "raster_paint_render",

        hb_raster_paint_t.p("paint")
    )

    void(
        "raster_paint_reset",

        hb_raster_paint_t.p("paint")
    )

    void(
        "raster_paint_recycle_image",

        hb_raster_paint_t.p("paint"),
        hb_raster_image_t.p("image")
    )
}