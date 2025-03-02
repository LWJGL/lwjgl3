/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Zstd {

    static { LibZstd.initialize(); }

    public static final int
        ZSTD_VERSION_MAJOR   = 1,
        ZSTD_VERSION_MINOR   = 5,
        ZSTD_VERSION_RELEASE = 7;

    public static final int ZSTD_VERSION_NUMBER = (ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE);

    public static final String ZSTD_VERSION_STRING = ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE;

    public static final int ZSTD_CLEVEL_DEFAULT = 3;

    public static final int ZSTD_MAGICNUMBER = 0xFD2FB528;

    public static final int ZSTD_MAGIC_DICTIONARY = 0xEC30A437;

    public static final int ZSTD_MAGIC_SKIPPABLE_START = 0x184D2A50;

    public static final int ZSTD_MAGIC_SKIPPABLE_MASK = 0xFFFFFFF0;

    public static final int ZSTD_BLOCKSIZELOG_MAX = 17;

    public static final int ZSTD_BLOCKSIZE_MAX = (1<<ZSTD_BLOCKSIZELOG_MAX);

    public static final long
        ZSTD_CONTENTSIZE_UNKNOWN = -1L,
        ZSTD_CONTENTSIZE_ERROR   = -2L;

    public static final int
        ZSTD_fast     = 1,
        ZSTD_dfast    = 2,
        ZSTD_greedy   = 3,
        ZSTD_lazy     = 4,
        ZSTD_lazy2    = 5,
        ZSTD_btlazy2  = 6,
        ZSTD_btopt    = 7,
        ZSTD_btultra  = 8,
        ZSTD_btultra2 = 9;

    public static final int
        ZSTD_c_compressionLevel           = 100,
        ZSTD_c_windowLog                  = 101,
        ZSTD_c_hashLog                    = 102,
        ZSTD_c_chainLog                   = 103,
        ZSTD_c_searchLog                  = 104,
        ZSTD_c_minMatch                   = 105,
        ZSTD_c_targetLength               = 106,
        ZSTD_c_strategy                   = 107,
        ZSTD_c_targetCBlockSize           = 108,
        ZSTD_c_enableLongDistanceMatching = 160,
        ZSTD_c_ldmHashLog                 = 161,
        ZSTD_c_ldmMinMatch                = 162,
        ZSTD_c_ldmBucketSizeLog           = 163,
        ZSTD_c_ldmHashRateLog             = 164,
        ZSTD_c_contentSizeFlag            = 200,
        ZSTD_c_checksumFlag               = 201,
        ZSTD_c_dictIDFlag                 = 202,
        ZSTD_c_nbWorkers                  = 400,
        ZSTD_c_jobSize                    = 401,
        ZSTD_c_overlapLog                 = 402,
        ZSTD_c_experimentalParam1         = 500,
        ZSTD_c_experimentalParam2         = 10,
        ZSTD_c_experimentalParam3         = 1000,
        ZSTD_c_experimentalParam4         = 1001,
        ZSTD_c_experimentalParam5         = 1002,
        ZSTD_c_experimentalParam7         = 1004,
        ZSTD_c_experimentalParam8         = 1005,
        ZSTD_c_experimentalParam9         = 1006,
        ZSTD_c_experimentalParam10        = 1007,
        ZSTD_c_experimentalParam11        = 1008,
        ZSTD_c_experimentalParam12        = 1009,
        ZSTD_c_experimentalParam13        = 1010,
        ZSTD_c_experimentalParam14        = 1011,
        ZSTD_c_experimentalParam15        = 1012,
        ZSTD_c_experimentalParam16        = 1013,
        ZSTD_c_experimentalParam17        = 1014,
        ZSTD_c_experimentalParam18        = 1015,
        ZSTD_c_experimentalParam19        = 1016,
        ZSTD_c_experimentalParam20        = 1017;

    public static final int
        ZSTD_reset_session_only           = 1,
        ZSTD_reset_parameters             = 2,
        ZSTD_reset_session_and_parameters = 3;

    public static final int
        ZSTD_d_windowLogMax       = 100,
        ZSTD_d_experimentalParam1 = 1000,
        ZSTD_d_experimentalParam2 = 1001,
        ZSTD_d_experimentalParam3 = 1002,
        ZSTD_d_experimentalParam4 = 1003,
        ZSTD_d_experimentalParam5 = 1004,
        ZSTD_d_experimentalParam6 = 1005;

    public static final int
        ZSTD_e_continue = 0,
        ZSTD_e_flush    = 1,
        ZSTD_e_end      = 2;

    protected Zstd() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_versionNumber ] ---

    /** {@code unsigned ZSTD_versionNumber(void)} */
    @NativeType("unsigned")
    public static native int ZSTD_versionNumber();

    // --- [ ZSTD_versionString ] ---

    /** {@code char const * ZSTD_versionString(void)} */
    public static native long nZSTD_versionString();

    /** {@code char const * ZSTD_versionString(void)} */
    @NativeType("char const *")
    public static String ZSTD_versionString() {
        long __result = nZSTD_versionString();
        return memASCII(__result);
    }

    // --- [ ZSTD_compress ] ---

    /** {@code size_t ZSTD_compress(void * dst, size_t dstCapacity, void const * src, size_t srcSize, int compressionLevel)} */
    public static native long nZSTD_compress(long dst, long dstCapacity, long src, long srcSize, int compressionLevel);

    /** {@code size_t ZSTD_compress(void * dst, size_t dstCapacity, void const * src, size_t srcSize, int compressionLevel)} */
    @NativeType("size_t")
    public static long ZSTD_compress(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, int compressionLevel) {
        return nZSTD_compress(memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), compressionLevel);
    }

    // --- [ ZSTD_decompress ] ---

    /** {@code size_t ZSTD_decompress(void * dst, size_t dstCapacity, void const * src, size_t compressedSize)} */
    public static native long nZSTD_decompress(long dst, long dstCapacity, long src, long compressedSize);

    /** {@code size_t ZSTD_decompress(void * dst, size_t dstCapacity, void const * src, size_t compressedSize)} */
    @NativeType("size_t")
    public static long ZSTD_decompress(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        return nZSTD_decompress(memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameContentSize ] ---

    /** {@code unsigned long long ZSTD_getFrameContentSize(void const * src, size_t srcSize)} */
    public static native long nZSTD_getFrameContentSize(long src, long srcSize);

    /** {@code unsigned long long ZSTD_getFrameContentSize(void const * src, size_t srcSize)} */
    @NativeType("unsigned long long")
    public static long ZSTD_getFrameContentSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getFrameContentSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_findFrameCompressedSize ] ---

    /** {@code size_t ZSTD_findFrameCompressedSize(void const * src, size_t srcSize)} */
    public static native long nZSTD_findFrameCompressedSize(long src, long srcSize);

    /** {@code size_t ZSTD_findFrameCompressedSize(void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_findFrameCompressedSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_findFrameCompressedSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compressBound ] ---

    /** {@code size_t ZSTD_compressBound(size_t srcSize)} */
    @NativeType("size_t")
    public static native long ZSTD_compressBound(@NativeType("size_t") long srcSize);

    // --- [ ZSTD_isError ] ---

    /** {@code unsigned int ZSTD_isError(size_t result)} */
    public static native int nZSTD_isError(long result);

    /** {@code unsigned int ZSTD_isError(size_t result)} */
    @NativeType("unsigned int")
    public static boolean ZSTD_isError(@NativeType("size_t") long result) {
        return nZSTD_isError(result) != 0;
    }

    // --- [ ZSTD_getErrorCode ] ---

    /** {@code ZSTD_ErrorCode ZSTD_getErrorCode(size_t functionResult)} */
    @NativeType("ZSTD_ErrorCode")
    public static native int ZSTD_getErrorCode(@NativeType("size_t") long functionResult);

    // --- [ ZSTD_getErrorName ] ---

    /** {@code char const * ZSTD_getErrorName(size_t result)} */
    public static native long nZSTD_getErrorName(long result);

    /** {@code char const * ZSTD_getErrorName(size_t result)} */
    @NativeType("char const *")
    public static String ZSTD_getErrorName(@NativeType("size_t") long result) {
        long __result = nZSTD_getErrorName(result);
        return memASCII(__result);
    }

    // --- [ ZSTD_minCLevel ] ---

    /** {@code int ZSTD_minCLevel(void)} */
    public static native int ZSTD_minCLevel();

    // --- [ ZSTD_maxCLevel ] ---

    /** {@code int ZSTD_maxCLevel(void)} */
    public static native int ZSTD_maxCLevel();

    // --- [ ZSTD_defaultCLevel ] ---

    /** {@code int ZSTD_defaultCLevel(void)} */
    public static native int ZSTD_defaultCLevel();

    // --- [ ZSTD_createCCtx ] ---

    /** {@code ZSTD_CCtx * ZSTD_createCCtx(void)} */
    @NativeType("ZSTD_CCtx *")
    public static native long ZSTD_createCCtx();

    // --- [ ZSTD_freeCCtx ] ---

    /** {@code size_t ZSTD_freeCCtx(ZSTD_CCtx * cctx)} */
    @NativeType("size_t")
    public static native long ZSTD_freeCCtx(@NativeType("ZSTD_CCtx *") long cctx);

    // --- [ ZSTD_compressCCtx ] ---

    /** {@code size_t ZSTD_compressCCtx(ZSTD_CCtx * ctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, int compressionLevel)} */
    public static native long nZSTD_compressCCtx(long ctx, long dst, long dstCapacity, long src, long srcSize, int compressionLevel);

    /** {@code size_t ZSTD_compressCCtx(ZSTD_CCtx * ctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, int compressionLevel)} */
    @NativeType("size_t")
    public static long ZSTD_compressCCtx(@NativeType("ZSTD_CCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, int compressionLevel) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_compressCCtx(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), compressionLevel);
    }

    // --- [ ZSTD_createDCtx ] ---

    /** {@code ZSTD_DCtx * ZSTD_createDCtx(void)} */
    @NativeType("ZSTD_DCtx *")
    public static native long ZSTD_createDCtx();

    // --- [ ZSTD_freeDCtx ] ---

    /** {@code size_t ZSTD_freeDCtx(ZSTD_DCtx * dctx)} */
    @NativeType("size_t")
    public static native long ZSTD_freeDCtx(@NativeType("ZSTD_DCtx *") long dctx);

    // --- [ ZSTD_decompressDCtx ] ---

    /** {@code size_t ZSTD_decompressDCtx(ZSTD_DCtx * ctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize)} */
    public static native long nZSTD_decompressDCtx(long ctx, long dst, long dstCapacity, long src, long srcSize);

    /** {@code size_t ZSTD_decompressDCtx(ZSTD_DCtx * ctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_decompressDCtx(@NativeType("ZSTD_DCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_decompressDCtx(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_cParam_getBounds ] ---

    /** {@code ZSTD_bounds ZSTD_cParam_getBounds(ZSTD_cParameter cParam)} */
    public static native void nZSTD_cParam_getBounds(int cParam, long __result);

    /** {@code ZSTD_bounds ZSTD_cParam_getBounds(ZSTD_cParameter cParam)} */
    @NativeType("ZSTD_bounds")
    public static ZSTDBounds ZSTD_cParam_getBounds(@NativeType("ZSTD_cParameter") int cParam, @NativeType("ZSTD_bounds") ZSTDBounds __result) {
        nZSTD_cParam_getBounds(cParam, __result.address());
        return __result;
    }

    // --- [ ZSTD_CCtx_setParameter ] ---

    /** {@code size_t ZSTD_CCtx_setParameter(ZSTD_CCtx * cctx, ZSTD_cParameter param, int value)} */
    public static native long nZSTD_CCtx_setParameter(long cctx, int param, int value);

    /** {@code size_t ZSTD_CCtx_setParameter(ZSTD_CCtx * cctx, ZSTD_cParameter param, int value)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParameter(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_cParameter") int param, int value) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setParameter(cctx, param, value);
    }

    // --- [ ZSTD_CCtx_setPledgedSrcSize ] ---

    /** {@code size_t ZSTD_CCtx_setPledgedSrcSize(ZSTD_CCtx * cctx, unsigned long long pledgedSrcSize)} */
    public static native long nZSTD_CCtx_setPledgedSrcSize(long cctx, long pledgedSrcSize);

    /** {@code size_t ZSTD_CCtx_setPledgedSrcSize(ZSTD_CCtx * cctx, unsigned long long pledgedSrcSize)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setPledgedSrcSize(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setPledgedSrcSize(cctx, pledgedSrcSize);
    }

    // --- [ ZSTD_CCtx_reset ] ---

    /** {@code size_t ZSTD_CCtx_reset(ZSTD_CCtx * cctx, ZSTD_ResetDirective reset)} */
    public static native long nZSTD_CCtx_reset(long cctx, int reset);

    /** {@code size_t ZSTD_CCtx_reset(ZSTD_CCtx * cctx, ZSTD_ResetDirective reset)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_reset(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_ResetDirective") int reset) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_reset(cctx, reset);
    }

    // --- [ ZSTD_compress2 ] ---

    /** {@code size_t ZSTD_compress2(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize)} */
    public static native long nZSTD_compress2(long cctx, long dst, long dstCapacity, long src, long srcSize);

    /** {@code size_t ZSTD_compress2(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_compress2(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compress2(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_dParam_getBounds ] ---

    /** {@code ZSTD_bounds ZSTD_dParam_getBounds(ZSTD_dParameter dParam)} */
    public static native void nZSTD_dParam_getBounds(int dParam, long __result);

    /** {@code ZSTD_bounds ZSTD_dParam_getBounds(ZSTD_dParameter dParam)} */
    @NativeType("ZSTD_bounds")
    public static ZSTDBounds ZSTD_dParam_getBounds(@NativeType("ZSTD_dParameter") int dParam, @NativeType("ZSTD_bounds") ZSTDBounds __result) {
        nZSTD_dParam_getBounds(dParam, __result.address());
        return __result;
    }

    // --- [ ZSTD_DCtx_setParameter ] ---

    /** {@code size_t ZSTD_DCtx_setParameter(ZSTD_DCtx * dctx, ZSTD_dParameter param, int value)} */
    public static native long nZSTD_DCtx_setParameter(long dctx, int param, int value);

    /** {@code size_t ZSTD_DCtx_setParameter(ZSTD_DCtx * dctx, ZSTD_dParameter param, int value)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setParameter(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_dParameter") int param, int value) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setParameter(dctx, param, value);
    }

    // --- [ ZSTD_DCtx_reset ] ---

    /** {@code size_t ZSTD_DCtx_reset(ZSTD_DCtx * dctx, ZSTD_ResetDirective reset)} */
    public static native long nZSTD_DCtx_reset(long dctx, int reset);

    /** {@code size_t ZSTD_DCtx_reset(ZSTD_DCtx * dctx, ZSTD_ResetDirective reset)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_reset(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_ResetDirective") int reset) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_reset(dctx, reset);
    }

    // --- [ ZSTD_createCStream ] ---

    /** {@code ZSTD_CStream * ZSTD_createCStream(void)} */
    @NativeType("ZSTD_CStream *")
    public static native long ZSTD_createCStream();

    // --- [ ZSTD_freeCStream ] ---

    /** {@code size_t ZSTD_freeCStream(ZSTD_CStream * zcs)} */
    @NativeType("size_t")
    public static native long ZSTD_freeCStream(@NativeType("ZSTD_CStream *") long zcs);

    // --- [ ZSTD_compressStream2 ] ---

    /** {@code size_t ZSTD_compressStream2(ZSTD_CCtx * cctx, ZSTD_outBuffer * output, ZSTD_inBuffer * input, ZSTD_EndDirective endOp)} */
    public static native long nZSTD_compressStream2(long cctx, long output, long input, int endOp);

    /** {@code size_t ZSTD_compressStream2(ZSTD_CCtx * cctx, ZSTD_outBuffer * output, ZSTD_inBuffer * input, ZSTD_EndDirective endOp)} */
    @NativeType("size_t")
    public static long ZSTD_compressStream2(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input, @NativeType("ZSTD_EndDirective") int endOp) {
        if (CHECKS) {
            check(cctx);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_compressStream2(cctx, output.address(), input.address(), endOp);
    }

    // --- [ ZSTD_CStreamInSize ] ---

    /** {@code size_t ZSTD_CStreamInSize(void)} */
    @NativeType("size_t")
    public static native long ZSTD_CStreamInSize();

    // --- [ ZSTD_CStreamOutSize ] ---

    /** {@code size_t ZSTD_CStreamOutSize(void)} */
    @NativeType("size_t")
    public static native long ZSTD_CStreamOutSize();

    // --- [ ZSTD_createDStream ] ---

    /** {@code ZSTD_DStream * ZSTD_createDStream(void)} */
    @NativeType("ZSTD_DStream *")
    public static native long ZSTD_createDStream();

    // --- [ ZSTD_freeDStream ] ---

    /** {@code size_t ZSTD_freeDStream(ZSTD_DStream * zds)} */
    @NativeType("size_t")
    public static native long ZSTD_freeDStream(@NativeType("ZSTD_DStream *") long zds);

    // --- [ ZSTD_decompressStream ] ---

    /** {@code size_t ZSTD_decompressStream(ZSTD_DStream * zds, ZSTD_outBuffer * output, ZSTD_inBuffer * input)} */
    public static native long nZSTD_decompressStream(long zds, long output, long input);

    /** {@code size_t ZSTD_decompressStream(ZSTD_DStream * zds, ZSTD_outBuffer * output, ZSTD_inBuffer * input)} */
    @NativeType("size_t")
    public static long ZSTD_decompressStream(@NativeType("ZSTD_DStream *") long zds, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input) {
        if (CHECKS) {
            check(zds);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_decompressStream(zds, output.address(), input.address());
    }

    // --- [ ZSTD_DStreamInSize ] ---

    /** {@code size_t ZSTD_DStreamInSize(void)} */
    @NativeType("size_t")
    public static native long ZSTD_DStreamInSize();

    // --- [ ZSTD_DStreamOutSize ] ---

    /** {@code size_t ZSTD_DStreamOutSize(void)} */
    @NativeType("size_t")
    public static native long ZSTD_DStreamOutSize();

    // --- [ ZSTD_compress_usingDict ] ---

    /** {@code size_t ZSTD_compress_usingDict(ZSTD_CCtx * ctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, void const * dict, size_t dictSize, int compressionLevel)} */
    public static native long nZSTD_compress_usingDict(long ctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize, int compressionLevel);

    /** {@code size_t ZSTD_compress_usingDict(ZSTD_CCtx * ctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, void const * dict, size_t dictSize, int compressionLevel)} */
    @NativeType("size_t")
    public static long ZSTD_compress_usingDict(@NativeType("ZSTD_CCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("void const *") @Nullable ByteBuffer dict, int compressionLevel) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_compress_usingDict(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddressSafe(dict), remainingSafe(dict), compressionLevel);
    }

    // --- [ ZSTD_decompress_usingDict ] ---

    /** {@code size_t ZSTD_decompress_usingDict(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, void const * dict, size_t dictSize)} */
    public static native long nZSTD_decompress_usingDict(long dctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize);

    /** {@code size_t ZSTD_decompress_usingDict(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, void const * dict, size_t dictSize)} */
    @NativeType("size_t")
    public static long ZSTD_decompress_usingDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("void const *") @Nullable ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompress_usingDict(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_createCDict ] ---

    /** {@code ZSTD_CDict * ZSTD_createCDict(void const * dictBuffer, size_t dictSize, int compressionLevel)} */
    public static native long nZSTD_createCDict(long dictBuffer, long dictSize, int compressionLevel);

    /** {@code ZSTD_CDict * ZSTD_createCDict(void const * dictBuffer, size_t dictSize, int compressionLevel)} */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict(@NativeType("void const *") ByteBuffer dictBuffer, int compressionLevel) {
        return nZSTD_createCDict(memAddress(dictBuffer), dictBuffer.remaining(), compressionLevel);
    }

    // --- [ ZSTD_freeCDict ] ---

    /** {@code size_t ZSTD_freeCDict(ZSTD_CDict * CDict)} */
    @NativeType("size_t")
    public static native long ZSTD_freeCDict(@NativeType("ZSTD_CDict *") long CDict);

    // --- [ ZSTD_compress_usingCDict ] ---

    /** {@code size_t ZSTD_compress_usingCDict(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, ZSTD_CDict const * cdict)} */
    public static native long nZSTD_compress_usingCDict(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict);

    /** {@code size_t ZSTD_compress_usingCDict(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, ZSTD_CDict const * cdict)} */
    @NativeType("size_t")
    public static long ZSTD_compress_usingCDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compress_usingCDict(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict);
    }

    // --- [ ZSTD_createDDict ] ---

    /** {@code ZSTD_DDict * ZSTD_createDDict(void const * dictBuffer, size_t dictSize)} */
    public static native long nZSTD_createDDict(long dictBuffer, long dictSize);

    /** {@code ZSTD_DDict * ZSTD_createDDict(void const * dictBuffer, size_t dictSize)} */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZSTD_createDDict(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZSTD_freeDDict ] ---

    /** {@code size_t ZSTD_freeDDict(ZSTD_DDict * ddict)} */
    @NativeType("size_t")
    public static native long ZSTD_freeDDict(@NativeType("ZSTD_DDict *") long ddict);

    // --- [ ZSTD_decompress_usingDDict ] ---

    /** {@code size_t ZSTD_decompress_usingDDict(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, ZSTD_DDict const * ddict)} */
    public static native long nZSTD_decompress_usingDDict(long dctx, long dst, long dstCapacity, long src, long srcSize, long ddict);

    /** {@code size_t ZSTD_decompress_usingDDict(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize, ZSTD_DDict const * ddict)} */
    @NativeType("size_t")
    public static long ZSTD_decompress_usingDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
            check(ddict);
        }
        return nZSTD_decompress_usingDDict(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), ddict);
    }

    // --- [ ZSTD_getDictID_fromDict ] ---

    /** {@code unsigned int ZSTD_getDictID_fromDict(void const * dict, size_t dictSize)} */
    public static native int nZSTD_getDictID_fromDict(long dict, long dictSize);

    /** {@code unsigned int ZSTD_getDictID_fromDict(void const * dict, size_t dictSize)} */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromDict(@NativeType("void const *") ByteBuffer dict) {
        return nZSTD_getDictID_fromDict(memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_getDictID_fromCDict ] ---

    /** {@code unsigned ZSTD_getDictID_fromCDict(ZSTD_CDict const * cdict)} */
    public static native int nZSTD_getDictID_fromCDict(long cdict);

    /** {@code unsigned ZSTD_getDictID_fromCDict(ZSTD_CDict const * cdict)} */
    @NativeType("unsigned")
    public static int ZSTD_getDictID_fromCDict(@NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cdict);
        }
        return nZSTD_getDictID_fromCDict(cdict);
    }

    // --- [ ZSTD_getDictID_fromDDict ] ---

    /** {@code unsigned int ZSTD_getDictID_fromDDict(ZSTD_DDict const * ddict)} */
    public static native int nZSTD_getDictID_fromDDict(long ddict);

    /** {@code unsigned int ZSTD_getDictID_fromDDict(ZSTD_DDict const * ddict)} */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromDDict(@NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(ddict);
        }
        return nZSTD_getDictID_fromDDict(ddict);
    }

    // --- [ ZSTD_getDictID_fromFrame ] ---

    /** {@code unsigned int ZSTD_getDictID_fromFrame(void const * src, size_t srcSize)} */
    public static native int nZSTD_getDictID_fromFrame(long src, long srcSize);

    /** {@code unsigned int ZSTD_getDictID_fromFrame(void const * src, size_t srcSize)} */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getDictID_fromFrame(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_CCtx_loadDictionary ] ---

    /** {@code size_t ZSTD_CCtx_loadDictionary(ZSTD_CCtx * cctx, void const * dict, size_t dictSize)} */
    public static native long nZSTD_CCtx_loadDictionary(long cctx, long dict, long dictSize);

    /** {@code size_t ZSTD_CCtx_loadDictionary(ZSTD_CCtx * cctx, void const * dict, size_t dictSize)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") @Nullable ByteBuffer dict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary(cctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_CCtx_refCDict ] ---

    /** {@code size_t ZSTD_CCtx_refCDict(ZSTD_CCtx * cctx, ZSTD_CDict const * cdict)} */
    public static native long nZSTD_CCtx_refCDict(long cctx, long cdict);

    /** {@code size_t ZSTD_CCtx_refCDict(ZSTD_CCtx * cctx, ZSTD_CDict const * cdict)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refCDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refCDict(cctx, cdict);
    }

    // --- [ ZSTD_CCtx_refPrefix ] ---

    /** {@code size_t ZSTD_CCtx_refPrefix(ZSTD_CCtx * cctx, void const * prefix, size_t prefixSize)} */
    public static native long nZSTD_CCtx_refPrefix(long cctx, long prefix, long prefixSize);

    /** {@code size_t ZSTD_CCtx_refPrefix(ZSTD_CCtx * cctx, void const * prefix, size_t prefixSize)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") @Nullable ByteBuffer prefix) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix(cctx, memAddressSafe(prefix), remainingSafe(prefix));
    }

    // --- [ ZSTD_DCtx_loadDictionary ] ---

    /** {@code size_t ZSTD_DCtx_loadDictionary(ZSTD_DCtx * dctx, void const * dict, size_t dictSize)} */
    public static native long nZSTD_DCtx_loadDictionary(long dctx, long dict, long dictSize);

    /** {@code size_t ZSTD_DCtx_loadDictionary(ZSTD_DCtx * dctx, void const * dict, size_t dictSize)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") @Nullable ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary(dctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_DCtx_refDDict ] ---

    /** {@code size_t ZSTD_DCtx_refDDict(ZSTD_DCtx * dctx, ZSTD_DDict const * ddict)} */
    public static native long nZSTD_DCtx_refDDict(long dctx, long ddict);

    /** {@code size_t ZSTD_DCtx_refDDict(ZSTD_DCtx * dctx, ZSTD_DDict const * ddict)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refDDict(dctx, ddict);
    }

    // --- [ ZSTD_DCtx_refPrefix ] ---

    /** {@code size_t ZSTD_DCtx_refPrefix(ZSTD_DCtx * dctx, void const * prefix, size_t prefixSize)} */
    public static native long nZSTD_DCtx_refPrefix(long dctx, long prefix, long prefixSize);

    /** {@code size_t ZSTD_DCtx_refPrefix(ZSTD_DCtx * dctx, void const * prefix, size_t prefixSize)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix(dctx, memAddress(prefix), prefix.remaining());
    }

    // --- [ ZSTD_sizeof_CCtx ] ---

    /** {@code size_t ZSTD_sizeof_CCtx(ZSTD_CCtx const * cctx)} */
    public static native long nZSTD_sizeof_CCtx(long cctx);

    /** {@code size_t ZSTD_sizeof_CCtx(ZSTD_CCtx const * cctx)} */
    @NativeType("size_t")
    public static long ZSTD_sizeof_CCtx(@NativeType("ZSTD_CCtx const *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_sizeof_CCtx(cctx);
    }

    // --- [ ZSTD_sizeof_DCtx ] ---

    /** {@code size_t ZSTD_sizeof_DCtx(ZSTD_DCtx const * dctx)} */
    public static native long nZSTD_sizeof_DCtx(long dctx);

    /** {@code size_t ZSTD_sizeof_DCtx(ZSTD_DCtx const * dctx)} */
    @NativeType("size_t")
    public static long ZSTD_sizeof_DCtx(@NativeType("ZSTD_DCtx const *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_sizeof_DCtx(dctx);
    }

    // --- [ ZSTD_sizeof_CStream ] ---

    /** {@code size_t ZSTD_sizeof_CStream(ZSTD_CStream const * zcs)} */
    public static native long nZSTD_sizeof_CStream(long zcs);

    /** {@code size_t ZSTD_sizeof_CStream(ZSTD_CStream const * zcs)} */
    @NativeType("size_t")
    public static long ZSTD_sizeof_CStream(@NativeType("ZSTD_CStream const *") long zcs) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_sizeof_CStream(zcs);
    }

    // --- [ ZSTD_sizeof_DStream ] ---

    /** {@code size_t ZSTD_sizeof_DStream(ZSTD_DStream const * zds)} */
    public static native long nZSTD_sizeof_DStream(long zds);

    /** {@code size_t ZSTD_sizeof_DStream(ZSTD_DStream const * zds)} */
    @NativeType("size_t")
    public static long ZSTD_sizeof_DStream(@NativeType("ZSTD_DStream const *") long zds) {
        if (CHECKS) {
            check(zds);
        }
        return nZSTD_sizeof_DStream(zds);
    }

    // --- [ ZSTD_sizeof_CDict ] ---

    /** {@code size_t ZSTD_sizeof_CDict(ZSTD_CDict const * cdict)} */
    public static native long nZSTD_sizeof_CDict(long cdict);

    /** {@code size_t ZSTD_sizeof_CDict(ZSTD_CDict const * cdict)} */
    @NativeType("size_t")
    public static long ZSTD_sizeof_CDict(@NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cdict);
        }
        return nZSTD_sizeof_CDict(cdict);
    }

    // --- [ ZSTD_sizeof_DDict ] ---

    /** {@code size_t ZSTD_sizeof_DDict(ZSTD_DDict const * ddict)} */
    public static native long nZSTD_sizeof_DDict(long ddict);

    /** {@code size_t ZSTD_sizeof_DDict(ZSTD_DDict const * ddict)} */
    @NativeType("size_t")
    public static long ZSTD_sizeof_DDict(@NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(ddict);
        }
        return nZSTD_sizeof_DDict(ddict);
    }

    /** Pure Java version of {@link #ZSTD_compressBound}. */
    public static long ZSTD_COMPRESSBOUND(long srcSize) {
        /* this formula ensures that bound(A) + bound(B) <= bound(A+B) as long as A and B >= 128 KB */
        return srcSize
            + (srcSize >> 8)
            + (srcSize < (128 << 10)
                ? (128 << 10) - srcSize >> 11 /* margin, from 64 to 0 */
                : 0
            );
    }

}