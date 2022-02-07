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

import static org.lwjgl.util.zstd.Zstd.*;

/** Native bindings to the experimental API of <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd). */
public class ZstdX {

    static { LibZstd.initialize(); }

    /**
     * {@code ZSTD_dictContentType_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dct_auto dct_auto} - dictionary is "full" when starting with {@link Zstd#ZSTD_MAGIC_DICTIONARY MAGIC_DICTIONARY}, otherwise it is "rawContent"</li>
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
     * This enum controls {@link #ZSTD_d_forceIgnoreChecksum d_forceIgnoreChecksum}. {@code ZSTD_forceIgnoreChecksum_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_d_validateChecksum d_validateChecksum}</li>
     * <li>{@link #ZSTD_d_ignoreChecksum d_ignoreChecksum}</li>
     * </ul>
     */
    public static final int
        ZSTD_d_validateChecksum = 0,
        ZSTD_d_ignoreChecksum   = 1;

    /**
     * This enum controls {@link #ZSTD_d_refMultipleDDicts d_refMultipleDDicts}. {@code ZSTD_refMultipleDDicts_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_rmd_refSingleDDict rmd_refSingleDDict}</li>
     * <li>{@link #ZSTD_rmd_refMultipleDDicts rmd_refMultipleDDicts}</li>
     * </ul>
     */
    public static final int
        ZSTD_rmd_refSingleDDict    = 0,
        ZSTD_rmd_refMultipleDDicts = 1;

    /**
     * {@code ZSTD_dictAttachPref_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_dictDefaultAttach dictDefaultAttach} - Use the default heuristic.</li>
     * <li>{@link #ZSTD_dictForceAttach dictForceAttach} - Never copy the dictionary.</li>
     * <li>{@link #ZSTD_dictForceCopy dictForceCopy} - Always copy the dictionary.</li>
     * <li>{@link #ZSTD_dictForceLoad dictForceLoad} - Always reload the dictionary.</li>
     * </ul>
     */
    public static final int
        ZSTD_dictDefaultAttach = 0,
        ZSTD_dictForceAttach   = 1,
        ZSTD_dictForceCopy     = 2,
        ZSTD_dictForceLoad     = 3;

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

    public static final int ZSTD_TARGETCBLOCKSIZE_MIN = 64;

    public static final int ZSTD_TARGETCBLOCKSIZE_MAX = ZSTD_BLOCKSIZE_MAX;

    public static final int ZSTD_SRCSIZEHINT_MIN = 0;

    public static final int ZSTD_SRCSIZEHINT_MAX = Integer.MAX_VALUE;

    /**
     * Enables {@code rsyncable mode, which makes compressed files more rsync friendly by adding periodic synchronization points to the compressed data.
     * }
     * The target average block size is {@link Zstd#ZSTD_c_jobSize c_jobSize} / 2. It's possible to modify the job size to increase or decrease the granularity of the synchronization
     * point. Once the {@code jobSize} is smaller than the window size, it will result in compression ratio degradation.
     * 
     * <p>NOTE 1: {@code rsyncable} mode only works when multithreading is enabled.</p>
     * 
     * <p>NOTE 2: {@code rsyncable} performs poorly in combination with long range mode, since it will decrease the effectiveness of synchronization points,
     * though mileage may vary.</p>
     * 
     * <p>NOTE 3: {@code Rsyncable} mode limits maximum compression speed to ~400 MB/s. If the selected compression level is already running significantly
     * slower, the overall speed won't be significantly impacted.</p>
     */
    public static final int ZSTD_c_rsyncable = ZSTD_c_experimentalParam1;

    /**
     * Select a compression format.
     * 
     * <p>The value must be of type {@code ZSTD_format_e}.</p>
     */
    public static final int ZSTD_c_format = ZSTD_c_experimentalParam2;

    /** Force back-reference distances to remain &lt; {@code windowSize}, even when referencing into Dictionary content. (default:0) */
    public static final int ZSTD_c_forceMaxWindow = ZSTD_c_experimentalParam3;

    /**
     * Controls whether the contents of a {@code CDict} are used in place, or copied into the working context.
     * 
     * <p>Accepts values from the {@code ZSTD_dictAttachPref_e} enum.</p>
     */
    public static final int ZSTD_c_forceAttachDict = ZSTD_c_experimentalParam4;

    /**
     * Controlled with {@code ZSTD_paramSwitch_e} enum.
     * 
     * <ul>
     * <li>Default is {@link #ZSTD_ps_auto ps_auto}.</li>
     * <li>Set to {@link #ZSTD_ps_disable ps_disable} to never compress literals.</li>
     * <li>Set to {@link #ZSTD_ps_enable ps_enable} to always compress literals. (Note: uncompressed literals may still be emitted if huffman is not beneficial to use.)</li>
     * </ul>
     * 
     * <p>By default, in {@code ZSTD_ps_auto}, the library will decide at runtime whether to use literals compression based on the compression parameters -
     * specifically, negative compression levels do not use literal compression.</p>
     */
    public static final int ZSTD_c_literalCompressionMode = ZSTD_c_experimentalParam5;

    /**
     * Tries to fit compressed block size to be around {@code targetCBlockSize}.
     * 
     * <p>No target when {@code targetCBlockSize == 0}. There is no guarantee on compressed block size. (default:0)</p>
     */
    public static final int ZSTD_c_targetCBlockSize = ZSTD_c_experimentalParam6;

    /**
     * User's best guess of source size.
     * 
     * <p>Hint is not valid when {@code srcSizeHint == 0}. There is no guarantee that hint is close to actual source size, but compression ratio may regress
     * significantly if guess considerably underestimates.</p>
     */
    public static final int ZSTD_c_srcSizeHint = ZSTD_c_experimentalParam7;

