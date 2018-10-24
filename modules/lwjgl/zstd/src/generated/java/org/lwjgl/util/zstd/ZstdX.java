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

/**
 * Native bindings to the experimental API of <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd).
 * 
 * <p>In this proposal, parameters are pushed one by one into an existing context, and then applied on all subsequent compression jobs. When no parameter is
 * ever provided, {@code CCtx} is created with compression level {@code ZSTD_CLEVEL_DEFAULT}.</p>
 * 
 * <p>This API is intended to replace all others experimental API. It can basically do all other use cases, and even new ones. In constrast with
 * {@code _advanced()} variants, it stands a reasonable chance to become "stable", after a good testing period.</p>
 * 
 * <h3>Block level API</h3>
 * 
 * <p>Block functions produce and decode raw zstd blocks, without frame metadata.</p>
 * 
 * <p>Frame metadata cost is typically ~18 bytes, which can be non-negligible for very small blocks (&lt; 100 bytes). User will have to take in charge required
 * information to regenerate data, such as compressed and content sizes.</p>
 * 
 * <p>A few rules to respect:</p>
 * 
 * <ul>
 * <li>Compressing and decompressing require a context structure. Use {@link Zstd#ZSTD_createCCtx createCCtx} and {@link Zstd#ZSTD_createDCtx createDCtx}.</li>
 * <li>It is necessary to init context before starting
 * 
 * <ul>
 * <li>compression : any {@code ZSTD_compressBegin*()} variant, including with dictionary</li>
 * <li>decompression : any {@code ZSTD_decompressBegin*()} variant, including with dictionary</li>
 * <li>{@link #ZSTD_copyCCtx copyCCtx} and {@link #ZSTD_copyDCtx copyDCtx} can be used too</li>
 * </ul></li>
 * <li>Block size is limited, it must be &le; {@link #ZSTD_getBlockSize getBlockSize} &le; {@link #ZSTD_BLOCKSIZE_MAX BLOCKSIZE_MAX} == 128 KB
 * 
 * <ul>
 * <li>If input is larger than a block size, it's necessary to split input data into multiple blocks.</li>
 * <li>For inputs larger than a single block size, consider using the regular {@link Zstd#ZSTD_compress compress} instead. Frame metadata is not that costly, and quickly
 * becomes negligible as source size grows larger.</li>
 * </ul></li>
 * <li>When a block is considered not compressible enough, {@link #ZSTD_compressBlock compressBlock} result will be zero. In which case, nothing is produced into {@code dst}.
 * 
 * <ul>
 * <li>User must test for such outcome and deal directly with uncompressed data.</li>
 * <li>{@link #ZSTD_decompressBlock decompressBlock} doesn't accept uncompressed data as input !!!</li>
 * <li>In case of multiple successive blocks, should some of them be uncompressed, decoder must be informed of their existence in order to follow
 * proper history. Use {@link #ZSTD_insertBlock insertBlock} for such a case.</li>
 * </ul></li>
 * </ul>
 */
public class ZstdX {

    /** Magic number. */
    public static final int
        ZSTD_MAGICNUMBER           = 0xFD2FB528,
        ZSTD_MAGIC_SKIPPABLE_START = 0x184D2A50,
        ZSTD_MAGIC_DICTIONARY      = 0xEC30A437;

    /** Block size constant. */
    public static final int
        ZSTD_BLOCKSIZELOG_MAX = 17,
        ZSTD_BLOCKSIZE_MAX    = (1<<ZSTD_BLOCKSIZELOG_MAX);

    /** Constant. */
    public static final int
        ZSTD_WINDOWLOG_MAX_32       = 30,
        ZSTD_WINDOWLOG_MAX_64       = 31,
        ZSTD_WINDOWLOG_MAX          = (Pointer.BITS32 ? ZSTD_WINDOWLOG_MAX_32 : ZSTD_WINDOWLOG_MAX_64),
        ZSTD_WINDOWLOG_MIN          = 10,
        ZSTD_HASHLOG_MAX            = (ZSTD_WINDOWLOG_MAX < 30) ? ZSTD_WINDOWLOG_MAX : 30,
        ZSTD_HASHLOG_MIN            = 6,
        ZSTD_CHAINLOG_MAX_32        = 29,
        ZSTD_CHAINLOG_MAX_64        = 30,
        ZSTD_CHAINLOG_MAX           = (Pointer.BITS32 ? ZSTD_CHAINLOG_MAX_32 : ZSTD_CHAINLOG_MAX_64),
        ZSTD_CHAINLOG_MIN           = ZSTD_HASHLOG_MIN,
        ZSTD_HASHLOG3_MAX           = 17,
        ZSTD_SEARCHLOG_MAX          = (ZSTD_WINDOWLOG_MAX-1),
        ZSTD_SEARCHLOG_MIN          = 1,
        ZSTD_SEARCHLENGTH_MAX       = 7,
        ZSTD_SEARCHLENGTH_MIN       = 3,
        ZSTD_TARGETLENGTH_MAX       = ZSTD_BLOCKSIZE_MAX,
        ZSTD_TARGETLENGTH_MIN       = 0,
        ZSTD_LDM_MINMATCH_MAX       = 4096,
        ZSTD_LDM_MINMATCH_MIN       = 4,
        ZSTD_LDM_BUCKETSIZELOG_MAX  = 8,
        ZSTD_FRAMEHEADERSIZE_PREFIX = 5,
        ZSTD_FRAMEHEADERSIZE_MIN    = 6,
        ZSTD_FRAMEHEADERSIZE_MAX    = 18;

    /**
     * Strategies, from faster to stronger. ({@code ZSTD_strategy})
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
     * </ul>
     */
    public static final int
        ZSTD_fast    = 1,
        ZSTD_dfast   = 2,
        ZSTD_greedy  = 3,
        ZSTD_lazy    = 4,
        ZSTD_lazy2   = 5,
        ZSTD_btlazy2 = 6,
        ZSTD_btopt   = 7,
        ZSTD_btultra = 8;

    /**
     * {@code ZSTD_dictLoadMethod_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dlm_byCopy dlm_byCopy} - Copy dictionary content internally.</li>
     * <li>{@link #ZSTD_dlm_byRef dlm_byRef} - Reference dictionary content -- the dictionary buffer must outlive its users.</li>
     * </ul>
     */
    public static final int
        ZSTD_dlm_byCopy = 0,
        ZSTD_dlm_byRef  = 1;

    /**
     * {@code ZSTD_dictContentType_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dct_auto dct_auto} - dictionary is "full" when starting with {@link #ZSTD_MAGIC_DICTIONARY MAGIC_DICTIONARY}, otherwise it is "rawContent"</li>
     * <li>{@link #ZSTD_dct_rawContent dct_rawContent} - ensures dictionary is always loaded as rawContent, even if it starts with {@link #ZSTD_MAGIC_DICTIONARY MAGIC_DICTIONARY}</li>
     * <li>{@link #ZSTD_dct_fullDict dct_fullDict} - refuses to load a dictionary if it does not respect Zstandard's specification</li>
     * </ul>
     */
    public static final int
        ZSTD_dct_auto       = 0,
        ZSTD_dct_rawContent = 1,
        ZSTD_dct_fullDict   = 2;

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

    /**
     * {@code ZSTD_format_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_f_zstd1 f_zstd1} - zstd frame format, specified in zstd_compression_format.md (default)</li>
     * <li>{@link #ZSTD_f_zstd1_magicless f_zstd1_magicless} - 
     * Variant of zstd frame format, without initial 4-bytes magic number. Useful to save 4 bytes per generated frame. Decoder cannot recognise
     * automatically this format, requiring instructions.
     * </li>
     * </ul>
     */
    public static final int
        ZSTD_f_zstd1           = 0,
        ZSTD_f_zstd1_magicless = 1;

