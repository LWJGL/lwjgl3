/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

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

/**
 * Native bindings to <a href="https://freetype.org/">FreeType</a>, a freely available software library to render fonts.
 * 
 * <p>It is written in C, designed to be small, efficient, highly customizable, and portable while capable of producing high-quality output (glyph images) of
 * most vector and bitmap font formats.</p>
 * 
 * <p>FreeType is a library that provides access to glyphs in font files. It scales the glyph images and their metrics to a requested size, and it rasterizes
 * the glyph images to produce pixel or subpixel alpha coverage bitmaps.</p>
 * 
 * <p>Note that FreeType is <i>not</i> a text layout engine. You have to use higher-level libraries like HarfBuzz, Pango, or ICU for that.</p>
 * 
 * <p>Note also that FreeType does <i>not</i> perform alpha blending or compositing the resulting bitmaps or pixmaps by itself. Use your favourite graphics
 * library (for example, Cairo or Skia) to further process FreeType's output.</p>
 * 
 * <h3>HarfBuzz interop</h3>
 * 
 * <p>The default LWJGL FreeType build includes HarfBuzz and exports its full API. See the HarfBuzz bindings for more information.</p>
 */
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

    /**
     * {@code FT_Encoding}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_ENCODING_NONE ENCODING_NONE}</li>
     * <li>{@link #FT_ENCODING_MS_SYMBOL ENCODING_MS_SYMBOL}</li>
     * <li>{@link #FT_ENCODING_UNICODE ENCODING_UNICODE}</li>
     * <li>{@link #FT_ENCODING_SJIS ENCODING_SJIS}</li>
     * <li>{@link #FT_ENCODING_PRC ENCODING_PRC}</li>
     * <li>{@link #FT_ENCODING_BIG5 ENCODING_BIG5}</li>
     * <li>{@link #FT_ENCODING_WANSUNG ENCODING_WANSUNG}</li>
     * <li>{@link #FT_ENCODING_JOHAB ENCODING_JOHAB}</li>
     * <li>{@link #FT_ENCODING_GB2312 ENCODING_GB2312} - for backward compatibility</li>
     * <li>{@link #FT_ENCODING_MS_SJIS ENCODING_MS_SJIS} - for backward compatibility</li>
     * <li>{@link #FT_ENCODING_MS_GB2312 ENCODING_MS_GB2312} - for backward compatibility</li>
     * <li>{@link #FT_ENCODING_MS_BIG5 ENCODING_MS_BIG5} - for backward compatibility</li>
     * <li>{@link #FT_ENCODING_MS_WANSUNG ENCODING_MS_WANSUNG} - for backward compatibility</li>
     * <li>{@link #FT_ENCODING_MS_JOHAB ENCODING_MS_JOHAB} - for backward compatibility</li>
     * <li>{@link #FT_ENCODING_ADOBE_STANDARD ENCODING_ADOBE_STANDARD}</li>
     * <li>{@link #FT_ENCODING_ADOBE_EXPERT ENCODING_ADOBE_EXPERT}</li>
     * <li>{@link #FT_ENCODING_ADOBE_CUSTOM ENCODING_ADOBE_CUSTOM}</li>
     * <li>{@link #FT_ENCODING_ADOBE_LATIN_1 ENCODING_ADOBE_LATIN_1}</li>
     * <li>{@link #FT_ENCODING_OLD_LATIN_2 ENCODING_OLD_LATIN_2}</li>
     * <li>{@link #FT_ENCODING_APPLE_ROMAN ENCODING_APPLE_ROMAN}</li>
     * </ul>
     */
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

    /**
     * {@code FT_FACE_FLAG_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_FACE_FLAG_SCALABLE FACE_FLAG_SCALABLE}</li>
     * <li>{@link #FT_FACE_FLAG_FIXED_SIZES FACE_FLAG_FIXED_SIZES}</li>
     * <li>{@link #FT_FACE_FLAG_FIXED_WIDTH FACE_FLAG_FIXED_WIDTH}</li>
     * <li>{@link #FT_FACE_FLAG_SFNT FACE_FLAG_SFNT}</li>
     * <li>{@link #FT_FACE_FLAG_HORIZONTAL FACE_FLAG_HORIZONTAL}</li>
     * <li>{@link #FT_FACE_FLAG_VERTICAL FACE_FLAG_VERTICAL}</li>
     * <li>{@link #FT_FACE_FLAG_KERNING FACE_FLAG_KERNING}</li>
     * <li>{@link #FT_FACE_FLAG_FAST_GLYPHS FACE_FLAG_FAST_GLYPHS}</li>
     * <li>{@link #FT_FACE_FLAG_MULTIPLE_MASTERS FACE_FLAG_MULTIPLE_MASTERS}</li>
     * <li>{@link #FT_FACE_FLAG_GLYPH_NAMES FACE_FLAG_GLYPH_NAMES}</li>
     * <li>{@link #FT_FACE_FLAG_EXTERNAL_STREAM FACE_FLAG_EXTERNAL_STREAM}</li>
     * <li>{@link #FT_FACE_FLAG_HINTER FACE_FLAG_HINTER}</li>
     * <li>{@link #FT_FACE_FLAG_CID_KEYED FACE_FLAG_CID_KEYED}</li>
     * <li>{@link #FT_FACE_FLAG_TRICKY FACE_FLAG_TRICKY}</li>
     * <li>{@link #FT_FACE_FLAG_COLOR FACE_FLAG_COLOR}</li>
     * <li>{@link #FT_FACE_FLAG_VARIATION FACE_FLAG_VARIATION}</li>
     * <li>{@link #FT_FACE_FLAG_SVG FACE_FLAG_SVG}</li>
     * <li>{@link #FT_FACE_FLAG_SBIX FACE_FLAG_SBIX}</li>
     * <li>{@link #FT_FACE_FLAG_SBIX_OVERLAY FACE_FLAG_SBIX_OVERLAY}</li>
     * </ul>
     */
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

    /**
     * {@code FT_STYLE_FLAG_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_STYLE_FLAG_ITALIC STYLE_FLAG_ITALIC}</li>
     * <li>{@link #FT_STYLE_FLAG_BOLD STYLE_FLAG_BOLD}</li>
     * </ul>
     */
    public static final int
        FT_STYLE_FLAG_ITALIC = 1 <<  0,
        FT_STYLE_FLAG_BOLD   = 1 <<  1;

    /**
     * {@code FT_FFT_OPEN_XXXACE_FLAG_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_OPEN_MEMORY OPEN_MEMORY}</li>
     * <li>{@link #FT_OPEN_STREAM OPEN_STREAM}</li>
     * <li>{@link #FT_OPEN_PATHNAME OPEN_PATHNAME}</li>
     * <li>{@link #FT_OPEN_DRIVER OPEN_DRIVER}</li>
     * <li>{@link #FT_OPEN_PARAMS OPEN_PARAMS}</li>
     * </ul>
     */
    public static final int
        FT_OPEN_MEMORY   = 0x1,
        FT_OPEN_STREAM   = 0x2,
        FT_OPEN_PATHNAME = 0x4,
        FT_OPEN_DRIVER   = 0x8,
        FT_OPEN_PARAMS   = 0x10;

    /**
     * {@code FT_Size_Request_Type}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_SIZE_REQUEST_TYPE_NOMINAL SIZE_REQUEST_TYPE_NOMINAL}</li>
     * <li>{@link #FT_SIZE_REQUEST_TYPE_REAL_DIM SIZE_REQUEST_TYPE_REAL_DIM}</li>
     * <li>{@link #FT_SIZE_REQUEST_TYPE_BBOX SIZE_REQUEST_TYPE_BBOX}</li>
     * <li>{@link #FT_SIZE_REQUEST_TYPE_CELL SIZE_REQUEST_TYPE_CELL}</li>
     * <li>{@link #FT_SIZE_REQUEST_TYPE_SCALES SIZE_REQUEST_TYPE_SCALES}</li>
     * <li>{@link #FT_SIZE_REQUEST_TYPE_MAX SIZE_REQUEST_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FT_SIZE_REQUEST_TYPE_NOMINAL  = 0,
        FT_SIZE_REQUEST_TYPE_REAL_DIM = 1,
        FT_SIZE_REQUEST_TYPE_BBOX     = 2,
        FT_SIZE_REQUEST_TYPE_CELL     = 3,
        FT_SIZE_REQUEST_TYPE_SCALES   = 4,
        FT_SIZE_REQUEST_TYPE_MAX      = 5;

    /**
     * {@code FT_LOAD_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_LOAD_DEFAULT LOAD_DEFAULT}</li>
     * <li>{@link #FT_LOAD_NO_SCALE LOAD_NO_SCALE}</li>
     * <li>{@link #FT_LOAD_NO_HINTING LOAD_NO_HINTING}</li>
     * <li>{@link #FT_LOAD_RENDER LOAD_RENDER}</li>
     * <li>{@link #FT_LOAD_NO_BITMAP LOAD_NO_BITMAP}</li>
     * <li>{@link #FT_LOAD_VERTICAL_LAYOUT LOAD_VERTICAL_LAYOUT}</li>
     * <li>{@link #FT_LOAD_FORCE_AUTOHINT LOAD_FORCE_AUTOHINT}</li>
     * <li>{@link #FT_LOAD_CROP_BITMAP LOAD_CROP_BITMAP}</li>
     * <li>{@link #FT_LOAD_PEDANTIC LOAD_PEDANTIC}</li>
     * <li>{@link #FT_LOAD_IGNORE_GLOBAL_ADVANCE_WIDTH LOAD_IGNORE_GLOBAL_ADVANCE_WIDTH}</li>
     * <li>{@link #FT_LOAD_NO_RECURSE LOAD_NO_RECURSE}</li>
     * <li>{@link #FT_LOAD_IGNORE_TRANSFORM LOAD_IGNORE_TRANSFORM}</li>
     * <li>{@link #FT_LOAD_MONOCHROME LOAD_MONOCHROME}</li>
     * <li>{@link #FT_LOAD_LINEAR_DESIGN LOAD_LINEAR_DESIGN}</li>
     * <li>{@link #FT_LOAD_SBITS_ONLY LOAD_SBITS_ONLY}</li>
     * <li>{@link #FT_LOAD_NO_AUTOHINT LOAD_NO_AUTOHINT}</li>
     * <li>{@link #FT_LOAD_COLOR LOAD_COLOR}</li>
     * <li>{@link #FT_LOAD_COMPUTE_METRICS LOAD_COMPUTE_METRICS}</li>
     * <li>{@link #FT_LOAD_BITMAP_METRICS_ONLY LOAD_BITMAP_METRICS_ONLY}</li>
     * <li>{@link #FT_LOAD_NO_SVG LOAD_NO_SVG}</li>
     * <li>{@link #FT_LOAD_ADVANCE_ONLY LOAD_ADVANCE_ONLY}</li>
     * <li>{@link #FT_LOAD_SVG_ONLY LOAD_SVG_ONLY}</li>
     * </ul>
     */
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

    /**
     * {@code FT_Render_Mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_RENDER_MODE_NORMAL RENDER_MODE_NORMAL}</li>
     * <li>{@link #FT_RENDER_MODE_LIGHT RENDER_MODE_LIGHT}</li>
     * <li>{@link #FT_RENDER_MODE_MONO RENDER_MODE_MONO}</li>
     * <li>{@link #FT_RENDER_MODE_LCD RENDER_MODE_LCD}</li>
     * <li>{@link #FT_RENDER_MODE_LCD_V RENDER_MODE_LCD_V}</li>
     * <li>{@link #FT_RENDER_MODE_SDF RENDER_MODE_SDF}</li>
     * <li>{@link #FT_RENDER_MODE_MAX RENDER_MODE_MAX}</li>
     * </ul>
     */
    public static final int
        FT_RENDER_MODE_NORMAL = 0,
        FT_RENDER_MODE_LIGHT  = 1,
        FT_RENDER_MODE_MONO   = 2,
        FT_RENDER_MODE_LCD    = 3,
        FT_RENDER_MODE_LCD_V  = 4,
        FT_RENDER_MODE_SDF    = 5,
        FT_RENDER_MODE_MAX    = 6;

    /**
     * {@code FT_LOAD_TARGET_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_FT_LOAD_TARGET_NORMAL FT_LOAD_TARGET_NORMAL}</li>
     * <li>{@link #FT_FT_LOAD_TARGET_LIGHT FT_LOAD_TARGET_LIGHT}</li>
     * <li>{@link #FT_FT_LOAD_TARGET_MONO FT_LOAD_TARGET_MONO}</li>
     * <li>{@link #FT_FT_LOAD_TARGET_LCD FT_LOAD_TARGET_LCD}</li>
     * <li>{@link #FT_FT_LOAD_TARGET_LCD_V FT_LOAD_TARGET_LCD_V}</li>
     * </ul>
     */
    public static final int
        FT_FT_LOAD_TARGET_NORMAL = FT_LOAD_TARGET_( FT_RENDER_MODE_NORMAL ),
        FT_FT_LOAD_TARGET_LIGHT  = FT_LOAD_TARGET_( FT_RENDER_MODE_LIGHT ),
        FT_FT_LOAD_TARGET_MONO   = FT_LOAD_TARGET_( FT_RENDER_MODE_MONO ),
        FT_FT_LOAD_TARGET_LCD    = FT_LOAD_TARGET_( FT_RENDER_MODE_LCD ),
        FT_FT_LOAD_TARGET_LCD_V  = FT_LOAD_TARGET_( FT_RENDER_MODE_LCD_V );

    /**
     * {@code FT_Kerning_Mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_KERNING_DEFAULT KERNING_DEFAULT}</li>
     * <li>{@link #FT_KERNING_UNFITTED KERNING_UNFITTED}</li>
     * <li>{@link #FT_KERNING_UNSCALED KERNING_UNSCALED}</li>
     * </ul>
     */
    public static final int
        FT_KERNING_DEFAULT  = 0,
        FT_KERNING_UNFITTED = 1,
        FT_KERNING_UNSCALED = 2;

    /**
     * {@code FT_SUBGLYPH_FLAG_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_SUBGLYPH_FLAG_ARGS_ARE_WORDS SUBGLYPH_FLAG_ARGS_ARE_WORDS}</li>
     * <li>{@link #FT_SUBGLYPH_FLAG_ARGS_ARE_XY_VALUES SUBGLYPH_FLAG_ARGS_ARE_XY_VALUES}</li>
     * <li>{@link #FT_SUBGLYPH_FLAG_ROUND_XY_TO_GRID SUBGLYPH_FLAG_ROUND_XY_TO_GRID}</li>
     * <li>{@link #FT_SUBGLYPH_FLAG_SCALE SUBGLYPH_FLAG_SCALE}</li>
     * <li>{@link #FT_SUBGLYPH_FLAG_XY_SCALE SUBGLYPH_FLAG_XY_SCALE}</li>
     * <li>{@link #FT_SUBGLYPH_FLAG_2X2 SUBGLYPH_FLAG_2X2}</li>
     * <li>{@link #FT_SUBGLYPH_FLAG_USE_MY_METRICS SUBGLYPH_FLAG_USE_MY_METRICS}</li>
     * </ul>
     */
    public static final int
        FT_SUBGLYPH_FLAG_ARGS_ARE_WORDS     = 1,
        FT_SUBGLYPH_FLAG_ARGS_ARE_XY_VALUES = 2,
        FT_SUBGLYPH_FLAG_ROUND_XY_TO_GRID   = 4,
        FT_SUBGLYPH_FLAG_SCALE              = 8,
        FT_SUBGLYPH_FLAG_XY_SCALE           = 0x40,
        FT_SUBGLYPH_FLAG_2X2                = 0x80,
        FT_SUBGLYPH_FLAG_USE_MY_METRICS     = 0x200;

    /**
     * {@code FT_FSTYPE_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_FSTYPE_INSTALLABLE_EMBEDDING FSTYPE_INSTALLABLE_EMBEDDING}</li>
     * <li>{@link #FT_FSTYPE_RESTRICTED_LICENSE_EMBEDDING FSTYPE_RESTRICTED_LICENSE_EMBEDDING}</li>
     * <li>{@link #FT_FSTYPE_PREVIEW_AND_PRINT_EMBEDDING FSTYPE_PREVIEW_AND_PRINT_EMBEDDING}</li>
     * <li>{@link #FT_FSTYPE_EDITABLE_EMBEDDING FSTYPE_EDITABLE_EMBEDDING}</li>
     * <li>{@link #FT_FSTYPE_NO_SUBSETTING FSTYPE_NO_SUBSETTING}</li>
     * <li>{@link #FT_FSTYPE_BITMAP_EMBEDDING_ONLY FSTYPE_BITMAP_EMBEDDING_ONLY}</li>
     * </ul>
     */
    public static final int
        FT_FSTYPE_INSTALLABLE_EMBEDDING        = 0x0000,
        FT_FSTYPE_RESTRICTED_LICENSE_EMBEDDING = 0x0002,
        FT_FSTYPE_PREVIEW_AND_PRINT_EMBEDDING  = 0x0004,
        FT_FSTYPE_EDITABLE_EMBEDDING           = 0x0008,
        FT_FSTYPE_NO_SUBSETTING                = 0x0100,
        FT_FSTYPE_BITMAP_EMBEDDING_ONLY        = 0x0200;

    public static final int FREETYPE_MAJOR = 2;

    public static final int FREETYPE_MINOR = 13;

    public static final int FREETYPE_PATCH = 2;

    public static final int FT_ADVANCE_FLAG_FAST_ONLY = 0x20000000;

    /**
     * {@code BDF_PropertyType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BDF_PROPERTY_TYPE_NONE BDF_PROPERTY_TYPE_NONE}</li>
     * <li>{@link #BDF_PROPERTY_TYPE_ATOM BDF_PROPERTY_TYPE_ATOM}</li>
     * <li>{@link #BDF_PROPERTY_TYPE_INTEGER BDF_PROPERTY_TYPE_INTEGER}</li>
     * <li>{@link #BDF_PROPERTY_TYPE_CARDINAL BDF_PROPERTY_TYPE_CARDINAL}</li>
     * </ul>
     */
    public static final int
        BDF_PROPERTY_TYPE_NONE     = 0,
        BDF_PROPERTY_TYPE_ATOM     = 1,
        BDF_PROPERTY_TYPE_INTEGER  = 2,
        BDF_PROPERTY_TYPE_CARDINAL = 3;

    /**
     * {@code FT_PALETTE_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_PALETTE_FOR_LIGHT_BACKGROUND PALETTE_FOR_LIGHT_BACKGROUND}</li>
     * <li>{@link #FT_PALETTE_FOR_DARK_BACKGROUND PALETTE_FOR_DARK_BACKGROUND}</li>
     * </ul>
     */
    public static final int
        FT_PALETTE_FOR_LIGHT_BACKGROUND = 0x01,
        FT_PALETTE_FOR_DARK_BACKGROUND  = 0x02;

    /**
     * {@code FT_PaintFormat}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_COLR_PAINTFORMAT_COLR_LAYERS COLR_PAINTFORMAT_COLR_LAYERS}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_SOLID COLR_PAINTFORMAT_SOLID}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_LINEAR_GRADIENT COLR_PAINTFORMAT_LINEAR_GRADIENT}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_RADIAL_GRADIENT COLR_PAINTFORMAT_RADIAL_GRADIENT}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_SWEEP_GRADIENT COLR_PAINTFORMAT_SWEEP_GRADIENT}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_GLYPH COLR_PAINTFORMAT_GLYPH}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_COLR_GLYPH COLR_PAINTFORMAT_COLR_GLYPH}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_TRANSFORM COLR_PAINTFORMAT_TRANSFORM}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_TRANSLATE COLR_PAINTFORMAT_TRANSLATE}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_SCALE COLR_PAINTFORMAT_SCALE}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_ROTATE COLR_PAINTFORMAT_ROTATE}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_SKEW COLR_PAINTFORMAT_SKEW}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_COMPOSITE COLR_PAINTFORMAT_COMPOSITE}</li>
     * <li>{@link #FT_COLR_PAINT_FORMAT_MAX COLR_PAINT_FORMAT_MAX}</li>
     * <li>{@link #FT_COLR_PAINTFORMAT_UNSUPPORTED COLR_PAINTFORMAT_UNSUPPORTED}</li>
     * </ul>
     */
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

    /**
     * {@code FT_PaintExtend}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_COLR_PAINT_EXTEND_PAD COLR_PAINT_EXTEND_PAD}</li>
     * <li>{@link #FT_COLR_PAINT_EXTEND_REPEAT COLR_PAINT_EXTEND_REPEAT}</li>
     * <li>{@link #FT_COLR_PAINT_EXTEND_REFLECT COLR_PAINT_EXTEND_REFLECT}</li>
     * </ul>
     */
    public static final int
        FT_COLR_PAINT_EXTEND_PAD     = 0,
        FT_COLR_PAINT_EXTEND_REPEAT  = 1,
        FT_COLR_PAINT_EXTEND_REFLECT = 2;

    /**
     * {@code FT_Composite_Mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_COLR_COMPOSITE_CLEAR COLR_COMPOSITE_CLEAR}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SRC COLR_COMPOSITE_SRC}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DEST COLR_COMPOSITE_DEST}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SRC_OVER COLR_COMPOSITE_SRC_OVER}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DEST_OVER COLR_COMPOSITE_DEST_OVER}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SRC_IN COLR_COMPOSITE_SRC_IN}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DEST_IN COLR_COMPOSITE_DEST_IN}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SRC_OUT COLR_COMPOSITE_SRC_OUT}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DEST_OUT COLR_COMPOSITE_DEST_OUT}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SRC_ATOP COLR_COMPOSITE_SRC_ATOP}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DEST_ATOP COLR_COMPOSITE_DEST_ATOP}</li>
     * <li>{@link #FT_COLR_COMPOSITE_XOR COLR_COMPOSITE_XOR}</li>
     * <li>{@link #FT_COLR_COMPOSITE_PLUS COLR_COMPOSITE_PLUS}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SCREEN COLR_COMPOSITE_SCREEN}</li>
     * <li>{@link #FT_COLR_COMPOSITE_OVERLAY COLR_COMPOSITE_OVERLAY}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DARKEN COLR_COMPOSITE_DARKEN}</li>
     * <li>{@link #FT_COLR_COMPOSITE_LIGHTEN COLR_COMPOSITE_LIGHTEN}</li>
     * <li>{@link #FT_COLR_COMPOSITE_COLOR_DODGE COLR_COMPOSITE_COLOR_DODGE}</li>
     * <li>{@link #FT_COLR_COMPOSITE_COLOR_BURN COLR_COMPOSITE_COLOR_BURN}</li>
     * <li>{@link #FT_COLR_COMPOSITE_HARD_LIGHT COLR_COMPOSITE_HARD_LIGHT}</li>
     * <li>{@link #FT_COLR_COMPOSITE_SOFT_LIGHT COLR_COMPOSITE_SOFT_LIGHT}</li>
     * <li>{@link #FT_COLR_COMPOSITE_DIFFERENCE COLR_COMPOSITE_DIFFERENCE}</li>
     * <li>{@link #FT_COLR_COMPOSITE_EXCLUSION COLR_COMPOSITE_EXCLUSION}</li>
     * <li>{@link #FT_COLR_COMPOSITE_MULTIPLY COLR_COMPOSITE_MULTIPLY}</li>
     * <li>{@link #FT_COLR_COMPOSITE_HSL_HUE COLR_COMPOSITE_HSL_HUE}</li>
     * <li>{@link #FT_COLR_COMPOSITE_HSL_SATURATION COLR_COMPOSITE_HSL_SATURATION}</li>
     * <li>{@link #FT_COLR_COMPOSITE_HSL_COLOR COLR_COMPOSITE_HSL_COLOR}</li>
     * <li>{@link #FT_COLR_COMPOSITE_HSL_LUMINOSITY COLR_COMPOSITE_HSL_LUMINOSITY}</li>
     * <li>{@link #FT_COLR_COMPOSITE_MAX COLR_COMPOSITE_MAX}</li>
     * </ul>
     */
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

    /**
     * {@code FT_Color_Root_Transform}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_COLOR_INCLUDE_ROOT_TRANSFORM COLOR_INCLUDE_ROOT_TRANSFORM}</li>
     * <li>{@link #FT_COLOR_NO_ROOT_TRANSFORM COLOR_NO_ROOT_TRANSFORM}</li>
     * <li>{@link #FT_COLOR_ROOT_TRANSFORM_MAX COLOR_ROOT_TRANSFORM_MAX}</li>
     * </ul>
     */
    public static final int
        FT_COLOR_INCLUDE_ROOT_TRANSFORM = 0,
        FT_COLOR_NO_ROOT_TRANSFORM      = 1,
        FT_COLOR_ROOT_TRANSFORM_MAX     = 2;

    /**
     * {@code FT_HINTING_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_HINTING_FREETYPE HINTING_FREETYPE}</li>
     * <li>{@link #FT_HINTING_ADOBE HINTING_ADOBE}</li>
     * </ul>
     */
    public static final int
        FT_HINTING_FREETYPE = 0,
        FT_HINTING_ADOBE    = 1;

    public static final int TT_INTERPRETER_VERSION_35 = 35;

    public static final int TT_INTERPRETER_VERSION_38 = 38;

    public static final int TT_INTERPRETER_VERSION_40 = 40;

    /**
     * {@code FT_AUTOHINTER_SCRIPT_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_AUTOHINTER_SCRIPT_NONE AUTOHINTER_SCRIPT_NONE}</li>
     * <li>{@link #FT_AUTOHINTER_SCRIPT_LATIN AUTOHINTER_SCRIPT_LATIN}</li>
     * <li>{@link #FT_AUTOHINTER_SCRIPT_CJK AUTOHINTER_SCRIPT_CJK}</li>
     * <li>{@link #FT_AUTOHINTER_SCRIPT_INDIC AUTOHINTER_SCRIPT_INDIC}</li>
     * </ul>
     */
    public static final int
        FT_AUTOHINTER_SCRIPT_NONE  = 0,
        FT_AUTOHINTER_SCRIPT_LATIN = 1,
        FT_AUTOHINTER_SCRIPT_CJK   = 2,
        FT_AUTOHINTER_SCRIPT_INDIC = 3;

    /**
     * {@code FT_Err_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_Err_Ok Err_Ok}</li>
     * <li>{@link #FT_Err_Cannot_Open_Resource Err_Cannot_Open_Resource}</li>
     * <li>{@link #FT_Err_Unknown_File_Format Err_Unknown_File_Format}</li>
     * <li>{@link #FT_Err_Invalid_File_Format Err_Invalid_File_Format}</li>
     * <li>{@link #FT_Err_Invalid_Version Err_Invalid_Version}</li>
     * <li>{@link #FT_Err_Lower_Module_Version Err_Lower_Module_Version}</li>
     * <li>{@link #FT_Err_Invalid_Argument Err_Invalid_Argument}</li>
     * <li>{@link #FT_Err_Unimplemented_Feature Err_Unimplemented_Feature}</li>
     * <li>{@link #FT_Err_Invalid_Table Err_Invalid_Table}</li>
     * <li>{@link #FT_Err_Invalid_Offset Err_Invalid_Offset}</li>
     * <li>{@link #FT_Err_Array_Too_Large Err_Array_Too_Large}</li>
     * <li>{@link #FT_Err_Missing_Module Err_Missing_Module}</li>
     * <li>{@link #FT_Err_Missing_Property Err_Missing_Property}</li>
     * <li>{@link #FT_Err_Invalid_Glyph_Index Err_Invalid_Glyph_Index}</li>
     * <li>{@link #FT_Err_Invalid_Character_Code Err_Invalid_Character_Code}</li>
     * <li>{@link #FT_Err_Invalid_Glyph_Format Err_Invalid_Glyph_Format}</li>
     * <li>{@link #FT_Err_Cannot_Render_Glyph Err_Cannot_Render_Glyph}</li>
     * <li>{@link #FT_Err_Invalid_Outline Err_Invalid_Outline}</li>
     * <li>{@link #FT_Err_Invalid_Composite Err_Invalid_Composite}</li>
     * <li>{@link #FT_Err_Too_Many_Hints Err_Too_Many_Hints}</li>
     * <li>{@link #FT_Err_Invalid_Pixel_Size Err_Invalid_Pixel_Size}</li>
     * <li>{@link #FT_Err_Invalid_SVG_Document Err_Invalid_SVG_Document}</li>
     * <li>{@link #FT_Err_Invalid_Handle Err_Invalid_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Library_Handle Err_Invalid_Library_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Driver_Handle Err_Invalid_Driver_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Face_Handle Err_Invalid_Face_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Size_Handle Err_Invalid_Size_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Slot_Handle Err_Invalid_Slot_Handle}</li>
     * <li>{@link #FT_Err_Invalid_CharMap_Handle Err_Invalid_CharMap_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Cache_Handle Err_Invalid_Cache_Handle}</li>
     * <li>{@link #FT_Err_Invalid_Stream_Handle Err_Invalid_Stream_Handle}</li>
     * <li>{@link #FT_Err_Too_Many_Drivers Err_Too_Many_Drivers}</li>
     * <li>{@link #FT_Err_Too_Many_Extensions Err_Too_Many_Extensions}</li>
     * <li>{@link #FT_Err_Out_Of_Memory Err_Out_Of_Memory}</li>
     * <li>{@link #FT_Err_Unlisted_Object Err_Unlisted_Object}</li>
     * <li>{@link #FT_Err_Cannot_Open_Stream Err_Cannot_Open_Stream}</li>
     * <li>{@link #FT_Err_Invalid_Stream_Seek Err_Invalid_Stream_Seek}</li>
     * <li>{@link #FT_Err_Invalid_Stream_Skip Err_Invalid_Stream_Skip}</li>
     * <li>{@link #FT_Err_Invalid_Stream_Read Err_Invalid_Stream_Read}</li>
     * <li>{@link #FT_Err_Invalid_Stream_Operation Err_Invalid_Stream_Operation}</li>
     * <li>{@link #FT_Err_Invalid_Frame_Operation Err_Invalid_Frame_Operation}</li>
     * <li>{@link #FT_Err_Nested_Frame_Access Err_Nested_Frame_Access}</li>
     * <li>{@link #FT_Err_Invalid_Frame_Read Err_Invalid_Frame_Read}</li>
     * <li>{@link #FT_Err_Raster_Uninitialized Err_Raster_Uninitialized}</li>
     * <li>{@link #FT_Err_Raster_Corrupted Err_Raster_Corrupted}</li>
     * <li>{@link #FT_Err_Raster_Overflow Err_Raster_Overflow}</li>
     * <li>{@link #FT_Err_Raster_Negative_Height Err_Raster_Negative_Height}</li>
     * <li>{@link #FT_Err_Too_Many_Caches Err_Too_Many_Caches}</li>
     * <li>{@link #FT_Err_Invalid_Opcode Err_Invalid_Opcode}</li>
     * <li>{@link #FT_Err_Too_Few_Arguments Err_Too_Few_Arguments}</li>
     * <li>{@link #FT_Err_Stack_Overflow Err_Stack_Overflow}</li>
     * <li>{@link #FT_Err_Code_Overflow Err_Code_Overflow}</li>
     * <li>{@link #FT_Err_Bad_Argument Err_Bad_Argument}</li>
     * <li>{@link #FT_Err_Divide_By_Zero Err_Divide_By_Zero}</li>
     * <li>{@link #FT_Err_Invalid_Reference Err_Invalid_Reference}</li>
     * <li>{@link #FT_Err_Debug_OpCode Err_Debug_OpCode}</li>
     * <li>{@link #FT_Err_ENDF_In_Exec_Stream Err_ENDF_In_Exec_Stream}</li>
     * <li>{@link #FT_Err_Nested_DEFS Err_Nested_DEFS}</li>
     * <li>{@link #FT_Err_Invalid_CodeRange Err_Invalid_CodeRange}</li>
     * <li>{@link #FT_Err_Execution_Too_Long Err_Execution_Too_Long}</li>
     * <li>{@link #FT_Err_Too_Many_Function_Defs Err_Too_Many_Function_Defs}</li>
     * <li>{@link #FT_Err_Too_Many_Instruction_Defs Err_Too_Many_Instruction_Defs}</li>
     * <li>{@link #FT_Err_Table_Missing Err_Table_Missing}</li>
     * <li>{@link #FT_Err_Horiz_Header_Missing Err_Horiz_Header_Missing}</li>
     * <li>{@link #FT_Err_Locations_Missing Err_Locations_Missing}</li>
     * <li>{@link #FT_Err_Name_Table_Missing Err_Name_Table_Missing}</li>
     * <li>{@link #FT_Err_CMap_Table_Missing Err_CMap_Table_Missing}</li>
     * <li>{@link #FT_Err_Hmtx_Table_Missing Err_Hmtx_Table_Missing}</li>
     * <li>{@link #FT_Err_Post_Table_Missing Err_Post_Table_Missing}</li>
     * <li>{@link #FT_Err_Invalid_Horiz_Metrics Err_Invalid_Horiz_Metrics}</li>
     * <li>{@link #FT_Err_Invalid_CharMap_Format Err_Invalid_CharMap_Format}</li>
     * <li>{@link #FT_Err_Invalid_PPem Err_Invalid_PPem}</li>
     * <li>{@link #FT_Err_Invalid_Vert_Metrics Err_Invalid_Vert_Metrics}</li>
     * <li>{@link #FT_Err_Could_Not_Find_Context Err_Could_Not_Find_Context}</li>
     * <li>{@link #FT_Err_Invalid_Post_Table_Format Err_Invalid_Post_Table_Format}</li>
     * <li>{@link #FT_Err_Invalid_Post_Table Err_Invalid_Post_Table}</li>
     * <li>{@link #FT_Err_DEF_In_Glyf_Bytecode Err_DEF_In_Glyf_Bytecode}</li>
     * <li>{@link #FT_Err_Missing_Bitmap Err_Missing_Bitmap}</li>
     * <li>{@link #FT_Err_Missing_SVG_Hooks Err_Missing_SVG_Hooks}</li>
     * <li>{@link #FT_Err_Syntax_Error Err_Syntax_Error}</li>
     * <li>{@link #FT_Err_Stack_Underflow Err_Stack_Underflow}</li>
     * <li>{@link #FT_Err_Ignore Err_Ignore}</li>
     * <li>{@link #FT_Err_No_Unicode_Glyph_Name Err_No_Unicode_Glyph_Name}</li>
     * <li>{@link #FT_Err_Glyph_Too_Big Err_Glyph_Too_Big}</li>
     * <li>{@link #FT_Err_Missing_Startfont_Field Err_Missing_Startfont_Field}</li>
     * <li>{@link #FT_Err_Missing_Font_Field Err_Missing_Font_Field}</li>
     * <li>{@link #FT_Err_Missing_Size_Field Err_Missing_Size_Field}</li>
     * <li>{@link #FT_Err_Missing_Fontboundingbox_Field Err_Missing_Fontboundingbox_Field}</li>
     * <li>{@link #FT_Err_Missing_Chars_Field Err_Missing_Chars_Field}</li>
     * <li>{@link #FT_Err_Missing_Startchar_Field Err_Missing_Startchar_Field}</li>
     * <li>{@link #FT_Err_Missing_Encoding_Field Err_Missing_Encoding_Field}</li>
     * <li>{@link #FT_Err_Missing_Bbx_Field Err_Missing_Bbx_Field}</li>
     * <li>{@link #FT_Err_Bbx_Too_Big Err_Bbx_Too_Big}</li>
     * <li>{@link #FT_Err_Corrupted_Font_Header Err_Corrupted_Font_Header}</li>
     * <li>{@link #FT_Err_Corrupted_Font_Glyphs Err_Corrupted_Font_Glyphs}</li>
     * <li>{@link #FT_Err_Max Err_Max}</li>
     * </ul>
     */
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

    /**
     * {@code FT_GASP_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_GASP_NO_TABLE GASP_NO_TABLE}</li>
     * <li>{@link #FT_GASP_DO_GRIDFIT GASP_DO_GRIDFIT}</li>
     * <li>{@link #FT_GASP_DO_GRAY GASP_DO_GRAY}</li>
     * <li>{@link #FT_GASP_SYMMETRIC_GRIDFIT GASP_SYMMETRIC_GRIDFIT}</li>
     * <li>{@link #FT_GASP_SYMMETRIC_SMOOTHING GASP_SYMMETRIC_SMOOTHING}</li>
     * </ul>
     */
    public static final int
        FT_GASP_NO_TABLE            = -1,
        FT_GASP_DO_GRIDFIT          = 0x01,
        FT_GASP_DO_GRAY             = 0x02,
        FT_GASP_SYMMETRIC_GRIDFIT   = 0x04,
        FT_GASP_SYMMETRIC_SMOOTHING = 0x08;

    /**
     * {@code FT_Glyph_BBox_Mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_GLYPH_BBOX_UNSCALED GLYPH_BBOX_UNSCALED}</li>
     * <li>{@link #FT_GLYPH_BBOX_SUBPIXELS GLYPH_BBOX_SUBPIXELS}</li>
     * <li>{@link #FT_GLYPH_BBOX_GRIDFIT GLYPH_BBOX_GRIDFIT}</li>
     * <li>{@link #FT_GLYPH_BBOX_TRUNCATE GLYPH_BBOX_TRUNCATE}</li>
     * <li>{@link #FT_GLYPH_BBOX_PIXELS GLYPH_BBOX_PIXELS}</li>
     * </ul>
     */
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

    /**
     * {@code FT_VALIDATE_CKERNXXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_VALIDATE_MS VALIDATE_MS}</li>
     * <li>{@link #FT_VALIDATE_APPLE VALIDATE_APPLE}</li>
     * <li>{@link #FT_VALIDATE_CKERN VALIDATE_CKERN}</li>
     * </ul>
     */
    public static final int
        FT_VALIDATE_MS    = FT_VALIDATE_GX_START << 0,
        FT_VALIDATE_APPLE = FT_VALIDATE_GX_START << 1,
        FT_VALIDATE_CKERN = FT_VALIDATE_MS | FT_VALIDATE_APPLE;

    /**
     * {@code FT_Pixel_Mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_PIXEL_MODE_NONE PIXEL_MODE_NONE}</li>
     * <li>{@link #FT_PIXEL_MODE_MONO PIXEL_MODE_MONO}</li>
     * <li>{@link #FT_PIXEL_MODE_GRAY PIXEL_MODE_GRAY}</li>
     * <li>{@link #FT_PIXEL_MODE_GRAY2 PIXEL_MODE_GRAY2}</li>
     * <li>{@link #FT_PIXEL_MODE_GRAY4 PIXEL_MODE_GRAY4}</li>
     * <li>{@link #FT_PIXEL_MODE_LCD PIXEL_MODE_LCD}</li>
     * <li>{@link #FT_PIXEL_MODE_LCD_V PIXEL_MODE_LCD_V}</li>
     * <li>{@link #FT_PIXEL_MODE_BGRA PIXEL_MODE_BGRA}</li>
     * <li>{@link #FT_PIXEL_MODE_MAX PIXEL_MODE_MAX}</li>
     * </ul>
     */
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

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_OUTLINE_NONE OUTLINE_NONE}</li>
     * <li>{@link #FT_OUTLINE_OWNER OUTLINE_OWNER}</li>
     * <li>{@link #FT_OUTLINE_EVEN_ODD_FILL OUTLINE_EVEN_ODD_FILL}</li>
     * <li>{@link #FT_OUTLINE_REVERSE_FILL OUTLINE_REVERSE_FILL}</li>
     * <li>{@link #FT_OUTLINE_IGNORE_DROPOUTS OUTLINE_IGNORE_DROPOUTS}</li>
     * <li>{@link #FT_OUTLINE_SMART_DROPOUTS OUTLINE_SMART_DROPOUTS}</li>
     * <li>{@link #FT_OUTLINE_INCLUDE_STUBS OUTLINE_INCLUDE_STUBS}</li>
     * <li>{@link #FT_OUTLINE_OVERLAP OUTLINE_OVERLAP}</li>
     * <li>{@link #FT_OUTLINE_HIGH_PRECISION OUTLINE_HIGH_PRECISION}</li>
     * <li>{@link #FT_OUTLINE_SINGLE_PASS OUTLINE_SINGLE_PASS}</li>
     * </ul>
     */
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

    /**
     * {@code FT_Glyph_Format}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_GLYPH_FORMAT_NONE GLYPH_FORMAT_NONE}</li>
     * <li>{@link #FT_GLYPH_FORMAT_COMPOSITE GLYPH_FORMAT_COMPOSITE}</li>
     * <li>{@link #FT_GLYPH_FORMAT_BITMAP GLYPH_FORMAT_BITMAP}</li>
     * <li>{@link #FT_GLYPH_FORMAT_OUTLINE GLYPH_FORMAT_OUTLINE}</li>
     * <li>{@link #FT_GLYPH_FORMAT_PLOTTER GLYPH_FORMAT_PLOTTER}</li>
     * <li>{@link #FT_GLYPH_FORMAT_SVG GLYPH_FORMAT_SVG}</li>
     * </ul>
     */
    public static final int
        FT_GLYPH_FORMAT_NONE      = FT_IMAGE_TAG( 0, 0, 0, 0 ),
        FT_GLYPH_FORMAT_COMPOSITE = FT_IMAGE_TAG( 'c', 'o', 'm', 'p' ),
        FT_GLYPH_FORMAT_BITMAP    = FT_IMAGE_TAG( 'b', 'i', 't', 's' ),
        FT_GLYPH_FORMAT_OUTLINE   = FT_IMAGE_TAG( 'o', 'u', 't', 'l' ),
        FT_GLYPH_FORMAT_PLOTTER   = FT_IMAGE_TAG( 'p', 'l', 'o', 't' ),
        FT_GLYPH_FORMAT_SVG       = FT_IMAGE_TAG( 'S', 'V', 'G', ' ' );

    /**
     * {@code FT_RASTER_FLAG_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_RASTER_FLAG_DEFAULT RASTER_FLAG_DEFAULT}</li>
     * <li>{@link #FT_RASTER_FLAG_AA RASTER_FLAG_AA}</li>
     * <li>{@link #FT_RASTER_FLAG_DIRECT RASTER_FLAG_DIRECT}</li>
     * <li>{@link #FT_RASTER_FLAG_CLIP RASTER_FLAG_CLIP}</li>
     * <li>{@link #FT_RASTER_FLAG_SDF RASTER_FLAG_SDF}</li>
     * </ul>
     */
    public static final int
        FT_RASTER_FLAG_DEFAULT = 0x0,
        FT_RASTER_FLAG_AA      = 0x1,
        FT_RASTER_FLAG_DIRECT  = 0x2,
        FT_RASTER_FLAG_CLIP    = 0x4,
        FT_RASTER_FLAG_SDF     = 0x8;

    /**
     * {@code FT_LcdFilter}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_LCD_FILTER_NONE LCD_FILTER_NONE}</li>
     * <li>{@link #FT_LCD_FILTER_DEFAULT LCD_FILTER_DEFAULT}</li>
     * <li>{@link #FT_LCD_FILTER_LIGHT LCD_FILTER_LIGHT}</li>
     * <li>{@link #FT_LCD_FILTER_LEGACY1 LCD_FILTER_LEGACY1}</li>
     * <li>{@link #FT_LCD_FILTER_LEGACY LCD_FILTER_LEGACY}</li>
     * <li>{@link #FT_LCD_FILTER_MAX LCD_FILTER_MAX}</li>
     * </ul>
     */
    public static final int
        FT_LCD_FILTER_NONE    = 0,
        FT_LCD_FILTER_DEFAULT = 1,
        FT_LCD_FILTER_LIGHT   = 2,
        FT_LCD_FILTER_LEGACY1 = 3,
        FT_LCD_FILTER_LEGACY  = 16,
        FT_LCD_FILTER_MAX     = 17;

    public static final int FT_LCD_FILTER_FIVE_TAPS = 5;

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

    /**
     * {@code FT_TrueTypeEngineType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_TRUETYPE_ENGINE_TYPE_NONE TRUETYPE_ENGINE_TYPE_NONE}</li>
     * <li>{@link #FT_TRUETYPE_ENGINE_TYPE_UNPATENTED TRUETYPE_ENGINE_TYPE_UNPATENTED}</li>
     * <li>{@link #FT_TRUETYPE_ENGINE_TYPE_PATENTED TRUETYPE_ENGINE_TYPE_PATENTED}</li>
     * </ul>
     */
    public static final int
        FT_TRUETYPE_ENGINE_TYPE_NONE       = 0,
        FT_TRUETYPE_ENGINE_TYPE_UNPATENTED = 1,
        FT_TRUETYPE_ENGINE_TYPE_PATENTED   = 2;

    /**
     * {@code FT_Mod_Err_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_Mod_Err_Base Mod_Err_Base}</li>
     * <li>{@link #FT_Mod_Err_Autofit Mod_Err_Autofit}</li>
     * <li>{@link #FT_Mod_Err_BDF Mod_Err_BDF}</li>
     * <li>{@link #FT_Mod_Err_Bzip2 Mod_Err_Bzip2}</li>
     * <li>{@link #FT_Mod_Err_Cache Mod_Err_Cache}</li>
     * <li>{@link #FT_Mod_Err_CFF Mod_Err_CFF}</li>
     * <li>{@link #FT_Mod_Err_CID Mod_Err_CID}</li>
     * <li>{@link #FT_Mod_Err_Gzip Mod_Err_Gzip}</li>
     * <li>{@link #FT_Mod_Err_LZW Mod_Err_LZW}</li>
     * <li>{@link #FT_Mod_Err_OTvalid Mod_Err_OTvalid}</li>
     * <li>{@link #FT_Mod_Err_PCF Mod_Err_PCF}</li>
     * <li>{@link #FT_Mod_Err_PFR Mod_Err_PFR}</li>
     * <li>{@link #FT_Mod_Err_PSaux Mod_Err_PSaux}</li>
     * <li>{@link #FT_Mod_Err_PShinter Mod_Err_PShinter}</li>
     * <li>{@link #FT_Mod_Err_PSnames Mod_Err_PSnames}</li>
     * <li>{@link #FT_Mod_Err_Raster Mod_Err_Raster}</li>
     * <li>{@link #FT_Mod_Err_SFNT Mod_Err_SFNT}</li>
     * <li>{@link #FT_Mod_Err_Smooth Mod_Err_Smooth}</li>
     * <li>{@link #FT_Mod_Err_TrueType Mod_Err_TrueType}</li>
     * <li>{@link #FT_Mod_Err_Type1 Mod_Err_Type1}</li>
     * <li>{@link #FT_Mod_Err_Type42 Mod_Err_Type42}</li>
     * <li>{@link #FT_Mod_Err_Winfonts Mod_Err_Winfonts}</li>
     * <li>{@link #FT_Mod_Err_GXvalid Mod_Err_GXvalid}</li>
     * <li>{@link #FT_Mod_Err_Sdf Mod_Err_Sdf}</li>
     * <li>{@link #FT_Mod_Err_Max Mod_Err_Max}</li>
     * </ul>
     */
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

    /**
     * {@code FT_VALIDATE_OTXXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_VALIDATE_BASE VALIDATE_BASE}</li>
     * <li>{@link #FT_VALIDATE_GDEF VALIDATE_GDEF}</li>
     * <li>{@link #FT_VALIDATE_GPOS VALIDATE_GPOS}</li>
     * <li>{@link #FT_VALIDATE_GSUB VALIDATE_GSUB}</li>
     * <li>{@link #FT_VALIDATE_JSTF VALIDATE_JSTF}</li>
     * <li>{@link #FT_VALIDATE_MATH VALIDATE_MATH}</li>
     * <li>{@link #FT_VALIDATE_OT VALIDATE_OT}</li>
     * </ul>
     */
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

    /**
     * {@code FT_Orientation}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_ORIENTATION_TRUETYPE ORIENTATION_TRUETYPE}</li>
     * <li>{@link #FT_ORIENTATION_POSTSCRIPT ORIENTATION_POSTSCRIPT}</li>
     * <li>{@link #FT_ORIENTATION_FILL_RIGHT ORIENTATION_FILL_RIGHT}</li>
     * <li>{@link #FT_ORIENTATION_FILL_LEFT ORIENTATION_FILL_LEFT}</li>
     * <li>{@link #FT_ORIENTATION_NONE ORIENTATION_NONE}</li>
     * </ul>
     */
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

    /**
     * {@code FT_Stroker_LineJoin}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_STROKER_LINEJOIN_ROUND STROKER_LINEJOIN_ROUND}</li>
     * <li>{@link #FT_STROKER_LINEJOIN_BEVEL STROKER_LINEJOIN_BEVEL}</li>
     * <li>{@link #FT_STROKER_LINEJOIN_MITER_VARIABLE STROKER_LINEJOIN_MITER_VARIABLE}</li>
     * <li>{@link #FT_STROKER_LINEJOIN_MITER STROKER_LINEJOIN_MITER}</li>
     * <li>{@link #FT_STROKER_LINEJOIN_MITER_FIXED STROKER_LINEJOIN_MITER_FIXED}</li>
     * </ul>
     */
    public static final int
        FT_STROKER_LINEJOIN_ROUND          = 0,
        FT_STROKER_LINEJOIN_BEVEL          = 1,
        FT_STROKER_LINEJOIN_MITER_VARIABLE = 2,
        FT_STROKER_LINEJOIN_MITER          = FT_STROKER_LINEJOIN_MITER_VARIABLE,
        FT_STROKER_LINEJOIN_MITER_FIXED    = 3;

    /**
     * {@code FT_Stroker_LineCap}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_STROKER_LINECAP_BUTT STROKER_LINECAP_BUTT}</li>
     * <li>{@link #FT_STROKER_LINECAP_ROUND STROKER_LINECAP_ROUND}</li>
     * <li>{@link #FT_STROKER_LINECAP_SQUARE STROKER_LINECAP_SQUARE}</li>
     * </ul>
     */
    public static final int
        FT_STROKER_LINECAP_BUTT   = 0,
        FT_STROKER_LINECAP_ROUND  = 1,
        FT_STROKER_LINECAP_SQUARE = 2;

    /**
     * {@code FT_StrokerBorder}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_STROKER_BORDER_LEFT STROKER_BORDER_LEFT}</li>
     * <li>{@link #FT_STROKER_BORDER_RIGHT STROKER_BORDER_RIGHT}</li>
     * </ul>
     */
    public static final int
        FT_STROKER_BORDER_LEFT  = 0,
        FT_STROKER_BORDER_RIGHT = 1;

    public static final int
        FT_ANGLE_PI  = 180 << 16,
        FT_ANGLE_2PI = FT_ANGLE_PI * 2,
        FT_ANGLE_PI2 = FT_ANGLE_PI / 2,
        FT_ANGLE_PI4 = FT_ANGLE_PI / 4;

    /**
     * {@code T1_Blend_Flags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #T1_BLEND_UNDERLINE_POSITION T1_BLEND_UNDERLINE_POSITION}</li>
     * <li>{@link #T1_BLEND_UNDERLINE_THICKNESS T1_BLEND_UNDERLINE_THICKNESS}</li>
     * <li>{@link #T1_BLEND_ITALIC_ANGLE T1_BLEND_ITALIC_ANGLE}</li>
     * <li>{@link #T1_BLEND_BLUE_VALUES T1_BLEND_BLUE_VALUES}</li>
     * <li>{@link #T1_BLEND_OTHER_BLUES T1_BLEND_OTHER_BLUES}</li>
     * <li>{@link #T1_BLEND_STANDARD_WIDTH T1_BLEND_STANDARD_WIDTH}</li>
     * <li>{@link #T1_BLEND_STANDARD_HEIGHT T1_BLEND_STANDARD_HEIGHT}</li>
     * <li>{@link #T1_BLEND_STEM_SNAP_WIDTHS T1_BLEND_STEM_SNAP_WIDTHS}</li>
     * <li>{@link #T1_BLEND_STEM_SNAP_HEIGHTS T1_BLEND_STEM_SNAP_HEIGHTS}</li>
     * <li>{@link #T1_BLEND_BLUE_SCALE T1_BLEND_BLUE_SCALE}</li>
     * <li>{@link #T1_BLEND_BLUE_SHIFT T1_BLEND_BLUE_SHIFT}</li>
     * <li>{@link #T1_BLEND_FAMILY_BLUES T1_BLEND_FAMILY_BLUES}</li>
     * <li>{@link #T1_BLEND_FAMILY_OTHER_BLUES T1_BLEND_FAMILY_OTHER_BLUES}</li>
     * <li>{@link #T1_BLEND_FORCE_BOLD T1_BLEND_FORCE_BOLD}</li>
     * <li>{@link #T1_BLEND_MAX T1_BLEND_MAX}</li>
     * </ul>
     */
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

    public static final int T1_MAX_MM_DESIGNS = 16;

    public static final int T1_MAX_MM_AXIS = 4;

    public static final int T1_MAX_MM_MAP_POINTS = 20;

    /**
     * {@code T1_EncodingType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #T1_ENCODING_TYPE_NONE T1_ENCODING_TYPE_NONE}</li>
     * <li>{@link #T1_ENCODING_TYPE_ARRAY T1_ENCODING_TYPE_ARRAY}</li>
     * <li>{@link #T1_ENCODING_TYPE_STANDARD T1_ENCODING_TYPE_STANDARD}</li>
     * <li>{@link #T1_ENCODING_TYPE_ISOLATIN1 T1_ENCODING_TYPE_ISOLATIN1}</li>
     * <li>{@link #T1_ENCODING_TYPE_EXPERT T1_ENCODING_TYPE_EXPERT}</li>
     * </ul>
     */
    public static final int
        T1_ENCODING_TYPE_NONE      = 0,
        T1_ENCODING_TYPE_ARRAY     = 1,
        T1_ENCODING_TYPE_STANDARD  = 2,
        T1_ENCODING_TYPE_ISOLATIN1 = 3,
        T1_ENCODING_TYPE_EXPERT    = 4;

    /**
     * {@code PS_Dict_Keys}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #PS_DICT_FONT_TYPE PS_DICT_FONT_TYPE}</li>
     * <li>{@link #PS_DICT_FONT_MATRIX PS_DICT_FONT_MATRIX}</li>
     * <li>{@link #PS_DICT_FONT_BBOX PS_DICT_FONT_BBOX}</li>
     * <li>{@link #PS_DICT_PAINT_TYPE PS_DICT_PAINT_TYPE}</li>
     * <li>{@link #PS_DICT_FONT_NAME PS_DICT_FONT_NAME}</li>
     * <li>{@link #PS_DICT_UNIQUE_ID PS_DICT_UNIQUE_ID}</li>
     * <li>{@link #PS_DICT_NUM_CHAR_STRINGS PS_DICT_NUM_CHAR_STRINGS}</li>
     * <li>{@link #PS_DICT_CHAR_STRING_KEY PS_DICT_CHAR_STRING_KEY}</li>
     * <li>{@link #PS_DICT_CHAR_STRING PS_DICT_CHAR_STRING}</li>
     * <li>{@link #PS_DICT_ENCODING_TYPE PS_DICT_ENCODING_TYPE}</li>
     * <li>{@link #PS_DICT_ENCODING_ENTRY PS_DICT_ENCODING_ENTRY}</li>
     * <li>{@link #PS_DICT_NUM_SUBRS PS_DICT_NUM_SUBRS}</li>
     * <li>{@link #PS_DICT_SUBR PS_DICT_SUBR}</li>
     * <li>{@link #PS_DICT_STD_HW PS_DICT_STD_HW}</li>
     * <li>{@link #PS_DICT_STD_VW PS_DICT_STD_VW}</li>
     * <li>{@link #PS_DICT_NUM_BLUE_VALUES PS_DICT_NUM_BLUE_VALUES}</li>
     * <li>{@link #PS_DICT_BLUE_VALUE PS_DICT_BLUE_VALUE}</li>
     * <li>{@link #PS_DICT_BLUE_FUZZ PS_DICT_BLUE_FUZZ}</li>
     * <li>{@link #PS_DICT_NUM_OTHER_BLUES PS_DICT_NUM_OTHER_BLUES}</li>
     * <li>{@link #PS_DICT_OTHER_BLUE PS_DICT_OTHER_BLUE}</li>
     * <li>{@link #PS_DICT_NUM_FAMILY_BLUES PS_DICT_NUM_FAMILY_BLUES}</li>
     * <li>{@link #PS_DICT_FAMILY_BLUE PS_DICT_FAMILY_BLUE}</li>
     * <li>{@link #PS_DICT_NUM_FAMILY_OTHER_BLUES PS_DICT_NUM_FAMILY_OTHER_BLUES}</li>
     * <li>{@link #PS_DICT_FAMILY_OTHER_BLUE PS_DICT_FAMILY_OTHER_BLUE}</li>
     * <li>{@link #PS_DICT_BLUE_SCALE PS_DICT_BLUE_SCALE}</li>
     * <li>{@link #PS_DICT_BLUE_SHIFT PS_DICT_BLUE_SHIFT}</li>
     * <li>{@link #PS_DICT_NUM_STEM_SNAP_H PS_DICT_NUM_STEM_SNAP_H}</li>
     * <li>{@link #PS_DICT_STEM_SNAP_H PS_DICT_STEM_SNAP_H}</li>
     * <li>{@link #PS_DICT_NUM_STEM_SNAP_V PS_DICT_NUM_STEM_SNAP_V}</li>
     * <li>{@link #PS_DICT_STEM_SNAP_V PS_DICT_STEM_SNAP_V}</li>
     * <li>{@link #PS_DICT_FORCE_BOLD PS_DICT_FORCE_BOLD}</li>
     * <li>{@link #PS_DICT_RND_STEM_UP PS_DICT_RND_STEM_UP}</li>
     * <li>{@link #PS_DICT_MIN_FEATURE PS_DICT_MIN_FEATURE}</li>
     * <li>{@link #PS_DICT_LEN_IV PS_DICT_LEN_IV}</li>
     * <li>{@link #PS_DICT_PASSWORD PS_DICT_PASSWORD}</li>
     * <li>{@link #PS_DICT_LANGUAGE_GROUP PS_DICT_LANGUAGE_GROUP}</li>
     * <li>{@link #PS_DICT_VERSION PS_DICT_VERSION}</li>
     * <li>{@link #PS_DICT_NOTICE PS_DICT_NOTICE}</li>
     * <li>{@link #PS_DICT_FULL_NAME PS_DICT_FULL_NAME}</li>
     * <li>{@link #PS_DICT_FAMILY_NAME PS_DICT_FAMILY_NAME}</li>
     * <li>{@link #PS_DICT_WEIGHT PS_DICT_WEIGHT}</li>
     * <li>{@link #PS_DICT_IS_FIXED_PITCH PS_DICT_IS_FIXED_PITCH}</li>
     * <li>{@link #PS_DICT_UNDERLINE_POSITION PS_DICT_UNDERLINE_POSITION}</li>
     * <li>{@link #PS_DICT_UNDERLINE_THICKNESS PS_DICT_UNDERLINE_THICKNESS}</li>
     * <li>{@link #PS_DICT_FS_TYPE PS_DICT_FS_TYPE}</li>
     * <li>{@link #PS_DICT_ITALIC_ANGLE PS_DICT_ITALIC_ANGLE}</li>
     * <li>{@link #PS_DICT_MAX PS_DICT_MAX}</li>
     * </ul>
     */
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

    /**
     * {@code TT_PLATFORM_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_PLATFORM_APPLE_UNICODE TT_PLATFORM_APPLE_UNICODE}</li>
     * <li>{@link #TT_PLATFORM_MACINTOSH TT_PLATFORM_MACINTOSH}</li>
     * <li>{@link #TT_PLATFORM_ISO TT_PLATFORM_ISO}</li>
     * <li>{@link #TT_PLATFORM_MICROSOFT TT_PLATFORM_MICROSOFT}</li>
     * <li>{@link #TT_PLATFORM_CUSTOM TT_PLATFORM_CUSTOM}</li>
     * <li>{@link #TT_PLATFORM_ADOBE TT_PLATFORM_ADOBE}</li>
     * </ul>
     */
    public static final int
        TT_PLATFORM_APPLE_UNICODE = 0,
        TT_PLATFORM_MACINTOSH     = 1,
        TT_PLATFORM_ISO           = 2,
        TT_PLATFORM_MICROSOFT     = 3,
        TT_PLATFORM_CUSTOM        = 4,
        TT_PLATFORM_ADOBE         = 7;

    /**
     * {@code TT_APPLE_ID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_APPLE_ID_DEFAULT TT_APPLE_ID_DEFAULT}</li>
     * <li>{@link #TT_APPLE_ID_UNICODE_1_1 TT_APPLE_ID_UNICODE_1_1}</li>
     * <li>{@link #TT_APPLE_ID_ISO_10646 TT_APPLE_ID_ISO_10646}</li>
     * <li>{@link #TT_APPLE_ID_UNICODE_2_0 TT_APPLE_ID_UNICODE_2_0}</li>
     * <li>{@link #TT_APPLE_ID_UNICODE_32 TT_APPLE_ID_UNICODE_32}</li>
     * <li>{@link #TT_APPLE_ID_VARIANT_SELECTOR TT_APPLE_ID_VARIANT_SELECTOR}</li>
     * <li>{@link #TT_APPLE_ID_FULL_UNICODE TT_APPLE_ID_FULL_UNICODE}</li>
     * </ul>
     */
    public static final int
        TT_APPLE_ID_DEFAULT          = 0,
        TT_APPLE_ID_UNICODE_1_1      = 1,
        TT_APPLE_ID_ISO_10646        = 2,
        TT_APPLE_ID_UNICODE_2_0      = 3,
        TT_APPLE_ID_UNICODE_32       = 4,
        TT_APPLE_ID_VARIANT_SELECTOR = 5,
        TT_APPLE_ID_FULL_UNICODE     = 6;

    /**
     * {@code TT_MAC_ID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_MAC_ID_ROMAN TT_MAC_ID_ROMAN}</li>
     * <li>{@link #TT_MAC_ID_JAPANESE TT_MAC_ID_JAPANESE}</li>
     * <li>{@link #TT_MAC_ID_TRADITIONAL_CHINESE TT_MAC_ID_TRADITIONAL_CHINESE}</li>
     * <li>{@link #TT_MAC_ID_KOREAN TT_MAC_ID_KOREAN}</li>
     * <li>{@link #TT_MAC_ID_ARABIC TT_MAC_ID_ARABIC}</li>
     * <li>{@link #TT_MAC_ID_HEBREW TT_MAC_ID_HEBREW}</li>
     * <li>{@link #TT_MAC_ID_GREEK TT_MAC_ID_GREEK}</li>
     * <li>{@link #TT_MAC_ID_RUSSIAN TT_MAC_ID_RUSSIAN}</li>
     * <li>{@link #TT_MAC_ID_RSYMBOL TT_MAC_ID_RSYMBOL}</li>
     * <li>{@link #TT_MAC_ID_DEVANAGARI TT_MAC_ID_DEVANAGARI}</li>
     * <li>{@link #TT_MAC_ID_GURMUKHI TT_MAC_ID_GURMUKHI}</li>
     * <li>{@link #TT_MAC_ID_GUJARATI TT_MAC_ID_GUJARATI}</li>
     * <li>{@link #TT_MAC_ID_ORIYA TT_MAC_ID_ORIYA}</li>
     * <li>{@link #TT_MAC_ID_BENGALI TT_MAC_ID_BENGALI}</li>
     * <li>{@link #TT_MAC_ID_TAMIL TT_MAC_ID_TAMIL}</li>
     * <li>{@link #TT_MAC_ID_TELUGU TT_MAC_ID_TELUGU}</li>
     * <li>{@link #TT_MAC_ID_KANNADA TT_MAC_ID_KANNADA}</li>
     * <li>{@link #TT_MAC_ID_MALAYALAM TT_MAC_ID_MALAYALAM}</li>
     * <li>{@link #TT_MAC_ID_SINHALESE TT_MAC_ID_SINHALESE}</li>
     * <li>{@link #TT_MAC_ID_BURMESE TT_MAC_ID_BURMESE}</li>
     * <li>{@link #TT_MAC_ID_KHMER TT_MAC_ID_KHMER}</li>
     * <li>{@link #TT_MAC_ID_THAI TT_MAC_ID_THAI}</li>
     * <li>{@link #TT_MAC_ID_LAOTIAN TT_MAC_ID_LAOTIAN}</li>
     * <li>{@link #TT_MAC_ID_GEORGIAN TT_MAC_ID_GEORGIAN}</li>
     * <li>{@link #TT_MAC_ID_ARMENIAN TT_MAC_ID_ARMENIAN}</li>
     * <li>{@link #TT_MAC_ID_MALDIVIAN TT_MAC_ID_MALDIVIAN}</li>
     * <li>{@link #TT_MAC_ID_SIMPLIFIED_CHINESE TT_MAC_ID_SIMPLIFIED_CHINESE}</li>
     * <li>{@link #TT_MAC_ID_TIBETAN TT_MAC_ID_TIBETAN}</li>
     * <li>{@link #TT_MAC_ID_MONGOLIAN TT_MAC_ID_MONGOLIAN}</li>
     * <li>{@link #TT_MAC_ID_GEEZ TT_MAC_ID_GEEZ}</li>
     * <li>{@link #TT_MAC_ID_SLAVIC TT_MAC_ID_SLAVIC}</li>
     * <li>{@link #TT_MAC_ID_VIETNAMESE TT_MAC_ID_VIETNAMESE}</li>
     * <li>{@link #TT_MAC_ID_SINDHI TT_MAC_ID_SINDHI}</li>
     * <li>{@link #TT_MAC_ID_UNINTERP TT_MAC_ID_UNINTERP}</li>
     * </ul>
     */
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

    /**
     * {@code TT_ISO_ID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_ISO_ID_7BIT_ASCII TT_ISO_ID_7BIT_ASCII}</li>
     * <li>{@link #TT_ISO_ID_10646 TT_ISO_ID_10646}</li>
     * <li>{@link #TT_ISO_ID_8859_1 TT_ISO_ID_8859_1}</li>
     * </ul>
     */
    public static final int
        TT_ISO_ID_7BIT_ASCII = 0,
        TT_ISO_ID_10646      = 1,
        TT_ISO_ID_8859_1     = 2;

    /**
     * {@code TT_MS_ID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_MS_ID_SYMBOL_CS TT_MS_ID_SYMBOL_CS}</li>
     * <li>{@link #TT_MS_ID_UNICODE_CS TT_MS_ID_UNICODE_CS}</li>
     * <li>{@link #TT_MS_ID_SJIS TT_MS_ID_SJIS}</li>
     * <li>{@link #TT_MS_ID_PRC TT_MS_ID_PRC}</li>
     * <li>{@link #TT_MS_ID_BIG_5 TT_MS_ID_BIG_5}</li>
     * <li>{@link #TT_MS_ID_WANSUNG TT_MS_ID_WANSUNG}</li>
     * <li>{@link #TT_MS_ID_JOHAB TT_MS_ID_JOHAB}</li>
     * <li>{@link #TT_MS_ID_UCS_4 TT_MS_ID_UCS_4}</li>
     * </ul>
     */
    public static final int
        TT_MS_ID_SYMBOL_CS  = 0,
        TT_MS_ID_UNICODE_CS = 1,
        TT_MS_ID_SJIS       = 2,
        TT_MS_ID_PRC        = 3,
        TT_MS_ID_BIG_5      = 4,
        TT_MS_ID_WANSUNG    = 5,
        TT_MS_ID_JOHAB      = 6,
        TT_MS_ID_UCS_4      = 10;

    /**
     * {@code TT_ADOBE_ID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_ADOBE_ID_STANDARD TT_ADOBE_ID_STANDARD}</li>
     * <li>{@link #TT_ADOBE_ID_EXPERT TT_ADOBE_ID_EXPERT}</li>
     * <li>{@link #TT_ADOBE_ID_CUSTOM TT_ADOBE_ID_CUSTOM}</li>
     * <li>{@link #TT_ADOBE_ID_LATIN_1 TT_ADOBE_ID_LATIN_1}</li>
     * </ul>
     */
    public static final int
        TT_ADOBE_ID_STANDARD = 0,
        TT_ADOBE_ID_EXPERT   = 1,
        TT_ADOBE_ID_CUSTOM   = 2,
        TT_ADOBE_ID_LATIN_1  = 3;

    /**
     * {@code TT_MAC_LANGID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_MAC_LANGID_ENGLISH TT_MAC_LANGID_ENGLISH}</li>
     * <li>{@link #TT_MAC_LANGID_FRENCH TT_MAC_LANGID_FRENCH}</li>
     * <li>{@link #TT_MAC_LANGID_GERMAN TT_MAC_LANGID_GERMAN}</li>
     * <li>{@link #TT_MAC_LANGID_ITALIAN TT_MAC_LANGID_ITALIAN}</li>
     * <li>{@link #TT_MAC_LANGID_DUTCH TT_MAC_LANGID_DUTCH}</li>
     * <li>{@link #TT_MAC_LANGID_SWEDISH TT_MAC_LANGID_SWEDISH}</li>
     * <li>{@link #TT_MAC_LANGID_SPANISH TT_MAC_LANGID_SPANISH}</li>
     * <li>{@link #TT_MAC_LANGID_DANISH TT_MAC_LANGID_DANISH}</li>
     * <li>{@link #TT_MAC_LANGID_PORTUGUESE TT_MAC_LANGID_PORTUGUESE}</li>
     * <li>{@link #TT_MAC_LANGID_NORWEGIAN TT_MAC_LANGID_NORWEGIAN}</li>
     * <li>{@link #TT_MAC_LANGID_HEBREW TT_MAC_LANGID_HEBREW}</li>
     * <li>{@link #TT_MAC_LANGID_JAPANESE TT_MAC_LANGID_JAPANESE}</li>
     * <li>{@link #TT_MAC_LANGID_ARABIC TT_MAC_LANGID_ARABIC}</li>
     * <li>{@link #TT_MAC_LANGID_FINNISH TT_MAC_LANGID_FINNISH}</li>
     * <li>{@link #TT_MAC_LANGID_GREEK TT_MAC_LANGID_GREEK}</li>
     * <li>{@link #TT_MAC_LANGID_ICELANDIC TT_MAC_LANGID_ICELANDIC}</li>
     * <li>{@link #TT_MAC_LANGID_MALTESE TT_MAC_LANGID_MALTESE}</li>
     * <li>{@link #TT_MAC_LANGID_TURKISH TT_MAC_LANGID_TURKISH}</li>
     * <li>{@link #TT_MAC_LANGID_CROATIAN TT_MAC_LANGID_CROATIAN}</li>
     * <li>{@link #TT_MAC_LANGID_CHINESE_TRADITIONAL TT_MAC_LANGID_CHINESE_TRADITIONAL}</li>
     * <li>{@link #TT_MAC_LANGID_URDU TT_MAC_LANGID_URDU}</li>
     * <li>{@link #TT_MAC_LANGID_HINDI TT_MAC_LANGID_HINDI}</li>
     * <li>{@link #TT_MAC_LANGID_THAI TT_MAC_LANGID_THAI}</li>
     * <li>{@link #TT_MAC_LANGID_KOREAN TT_MAC_LANGID_KOREAN}</li>
     * <li>{@link #TT_MAC_LANGID_LITHUANIAN TT_MAC_LANGID_LITHUANIAN}</li>
     * <li>{@link #TT_MAC_LANGID_POLISH TT_MAC_LANGID_POLISH}</li>
     * <li>{@link #TT_MAC_LANGID_HUNGARIAN TT_MAC_LANGID_HUNGARIAN}</li>
     * <li>{@link #TT_MAC_LANGID_ESTONIAN TT_MAC_LANGID_ESTONIAN}</li>
     * <li>{@link #TT_MAC_LANGID_LETTISH TT_MAC_LANGID_LETTISH}</li>
     * <li>{@link #TT_MAC_LANGID_SAAMISK TT_MAC_LANGID_SAAMISK}</li>
     * <li>{@link #TT_MAC_LANGID_FAEROESE TT_MAC_LANGID_FAEROESE}</li>
     * <li>{@link #TT_MAC_LANGID_FARSI TT_MAC_LANGID_FARSI}</li>
     * <li>{@link #TT_MAC_LANGID_RUSSIAN TT_MAC_LANGID_RUSSIAN}</li>
     * <li>{@link #TT_MAC_LANGID_CHINESE_SIMPLIFIED TT_MAC_LANGID_CHINESE_SIMPLIFIED}</li>
     * <li>{@link #TT_MAC_LANGID_FLEMISH TT_MAC_LANGID_FLEMISH}</li>
     * <li>{@link #TT_MAC_LANGID_IRISH TT_MAC_LANGID_IRISH}</li>
     * <li>{@link #TT_MAC_LANGID_ALBANIAN TT_MAC_LANGID_ALBANIAN}</li>
     * <li>{@link #TT_MAC_LANGID_ROMANIAN TT_MAC_LANGID_ROMANIAN}</li>
     * <li>{@link #TT_MAC_LANGID_CZECH TT_MAC_LANGID_CZECH}</li>
     * <li>{@link #TT_MAC_LANGID_SLOVAK TT_MAC_LANGID_SLOVAK}</li>
     * <li>{@link #TT_MAC_LANGID_SLOVENIAN TT_MAC_LANGID_SLOVENIAN}</li>
     * <li>{@link #TT_MAC_LANGID_YIDDISH TT_MAC_LANGID_YIDDISH}</li>
     * <li>{@link #TT_MAC_LANGID_SERBIAN TT_MAC_LANGID_SERBIAN}</li>
     * <li>{@link #TT_MAC_LANGID_MACEDONIAN TT_MAC_LANGID_MACEDONIAN}</li>
     * <li>{@link #TT_MAC_LANGID_BULGARIAN TT_MAC_LANGID_BULGARIAN}</li>
     * <li>{@link #TT_MAC_LANGID_UKRAINIAN TT_MAC_LANGID_UKRAINIAN}</li>
     * <li>{@link #TT_MAC_LANGID_BYELORUSSIAN TT_MAC_LANGID_BYELORUSSIAN}</li>
     * <li>{@link #TT_MAC_LANGID_UZBEK TT_MAC_LANGID_UZBEK}</li>
     * <li>{@link #TT_MAC_LANGID_KAZAKH TT_MAC_LANGID_KAZAKH}</li>
     * <li>{@link #TT_MAC_LANGID_AZERBAIJANI TT_MAC_LANGID_AZERBAIJANI}</li>
     * <li>{@link #TT_MAC_LANGID_AZERBAIJANI_CYRILLIC_SCRIPT TT_MAC_LANGID_AZERBAIJANI_CYRILLIC_SCRIPT}</li>
     * <li>{@link #TT_MAC_LANGID_AZERBAIJANI_ARABIC_SCRIPT TT_MAC_LANGID_AZERBAIJANI_ARABIC_SCRIPT}</li>
     * <li>{@link #TT_MAC_LANGID_ARMENIAN TT_MAC_LANGID_ARMENIAN}</li>
     * <li>{@link #TT_MAC_LANGID_GEORGIAN TT_MAC_LANGID_GEORGIAN}</li>
     * <li>{@link #TT_MAC_LANGID_MOLDAVIAN TT_MAC_LANGID_MOLDAVIAN}</li>
     * <li>{@link #TT_MAC_LANGID_KIRGHIZ TT_MAC_LANGID_KIRGHIZ}</li>
     * <li>{@link #TT_MAC_LANGID_TAJIKI TT_MAC_LANGID_TAJIKI}</li>
     * <li>{@link #TT_MAC_LANGID_TURKMEN TT_MAC_LANGID_TURKMEN}</li>
     * <li>{@link #TT_MAC_LANGID_MONGOLIAN TT_MAC_LANGID_MONGOLIAN}</li>
     * <li>{@link #TT_MAC_LANGID_MONGOLIAN_MONGOLIAN_SCRIPT TT_MAC_LANGID_MONGOLIAN_MONGOLIAN_SCRIPT}</li>
     * <li>{@link #TT_MAC_LANGID_MONGOLIAN_CYRILLIC_SCRIPT TT_MAC_LANGID_MONGOLIAN_CYRILLIC_SCRIPT}</li>
     * <li>{@link #TT_MAC_LANGID_PASHTO TT_MAC_LANGID_PASHTO}</li>
     * <li>{@link #TT_MAC_LANGID_KURDISH TT_MAC_LANGID_KURDISH}</li>
     * <li>{@link #TT_MAC_LANGID_KASHMIRI TT_MAC_LANGID_KASHMIRI}</li>
     * <li>{@link #TT_MAC_LANGID_SINDHI TT_MAC_LANGID_SINDHI}</li>
     * <li>{@link #TT_MAC_LANGID_TIBETAN TT_MAC_LANGID_TIBETAN}</li>
     * <li>{@link #TT_MAC_LANGID_NEPALI TT_MAC_LANGID_NEPALI}</li>
     * <li>{@link #TT_MAC_LANGID_SANSKRIT TT_MAC_LANGID_SANSKRIT}</li>
     * <li>{@link #TT_MAC_LANGID_MARATHI TT_MAC_LANGID_MARATHI}</li>
     * <li>{@link #TT_MAC_LANGID_BENGALI TT_MAC_LANGID_BENGALI}</li>
     * <li>{@link #TT_MAC_LANGID_ASSAMESE TT_MAC_LANGID_ASSAMESE}</li>
     * <li>{@link #TT_MAC_LANGID_GUJARATI TT_MAC_LANGID_GUJARATI}</li>
     * <li>{@link #TT_MAC_LANGID_PUNJABI TT_MAC_LANGID_PUNJABI}</li>
     * <li>{@link #TT_MAC_LANGID_ORIYA TT_MAC_LANGID_ORIYA}</li>
     * <li>{@link #TT_MAC_LANGID_MALAYALAM TT_MAC_LANGID_MALAYALAM}</li>
     * <li>{@link #TT_MAC_LANGID_KANNADA TT_MAC_LANGID_KANNADA}</li>
     * <li>{@link #TT_MAC_LANGID_TAMIL TT_MAC_LANGID_TAMIL}</li>
     * <li>{@link #TT_MAC_LANGID_TELUGU TT_MAC_LANGID_TELUGU}</li>
     * <li>{@link #TT_MAC_LANGID_SINHALESE TT_MAC_LANGID_SINHALESE}</li>
     * <li>{@link #TT_MAC_LANGID_BURMESE TT_MAC_LANGID_BURMESE}</li>
     * <li>{@link #TT_MAC_LANGID_KHMER TT_MAC_LANGID_KHMER}</li>
     * <li>{@link #TT_MAC_LANGID_LAO TT_MAC_LANGID_LAO}</li>
     * <li>{@link #TT_MAC_LANGID_VIETNAMESE TT_MAC_LANGID_VIETNAMESE}</li>
     * <li>{@link #TT_MAC_LANGID_INDONESIAN TT_MAC_LANGID_INDONESIAN}</li>
     * <li>{@link #TT_MAC_LANGID_TAGALOG TT_MAC_LANGID_TAGALOG}</li>
     * <li>{@link #TT_MAC_LANGID_MALAY_ROMAN_SCRIPT TT_MAC_LANGID_MALAY_ROMAN_SCRIPT}</li>
     * <li>{@link #TT_MAC_LANGID_MALAY_ARABIC_SCRIPT TT_MAC_LANGID_MALAY_ARABIC_SCRIPT}</li>
     * <li>{@link #TT_MAC_LANGID_AMHARIC TT_MAC_LANGID_AMHARIC}</li>
     * <li>{@link #TT_MAC_LANGID_TIGRINYA TT_MAC_LANGID_TIGRINYA}</li>
     * <li>{@link #TT_MAC_LANGID_GALLA TT_MAC_LANGID_GALLA}</li>
     * <li>{@link #TT_MAC_LANGID_SOMALI TT_MAC_LANGID_SOMALI}</li>
     * <li>{@link #TT_MAC_LANGID_SWAHILI TT_MAC_LANGID_SWAHILI}</li>
     * <li>{@link #TT_MAC_LANGID_RUANDA TT_MAC_LANGID_RUANDA}</li>
     * <li>{@link #TT_MAC_LANGID_RUNDI TT_MAC_LANGID_RUNDI}</li>
     * <li>{@link #TT_MAC_LANGID_CHEWA TT_MAC_LANGID_CHEWA}</li>
     * <li>{@link #TT_MAC_LANGID_MALAGASY TT_MAC_LANGID_MALAGASY}</li>
     * <li>{@link #TT_MAC_LANGID_ESPERANTO TT_MAC_LANGID_ESPERANTO}</li>
     * <li>{@link #TT_MAC_LANGID_WELSH TT_MAC_LANGID_WELSH}</li>
     * <li>{@link #TT_MAC_LANGID_BASQUE TT_MAC_LANGID_BASQUE}</li>
     * <li>{@link #TT_MAC_LANGID_CATALAN TT_MAC_LANGID_CATALAN}</li>
     * <li>{@link #TT_MAC_LANGID_LATIN TT_MAC_LANGID_LATIN}</li>
     * <li>{@link #TT_MAC_LANGID_QUECHUA TT_MAC_LANGID_QUECHUA}</li>
     * <li>{@link #TT_MAC_LANGID_GUARANI TT_MAC_LANGID_GUARANI}</li>
     * <li>{@link #TT_MAC_LANGID_AYMARA TT_MAC_LANGID_AYMARA}</li>
     * <li>{@link #TT_MAC_LANGID_TATAR TT_MAC_LANGID_TATAR}</li>
     * <li>{@link #TT_MAC_LANGID_UIGHUR TT_MAC_LANGID_UIGHUR}</li>
     * <li>{@link #TT_MAC_LANGID_DZONGKHA TT_MAC_LANGID_DZONGKHA}</li>
     * <li>{@link #TT_MAC_LANGID_JAVANESE TT_MAC_LANGID_JAVANESE}</li>
     * <li>{@link #TT_MAC_LANGID_SUNDANESE TT_MAC_LANGID_SUNDANESE}</li>
     * <li>{@link #TT_MAC_LANGID_GALICIAN TT_MAC_LANGID_GALICIAN}</li>
     * <li>{@link #TT_MAC_LANGID_AFRIKAANS TT_MAC_LANGID_AFRIKAANS}</li>
     * <li>{@link #TT_MAC_LANGID_BRETON TT_MAC_LANGID_BRETON}</li>
     * <li>{@link #TT_MAC_LANGID_INUKTITUT TT_MAC_LANGID_INUKTITUT}</li>
     * <li>{@link #TT_MAC_LANGID_SCOTTISH_GAELIC TT_MAC_LANGID_SCOTTISH_GAELIC}</li>
     * <li>{@link #TT_MAC_LANGID_MANX_GAELIC TT_MAC_LANGID_MANX_GAELIC}</li>
     * <li>{@link #TT_MAC_LANGID_IRISH_GAELIC TT_MAC_LANGID_IRISH_GAELIC}</li>
     * <li>{@link #TT_MAC_LANGID_TONGAN TT_MAC_LANGID_TONGAN}</li>
     * <li>{@link #TT_MAC_LANGID_GREEK_POLYTONIC TT_MAC_LANGID_GREEK_POLYTONIC}</li>
     * <li>{@link #TT_MAC_LANGID_GREELANDIC TT_MAC_LANGID_GREELANDIC}</li>
     * <li>{@link #TT_MAC_LANGID_AZERBAIJANI_ROMAN_SCRIPT TT_MAC_LANGID_AZERBAIJANI_ROMAN_SCRIPT}</li>
     * </ul>
     */
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

    /**
     * {@code TT_MS_LANGID_XXX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_MS_LANGID_ARABIC_SAUDI_ARABIA TT_MS_LANGID_ARABIC_SAUDI_ARABIA}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_IRAQ TT_MS_LANGID_ARABIC_IRAQ}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_EGYPT TT_MS_LANGID_ARABIC_EGYPT}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_LIBYA TT_MS_LANGID_ARABIC_LIBYA}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_ALGERIA TT_MS_LANGID_ARABIC_ALGERIA}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_MOROCCO TT_MS_LANGID_ARABIC_MOROCCO}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_TUNISIA TT_MS_LANGID_ARABIC_TUNISIA}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_OMAN TT_MS_LANGID_ARABIC_OMAN}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_YEMEN TT_MS_LANGID_ARABIC_YEMEN}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_SYRIA TT_MS_LANGID_ARABIC_SYRIA}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_JORDAN TT_MS_LANGID_ARABIC_JORDAN}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_LEBANON TT_MS_LANGID_ARABIC_LEBANON}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_KUWAIT TT_MS_LANGID_ARABIC_KUWAIT}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_UAE TT_MS_LANGID_ARABIC_UAE}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_BAHRAIN TT_MS_LANGID_ARABIC_BAHRAIN}</li>
     * <li>{@link #TT_MS_LANGID_ARABIC_QATAR TT_MS_LANGID_ARABIC_QATAR}</li>
     * <li>{@link #TT_MS_LANGID_BULGARIAN_BULGARIA TT_MS_LANGID_BULGARIAN_BULGARIA}</li>
     * <li>{@link #TT_MS_LANGID_CATALAN_CATALAN TT_MS_LANGID_CATALAN_CATALAN}</li>
     * <li>{@link #TT_MS_LANGID_CHINESE_TAIWAN TT_MS_LANGID_CHINESE_TAIWAN}</li>
     * <li>{@link #TT_MS_LANGID_CHINESE_PRC TT_MS_LANGID_CHINESE_PRC}</li>
     * <li>{@link #TT_MS_LANGID_CHINESE_HONG_KONG TT_MS_LANGID_CHINESE_HONG_KONG}</li>
     * <li>{@link #TT_MS_LANGID_CHINESE_SINGAPORE TT_MS_LANGID_CHINESE_SINGAPORE}</li>
     * <li>{@link #TT_MS_LANGID_CHINESE_MACAO TT_MS_LANGID_CHINESE_MACAO}</li>
     * <li>{@link #TT_MS_LANGID_CZECH_CZECH_REPUBLIC TT_MS_LANGID_CZECH_CZECH_REPUBLIC}</li>
     * <li>{@link #TT_MS_LANGID_DANISH_DENMARK TT_MS_LANGID_DANISH_DENMARK}</li>
     * <li>{@link #TT_MS_LANGID_GERMAN_GERMANY TT_MS_LANGID_GERMAN_GERMANY}</li>
     * <li>{@link #TT_MS_LANGID_GERMAN_SWITZERLAND TT_MS_LANGID_GERMAN_SWITZERLAND}</li>
     * <li>{@link #TT_MS_LANGID_GERMAN_AUSTRIA TT_MS_LANGID_GERMAN_AUSTRIA}</li>
     * <li>{@link #TT_MS_LANGID_GERMAN_LUXEMBOURG TT_MS_LANGID_GERMAN_LUXEMBOURG}</li>
     * <li>{@link #TT_MS_LANGID_GERMAN_LIECHTENSTEIN TT_MS_LANGID_GERMAN_LIECHTENSTEIN}</li>
     * <li>{@link #TT_MS_LANGID_GREEK_GREECE TT_MS_LANGID_GREEK_GREECE}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_UNITED_STATES TT_MS_LANGID_ENGLISH_UNITED_STATES}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_UNITED_KINGDOM TT_MS_LANGID_ENGLISH_UNITED_KINGDOM}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_AUSTRALIA TT_MS_LANGID_ENGLISH_AUSTRALIA}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_CANADA TT_MS_LANGID_ENGLISH_CANADA}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_NEW_ZEALAND TT_MS_LANGID_ENGLISH_NEW_ZEALAND}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_IRELAND TT_MS_LANGID_ENGLISH_IRELAND}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_SOUTH_AFRICA TT_MS_LANGID_ENGLISH_SOUTH_AFRICA}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_JAMAICA TT_MS_LANGID_ENGLISH_JAMAICA}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_CARIBBEAN TT_MS_LANGID_ENGLISH_CARIBBEAN}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_BELIZE TT_MS_LANGID_ENGLISH_BELIZE}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_TRINIDAD TT_MS_LANGID_ENGLISH_TRINIDAD}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_ZIMBABWE TT_MS_LANGID_ENGLISH_ZIMBABWE}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_PHILIPPINES TT_MS_LANGID_ENGLISH_PHILIPPINES}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_INDIA TT_MS_LANGID_ENGLISH_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_MALAYSIA TT_MS_LANGID_ENGLISH_MALAYSIA}</li>
     * <li>{@link #TT_MS_LANGID_ENGLISH_SINGAPORE TT_MS_LANGID_ENGLISH_SINGAPORE}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_SPAIN_TRADITIONAL_SORT TT_MS_LANGID_SPANISH_SPAIN_TRADITIONAL_SORT}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_MEXICO TT_MS_LANGID_SPANISH_MEXICO}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_SPAIN_MODERN_SORT TT_MS_LANGID_SPANISH_SPAIN_MODERN_SORT}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_GUATEMALA TT_MS_LANGID_SPANISH_GUATEMALA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_COSTA_RICA TT_MS_LANGID_SPANISH_COSTA_RICA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_PANAMA TT_MS_LANGID_SPANISH_PANAMA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_DOMINICAN_REPUBLIC TT_MS_LANGID_SPANISH_DOMINICAN_REPUBLIC}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_VENEZUELA TT_MS_LANGID_SPANISH_VENEZUELA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_COLOMBIA TT_MS_LANGID_SPANISH_COLOMBIA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_PERU TT_MS_LANGID_SPANISH_PERU}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_ARGENTINA TT_MS_LANGID_SPANISH_ARGENTINA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_ECUADOR TT_MS_LANGID_SPANISH_ECUADOR}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_CHILE TT_MS_LANGID_SPANISH_CHILE}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_URUGUAY TT_MS_LANGID_SPANISH_URUGUAY}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_PARAGUAY TT_MS_LANGID_SPANISH_PARAGUAY}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_BOLIVIA TT_MS_LANGID_SPANISH_BOLIVIA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_EL_SALVADOR TT_MS_LANGID_SPANISH_EL_SALVADOR}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_HONDURAS TT_MS_LANGID_SPANISH_HONDURAS}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_NICARAGUA TT_MS_LANGID_SPANISH_NICARAGUA}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_PUERTO_RICO TT_MS_LANGID_SPANISH_PUERTO_RICO}</li>
     * <li>{@link #TT_MS_LANGID_SPANISH_UNITED_STATES TT_MS_LANGID_SPANISH_UNITED_STATES}</li>
     * <li>{@link #TT_MS_LANGID_FINNISH_FINLAND TT_MS_LANGID_FINNISH_FINLAND}</li>
     * <li>{@link #TT_MS_LANGID_FRENCH_FRANCE TT_MS_LANGID_FRENCH_FRANCE}</li>
     * <li>{@link #TT_MS_LANGID_FRENCH_BELGIUM TT_MS_LANGID_FRENCH_BELGIUM}</li>
     * <li>{@link #TT_MS_LANGID_FRENCH_CANADA TT_MS_LANGID_FRENCH_CANADA}</li>
     * <li>{@link #TT_MS_LANGID_FRENCH_SWITZERLAND TT_MS_LANGID_FRENCH_SWITZERLAND}</li>
     * <li>{@link #TT_MS_LANGID_FRENCH_LUXEMBOURG TT_MS_LANGID_FRENCH_LUXEMBOURG}</li>
     * <li>{@link #TT_MS_LANGID_FRENCH_MONACO TT_MS_LANGID_FRENCH_MONACO}</li>
     * <li>{@link #TT_MS_LANGID_HEBREW_ISRAEL TT_MS_LANGID_HEBREW_ISRAEL}</li>
     * <li>{@link #TT_MS_LANGID_HUNGARIAN_HUNGARY TT_MS_LANGID_HUNGARIAN_HUNGARY}</li>
     * <li>{@link #TT_MS_LANGID_ICELANDIC_ICELAND TT_MS_LANGID_ICELANDIC_ICELAND}</li>
     * <li>{@link #TT_MS_LANGID_ITALIAN_ITALY TT_MS_LANGID_ITALIAN_ITALY}</li>
     * <li>{@link #TT_MS_LANGID_ITALIAN_SWITZERLAND TT_MS_LANGID_ITALIAN_SWITZERLAND}</li>
     * <li>{@link #TT_MS_LANGID_JAPANESE_JAPAN TT_MS_LANGID_JAPANESE_JAPAN}</li>
     * <li>{@link #TT_MS_LANGID_KOREAN_KOREA TT_MS_LANGID_KOREAN_KOREA}</li>
     * <li>{@link #TT_MS_LANGID_DUTCH_NETHERLANDS TT_MS_LANGID_DUTCH_NETHERLANDS}</li>
     * <li>{@link #TT_MS_LANGID_DUTCH_BELGIUM TT_MS_LANGID_DUTCH_BELGIUM}</li>
     * <li>{@link #TT_MS_LANGID_NORWEGIAN_NORWAY_BOKMAL TT_MS_LANGID_NORWEGIAN_NORWAY_BOKMAL}</li>
     * <li>{@link #TT_MS_LANGID_NORWEGIAN_NORWAY_NYNORSK TT_MS_LANGID_NORWEGIAN_NORWAY_NYNORSK}</li>
     * <li>{@link #TT_MS_LANGID_POLISH_POLAND TT_MS_LANGID_POLISH_POLAND}</li>
     * <li>{@link #TT_MS_LANGID_PORTUGUESE_BRAZIL TT_MS_LANGID_PORTUGUESE_BRAZIL}</li>
     * <li>{@link #TT_MS_LANGID_PORTUGUESE_PORTUGAL TT_MS_LANGID_PORTUGUESE_PORTUGAL}</li>
     * <li>{@link #TT_MS_LANGID_ROMANSH_SWITZERLAND TT_MS_LANGID_ROMANSH_SWITZERLAND}</li>
     * <li>{@link #TT_MS_LANGID_ROMANIAN_ROMANIA TT_MS_LANGID_ROMANIAN_ROMANIA}</li>
     * <li>{@link #TT_MS_LANGID_RUSSIAN_RUSSIA TT_MS_LANGID_RUSSIAN_RUSSIA}</li>
     * <li>{@link #TT_MS_LANGID_CROATIAN_CROATIA TT_MS_LANGID_CROATIAN_CROATIA}</li>
     * <li>{@link #TT_MS_LANGID_SERBIAN_SERBIA_LATIN TT_MS_LANGID_SERBIAN_SERBIA_LATIN}</li>
     * <li>{@link #TT_MS_LANGID_SERBIAN_SERBIA_CYRILLIC TT_MS_LANGID_SERBIAN_SERBIA_CYRILLIC}</li>
     * <li>{@link #TT_MS_LANGID_CROATIAN_BOSNIA_HERZEGOVINA TT_MS_LANGID_CROATIAN_BOSNIA_HERZEGOVINA}</li>
     * <li>{@link #TT_MS_LANGID_BOSNIAN_BOSNIA_HERZEGOVINA TT_MS_LANGID_BOSNIAN_BOSNIA_HERZEGOVINA}</li>
     * <li>{@link #TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_LATIN TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_LATIN}</li>
     * <li>{@link #TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_CYRILLIC TT_MS_LANGID_SERBIAN_BOSNIA_HERZ_CYRILLIC}</li>
     * <li>{@link #TT_MS_LANGID_BOSNIAN_BOSNIA_HERZ_CYRILLIC TT_MS_LANGID_BOSNIAN_BOSNIA_HERZ_CYRILLIC}</li>
     * <li>{@link #TT_MS_LANGID_SLOVAK_SLOVAKIA TT_MS_LANGID_SLOVAK_SLOVAKIA}</li>
     * <li>{@link #TT_MS_LANGID_ALBANIAN_ALBANIA TT_MS_LANGID_ALBANIAN_ALBANIA}</li>
     * <li>{@link #TT_MS_LANGID_SWEDISH_SWEDEN TT_MS_LANGID_SWEDISH_SWEDEN}</li>
     * <li>{@link #TT_MS_LANGID_SWEDISH_FINLAND TT_MS_LANGID_SWEDISH_FINLAND}</li>
     * <li>{@link #TT_MS_LANGID_THAI_THAILAND TT_MS_LANGID_THAI_THAILAND}</li>
     * <li>{@link #TT_MS_LANGID_TURKISH_TURKEY TT_MS_LANGID_TURKISH_TURKEY}</li>
     * <li>{@link #TT_MS_LANGID_URDU_PAKISTAN TT_MS_LANGID_URDU_PAKISTAN}</li>
     * <li>{@link #TT_MS_LANGID_INDONESIAN_INDONESIA TT_MS_LANGID_INDONESIAN_INDONESIA}</li>
     * <li>{@link #TT_MS_LANGID_UKRAINIAN_UKRAINE TT_MS_LANGID_UKRAINIAN_UKRAINE}</li>
     * <li>{@link #TT_MS_LANGID_BELARUSIAN_BELARUS TT_MS_LANGID_BELARUSIAN_BELARUS}</li>
     * <li>{@link #TT_MS_LANGID_SLOVENIAN_SLOVENIA TT_MS_LANGID_SLOVENIAN_SLOVENIA}</li>
     * <li>{@link #TT_MS_LANGID_ESTONIAN_ESTONIA TT_MS_LANGID_ESTONIAN_ESTONIA}</li>
     * <li>{@link #TT_MS_LANGID_LATVIAN_LATVIA TT_MS_LANGID_LATVIAN_LATVIA}</li>
     * <li>{@link #TT_MS_LANGID_LITHUANIAN_LITHUANIA TT_MS_LANGID_LITHUANIAN_LITHUANIA}</li>
     * <li>{@link #TT_MS_LANGID_TAJIK_TAJIKISTAN TT_MS_LANGID_TAJIK_TAJIKISTAN}</li>
     * <li>{@link #TT_MS_LANGID_VIETNAMESE_VIET_NAM TT_MS_LANGID_VIETNAMESE_VIET_NAM}</li>
     * <li>{@link #TT_MS_LANGID_ARMENIAN_ARMENIA TT_MS_LANGID_ARMENIAN_ARMENIA}</li>
     * <li>{@link #TT_MS_LANGID_AZERI_AZERBAIJAN_LATIN TT_MS_LANGID_AZERI_AZERBAIJAN_LATIN}</li>
     * <li>{@link #TT_MS_LANGID_AZERI_AZERBAIJAN_CYRILLIC TT_MS_LANGID_AZERI_AZERBAIJAN_CYRILLIC}</li>
     * <li>{@link #TT_MS_LANGID_BASQUE_BASQUE TT_MS_LANGID_BASQUE_BASQUE}</li>
     * <li>{@link #TT_MS_LANGID_UPPER_SORBIAN_GERMANY TT_MS_LANGID_UPPER_SORBIAN_GERMANY}</li>
     * <li>{@link #TT_MS_LANGID_LOWER_SORBIAN_GERMANY TT_MS_LANGID_LOWER_SORBIAN_GERMANY}</li>
     * <li>{@link #TT_MS_LANGID_MACEDONIAN_MACEDONIA TT_MS_LANGID_MACEDONIAN_MACEDONIA}</li>
     * <li>{@link #TT_MS_LANGID_SETSWANA_SOUTH_AFRICA TT_MS_LANGID_SETSWANA_SOUTH_AFRICA}</li>
     * <li>{@link #TT_MS_LANGID_ISIXHOSA_SOUTH_AFRICA TT_MS_LANGID_ISIXHOSA_SOUTH_AFRICA}</li>
     * <li>{@link #TT_MS_LANGID_ISIZULU_SOUTH_AFRICA TT_MS_LANGID_ISIZULU_SOUTH_AFRICA}</li>
     * <li>{@link #TT_MS_LANGID_AFRIKAANS_SOUTH_AFRICA TT_MS_LANGID_AFRIKAANS_SOUTH_AFRICA}</li>
     * <li>{@link #TT_MS_LANGID_GEORGIAN_GEORGIA TT_MS_LANGID_GEORGIAN_GEORGIA}</li>
     * <li>{@link #TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS}</li>
     * <li>{@link #TT_MS_LANGID_HINDI_INDIA TT_MS_LANGID_HINDI_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_MALTESE_MALTA TT_MS_LANGID_MALTESE_MALTA}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_NORTHERN_NORWAY TT_MS_LANGID_SAMI_NORTHERN_NORWAY}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_NORTHERN_SWEDEN TT_MS_LANGID_SAMI_NORTHERN_SWEDEN}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_NORTHERN_FINLAND TT_MS_LANGID_SAMI_NORTHERN_FINLAND}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_LULE_NORWAY TT_MS_LANGID_SAMI_LULE_NORWAY}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_LULE_SWEDEN TT_MS_LANGID_SAMI_LULE_SWEDEN}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_SOUTHERN_NORWAY TT_MS_LANGID_SAMI_SOUTHERN_NORWAY}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_SOUTHERN_SWEDEN TT_MS_LANGID_SAMI_SOUTHERN_SWEDEN}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_SKOLT_FINLAND TT_MS_LANGID_SAMI_SKOLT_FINLAND}</li>
     * <li>{@link #TT_MS_LANGID_SAMI_INARI_FINLAND TT_MS_LANGID_SAMI_INARI_FINLAND}</li>
     * <li>{@link #TT_MS_LANGID_IRISH_IRELAND TT_MS_LANGID_IRISH_IRELAND}</li>
     * <li>{@link #TT_MS_LANGID_MALAY_MALAYSIA TT_MS_LANGID_MALAY_MALAYSIA}</li>
     * <li>{@link #TT_MS_LANGID_MALAY_BRUNEI_DARUSSALAM TT_MS_LANGID_MALAY_BRUNEI_DARUSSALAM}</li>
     * <li>{@link #TT_MS_LANGID_KAZAKH_KAZAKHSTAN TT_MS_LANGID_KAZAKH_KAZAKHSTAN}</li>
     * <li>{@link #TT_MS_LANGID_KYRGYZ_KYRGYZSTAN TT_MS_LANGID_KYRGYZ_KYRGYZSTAN}</li>
     * <li>{@link #TT_MS_LANGID_KISWAHILI_KENYA TT_MS_LANGID_KISWAHILI_KENYA}</li>
     * <li>{@link #TT_MS_LANGID_TURKMEN_TURKMENISTAN TT_MS_LANGID_TURKMEN_TURKMENISTAN}</li>
     * <li>{@link #TT_MS_LANGID_UZBEK_UZBEKISTAN_LATIN TT_MS_LANGID_UZBEK_UZBEKISTAN_LATIN}</li>
     * <li>{@link #TT_MS_LANGID_UZBEK_UZBEKISTAN_CYRILLIC TT_MS_LANGID_UZBEK_UZBEKISTAN_CYRILLIC}</li>
     * <li>{@link #TT_MS_LANGID_TATAR_RUSSIA TT_MS_LANGID_TATAR_RUSSIA}</li>
     * <li>{@link #TT_MS_LANGID_BENGALI_INDIA TT_MS_LANGID_BENGALI_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_BENGALI_BANGLADESH TT_MS_LANGID_BENGALI_BANGLADESH}</li>
     * <li>{@link #TT_MS_LANGID_PUNJABI_INDIA TT_MS_LANGID_PUNJABI_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_GUJARATI_INDIA TT_MS_LANGID_GUJARATI_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_ODIA_INDIA TT_MS_LANGID_ODIA_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_TAMIL_INDIA TT_MS_LANGID_TAMIL_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_TELUGU_INDIA TT_MS_LANGID_TELUGU_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_KANNADA_INDIA TT_MS_LANGID_KANNADA_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_MALAYALAM_INDIA TT_MS_LANGID_MALAYALAM_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_ASSAMESE_INDIA TT_MS_LANGID_ASSAMESE_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_MARATHI_INDIA TT_MS_LANGID_MARATHI_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_SANSKRIT_INDIA TT_MS_LANGID_SANSKRIT_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_MONGOLIAN_MONGOLIA TT_MS_LANGID_MONGOLIAN_MONGOLIA}</li>
     * <li>{@link #TT_MS_LANGID_MONGOLIAN_PRC TT_MS_LANGID_MONGOLIAN_PRC}</li>
     * <li>{@link #TT_MS_LANGID_TIBETAN_PRC TT_MS_LANGID_TIBETAN_PRC}</li>
     * <li>{@link #TT_MS_LANGID_WELSH_UNITED_KINGDOM TT_MS_LANGID_WELSH_UNITED_KINGDOM}</li>
     * <li>{@link #TT_MS_LANGID_KHMER_CAMBODIA TT_MS_LANGID_KHMER_CAMBODIA}</li>
     * <li>{@link #TT_MS_LANGID_LAO_LAOS TT_MS_LANGID_LAO_LAOS}</li>
     * <li>{@link #TT_MS_LANGID_GALICIAN_GALICIAN TT_MS_LANGID_GALICIAN_GALICIAN}</li>
     * <li>{@link #TT_MS_LANGID_KONKANI_INDIA TT_MS_LANGID_KONKANI_INDIA}</li>
     * <li>{@link #TT_MS_LANGID_SYRIAC_SYRIA TT_MS_LANGID_SYRIAC_SYRIA}</li>
     * <li>{@link #TT_MS_LANGID_SINHALA_SRI_LANKA TT_MS_LANGID_SINHALA_SRI_LANKA}</li>
     * <li>{@link #TT_MS_LANGID_INUKTITUT_CANADA TT_MS_LANGID_INUKTITUT_CANADA}</li>
     * <li>{@link #TT_MS_LANGID_INUKTITUT_CANADA_LATIN TT_MS_LANGID_INUKTITUT_CANADA_LATIN}</li>
     * <li>{@link #TT_MS_LANGID_AMHARIC_ETHIOPIA TT_MS_LANGID_AMHARIC_ETHIOPIA}</li>
     * <li>{@link #TT_MS_LANGID_TAMAZIGHT_ALGERIA TT_MS_LANGID_TAMAZIGHT_ALGERIA}</li>
     * <li>{@link #TT_MS_LANGID_NEPALI_NEPAL TT_MS_LANGID_NEPALI_NEPAL}</li>
     * <li>{@link #TT_MS_LANGID_FRISIAN_NETHERLANDS TT_MS_LANGID_FRISIAN_NETHERLANDS}</li>
     * <li>{@link #TT_MS_LANGID_PASHTO_AFGHANISTAN TT_MS_LANGID_PASHTO_AFGHANISTAN}</li>
     * <li>{@link #TT_MS_LANGID_FILIPINO_PHILIPPINES TT_MS_LANGID_FILIPINO_PHILIPPINES}</li>
     * <li>{@link #TT_MS_LANGID_DHIVEHI_MALDIVES TT_MS_LANGID_DHIVEHI_MALDIVES}</li>
     * <li>{@link #TT_MS_LANGID_HAUSA_NIGERIA TT_MS_LANGID_HAUSA_NIGERIA}</li>
     * <li>{@link #TT_MS_LANGID_YORUBA_NIGERIA TT_MS_LANGID_YORUBA_NIGERIA}</li>
     * <li>{@link #TT_MS_LANGID_QUECHUA_BOLIVIA TT_MS_LANGID_QUECHUA_BOLIVIA}</li>
     * <li>{@link #TT_MS_LANGID_QUECHUA_ECUADOR TT_MS_LANGID_QUECHUA_ECUADOR}</li>
     * <li>{@link #TT_MS_LANGID_QUECHUA_PERU TT_MS_LANGID_QUECHUA_PERU}</li>
     * <li>{@link #TT_MS_LANGID_SESOTHO_SA_LEBOA_SOUTH_AFRICA TT_MS_LANGID_SESOTHO_SA_LEBOA_SOUTH_AFRICA}</li>
     * <li>{@link #TT_MS_LANGID_BASHKIR_RUSSIA TT_MS_LANGID_BASHKIR_RUSSIA}</li>
     * <li>{@link #TT_MS_LANGID_LUXEMBOURGISH_LUXEMBOURG TT_MS_LANGID_LUXEMBOURGISH_LUXEMBOURG}</li>
     * <li>{@link #TT_MS_LANGID_GREENLANDIC_GREENLAND TT_MS_LANGID_GREENLANDIC_GREENLAND}</li>
     * <li>{@link #TT_MS_LANGID_IGBO_NIGERIA TT_MS_LANGID_IGBO_NIGERIA}</li>
     * <li>{@link #TT_MS_LANGID_YI_PRC TT_MS_LANGID_YI_PRC}</li>
     * <li>{@link #TT_MS_LANGID_MAPUDUNGUN_CHILE TT_MS_LANGID_MAPUDUNGUN_CHILE}</li>
     * <li>{@link #TT_MS_LANGID_MOHAWK_MOHAWK TT_MS_LANGID_MOHAWK_MOHAWK}</li>
     * <li>{@link #TT_MS_LANGID_BRETON_FRANCE TT_MS_LANGID_BRETON_FRANCE}</li>
     * <li>{@link #TT_MS_LANGID_UIGHUR_PRC TT_MS_LANGID_UIGHUR_PRC}</li>
     * <li>{@link #TT_MS_LANGID_MAORI_NEW_ZEALAND TT_MS_LANGID_MAORI_NEW_ZEALAND}</li>
     * <li>{@link #TT_MS_LANGID_OCCITAN_FRANCE TT_MS_LANGID_OCCITAN_FRANCE}</li>
     * <li>{@link #TT_MS_LANGID_CORSICAN_FRANCE TT_MS_LANGID_CORSICAN_FRANCE}</li>
     * <li>{@link #TT_MS_LANGID_ALSATIAN_FRANCE TT_MS_LANGID_ALSATIAN_FRANCE}</li>
     * <li>{@link #TT_MS_LANGID_YAKUT_RUSSIA TT_MS_LANGID_YAKUT_RUSSIA}</li>
     * <li>{@link #TT_MS_LANGID_KICHE_GUATEMALA TT_MS_LANGID_KICHE_GUATEMALA}</li>
     * <li>{@link #TT_MS_LANGID_KINYARWANDA_RWANDA TT_MS_LANGID_KINYARWANDA_RWANDA}</li>
     * <li>{@link #TT_MS_LANGID_WOLOF_SENEGAL TT_MS_LANGID_WOLOF_SENEGAL}</li>
     * <li>{@link #TT_MS_LANGID_DARI_AFGHANISTAN TT_MS_LANGID_DARI_AFGHANISTAN}</li>
     * </ul>
     */
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

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_NAME_ID_COPYRIGHT TT_NAME_ID_COPYRIGHT}</li>
     * <li>{@link #TT_NAME_ID_FONT_FAMILY TT_NAME_ID_FONT_FAMILY}</li>
     * <li>{@link #TT_NAME_ID_FONT_SUBFAMILY TT_NAME_ID_FONT_SUBFAMILY}</li>
     * <li>{@link #TT_NAME_ID_UNIQUE_ID TT_NAME_ID_UNIQUE_ID}</li>
     * <li>{@link #TT_NAME_ID_FULL_NAME TT_NAME_ID_FULL_NAME}</li>
     * <li>{@link #TT_NAME_ID_VERSION_STRING TT_NAME_ID_VERSION_STRING}</li>
     * <li>{@link #TT_NAME_ID_PS_NAME TT_NAME_ID_PS_NAME}</li>
     * <li>{@link #TT_NAME_ID_TRADEMARK TT_NAME_ID_TRADEMARK}</li>
     * <li>{@link #TT_NAME_ID_MANUFACTURER TT_NAME_ID_MANUFACTURER}</li>
     * <li>{@link #TT_NAME_ID_DESIGNER TT_NAME_ID_DESIGNER}</li>
     * <li>{@link #TT_NAME_ID_DESCRIPTION TT_NAME_ID_DESCRIPTION}</li>
     * <li>{@link #TT_NAME_ID_VENDOR_URL TT_NAME_ID_VENDOR_URL}</li>
     * <li>{@link #TT_NAME_ID_DESIGNER_URL TT_NAME_ID_DESIGNER_URL}</li>
     * <li>{@link #TT_NAME_ID_LICENSE TT_NAME_ID_LICENSE}</li>
     * <li>{@link #TT_NAME_ID_LICENSE_URL TT_NAME_ID_LICENSE_URL}</li>
     * <li>{@link #TT_NAME_ID_TYPOGRAPHIC_FAMILY TT_NAME_ID_TYPOGRAPHIC_FAMILY}</li>
     * <li>{@link #TT_NAME_ID_TYPOGRAPHIC_SUBFAMILY TT_NAME_ID_TYPOGRAPHIC_SUBFAMILY}</li>
     * <li>{@link #TT_NAME_ID_MAC_FULL_NAME TT_NAME_ID_MAC_FULL_NAME}</li>
     * <li>{@link #TT_NAME_ID_SAMPLE_TEXT TT_NAME_ID_SAMPLE_TEXT}</li>
     * <li>{@link #TT_NAME_ID_CID_FINDFONT_NAME TT_NAME_ID_CID_FINDFONT_NAME}</li>
     * <li>{@link #TT_NAME_ID_WWS_FAMILY TT_NAME_ID_WWS_FAMILY}</li>
     * <li>{@link #TT_NAME_ID_WWS_SUBFAMILY TT_NAME_ID_WWS_SUBFAMILY}</li>
     * <li>{@link #TT_NAME_ID_LIGHT_BACKGROUND TT_NAME_ID_LIGHT_BACKGROUND}</li>
     * <li>{@link #TT_NAME_ID_DARK_BACKGROUND TT_NAME_ID_DARK_BACKGROUND}</li>
     * <li>{@link #TT_NAME_ID_VARIATIONS_PREFIX TT_NAME_ID_VARIATIONS_PREFIX}</li>
     * </ul>
     */
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

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TT_UCR_BASIC_LATIN TT_UCR_BASIC_LATIN}</li>
     * <li>{@link #TT_UCR_LATIN1_SUPPLEMENT TT_UCR_LATIN1_SUPPLEMENT}</li>
     * <li>{@link #TT_UCR_LATIN_EXTENDED_A TT_UCR_LATIN_EXTENDED_A}</li>
     * <li>{@link #TT_UCR_LATIN_EXTENDED_B TT_UCR_LATIN_EXTENDED_B}</li>
     * <li>{@link #TT_UCR_IPA_EXTENSIONS TT_UCR_IPA_EXTENSIONS}</li>
     * <li>{@link #TT_UCR_SPACING_MODIFIER TT_UCR_SPACING_MODIFIER}</li>
     * <li>{@link #TT_UCR_COMBINING_DIACRITICAL_MARKS TT_UCR_COMBINING_DIACRITICAL_MARKS}</li>
     * <li>{@link #TT_UCR_GREEK TT_UCR_GREEK}</li>
     * <li>{@link #TT_UCR_COPTIC TT_UCR_COPTIC}</li>
     * <li>{@link #TT_UCR_CYRILLIC TT_UCR_CYRILLIC}</li>
     * <li>{@link #TT_UCR_ARMENIAN TT_UCR_ARMENIAN}</li>
     * <li>{@link #TT_UCR_HEBREW TT_UCR_HEBREW}</li>
     * <li>{@link #TT_UCR_VAI TT_UCR_VAI}</li>
     * <li>{@link #TT_UCR_ARABIC TT_UCR_ARABIC}</li>
     * <li>{@link #TT_UCR_NKO TT_UCR_NKO}</li>
     * <li>{@link #TT_UCR_DEVANAGARI TT_UCR_DEVANAGARI}</li>
     * <li>{@link #TT_UCR_BENGALI TT_UCR_BENGALI}</li>
     * <li>{@link #TT_UCR_GURMUKHI TT_UCR_GURMUKHI}</li>
     * <li>{@link #TT_UCR_GUJARATI TT_UCR_GUJARATI}</li>
     * <li>{@link #TT_UCR_ORIYA TT_UCR_ORIYA}</li>
     * <li>{@link #TT_UCR_TAMIL TT_UCR_TAMIL}</li>
     * <li>{@link #TT_UCR_TELUGU TT_UCR_TELUGU}</li>
     * <li>{@link #TT_UCR_KANNADA TT_UCR_KANNADA}</li>
     * <li>{@link #TT_UCR_MALAYALAM TT_UCR_MALAYALAM}</li>
     * <li>{@link #TT_UCR_THAI TT_UCR_THAI}</li>
     * <li>{@link #TT_UCR_LAO TT_UCR_LAO}</li>
     * <li>{@link #TT_UCR_GEORGIAN TT_UCR_GEORGIAN}</li>
     * <li>{@link #TT_UCR_BALINESE TT_UCR_BALINESE}</li>
     * <li>{@link #TT_UCR_HANGUL_JAMO TT_UCR_HANGUL_JAMO}</li>
     * <li>{@link #TT_UCR_LATIN_EXTENDED_ADDITIONAL TT_UCR_LATIN_EXTENDED_ADDITIONAL}</li>
     * <li>{@link #TT_UCR_GREEK_EXTENDED TT_UCR_GREEK_EXTENDED}</li>
     * <li>{@link #TT_UCR_GENERAL_PUNCTUATION TT_UCR_GENERAL_PUNCTUATION}</li>
     * <li>{@link #TT_UCR_SUPERSCRIPTS_SUBSCRIPTS TT_UCR_SUPERSCRIPTS_SUBSCRIPTS}</li>
     * <li>{@link #TT_UCR_CURRENCY_SYMBOLS TT_UCR_CURRENCY_SYMBOLS}</li>
     * <li>{@link #TT_UCR_COMBINING_DIACRITICAL_MARKS_SYMB TT_UCR_COMBINING_DIACRITICAL_MARKS_SYMB}</li>
     * <li>{@link #TT_UCR_LETTERLIKE_SYMBOLS TT_UCR_LETTERLIKE_SYMBOLS}</li>
     * <li>{@link #TT_UCR_NUMBER_FORMS TT_UCR_NUMBER_FORMS}</li>
     * <li>{@link #TT_UCR_ARROWS TT_UCR_ARROWS}</li>
     * <li>{@link #TT_UCR_MATHEMATICAL_OPERATORS TT_UCR_MATHEMATICAL_OPERATORS}</li>
     * <li>{@link #TT_UCR_MISCELLANEOUS_TECHNICAL TT_UCR_MISCELLANEOUS_TECHNICAL}</li>
     * <li>{@link #TT_UCR_CONTROL_PICTURES TT_UCR_CONTROL_PICTURES}</li>
     * <li>{@link #TT_UCR_OCR TT_UCR_OCR}</li>
     * <li>{@link #TT_UCR_ENCLOSED_ALPHANUMERICS TT_UCR_ENCLOSED_ALPHANUMERICS}</li>
     * <li>{@link #TT_UCR_BOX_DRAWING TT_UCR_BOX_DRAWING}</li>
     * <li>{@link #TT_UCR_BLOCK_ELEMENTS TT_UCR_BLOCK_ELEMENTS}</li>
     * <li>{@link #TT_UCR_GEOMETRIC_SHAPES TT_UCR_GEOMETRIC_SHAPES}</li>
     * <li>{@link #TT_UCR_MISCELLANEOUS_SYMBOLS TT_UCR_MISCELLANEOUS_SYMBOLS}</li>
     * <li>{@link #TT_UCR_DINGBATS TT_UCR_DINGBATS}</li>
     * <li>{@link #TT_UCR_CJK_SYMBOLS TT_UCR_CJK_SYMBOLS}</li>
     * <li>{@link #TT_UCR_HIRAGANA TT_UCR_HIRAGANA}</li>
     * <li>{@link #TT_UCR_KATAKANA TT_UCR_KATAKANA}</li>
     * <li>{@link #TT_UCR_BOPOMOFO TT_UCR_BOPOMOFO}</li>
     * <li>{@link #TT_UCR_HANGUL_COMPATIBILITY_JAMO TT_UCR_HANGUL_COMPATIBILITY_JAMO}</li>
     * <li>{@link #TT_UCR_CJK_MISC TT_UCR_CJK_MISC}</li>
     * <li>{@link #TT_UCR_ENCLOSED_CJK_LETTERS_MONTHS TT_UCR_ENCLOSED_CJK_LETTERS_MONTHS}</li>
     * <li>{@link #TT_UCR_CJK_COMPATIBILITY TT_UCR_CJK_COMPATIBILITY}</li>
     * <li>{@link #TT_UCR_HANGUL TT_UCR_HANGUL}</li>
     * <li>{@link #TT_UCR_SURROGATES TT_UCR_SURROGATES}</li>
     * <li>{@link #TT_UCR_PHOENICIAN TT_UCR_PHOENICIAN}</li>
     * <li>{@link #TT_UCR_CJK_UNIFIED_IDEOGRAPHS TT_UCR_CJK_UNIFIED_IDEOGRAPHS}</li>
     * <li>{@link #TT_UCR_PRIVATE_USE TT_UCR_PRIVATE_USE}</li>
     * <li>{@link #TT_UCR_CJK_COMPATIBILITY_IDEOGRAPHS TT_UCR_CJK_COMPATIBILITY_IDEOGRAPHS}</li>
     * <li>{@link #TT_UCR_ALPHABETIC_PRESENTATION_FORMS TT_UCR_ALPHABETIC_PRESENTATION_FORMS}</li>
     * <li>{@link #TT_UCR_ARABIC_PRESENTATION_FORMS_A TT_UCR_ARABIC_PRESENTATION_FORMS_A}</li>
     * <li>{@link #TT_UCR_COMBINING_HALF_MARKS TT_UCR_COMBINING_HALF_MARKS}</li>
     * <li>{@link #TT_UCR_CJK_COMPATIBILITY_FORMS TT_UCR_CJK_COMPATIBILITY_FORMS}</li>
     * <li>{@link #TT_UCR_SMALL_FORM_VARIANTS TT_UCR_SMALL_FORM_VARIANTS}</li>
     * <li>{@link #TT_UCR_ARABIC_PRESENTATION_FORMS_B TT_UCR_ARABIC_PRESENTATION_FORMS_B}</li>
     * <li>{@link #TT_UCR_HALFWIDTH_FULLWIDTH_FORMS TT_UCR_HALFWIDTH_FULLWIDTH_FORMS}</li>
     * <li>{@link #TT_UCR_SPECIALS TT_UCR_SPECIALS}</li>
     * <li>{@link #TT_UCR_TIBETAN TT_UCR_TIBETAN}</li>
     * <li>{@link #TT_UCR_SYRIAC TT_UCR_SYRIAC}</li>
     * <li>{@link #TT_UCR_THAANA TT_UCR_THAANA}</li>
     * <li>{@link #TT_UCR_SINHALA TT_UCR_SINHALA}</li>
     * <li>{@link #TT_UCR_MYANMAR TT_UCR_MYANMAR}</li>
     * <li>{@link #TT_UCR_ETHIOPIC TT_UCR_ETHIOPIC}</li>
     * <li>{@link #TT_UCR_CHEROKEE TT_UCR_CHEROKEE}</li>
     * <li>{@link #TT_UCR_CANADIAN_ABORIGINAL_SYLLABICS TT_UCR_CANADIAN_ABORIGINAL_SYLLABICS}</li>
     * <li>{@link #TT_UCR_OGHAM TT_UCR_OGHAM}</li>
     * <li>{@link #TT_UCR_RUNIC TT_UCR_RUNIC}</li>
     * <li>{@link #TT_UCR_KHMER TT_UCR_KHMER}</li>
     * <li>{@link #TT_UCR_MONGOLIAN TT_UCR_MONGOLIAN}</li>
     * <li>{@link #TT_UCR_BRAILLE TT_UCR_BRAILLE}</li>
     * <li>{@link #TT_UCR_YI TT_UCR_YI}</li>
     * <li>{@link #TT_UCR_PHILIPPINE TT_UCR_PHILIPPINE}</li>
     * <li>{@link #TT_UCR_OLD_ITALIC TT_UCR_OLD_ITALIC}</li>
     * <li>{@link #TT_UCR_GOTHIC TT_UCR_GOTHIC}</li>
     * <li>{@link #TT_UCR_DESERET TT_UCR_DESERET}</li>
     * <li>{@link #TT_UCR_MUSICAL_SYMBOLS TT_UCR_MUSICAL_SYMBOLS}</li>
     * <li>{@link #TT_UCR_MATH_ALPHANUMERIC_SYMBOLS TT_UCR_MATH_ALPHANUMERIC_SYMBOLS}</li>
     * <li>{@link #TT_UCR_PRIVATE_USE_SUPPLEMENTARY TT_UCR_PRIVATE_USE_SUPPLEMENTARY}</li>
     * <li>{@link #TT_UCR_VARIATION_SELECTORS TT_UCR_VARIATION_SELECTORS}</li>
     * <li>{@link #TT_UCR_TAGS TT_UCR_TAGS}</li>
     * <li>{@link #TT_UCR_LIMBU TT_UCR_LIMBU}</li>
     * <li>{@link #TT_UCR_TAI_LE TT_UCR_TAI_LE}</li>
     * <li>{@link #TT_UCR_NEW_TAI_LUE TT_UCR_NEW_TAI_LUE}</li>
     * <li>{@link #TT_UCR_BUGINESE TT_UCR_BUGINESE}</li>
     * <li>{@link #TT_UCR_GLAGOLITIC TT_UCR_GLAGOLITIC}</li>
     * <li>{@link #TT_UCR_TIFINAGH TT_UCR_TIFINAGH}</li>
     * <li>{@link #TT_UCR_YIJING TT_UCR_YIJING}</li>
     * <li>{@link #TT_UCR_SYLOTI_NAGRI TT_UCR_SYLOTI_NAGRI}</li>
     * <li>{@link #TT_UCR_LINEAR_B TT_UCR_LINEAR_B}</li>
     * <li>{@link #TT_UCR_ANCIENT_GREEK_NUMBERS TT_UCR_ANCIENT_GREEK_NUMBERS}</li>
     * <li>{@link #TT_UCR_UGARITIC TT_UCR_UGARITIC}</li>
     * <li>{@link #TT_UCR_OLD_PERSIAN TT_UCR_OLD_PERSIAN}</li>
     * <li>{@link #TT_UCR_SHAVIAN TT_UCR_SHAVIAN}</li>
     * <li>{@link #TT_UCR_OSMANYA TT_UCR_OSMANYA}</li>
     * <li>{@link #TT_UCR_CYPRIOT_SYLLABARY TT_UCR_CYPRIOT_SYLLABARY}</li>
     * <li>{@link #TT_UCR_KHAROSHTHI TT_UCR_KHAROSHTHI}</li>
     * <li>{@link #TT_UCR_TAI_XUAN_JING TT_UCR_TAI_XUAN_JING}</li>
     * <li>{@link #TT_UCR_CUNEIFORM TT_UCR_CUNEIFORM}</li>
     * <li>{@link #TT_UCR_COUNTING_ROD_NUMERALS TT_UCR_COUNTING_ROD_NUMERALS}</li>
     * <li>{@link #TT_UCR_SUNDANESE TT_UCR_SUNDANESE}</li>
     * <li>{@link #TT_UCR_LEPCHA TT_UCR_LEPCHA}</li>
     * <li>{@link #TT_UCR_OL_CHIKI TT_UCR_OL_CHIKI}</li>
     * <li>{@link #TT_UCR_SAURASHTRA TT_UCR_SAURASHTRA}</li>
     * <li>{@link #TT_UCR_KAYAH_LI TT_UCR_KAYAH_LI}</li>
     * <li>{@link #TT_UCR_REJANG TT_UCR_REJANG}</li>
     * <li>{@link #TT_UCR_CHAM TT_UCR_CHAM}</li>
     * <li>{@link #TT_UCR_ANCIENT_SYMBOLS TT_UCR_ANCIENT_SYMBOLS}</li>
     * <li>{@link #TT_UCR_PHAISTOS_DISC TT_UCR_PHAISTOS_DISC}</li>
     * <li>{@link #TT_UCR_OLD_ANATOLIAN TT_UCR_OLD_ANATOLIAN}</li>
     * <li>{@link #TT_UCR_GAME_TILES TT_UCR_GAME_TILES}</li>
     * </ul>
     */
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

    /**
     * {@code FT_Sfnt_Tag}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FT_SFNT_HEAD SFNT_HEAD}</li>
     * <li>{@link #FT_SFNT_MAXP SFNT_MAXP}</li>
     * <li>{@link #FT_SFNT_OS2 SFNT_OS2}</li>
     * <li>{@link #FT_SFNT_HHEA SFNT_HHEA}</li>
     * <li>{@link #FT_SFNT_VHEA SFNT_VHEA}</li>
     * <li>{@link #FT_SFNT_POST SFNT_POST}</li>
     * <li>{@link #FT_SFNT_PCLT SFNT_PCLT}</li>
     * <li>{@link #FT_SFNT_MAX SFNT_MAX}</li>
     * </ul>
     */
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

    public static int nFT_Init_FreeType(long alibrary) {
        long __functionAddress = Functions.Init_FreeType;
        return invokePI(alibrary, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Init_FreeType(@NativeType("FT_Library *") PointerBuffer alibrary) {
        if (CHECKS) {
            check(alibrary, 1);
        }
        return nFT_Init_FreeType(memAddress(alibrary));
    }

    // --- [ FT_Done_FreeType ] ---

    @NativeType("FT_Error")
    public static int FT_Done_FreeType(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Done_FreeType;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_New_Face ] ---

    public static int nFT_New_Face(long library, long filepathname, long face_index, long aface) {
        long __functionAddress = Functions.New_Face;
        if (CHECKS) {
            check(library);
        }
        return invokePPNPI(library, filepathname, face_index, aface, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_New_Face(@NativeType("FT_Library") long library, @NativeType("char const *") ByteBuffer filepathname, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            checkNT1(filepathname);
            check(aface, 1);
        }
        return nFT_New_Face(library, memAddress(filepathname), face_index, memAddress(aface));
    }

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

    public static int nFT_New_Memory_Face(long library, long file_base, long file_size, long face_index, long aface) {
        long __functionAddress = Functions.New_Memory_Face;
        if (CHECKS) {
            check(library);
        }
        return invokePPNNPI(library, file_base, file_size, face_index, aface, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_New_Memory_Face(@NativeType("FT_Library") long library, @NativeType("FT_Byte const *") ByteBuffer file_base, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        return nFT_New_Memory_Face(library, memAddress(file_base), file_base.remaining(), face_index, memAddress(aface));
    }

    // --- [ FT_Open_Face ] ---

    public static int nFT_Open_Face(long library, long args, long face_index, long aface) {
        long __functionAddress = Functions.Open_Face;
        if (CHECKS) {
            check(library);
        }
        return invokePPNPI(library, args, face_index, aface, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Open_Face(@NativeType("FT_Library") long library, @NativeType("FT_Open_Args const *") FT_Open_Args args, @NativeType("FT_Long") long face_index, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        return nFT_Open_Face(library, args.address(), face_index, memAddress(aface));
    }

    // --- [ FT_Attach_File ] ---

    public static int nFT_Attach_File(long face, long filepathname) {
        long __functionAddress = Functions.Attach_File;
        return invokePPI(face, filepathname, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Attach_File(FT_Face face, @NativeType("char const *") ByteBuffer filepathname) {
        if (CHECKS) {
            checkNT1(filepathname);
        }
        return nFT_Attach_File(face.address(), memAddress(filepathname));
    }

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

    public static int nFT_Attach_Stream(long face, long parameters) {
        long __functionAddress = Functions.Attach_Stream;
        return invokePPI(face, parameters, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Attach_Stream(FT_Face face, @NativeType("FT_Open_Args const *") FT_Open_Args parameters) {
        return nFT_Attach_Stream(face.address(), parameters.address());
    }

    // --- [ FT_Reference_Face ] ---

    public static int nFT_Reference_Face(long face) {
        long __functionAddress = Functions.Reference_Face;
        return invokePI(face, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Reference_Face(FT_Face face) {
        return nFT_Reference_Face(face.address());
    }

    // --- [ FT_Done_Face ] ---

    public static int nFT_Done_Face(long face) {
        long __functionAddress = Functions.Done_Face;
        return invokePI(face, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Done_Face(FT_Face face) {
        return nFT_Done_Face(face.address());
    }

    // --- [ FT_Select_Size ] ---

    public static int nFT_Select_Size(long face, int strike_index) {
        long __functionAddress = Functions.Select_Size;
        return invokePI(face, strike_index, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Select_Size(FT_Face face, @NativeType("FT_Int") int strike_index) {
        return nFT_Select_Size(face.address(), strike_index);
    }

    // --- [ FT_Request_Size ] ---

    public static int nFT_Request_Size(long face, long req) {
        long __functionAddress = Functions.Request_Size;
        return invokePPI(face, req, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Request_Size(FT_Face face, FT_Size_Request req) {
        return nFT_Request_Size(face.address(), req.address());
    }

    // --- [ FT_Set_Char_Size ] ---

    public static int nFT_Set_Char_Size(long face, long char_width, long char_height, int horz_resolution, int vert_resolution) {
        long __functionAddress = Functions.Set_Char_Size;
        return invokePNNI(face, char_width, char_height, horz_resolution, vert_resolution, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Char_Size(FT_Face face, @NativeType("FT_F26Dot6") long char_width, @NativeType("FT_F26Dot6") long char_height, @NativeType("FT_UInt") int horz_resolution, @NativeType("FT_UInt") int vert_resolution) {
        return nFT_Set_Char_Size(face.address(), char_width, char_height, horz_resolution, vert_resolution);
    }

    // --- [ FT_Set_Pixel_Sizes ] ---

    public static int nFT_Set_Pixel_Sizes(long face, int pixel_width, int pixel_height) {
        long __functionAddress = Functions.Set_Pixel_Sizes;
        return invokePI(face, pixel_width, pixel_height, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Pixel_Sizes(FT_Face face, @NativeType("FT_UInt") int pixel_width, @NativeType("FT_UInt") int pixel_height) {
        return nFT_Set_Pixel_Sizes(face.address(), pixel_width, pixel_height);
    }

    // --- [ FT_Load_Glyph ] ---

    public static int nFT_Load_Glyph(long face, int glyph_index, int load_flags) {
        long __functionAddress = Functions.Load_Glyph;
        return invokePI(face, glyph_index, load_flags, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Load_Glyph(FT_Face face, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_Int32") int load_flags) {
        return nFT_Load_Glyph(face.address(), glyph_index, load_flags);
    }

    // --- [ FT_Load_Char ] ---

    public static int nFT_Load_Char(long face, long char_code, int load_flags) {
        long __functionAddress = Functions.Load_Char;
        return invokePNI(face, char_code, load_flags, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Load_Char(FT_Face face, @NativeType("FT_ULong") long char_code, @NativeType("FT_Int32") int load_flags) {
        return nFT_Load_Char(face.address(), char_code, load_flags);
    }

    // --- [ FT_Set_Transform ] ---

    public static void nFT_Set_Transform(long face, long matrix, long delta) {
        long __functionAddress = Functions.Set_Transform;
        invokePPPV(face, matrix, delta, __functionAddress);
    }

    public static void FT_Set_Transform(FT_Face face, @Nullable @NativeType("FT_Matrix *") FT_Matrix matrix, @Nullable @NativeType("FT_Vector *") FT_Vector delta) {
        nFT_Set_Transform(face.address(), memAddressSafe(matrix), memAddressSafe(delta));
    }

    // --- [ FT_Get_Transform ] ---

    public static void nFT_Get_Transform(long face, long matrix, long delta) {
        long __functionAddress = Functions.Get_Transform;
        invokePPPV(face, matrix, delta, __functionAddress);
    }

    public static void FT_Get_Transform(FT_Face face, @Nullable @NativeType("FT_Matrix *") FT_Matrix matrix, @Nullable @NativeType("FT_Vector *") FT_Vector delta) {
        nFT_Get_Transform(face.address(), memAddressSafe(matrix), memAddressSafe(delta));
    }

    // --- [ FT_Render_Glyph ] ---

    public static int nFT_Render_Glyph(long slot, int render_mode) {
        long __functionAddress = Functions.Render_Glyph;
        return invokePI(slot, render_mode, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Render_Glyph(FT_GlyphSlot slot, @NativeType("FT_Render_Mode") int render_mode) {
        return nFT_Render_Glyph(slot.address(), render_mode);
    }

    // --- [ FT_Get_Kerning ] ---

    public static int nFT_Get_Kerning(long face, int left_glyph, int right_glyph, int kern_mode, long akerning) {
        long __functionAddress = Functions.Get_Kerning;
        return invokePPI(face, left_glyph, right_glyph, kern_mode, akerning, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Kerning(FT_Face face, @NativeType("FT_UInt") int left_glyph, @NativeType("FT_UInt") int right_glyph, @NativeType("FT_UInt") int kern_mode, @NativeType("FT_Vector *") FT_Vector akerning) {
        return nFT_Get_Kerning(face.address(), left_glyph, right_glyph, kern_mode, akerning.address());
    }

    // --- [ FT_Get_Track_Kerning ] ---

    public static int nFT_Get_Track_Kerning(long face, long point_size, int degree, long akerning) {
        long __functionAddress = Functions.Get_Track_Kerning;
        return invokePNPI(face, point_size, degree, akerning, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Track_Kerning(FT_Face face, @NativeType("FT_Fixed") long point_size, @NativeType("FT_Int") int degree, @NativeType("FT_Fixed *") CLongBuffer akerning) {
        if (CHECKS) {
            check(akerning, 1);
        }
        return nFT_Get_Track_Kerning(face.address(), point_size, degree, memAddress(akerning));
    }

    // --- [ FT_Select_Charmap ] ---

    public static int nFT_Select_Charmap(long face, int encoding) {
        long __functionAddress = Functions.Select_Charmap;
        return invokePI(face, encoding, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Select_Charmap(FT_Face face, @NativeType("FT_Encoding") int encoding) {
        return nFT_Select_Charmap(face.address(), encoding);
    }

    // --- [ FT_Set_Charmap ] ---

    public static int nFT_Set_Charmap(long face, long charmap) {
        long __functionAddress = Functions.Set_Charmap;
        return invokePPI(face, charmap, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Charmap(FT_Face face, FT_CharMap charmap) {
        return nFT_Set_Charmap(face.address(), charmap.address());
    }

    // --- [ FT_Get_Charmap_Index ] ---

    public static int nFT_Get_Charmap_Index(long charmap) {
        long __functionAddress = Functions.Get_Charmap_Index;
        return invokePI(charmap, __functionAddress);
    }

    @NativeType("FT_Int")
    public static int FT_Get_Charmap_Index(FT_CharMap charmap) {
        return nFT_Get_Charmap_Index(charmap.address());
    }

    // --- [ FT_Get_Char_Index ] ---

    public static int nFT_Get_Char_Index(long face, long charcode) {
        long __functionAddress = Functions.Get_Char_Index;
        return invokePNI(face, charcode, __functionAddress);
    }

    @NativeType("FT_UInt")
    public static int FT_Get_Char_Index(FT_Face face, @NativeType("FT_ULong") long charcode) {
        return nFT_Get_Char_Index(face.address(), charcode);
    }

    // --- [ FT_Get_First_Char ] ---

    public static long nFT_Get_First_Char(long face, long agindex) {
        long __functionAddress = Functions.Get_First_Char;
        return invokePPN(face, agindex, __functionAddress);
    }

    @NativeType("FT_ULong")
    public static long FT_Get_First_Char(FT_Face face, @NativeType("FT_UInt *") IntBuffer agindex) {
        if (CHECKS) {
            check(agindex, 1);
        }
        return nFT_Get_First_Char(face.address(), memAddress(agindex));
    }

    // --- [ FT_Get_Next_Char ] ---

    /** Unsafe version of: {@link #FT_Get_Next_Char Get_Next_Char} */
    public static long nFT_Get_Next_Char(long face, long char_code, long agindex) {
        long __functionAddress = Functions.Get_Next_Char;
        return invokePNPN(face, char_code, agindex, __functionAddress);
    }

    /** @return : The charmap's next character code */
    @NativeType("FT_ULong")
    public static long FT_Get_Next_Char(FT_Face face, @NativeType("FT_ULong") long char_code, @NativeType("FT_UInt *") IntBuffer agindex) {
        if (CHECKS) {
            check(agindex, 1);
        }
        return nFT_Get_Next_Char(face.address(), char_code, memAddress(agindex));
    }

    // --- [ FT_Face_Properties ] ---

    public static int nFT_Face_Properties(long face, int num_properties, long properties) {
        long __functionAddress = Functions.Face_Properties;
        return invokePPI(face, num_properties, properties, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Face_Properties(FT_Face face, @NativeType("FT_Parameter *") FT_Parameter.Buffer properties) {
        return nFT_Face_Properties(face.address(), properties.remaining(), properties.address());
    }

    // --- [ FT_Get_Name_Index ] ---

    public static int nFT_Get_Name_Index(long face, long glyph_name) {
        long __functionAddress = Functions.Get_Name_Index;
        return invokePPI(face, glyph_name, __functionAddress);
    }

    @NativeType("FT_UInt")
    public static int FT_Get_Name_Index(FT_Face face, @NativeType("FT_String const *") ByteBuffer glyph_name) {
        if (CHECKS) {
            checkNT1(glyph_name);
        }
        return nFT_Get_Name_Index(face.address(), memAddress(glyph_name));
    }

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

    public static int nFT_Get_Glyph_Name(long face, int glyph_index, long buffer, int buffer_max) {
        long __functionAddress = Functions.Get_Glyph_Name;
        return invokePPI(face, glyph_index, buffer, buffer_max, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Glyph_Name(FT_Face face, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_Pointer") ByteBuffer buffer) {
        return nFT_Get_Glyph_Name(face.address(), glyph_index, memAddress(buffer), buffer.remaining());
    }

    // --- [ FT_Get_Postscript_Name ] ---

    public static long nFT_Get_Postscript_Name(long face) {
        long __functionAddress = Functions.Get_Postscript_Name;
        return invokePP(face, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String FT_Get_Postscript_Name(FT_Face face) {
        long __result = nFT_Get_Postscript_Name(face.address());
        return memASCIISafe(__result);
    }

    // --- [ FT_Get_SubGlyph_Info ] ---

    public static int nFT_Get_SubGlyph_Info(long glyph, int sub_index, long p_index, long p_flags, long p_arg1, long p_arg2, long p_transform) {
        long __functionAddress = Functions.Get_SubGlyph_Info;
        return invokePPPPPPI(glyph, sub_index, p_index, p_flags, p_arg1, p_arg2, p_transform, __functionAddress);
    }

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

    public static short nFT_Get_FSType_Flags(long face) {
        long __functionAddress = Functions.Get_FSType_Flags;
        return invokePC(face, __functionAddress);
    }

    @NativeType("FT_UShort")
    public static short FT_Get_FSType_Flags(FT_Face face) {
        return nFT_Get_FSType_Flags(face.address());
    }

    // --- [ FT_Face_GetCharVariantIndex ] ---

    public static int nFT_Face_GetCharVariantIndex(long face, long charcode, long variantSelector) {
        long __functionAddress = Functions.Face_GetCharVariantIndex;
        return invokePNNI(face, charcode, variantSelector, __functionAddress);
    }

    @NativeType("FT_UInt")
    public static int FT_Face_GetCharVariantIndex(FT_Face face, @NativeType("FT_ULong") long charcode, @NativeType("FT_ULong") long variantSelector) {
        return nFT_Face_GetCharVariantIndex(face.address(), charcode, variantSelector);
    }

    // --- [ FT_Face_GetCharVariantIsDefault ] ---

    public static int nFT_Face_GetCharVariantIsDefault(long face, long charcode, long variantSelector) {
        long __functionAddress = Functions.Face_GetCharVariantIsDefault;
        return invokePNNI(face, charcode, variantSelector, __functionAddress);
    }

    @NativeType("FT_Int")
    public static int FT_Face_GetCharVariantIsDefault(FT_Face face, @NativeType("FT_ULong") long charcode, @NativeType("FT_ULong") long variantSelector) {
        return nFT_Face_GetCharVariantIsDefault(face.address(), charcode, variantSelector);
    }

    // --- [ FT_Face_GetVariantSelectors ] ---

    public static long nFT_Face_GetVariantSelectors(long face) {
        long __functionAddress = Functions.Face_GetVariantSelectors;
        return invokePP(face, __functionAddress);
    }

    @NativeType("FT_UInt32 *")
    public static long FT_Face_GetVariantSelectors(FT_Face face) {
        return nFT_Face_GetVariantSelectors(face.address());
    }

    // --- [ FT_Face_GetVariantsOfChar ] ---

    public static long nFT_Face_GetVariantsOfChar(long face, long charcode) {
        long __functionAddress = Functions.Face_GetVariantsOfChar;
        return invokePNP(face, charcode, __functionAddress);
    }

    @NativeType("FT_UInt32 *")
    public static long FT_Face_GetVariantsOfChar(FT_Face face, @NativeType("FT_ULong") long charcode) {
        return nFT_Face_GetVariantsOfChar(face.address(), charcode);
    }

    // --- [ FT_Face_GetCharsOfVariant ] ---

    public static long nFT_Face_GetCharsOfVariant(long face, long variantSelector) {
        long __functionAddress = Functions.Face_GetCharsOfVariant;
        return invokePNP(face, variantSelector, __functionAddress);
    }

    @NativeType("FT_UInt32 *")
    public static long FT_Face_GetCharsOfVariant(FT_Face face, @NativeType("FT_ULong") long variantSelector) {
        return nFT_Face_GetCharsOfVariant(face.address(), variantSelector);
    }

    // --- [ FT_MulDiv ] ---

    @NativeType("FT_Long")
    public static long FT_MulDiv(@NativeType("FT_Long") long a, @NativeType("FT_Long") long b, @NativeType("FT_Long") long c) {
        long __functionAddress = Functions.MulDiv;
        return invokeNNNN(a, b, c, __functionAddress);
    }

    // --- [ FT_MulFix ] ---

    @NativeType("FT_Long")
    public static long FT_MulFix(@NativeType("FT_Long") long a, @NativeType("FT_Long") long b) {
        long __functionAddress = Functions.MulFix;
        return invokeNNN(a, b, __functionAddress);
    }

    // --- [ FT_DivFix ] ---

    @NativeType("FT_Long")
    public static long FT_DivFix(@NativeType("FT_Long") long a, @NativeType("FT_Long") long b) {
        long __functionAddress = Functions.DivFix;
        return invokeNNN(a, b, __functionAddress);
    }

    // --- [ FT_RoundFix ] ---

    @NativeType("FT_Fixed")
    public static long FT_RoundFix(@NativeType("FT_Fixed") long a) {
        long __functionAddress = Functions.RoundFix;
        return invokeNN(a, __functionAddress);
    }

    // --- [ FT_CeilFix ] ---

    @NativeType("FT_Fixed")
    public static long FT_CeilFix(@NativeType("FT_Fixed") long a) {
        long __functionAddress = Functions.CeilFix;
        return invokeNN(a, __functionAddress);
    }

    // --- [ FT_FloorFix ] ---

    @NativeType("FT_Fixed")
    public static long FT_FloorFix(@NativeType("FT_Fixed") long a) {
        long __functionAddress = Functions.FloorFix;
        return invokeNN(a, __functionAddress);
    }

    // --- [ FT_Vector_Transform ] ---

    public static void nFT_Vector_Transform(long vector, long matrix) {
        long __functionAddress = Functions.Vector_Transform;
        invokePPV(vector, matrix, __functionAddress);
    }

    public static void FT_Vector_Transform(@NativeType("FT_Vector *") FT_Vector vector, @NativeType("FT_Matrix const *") FT_Matrix matrix) {
        nFT_Vector_Transform(vector.address(), matrix.address());
    }

    // --- [ FT_Library_Version ] ---

    public static void nFT_Library_Version(long library, long amajor, long aminor, long apatch) {
        long __functionAddress = Functions.Library_Version;
        if (CHECKS) {
            check(library);
        }
        invokePPPPV(library, amajor, aminor, apatch, __functionAddress);
    }

    public static void FT_Library_Version(@NativeType("FT_Library") long library, @NativeType("FT_Int *") IntBuffer amajor, @NativeType("FT_Int *") IntBuffer aminor, @NativeType("FT_Int *") IntBuffer apatch) {
        if (CHECKS) {
            check(amajor, 1);
            check(aminor, 1);
            check(apatch, 1);
        }
        nFT_Library_Version(library, memAddress(amajor), memAddress(aminor), memAddress(apatch));
    }

    // --- [ FT_Face_CheckTrueTypePatents ] ---

    public static boolean nFT_Face_CheckTrueTypePatents(long face) {
        long __functionAddress = Functions.Face_CheckTrueTypePatents;
        return invokePZ(face, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Face_CheckTrueTypePatents(FT_Face face) {
        return nFT_Face_CheckTrueTypePatents(face.address());
    }

    // --- [ FT_Face_SetUnpatentedHinting ] ---

    public static boolean nFT_Face_SetUnpatentedHinting(long face, boolean value) {
        long __functionAddress = Functions.Face_SetUnpatentedHinting;
        return invokePZ(face, value, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Face_SetUnpatentedHinting(FT_Face face, @NativeType("FT_Bool") boolean value) {
        return nFT_Face_SetUnpatentedHinting(face.address(), value);
    }

    // --- [ FT_Get_Advance ] ---

    public static int nFT_Get_Advance(long face, int gindex, int load_flags, long padvance) {
        long __functionAddress = Functions.Get_Advance;
        return invokePPI(face, gindex, load_flags, padvance, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Advance(FT_Face face, @NativeType("FT_UInt") int gindex, @NativeType("FT_Int32") int load_flags, @NativeType("FT_Fixed *") CLongBuffer padvance) {
        if (CHECKS) {
            check(padvance, 1);
        }
        return nFT_Get_Advance(face.address(), gindex, load_flags, memAddress(padvance));
    }

    // --- [ FT_Get_Advances ] ---

    public static int nFT_Get_Advances(long face, int start, int count, int load_flags, long padvances) {
        long __functionAddress = Functions.Get_Advances;
        return invokePPI(face, start, count, load_flags, padvances, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Advances(FT_Face face, @NativeType("FT_UInt") int start, @NativeType("FT_Int32") int load_flags, @NativeType("FT_Fixed *") CLongBuffer padvances) {
        return nFT_Get_Advances(face.address(), start, padvances.remaining(), load_flags, memAddress(padvances));
    }

    // --- [ FT_Outline_Get_BBox ] ---

    public static int nFT_Outline_Get_BBox(long outline, long abbox) {
        long __functionAddress = Functions.Outline_Get_BBox;
        return invokePPI(outline, abbox, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Get_BBox(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_BBox *") FT_BBox abbox) {
        return nFT_Outline_Get_BBox(outline.address(), abbox.address());
    }

    // --- [ FT_Get_BDF_Charset_ID ] ---

    public static int nFT_Get_BDF_Charset_ID(long face, long acharset_encoding, long acharset_registry) {
        long __functionAddress = Functions.Get_BDF_Charset_ID;
        return invokePPPI(face, acharset_encoding, acharset_registry, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_BDF_Charset_ID(FT_Face face, @NativeType("char const **") PointerBuffer acharset_encoding, @NativeType("char const **") PointerBuffer acharset_registry) {
        if (CHECKS) {
            check(acharset_encoding, 1);
            check(acharset_registry, 1);
        }
        return nFT_Get_BDF_Charset_ID(face.address(), memAddress(acharset_encoding), memAddress(acharset_registry));
    }

    // --- [ FT_Get_BDF_Property ] ---

    public static int nFT_Get_BDF_Property(long face, long prop_name, long aproperty) {
        long __functionAddress = Functions.Get_BDF_Property;
        return invokePPPI(face, prop_name, aproperty, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_BDF_Property(FT_Face face, @NativeType("char const *") ByteBuffer prop_name, @NativeType("BDF_PropertyRec *") BDF_Property aproperty) {
        if (CHECKS) {
            checkNT1(prop_name);
        }
        return nFT_Get_BDF_Property(face.address(), memAddress(prop_name), aproperty.address());
    }

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

    public static void nFT_Bitmap_Init(long abitmap) {
        long __functionAddress = Functions.Bitmap_Init;
        invokePV(abitmap, __functionAddress);
    }

    public static void FT_Bitmap_Init(@NativeType("FT_Bitmap *") FT_Bitmap abitmap) {
        nFT_Bitmap_Init(abitmap.address());
    }

    // --- [ FT_Bitmap_Copy ] ---

    public static int nFT_Bitmap_Copy(long library, long source, long target) {
        long __functionAddress = Functions.Bitmap_Copy;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, source, target, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Bitmap_Copy(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap const *") FT_Bitmap source, @NativeType("FT_Bitmap *") FT_Bitmap target) {
        return nFT_Bitmap_Copy(library, source.address(), target.address());
    }

    // --- [ FT_Bitmap_Embolden ] ---

    public static int nFT_Bitmap_Embolden(long library, long bitmap, long xStrength, long yStrength) {
        long __functionAddress = Functions.Bitmap_Embolden;
        if (CHECKS) {
            check(library);
        }
        return invokePPNNI(library, bitmap, xStrength, yStrength, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Bitmap_Embolden(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap *") FT_Bitmap bitmap, @NativeType("FT_Pos") long xStrength, @NativeType("FT_Pos") long yStrength) {
        return nFT_Bitmap_Embolden(library, bitmap.address(), xStrength, yStrength);
    }

    // --- [ FT_Bitmap_Convert ] ---

    public static int nFT_Bitmap_Convert(long library, long source, long target, int alignment) {
        long __functionAddress = Functions.Bitmap_Convert;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, source, target, alignment, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Bitmap_Convert(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap const *") FT_Bitmap source, @NativeType("FT_Bitmap *") FT_Bitmap target, @NativeType("FT_Int") int alignment) {
        return nFT_Bitmap_Convert(library, source.address(), target.address(), alignment);
    }

    // --- [ FT_Bitmap_Blend ] ---

    private static final FFICIF FT_Bitmap_BlendCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, apiCreateStruct(ffi_type_slong, ffi_type_slong), ffi_type_pointer, ffi_type_pointer, apiCreateStruct(ffi_type_uint8, ffi_type_uint8, ffi_type_uint8, ffi_type_uint8)
    );

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

    @NativeType("FT_Error")
    public static int FT_Bitmap_Blend(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap const *") FT_Bitmap source, @NativeType("FT_Vector const") FT_Vector source_offset, @NativeType("FT_Bitmap *") FT_Bitmap target, @NativeType("FT_Vector *") FT_Vector atarget_offset, FT_Color color) {
        return nFT_Bitmap_Blend(library, source.address(), source_offset.address(), target.address(), atarget_offset.address(), color.address());
    }

    // --- [ FT_GlyphSlot_Own_Bitmap ] ---

    public static int nFT_GlyphSlot_Own_Bitmap(long slot) {
        long __functionAddress = Functions.GlyphSlot_Own_Bitmap;
        return invokePI(slot, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_GlyphSlot_Own_Bitmap(FT_GlyphSlot slot) {
        return nFT_GlyphSlot_Own_Bitmap(slot.address());
    }

    // --- [ FT_Bitmap_Done ] ---

    public static int nFT_Bitmap_Done(long library, long bitmap) {
        long __functionAddress = Functions.Bitmap_Done;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, bitmap, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Bitmap_Done(@NativeType("FT_Library") long library, @NativeType("FT_Bitmap *") FT_Bitmap bitmap) {
        return nFT_Bitmap_Done(library, bitmap.address());
    }

    // --- [ FT_Stream_OpenBzip2 ] ---

    public static int nFT_Stream_OpenBzip2(long stream, long source) {
        long __functionAddress = Functions.Stream_OpenBzip2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPI(stream, source, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stream_OpenBzip2(FT_Stream stream, FT_Stream source) {
        return nFT_Stream_OpenBzip2(stream.address(), source.address());
    }

    // --- [ FTC_Manager_New ] ---

    public static int nFTC_Manager_New(long library, int max_faces, int max_sizes, long max_bytes, long requester, long req_data, long amanager) {
        long __functionAddress = Functions.FTC_Manager_New;
        if (CHECKS) {
            check(library);
        }
        return invokePNPPPI(library, max_faces, max_sizes, max_bytes, requester, req_data, amanager, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_Manager_New(@NativeType("FT_Library") long library, @NativeType("FT_UInt") int max_faces, @NativeType("FT_UInt") int max_sizes, @NativeType("FT_ULong") long max_bytes, @NativeType("FTC_Face_Requester") FTC_Face_RequesterI requester, @Nullable @NativeType("FT_Pointer") ByteBuffer req_data, @NativeType("FTC_Manager *") PointerBuffer amanager) {
        if (CHECKS) {
            check(amanager, 1);
        }
        return nFTC_Manager_New(library, max_faces, max_sizes, max_bytes, requester.address(), memAddressSafe(req_data), memAddress(amanager));
    }

    // --- [ FTC_Manager_Reset ] ---

    public static void FTC_Manager_Reset(@NativeType("FTC_Manager") long manager) {
        long __functionAddress = Functions.FTC_Manager_Reset;
        if (CHECKS) {
            check(manager);
        }
        invokePV(manager, __functionAddress);
    }

    // --- [ FTC_Manager_Done ] ---

    public static void FTC_Manager_Done(@NativeType("FTC_Manager") long manager) {
        long __functionAddress = Functions.FTC_Manager_Done;
        if (CHECKS) {
            check(manager);
        }
        invokePV(manager, __functionAddress);
    }

    // --- [ FTC_Manager_LookupFace ] ---

    public static int nFTC_Manager_LookupFace(long manager, long face_id, long aface) {
        long __functionAddress = Functions.FTC_Manager_LookupFace;
        if (CHECKS) {
            check(manager);
            check(face_id);
        }
        return invokePPPI(manager, face_id, aface, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_Manager_LookupFace(@NativeType("FTC_Manager") long manager, @NativeType("FTC_FaceID") long face_id, @NativeType("FT_Face *") PointerBuffer aface) {
        if (CHECKS) {
            check(aface, 1);
        }
        return nFTC_Manager_LookupFace(manager, face_id, memAddress(aface));
    }

    // --- [ FTC_Manager_LookupSize ] ---

    public static int nFTC_Manager_LookupSize(long manager, long scaler, long asize) {
        long __functionAddress = Functions.FTC_Manager_LookupSize;
        if (CHECKS) {
            check(manager);
        }
        return invokePPPI(manager, scaler, asize, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_Manager_LookupSize(@NativeType("FTC_Manager") long manager, FTC_Scaler scaler, @NativeType("FT_Size *") PointerBuffer asize) {
        if (CHECKS) {
            check(asize, 1);
        }
        return nFTC_Manager_LookupSize(manager, scaler.address(), memAddress(asize));
    }

    // --- [ FTC_Node_Unref ] ---

    public static void FTC_Node_Unref(@NativeType("FTC_Node") long node, @NativeType("FTC_Manager") long manager) {
        long __functionAddress = Functions.FTC_Node_Unref;
        if (CHECKS) {
            check(node);
            check(manager);
        }
        invokePPV(node, manager, __functionAddress);
    }

    // --- [ FTC_Manager_RemoveFaceID ] ---

    public static void FTC_Manager_RemoveFaceID(@NativeType("FTC_Manager") long manager, @NativeType("FTC_FaceID") long face_id) {
        long __functionAddress = Functions.FTC_Manager_RemoveFaceID;
        if (CHECKS) {
            check(manager);
            check(face_id);
        }
        invokePPV(manager, face_id, __functionAddress);
    }

    // --- [ FTC_CMapCache_New ] ---

    public static int nFTC_CMapCache_New(long manager, long acache) {
        long __functionAddress = Functions.FTC_CMapCache_New;
        if (CHECKS) {
            check(manager);
        }
        return invokePPI(manager, acache, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_CMapCache_New(@NativeType("FTC_Manager") long manager, @NativeType("FTC_CMapCache *") PointerBuffer acache) {
        if (CHECKS) {
            check(acache, 1);
        }
        return nFTC_CMapCache_New(manager, memAddress(acache));
    }

    // --- [ FTC_CMapCache_Lookup ] ---

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

    public static int nFTC_ImageCache_New(long manager, long acache) {
        long __functionAddress = Functions.FTC_ImageCache_New;
        if (CHECKS) {
            check(manager);
        }
        return invokePPI(manager, acache, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_ImageCache_New(@NativeType("FTC_Manager") long manager, @NativeType("FTC_ImageCache *") PointerBuffer acache) {
        if (CHECKS) {
            check(acache, 1);
        }
        return nFTC_ImageCache_New(manager, memAddress(acache));
    }

    // --- [ FTC_ImageCache_Lookup ] ---

    public static int nFTC_ImageCache_Lookup(long cache, long type, int gindex, long aglyph, long anode) {
        long __functionAddress = Functions.FTC_ImageCache_Lookup;
        if (CHECKS) {
            check(cache);
        }
        return invokePPPPI(cache, type, gindex, aglyph, anode, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_ImageCache_Lookup(@NativeType("FTC_ImageCache") long cache, FTC_ImageType type, @NativeType("FT_UInt") int gindex, @NativeType("FT_Glyph *") PointerBuffer aglyph, @Nullable @NativeType("FTC_Node *") PointerBuffer anode) {
        if (CHECKS) {
            check(aglyph, 1);
            checkSafe(anode, 1);
        }
        return nFTC_ImageCache_Lookup(cache, type.address(), gindex, memAddress(aglyph), memAddressSafe(anode));
    }

    // --- [ FTC_ImageCache_LookupScaler ] ---

    public static int nFTC_ImageCache_LookupScaler(long cache, long scaler, long load_flags, int gindex, long aglyph, long anode) {
        long __functionAddress = Functions.FTC_ImageCache_LookupScaler;
        if (CHECKS) {
            check(cache);
        }
        return invokePPNPPI(cache, scaler, load_flags, gindex, aglyph, anode, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_ImageCache_LookupScaler(@NativeType("FTC_ImageCache") long cache, FTC_Scaler scaler, @NativeType("FT_ULong") long load_flags, @NativeType("FT_UInt") int gindex, @NativeType("FT_Glyph *") PointerBuffer aglyph, @Nullable @NativeType("FTC_Node *") PointerBuffer anode) {
        if (CHECKS) {
            check(aglyph, 1);
            checkSafe(anode, 1);
        }
        return nFTC_ImageCache_LookupScaler(cache, scaler.address(), load_flags, gindex, memAddress(aglyph), memAddressSafe(anode));
    }

    // --- [ FTC_SBitCache_New ] ---

    public static int nFTC_SBitCache_New(long manager, long acache) {
        long __functionAddress = Functions.FTC_SBitCache_New;
        if (CHECKS) {
            check(manager);
        }
        return invokePPI(manager, acache, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_SBitCache_New(@NativeType("FTC_Manager") long manager, @NativeType("FTC_SBitCache *") PointerBuffer acache) {
        if (CHECKS) {
            check(acache, 1);
        }
        return nFTC_SBitCache_New(manager, memAddress(acache));
    }

    // --- [ FTC_SBitCache_Lookup ] ---

    public static int nFTC_SBitCache_Lookup(long cache, long type, int gindex, long sbit, long anode) {
        long __functionAddress = Functions.FTC_SBitCache_Lookup;
        if (CHECKS) {
            check(cache);
        }
        return invokePPPPI(cache, type, gindex, sbit, anode, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_SBitCache_Lookup(@NativeType("FTC_SBitCache") long cache, FTC_ImageType type, @NativeType("FT_UInt") int gindex, @NativeType("FTC_SBit *") PointerBuffer sbit, @Nullable @NativeType("FTC_Node *") PointerBuffer anode) {
        if (CHECKS) {
            check(sbit, 1);
            checkSafe(anode, 1);
        }
        return nFTC_SBitCache_Lookup(cache, type.address(), gindex, memAddress(sbit), memAddressSafe(anode));
    }

    // --- [ FTC_SBitCache_LookupScaler ] ---

    public static int nFTC_SBitCache_LookupScaler(long cache, long scaler, long load_flags, int gindex, long sbit, long anode) {
        long __functionAddress = Functions.FTC_SBitCache_LookupScaler;
        if (CHECKS) {
            check(cache);
        }
        return invokePPNPPI(cache, scaler, load_flags, gindex, sbit, anode, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FTC_SBitCache_LookupScaler(@NativeType("FTC_SBitCache") long cache, FTC_Scaler scaler, @NativeType("FT_ULong") long load_flags, @NativeType("FT_UInt") int gindex, @NativeType("FTC_SBit *") PointerBuffer sbit, @Nullable @NativeType("FTC_Node *") PointerBuffer anode) {
        if (CHECKS) {
            check(sbit, 1);
            checkSafe(anode, 1);
        }
        return nFTC_SBitCache_LookupScaler(cache, scaler.address(), load_flags, gindex, memAddress(sbit), memAddressSafe(anode));
    }

    // --- [ FT_Get_CID_Registry_Ordering_Supplement ] ---

    public static int nFT_Get_CID_Registry_Ordering_Supplement(long face, long registry, long ordering, long supplement) {
        long __functionAddress = Functions.Get_CID_Registry_Ordering_Supplement;
        return invokePPPPI(face, registry, ordering, supplement, __functionAddress);
    }

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

    public static int nFT_Get_CID_Is_Internally_CID_Keyed(long face, long is_cid) {
        long __functionAddress = Functions.Get_CID_Is_Internally_CID_Keyed;
        return invokePPI(face, is_cid, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_CID_Is_Internally_CID_Keyed(FT_Face face, @NativeType("FT_Bool *") ByteBuffer is_cid) {
        if (CHECKS) {
            check(is_cid, 1);
        }
        return nFT_Get_CID_Is_Internally_CID_Keyed(face.address(), memAddress(is_cid));
    }

    // --- [ FT_Get_CID_From_Glyph_Index ] ---

    public static int nFT_Get_CID_From_Glyph_Index(long face, int glyph_index, long cid) {
        long __functionAddress = Functions.Get_CID_From_Glyph_Index;
        return invokePPI(face, glyph_index, cid, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_CID_From_Glyph_Index(FT_Face face, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_UInt *") IntBuffer cid) {
        if (CHECKS) {
            check(cid, 1);
        }
        return nFT_Get_CID_From_Glyph_Index(face.address(), glyph_index, memAddress(cid));
    }

    // --- [ FT_Palette_Data_Get ] ---

    public static int nFT_Palette_Data_Get(long face, long apalette) {
        long __functionAddress = Functions.Palette_Data_Get;
        return invokePPI(face, apalette, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Palette_Data_Get(FT_Face face, @NativeType("FT_Palette_Data *") FT_Palette_Data apalette) {
        return nFT_Palette_Data_Get(face.address(), apalette.address());
    }

    // --- [ FT_Palette_Select ] ---

    public static int nFT_Palette_Select(long face, short palette_index, long apalette) {
        long __functionAddress = Functions.Palette_Select;
        return invokePCPI(face, palette_index, apalette, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Palette_Select(FT_Face face, @NativeType("FT_UShort") short palette_index, @Nullable @NativeType("FT_Color **") PointerBuffer apalette) {
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

    @NativeType("FT_Error")
    public static int FT_Palette_Set_Foreground_Color(FT_Face face, FT_Color foreground_color) {
        return nFT_Palette_Set_Foreground_Color(face.address(), foreground_color.address());
    }

    // --- [ FT_Get_Color_Glyph_Layer ] ---

    public static boolean nFT_Get_Color_Glyph_Layer(long face, int base_glyph, long aglyph_index, long acolor_index, long iterator) {
        long __functionAddress = Functions.Get_Color_Glyph_Layer;
        return invokePPPPZ(face, base_glyph, aglyph_index, acolor_index, iterator, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_Layer(FT_Face face, @NativeType("FT_UInt") int base_glyph, @NativeType("FT_UInt *") IntBuffer aglyph_index, @NativeType("FT_UInt *") IntBuffer acolor_index, @NativeType("FT_LayerIterator *") FT_LayerIterator iterator) {
        if (CHECKS) {
            check(aglyph_index, 1);
            check(acolor_index, 1);
        }
        return nFT_Get_Color_Glyph_Layer(face.address(), base_glyph, memAddress(aglyph_index), memAddress(acolor_index), iterator.address());
    }

    // --- [ FT_Get_Color_Glyph_Paint ] ---

    public static boolean nFT_Get_Color_Glyph_Paint(long face, int base_glyph, int root_transform, long paint) {
        long __functionAddress = Functions.Get_Color_Glyph_Paint;
        return invokePPZ(face, base_glyph, root_transform, paint, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_Paint(FT_Face face, @NativeType("FT_UInt") int base_glyph, @NativeType("FT_Color_Root_Transform") int root_transform, @NativeType("FT_OpaquePaintRec *") FT_OpaquePaint paint) {
        return nFT_Get_Color_Glyph_Paint(face.address(), base_glyph, root_transform, paint.address());
    }

    // --- [ FT_Get_Color_Glyph_ClipBox ] ---

    public static boolean nFT_Get_Color_Glyph_ClipBox(long face, int base_glyph, long clip_box) {
        long __functionAddress = Functions.Get_Color_Glyph_ClipBox;
        return invokePPZ(face, base_glyph, clip_box, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Get_Color_Glyph_ClipBox(FT_Face face, @NativeType("FT_UInt") int base_glyph, @NativeType("FT_ClipBox *") FT_ClipBox clip_box) {
        return nFT_Get_Color_Glyph_ClipBox(face.address(), base_glyph, clip_box.address());
    }

    // --- [ FT_Get_Paint_Layers ] ---

    public static boolean nFT_Get_Paint_Layers(long face, long iterator, long paint) {
        long __functionAddress = Functions.Get_Paint_Layers;
        return invokePPPZ(face, iterator, paint, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Get_Paint_Layers(FT_Face face, @NativeType("FT_LayerIterator *") FT_LayerIterator iterator, @NativeType("FT_OpaquePaintRec *") FT_OpaquePaint paint) {
        return nFT_Get_Paint_Layers(face.address(), iterator.address(), paint.address());
    }

    // --- [ FT_Get_Colorline_Stops ] ---

    public static boolean nFT_Get_Colorline_Stops(long face, long color_stop, long iterator) {
        long __functionAddress = Functions.Get_Colorline_Stops;
        return invokePPPZ(face, color_stop, iterator, __functionAddress);
    }

    @NativeType("FT_Bool")
    public static boolean FT_Get_Colorline_Stops(FT_Face face, @NativeType("FT_ColorStop *") FT_ColorStop color_stop, @NativeType("FT_ColorStopIterator *") FT_ColorStopIterator iterator) {
        return nFT_Get_Colorline_Stops(face.address(), color_stop.address(), iterator.address());
    }

    // --- [ FT_Get_Paint ] ---

    private static final FFICIF FT_Get_PaintCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_uint8,
        ffi_type_pointer, apiCreateStruct(ffi_type_pointer, ffi_type_uint8), ffi_type_pointer
    );

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

    @NativeType("FT_Bool")
    public static boolean FT_Get_Paint(FT_Face face, @NativeType("FT_OpaquePaintRec") FT_OpaquePaint opaque_paint, @NativeType("FT_COLR_Paint *") FT_COLR_Paint paint) {
        return nFT_Get_Paint(face.address(), opaque_paint.address(), paint.address());
    }

    // --- [ FT_Error_String ] ---

    public static long nFT_Error_String(int error_code) {
        long __functionAddress = Functions.Error_String;
        return invokeP(error_code, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String FT_Error_String(@NativeType("FT_Error") int error_code) {
        long __result = nFT_Error_String(error_code);
        return memASCIISafe(__result);
    }

    // --- [ FT_Get_Font_Format ] ---

    public static long nFT_Get_Font_Format(long face) {
        long __functionAddress = Functions.Get_Font_Format;
        return invokePP(face, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String FT_Get_Font_Format(FT_Face face) {
        long __result = nFT_Get_Font_Format(face.address());
        return memASCIISafe(__result);
    }

    // --- [ FT_Get_Gasp ] ---

    public static int nFT_Get_Gasp(long face, int ppem) {
        long __functionAddress = Functions.Get_Gasp;
        return invokePI(face, ppem, __functionAddress);
    }

    @NativeType("FT_Int")
    public static int FT_Get_Gasp(FT_Face face, @NativeType("FT_UInt") int ppem) {
        return nFT_Get_Gasp(face.address(), ppem);
    }

    // --- [ FT_New_Glyph ] ---

    public static int nFT_New_Glyph(long library, int format, long aglyph) {
        long __functionAddress = Functions.New_Glyph;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, format, aglyph, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_New_Glyph(@NativeType("FT_Library") long library, @NativeType("FT_Glyph_Format") int format, @NativeType("FT_Glyph *") PointerBuffer aglyph) {
        if (CHECKS) {
            check(aglyph, 1);
        }
        return nFT_New_Glyph(library, format, memAddress(aglyph));
    }

    // --- [ FT_Get_Glyph ] ---

    public static int nFT_Get_Glyph(long slot, long aglyph) {
        long __functionAddress = Functions.Get_Glyph;
        return invokePPI(slot, aglyph, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Glyph(FT_GlyphSlot slot, @NativeType("FT_Glyph *") PointerBuffer aglyph) {
        if (CHECKS) {
            check(aglyph, 1);
        }
        return nFT_Get_Glyph(slot.address(), memAddress(aglyph));
    }

    // --- [ FT_Glyph_Copy ] ---

    public static int nFT_Glyph_Copy(long source, long target) {
        long __functionAddress = Functions.Glyph_Copy;
        return invokePPI(source, target, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Glyph_Copy(FT_Glyph source, @NativeType("FT_Glyph *") PointerBuffer target) {
        if (CHECKS) {
            check(target, 1);
        }
        return nFT_Glyph_Copy(source.address(), memAddress(target));
    }

    // --- [ FT_Glyph_Transform ] ---

    public static int nFT_Glyph_Transform(long glyph, long matrix, long delta) {
        long __functionAddress = Functions.Glyph_Transform;
        return invokePPPI(glyph, matrix, delta, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Glyph_Transform(FT_Glyph glyph, @Nullable @NativeType("FT_Matrix const *") FT_Matrix matrix, @Nullable @NativeType("FT_Vector const *") FT_Vector delta) {
        return nFT_Glyph_Transform(glyph.address(), memAddressSafe(matrix), memAddressSafe(delta));
    }

    // --- [ FT_Glyph_Get_CBox ] ---

    public static void nFT_Glyph_Get_CBox(long glyph, int bbox_mode, long acbox) {
        long __functionAddress = Functions.Glyph_Get_CBox;
        invokePPV(glyph, bbox_mode, acbox, __functionAddress);
    }

    public static void FT_Glyph_Get_CBox(FT_Glyph glyph, @NativeType("FT_UInt") int bbox_mode, @NativeType("FT_BBox *") FT_BBox acbox) {
        nFT_Glyph_Get_CBox(glyph.address(), bbox_mode, acbox.address());
    }

    // --- [ FT_Glyph_To_Bitmap ] ---

    public static int nFT_Glyph_To_Bitmap(long the_glyph, int render_mode, long origin, boolean destroy) {
        long __functionAddress = Functions.Glyph_To_Bitmap;
        return invokePPI(the_glyph, render_mode, origin, destroy, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Glyph_To_Bitmap(@NativeType("FT_Glyph *") PointerBuffer the_glyph, @NativeType("FT_Render_Mode") int render_mode, @Nullable @NativeType("FT_Vector const *") FT_Vector origin, @NativeType("FT_Bool") boolean destroy) {
        if (CHECKS) {
            check(the_glyph, 1);
        }
        return nFT_Glyph_To_Bitmap(memAddress(the_glyph), render_mode, memAddressSafe(origin), destroy);
    }

    // --- [ FT_Done_Glyph ] ---

    public static void nFT_Done_Glyph(long glyph) {
        long __functionAddress = Functions.Done_Glyph;
        invokePV(glyph, __functionAddress);
    }

    public static void FT_Done_Glyph(@Nullable FT_Glyph glyph) {
        nFT_Done_Glyph(memAddressSafe(glyph));
    }

    // --- [ FT_Matrix_Multiply ] ---

    public static void nFT_Matrix_Multiply(long a, long b) {
        long __functionAddress = Functions.Matrix_Multiply;
        invokePPV(a, b, __functionAddress);
    }

    public static void FT_Matrix_Multiply(@NativeType("FT_Matrix const *") FT_Matrix a, @NativeType("FT_Matrix *") FT_Matrix b) {
        nFT_Matrix_Multiply(a.address(), b.address());
    }

    // --- [ FT_Matrix_Invert ] ---

    public static int nFT_Matrix_Invert(long matrix) {
        long __functionAddress = Functions.Matrix_Invert;
        return invokePI(matrix, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Matrix_Invert(@NativeType("FT_Matrix *") FT_Matrix matrix) {
        return nFT_Matrix_Invert(matrix.address());
    }

    // --- [ FT_TrueTypeGX_Validate ] ---

    public static int nFT_TrueTypeGX_Validate(long face, int validation_flags, long tables, int table_length) {
        long __functionAddress = Functions.TrueTypeGX_Validate;
        return invokePPI(face, validation_flags, tables, table_length, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_TrueTypeGX_Validate(FT_Face face, @NativeType("FT_UInt") int validation_flags, @NativeType("FT_Bytes *") PointerBuffer tables) {
        return nFT_TrueTypeGX_Validate(face.address(), validation_flags, memAddress(tables), tables.remaining());
    }

    // --- [ FT_TrueTypeGX_Free ] ---

    public static void nFT_TrueTypeGX_Free(long face, long table) {
        long __functionAddress = Functions.TrueTypeGX_Free;
        invokePPV(face, table, __functionAddress);
    }

    public static void FT_TrueTypeGX_Free(FT_Face face, @NativeType("FT_Bytes") ByteBuffer table) {
        nFT_TrueTypeGX_Free(face.address(), memAddress(table));
    }

    // --- [ FT_ClassicKern_Validate ] ---

    public static int nFT_ClassicKern_Validate(long face, int validation_flags, long ckern_table) {
        long __functionAddress = Functions.ClassicKern_Validate;
        return invokePPI(face, validation_flags, ckern_table, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_ClassicKern_Validate(FT_Face face, @NativeType("FT_UInt") int validation_flags, @NativeType("FT_Bytes *") PointerBuffer ckern_table) {
        if (CHECKS) {
            check(ckern_table, 1);
        }
        return nFT_ClassicKern_Validate(face.address(), validation_flags, memAddress(ckern_table));
    }

    // --- [ FT_ClassicKern_Free ] ---

    public static void nFT_ClassicKern_Free(long face, long table) {
        long __functionAddress = Functions.ClassicKern_Free;
        invokePPV(face, table, __functionAddress);
    }

    public static void FT_ClassicKern_Free(FT_Face face, @NativeType("FT_Bytes") ByteBuffer table) {
        nFT_ClassicKern_Free(face.address(), memAddress(table));
    }

    // --- [ FT_Stream_OpenGzip ] ---

    public static int nFT_Stream_OpenGzip(long stream, long source) {
        long __functionAddress = Functions.Stream_OpenGzip;
        return invokePPI(stream, source, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stream_OpenGzip(FT_Stream stream, FT_Stream source) {
        return nFT_Stream_OpenGzip(stream.address(), source.address());
    }

    // --- [ FT_Gzip_Uncompress ] ---

    public static int nFT_Gzip_Uncompress(long memory, long output, long output_len, long input, long input_len) {
        long __functionAddress = Functions.Gzip_Uncompress;
        return invokePPPPNI(memory, output, output_len, input, input_len, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Gzip_Uncompress(FT_Memory memory, @NativeType("FT_Byte *") ByteBuffer output, @NativeType("FT_ULong *") CLongBuffer output_len, @NativeType("FT_Byte const *") ByteBuffer input) {
        if (CHECKS) {
            check(output_len, 1);
            check(output, output_len.get(output_len.position()));
        }
        return nFT_Gzip_Uncompress(memory.address(), memAddress(output), memAddress(output_len), memAddress(input), input.remaining());
    }

    // --- [ FT_Library_SetLcdFilter ] ---

    @NativeType("FT_Error")
    public static int FT_Library_SetLcdFilter(@NativeType("FT_Library") long library, @NativeType("FT_LcdFilter") int filter) {
        long __functionAddress = Functions.Library_SetLcdFilter;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, filter, __functionAddress);
    }

    // --- [ FT_Library_SetLcdFilterWeights ] ---

    public static int nFT_Library_SetLcdFilterWeights(long library, long weights) {
        long __functionAddress = Functions.Library_SetLcdFilterWeights;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, weights, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Library_SetLcdFilterWeights(@NativeType("FT_Library") long library, @NativeType("unsigned char *") ByteBuffer weights) {
        if (CHECKS) {
            check(weights, 5);
        }
        return nFT_Library_SetLcdFilterWeights(library, memAddress(weights));
    }

    // --- [ FT_Library_SetLcdGeometry ] ---

    public static int nFT_Library_SetLcdGeometry(long library, long sub) {
        long __functionAddress = Functions.Library_SetLcdGeometry;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, sub, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Library_SetLcdGeometry(@NativeType("FT_Library") long library, @NativeType("FT_Vector *") FT_Vector.Buffer sub) {
        if (CHECKS) {
            check(sub, 3);
        }
        return nFT_Library_SetLcdGeometry(library, sub.address());
    }

    // --- [ FT_List_Find ] ---

    public static long nFT_List_Find(long list, long data) {
        long __functionAddress = Functions.List_Find;
        if (CHECKS) {
            check(data);
        }
        return invokePPP(list, data, __functionAddress);
    }

    @Nullable
    public static FT_ListNode FT_List_Find(FT_List list, @NativeType("void *") long data) {
        long __result = nFT_List_Find(list.address(), data);
        return FT_ListNode.createSafe(__result);
    }

    // --- [ FT_List_Add ] ---

    public static void nFT_List_Add(long list, long node) {
        long __functionAddress = Functions.List_Add;
        invokePPV(list, node, __functionAddress);
    }

    public static void FT_List_Add(FT_List list, FT_ListNode node) {
        nFT_List_Add(list.address(), node.address());
    }

    // --- [ FT_List_Insert ] ---

    public static void nFT_List_Insert(long list, long node) {
        long __functionAddress = Functions.List_Insert;
        invokePPV(list, node, __functionAddress);
    }

    public static void FT_List_Insert(FT_List list, FT_ListNode node) {
        nFT_List_Insert(list.address(), node.address());
    }

    // --- [ FT_List_Remove ] ---

    public static void nFT_List_Remove(long list, long node) {
        long __functionAddress = Functions.List_Remove;
        invokePPV(list, node, __functionAddress);
    }

    public static void FT_List_Remove(FT_List list, FT_ListNode node) {
        nFT_List_Remove(list.address(), node.address());
    }

    // --- [ FT_List_Up ] ---

    public static void nFT_List_Up(long list, long node) {
        long __functionAddress = Functions.List_Up;
        invokePPV(list, node, __functionAddress);
    }

    public static void FT_List_Up(FT_List list, FT_ListNode node) {
        nFT_List_Up(list.address(), node.address());
    }

    // --- [ FT_List_Iterate ] ---

    public static int nFT_List_Iterate(long list, long iterator, long user) {
        long __functionAddress = Functions.List_Iterate;
        return invokePPPI(list, iterator, user, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_List_Iterate(FT_List list, @NativeType("FT_List_Iterator") FT_List_IteratorI iterator, @NativeType("void *") long user) {
        return nFT_List_Iterate(list.address(), iterator.address(), user);
    }

    // --- [ FT_List_Finalize ] ---

    public static void nFT_List_Finalize(long list, long destroy, long memory, long user) {
        long __functionAddress = Functions.List_Finalize;
        invokePPPPV(list, destroy, memory, user, __functionAddress);
    }

    public static void FT_List_Finalize(FT_List list, @Nullable @NativeType("FT_List_Destructor") FT_List_DestructorI destroy, FT_Memory memory, @NativeType("void *") long user) {
        nFT_List_Finalize(list.address(), memAddressSafe(destroy), memory.address(), user);
    }

    // --- [ FT_Stream_OpenLZW ] ---

    public static int nFT_Stream_OpenLZW(long stream, long source) {
        long __functionAddress = Functions.Stream_OpenLZW;
        return invokePPI(stream, source, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stream_OpenLZW(FT_Stream stream, FT_Stream source) {
        return nFT_Stream_OpenLZW(stream.address(), source.address());
    }

    // --- [ FT_Get_Multi_Master ] ---

    public static int nFT_Get_Multi_Master(long face, long amaster) {
        long __functionAddress = Functions.Get_Multi_Master;
        return invokePPI(face, amaster, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Multi_Master(FT_Face face, @NativeType("FT_Multi_Master *") FT_Multi_Master amaster) {
        return nFT_Get_Multi_Master(face.address(), amaster.address());
    }

    // --- [ FT_Get_MM_Var ] ---

    public static int nFT_Get_MM_Var(long face, long amaster) {
        long __functionAddress = Functions.Get_MM_Var;
        return invokePPI(face, amaster, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_MM_Var(FT_Face face, @NativeType("FT_MM_Var **") PointerBuffer amaster) {
        if (CHECKS) {
            check(amaster, 1);
        }
        return nFT_Get_MM_Var(face.address(), memAddress(amaster));
    }

    // --- [ FT_Done_MM_Var ] ---

    public static int nFT_Done_MM_Var(long library, long amaster) {
        long __functionAddress = Functions.Done_MM_Var;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, amaster, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Done_MM_Var(@NativeType("FT_Library") long library, @NativeType("FT_MM_Var *") FT_MM_Var amaster) {
        return nFT_Done_MM_Var(library, amaster.address());
    }

    // --- [ FT_Set_MM_Design_Coordinates ] ---

    public static int nFT_Set_MM_Design_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_MM_Design_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_MM_Design_Coordinates(FT_Face face, @NativeType("FT_Long *") CLongBuffer coords) {
        return nFT_Set_MM_Design_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_Var_Design_Coordinates ] ---

    public static int nFT_Set_Var_Design_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_Var_Design_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Var_Design_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Set_Var_Design_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Get_Var_Design_Coordinates ] ---

    public static int nFT_Get_Var_Design_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Get_Var_Design_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Var_Design_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Get_Var_Design_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_MM_Blend_Coordinates ] ---

    public static int nFT_Set_MM_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_MM_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_MM_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Set_MM_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Get_MM_Blend_Coordinates ] ---

    public static int nFT_Get_MM_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Get_MM_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_MM_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Get_MM_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_Var_Blend_Coordinates ] ---

    public static int nFT_Set_Var_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Set_Var_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Var_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Set_Var_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Get_Var_Blend_Coordinates ] ---

    public static int nFT_Get_Var_Blend_Coordinates(long face, int num_coords, long coords) {
        long __functionAddress = Functions.Get_Var_Blend_Coordinates;
        return invokePPI(face, num_coords, coords, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Var_Blend_Coordinates(FT_Face face, @NativeType("FT_Fixed *") CLongBuffer coords) {
        return nFT_Get_Var_Blend_Coordinates(face.address(), coords.remaining(), memAddress(coords));
    }

    // --- [ FT_Set_MM_WeightVector ] ---

    /** Unsafe version of: {@link #FT_Set_MM_WeightVector Set_MM_WeightVector} */
    public static int nFT_Set_MM_WeightVector(long face, int len, long weightvector) {
        long __functionAddress = Functions.Set_MM_WeightVector;
        return invokePPI(face, len, weightvector, __functionAddress);
    }

    /** @return : FreeType error code.  0~means success. */
    @NativeType("FT_Error")
    public static int FT_Set_MM_WeightVector(FT_Face face, @Nullable @NativeType("FT_Fixed *") CLongBuffer weightvector) {
        return nFT_Set_MM_WeightVector(face.address(), remainingSafe(weightvector), memAddressSafe(weightvector));
    }

    // --- [ FT_Get_MM_WeightVector ] ---

    public static int nFT_Get_MM_WeightVector(long face, long len, long weightvector) {
        long __functionAddress = Functions.Get_MM_WeightVector;
        return invokePPPI(face, len, weightvector, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_MM_WeightVector(FT_Face face, @NativeType("FT_UInt *") IntBuffer len, @NativeType("FT_Fixed *") CLongBuffer weightvector) {
        if (CHECKS) {
            check(len, 1);
            check(weightvector, len.get(len.position()));
        }
        return nFT_Get_MM_WeightVector(face.address(), memAddress(len), memAddress(weightvector));
    }

    // --- [ FT_Get_Var_Axis_Flags ] ---

    public static int nFT_Get_Var_Axis_Flags(long master, int axis_index, long flags) {
        long __functionAddress = Functions.Get_Var_Axis_Flags;
        return invokePPI(master, axis_index, flags, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Var_Axis_Flags(@NativeType("FT_MM_Var *") FT_MM_Var master, @NativeType("FT_UInt") int axis_index, @NativeType("FT_UInt *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nFT_Get_Var_Axis_Flags(master.address(), axis_index, memAddress(flags));
    }

    // --- [ FT_Set_Named_Instance ] ---

    public static int nFT_Set_Named_Instance(long face, int instance_index) {
        long __functionAddress = Functions.Set_Named_Instance;
        return invokePI(face, instance_index, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Named_Instance(FT_Face face, @NativeType("FT_UInt") int instance_index) {
        return nFT_Set_Named_Instance(face.address(), instance_index);
    }

    // --- [ FT_Get_Default_Named_Instance ] ---

    public static int nFT_Get_Default_Named_Instance(long face, long instance_index) {
        long __functionAddress = Functions.Get_Default_Named_Instance;
        return invokePPI(face, instance_index, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Default_Named_Instance(FT_Face face, @NativeType("FT_UInt *") IntBuffer instance_index) {
        if (CHECKS) {
            check(instance_index, 1);
        }
        return nFT_Get_Default_Named_Instance(face.address(), memAddress(instance_index));
    }

    // --- [ FT_Add_Module ] ---

    public static int nFT_Add_Module(long library, long clazz) {
        long __functionAddress = Functions.Add_Module;
        if (CHECKS) {
            check(library);
            FT_Module_Class.validate(clazz);
        }
        return invokePPI(library, clazz, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Add_Module(@NativeType("FT_Library") long library, @NativeType("FT_Module_Class const *") FT_Module_Class clazz) {
        return nFT_Add_Module(library, clazz.address());
    }

    // --- [ FT_Get_Module ] ---

    public static long nFT_Get_Module(long library, long module_name) {
        long __functionAddress = Functions.Get_Module;
        if (CHECKS) {
            check(library);
        }
        return invokePPP(library, module_name, __functionAddress);
    }

    @NativeType("FT_Module")
    public static long FT_Get_Module(@NativeType("FT_Library") long library, @NativeType("char const *") ByteBuffer module_name) {
        if (CHECKS) {
            checkNT1(module_name);
        }
        return nFT_Get_Module(library, memAddress(module_name));
    }

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

    public static int nFT_Property_Set(long library, long module_name, long property_name, long value) {
        long __functionAddress = Functions.Property_Set;
        if (CHECKS) {
            check(library);
        }
        return invokePPPPI(library, module_name, property_name, value, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Property_Set(@NativeType("FT_Library") long library, @NativeType("FT_String const *") ByteBuffer module_name, @NativeType("FT_String const *") ByteBuffer property_name, @NativeType("void const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(module_name);
            checkNT1(property_name);
        }
        return nFT_Property_Set(library, memAddress(module_name), memAddress(property_name), memAddress(value));
    }

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

    public static int nFT_Property_Get(long library, long module_name, long property_name, long value) {
        long __functionAddress = Functions.Property_Get;
        if (CHECKS) {
            check(library);
        }
        return invokePPPPI(library, module_name, property_name, value, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Property_Get(@NativeType("FT_Library") long library, @NativeType("FT_String const *") ByteBuffer module_name, @NativeType("FT_String const *") ByteBuffer property_name, @NativeType("void *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(module_name);
            checkNT1(property_name);
        }
        return nFT_Property_Get(library, memAddress(module_name), memAddress(property_name), memAddress(value));
    }

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

    public static void FT_Set_Default_Properties(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Set_Default_Properties;
        if (CHECKS) {
            check(library);
        }
        invokePV(library, __functionAddress);
    }

    // --- [ FT_Reference_Library ] ---

    @NativeType("FT_Error")
    public static int FT_Reference_Library(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Reference_Library;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_New_Library ] ---

    public static int nFT_New_Library(long memory, long alibrary) {
        long __functionAddress = Functions.New_Library;
        return invokePPI(memory, alibrary, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_New_Library(FT_Memory memory, @NativeType("FT_Library *") PointerBuffer alibrary) {
        if (CHECKS) {
            check(alibrary, 1);
        }
        return nFT_New_Library(memory.address(), memAddress(alibrary));
    }

    // --- [ FT_Done_Library ] ---

    @NativeType("FT_Error")
    public static int FT_Done_Library(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Done_Library;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_Set_Debug_Hook ] ---

    public static void nFT_Set_Debug_Hook(long library, int hook_index, long debug_hook) {
        long __functionAddress = Functions.Set_Debug_Hook;
        if (CHECKS) {
            check(library);
        }
        invokePPV(library, hook_index, debug_hook, __functionAddress);
    }

    public static void FT_Set_Debug_Hook(@NativeType("FT_Library") long library, @NativeType("FT_UInt") int hook_index, @Nullable @NativeType("FT_DebugHook_Func") FT_DebugHook_FuncI debug_hook) {
        nFT_Set_Debug_Hook(library, hook_index, memAddressSafe(debug_hook));
    }

    // --- [ FT_Add_Default_Modules ] ---

    public static void FT_Add_Default_Modules(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Add_Default_Modules;
        if (CHECKS) {
            check(library);
        }
        invokePV(library, __functionAddress);
    }

    // --- [ FT_Get_TrueType_Engine_Type ] ---

    @NativeType("FT_TrueTypeEngineType")
    public static int FT_Get_TrueType_Engine_Type(@NativeType("FT_Library") long library) {
        long __functionAddress = Functions.Get_TrueType_Engine_Type;
        if (CHECKS) {
            check(library);
        }
        return invokePI(library, __functionAddress);
    }

    // --- [ FT_OpenType_Validate ] ---

    public static int nFT_OpenType_Validate(long face, int validation_flags, long BASE_table, long GDEF_table, long GPOS_table, long GSUB_table, long JSTF_table) {
        long __functionAddress = Functions.OpenType_Validate;
        return invokePPPPPPI(face, validation_flags, BASE_table, GDEF_table, GPOS_table, GSUB_table, JSTF_table, __functionAddress);
    }

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

    public static void nFT_OpenType_Free(long face, long table) {
        long __functionAddress = Functions.OpenType_Free;
        invokePPV(face, table, __functionAddress);
    }

    public static void FT_OpenType_Free(FT_Face face, @NativeType("FT_Bytes") ByteBuffer table) {
        nFT_OpenType_Free(face.address(), memAddress(table));
    }

    // --- [ FT_Outline_Decompose ] ---

    public static int nFT_Outline_Decompose(long outline, long func_interface, long user) {
        long __functionAddress = Functions.Outline_Decompose;
        return invokePPPI(outline, func_interface, user, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Decompose(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Outline_Funcs const *") FT_Outline_Funcs func_interface, @NativeType("void *") long user) {
        return nFT_Outline_Decompose(outline.address(), func_interface.address(), user);
    }

    // --- [ FT_Outline_New ] ---

    public static int nFT_Outline_New(long library, int numPoints, int numContours, long anoutline) {
        long __functionAddress = Functions.Outline_New;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, numPoints, numContours, anoutline, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_New(@NativeType("FT_Library") long library, @NativeType("FT_UInt") int numPoints, @NativeType("FT_Int") int numContours, @NativeType("FT_Outline *") FT_Outline anoutline) {
        return nFT_Outline_New(library, numPoints, numContours, anoutline.address());
    }

    // --- [ FT_Outline_Done ] ---

    public static int nFT_Outline_Done(long library, long outline) {
        long __functionAddress = Functions.Outline_Done;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, outline, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Done(@NativeType("FT_Library") long library, @NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_Done(library, outline.address());
    }

    // --- [ FT_Outline_Check ] ---

    public static int nFT_Outline_Check(long outline) {
        long __functionAddress = Functions.Outline_Check;
        return invokePI(outline, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Check(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_Check(outline.address());
    }

    // --- [ FT_Outline_Get_CBox ] ---

    public static void nFT_Outline_Get_CBox(long outline, long acbox) {
        long __functionAddress = Functions.Outline_Get_CBox;
        invokePPV(outline, acbox, __functionAddress);
    }

    public static void FT_Outline_Get_CBox(@NativeType("FT_Outline const *") FT_Outline outline, @NativeType("FT_BBox *") FT_BBox acbox) {
        nFT_Outline_Get_CBox(outline.address(), acbox.address());
    }

    // --- [ FT_Outline_Translate ] ---

    public static void nFT_Outline_Translate(long outline, long xOffset, long yOffset) {
        long __functionAddress = Functions.Outline_Translate;
        invokePNNV(outline, xOffset, yOffset, __functionAddress);
    }

    public static void FT_Outline_Translate(@NativeType("FT_Outline const *") FT_Outline outline, @NativeType("FT_Pos") long xOffset, @NativeType("FT_Pos") long yOffset) {
        nFT_Outline_Translate(outline.address(), xOffset, yOffset);
    }

    // --- [ FT_Outline_Copy ] ---

    public static int nFT_Outline_Copy(long source, long target) {
        long __functionAddress = Functions.Outline_Copy;
        return invokePPI(source, target, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Copy(@NativeType("FT_Outline const *") FT_Outline source, @NativeType("FT_Outline *") FT_Outline target) {
        return nFT_Outline_Copy(source.address(), target.address());
    }

    // --- [ FT_Outline_Transform ] ---

    public static void nFT_Outline_Transform(long outline, long matrix) {
        long __functionAddress = Functions.Outline_Transform;
        invokePPV(outline, matrix, __functionAddress);
    }

    public static void FT_Outline_Transform(@NativeType("FT_Outline const *") FT_Outline outline, @NativeType("FT_Matrix const *") FT_Matrix matrix) {
        nFT_Outline_Transform(outline.address(), matrix.address());
    }

    // --- [ FT_Outline_Embolden ] ---

    public static int nFT_Outline_Embolden(long outline, long strength) {
        long __functionAddress = Functions.Outline_Embolden;
        return invokePNI(outline, strength, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Embolden(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Pos") long strength) {
        return nFT_Outline_Embolden(outline.address(), strength);
    }

    // --- [ FT_Outline_EmboldenXY ] ---

    public static int nFT_Outline_EmboldenXY(long outline, long xstrength, long ystrength) {
        long __functionAddress = Functions.Outline_EmboldenXY;
        return invokePNNI(outline, xstrength, ystrength, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_EmboldenXY(@NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Pos") long xstrength, @NativeType("FT_Pos") long ystrength) {
        return nFT_Outline_EmboldenXY(outline.address(), xstrength, ystrength);
    }

    // --- [ FT_Outline_Reverse ] ---

    public static void nFT_Outline_Reverse(long outline) {
        long __functionAddress = Functions.Outline_Reverse;
        invokePV(outline, __functionAddress);
    }

    public static void FT_Outline_Reverse(@NativeType("FT_Outline *") FT_Outline outline) {
        nFT_Outline_Reverse(outline.address());
    }

    // --- [ FT_Outline_Get_Bitmap ] ---

    public static int nFT_Outline_Get_Bitmap(long library, long outline, long abitmap) {
        long __functionAddress = Functions.Outline_Get_Bitmap;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, outline, abitmap, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Get_Bitmap(@NativeType("FT_Library") long library, @NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Bitmap const *") FT_Bitmap abitmap) {
        return nFT_Outline_Get_Bitmap(library, outline.address(), abitmap.address());
    }

    // --- [ FT_Outline_Render ] ---

    public static int nFT_Outline_Render(long library, long outline, long params) {
        long __functionAddress = Functions.Outline_Render;
        if (CHECKS) {
            check(library);
        }
        return invokePPPI(library, outline, params, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Outline_Render(@NativeType("FT_Library") long library, @NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Raster_Params *") FT_Raster_Params params) {
        return nFT_Outline_Render(library, outline.address(), params.address());
    }

    // --- [ FT_Outline_Get_Orientation ] ---

    public static int nFT_Outline_Get_Orientation(long outline) {
        long __functionAddress = Functions.Outline_Get_Orientation;
        return invokePI(outline, __functionAddress);
    }

    @NativeType("FT_Orientation")
    public static int FT_Outline_Get_Orientation(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_Get_Orientation(outline.address());
    }

    // --- [ FT_Get_PFR_Metrics ] ---

    public static int nFT_Get_PFR_Metrics(long face, long aoutline_resolution, long ametrics_resolution, long ametrics_x_scale, long ametrics_y_scale) {
        long __functionAddress = Functions.Get_PFR_Metrics;
        return invokePPPPPI(face, aoutline_resolution, ametrics_resolution, ametrics_x_scale, ametrics_y_scale, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_PFR_Metrics(FT_Face face, @Nullable @NativeType("FT_UInt *") IntBuffer aoutline_resolution, @Nullable @NativeType("FT_UInt *") IntBuffer ametrics_resolution, @Nullable @NativeType("FT_Fixed *") CLongBuffer ametrics_x_scale, @Nullable @NativeType("FT_Fixed *") CLongBuffer ametrics_y_scale) {
        if (CHECKS) {
            checkSafe(aoutline_resolution, 1);
            checkSafe(ametrics_resolution, 1);
            checkSafe(ametrics_x_scale, 1);
            checkSafe(ametrics_y_scale, 1);
        }
        return nFT_Get_PFR_Metrics(face.address(), memAddressSafe(aoutline_resolution), memAddressSafe(ametrics_resolution), memAddressSafe(ametrics_x_scale), memAddressSafe(ametrics_y_scale));
    }

    // --- [ FT_Get_PFR_Kerning ] ---

    public static int nFT_Get_PFR_Kerning(long face, int left, int right, long avector) {
        long __functionAddress = Functions.Get_PFR_Kerning;
        return invokePPI(face, left, right, avector, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_PFR_Kerning(FT_Face face, @NativeType("FT_UInt") int left, @NativeType("FT_UInt") int right, @NativeType("FT_Vector *") FT_Vector avector) {
        return nFT_Get_PFR_Kerning(face.address(), left, right, avector.address());
    }

    // --- [ FT_Get_PFR_Advance ] ---

    public static int nFT_Get_PFR_Advance(long face, int gindex, long aadvance) {
        long __functionAddress = Functions.Get_PFR_Advance;
        return invokePPI(face, gindex, aadvance, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_PFR_Advance(FT_Face face, @NativeType("FT_UInt") int gindex, @NativeType("FT_Pos *") CLongBuffer aadvance) {
        if (CHECKS) {
            check(aadvance, 1);
        }
        return nFT_Get_PFR_Advance(face.address(), gindex, memAddress(aadvance));
    }

    // --- [ FT_Get_Renderer ] ---

    @NativeType("FT_Renderer")
    public static long FT_Get_Renderer(@NativeType("FT_Library") long library, @NativeType("FT_Glyph_Format") int format) {
        long __functionAddress = Functions.Get_Renderer;
        if (CHECKS) {
            check(library);
        }
        return invokePP(library, format, __functionAddress);
    }

    // --- [ FT_Set_Renderer ] ---

    public static int nFT_Set_Renderer(long library, long renderer, int num_params, long parameters) {
        long __functionAddress = Functions.Set_Renderer;
        if (CHECKS) {
            check(library);
            check(renderer);
        }
        return invokePPPI(library, renderer, num_params, parameters, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Set_Renderer(@NativeType("FT_Library") long library, @NativeType("FT_Renderer") long renderer, @NativeType("FT_Parameter *") FT_Parameter.Buffer parameters) {
        return nFT_Set_Renderer(library, renderer, parameters.remaining(), parameters.address());
    }

    // --- [ FT_New_Size ] ---

    public static int nFT_New_Size(long face, long size) {
        long __functionAddress = Functions.New_Size;
        return invokePPI(face, size, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_New_Size(FT_Face face, @NativeType("FT_Size *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nFT_New_Size(face.address(), memAddress(size));
    }

    // --- [ FT_Done_Size ] ---

    public static int nFT_Done_Size(long size) {
        long __functionAddress = Functions.Done_Size;
        return invokePI(size, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Done_Size(FT_Size size) {
        return nFT_Done_Size(size.address());
    }

    // --- [ FT_Activate_Size ] ---

    public static int nFT_Activate_Size(long size) {
        long __functionAddress = Functions.Activate_Size;
        return invokePI(size, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Activate_Size(FT_Size size) {
        return nFT_Activate_Size(size.address());
    }

    // --- [ FT_Get_Sfnt_Name_Count ] ---

    public static int nFT_Get_Sfnt_Name_Count(long face) {
        long __functionAddress = Functions.Get_Sfnt_Name_Count;
        return invokePI(face, __functionAddress);
    }

    @NativeType("FT_UInt")
    public static int FT_Get_Sfnt_Name_Count(FT_Face face) {
        return nFT_Get_Sfnt_Name_Count(face.address());
    }

    // --- [ FT_Get_Sfnt_Name ] ---

    public static int nFT_Get_Sfnt_Name(long face, int idx, long aname) {
        long __functionAddress = Functions.Get_Sfnt_Name;
        return invokePPI(face, idx, aname, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Sfnt_Name(FT_Face face, @NativeType("FT_UInt") int idx, @NativeType("FT_SfntName *") FT_SfntName aname) {
        return nFT_Get_Sfnt_Name(face.address(), idx, aname.address());
    }

    // --- [ FT_Get_Sfnt_LangTag ] ---

    public static int nFT_Get_Sfnt_LangTag(long face, int langID, long alangTag) {
        long __functionAddress = Functions.Get_Sfnt_LangTag;
        return invokePPI(face, langID, alangTag, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_Sfnt_LangTag(FT_Face face, @NativeType("FT_UInt") int langID, @NativeType("FT_SfntLangTag *") FT_SfntLangTag alangTag) {
        return nFT_Get_Sfnt_LangTag(face.address(), langID, alangTag.address());
    }

    // --- [ FT_Outline_GetInsideBorder ] ---

    public static int nFT_Outline_GetInsideBorder(long outline) {
        long __functionAddress = Functions.Outline_GetInsideBorder;
        return invokePI(outline, __functionAddress);
    }

    @NativeType("FT_StrokerBorder")
    public static int FT_Outline_GetInsideBorder(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_GetInsideBorder(outline.address());
    }

    // --- [ FT_Outline_GetOutsideBorder ] ---

    public static int nFT_Outline_GetOutsideBorder(long outline) {
        long __functionAddress = Functions.Outline_GetOutsideBorder;
        return invokePI(outline, __functionAddress);
    }

    @NativeType("FT_StrokerBorder")
    public static int FT_Outline_GetOutsideBorder(@NativeType("FT_Outline *") FT_Outline outline) {
        return nFT_Outline_GetOutsideBorder(outline.address());
    }

    // --- [ FT_Stroker_New ] ---

    public static int nFT_Stroker_New(long library, long astroker) {
        long __functionAddress = Functions.Stroker_New;
        if (CHECKS) {
            check(library);
        }
        return invokePPI(library, astroker, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_New(@NativeType("FT_Library") long library, @NativeType("FT_Stroker *") PointerBuffer astroker) {
        if (CHECKS) {
            check(astroker, 1);
        }
        return nFT_Stroker_New(library, memAddress(astroker));
    }

    // --- [ FT_Stroker_Set ] ---

    public static void FT_Stroker_Set(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Fixed") long radius, @NativeType("FT_Stroker_LineCap") int line_cap, @NativeType("FT_Stroker_LineJoin") int line_join, @NativeType("FT_Fixed") long miter_limit) {
        long __functionAddress = Functions.Stroker_Set;
        if (CHECKS) {
            check(stroker);
        }
        invokePNNV(stroker, radius, line_cap, line_join, miter_limit, __functionAddress);
    }

    // --- [ FT_Stroker_Rewind ] ---

    public static void FT_Stroker_Rewind(@NativeType("FT_Stroker") long stroker) {
        long __functionAddress = Functions.Stroker_Rewind;
        if (CHECKS) {
            check(stroker);
        }
        invokePV(stroker, __functionAddress);
    }

    // --- [ FT_Stroker_ParseOutline ] ---

    public static int nFT_Stroker_ParseOutline(long stroker, long outline, boolean opened) {
        long __functionAddress = Functions.Stroker_ParseOutline;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(stroker, outline, opened, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_ParseOutline(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Outline *") FT_Outline outline, @NativeType("FT_Bool") boolean opened) {
        return nFT_Stroker_ParseOutline(stroker, outline.address(), opened);
    }

    // --- [ FT_Stroker_BeginSubPath ] ---

    public static int nFT_Stroker_BeginSubPath(long stroker, long to, boolean open) {
        long __functionAddress = Functions.Stroker_BeginSubPath;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(stroker, to, open, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_BeginSubPath(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector to, @NativeType("FT_Bool") boolean open) {
        return nFT_Stroker_BeginSubPath(stroker, to.address(), open);
    }

    // --- [ FT_Stroker_EndSubPath ] ---

    @NativeType("FT_Error")
    public static int FT_Stroker_EndSubPath(@NativeType("FT_Stroker") long stroker) {
        long __functionAddress = Functions.Stroker_EndSubPath;
        if (CHECKS) {
            check(stroker);
        }
        return invokePI(stroker, __functionAddress);
    }

    // --- [ FT_Stroker_LineTo ] ---

    public static int nFT_Stroker_LineTo(long stroker, long to) {
        long __functionAddress = Functions.Stroker_LineTo;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(stroker, to, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_LineTo(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector to) {
        return nFT_Stroker_LineTo(stroker, to.address());
    }

    // --- [ FT_Stroker_ConicTo ] ---

    public static int nFT_Stroker_ConicTo(long stroker, long control, long to) {
        long __functionAddress = Functions.Stroker_ConicTo;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPI(stroker, control, to, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_ConicTo(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector control, @NativeType("FT_Vector *") FT_Vector to) {
        return nFT_Stroker_ConicTo(stroker, control.address(), to.address());
    }

    // --- [ FT_Stroker_CubicTo ] ---

    public static int nFT_Stroker_CubicTo(long stroker, long control1, long control2, long to) {
        long __functionAddress = Functions.Stroker_CubicTo;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPPI(stroker, control1, control2, to, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_CubicTo(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Vector *") FT_Vector control1, @NativeType("FT_Vector *") FT_Vector control2, @NativeType("FT_Vector *") FT_Vector to) {
        return nFT_Stroker_CubicTo(stroker, control1.address(), control2.address(), to.address());
    }

    // --- [ FT_Stroker_GetBorderCounts ] ---

    public static int nFT_Stroker_GetBorderCounts(long stroker, int border, long anum_points, long anum_contours) {
        long __functionAddress = Functions.Stroker_GetBorderCounts;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPI(stroker, border, anum_points, anum_contours, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_GetBorderCounts(@NativeType("FT_Stroker") long stroker, @NativeType("FT_StrokerBorder") int border, @NativeType("FT_UInt *") IntBuffer anum_points, @NativeType("FT_UInt *") IntBuffer anum_contours) {
        if (CHECKS) {
            check(anum_points, 1);
            check(anum_contours, 1);
        }
        return nFT_Stroker_GetBorderCounts(stroker, border, memAddress(anum_points), memAddress(anum_contours));
    }

    // --- [ FT_Stroker_ExportBorder ] ---

    public static void nFT_Stroker_ExportBorder(long stroker, int border, long outline) {
        long __functionAddress = Functions.Stroker_ExportBorder;
        if (CHECKS) {
            check(stroker);
        }
        invokePPV(stroker, border, outline, __functionAddress);
    }

    public static void FT_Stroker_ExportBorder(@NativeType("FT_Stroker") long stroker, @NativeType("FT_StrokerBorder") int border, @NativeType("FT_Outline *") FT_Outline outline) {
        nFT_Stroker_ExportBorder(stroker, border, outline.address());
    }

    // --- [ FT_Stroker_GetCounts ] ---

    public static int nFT_Stroker_GetCounts(long stroker, long anum_points, long anum_contours) {
        long __functionAddress = Functions.Stroker_GetCounts;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPPI(stroker, anum_points, anum_contours, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Stroker_GetCounts(@NativeType("FT_Stroker") long stroker, @NativeType("FT_UInt *") IntBuffer anum_points, @NativeType("FT_UInt *") IntBuffer anum_contours) {
        if (CHECKS) {
            check(anum_points, 1);
            check(anum_contours, 1);
        }
        return nFT_Stroker_GetCounts(stroker, memAddress(anum_points), memAddress(anum_contours));
    }

    // --- [ FT_Stroker_Export ] ---

    public static void nFT_Stroker_Export(long stroker, long outline) {
        long __functionAddress = Functions.Stroker_Export;
        if (CHECKS) {
            check(stroker);
        }
        invokePPV(stroker, outline, __functionAddress);
    }

    public static void FT_Stroker_Export(@NativeType("FT_Stroker") long stroker, @NativeType("FT_Outline *") FT_Outline outline) {
        nFT_Stroker_Export(stroker, outline.address());
    }

    // --- [ FT_Stroker_Done ] ---

    public static void FT_Stroker_Done(@NativeType("FT_Stroker") long stroker) {
        long __functionAddress = Functions.Stroker_Done;
        if (CHECKS) {
            check(stroker);
        }
        invokePV(stroker, __functionAddress);
    }

    // --- [ FT_Glyph_Stroke ] ---

    public static int nFT_Glyph_Stroke(long pglyph, long stroker, boolean destroy) {
        long __functionAddress = Functions.Glyph_Stroke;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(pglyph, stroker, destroy, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Glyph_Stroke(@NativeType("FT_Glyph *") PointerBuffer pglyph, @NativeType("FT_Stroker") long stroker, @NativeType("FT_Bool") boolean destroy) {
        if (CHECKS) {
            check(pglyph, 1);
        }
        return nFT_Glyph_Stroke(memAddress(pglyph), stroker, destroy);
    }

    // --- [ FT_Glyph_StrokeBorder ] ---

    public static int nFT_Glyph_StrokeBorder(long pglyph, long stroker, boolean inside, boolean destroy) {
        long __functionAddress = Functions.Glyph_StrokeBorder;
        if (CHECKS) {
            check(stroker);
        }
        return invokePPI(pglyph, stroker, inside, destroy, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Glyph_StrokeBorder(@NativeType("FT_Glyph *") PointerBuffer pglyph, @NativeType("FT_Stroker") long stroker, @NativeType("FT_Bool") boolean inside, @NativeType("FT_Bool") boolean destroy) {
        if (CHECKS) {
            check(pglyph, 1);
        }
        return nFT_Glyph_StrokeBorder(memAddress(pglyph), stroker, inside, destroy);
    }

    // --- [ FT_GlyphSlot_Embolden ] ---

    public static void nFT_GlyphSlot_Embolden(long slot) {
        long __functionAddress = Functions.GlyphSlot_Embolden;
        invokePV(slot, __functionAddress);
    }

    public static void FT_GlyphSlot_Embolden(FT_GlyphSlot slot) {
        nFT_GlyphSlot_Embolden(slot.address());
    }

    // --- [ FT_GlyphSlot_AdjustWeight ] ---

    public static void nFT_GlyphSlot_AdjustWeight(long slot, long xdelta, long ydelta) {
        long __functionAddress = Functions.GlyphSlot_AdjustWeight;
        invokePNNV(slot, xdelta, ydelta, __functionAddress);
    }

    public static void FT_GlyphSlot_AdjustWeight(FT_GlyphSlot slot, @NativeType("FT_Fixed") long xdelta, @NativeType("FT_Fixed") long ydelta) {
        nFT_GlyphSlot_AdjustWeight(slot.address(), xdelta, ydelta);
    }

    // --- [ FT_GlyphSlot_Oblique ] ---

    public static void nFT_GlyphSlot_Oblique(long slot) {
        long __functionAddress = Functions.GlyphSlot_Oblique;
        invokePV(slot, __functionAddress);
    }

    public static void FT_GlyphSlot_Oblique(FT_GlyphSlot slot) {
        nFT_GlyphSlot_Oblique(slot.address());
    }

    // --- [ FT_GlyphSlot_Slant ] ---

    public static void nFT_GlyphSlot_Slant(long slot, long xslant, long yslant) {
        long __functionAddress = Functions.GlyphSlot_Slant;
        invokePNNV(slot, xslant, yslant, __functionAddress);
    }

    public static void FT_GlyphSlot_Slant(FT_GlyphSlot slot, @NativeType("FT_Fixed") long xslant, @NativeType("FT_Fixed") long yslant) {
        nFT_GlyphSlot_Slant(slot.address(), xslant, yslant);
    }

    // --- [ FT_Sin ] ---

    @NativeType("FT_Fixed")
    public static long FT_Sin(@NativeType("FT_Angle") long angle) {
        long __functionAddress = Functions.Sin;
        return invokeNN(angle, __functionAddress);
    }

    // --- [ FT_Cos ] ---

    @NativeType("FT_Fixed")
    public static long FT_Cos(@NativeType("FT_Angle") long angle) {
        long __functionAddress = Functions.Cos;
        return invokeNN(angle, __functionAddress);
    }

    // --- [ FT_Tan ] ---

    @NativeType("FT_Fixed")
    public static long FT_Tan(@NativeType("FT_Angle") long angle) {
        long __functionAddress = Functions.Tan;
        return invokeNN(angle, __functionAddress);
    }

    // --- [ FT_Atan2 ] ---

    @NativeType("FT_Angle")
    public static long FT_Atan2(@NativeType("FT_Fixed") long x, @NativeType("FT_Fixed") long y) {
        long __functionAddress = Functions.Atan2;
        return invokeNNN(x, y, __functionAddress);
    }

    // --- [ FT_Angle_Diff ] ---

    @NativeType("FT_Angle")
    public static long FT_Angle_Diff(@NativeType("FT_Angle") long angle1, @NativeType("FT_Angle") long angle2) {
        long __functionAddress = Functions.Angle_Diff;
        return invokeNNN(angle1, angle2, __functionAddress);
    }

    // --- [ FT_Vector_Unit ] ---

    public static void nFT_Vector_Unit(long vec, long angle) {
        long __functionAddress = Functions.Vector_Unit;
        invokePNV(vec, angle, __functionAddress);
    }

    public static void FT_Vector_Unit(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Angle") long angle) {
        nFT_Vector_Unit(vec.address(), angle);
    }

    // --- [ FT_Vector_Rotate ] ---

    public static void nFT_Vector_Rotate(long vec, long angle) {
        long __functionAddress = Functions.Vector_Rotate;
        invokePNV(vec, angle, __functionAddress);
    }

    public static void FT_Vector_Rotate(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Angle") long angle) {
        nFT_Vector_Rotate(vec.address(), angle);
    }

    // --- [ FT_Vector_Length ] ---

    public static long nFT_Vector_Length(long vec) {
        long __functionAddress = Functions.Vector_Length;
        return invokePN(vec, __functionAddress);
    }

    @NativeType("FT_Fixed")
    public static long FT_Vector_Length(@NativeType("FT_Vector *") FT_Vector vec) {
        return nFT_Vector_Length(vec.address());
    }

    // --- [ FT_Vector_Polarize ] ---

    public static void nFT_Vector_Polarize(long vec, long length, long angle) {
        long __functionAddress = Functions.Vector_Polarize;
        invokePPPV(vec, length, angle, __functionAddress);
    }

    public static void FT_Vector_Polarize(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Fixed *") CLongBuffer length, @NativeType("FT_Angle *") CLongBuffer angle) {
        if (CHECKS) {
            check(length, 1);
            check(angle, 1);
        }
        nFT_Vector_Polarize(vec.address(), memAddress(length), memAddress(angle));
    }

    // --- [ FT_Vector_From_Polar ] ---

    public static void nFT_Vector_From_Polar(long vec, long length, long angle) {
        long __functionAddress = Functions.Vector_From_Polar;
        invokePNNV(vec, length, angle, __functionAddress);
    }

    public static void FT_Vector_From_Polar(@NativeType("FT_Vector *") FT_Vector vec, @NativeType("FT_Fixed") long length, @NativeType("FT_Angle") long angle) {
        nFT_Vector_From_Polar(vec.address(), length, angle);
    }

    // --- [ FT_Has_PS_Glyph_Names ] ---

    public static int nFT_Has_PS_Glyph_Names(long face) {
        long __functionAddress = Functions.Has_PS_Glyph_Names;
        return invokePI(face, __functionAddress);
    }

    @NativeType("FT_Int")
    public static int FT_Has_PS_Glyph_Names(FT_Face face) {
        return nFT_Has_PS_Glyph_Names(face.address());
    }

    // --- [ FT_Get_PS_Font_Info ] ---

    public static int nFT_Get_PS_Font_Info(long face, long afont_info) {
        long __functionAddress = Functions.Get_PS_Font_Info;
        return invokePPI(face, afont_info, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_PS_Font_Info(FT_Face face, PS_FontInfo afont_info) {
        return nFT_Get_PS_Font_Info(face.address(), afont_info.address());
    }

    // --- [ FT_Get_PS_Font_Private ] ---

    public static int nFT_Get_PS_Font_Private(long face, long afont_private) {
        long __functionAddress = Functions.Get_PS_Font_Private;
        if (CHECKS) {
            check(afont_private);
        }
        return invokePPI(face, afont_private, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Get_PS_Font_Private(FT_Face face, @NativeType("PS_Private") long afont_private) {
        return nFT_Get_PS_Font_Private(face.address(), afont_private);
    }

    // --- [ FT_Get_PS_Font_Value ] ---

    public static long nFT_Get_PS_Font_Value(long face, int key, int idx, long value, long value_len) {
        long __functionAddress = Functions.Get_PS_Font_Value;
        return invokePPNN(face, key, idx, value, value_len, __functionAddress);
    }

    @NativeType("FT_Long")
    public static long FT_Get_PS_Font_Value(FT_Face face, @NativeType("PS_Dict_Keys") int key, @NativeType("FT_UInt") int idx, @Nullable @NativeType("void *") ByteBuffer value) {
        return nFT_Get_PS_Font_Value(face.address(), key, idx, memAddressSafe(value), remainingSafe(value));
    }

    // --- [ FT_Get_Sfnt_Table ] ---

    public static long nFT_Get_Sfnt_Table(long face, int tag) {
        long __functionAddress = Functions.Get_Sfnt_Table;
        return invokePP(face, tag, __functionAddress);
    }

    @NativeType("void *")
    public static long FT_Get_Sfnt_Table(FT_Face face, @NativeType("FT_Sfnt_Tag") int tag) {
        return nFT_Get_Sfnt_Table(face.address(), tag);
    }

    // --- [ FT_Load_Sfnt_Table ] ---

    public static int nFT_Load_Sfnt_Table(long face, long tag, long offset, long buffer, long length) {
        long __functionAddress = Functions.Load_Sfnt_Table;
        return invokePNNPPI(face, tag, offset, buffer, length, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Load_Sfnt_Table(FT_Face face, @NativeType("FT_ULong") long tag, @NativeType("FT_Long") long offset, @Nullable @NativeType("FT_Byte *") ByteBuffer buffer, @Nullable @NativeType("FT_ULong *") CLongBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        return nFT_Load_Sfnt_Table(face.address(), tag, offset, memAddressSafe(buffer), memAddressSafe(length));
    }

    // --- [ FT_Sfnt_Table_Info ] ---

    public static int nFT_Sfnt_Table_Info(long face, int table_index, long tag, long length) {
        long __functionAddress = Functions.Sfnt_Table_Info;
        return invokePPPI(face, table_index, tag, length, __functionAddress);
    }

    @NativeType("FT_Error")
    public static int FT_Sfnt_Table_Info(FT_Face face, @NativeType("FT_UInt") int table_index, @Nullable @NativeType("FT_ULong *") CLongBuffer tag, @Nullable @NativeType("FT_ULong *") CLongBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        return nFT_Sfnt_Table_Info(face.address(), table_index, memAddressSafe(tag), memAddressSafe(length));
    }

    // --- [ FT_Get_CMap_Language_ID ] ---

    public static long nFT_Get_CMap_Language_ID(long charmap) {
        long __functionAddress = Functions.Get_CMap_Language_ID;
        return invokePN(charmap, __functionAddress);
    }

    @NativeType("FT_ULong")
    public static long FT_Get_CMap_Language_ID(FT_CharMap charmap) {
        return nFT_Get_CMap_Language_ID(charmap.address());
    }

    // --- [ FT_Get_CMap_Format ] ---

    public static long nFT_Get_CMap_Format(long charmap) {
        long __functionAddress = Functions.Get_CMap_Format;
        return invokePN(charmap, __functionAddress);
    }

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