    /**
     * Controls whether the new and experimental "dedicated dictionary search structure" can be used. This feature is still rough around the edges, be
     * prepared for surprising behavior!
     * 
     * <h5>How to use it:</h5>
     * 
     * <p>When using a {@code CDict}, whether to use this feature or not is controlled at {@code CDict} creation, and it must be set in a {@code CCtxParams} set
     * passed into that construction (via {@link #ZSTD_createCDict_advanced2 createCDict_advanced2}). A compression will then use the feature or not based on how the {@code CDict} was
     * constructed; the value of this param, set in the {@code CCtx}, will have no effect.</p>
     * 
     * <p>However, when a dictionary buffer is passed into a {@code CCtx}, such as via {@link Zstd#ZSTD_CCtx_loadDictionary CCtx_loadDictionary}, this param can be set on the {@code CCtx} to
     * control whether the {@code CDict} that is created internally can use the feature or not.</p>
     * 
     * <h5>What it does:</h5>
     * 
     * <p>Normally, the internal data structures of the {@code CDict} are analogous to what would be stored in a {@code CCtx} after compressing the contents of a
     * dictionary. To an approximation, a compression using a dictionary can then use those data structures to simply continue what is effectively a streaming
     * compression where the simulated compression of the dictionary left off. Which is to say, the search structures in the {@code CDict} are normally the
     * same format as in the {@code CCtx}.</p>
     * 
     * <p>It is possible to do better, since the {@code CDict} is not like a {@code CCtx}: the search structures are written once during {@code CDict} creation,
     * and then are only read after that, while the search structures in the {@code CCtx} are both read and written as the compression goes along. This means
     * we can choose a search structure for the dictionary that is read-optimized.</p>
     * 
     * <p>This feature enables the use of that different structure.</p>
     * 
     * <p>Note that some of the members of the {@code ZSTD_compressionParameters} struct have different semantics and constraints in the dedicated search
     * structure. It is highly recommended that you simply set a compression level in the {@code CCtxParams} you pass into the {@code CDict} creation call,
     * and avoid messing with the {@code cParams} directly.</p>
     * 
     * <h5>Effects:</h5>
     * 
     * <p>This will only have any effect when the selected {@code ZSTD_strategy} implementation supports this feature. Currently, that's limited to {@link Zstd#ZSTD_greedy greedy},
     * {@link Zstd#ZSTD_lazy lazy}, and {@link Zstd#ZSTD_lazy2 lazy2}.</p>
     * 
     * <p>Note that this means that the {@code CDict} tables can no longer be copied into the {@code CCtx}, so the {@code dict} attachment mode {@link #ZSTD_dictForceCopy dictForceCopy}
     * will no longer be usable. The dictionary can only be attached or reloaded.</p>
     * 
     * <p>In general, you should expect compression to be faster--sometimes very much so--and {@code CDict} creation to be slightly slower. Eventually, we will
     * probably make this mode the default.</p>
     */
    public static final int ZSTD_c_enableDedicatedDictSearch = ZSTD_c_experimentalParam8;

    /**
     * Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable.
     * 
     * <p>Tells the compressor that the {@code ZSTD_inBuffer} will ALWAYS be the same between calls, except for the modifications that zstd makes to pos (the
     * caller must not modify pos). This is checked by the compressor, and compression will fail if it ever changes. This means the only flush mode that makes
     * sense is {@link Zstd#ZSTD_e_end e_end}, so zstd will error if {@code ZSTD_e_end} is not used. The data in the {@code ZSTD_inBuffer} in the range {@code [src, src + pos)} MUST
     * not be modified during compression or you will get data corruption.</p>
     * 
     * <p>When this flag is enabled zstd won't allocate an input window buffer, because the user guarantees it can reference the {@code ZSTD_inBuffer} until the
     * frame is complete. But, it will still allocate an output buffer large enough to fit a block (see {@link #ZSTD_c_stableOutBuffer c_stableOutBuffer}). This will also avoid the
     * {@code memcpy()} from the input buffer to the input window buffer.</p>
     * 
     * <p>NOTE: {@link Zstd#ZSTD_compressStream2 compressStream2} will error if {@code ZSTD_e_end} is not used. That means this flag cannot be used with {@code ZSTD_compressStream*()}.</p>
     * 
     * <p>NOTE: So long as the {@code ZSTD_inBuffer} always points to valid memory, using this flag is ALWAYS memory safe, and will never access out-of-bounds
     * memory. However, compression WILL fail if you violate the preconditions.</p>
     * 
     * <p>WARNING: The data in the {@code ZSTD_inBuffer} in the range {@code [dst, dst + pos)} MUST not be modified during compression or you will get data
     * corruption. This is because zstd needs to reference data in the {@code ZSTD_inBuffer} to find matches. Normally zstd maintains its own window buffer
     * for this purpose, but passing this flag tells zstd to use the user provided buffer.</p>
     */
    public static final int ZSTD_c_stableInBuffer = ZSTD_c_experimentalParam9;

    /**
     * Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable.
     * 
     * <p>Tells he compressor that the {@code ZSTD_outBuffer} will not be resized between calls. Specifically: {@code (out.size - out.pos)} will never grow. This
     * gives the compressor the freedom to say: If the compressed data doesn't fit in the output buffer then return {@link ZstdErrors#ZSTD_error_dstSize_tooSmall error_dstSize_tooSmall}. This allows us to
     * always decompress directly into the output buffer, instead of decompressing into an internal buffer and copying to the output buffer.</p>
     * 
     * <p>When this flag is enabled zstd won't allocate an output buffer, because it can write directly to the {@code ZSTD_outBuffer}. It will still allocate the
     * input window buffer (see {@link #ZSTD_c_stableInBuffer c_stableInBuffer}).</p>
     * 
     * <p>Zstd will check that {@code (out.size - out.pos)} never grows and return an error if it does. While not strictly necessary, this should prevent
     * surprises.</p>
     */
    public static final int ZSTD_c_stableOutBuffer = ZSTD_c_experimentalParam10;

    /**
     * Default is {@code 0 == ZSTD_sf_noBlockDelimiters}.
     * 
     * <p>For use with sequence compression API: {@link #ZSTD_compressSequences compressSequences}.</p>
     * 
     * <p>Designates whether or not the given array of {@code ZSTD_Sequence} contains block delimiters and last literals, which are defined as sequences with
     * {@code offset == 0} and {@code matchLength == 0}. See the definition of {@code ZSTD_Sequence} for more specifics.</p>
     */
    public static final int ZSTD_c_blockDelimiters = ZSTD_c_experimentalParam11;

    /**
     * Default is {@code 0 == disabled}. Set to 1 to enable sequence validation.
     * 
     * <p>For use with sequence compression API: {@link #ZSTD_compressSequences compressSequences}. Designates whether or not we validate sequences provided to
     * {@code ZSTD_compressSequences()} during function execution.</p>
     * 
     * <p>Without validation, providing a sequence that does not conform to the zstd spec will cause undefined behavior, and may produce a corrupted block.</p>
     * 
     * <p>With validation enabled, a if sequence is invalid (see {@code doc/zstd_compression_format.md} for specifics regarding
     * {@code offset}/{@code matchlength} requirements) then the function will bail out and return an error.</p>
     */
    public static final int ZSTD_c_validateSequences = ZSTD_c_experimentalParam12;

    /**
     * Controlled with {@code ZSTD_paramSwitch_e} enum.
     * 
     * <ul>
     * <li>Default is {@link #ZSTD_ps_auto ps_auto}.</li>
     * <li>Set to {@link #ZSTD_ps_disable ps_disable} to never use block splitter.</li>
     * <li>Set to {@link #ZSTD_ps_enable ps_enable} to always use block splitter.</li>
     * </ul>
     * 
     * <p>By default, in {@code ZSTD_ps_auto}, the library will decide at runtime whether to use block splitting based on the compression parameters.</p>
     */
    public static final int ZSTD_c_useBlockSplitter = ZSTD_c_experimentalParam13;

