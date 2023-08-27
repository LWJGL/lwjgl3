/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.harfbuzz.HarfBuzz.*;

/** Native bindings to the OpenType API of the <a href="https://harfbuzz.github.io/">HarfBuzz</a> library. */
public class OpenType {

    /** Contains the function pointers loaded from {@code HarfBuzz.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            color_has_palettes                            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_has_palettes"),
            color_palette_get_count                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_palette_get_count"),
            color_palette_get_name_id                     = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_palette_get_name_id"),
            color_palette_color_get_name_id               = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_palette_color_get_name_id"),
            color_palette_get_flags                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_palette_get_flags"),
            color_palette_get_colors                      = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_palette_get_colors"),
            color_has_layers                              = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_has_layers"),
            color_glyph_get_layers                        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_glyph_get_layers"),
            color_has_svg                                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_has_svg"),
            color_glyph_reference_svg                     = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_glyph_reference_svg"),
            color_has_png                                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_has_png"),
            color_glyph_reference_png                     = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_color_glyph_reference_png"),
            font_set_funcs                                = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_font_set_funcs"),
            tags_from_script_and_language                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_tags_from_script_and_language"),
            tag_to_script                                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_tag_to_script"),
            tag_to_language                               = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_tag_to_language"),
            tags_to_script_and_language                   = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_tags_to_script_and_language"),
            layout_has_glyph_classes                      = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_has_glyph_classes"),
            layout_get_glyph_class                        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_glyph_class"),
            layout_get_glyphs_in_class                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_glyphs_in_class"),
            layout_get_attach_points                      = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_attach_points"),
            layout_get_ligature_carets                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_ligature_carets"),
            layout_table_get_script_tags                  = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_table_get_script_tags"),
            layout_table_find_script                      = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_table_find_script"),
            layout_table_select_script                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_table_select_script"),
            layout_table_get_feature_tags                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_table_get_feature_tags"),
            layout_script_get_language_tags               = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_script_get_language_tags"),
            layout_script_select_language                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_script_select_language"),
            layout_language_get_required_feature_index    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_language_get_required_feature_index"),
            layout_language_get_required_feature          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_language_get_required_feature"),
            layout_language_get_feature_indexes           = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_language_get_feature_indexes"),
            layout_language_get_feature_tags              = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_language_get_feature_tags"),
            layout_language_find_feature                  = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_language_find_feature"),
            layout_feature_get_lookups                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_feature_get_lookups"),
            layout_table_get_lookup_count                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_table_get_lookup_count"),
            layout_collect_features                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_collect_features"),
            layout_collect_features_map                   = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_collect_features_map"),
            layout_collect_lookups                        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_collect_lookups"),
            layout_lookup_collect_glyphs                  = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_lookup_collect_glyphs"),
            layout_table_find_feature_variations          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_table_find_feature_variations"),
            layout_feature_with_variations_get_lookups    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_feature_with_variations_get_lookups"),
            layout_has_substitution                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_has_substitution"),
            layout_lookup_get_glyph_alternates            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_lookup_get_glyph_alternates"),
            layout_lookup_would_substitute                = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_lookup_would_substitute"),
            layout_lookup_substitute_closure              = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_lookup_substitute_closure"),
            layout_lookups_substitute_closure             = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_lookups_substitute_closure"),
            layout_has_positioning                        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_has_positioning"),
            layout_get_size_params                        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_size_params"),
            layout_lookup_get_optical_bound               = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_lookup_get_optical_bound"),
            layout_feature_get_name_ids                   = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_feature_get_name_ids"),
            layout_feature_get_characters                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_feature_get_characters"),
            ot_layout_get_font_extents                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_ot_layout_get_font_extents"),
            ot_layout_get_font_extents2                   = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_ot_layout_get_font_extents2"),
            layout_get_horizontal_baseline_tag_for_script = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_horizontal_baseline_tag_for_script"),
            layout_get_baseline                           = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_baseline"),
            ot_layout_get_baseline2                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_ot_layout_get_baseline2"),
            layout_get_baseline_with_fallback             = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_baseline_with_fallback"),
            layout_get_baseline_with_fallback2            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_layout_get_baseline_with_fallback2"),
            math_has_data                                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_has_data"),
            math_get_constant                             = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_constant"),
            math_get_glyph_italics_correction             = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_glyph_italics_correction"),
            math_get_glyph_top_accent_attachment          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_glyph_top_accent_attachment"),
            math_is_glyph_extended_shape                  = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_is_glyph_extended_shape"),
            math_get_glyph_kerning                        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_glyph_kerning"),
            math_get_glyph_kernings                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_glyph_kernings"),
            math_get_glyph_variants                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_glyph_variants"),
            math_get_min_connector_overlap                = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_min_connector_overlap"),
            math_get_glyph_assembly                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_math_get_glyph_assembly"),
            meta_get_entry_tags                           = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_meta_get_entry_tags"),
            meta_reference_entry                          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_meta_reference_entry"),
            metrics_get_position                          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_metrics_get_position"),
            metrics_get_position_with_fallback            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_metrics_get_position_with_fallback"),
            metrics_get_variation                         = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_metrics_get_variation"),
            metrics_get_x_variation                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_metrics_get_x_variation"),
            metrics_get_y_variation                       = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_metrics_get_y_variation"),
            name_list_names                               = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_name_list_names"),
            name_get_utf8                                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_name_get_utf8"),
            name_get_utf16                                = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_name_get_utf16"),
            name_get_utf32                                = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_name_get_utf32"),
            shape_glyphs_closure                          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_shape_glyphs_closure"),
            shape_plan_collect_lookups                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_shape_plan_collect_lookups"),
            var_has_data                                  = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_has_data"),
            var_get_axis_count                            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_get_axis_count"),
            var_get_axis_infos                            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_get_axis_infos"),
            var_find_axis_info                            = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_find_axis_info"),
            var_get_named_instance_count                  = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_get_named_instance_count"),
            var_named_instance_get_subfamily_name_id      = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_named_instance_get_subfamily_name_id"),
            var_named_instance_get_postscript_name_id     = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_named_instance_get_postscript_name_id"),
            var_named_instance_get_design_coords          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_named_instance_get_design_coords"),
            var_normalize_variations                      = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_normalize_variations"),
            var_normalize_coords                          = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_ot_var_normalize_coords");

    }

    /**
     * Flags that describe the properties of color palette. ({@code hb_ot_color_palette_flags_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_COLOR_PALETTE_FLAG_DEFAULT COLOR_PALETTE_FLAG_DEFAULT} - Default indicating that there is nothing special to note about a color palette.</li>
     * <li>{@link #HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_LIGHT_BACKGROUND COLOR_PALETTE_FLAG_USABLE_WITH_LIGHT_BACKGROUND} - Flag indicating that the color palette is appropriate to use when displaying the font on a light background such as white.</li>
     * <li>{@link #HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_DARK_BACKGROUND COLOR_PALETTE_FLAG_USABLE_WITH_DARK_BACKGROUND} - Flag indicating that the color palette is appropriate to use when displaying the font on a dark background such as black.</li>
     * </ul>
     */
    public static final int
        HB_OT_COLOR_PALETTE_FLAG_DEFAULT                      = 0x0,
        HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_LIGHT_BACKGROUND = 0x1,
        HB_OT_COLOR_PALETTE_FLAG_USABLE_WITH_DARK_BACKGROUND  = 0x2;

    /** OpenType <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/base">Baseline Table</a>. */
    public static final int HB_OT_TAG_BASE = HB_TAG('B','A','S','E');

    /** OpenType <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/gdef">Glyph Definition Table</a>. */
    public static final int HB_OT_TAG_GDEF = HB_TAG('G','D','E','F');

    /** OpenType <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/gsub">Glyph Substitution Table</a>. */
    public static final int HB_OT_TAG_GSUB = HB_TAG('G','S','U','B');

    /** OpenType <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/gpos">Glyph Positioning Table</a>. */
    public static final int HB_OT_TAG_GPOS = HB_TAG('G','P','O','S');

    /** OpenType <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/jstf">Justification Table</a>. */
    public static final int HB_OT_TAG_JSTF = HB_TAG('J','S','T','F');

    /** OpenType script tag, {@code DFLT}, for features that are not script-specific. */
    public static final int HB_OT_TAG_DEFAULT_SCRIPT = HB_TAG ('D', 'F', 'L', 'T');

    /** OpenType language tag, {@code dflt}. Not a valid language tag, but some fonts mistakenly use it. */
    public static final int HB_OT_TAG_DEFAULT_LANGUAGE = HB_TAG ('d', 'f', 'l', 't');

    /** Maximum number of OpenType tags that can correspond to a given {@code hb_script_t}. */
    public static final int HB_OT_MAX_TAGS_PER_SCRIPT = 3;

    /** Maximum number of OpenType tags that can correspond to a given {@code hb_language_t}. */
    public static final int HB_OT_MAX_TAGS_PER_LANGUAGE = 3;

    /**
     * The GDEF classes defined for glyphs. ({@code hb_ot_layout_glyph_class_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_LAYOUT_GLYPH_CLASS_UNCLASSIFIED LAYOUT_GLYPH_CLASS_UNCLASSIFIED} - Glyphs not matching the other classifications</li>
     * <li>{@link #HB_OT_LAYOUT_GLYPH_CLASS_BASE_GLYPH LAYOUT_GLYPH_CLASS_BASE_GLYPH} - Spacing, single characters, capable of accepting marks</li>
     * <li>{@link #HB_OT_LAYOUT_GLYPH_CLASS_LIGATURE LAYOUT_GLYPH_CLASS_LIGATURE} - Glyphs that represent ligation of multiple characters</li>
     * <li>{@link #HB_OT_LAYOUT_GLYPH_CLASS_MARK LAYOUT_GLYPH_CLASS_MARK} - Non-spacing, combining glyphs that represent marks</li>
     * <li>{@link #HB_OT_LAYOUT_GLYPH_CLASS_COMPONENT LAYOUT_GLYPH_CLASS_COMPONENT} - Spacing glyphs that represent part of a single character</li>
     * </ul>
     */
    public static final int
        HB_OT_LAYOUT_GLYPH_CLASS_UNCLASSIFIED = 0,
        HB_OT_LAYOUT_GLYPH_CLASS_BASE_GLYPH   = 1,
        HB_OT_LAYOUT_GLYPH_CLASS_LIGATURE     = 2,
        HB_OT_LAYOUT_GLYPH_CLASS_MARK         = 3,
        HB_OT_LAYOUT_GLYPH_CLASS_COMPONENT    = 4;

    /** Special value for script index indicating unsupported script. */
    public static final int HB_OT_LAYOUT_NO_SCRIPT_INDEX = 0xFFFF;

    /** Special value for feature index indicating unsupported feature. */
    public static final int HB_OT_LAYOUT_NO_FEATURE_INDEX = 0xFFFF;

    /** Special value for language index indicating default or unsupported language. */
    public static final int HB_OT_LAYOUT_DEFAULT_LANGUAGE_INDEX = 0xFFFF;

    /** Special value for variations index indicating unsupported variation. */
    public static final int HB_OT_LAYOUT_NO_VARIATIONS_INDEX = 0xFFFFFFFF;

