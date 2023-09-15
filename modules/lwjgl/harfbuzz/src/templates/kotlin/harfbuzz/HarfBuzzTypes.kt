/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz

import org.lwjgl.generator.*
import java.io.*

val HARFBUZZ_BINDING = object : SimpleBinding(Module.HARFBUZZ, "HARFBUZZ") {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        println(
            """
${t}private static final SharedLibrary HARFBUZZ;
${t}static {
$t${t}SharedLibrary library;

$t${t}Object value = Configuration.HARFBUZZ_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("harfbuzz"));
$t${t}if (value instanceof SharedLibrary) {
$t$t${t}library = (SharedLibrary)value;
$t$t} else {
$t$t${t}String name = (String)value;
$t$t${t}if ("freetype".equals(name)) {
$t$t$t${t}try {
$t$t$t$t${t}library = (SharedLibrary)Class
$t$t$t$t$t$t.forName("org.lwjgl.util.freetype.FreeType")
$t$t$t$t$t$t.getMethod("getLibrary")
$t$t$t$t$t$t.invoke(null, (Object[])null);
$t$t$t$t} catch (Exception e) {
$t$t$t$t${t}throw new RuntimeException(e);
$t$t$t$t}
$t$t$t} else {
$t$t$t${t}library = Library.loadNative(HarfBuzz.class, "org.lwjgl.harfbuzz", name, true);
$t$t$t}
$t$t}

$t${t}HARFBUZZ = library;
$t}""")
        generateFunctionsClass(nativeClass, "\n$t/** Contains the function pointers loaded from the harfbuzz {@link SharedLibrary}. */")
        println("""
    /** Returns the harfbuzz {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HARFBUZZ;
    }""")
    }
}
val HARFBUZZ_BINDING_DELEGATE = HARFBUZZ_BINDING.delegate("HarfBuzz.getLibrary()")

val hb_language_t = "hb_language_t".handle

val hb_blob_t = "hb_blob_t".opaque
val hb_bool_t = typedef(intb, "hb_bool_t")
val hb_buffer_t = "hb_buffer_t".opaque
val hb_codepoint_t = typedef(uint32_t, "hb_codepoint_t")
val hb_color_t = typedef(uint32_t, "hb_color_t")
val hb_draw_funcs_t = "hb_draw_funcs_t".opaque
val hb_face_t = "hb_face_t".opaque
val hb_font_funcs_t = "hb_font_funcs_t".opaque
val hb_font_t = "hb_font_t".opaque
val hb_map_t = "hb_map_t".opaque
val hb_mask_t = typedef(uint32_t, "hb_mask_t")
val hb_paint_funcs_t = "hb_paint_funcs_t".opaque
val hb_position_t = typedef(int32_t, "hb_position_t")
val hb_set_t = "hb_set_t".opaque
val hb_shape_plan_t = "hb_shape_plan_t".opaque
val hb_tag_t = typedef(uint32_t, "hb_tag_t")
val hb_unicode_funcs_t = "hb_unicode_funcs_t".opaque

val hb_buffer_cluster_level_t = "hb_buffer_cluster_level_t".enumType
val hb_buffer_content_type_t = "hb_buffer_content_type_t".enumType
val hb_buffer_diff_flags_t = "hb_buffer_diff_flags_t".enumType
val hb_buffer_flags_t = "hb_buffer_flags_t".enumType
val hb_buffer_serialize_flags_t = "hb_buffer_serialize_flags_t".enumType
val hb_buffer_serialize_format_t = "hb_buffer_serialize_format_t".enumType
val hb_direction_t = "hb_direction_t".enumType
val hb_glyph_flags_t = "hb_glyph_flags_t".enumType
val hb_memory_mode_t = "hb_memory_mode_t".enumType
val hb_paint_composite_mode_t = "hb_paint_composite_mode_t".enumType
val hb_paint_extend_t = "hb_paint_extend_t".enumType
val hb_script_t = "hb_script_t".enumType
val hb_style_tag_t = "hb_style_tag_t".enumType
val hb_unicode_combining_class_t = "hb_unicode_combining_class_t".enumType
val hb_unicode_general_category_t = "hb_unicode_general_category_t".enumType

