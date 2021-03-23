/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the experimental error code API of <a target="_blank" href="http://facebook.github.io/zstd/">Zstandard</a> (zstd). */
public class ZstdErrors {

    static { LibZstd.initialize(); }

    /**
     * Error code. ({@code ZSTD_ErrorCode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ZSTD_error_no_error error_no_error}</li>
     * <li>{@link #ZSTD_error_GENERIC error_GENERIC}</li>
     * <li>{@link #ZSTD_error_prefix_unknown error_prefix_unknown}</li>
     * <li>{@link #ZSTD_error_version_unsupported error_version_unsupported}</li>
     * <li>{@link #ZSTD_error_frameParameter_unsupported error_frameParameter_unsupported}</li>
     * <li>{@link #ZSTD_error_frameParameter_windowTooLarge error_frameParameter_windowTooLarge}</li>
     * <li>{@link #ZSTD_error_corruption_detected error_corruption_detected}</li>
     * <li>{@link #ZSTD_error_checksum_wrong error_checksum_wrong}</li>
     * <li>{@link #ZSTD_error_dictionary_corrupted error_dictionary_corrupted}</li>
     * <li>{@link #ZSTD_error_dictionary_wrong error_dictionary_wrong}</li>
     * <li>{@link #ZSTD_error_dictionaryCreation_failed error_dictionaryCreation_failed}</li>
     * <li>{@link #ZSTD_error_parameter_unsupported error_parameter_unsupported}</li>
     * <li>{@link #ZSTD_error_parameter_outOfBound error_parameter_outOfBound}</li>
     * <li>{@link #ZSTD_error_tableLog_tooLarge error_tableLog_tooLarge}</li>
     * <li>{@link #ZSTD_error_maxSymbolValue_tooLarge error_maxSymbolValue_tooLarge}</li>
     * <li>{@link #ZSTD_error_maxSymbolValue_tooSmall error_maxSymbolValue_tooSmall}</li>
     * <li>{@link #ZSTD_error_stage_wrong error_stage_wrong}</li>
     * <li>{@link #ZSTD_error_init_missing error_init_missing}</li>
     * <li>{@link #ZSTD_error_memory_allocation error_memory_allocation}</li>
     * <li>{@link #ZSTD_error_workSpace_tooSmall error_workSpace_tooSmall}</li>
     * <li>{@link #ZSTD_error_dstSize_tooSmall error_dstSize_tooSmall}</li>
     * <li>{@link #ZSTD_error_srcSize_wrong error_srcSize_wrong}</li>
     * <li>{@link #ZSTD_error_dstBuffer_null error_dstBuffer_null}</li>
     * <li>{@link #ZSTD_error_frameIndex_tooLarge error_frameIndex_tooLarge}</li>
     * <li>{@link #ZSTD_error_seekableIO error_seekableIO}</li>
     * <li>{@link #ZSTD_error_dstBuffer_wrong error_dstBuffer_wrong}</li>
     * <li>{@link #ZSTD_error_srcBuffer_wrong error_srcBuffer_wrong}</li>
     * </ul>
     */
    public static final int
        ZSTD_error_no_error                      = 0,
        ZSTD_error_GENERIC                       = 1,
        ZSTD_error_prefix_unknown                = 10,
        ZSTD_error_version_unsupported           = 12,
        ZSTD_error_frameParameter_unsupported    = 14,
        ZSTD_error_frameParameter_windowTooLarge = 16,
        ZSTD_error_corruption_detected           = 20,
        ZSTD_error_checksum_wrong                = 22,
        ZSTD_error_dictionary_corrupted          = 30,
        ZSTD_error_dictionary_wrong              = 32,
        ZSTD_error_dictionaryCreation_failed     = 34,
        ZSTD_error_parameter_unsupported         = 40,
        ZSTD_error_parameter_outOfBound          = 42,
        ZSTD_error_tableLog_tooLarge             = 44,
        ZSTD_error_maxSymbolValue_tooLarge       = 46,
        ZSTD_error_maxSymbolValue_tooSmall       = 48,
        ZSTD_error_stage_wrong                   = 60,
        ZSTD_error_init_missing                  = 62,
        ZSTD_error_memory_allocation             = 64,
        ZSTD_error_workSpace_tooSmall            = 66,
        ZSTD_error_dstSize_tooSmall              = 70,
        ZSTD_error_srcSize_wrong                 = 72,
        ZSTD_error_dstBuffer_null                = 74,
        ZSTD_error_frameIndex_tooLarge           = 100,
        ZSTD_error_seekableIO                    = 102,
        ZSTD_error_dstBuffer_wrong               = 104,
        ZSTD_error_srcBuffer_wrong               = 105;

    protected ZstdErrors() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_getErrorCode ] ---

    @NativeType("ZSTD_ErrorCode")
    public static native int ZSTD_getErrorCode(@NativeType("size_t") long functionResult);

    // --- [ ZSTD_getErrorString ] ---

    public static native long nZSTD_getErrorString(int code);

    @NativeType("char const *")
    public static String ZSTD_getErrorString(@NativeType("ZSTD_ErrorCode") int code) {
        long __result = nZSTD_getErrorString(code);
        return memASCII(__result);
    }

}