/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class ZstdErrors {

    static { LibZstd.initialize(); }

    public static final int
        ZSTD_error_no_error                          = 0,
        ZSTD_error_GENERIC                           = 1,
        ZSTD_error_prefix_unknown                    = 10,
        ZSTD_error_version_unsupported               = 12,
        ZSTD_error_frameParameter_unsupported        = 14,
        ZSTD_error_frameParameter_windowTooLarge     = 16,
        ZSTD_error_corruption_detected               = 20,
        ZSTD_error_checksum_wrong                    = 22,
        ZSTD_error_literals_headerWrong              = 24,
        ZSTD_error_dictionary_corrupted              = 30,
        ZSTD_error_dictionary_wrong                  = 32,
        ZSTD_error_dictionaryCreation_failed         = 34,
        ZSTD_error_parameter_unsupported             = 40,
        ZSTD_error_parameter_combination_unsupported = 41,
        ZSTD_error_parameter_outOfBound              = 42,
        ZSTD_error_tableLog_tooLarge                 = 44,
        ZSTD_error_maxSymbolValue_tooLarge           = 46,
        ZSTD_error_maxSymbolValue_tooSmall           = 48,
        ZSTD_error_cannotProduce_uncompressedBlock   = 49,
        ZSTD_error_stabilityCondition_notRespected   = 50,
        ZSTD_error_stage_wrong                       = 60,
        ZSTD_error_init_missing                      = 62,
        ZSTD_error_memory_allocation                 = 64,
        ZSTD_error_workSpace_tooSmall                = 66,
        ZSTD_error_dstSize_tooSmall                  = 70,
        ZSTD_error_srcSize_wrong                     = 72,
        ZSTD_error_dstBuffer_null                    = 74,
        ZSTD_error_noForwardProgress_destFull        = 80,
        ZSTD_error_noForwardProgress_inputEmpty      = 82,
        ZSTD_error_frameIndex_tooLarge               = 100,
        ZSTD_error_seekableIO                        = 102,
        ZSTD_error_dstBuffer_wrong                   = 104,
        ZSTD_error_srcBuffer_wrong                   = 105,
        ZSTD_error_sequenceProducer_failed           = 106,
        ZSTD_error_externalSequences_invalid         = 107;

    protected ZstdErrors() {
        throw new UnsupportedOperationException();
    }

    // --- [ ZSTD_getErrorString ] ---

    /** {@code char const * ZSTD_getErrorString(ZSTD_ErrorCode code)} */
    public static native long nZSTD_getErrorString(int code);

    /** {@code char const * ZSTD_getErrorString(ZSTD_ErrorCode code)} */
    @NativeType("char const *")
    public static String ZSTD_getErrorString(@NativeType("ZSTD_ErrorCode") int code) {
        long __result = nZSTD_getErrorString(code);
        return memASCII(__result);
    }

}