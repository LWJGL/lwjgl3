/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    public static final int KTX_FACESLICE_WHOLE_LEVEL = 0xFFFFFFFF;

    public static final int KTX_TRUE = 1;

    public static final int KTX_FALSE = 0;

    public static final int KTX_ENDIAN_REF = 0x04030201;

    public static final int KTX_ENDIAN_REF_REV = 0x01020304;

    public static final int KTX_HEADER_SIZE = 64;

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

    public static final int
        KTX_ORIENT_X_LEFT  = 'l',
        KTX_ORIENT_X_RIGHT = 'r';

    public static final int
        KTX_ORIENT_Y_UP   = 'u',
        KTX_ORIENT_Y_DOWN = 'd';

    public static final int
        KTX_ORIENT_Z_IN  = 'i',
        KTX_ORIENT_Z_OUT = 'o';

    public static final int
        ktxTexture1_c = 1,
        ktxTexture2_c = 2;

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

    public static final int
        KTX_TEXTURE_CREATE_NO_STORAGE    = 0,
        KTX_TEXTURE_CREATE_ALLOC_STORAGE = 1;

    public static final int
        KTX_TEXTURE_CREATE_NO_FLAGS              = 0x00,
        KTX_TEXTURE_CREATE_LOAD_IMAGE_DATA_BIT   = 0x01,
        KTX_TEXTURE_CREATE_RAW_KVDATA_BIT        = 0x02,
        KTX_TEXTURE_CREATE_SKIP_KVDATA_BIT       = 0x04,
        KTX_TEXTURE_CREATE_CHECK_GLTF_BASISU_BIT = 0x08;

    public static final int
        eStreamTypeFile   = 1,
        eStreamTypeMemory = 2,
        eStreamTypeCustom = 3;

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

    public static final int
        KTX_PACK_ASTC_QUALITY_LEVEL_FASTEST    = 0,
        KTX_PACK_ASTC_QUALITY_LEVEL_FAST       = 10,
        KTX_PACK_ASTC_QUALITY_LEVEL_MEDIUM     = 60,
        KTX_PACK_ASTC_QUALITY_LEVEL_THOROUGH   = 98,
        KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE = 100,
        KTX_PACK_ASTC_QUALITY_LEVEL_MAX        = KTX_PACK_ASTC_QUALITY_LEVEL_EXHAUSTIVE;

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

    public static final int
        KTX_PACK_ASTC_ENCODER_MODE_DEFAULT = 0,
        KTX_PACK_ASTC_ENCODER_MODE_LDR     = 1,
        KTX_PACK_ASTC_ENCODER_MODE_HDR     = 2,
        KTX_PACK_ASTC_ENCODER_MODE_MAX     = KTX_PACK_ASTC_ENCODER_MODE_HDR;

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

    public static final int
        KTX_TF_PVRTC_DECODE_TO_NEXT_POW2              = 2,
        KTX_TF_TRANSCODE_ALPHA_DATA_TO_OPAQUE_FORMATS = 4,
        KTX_TF_HIGH_QUALITY                           = 32;

    protected KTX() {
        throw new UnsupportedOperationException();
    }

    // --- [ ktxTexture_CreateFromNamedFile ] ---

    /** {@code KTX_error_code ktxTexture_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
    public static int nktxTexture_CreateFromNamedFile(long filename, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture_CreateFromNamedFile;
        return callPPI(filename, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            checkNT1(filename);
            check(newTex, 1);
        }
        return nktxTexture_CreateFromNamedFile(memAddress(filename), createFlags, memAddress(newTex));
    }

    /** {@code KTX_error_code ktxTexture_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
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

    /** {@code KTX_error_code ktxTexture_CreateFromMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
    public static int nktxTexture_CreateFromMemory(long bytes, long size, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture_CreateFromMemory;
        return callPPPI(bytes, size, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_CreateFromMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture_CreateFromMemory(memAddress(bytes), bytes.remaining(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture_CreateFromStream ] ---

    /** {@code KTX_error_code ktxTexture_CreateFromStream(struct ktxStream * stream, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
    public static int nktxTexture_CreateFromStream(long stream, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture_CreateFromStream;
        return callPPI(stream, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_CreateFromStream(struct ktxStream * stream, ktxTextureCreateFlags createFlags, ktxTexture ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_CreateFromStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture_CreateFromStream(stream.address(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture_GetData ] ---

    /** {@code ktx_uint8_t * ktxTexture_GetData(ktxTexture * This)} */
    public static long nktxTexture_GetData(long This) {
        long __functionAddress = Functions.Texture_GetData;
        return callPP(This, __functionAddress);
    }

    /** {@code ktx_uint8_t * ktxTexture_GetData(ktxTexture * This)} */
    @NativeType("ktx_uint8_t *")
    public static @Nullable ByteBuffer ktxTexture_GetData(@NativeType("ktxTexture *") ktxTexture This) {
        long __result = nktxTexture_GetData(This.address());
        return memByteBufferSafe(__result, (int)ktxTexture_GetDataSize(This));
    }

    /** {@code ktx_uint8_t * ktxTexture_GetData(ktxTexture * This)} */
    @NativeType("ktx_uint8_t *")
    public static @Nullable ByteBuffer ktxTexture_GetData(@NativeType("ktxTexture *") ktxTexture This, long length) {
        long __result = nktxTexture_GetData(This.address());
        return memByteBufferSafe(__result, (int)length);
    }

    // --- [ ktxTexture_GetRowPitch ] ---

    /** {@code ktx_uint32_t ktxTexture_GetRowPitch(ktxTexture * This, ktx_uint32_t level)} */
    public static int nktxTexture_GetRowPitch(long This, int level) {
        long __functionAddress = Functions.Texture_GetRowPitch;
        return callPI(This, level, __functionAddress);
    }

    /** {@code ktx_uint32_t ktxTexture_GetRowPitch(ktxTexture * This, ktx_uint32_t level)} */
    @NativeType("ktx_uint32_t")
    public static int ktxTexture_GetRowPitch(@NativeType("ktxTexture *") ktxTexture This, @NativeType("ktx_uint32_t") int level) {
        return nktxTexture_GetRowPitch(This.address(), level);
    }

    // --- [ ktxTexture_GetElementSize ] ---

    /** {@code ktx_uint32_t ktxTexture_GetElementSize(ktxTexture * This)} */
    public static int nktxTexture_GetElementSize(long This) {
        long __functionAddress = Functions.Texture_GetElementSize;
        return callPI(This, __functionAddress);
    }

    /** {@code ktx_uint32_t ktxTexture_GetElementSize(ktxTexture * This)} */
    @NativeType("ktx_uint32_t")
    public static int ktxTexture_GetElementSize(@NativeType("ktxTexture *") ktxTexture This) {
        return nktxTexture_GetElementSize(This.address());
    }

    // --- [ ktxTexture_GetDataSize ] ---

    /** {@code ktx_size_t ktxTexture_GetDataSize(ktxTexture * This)} */
    public static long nktxTexture_GetDataSize(long This) {
        long __functionAddress = Functions.Texture_GetDataSize;
        return callPP(This, __functionAddress);
    }

    /** {@code ktx_size_t ktxTexture_GetDataSize(ktxTexture * This)} */
    @NativeType("ktx_size_t")
    public static long ktxTexture_GetDataSize(@NativeType("ktxTexture *") ktxTexture This) {
        return nktxTexture_GetDataSize(This.address());
    }

    // --- [ ktxTexture_GLUpload ] ---

    /** {@code KTX_error_code ktxTexture_GLUpload(ktxTexture * This, GLuint * pTexture, GLenum * pTarget, GLenum * pGlerror)} */
    public static int nktxTexture_GLUpload(long This, long pTexture, long pTarget, long pGlerror) {
        long __functionAddress = Functions.Texture_GLUpload;
        return callPPPPI(This, pTexture, pTarget, pGlerror, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_GLUpload(ktxTexture * This, GLuint * pTexture, GLenum * pTarget, GLenum * pGlerror)} */
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

    /** {@code KTX_error_code ktxTexture_IterateLevelFaces(ktxTexture * This, PFNKTXITERCB iterCb, void * userdata)} */
    public static int nktxTexture_IterateLevelFaces(long This, long iterCb, long userdata) {
        long __functionAddress = Functions.Texture_IterateLevelFaces;
        return callPPPI(This, iterCb, userdata, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture_IterateLevelFaces(ktxTexture * This, PFNKTXITERCB iterCb, void * userdata)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture_IterateLevelFaces(@NativeType("ktxTexture *") ktxTexture This, @NativeType("PFNKTXITERCB") PFNKTXITERCBI iterCb, @NativeType("void *") long userdata) {
        return nktxTexture_IterateLevelFaces(This.address(), iterCb.address(), userdata);
    }

    // --- [ ktxTexture1_Create ] ---

    /** {@code KTX_error_code ktxTexture1_Create(ktxTextureCreateInfo * createInfo, ktxTextureCreateStorageEnum storageAllocation, ktxTexture1 ** newTex)} */
    public static int nktxTexture1_Create(long createInfo, int storageAllocation, long newTex) {
        long __functionAddress = Functions.Texture1_Create;
        return callPPI(createInfo, storageAllocation, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_Create(ktxTextureCreateInfo * createInfo, ktxTextureCreateStorageEnum storageAllocation, ktxTexture1 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_Create(@NativeType("ktxTextureCreateInfo *") ktxTextureCreateInfo createInfo, @NativeType("ktxTextureCreateStorageEnum") int storageAllocation, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture1_Create(createInfo.address(), storageAllocation, memAddress(newTex));
    }

    // --- [ ktxTexture1_CreateFromNamedFile ] ---

    /** {@code KTX_error_code ktxTexture1_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
    public static int nktxTexture1_CreateFromNamedFile(long filename, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture1_CreateFromNamedFile;
        return callPPI(filename, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            checkNT1(filename);
            check(newTex, 1);
        }
        return nktxTexture1_CreateFromNamedFile(memAddress(filename), createFlags, memAddress(newTex));
    }

    /** {@code KTX_error_code ktxTexture1_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
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

    /** {@code KTX_error_code ktxTexture1_CreateFromMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
    public static int nktxTexture1_CreateFromMemory(long bytes, long size, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture1_CreateFromMemory;
        return callPPPI(bytes, size, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_CreateFromMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture1_CreateFromMemory(memAddress(bytes), bytes.remaining(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture1_CreateFromStream ] ---

    /** {@code KTX_error_code ktxTexture1_CreateFromStream(struct ktxStream * stream, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
    public static int nktxTexture1_CreateFromStream(long stream, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture1_CreateFromStream;
        return callPPI(stream, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_CreateFromStream(struct ktxStream * stream, ktxTextureCreateFlags createFlags, ktxTexture1 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_CreateFromStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture1 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture1_CreateFromStream(stream.address(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture1_NeedsTranscoding ] ---

    /** {@code ktx_bool_t ktxTexture1_NeedsTranscoding(ktxTexture1 * This)} */
    public static boolean nktxTexture1_NeedsTranscoding(long This) {
        long __functionAddress = Functions.Texture1_NeedsTranscoding;
        return callPZ(This, __functionAddress);
    }

    /** {@code ktx_bool_t ktxTexture1_NeedsTranscoding(ktxTexture1 * This)} */
    @NativeType("ktx_bool_t")
    public static boolean ktxTexture1_NeedsTranscoding(@NativeType("ktxTexture1 *") ktxTexture1 This) {
        return nktxTexture1_NeedsTranscoding(This.address());
    }

    // --- [ ktxTexture1_WriteKTX2ToNamedFile ] ---

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToNamedFile(ktxTexture1 * This, char const * const dstname)} */
    public static int nktxTexture1_WriteKTX2ToNamedFile(long This, long dstname) {
        long __functionAddress = Functions.Texture1_WriteKTX2ToNamedFile;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, dstname, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToNamedFile(ktxTexture1 * This, char const * const dstname)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToNamedFile(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("char const * const") ByteBuffer dstname) {
        if (CHECKS) {
            checkNT1(dstname);
        }
        return nktxTexture1_WriteKTX2ToNamedFile(This.address(), memAddress(dstname));
    }

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToNamedFile(ktxTexture1 * This, char const * const dstname)} */
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

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToMemory(ktxTexture1 * This, ktx_uint8_t ** bytes, ktx_size_t * size)} */
    public static int nktxTexture1_WriteKTX2ToMemory(long This, long bytes, long size) {
        long __functionAddress = Functions.Texture1_WriteKTX2ToMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(This, bytes, size, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToMemory(ktxTexture1 * This, ktx_uint8_t ** bytes, ktx_size_t * size)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToMemory(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("ktx_uint8_t **") PointerBuffer bytes, @NativeType("ktx_size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(bytes, 1);
            check(size, 1);
        }
        return nktxTexture1_WriteKTX2ToMemory(This.address(), memAddress(bytes), memAddress(size));
    }

    // --- [ ktxTexture1_WriteKTX2ToStream ] ---

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToStream(ktxTexture1 * This, struct ktxStream * dststr)} */
    public static int nktxTexture1_WriteKTX2ToStream(long This, long dststr) {
        long __functionAddress = Functions.Texture1_WriteKTX2ToStream;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, dststr, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture1_WriteKTX2ToStream(ktxTexture1 * This, struct ktxStream * dststr)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture1_WriteKTX2ToStream(@NativeType("ktxTexture1 *") ktxTexture1 This, @NativeType("struct ktxStream *") ktxStream dststr) {
        return nktxTexture1_WriteKTX2ToStream(This.address(), dststr.address());
    }

    // --- [ ktxTexture2_Create ] ---

    /** {@code KTX_error_code ktxTexture2_Create(ktxTextureCreateInfo * createInfo, ktxTextureCreateStorageEnum storageAllocation, ktxTexture2 ** newTex)} */
    public static int nktxTexture2_Create(long createInfo, int storageAllocation, long newTex) {
        long __functionAddress = Functions.Texture2_Create;
        return callPPI(createInfo, storageAllocation, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_Create(ktxTextureCreateInfo * createInfo, ktxTextureCreateStorageEnum storageAllocation, ktxTexture2 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_Create(@NativeType("ktxTextureCreateInfo *") ktxTextureCreateInfo createInfo, @NativeType("ktxTextureCreateStorageEnum") int storageAllocation, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_Create(createInfo.address(), storageAllocation, memAddress(newTex));
    }

    // --- [ ktxTexture2_CreateCopy ] ---

    /** {@code KTX_error_code ktxTexture2_CreateCopy(ktxTexture2 * orig, ktxTexture2 ** newTex)} */
    public static int nktxTexture2_CreateCopy(long orig, long newTex) {
        long __functionAddress = Functions.Texture2_CreateCopy;
        return callPPI(orig, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CreateCopy(ktxTexture2 * orig, ktxTexture2 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateCopy(@NativeType("ktxTexture2 *") ktxTexture2 orig, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_CreateCopy(orig.address(), memAddress(newTex));
    }

    // --- [ ktxTexture2_CreateFromNamedFile ] ---

    /** {@code KTX_error_code ktxTexture2_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
    public static int nktxTexture2_CreateFromNamedFile(long filename, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture2_CreateFromNamedFile;
        return callPPI(filename, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            checkNT1(filename);
            check(newTex, 1);
        }
        return nktxTexture2_CreateFromNamedFile(memAddress(filename), createFlags, memAddress(newTex));
    }

    /** {@code KTX_error_code ktxTexture2_CreateFromNamedFile(char const * const filename, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
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

    /** {@code KTX_error_code ktxTexture2_CreateFromMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
    public static int nktxTexture2_CreateFromMemory(long bytes, long size, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture2_CreateFromMemory;
        return callPPPI(bytes, size, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CreateFromMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_CreateFromMemory(memAddress(bytes), bytes.remaining(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture2_CreateFromStream ] ---

    /** {@code KTX_error_code ktxTexture2_CreateFromStream(struct ktxStream * stream, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
    public static int nktxTexture2_CreateFromStream(long stream, int createFlags, long newTex) {
        long __functionAddress = Functions.Texture2_CreateFromStream;
        return callPPI(stream, createFlags, newTex, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CreateFromStream(struct ktxStream * stream, ktxTextureCreateFlags createFlags, ktxTexture2 ** newTex)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CreateFromStream(@NativeType("struct ktxStream *") ktxStream stream, @NativeType("ktxTextureCreateFlags") int createFlags, @NativeType("ktxTexture2 **") PointerBuffer newTex) {
        if (CHECKS) {
            check(newTex, 1);
        }
        return nktxTexture2_CreateFromStream(stream.address(), createFlags, memAddress(newTex));
    }

    // --- [ ktxTexture2_CompressBasis ] ---

    /** {@code KTX_error_code ktxTexture2_CompressBasis(ktxTexture2 * This, ktx_uint32_t quality)} */
    public static int nktxTexture2_CompressBasis(long This, int quality) {
        long __functionAddress = Functions.Texture2_CompressBasis;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(This, quality, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CompressBasis(ktxTexture2 * This, ktx_uint32_t quality)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressBasis(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int quality) {
        return nktxTexture2_CompressBasis(This.address(), quality);
    }

    // --- [ ktxTexture2_DeflateZstd ] ---

    /** {@code KTX_error_code ktxTexture2_DeflateZstd(ktxTexture2 * This, ktx_uint32_t level)} */
    public static int nktxTexture2_DeflateZstd(long This, int level) {
        long __functionAddress = Functions.Texture2_DeflateZstd;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(This, level, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_DeflateZstd(ktxTexture2 * This, ktx_uint32_t level)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_DeflateZstd(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int level) {
        return nktxTexture2_DeflateZstd(This.address(), level);
    }

    // --- [ ktxTexture2_DeflateZLIB ] ---

    /** {@code KTX_error_code ktxTexture2_DeflateZLIB(ktxTexture2 * This, ktx_uint32_t level)} */
    public static int nktxTexture2_DeflateZLIB(long This, int level) {
        long __functionAddress = Functions.Texture2_DeflateZLIB;
        return callPI(This, level, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_DeflateZLIB(ktxTexture2 * This, ktx_uint32_t level)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_DeflateZLIB(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int level) {
        return nktxTexture2_DeflateZLIB(This.address(), level);
    }

    // --- [ ktxTexture2_GetComponentInfo ] ---

    /** {@code void ktxTexture2_GetComponentInfo(ktxTexture2 * This, ktx_uint32_t * numComponents, ktx_uint32_t * componentByteLength)} */
    public static void nktxTexture2_GetComponentInfo(long This, long numComponents, long componentByteLength) {
        long __functionAddress = Functions.Texture2_GetComponentInfo;
        callPPPV(This, numComponents, componentByteLength, __functionAddress);
    }

    /** {@code void ktxTexture2_GetComponentInfo(ktxTexture2 * This, ktx_uint32_t * numComponents, ktx_uint32_t * componentByteLength)} */
    public static void ktxTexture2_GetComponentInfo(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t *") IntBuffer numComponents, @NativeType("ktx_uint32_t *") IntBuffer componentByteLength) {
        if (CHECKS) {
            check(numComponents, 1);
            check(componentByteLength, 1);
        }
        nktxTexture2_GetComponentInfo(This.address(), memAddress(numComponents), memAddress(componentByteLength));
    }

    // --- [ ktxTexture2_GetNumComponents ] ---

    /** {@code ktx_uint32_t ktxTexture2_GetNumComponents(ktxTexture2 * This)} */
    public static int nktxTexture2_GetNumComponents(long This) {
        long __functionAddress = Functions.Texture2_GetNumComponents;
        return callPI(This, __functionAddress);
    }

    /** {@code ktx_uint32_t ktxTexture2_GetNumComponents(ktxTexture2 * This)} */
    @NativeType("ktx_uint32_t")
    public static int ktxTexture2_GetNumComponents(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetNumComponents(This.address());
    }

    // --- [ ktxTexture2_GetOETF_e ] ---

    /** {@code khr_df_transfer_e ktxTexture2_GetOETF_e(ktxTexture2 * This)} */
    public static int nktxTexture2_GetOETF_e(long This) {
        long __functionAddress = Functions.Texture2_GetOETF_e;
        return callPI(This, __functionAddress);
    }

    /** {@code khr_df_transfer_e ktxTexture2_GetOETF_e(ktxTexture2 * This)} */
    @NativeType("khr_df_transfer_e")
    public static int ktxTexture2_GetOETF_e(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetOETF_e(This.address());
    }

    // --- [ ktxTexture2_GetOETF ] ---

    /** {@code ktx_uint32_t ktxTexture2_GetOETF(ktxTexture2 * This)} */
    public static int nktxTexture2_GetOETF(long This) {
        long __functionAddress = Functions.Texture2_GetOETF;
        return callPI(This, __functionAddress);
    }

    /** {@code ktx_uint32_t ktxTexture2_GetOETF(ktxTexture2 * This)} */
    @NativeType("ktx_uint32_t")
    public static int ktxTexture2_GetOETF(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetOETF(This.address());
    }

    // --- [ ktxTexture2_GetColorModel_e ] ---

    /** {@code khr_df_model_e ktxTexture2_GetColorModel_e(ktxTexture2 * This)} */
    public static int nktxTexture2_GetColorModel_e(long This) {
        long __functionAddress = Functions.Texture2_GetColorModel_e;
        return callPI(This, __functionAddress);
    }

    /** {@code khr_df_model_e ktxTexture2_GetColorModel_e(ktxTexture2 * This)} */
    @NativeType("khr_df_model_e")
    public static int ktxTexture2_GetColorModel_e(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetColorModel_e(This.address());
    }

    // --- [ ktxTexture2_GetPremultipliedAlpha ] ---

    /** {@code ktx_bool_t ktxTexture2_GetPremultipliedAlpha(ktxTexture2 * This)} */
    public static boolean nktxTexture2_GetPremultipliedAlpha(long This) {
        long __functionAddress = Functions.Texture2_GetPremultipliedAlpha;
        return callPZ(This, __functionAddress);
    }

    /** {@code ktx_bool_t ktxTexture2_GetPremultipliedAlpha(ktxTexture2 * This)} */
    @NativeType("ktx_bool_t")
    public static boolean ktxTexture2_GetPremultipliedAlpha(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_GetPremultipliedAlpha(This.address());
    }

    // --- [ ktxTexture2_NeedsTranscoding ] ---

    /** {@code ktx_bool_t ktxTexture2_NeedsTranscoding(ktxTexture2 * This)} */
    public static boolean nktxTexture2_NeedsTranscoding(long This) {
        long __functionAddress = Functions.Texture2_NeedsTranscoding;
        return callPZ(This, __functionAddress);
    }

    /** {@code ktx_bool_t ktxTexture2_NeedsTranscoding(ktxTexture2 * This)} */
    @NativeType("ktx_bool_t")
    public static boolean ktxTexture2_NeedsTranscoding(@NativeType("ktxTexture2 *") ktxTexture2 This) {
        return nktxTexture2_NeedsTranscoding(This.address());
    }

    // --- [ ktxTexture2_CompressAstcEx ] ---

    /** {@code KTX_error_code ktxTexture2_CompressAstcEx(ktxTexture2 * This, ktxAstcParams * params)} */
    public static int nktxTexture2_CompressAstcEx(long This, long params) {
        long __functionAddress = Functions.Texture2_CompressAstcEx;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, params, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CompressAstcEx(ktxTexture2 * This, ktxAstcParams * params)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressAstcEx(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxAstcParams *") ktxAstcParams params) {
        return nktxTexture2_CompressAstcEx(This.address(), params.address());
    }

    // --- [ ktxTexture2_CompressAstc ] ---

    /** {@code KTX_error_code ktxTexture2_CompressAstc(ktxTexture2 * This, ktx_uint32_t quality)} */
    public static int nktxTexture2_CompressAstc(long This, int quality) {
        long __functionAddress = Functions.Texture2_CompressAstc;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(This, quality, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CompressAstc(ktxTexture2 * This, ktx_uint32_t quality)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressAstc(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_uint32_t") int quality) {
        return nktxTexture2_CompressAstc(This.address(), quality);
    }

    // --- [ ktxTexture2_CompressBasisEx ] ---

    /** {@code KTX_error_code ktxTexture2_CompressBasisEx(ktxTexture2 * This, ktxBasisParams * params)} */
    public static int nktxTexture2_CompressBasisEx(long This, long params) {
        long __functionAddress = Functions.Texture2_CompressBasisEx;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(This, params, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_CompressBasisEx(ktxTexture2 * This, ktxBasisParams * params)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_CompressBasisEx(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktxBasisParams *") ktxBasisParams params) {
        return nktxTexture2_CompressBasisEx(This.address(), params.address());
    }

    // --- [ ktxTexture2_TranscodeBasis ] ---

    /** {@code KTX_error_code ktxTexture2_TranscodeBasis(ktxTexture2 * This, ktx_transcode_fmt_e fmt, ktx_transcode_flags transcodeFlags)} */
    public static int nktxTexture2_TranscodeBasis(long This, int fmt, int transcodeFlags) {
        long __functionAddress = Functions.Texture2_TranscodeBasis;
        return callPI(This, fmt, transcodeFlags, __functionAddress);
    }

    /** {@code KTX_error_code ktxTexture2_TranscodeBasis(ktxTexture2 * This, ktx_transcode_fmt_e fmt, ktx_transcode_flags transcodeFlags)} */
    @NativeType("KTX_error_code")
    public static int ktxTexture2_TranscodeBasis(@NativeType("ktxTexture2 *") ktxTexture2 This, @NativeType("ktx_transcode_fmt_e") int fmt, @NativeType("ktx_transcode_flags") int transcodeFlags) {
        return nktxTexture2_TranscodeBasis(This.address(), fmt, transcodeFlags);
    }

    // --- [ ktxErrorString ] ---

    /** {@code char const * ktxErrorString(KTX_error_code error)} */
    public static long nktxErrorString(int error) {
        long __functionAddress = Functions.ErrorString;
        return callP(error, __functionAddress);
    }

    /** {@code char const * ktxErrorString(KTX_error_code error)} */
    @NativeType("char const *")
    public static @Nullable String ktxErrorString(@NativeType("KTX_error_code") int error) {
        long __result = nktxErrorString(error);
        return memASCIISafe(__result);
    }

    // --- [ ktxSupercompressionSchemeString ] ---

    /** {@code char const * ktxSupercompressionSchemeString(ktxSupercmpScheme scheme)} */
    public static long nktxSupercompressionSchemeString(int scheme) {
        long __functionAddress = Functions.SupercompressionSchemeString;
        return callP(scheme, __functionAddress);
    }

    /** {@code char const * ktxSupercompressionSchemeString(ktxSupercmpScheme scheme)} */
    @NativeType("char const *")
    public static @Nullable String ktxSupercompressionSchemeString(@NativeType("ktxSupercmpScheme") int scheme) {
        long __result = nktxSupercompressionSchemeString(scheme);
        return memASCIISafe(__result);
    }

    // --- [ ktxTranscodeFormatString ] ---

    /** {@code char const * ktxTranscodeFormatString(ktx_transcode_fmt_e format)} */
    public static long nktxTranscodeFormatString(int format) {
        long __functionAddress = Functions.TranscodeFormatString;
        return callP(format, __functionAddress);
    }

    /** {@code char const * ktxTranscodeFormatString(ktx_transcode_fmt_e format)} */
    @NativeType("char const *")
    public static @Nullable String ktxTranscodeFormatString(@NativeType("ktx_transcode_fmt_e") int format) {
        long __result = nktxTranscodeFormatString(format);
        return memASCIISafe(__result);
    }

    // --- [ ktxHashList_Create ] ---

    /** {@code KTX_error_code ktxHashList_Create(ktxHashList** ppHl)} */
    public static int nktxHashList_Create(long ppHl) {
        long __functionAddress = Functions.HashList_Create;
        return callPI(ppHl, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_Create(ktxHashList** ppHl)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Create(@NativeType("ktxHashList**") PointerBuffer ppHl) {
        if (CHECKS) {
            check(ppHl, 1);
        }
        return nktxHashList_Create(memAddress(ppHl));
    }

    // --- [ ktxHashList_CreateCopy ] ---

    /** {@code KTX_error_code ktxHashList_CreateCopy(ktxHashList** ppHl, ktxHashList orig)} */
    public static int nktxHashList_CreateCopy(long ppHl, long orig) {
        long __functionAddress = Functions.HashList_CreateCopy;
        if (CHECKS) {
            check(orig);
        }
        return callPPI(ppHl, orig, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_CreateCopy(ktxHashList** ppHl, ktxHashList orig)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_CreateCopy(@NativeType("ktxHashList**") PointerBuffer ppHl, @NativeType("ktxHashList") long orig) {
        if (CHECKS) {
            check(ppHl, 1);
        }
        return nktxHashList_CreateCopy(memAddress(ppHl), orig);
    }

    // --- [ ktxHashList_Construct ] ---

    /** {@code void ktxHashList_Construct(ktxHashList* pHl)} */
    public static void ktxHashList_Construct(@NativeType("ktxHashList*") long pHl) {
        long __functionAddress = Functions.HashList_Construct;
        if (CHECKS) {
            check(pHl);
        }
        callPV(pHl, __functionAddress);
    }

    // --- [ ktxHashList_ConstructCopy ] ---

    /** {@code void ktxHashList_ConstructCopy(ktxHashList* pHl, ktxHashList orig)} */
    public static void ktxHashList_ConstructCopy(@NativeType("ktxHashList*") long pHl, @NativeType("ktxHashList") long orig) {
        long __functionAddress = Functions.HashList_ConstructCopy;
        if (CHECKS) {
            check(pHl);
            check(orig);
        }
        callPPV(pHl, orig, __functionAddress);
    }

    // --- [ ktxHashList_Destroy ] ---

    /** {@code void ktxHashList_Destroy(ktxHashList* head)} */
    public static void ktxHashList_Destroy(@NativeType("ktxHashList*") long head) {
        long __functionAddress = Functions.HashList_Destroy;
        if (CHECKS) {
            check(head);
        }
        callPV(head, __functionAddress);
    }

    // --- [ ktxHashList_Destruct ] ---

    /** {@code void ktxHashList_Destruct(ktxHashList* head)} */
    public static void ktxHashList_Destruct(@NativeType("ktxHashList*") long head) {
        long __functionAddress = Functions.HashList_Destruct;
        if (CHECKS) {
            check(head);
        }
        callPV(head, __functionAddress);
    }

    // --- [ ktxHashList_AddKVPair ] ---

    /** {@code KTX_error_code ktxHashList_AddKVPair(ktxHashList* pHead, char const * key, unsigned int valueLen, void const * value)} */
    public static int nktxHashList_AddKVPair(long pHead, long key, int valueLen, long value) {
        long __functionAddress = Functions.HashList_AddKVPair;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPI(pHead, key, valueLen, value, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_AddKVPair(ktxHashList* pHead, char const * key, unsigned int valueLen, void const * value)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_AddKVPair(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key, @NativeType("void const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(key);
        }
        return nktxHashList_AddKVPair(pHead, memAddress(key), value.remaining(), memAddress(value));
    }

    /** {@code KTX_error_code ktxHashList_AddKVPair(ktxHashList* pHead, char const * key, unsigned int valueLen, void const * value)} */
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

    /** {@code KTX_error_code ktxHashList_DeleteEntry(ktxHashList* pHead, ktxHashListEntry * pEntry)} */
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

    /** {@code KTX_error_code ktxHashList_DeleteKVPair(ktxHashList* pHead, char const * key)} */
    public static int nktxHashList_DeleteKVPair(long pHead, long key) {
        long __functionAddress = Functions.HashList_DeleteKVPair;
        if (CHECKS) {
            check(pHead);
        }
        return callPPI(pHead, key, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_DeleteKVPair(ktxHashList* pHead, char const * key)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_DeleteKVPair(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key) {
        if (CHECKS) {
            checkNT1(key);
        }
        return nktxHashList_DeleteKVPair(pHead, memAddress(key));
    }

    /** {@code KTX_error_code ktxHashList_DeleteKVPair(ktxHashList* pHead, char const * key)} */
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

    /** {@code KTX_error_code ktxHashList_FindEntry(ktxHashList* pHead, char const * key, ktxHashListEntry ** ppEntry)} */
    public static int nktxHashList_FindEntry(long pHead, long key, long ppEntry) {
        long __functionAddress = Functions.HashList_FindEntry;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPI(pHead, key, ppEntry, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_FindEntry(ktxHashList* pHead, char const * key, ktxHashListEntry ** ppEntry)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_FindEntry(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key, @NativeType("ktxHashListEntry **") PointerBuffer ppEntry) {
        if (CHECKS) {
            checkNT1(key);
            check(ppEntry, 1);
        }
        return nktxHashList_FindEntry(pHead, memAddress(key), memAddress(ppEntry));
    }

    /** {@code KTX_error_code ktxHashList_FindEntry(ktxHashList* pHead, char const * key, ktxHashListEntry ** ppEntry)} */
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

    /** {@code KTX_error_code ktxHashList_FindValue(ktxHashList* pHead, char const * key, unsigned int * pValueLen, void ** pValue)} */
    public static int nktxHashList_FindValue(long pHead, long key, long pValueLen, long pValue) {
        long __functionAddress = Functions.HashList_FindValue;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPPI(pHead, key, pValueLen, pValue, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_FindValue(ktxHashList* pHead, char const * key, unsigned int * pValueLen, void ** pValue)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_FindValue(@NativeType("ktxHashList*") long pHead, @NativeType("char const *") ByteBuffer key, @NativeType("unsigned int *") IntBuffer pValueLen, @NativeType("void **") PointerBuffer pValue) {
        if (CHECKS) {
            checkNT1(key);
            check(pValueLen, 1);
            check(pValue, 1);
        }
        return nktxHashList_FindValue(pHead, memAddress(key), memAddress(pValueLen), memAddress(pValue));
    }

    /** {@code KTX_error_code ktxHashList_FindValue(ktxHashList* pHead, char const * key, unsigned int * pValueLen, void ** pValue)} */
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

    /** {@code ktxHashListEntry * ktxHashList_Next(ktxHashListEntry * entry)} */
    @NativeType("ktxHashListEntry *")
    public static long ktxHashList_Next(@NativeType("ktxHashListEntry *") long entry) {
        long __functionAddress = Functions.HashList_Next;
        if (CHECKS) {
            check(entry);
        }
        return callPP(entry, __functionAddress);
    }

    // --- [ ktxHashList_Sort ] ---

    /** {@code KTX_error_code ktxHashList_Sort(ktxHashList* pHead)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Sort(@NativeType("ktxHashList*") long pHead) {
        long __functionAddress = Functions.HashList_Sort;
        if (CHECKS) {
            check(pHead);
        }
        return callPI(pHead, __functionAddress);
    }

    // --- [ ktxHashList_Serialize ] ---

    /** {@code KTX_error_code ktxHashList_Serialize(ktxHashList* pHead, unsigned int * kvdLen, unsigned char ** kvd)} */
    public static int nktxHashList_Serialize(long pHead, long kvdLen, long kvd) {
        long __functionAddress = Functions.HashList_Serialize;
        if (CHECKS) {
            check(pHead);
        }
        return callPPPI(pHead, kvdLen, kvd, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_Serialize(ktxHashList* pHead, unsigned int * kvdLen, unsigned char ** kvd)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Serialize(@NativeType("ktxHashList*") long pHead, @NativeType("unsigned int *") IntBuffer kvdLen, @NativeType("unsigned char **") PointerBuffer kvd) {
        if (CHECKS) {
            check(kvdLen, 1);
            check(kvd, 1);
        }
        return nktxHashList_Serialize(pHead, memAddress(kvdLen), memAddress(kvd));
    }

    // --- [ ktxHashList_Deserialize ] ---

    /** {@code KTX_error_code ktxHashList_Deserialize(ktxHashList* pHead, unsigned int kvdLen, void * kvd)} */
    public static int nktxHashList_Deserialize(long pHead, int kvdLen, long kvd) {
        long __functionAddress = Functions.HashList_Deserialize;
        if (CHECKS) {
            check(pHead);
        }
        return callPPI(pHead, kvdLen, kvd, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashList_Deserialize(ktxHashList* pHead, unsigned int kvdLen, void * kvd)} */
    @NativeType("KTX_error_code")
    public static int ktxHashList_Deserialize(@NativeType("ktxHashList*") long pHead, @NativeType("void *") ByteBuffer kvd) {
        return nktxHashList_Deserialize(pHead, kvd.remaining(), memAddress(kvd));
    }

    // --- [ ktxHashListEntry_GetKey ] ---

    /** {@code KTX_error_code ktxHashListEntry_GetKey(ktxHashListEntry * This, unsigned int * pKeyLen, char ** ppKey)} */
    public static int nktxHashListEntry_GetKey(long This, long pKeyLen, long ppKey) {
        long __functionAddress = Functions.HashListEntry_GetKey;
        if (CHECKS) {
            check(This);
        }
        return callPPPI(This, pKeyLen, ppKey, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashListEntry_GetKey(ktxHashListEntry * This, unsigned int * pKeyLen, char ** ppKey)} */
    @NativeType("KTX_error_code")
    public static int ktxHashListEntry_GetKey(@NativeType("ktxHashListEntry *") long This, @NativeType("unsigned int *") IntBuffer pKeyLen, @NativeType("char **") PointerBuffer ppKey) {
        if (CHECKS) {
            check(pKeyLen, 1);
            check(ppKey, 1);
        }
        return nktxHashListEntry_GetKey(This, memAddress(pKeyLen), memAddress(ppKey));
    }

    // --- [ ktxHashListEntry_GetValue ] ---

    /** {@code KTX_error_code ktxHashListEntry_GetValue(ktxHashListEntry * This, unsigned int * pValueLen, void ** ppValue)} */
    public static int nktxHashListEntry_GetValue(long This, long pValueLen, long ppValue) {
        long __functionAddress = Functions.HashListEntry_GetValue;
        if (CHECKS) {
            check(This);
        }
        return callPPPI(This, pValueLen, ppValue, __functionAddress);
    }

    /** {@code KTX_error_code ktxHashListEntry_GetValue(ktxHashListEntry * This, unsigned int * pValueLen, void ** ppValue)} */
    @NativeType("KTX_error_code")
    public static int ktxHashListEntry_GetValue(@NativeType("ktxHashListEntry *") long This, @NativeType("unsigned int *") IntBuffer pValueLen, @NativeType("void **") PointerBuffer ppValue) {
        if (CHECKS) {
            check(pValueLen, 1);
            check(ppValue, 1);
        }
        return nktxHashListEntry_GetValue(This, memAddress(pValueLen), memAddress(ppValue));
    }

    // --- [ ktxPrintInfoForNamedFile ] ---

    /** {@code KTX_error_code ktxPrintInfoForNamedFile(char const * const filename)} */
    public static int nktxPrintInfoForNamedFile(long filename) {
        long __functionAddress = Functions.PrintInfoForNamedFile;
        return callPI(filename, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintInfoForNamedFile(char const * const filename)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintInfoForNamedFile(@NativeType("char const * const") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nktxPrintInfoForNamedFile(memAddress(filename));
    }

    /** {@code KTX_error_code ktxPrintInfoForNamedFile(char const * const filename)} */
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

    /** {@code KTX_error_code ktxPrintInfoForMemory(ktx_uint8_t const * bytes, ktx_size_t size)} */
    public static int nktxPrintInfoForMemory(long bytes, long size) {
        long __functionAddress = Functions.PrintInfoForMemory;
        return callPPI(bytes, size, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintInfoForMemory(ktx_uint8_t const * bytes, ktx_size_t size)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintInfoForMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes) {
        return nktxPrintInfoForMemory(memAddress(bytes), bytes.remaining());
    }

    // --- [ ktxPrintKTX2InfoTextForMemory ] ---

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForMemory(ktx_uint8_t const * bytes, ktx_size_t size)} */
    public static int nktxPrintKTX2InfoTextForMemory(long bytes, long size) {
        long __functionAddress = Functions.PrintKTX2InfoTextForMemory;
        return callPPI(bytes, size, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForMemory(ktx_uint8_t const * bytes, ktx_size_t size)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes) {
        return nktxPrintKTX2InfoTextForMemory(memAddress(bytes), bytes.remaining());
    }

    // --- [ ktxPrintKTX2InfoTextForNamedFile ] ---

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForNamedFile(char const * const filename)} */
    public static int nktxPrintKTX2InfoTextForNamedFile(long filename) {
        long __functionAddress = Functions.PrintKTX2InfoTextForNamedFile;
        return callPI(filename, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForNamedFile(char const * const filename)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForNamedFile(@NativeType("char const * const") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nktxPrintKTX2InfoTextForNamedFile(memAddress(filename));
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForNamedFile(char const * const filename)} */
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

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForStream(struct ktxStream * stream)} */
    public static int nktxPrintKTX2InfoTextForStream(long stream) {
        long __functionAddress = Functions.PrintKTX2InfoTextForStream;
        return callPI(stream, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoTextForStream(struct ktxStream * stream)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoTextForStream(@NativeType("struct ktxStream *") ktxStream stream) {
        return nktxPrintKTX2InfoTextForStream(stream.address());
    }

    // --- [ ktxPrintKTX2InfoJSONForMemory ] ---

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
    public static int nktxPrintKTX2InfoJSONForMemory(long bytes, long size, int base_indent, int indent_width, boolean minified) {
        long __functionAddress = Functions.PrintKTX2InfoJSONForMemory;
        return callPPI(bytes, size, base_indent, indent_width, minified, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForMemory(ktx_uint8_t const * bytes, ktx_size_t size, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoJSONForMemory(@NativeType("ktx_uint8_t const *") ByteBuffer bytes, @NativeType("ktx_uint32_t") int base_indent, @NativeType("ktx_uint32_t") int indent_width, @NativeType("bool") boolean minified) {
        return nktxPrintKTX2InfoJSONForMemory(memAddress(bytes), bytes.remaining(), base_indent, indent_width, minified);
    }

    // --- [ ktxPrintKTX2InfoJSONForNamedFile ] ---

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForNamedFile(char const * const filename, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
    public static int nktxPrintKTX2InfoJSONForNamedFile(long filename, int base_indent, int indent_width, boolean minified) {
        long __functionAddress = Functions.PrintKTX2InfoJSONForNamedFile;
        return callPI(filename, base_indent, indent_width, minified, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForNamedFile(char const * const filename, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
    @NativeType("KTX_error_code")
    public static int ktxPrintKTX2InfoJSONForNamedFile(@NativeType("char const * const") ByteBuffer filename, @NativeType("ktx_uint32_t") int base_indent, @NativeType("ktx_uint32_t") int indent_width, @NativeType("bool") boolean minified) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nktxPrintKTX2InfoJSONForNamedFile(memAddress(filename), base_indent, indent_width, minified);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForNamedFile(char const * const filename, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
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

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForStream(struct ktxStream * stream, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
    public static int nktxPrintKTX2InfoJSONForStream(long stream, int base_indent, int indent_width, boolean minified) {
        long __functionAddress = Functions.PrintKTX2InfoJSONForStream;
        return callPI(stream, base_indent, indent_width, minified, __functionAddress);
    }

    /** {@code KTX_error_code ktxPrintKTX2InfoJSONForStream(struct ktxStream * stream, ktx_uint32_t base_indent, ktx_uint32_t indent_width, bool minified)} */
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