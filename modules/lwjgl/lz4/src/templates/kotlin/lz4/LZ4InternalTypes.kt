/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4

import org.lwjgl.generator.*

private val _LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "LZ4_stream_t_internal")
val LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "struct LZ4_stream_t_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_HASH_SIZE_U32")

    uint32_t("hashTable", "")["LZ4_HASH_SIZE_U32"]
    uint32_t("currentOffset", "")
    uint16_t("dirty", "")
    uint16_t("tableType", "")
    uint8_t.const.p("dictionary", "")
    _LZ4_stream_t_internal.p.const("dictCtx", "")
    uint32_t("dictSize", "")
}

val LZ4_streamDecode_t_internal = struct(Module.LZ4, "LZ4StreamDecodeInternal", nativeName = "LZ4_streamDecode_t_internal", mutable = false) {
    uint8_t.const.p("externalDict", "")
    size_t("extDictSize", "")
    uint8_t.const.p("prefixEnd", "")
    size_t("prefixSize", "")
}

val LZ4_stream_u = union(Module.LZ4, "LZ4Stream", nativeName = "LZ4_stream_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAMSIZE_U64")

    unsigned_long_long("table", "")["LZ4_STREAMSIZE_U64"]
    LZ4_stream_t_internal("internal_donotuse", "")
}

val LZ4_streamDecode_u = union(Module.LZ4, "LZ4StreamDecode", nativeName = "LZ4_streamDecode_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAMDECODESIZE_U64")

    unsigned_long_long("table", "")["LZ4_STREAMDECODESIZE_U64"]
    LZ4_streamDecode_t_internal("internal_donotuse", "")
}

private val _LZ4HC_CCtx_internal = struct(Module.LZ4, "LZ4HCCCtxInternal", nativeName = "LZ4HC_CCtx_internal")
val LZ4HC_CCtx_internal = struct(Module.LZ4, "LZ4HCCCtxInternal", nativeName = "struct LZ4HC_CCtx_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.*")

    uint32_t("hashTable", "")["LZ4HC_HASHTABLESIZE"]
    uint16_t("chainTable", "")["LZ4HC_MAXD"]
    uint8_t.const.p("end", "next block here to continue on current prefix")
    uint8_t.const.p("base", "All index relative to this position")
    uint8_t.const.p("dictBase", "alternate base for {@code extDict}")
    uint32_t("dictLimit", "below that point, need {@code extDict}")
    uint32_t("lowLimit", "below that point, no more {@code dict}")
    uint32_t("nextToUpdate", "index from which to continue dictionary update")
    short("compressionLevel", "")
    int8_t("favorDecSpeed", "favor decompression speed if this flag set, otherwise, favor compression ratio")
    int8_t("dirty", "stream has to be fully reset if this flag is set")
    _LZ4HC_CCtx_internal.p.const("dictCtx", "")
}

val LZ4_streamHC_u = union(Module.LZ4, "LZ4StreamHC", nativeName = "LZ4_streamHC_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.LZ4_STREAMHCSIZE_SIZET")

    size_t("table", "")["LZ4_STREAMHCSIZE_SIZET"]
    LZ4HC_CCtx_internal("internal_donotuse", "")
}