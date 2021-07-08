/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the frame API of <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>.
 * 
 * <p>LZ4F is a stand-alone API to create LZ4-compressed frames conformant with specification v1.6.1. It also offers streaming capabilities. {@code lz4.h} is
 * not required when using {@code lz4frame.h}, except to get constant such as {@link LZ4#LZ4_VERSION_NUMBER VERSION_NUMBER}.</p>
 */
public class LZ4Frame {

    static { LibLZ4.initialize(); }

    /**
     * Version number.
     * 
     * <p>This number can be used to check for an incompatible API breaking change.</p>
     */
    public static final int LZ4F_VERSION = 100;

    /** Minimum header size. */
    public static final int LZ4F_HEADER_SIZE_MIN = 7;

    /** Maximum header size. */
    public static final int LZ4F_HEADER_SIZE_MAX = 19;

    /** Size in bytes of a block header in little-endian format. Highest bit indicates if block data is uncompressed. */
    public static final int LZ4F_BLOCK_HEADER_SIZE = 4;

    /** Size in bytes of a block checksum footer in little-endian format. */
    public static final int LZ4F_BLOCK_CHECKSUM_SIZE = 4;

    /** Size in bytes of the content checksum. */
    public static final int LZ4F_CONTENT_CHECKSUM_SIZE = 4;

    /**
     * {@code LZ4F_blockSizeID_t}
     * 
     * <p>The larger the block size, the (slightly) better the compression ratio, though there are diminishing returns. Larger blocks also increase memory usage
     * on both compression and decompression sides.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_default default}</li>
     * <li>{@link #LZ4F_max64KB max64KB}</li>
     * <li>{@link #LZ4F_max256KB max256KB}</li>
     * <li>{@link #LZ4F_max1MB max1MB}</li>
     * <li>{@link #LZ4F_max4MB max4MB}</li>
     * </ul>
     */
    public static final int
        LZ4F_default  = 0,
        LZ4F_max64KB  = 4,
        LZ4F_max256KB = 5,
        LZ4F_max1MB   = 6,
        LZ4F_max4MB   = 7;

    /**
     * {@code LZ4F_blockMode_t}
     * 
     * <p>Linked blocks sharply reduce inefficiencies when using small blocks, they compress better. However, some LZ4 decoders are only compatible with
     * independent blocks</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_blockLinked blockLinked}</li>
     * <li>{@link #LZ4F_blockIndependent blockIndependent}</li>
     * </ul>
     */
    public static final int
        LZ4F_blockLinked      = 0,
        LZ4F_blockIndependent = 1;

    /**
     * {@code LZ4F_contentChecksum_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_noContentChecksum noContentChecksum}</li>
     * <li>{@link #LZ4F_contentChecksumEnabled contentChecksumEnabled}</li>
     * </ul>
     */
    public static final int
        LZ4F_noContentChecksum      = 0,
        LZ4F_contentChecksumEnabled = 1;

    /**
     * {@code LZ4F_blockChecksum_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_noBlockChecksum noBlockChecksum}</li>
     * <li>{@link #LZ4F_blockChecksumEnabled blockChecksumEnabled}</li>
     * </ul>
     */
    public static final int
        LZ4F_noBlockChecksum      = 0,
        LZ4F_blockChecksumEnabled = 1;

    /**
     * {@code LZ4F_frameType_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_frame frame}</li>
     * <li>{@link #LZ4F_skippableFrame skippableFrame}</li>
     * </ul>
     */
    public static final int
        LZ4F_frame          = 0,
        LZ4F_skippableFrame = 1;

    /**
     * Error code.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_OK_NoError OK_NoError}</li>
     * <li>{@link #LZ4F_ERROR_GENERIC ERROR_GENERIC}</li>
     * <li>{@link #LZ4F_ERROR_maxBlockSize_invalid ERROR_maxBlockSize_invalid}</li>
     * <li>{@link #LZ4F_ERROR_blockMode_invalid ERROR_blockMode_invalid}</li>
     * <li>{@link #LZ4F_ERROR_contentChecksumFlag_invalid ERROR_contentChecksumFlag_invalid}</li>
     * <li>{@link #LZ4F_ERROR_compressionLevel_invalid ERROR_compressionLevel_invalid}</li>
     * <li>{@link #LZ4F_ERROR_headerVersion_wrong ERROR_headerVersion_wrong}</li>
     * <li>{@link #LZ4F_ERROR_blockChecksum_invalid ERROR_blockChecksum_invalid}</li>
     * <li>{@link #LZ4F_ERROR_reservedFlag_set ERROR_reservedFlag_set}</li>
     * <li>{@link #LZ4F_ERROR_allocation_failed ERROR_allocation_failed}</li>
     * <li>{@link #LZ4F_ERROR_srcSize_tooLarge ERROR_srcSize_tooLarge}</li>
     * <li>{@link #LZ4F_ERROR_dstMaxSize_tooSmall ERROR_dstMaxSize_tooSmall}</li>
     * <li>{@link #LZ4F_ERROR_frameHeader_incomplete ERROR_frameHeader_incomplete}</li>
     * <li>{@link #LZ4F_ERROR_frameType_unknown ERROR_frameType_unknown}</li>
     * <li>{@link #LZ4F_ERROR_frameSize_wrong ERROR_frameSize_wrong}</li>
     * <li>{@link #LZ4F_ERROR_srcPtr_wrong ERROR_srcPtr_wrong}</li>
     * <li>{@link #LZ4F_ERROR_decompressionFailed ERROR_decompressionFailed}</li>
     * <li>{@link #LZ4F_ERROR_headerChecksum_invalid ERROR_headerChecksum_invalid}</li>
     * <li>{@link #LZ4F_ERROR_contentChecksum_invalid ERROR_contentChecksum_invalid}</li>
     * <li>{@link #LZ4F_ERROR_frameDecoding_alreadyStarted ERROR_frameDecoding_alreadyStarted}</li>
     * <li>{@link #LZ4F_ERROR_maxCode ERROR_maxCode}</li>
     * </ul>
     */
    public static final int
        LZ4F_OK_NoError                         = 0,
        LZ4F_ERROR_GENERIC                      = 1,
        LZ4F_ERROR_maxBlockSize_invalid         = 2,
        LZ4F_ERROR_blockMode_invalid            = 3,
        LZ4F_ERROR_contentChecksumFlag_invalid  = 4,
        LZ4F_ERROR_compressionLevel_invalid     = 5,
        LZ4F_ERROR_headerVersion_wrong          = 6,
        LZ4F_ERROR_blockChecksum_invalid        = 7,
        LZ4F_ERROR_reservedFlag_set             = 8,
        LZ4F_ERROR_allocation_failed            = 9,
        LZ4F_ERROR_srcSize_tooLarge             = 10,
        LZ4F_ERROR_dstMaxSize_tooSmall          = 11,
        LZ4F_ERROR_frameHeader_incomplete       = 12,
        LZ4F_ERROR_frameType_unknown            = 13,
        LZ4F_ERROR_frameSize_wrong              = 14,
        LZ4F_ERROR_srcPtr_wrong                 = 15,
        LZ4F_ERROR_decompressionFailed          = 16,
        LZ4F_ERROR_headerChecksum_invalid       = 17,
        LZ4F_ERROR_contentChecksum_invalid      = 18,
        LZ4F_ERROR_frameDecoding_alreadyStarted = 19,
        LZ4F_ERROR_maxCode                      = 20;

    protected LZ4Frame() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4F_isError ] ---

    /** Unsafe version of: {@link #LZ4F_isError isError} */
    public static native int nLZ4F_isError(long code);

    /** Tells when a function result is an error code. */
    @NativeType("unsigned")
    public static boolean LZ4F_isError(@NativeType("LZ4F_errorCode_t") long code) {
        return nLZ4F_isError(code) != 0;
    }

    // --- [ LZ4F_getErrorName ] ---

    /** Unsafe version of: {@link #LZ4F_getErrorName getErrorName} */
    public static native long nLZ4F_getErrorName(long code);

    /** Return error code string; for debugging. */
    @Nullable
    @NativeType("char const *")
    public static String LZ4F_getErrorName(@NativeType("LZ4F_errorCode_t") long code) {
        long __result = nLZ4F_getErrorName(code);
        return memASCIISafe(__result);
    }

    // --- [ LZ4F_compressionLevel_max ] ---

    public static native int LZ4F_compressionLevel_max();

    // --- [ LZ4F_compressFrameBound ] ---

    /** Unsafe version of: {@link #LZ4F_compressFrameBound compressFrameBound} */
    public static native long nLZ4F_compressFrameBound(long srcSize, long preferencesPtr);

    /**
     * Returns the maximum possible size of a frame compressed with {@link #LZ4F_compressFrame compressFrame} given {@code srcSize} content and preferences.
     * 
     * <p>Returns the maximum possible compressed size with {@link #LZ4F_compressFrame compressFrame} given {@code srcSize} and preferences. {@code preferencesPtr} is optional. It can be
     * replaced by {@code NULL}, in which case, the function will assume default preferences.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>this result is only usable with {@link #LZ4F_compressFrame compressFrame}. It may also be used with {@link #LZ4F_compressUpdate compressUpdate} <b>if no {@code {@link #LZ4F_flush flush}} operation</b> is performed.</p></div>
     */
    @NativeType("size_t")
    public static long LZ4F_compressFrameBound(@NativeType("size_t") long srcSize, @Nullable @NativeType("LZ4F_preferences_t const *") LZ4FPreferences preferencesPtr) {
        return nLZ4F_compressFrameBound(srcSize, memAddressSafe(preferencesPtr));
    }

    // --- [ LZ4F_compressFrame ] ---

    /**
     * Unsafe version of: {@link #LZ4F_compressFrame compressFrame}
     *
     * @param dstCapacity MUST be &ge; {@link #LZ4F_compressFrameBound compressFrameBound}{@code (srcSize, preferencesPtr)}
     */
    public static native long nLZ4F_compressFrame(long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long preferencesPtr);

    /**
     * Compress an entire {@code srcBuffer} into a valid LZ4 frame.
     * 
     * <p>The {@code LZ4F_preferences_t} structure is optional: you can provide {@code NULL} as argument. All preferences will be set to default.</p>
     *
     * @return number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressFrame(@NativeType("void *") ByteBuffer dstBuffer, @NativeType("void const *") ByteBuffer srcBuffer, @Nullable @NativeType("LZ4F_preferences_t const *") LZ4FPreferences preferencesPtr) {
        return nLZ4F_compressFrame(memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(preferencesPtr));
    }

    // --- [ LZ4F_getVersion ] ---

    @NativeType("unsigned")
    public static native int LZ4F_getVersion();

    // --- [ LZ4F_createCompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_createCompressionContext createCompressionContext} */
    public static native long nLZ4F_createCompressionContext(long cctxPtr, int version);

    /**
     * The first thing to do is to create a {@code compressionContext} object, which will be used in all compression operations. This is achieved using
     * {@code LZ4F_createCompressionContext()}, which takes as argument a version.
     * 
     * <p>The function will provide a pointer to a fully allocated {@code LZ4F_cctx} object. Object can release its memory using {@link #LZ4F_freeCompressionContext freeCompressionContext};</p>
     *
     * @param version MUST be {@link #LZ4F_VERSION VERSION}. It is intended to track potential version mismatch, notably when using DLL. Must be:<br><table><tr><td>{@link #LZ4F_VERSION VERSION}</td></tr></table>
     *
     * @return if {@code != zero}, there was an error during context creation.
     */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_createCompressionContext(@NativeType("LZ4F_cctx **") PointerBuffer cctxPtr, @NativeType("unsigned") int version) {
        if (CHECKS) {
            check(cctxPtr, 1);
        }
        return nLZ4F_createCompressionContext(memAddress(cctxPtr), version);
    }

    // --- [ LZ4F_freeCompressionContext ] ---

    public static native long nLZ4F_freeCompressionContext(long cctx);

    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_freeCompressionContext(@NativeType("LZ4F_cctx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_freeCompressionContext(cctx);
    }

    // --- [ LZ4F_compressBegin ] ---

    /**
     * Unsafe version of: {@link #LZ4F_compressBegin compressBegin}
     *
     * @param dstCapacity must be &ge; {@link #LZ4F_HEADER_SIZE_MAX HEADER_SIZE_MAX} bytes
     */
    public static native long nLZ4F_compressBegin(long cctx, long dstBuffer, long dstCapacity, long prefsPtr);

    /**
     * Will write the frame header into {@code dstBuffer}.
     *
     * @param prefsPtr optional: you can provide {@code NULL} as argument, all preferences will then be set to default
     *
     * @return number of bytes written into {@code dstBuffer} for the header or an error code (which can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressBegin(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @Nullable @NativeType("LZ4F_preferences_t const *") LZ4FPreferences prefsPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressBegin(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_compressBound ] ---

    /** Unsafe version of: {@link #LZ4F_compressBound compressBound} */
    public static native long nLZ4F_compressBound(long srcSize, long prefsPtr);

    /**
     * Provides minimum {@code dstCapacity} required to guarantee success of {@link #LZ4F_compressUpdate compressUpdate}, given a {@code srcSize} and preferences, for a worst case
     * scenario.
     * 
     * <p>When {@code srcSize==0}, {@code LZ4F_compressBound()} provides an upper bound for {@link #LZ4F_flush flush} and {@link #LZ4F_compressEnd compressEnd} instead. Note that the result is only
     * valid for a single invocation of {@code LZ4F_compressUpdate()}. When invoking {@code LZ4F_compressUpdate()} multiple times, if the output buffer is
     * gradually filled up instead of emptied and re-used from its start, one must check if there is enough remaining capacity before each invocation, using
     * {@code LZ4F_compressBound()}.</p>
     * 
     * <p>Result is always the same for a {@code srcSize} and {@code prefsPtr}. If automatic flushing is not enabled, includes the possibility that internal
     * buffer might already be filled by up to {@code (blockSize-1)} bytes. It also includes frame footer {@code (ending + checksum)}, since it might be
     * generated by {@code LZ4F_compressEnd()}. The result doesn't include frame header, as it was already generated by {@code LZ4F_compressBegin()}.</p>
     *
     * @param prefsPtr optional: when {@code NULL} is provided, preferences will be set to cover worst case scenario
     */
    @NativeType("size_t")
    public static long LZ4F_compressBound(@NativeType("size_t") long srcSize, @Nullable @NativeType("LZ4F_preferences_t const *") LZ4FPreferences prefsPtr) {
        return nLZ4F_compressBound(srcSize, memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_compressUpdate ] ---

    /** Unsafe version of: {@link #LZ4F_compressUpdate compressUpdate} */
    public static native long nLZ4F_compressUpdate(long cctx, long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long cOptPtr);

    /**
     * {@code LZ4F_compressUpdate()} can be called repetitively to compress as much data as necessary.
     * 
     * <p>Important rule: {@code dstCapacity} MUST be large enough to ensure operation success even in worst case situations. This value is provided by
     * {@link #LZ4F_compressBound compressBound}. If this condition is not respected, {@code LZ4F_compress()} will fail (result is an {@code errorCode}).</p>
     * 
     * <p>{@code LZ4F_compressUpdate()} doesn't guarantee error recovery. When an error occurs, compression context must be freed or resized.</p>
     *
     * @param cOptPtr optional: {@code NULL} can be provided, in which case all options are set to default
     *
     * @return number of bytes written into {@code dstBuffer} (it can be zero, meaning input data was just buffered) or an error code if it fails (which can be tested
     *         using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressUpdate(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("void const *") ByteBuffer srcBuffer, @Nullable @NativeType("LZ4F_compressOptions_t const *") LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressUpdate(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_flush ] ---

    /**
     * Unsafe version of: {@link #LZ4F_flush flush}
     *
     * @param dstCapacity must be large enough to ensure the operation will be successful
     */
    public static native long nLZ4F_flush(long cctx, long dstBuffer, long dstCapacity, long cOptPtr);

    /**
     * When data must be generated and sent immediately, without waiting for a block to be completely filled, it's possible to call {@link #LZ4F_flush flush}. It will
     * immediately compress any data buffered within {@code cctx}.
     *
     * @param cOptPtr optional: it's possible to provide {@code NULL}, all options will be set to default
     *
     * @return nb of bytes written into {@code dstBuffer} (can be zero, when there is no data stored within {@code cctx}) or an error code if it fails (which can be
     *         tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_flush(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @Nullable @NativeType("LZ4F_compressOptions_t const *") LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_flush(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_compressEnd ] ---

    /** Unsafe version of: {@link #LZ4F_compressEnd compressEnd} */
    public static native long nLZ4F_compressEnd(long cctx, long dstBuffer, long dstCapacity, long cOptPtr);

    /**
     * To properly finish an LZ4 frame, invoke {@link #LZ4F_compressEnd compressEnd}. It will flush whatever data remained within {@code cctx} (like {@link #LZ4F_flush flush}) and properly finalize
     * the frame, with an {@code endMark} and a {@code checksum}.
     *
     * @param cOptPtr optional: {@code NULL} can be provided, in which case all options will be set to default
     *
     * @return nb of bytes written into {@code dstBuffer}, necessarily &ge; 4 ({@code endMark}), or an error code if it fails (which can be tested using {@link #LZ4F_isError isError}).
     *         
     *         <p>A successful call to {@link #LZ4F_compressEnd compressEnd} makes {@code cctx} available again for another compression task.</p>
     */
    @NativeType("size_t")
    public static long LZ4F_compressEnd(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @Nullable @NativeType("LZ4F_compressOptions_t const *") LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressEnd(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_createDecompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_createDecompressionContext createDecompressionContext} */
    public static native long nLZ4F_createDecompressionContext(long dctxPtr, int version);

    /**
     * Create an {@code LZ4F_dctx} object, to track all decompression operations.
     * 
     * <p>The function provides a pointer to an allocated and initialized {@code LZ4F_dctx} object. {@code dctx} memory can be released using
     * {@link #LZ4F_freeDecompressionContext freeDecompressionContext}.</p>
     *
     * @param version must be:<br><table><tr><td>{@link #LZ4F_VERSION VERSION}</td></tr></table>
     *
     * @return an errorCode, which can be tested using {@link #LZ4F_isError isError}
     */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_createDecompressionContext(@NativeType("LZ4F_dctx **") PointerBuffer dctxPtr, @NativeType("unsigned") int version) {
        if (CHECKS) {
            check(dctxPtr, 1);
        }
        return nLZ4F_createDecompressionContext(memAddress(dctxPtr), version);
    }

    // --- [ LZ4F_freeDecompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_freeDecompressionContext freeDecompressionContext} */
    public static native long nLZ4F_freeDecompressionContext(long dctx);

    /**
     * Frees an {@code LZ4F_dctx} object.
     *
     * @return an errorCode, which can be tested using {@link #LZ4F_isError isError}.
     *         
     *         <p>Result of {@code LZ4F_freeDecompressionContext()} indicates current state of {@code decompressionContext} when being released. That is, it should be
     *         {@code == 0} if decompression has been completed fully and correctly.</p>
     */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_freeDecompressionContext(@NativeType("LZ4F_dctx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nLZ4F_freeDecompressionContext(dctx);
    }

    // --- [ LZ4F_getFrameInfo ] ---

    /** Unsafe version of: {@link #LZ4F_getFrameInfo getFrameInfo} */
    public static native long nLZ4F_getFrameInfo(long dctx, long frameInfoPtr, long srcBuffer, long srcSizePtr);

    /**
     * This function extracts frame parameters (max {@code blockSize}, {@code dictID}, etc.). Its usage is optional.
     * 
     * <p>Extracted information is typically useful for allocation and dictionary. This function works in 2 situations:</p>
     * 
     * <ul>
     * <li>At the beginning of a new frame, in which case it will decode information from {@code srcBuffer}, starting the decoding process.
     * 
     * <p>Input size must be large enough to successfully decode the entire frame header. Frame header size is variable, but is guaranteed to be &le;
     * {@link #LZ4F_HEADER_SIZE_MAX HEADER_SIZE_MAX} bytes. It's allowed to provide more input data than this minimum.</p></li>
     * <li>After decoding has been started. In which case, no input is read, frame parameters are extracted from {@code dctx}.</li>
     * <li>If decoding has barely started, but not yet extracted information from header, {@code LZ4F_getFrameInfo()} will fail.</li>
     * </ul>
     * 
     * <p>The number of bytes consumed from {@code srcBuffer} will be updated within {@code *srcSizePtr} (necessarily &le; original value). Decompression must
     * resume from {@code (srcBuffer + *srcSizePtr)}.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>in case of error, {@code dctx} is not modified. Decoding operation can resume from beginning safely</li>
     * <li>frame parameters are <i>copied into</i> an already allocated {@code LZ4F_frameInfo_t} structure</li>
     * </ol>
     *
     * @return an hint about how many srcSize bytes LZ4F_decompress() expects for next call, or an error code which can be tested using LZ4F_isError()
     */
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

    /** Unsafe version of: {@link #LZ4F_decompress decompress} */
    public static native long nLZ4F_decompress(long dctx, long dstBuffer, long dstSizePtr, long srcBuffer, long srcSizePtr, long dOptPtr);

    /**
     * Call this function repetitively to regenerate data compressed in {@code srcBuffer}.
     * 
     * <p>The function requires a valid {@code dctx} state. It will read up to {@code *srcSizePtr} bytes from {@code srcBuffer}, and decompress data into
     * {@code dstBuffer}, of capacity {@code *dstSizePtr}.</p>
     * 
     * <p>The nb of bytes consumed from {@code srcBuffer} will be written into {@code *srcSizePtr} (necessarily &le; original value). The number of bytes
     * decompressed into {@code dstBuffer} will be written into {@code *dstSizePtr} (necessarily &le; original value).</p>
     * 
     * <p>The nb of bytes regenerated into {@code dstBuffer} is provided within {@code *dstSizePtr} (necessarily &le; original value).</p>
     * 
     * <p>The function does not necessarily read all input bytes, so always check value in {@code *srcSizePtr}. Unconsumed source data must be presented again in
     * subsequent invocations.</p>
     * 
     * <p>{@code dstBuffer} can freely change between each consecutive function invocation. {@code dstBuffer} content will be overwritten.</p>
     * 
     * <p>After a frame is fully decoded, {@code dctx} can be used again to decompress another frame.</p>
     * 
     * <p>After a decompression error, use {@link #LZ4F_resetDecompressionContext resetDecompressionContext} before re-using {@code dctx}, to return to clean state.</p>
     *
     * @return a hint of how many {@code srcSize} bytes {@code LZ4F_decompress()} expects for next call.
     *         
     *         <p>Schematically, it's the size of the current (or remaining) compressed block + header of next block. Respecting the hint provides some small speed
     *         benefit, because it skips intermediate buffers. This is just a hint though, it's always possible to provide any {@code srcSize}.</p>
     *         
     *         <p>When a frame is fully decoded, return will be 0 (no more data expected). When provided with more bytes than necessary to decode a frame,
     *         {@code LZ4F_decompress()} will stop reading exactly at end of current frame, and return 0.</p>
     *         
     *         <p>If decompression failed, return is an error code, which can be tested using {@link #LZ4F_isError isError}. After a decompression error, the {@code dctx} context is not
     *         resumable. Use {@link #LZ4F_resetDecompressionContext resetDecompressionContext} to return to clean state.</p>
     */
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

    /** Unsafe version of: {@link #LZ4F_resetDecompressionContext resetDecompressionContext} */
    public static native void nLZ4F_resetDecompressionContext(long dctx);

    /**
     * In case of an error, the context is left in "undefined" state. In which case, it's necessary to reset it, before re-using it.
     * 
     * <p>This method can also be used to abruptly stop an unfinished decompression, and start a new one using the same context resources.</p>
     *
     * @since 1.8.0
     */
    public static void LZ4F_resetDecompressionContext(@NativeType("LZ4F_dctx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        nLZ4F_resetDecompressionContext(dctx);
    }

    // --- [ LZ4F_getErrorCode ] ---

    @NativeType("LZ4F_errorCodes")
    public static native int LZ4F_getErrorCode(@NativeType("size_t") long functionResult);

    // --- [ LZ4F_createCDict ] ---

    /** Unsafe version of: {@link #LZ4F_createCDict createCDict} */
    public static native long nLZ4F_createCDict(long dictBuffer, long dictSize);

    /**
     * When compressing multiple messages / blocks with the same dictionary, it's recommended to load it just once. {@code LZ4_createCDict()} will create a
     * digested dictionary, ready to start future compression operations without startup delay.
     * 
     * <p>{@code LZ4_CDict} can be created once and shared by multiple threads concurrently, since its usage is read-only.</p>
     * 
     * <p>{@code dictBuffer} can be released after {@code LZ4_CDict} creation, since its content is copied within {@code CDict}.</p>
     */
    @NativeType("LZ4F_CDict *")
    public static long LZ4F_createCDict(@NativeType("void const *") ByteBuffer dictBuffer) {
        return nLZ4F_createCDict(memAddress(dictBuffer), dictBuffer.remaining());
    }

    // --- [ LZ4F_freeCDict ] ---

    public static native void nLZ4F_freeCDict(long CDict);

    public static void LZ4F_freeCDict(@NativeType("LZ4F_CDict *") long CDict) {
        if (CHECKS) {
            check(CDict);
        }
        nLZ4F_freeCDict(CDict);
    }

    // --- [ LZ4F_compressFrame_usingCDict ] ---

    /** Unsafe version of: {@link #LZ4F_compressFrame_usingCDict compressFrame_usingCDict} */
    public static native long nLZ4F_compressFrame_usingCDict(long cctx, long dst, long dstCapacity, long src, long srcSize, long cdict, long preferencesPtr);

    /**
     * Compress an entire {@code srcBuffer} into a valid LZ4 frame using a digested Dictionary.
     * 
     * <p>{@code dst} MUST be &ge; {@link #LZ4F_compressFrameBound compressFrameBound}{@code (srcSize, preferencesPtr)}. If this condition is not respected, function will fail (return an
     * {@code errorCode}).</p>
     *
     * @param cctx           must point to a context created by {@link #LZ4F_createCompressionContext createCompressionContext}.
     * @param cdict          if {@code NULL}, compress without a dictionary
     * @param preferencesPtr optional: you may provide {@code NULL} as argument, but it's not recommended, as it's the only way to provide {@code dictID} in the frame header
     *
     * @return number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressFrame_usingCDict(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dst, @NativeType("void const *") ByteBuffer src, @NativeType("LZ4F_CDict const *") long cdict, @NativeType("LZ4F_preferences_t const *") LZ4FPreferences preferencesPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressFrame_usingCDict(cctx, memAddress(dst), dst.remaining(), memAddress(src), src.remaining(), cdict, preferencesPtr.address());
    }

    // --- [ LZ4F_compressBegin_usingCDict ] ---

    /** Unsafe version of: {@link #LZ4F_compressBegin_usingCDict compressBegin_usingCDict} */
    public static native long nLZ4F_compressBegin_usingCDict(long cctx, long dstBuffer, long dstCapacity, long cdict, long prefsPtr);

    /**
     * Inits streaming dictionary compression, and writes the frame header into {@code dstBuffer}.
     * 
     * <p>{@code dstCapacity} must be &ge; {@link #LZ4F_HEADER_SIZE_MAX HEADER_SIZE_MAX} bytes.</p>
     *
     * @param prefsPtr optional: you may provide {@code NULL} as argument, however, it's the only way to provide {@code dictID} in the frame header
     *
     * @return number of bytes written into {@code dstBuffer} for the header, or an error code (which can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressBegin_usingCDict(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("LZ4F_CDict const *") long cdict, @NativeType("LZ4F_preferences_t const *") LZ4FPreferences prefsPtr) {
        if (CHECKS) {
            check(cctx);
            check(cdict);
        }
        return nLZ4F_compressBegin_usingCDict(cctx, memAddress(dstBuffer), dstBuffer.remaining(), cdict, prefsPtr.address());
    }

    // --- [ LZ4F_decompress_usingDict ] ---

    /** Unsafe version of: {@link #LZ4F_decompress_usingDict decompress_usingDict} */
    public static native long nLZ4F_decompress_usingDict(long dctxPtr, long dstBuffer, long dstSizePtr, long srcBuffer, long srcSizePtr, long dict, long dictSize, long decompressOptionsPtr);

    /**
     * Same as {@link #LZ4F_decompress decompress}, using a predefined dictionary.
     * 
     * <p>Dictionary is used "in place", without any preprocessing. It must remain accessible throughout the entire frame decoding.</p>
     */
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

}