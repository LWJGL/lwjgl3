/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz

import org.lwjgl.generator.*
import java.io.*

val HARFBUZZ_BINDING = object : SimpleBinding(Module.HARFBUZZ, "HARFBUZZ") {
    override fun generateFunctionSetup(writer: PrintWriter, nativeClass: NativeClass) {
        with(writer) {
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
    uint32_t("u32")
    int32_t("i32")
    uint16_t("u16")[2]
    int16_t("i16")[2]
    uint8_t("u8")[4]
    int8_t("i8")[4]
}

val hb_var_num_t = union(Module.HARFBUZZ, "hb_var_num_t") {
    float("f")
    uint32_t("u32")
    int32_t("i32")
    uint16_t("u16")[2]
    int16_t("i16")[2]
    uint8_t("u8")[4]
    int8_t("i8")[4]
}

val hb_user_data_key_t = struct(Module.HARFBUZZ, "hb_user_data_key_t") {
    char("unused").private()
}

val hb_destroy_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_destroy_func_t",

        nullable..opaque_p("user_data"),

        nativeType = "hb_destroy_func_t"
    )
}

val hb_feature_t = struct(Module.HARFBUZZ, "hb_feature_t") {
    hb_tag_t("tag")
    uint32_t("value")
    unsigned_int("start")
    unsigned_int("end")
}

val hb_variation_t = struct(Module.HARFBUZZ, "hb_variation_t") {
    hb_tag_t("tag")
    float("value")
}

val hb_unicode_combining_class_func_t = Module.HARFBUZZ.callback {
    hb_unicode_combining_class_t(
        "hb_unicode_combining_class_func_t",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_unicode_combining_class_func_t"
    )
}

val hb_unicode_general_category_func_t = Module.HARFBUZZ.callback {
    hb_unicode_general_category_t(
        "hb_unicode_general_category_func_t",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_unicode_general_category_func_t"
    )
}

val hb_unicode_mirroring_func_t = Module.HARFBUZZ.callback {
    hb_codepoint_t(
        "hb_unicode_mirroring_func_t",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_unicode_mirroring_func_t"
    )
}

val hb_unicode_script_func_t = Module.HARFBUZZ.callback {
    hb_script_t(
        "hb_unicode_script_func_t",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_unicode_script_func_t"
    )
}

val hb_unicode_compose_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_unicode_compose_func_t",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("a"),
        hb_codepoint_t("b"),
        Check(1)..hb_codepoint_t.p("ab"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_unicode_compose_func_t"
    )
}

val hb_unicode_decompose_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_unicode_decompose_func_t",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("ab"),
        Check(1)..hb_codepoint_t.p("a"),
        Check(1)..hb_codepoint_t.p("b"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_unicode_decompose_func_t"
    )
}

val hb_reference_table_func_t = Module.HARFBUZZ.callback {
    hb_blob_t.p(
        "hb_reference_table_func_t",

        hb_face_t.p("face"),
        hb_tag_t("tag"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_reference_table_func_t"
    )
}

val hb_draw_state_t = struct(Module.HARFBUZZ, "hb_draw_state_t") {
    hb_bool_t("path_open")
    float("path_start_x")
    float("path_start_y")
    float("current_x")
    float("current_y")
    hb_var_num_t("reserved1").private()
    hb_var_num_t("reserved2").private()
    hb_var_num_t("reserved3").private()
    hb_var_num_t("reserved4").private()
    hb_var_num_t("reserved5").private()
    hb_var_num_t("reserved6").private()
    hb_var_num_t("reserved7").private()
}

val hb_draw_move_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_move_to_func_t",

        hb_draw_funcs_t.p("dfuncs"),
        void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("to_x"),
        float("to_y"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_draw_move_to_func_t"
    )
}

val hb_draw_line_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_line_to_func_t",

        hb_draw_funcs_t.p("dfuncs"),
        void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("to_x"),
        float("to_y"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_draw_line_to_func_t"
    )
}

val hb_draw_quadratic_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_quadratic_to_func_t",

        hb_draw_funcs_t.p("dfuncs"),
        void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("control_x"),
        float("control_y"),
        float("to_x"),
        float("to_y"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_draw_quadratic_to_func_t"
    )
}

val hb_draw_cubic_to_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_cubic_to_func_t",

        hb_draw_funcs_t.p("dfuncs"),
        void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("control1_x"),
        float("control1_y"),
        float("control2_x"),
        float("control2_y"),
        float("to_x"),
        float("to_y"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_draw_cubic_to_func_t"
    )
}

