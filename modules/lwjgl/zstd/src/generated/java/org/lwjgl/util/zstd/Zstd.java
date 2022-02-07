/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd), a fast lossless compression algorithm, targeting real-time
 * compression scenarios at zlib-level and better compression ratios.
 * 
 * <h3>Introduction</h3>
 * 
 * <p>zstd, short for Zstandard, is a fast lossless compression algorithm, targeting real-time compression scenarios at zlib-level and better compression
 * ratios. The zstd compression library provides in-memory compression and decompression functions.</p>
 * 
 * <p>The library supports regular compression levels from 1 up to {@link #ZSTD_maxCLevel maxCLevel}, which is currently 22. Levels &ge; 20, labeled {@code --ultra}, should be
 * used with caution, as they require more memory. The library also offers negative compression levels, which extend the range of speed vs. ratio
 * preferences. The lower the level, the faster the speed (at the cost of compression).</p>
 * 
 * <p>Compression can be done in:</p>
 * 
 * <ul>
 * <li>a single step (described as Simple API)</li>
 * <li>a single step, reusing a context (described as Explicit context)</li>
 * <li>unbounded multiple steps (described as Streaming compression)</li>
 * </ul>
 * 
 * <p>The compression ratio achievable on small data can be highly improved using a dictionary. Dictionary compression can be performed in:</p>
 * 
 * <ul>
 * <li>a single step (described as Simple dictionary API)</li>
 * <li>a single step, reusing a dictionary (described as Bulk-processing dictionary API)</li>
 * </ul>
 * 
 * <p>Advanced experimental functions can be accessed using {@code #define ZSTD_STATIC_LINKING_ONLY} before including {@code zstd.h}. Advanced experimental
 * APIs should never be used with a dynamically-linked library. They are not "stable", their definitions or signatures may change in the future. Only
 * static linking is allowed.</p>
 * 
 * <h3>Streaming compression - HowTo</h3>
 * 
 * <p>A {@code ZSTD_CStream} object is required to track streaming operation.</p>
 * 
 * <p>Use {@link #ZSTD_createCStream createCStream} and {@link #ZSTD_freeCStream freeCStream} to create/release resources. {@code ZSTD_CStream} objects can be reused multiple times on consecutive
 * compression operations. It is recommended to re-use {@code ZSTD_CStream} since it will play nicer with system's memory, by re-using already allocated
 * memory.</p>
 * 
 * <p>For parallel execution, use one separate {@code ZSTD_CStream}.</p>
 * 
 * <p>Since v1.3.0, {@code ZSTD_CStream} and {@code ZSTD_CCtx} are the same thing.</p>
 * 
 * <p>Parameters are sticky: when starting a new compression on the same context, it will re-use the same sticky parameters as previous compression session.
 * When in doubt, it's recommended to fully initialize the context before usage. Use {@link #ZSTD_CCtx_reset CCtx_reset} to reset the context and {@link #ZSTD_CCtx_setParameter CCtx_setParameter},
 * {@link #ZSTD_CCtx_setPledgedSrcSize CCtx_setPledgedSrcSize}, or {@link #ZSTD_CCtx_loadDictionary CCtx_loadDictionary} and friends to set more specific parameters, the pledged source size, or load a dictionary.</p>
 * 
 * <p>Use {@link #ZSTD_compressStream2 compressStream2} with {@link #ZSTD_e_continue e_continue} as many times as necessary to consume input stream. The function will automatically update both {@code pos}
 * fields within {@code input} and {@code output}. Note that the function may not consume the entire input, for example, because the output buffer is
 * already full, in which case {@code input.pos < input.size}. The caller must check if input has been entirely consumed. If not, the caller must make
 * some room to receive more compressed data, and then present again remaining input data.</p>
 * 
 * <p>Note: {@code ZSTD_e_continue} is guaranteed to make some forward progress when called, but doesn't guarantee maximal forward progress. This is
 * especially relevant when compressing with multiple threads. The call won't block if it can consume some input, but if it can't it will wait for some,
 * but not all, output to be flushed.</p>
 * 
 * <p>At any moment, it's possible to flush whatever data might remain stuck within internal buffer, using {@code ZSTD_compressStream2()} with {@link #ZSTD_e_flush e_flush}.
 * {@code output->pos} will be updated. Note that, if {@code output->size} is too small, a single invocation with {@code ZSTD_e_flush} might not be enough
 * (return code &gt; 0). In which case, make some room to receive more compressed data, and call again {@code ZSTD_compressStream2()} with
 * {@code ZSTD_e_flush}. You must continue calling {@code ZSTD_compressStream2()} with {@code ZSTD_e_flush} until it returns 0, at which point you can
 * change the operation.</p>
 * 
 * <p>Note: {@code ZSTD_e_flush} will flush as much output as possible, meaning when compressing with multiple threads, it will block until the flush is
 * complete or the output buffer is full.</p>
 * 
 * <p>Calling {@code ZSTD_compressStream2()} with {@link #ZSTD_e_end e_end} instructs to finish a frame. It will perform a flush and write frame epilogue. The epilogue is
 * required for decoders to consider a frame completed. Flush operation is the same, and follows same rules as calling {@code ZSTD_compressStream2()} with
 * {@code ZSTD_e_flush}. You must continue calling {@code ZSTD_compressStream2()} with {@code ZSTD_e_end} until it returns 0, at which point you are free
 * to start a new frame.</p>
 * 
 * <p>Note: {@code ZSTD_e_end} will flush as much output as possible, meaning when compressing with multiple threads, it will block until the flush is
 * complete or the output buffer is full.</p>
 * 
 * <h3>Streaming decompression - HowTo</h3>
 * 
 * <p>A {@code ZSTD_DStream} object is required to track streaming operations.</p>
 * 
 * <p>Use {@link #ZSTD_createDStream createDStream} and {@link #ZSTD_freeDStream freeDStream} to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.</p>
 * 
 * <p>Use {@link #ZSTD_DCtx_reset DCtx_reset} and {@link #ZSTD_DCtx_refDDict DCtx_refDDict} to start a new decompression operation. Alternatively, use advanced API to set specific properties.</p>
 * 
 * <p>Use {@link #ZSTD_decompressStream decompressStream} repetitively to consume your input. The function will update both {@code pos} fields. If {@code input.pos < input.size}, some
 * input has not been consumed. It's up to the caller to present again remaining data. The function tries to flush all data decoded immediately,
 * respecting output buffer size. If {@code output.pos < output.size}, decoder has flushed everything it could. But if {@code output.pos == output.size},
 * there might be some data left within internal buffers. In which case, call {@code ZSTD_decompressStream()} again to flush whatever remains in the
 * buffer.</p>
 * 
 * <p>Note: with no additional input provided, amount of data flushed is necessarily &le; {@link #ZSTD_BLOCKSIZE_MAX BLOCKSIZE_MAX}.</p>
 */
public class Zstd {

    static { LibZstd.initialize(); }

    /** Version number part. */
    public static final int
        ZSTD_VERSION_MAJOR   = 1,
        ZSTD_VERSION_MINOR   = 5,
        ZSTD_VERSION_RELEASE = 2;

    /** Version number. */
    public static final int ZSTD_VERSION_NUMBER = (ZSTD_VERSION_MAJOR *100*100 + ZSTD_VERSION_MINOR *100 + ZSTD_VERSION_RELEASE);

    /** Version string. */
    public static final String ZSTD_VERSION_STRING = ZSTD_VERSION_MAJOR + "." + ZSTD_VERSION_MINOR + "." + ZSTD_VERSION_RELEASE;

    /** Default compression level. */
    public static final int ZSTD_CLEVEL_DEFAULT = 3;

    public static final int ZSTD_MAGICNUMBER = 0xFD2FB528;

    public static final int ZSTD_MAGIC_DICTIONARY = 0xEC30A437;

    public static final int ZSTD_MAGIC_SKIPPABLE_START = 0x184D2A50;

    public static final int ZSTD_MAGIC_SKIPPABLE_MASK = 0xFFFFFFF0;

    public static final int ZSTD_BLOCKSIZELOG_MAX = 17;

    public static final int ZSTD_BLOCKSIZE_MAX = (1<<ZSTD_BLOCKSIZELOG_MAX);

    /** Content size. */
    public static final long
        ZSTD_CONTENTSIZE_UNKNOWN = -1L,
        ZSTD_CONTENTSIZE_ERROR   = -2L;

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
     * Compression parameters. ({@code ZSTD_cParameter})
     * 
     * <p>Note: When compressing with a {@code ZSTD_CDict} these parameters are superseded by the parameters used to construct the {@code ZSTD_CDict}. See
     * {@link #ZSTD_CCtx_refCDict CCtx_refCDict} for more info.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_c_compressionLevel c_compressionLevel} - 
     * Set compression parameters according to pre-defined {@code cLevel} table.
     * 
     * <p>Note that exact compression parameters are dynamically determined, depending on both compression level and {@code srcSize} (when known). Default
     * level is {@link #ZSTD_CLEVEL_DEFAULT CLEVEL_DEFAULT}{@code ==3}. Special: value 0 means default, which is controlled by {@code ZSTD_CLEVEL_DEFAULT}.</p>
     * 
     * <p>Note 1: it's possible to pass a negative compression level.</p>
     * 
     * <p>Note 2: setting a level does not automatically set all other compression parameters to default. Setting this will however eventually dynamically
     * impact the compression parameters which have not been manually set. The manually set ones will 'stick'.</p>
     * </li>
     * <li>{@link #ZSTD_c_windowLog c_windowLog} - 
     * Maximum allowed back-reference distance, expressed as power of 2.
     * 
     * <p>This will set a memory budget for streaming decompression, with larger values requiring more memory and typically compressing more. Must be clamped
     * between {@link ZstdX#ZSTD_WINDOWLOG_MIN WINDOWLOG_MIN} and {@link ZstdX#ZSTD_WINDOWLOG_MAX WINDOWLOG_MAX}. Special: value 0 means "use default {@code windowLog}".</p>
     * 
     * <p>Note: Using a {@code windowLog} greater than {@link ZstdX#ZSTD_WINDOWLOG_LIMIT_DEFAULT WINDOWLOG_LIMIT_DEFAULT} requires explicitly allowing such size at streaming decompression stage.</p>
     * </li>
     * <li>{@link #ZSTD_c_hashLog c_hashLog} - 
     * Size of the initial probe table, as a power of 2.
     * 
     * <p>Resulting memory usage is (1 &lt;&lt; {@code (hashLog+2)}). Must be clamped between {@link ZstdX#ZSTD_HASHLOG_MIN HASHLOG_MIN} and {@link ZstdX#ZSTD_HASHLOG_MAX HASHLOG_MAX}. Larger tables improve
     * compression ratio of strategies &le; dFast, and improve speed of strategies &gt; dFast. Special: value 0 means "use default {@code hashLog}".</p>
     * </li>
     * <li>{@link #ZSTD_c_chainLog c_chainLog} - 
     * Size of the multi-probe search table, as a power of 2.
     * 
     * <p>Resulting memory usage is (1 &lt;&lt; {@code (chainLog+2)}). Must be clamped between {@link ZstdX#ZSTD_CHAINLOG_MIN CHAINLOG_MIN} and {@link ZstdX#ZSTD_CHAINLOG_MAX CHAINLOG_MAX}. Larger tables result in
     * better and slower compression. This parameter is useless for "fast" strategy. It's still useful when using "dfast" strategy, in which case it
     * defines a secondary probe table. Special: value 0 means "use default {@code chainLog}".</p>
     * </li>
     * <li>{@link #ZSTD_c_searchLog c_searchLog} - 
     * Number of search attempts, as a power of 2.
     * 
     * <p>More attempts result in better and slower compression. This parameter is useless for "fast" and "dFast" strategies. Special: value 0 means "use
     * default {@code searchLog}".</p>
     * </li>
     * <li>{@link #ZSTD_c_minMatch c_minMatch} - 
     * Minimum size of searched matches. Note that Zstandard can still find matches of smaller size, it just tweaks its search algorithm to look for this
     * size and larger. Larger values increase compression and decompression speed, but decrease ratio. Must be clamped between {@link ZstdX#ZSTD_MINMATCH_MIN MINMATCH_MIN} and
     * {@link ZstdX#ZSTD_MINMATCH_MAX MINMATCH_MAX}. Note that currently, for all strategies &lt;btopt, effective minimum is 4. , for all strategies &gt; fast, effective maximum is 6.
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
     * different value. Note: will be enabled by default if {@code ZSTD_c_windowLog &ge; 128 MB} and compression strategy
     * {@code &ge; ZSTD_btopt (== compression level 16+)}.
     * </li>
     * <li>{@link #ZSTD_c_ldmHashLog c_ldmHashLog} - 
     * Size of the table for long distance matching, as a power of 2. Larger values increase memory usage and compression ratio, but decrease compression
     * speed. Must be clamped between {@link ZstdX#ZSTD_HASHLOG_MIN HASHLOG_MIN} and {@link ZstdX#ZSTD_HASHLOG_MAX HASHLOG_MAX} default: windowlog - 7. Special: value 0 means "automatically determine hashlog".
     * </li>
     * <li>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch} - 
     * Minimum match size for long distance matcher. Larger/too small values usually decrease compression ratio. Must be clamped between {@link ZstdX#ZSTD_LDM_MINMATCH_MIN LDM_MINMATCH_MIN}
     * and {@link ZstdX#ZSTD_LDM_MINMATCH_MAX LDM_MINMATCH_MAX}. Special: value 0 means "use default value" (default: 64).
     * </li>
     * <li>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog} - 
     * Log size of each bucket in the LDM hash table for collision resolution. Larger values improve collision resolution but decrease compression speed.
     * The maximum value is {@link ZstdX#ZSTD_LDM_BUCKETSIZELOG_MAX LDM_BUCKETSIZELOG_MAX}. Special: value 0 means "use default value" (default: 3).
     * </li>
     * <li>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog} - 
     * Frequency of inserting/looking up entries into the LDM hash table. Must be clamped between 0 and ({@link ZstdX#ZSTD_WINDOWLOG_MAX WINDOWLOG_MAX} - {@link ZstdX#ZSTD_HASHLOG_MIN HASHLOG_MIN}). Default
     * is {@code MAX(0, (windowLog - ldmHashLog))}, optimizing hash table usage. Larger values improve compression speed. Deviating far from default value
     * will likely result in a compression ratio decrease. Special: value 0 means "automatically determine {@code hashRateLog}".
     * </li>
     * <li>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag} - 
     * Content size will be written into frame header _whenever known_ (default:1) Content size must be known at the beginning of compression. This is
     * automatically the case when using {@link #ZSTD_compress2 compress2}, For streaming scenarios, content size must be provided with {@link #ZSTD_CCtx_setPledgedSrcSize CCtx_setPledgedSrcSize}.
     * </li>
     * <li>{@link #ZSTD_c_checksumFlag c_checksumFlag} - A 32-bits checksum of content is written at end of frame (default:0)</li>
     * <li>{@link #ZSTD_c_dictIDFlag c_dictIDFlag} - When applicable, dictionary's ID is written into frame header (default:1)</li>
     * <li>{@link #ZSTD_c_nbWorkers c_nbWorkers} - 
     * Select how many threads will be spawned to compress in parallel.
     * 
     * <p>When {@code nbWorkers &ge; 1}, triggers asynchronous mode when invoking {@code ZSTD_compressStream*()}: {@code ZSTD_compressStream*()} consumes
     * input and flush output if possible, but immediately gives back control to caller, while compression work is performed in parallel, within worker
     * thread(s). (note: a strong exception to this rule is when first invocation of {@link #ZSTD_compressStream2 compressStream2} sets {@link #ZSTD_e_end e_end}: in which case,
     * {@code ZSTD_compressStream2()} delegates to {@link #ZSTD_compress2 compress2}, which is always a blocking call). More workers improve speed, but also increase memory
     * usage.</p>
     * 
     * <p>Default value is {@code 0}, aka "single-threaded mode": no worker is spawned, compression is performed inside Caller's thread, and all invocations
     * are blocking.</p>
     * </li>
     * <li>{@link #ZSTD_c_jobSize c_jobSize} - 
     * Size of a compression job. This value is enforced only when {@code nbWorkers &ge; 1}. Each compression job is completed in parallel, so this value
     * can indirectly impact the nb of active threads. 0 means default, which is dynamically determined based on compression parameters. Job size must be
     * a minimum of overlap size, or {@code ZSTDMT_JOBSIZE_MIN} (= 512 KB), whichever is largest. The minimum size is automatically and transparently
     * enforced.
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
     * <li>{@link #ZSTD_c_experimentalParam5 c_experimentalParam5}</li>
     * <li>{@link #ZSTD_c_experimentalParam6 c_experimentalParam6}</li>
     * <li>{@link #ZSTD_c_experimentalParam7 c_experimentalParam7}</li>
     * <li>{@link #ZSTD_c_experimentalParam8 c_experimentalParam8}</li>
     * <li>{@link #ZSTD_c_experimentalParam9 c_experimentalParam9}</li>
     * <li>{@link #ZSTD_c_experimentalParam10 c_experimentalParam10}</li>
     * <li>{@link #ZSTD_c_experimentalParam11 c_experimentalParam11}</li>
     * <li>{@link #ZSTD_c_experimentalParam12 c_experimentalParam12}</li>
     * <li>{@link #ZSTD_c_experimentalParam13 c_experimentalParam13}</li>
     * <li>{@link #ZSTD_c_experimentalParam14 c_experimentalParam14}</li>
     * <li>{@link #ZSTD_c_experimentalParam15 c_experimentalParam15}</li>
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
        ZSTD_c_experimentalParam4         = 1001,
        ZSTD_c_experimentalParam5         = 1002,
        ZSTD_c_experimentalParam6         = 1003,
        ZSTD_c_experimentalParam7         = 1004,
        ZSTD_c_experimentalParam8         = 1005,
        ZSTD_c_experimentalParam9         = 1006,
        ZSTD_c_experimentalParam10        = 1007,
        ZSTD_c_experimentalParam11        = 1008,
        ZSTD_c_experimentalParam12        = 1009,
        ZSTD_c_experimentalParam13        = 1010,
        ZSTD_c_experimentalParam14        = 1011,
        ZSTD_c_experimentalParam15        = 1012;

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
     * The advanced API pushes parameters one by one into an existing {@code DCtx} context. Parameters are sticky, and remain valid for all following frames
     * using the same {@code DCtx} context. It's possible to reset parameters to default values using {@link #ZSTD_DCtx_reset DCtx_reset}.
     * 
     * <p>Note: This API is compatible with existing {@link #ZSTD_decompressDCtx decompressDCtx} and {@link #ZSTD_decompressStream decompressStream}. Therefore, no new decompression function is necessary.</p>
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
     * accepts window sizes &le; (1 &lt;&lt; {@link ZstdX#ZSTD_WINDOWLOG_LIMIT_DEFAULT WINDOWLOG_LIMIT_DEFAULT})</p>
     * 
     * <p>Special: value 0 means "use default maximum windowLog".</p>
     * </li>
     * <li>{@link #ZSTD_d_experimentalParam1 d_experimentalParam1} - 
     * Note: additional experimental parameters are also available within the experimental section of the API. At the time of this writing, they include:
     * 
     * <ul>
     * <li>{@link ZstdX#ZSTD_d_format d_format}</li>
     * <li>{@link ZstdX#ZSTD_d_stableOutBuffer d_stableOutBuffer}</li>
     * </ul>
     * 
     * <p>Note: never ever use {@code experimentalParam}? names directly</p>
     * </li>
     * <li>{@link #ZSTD_d_experimentalParam2 d_experimentalParam2}</li>
     * <li>{@link #ZSTD_d_experimentalParam3 d_experimentalParam3}</li>
     * <li>{@link #ZSTD_d_experimentalParam4 d_experimentalParam4}</li>
     * </ul>
     */
    public static final int
        ZSTD_d_windowLogMax       = 100,
        ZSTD_d_experimentalParam1 = 1000,
        ZSTD_d_experimentalParam2 = 1001,
        ZSTD_d_experimentalParam3 = 1002,
        ZSTD_d_experimentalParam4 = 1003;

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

    protected Zstd() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_versionNumber ] ---

    /** Returns runtime library version, the value is {@code (MAJOR*100*100 + MINOR*100 + RELEASE)}. */
    @NativeType("unsigned")
    public static native int ZSTD_versionNumber();

    // --- [ ZSTD_versionString ] ---

    /** Unsafe version of: {@link #ZSTD_versionString versionString} */
    public static native long nZSTD_versionString();

    /** Returns runtime library version, like "1.4.5". */
    @NativeType("char const *")
    public static String ZSTD_versionString() {
        long __result = nZSTD_versionString();
        return memASCII(__result);
    }

    // --- [ ZSTD_compress ] ---

    /** Unsafe version of: {@link #ZSTD_compress compress} */
    public static native long nZSTD_compress(long dst, long dstCapacity, long src, long srcSize, int compressionLevel);

    /**
     * Compresses {@code src} content as a single zstd compressed frame into already allocated {@code dst}.
     * 
     * <p>Hint: compression runs faster if {@code dstCapacity} &ge; {@link #ZSTD_compressBound compressBound}{@code (srcSize)}</p>
     *
     * @return compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using {@link #ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_compress(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, int compressionLevel) {
        return nZSTD_compress(memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), compressionLevel);
    }

    // --- [ ZSTD_decompress ] ---

    /**
     * Unsafe version of: {@link #ZSTD_decompress decompress}
     *
     * @param dstCapacity    is an upper bound of {@code originalSize} to regenerate. If user cannot imply a maximum upper bound, it's better to use streaming mode to
     *                       decompress data.
     * @param compressedSize must be the <b>exact</b> size of some number of compressed and/or skippable frames
     */
    public static native long nZSTD_decompress(long dst, long dstCapacity, long src, long compressedSize);

    /**
     * @return the number of bytes decompressed into {@code dst} (&le; {@code dstCapacity}), or an {@code errorCode} if it fails (which can be tested using
     *         {@link #ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_decompress(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        return nZSTD_decompress(memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_getFrameContentSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_getFrameContentSize getFrameContentSize}
     *
     * @param srcSize must be at least as large as the frame header. Hint: any size &ge; {@link ZstdX#ZSTD_FRAMEHEADERSIZE_MAX FRAMEHEADERSIZE_MAX} is large enough.
     */
    public static native long nZSTD_getFrameContentSize(long src, long srcSize);

    /**
     * Notes:
     * 
     * <ol>
     * <li>a 0 return value means the frame is valid but "empty"</li>
     * <li>decompressed size is an optional field, it may not be present, typically in streaming mode. When {@code return==ZSTD_CONTENTSIZE_UNKNOWN}, data to
     * decompress could be any size. In which case, it's necessary to use streaming mode to decompress data. Optionally, application can rely on some
     * implicit limit, as {@link #ZSTD_decompress decompress} only needs an upper bound of decompressed size. (For example, data could be necessarily cut into blocks &le; 16
     * KB).</li>
     * <li>decompressed size is always present when compression is completed using single-pass functions, such as {@link #ZSTD_compress compress}, {@link #ZSTD_compressCCtx compressCCtx},
     * {@link #ZSTD_compress_usingDict compress_usingDict} or {@link #ZSTD_compress_usingCDict compress_usingCDict}.</li>
     * <li>decompressed size can be very large (64-bits value), potentially larger than what local system can handle as a single memory segment. In which
     * case, it's necessary to use streaming mode to decompress data.</li>
     * <li>If source is untrusted, decompressed size could be wrong or intentionally modified. Always ensure return value fits within application's authorized
     * limits. Each application can set its own limits.</li>
     * </ol>
     *
     * @param src should point to the start of a ZSTD encoded frame
     *
     * @return decompressed size of {@code src} frame content, if known
     *         
     *         <ul>
     *         <li>{@link #ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN} if the size cannot be determined</li>
     *         <li>{@link #ZSTD_CONTENTSIZE_ERROR CONTENTSIZE_ERROR} if an error occurred (e.g. invalid magic number, {@code srcSize} too small)</li>
     *         </ul>
     */
    @NativeType("unsigned long long")
    public static long ZSTD_getFrameContentSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getFrameContentSize(memAddress(src), src.remaining());
    }

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
     * @return the compressed size of the first frame starting at {@code src}, suitable to pass as {@code srcSize} to {@link #ZSTD_decompress decompress} or similar, or an error code if
     *         input is invalid
     */
    @NativeType("size_t")
    public static long ZSTD_findFrameCompressedSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_findFrameCompressedSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_compressBound ] ---

    /** Returns the maximum compressed size in worst case single-pass scenario. */
    @NativeType("size_t")
    public static native long ZSTD_compressBound(@NativeType("size_t") long srcSize);

    // --- [ ZSTD_isError ] ---

    /** Unsafe version of: {@link #ZSTD_isError isError} */
    public static native int nZSTD_isError(long code);

    /** Tells if a {@code size_t} function result is an error code. */
    @NativeType("unsigned int")
    public static boolean ZSTD_isError(@NativeType("size_t") long code) {
        return nZSTD_isError(code) != 0;
    }

    // --- [ ZSTD_getErrorName ] ---

    /** Unsafe version of: {@link #ZSTD_getErrorName getErrorName} */
    public static native long nZSTD_getErrorName(long code);

    /** Provides readable string from an error code. */
    @NativeType("char const *")
    public static String ZSTD_getErrorName(@NativeType("size_t") long code) {
        long __result = nZSTD_getErrorName(code);
        return memASCII(__result);
    }

    // --- [ ZSTD_minCLevel ] ---

    /** Returns the minimum compression level available. */
    public static native int ZSTD_minCLevel();

    // --- [ ZSTD_maxCLevel ] ---

    /** Returns the maximum compression level available. */
    public static native int ZSTD_maxCLevel();

    // --- [ ZSTD_defaultCLevel ] ---

    /** Returns the default compression level, specified by {@link #ZSTD_CLEVEL_DEFAULT CLEVEL_DEFAULT} */
    public static native int ZSTD_defaultCLevel();

    // --- [ ZSTD_createCCtx ] ---

    /**
     * Creates a compression context.
     * 
     * <p>When compressing many times, it is recommended to allocate a context just once, and re-use it for each successive compression operation. This will make
     * workload friendlier for system's memory. Use one context per thread for parallel execution in multi-threaded environments.</p>
     */
    @NativeType("ZSTD_CCtx *")
    public static native long ZSTD_createCCtx();

    // --- [ ZSTD_freeCCtx ] ---

    /**
     * Frees memory allocated by {@link #ZSTD_createCCtx createCCtx}.
     *
     * @param cctx accepts {@code NULL} pointer
     */
    @NativeType("size_t")
    public static native long ZSTD_freeCCtx(@NativeType("ZSTD_CCtx *") long cctx);

    // --- [ ZSTD_compressCCtx ] ---

    /** Unsafe version of: {@link #ZSTD_compressCCtx compressCCtx} */
    public static native long nZSTD_compressCCtx(long ctx, long dst, long dstCapacity, long src, long srcSize, int compressionLevel);

    /**
     * Same as {@link #ZSTD_compress compress}, using an explicit {@code ZSTD_CCtx}.
     * 
     * <p>Important: in order to behave similarly to {@code ZSTD_compress()}, this function compresses at requested compression level, <b>ignoring any other
     * parameter</b>. If any advanced parameter was set using the advanced API, they will all be reset. Only {@code compressionLevel} remains.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_compressCCtx(@NativeType("ZSTD_CCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, int compressionLevel) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_compressCCtx(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), compressionLevel);
    }

    // --- [ ZSTD_createDCtx ] ---

    /**
     * Creates a decompression context.
     * 
     * <p>When decompressing many times, it is recommended to allocate a context only once, and re-use it for each successive compression operation. This will
     * make workload friendlier for system's memory. Use one context per thread for parallel execution.</p>
     */
    @NativeType("ZSTD_DCtx *")
    public static native long ZSTD_createDCtx();

    // --- [ ZSTD_freeDCtx ] ---

    /**
     * Frees memory allocated by {@link #ZSTD_createDCtx createDCtx}.
     *
     * @param dctx accepts {@code NULL} pointer
     */
    @NativeType("size_t")
    public static native long ZSTD_freeDCtx(@NativeType("ZSTD_DCtx *") long dctx);

    // --- [ ZSTD_decompressDCtx ] ---

    /** Unsafe version of: {@link #ZSTD_decompressDCtx decompressDCtx} */
    public static native long nZSTD_decompressDCtx(long ctx, long dst, long dstCapacity, long src, long srcSize);

    /** Same as {@link #ZSTD_decompress decompress}, requires an allocated {@code ZSTD_DCtx}. Compatible with sticky parameters. */
    @NativeType("size_t")
    public static long ZSTD_decompressDCtx(@NativeType("ZSTD_DCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_decompressDCtx(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_cParam_getBounds ] ---

    /** Unsafe version of: {@link #ZSTD_cParam_getBounds cParam_getBounds} */
    public static native void nZSTD_cParam_getBounds(int cParam, long __result);

    /**
     * All parameters must belong to an interval with lower and upper bounds, otherwise they will either trigger an error or be automatically clamped.
     *
     * @param cParam   one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td></tr><tr><td>{@link #ZSTD_c_searchLog c_searchLog}</td><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td></tr><tr><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td></tr><tr><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td></tr><tr><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td><td>{@link #ZSTD_c_experimentalParam5 c_experimentalParam5}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam6 c_experimentalParam6}</td><td>{@link #ZSTD_c_experimentalParam7 c_experimentalParam7}</td><td>{@link #ZSTD_c_experimentalParam8 c_experimentalParam8}</td><td>{@link #ZSTD_c_experimentalParam9 c_experimentalParam9}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam10 c_experimentalParam10}</td><td>{@link #ZSTD_c_experimentalParam11 c_experimentalParam11}</td><td>{@link #ZSTD_c_experimentalParam12 c_experimentalParam12}</td><td>{@link #ZSTD_c_experimentalParam13 c_experimentalParam13}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam14 c_experimentalParam14}</td><td>{@link #ZSTD_c_experimentalParam15 c_experimentalParam15}</td></tr></table>
     * @param __result a structure, {@code ZSTD_bounds}, which contains
     *                 
     *                 <ul>
     *                 <li>an error status field, which must be tested using {@link #ZSTD_isError isError}</li>
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
     * @param param one of:<br><table><tr><td>{@link #ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link #ZSTD_c_windowLog c_windowLog}</td><td>{@link #ZSTD_c_hashLog c_hashLog}</td><td>{@link #ZSTD_c_chainLog c_chainLog}</td></tr><tr><td>{@link #ZSTD_c_searchLog c_searchLog}</td><td>{@link #ZSTD_c_minMatch c_minMatch}</td><td>{@link #ZSTD_c_targetLength c_targetLength}</td><td>{@link #ZSTD_c_strategy c_strategy}</td></tr><tr><td>{@link #ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link #ZSTD_c_ldmHashLog c_ldmHashLog}</td><td>{@link #ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link #ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td></tr><tr><td>{@link #ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link #ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link #ZSTD_c_checksumFlag c_checksumFlag}</td><td>{@link #ZSTD_c_dictIDFlag c_dictIDFlag}</td></tr><tr><td>{@link #ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link #ZSTD_c_jobSize c_jobSize}</td><td>{@link #ZSTD_c_overlapLog c_overlapLog}</td><td>{@link #ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link #ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link #ZSTD_c_experimentalParam4 c_experimentalParam4}</td><td>{@link #ZSTD_c_experimentalParam5 c_experimentalParam5}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam6 c_experimentalParam6}</td><td>{@link #ZSTD_c_experimentalParam7 c_experimentalParam7}</td><td>{@link #ZSTD_c_experimentalParam8 c_experimentalParam8}</td><td>{@link #ZSTD_c_experimentalParam9 c_experimentalParam9}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam10 c_experimentalParam10}</td><td>{@link #ZSTD_c_experimentalParam11 c_experimentalParam11}</td><td>{@link #ZSTD_c_experimentalParam12 c_experimentalParam12}</td><td>{@link #ZSTD_c_experimentalParam13 c_experimentalParam13}</td></tr><tr><td>{@link #ZSTD_c_experimentalParam14 c_experimentalParam14}</td><td>{@link #ZSTD_c_experimentalParam15 c_experimentalParam15}</td></tr></table>
     *
     * @return an error code (which can be tested using {@link #ZSTD_isError isError})
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
     * <p>Note 1: {@code pledgedSrcSize==0} actually means zero, aka an empty frame. In order to mean "unknown content size", pass constant {@link #ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}.
     * {@code ZSTD_CONTENTSIZE_UNKNOWN} is default value for any new frame.</p>
     * 
     * <p>Note 2: {@code pledgedSrcSize} is only valid once, for the next frame. It's discarded at the end of the frame, and replaced by
     * {@code ZSTD_CONTENTSIZE_UNKNOWN}.</p>
     * 
     * <p>Note 3 : Whenever all input data is provided and consumed in a single round, for example with {@link #ZSTD_compress2 compress2}, or invoking immediately
     * {@code ZSTD_compressStream2(,,,ZSTD_e_end)}, this value is automatically overridden by {@code srcSize} instead.</p>
     *
     * @return 0, or an error code (which can be tested with {@link #ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_setPledgedSrcSize(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("unsigned long long") long pledgedSrcSize) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_setPledgedSrcSize(cctx, pledgedSrcSize);
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
     * {@link #ZSTD_isError isError})</li>
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
     * Behaves the same as {@link #ZSTD_compressCCtx compressCCtx}, but compression parameters are set using the advanced API.
     * 
     * <p>{@code ZSTD_compress2()} always starts a new frame. Should cctx hold data from a previously unfinished frame, everything about it is forgotten.</p>
     * 
     * <p>- Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}
     * - The function is always blocking, returns when compression is completed. Hint: compression runs faster if {@code dstCapacity} &ge;
     * {@code ZSTD_compressBound(srcSize)}.</p>
     *
     * @return compressed size written into {@code dst} (&le; {@code dstCapacity}), or an error code if it fails (which can be tested using {@link #ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_compress2(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compress2(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_dParam_getBounds ] ---

    /** Unsafe version of: {@link #ZSTD_dParam_getBounds dParam_getBounds} */
    public static native void nZSTD_dParam_getBounds(int dParam, long __result);

    /**
     * All parameters must belong to an interval with lower and upper bounds, otherwise they will either trigger an error or be automatically clamped.
     *
     * @param __result returns a structure, {@code ZSTD_bounds}, which contains - an error status field, which must be tested using {@link #ZSTD_isError isError} - both lower and upper bounds,
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
     * @param param one of:<br><table><tr><td>{@link #ZSTD_d_windowLogMax d_windowLogMax}</td><td>{@link #ZSTD_d_experimentalParam1 d_experimentalParam1}</td><td>{@link #ZSTD_d_experimentalParam2 d_experimentalParam2}</td><td>{@link #ZSTD_d_experimentalParam3 d_experimentalParam3}</td></tr><tr><td>{@link #ZSTD_d_experimentalParam4 d_experimentalParam4}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested using {@link #ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_setParameter(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_dParameter") int param, int value) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_setParameter(dctx, param, value);
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
     * @return 0, or an error code, which can be tested with {@link #ZSTD_isError isError}
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_reset(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_ResetDirective") int reset) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_reset(dctx, reset);
    }

    // --- [ ZSTD_createCStream ] ---

    /**
     * A {@code ZSTD_CStream} object is required to track streaming operation.
     * 
     * <p>Use {@code ZSTD_createCStream()} and {@link #ZSTD_freeCStream freeCStream} to create/release resources.</p>
     * 
     * <p>{@code ZSTD_CStream} objects can be reused multiple times on consecutive compression operations. It is recommended to re-use {@code ZSTD_CStream} in
     * situations where many streaming operations will be achieved consecutively, since it will play nicer with system's memory, by re-using already allocated
     * memory. Use one separate {@code ZSTD_CStream} per thread for parallel execution.</p>
     */
    @NativeType("ZSTD_CStream *")
    public static native long ZSTD_createCStream();

    // --- [ ZSTD_freeCStream ] ---

    /**
     * Frees memory allocated by {@link #ZSTD_createCStream createCStream}.
     *
     * @param zcs accepts {@code NULL} pointer
     */
    @NativeType("size_t")
    public static native long ZSTD_freeCStream(@NativeType("ZSTD_CStream *") long zcs);

    // --- [ ZSTD_compressStream2 ] ---

    /** Unsafe version of: {@link #ZSTD_compressStream2 compressStream2} */
    public static native long nZSTD_compressStream2(long cctx, long output, long input, int endOp);

    /**
     * Behaves about the same as {@code ZSTD_compressStream()}, with additional control on end directive.
     * 
     * <ul>
     * <li>Compression parameters are pushed into {@code CCtx} before starting compression, using {@code ZSTD_CCtx_set*()}.</li>
     * <li>Compression parameters cannot be changed once compression is started (save a list of exceptions in multi-threading mode).</li>
     * <li>{@code outpot->pos} must be &le; {@code dstCapacity}, {@code input->pos} must be &le; {@code srcSize}.</li>
     * <li>{@code outpot->pos} and {@code input->pos} will be updated. They are guaranteed to remain below their respective limit.</li>
     * <li>{@code endOp} must be a valid directive.</li>
     * <li>When {@code nbWorkers==0} (default), function is blocking: it completes its job before returning to caller.</li>
     * <li>When {@code nbWorkers&ge;1}, function is non-blocking: it copies a portion of input, distributes jobs to internal worker threads, flush to output
     * whatever is available, and then immediately returns, just indicating that there is some data remaining to be flushed. The function nonetheless
     * guarantees forward progress: it will return only after it reads or write at least 1+ byte.</li>
     * <li>Exception: if the first call requests a {@link #ZSTD_e_end e_end} directive and provides enough {@code dstCapacity}, the function delegates to {@link #ZSTD_compress2 compress2} which is
     * always blocking.</li>
     * </ul>
     *
     * @param endOp one of:<br><table><tr><td>{@link #ZSTD_e_continue e_continue}</td><td>{@link #ZSTD_e_flush e_flush}</td><td>{@link #ZSTD_e_end e_end}</td></tr></table>
     *
     * @return provides a minimum amount of data remaining to be flushed from internal buffers or an error code, which can be tested using {@link #ZSTD_isError isError}.
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

    // --- [ ZSTD_CStreamInSize ] ---

    /**
     * Returns the recommended size for input buffer.
     * 
     * <p>These buffer sizes are softly recommended. They are not required: {@code ZSTD_compressStream*()} happily accepts any buffer size, for both input and
     * output. Respecting the recommended size just makes it a bit easier for {@code ZSTD_compressStream*()}, reducing the amount of memory shuffling and
     * buffering, resulting in minor performance savings.</p>
     * 
     * <p>However, note that these recommendations are from the perspective of a C caller program. If the streaming interface is invoked from some other
     * language, especially managed ones such as Java or Go, through a foreign function interface such as jni or cgo, a major performance rule is to reduce
     * crossing such interface to an absolute minimum. It's not rare that performance ends being spent more into the interface, rather than compression
     * itself. In which cases, prefer using large buffers, as large as practical, for both input and output, to reduce the nb of roundtrips.</p>
     */
    @NativeType("size_t")
    public static native long ZSTD_CStreamInSize();

    // --- [ ZSTD_CStreamOutSize ] ---

    /** Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block. */
    @NativeType("size_t")
    public static native long ZSTD_CStreamOutSize();

    // --- [ ZSTD_createDStream ] ---

    /**
     * A {@code ZSTD_DStream} object is required to track streaming operations.
     * 
     * <p>Use {@code ZSTD_createDStream()} and {@link #ZSTD_freeDStream freeDStream} to create/release resources. {@code ZSTD_DStream} objects can be re-used multiple times.</p>
     */
    @NativeType("ZSTD_DStream *")
    public static native long ZSTD_createDStream();

    // --- [ ZSTD_freeDStream ] ---

    /**
     * Frees memory allocated by {@link #ZSTD_createDStream createDStream}.
     *
     * @param zds accepts {@code NULL} pointer
     */
    @NativeType("size_t")
    public static native long ZSTD_freeDStream(@NativeType("ZSTD_DStream *") long zds);

    // --- [ ZSTD_decompressStream ] ---

    /** Unsafe version of: {@link #ZSTD_decompressStream decompressStream} */
    public static native long nZSTD_decompressStream(long zds, long output, long input);

    /**
     * Use {@code ZSTD_decompressStream()} repetitively to consume your input.
     * 
     * <p>The function will update both {@code pos} fields. If {@code input.pos < input.size}, some input has not been consumed. It's up to the caller to present
     * again remaining data. The function tries to flush all data decoded immediately, respecting output buffer size. If {@code output.pos < output.size},
     * decoder has flushed everything it could. But if {@code output.pos == output.size}, there might be some data left within internal buffers. In which
     * case, call {@code ZSTD_decompressStream()} again to flush whatever remains in the buffer. With no additional input provided, amount of data flushed is
     * necessarily &le; {@link #ZSTD_BLOCKSIZE_MAX BLOCKSIZE_MAX}.</p>
     *
     * @return 0 when a frame is completely decoded and fully flushed, an error code, which can be tested using {@link #ZSTD_isError isError}, any other value &gt; 0, which means there
     *         is still some decoding to do to complete current frame. The return value is a suggested next input size (just a hint to improve latency) that will
     *         never request more than the remaining frame size.
     */
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

    /** Returns the recommended size for input buffer. */
    @NativeType("size_t")
    public static native long ZSTD_DStreamInSize();

    // --- [ ZSTD_DStreamOutSize ] ---

    /** Returns the recommended size for output buffer. Guarantee to successfully flush at least one complete compressed block in all circumstances. */
    @NativeType("size_t")
    public static native long ZSTD_DStreamOutSize();

    // --- [ ZSTD_compress_usingDict ] ---

    /** Unsafe version of: {@link #ZSTD_compress_usingDict compress_usingDict} */
    public static native long nZSTD_compress_usingDict(long ctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize, int compressionLevel);

    /**
     * Compression at an explicit compression level using a Dictionary.
     * 
     * <p>A dictionary can be any arbitrary data segment (also called a prefix), or a buffer with specified information (see {@code zdict.h}).</p>
     * 
     * <p>This function loads the dictionary, resulting in significant startup delay. It's intended for a dictionary used only once.</p>
     * 
     * <p>When {@code dict == NULL || dictSize < 8} no dictionary is used.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_compress_usingDict(@NativeType("ZSTD_CCtx *") long ctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @Nullable @NativeType("void const *") ByteBuffer dict, int compressionLevel) {
        if (CHECKS) {
            check(ctx);
        }
        return nZSTD_compress_usingDict(ctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddressSafe(dict), remainingSafe(dict), compressionLevel);
    }

    // --- [ ZSTD_decompress_usingDict ] ---

    /** Unsafe version of: {@link #ZSTD_decompress_usingDict decompress_usingDict} */
    public static native long nZSTD_decompress_usingDict(long dctx, long dst, long dstCapacity, long src, long srcSize, long dict, long dictSize);

    /**
     * Decompression using a known Dictionary. Dictionary must be identical to the one used during compression.
     * 
     * <p>This function loads the dictionary, resulting in significant startup delay. It's intended for a dictionary used only once.</p>
     * 
     * <p>When {@code dict == NULL || dictSize < 8} no dictionary is used.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_decompress_usingDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @Nullable @NativeType("void const *") ByteBuffer dict) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_decompress_usingDict(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), memAddressSafe(dict), remainingSafe(dict));
    }

    // --- [ ZSTD_createCDict ] ---

    /** Unsafe version of: {@link #ZSTD_createCDict createCDict} */
    public static native long nZSTD_createCDict(long dictBuffer, long dictSize, int compressionLevel);

    /**
     * When compressing multiple messages or blocks using the same dictionary, it's recommended to digest the dictionary only once, since it's a costly
     * operation. {@code ZSTD_createCDict()} will create a state from digesting a dictionary.
     * 
     * <p>The resulting state can be used for future compression operations with very limited startup cost. {@code ZSTD_CDict} can be created once and shared by
     * multiple threads concurrently, since its usage is read-only.</p>
     * 
     * <p>{@code dictBuffer} can be released after {@code ZSTD_CDict} creation, because its content is copied within CDict. Consider experimental function
     * {@link ZstdX#ZSTD_createCDict_byReference createCDict_byReference} if you prefer to not duplicate {@code dictBuffer} content.</p>
     * 
     * <p>Note 1: Consider experimental function {@link ZstdX#ZSTD_createCDict_byReference createCDict_byReference} if you prefer to not duplicate {@code dictBuffer} content.</p>
     * 
     * <p>Note 2: A {@code ZSTD_CDict} can be created from an empty {@code dictBuffer}, in which case the only thing that it transports is the
     * {@code compressionLevel}. This can be useful in a pipeline featuring {@link #ZSTD_compress_usingCDict compress_usingCDict} exclusively, expecting a {@code ZSTD_CDict} parameter with
     * any data, including those without a known dictionary.</p>
     */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict(@NativeType("void const *") ByteBuffer dictBuffer, int compressionLevel) {
        return nZSTD_createCDict(memAddress(dictBuffer), dictBuffer.remaining(), compressionLevel);
    }

    // --- [ ZSTD_freeCDict ] ---

    /**
     * Frees memory allocated by {@link #ZSTD_createCDict createCDict}.
     *
     * @param CDict accepts {@code NULL} pointer
     */
    @NativeType("size_t")
    public static native long ZSTD_freeCDict(@NativeType("ZSTD_CDict *") long CDict);

    // --- [ ZSTD_compress_usingCDict ] ---

    /** Unsafe version of: {@link #ZSTD_compress_usingCDict compress_usingCDict} */
    public static native long nZSTD_compress_usingCDict(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict);

    /**
     * Compression using a digested Dictionary. Recommended when same dictionary is used multiple times.
     * 
     * <p>Compression level is <b>decided at dictionary creation time</b>, and frame parameters are hardcoded ({@code dictID=yes, contentSize=yes, checksum=no})</p>
     */
    @NativeType("size_t")
    public static long ZSTD_compress_usingCDict(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nZSTD_compress_usingCDict(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict);
    }

    // --- [ ZSTD_createDDict ] ---

    /** Unsafe version of: {@link #ZSTD_createDDict createDDict} */
    public static native long nZSTD_createDDict(long dictBuffer, long dictSize);

    /**
     * Creates a digested dictionary, ready to start decompression operation without startup delay.
     * 
     * <p>{@code dictBuffer} can be released after {@code DDict} creation, as its content is copied inside {@code DDict}.</p>
     */
    @NativeType("ZSTD_DDict *")
    public static long ZSTD_createDDict(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nZSTD_createDDict(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ ZSTD_freeDDict ] ---

    /**
     * Frees memory allocated with {@link #ZSTD_createDDict createDDict}.
     *
     * @param ddict accepts {@code NULL} pointer
     */
    @NativeType("size_t")
    public static native long ZSTD_freeDDict(@NativeType("ZSTD_DDict *") long ddict);

    // --- [ ZSTD_decompress_usingDDict ] ---

    /** Unsafe version of: {@link #ZSTD_decompress_usingDDict decompress_usingDDict} */
    public static native long nZSTD_decompress_usingDDict(long dctx, long dst, long dstCapacity, long src, long srcSize, long ddict);

    /**
     * Decompression using a digested Dictionary.
     * 
     * <p>Recommended when same dictionary is used multiple times.</p>
     */
    @NativeType("size_t")
    public static long ZSTD_decompress_usingDDict(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("ZSTD_DDict const *") long ddict) {
        if (CHECKS) {
            check(dctx);
            check(ddict);
        }
        return nZSTD_decompress_usingDDict(dctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), ddict);
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

    // --- [ ZSTD_getDictID_fromCDict ] ---

    /** Unsafe version of: {@link #ZSTD_getDictID_fromCDict getDictID_fromCDict} */
    public static native int nZSTD_getDictID_fromCDict(long cdict);

    /**
     * Provides the {@code dictID} of the dictionary loaded into {@code cdict}.
     * 
     * <p>If {@code @return == 0}, the dictionary is not conformant to Zstandard specification, or empty. Non-conformant dictionaries can still be loaded, but as
     * content-only dictionaries.</p>
     */
    @NativeType("unsigned")
    public static int ZSTD_getDictID_fromCDict(@NativeType("ZSTD_CDict const *") long cdict) {
        if (CHECKS) {
            check(cdict);
        }
        return nZSTD_getDictID_fromCDict(cdict);
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
     *         <li>{@code srcSize} is too small, and as a result, the frame header could not be decoded (only possible if {@code srcSize} &lt; {@link ZstdX#ZSTD_FRAMEHEADERSIZE_MAX FRAMEHEADERSIZE_MAX}).</li>
     *         <li>This is not a Zstandard frame. When identifying the exact failure cause, it's possible to use {@link ZstdX#ZSTD_getFrameHeader getFrameHeader}, which will provide a more precise
     *         error code.</li>
     *         </ul>
     */
    @NativeType("unsigned int")
    public static int ZSTD_getDictID_fromFrame(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_getDictID_fromFrame(memAddress(src), src.remaining());
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
     * <p>Note 3: {@code dict} content will be copied internally. Use experimental {@link ZstdX#ZSTD_CCtx_loadDictionary_byReference CCtx_loadDictionary_byReference} to reference content instead. In such a
     * case, dictionary buffer must outlive its users.</p>
     * 
     * <p>Note 4: Use {@link ZstdX#ZSTD_CCtx_loadDictionary_advanced CCtx_loadDictionary_advanced} to precisely select how dictionary content must be interpreted.</p>
     *
     * @return 0, or an error code (which can be tested with {@link #ZSTD_isError isError}).
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
     * <p>Note that compression parameters are enforced from within {@code CDict}, and supercede any compression parameter previously set within {@code CCtx}.
     * The parameters ignored are labelled as "superseded-by-cdict" in the {@code ZSTD_cParameter} enum docs. The ignored parameters will be used again if the
     * {@code CCtx} is returned to no-dictionary mode. The dictionary will remain valid for future compressed frames using same {@code CCtx}.</p>
     * 
     * <p>Special: Referencing a {@code NULL} {@code CDict} means "return to no-dictionary mode".</p>
     * 
     * <p>Note 1: Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one.</p>
     * 
     * <p>Note 2: {@code CDict} is just referenced, its lifetime must outlive its usage within {@code CCtx}.</p>
     *
     * @return 0, or an error code (which can be tested with {@link #ZSTD_isError isError}).
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
     * <p>Note 4: By default, the prefix is interpreted as raw content ({@link ZstdX#ZSTD_dct_rawContent dct_rawContent}). Use experimental {@link ZstdX#ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} to alter dictionary
     * interpretation.</p>
     *
     * @return 0, or an error code (which can be tested with {@link #ZSTD_isError isError}).
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refPrefix(@NativeType("ZSTD_CCtx *") long cctx, @Nullable @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refPrefix(cctx, memAddressSafe(prefix), remainingSafe(prefix));
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
     * <p>Note 2: {@code dict} content will be copied internally, so {@code dict} can be released after loading. Use {@link ZstdX#ZSTD_DCtx_loadDictionary_byReference DCtx_loadDictionary_byReference} to
     * reference dictionary content instead.</p>
     * 
     * <p>Note 3: Use {@link ZstdX#ZSTD_DCtx_loadDictionary_advanced DCtx_loadDictionary_advanced} to take control of how dictionary content is loaded and interpreted.</p>
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
     * <p>If called with {@code ZSTD_d_refMultipleDDicts} enabled, repeated calls of this function  will store the {@code DDict} references in a table, and the
     * {@code DDict} used for decompression will be determined at decompression time, as per the {@code dict ID} in the frame. The memory for the table is
     * allocated on the first call to {@code refDDict}, and can be freed with {@link #ZSTD_freeDCtx freeDCtx}.</p>
     * 
     * <p>Note 1: Currently, only one dictionary can be managed. Referencing a new dictionary effectively "discards" any previous one. Special: referencing a
     * {@code NULL} {@code DDict} means "return to no-dictionary mode".</p>
     * 
     * <p>Note 2: {@code DDict} is just referenced, its lifetime must outlive its usage from {@code DCtx}.</p>
     *
     * @return 0, or an error code (which can be tested with {@link #ZSTD_isError isError})
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
     * Reference is discarded at end of frame. End of frame is reached when {@link #ZSTD_decompressStream decompressStream} returns 0.</p>
     * 
     * <p>Note 1: Adding any prefix (including {@code NULL}) invalidates any previously set prefix or dictionary.</p>
     * 
     * <p>Note 2: Prefix buffer is referenced. It <b>must</b> outlive decompression. Prefix buffer must remain unmodified up to the end of frame, reached when
     * {@code ZSTD_decompressStream()} returns 0.</p>
     * 
     * <p>Note 3: By default, the prefix is treated as raw content ({@link ZstdX#ZSTD_dct_rawContent dct_rawContent}). Use {@link ZstdX#ZSTD_CCtx_refPrefix_advanced CCtx_refPrefix_advanced} to alter {@code dictMode}.</p>
     * 
     * <p>Note 4: Referencing a raw content prefix has almost no cpu nor memory cost. A full dictionary is more costly, as it requires building tables.</p>
     *
     * @return 0, or an error code (which can be tested with {@link #ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_refPrefix(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("void const *") ByteBuffer prefix) {
        if (CHECKS) {
            check(dctx);
        }
        return nZSTD_DCtx_refPrefix(dctx, memAddress(prefix), prefix.remaining());
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