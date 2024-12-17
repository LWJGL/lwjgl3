/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LZ4Frame {

    static { LibLZ4.initialize(); }

    public static final int LZ4F_VERSION = 100;

    public static final int LZ4F_HEADER_SIZE_MIN = 7;

    public static final int LZ4F_HEADER_SIZE_MAX = 19;

    public static final int LZ4F_BLOCK_HEADER_SIZE = 4;

    public static final int LZ4F_BLOCK_CHECKSUM_SIZE = 4;

    public static final int LZ4F_CONTENT_CHECKSUM_SIZE = 4;

    public static final int
        LZ4F_default  = 0,
        LZ4F_max64KB  = 4,
        LZ4F_max256KB = 5,
        LZ4F_max1MB   = 6,
        LZ4F_max4MB   = 7;

    public static final int
        LZ4F_blockLinked      = 0,
        LZ4F_blockIndependent = 1;

    public static final int
        LZ4F_noContentChecksum      = 0,
        LZ4F_contentChecksumEnabled = 1;

    public static final int
        LZ4F_noBlockChecksum      = 0,
        LZ4F_blockChecksumEnabled = 1;

    public static final int
        LZ4F_frame          = 0,
        LZ4F_skippableFrame = 1;

    public static final int LZ4F_MAGICNUMBER = 0x184D2204;

    public static final int LZ4F_MAGIC_SKIPPABLE_START = 0x184D2A50;

    public static final int LZ4F_MIN_SIZE_TO_KNOW_HEADER_LENGTH = 5;

    public static final int
        LZ4F_OK_NoError                           = 0,
        LZ4F_ERROR_GENERIC                        = 1,
        LZ4F_ERROR_maxBlockSize_invalid           = 2,
        LZ4F_ERROR_blockMode_invalid              = 3,
        LZ4F_ERROR_parameter_invalid              = 4,
        LZ4F_ERROR_compressionLevel_invalid       = 5,
        LZ4F_ERROR_headerVersion_wrong            = 6,
        LZ4F_ERROR_blockChecksum_invalid          = 7,
        LZ4F_ERROR_reservedFlag_set               = 8,
        LZ4F_ERROR_allocation_failed              = 9,
        LZ4F_ERROR_srcSize_tooLarge               = 10,
        LZ4F_ERROR_dstMaxSize_tooSmall            = 11,
        LZ4F_ERROR_frameHeader_incomplete         = 12,
        LZ4F_ERROR_frameType_unknown              = 13,
        LZ4F_ERROR_frameSize_wrong                = 14,
        LZ4F_ERROR_srcPtr_wrong                   = 15,
        LZ4F_ERROR_decompressionFailed            = 16,
        LZ4F_ERROR_headerChecksum_invalid         = 17,
        LZ4F_ERROR_contentChecksum_invalid        = 18,
        LZ4F_ERROR_frameDecoding_alreadyStarted   = 19,
        LZ4F_ERROR_compressionState_uninitialized = 20,
        LZ4F_ERROR_parameter_null                 = 21,
        LZ4F_ERROR_io_write                       = 22,
        LZ4F_ERROR_io_read                        = 23,
        LZ4F_ERROR_maxCode                        = 24;

    protected LZ4Frame() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4F_isError ] ---

    /** {@code unsigned LZ4F_isError(LZ4F_errorCode_t code)} */
    public static native int nLZ4F_isError(long code);

    /** {@code unsigned LZ4F_isError(LZ4F_errorCode_t code)} */
    @NativeType("unsigned")
    public static boolean LZ4F_isError(@NativeType("LZ4F_errorCode_t") long code) {
        return nLZ4F_isError(code) != 0;
    }

    // --- [ LZ4F_getErrorName ] ---

    /** {@code char const * LZ4F_getErrorName(LZ4F_errorCode_t code)} */
    public static native long nLZ4F_getErrorName(long code);

    /** {@code char const * LZ4F_getErrorName(LZ4F_errorCode_t code)} */
    @NativeType("char const *")
    public static @Nullable String LZ4F_getErrorName(@NativeType("LZ4F_errorCode_t") long code) {
        long __result = nLZ4F_getErrorName(code);
        return memASCIISafe(__result);
    }

    // --- [ LZ4F_compressFrame ] ---

    /** {@code size_t LZ4F_compressFrame(void * dstBuffer, size_t dstCapacity, void const * srcBuffer, size_t srcSize, LZ4F_preferences_t const * preferencesPtr)} */
    public static native long nLZ4F_compressFrame(long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long preferencesPtr);

    /** {@code size_t LZ4F_compressFrame(void * dstBuffer, size_t dstCapacity, void const * srcBuffer, size_t srcSize, LZ4F_preferences_t const * preferencesPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressFrame(@NativeType("void *") ByteBuffer dstBuffer, @NativeType("void const *") ByteBuffer srcBuffer, @NativeType("LZ4F_preferences_t const *") @Nullable LZ4FPreferences preferencesPtr) {
        return nLZ4F_compressFrame(memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(preferencesPtr));
    }

    // --- [ LZ4F_compressFrameBound ] ---

    /** {@code size_t LZ4F_compressFrameBound(size_t srcSize, LZ4F_preferences_t const * preferencesPtr)} */
    public static native long nLZ4F_compressFrameBound(long srcSize, long preferencesPtr);

    /** {@code size_t LZ4F_compressFrameBound(size_t srcSize, LZ4F_preferences_t const * preferencesPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressFrameBound(@NativeType("size_t") long srcSize, @NativeType("LZ4F_preferences_t const *") @Nullable LZ4FPreferences preferencesPtr) {
        return nLZ4F_compressFrameBound(srcSize, memAddressSafe(preferencesPtr));
    }

    // --- [ LZ4F_compressionLevel_max ] ---

    /** {@code int LZ4F_compressionLevel_max(void)} */
    public static native int LZ4F_compressionLevel_max();

    // --- [ LZ4F_getVersion ] ---

    /** {@code unsigned LZ4F_getVersion(void)} */
    @NativeType("unsigned")
    public static native int LZ4F_getVersion();

    // --- [ LZ4F_createCompressionContext ] ---

    /** {@code LZ4F_errorCode_t LZ4F_createCompressionContext(LZ4F_cctx ** cctxPtr, unsigned version)} */
    public static native long nLZ4F_createCompressionContext(long cctxPtr, int version);

    /** {@code LZ4F_errorCode_t LZ4F_createCompressionContext(LZ4F_cctx ** cctxPtr, unsigned version)} */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_createCompressionContext(@NativeType("LZ4F_cctx **") PointerBuffer cctxPtr, @NativeType("unsigned") int version) {
        if (CHECKS) {
            check(cctxPtr, 1);
        }
        return nLZ4F_createCompressionContext(memAddress(cctxPtr), version);
    }

    // --- [ LZ4F_freeCompressionContext ] ---

    /** {@code LZ4F_errorCode_t LZ4F_freeCompressionContext(LZ4F_cctx * cctx)} */
    @NativeType("LZ4F_errorCode_t")
    public static native long LZ4F_freeCompressionContext(@NativeType("LZ4F_cctx *") long cctx);

    // --- [ LZ4F_compressBegin ] ---

    /** {@code size_t LZ4F_compressBegin(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_preferences_t const * prefsPtr)} */
    public static native long nLZ4F_compressBegin(long cctx, long dstBuffer, long dstCapacity, long prefsPtr);

    /** {@code size_t LZ4F_compressBegin(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_preferences_t const * prefsPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressBegin(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("LZ4F_preferences_t const *") @Nullable LZ4FPreferences prefsPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressBegin(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_compressBound ] ---

    /** {@code size_t LZ4F_compressBound(size_t srcSize, LZ4F_preferences_t const * prefsPtr)} */
    public static native long nLZ4F_compressBound(long srcSize, long prefsPtr);

    /** {@code size_t LZ4F_compressBound(size_t srcSize, LZ4F_preferences_t const * prefsPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressBound(@NativeType("size_t") long srcSize, @NativeType("LZ4F_preferences_t const *") @Nullable LZ4FPreferences prefsPtr) {
        return nLZ4F_compressBound(srcSize, memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_compressUpdate ] ---

    /** {@code size_t LZ4F_compressUpdate(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, void const * srcBuffer, size_t srcSize, LZ4F_compressOptions_t const * cOptPtr)} */
    public static native long nLZ4F_compressUpdate(long cctx, long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long cOptPtr);

    /** {@code size_t LZ4F_compressUpdate(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, void const * srcBuffer, size_t srcSize, LZ4F_compressOptions_t const * cOptPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressUpdate(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("void const *") ByteBuffer srcBuffer, @NativeType("LZ4F_compressOptions_t const *") @Nullable LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressUpdate(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_flush ] ---

    /** {@code size_t LZ4F_flush(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_compressOptions_t const * cOptPtr)} */
    public static native long nLZ4F_flush(long cctx, long dstBuffer, long dstCapacity, long cOptPtr);

    /** {@code size_t LZ4F_flush(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_compressOptions_t const * cOptPtr)} */
    @NativeType("size_t")
    public static long LZ4F_flush(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("LZ4F_compressOptions_t const *") @Nullable LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_flush(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_compressEnd ] ---

    /** {@code size_t LZ4F_compressEnd(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_compressOptions_t const * cOptPtr)} */
    public static native long nLZ4F_compressEnd(long cctx, long dstBuffer, long dstCapacity, long cOptPtr);

    /** {@code size_t LZ4F_compressEnd(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_compressOptions_t const * cOptPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressEnd(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("LZ4F_compressOptions_t const *") @Nullable LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressEnd(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_createDecompressionContext ] ---

    /** {@code LZ4F_errorCode_t LZ4F_createDecompressionContext(LZ4F_dctx ** dctxPtr, unsigned version)} */
    public static native long nLZ4F_createDecompressionContext(long dctxPtr, int version);

    /** {@code LZ4F_errorCode_t LZ4F_createDecompressionContext(LZ4F_dctx ** dctxPtr, unsigned version)} */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_createDecompressionContext(@NativeType("LZ4F_dctx **") PointerBuffer dctxPtr, @NativeType("unsigned") int version) {
        if (CHECKS) {
            check(dctxPtr, 1);
        }
        return nLZ4F_createDecompressionContext(memAddress(dctxPtr), version);
    }

    // --- [ LZ4F_freeDecompressionContext ] ---

    /** {@code LZ4F_errorCode_t LZ4F_freeDecompressionContext(LZ4F_dctx * dctx)} */
    public static native long nLZ4F_freeDecompressionContext(long dctx);

    /** {@code LZ4F_errorCode_t LZ4F_freeDecompressionContext(LZ4F_dctx * dctx)} */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_freeDecompressionContext(@NativeType("LZ4F_dctx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nLZ4F_freeDecompressionContext(dctx);
    }

    // --- [ LZ4F_headerSize ] ---

    /** {@code size_t LZ4F_headerSize(void const * src, size_t srcSize)} */
    public static native long nLZ4F_headerSize(long src, long srcSize);

    /** {@code size_t LZ4F_headerSize(void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long LZ4F_headerSize(@NativeType("void const *") ByteBuffer src) {
        return nLZ4F_headerSize(memAddress(src), src.remaining());
    }

    // --- [ LZ4F_getFrameInfo ] ---

    /** {@code size_t LZ4F_getFrameInfo(LZ4F_dctx * dctx, LZ4F_frameInfo_t * frameInfoPtr, void const * srcBuffer, size_t * srcSizePtr)} */
    public static native long nLZ4F_getFrameInfo(long dctx, long frameInfoPtr, long srcBuffer, long srcSizePtr);

    /** {@code size_t LZ4F_getFrameInfo(LZ4F_dctx * dctx, LZ4F_frameInfo_t * frameInfoPtr, void const * srcBuffer, size_t * srcSizePtr)} */
    @NativeType("size_t")
    public static long LZ4F_getFrameInfo(@NativeType("LZ4F_dctx *") long dctx, @NativeType("LZ4F_frameInfo_t *") LZ4FFrameInfo frameInfoPtr, @NativeType("void const *") ByteBuffer srcBuffer, @NativeType("size_t *") PointerBuffer srcSizePtr) {
        if (CHECKS) {
            check(dctx);
            check(srcSizePtr, 1);
            check(srcBuffer, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4F_getFrameInfo(dctx, frameInfoPtr.address(), memAddress(srcBuffer), memAddress(srcSizePtr));
    }

    // --- [ LZ4F_decompress ] ---

    /** {@code size_t LZ4F_decompress(LZ4F_dctx * dctx, void * dstBuffer, size_t * dstSizePtr, void const * srcBuffer, size_t * srcSizePtr, LZ4F_decompressOptions_t const * dOptPtr)} */
    public static native long nLZ4F_decompress(long dctx, long dstBuffer, long dstSizePtr, long srcBuffer, long srcSizePtr, long dOptPtr);

    /** {@code size_t LZ4F_decompress(LZ4F_dctx * dctx, void * dstBuffer, size_t * dstSizePtr, void const * srcBuffer, size_t * srcSizePtr, LZ4F_decompressOptions_t const * dOptPtr)} */
    @NativeType("size_t")
    public static long LZ4F_decompress(@NativeType("LZ4F_dctx *") long dctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("size_t *") PointerBuffer dstSizePtr, @NativeType("void const *") ByteBuffer srcBuffer, @NativeType("size_t *") PointerBuffer srcSizePtr, @NativeType("LZ4F_decompressOptions_t const *") LZ4FDecompressOptions dOptPtr) {
        if (CHECKS) {
            check(dctx);
            check(dstSizePtr, 1);
            check(dstBuffer, dstSizePtr.get(dstSizePtr.position()));
            check(srcSizePtr, 1);
            check(srcBuffer, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4F_decompress(dctx, memAddress(dstBuffer), memAddress(dstSizePtr), memAddress(srcBuffer), memAddress(srcSizePtr), dOptPtr.address());
    }

    // --- [ LZ4F_resetDecompressionContext ] ---

    /** {@code void LZ4F_resetDecompressionContext(LZ4F_dctx * dctx)} */
    public static native void nLZ4F_resetDecompressionContext(long dctx);

    /** {@code void LZ4F_resetDecompressionContext(LZ4F_dctx * dctx)} */
    public static void LZ4F_resetDecompressionContext(@NativeType("LZ4F_dctx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        nLZ4F_resetDecompressionContext(dctx);
    }

    // --- [ LZ4F_getErrorCode ] ---

    /** {@code LZ4F_errorCodes LZ4F_getErrorCode(size_t functionResult)} */
    @NativeType("LZ4F_errorCodes")
    public static native int LZ4F_getErrorCode(@NativeType("size_t") long functionResult);

    // --- [ LZ4F_compressBegin_usingDict ] ---

    /** {@code size_t LZ4F_compressBegin_usingDict(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, void const * dictBuffer, size_t dictSize, LZ4F_preferences_t const * prefsPtr)} */
    public static native long nLZ4F_compressBegin_usingDict(long cctx, long dstBuffer, long dstCapacity, long dictBuffer, long dictSize, long prefsPtr);

    /** {@code size_t LZ4F_compressBegin_usingDict(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, void const * dictBuffer, size_t dictSize, LZ4F_preferences_t const * prefsPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressBegin_usingDict(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("void const *") ByteBuffer dictBuffer, @NativeType("LZ4F_preferences_t const *") @Nullable LZ4FPreferences prefsPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressBegin_usingDict(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddress(dictBuffer), dictBuffer.remaining(), memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_decompress_usingDict ] ---

    /** {@code size_t LZ4F_decompress_usingDict(LZ4F_dctx * dctxPtr, void * dstBuffer, size_t * dstSizePtr, void const * srcBuffer, size_t * srcSizePtr, void const * dict, size_t dictSize, LZ4F_decompressOptions_t const * decompressOptionsPtr)} */
    public static native long nLZ4F_decompress_usingDict(long dctxPtr, long dstBuffer, long dstSizePtr, long srcBuffer, long srcSizePtr, long dict, long dictSize, long decompressOptionsPtr);

    /** {@code size_t LZ4F_decompress_usingDict(LZ4F_dctx * dctxPtr, void * dstBuffer, size_t * dstSizePtr, void const * srcBuffer, size_t * srcSizePtr, void const * dict, size_t dictSize, LZ4F_decompressOptions_t const * decompressOptionsPtr)} */
    @NativeType("size_t")
    public static long LZ4F_decompress_usingDict(@NativeType("LZ4F_dctx *") long dctxPtr, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("size_t *") PointerBuffer dstSizePtr, @NativeType("void const *") ByteBuffer srcBuffer, @NativeType("size_t *") PointerBuffer srcSizePtr, @NativeType("void const *") ByteBuffer dict, @NativeType("LZ4F_decompressOptions_t const *") LZ4FDecompressOptions decompressOptionsPtr) {
        if (CHECKS) {
            check(dctxPtr);
            check(dstSizePtr, 1);
            check(dstBuffer, dstSizePtr.get(dstSizePtr.position()));
            check(srcSizePtr, 1);
            check(srcBuffer, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4F_decompress_usingDict(dctxPtr, memAddress(dstBuffer), memAddress(dstSizePtr), memAddress(srcBuffer), memAddress(srcSizePtr), memAddress(dict), dict.remaining(), decompressOptionsPtr.address());
    }

    // --- [ LZ4F_createCDict ] ---

    /** {@code LZ4F_CDict * LZ4F_createCDict(void const * dictBuffer, size_t dictSize)} */
    public static native long nLZ4F_createCDict(long dictBuffer, long dictSize);

    /** {@code LZ4F_CDict * LZ4F_createCDict(void const * dictBuffer, size_t dictSize)} */
    @NativeType("LZ4F_CDict *")
    public static long LZ4F_createCDict(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nLZ4F_createCDict(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ LZ4F_freeCDict ] ---

    /** {@code void LZ4F_freeCDict(LZ4F_CDict * CDict)} */
    public static native void nLZ4F_freeCDict(long CDict);

    /** {@code void LZ4F_freeCDict(LZ4F_CDict * CDict)} */
    public static void LZ4F_freeCDict(@NativeType("LZ4F_CDict *") long CDict) {
        if (CHECKS) {
            check(CDict);
        }
        nLZ4F_freeCDict(CDict);
    }

    // --- [ LZ4F_compressFrame_usingCDict ] ---

    /** {@code size_t LZ4F_compressFrame_usingCDict(LZ4F_cctx * cctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, LZ4F_CDict const * cdict, LZ4F_preferences_t const * preferencesPtr)} */
    public static native long nLZ4F_compressFrame_usingCDict(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict, long preferencesPtr);

    /** {@code size_t LZ4F_compressFrame_usingCDict(LZ4F_cctx * cctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, LZ4F_CDict const * cdict, LZ4F_preferences_t const * preferencesPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressFrame_usingCDict(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("LZ4F_CDict const *") long cdict, @NativeType("LZ4F_preferences_t const *") LZ4FPreferences preferencesPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressFrame_usingCDict(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict, preferencesPtr.address());
    }

    // --- [ LZ4F_compressBegin_usingCDict ] ---

    /** {@code size_t LZ4F_compressBegin_usingCDict(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_CDict const * cdict, LZ4F_preferences_t const * prefsPtr)} */
    public static native long nLZ4F_compressBegin_usingCDict(long cctx, long dstBuffer, long dstCapacity, long cdict, long prefsPtr);

    /** {@code size_t LZ4F_compressBegin_usingCDict(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, LZ4F_CDict const * cdict, LZ4F_preferences_t const * prefsPtr)} */
    @NativeType("size_t")
    public static long LZ4F_compressBegin_usingCDict(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("LZ4F_CDict const *") long cdict, @NativeType("LZ4F_preferences_t const *") LZ4FPreferences prefsPtr) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nLZ4F_compressBegin_usingCDict(cctx, memAddress(dstBuffer), dstBuffer.remaining(), cdict, prefsPtr.address());
    }

    // --- [ LZ4F_getBlockSize ] ---

    /** {@code size_t LZ4F_getBlockSize(LZ4F_blockSizeID_t blockSizeID)} */
    @NativeType("size_t")
    public static native long LZ4F_getBlockSize(@NativeType("LZ4F_blockSizeID_t") int blockSizeID);

    // --- [ LZ4F_uncompressedUpdate ] ---

    /** {@code size_t LZ4F_uncompressedUpdate(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, void const * srcBuffer, size_t srcSize, LZ4F_compressOptions_t const * cOptPtr)} */
    public static native long nLZ4F_uncompressedUpdate(long cctx, long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long cOptPtr);

    /** {@code size_t LZ4F_uncompressedUpdate(LZ4F_cctx * cctx, void * dstBuffer, size_t dstCapacity, void const * srcBuffer, size_t srcSize, LZ4F_compressOptions_t const * cOptPtr)} */
    @NativeType("size_t")
    public static long LZ4F_uncompressedUpdate(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("void const *") ByteBuffer srcBuffer, @NativeType("LZ4F_compressOptions_t const *") @Nullable LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_uncompressedUpdate(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_defaultCMem ] ---

    private static native void nLZ4F_defaultCMem(long __result);

    @NativeType("LZ4F_CustomMem")
    private static LZ4FCustomMem LZ4F_defaultCMem(@NativeType("LZ4F_CustomMem") LZ4FCustomMem __result) {
        nLZ4F_defaultCMem(__result.address());
        return __result;
    }

    /** {@code LZ4F_CustomMem LZ4F_defaultCMem(void)} */
    public static final LZ4FCustomMem LZ4F_defaultCMem = LZ4F_defaultCMem(LZ4FCustomMem.create());

    // --- [ LZ4F_createCompressionContext_advanced ] ---

    /** {@code LZ4F_cctx * LZ4F_createCompressionContext_advanced(LZ4F_CustomMem customMem, unsigned version)} */
    public static native long nLZ4F_createCompressionContext_advanced(long customMem, int version);

    /** {@code LZ4F_cctx * LZ4F_createCompressionContext_advanced(LZ4F_CustomMem customMem, unsigned version)} */
    @NativeType("LZ4F_cctx *")
    public static long LZ4F_createCompressionContext_advanced(@NativeType("LZ4F_CustomMem") LZ4FCustomMem customMem, @NativeType("unsigned") int version) {
        if (CHECKS) {
            LZ4FCustomMem.validate(customMem.address());
        }
        return nLZ4F_createCompressionContext_advanced(customMem.address(), version);
    }

    // --- [ LZ4F_createDecompressionContext_advanced ] ---

    /** {@code LZ4F_dctx * LZ4F_createDecompressionContext_advanced(LZ4F_CustomMem customMem, unsigned version)} */
    public static native long nLZ4F_createDecompressionContext_advanced(long customMem, int version);

    /** {@code LZ4F_dctx * LZ4F_createDecompressionContext_advanced(LZ4F_CustomMem customMem, unsigned version)} */
    @NativeType("LZ4F_dctx *")
    public static long LZ4F_createDecompressionContext_advanced(@NativeType("LZ4F_CustomMem") LZ4FCustomMem customMem, @NativeType("unsigned") int version) {
        if (CHECKS) {
            LZ4FCustomMem.validate(customMem.address());
        }
        return nLZ4F_createDecompressionContext_advanced(customMem.address(), version);
    }

    // --- [ LZ4F_createCDict_advanced ] ---

    /** {@code LZ4F_CDict * LZ4F_createCDict_advanced(LZ4F_CustomMem customMem, void const * dictBuffer, size_t dictSize)} */
    public static native long nLZ4F_createCDict_advanced(long customMem, long dictBuffer, long dictSize);

    /** {@code LZ4F_CDict * LZ4F_createCDict_advanced(LZ4F_CustomMem customMem, void const * dictBuffer, size_t dictSize)} */
    @NativeType("LZ4F_CDict *")
    public static long LZ4F_createCDict_advanced(@NativeType("LZ4F_CustomMem") LZ4FCustomMem customMem, @NativeType("void const *") ByteBuffer dictBuffer) {
        if (CHECKS) {
            LZ4FCustomMem.validate(customMem.address());
        }
        return nLZ4F_createCDict_advanced(customMem.address(), memAddress(dictBuffer), dictBuffer.remaining());
    }

}