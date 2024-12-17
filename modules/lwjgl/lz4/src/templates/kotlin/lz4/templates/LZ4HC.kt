/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4HC = "LZ4HC".nativeClass(Module.LZ4, prefix = "LZ4HC", prefixMethod = "LZ4_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4_HC_STATIC_LINKING_ONLY
#include "lz4hc.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "CLEVEL_MIN".."2",
        "CLEVEL_DEFAULT".."9",
        "CLEVEL_OPT_MIN".."10",
        "CLEVEL_MAX".."12"
    )

    IntConstant("DICTIONARY_LOGSIZE".."16")
    IntConstant("MAXD".."(1 << LZ4HC_DICTIONARY_LOGSIZE)")
    IntConstant("MAXD_MASK".."(LZ4HC_MAXD - 1)")

    IntConstant("HASH_LOG".."15")
    IntConstant("HASHTABLESIZE".."(1 << LZ4HC_HASH_LOG)")
    IntConstant("HASH_MASK".."(LZ4HC_HASHTABLESIZE - 1)")

    IntConstant("LZ4_STREAMHC_MINSIZE".."262200").noPrefix()

    int(
        "compress_HC",

        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        int("compressionLevel")
    )

    int("sizeofStateHC", void())

    int(
        "compress_HC_extStateHC",

        Unsafe..void.p("state"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("maxDstSize"),
        int("compressionLevel")
    )

    int(
        "compress_HC_destSize",

        Unsafe..void.p("stateHC"),
        char.const.p("src"),
        char.p("dst") ,
        AutoSize("src")..Check(1)..int.p("srcSizePtr"),
        AutoSize("dst")..int("targetDstSize"),
        int("compressionLevel")
    )

    LZ4_streamHC_t.p(
        "createStreamHC",
        void()
    )

    int(
        "freeStreamHC",

        LZ4_streamHC_t.p("streamHCPtr")
    )

    void(
        "resetStreamHC_fast",

        LZ4_streamHC_t.p("LZ4_streamHCPtr"),
        int("compressionLevel")
    )

    int(
        "loadDictHC",

        LZ4_streamHC_t.p("streamHCPtr"),
        char.const.p("dictionary"),
        AutoSize("dictionary")..int("dictSize")
    )

    int(
        "compress_HC_continue",

        LZ4_streamHC_t.p("streamHCPtr"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("maxDstSize")
    )

    int(
        "compress_HC_continue_destSize",

        LZ4_streamHC_t.p("streamHCPtr"),
        char.const.p("src"),
        char.p("dst"),
        AutoSize("src")..Check(1)..int.p("srcSizePtr"),
        AutoSize("dst")..int("targetDstSize")
    )

    int(
        "saveDictHC",

        LZ4_streamHC_t.p("streamHCPtr"),
        char.p("safeBuffer"),
        AutoSize("safeBuffer")..int("maxDictSize")
    )

    void(
        "attach_HC_dictionary",

        LZ4_streamHC_t.p("working_stream"),
        nullable..LZ4_streamHC_t.p.const("dictionary_stream")
    )

    LZ4_streamHC_t.p(
        "initStreamHC",

        void.p("buffer"),
        AutoSize("buffer")..size_t("size")
    )

    void(
        "setCompressionLevel",

        LZ4_streamHC_t.p("LZ4_streamHCPtr"),
        int("compressionLevel")
    )

    void(
        "favorDecompressionSpeed",

        LZ4_streamHC_t.p("LZ4_streamHCPtr"),
        intb("favor")
    )

    int(
        "compress_HC_extStateHC_fastReset",

        Unsafe..void.p("state"),
        char.p.const("src"),
        char.p("dst"),
        AutoSize("src")..int("srcSize"),
        AutoSize("dst")..int("dstCapacity"),
        int("compressionLevel")
    )
}