    /**
     * {@code ZSTD_cParameter}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_p_format p_format} - Cast selected format as unsigned for {@link #ZSTD_CCtx_setParameter CCtx_setParameter} compatibility.</li>
     * <li>{@link #ZSTD_p_compressionLevel p_compressionLevel} - 
     * Update all compression parameters according to pre-defined {@code cLevel} table.
     * 
     * <p>Default level is {@code ZSTD_CLEVEL_DEFAULT==3}.
     * Special: value 0 means default, which is controlled by {@link Zstd#ZSTD_CLEVEL_DEFAULT CLEVEL_DEFAULT}.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>it's possible to pass a negative compression level by casting it to unsigned type.</li>
     * <li>setting a level sets all default values of other compression parameters.</li>
     * </ol>
     * </li>
     * <li>{@link #ZSTD_p_windowLog p_windowLog} - 
     * Maximum allowed back-reference distance, expressed as power of 2.
     * 
     * <p>Must be clamped between {@link #ZSTD_WINDOWLOG_MIN WINDOWLOG_MIN} and {@link #ZSTD_WINDOWLOG_MAX WINDOWLOG_MAX}.</p>
     * 
     * <p>Special: value 0 means "use default {@code windowLog}".</p>
     * 
     * <p>Note: Using a window size greater than {@code ZSTD_MAXWINDOWSIZE_DEFAULT} (default: {@code 2^27}) requires explicitly allowing such window size
     * during decompression stage.</p>
     * </li>
     * <li>{@link #ZSTD_p_hashLog p_hashLog} - 
     * Size of the initial probe table, as a power of 2.
     * 
     * <p>Resulting table size is {@code (1 << (hashLog+2))}. Must be clamped between {@link #ZSTD_HASHLOG_MIN HASHLOG_MIN} and {@link #ZSTD_HASHLOG_MAX HASHLOG_MAX}. Larger tables improve compression ratio
     * of strategies &le; {@code dFast}, and improve speed of strategies &gt; {@code dFast}.</p>
     * 
     * <p>Special: value 0 means "use default {@code hashLog}".</p>
     * </li>
     * <li>{@link #ZSTD_p_chainLog p_chainLog} - 
     * Size of the multi-probe search table, as a power of 2.
     * 
     * <p>Resulting table size is {@code (1 << (chainLog+2))}. Must be clamped between {@link #ZSTD_CHAINLOG_MIN CHAINLOG_MIN} and {@link #ZSTD_CHAINLOG_MAX CHAINLOG_MAX}. Larger tables result in better and
     * slower compression. This parameter is useless when using "fast" strategy. Note it's still useful when using "dfast" strategy, in which case it
     * defines a secondary probe table.</p>
     * 
     * <p>Special: value 0 means "use default {@code chainLog}".</p>
     * </li>
     * <li>{@link #ZSTD_p_searchLog p_searchLog} - 
     * Number of search attempts, as a power of 2.
     * 
     * <p>More attempts result in better and slower compression. This parameter is useless when using "fast" and "dFast" strategies.</p>
     * 
     * <p>Special: value 0 means "use default {@code searchLog}".</p>
     * </li>
     * <li>{@link #ZSTD_p_minMatch p_minMatch} - 
     * Minimum size of searched matches (note: {@code repCode} matches can be smaller).
     * 
     * <p>Larger values make faster compression and decompression, but decrease ratio. Must be clamped between {@link #ZSTD_SEARCHLENGTH_MIN SEARCHLENGTH_MIN} and {@link #ZSTD_SEARCHLENGTH_MAX SEARCHLENGTH_MAX}.</p>
     * 
     * <p>Note that currently, for all strategies &lt; {@code btopt}, effective minimum is 4.</p>
     * 
     * <p>Note that currently, for all strategies &gt; fast, effective maximum is 6.</p>
     * 
     * <p>Special: value 0 means "use default {@code minMatchLength}".</p>
     * </li>
     * <li>{@link #ZSTD_p_targetLength p_targetLength} - 
     * Impact of this field depends on strategy.
     * 
     * <p>For strategies {@code btopt} &amp; {@code btultra}:</p>
     * 
     * <ul>
     * <li>Length of Match considered "good enough" to stop search.</li>
     * <li>Larger values make compression stronger, and slower.</li>
     * </ul>
     * 
     * <p>For strategy {@code fast}:</p>
     * 
     * <ul>
     * <li>Distance between match sampling.</li>
     * <li>Larger values make compression faster, and weaker.</li>
     * </ul>
     * 
     * <p>Special: value 0 means "use default {@code targetLength}".</p>
     * </li>
     * <li>{@link #ZSTD_p_compressionStrategy p_compressionStrategy} - 
     * See {@code ZSTD_strategy} enum definition.
     * 
     * <p>Cast selected strategy as unsigned for {@link #ZSTD_CCtx_setParameter CCtx_setParameter} compatibility. The higher the value of selected strategy, the more complex it is,
     * resulting in stronger and slower compression.</p>
     * 
     * <p>Special: value 0 means "use default strategy".</p>
     * </li>
     * <li>{@link #ZSTD_p_enableLongDistanceMatching p_enableLongDistanceMatching} - 
     * Enable long distance matching.
     * 
     * <p>This parameter is designed to improve compression ratio for large inputs, by finding large matches at long distance. It increases memory usage and
     * window size.</p>
     * 
     * <p>Note: enabling this parameter increases {@link #ZSTD_p_windowLog p_windowLog} to 128 MB except when expressly set to a different value.</p>
     * </li>
     * <li>{@link #ZSTD_p_ldmHashLog p_ldmHashLog} - 
     * Size of the table for long distance matching, as a power of 2.
     * 
     * <p>Larger values increase memory usage and compression ratio, but decrease compression speed. Must be clamped between {@link #ZSTD_HASHLOG_MIN HASHLOG_MIN} and {@link #ZSTD_HASHLOG_MAX HASHLOG_MAX}</p>
     * 
     * <p>Default: {@code windowlog - 7}.</p>
     * 
     * <p>Special: value 0 means "automatically determine {@code hashlog}".</p>
     * </li>
     * <li>{@link #ZSTD_p_ldmMinMatch p_ldmMinMatch} - 
     * Minimum match size for long distance matcher.
     * 
     * <p>Larger/too small values usually decrease compression ratio. Must be clamped between {@link #ZSTD_LDM_MINMATCH_MIN LDM_MINMATCH_MIN} and {@link #ZSTD_LDM_MINMATCH_MAX LDM_MINMATCH_MAX}.</p>
     * 
     * <p>Special: value 0 means "use default value" (default: 64).</p>
     * </li>
     * <li>{@link #ZSTD_p_ldmBucketSizeLog p_ldmBucketSizeLog} - 
     * Log size of each bucket in the LDM hash table for collision resolution.
     * 
     * <p>Larger values improve collision resolution but decrease compression speed. The maximum value is {@link #ZSTD_LDM_BUCKETSIZELOG_MAX LDM_BUCKETSIZELOG_MAX} .</p>
     * 
     * <p>Special: value 0 means "use default value" (default: 3).</p>
     * </li>
     * <li>{@link #ZSTD_p_ldmHashEveryLog p_ldmHashEveryLog} - 
     * Frequency of inserting/looking up entries in the LDM hash table.
     * 
     * <p>Must be clamped between 0 and ({@link #ZSTD_WINDOWLOG_MAX WINDOWLOG_MAX} - {@link #ZSTD_HASHLOG_MIN HASHLOG_MIN}). Default is {@code MAX(0, (windowLog - ldmHashLog))}, optimizing hash table usage.
     * Larger values improve compression speed. Deviating far from default value will likely result in a compression ratio decrease.</p>
     * 
     * <p>Special: value 0 means "automatically determine {@code hashEveryLog}".</p>
     * </li>
     * <li>{@link #ZSTD_p_contentSizeFlag p_contentSizeFlag} - 
     * Content size will be written into frame header <i>whenever known</i> (default:1)
     * 
     * <p>Content size must be known at the beginning of compression, it is provided using {@link #ZSTD_CCtx_setPledgedSrcSize CCtx_setPledgedSrcSize}.</p>
     * </li>
     * <li>{@link #ZSTD_p_checksumFlag p_checksumFlag} - A 32-bits checksum of content is written at end of frame (default:0).</li>
     * <li>{@link #ZSTD_p_dictIDFlag p_dictIDFlag} - When applicable, dictionary's ID is written into frame header (default:1).</li>
     * <li>{@link #ZSTD_p_nbWorkers p_nbWorkers} - 
     * Select how many threads will be spawned to compress in parallel.
     * 
     * <p>When {@code nbWorkers} &ge; 1, triggers asynchronous mode: {@link #ZSTD_compress_generic compress_generic} consumes some input, flush some output if possible, and immediately
     * gives back control to caller, while compression work is performed in parallel, within worker threads. (note: a strong exception to this rule is
     * when first invocation sets {@link #ZSTD_e_end e_end} : it becomes a blocking call).</p>
     * 
     * <p>More workers improve speed, but also increase memory usage.</p>
     * 
     * <p>Default value is 0, aka "single-threaded mode": no worker is spawned, compression is performed inside Caller's thread, all invocations are
     * blocking.</p>
     * </li>
     * <li>{@link #ZSTD_p_nonBlockingMode p_nonBlockingMode} - 
     * Single thread mode is by default "blocking": it finishes its job as much as possible, and only then gives back control to caller.
     * 
     * <p>In contrast, multi-thread is by default "non-blocking": it takes some input, flush some output if available, and immediately gives back control to
     * caller. Compression work is performed in parallel, within worker threads. (note : a strong exception to this rule is when first job is called with
     * {@link #ZSTD_e_end e_end} : it becomes blocking)</p>
     * 
     * <p>Setting this parameter to 1 will enforce non-blocking mode even when only 1 thread is selected. It allows the caller to do other tasks while the
     * worker thread compresses in parallel.</p>
     * </li>
     * <li>{@link #ZSTD_p_jobSize p_jobSize} - 
     * Size of a compression job.
     * 
     * <p>This value is enforced only in non-blocking mode. Each compression job is completed in parallel, so this value indirectly controls the {@code nb}
     * of active threads. 0 means default, which is dynamically determined based on compression parameters. Job size must be a minimum of
     * {@code overlapSize}, or 1 MB, whichever is largest. The minimum size is automatically and transparently enforced.</p>
     * </li>
     * <li>{@link #ZSTD_p_overlapSizeLog p_overlapSizeLog} - 
     * Size of previous input reloaded at the beginning of each job.
     * 
     * <ul>
     * <li>{@code 0: no overlap}</li>
     * <li>{@code 6(default): use 1/8th of windowSize}</li>
     * <li>{@code >=9: use full windowSize}</li>
     * </ul>
     * </li>
     * <li>{@link #ZSTD_p_forceMaxWindow p_forceMaxWindow} - Force back-reference distances to remain &lt; windowSize, even when referencing into Dictionary content (default:0)</li>
     * <li>{@link #ZSTD_p_forceAttachDict p_forceAttachDict} - 
     * ZSTD supports usage of a {@code CDict} in-place (avoiding having to copy the compression tables from the {@code CDict} into the working context).
     * Using a {@code CDict} in this way saves an initial setup step, but comes at the cost of more work per byte of input. ZSTD has a simple internal
     * heuristic that guesses which strategy will be faster. You can use this flag to override that guess.
     * 
     * <p>Note that the by-reference, in-place strategy is only used when reusing a compression context with compatible compression parameters. (If
     * incompatible / uninitialized, the working context needs to be cleared anyways, which is about as expensive as overwriting it with the dictionary
     * context, so there's no savings in using the CDict by-ref.)</p>
     * 
     * <p>Values greater than 0 force attaching the dict. Values less than 0 force copying the dict. 0 selects the default heuristic-guided behavior.</p>
     * </li>
     * </ul>
     */
    public static final int
        ZSTD_p_format                     = 10,
        ZSTD_p_compressionLevel           = 100,
        ZSTD_p_windowLog                  = 101,
        ZSTD_p_hashLog                    = 102,
        ZSTD_p_chainLog                   = 103,
        ZSTD_p_searchLog                  = 104,
        ZSTD_p_minMatch                   = 105,
        ZSTD_p_targetLength               = 106,
        ZSTD_p_compressionStrategy        = 107,
        ZSTD_p_enableLongDistanceMatching = 160,
        ZSTD_p_ldmHashLog                 = 161,
        ZSTD_p_ldmMinMatch                = 162,
        ZSTD_p_ldmBucketSizeLog           = 163,
        ZSTD_p_ldmHashEveryLog            = 164,
        ZSTD_p_contentSizeFlag            = 200,
        ZSTD_p_checksumFlag               = 201,
        ZSTD_p_dictIDFlag                 = 202,
        ZSTD_p_nbWorkers                  = 400,
        ZSTD_p_nonBlockingMode            = 401,
        ZSTD_p_jobSize                    = 402,
        ZSTD_p_overlapSizeLog             = 403,
        ZSTD_p_forceMaxWindow             = 1100,
        ZSTD_p_forceAttachDict            = 1101;