    /**
     * Baseline tags from <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/baselinetags">Baseline Tags</a> registry.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_ROMAN LAYOUT_BASELINE_TAG_ROMAN} - 
     * The baseline used by alphabetic scripts such as Latin, Cyrillic and Greek.
     * 
     * <p>In vertical writing mode, the alphabetic baseline for characters rotated 90 degrees clockwise. (This would not apply to alphabetic characters that
     * remain upright in vertical writing mode, since these characters are not rotated.)</p>
     * </li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_HANGING LAYOUT_BASELINE_TAG_HANGING} - 
     * The hanging baseline.
     * 
     * <p>In horizontal direction, this is the horizontal line from which syllables seem, to hang in Tibetan and other similar scripts. In vertical writing
     * mode, for Tibetan (or some other similar script) characters rotated 90 degrees clockwise.</p>
     * </li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT} - Ideographic character face bottom or left edge, if the direction is horizontal or vertical, respectively.</li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT} - Ideographic character face top or right edge, if the direction is horizontal or vertical, respectively.</li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_CENTRAL LAYOUT_BASELINE_TAG_IDEO_FACE_CENTRAL} - The center of the ideographic character face.</li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT} - Ideographic em-box bottom or left edge, if the direction is horizontal or vertical, respectively.</li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT} - Ideographic em-box top or right edge baseline, if the direction is horizontal or vertical, respectively.</li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_CENTRAL LAYOUT_BASELINE_TAG_IDEO_EMBOX_CENTRAL} - The center of the ideographic em-box.</li>
     * <li>{@link #HB_OT_LAYOUT_BASELINE_TAG_MATH LAYOUT_BASELINE_TAG_MATH} - 
     * The baseline about which mathematical characters are centered.
     * 
     * <p>In vertical writing mode when mathematical characters rotated 90 degrees clockwise, are centered.</p>
     * </li>
     * </ul>
     */
    public static final int
        HB_OT_LAYOUT_BASELINE_TAG_ROMAN                     = HB_TAG ('r','o','m','n'),
        HB_OT_LAYOUT_BASELINE_TAG_HANGING                   = HB_TAG ('h','a','n','g'),
        HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT  = HB_TAG ('i','c','f','b'),
        HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT    = HB_TAG ('i','c','f','t'),
        HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_CENTRAL         = HB_TAG ('I','c','f','c'),
        HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT = HB_TAG ('i','d','e','o'),
        HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT   = HB_TAG ('i','d','t','p'),
        HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_CENTRAL        = HB_TAG ('I','d','c','e'),
        HB_OT_LAYOUT_BASELINE_TAG_MATH                      = HB_TAG ('m','a','t','h');

    /** OpenType <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/math">Mathematical Typesetting Table</a>. */
    public static final int HB_OT_TAG_MATH = HB_TAG('M','A','T','H');

    /**
     * OpenType script tag, {@code math}, for features specific to math shaping.
     * 
     * <p>{@code HB_OT_TAG_MATH_SCRIPT} is not a valid {@code hb_script_t} and should only be used with functions that accept raw OpenType script tags, such as
     * {@code hb_ot_layout_collect_features}. In other cases, {@link HarfBuzz#HB_SCRIPT_MATH SCRIPT_MATH} should be used instead.</p>
     */
    public static final int HB_OT_TAG_MATH_SCRIPT = HB_TAG('m','a','t','h');

    /**
     * The {@code MATH} table constants, refer to <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/math#mathconstants-table">OpenType documentation</a> for more explanations. ({@code hb_ot_math_constant_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_DELIMITED_SUB_FORMULA_MIN_HEIGHT MATH_CONSTANT_DELIMITED_SUB_FORMULA_MIN_HEIGHT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_DISPLAY_OPERATOR_MIN_HEIGHT MATH_CONSTANT_DISPLAY_OPERATOR_MIN_HEIGHT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_MATH_LEADING MATH_CONSTANT_MATH_LEADING}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_AXIS_HEIGHT MATH_CONSTANT_AXIS_HEIGHT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_ACCENT_BASE_HEIGHT MATH_CONSTANT_ACCENT_BASE_HEIGHT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FLATTENED_ACCENT_BASE_HEIGHT MATH_CONSTANT_FLATTENED_ACCENT_BASE_HEIGHT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUBSCRIPT_SHIFT_DOWN MATH_CONSTANT_SUBSCRIPT_SHIFT_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUBSCRIPT_TOP_MAX MATH_CONSTANT_SUBSCRIPT_TOP_MAX}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUBSCRIPT_BASELINE_DROP_MIN MATH_CONSTANT_SUBSCRIPT_BASELINE_DROP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP_CRAMPED MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP_CRAMPED}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MIN MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUPERSCRIPT_BASELINE_DROP_MAX MATH_CONSTANT_SUPERSCRIPT_BASELINE_DROP_MAX}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUB_SUPERSCRIPT_GAP_MIN MATH_CONSTANT_SUB_SUPERSCRIPT_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SPACE_AFTER_SCRIPT MATH_CONSTANT_SPACE_AFTER_SCRIPT}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_UPPER_LIMIT_GAP_MIN MATH_CONSTANT_UPPER_LIMIT_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_UPPER_LIMIT_BASELINE_RISE_MIN MATH_CONSTANT_UPPER_LIMIT_BASELINE_RISE_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_LOWER_LIMIT_GAP_MIN MATH_CONSTANT_LOWER_LIMIT_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_LOWER_LIMIT_BASELINE_DROP_MIN MATH_CONSTANT_LOWER_LIMIT_BASELINE_DROP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STACK_TOP_SHIFT_UP MATH_CONSTANT_STACK_TOP_SHIFT_UP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STACK_TOP_DISPLAY_STYLE_SHIFT_UP MATH_CONSTANT_STACK_TOP_DISPLAY_STYLE_SHIFT_UP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STACK_BOTTOM_SHIFT_DOWN MATH_CONSTANT_STACK_BOTTOM_SHIFT_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN MATH_CONSTANT_STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STACK_GAP_MIN MATH_CONSTANT_STACK_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STACK_DISPLAY_STYLE_GAP_MIN MATH_CONSTANT_STACK_DISPLAY_STYLE_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STRETCH_STACK_TOP_SHIFT_UP MATH_CONSTANT_STRETCH_STACK_TOP_SHIFT_UP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STRETCH_STACK_BOTTOM_SHIFT_DOWN MATH_CONSTANT_STRETCH_STACK_BOTTOM_SHIFT_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STRETCH_STACK_GAP_ABOVE_MIN MATH_CONSTANT_STRETCH_STACK_GAP_ABOVE_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_STRETCH_STACK_GAP_BELOW_MIN MATH_CONSTANT_STRETCH_STACK_GAP_BELOW_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_NUMERATOR_SHIFT_UP MATH_CONSTANT_FRACTION_NUMERATOR_SHIFT_UP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP MATH_CONSTANT_FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_DENOMINATOR_SHIFT_DOWN MATH_CONSTANT_FRACTION_DENOMINATOR_SHIFT_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN MATH_CONSTANT_FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_NUMERATOR_GAP_MIN MATH_CONSTANT_FRACTION_NUMERATOR_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_NUM_DISPLAY_STYLE_GAP_MIN MATH_CONSTANT_FRACTION_NUM_DISPLAY_STYLE_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_RULE_THICKNESS MATH_CONSTANT_FRACTION_RULE_THICKNESS}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_DENOMINATOR_GAP_MIN MATH_CONSTANT_FRACTION_DENOMINATOR_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN MATH_CONSTANT_FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SKEWED_FRACTION_HORIZONTAL_GAP MATH_CONSTANT_SKEWED_FRACTION_HORIZONTAL_GAP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_SKEWED_FRACTION_VERTICAL_GAP MATH_CONSTANT_SKEWED_FRACTION_VERTICAL_GAP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_OVERBAR_VERTICAL_GAP MATH_CONSTANT_OVERBAR_VERTICAL_GAP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_OVERBAR_RULE_THICKNESS MATH_CONSTANT_OVERBAR_RULE_THICKNESS}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_OVERBAR_EXTRA_ASCENDER MATH_CONSTANT_OVERBAR_EXTRA_ASCENDER}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_UNDERBAR_VERTICAL_GAP MATH_CONSTANT_UNDERBAR_VERTICAL_GAP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_UNDERBAR_RULE_THICKNESS MATH_CONSTANT_UNDERBAR_RULE_THICKNESS}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_UNDERBAR_EXTRA_DESCENDER MATH_CONSTANT_UNDERBAR_EXTRA_DESCENDER}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_VERTICAL_GAP MATH_CONSTANT_RADICAL_VERTICAL_GAP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_DISPLAY_STYLE_VERTICAL_GAP MATH_CONSTANT_RADICAL_DISPLAY_STYLE_VERTICAL_GAP}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_RULE_THICKNESS MATH_CONSTANT_RADICAL_RULE_THICKNESS}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_EXTRA_ASCENDER MATH_CONSTANT_RADICAL_EXTRA_ASCENDER}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_KERN_BEFORE_DEGREE MATH_CONSTANT_RADICAL_KERN_BEFORE_DEGREE}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_KERN_AFTER_DEGREE MATH_CONSTANT_RADICAL_KERN_AFTER_DEGREE}</li>
     * <li>{@link #HB_OT_MATH_CONSTANT_RADICAL_DEGREE_BOTTOM_RAISE_PERCENT MATH_CONSTANT_RADICAL_DEGREE_BOTTOM_RAISE_PERCENT}</li>
     * </ul>
     */
    public static final int
        HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN                     = 0,
        HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN              = 1,
        HB_OT_MATH_CONSTANT_DELIMITED_SUB_FORMULA_MIN_HEIGHT              = 2,
        HB_OT_MATH_CONSTANT_DISPLAY_OPERATOR_MIN_HEIGHT                   = 3,
        HB_OT_MATH_CONSTANT_MATH_LEADING                                  = 4,
        HB_OT_MATH_CONSTANT_AXIS_HEIGHT                                   = 5,
        HB_OT_MATH_CONSTANT_ACCENT_BASE_HEIGHT                            = 6,
        HB_OT_MATH_CONSTANT_FLATTENED_ACCENT_BASE_HEIGHT                  = 7,
        HB_OT_MATH_CONSTANT_SUBSCRIPT_SHIFT_DOWN                          = 8,
        HB_OT_MATH_CONSTANT_SUBSCRIPT_TOP_MAX                             = 9,
        HB_OT_MATH_CONSTANT_SUBSCRIPT_BASELINE_DROP_MIN                   = 10,
        HB_OT_MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP                          = 11,
        HB_OT_MATH_CONSTANT_SUPERSCRIPT_SHIFT_UP_CRAMPED                  = 12,
        HB_OT_MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MIN                        = 13,
        HB_OT_MATH_CONSTANT_SUPERSCRIPT_BASELINE_DROP_MAX                 = 14,
        HB_OT_MATH_CONSTANT_SUB_SUPERSCRIPT_GAP_MIN                       = 15,
        HB_OT_MATH_CONSTANT_SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT         = 16,
        HB_OT_MATH_CONSTANT_SPACE_AFTER_SCRIPT                            = 17,
        HB_OT_MATH_CONSTANT_UPPER_LIMIT_GAP_MIN                           = 18,
        HB_OT_MATH_CONSTANT_UPPER_LIMIT_BASELINE_RISE_MIN                 = 19,
        HB_OT_MATH_CONSTANT_LOWER_LIMIT_GAP_MIN                           = 20,
        HB_OT_MATH_CONSTANT_LOWER_LIMIT_BASELINE_DROP_MIN                 = 21,
        HB_OT_MATH_CONSTANT_STACK_TOP_SHIFT_UP                            = 22,
        HB_OT_MATH_CONSTANT_STACK_TOP_DISPLAY_STYLE_SHIFT_UP              = 23,
        HB_OT_MATH_CONSTANT_STACK_BOTTOM_SHIFT_DOWN                       = 24,
        HB_OT_MATH_CONSTANT_STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN         = 25,
        HB_OT_MATH_CONSTANT_STACK_GAP_MIN                                 = 26,
        HB_OT_MATH_CONSTANT_STACK_DISPLAY_STYLE_GAP_MIN                   = 27,
        HB_OT_MATH_CONSTANT_STRETCH_STACK_TOP_SHIFT_UP                    = 28,
        HB_OT_MATH_CONSTANT_STRETCH_STACK_BOTTOM_SHIFT_DOWN               = 29,
        HB_OT_MATH_CONSTANT_STRETCH_STACK_GAP_ABOVE_MIN                   = 30,
        HB_OT_MATH_CONSTANT_STRETCH_STACK_GAP_BELOW_MIN                   = 31,
        HB_OT_MATH_CONSTANT_FRACTION_NUMERATOR_SHIFT_UP                   = 32,
        HB_OT_MATH_CONSTANT_FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP     = 33,
        HB_OT_MATH_CONSTANT_FRACTION_DENOMINATOR_SHIFT_DOWN               = 34,
        HB_OT_MATH_CONSTANT_FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN = 35,
        HB_OT_MATH_CONSTANT_FRACTION_NUMERATOR_GAP_MIN                    = 36,
        HB_OT_MATH_CONSTANT_FRACTION_NUM_DISPLAY_STYLE_GAP_MIN            = 37,
        HB_OT_MATH_CONSTANT_FRACTION_RULE_THICKNESS                       = 38,
        HB_OT_MATH_CONSTANT_FRACTION_DENOMINATOR_GAP_MIN                  = 39,
        HB_OT_MATH_CONSTANT_FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN          = 40,
        HB_OT_MATH_CONSTANT_SKEWED_FRACTION_HORIZONTAL_GAP                = 41,
        HB_OT_MATH_CONSTANT_SKEWED_FRACTION_VERTICAL_GAP                  = 42,
        HB_OT_MATH_CONSTANT_OVERBAR_VERTICAL_GAP                          = 43,
        HB_OT_MATH_CONSTANT_OVERBAR_RULE_THICKNESS                        = 44,
        HB_OT_MATH_CONSTANT_OVERBAR_EXTRA_ASCENDER                        = 45,
        HB_OT_MATH_CONSTANT_UNDERBAR_VERTICAL_GAP                         = 46,
        HB_OT_MATH_CONSTANT_UNDERBAR_RULE_THICKNESS                       = 47,
        HB_OT_MATH_CONSTANT_UNDERBAR_EXTRA_DESCENDER                      = 48,
        HB_OT_MATH_CONSTANT_RADICAL_VERTICAL_GAP                          = 49,
        HB_OT_MATH_CONSTANT_RADICAL_DISPLAY_STYLE_VERTICAL_GAP            = 50,
        HB_OT_MATH_CONSTANT_RADICAL_RULE_THICKNESS                        = 51,
        HB_OT_MATH_CONSTANT_RADICAL_EXTRA_ASCENDER                        = 52,
        HB_OT_MATH_CONSTANT_RADICAL_KERN_BEFORE_DEGREE                    = 53,
        HB_OT_MATH_CONSTANT_RADICAL_KERN_AFTER_DEGREE                     = 54,
        HB_OT_MATH_CONSTANT_RADICAL_DEGREE_BOTTOM_RAISE_PERCENT           = 55;