val hb_draw_close_path_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_draw_close_path_func_t",

        hb_draw_funcs_t.p("dfuncs"),
        void.p("draw_data"),
        hb_draw_state_t.p("st"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_draw_close_path_func_t"
    )
}

val hb_font_extents_t = struct(Module.HARFBUZZ, "hb_font_extents_t") {
    hb_position_t("ascender")
    hb_position_t("descender")
    hb_position_t("line_gap")
    hb_position_t("reserved9").private()
    hb_position_t("reserved8").private()
    hb_position_t("reserved7").private()
    hb_position_t("reserved6").private()
    hb_position_t("reserved5").private()
    hb_position_t("reserved4").private()
    hb_position_t("reserved3").private()
    hb_position_t("reserved2").private()
    hb_position_t("reserved1").private()
}

val hb_glyph_extents_t = struct(Module.HARFBUZZ, "hb_glyph_extents_t") {
    hb_position_t("x_bearing")
    hb_position_t("y_bearing")
    hb_position_t("width")
    hb_position_t("height")
}

val hb_font_get_font_extents_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_font_extents_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        Check(1)..hb_font_extents_t.p("extents"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_font_extents_func_t"
    )
}

val hb_font_get_nominal_glyph_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_nominal_glyph_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("unicode"),
        Check(1)..hb_codepoint_t.p("glyph"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_nominal_glyph_func_t"
    )
}

val hb_font_get_variation_glyph_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_variation_glyph_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("unicode"),
        hb_codepoint_t("variation_selector"),
        Check(1)..hb_codepoint_t.p("glyph"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_variation_glyph_func_t"
    )
}

val hb_font_get_nominal_glyphs_func_t = Module.HARFBUZZ.callback {
    unsigned_int(
        "hb_font_get_nominal_glyphs_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        unsigned_int("count"),
        Check("(count * unicode_stride) >> 2")..hb_codepoint_t.const.p("first_unicode"),
        unsigned_int("unicode_stride"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.p("first_glyph"),
        unsigned_int("glyph_stride"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_nominal_glyphs_func_t"
    )
}

val hb_font_get_glyph_advance_func_t = Module.HARFBUZZ.callback {
    hb_position_t(
        "hb_font_get_glyph_advance_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_advance_func_t"
    )
}

val hb_font_get_glyph_advances_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_font_get_glyph_advances_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        unsigned_int("count"),
        Check("(count * unicode_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned_int("glyph_stride"),
        Check("(count * advance_stride) >> 2")..hb_position_t.p("first_advance"),
        unsigned_int("advance_stride"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_advances_func_t"
    )
}

val hb_font_get_glyph_origin_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_origin_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_origin_func_t"
    )
}

val hb_font_get_glyph_origins_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_origin_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        unsigned_int("count"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned("glyph_stride"),
        Check("(count * x_stride) >> 2")..hb_position_t.p("first_x"),
        unsigned("x_stride"),
        Check("(count * y_stride) >> 2")..hb_position_t.p("first_y"),
        unsigned("y_stride"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_origins_func_t"
    )
}

val hb_font_get_glyph_kerning_func_t = Module.HARFBUZZ.callback {
    hb_position_t(
        "hb_font_get_glyph_kerning_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("first_glyph"),
        hb_codepoint_t("second_glyph"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_kerning_func_t"
    )
}

val hb_font_get_glyph_extents_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_extents_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        hb_glyph_extents_t.p("extents"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_extents_func_t"
    )
}

val hb_font_get_glyph_contour_point_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_contour_point_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        unsigned_int("point_index"),
        hb_position_t.p("x"),
        hb_position_t.p("y"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_contour_point_func_t"
    )
}

val hb_font_get_glyph_name_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_name_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        char.p("name"),
        AutoSize("name")..unsigned_int("size"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_name_func_t"
    )
}

val hb_font_get_glyph_from_name_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_get_glyph_from_name_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        charASCII.const.p("name"),
        AutoSize("name")..int("len"),
        Check(1)..hb_codepoint_t.p("glyph"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_get_glyph_from_name_func_t"
    )
}

// TODO: remove in LWJGL 4
val hb_font_draw_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_font_draw_glyph_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        hb_draw_funcs_t.p("draw_funcs"),
        nullable..opaque_p("draw_data"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_draw_glyph_func_t"
    )
}

