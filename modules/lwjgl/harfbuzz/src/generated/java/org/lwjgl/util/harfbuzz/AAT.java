/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class AAT {

    /** Contains the function pointers loaded from {@code HarfBuzz.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            layout_get_feature_types               = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_att_layout_get_feature_types"),
            layout_feature_type_get_name_id        = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_att_layout_feature_type_get_name_id"),
            layout_feature_type_get_selector_infos = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_att_layout_feature_type_get_selector_infos"),
            layout_has_substitution                = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_att_layout_has_substitution"),
            layout_has_positioning                 = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_att_layout_has_positioning"),
            layout_has_tracking                    = apiGetFunctionAddress(HarfBuzz.getLibrary(), "hb_att_layout_has_tracking");

    }

    public static final int
        LAYOUT_FEATURE_TYPE_INVALID                           = 0xFFFF,
        LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC                   = 0,
        LAYOUT_FEATURE_TYPE_LIGATURES                         = 1,
        LAYOUT_FEATURE_TYPE_CURSIVE_CONNECTION                = 2,
        LAYOUT_FEATURE_TYPE_LETTER_CASE                       = 3,
        LAYOUT_FEATURE_TYPE_VERTICAL_SUBSTITUTION             = 4,
        LAYOUT_FEATURE_TYPE_LINGUISTIC_REARRANGEMENT          = 5,
        LAYOUT_FEATURE_TYPE_NUMBER_SPACING                    = 6,
        LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE                  = 8,
        LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE                   = 9,
        LAYOUT_FEATURE_TYPE_VERTICAL_POSITION                 = 10,
        LAYOUT_FEATURE_TYPE_FRACTIONS                         = 11,
        LAYOUT_FEATURE_TYPE_OVERLAPPING_CHARACTERS_TYPE       = 13,
        LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS                = 14,
        LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS               = 15,
        LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE                = 16,
        LAYOUT_FEATURE_TYPE_CHARACTER_ALTERNATIVES            = 17,
        LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE            = 18,
        LAYOUT_FEATURE_TYPE_STYLE_OPTIONS                     = 19,
        LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE                   = 20,
        LAYOUT_FEATURE_TYPE_NUMBER_CASE                       = 21,
        LAYOUT_FEATURE_TYPE_TEXT_SPACING                      = 22,
        LAYOUT_FEATURE_TYPE_TRANSLITERATION                   = 23,
        LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE                   = 24,
        LAYOUT_FEATURE_TYPE_KANA_SPACING_TYPE                 = 25,
        LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE          = 26,
        LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE        = 27,
        LAYOUT_FEATURE_TYPE_RUBY_KANA                         = 28,
        LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE      = 29,
        LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE     = 30,
        LAYOUT_FEATURE_TYPE_CJK_VERTICAL_ROMAN_PLACEMENT_TYPE = 31,
        LAYOUT_FEATURE_TYPE_ITALIC_CJK_ROMAN                  = 32,
        LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT             = 33,
        LAYOUT_FEATURE_TYPE_ALTERNATE_KANA                    = 34,
        LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES            = 35,
        LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES           = 36,
        LAYOUT_FEATURE_TYPE_LOWER_CASE                        = 37,
        LAYOUT_FEATURE_TYPE_UPPER_CASE                        = 38,
        LAYOUT_FEATURE_TYPE_LANGUAGE_TAG_TYPE                 = 39,
        LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE            = 103;

    public static final int
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INVALID                         = 0xFFFF,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALL_TYPE_FEATURES_ON            = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALL_TYPE_FEATURES_OFF           = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_REQUIRED_LIGATURES_ON           = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_REQUIRED_LIGATURES_OFF          = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_COMMON_LIGATURES_ON             = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_COMMON_LIGATURES_OFF            = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_RARE_LIGATURES_ON               = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_RARE_LIGATURES_OFF              = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LOGOS_ON                        = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LOGOS_OFF                       = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_REBUS_PICTURES_ON               = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_REBUS_PICTURES_OFF              = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DIPHTHONG_LIGATURES_ON          = 10,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DIPHTHONG_LIGATURES_OFF         = 11,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SQUARED_LIGATURES_ON            = 12,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SQUARED_LIGATURES_OFF           = 13,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ABBREV_SQUARED_LIGATURES_ON     = 14,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ABBREV_SQUARED_LIGATURES_OFF    = 15,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SYMBOL_LIGATURES_ON             = 16,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SYMBOL_LIGATURES_OFF            = 17,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CONTEXTUAL_LIGATURES_ON         = 18,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CONTEXTUAL_LIGATURES_OFF        = 19,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HISTORICAL_LIGATURES_ON         = 20,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HISTORICAL_LIGATURES_OFF        = 21,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_UNCONNECTED                     = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PARTIALLY_CONNECTED             = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CURSIVE                         = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_UPPER_AND_LOWER_CASE            = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALL_CAPS                        = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALL_LOWER_CASE                  = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SMALL_CAPS                      = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INITIAL_CAPS                    = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INITIAL_CAPS_AND_SMALL_CAPS     = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SUBSTITUTE_VERTICAL_FORMS_ON    = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SUBSTITUTE_VERTICAL_FORMS_OFF   = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LINGUISTIC_REARRANGEMENT_ON     = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LINGUISTIC_REARRANGEMENT_OFF    = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_MONOSPACED_NUMBERS              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PROPORTIONAL_NUMBERS            = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_THIRD_WIDTH_NUMBERS             = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_QUARTER_WIDTH_NUMBERS           = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_WORD_INITIAL_SWASHES_ON         = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_WORD_INITIAL_SWASHES_OFF        = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_WORD_FINAL_SWASHES_ON           = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_WORD_FINAL_SWASHES_OFF          = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LINE_INITIAL_SWASHES_ON         = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LINE_INITIAL_SWASHES_OFF        = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LINE_FINAL_SWASHES_ON           = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LINE_FINAL_SWASHES_OFF          = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NON_FINAL_SWASHES_ON            = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NON_FINAL_SWASHES_OFF           = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SHOW_DIACRITICS                 = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HIDE_DIACRITICS                 = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DECOMPOSE_DIACRITICS            = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NORMAL_POSITION                 = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SUPERIORS                       = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INFERIORS                       = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ORDINALS                        = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SCIENTIFIC_INFERIORS            = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_FRACTIONS                    = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_VERTICAL_FRACTIONS              = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DIAGONAL_FRACTIONS              = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PREVENT_OVERLAP_ON              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PREVENT_OVERLAP_OFF             = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HYPHENS_TO_EM_DASH_ON           = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HYPHENS_TO_EM_DASH_OFF          = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HYPHEN_TO_EN_DASH_ON            = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HYPHEN_TO_EN_DASH_OFF           = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SLASHED_ZERO_ON                 = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SLASHED_ZERO_OFF                = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_FORM_INTERROBANG_ON             = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_FORM_INTERROBANG_OFF            = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SMART_QUOTES_ON                 = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SMART_QUOTES_OFF                = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PERIODS_TO_ELLIPSIS_ON          = 10,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PERIODS_TO_ELLIPSIS_OFF         = 11,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HYPHEN_TO_MINUS_ON              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HYPHEN_TO_MINUS_OFF             = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ASTERISK_TO_MULTIPLY_ON         = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ASTERISK_TO_MULTIPLY_OFF        = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SLASH_TO_DIVIDE_ON              = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SLASH_TO_DIVIDE_OFF             = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INEQUALITY_LIGATURES_ON         = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INEQUALITY_LIGATURES_OFF        = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_EXPONENTS_ON                    = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_EXPONENTS_OFF                   = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_MATHEMATICAL_GREEK_ON           = 10,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_MATHEMATICAL_GREEK_OFF          = 11,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_ORNAMENTS                    = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DINGBATS                        = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PI_CHARACTERS                   = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_FLEURONS                        = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DECORATIVE_BORDERS              = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INTERNATIONAL_SYMBOLS           = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_MATH_SYMBOLS                    = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_ALTERNATES                   = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DESIGN_LEVEL1                   = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DESIGN_LEVEL2                   = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DESIGN_LEVEL3                   = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DESIGN_LEVEL4                   = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DESIGN_LEVEL5                   = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_STYLE_OPTIONS                = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DISPLAY_TEXT                    = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ENGRAVED_TEXT                   = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ILLUMINATED_CAPS                = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TITLING_CAPS                    = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TALL_CAPS                       = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_CHARACTERS          = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SIMPLIFIED_CHARACTERS           = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_JIS1978_CHARACTERS              = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_JIS1983_CHARACTERS              = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_JIS1990_CHARACTERS              = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_ALT_ONE             = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_ALT_TWO             = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_ALT_THREE           = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_ALT_FOUR            = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_ALT_FIVE            = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_EXPERT_CHARACTERS               = 10,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_JIS2004_CHARACTERS              = 11,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HOJO_CHARACTERS                 = 12,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NLCCHARACTERS                   = 13,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRADITIONAL_NAMES_CHARACTERS    = 14,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LOWER_CASE_NUMBERS              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_UPPER_CASE_NUMBERS              = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PROPORTIONAL_TEXT               = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_MONOSPACED_TEXT                 = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HALF_WIDTH_TEXT                 = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_THIRD_WIDTH_TEXT                = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_QUARTER_WIDTH_TEXT              = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALT_PROPORTIONAL_TEXT           = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALT_HALF_WIDTH_TEXT             = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_TRANSLITERATION              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HANJA_TO_HANGUL                 = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HIRAGANA_TO_KATAKANA            = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_KATAKANA_TO_HIRAGANA            = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_KANA_TO_ROMANIZATION            = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ROMANIZATION_TO_HIRAGANA        = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ROMANIZATION_TO_KATAKANA        = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HANJA_TO_HANGUL_ALT_ONE         = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HANJA_TO_HANGUL_ALT_TWO         = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HANJA_TO_HANGUL_ALT_THREE       = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_ANNOTATION                   = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_BOX_ANNOTATION                  = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ROUNDED_BOX_ANNOTATION          = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CIRCLE_ANNOTATION               = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INVERTED_CIRCLE_ANNOTATION      = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PARENTHESIS_ANNOTATION          = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PERIOD_ANNOTATION               = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ROMAN_NUMERAL_ANNOTATION        = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DIAMOND_ANNOTATION              = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INVERTED_BOX_ANNOTATION         = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_INVERTED_ROUNDED_BOX_ANNOTATION = 10,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_FULL_WIDTH_KANA                 = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PROPORTIONAL_KANA               = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_FULL_WIDTH_IDEOGRAPHS           = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PROPORTIONAL_IDEOGRAPHS         = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HALF_WIDTH_IDEOGRAPHS           = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CANONICAL_COMPOSITION_ON        = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CANONICAL_COMPOSITION_OFF       = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_COMPATIBILITY_COMPOSITION_ON    = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_COMPATIBILITY_COMPOSITION_OFF   = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRANSCODING_COMPOSITION_ON      = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_TRANSCODING_COMPOSITION_OFF     = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_RUBY_KANA                    = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA                       = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA_ON                    = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA_OFF                   = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_CJK_SYMBOL_ALTERNATIVES      = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_SYMBOL_ALT_ONE              = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_SYMBOL_ALT_TWO              = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_SYMBOL_ALT_THREE            = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_SYMBOL_ALT_FOUR             = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_SYMBOL_ALT_FIVE             = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_IDEOGRAPHIC_ALTERNATIVES     = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_IDEOGRAPHIC_ALT_ONE             = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_IDEOGRAPHIC_ALT_TWO             = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_IDEOGRAPHIC_ALT_THREE           = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_IDEOGRAPHIC_ALT_FOUR            = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_IDEOGRAPHIC_ALT_FIVE            = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_VERTICAL_ROMAN_CENTERED     = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_VERTICAL_ROMAN_HBASELINE    = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_CJK_ITALIC_ROMAN             = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN                = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN_ON             = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN_OFF            = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CASE_SENSITIVE_LAYOUT_ON        = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CASE_SENSITIVE_LAYOUT_OFF       = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CASE_SENSITIVE_SPACING_ON       = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CASE_SENSITIVE_SPACING_OFF      = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALTERNATE_HORIZ_KANA_ON         = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALTERNATE_HORIZ_KANA_OFF        = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALTERNATE_VERT_KANA_ON          = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_ALTERNATE_VERT_KANA_OFF         = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_NO_STYLISTIC_ALTERNATES         = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_ONE_ON            = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_ONE_OFF           = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TWO_ON            = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TWO_OFF           = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_THREE_ON          = 6,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_THREE_OFF         = 7,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FOUR_ON           = 8,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FOUR_OFF          = 9,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FIVE_ON           = 10,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FIVE_OFF          = 11,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SIX_ON            = 12,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SIX_OFF           = 13,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SEVEN_ON          = 14,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SEVEN_OFF         = 15,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_EIGHT_ON          = 16,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_EIGHT_OFF         = 17,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_NINE_ON           = 18,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_NINE_OFF          = 19,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TEN_ON            = 20,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TEN_OFF           = 21,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_ELEVEN_ON         = 22,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_ELEVEN_OFF        = 23,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TWELVE_ON         = 24,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TWELVE_OFF        = 25,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_THIRTEEN_ON       = 26,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_THIRTEEN_OFF      = 27,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FOURTEEN_ON       = 28,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FOURTEEN_OFF      = 29,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FIFTEEN_ON        = 30,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_FIFTEEN_OFF       = 31,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SIXTEEN_ON        = 32,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SIXTEEN_OFF       = 33,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SEVENTEEN_ON      = 34,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_SEVENTEEN_OFF     = 35,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_EIGHTEEN_ON       = 36,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_EIGHTEEN_OFF      = 37,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_NINETEEN_ON       = 38,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_NINETEEN_OFF      = 39,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TWENTY_ON         = 40,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_STYLISTIC_ALT_TWENTY_OFF        = 41,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CONTEXTUAL_ALTERNATES_ON        = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CONTEXTUAL_ALTERNATES_OFF       = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SWASH_ALTERNATES_ON             = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_SWASH_ALTERNATES_OFF            = 3,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CONTEXTUAL_SWASH_ALTERNATES_ON  = 4,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_CONTEXTUAL_SWASH_ALTERNATES_OFF = 5,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DEFAULT_LOWER_CASE              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LOWER_CASE_SMALL_CAPS           = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_LOWER_CASE_PETITE_CAPS          = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DEFAULT_UPPER_CASE              = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_UPPER_CASE_SMALL_CAPS           = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_UPPER_CASE_PETITE_CAPS          = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_HALF_WIDTH_CJK_ROMAN            = 0,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_PROPORTIONAL_CJK_ROMAN          = 1,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_DEFAULT_CJK_ROMAN               = 2,
        HB_ATT_LAYOUT_FEATURE_SELECTOR_FULL_WIDTH_CJK_ROMAN            = 3;

    public static final int HB_ATT_LAYOUT_NO_SELECTOR_INDEX = 0xFFFF;

    protected AAT() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_att_layout_get_feature_types ] ---

    /** {@code unsigned int hb_att_layout_get_feature_types(hb_face_t * face, unsigned int start_offset, unsigned int * feature_count, hb_aat_layout_feature_type_t * features)} */
    public static int nhb_att_layout_get_feature_types(long face, int start_offset, long feature_count, long features) {
        long __functionAddress = Functions.layout_get_feature_types;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, start_offset, feature_count, features, __functionAddress);
    }

    /** {@code unsigned int hb_att_layout_get_feature_types(hb_face_t * face, unsigned int start_offset, unsigned int * feature_count, hb_aat_layout_feature_type_t * features)} */
    @NativeType("unsigned int")
    public static int hb_att_layout_get_feature_types(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int start_offset, @NativeType("unsigned int *") @Nullable IntBuffer feature_count, @NativeType("hb_aat_layout_feature_type_t *") @Nullable IntBuffer features) {
        if (CHECKS) {
            checkSafe(feature_count, 1);
            if (feature_count != null) { checkSafe(features, feature_count.get(feature_count.position())); }
        }
        return nhb_att_layout_get_feature_types(face, start_offset, memAddressSafe(feature_count), memAddressSafe(features));
    }

    // --- [ hb_att_layout_feature_type_get_name_id ] ---

    /** {@code hb_ot_name_id_t hb_att_layout_feature_type_get_name_id(hb_face_t * face, hb_aat_layout_feature_type_t feature_type)} */
    @NativeType("hb_ot_name_id_t")
    public static int hb_att_layout_feature_type_get_name_id(@NativeType("hb_face_t *") long face, @NativeType("hb_aat_layout_feature_type_t") int feature_type) {
        long __functionAddress = Functions.layout_feature_type_get_name_id;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, feature_type, __functionAddress);
    }

    // --- [ hb_att_layout_feature_type_get_selector_infos ] ---

    /** {@code unsigned int hb_att_layout_feature_type_get_selector_infos(hb_face_t * face, hb_aat_layout_feature_type_t feature_type, unsigned int start_offset, unsigned int * selector_count, hb_aat_layout_feature_selector_info_t * selectors, unsigned int * default_index)} */
    public static int nhb_att_layout_feature_type_get_selector_infos(long face, int feature_type, int start_offset, long selector_count, long selectors, long default_index) {
        long __functionAddress = Functions.layout_feature_type_get_selector_infos;
        if (CHECKS) {
            check(face);
        }
        return invokePPPPI(face, feature_type, start_offset, selector_count, selectors, default_index, __functionAddress);
    }

    /** {@code unsigned int hb_att_layout_feature_type_get_selector_infos(hb_face_t * face, hb_aat_layout_feature_type_t feature_type, unsigned int start_offset, unsigned int * selector_count, hb_aat_layout_feature_selector_info_t * selectors, unsigned int * default_index)} */
    @NativeType("unsigned int")
    public static int hb_att_layout_feature_type_get_selector_infos(@NativeType("hb_face_t *") long face, @NativeType("hb_aat_layout_feature_type_t") int feature_type, @NativeType("unsigned int") int start_offset, @NativeType("unsigned int *") @Nullable IntBuffer selector_count, @NativeType("hb_aat_layout_feature_selector_info_t *") hb_aat_layout_feature_selector_info_t.@Nullable Buffer selectors, @NativeType("unsigned int *") @Nullable IntBuffer default_index) {
        if (CHECKS) {
            checkSafe(selector_count, 1);
            if (selector_count != null) { checkSafe(selectors, selector_count.get(selector_count.position())); }
            checkSafe(default_index, 1);
        }
        return nhb_att_layout_feature_type_get_selector_infos(face, feature_type, start_offset, memAddressSafe(selector_count), memAddressSafe(selectors), memAddressSafe(default_index));
    }

    // --- [ hb_att_layout_has_substitution ] ---

    /** {@code hb_bool_t hb_att_layout_has_substitution(hb_face_t * face)} */
    @NativeType("hb_bool_t")
    public static boolean hb_att_layout_has_substitution(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.layout_has_substitution;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_att_layout_has_positioning ] ---

    /** {@code hb_bool_t hb_att_layout_has_positioning(hb_face_t * face)} */
    @NativeType("hb_bool_t")
    public static boolean hb_att_layout_has_positioning(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.layout_has_positioning;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_att_layout_has_tracking ] ---

    /** {@code hb_bool_t hb_att_layout_has_tracking(hb_face_t * face)} */
    @NativeType("hb_bool_t")
    public static boolean hb_att_layout_has_tracking(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.layout_has_tracking;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

}