/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz

import org.lwjgl.generator.*

val hb_ot_name_id_t = typedef(unsigned_int, "hb_ot_name_id_t")

val hb_ot_color_palette_flags_t = "hb_ot_color_palette_flags_t".enumType
val hb_ot_layout_baseline_tag_t = "hb_ot_layout_baseline_tag_t".enumType
val hb_ot_layout_glyph_class_t = "hb_ot_layout_glyph_class_t".enumType
val hb_ot_math_constant_t = "hb_ot_math_constant_t".enumType
val hb_ot_math_glyph_part_flags_t = "hb_ot_math_glyph_part_flags_t".enumType
val hb_ot_math_kern_t = "hb_ot_math_kern_t".enumType
val hb_ot_meta_tag_t = "hb_ot_meta_tag_t".enumType
val hb_ot_metrics_tag_t = "hb_ot_metrics_tag_t".enumType
val hb_ot_var_axis_flags_t = "hb_ot_var_axis_flags_t".enumType

val hb_ot_name_entry_t = struct(Module.HARFBUZZ, "hb_ot_name_entry_t") {
    documentation =
        "Structure representing a name ID in a particular language."

    hb_ot_name_id_t("name_id", "")
    hb_var_int_t("var", "").private()
    hb_language_t("language", "")
}

val hb_ot_color_layer_t = struct(Module.HARFBUZZ, "hb_ot_color_layer_t") {
    documentation =
        """
        Pairs of glyph and color index.

        A color index of 0xFFFF does not refer to a palette color, but indicates that the foreground color should be used.
        """

    hb_codepoint_t("glyph", "the glyph ID of the layer")
    unsigned_int("color_index", "the palette color index of the layer")
}

val hb_ot_math_kern_entry_t = struct(Module.HARFBUZZ, "hb_ot_math_kern_entry_t") {
    documentation =
        "Data type to hold math kerning (cut-in) information for a glyph."

    hb_position_t("max_correction_height", "the maximum height at which this entry should be used")
    hb_position_t("kern_value", "the kern value of the entry")
}

val hb_ot_math_glyph_variant_t = struct(Module.HARFBUZZ, "hb_ot_math_glyph_variant_t") {
    documentation =
        "Data type to hold math-variant information for a glyph."

    hb_codepoint_t("glyph", "the glyph index of the variant")
    hb_position_t("advance", "the advance width of the variant")
}

val hb_ot_math_glyph_part_t = struct(Module.HARFBUZZ, "hb_ot_math_glyph_part_t") {
    documentation =
        """
        Data type to hold information for a "part" component of a math-variant glyph.

        Large variants for stretchable math glyphs (such as parentheses) can be constructed on the fly from parts.
        """

    hb_codepoint_t("glyph", "the glyph index of the variant part")
    hb_position_t("start_connector_length", "the length of the connector on the starting side of the variant part")
    hb_position_t("end_connector_length", "the length of the connector on the ending side of the variant part")
    hb_position_t("full_advance", "the total advance of the part")
    hb_ot_math_glyph_part_flags_t("flags", "flags for the part")
}

val hb_ot_var_axis_info_t = struct(Module.HARFBUZZ, "hb_ot_var_axis_info_t") {
    documentation =
        """
        Data type for holding variation-axis values.

        The minimum, default, and maximum values are in un-normalized, user scales.

        Note: at present, the only flag defined for flags is #VAR_AXIS_FLAG_HIDDEN.
        """

    unsigned_int("axis_index", "index of the axis in the variation-axis array")
    hb_tag_t("tag", "the {@code hb_tag_t} tag identifying the design variation of the axis")
    hb_ot_name_id_t("name_id", "the {@code name} table Name ID that provides display names for the axis")
    hb_ot_var_axis_flags_t("flags", "the {@code hb_ot_var_axis_flags_t} flags for the axis")
    float("min_value", "the minimum value on the variation axis that the font covers")
    float("default_value", "the position on the variation axis corresponding to the font's defaults")
    float("max_value", "the maximum value on the variation axis that the font covers")
    unsigned_int("reserved", "").private()
}
