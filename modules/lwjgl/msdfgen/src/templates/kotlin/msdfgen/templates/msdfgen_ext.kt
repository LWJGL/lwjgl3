/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen.templates

import msdfgen.*
import org.lwjgl.generator.*

val msdfGenExt = "MSDFGenExt".nativeClass(Module.MSDFGEN, prefix = "MSDF", prefixMethod = "msdf_") {
    nativeImport("msdfgen-ext-c.h")
    documentation = ""

    EnumConstant(
        "",

        "FONT_SCALING_NONE".enum("The coordinates are kept as the integer values native to the font file.", "0"),
        "FONT_SCALING_EM_NORMALIZED".enum("The coordinates will be normalized to the em size, i.e. 1 = 1 em."),
        "FONT_SCALING_LEGACY".enum(
            """
            The incorrect legacy version that was in effect before version 1.12, coordinate values are divided by 64 - DO NOT USE - for backwards compatibility
            only.
            """
        )
    )

    val returnDoc = "#SUCCESS on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}."

    // FreeType extensions

    int(
        "ft_set_load_callback",
        "Overrides the default load callback function used for resolving FreeType function at runtime.",

        msdf_ft_load_callback("callback", "a pointer to the function to call for resolving FreeType functions at runtime"),

        returnDoc = returnDoc
    )

    msdf_ft_load_callback(
        "ft_get_load_callback",
        "Retrieves the current FreeType load callback.",

        returnDoc = "a pointer to the current FreeType load callback function"
    )

    int(
        "ft_init",
        "Initializes a new FreeType instance to be used with msdfgen.",

        Check(1)..msdf_ft_handle.p("handle", "a pointer to a handle to be populated with a new FreeType context"),

        returnDoc = returnDoc
    )

    int(
        "ft_load_font",
        "Loads a TrueType font from the given file(path) and populates the given font handle with the address of the newly loaded font.",

        msdf_ft_handle("handle", "the handle to the FreeType context to use for loading the font"),
        charUTF8.const.p("fileName", "the name or path of/to the font file to load"),
        Check(1)..msdf_ft_font_handle.p("font", "a pointer to a font handle to be populated with the address of the newly loaded font"),

        returnDoc = returnDoc
    )

    int(
        "ft_adopt_font",
        "Adopts the given FreeType {@code FT_Face} pointer as a font handle.",

        opaque_p("face", "an opaque pointer to the {@code FT_Face} to adopt"),
        Check(1)..msdf_ft_font_handle.p("font", "a pointer to an address to be populated with the newly allocated font handle"),

        returnDoc = returnDoc
    )

    int(
        "ft_load_font_data",
        "Loads a TrueType font from the given buffer and populates the given font handle with the address of the newly loaded font.",

        msdf_ft_handle("handle", "the handle to the FreeType context to use for loading the font"),
        void.const.p("data", "a pointer to the raw data of the TrueType font to load"),
        AutoSize("data")..size_t("size", "the size of the data buffer in bytes"),
        Check(1)..msdf_ft_font_handle.p("font", "a pointer to a font handle to be populated with the address of the newly loaded font"),

        returnDoc = returnDoc
    )

    int(
        "ft_font_load_glyph",
        "Loads a single glyph from the given font and converts it into a vector shape for rendering glyph sprites.",

        msdf_ft_font_handle("font", "a handle to the font to use for generating the glyph shape"),
        unsigned("cp", "the codepoint to generate a shape for"),
        int("coordinateScaling", "the coordinate scaling to use", "FONT_SCALING_\\w+"),
        Check(1)..msdf_shape_handle.p(
            "shape",
            """
            a pointer to a handle to be populated with the address of the newly created shape.
            
            This shape must later be freed using #shape_free()!
            """
        ),

        returnDoc = returnDoc
    )

    int(
        "ft_font_load_glyph_by_index",
        "Loads a single glyph from the given font and converts it into a vector shape for rendering glyph sprites.",

        msdf_ft_font_handle("font", "a handle to the font to use for generating the glyph shape"),
        unsigned("index", "the glyph index to generate a shape for"),
        int("coordinateScaling", "the coordinate scaling to use", "FONT_SCALING_\\w+"),
        Check(1)..msdf_shape_handle.p(
            "shape",
            """
            a pointer to a handle to be populated with the address of the newly created shape.
            
            This shape must later be freed using #shape_free()!
            """
        ),

        returnDoc = returnDoc
    )

    int(
        "ft_font_get_glyph_index",
        "Retrieves the glyph index of the given unicode codepoint.",

        msdf_ft_font_handle("font", "a handle to the font to retrieve the glyph index from"),
        unsigned("cp", "the codepoint to retrieve the glyph index for"),
        Check(1)..unsigned.p("index", "a pointer to the glyph index to be retrieved"),

        returnDoc = returnDoc
    )

    int(
        "ft_font_get_kerning",
        "Retrieves the kerning between the two given codepoints.",

        msdf_ft_font_handle("font", "a handle to the font to retrieve the kerning from"),
        unsigned("cp1", "the left codepoint"),
        unsigned("cp2", "the right codepoint"),
        Check(1)..double.p("kerning", "a pointer to the kerning value to be retrieved"),

        returnDoc = returnDoc
    )

    int(
        "ft_font_get_kerning_by_index",
        "etrieves the kerning between the two given glyphs.",

        msdf_ft_font_handle("font", "a handle to the font to retrieve the kerning from"),
        unsigned("index1", "the glyph index of the left glyph"),
        unsigned("index2", "the glyph index of the right glyph"),
        Check(1)..double.p("kerning", "a pointer to the kerning value to be retrieved"),

        returnDoc = returnDoc
    )

    void(
        "ft_font_destroy",
        "Frees the underlying instance of the given FreeType font.",

        msdf_ft_font_handle("font", "the handle to the font to free")
    )

    void(
        "ft_deinit",
        "Frees the underlying FreeType instance of the given context.",

        msdf_ft_handle("handle", "the handle to the FreeType context to free")
    )
}