val FT_Face = "FT_Face".handle

val hb_var_int_t = union(Module.HARFBUZZ, "hb_var_int_t") {
    documentation = ""

    uint32_t("u32", "")
    int32_t("i32", "")
    uint16_t("u16", "")[2]
    int16_t("i16", "")[2]
    uint8_t("u8", "")[4]
    int8_t("i8", "")[4]
}

val hb_var_num_t = union(Module.HARFBUZZ, "hb_var_num_t") {
    documentation = ""

    float("f", "")
    uint32_t("u32", "")
    int32_t("i32", "")
    uint16_t("u16", "")[2]
    int16_t("i16", "")[2]
    uint8_t("u8", "")[4]
    int8_t("i8", "")[4]
}

val hb_user_data_key_t = struct(Module.HARFBUZZ, "hb_user_data_key_t") {
    documentation =
        "Data structure for holding user-data keys."

    char("unused", "").private()
}

val hb_destroy_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_destroy_func_t",
        "A virtual method for destroy user-data callbacks.",

        nullable..opaque_p("user_data", "the data to be destroyed"),

        nativeType = "hb_destroy_func_t"
    )
}

val hb_feature_t = struct(Module.HARFBUZZ, "hb_feature_t") {
    documentation =
        """
        The structure that holds information about requested feature application.
        
        The feature will be applied with the given value to all  glyphs which are in clusters between start (inclusive) and end (exclusive). Setting start to
        #FEATURE_GLOBAL_START and end to #FEATURE_GLOBAL_END specifies that the feature always applies to the entire buffer.
        """

    hb_tag_t("tag", "the {@code hb_tag_t} tag of the feature")
    uint32_t(
        "value",
        """
        The value of the feature.

        0 disables the feature, non-zero (usually 1) enables the feature. For features implemented as lookup type 3 (like 'salt') the value is a one based
        index into the alternates.
        """
    )
    unsigned_int("start", "the cluster to start applying this feature setting (inclusive)")
    unsigned_int("end", "the cluster to end applying this feature setting (exclusive).")
}

val hb_variation_t = struct(Module.HARFBUZZ, "hb_variation_t") {
    documentation =
        """
        Data type for holding variation data.

        Registered OpenType variation-axis tags are listed in
        ${url("https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg", "OpenType Axis Tag Registry")}.
        """

    hb_tag_t("tag", "the {@code hb_tag_t} tag of the variation-axis name")
    float("value", "the value of the variation axis")
}