    /**
     * {@code ZSTD_EndDirective}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_e_continue e_continue} - Collect more data, encoder decides when to output compressed result, for optimal compression ratio.</li>
     * <li>{@link #ZSTD_e_flush e_flush} - 
     * Flush any data provided so far, it creates (at least) one new block, that can be decoded immediately on reception; frame will continue: any future
     * data can still reference previously compressed data, improving compression.
     * </li>
     * <li>{@link #ZSTD_e_end e_end} - 
     * Flush any remaining data and close current frame. Any additional data starts a new frame. Each frame is independent (does not reference any content
     * from previous frame).
     * </li>
     * </ul>
     */
    public static final int
        ZSTD_e_continue = 0,
        ZSTD_e_flush    = 1,
        ZSTD_e_end      = 2;

    static { LibZstd.initialize(); }

    protected ZstdX() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_minCLevel ] ---

    /** Returns minimum negative compression level allowed. */
    public static native int ZSTD_minCLevel();

    // --- [ ZSTD_findFrameCompressedSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_findFrameCompressedSize findFrameCompressedSize}
     *
     * @param srcSize must be &ge; first frame size
     */
    public static native long nZSTD_findFrameCompressedSize(long src, long srcSize);

    /**
     * @param src should point to the start of a ZSTD encoded frame or skippable frame
     *
     * @return the compressed size of the first frame starting at {@code src}, suitable to pass to {@link Zstd#ZSTD_decompress decompress} or similar, or an error code if input is invalid
     */
    @NativeType("size_t")
    public static long ZSTD_findFrameCompressedSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_findFrameCompressedSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_findDecompressedSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_findDecompressedSize findDecompressedSize}
     *
     * @param srcSize must be the <i>exact</i> size of this series (i.e. there should be a frame boundary exactly at {@code srcSize} bytes after {@code src})
     */
    public static native long nZSTD_findDecompressedSize(long src, long srcSize);

    /**
     * Notes:
     * 
     * <ol>
     * <li>decompressed size is an optional field, that may not be present, especially in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN}, data
     * to decompress could be any size. In which case, it's necessary to use streaming mode to decompress data.</li>
     * <li>decompressed size is always present when compression is done with {@link Zstd#ZSTD_compress compress}.</li>
     * <li>decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
     * case, it's necessary to use streaming mode to decompress data.</li>
     * <li>If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure result fits within application's authorized
     * limits. Each application can set its own limits.</li>
     * <li>{@code ZSTD_findDecompressedSize} handles multiple frames, and so it must traverse the input to read each contained frame header. This is fast as
     * most of the data is skipped, however it does mean that all frame data must be present and valid.</li>
     * </ol>
     *
     * @param src should point the start of a series of ZSTD encoded and/or skippable frames
     *
     * @return decompressed size of all data in all successive frames. If the decompressed size cannot be determined: {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}. If an error
     *         occurred: {@link Zstd#ZSTD_CONTENTSIZE_ERROR CONTENTSIZE_ERROR}
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

    /**
     * @param src should point to the start of a ZSTD frame
     *
     * @return size of the Frame Header or an error code (if {@code srcSize} is too small)
     */
    @NativeType("size_t")
    public static long ZSTD_frameHeaderSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_frameHeaderSize(memAddress(src), src.remaining());
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

    // --- [ ZSTD_estimateCCtxSize ] ---

    /**
     * Estimates memory usage of a future {@code CCtx}, before its creation.
     * 
     * <p>Will provide a budget large enough for any compression level up to selected one. It will also consider {@code src} size to be arbitrarily "large",
     * which is worst case. If {@code srcSize} is known to always be small, {@link #ZSTD_estimateCCtxSize_usingCCtxParams estimateCCtxSize_usingCCtxParams} can provide a tighter estimation.</p>
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

    /** Unsafe version of: {@link #ZSTD_estimateCCtxSize_usingCCtxParams estimateCCtxSize_usingCCtxParams} */
    public static native long nZSTD_estimateCCtxSize_usingCCtxParams(long params);

    /**
     * See {@link #ZSTD_estimateCCtxSize estimateCCtxSize}.
     * 
     * <p>Can be used in tandem with {@link #ZSTD_CCtxParam_setParameter CCtxParam_setParameter}. Only single-threaded compression is supported. This function will return an error code if
     * {@code ZSTD_p_nbWorkers} is &ge; 1.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_estimateCCtxSize_usingCCtxParams(@NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_estimateCCtxSize_usingCCtxParams(params);
    }

    // --- [ ZSTD_estimateDCtxSize ] ---

    /** Estimates memory usage of a future {@code DCtx}, before its creation. */
    @NativeType("size_t")
    public static native long ZSTD_estimateDCtxSize();

    // --- [ ZSTD_estimateCStreamSize ] ---

    /**
     * Estimates memory usage of a future {@code CStream}, before its creation.
     * 
     * <p>Will provide a budget large enough for any compression level up to selected one. It will also consider {@code src} size to be arbitrarily "large",
     * which is worst case.  If {@code srcSize} is known to always be small, {@link #ZSTD_estimateCStreamSize_usingCCtxParams estimateCStreamSize_usingCCtxParams} can provide a tighter estimation.</p>
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

    /** Unsafe version of: {@link #ZSTD_estimateCStreamSize_usingCCtxParams estimateCStreamSize_usingCCtxParams} */
    public static native long nZSTD_estimateCStreamSize_usingCCtxParams(long params);

    /**
     * See {@link #ZSTD_estimateCStreamSize estimateCStreamSize}.
     * 
     * <p>Can be used in tandem with {@link #ZSTD_CCtxParam_setParameter CCtxParam_setParameter}. Only single-threaded compression is supported. This function will return an error code if
     * {@code ZSTD_p_nbWorkers} is &ge; 1.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_estimateCStreamSize_usingCCtxParams(@NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_estimateCStreamSize_usingCCtxParams(params);
    }

    // --- [ ZSTD_estimateDStreamSize ] ---

    /**
     * Estimates memory usage of a future {@code DStream}, before its creation.
     * 
     * <p>{@code ZSTD_DStream} memory budget depends on window Size. This information can be passed manually, using {@code ZSTD_estimateDStreamSize}, or deducted
     * from a valid frame {@code Header}, using {@link #ZSTD_estimateDStreamSize_fromFrame estimateDStreamSize_fromFrame}.</p>
     */
    @NativeType("size_t")
    public static native long ZSTD_estimateDStreamSize(@NativeType("size_t") long windowSize);

    // --- [ ZSTD_estimateDStreamSize_fromFrame ] ---

    /** Unsafe version of: {@link #ZSTD_estimateDStreamSize_fromFrame estimateDStreamSize_fromFrame} */
    public static native long nZSTD_estimateDStreamSize_fromFrame(long src, long srcSize);

    /** See {@link #ZSTD_estimateDStreamSize estimateDStreamSize}. */
    @NativeType("size_t")
    public static long ZSTD_estimateDStreamSize_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_estimateDStreamSize_fromFrame(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_estimateCDictSize ] ---

    /**
     * Estimates memory usage of a future {@code CDict}, before its creation.
     * 
     * <p>Will bet that {@code src} size is relatively "small", and content is copied, like {@link Zstd#ZSTD_createCDict createCDict}.</p>
     */
    @NativeType("size_t")
    public static native long ZSTD_estimateCDictSize(@NativeType("size_t") long dictSize, int compressionLevel);

    // --- [ ZSTD_estimateCDictSize_advanced ] ---

    public static native long nZSTD_estimateCDictSize_advanced(long dictSize, long cParams, int dictLoadMethod);

    @NativeType("size_t")
    public static long ZSTD_estimateCDictSize_advanced(@NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod) {
        return nZSTD_estimateCDictSize_advanced(dictSize, cParams.address(), dictLoadMethod);
    }

    // --- [ ZSTD_estimateDDictSize ] ---

    /**
     * Estimates memory usage of a future {@code DDict}, before its creation.
     *
     * @param dictLoadMethod one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     */
    @NativeType("size_t")
    public static native long ZSTD_estimateDDictSize(@NativeType("size_t") long dictSize, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod);

    // --- [ ZSTD_initStaticCCtx ] ---

    /**
     * Unsafe version of: {@link #ZSTD_initStaticCCtx initStaticCCtx}
     *
     * @param workspaceSize use {@link #ZSTD_estimateCCtxSize estimateCCtxSize} or {@link #ZSTD_estimateCStreamSize estimateCStreamSize} to determine how large workspace must be to support scenario
     */
    public static native long nZSTD_initStaticCCtx(long workspace, long workspaceSize);

    /**
     * Initialize a fixed-size zstd compression context workspace.
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>zstd will never resize nor {@code malloc()} when using a static {@code cctx}. If it needs more memory than available, it will simply error out.</li>
     * <li>there is no corresponding "free" function. Since workspace was allocated externally, it must be freed externally too.</li>
     * </ol>
     * 
     * <p>Limitations:</p>
     * 
     * <ol>
     * <li>currently not compatible with internal {@code CDict} creation, such as {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary} or {@code ZSTD_initCStream_usingDict()}.</li>
     * <li>currently not compatible with multi-threading</li>
     * </ol>
     *
     * @param workspace the memory area to emplace the context into. Provided pointer must 8-bytes aligned. It must outlive context usage.
     *
     * @return pointer to {@code ZSTD_CCtx*} (same address as workspace, but different type), or {@code NULL} if error (typically size too small)
     */
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

    /**
     * Unsafe version of: {@link #ZSTD_initStaticDCtx initStaticDCtx}
     *
     * @param workspaceSize use {@link #ZSTD_estimateDCtxSize estimateDCtxSize} or {@link #ZSTD_estimateDStreamSize estimateDStreamSize} to determine how large workspace must be to support scenario
     */
    public static native long nZSTD_initStaticDCtx(long workspace, long workspaceSize);

    /**
     * Notes:
     * 
     * <ol>
     * <li>zstd will never resize nor {@code malloc()} when using a static {@code dctx}. If it needs more memory than available, it will simply error out.</li>
     * <li>static {@code dctx} is incompatible with legacy support.</li>
     * <li>there is no corresponding "free" function. Since workspace was allocated externally, it must be freed externally.</li>
     * </ol>
     * 
     * <p>Limitation: currently not compatible with internal {@code DDict} creation, such as {@code ZSTD_initDStream_usingDict()}.</p>
     *
     * @param workspace The memory area to emplace the context into. Provided pointer must 8-bytes aligned. It must outlive context usage.
     *
     * @return pointer to {@code ZSTD_DCtx*} (same address as workspace, but different type), or {@code NULL} if error (typically size too small)
     */
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

    public static native long nZSTD_initStaticCDict(long workspace, long workspaceSize, long dict, long dictSize, int dictLoadMethod, int dictContentType, long cParams);

    @NativeType("ZSTD_CDict const *")
    public static long ZSTD_initStaticCDict(@NativeType("void *") ByteBuffer workspace, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cParams) {
        return nZSTD_initStaticCDict(memAddress(workspace), workspace.remaining(), memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cParams.address());
    }

    // --- [ ZSTD_initStaticDDict ] ---

    /**
     * Unsafe version of: {@link #ZSTD_initStaticDDict initStaticDDict}
     *
     * @param workspaceSize use {@link #ZSTD_estimateDDictSize estimateDDictSize} to determine how large workspace must be
     */
    public static native long nZSTD_initStaticDDict(long workspace, long workspaceSize, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /**
     * Generate a digested dictionary in provided memory area.
     * 
     * <p>Note: there is no corresponding "free" function. Since workspace was allocated externally, it must be freed externally.</p>
     *
     * @param workspace       The memory area to emplace the dictionary into. Provided pointer must 8-bytes aligned. It must outlive dictionary usage.
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("ZSTD_DDict const *")
    public static long ZSTD_initStaticDDict(@NativeType("void *") ByteBuffer workspace, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        return nZSTD_initStaticDDict(memAddress(workspace), workspace.remaining(), memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_defaultCMem ] ---

    private static native long nZSTD_defaultCMem();

    @NativeType("ZSTD_customMem *")
    private static ZSTDCustomMem ZSTD_defaultCMem() {
        long __result = nZSTD_defaultCMem();
        return ZSTDCustomMem.create(__result);
    }

    /** Use this constant to defer to stdlib's functions. */
    public static final ZSTDCustomMem ZSTD_defaultCMem = ZSTD_defaultCMem();

    // --- [ ZSTD_createCCtx_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_createCCtx_advanced createCCtx_advanced} */
    public static native long nZSTD_createCCtx_advanced(long customMem);

    /** Create a ZSTD compression context using external alloc and free functions. */
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

    /** Unsafe version of: {@link #ZSTD_createDCtx_advanced createDCtx_advanced} */
    public static native long nZSTD_createDCtx_advanced(long customMem);

    /** Create a ZSTD decompression context using external alloc and free functions. */
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

    public static native long nZSTD_createCDict_advanced(long dict, long dictSize, int dictLoadMethod, int dictContentType, long cParams, long customMem);

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
     * Create a {@code ZSTD_DDict} using external alloc and free, optionally by reference.
     *
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

    public static native long nZSTD_createCDict_byReference(long dictBuffer, long dictSize, int compressionLevel);

    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_byReference(@NativeType("void const *") ByteBuffer dictBuffer, int compressionLevel) {
        return nZSTD_createCDict_byReference(memAddress(dictBuffer), dictBuffer.remaining(), compressionLevel);
    }

    // --- [ ZSTD_getCParams ] ---

    public static native void nZSTD_getCParams(int compressionLevel, long estimatedSrcSize, long dictSize, long __result);

    @NativeType("ZSTD_compressionParameters")
    public static ZSTDCompressionParameters ZSTD_getCParams(int compressionLevel, @NativeType("unsigned long long") long estimatedSrcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters __result) {
        nZSTD_getCParams(compressionLevel, estimatedSrcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_getParams ] ---

    public static native void nZSTD_getParams(int compressionLevel, long estimatedSrcSize, long dictSize, long __result);

    @NativeType("ZSTD_parameters")
    public static ZSTDParameters ZSTD_getParams(int compressionLevel, @NativeType("unsigned long long") long estimatedSrcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_parameters") ZSTDParameters __result) {
        nZSTD_getParams(compressionLevel, estimatedSrcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_checkCParams ] ---

    public static native long nZSTD_checkCParams(long params);

    @NativeType("size_t")
    public static long ZSTD_checkCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters params) {
        return nZSTD_checkCParams(params.address());
    }

    // --- [ ZSTD_adjustCParams ] ---

    public static native void nZSTD_adjustCParams(long cPar, long srcSize, long dictSize, long __result);

    @NativeType("ZSTD_compressionParameters")
    public static ZSTDCompressionParameters ZSTD_adjustCParams(@NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters cPar, @NativeType("unsigned long long") long srcSize, @NativeType("size_t") long dictSize, @NativeType("ZSTD_compressionParameters") ZSTDCompressionParameters __result) {
        nZSTD_adjustCParams(cPar.address(), srcSize, dictSize, __result.address());
        return __result;
    }

    // --- [ ZSTD_compress_advanced ] ---

    public static native long nZSTD_compress_advanced(long cctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize, long params);

    @NativeType("size_t")
    public static long ZSTD_compress_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_parameters") ZSTDParameters params) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compress_advanced(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddress(dict), dict.remaining(), params.address());
    }

    // --- [ ZSTD_compress_usingCDict_advanced ] ---

    public static native long nZSTD_compress_usingCDict_advanced(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict, long fParams);

    @NativeType("size_t")
    public static long ZSTD_compress_usingCDict_advanced(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_CDict const *") long cdict, @NativeType("ZSTD_frameParameters") ZSTDFrameParameters fParams) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compress_usingCDict_advanced(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict, fParams.address());
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
    @NativeType("unsigned")
    public static boolean ZSTD_isFrame(@NativeType("void const *") ByteBuffer buffer) {
        return nZSTD_isFrame(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ ZSTD_createDDict_byReference ] ---

    public static native long nZSTD_createDDict_byReference(long dictBuffer, long dictSize);

    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict_byReference(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZSTD_createDDict_byReference(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZSTD_getDictID_fromDict ] ---

    /** Unsafe version of: {@link #ZSTD_getDictID_fromDict getDictID_fromDict} */
    public static native int nZSTD_getDictID_fromDict(long dict, long dictSize);

    /**
     * Provides the dictID stored within dictionary.
     *
     * @return if 0, the dictionary is not conformant with Zstandard specification. It can still be loaded, but as a content-only dictionary.
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
     * @return if @return == 0, the dictionary is not conformant to Zstandard specification, or empty. Non-conformant dictionaries can still be loaded, but as
     *         content-only dictionaries.
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
     * Provides the {@code dictID} required to decompressed the frame stored within {@code src}.
     *
     * @return if 0, the dictID could not be decoded. This could for one of the following reasons:
     *         
     *         <ul>
     *         <li>The frame does not require a dictionary to be decoded (most common case).</li>
     *         <li>The frame was built with {@code dictID} intentionally removed. Whatever dictionary is necessary is a hidden information. Note: this use case also
     *         happens when using a non-conformant dictionary.</li>
     *         <li>{@code srcSize} is too small, and as a result, the frame header could not be decoded (only possible if {@code srcSize < ZSTD_FRAMEHEADERSIZE_MAX}).</li>
     *         <li>This is not a Zstandard frame.</li>
     *         </ul>
     *         
     *         <p>When identifying the exact failure cause, it's possible to use {@link #ZSTD_getFrameHeader getFrameHeader}, which will provide a more precise error code.</p>
     */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getDictID_fromFrame(memAddress(src), src.remaining());
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

    public static native long nZSTD_resetCStream(long zcs, long pledgedSrcSize);

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
     * Tells how much data has been {@code ingested} (read from input) {@code consumed} (input actually compressed) and {@code produced} (output) for current
     * frame.
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
     * @return amount of data stored in oldest job and ready to be flushed immediately. If {@code @return == 0}, it means either:
     *         
     *         <ul>
     *         <li>there is no active job (could be checked with {@link #ZSTD_getFrameProgression getFrameProgression}), or</li>
     *         <li>oldest job is still actively compressing data, but everything it has produced has also been flushed so far, therefore flushing speed is currently
     *         limited by production speed of oldest job irrespective of the speed of concurrent newer jobs.</li>
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

    public static native long nZSTD_compressBegin_usingCDict_advanced(long cctx, long cdict, long fParams, long pledgedSrcSize);

    @NativeType("size_t")
    public static long ZSTD_compressBegin_usingCDict_advanced(@NativeType("ZSTD_CCtx * const") long cctx, @NativeType("ZSTD_CDict const * const") long cdict, @NativeType("ZSTD_frameParameters const") ZSTDFrameParameters fParams, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compressBegin_usingCDict_advanced(cctx, cdict, fParams.address(), pledgedSrcSize);
    }

    // --- [ ZSTD_copyCCtx ] ---

    /** Unsafe version of: {@link #ZSTD_copyCCtx copyCCtx} */
    public static native long nZSTD_copyCCtx(long cctx, long preparedCCtx, long pledgedSrcSize);

    /** @param pledgedSrcSize can be 0, indicating unknown size. If it is non-zero, it must be accurate. For 0 size frames, use {@code compressBegin_advanced} */
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
     * <p>Doesn't consume input.</p>
     *
     * @return if 0, {@code zfhPtr} is correctly filled. If &gt;0, {@code srcSize} is too small, value is wanted {@code srcSize} amount, or an error code, which can be
     *         tested using {@link Zstd#ZSTD_isError isError}.
     */
    @NativeType("size_t")
    public static long ZSTD_getFrameHeader(@NativeType("ZSTD_frameHeader *") ZSTDFrameHeader zfhPtr, @NativeType("void const *") ByteBuffer src) {
        return nZSTD_getFrameHeader(zfhPtr.address(), memAddress(src), src.remaining());
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

    // --- [ ZSTD_nextInputType ] ---

    public static native int nZSTD_nextInputType(long dctx);

    @NativeType("ZSTD_nextInputType_e")
    public static int ZSTD_nextInputType(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_nextInputType(dctx);
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

    // --- [ ZSTD_CCtx_setParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_setParameter CCtx_setParameter} */
    public static native long nZSTD_CCtx_setParameter(long cctx, int param, int value);

    /**
     * Sets one compression parameter, selected by enum {@code ZSTD_cParameter}.
     * 
     * <p>Setting a parameter is generally only possible during frame initialization (before starting compression). Exception: when using multi-threading mode
     * ({@code nbThreads} &ge; 1), following parameters can be updated <em>during</em> compression (within same frame): {@code compressionLevel},
     * {@code hashLog}, {@code chainLog}, {@code searchLog}, {@code minMatch}, {@code targetLength} and {@code strategy}. New parameters will be active on
     * next job, or after a {@code flush()}.</p>
     * 
     * <p>Note: when {@code value} type is not unsigned (int, or enum), cast it to unsigned for proper type checking.</p>
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_p_format p_format}</td><td>{@link #ZSTD_p_compressionLevel p_compressionLevel}</td><td>{@link #ZSTD_p_windowLog p_windowLog}</td><td>{@link #ZSTD_p_hashLog p_hashLog}</td><td>{@link #ZSTD_p_chainLog p_chainLog}</td></tr><tr><td>{@link #ZSTD_p_searchLog p_searchLog}</td><td>{@link #ZSTD_p_minMatch p_minMatch}</td><td>{@link #ZSTD_p_targetLength p_targetLength}</td><td>{@link #ZSTD_p_compressionStrategy p_compressionStrategy}</td><td>{@link #ZSTD_p_enableLongDistanceMatching p_enableLongDistanceMatching}</td></tr><tr><td>{@link #ZSTD_p_ldmHashLog p_ldmHashLog}</td><td>{@link #ZSTD_p_ldmMinMatch p_ldmMinMatch}</td><td>{@link #ZSTD_p_ldmBucketSizeLog p_ldmBucketSizeLog}</td><td>{@link #ZSTD_p_ldmHashEveryLog p_ldmHashEveryLog}</td><td>{@link #ZSTD_p_contentSizeFlag p_contentSizeFlag}</td></tr><tr><td>{@link #ZSTD_p_checksumFlag p_checksumFlag}</td><td>{@link #ZSTD_p_dictIDFlag p_dictIDFlag}</td><td>{@link #ZSTD_p_nbWorkers p_nbWorkers}</td><td>{@link #ZSTD_p_nonBlockingMode p_nonBlockingMode}</td><td>{@link #ZSTD_p_jobSize p_jobSize}</td></tr><tr><td>{@link #ZSTD_p_overlapSizeLog p_overlapSizeLog}</td><td>{@link #ZSTD_p_forceMaxWindow p_forceMaxWindow}</td><td>{@link #ZSTD_p_forceAttachDict p_forceAttachDict}</td></tr></table>
     *
     * @return informational value (typically, value being set, correctly clamped), 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParameter(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_cParameter") int param, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setParameter(cctx, param, value);
    }

    // --- [ ZSTD_CCtx_getParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_getParameter CCtx_getParameter} */
    public static native long nZSTD_CCtx_getParameter(long cctx, int param, long value);

    /**
     * Get the requested value of one compression parameter, selected by enum {@code ZSTD_cParameter}.
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_p_format p_format}</td><td>{@link #ZSTD_p_compressionLevel p_compressionLevel}</td><td>{@link #ZSTD_p_windowLog p_windowLog}</td><td>{@link #ZSTD_p_hashLog p_hashLog}</td><td>{@link #ZSTD_p_chainLog p_chainLog}</td></tr><tr><td>{@link #ZSTD_p_searchLog p_searchLog}</td><td>{@link #ZSTD_p_minMatch p_minMatch}</td><td>{@link #ZSTD_p_targetLength p_targetLength}</td><td>{@link #ZSTD_p_compressionStrategy p_compressionStrategy}</td><td>{@link #ZSTD_p_enableLongDistanceMatching p_enableLongDistanceMatching}</td></tr><tr><td>{@link #ZSTD_p_ldmHashLog p_ldmHashLog}</td><td>{@link #ZSTD_p_ldmMinMatch p_ldmMinMatch}</td><td>{@link #ZSTD_p_ldmBucketSizeLog p_ldmBucketSizeLog}</td><td>{@link #ZSTD_p_ldmHashEveryLog p_ldmHashEveryLog}</td><td>{@link #ZSTD_p_contentSizeFlag p_contentSizeFlag}</td></tr><tr><td>{@link #ZSTD_p_checksumFlag p_checksumFlag}</td><td>{@link #ZSTD_p_dictIDFlag p_dictIDFlag}</td><td>{@link #ZSTD_p_nbWorkers p_nbWorkers}</td><td>{@link #ZSTD_p_nonBlockingMode p_nonBlockingMode}</td><td>{@link #ZSTD_p_jobSize p_jobSize}</td></tr><tr><td>{@link #ZSTD_p_overlapSizeLog p_overlapSizeLog}</td><td>{@link #ZSTD_p_forceMaxWindow p_forceMaxWindow}</td><td>{@link #ZSTD_p_forceAttachDict p_forceAttachDict}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_getParameter(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_cParameter") int param, @NativeType("unsigned *") IntBuffer value) {
        if (CHECKS) {
            check(cctx);
            check(value, 1);
        }
        return nZSTD_CCtx_getParameter(cctx, param, memAddress(value));
    }

    // --- [ ZSTD_CCtx_setPledgedSrcSize ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_setPledgedSrcSize CCtx_setPledgedSrcSize} */
    public static native long nZSTD_CCtx_setPledgedSrcSize(long cctx, long pledgedSrcSize);

    /**
     * Sets the total input data size to be compressed as a single frame. This value will be controlled at the end, and result in error if not respected.
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>0 means zero, empty.
     * 
     * <p>In order to mean "unknown content size", pass constant {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}. {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN} is default value for any new compression job.</p></li>
     * <li>If all data is provided and consumed in a single round, this value is overridden by {@code srcSize} instead.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
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
     * Create an internal CDict from {@code dict} buffer. Decompression will have to use same dictionary.
     * 
     * <p>Special: Adding a {@code NULL} (or 0-size) dictionary invalidates any previous dictionary, meaning "return to no-dictionary mode".</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>Dictionary will be used for all future compression jobs. To return to "no-dictionary" situation, load a {@code NULL} dictionary.</li>
     * <li>Loading a dictionary involves building tables, which are dependent on compression parameters. For this reason, compression parameters cannot be
     * changed anymore after loading a dictionary. It's also a CPU consuming operation, with non-negligible impact on latency.</li>
     * <li>{@code dict} content will be copied internally. Use {@link #ZSTD_CCtx_loadDictionary_byReference CCtx_loadDictionary_byReference} to reference dictionary content instead. In such a case,
     * dictionary buffer must outlive its users.</li>
     * <li>Use {@link #ZSTD_CCtx_loadDictionary_advanced CCtx_loadDictionary_advanced} to precisely select how dictionary content must be interpreted.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary(cctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_CCtx_loadDictionary_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_loadDictionary_byReference CCtx_loadDictionary_byReference} */
    public static native long nZSTD_CCtx_loadDictionary_byReference(long cctx, long dict, long dictSize);

    /** See {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary}. */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary_byReference(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary_byReference(cctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_CCtx_loadDictionary_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_loadDictionary_advanced CCtx_loadDictionary_advanced} */
    public static native long nZSTD_CCtx_loadDictionary_advanced(long cctx, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /**
     * See {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary}.
     *
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_loadDictionary_advanced(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_loadDictionary_advanced(cctx, memAddressSafe(dict), remainingSafe(dict), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_CCtx_refCDict ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_refCDict CCtx_refCDict} */
    public static native long nZSTD_CCtx_refCDict(long cctx, long cdict);

    /**
     * Reference a prepared dictionary, to be used for all next compression jobs.
     * 
     * <p>Note that compression parameters are enforced from within {@code CDict}, and supercede any compression parameter previously set within {@code CCtx}.</p>
     * 
     * <p>The dictionary will remain valid for future compression jobs using same CCtx.</p>
     * 
     * <p>Special: adding a {@code NULL} {@code CDict} means "return to no-dictionary mode".</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>Currently, only one dictionary can be managed. Adding a new dictionary effectively "discards" any previous one.</li>
     * <li>{@code CDict} is just referenced, its lifetime must outlive {@code CCtx}.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
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
     * Reference a prefix (single-usage dictionary) for next compression job.
     * 
     * <p>Decompression will need same prefix to properly regenerate data. Compressing with a prefix is similar in outcome as performing a diff and compressing
     * it, but performs much faster, especially during decompression (compression speed is tunable with compression level). Note that prefix is <b>only used
     * once</b>. Tables are discarded at end of compression job ({@link #ZSTD_e_end e_end}).</p>
     * 
     * <p>Special: Adding any prefix (including {@code NULL}) invalidates any previous prefix or dictionary.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>Prefix buffer is referenced. It <b>must</b> outlive compression job. Its content must remain unmodified up to end of compression ({@link #ZSTD_e_end e_end}).</li>
     * <li>If the intention is to diff some large {@code src} data blob with some prior version of itself, ensure that the window size is large enough to
     * contain the entire source. See {@link #ZSTD_p_windowLog p_windowLog}.</li>
     * <li>Referencing a prefix involves building tables, which are dependent on compression parameters. It's a CPU consuming operation, with non-negligible
     * impact on latency. If there is a need to use same prefix multiple times, consider {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary} instead.</li>
     * <li>By default, the prefix is treated as raw content ({@code ZSTD_dm_rawContent}). Use {@link #ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} to alter {@code dictMode}.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix(cctx, memAddressSafe(prefix), remainingSafe(prefix));
    }

    // --- [ ZSTD_CCtx_refPrefix_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} */
    public static native long nZSTD_CCtx_refPrefix_advanced(long cctx, long prefix, long prefixSize, int dictContentType);

    /**
     * See {@link #ZSTD_CCtx_refPrefix CCtx_refPrefix}.
     *
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix_advanced(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer prefix, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix_advanced(cctx, memAddressSafe(prefix), remainingSafe(prefix), dictContentType);
    }

    // --- [ ZSTD_CCtx_reset ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_reset CCtx_reset} */
    public static native void nZSTD_CCtx_reset(long cctx);

    /**
     * Return a {@code CCtx} to clean state.
     * 
     * <p>Useful after an error, or to interrupt an ongoing compression job and start a new one. Any internal data not yet flushed is cancelled. The parameters
     * and dictionary are kept unchanged, to reset them use {@link #ZSTD_CCtx_resetParameters CCtx_resetParameters}.</p>
     */
    public static void ZSTD_CCtx_reset(@NativeType("ZSTD_CCtx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        nZSTD_CCtx_reset(cctx);
    }

    // --- [ ZSTD_CCtx_resetParameters ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_resetParameters CCtx_resetParameters} */
    public static native long nZSTD_CCtx_resetParameters(long cctx);

    /**
     * All parameters are back to default values (compression level is {@link Zstd#ZSTD_CLEVEL_DEFAULT CLEVEL_DEFAULT}).
     * 
     * <p>Dictionary (if any) is dropped. Resetting parameters is only possible during frame initialization (before starting compression). To reset the context
     * use {@link #ZSTD_CCtx_reset CCtx_reset}.</p>
     *
     * @return 0 or an error code (which can be checked with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_resetParameters(@NativeType("ZSTD_CCtx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_resetParameters(cctx);
    }

    // --- [ ZSTD_compress_generic ] ---

    /** Unsafe version of: {@link #ZSTD_compress_generic compress_generic} */
    public static native long nZSTD_compress_generic(long cctx, long output, long input, int endOp);

    /**
     * Behave about the same as {@link Zstd#ZSTD_compressStream compressStream}.
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>Compression parameters are pushed into {@code CCtx} before starting compression, using {@link #ZSTD_CCtx_setParameter CCtx_setParameter}.</li>
     * <li>Compression parameters cannot be changed once compression is started.</li>
     * <li>{@code output->pos} must be &le; {@code dstCapacity}, {@code input->pos} must be &le; {@code srcSize}.</li>
     * <li>{@code outpot->pos} and {@code input->pos} will be updated. They are guaranteed to remain below their respective limit.</li>
     * <li>In single-thread mode (default), function is blocking: it completed its job before returning to caller.</li>
     * <li>In multi-thread mode, function is non-blocking: it just acquires a copy of input, and distribute job to internal worker threads, and then
     * immediately returns, just indicating that there is some data remaining to be flushed. The function nonetheless guarantees forward progress: it will
     * return only after it reads or write at least 1+ byte.</li>
     * <li>Exception: in multi-threading mode, if the first call requests a {@link #ZSTD_e_end e_end} directive, it is blocking: it will complete compression before giving back
     * control to caller.</li>
     * <li>after a {@link #ZSTD_e_end e_end} directive, if internal buffer is not fully flushed (return != 0), only {@link #ZSTD_e_end e_end} or {@link #ZSTD_e_flush e_flush} operations are allowed. Before starting a
     * new compression job, or changing compression parameters, it is required to fully flush internal buffers.</li>
     * </ul>
     *
     * @param endOp one of:<br><table><tr><td>{@link #ZSTD_e_continue e_continue}</td><td>{@link #ZSTD_e_flush e_flush}</td><td>{@link #ZSTD_e_end e_end}</td></tr></table>
     *
     * @return provides a minimum amount of data remaining to be flushed from internal buffers or an error code, which can be tested using {@link Zstd#ZSTD_isError isError}. If
     *         {@code @return != 0}, flush is not fully completed, there is still some data left within internal buffers. This is useful for {@link #ZSTD_e_flush e_flush}, since in this
     *         case more flushes are necessary to empty all buffers. For {@link #ZSTD_e_end e_end}, {@code @return == 0} when internal buffers are fully flushed and frame is completed.
     */
    @NativeType("size_t")
    public static long ZSTD_compress_generic(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input, @NativeType("ZSTD_EndDirective") int endOp) {
        if (CHECKS) {
            check(cctx);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_compress_generic(cctx, output.address(), input.address(), endOp);
    }

    // --- [ ZSTD_compress_generic_simpleArgs ] ---

    /** Unsafe version of: {@link #ZSTD_compress_generic_simpleArgs compress_generic_simpleArgs} */
    public static native long nZSTD_compress_generic_simpleArgs(long cctx, long dst, long dstCapacity, long dstPos, long src, long srcSize, long srcPos, int endOp);

    /**
     * Same as {@link #ZSTD_compress_generic compress_generic}, but using only integral types as arguments.
     *
     * @param endOp one of:<br><table><tr><td>{@link #ZSTD_e_continue e_continue}</td><td>{@link #ZSTD_e_flush e_flush}</td><td>{@link #ZSTD_e_end e_end}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_compress_generic_simpleArgs(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("size_t *") PointerBuffer dstPos, @NativeType("void const *") ByteBuffer src, @NativeType("size_t *") PointerBuffer srcPos, @NativeType("ZSTD_EndDirective") int endOp) {
        if (CHECKS) {
            check(cctx);
            check(dstPos, 1);
            check(srcPos, 1);
        }
        return nZSTD_compress_generic_simpleArgs(cctx, memAddress(dst), dst.remaining(), memAddress(dstPos), memAddress(src), src.remaining(), memAddress(srcPos), endOp);
    }

    // --- [ ZSTD_createCCtxParams ] ---

    /** Creates a {@code ZSTD_CCtx_params} structure. */
    @NativeType("ZSTD_CCtx_params *")
    public static native long ZSTD_createCCtxParams();

    // --- [ ZSTD_freeCCtxParams ] ---

    /** Unsafe version of: {@link #ZSTD_freeCCtxParams freeCCtxParams} */
    public static native long nZSTD_freeCCtxParams(long params);

    /** Frees memory allocated by {@link #ZSTD_createCCtxParams createCCtxParams}. */
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

    /** Reset params to default values. */
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

    public static native long nZSTD_CCtxParams_init_advanced(long cctxParams, long params);

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
     * Similar to {@link #ZSTD_CCtx_setParameter CCtx_setParameter}.
     * 
     * <p>Set one compression parameter, selected by enum {@code ZSTD_cParameter}. Parameters must be applied to a {@code ZSTD_CCtx} using
     * {@link #ZSTD_CCtx_setParametersUsingCCtxParams CCtx_setParametersUsingCCtxParams}.</p>
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_p_format p_format}</td><td>{@link #ZSTD_p_compressionLevel p_compressionLevel}</td><td>{@link #ZSTD_p_windowLog p_windowLog}</td><td>{@link #ZSTD_p_hashLog p_hashLog}</td><td>{@link #ZSTD_p_chainLog p_chainLog}</td></tr><tr><td>{@link #ZSTD_p_searchLog p_searchLog}</td><td>{@link #ZSTD_p_minMatch p_minMatch}</td><td>{@link #ZSTD_p_targetLength p_targetLength}</td><td>{@link #ZSTD_p_compressionStrategy p_compressionStrategy}</td><td>{@link #ZSTD_p_enableLongDistanceMatching p_enableLongDistanceMatching}</td></tr><tr><td>{@link #ZSTD_p_ldmHashLog p_ldmHashLog}</td><td>{@link #ZSTD_p_ldmMinMatch p_ldmMinMatch}</td><td>{@link #ZSTD_p_ldmBucketSizeLog p_ldmBucketSizeLog}</td><td>{@link #ZSTD_p_ldmHashEveryLog p_ldmHashEveryLog}</td><td>{@link #ZSTD_p_contentSizeFlag p_contentSizeFlag}</td></tr><tr><td>{@link #ZSTD_p_checksumFlag p_checksumFlag}</td><td>{@link #ZSTD_p_dictIDFlag p_dictIDFlag}</td><td>{@link #ZSTD_p_nbWorkers p_nbWorkers}</td><td>{@link #ZSTD_p_nonBlockingMode p_nonBlockingMode}</td><td>{@link #ZSTD_p_jobSize p_jobSize}</td></tr><tr><td>{@link #ZSTD_p_overlapSizeLog p_overlapSizeLog}</td><td>{@link #ZSTD_p_forceMaxWindow p_forceMaxWindow}</td><td>{@link #ZSTD_p_forceAttachDict p_forceAttachDict}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtxParam_setParameter(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("ZSTD_cParameter") int param, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_CCtxParam_setParameter(params, param, value);
    }

    // --- [ ZSTD_CCtxParam_getParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParam_getParameter CCtxParam_getParameter} */
    public static native long nZSTD_CCtxParam_getParameter(long params, int param, long value);

    /**
     * Similar to {@link #ZSTD_CCtx_getParameter CCtx_getParameter}.
     * 
     * <p>Get the requested value of one compression parameter, selected by enum {@code ZSTD_cParameter}.</p>
     *
     * @param param one of:<br><table><tr><td>{@link #ZSTD_p_format p_format}</td><td>{@link #ZSTD_p_compressionLevel p_compressionLevel}</td><td>{@link #ZSTD_p_windowLog p_windowLog}</td><td>{@link #ZSTD_p_hashLog p_hashLog}</td><td>{@link #ZSTD_p_chainLog p_chainLog}</td></tr><tr><td>{@link #ZSTD_p_searchLog p_searchLog}</td><td>{@link #ZSTD_p_minMatch p_minMatch}</td><td>{@link #ZSTD_p_targetLength p_targetLength}</td><td>{@link #ZSTD_p_compressionStrategy p_compressionStrategy}</td><td>{@link #ZSTD_p_enableLongDistanceMatching p_enableLongDistanceMatching}</td></tr><tr><td>{@link #ZSTD_p_ldmHashLog p_ldmHashLog}</td><td>{@link #ZSTD_p_ldmMinMatch p_ldmMinMatch}</td><td>{@link #ZSTD_p_ldmBucketSizeLog p_ldmBucketSizeLog}</td><td>{@link #ZSTD_p_ldmHashEveryLog p_ldmHashEveryLog}</td><td>{@link #ZSTD_p_contentSizeFlag p_contentSizeFlag}</td></tr><tr><td>{@link #ZSTD_p_checksumFlag p_checksumFlag}</td><td>{@link #ZSTD_p_dictIDFlag p_dictIDFlag}</td><td>{@link #ZSTD_p_nbWorkers p_nbWorkers}</td><td>{@link #ZSTD_p_nonBlockingMode p_nonBlockingMode}</td><td>{@link #ZSTD_p_jobSize p_jobSize}</td></tr><tr><td>{@link #ZSTD_p_overlapSizeLog p_overlapSizeLog}</td><td>{@link #ZSTD_p_forceMaxWindow p_forceMaxWindow}</td><td>{@link #ZSTD_p_forceAttachDict p_forceAttachDict}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtxParam_getParameter(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("ZSTD_cParameter") int param, @NativeType("unsigned *") IntBuffer value) {
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
     * Apply a set of {@code ZSTD_CCtx_params} to the compression context.
     * 
     * <p>This can be done even after compression is started, if {@code nbWorkers==0}, this will have no impact until a new compression is started. If
     * {@code nbWorkers>=1}, new parameters will be picked up at next job, with a few restrictions ({@code windowLog}, {@code pledgedSrcSize},
     * {@code nbWorkers}, {@code jobSize}, and {@code overlapLog} are not updated).</p>
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setParametersUsingCCtxParams(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_CCtx_params const *") long params) {
        if (CHECKS) {
            check(cctx);
            check(params);
        }
        return nZSTD_CCtx_setParametersUsingCCtxParams(cctx, params);
    }

    // --- [ ZSTD_DCtx_loadDictionary ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary DCtx_loadDictionary} */
    public static native long nZSTD_DCtx_loadDictionary(long dctx, long dict, long dictSize);

    /**
     * Create an internal {@code DDict} from dict buffer, to be used to decompress next frames.
     * 
     * <p>Special: Adding a {@code NULL} (or 0-size) dictionary invalidates any previous dictionary, meaning "return to no-dictionary mode".</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>{@code dict} content will be copied internally. Use {@link #ZSTD_DCtx_loadDictionary_byReference DCtx_loadDictionary_byReference} to reference dictionary content instead. In which case, the
     * dictionary buffer must outlive its users.</li>
     * <li>Loading a dictionary involves building tables, which has a non-negligible impact on CPU usage and latency.</li>
     * <li>Use {@link #ZSTD_DCtx_loadDictionary_advanced DCtx_loadDictionary_advanced} to select how dictionary content will be interpreted and loaded.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary(@NativeType("ZSTD_DCtx *") long dctx, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary(dctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_DCtx_loadDictionary_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary_byReference DCtx_loadDictionary_byReference} */
    public static native long nZSTD_DCtx_loadDictionary_byReference(long dctx, long dict, long dictSize);

    /** See {@link #ZSTD_DCtx_loadDictionary DCtx_loadDictionary}. */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary_byReference(@NativeType("ZSTD_DCtx *") long dctx, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary_byReference(dctx, memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_DCtx_loadDictionary_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary_advanced DCtx_loadDictionary_advanced} */
    public static native long nZSTD_DCtx_loadDictionary_advanced(long dctx, long dict, long dictSize, int dictLoadMethod, int dictContentType);

    /**
     * See {@link #ZSTD_DCtx_loadDictionary DCtx_loadDictionary}.
     *
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_loadDictionary_advanced(@NativeType("ZSTD_DCtx *") long dctx, @Nullable @NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_loadDictionary_advanced(dctx, memAddressSafe(dict), remainingSafe(dict), dictLoadMethod, dictContentType);
    }

    // --- [ ZSTD_DCtx_refDDict ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_refDDict DCtx_refDDict} */
    public static native long nZSTD_DCtx_refDDict(long dctx, long ddict);

    /**
     * Reference a prepared dictionary, to be used to decompress next frames. The dictionary remains active for decompression of future frames using same
     * {@code DCtx}.
     * 
     * <p>Special: adding a {@code NULL} {@code DDict} means "return to no-dictionary mode".</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one.</li>
     * <li>{@code DDict} is just referenced, its lifetime must outlive its usage from {@code DCtx}.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
            check(ddict);
        }
        return nZSTD_DCtx_refDDict(dctx, ddict);
    }

    // --- [ ZSTD_DCtx_refPrefix ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_refPrefix DCtx_refPrefix} */
    public static native long nZSTD_DCtx_refPrefix(long dctx, long prefix, long prefixSize);

    /**
     * Reference a prefix (single-usage dictionary) for next compression job.
     * 
     * <p>This is the reverse operation of {@link #ZSTD_CCtx_refPrefix CCtx_refPrefix}, and must use the same prefix as the one used during compression.</p>
     * 
     * <p>Prefix is <b>only used once</b>. Reference is discarded at end of frame. End of frame is reached when {@code ZSTD_DCtx_decompress_generic()} returns 0.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>Adding any prefix (including {@code NULL}) invalidates any previously set prefix or dictionary</li>
     * <li>Prefix buffer is referenced. It <b>must</b> outlive decompression job. Prefix buffer must remain unmodified up to the end of frame, reached when
     * {@code ZSTD_DCtx_decompress_generic()} returns 0.</li>
     * <li>By default, the prefix is treated as raw content ({@code ZSTD_dm_rawContent}). Use {@link #ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} to alter {@code dictMode}.</li>
     * <li>Referencing a raw content prefix has almost no cpu nor memory cost. A fulldict prefix is more costly though.</li>
     * </ol>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix(@NativeType("ZSTD_DCtx *") long dctx, @Nullable @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix(dctx, memAddressSafe(prefix), remainingSafe(prefix));
    }

    // --- [ ZSTD_DCtx_refPrefix_advanced ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_refPrefix_advanced DCtx_refPrefix_advanced} */
    public static native long nZSTD_DCtx_refPrefix_advanced(long dctx, long prefix, long prefixSize, int dictContentType);

    /**
     * See {@link #ZSTD_DCtx_refPrefix DCtx_refPrefix}.
     *
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix_advanced(@NativeType("ZSTD_DCtx *") long dctx, @Nullable @NativeType("void const *") ByteBuffer prefix, @NativeType("ZSTD_dictContentType_e") int dictContentType) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix_advanced(dctx, memAddressSafe(prefix), remainingSafe(prefix), dictContentType);
    }

    // --- [ ZSTD_DCtx_setMaxWindowSize ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_setMaxWindowSize DCtx_setMaxWindowSize} */
    public static native long nZSTD_DCtx_setMaxWindowSize(long dctx, long maxWindowSize);

    /**
     * Refuses allocating internal buffers for frames requiring a window size larger than provided limit.
     * 
     * <p>This is useful to prevent a decoder context from reserving too much memory for itself (potential attack scenario). This parameter is only useful in
     * streaming mode, since no internal buffer is allocated in direct mode. By default, a decompression context accepts all window sizes &le;
     * {@code (1 << ZSTD_WINDOWLOG_MAX)}</p>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
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

    /** @param format one of:<br><table><tr><td>{@link #ZSTD_f_zstd1 f_zstd1}</td><td>{@link #ZSTD_f_zstd1_magicless f_zstd1_magicless}</td></tr></table> */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setFormat(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_format_e") int format) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setFormat(dctx, format);
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

    // --- [ ZSTD_decompress_generic ] ---

    /** Unsafe version of: {@link #ZSTD_decompress_generic decompress_generic} */
    public static native long nZSTD_decompress_generic(long dctx, long output, long input);

    /**
     * Behave the same as {@link Zstd#ZSTD_decompressStream decompressStream}.
     * 
     * <p>Decompression parameters cannot be changed once decompression is started.</p>
     *
     * @return an error code, which can be tested using {@link Zstd#ZSTD_isError isError}. If &gt; 0, a hint, {@code nb} of expected input bytes for next invocation. {@code 0} means a frame
     *         has just been fully decoded and flushed.
     */
    @NativeType("size_t")
    public static long ZSTD_decompress_generic(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_outBuffer *") ZSTDOutBuffer output, @NativeType("ZSTD_inBuffer *") ZSTDInBuffer input) {
        if (CHECKS) {
            check(dctx);
            ZSTDOutBuffer.validate(output.address());
            ZSTDInBuffer.validate(input.address());
        }
        return nZSTD_decompress_generic(dctx, output.address(), input.address());
    }

    // --- [ ZSTD_decompress_generic_simpleArgs ] ---

    /** Unsafe version of: {@link #ZSTD_decompress_generic_simpleArgs decompress_generic_simpleArgs} */
    public static native long nZSTD_decompress_generic_simpleArgs(long dctx, long dst, long dstCapacity, long dstPos, long src, long srcSize, long srcPos);

    /** Same as {@link #ZSTD_decompress_generic decompress_generic}, but using only integral types as arguments. */
    @NativeType("size_t")
    public static long ZSTD_decompress_generic_simpleArgs(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("size_t *") PointerBuffer dstPos, @NativeType("void const *") ByteBuffer src, @NativeType("size_t *") PointerBuffer srcPos) {
        if (CHECKS) {
            check(dctx);
            check(dstPos, 1);
            check(srcPos, 1);
        }
        return nZSTD_decompress_generic_simpleArgs(dctx, memAddress(dst), dst.remaining(), memAddress(dstPos), memAddress(src), src.remaining(), memAddress(srcPos));
    }

    // --- [ ZSTD_DCtx_reset ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_reset DCtx_reset} */
    public static native void nZSTD_DCtx_reset(long dctx);

    /**
     * Return a {@code DCtx} to clean state.
     * 
     * <p>If a decompression was ongoing, any internal data not yet flushed is cancelled. All parameters are back to default values, including sticky ones.
     * Dictionary (if any) is dropped. Parameters can be modified again after a reset.</p>
     */
    public static void ZSTD_DCtx_reset(@NativeType("ZSTD_DCtx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        nZSTD_DCtx_reset(dctx);
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