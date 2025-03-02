/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.zstd.Zstd.*;

public class ZstdX {

    static { LibZstd.initialize(); }

    public static final int
        ZSTD_dct_auto       = 0,
        ZSTD_dct_rawContent = 1,
        ZSTD_dct_fullDict   = 2;

    public static final int
        ZSTD_dlm_byCopy = 0,
        ZSTD_dlm_byRef  = 1;

    public static final int
        ZSTD_f_zstd1           = 0,
        ZSTD_f_zstd1_magicless = 1;

    public static final int
        ZSTD_d_validateChecksum = 0,
        ZSTD_d_ignoreChecksum   = 1;

    public static final int
        ZSTD_rmd_refSingleDDict    = 0,
        ZSTD_rmd_refMultipleDDicts = 1;

    public static final int
        ZSTD_dictDefaultAttach = 0,
        ZSTD_dictForceAttach   = 1,
        ZSTD_dictForceCopy     = 2,
        ZSTD_dictForceLoad     = 3;

    public static final int
        ZSTD_frame          = 0,
        ZSTD_skippableFrame = 1;

    public static final int
        ZSTDnit_frameHeader    = 0,
        ZSTDnit_blockHeader    = 1,
        ZSTDnit_block          = 2,
        ZSTDnit_lastBlock      = 3,
        ZSTDnit_checksum       = 4,
        ZSTDnit_skippableFrame = 5;

    public static final int ZSTD_FRAMEHEADERSIZE_MAX = 18;

    public static final int ZSTD_SKIPPABLEHEADERSIZE = 8;

    public static final int ZSTD_WINDOWLOG_MAX_32 = 30;

    public static final int ZSTD_WINDOWLOG_MAX_64 = 31;

    public static final int ZSTD_WINDOWLOG_MAX = Pointer.POINTER_SIZE == 64 ? ZSTD_WINDOWLOG_MAX_64 : ZSTD_WINDOWLOG_MAX_32;

    public static final int ZSTD_WINDOWLOG_MIN = 10;

    public static final int ZSTD_HASHLOG_MAX = ZSTD_WINDOWLOG_MAX < 30 ? ZSTD_WINDOWLOG_MAX : 30;

    public static final int ZSTD_HASHLOG_MIN = 6;

    public static final int ZSTD_CHAINLOG_MAX_32 = 29;

    public static final int ZSTD_CHAINLOG_MAX_64 = 30;

    public static final int ZSTD_CHAINLOG_MAX = Pointer.POINTER_SIZE == 64 ? ZSTD_CHAINLOG_MAX_64 : ZSTD_CHAINLOG_MAX_32;

    public static final int ZSTD_CHAINLOG_MIN = ZSTD_HASHLOG_MIN;

    public static final int ZSTD_SEARCHLOG_MIN = 1;

    public static final int ZSTD_MINMATCH_MAX = 7;

    public static final int ZSTD_MINMATCH_MIN = 3;

    public static final int ZSTD_TARGETLENGTH_MAX = ZSTD_BLOCKSIZE_MAX;

    public static final int ZSTD_TARGETLENGTH_MIN = 0;

    public static final int ZSTD_STRATEGY_MIN = ZSTD_fast;

    public static final int ZSTD_STRATEGY_MAX = ZSTD_btultra2;

    public static final int ZSTD_BLOCKSIZE_MAX_MIN = 1 << 10;

    public static final int ZSTD_OVERLAPLOG_MIN = 0;

    public static final int ZSTD_OVERLAPLOG_MAX = 9;

    public static final int ZSTD_WINDOWLOG_LIMIT_DEFAULT = 27;

    public static final int ZSTD_LDM_HASHLOG_MIN = ZSTD_HASHLOG_MIN;

    public static final int ZSTD_LDM_HASHLOG_MAX = ZSTD_HASHLOG_MAX;

    public static final int ZSTD_LDM_MINMATCH_MIN = 4;

    public static final int ZSTD_LDM_MINMATCH_MAX = 4096;

    public static final int ZSTD_LDM_BUCKETSIZELOG_MIN = 1;

    public static final int ZSTD_LDM_BUCKETSIZELOG_MAX = 8;

    public static final int ZSTD_LDM_HASHRATELOG_MIN = 0;

    public static final int ZSTD_TARGETCBLOCKSIZE_MIN = 1340;

    public static final int ZSTD_TARGETCBLOCKSIZE_MAX = ZSTD_BLOCKSIZE_MAX;

    public static final int ZSTD_SRCSIZEHINT_MIN = 0;

    public static final int ZSTD_SRCSIZEHINT_MAX = Integer.MAX_VALUE;

    public static final int ZSTD_BLOCKSPLITTER_LEVEL_MAX = 6;

    public static final int
        ZSTD_c_rsyncable                 = ZSTD_c_experimentalParam1,
        ZSTD_c_format                    = ZSTD_c_experimentalParam2,
        ZSTD_c_forceMaxWindow            = ZSTD_c_experimentalParam3,
        ZSTD_c_forceAttachDict           = ZSTD_c_experimentalParam4,
        ZSTD_c_literalCompressionMode    = ZSTD_c_experimentalParam5,
        ZSTD_c_srcSizeHint               = ZSTD_c_experimentalParam7,
        ZSTD_c_enableDedicatedDictSearch = ZSTD_c_experimentalParam8,
        ZSTD_c_stableInBuffer            = ZSTD_c_experimentalParam9,
        ZSTD_c_stableOutBuffer           = ZSTD_c_experimentalParam10,
        ZSTD_c_blockDelimiters           = ZSTD_c_experimentalParam11,
        ZSTD_c_validateSequences         = ZSTD_c_experimentalParam12,
        ZSTD_c_blockSplitterLevel        = ZSTD_c_experimentalParam20,
        ZSTD_c_splitAfterSequences       = ZSTD_c_experimentalParam13,
        ZSTD_c_useRowMatchFinder         = ZSTD_c_experimentalParam14,
        ZSTD_c_deterministicRefPrefix    = ZSTD_c_experimentalParam15,
        ZSTD_c_prefetchCDictTables       = ZSTD_c_experimentalParam16,
        ZSTD_c_enableSeqProducerFallback = ZSTD_c_experimentalParam17,
        ZSTD_c_maxBlockSize              = ZSTD_c_experimentalParam18,
        ZSTD_c_repcodeResolution         = ZSTD_c_experimentalParam19;

    public static final int
        ZSTD_d_format                 = ZSTD_d_experimentalParam1,
        ZSTD_d_stableOutBuffer        = ZSTD_d_experimentalParam2,
        ZSTD_d_forceIgnoreChecksum    = ZSTD_d_experimentalParam3,
        ZSTD_d_refMultipleDDicts      = ZSTD_d_experimentalParam4,
        ZSTD_d_disableHuffmanAssembly = ZSTD_d_experimentalParam5,
        ZSTD_d_maxBlockSize           = ZSTD_d_experimentalParam6;

