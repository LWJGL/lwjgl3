/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the experimental API of <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd). */
public class ZstdX {

    /**
     * Compression strategies, listed from fastest to strongest. ({@code ZSTD_strategy})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_fast fast}</li>
     * <li>{@link #ZSTD_dfast dfast}</li>
     * <li>{@link #ZSTD_greedy greedy}</li>
     * <li>{@link #ZSTD_lazy lazy}</li>
     * <li>{@link #ZSTD_lazy2 lazy2}</li>
     * <li>{@link #ZSTD_btlazy2 btlazy2}</li>
     * <li>{@link #ZSTD_btopt btopt}</li>
     * <li>{@link #ZSTD_btultra btultra}</li>
     * <li>{@link #ZSTD_btultra2 btultra2}</li>
     * </ul>
     */
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

    /**
     * {@code ZSTD_cParameter}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_c_compressionLevel c_compressionLevel} - 
     * Update all compression parameters according to pre-defined cLevel table Default level is {@link Zstd#ZSTD_CLEVEL_DEFAULT CLEVEL_DEFAULT}{@code ==3}. Special: value 0 means
     * default, which is controlled by {@code ZSTD_CLEVEL_DEFAULT}.
     * 
     * <p>Note 1: it's possible to pass a negative compression level.</p>
     * 
     * <p>Note 2 : setting a level sets all default values of other compression parameters</p>
     * </li>
     * <li>{@link #ZSTD_c_windowLog c_windowLog} - 
     * Maximum allowed back-reference distance, expressed as power of 2. Must be clamped between {@link #ZSTD_WINDOWLOG_MIN WINDOWLOG_MIN} and {@link #ZSTD_WINDOWLOG_MAX WINDOWLOG_MAX}. Special: value
     * 0 means "use default {@code windowLog}".
     * 
     * <p>Note: Using a {@code windowLog} greater than {@link #ZSTD_WINDOWLOG_LIMIT_DEFAULT WINDOWLOG_LIMIT_DEFAULT} requires explicitly allowing such window size at decompression stage if using
     * streaming.</p>
     * </li>
     * <li>{@link #ZSTD_c_hashLog c_hashLog} - 
     * Size of the initial probe table, as a power of 2. Resulting memory usage is (1 &lt;&lt; {@code (hashLog+2)}). Must be clamped between {@link #ZSTD_HASHLOG_MIN HASHLOG_MIN} and
     * HASHLOG_MAX. Larger tables improve compression ratio of strategies &le; dFast, and improve speed of strategies &gt; dFast. Special: value 0
     * means "use default {@code hashLog}".
     * </li>
     * <li>{@link #ZSTD_c_chainLog c_chainLog} - 
     * Size of the multi-probe search table, as a power of 2. Resulting memory usage is (1 &lt;&lt; {@code (chainLog+2)}). Must be clamped between
     * {@link #ZSTD_CHAINLOG_MIN CHAINLOG_MIN} and {@link #ZSTD_CHAINLOG_MAX CHAINLOG_MAX}. Larger tables result in better and slower compression. This parameter is useless when using "fast"
     * strategy. It's still useful when using "dfast" strategy, in which case it defines a secondary probe table. Special: value 0 means "use default
     * {@code chainLog}".
     * </li>
     * <li>{@link #ZSTD_c_searchLog c_searchLog} - 
     * Number of search attempts, as a power of 2. More attempts result in better and slower compression. This parameter is useless when using "fast" and
     * "dFast" strategies. Special: value 0 means "use default {@code searchLog}".
     * </li>
     * <li>{@link #ZSTD_c_minMatch c_minMatch} - 
     * Minimum size of searched matches. Note that Zstandard can still find matches of smaller size, it just tweaks its search algorithm to look for this
     * size and larger. Larger values increase compression and decompression speed, but decrease ratio. Must be clamped between {@link #ZSTD_MINMATCH_MIN MINMATCH_MIN} and
     * {@link #ZSTD_MINMATCH_MAX MINMATCH_MAX}. Note that currently, for all strategies &lt;btopt, effective minimum is 4. , for all strategies &gt; fast, effective maximum is 6.
     * Special: value 0 means "use default {@code minMatchLength}".
     * </li>
     * <li>{@link #ZSTD_c_targetLength c_targetLength} - 
     * Impact of this field depends on strategy. For strategies btopt, btultra &amp; btultra2: Length of Match considered "good enough" to stop search.
     * Larger values make compression stronger, and slower. For strategy fast: Distance between match sampling. Larger values make compression faster, and
     * weaker. Special: value 0 means "use default targetLength".
     * </li>
     * <li>{@link #ZSTD_c_strategy c_strategy} - 
     * See {@code ZSTD_strategy} enum definition. The higher the value of selected strategy, the more complex it is, resulting in stronger and slower
     * compression. Special: value 0 means "use default strategy".
     * </li>
     * <li>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching} - 
     * Enable long distance matching. This parameter is designed to improve compression ratio for large inputs, by finding large matches at long distance.
     * It increases memory usage and window size. Note: enabling this parameter increases default {@link #ZSTD_c_windowLog c_windowLog} to 128 MB except when expressly set to a
     * different value.
     * </li>
     * <li>{@link #ZSTD_c_ldmHashLog c_ldmHashLog} - 
     * Size of the table for long distance matching, as a power of 2. Larger values increase memory usage and compression ratio, but decrease compression
     * speed. Must be clamped between {@link #ZSTD_HASHLOG_MIN HASHLOG_MIN} and {@link #ZSTD_HASHLOG_MAX HASHLOG_MAX} default: windowlog - 7. Special: value 0 means "automatically determine hashlog".
     * </li>
     * <li>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch} - 
     * Minimum match size for long distance matcher. Larger/too small values usually decrease compression ratio. Must be clamped between {@link #ZSTD_LDM_MINMATCH_MIN LDM_MINMATCH_MIN}
     * and {@link #ZSTD_LDM_MINMATCH_MAX LDM_MINMATCH_MAX}. Special: value 0 means "use default value" (default: 64).
     * </li>
     * <li>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog} - 
     * Log size of each bucket in the LDM hash table for collision resolution. Larger values improve collision resolution but decrease compression speed.
     * The maximum value is {@link #ZSTD_LDM_BUCKETSIZELOG_MAX LDM_BUCKETSIZELOG_MAX}. Special: value 0 means "use default value" (default: 3).
     * </li>
     * <li>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog} - 
     * Frequency of inserting/looking up entries into the LDM hash table. Must be clamped between 0 and ({@link #ZSTD_WINDOWLOG_MAX WINDOWLOG_MAX} - {@link #ZSTD_HASHLOG_MIN HASHLOG_MIN}). Default
     * is {@code MAX(0, (windowLog - ldmHashLog))}, optimizing hash table usage. Larger values improve compression speed. Deviating far from default value
     * will likely result in a compression ratio decrease. Special: value 0 means "automatically determine {@code hashRateLog}".
     * </li>
     * <li>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag} - 
     * Content size will be written into frame header _whenever known_ (default:1) Content size must be known at the beginning of compression. This is
     * automatically the case when using {@link #ZSTD_compress2 compress2}, For streaming variants, content size must be provided with {@link #ZSTD_CCtx_setPledgedSrcSize CCtx_setPledgedSrcSize}.
     * </li>
     * <li>{@link #ZSTD_c_checksumFlag c_checksumFlag} - A 32-bits checksum of content is written at end of frame (default:0)</li>
     * <li>{@link #ZSTD_c_dictIDFlag c_dictIDFlag} - When applicable, dictionary's ID is written into frame header (default:1)</li>
     * <li>{@link #ZSTD_c_nbWorkers c_nbWorkers} - 
     * Select how many threads will be spawned to compress in parallel. When {@code nbWorkers &ge; 1}, triggers asynchronous mode when used with
     * {@code ZSTD_compressStream*()}: {@code ZSTD_compressStream*()} consumes input and flush output if possible, but immediately gives back control to
     * caller, while compression work is performed in parallel, within worker threads. (note: a strong exception to this rule is when first invocation of
     * {@link #ZSTD_compressStream2 compressStream2} sets {@link #ZSTD_e_end e_end}: in which case, {@code ZSTD_compressStream2()} delegates to {@link #ZSTD_compress2 compress2}, which is always a blocking call). More
     * workers improve speed, but also increase memory usage. Default value is {@code 0}, aka "single-threaded mode": no worker is spawned, compression is
     * performed inside Caller's thread, all invocations are blocking.
     * </li>
     * <li>{@link #ZSTD_c_jobSize c_jobSize} - 
     * Size of a compression job. This value is enforced only when {@code nbWorkers &ge; 1}. Each compression job is completed in parallel, so this value
     * can indirectly impact the nb of active threads. 0 means default, which is dynamically determined based on compression parameters. Job size must be
     * a minimum of overlap size, or 1 MB, whichever is largest. The minimum size is automatically and transparently enforced.
     * </li>
     * <li>{@link #ZSTD_c_overlapLog c_overlapLog} - 
     * Control the overlap size, as a fraction of window size. The overlap size is an amount of data reloaded from previous job at the beginning of a new
     * job. It helps preserve compression ratio, while each job is compressed in parallel. This value is enforced only when {@code nbWorkers &ge; 1}.
     * Larger values increase compression ratio, but decrease speed. Possible values range from 0 to 9:
     * 
     * <ul>
     * <li>0 means "default" : value will be determined by the library, depending on strategy</li>
     * <li>1 means "no overlap"</li>
     * <li>9 means "full overlap", using a full window size. Each intermediate rank increases/decreases load size by a factor 2: 9: full window; 8: w/2;
     * 7: w/4; 6: w/8; 5:w/16; 4: w/32; 3:w/64; 2:w/128; 1:no overlap; 0:default default value varies between 6 and 9, depending on strategy</li>
     * </ul>
     * </li>
     * <li>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</li>
     * <li>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</li>
     * <li>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</li>
     * <li>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</li>
     * </ul>
     */
    public static final int
        ZSTD_c_compressionLevel           = 100,
        ZSTD_c_windowLog                  = 101,
        ZSTD_c_hashLog                    = 102,
        ZSTD_c_chainLog                   = 103,
        ZSTD_c_searchLog                  = 104,
        ZSTD_c_minMatch                   = 105,
        ZSTD_c_targetLength               = 106,
        ZSTD_c_strategy                   = 107,
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
        ZSTD_c_experimentalParam4         = 1001;