val hb_unicode_combining_class_func_t = Module.HARFBUZZ.callback {
    hb_unicode_combining_class_t(
        "hb_unicode_combining_class_func_t",
        """
        A virtual method for the {@code hb_unicode_funcs_t} structure.

        This method should retrieve the Canonical Combining Class (ccc) property for a specified Unicode code point.

        Return value: The {@code hb_unicode_combining_class_t} of unicode
        """,

        hb_unicode_funcs_t.p("ufuncs", "a Unicode-functions structure"),
        hb_codepoint_t("unicode", "the code point to query"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_unicode_combining_class_func_t"
    )
}

val hb_unicode_general_category_func_t = Module.HARFBUZZ.callback {
    hb_unicode_general_category_t(
        "hb_unicode_general_category_func_t",
        """
        A virtual method for the {@code hb_unicode_funcs_t} structure.

        This method should retrieve the General Category property for a specified Unicode code point.

        Return value: The {@code hb_unicode_general_category_t} of unicode
        """,

        hb_unicode_funcs_t.p("ufuncs", "a Unicode-functions structure"),
        hb_codepoint_t("unicode", "the code point to query"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_unicode_general_category_func_t"
    )
}

val hb_unicode_mirroring_func_t = Module.HARFBUZZ.callback {
    hb_codepoint_t(
        "hb_unicode_mirroring_func_t",
        """
        A virtual method for the {@code hb_unicode_funcs_t} structure.

        This method should retrieve the Bi-Directional Mirroring Glyph code point for a specified Unicode code point.

        Note: If a code point does not have a specified Bi-Directional Mirroring Glyph defined, the method should return the original code point.

        Return value: The {@code hb_codepoint_t} of the Mirroring Glyph for unicode
        """,

        hb_unicode_funcs_t.p("ufuncs", "a Unicode-functions structure"),
        hb_codepoint_t("unicode", "the code point to query"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_unicode_mirroring_func_t"
    )
}

val hb_unicode_script_func_t = Module.HARFBUZZ.callback {
    hb_script_t(
        "hb_unicode_script_func_t",
        """
        A virtual method for the {@code hb_unicode_funcs_t} structure.

        This method should retrieve the Script property for a specified Unicode code point.

        Return value: The {@code hb_script_t} of unicode
        """,

        hb_unicode_funcs_t.p("ufuncs", "a Unicode-functions structure"),
        hb_codepoint_t("unicode", "the code point to query"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_unicode_script_func_t"
    )
}

val hb_unicode_compose_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_unicode_compose_func_t",
        """
        A virtual method for the {@code hb_unicode_funcs_t} structure.

        This method should compose a sequence of two input Unicode code points by canonical equivalence, returning the composed code point in a
        {@code hb_codepoint_t} output parameter (if successful). The method must return an {@code hb_bool_t} indicating the success of the composition.

        Return value: {@code true} is {@code a},{@code b} composed, {@code false} otherwise
        """,

        hb_unicode_funcs_t.p("ufuncs", "a Unicode-functions structure"),
        hb_codepoint_t("a", "the first code point to compose"),
        hb_codepoint_t("b", "the second code point to compose"),
        Check(1)..hb_codepoint_t.p("ab", "the composed code point"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_unicode_compose_func_t"
    )
}

val hb_unicode_decompose_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_unicode_decompose_func_t",
        """
        A virtual method for the {@code hb_unicode_funcs_t} structure.

        This method should decompose an input Unicode code point, returning the two decomposed code points in {@code hb_codepoint_t} output parameters (if
        successful). The method must return an {@code hb_bool_t} indicating the success of the composition.

        Return value: {@code true} if {@code ab} decomposed, {@code false} otherwise
        """,

        hb_unicode_funcs_t.p("ufuncs", "a Unicode-functions structure"),
        hb_codepoint_t("ab", "the code point to decompose"),
        Check(1)..hb_codepoint_t.p("a", "the first decomposed code point"),
        Check(1)..hb_codepoint_t.p("b", "the second decomposed code point"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_unicode_decompose_func_t"
    )
}

val hb_reference_table_func_t = Module.HARFBUZZ.callback {
    hb_blob_t.p(
        "hb_reference_table_func_t",
        """
        Callback function for #face_create_for_tables().

        Return value: (transfer full): A pointer to the tag table within face
        """,

        hb_face_t.p("face", "an {@code hb_face_t} to reference table for"),
        hb_tag_t("tag", "the tag of the table to reference"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_reference_table_func_t"
    )
}

val hb_draw_state_t = struct(Module.HARFBUZZ, "hb_draw_state_t") {
    documentation = "Current drawing state."

    hb_bool_t("path_open", "whether there is an open path")
    float("path_start_x", "X component of the start of current path")
    float("path_start_y", "Y component of the start of current path")
    float("current_x", "X component of current point")
    float("current_y", "Y component of current point")
    hb_var_num_t("reserved1", "").private()
    hb_var_num_t("reserved2", "").private()
    hb_var_num_t("reserved3", "").private()
    hb_var_num_t("reserved4", "").private()
    hb_var_num_t("reserved5", "").private()
    hb_var_num_t("reserved6", "").private()
    hb_var_num_t("reserved7", "").private()
}

val hb_draw_move_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_move_to_func_t",
        "A virtual method for the {@code hb_draw_funcs_t} to perform a \"move-to\" draw operation.",

        hb_draw_funcs_t.p("dfuncs", "draw functions object"),
        void.p("draw_data", "the data accompanying the draw functions"),
        hb_draw_state_t.p("st", "current draw state"),
        float("to_x", "X component of target point"),
        float("to_y", "Y component of target point"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_draw_move_to_func_t"
    )
}

val hb_draw_line_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_line_to_func_t",
        "A virtual method for the {@code hb_draw_funcs_t} to perform a \"line-to\" draw operation.",

        hb_draw_funcs_t.p("dfuncs", "draw functions object"),
        void.p("draw_data", "the data accompanying the draw functions in #font_draw_glyph()"),
        hb_draw_state_t.p("st", "current draw state"),
        float("to_x", "X component of target point"),
        float("to_y", "Y component of target point"),
        nullable..opaque_p("user_data", "user data pointer passed to #draw_funcs_set_line_to_func()"),

        nativeType = "hb_draw_line_to_func_t"
    )
}

