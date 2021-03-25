/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4

import org.lwjgl.generator.*

private val _LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "LZ4_stream_t_internal")
val LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "struct LZ4_stream_t_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_HASH_SIZE_U32")

    LZ4_u32("hashTable", "")["LZ4_HASH_SIZE_U32"]
    LZ4_u32("currentOffset", "")
    LZ4_u32("tableType", "")
    LZ4_byte.const.p("dictionary", "")
    _LZ4_stream_t_internal.p.const("dictCtx", "")
    LZ4_u32("dictSize", "")
}

val LZ4_streamDecode_t_internal = struct(Module.LZ4, "LZ4StreamDecodeInternal", nativeName = "LZ4_streamDecode_t_internal", mutable = false) {
    LZ4_byte.const.p("externalDict", "")
    size_t("extDictSize", "")
    LZ4_byte.const.p("prefixEnd", "")
    size_t("prefixSize", "")
}

val LZ4_stream_u = union(Module.LZ4, "LZ4Stream", nativeName = "LZ4_stream_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAMSIZE_VOIDP")

    void.p("table", "")["LZ4_STREAMSIZE_VOIDP"]
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

    LZ4_u32("hashTable", "")["LZ4HC_HASHTABLESIZE"]
    LZ4_u16("chainTable", "")["LZ4HC_MAXD"]
    LZ4_byte.const.p("end", "next block here to continue on current prefix")
    LZ4_byte.const.p("base", "All index relative to this position")
    LZ4_byte.const.p("dictBase", "alternate base for {@code extDict}")
    LZ4_u32("dictLimit", "below that point, need {@code extDict}")
    LZ4_u32("lowLimit", "below that point, no more {@code dict}")
    LZ4_u32("nextToUpdate", "index from which to continue dictionary update")
    short("compressionLevel", "")
    LZ4_i8("favorDecSpeed", "favor decompression speed if this flag set, otherwise, favor compression ratio")
    LZ4_i8("dirty", "stream has to be fully reset if this flag is set")
    _LZ4HC_CCtx_internal.p.const("dictCtx", "")
}

val LZ4_streamHC_u = union(Module.LZ4, "LZ4StreamHC", nativeName = "LZ4_streamHC_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.LZ4_STREAMHCSIZE_VOIDP")

    size_t("table", "")["LZ4_STREAMHCSIZE_VOIDP"]
    LZ4HC_CCtx_internal("internal_donotuse", "")
}