    /**
     * {@code ZSTD_ResetDirective}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_reset_session_only reset_session_only}</li>
     * <li>{@link #ZSTD_reset_parameters reset_parameters}</li>
     * <li>{@link #ZSTD_reset_session_and_parameters reset_session_and_parameters}</li>
     * </ul>
     */
    public static final int
        ZSTD_reset_session_only           = 1,
        ZSTD_reset_parameters             = 2,
        ZSTD_reset_session_and_parameters = 3;

    /**
     * {@code ZSTD_EndDirective}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_e_continue e_continue} - collect more data, encoder decides when to output compressed result, for optimal compression ratio</li>
     * <li>{@link #ZSTD_e_flush e_flush} - 
     * flush any data provided so far, it creates (at least) one new block, that can be decoded immediately on reception; frame will continue: any future
     * data can still reference previously compressed data, improving compression.
     * </li>
     * <li>{@link #ZSTD_e_end e_end} - 
     * flush any remaining data <em>and</em> close current frame. note that frame is only closed after compressed data is fully flushed (return
     * {@code value == 0}). After that point, any additional data starts a new frame.
     * 
     * <p>Note: each frame is independent (does not reference any content from previous frame).</p>
     * </li>
     * </ul>
     */
    public static final int
        ZSTD_e_continue = 0,
        ZSTD_e_flush    = 1,
        ZSTD_e_end      = 2;

    /**
     * The advanced API pushes parameters one by one into an existing {@code DCtx} context. Parameters are sticky, and remain valid for all following frames
     * using the same {@code DCtx} context. It's possible to reset parameters to default values using {@link #ZSTD_DCtx_reset DCtx_reset}.
     * 
     * <p>Note: This API is compatible with existing {@link Zstd#ZSTD_decompressDCtx decompressDCtx} and {@link Zstd#ZSTD_decompressStream decompressStream}. Therefore, no new decompression function is necessary.</p>
     * 
     * <p>({@code ZSTD_dParameter})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_d_windowLogMax d_windowLogMax} - 
     * Select a size limit (in power of 2) beyond which the streaming API will refuse to allocate memory buffer in order to protect the host from
     * unreasonable memory requirements.
     * 
     * <p>This parameter is only useful in streaming mode, since no internal buffer is allocated in single-pass mode. By default, a decompression context
     * accepts window sizes &le; (1 &lt;&lt; {@link #ZSTD_WINDOWLOG_LIMIT_DEFAULT WINDOWLOG_LIMIT_DEFAULT})</p>
     * </li>
     * <li>{@link #ZSTD_d_experimentalParam1 d_experimentalParam1} - 
     * Note: additional experimental parameters are also available within the experimental section of the API. At the time of this writing, they include:
     * {@link #ZSTD_c_format c_format}
     * 
     * <p>Note: never ever use {@code experimentalParam}? names directly</p>
     * </li>
     * </ul>
     */
    public static final int
        ZSTD_d_windowLogMax       = 100,
        ZSTD_d_experimentalParam1 = 1000;

    /**
     * {@code ZSTD_dictContentType_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dct_auto dct_auto} - dictionary is "full" when starting with {@link #ZSTD_MAGIC_DICTIONARY MAGIC_DICTIONARY}, otherwise it is "rawContent"</li>
     * <li>{@link #ZSTD_dct_rawContent dct_rawContent} - ensures dictionary is always loaded as {@code rawContent}, even if it starts with {@code ZSTD_MAGIC_DICTIONARY}</li>
     * <li>{@link #ZSTD_dct_fullDict dct_fullDict} - refuses to load a dictionary if it does not respect Zstandard's specification, starting with {@code ZSTD_MAGIC_DICTIONARY}</li>
     * </ul>
     */
    public static final int
        ZSTD_dct_auto       = 0,
        ZSTD_dct_rawContent = 1,
        ZSTD_dct_fullDict   = 2;

    /**
     * {@code ZSTD_dictLoadMethod_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dlm_byCopy dlm_byCopy} - Copy dictionary content internally</li>
     * <li>{@link #ZSTD_dlm_byRef dlm_byRef} - Reference dictionary content -- the dictionary buffer must outlive its users.</li>
     * </ul>
     */
    public static final int
        ZSTD_dlm_byCopy = 0,
        ZSTD_dlm_byRef  = 1;

    /**
     * {@code ZSTD_format_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_f_zstd1 f_zstd1} - zstd frame format, specified in {@code zstd_compression_format.md} (default)</li>
     * <li>{@link #ZSTD_f_zstd1_magicless f_zstd1_magicless} - 
     * Variant of zstd frame format, without initial 4-bytes magic number. Useful to save 4 bytes per generated frame. Decoder cannot recognise
     * automatically this format, requiring this instruction.
     * </li>
     * </ul>
     */
    public static final int
        ZSTD_f_zstd1           = 0,
        ZSTD_f_zstd1_magicless = 1;

    /**
     * {@code ZSTD_dictAttachPref_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dictDefaultAttach dictDefaultAttach} - Use the default heuristic.</li>
     * <li>{@link #ZSTD_dictForceAttach dictForceAttach} - Never copy the dictionary.</li>
     * <li>{@link #ZSTD_dictForceCopy dictForceCopy} - Always copy the dictionary.</li>
     * </ul>
     */
    public static final int
        ZSTD_dictDefaultAttach = 0,
        ZSTD_dictForceAttach   = 1,
        ZSTD_dictForceCopy     = 2;

    /**
     * {@code ZSTD_frameType_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_frame frame}</li>
     * <li>{@link #ZSTD_skippableFrame skippableFrame}</li>
     * </ul>
     */
    public static final int
        ZSTD_frame          = 0,
        ZSTD_skippableFrame = 1;

    /**
     * {@code ZSTD_nextInputType_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTDnit_frameHeader ZSTDnit_frameHeader}</li>
     * <li>{@link #ZSTDnit_blockHeader ZSTDnit_blockHeader}</li>
     * <li>{@link #ZSTDnit_block ZSTDnit_block}</li>
     * <li>{@link #ZSTDnit_lastBlock ZSTDnit_lastBlock}</li>
     * <li>{@link #ZSTDnit_checksum ZSTDnit_checksum}</li>
     * <li>{@link #ZSTDnit_skippableFrame ZSTDnit_skippableFrame}</li>
     * </ul>
     */
    public static final int
        ZSTDnit_frameHeader    = 0,
        ZSTDnit_blockHeader    = 1,
        ZSTDnit_block          = 2,
        ZSTDnit_lastBlock      = 3,
        ZSTDnit_checksum       = 4,
        ZSTDnit_skippableFrame = 5;

    public static final int ZSTD_MAGICNUMBER = 0xFD2FB528;

    public static final int ZSTD_MAGIC_DICTIONARY = 0xEC30A437;

    public static final int ZSTD_MAGIC_SKIPPABLE_START = 0x184D2A50;

    public static final int ZSTD_MAGIC_SKIPPABLE_MASK = 0xFFFFFFF0;

    public static final int ZSTD_BLOCKSIZELOG_MAX = 17;

    public static final int ZSTD_BLOCKSIZE_MAX = (1<<ZSTD_BLOCKSIZELOG_MAX);

    public static final int ZSTD_FRAMEHEADERSIZE_PREFIX = 5;

    public static final int ZSTD_FRAMEHEADERSIZE_MIN = 6;

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

    public static final int ZSTD_HASHLOG3_MAX = 17;

    public static final int ZSTD_c_rsyncable = ZSTD_c_experimentalParam1;

    public static final int ZSTD_c_format = ZSTD_c_experimentalParam2;

    public static final int ZSTD_c_forceMaxWindow = ZSTD_c_experimentalParam3;

    public static final int ZSTD_c_forceAttachDict = ZSTD_c_experimentalParam4;

    public static final int ZSTD_d_format = ZSTD_d_experimentalParam1;

    static { LibZstd.initialize(); }