val hb_draw_quadratic_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_quadratic_to_func_t",
        "A virtual method for the {@code hb_draw_funcs_t} to perform a \"quadratic-to\" draw operation.",

        hb_draw_funcs_t.p("dfuncs", "draw functions object"),
        void.p("draw_data", "the data accompanying the draw functions in #font_draw_glyph()"),
        hb_draw_state_t.p("st", "current draw state"),
        float("control_x", "X component of control point"),
        float("control_y", "Y component of control point"),
        float("to_x", "X component of target point"),
        float("to_y", "Y component of target point"),
        nullable..opaque_p("user_data", "user data pointer passed to #draw_funcs_set_quadratic_to_func()"),

        nativeType = "hb_draw_quadratic_to_func_t"
    )
}

val hb_draw_cubic_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_cubic_to_func_t",
        "A virtual method for the {@code hb_draw_funcs_t} to perform a \"cubic-to\" draw operation.",

        hb_draw_funcs_t.p("dfuncs", "draw functions object"),
        void.p("draw_data", "the data accompanying the draw functions in #font_draw_glyph()"),
        hb_draw_state_t.p("st", "current draw state"),
        float("control1_x", "X component of first control point"),
        float("control1_y", "Y component of first control point"),
        float("control2_x", "X component of second control point"),
        float("control2_y", "Y component of second control point"),
        float("to_x", "X component of target point"),
        float("to_y", "Y component of target point"),
        nullable..opaque_p("user_data", "user data pointer passed to #draw_funcs_set_cubic_to_func()"),

        nativeType = "hb_draw_cubic_to_func_t"
    )
}

val hb_draw_close_path_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_close_path_func_t",
        "A virtual method for the {@code hb_draw_funcs_t} to perform a \"close-path\" draw operation.",

        hb_draw_funcs_t.p("dfuncs", "draw functions object"),
        void.p("draw_data", "the data accompanying the draw functions in #font_draw_glyph()"),
        hb_draw_state_t.p("st", "current draw state"),
        nullable..opaque_p("user_data", "user data pointer passed to #draw_funcs_set_close_path_func()"),

        nativeType = "hb_draw_close_path_func_t"
    )
}

val hb_font_extents_t = struct(Module.HARFBUZZ, "hb_font_extents_t") {
    documentation =
        """
        Font-wide extent values, measured in font units.

        Note that typically {@code ascender} is positive and {@code descender} negative, in coordinate systems that grow up.
        """

    hb_position_t("ascender", "the height of typographic ascenders")
    hb_position_t("descender", "the depth of typographic descenders")
    hb_position_t("line_gap", "the suggested line-spacing gap")
    hb_position_t("reserved9", "").private()
    hb_position_t("reserved8", "").private()
    hb_position_t("reserved7", "").private()
    hb_position_t("reserved6", "").private()
    hb_position_t("reserved5", "").private()
    hb_position_t("reserved4", "").private()
    hb_position_t("reserved3", "").private()
    hb_position_t("reserved2", "").private()
    hb_position_t("reserved1", "").private()
}

val hb_glyph_extents_t = struct(Module.HARFBUZZ, "hb_glyph_extents_t") {
    documentation =
        """
        Glyph extent values, measured in font units.

        Note that {@code height} is negative, in coordinate systems that grow up.
        """

    hb_position_t("x_bearing", "distance from the x-origin to the left extremum of the glyph")
    hb_position_t("y_bearing", "distance from the top extremum of the glyph to the y-origin")
    hb_position_t("width", "distance from the left extremum of the glyph to the right extremum")
    hb_position_t("height", "distance from the top extremum of the glyph to the bottom extremum")
}