    /**
     * Controlled with {@code ZSTD_paramSwitch_e} enum.
     * 
     * <ul>
     * <li>Default is {@link #ZSTD_ps_auto ps_auto}.</li>
     * <li>Set to {@link #ZSTD_ps_disable ps_disable} to never use row-based matchfinder.</li>
     * <li>Set to {@link #ZSTD_ps_enable ps_enable} to force usage of row-based matchfinder.</li>
     * </ul>
     * 
     * <p>By default, in {@code ZSTD_ps_auto}, the library will decide at runtime whether to use the row-based matchfinder based on support for SIMD instructions
     * and the window log. Note that this only pertains to compression strategies: {@code greedy}, {@code lazy}, and {@code lazy2}.</p>
     */
    public static final int ZSTD_c_useRowMatchFinder = ZSTD_c_experimentalParam14;

    /**
     * Default is {@code 0 == disabled}. Set to 1 to enable.
     * 
     * <p>Zstd produces different results for prefix compression when the prefix is directly adjacent to the data about to be compressed vs. when it isn't. This
     * is because zstd detects that the two buffers are contiguous and it can use a more efficient match finding algorithm. However, this produces different
     * results than when the two buffers are non-contiguous. This flag forces zstd to always load the prefix in non-contiguous mode, even if it happens to be
     * adjacent to the data, to guarantee determinism.</p>
     * 
     * <p>If you really care about determinism when using a dictionary or prefix, like when doing delta compression, you should select this option. It comes at a
     * speed penalty of about ~2.5% if the dictionary and data happened to be contiguous, and is free if they weren't contiguous. We don't expect that
     * intentionally making the dictionary and data contiguous will be worth the cost to {@code memcpy()} the data.</p>
     */
    public static final int ZSTD_c_deterministicRefPrefix = ZSTD_c_experimentalParam15;

    /**
     * Experimental parameter.
     * 
     * <p>Allows selection between {@code ZSTD_format_e} input compression formats.</p>
     */
    public static final int ZSTD_d_format = ZSTD_d_experimentalParam1;

    /**
     * Experimental parameter. Default is 0 == disabled. Set to 1 to enable.
     * 
     * <p>Tells the decompressor that the {@code ZSTD_outBuffer} will ALWAYS be the same between calls, except for the modifications that zstd makes to
     * {@code pos} (the caller must not modify {@code pos}). This is checked by the decompressor, and decompression will fail if it ever changes. Therefore
     * the {@code ZSTD_outBuffer} MUST be large enough to fit the entire decompressed frame. This will be checked when the frame content size is known. The
     * data in the {@code ZSTD_outBuffer} in the range {@code [dst, dst + pos)} MUST not be modified during decompression or you will get data corruption.</p>
     * 
     * <p>When this flags is enabled zstd won't allocate an output buffer, because it can write directly to the {@code ZSTD_outBuffer}, but it will still
     * allocate an input buffer large enough to fit any compressed block. This will also avoid the {@code memcpy()} from the internal output buffer to the
     * {@code ZSTD_outBuffer}. If you need to avoid the input buffer allocation use the buffer-less streaming API.</p>
     * 
     * <p>NOTE: So long as the {@code ZSTD_outBuffer} always points to valid memory, using this flag is ALWAYS memory safe, and will never access out-of-bounds
     * memory. However, decompression WILL fail if you violate the preconditions.</p>
     * 
     * <p>WARNING: The data in the {@code ZSTD_outBuffer} in the range {@code [dst, dst + pos)} MUST not be modified during decompression or you will get data
     * corruption. This is because zstd needs to reference data in the {@code ZSTD_outBuffer} to regenerate matches. Normally zstd maintains its own buffer
     * for this purpose, but passing this flag tells zstd to use the user provided buffer.</p>
     */
    public static final int ZSTD_d_stableOutBuffer = ZSTD_d_experimentalParam2;

    /**
     * Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable
     * 
     * <p>Tells the decompressor to skip checksum validation during decompression, regardless of whether checksumming was specified during compression. This
     * offers some slight performance benefits, and may be useful for debugging. Param has values of type {@code ZSTD_forceIgnoreChecksum_e}.</p>
     */
    public static final int ZSTD_d_forceIgnoreChecksum = ZSTD_d_experimentalParam3;

    /**
     * Experimental parameter. Default is {@code 0 == disabled}. Set to 1 to enable
     * 
     * <p>If enabled and {@code dctx} is allocated on the heap, then additional memory will be allocated to store references to multiple {@code ZSTD_DDict}. That
     * is, multiple calls of {@link Zstd#ZSTD_DCtx_refDDict DCtx_refDDict} using a given {@code ZSTD_DCtx}, rather than overwriting the previous {@code DDict} reference, will instead store all
     * references. At decompression time, the appropriate {@code dictID} is selected from the set of {@code DDicts} based on the {@code dictID} in the frame.</p>
     * 
     * <p>Usage is simply calling {@code ZSTD_DCtx_refDDict()} on multiple dict buffers.</p>
     * 
     * <p>Param has values of byte {@code ZSTD_refMultipleDDicts_e}.</p>
     * 
     * <p>WARNING: Enabling this parameter and calling {@code ZSTD_DCtx_refDDict()}, will trigger memory allocation for the hash table. {@link Zstd#ZSTD_freeDCtx freeDCtx} also frees
     * this memory. Memory is allocated as per {@code ZSTD_DCtx::customMem}.</p>
     * 
     * <p>Although this function allocates memory for the table, the user is still responsible for memory management of the underlying {@code ZSTD_DDict}
     * themselves.</p>
     */
    public static final int ZSTD_d_refMultipleDDicts = ZSTD_d_experimentalParam4;

    /**
     * {@code ZSTD_literalCompressionMode_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_lcm_auto lcm_auto} - 
     * Automatically determine the compression mode based on the compression level.
     * 
     * <p>Negative compression levels will be uncompressed, and positive compression levels will be compressed.</p>
     * </li>
     * <li>{@link #ZSTD_lcm_huffman lcm_huffman} - Always attempt Huffman compression. Uncompressed literals will still be emitted if Huffman compression is not profitable.</li>
     * <li>{@link #ZSTD_lcm_uncompressed lcm_uncompressed} - Always emit uncompressed literals.</li>
     * </ul>
     */
    public static final int
        ZSTD_lcm_auto         = 0,
        ZSTD_lcm_huffman      = 1,
        ZSTD_lcm_uncompressed = 2;

    /**
     * {@code ZSTD_paramSwitch_e}
     * 
     * <p>This enum controls features which are conditionally beneficial. Zstd typically will make a final decision on whether or not to enable the feature
     * ({@code ZSTD_ps_auto}), but setting the switch to {@code ZSTD_ps_enable} or {@code ZSTD_ps_disable} allow for a force enable/disable the feature.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_ps_auto ps_auto} - Let the library automatically determine whether the feature shall be enabled.</li>
     * <li>{@link #ZSTD_ps_enable ps_enable} - Force-enable the feature.</li>
     * <li>{@link #ZSTD_ps_disable ps_disable} - Do not use the feature.</li>
     * </ul>
     */
    public static final int
        ZSTD_ps_auto    = 0,
        ZSTD_ps_enable  = 1,
        ZSTD_ps_disable = 2;

