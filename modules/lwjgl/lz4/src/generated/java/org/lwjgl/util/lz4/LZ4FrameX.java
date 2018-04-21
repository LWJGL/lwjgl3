/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the experimental frame API of <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>. */
public class LZ4FrameX {

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

    static { LibLZ4.initialize(); }

    protected LZ4FrameX() {
        throw new UnsupportedOperationException();
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
     *
     * @param dictBuffer 
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
     * <p>{@code dst} MUST be &ge; {@link LZ4Frame#LZ4F_compressFrameBound compressFrameBound}{@code (srcSize, preferencesPtr)}. If this condition is not respected, function will fail (return an
     * {@code errorCode}).</p>
     *
     * @param cctx           must point to a context created by {@link LZ4Frame#LZ4F_createCompressionContext createCompressionContext}.
     * @param dst            
     * @param src            
     * @param cdict          if {@code NULL}, compress without a dictionary
     * @param preferencesPtr optional: you may provide {@code NULL} as argument, but it's not recommended, as it's the only way to provide {@code dictID} in the frame header
     *
     * @return number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using {@link LZ4Frame#LZ4F_isError isError})
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
     * <p>{@code dstCapacity} must be &ge; {@link LZ4Frame#LZ4F_HEADER_SIZE_MAX HEADER_SIZE_MAX} bytes.</p>
     *
     * @param cctx      
     * @param dstBuffer 
     * @param cdict     
     * @param prefsPtr  optional: you may provide {@code NULL} as argument, however, it's the only way to provide {@code dictID} in the frame header
     *
     * @return number of bytes written into {@code dstBuffer} for the header, or an error code (which can be tested using {@link LZ4Frame#LZ4F_isError isError})
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
     * Same as {@link LZ4Frame#LZ4F_decompress decompress}, using a predefined dictionary.
     * 
     * <p>Dictionary is used "in place", without any preprocessing. It must remain accessible throughout the entire frame decoding.</p>
     *
     * @param dctxPtr              
     * @param dstBuffer            
     * @param dstSizePtr           
     * @param srcBuffer            
     * @param srcSizePtr           
     * @param dict                 
     * @param decompressOptionsPtr 
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