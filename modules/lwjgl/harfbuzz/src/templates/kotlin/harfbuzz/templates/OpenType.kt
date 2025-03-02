/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz.templates

import org.lwjgl.generator.*
import harfbuzz.*

val hb_ot = "OpenType".nativeClass(Module.HARFBUZZ, prefix = "HB_OT", prefixMethod = "hb_ot_", binding = HARFBUZZ_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.harfbuzz.HarfBuzz.*")

    // hb-ot-color.h

    EnumConstant(
        "COLOR_PALETTE_FLAG_DEFAULT".enum(0x00000000),
        "COLOR_PALETTE_FLAG_USABLE_WITH_LIGHT_BACKGROUND".enum(0x00000001),
        "COLOR_PALETTE_FLAG_USABLE_WITH_DARK_BACKGROUND".enum(0x00000002)
    )

    hb_bool_t(
        "color_has_palettes",

        hb_face_t.p("face")
    )

    unsigned_int(
        "color_palette_get_count",

        hb_face_t.p("face")
    )

    hb_ot_name_id_t(
        "color_palette_get_name_id",

        hb_face_t.p("face"),
        unsigned_int("palette_index")
    )

    hb_ot_name_id_t(
        "color_palette_color_get_name_id",

        hb_face_t.p("face"),
        unsigned_int("color_index")
    )

    hb_ot_color_palette_flags_t(
        "color_palette_get_flags",

        hb_face_t.p("face"),
        unsigned_int("palette_index")
    )

    unsigned_int(
        "color_palette_get_colors",

        hb_face_t.p("face"),
        unsigned_int("palette_index"),
        unsigned_int("start_offset"),
        AutoSize("colors")..Check(1)..nullable..unsigned_int.p("color_count"),
        nullable..hb_color_t.p("colors")
    )

    hb_bool_t(
        "color_has_layers",

        hb_face_t.p("face")
    )

    unsigned_int(
        "color_glyph_get_layers",

        hb_face_t.p("face"),
        hb_codepoint_t("glyph"),
        unsigned_int("start_offset"),
        AutoSize("layers")..Check(1)..nullable..unsigned_int.p("layer_count"),
        nullable..hb_ot_color_layer_t.p("layers")
    )

    hb_bool_t(
        "color_has_svg",

        hb_face_t.p("face")
    )

    hb_blob_t.p(
        "color_glyph_reference_svg",

        hb_face_t.p("face"),
        hb_codepoint_t("glyph")
    )

    hb_bool_t(
        "color_has_png",

        hb_face_t.p("face")
    )

    hb_blob_t.p(
        "color_glyph_reference_png",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    // hb-ot-font.h

    void(
        "font_set_funcs",

        hb_font_t.p("font")
    )

    // hb-ot-layout.h

    IntConstant(
        "TAG_BASE".."HB_TAG('B','A','S','E')",
        "TAG_GDEF".."HB_TAG('G','D','E','F')",
        "TAG_GSUB".."HB_TAG('G','S','U','B')",
        "TAG_GPOS".."HB_TAG('G','P','O','S')",
        "TAG_JSTF".."HB_TAG('J','S','T','F')",
        "TAG_DEFAULT_SCRIPT".."HB_TAG ('D', 'F', 'L', 'T')",
        "TAG_DEFAULT_LANGUAGE".."HB_TAG ('d', 'f', 'l', 't')"
    )

    IntConstant(
        "MAX_TAGS_PER_SCRIPT".."3",
        "MAX_TAGS_PER_LANGUAGE".."3"
    )

    EnumConstant(
        "LAYOUT_GLYPH_CLASS_UNCLASSIFIED".enum("0"),
        "LAYOUT_GLYPH_CLASS_BASE_GLYPH".enum,
        "LAYOUT_GLYPH_CLASS_LIGATURE".enum,
        "LAYOUT_GLYPH_CLASS_MARK".enum,
        "LAYOUT_GLYPH_CLASS_COMPONENT".enum
    )

    IntConstant(
        "LAYOUT_NO_SCRIPT_INDEX".."0xFFFF",
        "LAYOUT_NO_FEATURE_INDEX".."0xFFFF",
        "LAYOUT_DEFAULT_LANGUAGE_INDEX".."0xFFFF",
        "LAYOUT_NO_VARIATIONS_INDEX"..0xFFFFFFFF.i
    )

    EnumConstant(
        "LAYOUT_BASELINE_TAG_ROMAN".enum("HB_TAG ('r','o','m','n')"),
        "LAYOUT_BASELINE_TAG_HANGING".enum("HB_TAG ('h','a','n','g')"),
        "LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT".enum("HB_TAG ('i','c','f','b')"),
        "LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT".enum("HB_TAG ('i','c','f','t')"),
        "LAYOUT_BASELINE_TAG_IDEO_FACE_CENTRAL".enum("HB_TAG ('I','c','f','c')"),
        "LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT".enum("HB_TAG ('i','d','e','o')"),
        "LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT".enum("HB_TAG ('i','d','t','p')"),
        "LAYOUT_BASELINE_TAG_IDEO_EMBOX_CENTRAL".enum("HB_TAG ('I','d','c','e')"),
        "LAYOUT_BASELINE_TAG_MATH".enum("HB_TAG ('m','a','t','h')")
    )

    void(
        "tags_from_script_and_language",

        hb_script_t("script"),
        hb_language_t("language"),
        AutoSize("script_tags")..Check(1)..nullable..unsigned_int.p("script_count"),
        nullable..hb_tag_t.p("script_tags"),
        AutoSize("language_tags")..Check(1)..nullable..unsigned_int.p("language_count"),
        nullable..hb_tag_t.p("language_tags")
    )

    hb_script_t(
        "tag_to_script",

        hb_tag_t("tag")
    )

    hb_language_t(
        "tag_to_language",

        hb_tag_t("tag")
    )

    void(
        "tags_to_script_and_language",

        hb_tag_t("script_tag"),
        hb_tag_t("language_tag"),
        Check(1)..nullable..hb_script_t.p("script"),
        Check(1)..nullable..hb_language_t.p("language")
    )

    hb_bool_t(
        "layout_has_glyph_classes",

        hb_face_t.p("face")
    )

    hb_ot_layout_glyph_class_t(
        "layout_get_glyph_class",

        hb_face_t.p("face"),
        hb_codepoint_t("glyph")
    )

    void(
        "layout_get_glyphs_in_class",

        hb_face_t.p("face"),
        hb_ot_layout_glyph_class_t("klass"),
        hb_set_t.p("glyphs")
    )

    unsigned_int(
        "layout_get_attach_points",

        hb_face_t.p("face"),
        hb_codepoint_t("glyph"),
        unsigned_int("start_offset"),
        AutoSize("point_array")..Check(1)..nullable..unsigned_int.p("point_count"),
        nullable..unsigned_int.p("point_array")
    )

    unsigned_int(
        "layout_get_ligature_carets",

        hb_font_t.p("font"),
        hb_direction_t("direction"),
        hb_codepoint_t("glyph"),
        unsigned_int("start_offset"),
        AutoSize("caret_array")..Check(1)..nullable..unsigned_int.p("caret_count"),
        nullable..hb_position_t.p("caret_array")
    )

    unsigned_int(
        "layout_table_get_script_tags",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("start_offset"),
        AutoSize("script_tags")..Check(1)..nullable..unsigned_int.p("script_count"),
        nullable..hb_tag_t.p("script_tags")
    )

    hb_bool_t(
        "layout_table_find_script",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        hb_tag_t("script_tag"),
        Check(1)..unsigned_int.p("script_index")
    )

    hb_bool_t(
        "layout_table_select_script",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        AutoSize("script_tags")..unsigned_int("script_count"),
        hb_tag_t.const.p("script_tags"),
        Check(1)..unsigned_int.p("script_index"),
        Check(1)..nullable..hb_tag_t.p("chosen_script")
    )

    unsigned_int(
        "layout_table_get_feature_tags",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("start_offset"),
        AutoSize("feature_tags")..Check(1)..nullable..unsigned_int.p("feature_count"),
        nullable..hb_tag_t.p("feature_tags")
    )

    unsigned_int(
        "layout_script_get_language_tags",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        unsigned_int("start_offset"),
        AutoSize("language_tags")..Check(1)..nullable..unsigned_int.p("language_count"),
        nullable..hb_tag_t.p("language_tags")
    )

    hb_bool_t(
        "layout_script_select_language",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        AutoSize("language_tags")..unsigned_int("language_count"),
        hb_tag_t.const.p("language_tags"),
        Check(1)..nullable..unsigned_int.p("language_index")
    )

    hb_bool_t(
        "layout_language_get_required_feature_index",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        unsigned_int("language_index"),
        Check(1)..nullable..unsigned_int.p("feature_index")
    )

    hb_bool_t(
        "layout_language_get_required_feature",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        unsigned_int("language_index"),
        Check(1)..nullable..unsigned_int.p("feature_index"),
        Check(1)..nullable..hb_tag_t.p("feature_tag")
    )

    unsigned_int(
        "layout_language_get_feature_indexes",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        unsigned_int("language_index"),
        unsigned_int("start_offset"),
        AutoSize("feature_indexes")..Check(1)..nullable..unsigned_int.p("feature_count"),
        nullable..unsigned_int.p("feature_indexes")
    )

    unsigned_int(
        "layout_language_get_feature_tags",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        unsigned_int("language_index"),
        unsigned_int("start_offset"),
        AutoSize("feature_tags")..Check(1)..nullable..unsigned_int.p("feature_count"),
        nullable..hb_tag_t.p("feature_tags")
    )

    hb_bool_t(
        "layout_language_find_feature",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("script_index"),
        unsigned_int("language_index"),
        hb_tag_t("feature_tag"),
        Check(1)..nullable..unsigned_int.p("feature_index")
    )

    unsigned_int(
        "layout_feature_get_lookups",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("feature_index"),
        unsigned_int("start_offset"),
        AutoSize("lookup_indexes")..Check(1)..nullable..unsigned_int.p("lookup_count"),
        nullable..unsigned_int.p("lookup_indexes")
    )

    unsigned_int(
        "layout_table_get_lookup_count",

        hb_face_t.p("face"),
        hb_tag_t("table_tag")
    )

    void(
        "layout_collect_features",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        NullTerminated..nullable..hb_tag_t.const.p("scripts"),
        NullTerminated..nullable..hb_tag_t.const.p("languages"),
        NullTerminated..nullable..hb_tag_t.const.p("features"),
        hb_set_t.p("feature_indexes")
    )

    void(
        "layout_collect_features_map",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned("script_index"),
        unsigned("language_index"),
        hb_map_t.p("feature_map")
    )

    void(
        "layout_collect_lookups",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        NullTerminated..nullable..hb_tag_t.const.p("scripts"),
        NullTerminated..nullable..hb_tag_t.const.p("languages"),
        NullTerminated..nullable..hb_tag_t.const.p("features"),
        hb_set_t.p("lookup_indexes")
    )

    void(
        "layout_lookup_collect_glyphs",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("lookup_index"),
        nullable..hb_set_t.p("glyphs_before"),
        nullable..hb_set_t.p("glyphs_input"),
        nullable..hb_set_t.p("glyphs_after"),
        nullable..hb_set_t.p("glyphs_output")
    )

    hb_bool_t(
        "layout_table_find_feature_variations",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        int.const.p("coords"),
        AutoSize("coords")..unsigned_int("num_coords"),
        Check(1)..unsigned_int.p("variations_index")
    )

    unsigned_int(
        "layout_feature_with_variations_get_lookups",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("feature_index"),
        unsigned_int("variations_index"),
        unsigned_int("start_offset"),
        AutoSize("lookup_indexes")..Check(1)..nullable..unsigned_int.p("lookup_count"),
        nullable..unsigned_int.p("lookup_indexes")
    )

    hb_bool_t(
        "layout_has_substitution",

        hb_face_t.p("face")
    )

    unsigned_int(
        "layout_lookup_get_glyph_alternates",

        hb_face_t.p("face"),
        unsigned_int("lookup_index"),
        hb_codepoint_t("glyph"),
        unsigned_int("start_offset"),
        AutoSize("alternate_glyphs")..Check(1)..nullable..unsigned_int.p("alternate_count"),
        nullable..hb_codepoint_t.p("alternate_glyphs")
    )

    hb_bool_t(
        "layout_lookup_would_substitute",

        hb_face_t.p("face"),
        unsigned_int("lookup_index"),
        hb_codepoint_t.const.p("glyphs"),
        AutoSize("glyphs")..unsigned_int("glyphs_length"),
        hb_bool_t("zero_context")
    )

    void(
        "layout_lookup_substitute_closure",

        hb_face_t.p("face"),
        unsigned_int("lookup_index"),
        hb_set_t.p("glyphs")
    )

    void(
        "layout_lookups_substitute_closure",

        hb_face_t.p("face"),
        hb_set_t.const.p("lookups"),
        hb_set_t.p("glyphs")
    )

    hb_bool_t(
        "layout_has_positioning",

        hb_face_t.p("face")
    )

    hb_bool_t(
        "layout_get_size_params",

        hb_face_t.p("face"),
        Check(1)..nullable..unsigned_int.p("design_size"),
        Check(1)..nullable..unsigned_int.p("subfamily_id"),
        Check(1)..nullable..hb_ot_name_id_t.p("subfamily_name_id"),
        Check(1)..nullable..unsigned_int.p("range_start"),
        Check(1)..nullable..unsigned_int.p("range_end")
    )

    hb_position_t(
        "layout_lookup_get_optical_bound",

        hb_font_t.p("font"),
        unsigned_int("lookup_index"),
        hb_direction_t("direction"),
        hb_codepoint_t("glyph")
    )

    hb_bool_t(
        "layout_feature_get_name_ids",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("feature_index"),
        Check(1)..nullable..hb_ot_name_id_t.p("label_id"),
        Check(1)..nullable..hb_ot_name_id_t.p("tooltip_id"),
        Check(1)..nullable..hb_ot_name_id_t.p("sample_id"),
        Check(1)..nullable..unsigned_int.p("num_named_parameters"),
        Check(1)..nullable..hb_ot_name_id_t.p("first_param_id")
    )

    unsigned_int(
        "layout_feature_get_characters",

        hb_face_t.p("face"),
        hb_tag_t("table_tag"),
        unsigned_int("feature_index"),
        unsigned_int("start_offset"),
        AutoSize("characters")..Check(1)..nullable..unsigned_int.p("char_count"),
        nullable..hb_codepoint_t.p("characters")
    )

    hb_bool_t(
        "ot_layout_get_font_extents",

        hb_font_t.p("font"),
        hb_direction_t("direction"),
        hb_tag_t("script_tag"),
        hb_tag_t("language_tag"),
        hb_font_extents_t.p("extents")
    )

    hb_bool_t(
        "ot_layout_get_font_extents2",

        hb_font_t.p("font"),
        hb_direction_t("direction"),
        hb_script_t("script"),
        hb_language_t("language"),
        hb_font_extents_t.p("extents")
    )

    hb_ot_layout_baseline_tag_t(
        "layout_get_horizontal_baseline_tag_for_script",

        hb_script_t("script")
    )

    hb_bool_t(
        "layout_get_baseline",

        hb_font_t.p("font"),
        hb_ot_layout_baseline_tag_t("baseline_tag"),
        hb_direction_t("direction"),
        hb_tag_t("script_tag"),
        hb_tag_t("language_tag"),
        Check(1)..nullable..hb_position_t.p("coord")
    )

    hb_bool_t(
        "ot_layout_get_baseline2",

        hb_font_t.p("font"),
        hb_ot_layout_baseline_tag_t("baseline_tag"),
        hb_direction_t("direction"),
        hb_script_t("script"),
        hb_language_t("language"),
        Check(1)..nullable..hb_position_t.p("coord")
    )

    void(
        "layout_get_baseline_with_fallback",

        hb_font_t.p("font"),
        hb_ot_layout_baseline_tag_t("baseline_tag"),
        hb_direction_t("direction"),
        hb_tag_t("script_tag"),
        hb_tag_t("language_tag"),
        Check(1)..nullable..hb_position_t.p("coord")
    )

    void(
        "layout_get_baseline_with_fallback2",

        hb_font_t.p("font"),
        hb_ot_layout_baseline_tag_t("baseline_tag"),
        hb_direction_t("direction"),
        hb_script_t("script"),
        hb_language_t("language"),
        Check(1)..nullable..hb_position_t.p("coord")
    )

    // hb-ot-math.h

    IntConstant(
        "TAG_MATH".."HB_TAG('M','A','T','H')",
        "TAG_MATH_SCRIPT".."HB_TAG('m','a','t','h')"
    )

    EnumConstant(
        "MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN".enum("0"),
        "MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN".enum,
        "MATH_CONSTANT_DELIMITED_SUB_FORMULA_MIN_HEIGHT".enum,
        "MATH_CONSTANT_DISPLAY_OPERATOR_MIN_HEIGHT".enum,
        "MATH_CONSTANT_MATH_LEADING".enum,
        "MATH_CONSTANT_AXIS_HEIGHT".enum,
        "MATH_CONSTANT_ACCENT_BASE_HEIGHT".enum,
        "MATH_CONSTANT_FLATTENED_ACCENT_BASE_HEIGHT".enum,
        "MATH_CONSTANT_SUBSCRIPT_SHIFT_DOWN".enum,
        "MATH_CONSTANT_SUBSCRIPT_TOP_MAX".enum,
        "MATH_CONSTANT_SUBSCRIPT_BASELINE_DROP_MIN".enum,
        "MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP".enum,
        "MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP_CRAMPED".enum,
        "MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MIN".enum,
        "MATH_CONSTANT_SUPERSCRIPT_BASELINE_DROP_MAX".enum,
        "MATH_CONSTANT_SUB_SUPERSCRIPT_GAP_MIN".enum,
        "MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT".enum,
        "MATH_CONSTANT_SPACE_AFTER_SCRIPT".enum,
        "MATH_CONSTANT_UPPER_LIMIT_GAP_MIN".enum,
        "MATH_CONSTANT_UPPER_LIMIT_BASELINE_RISE_MIN".enum,
        "MATH_CONSTANT_LOWER_LIMIT_GAP_MIN".enum,
        "MATH_CONSTANT_LOWER_LIMIT_BASELINE_DROP_MIN".enum,
        "MATH_CONSTANT_STACK_TOP_SHIFT_UP".enum,
        "MATH_CONSTANT_STACK_TOP_DISPLAY_STYLE_SHIFT_UP".enum,
        "MATH_CONSTANT_STACK_BOTTOM_SHIFT_DOWN".enum,
        "MATH_CONSTANT_STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN".enum,
        "MATH_CONSTANT_STACK_GAP_MIN".enum,
        "MATH_CONSTANT_STACK_DISPLAY_STYLE_GAP_MIN".enum,
        "MATH_CONSTANT_STRETCH_STACK_TOP_SHIFT_UP".enum,
        "MATH_CONSTANT_STRETCH_STACK_BOTTOM_SHIFT_DOWN".enum,
        "MATH_CONSTANT_STRETCH_STACK_GAP_ABOVE_MIN".enum,
        "MATH_CONSTANT_STRETCH_STACK_GAP_BELOW_MIN".enum,
        "MATH_CONSTANT_FRACTION_NUMERATOR_SHIFT_UP".enum,
        "MATH_CONSTANT_FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP".enum,
        "MATH_CONSTANT_FRACTION_DENOMINATOR_SHIFT_DOWN".enum,
        "MATH_CONSTANT_FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN".enum,
        "MATH_CONSTANT_FRACTION_NUMERATOR_GAP_MIN".enum,
        "MATH_CONSTANT_FRACTION_NUM_DISPLAY_STYLE_GAP_MIN".enum,
        "MATH_CONSTANT_FRACTION_RULE_THICKNESS".enum,
        "MATH_CONSTANT_FRACTION_DENOMINATOR_GAP_MIN".enum,
        "MATH_CONSTANT_FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN".enum,
        "MATH_CONSTANT_SKEWED_FRACTION_HORIZONTAL_GAP".enum,
        "MATH_CONSTANT_SKEWED_FRACTION_VERTICAL_GAP".enum,
        "MATH_CONSTANT_OVERBAR_VERTICAL_GAP".enum,
        "MATH_CONSTANT_OVERBAR_RULE_THICKNESS".enum,
        "MATH_CONSTANT_OVERBAR_EXTRA_ASCENDER".enum,
        "MATH_CONSTANT_UNDERBAR_VERTICAL_GAP".enum,
        "MATH_CONSTANT_UNDERBAR_RULE_THICKNESS".enum,
        "MATH_CONSTANT_UNDERBAR_EXTRA_DESCENDER".enum,
        "MATH_CONSTANT_RADICAL_VERTICAL_GAP".enum,
        "MATH_CONSTANT_RADICAL_DISPLAY_STYLE_VERTICAL_GAP".enum,
        "MATH_CONSTANT_RADICAL_RULE_THICKNESS".enum,
        "MATH_CONSTANT_RADICAL_EXTRA_ASCENDER".enum,
        "MATH_CONSTANT_RADICAL_KERN_BEFORE_DEGREE".enum,
        "MATH_CONSTANT_RADICAL_KERN_AFTER_DEGREE".enum,
        "MATH_CONSTANT_RADICAL_DEGREE_BOTTOM_RAISE_PERCENT".enum
    )

    EnumConstant(
        "MATH_KERN_TOP_RIGHT".enum("0"),
        "MATH_KERN_TOP_LEFT".enum,
        "MATH_KERN_BOTTOM_RIGHT".enum,
        "MATH_KERN_BOTTOM_LEFT".enum
    )

    EnumConstant(
        "MATH_GLYPH_PART_FLAG_EXTENDER".enum(0x00000001)
    )

    hb_bool_t(
        "math_has_data",

        hb_face_t.p("face")
    )

    hb_position_t(
        "math_get_constant",

        hb_font_t.p("font"),
        hb_ot_math_constant_t("constant")
    )

    hb_position_t(
        "math_get_glyph_italics_correction",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_position_t(
        "math_get_glyph_top_accent_attachment",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_bool_t(
        "math_is_glyph_extended_shape",

        hb_face_t.p("face"),
        hb_codepoint_t("glyph")
    )

    hb_position_t(
        "math_get_glyph_kerning",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_ot_math_kern_t("kern"),
        hb_position_t("correction_height")
    )

    unsigned_int(
        "math_get_glyph_kernings",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_ot_math_kern_t("kern"),
        unsigned_int("start_offset"),
        AutoSize("kern_entries")..Check(1)..nullable..unsigned_int.p("entries_count"),
        nullable..hb_ot_math_kern_entry_t.p("kern_entries")
    )

    unsigned_int(
        "math_get_glyph_variants",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        unsigned_int("start_offset"),
        AutoSize("variants")..Check(1)..nullable..unsigned_int.p("variants_count"),
        nullable..hb_ot_math_glyph_variant_t.p("variants")
    )

    hb_position_t(
        "math_get_min_connector_overlap",

        hb_font_t.p("font"),
        hb_direction_t("direction")
    )

    unsigned_int(
        "math_get_glyph_assembly",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        unsigned_int("start_offset"),
        AutoSize("parts")..Check(1)..nullable..unsigned_int.p("parts_count"),
        nullable..hb_ot_math_glyph_part_t.p("parts"),
        Check(1)..nullable..hb_position_t.p("italics_correction")
    )

    // hb-ot-meta.h

    EnumConstant(
        "META_TAG_DESIGN_LANGUAGES".enum("HB_TAG ('d','l','n','g')"),
        "META_TAG_SUPPORTED_LANGUAGES".enum("HB_TAG ('s','l','n','g')")
    )

    unsigned_int(
        "meta_get_entry_tags",

        hb_face_t.p("face"),
        unsigned_int("start_offset"),
        AutoSize("entries")..Check(1)..nullable..unsigned_int.p("entries_count"),
        nullable..hb_ot_meta_tag_t.p("entries")
    )

    hb_blob_t.p(
        "meta_reference_entry",

        hb_face_t.p("face"),
        hb_ot_meta_tag_t("meta_tag")
    )

    // hb-ot-metrics.h

    EnumConstant(
        "METRICS_TAG_HORIZONTAL_ASCENDER".enum("HB_TAG ('h','a','s','c')"),
        "METRICS_TAG_HORIZONTAL_DESCENDER".enum("HB_TAG ('h','d','s','c')"),
        "METRICS_TAG_HORIZONTAL_LINE_GAP".enum("HB_TAG ('h','l','g','p')"),
        "METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT".enum("HB_TAG ('h','c','l','a')"),
        "METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT".enum("HB_TAG ('h','c','l','d')"),
        "METRICS_TAG_VERTICAL_ASCENDER".enum("HB_TAG ('v','a','s','c')"),
        "METRICS_TAG_VERTICAL_DESCENDER".enum("HB_TAG ('v','d','s','c')"),
        "METRICS_TAG_VERTICAL_LINE_GAP".enum("HB_TAG ('v','l','g','p')"),
        "METRICS_TAG_HORIZONTAL_CARET_RISE".enum("HB_TAG ('h','c','r','s')"),
        "METRICS_TAG_HORIZONTAL_CARET_RUN".enum("HB_TAG ('h','c','r','n')"),
        "METRICS_TAG_HORIZONTAL_CARET_OFFSET".enum("HB_TAG ('h','c','o','f')"),
        "METRICS_TAG_VERTICAL_CARET_RISE".enum("HB_TAG ('v','c','r','s')"),
        "METRICS_TAG_VERTICAL_CARET_RUN".enum("HB_TAG ('v','c','r','n')"),
        "METRICS_TAG_VERTICAL_CARET_OFFSET".enum("HB_TAG ('v','c','o','f')"),
        "METRICS_TAG_X_HEIGHT".enum("HB_TAG ('x','h','g','t')"),
        "METRICS_TAG_CAP_HEIGHT".enum("HB_TAG ('c','p','h','t')"),
        "METRICS_TAG_SUBSCRIPT_EM_X_SIZE".enum("HB_TAG ('s','b','x','s')"),
        "METRICS_TAG_SUBSCRIPT_EM_Y_SIZE".enum("HB_TAG ('s','b','y','s')"),
        "METRICS_TAG_SUBSCRIPT_EM_X_OFFSET".enum("HB_TAG ('s','b','x','o')"),
        "METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET".enum("HB_TAG ('s','b','y','o')"),
        "METRICS_TAG_SUPERSCRIPT_EM_X_SIZE".enum("HB_TAG ('s','p','x','s')"),
        "METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE".enum("HB_TAG ('s','p','y','s')"),
        "METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET".enum("HB_TAG ('s','p','x','o')"),
        "METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET".enum("HB_TAG ('s','p','y','o')"),
        "METRICS_TAG_STRIKEOUT_SIZE".enum("HB_TAG ('s','t','r','s')"),
        "METRICS_TAG_STRIKEOUT_OFFSET".enum("HB_TAG ('s','t','r','o')"),
        "METRICS_TAG_UNDERLINE_SIZE".enum("HB_TAG ('u','n','d','s')"),
        "METRICS_TAG_UNDERLINE_OFFSET".enum("HB_TAG ('u','n','d','o')")
    )

    hb_bool_t(
        "metrics_get_position",

        hb_font_t.p("font"),
        hb_ot_metrics_tag_t("metrics_tag"),
        Check(1)..nullable..hb_position_t.p("position")
    )

    void(
        "metrics_get_position_with_fallback",

        hb_font_t.p("font"),
        hb_ot_metrics_tag_t("metrics_tag"),
        Check(1)..nullable..hb_position_t.p("position")
    )

    float(
        "metrics_get_variation",

        hb_font_t.p("font"),
        hb_ot_metrics_tag_t("metrics_tag")
    )

    hb_position_t(
        "metrics_get_x_variation",

        hb_font_t.p("font"),
        hb_ot_metrics_tag_t("metrics_tag")
    )

    hb_position_t(
        "metrics_get_y_variation",

        hb_font_t.p("font"),
        hb_ot_metrics_tag_t("metrics_tag")
    )

    // hb-ot-name.h

    EnumConstant(
        "NAME_ID_COPYRIGHT".enum("0"),
        "NAME_ID_FONT_FAMILY".enum,
        "NAME_ID_FONT_SUBFAMILY".enum,
        "NAME_ID_UNIQUE_ID".enum,
        "NAME_ID_FULL_NAME".enum,
        "NAME_ID_VERSION_STRING".enum,
        "NAME_ID_POSTSCRIPT_NAME".enum,
        "NAME_ID_TRADEMARK".enum,
        "NAME_ID_MANUFACTURER".enum,
        "NAME_ID_DESIGNER".enum,
        "NAME_ID_DESCRIPTION".enum,
        "NAME_ID_VENDOR_URL".enum,
        "NAME_ID_DESIGNER_URL".enum,
        "NAME_ID_LICENSE".enum,
        "NAME_ID_LICENSE_URL".enum,
        /*"NAME_ID_RESERVED".enum,*/
        "NAME_ID_TYPOGRAPHIC_FAMILY".enum("16"),
        "NAME_ID_TYPOGRAPHIC_SUBFAMILY".enum,
        "NAME_ID_MAC_FULL_NAME".enum,
        "NAME_ID_SAMPLE_TEXT".enum,
        "NAME_ID_CID_FINDFONT_NAME".enum,
        "NAME_ID_WWS_FAMILY".enum,
        "NAME_ID_WWS_SUBFAMILY".enum,
        "NAME_ID_LIGHT_BACKGROUND".enum,
        "NAME_ID_DARK_BACKGROUND".enum,
        "NAME_ID_VARIATIONS_PS_PREFIX".enum,

        "NAME_ID_INVALID".enum("0xFFFF")
    )

    hb_ot_name_entry_t.const.p(
        "name_list_names",

        hb_face_t.p("face"),
        AutoSizeResult..Check(1)..unsigned_int.p("num_entries")
    )

    unsigned_int(
        "name_get_utf8",

        hb_face_t.p("face"),
        hb_ot_name_id_t("name_id"),
        hb_language_t("language"),
        AutoSize("text")..Check(1)..nullable..unsigned_int.p("text_size"),
        nullable..char.p("text")
    )

    unsigned_int(
        "name_get_utf16",

        hb_face_t.p("face"),
        hb_ot_name_id_t("name_id"),
        hb_language_t("language"),
        AutoSize("text")..Check(1)..nullable..unsigned_int.p("text_size"),
        nullable..uint16_t.p("text")
    )

    unsigned_int(
        "name_get_utf32",

        hb_face_t.p("face"),
        hb_ot_name_id_t("name_id"),
        hb_language_t("language"),
        AutoSize("text")..Check(1)..nullable..unsigned_int.p("text_size"),
        nullable..uint32_t.p("text")
    )

    // hb-ot-shape.h

    void(
        "shape_glyphs_closure",

        hb_font_t.p("font"),
        hb_buffer_t.p("buffer"),
        nullable..hb_feature_t.const.p("features"),
        AutoSize("features")..unsigned_int("num_features"),
        hb_set_t.p("glyphs")
    )

    void(
        "shape_plan_collect_lookups",

        hb_shape_plan_t.p("shape_plan"),
        hb_tag_t("table_tag"),
        hb_set_t.p("lookup_indexes")
    )

    unsigned_int(
        "shape_plan_get_feature_tags",

        hb_shape_plan_t.p("shape_plan"),
        unsigned_int("start_offset"),
        AutoSize("tags")..Check(1)..unsigned_int.p("tag_count"),
        hb_tag_t.p("tags")
    )

    // hb-ot-var.h

    IntConstant(
        "TAG_VAR_AXIS_ITALIC".."HB_TAG('i','t','a','l')",
        "TAG_VAR_AXIS_OPTICAL_SIZE".."HB_TAG('o','p','s','z')",
        "TAG_VAR_AXIS_SLANT".."HB_TAG('s','l','n','t')",
        "TAG_VAR_AXIS_WIDTH".."HB_TAG('w','d','t','h')",
        "TAG_VAR_AXIS_WEIGHT".."HB_TAG('w','g','h','t')"
    )

    EnumConstant(
        "VAR_AXIS_FLAG_HIDDEN".enum(0x00000001)
    )

    hb_bool_t(
        "var_has_data",

        hb_face_t.p("face")
    )

    unsigned_int(
        "var_get_axis_count",

        hb_face_t.p("face")
    )

    unsigned_int(
        "var_get_axis_infos",

        hb_face_t.p("face"),
        unsigned_int("start_offset"),
        AutoSize("axes_array")..Check(1)..nullable..unsigned_int.p("axes_count"),
        nullable..hb_ot_var_axis_info_t.p("axes_array")
    )

    hb_bool_t(
        "var_find_axis_info",

        hb_face_t.p("face"),
        hb_tag_t("axis_tag"),
        hb_ot_var_axis_info_t.p("axis_info")
    )

    unsigned_int(
        "var_get_named_instance_count",

        hb_face_t.p("face")
    )

    hb_ot_name_id_t(
        "var_named_instance_get_subfamily_name_id",

        hb_face_t.p("face"),
        unsigned_int("instance_index")
    )

    hb_ot_name_id_t(
        "var_named_instance_get_postscript_name_id",

        hb_face_t.p("face"),
        unsigned_int("instance_index")
    )

    unsigned_int(
        "var_named_instance_get_design_coords",

        hb_face_t.p("face"),
        unsigned_int("instance_index"),
        AutoSize("coords")..Check(1)..nullable..unsigned_int.p("coords_length"),
        nullable..float.p("coords")
    )

    void(
        "var_normalize_variations",

        hb_face_t.p("face"),
        hb_variation_t.const.p("variations"),
        AutoSize("variations")..unsigned_int("variations_length"),
        int.p("coords"),
        AutoSize("coords")..unsigned_int("coords_length")
    )

    void(
        "var_normalize_coords",

        hb_face_t.p("face"),
        AutoSize("design_coords", "normalized_coords")..unsigned_int("coords_length"),
        float.const.p("design_coords"),
        int.p("normalized_coords")
    )
}