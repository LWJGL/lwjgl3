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
    hb_ot_name_id_t("name_id")
    hb_var_int_t("var").private()
    hb_language_t("language")
}

val hb_ot_color_layer_t = struct(Module.HARFBUZZ, "hb_ot_color_layer_t") {
    hb_codepoint_t("glyph")
    unsigned_int("color_index")
}

val hb_ot_math_kern_entry_t = struct(Module.HARFBUZZ, "hb_ot_math_kern_entry_t") {
    hb_position_t("max_correction_height")
    hb_position_t("kern_value")
}

val hb_ot_math_glyph_variant_t = struct(Module.HARFBUZZ, "hb_ot_math_glyph_variant_t") {
    hb_codepoint_t("glyph")
    hb_position_t("advance")
}

val hb_ot_math_glyph_part_t = struct(Module.HARFBUZZ, "hb_ot_math_glyph_part_t") {
    hb_codepoint_t("glyph")
    hb_position_t("start_connector_length")
    hb_position_t("end_connector_length")
    hb_position_t("full_advance")
    hb_ot_math_glyph_part_flags_t("flags")
}

val hb_ot_var_axis_info_t = struct(Module.HARFBUZZ, "hb_ot_var_axis_info_t") {
    unsigned_int("axis_index")
    hb_tag_t("tag")
    hb_ot_name_id_t("name_id")
    hb_ot_var_axis_flags_t("flags")
    float("min_value")
    float("default_value")
    float("max_value")
    unsigned_int("reserved").private()
}