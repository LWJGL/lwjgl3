/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4

import org.lwjgl.generator.*

val LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "LZ4_stream_t_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_HASH_SIZE_U32")

    uint32_t.array("hashTable", "", size = "LZ4_HASH_SIZE_U32")
    uint32_t.member("currentOffset", "")
    uint32_t.member("initCheck", "")
    uint8_t.const.p.member("dictionary", "")
    uint8_t.p.member("bufferStart", "obsolete, used for {@code slideInputBuffer}")
    uint32_t.member("dictSize", "")
}

val LZ4_streamDecode_t_internal = struct(Module.LZ4, "LZ4StreamDecodeInternal", nativeName = "LZ4_streamDecode_t_internal", mutable = false) {
    uint8_t.const.p.member("externalDict", "")
    size_t.member("extDictSize", "")
    uint8_t.const.p.member("prefixEnd", "")
    size_t.member("prefixSize", "")
}

val LZ4_stream_u = union(Module.LZ4, "LZ4Stream", nativeName = "LZ4_stream_u", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAMSIZE_U64")

    unsigned_long_long.array("table", "", size = "LZ4_STREAMSIZE_U64")
    LZ4_stream_t_internal.member("internal_donotuse", "")
}

val LZ4_streamDecode_u = union(Module.LZ4, "LZ4StreamDecode", nativeName = "LZ4_streamDecode_u", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAMDECODESIZE_U64")

    unsigned_long_long.array("table", "", size = "LZ4_STREAMDECODESIZE_U64")
    LZ4_streamDecode_t_internal.member("internal_donotuse", "")
}

val LZ4HC_CCtx_internal = struct(Module.LZ4, "LZ4HCCCtxInternal", nativeName = "LZ4HC_CCtx_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.*")

    uint32_t.array("hashTable", "", size = "LZ4HC_HASHTABLESIZE")
    uint16_t.array("chainTable", "", size = "LZ4HC_MAXD")
    uint8_t.const.p.member("end", "next block here to continue on current prefix")
    uint8_t.const.p.member("base", "All index relative to this position")
    uint8_t.const.p.member("dictBase", "alternate base for {@code extDict}")
    uint8_t.p.member("inputBuffer", "deprecated")
    uint32_t.member("dictLimit", "below that point, need {@code extDict}")
    uint32_t.member("lowLimit", "below that point, no more {@code dict}")
    uint32_t.member("nextToUpdate", "index from which to continue dictionary update")
    int.member("compressionLevel", "")
}

val LZ4_streamHC_u = union(Module.LZ4, "LZ4StreamHC", nativeName = "LZ4_streamHC_u", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.LZ4_STREAMHCSIZE_SIZET")

    size_t.array("table", "", size = "LZ4_STREAMHCSIZE_SIZET")
    LZ4HC_CCtx_internal.member("internal_donotuse", "")
}