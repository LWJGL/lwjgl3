/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package freetype.templates

import org.lwjgl.generator.*
import freetype.*

val freetype = "FreeType".nativeClass(Module.FREETYPE, prefix = "FT", prefixMethod = "FT_", binding = FREETYPE_BINDING) {
    documentation =
        """
        Native bindings to ${url("https://freetype.org/", "FreeType")}, a freely available software library to render fonts.

        It is written in C, designed to be small, efficient, highly customizable, and portable while capable of producing high-quality output (glyph images) of
        most vector and bitmap font formats.

        FreeType is a library that provides access to glyphs in font files. It scales the glyph images and their metrics to a requested size, and it rasterizes
        the glyph images to produce pixel or subpixel alpha coverage bitmaps.

        Note that FreeType is <i>not</i> a text layout engine. You have to use higher-level libraries like HarfBuzz, Pango, or ICU for that.

        Note also that FreeType does <i>not</i> perform alpha blending or compositing the resulting bitmaps or pixmaps by itself. Use your favourite graphics
        library (for example, Cairo or Skia) to further process FreeType's output.

        <h3>HarfBuzz interop</h3>

        The default LWJGL FreeType build includes HarfBuzz and exports its full API. See the HarfBuzz bindings for more information.
        """

    // freetype.h

    customMethod("""
    public static int FT_ENC_TAG(int a, int b, int c, int d) {
        return ((a & 0xFF) << 24) | ((b & 0xFF) << 16) | ((c & 0xFF) << 8) | (d & 0xFF);
    }
    """)

    EnumConstant(
        "{@code FT_Encoding}",

        "ENCODING_NONE".enum("", "FT_ENC_TAG( 0, 0, 0, 0 )"),
        "ENCODING_MS_SYMBOL".enum("", "FT_ENC_TAG( 's', 'y', 'm', 'b' )"),
        "ENCODING_UNICODE".enum("", "FT_ENC_TAG( 'u', 'n', 'i', 'c' )"),
        "ENCODING_SJIS".enum("", "FT_ENC_TAG( 's', 'j', 'i', 's' )"),
        "ENCODING_PRC".enum("", "FT_ENC_TAG( 'g', 'b', ' ', ' ' )"),
        "ENCODING_BIG5".enum("", "FT_ENC_TAG( 'b', 'i', 'g', '5' )"),
        "ENCODING_WANSUNG".enum("", "FT_ENC_TAG( 'w', 'a', 'n', 's' )"),
        "ENCODING_JOHAB".enum("", "FT_ENC_TAG( 'j', 'o', 'h', 'a' )"),
        "ENCODING_GB2312".enum("for backward compatibility", "FT_ENCODING_PRC"),
        "ENCODING_MS_SJIS".enum("for backward compatibility", "FT_ENCODING_SJIS"),
        "ENCODING_MS_GB2312".enum("for backward compatibility", "FT_ENCODING_PRC"),
        "ENCODING_MS_BIG5".enum("for backward compatibility", "FT_ENCODING_BIG5"),
        "ENCODING_MS_WANSUNG".enum("for backward compatibility", "FT_ENCODING_WANSUNG"),
        "ENCODING_MS_JOHAB".enum("for backward compatibility", "FT_ENCODING_JOHAB"),
        "ENCODING_ADOBE_STANDARD".enum("", "FT_ENC_TAG( 'A', 'D', 'O', 'B' )"),
        "ENCODING_ADOBE_EXPERT".enum("", "FT_ENC_TAG( 'A', 'D', 'B', 'E' )"),
        "ENCODING_ADOBE_CUSTOM".enum("", "FT_ENC_TAG( 'A', 'D', 'B', 'C' )"),
        "ENCODING_ADOBE_LATIN_1".enum("", "FT_ENC_TAG( 'l', 'a', 't', '1' )"),
        "ENCODING_OLD_LATIN_2".enum("", "FT_ENC_TAG( 'l', 'a', 't', '2' )"),
        "ENCODING_APPLE_ROMAN".enum("", "FT_ENC_TAG( 'a', 'r', 'm', 'n' )")
    )

    EnumConstant(
        "{@code FT_FACE_FLAG_XXX}",

        "FACE_FLAG_SCALABLE".enum("", "1 <<  0"),
        "FACE_FLAG_FIXED_SIZES".enum("", "1 <<  1"),
        "FACE_FLAG_FIXED_WIDTH".enum("", "1 <<  2"),
        "FACE_FLAG_SFNT".enum("", "1 <<  3"),
        "FACE_FLAG_HORIZONTAL".enum("", "1 <<  4"),
        "FACE_FLAG_VERTICAL".enum("", "1 <<  5"),
        "FACE_FLAG_KERNING".enum("", "1 <<  6"),
        "FACE_FLAG_FAST_GLYPHS".enum("", "1 <<  7"),
        "FACE_FLAG_MULTIPLE_MASTERS".enum("", "1 <<  8"),
        "FACE_FLAG_GLYPH_NAMES".enum("", "1 <<  9"),
        "FACE_FLAG_EXTERNAL_STREAM".enum("", "1 << 10"),
        "FACE_FLAG_HINTER".enum("", "1 << 11"),
        "FACE_FLAG_CID_KEYED".enum("", "1 << 12"),
        "FACE_FLAG_TRICKY".enum("", "1 << 13"),
        "FACE_FLAG_COLOR".enum("", "1 << 14"),
        "FACE_FLAG_VARIATION".enum("", "1 << 15"),
        "FACE_FLAG_SVG".enum("", "1 << 16"),
        "FACE_FLAG_SBIX".enum("", "1 << 17"),
        "FACE_FLAG_SBIX_OVERLAY".enum("", "1 << 18")
    )

    customMethod("""
    public static boolean FT_HAS_HORIZONTAL(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_HORIZONTAL) != 0;
    }

    public static boolean FT_HAS_VERTICAL(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_VERTICAL) != 0;
    }

    public static boolean FT_HAS_KERNING(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_KERNING) != 0;
    }

    public static boolean FT_IS_SCALABLE(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_SCALABLE) != 0;
    }

    public static boolean FT_IS_SFNT(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_SFNT) != 0;
    }

    public static boolean FT_IS_FIXED_WIDTH(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_FIXED_WIDTH) != 0;
    }

    public static boolean FT_HAS_FIXED_SIZES(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_FIXED_SIZES) != 0;
    }

    public static boolean FT_HAS_GLYPH_NAMES(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_GLYPH_NAMES) != 0;
    }

    public static boolean FT_HAS_MULTIPLE_MASTERS(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_MULTIPLE_MASTERS) != 0;
    }

    public static boolean FT_IS_NAMED_INSTANCE(FT_Face face) {
        return (face.face_index() & 0x7FFF0000) != 0;
    }

    public static boolean FT_IS_VARIATION(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_VARIATION) != 0;
    }

    public static boolean FT_IS_CID_KEYED(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_CID_KEYED) != 0;
    }

    public static boolean FT_IS_TRICKY(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_TRICKY) != 0;
    }

    public static boolean FT_HAS_COLOR(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_COLOR) != 0;
    }

    public static boolean FT_HAS_SVG(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_SVG) != 0;
    }

    public static boolean FT_HAS_SBIX(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_SBIX) != 0;
    }

    public static boolean FT_HAS_SBIX_OVERLAY(FT_Face face) {
        return (face.face_flags() & FT_FACE_FLAG_SBIX_OVERLAY) != 0;
    }
    """)

    EnumConstant(
        "{@code FT_STYLE_FLAG_XXX}",

        "STYLE_FLAG_ITALIC".enum("", "1 <<  0"),
        "STYLE_FLAG_BOLD".enum("", "1 <<  1")
    )

    FT_Error(
        "Init_FreeType",
        "",

        Check(1)..FT_Library.p("alibrary", "")
    )

    FT_Error(
        "Done_FreeType",
        "",

        FT_Library("library", "")
    )

    EnumConstant(
        "{@code FT_FFT_OPEN_XXXACE_FLAG_XXX}",

        "OPEN_MEMORY".enum("", "0x1"),
        "OPEN_STREAM".enum("", "0x2"),
        "OPEN_PATHNAME".enum("", "0x4"),
        "OPEN_DRIVER".enum("", "0x8"),
        "OPEN_PARAMS".enum("", "0x10")
    )

    FT_Error(
        "New_Face",
        "",

        FT_Library("library", ""),
        charUTF8.const.p("filepathname", ""),
        FT_Long("face_index", ""),
        Check(1)..FT_Face.p("aface", "")
    )

    FT_Error(
        "New_Memory_Face",
        "",

        FT_Library("library", ""),
        FT_Byte.const.p("file_base", ""),
        AutoSize("file_base")..FT_Long("file_size", ""),
        FT_Long("face_index", ""),
        Check(1)..FT_Face.p("aface", "")
    )

    FT_Error(
        "Open_Face",
        "",

        FT_Library("library", ""),
        FT_Open_Args.const.p("args", ""),
        FT_Long("face_index", ""),
        Check(1)..FT_Face.p("aface", "")
    )

    FT_Error(
        "Attach_File",
        "",

        FT_Face("face", ""),
        charUTF8.const.p("filepathname", "")
    )

    FT_Error(
        "Attach_Stream",
        "",

        FT_Face("face", ""),
        FT_Open_Args.const.p("parameters", "")
    )

    FT_Error(
        "Reference_Face",
        "",

        FT_Face("face", "")
    )

    FT_Error(
        "Done_Face",
        "",

        FT_Face("face", "")
    )

    FT_Error(
        "Select_Size",
        "",

        FT_Face("face", ""),
        FT_Int("strike_index", "")
    )

    EnumConstant(
        "{@code FT_Size_Request_Type}",

        "SIZE_REQUEST_TYPE_NOMINAL".enum("", "0"),
        "SIZE_REQUEST_TYPE_REAL_DIM".enum,
        "SIZE_REQUEST_TYPE_BBOX".enum,
        "SIZE_REQUEST_TYPE_CELL".enum,
        "SIZE_REQUEST_TYPE_SCALES".enum,
        "SIZE_REQUEST_TYPE_MAX".enum
    )

    FT_Error(
        "Request_Size",
        "",

        FT_Face("face", ""),
        FT_Size_Request("req", "")
    )

    FT_Error(
        "Set_Char_Size",
        "",

        FT_Face("face", ""),
        FT_F26Dot6("char_width", ""),
        FT_F26Dot6("char_height", ""),
        FT_UInt("horz_resolution", ""),
        FT_UInt("vert_resolution", "")
    )

    FT_Error(
        "Set_Pixel_Sizes",
        "",

        FT_Face("face", ""),
        FT_UInt("pixel_width", ""),
        FT_UInt("pixel_height", "")
    )

    FT_Error(
        "Load_Glyph",
        "",

        FT_Face("face", ""),
        FT_UInt("glyph_index", ""),
        FT_Int32("load_flags", "")
    )

    FT_Error(
        "Load_Char",
        "",

        FT_Face("face", ""),
        FT_ULong("char_code", ""),
        FT_Int32("load_flags", "")
    )

    EnumConstant(
        "{@code FT_LOAD_XXX}",

        "LOAD_DEFAULT".enum("", "0x0"),
        "LOAD_NO_SCALE".enum("", "1 << 0"),
        "LOAD_NO_HINTING".enum("", "1 << 1"),
        "LOAD_RENDER".enum("", "1 << 2"),
        "LOAD_NO_BITMAP".enum("", "1 << 3"),
        "LOAD_VERTICAL_LAYOUT".enum("", "1 << 4"),
        "LOAD_FORCE_AUTOHINT".enum("", "1 << 5"),
        "LOAD_CROP_BITMAP".enum("", "1 << 6"),
        "LOAD_PEDANTIC".enum("", "1 << 7"),
        "LOAD_IGNORE_GLOBAL_ADVANCE_WIDTH".enum("", "1 << 9"),
        "LOAD_NO_RECURSE".enum("", "1 << 10"),
        "LOAD_IGNORE_TRANSFORM".enum("", "1 << 11"),
        "LOAD_MONOCHROME".enum("", "1 << 12"),
        "LOAD_LINEAR_DESIGN".enum("", "1 << 13"),
        "LOAD_SBITS_ONLY".enum("", "1 << 14"),
        "LOAD_NO_AUTOHINT".enum("", "1 << 15"),
        "LOAD_COLOR".enum("", "1 << 20"),
        "LOAD_COMPUTE_METRICS".enum("", "1 << 21"),
        "LOAD_BITMAP_METRICS_ONLY".enum("", "1 << 22"),
        "LOAD_NO_SVG".enum("", "1 << 24"),
        "LOAD_ADVANCE_ONLY".enum("", "1 << 8"),
        "LOAD_SVG_ONLY".enum("", "1 << 23"),
    )

    customMethod("""
    private static int FT_LOAD_TARGET_(int x) {
        return (x & 15) << 16;
    }

    public static int FT_LOAD_TARGET_MODE(int x) {
        return (x >> 16) & 15;
    }
    """)

    EnumConstant(
        "{@code FT_Render_Mode}",

        "RENDER_MODE_NORMAL".enum("", "0"),
        "RENDER_MODE_LIGHT".enum,
        "RENDER_MODE_MONO".enum,
        "RENDER_MODE_LCD".enum,
        "RENDER_MODE_LCD_V".enum,
        "RENDER_MODE_SDF".enum,
        "RENDER_MODE_MAX".enum
    )

    EnumConstant(
        "{@code FT_LOAD_TARGET_XXX}",

        "FT_LOAD_TARGET_NORMAL".enum("", "FT_LOAD_TARGET_( FT_RENDER_MODE_NORMAL )"),
        "FT_LOAD_TARGET_LIGHT".enum("", "FT_LOAD_TARGET_( FT_RENDER_MODE_LIGHT )"),
        "FT_LOAD_TARGET_MONO".enum("", "FT_LOAD_TARGET_( FT_RENDER_MODE_MONO )"),
        "FT_LOAD_TARGET_LCD".enum("", "FT_LOAD_TARGET_( FT_RENDER_MODE_LCD )"),
        "FT_LOAD_TARGET_LCD_V".enum("", "FT_LOAD_TARGET_( FT_RENDER_MODE_LCD_V )"),
    )

    void(
        "Set_Transform",
        "",

        FT_Face("face", ""),
        nullable..FT_Matrix.p("matrix", ""),
        nullable..FT_Vector.p("delta", "")
    )

    void(
        "Get_Transform",
        "",

        FT_Face("face", ""),
        nullable..FT_Matrix.p("matrix", ""),
        nullable..FT_Vector.p("delta", "")
    )

    FT_Error(
        "Render_Glyph",
        "",

        FT_GlyphSlot("slot", ""),
        FT_Render_Mode("render_mode", "")
    )

    EnumConstant(
        "{@code FT_Kerning_Mode}",

        "KERNING_DEFAULT".enum("", "0"),
        "KERNING_UNFITTED".enum,
        "KERNING_UNSCALED".enum
    )

    FT_Error(
        "Get_Kerning",
        "",

        FT_Face("face", ""),
        FT_UInt("left_glyph", ""),
        FT_UInt("right_glyph", ""),
        FT_UInt("kern_mode", ""),
        FT_Vector.p("akerning", "")
    )

    FT_Error(
        "Get_Track_Kerning",
        "",

        FT_Face("face", ""),
        FT_Fixed("point_size", ""),
        FT_Int("degree", ""),
        Check(1)..FT_Fixed.p("akerning", "")
    )

    FT_Error(
        "Select_Charmap",
        "",

        FT_Face("face", ""),
        FT_Encoding("encoding", "")
    )

    FT_Error(
        "Set_Charmap",
        "",

        FT_Face("face", ""),
        FT_CharMap("charmap", "")
    )

    FT_Int(
        "Get_Charmap_Index",
        "",

        FT_CharMap("charmap", "")
    )

    FT_UInt(
        "Get_Char_Index",
        "",

        FT_Face("face", ""),
        FT_ULong("charcode", "")
    )

    FT_ULong(
        "Get_First_Char",
        "",

        FT_Face("face", ""),
        Check(1)..FT_UInt.p("agindex", "")
    )

    FT_ULong(
        "Get_Next_Char",
        "",

        FT_Face("face", ""),
        FT_ULong("char_code", ""),
        Check(1)..FT_UInt.p("agindex", ""),

        returnDoc = ": The charmap's next character code"
    )

    FT_Error(
        "Face_Properties",
        "",

        FT_Face("face", ""),
        AutoSize("properties")..FT_UInt("num_properties", ""),
        FT_Parameter.p("properties", "")
    )

    FT_UInt(
        "Get_Name_Index",
        "",

        FT_Face("face", ""),
        FT_String.const.p("glyph_name", "")
    )

    FT_Error(
        "Get_Glyph_Name",
        "",

        FT_Face("face", ""),
        FT_UInt("glyph_index", ""),
        FT_Pointer("buffer", ""),
        AutoSize("buffer")..FT_UInt("buffer_max", "")
    )

    charASCII.const.p(
        "Get_Postscript_Name",
        "",

        FT_Face("face", "")
    )

    EnumConstant(
        "{@code FT_SUBGLYPH_FLAG_XXX}",

        "SUBGLYPH_FLAG_ARGS_ARE_WORDS".enum("", "1"),
        "SUBGLYPH_FLAG_ARGS_ARE_XY_VALUES".enum("", "2"),
        "SUBGLYPH_FLAG_ROUND_XY_TO_GRID".enum("", "4"),
        "SUBGLYPH_FLAG_SCALE".enum("", "8"),
        "SUBGLYPH_FLAG_XY_SCALE".enum("", "0x40"),
        "SUBGLYPH_FLAG_2X2".enum("", "0x80"),
        "SUBGLYPH_FLAG_USE_MY_METRICS".enum("", "0x200")
    )

    FT_Error(
        "Get_SubGlyph_Info",
        "",

        FT_GlyphSlot("glyph", ""),
        FT_UInt("sub_index", ""),
        Check(1)..FT_Int.p("p_index", ""),
        Check(1)..FT_UInt.p("p_flags", ""),
        Check(1)..FT_Int.p("p_arg1", ""),
        Check(1)..FT_Int.p("p_arg2", ""),
        FT_Matrix.p("p_transform", "")
    )

    EnumConstant(
        "{@code FT_FSTYPE_XXX}",

        "FSTYPE_INSTALLABLE_EMBEDDING".enum("", "0x0000"),
        "FSTYPE_RESTRICTED_LICENSE_EMBEDDING".enum("", "0x0002"),
        "FSTYPE_PREVIEW_AND_PRINT_EMBEDDING".enum("", "0x0004"),
        "FSTYPE_EDITABLE_EMBEDDING".enum("", "0x0008"),
        "FSTYPE_NO_SUBSETTING".enum("", "0x0100"),
        "FSTYPE_BITMAP_EMBEDDING_ONLY".enum("", "0x0200")
    )

    FT_UShort(
        "Get_FSType_Flags",
        "",

        FT_Face("face", "")
    )

    FT_UInt(
        "Face_GetCharVariantIndex",
        "",

        FT_Face("face", ""),
        FT_ULong("charcode", ""),
        FT_ULong("variantSelector", "")
    )

    FT_Int(
        "Face_GetCharVariantIsDefault",
        "",

        FT_Face("face", ""),
        FT_ULong("charcode", ""),
        FT_ULong("variantSelector", "")
    )

    // TODO: NullTerminated support here?
    "FT_UInt32".opaque.p(
        "Face_GetVariantSelectors",
        "",

        FT_Face("face", "")
    )

    // TODO:
    "FT_UInt32".opaque.p(
        "Face_GetVariantsOfChar",
        "",

        FT_Face("face", ""),
        FT_ULong("charcode", "")
    )

    // TODO:
    "FT_UInt32".opaque.p(
        "Face_GetCharsOfVariant",
        "",

        FT_Face("face", ""),
        FT_ULong("variantSelector", "")
    )

    FT_Long(
        "MulDiv",
        "",

        FT_Long("a", ""),
        FT_Long("b", ""),
        FT_Long("c", "")
    )

    FT_Long(
        "MulFix",
        "",

        FT_Long("a", ""),
        FT_Long("b", "")
    )

    FT_Long(
        "DivFix",
        "",

        FT_Long("a", ""),
        FT_Long("b", "")
    )

    FT_Fixed(
        "RoundFix",
        "",

        FT_Fixed("a", "")
    )

    FT_Fixed(
        "CeilFix",
        "",

        FT_Fixed("a", "")
    )

    FT_Fixed(
        "FloorFix",
        "",

        FT_Fixed("a", "")
    )

    void(
        "Vector_Transform",
        "",

        FT_Vector.p("vector", ""),
        FT_Matrix.const.p("matrix", "")
    )

    IntConstant("", "FREETYPE_MAJOR".."2").noPrefix()
    IntConstant("", "FREETYPE_MINOR".."13").noPrefix()
    IntConstant("", "FREETYPE_PATCH".."2").noPrefix()

    void(
        "Library_Version",
        "",

        FT_Library("library", ""),
        Check(1)..FT_Int.p("amajor", ""),
        Check(1)..FT_Int.p("aminor", ""),
        Check(1)..FT_Int.p("apatch", "")
    )

    FT_Bool(
        "Face_CheckTrueTypePatents",
        "",

        FT_Face("face", "")
    )

    FT_Bool(
        "Face_SetUnpatentedHinting",
        "",

        FT_Face("face", ""),
        FT_Bool("value", "")
    )

    // ftadvanc.h

    IntConstant("", "ADVANCE_FLAG_FAST_ONLY".."0x20000000")

    FT_Error(
        "Get_Advance",
        "",

        FT_Face("face", ""),
        FT_UInt("gindex", ""),
        FT_Int32("load_flags", ""),
        Check(1)..FT_Fixed.p("padvance", "")
    )

    FT_Error(
        "Get_Advances",
        "",

        FT_Face("face", ""),
        FT_UInt("start", ""),
        AutoSize("padvances")..FT_UInt("count", ""),
        FT_Int32("load_flags", ""),
        FT_Fixed.p("padvances", "")
    )

    // ftbbox.h

    FT_Error(
        "Outline_Get_BBox",
        "",

        FT_Outline.p("outline", ""),
        FT_BBox.p("abbox", "")
    )

    // ftbdf.h

    EnumConstant(
        "{@code BDF_PropertyType}",

        "BDF_PROPERTY_TYPE_NONE".enum("", "0"),
        "BDF_PROPERTY_TYPE_ATOM".enum,
        "BDF_PROPERTY_TYPE_INTEGER".enum,
        "BDF_PROPERTY_TYPE_CARDINAL".enum
    ).noPrefix()

    FT_Error(
        "Get_BDF_Charset_ID",
        "",

        FT_Face("face", ""),
        Check(1)..char.const.p.p("acharset_encoding", ""),
        Check(1)..char.const.p.p("acharset_registry", "")
    )

    FT_Error(
        "Get_BDF_Property",
        "",

        FT_Face("face", ""),
        charASCII.const.p("prop_name", ""),
        BDF_PropertyRec.p("aproperty", "")
    )

    // ftbitmap.h

    void(
        "Bitmap_Init",
        "",

        FT_Bitmap.p("abitmap", "")
    )

    FT_Error(
        "Bitmap_Copy",
        "",

        FT_Library("library", ""),
        FT_Bitmap.const.p("source", ""),
        FT_Bitmap.p("target", "")
    )

    FT_Error(
        "Bitmap_Embolden",
        "",

        FT_Library("library", ""),
        FT_Bitmap.p("bitmap", ""),
        FT_Pos("xStrength", ""),
        FT_Pos("yStrength", "")
    )

    FT_Error(
        "Bitmap_Convert",
        "",

        FT_Library("library", ""),
        FT_Bitmap.const.p("source", ""),
        FT_Bitmap.p("target", ""),
        FT_Int("alignment", "")
    )

    FT_Error(
        "Bitmap_Blend",
        "",

        FT_Library("library", ""),
        FT_Bitmap.const.p("source", ""),
        FT_Vector.const("source_offset", ""),
        FT_Bitmap.p("target", ""),
        FT_Vector.p("atarget_offset", ""),
        FT_Color("color", "")
    )

    FT_Error(
        "GlyphSlot_Own_Bitmap",
        "",

        FT_GlyphSlot("slot", "")
    )

    FT_Error(
        "Bitmap_Done",
        "",

        FT_Library("library", ""),
        FT_Bitmap.p("bitmap", "")
    )

    // ftbzip2.h

    IgnoreMissing..FT_Error(
        "Stream_OpenBzip2",
        "",

        FT_Stream("stream", ""),
        FT_Stream("source", "")
    )

    FT_Error(
        "FTC_Manager_New",
        "",

        FT_Library("library", ""),
        FT_UInt("max_faces", ""),
        FT_UInt("max_sizes", ""),
        FT_ULong("max_bytes", ""),
        FTC_Face_Requester("requester", ""),
        Unsafe..nullable..FT_Pointer("req_data", ""),
        Check(1)..FTC_Manager.p("amanager", ""),

        noPrefix = true
    )

    void(
        "FTC_Manager_Reset",
        "",

        FTC_Manager("manager", ""),

        noPrefix = true
    )

    void(
        "FTC_Manager_Done",
        "",

        FTC_Manager("manager", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_Manager_LookupFace",
        "",

        FTC_Manager("manager", ""),
        FTC_FaceID("face_id", ""),
        Check(1)..FT_Face.p("aface", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_Manager_LookupSize",
        "",

        FTC_Manager("manager", ""),
        FTC_Scaler("scaler", ""),
        Check(1)..FT_Size.p("asize", ""),

        noPrefix = true
    )

    void(
        "FTC_Node_Unref",
        "",

        FTC_Node("node", ""),
        FTC_Manager("manager", ""),

        noPrefix = true
    )

    void(
        "FTC_Manager_RemoveFaceID",
        "",

        FTC_Manager("manager", ""),
        FTC_FaceID("face_id", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_CMapCache_New",
        "",

        FTC_Manager("manager", ""),
        Check(1)..FTC_CMapCache.p("acache", ""),

        noPrefix = true
    )

    FT_UInt(
        "FTC_CMapCache_Lookup",
        "",

        FTC_CMapCache("cache", ""),
        FTC_FaceID("face_id", ""),
        FT_Int("cmap_index", ""),
        FT_UInt32("char_code", ""),

        noPrefix = true
    )

    customMethod("""
    public static boolean FTC_IMAGE_TYPE_COMPARE(FTC_ImageType d1, FTC_ImageType d2) {
        return d1.face_id() == d2.face_id() && d1.width() == d2.width() && d1.flags() == d2.flags();
    }
    """)

    FT_Error(
        "FTC_ImageCache_New",
        "",

        FTC_Manager("manager", ""),
        Check(1)..FTC_ImageCache.p("acache", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_ImageCache_Lookup",
        "",

        FTC_ImageCache("cache", ""),
        FTC_ImageType("type", ""),
        FT_UInt("gindex", ""),
        Check(1)..FT_Glyph.p("aglyph", ""),
        Check(1)..nullable..FTC_Node.p("anode", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_ImageCache_LookupScaler",
        "",

        FTC_ImageCache("cache", ""),
        FTC_Scaler("scaler", ""),
        FT_ULong("load_flags", ""),
        FT_UInt("gindex", ""),
        Check(1)..FT_Glyph.p("aglyph", ""),
        Check(1)..nullable..FTC_Node.p("anode", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_SBitCache_New",
        "",

        FTC_Manager("manager", ""),
        Check(1)..FTC_SBitCache.p("acache", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_SBitCache_Lookup",
        "",

        FTC_SBitCache("cache", ""),
        FTC_ImageType("type", ""),
        FT_UInt("gindex", ""),
        Check(1)..FTC_SBit.p("sbit", ""),
        Check(1)..nullable..FTC_Node.p("anode", ""),

        noPrefix = true
    )

    FT_Error(
        "FTC_SBitCache_LookupScaler",
        "",

        FTC_SBitCache("cache", ""),
        FTC_Scaler("scaler", ""),
        FT_ULong("load_flags", ""),
        FT_UInt("gindex", ""),
        Check(1)..FTC_SBit.p("sbit", ""),
        Check(1)..nullable..FTC_Node.p("anode", ""),

        noPrefix = true
    )

    // ftcid.h

    FT_Error(
        "Get_CID_Registry_Ordering_Supplement",
        "",

        FT_Face("face", ""),
        Check(1)..char.const.p.p("registry", ""),
        Check(1)..char.const.p.p("ordering", ""),
        Check(1)..FT_Int.p("supplement", "")
    )

    FT_Error(
        "Get_CID_Is_Internally_CID_Keyed",
        "",

        FT_Face("face", ""),
        Check(1)..FT_Bool.p("is_cid", "")
    )

    FT_Error(
        "Get_CID_From_Glyph_Index",
        "",

        FT_Face("face", ""),
        FT_UInt("glyph_index", ""),
        Check(1)..FT_UInt.p("cid", "")
    )

    // ftcolor.h

    EnumConstant(
        "{@code FT_PALETTE_XXX}",

        "PALETTE_FOR_LIGHT_BACKGROUND".enum("", "0x01"),
        "PALETTE_FOR_DARK_BACKGROUND".enum("", "0x02")
    )

    FT_Error(
        "Palette_Data_Get",
        "",

        FT_Face("face", ""),
        FT_Palette_Data.p("apalette", "")
    )

    FT_Error(
        "Palette_Select",
        "",

        FT_Face("face", ""),
        FT_UShort("palette_index", ""),
        Check(1)..nullable..FT_Color.p.p("apalette", "")
    )

    FT_Error(
        "Palette_Set_Foreground_Color",
        "",

        FT_Face("face", ""),
        FT_Color("foreground_color", "")
    )

    FT_Bool(
        "Get_Color_Glyph_Layer",
        "",

        FT_Face("face", ""),
        FT_UInt("base_glyph", ""),
        Check(1)..FT_UInt.p("aglyph_index", ""),
        Check(1)..FT_UInt.p("acolor_index", ""),
        FT_LayerIterator.p("iterator", "")
    )

    EnumConstant(
        "{@code FT_PaintFormat}",

        "COLR_PAINTFORMAT_COLR_LAYERS".enum("", "1"),
        "COLR_PAINTFORMAT_SOLID".enum,
        "COLR_PAINTFORMAT_LINEAR_GRADIENT".enum("", "4"),
        "COLR_PAINTFORMAT_RADIAL_GRADIENT".enum("", "6"),
        "COLR_PAINTFORMAT_SWEEP_GRADIENT".enum("", "8"),
        "COLR_PAINTFORMAT_GLYPH".enum("", "10"),
        "COLR_PAINTFORMAT_COLR_GLYPH".enum,
        "COLR_PAINTFORMAT_TRANSFORM".enum,
        "COLR_PAINTFORMAT_TRANSLATE".enum("", "14"),
        "COLR_PAINTFORMAT_SCALE".enum("", "16"),
        "COLR_PAINTFORMAT_ROTATE".enum("", "24"),
        "COLR_PAINTFORMAT_SKEW".enum("", "28"),
        "COLR_PAINTFORMAT_COMPOSITE".enum("", "32"),
        "COLR_PAINT_FORMAT_MAX".enum,
        "COLR_PAINTFORMAT_UNSUPPORTED".enum("", "255")
    )

    EnumConstant(
        "{@code FT_PaintExtend}",

        "COLR_PAINT_EXTEND_PAD".enum("", "0"),
        "COLR_PAINT_EXTEND_REPEAT".enum,
        "COLR_PAINT_EXTEND_REFLECT".enum
    )

    EnumConstant(
        "{@code FT_Composite_Mode}",

        "COLR_COMPOSITE_CLEAR".enum("", "0"),
        "COLR_COMPOSITE_SRC".enum,
        "COLR_COMPOSITE_DEST".enum,
        "COLR_COMPOSITE_SRC_OVER".enum,
        "COLR_COMPOSITE_DEST_OVER".enum,
        "COLR_COMPOSITE_SRC_IN".enum,
        "COLR_COMPOSITE_DEST_IN".enum,
        "COLR_COMPOSITE_SRC_OUT".enum,
        "COLR_COMPOSITE_DEST_OUT".enum,
        "COLR_COMPOSITE_SRC_ATOP".enum,
        "COLR_COMPOSITE_DEST_ATOP".enum,
        "COLR_COMPOSITE_XOR".enum,
        "COLR_COMPOSITE_PLUS".enum,
        "COLR_COMPOSITE_SCREEN".enum,
        "COLR_COMPOSITE_OVERLAY".enum,
        "COLR_COMPOSITE_DARKEN".enum,
        "COLR_COMPOSITE_LIGHTEN".enum,
        "COLR_COMPOSITE_COLOR_DODGE".enum,
        "COLR_COMPOSITE_COLOR_BURN".enum,
        "COLR_COMPOSITE_HARD_LIGHT".enum,
        "COLR_COMPOSITE_SOFT_LIGHT".enum,
        "COLR_COMPOSITE_DIFFERENCE".enum,
        "COLR_COMPOSITE_EXCLUSION".enum,
        "COLR_COMPOSITE_MULTIPLY".enum,
        "COLR_COMPOSITE_HSL_HUE".enum,
        "COLR_COMPOSITE_HSL_SATURATION".enum,
        "COLR_COMPOSITE_HSL_COLOR".enum,
        "COLR_COMPOSITE_HSL_LUMINOSITY".enum,
        "COLR_COMPOSITE_MAX".enum
    )

    EnumConstant(
        "{@code FT_Color_Root_Transform}",

        "COLOR_INCLUDE_ROOT_TRANSFORM".enum("", "0"),
        "COLOR_NO_ROOT_TRANSFORM".enum,
        "COLOR_ROOT_TRANSFORM_MAX".enum
    )

    FT_Bool(
        "Get_Color_Glyph_Paint",
        "",

        FT_Face("face", ""),
        FT_UInt("base_glyph", ""),
        FT_Color_Root_Transform("root_transform", ""),
        FT_OpaquePaint.p("paint", "")
    )

    FT_Bool(
        "Get_Color_Glyph_ClipBox",
        "",

        FT_Face("face", ""),
        FT_UInt("base_glyph", ""),
        FT_ClipBox.p("clip_box", "")
    )

    FT_Bool(
        "Get_Paint_Layers",
        "",

        FT_Face("face", ""),
        FT_LayerIterator.p("iterator", ""),
        FT_OpaquePaint.p("paint", "")
    )

    FT_Bool(
        "Get_Colorline_Stops",
        "",

        FT_Face("face", ""),
        FT_ColorStop.p("color_stop", ""),
        FT_ColorStopIterator.p("iterator", "")
    )

    FT_Bool(
        "Get_Paint",
        "",

        FT_Face("face", ""),
        FT_OpaquePaint("opaque_paint", ""),
        FT_COLR_Paint.p("paint", "")
    )

    // ftdriver.h

    EnumConstant(
        "{@code FT_HINTING_XXX}",

        "HINTING_FREETYPE".enum("", "0"),
        "HINTING_ADOBE".enum
    )

    IntConstant("", "TT_INTERPRETER_VERSION_35".."35").noPrefix()
    IntConstant("", "TT_INTERPRETER_VERSION_38".."38").noPrefix()
    IntConstant("", "TT_INTERPRETER_VERSION_40".."40").noPrefix()

    EnumConstant(
        "{@code FT_AUTOHINTER_SCRIPT_XXX}",

        "AUTOHINTER_SCRIPT_NONE".enum("", "0"),
        "AUTOHINTER_SCRIPT_LATIN".enum,
        "AUTOHINTER_SCRIPT_CJK".enum,
        "AUTOHINTER_SCRIPT_INDIC".enum
    )
    
    // fterrdef.h

    EnumConstant(
        "{@code FT_Err_XXX}",

        "Err_Ok".enum("", "0x00"),
        "Err_Cannot_Open_Resource".enum("", "0x01"),
        "Err_Unknown_File_Format".enum("", "0x02"),
        "Err_Invalid_File_Format".enum("", "0x03"),
        "Err_Invalid_Version".enum("", "0x04"),
        "Err_Lower_Module_Version".enum("", "0x05"),
        "Err_Invalid_Argument".enum("", "0x06"),
        "Err_Unimplemented_Feature".enum("", "0x07"),
        "Err_Invalid_Table".enum("", "0x08"),
        "Err_Invalid_Offset".enum("", "0x09"),
        "Err_Array_Too_Large".enum("", "0x0A"),
        "Err_Missing_Module".enum("", "0x0B"),
        "Err_Missing_Property".enum("", "0x0C"),
        "Err_Invalid_Glyph_Index".enum("", "0x10"),
        "Err_Invalid_Character_Code".enum("", "0x11"),
        "Err_Invalid_Glyph_Format".enum("", "0x12"),
        "Err_Cannot_Render_Glyph".enum("", "0x13"),
        "Err_Invalid_Outline".enum("", "0x14"),
        "Err_Invalid_Composite".enum("", "0x15"),
        "Err_Too_Many_Hints".enum("", "0x16"),
        "Err_Invalid_Pixel_Size".enum("", "0x17"),
        "Err_Invalid_SVG_Document".enum("", "0x18"),
        "Err_Invalid_Handle".enum("", "0x20"),
        "Err_Invalid_Library_Handle".enum("", "0x21"),
        "Err_Invalid_Driver_Handle".enum("", "0x22"),
        "Err_Invalid_Face_Handle".enum("", "0x23"),
        "Err_Invalid_Size_Handle".enum("", "0x24"),
        "Err_Invalid_Slot_Handle".enum("", "0x25"),
        "Err_Invalid_CharMap_Handle".enum("", "0x26"),
        "Err_Invalid_Cache_Handle".enum("", "0x27"),
        "Err_Invalid_Stream_Handle".enum("", "0x28"),
        "Err_Too_Many_Drivers".enum("", "0x30"),
        "Err_Too_Many_Extensions".enum("", "0x31"),
        "Err_Out_Of_Memory".enum("", "0x40"),
        "Err_Unlisted_Object".enum("", "0x41"),
        "Err_Cannot_Open_Stream".enum("", "0x51"),
        "Err_Invalid_Stream_Seek".enum("", "0x52"),
        "Err_Invalid_Stream_Skip".enum("", "0x53"),
        "Err_Invalid_Stream_Read".enum("", "0x54"),
        "Err_Invalid_Stream_Operation".enum("", "0x55"),
        "Err_Invalid_Frame_Operation".enum("", "0x56"),
        "Err_Nested_Frame_Access".enum("", "0x57"),
        "Err_Invalid_Frame_Read".enum("", "0x58"),
        "Err_Raster_Uninitialized".enum("", "0x60"),
        "Err_Raster_Corrupted".enum("", "0x61"),
        "Err_Raster_Overflow".enum("", "0x62"),
        "Err_Raster_Negative_Height".enum("", "0x63"),
        "Err_Too_Many_Caches".enum("", "0x70"),
        "Err_Invalid_Opcode".enum("", "0x80"),
        "Err_Too_Few_Arguments".enum("", "0x81"),
        "Err_Stack_Overflow".enum("", "0x82"),
        "Err_Code_Overflow".enum("", "0x83"),
        "Err_Bad_Argument".enum("", "0x84"),
        "Err_Divide_By_Zero".enum("", "0x85"),
        "Err_Invalid_Reference".enum("", "0x86"),
        "Err_Debug_OpCode".enum("", "0x87"),
        "Err_ENDF_In_Exec_Stream".enum("", "0x88"),
        "Err_Nested_DEFS".enum("", "0x89"),
        "Err_Invalid_CodeRange".enum("", "0x8A"),
        "Err_Execution_Too_Long".enum("", "0x8B"),
        "Err_Too_Many_Function_Defs".enum("", "0x8C"),
        "Err_Too_Many_Instruction_Defs".enum("", "0x8D"),
        "Err_Table_Missing".enum("", "0x8E"),
        "Err_Horiz_Header_Missing".enum("", "0x8F"),
        "Err_Locations_Missing".enum("", "0x90"),
        "Err_Name_Table_Missing".enum("", "0x91"),
        "Err_CMap_Table_Missing".enum("", "0x92"),
        "Err_Hmtx_Table_Missing".enum("", "0x93"),
        "Err_Post_Table_Missing".enum("", "0x94"),
        "Err_Invalid_Horiz_Metrics".enum("", "0x95"),
        "Err_Invalid_CharMap_Format".enum("", "0x96"),
        "Err_Invalid_PPem".enum("", "0x97"),
        "Err_Invalid_Vert_Metrics".enum("", "0x98"),
        "Err_Could_Not_Find_Context".enum("", "0x99"),
        "Err_Invalid_Post_Table_Format".enum("", "0x9A"),
        "Err_Invalid_Post_Table".enum("", "0x9B"),
        "Err_DEF_In_Glyf_Bytecode".enum("", "0x9C"),
        "Err_Missing_Bitmap".enum("", "0x9D"),
        "Err_Missing_SVG_Hooks".enum("", "0x9E"),
        "Err_Syntax_Error".enum("", "0xA0"),
        "Err_Stack_Underflow".enum("", "0xA1"),
        "Err_Ignore".enum("", "0xA2"),
        "Err_No_Unicode_Glyph_Name".enum("", "0xA3"),
        "Err_Glyph_Too_Big".enum("", "0xA4"),
        "Err_Missing_Startfont_Field".enum("", "0xB0"),
        "Err_Missing_Font_Field".enum("", "0xB1"),
        "Err_Missing_Size_Field".enum("", "0xB2"),
        "Err_Missing_Fontboundingbox_Field".enum("", "0xB3"),
        "Err_Missing_Chars_Field".enum("", "0xB4"),
        "Err_Missing_Startchar_Field".enum("", "0xB5"),
        "Err_Missing_Encoding_Field".enum("", "0xB6"),
        "Err_Missing_Bbx_Field".enum("", "0xB7"),
        "Err_Bbx_Too_Big".enum("", "0xB8"),
        "Err_Corrupted_Font_Header".enum("", "0xB9"),
        "Err_Corrupted_Font_Glyphs".enum("", "0xBA"),
        "Err_Max".enum("", "187")
    )

    // fterrors.h

    charASCII.const.p(
        "Error_String",
        "",

        FT_Error("error_code", "")
    )

    // ftfntfmt.h

    charASCII.const.p(
        "Get_Font_Format",
        "",

        FT_Face("face", "")
    )

    // ftgasp.h

    EnumConstant(
        "{@code FT_GASP_XXX}",

        "GASP_NO_TABLE".enum("", "-1"),
        "GASP_DO_GRIDFIT".enum("", "0x01"),
        "GASP_DO_GRAY".enum("", "0x02"),
        "GASP_SYMMETRIC_GRIDFIT".enum("", "0x04"),
        "GASP_SYMMETRIC_SMOOTHING".enum("", "0x08")
    )

    FT_Int(
        "Get_Gasp",
        "",

        FT_Face("face", ""),
        FT_UInt("ppem", "")
    )

    // ftglyph.h

    FT_Error(
        "New_Glyph",
        "",

        FT_Library("library", ""),
        FT_Glyph_Format("format", ""),
        Check(1)..FT_Glyph.p("aglyph", "")
    )

    FT_Error(
        "Get_Glyph",
        "",

        FT_GlyphSlot("slot", ""),
        Check(1)..FT_Glyph.p("aglyph", "")
    )

    FT_Error(
        "Glyph_Copy",
        "",

        FT_Glyph("source", ""),
        Check(1)..FT_Glyph.p("target", "")
    )

    FT_Error(
        "Glyph_Transform",
        "",

        FT_Glyph("glyph", ""),
        nullable..FT_Matrix.const.p("matrix", ""),
        nullable..FT_Vector.const.p("delta", "")
    )

    EnumConstant(
        "{@code FT_Glyph_BBox_Mode}",

        "GLYPH_BBOX_UNSCALED".enum("", "0"),
        "GLYPH_BBOX_SUBPIXELS".enum("", "0"),
        "GLYPH_BBOX_GRIDFIT".enum,
        "GLYPH_BBOX_TRUNCATE".enum,
        "GLYPH_BBOX_PIXELS".enum
    )

    void(
        "Glyph_Get_CBox",
        "",

        FT_Glyph("glyph", ""),
        FT_UInt("bbox_mode", ""),
        FT_BBox.p("acbox", "")
    )

    FT_Error(
        "Glyph_To_Bitmap",
        "",

        Check(1)..FT_Glyph.p("the_glyph", ""),
        FT_Render_Mode("render_mode", ""),
        nullable..FT_Vector.const.p("origin", ""),
        FT_Bool("destroy", "")
    )

    void(
        "Done_Glyph",
        "",

        nullable..FT_Glyph("glyph", "")
    )

    void(
        "Matrix_Multiply",
        "",

        FT_Matrix.const.p("a", ""),
        FT_Matrix.p("b", "")
    )

    FT_Error(
        "Matrix_Invert",
        "",

        FT_Matrix.p("matrix", "")
    )

    // ftgxval.h

    IntConstant("", "VALIDATE_feat_INDEX".."0")
    IntConstant("", "VALIDATE_mort_INDEX".."1")
    IntConstant("", "VALIDATE_morx_INDEX".."2")
    IntConstant("", "VALIDATE_bsln_INDEX".."3")
    IntConstant("", "VALIDATE_just_INDEX".."4")
    IntConstant("", "VALIDATE_kern_INDEX".."5")
    IntConstant("", "VALIDATE_opbd_INDEX".."6")
    IntConstant("", "VALIDATE_trak_INDEX".."7")
    IntConstant("", "VALIDATE_prop_INDEX".."8")
    IntConstant("", "VALIDATE_lcar_INDEX".."9")
    IntConstant("", "VALIDATE_GX_LAST_INDEX".."FT_VALIDATE_lcar_INDEX")
    IntConstant("", "VALIDATE_GX_LENGTH".."FT_VALIDATE_GX_LAST_INDEX + 1")
    IntConstant("", "VALIDATE_GX_START".."0x4000")

    IntConstant("", "VALIDATE_feat".."FT_VALIDATE_GX_START << 0")
    IntConstant("", "VALIDATE_mort".."FT_VALIDATE_GX_START << 1")
    IntConstant("", "VALIDATE_morx".."FT_VALIDATE_GX_START << 2")
    IntConstant("", "VALIDATE_bsln".."FT_VALIDATE_GX_START << 3")
    IntConstant("", "VALIDATE_just".."FT_VALIDATE_GX_START << 4")
    IntConstant("", "VALIDATE_kern".."FT_VALIDATE_GX_START << 5")
    IntConstant("", "VALIDATE_opbd".."FT_VALIDATE_GX_START << 6")
    IntConstant("", "VALIDATE_trak".."FT_VALIDATE_GX_START << 7")
    IntConstant("", "VALIDATE_prop".."FT_VALIDATE_GX_START << 8")
    IntConstant("", "VALIDATE_lcar".."FT_VALIDATE_GX_START << 9")
    IntConstant("", "FT_VALIDATE_GX".."""
        FT_VALIDATE_feat |
        FT_VALIDATE_mort |
        FT_VALIDATE_morx |
        FT_VALIDATE_bsln |
        FT_VALIDATE_just |
        FT_VALIDATE_kern |
        FT_VALIDATE_opbd |
        FT_VALIDATE_trak |
        FT_VALIDATE_prop |
        FT_VALIDATE_lcar""")

    FT_Error(
        "TrueTypeGX_Validate",
        "",

        FT_Face("face", ""),
        FT_UInt("validation_flags", ""),
        FT_Bytes.p("tables", ""),
        AutoSize("tables")..FT_UInt("table_length", "")
    )

    void(
        "TrueTypeGX_Free",
        "",

        FT_Face("face", ""),
        Unsafe..FT_Bytes("table", "")
    )

    EnumConstant(
        "{@code FT_VALIDATE_CKERNXXX}",

        "VALIDATE_MS".enum("", "FT_VALIDATE_GX_START << 0"),
        "VALIDATE_APPLE".enum("", "FT_VALIDATE_GX_START << 1"),
        "VALIDATE_CKERN".enum("", "FT_VALIDATE_MS | FT_VALIDATE_APPLE")
    )

    FT_Error(
        "ClassicKern_Validate",
        "",

        FT_Face("face", ""),
        FT_UInt("validation_flags", ""),
        Check(1)..FT_Bytes.p("ckern_table", "")
    )

    void(
        "ClassicKern_Free",
        "",

        FT_Face("face", ""),
        Unsafe..FT_Bytes("table", "")
    )

    // ftgzip.h

    FT_Error(
        "Stream_OpenGzip",
        "",

        FT_Stream("stream", ""),
        FT_Stream("source", "")
    )

    FT_Error(
        "Gzip_Uncompress",
        "",

        FT_Memory("memory", ""),
        FT_Byte.p("output", ""),
        AutoSize("output")..Check(1)..FT_ULong.p("output_len", ""),
        FT_Byte.const.p("input", ""),
        AutoSize("input")..FT_ULong("input_len", "")
    )

    // ftimage.h

    EnumConstant(
        "{@code FT_Pixel_Mode}",

        "PIXEL_MODE_NONE".enum("", "0"),
        "PIXEL_MODE_MONO".enum,
        "PIXEL_MODE_GRAY".enum,
        "PIXEL_MODE_GRAY2".enum,
        "PIXEL_MODE_GRAY4".enum,
        "PIXEL_MODE_LCD".enum,
        "PIXEL_MODE_LCD_V".enum,
        "PIXEL_MODE_BGRA".enum,
        "PIXEL_MODE_MAX".enum
    )

    IntConstant("",
        "OUTLINE_CONTOURS_MAX".."0xFFFF",
        "OUTLINE_POINTS_MAX".."0xFFFF"
    )

    EnumConstant(
        "",

        "OUTLINE_NONE".enum("", "0x0"),
        "OUTLINE_OWNER".enum("", "0x1"),
        "OUTLINE_EVEN_ODD_FILL".enum("", "0x2"),
        "OUTLINE_REVERSE_FILL".enum("", "0x4"),
        "OUTLINE_IGNORE_DROPOUTS".enum("", "0x8"),
        "OUTLINE_SMART_DROPOUTS".enum("", "0x10"),
        "OUTLINE_INCLUDE_STUBS".enum("", "0x20"),
        "OUTLINE_OVERLAP".enum("", "0x40"),
        "OUTLINE_HIGH_PRECISION".enum("", "0x100"),
        "OUTLINE_SINGLE_PASS".enum("", "0x200"),
    )

    customMethod("""
    public static int FT_CURVE_TAG(int flag) {
        return flag & 0x03;
    }""")

    IntConstant(
        "",

        "CURVE_TAG_ON".."0x01",
        "CURVE_TAG_CONIC".."0x00",
        "CURVE_TAG_CUBIC".."0x02",
        "CURVE_TAG_HAS_SCANMODE".."0x04",
        "CURVE_TAG_TOUCH_X".."0x08",
        "CURVE_TAG_TOUCH_Y".."0x10",
        "CURVE_TAG_TOUCH_BOTH".."FT_CURVE_TAG_TOUCH_X | FT_CURVE_TAG_TOUCH_Y"
    )

    customMethod("""
    public static int FT_IMAGE_TAG(int _x1, int _x2, int _x3, int _x4) {
        return ((_x1 & 0xFF) << 24) | ((_x2 & 0xFF) << 16) | ((_x3 & 0xFF) << 8) | (_x4 & 0xFF);
    }
    """)

    EnumConstant(
        "{@code FT_Glyph_Format}",

        "GLYPH_FORMAT_NONE".enum("", "FT_IMAGE_TAG( 0, 0, 0, 0 )"),
        "GLYPH_FORMAT_COMPOSITE".enum("", "FT_IMAGE_TAG( 'c', 'o', 'm', 'p' )"),
        "GLYPH_FORMAT_BITMAP".enum("", "FT_IMAGE_TAG( 'b', 'i', 't', 's' )"),
        "GLYPH_FORMAT_OUTLINE".enum("", "FT_IMAGE_TAG( 'o', 'u', 't', 'l' )"),
        "GLYPH_FORMAT_PLOTTER".enum("", "FT_IMAGE_TAG( 'p', 'l', 'o', 't' )"),
        "GLYPH_FORMAT_SVG".enum("", "FT_IMAGE_TAG( 'S', 'V', 'G', ' ' )")
    )

    EnumConstant(
        "{@code FT_RASTER_FLAG_XXX}",

        "RASTER_FLAG_DEFAULT".enum("", "0x0"),
        "RASTER_FLAG_AA".enum("", "0x1"),
        "RASTER_FLAG_DIRECT".enum("", "0x2"),
        "RASTER_FLAG_CLIP".enum("", "0x4"),
        "RASTER_FLAG_SDF".enum("", "0x8")
    )

    // ftlcdfil.h

    EnumConstant(
        "{@code FT_LcdFilter}",

        "LCD_FILTER_NONE".enum("", "0"),
        "LCD_FILTER_DEFAULT".enum,
        "LCD_FILTER_LIGHT".enum,
        "LCD_FILTER_LEGACY1".enum,
        "LCD_FILTER_LEGACY".enum("", "16"),
        "LCD_FILTER_MAX".enum
    )

    FT_Error(
        "Library_SetLcdFilter",
        "",

        FT_Library("library", ""),
        FT_LcdFilter("filter", "")
    )

    FT_Error(
        "Library_SetLcdFilterWeights",
        "",

        FT_Library("library", ""),
        Check(5)..unsigned_char.p("weights", "")
    )

    IntConstant("", "LCD_FILTER_FIVE_TAPS".."5")

    FT_Error(
        "Library_SetLcdGeometry",
        "",

        FT_Library("library", ""),
        Check(3)..FT_Vector.p("sub", "")
    )

    // ftlist.h

    FT_ListNode(
        "List_Find",
        "",

        FT_List("list", ""),
        opaque_p("data", "")
    )

    void(
        "List_Add",
        "",

        FT_List("list", ""),
        FT_ListNode("node", "")
    )

    void(
        "List_Insert",
        "",

        FT_List("list", ""),
        FT_ListNode("node", "")
    )

    void(
        "List_Remove",
        "",

        FT_List("list", ""),
        FT_ListNode("node", "")
    )

    void(
        "List_Up",
        "",

        FT_List("list", ""),
        FT_ListNode("node", "")
    )

    FT_Error(
        "List_Iterate",
        "",

        FT_List("list", ""),
        FT_List_Iterator("iterator", ""),
        nullable..opaque_p("user", "")
    )

    void(
        "List_Finalize",
        "",

        FT_List("list", ""),
        nullable..FT_List_Destructor("destroy", ""),
        FT_Memory("memory", ""),
        nullable..opaque_p("user", "")
    )

    // ftlzw.h

    FT_Error(
        "Stream_OpenLZW",
        "",

        FT_Stream("stream", ""),
        FT_Stream("source", "")
    )

    // ftmm.h

    FT_Error(
        "Get_Multi_Master",
        "",

        FT_Face("face", ""),
        FT_Multi_Master.p("amaster", "")
    )

    FT_Error(
        "Get_MM_Var",
        "",

        FT_Face("face", ""),
        Check(1)..FT_MM_Var.p.p("amaster", "")
    )

    FT_Error(
        "Done_MM_Var",
        "",

        FT_Library("library", ""),
        FT_MM_Var.p("amaster", "")
    )

    FT_Error(
        "Set_MM_Design_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Long.p("coords", "")
    )

    FT_Error(
        "Set_Var_Design_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Fixed.p("coords", "")
    )

    FT_Error(
        "Get_Var_Design_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Fixed.p("coords", "")
    )

    FT_Error(
        "Set_MM_Blend_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Fixed.p("coords", "")
    )

    FT_Error(
        "Get_MM_Blend_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Fixed.p("coords", "")
    )

    FT_Error(
        "Set_Var_Blend_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Fixed.p("coords", "")
    )

    FT_Error(
        "Get_Var_Blend_Coordinates",
        "",

        FT_Face("face", ""),
        AutoSize("coords")..FT_UInt("num_coords", ""),
        FT_Fixed.p("coords", "")
    )

    FT_Error(
        "Set_MM_WeightVector",
        "",

        FT_Face("face", ""),
        AutoSize("weightvector")..FT_UInt("len", ""),
        nullable..FT_Fixed.p("weightvector", ""),

        returnDoc = ": FreeType error code.  0~means success."
    )

    FT_Error(
        "Get_MM_WeightVector",
        "",

        FT_Face("face", ""),
        AutoSize("weightvector")..Check(1)..FT_UInt.p("len", ""),
        FT_Fixed.p("weightvector", "")
    )

    IntConstant("", "VAR_AXIS_FLAG_HIDDEN".."1")

    FT_Error(
        "Get_Var_Axis_Flags",
        "",

        FT_MM_Var.p("master", ""),
        FT_UInt("axis_index", ""),
        Check(1)..FT_UInt.p("flags", "")
    )

    FT_Error(
        "Set_Named_Instance",
        "",

        FT_Face("face", ""),
        FT_UInt("instance_index", "")
    )

    FT_Error(
        "Get_Default_Named_Instance",
        "",

        FT_Face("face", ""),
        Check(1)..FT_UInt.p("instance_index", "")
    )

    // ftmodapi.h

    IntConstant("", "MODULE_FONT_DRIVER".."1")
    IntConstant("", "MODULE_RENDERER".."2")
    IntConstant("", "MODULE_HINTER".."4")
    IntConstant("", "MODULE_STYLER".."8")

    IntConstant("", "MODULE_DRIVER_SCALABLE".."0x100")
    IntConstant("", "MODULE_DRIVER_NO_OUTLINES".."0x200")
    IntConstant("", "MODULE_DRIVER_HAS_HINTER".."0x400")
    IntConstant("", "MODULE_DRIVER_HINTS_LIGHTLY".."0x800")

    FT_Error(
        "Add_Module",
        "",

        FT_Library("library", ""),
        FT_Module_Class.const.p("clazz", "")
    )

    FT_Module(
        "Get_Module",
        "",

        FT_Library("library", ""),
        charASCII.const.p("module_name", "")
    )

    FT_Error(
        "Remove_Module",
        "",

        FT_Library("library", ""),
        FT_Module("module", "")
    )

    FT_Error(
        "Property_Set",
        "",

        FT_Library("library", ""),
        FT_String.const.p("module_name", ""),
        FT_String.const.p("property_name", ""),
        Unsafe..void.const.p("value", "")
    )

    FT_Error(
        "Property_Get",
        "",

        FT_Library("library", ""),
        FT_String.const.p("module_name", ""),
        FT_String.const.p("property_name", ""),
        Unsafe..void.p("value", "")
    )

    void(
        "Set_Default_Properties",
        "",

        FT_Library("library", "")
    )

    FT_Error(
        "Reference_Library",
        "",

        FT_Library("library", "")
    )

    FT_Error(
        "New_Library",
        "",

        FT_Memory("memory", ""),
        Check(1)..FT_Library.p("alibrary", "")
    )

    FT_Error(
        "Done_Library",
        "",

        FT_Library("library", "")
    )

    IntConstant("", "DEBUG_HOOK_TRUETYPE".."0")

    void(
        "Set_Debug_Hook",
        "",

        FT_Library("library", ""),
        FT_UInt("hook_index", ""),
        nullable..FT_DebugHook_Func("debug_hook", "")
    )

    void(
        "Add_Default_Modules",
        "",

        FT_Library("library", "")
    )

    EnumConstant(
        "{@code FT_TrueTypeEngineType}",

        "TRUETYPE_ENGINE_TYPE_NONE".enum("", "0"),
        "TRUETYPE_ENGINE_TYPE_UNPATENTED".enum,
        "TRUETYPE_ENGINE_TYPE_PATENTED".enum
    )

    FT_TrueTypeEngineType(
        "Get_TrueType_Engine_Type",
        "",

        FT_Library("library", "")
    )

    // ftmoderr.h

    EnumConstant(
        "{@code FT_Mod_Err_XXX}",

        "Mod_Err_Base".enum("", "0x00"),
        "Mod_Err_Autofit".enum("", "0x100"),
        "Mod_Err_BDF".enum("", "0x200"),
        "Mod_Err_Bzip2".enum("", "0x300"),
        "Mod_Err_Cache".enum("", "0x400"),
        "Mod_Err_CFF".enum("", "0x500"),
        "Mod_Err_CID".enum("", "0x600"),
        "Mod_Err_Gzip".enum("", "0x700"),
        "Mod_Err_LZW".enum("", "0x800"),
        "Mod_Err_OTvalid".enum("", "0x900"),
        "Mod_Err_PCF".enum("", "0xA00"),
        "Mod_Err_PFR".enum("", "0xB00"),
        "Mod_Err_PSaux".enum("", "0xC00"),
        "Mod_Err_PShinter".enum("", "0xD00"),
        "Mod_Err_PSnames".enum("", "0xE00"),
        "Mod_Err_Raster".enum("", "0xF00"),
        "Mod_Err_SFNT".enum("", "0x1000"),
        "Mod_Err_Smooth".enum("", "0x1100"),
        "Mod_Err_TrueType".enum("", "0x1200"),
        "Mod_Err_Type1".enum("", "0x1300"),
        "Mod_Err_Type42".enum("", "0x1400"),
        "Mod_Err_Winfonts".enum("", "0x1500"),
        "Mod_Err_GXvalid".enum("", "0x1600"),
        "Mod_Err_Sdf".enum("", "0x1700"),
        "Mod_Err_Max".enum("", "FT_Mod_Err_Sdf + 1")
    )

    // ftotval.h

    EnumConstant(
        "{@code FT_VALIDATE_OTXXX}",

        "VALIDATE_BASE".enum("", "0x0100"),
        "VALIDATE_GDEF".enum("", "0x0200"),
        "VALIDATE_GPOS".enum("", "0x0400"),
        "VALIDATE_GSUB".enum("", "0x0800"),
        "VALIDATE_JSTF".enum("", "0x1000"),
        "VALIDATE_MATH".enum("", "0x2000"),
        "VALIDATE_OT".enum("", """
        FT_VALIDATE_BASE |
        FT_VALIDATE_GDEF |
        FT_VALIDATE_GPOS |
        FT_VALIDATE_GSUB |
        FT_VALIDATE_JSTF |
        FT_VALIDATE_MATH""")
    )

    FT_Error(
        "OpenType_Validate",
        "",

        FT_Face("face", ""),
        FT_UInt("validation_flags", ""),
        Check(1)..FT_Bytes.p("BASE_table", ""),
        Check(1)..FT_Bytes.p("GDEF_table", ""),
        Check(1)..FT_Bytes.p("GPOS_table", ""),
        Check(1)..FT_Bytes.p("GSUB_table", ""),
        Check(1)..FT_Bytes.p("JSTF_table", "")
    )

    void(
        "OpenType_Free",
        "",

        FT_Face("face", ""),
        Unsafe..FT_Bytes("table", "")
    )

    // ftoutln.h

    FT_Error(
        "Outline_Decompose",
        "",

        FT_Outline.p("outline", ""),
        FT_Outline_Funcs.const.p("func_interface", ""),
        nullable..opaque_p("user", "")
    )

    FT_Error(
        "Outline_New",
        "",

        FT_Library("library", ""),
        FT_UInt("numPoints", ""),
        FT_Int("numContours", ""),
        FT_Outline.p("anoutline", "")
    )

    FT_Error(
        "Outline_Done",
        "",

        FT_Library("library", ""),
        FT_Outline.p("outline", "")
    )

    FT_Error(
        "Outline_Check",
        "",

        FT_Outline.p("outline", "")
    )

    void(
        "Outline_Get_CBox",
        "",

        FT_Outline.const.p("outline", ""),
        FT_BBox.p("acbox", "")
    )

    void(
        "Outline_Translate",
        "",

        FT_Outline.const.p("outline", ""),
        FT_Pos("xOffset", ""),
        FT_Pos("yOffset", "")
    )

    FT_Error(
        "Outline_Copy",
        "",

        FT_Outline.const.p("source", ""),
        FT_Outline.p("target", "")
    )

    void(
        "Outline_Transform",
        "",

        FT_Outline.const.p("outline", ""),
        FT_Matrix.const.p("matrix", "")
    )

    FT_Error(
        "Outline_Embolden",
        "",

        FT_Outline.p("outline", ""),
        FT_Pos("strength", "")
    )

    FT_Error(
        "Outline_EmboldenXY",
        "",

        FT_Outline.p("outline", ""),
        FT_Pos("xstrength", ""),
        FT_Pos("ystrength", "")
    )

    void(
        "Outline_Reverse",
        "",

        FT_Outline.p("outline", "")
    )

    FT_Error(
        "Outline_Get_Bitmap",
        "",

        FT_Library("library", ""),
        FT_Outline.p("outline", ""),
        FT_Bitmap.const.p("abitmap", "")
    )

    FT_Error(
        "Outline_Render",
        "",

        FT_Library("library", ""),
        FT_Outline.p("outline", ""),
        FT_Raster_Params.p("params", "")
    )

    EnumConstant(
        "{@code FT_Orientation}",

        "ORIENTATION_TRUETYPE".enum("", "0"),
        "ORIENTATION_POSTSCRIPT".enum,
        "ORIENTATION_FILL_RIGHT".enum("", "FT_ORIENTATION_TRUETYPE"),
        "ORIENTATION_FILL_LEFT".enum("", "FT_ORIENTATION_POSTSCRIPT"),
        "ORIENTATION_NONE".enum("", "2")
    )

    FT_Orientation(
        "Outline_Get_Orientation",
        "",

        FT_Outline.p("outline", "")
    )

    // ftparams.h

    customMethod("""
    public static int FT_MAKE_TAG(int _x1, int _x2, int _x3, int _x4) {
        return ((_x1 & 0xFF) << 24) | ((_x2 & 0xFF) << 16) | ((_x3 & 0xFF) << 8) | (_x4 & 0xFF);
    }
    """)

    IntConstant(
        "",

        "PARAM_TAG_IGNORE_TYPOGRAPHIC_FAMILY".."FT_MAKE_TAG( 'i', 'g', 'p', 'f' )",
        "PARAM_TAG_IGNORE_TYPOGRAPHIC_SUBFAMILY".."FT_MAKE_TAG( 'i', 'g', 'p', 's' )",
        "PARAM_TAG_INCREMENTAL".."FT_MAKE_TAG( 'i', 'n', 'c', 'r' )",
        "PARAM_TAG_IGNORE_SBIX".."FT_MAKE_TAG( 'i', 's', 'b', 'x' )",
        "PARAM_TAG_LCD_FILTER_WEIGHTS".."FT_MAKE_TAG( 'l', 'c', 'd', 'f' )",
        "PARAM_TAG_RANDOM_SEED".."FT_MAKE_TAG( 's', 'e', 'e', 'd' )",
        "PARAM_TAG_STEM_DARKENING".."FT_MAKE_TAG( 'd', 'a', 'r', 'k' )",
        "PARAM_TAG_UNPATENTED_HINTING".."FT_MAKE_TAG( 'u', 'n', 'p', 'a' )"
    )

    // ftpfr.h

    FT_Error(
        "Get_PFR_Metrics",
        "",

        FT_Face("face", ""),
        Check(1)..nullable..FT_UInt.p("aoutline_resolution", ""),
        Check(1)..nullable..FT_UInt.p("ametrics_resolution", ""),
        Check(1)..nullable..FT_Fixed.p("ametrics_x_scale", ""),
        Check(1)..nullable..FT_Fixed.p("ametrics_y_scale", "")
    )

    FT_Error(
        "Get_PFR_Kerning",
        "",

        FT_Face("face", ""),
        FT_UInt("left", ""),
        FT_UInt("right", ""),
        FT_Vector.p("avector", "")
    )

    FT_Error(
        "Get_PFR_Advance",
        "",

        FT_Face("face", ""),
        FT_UInt("gindex", ""),
        Check(1)..FT_Pos.p("aadvance", "")
    )

    // ftrender.h

    FT_Renderer(
        "Get_Renderer",
        "",

        FT_Library("library", ""),
        FT_Glyph_Format("format", "")
    )

    FT_Error(
        "Set_Renderer",
        "",

        FT_Library("library", ""),
        FT_Renderer("renderer", ""),
        AutoSize("parameters")..FT_UInt("num_params", ""),
        FT_Parameter.p("parameters", "")
    )

    // ftsizes.h

    FT_Error(
        "New_Size",
        "",

        FT_Face("face", ""),
        Check(1)..FT_Size.p("size", "")
    )

    FT_Error(
        "Done_Size",
        "",

        FT_Size("size", "")
    )

    FT_Error(
        "Activate_Size",
        "",

        FT_Size("size", "")
    )

    // ftsnames.h

    FT_UInt(
        "Get_Sfnt_Name_Count",
        "",

        FT_Face("face", "")
    )

    FT_Error(
        "Get_Sfnt_Name",
        "",

        FT_Face("face", ""),
        FT_UInt("idx", ""),
        FT_SfntName.p("aname", "")
    )

    FT_Error(
        "Get_Sfnt_LangTag",
        "",

        FT_Face("face", ""),
        FT_UInt("langID", ""),
        FT_SfntLangTag.p("alangTag", "")
    )

    // ftstroke.h

    EnumConstant(
        "{@code FT_Stroker_LineJoin}",

        "STROKER_LINEJOIN_ROUND".enum("", "0"),
        "STROKER_LINEJOIN_BEVEL".enum,
        "STROKER_LINEJOIN_MITER_VARIABLE".enum,
        "STROKER_LINEJOIN_MITER".enum("", "FT_STROKER_LINEJOIN_MITER_VARIABLE"),
        "STROKER_LINEJOIN_MITER_FIXED".enum("", "3")
    )

    EnumConstant(
        "{@code FT_Stroker_LineCap}",

        "STROKER_LINECAP_BUTT".enum("", "0"),
        "STROKER_LINECAP_ROUND".enum,
        "STROKER_LINECAP_SQUARE".enum
    )

    EnumConstant(
        "{@code FT_StrokerBorder}",

        "STROKER_BORDER_LEFT".enum("", "0"),
        "STROKER_BORDER_RIGHT".enum
    )

    FT_StrokerBorder(
        "Outline_GetInsideBorder",
        "",

        FT_Outline.p("outline", "")
    )

    FT_StrokerBorder(
        "Outline_GetOutsideBorder",
        "",

        FT_Outline.p("outline", "")
    )

    FT_Error(
        "Stroker_New",
        "",

        FT_Library("library", ""),
        Check(1)..FT_Stroker.p("astroker", "")
    )

    void(
        "Stroker_Set",
        "",

        FT_Stroker("stroker", ""),
        FT_Fixed("radius", ""),
        FT_Stroker_LineCap("line_cap", ""),
        FT_Stroker_LineJoin("line_join", ""),
        FT_Fixed("miter_limit", "")
    )

    void(
        "Stroker_Rewind",
        "",

        FT_Stroker("stroker", "")
    )

    FT_Error(
        "Stroker_ParseOutline",
        "",

        FT_Stroker("stroker", ""),
        FT_Outline.p("outline", ""),
        FT_Bool("opened", "")
    )

    FT_Error(
        "Stroker_BeginSubPath",
        "",

        FT_Stroker("stroker", ""),
        FT_Vector.p("to", ""),
        FT_Bool("open", "")
    )

    FT_Error(
        "Stroker_EndSubPath",
        "",

        FT_Stroker("stroker", "")
    )

    FT_Error(
        "Stroker_LineTo",
        "",

        FT_Stroker("stroker", ""),
        FT_Vector.p("to", "")
    )

    FT_Error(
        "Stroker_ConicTo",
        "",

        FT_Stroker("stroker", ""),
        FT_Vector.p("control", ""),
        FT_Vector.p("to", "")
    )

    FT_Error(
        "Stroker_CubicTo",
        "",

        FT_Stroker("stroker", ""),
        FT_Vector.p("control1", ""),
        FT_Vector.p("control2", ""),
        FT_Vector.p("to", "")
    )

    FT_Error(
        "Stroker_GetBorderCounts",
        "",

        FT_Stroker("stroker", ""),
        FT_StrokerBorder("border", ""),
        Check(1)..FT_UInt.p("anum_points", ""),
        Check(1)..FT_UInt.p("anum_contours", "")
    )

    void(
        "Stroker_ExportBorder",
        "",

        FT_Stroker("stroker", ""),
        FT_StrokerBorder("border", ""),
        FT_Outline.p("outline", "")
    )

    FT_Error(
        "Stroker_GetCounts",
        "",

        FT_Stroker("stroker", ""),
        Check(1)..FT_UInt.p("anum_points", ""),
        Check(1)..FT_UInt.p("anum_contours", "")
    )

    void(
        "Stroker_Export",
        "",

        FT_Stroker("stroker", ""),
        FT_Outline.p("outline", "")
    )

    void(
        "Stroker_Done",
        "",

        FT_Stroker("stroker", "")
    )

    FT_Error(
        "Glyph_Stroke",
        "",

        Check(1)..FT_Glyph.p("pglyph", ""),
        FT_Stroker("stroker", ""),
        FT_Bool("destroy", "")
    )

    FT_Error(
        "Glyph_StrokeBorder",
        "",

        Check(1)..FT_Glyph.p("pglyph", ""),
        FT_Stroker("stroker", ""),
        FT_Bool("inside", ""),
        FT_Bool("destroy", "")
    )

    // ftsynth.h

    void(
        "GlyphSlot_Embolden",
        "",

        FT_GlyphSlot("slot", "")
    )

    void(
        "GlyphSlot_AdjustWeight",
        "",

        FT_GlyphSlot("slot", ""),
        FT_Fixed("xdelta", ""),
        FT_Fixed("ydelta", "")
    )

    void(
        "GlyphSlot_Oblique",
        "",

        FT_GlyphSlot("slot", "")
    )

    void(
        "GlyphSlot_Slant",
        "",

        FT_GlyphSlot("slot", ""),
        FT_Fixed("xslant", ""),
        FT_Fixed("yslant", "")
    )

    // fttrigon.h

    IntConstant(
        "",

        "ANGLE_PI".."180 << 16",
        "ANGLE_2PI".."FT_ANGLE_PI * 2",
        "ANGLE_PI2".."FT_ANGLE_PI / 2",
        "ANGLE_PI4".."FT_ANGLE_PI / 4"
    )

    FT_Fixed(
        "Sin",
        "",

        FT_Angle("angle", "")
    )

    FT_Fixed(
        "Cos",
        "",

        FT_Angle("angle", "")
    )

    FT_Fixed(
        "Tan",
        "",

        FT_Angle("angle", "")
    )

    FT_Angle(
        "Atan2",
        "",

        FT_Fixed("x", ""),
        FT_Fixed("y", "")
    )

    FT_Angle(
        "Angle_Diff",
        "",

        FT_Angle("angle1", ""),
        FT_Angle("angle2", "")
    )

    void(
        "Vector_Unit",
        "",

        FT_Vector.p("vec", ""),
        FT_Angle("angle", "")
    )

    void(
        "Vector_Rotate",
        "",

        FT_Vector.p("vec", ""),
        FT_Angle("angle", "")
    )

    FT_Fixed(
        "Vector_Length",
        "",

        FT_Vector.p("vec", "")
    )

    void(
        "Vector_Polarize",
        "",

        FT_Vector.p("vec", ""),
        Check(1)..FT_Fixed.p("length", ""),
        Check(1)..FT_Angle.p("angle", "")
    )

    void(
        "Vector_From_Polar",
        "",

        FT_Vector.p("vec", ""),
        FT_Fixed("length", ""),
        FT_Angle("angle", "")
    )

    // fttypes.h

    customMethod("""
    public static boolean FT_IS_EMPTY(FT_List list) {
        return list.head() == null;
    }""")

    // t1tables.h

    EnumConstant(
        "{@code T1_Blend_Flags}",

        "T1_BLEND_UNDERLINE_POSITION".enum("", "0"),
        "T1_BLEND_UNDERLINE_THICKNESS".enum,
        "T1_BLEND_ITALIC_ANGLE".enum,
        "T1_BLEND_BLUE_VALUES".enum,
        "T1_BLEND_OTHER_BLUES".enum,
        "T1_BLEND_STANDARD_WIDTH".enum,
        "T1_BLEND_STANDARD_HEIGHT".enum,
        "T1_BLEND_STEM_SNAP_WIDTHS".enum,
        "T1_BLEND_STEM_SNAP_HEIGHTS".enum,
        "T1_BLEND_BLUE_SCALE".enum,
        "T1_BLEND_BLUE_SHIFT".enum,
        "T1_BLEND_FAMILY_BLUES".enum,
        "T1_BLEND_FAMILY_OTHER_BLUES".enum,
        "T1_BLEND_FORCE_BOLD".enum,
        "T1_BLEND_MAX".enum
    ).noPrefix()

    IntConstant("", "T1_MAX_MM_DESIGNS".."16").noPrefix()
    IntConstant("", "T1_MAX_MM_AXIS".."4").noPrefix()
    IntConstant("", "T1_MAX_MM_MAP_POINTS".."20").noPrefix()

    FT_Int(
        "Has_PS_Glyph_Names",
        "",

        FT_Face("face", "")
    )

    FT_Error(
        "Get_PS_Font_Info",
        "",

        FT_Face("face", ""),
        PS_FontInfo("afont_info", "")
    )

    FT_Error(
        "Get_PS_Font_Private",
        "",

        FT_Face("face", ""),
        PS_Private("afont_private", "")
    )

    EnumConstant(
        "{@code T1_EncodingType}",

        "T1_ENCODING_TYPE_NONE".enum("", "0"),
        "T1_ENCODING_TYPE_ARRAY".enum,
        "T1_ENCODING_TYPE_STANDARD".enum,
        "T1_ENCODING_TYPE_ISOLATIN1".enum,
        "T1_ENCODING_TYPE_EXPERT".enum
    ).noPrefix()

    EnumConstant(
        "{@code PS_Dict_Keys}",

        "PS_DICT_FONT_TYPE".enum("", "0"),
        "PS_DICT_FONT_MATRIX".enum,
        "PS_DICT_FONT_BBOX".enum,
        "PS_DICT_PAINT_TYPE".enum,
        "PS_DICT_FONT_NAME".enum,
        "PS_DICT_UNIQUE_ID".enum,
        "PS_DICT_NUM_CHAR_STRINGS".enum,
        "PS_DICT_CHAR_STRING_KEY".enum,
        "PS_DICT_CHAR_STRING".enum,
        "PS_DICT_ENCODING_TYPE".enum,
        "PS_DICT_ENCODING_ENTRY".enum,
        "PS_DICT_NUM_SUBRS".enum,
        "PS_DICT_SUBR".enum,
        "PS_DICT_STD_HW".enum,
        "PS_DICT_STD_VW".enum,
        "PS_DICT_NUM_BLUE_VALUES".enum,
        "PS_DICT_BLUE_VALUE".enum,
        "PS_DICT_BLUE_FUZZ".enum,
        "PS_DICT_NUM_OTHER_BLUES".enum,
        "PS_DICT_OTHER_BLUE".enum,
        "PS_DICT_NUM_FAMILY_BLUES".enum,
        "PS_DICT_FAMILY_BLUE".enum,
        "PS_DICT_NUM_FAMILY_OTHER_BLUES".enum,
        "PS_DICT_FAMILY_OTHER_BLUE".enum,
        "PS_DICT_BLUE_SCALE".enum,
        "PS_DICT_BLUE_SHIFT".enum,
        "PS_DICT_NUM_STEM_SNAP_H".enum,
        "PS_DICT_STEM_SNAP_H".enum,
        "PS_DICT_NUM_STEM_SNAP_V".enum,
        "PS_DICT_STEM_SNAP_V".enum,
        "PS_DICT_FORCE_BOLD".enum,
        "PS_DICT_RND_STEM_UP".enum,
        "PS_DICT_MIN_FEATURE".enum,
        "PS_DICT_LEN_IV".enum,
        "PS_DICT_PASSWORD".enum,
        "PS_DICT_LANGUAGE_GROUP".enum,
        "PS_DICT_VERSION".enum,
        "PS_DICT_NOTICE".enum,
        "PS_DICT_FULL_NAME".enum,
        "PS_DICT_FAMILY_NAME".enum,
        "PS_DICT_WEIGHT".enum,
        "PS_DICT_IS_FIXED_PITCH".enum,
        "PS_DICT_UNDERLINE_POSITION".enum,
        "PS_DICT_UNDERLINE_THICKNESS".enum,
        "PS_DICT_FS_TYPE".enum,
        "PS_DICT_ITALIC_ANGLE".enum,
        "PS_DICT_MAX".enum("", "PS_DICT_ITALIC_ANGLE")
    ).noPrefix()

    FT_Long(
        "Get_PS_Font_Value",
        "",

        FT_Face("face", ""),
        PS_Dict_Keys("key", ""),
        FT_UInt("idx", ""),
        nullable..void.p("value", ""),
        AutoSize("value")..FT_Long("value_len", "")
    )

    // ttnameid.h

    EnumConstant(
        "{@code TT_PLATFORM_XXX}",

        "TT_PLATFORM_APPLE_UNICODE".enum("", "0"),
        "TT_PLATFORM_MACINTOSH".enum,
        "TT_PLATFORM_ISO".enum,
        "TT_PLATFORM_MICROSOFT".enum,
        "TT_PLATFORM_CUSTOM".enum,
        "TT_PLATFORM_ADOBE".enum("", "7")
    ).noPrefix()

    EnumConstant(
        "{@code TT_APPLE_ID_XXX}",

        "TT_APPLE_ID_DEFAULT".enum("", "0"),
        "TT_APPLE_ID_UNICODE_1_1".enum,
        "TT_APPLE_ID_ISO_10646".enum,
        "TT_APPLE_ID_UNICODE_2_0".enum,
        "TT_APPLE_ID_UNICODE_32".enum,
        "TT_APPLE_ID_VARIANT_SELECTOR".enum,
        "TT_APPLE_ID_FULL_UNICODE".enum
    ).noPrefix()

    EnumConstant(
        "{@code TT_MAC_ID_XXX}",

        "TT_MAC_ID_ROMAN".enum("", "0"),
        "TT_MAC_ID_JAPANESE".enum,
        "TT_MAC_ID_TRADITIONAL_CHINESE".enum,
        "TT_MAC_ID_KOREAN".enum,
        "TT_MAC_ID_ARABIC".enum,
        "TT_MAC_ID_HEBREW".enum,
        "TT_MAC_ID_GREEK".enum,
        "TT_MAC_ID_RUSSIAN".enum,
        "TT_MAC_ID_RSYMBOL".enum,
        "TT_MAC_ID_DEVANAGARI".enum,
        "TT_MAC_ID_GURMUKHI".enum,
        "TT_MAC_ID_GUJARATI".enum,
        "TT_MAC_ID_ORIYA".enum,
        "TT_MAC_ID_BENGALI".enum,
        "TT_MAC_ID_TAMIL".enum,
        "TT_MAC_ID_TELUGU".enum,
        "TT_MAC_ID_KANNADA".enum,
        "TT_MAC_ID_MALAYALAM".enum,
        "TT_MAC_ID_SINHALESE".enum,
        "TT_MAC_ID_BURMESE".enum,
        "TT_MAC_ID_KHMER".enum,
        "TT_MAC_ID_THAI".enum,
        "TT_MAC_ID_LAOTIAN".enum,
        "TT_MAC_ID_GEORGIAN".enum,
        "TT_MAC_ID_ARMENIAN".enum,
        "TT_MAC_ID_MALDIVIAN".enum,
        "TT_MAC_ID_SIMPLIFIED_CHINESE".enum,
        "TT_MAC_ID_TIBETAN".enum,
        "TT_MAC_ID_MONGOLIAN".enum,
        "TT_MAC_ID_GEEZ".enum,
        "TT_MAC_ID_SLAVIC".enum,
        "TT_MAC_ID_VIETNAMESE".enum,
        "TT_MAC_ID_SINDHI".enum,
        "TT_MAC_ID_UNINTERP".enum
    ).noPrefix()

    EnumConstant(
        "{@code TT_ISO_ID_XXX}",

        "TT_ISO_ID_7BIT_ASCII".enum("", "0"),
        "TT_ISO_ID_10646".enum,
        "TT_ISO_ID_8859_1".enum
    ).noPrefix()

    EnumConstant(
        "{@code TT_MS_ID_XXX}",

        "TT_MS_ID_SYMBOL_CS".enum("", "0"),
        "TT_MS_ID_UNICODE_CS".enum,
        "TT_MS_ID_SJIS".enum,
        "TT_MS_ID_PRC".enum,
        "TT_MS_ID_BIG_5".enum,
        "TT_MS_ID_WANSUNG".enum,
        "TT_MS_ID_JOHAB".enum,
        "TT_MS_ID_UCS_4".enum("", "10")
    ).noPrefix()

    EnumConstant(
        "{@code TT_ADOBE_ID_XXX}",

        "TT_ADOBE_ID_STANDARD".enum("", "0"),
        "TT_ADOBE_ID_EXPERT".enum,
        "TT_ADOBE_ID_CUSTOM".enum,
        "TT_ADOBE_ID_LATIN_1".enum
    ).noPrefix()

    EnumConstant(
        "{@code TT_MAC_LANGID_XXX}",

        "TT_MAC_LANGID_ENGLISH".enum("", "0"),
        "TT_MAC_LANGID_FRENCH".enum,
        "TT_MAC_LANGID_GERMAN".enum,
        "TT_MAC_LANGID_ITALIAN".enum,
        "TT_MAC_LANGID_DUTCH".enum,
        "TT_MAC_LANGID_SWEDISH".enum,
        "TT_MAC_LANGID_SPANISH".enum,
        "TT_MAC_LANGID_DANISH".enum,
        "TT_MAC_LANGID_PORTUGUESE".enum,
        "TT_MAC_LANGID_NORWEGIAN".enum,
        "TT_MAC_LANGID_HEBREW".enum,
        "TT_MAC_LANGID_JAPANESE".enum,
        "TT_MAC_LANGID_ARABIC".enum,
        "TT_MAC_LANGID_FINNISH".enum,
        "TT_MAC_LANGID_GREEK".enum,
        "TT_MAC_LANGID_ICELANDIC".enum,
        "TT_MAC_LANGID_MALTESE".enum,
        "TT_MAC_LANGID_TURKISH".enum,
        "TT_MAC_LANGID_CROATIAN".enum,
        "TT_MAC_LANGID_CHINESE_TRADITIONAL".enum,
        "TT_MAC_LANGID_URDU".enum,
        "TT_MAC_LANGID_HINDI".enum,
        "TT_MAC_LANGID_THAI".enum,
        "TT_MAC_LANGID_KOREAN".enum,
        "TT_MAC_LANGID_LITHUANIAN".enum,
        "TT_MAC_LANGID_POLISH".enum,
        "TT_MAC_LANGID_HUNGARIAN".enum,
        "TT_MAC_LANGID_ESTONIAN".enum,
        "TT_MAC_LANGID_LETTISH".enum,
        "TT_MAC_LANGID_SAAMISK".enum,
        "TT_MAC_LANGID_FAEROESE".enum,
        "TT_MAC_LANGID_FARSI".enum,
        "TT_MAC_LANGID_RUSSIAN".enum,
        "TT_MAC_LANGID_CHINESE_SIMPLIFIED".enum,
        "TT_MAC_LANGID_FLEMISH".enum,
        "TT_MAC_LANGID_IRISH".enum,
        "TT_MAC_LANGID_ALBANIAN".enum,
        "TT_MAC_LANGID_ROMANIAN".enum,
        "TT_MAC_LANGID_CZECH".enum,
        "TT_MAC_LANGID_SLOVAK".enum,
        "TT_MAC_LANGID_SLOVENIAN".enum,
        "TT_MAC_LANGID_YIDDISH".enum,
        "TT_MAC_LANGID_SERBIAN".enum,
        "TT_MAC_LANGID_MACEDONIAN".enum,
        "TT_MAC_LANGID_BULGARIAN".enum,
        "TT_MAC_LANGID_UKRAINIAN".enum,
        "TT_MAC_LANGID_BYELORUSSIAN".enum,
        "TT_MAC_LANGID_UZBEK".enum,
        "TT_MAC_LANGID_KAZAKH".enum,
        "TT_MAC_LANGID_AZERBAIJANI".enum,
        "TT_MAC_LANGID_AZERBAIJANI_CYRILLIC_SCRIPT".enum,
        "TT_MAC_LANGID_AZERBAIJANI_ARABIC_SCRIPT".enum,
        "TT_MAC_LANGID_ARMENIAN".enum,
        "TT_MAC_LANGID_GEORGIAN".enum,
        "TT_MAC_LANGID_MOLDAVIAN".enum,
        "TT_MAC_LANGID_KIRGHIZ".enum,
        "TT_MAC_LANGID_TAJIKI".enum,
        "TT_MAC_LANGID_TURKMEN".enum,
        "TT_MAC_LANGID_MONGOLIAN".enum,
        "TT_MAC_LANGID_MONGOLIAN_MONGOLIAN_SCRIPT".enum,
        "TT_MAC_LANGID_MONGOLIAN_CYRILLIC_SCRIPT".enum,
        "TT_MAC_LANGID_PASHTO".enum,
        "TT_MAC_LANGID_KURDISH".enum,
        "TT_MAC_LANGID_KASHMIRI".enum,
        "TT_MAC_LANGID_SINDHI".enum,
        "TT_MAC_LANGID_TIBETAN".enum,
        "TT_MAC_LANGID_NEPALI".enum,
        "TT_MAC_LANGID_SANSKRIT".enum,
        "TT_MAC_LANGID_MARATHI".enum,
        "TT_MAC_LANGID_BENGALI".enum,
        "TT_MAC_LANGID_ASSAMESE".enum,
        "TT_MAC_LANGID_GUJARATI".enum,
        "TT_MAC_LANGID_PUNJABI".enum,
        "TT_MAC_LANGID_ORIYA".enum,
        "TT_MAC_LANGID_MALAYALAM".enum,
        "TT_MAC_LANGID_KANNADA".enum,
        "TT_MAC_LANGID_TAMIL".enum,
        "TT_MAC_LANGID_TELUGU".enum,
        "TT_MAC_LANGID_SINHALESE".enum,
        "TT_MAC_LANGID_BURMESE".enum,
        "TT_MAC_LANGID_KHMER".enum,
        "TT_MAC_LANGID_LAO".enum,
        "TT_MAC_LANGID_VIETNAMESE".enum,
        "TT_MAC_LANGID_INDONESIAN".enum,
        "TT_MAC_LANGID_TAGALOG".enum,
        "TT_MAC_LANGID_MALAY_ROMAN_SCRIPT".enum,
        "TT_MAC_LANGID_MALAY_ARABIC_SCRIPT".enum,
        "TT_MAC_LANGID_AMHARIC".enum,
        "TT_MAC_LANGID_TIGRINYA".enum,
        "TT_MAC_LANGID_GALLA".enum,
        "TT_MAC_LANGID_SOMALI".enum,
        "TT_MAC_LANGID_SWAHILI".enum,
        "TT_MAC_LANGID_RUANDA".enum,
        "TT_MAC_LANGID_RUNDI".enum,
        "TT_MAC_LANGID_CHEWA".enum,
        "TT_MAC_LANGID_MALAGASY".enum,
        "TT_MAC_LANGID_ESPERANTO".enum,
        "TT_MAC_LANGID_WELSH".enum("", "128"),
        "TT_MAC_LANGID_BASQUE".enum,
        "TT_MAC_LANGID_CATALAN".enum,
        "TT_MAC_LANGID_LATIN".enum,
        "TT_MAC_LANGID_QUECHUA".enum,
        "TT_MAC_LANGID_GUARANI".enum,
        "TT_MAC_LANGID_AYMARA".enum,
        "TT_MAC_LANGID_TATAR".enum,
        "TT_MAC_LANGID_UIGHUR".enum,
        "TT_MAC_LANGID_DZONGKHA".enum,
        "TT_MAC_LANGID_JAVANESE".enum,
        "TT_MAC_LANGID_SUNDANESE".enum,
        "TT_MAC_LANGID_GALICIAN".enum,
        "TT_MAC_LANGID_AFRIKAANS".enum,
        "TT_MAC_LANGID_BRETON".enum,
        "TT_MAC_LANGID_INUKTITUT".enum,
        "TT_MAC_LANGID_SCOTTISH_GAELIC".enum,
        "TT_MAC_LANGID_MANX_GAELIC".enum,
        "TT_MAC_LANGID_IRISH_GAELIC".enum,
        "TT_MAC_LANGID_TONGAN".enum,
        "TT_MAC_LANGID_GREEK_POLYTONIC".enum,
        "TT_MAC_LANGID_GREELANDIC".enum,
        "TT_MAC_LANGID_AZERBAIJANI_ROMAN_SCRIPT".enum,
    ).noPrefix()

    EnumConstant(
        "{@code TT_MS_LANGID_XXX}",

        "TT_MS_LANGID_ARABIC_SAUDI_ARABIA".enum("", "0x0401"),
        "TT_MS_LANGID_ARABIC_IRAQ".enum("", "0x0801"),
        "TT_MS_LANGID_ARABIC_EGYPT".enum("", "0x0C01"),
        "TT_MS_LANGID_ARABIC_LIBYA".enum("", "0x1001"),
        "TT_MS_LANGID_ARABIC_ALGERIA".enum("", "0x1401"),
        "TT_MS_LANGID_ARABIC_MOROCCO".enum("", "0x1801"),
        "TT_MS_LANGID_ARABIC_TUNISIA".enum("", "0x1C01"),
        "TT_MS_LANGID_ARABIC_OMAN".enum("", "0x2001"),
        "TT_MS_LANGID_ARABIC_YEMEN".enum("", "0x2401"),
        "TT_MS_LANGID_ARABIC_SYRIA".enum("", "0x2801"),
        "TT_MS_LANGID_ARABIC_JORDAN".enum("", "0x2C01"),
        "TT_MS_LANGID_ARABIC_LEBANON".enum("", "0x3001"),
        "TT_MS_LANGID_ARABIC_KUWAIT".enum("", "0x3401"),
        "TT_MS_LANGID_ARABIC_UAE".enum("", "0x3801"),
        "TT_MS_LANGID_ARABIC_BAHRAIN".enum("", "0x3C01"),
        "TT_MS_LANGID_ARABIC_QATAR".enum("", "0x4001"),
        "TT_MS_LANGID_BULGARIAN_BULGARIA".enum("", "0x0402"),
        "TT_MS_LANGID_CATALAN_CATALAN".enum("", "0x0403"),
        "TT_MS_LANGID_CHINESE_TAIWAN".enum("", "0x0404"),
        "TT_MS_LANGID_CHINESE_PRC".enum("", "0x0804"),
        "TT_MS_LANGID_CHINESE_HONG_KONG".enum("", "0x0C04"),
        "TT_MS_LANGID_CHINESE_SINGAPORE".enum("", "0x1004"),
        "TT_MS_LANGID_CHINESE_MACAO".enum("", "0x1404"),
        "TT_MS_LANGID_CZECH_CZECH_REPUBLIC".enum("", "0x0405"),
        "TT_MS_LANGID_DANISH_DENMARK".enum("", "0x0406"),
        "TT_MS_LANGID_GERMAN_GERMANY".enum("", "0x0407"),
        "TT_MS_LANGID_GERMAN_SWITZERLAND".enum("", "0x0807"),
        "TT_MS_LANGID_GERMAN_AUSTRIA".enum("", "0x0C07"),
        "TT_MS_LANGID_GERMAN_LUXEMBOURG".enum("", "0x1007"),
        "TT_MS_LANGID_GERMAN_LIECHTENSTEIN".enum("", "0x1407"),
        "TT_MS_LANGID_GREEK_GREECE".enum("", "0x0408"),
        "TT_MS_LANGID_ENGLISH_UNITED_STATES".enum("", "0x0409"),
        "TT_MS_LANGID_ENGLISH_UNITED_KINGDOM".enum("", "0x0809"),
        "TT_MS_LANGID_ENGLISH_AUSTRALIA".enum("", "0x0C09"),
        "TT_MS_LANGID_ENGLISH_CANADA".enum("", "0x1009"),
        "TT_MS_LANGID_ENGLISH_NEW_ZEALAND".enum("", "0x1409"),
        "TT_MS_LANGID_ENGLISH_IRELAND".enum("", "0x1809"),
        "TT_MS_LANGID_ENGLISH_SOUTH_AFRICA".enum("", "0x1C09"),
        "TT_MS_LANGID_ENGLISH_JAMAICA".enum("", "0x2009"),
        "TT_MS_LANGID_ENGLISH_CARIBBEAN".enum("", "0x2409"),
        "TT_MS_LANGID_ENGLISH_BELIZE".enum("", "0x2809"),
        "TT_MS_LANGID_ENGLISH_TRINIDAD".enum("", "0x2C09"),
        "TT_MS_LANGID_ENGLISH_ZIMBABWE".enum("", "0x3009"),
        "TT_MS_LANGID_ENGLISH_PHILIPPINES".enum("", "0x3409"),
        "TT_MS_LANGID_ENGLISH_INDIA".enum("", "0x4009"),
        "TT_MS_LANGID_ENGLISH_MALAYSIA".enum("", "0x4409"),
        "TT_MS_LANGID_ENGLISH_SINGAPORE".enum("", "0x4809"),
        "TT_MS_LANGID_SPANISH_SPAIN_TRADITIONAL_SORT".enum("", "0x040A"),
        "TT_MS_LANGID_SPANISH_MEXICO".enum("", "0x080A"),
        "TT_MS_LANGID_SPANISH_SPAIN_MODERN_SORT".enum("", "0x0C0A"),
        "TT_MS_LANGID_SPANISH_GUATEMALA".enum("", "0x100A"),
        "TT_MS_LANGID_SPANISH_COSTA_RICA".enum("", "0x140A"),
        "TT_MS_LANGID_SPANISH_PANAMA".enum("", "0x180A"),
        "TT_MS_LANGID_SPANISH_DOMINICAN_REPUBLIC".enum("", "0x1C0A"),
        "TT_MS_LANGID_SPANISH_VENEZUELA".enum("", "0x200A"),
        "TT_MS_LANGID_SPANISH_COLOMBIA".enum("", "0x240A"),
        "TT_MS_LANGID_SPANISH_PERU".enum("", "0x280A"),
        "TT_MS_LANGID_SPANISH_ARGENTINA".enum("", "0x2C0A"),
        "TT_MS_LANGID_SPANISH_ECUADOR".enum("", "0x300A"),
        "TT_MS_LANGID_SPANISH_CHILE".enum("", "0x340A"),
        "TT_MS_LANGID_SPANISH_URUGUAY".enum("", "0x380A"),
        "TT_MS_LANGID_SPANISH_PARAGUAY".enum("", "0x3C0A"),
        "TT_MS_LANGID_SPANISH_BOLIVIA".enum("", "0x400A"),
        "TT_MS_LANGID_SPANISH_EL_SALVADOR".enum("", "0x440A"),
        "TT_MS_LANGID_SPANISH_HONDURAS".enum("", "0x480A"),
        "TT_MS_LANGID_SPANISH_NICARAGUA".enum("", "0x4C0A"),
        "TT_MS_LANGID_SPANISH_PUERTO_RICO".enum("", "0x500A"),
        "TT_MS_LANGID_SPANISH_UNITED_STATES".enum("", "0x540A"),
        "TT_MS_LANGID_FINNISH_FINLAND".enum("", "0x040B"),
        "TT_MS_LANGID_FRENCH_FRANCE".enum("", "0x040C"),
        "TT_MS_LANGID_FRENCH_BELGIUM".enum("", "0x080C"),
        "TT_MS_LANGID_FRENCH_CANADA".enum("", "0x0C0C"),
        "TT_MS_LANGID_FRENCH_SWITZERLAND".enum("", "0x100C"),
        "TT_MS_LANGID_FRENCH_LUXEMBOURG".enum("", "0x140C"),
        "TT_MS_LANGID_FRENCH_MONACO".enum("", "0x180C"),
        "TT_MS_LANGID_HEBREW_ISRAEL".enum("", "0x040D"),
        "TT_MS_LANGID_HUNGARIAN_HUNGARY".enum("", "0x040E"),
        "TT_MS_LANGID_ICELANDIC_ICELAND".enum("", "0x040F"),
        "TT_MS_LANGID_ITALIAN_ITALY".enum("", "0x0410"),
        "TT_MS_LANGID_ITALIAN_SWITZERLAND".enum("", "0x0810"),
        "TT_MS_LANGID_JAPANESE_JAPAN".enum("", "0x0411"),
        "TT_MS_LANGID_KOREAN_KOREA".enum("", "0x0412"),
        "TT_MS_LANGID_DUTCH_NETHERLANDS".enum("", "0x0413"),
        "TT_MS_LANGID_DUTCH_BELGIUM".enum("", "0x0813"),
        "TT_MS_LANGID_NORWEGIAN_NORWAY_BOKMAL".enum("", "0x0414"),
        "TT_MS_LANGID_NORWEGIAN_NORWAY_NYNORSK".enum("", "0x0814"),
        "TT_MS_LANGID_POLISH_POLAND".enum("", "0x0415"),
        "TT_MS_LANGID_PORTUGUESE_BRAZIL".enum("", "0x0416"),
        "TT_MS_LANGID_PORTUGUESE_PORTUGAL".enum("", "0x0816"),
        "TT_MS_LANGID_ROMANSH_SWITZERLAND".enum("", "0x0417"),
        "TT_MS_LANGID_ROMANIAN_ROMANIA".enum("", "0x0418"),
        "TT_MS_LANGID_RUSSIAN_RUSSIA".enum("", "0x0419"),
        "TT_MS_LANGID_CROATIAN_CROATIA".enum("", "0x041A"),
        "TT_MS_LANGID_SERBIAN_SERBIA_LATIN".enum("", "0x081A"),
        "TT_MS_LANGID_SERBIAN_SERBIA_CYRILLIC".enum("", "0x0C1A"),
        "TT_MS_LANGID_CROATIAN_BOSNIA_HERZEGOVINA".enum("", "0x101A"),
        "TT_MS_LANGID_BOSNIAN_BOSNIA_HERZEGOVINA".enum("", "0x141A"),
        "TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_LATIN".enum("", "0x181A"),
        "TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_CYRILLIC".enum("", "0x1C1A"),
        "TT_MS_LANGID_BOSNIAN_BOSNIA_HERZ_CYRILLIC".enum("", "0x201A"),
        "TT_MS_LANGID_SLOVAK_SLOVAKIA".enum("", "0x041B"),
        "TT_MS_LANGID_ALBANIAN_ALBANIA".enum("", "0x041C"),
        "TT_MS_LANGID_SWEDISH_SWEDEN".enum("", "0x041D"),
        "TT_MS_LANGID_SWEDISH_FINLAND".enum("", "0x081D"),
        "TT_MS_LANGID_THAI_THAILAND".enum("", "0x041E"),
        "TT_MS_LANGID_TURKISH_TURKEY".enum("", "0x041F"),
        "TT_MS_LANGID_URDU_PAKISTAN".enum("", "0x0420"),
        "TT_MS_LANGID_INDONESIAN_INDONESIA".enum("", "0x0421"),
        "TT_MS_LANGID_UKRAINIAN_UKRAINE".enum("", "0x0422"),
        "TT_MS_LANGID_BELARUSIAN_BELARUS".enum("", "0x0423"),
        "TT_MS_LANGID_SLOVENIAN_SLOVENIA".enum("", "0x0424"),
        "TT_MS_LANGID_ESTONIAN_ESTONIA".enum("", "0x0425"),
        "TT_MS_LANGID_LATVIAN_LATVIA".enum("", "0x0426"),
        "TT_MS_LANGID_LITHUANIAN_LITHUANIA".enum("", "0x0427"),
        "TT_MS_LANGID_TAJIK_TAJIKISTAN".enum("", "0x0428"),
        "TT_MS_LANGID_VIETNAMESE_VIET_NAM".enum("", "0x042A"),
        "TT_MS_LANGID_ARMENIAN_ARMENIA".enum("", "0x042B"),
        "TT_MS_LANGID_AZERI_AZERBAIJAN_LATIN".enum("", "0x042C"),
        "TT_MS_LANGID_AZERI_AZERBAIJAN_CYRILLIC".enum("", "0x082C"),
        "TT_MS_LANGID_BASQUE_BASQUE".enum("", "0x042D"),
        "TT_MS_LANGID_UPPER_SORBIAN_GERMANY".enum("", "0x042E"),
        "TT_MS_LANGID_LOWER_SORBIAN_GERMANY".enum("", "0x082E"),
        "TT_MS_LANGID_MACEDONIAN_MACEDONIA".enum("", "0x042F"),
        "TT_MS_LANGID_SETSWANA_SOUTH_AFRICA".enum("", "0x0432"),
        "TT_MS_LANGID_ISIXHOSA_SOUTH_AFRICA".enum("", "0x0434"),
        "TT_MS_LANGID_ISIZULU_SOUTH_AFRICA".enum("", "0x0435"),
        "TT_MS_LANGID_AFRIKAANS_SOUTH_AFRICA".enum("", "0x0436"),
        "TT_MS_LANGID_GEORGIAN_GEORGIA".enum("", "0x0437"),
        "TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS".enum("", "0x0438"),
        "TT_MS_LANGID_HINDI_INDIA".enum("", "0x0439"),
        "TT_MS_LANGID_MALTESE_MALTA".enum("", "0x043A"),
        "TT_MS_LANGID_SAMI_NORTHERN_NORWAY".enum("", "0x043B"),
        "TT_MS_LANGID_SAMI_NORTHERN_SWEDEN".enum("", "0x083B"),
        "TT_MS_LANGID_SAMI_NORTHERN_FINLAND".enum("", "0x0C3B"),
        "TT_MS_LANGID_SAMI_LULE_NORWAY".enum("", "0x103B"),
        "TT_MS_LANGID_SAMI_LULE_SWEDEN".enum("", "0x143B"),
        "TT_MS_LANGID_SAMI_SOUTHERN_NORWAY".enum("", "0x183B"),
        "TT_MS_LANGID_SAMI_SOUTHERN_SWEDEN".enum("", "0x1C3B"),
        "TT_MS_LANGID_SAMI_SKOLT_FINLAND".enum("", "0x203B"),
        "TT_MS_LANGID_SAMI_INARI_FINLAND".enum("", "0x243B"),
        "TT_MS_LANGID_IRISH_IRELAND".enum("", "0x083C"),
        "TT_MS_LANGID_MALAY_MALAYSIA".enum("", "0x043E"),
        "TT_MS_LANGID_MALAY_BRUNEI_DARUSSALAM".enum("", "0x083E"),
        "TT_MS_LANGID_KAZAKH_KAZAKHSTAN".enum("", "0x043F"),
        "TT_MS_LANGID_KYRGYZ_KYRGYZSTAN".enum("", "0x0440"),
        "TT_MS_LANGID_KISWAHILI_KENYA".enum("", "0x0441"),
        "TT_MS_LANGID_TURKMEN_TURKMENISTAN".enum("", "0x0442"),
        "TT_MS_LANGID_UZBEK_UZBEKISTAN_LATIN".enum("", "0x0443"),
        "TT_MS_LANGID_UZBEK_UZBEKISTAN_CYRILLIC".enum("", "0x0843"),
        "TT_MS_LANGID_TATAR_RUSSIA".enum("", "0x0444"),
        "TT_MS_LANGID_BENGALI_INDIA".enum("", "0x0445"),
        "TT_MS_LANGID_BENGALI_BANGLADESH".enum("", "0x0845"),
        "TT_MS_LANGID_PUNJABI_INDIA".enum("", "0x0446"),
        "TT_MS_LANGID_GUJARATI_INDIA".enum("", "0x0447"),
        "TT_MS_LANGID_ODIA_INDIA".enum("", "0x0448"),
        "TT_MS_LANGID_TAMIL_INDIA".enum("", "0x0449"),
        "TT_MS_LANGID_TELUGU_INDIA".enum("", "0x044A"),
        "TT_MS_LANGID_KANNADA_INDIA".enum("", "0x044B"),
        "TT_MS_LANGID_MALAYALAM_INDIA".enum("", "0x044C"),
        "TT_MS_LANGID_ASSAMESE_INDIA".enum("", "0x044D"),
        "TT_MS_LANGID_MARATHI_INDIA".enum("", "0x044E"),
        "TT_MS_LANGID_SANSKRIT_INDIA".enum("", "0x044F"),
        "TT_MS_LANGID_MONGOLIAN_MONGOLIA".enum("", "0x0450"),
        "TT_MS_LANGID_MONGOLIAN_PRC".enum("", "0x0850"),
        "TT_MS_LANGID_TIBETAN_PRC".enum("", "0x0451"),
        "TT_MS_LANGID_WELSH_UNITED_KINGDOM".enum("", "0x0452"),
        "TT_MS_LANGID_KHMER_CAMBODIA".enum("", "0x0453"),
        "TT_MS_LANGID_LAO_LAOS".enum("", "0x0454"),
        "TT_MS_LANGID_GALICIAN_GALICIAN".enum("", "0x0456"),
        "TT_MS_LANGID_KONKANI_INDIA".enum("", "0x0457"),
        "TT_MS_LANGID_SYRIAC_SYRIA".enum("", "0x045A"),
        "TT_MS_LANGID_SINHALA_SRI_LANKA".enum("", "0x045B"),
        "TT_MS_LANGID_INUKTITUT_CANADA".enum("", "0x045D"),
        "TT_MS_LANGID_INUKTITUT_CANADA_LATIN".enum("", "0x085D"),
        "TT_MS_LANGID_AMHARIC_ETHIOPIA".enum("", "0x045E"),
        "TT_MS_LANGID_TAMAZIGHT_ALGERIA".enum("", "0x085F"),
        "TT_MS_LANGID_NEPALI_NEPAL".enum("", "0x0461"),
        "TT_MS_LANGID_FRISIAN_NETHERLANDS".enum("", "0x0462"),
        "TT_MS_LANGID_PASHTO_AFGHANISTAN".enum("", "0x0463"),
        "TT_MS_LANGID_FILIPINO_PHILIPPINES".enum("", "0x0464"),
        "TT_MS_LANGID_DHIVEHI_MALDIVES".enum("", "0x0465"),
        "TT_MS_LANGID_HAUSA_NIGERIA".enum("", "0x0468"),
        "TT_MS_LANGID_YORUBA_NIGERIA".enum("", "0x046A"),
        "TT_MS_LANGID_QUECHUA_BOLIVIA".enum("", "0x046B"),
        "TT_MS_LANGID_QUECHUA_ECUADOR".enum("", "0x086B"),
        "TT_MS_LANGID_QUECHUA_PERU".enum("", "0x0C6B"),
        "TT_MS_LANGID_SESOTHO_SA_LEBOA_SOUTH_AFRICA".enum("", "0x046C"),
        "TT_MS_LANGID_BASHKIR_RUSSIA".enum("", "0x046D"),
        "TT_MS_LANGID_LUXEMBOURGISH_LUXEMBOURG".enum("", "0x046E"),
        "TT_MS_LANGID_GREENLANDIC_GREENLAND".enum("", "0x046F"),
        "TT_MS_LANGID_IGBO_NIGERIA".enum("", "0x0470"),
        "TT_MS_LANGID_YI_PRC".enum("", "0x0478"),
        "TT_MS_LANGID_MAPUDUNGUN_CHILE".enum("", "0x047A"),
        "TT_MS_LANGID_MOHAWK_MOHAWK".enum("", "0x047C"),
        "TT_MS_LANGID_BRETON_FRANCE".enum("", "0x047E"),
        "TT_MS_LANGID_UIGHUR_PRC".enum("", "0x0480"),
        "TT_MS_LANGID_MAORI_NEW_ZEALAND".enum("", "0x0481"),
        "TT_MS_LANGID_OCCITAN_FRANCE".enum("", "0x0482"),
        "TT_MS_LANGID_CORSICAN_FRANCE".enum("", "0x0483"),
        "TT_MS_LANGID_ALSATIAN_FRANCE".enum("", "0x0484"),
        "TT_MS_LANGID_YAKUT_RUSSIA".enum("", "0x0485"),
        "TT_MS_LANGID_KICHE_GUATEMALA".enum("", "0x0486"),
        "TT_MS_LANGID_KINYARWANDA_RWANDA".enum("", "0x0487"),
        "TT_MS_LANGID_WOLOF_SENEGAL".enum("", "0x0488"),
        "TT_MS_LANGID_DARI_AFGHANISTAN".enum("", "0x048C")
    ).noPrefix()

    EnumConstant(
        "",

        "TT_NAME_ID_COPYRIGHT".enum("", "0"),
        "TT_NAME_ID_FONT_FAMILY".enum("", "1"),
        "TT_NAME_ID_FONT_SUBFAMILY".enum("", "2"),
        "TT_NAME_ID_UNIQUE_ID".enum("", "3"),
        "TT_NAME_ID_FULL_NAME".enum("", "4"),
        "TT_NAME_ID_VERSION_STRING".enum("", "5"),
        "TT_NAME_ID_PS_NAME".enum("", "6"),
        "TT_NAME_ID_TRADEMARK".enum("", "7"),
        "TT_NAME_ID_MANUFACTURER".enum("", "8"),
        "TT_NAME_ID_DESIGNER".enum("", "9"),
        "TT_NAME_ID_DESCRIPTION".enum("", "10"),
        "TT_NAME_ID_VENDOR_URL".enum("", "11"),
        "TT_NAME_ID_DESIGNER_URL".enum("", "12"),
        "TT_NAME_ID_LICENSE".enum("", "13"),
        "TT_NAME_ID_LICENSE_URL".enum("", "14"),
        "TT_NAME_ID_TYPOGRAPHIC_FAMILY".enum("", "16"),
        "TT_NAME_ID_TYPOGRAPHIC_SUBFAMILY".enum("", "17"),
        "TT_NAME_ID_MAC_FULL_NAME".enum("", "18"),
        "TT_NAME_ID_SAMPLE_TEXT".enum("", "19"),
        "TT_NAME_ID_CID_FINDFONT_NAME".enum("", "20"),
        "TT_NAME_ID_WWS_FAMILY".enum("", "21"),
        "TT_NAME_ID_WWS_SUBFAMILY".enum("", "22"),
        "TT_NAME_ID_LIGHT_BACKGROUND".enum("", "23"),
        "TT_NAME_ID_DARK_BACKGROUND".enum("", "24"),
        "TT_NAME_ID_VARIATIONS_PREFIX".enum("", "25")
    ).noPrefix()

    EnumConstant(
        "",

        "TT_UCR_BASIC_LATIN".enum("", "1 <<  0"),
        "TT_UCR_LATIN1_SUPPLEMENT".enum("", "1 <<  1"),
        "TT_UCR_LATIN_EXTENDED_A".enum("", "1 <<  2"),
        "TT_UCR_LATIN_EXTENDED_B".enum("", "1 <<  3"),
        "TT_UCR_IPA_EXTENSIONS".enum("", "1 <<  4"),
        "TT_UCR_SPACING_MODIFIER".enum("", "1 <<  5"),
        "TT_UCR_COMBINING_DIACRITICAL_MARKS".enum("", "1 <<  6"),
        "TT_UCR_GREEK".enum("", "1 <<  7"),
        "TT_UCR_COPTIC".enum("", "1 <<  8"),
        "TT_UCR_CYRILLIC".enum("", "1 <<  9"),
        "TT_UCR_ARMENIAN".enum("", "1 << 10"),
        "TT_UCR_HEBREW".enum("", "1 << 11"),
        "TT_UCR_VAI".enum("", "1 << 12"),
        "TT_UCR_ARABIC".enum("", "1 << 13"),
        "TT_UCR_NKO".enum("", "1 << 14"),
        "TT_UCR_DEVANAGARI".enum("", "1 << 15"),
        "TT_UCR_BENGALI".enum("", "1 << 16"),
        "TT_UCR_GURMUKHI".enum("", "1 << 17"),
        "TT_UCR_GUJARATI".enum("", "1 << 18"),
        "TT_UCR_ORIYA".enum("", "1 << 19"),
        "TT_UCR_TAMIL".enum("", "1 << 20"),
        "TT_UCR_TELUGU".enum("", "1 << 21"),
        "TT_UCR_KANNADA".enum("", "1 << 22"),
        "TT_UCR_MALAYALAM".enum("", "1 << 23"),
        "TT_UCR_THAI".enum("", "1 << 24"),
        "TT_UCR_LAO".enum("", "1 << 25"),
        "TT_UCR_GEORGIAN".enum("", "1 << 26"),
        "TT_UCR_BALINESE".enum("", "1 << 27"),
        "TT_UCR_HANGUL_JAMO".enum("", "1 << 28"),
        "TT_UCR_LATIN_EXTENDED_ADDITIONAL".enum("", "1 << 29"),
        "TT_UCR_GREEK_EXTENDED".enum("", "1 << 30"),
        "TT_UCR_GENERAL_PUNCTUATION".enum("", "1 << 31"),
        "TT_UCR_SUPERSCRIPTS_SUBSCRIPTS".enum("", "1 <<  0"),
        "TT_UCR_CURRENCY_SYMBOLS".enum("", "1 <<  1"),
        "TT_UCR_COMBINING_DIACRITICAL_MARKS_SYMB".enum("", "1 <<  2"),
        "TT_UCR_LETTERLIKE_SYMBOLS".enum("", "1 <<  3"),
        "TT_UCR_NUMBER_FORMS".enum("", "1 <<  4"),
        "TT_UCR_ARROWS".enum("", "1 <<  5"),
        "TT_UCR_MATHEMATICAL_OPERATORS".enum("", "1 <<  6"),
        "TT_UCR_MISCELLANEOUS_TECHNICAL".enum("", "1 <<  7"),
        "TT_UCR_CONTROL_PICTURES".enum("", "1 <<  8"),
        "TT_UCR_OCR".enum("", "1 <<  9"),
        "TT_UCR_ENCLOSED_ALPHANUMERICS".enum("", "1 << 10"),
        "TT_UCR_BOX_DRAWING".enum("", "1 << 11"),
        "TT_UCR_BLOCK_ELEMENTS".enum("", "1 << 12"),
        "TT_UCR_GEOMETRIC_SHAPES".enum("", "1 << 13"),
        "TT_UCR_MISCELLANEOUS_SYMBOLS".enum("", "1 << 14"),
        "TT_UCR_DINGBATS".enum("", "1 << 15"),
        "TT_UCR_CJK_SYMBOLS".enum("", "1 << 16"),
        "TT_UCR_HIRAGANA".enum("", "1 << 17"),
        "TT_UCR_KATAKANA".enum("", "1 << 18"),
        "TT_UCR_BOPOMOFO".enum("", "1 << 19"),
        "TT_UCR_HANGUL_COMPATIBILITY_JAMO".enum("", "1 << 20"),
        "TT_UCR_CJK_MISC".enum("", "1 << 21"),
        "TT_UCR_ENCLOSED_CJK_LETTERS_MONTHS".enum("", "1 << 22"),
        "TT_UCR_CJK_COMPATIBILITY".enum("", "1 << 23"),
        "TT_UCR_HANGUL".enum("", "1 << 24"),
        "TT_UCR_SURROGATES".enum("", "1 << 25"),
        "TT_UCR_PHOENICIAN".enum("", "1 << 26"),
        "TT_UCR_CJK_UNIFIED_IDEOGRAPHS".enum("", "1 << 27"),
        "TT_UCR_PRIVATE_USE".enum("", "1 << 28"),
        "TT_UCR_CJK_COMPATIBILITY_IDEOGRAPHS".enum("", "1 << 29"),
        "TT_UCR_ALPHABETIC_PRESENTATION_FORMS".enum("", "1 << 30"),
        "TT_UCR_ARABIC_PRESENTATION_FORMS_A".enum("", "1 << 31"),
        "TT_UCR_COMBINING_HALF_MARKS".enum("", "1 <<  0"),
        "TT_UCR_CJK_COMPATIBILITY_FORMS".enum("", "1 <<  1"),
        "TT_UCR_SMALL_FORM_VARIANTS".enum("", "1 <<  2"),
        "TT_UCR_ARABIC_PRESENTATION_FORMS_B".enum("", "1 <<  3"),
        "TT_UCR_HALFWIDTH_FULLWIDTH_FORMS".enum("", "1 <<  4"),
        "TT_UCR_SPECIALS".enum("", "1 <<  5"),
        "TT_UCR_TIBETAN".enum("", "1 <<  6"),
        "TT_UCR_SYRIAC".enum("", "1 <<  7"),
        "TT_UCR_THAANA".enum("", "1 <<  8"),
        "TT_UCR_SINHALA".enum("", "1 <<  9"),
        "TT_UCR_MYANMAR".enum("", "1 << 10"),
        "TT_UCR_ETHIOPIC".enum("", "1 << 11"),
        "TT_UCR_CHEROKEE".enum("", "1 << 12"),
        "TT_UCR_CANADIAN_ABORIGINAL_SYLLABICS".enum("", "1 << 13"),
        "TT_UCR_OGHAM".enum("", "1 << 14"),
        "TT_UCR_RUNIC".enum("", "1 << 15"),
        "TT_UCR_KHMER".enum("", "1 << 16"),
        "TT_UCR_MONGOLIAN".enum("", "1 << 17"),
        "TT_UCR_BRAILLE".enum("", "1 << 18"),
        "TT_UCR_YI".enum("", "1 << 19"),
        "TT_UCR_PHILIPPINE".enum("", "1 << 20"),
        "TT_UCR_OLD_ITALIC".enum("", "1 << 21"),
        "TT_UCR_GOTHIC".enum("", "1 << 22"),
        "TT_UCR_DESERET".enum("", "1 << 23"),
        "TT_UCR_MUSICAL_SYMBOLS".enum("", "1 << 24"),
        "TT_UCR_MATH_ALPHANUMERIC_SYMBOLS".enum("", "1 << 25"),
        "TT_UCR_PRIVATE_USE_SUPPLEMENTARY".enum("", "1 << 26"),
        "TT_UCR_VARIATION_SELECTORS".enum("", "1 << 27"),
        "TT_UCR_TAGS".enum("", "1 << 28"),
        "TT_UCR_LIMBU".enum("", "1 << 29"),
        "TT_UCR_TAI_LE".enum("", "1 << 30"),
        "TT_UCR_NEW_TAI_LUE".enum("", "1 << 31"),
        "TT_UCR_BUGINESE".enum("", "1 <<  0"),
        "TT_UCR_GLAGOLITIC".enum("", "1 <<  1"),
        "TT_UCR_TIFINAGH".enum("", "1 <<  2"),
        "TT_UCR_YIJING".enum("", "1 <<  3"),
        "TT_UCR_SYLOTI_NAGRI".enum("", "1 <<  4"),
        "TT_UCR_LINEAR_B".enum("", "1 <<  5"),
        "TT_UCR_ANCIENT_GREEK_NUMBERS".enum("", "1 <<  6"),
        "TT_UCR_UGARITIC".enum("", "1 <<  7"),
        "TT_UCR_OLD_PERSIAN".enum("", "1 <<  8"),
        "TT_UCR_SHAVIAN".enum("", "1 <<  9"),
        "TT_UCR_OSMANYA".enum("", "1 << 10"),
        "TT_UCR_CYPRIOT_SYLLABARY".enum("", "1 << 11"),
        "TT_UCR_KHAROSHTHI".enum("", "1 << 12"),
        "TT_UCR_TAI_XUAN_JING".enum("", "1 << 13"),
        "TT_UCR_CUNEIFORM".enum("", "1 << 14"),
        "TT_UCR_COUNTING_ROD_NUMERALS".enum("", "1 << 15"),
        "TT_UCR_SUNDANESE".enum("", "1 << 16"),
        "TT_UCR_LEPCHA".enum("", "1 << 17"),
        "TT_UCR_OL_CHIKI".enum("", "1 << 18"),
        "TT_UCR_SAURASHTRA".enum("", "1 << 19"),
        "TT_UCR_KAYAH_LI".enum("", "1 << 20"),
        "TT_UCR_REJANG".enum("", "1 << 21"),
        "TT_UCR_CHAM".enum("", "1 << 22"),
        "TT_UCR_ANCIENT_SYMBOLS".enum("", "1 << 23"),
        "TT_UCR_PHAISTOS_DISC".enum("", "1 << 24"),
        "TT_UCR_OLD_ANATOLIAN".enum("", "1 << 25"),
        "TT_UCR_GAME_TILES".enum("", "1 << 26")
    ).noPrefix()

    // tttables.h

    EnumConstant(
        "{@code FT_Sfnt_Tag}",

        "SFNT_HEAD".enum("", "0"),
        "SFNT_MAXP".enum,
        "SFNT_OS2".enum,
        "SFNT_HHEA".enum,
        "SFNT_VHEA".enum,
        "SFNT_POST".enum,
        "SFNT_PCLT".enum,
        "SFNT_MAX".enum
    )

    opaque_p(
        "Get_Sfnt_Table",
        "",

        FT_Face("face", ""),
        FT_Sfnt_Tag("tag", "")
    )

    FT_Error(
        "Load_Sfnt_Table",
        "",

        FT_Face("face", ""),
        FT_ULong("tag", ""),
        FT_Long("offset", ""),
        Unsafe..nullable..FT_Byte.p("buffer", ""),
        Check(1)..nullable..FT_ULong.p("length", "")
    )

    FT_Error(
        "Sfnt_Table_Info",
        "",

        FT_Face("face", ""),
        FT_UInt("table_index", ""),
        Unsafe..nullable..FT_ULong.p("tag", ""),
        Check(1)..nullable..FT_ULong.p("length", "")
    )

    FT_ULong(
        "Get_CMap_Language_ID",
        "",

        FT_CharMap("charmap", "")
    )

    FT_Long(
        "Get_CMap_Format",
        "",

        FT_CharMap("charmap", "")
    )

    // tttags.h

    IntConstant(
        "",

        "TTAG_avar".."FT_MAKE_TAG( 'a', 'v', 'a', 'r' )",
        "TTAG_BASE".."FT_MAKE_TAG( 'B', 'A', 'S', 'E' )",
        "TTAG_bdat".."FT_MAKE_TAG( 'b', 'd', 'a', 't' )",
        "TTAG_BDF".."FT_MAKE_TAG( 'B', 'D', 'F', ' ' )",
        "TTAG_bhed".."FT_MAKE_TAG( 'b', 'h', 'e', 'd' )",
        "TTAG_bloc".."FT_MAKE_TAG( 'b', 'l', 'o', 'c' )",
        "TTAG_bsln".."FT_MAKE_TAG( 'b', 's', 'l', 'n' )",
        "TTAG_CBDT".."FT_MAKE_TAG( 'C', 'B', 'D', 'T' )",
        "TTAG_CBLC".."FT_MAKE_TAG( 'C', 'B', 'L', 'C' )",
        "TTAG_CFF".."FT_MAKE_TAG( 'C', 'F', 'F', ' ' )",
        "TTAG_CFF2".."FT_MAKE_TAG( 'C', 'F', 'F', '2' )",
        "TTAG_CID".."FT_MAKE_TAG( 'C', 'I', 'D', ' ' )",
        "TTAG_cmap".."FT_MAKE_TAG( 'c', 'm', 'a', 'p' )",
        "TTAG_COLR".."FT_MAKE_TAG( 'C', 'O', 'L', 'R' )",
        "TTAG_CPAL".."FT_MAKE_TAG( 'C', 'P', 'A', 'L' )",
        "TTAG_cvar".."FT_MAKE_TAG( 'c', 'v', 'a', 'r' )",
        "TTAG_cvt".."FT_MAKE_TAG( 'c', 'v', 't', ' ' )",
        "TTAG_DSIG".."FT_MAKE_TAG( 'D', 'S', 'I', 'G' )",
        "TTAG_EBDT".."FT_MAKE_TAG( 'E', 'B', 'D', 'T' )",
        "TTAG_EBLC".."FT_MAKE_TAG( 'E', 'B', 'L', 'C' )",
        "TTAG_EBSC".."FT_MAKE_TAG( 'E', 'B', 'S', 'C' )",
        "TTAG_feat".."FT_MAKE_TAG( 'f', 'e', 'a', 't' )",
        "TTAG_FOND".."FT_MAKE_TAG( 'F', 'O', 'N', 'D' )",
        "TTAG_fpgm".."FT_MAKE_TAG( 'f', 'p', 'g', 'm' )",
        "TTAG_fvar".."FT_MAKE_TAG( 'f', 'v', 'a', 'r' )",
        "TTAG_gasp".."FT_MAKE_TAG( 'g', 'a', 's', 'p' )",
        "TTAG_GDEF".."FT_MAKE_TAG( 'G', 'D', 'E', 'F' )",
        "TTAG_glyf".."FT_MAKE_TAG( 'g', 'l', 'y', 'f' )",
        "TTAG_GPOS".."FT_MAKE_TAG( 'G', 'P', 'O', 'S' )",
        "TTAG_GSUB".."FT_MAKE_TAG( 'G', 'S', 'U', 'B' )",
        "TTAG_gvar".."FT_MAKE_TAG( 'g', 'v', 'a', 'r' )",
        "TTAG_HVAR".."FT_MAKE_TAG( 'H', 'V', 'A', 'R' )",
        "TTAG_hdmx".."FT_MAKE_TAG( 'h', 'd', 'm', 'x' )",
        "TTAG_head".."FT_MAKE_TAG( 'h', 'e', 'a', 'd' )",
        "TTAG_hhea".."FT_MAKE_TAG( 'h', 'h', 'e', 'a' )",
        "TTAG_hmtx".."FT_MAKE_TAG( 'h', 'm', 't', 'x' )",
        "TTAG_JSTF".."FT_MAKE_TAG( 'J', 'S', 'T', 'F' )",
        "TTAG_just".."FT_MAKE_TAG( 'j', 'u', 's', 't' )",
        "TTAG_kern".."FT_MAKE_TAG( 'k', 'e', 'r', 'n' )",
        "TTAG_lcar".."FT_MAKE_TAG( 'l', 'c', 'a', 'r' )",
        "TTAG_loca".."FT_MAKE_TAG( 'l', 'o', 'c', 'a' )",
        "TTAG_LTSH".."FT_MAKE_TAG( 'L', 'T', 'S', 'H' )",
        "TTAG_LWFN".."FT_MAKE_TAG( 'L', 'W', 'F', 'N' )",
        "TTAG_MATH".."FT_MAKE_TAG( 'M', 'A', 'T', 'H' )",
        "TTAG_maxp".."FT_MAKE_TAG( 'm', 'a', 'x', 'p' )",
        "TTAG_META".."FT_MAKE_TAG( 'M', 'E', 'T', 'A' )",
        "TTAG_MMFX".."FT_MAKE_TAG( 'M', 'M', 'F', 'X' )",
        "TTAG_MMSD".."FT_MAKE_TAG( 'M', 'M', 'S', 'D' )",
        "TTAG_mort".."FT_MAKE_TAG( 'm', 'o', 'r', 't' )",
        "TTAG_morx".."FT_MAKE_TAG( 'm', 'o', 'r', 'x' )",
        "TTAG_MVAR".."FT_MAKE_TAG( 'M', 'V', 'A', 'R' )",
        "TTAG_name".."FT_MAKE_TAG( 'n', 'a', 'm', 'e' )",
        "TTAG_opbd".."FT_MAKE_TAG( 'o', 'p', 'b', 'd' )",
        "TTAG_OS2".."FT_MAKE_TAG( 'O', 'S', '/', '2' )",
        "TTAG_OTTO".."FT_MAKE_TAG( 'O', 'T', 'T', 'O' )",
        "TTAG_PCLT".."FT_MAKE_TAG( 'P', 'C', 'L', 'T' )",
        "TTAG_POST".."FT_MAKE_TAG( 'P', 'O', 'S', 'T' )",
        "TTAG_post".."FT_MAKE_TAG( 'p', 'o', 's', 't' )",
        "TTAG_prep".."FT_MAKE_TAG( 'p', 'r', 'e', 'p' )",
        "TTAG_prop".."FT_MAKE_TAG( 'p', 'r', 'o', 'p' )",
        "TTAG_sbix".."FT_MAKE_TAG( 's', 'b', 'i', 'x' )",
        "TTAG_sfnt".."FT_MAKE_TAG( 's', 'f', 'n', 't' )",
        "TTAG_SING".."FT_MAKE_TAG( 'S', 'I', 'N', 'G' )",
        "TTAG_SVG".."FT_MAKE_TAG( 'S', 'V', 'G', ' ' )",
        "TTAG_trak".."FT_MAKE_TAG( 't', 'r', 'a', 'k' )",
        "TTAG_true".."FT_MAKE_TAG( 't', 'r', 'u', 'e' )",
        "TTAG_ttc".."FT_MAKE_TAG( 't', 't', 'c', ' ' )",
        "TTAG_ttcf".."FT_MAKE_TAG( 't', 't', 'c', 'f' )",
        "TTAG_TYP1".."FT_MAKE_TAG( 'T', 'Y', 'P', '1' )",
        "TTAG_typ1".."FT_MAKE_TAG( 't', 'y', 'p', '1' )",
        "TTAG_VDMX".."FT_MAKE_TAG( 'V', 'D', 'M', 'X' )",
        "TTAG_vhea".."FT_MAKE_TAG( 'v', 'h', 'e', 'a' )",
        "TTAG_vmtx".."FT_MAKE_TAG( 'v', 'm', 't', 'x' )",
        "TTAG_VVAR".."FT_MAKE_TAG( 'V', 'V', 'A', 'R' )",
        "TTAG_wOFF".."FT_MAKE_TAG( 'w', 'O', 'F', 'F' )",
        "TTAG_wOF2".."FT_MAKE_TAG( 'w', 'O', 'F', '2' )",
        "TTAG_0xA5kbd".."FT_MAKE_TAG( 0xA5, 'k', 'b', 'd' )",
        "TTAG_0xA5lst".."FT_MAKE_TAG( 0xA5, 'l', 's', 't' )"
    ).noPrefix()

}