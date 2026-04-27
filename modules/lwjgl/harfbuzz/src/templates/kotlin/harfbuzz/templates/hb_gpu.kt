/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz.templates

import org.lwjgl.generator.*
import harfbuzz.*

val hb_gpu = "HarfBuzzGPU".nativeClass(Module.HARFBUZZ, prefix = "HB_GPU", prefixMethod = "hb_gpu_", binding = HARFBUZZ_GPU_BINDING) {
    EnumConstant(
        "SHADER_LANG_INVALID".enum("0"),
        "SHADER_LANG_GLSL".enum,
        "SHADER_LANG_WGSL".enum,
        "SHADER_LANG_MSL".enum,
        "SHADER_LANG_HLSL".enum
    )

    EnumConstant(
        "SHADER_STAGE_VERTEX".enum("0"),
        "SHADER_STAGE_FRAGMENT".enum
    )

    charUTF8.const.p(
        "shader_source",

        hb_gpu_shader_stage_t("stage"),
        hb_gpu_shader_lang_t("lang")
    )

    charUTF8.const.p(
        "draw_shader_source",

        hb_gpu_shader_stage_t("stage"),
        hb_gpu_shader_lang_t("lang")
    )

    hb_gpu_draw_t.p(
        "draw_create_or_fail",

        void()
    )

    hb_gpu_draw_t.p(
        "draw_reference",

        hb_gpu_draw_t.p("draw")
    )

    void(
        "draw_destroy",

        hb_gpu_draw_t.p("draw")
    )

    hb_bool_t(
        "draw_set_user_data",

        hb_gpu_draw_t.p("draw"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "draw_get_user_data",

        hb_gpu_draw_t.const.p("draw"),
        hb_user_data_key_t.p("key")
    )

    void(
        "draw_set_scale",

        hb_gpu_draw_t.p("draw"),
        int("x_scale"),
        int("y_scale")
    )

    void(
        "draw_get_scale",

        hb_gpu_draw_t.const.p("draw"),
        Check(1)..nullable..int.p("x_scale"),
        Check(1)..nullable..int.p("y_scale")
    )

    hb_draw_funcs_t.p(
        "draw_get_funcs",

        hb_gpu_draw_t.const.p("draw")
    )

    void(
        "draw_glyph",

        hb_gpu_draw_t.p("draw"),
        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_bool_t(
        "draw_glyph_or_fail",

        hb_gpu_draw_t.p("draw"),
        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_blob_t.p(
        "draw_encode",

        hb_gpu_draw_t.p("draw"),
        nullable..hb_glyph_extents_t.p("extents")
    )

    void(
        "draw_clear",

        hb_gpu_draw_t.p("draw")
    )

    void(
        "draw_reset",

        hb_gpu_draw_t.p("draw")
    )

    void(
        "draw_recycle_blob",

        hb_gpu_draw_t.p("draw"),
        hb_blob_t.p("blob")
    )

    hb_gpu_paint_t.p(
        "paint_create_or_fail",

        void()
    )

    hb_gpu_paint_t.p(
        "paint_reference",

        hb_gpu_paint_t.p("paint")
    )

    void(
        "paint_destroy",

        hb_gpu_paint_t.p("paint")
    )

    hb_bool_t(
        "paint_set_user_data",

        hb_gpu_paint_t.p("paint"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "paint_get_user_data",

        hb_gpu_paint_t.const.p("paint"),
        hb_user_data_key_t.p("key")
    )

    hb_paint_funcs_t.p(
        "paint_get_funcs",

        hb_gpu_paint_t.const.p("paint")
    )

    void(
        "paint_set_palette",

        hb_gpu_paint_t.p("paint"),
        unsigned("palette")
    )

    unsigned(
        "paint_get_palette",

        hb_gpu_paint_t.const.p("paint")
    )

    void(
        "paint_clear_custom_palette_colors",

        hb_gpu_paint_t.p("paint")
    )

    hb_bool_t(
        "paint_set_custom_palette_color",

        hb_gpu_paint_t.p("paint"),
        unsigned_int("color_index"),
        hb_color_t("color")
    )

    void(
        "paint_set_scale",

        hb_gpu_paint_t.p("paint"),
        int("x_scale"),
        int("y_scale")
    )

    void(
        "paint_get_scale",

        hb_gpu_paint_t.const.p("paint"),
        Check(1)..nullable..int.p("x_scale"),
        Check(1)..nullable..int.p("y_scale")
    )

    void(
        "paint_glyph",

        hb_gpu_paint_t.p("paint"),
        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_bool_t(
        "paint_glyph_or_fail",

        hb_gpu_paint_t.p("paint"),
        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_blob_t.p(
        "paint_encode",

        hb_gpu_paint_t.p("paint"),
        hb_glyph_extents_t.p("extents")
    )

    void(
        "paint_clear",

        hb_gpu_paint_t.p("paint")
    )

    void(
        "paint_reset",

        hb_gpu_paint_t.p("paint")
    )

    void(
        "paint_recycle_blob",

        hb_gpu_paint_t.p("paint"),
        hb_blob_t.p("blob")
    )

    charUTF8.const.p(
        "paint_shader_source",

        hb_gpu_shader_stage_t("stage"),
        hb_gpu_shader_lang_t("lang")
    )
}