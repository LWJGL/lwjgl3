/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz.templates

import org.lwjgl.generator.*
import harfbuzz.*

val hb = "HarfBuzz".nativeClass(Module.HARFBUZZ, prefix = "HB", prefixMethod = "hb_", binding = HARFBUZZ_BINDING) {
    // hb-common.h

    IntConstant(
        "CODEPOINT_INVALID".."-1"
    )

    IntConstant(
        "FEATURE_GLOBAL_START".."0",
        "FEATURE_GLOBAL_END".."-1"
    )

    customMethod("""
    public static int HB_TAG(int c1, int c2, int c3, int c4) {
        return ((c1 & 0xFF) << 24) | ((c2 & 0xFF)<< 16) | ((c3 & 0xFF) << 8) | (c4 & 0xFF);
    }
    """)

    IntConstant("TAG_NONE".."HB_TAG('\\u0000', '\\u0000', '\\u0000', '\\u0000')")
    IntConstant("TAG_MAX".."HB_TAG('\\u00FF', '\\u00FF', '\\u00FF', '\\u00FF')")
    IntConstant("TAG_MAX_SIGNED".."HB_TAG('\\u007F', '\\u00FF', '\\u00FF', '\\u00FF')")

    EnumConstant(
        "DIRECTION_INVALID".enum("0"),
        "DIRECTION_LTR".enum("4"),
        "DIRECTION_RTL".enum,
        "DIRECTION_TTB".enum,
        "DIRECTION_BTT".enum
    )

    EnumConstant(
        "SCRIPT_COMMON".enum("HB_TAG ('Z','y','y','y')"),
        "SCRIPT_INHERITED".enum("HB_TAG ('Z','i','n','h')"),
        "SCRIPT_UNKNOWN".enum("HB_TAG ('Z','z','z','z')"),

        "SCRIPT_ARABIC".enum("HB_TAG ('A','r','a','b')"),
        "SCRIPT_ARMENIAN".enum("HB_TAG ('A','r','m','n')"),
        "SCRIPT_BENGALI".enum("HB_TAG ('B','e','n','g')"),
        "SCRIPT_CYRILLIC".enum("HB_TAG ('C','y','r','l')"),
        "SCRIPT_DEVANAGARI".enum("HB_TAG ('D','e','v','a')"),
        "SCRIPT_GEORGIAN".enum("HB_TAG ('G','e','o','r')"),
        "SCRIPT_GREEK".enum("HB_TAG ('G','r','e','k')"),
        "SCRIPT_GUJARATI".enum("HB_TAG ('G','u','j','r')"),
        "SCRIPT_GURMUKHI".enum("HB_TAG ('G','u','r','u')"),
        "SCRIPT_HANGUL".enum("HB_TAG ('H','a','n','g')"),
        "SCRIPT_HAN".enum("HB_TAG ('H','a','n','i')"),
        "SCRIPT_HEBREW".enum("HB_TAG ('H','e','b','r')"),
        "SCRIPT_HIRAGANA".enum("HB_TAG ('H','i','r','a')"),
        "SCRIPT_KANNADA".enum("HB_TAG ('K','n','d','a')"),
        "SCRIPT_KATAKANA".enum("HB_TAG ('K','a','n','a')"),
        "SCRIPT_LAO".enum("HB_TAG ('L','a','o','o')"),
        "SCRIPT_LATIN".enum("HB_TAG ('L','a','t','n')"),
        "SCRIPT_MALAYALAM".enum("HB_TAG ('M','l','y','m')"),
        "SCRIPT_ORIYA".enum("HB_TAG ('O','r','y','a')"),
        "SCRIPT_TAMIL".enum("HB_TAG ('T','a','m','l')"),
        "SCRIPT_TELUGU".enum("HB_TAG ('T','e','l','u')"),
        "SCRIPT_THAI".enum("HB_TAG ('T','h','a','i')"),

        "SCRIPT_TIBETAN".enum("HB_TAG ('T','i','b','t')"),

        "SCRIPT_BOPOMOFO".enum("HB_TAG ('B','o','p','o')"),
        "SCRIPT_BRAILLE".enum("HB_TAG ('B','r','a','i')"),
        "SCRIPT_CANADIAN_SYLLABICS".enum("HB_TAG ('C','a','n','s')"),
        "SCRIPT_CHEROKEE".enum("HB_TAG ('C','h','e','r')"),
        "SCRIPT_ETHIOPIC".enum("HB_TAG ('E','t','h','i')"),
        "SCRIPT_KHMER".enum("HB_TAG ('K','h','m','r')"),
        "SCRIPT_MONGOLIAN".enum("HB_TAG ('M','o','n','g')"),
        "SCRIPT_MYANMAR".enum("HB_TAG ('M','y','m','r')"),
        "SCRIPT_OGHAM".enum("HB_TAG ('O','g','a','m')"),
        "SCRIPT_RUNIC".enum("HB_TAG ('R','u','n','r')"),
        "SCRIPT_SINHALA".enum("HB_TAG ('S','i','n','h')"),
        "SCRIPT_SYRIAC".enum("HB_TAG ('S','y','r','c')"),
        "SCRIPT_THAANA".enum("HB_TAG ('T','h','a','a')"),
        "SCRIPT_YI".enum("HB_TAG ('Y','i','i','i')"),

        "SCRIPT_DESERET".enum("HB_TAG ('D','s','r','t')"),
        "SCRIPT_GOTHIC".enum("HB_TAG ('G','o','t','h')"),
        "SCRIPT_OLD_ITALIC".enum("HB_TAG ('I','t','a','l')"),

        "SCRIPT_BUHID".enum("HB_TAG ('B','u','h','d')"),
        "SCRIPT_HANUNOO".enum("HB_TAG ('H','a','n','o')"),
        "SCRIPT_TAGALOG".enum("HB_TAG ('T','g','l','g')"),
        "SCRIPT_TAGBANWA".enum("HB_TAG ('T','a','g','b')"),

        "SCRIPT_CYPRIOT".enum("HB_TAG ('C','p','r','t')"),
        "SCRIPT_LIMBU".enum("HB_TAG ('L','i','m','b')"),
        "SCRIPT_LINEAR_B".enum("HB_TAG ('L','i','n','b')"),
        "SCRIPT_OSMANYA".enum("HB_TAG ('O','s','m','a')"),
        "SCRIPT_SHAVIAN".enum("HB_TAG ('S','h','a','w')"),
        "SCRIPT_TAI_LE".enum("HB_TAG ('T','a','l','e')"),
        "SCRIPT_UGARITIC".enum("HB_TAG ('U','g','a','r')"),

        "SCRIPT_BUGINESE".enum("HB_TAG ('B','u','g','i')"),
        "SCRIPT_COPTIC".enum("HB_TAG ('C','o','p','t')"),
        "SCRIPT_GLAGOLITIC".enum("HB_TAG ('G','l','a','g')"),
        "SCRIPT_KHAROSHTHI".enum("HB_TAG ('K','h','a','r')"),
        "SCRIPT_NEW_TAI_LUE".enum("HB_TAG ('T','a','l','u')"),
        "SCRIPT_OLD_PERSIAN".enum("HB_TAG ('X','p','e','o')"),
        "SCRIPT_SYLOTI_NAGRI".enum("HB_TAG ('S','y','l','o')"),
        "SCRIPT_TIFINAGH".enum("HB_TAG ('T','f','n','g')"),

        "SCRIPT_BALINESE".enum("HB_TAG ('B','a','l','i')"),
        "SCRIPT_CUNEIFORM".enum("HB_TAG ('X','s','u','x')"),
        "SCRIPT_NKO".enum("HB_TAG ('N','k','o','o')"),
        "SCRIPT_PHAGS_PA".enum("HB_TAG ('P','h','a','g')"),
        "SCRIPT_PHOENICIAN".enum("HB_TAG ('P','h','n','x')"),

        "SCRIPT_CARIAN".enum("HB_TAG ('C','a','r','i')"),
        "SCRIPT_CHAM".enum("HB_TAG ('C','h','a','m')"),
        "SCRIPT_KAYAH_LI".enum("HB_TAG ('K','a','l','i')"),
        "SCRIPT_LEPCHA".enum("HB_TAG ('L','e','p','c')"),
        "SCRIPT_LYCIAN".enum("HB_TAG ('L','y','c','i')"),
        "SCRIPT_LYDIAN".enum("HB_TAG ('L','y','d','i')"),
        "SCRIPT_OL_CHIKI".enum("HB_TAG ('O','l','c','k')"),
        "SCRIPT_REJANG".enum("HB_TAG ('R','j','n','g')"),
        "SCRIPT_SAURASHTRA".enum("HB_TAG ('S','a','u','r')"),
        "SCRIPT_SUNDANESE".enum("HB_TAG ('S','u','n','d')"),
        "SCRIPT_VAI".enum("HB_TAG ('V','a','i','i')"),

        "SCRIPT_AVESTAN".enum("HB_TAG ('A','v','s','t')"),
        "SCRIPT_BAMUM".enum("HB_TAG ('B','a','m','u')"),
        "SCRIPT_EGYPTIAN_HIEROGLYPHS".enum("HB_TAG ('E','g','y','p')"),
        "SCRIPT_IMPERIAL_ARAMAIC".enum("HB_TAG ('A','r','m','i')"),
        "SCRIPT_INSCRIPTIONAL_PAHLAVI".enum("HB_TAG ('P','h','l','i')"),
        "SCRIPT_INSCRIPTIONAL_PARTHIAN".enum("HB_TAG ('P','r','t','i')"),
        "SCRIPT_JAVANESE".enum("HB_TAG ('J','a','v','a')"),
        "SCRIPT_KAITHI".enum("HB_TAG ('K','t','h','i')"),
        "SCRIPT_LISU".enum("HB_TAG ('L','i','s','u')"),
        "SCRIPT_MEETEI_MAYEK".enum("HB_TAG ('M','t','e','i')"),
        "SCRIPT_OLD_SOUTH_ARABIAN".enum("HB_TAG ('S','a','r','b')"),
        "SCRIPT_OLD_TURKIC".enum("HB_TAG ('O','r','k','h')"),
        "SCRIPT_SAMARITAN".enum("HB_TAG ('S','a','m','r')"),
        "SCRIPT_TAI_THAM".enum("HB_TAG ('L','a','n','a')"),
        "SCRIPT_TAI_VIET".enum("HB_TAG ('T','a','v','t')"),

        "SCRIPT_BATAK".enum("HB_TAG ('B','a','t','k')"),
        "SCRIPT_BRAHMI".enum("HB_TAG ('B','r','a','h')"),
        "SCRIPT_MANDAIC".enum("HB_TAG ('M','a','n','d')"),

        "SCRIPT_CHAKMA".enum("HB_TAG ('C','a','k','m')"),
        "SCRIPT_MEROITIC_CURSIVE".enum("HB_TAG ('M','e','r','c')"),
        "SCRIPT_MEROITIC_HIEROGLYPHS".enum("HB_TAG ('M','e','r','o')"),
        "SCRIPT_MIAO".enum("HB_TAG ('P','l','r','d')"),
        "SCRIPT_SHARADA".enum("HB_TAG ('S','h','r','d')"),
        "SCRIPT_SORA_SOMPENG".enum("HB_TAG ('S','o','r','a')"),
        "SCRIPT_TAKRI".enum("HB_TAG ('T','a','k','r')"),

        "SCRIPT_BASSA_VAH".enum("HB_TAG ('B','a','s','s')"),
        "SCRIPT_CAUCASIAN_ALBANIAN".enum("HB_TAG ('A','g','h','b')"),
        "SCRIPT_DUPLOYAN".enum("HB_TAG ('D','u','p','l')"),
        "SCRIPT_ELBASAN".enum("HB_TAG ('E','l','b','a')"),
        "SCRIPT_GRANTHA".enum("HB_TAG ('G','r','a','n')"),
        "SCRIPT_KHOJKI".enum("HB_TAG ('K','h','o','j')"),
        "SCRIPT_KHUDAWADI".enum("HB_TAG ('S','i','n','d')"),
        "SCRIPT_LINEAR_A".enum("HB_TAG ('L','i','n','a')"),
        "SCRIPT_MAHAJANI".enum("HB_TAG ('M','a','h','j')"),
        "SCRIPT_MANICHAEAN".enum("HB_TAG ('M','a','n','i')"),
        "SCRIPT_MENDE_KIKAKUI".enum("HB_TAG ('M','e','n','d')"),
        "SCRIPT_MODI".enum("HB_TAG ('M','o','d','i')"),
        "SCRIPT_MRO".enum("HB_TAG ('M','r','o','o')"),
        "SCRIPT_NABATAEAN".enum("HB_TAG ('N','b','a','t')"),
        "SCRIPT_OLD_NORTH_ARABIAN".enum("HB_TAG ('N','a','r','b')"),
        "SCRIPT_OLD_PERMIC".enum("HB_TAG ('P','e','r','m')"),
        "SCRIPT_PAHAWH_HMONG".enum("HB_TAG ('H','m','n','g')"),
        "SCRIPT_PALMYRENE".enum("HB_TAG ('P','a','l','m')"),
        "SCRIPT_PAU_CIN_HAU".enum("HB_TAG ('P','a','u','c')"),
        "SCRIPT_PSALTER_PAHLAVI".enum("HB_TAG ('P','h','l','p')"),
        "SCRIPT_SIDDHAM".enum("HB_TAG ('S','i','d','d')"),
        "SCRIPT_TIRHUTA".enum("HB_TAG ('T','i','r','h')"),
        "SCRIPT_WARANG_CITI".enum("HB_TAG ('W','a','r','a')"),

        "SCRIPT_AHOM".enum("HB_TAG ('A','h','o','m')"),
        "SCRIPT_ANATOLIAN_HIEROGLYPHS".enum("HB_TAG ('H','l','u','w')"),
        "SCRIPT_HATRAN".enum("HB_TAG ('H','a','t','r')"),
        "SCRIPT_MULTANI".enum("HB_TAG ('M','u','l','t')"),
        "SCRIPT_OLD_HUNGARIAN".enum("HB_TAG ('H','u','n','g')"),
        "SCRIPT_SIGNWRITING".enum("HB_TAG ('S','g','n','w')"),

        "SCRIPT_ADLAM".enum("HB_TAG ('A','d','l','m')"),
        "SCRIPT_BHAIKSUKI".enum("HB_TAG ('B','h','k','s')"),
        "SCRIPT_MARCHEN".enum("HB_TAG ('M','a','r','c')"),
        "SCRIPT_OSAGE".enum("HB_TAG ('O','s','g','e')"),
        "SCRIPT_TANGUT".enum("HB_TAG ('T','a','n','g')"),
        "SCRIPT_NEWA".enum("HB_TAG ('N','e','w','a')"),

        "SCRIPT_MASARAM_GONDI".enum("HB_TAG ('G','o','n','m')"),
        "SCRIPT_NUSHU".enum("HB_TAG ('N','s','h','u')"),
        "SCRIPT_SOYOMBO".enum("HB_TAG ('S','o','y','o')"),
        "SCRIPT_ZANABAZAR_SQUARE".enum("HB_TAG ('Z','a','n','b')"),

        "SCRIPT_DOGRA".enum("HB_TAG ('D','o','g','r')"),
        "SCRIPT_GUNJALA_GONDI".enum("HB_TAG ('G','o','n','g')"),
        "SCRIPT_HANIFI_ROHINGYA".enum("HB_TAG ('R','o','h','g')"),
        "SCRIPT_MAKASAR".enum("HB_TAG ('M','a','k','a')"),
        "SCRIPT_MEDEFAIDRIN".enum("HB_TAG ('M','e','d','f')"),
        "SCRIPT_OLD_SOGDIAN".enum("HB_TAG ('S','o','g','o')"),
        "SCRIPT_SOGDIAN".enum("HB_TAG ('S','o','g','d')"),

        "SCRIPT_ELYMAIC".enum("HB_TAG ('E','l','y','m')"),
        "SCRIPT_NANDINAGARI".enum("HB_TAG ('N','a','n','d')"),
        "SCRIPT_NYIAKENG_PUACHUE_HMONG".enum("HB_TAG ('H','m','n','p')"),
        "SCRIPT_WANCHO".enum("HB_TAG ('W','c','h','o')"),

        "SCRIPT_CHORASMIAN".enum("HB_TAG ('C','h','r','s')"),
        "SCRIPT_DIVES_AKURU".enum("HB_TAG ('D','i','a','k')"),
        "SCRIPT_KHITAN_SMALL_SCRIPT".enum("HB_TAG ('K','i','t','s')"),
        "SCRIPT_YEZIDI".enum("HB_TAG ('Y','e','z','i')"),

        "SCRIPT_CYPRO_MINOAN".enum("HB_TAG ('C','p','m','n')"),
        "SCRIPT_OLD_UYGHUR".enum("HB_TAG ('O','u','g','r')"),
        "SCRIPT_TANGSA".enum("HB_TAG ('T','n','s','a')"),
        "SCRIPT_TOTO".enum("HB_TAG ('T','o','t','o')"),
        "SCRIPT_VITHKUQI".enum("HB_TAG ('V','i','t','h')"),

        "SCRIPT_MATH".enum("HB_TAG ('Z','m','t','h')"),

        "SCRIPT_KAWI".enum("HB_TAG ('K','a','w','i')"),
        "SCRIPT_NAG_MUNDARI".enum("HB_TAG ('N','a','g','m')"),

        "SCRIPT_GARAY".enum("HB_TAG ('G','a','r','a')"),
        "SCRIPT_GURUNG_KHEMA".enum("HB_TAG ('G','u','k','h')"),
        "SCRIPT_KIRAT_RAI".enum("HB_TAG ('K','r','a','i')"),
        "SCRIPT_OL_ONAL".enum("HB_TAG ('O','n','a','o')"),
        "SCRIPT_SUNUWAR".enum("HB_TAG ('S','u','n','u')"),
        "SCRIPT_TODHRI".enum("HB_TAG ('T','o','d','r')"),
        "SCRIPT_TULU_TIGALARI".enum("HB_TAG ('T','u','t','g')"),

        "SCRIPT_BERIA_ERFE".enum("HB_TAG('B','e','r','f')"),
        "SCRIPT_SIDETIC".enum("HB_TAG ('S','i','d','t')"),
        "SCRIPT_TAI_YO".enum("HB_TAG ('T','a','y','o')"),
        "SCRIPT_TOLONG_SIKI".enum("HB_TAG ('T','o','l','s')"),

        "SCRIPT_INVALID".enum("HB_TAG_NONE")
    )

    hb_tag_t(
        "tag_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len")
    )

    void(
        "tag_to_string",

        hb_tag_t("tag"),
        Check(4)..charASCII.p("buf")
    )

    hb_direction_t(
        "direction_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len")
    )

    charASCII.const.p(
        "direction_to_string",

        hb_direction_t("direction")
    )

    customMethod("""
    /** Tests whether a text direction is valid. */
    public static boolean HB_DIRECTION_IS_VALID(@NativeType("hb_direction_t") int dir) {
        return (dir & ~3) == 4;
    }

    /** Tests whether a text direction is horizontal. Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_HORIZONTAL(@NativeType("hb_direction_t") int dir) {
        return (dir & ~1) == 4;
    }

    /** Tests whether a text direction is vertical. Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_VERTICAL(@NativeType("hb_direction_t") int dir) {
        return (dir & ~1) == 6;
    }

    /** Tests whether a text direction moves forward (from left to right, or from top to bottom). Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_FORWARD(@NativeType("hb_direction_t") int dir) {
        return (dir & ~2) == 4;
    }

    /** Tests whether a text direction moves backward (from right to left, or from bottom to top). Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_BACKWARD(@NativeType("hb_direction_t") int dir)	{
        return (dir & ~2) == 5;
    }

    /** Reverses a text direction. Requires that the direction be valid. */
    @NativeType("hb_direction_t")
    public static int HB_DIRECTION_REVERSE(@NativeType("hb_direction_t") int dir)	{
        return dir ^ 1;
    }
    """)

    hb_language_t(
        "language_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len")
    )

    charASCII.const.p(
        "language_to_string",

        hb_language_t("language")
    )

    IntConstant("LANGUAGE_INVALID".."0")

    hb_language_t(
        "language_get_default",

        void()
    )

    hb_bool_t(
        "language_matches",

        hb_language_t("language"),
        hb_language_t("specific")
    )

    hb_script_t(
        "script_from_iso15924_tag",

        hb_tag_t("tag")
    )

    hb_script_t(
        "script_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len")
    )

    hb_tag_t(
        "script_to_iso15924_tag",

        hb_script_t("script")
    )

    hb_direction_t(
        "script_get_horizontal_direction",

        hb_script_t("script")
    )

    hb_bool_t(
        "feature_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len"),
        hb_feature_t.p("feature")
    )

    void(
        "feature_to_string",

        hb_feature_t.p("feature"),
        char.p("buf"),
        AutoSize("buf")..unsigned_int("size")
    )

    hb_bool_t(
        "variation_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len"),
        hb_variation_t.p("variation")
    )

    void(
        "variation_to_string",

        hb_variation_t.p("variation"),
        char.p("buf"),
        AutoSize("buf")..unsigned_int("size")
    )

    customMethod("""
    public static int HB_COLOR(int b, int g, int r, int a) {
        return HB_TAG(b, g, r, a);
    }
    """)

    uint8_t(
        "color_get_alpha",

        hb_color_t("color")
    )

    uint8_t(
        "color_get_red",

        hb_color_t("color")
    )

    uint8_t(
        "color_get_green",

        hb_color_t("color")
    )

    uint8_t(
        "color_get_blue",

        hb_color_t("color")
    )

    // hb-blob.h

    EnumConstant(
        "MEMORY_MODE_DUPLICATE".enum("0"),
        "MEMORY_MODE_READONLY".enum,
        "MEMORY_MODE_WRITABLE".enum,
        "MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE".enum
    )

    hb_blob_t.p(
        "blob_create",

        char.const.p("data"),
        AutoSize("data")..unsigned_int("length"),
        hb_memory_mode_t("mode"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_blob_t.p(
        "blob_create_or_fail",

        char.const.p("data"),
        AutoSize("data")..unsigned_int("length"),
        hb_memory_mode_t("mode"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_blob_t.p(
        "blob_create_from_file",

        charUTF8.const.p("file_name")
    )

    hb_blob_t.p(
        "blob_create_from_file_or_fail",

        charUTF8.const.p("file_name")
    )

    hb_blob_t.p(
        "blob_create_sub_blob",

        hb_blob_t.p("parent"),
        unsigned_int("offset"),
        unsigned_int("length")
    )

    hb_blob_t.p(
        "blob_copy_writable_or_fail",

        hb_blob_t.p("blob")
    )

    hb_blob_t.p(
        "blob_get_empty",

        void()
    )

    hb_blob_t.p(
        "blob_reference",

        hb_blob_t.p("blob")
    )

    void(
        "blob_destroy",

        hb_blob_t.p("blob")
    )

    hb_bool_t(
        "blob_set_user_data",

        hb_blob_t.p("blob"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "blob_get_user_data",

        hb_blob_t.const.p("blob"),
        hb_user_data_key_t.p("key")
    )

    void(
        "blob_make_immutable",

        hb_blob_t.p("blob")
    )

    hb_bool_t(
        "blob_is_immutable",

        hb_blob_t.p("blob")
    )

    unsigned_int(
        "blob_get_length",

        hb_blob_t.p("blob")
    )

    char.const.p(
        "blob_get_data",

        hb_blob_t.p("blob"),
        AutoSizeResult..Check(1)..unsigned_int.p("length")
    )

    char.p(
        "blob_get_data_writable",

        hb_blob_t.p("blob"),
        AutoSizeResult..Check(1)..unsigned_int.p("length")
    )

    // hb-buffer.h

    EnumConstant(
        "GLYPH_FLAG_UNSAFE_TO_BREAK".enum(0x00000001),
        "GLYPH_FLAG_UNSAFE_TO_CONCAT".enum(0x00000002),
        "GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL".enum(0x00000004),
        "GLYPH_FLAG_DEFINED".enum("0x00000007")
    )

    EnumConstant(
        "BUFFER_CONTENT_TYPE_INVALID".enum("0"),
        "BUFFER_CONTENT_TYPE_UNICODE".enum,
        "BUFFER_CONTENT_TYPE_GLYPHS".enum
    )

    EnumConstant(
        "BUFFER_FLAG_DEFAULT".enum(0x00000000),
        "BUFFER_FLAG_BOT".enum(0x00000001),
        "BUFFER_FLAG_EOT".enum(0x00000002),
        "BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES".enum(0x00000004),
        "BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES".enum(0x00000008),
        "BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE".enum(0x00000010),
        "BUFFER_FLAG_VERIFY".enum(0x00000020),
        "BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT".enum(0x00000040),
        "BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL".enum(0x00000080),
        "BUFFER_FLAG_DEFINED".enum(0x000000FF)
    )

    EnumConstant(
        "BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES".enum("0"),
        "BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS".enum,
        "BUFFER_CLUSTER_LEVEL_CHARACTERS".enum,
        "BUFFER_CLUSTER_LEVEL_GRAPHEMES".enum,
        "BUFFER_CLUSTER_LEVEL_DEFAULT".enum("HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES")
    )

    customMethod("""
    @NativeType("bool")
    public static boolean HB_BUFFER_CLUSTER_LEVEL_IS_MONOTONE(@NativeType("hb_buffer_cluster_level_t") int level) {
        return ((1 << level) & ((1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES) | (1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS))) != 0;
    }

    @NativeType("bool")
    public static boolean HB_BUFFER_CLUSTER_LEVEL_IS_GRAPHEMES(@NativeType("hb_buffer_cluster_level_t") int level) {
        return ((1 << level) & ((1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES) | (1 << HB_BUFFER_CLUSTER_LEVEL_GRAPHEMES))) != 0;
    }

    @NativeType("bool")
    public static boolean HB_BUFFER_CLUSTER_LEVEL_IS_CHARACTERS(@NativeType("hb_buffer_cluster_level_t") int level) {
        return ((1 << level) & ((1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS) | (1 << HB_BUFFER_CLUSTER_LEVEL_CHARACTERS))) != 0;
    }
    """)

    IntConstant(
        "BUFFER_REPLACEMENT_CODEPOINT_DEFAULT".."0xFFFD"
    )

    EnumConstant(
        "BUFFER_SERIALIZE_FLAG_DEFAULT".enum(0x00000000),
        "BUFFER_SERIALIZE_FLAG_NO_CLUSTERS".enum(0x00000001),
        "BUFFER_SERIALIZE_FLAG_NO_POSITIONS".enum(0x00000002),
        "BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES".enum(0x00000004),
        "BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS".enum(0x00000008),
        "BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS".enum(0x00000010),
        "BUFFER_SERIALIZE_FLAG_NO_ADVANCES".enum(0x00000020),
        "BUFFER_SERIALIZE_FLAG_DEFINED".enum(0x0000003F)
    )

    EnumConstant(
        "BUFFER_SERIALIZE_FORMAT_TEXT".enum("HB_TAG('T','E','X','T')"),
        "BUFFER_SERIALIZE_FORMAT_JSON".enum("HB_TAG('J','S','O','N')"),
        "BUFFER_SERIALIZE_FORMAT_INVALID".enum("HB_TAG_NONE")
    )

    EnumConstant(
        "BUFFER_DIFF_FLAG_EQUAL".enum(0x0000),
        "BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH".enum(0x0001),
        "BUFFER_DIFF_FLAG_LENGTH_MISMATCH".enum(0x0002),
        "BUFFER_DIFF_FLAG_NOTDEF_PRESENT".enum(0x0004),
        "BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT".enum(0x0008),
        "BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH".enum(0x0010),
        "BUFFER_DIFF_FLAG_CLUSTER_MISMATCH".enum(0x0020),
        "BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH".enum(0x0040),
        "BUFFER_DIFF_FLAG_POSITION_MISMATCH".enum(0x0080)
    )

    customMethod("""
    @NativeType("hb_glyph_flags_t")
    public static int hb_glyph_info_get_glyph_flags(@NativeType("hb_glyph_info_t const *") hb_glyph_info_t info) {
        return info.mask() & HB_GLYPH_FLAG_DEFINED;
    }

    /** The default {@code hb_segment_properties_t} of of freshly created {@code hb_buffer_t}. */
    public static final hb_segment_properties_t HB_SEGMENT_PROPERTIES_DEFAULT = hb_segment_properties_t.create().set(
        HB_DIRECTION_INVALID,
        HB_SCRIPT_INVALID,
        HB_LANGUAGE_INVALID
    );
    """)

    hb_bool_t(
        "segment_properties_equal",

        hb_segment_properties_t.const.p("a"),
        hb_segment_properties_t.const.p("b")
    )

    unsigned_int(
        "segment_properties_hash",

        hb_segment_properties_t.const.p("p")
    )

    void(
        "segment_properties_overlay",

        hb_segment_properties_t.p("p"),
        hb_segment_properties_t.const.p("src")
    )

    hb_buffer_t.p(
        "buffer_create",

        void()
    )

    hb_buffer_t.p(
        "buffer_create_similar",

        hb_buffer_t.const.p("src")
    )

    void(
        "buffer_reset",

        hb_buffer_t.p("buffer")
    )

    hb_buffer_t.p(
        "buffer_get_empty",

        void()
    )

    hb_buffer_t.p(
        "buffer_reference",

        hb_buffer_t.p("buffer")
    )

    void(
        "buffer_destroy",

        hb_buffer_t.p("buffer")
    )

    hb_bool_t(
        "buffer_set_user_data",

        hb_buffer_t.p("buffer"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "buffer_get_user_data",

        hb_buffer_t.const.p("buffer"),
        hb_user_data_key_t.p("key")
    )

    void(
        "buffer_set_content_type",

        hb_buffer_t.p("buffer"),
        hb_buffer_content_type_t("content_type")
    )

    hb_buffer_content_type_t(
        "buffer_get_content_type",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_unicode_funcs",

        hb_buffer_t.p("buffer"),
        nullable..hb_unicode_funcs_t.p("unicode_funcs")
    )

    hb_unicode_funcs_t.p(
        "buffer_get_unicode_funcs",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_direction",

        hb_buffer_t.p("buffer"),
        hb_direction_t("direction")
    )

    hb_direction_t(
        "buffer_get_direction",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_script",

        hb_buffer_t.p("buffer"),
        hb_script_t("script")
    )

    hb_script_t(
        "buffer_get_script",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_language",

        hb_buffer_t.p("buffer"),
        hb_language_t("language")
    )

    hb_language_t(
        "buffer_get_language",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_segment_properties",

        hb_buffer_t.p("buffer"),
        hb_segment_properties_t.const.p("props")
    )

    void(
        "buffer_get_segment_properties",

        hb_buffer_t.const.p("buffer"),
        hb_segment_properties_t.p("props")
    )

    void(
        "buffer_guess_segment_properties",

        hb_buffer_t.p("buffer")
    )

    void(
        "buffer_set_flags",

        hb_buffer_t.p("buffer"),
        hb_buffer_flags_t("flags")
    )

    hb_buffer_flags_t(
        "buffer_get_flags",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_cluster_level",

        hb_buffer_t.p("buffer"),
        hb_buffer_cluster_level_t("cluster_level")
    )

    hb_buffer_cluster_level_t(
        "buffer_get_cluster_level",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_replacement_codepoint",

        hb_buffer_t.p("buffer"),
        hb_codepoint_t("replacement")
    )

    hb_codepoint_t(
        "buffer_get_replacement_codepoint",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_invisible_glyph",

        hb_buffer_t.p("buffer"),
        hb_codepoint_t("invisible")
    )

    hb_codepoint_t(
        "buffer_get_invisible_glyph",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_not_found_glyph",

        hb_buffer_t.p("buffer"),
        hb_codepoint_t("not_found")
    )

    hb_codepoint_t(
        "buffer_get_not_found_glyph",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_not_found_variation_selector_glyph",

        hb_buffer_t.p("buffer"),
        hb_codepoint_t("not_found_variation_selector")
    )

    hb_codepoint_t(
        "buffer_get_not_found_variation_selector_glyph",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_set_random_state",

        hb_buffer_t.p("buffer"),
        unsigned("state")
    )

    unsigned(
        "buffer_get_random_state",

        hb_buffer_t.const.p("buffer")
    )

    void(
        "buffer_clear_contents",

        hb_buffer_t.p("buffer")
    )

    hb_bool_t(
        "buffer_pre_allocate",

        hb_buffer_t.p("buffer"),
        unsigned_int("size")
    )

    hb_bool_t(
        "buffer_allocation_successful",

        hb_buffer_t.p("buffer")
    )

    void(
        "buffer_reverse",

        hb_buffer_t.p("buffer")
    )

    void(
        "buffer_reverse_range",

        hb_buffer_t.p("buffer"),
        unsigned_int("start"),
        unsigned_int("end")
    )

    void(
        "buffer_reverse_clusters",

        hb_buffer_t.p("buffer")
    )

    void(
        "buffer_add",

        hb_buffer_t.p("buffer"),
        hb_codepoint_t("codepoint"),
        unsigned_int("cluster")
    )

    void(
        "buffer_add_utf8",

        hb_buffer_t.p("buffer"),
        charUTF8.const.p("text"),
        AutoSize("text")..int("text_length"),
        unsigned_int("item_offset"),
        int("item_length")
    )

    void(
        "buffer_add_utf16",

        hb_buffer_t.p("buffer"),
        CharType("uint16_t", CharMapping.UTF16).const.p("text"),
        AutoSize("text")..int("text_length"),
        unsigned_int("item_offset"),
        int("item_length")
    )

    void(
        "buffer_add_utf32",

        hb_buffer_t.p("buffer"),
        uint32_t.const.p("text"),
        AutoSize("text")..int("text_length"),
        unsigned_int("item_offset"),
        int("item_length")
    )

    void(
        "buffer_add_latin1",

        hb_buffer_t.p("buffer"),
        uint8_t.const.p("text"),
        AutoSize("text")..int("text_length"),
        unsigned_int("item_offset"),
        int("item_length")
    )

    void(
        "buffer_add_codepoints",

        hb_buffer_t.p("buffer"),
        hb_codepoint_t.const.p("text"),
        AutoSize("text")..int("text_length"),
        unsigned_int("item_offset"),
        int("item_length")
    )

    void(
        "buffer_append",

        hb_buffer_t.p("buffer"),
        hb_buffer_t.const.p("source"),
        unsigned_int("start"),
        unsigned_int("end")
    )

    hb_bool_t(
        "buffer_set_length",

        hb_buffer_t.p("buffer"),
        unsigned_int("length")
    )

    unsigned_int(
        "buffer_get_length",

        hb_buffer_t.const.p("buffer")
    )

    hb_glyph_info_t.p(
        "buffer_get_glyph_infos",

        hb_buffer_t.p("buffer"),
        AutoSizeResult..Check(1)..unsigned_int.p("length")
    )

    hb_glyph_position_t.p(
        "buffer_get_glyph_positions",

        hb_buffer_t.p("buffer"),
        AutoSizeResult..Check(1)..unsigned_int.p("length")
    )

    hb_bool_t(
        "buffer_has_positions",

        hb_buffer_t.p("buffer")
    )

    void(
        "buffer_normalize_glyphs",

        hb_buffer_t.p("buffer")
    )

    hb_buffer_serialize_format_t(
        "buffer_serialize_format_from_string",

        charASCII.const.p("str"),
        AutoSize("str")..int("len")
    )

    charASCII.const.p(
        "buffer_serialize_format_to_string",

        hb_buffer_serialize_format_t("format")
    )

    customMethod("""
    private static final int buffer_serialize_list_formats_COUNT;
    static {
        long formats = nhb_buffer_serialize_list_formats();
        int count = 0;
        while (memGetAddress(formats) != NULL) {
            count++;
            formats += POINTER_SIZE;
        }
        buffer_serialize_list_formats_COUNT = count;
    }""")
    MapPointer("buffer_serialize_list_formats_COUNT")..charASCII.const.p.p(
        "buffer_serialize_list_formats",

        void()
    )

    unsigned_int(
        "buffer_serialize_glyphs",

        hb_buffer_t.p("buffer"),
        unsigned_int("start"),
        unsigned_int("end"),
        char.p("buf"),
        AutoSize("buf")..unsigned_int("buf_size"),
        Check(1)..nullable..unsigned_int.p("buf_consumed"),
        nullable..hb_font_t.p("font"),
        hb_buffer_serialize_format_t("format"),
        hb_buffer_serialize_flags_t("flags")
    )

    unsigned_int(
        "buffer_serialize_unicode",

        hb_buffer_t.p("buffer"),
        unsigned_int("start"),
        unsigned_int("end"),
        char.p("buf"),
        AutoSize("buf")..unsigned_int("buf_size"),
        Check(1)..nullable..unsigned_int.p("buf_consumed"),
        hb_buffer_serialize_format_t("format"),
        hb_buffer_serialize_flags_t("flags")
    )

    unsigned_int(
        "buffer_serialize",

        hb_buffer_t.p("buffer"),
        unsigned_int("start"),
        unsigned_int("end"),
        char.p("buf"),
        AutoSize("buf")..unsigned_int("buf_size"),
        Check(1)..nullable..unsigned_int.p("buf_consumed"),
        nullable..hb_font_t.p("font"),
        hb_buffer_serialize_format_t("format"),
        hb_buffer_serialize_flags_t("flags")
    )

    hb_bool_t(
        "buffer_deserialize_glyphs",

        hb_buffer_t.p("buffer"),
        char.const.p("buf"),
        AutoSize("buf")..int("buf_len"),
        Check(1)..nullable..char.const.p.p("end_ptr"),
        nullable..hb_font_t.p("font"),
        hb_buffer_serialize_format_t("format")
    )

    hb_bool_t(
        "buffer_deserialize_unicode",

        hb_buffer_t.p("buffer"),
        char.const.p("buf"),
        AutoSize("buf")..int("buf_len"),
        Check(1)..nullable..char.const.p.p("end_ptr"),
        hb_buffer_serialize_format_t("format")
    )

    hb_buffer_diff_flags_t(
        "buffer_diff",

        hb_buffer_t.p("buffer"),
        hb_buffer_t.p("reference"),
        hb_codepoint_t("dottedcircle_glyph"),
        unsigned_int("position_fuzz")
    )

    void(
        "buffer_set_message_func",

        hb_buffer_t.p("buffer"),
        hb_buffer_message_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    // hb-draw.h

    customMethod("""
    public static final hb_draw_state_t HB_DRAW_STATE_DEFAULT = hb_draw_state_t.create();
    """)

    void(
        "draw_funcs_set_move_to_func",

        hb_draw_funcs_t.p("dfuncs"),
        hb_draw_move_to_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "draw_funcs_set_line_to_func",

        hb_draw_funcs_t.p("dfuncs"),
        hb_draw_line_to_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "draw_funcs_set_quadratic_to_func",

        hb_draw_funcs_t.p("dfuncs"),
        hb_draw_quadratic_to_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "draw_funcs_set_cubic_to_func",

        hb_draw_funcs_t.p("dfuncs"),
        hb_draw_cubic_to_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "draw_funcs_set_close_path_func",

        hb_draw_funcs_t.p("dfuncs"),
        hb_draw_close_path_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_draw_funcs_t.p(
        "draw_funcs_create",

        void()
    )

    hb_draw_funcs_t.p(
        "draw_funcs_get_empty",

        void()
    )

    hb_draw_funcs_t.p(
        "draw_funcs_reference",

        hb_draw_funcs_t.p("dfuncs")
    )

    void(
        "draw_funcs_destroy",

        hb_draw_funcs_t.p("dfuncs")
    )

    hb_bool_t(
        "draw_funcs_set_user_data",

        hb_draw_funcs_t.p("dfuncs"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )


    opaque_p(
        "draw_funcs_get_user_data",

        hb_draw_funcs_t.const.p("dfuncs"),
        hb_user_data_key_t.p("key")
    )

    void(
        "draw_funcs_make_immutable",

        hb_draw_funcs_t.p("dfuncs")
    )

    hb_bool_t(
        "draw_funcs_is_immutable",

        hb_draw_funcs_t.p("dfuncs")
    )

    void(
        "draw_move_to",

        hb_draw_funcs_t.p("dfuncs"),
        Unsafe..void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("to_x"),
        float("to_y")
    )

    void(
        "draw_line_to",

        hb_draw_funcs_t.p("dfuncs"),
        Unsafe..void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("to_x"),
        float("to_y")
    )

    void(
        "draw_quadratic_to",

        hb_draw_funcs_t.p("dfuncs"),
        Unsafe..void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("control_x"),
        float("control_y"),
        float("to_x"),
        float("to_y")
    )

    void(
        "draw_cubic_to",

        hb_draw_funcs_t.p("dfuncs"),
        Unsafe..void.p("draw_data"),
        hb_draw_state_t.p("st"),
        float("control1_x"),
        float("control1_y"),
        float("control2_x"),
        float("control2_y"),
        float("to_x"),
        float("to_y")
    )

    void(
        "draw_close_path",

        hb_draw_funcs_t.p("dfuncs"),
        Unsafe..void.p("draw_data"),
        hb_draw_state_t.p("st")
    )

    // hb-face.h

    unsigned_int(
        "face_count",

        hb_blob_t.p("blob")
    )

    hb_face_t.p(
        "face_create",

        hb_blob_t.p("blob"),
        unsigned_int("index")
    )

    hb_face_t.p(
        "face_create_or_fail",

        hb_blob_t.p("blob"),
        unsigned_int("index")
    )

    hb_face_t.p(
        "face_create_or_fail_using",

        hb_blob_t.p("blob"),
        unsigned_int("index"),
        nullable..charUTF8.const.p("loader_name")
    )

    hb_face_t.p(
        "face_create_from_file_or_fail",

        charUTF8.const.p("file_name"),
        unsigned_int("index")
    )

    hb_face_t.p(
        "face_create_from_file_or_fail_using",

        charUTF8.const.p("file_name"),
        unsigned_int("index"),
        nullable..charUTF8.const.p("loader_name")
    )

    customMethod("""
    private static final int face_list_loaders_COUNT;
    static {
        long loaders = nhb_face_list_loaders();
        int count = 0;
        while (memGetAddress(loaders) != NULL) {
            count++;
            loaders += POINTER_SIZE;
        }
        face_list_loaders_COUNT = count;
    }""")
    MapPointer("face_list_loaders_COUNT")..charASCII.const.p.p(
        "face_list_loaders",

        void()
    )

    hb_face_t.p(
        "face_create_for_tables",

        hb_reference_table_func_t("reference_table_func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_face_t.p(
        "face_get_empty",

        void()
    )

    hb_face_t.p(
        "face_reference",

        hb_face_t.p("face")
    )

    void(
        "face_destroy",

        hb_face_t.p("face")
    )

    hb_bool_t(
        "face_set_user_data",

        hb_face_t.p("face"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "face_get_user_data",

        hb_face_t.const.p("face"),
        hb_user_data_key_t.p("key")
    )

    void(
        "face_make_immutable",

        hb_face_t.p("face")
    )

    hb_bool_t(
        "face_is_immutable",

        hb_face_t.p("face")
    )

    hb_blob_t.p(
        "face_reference_table",

        hb_face_t.const.p("face"),
        hb_tag_t("tag")
    )

    hb_blob_t.p(
        "face_reference_blob",

        hb_face_t.p("face")
    )

    void(
        "face_set_index",

        hb_face_t.p("face"),
        unsigned_int("index")
    )

    unsigned_int(
        "face_get_index",

        hb_face_t.const.p("face")
    )

    void(
        "face_set_upem",

        hb_face_t.p("face"),
        unsigned_int("upem")
    )

    unsigned_int(
        "face_get_upem",

        hb_face_t.const.p("face")
    )

    void(
        "face_set_glyph_count",

        hb_face_t.p("face"),
        unsigned_int("glyph_count")
    )

    unsigned_int(
        "face_get_glyph_count",

        hb_face_t.const.p("face")
    )

    void(
        "face_set_get_table_tags_func",

        hb_face_t.p("face"),
        hb_get_table_tags_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    unsigned_int(
        "face_get_table_tags",

        hb_face_t.const.p("face"),
        unsigned_int("start_offset"),
        AutoSize("table_tags")..Check(1)..unsigned_int.p("table_count"),
        hb_tag_t.p("table_tags")
    )

    void(
        "face_collect_unicodes",

        hb_face_t.p("face"),
        hb_set_t.p("out")
    )

    void(
        "face_collect_nominal_glyph_mapping",

        hb_face_t.p("face"),
        hb_map_t.p("mapping"),
        nullable..hb_set_t.p("unicodes")
    )

    void(
        "face_collect_variation_selectors",

        hb_face_t.p("face"),
        hb_set_t.p("out")
    )

    void(
        "face_collect_variation_unicodes",

        hb_face_t.p("face"),
        hb_codepoint_t("variation_selector"),
        hb_set_t.p("out")
    )

    hb_face_t.p(
        "face_builder_create",

        void()
    )

    hb_bool_t(
        "face_builder_add_table",

        hb_face_t.p("face"),
        hb_tag_t("tag"),
        hb_blob_t.p("blob")
    )

    void(
        "face_builder_sort_tables",

        hb_face_t.p("face"),
        NullTerminated..hb_tag_t.const.p("tags")
    )

    // hb-font.h

    IntConstant(
        "FONT_NO_VAR_NAMED_INSTANCE"..0xFFFFFFFF.i
    )

    hb_font_funcs_t.p(
        "font_funcs_create",

        void()
    )

    hb_font_funcs_t.p(
        "font_funcs_get_empty",

        void()
    )

    hb_font_funcs_t.p(
        "font_funcs_reference",

        hb_font_funcs_t.p("ffuncs")
    )

    void(
        "font_funcs_destroy",

        hb_font_funcs_t.p("ffuncs")
    )

    hb_bool_t(
        "font_funcs_set_user_data",

        hb_font_funcs_t.p("ffuncs"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "font_funcs_get_user_data",

        hb_font_funcs_t.const.p("ffuncs"),
        hb_user_data_key_t.p("key")
    )

    void(
        "font_funcs_make_immutable",

        hb_font_funcs_t.p("ffuncs")
    )

    hb_bool_t(
        "font_funcs_is_immutable",

        hb_font_funcs_t.p("ffuncs")
    )

    void(
        "font_funcs_set_font_h_extents_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_font_h_extents_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_font_v_extents_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_font_v_extents_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_nominal_glyph_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_nominal_glyph_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_nominal_glyphs_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_nominal_glyphs_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_variation_glyph_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_variation_glyph_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_h_advance_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_h_advance_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_v_advance_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_v_advance_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_h_advances_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_h_advances_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_v_advances_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_v_advances_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_h_origin_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_h_origin_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_v_origin_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_v_origin_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_h_origins_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_h_origins_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_v_origins_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_v_origins_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_h_kerning_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_h_kerning_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_extents_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_extents_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_contour_point_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_contour_point_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_name_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_name_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_glyph_from_name_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_get_glyph_from_name_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    // TODO: remove in LWJGL 4
    void(
        "font_funcs_set_draw_glyph_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_draw_glyph_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_draw_glyph_or_fail_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_draw_glyph_or_fail_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    // TODO: remove in LWJGL 4
    void(
        "font_funcs_set_paint_glyph_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_paint_glyph_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_funcs_set_paint_glyph_or_fail_func",

        hb_font_funcs_t.p("ffuncs"),
        hb_font_paint_glyph_or_fail_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_bool_t(
        "font_get_h_extents",

        hb_font_t.p("font"),
        hb_font_extents_t.p("extents")
    )

    hb_bool_t(
        "font_get_v_extents",

        hb_font_t.p("font"),
        hb_font_extents_t.p("extents")
    )

    hb_bool_t(
        "font_get_nominal_glyph",

        hb_font_t.p("font"),
        hb_codepoint_t("unicode"),
        Check(1)..hb_codepoint_t.p("glyph")
    )

    hb_bool_t(
        "font_get_variation_glyph",

        hb_font_t.p("font"),
        hb_codepoint_t("unicode"),
        hb_codepoint_t("variation_selector"),
        Check(1)..hb_codepoint_t.p("glyph")
    )

    unsigned_int(
        "font_get_nominal_glyphs",

        hb_font_t.p("font"),
        unsigned_int("count"),
        Check("(count * unicode_stride) >> 2")..hb_codepoint_t.const.p("first_unicode"),
        unsigned_int("unicode_stride"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.p("first_glyph"),
        unsigned_int("glyph_stride")
    )

    hb_position_t(
        "font_get_glyph_h_advance",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    hb_position_t(
        "font_get_glyph_v_advance",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph")
    )

    void(
        "font_get_glyph_h_advances",

        hb_font_t.p("font"),
        unsigned_int("count"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned_int("glyph_stride"),
        Check("(count * advance_stride) >> 2")..hb_position_t.p("first_advance"),
        unsigned_int("advance_stride")
    )

    void(
        "font_get_glyph_v_advances",

        hb_font_t.p("font"),
        unsigned_int("count"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned_int("glyph_stride"),
        Check("(count * advance_stride) >> 2")..hb_position_t.p("first_advance"),
        unsigned_int("advance_stride")
    )

    hb_bool_t(
        "font_get_glyph_h_origin",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    hb_bool_t(
        "font_get_glyph_v_origin",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    hb_bool_t(
        "font_get_glyph_h_origins",

        hb_font_t.p("font"),
        unsigned_int("count"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned("glyph_stride"),
        Check("(count * x_stride) >> 2")..hb_position_t.p("first_x"),
        unsigned("x_stride"),
        Check("(count * y_stride) >> 2")..hb_position_t.p("first_y"),
        unsigned("y_stride")
    )

    hb_bool_t(
        "font_get_glyph_v_origins",

        hb_font_t.p("font"),
        unsigned_int("count"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned("glyph_stride"),
        Check("(count * x_stride) >> 2")..hb_position_t.p("first_x"),
        unsigned("x_stride"),
        Check("(count * y_stride) >> 2")..hb_position_t.p("first_y"),
        unsigned("y_stride")
    )

    hb_position_t(
        "font_get_glyph_h_kerning",

        hb_font_t.p("font"),
        hb_codepoint_t("left_glyph"),
        hb_codepoint_t("right_glyph")
    )

    hb_bool_t(
        "font_get_glyph_extents",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_glyph_extents_t.p("extents")
    )

    hb_bool_t(
        "font_get_glyph_contour_point",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        unsigned_int("point_index"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    hb_bool_t(
        "font_get_glyph_name",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        char.p("name"),
        AutoSize("name")..unsigned_int("size")
    )

    hb_bool_t(
        "font_get_glyph_from_name",

        hb_font_t.p("font"),
        charASCII.const.p("name"),
        AutoSize("name")..int("len"),
        Check(1)..hb_codepoint_t.p("glyph")
    )

    void(
        "font_draw_glyph",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_draw_funcs_t.p("dfuncs"),
        nullable..opaque_p("draw_data")
    )

    hb_bool_t(
        "font_draw_glyph_or_fail",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_draw_funcs_t.p("dfuncs"),
        nullable..opaque_p("draw_data")
    )

    void(
        "font_paint_glyph",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_draw_funcs_t.p("pfuncs"),
        nullable..opaque_p("paint_data"),
        unsigned_int("palette_index"),
        hb_color_t("foreground")
    )

    hb_bool_t(
        "font_paint_glyph_or_fail",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_draw_funcs_t.p("pfuncs"),
        nullable..opaque_p("paint_data"),
        unsigned_int("palette_index"),
        hb_color_t("foreground")
    )

    hb_bool_t(
        "font_get_glyph",

        hb_font_t.p("font"),
        hb_codepoint_t("unicode"),
        hb_codepoint_t("variation_selector"),
        Check(1)..hb_codepoint_t.p("glyph")
    )

    void(
        "font_get_extents_for_direction",

        hb_font_t.p("font"),
        hb_direction_t("direction"),
        hb_font_extents_t.p("extents")
    )

    void(
        "font_get_glyph_advance_for_direction",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    void(
        "font_get_glyph_advances_for_direction",

        hb_font_t.p("font"),
        hb_direction_t("direction"),
        unsigned_int("count"),
        Check("(count * glyph_stride) >> 2")..hb_codepoint_t.const.p("first_glyph"),
        unsigned_int("glyph_stride"),
        Check("(count * advance_stride) >> 2")..hb_position_t.p("first_advance"),
        unsigned_int("advance_stride")
    )

    void(
        "font_get_glyph_origin_for_direction",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    void(
        "font_add_glyph_origin_for_direction",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    void(
        "font_subtract_glyph_origin_for_direction",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    void(
        "font_get_glyph_kerning_for_direction",

        hb_font_t.p("font"),
        hb_codepoint_t("first_glyph"),
        hb_codepoint_t("second_glyph"),
        hb_direction_t("direction"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    hb_bool_t(
        "font_get_glyph_extents_for_origin",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        hb_direction_t("direction"),
        hb_glyph_extents_t.p("extents")
    )

    hb_bool_t(
        "font_get_glyph_contour_point_for_origin",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        unsigned_int("point_index"),
        hb_direction_t("direction"),
        Check(1)..hb_position_t.p("x"),
        Check(1)..hb_position_t.p("y")
    )

    void(
        "font_glyph_to_string",

        hb_font_t.p("font"),
        hb_codepoint_t("glyph"),
        char.p("s"),
        AutoSize("s")..unsigned_int("size")
    )

    hb_bool_t(
        "font_glyph_from_string",

        hb_font_t.p("font"),
        charASCII.const.p("s"),
        AutoSize("s")..int("len"),
        Check(1)..hb_codepoint_t.p("glyph")
    )

    hb_font_t.p(
        "font_create",

        hb_face_t.p("face")
    )

    hb_font_t.p(
        "font_create_sub_font",

        hb_font_t.p("parent")
    )

    hb_font_t.p(
        "font_get_empty",

        void()
    )

    hb_font_t.p(
        "font_reference",

        hb_font_t.p("font")
    )

    void(
        "font_destroy",

        hb_font_t.p("font")
    )

    hb_bool_t(
        "font_set_user_data",

        hb_font_t.p("font"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "font_get_user_data",

        hb_font_t.const.p("font"),
        hb_user_data_key_t.p("key")
    )

    void(
        "font_make_immutable",

        hb_font_t.p("font")
    )

    hb_bool_t(
        "font_is_immutable",

        hb_font_t.p("font")
    )

    unsigned_int(
        "font_get_serial",

        hb_font_t.p("font")
    )

    void(
        "font_changed",

        hb_font_t.p("font")
    )

    void(
        "font_set_parent",

        hb_font_t.p("font"),
        nullable..hb_font_t.p("parent")
    )

    hb_font_t.p(
        "font_get_parent",

        hb_font_t.p("font")
    )

    void(
        "font_set_face",

        hb_font_t.p("font"),
        nullable..hb_face_t.p("face")
    )

    hb_face_t.p(
        "font_get_face",

        hb_font_t.p("font")
    )

    void(
        "font_set_funcs",

        hb_font_t.p("font"),
        nullable..hb_font_funcs_t.p("klass"),
        nullable..opaque_p("font_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "font_set_funcs_data",

        hb_font_t.p("font"),
        nullable..opaque_p("font_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_bool_t(
        "font_set_funcs_using",

        hb_font_t.p("font"),
        nullable..charUTF8.const.p("name")
    )

    customMethod("""
    private static final int font_list_funcs_COUNT;
    static {
        long funcs = nhb_font_list_funcs();
        int count = 0;
        while (memGetAddress(funcs) != NULL) {
            count++;
            funcs += POINTER_SIZE;
        }
        font_list_funcs_COUNT = count;
    }""")
    MapPointer("font_list_funcs_COUNT")..charASCII.const.p.p(
        "font_list_funcs",

        void()
    )

    void(
        "font_set_scale",

        hb_font_t.p("font"),
        int("x_scale"),
        int("y_scale")
    )

    void(
        "font_get_scale",

        hb_font_t.p("font"),
        Check(1)..int.p("x_scale"),
        Check(1)..int.p("y_scale")
    )

    void(
        "font_set_ppem",

        hb_font_t.p("font"),
        unsigned_int("x_ppem"),
        unsigned_int("y_ppem")
    )

    void(
        "font_get_ppem",

        hb_font_t.p("font"),
        Check(1)..unsigned_int.p("x_ppem"),
        Check(1)..unsigned_int.p("y_ppem")
    )

    void(
        "font_set_ptem",

        hb_font_t.p("font"),
        float("ptem")
    )

    float(
        "font_get_ptem",

        hb_font_t.p("font")
    )

    hb_bool_t(
        "font_is_synthetic",

        hb_font_t.p("font")
    )

    void(
        "font_set_synthetic_bold",

        hb_font_t.p("font"),
        float("x_embolden"),
        float("y_embolden"),
        hb_bool_t("in_place")
    )

    void(
        "font_get_synthetic_bold",

        hb_font_t.p("font"),
        Check(1)..nullable..float.p("x_embolden"),
        Check(1)..nullable..float.p("y_embolden"),
        Check(1)..nullable..hb_bool_t.p("in_place")
    )

    void(
        "font_set_synthetic_slant",

        hb_font_t.p("font"),
        float("slant")
    )

    float(
        "font_get_synthetic_slant",

        hb_font_t.p("font")
    )

    void(
        "font_set_variations",

        hb_font_t.p("font"),
        hb_variation_t.const.p("variations"),
        AutoSize("variations")..unsigned_int("variations_length")
    )

    void(
        "font_set_variation",

        hb_font_t.p("font"),
        hb_tag_t("tag"),
        float("value")
    )

    void(
        "font_set_var_coords_design",

        hb_font_t.p("font"),
        float.const.p("coords"),
        AutoSize("coords")..unsigned_int("coords_length")
    )

    float.const.p(
        "font_get_var_coords_design",

        hb_font_t.p("font"),
        AutoSizeResult..Check(1)..unsigned_int.p("length")
    )

    void(
        "font_set_var_coords_normalized",

        hb_font_t.p("font"),
        int.const.p("coords"),
        AutoSize("coords")..unsigned_int("coords_length")
    )

    int.const.p(
        "font_get_var_coords_normalized",

        hb_font_t.p("font"),
        AutoSizeResult..Check(1)..unsigned_int.p("length")
    )

    void(
        "font_set_var_named_instance",

        hb_font_t.p("font"),
        unsigned_int("instance_index")
    )

    unsigned_int(
        "font_get_var_named_instance",

        hb_font_t.p("font")
    )

    // hb-ft.h

    IgnoreMissing..hb_face_t.p(
        "ft_face_create",

        FT_Face("ft_face"),
        nullable..hb_destroy_func_t("destroy")
    )

    IgnoreMissing..hb_face_t.p(
        "ft_face_create_cached",

        FT_Face("ft_face")
    )

    IgnoreMissing..hb_face_t.p(
        "ft_face_create_referenced",

        FT_Face("ft_face")
    )

    IgnoreMissing..hb_face_t.p(
        "ft_face_create_from_file_or_fail",

        charUTF8.const.p("file_name"),
        unsigned_int("index")
    )

    IgnoreMissing..hb_face_t.p(
        "ft_face_create_from_blob_or_fail",

        hb_blob_t.p("blob"),
        unsigned_int("index")
    )

    IgnoreMissing..hb_font_t.p(
        "ft_font_create",

        FT_Face("ft_face"),
        nullable..hb_destroy_func_t("destroy")
    )

    IgnoreMissing..hb_font_t.p(
        "ft_font_create_referenced",

        FT_Face("ft_face")
    )

    IgnoreMissing..FT_Face(
        "ft_font_get_ft_face",

        hb_font_t.p("font")
    )

    IgnoreMissing..FT_Face(
        "ft_font_lock_face",

        hb_font_t.p("font")
    )

    IgnoreMissing..void(
        "ft_font_unlock_face",

        hb_font_t.p("font")
    )

    IgnoreMissing..void(
        "ft_font_set_load_flags",

        hb_font_t.p("font"),
        int("load_flags")
    )

    IgnoreMissing..int(
        "ft_font_get_load_flags",

        hb_font_t.p("font")
    )

    IgnoreMissing..void(
        "ft_font_changed",

        hb_font_t.p("font")
    )

    IgnoreMissing..hb_bool_t(
        "ft_hb_font_changed",

        hb_font_t.p("font")
    )

    IgnoreMissing..void(
        "ft_font_set_funcs",

        hb_font_t.p("font")
    )

    // hb-map.h

    IntConstant("MAP_VALUE_INVALID".."HB_CODEPOINT_INVALID")

    hb_map_t.p(
        "map_create",

        void()
    )

    hb_map_t.p(
        "map_get_empty",

        void()
    )

    hb_map_t.p(
        "map_reference",

        hb_map_t.p("map")
    )

    void(
        "map_destroy",

        hb_map_t.p("map")
    )

    hb_bool_t(
        "map_set_user_data",

        hb_map_t.p("map"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "map_get_user_data",

        hb_map_t.const.p("map"),
        hb_user_data_key_t.p("key")
    )

    hb_bool_t(
        "map_allocation_successful",

        hb_map_t.const.p("map")
    )

    hb_map_t.p(
        "map_copy",

        hb_map_t.const.p("map")
    )

    void(
        "map_clear",

        hb_map_t.p("map")
    )

    hb_bool_t(
        "map_is_empty",

        hb_map_t.const.p("map")
    )

    unsigned_int(
        "map_get_population",

        hb_map_t.const.p("map")
    )

    hb_bool_t(
        "map_is_equal",

        hb_map_t.const.p("map"),
        hb_map_t.const.p("other")
    )

    unsigned_int(
        "map_hash",

        hb_map_t.const.p("map")
    )

    void(
        "map_set",

        hb_map_t.p("map"),
        hb_codepoint_t("key"),
        hb_codepoint_t("value")
    )

    hb_codepoint_t(
        "map_get",

        hb_map_t.const.p("map"),
        hb_codepoint_t("key")
    )

    void(
        "map_del",

        hb_map_t.p("map"),
        hb_codepoint_t("key")
    )

    hb_bool_t(
        "map_has",

        hb_map_t.const.p("map"),
        hb_codepoint_t("key")
    )

    void(
        "map_update",

        hb_map_t.p("map"),
        hb_map_t.const.p("other")
    )

    hb_bool_t(
        "map_next",

        hb_map_t.const.p("map"),
        Check(1)..int.p("idx"),
        Check(1)..hb_codepoint_t.p("key"),
        Check(1)..hb_codepoint_t.p("value")
    )

    void(
        "map_keys",

        hb_map_t.const.p("map"),
        hb_set_t.p("keys")
    )

    void(
        "map_values",

        hb_map_t.const.p("map"),
        hb_set_t.p("values")
    )

    // hb-paint.h

    hb_paint_funcs_t.p(
        "paint_funcs_create",

        void()
    )

    hb_paint_funcs_t.p(
        "paint_funcs_get_empty",

        void()
    )

    hb_paint_funcs_t.p(
        "paint_funcs_reference",

        hb_paint_funcs_t.p("funcs")
    )

    void(
        "paint_funcs_destroy",

        hb_paint_funcs_t.p("funcs")
    )

    hb_bool_t(
        "paint_funcs_set_user_data",

        hb_paint_funcs_t.p("funcs"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    );


    opaque_p(
        "paint_funcs_get_user_data",

        hb_paint_funcs_t.const.p("funcs"),
        hb_user_data_key_t.p("key")
    );

    void(
        "paint_funcs_make_immutable",

        hb_paint_funcs_t.p("funcs")
    )

    hb_bool_t(
        "paint_funcs_is_immutable",

        hb_paint_funcs_t.p("funcs")
    )

    IntConstant(
        "PAINT_IMAGE_FORMAT_PNG".."HB_TAG('p', 'n', 'g', ' ')",
        "PAINT_IMAGE_FORMAT_SVG".."HB_TAG('s', 'v', 'g', ' ')",
        "PAINT_IMAGE_FORMAT_BGRA".."HB_TAG('B', 'G', 'R', 'A')"
    )

    EnumConstant(
        "PAINT_EXTEND_PAD".enum("0"),
        "PAINT_EXTEND_REPEAT".enum,
        "PAINT_EXTEND_REFLECT".enum
    )

    unsigned_int(
        "color_line_get_color_stops",

        hb_color_line_t.p("color_line"),
        unsigned_int("start"),
        Check(1)..unsigned_int.p("count"),
        hb_color_stop_t.p("color_stops")
    )

    hb_paint_extend_t(
        "color_line_get_extend",

        hb_color_line_t.p("color_line")
    )

    EnumConstant(
        "PAINT_COMPOSITE_MODE_CLEAR".enum("0"),
        "PAINT_COMPOSITE_MODE_SRC".enum,
        "PAINT_COMPOSITE_MODE_DEST".enum,
        "PAINT_COMPOSITE_MODE_SRC_OVER".enum,
        "PAINT_COMPOSITE_MODE_DEST_OVER".enum,
        "PAINT_COMPOSITE_MODE_SRC_IN".enum,
        "PAINT_COMPOSITE_MODE_DEST_IN".enum,
        "PAINT_COMPOSITE_MODE_SRC_OUT".enum,
        "PAINT_COMPOSITE_MODE_DEST_OUT".enum,
        "PAINT_COMPOSITE_MODE_SRC_ATOP".enum,
        "PAINT_COMPOSITE_MODE_DEST_ATOP".enum,
        "PAINT_COMPOSITE_MODE_XOR".enum,
        "PAINT_COMPOSITE_MODE_PLUS".enum,
        "PAINT_COMPOSITE_MODE_SCREEN".enum,
        "PAINT_COMPOSITE_MODE_OVERLAY".enum,
        "PAINT_COMPOSITE_MODE_DARKEN".enum,
        "PAINT_COMPOSITE_MODE_LIGHTEN".enum,
        "PAINT_COMPOSITE_MODE_COLOR_DODGE".enum,
        "PAINT_COMPOSITE_MODE_COLOR_BURN".enum,
        "PAINT_COMPOSITE_MODE_HARD_LIGHT".enum,
        "PAINT_COMPOSITE_MODE_SOFT_LIGHT".enum,
        "PAINT_COMPOSITE_MODE_DIFFERENCE".enum,
        "PAINT_COMPOSITE_MODE_EXCLUSION".enum,
        "PAINT_COMPOSITE_MODE_MULTIPLY".enum,
        "PAINT_COMPOSITE_MODE_HSL_HUE".enum,
        "PAINT_COMPOSITE_MODE_HSL_SATURATION".enum,
        "PAINT_COMPOSITE_MODE_HSL_COLOR".enum,
        "PAINT_COMPOSITE_MODE_HSL_LUMINOSITY".enum
    )

    void(
        "paint_funcs_set_push_transform_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_push_transform_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_pop_transform_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_pop_transform_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_color_glyph_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_color_glyph_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_push_clip_glyph_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_push_clip_glyph_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_push_clip_rectangle_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_push_clip_rectangle_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_pop_clip_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_pop_clip_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_color_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_color_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_image_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_image_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_linear_gradient_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_linear_gradient_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_radial_gradient_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_radial_gradient_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_sweep_gradient_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_sweep_gradient_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_push_group_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_push_group_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_pop_group_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_pop_group_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_funcs_set_custom_palette_color_func",

        hb_paint_funcs_t.p("funcs"),
        hb_paint_custom_palette_color_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "paint_push_transform",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        float("xx"),
        float("yx"),
        float("xy"),
        float("yy"),
        float("dx"),
        float("dy")
    )

    void(
        "paint_push_font_transform",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_font_t.const.p("font")
    )

    void(
        "paint_push_inverse_font_transform",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_font_t.const.p("font")
    )

    void(
        "paint_pop_transform",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data")
    )

    void(
        "paint_color_glyph",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_codepoint_t("glyph"),
        hb_font_t.p("font")
    )

    void(
        "paint_push_clip_glyph",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_codepoint_t("glyph"),
        hb_font_t.p("font")
    )

    void(
        "paint_push_clip_rectangle",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        float("xmin"),
        float("ymin"),
        float("xmax"),
        float("ymax")
    )

    void(
        "paint_pop_clip",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data")
    )

    void(
        "paint_color",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_bool_t("is_foreground"),
        hb_color_t("color")
    )

    void(
        "paint_image",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_blob_t.p("image"),
        unsigned_int("width"),
        unsigned_int("height"),
        hb_tag_t("format"),
        float("slant"),
        hb_glyph_extents_t.p("extents")
    )

    void(
        "paint_linear_gradient",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_color_line_t.p("color_line"),
        float("x0"),
        float("yx0"),
        float("x1"),
        float("y1"),
        float("x2"),
        float("y2"),
    )

    void(
        "paint_radial_gradient",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_color_line_t.p("color_line"),
        float("x0"),
        float("y0"),
        float("r0"),
        float("x1"),
        float("y1"),
        float("r1")
    )

    void(
        "paint_sweep_gradient",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_color_line_t.p("color_line"),
        float("x0"),
        float("y0"),
        float("start_angle"),
        float("end_angle")
    )

    void(
        "paint_push_group",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data")
    )

    void(
        "paint_pop_group",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        hb_paint_composite_mode_t("mode")
    )

    hb_bool_t(
        "paint_custom_palette_color",

        hb_paint_funcs_t.p("funcs"),
        nullable..opaque_p("paint_data"),
        unsigned_int("color_index"),
        Check(1)..hb_color_t.p("color")
    )

    // hb-set.h

    IntConstant("SET_VALUE_INVALID".."HB_CODEPOINT_INVALID")

    hb_set_t.p(
        "set_create",

        void()
    )

    hb_set_t.p(
        "set_get_empty",

        void()
    )

    hb_set_t.p(
        "set_reference",

        hb_set_t.p("set")
    )

    void(
        "set_destroy",

        hb_set_t.p("set")
    )

    hb_bool_t(
        "set_set_user_data",

        hb_set_t.p("set"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "set_get_user_data",

        hb_set_t.const.p("set"),
        hb_user_data_key_t.p("key")
    )

    hb_bool_t(
        "set_allocation_successful",

        hb_set_t.const.p("set")
    )

    hb_set_t.p(
        "set_copy",

        hb_set_t.const.p("set")
    )

    void(
        "set_clear",

        hb_set_t.p("set")
    )

    hb_bool_t(
        "set_is_empty",

        hb_set_t.const.p("set")
    )

    void(
        "set_invert",

        hb_set_t.p("set")
    )

    hb_bool_t(
        "set_is_inverted",

        hb_set_t.const.p("set")
    )

    hb_bool_t(
        "set_has",

        hb_set_t.const.p("set"),
        hb_codepoint_t("codepoint")
    )

    void(
        "set_add",

        hb_set_t.p("set"),
        hb_codepoint_t("codepoint")
    )

    void(
        "set_add_range",

        hb_set_t.p("set"),
        hb_codepoint_t("first"),
        hb_codepoint_t("last")
    )

    void(
        "set_add_sorted_array",

        hb_set_t.p("set"),
        hb_codepoint_t.const.p("sorted_codepoints"),
        AutoSize("sorted_codepoints")..unsigned_int("num_codepoints")
    )

    void(
        "set_del",

        hb_set_t.p("set"),
        hb_codepoint_t("codepoint")
    )

    void(
        "set_del_range",

        hb_set_t.p("set"),
        hb_codepoint_t("first"),
        hb_codepoint_t("last")
    )

    hb_bool_t(
        "set_is_equal",

        hb_set_t.const.p("set"),
        hb_set_t.const.p("other")
    )

    unsigned_int(
        "set_hash",

        hb_set_t.const.p("set")
    )

    hb_bool_t(
        "set_is_subset",

        hb_set_t.const.p("set"),
        hb_set_t.const.p("larger_set")
    )

    void(
        "set_set",

        hb_set_t.p("set"),
        hb_set_t.const.p("other")
    )

    void(
        "set_union",

        hb_set_t.p("set"),
        hb_set_t.const.p("other")
    )

    void(
        "set_intersect",

        hb_set_t.p("set"),
        hb_set_t.const.p("other")
    )

    void(
        "set_subtract",

        hb_set_t.p("set"),
        hb_set_t.const.p("other")
    )

    void(
        "set_symmetric_difference",

        hb_set_t.p("set"),
        hb_set_t.const.p("other")
    )

    unsigned_int(
        "set_get_population",

        hb_set_t.const.p("set")
    )

    hb_codepoint_t(
        "set_get_min",

        hb_set_t.const.p("set")
    )

    hb_codepoint_t(
        "set_get_max",

        hb_set_t.const.p("set")
    )

    hb_bool_t(
        "set_next",

        hb_set_t.const.p("set"),
        Check(1)..hb_codepoint_t.p("codepoint")
    )

    hb_bool_t(
        "set_previous",

        hb_set_t.const.p("set"),
        Check(1)..hb_codepoint_t.p("codepoint")
    )

    hb_bool_t(
        "set_next_range",

        hb_set_t.const.p("set"),
        Check(1)..hb_codepoint_t.p("first"),
        Check(1)..hb_codepoint_t.p("last")
    )

    hb_bool_t(
        "set_previous_range",

        hb_set_t.const.p("set"),
        Check(1)..hb_codepoint_t.p("first"),
        Check(1)..hb_codepoint_t.p("last")
    )

    unsigned_int(
        "set_next_many",

        hb_set_t.const.p("set"),
        hb_codepoint_t("codepoint"),
        hb_codepoint_t.p("out"),
        AutoSize("out")..unsigned_int("size")
    )

    // hb-shape.h

    void(
        "shape",

        hb_font_t.p("font"),
        hb_buffer_t.p("buffer"),
        nullable..hb_feature_t.const.p("features"),
        AutoSize("features")..unsigned_int("num_features")
    )

    hb_bool_t(
        "shape_full",

        hb_font_t.p("font"),
        hb_buffer_t.p("buffer"),
        nullable..hb_feature_t.const.p("features"),
        AutoSize("features")..unsigned_int("num_features"),
        NullTerminated..nullable..charASCII.const.p.const.p("shaper_list")
    )

    hb_bool_t(
        "shape_justify",

        hb_font_t.p("font"),
        hb_buffer_t.p("buffer"),
        nullable..hb_feature_t.const.p("features"),
        AutoSize("features")..unsigned_int("num_features"),
        NullTerminated..nullable..charASCII.const.p.const.p("shaper_list"),
        float("min_target_advance"),
        float("max_target_advance"),
        Check(1)..float.p("advance"),
        Check(1)..hb_tag_t.p("var_tag"),
        Check(1)..float.p("var_value")
    )

    customMethod("""
    private static final int shape_list_shapers_COUNT;
    static {
        long shapers = nhb_shape_list_shapers();
        int count = 0;
        while (memGetAddress(shapers) != NULL) {
            count++;
            shapers += POINTER_SIZE;
        }
        shape_list_shapers_COUNT = count;
    }""")

    MapPointer("shape_list_shapers_COUNT")..charASCII.const.p.p(
        "shape_list_shapers",

        void()
    )

    // hb-shape-plan.h

    hb_shape_plan_t.p(
        "shape_plan_create",

        nullable..hb_face_t.p("face"),
        hb_segment_properties_t.const.p("props"),
        nullable..hb_feature_t.const.p("user_features"),
        AutoSize("user_features")..unsigned_int("num_user_features"),
        NullTerminated..nullable..charASCII.const.p.const.p("shaper_list")
    )

    hb_shape_plan_t.p(
        "shape_plan_create_cached",

        nullable..hb_face_t.p("face"),
        hb_segment_properties_t.const.p("props"),
        nullable..hb_feature_t.const.p("user_features"),
        AutoSize("user_features")..unsigned_int("num_user_features"),
        NullTerminated..nullable..charASCII.const.p.const.p("shaper_list")
    )

    hb_shape_plan_t.p(
        "shape_plan_create2",

        nullable..hb_face_t.p("face"),
        hb_segment_properties_t.const.p("props"),
        nullable..hb_feature_t.const.p("user_features"),
        AutoSize("user_features")..unsigned_int("num_user_features"),
        nullable..int.const.p("coords"),
        AutoSize("coords")..unsigned_int("num_coords"),
        NullTerminated..nullable..charASCII.const.p.const.p("shaper_list")
    )

    hb_shape_plan_t.p(
        "shape_plan_create_cached2",

        nullable..hb_face_t.p("face"),
        hb_segment_properties_t.const.p("props"),
        nullable..hb_feature_t.const.p("user_features"),
        AutoSize("user_features")..unsigned_int("num_user_features"),
        nullable..int.const.p("coords"),
        AutoSize("coords")..unsigned_int("num_coords"),
        NullTerminated..nullable..charASCII.const.p.const.p("shaper_list")
    )

    hb_shape_plan_t.p(
        "shape_plan_get_empty",

        void()
    )

    hb_shape_plan_t.p(
        "shape_plan_reference",

        hb_shape_plan_t.p("shape_plan")
    )

    void(
        "shape_plan_destroy",

        hb_shape_plan_t.p("shape_plan")
    )

    hb_bool_t(
        "shape_plan_set_user_data",

        hb_shape_plan_t.p("shape_plan"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "shape_plan_get_user_data",

        hb_shape_plan_t.const.p("shape_plan"),
        hb_user_data_key_t.p("key")
    )

    hb_bool_t(
        "shape_plan_execute",

        hb_shape_plan_t.p("shape_plan"),
        hb_font_t.p("font"),
        hb_buffer_t.p("buffer"),
        nullable..hb_feature_t.const.p("features"),
        AutoSize("features")..unsigned_int("num_features")
    )

    charASCII.const.p(
        "shape_plan_get_shaper",

        hb_shape_plan_t.p("shape_plan")
    )

    // hb-style.h

    EnumConstant(
        "STYLE_TAG_ITALIC".enum("HB_TAG ('i','t','a','l')"),
        "STYLE_TAG_OPTICAL_SIZE".enum("HB_TAG ('o','p','s','z')"),
        "STYLE_TAG_SLANT_ANGLE".enum("HB_TAG ('s','l','n','t')"),
        "STYLE_TAG_SLANT_RATIO".enum("HB_TAG ('S','l','n','t')"),
        "STYLE_TAG_WIDTH".enum("HB_TAG ('w','d','t','h')"),
        "STYLE_TAG_WEIGHT".enum("HB_TAG ('w','g','h','t')")
    ).noPrefix()

    float(
        "style_get_value",

        hb_font_t.p("font"),
        hb_style_tag_t("style_tag")
    )

    // hb-unicode.h

    IntConstant("UNICODE_MAX".."0x10FFFF")

    EnumConstant(
        "UNICODE_GENERAL_CATEGORY_CONTROL".enum("0"),
        "UNICODE_GENERAL_CATEGORY_FORMAT".enum,
        "UNICODE_GENERAL_CATEGORY_UNASSIGNED".enum,
        "UNICODE_GENERAL_CATEGORY_PRIVATE_USE".enum,
        "UNICODE_GENERAL_CATEGORY_SURROGATE".enum,
        "UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER".enum,
        "UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER".enum,
        "UNICODE_GENERAL_CATEGORY_OTHER_LETTER".enum,
        "UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER".enum,
        "UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER".enum,
        "UNICODE_GENERAL_CATEGORY_SPACING_MARK".enum,
        "UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK".enum,
        "UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK".enum,
        "UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER".enum,
        "UNICODE_GENERAL_CATEGORY_LETTER_NUMBER".enum,
        "UNICODE_GENERAL_CATEGORY_OTHER_NUMBER".enum,
        "UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION".enum,
        "UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL".enum,
        "UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL".enum,
        "UNICODE_GENERAL_CATEGORY_MATH_SYMBOL".enum,
        "UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL".enum,
        "UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR".enum,
        "UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR".enum,
        "UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR".enum
    )

    EnumConstant(
        "UNICODE_COMBINING_CLASS_NOT_REORDERED".enum("0"),
        "UNICODE_COMBINING_CLASS_OVERLAY".enum,
        "UNICODE_COMBINING_CLASS_NUKTA".enum("7"),
        "UNICODE_COMBINING_CLASS_KANA_VOICING".enum,
        "UNICODE_COMBINING_CLASS_VIRAMA".enum,
        "UNICODE_COMBINING_CLASS_CCC10".enum("10"),
        "UNICODE_COMBINING_CLASS_CCC11".enum,
        "UNICODE_COMBINING_CLASS_CCC12".enum,
        "UNICODE_COMBINING_CLASS_CCC13".enum,
        "UNICODE_COMBINING_CLASS_CCC14".enum,
        "UNICODE_COMBINING_CLASS_CCC15".enum,
        "UNICODE_COMBINING_CLASS_CCC16".enum,
        "UNICODE_COMBINING_CLASS_CCC17".enum,
        "UNICODE_COMBINING_CLASS_CCC18".enum,
        "UNICODE_COMBINING_CLASS_CCC19".enum,
        "UNICODE_COMBINING_CLASS_CCC20".enum,
        "UNICODE_COMBINING_CLASS_CCC21".enum,
        "UNICODE_COMBINING_CLASS_CCC22".enum,
        "UNICODE_COMBINING_CLASS_CCC23".enum,
        "UNICODE_COMBINING_CLASS_CCC24".enum,
        "UNICODE_COMBINING_CLASS_CCC25".enum,
        "UNICODE_COMBINING_CLASS_CCC26".enum,
        "UNICODE_COMBINING_CLASS_CCC27".enum,
        "UNICODE_COMBINING_CLASS_CCC28".enum,
        "UNICODE_COMBINING_CLASS_CCC29".enum,
        "UNICODE_COMBINING_CLASS_CCC30".enum,
        "UNICODE_COMBINING_CLASS_CCC31".enum,
        "UNICODE_COMBINING_CLASS_CCC32".enum,
        "UNICODE_COMBINING_CLASS_CCC33".enum,
        "UNICODE_COMBINING_CLASS_CCC34".enum,
        "UNICODE_COMBINING_CLASS_CCC35".enum,
        "UNICODE_COMBINING_CLASS_CCC36".enum,
        "UNICODE_COMBINING_CLASS_CCC84".enum("84"),
        "UNICODE_COMBINING_CLASS_CCC91".enum("91"),
        "UNICODE_COMBINING_CLASS_CCC103".enum("103"),
        "UNICODE_COMBINING_CLASS_CCC107".enum("107"),
        "UNICODE_COMBINING_CLASS_CCC118".enum("118"),
        "UNICODE_COMBINING_CLASS_CCC122".enum("122"),
        "UNICODE_COMBINING_CLASS_CCC129".enum("129"),
        "UNICODE_COMBINING_CLASS_CCC130".enum("130"),
        "UNICODE_COMBINING_CLASS_CCC132".enum("132"),
        "UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT".enum("200"),
        "UNICODE_COMBINING_CLASS_ATTACHED_BELOW".enum("202"),
        "UNICODE_COMBINING_CLASS_ATTACHED_ABOVE".enum("214"),
        "UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT".enum("216"),
        "UNICODE_COMBINING_CLASS_BELOW_LEFT".enum("218"),
        "UNICODE_COMBINING_CLASS_BELOW".enum("220"),
        "UNICODE_COMBINING_CLASS_BELOW_RIGHT".enum("222"),
        "UNICODE_COMBINING_CLASS_LEFT".enum("224"),
        "UNICODE_COMBINING_CLASS_RIGHT".enum("226"),
        "UNICODE_COMBINING_CLASS_ABOVE_LEFT".enum("228"),
        "UNICODE_COMBINING_CLASS_ABOVE".enum("230"),
        "UNICODE_COMBINING_CLASS_ABOVE_RIGHT".enum("232"),
        "UNICODE_COMBINING_CLASS_DOUBLE_BELOW".enum("233"),
        "UNICODE_COMBINING_CLASS_DOUBLE_ABOVE".enum("234"),
        "UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT".enum("240"),
        "UNICODE_COMBINING_CLASS_INVALID".enum("255")
    )

    hb_unicode_funcs_t.p(
        "unicode_funcs_get_default",

        void()
    )

    hb_unicode_funcs_t.p(
        "unicode_funcs_create",

        hb_unicode_funcs_t.p("parent")
    )

    hb_unicode_funcs_t.p(
        "unicode_funcs_get_empty",

        void()
    )

    hb_unicode_funcs_t.p(
        "unicode_funcs_reference",

        hb_unicode_funcs_t.p("ufuncs")
    )

    void(
        "unicode_funcs_destroy",

        hb_unicode_funcs_t.p("ufuncs")
    )

    hb_bool_t(
        "unicode_funcs_set_user_data",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_user_data_key_t.p("key"),
        nullable..opaque_p("data"),
        nullable..hb_destroy_func_t("destroy"),
        hb_bool_t("replace")
    )

    opaque_p(
        "unicode_funcs_get_user_data",

        hb_unicode_funcs_t.const.p("ufuncs"),
        hb_user_data_key_t.p("key")
    )

    void(
        "unicode_funcs_make_immutable",

        hb_unicode_funcs_t.p("ufuncs")
    )

    hb_bool_t(
        "unicode_funcs_is_immutable",

        hb_unicode_funcs_t.p("ufuncs")
    )

    hb_unicode_funcs_t.p(
        "unicode_funcs_get_parent",

        hb_unicode_funcs_t.p("ufuncs")
    )

    void(
        "unicode_funcs_set_combining_class_func",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_unicode_combining_class_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "unicode_funcs_set_general_category_func",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_unicode_general_category_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "unicode_funcs_set_mirroring_func",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_unicode_mirroring_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "unicode_funcs_set_script_func",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_unicode_script_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "unicode_funcs_set_compose_func",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_unicode_compose_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    void(
        "unicode_funcs_set_decompose_func",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_unicode_decompose_func_t("func"),
        nullable..opaque_p("user_data"),
        nullable..hb_destroy_func_t("destroy")
    )

    hb_unicode_combining_class_t(
        "unicode_combining_class",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode")
    )

    hb_unicode_general_category_t(
        "unicode_general_category",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode")
    )

    hb_codepoint_t(
        "unicode_mirroring",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode")
    )

    hb_script_t(
        "unicode_script",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("unicode")
    )

    hb_bool_t(
        "unicode_compose",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("a"),
        hb_codepoint_t("b"),
        Check(1)..hb_codepoint_t.p("ab")
    )

    hb_bool_t(
        "unicode_decompose",

        hb_unicode_funcs_t.p("ufuncs"),
        hb_codepoint_t("ab"),
        Check(1)..hb_codepoint_t.p("a"),
        Check(1)..hb_codepoint_t.p("b")
    )

    // hb-version.h

    IntConstant("VERSION_MAJOR".."12")
    IntConstant("VERSION_MINOR".."3")
    IntConstant("VERSION_MICRO".."2")

    StringConstant("VERSION_STRING".."12.3.2")

    customMethod("""
    public static boolean HB_VERSION_ATLEAST(int major, int minor, int micro) {
        return major*10000 + minor*100 + micro <= HB_VERSION_MAJOR*10000 + HB_VERSION_MINOR*100 + HB_VERSION_MICRO;
    }""")

    void(
        "version",

        Check(1)..unsigned_int.p("major"),
        Check(1)..unsigned_int.p("minor"),
        Check(1)..unsigned_int.p("micro")
    )

    charASCII.const.p(
        "version_string",

        void()
    )

    hb_bool_t(
        "version_atleast",

        unsigned_int("major"),
        unsigned_int("minor"),
        unsigned_int("micro")
    )

}