val hb_font_get_font_extents_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_font_extents_func_t",
        "This method should retrieve the extents for a font.",

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        Check(1)..hb_font_extents_t.p("extents", "the font extents retrieved"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_font_extents_func_t"
    )
}

val hb_font_get_nominal_glyph_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_nominal_glyph_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the nominal glyph ID for a specified Unicode code point. Glyph IDs must be returned in a {@code hb_codepoint_t} output
        parameter.

        Return value: {@code true} if data found, {@code false} otherwise.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("unicode", "the Unicode code point to query"),
        Check(1)..hb_codepoint_t.p("glyph", "the glyph ID retrieved"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_nominal_glyph_func_t"
    )
}

val hb_font_get_variation_glyph_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_variation_glyph_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the glyph ID for a specified Unicode code point followed by a specified Variation Selector code point. Glyph IDs must be
        returned in a {@code hb_codepoint_t} output parameter.

        Return value: {@code true} if data found, {@code false} otherwise.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("unicode", "the Unicode code point to query"),
        hb_codepoint_t("variation_selector", "the variation-selector code point to query"),
        Check(1)..hb_codepoint_t.p("glyph", "the glyph ID retrieved"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_variation_glyph_func_t"
    )
}

val hb_font_get_nominal_glyphs_func_t = Module.HARFBUZZ.callback {
    unsigned_int(
        "hb_font_get_nominal_glyphs_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the nominal glyph IDs for a sequence of Unicode code points. Glyph IDs must be returned in a {@code hb_codepoint_t} output
        parameter.

        Return value: the number of code points processed.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        unsigned_int("count", "number of code points to query"),
        Check("(count * unicode_stride) >> 2")..hb_codepoint_t.const.p("first_unicode", "the first Unicode code point to query"),
        unsigned_int("unicode_stride", "the stride between successive code points"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.p("first_glyph", "the first glyph ID retrieved"),
        unsigned_int("glyph_stride", "the stride between successive glyph IDs"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_nominal_glyphs_func_t"
    )
}

val hb_font_get_glyph_advance_func_t = Module.HARFBUZZ.callback {
    hb_position_t(
        "hb_font_get_glyph_advance_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the advance for a specified glyph. The method must return an {@code hb_position_t}.

        Return value: The advance of glyph within font.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_advance_func_t"
    )
}

val hb_font_get_glyph_advances_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_font_get_glyph_advances_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the advances for a sequence of glyphs.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        unsigned_int("count", "the number of glyph IDs in the sequence queried"),
        Check("(count * unicode_stride) >> 2")..hb_codepoint_t.const.p("first_glyph", "the first glyph ID to query"),
        unsigned_int("glyph_stride", "the stride between successive glyph IDs"),
        Check("(count * advance_stride) >> 2")..hb_position_t.p("first_advance", "the first advance retrieved"),
        unsigned_int("advance_stride", "the stride between successive advances"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_advances_func_t"
    )
}

val hb_font_get_glyph_origin_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_origin_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the (X,Y) coordinates (in font units) of the origin for a glyph. Each coordinate must be returned in an {@code hb_position_t}
        output parameter.

        Return value: {@code true} if data found, {@code false} otherwise
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        Check(1)..hb_position_t.p("x", "the X coordinate of the origin"),
        Check(1)..hb_position_t.p("y", "the Y coordinate of the origin"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_origin_func_t"
    )
}

val hb_font_get_glyph_kerning_func_t = Module.HARFBUZZ.callback {
    hb_position_t(
        "hb_font_get_glyph_kerning_func_t",
        "This method should retrieve the kerning-adjustment value for a glyph-pair in the specified font, for horizontal text segments.",

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("first_glyph", "the glyph ID of the first glyph in the glyph pair"),
        hb_codepoint_t("second_glyph", "the glyph ID of the second glyph in the glyph pair"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_kerning_func_t"
    )
}

val hb_font_get_glyph_extents_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_extents_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the extents for a specified glyph. Extents must be returned in an {@code hb_glyph_extents} output parameter.

        Return value: {@code true} if data found, {@code false} otherwise.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        hb_glyph_extents_t.p("extents", "the {@code hb_glyph_extents_t} retrieved"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_extents_func_t"
    )
}

