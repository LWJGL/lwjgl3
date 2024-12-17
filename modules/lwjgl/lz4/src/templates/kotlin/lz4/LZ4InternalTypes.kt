/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4

import org.lwjgl.generator.*

private val _LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "LZ4_stream_t_internal")
val LZ4_stream_t_internal = struct(Module.LZ4, "LZ4StreamInternal", nativeName = "struct LZ4_stream_t_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_HASH_SIZE_U32")

    LZ4_u32("hashTable")["LZ4_HASH_SIZE_U32"]
    LZ4_byte.const.p("dictionary")
    _LZ4_stream_t_internal.p.const("dictCtx")
    LZ4_u32("currentOffset")
    LZ4_u32("tableType")
    LZ4_u32("dictSize")
}

val LZ4_streamDecode_t_internal = struct(Module.LZ4, "LZ4StreamDecodeInternal", nativeName = "LZ4_streamDecode_t_internal", mutable = false) {
    LZ4_byte.const.p("externalDict")
    LZ4_byte.const.p("prefixEnd")
    size_t("extDictSize")
    size_t("prefixSize")
}

val LZ4_stream_u = union(Module.LZ4, "LZ4Stream", nativeName = "LZ4_stream_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAM_MINSIZE")

    void.p("table")["LZ4_STREAM_MINSIZE"]
    LZ4_stream_t_internal("internal_donotuse")
}

val LZ4_streamDecode_u = union(Module.LZ4, "LZ4StreamDecode", nativeName = "LZ4_streamDecode_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4.LZ4_STREAMDECODE_MINSIZE")

    char("minStateSize")["LZ4_STREAMDECODE_MINSIZE"]
    LZ4_streamDecode_t_internal("internal_donotuse")
}

private val _LZ4HC_CCtx_internal = struct(Module.LZ4, "LZ4HCCCtxInternal", nativeName = "LZ4HC_CCtx_internal")
val LZ4HC_CCtx_internal = struct(Module.LZ4, "LZ4HCCCtxInternal", nativeName = "struct LZ4HC_CCtx_internal", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.*")

    LZ4_u32("hashTable")["LZ4HC_HASHTABLESIZE"]
    LZ4_u16("chainTable")["LZ4HC_MAXD"]
    LZ4_byte.const.p("end")
    LZ4_byte.const.p("prefixStart")
    LZ4_byte.const.p("dictStart")
    LZ4_u32("dictLimit")
    LZ4_u32("lowLimit")
    LZ4_u32("nextToUpdate")
    short("compressionLevel")
    LZ4_i8("favorDecSpeed")
    LZ4_i8("dirty")
    _LZ4HC_CCtx_internal.p.const("dictCtx")
}

val LZ4_streamHC_u = union(Module.LZ4, "LZ4StreamHC", nativeName = "LZ4_streamHC_t", mutable = false) {
    javaImport("static org.lwjgl.util.lz4.LZ4HC.LZ4_STREAMHC_MINSIZE")

    char("minStateSize")["LZ4_STREAMHC_MINSIZE"];
    LZ4HC_CCtx_internal("internal_donotuse")
}