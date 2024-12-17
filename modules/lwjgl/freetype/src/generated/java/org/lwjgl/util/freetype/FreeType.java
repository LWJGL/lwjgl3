/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FreeType {

    private static final SharedLibrary FREETYPE = Library.loadNative(FreeType.class, "org.lwjgl.freetype", Configuration.FREETYPE_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("freetype")), true);

    /** Contains the function pointers loaded from the freetype {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Init_FreeType                        = apiGetFunctionAddress(FREETYPE, "FT_Init_FreeType"),
            Done_FreeType                        = apiGetFunctionAddress(FREETYPE, "FT_Done_FreeType"),
            New_Face                             = apiGetFunctionAddress(FREETYPE, "FT_New_Face"),
            New_Memory_Face                      = apiGetFunctionAddress(FREETYPE, "FT_New_Memory_Face"),
            Open_Face                            = apiGetFunctionAddress(FREETYPE, "FT_Open_Face"),
            Attach_File                          = apiGetFunctionAddress(FREETYPE, "FT_Attach_File"),
            Attach_Stream                        = apiGetFunctionAddress(FREETYPE, "FT_Attach_Stream"),
            Reference_Face                       = apiGetFunctionAddress(FREETYPE, "FT_Reference_Face"),
            Done_Face                            = apiGetFunctionAddress(FREETYPE, "FT_Done_Face"),
            Select_Size                          = apiGetFunctionAddress(FREETYPE, "FT_Select_Size"),
            Request_Size                         = apiGetFunctionAddress(FREETYPE, "FT_Request_Size"),
            Set_Char_Size                        = apiGetFunctionAddress(FREETYPE, "FT_Set_Char_Size"),
            Set_Pixel_Sizes                      = apiGetFunctionAddress(FREETYPE, "FT_Set_Pixel_Sizes"),
            Load_Glyph                           = apiGetFunctionAddress(FREETYPE, "FT_Load_Glyph"),
            Load_Char                            = apiGetFunctionAddress(FREETYPE, "FT_Load_Char"),
            Set_Transform                        = apiGetFunctionAddress(FREETYPE, "FT_Set_Transform"),
            Get_Transform                        = apiGetFunctionAddress(FREETYPE, "FT_Get_Transform"),
            Render_Glyph                         = apiGetFunctionAddress(FREETYPE, "FT_Render_Glyph"),
            Get_Kerning                          = apiGetFunctionAddress(FREETYPE, "FT_Get_Kerning"),
            Get_Track_Kerning                    = apiGetFunctionAddress(FREETYPE, "FT_Get_Track_Kerning"),
            Select_Charmap                       = apiGetFunctionAddress(FREETYPE, "FT_Select_Charmap"),
            Set_Charmap                          = apiGetFunctionAddress(FREETYPE, "FT_Set_Charmap"),
            Get_Charmap_Index                    = apiGetFunctionAddress(FREETYPE, "FT_Get_Charmap_Index"),
            Get_Char_Index                       = apiGetFunctionAddress(FREETYPE, "FT_Get_Char_Index"),
            Get_First_Char                       = apiGetFunctionAddress(FREETYPE, "FT_Get_First_Char"),
            Get_Next_Char                        = apiGetFunctionAddress(FREETYPE, "FT_Get_Next_Char"),
            Face_Properties                      = apiGetFunctionAddress(FREETYPE, "FT_Face_Properties"),
            Get_Name_Index                       = apiGetFunctionAddress(FREETYPE, "FT_Get_Name_Index"),
            Get_Glyph_Name                       = apiGetFunctionAddress(FREETYPE, "FT_Get_Glyph_Name"),
            Get_Postscript_Name                  = apiGetFunctionAddress(FREETYPE, "FT_Get_Postscript_Name"),
            Get_SubGlyph_Info                    = apiGetFunctionAddress(FREETYPE, "FT_Get_SubGlyph_Info"),
            Get_FSType_Flags                     = apiGetFunctionAddress(FREETYPE, "FT_Get_FSType_Flags"),
            Face_GetCharVariantIndex             = apiGetFunctionAddress(FREETYPE, "FT_Face_GetCharVariantIndex"),
            Face_GetCharVariantIsDefault         = apiGetFunctionAddress(FREETYPE, "FT_Face_GetCharVariantIsDefault"),
            Face_GetVariantSelectors             = apiGetFunctionAddress(FREETYPE, "FT_Face_GetVariantSelectors"),
            Face_GetVariantsOfChar               = apiGetFunctionAddress(FREETYPE, "FT_Face_GetVariantsOfChar"),
            Face_GetCharsOfVariant               = apiGetFunctionAddress(FREETYPE, "FT_Face_GetCharsOfVariant"),
            MulDiv                               = apiGetFunctionAddress(FREETYPE, "FT_MulDiv"),
            MulFix                               = apiGetFunctionAddress(FREETYPE, "FT_MulFix"),
            DivFix                               = apiGetFunctionAddress(FREETYPE, "FT_DivFix"),
            RoundFix                             = apiGetFunctionAddress(FREETYPE, "FT_RoundFix"),
            CeilFix                              = apiGetFunctionAddress(FREETYPE, "FT_CeilFix"),
            FloorFix                             = apiGetFunctionAddress(FREETYPE, "FT_FloorFix"),
            Vector_Transform                     = apiGetFunctionAddress(FREETYPE, "FT_Vector_Transform"),
            Library_Version                      = apiGetFunctionAddress(FREETYPE, "FT_Library_Version"),
            Face_CheckTrueTypePatents            = apiGetFunctionAddress(FREETYPE, "FT_Face_CheckTrueTypePatents"),
            Face_SetUnpatentedHinting            = apiGetFunctionAddress(FREETYPE, "FT_Face_SetUnpatentedHinting"),
            Get_Advance                          = apiGetFunctionAddress(FREETYPE, "FT_Get_Advance"),
            Get_Advances                         = apiGetFunctionAddress(FREETYPE, "FT_Get_Advances"),
            Outline_Get_BBox                     = apiGetFunctionAddress(FREETYPE, "FT_Outline_Get_BBox"),
            Get_BDF_Charset_ID                   = apiGetFunctionAddress(FREETYPE, "FT_Get_BDF_Charset_ID"),
            Get_BDF_Property                     = apiGetFunctionAddress(FREETYPE, "FT_Get_BDF_Property"),
            Bitmap_Init                          = apiGetFunctionAddress(FREETYPE, "FT_Bitmap_Init"),
            Bitmap_Copy                          = apiGetFunctionAddress(FREETYPE, "FT_Bitmap_Copy"),
            Bitmap_Embolden                      = apiGetFunctionAddress(FREETYPE, "FT_Bitmap_Embolden"),
            Bitmap_Convert                       = apiGetFunctionAddress(FREETYPE, "FT_Bitmap_Convert"),
            Bitmap_Blend                         = apiGetFunctionAddress(FREETYPE, "FT_Bitmap_Blend"),
            GlyphSlot_Own_Bitmap                 = apiGetFunctionAddress(FREETYPE, "FT_GlyphSlot_Own_Bitmap"),
            Bitmap_Done                          = apiGetFunctionAddress(FREETYPE, "FT_Bitmap_Done"),
            Stream_OpenBzip2                     = apiGetFunctionAddressOptional(FREETYPE, "FT_Stream_OpenBzip2"),
            FTC_Manager_New                      = apiGetFunctionAddress(FREETYPE, "FTC_Manager_New"),
            FTC_Manager_Reset                    = apiGetFunctionAddress(FREETYPE, "FTC_Manager_Reset"),
            FTC_Manager_Done                     = apiGetFunctionAddress(FREETYPE, "FTC_Manager_Done"),
            FTC_Manager_LookupFace               = apiGetFunctionAddress(FREETYPE, "FTC_Manager_LookupFace"),
            FTC_Manager_LookupSize               = apiGetFunctionAddress(FREETYPE, "FTC_Manager_LookupSize"),
            FTC_Node_Unref                       = apiGetFunctionAddress(FREETYPE, "FTC_Node_Unref"),
            FTC_Manager_RemoveFaceID             = apiGetFunctionAddress(FREETYPE, "FTC_Manager_RemoveFaceID"),
            FTC_CMapCache_New                    = apiGetFunctionAddress(FREETYPE, "FTC_CMapCache_New"),
            FTC_CMapCache_Lookup                 = apiGetFunctionAddress(FREETYPE, "FTC_CMapCache_Lookup"),
            FTC_ImageCache_New                   = apiGetFunctionAddress(FREETYPE, "FTC_ImageCache_New"),
            FTC_ImageCache_Lookup                = apiGetFunctionAddress(FREETYPE, "FTC_ImageCache_Lookup"),
            FTC_ImageCache_LookupScaler          = apiGetFunctionAddress(FREETYPE, "FTC_ImageCache_LookupScaler"),
            FTC_SBitCache_New                    = apiGetFunctionAddress(FREETYPE, "FTC_SBitCache_New"),
            FTC_SBitCache_Lookup                 = apiGetFunctionAddress(FREETYPE, "FTC_SBitCache_Lookup"),
            FTC_SBitCache_LookupScaler           = apiGetFunctionAddress(FREETYPE, "FTC_SBitCache_LookupScaler"),
            Get_CID_Registry_Ordering_Supplement = apiGetFunctionAddress(FREETYPE, "FT_Get_CID_Registry_Ordering_Supplement"),
            Get_CID_Is_Internally_CID_Keyed      = apiGetFunctionAddress(FREETYPE, "FT_Get_CID_Is_Internally_CID_Keyed"),
            Get_CID_From_Glyph_Index             = apiGetFunctionAddress(FREETYPE, "FT_Get_CID_From_Glyph_Index"),
            Palette_Data_Get                     = apiGetFunctionAddress(FREETYPE, "FT_Palette_Data_Get"),
            Palette_Select                       = apiGetFunctionAddress(FREETYPE, "FT_Palette_Select"),
            Palette_Set_Foreground_Color         = apiGetFunctionAddress(FREETYPE, "FT_Palette_Set_Foreground_Color"),
            Get_Color_Glyph_Layer                = apiGetFunctionAddress(FREETYPE, "FT_Get_Color_Glyph_Layer"),
            Get_Color_Glyph_Paint                = apiGetFunctionAddress(FREETYPE, "FT_Get_Color_Glyph_Paint"),
            Get_Color_Glyph_ClipBox              = apiGetFunctionAddress(FREETYPE, "FT_Get_Color_Glyph_ClipBox"),
            Get_Paint_Layers                     = apiGetFunctionAddress(FREETYPE, "FT_Get_Paint_Layers"),
            Get_Colorline_Stops                  = apiGetFunctionAddress(FREETYPE, "FT_Get_Colorline_Stops"),
            Get_Paint                            = apiGetFunctionAddress(FREETYPE, "FT_Get_Paint"),
            Error_String                         = apiGetFunctionAddress(FREETYPE, "FT_Error_String"),
            Get_Font_Format                      = apiGetFunctionAddress(FREETYPE, "FT_Get_Font_Format"),
            Get_Gasp                             = apiGetFunctionAddress(FREETYPE, "FT_Get_Gasp"),
            New_Glyph                            = apiGetFunctionAddress(FREETYPE, "FT_New_Glyph"),
            Get_Glyph                            = apiGetFunctionAddress(FREETYPE, "FT_Get_Glyph"),
            Glyph_Copy                           = apiGetFunctionAddress(FREETYPE, "FT_Glyph_Copy"),
            Glyph_Transform                      = apiGetFunctionAddress(FREETYPE, "FT_Glyph_Transform"),
            Glyph_Get_CBox                       = apiGetFunctionAddress(FREETYPE, "FT_Glyph_Get_CBox"),
            Glyph_To_Bitmap                      = apiGetFunctionAddress(FREETYPE, "FT_Glyph_To_Bitmap"),
            Done_Glyph                           = apiGetFunctionAddress(FREETYPE, "FT_Done_Glyph"),
            Matrix_Multiply                      = apiGetFunctionAddress(FREETYPE, "FT_Matrix_Multiply"),
            Matrix_Invert                        = apiGetFunctionAddress(FREETYPE, "FT_Matrix_Invert"),
            TrueTypeGX_Validate                  = apiGetFunctionAddress(FREETYPE, "FT_TrueTypeGX_Validate"),
            TrueTypeGX_Free                      = apiGetFunctionAddress(FREETYPE, "FT_TrueTypeGX_Free"),
            ClassicKern_Validate                 = apiGetFunctionAddress(FREETYPE, "FT_ClassicKern_Validate"),
            ClassicKern_Free                     = apiGetFunctionAddress(FREETYPE, "FT_ClassicKern_Free"),
            Stream_OpenGzip                      = apiGetFunctionAddress(FREETYPE, "FT_Stream_OpenGzip"),
            Gzip_Uncompress                      = apiGetFunctionAddress(FREETYPE, "FT_Gzip_Uncompress"),
            Library_SetLcdFilter                 = apiGetFunctionAddress(FREETYPE, "FT_Library_SetLcdFilter"),
            Library_SetLcdFilterWeights          = apiGetFunctionAddress(FREETYPE, "FT_Library_SetLcdFilterWeights"),
            Library_SetLcdGeometry               = apiGetFunctionAddress(FREETYPE, "FT_Library_SetLcdGeometry"),
            List_Find                            = apiGetFunctionAddress(FREETYPE, "FT_List_Find"),
            List_Add                             = apiGetFunctionAddress(FREETYPE, "FT_List_Add"),
            List_Insert                          = apiGetFunctionAddress(FREETYPE, "FT_List_Insert"),
            List_Remove                          = apiGetFunctionAddress(FREETYPE, "FT_List_Remove"),
            List_Up                              = apiGetFunctionAddress(FREETYPE, "FT_List_Up"),
            List_Iterate                         = apiGetFunctionAddress(FREETYPE, "FT_List_Iterate"),
            List_Finalize                        = apiGetFunctionAddress(FREETYPE, "FT_List_Finalize"),
            Stream_OpenLZW                       = apiGetFunctionAddress(FREETYPE, "FT_Stream_OpenLZW"),
            Get_Multi_Master                     = apiGetFunctionAddress(FREETYPE, "FT_Get_Multi_Master"),
            Get_MM_Var                           = apiGetFunctionAddress(FREETYPE, "FT_Get_MM_Var"),
            Done_MM_Var                          = apiGetFunctionAddress(FREETYPE, "FT_Done_MM_Var"),
            Set_MM_Design_Coordinates            = apiGetFunctionAddress(FREETYPE, "FT_Set_MM_Design_Coordinates"),
            Set_Var_Design_Coordinates           = apiGetFunctionAddress(FREETYPE, "FT_Set_Var_Design_Coordinates"),
            Get_Var_Design_Coordinates           = apiGetFunctionAddress(FREETYPE, "FT_Get_Var_Design_Coordinates"),
            Set_MM_Blend_Coordinates             = apiGetFunctionAddress(FREETYPE, "FT_Set_MM_Blend_Coordinates"),
            Get_MM_Blend_Coordinates             = apiGetFunctionAddress(FREETYPE, "FT_Get_MM_Blend_Coordinates"),
            Set_Var_Blend_Coordinates            = apiGetFunctionAddress(FREETYPE, "FT_Set_Var_Blend_Coordinates"),
            Get_Var_Blend_Coordinates            = apiGetFunctionAddress(FREETYPE, "FT_Get_Var_Blend_Coordinates"),
            Set_MM_WeightVector                  = apiGetFunctionAddress(FREETYPE, "FT_Set_MM_WeightVector"),
            Get_MM_WeightVector                  = apiGetFunctionAddress(FREETYPE, "FT_Get_MM_WeightVector"),
            Get_Var_Axis_Flags                   = apiGetFunctionAddress(FREETYPE, "FT_Get_Var_Axis_Flags"),
            Set_Named_Instance                   = apiGetFunctionAddress(FREETYPE, "FT_Set_Named_Instance"),
            Get_Default_Named_Instance           = apiGetFunctionAddress(FREETYPE, "FT_Get_Default_Named_Instance"),
            Add_Module                           = apiGetFunctionAddress(FREETYPE, "FT_Add_Module"),
            Get_Module                           = apiGetFunctionAddress(FREETYPE, "FT_Get_Module"),
            Remove_Module                        = apiGetFunctionAddress(FREETYPE, "FT_Remove_Module"),
            Property_Set                         = apiGetFunctionAddress(FREETYPE, "FT_Property_Set"),
            Property_Get                         = apiGetFunctionAddress(FREETYPE, "FT_Property_Get"),
            Set_Default_Properties               = apiGetFunctionAddress(FREETYPE, "FT_Set_Default_Properties"),
            Reference_Library                    = apiGetFunctionAddress(FREETYPE, "FT_Reference_Library"),
            New_Library                          = apiGetFunctionAddress(FREETYPE, "FT_New_Library"),
            Done_Library                         = apiGetFunctionAddress(FREETYPE, "FT_Done_Library"),
            Set_Debug_Hook                       = apiGetFunctionAddress(FREETYPE, "FT_Set_Debug_Hook"),
            Add_Default_Modules                  = apiGetFunctionAddress(FREETYPE, "FT_Add_Default_Modules"),
            Get_TrueType_Engine_Type             = apiGetFunctionAddress(FREETYPE, "FT_Get_TrueType_Engine_Type"),
            OpenType_Validate                    = apiGetFunctionAddress(FREETYPE, "FT_OpenType_Validate"),
            OpenType_Free                        = apiGetFunctionAddress(FREETYPE, "FT_OpenType_Free"),
            Outline_Decompose                    = apiGetFunctionAddress(FREETYPE, "FT_Outline_Decompose"),
            Outline_New                          = apiGetFunctionAddress(FREETYPE, "FT_Outline_New"),
            Outline_Done                         = apiGetFunctionAddress(FREETYPE, "FT_Outline_Done"),
            Outline_Check                        = apiGetFunctionAddress(FREETYPE, "FT_Outline_Check"),
            Outline_Get_CBox                     = apiGetFunctionAddress(FREETYPE, "FT_Outline_Get_CBox"),
            Outline_Translate                    = apiGetFunctionAddress(FREETYPE, "FT_Outline_Translate"),
            Outline_Copy                         = apiGetFunctionAddress(FREETYPE, "FT_Outline_Copy"),
            Outline_Transform                    = apiGetFunctionAddress(FREETYPE, "FT_Outline_Transform"),
            Outline_Embolden                     = apiGetFunctionAddress(FREETYPE, "FT_Outline_Embolden"),
            Outline_EmboldenXY                   = apiGetFunctionAddress(FREETYPE, "FT_Outline_EmboldenXY"),
            Outline_Reverse                      = apiGetFunctionAddress(FREETYPE, "FT_Outline_Reverse"),
            Outline_Get_Bitmap                   = apiGetFunctionAddress(FREETYPE, "FT_Outline_Get_Bitmap"),
            Outline_Render                       = apiGetFunctionAddress(FREETYPE, "FT_Outline_Render"),
            Outline_Get_Orientation              = apiGetFunctionAddress(FREETYPE, "FT_Outline_Get_Orientation"),
            Get_PFR_Metrics                      = apiGetFunctionAddress(FREETYPE, "FT_Get_PFR_Metrics"),
            Get_PFR_Kerning                      = apiGetFunctionAddress(FREETYPE, "FT_Get_PFR_Kerning"),
            Get_PFR_Advance                      = apiGetFunctionAddress(FREETYPE, "FT_Get_PFR_Advance"),
            Get_Renderer                         = apiGetFunctionAddress(FREETYPE, "FT_Get_Renderer"),
            Set_Renderer                         = apiGetFunctionAddress(FREETYPE, "FT_Set_Renderer"),
            New_Size                             = apiGetFunctionAddress(FREETYPE, "FT_New_Size"),
            Done_Size                            = apiGetFunctionAddress(FREETYPE, "FT_Done_Size"),
            Activate_Size                        = apiGetFunctionAddress(FREETYPE, "FT_Activate_Size"),
            Get_Sfnt_Name_Count                  = apiGetFunctionAddress(FREETYPE, "FT_Get_Sfnt_Name_Count"),
            Get_Sfnt_Name                        = apiGetFunctionAddress(FREETYPE, "FT_Get_Sfnt_Name"),
            Get_Sfnt_LangTag                     = apiGetFunctionAddress(FREETYPE, "FT_Get_Sfnt_LangTag"),
            Outline_GetInsideBorder              = apiGetFunctionAddress(FREETYPE, "FT_Outline_GetInsideBorder"),
            Outline_GetOutsideBorder             = apiGetFunctionAddress(FREETYPE, "FT_Outline_GetOutsideBorder"),
            Stroker_New                          = apiGetFunctionAddress(FREETYPE, "FT_Stroker_New"),
            Stroker_Set                          = apiGetFunctionAddress(FREETYPE, "FT_Stroker_Set"),
            Stroker_Rewind                       = apiGetFunctionAddress(FREETYPE, "FT_Stroker_Rewind"),
            Stroker_ParseOutline                 = apiGetFunctionAddress(FREETYPE, "FT_Stroker_ParseOutline"),
            Stroker_BeginSubPath                 = apiGetFunctionAddress(FREETYPE, "FT_Stroker_BeginSubPath"),
            Stroker_EndSubPath                   = apiGetFunctionAddress(FREETYPE, "FT_Stroker_EndSubPath"),
            Stroker_LineTo                       = apiGetFunctionAddress(FREETYPE, "FT_Stroker_LineTo"),
            Stroker_ConicTo                      = apiGetFunctionAddress(FREETYPE, "FT_Stroker_ConicTo"),
            Stroker_CubicTo                      = apiGetFunctionAddress(FREETYPE, "FT_Stroker_CubicTo"),
            Stroker_GetBorderCounts              = apiGetFunctionAddress(FREETYPE, "FT_Stroker_GetBorderCounts"),
            Stroker_ExportBorder                 = apiGetFunctionAddress(FREETYPE, "FT_Stroker_ExportBorder"),
            Stroker_GetCounts                    = apiGetFunctionAddress(FREETYPE, "FT_Stroker_GetCounts"),
            Stroker_Export                       = apiGetFunctionAddress(FREETYPE, "FT_Stroker_Export"),
            Stroker_Done                         = apiGetFunctionAddress(FREETYPE, "FT_Stroker_Done"),
            Glyph_Stroke                         = apiGetFunctionAddress(FREETYPE, "FT_Glyph_Stroke"),
            Glyph_StrokeBorder                   = apiGetFunctionAddress(FREETYPE, "FT_Glyph_StrokeBorder"),
            GlyphSlot_Embolden                   = apiGetFunctionAddress(FREETYPE, "FT_GlyphSlot_Embolden"),
            GlyphSlot_AdjustWeight               = apiGetFunctionAddress(FREETYPE, "FT_GlyphSlot_AdjustWeight"),
            GlyphSlot_Oblique                    = apiGetFunctionAddress(FREETYPE, "FT_GlyphSlot_Oblique"),
            GlyphSlot_Slant                      = apiGetFunctionAddress(FREETYPE, "FT_GlyphSlot_Slant"),
            Sin                                  = apiGetFunctionAddress(FREETYPE, "FT_Sin"),
            Cos                                  = apiGetFunctionAddress(FREETYPE, "FT_Cos"),
            Tan                                  = apiGetFunctionAddress(FREETYPE, "FT_Tan"),
            Atan2                                = apiGetFunctionAddress(FREETYPE, "FT_Atan2"),
            Angle_Diff                           = apiGetFunctionAddress(FREETYPE, "FT_Angle_Diff"),
            Vector_Unit                          = apiGetFunctionAddress(FREETYPE, "FT_Vector_Unit"),
            Vector_Rotate                        = apiGetFunctionAddress(FREETYPE, "FT_Vector_Rotate"),
            Vector_Length                        = apiGetFunctionAddress(FREETYPE, "FT_Vector_Length"),
            Vector_Polarize                      = apiGetFunctionAddress(FREETYPE, "FT_Vector_Polarize"),
            Vector_From_Polar                    = apiGetFunctionAddress(FREETYPE, "FT_Vector_From_Polar"),
            Has_PS_Glyph_Names                   = apiGetFunctionAddress(FREETYPE, "FT_Has_PS_Glyph_Names"),
            Get_PS_Font_Info                     = apiGetFunctionAddress(FREETYPE, "FT_Get_PS_Font_Info"),
            Get_PS_Font_Private                  = apiGetFunctionAddress(FREETYPE, "FT_Get_PS_Font_Private"),
            Get_PS_Font_Value                    = apiGetFunctionAddress(FREETYPE, "FT_Get_PS_Font_Value"),
            Get_Sfnt_Table                       = apiGetFunctionAddress(FREETYPE, "FT_Get_Sfnt_Table"),
            Load_Sfnt_Table                      = apiGetFunctionAddress(FREETYPE, "FT_Load_Sfnt_Table"),
            Sfnt_Table_Info                      = apiGetFunctionAddress(FREETYPE, "FT_Sfnt_Table_Info"),
            Get_CMap_Language_ID                 = apiGetFunctionAddress(FREETYPE, "FT_Get_CMap_Language_ID"),
            Get_CMap_Format                      = apiGetFunctionAddress(FREETYPE, "FT_Get_CMap_Format");

    }

    /** Returns the freetype {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return FREETYPE;
    }

    public static final int
        FT_ENCODING_NONE           = FT_ENC_TAG( 0, 0, 0, 0 ),
        FT_ENCODING_MS_SYMBOL      = FT_ENC_TAG( 's', 'y', 'm', 'b' ),
        FT_ENCODING_UNICODE        = FT_ENC_TAG( 'u', 'n', 'i', 'c' ),
        FT_ENCODING_SJIS           = FT_ENC_TAG( 's', 'j', 'i', 's' ),
        FT_ENCODING_PRC            = FT_ENC_TAG( 'g', 'b', ' ', ' ' ),
        FT_ENCODING_BIG5           = FT_ENC_TAG( 'b', 'i', 'g', '5' ),
        FT_ENCODING_WANSUNG        = FT_ENC_TAG( 'w', 'a', 'n', 's' ),
        FT_ENCODING_JOHAB          = FT_ENC_TAG( 'j', 'o', 'h', 'a' ),
        FT_ENCODING_GB2312         = FT_ENCODING_PRC,
        FT_ENCODING_MS_SJIS        = FT_ENCODING_SJIS,
        FT_ENCODING_MS_GB2312      = FT_ENCODING_PRC,
        FT_ENCODING_MS_BIG5        = FT_ENCODING_BIG5,
        FT_ENCODING_MS_WANSUNG     = FT_ENCODING_WANSUNG,
        FT_ENCODING_MS_JOHAB       = FT_ENCODING_JOHAB,
        FT_ENCODING_ADOBE_STANDARD = FT_ENC_TAG( 'A', 'D', 'O', 'B' ),
        FT_ENCODING_ADOBE_EXPERT   = FT_ENC_TAG( 'A', 'D', 'B', 'E' ),
        FT_ENCODING_ADOBE_CUSTOM   = FT_ENC_TAG( 'A', 'D', 'B', 'C' ),
        FT_ENCODING_ADOBE_LATIN_1  = FT_ENC_TAG( 'l', 'a', 't', '1' ),
        FT_ENCODING_OLD_LATIN_2    = FT_ENC_TAG( 'l', 'a', 't', '2' ),
        FT_ENCODING_APPLE_ROMAN    = FT_ENC_TAG( 'a', 'r', 'm', 'n' );

    public static final int
        FT_FACE_FLAG_SCALABLE         = 1 <<  0,
        FT_FACE_FLAG_FIXED_SIZES      = 1 <<  1,
        FT_FACE_FLAG_FIXED_WIDTH      = 1 <<  2,
        FT_FACE_FLAG_SFNT             = 1 <<  3,
        FT_FACE_FLAG_HORIZONTAL       = 1 <<  4,
        FT_FACE_FLAG_VERTICAL         = 1 <<  5,
        FT_FACE_FLAG_KERNING          = 1 <<  6,
        FT_FACE_FLAG_FAST_GLYPHS      = 1 <<  7,
        FT_FACE_FLAG_MULTIPLE_MASTERS = 1 <<  8,
        FT_FACE_FLAG_GLYPH_NAMES      = 1 <<  9,
        FT_FACE_FLAG_EXTERNAL_STREAM  = 1 << 10,
        FT_FACE_FLAG_HINTER           = 1 << 11,
        FT_FACE_FLAG_CID_KEYED        = 1 << 12,
        FT_FACE_FLAG_TRICKY           = 1 << 13,
        FT_FACE_FLAG_COLOR            = 1 << 14,
        FT_FACE_FLAG_VARIATION        = 1 << 15,
        FT_FACE_FLAG_SVG              = 1 << 16,
        FT_FACE_FLAG_SBIX             = 1 << 17,
        FT_FACE_FLAG_SBIX_OVERLAY     = 1 << 18;

    public static final int
        FT_STYLE_FLAG_ITALIC = 1 <<  0,
        FT_STYLE_FLAG_BOLD   = 1 <<  1;

    public static final int
        FT_OPEN_MEMORY   = 0x1,
        FT_OPEN_STREAM   = 0x2,
        FT_OPEN_PATHNAME = 0x4,
        FT_OPEN_DRIVER   = 0x8,
        FT_OPEN_PARAMS   = 0x10;

    public static final int
        FT_SIZE_REQUEST_TYPE_NOMINAL  = 0,
        FT_SIZE_REQUEST_TYPE_REAL_DIM = 1,
        FT_SIZE_REQUEST_TYPE_BBOX     = 2,
        FT_SIZE_REQUEST_TYPE_CELL     = 3,
        FT_SIZE_REQUEST_TYPE_SCALES   = 4,
        FT_SIZE_REQUEST_TYPE_MAX      = 5;

    public static final int
        FT_LOAD_DEFAULT                     = 0x0,
        FT_LOAD_NO_SCALE                    = 1 << 0,
        FT_LOAD_NO_HINTING                  = 1 << 1,
        FT_LOAD_RENDER                      = 1 << 2,
        FT_LOAD_NO_BITMAP                   = 1 << 3,
        FT_LOAD_VERTICAL_LAYOUT             = 1 << 4,
        FT_LOAD_FORCE_AUTOHINT              = 1 << 5,
        FT_LOAD_CROP_BITMAP                 = 1 << 6,
        FT_LOAD_PEDANTIC                    = 1 << 7,
        FT_LOAD_IGNORE_GLOBAL_ADVANCE_WIDTH = 1 << 9,
        FT_LOAD_NO_RECURSE                  = 1 << 10,
        FT_LOAD_IGNORE_TRANSFORM            = 1 << 11,
        FT_LOAD_MONOCHROME                  = 1 << 12,
        FT_LOAD_LINEAR_DESIGN               = 1 << 13,
        FT_LOAD_SBITS_ONLY                  = 1 << 14,
        FT_LOAD_NO_AUTOHINT                 = 1 << 15,
        FT_LOAD_COLOR                       = 1 << 20,
        FT_LOAD_COMPUTE_METRICS             = 1 << 21,
        FT_LOAD_BITMAP_METRICS_ONLY         = 1 << 22,
        FT_LOAD_NO_SVG                      = 1 << 24,
        FT_LOAD_ADVANCE_ONLY                = 1 << 8,
        FT_LOAD_SVG_ONLY                    = 1 << 23;

    public static final int
        FT_RENDER_MODE_NORMAL = 0,
        FT_RENDER_MODE_LIGHT  = 1,
        FT_RENDER_MODE_MONO   = 2,
        FT_RENDER_MODE_LCD    = 3,
        FT_RENDER_MODE_LCD_V  = 4,
        FT_RENDER_MODE_SDF    = 5,
        FT_RENDER_MODE_MAX    = 6;

    public static final int
        FT_FT_LOAD_TARGET_NORMAL = FT_LOAD_TARGET_( FT_RENDER_MODE_NORMAL ),
        FT_FT_LOAD_TARGET_LIGHT  = FT_LOAD_TARGET_( FT_RENDER_MODE_LIGHT ),
        FT_FT_LOAD_TARGET_MONO   = FT_LOAD_TARGET_( FT_RENDER_MODE_MONO ),
        FT_FT_LOAD_TARGET_LCD    = FT_LOAD_TARGET_( FT_RENDER_MODE_LCD ),
        FT_FT_LOAD_TARGET_LCD_V  = FT_LOAD_TARGET_( FT_RENDER_MODE_LCD_V );

    public static final int
        FT_KERNING_DEFAULT  = 0,
        FT_KERNING_UNFITTED = 1,
        FT_KERNING_UNSCALED = 2;

    public static final int
        FT_SUBGLYPH_FLAG_ARGS_ARE_WORDS     = 1,
        FT_SUBGLYPH_FLAG_ARGS_ARE_XY_VALUES = 2,
        FT_SUBGLYPH_FLAG_ROUND_XY_TO_GRID   = 4,
        FT_SUBGLYPH_FLAG_SCALE              = 8,
        FT_SUBGLYPH_FLAG_XY_SCALE           = 0x40,
        FT_SUBGLYPH_FLAG_2X2                = 0x80,
        FT_SUBGLYPH_FLAG_USE_MY_METRICS     = 0x200;

    public static final int
        FT_FSTYPE_INSTALLABLE_EMBEDDING        = 0x0000,
        FT_FSTYPE_RESTRICTED_LICENSE_EMBEDDING = 0x0002,
        FT_FSTYPE_PREVIEW_AND_PRINT_EMBEDDING  = 0x0004,
        FT_FSTYPE_EDITABLE_EMBEDDING           = 0x0008,
        FT_FSTYPE_NO_SUBSETTING                = 0x0100,
        FT_FSTYPE_BITMAP_EMBEDDING_ONLY        = 0x0200;

    public static final int FREETYPE_MAJOR = 2;

    public static final int FREETYPE_MINOR = 13;

    public static final int FREETYPE_PATCH = 3;

    public static final int FT_ADVANCE_FLAG_FAST_ONLY = 0x20000000;

    public static final int
        BDF_PROPERTY_TYPE_NONE     = 0,
        BDF_PROPERTY_TYPE_ATOM     = 1,
        BDF_PROPERTY_TYPE_INTEGER  = 2,
        BDF_PROPERTY_TYPE_CARDINAL = 3;

    public static final int
        FT_PALETTE_FOR_LIGHT_BACKGROUND = 0x01,
        FT_PALETTE_FOR_DARK_BACKGROUND  = 0x02;

    public static final int
        FT_COLR_PAINTFORMAT_COLR_LAYERS     = 1,
        FT_COLR_PAINTFORMAT_SOLID           = 2,
        FT_COLR_PAINTFORMAT_LINEAR_GRADIENT = 4,
        FT_COLR_PAINTFORMAT_RADIAL_GRADIENT = 6,
        FT_COLR_PAINTFORMAT_SWEEP_GRADIENT  = 8,
        FT_COLR_PAINTFORMAT_GLYPH           = 10,
        FT_COLR_PAINTFORMAT_COLR_GLYPH      = 11,
        FT_COLR_PAINTFORMAT_TRANSFORM       = 12,
        FT_COLR_PAINTFORMAT_TRANSLATE       = 14,
        FT_COLR_PAINTFORMAT_SCALE           = 16,
        FT_COLR_PAINTFORMAT_ROTATE          = 24,
        FT_COLR_PAINTFORMAT_SKEW            = 28,
        FT_COLR_PAINTFORMAT_COMPOSITE       = 32,
        FT_COLR_PAINT_FORMAT_MAX            = 33,
        FT_COLR_PAINTFORMAT_UNSUPPORTED     = 255;

    public static final int
        FT_COLR_PAINT_EXTEND_PAD     = 0,
        FT_COLR_PAINT_EXTEND_REPEAT  = 1,
        FT_COLR_PAINT_EXTEND_REFLECT = 2;

    public static final int
        FT_COLR_COMPOSITE_CLEAR          = 0,
        FT_COLR_COMPOSITE_SRC            = 1,
        FT_COLR_COMPOSITE_DEST           = 2,
        FT_COLR_COMPOSITE_SRC_OVER       = 3,
        FT_COLR_COMPOSITE_DEST_OVER      = 4,
        FT_COLR_COMPOSITE_SRC_IN         = 5,
        FT_COLR_COMPOSITE_DEST_IN        = 6,
        FT_COLR_COMPOSITE_SRC_OUT        = 7,
        FT_COLR_COMPOSITE_DEST_OUT       = 8,
        FT_COLR_COMPOSITE_SRC_ATOP       = 9,
        FT_COLR_COMPOSITE_DEST_ATOP      = 10,
        FT_COLR_COMPOSITE_XOR            = 11,
        FT_COLR_COMPOSITE_PLUS           = 12,
        FT_COLR_COMPOSITE_SCREEN         = 13,
        FT_COLR_COMPOSITE_OVERLAY        = 14,
        FT_COLR_COMPOSITE_DARKEN         = 15,
        FT_COLR_COMPOSITE_LIGHTEN        = 16,
        FT_COLR_COMPOSITE_COLOR_DODGE    = 17,
        FT_COLR_COMPOSITE_COLOR_BURN     = 18,
        FT_COLR_COMPOSITE_HARD_LIGHT     = 19,
        FT_COLR_COMPOSITE_SOFT_LIGHT     = 20,
        FT_COLR_COMPOSITE_DIFFERENCE     = 21,
        FT_COLR_COMPOSITE_EXCLUSION      = 22,
        FT_COLR_COMPOSITE_MULTIPLY       = 23,
        FT_COLR_COMPOSITE_HSL_HUE        = 24,
        FT_COLR_COMPOSITE_HSL_SATURATION = 25,
        FT_COLR_COMPOSITE_HSL_COLOR      = 26,
        FT_COLR_COMPOSITE_HSL_LUMINOSITY = 27,
        FT_COLR_COMPOSITE_MAX            = 28;

    public static final int
        FT_COLOR_INCLUDE_ROOT_TRANSFORM = 0,
        FT_COLOR_NO_ROOT_TRANSFORM      = 1,
        FT_COLOR_ROOT_TRANSFORM_MAX     = 2;

    public static final int
        FT_HINTING_FREETYPE = 0,
        FT_HINTING_ADOBE    = 1;

    public static final int TT_INTERPRETER_VERSION_35 = 35;

    public static final int TT_INTERPRETER_VERSION_38 = 38;

    public static final int TT_INTERPRETER_VERSION_40 = 40;

    public static final int
        FT_AUTOHINTER_SCRIPT_NONE  = 0,
        FT_AUTOHINTER_SCRIPT_LATIN = 1,
        FT_AUTOHINTER_SCRIPT_CJK   = 2,
        FT_AUTOHINTER_SCRIPT_INDIC = 3;

    public static final int
        FT_Err_Ok                            = 0x00,
        FT_Err_Cannot_Open_Resource          = 0x01,
        FT_Err_Unknown_File_Format           = 0x02,
        FT_Err_Invalid_File_Format           = 0x03,
        FT_Err_Invalid_Version               = 0x04,
        FT_Err_Lower_Module_Version          = 0x05,
        FT_Err_Invalid_Argument              = 0x06,
        FT_Err_Unimplemented_Feature         = 0x07,
        FT_Err_Invalid_Table                 = 0x08,
        FT_Err_Invalid_Offset                = 0x09,
        FT_Err_Array_Too_Large               = 0x0A,
        FT_Err_Missing_Module                = 0x0B,
        FT_Err_Missing_Property              = 0x0C,
        FT_Err_Invalid_Glyph_Index           = 0x10,
        FT_Err_Invalid_Character_Code        = 0x11,
        FT_Err_Invalid_Glyph_Format          = 0x12,
        FT_Err_Cannot_Render_Glyph           = 0x13,
        FT_Err_Invalid_Outline               = 0x14,
        FT_Err_Invalid_Composite             = 0x15,
        FT_Err_Too_Many_Hints                = 0x16,
        FT_Err_Invalid_Pixel_Size            = 0x17,
        FT_Err_Invalid_SVG_Document          = 0x18,
        FT_Err_Invalid_Handle                = 0x20,
        FT_Err_Invalid_Library_Handle        = 0x21,
        FT_Err_Invalid_Driver_Handle         = 0x22,
        FT_Err_Invalid_Face_Handle           = 0x23,
        FT_Err_Invalid_Size_Handle           = 0x24,
        FT_Err_Invalid_Slot_Handle           = 0x25,
        FT_Err_Invalid_CharMap_Handle        = 0x26,
        FT_Err_Invalid_Cache_Handle          = 0x27,
        FT_Err_Invalid_Stream_Handle         = 0x28,
        FT_Err_Too_Many_Drivers              = 0x30,
        FT_Err_Too_Many_Extensions           = 0x31,
        FT_Err_Out_Of_Memory                 = 0x40,
        FT_Err_Unlisted_Object               = 0x41,
        FT_Err_Cannot_Open_Stream            = 0x51,
        FT_Err_Invalid_Stream_Seek           = 0x52,
        FT_Err_Invalid_Stream_Skip           = 0x53,
        FT_Err_Invalid_Stream_Read           = 0x54,
        FT_Err_Invalid_Stream_Operation      = 0x55,
        FT_Err_Invalid_Frame_Operation       = 0x56,
        FT_Err_Nested_Frame_Access           = 0x57,
        FT_Err_Invalid_Frame_Read            = 0x58,
        FT_Err_Raster_Uninitialized          = 0x60,
        FT_Err_Raster_Corrupted              = 0x61,
        FT_Err_Raster_Overflow               = 0x62,
        FT_Err_Raster_Negative_Height        = 0x63,
        FT_Err_Too_Many_Caches               = 0x70,
        FT_Err_Invalid_Opcode                = 0x80,
        FT_Err_Too_Few_Arguments             = 0x81,
        FT_Err_Stack_Overflow                = 0x82,
        FT_Err_Code_Overflow                 = 0x83,
        FT_Err_Bad_Argument                  = 0x84,
        FT_Err_Divide_By_Zero                = 0x85,
        FT_Err_Invalid_Reference             = 0x86,
        FT_Err_Debug_OpCode                  = 0x87,
        FT_Err_ENDF_In_Exec_Stream           = 0x88,
        FT_Err_Nested_DEFS                   = 0x89,
        FT_Err_Invalid_CodeRange             = 0x8A,
        FT_Err_Execution_Too_Long            = 0x8B,
        FT_Err_Too_Many_Function_Defs        = 0x8C,
        FT_Err_Too_Many_Instruction_Defs     = 0x8D,
        FT_Err_Table_Missing                 = 0x8E,
        FT_Err_Horiz_Header_Missing          = 0x8F,
        FT_Err_Locations_Missing             = 0x90,
        FT_Err_Name_Table_Missing            = 0x91,
        FT_Err_CMap_Table_Missing            = 0x92,
        FT_Err_Hmtx_Table_Missing            = 0x93,
        FT_Err_Post_Table_Missing            = 0x94,
        FT_Err_Invalid_Horiz_Metrics         = 0x95,
        FT_Err_Invalid_CharMap_Format        = 0x96,
        FT_Err_Invalid_PPem                  = 0x97,
        FT_Err_Invalid_Vert_Metrics          = 0x98,
        FT_Err_Could_Not_Find_Context        = 0x99,
        FT_Err_Invalid_Post_Table_Format     = 0x9A,
        FT_Err_Invalid_Post_Table            = 0x9B,
        FT_Err_DEF_In_Glyf_Bytecode          = 0x9C,
        FT_Err_Missing_Bitmap                = 0x9D,
        FT_Err_Missing_SVG_Hooks             = 0x9E,
        FT_Err_Syntax_Error                  = 0xA0,
        FT_Err_Stack_Underflow               = 0xA1,
        FT_Err_Ignore                        = 0xA2,
        FT_Err_No_Unicode_Glyph_Name         = 0xA3,
        FT_Err_Glyph_Too_Big                 = 0xA4,
        FT_Err_Missing_Startfont_Field       = 0xB0,
        FT_Err_Missing_Font_Field            = 0xB1,
        FT_Err_Missing_Size_Field            = 0xB2,
        FT_Err_Missing_Fontboundingbox_Field = 0xB3,
        FT_Err_Missing_Chars_Field           = 0xB4,
        FT_Err_Missing_Startchar_Field       = 0xB5,
        FT_Err_Missing_Encoding_Field        = 0xB6,
        FT_Err_Missing_Bbx_Field             = 0xB7,
        FT_Err_Bbx_Too_Big                   = 0xB8,
        FT_Err_Corrupted_Font_Header         = 0xB9,
        FT_Err_Corrupted_Font_Glyphs         = 0xBA,
        FT_Err_Max                           = 187;

    public static final int
        FT_GASP_NO_TABLE            = -1,
        FT_GASP_DO_GRIDFIT          = 0x01,
        FT_GASP_DO_GRAY             = 0x02,
        FT_GASP_SYMMETRIC_GRIDFIT   = 0x04,
        FT_GASP_SYMMETRIC_SMOOTHING = 0x08;

    public static final int
        FT_GLYPH_BBOX_UNSCALED  = 0,
        FT_GLYPH_BBOX_SUBPIXELS = 0,
        FT_GLYPH_BBOX_GRIDFIT   = 1,
        FT_GLYPH_BBOX_TRUNCATE  = 2,
        FT_GLYPH_BBOX_PIXELS    = 3;

    public static final int FT_VALIDATE_feat_INDEX = 0;

    public static final int FT_VALIDATE_mort_INDEX = 1;

    public static final int FT_VALIDATE_morx_INDEX = 2;

    public static final int FT_VALIDATE_bsln_INDEX = 3;

    public static final int FT_VALIDATE_just_INDEX = 4;

    public static final int FT_VALIDATE_kern_INDEX = 5;

    public static final int FT_VALIDATE_opbd_INDEX = 6;

    public static final int FT_VALIDATE_trak_INDEX = 7;

    public static final int FT_VALIDATE_prop_INDEX = 8;

    public static final int FT_VALIDATE_lcar_INDEX = 9;

    public static final int FT_VALIDATE_GX_LAST_INDEX = FT_VALIDATE_lcar_INDEX;

    public static final int FT_VALIDATE_GX_LENGTH = FT_VALIDATE_GX_LAST_INDEX + 1;

    public static final int FT_VALIDATE_GX_START = 0x4000;

    public static final int FT_VALIDATE_feat = FT_VALIDATE_GX_START << 0;

    public static final int FT_VALIDATE_mort = FT_VALIDATE_GX_START << 1;

    public static final int FT_VALIDATE_morx = FT_VALIDATE_GX_START << 2;

    public static final int FT_VALIDATE_bsln = FT_VALIDATE_GX_START << 3;

    public static final int FT_VALIDATE_just = FT_VALIDATE_GX_START << 4;

    public static final int FT_VALIDATE_kern = FT_VALIDATE_GX_START << 5;

    public static final int FT_VALIDATE_opbd = FT_VALIDATE_GX_START << 6;

    public static final int FT_VALIDATE_trak = FT_VALIDATE_GX_START << 7;

    public static final int FT_VALIDATE_prop = FT_VALIDATE_GX_START << 8;

    public static final int FT_VALIDATE_lcar = FT_VALIDATE_GX_START << 9;

    public static final int FT_FT_VALIDATE_GX = 
        FT_VALIDATE_feat |
        FT_VALIDATE_mort |
        FT_VALIDATE_morx |
        FT_VALIDATE_bsln |
        FT_VALIDATE_just |
        FT_VALIDATE_kern |
        FT_VALIDATE_opbd |
        FT_VALIDATE_trak |
        FT_VALIDATE_prop |
        FT_VALIDATE_lcar;

    public static final int
        FT_VALIDATE_MS    = FT_VALIDATE_GX_START << 0,
        FT_VALIDATE_APPLE = FT_VALIDATE_GX_START << 1,
        FT_VALIDATE_CKERN = FT_VALIDATE_MS | FT_VALIDATE_APPLE;

    public static final int
        FT_PIXEL_MODE_NONE  = 0,
        FT_PIXEL_MODE_MONO  = 1,
        FT_PIXEL_MODE_GRAY  = 2,
        FT_PIXEL_MODE_GRAY2 = 3,
        FT_PIXEL_MODE_GRAY4 = 4,
        FT_PIXEL_MODE_LCD   = 5,
        FT_PIXEL_MODE_LCD_V = 6,
        FT_PIXEL_MODE_BGRA  = 7,
        FT_PIXEL_MODE_MAX   = 8;

    public static final int
        FT_OUTLINE_CONTOURS_MAX = 0xFFFF,
        FT_OUTLINE_POINTS_MAX   = 0xFFFF;

    public static final int
        FT_OUTLINE_NONE            = 0x0,
        FT_OUTLINE_OWNER           = 0x1,
        FT_OUTLINE_EVEN_ODD_FILL   = 0x2,
        FT_OUTLINE_REVERSE_FILL    = 0x4,
        FT_OUTLINE_IGNORE_DROPOUTS = 0x8,
        FT_OUTLINE_SMART_DROPOUTS  = 0x10,
        FT_OUTLINE_INCLUDE_STUBS   = 0x20,
        FT_OUTLINE_OVERLAP         = 0x40,
        FT_OUTLINE_HIGH_PRECISION  = 0x100,
        FT_OUTLINE_SINGLE_PASS     = 0x200;

    public static final int
        FT_CURVE_TAG_ON           = 0x01,
        FT_CURVE_TAG_CONIC        = 0x00,
        FT_CURVE_TAG_CUBIC        = 0x02,
        FT_CURVE_TAG_HAS_SCANMODE = 0x04,
        FT_CURVE_TAG_TOUCH_X      = 0x08,
        FT_CURVE_TAG_TOUCH_Y      = 0x10,
        FT_CURVE_TAG_TOUCH_BOTH   = FT_CURVE_TAG_TOUCH_X | FT_CURVE_TAG_TOUCH_Y;

    public static final int
        FT_GLYPH_FORMAT_NONE      = FT_IMAGE_TAG( 0, 0, 0, 0 ),
        FT_GLYPH_FORMAT_COMPOSITE = FT_IMAGE_TAG( 'c', 'o', 'm', 'p' ),
        FT_GLYPH_FORMAT_BITMAP    = FT_IMAGE_TAG( 'b', 'i', 't', 's' ),
        FT_GLYPH_FORMAT_OUTLINE   = FT_IMAGE_TAG( 'o', 'u', 't', 'l' ),
        FT_GLYPH_FORMAT_PLOTTER   = FT_IMAGE_TAG( 'p', 'l', 'o', 't' ),
        FT_GLYPH_FORMAT_SVG       = FT_IMAGE_TAG( 'S', 'V', 'G', ' ' );

    public static final int
        FT_RASTER_FLAG_DEFAULT = 0x0,
        FT_RASTER_FLAG_AA      = 0x1,
        FT_RASTER_FLAG_DIRECT  = 0x2,
        FT_RASTER_FLAG_CLIP    = 0x4,
        FT_RASTER_FLAG_SDF     = 0x8;

    public static final int
        FT_LCD_FILTER_NONE    = 0,
        FT_LCD_FILTER_DEFAULT = 1,
        FT_LCD_FILTER_LIGHT   = 2,
        FT_LCD_FILTER_LEGACY1 = 3,
        FT_LCD_FILTER_LEGACY  = 16,
        FT_LCD_FILTER_MAX     = 17;

    public static final int FT_LCD_FILTER_FIVE_TAPS = 5;

    public static final int T1_MAX_MM_AXIS = 4;

    public static final int T1_MAX_MM_DESIGNS = 16;

    public static final int T1_MAX_MM_MAP_POINTS = 20;

    public static final int FT_VAR_AXIS_FLAG_HIDDEN = 1;

    public static final int FT_MODULE_FONT_DRIVER = 1;

    public static final int FT_MODULE_RENDERER = 2;

    public static final int FT_MODULE_HINTER = 4;

    public static final int FT_MODULE_STYLER = 8;

    public static final int FT_MODULE_DRIVER_SCALABLE = 0x100;

    public static final int FT_MODULE_DRIVER_NO_OUTLINES = 0x200;

    public static final int FT_MODULE_DRIVER_HAS_HINTER = 0x400;

    public static final int FT_MODULE_DRIVER_HINTS_LIGHTLY = 0x800;

    public static final int FT_DEBUG_HOOK_TRUETYPE = 0;

    public static final int
        FT_TRUETYPE_ENGINE_TYPE_NONE       = 0,
        FT_TRUETYPE_ENGINE_TYPE_UNPATENTED = 1,
        FT_TRUETYPE_ENGINE_TYPE_PATENTED   = 2;

    public static final int
        FT_Mod_Err_Base     = 0x00,
        FT_Mod_Err_Autofit  = 0x100,
        FT_Mod_Err_BDF      = 0x200,
        FT_Mod_Err_Bzip2    = 0x300,
        FT_Mod_Err_Cache    = 0x400,
        FT_Mod_Err_CFF      = 0x500,
        FT_Mod_Err_CID      = 0x600,
        FT_Mod_Err_Gzip     = 0x700,
        FT_Mod_Err_LZW      = 0x800,
        FT_Mod_Err_OTvalid  = 0x900,
        FT_Mod_Err_PCF      = 0xA00,
        FT_Mod_Err_PFR      = 0xB00,
        FT_Mod_Err_PSaux    = 0xC00,
        FT_Mod_Err_PShinter = 0xD00,
        FT_Mod_Err_PSnames  = 0xE00,
        FT_Mod_Err_Raster   = 0xF00,
        FT_Mod_Err_SFNT     = 0x1000,
        FT_Mod_Err_Smooth   = 0x1100,
        FT_Mod_Err_TrueType = 0x1200,
        FT_Mod_Err_Type1    = 0x1300,
        FT_Mod_Err_Type42   = 0x1400,
        FT_Mod_Err_Winfonts = 0x1500,
        FT_Mod_Err_GXvalid  = 0x1600,
        FT_Mod_Err_Sdf      = 0x1700,
        FT_Mod_Err_Max      = FT_Mod_Err_Sdf + 1;

    public static final int
        FT_VALIDATE_BASE = 0x0100,
        FT_VALIDATE_GDEF = 0x0200,
        FT_VALIDATE_GPOS = 0x0400,
        FT_VALIDATE_GSUB = 0x0800,
        FT_VALIDATE_JSTF = 0x1000,
        FT_VALIDATE_MATH = 0x2000,
        FT_VALIDATE_OT   = 
        FT_VALIDATE_BASE |
        FT_VALIDATE_GDEF |
        FT_VALIDATE_GPOS |
        FT_VALIDATE_GSUB |
        FT_VALIDATE_JSTF |
        FT_VALIDATE_MATH;

    public static final int
        FT_ORIENTATION_TRUETYPE   = 0,
        FT_ORIENTATION_POSTSCRIPT = 1,
        FT_ORIENTATION_FILL_RIGHT = FT_ORIENTATION_TRUETYPE,
        FT_ORIENTATION_FILL_LEFT  = FT_ORIENTATION_POSTSCRIPT,
        FT_ORIENTATION_NONE       = 2;

    public static final int
        FT_PARAM_TAG_IGNORE_TYPOGRAPHIC_FAMILY    = FT_MAKE_TAG( 'i', 'g', 'p', 'f' ),
        FT_PARAM_TAG_IGNORE_TYPOGRAPHIC_SUBFAMILY = FT_MAKE_TAG( 'i', 'g', 'p', 's' ),
        FT_PARAM_TAG_INCREMENTAL                  = FT_MAKE_TAG( 'i', 'n', 'c', 'r' ),
        FT_PARAM_TAG_IGNORE_SBIX                  = FT_MAKE_TAG( 'i', 's', 'b', 'x' ),
        FT_PARAM_TAG_LCD_FILTER_WEIGHTS           = FT_MAKE_TAG( 'l', 'c', 'd', 'f' ),
        FT_PARAM_TAG_RANDOM_SEED                  = FT_MAKE_TAG( 's', 'e', 'e', 'd' ),
        FT_PARAM_TAG_STEM_DARKENING               = FT_MAKE_TAG( 'd', 'a', 'r', 'k' ),
        FT_PARAM_TAG_UNPATENTED_HINTING           = FT_MAKE_TAG( 'u', 'n', 'p', 'a' );

    public static final int
        FT_STROKER_LINEJOIN_ROUND          = 0,
        FT_STROKER_LINEJOIN_BEVEL          = 1,
        FT_STROKER_LINEJOIN_MITER_VARIABLE = 2,
        FT_STROKER_LINEJOIN_MITER          = FT_STROKER_LINEJOIN_MITER_VARIABLE,
        FT_STROKER_LINEJOIN_MITER_FIXED    = 3;

    public static final int
        FT_STROKER_LINECAP_BUTT   = 0,
        FT_STROKER_LINECAP_ROUND  = 1,
        FT_STROKER_LINECAP_SQUARE = 2;

    public static final int
        FT_STROKER_BORDER_LEFT  = 0,
        FT_STROKER_BORDER_RIGHT = 1;

    public static final int
        FT_ANGLE_PI  = 180 << 16,
        FT_ANGLE_2PI = FT_ANGLE_PI * 2,
        FT_ANGLE_PI2 = FT_ANGLE_PI / 2,
        FT_ANGLE_PI4 = FT_ANGLE_PI / 4;

    public static final int
        T1_BLEND_UNDERLINE_POSITION  = 0,
        T1_BLEND_UNDERLINE_THICKNESS = 1,
        T1_BLEND_ITALIC_ANGLE        = 2,
        T1_BLEND_BLUE_VALUES         = 3,
        T1_BLEND_OTHER_BLUES         = 4,
        T1_BLEND_STANDARD_WIDTH      = 5,
        T1_BLEND_STANDARD_HEIGHT     = 6,
        T1_BLEND_STEM_SNAP_WIDTHS    = 7,
        T1_BLEND_STEM_SNAP_HEIGHTS   = 8,
        T1_BLEND_BLUE_SCALE          = 9,
        T1_BLEND_BLUE_SHIFT          = 10,
        T1_BLEND_FAMILY_BLUES        = 11,
        T1_BLEND_FAMILY_OTHER_BLUES  = 12,
        T1_BLEND_FORCE_BOLD          = 13,
        T1_BLEND_MAX                 = 14;

    public static final int
        T1_ENCODING_TYPE_NONE      = 0,
        T1_ENCODING_TYPE_ARRAY     = 1,
        T1_ENCODING_TYPE_STANDARD  = 2,
        T1_ENCODING_TYPE_ISOLATIN1 = 3,
        T1_ENCODING_TYPE_EXPERT    = 4;

    public static final int
        PS_DICT_FONT_TYPE              = 0,
        PS_DICT_FONT_MATRIX            = 1,
        PS_DICT_FONT_BBOX              = 2,
        PS_DICT_PAINT_TYPE             = 3,
        PS_DICT_FONT_NAME              = 4,
        PS_DICT_UNIQUE_ID              = 5,
        PS_DICT_NUM_CHAR_STRINGS       = 6,
        PS_DICT_CHAR_STRING_KEY        = 7,
        PS_DICT_CHAR_STRING            = 8,
        PS_DICT_ENCODING_TYPE          = 9,
        PS_DICT_ENCODING_ENTRY         = 10,
        PS_DICT_NUM_SUBRS              = 11,
        PS_DICT_SUBR                   = 12,
        PS_DICT_STD_HW                 = 13,
        PS_DICT_STD_VW                 = 14,
        PS_DICT_NUM_BLUE_VALUES        = 15,
        PS_DICT_BLUE_VALUE             = 16,
        PS_DICT_BLUE_FUZZ              = 17,
        PS_DICT_NUM_OTHER_BLUES        = 18,
        PS_DICT_OTHER_BLUE             = 19,
        PS_DICT_NUM_FAMILY_BLUES       = 20,
        PS_DICT_FAMILY_BLUE            = 21,
        PS_DICT_NUM_FAMILY_OTHER_BLUES = 22,
        PS_DICT_FAMILY_OTHER_BLUE      = 23,
        PS_DICT_BLUE_SCALE             = 24,
        PS_DICT_BLUE_SHIFT             = 25,
        PS_DICT_NUM_STEM_SNAP_H        = 26,
        PS_DICT_STEM_SNAP_H            = 27,
        PS_DICT_NUM_STEM_SNAP_V        = 28,
        PS_DICT_STEM_SNAP_V            = 29,
        PS_DICT_FORCE_BOLD             = 30,
        PS_DICT_RND_STEM_UP            = 31,
        PS_DICT_MIN_FEATURE            = 32,
        PS_DICT_LEN_IV                 = 33,
        PS_DICT_PASSWORD               = 34,
        PS_DICT_LANGUAGE_GROUP         = 35,
        PS_DICT_VERSION                = 36,
        PS_DICT_NOTICE                 = 37,
        PS_DICT_FULL_NAME              = 38,
        PS_DICT_FAMILY_NAME            = 39,
        PS_DICT_WEIGHT                 = 40,
        PS_DICT_IS_FIXED_PITCH         = 41,
        PS_DICT_UNDERLINE_POSITION     = 42,
        PS_DICT_UNDERLINE_THICKNESS    = 43,
        PS_DICT_FS_TYPE                = 44,
        PS_DICT_ITALIC_ANGLE           = 45,
        PS_DICT_MAX                    = PS_DICT_ITALIC_ANGLE;

    public static final int
        TT_PLATFORM_APPLE_UNICODE = 0,
        TT_PLATFORM_MACINTOSH     = 1,
        TT_PLATFORM_ISO           = 2,
        TT_PLATFORM_MICROSOFT     = 3,
        TT_PLATFORM_CUSTOM        = 4,
        TT_PLATFORM_ADOBE         = 7;

    public static final int
        TT_APPLE_ID_DEFAULT          = 0,
        TT_APPLE_ID_UNICODE_1_1      = 1,
        TT_APPLE_ID_ISO_10646        = 2,
        TT_APPLE_ID_UNICODE_2_0      = 3,
        TT_APPLE_ID_UNICODE_32       = 4,
        TT_APPLE_ID_VARIANT_SELECTOR = 5,
        TT_APPLE_ID_FULL_UNICODE     = 6;

    public static final int
        TT_MAC_ID_ROMAN               = 0,
        TT_MAC_ID_JAPANESE            = 1,
        TT_MAC_ID_TRADITIONAL_CHINESE = 2,
        TT_MAC_ID_KOREAN              = 3,
        TT_MAC_ID_ARABIC              = 4,
        TT_MAC_ID_HEBREW              = 5,
        TT_MAC_ID_GREEK               = 6,
        TT_MAC_ID_RUSSIAN             = 7,
        TT_MAC_ID_RSYMBOL             = 8,
        TT_MAC_ID_DEVANAGARI          = 9,
        TT_MAC_ID_GURMUKHI            = 10,
        TT_MAC_ID_GUJARATI            = 11,
        TT_MAC_ID_ORIYA               = 12,
        TT_MAC_ID_BENGALI             = 13,
        TT_MAC_ID_TAMIL               = 14,
        TT_MAC_ID_TELUGU              = 15,
        TT_MAC_ID_KANNADA             = 16,
        TT_MAC_ID_MALAYALAM           = 17,
        TT_MAC_ID_SINHALESE           = 18,
        TT_MAC_ID_BURMESE             = 19,
        TT_MAC_ID_KHMER               = 20,
        TT_MAC_ID_THAI                = 21,
        TT_MAC_ID_LAOTIAN             = 22,
        TT_MAC_ID_GEORGIAN            = 23,
        TT_MAC_ID_ARMENIAN            = 24,
        TT_MAC_ID_MALDIVIAN           = 25,
        TT_MAC_ID_SIMPLIFIED_CHINESE  = 26,
        TT_MAC_ID_TIBETAN             = 27,
        TT_MAC_ID_MONGOLIAN           = 28,
        TT_MAC_ID_GEEZ                = 29,
        TT_MAC_ID_SLAVIC              = 30,
        TT_MAC_ID_VIETNAMESE          = 31,
        TT_MAC_ID_SINDHI              = 32,
        TT_MAC_ID_UNINTERP            = 33;

    public static final int
        TT_ISO_ID_7BIT_ASCII = 0,
        TT_ISO_ID_10646      = 1,
        TT_ISO_ID_8859_1     = 2;

    public static final int
        TT_MS_ID_SYMBOL_CS  = 0,
        TT_MS_ID_UNICODE_CS = 1,
        TT_MS_ID_SJIS       = 2,
        TT_MS_ID_PRC        = 3,
        TT_MS_ID_BIG_5      = 4,
        TT_MS_ID_WANSUNG    = 5,
        TT_MS_ID_JOHAB      = 6,
        TT_MS_ID_UCS_4      = 10;

    public static final int
        TT_ADOBE_ID_STANDARD = 0,
        TT_ADOBE_ID_EXPERT   = 1,
        TT_ADOBE_ID_CUSTOM   = 2,
        TT_ADOBE_ID_LATIN_1  = 3;

    public static final int
        TT_MAC_LANGID_ENGLISH                     = 0,
        TT_MAC_LANGID_FRENCH                      = 1,
        TT_MAC_LANGID_GERMAN                      = 2,
        TT_MAC_LANGID_ITALIAN                     = 3,
        TT_MAC_LANGID_DUTCH                       = 4,
        TT_MAC_LANGID_SWEDISH                     = 5,
        TT_MAC_LANGID_SPANISH                     = 6,
        TT_MAC_LANGID_DANISH                      = 7,
        TT_MAC_LANGID_PORTUGUESE                  = 8,
        TT_MAC_LANGID_NORWEGIAN                   = 9,
        TT_MAC_LANGID_HEBREW                      = 10,
        TT_MAC_LANGID_JAPANESE                    = 11,
        TT_MAC_LANGID_ARABIC                      = 12,
        TT_MAC_LANGID_FINNISH                     = 13,
        TT_MAC_LANGID_GREEK                       = 14,
        TT_MAC_LANGID_ICELANDIC                   = 15,
        TT_MAC_LANGID_MALTESE                     = 16,
        TT_MAC_LANGID_TURKISH                     = 17,
        TT_MAC_LANGID_CROATIAN                    = 18,
        TT_MAC_LANGID_CHINESE_TRADITIONAL         = 19,
        TT_MAC_LANGID_URDU                        = 20,
        TT_MAC_LANGID_HINDI                       = 21,
        TT_MAC_LANGID_THAI                        = 22,
        TT_MAC_LANGID_KOREAN                      = 23,
        TT_MAC_LANGID_LITHUANIAN                  = 24,
        TT_MAC_LANGID_POLISH                      = 25,
        TT_MAC_LANGID_HUNGARIAN                   = 26,
        TT_MAC_LANGID_ESTONIAN                    = 27,
        TT_MAC_LANGID_LETTISH                     = 28,
        TT_MAC_LANGID_SAAMISK                     = 29,
        TT_MAC_LANGID_FAEROESE                    = 30,
        TT_MAC_LANGID_FARSI                       = 31,
        TT_MAC_LANGID_RUSSIAN                     = 32,
        TT_MAC_LANGID_CHINESE_SIMPLIFIED          = 33,
        TT_MAC_LANGID_FLEMISH                     = 34,
        TT_MAC_LANGID_IRISH                       = 35,
        TT_MAC_LANGID_ALBANIAN                    = 36,
        TT_MAC_LANGID_ROMANIAN                    = 37,
        TT_MAC_LANGID_CZECH                       = 38,
        TT_MAC_LANGID_SLOVAK                      = 39,
        TT_MAC_LANGID_SLOVENIAN                   = 40,
        TT_MAC_LANGID_YIDDISH                     = 41,
        TT_MAC_LANGID_SERBIAN                     = 42,
        TT_MAC_LANGID_MACEDONIAN                  = 43,
        TT_MAC_LANGID_BULGARIAN                   = 44,
        TT_MAC_LANGID_UKRAINIAN                   = 45,
        TT_MAC_LANGID_BYELORUSSIAN                = 46,
        TT_MAC_LANGID_UZBEK                       = 47,
        TT_MAC_LANGID_KAZAKH                      = 48,
        TT_MAC_LANGID_AZERBAIJANI                 = 49,
        TT_MAC_LANGID_AZERBAIJANI_CYRILLIC_SCRIPT = 50,
        TT_MAC_LANGID_AZERBAIJANI_ARABIC_SCRIPT   = 51,
        TT_MAC_LANGID_ARMENIAN                    = 52,
        TT_MAC_LANGID_GEORGIAN                    = 53,
        TT_MAC_LANGID_MOLDAVIAN                   = 54,
        TT_MAC_LANGID_KIRGHIZ                     = 55,
        TT_MAC_LANGID_TAJIKI                      = 56,
        TT_MAC_LANGID_TURKMEN                     = 57,
        TT_MAC_LANGID_MONGOLIAN                   = 58,
        TT_MAC_LANGID_MONGOLIAN_MONGOLIAN_SCRIPT  = 59,
        TT_MAC_LANGID_MONGOLIAN_CYRILLIC_SCRIPT   = 60,
        TT_MAC_LANGID_PASHTO                      = 61,
        TT_MAC_LANGID_KURDISH                     = 62,
        TT_MAC_LANGID_KASHMIRI                    = 63,
        TT_MAC_LANGID_SINDHI                      = 64,
        TT_MAC_LANGID_TIBETAN                     = 65,
        TT_MAC_LANGID_NEPALI                      = 66,
        TT_MAC_LANGID_SANSKRIT                    = 67,
        TT_MAC_LANGID_MARATHI                     = 68,
        TT_MAC_LANGID_BENGALI                     = 69,
        TT_MAC_LANGID_ASSAMESE                    = 70,
        TT_MAC_LANGID_GUJARATI                    = 71,
        TT_MAC_LANGID_PUNJABI                     = 72,
        TT_MAC_LANGID_ORIYA                       = 73,
        TT_MAC_LANGID_MALAYALAM                   = 74,
        TT_MAC_LANGID_KANNADA                     = 75,
        TT_MAC_LANGID_TAMIL                       = 76,
        TT_MAC_LANGID_TELUGU                      = 77,
        TT_MAC_LANGID_SINHALESE                   = 78,
        TT_MAC_LANGID_BURMESE                     = 79,
        TT_MAC_LANGID_KHMER                       = 80,
        TT_MAC_LANGID_LAO                         = 81,
        TT_MAC_LANGID_VIETNAMESE                  = 82,
        TT_MAC_LANGID_INDONESIAN                  = 83,
        TT_MAC_LANGID_TAGALOG                     = 84,
        TT_MAC_LANGID_MALAY_ROMAN_SCRIPT          = 85,
        TT_MAC_LANGID_MALAY_ARABIC_SCRIPT         = 86,
        TT_MAC_LANGID_AMHARIC                     = 87,
        TT_MAC_LANGID_TIGRINYA                    = 88,
        TT_MAC_LANGID_GALLA                       = 89,
        TT_MAC_LANGID_SOMALI                      = 90,
        TT_MAC_LANGID_SWAHILI                     = 91,
        TT_MAC_LANGID_RUANDA                      = 92,
        TT_MAC_LANGID_RUNDI                       = 93,
        TT_MAC_LANGID_CHEWA                       = 94,
        TT_MAC_LANGID_MALAGASY                    = 95,
        TT_MAC_LANGID_ESPERANTO                   = 96,
        TT_MAC_LANGID_WELSH                       = 128,
        TT_MAC_LANGID_BASQUE                      = 129,
        TT_MAC_LANGID_CATALAN                     = 130,
        TT_MAC_LANGID_LATIN                       = 131,
        TT_MAC_LANGID_QUECHUA                     = 132,
        TT_MAC_LANGID_GUARANI                     = 133,
        TT_MAC_LANGID_AYMARA                      = 134,
        TT_MAC_LANGID_TATAR                       = 135,
        TT_MAC_LANGID_UIGHUR                      = 136,
        TT_MAC_LANGID_DZONGKHA                    = 137,
        TT_MAC_LANGID_JAVANESE                    = 138,
        TT_MAC_LANGID_SUNDANESE                   = 139,
        TT_MAC_LANGID_GALICIAN                    = 140,
        TT_MAC_LANGID_AFRIKAANS                   = 141,
        TT_MAC_LANGID_BRETON                      = 142,
        TT_MAC_LANGID_INUKTITUT                   = 143,
        TT_MAC_LANGID_SCOTTISH_GAELIC             = 144,
        TT_MAC_LANGID_MANX_GAELIC                 = 145,
        TT_MAC_LANGID_IRISH_GAELIC                = 146,
        TT_MAC_LANGID_TONGAN                      = 147,
        TT_MAC_LANGID_GREEK_POLYTONIC             = 148,
        TT_MAC_LANGID_GREELANDIC                  = 149,
        TT_MAC_LANGID_AZERBAIJANI_ROMAN_SCRIPT    = 150;

    public static final int
        TT_MS_LANGID_ARABIC_SAUDI_ARABIA            = 0x0401,
        TT_MS_LANGID_ARABIC_IRAQ                    = 0x0801,
        TT_MS_LANGID_ARABIC_EGYPT                   = 0x0C01,
        TT_MS_LANGID_ARABIC_LIBYA                   = 0x1001,
        TT_MS_LANGID_ARABIC_ALGERIA                 = 0x1401,
        TT_MS_LANGID_ARABIC_MOROCCO                 = 0x1801,
        TT_MS_LANGID_ARABIC_TUNISIA                 = 0x1C01,
        TT_MS_LANGID_ARABIC_OMAN                    = 0x2001,
        TT_MS_LANGID_ARABIC_YEMEN                   = 0x2401,
        TT_MS_LANGID_ARABIC_SYRIA                   = 0x2801,
        TT_MS_LANGID_ARABIC_JORDAN                  = 0x2C01,
        TT_MS_LANGID_ARABIC_LEBANON                 = 0x3001,
        TT_MS_LANGID_ARABIC_KUWAIT                  = 0x3401,
        TT_MS_LANGID_ARABIC_UAE                     = 0x3801,
        TT_MS_LANGID_ARABIC_BAHRAIN                 = 0x3C01,
        TT_MS_LANGID_ARABIC_QATAR                   = 0x4001,
        TT_MS_LANGID_BULGARIAN_BULGARIA             = 0x0402,
        TT_MS_LANGID_CATALAN_CATALAN                = 0x0403,
        TT_MS_LANGID_CHINESE_TAIWAN                 = 0x0404,
        TT_MS_LANGID_CHINESE_PRC                    = 0x0804,
        TT_MS_LANGID_CHINESE_HONG_KONG              = 0x0C04,
        TT_MS_LANGID_CHINESE_SINGAPORE              = 0x1004,
        TT_MS_LANGID_CHINESE_MACAO                  = 0x1404,
        TT_MS_LANGID_CZECH_CZECH_REPUBLIC           = 0x0405,
        TT_MS_LANGID_DANISH_DENMARK                 = 0x0406,
        TT_MS_LANGID_GERMAN_GERMANY                 = 0x0407,
        TT_MS_LANGID_GERMAN_SWITZERLAND             = 0x0807,
        TT_MS_LANGID_GERMAN_AUSTRIA                 = 0x0C07,
        TT_MS_LANGID_GERMAN_LUXEMBOURG              = 0x1007,
        TT_MS_LANGID_GERMAN_LIECHTENSTEIN           = 0x1407,
        TT_MS_LANGID_GREEK_GREECE                   = 0x0408,
        TT_MS_LANGID_ENGLISH_UNITED_STATES          = 0x0409,
        TT_MS_LANGID_ENGLISH_UNITED_KINGDOM         = 0x0809,
        TT_MS_LANGID_ENGLISH_AUSTRALIA              = 0x0C09,
        TT_MS_LANGID_ENGLISH_CANADA                 = 0x1009,
        TT_MS_LANGID_ENGLISH_NEW_ZEALAND            = 0x1409,
        TT_MS_LANGID_ENGLISH_IRELAND                = 0x1809,
        TT_MS_LANGID_ENGLISH_SOUTH_AFRICA           = 0x1C09,
        TT_MS_LANGID_ENGLISH_JAMAICA                = 0x2009,
        TT_MS_LANGID_ENGLISH_CARIBBEAN              = 0x2409,
        TT_MS_LANGID_ENGLISH_BELIZE                 = 0x2809,
        TT_MS_LANGID_ENGLISH_TRINIDAD               = 0x2C09,
        TT_MS_LANGID_ENGLISH_ZIMBABWE               = 0x3009,
        TT_MS_LANGID_ENGLISH_PHILIPPINES            = 0x3409,
        TT_MS_LANGID_ENGLISH_INDIA                  = 0x4009,
        TT_MS_LANGID_ENGLISH_MALAYSIA               = 0x4409,
        TT_MS_LANGID_ENGLISH_SINGAPORE              = 0x4809,
        TT_MS_LANGID_SPANISH_SPAIN_TRADITIONAL_SORT = 0x040A,
        TT_MS_LANGID_SPANISH_MEXICO                 = 0x080A,
        TT_MS_LANGID_SPANISH_SPAIN_MODERN_SORT      = 0x0C0A,
        TT_MS_LANGID_SPANISH_GUATEMALA              = 0x100A,
        TT_MS_LANGID_SPANISH_COSTA_RICA             = 0x140A,
        TT_MS_LANGID_SPANISH_PANAMA                 = 0x180A,
        TT_MS_LANGID_SPANISH_DOMINICAN_REPUBLIC     = 0x1C0A,
        TT_MS_LANGID_SPANISH_VENEZUELA              = 0x200A,
        TT_MS_LANGID_SPANISH_COLOMBIA               = 0x240A,
        TT_MS_LANGID_SPANISH_PERU                   = 0x280A,
        TT_MS_LANGID_SPANISH_ARGENTINA              = 0x2C0A,
        TT_MS_LANGID_SPANISH_ECUADOR                = 0x300A,
        TT_MS_LANGID_SPANISH_CHILE                  = 0x340A,
        TT_MS_LANGID_SPANISH_URUGUAY                = 0x380A,
        TT_MS_LANGID_SPANISH_PARAGUAY               = 0x3C0A,
        TT_MS_LANGID_SPANISH_BOLIVIA                = 0x400A,
        TT_MS_LANGID_SPANISH_EL_SALVADOR            = 0x440A,
        TT_MS_LANGID_SPANISH_HONDURAS               = 0x480A,
        TT_MS_LANGID_SPANISH_NICARAGUA              = 0x4C0A,
        TT_MS_LANGID_SPANISH_PUERTO_RICO            = 0x500A,
        TT_MS_LANGID_SPANISH_UNITED_STATES          = 0x540A,
        TT_MS_LANGID_FINNISH_FINLAND                = 0x040B,
        TT_MS_LANGID_FRENCH_FRANCE                  = 0x040C,
        TT_MS_LANGID_FRENCH_BELGIUM                 = 0x080C,
        TT_MS_LANGID_FRENCH_CANADA                  = 0x0C0C,
        TT_MS_LANGID_FRENCH_SWITZERLAND             = 0x100C,
        TT_MS_LANGID_FRENCH_LUXEMBOURG              = 0x140C,
        TT_MS_LANGID_FRENCH_MONACO                  = 0x180C,
        TT_MS_LANGID_HEBREW_ISRAEL                  = 0x040D,
        TT_MS_LANGID_HUNGARIAN_HUNGARY              = 0x040E,
        TT_MS_LANGID_ICELANDIC_ICELAND              = 0x040F,
        TT_MS_LANGID_ITALIAN_ITALY                  = 0x0410,
        TT_MS_LANGID_ITALIAN_SWITZERLAND            = 0x0810,
        TT_MS_LANGID_JAPANESE_JAPAN                 = 0x0411,
        TT_MS_LANGID_KOREAN_KOREA                   = 0x0412,
        TT_MS_LANGID_DUTCH_NETHERLANDS              = 0x0413,
        TT_MS_LANGID_DUTCH_BELGIUM                  = 0x0813,
        TT_MS_LANGID_NORWEGIAN_NORWAY_BOKMAL        = 0x0414,
        TT_MS_LANGID_NORWEGIAN_NORWAY_NYNORSK       = 0x0814,
        TT_MS_LANGID_POLISH_POLAND                  = 0x0415,
        TT_MS_LANGID_PORTUGUESE_BRAZIL              = 0x0416,
        TT_MS_LANGID_PORTUGUESE_PORTUGAL            = 0x0816,
        TT_MS_LANGID_ROMANSH_SWITZERLAND            = 0x0417,
        TT_MS_LANGID_ROMANIAN_ROMANIA               = 0x0418,
        TT_MS_LANGID_RUSSIAN_RUSSIA                 = 0x0419,
        TT_MS_LANGID_CROATIAN_CROATIA               = 0x041A,
        TT_MS_LANGID_SERBIAN_SERBIA_LATIN           = 0x081A,
        TT_MS_LANGID_SERBIAN_SERBIA_CYRILLIC        = 0x0C1A,
        TT_MS_LANGID_CROATIAN_BOSNIA_HERZEGOVINA    = 0x101A,
        TT_MS_LANGID_BOSNIAN_BOSNIA_HERZEGOVINA     = 0x141A,
        TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_LATIN      = 0x181A,
        TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_CYRILLIC   = 0x1C1A,
        TT_MS_LANGID_BOSNIAN_BOSNIA_HERZ_CYRILLIC   = 0x201A,
        TT_MS_LANGID_SLOVAK_SLOVAKIA                = 0x041B,
        TT_MS_LANGID_ALBANIAN_ALBANIA               = 0x041C,
        TT_MS_LANGID_SWEDISH_SWEDEN                 = 0x041D,
        TT_MS_LANGID_SWEDISH_FINLAND                = 0x081D,
        TT_MS_LANGID_THAI_THAILAND                  = 0x041E,
        TT_MS_LANGID_TURKISH_TURKEY                 = 0x041F,
        TT_MS_LANGID_URDU_PAKISTAN                  = 0x0420,
        TT_MS_LANGID_INDONESIAN_INDONESIA           = 0x0421,
        TT_MS_LANGID_UKRAINIAN_UKRAINE              = 0x0422,
        TT_MS_LANGID_BELARUSIAN_BELARUS             = 0x0423,
        TT_MS_LANGID_SLOVENIAN_SLOVENIA             = 0x0424,
        TT_MS_LANGID_ESTONIAN_ESTONIA               = 0x0425,
        TT_MS_LANGID_LATVIAN_LATVIA                 = 0x0426,
        TT_MS_LANGID_LITHUANIAN_LITHUANIA           = 0x0427,
        TT_MS_LANGID_TAJIK_TAJIKISTAN               = 0x0428,
        TT_MS_LANGID_VIETNAMESE_VIET_NAM            = 0x042A,
        TT_MS_LANGID_ARMENIAN_ARMENIA               = 0x042B,
        TT_MS_LANGID_AZERI_AZERBAIJAN_LATIN         = 0x042C,
        TT_MS_LANGID_AZERI_AZERBAIJAN_CYRILLIC      = 0x082C,
        TT_MS_LANGID_BASQUE_BASQUE                  = 0x042D,
        TT_MS_LANGID_UPPER_SORBIAN_GERMANY          = 0x042E,
        TT_MS_LANGID_LOWER_SORBIAN_GERMANY          = 0x082E,
        TT_MS_LANGID_MACEDONIAN_MACEDONIA           = 0x042F,
        TT_MS_LANGID_SETSWANA_SOUTH_AFRICA          = 0x0432,
        TT_MS_LANGID_ISIXHOSA_SOUTH_AFRICA          = 0x0434,
        TT_MS_LANGID_ISIZULU_SOUTH_AFRICA           = 0x0435,
        TT_MS_LANGID_AFRIKAANS_SOUTH_AFRICA         = 0x0436,
        TT_MS_LANGID_GEORGIAN_GEORGIA               = 0x0437,
        TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS        = 0x0438,
        TT_MS_LANGID_HINDI_INDIA                    = 0x0439,
        TT_MS_LANGID_MALTESE_MALTA                  = 0x043A,
        TT_MS_LANGID_SAMI_NORTHERN_NORWAY           = 0x043B,
        TT_MS_LANGID_SAMI_NORTHERN_SWEDEN           = 0x083B,
        TT_MS_LANGID_SAMI_NORTHERN_FINLAND          = 0x0C3B,
        TT_MS_LANGID_SAMI_LULE_NORWAY               = 0x103B,
        TT_MS_LANGID_SAMI_LULE_SWEDEN               = 0x143B,
        TT_MS_LANGID_SAMI_SOUTHERN_NORWAY           = 0x183B,
        TT_MS_LANGID_SAMI_SOUTHERN_SWEDEN           = 0x1C3B,
        TT_MS_LANGID_SAMI_SKOLT_FINLAND             = 0x203B,
        TT_MS_LANGID_SAMI_INARI_FINLAND             = 0x243B,
        TT_MS_LANGID_IRISH_IRELAND                  = 0x083C,
        TT_MS_LANGID_MALAY_MALAYSIA                 = 0x043E,
        TT_MS_LANGID_MALAY_BRUNEI_DARUSSALAM        = 0x083E,
        TT_MS_LANGID_KAZAKH_KAZAKHSTAN              = 0x043F,
        TT_MS_LANGID_KYRGYZ_KYRGYZSTAN              = 0x0440,
        TT_MS_LANGID_KISWAHILI_KENYA                = 0x0441,
        TT_MS_LANGID_TURKMEN_TURKMENISTAN           = 0x0442,
        TT_MS_LANGID_UZBEK_UZBEKISTAN_LATIN         = 0x0443,
        TT_MS_LANGID_UZBEK_UZBEKISTAN_CYRILLIC      = 0x0843,
        TT_MS_LANGID_TATAR_RUSSIA                   = 0x0444,
        TT_MS_LANGID_BENGALI_INDIA                  = 0x0445,
        TT_MS_LANGID_BENGALI_BANGLADESH             = 0x0845,
        TT_MS_LANGID_PUNJABI_INDIA                  = 0x0446,
        TT_MS_LANGID_GUJARATI_INDIA                 = 0x0447,
        TT_MS_LANGID_ODIA_INDIA                     = 0x0448,
        TT_MS_LANGID_TAMIL_INDIA                    = 0x0449,
        TT_MS_LANGID_TELUGU_INDIA                   = 0x044A,
        TT_MS_LANGID_KANNADA_INDIA                  = 0x044B,
        TT_MS_LANGID_MALAYALAM_INDIA                = 0x044C,
        TT_MS_LANGID_ASSAMESE_INDIA                 = 0x044D,
        TT_MS_LANGID_MARATHI_INDIA                  = 0x044E,
        TT_MS_LANGID_SANSKRIT_INDIA                 = 0x044F,
        TT_MS_LANGID_MONGOLIAN_MONGOLIA             = 0x0450,
        TT_MS_LANGID_MONGOLIAN_PRC                  = 0x0850,
        TT_MS_LANGID_TIBETAN_PRC                    = 0x0451,
        TT_MS_LANGID_WELSH_UNITED_KINGDOM           = 0x0452,
        TT_MS_LANGID_KHMER_CAMBODIA                 = 0x0453,
        TT_MS_LANGID_LAO_LAOS                       = 0x0454,
        TT_MS_LANGID_GALICIAN_GALICIAN              = 0x0456,
        TT_MS_LANGID_KONKANI_INDIA                  = 0x0457,
        TT_MS_LANGID_SYRIAC_SYRIA                   = 0x045A,
        TT_MS_LANGID_SINHALA_SRI_LANKA              = 0x045B,
        TT_MS_LANGID_INUKTITUT_CANADA               = 0x045D,
        TT_MS_LANGID_INUKTITUT_CANADA_LATIN         = 0x085D,
        TT_MS_LANGID_AMHARIC_ETHIOPIA               = 0x045E,
        TT_MS_LANGID_TAMAZIGHT_ALGERIA              = 0x085F,
        TT_MS_LANGID_NEPALI_NEPAL                   = 0x0461,
        TT_MS_LANGID_FRISIAN_NETHERLANDS            = 0x0462,
        TT_MS_LANGID_PASHTO_AFGHANISTAN             = 0x0463,
        TT_MS_LANGID_FILIPINO_PHILIPPINES           = 0x0464,
        TT_MS_LANGID_DHIVEHI_MALDIVES               = 0x0465,
        TT_MS_LANGID_HAUSA_NIGERIA                  = 0x0468,
        TT_MS_LANGID_YORUBA_NIGERIA                 = 0x046A,
        TT_MS_LANGID_QUECHUA_BOLIVIA                = 0x046B,
        TT_MS_LANGID_QUECHUA_ECUADOR                = 0x086B,
        TT_MS_LANGID_QUECHUA_PERU                   = 0x0C6B,
        TT_MS_LANGID_SESOTHO_SA_LEBOA_SOUTH_AFRICA  = 0x046C,
        TT_MS_LANGID_BASHKIR_RUSSIA                 = 0x046D,
        TT_MS_LANGID_LUXEMBOURGISH_LUXEMBOURG       = 0x046E,
        TT_MS_LANGID_GREENLANDIC_GREENLAND          = 0x046F,
        TT_MS_LANGID_IGBO_NIGERIA                   = 0x0470,
        TT_MS_LANGID_YI_PRC                         = 0x0478,
        TT_MS_LANGID_MAPUDUNGUN_CHILE               = 0x047A,
        TT_MS_LANGID_MOHAWK_MOHAWK                  = 0x047C,
        TT_MS_LANGID_BRETON_FRANCE                  = 0x047E,
        TT_MS_LANGID_UIGHUR_PRC                     = 0x0480,
        TT_MS_LANGID_MAORI_NEW_ZEALAND              = 0x0481,
        TT_MS_LANGID_OCCITAN_FRANCE                 = 0x0482,
        TT_MS_LANGID_CORSICAN_FRANCE                = 0x0483,
        TT_MS_LANGID_ALSATIAN_FRANCE                = 0x0484,
        TT_MS_LANGID_YAKUT_RUSSIA                   = 0x0485,
        TT_MS_LANGID_KICHE_GUATEMALA                = 0x0486,
        TT_MS_LANGID_KINYARWANDA_RWANDA             = 0x0487,
        TT_MS_LANGID_WOLOF_SENEGAL                  = 0x0488,
        TT_MS_LANGID_DARI_AFGHANISTAN               = 0x048C;

    public static final int
        TT_NAME_ID_COPYRIGHT             = 0,
        TT_NAME_ID_FONT_FAMILY           = 1,
        TT_NAME_ID_FONT_SUBFAMILY        = 2,
        TT_NAME_ID_UNIQUE_ID             = 3,
        TT_NAME_ID_FULL_NAME             = 4,
        TT_NAME_ID_VERSION_STRING        = 5,
        TT_NAME_ID_PS_NAME               = 6,
        TT_NAME_ID_TRADEMARK             = 7,
        TT_NAME_ID_MANUFACTURER          = 8,
        TT_NAME_ID_DESIGNER              = 9,
        TT_NAME_ID_DESCRIPTION           = 10,
        TT_NAME_ID_VENDOR_URL            = 11,
        TT_NAME_ID_DESIGNER_URL          = 12,
        TT_NAME_ID_LICENSE               = 13,
        TT_NAME_ID_LICENSE_URL           = 14,
        TT_NAME_ID_TYPOGRAPHIC_FAMILY    = 16,
        TT_NAME_ID_TYPOGRAPHIC_SUBFAMILY = 17,
        TT_NAME_ID_MAC_FULL_NAME         = 18,
        TT_NAME_ID_SAMPLE_TEXT           = 19,
        TT_NAME_ID_CID_FINDFONT_NAME     = 20,
        TT_NAME_ID_WWS_FAMILY            = 21,
        TT_NAME_ID_WWS_SUBFAMILY         = 22,
        TT_NAME_ID_LIGHT_BACKGROUND      = 23,
        TT_NAME_ID_DARK_BACKGROUND       = 24,
        TT_NAME_ID_VARIATIONS_PREFIX     = 25;

    public static final int
        TT_UCR_BASIC_LATIN                      = 1 <<  0,
        TT_UCR_LATIN1_SUPPLEMENT                = 1 <<  1,
        TT_UCR_LATIN_EXTENDED_A                 = 1 <<  2,
        TT_UCR_LATIN_EXTENDED_B                 = 1 <<  3,
        TT_UCR_IPA_EXTENSIONS                   = 1 <<  4,
        TT_UCR_SPACING_MODIFIER                 = 1 <<  5,
        TT_UCR_COMBINING_DIACRITICAL_MARKS      = 1 <<  6,
        TT_UCR_GREEK                            = 1 <<  7,
        TT_UCR_COPTIC                           = 1 <<  8,
        TT_UCR_CYRILLIC                         = 1 <<  9,
        TT_UCR_ARMENIAN                         = 1 << 10,
        TT_UCR_HEBREW                           = 1 << 11,
        TT_UCR_VAI                              = 1 << 12,
        TT_UCR_ARABIC                           = 1 << 13,
        TT_UCR_NKO                              = 1 << 14,
        TT_UCR_DEVANAGARI                       = 1 << 15,
        TT_UCR_BENGALI                          = 1 << 16,
        TT_UCR_GURMUKHI                         = 1 << 17,
        TT_UCR_GUJARATI                         = 1 << 18,
        TT_UCR_ORIYA                            = 1 << 19,
        TT_UCR_TAMIL                            = 1 << 20,
        TT_UCR_TELUGU                           = 1 << 21,
        TT_UCR_KANNADA                          = 1 << 22,
        TT_UCR_MALAYALAM                        = 1 << 23,
        TT_UCR_THAI                             = 1 << 24,
        TT_UCR_LAO                              = 1 << 25,
        TT_UCR_GEORGIAN                         = 1 << 26,
        TT_UCR_BALINESE                         = 1 << 27,
        TT_UCR_HANGUL_JAMO                      = 1 << 28,
        TT_UCR_LATIN_EXTENDED_ADDITIONAL        = 1 << 29,
        TT_UCR_GREEK_EXTENDED                   = 1 << 30,
        TT_UCR_GENERAL_PUNCTUATION              = 1 << 31,
        TT_UCR_SUPERSCRIPTS_SUBSCRIPTS          = 1 <<  0,
        TT_UCR_CURRENCY_SYMBOLS                 = 1 <<  1,
        TT_UCR_COMBINING_DIACRITICAL_MARKS_SYMB = 1 <<  2,
        TT_UCR_LETTERLIKE_SYMBOLS               = 1 <<  3,
        TT_UCR_NUMBER_FORMS                     = 1 <<  4,
        TT_UCR_ARROWS                           = 1 <<  5,
        TT_UCR_MATHEMATICAL_OPERATORS           = 1 <<  6,
        TT_UCR_MISCELLANEOUS_TECHNICAL          = 1 <<  7,
        TT_UCR_CONTROL_PICTURES                 = 1 <<  8,
        TT_UCR_OCR                              = 1 <<  9,
        TT_UCR_ENCLOSED_ALPHANUMERICS           = 1 << 10,
        TT_UCR_BOX_DRAWING                      = 1 << 11,
        TT_UCR_BLOCK_ELEMENTS                   = 1 << 12,
        TT_UCR_GEOMETRIC_SHAPES                 = 1 << 13,
        TT_UCR_MISCELLANEOUS_SYMBOLS            = 1 << 14,
        TT_UCR_DINGBATS                         = 1 << 15,
        TT_UCR_CJK_SYMBOLS                      = 1 << 16,
        TT_UCR_HIRAGANA                         = 1 << 17,
        TT_UCR_KATAKANA                         = 1 << 18,
        TT_UCR_BOPOMOFO                         = 1 << 19,
        TT_UCR_HANGUL_COMPATIBILITY_JAMO        = 1 << 20,
        TT_UCR_CJK_MISC                         = 1 << 21,
        TT_UCR_ENCLOSED_CJK_LETTERS_MONTHS      = 1 << 22,
        TT_UCR_CJK_COMPATIBILITY                = 1 << 23,
        TT_UCR_HANGUL                           = 1 << 24,
        TT_UCR_SURROGATES                       = 1 << 25,
        TT_UCR_PHOENICIAN                       = 1 << 26,
        TT_UCR_CJK_UNIFIED_IDEOGRAPHS           = 1 << 27,
        TT_UCR_PRIVATE_USE                      = 1 << 28,
        TT_UCR_CJK_COMPATIBILITY_IDEOGRAPHS     = 1 << 29,
        TT_UCR_ALPHABETIC_PRESENTATION_FORMS    = 1 << 30,
        TT_UCR_ARABIC_PRESENTATION_FORMS_A      = 1 << 31,
        TT_UCR_COMBINING_HALF_MARKS             = 1 <<  0,
        TT_UCR_CJK_COMPATIBILITY_FORMS          = 1 <<  1,
        TT_UCR_SMALL_FORM_VARIANTS              = 1 <<  2,
        TT_UCR_ARABIC_PRESENTATION_FORMS_B      = 1 <<  3,
        TT_UCR_HALFWIDTH_FULLWIDTH_FORMS        = 1 <<  4,
        TT_UCR_SPECIALS                         = 1 <<  5,
        TT_UCR_TIBETAN                          = 1 <<  6,
        TT_UCR_SYRIAC                           = 1 <<  7,
        TT_UCR_THAANA                           = 1 <<  8,
        TT_UCR_SINHALA                          = 1 <<  9,
        TT_UCR_MYANMAR                          = 1 << 10,
        TT_UCR_ETHIOPIC                         = 1 << 11,
        TT_UCR_CHEROKEE                         = 1 << 12,
        TT_UCR_CANADIAN_ABORIGINAL_SYLLABICS    = 1 << 13,
        TT_UCR_OGHAM                            = 1 << 14,
        TT_UCR_RUNIC                            = 1 << 15,
        TT_UCR_KHMER                            = 1 << 16,
        TT_UCR_MONGOLIAN                        = 1 << 17,
        TT_UCR_BRAILLE                          = 1 << 18,
        TT_UCR_YI                               = 1 << 19,
        TT_UCR_PHILIPPINE                       = 1 << 20,
        TT_UCR_OLD_ITALIC                       = 1 << 21,
        TT_UCR_GOTHIC                           = 1 << 22,
        TT_UCR_DESERET                          = 1 << 23,
        TT_UCR_MUSICAL_SYMBOLS                  = 1 << 24,
        TT_UCR_MATH_ALPHANUMERIC_SYMBOLS        = 1 << 25,
        TT_UCR_PRIVATE_USE_SUPPLEMENTARY        = 1 << 26,
        TT_UCR_VARIATION_SELECTORS              = 1 << 27,
        TT_UCR_TAGS                             = 1 << 28,
        TT_UCR_LIMBU                            = 1 << 29,
        TT_UCR_TAI_LE                           = 1 << 30,
        TT_UCR_NEW_TAI_LUE                      = 1 << 31,
        TT_UCR_BUGINESE                         = 1 <<  0,
        TT_UCR_GLAGOLITIC                       = 1 <<  1,
        TT_UCR_TIFINAGH                         = 1 <<  2,
        TT_UCR_YIJING                           = 1 <<  3,
        TT_UCR_SYLOTI_NAGRI                     = 1 <<  4,
        TT_UCR_LINEAR_B                         = 1 <<  5,
        TT_UCR_ANCIENT_GREEK_NUMBERS            = 1 <<  6,
        TT_UCR_UGARITIC                         = 1 <<  7,
        TT_UCR_OLD_PERSIAN                      = 1 <<  8,
        TT_UCR_SHAVIAN                          = 1 <<  9,
        TT_UCR_OSMANYA                          = 1 << 10,
        TT_UCR_CYPRIOT_SYLLABARY                = 1 << 11,
        TT_UCR_KHAROSHTHI                       = 1 << 12,
        TT_UCR_TAI_XUAN_JING                    = 1 << 13,
        TT_UCR_CUNEIFORM                        = 1 << 14,
        TT_UCR_COUNTING_ROD_NUMERALS            = 1 << 15,
        TT_UCR_SUNDANESE                        = 1 << 16,
        TT_UCR_LEPCHA                           = 1 << 17,
        TT_UCR_OL_CHIKI                         = 1 << 18,
        TT_UCR_SAURASHTRA                       = 1 << 19,
        TT_UCR_KAYAH_LI                         = 1 << 20,
        TT_UCR_REJANG                           = 1 << 21,
        TT_UCR_CHAM                             = 1 << 22,
        TT_UCR_ANCIENT_SYMBOLS                  = 1 << 23,
        TT_UCR_PHAISTOS_DISC                    = 1 << 24,
        TT_UCR_OLD_ANATOLIAN                    = 1 << 25,
        TT_UCR_GAME_TILES                       = 1 << 26;

    public static final int
        FT_SFNT_HEAD = 0,
        FT_SFNT_MAXP = 1,
        FT_SFNT_OS2  = 2,
        FT_SFNT_HHEA = 3,
        FT_SFNT_VHEA = 4,
        FT_SFNT_POST = 5,
        FT_SFNT_PCLT = 6,
        FT_SFNT_MAX  = 7;

    public static final int
        TTAG_avar    = FT_MAKE_TAG( 'a', 'v', 'a', 'r' ),
        TTAG_BASE    = FT_MAKE_TAG( 'B', 'A', 'S', 'E' ),
        TTAG_bdat    = FT_MAKE_TAG( 'b', 'd', 'a', 't' ),
        TTAG_BDF     = FT_MAKE_TAG( 'B', 'D', 'F', ' ' ),
        TTAG_bhed    = FT_MAKE_TAG( 'b', 'h', 'e', 'd' ),
        TTAG_bloc    = FT_MAKE_TAG( 'b', 'l', 'o', 'c' ),
        TTAG_bsln    = FT_MAKE_TAG( 'b', 's', 'l', 'n' ),
        TTAG_CBDT    = FT_MAKE_TAG( 'C', 'B', 'D', 'T' ),
        TTAG_CBLC    = FT_MAKE_TAG( 'C', 'B', 'L', 'C' ),
        TTAG_CFF     = FT_MAKE_TAG( 'C', 'F', 'F', ' ' ),
        TTAG_CFF2    = FT_MAKE_TAG( 'C', 'F', 'F', '2' ),
        TTAG_CID     = FT_MAKE_TAG( 'C', 'I', 'D', ' ' ),
        TTAG_cmap    = FT_MAKE_TAG( 'c', 'm', 'a', 'p' ),
        TTAG_COLR    = FT_MAKE_TAG( 'C', 'O', 'L', 'R' ),
        TTAG_CPAL    = FT_MAKE_TAG( 'C', 'P', 'A', 'L' ),
        TTAG_cvar    = FT_MAKE_TAG( 'c', 'v', 'a', 'r' ),
        TTAG_cvt     = FT_MAKE_TAG( 'c', 'v', 't', ' ' ),
        TTAG_DSIG    = FT_MAKE_TAG( 'D', 'S', 'I', 'G' ),
        TTAG_EBDT    = FT_MAKE_TAG( 'E', 'B', 'D', 'T' ),
        TTAG_EBLC    = FT_MAKE_TAG( 'E', 'B', 'L', 'C' ),
        TTAG_EBSC    = FT_MAKE_TAG( 'E', 'B', 'S', 'C' ),
        TTAG_feat    = FT_MAKE_TAG( 'f', 'e', 'a', 't' ),
        TTAG_FOND    = FT_MAKE_TAG( 'F', 'O', 'N', 'D' ),
        TTAG_fpgm    = FT_MAKE_TAG( 'f', 'p', 'g', 'm' ),
        TTAG_fvar    = FT_MAKE_TAG( 'f', 'v', 'a', 'r' ),
        TTAG_gasp    = FT_MAKE_TAG( 'g', 'a', 's', 'p' ),
        TTAG_GDEF    = FT_MAKE_TAG( 'G', 'D', 'E', 'F' ),
        TTAG_glyf    = FT_MAKE_TAG( 'g', 'l', 'y', 'f' ),
        TTAG_GPOS    = FT_MAKE_TAG( 'G', 'P', 'O', 'S' ),
        TTAG_GSUB    = FT_MAKE_TAG( 'G', 'S', 'U', 'B' ),
        TTAG_gvar    = FT_MAKE_TAG( 'g', 'v', 'a', 'r' ),
        TTAG_HVAR    = FT_MAKE_TAG( 'H', 'V', 'A', 'R' ),
        TTAG_hdmx    = FT_MAKE_TAG( 'h', 'd', 'm', 'x' ),
        TTAG_head    = FT_MAKE_TAG( 'h', 'e', 'a', 'd' ),
        TTAG_hhea    = FT_MAKE_TAG( 'h', 'h', 'e', 'a' ),
        TTAG_hmtx    = FT_MAKE_TAG( 'h', 'm', 't', 'x' ),
        TTAG_JSTF    = FT_MAKE_TAG( 'J', 'S', 'T', 'F' ),
        TTAG_just    = FT_MAKE_TAG( 'j', 'u', 's', 't' ),
        TTAG_kern    = FT_MAKE_TAG( 'k', 'e', 'r', 'n' ),
        TTAG_lcar    = FT_MAKE_TAG( 'l', 'c', 'a', 'r' ),
        TTAG_loca    = FT_MAKE_TAG( 'l', 'o', 'c', 'a' ),
        TTAG_LTSH    = FT_MAKE_TAG( 'L', 'T', 'S', 'H' ),
        TTAG_LWFN    = FT_MAKE_TAG( 'L', 'W', 'F', 'N' ),
        TTAG_MATH    = FT_MAKE_TAG( 'M', 'A', 'T', 'H' ),
        TTAG_maxp    = FT_MAKE_TAG( 'm', 'a', 'x', 'p' ),
        TTAG_META    = FT_MAKE_TAG( 'M', 'E', 'T', 'A' ),
        TTAG_MMFX    = FT_MAKE_TAG( 'M', 'M', 'F', 'X' ),
        TTAG_MMSD    = FT_MAKE_TAG( 'M', 'M', 'S', 'D' ),
        TTAG_mort    = FT_MAKE_TAG( 'm', 'o', 'r', 't' ),
        TTAG_morx    = FT_MAKE_TAG( 'm', 'o', 'r', 'x' ),
        TTAG_MVAR    = FT_MAKE_TAG( 'M', 'V', 'A', 'R' ),
        TTAG_name    = FT_MAKE_TAG( 'n', 'a', 'm', 'e' ),
        TTAG_opbd    = FT_MAKE_TAG( 'o', 'p', 'b', 'd' ),
        TTAG_OS2     = FT_MAKE_TAG( 'O', 'S', '/', '2' ),
        TTAG_OTTO    = FT_MAKE_TAG( 'O', 'T', 'T', 'O' ),
        TTAG_PCLT    = FT_MAKE_TAG( 'P', 'C', 'L', 'T' ),
        TTAG_POST    = FT_MAKE_TAG( 'P', 'O', 'S', 'T' ),
        TTAG_post    = FT_MAKE_TAG( 'p', 'o', 's', 't' ),
        TTAG_prep    = FT_MAKE_TAG( 'p', 'r', 'e', 'p' ),
        TTAG_prop    = FT_MAKE_TAG( 'p', 'r', 'o', 'p' ),
        TTAG_sbix    = FT_MAKE_TAG( 's', 'b', 'i', 'x' ),
        TTAG_sfnt    = FT_MAKE_TAG( 's', 'f', 'n', 't' ),
        TTAG_SING    = FT_MAKE_TAG( 'S', 'I', 'N', 'G' ),
        TTAG_SVG     = FT_MAKE_TAG( 'S', 'V', 'G', ' ' ),
        TTAG_trak    = FT_MAKE_TAG( 't', 'r', 'a', 'k' ),
        TTAG_true    = FT_MAKE_TAG( 't', 'r', 'u', 'e' ),
        TTAG_ttc     = FT_MAKE_TAG( 't', 't', 'c', ' ' ),
        TTAG_ttcf    = FT_MAKE_TAG( 't', 't', 'c', 'f' ),
        TTAG_TYP1    = FT_MAKE_TAG( 'T', 'Y', 'P', '1' ),
        TTAG_typ1    = FT_MAKE_TAG( 't', 'y', 'p', '1' ),
        TTAG_VDMX    = FT_MAKE_TAG( 'V', 'D', 'M', 'X' ),
        TTAG_vhea    = FT_MAKE_TAG( 'v', 'h', 'e', 'a' ),
        TTAG_vmtx    = FT_MAKE_TAG( 'v', 'm', 't', 'x' ),
        TTAG_VVAR    = FT_MAKE_TAG( 'V', 'V', 'A', 'R' ),
        TTAG_wOFF    = FT_MAKE_TAG( 'w', 'O', 'F', 'F' ),
        TTAG_wOF2    = FT_MAKE_TAG( 'w', 'O', 'F', '2' ),
        TTAG_0xA5kbd = FT_MAKE_TAG( 0xA5, 'k', 'b', 'd' ),
        TTAG_0xA5lst = FT_MAKE_TAG( 0xA5, 'l', 's', 't' );

    protected FreeType() {
        throw new UnsupportedOperationException();
    }

    // --- [ FT_Init_FreeType ] ---

    /** {@code FT_Error FT_Init_FreeType(FT_Library * alibrary)} */
    public static int nFT_Init_FreeType(long alibrary) {
        long __functionAddress = Functions.Init_FreeType;
        return invokePI(alibrary, __functionAddress);
    }

    /** {@code FT_Error FT_Init_FreeType(FT_Library * alibrary)} */
    @NativeType("FT_Error")
    public static int FT_Init_FreeType(@NativeType("FT_Library *") PointerBuffer alibrary) {
        if (CHECKS) {
            check(alibrary, 1);
        }
        return nFT_Init_FreeType(memAddress(alibrary));
    }

    // --- [ FT_Done_FreeType ] ---

    /** {@code FT_Error FT_Done_FreeType(FT_Library library)} */
    @NativeType("FT_Error")
    public static int FT_Done_FreeType(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Done_FreeType;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_New_Face ] ---

    /** {@code FT_Error FT_New_Face(FT_Library library, char const * filepathname, FT_Long face_index, FT_Face * aface)} */
    public static int nFT_New_Face(long library, long filepathname, long face_index, long aface) {
        long __functionAddress = Functions.New_Face;
        if (CHECKS) {
            check(library);
        }
        return invokePPNPI(library, filepathname, face_index, aface, __functionAddress);
    }

    /** {@code FT_Error FT_New_Face(FT_Library library, char const * filepathname, FT_Long face_index, FT_Face * aface)} */
    @NativeType("FT_Error")
    public static int FT_New_Face(@NativeType("FT_Library") long library, @NativeType("char const *") ByteBuffer filepathname, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            checkNT1(filepathname);
            check(aface, 1);
        }
        return nFT_New_Face(library, memAddress(filepathname), face_index, memAddress(aface));
    }

    /** {@code FT_Error FT_New_Face(FT_Library library, char const * filepathname, FT_Long face_index, FT_Face * aface)} */
    @NativeType("FT_Error")
    public static int FT_New_Face(@NativeType("FT_Library") long library, @NativeType("char const *") CharSequence filepathname, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filepathname, true);
            long filepathnameEncoded = stack.getPointerAddress();
            return nFT_New_Face(library, filepathnameEncoded, face_index, memAddress(aface));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_New_Memory_Face ] ---

    /** {@code FT_Error FT_New_Memory_Face(FT_Library library, FT_Byte const * file_base, FT_Long file_size, FT_Long face_index, FT_Face * aface)} */
    public static int nFT_New_Memory_Face(long library, long file_base, long file_size, long face_index, long aface) {
        long __functionAddress = Functions.New_Memory_Face;
        if (CHECKS) {
            check(library);
        }
        return invokePPNNPI(library, file_base, file_size, face_index, aface, __functionAddress);
    }

    /** {@code FT_Error FT_New_Memory_Face(FT_Library library, FT_Byte const * file_base, FT_Long file_size, FT_Long face_index, FT_Face * aface)} */
    @NativeType("FT_Error")
    public static int FT_New_Memory_Face(@NativeType("FT_Library") long library, @NativeType("FT_Byte const *") ByteBuffer file_base, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        return nFT_New_Memory_Face(library, memAddress(file_base), file_base.remaining(), face_index, memAddress(aface));
    }

    // --- [ FT_Open_Face ] ---

    /** {@code FT_Error FT_Open_Face(FT_Library library, FT_Open_Args const * args, FT_Long face_index, FT_Face * aface)} */
    public static int nFT_Open_Face(long library, long args, long face_index, long aface) {
        long __functionAddress = Functions.Open_Face;
        if (CHECKS) {
            check(library);
        }
        return invokePPNPI(library, args, face_index, aface, __functionAddress);
    }

    /** {@code FT_Error FT_Open_Face(FT_Library library, FT_Open_Args const * args, FT_Long face_index, FT_Face * aface)} */
    @NativeType("FT_Error")
    public static int FT_Open_Face(@NativeType("FT_Library") long library, @NativeType("FT_Open_Args const *") FT_Open_Args args, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        return nFT_Open_Face(library, args.address(), face_index, memAddress(aface));
    }

    // --- [ FT_Attach_File ] ---

    /** {@code FT_Error FT_Attach_File(FT_Face face, char const * filepathname)} */
    public static int nFT_Attach_File(long face, long filepathname) {
        long __functionAddress = Functions.Attach_File;
        return invokePPI(face, filepathname, __functionAddress);
    }

    /** {@code FT_Error FT_Attach_File(FT_Face face, char const * filepathname)} */
    @NativeType("FT_Error")
    public static int FT_Attach_File(FT_Face face, @NativeType("char const *") ByteBuffer filepathname) {
        if (CHECKS) {
            checkNT1(filepathname);
        }
        return nFT_Attach_File(face.address(), memAddress(filepathname));
    }

    /** {@code FT_Error FT_Attach_File(FT_Face face, char const * filepathname)} */
    @NativeType("FT_Error")
    public static int FT_Attach_File(FT_Face face, @NativeType("char const *") CharSequence filepathname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filepathname, true);
            long filepathnameEncoded = stack.getPointerAddress();
            return nFT_Attach_File(face.address(), filepathnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_Attach_Stream ] ---

    /** {@code FT_Error FT_Attach_Stream(FT_Face face, FT_Open_Args const * parameters)} */
    public static int nFT_Attach_Stream(long face, long parameters) {
        long __functionAddress = Functions.Attach_Stream;
        return invokePPI(face, parameters, __functionAddress);
    }

    /** {@code FT_Error FT_Attach_Stream(FT_Face face, FT_Open_Args const * parameters)} */
    @NativeType("FT_Error")
    public static int FT_Attach_Stream(FT_Face face, @NativeType("FT_Open_Args const *") FT_Open_Args parameters) {
        return nFT_Attach_Stream(face.address(), parameters.address());
    }

    // --- [ FT_Reference_Face ] ---

    /** {@code FT_Error FT_Reference_Face(FT_Face face)} */
    public static int nFT_Reference_Face(long face) {
        long __functionAddress = Functions.Reference_Face;
        return invokePI(face, __functionAddress);
    }

    /** {@code FT_Error FT_Reference_Face(FT_Face face)} */
    @NativeType("FT_Error")
    public static int FT_Reference_Face(FT_Face face) {
        return nFT_Reference_Face(face.address());
    }

    // --- [ FT_Done_Face ] ---

    /** {@code FT_Error FT_Done_Face(FT_Face face)} */
    public static int nFT_Done_Face(long face) {
        long __functionAddress = Functions.Done_Face;
        return invokePI(face, __functionAddress);
    }

    /** {@code FT_Error FT_Done_Face(FT_Face face)} */
    @NativeType("FT_Error")
    public static int FT_Done_Face(FT_Face face) {
        return nFT_Done_Face(face.address());
    }

    // --- [ FT_Select_Size ] ---

    /** {@code FT_Error FT_Select_Size(FT_Face face, FT_Int strike_index)} */
    public static int nFT_Select_Size(long face, int strike_index) {
        long __functionAddress = Functions.Select_Size;
        return invokePI(face, strike_index, __functionAddress);
    }

    /** {@code FT_Error FT_Select_Size(FT_Face face, FT_Int strike_index)} */
    @NativeType("FT_Error")
    public static int FT_Select_Size(FT_Face face, @NativeType("FT_Int") int strike_index) {
        return nFT_Select_Size(face.address(), strike_index);
    }

    // --- [ FT_Request_Size ] ---

    /** {@code FT_Error FT_Request_Size(FT_Face face, FT_Size_Request req)} */
    public static int nFT_Request_Size(long face, long req) {
        long __functionAddress = Functions.Request_Size;
        return invokePPI(face, req, __functionAddress);
    }

    /** {@code FT_Error FT_Request_Size(FT_Face face, FT_Size_Request req)} */
    @NativeType("FT_Error")
    public static int FT_Request_Size(FT_Face face, FT_Size_Request req) {
        return nFT_Request_Size(face.address(), req.address());
    }

    // --- [ FT_Set_Char_Size ] ---

    /** {@code FT_Error FT_Set_Char_Size(FT_Face face, FT_F26Dot6 char_width, FT_F26Dot6 char_height, FT_UInt horz_resolution, FT_UInt vert_resolution)} */
    public static int nFT_Set_Char_Size(long face, long char_width, long char_height, int horz_resolution, int vert_resolution) {
        long __functionAddress = Functions.Set_Char_Size;
        return invokePNNI(face, char_width, char_height, horz_resolution, vert_resolution, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Char_Size(FT_Face face, FT_F26Dot6 char_width, FT_F26Dot6 char_height, FT_UInt horz_resolution, FT_UInt vert_resolution)} */
    @NativeType("FT_Error")
    public static int FT_Set_Char_Size(FT_Face face, @NativeType("FT_F26Dot6") long char_width, @NativeType("FT_F26Dot6") long char_height, @NativeType("FT_UInt") int horz_resolution, @NativeType("FT_UInt") int vert_resolution) {
        return nFT_Set_Char_Size(face.address(), char_width, char_height, horz_resolution, vert_resolution);
    }

    // --- [ FT_Set_Pixel_Sizes ] ---

    /** {@code FT_Error FT_Set_Pixel_Sizes(FT_Face face, FT_UInt pixel_width, FT_UInt pixel_height)} */
    public static int nFT_Set_Pixel_Sizes(long face, int pixel_width, int pixel_height) {
        long __functionAddress = Functions.Set_Pixel_Sizes;
        return invokePI(face, pixel_width, pixel_height, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Pixel_Sizes(FT_Face face, FT_UInt pixel_width, FT_UInt pixel_height)} */
    @NativeType("FT_Error")
    public static int FT_Set_Pixel_Sizes(FT_Face face, @NativeType("FT_UInt") int pixel_width, @NativeType("FT_UInt") int pixel_height) {
        return nFT_Set_Pixel_Sizes(face.address(), pixel_width, pixel_height);
    }

    // --- [ FT_Load_Glyph ] ---

    /** {@code FT_Error FT_Load_Glyph(FT_Face face, FT_UInt glyph_index, FT_Int32 load_flags)} */
    public static int nFT_Load_Glyph(long face, int glyph_index, int load_flags) {
        long __functionAddress = Functions.Load_Glyph;
        return invokePI(face, glyph_index, load_flags, __functionAddress);
    }

    /** {@code FT_Error FT_Load_Glyph(FT_Face face, FT_UInt glyph_index, FT_Int32 load_flags)} */
    @NativeType("FT_Error")
    public static int FT_Load_Glyph(FT_Face face, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_Int32") int load_flags) {
        return nFT_Load_Glyph(face.address(), glyph_index, load_flags);
    }

    // --- [ FT_Load_Char ] ---

    /** {@code FT_Error FT_Load_Char(FT_Face face, FT_ULong char_code, FT_Int32 load_flags)} */
    public static int nFT_Load_Char(long face, long char_code, int load_flags) {
        long __functionAddress = Functions.Load_Char;
        return invokePNI(face, char_code, load_flags, __functionAddress);
    }

    /** {@code FT_Error FT_Load_Char(FT_Face face, FT_ULong char_code, FT_Int32 load_flags)} */
    @NativeType("FT_Error")
    public static int FT_Load_Char(FT_Face face, @NativeType("FT_ULong") long char_code, @NativeType("FT_Int32") int load_flags) {
        return nFT_Load_Char(face.address(), char_code, load_flags);
    }

    // --- [ FT_Set_Transform ] ---

    /** {@code void FT_Set_Transform(FT_Face face, FT_Matrix * matrix, FT_Vector * delta)} */
    public static void nFT_Set_Transform(long face, long matrix, long delta) {
        long __functionAddress = Functions.Set_Transform;
        invokePPPV(face, matrix, delta, __functionAddress);
    }

    /** {@code void FT_Set_Transform(FT_Face face, FT_Matrix * matrix, FT_Vector * delta)} */
    public static void FT_Set_Transform(FT_Face face, @NativeType("FT_Matrix *") @Nullable FT_Matrix matrix, @NativeType("FT_Vector *") @Nullable FT_Vector delta) {
        nFT_Set_Transform(face.address(), memAddressSafe(matrix), memAddressSafe(delta));
    }

    // --- [ FT_Get_Transform ] ---

    /** {@code void FT_Get_Transform(FT_Face face, FT_Matrix * matrix, FT_Vector * delta)} */
    public static void nFT_Get_Transform(long face, long matrix, long delta) {
        long __functionAddress = Functions.Get_Transform;
        invokePPPV(face, matrix, delta, __functionAddress);
    }

    /** {@code void FT_Get_Transform(FT_Face face, FT_Matrix * matrix, FT_Vector * delta)} */
    public static void FT_Get_Transform(FT_Face face, @NativeType("FT_Matrix *") @Nullable FT_Matrix matrix, @NativeType("FT_Vector *") @Nullable FT_Vector delta) {
        nFT_Get_Transform(face.address(), memAddressSafe(matrix), memAddressSafe(delta));
    }

    // --- [ FT_Render_Glyph ] ---

    /** {@code FT_Error FT_Render_Glyph(FT_GlyphSlot slot, FT_Render_Mode render_mode)} */
    public static int nFT_Render_Glyph(long slot, int render_mode) {
        long __functionAddress = Functions.Render_Glyph;
        return invokePI(slot, render_mode, __functionAddress);
    }

    /** {@code FT_Error FT_Render_Glyph(FT_GlyphSlot slot, FT_Render_Mode render_mode)} */
    @NativeType("FT_Error")
    public static int FT_Render_Glyph(FT_GlyphSlot slot, @NativeType("FT_Render_Mode") int render_mode) {
        return nFT_Render_Glyph(slot.address(), render_mode);
    }

    // --- [ FT_Get_Kerning ] ---

    /** {@code FT_Error FT_Get_Kerning(FT_Face face, FT_UInt left_glyph, FT_UInt right_glyph, FT_UInt kern_mode, FT_Vector * akerning)} */
    public static int nFT_Get_Kerning(long face, int left_glyph, int right_glyph, int kern_mode, long akerning) {
        long __functionAddress = Functions.Get_Kerning;
        return invokePPI(face, left_glyph, right_glyph, kern_mode, akerning, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Kerning(FT_Face face, FT_UInt left_glyph, FT_UInt right_glyph, FT_UInt kern_mode, FT_Vector * akerning)} */
    @NativeType("FT_Error")
    public static int FT_Get_Kerning(FT_Face face, @NativeType("FT_UInt") int left_glyph, @NativeType("FT_UInt") int right_glyph, @NativeType("FT_UInt") int kern_mode, @NativeType("FT_Vector *") FT_Vector akerning) {
        return nFT_Get_Kerning(face.address(), left_glyph, right_glyph, kern_mode, akerning.address());
    }

    // --- [ FT_Get_Track_Kerning ] ---

    /** {@code FT_Error FT_Get_Track_Kerning(FT_Face face, FT_Fixed point_size, FT_Int degree, FT_Fixed * akerning)} */
    public static int nFT_Get_Track_Kerning(long face, long point_size, int degree, long akerning) {
        long __functionAddress = Functions.Get_Track_Kerning;
        return invokePNPI(face, point_size, degree, akerning, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Track_Kerning(FT_Face face, FT_Fixed point_size, FT_Int degree, FT_Fixed * akerning)} */
    @NativeType("FT_Error")
    public static int FT_Get_Track_Kerning(FT_Face face, @NativeType("FT_Fixed") long point_size, @NativeType("FT_Int") int degree, @NativeType("FT_Fixed *") CLongBuffer akerning) {
        if (CHECKS) {
            check(akerning, 1);
        }
        return nFT_Get_Track_Kerning(face.address(), point_size, degree, memAddress(akerning));
    }

    // --- [ FT_Select_Charmap ] ---

    /** {@code FT_Error FT_Select_Charmap(FT_Face face, FT_Encoding encoding)} */
    public static int nFT_Select_Charmap(long face, int encoding) {
        long __functionAddress = Functions.Select_Charmap;
        return invokePI(face, encoding, __functionAddress);
    }

    /** {@code FT_Error FT_Select_Charmap(FT_Face face, FT_Encoding encoding)} */
    @NativeType("FT_Error")
    public static int FT_Select_Charmap(FT_Face face, @NativeType("FT_Encoding") int encoding) {
        return nFT_Select_Charmap(face.address(), encoding);
    }

    // --- [ FT_Set_Charmap ] ---

    /** {@code FT_Error FT_Set_Charmap(FT_Face face, FT_CharMap charmap)} */
    public static int nFT_Set_Charmap(long face, long charmap) {
        long __functionAddress = Functions.Set_Charmap;
        return invokePPI(face, charmap, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Charmap(FT_Face face, FT_CharMap charmap)} */
    @NativeType("FT_Error")
    public static int FT_Set_Charmap(FT_Face face, FT_CharMap charmap) {
        return nFT_Set_Charmap(face.address(), charmap.address());
    }

    // --- [ FT_Get_Charmap_Index ] ---

    /** {@code FT_Int FT_Get_Charmap_Index(FT_CharMap charmap)} */
    public static int nFT_Get_Charmap_Index(long charmap) {
        long __functionAddress = Functions.Get_Charmap_Index;
        return invokePI(charmap, __functionAddress);
    }

    /** {@code FT_Int FT_Get_Charmap_Index(FT_CharMap charmap)} */
    @NativeType("FT_Int")
    public static int FT_Get_Charmap_Index(FT_CharMap charmap) {
        return nFT_Get_Charmap_Index(charmap.address());
    }

    // --- [ FT_Get_Char_Index ] ---

    /** {@code FT_UInt FT_Get_Char_Index(FT_Face face, FT_ULong charcode)} */
    public static int nFT_Get_Char_Index(long face, long charcode) {
        long __functionAddress = Functions.Get_Char_Index;
        return invokePNI(face, charcode, __functionAddress);
    }

    /** {@code FT_UInt FT_Get_Char_Index(FT_Face face, FT_ULong charcode)} */
    @NativeType("FT_UInt")
    public static int FT_Get_Char_Index(FT_Face face, @NativeType("FT_ULong") long charcode) {
        return nFT_Get_Char_Index(face.address(), charcode);
    }

    // --- [ FT_Get_First_Char ] ---

    /** {@code FT_ULong FT_Get_First_Char(FT_Face face, FT_UInt * agindex)} */
    public static long nFT_Get_First_Char(long face, long agindex) {
        long __functionAddress = Functions.Get_First_Char;
        return invokePPN(face, agindex, __functionAddress);
    }

    /** {@code FT_ULong FT_Get_First_Char(FT_Face face, FT_UInt * agindex)} */
    @NativeType("FT_ULong")
    public static long FT_Get_First_Char(FT_Face face, @NativeType("FT_UInt *") IntBuffer agindex) {
        if (CHECKS) {
            check(agindex, 1);
        }
        return nFT_Get_First_Char(face.address(), memAddress(agindex));
    }

    // --- [ FT_Get_Next_Char ] ---

    /** {@code FT_ULong FT_Get_Next_Char(FT_Face face, FT_ULong char_code, FT_UInt * agindex)} */
    public static long nFT_Get_Next_Char(long face, long char_code, long agindex) {
        long __functionAddress = Functions.Get_Next_Char;
        return invokePNPN(face, char_code, agindex, __functionAddress);
    }

    /** {@code FT_ULong FT_Get_Next_Char(FT_Face face, FT_ULong char_code, FT_UInt * agindex)} */
    @NativeType("FT_ULong")
    public static long FT_Get_Next_Char(FT_Face face, @NativeType("FT_ULong") long char_code, @NativeType("FT_UInt *") IntBuffer agindex) {
        if (CHECKS) {
            check(agindex, 1);
        }
        return nFT_Get_Next_Char(face.address(), char_code, memAddress(agindex));
    }

    // --- [ FT_Face_Properties ] ---

    /** {@code FT_Error FT_Face_Properties(FT_Face face, FT_UInt num_properties, FT_Parameter * properties)} */
    public static int nFT_Face_Properties(long face, int num_properties, long properties) {
        long __functionAddress = Functions.Face_Properties;
        return invokePPI(face, num_properties, properties, __functionAddress);
    }

    /** {@code FT_Error FT_Face_Properties(FT_Face face, FT_UInt num_properties, FT_Parameter * properties)} */
    @NativeType("FT_Error")
    public static int FT_Face_Properties(FT_Face face, @NativeType("FT_Parameter *") FT_Parameter.Buffer properties) {
        return nFT_Face_Properties(face.address(), properties.remaining(), properties.address());
    }

    // --- [ FT_Get_Name_Index ] ---

    /** {@code FT_UInt FT_Get_Name_Index(FT_Face face, FT_String const * glyph_name)} */
    public static int nFT_Get_Name_Index(long face, long glyph_name) {
        long __functionAddress = Functions.Get_Name_Index;
        return invokePPI(face, glyph_name, __functionAddress);
    }

    /** {@code FT_UInt FT_Get_Name_Index(FT_Face face, FT_String const * glyph_name)} */
    @NativeType("FT_UInt")
    public static int FT_Get_Name_Index(FT_Face face, @NativeType("FT_String const *") ByteBuffer glyph_name) {
        if (CHECKS) {
            checkNT1(glyph_name);
        }
        return nFT_Get_Name_Index(face.address(), memAddress(glyph_name));
    }

    /** {@code FT_UInt FT_Get_Name_Index(FT_Face face, FT_String const * glyph_name)} */
    @NativeType("FT_UInt")
    public static int FT_Get_Name_Index(FT_Face face, @NativeType("FT_String const *") CharSequence glyph_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(glyph_name, true);
            long glyph_nameEncoded = stack.getPointerAddress();
            return nFT_Get_Name_Index(face.address(), glyph_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_Get_Glyph_Name ] ---

    /** {@code FT_Error FT_Get_Glyph_Name(FT_Face face, FT_UInt glyph_index, FT_Pointer buffer, FT_UInt buffer_max)} */
    public static int nFT_Get_Glyph_Name(long face, int glyph_index, long buffer, int buffer_max) {
        long __functionAddress = Functions.Get_Glyph_Name;
        return invokePPI(face, glyph_index, buffer, buffer_max, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Glyph_Name(FT_Face face, FT_UInt glyph_index, FT_Pointer buffer, FT_UInt buffer_max)} */
    @NativeType("FT_Error")
    public static int FT_Get_Glyph_Name(FT_Face face, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_Pointer") ByteBuffer buffer) {
        return nFT_Get_Glyph_Name(face.address(), glyph_index, memAddress(buffer), buffer.remaining());
    }

    // --- [ FT_Get_Postscript_Name ] ---

    /** {@code char const * FT_Get_Postscript_Name(FT_Face face)} */
    public static long nFT_Get_Postscript_Name(long face) {
        long __functionAddress = Functions.Get_Postscript_Name;
        return invokePP(face, __functionAddress);
    }

    /** {@code char const * FT_Get_Postscript_Name(FT_Face face)} */
    @NativeType("char const *")
    public static @Nullable String FT_Get_Postscript_Name(FT_Face face) {
        long __result = nFT_Get_Postscript_Name(face.address());
        return memASCIISafe(__result);
    }

    // --- [ FT_Get_SubGlyph_Info ] ---

    /** {@code FT_Error FT_Get_SubGlyph_Info(FT_GlyphSlot glyph, FT_UInt sub_index, FT_Int * p_index, FT_UInt * p_flags, FT_Int * p_arg1, FT_Int * p_arg2, FT_Matrix * p_transform)} */
    public static int nFT_Get_SubGlyph_Info(long glyph, int sub_index, long p_index, long p_flags, long p_arg1, long p_arg2, long p_transform) {
        long __functionAddress = Functions.Get_SubGlyph_Info;
        return invokePPPPPPI(glyph, sub_index, p_index, p_flags, p_arg1, p_arg2, p_transform, __functionAddress);
    }

    /** {@code FT_Error FT_Get_SubGlyph_Info(FT_GlyphSlot glyph, FT_UInt sub_index, FT_Int * p_index, FT_UInt * p_flags, FT_Int * p_arg1, FT_Int * p_arg2, FT_Matrix * p_transform)} */
    @NativeType("FT_Error")
    public static int FT_Get_SubGlyph_Info(FT_GlyphSlot glyph, @NativeType("FT_UInt") int sub_index, @NativeType("FT_Int *") IntBuffer p_index, @NativeType("FT_UInt *") IntBuffer p_flags, @NativeType("FT_Int *") IntBuffer p_arg1, @NativeType("FT_Int *") IntBuffer p_arg2, @NativeType("FT_Matrix *") FT_Matrix p_transform) {
        if (CHECKS) {
            check(p_index, 1);
            check(p_flags, 1);
            check(p_arg1, 1);
            check(p_arg2, 1);
        }
        return nFT_Get_SubGlyph_Info(glyph.address(), sub_index, memAddress(p_index), memAddress(p_flags), memAddress(p_arg1), memAddress(p_arg2), p_transform.address());
    }

    // --- [ FT_Get_FSType_Flags ] ---

    /** {@code FT_UShort FT_Get_FSType_Flags(FT_Face face)} */
    public static short nFT_Get_FSType_Flags(long face) {
        long __functionAddress = Functions.Get_FSType_Flags;
        return invokePC(face, __functionAddress);
    }

    /** {@code FT_UShort FT_Get_FSType_Flags(FT_Face face)} */
    @NativeType("FT_UShort")
    public static short FT_Get_FSType_Flags(FT_Face face) {
        return nFT_Get_FSType_Flags(face.address());
    }

    // --- [ FT_Face_GetCharVariantIndex ] ---

    /** {@code FT_UInt FT_Face_GetCharVariantIndex(FT_Face face, FT_ULong charcode, FT_ULong variantSelector)} */
    public static int nFT_Face_GetCharVariantIndex(long face, long charcode, long variantSelector) {
        long __functionAddress = Functions.Face_GetCharVariantIndex;
        return invokePNNI(face, charcode, variantSelector, __functionAddress);
    }

    /** {@code FT_UInt FT_Face_GetCharVariantIndex(FT_Face face, FT_ULong charcode, FT_ULong variantSelector)} */
    @NativeType("FT_UInt")
    public static int FT_Face_GetCharVariantIndex(FT_Face face, @NativeType("FT_ULong") long charcode, @NativeType("FT_ULong") long variantSelector) {
        return nFT_Face_GetCharVariantIndex(face.address(), charcode, variantSelector);
    }

    // --- [ FT_Face_GetCharVariantIsDefault ] ---

    /** {@code FT_Int FT_Face_GetCharVariantIsDefault(FT_Face face, FT_ULong charcode, FT_ULong variantSelector)} */
    public static int nFT_Face_GetCharVariantIsDefault(long face, long charcode, long variantSelector) {
        long __functionAddress = Functions.Face_GetCharVariantIsDefault;
        return invokePNNI(face, charcode, variantSelector, __functionAddress);
    }

    /** {@code FT_Int FT_Face_GetCharVariantIsDefault(FT_Face face, FT_ULong charcode, FT_ULong variantSelector)} */
    @NativeType("FT_Int")
    public static int FT_Face_GetCharVariantIsDefault(FT_Face face, @NativeType("FT_ULong") long charcode, @NativeType("FT_ULong") long variantSelector) {
        return nFT_Face_GetCharVariantIsDefault(face.address(), charcode, variantSelector);
    }

    // --- [ FT_Face_GetVariantSelectors ] ---

    /** {@code FT_UInt32 * FT_Face_GetVariantSelectors(FT_Face face)} */
    public static long nFT_Face_GetVariantSelectors(long face) {
        long __functionAddress = Functions.Face_GetVariantSelectors;
        return invokePP(face, __functionAddress);
    }

    /** {@code FT_UInt32 * FT_Face_GetVariantSelectors(FT_Face face)} */
    @NativeType("FT_UInt32 *")
    public static long FT_Face_GetVariantSelectors(FT_Face face) {
        return nFT_Face_GetVariantSelectors(face.address());
    }

    // --- [ FT_Face_GetVariantsOfChar ] ---

    /** {@code FT_UInt32 * FT_Face_GetVariantsOfChar(FT_Face face, FT_ULong charcode)} */
    public static long nFT_Face_GetVariantsOfChar(long face, long charcode) {
        long __functionAddress = Functions.Face_GetVariantsOfChar;
        return invokePNP(face, charcode, __functionAddress);
    }

    /** {@code FT_UInt32 * FT_Face_GetVariantsOfChar(FT_Face face, FT_ULong charcode)} */
    @NativeType("FT_UInt32 *")
    public static long FT_Face_GetVariantsOfChar(FT_Face face, @NativeType("FT_ULong") long charcode) {
        return nFT_Face_GetVariantsOfChar(face.address(), charcode);
    }

    // --- [ FT_Face_GetCharsOfVariant ] ---

    /** {@code FT_UInt32 * FT_Face_GetCharsOfVariant(FT_Face face, FT_ULong variantSelector)} */
    public static long nFT_Face_GetCharsOfVariant(long face, long variantSelector) {
        long __functionAddress = Functions.Face_GetCharsOfVariant;
        return invokePNP(face, variantSelector, __functionAddress);
    }

    /** {@code FT_UInt32 * FT_Face_GetCharsOfVariant(FT_Face face, FT_ULong variantSelector)} */
    @NativeType("FT_UInt32 *")
    public static long FT_Face_GetCharsOfVariant(FT_Face face, @NativeType("FT_ULong") long variantSelector) {
        return nFT_Face_GetCharsOfVariant(face.address(), variantSelector);
    }

    // --- [ FT_MulDiv ] ---

    /** {@code FT_Long FT_MulDiv(FT_Long a, FT_Long b, FT_Long c)} */
    @NativeType("FT_Long")
    public static long FT_MulDiv(@NativeType("FT_Long") long a, @NativeType("FT_Long") long b, @NativeType("FT_Long") long c) {
        long __functionAddress = Functions.MulDiv;
        return invokeNNNN(a, b, c, __functionAddress);
    }

    // --- [ FT_MulFix ] ---

    /** {@code FT_Long FT_MulFix(FT_Long a, FT_Long b)} */
    @NativeType("FT_Long")
    public static long FT_MulFix(@NativeType("FT_Long") long a, @NativeType("FT_Long") long b) {
        long __functionAddress = Functions.MulFix;
        return invokeNNN(a, b, __functionAddress);
    }

    // --- [ FT_DivFix ] ---

    /** {@code FT_Long FT_DivFix(FT_Long a, FT_Long b)} */
    @NativeType("FT_Long")
    public static long FT_DivFix(@NativeType("FT_Long") long a, @NativeType("FT_Long") long b) {
        long __functionAddress = Functions.DivFix;
        return invokeNNN(a, b, __functionAddress);
    }

    // --- [ FT_RoundFix ] ---

    /** {@code FT_Fixed FT_RoundFix(FT_Fixed a)} */
    @NativeType("FT_Fixed")
    public static long FT_RoundFix(@NativeType("FT_Fixed") long a) {
        long __functionAddress = Functions.RoundFix;
        return invokeNN(a, __functionAddress);
    }

    // --- [ FT_CeilFix ] ---

    /** {@code FT_Fixed FT_CeilFix(FT_Fixed a)} */
    @NativeType("FT_Fixed")
    public static long FT_CeilFix(@NativeType("FT_Fixed") long a) {
        long __functionAddress = Functions.CeilFix;
        return invokeNN(a, __functionAddress);
    }

    // --- [ FT_FloorFix ] ---

    /** {@code FT_Fixed FT_FloorFix(FT_Fixed a)} */
    @NativeType("FT_Fixed")
    public static long FT_FloorFix(@NativeType("FT_Fixed") long a) {
        long __functionAddress = Functions.FloorFix;
        return invokeNN(a, __functionAddress);
    }

    // --- [ FT_Vector_Transform ] ---

    /** {@code void FT_Vector_Transform(FT_Vector * vector, FT_Matrix const * matrix)} */
    public static void nFT_Vector_Transform(long vector, long matrix) {
        long __functionAddress = Functions.Vector_Transform;
        invokePPV(vector, matrix, __functionAddress);
    }

    /** {@code void FT_Vector_Transform(FT_Vector * vector, FT_Matrix const * matrix)} */
    public static void FT_Vector_Transform(@NativeType("FT_Vector *") FT_Vector vector, @NativeType("FT_Matrix const *") FT_Matrix matrix) {
        nFT_Vector_Transform(vector.address(), matrix.address());
    }

    // --- [ FT_Library_Version ] ---

    /** {@code void FT_Library_Version(FT_Library library, FT_Int * amajor, FT_Int * aminor, FT_Int * apatch)} */
    public static void nFT_Library_Version(long library, long amajor, long aminor, long apatch) {
        long __functionAddress = Functions.Library_Version;
        if (CHECKS) {
            check(library);
        }
        invokePPPPV(library, amajor, aminor, apatch, __functionAddress);
    }

    /** {@code void FT_Library_Version(FT_Library library, FT_Int * amajor, FT_Int * aminor, FT_Int * apatch)} */
    public static void FT_Library_Version(@NativeType("FT_Library") long library, @NativeType("FT_Int *") IntBuffer amajor, @NativeType("FT_Int *") IntBuffer aminor, @NativeType("FT_Int *") IntBuffer apatch) {
        if (CHECKS) {
            check(amajor, 1);
            check(aminor, 1);
            check(apatch, 1);
        }
        nFT_Library_Version(library, memAddress(amajor), memAddress(aminor), memAddress(apatch));
    }

    // --- [ FT_Face_CheckTrueTypePatents ] ---

    /** {@code FT_Bool FT_Face_CheckTrueTypePatents(FT_Face face)} */
    public static boolean nFT_Face_CheckTrueTypePatents(long face) {
        long __functionAddress = Functions.Face_CheckTrueTypePatents;
        return invokePZ(face, __functionAddress);
    }

    /** {@code FT_Bool FT_Face_CheckTrueTypePatents(FT_Face face)} */
    @NativeType("FT_Bool")
    public static boolean FT_Face_CheckTrueTypePatents(FT_Face face) {
        return nFT_Face_CheckTrueTypePatents(face.address());
    }

    // --- [ FT_Face_SetUnpatentedHinting ] ---

    /** {@code FT_Bool FT_Face_SetUnpatentedHinting(FT_Face face, FT_Bool value)} */
    public static boolean nFT_Face_SetUnpatentedHinting(long face, boolean value) {
        long __functionAddress = Functions.Face_SetUnpatentedHinting;
        return invokePZ(face, value, __functionAddress);
    }

    /** {@code FT_Bool FT_Face_SetUnpatentedHinting(FT_Face face, FT_Bool value)} */
    @NativeType("FT_Bool")
    public static boolean FT_Face_SetUnpatentedHinting(FT_Face face, @NativeType("FT_Bool") boolean value) {
        return nFT_Face_SetUnpatentedHinting(face.address(), value);
    }

    // --- [ FT_Get_Advance ] ---

    /** {@code FT_Error FT_Get_Advance(FT_Face face, FT_UInt gindex, FT_Int32 load_flags, FT_Fixed * padvance)} */
    public static int nFT_Get_Advance(long face, int gindex, int load_flags, long padvance) {
        long __functionAddress = Functions.Get_Advance;
        return invokePPI(face, gindex, load_flags, padvance, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Advance(FT_Face face, FT_UInt gindex, FT_Int32 load_flags, FT_Fixed * padvance)} */
    @NativeType("FT_Error")
    public static int FT_Get_Advance(FT_Face face, @NativeType("FT_UInt") int gindex, @NativeType("FT_Int32") int load_flags, @NativeType("FT_Fixed *") CLongBuffer padvance) {
        if (CHECKS) {
            check(padvance, 1);
        }
        return nFT_Get_Advance(face.address(), gindex, load_flags, memAddress(padvance));
    }

    // --- [ FT_Get_Advances ] ---

    /** {@code FT_Error FT_Get_Advances(FT_Face face, FT_UInt start, FT_UInt count, FT_Int32 load_flags, FT_Fixed * padvances)} */
    public static int nFT_Get_Advances(long face, int start, int count, int load_flags, long padvances) {
        long __functionAddress = Functions.Get_Advances;
        return invokePPI(face, start, count, load_flags, padvances, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Advances(FT_Face face, FT_UInt start, FT_UInt count, FT_Int32 load_flags, FT_Fixed * padvances)} */
    @NativeType("FT_Error")
    public static int FT_Get_Advances(FT_Face face, @NativeType("FT_UInt") int start, @NativeType("FT_Int32") int load_flags, @NativeType("FT_Fixed *") CLongBuffer padvances) {
        return nFT_Get_Advances(face.address(), start, padvances.remaining(), load_flags, memAddress(padvances));
    }

    // --- [ FT_Outline_Get_BBox ] ---

    /** {@code FT_Error FT_Outline_Get_BBox(FT_Outline * outline, FT_BBox * abbox)} */
    public static int nFT_Outline_Get_BBox(long outline, long abbox) {
        long __functionAddress = Functions.Outline_Get_BBox;
        return invokePPI(outline, abbox, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Get_BBox(FT_Outline * outline, FT_BBox * abbox)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Get_BBox(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_BBox *") FT_BBox abbox) {
        return nFT_Outline_Get_BBox(outline.address(), abbox.address());
    }

    // --- [ FT_Get_BDF_Charset_ID ] ---

    /** {@code FT_Error FT_Get_BDF_Charset_ID(FT_Face face, char const ** acharset_encoding, char const ** acharset_registry)} */
    public static int nFT_Get_BDF_Charset_ID(long face, long acharset_encoding, long acharset_registry) {
        long __functionAddress = Functions.Get_BDF_Charset_ID;
        return invokePPPI(face, acharset_encoding, acharset_registry, __functionAddress);
    }

    /** {@code FT_Error FT_Get_BDF_Charset_ID(FT_Face face, char const ** acharset_encoding, char const ** acharset_registry)} */
    @NativeType("FT_Error")
    public static int FT_Get_BDF_Charset_ID(FT_Face face, @NativeType("char const **") PointerBuffer acharset_encoding, @NativeType("char const **") PointerBuffer acharset_registry) {
        if (CHECKS) {
            check(acharset_encoding, 1);
            check(acharset_registry, 1);
        }
        return nFT_Get_BDF_Charset_ID(face.address(), memAddress(acharset_encoding), memAddress(acharset_registry));
    }

    // --- [ FT_Get_BDF_Property ] ---

    /** {@code FT_Error FT_Get_BDF_Property(FT_Face face, char const * prop_name, BDF_PropertyRec * aproperty)} */
    public static int nFT_Get_BDF_Property(long face, long prop_name, long aproperty) {
        long __functionAddress = Functions.Get_BDF_Property;
        return invokePPPI(face, prop_name, aproperty, __functionAddress);
    }

    /** {@code FT_Error FT_Get_BDF_Property(FT_Face face, char const * prop_name, BDF_PropertyRec * aproperty)} */
    @NativeType("FT_Error")
    public static int FT_Get_BDF_Property(FT_Face face, @NativeType("char const *") ByteBuffer prop_name, @NativeType("BDF_PropertyRec *") BDF_Property aproperty) {
        if (CHECKS) {
            checkNT1(prop_name);
        }
        return nFT_Get_BDF_Property(face.address(), memAddress(prop_name), aproperty.address());
    }

    /** {@code FT_Error FT_Get_BDF_Property(FT_Face face, char const * prop_name, BDF_PropertyRec * aproperty)} */
    @NativeType("FT_Error")
    public static int FT_Get_BDF_Property(FT_Face face, @NativeType("char const *") CharSequence prop_name, @NativeType("BDF_PropertyRec *") BDF_Property aproperty) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(prop_name, true);
            long prop_nameEncoded = stack.getPointerAddress();
            return nFT_Get_BDF_Property(face.address(), prop_nameEncoded, aproperty.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_Bitmap_Init ] ---

    /** {@code void FT_Bitmap_Init(FT_Bitmap * abitmap)} */
    public static void nFT_Bitmap_Init(long abitmap) {
        long __functionAddress = Functions.Bitmap_Init;
        invokePV(abitmap, __functionAddress);
    }

    /** {@code void FT_Bitmap_Init(FT_Bitmap * abitmap)} */
    public static void FT_Bitmap_Init(@NativeType("FT_Bitmap *") FT_Bitmap abitmap) {
        nFT_Bitmap_Init(abitmap.address());
    }

    // --- [ FT_Bitmap_Copy ] ---

    /** {@code FT_Error FT_Bitmap_Copy(FT_Library library, FT_Bitmap const * source, FT_Bitmap * target)} */
    public static int nFT_Bitmap_Copy(long library, long source, long target) {
        long __functionAddress = Functions.Bitmap_Copy;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, source, target, __functionAddress);
    }

    /** {@code FT_Error FT_Bitmap_Copy(FT_Library library, FT_Bitmap const * source, FT_Bitmap * target)} */
    @NativeType("FT_Error")
    public static int FT_Bitmap_Copy(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap const *") FT_Bitmap source, @NativeType("FT_Bitmap *") FT_Bitmap target) {
        return nFT_Bitmap_Copy(library, source.address(), target.address());
    }

    // --- [ FT_Bitmap_Embolden ] ---

    /** {@code FT_Error FT_Bitmap_Embolden(FT_Library library, FT_Bitmap * bitmap, FT_Pos xStrength, FT_Pos yStrength)} */
    public static int nFT_Bitmap_Embolden(long library, long bitmap, long xStrength, long yStrength) {
        long __functionAddress = Functions.Bitmap_Embolden;
        if (CHECKS) {
            check(library);
        }
        return invokePPNNI(library, bitmap, xStrength, yStrength, __functionAddress);
    }

    /** {@code FT_Error FT_Bitmap_Embolden(FT_Library library, FT_Bitmap * bitmap, FT_Pos xStrength, FT_Pos yStrength)} */
    @NativeType("FT_Error")
    public static int FT_Bitmap_Embolden(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap *") FT_Bitmap bitmap, @NativeType("FT_Pos") long xStrength, @NativeType("FT_Pos") long yStrength) {
        return nFT_Bitmap_Embolden(library, bitmap.address(), xStrength, yStrength);
    }

    // --- [ FT_Bitmap_Convert ] ---

    /** {@code FT_Error FT_Bitmap_Convert(FT_Library library, FT_Bitmap const * source, FT_Bitmap * target, FT_Int alignment)} */
    public static int nFT_Bitmap_Convert(long library, long source, long target, int alignment) {
        long __functionAddress = Functions.Bitmap_Convert;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, source, target, alignment, __functionAddress);
    }

    /** {@code FT_Error FT_Bitmap_Convert(FT_Library library, FT_Bitmap const * source, FT_Bitmap * target, FT_Int alignment)} */
    @NativeType("FT_Error")
    public static int FT_Bitmap_Convert(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap const *") FT_Bitmap source, @NativeType("FT_Bitmap *") FT_Bitmap target, @NativeType("FT_Int") int alignment) {
        return nFT_Bitmap_Convert(library, source.address(), target.address(), alignment);
    }

    // --- [ FT_Bitmap_Blend ] ---

    private static final FFICIF FT_Bitmap_BlendCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, apiCreateStruct(ffi_type_slong, ffi_type_slong), ffi_type_pointer, ffi_type_pointer, apiCreateStruct(ffi_type_uint8, ffi_type_uint8, ffi_type_uint8, ffi_type_uint8)
    );

    /** {@code FT_Error FT_Bitmap_Blend(FT_Library library, FT_Bitmap const * source, FT_Vector const source_offset, FT_Bitmap * target, FT_Vector * atarget_offset, FT_Color color)} */
    public static int nFT_Bitmap_Blend(long library, long source, long source_offset, long target, long atarget_offset, long color) {
        long __functionAddress = Functions.Bitmap_Blend;
        if (CHECKS) {
            check(library);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 6);
            memPutAddress(arguments, stack.npointer(library));
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(source));
            memPutAddress(arguments + 2 * POINTER_SIZE, source_offset);
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(target));
            memPutAddress(arguments + 4 * POINTER_SIZE, stack.npointer(atarget_offset));
            memPutAddress(arguments + 5 * POINTER_SIZE, color);

            nffi_call(FT_Bitmap_BlendCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FT_Error FT_Bitmap_Blend(FT_Library library, FT_Bitmap const * source, FT_Vector const source_offset, FT_Bitmap * target, FT_Vector * atarget_offset, FT_Color color)} */
    @NativeType("FT_Error")
    public static int FT_Bitmap_Blend(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap const *") FT_Bitmap source, @NativeType("FT_Vector const") FT_Vector source_offset, @NativeType("FT_Bitmap *") FT_Bitmap target, @NativeType("FT_Vector *") FT_Vector atarget_offset, FT_Color color) {
        return nFT_Bitmap_Blend(library, source.address(), source_offset.address(), target.address(), atarget_offset.address(), color.address());
    }

    // --- [ FT_GlyphSlot_Own_Bitmap ] ---

    /** {@code FT_Error FT_GlyphSlot_Own_Bitmap(FT_GlyphSlot slot)} */
    public static int nFT_GlyphSlot_Own_Bitmap(long slot) {
        long __functionAddress = Functions.GlyphSlot_Own_Bitmap;
        return invokePI(slot, __functionAddress);
    }

    /** {@code FT_Error FT_GlyphSlot_Own_Bitmap(FT_GlyphSlot slot)} */
    @NativeType("FT_Error")
    public static int FT_GlyphSlot_Own_Bitmap(FT_GlyphSlot slot) {
        return nFT_GlyphSlot_Own_Bitmap(slot.address());
    }

    // --- [ FT_Bitmap_Done ] ---

    /** {@code FT_Error FT_Bitmap_Done(FT_Library library, FT_Bitmap * bitmap)} */
    public static int nFT_Bitmap_Done(long library, long bitmap) {
        long __functionAddress = Functions.Bitmap_Done;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, bitmap, __functionAddress);
    }

    /** {@code FT_Error FT_Bitmap_Done(FT_Library library, FT_Bitmap * bitmap)} */
    @NativeType("FT_Error")
    public static int FT_Bitmap_Done(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap *") FT_Bitmap bitmap) {
        return nFT_Bitmap_Done(library, bitmap.address());
    }

    // --- [ FT_Stream_OpenBzip2 ] ---

    /** {@code FT_Error FT_Stream_OpenBzip2(FT_Stream stream, FT_Stream source)} */
    public static int nFT_Stream_OpenBzip2(long stream, long source) {
        long __functionAddress = Functions.Stream_OpenBzip2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPI(stream, source, __functionAddress);
    }

    /** {@code FT_Error FT_Stream_OpenBzip2(FT_Stream stream, FT_Stream source)} */
    @NativeType("FT_Error")
    public static int FT_Stream_OpenBzip2(FT_Stream stream, FT_Stream source) {
        return nFT_Stream_OpenBzip2(stream.address(), source.address());
    }

    // --- [ FTC_Manager_New ] ---

    /** {@code FT_Error FTC_Manager_New(FT_Library library, FT_UInt max_faces, FT_UInt max_sizes, FT_ULong max_bytes, FTC_Face_Requester requester, FT_Pointer req_data, FTC_Manager * amanager)} */
    public static int nFTC_Manager_New(long library, int max_faces, int max_sizes, long max_bytes, long requester, long req_data, long amanager) {
        long __functionAddress = Functions.FTC_Manager_New;
        if (CHECKS) {
            check(library);
        }
        return invokePNPPPI(library, max_faces, max_sizes, max_bytes, requester, req_data, amanager, __functionAddress);
    }

    /** {@code FT_Error FTC_Manager_New(FT_Library library, FT_UInt max_faces, FT_UInt max_sizes, FT_ULong max_bytes, FTC_Face_Requester requester, FT_Pointer req_data, FTC_Manager * amanager)} */
    @NativeType("FT_Error")
    public static int FTC_Manager_New(@NativeType("FT_Library") long library, @NativeType("FT_UInt") int max_faces, @NativeType("FT_UInt") int max_sizes, @NativeType("FT_ULong") long max_bytes, @NativeType("FTC_Face_Requester") FTC_Face_RequesterI requester, @NativeType("FT_Pointer") @Nullable ByteBuffer req_data, @NativeType("FTC_Manager *") PointerBuffer amanager) {
        if (CHECKS) {
            check(amanager, 1);
        }
        return nFTC_Manager_New(library, max_faces, max_sizes, max_bytes, requester.address(), memAddressSafe(req_data), memAddress(amanager));
    }

    // --- [ FTC_Manager_Reset ] ---

    /** {@code void FTC_Manager_Reset(FTC_Manager manager)} */
    public static void FTC_Manager_Reset(@NativeType("FTC_Manager") long manager) {
        long __functionAddress = Functions.FTC_Manager_Reset;
        if (CHECKS) {
            check(manager);
        }
        invokePV(manager, __functionAddress);
    }

    // --- [ FTC_Manager_Done ] ---

    /** {@code void FTC_Manager_Done(FTC_Manager manager)} */
    public static void FTC_Manager_Done(@NativeType("FTC_Manager") long manager) {
        long __functionAddress = Functions.FTC_Manager_Done;
        if (CHECKS) {
            check(manager);
        }
        invokePV(manager, __functionAddress);
    }

    // --- [ FTC_Manager_LookupFace ] ---

    /** {@code FT_Error FTC_Manager_LookupFace(FTC_Manager manager, FTC_FaceID face_id, FT_Face * aface)} */
    public static int nFTC_Manager_LookupFace(long manager, long face_id, long aface) {
        long __functionAddress = Functions.FTC_Manager_LookupFace;
        if (CHECKS) {
            check(manager);
            check(face_id);
        }
        return invokePPPI(manager, face_id, aface, __functionAddress);
    }

    /** {@code FT_Error FTC_Manager_LookupFace(FTC_Manager manager, FTC_FaceID face_id, FT_Face * aface)} */
    @NativeType("FT_Error")
    public static int FTC_Manager_LookupFace(@NativeType("FTC_Manager") long manager, @NativeType("FTC_FaceID") long face_id, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        return nFTC_Manager_LookupFace(manager, face_id, memAddress(aface));
    }

    // --- [ FTC_Manager_LookupSize ] ---

    /** {@code FT_Error FTC_Manager_LookupSize(FTC_Manager manager, FTC_Scaler scaler, FT_Size * asize)} */
    public static int nFTC_Manager_LookupSize(long manager, long scaler, long asize) {
        long __functionAddress = Functions.FTC_Manager_LookupSize;
        if (CHECKS) {
            check(manager);
        }
        return invokePPPI(manager, scaler, asize, __functionAddress);
    }

    /** {@code FT_Error FTC_Manager_LookupSize(FTC_Manager manager, FTC_Scaler scaler, FT_Size * asize)} */
    @NativeType("FT_Error")
    public static int FTC_Manager_LookupSize(@NativeType("FTC_Manager") long manager, FTC_Scaler scaler, @NativeType("FT_Size *") PointerBuffer asize) {
        if (CHECKS) {
            check(asize, 1);
        }
        return nFTC_Manager_LookupSize(manager, scaler.address(), memAddress(asize));
    }

    // --- [ FTC_Node_Unref ] ---

    /** {@code void FTC_Node_Unref(FTC_Node node, FTC_Manager manager)} */
    public static void FTC_Node_Unref(@NativeType("FTC_Node") long node, @NativeType("FTC_Manager") long manager) {
        long __functionAddress = Functions.FTC_Node_Unref;
        if (CHECKS) {
            check(node);
            check(manager);
        }
        invokePPV(node, manager, __functionAddress);
    }

    // --- [ FTC_Manager_RemoveFaceID ] ---

    /** {@code void FTC_Manager_RemoveFaceID(FTC_Manager manager, FTC_FaceID face_id)} */
    public static void FTC_Manager_RemoveFaceID(@NativeType("FTC_Manager") long manager, @NativeType("FTC_FaceID") long face_id) {
        long __functionAddress = Functions.FTC_Manager_RemoveFaceID;
        if (CHECKS) {
            check(manager);
            check(face_id);
        }
        invokePPV(manager, face_id, __functionAddress);
    }

    // --- [ FTC_CMapCache_New ] ---

    /** {@code FT_Error FTC_CMapCache_New(FTC_Manager manager, FTC_CMapCache * acache)} */
    public static int nFTC_CMapCache_New(long manager, long acache) {
        long __functionAddress = Functions.FTC_CMapCache_New;
        if (CHECKS) {
            check(manager);
        }
        return invokePPI(manager, acache, __functionAddress);
    }

    /** {@code FT_Error FTC_CMapCache_New(FTC_Manager manager, FTC_CMapCache * acache)} */
    @NativeType("FT_Error")
    public static int FTC_CMapCache_New(@NativeType("FTC_Manager") long manager, @NativeType("FTC_CMapCache *") PointerBuffer acache) {
        if (CHECKS) {
            check(acache, 1);
        }
        return nFTC_CMapCache_New(manager, memAddress(acache));
    }

    // --- [ FTC_CMapCache_Lookup ] ---

    /** {@code FT_UInt FTC_CMapCache_Lookup(FTC_CMapCache cache, FTC_FaceID face_id, FT_Int cmap_index, FT_UInt32 char_code)} */
    @NativeType("FT_UInt")
    public static int FTC_CMapCache_Lookup(@NativeType("FTC_CMapCache") long cache, @NativeType("FTC_FaceID") long face_id, @NativeType("FT_Int") int cmap_index, @NativeType("FT_UInt32") int char_code) {
        long __functionAddress = Functions.FTC_CMapCache_Lookup;
        if (CHECKS) {
            check(cache);
            check(face_id);
        }
        return invokePPI(cache, face_id, cmap_index, char_code, __functionAddress);
    }

    // --- [ FTC_ImageCache_New ] ---

    /** {@code FT_Error FTC_ImageCache_New(FTC_Manager manager, FTC_ImageCache * acache)} */
    public static int nFTC_ImageCache_New(long manager, long acache) {
        long __functionAddress = Functions.FTC_ImageCache_New;
        if (CHECKS) {
            check(manager);
        }
        return invokePPI(manager, acache, __functionAddress);
    }

    /** {@code FT_Error FTC_ImageCache_New(FTC_Manager manager, FTC_ImageCache * acache)} */
    @NativeType("FT_Error")
    public static int FTC_ImageCache_New(@NativeType("FTC_Manager") long manager, @NativeType("FTC_ImageCache *") PointerBuffer acache) {
        if (CHECKS) {
            check(acache, 1);
        }
        return nFTC_ImageCache_New(manager, memAddress(acache));
    }

    // --- [ FTC_ImageCache_Lookup ] ---

    /** {@code FT_Error FTC_ImageCache_Lookup(FTC_ImageCache cache, FTC_ImageType type, FT_UInt gindex, FT_Glyph * aglyph, FTC_Node * anode)} */
    public static int nFTC_ImageCache_Lookup(long cache, long type, int gindex, long aglyph, long anode) {
        long __functionAddress = Functions.FTC_ImageCache_Lookup;
        if (CHECKS) {
            check(cache);
        }
        return invokePPPPI(cache, type, gindex, aglyph, anode, __functionAddress);
    }

    /** {@code FT_Error FTC_ImageCache_Lookup(FTC_ImageCache cache, FTC_ImageType type, FT_UInt gindex, FT_Glyph * aglyph, FTC_Node * anode)} */
    @NativeType("FT_Error")
    public static int FTC_ImageCache_Lookup(@NativeType("FTC_ImageCache") long cache, FTC_ImageType type, @NativeType("FT_UInt") int gindex, @NativeType("FT_Glyph *") PointerBuffer aglyph, @NativeType("FTC_Node *") @Nullable PointerBuffer anode) {
        if (CHECKS) {
            check(aglyph, 1);
            checkSafe(anode, 1);
        }
        return nFTC_ImageCache_Lookup(cache, type.address(), gindex, memAddress(aglyph), memAddressSafe(anode));
    }

    // --- [ FTC_ImageCache_LookupScaler ] ---

    /** {@code FT_Error FTC_ImageCache_LookupScaler(FTC_ImageCache cache, FTC_Scaler scaler, FT_ULong load_flags, FT_UInt gindex, FT_Glyph * aglyph, FTC_Node * anode)} */
    public static int nFTC_ImageCache_LookupScaler(long cache, long scaler, long load_flags, int gindex, long aglyph, long anode) {
        long __functionAddress = Functions.FTC_ImageCache_LookupScaler;
        if (CHECKS) {
            check(cache);
        }
        return invokePPNPPI(cache, scaler, load_flags, gindex, aglyph, anode, __functionAddress);
    }

    /** {@code FT_Error FTC_ImageCache_LookupScaler(FTC_ImageCache cache, FTC_Scaler scaler, FT_ULong load_flags, FT_UInt gindex, FT_Glyph * aglyph, FTC_Node * anode)} */
    @NativeType("FT_Error")
    public static int FTC_ImageCache_LookupScaler(@NativeType("FTC_ImageCache") long cache, FTC_Scaler scaler, @NativeType("FT_ULong") long load_flags, @NativeType("FT_UInt") int gindex, @NativeType("FT_Glyph *") PointerBuffer aglyph, @NativeType("FTC_Node *") @Nullable PointerBuffer anode) {
        if (CHECKS) {
            check(aglyph, 1);
            checkSafe(anode, 1);
        }
        return nFTC_ImageCache_LookupScaler(cache, scaler.address(), load_flags, gindex, memAddress(aglyph), memAddressSafe(anode));
    }

    // --- [ FTC_SBitCache_New ] ---

    /** {@code FT_Error FTC_SBitCache_New(FTC_Manager manager, FTC_SBitCache * acache)} */
    public static int nFTC_SBitCache_New(long manager, long acache) {
        long __functionAddress = Functions.FTC_SBitCache_New;
        if (CHECKS) {
            check(manager);
        }
        return invokePPI(manager, acache, __functionAddress);
    }

    /** {@code FT_Error FTC_SBitCache_New(FTC_Manager manager, FTC_SBitCache * acache)} */
    @NativeType("FT_Error")
    public static int FTC_SBitCache_New(@NativeType("FTC_Manager") long manager, @NativeType("FTC_SBitCache *") PointerBuffer acache) {
        if (CHECKS) {
            check(acache, 1);
        }
        return nFTC_SBitCache_New(manager, memAddress(acache));
    }

    // --- [ FTC_SBitCache_Lookup ] ---

    /** {@code FT_Error FTC_SBitCache_Lookup(FTC_SBitCache cache, FTC_ImageType type, FT_UInt gindex, FTC_SBit * sbit, FTC_Node * anode)} */
    public static int nFTC_SBitCache_Lookup(long cache, long type, int gindex, long sbit, long anode) {
        long __functionAddress = Functions.FTC_SBitCache_Lookup;
        if (CHECKS) {
            check(cache);
        }
        return invokePPPPI(cache, type, gindex, sbit, anode, __functionAddress);
    }

    /** {@code FT_Error FTC_SBitCache_Lookup(FTC_SBitCache cache, FTC_ImageType type, FT_UInt gindex, FTC_SBit * sbit, FTC_Node * anode)} */
    @NativeType("FT_Error")
    public static int FTC_SBitCache_Lookup(@NativeType("FTC_SBitCache") long cache, FTC_ImageType type, @NativeType("FT_UInt") int gindex, @NativeType("FTC_SBit *") PointerBuffer sbit, @NativeType("FTC_Node *") @Nullable PointerBuffer anode) {
        if (CHECKS) {
            check(sbit, 1);
            checkSafe(anode, 1);
        }
        return nFTC_SBitCache_Lookup(cache, type.address(), gindex, memAddress(sbit), memAddressSafe(anode));
    }

    // --- [ FTC_SBitCache_LookupScaler ] ---

    /** {@code FT_Error FTC_SBitCache_LookupScaler(FTC_SBitCache cache, FTC_Scaler scaler, FT_ULong load_flags, FT_UInt gindex, FTC_SBit * sbit, FTC_Node * anode)} */
    public static int nFTC_SBitCache_LookupScaler(long cache, long scaler, long load_flags, int gindex, long sbit, long anode) {
        long __functionAddress = Functions.FTC_SBitCache_LookupScaler;
        if (CHECKS) {
            check(cache);
        }
        return invokePPNPPI(cache, scaler, load_flags, gindex, sbit, anode, __functionAddress);
    }

    /** {@code FT_Error FTC_SBitCache_LookupScaler(FTC_SBitCache cache, FTC_Scaler scaler, FT_ULong load_flags, FT_UInt gindex, FTC_SBit * sbit, FTC_Node * anode)} */
    @NativeType("FT_Error")
    public static int FTC_SBitCache_LookupScaler(@NativeType("FTC_SBitCache") long cache, FTC_Scaler scaler, @NativeType("FT_ULong") long load_flags, @NativeType("FT_UInt") int gindex, @NativeType("FTC_SBit *") PointerBuffer sbit, @NativeType("FTC_Node *") @Nullable PointerBuffer anode) {
        if (CHECKS) {
            check(sbit, 1);
            checkSafe(anode, 1);
        }
        return nFTC_SBitCache_LookupScaler(cache, scaler.address(), load_flags, gindex, memAddress(sbit), memAddressSafe(anode));
    }

    // --- [ FT_Get_CID_Registry_Ordering_Supplement ] ---

    /** {@code FT_Error FT_Get_CID_Registry_Ordering_Supplement(FT_Face face, char const ** registry, char const ** ordering, FT_Int * supplement)} */
    public static int nFT_Get_CID_Registry_Ordering_Supplement(long face, long registry, long ordering, long supplement) {
        long __functionAddress = Functions.Get_CID_Registry_Ordering_Supplement;
        return invokePPPPI(face, registry, ordering, supplement, __functionAddress);
    }

    /** {@code FT_Error FT_Get_CID_Registry_Ordering_Supplement(FT_Face face, char const ** registry, char const ** ordering, FT_Int * supplement)} */
    @NativeType("FT_Error")
    public static int FT_Get_CID_Registry_Ordering_Supplement(FT_Face face, @NativeType("char const **") PointerBuffer registry, @NativeType("char const **") PointerBuffer ordering, @NativeType("FT_Int *") IntBuffer supplement) {
        if (CHECKS) {
            check(registry, 1);
            check(ordering, 1);
            check(supplement, 1);
        }
        return nFT_Get_CID_Registry_Ordering_Supplement(face.address(), memAddress(registry), memAddress(ordering), memAddress(supplement));
    }

    // --- [ FT_Get_CID_Is_Internally_CID_Keyed ] ---

    /** {@code FT_Error FT_Get_CID_Is_Internally_CID_Keyed(FT_Face face, FT_Bool * is_cid)} */
    public static int nFT_Get_CID_Is_Internally_CID_Keyed(long face, long is_cid) {
        long __functionAddress = Functions.Get_CID_Is_Internally_CID_Keyed;
        return invokePPI(face, is_cid, __functionAddress);
    }

    /** {@code FT_Error FT_Get_CID_Is_Internally_CID_Keyed(FT_Face face, FT_Bool * is_cid)} */
    @NativeType("FT_Error")
    public static int FT_Get_CID_Is_Internally_CID_Keyed(FT_Face face, @NativeType("FT_Bool *") ByteBuffer is_cid) {
        if (CHECKS) {
            check(is_cid, 1);
        }
        return nFT_Get_CID_Is_Internally_CID_Keyed(face.address(), memAddress(is_cid));
    }

    // --- [ FT_Get_CID_From_Glyph_Index ] ---

    /** {@code FT_Error FT_Get_CID_From_Glyph_Index(FT_Face face, FT_UInt glyph_index, FT_UInt * cid)} */
    public static int nFT_Get_CID_From_Glyph_Index(long face, int glyph_index, long cid) {
        long __functionAddress = Functions.Get_CID_From_Glyph_Index;
        return invokePPI(face, glyph_index, cid, __functionAddress);
    }

    /** {@code FT_Error FT_Get_CID_From_Glyph_Index(FT_Face face, FT_UInt glyph_index, FT_UInt * cid)} */
    @NativeType("FT_Error")
    public static int FT_Get_CID_From_Glyph_Index(FT_Face face, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_UInt *") IntBuffer cid) {
        if (CHECKS) {
            check(cid, 1);
        }
        return nFT_Get_CID_From_Glyph_Index(face.address(), glyph_index, memAddress(cid));
    }

    // --- [ FT_Palette_Data_Get ] ---

    /** {@code FT_Error FT_Palette_Data_Get(FT_Face face, FT_Palette_Data * apalette)} */
    public static int nFT_Palette_Data_Get(long face, long apalette) {
        long __functionAddress = Functions.Palette_Data_Get;
        return invokePPI(face, apalette, __functionAddress);
    }

    /** {@code FT_Error FT_Palette_Data_Get(FT_Face face, FT_Palette_Data * apalette)} */
    @NativeType("FT_Error")
    public static int FT_Palette_Data_Get(FT_Face face, @NativeType("FT_Palette_Data *") FT_Palette_Data apalette) {
        return nFT_Palette_Data_Get(face.address(), apalette.address());
    }

    // --- [ FT_Palette_Select ] ---

    /** {@code FT_Error FT_Palette_Select(FT_Face face, FT_UShort palette_index, FT_Color ** apalette)} */
    public static int nFT_Palette_Select(long face, short palette_index, long apalette) {
        long __functionAddress = Functions.Palette_Select;
        return invokePCPI(face, palette_index, apalette, __functionAddress);
    }

    /** {@code FT_Error FT_Palette_Select(FT_Face face, FT_UShort palette_index, FT_Color ** apalette)} */
    @NativeType("FT_Error")
    public static int FT_Palette_Select(FT_Face face, @NativeType("FT_UShort") short palette_index, @NativeType("FT_Color **") @Nullable PointerBuffer apalette) {
        if (CHECKS) {
            checkSafe(apalette, 1);
        }
        return nFT_Palette_Select(face.address(), palette_index, memAddressSafe(apalette));
    }

    // --- [ FT_Palette_Set_Foreground_Color ] ---

    private static final FFICIF FT_Palette_Set_Foreground_ColorCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_sint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint8, ffi_type_uint8, ffi_type_uint8, ffi_type_uint8)
    );

    /** {@code FT_Error FT_Palette_Set_Foreground_Color(FT_Face face, FT_Color foreground_color)} */
    public static int nFT_Palette_Set_Foreground_Color(long face, long foreground_color) {
        long __functionAddress = Functions.Palette_Set_Foreground_Color;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 2);
            memPutAddress(arguments, stack.npointer(face));
            memPutAddress(arguments + POINTER_SIZE, foreground_color);

            nffi_call(FT_Palette_Set_Foreground_ColorCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FT_Error FT_Palette_Set_Foreground_Color(FT_Face face, FT_Color foreground_color)} */
    @NativeType("FT_Error")
    public static int FT_Palette_Set_Foreground_Color(FT_Face face, FT_Color foreground_color) {
        return nFT_Palette_Set_Foreground_Color(face.address(), foreground_color.address());
    }

    // --- [ FT_Get_Color_Glyph_Layer ] ---

    /** {@code FT_Bool FT_Get_Color_Glyph_Layer(FT_Face face, FT_UInt base_glyph, FT_UInt * aglyph_index, FT_UInt * acolor_index, FT_LayerIterator * iterator)} */
    public static boolean nFT_Get_Color_Glyph_Layer(long face, int base_glyph, long aglyph_index, long acolor_index, long iterator) {
        long __functionAddress = Functions.Get_Color_Glyph_Layer;
        return invokePPPPZ(face, base_glyph, aglyph_index, acolor_index, iterator, __functionAddress);
    }

    /** {@code FT_Bool FT_Get_Color_Glyph_Layer(FT_Face face, FT_UInt base_glyph, FT_UInt * aglyph_index, FT_UInt * acolor_index, FT_LayerIterator * iterator)} */
    @NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_Layer(FT_Face face, @NativeType("FT_UInt") int base_glyph, @NativeType("FT_UInt *") IntBuffer aglyph_index, @NativeType("FT_UInt *") IntBuffer acolor_index, @NativeType("FT_LayerIterator *") FT_LayerIterator iterator) {
        if (CHECKS) {
            check(aglyph_index, 1);
            check(acolor_index, 1);
        }
        return nFT_Get_Color_Glyph_Layer(face.address(), base_glyph, memAddress(aglyph_index), memAddress(acolor_index), iterator.address());
    }

    // --- [ FT_Get_Color_Glyph_Paint ] ---

    /** {@code FT_Bool FT_Get_Color_Glyph_Paint(FT_Face face, FT_UInt base_glyph, FT_Color_Root_Transform root_transform, FT_OpaquePaintRec * paint)} */
    public static boolean nFT_Get_Color_Glyph_Paint(long face, int base_glyph, int root_transform, long paint) {
        long __functionAddress = Functions.Get_Color_Glyph_Paint;
        return invokePPZ(face, base_glyph, root_transform, paint, __functionAddress);
    }

    /** {@code FT_Bool FT_Get_Color_Glyph_Paint(FT_Face face, FT_UInt base_glyph, FT_Color_Root_Transform root_transform, FT_OpaquePaintRec * paint)} */
    @NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_Paint(FT_Face face, @NativeType("FT_UInt") int base_glyph, @NativeType("FT_Color_Root_Transform") int root_transform, @NativeType("FT_OpaquePaintRec *") FT_OpaquePaint paint) {
        return nFT_Get_Color_Glyph_Paint(face.address(), base_glyph, root_transform, paint.address());
    }

    // --- [ FT_Get_Color_Glyph_ClipBox ] ---

    /** {@code FT_Bool FT_Get_Color_Glyph_ClipBox(FT_Face face, FT_UInt base_glyph, FT_ClipBox * clip_box)} */
    public static boolean nFT_Get_Color_Glyph_ClipBox(long face, int base_glyph, long clip_box) {
        long __functionAddress = Functions.Get_Color_Glyph_ClipBox;
        return invokePPZ(face, base_glyph, clip_box, __functionAddress);
    }

    /** {@code FT_Bool FT_Get_Color_Glyph_ClipBox(FT_Face face, FT_UInt base_glyph, FT_ClipBox * clip_box)} */
    @NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_ClipBox(FT_Face face, @NativeType("FT_UInt") int base_glyph, @NativeType("FT_ClipBox *") FT_ClipBox clip_box) {
        return nFT_Get_Color_Glyph_ClipBox(face.address(), base_glyph, clip_box.address());
    }

    // --- [ FT_Get_Paint_Layers ] ---

    /** {@code FT_Bool FT_Get_Paint_Layers(FT_Face face, FT_LayerIterator * iterator, FT_OpaquePaintRec * paint)} */
    public static boolean nFT_Get_Paint_Layers(long face, long iterator, long paint) {
        long __functionAddress = Functions.Get_Paint_Layers;
        return invokePPPZ(face, iterator, paint, __functionAddress);
    }

    /** {@code FT_Bool FT_Get_Paint_Layers(FT_Face face, FT_LayerIterator * iterator, FT_OpaquePaintRec * paint)} */
    @NativeType("FT_Bool")
    public static boolean FT_Get_Paint_Layers(FT_Face face, @NativeType("FT_LayerIterator *") FT_LayerIterator iterator, @NativeType("FT_OpaquePaintRec *") FT_OpaquePaint paint) {
        return nFT_Get_Paint_Layers(face.address(), iterator.address(), paint.address());
    }

    // --- [ FT_Get_Colorline_Stops ] ---

    /** {@code FT_Bool FT_Get_Colorline_Stops(FT_Face face, FT_ColorStop * color_stop, FT_ColorStopIterator * iterator)} */
    public static boolean nFT_Get_Colorline_Stops(long face, long color_stop, long iterator) {
        long __functionAddress = Functions.Get_Colorline_Stops;
        return invokePPPZ(face, color_stop, iterator, __functionAddress);
    }

    /** {@code FT_Bool FT_Get_Colorline_Stops(FT_Face face, FT_ColorStop * color_stop, FT_ColorStopIterator * iterator)} */
    @NativeType("FT_Bool")
    public static boolean FT_Get_Colorline_Stops(FT_Face face, @NativeType("FT_ColorStop *") FT_ColorStop color_stop, @NativeType("FT_ColorStopIterator *") FT_ColorStopIterator iterator) {
        return nFT_Get_Colorline_Stops(face.address(), color_stop.address(), iterator.address());
    }

    // --- [ FT_Get_Paint ] ---

    private static final FFICIF FT_Get_PaintCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_uint8,
        ffi_type_pointer, apiCreateStruct(ffi_type_pointer, ffi_type_uint8), ffi_type_pointer
    );

    /** {@code FT_Bool FT_Get_Paint(FT_Face face, FT_OpaquePaintRec opaque_paint, FT_COLR_Paint * paint)} */
    public static boolean nFT_Get_Paint(long face, long opaque_paint, long paint) {
        long __functionAddress = Functions.Get_Paint;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nbyte((byte)0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, stack.npointer(face));
            memPutAddress(arguments + POINTER_SIZE, opaque_paint);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(paint));

            nffi_call(FT_Get_PaintCIF.address(), __functionAddress, __result, arguments);

            return memGetByte(__result) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FT_Bool FT_Get_Paint(FT_Face face, FT_OpaquePaintRec opaque_paint, FT_COLR_Paint * paint)} */
    @NativeType("FT_Bool")
    public static boolean FT_Get_Paint(FT_Face face, @NativeType("FT_OpaquePaintRec") FT_OpaquePaint opaque_paint, @NativeType("FT_COLR_Paint *") FT_COLR_Paint paint) {
        return nFT_Get_Paint(face.address(), opaque_paint.address(), paint.address());
    }

    // --- [ FT_Error_String ] ---

    /** {@code char const * FT_Error_String(FT_Error error_code)} */
    public static long nFT_Error_String(int error_code) {
        long __functionAddress = Functions.Error_String;
        return invokeP(error_code, __functionAddress);
    }

    /** {@code char const * FT_Error_String(FT_Error error_code)} */
    @NativeType("char const *")
    public static @Nullable String FT_Error_String(@NativeType("FT_Error") int error_code) {
        long __result = nFT_Error_String(error_code);
        return memASCIISafe(__result);
    }

    // --- [ FT_Get_Font_Format ] ---

    /** {@code char const * FT_Get_Font_Format(FT_Face face)} */
    public static long nFT_Get_Font_Format(long face) {
        long __functionAddress = Functions.Get_Font_Format;
        return invokePP(face, __functionAddress);
    }

    /** {@code char const * FT_Get_Font_Format(FT_Face face)} */
    @NativeType("char const *")
    public static @Nullable String FT_Get_Font_Format(FT_Face face) {
        long __result = nFT_Get_Font_Format(face.address());
        return memASCIISafe(__result);
    }

    // --- [ FT_Get_Gasp ] ---

    /** {@code FT_Int FT_Get_Gasp(FT_Face face, FT_UInt ppem)} */
    public static int nFT_Get_Gasp(long face, int ppem) {
        long __functionAddress = Functions.Get_Gasp;
        return invokePI(face, ppem, __functionAddress);
    }

    /** {@code FT_Int FT_Get_Gasp(FT_Face face, FT_UInt ppem)} */
    @NativeType("FT_Int")
    public static int FT_Get_Gasp(FT_Face face, @NativeType("FT_UInt") int ppem) {
        return nFT_Get_Gasp(face.address(), ppem);
    }

    // --- [ FT_New_Glyph ] ---

    /** {@code FT_Error FT_New_Glyph(FT_Library library, FT_Glyph_Format format, FT_Glyph * aglyph)} */
    public static int nFT_New_Glyph(long library, int format, long aglyph) {
        long __functionAddress = Functions.New_Glyph;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, format, aglyph, __functionAddress);
    }

    /** {@code FT_Error FT_New_Glyph(FT_Library library, FT_Glyph_Format format, FT_Glyph * aglyph)} */
    @NativeType("FT_Error")
    public static int FT_New_Glyph(@NativeType("FT_Library") long library, @NativeType("FT_Glyph_Format") int format, @NativeType("FT_Glyph *") PointerBuffer aglyph) {
        if (CHECKS) {
            check(aglyph, 1);
        }
        return nFT_New_Glyph(library, format, memAddress(aglyph));
    }

    // --- [ FT_Get_Glyph ] ---

    /** {@code FT_Error FT_Get_Glyph(FT_GlyphSlot slot, FT_Glyph * aglyph)} */
    public static int nFT_Get_Glyph(long slot, long aglyph) {
        long __functionAddress = Functions.Get_Glyph;
        return invokePPI(slot, aglyph, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Glyph(FT_GlyphSlot slot, FT_Glyph * aglyph)} */
    @NativeType("FT_Error")
    public static int FT_Get_Glyph(FT_GlyphSlot slot, @NativeType("FT_Glyph *") PointerBuffer aglyph) {
        if (CHECKS) {
            check(aglyph, 1);
        }
        return nFT_Get_Glyph(slot.address(), memAddress(aglyph));
    }

    // --- [ FT_Glyph_Copy ] ---

    /** {@code FT_Error FT_Glyph_Copy(FT_Glyph source, FT_Glyph * target)} */
    public static int nFT_Glyph_Copy(long source, long target) {
        long __functionAddress = Functions.Glyph_Copy;
        return invokePPI(source, target, __functionAddress);
    }

    /** {@code FT_Error FT_Glyph_Copy(FT_Glyph source, FT_Glyph * target)} */
    @NativeType("FT_Error")
    public static int FT_Glyph_Copy(FT_Glyph source, @NativeType("FT_Glyph *") PointerBuffer target) {
        if (CHECKS) {
            check(target, 1);
        }
        return nFT_Glyph_Copy(source.address(), memAddress(target));
    }

    // --- [ FT_Glyph_Transform ] ---

    /** {@code FT_Error FT_Glyph_Transform(FT_Glyph glyph, FT_Matrix const * matrix, FT_Vector const * delta)} */
    public static int nFT_Glyph_Transform(long glyph, long matrix, long delta) {
        long __functionAddress = Functions.Glyph_Transform;
        return invokePPPI(glyph, matrix, delta, __functionAddress);
    }

    /** {@code FT_Error FT_Glyph_Transform(FT_Glyph glyph, FT_Matrix const * matrix, FT_Vector const * delta)} */
    @NativeType("FT_Error")
    public static int FT_Glyph_Transform(FT_Glyph glyph, @NativeType("FT_Matrix const *") @Nullable FT_Matrix matrix, @NativeType("FT_Vector const *") @Nullable FT_Vector delta) {
        return nFT_Glyph_Transform(glyph.address(), memAddressSafe(matrix), memAddressSafe(delta));
    }

    // --- [ FT_Glyph_Get_CBox ] ---

    /** {@code void FT_Glyph_Get_CBox(FT_Glyph glyph, FT_UInt bbox_mode, FT_BBox * acbox)} */
    public static void nFT_Glyph_Get_CBox(long glyph, int bbox_mode, long acbox) {
        long __functionAddress = Functions.Glyph_Get_CBox;
        invokePPV(glyph, bbox_mode, acbox, __functionAddress);
    }

    /** {@code void FT_Glyph_Get_CBox(FT_Glyph glyph, FT_UInt bbox_mode, FT_BBox * acbox)} */
    public static void FT_Glyph_Get_CBox(FT_Glyph glyph, @NativeType("FT_UInt") int bbox_mode, @NativeType("FT_BBox *") FT_BBox acbox) {
        nFT_Glyph_Get_CBox(glyph.address(), bbox_mode, acbox.address());
    }

    // --- [ FT_Glyph_To_Bitmap ] ---

    /** {@code FT_Error FT_Glyph_To_Bitmap(FT_Glyph * the_glyph, FT_Render_Mode render_mode, FT_Vector const * origin, FT_Bool destroy)} */
    public static int nFT_Glyph_To_Bitmap(long the_glyph, int render_mode, long origin, boolean destroy) {
        long __functionAddress = Functions.Glyph_To_Bitmap;
        return invokePPI(the_glyph, render_mode, origin, destroy, __functionAddress);
    }

    /** {@code FT_Error FT_Glyph_To_Bitmap(FT_Glyph * the_glyph, FT_Render_Mode render_mode, FT_Vector const * origin, FT_Bool destroy)} */
    @NativeType("FT_Error")
    public static int FT_Glyph_To_Bitmap(@NativeType("FT_Glyph *") PointerBuffer the_glyph, @NativeType("FT_Render_Mode") int render_mode, @NativeType("FT_Vector const *") @Nullable FT_Vector origin, @NativeType("FT_Bool") boolean destroy) {
        if (CHECKS) {
            check(the_glyph, 1);
        }
        return nFT_Glyph_To_Bitmap(memAddress(the_glyph), render_mode, memAddressSafe(origin), destroy);
    }

    // --- [ FT_Done_Glyph ] ---

    /** {@code void FT_Done_Glyph(FT_Glyph glyph)} */
    public static void nFT_Done_Glyph(long glyph) {
        long __functionAddress = Functions.Done_Glyph;
        invokePV(glyph, __functionAddress);
    }

    /** {@code void FT_Done_Glyph(FT_Glyph glyph)} */
    public static void FT_Done_Glyph(@NativeType("FT_Glyph") @Nullable FT_Glyph glyph) {
        nFT_Done_Glyph(memAddressSafe(glyph));
    }

    // --- [ FT_Matrix_Multiply ] ---

    /** {@code void FT_Matrix_Multiply(FT_Matrix const * a, FT_Matrix * b)} */
    public static void nFT_Matrix_Multiply(long a, long b) {
        long __functionAddress = Functions.Matrix_Multiply;
        invokePPV(a, b, __functionAddress);
    }

    /** {@code void FT_Matrix_Multiply(FT_Matrix const * a, FT_Matrix * b)} */
    public static void FT_Matrix_Multiply(@NativeType("FT_Matrix const *") FT_Matrix a, @NativeType("FT_Matrix *") FT_Matrix b) {
        nFT_Matrix_Multiply(a.address(), b.address());
    }

    // --- [ FT_Matrix_Invert ] ---

    /** {@code FT_Error FT_Matrix_Invert(FT_Matrix * matrix)} */
    public static int nFT_Matrix_Invert(long matrix) {
        long __functionAddress = Functions.Matrix_Invert;
        return invokePI(matrix, __functionAddress);
    }

    /** {@code FT_Error FT_Matrix_Invert(FT_Matrix * matrix)} */
    @NativeType("FT_Error")
    public static int FT_Matrix_Invert(@NativeType("FT_Matrix *") FT_Matrix matrix) {
        return nFT_Matrix_Invert(matrix.address());
    }

    // --- [ FT_TrueTypeGX_Validate ] ---

    /** {@code FT_Error FT_TrueTypeGX_Validate(FT_Face face, FT_UInt validation_flags, FT_Bytes * tables, FT_UInt table_length)} */
    public static int nFT_TrueTypeGX_Validate(long face, int validation_flags, long tables, int table_length) {
        long __functionAddress = Functions.TrueTypeGX_Validate;
        return invokePPI(face, validation_flags, tables, table_length, __functionAddress);
    }

    /** {@code FT_Error FT_TrueTypeGX_Validate(FT_Face face, FT_UInt validation_flags, FT_Bytes * tables, FT_UInt table_length)} */
    @NativeType("FT_Error")
    public static int FT_TrueTypeGX_Validate(FT_Face face, @NativeType("FT_UInt") int validation_flags, @NativeType("FT_Bytes *") PointerBuffer tables) {
        return nFT_TrueTypeGX_Validate(face.address(), validation_flags, memAddress(tables), tables.remaining());
    }

    // --- [ FT_TrueTypeGX_Free ] ---

    /** {@code void FT_TrueTypeGX_Free(FT_Face face, FT_Bytes table)} */
    public static void nFT_TrueTypeGX_Free(long face, long table) {
        long __functionAddress = Functions.TrueTypeGX_Free;
        invokePPV(face, table, __functionAddress);
    }

    /** {@code void FT_TrueTypeGX_Free(FT_Face face, FT_Bytes table)} */
    public static void FT_TrueTypeGX_Free(FT_Face face, @NativeType("FT_Bytes") ByteBuffer table) {
        nFT_TrueTypeGX_Free(face.address(), memAddress(table));
    }

    // --- [ FT_ClassicKern_Validate ] ---

    /** {@code FT_Error FT_ClassicKern_Validate(FT_Face face, FT_UInt validation_flags, FT_Bytes * ckern_table)} */
    public static int nFT_ClassicKern_Validate(long face, int validation_flags, long ckern_table) {
        long __functionAddress = Functions.ClassicKern_Validate;
        return invokePPI(face, validation_flags, ckern_table, __functionAddress);
    }

    /** {@code FT_Error FT_ClassicKern_Validate(FT_Face face, FT_UInt validation_flags, FT_Bytes * ckern_table)} */
    @NativeType("FT_Error")
    public static int FT_ClassicKern_Validate(FT_Face face, @NativeType("FT_UInt") int validation_flags, @NativeType("FT_Bytes *") PointerBuffer ckern_table) {
        if (CHECKS) {
            check(ckern_table, 1);
        }
        return nFT_ClassicKern_Validate(face.address(), validation_flags, memAddress(ckern_table));
    }

    // --- [ FT_ClassicKern_Free ] ---

    /** {@code void FT_ClassicKern_Free(FT_Face face, FT_Bytes table)} */
    public static void nFT_ClassicKern_Free(long face, long table) {
        long __functionAddress = Functions.ClassicKern_Free;
        invokePPV(face, table, __functionAddress);
    }

    /** {@code void FT_ClassicKern_Free(FT_Face face, FT_Bytes table)} */
    public static void FT_ClassicKern_Free(FT_Face face, @NativeType("FT_Bytes") ByteBuffer table) {
        nFT_ClassicKern_Free(face.address(), memAddress(table));
    }

    // --- [ FT_Stream_OpenGzip ] ---

    /** {@code FT_Error FT_Stream_OpenGzip(FT_Stream stream, FT_Stream source)} */
    public static int nFT_Stream_OpenGzip(long stream, long source) {
        long __functionAddress = Functions.Stream_OpenGzip;
        return invokePPI(stream, source, __functionAddress);
    }

    /** {@code FT_Error FT_Stream_OpenGzip(FT_Stream stream, FT_Stream source)} */
    @NativeType("FT_Error")
    public static int FT_Stream_OpenGzip(FT_Stream stream, FT_Stream source) {
        return nFT_Stream_OpenGzip(stream.address(), source.address());
    }

    // --- [ FT_Gzip_Uncompress ] ---

    /** {@code FT_Error FT_Gzip_Uncompress(FT_Memory memory, FT_Byte * output, FT_ULong * output_len, FT_Byte const * input, FT_ULong input_len)} */
    public static int nFT_Gzip_Uncompress(long memory, long output, long output_len, long input, long input_len) {
        long __functionAddress = Functions.Gzip_Uncompress;
        return invokePPPPNI(memory, output, output_len, input, input_len, __functionAddress);
    }

    /** {@code FT_Error FT_Gzip_Uncompress(FT_Memory memory, FT_Byte * output, FT_ULong * output_len, FT_Byte const * input, FT_ULong input_len)} */
    @NativeType("FT_Error")
    public static int FT_Gzip_Uncompress(FT_Memory memory, @NativeType("FT_Byte *") ByteBuffer output, @NativeType("FT_ULong *") CLongBuffer output_len, @NativeType("FT_Byte const *") ByteBuffer input) {
        if (CHECKS) {
            check(output_len, 1);
            check(output, output_len.get(output_len.position()));
        }
        return nFT_Gzip_Uncompress(memory.address(), memAddress(output), memAddress(output_len), memAddress(input), input.remaining());
    }

    // --- [ FT_Library_SetLcdFilter ] ---

    /** {@code FT_Error FT_Library_SetLcdFilter(FT_Library library, FT_LcdFilter filter)} */
    @NativeType("FT_Error")
    public static int FT_Library_SetLcdFilter(@NativeType("FT_Library") long library, @NativeType("FT_LcdFilter") int filter) {
        long __functionAddress = Functions.Library_SetLcdFilter;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, filter, __functionAddress);
    }

    // --- [ FT_Library_SetLcdFilterWeights ] ---

    /** {@code FT_Error FT_Library_SetLcdFilterWeights(FT_Library library, unsigned char * weights)} */
    public static int nFT_Library_SetLcdFilterWeights(long library, long weights) {
        long __functionAddress = Functions.Library_SetLcdFilterWeights;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, weights, __functionAddress);
    }

    /** {@code FT_Error FT_Library_SetLcdFilterWeights(FT_Library library, unsigned char * weights)} */
    @NativeType("FT_Error")
    public static int FT_Library_SetLcdFilterWeights(@NativeType("FT_Library") long library, @NativeType("unsigned char *") ByteBuffer weights) {
        if (CHECKS) {
            check(weights, 5);
        }
        return nFT_Library_SetLcdFilterWeights(library, memAddress(weights));
    }

    // --- [ FT_Library_SetLcdGeometry ] ---

    /** {@code FT_Error FT_Library_SetLcdGeometry(FT_Library library, FT_Vector * sub)} */
    public static int nFT_Library_SetLcdGeometry(long library, long sub) {
        long __functionAddress = Functions.Library_SetLcdGeometry;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, sub, __functionAddress);
    }

    /** {@code FT_Error FT_Library_SetLcdGeometry(FT_Library library, FT_Vector * sub)} */
    @NativeType("FT_Error")
    public static int FT_Library_SetLcdGeometry(@NativeType("FT_Library") long library, @NativeType("FT_Vector *") FT_Vector.Buffer sub) {
        if (CHECKS) {
            check(sub, 3);
        }
        return nFT_Library_SetLcdGeometry(library, sub.address());
    }

    // --- [ FT_List_Find ] ---

    /** {@code FT_ListNode FT_List_Find(FT_List list, void * data)} */
    public static long nFT_List_Find(long list, long data) {
        long __functionAddress = Functions.List_Find;
        if (CHECKS) {
            check(data);
        }
        return invokePPP(list, data, __functionAddress);
    }

    /** {@code FT_ListNode FT_List_Find(FT_List list, void * data)} */
    @NativeType("FT_ListNode")
    public static @Nullable FT_ListNode FT_List_Find(FT_List list, @NativeType("void *") long data) {
        long __result = nFT_List_Find(list.address(), data);
        return FT_ListNode.createSafe(__result);
    }

    // --- [ FT_List_Add ] ---

    /** {@code void FT_List_Add(FT_List list, FT_ListNode node)} */
    public static void nFT_List_Add(long list, long node) {
        long __functionAddress = Functions.List_Add;
        invokePPV(list, node, __functionAddress);
    }

    /** {@code void FT_List_Add(FT_List list, FT_ListNode node)} */
    public static void FT_List_Add(FT_List list, FT_ListNode node) {
        nFT_List_Add(list.address(), node.address());
    }

    // --- [ FT_List_Insert ] ---

    /** {@code void FT_List_Insert(FT_List list, FT_ListNode node)} */
    public static void nFT_List_Insert(long list, long node) {
        long __functionAddress = Functions.List_Insert;
        invokePPV(list, node, __functionAddress);
    }

    /** {@code void FT_List_Insert(FT_List list, FT_ListNode node)} */
    public static void FT_List_Insert(FT_List list, FT_ListNode node) {
        nFT_List_Insert(list.address(), node.address());
    }

    // --- [ FT_List_Remove ] ---

    /** {@code void FT_List_Remove(FT_List list, FT_ListNode node)} */
    public static void nFT_List_Remove(long list, long node) {
        long __functionAddress = Functions.List_Remove;
        invokePPV(list, node, __functionAddress);
    }

    /** {@code void FT_List_Remove(FT_List list, FT_ListNode node)} */
    public static void FT_List_Remove(FT_List list, FT_ListNode node) {
        nFT_List_Remove(list.address(), node.address());
    }

    // --- [ FT_List_Up ] ---

    /** {@code void FT_List_Up(FT_List list, FT_ListNode node)} */
    public static void nFT_List_Up(long list, long node) {
        long __functionAddress = Functions.List_Up;
        invokePPV(list, node, __functionAddress);
    }

    /** {@code void FT_List_Up(FT_List list, FT_ListNode node)} */
    public static void FT_List_Up(FT_List list, FT_ListNode node) {
        nFT_List_Up(list.address(), node.address());
    }

    // --- [ FT_List_Iterate ] ---

    /** {@code FT_Error FT_List_Iterate(FT_List list, FT_List_Iterator iterator, void * user)} */
    public static int nFT_List_Iterate(long list, long iterator, long user) {
        long __functionAddress = Functions.List_Iterate;
        return invokePPPI(list, iterator, user, __functionAddress);
    }

    /** {@code FT_Error FT_List_Iterate(FT_List list, FT_List_Iterator iterator, void * user)} */
    @NativeType("FT_Error")
    public static int FT_List_Iterate(FT_List list, @NativeType("FT_List_Iterator") FT_List_IteratorI iterator, @NativeType("void *") long user) {
        return nFT_List_Iterate(list.address(), iterator.address(), user);
    }

    // --- [ FT_List_Finalize ] ---

    /** {@code void FT_List_Finalize(FT_List list, FT_List_Destructor destroy, FT_Memory memory, void * user)} */
    public static void nFT_List_Finalize(long list, long destroy, long memory, long user) {
        long __functionAddress = Functions.List_Finalize;
        invokePPPPV(list, destroy, memory, user, __functionAddress);
    }

    /** {@code void FT_List_Finalize(FT_List list, FT_List_Destructor destroy, FT_Memory memory, void * user)} */
    public static void FT_List_Finalize(FT_List list, @NativeType("FT_List_Destructor") @Nullable FT_List_DestructorI destroy, FT_Memory memory, @NativeType("void *") long user) {
        nFT_List_Finalize(list.address(), memAddressSafe(destroy), memory.address(), user);
    }

    // --- [ FT_Stream_OpenLZW ] ---

    /** {@code FT_Error FT_Stream_OpenLZW(FT_Stream stream, FT_Stream source)} */
    public static int nFT_Stream_OpenLZW(long stream, long source) {
        long __functionAddress = Functions.Stream_OpenLZW;
        return invokePPI(stream, source, __functionAddress);
    }

    /** {@code FT_Error FT_Stream_OpenLZW(FT_Stream stream, FT_Stream source)} */
    @NativeType("FT_Error")
    public static int FT_Stream_OpenLZW(FT_Stream stream, FT_Stream source) {
        return nFT_Stream_OpenLZW(stream.address(), source.address());
    }

    // --- [ FT_Get_Multi_Master ] ---

    /** {@code FT_Error FT_Get_Multi_Master(FT_Face face, FT_Multi_Master * amaster)} */
    public static int nFT_Get_Multi_Master(long face, long amaster) {
        long __functionAddress = Functions.Get_Multi_Master;
        return invokePPI(face, amaster, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Multi_Master(FT_Face face, FT_Multi_Master * amaster)} */
    @NativeType("FT_Error")
    public static int FT_Get_Multi_Master(FT_Face face, @NativeType("FT_Multi_Master *") FT_Multi_Master amaster) {
        return nFT_Get_Multi_Master(face.address(), amaster.address());
    }

    // --- [ FT_Get_MM_Var ] ---

    /** {@code FT_Error FT_Get_MM_Var(FT_Face face, FT_MM_Var ** amaster)} */
    public static int nFT_Get_MM_Var(long face, long amaster) {
        long __functionAddress = Functions.Get_MM_Var;
        return invokePPI(face, amaster, __functionAddress);
    }

    /** {@code FT_Error FT_Get_MM_Var(FT_Face face, FT_MM_Var ** amaster)} */
    @NativeType("FT_Error")
    public static int FT_Get_MM_Var(FT_Face face, @NativeType("FT_MM_Var **") PointerBuffer amaster) {
        if (CHECKS) {
            check(amaster, 1);
        }
        return nFT_Get_MM_Var(face.address(), memAddress(amaster));
    }

    // --- [ FT_Done_MM_Var ] ---

    /** {@code FT_Error FT_Done_MM_Var(FT_Library library, FT_MM_Var * amaster)} */
    public static int nFT_Done_MM_Var(long library, long amaster) {
        long __functionAddress = Functions.Done_MM_Var;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, amaster, __functionAddress);
    }

    /** {@code FT_Error FT_Done_MM_Var(FT_Library library, FT_MM_Var * amaster)} */
    @NativeType("FT_Error")
    public static int FT_Done_MM_Var(@NativeType("FT_Library") long library, @NativeType("FT_MM_Var *") FT_MM_Var amaster) {
        return nFT_Done_MM_Var(library, amaster.address());
    }

    // --- [ FT_Set_MM_Design_Coordinates ] ---

    /** {@code FT_Error FT_Set_MM_Design_Coordinates(FT_Face face, FT_UInt num_coords, FT_Long * coords)} */
    public static int nFT_Set_MM_Design_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_MM_Design_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Set_MM_Design_Coordinates(FT_Face face, FT_UInt num_coords, FT_Long * coords)} */
    @NativeType("FT_Error")
    public static int FT_Set_MM_Design_Coordinates(FT_Face face, @NativeType("FT_Long *") CLongBuffer coords) {
        return nFT_Set_MM_Design_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_Var_Design_Coordinates ] ---

    /** {@code FT_Error FT_Set_Var_Design_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    public static int nFT_Set_Var_Design_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_Var_Design_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Var_Design_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    @NativeType("FT_Error")
    public static int FT_Set_Var_Design_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Set_Var_Design_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Get_Var_Design_Coordinates ] ---

    /** {@code FT_Error FT_Get_Var_Design_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    public static int nFT_Get_Var_Design_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Get_Var_Design_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Var_Design_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    @NativeType("FT_Error")
    public static int FT_Get_Var_Design_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Get_Var_Design_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_MM_Blend_Coordinates ] ---

    /** {@code FT_Error FT_Set_MM_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    public static int nFT_Set_MM_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_MM_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Set_MM_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    @NativeType("FT_Error")
    public static int FT_Set_MM_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Set_MM_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Get_MM_Blend_Coordinates ] ---

    /** {@code FT_Error FT_Get_MM_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    public static int nFT_Get_MM_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Get_MM_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Get_MM_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    @NativeType("FT_Error")
    public static int FT_Get_MM_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Get_MM_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_Var_Blend_Coordinates ] ---

    /** {@code FT_Error FT_Set_Var_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    public static int nFT_Set_Var_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_Var_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Var_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    @NativeType("FT_Error")
    public static int FT_Set_Var_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Set_Var_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Get_Var_Blend_Coordinates ] ---

    /** {@code FT_Error FT_Get_Var_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    public static int nFT_Get_Var_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Get_Var_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Var_Blend_Coordinates(FT_Face face, FT_UInt num_coords, FT_Fixed * coords)} */
    @NativeType("FT_Error")
    public static int FT_Get_Var_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Get_Var_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_MM_WeightVector ] ---

    /** {@code FT_Error FT_Set_MM_WeightVector(FT_Face face, FT_UInt len, FT_Fixed * weightvector)} */
    public static int nFT_Set_MM_WeightVector(long face, int len, long weightvector) {
        long __functionAddress = Functions.Set_MM_WeightVector;
        return invokePPI(face, len, weightvector, __functionAddress);
    }

    /** {@code FT_Error FT_Set_MM_WeightVector(FT_Face face, FT_UInt len, FT_Fixed * weightvector)} */
    @NativeType("FT_Error")
    public static int FT_Set_MM_WeightVector(FT_Face face, @NativeType("FT_Fixed *") @Nullable CLongBuffer weightvector) {
        return nFT_Set_MM_WeightVector(face.address(), remainingSafe(weightvector), memAddressSafe(weightvector));
    }

    // --- [ FT_Get_MM_WeightVector ] ---

    /** {@code FT_Error FT_Get_MM_WeightVector(FT_Face face, FT_UInt * len, FT_Fixed * weightvector)} */
    public static int nFT_Get_MM_WeightVector(long face, long len, long weightvector) {
        long __functionAddress = Functions.Get_MM_WeightVector;
        return invokePPPI(face, len, weightvector, __functionAddress);
    }

    /** {@code FT_Error FT_Get_MM_WeightVector(FT_Face face, FT_UInt * len, FT_Fixed * weightvector)} */
    @NativeType("FT_Error")
    public static int FT_Get_MM_WeightVector(FT_Face face, @NativeType("FT_UInt *") IntBuffer len, @NativeType("FT_Fixed *") CLongBuffer weightvector) {
        if (CHECKS) {
            check(len, 1);
            check(weightvector, len.get(len.position()));
        }
        return nFT_Get_MM_WeightVector(face.address(), memAddress(len), memAddress(weightvector));
    }

    // --- [ FT_Get_Var_Axis_Flags ] ---

    /** {@code FT_Error FT_Get_Var_Axis_Flags(FT_MM_Var * master, FT_UInt axis_index, FT_UInt * flags)} */
    public static int nFT_Get_Var_Axis_Flags(long master, int axis_index, long flags) {
        long __functionAddress = Functions.Get_Var_Axis_Flags;
        return invokePPI(master, axis_index, flags, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Var_Axis_Flags(FT_MM_Var * master, FT_UInt axis_index, FT_UInt * flags)} */
    @NativeType("FT_Error")
    public static int FT_Get_Var_Axis_Flags(@NativeType("FT_MM_Var *") FT_MM_Var master, @NativeType("FT_UInt") int axis_index, @NativeType("FT_UInt *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nFT_Get_Var_Axis_Flags(master.address(), axis_index, memAddress(flags));
    }

    // --- [ FT_Set_Named_Instance ] ---

    /** {@code FT_Error FT_Set_Named_Instance(FT_Face face, FT_UInt instance_index)} */
    public static int nFT_Set_Named_Instance(long face, int instance_index) {
        long __functionAddress = Functions.Set_Named_Instance;
        return invokePI(face, instance_index, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Named_Instance(FT_Face face, FT_UInt instance_index)} */
    @NativeType("FT_Error")
    public static int FT_Set_Named_Instance(FT_Face face, @NativeType("FT_UInt") int instance_index) {
        return nFT_Set_Named_Instance(face.address(), instance_index);
    }

    // --- [ FT_Get_Default_Named_Instance ] ---

    /** {@code FT_Error FT_Get_Default_Named_Instance(FT_Face face, FT_UInt * instance_index)} */
    public static int nFT_Get_Default_Named_Instance(long face, long instance_index) {
        long __functionAddress = Functions.Get_Default_Named_Instance;
        return invokePPI(face, instance_index, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Default_Named_Instance(FT_Face face, FT_UInt * instance_index)} */
    @NativeType("FT_Error")
    public static int FT_Get_Default_Named_Instance(FT_Face face, @NativeType("FT_UInt *") IntBuffer instance_index) {
        if (CHECKS) {
            check(instance_index, 1);
        }
        return nFT_Get_Default_Named_Instance(face.address(), memAddress(instance_index));
    }

    // --- [ FT_Add_Module ] ---

    /** {@code FT_Error FT_Add_Module(FT_Library library, FT_Module_Class const * clazz)} */
    public static int nFT_Add_Module(long library, long clazz) {
        long __functionAddress = Functions.Add_Module;
        if (CHECKS) {
            check(library);
            FT_Module_Class.validate(clazz);
        }
        return invokePPI(library, clazz, __functionAddress);
    }

    /** {@code FT_Error FT_Add_Module(FT_Library library, FT_Module_Class const * clazz)} */
    @NativeType("FT_Error")
    public static int FT_Add_Module(@NativeType("FT_Library") long library, @NativeType("FT_Module_Class const *") FT_Module_Class clazz) {
        return nFT_Add_Module(library, clazz.address());
    }

    // --- [ FT_Get_Module ] ---

    /** {@code FT_Module FT_Get_Module(FT_Library library, char const * module_name)} */
    public static long nFT_Get_Module(long library, long module_name) {
        long __functionAddress = Functions.Get_Module;
        if (CHECKS) {
            check(library);
        }
        return invokePPP(library, module_name, __functionAddress);
    }

    /** {@code FT_Module FT_Get_Module(FT_Library library, char const * module_name)} */
    @NativeType("FT_Module")
    public static long FT_Get_Module(@NativeType("FT_Library") long library, @NativeType("char const *") ByteBuffer module_name) {
        if (CHECKS) {
            checkNT1(module_name);
        }
        return nFT_Get_Module(library, memAddress(module_name));
    }

    /** {@code FT_Module FT_Get_Module(FT_Library library, char const * module_name)} */
    @NativeType("FT_Module")
    public static long FT_Get_Module(@NativeType("FT_Library") long library, @NativeType("char const *") CharSequence module_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(module_name, true);
            long module_nameEncoded = stack.getPointerAddress();
            return nFT_Get_Module(library, module_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_Remove_Module ] ---

    /** {@code FT_Error FT_Remove_Module(FT_Library library, FT_Module module)} */
    @NativeType("FT_Error")
    public static int FT_Remove_Module(@NativeType("FT_Library") long library, @NativeType("FT_Module") long module) {
        long __functionAddress = Functions.Remove_Module;
        if (CHECKS) {
            check(library);
            check(module);
        }
        return invokePPI(library, module, __functionAddress);
    }

    // --- [ FT_Property_Set ] ---

    /** {@code FT_Error FT_Property_Set(FT_Library library, FT_String const * module_name, FT_String const * property_name, void const * value)} */
    public static int nFT_Property_Set(long library, long module_name, long property_name, long value) {
        long __functionAddress = Functions.Property_Set;
        if (CHECKS) {
            check(library);
        }
        return invokePPPPI(library, module_name, property_name, value, __functionAddress);
    }

    /** {@code FT_Error FT_Property_Set(FT_Library library, FT_String const * module_name, FT_String const * property_name, void const * value)} */
    @NativeType("FT_Error")
    public static int FT_Property_Set(@NativeType("FT_Library") long library, @NativeType("FT_String const *") ByteBuffer module_name, @NativeType("FT_String const *") ByteBuffer property_name, @NativeType("void const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(module_name);
            checkNT1(property_name);
        }
        return nFT_Property_Set(library, memAddress(module_name), memAddress(property_name), memAddress(value));
    }

    /** {@code FT_Error FT_Property_Set(FT_Library library, FT_String const * module_name, FT_String const * property_name, void const * value)} */
    @NativeType("FT_Error")
    public static int FT_Property_Set(@NativeType("FT_Library") long library, @NativeType("FT_String const *") CharSequence module_name, @NativeType("FT_String const *") CharSequence property_name, @NativeType("void const *") ByteBuffer value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(module_name, true);
            long module_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(property_name, true);
            long property_nameEncoded = stack.getPointerAddress();
            return nFT_Property_Set(library, module_nameEncoded, property_nameEncoded, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_Property_Get ] ---

    /** {@code FT_Error FT_Property_Get(FT_Library library, FT_String const * module_name, FT_String const * property_name, void * value)} */
    public static int nFT_Property_Get(long library, long module_name, long property_name, long value) {
        long __functionAddress = Functions.Property_Get;
        if (CHECKS) {
            check(library);
        }
        return invokePPPPI(library, module_name, property_name, value, __functionAddress);
    }

    /** {@code FT_Error FT_Property_Get(FT_Library library, FT_String const * module_name, FT_String const * property_name, void * value)} */
    @NativeType("FT_Error")
    public static int FT_Property_Get(@NativeType("FT_Library") long library, @NativeType("FT_String const *") ByteBuffer module_name, @NativeType("FT_String const *") ByteBuffer property_name, @NativeType("void *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(module_name);
            checkNT1(property_name);
        }
        return nFT_Property_Get(library, memAddress(module_name), memAddress(property_name), memAddress(value));
    }

    /** {@code FT_Error FT_Property_Get(FT_Library library, FT_String const * module_name, FT_String const * property_name, void * value)} */
    @NativeType("FT_Error")
    public static int FT_Property_Get(@NativeType("FT_Library") long library, @NativeType("FT_String const *") CharSequence module_name, @NativeType("FT_String const *") CharSequence property_name, @NativeType("void *") ByteBuffer value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(module_name, true);
            long module_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(property_name, true);
            long property_nameEncoded = stack.getPointerAddress();
            return nFT_Property_Get(library, module_nameEncoded, property_nameEncoded, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FT_Set_Default_Properties ] ---

    /** {@code void FT_Set_Default_Properties(FT_Library library)} */
    public static void FT_Set_Default_Properties(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Set_Default_Properties;
        if (CHECKS) {
            check(library);
        }
        invokePV(library, __functionAddress);
    }

    // --- [ FT_Reference_Library ] ---

    /** {@code FT_Error FT_Reference_Library(FT_Library library)} */
    @NativeType("FT_Error")
    public static int FT_Reference_Library(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Reference_Library;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_New_Library ] ---

    /** {@code FT_Error FT_New_Library(FT_Memory memory, FT_Library * alibrary)} */
    public static int nFT_New_Library(long memory, long alibrary) {
        long __functionAddress = Functions.New_Library;
        return invokePPI(memory, alibrary, __functionAddress);
    }

    /** {@code FT_Error FT_New_Library(FT_Memory memory, FT_Library * alibrary)} */
    @NativeType("FT_Error")
    public static int FT_New_Library(FT_Memory memory, @NativeType("FT_Library *") PointerBuffer alibrary) {
        if (CHECKS) {
            check(alibrary, 1);
        }
        return nFT_New_Library(memory.address(), memAddress(alibrary));
    }

    // --- [ FT_Done_Library ] ---

    /** {@code FT_Error FT_Done_Library(FT_Library library)} */
    @NativeType("FT_Error")
    public static int FT_Done_Library(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Done_Library;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_Set_Debug_Hook ] ---

    /** {@code void FT_Set_Debug_Hook(FT_Library library, FT_UInt hook_index, FT_DebugHook_Func debug_hook)} */
    public static void nFT_Set_Debug_Hook(long library, int hook_index, long debug_hook) {
        long __functionAddress = Functions.Set_Debug_Hook;
        if (CHECKS) {
            check(library);
        }
        invokePPV(library, hook_index, debug_hook, __functionAddress);
    }

    /** {@code void FT_Set_Debug_Hook(FT_Library library, FT_UInt hook_index, FT_DebugHook_Func debug_hook)} */
    public static void FT_Set_Debug_Hook(@NativeType("FT_Library") long library, @NativeType("FT_UInt") int hook_index, @NativeType("FT_DebugHook_Func") @Nullable FT_DebugHook_FuncI debug_hook) {
        nFT_Set_Debug_Hook(library, hook_index, memAddressSafe(debug_hook));
    }

    // --- [ FT_Add_Default_Modules ] ---

    /** {@code void FT_Add_Default_Modules(FT_Library library)} */
    public static void FT_Add_Default_Modules(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Add_Default_Modules;
        if (CHECKS) {
            check(library);
        }
        invokePV(library, __functionAddress);
    }

    // --- [ FT_Get_TrueType_Engine_Type ] ---

    /** {@code FT_TrueTypeEngineType FT_Get_TrueType_Engine_Type(FT_Library library)} */
    @NativeType("FT_TrueTypeEngineType")
    public static int FT_Get_TrueType_Engine_Type(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Get_TrueType_Engine_Type;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_OpenType_Validate ] ---

    /** {@code FT_Error FT_OpenType_Validate(FT_Face face, FT_UInt validation_flags, FT_Bytes * BASE_table, FT_Bytes * GDEF_table, FT_Bytes * GPOS_table, FT_Bytes * GSUB_table, FT_Bytes * JSTF_table)} */
    public static int nFT_OpenType_Validate(long face, int validation_flags, long BASE_table, long GDEF_table, long GPOS_table, long GSUB_table, long JSTF_table) {
        long __functionAddress = Functions.OpenType_Validate;
        return invokePPPPPPI(face, validation_flags, BASE_table, GDEF_table, GPOS_table, GSUB_table, JSTF_table, __functionAddress);
    }

    /** {@code FT_Error FT_OpenType_Validate(FT_Face face, FT_UInt validation_flags, FT_Bytes * BASE_table, FT_Bytes * GDEF_table, FT_Bytes * GPOS_table, FT_Bytes * GSUB_table, FT_Bytes * JSTF_table)} */
    @NativeType("FT_Error")
    public static int FT_OpenType_Validate(FT_Face face, @NativeType("FT_UInt") int validation_flags, @NativeType("FT_Bytes *") PointerBuffer BASE_table, @NativeType("FT_Bytes *") PointerBuffer GDEF_table, @NativeType("FT_Bytes *") PointerBuffer GPOS_table, @NativeType("FT_Bytes *") PointerBuffer GSUB_table, @NativeType("FT_Bytes *") PointerBuffer JSTF_table) {
        if (CHECKS) {
            check(BASE_table, 1);
            check(GDEF_table, 1);
            check(GPOS_table, 1);
            check(GSUB_table, 1);
            check(JSTF_table, 1);
        }
        return nFT_OpenType_Validate(face.address(), validation_flags, memAddress(BASE_table), memAddress(GDEF_table), memAddress(GPOS_table), memAddress(GSUB_table), memAddress(JSTF_table));
    }

    // --- [ FT_OpenType_Free ] ---

    /** {@code void FT_OpenType_Free(FT_Face face, FT_Bytes table)} */
    public static void nFT_OpenType_Free(long face, long table) {
        long __functionAddress = Functions.OpenType_Free;
        invokePPV(face, table, __functionAddress);
    }

    /** {@code void FT_OpenType_Free(FT_Face face, FT_Bytes table)} */
    public static void FT_OpenType_Free(FT_Face face, @NativeType("FT_Bytes") ByteBuffer table) {
        nFT_OpenType_Free(face.address(), memAddress(table));
    }

    // --- [ FT_Outline_Decompose ] ---

    /** {@code FT_Error FT_Outline_Decompose(FT_Outline * outline, FT_Outline_Funcs const * func_interface, void * user)} */
    public static int nFT_Outline_Decompose(long outline, long func_interface, long user) {
        long __functionAddress = Functions.Outline_Decompose;
        return invokePPPI(outline, func_interface, user, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Decompose(FT_Outline * outline, FT_Outline_Funcs const * func_interface, void * user)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Decompose(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Outline_Funcs const *") FT_Outline_Funcs func_interface, @NativeType("void *") long user) {
        return nFT_Outline_Decompose(outline.address(), func_interface.address(), user);
    }

    // --- [ FT_Outline_New ] ---

    /** {@code FT_Error FT_Outline_New(FT_Library library, FT_UInt numPoints, FT_Int numContours, FT_Outline * anoutline)} */
    public static int nFT_Outline_New(long library, int numPoints, int numContours, long anoutline) {
        long __functionAddress = Functions.Outline_New;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, numPoints, numContours, anoutline, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_New(FT_Library library, FT_UInt numPoints, FT_Int numContours, FT_Outline * anoutline)} */
    @NativeType("FT_Error")
    public static int FT_Outline_New(@NativeType("FT_Library") long library, @NativeType("FT_UInt") int numPoints, @NativeType("FT_Int") int numContours, @NativeType("FT_Outline *") FT_Outline anoutline) {
        return nFT_Outline_New(library, numPoints, numContours, anoutline.address());
    }

    // --- [ FT_Outline_Done ] ---

    /** {@code FT_Error FT_Outline_Done(FT_Library library, FT_Outline * outline)} */
    public static int nFT_Outline_Done(long library, long outline) {
        long __functionAddress = Functions.Outline_Done;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, outline, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Done(FT_Library library, FT_Outline * outline)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Done(@NativeType("FT_Library") long library, @NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_Done(library, outline.address());
    }

    // --- [ FT_Outline_Check ] ---

    /** {@code FT_Error FT_Outline_Check(FT_Outline * outline)} */
    public static int nFT_Outline_Check(long outline) {
        long __functionAddress = Functions.Outline_Check;
        return invokePI(outline, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Check(FT_Outline * outline)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Check(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_Check(outline.address());
    }

    // --- [ FT_Outline_Get_CBox ] ---

    /** {@code void FT_Outline_Get_CBox(FT_Outline const * outline, FT_BBox * acbox)} */
    public static void nFT_Outline_Get_CBox(long outline, long acbox) {
        long __functionAddress = Functions.Outline_Get_CBox;
        invokePPV(outline, acbox, __functionAddress);
    }

    /** {@code void FT_Outline_Get_CBox(FT_Outline const * outline, FT_BBox * acbox)} */
    public static void FT_Outline_Get_CBox(@NativeType("FT_Outline const *") FT_Outline outline, @NativeType("FT_BBox *") FT_BBox acbox) {
        nFT_Outline_Get_CBox(outline.address(), acbox.address());
    }

    // --- [ FT_Outline_Translate ] ---

    /** {@code void FT_Outline_Translate(FT_Outline const * outline, FT_Pos xOffset, FT_Pos yOffset)} */
    public static void nFT_Outline_Translate(long outline, long xOffset, long yOffset) {
        long __functionAddress = Functions.Outline_Translate;
        invokePNNV(outline, xOffset, yOffset, __functionAddress);
    }

    /** {@code void FT_Outline_Translate(FT_Outline const * outline, FT_Pos xOffset, FT_Pos yOffset)} */
    public static void FT_Outline_Translate(@NativeType("FT_Outline const *") FT_Outline outline, @NativeType("FT_Pos") long xOffset, @NativeType("FT_Pos") long yOffset) {
        nFT_Outline_Translate(outline.address(), xOffset, yOffset);
    }

    // --- [ FT_Outline_Copy ] ---

    /** {@code FT_Error FT_Outline_Copy(FT_Outline const * source, FT_Outline * target)} */
    public static int nFT_Outline_Copy(long source, long target) {
        long __functionAddress = Functions.Outline_Copy;
        return invokePPI(source, target, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Copy(FT_Outline const * source, FT_Outline * target)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Copy(@NativeType("FT_Outline const *") FT_Outline source, @NativeType("FT_Outline *") FT_Outline target) {
        return nFT_Outline_Copy(source.address(), target.address());
    }

    // --- [ FT_Outline_Transform ] ---

    /** {@code void FT_Outline_Transform(FT_Outline const * outline, FT_Matrix const * matrix)} */
    public static void nFT_Outline_Transform(long outline, long matrix) {
        long __functionAddress = Functions.Outline_Transform;
        invokePPV(outline, matrix, __functionAddress);
    }

    /** {@code void FT_Outline_Transform(FT_Outline const * outline, FT_Matrix const * matrix)} */
    public static void FT_Outline_Transform(@NativeType("FT_Outline const *") FT_Outline outline, @NativeType("FT_Matrix const *") FT_Matrix matrix) {
        nFT_Outline_Transform(outline.address(), matrix.address());
    }

    // --- [ FT_Outline_Embolden ] ---

    /** {@code FT_Error FT_Outline_Embolden(FT_Outline * outline, FT_Pos strength)} */
    public static int nFT_Outline_Embolden(long outline, long strength) {
        long __functionAddress = Functions.Outline_Embolden;
        return invokePNI(outline, strength, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Embolden(FT_Outline * outline, FT_Pos strength)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Embolden(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Pos") long strength) {
        return nFT_Outline_Embolden(outline.address(), strength);
    }

    // --- [ FT_Outline_EmboldenXY ] ---

    /** {@code FT_Error FT_Outline_EmboldenXY(FT_Outline * outline, FT_Pos xstrength, FT_Pos ystrength)} */
    public static int nFT_Outline_EmboldenXY(long outline, long xstrength, long ystrength) {
        long __functionAddress = Functions.Outline_EmboldenXY;
        return invokePNNI(outline, xstrength, ystrength, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_EmboldenXY(FT_Outline * outline, FT_Pos xstrength, FT_Pos ystrength)} */
    @NativeType("FT_Error")
    public static int FT_Outline_EmboldenXY(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Pos") long xstrength, @NativeType("FT_Pos") long ystrength) {
        return nFT_Outline_EmboldenXY(outline.address(), xstrength, ystrength);
    }

    // --- [ FT_Outline_Reverse ] ---

    /** {@code void FT_Outline_Reverse(FT_Outline * outline)} */
    public static void nFT_Outline_Reverse(long outline) {
        long __functionAddress = Functions.Outline_Reverse;
        invokePV(outline, __functionAddress);
    }

    /** {@code void FT_Outline_Reverse(FT_Outline * outline)} */
    public static void FT_Outline_Reverse(@NativeType("FT_Outline *") FT_Outline outline) {
        nFT_Outline_Reverse(outline.address());
    }

    // --- [ FT_Outline_Get_Bitmap ] ---

    /** {@code FT_Error FT_Outline_Get_Bitmap(FT_Library library, FT_Outline * outline, FT_Bitmap const * abitmap)} */
    public static int nFT_Outline_Get_Bitmap(long library, long outline, long abitmap) {
        long __functionAddress = Functions.Outline_Get_Bitmap;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, outline, abitmap, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Get_Bitmap(FT_Library library, FT_Outline * outline, FT_Bitmap const * abitmap)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Get_Bitmap(@NativeType("FT_Library") long library, @NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Bitmap const *") FT_Bitmap abitmap) {
        return nFT_Outline_Get_Bitmap(library, outline.address(), abitmap.address());
    }

    // --- [ FT_Outline_Render ] ---

    /** {@code FT_Error FT_Outline_Render(FT_Library library, FT_Outline * outline, FT_Raster_Params * params)} */
    public static int nFT_Outline_Render(long library, long outline, long params) {
        long __functionAddress = Functions.Outline_Render;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, outline, params, __functionAddress);
    }

    /** {@code FT_Error FT_Outline_Render(FT_Library library, FT_Outline * outline, FT_Raster_Params * params)} */
    @NativeType("FT_Error")
    public static int FT_Outline_Render(@NativeType("FT_Library") long library, @NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Raster_Params *") FT_Raster_Params params) {
        return nFT_Outline_Render(library, outline.address(), params.address());
    }

    // --- [ FT_Outline_Get_Orientation ] ---

    /** {@code FT_Orientation FT_Outline_Get_Orientation(FT_Outline * outline)} */
    public static int nFT_Outline_Get_Orientation(long outline) {
        long __functionAddress = Functions.Outline_Get_Orientation;
        return invokePI(outline, __functionAddress);
    }

    /** {@code FT_Orientation FT_Outline_Get_Orientation(FT_Outline * outline)} */
    @NativeType("FT_Orientation")
    public static int FT_Outline_Get_Orientation(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_Get_Orientation(outline.address());
    }

    // --- [ FT_Get_PFR_Metrics ] ---

    /** {@code FT_Error FT_Get_PFR_Metrics(FT_Face face, FT_UInt * aoutline_resolution, FT_UInt * ametrics_resolution, FT_Fixed * ametrics_x_scale, FT_Fixed * ametrics_y_scale)} */
    public static int nFT_Get_PFR_Metrics(long face, long aoutline_resolution, long ametrics_resolution, long ametrics_x_scale, long ametrics_y_scale) {
        long __functionAddress = Functions.Get_PFR_Metrics;
        return invokePPPPPI(face, aoutline_resolution, ametrics_resolution, ametrics_x_scale, ametrics_y_scale, __functionAddress);
    }

    /** {@code FT_Error FT_Get_PFR_Metrics(FT_Face face, FT_UInt * aoutline_resolution, FT_UInt * ametrics_resolution, FT_Fixed * ametrics_x_scale, FT_Fixed * ametrics_y_scale)} */
    @NativeType("FT_Error")
    public static int FT_Get_PFR_Metrics(FT_Face face, @NativeType("FT_UInt *") @Nullable IntBuffer aoutline_resolution, @NativeType("FT_UInt *") @Nullable IntBuffer ametrics_resolution, @NativeType("FT_Fixed *") @Nullable CLongBuffer ametrics_x_scale, @NativeType("FT_Fixed *") @Nullable CLongBuffer ametrics_y_scale) {
        if (CHECKS) {
            checkSafe(aoutline_resolution, 1);
            checkSafe(ametrics_resolution, 1);
            checkSafe(ametrics_x_scale, 1);
            checkSafe(ametrics_y_scale, 1);
        }
        return nFT_Get_PFR_Metrics(face.address(), memAddressSafe(aoutline_resolution), memAddressSafe(ametrics_resolution), memAddressSafe(ametrics_x_scale), memAddressSafe(ametrics_y_scale));
    }

    // --- [ FT_Get_PFR_Kerning ] ---

    /** {@code FT_Error FT_Get_PFR_Kerning(FT_Face face, FT_UInt left, FT_UInt right, FT_Vector * avector)} */
    public static int nFT_Get_PFR_Kerning(long face, int left, int right, long avector) {
        long __functionAddress = Functions.Get_PFR_Kerning;
        return invokePPI(face, left, right, avector, __functionAddress);
    }

    /** {@code FT_Error FT_Get_PFR_Kerning(FT_Face face, FT_UInt left, FT_UInt right, FT_Vector * avector)} */
    @NativeType("FT_Error")
    public static int FT_Get_PFR_Kerning(FT_Face face, @NativeType("FT_UInt") int left, @NativeType("FT_UInt") int right, @NativeType("FT_Vector *") FT_Vector avector) {
        return nFT_Get_PFR_Kerning(face.address(), left, right, avector.address());
    }

    // --- [ FT_Get_PFR_Advance ] ---

    /** {@code FT_Error FT_Get_PFR_Advance(FT_Face face, FT_UInt gindex, FT_Pos * aadvance)} */
    public static int nFT_Get_PFR_Advance(long face, int gindex, long aadvance) {
        long __functionAddress = Functions.Get_PFR_Advance;
        return invokePPI(face, gindex, aadvance, __functionAddress);
    }

    /** {@code FT_Error FT_Get_PFR_Advance(FT_Face face, FT_UInt gindex, FT_Pos * aadvance)} */
    @NativeType("FT_Error")
    public static int FT_Get_PFR_Advance(FT_Face face, @NativeType("FT_UInt") int gindex, @NativeType("FT_Pos *") CLongBuffer aadvance) {
        if (CHECKS) {
            check(aadvance, 1);
        }
        return nFT_Get_PFR_Advance(face.address(), gindex, memAddress(aadvance));
    }

    // --- [ FT_Get_Renderer ] ---

    /** {@code FT_Renderer FT_Get_Renderer(FT_Library library, FT_Glyph_Format format)} */
    @NativeType("FT_Renderer")
    public static long FT_Get_Renderer(@NativeType("FT_Library") long library, @NativeType("FT_Glyph_Format") int format) {
        long __functionAddress = Functions.Get_Renderer;
        if (CHECKS) {
            check(library);
        }
        return invokePP(library, format, __functionAddress);
    }

    // --- [ FT_Set_Renderer ] ---

    /** {@code FT_Error FT_Set_Renderer(FT_Library library, FT_Renderer renderer, FT_UInt num_params, FT_Parameter * parameters)} */
    public static int nFT_Set_Renderer(long library, long renderer, int num_params, long parameters) {
        long __functionAddress = Functions.Set_Renderer;
        if (CHECKS) {
            check(library);
            check(renderer);
        }
        return invokePPPI(library, renderer, num_params, parameters, __functionAddress);
    }

    /** {@code FT_Error FT_Set_Renderer(FT_Library library, FT_Renderer renderer, FT_UInt num_params, FT_Parameter * parameters)} */
    @NativeType("FT_Error")
    public static int FT_Set_Renderer(@NativeType("FT_Library") long library, @NativeType("FT_Renderer") long renderer, @NativeType("FT_Parameter *") FT_Parameter.Buffer parameters) {
        return nFT_Set_Renderer(library, renderer, parameters.remaining(), parameters.address());
    }

    // --- [ FT_New_Size ] ---

    /** {@code FT_Error FT_New_Size(FT_Face face, FT_Size * size)} */
    public static int nFT_New_Size(long face, long size) {
        long __functionAddress = Functions.New_Size;
        return invokePPI(face, size, __functionAddress);
    }

    /** {@code FT_Error FT_New_Size(FT_Face face, FT_Size * size)} */
    @NativeType("FT_Error")
    public static int FT_New_Size(FT_Face face, @NativeType("FT_Size *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nFT_New_Size(face.address(), memAddress(size));
    }

    // --- [ FT_Done_Size ] ---

    /** {@code FT_Error FT_Done_Size(FT_Size size)} */
    public static int nFT_Done_Size(long size) {
        long __functionAddress = Functions.Done_Size;
        return invokePI(size, __functionAddress);
    }

    /** {@code FT_Error FT_Done_Size(FT_Size size)} */
    @NativeType("FT_Error")
    public static int FT_Done_Size(FT_Size size) {
        return nFT_Done_Size(size.address());
    }

    // --- [ FT_Activate_Size ] ---

    /** {@code FT_Error FT_Activate_Size(FT_Size size)} */
    public static int nFT_Activate_Size(long size) {
        long __functionAddress = Functions.Activate_Size;
        return invokePI(size, __functionAddress);
    }

    /** {@code FT_Error FT_Activate_Size(FT_Size size)} */
    @NativeType("FT_Error")
    public static int FT_Activate_Size(FT_Size size) {
        return nFT_Activate_Size(size.address());
    }

    // --- [ FT_Get_Sfnt_Name_Count ] ---

    /** {@code FT_UInt FT_Get_Sfnt_Name_Count(FT_Face face)} */
    public static int nFT_Get_Sfnt_Name_Count(long face) {
        long __functionAddress = Functions.Get_Sfnt_Name_Count;
        return invokePI(face, __functionAddress);
    }

    /** {@code FT_UInt FT_Get_Sfnt_Name_Count(FT_Face face)} */
    @NativeType("FT_UInt")
    public static int FT_Get_Sfnt_Name_Count(FT_Face face) {
        return nFT_Get_Sfnt_Name_Count(face.address());
    }

    // --- [ FT_Get_Sfnt_Name ] ---

    /** {@code FT_Error FT_Get_Sfnt_Name(FT_Face face, FT_UInt idx, FT_SfntName * aname)} */
    public static int nFT_Get_Sfnt_Name(long face, int idx, long aname) {
        long __functionAddress = Functions.Get_Sfnt_Name;
        return invokePPI(face, idx, aname, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Sfnt_Name(FT_Face face, FT_UInt idx, FT_SfntName * aname)} */
    @NativeType("FT_Error")
    public static int FT_Get_Sfnt_Name(FT_Face face, @NativeType("FT_UInt") int idx, @NativeType("FT_SfntName *") FT_SfntName aname) {
        return nFT_Get_Sfnt_Name(face.address(), idx, aname.address());
    }

    // --- [ FT_Get_Sfnt_LangTag ] ---

    /** {@code FT_Error FT_Get_Sfnt_LangTag(FT_Face face, FT_UInt langID, FT_SfntLangTag * alangTag)} */
    public static int nFT_Get_Sfnt_LangTag(long face, int langID, long alangTag) {
        long __functionAddress = Functions.Get_Sfnt_LangTag;
        return invokePPI(face, langID, alangTag, __functionAddress);
    }

    /** {@code FT_Error FT_Get_Sfnt_LangTag(FT_Face face, FT_UInt langID, FT_SfntLangTag * alangTag)} */
    @NativeType("FT_Error")
    public static int FT_Get_Sfnt_LangTag(FT_Face face, @NativeType("FT_UInt") int langID, @NativeType("FT_SfntLangTag *") FT_SfntLangTag alangTag) {
        return nFT_Get_Sfnt_LangTag(face.address(), langID, alangTag.address());
    }

    // --- [ FT_Outline_GetInsideBorder ] ---

    /** {@code FT_StrokerBorder FT_Outline_GetInsideBorder(FT_Outline * outline)} */
    public static int nFT_Outline_GetInsideBorder(long outline) {
        long __functionAddress = Functions.Outline_GetInsideBorder;
        return invokePI(outline, __functionAddress);
    }

    /** {@code FT_StrokerBorder FT_Outline_GetInsideBorder(FT_Outline * outline)} */
    @NativeType("FT_StrokerBorder")
    public static int FT_Outline_GetInsideBorder(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_GetInsideBorder(outline.address());
    }

    // --- [ FT_Outline_GetOutsideBorder ] ---

    /** {@code FT_StrokerBorder FT_Outline_GetOutsideBorder(FT_Outline * outline)} */
    public static int nFT_Outline_GetOutsideBorder(long outline) {
        long __functionAddress = Functions.Outline_GetOutsideBorder;
        return invokePI(outline, __functionAddress);
    }

    /** {@code FT_StrokerBorder FT_Outline_GetOutsideBorder(FT_Outline * outline)} */
    @NativeType("FT_StrokerBorder")
    public static int FT_Outline_GetOutsideBorder(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_GetOutsideBorder(outline.address());
    }

    // --- [ FT_Stroker_New ] ---

    /** {@code FT_Error FT_Stroker_New(FT_Library library, FT_Stroker * astroker)} */
    public static int nFT_Stroker_New(long library, long astroker) {
        long __functionAddress = Functions.Stroker_New;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, astroker, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_New(FT_Library library, FT_Stroker * astroker)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_New(@NativeType("FT_Library") long library, @NativeType("FT_Stroker *") PointerBuffer astroker) {
        if (CHECKS) {
            check(astroker, 1);
        }
        return nFT_Stroker_New(library, memAddress(astroker));
    }

    // --- [ FT_Stroker_Set ] ---

    /** {@code void FT_Stroker_Set(FT_Stroker stroker, FT_Fixed radius, FT_Stroker_LineCap line_cap, FT_Stroker_LineJoin line_join, FT_Fixed miter_limit)} */
    public static void FT_Stroker_Set(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Fixed") long radius, @NativeType("FT_Stroker_LineCap") int line_cap, @NativeType("FT_Stroker_LineJoin") int line_join, @NativeType("FT_Fixed") long miter_limit) {
        long __functionAddress = Functions.Stroker_Set;
        if (CHECKS) {
            check(stroker);
        }
        invokePNNV(stroker, radius, line_cap, line_join, miter_limit, __functionAddress);
    }

    // --- [ FT_Stroker_Rewind ] ---

    /** {@code void FT_Stroker_Rewind(FT_Stroker stroker)} */
    public static void FT_Stroker_Rewind(@NativeType("FT_Stroker") long stroker) {
        long __functionAddress = Functions.Stroker_Rewind;
        if (CHECKS) {
            check(stroker);
        }
        invokePV(stroker, __functionAddress);
    }

    // --- [ FT_Stroker_ParseOutline ] ---

    /** {@code FT_Error FT_Stroker_ParseOutline(FT_Stroker stroker, FT_Outline * outline, FT_Bool opened)} */
    public static int nFT_Stroker_ParseOutline(long stroker, long outline, boolean opened) {
        long __functionAddress = Functions.Stroker_ParseOutline;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(stroker, outline, opened, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_ParseOutline(FT_Stroker stroker, FT_Outline * outline, FT_Bool opened)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_ParseOutline(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Bool") boolean opened) {
        return nFT_Stroker_ParseOutline(stroker, outline.address(), opened);
    }

    // --- [ FT_Stroker_BeginSubPath ] ---

    /** {@code FT_Error FT_Stroker_BeginSubPath(FT_Stroker stroker, FT_Vector * to, FT_Bool open)} */
    public static int nFT_Stroker_BeginSubPath(long stroker, long to, boolean open) {
        long __functionAddress = Functions.Stroker_BeginSubPath;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(stroker, to, open, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_BeginSubPath(FT_Stroker stroker, FT_Vector * to, FT_Bool open)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_BeginSubPath(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector to, @NativeType("FT_Bool") boolean open) {
        return nFT_Stroker_BeginSubPath(stroker, to.address(), open);
    }

    // --- [ FT_Stroker_EndSubPath ] ---

    /** {@code FT_Error FT_Stroker_EndSubPath(FT_Stroker stroker)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_EndSubPath(@NativeType("FT_Stroker") long stroker) {
        long __functionAddress = Functions.Stroker_EndSubPath;
        if (CHECKS) {
            check(stroker);
        }
        return invokePI(stroker, __functionAddress);
    }

    // --- [ FT_Stroker_LineTo ] ---

    /** {@code FT_Error FT_Stroker_LineTo(FT_Stroker stroker, FT_Vector * to)} */
    public static int nFT_Stroker_LineTo(long stroker, long to) {
        long __functionAddress = Functions.Stroker_LineTo;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(stroker, to, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_LineTo(FT_Stroker stroker, FT_Vector * to)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_LineTo(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector to) {
        return nFT_Stroker_LineTo(stroker, to.address());
    }

    // --- [ FT_Stroker_ConicTo ] ---

    /** {@code FT_Error FT_Stroker_ConicTo(FT_Stroker stroker, FT_Vector * control, FT_Vector * to)} */
    public static int nFT_Stroker_ConicTo(long stroker, long control, long to) {
        long __functionAddress = Functions.Stroker_ConicTo;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPI(stroker, control, to, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_ConicTo(FT_Stroker stroker, FT_Vector * control, FT_Vector * to)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_ConicTo(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector control, @NativeType("FT_Vector *") FT_Vector to) {
        return nFT_Stroker_ConicTo(stroker, control.address(), to.address());
    }

    // --- [ FT_Stroker_CubicTo ] ---

    /** {@code FT_Error FT_Stroker_CubicTo(FT_Stroker stroker, FT_Vector * control1, FT_Vector * control2, FT_Vector * to)} */
    public static int nFT_Stroker_CubicTo(long stroker, long control1, long control2, long to) {
        long __functionAddress = Functions.Stroker_CubicTo;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPPI(stroker, control1, control2, to, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_CubicTo(FT_Stroker stroker, FT_Vector * control1, FT_Vector * control2, FT_Vector * to)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_CubicTo(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector control1, @NativeType("FT_Vector *") FT_Vector control2, @NativeType("FT_Vector *") FT_Vector to) {
        return nFT_Stroker_CubicTo(stroker, control1.address(), control2.address(), to.address());
    }

    // --- [ FT_Stroker_GetBorderCounts ] ---

    /** {@code FT_Error FT_Stroker_GetBorderCounts(FT_Stroker stroker, FT_StrokerBorder border, FT_UInt * anum_points, FT_UInt * anum_contours)} */
    public static int nFT_Stroker_GetBorderCounts(long stroker, int border, long anum_points, long anum_contours) {
        long __functionAddress = Functions.Stroker_GetBorderCounts;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPI(stroker, border, anum_points, anum_contours, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_GetBorderCounts(FT_Stroker stroker, FT_StrokerBorder border, FT_UInt * anum_points, FT_UInt * anum_contours)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_GetBorderCounts(@NativeType("FT_Stroker") long stroker, @NativeType("FT_StrokerBorder") int border, @NativeType("FT_UInt *") IntBuffer anum_points, @NativeType("FT_UInt *") IntBuffer anum_contours) {
        if (CHECKS) {
            check(anum_points, 1);
            check(anum_contours, 1);
        }
        return nFT_Stroker_GetBorderCounts(stroker, border, memAddress(anum_points), memAddress(anum_contours));
    }

    // --- [ FT_Stroker_ExportBorder ] ---

    /** {@code void FT_Stroker_ExportBorder(FT_Stroker stroker, FT_StrokerBorder border, FT_Outline * outline)} */
    public static void nFT_Stroker_ExportBorder(long stroker, int border, long outline) {
        long __functionAddress = Functions.Stroker_ExportBorder;
        if (CHECKS) {
            check(stroker);
        }
        invokePPV(stroker, border, outline, __functionAddress);
    }

    /** {@code void FT_Stroker_ExportBorder(FT_Stroker stroker, FT_StrokerBorder border, FT_Outline * outline)} */
    public static void FT_Stroker_ExportBorder(@NativeType("FT_Stroker") long stroker, @NativeType("FT_StrokerBorder") int border, @NativeType("FT_Outline *") FT_Outline outline) {
        nFT_Stroker_ExportBorder(stroker, border, outline.address());
    }

    // --- [ FT_Stroker_GetCounts ] ---

    /** {@code FT_Error FT_Stroker_GetCounts(FT_Stroker stroker, FT_UInt * anum_points, FT_UInt * anum_contours)} */
    public static int nFT_Stroker_GetCounts(long stroker, long anum_points, long anum_contours) {
        long __functionAddress = Functions.Stroker_GetCounts;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPI(stroker, anum_points, anum_contours, __functionAddress);
    }

    /** {@code FT_Error FT_Stroker_GetCounts(FT_Stroker stroker, FT_UInt * anum_points, FT_UInt * anum_contours)} */
    @NativeType("FT_Error")
    public static int FT_Stroker_GetCounts(@NativeType("FT_Stroker") long stroker, @NativeType("FT_UInt *") IntBuffer anum_points, @NativeType("FT_UInt *") IntBuffer anum_contours) {
        if (CHECKS) {
            check(anum_points, 1);
            check(anum_contours, 1);
        }
        return nFT_Stroker_GetCounts(stroker, memAddress(anum_points), memAddress(anum_contours));
    }

    // --- [ FT_Stroker_Export ] ---

    /** {@code void FT_Stroker_Export(FT_Stroker stroker, FT_Outline * outline)} */
    public static void nFT_Stroker_Export(long stroker, long outline) {
        long __functionAddress = Functions.Stroker_Export;
        if (CHECKS) {
            check(stroker);
        }
        invokePPV(stroker, outline, __functionAddress);
    }

    /** {@code void FT_Stroker_Export(FT_Stroker stroker, FT_Outline * outline)} */
    public static void FT_Stroker_Export(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Outline *") FT_Outline outline) {
        nFT_Stroker_Export(stroker, outline.address());
    }

    // --- [ FT_Stroker_Done ] ---

    /** {@code void FT_Stroker_Done(FT_Stroker stroker)} */
    public static void FT_Stroker_Done(@NativeType("FT_Stroker") long stroker) {
        long __functionAddress = Functions.Stroker_Done;
        if (CHECKS) {
            check(stroker);
        }
        invokePV(stroker, __functionAddress);
    }

    // --- [ FT_Glyph_Stroke ] ---

    /** {@code FT_Error FT_Glyph_Stroke(FT_Glyph * pglyph, FT_Stroker stroker, FT_Bool destroy)} */
    public static int nFT_Glyph_Stroke(long pglyph, long stroker, boolean destroy) {
        long __functionAddress = Functions.Glyph_Stroke;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(pglyph, stroker, destroy, __functionAddress);
    }

    /** {@code FT_Error FT_Glyph_Stroke(FT_Glyph * pglyph, FT_Stroker stroker, FT_Bool destroy)} */
    @NativeType("FT_Error")
    public static int FT_Glyph_Stroke(@NativeType("FT_Glyph *") PointerBuffer pglyph, @NativeType("FT_Stroker") long stroker, @NativeType("FT_Bool") boolean destroy) {
        if (CHECKS) {
            check(pglyph, 1);
        }
        return nFT_Glyph_Stroke(memAddress(pglyph), stroker, destroy);
    }

    // --- [ FT_Glyph_StrokeBorder ] ---

    /** {@code FT_Error FT_Glyph_StrokeBorder(FT_Glyph * pglyph, FT_Stroker stroker, FT_Bool inside, FT_Bool destroy)} */
    public static int nFT_Glyph_StrokeBorder(long pglyph, long stroker, boolean inside, boolean destroy) {
        long __functionAddress = Functions.Glyph_StrokeBorder;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(pglyph, stroker, inside, destroy, __functionAddress);
    }

    /** {@code FT_Error FT_Glyph_StrokeBorder(FT_Glyph * pglyph, FT_Stroker stroker, FT_Bool inside, FT_Bool destroy)} */
    @NativeType("FT_Error")
    public static int FT_Glyph_StrokeBorder(@NativeType("FT_Glyph *") PointerBuffer pglyph, @NativeType("FT_Stroker") long stroker, @NativeType("FT_Bool") boolean inside, @NativeType("FT_Bool") boolean destroy) {
        if (CHECKS) {
            check(pglyph, 1);
        }
        return nFT_Glyph_StrokeBorder(memAddress(pglyph), stroker, inside, destroy);
    }

    // --- [ FT_GlyphSlot_Embolden ] ---

    /** {@code void FT_GlyphSlot_Embolden(FT_GlyphSlot slot)} */
    public static void nFT_GlyphSlot_Embolden(long slot) {
        long __functionAddress = Functions.GlyphSlot_Embolden;
        invokePV(slot, __functionAddress);
    }

    /** {@code void FT_GlyphSlot_Embolden(FT_GlyphSlot slot)} */
    public static void FT_GlyphSlot_Embolden(FT_GlyphSlot slot) {
        nFT_GlyphSlot_Embolden(slot.address());
    }

    // --- [ FT_GlyphSlot_AdjustWeight ] ---

    /** {@code void FT_GlyphSlot_AdjustWeight(FT_GlyphSlot slot, FT_Fixed xdelta, FT_Fixed ydelta)} */
    public static void nFT_GlyphSlot_AdjustWeight(long slot, long xdelta, long ydelta) {
        long __functionAddress = Functions.GlyphSlot_AdjustWeight;
        invokePNNV(slot, xdelta, ydelta, __functionAddress);
    }

    /** {@code void FT_GlyphSlot_AdjustWeight(FT_GlyphSlot slot, FT_Fixed xdelta, FT_Fixed ydelta)} */
    public static void FT_GlyphSlot_AdjustWeight(FT_GlyphSlot slot, @NativeType("FT_Fixed") long xdelta, @NativeType("FT_Fixed") long ydelta) {
        nFT_GlyphSlot_AdjustWeight(slot.address(), xdelta, ydelta);
    }

    // --- [ FT_GlyphSlot_Oblique ] ---

    /** {@code void FT_GlyphSlot_Oblique(FT_GlyphSlot slot)} */
    public static void nFT_GlyphSlot_Oblique(long slot) {
        long __functionAddress = Functions.GlyphSlot_Oblique;
        invokePV(slot, __functionAddress);
    }

    /** {@code void FT_GlyphSlot_Oblique(FT_GlyphSlot slot)} */
    public static void FT_GlyphSlot_Oblique(FT_GlyphSlot slot) {
        nFT_GlyphSlot_Oblique(slot.address());
    }

    // --- [ FT_GlyphSlot_Slant ] ---

    /** {@code void FT_GlyphSlot_Slant(FT_GlyphSlot slot, FT_Fixed xslant, FT_Fixed yslant)} */
    public static void nFT_GlyphSlot_Slant(long slot, long xslant, long yslant) {
        long __functionAddress = Functions.GlyphSlot_Slant;
        invokePNNV(slot, xslant, yslant, __functionAddress);
    }

    /** {@code void FT_GlyphSlot_Slant(FT_GlyphSlot slot, FT_Fixed xslant, FT_Fixed yslant)} */
    public static void FT_GlyphSlot_Slant(FT_GlyphSlot slot, @NativeType("FT_Fixed") long xslant, @NativeType("FT_Fixed") long yslant) {
        nFT_GlyphSlot_Slant(slot.address(), xslant, yslant);
    }

    // --- [ FT_Sin ] ---

    /** {@code FT_Fixed FT_Sin(FT_Angle angle)} */
    @NativeType("FT_Fixed")
    public static long FT_Sin(@NativeType("FT_Angle") long angle) {
        long __functionAddress = Functions.Sin;
        return invokeNN(angle, __functionAddress);
    }

    // --- [ FT_Cos ] ---

    /** {@code FT_Fixed FT_Cos(FT_Angle angle)} */
    @NativeType("FT_Fixed")
    public static long FT_Cos(@NativeType("FT_Angle") long angle) {
        long __functionAddress = Functions.Cos;
        return invokeNN(angle, __functionAddress);
    }

    // --- [ FT_Tan ] ---

    /** {@code FT_Fixed FT_Tan(FT_Angle angle)} */
    @NativeType("FT_Fixed")
    public static long FT_Tan(@NativeType("FT_Angle") long angle) {
        long __functionAddress = Functions.Tan;
        return invokeNN(angle, __functionAddress);
    }

    // --- [ FT_Atan2 ] ---

    /** {@code FT_Angle FT_Atan2(FT_Fixed x, FT_Fixed y)} */
    @NativeType("FT_Angle")
    public static long FT_Atan2(@NativeType("FT_Fixed") long x, @NativeType("FT_Fixed") long y) {
        long __functionAddress = Functions.Atan2;
        return invokeNNN(x, y, __functionAddress);
    }

    // --- [ FT_Angle_Diff ] ---

    /** {@code FT_Angle FT_Angle_Diff(FT_Angle angle1, FT_Angle angle2)} */
    @NativeType("FT_Angle")
    public static long FT_Angle_Diff(@NativeType("FT_Angle") long angle1, @NativeType("FT_Angle") long angle2) {
        long __functionAddress = Functions.Angle_Diff;
        return invokeNNN(angle1, angle2, __functionAddress);
    }

    // --- [ FT_Vector_Unit ] ---

    /** {@code void FT_Vector_Unit(FT_Vector * vec, FT_Angle angle)} */
    public static void nFT_Vector_Unit(long vec, long angle) {
        long __functionAddress = Functions.Vector_Unit;
        invokePNV(vec, angle, __functionAddress);
    }

    /** {@code void FT_Vector_Unit(FT_Vector * vec, FT_Angle angle)} */
    public static void FT_Vector_Unit(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Angle") long angle) {
        nFT_Vector_Unit(vec.address(), angle);
    }

    // --- [ FT_Vector_Rotate ] ---

    /** {@code void FT_Vector_Rotate(FT_Vector * vec, FT_Angle angle)} */
    public static void nFT_Vector_Rotate(long vec, long angle) {
        long __functionAddress = Functions.Vector_Rotate;
        invokePNV(vec, angle, __functionAddress);
    }

    /** {@code void FT_Vector_Rotate(FT_Vector * vec, FT_Angle angle)} */
    public static void FT_Vector_Rotate(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Angle") long angle) {
        nFT_Vector_Rotate(vec.address(), angle);
    }

    // --- [ FT_Vector_Length ] ---

    /** {@code FT_Fixed FT_Vector_Length(FT_Vector * vec)} */
    public static long nFT_Vector_Length(long vec) {
        long __functionAddress = Functions.Vector_Length;
        return invokePN(vec, __functionAddress);
    }

    /** {@code FT_Fixed FT_Vector_Length(FT_Vector * vec)} */
    @NativeType("FT_Fixed")
    public static long FT_Vector_Length(@NativeType("FT_Vector *") FT_Vector vec) {
        return nFT_Vector_Length(vec.address());
    }

    // --- [ FT_Vector_Polarize ] ---

    /** {@code void FT_Vector_Polarize(FT_Vector * vec, FT_Fixed * length, FT_Angle * angle)} */
    public static void nFT_Vector_Polarize(long vec, long length, long angle) {
        long __functionAddress = Functions.Vector_Polarize;
        invokePPPV(vec, length, angle, __functionAddress);
    }

    /** {@code void FT_Vector_Polarize(FT_Vector * vec, FT_Fixed * length, FT_Angle * angle)} */
    public static void FT_Vector_Polarize(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Fixed *") CLongBuffer length, @NativeType("FT_Angle *") CLongBuffer angle) {
        if (CHECKS) {
            check(length, 1);
            check(angle, 1);
        }
        nFT_Vector_Polarize(vec.address(), memAddress(length), memAddress(angle));
    }

    // --- [ FT_Vector_From_Polar ] ---

    /** {@code void FT_Vector_From_Polar(FT_Vector * vec, FT_Fixed length, FT_Angle angle)} */
    public static void nFT_Vector_From_Polar(long vec, long length, long angle) {
        long __functionAddress = Functions.Vector_From_Polar;
        invokePNNV(vec, length, angle, __functionAddress);
    }

    /** {@code void FT_Vector_From_Polar(FT_Vector * vec, FT_Fixed length, FT_Angle angle)} */
    public static void FT_Vector_From_Polar(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Fixed") long length, @NativeType("FT_Angle") long angle) {
        nFT_Vector_From_Polar(vec.address(), length, angle);
    }

    // --- [ FT_Has_PS_Glyph_Names ] ---

    /** {@code FT_Int FT_Has_PS_Glyph_Names(FT_Face face)} */
    public static int nFT_Has_PS_Glyph_Names(long face) {
        long __functionAddress = Functions.Has_PS_Glyph_Names;
        return invokePI(face, __functionAddress);
    }

    /** {@code FT_Int FT_Has_PS_Glyph_Names(FT_Face face)} */
    @NativeType("FT_Int")
    public static int FT_Has_PS_Glyph_Names(FT_Face face) {
        return nFT_Has_PS_Glyph_Names(face.address());
    }

    // --- [ FT_Get_PS_Font_Info ] ---

    /** {@code FT_Error FT_Get_PS_Font_Info(FT_Face face, PS_FontInfo afont_info)} */
    public static int nFT_Get_PS_Font_Info(long face, long afont_info) {
        long __functionAddress = Functions.Get_PS_Font_Info;
        return invokePPI(face, afont_info, __functionAddress);
    }

    /** {@code FT_Error FT_Get_PS_Font_Info(FT_Face face, PS_FontInfo afont_info)} */
    @NativeType("FT_Error")
    public static int FT_Get_PS_Font_Info(FT_Face face, PS_FontInfo afont_info) {
        return nFT_Get_PS_Font_Info(face.address(), afont_info.address());
    }

    // --- [ FT_Get_PS_Font_Private ] ---

    /** {@code FT_Error FT_Get_PS_Font_Private(FT_Face face, PS_Private afont_private)} */
    public static int nFT_Get_PS_Font_Private(long face, long afont_private) {
        long __functionAddress = Functions.Get_PS_Font_Private;
        if (CHECKS) {
            check(afont_private);
        }
        return invokePPI(face, afont_private, __functionAddress);
    }

    /** {@code FT_Error FT_Get_PS_Font_Private(FT_Face face, PS_Private afont_private)} */
    @NativeType("FT_Error")
    public static int FT_Get_PS_Font_Private(FT_Face face, @NativeType("PS_Private") long afont_private) {
        return nFT_Get_PS_Font_Private(face.address(), afont_private);
    }

    // --- [ FT_Get_PS_Font_Value ] ---

    /** {@code FT_Long FT_Get_PS_Font_Value(FT_Face face, PS_Dict_Keys key, FT_UInt idx, void * value, FT_Long value_len)} */
    public static long nFT_Get_PS_Font_Value(long face, int key, int idx, long value, long value_len) {
        long __functionAddress = Functions.Get_PS_Font_Value;
        return invokePPNN(face, key, idx, value, value_len, __functionAddress);
    }

    /** {@code FT_Long FT_Get_PS_Font_Value(FT_Face face, PS_Dict_Keys key, FT_UInt idx, void * value, FT_Long value_len)} */
    @NativeType("FT_Long")
    public static long FT_Get_PS_Font_Value(FT_Face face, @NativeType("PS_Dict_Keys") int key, @NativeType("FT_UInt") int idx, @NativeType("void *") @Nullable ByteBuffer value) {
        return nFT_Get_PS_Font_Value(face.address(), key, idx, memAddressSafe(value), remainingSafe(value));
    }

    // --- [ FT_Get_Sfnt_Table ] ---

    /** {@code void * FT_Get_Sfnt_Table(FT_Face face, FT_Sfnt_Tag tag)} */
    public static long nFT_Get_Sfnt_Table(long face, int tag) {
        long __functionAddress = Functions.Get_Sfnt_Table;
        return invokePP(face, tag, __functionAddress);
    }

    /** {@code void * FT_Get_Sfnt_Table(FT_Face face, FT_Sfnt_Tag tag)} */
    @NativeType("void *")
    public static long FT_Get_Sfnt_Table(FT_Face face, @NativeType("FT_Sfnt_Tag") int tag) {
        return nFT_Get_Sfnt_Table(face.address(), tag);
    }

    // --- [ FT_Load_Sfnt_Table ] ---

    /** {@code FT_Error FT_Load_Sfnt_Table(FT_Face face, FT_ULong tag, FT_Long offset, FT_Byte * buffer, FT_ULong * length)} */
    public static int nFT_Load_Sfnt_Table(long face, long tag, long offset, long buffer, long length) {
        long __functionAddress = Functions.Load_Sfnt_Table;
        return invokePNNPPI(face, tag, offset, buffer, length, __functionAddress);
    }

    /** {@code FT_Error FT_Load_Sfnt_Table(FT_Face face, FT_ULong tag, FT_Long offset, FT_Byte * buffer, FT_ULong * length)} */
    @NativeType("FT_Error")
    public static int FT_Load_Sfnt_Table(FT_Face face, @NativeType("FT_ULong") long tag, @NativeType("FT_Long") long offset, @NativeType("FT_Byte *") @Nullable ByteBuffer buffer, @NativeType("FT_ULong *") @Nullable CLongBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        return nFT_Load_Sfnt_Table(face.address(), tag, offset, memAddressSafe(buffer), memAddressSafe(length));
    }

    // --- [ FT_Sfnt_Table_Info ] ---

    /** {@code FT_Error FT_Sfnt_Table_Info(FT_Face face, FT_UInt table_index, FT_ULong * tag, FT_ULong * length)} */
    public static int nFT_Sfnt_Table_Info(long face, int table_index, long tag, long length) {
        long __functionAddress = Functions.Sfnt_Table_Info;
        return invokePPPI(face, table_index, tag, length, __functionAddress);
    }

    /** {@code FT_Error FT_Sfnt_Table_Info(FT_Face face, FT_UInt table_index, FT_ULong * tag, FT_ULong * length)} */
    @NativeType("FT_Error")
    public static int FT_Sfnt_Table_Info(FT_Face face, @NativeType("FT_UInt") int table_index, @NativeType("FT_ULong *") @Nullable CLongBuffer tag, @NativeType("FT_ULong *") @Nullable CLongBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        return nFT_Sfnt_Table_Info(face.address(), table_index, memAddressSafe(tag), memAddressSafe(length));
    }

    // --- [ FT_Get_CMap_Language_ID ] ---

    /** {@code FT_ULong FT_Get_CMap_Language_ID(FT_CharMap charmap)} */
    public static long nFT_Get_CMap_Language_ID(long charmap) {
        long __functionAddress = Functions.Get_CMap_Language_ID;
        return invokePN(charmap, __functionAddress);
    }

    /** {@code FT_ULong FT_Get_CMap_Language_ID(FT_CharMap charmap)} */
    @NativeType("FT_ULong")
    public static long FT_Get_CMap_Language_ID(FT_CharMap charmap) {
        return nFT_Get_CMap_Language_ID(charmap.address());
    }

    // --- [ FT_Get_CMap_Format ] ---

    /** {@code FT_Long FT_Get_CMap_Format(FT_CharMap charmap)} */
    public static long nFT_Get_CMap_Format(long charmap) {
        long __functionAddress = Functions.Get_CMap_Format;
        return invokePN(charmap, __functionAddress);
    }

    /** {@code FT_Long FT_Get_CMap_Format(FT_CharMap charmap)} */
    @NativeType("FT_Long")
    public static long FT_Get_CMap_Format(FT_CharMap charmap) {
        return nFT_Get_CMap_Format(charmap.address());
    }

    public static int FT_ENC_TAG(int a, int b, int c, int d) {
        return ((a & 0xFF) << 24) | ((b & 0xFF) << 16) | ((c & 0xFF) << 8) | (d & 0xFF);
    }

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

    private static int FT_LOAD_TARGET_(int x) {
        return (x & 15) << 16;
    }

    public static int FT_LOAD_TARGET_MODE(int x) {
        return (x >> 16) & 15;
    }

    public static boolean FTC_IMAGE_TYPE_COMPARE(FTC_ImageType d1, FTC_ImageType d2) {
        return d1.face_id() == d2.face_id() && d1.width() == d2.width() && d1.flags() == d2.flags();
    }

    public static int FT_CURVE_TAG(int flag) {
        return flag & 0x03;
    }

    public static int FT_IMAGE_TAG(int _x1, int _x2, int _x3, int _x4) {
        return ((_x1 & 0xFF) << 24) | ((_x2 & 0xFF) << 16) | ((_x3 & 0xFF) << 8) | (_x4 & 0xFF);
    }

    public static int FT_MAKE_TAG(int _x1, int _x2, int _x3, int _x4) {
        return ((_x1 & 0xFF) << 24) | ((_x2 & 0xFF) << 16) | ((_x3 & 0xFF) << 8) | (_x4 & 0xFF);
    }

    public static boolean FT_IS_EMPTY(FT_List list) {
        return list.head() == null;
    }

}