/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4Frame = "LZ4Frame".nativeClass(Module.LZ4, prefix = "LZ4F", prefixMethod = "LZ4F_", library = LZ4_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#include "lz4frame.h"
ENABLE_WARNINGS()""")

    documentation =  "Native bindings to the frame API of ${url("http://lz4.github.io/lz4/", "LZ4")}."

    IntConstant(
        "Version number.",

        "VERSION".."100"
    )

    IntConstant(
        "Maximum header size.",

        "HEADER_SIZE_MAX".."19"
    )

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
        "Tells if a {@code LZ4F_errorCode_t} function result is an error code",

        LZ4F_errorCode_t.IN("code", "")
    )

    charASCII.const.p(
        "getErrorName",
        "Return error code string; useful for debugging.",

        LZ4F_errorCode_t.IN("code", "")
    )

    int(
        "compressionLevel_max",
        ""
    )

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

        size_t.IN("srcSize", ""),
        nullable..LZ4F_preferences_t.const.p.IN("preferencesPtr", "")
    )

    size_t(
        "compressFrame",
        """
        Compress an entire {@code srcBuffer} into a valid LZ4 frame.

        The {@code LZ4F_preferences_t} structure is optional: you can provide #NULL as argument. All preferences will be set to default.
        """,

        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t.IN("dstCapacity", "MUST be &ge; #compressFrameBound(){@code (srcSize, preferencesPtr)}"),
        void.const.p.IN("srcBuffer", ""),
        AutoSize("srcBuffer")..size_t.IN("srcSize", ""),
        nullable..LZ4F_preferences_t.const.p.IN("preferencesPtr", ""),

        returnDoc = "number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using #isError())"
    )

    unsigned(
        "getVersion",
        ""
    )

    LZ4F_errorCode_t(
        "createCompressionContext",
        """
        The first thing to do is to create a {@code compressionContext} object, which will be used in all compression operations. This is achieved using
        {@code LZ4F_createCompressionContext()}, which takes as argument a version.

        The function will provide a pointer to a fully allocated {@code LZ4F_cctx} object. Object can release its memory using #freeCompressionContext();
        """,

        Check(1)..LZ4F_cctx.p.p.OUT("cctxPtr", ""),
        unsigned.IN("version", "MUST be #VERSION. It is intended to track potential version mismatch, notably when using DLL.", "#VERSION"),

        returnDoc = "if {@code != zero}, there was an error during context creation."
    )

    LZ4F_errorCode_t(
        "freeCompressionContext",
        "",

        LZ4F_cctx.p.IN("cctx", "")
    )

    size_t(
        "compressBegin",
        "Will write the frame header into {@code dstBuffer}.",

        LZ4F_cctx.p.IN("cctx", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t.IN("dstCapacity", "must be &ge; #HEADER_SIZE_MAX bytes"),
        nullable..LZ4F_preferences_t.const.p.IN("prefsPtr", "optional: you can provide #NULL as argument, all preferences will then be set to default"),

        returnDoc = "number of bytes written into {@code dstBuffer} for the header or an error code (which can be tested using #isError())"
    )

    size_t(
        "compressBound",
        """
        Provides minimum {@code dstCapacity} required to guarantee compression success given a {@code srcSize} and preferences, covering worst case scenario.

        Estimation is valid for either L#compressUpdate(), #flush() or #compressEnd(). Estimation includes the possibility that internal buffer might already
        be filled by up to {@code (blockSize-1)} bytes. It also includes frame footer {@code (ending + checksum)}, which would have to be generated by
        #compressEnd(). Estimation doesn't include frame header, as it was already generated by #compressBegin().

        Result is always the same for a {@code srcSize} and {@code prefsPtr}, so it can be trusted to size reusable buffers.

        When {@code srcSize==0}, {@code LZ4F_compressBound()} provides an upper bound for #flush() and #compressEnd() operations.
        """,

        size_t.IN("srcSize", ""),
        nullable..LZ4F_preferences_t.const.p.IN(
            "prefsPtr",
            "optional: when #NULL is provided, preferences will be set to cover worst case scenario"
        )
    )

    size_t(
        "compressUpdate",
        """
        {@code LZ4F_compressUpdate()} can be called repetitively to compress as much data as necessary.

        An important rule is that {@code dstCapacity} MUST be large enough to ensure operation success even in worst case situations. This value is provided by
        #compressBound(). If this condition is not respected, {@code LZ4F_compress()} will fail (result is an {@code errorCode}).

        {@code LZ4F_compressUpdate()} doesn't guarantee error recovery. When an error occurs, compression context must be freed or resized.
        """,

        LZ4F_cctx.p.IN("cctx", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t.IN("dstCapacity", ""),
        void.const.p.IN("srcBuffer", ""),
        AutoSize("srcBuffer")..size_t.IN("srcSize", ""),
        nullable..LZ4F_compressOptions_t.const.p.IN("cOptPtr", "optional: #NULL can be provided, in which case all options are set to default"),

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

        LZ4F_cctx.p.IN("cctx", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t.IN("dstCapacity", "must be large enough to ensure the operation will be successful"),
        nullable..LZ4F_compressOptions_t.const.p.IN("cOptPtr", "optional: it's possible to provide #NULL, all options will be set to default"),

        returnDoc =
        """
        number of bytes written into {@code dstBuffer} (it can be zero, which means there was no data stored within {@code cctx}) or an error code if it fails
        (which can be tested using #isError())
        """
    )

    size_t(
        "compressEnd",
        """
        To properly finish an LZ4 frame, invoke #compressEnd(). It will flush whatever data remained within {@code cctx} (like #flush()) and properly finalize
        the frame, with an {@code endMark} and a {@code checksum}.
        """,

        LZ4F_cctx.p.IN("cctx", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..size_t.IN("dstCapacity", ""),
        nullable..LZ4F_compressOptions_t.const.p.IN("cOptPtr", "optional: #NULL can be provided, in which case all options will be set to default"),

        returnDoc =
        """
        number of bytes written into {@code dstBuffer} (necessarily &ge; 4 ({@code endMark}), or 8 if optional frame checksum is enabled) or an error code if
        it fails (which can be tested using #isError()).

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

        Check(1)..LZ4F_dctx.p.p.OUT("dctxPtr", ""),
        unsigned.IN("version", "", "#VERSION"),

        returnDoc = "an errorCode, which can be tested using #isError()"
    )

    LZ4F_errorCode_t(
        "freeDecompressionContext",
        """
        Frees an {@code LZ4F_dctx} object.
        """,

        LZ4F_dctx.p.IN("dctx", ""),

        returnDoc =
        """
        an errorCode, which can be tested using #isError().

        The result of {@code LZ4F_freeDecompressionContext()} is indicative of the current state of {@code decompressionContext} when being released. That is,
        it should be {@code == 0} if decompression has been completed fully and correctly.
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

        LZ4F_dctx.p.IN("dctx", ""),
        LZ4F_frameInfo_t.p.OUT("frameInfoPtr", ""),
        void.const.p.IN("srcBuffer", ""),
        AutoSize("srcBuffer")..Check(1)..size_t.p.INOUT("srcSizePtr", ""),

        returnDoc = "an hint about how many srcSize bytes LZ4F_decompress() expects for next call, or an error code which can be tested using LZ4F_isError()"
    )

    size_t(
        "decompress",
        """
        Call this function repetitively to regenerate compressed data from {@code srcBuffer}. The function will read up to {@code *srcSizePtr}
        bytes from {@code srcBuffer}, and decompress data into {@code dstBuffer}, of capacity {@code *dstSizePtr}.

        The number of bytes consumed from {@code srcBuffer} will be written into {@code *srcSizePtr} (necessarily &le; original value). The number of bytes
        decompressed into {@code dstBuffer} will be written into {@code *dstSizePtr} (necessarily &le; original value).

        The number of bytes regenerated into {@code dstBuffer} is provided within {@code *dstSizePtr} (necessarily &le; original value).

        The function does not necessarily read all input bytes, so always check value in {@code *srcSizePtr}. Unconsumed source data must be presented again in
        subsequent invocations.

        {@code dstBuffer} can freely change between each consecutive function invocation. {@code dstBuffer} content will be overwritten.

        After a frame is fully decoded, {@code dctx} can be used again to decompress another frame.

        After a decompression error, use #resetDecompressionContext() before re-using {@code dctx}, to return to clean state.
        """,

        LZ4F_dctx.p.IN("dctx", ""),
        void.p.OUT("dstBuffer", ""),
        AutoSize("dstBuffer")..Check(1)..size_t.p.INOUT("dstSizePtr", ""),
        void.const.p.IN("srcBuffer", ""),
        AutoSize("srcBuffer")..Check(1)..size_t.p.INOUT("srcSizePtr", ""),
        LZ4F_decompressOptions_t.const.p.IN("dOptPtr", ""),

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

        LZ4F_dctx.p.IN("dctx", ""),

        since = "1.8.0"
    )
}