    /**
     * The math kerning-table types defined for the four corners of a glyph. ({@code hb_ot_math_kern_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_MATH_KERN_TOP_RIGHT MATH_KERN_TOP_RIGHT} - The top right corner of the glyph.</li>
     * <li>{@link #HB_OT_MATH_KERN_TOP_LEFT MATH_KERN_TOP_LEFT} - The top left corner of the glyph.</li>
     * <li>{@link #HB_OT_MATH_KERN_BOTTOM_RIGHT MATH_KERN_BOTTOM_RIGHT} - The bottom right corner of the glyph.</li>
     * <li>{@link #HB_OT_MATH_KERN_BOTTOM_LEFT MATH_KERN_BOTTOM_LEFT} - The bottom left corner of the glyph.</li>
     * </ul>
     */
    public static final int
        HB_OT_MATH_KERN_TOP_RIGHT    = 0,
        HB_OT_MATH_KERN_TOP_LEFT     = 1,
        HB_OT_MATH_KERN_BOTTOM_RIGHT = 2,
        HB_OT_MATH_KERN_BOTTOM_LEFT  = 3;

    /**
     * Flags for math glyph parts. ({@code hb_ot_math_glyph_part_flags_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_MATH_GLYPH_PART_FLAG_EXTENDER MATH_GLYPH_PART_FLAG_EXTENDER} - This is an extender glyph part that can be repeated to reach the desired length.</li>
     * </ul>
     */
    public static final int HB_OT_MATH_GLYPH_PART_FLAG_EXTENDER = 0x1;

    /**
     * Known metadata tags from <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/meta">https://docs.microsoft.com/en-us/typography/opentype/spec/meta</a>. ({@code hb_ot_meta_tag_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_META_TAG_DESIGN_LANGUAGES META_TAG_DESIGN_LANGUAGES} - 
     * Design languages.
     * 
     * <p>Text, using only Basic Latin (ASCII) characters. Indicates languages and/or scripts for the user audiences that the font was primarily designed
     * for.</p>
     * </li>
     * <li>{@link #HB_OT_META_TAG_SUPPORTED_LANGUAGES META_TAG_SUPPORTED_LANGUAGES} - 
     * Supported languages.
     * 
     * <p>Text, using only Basic Latin (ASCII) characters. Indicates languages and/or scripts that the font is declared to be capable of supporting.</p>
     * </li>
     * </ul>
     */
    public static final int
        HB_OT_META_TAG_DESIGN_LANGUAGES    = HB_TAG ('d','l','n','g'),
        HB_OT_META_TAG_SUPPORTED_LANGUAGES = HB_TAG ('s','l','n','g');

    /**
     * Metric tags corresponding to <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/mvar#value-tags">MVAR Value Tags</a>.
     * 
     * <p>({@code hb_ot_metrics_tag_t})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_ASCENDER METRICS_TAG_HORIZONTAL_ASCENDER}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_DESCENDER METRICS_TAG_HORIZONTAL_DESCENDER}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_LINE_GAP METRICS_TAG_HORIZONTAL_LINE_GAP}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT}</li>
     * <li>{@link #HB_OT_METRICS_TAG_VERTICAL_ASCENDER METRICS_TAG_VERTICAL_ASCENDER}</li>
     * <li>{@link #HB_OT_METRICS_TAG_VERTICAL_DESCENDER METRICS_TAG_VERTICAL_DESCENDER}</li>
     * <li>{@link #HB_OT_METRICS_TAG_VERTICAL_LINE_GAP METRICS_TAG_VERTICAL_LINE_GAP}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_CARET_RISE METRICS_TAG_HORIZONTAL_CARET_RISE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_CARET_RUN METRICS_TAG_HORIZONTAL_CARET_RUN}</li>
     * <li>{@link #HB_OT_METRICS_TAG_HORIZONTAL_CARET_OFFSET METRICS_TAG_HORIZONTAL_CARET_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_VERTICAL_CARET_RISE METRICS_TAG_VERTICAL_CARET_RISE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_VERTICAL_CARET_RUN METRICS_TAG_VERTICAL_CARET_RUN}</li>
     * <li>{@link #HB_OT_METRICS_TAG_VERTICAL_CARET_OFFSET METRICS_TAG_VERTICAL_CARET_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_X_HEIGHT METRICS_TAG_X_HEIGHT}</li>
     * <li>{@link #HB_OT_METRICS_TAG_CAP_HEIGHT METRICS_TAG_CAP_HEIGHT}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_SIZE METRICS_TAG_SUBSCRIPT_EM_X_SIZE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_SIZE METRICS_TAG_SUBSCRIPT_EM_Y_SIZE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_OFFSET METRICS_TAG_SUBSCRIPT_EM_X_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_SIZE METRICS_TAG_SUPERSCRIPT_EM_X_SIZE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_STRIKEOUT_SIZE METRICS_TAG_STRIKEOUT_SIZE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_STRIKEOUT_OFFSET METRICS_TAG_STRIKEOUT_OFFSET}</li>
     * <li>{@link #HB_OT_METRICS_TAG_UNDERLINE_SIZE METRICS_TAG_UNDERLINE_SIZE}</li>
     * <li>{@link #HB_OT_METRICS_TAG_UNDERLINE_OFFSET METRICS_TAG_UNDERLINE_OFFSET}</li>
     * </ul>
     */
    public static final int
        HB_OT_METRICS_TAG_HORIZONTAL_ASCENDER         = HB_TAG ('h','a','s','c'),
        HB_OT_METRICS_TAG_HORIZONTAL_DESCENDER        = HB_TAG ('h','d','s','c'),
        HB_OT_METRICS_TAG_HORIZONTAL_LINE_GAP         = HB_TAG ('h','l','g','p'),
        HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT  = HB_TAG ('h','c','l','a'),
        HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT = HB_TAG ('h','c','l','d'),
        HB_OT_METRICS_TAG_VERTICAL_ASCENDER           = HB_TAG ('v','a','s','c'),
        HB_OT_METRICS_TAG_VERTICAL_DESCENDER          = HB_TAG ('v','d','s','c'),
        HB_OT_METRICS_TAG_VERTICAL_LINE_GAP           = HB_TAG ('v','l','g','p'),
        HB_OT_METRICS_TAG_HORIZONTAL_CARET_RISE       = HB_TAG ('h','c','r','s'),
        HB_OT_METRICS_TAG_HORIZONTAL_CARET_RUN        = HB_TAG ('h','c','r','n'),
        HB_OT_METRICS_TAG_HORIZONTAL_CARET_OFFSET     = HB_TAG ('h','c','o','f'),
        HB_OT_METRICS_TAG_VERTICAL_CARET_RISE         = HB_TAG ('v','c','r','s'),
        HB_OT_METRICS_TAG_VERTICAL_CARET_RUN          = HB_TAG ('v','c','r','n'),
        HB_OT_METRICS_TAG_VERTICAL_CARET_OFFSET       = HB_TAG ('v','c','o','f'),
        HB_OT_METRICS_TAG_X_HEIGHT                    = HB_TAG ('x','h','g','t'),
        HB_OT_METRICS_TAG_CAP_HEIGHT                  = HB_TAG ('c','p','h','t'),
        HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_SIZE         = HB_TAG ('s','b','x','s'),
        HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_SIZE         = HB_TAG ('s','b','y','s'),
        HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_OFFSET       = HB_TAG ('s','b','x','o'),
        HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET       = HB_TAG ('s','b','y','o'),
        HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_SIZE       = HB_TAG ('s','p','x','s'),
        HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE       = HB_TAG ('s','p','y','s'),
        HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET     = HB_TAG ('s','p','x','o'),
        HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET     = HB_TAG ('s','p','y','o'),
        HB_OT_METRICS_TAG_STRIKEOUT_SIZE              = HB_TAG ('s','t','r','s'),
        HB_OT_METRICS_TAG_STRIKEOUT_OFFSET            = HB_TAG ('s','t','r','o'),
        HB_OT_METRICS_TAG_UNDERLINE_SIZE              = HB_TAG ('u','n','d','s'),
        HB_OT_METRICS_TAG_UNDERLINE_OFFSET            = HB_TAG ('u','n','d','o');

