/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ktx.templates

import org.lwjgl.generator.*
import ktx.*

val ktx = "KTX".nativeClass(Module.KTX, prefix = "KTX", binding = KTX_BINDING) {
    documentation =
        """
        Native bindings to ${url("https://www.khronos.org/ktx/", "KTX (Khronos Texture)")}.

        KTX is a lightweight container for textures for OpenGL®, Vulkan® and other GPU APIs. KTX files contain all the parameters needed for texture loading.
        A single file can contain anything from a simple base-level 2D texture through to a cubemap array texture with mipmaps. Contained textures can be in a
        Basis Universal format, in any of the block-compressed formats supported by OpenGL family and Vulkan APIs and extensions or in an uncompressed
        single-plane format. Basis Universal currently encompasses two formats that can be quickly transcoded to any GPU-supported format: LZ/ETC1S, which
        combines block-compression and supercompression, and UASTC, a block-compressed format. Formats other than LZ/ETC1S can be supercompressed with Zstd.
        """

    StringConstant("", "ANIMDATA_KEY".."KTXanimData")
    StringConstant("", "ORIENTATION_KEY".."KTXorientation")
    StringConstant("", "SWIZZLE_KEY".."KTXswizzle")
    StringConstant("", "WRITER_KEY".."KTXwriter")
    StringConstant("", "WRITER_SCPARAMS_KEY".."KTXwriterScParams")
    StringConstant("", "ORIENTATION1_FMT".."S=%c")
    StringConstant("", "ORIENTATION2_FMT".."S=%c,T=%c")
    StringConstant("", "ORIENTATION3_FMT".."S=%c,T=%c,R=%c")

    IntConstant("", "GL_UNPACK_ALIGNMENT".."4")

    IntConstant("", "TRUE".."1")
    IntConstant("", "FALSE".."0")

    customMethod("""
    public static final byte[] KTX_IDENTIFIER_REF = {
        (byte)0xAB, (byte)0x4B, (byte)0x54, (byte)0x58,
        (byte)0x20, (byte)0x31, (byte)0x31, (byte)0xBB,
        (byte)0x0D, (byte)0x0A, (byte)0x1A, (byte)0x0A
    };
    """)
    IntConstant("", "ENDIAN_REF".."0x04030201")
    IntConstant("", "ENDIAN_REF_REV".."0x01020304")
    IntConstant("", "HEADER_SIZE".."64")

    EnumConstant(
        "({@code ktx_error_code_e})",

        "SUCCESS".enum("Operation was successful.", "0"),
        "FILE_DATA_ERROR".enum("The data in the file is inconsistent with the spec."),
        "FILE_ISPIPE".enum("The file is a pipe or named pipe."),
        "FILE_OPEN_FAILED".enum("The target file could not be opened."),
        "FILE_OVERFLOW".enum("The operation would exceed the max file size."),
        "FILE_READ_ERROR".enum("An error occurred while reading from the file."),
        "FILE_SEEK_ERROR".enum("An error occurred while seeking in the file."),
        "FILE_UNEXPECTED_EOF".enum("File does not have enough data to satisfy request."),
        "FILE_WRITE_ERROR".enum("An error occurred while writing to the file."),
        "GL_ERROR".enum("GL operations resulted in an error."),
        "INVALID_OPERATION".enum("The operation is not allowed in the current state."),
        "INVALID_VALUE".enum("A parameter value was not valid"),
        "NOT_FOUND".enum("Requested key was not found"),
        "OUT_OF_MEMORY".enum("Not enough memory to complete the operation."),
        "TRANSCODE_FAILED".enum("Transcoding of block compressed texture failed."),
        "UNKNOWN_FILE_FORMAT".enum("The file not a KTX file"),
        "UNSUPPORTED_TEXTURE_TYPE".enum("The KTX file specifies an unsupported texture type."),
        "UNSUPPORTED_FEATURE".enum("Feature not included in in-use library or not yet implemented."),
        "LIBRARY_NOT_LINKED".enum("Library dependency (OpenGL or Vulkan) not linked into application."),
        "DECOMPRESS_LENGTH_ERROR".enum("Decompressed byte count does not match expected byte size."),
        "DECOMPRESS_CHECKSUM_ERROR".enum("Checksum mismatch when decompressing.")
    )

    EnumConstant(
        "{@code ktxOrientationX}",

        "ORIENT_X_LEFT".enum("", "'l'"),
        "ORIENT_X_RIGHT".enum("", "'r'")
    )

    EnumConstant(
        "{@code ktxOrientationY}",

        "ORIENT_Y_UP".enum("", "'u'"),
        "ORIENT_Y_DOWN".enum("", "'d'")
    )

    EnumConstant(
        "{@code ktxOrientationZ}",

        "ORIENT_Z_IN".enum("", "'i'"),
        "ORIENT_Z_OUT".enum("", "'o'")
    )

    EnumConstant(
        "{@code class_id}",

        "ktxTexture1_c".enum("", "1"),
        "ktxTexture2_c".enum
    ).noPrefix()

    EnumConstant(
        "Enumerators identifying the supercompression scheme. ({@code ktxSupercmpScheme})",

        "SS_NONE".enum("No supercompression.", "0"),
        "SS_BASIS_LZ".enum("Basis LZ supercompression."),
        "SS_ZSTD".enum("ZStd supercompression."),
        "SS_ZLIB".enum("ZLIB supercompression."),
        "SS_BEGIN_RANGE".enum("", "KTX_SS_NONE"),
        "SS_END_RANGE".enum("", "KTX_SS_ZLIB"),
        "SS_BEGIN_VENDOR_RANGE".enum("", "0x10000"),
        "SS_END_VENDOR_RANGE".enum("", "0x1ffff"),
        "SS_BEGIN_RESERVED".enum("", "0x20000")
    )

    EnumConstant(
        "Enum for requesting, or not, allocation of storage for images. ({@code ktxTextureCreateStorageEnum})",

        "TEXTURE_CREATE_NO_STORAGE".enum("Don't allocate any image storage.", "0"),
        "TEXTURE_CREATE_ALLOC_STORAGE".enum("Allocate image storage.")
    )

    EnumConstant(
        "Flags for requesting services during creation. ({@code enum ktxTextureCreateFlagBits})",

        "TEXTURE_CREATE_NO_FLAGS".enum("", "0x00"),
        "TEXTURE_CREATE_LOAD_IMAGE_DATA_BIT".enum("Load the images from the KTX source.", "0x01"),
        "TEXTURE_CREATE_RAW_KVDATA_BIT".enum("Load the raw key-value data instead of creating a {@code ktxHashList} from it.", "0x02"),
        "TEXTURE_CREATE_SKIP_KVDATA_BIT".enum("Skip any key-value data. This overrides the {@code RAW_KVDATA_BIT}.", "0x04"),
        "TEXTURE_CREATE_CHECK_GLTF_BASISU_BIT".enum("Load texture compatible with the rules of KHR_texture_basisu glTF extension.", "0x08")
    )

    EnumConstant(
        "{@code enum streamType}",

        "eStreamTypeFile".enum("", "1"),
        "eStreamTypeMemory".enum,
        "eStreamTypeCustom".enum
    ).noPrefix()

    EnumConstant(
        "Flags specifiying UASTC encoding options. ({@code ktx_pack_uastc_flag_bits_e})",

        "PACK_UASTC_LEVEL_FASTEST".enum("Fastest compression. 43.45dB.", "0"),
        "PACK_UASTC_LEVEL_FASTER".enum("Faster compression. 46.49dB."),
        "PACK_UASTC_LEVEL_DEFAULT".enum("Default compression. 47.47dB."),
        "PACK_UASTC_LEVEL_SLOWER".enum("Slower compression. 48.01dB."),
        "PACK_UASTC_LEVEL_VERYSLOW".enum("Very slow compression. 48.24dB."),
        "PACK_UASTC_MAX_LEVEL".enum("Maximum supported quality level.", "KTX_PACK_UASTC_LEVEL_VERYSLOW"),
        "PACK_UASTC_LEVEL_MASK".enum("Mask to extract the level from the other bits.", "0xF"),
        "PACK_UASTC_FAVOR_UASTC_ERROR".enum("Optimize for lowest UASTC error.", "8"),
        "PACK_UASTC_FAVOR_BC7_ERROR".enum("Optimize for lowest BC7 error.", "16"),
        "PACK_UASTC_ETC1_FASTER_HINTS".enum("Optimize for faster transcoding to ETC1.", "64"),
        "PACK_UASTC_ETC1_FASTEST_HINTS".enum("Optimize for fastest transcoding to ETC1.", "128"),
        "PACK_UASTC__ETC1_DISABLE_FLIP_AND_INDIVIDUAL".enum("Not documented in BasisU code.", "256")
    )

    EnumConstant(
        "Options specifiying ASTC encoding quality levels. ({@code ktx_pack_astc_quality_levels_e})",

        "PACK_ASTC_QUALITY_LEVEL_FASTEST".enum("Fastest compression.", "0"),
        "PACK_ASTC_QUALITY_LEVEL_FAST".enum("Fast compression.", "10"),
        "PACK_ASTC_QUALITY_LEVEL_MEDIUM".enum("Medium compression.", "60"),
        "PACK_ASTC_QUALITY_LEVEL_THOROUGH".enum("Slower compression.", "98"),
        "PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE".enum("Very slow compression.", "100"),
        "PACK_ASTC_QUALITY_LEVEL_MAX".enum("Maximum supported quality level.", "KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE")
    )

    EnumConstant(
        "Options specifiying ASTC encoding block dimensions. ({@code ktx_pack_astc_block_dimension_e})",

        "PACK_ASTC_BLOCK_DIMENSION_4x4".enum("8.00 bpp", "0"),
        "PACK_ASTC_BLOCK_DIMENSION_5x4".enum("6.40 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_5x5".enum("5.12 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_6x5".enum("4.27 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_6x6".enum("3.56 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_8x5".enum("3.20 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_8x6".enum("2.67 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_10x5".enum("2.56 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_10x6".enum("2.13 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_8x8".enum("2.00 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_10x8".enum("1.60 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_10x10".enum("1.28 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_12x10".enum("1.07 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_12x12".enum("0.89 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_3x3x3".enum("4.74 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_4x3x3".enum("3.56 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_4x4x3".enum("2.67 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_4x4x4".enum("2.00 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_5x4x4".enum("1.60 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_5x5x4".enum("1.28 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_5x5x5".enum("1.02 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_6x5x5".enum("0.85 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_6x6x5".enum("0.71 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_6x6x6".enum("0.59 bpp"),
        "PACK_ASTC_BLOCK_DIMENSION_MAX".enum("Maximum supported blocks.", "KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x6")
    )

    EnumConstant(
        """
        Options specifying ASTC encoder profile mode. ({@code ktx_pack_astc_encoder_mode_e})
        
        This and function is used later to derive the profile.
        """,

        "PACK_ASTC_ENCODER_MODE_DEFAULT".enum("", "0"),
        "PACK_ASTC_ENCODER_MODE_LDR".enum,
        "PACK_ASTC_ENCODER_MODE_HDR".enum,
        "PACK_ASTC_ENCODER_MODE_MAX".enum("", "KTX_PACK_ASTC_ENCODER_MODE_HDR")
    )

    EnumConstant(
        """
        Enumerators for specifying the transcode target format. ({@code ktx_transcode_fmt_e})

        For BasisU/ETC1S format, {@code Opaque} and {@code alpha} here refer to 2 separate RGB images, a.k.a slices within the BasisU compressed data. For
        UASTC format they refer to the RGB and the alpha components of the UASTC data. If the original image had only 2 components, R will be in the opaque
        portion and G in the alpha portion. The R value will be replicated in the RGB components. In the case of BasisU the G value will be replicated in all 3
        components of the alpha slice. If the original image had only 1 component it's value is replicated in all 3 components of the opaque portion and there
        is no alpha.

        ${note("""You should not transcode sRGB encoded data to {@code KTX_TTF_BC4_R}, {@code KTX_TTF_BC5_RG}, {@code KTX_TTF_ETC2_EAC_R[G]11}, {@code
        KTX_TTF_RGB565}, {@code KTX_TTF_BGR565} or {@code KTX_TTF_RGBA4444} formats as neither OpenGL nor Vulkan support sRGB variants of these. Doing sRGB
        decoding in the shader will not produce correct results if any texture filtering is being used.""")}
        """,

        "TTF_ETC1_RGB".enum("ETC1-2", "0"),
        "TTF_ETC2_RGBA".enum,
        "TTF_BC1_RGB".enum("BC1-5, BC7 (desktop, some mobile devices)"),
        "TTF_BC3_RGBA".enum,
        "TTF_BC4_R".enum,
        "TTF_BC5_RG".enum,
        "TTF_BC7_RGBA".enum,
        "TTF_PVRTC1_4_RGB".enum("PVRTC1 4bpp (mobile, PowerVR devices)", "8"),
        "TTF_PVRTC1_4_RGBA".enum,
        "TTF_ASTC_4x4_RGBA".enum("ASTC (mobile, Intel devices, hopefully all desktop GPU's one day)"),
        "TTF_PVRTC2_4_RGB".enum("ATC and FXT1 formats are not supported by KTX2 as there are no equivalent VkFormats.", "18"),
        "TTF_PVRTC2_4_RGBA".enum,
        "TTF_ETC2_EAC_R11".enum,
        "TTF_ETC2_EAC_RG11".enum,
        "TTF_RGBA32".enum("Uncompressed (raw pixel) formats", "13"),
        "TTF_RGB565".enum,
        "TTF_BGR565".enum,
        "TTF_RGBA4444".enum,
        "TTF_ETC".enum("Values for automatic selection of RGB or RGBA depending if alpha present.", "22"),
        "TTF_BC1_OR_3".enum,
        "TTF_NOSELECTION".enum("", 0x7fffffff)
    )

    EnumConstant(
        """
        Flags guiding transcoding of Basis Universal compressed textures. ({@code ktx_transcode_flag_bits_e})
        """,

        "TF_PVRTC_DECODE_TO_NEXT_POW2".enum(
            """
            PVRTC1: decode non-pow2 ETC1S texture level to the next larger power of 2 (not implemented yet, but we're going to support it).

            Ignored if the slice's dimensions are already a power of 2.
            """,
            "2"
        ),
        "TF_TRANSCODE_ALPHA_DATA_TO_OPAQUE_FORMATS".enum(
            """
            When decoding to an opaque texture format, if the Basis data has alpha, decode the alpha slice instead of the color slice to the output texture
            format.
            
            Has no effect if there is no alpha data.
            """,
            "4"),
        "TF_HIGH_QUALITY".enum(
            """
            Request higher quality transcode of UASTC to BC1, BC3, ETC2_EAC_R11 and ETC2_EAC_RG11.

            The flag is unused by other UASTC transcoders.
            """,
            "32"
        )
    )

    /*ktx_error_code_e(
        "Texture_CreateFromStdioStream",
        "These four create a ktxTexture1 or ktxTexture2 according to the data header, and return a pointer to the base ktxTexture class.",

        "FILE".opaque.p("stdioStream", ""),
        ktxTextureCreateFlags("createFlags", ""),
        ktxTexture.p.p("newTex", "")
    )*/

    ktx_error_code_e(
        "Texture_CreateFromNamedFile",
        "",

        charUTF8.const.p.const("filename", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture_CreateFromMemory",
        "",

        ktx_uint8_t.const.p("bytes", ""),
        AutoSize("bytes")..ktx_size_t("size", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture_CreateFromStream",
        "",

        ktxStream.p("stream", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture.p.p("newTex", "")
    )

    MapPointer("ktxTexture_GetDataSize(This)")..ktx_uint8_t.p(
        "Texture_GetData",
        "Returns a pointer to the image data of a {@code ktxTexture} object.",

        ktxTexture.p("This", "")
    )

    ktx_uint32_t(
        "Texture_GetRowPitch",
        "Returns the pitch of a row of an image at the specified level. Similar to the {@code rowPitch} in a {@code VkSubResourceLayout}.",

        ktxTexture.p("This", ""),
        ktx_uint32_t("level", "")
    )

    ktx_uint32_t(
        "Texture_GetElementSize",
        "Return the element size of the texture's images.",

        ktxTexture.p("This", "")
    )

    ktx_size_t(
        "Texture_GetDataSize",
        "Returns the size of all the image data of a {@code ktxTexture} object in bytes.",

        ktxTexture.p("This", "")
    )

    ktx_error_code_e(
        "Texture_GLUpload",
        "Uploads a texture to OpenGL.",

        ktxTexture.p("This", ""),
        Check(1)..GLuint.p("pTexture", ""),
        Check(1)..GLenum.p("pTarget", ""),
        Check(1)..GLenum.p("pGlerror", "")
    )

    ktx_error_code_e(
        "Texture_IterateLevelFaces",
        "Iterate over the levels or faces in a {@code ktxTexture} object.",

        ktxTexture.p("This", ""),
        PFNKTXITERCB("iterCb", ""),
        nullable..opaque_p("userdata", "")
    )

    ktx_error_code_e(
        "Texture1_Create",
        "Create a new {@code ktxTexture1}.",

        ktxTextureCreateInfo.p("createInfo", ""),
        ktxTextureCreateStorageEnum("storageAllocation", ""),
        Check(1)..ktxTexture1.p.p("newTex", "")
    )

    /*ktx_error_code_e(
        "Texture1_CreateFromStdioStream",
        "These four create a ktxTexture1 provided the data is in KTX format.",

        "FILE".opaque.p("stdioStream", ""),
        ktxTextureCreateFlags("createFlags", ""),
        ktxTexture1.p.p("newTex", "")
    )*/

    ktx_error_code_e(
        "Texture1_CreateFromNamedFile",
        "",

        charUTF8.const.p.const("filename", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture1.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture1_CreateFromMemory",
        "",

        ktx_uint8_t.const.p("bytes", ""),
        AutoSize("bytes")..ktx_size_t("size", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture1.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture1_CreateFromStream",
        "",

        ktxStream.p("stream", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture1.p.p("newTex", "")
    )

    ktx_bool_t(
        "Texture1_NeedsTranscoding",
        "",

        ktxTexture1.p("This", "")
    )

    /*ktx_error_code_e(
        "Texture1_WriteKTX2ToStdioStream",
        "Write a {@code ktxTexture} object to a stdio stream in KTX format.",

        ktxTexture1.p("This", ""),
        "FILE".opaque.p("dstsstr", "")
    )*/

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteKTX2ToNamedFile",
        "Write a {@code ktxTexture} object to a named file in KTX format.",

        ktxTexture1.p("This", ""),
        charUTF8.const.p.const("dstname", "")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteKTX2ToMemory",
        "Write a {@code ktxTexture} object to a block of memory in KTX format.",

        ktxTexture1.p("This", ""),
        Check(1)..ktx_uint8_t.p.p("bytes", ""),
        Check(1)..ktx_size_t.p("size", "")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteKTX2ToStream",
        "Write a {@code ktxTexture object} to a {@code ktxStream} in KTX format.",

        ktxTexture1.p("This", ""),
        ktxStream.p("dststr", "")
    )

    ktx_error_code_e(
        "Texture2_Create",
        "Create a new {@code ktxTexture2}.",

        ktxTextureCreateInfo.p("createInfo", ""),
        ktxTextureCreateStorageEnum("storageAllocation", ""),
        Check(1)..ktxTexture2.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture2_CreateCopy",
        "Create a new {@code ktxTexture2} as a copy of an existing texture.",

        ktxTexture2.p("orig", ""),
        Check(1)..ktxTexture2.p.p("newTex", "")
    )

    /*ktx_error_code_e(
        "Texture2_CreateFromStdioStream",
        "These four create a ktxTexture2 provided the data is in KTX2 format.",

        "FILE".opaque.p("stdioStream", ""),
        ktxTextureCreateFlags("createFlags", ""),
        ktxTexture2.p.p("newTex", "")
    )*/

    ktx_error_code_e(
        "Texture2_CreateFromNamedFile",
        "",

        charUTF8.const.p.const("filename", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture2.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture2_CreateFromMemory",
        "",

        ktx_uint8_t.const.p("bytes", ""),
        AutoSize("bytes")..ktx_size_t("size", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture2.p.p("newTex", "")
    )

    ktx_error_code_e(
        "Texture2_CreateFromStream",
        "",

        ktxStream.p("stream", ""),
        ktxTextureCreateFlags("createFlags", ""),
        Check(1)..ktxTexture2.p.p("newTex", "")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressBasis",
        "",

        ktxTexture2.p("This", ""),
        ktx_uint32_t("quality", "")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_DeflateZstd",
        "",

        ktxTexture2.p("This", ""),
        ktx_uint32_t("level", "")
    )

    ktx_error_code_e(
        "Texture2_DeflateZLIB",
        "",

        ktxTexture2.p("This", ""),
        ktx_uint32_t("level", "")
    )

    void(
        "Texture2_GetComponentInfo",
        "",

        ktxTexture2.p("This", ""),
        Check(1)..ktx_uint32_t.p("numComponents", ""),
        Check(1)..ktx_uint32_t.p("componentByteLength", "")
    )

    ktx_uint32_t(
        "Texture2_GetNumComponents",
        "",

        ktxTexture2.p("This", "")
    )

    khr_df_transfer_e(
        "Texture2_GetOETF_e",
        "",

        ktxTexture2.p("This", "")
    )

    ktx_uint32_t(
        "Texture2_GetOETF",
        "",

        ktxTexture2.p("This", "")
    )

    khr_df_model_e(
        "Texture2_GetColorModel_e",
        "",

        ktxTexture2.p("This", "")
    )

    ktx_bool_t(
        "Texture2_GetPremultipliedAlpha",
        "",

        ktxTexture2.p("This", "")
    )

    ktx_bool_t(
        "Texture2_NeedsTranscoding",
        "",

        ktxTexture2.p("This", "")
    )

    customMethod("""
    public static final int KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL;
    static {
        long p = KTX.getFunctionAddress("KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL");
        KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL = p == NULL ? 0 : memGetInt(p);
    }""")

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressAstcEx",
        "",

        ktxTexture2.p("This", ""),
        ktxAstcParams.p("params", "")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressAstc",
        "",

        ktxTexture2.p("This", ""),
        ktx_uint32_t("quality", "")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressBasisEx",
        "",

        ktxTexture2.p("This", ""),
        ktxBasisParams.p("params", "")
    )

    ktx_error_code_e(
        "Texture2_TranscodeBasis",
        "",

        ktxTexture2.p("This", ""),
        ktx_transcode_fmt_e("fmt", ""),
        ktx_transcode_flags("transcodeFlags", "")
    )

    charASCII.const.p(
        "ErrorString",
        "Returns a string corresponding to a KTX error code.",

        ktx_error_code_e("error", "")
    )

    charASCII.const.p(
        "SupercompressionSchemeString",
        "Returns a string corresponding to a supercompression scheme.",

        ktxSupercmpScheme("scheme", "")
    )

    charASCII.const.p(
        "TranscodeFormatString",
        "Returns a string corresponding to a transcode target format.",

        ktx_transcode_fmt_e("format", "")
    )

    ktx_error_code_e(
        "HashList_Create",
        "",

        Check(1)..ktxHashList_p.p("ppHl", "")
    )

    ktx_error_code_e(
        "HashList_CreateCopy",
        "",

        Check(1)..ktxHashList_p.p("ppHl", ""),
        ktxHashList("orig", "")
    )

    void(
        "HashList_Construct",
        "",

        ktxHashList_p("pHl", "")
    )

    void(
        "HashList_ConstructCopy",
        "",

        ktxHashList_p("pHl", ""),
        ktxHashList("orig", "")
    )

    void(
        "HashList_Destroy",
        "",

        ktxHashList_p("head", "")
    )

    void(
        "HashList_Destruct",
        "",

        ktxHashList_p("head", "")
    )

    ktx_error_code_e(
        "HashList_AddKVPair",
        "Adds a key-value pair to a hash list.",

        ktxHashList_p("pHead", ""),
        charUTF8.const.p("key", ""),
        AutoSize("value")..unsigned_int("valueLen", ""),
        void.const.p("value", "")
    )

    ktx_error_code_e(
        "HashList_DeleteEntry",
        "Deletes a {@code ktxHashListEntry} from a {@code ktxHashList}.",

        ktxHashList_p("pHead", ""),
        ktxHashListEntry.p("pEntry", "")
    )

    ktx_error_code_e(
        "HashList_DeleteKVPair",
        "Finds the entry for a key in a {@code ktxHashList} and deletes it.",

        ktxHashList_p("pHead", ""),
        charUTF8.const.p("key", "")
    )

    ktx_error_code_e(
        "HashList_FindEntry",
        "Looks up a key and returns the {@code ktxHashListEntry}.",

        ktxHashList_p("pHead", ""),
        charUTF8.const.p("key", ""),
        Check(1)..ktxHashListEntry.p.p("ppEntry", "")
    )

    ktx_error_code_e(
        "HashList_FindValue",
        "Looks up a key and returns the value.",

        ktxHashList_p("pHead", ""),
        charUTF8.const.p("key", ""),
        Check(1)..unsigned_int.p("pValueLen", ""),
        Check(1)..void.p.p("pValue", "")
    )

    ktxHashListEntry.p(
        "HashList_Next",
        "Return the next entry in a {@code ktxHashList}.",

        ktxHashListEntry.p("entry", "")
    )

    ktx_error_code_e(
        "HashList_Sort",
        "Sorts a {@code ktxHashList} into order of the key codepoints.",

        ktxHashList_p("pHead", "")
    )

    ktx_error_code_e(
        "HashList_Serialize",
        "Serializes a {@code ktxHashList} to a block of memory suitable for writing to a KTX file.",

        ktxHashList_p("pHead", ""),
        Check(1)..unsigned_int.p("kvdLen", ""),
        Check(1)..unsigned_char.p.p("kvd", "")
    )

    ktx_error_code_e(
        "HashList_Deserialize",
        "Creates a hash table from the serialized data read from a a KTX file.",

        ktxHashList_p("pHead", ""),
        AutoSize("kvd")..unsigned_int("kvdLen", ""),
        void.p("kvd", "")
    )

    ktx_error_code_e(
        "HashListEntry_GetKey",
        "Get the key from a {@code ktxHashListEntry}.",

        ktxHashListEntry.p("This", ""),
        Check(1)..unsigned_int.p("pKeyLen", ""),
        Check(1)..char.p.p("ppKey", "")
    )

    ktx_error_code_e(
        "HashListEntry_GetValue",
        "Get the value from a {@code ktxHashListEntry}.",

        ktxHashListEntry.p("This", ""),
        Check(1)..unsigned_int.p("pValueLen", ""),
        Check(1)..void.p.p("ppValue", "")
    )

    /*ktx_error_code_e(
        "PrintInfoForStdioStream",
        "",

        "FILE".opaque.p("stdioStream", "")
    )*/

    ktx_error_code_e(
        "PrintInfoForNamedFile",
        "",

        charUTF8.const.p.const("filename", "")
    )

    ktx_error_code_e(
        "PrintInfoForMemory",
        "",

        ktx_uint8_t.const.p("bytes", ""),
        AutoSize("bytes")..ktx_size_t("size", "")
    )

    ktx_error_code_e(
        "PrintKTX2InfoTextForMemory",
        "",

        ktx_uint8_t.const.p("bytes", ""),
        AutoSize("bytes")..ktx_size_t("size", "")
    )

    ktx_error_code_e(
        "PrintKTX2InfoTextForNamedFile",
        "",

        charUTF8.const.p.const("filename", "")
    )

    ktx_error_code_e(
        "PrintKTX2InfoTextForStream",
        "",

        ktxStream.p("stream", "")
    )

    ktx_error_code_e(
        "PrintKTX2InfoJSONForMemory",
        "",

        ktx_uint8_t.const.p("bytes", ""),
        AutoSize("bytes")..ktx_size_t("size", ""),
        ktx_uint32_t("base_indent", ""),
        ktx_uint32_t("indent_width", ""),
        bool("minified", "")
    )

    ktx_error_code_e(
        "PrintKTX2InfoJSONForNamedFile",
        "",

        charUTF8.const.p.const("filename", ""),
        ktx_uint32_t("base_indent", ""),
        ktx_uint32_t("indent_width", ""),
        bool("minified", "")
    )

    ktx_error_code_e(
        "PrintKTX2InfoJSONForStream",
        "",

        ktxStream.p("stream", ""),
        ktx_uint32_t("base_indent", ""),
        ktx_uint32_t("indent_width", ""),
        bool("minified", "")
    )

    /*void(
        "Texture_Destroy",
        "",

        ktxTexture.p("This", "")
    )

    ktx_error_code_e(
        "Texture_GetImageOffset",
        "",

        ktxTexture.p("This", ""),
        ktx_uint32_t("level", ""),
        ktx_uint32_t("layer", ""),
        ktx_uint32_t("faceSlice", ""),
        Check(1)..ktx_size_t.p("pOffset", "")
    )

    ktx_size_t(
        "Texture_GetDataSizeUncompressed",
        "",

        ktxTexture.p("This", "")
    )

    ktx_size_t(
        "Texture_GetImageSize",
        "",

        ktxTexture.p("This", ""),
        ktx_uint32_t("level", "")
    )

    ktx_error_code_e(
        "Texture_IterateLevels",
        "",

        ktxTexture.p("This", ""),
        PFNKTXITERCB("iterCb", ""),
        nullable..opaque_p("userdata", "")
    )

    ktx_error_code_e(
        "Texture_IterateLoadLevelFaces",
        "",

        ktxTexture.p("This", ""),
        PFNKTXITERCB("iterCb", ""),
        nullable..opaque_p("userdata", "")
    )

    ktx_error_code_e(
        "Texture_LoadImageDAta",
        "",

        ktxTexture.p("This", ""),
        ktx_uint8_t.p("pBuffer", ""),
        AutoSize("pBuffer")..ktx_size_t("bufSize", "")
    )

    ktx_bool_t(
        "Texture_NeedsTranscoding",
        "",

        ktxTexture.p("This", "")
    )

    ktx_error_code_e(
        "Texture_SetImageFromMemory",
        "",

        ktxTexture.p("This", ""),
        ktx_uint32_t("level", ""),
        ktx_uint32_t("layer", ""),
        ktx_uint32_t("faceSlice", ""),
        ktx_uint8_t.const.p("src", ""),
        AutoSize("src")..ktx_size_t("srcSize", "")
    )

    ktx_error_code_e(
        "Texture_WriteToNamedFiled",
        "",

        ktxTexture.p("This", ""),
        charUTF8.const.p.const("dstname", "")
    )

    ktx_error_code_e(
        "Texture_WriteToMemory",
        "",

        ktxTexture.p("This", ""),
        Check(1)..ktx_uint8_t.p.p("bytes", ""),
        Check(1)..ktx_size_t.p("size", "")
    )

    ktx_error_code_e(
        "Texture_WriteToStream",
        "",

        ktxTexture.p("This", ""),
        _ktxStream.p("dststr", "")
    )
     */

    customMethod("""
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
    }""")

}