val hb_font_get_glyph_contour_point_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_contour_point_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the (X,Y) coordinates (in font units) for a specified contour point in a glyph. Each coordinate must be returned as an
        {@code hb_position_t} output parameter.

        Return value: {@code true} if data found, {@code false} otherwise.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        unsigned_int("point_index", "the contour-point index to query"),
        hb_position_t.p("x", "the X value retrieved for the contour point"),
        hb_position_t.p("y", "the Y value retrieved for the contour point"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_contour_point_func_t"
    )
}

val hb_font_get_glyph_name_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_name_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the glyph name that corresponds to a glyph ID. The name should be returned in a string output parameter.

        Return value: {@code true} if data found, {@code false} otherwise.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        char.p("name", "name string retrieved for the glyph ID"),
        AutoSize("name")..unsigned_int("size", "length of the glyph-name string retrieved"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_name_func_t"
    )
}

val hb_font_get_glyph_from_name_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_from_name_func_t",
        """
        A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.

        This method should retrieve the glyph ID that corresponds to a glyph-name string.

        Return value: {@code true} if data found, {@code false} otherwise.
        """,

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "{@code font} user data pointer"),
        charASCII.const.p("name", "the name string to query"),
        AutoSize("name")..int("len", ""),
        Check(1)..hb_codepoint_t.p("glyph", "the glyph ID retrieved"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_get_glyph_from_name_func_t"
    )
}

val hb_font_draw_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_font_draw_glyph_func_t",
        "A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.",

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        hb_draw_funcs_t.p("draw_funcs", "the draw functions to send the shape data to"),
        nullable..opaque_p("draw_data", "the data accompanying the draw functions"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_draw_glyph_func_t"
    )
}

val hb_font_paint_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_font_paint_glyph_func_t",
        "A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.",

        hb_font_t.p("font", "{@code hb_font_t} to work upon"),
        nullable..opaque_p("font_data", "user data pointer"),
        hb_codepoint_t("glyph", "the glyph ID to query"),
        hb_paint_funcs_t.p("paint_funcs", "the paint functions to use"),
        nullable..opaque_p("paint_data", "the data accompanying the paint functions"),
        unsigned_int("palette_index", "the color palette to use"),
        hb_color_t("foreground", "the foreground color"),
        nullable..opaque_p("user_data", "user data pointer passed by the caller"),

        nativeType = "hb_font_paint_glyph_func_t"
    )
}

val hb_paint_push_transform_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_transform_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        float("xx", ""),
        float("yx", ""),
        float("xy", ""),
        float("yy", ""),
        float("dx", ""),
        float("dy", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_push_transform_func_t"
    )
}

val hb_paint_pop_transform_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_pop_transform_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_pop_transform_func_t"
    )
}

val hb_paint_color_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_color_glyph_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_codepoint_t("glyph", ""),
        hb_font_t.p("font", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_color_glyph_func_t"
    )
}

val hb_paint_push_clip_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_clip_glyph_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_codepoint_t("glyph", ""),
        hb_font_t.p("font", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_push_clip_glyph_func_t"
    )
}

val hb_paint_push_clip_rectangle_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_clip_rectangle_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        float("xmin", ""),
        float("ymin", ""),
        float("xmax", ""),
        float("ymax", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_push_clip_rectangle_func_t"
    )
}

val hb_paint_pop_clip_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_pop_clip_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_pop_clip_func_t"
    )
}

val hb_paint_color_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_color_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_bool_t("is_foreground", ""),
        hb_color_t("color", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_color_func_t"
    )
}

val hb_paint_image_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_paint_image_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_blob_t.p("image", ""),
        unsigned_int("width", ""),
        unsigned_int("height", ""),
        hb_tag_t("format", ""),
        float("slant", ""),
        nullable..hb_glyph_extents_t.p("extents", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_image_func_t"
    )
}

val hb_color_stop_t = struct(Module.HARFBUZZ, "hb_color_stop_t") {
    float("offset", "")
    hb_bool_t("is_foreground", "")
    hb_color_t("color", "")
}