val hb_font_draw_glyph_or_fail_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_draw_glyph_or_fail_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        hb_draw_funcs_t.p("draw_funcs"),
        nullable..opaque_p("draw_data"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_draw_glyph_or_fail_func_t"
    )
}

// TODO: remove in LWJGL 4
val hb_font_paint_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_font_paint_glyph_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        hb_paint_funcs_t.p("paint_funcs"),
        nullable..opaque_p("paint_data"),
        unsigned_int("palette_index"),
        hb_color_t("foreground"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_paint_glyph_func_t"
    )
}

val hb_font_paint_glyph_or_fail_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_font_paint_glyph_or_fail_func_t",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        hb_codepoint_t("glyph"),
        hb_paint_funcs_t.p("paint_funcs"),
        nullable..opaque_p("paint_data"),
        unsigned_int("palette_index"),
        hb_color_t("foreground"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_font_paint_glyph_or_fail_func_t"
    )
}

val hb_paint_push_transform_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_transform_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        float("xx"),
        float("yx"),
        float("xy"),
        float("yy"),
        float("dx"),
        float("dy"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_push_transform_func_t"
    )
}

val hb_paint_pop_transform_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_pop_transform_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_pop_transform_func_t"
    )
}

val hb_paint_color_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_color_glyph_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_codepoint_t("glyph"),
        hb_font_t.p("font"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_color_glyph_func_t"
    )
}

val hb_paint_push_clip_glyph_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_clip_glyph_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_codepoint_t("glyph"),
        hb_font_t.p("font"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_push_clip_glyph_func_t"
    )
}

val hb_paint_push_clip_rectangle_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_clip_rectangle_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        float("xmin"),
        float("ymin"),
        float("xmax"),
        float("ymax"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_push_clip_rectangle_func_t"
    )
}

val hb_paint_pop_clip_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_pop_clip_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_pop_clip_func_t"
    )
}

val hb_paint_color_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_color_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_bool_t("is_foreground"),
        hb_color_t("color"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_color_func_t"
    )
}

val hb_paint_image_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_paint_image_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_blob_t.p("image"),
        unsigned_int("width"),
        unsigned_int("height"),
        hb_tag_t("format"),
        float("slant"),
        nullable..hb_glyph_extents_t.p("extents"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_image_func_t"
    )
}

val hb_color_stop_t = struct(Module.HARFBUZZ, "hb_color_stop_t") {
    float("offset")
    hb_bool_t("is_foreground")
    hb_color_t("color")
}

val _hb_color_line_t = struct(Module.HARFBUZZ, "hb_color_line_t")
val hb_color_line_get_color_stops_func_t = Module.HARFBUZZ.callback {
    unsigned_int(
        "hb_color_line_get_color_stops_func_t",

        _hb_color_line_t.p("color_line"),
        nullable..opaque_p("color_line_data"),
        unsigned_int("start"),
        Check(1)..unsigned_int.p("count"),
        hb_color_stop_t.p("color_stops"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_color_line_get_color_stops_func_t"
    )
}

val hb_color_line_get_extend_func_t = Module.HARFBUZZ.callback {
    hb_paint_extend_t(
        "hb_color_line_get_extend_func_t",

        _hb_color_line_t.p("color_line"),
        nullable..opaque_p("color_line_data"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_color_line_get_extend_func_t"
    )
}

val hb_color_line_t = struct(Module.HARFBUZZ, "hb_color_line_t") {
    opaque_p("data")

    hb_color_line_get_color_stops_func_t("get_color_stops")
    nullable..opaque_p("get_color_stops_user_data")

    hb_color_line_get_extend_func_t("get_extend")
    nullable..opaque_p("get_extend_user_data")

    nullable..opaque_p("reserved0").private()
    nullable..opaque_p("reserved1").private()
    nullable..opaque_p("reserved2").private()
    nullable..opaque_p("reserved3").private()
    nullable..opaque_p("reserved4").private()
    nullable..opaque_p("reserved5").private()
    nullable..opaque_p("reserved6").private()
    nullable..opaque_p("reserved7").private()
    nullable..opaque_p("reserved8").private()
}

val hb_paint_linear_gradient_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_linear_gradient_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_color_line_t.p("color_line"),
        float("x0"),
        float("y0"),
        float("x1"),
        float("y1"),
        float("x2"),
        float("y2"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_linear_gradient_func_t"
    )
}

val hb_paint_radial_gradient_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_radial_gradient_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_color_line_t.p("color_line"),
        float("x0"),
        float("y0"),
        float("r0"),
        float("x1"),
        float("y1"),
        float("r1"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_radial_gradient_func_t"
    )
}

