/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz

import org.lwjgl.generator.*

val hb_aat_layout_feature_selector_t = "hb_aat_layout_feature_selector_t".enumType
val hb_aat_layout_feature_type_t = "hb_aat_layout_feature_type_t".enumType

val hb_aat_layout_feature_selector_info_t = struct(Module.HARFBUZZ, "hb_aat_layout_feature_selector_info_t") {
    documentation = "Structure representing a setting for an {@code hb_aat_layout_feature_type_t}."

    hb_ot_name_id_t("name_id", "the selector's name identifier")
    hb_aat_layout_feature_selector_t("enable", "the value to turn the selector on disable")
    hb_aat_layout_feature_selector_t("disable", "the value to turn the selector off")
    unsigned_int("reserved", "").private()
}