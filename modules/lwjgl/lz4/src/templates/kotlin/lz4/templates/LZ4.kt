/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4 = "LZ4".nativeClass(Module.LZ4, prefix = "LZ4", prefixMethod = "LZ4_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4_STATIC_LINKING_ONLY
#include "lz4.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "VERSION_MAJOR".."1",
        "VERSION_MINOR".."10",
        "VERSION_RELEASE".."0"
    )

    IntConstant("VERSION_NUMBER".."(LZ4_VERSION_MAJOR *100*100 + LZ4_VERSION_MINOR *100 + LZ4_VERSION_RELEASE)")
    StringConstant("VERSION_STRING".."""LZ4_VERSION_MAJOR + "." + LZ4_VERSION_MINOR + "." + LZ4_VERSION_RELEASE""")

    int("versionNumber", void())
    Nonnull..charASCII.const.p("versionString", void())

   IntConstant(
       "MEMORY_USAGE_MIN".."10",
       "MEMORY_USAGE_DEFAULT".."14",
       "MEMORY_USAGE_MAX".."20"
   )

    IntConstant(
        "MEMORY_USAGE".."LZ4_MEMORY_USAGE_DEFAULT"
    )

    IntConstant(
        "MAX_INPUT_SIZE"..0x7E000000
    )

    IntConstant("HASHLOG".."(LZ4_MEMORY_USAGE - 2)")
    IntConstant("HASHTABLESIZE".."(1 << LZ4_MEMORY_USAGE)")
    IntConstant("HASH_SIZE_U32".."(1 << LZ4_HASHLOG)")

    IntConstant("STREAM_MINSIZE".."(1 << LZ4_MEMORY_USAGE) + 32")
    IntConstant("STREAMDECODE_MINSIZE".."32")

    IntConstant("DISTANCE_MAX".."64")

    int(
        "compress_default",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity")
    )

    int(
        "decompress_safe",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("compressedSize"),
        AutoSize("dst")..int("dstCapacity")
    )

    macro(expression = "LZ4_MAX_INPUT_SIZE < isize ? 0 : isize + isize / 255 + 16")..int(
        "COMPRESSBOUND",

        int("isize")
    )

    int(
        "compressBound",

        int("inputSize")
    )

    int(
        "compress_fast",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        int("acceleration")
    )

    int("sizeofState", void())

    int(
        "compress_fast_extState",

        Unsafe..void.p("state"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        int("acceleration")
    )

    int(
        "compress_destSize",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..Check(1)..int.p("srcSizePtr"),
        AutoSize("dst")..int("targetDstSize")
    )

    int(
        "decompress_safe_partial",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("compressedSize"),
        int("targetOutputSize"),
        AutoSize("dst")..int("dstCapacity")
    )

    LZ4_stream_t.p(
        "createStream",
        void()
    )

    int(
        "freeStream",

        LZ4_stream_t.p("streamPtr")
    )

    void(
        "resetStream_fast",

        LZ4_stream_t.p("streamPtr")
    )

    int(
        "loadDict",

        LZ4_stream_t.p("streamPtr"),
        nullable..char.const.p("dictionary"),
        AutoSize("dictionary")..int("dictSize")
    )

    int(
        "loadDictSlow",

        LZ4_stream_t.p("streamPtr"),
        nullable..char.const.p("dictionary"),
        AutoSize("dictionary")..int("dictSize")
    )

    void(
        "attach_dictionary",

        LZ4_stream_t.p("workingStream"),
        nullable..LZ4_stream_t.const.p("dictionaryStream")
    )

    int(
        "compress_fast_continue",

        LZ4_stream_t.p("streamPtr"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        int("acceleration")
    )

    int(
        "saveDict",

        LZ4_stream_t.p("streamPtr"),
        char.p("safeBuffer"),
        AutoSize("safeBuffer")..int("maxDictSize")
    )

    LZ4_streamDecode_t.p(
        "createStreamDecode",
        void()
    )

    int(
        "freeStreamDecode",

        LZ4_streamDecode_t.p("LZ4_stream")
    )

    intb(
        "setStreamDecode",

        LZ4_streamDecode_t.p("LZ4_streamDecode"),
        char.const.p("dictionary"),
        AutoSize("dictionary")..int("dictSize")
    )

    int(
        "decoderRingBufferSize",

        int("maxBlockSize")
    )

    customMethod(
        """
    /** For static allocation; {@code maxBlockSize} presumed valid. */
    public static int LZ4_DECODER_RING_BUFFER_SIZE(int maxBlockSize) {
        return 65536 + 14 + maxBlockSize;
    }""")

    int(
        "decompress_safe_continue",

        LZ4_streamDecode_t.p("LZ4_streamDecode"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity")
    )

    int(
        "decompress_safe_usingDict",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        char.const.p("dictStart"),
        AutoSize("dictStart")..int("dictSize")
    )

    int(
        "decompress_safe_partial_usingDict",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("compressedSize"),
        int("targetOutputSize"),
        AutoSize("dst")..int("maxOutputSize"),
        char.const.p("dictStart"),
        AutoSize("dictStart")..int("dictSize")
    )

    int(
        "compress_fast_extState_fastReset",

        Unsafe..void.p("state"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        int("acceleration")
    )

    int(
        "compress_destSize_extState",

        Unsafe..void.p("state"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..Check(1)..int.p("srcSizePtr"),
        AutoSize("dst")..int("targetDstSize"),
        int("acceleration")
    )

    LZ4_stream_t.p(
        "initStream",

        void.p("stateBuffer"),
        AutoSize("stateBuffer")..size_t("size")
    )

    macro(expression = "(compressedSize >>> 8) + 32")..int(
        "DECOMPRESS_INPLACE_MARGIN",

        int("compressedSize")
    )

    macro(expression = "decompressedSize + LZ4_DECOMPRESS_INPLACE_MARGIN(decompressedSize)")..int(
        "DECOMPRESS_INPLACE_BUFFER_SIZE",

        int("decompressedSize")
    )

    macro(expression = "LZ4_DISTANCE_MAX + 32")..int(
        "COMPRESS_INPLACE_MARGIN",

        void()
    )

    macro(expression = "maxCompressedSize + LZ4_COMPRESS_INPLACE_MARGIN()")..int(
        "COMPRESS_INPLACE_BUFFER_SIZE",

        int("maxCompressedSize")
    )
}