    /**
     * An integral type representing an OpenType {@code name} table name identifier. ({@code hb_ot_name_id_t})
     * 
     * <p>There are predefined name IDs, as well as name IDs return from other API. These can be used to fetch name strings from a font face.</p>
     * 
     * <p>For more information on these fields, see the <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/name#name-ids">OpenType spec</a>.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_NAME_ID_COPYRIGHT NAME_ID_COPYRIGHT}</li>
     * <li>{@link #HB_OT_NAME_ID_FONT_FAMILY NAME_ID_FONT_FAMILY}</li>
     * <li>{@link #HB_OT_NAME_ID_FONT_SUBFAMILY NAME_ID_FONT_SUBFAMILY}</li>
     * <li>{@link #HB_OT_NAME_ID_UNIQUE_ID NAME_ID_UNIQUE_ID}</li>
     * <li>{@link #HB_OT_NAME_ID_FULL_NAME NAME_ID_FULL_NAME}</li>
     * <li>{@link #HB_OT_NAME_ID_VERSION_STRING NAME_ID_VERSION_STRING}</li>
     * <li>{@link #HB_OT_NAME_ID_POSTSCRIPT_NAME NAME_ID_POSTSCRIPT_NAME}</li>
     * <li>{@link #HB_OT_NAME_ID_TRADEMARK NAME_ID_TRADEMARK}</li>
     * <li>{@link #HB_OT_NAME_ID_MANUFACTURER NAME_ID_MANUFACTURER}</li>
     * <li>{@link #HB_OT_NAME_ID_DESIGNER NAME_ID_DESIGNER}</li>
     * <li>{@link #HB_OT_NAME_ID_DESCRIPTION NAME_ID_DESCRIPTION}</li>
     * <li>{@link #HB_OT_NAME_ID_VENDOR_URL NAME_ID_VENDOR_URL}</li>
     * <li>{@link #HB_OT_NAME_ID_DESIGNER_URL NAME_ID_DESIGNER_URL}</li>
     * <li>{@link #HB_OT_NAME_ID_LICENSE NAME_ID_LICENSE}</li>
     * <li>{@link #HB_OT_NAME_ID_LICENSE_URL NAME_ID_LICENSE_URL}</li>
     * <li>{@link #HB_OT_NAME_ID_TYPOGRAPHIC_FAMILY NAME_ID_TYPOGRAPHIC_FAMILY}</li>
     * <li>{@link #HB_OT_NAME_ID_TYPOGRAPHIC_SUBFAMILY NAME_ID_TYPOGRAPHIC_SUBFAMILY}</li>
     * <li>{@link #HB_OT_NAME_ID_MAC_FULL_NAME NAME_ID_MAC_FULL_NAME}</li>
     * <li>{@link #HB_OT_NAME_ID_SAMPLE_TEXT NAME_ID_SAMPLE_TEXT}</li>
     * <li>{@link #HB_OT_NAME_ID_CID_FINDFONT_NAME NAME_ID_CID_FINDFONT_NAME}</li>
     * <li>{@link #HB_OT_NAME_ID_WWS_FAMILY NAME_ID_WWS_FAMILY}</li>
     * <li>{@link #HB_OT_NAME_ID_WWS_SUBFAMILY NAME_ID_WWS_SUBFAMILY}</li>
     * <li>{@link #HB_OT_NAME_ID_LIGHT_BACKGROUND NAME_ID_LIGHT_BACKGROUND}</li>
     * <li>{@link #HB_OT_NAME_ID_DARK_BACKGROUND NAME_ID_DARK_BACKGROUND}</li>
     * <li>{@link #HB_OT_NAME_ID_VARIATIONS_PS_PREFIX NAME_ID_VARIATIONS_PS_PREFIX}</li>
     * <li>{@link #HB_OT_NAME_ID_INVALID NAME_ID_INVALID}</li>
     * </ul>
     */
    public static final int
        HB_OT_NAME_ID_COPYRIGHT             = 0,
        HB_OT_NAME_ID_FONT_FAMILY           = 1,
        HB_OT_NAME_ID_FONT_SUBFAMILY        = 2,
        HB_OT_NAME_ID_UNIQUE_ID             = 3,
        HB_OT_NAME_ID_FULL_NAME             = 4,
        HB_OT_NAME_ID_VERSION_STRING        = 5,
        HB_OT_NAME_ID_POSTSCRIPT_NAME       = 6,
        HB_OT_NAME_ID_TRADEMARK             = 7,
        HB_OT_NAME_ID_MANUFACTURER          = 8,
        HB_OT_NAME_ID_DESIGNER              = 9,
        HB_OT_NAME_ID_DESCRIPTION           = 10,
        HB_OT_NAME_ID_VENDOR_URL            = 11,
        HB_OT_NAME_ID_DESIGNER_URL          = 12,
        HB_OT_NAME_ID_LICENSE               = 13,
        HB_OT_NAME_ID_LICENSE_URL           = 14,
        HB_OT_NAME_ID_TYPOGRAPHIC_FAMILY    = 16,
        HB_OT_NAME_ID_TYPOGRAPHIC_SUBFAMILY = 17,
        HB_OT_NAME_ID_MAC_FULL_NAME         = 18,
        HB_OT_NAME_ID_SAMPLE_TEXT           = 19,
        HB_OT_NAME_ID_CID_FINDFONT_NAME     = 20,
        HB_OT_NAME_ID_WWS_FAMILY            = 21,
        HB_OT_NAME_ID_WWS_SUBFAMILY         = 22,
        HB_OT_NAME_ID_LIGHT_BACKGROUND      = 23,
        HB_OT_NAME_ID_DARK_BACKGROUND       = 24,
        HB_OT_NAME_ID_VARIATIONS_PS_PREFIX  = 25,
        HB_OT_NAME_ID_INVALID               = 0xFFFF;

    /** Registered tag for the roman/italic axis. */
    public static final int HB_OT_TAG_VAR_AXIS_ITALIC = HB_TAG('i','t','a','l');

    /**
     * Registered tag for the optical-size axis.
     * 
     * <p>Note: The optical-size axis supersedes the OpenType {@code size} feature.</p>
     */
    public static final int HB_OT_TAG_VAR_AXIS_OPTICAL_SIZE = HB_TAG('o','p','s','z');

    /** Registered tag for the slant axis */
    public static final int HB_OT_TAG_VAR_AXIS_SLANT = HB_TAG('s','l','n','t');

    /** Registered tag for the width axis. */
    public static final int HB_OT_TAG_VAR_AXIS_WIDTH = HB_TAG('w','d','t','h');

    /** Registered tag for the weight axis. */
    public static final int HB_OT_TAG_VAR_AXIS_WEIGHT = HB_TAG('w','g','h','t');

    /**
     * Flags for {@code hb_ot_var_axis_info_t}. ({@code hb_ot_var_axis_flags_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HB_OT_VAR_AXIS_FLAG_HIDDEN VAR_AXIS_FLAG_HIDDEN} - The axis should not be exposed directly in user interfaces.</li>
     * </ul>
     */
    public static final int HB_OT_VAR_AXIS_FLAG_HIDDEN = 0x1;