    protected ZstdX() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_minCLevel ] ---

    public static native int ZSTD_minCLevel();

    // --- [ ZSTD_findFrameCompressedSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_findFrameCompressedSize findFrameCompressedSize}
     *
     * @param srcSize must be &ge; first frame size
     */
    public static native long nZSTD_findFrameCompressedSize(long src, long srcSize);

    /**
     * @param src should point to the start of a ZSTD frame or skippable frame
     *
     * @return the compressed size of the first frame starting at {@code src}, suitable to pass as {@code srcSize} to {@link Zstd#ZSTD_decompress decompress} or similar, or an error code if
     *         input is invalid
     */
    @NativeType("size_t")
    public static long ZSTD_findFrameCompressedSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_findFrameCompressedSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_sizeof_CCtx ] ---

    public static native long nZSTD_sizeof_CCtx(long cctx);

    @NativeType("size_t")
    public static long ZSTD_sizeof_CCtx(@NativeType("ZSTD_CCtx const *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_sizeof_CCtx(cctx);
    }

    // --- [ ZSTD_sizeof_DCtx ] ---

    public static native long nZSTD_sizeof_DCtx(long dctx);

    @NativeType("size_t")
    public static long ZSTD_sizeof_DCtx(@NativeType("ZSTD_DCtx const *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_sizeof_DCtx(dctx);
    }

    // --- [ ZSTD_sizeof_CStream ] ---

    public static native long nZSTD_sizeof_CStream(long zcs);

    @NativeType("size_t")
    public static long ZSTD_sizeof_CStream(@NativeType("ZSTD_CStream const *") long zcs) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_sizeof_CStream(zcs);
    }

    // --- [ ZSTD_sizeof_DStream ] ---

    public static native long nZSTD_sizeof_DStream(long zds);

    @NativeType("size_t")
    public static long ZSTD_sizeof_DStream(@NativeType("ZSTD_DStream const *") long zds) {
        if (CHECKS) {
            check(zds);
        }
        return nZSTD_sizeof_DStream(zds);
    }

    // --- [ ZSTD_sizeof_CDict ] ---

    public static native long nZSTD_sizeof_CDict(long cdict);

    @NativeType("size_t")
    public static long ZSTD_sizeof_CDict(@NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cdict);
        }
        return nZSTD_sizeof_CDict(cdict);
    }

    // --- [ ZSTD_sizeof_DDict ] ---

    public static native long nZSTD_sizeof_DDict(long ddict);

    @NativeType("size_t")
    public static long ZSTD_sizeof_DDict(@NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(ddict);
        }
        return nZSTD_sizeof_DDict(ddict);
    }

    // --- [ ZSTD_cParam_getBounds ] ---

    /** Unsafe version of: {@link #ZSTD_cParam_getBounds cParam_getBounds} */
    public static native void nZSTD_cParam_getBounds(int cParam, long __result);

    /**
     * All parameters must belong to an interval with lower and upper bounds, otherwise they will either trigger an error or be automatically clamped.
     *
     * @param cParam   one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td><td>{@link #ZSTD_c_searchLog c_searchLog}</td></tr><tr><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td></tr><tr><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td></tr><tr><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td></tr></table>
     * @param __result a structure, {@code ZSTD_bounds}, which contains
     *                 
     *                 <ul>
     *                 <li>an error status field, which must be tested using {@link Zstd#ZSTD_isError isError}</li>
     *                 <li>lower and upper bounds, both inclusive</li>
     *                 </ul>
     */
    @NativeType("ZSTD_bounds")
    public static ZSTDBounds ZSTD_cParam_getBounds(@NativeType("ZSTD_cParameter") int cParam, @NativeType("ZSTD_bounds") ZSTDBounds __result) {
        nZSTD_cParam_getBounds(cParam, __result.address());
        return __result;
    }

    // --- [ ZSTD_CCtx_setParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_setParameter CCtx_setParameter} */
    public static native long nZSTD_CCtx_setParameter(long cctx, int param, int value);

    /**
     * Set one compression parameter, selected by enum {@code ZSTD_cParameter}.
     * 
     * <p>All parameters have valid bounds. Bounds can be queried using {@link #ZSTD_cParam_getBounds cParam_getBounds}. Providing a value beyond bound will either clamp it, or trigger an
     * error (depending on parameter). Setting a parameter is generally only possible during frame initialization (before starting compression). Exception:
     * when using multi-threading mode (nbWorkers &ge; 1), the following parameters can be updated <b>during</b> compression (within same frame): =&lt;
     * compressionLevel, hashLog, chainLog, searchLog, minMatch, targetLength and strategy. new parameters will be active for next job only (after a
     * {@code flush()}).</p>
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td><td>{@link #ZSTD_c_searchLog c_searchLog}</td></tr><tr><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td></tr><tr><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td></tr><tr><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td></tr></table>
     *
     * @return an error code (which can be tested using {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParameter(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_cParameter") int param, int value) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setParameter(cctx, param, value);
    }

    // --- [ ZSTD_CCtx_setPledgedSrcSize ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_setPledgedSrcSize CCtx_setPledgedSrcSize} */
    public static native long nZSTD_CCtx_setPledgedSrcSize(long cctx, long pledgedSrcSize);

    /**
     * Total input data size to be compressed as a single frame.
     * 
     * <p>Value will be written in frame header, unless if explicitly forbidden using {@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}. This value will also be controlled at end of frame, and
     * trigger an error if not respected.</p>
     * 
     * <p>Note 1: {@code pledgedSrcSize==0} actually means zero, aka an empty frame. In order to mean "unknown content size", pass constant {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}.
     * {@code ZSTD_CONTENTSIZE_UNKNOWN} is default value for any new frame.</p>
     * 
     * <p>Note 2: {@code pledgedSrcSize} is only valid once, for the next frame. It's discarded at the end of the frame, and replaced by
     * {@code ZSTD_CONTENTSIZE_UNKNOWN}.</p>
     * 
     * <p>Note 3 : Whenever all input data is provided and consumed in a single round, for example with {@link #ZSTD_compress2 compress2}, or invoking immediately
     * {@code ZSTD_compressStream2(,,,ZSTD_e_end)}, this value is automatically overriden by {@code srcSize} instead.</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setPledgedSrcSize(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setPledgedSrcSize(cctx, pledgedSrcSize);
    }

    // --- [ ZSTD_CCtx_loadDictionary ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary} */
    public static native long nZSTD_CCtx_loadDictionary(long cctx, long dict, long dictSize);

    /**
     * Creates an internal {@code CDict} from {@code dict} buffer. Decompression will have to use same dictionary.
     * 
     * <p>Special: Loading a {@code NULL} (or 0-size) dictionary invalidates previous dictionary, meaning "return to no-dictionary mode".</p>
     * 
     * <p>Note 1: Dictionary is sticky, it will be used for all future compressed frames. To return to "no-dictionary" situation, load a {@code NULL} dictionary (or
     * reset parameters).</p>
     * 
     * <p>Note 2: Loading a dictionary involves building tables. It's also a CPU consuming operation, with non-negligible impact on latency. Tables are dependent
     * on compression parameters, and for this reason, compression parameters can no longer be changed after loading a dictionary.</p>
     * 
     * <p>Note 3: {@code dict} content will be copied internally. Use experimental {@link #ZSTD_CCtx_loadDictionary_byReference CCtx_loadDictionary_byReference} to reference content instead. In such a
     * case, dictionary buffer must outlive its users.</p>
     * 
     * <p>Note 4: Use {@link #ZSTD_CCtx_loadDictionary_advanced CCtx_loadDictionary_advanced} to precisely select how dictionary content must be interpreted.</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary(cctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_CCtx_refCDict ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_refCDict CCtx_refCDict} */
    public static native long nZSTD_CCtx_refCDict(long cctx, long cdict);

    /**
     * References a prepared dictionary, to be used for all next compressed frames.
     * 
     * <p>Note that compression parameters are enforced from within CDict, and supercede any compression parameter previously set within {@code CCtx}. The
     * dictionary will remain valid for future compressed frames using same {@code CCtx}.</p>
     * 
     * <p>Special: Referencing a {@code NULL} {@code CDict} means "return to no-dictionary mode".</p>
     * 
     * <p>Note 1: Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one.</p>
     * 
     * <p>Note 2: {@code CDict} is just referenced, its lifetime must outlive its usage within {@code CCtx}.</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refCDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refCDict(cctx, cdict);
    }

    // --- [ ZSTD_CCtx_refPrefix ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_refPrefix CCtx_refPrefix} */
    public static native long nZSTD_CCtx_refPrefix(long cctx, long prefix, long prefixSize);

    /**
     * References a prefix (single-usage dictionary) for next compressed frame.
     * 
     * <p>A prefix is <b>only used once</b>. Tables are discarded at end of frame ({@link #ZSTD_e_end e_end}). Decompression will need same prefix to properly regenerate data.
     * Compressing with a prefix is similar in outcome as performing a diff and compressing it, but performs much faster, especially during decompression
     * (compression speed is tunable with compression level).</p>
     * 
     * <p>Special: Adding any prefix (including {@code NULL}) invalidates any previous prefix or dictionary</p>
     * 
     * <p>Note 1: Prefix buffer is referenced. It <b>must</b> outlive compression. Its content must remain unmodified during compression.</p>
     * 
     * <p>Note 2: If the intention is to diff some large {@code src} data blob with some prior version of itself, ensure that the window size is large enough to
     * contain the entire source. See {@link #ZSTD_c_windowLog c_windowLog}.</p>
     * 
     * <p>Note 3: Referencing a prefix involves building tables, which are dependent on compression parameters. It's a CPU consuming operation, with
     * non-negligible impact on latency. If there is a need to use the same prefix multiple times, consider {@code loadDictionary} instead.</p>
     * 
     * <p>Note 4: By default, the prefix is interpreted as raw content ({@link #ZSTD_dct_rawContent dct_rawContent}). Use experimental {@link #ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} to alter dictionary
     * interpretation.</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix(cctx, memAddressSafe(prefix), remainingSafe(prefix));
    }

    // --- [ ZSTD_CCtx_reset ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_reset CCtx_reset} */
    public static native long nZSTD_CCtx_reset(long cctx, int reset);

    /**
     * There are 2 different things that can be reset, independently or jointly :
     * 
     * <ul>
     * <li>The session: will stop compressing current frame, and make {@code CCtx} ready to start a new one. Useful after an error, or to interrupt any
     * ongoing compression. Any internal data not yet flushed is cancelled. Compression parameters and dictionary remain unchanged. They will be used to
     * compress next frame. Resetting session never fails.</li>
     * <li>The parameters: changes all parameters back to "default". This removes any reference to any dictionary too. Parameters can only be changed between
     * 2 sessions (i.e. no compression is currently ongoing) otherwise the reset fails, and function returns an error value (which can be tested using
     * {@link Zstd#ZSTD_isError isError})</li>
     * <li>Both: similar to resetting the session, followed by resetting parameters.</li>
     * </ul>
     *
     * @param reset one of:<br><table><tr><td>{@link #ZSTD_reset_session_only reset_session_only}</td><td>{@link #ZSTD_reset_parameters reset_parameters}</td><td>{@link #ZSTD_reset_session_and_parameters reset_session_and_parameters}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_reset(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_ResetDirective") int reset) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_reset(cctx, reset);
    }

    // --- [ ZSTD_compress2 ] ---

    /** Unsafe version of: {@link #ZSTD_compress2 compress2} */
    public static native long nZSTD_compress2(long cctx, long dst, long dstCapacity, long src, long srcSize);

    /**
     * Behaves the same as {@link Zstd#ZSTD_compressCCtx compressCCtx}, but compression parameters are set using the advanced API.
     * 
     * <p>{@code ZSTD_compress2()} always starts a new frame. Should cctx hold data from a previously unfinished frame, everything about it is forgotten.</p>
     * 
     * <p>- Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}
     * - The function is always blocking, returns when compression is completed. Hint: compression runs faster if {@code dstCapacity} &ge;
     * {@code ZSTD_compressBound(srcSize)}.</p>
     *
     * @return compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_compress2(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compress2(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compressStream2 ] ---

    /** Unsafe version of: {@link #ZSTD_compressStream2 compressStream2} */
    public static native long nZSTD_compressStream2(long cctx, long output, long input, int endOp);

    /**
     * Behaves about the same as {@link Zstd#ZSTD_compressStream compressStream}, with additional control on end directive.
     * 
     * <p>- Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}.
     * - Compression parameters cannot be changed once compression is started (save a list of exceptions in multi-threading mode).
     * - {@code outpot->pos} must be &le; {@code dstCapacity}, {@code input->pos} must be &le; {@code srcSize}.
     * - {@code outpot->pos} and {@code input->pos} will be updated. They are guaranteed to remain below their respective limit.
     * - When {@code nbWorkers==0} (default), function is blocking: it completes its job before returning to caller.
     * - When {@code nbWorkers&ge;1}, function is non-blocking: it just acquires a copy of input, and distributes jobs to internal worker threads, flush
     * whatever is available, and then immediately returns, just indicating that there is some data remaining to be flushed. The function nonetheless
     * guarantees forward progress: it will return only after it reads or write at least 1+ byte.
     * - Exception: if the first call requests a {@link #ZSTD_e_end e_end} directive and provides enough {@code dstCapacity}, the function delegates to {@link #ZSTD_compress2 compress2} which is
     * always blocking.</p>
     *
     * @param endOp one of:<br><table><tr><td>{@link #ZSTD_e_continue e_continue}</td><td>{@link #ZSTD_e_flush e_flush}</td><td>{@link #ZSTD_e_end e_end}</td></tr></table>
     *
     * @return provides a minimum amount of data remaining to be flushed from internal buffers or an error code, which can be tested using {@link Zstd#ZSTD_isError isError}.
     *         
     *         <p>If {@code != 0}, flush is not fully completed, there is still some data left within internal buffers. This is useful for {@link #ZSTD_e_flush e_flush}, since in this case
     *         more flushes are necessary to empty all buffers. For {@link #ZSTD_e_end e_end}, {@code == 0} when internal buffers are fully flushed and frame is completed.</p>
     *         
     *         <p>- after a {@code ZSTD_e_end} directive, if internal buffer is not fully flushed ({@code != 0}), only {@code ZSTD_e_end} or {@code ZSTD_e_flush}
     *         operations are allowed. Before starting a new compression job, or changing compression parameters, it is required to fully flush internal buffers.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_compressStream2(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input, @NativeType("ZSTD_EndDirective") int endOp) {
        if (CHECKS) {
            check(cctx);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_compressStream2(cctx, output.address(), input.address(), endOp);
    }

    // --- [ ZSTD_dParam_getBounds ] ---

    /** Unsafe version of: {@link #ZSTD_dParam_getBounds dParam_getBounds} */
    public static native void nZSTD_dParam_getBounds(int dParam, long __result);

    /**
     * All parameters must belong to an interval with lower and upper bounds, otherwise they will either trigger an error or be automatically clamped.
     *
     * @param __result returns a structure, {@code ZSTD_bounds}, which contains - an error status field, which must be tested using {@link Zstd#ZSTD_isError isError} - both lower and upper bounds,
     *                 inclusive
     */
    @NativeType("ZSTD_bounds")
    public static ZSTDBounds ZSTD_dParam_getBounds(@NativeType("ZSTD_dParameter") int dParam, @NativeType("ZSTD_bounds") ZSTDBounds __result) {
        nZSTD_dParam_getBounds(dParam, __result.address());
        return __result;
    }

    // --- [ ZSTD_DCtx_setParameter ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_setParameter DCtx_setParameter} */
    public static native long nZSTD_DCtx_setParameter(long dctx, int param, int value);

    /**
     * Set one compression parameter, selected by {@code enum ZSTD_dParameter}.
     * 
     * <p>All parameters have valid bounds. Bounds can be queried using {@link #ZSTD_dParam_getBounds dParam_getBounds}. Providing a value beyond bound will either clamp it, or trigger an
     * error (depending on parameter). Setting a parameter is only possible during frame initialization (before starting decompression).</p>
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_d_windowLogMax d_windowLogMax}</td><td>{@link #ZSTD_d_experimentalParam1 d_experimentalParam1}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested using {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setParameter(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_dParameter") int param, int value) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setParameter(dctx, param, value);
    }

    // --- [ ZSTD_DCtx_loadDictionary ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary DCtx_loadDictionary} */
    public static native long nZSTD_DCtx_loadDictionary(long dctx, long dict, long dictSize);

    /**
     * Create an internal {@code DDict} from {@code dict} buffer, to be used to decompress next frames. The dictionary remains valid for all future frames,
     * until explicitly invalidated.
     * 
     * <p>Special: Adding a {@code NULL} (or 0-size) dictionary invalidates any previous dictionary, meaning "return to no-dictionary mode".</p>
     * 
     * <p>Note 1: Loading a dictionary involves building tables, which has a non-negligible impact on CPU usage and latency. It's recommended to "load once, use
     * many times", to amortize the cost.</p>
     * 
     * <p>Note 2: {@code dict} content will be copied internally, so {@code dict} can be released after loading. Use {@link #ZSTD_DCtx_loadDictionary_byReference DCtx_loadDictionary_byReference} to
     * reference dictionary content instead.</p>
     * 
     * <p>Note 3: Use {@link #ZSTD_DCtx_loadDictionary_advanced DCtx_loadDictionary_advanced} to take control of how dictionary content is loaded and interpreted.</p>
     *
     * @return 0, or an error code (which can be tested with ZSTD_isError())
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary(@NativeType("ZSTD_DCtx *") long dctx, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary(dctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_DCtx_refDDict ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_refDDict DCtx_refDDict} */
    public static native long nZSTD_DCtx_refDDict(long dctx, long ddict);

    /**
     * References a prepared dictionary, to be used to decompress next frames. The dictionary remains active for decompression of future frames using same
     * {@code DCtx}.
     * 
     * <p>Note 1: Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one. Special: referencing a
     * {@code NULL} {@code DDict} means "return to no-dictionary mode".</p>
     * 
     * <p>Note 2: {@code DDict} is just referenced, its lifetime must outlive its usage from {@code DCtx}.</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refDDict(dctx, ddict);
    }

    // --- [ ZSTD_DCtx_refPrefix ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_refPrefix DCtx_refPrefix} */
    public static native long nZSTD_DCtx_refPrefix(long dctx, long prefix, long prefixSize);

    /**
     * References a prefix (single-usage dictionary) to decompress next frame.
     * 
     * <p>This is the reverse operation of {@link #ZSTD_CCtx_refPrefix CCtx_refPrefix}, and must use the same prefix as the one used during compression. Prefix is <b>only used once</b>.
     * Reference is discarded at end of frame. End of frame is reached when {@link Zstd#ZSTD_decompressStream decompressStream} returns 0.</p>
     * 
     * <p>Note 1: Adding any prefix (including {@code NULL}) invalidates any previously set prefix or dictionary.</p>
     * 
     * <p>Note 2: Prefix buffer is referenced. It <b>must</b> outlive decompression. Prefix buffer must remain unmodified up to the end of frame, reached when
     * {@code ZSTD_decompressStream()} returns 0.</p>
     * 
     * <p>Note 3: By default, the prefix is treated as raw content ({@link #ZSTD_dct_rawContent dct_rawContent}). Use {@link #ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} to alter {@code dictMode}.</p>
     * 
     * <p>Note 4: Referencing a raw content prefix has almost no cpu nor memory cost. A full dictionary is more costly, as it requires building tables.</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix(dctx, memAddress(prefix), prefix.remaining());
    }

    // --- [ ZSTD_DCtx_reset ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_reset DCtx_reset} */
    public static native long nZSTD_DCtx_reset(long dctx, int reset);

    /**
     * Returns a {@code DCtx} to clean state.
     * 
     * <p>Session and parameters can be reset jointly or separately. Parameters can only be reset when no active frame is being decompressed.</p>
     *
     * @param reset one of:<br><table><tr><td>{@link #ZSTD_reset_session_only reset_session_only}</td><td>{@link #ZSTD_reset_parameters reset_parameters}</td><td>{@link #ZSTD_reset_session_and_parameters reset_session_and_parameters}</td></tr></table>
     *
     * @return 0, or an error code, which can be tested with {@link Zstd#ZSTD_isError isError}
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_reset(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_ResetDirective") int reset) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_reset(dctx, reset);
    }

    // --- [ ZSTD_findDecompressedSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_findDecompressedSize findDecompressedSize}
     *
     * @param srcSize must be the <em>exact</em> size of this series (i.e. there should be a frame boundary exactly at {@code srcSize} bytes after {@code src})
     */
    public static native long nZSTD_findDecompressedSize(long src, long srcSize);

    /**
     * Note 1: decompressed size is an optional field, that may not be present, especially in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN},
     * data to decompress could be any size. In which case, it's necessary to use streaming mode to decompress data.
     * 
     * <p>Note 2: decompressed size is always present when compression is done with {@link Zstd#ZSTD_compress compress}.</p>
     * 
     * <p>Note 3: decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
     * case, it's necessary to use streaming mode to decompress data.</p>
     * 
     * <p>Note 4: If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure result fits within application's authorized
     * limits. Each application can set its own limits.</p>
     * 
     * <p>Note 5: {@code ZSTD_findDecompressedSize} handles multiple frames, and so it must traverse the input to read each contained frame header. This is fast
     * as most of the data is skipped, however it does mean that all frame data must be present and valid.</p>
     *
     * @param src should point the start of a series of ZSTD encoded and/or skippable frames
     *
     * @return <ul>
     *         <li>decompressed size of all data in all successive frames</li>
     *         <li>if the decompressed size cannot be determined: {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}</li>
     *         <li>if an error occurred: {@link Zstd#ZSTD_CONTENTSIZE_ERROR CONTENTSIZE_ERROR}</li>
     *         </ul>
     */
    @NativeType("unsigned long long")
    public static long ZSTD_findDecompressedSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_findDecompressedSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_frameHeaderSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_frameHeaderSize frameHeaderSize}
     *
     * @param srcSize must be &ge; {@link #ZSTD_FRAMEHEADERSIZE_PREFIX FRAMEHEADERSIZE_PREFIX}
     */
    public static native long nZSTD_frameHeaderSize(long src, long srcSize);

    /** @return : size of the Frame Header, or an error code (if srcSize is too small) */
    @NativeType("size_t")
    public static long ZSTD_frameHeaderSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_frameHeaderSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_estimateCCtxSize ] ---

    /**
     * Estimages memory usage of a future {@code CCtx}, before its creation.
     * 
     * <p>{@code ZSTD_estimateCCtxSize()} will provide a budget large enough for any compression level up to selected one. It will also consider {@code src} size
     * to be arbitrarily "large", which is worst case. If {@code srcSize} is known to always be small, {@link #ZSTD_estimateCCtxSize_usingCParams estimateCCtxSize_usingCParams} can provide a tighter
     * estimation. {@link #ZSTD_estimateCCtxSize_usingCParams estimateCCtxSize_usingCParams} can be used in tandem with {@link #ZSTD_getCParams getCParams} to create {@code cParams} from compressionLevel.
     * {@link #ZSTD_estimateCCtxSize_usingCCtxParams estimateCCtxSize_usingCCtxParams} can be used in tandem with {@link #ZSTD_CCtxParam_setParameter CCtxParam_setParameter}. Only single-threaded compression is supported.</p>
     * 
     * <p>This function will return an error code if {@link #ZSTD_c_nbWorkers c_nbWorkers} is &ge; 1.</p>
     * 
     * <p>Note: {@code CCtx} size estimation is only correct for single-threaded compression.</p>
     */
    @NativeType("size_t")
    public static native long ZSTD_estimateCCtxSize(int compressionLevel);

    // --- [ ZSTD_estimateCCtxSize_usingCParams ] ---

    public static native long nZSTD_estimateCCtxSize_usingCParams(long cParams);

    @NativeType("size_t")
    public static long ZSTD_estimateCCtxSize_usingCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_estimateCCtxSize_usingCParams(cParams.address());
    }

    // --- [ ZSTD_estimateCCtxSize_usingCCtxParams ] ---

    public static native long nZSTD_estimateCCtxSize_usingCCtxParams(long params);

    @NativeType("size_t")
    public static long ZSTD_estimateCCtxSize_usingCCtxParams(@NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_estimateCCtxSize_usingCCtxParams(params);
    }

    // --- [ ZSTD_estimateDCtxSize ] ---

    @NativeType("size_t")
    public static native long ZSTD_estimateDCtxSize();

    // --- [ ZSTD_estimateCStreamSize ] ---

    /**
     * Provides a budget large enough for any compression level up to selected one.
     * 
     * <p>It will also consider {@code src} size to be arbitrarily "large", which is worst case. If {@code srcSize} is known to always be small,
     * {@link #ZSTD_estimateCStreamSize_usingCParams estimateCStreamSize_usingCParams} can provide a tighter estimation. {@code ZSTD_estimateCStreamSize_usingCParams()} can be used in tandem with
     * {@link #ZSTD_getCParams getCParams} to create {@code cParams} from compressionLevel. {@link #ZSTD_estimateCStreamSize_usingCCtxParams estimateCStreamSize_usingCCtxParams} can be used in tandem with
     * {@link #ZSTD_CCtxParam_setParameter CCtxParam_setParameter}. Only single-threaded compression is supported.</p>
     * 
     * <p>This function will return an error code if {@link #ZSTD_c_nbWorkers c_nbWorkers} is &ge; 1.</p>
     * 
     * <p>Note: {@code CStream} size estimation is only correct for single-threaded compression. {@code ZSTD_DStream} memory budget depends on window
     * {@code Size}. This information can be passed manually, using {@link #ZSTD_estimateDStreamSize estimateDStreamSize}, or deducted from a valid frame {@code Header}, using
     * {@link #ZSTD_estimateDStreamSize_fromFrame estimateDStreamSize_fromFrame}.</p>
     * 
     * <p>Note: if streaming is init with function {@code ZSTD_init?Stream_usingDict()}, an internal Dict will be created, which additional size is not estimated
     * here. In this case, get total size by adding {@code ZSTD_estimate?DictSize}.</p>
     */
    @NativeType("size_t")
    public static native long ZSTD_estimateCStreamSize(int compressionLevel);

    // --- [ ZSTD_estimateCStreamSize_usingCParams ] ---

    public static native long nZSTD_estimateCStreamSize_usingCParams(long cParams);

    @NativeType("size_t")
    public static long ZSTD_estimateCStreamSize_usingCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_estimateCStreamSize_usingCParams(cParams.address());
    }

    // --- [ ZSTD_estimateCStreamSize_usingCCtxParams ] ---

    public static native long nZSTD_estimateCStreamSize_usingCCtxParams(long params);

    @NativeType("size_t")
    public static long ZSTD_estimateCStreamSize_usingCCtxParams(@NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_estimateCStreamSize_usingCCtxParams(params);
    }

    // --- [ ZSTD_estimateDStreamSize ] ---

    @NativeType("size_t")
    public static native long ZSTD_estimateDStreamSize(@NativeType("size_t") long windowSize);

    // --- [ ZSTD_estimateDStreamSize_fromFrame ] ---

    public static native long nZSTD_estimateDStreamSize_fromFrame(long src, long srcSize);

    @NativeType("size_t")
    public static long ZSTD_estimateDStreamSize_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_estimateDStreamSize_fromFrame(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_estimateCDictSize ] ---

    @NativeType("size_t")
    public static native long ZSTD_estimateCDictSize(@NativeType("size_t") long dictSize, int compressionLevel);

    // --- [ ZSTD_estimateCDictSize_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_estimateCDictSize_advanced estimateCDictSize_advanced} */
    public static native long nZSTD_estimateCDictSize_advanced(long dictSize, long cParams, int dictLoadMethod);

    /** @param dictLoadMethod one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table> */
    @NativeType("size_t")
    public static long ZSTD_estimateCDictSize_advanced(@NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod) {
        return nZSTD_estimateCDictSize_advanced(dictSize, cParams.address(), dictLoadMethod);
    }

    // --- [ ZSTD_estimateDDictSize ] ---

    /** @param dictLoadMethod one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table> */
    @NativeType("size_t")
    public static native long ZSTD_estimateDDictSize(@NativeType("size_t") long dictSize, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod);

    // --- [ ZSTD_initStaticCCtx ] ---

    public static native long nZSTD_initStaticCCtx(long workspace, long workspaceSize);

    @NativeType("ZSTD_CCtx *")
    public static long ZSTD_initStaticCCtx(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticCCtx(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticCStream ] ---

    public static native long nZSTD_initStaticCStream(long workspace, long workspaceSize);

    @NativeType("ZSTD_CStream *")
    public static long ZSTD_initStaticCStream(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticCStream(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticDCtx ] ---

    public static native long nZSTD_initStaticDCtx(long workspace, long workspaceSize);

    @NativeType("ZSTD_DCtx *")
    public static long ZSTD_initStaticDCtx(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticDCtx(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticDStream ] ---

    public static native long nZSTD_initStaticDStream(long workspace, long workspaceSize);

    @NativeType("ZSTD_DStream *")
    public static long ZSTD_initStaticDStream(@NativeType("void *") ByteBuffer workspace) {
        return nZSTD_initStaticDStream(memAddress(workspace), workspace.remaining());
    }

    // --- [ ZSTD_initStaticCDict ] ---

    /** Unsafe version of: {@link #ZSTD_initStaticCDict initStaticCDict} */
    public static native long nZSTD_initStaticCDict(long workspace, long workspaceSize, long dict, long dictSize, int dictLoadMethod, int dictContentType, long cParams);

    /**
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("ZSTD_CDict const *")
    public static long ZSTD_initStaticCDict(@NativeType("void *") ByteBuffer workspace, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_initStaticCDict(memAddress(workspace), workspace.remaining(), memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cParams.address());
    }

    // --- [ ZSTD_initStaticDDict ] ---

    /** Unsafe version of: {@link #ZSTD_initStaticDDict initStaticDDict} */
    public static native long nZSTD_initStaticDDict(long workspace, long workspaceSize, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /**
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("ZSTD_DDict const *")
    public static long ZSTD_initStaticDDict(@NativeType("void *") ByteBuffer workspace, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        return nZSTD_initStaticDDict(memAddress(workspace), workspace.remaining(), memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_createCCtx_advanced ] ---

    public static native long nZSTD_createCCtx_advanced(long customMem);

    @NativeType("ZSTD_CCtx *")
    public static long ZSTD_createCCtx_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCCtx_advanced(customMem.address());
    }

    // --- [ ZSTD_createCStream_advanced ] ---

    public static native long nZSTD_createCStream_advanced(long customMem);

    @NativeType("ZSTD_CStream *")
    public static long ZSTD_createCStream_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCStream_advanced(customMem.address());
    }

    // --- [ ZSTD_createDCtx_advanced ] ---

    public static native long nZSTD_createDCtx_advanced(long customMem);

    @NativeType("ZSTD_DCtx *")
    public static long ZSTD_createDCtx_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createDCtx_advanced(customMem.address());
    }

    // --- [ ZSTD_createDStream_advanced ] ---

    public static native long nZSTD_createDStream_advanced(long customMem);

    @NativeType("ZSTD_DStream *")
    public static long ZSTD_createDStream_advanced(@NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createDStream_advanced(customMem.address());
    }

    // --- [ ZSTD_createCDict_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_createCDict_advanced createCDict_advanced} */
    public static native long nZSTD_createCDict_advanced(long dict, long dictSize, int dictLoadMethod, int dictContentType, long cParams, long customMem);

    /**
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_advanced(@NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams, @NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCDict_advanced(memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cParams.address(), customMem.address());
    }

    // --- [ ZSTD_createDDict_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_createDDict_advanced createDDict_advanced} */
    public static native long nZSTD_createDDict_advanced(long dict, long dictSize, int dictLoadMethod, int dictContentType, long customMem);

    /**
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict_advanced(@NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createDDict_advanced(memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, customMem.address());
    }

    // --- [ ZSTD_createCDict_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_createCDict_byReference createCDict_byReference} */
    public static native long nZSTD_createCDict_byReference(long dictBuffer, long dictSize, int compressionLevel);

    /**
     * Creates a digested dictionary for compression Dictionary content is just referenced, not duplicated.
     * 
     * <p>As a consequence, {@code dictBuffer} <b>must</b> outlive {@code CDict}, and its content must remain unmodified throughout the lifetime of
     * {@code CDict}.</p>
     */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_byReference(@NativeType("void const *") ByteBuffer dictBuffer, int compressionLevel) {
        return nZSTD_createCDict_byReference(memAddress(dictBuffer), dictBuffer.remaining(), compressionLevel);
    }

    // --- [ ZSTD_getCParams ] ---

    /** Unsafe version of: {@link #ZSTD_getCParams getCParams} */
    public static native void nZSTD_getCParams(int compressionLevel, long estimatedSrcSize, long dictSize, long __result);

    /**
     * Returns {@code ZSTD_compressionParameters} structure for a selected compression level and estimated {@code srcSize}.
     *
     * @param estimatedSrcSize optional, select 0 if not known
     */
    @NativeType("ZSTD_compressionParameters")
    public static ZSTDCompressionParameters ZSTD_getCParams(int compressionLevel, @NativeType("unsigned long long") long estimatedSrcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters __result) {
        nZSTD_getCParams(compressionLevel, estimatedSrcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_getParams ] ---

    /** Unsafe version of: {@link #ZSTD_getParams getParams} */
    public static native void nZSTD_getParams(int compressionLevel, long estimatedSrcSize, long dictSize, long __result);

    /**
     * Same as getCParams(), but returns a full {@code ZSTD_parameters} object instead of sub-component {@code ZSTD_compressionParameters}.
     * 
     * <p>All fields of {@code ZSTD_frameParameters} are set to default: {@code contentSize=1, checksum=0, noDictID=0}.</p>
     *
     * @param estimatedSrcSize optional, select 0 if not known
     */
    @NativeType("ZSTD_parameters")
    public static ZSTDParameters ZSTD_getParams(int compressionLevel, @NativeType("unsigned long long") long estimatedSrcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_parameters") ZSTDParameters __result) {
        nZSTD_getParams(compressionLevel, estimatedSrcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_checkCParams ] ---

    /** Unsafe version of: {@link #ZSTD_checkCParams checkCParams} */
    public static native long nZSTD_checkCParams(long params);

    /** Ensures param values remain within authorized range. */
    @NativeType("size_t")
    public static long ZSTD_checkCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters params) {
        return nZSTD_checkCParams(params.address());
    }

    // --- [ ZSTD_adjustCParams ] ---

    /** Unsafe version of: {@link #ZSTD_adjustCParams adjustCParams} */
    public static native void nZSTD_adjustCParams(long cPar, long srcSize, long dictSize, long __result);

    /** Optimizes params for a given {@code srcSize} and {@code dictSize}. Both values are optional, select 0 if unknown. */
    @NativeType("ZSTD_compressionParameters")
    public static ZSTDCompressionParameters ZSTD_adjustCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cPar, @NativeType("unsigned long long") long srcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters __result) {
        nZSTD_adjustCParams(cPar.address(), srcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_compress_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_compress_advanced compress_advanced} */
    public static native long nZSTD_compress_advanced(long cctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize, long params);

    /** Same as {@link Zstd#ZSTD_compress_usingDict compress_usingDict}, with fine-tune control over compression parameters (by structure). */
    @NativeType("size_t")
    public static long ZSTD_compress_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_parameters") ZSTDParameters params) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compress_advanced(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddress(dict), dict.remaining(), params.address());
    }

    // --- [ ZSTD_compress_usingCDict_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_compress_usingCDict_advanced compress_usingCDict_advanced} */
    public static native long nZSTD_compress_usingCDict_advanced(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict, long fParams);

    /** Same as {@link Zstd#ZSTD_compress_usingCDict compress_usingCDict}, with fine-tune control over frame parameters. */
    @NativeType("size_t")
    public static long ZSTD_compress_usingCDict_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_CDict const *") long cdict, @NativeType("ZSTD_frameParameters") ZSTDFrameParameters fParams) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compress_usingCDict_advanced(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict, fParams.address());
    }

    // --- [ ZSTD_CCtx_loadDictionary_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_loadDictionary_byReference CCtx_loadDictionary_byReference} */
    public static native long nZSTD_CCtx_loadDictionary_byReference(long cctx, long dict, long dictSize);

    /**
     * Same as {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary}, but dictionary content is referenced, instead of being copied into {@code CCtx}.
     * 
     * <p>It saves some memory, but also requires that {@code dict} outlives its usage within {@code cctx}.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary_byReference(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary_byReference(cctx, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_CCtx_loadDictionary_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_loadDictionary_advanced CCtx_loadDictionary_advanced} */
    public static native long nZSTD_CCtx_loadDictionary_advanced(long cctx, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /**
     * Same as {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary}, but gives finer control over how to load the dictionary (by copy ? by reference ?) and how to interpret it
     * (automatic ? force raw mode ? full mode only ?).
     *
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary_advanced(cctx, memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_CCtx_refPrefix_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} */
    public static native long nZSTD_CCtx_refPrefix_advanced(long cctx, long prefix, long prefixSize, int dictContentType);

    /**
     * Same as {@link #ZSTD_CCtx_refPrefix CCtx_refPrefix}, but gives finer control over how to interpret prefix content (automatic ? force raw mode (default) ? full mode only ?).
     *
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer prefix, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix_advanced(cctx, memAddress(prefix), prefix.remaining(), dictContentType);
    }

    // --- [ ZSTD_CCtx_getParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_getParameter CCtx_getParameter} */
    public static native long nZSTD_CCtx_getParameter(long cctx, int param, long value);

    /**
     * Gets the requested compression parameter value, selected by {@code enum ZSTD_cParameter}, and stores it into {@code int* value}.
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td><td>{@link #ZSTD_c_searchLog c_searchLog}</td></tr><tr><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td></tr><tr><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td></tr><tr><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_getParameter(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_cParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(cctx);
            check(value, 1);
        }
        return nZSTD_CCtx_getParameter(cctx, param, memAddress(value));
    }

    // --- [ ZSTD_createCCtxParams ] ---

    /** Creates a {@code ZSTD_CCtx_params} structure. */
    @NativeType("ZSTD_CCtx_params *")
    public static native long ZSTD_createCCtxParams();

    // --- [ ZSTD_freeCCtxParams ] ---

    public static native long nZSTD_freeCCtxParams(long params);

    @NativeType("size_t")
    public static long ZSTD_freeCCtxParams(@NativeType("ZSTD_CCtx_params *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_freeCCtxParams(params);
    }

    // --- [ ZSTD_CCtxParams_reset ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParams_reset CCtxParams_reset} */
    public static native long nZSTD_CCtxParams_reset(long params);

    /** Resets params to default values. */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_reset(@NativeType("ZSTD_CCtx_params *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_CCtxParams_reset(params);
    }

    // --- [ ZSTD_CCtxParams_init ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParams_init CCtxParams_init} */
    public static native long nZSTD_CCtxParams_init(long cctxParams, int compressionLevel);

    /** Initializes the compression parameters of {@code cctxParams} according to compression level. All other parameters are reset to their default values. */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_init(@NativeType("ZSTD_CCtx_params *") long cctxParams, int compressionLevel) {
        if (CHECKS) {
            check(cctxParams);
        }
        return nZSTD_CCtxParams_init(cctxParams, compressionLevel);
    }

    // --- [ ZSTD_CCtxParams_init_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParams_init_advanced CCtxParams_init_advanced} */
    public static native long nZSTD_CCtxParams_init_advanced(long cctxParams, long params);

    /** Initializes the compression and frame parameters of {@code cctxParams} according to params. All other parameters are reset to their default values. */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_init_advanced(@NativeType("ZSTD_CCtx_params *") long cctxParams, @NativeType("ZSTD_parameters") ZSTDParameters params) {
        if (CHECKS) {
            check(cctxParams);
        }
        return nZSTD_CCtxParams_init_advanced(cctxParams, params.address());
    }

    // --- [ ZSTD_CCtxParam_setParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParam_setParameter CCtxParam_setParameter} */
    public static native long nZSTD_CCtxParam_setParameter(long params, int param, int value);

    /**
     * Similar to {@link #ZSTD_CCtx_setParameter CCtx_setParameter}. Sets one compression parameter, selected by {@code enum ZSTD_cParameter}.
     * 
     * <p>Parameters must be applied to a {@code ZSTD_CCtx} using {@link #ZSTD_CCtx_setParametersUsingCCtxParams CCtx_setParametersUsingCCtxParams}.</p>
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td><td>{@link #ZSTD_c_searchLog c_searchLog}</td></tr><tr><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td></tr><tr><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td></tr><tr><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtxParam_setParameter(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("ZSTD_cParameter") int param, int value) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_CCtxParam_setParameter(params, param, value);
    }

    // --- [ ZSTD_CCtxParam_getParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParam_getParameter CCtxParam_getParameter} */
    public static native long nZSTD_CCtxParam_getParameter(long params, int param, long value);

    /**
     * Similar to {@link #ZSTD_CCtx_getParameter CCtx_getParameter}. Gets the requested value of one compression parameter, selected by {@code enum ZSTD_cParameter}.
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td><td>{@link #ZSTD_c_searchLog c_searchLog}</td></tr><tr><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td></tr><tr><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td></tr><tr><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtxParam_getParameter(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("ZSTD_cParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(params);
            check(value, 1);
        }
        return nZSTD_CCtxParam_getParameter(params, param, memAddress(value));
    }

    // --- [ ZSTD_CCtx_setParametersUsingCCtxParams ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_setParametersUsingCCtxParams CCtx_setParametersUsingCCtxParams} */
    public static native long nZSTD_CCtx_setParametersUsingCCtxParams(long cctx, long params);

    /**
     * Applies a set of {@code ZSTD_CCtx_params} to the compression context.
     * 
     * <p>This can be done even after compression is started, if {@code nbWorkers==0}, this will have no impact until a new compression is started. If
     * {@code nbWorkers} &ge; 1, new parameters will be picked up at next job, with a few restrictions (windowLog, pledgedSrcSize, nbWorkers, jobSize, and
     * overlapLog are not updated).</p>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParametersUsingCCtxParams(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(cctx);
            check(params);
        }
        return nZSTD_CCtx_setParametersUsingCCtxParams(cctx, params);
    }

    // --- [ ZSTD_compressStream2_simpleArgs ] ---

    /** Unsafe version of: {@link #ZSTD_compressStream2_simpleArgs compressStream2_simpleArgs} */
    public static native long nZSTD_compressStream2_simpleArgs(long cctx, long dst, long dstCapacity, long dstPos, long src, long srcSize, long srcPos, int endOp);

    /**
     * Same as {@link #ZSTD_compressStream2 compressStream2}, but using only integral types as arguments.
     * 
     * <p>This variant might be helpful for binders from dynamic languages which have troubles handling structures containing memory pointers.</p>
     *
     * @param endOp one of:<br><table><tr><td>{@link #ZSTD_e_continue e_continue}</td><td>{@link #ZSTD_e_flush e_flush}</td><td>{@link #ZSTD_e_end e_end}</td></tr></table>
     */
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

    /** Unsafe version of: {@link #ZSTD_isFrame isFrame} */
    public static native int nZSTD_isFrame(long buffer, long size);

    /**
     * Tells if the content of {@code buffer} starts with a valid Frame Identifier.
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>Frame Identifier is 4 bytes. If {@code size < 4}, {@code @return} will always be 0.</li>
     * <li>Legacy Frame Identifiers are considered valid only if Legacy Support is enabled.</li>
     * <li>Skippable Frame Identifiers are considered valid.</li>
     * </ol>
     */
    @NativeType("unsigned int")
    public static boolean ZSTD_isFrame(@NativeType("void const *") ByteBuffer buffer) {
        return nZSTD_isFrame(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ ZSTD_createDDict_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_createDDict_byReference createDDict_byReference} */
    public static native long nZSTD_createDDict_byReference(long dictBuffer, long dictSize);

    /**
     * Creates a digested dictionary, ready to start decompression operation without startup delay.
     * 
     * <p>Dictionary content is referenced, and therefore stays in {@code dictBuffer}. It is important that {@code dictBuffer} outlives {@code DDict}, it must
     * remain read accessible throughout the lifetime of {@code DDict}.</p>
     */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict_byReference(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZSTD_createDDict_byReference(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZSTD_getDictID_fromDict ] ---

    /** Unsafe version of: {@link #ZSTD_getDictID_fromDict getDictID_fromDict} */
    public static native int nZSTD_getDictID_fromDict(long dict, long dictSize);

    /**
     * Provides the {@code dictID} stored within dictionary.
     *
     * @return if {@code == 0}, the dictionary is not conformant with Zstandard specification. It can still be loaded, but as a content-only dictionary.
     */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromDict(@NativeType("void const *") ByteBuffer dict) {
        return nZSTD_getDictID_fromDict(memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_getDictID_fromDDict ] ---

    /** Unsafe version of: {@link #ZSTD_getDictID_fromDDict getDictID_fromDDict} */
    public static native int nZSTD_getDictID_fromDDict(long ddict);

    /**
     * Provides the {@code dictID} of the dictionary loaded into {@code ddict}.
     *
     * @return if {@code == 0}, the dictionary is not conformant to Zstandard specification, or empty.
     *         
     *         <p>Non-conformant dictionaries can still be loaded, but as content-only dictionaries.</p>
     */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromDDict(@NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(ddict);
        }
        return nZSTD_getDictID_fromDDict(ddict);
    }

    // --- [ ZSTD_getDictID_fromFrame ] ---

    /** Unsafe version of: {@link #ZSTD_getDictID_fromFrame getDictID_fromFrame} */
    public static native int nZSTD_getDictID_fromFrame(long src, long srcSize);

    /**
     * Provides the dictID required to decompressed the frame stored within {@code src}.
     *
     * @return if {@code == 0}, the {@code dictID} could not be decoded. This could for one of the following reasons :
     *         
     *         <ul>
     *         <li>The frame does not require a dictionary to be decoded (most common case).</li>
     *         <li>The frame was built with {@code dictID} intentionally removed. Whatever dictionary is necessary is a hidden information.
     *         
     *         <p>Note: this use case also happens when using a non-conformant dictionary.</p></li>
     *         <li>{@code srcSize} is too small, and as a result, the frame header could not be decoded (only possible if {@code srcSize} &lt; {@link #ZSTD_FRAMEHEADERSIZE_MAX FRAMEHEADERSIZE_MAX}).</li>
     *         <li>This is not a Zstandard frame. When identifying the exact failure cause, it's possible to use {@link #ZSTD_getFrameHeader getFrameHeader}, which will provide a more precise
     *         error code.</li>
     *         </ul>
     */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getDictID_fromFrame(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_DCtx_loadDictionary_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary_byReference DCtx_loadDictionary_byReference} */
    public static native long nZSTD_DCtx_loadDictionary_byReference(long dctx, long dict, long dictSize);

    /**
     * Same as {@link #ZSTD_DCtx_loadDictionary DCtx_loadDictionary}, but references {@code dict} content instead of copying it into {@code dctx}.
     * 
     * <p>This saves memory if {@code dict} remains around. However, it's imperative that {@code dict} remains accessible (and unmodified) while being used, so
     * it must outlive decompression.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary_byReference(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary_byReference(dctx, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_DCtx_loadDictionary_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary_advanced DCtx_loadDictionary_advanced} */
    public static native long nZSTD_DCtx_loadDictionary_advanced(long dctx, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /**
     * Same as {@link #ZSTD_DCtx_loadDictionary DCtx_loadDictionary}, but gives direct control over how to load the dictionary (by copy ? by reference ?) and how to interpret it
     * (automatic ? force raw mode ? full mode only ?).
     *
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary_advanced(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary_advanced(dctx, memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_DCtx_refPrefix_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_refPrefix_advanced DCtx_refPrefix_advanced} */
    public static native long nZSTD_DCtx_refPrefix_advanced(long dctx, long prefix, long prefixSize, int dictContentType);

    /**
     * Same as {@link #ZSTD_DCtx_refPrefix DCtx_refPrefix}, but gives finer control over how to interpret prefix content (automatic ? force raw mode (default) ? full mode only ?).
     *
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix_advanced(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer prefix, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix_advanced(dctx, memAddress(prefix), prefix.remaining(), dictContentType);
    }

    // --- [ ZSTD_DCtx_setMaxWindowSize ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_setMaxWindowSize DCtx_setMaxWindowSize} */
    public static native long nZSTD_DCtx_setMaxWindowSize(long dctx, long maxWindowSize);

    /**
     * Refuses allocating internal buffers for frames requiring a window size larger than provided limit.
     * 
     * <p>This protects a decoder context from reserving too much memory for itself (potential attack scenario). This parameter is only useful in streaming mode,
     * since no internal buffer is allocated in single-pass mode. By default, a decompression context accepts all window sizes &le; (1 &lt;&lt;
     * {@link #ZSTD_WINDOWLOG_LIMIT_DEFAULT WINDOWLOG_LIMIT_DEFAULT}).</p>
     *
     * @return 0, or an error code (which can be tested using {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setMaxWindowSize(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("size_t") long maxWindowSize) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setMaxWindowSize(dctx, maxWindowSize);
    }

    // --- [ ZSTD_DCtx_setFormat ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_setFormat DCtx_setFormat} */
    public static native long nZSTD_DCtx_setFormat(long dctx, int format);

    /**
     * Instructs the decoder context about what kind of data to decode next.
     * 
     * <p>This instruction is mandatory to decode data without a fully-formed header, such {@link #ZSTD_f_zstd1_magicless f_zstd1_magicless} for example.</p>
     *
     * @param format one of:<br><table><tr><td>{@link #ZSTD_f_zstd1 f_zstd1}</td><td>{@link #ZSTD_f_zstd1_magicless f_zstd1_magicless}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested using {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setFormat(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_format_e") int format) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setFormat(dctx, format);
    }

    // --- [ ZSTD_decompressStream_simpleArgs ] ---

    /** Unsafe version of: {@link #ZSTD_decompressStream_simpleArgs decompressStream_simpleArgs} */
    public static native long nZSTD_decompressStream_simpleArgs(long dctx, long dst, long dstCapacity, long dstPos, long src, long srcSize, long srcPos);

    /**
     * Same as {@link Zstd#ZSTD_decompressStream decompressStream}, but using only integral types as arguments.
     * 
     * <p>This can be helpful for binders from dynamic languages which have troubles handling structures containing memory pointers.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_decompressStream_simpleArgs(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("size_t *") PointerBuffer dstPos, @NativeType("void const *") ByteBuffer src, @NativeType("size_t *") PointerBuffer srcPos) {
        if (CHECKS) {
            check(dctx);
            check(dstPos, 1);
            check(srcPos, 1);
        }
        return nZSTD_decompressStream_simpleArgs(dctx, memAddress(dst), dst.remaining(), memAddress(dstPos), memAddress(src), src.remaining(), memAddress(srcPos));
    }

    // --- [ ZSTD_initCStream_srcSize ] ---

    public static native long nZSTD_initCStream_srcSize(long zcs, int compressionLevel, long pledgedSrcSize);

    @NativeType("size_t")
    public static long ZSTD_initCStream_srcSize(@NativeType("ZSTD_CStream *") long zcs, int compressionLevel, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_initCStream_srcSize(zcs, compressionLevel, pledgedSrcSize);
    }

    // --- [ ZSTD_initCStream_usingDict ] ---

    public static native long nZSTD_initCStream_usingDict(long zcs, long dict, long dictSize, int compressionLevel);

    @NativeType("size_t")
    public static long ZSTD_initCStream_usingDict(@NativeType("ZSTD_CStream *") long zcs, @NativeType("void const *") ByteBuffer dict, int compressionLevel) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_initCStream_usingDict(zcs, memAddress(dict), dict.remaining(), compressionLevel);
    }

    // --- [ ZSTD_initCStream_advanced ] ---

    public static native long nZSTD_initCStream_advanced(long zcs, long dict, long dictSize, long params, long pledgedSrcSize);

    @NativeType("size_t")
    public static long ZSTD_initCStream_advanced(@NativeType("ZSTD_CStream *") long zcs, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_parameters") ZSTDParameters params, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_initCStream_advanced(zcs, memAddress(dict), dict.remaining(), params.address(), pledgedSrcSize);
    }

    // --- [ ZSTD_initCStream_usingCDict ] ---

    public static native long nZSTD_initCStream_usingCDict(long zcs, long cdict);

    @NativeType("size_t")
    public static long ZSTD_initCStream_usingCDict(@NativeType("ZSTD_CStream *") long zcs, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(zcs);
            check(cdict);
        }
        return nZSTD_initCStream_usingCDict(zcs, cdict);
    }

    // --- [ ZSTD_initCStream_usingCDict_advanced ] ---

    public static native long nZSTD_initCStream_usingCDict_advanced(long zcs, long cdict, long fParams, long pledgedSrcSize);

    @NativeType("size_t")
    public static long ZSTD_initCStream_usingCDict_advanced(@NativeType("ZSTD_CStream *") long zcs, @NativeType("ZSTD_CDict const *") long cdict, @NativeType("ZSTD_frameParameters") ZSTDFrameParameters fParams, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(zcs);
            check(cdict);
        }
        return nZSTD_initCStream_usingCDict_advanced(zcs, cdict, fParams.address(), pledgedSrcSize);
    }

    // --- [ ZSTD_resetCStream ] ---

    /** Unsafe version of: {@link #ZSTD_resetCStream resetCStream} */
    public static native long nZSTD_resetCStream(long zcs, long pledgedSrcSize);

    /**
     * Starts a new frame, using same parameters from previous frame.
     * 
     * <p>This is typically useful to skip dictionary loading stage, since it will re-use it in-place. Note that {@code zcs} must be init at least once before
     * using {@code ZSTD_resetCStream()}.</p>
     *
     * @param pledgedSrcSize if not known at reset time, use {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}. If &gt; 0, its value must be correct, as it will be written in header, and controlled at the
     *                       end.
     *
     * @return 0, or an error code (which can be tested using {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_resetCStream(@NativeType("ZSTD_CStream *") long zcs, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(zcs);
        }
        return nZSTD_resetCStream(zcs, pledgedSrcSize);
    }

    // --- [ ZSTD_getFrameProgression ] ---

    /** Unsafe version of: {@link #ZSTD_getFrameProgression getFrameProgression} */
    public static native void nZSTD_getFrameProgression(long cctx, long __result);

    /**
     * Tells how much data has been ingested (read from input) consumed (input actually compressed) and produced (output) for current frame.
     * 
     * <p>Note: {@code (ingested - consumed)} is amount of input data buffered internally, not yet compressed. Aggregates progression inside active worker
     * threads.</p>
     */
    @NativeType("ZSTD_frameProgression")
    public static ZSTDFrameProgression ZSTD_getFrameProgression(@NativeType("ZSTD_CCtx const *") long cctx, @NativeType("ZSTD_frameProgression") ZSTDFrameProgression __result) {
        if (CHECKS) {
            check(cctx);
        }
        nZSTD_getFrameProgression(cctx, __result.address());
        return __result;
    }

    // --- [ ZSTD_toFlushNow ] ---

    /** Unsafe version of: {@link #ZSTD_toFlushNow toFlushNow} */
    public static native long nZSTD_toFlushNow(long cctx);

    /**
     * Tells how many bytes are ready to be flushed immediately.
     * 
     * <p>Useful for multithreading scenarios ({@code nbWorkers} &ge; 1). Probe the oldest active job, defined as oldest job not yet entirely flushed, and check
     * its output buffer.</p>
     *
     * @return amount of data stored in oldest job and ready to be flushed immediately. If {@code == 0}, it means either:
     *         
     *         <ul>
     *         <li>there is no active job (could be checked with {@link #ZSTD_getFrameProgression getFrameProgression}), or</li>
     *         <li>oldest job is still actively compressing data, but everything it has produced has also been flushed so far, therefore flush speed is limited by
     *         production speed of oldest job irrespective of the speed of concurrent (and newer) jobs.</li>
     *         </ul>
     */
    @NativeType("size_t")
    public static long ZSTD_toFlushNow(@NativeType("ZSTD_CCtx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_toFlushNow(cctx);
    }

    // --- [ ZSTD_initDStream_usingDict ] ---

    public static native long nZSTD_initDStream_usingDict(long zds, long dict, long dictSize);

    @NativeType("size_t")
    public static long ZSTD_initDStream_usingDict(@NativeType("ZSTD_DStream *") long zds, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(zds);
        }
        return nZSTD_initDStream_usingDict(zds, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_initDStream_usingDDict ] ---

    public static native long nZSTD_initDStream_usingDDict(long zds, long ddict);

    @NativeType("size_t")
    public static long ZSTD_initDStream_usingDDict(@NativeType("ZSTD_DStream *") long zds, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(zds);
            check(ddict);
        }
        return nZSTD_initDStream_usingDDict(zds, ddict);
    }

    // --- [ ZSTD_resetDStream ] ---

    public static native long nZSTD_resetDStream(long zds);

    @NativeType("size_t")
    public static long ZSTD_resetDStream(@NativeType("ZSTD_DStream *") long zds) {
        if (CHECKS) {
            check(zds);
        }
        return nZSTD_resetDStream(zds);
    }

    // --- [ ZSTD_compressBegin ] ---

    public static native long nZSTD_compressBegin(long cctx, int compressionLevel);

    @NativeType("size_t")
    public static long ZSTD_compressBegin(@NativeType("ZSTD_CCtx *") long cctx, int compressionLevel) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressBegin(cctx, compressionLevel);
    }

    // --- [ ZSTD_compressBegin_usingDict ] ---

    public static native long nZSTD_compressBegin_usingDict(long cctx, long dict, long dictSize, int compressionLevel);

    @NativeType("size_t")
    public static long ZSTD_compressBegin_usingDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer dict, int compressionLevel) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressBegin_usingDict(cctx, memAddress(dict), dict.remaining(), compressionLevel);
    }

    // --- [ ZSTD_compressBegin_advanced ] ---

    public static native long nZSTD_compressBegin_advanced(long cctx, long dict, long dictSize, long params, long pledgedSrcSize);

    @NativeType("size_t")
    public static long ZSTD_compressBegin_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_parameters") ZSTDParameters params, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressBegin_advanced(cctx, memAddress(dict), dict.remaining(), params.address(), pledgedSrcSize);
    }

    // --- [ ZSTD_compressBegin_usingCDict ] ---

    public static native long nZSTD_compressBegin_usingCDict(long cctx, long cdict);

    @NativeType("size_t")
    public static long ZSTD_compressBegin_usingCDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compressBegin_usingCDict(cctx, cdict);
    }

    // --- [ ZSTD_compressBegin_usingCDict_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_compressBegin_usingCDict_advanced compressBegin_usingCDict_advanced} */
    public static native long nZSTD_compressBegin_usingCDict_advanced(long cctx, long cdict, long fParams, long pledgedSrcSize);

    /** @param pledgedSrcSize if not known, use {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN} */
    @NativeType("size_t")
    public static long ZSTD_compressBegin_usingCDict_advanced(@NativeType("ZSTD_CCtx * const") long cctx, @NativeType("ZSTD_CDict const * const") long cdict, @NativeType("ZSTD_frameParameters const") ZSTDFrameParameters fParams, @NativeType("unsigned long long const") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compressBegin_usingCDict_advanced(cctx, cdict, fParams.address(), pledgedSrcSize);
    }

    // --- [ ZSTD_copyCCtx ] ---

    /** Unsafe version of: {@link #ZSTD_copyCCtx copyCCtx} */
    public static native long nZSTD_copyCCtx(long cctx, long preparedCCtx, long pledgedSrcSize);

    /** @param pledgedSrcSize if not known, use {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN} */
    @NativeType("size_t")
    public static long ZSTD_copyCCtx(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CCtx const *") long preparedCCtx, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
            check(preparedCCtx);
        }
        return nZSTD_copyCCtx(cctx, preparedCCtx, pledgedSrcSize);
    }

    // --- [ ZSTD_compressContinue ] ---

    public static native long nZSTD_compressContinue(long cctx, long dst, long dstCapacity, long src, long srcSize);

    @NativeType("size_t")
    public static long ZSTD_compressContinue(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressContinue(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compressEnd ] ---

    public static native long nZSTD_compressEnd(long cctx, long dst, long dstCapacity, long src, long srcSize);

    @NativeType("size_t")
    public static long ZSTD_compressEnd(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressEnd(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameHeader ] ---

    /** Unsafe version of: {@link #ZSTD_getFrameHeader getFrameHeader} */
    public static native long nZSTD_getFrameHeader(long zfhPtr, long src, long srcSize);

    /**
     * Decode Frame Header, or requires larger {@code srcSize}.
     *
     * @return 0, {@code zfhPtr} is correctly filled, &gt;0, {@code srcSize} is too small, value is wanted {@code srcSize} amount, or an error code, which can be
     *         tested using {@link Zstd#ZSTD_isError isError}
     */
    @NativeType("size_t")
    public static long ZSTD_getFrameHeader(@NativeType("ZSTD_frameHeader *") ZSTDFrameHeader zfhPtr, @NativeType("void const *") ByteBuffer src) {
        return nZSTD_getFrameHeader(zfhPtr.address(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameHeader_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_getFrameHeader_advanced getFrameHeader_advanced} */
    public static native long nZSTD_getFrameHeader_advanced(long zfhPtr, long src, long srcSize, int format);

    /**
     * Same as {@link #ZSTD_getFrameHeader getFrameHeader}, with added capability to select a format (like {@link #ZSTD_f_zstd1_magicless f_zstd1_magicless}).
     *
     * @param format one of:<br><table><tr><td>{@link #ZSTD_f_zstd1 f_zstd1}</td><td>{@link #ZSTD_f_zstd1_magicless f_zstd1_magicless}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_getFrameHeader_advanced(@NativeType("ZSTD_frameHeader *") ZSTDFrameHeader zfhPtr, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_format_e") int format) {
        return nZSTD_getFrameHeader_advanced(zfhPtr.address(), memAddress(src), src.remaining(), format);
    }

    // --- [ ZSTD_decodingBufferSize_min ] ---

    @NativeType("size_t")
    public static native long ZSTD_decodingBufferSize_min(@NativeType("unsigned long long") long windowSize, @NativeType("unsigned long long") long frameContentSize);

    // --- [ ZSTD_decompressBegin ] ---

    public static native long nZSTD_decompressBegin(long dctx);

    @NativeType("size_t")
    public static long ZSTD_decompressBegin(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressBegin(dctx);
    }

    // --- [ ZSTD_decompressBegin_usingDict ] ---

    public static native long nZSTD_decompressBegin_usingDict(long dctx, long dict, long dictSize);

    @NativeType("size_t")
    public static long ZSTD_decompressBegin_usingDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressBegin_usingDict(dctx, memAddress(dict), dict.remaining());
    }

    // --- [ ZSTD_decompressBegin_usingDDict ] ---

    public static native long nZSTD_decompressBegin_usingDDict(long dctx, long ddict);

    @NativeType("size_t")
    public static long ZSTD_decompressBegin_usingDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
            check(ddict);
        }
        return nZSTD_decompressBegin_usingDDict(dctx, ddict);
    }

    // --- [ ZSTD_nextSrcSizeToDecompress ] ---

    public static native long nZSTD_nextSrcSizeToDecompress(long dctx);

    @NativeType("size_t")
    public static long ZSTD_nextSrcSizeToDecompress(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_nextSrcSizeToDecompress(dctx);
    }

    // --- [ ZSTD_decompressContinue ] ---

    public static native long nZSTD_decompressContinue(long dctx, long dst, long dstCapacity, long src, long srcSize);

    @NativeType("size_t")
    public static long ZSTD_decompressContinue(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressContinue(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_copyDCtx ] ---

    public static native void nZSTD_copyDCtx(long dctx, long preparedDCtx);

    public static void ZSTD_copyDCtx(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_DCtx const *") long preparedDCtx) {
        if (CHECKS) {
            check(dctx);
            check(preparedDCtx);
        }
        nZSTD_copyDCtx(dctx, preparedDCtx);
    }

    // --- [ ZSTD_nextInputType ] ---

    public static native int nZSTD_nextInputType(long dctx);

    @NativeType("ZSTD_nextInputType_e")
    public static int ZSTD_nextInputType(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_nextInputType(dctx);
    }

    // --- [ ZSTD_getBlockSize ] ---

    public static native long nZSTD_getBlockSize(long cctx);

    @NativeType("size_t")
    public static long ZSTD_getBlockSize(@NativeType("ZSTD_CCtx const *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_getBlockSize(cctx);
    }

    // --- [ ZSTD_compressBlock ] ---

    public static native long nZSTD_compressBlock(long cctx, long dst, long dstCapacity, long src, long srcSize);

    @NativeType("size_t")
    public static long ZSTD_compressBlock(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressBlock(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_decompressBlock ] ---

    public static native long nZSTD_decompressBlock(long dctx, long dst, long dstCapacity, long src, long srcSize);

    @NativeType("size_t")
    public static long ZSTD_decompressBlock(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompressBlock(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_insertBlock ] ---

    /** Unsafe version of: {@link #ZSTD_insertBlock insertBlock} */
    public static native long nZSTD_insertBlock(long dctx, long blockStart, long blockSize);

    /** Insert uncompressed block into {@code dctx} history. Useful for multi-blocks decompression. */
    @NativeType("size_t")
    public static long ZSTD_insertBlock(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer blockStart) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_insertBlock(dctx, memAddress(blockStart), blockStart.remaining());
    }

}