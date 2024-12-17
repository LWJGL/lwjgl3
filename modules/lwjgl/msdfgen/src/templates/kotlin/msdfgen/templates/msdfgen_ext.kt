/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen.templates

import msdfgen.*
import org.lwjgl.generator.*

val msdfGenExt = "MSDFGenExt".nativeClass(Module.MSDFGEN, prefix = "MSDF", prefixMethod = "msdf_") {
    nativeImport("msdfgen-ext-c.h")

    EnumConstant(
        "FONT_SCALING_NONE".enum("0"),
        "FONT_SCALING_EM_NORMALIZED".enum,
        "FONT_SCALING_LEGACY".enum
    )

    // FreeType extensions

    int(
        "ft_set_load_callback",

        msdf_ft_load_callback("callback")
    )

    msdf_ft_load_callback(
        "ft_get_load_callback",
        void()
    )

    int(
        "ft_init",

        Check(1)..msdf_ft_handle.p("handle")
    )

    int(
        "ft_load_font",

        msdf_ft_handle("handle"),
        charUTF8.const.p("fileName"),
        Check(1)..msdf_ft_font_handle.p("font")
    )

    int(
        "ft_adopt_font",

        opaque_p("face"),
        Check(1)..msdf_ft_font_handle.p("font")
    )

    int(
        "ft_load_font_data",

        msdf_ft_handle("handle"),
        void.const.p("data"),
        AutoSize("data")..size_t("size"),
        Check(1)..msdf_ft_font_handle.p("font")
    )

    int(
        "ft_font_load_glyph",

        msdf_ft_font_handle("font"),
        unsigned("cp"),
        int("coordinateScaling"),
        Check(1)..msdf_shape_handle.p("shape")
    )

    int(
        "ft_font_load_glyph_by_index",

        msdf_ft_font_handle("font"),
        unsigned("index"),
        int("coordinateScaling"),
        Check(1)..msdf_shape_handle.p("shape")
    )

    int(
        "ft_font_get_glyph_index",

        msdf_ft_font_handle("font"),
        unsigned("cp"),
        Check(1)..unsigned.p("index")
    )

    int(
        "ft_font_get_kerning",

        msdf_ft_font_handle("font"),
        unsigned("cp1"),
        unsigned("cp2"),
        Check(1)..double.p("kerning")
    )

    int(
        "ft_font_get_kerning_by_index",

        msdf_ft_font_handle("font"),
        unsigned("index1"),
        unsigned("index2"),
        Check(1)..double.p("kerning")
    )

    void(
        "ft_font_destroy",

        msdf_ft_font_handle("font")
    )

    void(
        "ft_deinit",

        msdf_ft_handle("handle")
    )
}