    /**
     * {@code ZSTD_sequenceFormat_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_sf_noBlockDelimiters sf_noBlockDelimiters} - Representation of {@code ZSTD_Sequence} has no block delimiters, sequences only.</li>
     * <li>{@link #ZSTD_sf_explicitBlockDelimiters sf_explicitBlockDelimiters} - Representation of {@code ZSTD_Sequence} contains explicit block delimiters.</li>
     * </ul>
     */
    public static final int
        ZSTD_sf_noBlockDelimiters       = 0,
        ZSTD_sf_explicitBlockDelimiters = 1;

    protected ZstdX() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_findDecompressedSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_findDecompressedSize findDecompressedSize}
     *
     * @param srcSize must be the <em>exact</em> size of this series (i.e. there should be a frame boundary exactly at {@code srcSize} bytes after {@code src + srcSize})
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
     * @param src should point to the start of a series of ZSTD encoded and/or skippable frames
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

    // --- [ ZSTD_decompressBound ] ---

    /**
     * Unsafe version of: {@link #ZSTD_decompressBound decompressBound}
     *
     * @param srcSize must be the <em>exact</em> size of this series (i.e. there should be a frame boundary at {@code src + srcSize})
     */
    public static native long nZSTD_decompressBound(long src, long srcSize);

    /**
     * Note 1: an error can occur if {@code src} contains an invalid or incorrectly formatted frame.
     * 
     * <p>Note 2: the upper-bound is exact when the decompressed size field is available in every ZSTD encoded frame of {@code src}. In this case,
     * {@link #ZSTD_findDecompressedSize findDecompressedSize} and {@code ZSTD_decompressBound} return the same value.</p>
     * 
     * <p>Note 3: when the decompressed size field isn't available, the upper-bound for that frame is calculated by:
     * {@code upper-bound = # blocks * min(128 KB, Window_Size)}</p>
     *
     * @param src should point to the start of a series of ZSTD encoded and/or skippable frames
     *
     * @return upper-bound for the decompressed size of all data in all successive frames, or {@link Zstd#ZSTD_CONTENTSIZE_ERROR CONTENTSIZE_ERROR} if an error occurred
     */
    @NativeType("unsigned long long")
    public static long ZSTD_decompressBound(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_decompressBound(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_frameHeaderSize ] ---

    /**
     * Unsafe version of: {@link #ZSTD_frameHeaderSize frameHeaderSize}
     *
     * @param srcSize must be &ge; {@link #ZSTD_FRAMEHEADERSIZE_PREFIX}
     */
    public static native long nZSTD_frameHeaderSize(long src, long srcSize);

    /** @return : size of the Frame Header, or an error code (if srcSize is too small) */
    @NativeType("size_t")
    public static long ZSTD_frameHeaderSize(@NativeType("void const *") ByteBuffer src) {
        return nZSTD_frameHeaderSize(memAddress(src), src.remaining());
    }

    // --- [ ZSTD_generateSequences ] ---

    /** Unsafe version of: {@link #ZSTD_generateSequences generateSequences} */
    public static native long nZSTD_generateSequences(long zc, long outSeqs, long outSeqsSize, long src, long srcSize);

    /**
     * Generate sequences using {@link Zstd#ZSTD_compress2 compress2}, given a source buffer.
     * 
     * <p>Each block will end with a dummy sequence with {@code offset == 0}, {@code matchLength == 0}, and {@code litLength == length} of last literals.
     * {@code litLength} may be {@code == 0}, and if so, then the sequence of {@code (of: 0 ml: 0 ll: 0)} simply acts as a block delimiter.</p>
     * 
     * <p>{@code zc} can be used to insert custom compression params. This function invokes {@link Zstd#ZSTD_compress2 compress2}</p>
     * 
     * <p>The output of this function can be fed into {@link #ZSTD_compressSequences compressSequences} with {@code CCtx} setting of {@link #ZSTD_c_blockDelimiters c_blockDelimiters} as {@link #ZSTD_sf_explicitBlockDelimiters sf_explicitBlockDelimiters}.</p>
     *
     * @return number of sequences generated
     */
    @NativeType("size_t")
    public static long ZSTD_generateSequences(@NativeType("ZSTD_CCtx *") long zc, @NativeType("ZSTD_Sequence *") ZSTDSequence.Buffer outSeqs, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(zc);
        }
        return nZSTD_generateSequences(zc, outSeqs.address(), outSeqs.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_mergeBlockDelimiters ] ---

    /** Unsafe version of: {@link #ZSTD_mergeBlockDelimiters mergeBlockDelimiters} */
    public static native long nZSTD_mergeBlockDelimiters(long sequences, long seqsSize);

    /**
     * Given an array of {@code ZSTD_Sequence}, remove all sequences that represent block delimiters/last literals by merging them into into the literals of
     * the next sequence.
     * 
     * <p>As such, the final generated result has no explicit representation of block boundaries, and the final last literals segment is not represented in the
     * sequences.</p>
     * 
     * <p>The output of this function can be fed into {@link #ZSTD_compressSequences compressSequences} with {@code CCtx} setting of {@link #ZSTD_c_blockDelimiters c_blockDelimiters} as {@link #ZSTD_sf_noBlockDelimiters sf_noBlockDelimiters}.</p>
     *
     * @return number of sequences left after merging
     */
    @NativeType("size_t")
    public static long ZSTD_mergeBlockDelimiters(@NativeType("ZSTD_Sequence *") ZSTDSequence.Buffer sequences) {
        return nZSTD_mergeBlockDelimiters(sequences.address(), sequences.remaining());
    }

    // --- [ ZSTD_compressSequences ] ---

    /** Unsafe version of: {@link #ZSTD_compressSequences compressSequences} */
    public static native long nZSTD_compressSequences(long cctx, long dst, long dstSize, long inSeqs, long inSeqsSize, long src, long srcSize);

    /**
     * Compress an array of {@code ZSTD_Sequence}, generated from the original source buffer, into {@code dst}.
     * 
     * <p>If a dictionary is included, then the {@code cctx} should reference the {@code dict}. (see: {@link Zstd#ZSTD_CCtx_refCDict CCtx_refCDict}, {@link Zstd#ZSTD_CCtx_loadDictionary CCtx_loadDictionary}, etc.) The entire
     * source is compressed into a single frame.</p>
     * 
     * <p>The compression behavior changes based on {@code cctx} params. In particular:</p>
     * 
     * <ul>
     * <li>If {@code ZSTD_c_blockDelimiters == ZSTD_sf_noBlockDelimiters}, the array of {@code ZSTD_Sequence} is expected to contain no block delimiters
     * (defined in {@code ZSTD_Sequence}). Block boundaries are roughly determined based on the block size derived from the {@code cctx}, and sequences
     * may be split. This is the default setting.</li>
     * <li>If {@code ZSTD_c_blockDelimiters == ZSTD_sf_explicitBlockDelimiters}, the array of {@code ZSTD_Sequence} is expected to contain block delimiters
     * (defined in {@code ZSTD_Sequence}). Behavior is undefined if no block delimiters are provided.</li>
     * <li>If {@code ZSTD_c_validateSequences == 0}, this function will blindly accept the sequences provided. Invalid sequences cause undefined behavior. If
     * {@code ZSTD_c_validateSequences == 1}, then if sequence is invalid (see {@code doc/zstd_compression_format.md} for specifics regarding
     * offset/matchlength requirements) then the function will bail out and return an error.</li>
     * </ul>
     * 
     * <p>In addition to the two adjustable experimental params, there are other important cctx params.</p>
     * 
     * <ul>
     * <li>{@link Zstd#ZSTD_c_minMatch c_minMatch} MUST be set as less than or equal to the smallest match generated by the match finder. It has a minimum value of {@link #ZSTD_MINMATCH_MIN MINMATCH_MIN}.</li>
     * <li>{@link Zstd#ZSTD_c_compressionLevel c_compressionLevel} accordingly adjusts the strength of the entropy coder, as it would in typical compression.</li>
     * <li>{@link Zstd#ZSTD_c_windowLog c_windowLog} affects offset validation: this function will return an error at higher debug levels if a provided offset is larger than what the spec
     * allows for a given window log and dictionary (if present). See: {@code doc/zstd_compression_format.md}</li>
     * </ul>
     * 
     * <p>Note: Repcodes are, as of now, always re-calculated within this function, so {@code ZSTD_Sequence::rep} is unused.</p>
     * 
     * <p>Note 2: Once we integrate ability to ingest repcodes, the explicit block delims mode must respect those repcodes exactly, and cannot emit an RLE block
     * that disagrees with the {@code repcode} history.</p>
     *
     * @return final compressed size or a ZSTD error.
     */
    @NativeType("size_t")
    public static long ZSTD_compressSequences(@NativeType("ZSTD_CCtx * const") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("ZSTD_Sequence const *") ZSTDSequence.Buffer inSeqs, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_compressSequences(cctx, memAddress(dst), dst.remaining(), inSeqs.address(), inSeqs.remaining(), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_writeSkippableFrame ] ---

    /** Unsafe version of: {@link #ZSTD_writeSkippableFrame writeSkippableFrame} */
    public static native long nZSTD_writeSkippableFrame(long dst, long dstCapacity, long src, long srcSize, int magicVariant);

    /**
     * Generates a zstd skippable frame containing data given by {@code src}, and writes it to {@code dst} buffer.
     * 
     * <p>Skippable frames begin with a a 4-byte magic number. There are 16 possible choices of magic number, ranging from {@link Zstd#ZSTD_MAGIC_SKIPPABLE_START MAGIC_SKIPPABLE_START} to
     * {@code ZSTD_MAGIC_SKIPPABLE_START+15}. As such, the parameter {@code magicVariant} controls the exact skippable frame magic number variant used, so the
     * magic number used will be {@code ZSTD_MAGIC_SKIPPABLE_START + magicVariant}.</p>
     * 
     * <p>Returns an error if destination buffer is not large enough, if the source size is not representable with a 4-byte unsigned int, or if the parameter
     * {@code magicVariant} is greater than 15 (and therefore invalid).</p>
     *
     * @return number of bytes written or a ZSTD error
     */
    @NativeType("size_t")
    public static long ZSTD_writeSkippableFrame(@NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("unsigned") int magicVariant) {
        return nZSTD_writeSkippableFrame(memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), magicVariant);
    }

    // --- [ ZSTD_readSkippableFrame ] ---

    /** Unsafe version of: {@link #ZSTD_readSkippableFrame readSkippableFrame} */
    public static native long nZSTD_readSkippableFrame(long dst, long dstCapacity, long magicVariant, long src, long srcSize);

    /**
     * Retrieves a zstd skippable frame containing data given by {@code src}, and writes it to {@code dst} buffer.
     * 
     * <p>The parameter {@code magicVariant} will receive the {@code magicVariant} that was supplied when the frame was written, i.e.
     * {@code magicNumber - ZSTD_MAGIC_SKIPPABLE_START}. This can be {@code NULL} if the caller is not interested in the {@code magicVariant}.</p>
     * 
     * <p>Returns an error if destination buffer is not large enough, or if the frame is not skippable.</p>
     *
     * @return number of bytes written or a ZSTD error
     */
    @NativeType("size_t")
    public static long ZSTD_readSkippableFrame(@NativeType("void *") ByteBuffer dst, @Nullable @NativeType("unsigned *") IntBuffer magicVariant, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            checkSafe(magicVariant, 1);
        }
        return nZSTD_readSkippableFrame(memAddress(dst), dst.remaining(), memAddressSafe(magicVariant), memAddress(src), src.remaining());
    }

    // --- [ ZSTD_isSkippableFrame ] ---

    /** Unsafe version of: {@link #ZSTD_isSkippableFrame isSkippableFrame} */
    public static native int nZSTD_isSkippableFrame(long buffer, long size);

    /** Tells if the content of {@code buffer} starts with a valid Frame Identifier for a skippable frame. */
    @NativeType("unsigned")
    public static boolean ZSTD_isSkippableFrame(@NativeType("void const *") ByteBuffer buffer) {
        return nZSTD_isSkippableFrame(memAddress(buffer), buffer.remaining()) != 0;
    }

    // --- [ ZSTD_estimateCCtxSize ] ---

    /**
     * Estimages memory usage of a future {@code CCtx}, before its creation.
     * 
     * <p>{@code ZSTD_estimateCCtxSize()} will provide a memory budget large enough for any compression level up to selected one.</p>
     * 
     * <p>Note: Unlike {@code ZSTD_estimateCStreamSize*()}, this estimate does not include space for a window buffer. Therefore, the estimation is only
     * guaranteed for single-shot compressions, not streaming.</p>
     * 
     * <p>The estimate will assume the input may be arbitrarily large, which is the worst case.</p>
     * 
     * <p>When {@code srcSize} can be bound by a known and rather "small" value, this fact can be used to provide a tighter estimation because the CCtx
     * compression context will need less memory. This tighter estimation can be provided by more advanced functions {@link #ZSTD_estimateCCtxSize_usingCParams estimateCCtxSize_usingCParams}, which
     * can be used in tandem with {@link #ZSTD_getCParams getCParams}, and {@link #ZSTD_estimateCCtxSize_usingCCtxParams estimateCCtxSize_usingCCtxParams}, which can be used in tandem with {@link #ZSTD_CCtxParams_setParameter CCtxParams_setParameter}. Both
     * can be used to estimate memory using custom compression parameters and arbitrary {@code srcSize} limits.</p>
     * 
     * <p>Note 2: only single-threaded compression is supported. {@link #ZSTD_estimateCCtxSize_usingCCtxParams estimateCCtxSize_usingCCtxParams} will return an error code if {@link Zstd#ZSTD_c_nbWorkers c_nbWorkers} is &ge; 1.</p>
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
     * {@link #ZSTD_CCtxParams_setParameter CCtxParams_setParameter}. Only single-threaded compression is supported.</p>
     * 
     * <p>This function will return an error code if {@link Zstd#ZSTD_c_nbWorkers c_nbWorkers} is &ge; 1.</p>
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

    // --- [ ZSTD_createThreadPool ] ---

    /**
     * Creates a new thread pool with a given number of threads.
     * 
     * <p>Note that the lifetime of such pool must exist while being used.</p>
     */
    @NativeType("ZSTD_threadPool *")
    public static native long ZSTD_createThreadPool(@NativeType("size_t") long numThreads);

    // --- [ ZSTD_freeThreadPool ] ---

    /**
     * Frees a thread pool.
     *
     * @param pool accepts {@code NULL} pointer
     */
    public static native void ZSTD_freeThreadPool(@NativeType("ZSTD_threadPool *") long pool);

    // --- [ ZSTD_CCtx_refThreadPool ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_refThreadPool CCtx_refThreadPool} */
    public static native long nZSTD_CCtx_refThreadPool(long cctx, long pool);

    /** Assigns a thread pool to a context (use {@code NULL} argument value to use an internal thread pool). */
    @NativeType("size_t")
    public static long ZSTD_CCtx_refThreadPool(@NativeType("ZSTD_CCtx *") long cctx, @NativeType("ZSTD_threadPool *") long pool) {
        if (CHECKS) {
            check(cctx);
        }
        return nZSTD_CCtx_refThreadPool(cctx, pool);
    }

    // --- [ ZSTD_createCDict_advanced2 ] ---

    /** Unsafe version of: {@link #ZSTD_createCDict_advanced2 createCDict_advanced2} */
    public static native long nZSTD_createCDict_advanced2(long dict, long dictSize, int dictLoadMethod, int dictContentType, long cctxParams, long customMem);

    /**
     * @param dictLoadMethod  one of:<br><table><tr><td>{@link #ZSTD_dlm_byCopy dlm_byCopy}</td><td>{@link #ZSTD_dlm_byRef dlm_byRef}</td></tr></table>
     * @param dictContentType one of:<br><table><tr><td>{@link #ZSTD_dct_auto dct_auto}</td><td>{@link #ZSTD_dct_rawContent dct_rawContent}</td><td>{@link #ZSTD_dct_fullDict dct_fullDict}</td></tr></table>
     */
    @NativeType("ZSTD_CDict *")
    public static long ZSTD_createCDict_advanced2(@NativeType("void const *") ByteBuffer dict, @NativeType("ZSTD_dictLoadMethod_e") int dictLoadMethod, @NativeType("ZSTD_dictContentType_e") int dictContentType, @NativeType("ZSTD_CCtx_params const *") long cctxParams, @NativeType("ZSTD_customMem") ZSTDCustomMem customMem) {
        if (CHECKS) {
            check(cctxParams);
            ZSTDCustomMem.validate(customMem.address());
        }
        return nZSTD_createCDict_advanced2(memAddress(dict), dict.remaining(), dictLoadMethod, dictContentType, cctxParams, customMem.address());
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
     * 
     * <p>Note: equivalent to {@link #ZSTD_createCDict_advanced createCDict_advanced}, with {@code dictLoadMethod==ZSTD_dlm_byRef}.</p>
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

    /**
     * Ensures param values remain within authorized range.
     *
     * @return 0 on success, or an error code (can be checked with {@link Zstd#ZSTD_isError isError})
     */
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

    // --- [ ZSTD_CCtx_loadDictionary_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_CCtx_loadDictionary_byReference CCtx_loadDictionary_byReference} */
    public static native long nZSTD_CCtx_loadDictionary_byReference(long cctx, long dict, long dictSize);

    /**
     * Same as {@link Zstd#ZSTD_CCtx_loadDictionary CCtx_loadDictionary}, but dictionary content is referenced, instead of being copied into {@code CCtx}.
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
     * Same as {@link Zstd#ZSTD_CCtx_loadDictionary CCtx_loadDictionary}, but gives finer control over how to load the dictionary (by copy ? by reference ?) and how to interpret it
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
     * Same as {@link Zstd#ZSTD_CCtx_refPrefix CCtx_refPrefix}, but gives finer control over how to interpret prefix content (automatic ? force raw mode (default) ? full mode only ?).
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
     * @param param one of:<br><table><tr><td>{@link Zstd#ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link Zstd#ZSTD_c_windowLog c_windowLog}</td><td>{@link Zstd#ZSTD_c_hashLog c_hashLog}</td><td>{@link Zstd#ZSTD_c_chainLog c_chainLog}</td></tr><tr><td>{@link Zstd#ZSTD_c_searchLog c_searchLog}</td><td>{@link Zstd#ZSTD_c_minMatch c_minMatch}</td><td>{@link Zstd#ZSTD_c_targetLength c_targetLength}</td><td>{@link Zstd#ZSTD_c_strategy c_strategy}</td></tr><tr><td>{@link Zstd#ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link Zstd#ZSTD_c_ldmHashLog c_ldmHashLog}</td><td>{@link Zstd#ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link Zstd#ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td></tr><tr><td>{@link Zstd#ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link Zstd#ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link Zstd#ZSTD_c_checksumFlag c_checksumFlag}</td><td>{@link Zstd#ZSTD_c_dictIDFlag c_dictIDFlag}</td></tr><tr><td>{@link Zstd#ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link Zstd#ZSTD_c_jobSize c_jobSize}</td><td>{@link Zstd#ZSTD_c_overlapLog c_overlapLog}</td><td>{@link Zstd#ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link Zstd#ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link Zstd#ZSTD_c_experimentalParam4 c_experimentalParam4}</td><td>{@link Zstd#ZSTD_c_experimentalParam5 c_experimentalParam5}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam6 c_experimentalParam6}</td><td>{@link Zstd#ZSTD_c_experimentalParam7 c_experimentalParam7}</td><td>{@link Zstd#ZSTD_c_experimentalParam8 c_experimentalParam8}</td><td>{@link Zstd#ZSTD_c_experimentalParam9 c_experimentalParam9}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam10 c_experimentalParam10}</td><td>{@link Zstd#ZSTD_c_experimentalParam11 c_experimentalParam11}</td><td>{@link Zstd#ZSTD_c_experimentalParam12 c_experimentalParam12}</td><td>{@link Zstd#ZSTD_c_experimentalParam13 c_experimentalParam13}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam14 c_experimentalParam14}</td><td>{@link Zstd#ZSTD_c_experimentalParam15 c_experimentalParam15}</td><td>{@link #ZSTD_c_rsyncable c_rsyncable}</td><td>{@link #ZSTD_c_format c_format}</td></tr><tr><td>{@link #ZSTD_c_forceMaxWindow c_forceMaxWindow}</td><td>{@link #ZSTD_c_forceAttachDict c_forceAttachDict}</td><td>{@link #ZSTD_c_literalCompressionMode c_literalCompressionMode}</td><td>{@link #ZSTD_c_targetCBlockSize c_targetCBlockSize}</td></tr><tr><td>{@link #ZSTD_c_srcSizeHint c_srcSizeHint}</td><td>{@link #ZSTD_c_enableDedicatedDictSearch c_enableDedicatedDictSearch}</td><td>{@link #ZSTD_c_stableInBuffer c_stableInBuffer}</td><td>{@link #ZSTD_c_stableOutBuffer c_stableOutBuffer}</td></tr><tr><td>{@link #ZSTD_c_blockDelimiters c_blockDelimiters}</td><td>{@link #ZSTD_c_validateSequences c_validateSequences}</td><td>{@link #ZSTD_c_useBlockSplitter c_useBlockSplitter}</td><td>{@link #ZSTD_c_useRowMatchFinder c_useRowMatchFinder}</td></tr><tr><td>{@link #ZSTD_c_deterministicRefPrefix c_deterministicRefPrefix}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtx_getParameter(@NativeType("ZSTD_CCtx const *") long cctx, @NativeType("ZSTD_cParameter") int param, @NativeType("int *") IntBuffer value) {
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

    /** @param params accepts {@code NULL} pointer */
    @NativeType("size_t")
    public static native long ZSTD_freeCCtxParams(@NativeType("ZSTD_CCtx_params *") long params);

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

    // --- [ ZSTD_CCtxParams_setParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParams_setParameter CCtxParams_setParameter} */
    public static native long nZSTD_CCtxParams_setParameter(long params, int param, int value);

    /**
     * Similar to {@link Zstd#ZSTD_CCtx_setParameter CCtx_setParameter}. Sets one compression parameter, selected by {@code enum ZSTD_cParameter}.
     * 
     * <p>Parameters must be applied to a {@code ZSTD_CCtx} using {@link #ZSTD_CCtx_setParametersUsingCCtxParams CCtx_setParametersUsingCCtxParams}.</p>
     *
     * @param param one of:<br><table><tr><td>{@link Zstd#ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link Zstd#ZSTD_c_windowLog c_windowLog}</td><td>{@link Zstd#ZSTD_c_hashLog c_hashLog}</td><td>{@link Zstd#ZSTD_c_chainLog c_chainLog}</td></tr><tr><td>{@link Zstd#ZSTD_c_searchLog c_searchLog}</td><td>{@link Zstd#ZSTD_c_minMatch c_minMatch}</td><td>{@link Zstd#ZSTD_c_targetLength c_targetLength}</td><td>{@link Zstd#ZSTD_c_strategy c_strategy}</td></tr><tr><td>{@link Zstd#ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link Zstd#ZSTD_c_ldmHashLog c_ldmHashLog}</td><td>{@link Zstd#ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link Zstd#ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td></tr><tr><td>{@link Zstd#ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link Zstd#ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link Zstd#ZSTD_c_checksumFlag c_checksumFlag}</td><td>{@link Zstd#ZSTD_c_dictIDFlag c_dictIDFlag}</td></tr><tr><td>{@link Zstd#ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link Zstd#ZSTD_c_jobSize c_jobSize}</td><td>{@link Zstd#ZSTD_c_overlapLog c_overlapLog}</td><td>{@link Zstd#ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link Zstd#ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link Zstd#ZSTD_c_experimentalParam4 c_experimentalParam4}</td><td>{@link Zstd#ZSTD_c_experimentalParam5 c_experimentalParam5}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam6 c_experimentalParam6}</td><td>{@link Zstd#ZSTD_c_experimentalParam7 c_experimentalParam7}</td><td>{@link Zstd#ZSTD_c_experimentalParam8 c_experimentalParam8}</td><td>{@link Zstd#ZSTD_c_experimentalParam9 c_experimentalParam9}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam10 c_experimentalParam10}</td><td>{@link Zstd#ZSTD_c_experimentalParam11 c_experimentalParam11}</td><td>{@link Zstd#ZSTD_c_experimentalParam12 c_experimentalParam12}</td><td>{@link Zstd#ZSTD_c_experimentalParam13 c_experimentalParam13}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam14 c_experimentalParam14}</td><td>{@link Zstd#ZSTD_c_experimentalParam15 c_experimentalParam15}</td><td>{@link #ZSTD_c_rsyncable c_rsyncable}</td><td>{@link #ZSTD_c_format c_format}</td></tr><tr><td>{@link #ZSTD_c_forceMaxWindow c_forceMaxWindow}</td><td>{@link #ZSTD_c_forceAttachDict c_forceAttachDict}</td><td>{@link #ZSTD_c_literalCompressionMode c_literalCompressionMode}</td><td>{@link #ZSTD_c_targetCBlockSize c_targetCBlockSize}</td></tr><tr><td>{@link #ZSTD_c_srcSizeHint c_srcSizeHint}</td><td>{@link #ZSTD_c_enableDedicatedDictSearch c_enableDedicatedDictSearch}</td><td>{@link #ZSTD_c_stableInBuffer c_stableInBuffer}</td><td>{@link #ZSTD_c_stableOutBuffer c_stableOutBuffer}</td></tr><tr><td>{@link #ZSTD_c_blockDelimiters c_blockDelimiters}</td><td>{@link #ZSTD_c_validateSequences c_validateSequences}</td><td>{@link #ZSTD_c_useBlockSplitter c_useBlockSplitter}</td><td>{@link #ZSTD_c_useRowMatchFinder c_useRowMatchFinder}</td></tr><tr><td>{@link #ZSTD_c_deterministicRefPrefix c_deterministicRefPrefix}</td></tr></table>
     *
     * @return a code representing success or failure (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_setParameter(@NativeType("ZSTD_CCtx_params *") long params, @NativeType("ZSTD_cParameter") int param, int value) {
        if (CHECKS) {
            check(params);
        }
        return nZSTD_CCtxParams_setParameter(params, param, value);
    }

    // --- [ ZSTD_CCtxParams_getParameter ] ---

    /** Unsafe version of: {@link #ZSTD_CCtxParams_getParameter CCtxParams_getParameter} */
    public static native long nZSTD_CCtxParams_getParameter(long params, int param, long value);

    /**
     * Similar to {@link #ZSTD_CCtx_getParameter CCtx_getParameter}. Gets the requested value of one compression parameter, selected by {@code enum ZSTD_cParameter}.
     *
     * @param param one of:<br><table><tr><td>{@link Zstd#ZSTD_c_compressionLevel c_compressionLevel}</td><td>{@link Zstd#ZSTD_c_windowLog c_windowLog}</td><td>{@link Zstd#ZSTD_c_hashLog c_hashLog}</td><td>{@link Zstd#ZSTD_c_chainLog c_chainLog}</td></tr><tr><td>{@link Zstd#ZSTD_c_searchLog c_searchLog}</td><td>{@link Zstd#ZSTD_c_minMatch c_minMatch}</td><td>{@link Zstd#ZSTD_c_targetLength c_targetLength}</td><td>{@link Zstd#ZSTD_c_strategy c_strategy}</td></tr><tr><td>{@link Zstd#ZSTD_c_enableLongDistanceMatching c_enableLongDistanceMatching}</td><td>{@link Zstd#ZSTD_c_ldmHashLog c_ldmHashLog}</td><td>{@link Zstd#ZSTD_c_ldmMinMatch c_ldmMinMatch}</td><td>{@link Zstd#ZSTD_c_ldmBucketSizeLog c_ldmBucketSizeLog}</td></tr><tr><td>{@link Zstd#ZSTD_c_ldmHashRateLog c_ldmHashRateLog}</td><td>{@link Zstd#ZSTD_c_contentSizeFlag c_contentSizeFlag}</td><td>{@link Zstd#ZSTD_c_checksumFlag c_checksumFlag}</td><td>{@link Zstd#ZSTD_c_dictIDFlag c_dictIDFlag}</td></tr><tr><td>{@link Zstd#ZSTD_c_nbWorkers c_nbWorkers}</td><td>{@link Zstd#ZSTD_c_jobSize c_jobSize}</td><td>{@link Zstd#ZSTD_c_overlapLog c_overlapLog}</td><td>{@link Zstd#ZSTD_c_experimentalParam1 c_experimentalParam1}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam2 c_experimentalParam2}</td><td>{@link Zstd#ZSTD_c_experimentalParam3 c_experimentalParam3}</td><td>{@link Zstd#ZSTD_c_experimentalParam4 c_experimentalParam4}</td><td>{@link Zstd#ZSTD_c_experimentalParam5 c_experimentalParam5}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam6 c_experimentalParam6}</td><td>{@link Zstd#ZSTD_c_experimentalParam7 c_experimentalParam7}</td><td>{@link Zstd#ZSTD_c_experimentalParam8 c_experimentalParam8}</td><td>{@link Zstd#ZSTD_c_experimentalParam9 c_experimentalParam9}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam10 c_experimentalParam10}</td><td>{@link Zstd#ZSTD_c_experimentalParam11 c_experimentalParam11}</td><td>{@link Zstd#ZSTD_c_experimentalParam12 c_experimentalParam12}</td><td>{@link Zstd#ZSTD_c_experimentalParam13 c_experimentalParam13}</td></tr><tr><td>{@link Zstd#ZSTD_c_experimentalParam14 c_experimentalParam14}</td><td>{@link Zstd#ZSTD_c_experimentalParam15 c_experimentalParam15}</td><td>{@link #ZSTD_c_rsyncable c_rsyncable}</td><td>{@link #ZSTD_c_format c_format}</td></tr><tr><td>{@link #ZSTD_c_forceMaxWindow c_forceMaxWindow}</td><td>{@link #ZSTD_c_forceAttachDict c_forceAttachDict}</td><td>{@link #ZSTD_c_literalCompressionMode c_literalCompressionMode}</td><td>{@link #ZSTD_c_targetCBlockSize c_targetCBlockSize}</td></tr><tr><td>{@link #ZSTD_c_srcSizeHint c_srcSizeHint}</td><td>{@link #ZSTD_c_enableDedicatedDictSearch c_enableDedicatedDictSearch}</td><td>{@link #ZSTD_c_stableInBuffer c_stableInBuffer}</td><td>{@link #ZSTD_c_stableOutBuffer c_stableOutBuffer}</td></tr><tr><td>{@link #ZSTD_c_blockDelimiters c_blockDelimiters}</td><td>{@link #ZSTD_c_validateSequences c_validateSequences}</td><td>{@link #ZSTD_c_useBlockSplitter c_useBlockSplitter}</td><td>{@link #ZSTD_c_useRowMatchFinder c_useRowMatchFinder}</td></tr><tr><td>{@link #ZSTD_c_deterministicRefPrefix c_deterministicRefPrefix}</td></tr></table>
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_CCtxParams_getParameter(@NativeType("ZSTD_CCtx_params const *") long params, @NativeType("ZSTD_cParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(params);
            check(value, 1);
        }
        return nZSTD_CCtxParams_getParameter(params, param, memAddress(value));
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
     * Same as {@link Zstd#ZSTD_compressStream2 compressStream2}, but using only integral types as arguments.
     * 
     * <p>This variant might be helpful for binders from dynamic languages which have troubles handling structures containing memory pointers.</p>
     *
     * @param endOp one of:<br><table><tr><td>{@link Zstd#ZSTD_e_continue e_continue}</td><td>{@link Zstd#ZSTD_e_flush e_flush}</td><td>{@link Zstd#ZSTD_e_end e_end}</td></tr></table>
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

    // --- [ ZSTD_DCtx_loadDictionary_byReference ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_loadDictionary_byReference DCtx_loadDictionary_byReference} */
    public static native long nZSTD_DCtx_loadDictionary_byReference(long dctx, long dict, long dictSize);

    /**
     * Same as {@link Zstd#ZSTD_DCtx_loadDictionary DCtx_loadDictionary}, but references {@code dict} content instead of copying it into {@code dctx}.
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
     * Same as {@link Zstd#ZSTD_DCtx_loadDictionary DCtx_loadDictionary}, but gives direct control over how to load the dictionary (by copy ? by reference ?) and how to interpret it
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
     * Same as {@link Zstd#ZSTD_DCtx_refPrefix DCtx_refPrefix}, but gives finer control over how to interpret prefix content (automatic ? force raw mode (default) ? full mode only ?).
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

    // --- [ ZSTD_DCtx_getParameter ] ---

    /** Unsafe version of: {@link #ZSTD_DCtx_getParameter DCtx_getParameter} */
    public static native long nZSTD_DCtx_getParameter(long dctx, int param, long value);

    /**
     * Gets the requested decompression parameter value, selected by enum {@code ZSTD_dParameter}, and store it into {@code int*} value.
     *
     * @return 0, or an error code (which can be tested with {@link Zstd#ZSTD_isError isError})
     */
    @NativeType("size_t")
    public static long ZSTD_DCtx_getParameter(@NativeType("ZSTD_DCtx *") long dctx, @NativeType("ZSTD_dParameter") int param, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(dctx);
            check(value, 1);
        }
        return nZSTD_DCtx_getParameter(dctx, param, memAddress(value));
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

    public static int ZSTD_FRAMEHEADERSIZE_PREFIX(int format) {
        return format == ZSTD_f_zstd1 ? 5 : 1;
    }

    public static int ZSTD_FRAMEHEADERSIZE_MIN(int format) {
        return format == ZSTD_f_zstd1 ? 6 : 2;
    }

}