val _hb_color_line_t = struct(Module.HARFBUZZ, "hb_color_line_t")
val hb_color_line_get_color_stops_func_t = Module.HARFBUZZ.callback {
    unsigned_int(
        "hb_color_line_get_color_stops_func_t",
        "",

        _hb_color_line_t.p("color_line", ""),
        nullable..opaque_p("color_line_data", ""),
        unsigned_int("start", ""),
        Check(1)..unsigned_int.p("count", ""),
        hb_color_stop_t.p("color_stops", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_color_line_get_color_stops_func_t"
    )
}

val hb_color_line_get_extend_func_t = Module.HARFBUZZ.callback {
    hb_paint_extend_t(
        "hb_color_line_get_extend_func_t",
        "",

        _hb_color_line_t.p("color_line", ""),
        nullable..opaque_p("color_line_data", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_color_line_get_extend_func_t"
    )
}

val hb_color_line_t = struct(Module.HARFBUZZ, "hb_color_line_t") {
    opaque_p("data", "")

    hb_color_line_get_color_stops_func_t("get_color_stops", "")
    nullable..opaque_p("get_color_stops_user_data", "")

    hb_color_line_get_extend_func_t("get_extend", "")
    nullable..opaque_p("get_extend_user_data", "")

    nullable..opaque_p("reserved0", "").private()
    nullable..opaque_p("reserved1", "").private()
    nullable..opaque_p("reserved2", "").private()
    nullable..opaque_p("reserved3", "").private()
    nullable..opaque_p("reserved4", "").private()
    nullable..opaque_p("reserved5", "").private()
    nullable..opaque_p("reserved6", "").private()
    nullable..opaque_p("reserved7", "").private()
    nullable..opaque_p("reserved8", "").private()
}

val hb_paint_linear_gradient_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_linear_gradient_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_color_line_t.p("color_line", ""),
        float("x0", ""),
        float("y0", ""),
        float("x1", ""),
        float("y1", ""),
        float("x2", ""),
        float("y2", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_linear_gradient_func_t"
    )
}

val hb_paint_radial_gradient_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_radial_gradient_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_color_line_t.p("color_line", ""),
        float("x0", ""),
        float("y0", ""),
        float("r0", ""),
        float("x1", ""),
        float("y1", ""),
        float("r1", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_radial_gradient_func_t"
    )
}

val hb_paint_sweep_gradient_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_sweep_gradient_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_color_line_t.p("color_line", ""),
        float("x0", ""),
        float("y0", ""),
        float("start_angle", ""),
        float("end_angle", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_sweep_gradient_func_t"
    )
}

val hb_paint_push_group_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_group_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_push_group_func_t"
    )
}

val hb_paint_pop_group_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_pop_group_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        hb_paint_composite_mode_t("mode", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_pop_group_func_t"
    )
}

val hb_paint_custom_palette_color_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_custom_palette_color_func_t",
        "",

        hb_paint_funcs_t.p("funcs", ""),
        nullable..opaque_p("paint_data", ""),
        unsigned_int("color_index", ""),
        hb_color_t.p("color", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_paint_custom_palette_color_func_t"
    )
}

val hb_font_get_font_h_extents_func_t = typedef(hb_font_get_font_extents_func_t, "hb_font_get_font_h_extents_func_t")
val hb_font_get_font_v_extents_func_t = typedef(hb_font_get_font_extents_func_t, "hb_font_get_font_v_extents_func_t")
val hb_font_get_glyph_h_advance_func_t = typedef(hb_font_get_glyph_advance_func_t, "hb_font_get_glyph_h_advance_func_t")
val hb_font_get_glyph_h_advances_func_t = typedef(hb_font_get_glyph_advances_func_t, "hb_font_get_glyph_h_advances_func_t")
val hb_font_get_glyph_h_kerning_func_t = typedef(hb_font_get_glyph_kerning_func_t, "hb_font_get_glyph_h_kerning_func_t")
val hb_font_get_glyph_h_origin_func_t = typedef(hb_font_get_glyph_origin_func_t, "hb_font_get_glyph_h_origin_func_t")
val hb_font_get_glyph_v_advance_func_t = typedef(hb_font_get_glyph_advance_func_t, "hb_font_get_glyph_v_advance_func_t")
val hb_font_get_glyph_v_advances_func_t = typedef(hb_font_get_glyph_advances_func_t, "hb_font_get_glyph_v_advances_func_t")
val hb_font_get_glyph_v_kerning_func_t = typedef(hb_font_get_glyph_kerning_func_t, "hb_font_get_glyph_v_kerning_func_t")
val hb_font_get_glyph_v_origin_func_t = typedef(hb_font_get_glyph_origin_func_t, "hb_font_get_glyph_v_origin_func_t")