val hb_paint_sweep_gradient_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_sweep_gradient_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_color_line_t.p("color_line"),
        float("x0"),
        float("y0"),
        float("start_angle"),
        float("end_angle"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_sweep_gradient_func_t"
    )
}

val hb_paint_push_group_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_push_group_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_push_group_func_t"
    )
}

val hb_paint_pop_group_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_pop_group_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_paint_composite_mode_t("mode"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_pop_group_func_t"
    )
}

val hb_paint_custom_palette_color_func_t = Module.HARFBUZZ.callback {
    void(
        "hb_paint_custom_palette_color_func_t",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        unsigned_int("color_index"),
        hb_color_t.p("color"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_paint_custom_palette_color_func_t"
    )
}

val hb_font_get_font_h_extents_func_t = typedef(hb_font_get_font_extents_func_t, "hb_font_get_font_h_extents_func_t")
val hb_font_get_font_v_extents_func_t = typedef(hb_font_get_font_extents_func_t, "hb_font_get_font_v_extents_func_t")
val hb_font_get_glyph_h_advance_func_t = typedef(hb_font_get_glyph_advance_func_t, "hb_font_get_glyph_h_advance_func_t")
val hb_font_get_glyph_h_advances_func_t = typedef(hb_font_get_glyph_advances_func_t, "hb_font_get_glyph_h_advances_func_t")
val hb_font_get_glyph_h_kerning_func_t = typedef(hb_font_get_glyph_kerning_func_t, "hb_font_get_glyph_h_kerning_func_t")
val hb_font_get_glyph_h_origin_func_t = typedef(hb_font_get_glyph_origin_func_t, "hb_font_get_glyph_h_origin_func_t")
val hb_font_get_glyph_h_origins_func_t = typedef(hb_font_get_glyph_origins_func_t, "hb_font_get_glyph_h_origins_func_t")
val hb_font_get_glyph_v_advance_func_t = typedef(hb_font_get_glyph_advance_func_t, "hb_font_get_glyph_v_advance_func_t")
val hb_font_get_glyph_v_advances_func_t = typedef(hb_font_get_glyph_advances_func_t, "hb_font_get_glyph_v_advances_func_t")
val hb_font_get_glyph_v_kerning_func_t = typedef(hb_font_get_glyph_kerning_func_t, "hb_font_get_glyph_v_kerning_func_t")
val hb_font_get_glyph_v_origin_func_t = typedef(hb_font_get_glyph_origin_func_t, "hb_font_get_glyph_v_origin_func_t")
val hb_font_get_glyph_v_origins_func_t = typedef(hb_font_get_glyph_origins_func_t, "hb_font_get_glyph_v_origins_func_t")

val hb_glyph_info_t = struct(Module.HARFBUZZ, "hb_glyph_info_t") {
    hb_codepoint_t("codepoint")
    hb_mask_t("mask")
    uint32_t("cluster")
    hb_var_int_t("var1").private()
    hb_var_int_t("var2").private()
}

val hb_glyph_position_t = struct(Module.HARFBUZZ, "hb_glyph_position_t") {
    hb_position_t("x_advance")
    hb_position_t("y_advance")
    hb_position_t("x_offset")
    hb_position_t("y_offset")
    hb_var_int_t("var").private()
}

val hb_segment_properties_t = struct(Module.HARFBUZZ, "hb_segment_properties_t") {
    hb_direction_t("direction")
    hb_script_t("script")
    nullable..hb_language_t("language")
    nullable..opaque_p("reserved1").private()
    nullable..opaque_p("reserved2").private()
}

val hb_buffer_message_func_t = Module.HARFBUZZ.callback {
    hb_bool_t(
        "hb_buffer_message_func_t",

        hb_buffer_t.p("buffer"),
        hb_font_t.p("font"),
        charASCII.const.p("message"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_buffer_message_func_t"
    )
}

val hb_get_table_tags_func_t = Module.HARFBUZZ.callback {
    unsigned_int(
        "hb_get_table_tags_func_t",

        hb_face_t.const.p("face"),
        unsigned_int("start_offset"),
        Check(1)..unsigned_int.p("table_count"),
        hb_tag_t.p("table_tags"),
        nullable..opaque_p("user_data"),

        nativeType = "hb_get_table_tags_func_t"
    )
}