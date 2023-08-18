/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a href="https://www.khronos.org/ktx/">KTX (Khronos Texture)</a>.
 * 
 * <p>KTX is a lightweight container for textures for OpenGL®, Vulkan® and other GPU APIs. KTX files contain all the parameters needed for texture loading.
 * A single file can contain anything from a simple base-level 2D texture through to a cubemap array texture with mipmaps. Contained textures can be in a
 * Basis Universal format, in any of the block-compressed formats supported by OpenGL family and Vulkan APIs and extensions or in an uncompressed
 * single-plane format. Basis Universal currently encompasses two formats that can be quickly transcoded to any GPU-supported format: LZ/ETC1S, which
 * combines block-compression and supercompression, and UASTC, a block-compressed format. Formats other than LZ/ETC1S can be supercompressed with Zstd.</p>
 */
public class KTX {

    private static final SharedLibrary KTX = Library.loadNative(KTX.class, "org.lwjgl.ktx", Configuration.KTX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("ktx")), true);

    /** Contains the function pointers loaded from the ktx {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Texture_CreateFromNamedFile    = apiGetFunctionAddress(KTX, "ktxTexture_CreateFromNamedFile"),
            Texture_CreateFromMemory       = apiGetFunctionAddress(KTX, "ktxTexture_CreateFromMemory"),
            Texture_CreateFromStream       = apiGetFunctionAddress(KTX, "ktxTexture_CreateFromStream"),
            Texture_GetData                = apiGetFunctionAddress(KTX, "ktxTexture_GetData"),
            Texture_GetRowPitch            = apiGetFunctionAddress(KTX, "ktxTexture_GetRowPitch"),
            Texture_GetElementSize         = apiGetFunctionAddress(KTX, "ktxTexture_GetElementSize"),
            Texture_GetDataSize            = apiGetFunctionAddress(KTX, "ktxTexture_GetDataSize"),
            Texture_GLUpload               = apiGetFunctionAddress(KTX, "ktxTexture_GLUpload"),
            Texture_IterateLevelFaces      = apiGetFunctionAddress(KTX, "ktxTexture_IterateLevelFaces"),
            Texture1_Create                = apiGetFunctionAddress(KTX, "ktxTexture1_Create"),
            Texture1_CreateFromNamedFile   = apiGetFunctionAddress(KTX, "ktxTexture1_CreateFromNamedFile"),
            Texture1_CreateFromMemory      = apiGetFunctionAddress(KTX, "ktxTexture1_CreateFromMemory"),
            Texture1_CreateFromStream      = apiGetFunctionAddress(KTX, "ktxTexture1_CreateFromStream"),
            Texture1_NeedsTranscoding      = apiGetFunctionAddress(KTX, "ktxTexture1_NeedsTranscoding"),
            Texture1_WriteKTX2ToNamedFile  = apiGetFunctionAddressOptional(KTX, "ktxTexture1_WriteKTX2ToNamedFile"),
            Texture1_WriteKTX2ToMemory     = apiGetFunctionAddressOptional(KTX, "ktxTexture1_WriteKTX2ToMemory"),
            Texture1_WriteKTX2ToStream     = apiGetFunctionAddressOptional(KTX, "ktxTexture1_WriteKTX2ToStream"),
            Texture2_Create                = apiGetFunctionAddress(KTX, "ktxTexture2_Create"),
            Texture2_CreateCopy            = apiGetFunctionAddress(KTX, "ktxTexture2_CreateCopy"),
            Texture2_CreateFromNamedFile   = apiGetFunctionAddress(KTX, "ktxTexture2_CreateFromNamedFile"),
            Texture2_CreateFromMemory      = apiGetFunctionAddress(KTX, "ktxTexture2_CreateFromMemory"),
            Texture2_CreateFromStream      = apiGetFunctionAddress(KTX, "ktxTexture2_CreateFromStream"),
            Texture2_CompressBasis         = apiGetFunctionAddressOptional(KTX, "ktxTexture2_CompressBasis"),
            Texture2_DeflateZstd           = apiGetFunctionAddressOptional(KTX, "ktxTexture2_DeflateZstd"),
            Texture2_DeflateZLIB           = apiGetFunctionAddress(KTX, "ktxTexture2_DeflateZLIB"),
            Texture2_GetComponentInfo      = apiGetFunctionAddress(KTX, "ktxTexture2_GetComponentInfo"),
            Texture2_GetNumComponents      = apiGetFunctionAddress(KTX, "ktxTexture2_GetNumComponents"),
            Texture2_GetOETF_e             = apiGetFunctionAddress(KTX, "ktxTexture2_GetOETF_e"),
            Texture2_GetOETF               = apiGetFunctionAddress(KTX, "ktxTexture2_GetOETF"),
            Texture2_GetColorModel_e       = apiGetFunctionAddress(KTX, "ktxTexture2_GetColorModel_e"),
            Texture2_GetPremultipliedAlpha = apiGetFunctionAddress(KTX, "ktxTexture2_GetPremultipliedAlpha"),
            Texture2_NeedsTranscoding      = apiGetFunctionAddress(KTX, "ktxTexture2_NeedsTranscoding"),
            Texture2_CompressAstcEx        = apiGetFunctionAddressOptional(KTX, "ktxTexture2_CompressAstcEx"),
            Texture2_CompressAstc          = apiGetFunctionAddressOptional(KTX, "ktxTexture2_CompressAstc"),
            Texture2_CompressBasisEx       = apiGetFunctionAddressOptional(KTX, "ktxTexture2_CompressBasisEx"),
            Texture2_TranscodeBasis        = apiGetFunctionAddress(KTX, "ktxTexture2_TranscodeBasis"),
            ErrorString                    = apiGetFunctionAddress(KTX, "ktxErrorString"),
            SupercompressionSchemeString   = apiGetFunctionAddress(KTX, "ktxSupercompressionSchemeString"),
            TranscodeFormatString          = apiGetFunctionAddress(KTX, "ktxTranscodeFormatString"),
            HashList_Create                = apiGetFunctionAddress(KTX, "ktxHashList_Create"),
            HashList_CreateCopy            = apiGetFunctionAddress(KTX, "ktxHashList_CreateCopy"),
            HashList_Construct             = apiGetFunctionAddress(KTX, "ktxHashList_Construct"),
            HashList_ConstructCopy         = apiGetFunctionAddress(KTX, "ktxHashList_ConstructCopy"),
            HashList_Destroy               = apiGetFunctionAddress(KTX, "ktxHashList_Destroy"),
            HashList_Destruct              = apiGetFunctionAddress(KTX, "ktxHashList_Destruct"),
            HashList_AddKVPair             = apiGetFunctionAddress(KTX, "ktxHashList_AddKVPair"),
            HashList_DeleteEntry           = apiGetFunctionAddress(KTX, "ktxHashList_DeleteEntry"),
            HashList_DeleteKVPair          = apiGetFunctionAddress(KTX, "ktxHashList_DeleteKVPair"),
            HashList_FindEntry             = apiGetFunctionAddress(KTX, "ktxHashList_FindEntry"),
            HashList_FindValue             = apiGetFunctionAddress(KTX, "ktxHashList_FindValue"),
            HashList_Next                  = apiGetFunctionAddress(KTX, "ktxHashList_Next"),
            HashList_Sort                  = apiGetFunctionAddress(KTX, "ktxHashList_Sort"),
            HashList_Serialize             = apiGetFunctionAddress(KTX, "ktxHashList_Serialize"),
            HashList_Deserialize           = apiGetFunctionAddress(KTX, "ktxHashList_Deserialize"),
            HashListEntry_GetKey           = apiGetFunctionAddress(KTX, "ktxHashListEntry_GetKey"),
            HashListEntry_GetValue         = apiGetFunctionAddress(KTX, "ktxHashListEntry_GetValue"),
            PrintInfoForNamedFile          = apiGetFunctionAddress(KTX, "ktxPrintInfoForNamedFile"),
            PrintInfoForMemory             = apiGetFunctionAddress(KTX, "ktxPrintInfoForMemory"),
            PrintKTX2InfoTextForMemory     = apiGetFunctionAddress(KTX, "ktxPrintKTX2InfoTextForMemory"),
            PrintKTX2InfoTextForNamedFile  = apiGetFunctionAddress(KTX, "ktxPrintKTX2InfoTextForNamedFile"),
            PrintKTX2InfoTextForStream     = apiGetFunctionAddress(KTX, "ktxPrintKTX2InfoTextForStream"),
            PrintKTX2InfoJSONForMemory     = apiGetFunctionAddress(KTX, "ktxPrintKTX2InfoJSONForMemory"),
            PrintKTX2InfoJSONForNamedFile  = apiGetFunctionAddress(KTX, "ktxPrintKTX2InfoJSONForNamedFile"),
            PrintKTX2InfoJSONForStream     = apiGetFunctionAddress(KTX, "ktxPrintKTX2InfoJSONForStream");

    }

    /** Returns the ktx {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return KTX;
    }

    public static final String KTX_ANIMDATA_KEY = "KTXanimData";

    public static final String KTX_ORIENTATION_KEY = "KTXorientation";

    public static final String KTX_SWIZZLE_KEY = "KTXswizzle";

    public static final String KTX_WRITER_KEY = "KTXwriter";

    public static final String KTX_WRITER_SCPARAMS_KEY = "KTXwriterScParams";

    public static final String KTX_ORIENTATION1_FMT = "S=%c";

    public static final String KTX_ORIENTATION2_FMT = "S=%c,T=%c";

    public static final String KTX_ORIENTATION3_FMT = "S=%c,T=%c,R=%c";

    public static final int KTX_GL_UNPACK_ALIGNMENT = 4;

    public static final int KTX_TRUE = 1;

    public static final int KTX_FALSE = 0;

    public static final int KTX_ENDIAN_REF = 0x04030201;

    public static final int KTX_ENDIAN_REF_REV = 0x01020304;

    public static final int KTX_HEADER_SIZE = 64;

    /**
     * ({@code ktx_error_code_e})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_SUCCESS SUCCESS} - Operation was successful.</li>
     * <li>{@link #KTX_FILE_DATA_ERROR FILE_DATA_ERROR} - The data in the file is inconsistent with the spec.</li>
     * <li>{@link #KTX_FILE_ISPIPE FILE_ISPIPE} - The file is a pipe or named pipe.</li>
     * <li>{@link #KTX_FILE_OPEN_FAILED FILE_OPEN_FAILED} - The target file could not be opened.</li>
     * <li>{@link #KTX_FILE_OVERFLOW FILE_OVERFLOW} - The operation would exceed the max file size.</li>
     * <li>{@link #KTX_FILE_READ_ERROR FILE_READ_ERROR} - An error occurred while reading from the file.</li>
     * <li>{@link #KTX_FILE_SEEK_ERROR FILE_SEEK_ERROR} - An error occurred while seeking in the file.</li>
     * <li>{@link #KTX_FILE_UNEXPECTED_EOF FILE_UNEXPECTED_EOF} - File does not have enough data to satisfy request.</li>
     * <li>{@link #KTX_FILE_WRITE_ERROR FILE_WRITE_ERROR} - An error occurred while writing to the file.</li>
     * <li>{@link #KTX_GL_ERROR GL_ERROR} - GL operations resulted in an error.</li>
     * <li>{@link #KTX_INVALID_OPERATION INVALID_OPERATION} - The operation is not allowed in the current state.</li>
     * <li>{@link #KTX_INVALID_VALUE INVALID_VALUE} - A parameter value was not valid</li>
     * <li>{@link #KTX_NOT_FOUND NOT_FOUND} - Requested key was not found</li>
     * <li>{@link #KTX_OUT_OF_MEMORY OUT_OF_MEMORY} - Not enough memory to complete the operation.</li>
     * <li>{@link #KTX_TRANSCODE_FAILED TRANSCODE_FAILED} - Transcoding of block compressed texture failed.</li>
     * <li>{@link #KTX_UNKNOWN_FILE_FORMAT UNKNOWN_FILE_FORMAT} - The file not a KTX file</li>
     * <li>{@link #KTX_UNSUPPORTED_TEXTURE_TYPE UNSUPPORTED_TEXTURE_TYPE} - The KTX file specifies an unsupported texture type.</li>
     * <li>{@link #KTX_UNSUPPORTED_FEATURE UNSUPPORTED_FEATURE} - Feature not included in in-use library or not yet implemented.</li>
     * <li>{@link #KTX_LIBRARY_NOT_LINKED LIBRARY_NOT_LINKED} - Library dependency (OpenGL or Vulkan) not linked into application.</li>
     * <li>{@link #KTX_DECOMPRESS_LENGTH_ERROR DECOMPRESS_LENGTH_ERROR} - Decompressed byte count does not match expected byte size.</li>
     * <li>{@link #KTX_DECOMPRESS_CHECKSUM_ERROR DECOMPRESS_CHECKSUM_ERROR} - Checksum mismatch when decompressing.</li>
     * </ul>
     */
    public static final int
        KTX_SUCCESS                   = 0,
        KTX_FILE_DATA_ERROR           = 1,
        KTX_FILE_ISPIPE               = 2,
        KTX_FILE_OPEN_FAILED          = 3,
        KTX_FILE_OVERFLOW             = 4,
        KTX_FILE_READ_ERROR           = 5,
        KTX_FILE_SEEK_ERROR           = 6,
        KTX_FILE_UNEXPECTED_EOF       = 7,
        KTX_FILE_WRITE_ERROR          = 8,
        KTX_GL_ERROR                  = 9,
        KTX_INVALID_OPERATION         = 10,
        KTX_INVALID_VALUE             = 11,
        KTX_NOT_FOUND                 = 12,
        KTX_OUT_OF_MEMORY             = 13,
        KTX_TRANSCODE_FAILED          = 14,
        KTX_UNKNOWN_FILE_FORMAT       = 15,
        KTX_UNSUPPORTED_TEXTURE_TYPE  = 16,
        KTX_UNSUPPORTED_FEATURE       = 17,
        KTX_LIBRARY_NOT_LINKED        = 18,
        KTX_DECOMPRESS_LENGTH_ERROR   = 19,
        KTX_DECOMPRESS_CHECKSUM_ERROR = 20;

    /**
     * {@code ktxOrientationX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_ORIENT_X_LEFT ORIENT_X_LEFT}</li>
     * <li>{@link #KTX_ORIENT_X_RIGHT ORIENT_X_RIGHT}</li>
     * </ul>
     */
    public static final int
        KTX_ORIENT_X_LEFT  = 'l',
        KTX_ORIENT_X_RIGHT = 'r';

    /**
     * {@code ktxOrientationY}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_ORIENT_Y_UP ORIENT_Y_UP}</li>
     * <li>{@link #KTX_ORIENT_Y_DOWN ORIENT_Y_DOWN}</li>
     * </ul>
     */
    public static final int
        KTX_ORIENT_Y_UP   = 'u',
        KTX_ORIENT_Y_DOWN = 'd';

    /**
     * {@code ktxOrientationZ}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_ORIENT_Z_IN ORIENT_Z_IN}</li>
     * <li>{@link #KTX_ORIENT_Z_OUT ORIENT_Z_OUT}</li>
     * </ul>
     */
    public static final int
        KTX_ORIENT_Z_IN  = 'i',
        KTX_ORIENT_Z_OUT = 'o';

    /**
     * {@code class_id}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ktxTexture1_c ktxTexture1_c}</li>
     * <li>{@link #ktxTexture2_c ktxTexture2_c}</li>
     * </ul>
     */
    public static final int
        ktxTexture1_c = 1,
        ktxTexture2_c = 2;

    /**
     * Enumerators identifying the supercompression scheme. ({@code ktxSupercmpScheme})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_SS_NONE SS_NONE} - No supercompression.</li>
     * <li>{@link #KTX_SS_BASIS_LZ SS_BASIS_LZ} - Basis LZ supercompression.</li>
     * <li>{@link #KTX_SS_ZSTD SS_ZSTD} - ZStd supercompression.</li>
     * <li>{@link #KTX_SS_ZLIB SS_ZLIB} - ZLIB supercompression.</li>
     * <li>{@link #KTX_SS_BEGIN_RANGE SS_BEGIN_RANGE}</li>
     * <li>{@link #KTX_SS_END_RANGE SS_END_RANGE}</li>
     * <li>{@link #KTX_SS_BEGIN_VENDOR_RANGE SS_BEGIN_VENDOR_RANGE}</li>
     * <li>{@link #KTX_SS_END_VENDOR_RANGE SS_END_VENDOR_RANGE}</li>
     * <li>{@link #KTX_SS_BEGIN_RESERVED SS_BEGIN_RESERVED}</li>
     * </ul>
     */
    public static final int
        KTX_SS_NONE               = 0,
        KTX_SS_BASIS_LZ           = 1,
        KTX_SS_ZSTD               = 2,
        KTX_SS_ZLIB               = 3,
        KTX_SS_BEGIN_RANGE        = KTX_SS_NONE,
        KTX_SS_END_RANGE          = KTX_SS_ZLIB,
        KTX_SS_BEGIN_VENDOR_RANGE = 0x10000,
        KTX_SS_END_VENDOR_RANGE   = 0x1ffff,
        KTX_SS_BEGIN_RESERVED     = 0x20000;

    /**
     * Enum for requesting, or not, allocation of storage for images. ({@code ktxTextureCreateStorageEnum})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_TEXTURE_CREATE_NO_STORAGE TEXTURE_CREATE_NO_STORAGE} - Don't allocate any image storage.</li>
     * <li>{@link #KTX_TEXTURE_CREATE_ALLOC_STORAGE TEXTURE_CREATE_ALLOC_STORAGE} - Allocate image storage.</li>
     * </ul>
     */
    public static final int
        KTX_TEXTURE_CREATE_NO_STORAGE    = 0,
        KTX_TEXTURE_CREATE_ALLOC_STORAGE = 1;

    /**
     * Flags for requesting services during creation. ({@code enum ktxTextureCreateFlagBits})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_TEXTURE_CREATE_NO_FLAGS TEXTURE_CREATE_NO_FLAGS}</li>
     * <li>{@link #KTX_TEXTURE_CREATE_LOAD_IMAGE_DATA_BIT TEXTURE_CREATE_LOAD_IMAGE_DATA_BIT} - Load the images from the KTX source.</li>
     * <li>{@link #KTX_TEXTURE_CREATE_RAW_KVDATA_BIT TEXTURE_CREATE_RAW_KVDATA_BIT} - Load the raw key-value data instead of creating a {@code ktxHashList} from it.</li>
     * <li>{@link #KTX_TEXTURE_CREATE_SKIP_KVDATA_BIT TEXTURE_CREATE_SKIP_KVDATA_BIT} - Skip any key-value data. This overrides the {@code RAW_KVDATA_BIT}.</li>
     * <li>{@link #KTX_TEXTURE_CREATE_CHECK_GLTF_BASISU_BIT TEXTURE_CREATE_CHECK_GLTF_BASISU_BIT} - Load texture compatible with the rules of KHR_texture_basisu glTF extension.</li>
     * </ul>
     */
    public static final int
        KTX_TEXTURE_CREATE_NO_FLAGS              = 0x00,
        KTX_TEXTURE_CREATE_LOAD_IMAGE_DATA_BIT   = 0x01,
        KTX_TEXTURE_CREATE_RAW_KVDATA_BIT        = 0x02,
        KTX_TEXTURE_CREATE_SKIP_KVDATA_BIT       = 0x04,
        KTX_TEXTURE_CREATE_CHECK_GLTF_BASISU_BIT = 0x08;

    /**
     * {@code enum streamType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #eStreamTypeFile eStreamTypeFile}</li>
     * <li>{@link #eStreamTypeMemory eStreamTypeMemory}</li>
     * <li>{@link #eStreamTypeCustom eStreamTypeCustom}</li>
     * </ul>
     */
    public static final int
        eStreamTypeFile   = 1,
        eStreamTypeMemory = 2,
        eStreamTypeCustom = 3;

    /**
     * Flags specifiying UASTC encoding options. ({@code ktx_pack_uastc_flag_bits_e})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_PACK_UASTC_LEVEL_FASTEST PACK_UASTC_LEVEL_FASTEST} - Fastest compression. 43.45dB.</li>
     * <li>{@link #KTX_PACK_UASTC_LEVEL_FASTER PACK_UASTC_LEVEL_FASTER} - Faster compression. 46.49dB.</li>
     * <li>{@link #KTX_PACK_UASTC_LEVEL_DEFAULT PACK_UASTC_LEVEL_DEFAULT} - Default compression. 47.47dB.</li>
     * <li>{@link #KTX_PACK_UASTC_LEVEL_SLOWER PACK_UASTC_LEVEL_SLOWER} - Slower compression. 48.01dB.</li>
     * <li>{@link #KTX_PACK_UASTC_LEVEL_VERYSLOW PACK_UASTC_LEVEL_VERYSLOW} - Very slow compression. 48.24dB.</li>
     * <li>{@link #KTX_PACK_UASTC_MAX_LEVEL PACK_UASTC_MAX_LEVEL} - Maximum supported quality level.</li>
     * <li>{@link #KTX_PACK_UASTC_LEVEL_MASK PACK_UASTC_LEVEL_MASK} - Mask to extract the level from the other bits.</li>
     * <li>{@link #KTX_PACK_UASTC_FAVOR_UASTC_ERROR PACK_UASTC_FAVOR_UASTC_ERROR} - Optimize for lowest UASTC error.</li>
     * <li>{@link #KTX_PACK_UASTC_FAVOR_BC7_ERROR PACK_UASTC_FAVOR_BC7_ERROR} - Optimize for lowest BC7 error.</li>
     * <li>{@link #KTX_PACK_UASTC_ETC1_FASTER_HINTS PACK_UASTC_ETC1_FASTER_HINTS} - Optimize for faster transcoding to ETC1.</li>
     * <li>{@link #KTX_PACK_UASTC_ETC1_FASTEST_HINTS PACK_UASTC_ETC1_FASTEST_HINTS} - Optimize for fastest transcoding to ETC1.</li>
     * <li>{@link #KTX_PACK_UASTC__ETC1_DISABLE_FLIP_AND_INDIVIDUAL PACK_UASTC__ETC1_DISABLE_FLIP_AND_INDIVIDUAL} - Not documented in BasisU code.</li>
     * </ul>
     */
    public static final int
        KTX_PACK_UASTC_LEVEL_FASTEST                     = 0,
        KTX_PACK_UASTC_LEVEL_FASTER                      = 1,
        KTX_PACK_UASTC_LEVEL_DEFAULT                     = 2,
        KTX_PACK_UASTC_LEVEL_SLOWER                      = 3,
        KTX_PACK_UASTC_LEVEL_VERYSLOW                    = 4,
        KTX_PACK_UASTC_MAX_LEVEL                         = KTX_PACK_UASTC_LEVEL_VERYSLOW,
        KTX_PACK_UASTC_LEVEL_MASK                        = 0xF,
        KTX_PACK_UASTC_FAVOR_UASTC_ERROR                 = 8,
        KTX_PACK_UASTC_FAVOR_BC7_ERROR                   = 16,
        KTX_PACK_UASTC_ETC1_FASTER_HINTS                 = 64,
        KTX_PACK_UASTC_ETC1_FASTEST_HINTS                = 128,
        KTX_PACK_UASTC__ETC1_DISABLE_FLIP_AND_INDIVIDUAL = 256;

    /**
     * Options specifiying ASTC encoding quality levels. ({@code ktx_pack_astc_quality_levels_e})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_PACK_ASTC_QUALITY_LEVEL_FASTEST PACK_ASTC_QUALITY_LEVEL_FASTEST} - Fastest compression.</li>
     * <li>{@link #KTX_PACK_ASTC_QUALITY_LEVEL_FAST PACK_ASTC_QUALITY_LEVEL_FAST} - Fast compression.</li>
     * <li>{@link #KTX_PACK_ASTC_QUALITY_LEVEL_MEDIUM PACK_ASTC_QUALITY_LEVEL_MEDIUM} - Medium compression.</li>
     * <li>{@link #KTX_PACK_ASTC_QUALITY_LEVEL_THOROUGH PACK_ASTC_QUALITY_LEVEL_THOROUGH} - Slower compression.</li>
     * <li>{@link #KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE} - Very slow compression.</li>
     * <li>{@link #KTX_PACK_ASTC_QUALITY_LEVEL_MAX PACK_ASTC_QUALITY_LEVEL_MAX} - Maximum supported quality level.</li>
     * </ul>
     */
    public static final int
        KTX_PACK_ASTC_QUALITY_LEVEL_FASTEST    = 0,
        KTX_PACK_ASTC_QUALITY_LEVEL_FAST       = 10,
        KTX_PACK_ASTC_QUALITY_LEVEL_MEDIUM     = 60,
        KTX_PACK_ASTC_QUALITY_LEVEL_THOROUGH   = 98,
        KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE = 100,
        KTX_PACK_ASTC_QUALITY_LEVEL_MAX        = KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE;

    /**
     * Options specifiying ASTC encoding block dimensions. ({@code ktx_pack_astc_block_dimension_e})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_4x4 PACK_ASTC_BLOCK_DIMENSION_4x4} - 8.00 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_5x4 PACK_ASTC_BLOCK_DIMENSION_5x4} - 6.40 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_5x5 PACK_ASTC_BLOCK_DIMENSION_5x5} - 5.12 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_6x5 PACK_ASTC_BLOCK_DIMENSION_6x5} - 4.27 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_6x6 PACK_ASTC_BLOCK_DIMENSION_6x6} - 3.56 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_8x5 PACK_ASTC_BLOCK_DIMENSION_8x5} - 3.20 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_8x6 PACK_ASTC_BLOCK_DIMENSION_8x6} - 2.67 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_10x5 PACK_ASTC_BLOCK_DIMENSION_10x5} - 2.56 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_10x6 PACK_ASTC_BLOCK_DIMENSION_10x6} - 2.13 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_8x8 PACK_ASTC_BLOCK_DIMENSION_8x8} - 2.00 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_10x8 PACK_ASTC_BLOCK_DIMENSION_10x8} - 1.60 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_10x10 PACK_ASTC_BLOCK_DIMENSION_10x10} - 1.28 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_12x10 PACK_ASTC_BLOCK_DIMENSION_12x10} - 1.07 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_12x12 PACK_ASTC_BLOCK_DIMENSION_12x12} - 0.89 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_3x3x3 PACK_ASTC_BLOCK_DIMENSION_3x3x3} - 4.74 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_4x3x3 PACK_ASTC_BLOCK_DIMENSION_4x3x3} - 3.56 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_4x4x3 PACK_ASTC_BLOCK_DIMENSION_4x4x3} - 2.67 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_4x4x4 PACK_ASTC_BLOCK_DIMENSION_4x4x4} - 2.00 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_5x4x4 PACK_ASTC_BLOCK_DIMENSION_5x4x4} - 1.60 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_5x5x4 PACK_ASTC_BLOCK_DIMENSION_5x5x4} - 1.28 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_5x5x5 PACK_ASTC_BLOCK_DIMENSION_5x5x5} - 1.02 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_6x5x5 PACK_ASTC_BLOCK_DIMENSION_6x5x5} - 0.85 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x5 PACK_ASTC_BLOCK_DIMENSION_6x6x5} - 0.71 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x6 PACK_ASTC_BLOCK_DIMENSION_6x6x6} - 0.59 bpp</li>
     * <li>{@link #KTX_PACK_ASTC_BLOCK_DIMENSION_MAX PACK_ASTC_BLOCK_DIMENSION_MAX} - Maximum supported blocks.</li>
     * </ul>
     */
    public static final int
        KTX_PACK_ASTC_BLOCK_DIMENSION_4x4   = 0,
        KTX_PACK_ASTC_BLOCK_DIMENSION_5x4   = 1,
        KTX_PACK_ASTC_BLOCK_DIMENSION_5x5   = 2,
        KTX_PACK_ASTC_BLOCK_DIMENSION_6x5   = 3,
        KTX_PACK_ASTC_BLOCK_DIMENSION_6x6   = 4,
        KTX_PACK_ASTC_BLOCK_DIMENSION_8x5   = 5,
        KTX_PACK_ASTC_BLOCK_DIMENSION_8x6   = 6,
        KTX_PACK_ASTC_BLOCK_DIMENSION_10x5  = 7,
        KTX_PACK_ASTC_BLOCK_DIMENSION_10x6  = 8,
        KTX_PACK_ASTC_BLOCK_DIMENSION_8x8   = 9,
        KTX_PACK_ASTC_BLOCK_DIMENSION_10x8  = 10,
        KTX_PACK_ASTC_BLOCK_DIMENSION_10x10 = 11,
        KTX_PACK_ASTC_BLOCK_DIMENSION_12x10 = 12,
        KTX_PACK_ASTC_BLOCK_DIMENSION_12x12 = 13,
        KTX_PACK_ASTC_BLOCK_DIMENSION_3x3x3 = 14,
        KTX_PACK_ASTC_BLOCK_DIMENSION_4x3x3 = 15,
        KTX_PACK_ASTC_BLOCK_DIMENSION_4x4x3 = 16,
        KTX_PACK_ASTC_BLOCK_DIMENSION_4x4x4 = 17,
        KTX_PACK_ASTC_BLOCK_DIMENSION_5x4x4 = 18,
        KTX_PACK_ASTC_BLOCK_DIMENSION_5x5x4 = 19,
        KTX_PACK_ASTC_BLOCK_DIMENSION_5x5x5 = 20,
        KTX_PACK_ASTC_BLOCK_DIMENSION_6x5x5 = 21,
        KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x5 = 22,
        KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x6 = 23,
        KTX_PACK_ASTC_BLOCK_DIMENSION_MAX   = KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x6;

    /**
     * Options specifying ASTC encoder profile mode. ({@code ktx_pack_astc_encoder_mode_e})
     * 
     * <p>This and function is used later to derive the profile.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_PACK_ASTC_ENCODER_MODE_DEFAULT PACK_ASTC_ENCODER_MODE_DEFAULT}</li>
     * <li>{@link #KTX_PACK_ASTC_ENCODER_MODE_LDR PACK_ASTC_ENCODER_MODE_LDR}</li>
     * <li>{@link #KTX_PACK_ASTC_ENCODER_MODE_HDR PACK_ASTC_ENCODER_MODE_HDR}</li>
     * <li>{@link #KTX_PACK_ASTC_ENCODER_MODE_MAX PACK_ASTC_ENCODER_MODE_MAX}</li>
     * </ul>
     */
    public static final int
        KTX_PACK_ASTC_ENCODER_MODE_DEFAULT = 0,
        KTX_PACK_ASTC_ENCODER_MODE_LDR     = 1,
        KTX_PACK_ASTC_ENCODER_MODE_HDR     = 2,
        KTX_PACK_ASTC_ENCODER_MODE_MAX     = KTX_PACK_ASTC_ENCODER_MODE_HDR;

    /**
     * Enumerators for specifying the transcode target format. ({@code ktx_transcode_fmt_e})
     * 
     * <p>For BasisU/ETC1S format, {@code Opaque} and {@code alpha} here refer to 2 separate RGB images, a.k.a slices within the BasisU compressed data. For
     * UASTC format they refer to the RGB and the alpha components of the UASTC data. If the original image had only 2 components, R will be in the opaque
     * portion and G in the alpha portion. The R value will be replicated in the RGB components. In the case of BasisU the G value will be replicated in all 3
     * components of the alpha slice. If the original image had only 1 component it's value is replicated in all 3 components of the opaque portion and there
     * is no alpha.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>You should not transcode sRGB encoded data to {@code KTX_TTF_BC4_R}, {@code KTX_TTF_BC5_RG}, {@code KTX_TTF_ETC2_EAC_R[G]11}, {@code
     * KTX_TTF_RGB565}, {@code KTX_TTF_BGR565} or {@code KTX_TTF_RGBA4444} formats as neither OpenGL nor Vulkan support sRGB variants of these. Doing sRGB
     * decoding in the shader will not produce correct results if any texture filtering is being used.</p></div>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_TTF_ETC1_RGB TTF_ETC1_RGB} - ETC1-2</li>
     * <li>{@link #KTX_TTF_ETC2_RGBA TTF_ETC2_RGBA}</li>
     * <li>{@link #KTX_TTF_BC1_RGB TTF_BC1_RGB} - BC1-5, BC7 (desktop, some mobile devices)</li>
     * <li>{@link #KTX_TTF_BC3_RGBA TTF_BC3_RGBA}</li>
     * <li>{@link #KTX_TTF_BC4_R TTF_BC4_R}</li>
     * <li>{@link #KTX_TTF_BC5_RG TTF_BC5_RG}</li>
     * <li>{@link #KTX_TTF_BC7_RGBA TTF_BC7_RGBA}</li>
     * <li>{@link #KTX_TTF_PVRTC1_4_RGB TTF_PVRTC1_4_RGB} - PVRTC1 4bpp (mobile, PowerVR devices)</li>
     * <li>{@link #KTX_TTF_PVRTC1_4_RGBA TTF_PVRTC1_4_RGBA}</li>
     * <li>{@link #KTX_TTF_ASTC_4x4_RGBA TTF_ASTC_4x4_RGBA} - ASTC (mobile, Intel devices, hopefully all desktop GPU's one day)</li>
     * <li>{@link #KTX_TTF_PVRTC2_4_RGB TTF_PVRTC2_4_RGB} - ATC and FXT1 formats are not supported by KTX2 as there are no equivalent VkFormats.</li>
     * <li>{@link #KTX_TTF_PVRTC2_4_RGBA TTF_PVRTC2_4_RGBA}</li>
     * <li>{@link #KTX_TTF_ETC2_EAC_R11 TTF_ETC2_EAC_R11}</li>
     * <li>{@link #KTX_TTF_ETC2_EAC_RG11 TTF_ETC2_EAC_RG11}</li>
     * <li>{@link #KTX_TTF_RGBA32 TTF_RGBA32} - Uncompressed (raw pixel) formats</li>
     * <li>{@link #KTX_TTF_RGB565 TTF_RGB565}</li>
     * <li>{@link #KTX_TTF_BGR565 TTF_BGR565}</li>
     * <li>{@link #KTX_TTF_RGBA4444 TTF_RGBA4444}</li>
     * <li>{@link #KTX_TTF_ETC TTF_ETC} - Values for automatic selection of RGB or RGBA depending if alpha present.</li>
     * <li>{@link #KTX_TTF_BC1_OR_3 TTF_BC1_OR_3}</li>
     * <li>{@link #KTX_TTF_NOSELECTION TTF_NOSELECTION}</li>
     * </ul>
     */
    public static final int
        KTX_TTF_ETC1_RGB      = 0,
        KTX_TTF_ETC2_RGBA     = 1,
        KTX_TTF_BC1_RGB       = 2,
        KTX_TTF_BC3_RGBA      = 3,
        KTX_TTF_BC4_R         = 4,
        KTX_TTF_BC5_RG        = 5,
        KTX_TTF_BC7_RGBA      = 6,
        KTX_TTF_PVRTC1_4_RGB  = 8,
        KTX_TTF_PVRTC1_4_RGBA = 9,
        KTX_TTF_ASTC_4x4_RGBA = 10,
        KTX_TTF_PVRTC2_4_RGB  = 18,
        KTX_TTF_PVRTC2_4_RGBA = 19,
        KTX_TTF_ETC2_EAC_R11  = 20,
        KTX_TTF_ETC2_EAC_RG11 = 21,
        KTX_TTF_RGBA32        = 13,
        KTX_TTF_RGB565        = 14,
        KTX_TTF_BGR565        = 15,
        KTX_TTF_RGBA4444      = 16,
        KTX_TTF_ETC           = 22,
        KTX_TTF_BC1_OR_3      = 23,
        KTX_TTF_NOSELECTION   = 0x7FFFFFFF;

    /**
     * Flags guiding transcoding of Basis Universal compressed textures. ({@code ktx_transcode_flag_bits_e})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #KTX_TF_PVRTC_DECODE_TO_NEXT_POW2 TF_PVRTC_DECODE_TO_NEXT_POW2} - 
     * PVRTC1: decode non-pow2 ETC1S texture level to the next larger power of 2 (not implemented yet, but we're going to support it).
     * 
     * <p>Ignored if the slice's dimensions are already a power of 2.</p>
     * </li>
     * <li>{@link #KTX_TF_TRANSCODE_ALPHA_DATA_TO_OPAQUE_FORMATS TF_TRANSCODE_ALPHA_DATA_TO_OPAQUE_FORMATS} - 
     * When decoding to an opaque texture format, if the Basis data has alpha, decode the alpha slice instead of the color slice to the output texture
     * format.
     * 
     * <p>Has no effect if there is no alpha data.</p>
     * </li>
     * <li>{@link #KTX_TF_HIGH_QUALITY TF_HIGH_QUALITY} - 
     * Request higher quality transcode of UASTC to BC1, BC3, ETC2_EAC_R11 and ETC2_EAC_RG11.
     * 
     * <p>The flag is unused by other UASTC transcoders.</p>
     * </li>
     * </ul>
     */
    public static final int
        KTX_TF_PVRTC_DECODE_TO_NEXT_POW2              = 2,
        KTX_TF_TRANSCODE_ALPHA_DATA_TO_OPAQUE_FORMATS = 4,
        KTX_TF_HIGH_QUALITY                           = 32;

    protected KTX() {
        throw new UnsupportedOperationException();
    }

    // --- [ ktxTexture_CreateFromNamedFile ] ---

    public static int nktxTexture_CreateFromNamedFile(long filename, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture_CreateFromNamedFile;
        return callPPI(filename, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            checkNT1(filename);
            check(newTex, 1);
        }
        return nktxTexture_CreateFromNamedFile(memAddress(filename), createFlags, memAddress(newTex));
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromNamedFile(@NativeType("char const * const") CharSequence filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nktxTexture_CreateFromNamedFile(filenameEncoded, createFlags, memAddress(newTex));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxTexture_CreateFromMemory ] ---

    public static int nktxTexture_CreateFromMemory(long bytes, long size, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture_CreateFromMemory;
        return callPPPI(bytes, size, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture_CreateFromMemory(memAddress(bytes), bytes.remaining(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture_CreateFromStream ] ---

    public static int nktxTexture_CreateFromStream(long stream, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture_CreateFromStream;
        return callPPI(stream, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture_CreateFromStream(stream.address(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture_GetData ] ---

    /** Unsafe version of: {@link #ktxTexture_GetData Texture_GetData} */
    public static long nktxTexture_GetData(long This) {
        long __functionAddress = Functions.Texture_GetData;
        return callPP(This, __functionAddress);
    }

    /** Returns a pointer to the image data of a {@code ktxTexture} object. */
    @Nullable
    @NativeType("ktx_uint8_t *")
    public static ByteBuffer ktxTexture_GetData(@NativeType("ktxTexture *") ktxTexture This) {
        long __result = nktxTexture_GetData(This.address());
        return memByteBufferSafe(__result, (int)ktxTexture_GetDataSize(This));
    }

    /** Returns a pointer to the image data of a {@code ktxTexture} object. */
    @Nullable
    @NativeType("ktx_uint8_t *")
    public static ByteBuffer ktxTexture_GetData(@NativeType("ktxTexture *") ktxTexture This, long length) {
        long __result = nktxTexture_GetData(This.address());
        return memByteBufferSafe(__result, (int)length);
    }

    // --- [ ktxTexture_GetRowPitch ] ---

    /** Unsafe version of: {@link #ktxTexture_GetRowPitch Texture_GetRowPitch} */
    public static int nktxTexture_GetRowPitch(long This, int level) {
        long __functionAddress = Functions.Texture_GetRowPitch;
        return callPI(This, level, __functionAddress);
    }

    /** Returns the pitch of a row of an image at the specified level. Similar to the {@code rowPitch} in a {@code VkSubResourceLayout}. */
    @NativeType("ktx_uint32_t")
    public static int ktxTexture_GetRowPitch(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint32_t") int level) {
        return nktxTexture_GetRowPitch(This.address(), level);
    }

    // --- [ ktxTexture_GetElementSize ] ---

    /** Unsafe version of: {@link #ktxTexture_GetElementSize Texture_GetElementSize} */
    public static int nktxTexture_GetElementSize(long This) {
        long __functionAddress = Functions.Texture_GetElementSize;
        return callPI(This, __functionAddress);
    }

    /** Return the element size of the texture's images. */
    @NativeType("ktx_uint32_t")
    public static int ktxTexture_GetElementSize(@NativeType("ktxTexture *") ktxTexture This) {
        return nktxTexture_GetElementSize(This.address());
    }

    // --- [ ktxTexture_GetDataSize ] ---

    /** Unsafe version of: {@link #ktxTexture_GetDataSize Texture_GetDataSize} */
    public static long nktxTexture_GetDataSize(long This) {
        long __functionAddress = Functions.Texture_GetDataSize;
        return callPP(This, __functionAddress);
    }

    /** Returns the size of all the image data of a {@code ktxTexture} object in bytes. */
    @NativeType("ktx_size_t")
    public static long ktxTexture_GetDataSize(@NativeType("ktxTexture *") ktxTexture This) {
        return nktxTexture_GetDataSize(This.address());
    }

    // --- [ ktxTexture_GLUpload ] ---

    /** Unsafe version of: {@link #ktxTexture_GLUpload Texture_GLUpload} */
    public static int nktxTexture_GLUpload(long This, long pTexture, long pTarget, long pGlerror) {
        long __functionAddress = Functions.Texture_GLUpload;
        return callPPPPI(This, pTexture, pTarget, pGlerror, __functionAddress);
    }

    /** Uploads a texture to OpenGL. */
    @NativeType("KTX_error_code")
    public static int ktxTexture_GLUpload(@NativeType("ktxTexture *") ktxTexture This, @NativeType("GLuint *") IntBuffer pTexture, @NativeType("GLenum *") IntBuffer pTarget, @NativeType("GLenum *") IntBuffer pGlerror) {
        if (CHECKS) {
            check(pTexture, 1);
            check(pTarget, 1);
            check(pGlerror, 1);
        }
        return nktxTexture_GLUpload(This.address(), memAddress(pTexture), memAddress(pTarget), memAddress(pGlerror));
    }

    // --- [ ktxTexture_IterateLevelFaces ] ---

    /** Unsafe version of: {@link #ktxTexture_IterateLevelFaces Texture_IterateLevelFaces} */
    public static int nktxTexture_IterateLevelFaces(long This, long iterCb, long userdata) {
        long __functionAddress = Functions.Texture_IterateLevelFaces;
        return callPPPI(This, iterCb, userdata, __functionAddress);
    }

    /** Iterate over the levels or faces in a {@code ktxTexture} object. */
    @NativeType("KTX_error_code")
    public static int ktxTexture_IterateLevelFaces(@NativeType("ktxTexture *") ktxTexture This, @NativeType("PFNKTXITERCB") PFNKTXITERCBI iterCb, @NativeType("void *") long userdata) {
        return nktxTexture_IterateLevelFaces(This.address(), iterCb.address(), userdata);
    }

    // --- [ ktxTexture1_Create ] ---

    /** Unsafe version of: {@link #ktxTexture1_Create Texture1_Create} */
    public static int nktxTexture1_Create(long createInfo, int storageAllocation, long newTex) {
        long __functionAddress = Functions.Texture1_Create;
        return callPPI(createInfo, storageAllocation, newTex, __functionAddress);
    }

    /** Create a new {@code ktxTexture1}. */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_Create(@NativeType("ktxTextureCreateInfo *") ktxTextureCreateInfo createInfo, @NativeType("ktxTextureCreateStorageEnum") int storageAllocation, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture1_Create(createInfo.address(), storageAllocation, memAddress(newTex));
    }

    // --- [ ktxTexture1_CreateFromNamedFile ] ---

    public static int nktxTexture1_CreateFromNamedFile(long filename, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture1_CreateFromNamedFile;
        return callPPI(filename, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            checkNT1(filename);
            check(newTex, 1);
        }
        return nktxTexture1_CreateFromNamedFile(memAddress(filename), createFlags, memAddress(newTex));
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromNamedFile(@NativeType("char const * const") CharSequence filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nktxTexture1_CreateFromNamedFile(filenameEncoded, createFlags, memAddress(newTex));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxTexture1_CreateFromMemory ] ---

    public static int nktxTexture1_CreateFromMemory(long bytes, long size, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture1_CreateFromMemory;
        return callPPPI(bytes, size, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture1_CreateFromMemory(memAddress(bytes), bytes.remaining(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture1_CreateFromStream ] ---

    public static int nktxTexture1_CreateFromStream(long stream, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture1_CreateFromStream;
        return callPPI(stream, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture1_CreateFromStream(stream.address(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture1_NeedsTranscoding ] ---

    public static boolean nktxTexture1_NeedsTranscoding(long This) {
        long __functionAddress = Functions.Texture1_NeedsTranscoding;
        return callPZ(This, __functionAddress);
    }

    @NativeType("ktx_bool_t")
    public static boolean ktxTexture1_NeedsTranscoding(@NativeType("ktxTexture1 *") ktxTexture1 This) {
        return nktxTexture1_NeedsTranscoding(This.address());
    }

    // --- [ ktxTexture1_WriteKTX2ToNamedFile ] ---

    /** Unsafe version of: {@link #ktxTexture1_WriteKTX2ToNamedFile Texture1_WriteKTX2ToNamedFile} */
    public static int nktxTexture1_WriteKTX2ToNamedFile(long This, long dstname) {
        long __functionAddress = Functions.Texture1_WriteKTX2ToNamedFile;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, dstname, __functionAddress);
    }

    /** Write a {@code ktxTexture} object to a named file in KTX format. */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToNamedFile(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("char const * const") ByteBuffer dstname) {
        if (CHECKS) {
            checkNT1(dstname);
        }
        return nktxTexture1_WriteKTX2ToNamedFile(This.address(), memAddress(dstname));
    }

    /** Write a {@code ktxTexture} object to a named file in KTX format. */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToNamedFile(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("char const * const") CharSequence dstname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(dstname, true);
            long dstnameEncoded = stack.getPointerAddress();
            return nktxTexture1_WriteKTX2ToNamedFile(This.address(), dstnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxTexture1_WriteKTX2ToMemory ] ---

    /** Unsafe version of: {@link #ktxTexture1_WriteKTX2ToMemory Texture1_WriteKTX2ToMemory} */
    public static int nktxTexture1_WriteKTX2ToMemory(long This, long bytes, long size) {
        long __functionAddress = Functions.Texture1_WriteKTX2ToMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(This, bytes, size, __functionAddress);
    }

    /** Write a {@code ktxTexture} object to a block of memory in KTX format. */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToMemory(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("ktx_uint8_t **") PointerBuffer bytes, @NativeType("ktx_size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(bytes, 1);
            check(size, 1);
        }
        return nktxTexture1_WriteKTX2ToMemory(This.address(), memAddress(bytes), memAddress(size));
    }

    // --- [ ktxTexture1_WriteKTX2ToStream ] ---

    /** Unsafe version of: {@link #ktxTexture1_WriteKTX2ToStream Texture1_WriteKTX2ToStream} */
    public static int nktxTexture1_WriteKTX2ToStream(long This, long dststr) {
        long __functionAddress = Functions.Texture1_WriteKTX2ToStream;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, dststr, __functionAddress);
    }

    /** Write a {@code ktxTexture object} to a {@code ktxStream} in KTX format. */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToStream(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("struct ktxStream *") ktxStream dststr) {
        return nktxTexture1_WriteKTX2ToStream(This.address(), dststr.address());
    }

    // --- [ ktxTexture2_Create ] ---

    /** Unsafe version of: {@link #ktxTexture2_Create Texture2_Create} */
    public static int nktxTexture2_Create(long createInfo, int storageAllocation, long newTex) {
        long __functionAddress = Functions.Texture2_Create;
        return callPPI(createInfo, storageAllocation, newTex, __functionAddress);
    }

    /** Create a new {@code ktxTexture2}. */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_Create(@NativeType("ktxTextureCreateInfo *") ktxTextureCreateInfo createInfo, @NativeType("ktxTextureCreateStorageEnum") int storageAllocation, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_Create(createInfo.address(), storageAllocation, memAddress(newTex));
    }

    // --- [ ktxTexture2_CreateCopy ] ---

    /** Unsafe version of: {@link #ktxTexture2_CreateCopy Texture2_CreateCopy} */
    public static int nktxTexture2_CreateCopy(long orig, long newTex) {
        long __functionAddress = Functions.Texture2_CreateCopy;
        return callPPI(orig, newTex, __functionAddress);
    }

    /** Create a new {@code ktxTexture2} as a copy of an existing texture. */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateCopy(@NativeType("ktxTexture2 *") ktxTexture2 orig, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_CreateCopy(orig.address(), memAddress(newTex));
    }

    // --- [ ktxTexture2_CreateFromNamedFile ] ---

    public static int nktxTexture2_CreateFromNamedFile(long filename, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture2_CreateFromNamedFile;
        return callPPI(filename, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            checkNT1(filename);
            check(newTex, 1);
        }
        return nktxTexture2_CreateFromNamedFile(memAddress(filename), createFlags, memAddress(newTex));
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromNamedFile(@NativeType("char const * const") CharSequence filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nktxTexture2_CreateFromNamedFile(filenameEncoded, createFlags, memAddress(newTex));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxTexture2_CreateFromMemory ] ---

    public static int nktxTexture2_CreateFromMemory(long bytes, long size, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture2_CreateFromMemory;
        return callPPPI(bytes, size, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_CreateFromMemory(memAddress(bytes), bytes.remaining(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture2_CreateFromStream ] ---

    public static int nktxTexture2_CreateFromStream(long stream, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture2_CreateFromStream;
        return callPPI(stream, createFlags, newTex, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_CreateFromStream(stream.address(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture2_CompressBasis ] ---

    public static int nktxTexture2_CompressBasis(long This, int quality) {
        long __functionAddress = Functions.Texture2_CompressBasis;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(This, quality, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressBasis(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int quality) {
        return nktxTexture2_CompressBasis(This.address(), quality);
    }

    // --- [ ktxTexture2_DeflateZstd ] ---

    public static int nktxTexture2_DeflateZstd(long This, int level) {
        long __functionAddress = Functions.Texture2_DeflateZstd;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(This, level, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_DeflateZstd(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int level) {
        return nktxTexture2_DeflateZstd(This.address(), level);
    }

    // --- [ ktxTexture2_DeflateZLIB ] ---

    public static int nktxTexture2_DeflateZLIB(long This, int level) {
        long __functionAddress = Functions.Texture2_DeflateZLIB;
        return callPI(This, level, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_DeflateZLIB(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int level) {
        return nktxTexture2_DeflateZLIB(This.address(), level);
    }

    // --- [ ktxTexture2_GetComponentInfo ] ---

    public static void nktxTexture2_GetComponentInfo(long This, long numComponents, long componentByteLength) {
        long __functionAddress = Functions.Texture2_GetComponentInfo;
        callPPPV(This, numComponents, componentByteLength, __functionAddress);
    }

    public static void ktxTexture2_GetComponentInfo(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t *") IntBuffer numComponents, @NativeType("ktx_uint32_t *") IntBuffer componentByteLength) {
        if (CHECKS) {
            check(numComponents, 1);
            check(componentByteLength, 1);
        }
        nktxTexture2_GetComponentInfo(This.address(), memAddress(numComponents), memAddress(componentByteLength));
    }

    // --- [ ktxTexture2_GetNumComponents ] ---

    public static int nktxTexture2_GetNumComponents(long This) {
        long __functionAddress = Functions.Texture2_GetNumComponents;
        return callPI(This, __functionAddress);
    }

    @NativeType("ktx_uint32_t")
    public static int ktxTexture2_GetNumComponents(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetNumComponents(This.address());
    }

    // --- [ ktxTexture2_GetOETF_e ] ---

    public static int nktxTexture2_GetOETF_e(long This) {
        long __functionAddress = Functions.Texture2_GetOETF_e;
        return callPI(This, __functionAddress);
    }

    @NativeType("khr_df_transfer_e")
    public static int ktxTexture2_GetOETF_e(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetOETF_e(This.address());
    }

    // --- [ ktxTexture2_GetOETF ] ---

    public static int nktxTexture2_GetOETF(long This) {
        long __functionAddress = Functions.Texture2_GetOETF;
        return callPI(This, __functionAddress);
    }

    @NativeType("ktx_uint32_t")
    public static int ktxTexture2_GetOETF(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetOETF(This.address());
    }

    // --- [ ktxTexture2_GetColorModel_e ] ---

    public static int nktxTexture2_GetColorModel_e(long This) {
        long __functionAddress = Functions.Texture2_GetColorModel_e;
        return callPI(This, __functionAddress);
    }

    @NativeType("khr_df_model_e")
    public static int ktxTexture2_GetColorModel_e(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetColorModel_e(This.address());
    }

    // --- [ ktxTexture2_GetPremultipliedAlpha ] ---

    public static boolean nktxTexture2_GetPremultipliedAlpha(long This) {
        long __functionAddress = Functions.Texture2_GetPremultipliedAlpha;
        return callPZ(This, __functionAddress);
    }

    @NativeType("ktx_bool_t")
    public static boolean ktxTexture2_GetPremultipliedAlpha(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetPremultipliedAlpha(This.address());
    }

    // --- [ ktxTexture2_NeedsTranscoding ] ---

    public static boolean nktxTexture2_NeedsTranscoding(long This) {
        long __functionAddress = Functions.Texture2_NeedsTranscoding;
        return callPZ(This, __functionAddress);
    }

    @NativeType("ktx_bool_t")
    public static boolean ktxTexture2_NeedsTranscoding(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_NeedsTranscoding(This.address());
    }

    // --- [ ktxTexture2_CompressAstcEx ] ---

    public static int nktxTexture2_CompressAstcEx(long This, long params) {
        long __functionAddress = Functions.Texture2_CompressAstcEx;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, params, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressAstcEx(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxAstcParams *") ktxAstcParams params) {
        return nktxTexture2_CompressAstcEx(This.address(), params.address());
    }

    // --- [ ktxTexture2_CompressAstc ] ---

    public static int nktxTexture2_CompressAstc(long This, int quality) {
        long __functionAddress = Functions.Texture2_CompressAstc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(This, quality, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressAstc(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int quality) {
        return nktxTexture2_CompressAstc(This.address(), quality);
    }

    // --- [ ktxTexture2_CompressBasisEx ] ---

    public static int nktxTexture2_CompressBasisEx(long This, long params) {
        long __functionAddress = Functions.Texture2_CompressBasisEx;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, params, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressBasisEx(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxBasisParams *") ktxBasisParams params) {
        return nktxTexture2_CompressBasisEx(This.address(), params.address());
    }

    // --- [ ktxTexture2_TranscodeBasis ] ---

    public static int nktxTexture2_TranscodeBasis(long This, int fmt, int transcodeFlags) {
        long __functionAddress = Functions.Texture2_TranscodeBasis;
        return callPI(This, fmt, transcodeFlags, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture2_TranscodeBasis(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_transcode_fmt_e") int fmt, @NativeType("ktx_transcode_flags") int transcodeFlags) {
        return nktxTexture2_TranscodeBasis(This.address(), fmt, transcodeFlags);
    }

    // --- [ ktxErrorString ] ---

    /** Unsafe version of: {@link #ktxErrorString ErrorString} */
    public static long nktxErrorString(int error) {
        long __functionAddress = Functions.ErrorString;
        return callP(error, __functionAddress);
    }

    /** Returns a string corresponding to a KTX error code. */
    @Nullable
    @NativeType("char const *")
    public static String ktxErrorString(@NativeType("KTX_error_code") int error) {
        long __result = nktxErrorString(error);
        return memASCIISafe(__result);
    }

    // --- [ ktxSupercompressionSchemeString ] ---

    /** Unsafe version of: {@link #ktxSupercompressionSchemeString SupercompressionSchemeString} */
    public static long nktxSupercompressionSchemeString(int scheme) {
        long __functionAddress = Functions.SupercompressionSchemeString;
        return callP(scheme, __functionAddress);
    }

    /** Returns a string corresponding to a supercompression scheme. */
    @Nullable
    @NativeType("char const *")
    public static String ktxSupercompressionSchemeString(@NativeType("ktxSupercmpScheme") int scheme) {
        long __result = nktxSupercompressionSchemeString(scheme);
        return memASCIISafe(__result);
    }

    // --- [ ktxTranscodeFormatString ] ---

    /** Unsafe version of: {@link #ktxTranscodeFormatString TranscodeFormatString} */
    public static long nktxTranscodeFormatString(int format) {
        long __functionAddress = Functions.TranscodeFormatString;
        return callP(format, __functionAddress);
    }

    /** Returns a string corresponding to a transcode target format. */
    @Nullable
    @NativeType("char const *")
    public static String ktxTranscodeFormatString(@NativeType("ktx_transcode_fmt_e") int format) {
        long __result = nktxTranscodeFormatString(format);
        return memASCIISafe(__result);
    }

    // --- [ ktxHashList_Create ] ---

    public static int nktxHashList_Create(long ppHl) {
        long __functionAddress = Functions.HashList_Create;
        return callPI(ppHl, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxHashList_Create(@NativeType("ktxHashList**") PointerBuffer ppHl) {
        if (CHECKS) {
            check(ppHl, 1);
        }
        return nktxHashList_Create(memAddress(ppHl));
    }

    // --- [ ktxHashList_CreateCopy ] ---

    public static int nktxHashList_CreateCopy(long ppHl, long orig) {
        long __functionAddress = Functions.HashList_CreateCopy;
        if (CHECKS) {
            check(orig);
        }
        return callPPI(ppHl, orig, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxHashList_CreateCopy(@NativeType("ktxHashList**") PointerBuffer ppHl, @NativeType("ktxHashList") long orig) {
        if (CHECKS) {
            check(ppHl, 1);
        }
        return nktxHashList_CreateCopy(memAddress(ppHl), orig);
    }

    // --- [ ktxHashList_Construct ] ---

    public static void ktxHashList_Construct(@NativeType("ktxHashList*") long pHl) {
        long __functionAddress = Functions.HashList_Construct;
        if (CHECKS) {
            check(pHl);
        }
        callPV(pHl, __functionAddress);
    }

    // --- [ ktxHashList_ConstructCopy ] ---

    public static void ktxHashList_ConstructCopy(@NativeType("ktxHashList*") long pHl, @NativeType("ktxHashList") long orig) {
        long __functionAddress = Functions.HashList_ConstructCopy;
        if (CHECKS) {
            check(pHl);
            check(orig);
        }
        callPPV(pHl, orig, __functionAddress);
    }

    // --- [ ktxHashList_Destroy ] ---

    public static void ktxHashList_Destroy(@NativeType("ktxHashList*") long head) {
        long __functionAddress = Functions.HashList_Destroy;
        if (CHECKS) {
            check(head);
        }
        callPV(head, __functionAddress);
    }

    // --- [ ktxHashList_Destruct ] ---

    public static void ktxHashList_Destruct(@NativeType("ktxHashList*") long head) {
        long __functionAddress = Functions.HashList_Destruct;
        if (CHECKS) {
            check(head);
        }
        callPV(head, __functionAddress);
    }

    // --- [ ktxHashList_AddKVPair ] ---

    /** Unsafe version of: {@link #ktxHashList_AddKVPair HashList_AddKVPair} */
    public static int nktxHashList_AddKVPair(long pHead, long key, int valueLen, long value) {
        long __functionAddress = Functions.HashList_AddKVPair;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPI(pHead, key, valueLen, value, __functionAddress);
    }

    /** Adds a key-value pair to a hash list. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_AddKVPair(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key, @NativeType("void const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(key);
        }
        return nktxHashList_AddKVPair(pHead, memAddress(key), value.remaining(), memAddress(value));
    }

    /** Adds a key-value pair to a hash list. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_AddKVPair(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") CharSequence key, @NativeType("void const *") ByteBuffer value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nktxHashList_AddKVPair(pHead, keyEncoded, value.remaining(), memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxHashList_DeleteEntry ] ---

    /** Deletes a {@code ktxHashListEntry} from a {@code ktxHashList}. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_DeleteEntry(@NativeType("ktxHashList*") long pHead, @NativeType("ktxHashListEntry *") long pEntry) {
        long __functionAddress = Functions.HashList_DeleteEntry;
        if (CHECKS) {
            check(pHead);
            check(pEntry);
        }
        return callPPI(pHead, pEntry, __functionAddress);
    }

    // --- [ ktxHashList_DeleteKVPair ] ---

    /** Unsafe version of: {@link #ktxHashList_DeleteKVPair HashList_DeleteKVPair} */
    public static int nktxHashList_DeleteKVPair(long pHead, long key) {
        long __functionAddress = Functions.HashList_DeleteKVPair;
        if (CHECKS) {
            check(pHead);
        }
        return callPPI(pHead, key, __functionAddress);
    }

    /** Finds the entry for a key in a {@code ktxHashList} and deletes it. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_DeleteKVPair(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key) {
        if (CHECKS) {
            checkNT1(key);
        }
        return nktxHashList_DeleteKVPair(pHead, memAddress(key));
    }

    /** Finds the entry for a key in a {@code ktxHashList} and deletes it. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_DeleteKVPair(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") CharSequence key) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nktxHashList_DeleteKVPair(pHead, keyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxHashList_FindEntry ] ---

    /** Unsafe version of: {@link #ktxHashList_FindEntry HashList_FindEntry} */
    public static int nktxHashList_FindEntry(long pHead, long key, long ppEntry) {
        long __functionAddress = Functions.HashList_FindEntry;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPI(pHead, key, ppEntry, __functionAddress);
    }

    /** Looks up a key and returns the {@code ktxHashListEntry}. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_FindEntry(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key, @NativeType("ktxHashListEntry **") PointerBuffer ppEntry) {
        if (CHECKS) {
            checkNT1(key);
            check(ppEntry, 1);
        }
        return nktxHashList_FindEntry(pHead, memAddress(key), memAddress(ppEntry));
    }

    /** Looks up a key and returns the {@code ktxHashListEntry}. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_FindEntry(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") CharSequence key, @NativeType("ktxHashListEntry **") PointerBuffer ppEntry) {
        if (CHECKS) {
            check(ppEntry, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nktxHashList_FindEntry(pHead, keyEncoded, memAddress(ppEntry));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxHashList_FindValue ] ---

    /** Unsafe version of: {@link #ktxHashList_FindValue HashList_FindValue} */
    public static int nktxHashList_FindValue(long pHead, long key, long pValueLen, long pValue) {
        long __functionAddress = Functions.HashList_FindValue;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPPI(pHead, key, pValueLen, pValue, __functionAddress);
    }

    /** Looks up a key and returns the value. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_FindValue(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key, @NativeType("unsigned int *") IntBuffer pValueLen, @NativeType("void **") PointerBuffer pValue) {
        if (CHECKS) {
            checkNT1(key);
            check(pValueLen, 1);
            check(pValue, 1);
        }
        return nktxHashList_FindValue(pHead, memAddress(key), memAddress(pValueLen), memAddress(pValue));
    }

    /** Looks up a key and returns the value. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_FindValue(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") CharSequence key, @NativeType("unsigned int *") IntBuffer pValueLen, @NativeType("void **") PointerBuffer pValue) {
        if (CHECKS) {
            check(pValueLen, 1);
            check(pValue, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nktxHashList_FindValue(pHead, keyEncoded, memAddress(pValueLen), memAddress(pValue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxHashList_Next ] ---

    /** Return the next entry in a {@code ktxHashList}. */
    @NativeType("ktxHashListEntry *")
    public static long ktxHashList_Next(@NativeType("ktxHashListEntry *") long entry) {
        long __functionAddress = Functions.HashList_Next;
        if (CHECKS) {
            check(entry);
        }
        return callPP(entry, __functionAddress);
    }

    // --- [ ktxHashList_Sort ] ---

    /** Sorts a {@code ktxHashList} into order of the key codepoints. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Sort(@NativeType("ktxHashList*") long pHead) {
        long __functionAddress = Functions.HashList_Sort;
        if (CHECKS) {
            check(pHead);
        }
        return callPI(pHead, __functionAddress);
    }

    // --- [ ktxHashList_Serialize ] ---

    /** Unsafe version of: {@link #ktxHashList_Serialize HashList_Serialize} */
    public static int nktxHashList_Serialize(long pHead, long kvdLen, long kvd) {
        long __functionAddress = Functions.HashList_Serialize;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPI(pHead, kvdLen, kvd, __functionAddress);
    }

    /** Serializes a {@code ktxHashList} to a block of memory suitable for writing to a KTX file. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Serialize(@NativeType("ktxHashList*") long pHead, @NativeType("unsigned int *") IntBuffer kvdLen, @NativeType("unsigned char **") PointerBuffer kvd) {
        if (CHECKS) {
            check(kvdLen, 1);
            check(kvd, 1);
        }
        return nktxHashList_Serialize(pHead, memAddress(kvdLen), memAddress(kvd));
    }

    // --- [ ktxHashList_Deserialize ] ---

    /** Unsafe version of: {@link #ktxHashList_Deserialize HashList_Deserialize} */
    public static int nktxHashList_Deserialize(long pHead, int kvdLen, long kvd) {
        long __functionAddress = Functions.HashList_Deserialize;
        if (CHECKS) {
            check(pHead);
        }
        return callPPI(pHead, kvdLen, kvd, __functionAddress);
    }

    /** Creates a hash table from the serialized data read from a a KTX file. */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Deserialize(@NativeType("ktxHashList*") long pHead, @NativeType("void *") ByteBuffer kvd) {
        return nktxHashList_Deserialize(pHead, kvd.remaining(), memAddress(kvd));
    }

    // --- [ ktxHashListEntry_GetKey ] ---

    /** Unsafe version of: {@link #ktxHashListEntry_GetKey HashListEntry_GetKey} */
    public static int nktxHashListEntry_GetKey(long This, long pKeyLen, long ppKey) {
        long __functionAddress = Functions.HashListEntry_GetKey;
        if (CHECKS) {
            check(This);
        }
        return callPPPI(This, pKeyLen, ppKey, __functionAddress);
    }

    /** Get the key from a {@code ktxHashListEntry}. */
    @NativeType("KTX_error_code")
    public static int ktxHashListEntry_GetKey(@NativeType("ktxHashListEntry *") long This, @NativeType("unsigned int *") IntBuffer pKeyLen, @NativeType("char **") PointerBuffer ppKey) {
        if (CHECKS) {
            check(pKeyLen, 1);
            check(ppKey, 1);
        }
        return nktxHashListEntry_GetKey(This, memAddress(pKeyLen), memAddress(ppKey));
    }

    // --- [ ktxHashListEntry_GetValue ] ---

    /** Unsafe version of: {@link #ktxHashListEntry_GetValue HashListEntry_GetValue} */
    public static int nktxHashListEntry_GetValue(long This, long pValueLen, long ppValue) {
        long __functionAddress = Functions.HashListEntry_GetValue;
        if (CHECKS) {
            check(This);
        }
        return callPPPI(This, pValueLen, ppValue, __functionAddress);
    }

    /** Get the value from a {@code ktxHashListEntry}. */
    @NativeType("KTX_error_code")
    public static int ktxHashListEntry_GetValue(@NativeType("ktxHashListEntry *") long This, @NativeType("unsigned int *") IntBuffer pValueLen, @NativeType("void **") PointerBuffer ppValue) {
        if (CHECKS) {
            check(pValueLen, 1);
            check(ppValue, 1);
        }
        return nktxHashListEntry_GetValue(This, memAddress(pValueLen), memAddress(ppValue));
    }

    // --- [ ktxPrintInfoForNamedFile ] ---

    public static int nktxPrintInfoForNamedFile(long filename) {
        long __functionAddress = Functions.PrintInfoForNamedFile;
        return callPI(filename, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintInfoForNamedFile(@NativeType("char const * const") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nktxPrintInfoForNamedFile(memAddress(filename));
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintInfoForNamedFile(@NativeType("char const * const") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nktxPrintInfoForNamedFile(filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxPrintInfoForMemory ] ---

    public static int nktxPrintInfoForMemory(long bytes, long size) {
        long __functionAddress = Functions.PrintInfoForMemory;
        return callPPI(bytes, size, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintInfoForMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes) {
        return nktxPrintInfoForMemory(memAddress(bytes), bytes.remaining());
    }

    // --- [ ktxPrintKTX2InfoTextForMemory ] ---

    public static int nktxPrintKTX2InfoTextForMemory(long bytes, long size) {
        long __functionAddress = Functions.PrintKTX2InfoTextForMemory;
        return callPPI(bytes, size, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes) {
        return nktxPrintKTX2InfoTextForMemory(memAddress(bytes), bytes.remaining());
    }

    // --- [ ktxPrintKTX2InfoTextForNamedFile ] ---

    public static int nktxPrintKTX2InfoTextForNamedFile(long filename) {
        long __functionAddress = Functions.PrintKTX2InfoTextForNamedFile;
        return callPI(filename, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForNamedFile(@NativeType("char const * const") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nktxPrintKTX2InfoTextForNamedFile(memAddress(filename));
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForNamedFile(@NativeType("char const * const") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nktxPrintKTX2InfoTextForNamedFile(filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxPrintKTX2InfoTextForStream ] ---

    public static int nktxPrintKTX2InfoTextForStream(long stream) {
        long __functionAddress = Functions.PrintKTX2InfoTextForStream;
        return callPI(stream, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForStream(@NativeType("struct ktxStream *") ktxStream stream) {
        return nktxPrintKTX2InfoTextForStream(stream.address());
    }

    // --- [ ktxPrintKTX2InfoJSONForMemory ] ---

    public static int nktxPrintKTX2InfoJSONForMemory(long bytes, long size, int base_indent, int indent_width, boolean minified) {
        long __functionAddress = Functions.PrintKTX2InfoJSONForMemory;
        return callPPI(bytes, size, base_indent, indent_width, minified, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoJSONForMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktx_uint32_t") int base_indent, @NativeType("ktx_uint32_t") int indent_width, @NativeType("bool") boolean minified) {
        return nktxPrintKTX2InfoJSONForMemory(memAddress(bytes), bytes.remaining(), base_indent, indent_width, minified);
    }

    // --- [ ktxPrintKTX2InfoJSONForNamedFile ] ---

    public static int nktxPrintKTX2InfoJSONForNamedFile(long filename, int base_indent, int indent_width, boolean minified) {
        long __functionAddress = Functions.PrintKTX2InfoJSONForNamedFile;
        return callPI(filename, base_indent, indent_width, minified, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoJSONForNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktx_uint32_t") int base_indent, @NativeType("ktx_uint32_t") int indent_width, @NativeType("bool") boolean minified) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nktxPrintKTX2InfoJSONForNamedFile(memAddress(filename), base_indent, indent_width, minified);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoJSONForNamedFile(@NativeType("char const * const") CharSequence filename, @NativeType("ktx_uint32_t") int base_indent, @NativeType("ktx_uint32_t") int indent_width, @NativeType("bool") boolean minified) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nktxPrintKTX2InfoJSONForNamedFile(filenameEncoded, base_indent, indent_width, minified);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ktxPrintKTX2InfoJSONForStream ] ---

    public static int nktxPrintKTX2InfoJSONForStream(long stream, int base_indent, int indent_width, boolean minified) {
        long __functionAddress = Functions.PrintKTX2InfoJSONForStream;
        return callPI(stream, base_indent, indent_width, minified, __functionAddress);
    }

    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoJSONForStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktx_uint32_t") int base_indent, @NativeType("ktx_uint32_t") int indent_width, @NativeType("bool") boolean minified) {
        return nktxPrintKTX2InfoJSONForStream(stream.address(), base_indent, indent_width, minified);
    }

    public static final byte[] KTX_IDENTIFIER_REF = {
        (byte)0xAB, (byte)0x4B, (byte)0x54, (byte)0x58,
        (byte)0x20, (byte)0x31, (byte)0x31, (byte)0xBB,
        (byte)0x0D, (byte)0x0A, (byte)0x1A, (byte)0x0A
    };

    public static final int KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL;
    static {
        long p = KTX.getFunctionAddress("KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL");
        KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL = p == NULL ? 0 : memGetInt(p);
    }

    // --- [ vtbl macros ] ---

    public static void ktxTexture_Destroy(@NativeType("ktxTexture *") ktxTexture This) {
        callPV(This.address(), This.vtbl().Destroy());
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_GetImageOffset(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint32_t") int level, @NativeType("ktx_uint32_t") int layer, @NativeType("ktx_uint32_t") int faceSlice, @NativeType("ktx_size_t *") PointerBuffer pOffset) {
        if (CHECKS) {
            check(pOffset, 1);
        }
        return callPPI(This.address(), level, layer, faceSlice, memAddress(pOffset), This.vtbl().GetImageOffset());
    }

    @NativeType("ktx_size_t")
    public static long ktxTexture_GetDataSizeUncompressed(@NativeType("ktxTexture *") ktxTexture This) {
        return callPP(This.address(), This.vtbl().GetDataSizeUncompressed());
    }

    @NativeType("ktx_size_t")
    public static long ktxTexture_GetImageSize(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint32_t") int level) {
        return callPP(This.address(), level, This.vtbl().GetImageSize());
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_IterateLevels(@NativeType("ktxTexture *") ktxTexture This, @NativeType("PFNKTXITERCB") PFNKTXITERCBI iterCb, @NativeType("void *") long userdata) {
        return callPPPI(This.address(), iterCb.address(), userdata, This.vtbl().IterateLevels());
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_IterateLoadLevelFaces(@NativeType("ktxTexture *") ktxTexture This, @NativeType("PFNKTXITERCB") PFNKTXITERCBI iterCb, @NativeType("void *") long userdata) {
        return callPPPI(This.address(), iterCb.address(), userdata, This.vtbl().IterateLoadLevelFaces());
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_LoadImageData(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint8_t *") ByteBuffer pBuffer) {
        return callPPPI(This.address(), memAddress(pBuffer), pBuffer.remaining(), This.vtbl().LoadImageData());
    }

    @NativeType("ktx_bool_t")
    public static boolean ktxTexture_NeedsTranscoding(@NativeType("ktxTexture *") ktxTexture This) {
        return callPZ(This.address(), This.vtbl().NeedsTranscoding());
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_SetImageFromMemory(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint32_t") int level, @NativeType("ktx_uint32_t") int layer, @NativeType("ktx_uint32_t") int faceSlice, @NativeType("ktx_uint8_t const *") ByteBuffer src) {
        return callPPPI(This.address(), level, layer, faceSlice, memAddress(src), src.remaining(), This.vtbl().SetImageFromMemory());
    }

    @NativeType("KTX_error_code")
    public static int ktxWriteToNamedFile(@NativeType("ktxTexture *") ktxTexture This, @NativeType("char const * const") ByteBuffer dstname) {
        if (CHECKS) {
            checkNT1(dstname);
        }
        return callPPI(This.address(), memAddress(dstname), This.vtbl().WriteToNamedFile());
    }

    @NativeType("KTX_error_code")
    public static int ktxWriteToNamedFile(@NativeType("ktxTexture *") ktxTexture This, @NativeType("char const * const") CharSequence dstname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(dstname, true);
            long dstnameEncoded = stack.getPointerAddress();
            return callPPI(This.address(), dstnameEncoded, This.vtbl().WriteToNamedFile());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_WriteToMemory(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint8_t **") PointerBuffer bytes, @NativeType("ktx_size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(bytes, 1);
            check(size, 1);
        }
        return callPPPI(This.address(), memAddress(bytes), memAddress(size), This.vtbl().WriteToMemory());
    }

    @NativeType("KTX_error_code")
    public static int ktxTexture_WriteToStream(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktxStream *") long dststr) {
        if (CHECKS) {
            check(dststr);
        }
        return callPPI(This.address(), dststr, This.vtbl().WriteToStream());
    }

}