val hb_glyph_info_t = struct(Module.HARFBUZZ, "hb_glyph_info_t") {
    documentation = "The structure that holds information about the glyphs and their relation to input text."

    hb_codepoint_t("codepoint", "either a Unicode code point (before shaping) or a glyph index (after shaping).")
    hb_mask_t("mask", "private")
    uint32_t(
        "cluster",
        """
        the index of the character in the original text that corresponds to this {@code hb_glyph_info_t}, or whatever the client passes to #buffer_add().

        More than one {@code hb_glyph_info_t} can have the same {@code cluster} value, if they resulted from the same character (e.g. one to many glyph
        substitution), and when more than one character gets merged in the same glyph (e.g. many to one glyph substitution) the {@code hb_glyph_info_t} will
        have the smallest cluster value of them. By default some characters are merged into the same cluster (e.g. combining marks have the same cluster as
        their bases) even if they are separate glyphs, #buffer_set_cluster_level() allow selecting more fine-grained cluster handling.
        """
    )
    hb_var_int_t("var1", "").private()
    hb_var_int_t("var2", "").private()
}

val hb_glyph_position_t = struct(Module.HARFBUZZ, "hb_glyph_position_t") {
    documentation =
        """
        The structure that holds the positions of the glyph in both horizontal and vertical directions.

        All positions in {@code hb_glyph_position_t} are relative to the current point.
        """

    hb_position_t("x_advance", "how much the line advances after drawing this glyph when setting text in horizontal direction")
    hb_position_t("y_advance", "how much the line advances after drawing this glyph when setting text in vertical direction")
    hb_position_t("x_offset", "how much the glyph moves on the X-axis before drawing it, this should not affect how much the line advances")
    hb_position_t("y_offset", "how much the glyph moves on the Y-axis before drawing it, this should not affect how much the line advances.")
    hb_var_int_t("var", "").private()
}

val hb_segment_properties_t = struct(Module.HARFBUZZ, "hb_segment_properties_t") {
    documentation =
        """
        The structure that holds various text properties of an {@code hb_buffer_t}.

        Can be set and retrieved using #buffer_set_segment_properties() and #buffer_get_segment_properties(), respectively.
        """

    hb_direction_t("direction", "the {@code hb_direction_t} of the buffer, see #buffer_set_direction().")
    hb_script_t("script", "the {@code hb_script_t} of the buffer, see #buffer_set_script().")
    nullable..hb_language_t("language", "the {@code hb_language_t} of the buffer, see #buffer_set_language().")
    nullable..opaque_p("reserved1", "").private()
    nullable..opaque_p("reserved2", "").private()
}

val hb_buffer_message_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_buffer_message_func_t",
        """
        A callback method for {@code hb_buffer_t}. The method gets called with the {@code hb_buffer_t} it was set on, the {@code hb_font_t} the buffer is
        shaped with and a message describing what step of the shaping process will be performed. Returning {@code false} from this method will skip this
        shaping step and move to the next one.

        Return value: {@code true} to perform the shaping step, {@code false} to skip it.
        """,

        hb_buffer_t.p("buffer", "an {@code hb_buffer_t} to work upon"),
        hb_font_t.p("font", "the {@code hb_font_t} the {@code buffer} is shaped with"),
        charASCII.const.p("message", "#NULL-terminated message passed to the function"),
        nullable..opaque_p("user_data", ""),

        nativeType = "hb_buffer_message_func_t"
    )
}