    public static final int
        ZSTD_lcm_auto         = 0,
        ZSTD_lcm_huffman      = 1,
        ZSTD_lcm_uncompressed = 2;

    public static final int
        ZSTD_ps_auto    = 0,
        ZSTD_ps_enable  = 1,
        ZSTD_ps_disable = 2;

    public static final int
        ZSTD_sf_noBlockDelimiters       = 0,
        ZSTD_sf_explicitBlockDelimiters = 1;

    public static final long ZSTD_SEQUENCE_PRODUCER_ERROR = -1L;

    protected ZstdX() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_findDecompressedSize ] ---

    /** {@code unsigned long long ZSTD_findDecompressedSize(void const * src, size_t srcSize)} */
    public static native long nZSTD_findDecompressedSize(long src, long srcSize);

    /** {@code unsigned long long ZSTD_findDecompressedSize(void const * src, size_t srcSize)} */
    @NativeType("unsigned long long")
    public static long ZSTD_findDecompressedSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_findDecompressedSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_decompressBound ] ---

    /** {@code unsigned long long ZSTD_decompressBound(void const * src, size_t srcSize)} */
    public static native long nZSTD_decompressBound(long src, long srcSize);

    /** {@code unsigned long long ZSTD_decompressBound(void const * src, size_t srcSize)} */
    @NativeType("unsigned long long")
    public static long ZSTD_decompressBound(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_decompressBound(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_frameHeaderSize ] ---

    /** {@code size_t ZSTD_frameHeaderSize(void const * src, size_t srcSize)} */
    public static native long nZSTD_frameHeaderSize(long src, long srcSize);

    /** {@code size_t ZSTD_frameHeaderSize(void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_frameHeaderSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_frameHeaderSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameHeader ] ---

    /** {@code size_t ZSTD_getFrameHeader(ZSTD_FrameHeader * zfhPtr, void const * src, size_t srcSize)} */
    public static native long nZSTD_getFrameHeader(long zfhPtr, long src, long srcSize);

    /** {@code size_t ZSTD_getFrameHeader(ZSTD_FrameHeader * zfhPtr, void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_getFrameHeader(@NativeType("ZSTD_FrameHeader *") ZSTDFrameHeader zfhPtr, @NativeType("void const *") ByteBuffer src) {
        return nZSTD_getFrameHeader(zfhPtr.address(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameHeader_advanced ] ---

    /** {@code size_t ZSTD_getFrameHeader_advanced(ZSTD_FrameHeader * zfhPtr, void const * src, size_t srcSize, ZSTD_format_e format)} */
    public static native long nZSTD_getFrameHeader_advanced(long zfhPtr, long src, long srcSize, int format);

    /** {@code size_t ZSTD_getFrameHeader_advanced(ZSTD_FrameHeader * zfhPtr, void const * src, size_t srcSize, ZSTD_format_e format)} */
    @NativeType("size_t")
    public static long ZSTD_getFrameHeader_advanced(@NativeType("ZSTD_FrameHeader *") ZSTDFrameHeader zfhPtr, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_format_e") int format) {
        return nZSTD_getFrameHeader_advanced(zfhPtr.address(), memAddress(src), src.remaining(), format);
    }

    // --- [ ZSTD_decompressionMargin ] ---

    /** {@code size_t ZSTD_decompressionMargin(void const * src, size_t srcSize)} */
    public static native long nZSTD_decompressionMargin(long src, long srcSize);

    /** {@code size_t ZSTD_decompressionMargin(void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_decompressionMargin(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_decompressionMargin(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_sequenceBound ] ---

    /** {@code size_t ZSTD_sequenceBound(size_t srcSize)} */
    @NativeType("size_t")
    public static native long ZSTD_sequenceBound(@NativeType("size_t") long srcSize);

    // --- [ ZSTD_mergeBlockDelimiters ] ---

    /** {@code size_t ZSTD_mergeBlockDelimiters(ZSTD_Sequence * sequences, size_t seqsSize)} */
    public static native long nZSTD_mergeBlockDelimiters(long sequences, long seqsSize);

    /** {@code size_t ZSTD_mergeBlockDelimiters(ZSTD_Sequence * sequences, size_t seqsSize)} */
    @NativeType("size_t")
    public static long ZSTD_mergeBlockDelimiters(@NativeType("ZSTD_Sequence *") ZSTDSequence.Buffer sequences) {
        return nZSTD_mergeBlockDelimiters(sequences.address(), sequences.remaining());
    }

    // --- [ ZSTD_compressSequences ] ---

    /** {@code size_t ZSTD_compressSequences(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, ZSTD_Sequence const * inSeqs, size_t inSeqsSize, void const * src, size_t srcSize)} */
    public static native long nZSTD_compressSequences(long cctx, long dst, long dstCapacity, long inSeqs, long inSeqsSize, long src, long srcSize);

    /** {@code size_t ZSTD_compressSequences(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, ZSTD_Sequence const * inSeqs, size_t inSeqsSize, void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_compressSequences(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("ZSTD_Sequence const *") ZSTDSequence.Buffer inSeqs, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressSequences(cctx, memAddress(dst), dst.remaining(), inSeqs.address(), inSeqs.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compressSequencesAndLiterals ] ---

    /** {@code size_t ZSTD_compressSequencesAndLiterals(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, ZSTD_Sequence const * inSeqs, size_t nbSequences, void const * literals, size_t litSize, size_t litBufCapacity, size_t decompressedSize)} */
    public static native long nZSTD_compressSequencesAndLiterals(long cctx, long dst, long dstCapacity, long inSeqs, long nbSequences, long literals, long litSize, long litBufCapacity, long decompressedSize);

    /** {@code size_t ZSTD_compressSequencesAndLiterals(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, ZSTD_Sequence const * inSeqs, size_t nbSequences, void const * literals, size_t litSize, size_t litBufCapacity, size_t decompressedSize)} */
    @NativeType("size_t")
    public static long ZSTD_compressSequencesAndLiterals(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("ZSTD_Sequence const *") ZSTDSequence.Buffer inSeqs, @NativeType("void const *") ByteBuffer literals, @NativeType("size_t") long litSize, @NativeType("size_t") long decompressedSize) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressSequencesAndLiterals(cctx, memAddress(dst), dst.remaining(), inSeqs.address(), inSeqs.remaining(), memAddress(literals), litSize, literals.remaining(), decompressedSize);
    }

    // --- [ ZSTD_writeSkippableFrame ] ---

    /** {@code size_t ZSTD_writeSkippableFrame(void * dst, size_t dstCapacity, void const * src, size_t srcSize, unsigned magicVariant)} */
    public static native long nZSTD_writeSkippableFrame(long dst, long dstCapacity, long src, long srcSize, int magicVariant);

    /** {@code size_t ZSTD_writeSkippableFrame(void * dst, size_t dstCapacity, void const * src, size_t srcSize, unsigned magicVariant)} */
    @NativeType("size_t")
    public static long ZSTD_writeSkippableFrame(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("unsigned") int magicVariant) {
        return nZSTD_writeSkippableFrame(memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), magicVariant);
    }

    // --- [ ZSTD_readSkippableFrame ] ---

    /** {@code size_t ZSTD_readSkippableFrame(void * dst, size_t dstCapacity, unsigned * magicVariant, void const * src, size_t srcSize)} */
    public static native long nZSTD_readSkippableFrame(long dst, long dstCapacity, long magicVariant, long src, long srcSize);

    /** {@code size_t ZSTD_readSkippableFrame(void * dst, size_t dstCapacity, unsigned * magicVariant, void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_readSkippableFrame(@NativeType("void *") ByteBuffer dst, @NativeType("unsigned *") @Nullable IntBuffer magicVariant, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            checkSafe(magicVariant, 1);
        }
        return nZSTD_readSkippableFrame(memAddress(dst), dst.remaining(), memAddressSafe(magicVariant), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_isSkippableFrame ] ---

    /** {@code unsigned ZSTD_isSkippableFrame(void const * buffer, size_t size)} */
    public static native int nZSTD_isSkippableFrame(long buffer, long size);

    /** {@code unsigned ZSTD_isSkippableFrame(void const * buffer, size_t size)} */
    @NativeType("unsigned")
    public static boolean ZSTD_isSkippableFrame(@NativeType("void const *") ByteBuffer buffer) {
        return nZSTD_isSkippableFrame(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ ZSTD_estimateCCtxSize ] ---

    /** {@code size_t ZSTD_estimateCCtxSize(int maxCompressionLevel)} */
    @NativeType("size_t")
    public static native long ZSTD_estimateCCtxSize(int maxCompressionLevel);

    // --- [ ZSTD_estimateCCtxSize_usingCParams ] ---

    /** {@code size_t ZSTD_estimateCCtxSize_usingCParams(ZSTD_compressionParameters cParams)} */
    public static native long nZSTD_estimateCCtxSize_usingCParams(long cParams);

    /** {@code size_t ZSTD_estimateCCtxSize_usingCParams(ZSTD_compressionParameters cParams)} */
    @NativeType("size_t")
    public static long ZSTD_estimateCCtxSize_usingCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_estimateCCtxSize_usingCParams(cParams.address());
    }

    // --- [ ZSTD_estimateCCtxSize_usingCCtxParams ] ---

    /** {@code size_t ZSTD_estimateCCtxSize_usingCCtxParams(ZSTD_CCtx_params const * params)} */
    public static native long nZSTD_estimateCCtxSize_usingCCtxParams(long params);

    /** {@code size_t ZSTD_estimateCCtxSize_usingCCtxParams(ZSTD_CCtx_params const * params)} */
    @NativeType("size_t")
    public static long ZSTD_estimateCCtxSize_usingCCtxParams(@NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_estimateCCtxSize_usingCCtxParams(params);
    }

    // --- [ ZSTD_estimateDCtxSize ] ---

    /** {@code size_t ZSTD_estimateDCtxSize(void)} */
    @NativeType("size_t")
    public static native long ZSTD_estimateDCtxSize();

    // --- [ ZSTD_estimateCStreamSize ] ---

    /** {@code size_t ZSTD_estimateCStreamSize(int maxCompressionLevel)} */
    @NativeType("size_t")
    public static native long ZSTD_estimateCStreamSize(int maxCompressionLevel);

    // --- [ ZSTD_estimateCStreamSize_usingCParams ] ---

    /** {@code size_t ZSTD_estimateCStreamSize_usingCParams(ZSTD_compressionParameters cParams)} */
    public static native long nZSTD_estimateCStreamSize_usingCParams(long cParams);

    /** {@code size_t ZSTD_estimateCStreamSize_usingCParams(ZSTD_compressionParameters cParams)} */
    @NativeType("size_t")
    public static long ZSTD_estimateCStreamSize_usingCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_estimateCStreamSize_usingCParams(cParams.address());
    }

    // --- [ ZSTD_estimateCStreamSize_usingCCtxParams ] ---

    /** {@code size_t ZSTD_estimateCStreamSize_usingCCtxParams(ZSTD_CCtx_params const * params)} */
    public static native long nZSTD_estimateCStreamSize_usingCCtxParams(long params);

    /** {@code size_t ZSTD_estimateCStreamSize_usingCCtxParams(ZSTD_CCtx_params const * params)} */
    @NativeType("size_t")
    public static long ZSTD_estimateCStreamSize_usingCCtxParams(@NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_estimateCStreamSize_usingCCtxParams(params);
    }

    // --- [ ZSTD_estimateDStreamSize ] ---

    /** {@code size_t ZSTD_estimateDStreamSize(size_t maxWindowSize)} */
    @NativeType("size_t")
    public static native long ZSTD_estimateDStreamSize(@NativeType("size_t") long maxWindowSize);

    // --- [ ZSTD_estimateDStreamSize_fromFrame ] ---

    /** {@code size_t ZSTD_estimateDStreamSize_fromFrame(void const * src, size_t srcSize)} */
    public static native long nZSTD_estimateDStreamSize_fromFrame(long src, long srcSize);

    /** {@code size_t ZSTD_estimateDStreamSize_fromFrame(void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_estimateDStreamSize_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_estimateDStreamSize_fromFrame(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_estimateCDictSize ] ---

    /** {@code size_t ZSTD_estimateCDictSize(size_t dictSize, int compressionLevel)} */
    @NativeType("size_t")
    public static native long ZSTD_estimateCDictSize(@NativeType("size_t") long dictSize, int compressionLevel);

    // --- [ ZSTD_estimateCDictSize_advanced ] ---

    /** {@code size_t ZSTD_estimateCDictSize_advanced(size_t dictSize, ZSTD_compressionParameters cParams, ZSTD_dictLoadMethod_e dictLoadMethod)} */
    public static native long nZSTD_estimateCDictSize_advanced(long dictSize, long cParams, int dictLoadMethod);

    /** {@code size_t ZSTD_estimateCDictSize_advanced(size_t dictSize, ZSTD_compressionParameters cParams, ZSTD_dictLoadMethod_e dictLoadMethod)} */
    @NativeType("size_t")
    public static long ZSTD_estimateCDictSize_advanced(@NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod) {
        return nZSTD_estimateCDictSize_advanced(dictSize, cParams.address(), dictLoadMethod);
    }

    // --- [ ZSTD_estimateDDictSize ] ---

    /** {@code size_t ZSTD_estimateDDictSize(size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod)} */
    @NativeType("size_t")
    public static native long ZSTD_estimateDDictSize(@NativeType("size_t") long dictSize, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod);

    // --- [ ZSTD_initStaticCCtx ] ---

    /** {@code ZSTD_CCtx * ZSTD_initStaticCCtx(void * workspace, size_t workspaceSize)} */
    public static native long nZSTD_initStaticCCtx(long workspace, long workspaceSize);

    /** {@code ZSTD_CCtx * ZSTD_initStaticCCtx(void * workspace, size_t workspaceSize)} */
    @NativeType("ZSTD_CCtx *")
    public static long ZSTD_initStaticCCtx(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticCCtx(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticCStream ] ---

    /** {@code ZSTD_CStream * ZSTD_initStaticCStream(void * workspace, size_t workspaceSize)} */
    public static native long nZSTD_initStaticCStream(long workspace, long workspaceSize);

    /** {@code ZSTD_CStream * ZSTD_initStaticCStream(void * workspace, size_t workspaceSize)} */
    @NativeType("ZSTD_CStream *")
    public static long ZSTD_initStaticCStream(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticCStream(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticDCtx ] ---

    /** {@code ZSTD_DCtx * ZSTD_initStaticDCtx(void * workspace, size_t workspaceSize)} */
    public static native long nZSTD_initStaticDCtx(long workspace, long workspaceSize);

    /** {@code ZSTD_DCtx * ZSTD_initStaticDCtx(void * workspace, size_t workspaceSize)} */
    @NativeType("ZSTD_DCtx *")
    public static long ZSTD_initStaticDCtx(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticDCtx(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticDStream ] ---

    /** {@code ZSTD_DStream * ZSTD_initStaticDStream(void * workspace, size_t workspaceSize)} */
    public static native long nZSTD_initStaticDStream(long workspace, long workspaceSize);

    /** {@code ZSTD_DStream * ZSTD_initStaticDStream(void * workspace, size_t workspaceSize)} */
    @NativeType("ZSTD_DStream *")
    public static long ZSTD_initStaticDStream(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticDStream(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticCDict ] ---

    /** {@code ZSTD_CDict const * ZSTD_initStaticCDict(void * workspace, size_t workspaceSize, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_compressionParameters cParams)} */
    public static native long nZSTD_initStaticCDict(long workspace, long workspaceSize, long dict, long dictSize, int dictLoadMethod, int dictContentType, long cParams);

    /** {@code ZSTD_CDict const * ZSTD_initStaticCDict(void * workspace, size_t workspaceSize, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_compressionParameters cParams)} */
    @NativeType("ZSTD_CDict const *")
    public static long ZSTD_initStaticCDict(@NativeType("void *") ByteBuffer workspace, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_initStaticCDict(memAddress(workspace), workspace.remaining(), memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cParams.address());
    }

    // --- [ ZSTD_initStaticDDict ] ---

    /** {@code ZSTD_DDict const * ZSTD_initStaticDDict(void * workspace, size_t workspaceSize, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType)} */
    public static native long nZSTD_initStaticDDict(long workspace, long workspaceSize, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /** {@code ZSTD_DDict const * ZSTD_initStaticDDict(void * workspace, size_t workspaceSize, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType)} */
    @NativeType("ZSTD_DDict const *")
    public static long ZSTD_initStaticDDict(@NativeType("void *") ByteBuffer workspace, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        return nZSTD_initStaticDDict(memAddress(workspace), workspace.remaining(), memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_createCCtx_advanced ] ---

    /** {@code ZSTD_CCtx * ZSTD_createCCtx_advanced(ZSTD_customMem customMem)} */
    public static native long nZSTD_createCCtx_advanced(long customMem);

    /** {@code ZSTD_CCtx * ZSTD_createCCtx_advanced(ZSTD_customMem customMem)} */
    @NativeType("ZSTD_CCtx *")
    public static long ZSTD_createCCtx_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCCtx_advanced(customMem.address());
    }

    // --- [ ZSTD_createCStream_advanced ] ---

    /** {@code ZSTD_CStream * ZSTD_createCStream_advanced(ZSTD_customMem customMem)} */
    public static native long nZSTD_createCStream_advanced(long customMem);

    /** {@code ZSTD_CStream * ZSTD_createCStream_advanced(ZSTD_customMem customMem)} */
    @NativeType("ZSTD_CStream *")
    public static long ZSTD_createCStream_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCStream_advanced(customMem.address());
    }

    // --- [ ZSTD_createDCtx_advanced ] ---

    /** {@code ZSTD_DCtx * ZSTD_createDCtx_advanced(ZSTD_customMem customMem)} */
    public static native long nZSTD_createDCtx_advanced(long customMem);

    /** {@code ZSTD_DCtx * ZSTD_createDCtx_advanced(ZSTD_customMem customMem)} */
    @NativeType("ZSTD_DCtx *")
    public static long ZSTD_createDCtx_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createDCtx_advanced(customMem.address());
    }

    // --- [ ZSTD_createDStream_advanced ] ---

    /** {@code ZSTD_DStream * ZSTD_createDStream_advanced(ZSTD_customMem customMem)} */
    public static native long nZSTD_createDStream_advanced(long customMem);

    /** {@code ZSTD_DStream * ZSTD_createDStream_advanced(ZSTD_customMem customMem)} */
    @NativeType("ZSTD_DStream *")
    public static long ZSTD_createDStream_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createDStream_advanced(customMem.address());
    }

    // --- [ ZSTD_createCDict_advanced ] ---

    /** {@code ZSTD_CDict * ZSTD_createCDict_advanced(void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_compressionParameters cParams, ZSTD_customMem customMem)} */
    public static native long nZSTD_createCDict_advanced(long dict, long dictSize, int dictLoadMethod, int dictContentType, long cParams, long customMem);

    /** {@code ZSTD_CDict * ZSTD_createCDict_advanced(void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_compressionParameters cParams, ZSTD_customMem customMem)} */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_advanced(@NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams, @NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCDict_advanced(memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cParams.address(), customMem.address());
    }

    // --- [ ZSTD_createThreadPool ] ---

    /** {@code ZSTD_threadPool * ZSTD_createThreadPool(size_t numThreads)} */
    @NativeType("ZSTD_threadPool *")
    public static native long ZSTD_createThreadPool(@NativeType("size_t") long numThreads);

    // --- [ ZSTD_freeThreadPool ] ---

    /** {@code void ZSTD_freeThreadPool(ZSTD_threadPool * pool)} */
    public static native void ZSTD_freeThreadPool(@NativeType("ZSTD_threadPool *") long pool);

    // --- [ ZSTD_CCtx_refThreadPool ] ---

    /** {@code size_t ZSTD_CCtx_refThreadPool(ZSTD_CCtx * cctx, ZSTD_threadPool * pool)} */
    public static native long nZSTD_CCtx_refThreadPool(long cctx, long pool);

    /** {@code size_t ZSTD_CCtx_refThreadPool(ZSTD_CCtx * cctx, ZSTD_threadPool * pool)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refThreadPool(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_threadPool *") long pool) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refThreadPool(cctx, pool);
    }

    // --- [ ZSTD_createCDict_advanced2 ] ---

    /** {@code ZSTD_CDict * ZSTD_createCDict_advanced2(void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_CCtx_params const * cctxParams, ZSTD_customMem customMem)} */
    public static native long nZSTD_createCDict_advanced2(long dict, long dictSize, int dictLoadMethod, int dictContentType, long cctxParams, long customMem);

    /** {@code ZSTD_CDict * ZSTD_createCDict_advanced2(void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_CCtx_params const * cctxParams, ZSTD_customMem customMem)} */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_advanced2(@NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_CCtx_params const *") long cctxParams, @NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            check(cctxParams);
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCDict_advanced2(memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cctxParams, customMem.address());
    }

    // --- [ ZSTD_createDDict_advanced ] ---

    /** {@code ZSTD_DDict * ZSTD_createDDict_advanced(void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_customMem customMem)} */
    public static native long nZSTD_createDDict_advanced(long dict, long dictSize, int dictLoadMethod, int dictContentType, long customMem);

    /** {@code ZSTD_DDict * ZSTD_createDDict_advanced(void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType, ZSTD_customMem customMem)} */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict_advanced(@NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createDDict_advanced(memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, customMem.address());
    }

    // --- [ ZSTD_createCDict_byReference ] ---

    /** {@code ZSTD_CDict * ZSTD_createCDict_byReference(void const * dictBuffer, size_t dictSize, int compressionLevel)} */
    public static native long nZSTD_createCDict_byReference(long dictBuffer, long dictSize, int compressionLevel);

    /** {@code ZSTD_CDict * ZSTD_createCDict_byReference(void const * dictBuffer, size_t dictSize, int compressionLevel)} */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_byReference(@NativeType("void const *") ByteBuffer dictBuffer, int compressionLevel) {
        return nZSTD_createCDict_byReference(memAddress(dictBuffer), dictBuffer.remaining(), compressionLevel);
    }

    // --- [ ZSTD_getCParams ] ---

    /** {@code ZSTD_compressionParameters ZSTD_getCParams(int compressionLevel, unsigned long long estimatedSrcSize, size_t dictSize)} */
    public static native void nZSTD_getCParams(int compressionLevel, long estimatedSrcSize, long dictSize, long __result);

    /** {@code ZSTD_compressionParameters ZSTD_getCParams(int compressionLevel, unsigned long long estimatedSrcSize, size_t dictSize)} */
    @NativeType("ZSTD_compressionParameters")
    public static ZSTDCompressionParameters ZSTD_getCParams(int compressionLevel, @NativeType("unsigned long long") long estimatedSrcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters __result) {
        nZSTD_getCParams(compressionLevel, estimatedSrcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_getParams ] ---

    /** {@code ZSTD_parameters ZSTD_getParams(int compressionLevel, unsigned long long estimatedSrcSize, size_t dictSize)} */
    public static native void nZSTD_getParams(int compressionLevel, long estimatedSrcSize, long dictSize, long __result);

    /** {@code ZSTD_parameters ZSTD_getParams(int compressionLevel, unsigned long long estimatedSrcSize, size_t dictSize)} */
    @NativeType("ZSTD_parameters")
    public static ZSTDParameters ZSTD_getParams(int compressionLevel, @NativeType("unsigned long long") long estimatedSrcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_parameters") ZSTDParameters __result) {
        nZSTD_getParams(compressionLevel, estimatedSrcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_checkCParams ] ---

    /** {@code size_t ZSTD_checkCParams(ZSTD_compressionParameters params)} */
    public static native long nZSTD_checkCParams(long params);

    /** {@code size_t ZSTD_checkCParams(ZSTD_compressionParameters params)} */
    @NativeType("size_t")
    public static long ZSTD_checkCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters params) {
        return nZSTD_checkCParams(params.address());
    }

    // --- [ ZSTD_adjustCParams ] ---

    /** {@code ZSTD_compressionParameters ZSTD_adjustCParams(ZSTD_compressionParameters cPar, unsigned long long srcSize, size_t dictSize)} */
    public static native void nZSTD_adjustCParams(long cPar, long srcSize, long dictSize, long __result);

    /** {@code ZSTD_compressionParameters ZSTD_adjustCParams(ZSTD_compressionParameters cPar, unsigned long long srcSize, size_t dictSize)} */
    @NativeType("ZSTD_compressionParameters")
    public static ZSTDCompressionParameters ZSTD_adjustCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cPar, @NativeType("unsigned long long") long srcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters __result) {
        nZSTD_adjustCParams(cPar.address(), srcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_CCtx_setCParams ] ---

    /** {@code size_t ZSTD_CCtx_setCParams(ZSTD_CCtx * cctx, ZSTD_compressionParameters cparams)} */
    public static native long nZSTD_CCtx_setCParams(long cctx, long cparams);

    /** {@code size_t ZSTD_CCtx_setCParams(ZSTD_CCtx * cctx, ZSTD_compressionParameters cparams)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setCParams(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cparams) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setCParams(cctx, cparams.address());
    }

    // --- [ ZSTD_CCtx_setFParams ] ---

    /** {@code size_t ZSTD_CCtx_setFParams(ZSTD_CCtx * cctx, ZSTD_frameParameters fparams)} */
    public static native long nZSTD_CCtx_setFParams(long cctx, long fparams);

    /** {@code size_t ZSTD_CCtx_setFParams(ZSTD_CCtx * cctx, ZSTD_frameParameters fparams)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setFParams(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_frameParameters") ZSTDFrameParameters fparams) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setFParams(cctx, fparams.address());
    }

    // --- [ ZSTD_CCtx_setParams ] ---

    /** {@code size_t ZSTD_CCtx_setParams(ZSTD_CCtx * cctx, ZSTD_parameters params)} */
    public static native long nZSTD_CCtx_setParams(long cctx, long params);

    /** {@code size_t ZSTD_CCtx_setParams(ZSTD_CCtx * cctx, ZSTD_parameters params)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParams(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_parameters") ZSTDParameters params) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setParams(cctx, params.address());
    }

    // --- [ ZSTD_CCtx_loadDictionary_byReference ] ---

    /** {@code size_t ZSTD_CCtx_loadDictionary_byReference(ZSTD_CCtx * cctx, void const * dict, size_t dictSize)} */
    public static native long nZSTD_CCtx_loadDictionary_byReference(long cctx, long dict, long dictSize);

    /** {@code size_t ZSTD_CCtx_loadDictionary_byReference(ZSTD_CCtx * cctx, void const * dict, size_t dictSize)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary_byReference(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary_byReference(cctx, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_CCtx_loadDictionary_advanced ] ---

    /** {@code size_t ZSTD_CCtx_loadDictionary_advanced(ZSTD_CCtx * cctx, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType)} */
    public static native long nZSTD_CCtx_loadDictionary_advanced(long cctx, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /** {@code size_t ZSTD_CCtx_loadDictionary_advanced(ZSTD_CCtx * cctx, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary_advanced(cctx, memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_CCtx_refPrefix_advanced ] ---

    /** {@code size_t ZSTD_CCtx_refPrefix_advanced(ZSTD_CCtx * cctx, void const * prefix, size_t prefixSize, ZSTD_dictContentType_e dictContentType)} */
    public static native long nZSTD_CCtx_refPrefix_advanced(long cctx, long prefix, long prefixSize, int dictContentType);

    /** {@code size_t ZSTD_CCtx_refPrefix_advanced(ZSTD_CCtx * cctx, void const * prefix, size_t prefixSize, ZSTD_dictContentType_e dictContentType)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer prefix, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix_advanced(cctx, memAddress(prefix), prefix.remaining(), dictContentType);
    }

    // --- [ ZSTD_CCtx_getParameter ] ---

    /** {@code size_t ZSTD_CCtx_getParameter(ZSTD_CCtx const * cctx, ZSTD_cParameter param, int * value)} */
    public static native long nZSTD_CCtx_getParameter(long cctx, int param, long value);

    /** {@code size_t ZSTD_CCtx_getParameter(ZSTD_CCtx const * cctx, ZSTD_cParameter param, int * value)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_getParameter(@NativeType("ZSTD_CCtx const *") long cctx, @NativeType("ZSTD_cParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(cctx);
            check(value, 1);
        }
        return nZSTD_CCtx_getParameter(cctx, param, memAddress(value));
    }

    // --- [ ZSTD_createCCtxParams ] ---

    /** {@code ZSTD_CCtx_params * ZSTD_createCCtxParams(void)} */
    @NativeType("ZSTD_CCtx_params *")
    public static native long ZSTD_createCCtxParams();

    // --- [ ZSTD_freeCCtxParams ] ---

    /** {@code size_t ZSTD_freeCCtxParams(ZSTD_CCtx_params * params)} */
    @NativeType("size_t")
    public static native long ZSTD_freeCCtxParams(@NativeType("ZSTD_CCtx_params *") long params);

    // --- [ ZSTD_CCtxParams_reset ] ---

    /** {@code size_t ZSTD_CCtxParams_reset(ZSTD_CCtx_params * params)} */
    public static native long nZSTD_CCtxParams_reset(long params);

    /** {@code size_t ZSTD_CCtxParams_reset(ZSTD_CCtx_params * params)} */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_reset(@NativeType("ZSTD_CCtx_params *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_CCtxParams_reset(params);
    }

    // --- [ ZSTD_CCtxParams_init ] ---

    /** {@code size_t ZSTD_CCtxParams_init(ZSTD_CCtx_params * cctxParams, int compressionLevel)} */
    public static native long nZSTD_CCtxParams_init(long cctxParams, int compressionLevel);

    /** {@code size_t ZSTD_CCtxParams_init(ZSTD_CCtx_params * cctxParams, int compressionLevel)} */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_init(@NativeType("ZSTD_CCtx_params *") long cctxParams, int compressionLevel) {
        if (CHECKS) {
            check(cctxParams);
        }
        return nZSTD_CCtxParams_init(cctxParams, compressionLevel);
    }

    // --- [ ZSTD_CCtxParams_init_advanced ] ---

    /** {@code size_t ZSTD_CCtxParams_init_advanced(ZSTD_CCtx_params * cctxParams, ZSTD_parameters params)} */
    public static native long nZSTD_CCtxParams_init_advanced(long cctxParams, long params);

    /** {@code size_t ZSTD_CCtxParams_init_advanced(ZSTD_CCtx_params * cctxParams, ZSTD_parameters params)} */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_init_advanced(@NativeType("ZSTD_CCtx_params *") long cctxParams, @NativeType("ZSTD_parameters") ZSTDParameters params) {
        if (CHECKS) {
            check(cctxParams);
        }
        return nZSTD_CCtxParams_init_advanced(cctxParams, params.address());
    }

    // --- [ ZSTD_CCtxParams_setParameter ] ---

    /** {@code size_t ZSTD_CCtxParams_setParameter(ZSTD_CCtx_params * params, ZSTD_cParameter param, int value)} */
    public static native long nZSTD_CCtxParams_setParameter(long params, int param, int value);

    /** {@code size_t ZSTD_CCtxParams_setParameter(ZSTD_CCtx_params * params, ZSTD_cParameter param, int value)} */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_setParameter(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("ZSTD_cParameter") int param, int value) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_CCtxParams_setParameter(params, param, value);
    }

    // --- [ ZSTD_CCtxParams_getParameter ] ---

    /** {@code size_t ZSTD_CCtxParams_getParameter(ZSTD_CCtx_params const * params, ZSTD_cParameter param, int * value)} */
    public static native long nZSTD_CCtxParams_getParameter(long params, int param, long value);

    /** {@code size_t ZSTD_CCtxParams_getParameter(ZSTD_CCtx_params const * params, ZSTD_cParameter param, int * value)} */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_getParameter(@NativeType("ZSTD_CCtx_params const *") long params, @NativeType("ZSTD_cParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(params);
            check(value, 1);
        }
        return nZSTD_CCtxParams_getParameter(params, param, memAddress(value));
    }

    // --- [ ZSTD_CCtx_setParametersUsingCCtxParams ] ---

    /** {@code size_t ZSTD_CCtx_setParametersUsingCCtxParams(ZSTD_CCtx * cctx, ZSTD_CCtx_params const * params)} */
    public static native long nZSTD_CCtx_setParametersUsingCCtxParams(long cctx, long params);

    /** {@code size_t ZSTD_CCtx_setParametersUsingCCtxParams(ZSTD_CCtx * cctx, ZSTD_CCtx_params const * params)} */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParametersUsingCCtxParams(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(cctx);
            check(params);
        }
        return nZSTD_CCtx_setParametersUsingCCtxParams(cctx, params);
    }

    // --- [ ZSTD_compressStream2_simpleArgs ] ---

    /** {@code size_t ZSTD_compressStream2_simpleArgs(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, size_t * dstPos, void const * src, size_t srcSize, size_t * srcPos, ZSTD_EndDirective endOp)} */
    public static native long nZSTD_compressStream2_simpleArgs(long cctx, long dst, long dstCapacity, long dstPos, long src, long srcSize, long srcPos, int endOp);

    /** {@code size_t ZSTD_compressStream2_simpleArgs(ZSTD_CCtx * cctx, void * dst, size_t dstCapacity, size_t * dstPos, void const * src, size_t srcSize, size_t * srcPos, ZSTD_EndDirective endOp)} */
    @NativeType("size_t")
    public static long ZSTD_compressStream2_simpleArgs(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("size_t *") PointerBuffer dstPos, @NativeType("void const *") ByteBuffer src, @NativeType("size_t *") PointerBuffer srcPos, @NativeType("ZSTD_EndDirective") int endOp) {
        if (CHECKS) {
            check(cctx);
            check(dstPos, 1);
            check(srcPos, 1);
        }
        return nZSTD_compressStream2_simpleArgs(cctx, memAddress(dst), dst.remaining(), memAddress(dstPos), memAddress(src), src.remaining(), memAddress(srcPos), endOp);
    }

    // --- [ ZSTD_isFrame ] ---

    /** {@code unsigned int ZSTD_isFrame(void const * buffer, size_t size)} */
    public static native int nZSTD_isFrame(long buffer, long size);

    /** {@code unsigned int ZSTD_isFrame(void const * buffer, size_t size)} */
    @NativeType("unsigned int")
    public static boolean ZSTD_isFrame(@NativeType("void const *") ByteBuffer buffer) {
        return nZSTD_isFrame(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ ZSTD_createDDict_byReference ] ---

    /** {@code ZSTD_DDict * ZSTD_createDDict_byReference(void const * dictBuffer, size_t dictSize)} */
    public static native long nZSTD_createDDict_byReference(long dictBuffer, long dictSize);

    /** {@code ZSTD_DDict * ZSTD_createDDict_byReference(void const * dictBuffer, size_t dictSize)} */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict_byReference(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZSTD_createDDict_byReference(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZSTD_DCtx_loadDictionary_byReference ] ---

    /** {@code size_t ZSTD_DCtx_loadDictionary_byReference(ZSTD_DCtx * dctx, void const * dict, size_t dictSize)} */
    public static native long nZSTD_DCtx_loadDictionary_byReference(long dctx, long dict, long dictSize);

    /** {@code size_t ZSTD_DCtx_loadDictionary_byReference(ZSTD_DCtx * dctx, void const * dict, size_t dictSize)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary_byReference(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary_byReference(dctx, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_DCtx_loadDictionary_advanced ] ---

    /** {@code size_t ZSTD_DCtx_loadDictionary_advanced(ZSTD_DCtx * dctx, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType)} */
    public static native long nZSTD_DCtx_loadDictionary_advanced(long dctx, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /** {@code size_t ZSTD_DCtx_loadDictionary_advanced(ZSTD_DCtx * dctx, void const * dict, size_t dictSize, ZSTD_dictLoadMethod_e dictLoadMethod, ZSTD_dictContentType_e dictContentType)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary_advanced(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary_advanced(dctx, memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_DCtx_refPrefix_advanced ] ---

    /** {@code size_t ZSTD_DCtx_refPrefix_advanced(ZSTD_DCtx * dctx, void const * prefix, size_t prefixSize, ZSTD_dictContentType_e dictContentType)} */
    public static native long nZSTD_DCtx_refPrefix_advanced(long dctx, long prefix, long prefixSize, int dictContentType);

    /** {@code size_t ZSTD_DCtx_refPrefix_advanced(ZSTD_DCtx * dctx, void const * prefix, size_t prefixSize, ZSTD_dictContentType_e dictContentType)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix_advanced(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer prefix, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix_advanced(dctx, memAddress(prefix), prefix.remaining(), dictContentType);
    }

    // --- [ ZSTD_DCtx_setMaxWindowSize ] ---

    /** {@code size_t ZSTD_DCtx_setMaxWindowSize(ZSTD_DCtx * dctx, size_t maxWindowSize)} */
    public static native long nZSTD_DCtx_setMaxWindowSize(long dctx, long maxWindowSize);

    /** {@code size_t ZSTD_DCtx_setMaxWindowSize(ZSTD_DCtx * dctx, size_t maxWindowSize)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setMaxWindowSize(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("size_t") long maxWindowSize) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setMaxWindowSize(dctx, maxWindowSize);
    }

    // --- [ ZSTD_DCtx_getParameter ] ---

    /** {@code size_t ZSTD_DCtx_getParameter(ZSTD_DCtx * dctx, ZSTD_dParameter param, int * value)} */
    public static native long nZSTD_DCtx_getParameter(long dctx, int param, long value);

    /** {@code size_t ZSTD_DCtx_getParameter(ZSTD_DCtx * dctx, ZSTD_dParameter param, int * value)} */
    @NativeType("size_t")
    public static long ZSTD_DCtx_getParameter(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_dParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(dctx);
            check(value, 1);
        }
        return nZSTD_DCtx_getParameter(dctx, param, memAddress(value));
    }

    // --- [ ZSTD_decompressStream_simpleArgs ] ---

    /** {@code size_t ZSTD_decompressStream_simpleArgs(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, size_t * dstPos, void const * src, size_t srcSize, size_t * srcPos)} */
    public static native long nZSTD_decompressStream_simpleArgs(long dctx, long dst, long dstCapacity, long dstPos, long src, long srcSize, long srcPos);

    /** {@code size_t ZSTD_decompressStream_simpleArgs(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, size_t * dstPos, void const * src, size_t srcSize, size_t * srcPos)} */
    @NativeType("size_t")
    public static long ZSTD_decompressStream_simpleArgs(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("size_t *") PointerBuffer dstPos, @NativeType("void const *") ByteBuffer src, @NativeType("size_t *") PointerBuffer srcPos) {
        if (CHECKS) {
            check(dctx);
            check(dstPos, 1);
            check(srcPos, 1);
        }
        return nZSTD_decompressStream_simpleArgs(dctx, memAddress(dst), dst.remaining(), memAddress(dstPos), memAddress(src), src.remaining(), memAddress(srcPos));
    }

    // --- [ ZSTD_getFrameProgression ] ---

    /** {@code ZSTD_frameProgression ZSTD_getFrameProgression(ZSTD_CCtx const * cctx)} */
    public static native void nZSTD_getFrameProgression(long cctx, long __result);

    /** {@code ZSTD_frameProgression ZSTD_getFrameProgression(ZSTD_CCtx const * cctx)} */
    @NativeType("ZSTD_frameProgression")
    public static ZSTDFrameProgression ZSTD_getFrameProgression(@NativeType("ZSTD_CCtx const *") long cctx, @NativeType("ZSTD_frameProgression") ZSTDFrameProgression __result) {
        if (CHECKS) {
            check(cctx);
        }
        nZSTD_getFrameProgression(cctx, __result.address());
        return __result;
    }

    // --- [ ZSTD_toFlushNow ] ---

    /** {@code size_t ZSTD_toFlushNow(ZSTD_CCtx * cctx)} */
    public static native long nZSTD_toFlushNow(long cctx);

    /** {@code size_t ZSTD_toFlushNow(ZSTD_CCtx * cctx)} */
    @NativeType("size_t")
    public static long ZSTD_toFlushNow(@NativeType("ZSTD_CCtx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_toFlushNow(cctx);
    }

    // --- [ ZSTD_registerSequenceProducer ] ---

    /** {@code void ZSTD_registerSequenceProducer(ZSTD_CCtx * cctx, void * sequenceProducerState, ZSTD_sequenceProducer_F sequenceProducer)} */
    public static native void nZSTD_registerSequenceProducer(long cctx, long sequenceProducerState, long sequenceProducer);

    /** {@code void ZSTD_registerSequenceProducer(ZSTD_CCtx * cctx, void * sequenceProducerState, ZSTD_sequenceProducer_F sequenceProducer)} */
    public static void ZSTD_registerSequenceProducer(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") long sequenceProducerState, @NativeType("ZSTD_sequenceProducer_F") @Nullable ZSTDSequenceProducerI sequenceProducer) {
        if (CHECKS) {
            check(cctx);
        }
        nZSTD_registerSequenceProducer(cctx, sequenceProducerState, memAddressSafe(sequenceProducer));
    }

    // --- [ ZSTD_CCtxParams_registerSequenceProducer ] ---

    /** {@code void ZSTD_CCtxParams_registerSequenceProducer(ZSTD_CCtx_params * params, void * sequenceProducerState, ZSTD_sequenceProducer_F sequenceProducer)} */
    public static native void nZSTD_CCtxParams_registerSequenceProducer(long params, long sequenceProducerState, long sequenceProducer);

    /** {@code void ZSTD_CCtxParams_registerSequenceProducer(ZSTD_CCtx_params * params, void * sequenceProducerState, ZSTD_sequenceProducer_F sequenceProducer)} */
    public static void ZSTD_CCtxParams_registerSequenceProducer(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("void *") long sequenceProducerState, @NativeType("ZSTD_sequenceProducer_F") @Nullable ZSTDSequenceProducerI sequenceProducer) {
        if (CHECKS) {
            check(params);
        }
        nZSTD_CCtxParams_registerSequenceProducer(params, sequenceProducerState, memAddressSafe(sequenceProducer));
    }

    // --- [ ZSTD_decodingBufferSize_min ] ---

    /** {@code size_t ZSTD_decodingBufferSize_min(unsigned long long windowSize, unsigned long long frameContentSize)} */
    @NativeType("size_t")
    public static native long ZSTD_decodingBufferSize_min(@NativeType("unsigned long long") long windowSize, @NativeType("unsigned long long") long frameContentSize);

    // --- [ ZSTD_decompressBegin ] ---

    /** {@code size_t ZSTD_decompressBegin(ZSTD_DCtx * dctx)} */
    public static native long nZSTD_decompressBegin(long dctx);

    /** {@code size_t ZSTD_decompressBegin(ZSTD_DCtx * dctx)} */
    @NativeType("size_t")
    public static long ZSTD_decompressBegin(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressBegin(dctx);
    }

    // --- [ ZSTD_decompressBegin_usingDict ] ---

    /** {@code size_t ZSTD_decompressBegin_usingDict(ZSTD_DCtx * dctx, void const * dict, size_t dictSize)} */
    public static native long nZSTD_decompressBegin_usingDict(long dctx, long dict, long dictSize);

    /** {@code size_t ZSTD_decompressBegin_usingDict(ZSTD_DCtx * dctx, void const * dict, size_t dictSize)} */
    @NativeType("size_t")
    public static long ZSTD_decompressBegin_usingDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressBegin_usingDict(dctx, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_decompressBegin_usingDDict ] ---

    /** {@code size_t ZSTD_decompressBegin_usingDDict(ZSTD_DCtx * dctx, ZSTD_DDict const * ddict)} */
    public static native long nZSTD_decompressBegin_usingDDict(long dctx, long ddict);

    /** {@code size_t ZSTD_decompressBegin_usingDDict(ZSTD_DCtx * dctx, ZSTD_DDict const * ddict)} */
    @NativeType("size_t")
    public static long ZSTD_decompressBegin_usingDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
            check(ddict);
        }
        return nZSTD_decompressBegin_usingDDict(dctx, ddict);
    }

    // --- [ ZSTD_nextSrcSizeToDecompress ] ---

    /** {@code size_t ZSTD_nextSrcSizeToDecompress(ZSTD_DCtx * dctx)} */
    public static native long nZSTD_nextSrcSizeToDecompress(long dctx);

    /** {@code size_t ZSTD_nextSrcSizeToDecompress(ZSTD_DCtx * dctx)} */
    @NativeType("size_t")
    public static long ZSTD_nextSrcSizeToDecompress(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_nextSrcSizeToDecompress(dctx);
    }

    // --- [ ZSTD_decompressContinue ] ---

    /** {@code size_t ZSTD_decompressContinue(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize)} */
    public static native long nZSTD_decompressContinue(long dctx, long dst, long dstCapacity, long src, long srcSize);

    /** {@code size_t ZSTD_decompressContinue(ZSTD_DCtx * dctx, void * dst, size_t dstCapacity, void const * src, size_t srcSize)} */
    @NativeType("size_t")
    public static long ZSTD_decompressContinue(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressContinue(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_nextInputType ] ---

    /** {@code ZSTD_nextInputType_e ZSTD_nextInputType(ZSTD_DCtx * dctx)} */
    public static native int nZSTD_nextInputType(long dctx);

    /** {@code ZSTD_nextInputType_e ZSTD_nextInputType(ZSTD_DCtx * dctx)} */
    @NativeType("ZSTD_nextInputType_e")
    public static int ZSTD_nextInputType(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_nextInputType(dctx);
    }

    public static int ZSTD_FRAMEHEADERSIZE_PREFIX(int format) {
        return format == ZSTD_f_zstd1 ? 5 : 1;
    }

    public static int ZSTD_FRAMEHEADERSIZE_MIN(int format) {
        return format == ZSTD_f_zstd1 ? 6 : 2;
    }

    /** 
     * Similar to {@link #ZSTD_decompressionMargin decompressionMargin}, but instead of computing the margin from the compressed frame, compute it from the
     * original {@code size} and the {@code blockSizeLog}.
     * 
     * <p>WARNING: This macro does not support multi-frame input, the input must be a single zstd frame. If you need that support use the function, or
     * implement it yourself.</p>
     *
     * @param originalSize the original uncompressed size of the data
     * @param blockSize    the block {@code size == MIN(windowSize, ZSTD_BLOCKSIZE_MAX)}. Unless you explicitly set the {@code windowLog} smaller than
     *                     {@code ZSTD_BLOCKSIZELOG_MAX} you can just use {@code ZSTD_BLOCKSIZE_MAX}.
     */
    public static long ZSTD_DECOMPRESSION_MARGIN(long originalSize, long blockSize) {
        return
            ZSTD_FRAMEHEADERSIZE_MAX                                                              /* Frame header */ +
            4                                                                                         /* checksum */ +
            ((originalSize) == 0 ? 0 : 3 * (((originalSize) + (blockSize) - 1) / blockSize)) /* 3 bytes per block */ +
            (blockSize);                                                                   /* One block of margin */
    }

}