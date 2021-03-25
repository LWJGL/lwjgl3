/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4Frame = "LZ4Frame".nativeClass(Module.LZ4, prefix = "LZ4F", prefixMethod = "LZ4F_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4F_STATIC_LINKING_ONLY
#include "lz4frame.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the frame API of ${url("http://lz4.github.io/lz4/", "LZ4")}.

        LZ4F is a stand-alone API to create LZ4-compressed frames conformant with specification v1.6.1. It also offers streaming capabilities. {@code lz4.h} is
        not required when using {@code lz4frame.h}, except to get constant such as #VERSION_NUMBER.
        """

    IntConstant(
        """
        Version number.

        This number can be used to check for an incompatible API breaking change.
        """,

        "VERSION".."100"
    )

    IntConstant("Minimum header size.", "HEADER_SIZE_MIN".."7")
    IntConstant("Maximum header size.", "HEADER_SIZE_MAX".."19")
    IntConstant("Size in bytes of a block header in little-endian format. Highest bit indicates if block data is uncompressed.", "BLOCK_HEADER_SIZE".."4")
    IntConstant("Size in bytes of a block checksum footer in little-endian format.", "BLOCK_CHECKSUM_SIZE".."4")
    IntConstant("Size in bytes of the content checksum.", "CONTENT_CHECKSUM_SIZE".."4")

    EnumConstant(
        """
        {@code LZ4F_blockSizeID_t}

        The larger the block size, the (slightly) better the compression ratio, though there are diminishing returns. Larger blocks also increase memory usage
        on both compression and decompression sides.
        """,

        "default".enum,
        "max64KB".enum("", "4"),
        "max256KB".enum,
        "max1MB".enum,
        "max4MB".enum
    )

    EnumConstant(
        """
        {@code LZ4F_blockMode_t}

        Linked blocks sharply reduce inefficiencies when using small blocks, they compress better. However, some LZ4 decoders are only compatible with
        independent blocks
        """,

        "blockLinked".enum,
        "blockIndependent".enum
    )

    EnumConstant(
        "{@code LZ4F_contentChecksum_t}",

        "noContentChecksum".enum,
        "contentChecksumEnabled".enum
    )

    EnumConstant(
        "{@code LZ4F_blockChecksum_t}",

        "noBlockChecksum".enum,
        "blockChecksumEnabled".enum
    )

    EnumConstant(
        "{@code LZ4F_frameType_t}",

        "frame".enum,
        "skippableFrame".enum
    )

    unsignedb(
        "isError",
        "Tells when a function result is an error code.",

        LZ4F_errorCode_t("code", "")
    )

    charASCII.const.p(
        "getErrorName",
        "Return error code string; for debugging.",

        LZ4F_errorCode_t("code", "")
    )

    int("compressionLevel_max", "", void())

    size_t(
        "compressFrameBound",
        """
        Returns the maximum possible size of a frame compressed with #compressFrame() given {@code srcSize} content and preferences.

        Returns the maximum possible compressed size with #compressFrame() given {@code srcSize} and preferences. {@code preferencesPtr} is optional. It can be
        replaced by #NULL, in which case, the function will assume default preferences.

        ${note(
            "this result is only usable with #compressFrame(). It may also be used with #compressUpdate() <b>if no {@code #flush()} operation</b> is performed."
        )}
        """,

        size_t("srcSize", ""),
        nullable..LZ4F_preferences_t.const.p("preferencesPtr", "")
    )

    size_t(
        "compressFrame",
        """
        Compress an entire {@code srcBuffer} into a valid LZ4 frame.

        The {@code LZ4F_preferences_t} structure is optional: you can provide #NULL as argument. All preferences will be set to default.
        """,

        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t("dstCapacity", "MUST be &ge; #compressFrameBound(){@code (srcSize, preferencesPtr)}"),
        void.const.p("srcBuffer", ""),
        AutoSize("srcBuffer")..size_t("srcSize", ""),
        nullable..LZ4F_preferences_t.const.p("preferencesPtr", ""),

        returnDoc = "number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using #isError())"
    )

    unsigned("getVersion", "", void())

    LZ4F_errorCode_t(
        "createCompressionContext",
        """
        The first thing to do is to create a {@code compressionContext} object, which will be used in all compression operations. This is achieved using
        {@code LZ4F_createCompressionContext()}, which takes as argument a version.

        The function will provide a pointer to a fully allocated {@code LZ4F_cctx} object. Object can release its memory using #freeCompressionContext();
        """,

        Check(1)..LZ4F_cctx.p.p("cctxPtr", ""),
        unsigned("version", "MUST be #VERSION. It is intended to track potential version mismatch, notably when using DLL.", "#VERSION"),

        returnDoc = "if {@code != zero}, there was an error during context creation."
    )

    LZ4F_errorCode_t(
        "freeCompressionContext",
        "",

        LZ4F_cctx.p("cctx", "")
    )

    size_t(
        "compressBegin",
        "Will write the frame header into {@code dstBuffer}.",

        LZ4F_cctx.p("cctx", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t("dstCapacity", "must be &ge; #HEADER_SIZE_MAX bytes"),
        nullable..LZ4F_preferences_t.const.p("prefsPtr", "optional: you can provide #NULL as argument, all preferences will then be set to default"),

        returnDoc = "number of bytes written into {@code dstBuffer} for the header or an error code (which can be tested using #isError())"
    )

    size_t(
        "compressBound",
        """
        Provides minimum {@code dstCapacity} required to guarantee success of #compressUpdate(), given a {@code srcSize} and preferences, for a worst case
        scenario.

        When {@code srcSize==0}, {@code LZ4F_compressBound()} provides an upper bound for #flush() and #compressEnd() instead. Note that the result is only
        valid for a single invocation of {@code LZ4F_compressUpdate()}. When invoking {@code LZ4F_compressUpdate()} multiple times, if the output buffer is
        gradually filled up instead of emptied and re-used from its start, one must check if there is enough remaining capacity before each invocation, using
        {@code LZ4F_compressBound()}.
        
        Result is always the same for a {@code srcSize} and {@code prefsPtr}. If automatic flushing is not enabled, includes the possibility that internal
        buffer might already be filled by up to {@code (blockSize-1)} bytes. It also includes frame footer {@code (ending + checksum)}, since it might be
        generated by {@code LZ4F_compressEnd()}. The result doesn't include frame header, as it was already generated by {@code LZ4F_compressBegin()}.
        """,

        size_t("srcSize", ""),
        nullable..LZ4F_preferences_t.const.p(
            "prefsPtr",
            "optional: when #NULL is provided, preferences will be set to cover worst case scenario"
        )
    )

    size_t(
        "compressUpdate",
        """
        {@code LZ4F_compressUpdate()} can be called repetitively to compress as much data as necessary.

        Important rule: {@code dstCapacity} MUST be large enough to ensure operation success even in worst case situations. This value is provided by
        #compressBound(). If this condition is not respected, {@code LZ4F_compress()} will fail (result is an {@code errorCode}).

        {@code LZ4F_compressUpdate()} doesn't guarantee error recovery. When an error occurs, compression context must be freed or resized.
        """,

        LZ4F_cctx.p("cctx", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t("dstCapacity", ""),
        void.const.p("srcBuffer", ""),
        AutoSize("srcBuffer")..size_t("srcSize", ""),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr", "optional: #NULL can be provided, in which case all options are set to default"),

        returnDoc =
        """
        number of bytes written into {@code dstBuffer} (it can be zero, meaning input data was just buffered) or an error code if it fails (which can be tested
        using #isError())
        """
    )

    size_t(
        "flush",
        """
        When data must be generated and sent immediately, without waiting for a block to be completely filled, it's possible to call #flush(). It will
        immediately compress any data buffered within {@code cctx}.
        """,

        LZ4F_cctx.p("cctx", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t("dstCapacity", "must be large enough to ensure the operation will be successful"),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr", "optional: it's possible to provide #NULL, all options will be set to default"),

        returnDoc =
        """
        nb of bytes written into {@code dstBuffer} (can be zero, when there is no data stored within {@code cctx}) or an error code if it fails (which can be
        tested using #isError())
        """
    )

    size_t(
        "compressEnd",
        """
        To properly finish an LZ4 frame, invoke #compressEnd(). It will flush whatever data remained within {@code cctx} (like #flush()) and properly finalize
        the frame, with an {@code endMark} and a {@code checksum}.
        """,

        LZ4F_cctx.p("cctx", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t("dstCapacity", ""),
        nullable..LZ4F_compressOptions_t.const.p("cOptPtr", "optional: #NULL can be provided, in which case all options will be set to default"),

        returnDoc =
        """
        nb of bytes written into {@code dstBuffer}, necessarily &ge; 4 ({@code endMark}), or an error code if it fails (which can be tested using #isError()).

        A successful call to #compressEnd() makes {@code cctx} available again for another compression task.
        """
    )

    LZ4F_errorCode_t(
        "createDecompressionContext",
        """
        Create an {@code LZ4F_dctx} object, to track all decompression operations.

        The function provides a pointer to an allocated and initialized {@code LZ4F_dctx} object. {@code dctx} memory can be released using
        #freeDecompressionContext().
        """,

        Check(1)..LZ4F_dctx.p.p("dctxPtr", ""),
        unsigned("version", "", "#VERSION"),

        returnDoc = "an errorCode, which can be tested using #isError()"
    )

    LZ4F_errorCode_t(
        "freeDecompressionContext",
        """
        Frees an {@code LZ4F_dctx} object.
        """,

        LZ4F_dctx.p("dctx", ""),

        returnDoc =
        """
        an errorCode, which can be tested using #isError().

        Result of {@code LZ4F_freeDecompressionContext()} indicates current state of {@code decompressionContext} when being released. That is, it should be
        {@code == 0} if decompression has been completed fully and correctly.
        """
    )

    size_t(
        "getFrameInfo",
        """
        This function extracts frame parameters (max {@code blockSize}, {@code dictID}, etc.). Its usage is optional.

        Extracted information is typically useful for allocation and dictionary. This function works in 2 situations:
        ${ul(
            """
            At the beginning of a new frame, in which case it will decode information from {@code srcBuffer}, starting the decoding process.

            Input size must be large enough to successfully decode the entire frame header. Frame header size is variable, but is guaranteed to be &le;
            #HEADER_SIZE_MAX bytes. It's allowed to provide more input data than this minimum.
            """,
            "After decoding has been started. In which case, no input is read, frame parameters are extracted from {@code dctx}.",
            "If decoding has barely started, but not yet extracted information from header, {@code LZ4F_getFrameInfo()} will fail."
        )}
        The number of bytes consumed from {@code srcBuffer} will be updated within {@code *srcSizePtr} (necessarily &le; original value). Decompression must
        resume from {@code (srcBuffer + *srcSizePtr)}.

        Notes:
        ${ol(
            "in case of error, {@code dctx} is not modified. Decoding operation can resume from beginning safely",
            "frame parameters are <i>copied into</i> an already allocated {@code LZ4F_frameInfo_t} structure"
        )}
        """,

        LZ4F_dctx.p("dctx", ""),
        LZ4F_frameInfo_t.p("frameInfoPtr", ""),
        void.const.p("srcBuffer", ""),
        AutoSize("srcBuffer")..Check(1)..size_t.p("srcSizePtr", ""),

        returnDoc = "an hint about how many srcSize bytes LZ4F_decompress() expects for next call, or an error code which can be tested using LZ4F_isError()"
    )

    size_t(
        "decompress",
        """
        Call this function repetitively to regenerate data compressed in {@code srcBuffer}.
        
        The function requires a valid {@code dctx} state. It will read up to {@code *srcSizePtr} bytes from {@code srcBuffer}, and decompress data into
        {@code dstBuffer}, of capacity {@code *dstSizePtr}.

        The nb of bytes consumed from {@code srcBuffer} will be written into {@code *srcSizePtr} (necessarily &le; original value). The number of bytes
        decompressed into {@code dstBuffer} will be written into {@code *dstSizePtr} (necessarily &le; original value).

        The nb of bytes regenerated into {@code dstBuffer} is provided within {@code *dstSizePtr} (necessarily &le; original value).

        The function does not necessarily read all input bytes, so always check value in {@code *srcSizePtr}. Unconsumed source data must be presented again in
        subsequent invocations.

        {@code dstBuffer} can freely change between each consecutive function invocation. {@code dstBuffer} content will be overwritten.

        After a frame is fully decoded, {@code dctx} can be used again to decompress another frame.

        After a decompression error, use #resetDecompressionContext() before re-using {@code dctx}, to return to clean state.
        """,

        LZ4F_dctx.p("dctx", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..Check(1)..size_t.p("dstSizePtr", ""),
        void.const.p("srcBuffer", ""),
        AutoSize("srcBuffer")..Check(1)..size_t.p("srcSizePtr", ""),
        LZ4F_decompressOptions_t.const.p("dOptPtr", ""),

        returnDoc =
        """
        a hint of how many {@code srcSize} bytes {@code LZ4F_decompress()} expects for next call.

        Schematically, it's the size of the current (or remaining) compressed block + header of next block. Respecting the hint provides some small speed
        benefit, because it skips intermediate buffers. This is just a hint though, it's always possible to provide any {@code srcSize}.

        When a frame is fully decoded, return will be 0 (no more data expected). When provided with more bytes than necessary to decode a frame,
        {@code LZ4F_decompress()} will stop reading exactly at end of current frame, and return 0.

        If decompression failed, return is an error code, which can be tested using #isError(). After a decompression error, the {@code dctx} context is not
        resumable. Use #resetDecompressionContext() to return to clean state.
        """
    )

    void(
        "resetDecompressionContext",
        """
        In case of an error, the context is left in "undefined" state. In which case, it's necessary to reset it, before re-using it.

        This method can also be used to abruptly stop an unfinished decompression, and start a new one using the same context resources.
        """,

        LZ4F_dctx.p("dctx", ""),

        since = "1.8.0"
    )

    // -----------------------------------------------------

    EnumConstant(
        "Error code.",

        "OK_NoError".enum,
        "ERROR_GENERIC".enum,
        "ERROR_maxBlockSize_invalid".enum,
        "ERROR_blockMode_invalid".enum,
        "ERROR_contentChecksumFlag_invalid".enum,
        "ERROR_compressionLevel_invalid".enum,
        "ERROR_headerVersion_wrong".enum,
        "ERROR_blockChecksum_invalid".enum,
        "ERROR_reservedFlag_set".enum,
        "ERROR_allocation_failed".enum,
        "ERROR_srcSize_tooLarge".enum,
        "ERROR_dstMaxSize_tooSmall".enum,
        "ERROR_frameHeader_incomplete".enum,
        "ERROR_frameType_unknown".enum,
        "ERROR_frameSize_wrong".enum,
        "ERROR_srcPtr_wrong".enum,
        "ERROR_decompressionFailed".enum,
        "ERROR_headerChecksum_invalid".enum,
        "ERROR_contentChecksum_invalid".enum,
        "ERROR_frameDecoding_alreadyStarted".enum,
        "ERROR_maxCode".enum
    )

    LZ4F_errorCodes(
        "getErrorCode",
        "",

        size_t("functionResult", "")
    )

    LZ4F_CDict.p(
        "createCDict",
        """
        When compressing multiple messages / blocks with the same dictionary, it's recommended to load it just once. {@code LZ4_createCDict()} will create a
        digested dictionary, ready to start future compression operations without startup delay.

        {@code LZ4_CDict} can be created once and shared by multiple threads concurrently, since its usage is read-only.

        {@code dictBuffer} can be released after {@code LZ4_CDict} creation, since its content is copied within {@code CDict}.
        """,

        void.const.p("dictBuffer", ""),
        AutoSize("dictBuffer")..size_t("dictSize", "")
    )

    void(
        "freeCDict",
        "",

        LZ4F_CDict.p("CDict", "")
    )

    size_t(
        "compressFrame_usingCDict",
        """
        Compress an entire {@code srcBuffer} into a valid LZ4 frame using a digested Dictionary.

        {@code dst} MUST be &ge; #compressFrameBound(){@code (srcSize, preferencesPtr)}. If this condition is not respected, function will fail (return an
        {@code errorCode}).
        """,

        LZ4F_cctx.p("cctx", "must point to a context created by #createCompressionContext()."),
        void.p("dst", ""),
        AutoSize("dst")..size_t("dstCapacity", ""),
        void.const.p("src", ""),
        AutoSize("src")..size_t("srcSize", ""),
        nullable..LZ4F_CDict.const.p("cdict", "if #NULL, compress without a dictionary"),
        LZ4F_preferences_t.const.p(
            "preferencesPtr",
            "optional: you may provide #NULL as argument, but it's not recommended, as it's the only way to provide {@code dictID} in the frame header"
        ),

        returnDoc = "number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using #isError())"
    )

    size_t(
        "compressBegin_usingCDict",
        """
        Inits streaming dictionary compression, and writes the frame header into {@code dstBuffer}.

        {@code dstCapacity} must be &ge; #HEADER_SIZE_MAX bytes.
        """,

        LZ4F_cctx.p("cctx", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t("dstCapacity", ""),
        LZ4F_CDict.const.p("cdict", ""),
        LZ4F_preferences_t.const.p(
            "prefsPtr",
            "optional: you may provide #NULL as argument, however, it's the only way to provide {@code dictID} in the frame header"
        ),

        returnDoc = "number of bytes written into {@code dstBuffer} for the header, or an error code (which can be tested using #isError())"
    )

    size_t(
        "decompress_usingDict",
        """
        Same as #decompress(), using a predefined dictionary.

        Dictionary is used "in place", without any preprocessing. It must remain accessible throughout the entire frame decoding.
        """,

        LZ4F_dctx.p("dctxPtr", ""),
        void.p("dstBuffer", ""),
        AutoSize("dstBuffer")..Check(1)..size_t.p("dstSizePtr", ""),
        void.const.p("srcBuffer", ""),
        AutoSize("srcBuffer")..Check(1)..size_t.p("srcSizePtr", ""),
        void.const.p("dict", ""),
        AutoSize("dict")..size_t("dictSize", ""),
        LZ4F_decompressOptions_t.const.p("decompressOptionsPtr", "")
    )
}