/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ktx.templates

import org.lwjgl.generator.*
import ktx.*

val ktx = "KTX".nativeClass(Module.KTX, prefix = "KTX", binding = KTX_BINDING) {
    StringConstant("ANIMDATA_KEY".."KTXanimData")
    StringConstant("ORIENTATION_KEY".."KTXorientation")
    StringConstant("SWIZZLE_KEY".."KTXswizzle")
    StringConstant("WRITER_KEY".."KTXwriter")
    StringConstant("WRITER_SCPARAMS_KEY".."KTXwriterScParams")
    StringConstant("ORIENTATION1_FMT".."S=%c")
    StringConstant("ORIENTATION2_FMT".."S=%c,T=%c")
    StringConstant("ORIENTATION3_FMT".."S=%c,T=%c,R=%c")

    IntConstant("GL_UNPACK_ALIGNMENT".."4")
    IntConstant("FACESLICE_WHOLE_LEVEL"..0xFFFFFFFF.i)

    IntConstant("TRUE".."1")
    IntConstant("FALSE".."0")

    customMethod("""
    public static final byte[] KTX_IDENTIFIER_REF = {
        (byte)0xAB, (byte)0x4B, (byte)0x54, (byte)0x58,
        (byte)0x20, (byte)0x31, (byte)0x31, (byte)0xBB,
        (byte)0x0D, (byte)0x0A, (byte)0x1A, (byte)0x0A
    };
    """)
    IntConstant("ENDIAN_REF".."0x04030201")
    IntConstant("ENDIAN_REF_REV".."0x01020304")
    IntConstant("HEADER_SIZE".."64")

    EnumConstant(
        "SUCCESS".enum("0"),
        "FILE_DATA_ERROR".enum,
        "FILE_ISPIPE".enum,
        "FILE_OPEN_FAILED".enum,
        "FILE_OVERFLOW".enum,
        "FILE_READ_ERROR".enum,
        "FILE_SEEK_ERROR".enum,
        "FILE_UNEXPECTED_EOF".enum,
        "FILE_WRITE_ERROR".enum,
        "GL_ERROR".enum,
        "INVALID_OPERATION".enum,
        "INVALID_VALUE".enum,
        "NOT_FOUND".enum,
        "OUT_OF_MEMORY".enum,
        "TRANSCODE_FAILED".enum,
        "UNKNOWN_FILE_FORMAT".enum,
        "UNSUPPORTED_TEXTURE_TYPE".enum,
        "UNSUPPORTED_FEATURE".enum,
        "LIBRARY_NOT_LINKED".enum,
        "DECOMPRESS_LENGTH_ERROR".enum,
        "DECOMPRESS_CHECKSUM_ERROR".enum
    )

    EnumConstant(
        "ORIENT_X_LEFT".enum("'l'"),
        "ORIENT_X_RIGHT".enum("'r'")
    )

    EnumConstant(
        "ORIENT_Y_UP".enum("'u'"),
        "ORIENT_Y_DOWN".enum("'d'")
    )

    EnumConstant(
        "ORIENT_Z_IN".enum("'i'"),
        "ORIENT_Z_OUT".enum("'o'")
    )

    EnumConstant(
        "ktxTexture1_c".enum("1"),
        "ktxTexture2_c".enum
    ).noPrefix()

    EnumConstant(
        "SS_NONE".enum("0"),
        "SS_BASIS_LZ".enum,
        "SS_ZSTD".enum,
        "SS_ZLIB".enum,
        "SS_BEGIN_RANGE".enum("KTX_SS_NONE"),
        "SS_END_RANGE".enum("KTX_SS_ZLIB"),
        "SS_BEGIN_VENDOR_RANGE".enum("0x10000"),
        "SS_END_VENDOR_RANGE".enum("0x1ffff"),
        "SS_BEGIN_RESERVED".enum("0x20000")
    )

    EnumConstant(
        "TEXTURE_CREATE_NO_STORAGE".enum("0"),
        "TEXTURE_CREATE_ALLOC_STORAGE".enum
    )

    EnumConstant(
        "TEXTURE_CREATE_NO_FLAGS".enum("0x00"),
        "TEXTURE_CREATE_LOAD_IMAGE_DATA_BIT".enum("0x01"),
        "TEXTURE_CREATE_RAW_KVDATA_BIT".enum("0x02"),
        "TEXTURE_CREATE_SKIP_KVDATA_BIT".enum("0x04"),
        "TEXTURE_CREATE_CHECK_GLTF_BASISU_BIT".enum("0x08")
    )

    EnumConstant(
        "eStreamTypeFile".enum("1"),
        "eStreamTypeMemory".enum,
        "eStreamTypeCustom".enum
    ).noPrefix()

    EnumConstant(
        "PACK_UASTC_LEVEL_FASTEST".enum("0"),
        "PACK_UASTC_LEVEL_FASTER".enum,
        "PACK_UASTC_LEVEL_DEFAULT".enum,
        "PACK_UASTC_LEVEL_SLOWER".enum,
        "PACK_UASTC_LEVEL_VERYSLOW".enum,
        "PACK_UASTC_MAX_LEVEL".enum("KTX_PACK_UASTC_LEVEL_VERYSLOW"),
        "PACK_UASTC_LEVEL_MASK".enum("0xF"),
        "PACK_UASTC_FAVOR_UASTC_ERROR".enum("8"),
        "PACK_UASTC_FAVOR_BC7_ERROR".enum("16"),
        "PACK_UASTC_ETC1_FASTER_HINTS".enum("64"),
        "PACK_UASTC_ETC1_FASTEST_HINTS".enum("128"),
        "PACK_UASTC__ETC1_DISABLE_FLIP_AND_INDIVIDUAL".enum("256")
    )

    EnumConstant(
        "PACK_ASTC_QUALITY_LEVEL_FASTEST".enum("0"),
        "PACK_ASTC_QUALITY_LEVEL_FAST".enum("10"),
        "PACK_ASTC_QUALITY_LEVEL_MEDIUM".enum("60"),
        "PACK_ASTC_QUALITY_LEVEL_THOROUGH".enum("98"),
        "PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE".enum("100"),
        "PACK_ASTC_QUALITY_LEVEL_MAX".enum("KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE")
    )

    EnumConstant(
        "PACK_ASTC_BLOCK_DIMENSION_4x4".enum("0"),
        "PACK_ASTC_BLOCK_DIMENSION_5x4".enum,
        "PACK_ASTC_BLOCK_DIMENSION_5x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_6x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_6x6".enum,
        "PACK_ASTC_BLOCK_DIMENSION_8x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_8x6".enum,
        "PACK_ASTC_BLOCK_DIMENSION_10x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_10x6".enum,
        "PACK_ASTC_BLOCK_DIMENSION_8x8".enum,
        "PACK_ASTC_BLOCK_DIMENSION_10x8".enum,
        "PACK_ASTC_BLOCK_DIMENSION_10x10".enum,
        "PACK_ASTC_BLOCK_DIMENSION_12x10".enum,
        "PACK_ASTC_BLOCK_DIMENSION_12x12".enum,
        "PACK_ASTC_BLOCK_DIMENSION_3x3x3".enum,
        "PACK_ASTC_BLOCK_DIMENSION_4x3x3".enum,
        "PACK_ASTC_BLOCK_DIMENSION_4x4x3".enum,
        "PACK_ASTC_BLOCK_DIMENSION_4x4x4".enum,
        "PACK_ASTC_BLOCK_DIMENSION_5x4x4".enum,
        "PACK_ASTC_BLOCK_DIMENSION_5x5x4".enum,
        "PACK_ASTC_BLOCK_DIMENSION_5x5x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_6x5x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_6x6x5".enum,
        "PACK_ASTC_BLOCK_DIMENSION_6x6x6".enum,
        "PACK_ASTC_BLOCK_DIMENSION_MAX".enum("KTX_PACK_ASTC_BLOCK_DIMENSION_6x6x6")
    )

    EnumConstant(
        "PACK_ASTC_ENCODER_MODE_DEFAULT".enum("0"),
        "PACK_ASTC_ENCODER_MODE_LDR".enum,
        "PACK_ASTC_ENCODER_MODE_HDR".enum,
        "PACK_ASTC_ENCODER_MODE_MAX".enum("KTX_PACK_ASTC_ENCODER_MODE_HDR")
    )

    EnumConstant(
        "TTF_ETC1_RGB".enum("0"),
        "TTF_ETC2_RGBA".enum,
        "TTF_BC1_RGB".enum,
        "TTF_BC3_RGBA".enum,
        "TTF_BC4_R".enum,
        "TTF_BC5_RG".enum,
        "TTF_BC7_RGBA".enum,
        "TTF_PVRTC1_4_RGB".enum("8"),
        "TTF_PVRTC1_4_RGBA".enum,
        "TTF_ASTC_4x4_RGBA".enum,
        "TTF_PVRTC2_4_RGB".enum("18"),
        "TTF_PVRTC2_4_RGBA".enum,
        "TTF_ETC2_EAC_R11".enum,
        "TTF_ETC2_EAC_RG11".enum,
        "TTF_RGBA32".enum("13"),
        "TTF_RGB565".enum,
        "TTF_BGR565".enum,
        "TTF_RGBA4444".enum,
        "TTF_ETC".enum("22"),
        "TTF_BC1_OR_3".enum,
        "TTF_NOSELECTION".enum(0x7fffffff)
    )

    EnumConstant(
        "TF_PVRTC_DECODE_TO_NEXT_POW2".enum("2"),
        "TF_TRANSCODE_ALPHA_DATA_TO_OPAQUE_FORMATS".enum("4"),
        "TF_HIGH_QUALITY".enum("32")
    )

    IgnoreMissing..ktx_error_code_e(
        "LoadOpenGL",

        "PFNGLGETPROCADDRESS".handle("pfnGLGetProcAddress")
    )

    /*ktx_error_code_e(
        "Texture_CreateFromStdioStream",
        "These four create a ktxTexture1 or ktxTexture2 according to the data header, and return a pointer to the base ktxTexture class.",

        "FILE".opaque.p("stdioStream"),
        ktxTextureCreateFlags("createFlags"),
        ktxTexture.p.p("newTex")
    )*/

    ktx_error_code_e(
        "Texture_CreateFromNamedFile",

        charUTF8.const.p.const("filename"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture_CreateFromMemory",

        ktx_uint8_t.const.p("bytes"),
        AutoSize("bytes")..ktx_size_t("size"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture_CreateFromStream",

        ktxStream.p("stream"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture.p.p("newTex")
    )

    MapPointer("ktxTexture_GetDataSize(This)")..ktx_uint8_t.p(
        "Texture_GetData",

        ktxTexture.p("This")
    )

    ktx_uint32_t(
        "Texture_GetRowPitch",

        ktxTexture.p("This"),
        ktx_uint32_t("level")
    )

    ktx_uint32_t(
        "Texture_GetElementSize",

        ktxTexture.p("This")
    )

    ktx_size_t(
        "Texture_GetDataSize",

        ktxTexture.p("This")
    )

    ktx_error_code_e(
        "Texture_GLUpload",

        ktxTexture.p("This"),
        Check(1)..GLuint.p("pTexture"),
        Check(1)..GLenum.p("pTarget"),
        Check(1)..GLenum.p("pGlerror")
    )

    ktx_error_code_e(
        "Texture_IterateLevelFaces",

        ktxTexture.p("This"),
        PFNKTXITERCB("iterCb"),
        nullable..opaque_p("userdata")
    )

    ktx_error_code_e(
        "Texture1_Create",

        ktxTextureCreateInfo.const.p.const("createInfo"),
        ktxTextureCreateStorageEnum("storageAllocation"),
        Check(1)..ktxTexture1.p.p("newTex")
    )

    /*ktx_error_code_e(
        "Texture1_CreateFromStdioStream",
        "These four create a ktxTexture1 provided the data is in KTX format.",

        "FILE".opaque.p("stdioStream"),
        ktxTextureCreateFlags("createFlags"),
        ktxTexture1.p.p("newTex")
    )*/

    ktx_error_code_e(
        "Texture1_CreateFromNamedFile",

        charUTF8.const.p.const("filename"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture1.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture1_CreateFromMemory",

        ktx_uint8_t.const.p("bytes"),
        AutoSize("bytes")..ktx_size_t("size"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture1.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture1_CreateFromStream",

        ktxStream.p("stream"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture1.p.p("newTex")
    )

    IgnoreMissing..void(
        "Texture1_Destroy",

        ktxTexture1.p("This")
    )

    ktx_bool_t(
        "Texture1_NeedsTranscoding",

        ktxTexture1.p("This")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_LoadImageData",

        ktxTexture1.p("This"),
        ktx_uint8_t.p("pBuffer"),
        AutoSize("pBuffer")..ktx_size_t("bufSize")
    )

    /*ktx_error_code_e(
        "Texture1_WriteToStdioStream",

        ktxTexture1.p("This"),
        "FILE".opaque.p("dstsstr")
    )*/

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteToNamedFile",

        ktxTexture1.p("This"),
        charUTF8.const.p.const("dstname")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteToMemory",

        ktxTexture1.p("This"),
        Check(1)..ktx_uint8_t.p.p("bytes"),
        Check(1)..ktx_size_t.p("size")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteToStream",

        ktxTexture1.p("This"),
        ktxStream.p("dststr")
    )

    /*ktx_error_code_e(
        "Texture1_WriteKTX2ToStdioStream",
        "Write a {@code ktxTexture} object to a stdio stream in KTX format.",

        ktxTexture1.p("This"),
        "FILE".opaque.p("dstsstr")
    )*/

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteKTX2ToNamedFile",

        ktxTexture1.p("This"),
        charUTF8.const.p.const("dstname")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteKTX2ToMemory",

        ktxTexture1.p("This"),
        Check(1)..ktx_uint8_t.p.p("bytes"),
        Check(1)..ktx_size_t.p("size")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture1_WriteKTX2ToStream",

        ktxTexture1.p("This"),
        ktxStream.p("dststr")
    )

    ktx_error_code_e(
        "Texture2_Create",

        ktxTextureCreateInfo.const.p.const("createInfo"),
        ktxTextureCreateStorageEnum("storageAllocation"),
        Check(1)..ktxTexture2.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture2_CreateCopy",

        ktxTexture2.p("orig"),
        Check(1)..ktxTexture2.p.p("newTex")
    )

    /*ktx_error_code_e(
        "Texture2_CreateFromStdioStream",
        "These four create a ktxTexture2 provided the data is in KTX2 format.",

        "FILE".opaque.p("stdioStream"),
        ktxTextureCreateFlags("createFlags"),
        ktxTexture2.p.p("newTex")
    )*/

    ktx_error_code_e(
        "Texture2_CreateFromNamedFile",

        charUTF8.const.p.const("filename"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture2.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture2_CreateFromMemory",

        ktx_uint8_t.const.p("bytes"),
        AutoSize("bytes")..ktx_size_t("size"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture2.p.p("newTex")
    )

    ktx_error_code_e(
        "Texture2_CreateFromStream",

        ktxStream.p("stream"),
        ktxTextureCreateFlags("createFlags"),
        Check(1)..ktxTexture2.p.p("newTex")
    )

    IgnoreMissing..void(
        "Texture2_Destroy",

        ktxTexture2.p("This")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressBasis",

        ktxTexture2.p("This"),
        ktx_uint32_t("quality")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_DeflateZstd",

        ktxTexture2.p("This"),
        ktx_uint32_t("level")
    )

    ktx_error_code_e(
        "Texture2_DeflateZLIB",

        ktxTexture2.p("This"),
        ktx_uint32_t("level")
    )

    void(
        "Texture2_GetComponentInfo",

        ktxTexture2.p("This"),
        Check(1)..ktx_uint32_t.p("numComponents"),
        Check(1)..ktx_uint32_t.p("componentByteLength")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_GetImageOffset",

        ktxTexture2.p("This"),
        ktx_uint32_t("level"),
        ktx_uint32_t("layer"),
        ktx_uint32_t("faceSlice"),
        Check(1)..ktx_size_t.p("pOffset")
    )

    ktx_uint32_t(
        "Texture2_GetNumComponents",

        ktxTexture2.p("This")
    )

    IgnoreMissing..khr_df_transfer_e(
        "Texture2_GetTransferFunction_e",

        ktxTexture2.p("This")
    )

    khr_df_transfer_e(
        "Texture2_GetOETF_e",

        ktxTexture2.p("This")
    )

    ktx_uint32_t(
        "Texture2_GetOETF",

        ktxTexture2.p("This")
    )

    khr_df_model_e(
        "Texture2_GetColorModel_e",

        ktxTexture2.p("This")
    )

    ktx_bool_t(
        "Texture2_GetPremultipliedAlpha",

        ktxTexture2.p("This")
    )

    IgnoreMissing..khr_df_primaries_e(
        "Texture2_GetPrimaries_e",

        ktxTexture2.p("This")
    )

    ktx_bool_t(
        "Texture2_NeedsTranscoding",

        ktxTexture2.p("This")
    )

//    ktx_error_code_e ktxTexture2_SetTransferFunction(ktxTexture2* This, khr_df_transfer_e tf);
//    ktx_error_code_e ktxTexture2_SetOETF(ktxTexture2* This, khr_df_transfer_e oetf);
//    ktx_error_code_e ktxTexture2_SetPrimaries(ktxTexture2* This, khr_df_primaries_e primaries);
//    ktx_error_code_e ktxTexture2_LoadImageData(ktxTexture2* This, ktx_uint8_t* pBuffer, ktx_size_t bufSize);
//    ktx_error_code_e ktxTexture2_LoadDeflatedImageData(ktxTexture2* This, ktx_uint8_t* pBuffer, ktx_size_t bufSize);

    ktx_error_code_e(
        "Texture2_SetTransferFunction",

        ktxTexture2.p("This"),
        khr_df_transfer_e("tf")
    )

    ktx_error_code_e(
        "Texture2_SetOETF",

        ktxTexture2.p("This"),
        khr_df_transfer_e("oetf")
    )

    ktx_error_code_e(
        "Texture2_SetPrimaries",

        ktxTexture2.p("This"),
        khr_df_primaries_e("primaries")
    )

    ktx_error_code_e(
        "Texture2_LoadImageData",

        ktxTexture2.p("This"),
        ktx_uint8_t.p("pBuffer"),
        AutoSize("pBuffer")..ktx_size_t("bufSize")
    )

    ktx_error_code_e(
        "Texture2_LoadDeflatedImageData",

        ktxTexture2.p("This"),
        ktx_uint8_t.p("pBuffer"),
        AutoSize("pBuffer")..ktx_size_t("bufSize")
    )

    /*ktx_error_code_e(
        "Texture2_WriteToStdioStream",

        ktxTexture2.p("This"),
        "FILE".opaque.p("dstsstr")
    )*/

    ktx_error_code_e(
        "Texture2_WriteToNamedFile",

        ktxTexture2.p("This"),
        charUTF8.const.p.const("dstname")
    )

    ktx_error_code_e(
        "Texture2_WriteToMemory",

        ktxTexture2.p("This"),
        Check(1)..ktx_uint8_t.p.p("bytes"),
        Check(1)..ktx_size_t.p("size")
    )

    ktx_error_code_e(
        "Texture2_WriteToStream",

        ktxTexture2.p("This"),
        ktxStream.p("dststr")
    )

    customMethod("""
    public static final int KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL;
    static {
        long p = KTX.getFunctionAddress("KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL");
        KTX_ETC1S_DEFAULT_COMPRESSION_LEVEL = p == NULL ? 0 : memGetInt(p);
    }""")

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressAstcEx",

        ktxTexture2.p("This"),
        ktxAstcParams.p("params")
    )

    ktx_error_code_e(
        "Texture2_DecodeAstc",

        ktxTexture2.p("This")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressAstc",

        ktxTexture2.p("This"),
        ktx_uint32_t("quality")
    )

    IgnoreMissing..ktx_error_code_e(
        "Texture2_CompressBasisEx",

        ktxTexture2.p("This"),
        ktxBasisParams.p("params")
    )

    ktx_error_code_e(
        "Texture2_TranscodeBasis",

        ktxTexture2.p("This"),
        ktx_transcode_fmt_e("fmt"),
        ktx_transcode_flags("transcodeFlags")
    )

    charASCII.const.p(
        "ErrorString",

        ktx_error_code_e("error")
    )

    charASCII.const.p(
        "SupercompressionSchemeString",

        ktxSupercmpScheme("scheme")
    )

    charASCII.const.p(
        "TranscodeFormatString",

        ktx_transcode_fmt_e("format")
    )

    ktx_error_code_e(
        "HashList_Create",

        Check(1)..ktxHashList_p.p("ppHl")
    )

    ktx_error_code_e(
        "HashList_CreateCopy",

        Check(1)..ktxHashList_p.p("ppHl"),
        ktxHashList("orig")
    )

    void(
        "HashList_Construct",

        ktxHashList_p("pHl")
    )

    void(
        "HashList_ConstructCopy",

        ktxHashList_p("pHl"),
        ktxHashList("orig")
    )

    void(
        "HashList_Destroy",

        ktxHashList_p("head")
    )

    void(
        "HashList_Destruct",

        ktxHashList_p("head")
    )

    ktx_error_code_e(
        "HashList_AddKVPair",

        ktxHashList_p("pHead"),
        charUTF8.const.p("key"),
        AutoSize("value")..unsigned_int("valueLen"),
        void.const.p("value")
    )

    ktx_error_code_e(
        "HashList_DeleteEntry",

        ktxHashList_p("pHead"),
        ktxHashListEntry.p("pEntry")
    )

    ktx_error_code_e(
        "HashList_DeleteKVPair",

        ktxHashList_p("pHead"),
        charUTF8.const.p("key")
    )

    ktx_error_code_e(
        "HashList_FindEntry",

        ktxHashList_p("pHead"),
        charUTF8.const.p("key"),
        Check(1)..ktxHashListEntry.p.p("ppEntry")
    )

    ktx_error_code_e(
        "HashList_FindValue",

        ktxHashList_p("pHead"),
        charUTF8.const.p("key"),
        Check(1)..unsigned_int.p("pValueLen"),
        Check(1)..void.p.p("pValue")
    )

    ktxHashListEntry.p(
        "HashList_Next",

        ktxHashListEntry.p("entry")
    )

    ktx_error_code_e(
        "HashList_Sort",

        ktxHashList_p("pHead")
    )

    ktx_error_code_e(
        "HashList_Serialize",

        ktxHashList_p("pHead"),
        Check(1)..unsigned_int.p("kvdLen"),
        Check(1)..unsigned_char.p.p("kvd")
    )

    ktx_error_code_e(
        "HashList_Deserialize",

        ktxHashList_p("pHead"),
        AutoSize("kvd")..unsigned_int("kvdLen"),
        void.p("kvd")
    )

    ktx_error_code_e(
        "HashListEntry_GetKey",

        ktxHashListEntry.p("This"),
        Check(1)..unsigned_int.p("pKeyLen"),
        Check(1)..char.p.p("ppKey")
    )

    ktx_error_code_e(
        "HashListEntry_GetValue",

        ktxHashListEntry.p("This"),
        Check(1)..unsigned_int.p("pValueLen"),
        Check(1)..void.p.p("ppValue")
    )

    /*ktx_error_code_e(
        "PrintInfoForStdioStream",

        "FILE".opaque.p("stdioStream")
    )*/

    ktx_error_code_e(
        "PrintInfoForNamedFile",

        charUTF8.const.p.const("filename")
    )

    ktx_error_code_e(
        "PrintInfoForMemory",

        ktx_uint8_t.const.p("bytes"),
        AutoSize("bytes")..ktx_size_t("size")
    )

    ktx_error_code_e(
        "PrintKTX2InfoTextForMemory",

        ktx_uint8_t.const.p("bytes"),
        AutoSize("bytes")..ktx_size_t("size")
    )

    ktx_error_code_e(
        "PrintKTX2InfoTextForNamedFile",

        charUTF8.const.p.const("filename")
    )

    ktx_error_code_e(
        "PrintKTX2InfoTextForStream",

        ktxStream.p("stream")
    )

    ktx_error_code_e(
        "PrintKTX2InfoJSONForMemory",

        ktx_uint8_t.const.p("bytes"),
        AutoSize("bytes")..ktx_size_t("size"),
        ktx_uint32_t("base_indent"),
        ktx_uint32_t("indent_width"),
        bool("minified")
    )

    ktx_error_code_e(
        "PrintKTX2InfoJSONForNamedFile",

        charUTF8.const.p.const("filename"),
        ktx_uint32_t("base_indent"),
        ktx_uint32_t("indent_width"),
        bool("minified")
    )

    ktx_error_code_e(
        "PrintKTX2InfoJSONForStream",

        ktxStream.p("stream"),
        ktx_uint32_t("base_indent"),
        ktx_uint32_t("indent_width"),
        bool("minified")
    )

    /*void(
        "Texture_Destroy",

        ktxTexture.p("This")
    )

    ktx_error_code_e(
        "Texture_GetImageOffset",

        ktxTexture.p("This"),
        ktx_uint32_t("level"),
        ktx_uint32_t("layer"),
        ktx_uint32_t("faceSlice"),
        Check(1)..ktx_size_t.p("pOffset")
    )

    ktx_size_t(
        "Texture_GetDataSizeUncompressed",

        ktxTexture.p("This")
    )

    ktx_size_t(
        "Texture_GetImageSize",

        ktxTexture.p("This"),
        ktx_uint32_t("level")
    )

    ktx_size_t(
        "Texture_GetLevelSize",

        ktxTexture.p("This"),
        ktx_uint32_t("level")
    )

    ktx_error_code_e(
        "Texture_IterateLevels",

        ktxTexture.p("This"),
        PFNKTXITERCB("iterCb"),
        nullable..opaque_p("userdata")
    )

    ktx_error_code_e(
        "Texture_IterateLoadLevelFaces",

        ktxTexture.p("This"),
        PFNKTXITERCB("iterCb"),
        nullable..opaque_p("userdata")
    )

    ktx_error_code_e(
        "Texture_LoadImageDAta",

        ktxTexture.p("This"),
        ktx_uint8_t.p("pBuffer"),
        AutoSize("pBuffer")..ktx_size_t("bufSize")
    )

    ktx_bool_t(
        "Texture_NeedsTranscoding",

        ktxTexture.p("This")
    )

    ktx_error_code_e(
        "Texture_SetImageFromMemory",

        ktxTexture.p("This"),
        ktx_uint32_t("level"),
        ktx_uint32_t("layer"),
        ktx_uint32_t("faceSlice"),
        ktx_uint8_t.const.p("src"),
        AutoSize("src")..ktx_size_t("srcSize")
    )

    ktx_error_code_e(
        "Texture_WriteToNamedFiled",

        ktxTexture.p("This"),
        charUTF8.const.p.const("dstname")
    )

    ktx_error_code_e(
        "Texture_WriteToMemory",

        ktxTexture.p("This"),
        Check(1)..ktx_uint8_t.p.p("bytes"),
        Check(1)..ktx_size_t.p("size")
    )

    ktx_error_code_e(
        "Texture_WriteToStream",

        ktxTexture.p("This"),
        _ktxStream.p("dststr")
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

    @NativeType("ktx_size_t")
    public static long ktxTexture_GetLevelSize(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint32_t") int level) {
        return callPP(This.address(), level, This.vtbl().GetLevelSize());
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