    protected OpenType() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_ot_color_has_palettes ] ---

    /** Color palettes. */
    @NativeType("hb_bool_t")
    public static boolean hb_ot_color_has_palettes(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.color_has_palettes;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_color_palette_get_count ] ---

    @NativeType("unsigned int")
    public static int hb_ot_color_palette_get_count(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.color_palette_get_count;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress);
    }

    // --- [ hb_ot_color_palette_get_name_id ] ---

    @NativeType("hb_ot_name_id_t")
    public static int hb_ot_color_palette_get_name_id(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int palette_index) {
        long __functionAddress = Functions.color_palette_get_name_id;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, palette_index, __functionAddress);
    }

    // --- [ hb_ot_color_palette_color_get_name_id ] ---

    @NativeType("hb_ot_name_id_t")
    public static int hb_ot_color_palette_color_get_name_id(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int color_index) {
        long __functionAddress = Functions.color_palette_color_get_name_id;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, color_index, __functionAddress);
    }

    // --- [ hb_ot_color_palette_get_flags ] ---

    @NativeType("hb_ot_color_palette_flags_t")
    public static int hb_ot_color_palette_get_flags(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int palette_index) {
        long __functionAddress = Functions.color_palette_get_flags;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, palette_index, __functionAddress);
    }

    // --- [ hb_ot_color_palette_get_colors ] ---

    public static int nhb_ot_color_palette_get_colors(long face, int palette_index, int start_offset, long color_count, long colors) {
        long __functionAddress = Functions.color_palette_get_colors;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, palette_index, start_offset, color_count, colors, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_color_palette_get_colors(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int palette_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer color_count, @Nullable @NativeType("hb_color_t *") IntBuffer colors) {
        if (CHECKS) {
            checkSafe(color_count, 1);
            if (color_count != null) { checkSafe(colors, color_count.get(color_count.position())); }
        }
        return nhb_ot_color_palette_get_colors(face, palette_index, start_offset, memAddressSafe(color_count), memAddressSafe(colors));
    }

    // --- [ hb_ot_color_has_layers ] ---

    /** Color layers. */
    @NativeType("hb_bool_t")
    public static boolean hb_ot_color_has_layers(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.color_has_layers;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_color_glyph_get_layers ] ---

    public static int nhb_ot_color_glyph_get_layers(long face, int glyph, int start_offset, long layer_count, long layers) {
        long __functionAddress = Functions.color_glyph_get_layers;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, glyph, start_offset, layer_count, layers, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_color_glyph_get_layers(@NativeType("hb_face_t *") long face, @NativeType("hb_codepoint_t") int glyph, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer layer_count, @Nullable @NativeType("hb_ot_color_layer_t *") hb_ot_color_layer_t.Buffer layers) {
        if (CHECKS) {
            checkSafe(layer_count, 1);
            if (layer_count != null) { checkSafe(layers, layer_count.get(layer_count.position())); }
        }
        return nhb_ot_color_glyph_get_layers(face, glyph, start_offset, memAddressSafe(layer_count), memAddressSafe(layers));
    }

    // --- [ hb_ot_color_has_svg ] ---

    @NativeType("hb_bool_t")
    public static boolean hb_ot_color_has_svg(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.color_has_svg;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_color_glyph_reference_svg ] ---

    @NativeType("hb_blob_t *")
    public static long hb_ot_color_glyph_reference_svg(@NativeType("hb_face_t *") long face, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.color_glyph_reference_svg;
        if (CHECKS) {
            check(face);
        }
        return invokePP(face, glyph, __functionAddress);
    }

    // --- [ hb_ot_color_has_png ] ---

    @NativeType("hb_bool_t")
    public static boolean hb_ot_color_has_png(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.color_has_png;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_color_glyph_reference_png ] ---

    @NativeType("hb_blob_t *")
    public static long hb_ot_color_glyph_reference_png(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.color_glyph_reference_png;
        if (CHECKS) {
            check(font);
        }
        return invokePP(font, glyph, __functionAddress);
    }

    // --- [ hb_ot_font_set_funcs ] ---

    public static void hb_ot_font_set_funcs(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_set_funcs;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_ot_tags_from_script_and_language ] ---

    public static void nhb_ot_tags_from_script_and_language(int script, long language, long script_count, long script_tags, long language_count, long language_tags) {
        long __functionAddress = Functions.tags_from_script_and_language;
        if (CHECKS) {
            check(language);
        }
        invokePPPPPV(script, language, script_count, script_tags, language_count, language_tags, __functionAddress);
    }

    public static void hb_ot_tags_from_script_and_language(@NativeType("hb_script_t") int script, @NativeType("hb_language_t") long language, @Nullable @NativeType("unsigned int *") IntBuffer script_count, @Nullable @NativeType("hb_tag_t *") IntBuffer script_tags, @Nullable @NativeType("unsigned int *") IntBuffer language_count, @Nullable @NativeType("hb_tag_t *") IntBuffer language_tags) {
        if (CHECKS) {
            checkSafe(script_count, 1);
            if (script_count != null) { checkSafe(script_tags, script_count.get(script_count.position())); }
            checkSafe(language_count, 1);
            if (language_count != null) { checkSafe(language_tags, language_count.get(language_count.position())); }
        }
        nhb_ot_tags_from_script_and_language(script, language, memAddressSafe(script_count), memAddressSafe(script_tags), memAddressSafe(language_count), memAddressSafe(language_tags));
    }

    // --- [ hb_ot_tag_to_script ] ---

    @NativeType("hb_script_t")
    public static int hb_ot_tag_to_script(@NativeType("hb_tag_t") int tag) {
        long __functionAddress = Functions.tag_to_script;
        return invokeI(tag, __functionAddress);
    }

    // --- [ hb_ot_tag_to_language ] ---

    @NativeType("hb_language_t")
    public static long hb_ot_tag_to_language(@NativeType("hb_tag_t") int tag) {
        long __functionAddress = Functions.tag_to_language;
        return invokeP(tag, __functionAddress);
    }

    // --- [ hb_ot_tags_to_script_and_language ] ---

    public static void nhb_ot_tags_to_script_and_language(int script_tag, int language_tag, long script, long language) {
        long __functionAddress = Functions.tags_to_script_and_language;
        invokePPV(script_tag, language_tag, script, language, __functionAddress);
    }

    public static void hb_ot_tags_to_script_and_language(@NativeType("hb_tag_t") int script_tag, @NativeType("hb_tag_t") int language_tag, @Nullable @NativeType("hb_script_t *") IntBuffer script, @Nullable @NativeType("hb_language_t *") PointerBuffer language) {
        if (CHECKS) {
            checkSafe(script, 1);
            checkSafe(language, 1);
        }
        nhb_ot_tags_to_script_and_language(script_tag, language_tag, memAddressSafe(script), memAddressSafe(language));
    }

    // --- [ hb_ot_layout_has_glyph_classes ] ---

    /** GDEF */
    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_has_glyph_classes(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.layout_has_glyph_classes;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_layout_get_glyph_class ] ---

    @NativeType("hb_ot_layout_glyph_class_t")
    public static int hb_ot_layout_get_glyph_class(@NativeType("hb_face_t *") long face, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.layout_get_glyph_class;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, glyph, __functionAddress);
    }

    // --- [ hb_ot_layout_get_glyphs_in_class ] ---

    public static void hb_ot_layout_get_glyphs_in_class(@NativeType("hb_face_t *") long face, @NativeType("hb_ot_layout_glyph_class_t") int klass, @NativeType("hb_set_t *") long glyphs) {
        long __functionAddress = Functions.layout_get_glyphs_in_class;
        if (CHECKS) {
            check(face);
            check(glyphs);
        }
        invokePPV(face, klass, glyphs, __functionAddress);
    }

    // --- [ hb_ot_layout_get_attach_points ] ---

    /** Unsafe version of: {@link #hb_ot_layout_get_attach_points layout_get_attach_points} */
    public static int nhb_ot_layout_get_attach_points(long face, int glyph, int start_offset, long point_count, long point_array) {
        long __functionAddress = Functions.layout_get_attach_points;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, glyph, start_offset, point_count, point_array, __functionAddress);
    }

    /** Not that useful. Provides list of attach points for a glyph that a client may want to cache */
    @NativeType("unsigned int")
    public static int hb_ot_layout_get_attach_points(@NativeType("hb_face_t *") long face, @NativeType("hb_codepoint_t") int glyph, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer point_count, @Nullable @NativeType("unsigned int *") IntBuffer point_array) {
        if (CHECKS) {
            checkSafe(point_count, 1);
            if (point_count != null) { checkSafe(point_array, point_count.get(point_count.position())); }
        }
        return nhb_ot_layout_get_attach_points(face, glyph, start_offset, memAddressSafe(point_count), memAddressSafe(point_array));
    }

    // --- [ hb_ot_layout_get_ligature_carets ] ---

    /** Unsafe version of: {@link #hb_ot_layout_get_ligature_carets layout_get_ligature_carets} */
    public static int nhb_ot_layout_get_ligature_carets(long font, int direction, int glyph, int start_offset, long caret_count, long caret_array) {
        long __functionAddress = Functions.layout_get_ligature_carets;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, direction, glyph, start_offset, caret_count, caret_array, __functionAddress);
    }

    /** Ligature caret positions */
    @NativeType("unsigned int")
    public static int hb_ot_layout_get_ligature_carets(@NativeType("hb_font_t *") long font, @NativeType("hb_direction_t") int direction, @NativeType("hb_codepoint_t") int glyph, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer caret_count, @Nullable @NativeType("hb_position_t *") IntBuffer caret_array) {
        if (CHECKS) {
            checkSafe(caret_count, 1);
            if (caret_count != null) { checkSafe(caret_array, caret_count.get(caret_count.position())); }
        }
        return nhb_ot_layout_get_ligature_carets(font, direction, glyph, start_offset, memAddressSafe(caret_count), memAddressSafe(caret_array));
    }

    // --- [ hb_ot_layout_table_get_script_tags ] ---

    public static int nhb_ot_layout_table_get_script_tags(long face, int table_tag, int start_offset, long script_count, long script_tags) {
        long __functionAddress = Functions.layout_table_get_script_tags;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, start_offset, script_count, script_tags, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_table_get_script_tags(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer script_count, @Nullable @NativeType("hb_tag_t *") IntBuffer script_tags) {
        if (CHECKS) {
            checkSafe(script_count, 1);
            if (script_count != null) { checkSafe(script_tags, script_count.get(script_count.position())); }
        }
        return nhb_ot_layout_table_get_script_tags(face, table_tag, start_offset, memAddressSafe(script_count), memAddressSafe(script_tags));
    }

    // --- [ hb_ot_layout_table_find_script ] ---

    public static int nhb_ot_layout_table_find_script(long face, int table_tag, int script_tag, long script_index) {
        long __functionAddress = Functions.layout_table_find_script;
        if (CHECKS) {
            check(face);
        }
        return invokePPI(face, table_tag, script_tag, script_index, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_table_find_script(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("hb_tag_t") int script_tag, @NativeType("unsigned int *") IntBuffer script_index) {
        if (CHECKS) {
            check(script_index, 1);
        }
        return nhb_ot_layout_table_find_script(face, table_tag, script_tag, memAddress(script_index)) != 0;
    }

    // --- [ hb_ot_layout_table_select_script ] ---

    public static int nhb_ot_layout_table_select_script(long face, int table_tag, int script_count, long script_tags, long script_index, long chosen_script) {
        long __functionAddress = Functions.layout_table_select_script;
        if (CHECKS) {
            check(face);
        }
        return invokePPPPI(face, table_tag, script_count, script_tags, script_index, chosen_script, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_table_select_script(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("hb_tag_t const *") IntBuffer script_tags, @NativeType("unsigned int *") IntBuffer script_index, @Nullable @NativeType("hb_tag_t *") IntBuffer chosen_script) {
        if (CHECKS) {
            check(script_index, 1);
            checkSafe(chosen_script, 1);
        }
        return nhb_ot_layout_table_select_script(face, table_tag, script_tags.remaining(), memAddress(script_tags), memAddress(script_index), memAddressSafe(chosen_script)) != 0;
    }

    // --- [ hb_ot_layout_table_get_feature_tags ] ---

    public static int nhb_ot_layout_table_get_feature_tags(long face, int table_tag, int start_offset, long feature_count, long feature_tags) {
        long __functionAddress = Functions.layout_table_get_feature_tags;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, start_offset, feature_count, feature_tags, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_table_get_feature_tags(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer feature_count, @Nullable @NativeType("hb_tag_t *") IntBuffer feature_tags) {
        if (CHECKS) {
            checkSafe(feature_count, 1);
            if (feature_count != null) { checkSafe(feature_tags, feature_count.get(feature_count.position())); }
        }
        return nhb_ot_layout_table_get_feature_tags(face, table_tag, start_offset, memAddressSafe(feature_count), memAddressSafe(feature_tags));
    }

    // --- [ hb_ot_layout_script_get_language_tags ] ---

    public static int nhb_ot_layout_script_get_language_tags(long face, int table_tag, int script_index, int start_offset, long language_count, long language_tags) {
        long __functionAddress = Functions.layout_script_get_language_tags;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, script_index, start_offset, language_count, language_tags, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_script_get_language_tags(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer language_count, @Nullable @NativeType("hb_tag_t *") IntBuffer language_tags) {
        if (CHECKS) {
            checkSafe(language_count, 1);
            if (language_count != null) { checkSafe(language_tags, language_count.get(language_count.position())); }
        }
        return nhb_ot_layout_script_get_language_tags(face, table_tag, script_index, start_offset, memAddressSafe(language_count), memAddressSafe(language_tags));
    }

    // --- [ hb_ot_layout_script_select_language ] ---

    public static int nhb_ot_layout_script_select_language(long face, int table_tag, int script_index, int language_count, long language_tags, long language_index) {
        long __functionAddress = Functions.layout_script_select_language;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, script_index, language_count, language_tags, language_index, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_script_select_language(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("hb_tag_t const *") IntBuffer language_tags, @Nullable @NativeType("unsigned int *") IntBuffer language_index) {
        if (CHECKS) {
            checkSafe(language_index, 1);
        }
        return nhb_ot_layout_script_select_language(face, table_tag, script_index, language_tags.remaining(), memAddress(language_tags), memAddressSafe(language_index)) != 0;
    }

    // --- [ hb_ot_layout_language_get_required_feature_index ] ---

    public static int nhb_ot_layout_language_get_required_feature_index(long face, int table_tag, int script_index, int language_index, long feature_index) {
        long __functionAddress = Functions.layout_language_get_required_feature_index;
        if (CHECKS) {
            check(face);
        }
        return invokePPI(face, table_tag, script_index, language_index, feature_index, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_language_get_required_feature_index(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("unsigned int") int language_index, @Nullable @NativeType("unsigned int *") IntBuffer feature_index) {
        if (CHECKS) {
            checkSafe(feature_index, 1);
        }
        return nhb_ot_layout_language_get_required_feature_index(face, table_tag, script_index, language_index, memAddressSafe(feature_index)) != 0;
    }

    // --- [ hb_ot_layout_language_get_required_feature ] ---

    public static int nhb_ot_layout_language_get_required_feature(long face, int table_tag, int script_index, int language_index, long feature_index, long feature_tag) {
        long __functionAddress = Functions.layout_language_get_required_feature;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, script_index, language_index, feature_index, feature_tag, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_language_get_required_feature(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("unsigned int") int language_index, @Nullable @NativeType("unsigned int *") IntBuffer feature_index, @Nullable @NativeType("hb_tag_t *") IntBuffer feature_tag) {
        if (CHECKS) {
            checkSafe(feature_index, 1);
            checkSafe(feature_tag, 1);
        }
        return nhb_ot_layout_language_get_required_feature(face, table_tag, script_index, language_index, memAddressSafe(feature_index), memAddressSafe(feature_tag)) != 0;
    }

    // --- [ hb_ot_layout_language_get_feature_indexes ] ---

    public static int nhb_ot_layout_language_get_feature_indexes(long face, int table_tag, int script_index, int language_index, int start_offset, long feature_count, long feature_indexes) {
        long __functionAddress = Functions.layout_language_get_feature_indexes;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, script_index, language_index, start_offset, feature_count, feature_indexes, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_language_get_feature_indexes(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("unsigned int") int language_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer feature_count, @Nullable @NativeType("unsigned int *") IntBuffer feature_indexes) {
        if (CHECKS) {
            checkSafe(feature_count, 1);
            if (feature_count != null) { checkSafe(feature_indexes, feature_count.get(feature_count.position())); }
        }
        return nhb_ot_layout_language_get_feature_indexes(face, table_tag, script_index, language_index, start_offset, memAddressSafe(feature_count), memAddressSafe(feature_indexes));
    }

    // --- [ hb_ot_layout_language_get_feature_tags ] ---

    public static int nhb_ot_layout_language_get_feature_tags(long face, int table_tag, int script_index, int language_index, int start_offset, long feature_count, long feature_tags) {
        long __functionAddress = Functions.layout_language_get_feature_tags;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, script_index, language_index, start_offset, feature_count, feature_tags, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_language_get_feature_tags(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("unsigned int") int language_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer feature_count, @Nullable @NativeType("hb_tag_t *") IntBuffer feature_tags) {
        if (CHECKS) {
            checkSafe(feature_count, 1);
            if (feature_count != null) { checkSafe(feature_tags, feature_count.get(feature_count.position())); }
        }
        return nhb_ot_layout_language_get_feature_tags(face, table_tag, script_index, language_index, start_offset, memAddressSafe(feature_count), memAddressSafe(feature_tags));
    }

    // --- [ hb_ot_layout_language_find_feature ] ---

    public static int nhb_ot_layout_language_find_feature(long face, int table_tag, int script_index, int language_index, int feature_tag, long feature_index) {
        long __functionAddress = Functions.layout_language_find_feature;
        if (CHECKS) {
            check(face);
        }
        return invokePPI(face, table_tag, script_index, language_index, feature_tag, feature_index, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_language_find_feature(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int script_index, @NativeType("unsigned int") int language_index, @NativeType("hb_tag_t") int feature_tag, @Nullable @NativeType("unsigned int *") IntBuffer feature_index) {
        if (CHECKS) {
            checkSafe(feature_index, 1);
        }
        return nhb_ot_layout_language_find_feature(face, table_tag, script_index, language_index, feature_tag, memAddressSafe(feature_index)) != 0;
    }

    // --- [ hb_ot_layout_feature_get_lookups ] ---

    public static int nhb_ot_layout_feature_get_lookups(long face, int table_tag, int feature_index, int start_offset, long lookup_count, long lookup_indexes) {
        long __functionAddress = Functions.layout_feature_get_lookups;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, feature_index, start_offset, lookup_count, lookup_indexes, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_feature_get_lookups(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int feature_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer lookup_count, @Nullable @NativeType("unsigned int *") IntBuffer lookup_indexes) {
        if (CHECKS) {
            checkSafe(lookup_count, 1);
            if (lookup_count != null) { checkSafe(lookup_indexes, lookup_count.get(lookup_count.position())); }
        }
        return nhb_ot_layout_feature_get_lookups(face, table_tag, feature_index, start_offset, memAddressSafe(lookup_count), memAddressSafe(lookup_indexes));
    }

    // --- [ hb_ot_layout_table_get_lookup_count ] ---

    @NativeType("unsigned int")
    public static int hb_ot_layout_table_get_lookup_count(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag) {
        long __functionAddress = Functions.layout_table_get_lookup_count;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, table_tag, __functionAddress);
    }

    // --- [ hb_ot_layout_collect_features ] ---

    public static void nhb_ot_layout_collect_features(long face, int table_tag, long scripts, long languages, long features, long feature_indexes) {
        long __functionAddress = Functions.layout_collect_features;
        if (CHECKS) {
            check(face);
            check(feature_indexes);
        }
        invokePPPPPV(face, table_tag, scripts, languages, features, feature_indexes, __functionAddress);
    }

    public static void hb_ot_layout_collect_features(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @Nullable @NativeType("hb_tag_t const *") IntBuffer scripts, @Nullable @NativeType("hb_tag_t const *") IntBuffer languages, @Nullable @NativeType("hb_tag_t const *") IntBuffer features, @NativeType("hb_set_t *") long feature_indexes) {
        if (CHECKS) {
            checkNTSafe(scripts);
            checkNTSafe(languages);
            checkNTSafe(features);
        }
        nhb_ot_layout_collect_features(face, table_tag, memAddressSafe(scripts), memAddressSafe(languages), memAddressSafe(features), feature_indexes);
    }

    // --- [ hb_ot_layout_collect_features_map ] ---

    public static void hb_ot_layout_collect_features_map(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned") int script_index, @NativeType("unsigned") int language_index, @NativeType("hb_map_t *") long feature_map) {
        long __functionAddress = Functions.layout_collect_features_map;
        if (CHECKS) {
            check(face);
            check(feature_map);
        }
        invokePPV(face, table_tag, script_index, language_index, feature_map, __functionAddress);
    }

    // --- [ hb_ot_layout_collect_lookups ] ---

    public static void nhb_ot_layout_collect_lookups(long face, int table_tag, long scripts, long languages, long features, long lookup_indexes) {
        long __functionAddress = Functions.layout_collect_lookups;
        if (CHECKS) {
            check(face);
            check(lookup_indexes);
        }
        invokePPPPPV(face, table_tag, scripts, languages, features, lookup_indexes, __functionAddress);
    }

    public static void hb_ot_layout_collect_lookups(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @Nullable @NativeType("hb_tag_t const *") IntBuffer scripts, @Nullable @NativeType("hb_tag_t const *") IntBuffer languages, @Nullable @NativeType("hb_tag_t const *") IntBuffer features, @NativeType("hb_set_t *") long lookup_indexes) {
        if (CHECKS) {
            checkNTSafe(scripts);
            checkNTSafe(languages);
            checkNTSafe(features);
        }
        nhb_ot_layout_collect_lookups(face, table_tag, memAddressSafe(scripts), memAddressSafe(languages), memAddressSafe(features), lookup_indexes);
    }

    // --- [ hb_ot_layout_lookup_collect_glyphs ] ---

    public static void hb_ot_layout_lookup_collect_glyphs(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int lookup_index, @NativeType("hb_set_t *") long glyphs_before, @NativeType("hb_set_t *") long glyphs_input, @NativeType("hb_set_t *") long glyphs_after, @NativeType("hb_set_t *") long glyphs_output) {
        long __functionAddress = Functions.layout_lookup_collect_glyphs;
        if (CHECKS) {
            check(face);
        }
        invokePPPPPV(face, table_tag, lookup_index, glyphs_before, glyphs_input, glyphs_after, glyphs_output, __functionAddress);
    }

    // --- [ hb_ot_layout_table_find_feature_variations ] ---

    public static int nhb_ot_layout_table_find_feature_variations(long face, int table_tag, long coords, int num_coords, long variations_index) {
        long __functionAddress = Functions.layout_table_find_feature_variations;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, coords, num_coords, variations_index, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_table_find_feature_variations(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("int const *") IntBuffer coords, @NativeType("unsigned int *") IntBuffer variations_index) {
        if (CHECKS) {
            check(variations_index, 1);
        }
        return nhb_ot_layout_table_find_feature_variations(face, table_tag, memAddress(coords), coords.remaining(), memAddress(variations_index)) != 0;
    }

    // --- [ hb_ot_layout_feature_with_variations_get_lookups ] ---

    public static int nhb_ot_layout_feature_with_variations_get_lookups(long face, int table_tag, int feature_index, int variations_index, int start_offset, long lookup_count, long lookup_indexes) {
        long __functionAddress = Functions.layout_feature_with_variations_get_lookups;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, feature_index, variations_index, start_offset, lookup_count, lookup_indexes, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_feature_with_variations_get_lookups(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int feature_index, @NativeType("unsigned int") int variations_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer lookup_count, @Nullable @NativeType("unsigned int *") IntBuffer lookup_indexes) {
        if (CHECKS) {
            checkSafe(lookup_count, 1);
            if (lookup_count != null) { checkSafe(lookup_indexes, lookup_count.get(lookup_count.position())); }
        }
        return nhb_ot_layout_feature_with_variations_get_lookups(face, table_tag, feature_index, variations_index, start_offset, memAddressSafe(lookup_count), memAddressSafe(lookup_indexes));
    }

    // --- [ hb_ot_layout_has_substitution ] ---

    /** GSUB */
    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_has_substitution(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.layout_has_substitution;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_layout_lookup_get_glyph_alternates ] ---

    public static int nhb_ot_layout_lookup_get_glyph_alternates(long face, int lookup_index, int glyph, int start_offset, long alternate_count, long alternate_glyphs) {
        long __functionAddress = Functions.layout_lookup_get_glyph_alternates;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, lookup_index, glyph, start_offset, alternate_count, alternate_glyphs, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_lookup_get_glyph_alternates(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int lookup_index, @NativeType("hb_codepoint_t") int glyph, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer alternate_count, @Nullable @NativeType("hb_codepoint_t *") IntBuffer alternate_glyphs) {
        if (CHECKS) {
            checkSafe(alternate_count, 1);
            if (alternate_count != null) { checkSafe(alternate_glyphs, alternate_count.get(alternate_count.position())); }
        }
        return nhb_ot_layout_lookup_get_glyph_alternates(face, lookup_index, glyph, start_offset, memAddressSafe(alternate_count), memAddressSafe(alternate_glyphs));
    }

    // --- [ hb_ot_layout_lookup_would_substitute ] ---

    public static int nhb_ot_layout_lookup_would_substitute(long face, int lookup_index, long glyphs, int glyphs_length, int zero_context) {
        long __functionAddress = Functions.layout_lookup_would_substitute;
        if (CHECKS) {
            check(face);
        }
        return invokePPI(face, lookup_index, glyphs, glyphs_length, zero_context, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_lookup_would_substitute(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int lookup_index, @NativeType("hb_codepoint_t const *") IntBuffer glyphs, @NativeType("hb_bool_t") boolean zero_context) {
        return nhb_ot_layout_lookup_would_substitute(face, lookup_index, memAddress(glyphs), glyphs.remaining(), zero_context ? 1 : 0) != 0;
    }

    // --- [ hb_ot_layout_lookup_substitute_closure ] ---

    public static void hb_ot_layout_lookup_substitute_closure(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int lookup_index, @NativeType("hb_set_t *") long glyphs) {
        long __functionAddress = Functions.layout_lookup_substitute_closure;
        if (CHECKS) {
            check(face);
            check(glyphs);
        }
        invokePPV(face, lookup_index, glyphs, __functionAddress);
    }

    // --- [ hb_ot_layout_lookups_substitute_closure ] ---

    public static void hb_ot_layout_lookups_substitute_closure(@NativeType("hb_face_t *") long face, @NativeType("hb_set_t const *") long lookups, @NativeType("hb_set_t *") long glyphs) {
        long __functionAddress = Functions.layout_lookups_substitute_closure;
        if (CHECKS) {
            check(face);
            check(lookups);
            check(glyphs);
        }
        invokePPPV(face, lookups, glyphs, __functionAddress);
    }

    // --- [ hb_ot_layout_has_positioning ] ---

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_has_positioning(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.layout_has_positioning;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_layout_get_size_params ] ---

    public static int nhb_ot_layout_get_size_params(long face, long design_size, long subfamily_id, long subfamily_name_id, long range_start, long range_end) {
        long __functionAddress = Functions.layout_get_size_params;
        if (CHECKS) {
            check(face);
        }
        return invokePPPPPPI(face, design_size, subfamily_id, subfamily_name_id, range_start, range_end, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_get_size_params(@NativeType("hb_face_t *") long face, @Nullable @NativeType("unsigned int *") IntBuffer design_size, @Nullable @NativeType("unsigned int *") IntBuffer subfamily_id, @Nullable @NativeType("hb_ot_name_id_t *") IntBuffer subfamily_name_id, @Nullable @NativeType("unsigned int *") IntBuffer range_start, @Nullable @NativeType("unsigned int *") IntBuffer range_end) {
        if (CHECKS) {
            checkSafe(design_size, 1);
            checkSafe(subfamily_id, 1);
            checkSafe(subfamily_name_id, 1);
            checkSafe(range_start, 1);
            checkSafe(range_end, 1);
        }
        return nhb_ot_layout_get_size_params(face, memAddressSafe(design_size), memAddressSafe(subfamily_id), memAddressSafe(subfamily_name_id), memAddressSafe(range_start), memAddressSafe(range_end)) != 0;
    }

    // --- [ hb_ot_layout_lookup_get_optical_bound ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_layout_lookup_get_optical_bound(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int lookup_index, @NativeType("hb_direction_t") int direction, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.layout_lookup_get_optical_bound;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, lookup_index, direction, glyph, __functionAddress);
    }

    // --- [ hb_ot_layout_feature_get_name_ids ] ---

    public static int nhb_ot_layout_feature_get_name_ids(long face, int table_tag, int feature_index, long label_id, long tooltip_id, long sample_id, long num_named_parameters, long first_param_id) {
        long __functionAddress = Functions.layout_feature_get_name_ids;
        if (CHECKS) {
            check(face);
        }
        return invokePPPPPPI(face, table_tag, feature_index, label_id, tooltip_id, sample_id, num_named_parameters, first_param_id, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_feature_get_name_ids(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int feature_index, @Nullable @NativeType("hb_ot_name_id_t *") IntBuffer label_id, @Nullable @NativeType("hb_ot_name_id_t *") IntBuffer tooltip_id, @Nullable @NativeType("hb_ot_name_id_t *") IntBuffer sample_id, @Nullable @NativeType("unsigned int *") IntBuffer num_named_parameters, @Nullable @NativeType("hb_ot_name_id_t *") IntBuffer first_param_id) {
        if (CHECKS) {
            checkSafe(label_id, 1);
            checkSafe(tooltip_id, 1);
            checkSafe(sample_id, 1);
            checkSafe(num_named_parameters, 1);
            checkSafe(first_param_id, 1);
        }
        return nhb_ot_layout_feature_get_name_ids(face, table_tag, feature_index, memAddressSafe(label_id), memAddressSafe(tooltip_id), memAddressSafe(sample_id), memAddressSafe(num_named_parameters), memAddressSafe(first_param_id)) != 0;
    }

    // --- [ hb_ot_layout_feature_get_characters ] ---

    public static int nhb_ot_layout_feature_get_characters(long face, int table_tag, int feature_index, int start_offset, long char_count, long characters) {
        long __functionAddress = Functions.layout_feature_get_characters;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, table_tag, feature_index, start_offset, char_count, characters, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_layout_feature_get_characters(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int table_tag, @NativeType("unsigned int") int feature_index, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer char_count, @Nullable @NativeType("hb_codepoint_t *") IntBuffer characters) {
        if (CHECKS) {
            checkSafe(char_count, 1);
            if (char_count != null) { checkSafe(characters, char_count.get(char_count.position())); }
        }
        return nhb_ot_layout_feature_get_characters(face, table_tag, feature_index, start_offset, memAddressSafe(char_count), memAddressSafe(characters));
    }

    // --- [ hb_ot_ot_layout_get_font_extents ] ---

    public static int nhb_ot_ot_layout_get_font_extents(long font, int direction, int script_tag, int language_tag, long extents) {
        long __functionAddress = Functions.ot_layout_get_font_extents;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, direction, script_tag, language_tag, extents, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_ot_layout_get_font_extents(@NativeType("hb_font_t *") long font, @NativeType("hb_direction_t") int direction, @NativeType("hb_tag_t") int script_tag, @NativeType("hb_tag_t") int language_tag, @NativeType("hb_font_extents_t *") hb_font_extents_t extents) {
        return nhb_ot_ot_layout_get_font_extents(font, direction, script_tag, language_tag, extents.address()) != 0;
    }

    // --- [ hb_ot_ot_layout_get_font_extents2 ] ---

    public static int nhb_ot_ot_layout_get_font_extents2(long font, int direction, int script, long language, long extents) {
        long __functionAddress = Functions.ot_layout_get_font_extents2;
        if (CHECKS) {
            check(font);
            check(language);
        }
        return invokePPPI(font, direction, script, language, extents, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_ot_layout_get_font_extents2(@NativeType("hb_font_t *") long font, @NativeType("hb_direction_t") int direction, @NativeType("hb_script_t") int script, @NativeType("hb_language_t") long language, @NativeType("hb_font_extents_t *") hb_font_extents_t extents) {
        return nhb_ot_ot_layout_get_font_extents2(font, direction, script, language, extents.address()) != 0;
    }

    // --- [ hb_ot_layout_get_horizontal_baseline_tag_for_script ] ---

    @NativeType("hb_ot_layout_baseline_tag_t")
    public static int hb_ot_layout_get_horizontal_baseline_tag_for_script(@NativeType("hb_script_t") int script) {
        long __functionAddress = Functions.layout_get_horizontal_baseline_tag_for_script;
        return invokeI(script, __functionAddress);
    }

    // --- [ hb_ot_layout_get_baseline ] ---

    public static int nhb_ot_layout_get_baseline(long font, int baseline_tag, int direction, int script_tag, int language_tag, long coord) {
        long __functionAddress = Functions.layout_get_baseline;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, baseline_tag, direction, script_tag, language_tag, coord, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_layout_get_baseline(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_layout_baseline_tag_t") int baseline_tag, @NativeType("hb_direction_t") int direction, @NativeType("hb_tag_t") int script_tag, @NativeType("hb_tag_t") int language_tag, @Nullable @NativeType("hb_position_t *") IntBuffer coord) {
        if (CHECKS) {
            checkSafe(coord, 1);
        }
        return nhb_ot_layout_get_baseline(font, baseline_tag, direction, script_tag, language_tag, memAddressSafe(coord)) != 0;
    }

    // --- [ hb_ot_ot_layout_get_baseline2 ] ---

    public static int nhb_ot_ot_layout_get_baseline2(long font, int baseline_tag, int direction, int script, long language, long coord) {
        long __functionAddress = Functions.ot_layout_get_baseline2;
        if (CHECKS) {
            check(font);
            check(language);
        }
        return invokePPPI(font, baseline_tag, direction, script, language, coord, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_ot_layout_get_baseline2(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_layout_baseline_tag_t") int baseline_tag, @NativeType("hb_direction_t") int direction, @NativeType("hb_script_t") int script, @NativeType("hb_language_t") long language, @Nullable @NativeType("hb_position_t *") IntBuffer coord) {
        if (CHECKS) {
            checkSafe(coord, 1);
        }
        return nhb_ot_ot_layout_get_baseline2(font, baseline_tag, direction, script, language, memAddressSafe(coord)) != 0;
    }

    // --- [ hb_ot_layout_get_baseline_with_fallback ] ---

    public static void nhb_ot_layout_get_baseline_with_fallback(long font, int baseline_tag, int direction, int script_tag, int language_tag, long coord) {
        long __functionAddress = Functions.layout_get_baseline_with_fallback;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, baseline_tag, direction, script_tag, language_tag, coord, __functionAddress);
    }

    public static void hb_ot_layout_get_baseline_with_fallback(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_layout_baseline_tag_t") int baseline_tag, @NativeType("hb_direction_t") int direction, @NativeType("hb_tag_t") int script_tag, @NativeType("hb_tag_t") int language_tag, @Nullable @NativeType("hb_position_t *") IntBuffer coord) {
        if (CHECKS) {
            checkSafe(coord, 1);
        }
        nhb_ot_layout_get_baseline_with_fallback(font, baseline_tag, direction, script_tag, language_tag, memAddressSafe(coord));
    }

    // --- [ hb_ot_layout_get_baseline_with_fallback2 ] ---

    public static void nhb_ot_layout_get_baseline_with_fallback2(long font, int baseline_tag, int direction, int script, long language, long coord) {
        long __functionAddress = Functions.layout_get_baseline_with_fallback2;
        if (CHECKS) {
            check(font);
            check(language);
        }
        invokePPPV(font, baseline_tag, direction, script, language, coord, __functionAddress);
    }

    public static void hb_ot_layout_get_baseline_with_fallback2(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_layout_baseline_tag_t") int baseline_tag, @NativeType("hb_direction_t") int direction, @NativeType("hb_script_t") int script, @NativeType("hb_language_t") long language, @Nullable @NativeType("hb_position_t *") IntBuffer coord) {
        if (CHECKS) {
            checkSafe(coord, 1);
        }
        nhb_ot_layout_get_baseline_with_fallback2(font, baseline_tag, direction, script, language, memAddressSafe(coord));
    }

    // --- [ hb_ot_math_has_data ] ---

    /** Methods */
    @NativeType("hb_bool_t")
    public static boolean hb_ot_math_has_data(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.math_has_data;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_math_get_constant ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_math_get_constant(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_math_constant_t") int constant) {
        long __functionAddress = Functions.math_get_constant;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, constant, __functionAddress);
    }

    // --- [ hb_ot_math_get_glyph_italics_correction ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_math_get_glyph_italics_correction(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.math_get_glyph_italics_correction;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, glyph, __functionAddress);
    }

    // --- [ hb_ot_math_get_glyph_top_accent_attachment ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_math_get_glyph_top_accent_attachment(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.math_get_glyph_top_accent_attachment;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, glyph, __functionAddress);
    }

    // --- [ hb_ot_math_is_glyph_extended_shape ] ---

    @NativeType("hb_bool_t")
    public static boolean hb_ot_math_is_glyph_extended_shape(@NativeType("hb_face_t *") long face, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.math_is_glyph_extended_shape;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, glyph, __functionAddress) != 0;
    }

    // --- [ hb_ot_math_get_glyph_kerning ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_math_get_glyph_kerning(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_ot_math_kern_t") int kern, @NativeType("hb_position_t") int correction_height) {
        long __functionAddress = Functions.math_get_glyph_kerning;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, glyph, kern, correction_height, __functionAddress);
    }

    // --- [ hb_ot_math_get_glyph_kernings ] ---

    public static int nhb_ot_math_get_glyph_kernings(long font, int glyph, int kern, int start_offset, long entries_count, long kern_entries) {
        long __functionAddress = Functions.math_get_glyph_kernings;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, glyph, kern, start_offset, entries_count, kern_entries, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_math_get_glyph_kernings(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_ot_math_kern_t") int kern, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer entries_count, @Nullable @NativeType("hb_ot_math_kern_entry_t *") hb_ot_math_kern_entry_t.Buffer kern_entries) {
        if (CHECKS) {
            checkSafe(entries_count, 1);
            if (entries_count != null) { checkSafe(kern_entries, entries_count.get(entries_count.position())); }
        }
        return nhb_ot_math_get_glyph_kernings(font, glyph, kern, start_offset, memAddressSafe(entries_count), memAddressSafe(kern_entries));
    }

    // --- [ hb_ot_math_get_glyph_variants ] ---

    public static int nhb_ot_math_get_glyph_variants(long font, int glyph, int direction, int start_offset, long variants_count, long variants) {
        long __functionAddress = Functions.math_get_glyph_variants;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, glyph, direction, start_offset, variants_count, variants, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_math_get_glyph_variants(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer variants_count, @Nullable @NativeType("hb_ot_math_glyph_variant_t *") hb_ot_math_glyph_variant_t.Buffer variants) {
        if (CHECKS) {
            checkSafe(variants_count, 1);
            if (variants_count != null) { checkSafe(variants, variants_count.get(variants_count.position())); }
        }
        return nhb_ot_math_get_glyph_variants(font, glyph, direction, start_offset, memAddressSafe(variants_count), memAddressSafe(variants));
    }

    // --- [ hb_ot_math_get_min_connector_overlap ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_math_get_min_connector_overlap(@NativeType("hb_font_t *") long font, @NativeType("hb_direction_t") int direction) {
        long __functionAddress = Functions.math_get_min_connector_overlap;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, direction, __functionAddress);
    }

    // --- [ hb_ot_math_get_glyph_assembly ] ---

    public static int nhb_ot_math_get_glyph_assembly(long font, int glyph, int direction, int start_offset, long parts_count, long parts, long italics_correction) {
        long __functionAddress = Functions.math_get_glyph_assembly;
        if (CHECKS) {
            check(font);
        }
        return invokePPPPI(font, glyph, direction, start_offset, parts_count, parts, italics_correction, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_math_get_glyph_assembly(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer parts_count, @Nullable @NativeType("hb_ot_math_glyph_part_t *") hb_ot_math_glyph_part_t.Buffer parts, @Nullable @NativeType("hb_position_t *") IntBuffer italics_correction) {
        if (CHECKS) {
            checkSafe(parts_count, 1);
            if (parts_count != null) { checkSafe(parts, parts_count.get(parts_count.position())); }
            checkSafe(italics_correction, 1);
        }
        return nhb_ot_math_get_glyph_assembly(font, glyph, direction, start_offset, memAddressSafe(parts_count), memAddressSafe(parts), memAddressSafe(italics_correction));
    }

    // --- [ hb_ot_meta_get_entry_tags ] ---

    public static int nhb_ot_meta_get_entry_tags(long face, int start_offset, long entries_count, long entries) {
        long __functionAddress = Functions.meta_get_entry_tags;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, start_offset, entries_count, entries, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_meta_get_entry_tags(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer entries_count, @Nullable @NativeType("hb_ot_meta_tag_t *") IntBuffer entries) {
        if (CHECKS) {
            checkSafe(entries_count, 1);
            if (entries_count != null) { checkSafe(entries, entries_count.get(entries_count.position())); }
        }
        return nhb_ot_meta_get_entry_tags(face, start_offset, memAddressSafe(entries_count), memAddressSafe(entries));
    }

    // --- [ hb_ot_meta_reference_entry ] ---

    @NativeType("hb_blob_t *")
    public static long hb_ot_meta_reference_entry(@NativeType("hb_face_t *") long face, @NativeType("hb_ot_meta_tag_t") int meta_tag) {
        long __functionAddress = Functions.meta_reference_entry;
        if (CHECKS) {
            check(face);
        }
        return invokePP(face, meta_tag, __functionAddress);
    }

    // --- [ hb_ot_metrics_get_position ] ---

    public static int nhb_ot_metrics_get_position(long font, int metrics_tag, long position) {
        long __functionAddress = Functions.metrics_get_position;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, metrics_tag, position, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_metrics_get_position(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_metrics_tag_t") int metrics_tag, @Nullable @NativeType("hb_position_t *") IntBuffer position) {
        if (CHECKS) {
            checkSafe(position, 1);
        }
        return nhb_ot_metrics_get_position(font, metrics_tag, memAddressSafe(position)) != 0;
    }

    // --- [ hb_ot_metrics_get_position_with_fallback ] ---

    public static void nhb_ot_metrics_get_position_with_fallback(long font, int metrics_tag, long position) {
        long __functionAddress = Functions.metrics_get_position_with_fallback;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, metrics_tag, position, __functionAddress);
    }

    public static void hb_ot_metrics_get_position_with_fallback(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_metrics_tag_t") int metrics_tag, @Nullable @NativeType("hb_position_t *") IntBuffer position) {
        if (CHECKS) {
            checkSafe(position, 1);
        }
        nhb_ot_metrics_get_position_with_fallback(font, metrics_tag, memAddressSafe(position));
    }

    // --- [ hb_ot_metrics_get_variation ] ---

    public static float hb_ot_metrics_get_variation(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_metrics_tag_t") int metrics_tag) {
        long __functionAddress = Functions.metrics_get_variation;
        if (CHECKS) {
            check(font);
        }
        return invokePF(font, metrics_tag, __functionAddress);
    }

    // --- [ hb_ot_metrics_get_x_variation ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_metrics_get_x_variation(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_metrics_tag_t") int metrics_tag) {
        long __functionAddress = Functions.metrics_get_x_variation;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, metrics_tag, __functionAddress);
    }

    // --- [ hb_ot_metrics_get_y_variation ] ---

    @NativeType("hb_position_t")
    public static int hb_ot_metrics_get_y_variation(@NativeType("hb_font_t *") long font, @NativeType("hb_ot_metrics_tag_t") int metrics_tag) {
        long __functionAddress = Functions.metrics_get_y_variation;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, metrics_tag, __functionAddress);
    }

    // --- [ hb_ot_name_list_names ] ---

    public static long nhb_ot_name_list_names(long face, long num_entries) {
        long __functionAddress = Functions.name_list_names;
        if (CHECKS) {
            check(face);
        }
        return invokePPP(face, num_entries, __functionAddress);
    }

    @Nullable
    @NativeType("hb_ot_name_entry_t const *")
    public static hb_ot_name_entry_t.Buffer hb_ot_name_list_names(@NativeType("hb_face_t *") long face) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer num_entries = stack.callocInt(1);
        try {
            long __result = nhb_ot_name_list_names(face, memAddress(num_entries));
            return hb_ot_name_entry_t.createSafe(__result, num_entries.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_ot_name_get_utf8 ] ---

    public static int nhb_ot_name_get_utf8(long face, int name_id, long language, long text_size, long text) {
        long __functionAddress = Functions.name_get_utf8;
        if (CHECKS) {
            check(face);
            check(language);
        }
        return invokePPPPI(face, name_id, language, text_size, text, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_name_get_utf8(@NativeType("hb_face_t *") long face, @NativeType("hb_ot_name_id_t") int name_id, @NativeType("hb_language_t") long language, @Nullable @NativeType("unsigned int *") IntBuffer text_size, @Nullable @NativeType("char *") ByteBuffer text) {
        if (CHECKS) {
            checkSafe(text_size, 1);
            if (text_size != null) { checkSafe(text, text_size.get(text_size.position())); }
        }
        return nhb_ot_name_get_utf8(face, name_id, language, memAddressSafe(text_size), memAddressSafe(text));
    }

    // --- [ hb_ot_name_get_utf16 ] ---

    public static int nhb_ot_name_get_utf16(long face, int name_id, long language, long text_size, long text) {
        long __functionAddress = Functions.name_get_utf16;
        if (CHECKS) {
            check(face);
            check(language);
        }
        return invokePPPPI(face, name_id, language, text_size, text, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_name_get_utf16(@NativeType("hb_face_t *") long face, @NativeType("hb_ot_name_id_t") int name_id, @NativeType("hb_language_t") long language, @Nullable @NativeType("unsigned int *") IntBuffer text_size, @Nullable @NativeType("uint16_t *") ShortBuffer text) {
        if (CHECKS) {
            checkSafe(text_size, 1);
            if (text_size != null) { checkSafe(text, text_size.get(text_size.position())); }
        }
        return nhb_ot_name_get_utf16(face, name_id, language, memAddressSafe(text_size), memAddressSafe(text));
    }

    // --- [ hb_ot_name_get_utf32 ] ---

    public static int nhb_ot_name_get_utf32(long face, int name_id, long language, long text_size, long text) {
        long __functionAddress = Functions.name_get_utf32;
        if (CHECKS) {
            check(face);
            check(language);
        }
        return invokePPPPI(face, name_id, language, text_size, text, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_name_get_utf32(@NativeType("hb_face_t *") long face, @NativeType("hb_ot_name_id_t") int name_id, @NativeType("hb_language_t") long language, @Nullable @NativeType("unsigned int *") IntBuffer text_size, @Nullable @NativeType("uint32_t *") IntBuffer text) {
        if (CHECKS) {
            checkSafe(text_size, 1);
            if (text_size != null) { checkSafe(text, text_size.get(text_size.position())); }
        }
        return nhb_ot_name_get_utf32(face, name_id, language, memAddressSafe(text_size), memAddressSafe(text));
    }

    // --- [ hb_ot_shape_glyphs_closure ] ---

    public static void nhb_ot_shape_glyphs_closure(long font, long buffer, long features, int num_features, long glyphs) {
        long __functionAddress = Functions.shape_glyphs_closure;
        if (CHECKS) {
            check(font);
            check(buffer);
            check(glyphs);
        }
        invokePPPPV(font, buffer, features, num_features, glyphs, __functionAddress);
    }

    public static void hb_ot_shape_glyphs_closure(@NativeType("hb_font_t *") long font, @NativeType("hb_buffer_t *") long buffer, @Nullable @NativeType("hb_feature_t const *") hb_feature_t.Buffer features, @NativeType("hb_set_t *") long glyphs) {
        nhb_ot_shape_glyphs_closure(font, buffer, memAddressSafe(features), remainingSafe(features), glyphs);
    }

    // --- [ hb_ot_shape_plan_collect_lookups ] ---

    public static void hb_ot_shape_plan_collect_lookups(@NativeType("hb_shape_plan_t *") long shape_plan, @NativeType("hb_tag_t") int table_tag, @NativeType("hb_set_t *") long lookup_indexes) {
        long __functionAddress = Functions.shape_plan_collect_lookups;
        if (CHECKS) {
            check(shape_plan);
            check(lookup_indexes);
        }
        invokePPV(shape_plan, table_tag, lookup_indexes, __functionAddress);
    }

    // --- [ hb_ot_var_has_data ] ---

    @NativeType("hb_bool_t")
    public static boolean hb_ot_var_has_data(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.var_has_data;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_ot_var_get_axis_count ] ---

    @NativeType("unsigned int")
    public static int hb_ot_var_get_axis_count(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.var_get_axis_count;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress);
    }

    // --- [ hb_ot_var_get_axis_infos ] ---

    public static int nhb_ot_var_get_axis_infos(long face, int start_offset, long axes_count, long axes_array) {
        long __functionAddress = Functions.var_get_axis_infos;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, start_offset, axes_count, axes_array, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_var_get_axis_infos(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int start_offset, @Nullable @NativeType("unsigned int *") IntBuffer axes_count, @Nullable @NativeType("hb_ot_var_axis_info_t *") hb_ot_var_axis_info_t.Buffer axes_array) {
        if (CHECKS) {
            checkSafe(axes_count, 1);
            if (axes_count != null) { checkSafe(axes_array, axes_count.get(axes_count.position())); }
        }
        return nhb_ot_var_get_axis_infos(face, start_offset, memAddressSafe(axes_count), memAddressSafe(axes_array));
    }

    // --- [ hb_ot_var_find_axis_info ] ---

    public static int nhb_ot_var_find_axis_info(long face, int axis_tag, long axis_info) {
        long __functionAddress = Functions.var_find_axis_info;
        if (CHECKS) {
            check(face);
        }
        return invokePPI(face, axis_tag, axis_info, __functionAddress);
    }

    @NativeType("hb_bool_t")
    public static boolean hb_ot_var_find_axis_info(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int axis_tag, @NativeType("hb_ot_var_axis_info_t *") hb_ot_var_axis_info_t axis_info) {
        return nhb_ot_var_find_axis_info(face, axis_tag, axis_info.address()) != 0;
    }

    // --- [ hb_ot_var_get_named_instance_count ] ---

    /** Named instances. */
    @NativeType("unsigned int")
    public static int hb_ot_var_get_named_instance_count(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.var_get_named_instance_count;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress);
    }

    // --- [ hb_ot_var_named_instance_get_subfamily_name_id ] ---

    @NativeType("hb_ot_name_id_t")
    public static int hb_ot_var_named_instance_get_subfamily_name_id(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int instance_index) {
        long __functionAddress = Functions.var_named_instance_get_subfamily_name_id;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, instance_index, __functionAddress);
    }

    // --- [ hb_ot_var_named_instance_get_postscript_name_id ] ---

    @NativeType("hb_ot_name_id_t")
    public static int hb_ot_var_named_instance_get_postscript_name_id(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int instance_index) {
        long __functionAddress = Functions.var_named_instance_get_postscript_name_id;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, instance_index, __functionAddress);
    }

    // --- [ hb_ot_var_named_instance_get_design_coords ] ---

    public static int nhb_ot_var_named_instance_get_design_coords(long face, int instance_index, long coords_length, long coords) {
        long __functionAddress = Functions.var_named_instance_get_design_coords;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, instance_index, coords_length, coords, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int hb_ot_var_named_instance_get_design_coords(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int instance_index, @Nullable @NativeType("unsigned int *") IntBuffer coords_length, @Nullable @NativeType("float *") FloatBuffer coords) {
        if (CHECKS) {
            checkSafe(coords_length, 1);
            if (coords_length != null) { checkSafe(coords, coords_length.get(coords_length.position())); }
        }
        return nhb_ot_var_named_instance_get_design_coords(face, instance_index, memAddressSafe(coords_length), memAddressSafe(coords));
    }

    // --- [ hb_ot_var_normalize_variations ] ---

    /** Unsafe version of: {@link #hb_ot_var_normalize_variations var_normalize_variations} */
    public static void nhb_ot_var_normalize_variations(long face, long variations, int variations_length, long coords, int coords_length) {
        long __functionAddress = Functions.var_normalize_variations;
        if (CHECKS) {
            check(face);
        }
        invokePPPV(face, variations, variations_length, coords, coords_length, __functionAddress);
    }

    /** Conversions. */
    public static void hb_ot_var_normalize_variations(@NativeType("hb_face_t *") long face, @NativeType("hb_variation_t const *") hb_variation_t.Buffer variations, @NativeType("int *") IntBuffer coords) {
        nhb_ot_var_normalize_variations(face, variations.address(), variations.remaining(), memAddress(coords), coords.remaining());
    }

    // --- [ hb_ot_var_normalize_coords ] ---

    public static void nhb_ot_var_normalize_coords(long face, int coords_length, long design_coords, long normalized_coords) {
        long __functionAddress = Functions.var_normalize_coords;
        if (CHECKS) {
            check(face);
        }
        invokePPPV(face, coords_length, design_coords, normalized_coords, __functionAddress);
    }

    public static void hb_ot_var_normalize_coords(@NativeType("hb_face_t *") long face, @NativeType("float const *") FloatBuffer design_coords, @NativeType("int *") IntBuffer normalized_coords) {
        if (CHECKS) {
            check(normalized_coords, design_coords.remaining());
        }
        nhb_ot_var_normalize_coords(face, design_coords.remaining(), memAddress(design_coords), memAddress(normalized_coords));
    }

}