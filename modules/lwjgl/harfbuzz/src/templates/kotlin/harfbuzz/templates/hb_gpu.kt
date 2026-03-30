/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz.templates

import org.lwjgl.generator.*
import harfbuzz.*

val hb_gpu = "HarfBuzzGPU".nativeClass(Module.HARFBUZZ, prefix = "HB_GPU", prefixMethod = "hb_gpu_", binding = HARFBUZZ_GPU_BINDING) {
    EnumConstant(
        "SHADER_LANG_GLSL".enum("0"),
        "SHADER_LANG_WGSL".enum("1"),
        "SHADER_LANG_MSL".enum("2"),
        "SHADER_LANG_HLSL".enum("3")
    )

    charUTF8.const.p(
        "shader_fragment_source",

        hb_gpu_shader_lang_t("lang")
    )

    charUTF8.const.p(
        "shader_vertex_source",

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

        hb_gpu_draw_t.p("draw"),
        hb_user_data_key_t.p("key")
    )

    hb_draw_funcs_t.p(
        "draw_get_funcs",

        void()
    )

    void(
        "draw_glyph",

        hb_gpu_draw_t.p("draw"),
        hb_font_t.p("font"),
        hb_codepoint_t("codepoint")
    )

    hb_blob_t.p(
        "draw_encode",

        hb_gpu_draw_t.p("draw")
    )

    void(
        "draw_get_extents",

        hb_gpu_draw_t.p("draw"),
        hb_glyph_extents_t.p("extents")
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
}