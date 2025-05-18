/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package spng.templates;

import org.lwjgl.generator.*
import spng.*

val spng = "SPNG".nativeClass(Module.SPNG, prefix = "SPNG", prefixMethod = "spng_") {
    // This is pretty ugly, not sure if there is a better way to handle this.
    nativeDirective("""
#define SPNG_STATIC
#define SPNG_USE_MINIZ
#define SPNG_SSE 4

#include "spng.c"""")

    IntConstant(
        "VERSION_MAJOR".."0",
        "VERSION_MINOR".."7",
        "VERSION_PATCH".."4"
    )

    EnumConstant(
        "IO_ERROR".enum("-2"),
        "IO_EOF".enum("-1"),
        "OK".enum("0"),
        "EINVAL".enum,
        "EMEM".enum,
        "EOVERFLOW".enum,
        "ESIGNATURE".enum,
        "EWIDTH".enum,
        "EHEIGHT".enum,
        "EUSER_WIDTH".enum,
        "EUSER_HEIGHT".enum,
        "EBIT_DEPTH".enum,
        "ECOLOR_TYPE".enum,
        "ECOMPRESSION_METHOD".enum,
        "EFILTER_METHOD".enum,
        "EINTERLACE_METHOD".enum,
        "EIHDR_SIZE".enum,
        "ENOIHDR".enum,
        "ECHUNK_POS".enum,
        "ECHUNK_SIZE".enum,
        "ECHUNK_CRC".enum,
        "ECHUNK_TYPE".enum,
        "ECHUNK_UNKNOWN_CRITICAL".enum,
        "EDUP_PLTE".enum,
        "EDUP_CHRM".enum,
        "EDUP_GAMA".enum,
        "EDUP_ICCP".enum,
        "EDUP_SBIT".enum,
        "EDUP_SRGB".enum,
        "EDUP_BKGD".enum,
        "EDUP_HIST".enum,
        "EDUP_TRNS".enum,
        "EDUP_PHYS".enum,
        "EDUP_TIME".enum,
        "EDUP_OFFS".enum,
        "EDUP_EXIF".enum,
        "ECHRM".enum,
        "EPLTE_IDX".enum,
        "ETRNS_COLOR_TYPE".enum,
        "ETRNS_NO_PLTE".enum,
        "EGAMA".enum,
        "EICCP_NAME".enum,
        "EICCP_COMPRESSION_METHOD".enum,
        "ESBIT".enum,
        "ESRGB".enum,
        "ETEXT".enum,
        "ETEXT_KEYWORD".enum,
        "EZTXT".enum,
        "EZTXT_COMPRESSION_METHOD".enum,
        "EITXT".enum,
        "EITXT_COMPRESSION_FLAG".enum,
        "EITXT_COMPRESSION_METHOD".enum,
        "EITXT_LANG_TAG".enum,
        "EITXT_TRANSLATED_KEY".enum,
        "EBKGD_NO_PLTE".enum,
        "EBKGD_PLTE_IDX".enum,
        "EHIST_NO_PLTE".enum,
        "EPHYS".enum,
        "ESPLT_NAME".enum,
        "ESPLT_DUP_NAME".enum,
        "ESPLT_DEPTH".enum,
        "ETIME".enum,
        "EOFFS".enum,
        "EEXIF".enum,
        "EIDAT_TOO_SHORT".enum,
        "EIDAT_STREAM".enum,
        "EZLIB".enum,
        "EFILTER".enum,
        "EBUFSIZ".enum,
        "EIO".enum,
        "EOF".enum,
        "EBUF_SET".enum,
        "EBADSTATE".enum,
        "EFMT".enum,
        "EFLAGS".enum,
        "ECHUNKAVAIL".enum,
        "ENCODE_ONLY".enum,
        "EOI".enum,
        "ENOPLTE".enum,
        "ECHUNK_LIMITS".enum,
        "EZLIB_INIT".enum,
        "ECHUNK_STDLEN".enum,
        "EINTERNAL".enum,
        "ECTXTYPE".enum,
        "ENOSRC".enum,
        "ENODST".enum,
        "EOPSTATE".enum,
        "ENOTFINAL".enum
    )

    EnumConstant(
        "TEXT".enum("1"),
        "ZTXT".enum("2"),
        "ITXT".enum("3")
    )

    EnumConstantByte(
        "COLOR_TYPE_GRAYSCALE".enumByte("0"),
        "COLOR_TYPE_TRUECOLOR".enumByte("2"),
        "COLOR_TYPE_INDEXED".enumByte("3"),
        "COLOR_TYPE_GRAYSCALE_ALPHA".enumByte("4"),
        "COLOR_TYPE_TRUECOLOR_ALPHA".enumByte("6")
    )

    EnumConstantByte(
        "FILTER_NONE".enumByte("0"),
        "FILTER_SUB".enumByte("1"),
        "FILTER_UP".enumByte("2"),
        "FILTER_AVERAGE".enumByte("3"),
        "FILTER_PAETH".enumByte("4")
    )

    EnumConstant(
        "DISABLE_FILTERING".enum("0"),
        "FILTER_CHOICE_NONE".enum("8"),
        "FILTER_CHOICE_SUB".enum("16"),
        "FILTER_CHOICE_UP".enum("32"),
        "FILTER_CHOICE_AVG".enum("64"),
        "FILTER_CHOICE_PAETH".enum("128"),
        "FILTER_CHOICE_ALL".enum("(8|16|32|64|128)")
    )

    EnumConstantByte(
        "INTERLACE_NONE".enumByte("0"),
        "INTERLACE_ADAM7".enumByte("1")
    )

    /* Channels are always in byte-order */
    EnumConstant(
        "FMT_RGBA8".enum("1"),
        "FMT_RGBA16".enum("2"),
        "FMT_RGB8".enum("4"),

        /* Partially implemented, see documentation */
        "FMT_GA8".enum("16"),
        "FMT_GA16".enum("32"),
        "FMT_G8".enum("64"),

        /* No conversion or scaling */
        "FMT_PNG".enum("256"),
        "FMT_RAW".enum("512")  /* big-endian (everything else is host-endian) */
    )

    EnumConstant(
        "CTX_IGNORE_ADLER32".enum("1"), /* Ignore checksum in DEFLATE streams */
        "CTX_ENCODER".enum("2") /* Create an encoder context */
    )

    EnumConstant(
        "DECODE_USE_TRNS".enum("1"), /* Deprecated */
        "DECODE_USE_GAMA".enum("2"), /* Deprecated */
        "DECODE_USE_SBIT".enum("8"), /* Undocumented */

        "DECODE_TRNS".enum("1"), /* Apply transparency */
        "DECODE_GAMMA".enum("2"), /* Apply gamma correction */
        "DECODE_PROGRESSIVE".enum("256") /* Initialize for progressive reads */
    )

    EnumConstant(
        /* Default for critical chunks */
        "CRC_ERROR".enum("0"),

        /* Discard chunk, invalid for critical chunks.
           Since v0.6.2: default for ancillary chunks */
        "CRC_DISCARD".enum("1"),

        /* Ignore and don't calculate checksum.
           Since v0.6.2: also ignores checksums in DEFLATE streams */
        "CRC_USE".enum("2")
    )

    EnumConstant(
        "ENCODE_PROGRESSIVE".enum("1"), /* Initialize for progressive writes */
        "ENCODE_FINALIZE".enum("2") /* Finalize PNG after encoding image */
    )

    EnumConstant(
        "AFTER_IHDR".enum("1"),
        "AFTER_PLTE".enum("2"),
        "AFTER_IDAT".enum("8")
    )

    EnumConstant(
        "KEEP_UNKNOWN_CHUNKS".enum("1"),

        "IMG_COMPRESSION_LEVEL".enum,
        "IMG_WINDOW_BITS".enum,
        "IMG_MEM_LEVEL".enum,
        "IMG_COMPRESSION_STRATEGY".enum,

        "TEXT_COMPRESSION_LEVEL".enum,
        "TEXT_WINDOW_BITS".enum,
        "TEXT_MEM_LEVEL".enum,
        "TEXT_COMPRESSION_STRATEGY".enum,

        "FILTER_CHOICE".enum,
        "CHUNK_COUNT_LIMIT".enum,
        "ENCODE_TO_BUFFER".enum,
    )

    spng_ctx.p(
        "ctx_new",

        int("flags")
    )
    spng_ctx.p(
        "ctx_new2",

        spng_alloc.p("alloc"),
        int("flags")
    )
    void(
        "ctx_free",

        spng_ctx.p("ctx")
    )

    int(
        "set_png_buffer",

        spng_ctx.p("ctx"),
        void.const.p("buf"),
        AutoSize("buf")..size_t("size")
    )
    int(
        "set_png_stream",

        spng_ctx.p("ctx"),
        spng_rw_fn("rw_func"),
        nullable..opaque_p("user")
    )

    /*
    int(
        "set_png_file",

        spng_ctx.p("ctx"),
        FILE.p("file")
    )
    */

    void.p(
        "get_png_buffer",

        spng_ctx.p("ctx"),
        AutoSizeResult..Check(1)..size_t.p("len"),
        Check(1)..int.p("error")
    )

    int(
        "set_image_limits",

        spng_ctx.p("ctx"),
        uint32_t("width"),
        uint32_t("height")
    )
    int(
        "get_image_limits",

        spng_ctx.p("ctx"),
        Check(1)..uint32_t.p("width"),
        Check(1)..uint32_t.p("height")
    )

    int(
        "set_chunk_limits",

        spng_ctx.p("ctx"),
        size_t("chunk_size"),
        size_t("cache_size")
    )
    int(
        "get_chunk_limits",

        spng_ctx.p("ctx"),
        Check(1)..size_t.p("chunk_size"),
        Check(1)..size_t.p("cache_size")
    )

    int(
        "set_crc_action",

        spng_ctx.p("ctx"),
        int("critical"),
        int("ancillary")
    )

    int(
        "set_option",

        spng_ctx.p("ctx"),
        spng_option("option"),
        int("value")
    )
    int(
        "get_option",

        spng_ctx.p("ctx"),
        spng_option("option"),
        Check(1)..int.p("value")
    )

    int(
        "decoded_image_size",

        spng_ctx.p("ctx"),
        int("fmt"),
        Check(1)..size_t.p("len")
    )

    /* Decode */
    int(
        "decode_image",

        spng_ctx.p("ctx"),
        void.p("out"),
        AutoSize("out")..size_t("len"),
        int("fmt"),
        int("flags")
    )

    /* Progressive decode */
    int(
        "decode_scanline",

        spng_ctx.p("ctx"),
        void.p("out"),
        AutoSize("out")..size_t("len")
    )
    int(
        "decode_row",

        spng_ctx.p("ctx"),
        void.p("out"),
        AutoSize("out")..size_t("len")
    )
    int(
        "decode_chunks",

        spng_ctx.p("ctx")
    )

    /* Encode/decode */
    int(
        "get_row_info",

        spng_ctx.p("ctx"),
        spng_row_info.p("row_info")
    )

    /* Encode */
    int(
        "encode_image",

        spng_ctx.p("ctx"),
        void.const.p("img"),
        AutoSize("img")..size_t("len"),
        int("fmt"),
        int("flags")
    )

    /* Progressive encode */
    int(
        "encode_scanline",

        spng_ctx.p("ctx"),
        void.const.p("scanline"),
        AutoSize("scanline")..size_t("len")
    )
    int(
        "encode_row",

        spng_ctx.p("ctx"),
        void.const.p("row"),
        AutoSize("row")..size_t("len")
    )
    int(
        "encode_chunks",

        spng_ctx.p("ctx")
    )

    int(
        "get_ihdr",

        spng_ctx.p("ctx"),
        spng_ihdr.p("ihdr")
    )
    int(
        "get_plte",

        spng_ctx.p("ctx"),
        spng_plte.p("plte")
    )
    int(
        "get_trns",

        spng_ctx.p("ctx"),
        spng_trns.p("trns")
    )
    int(
        "get_chrm",

        spng_ctx.p("ctx"),
        spng_chrm.p("chrm")
    )
    int(
        "get_chrm_int",

        spng_ctx.p("ctx"),
        spng_chrm_int.p("chrm_int")
    )
    int(
        "get_gama",

        spng_ctx.p("ctx"),
        Check(1)..double.p("gamma")
    )
    int(
        "get_gama_int",

        spng_ctx.p("ctx"),
        Check(1)..uint32_t.p("gama_int")
    )
    int(
        "get_iccp",

        spng_ctx.p("ctx"),
        spng_iccp.p("iccp")
    )
    int(
        "get_sbit",

        spng_ctx.p("ctx"),
        spng_sbit.p("sbit")
    )
    int(
        "get_srgb",

        spng_ctx.p("ctx"),
        Check(1)..uint8_t.p("rendering_intent")
    )
    int(
        "get_text",

        spng_ctx.p("ctx"),
        spng_text.p("text"),
        Check(1)..uint32_t.p("n_text")
    )
    int(
        "get_bkgd",

        spng_ctx.p("ctx"),
        spng_bkgd.p("bkgd")
    )
    int(
        "get_hist",

        spng_ctx.p("ctx"),
        spng_hist.p("hist")
    )
    int(
        "get_phys",

        spng_ctx.p("ctx"),
        spng_phys.p("phys")
    )
    int(
        "get_splt",

        spng_ctx.p("ctx"),
        spng_splt.p("splt"),
        Check(1)..uint32_t.p("n_splt")
    )
    int(
        "get_time",

        spng_ctx.p("ctx"),
        spng_time.p("time")
    )
    int(
        "get_unknown_chunks",

        spng_ctx.p("ctx"),
        spng_unknown_chunk.p("chunks"),
        Check(1)..uint32_t.p("n_chunks")
    )

    /* Official extensions */
    int(
        "get_offs",

        spng_ctx.p("ctx"),
        spng_offs.p("offs")
    )
    int(
        "get_exif",

        spng_ctx.p("ctx"),
        spng_exif.p("exif")
    )

    int(
        "set_ihdr",

        spng_ctx.p("ctx"),
        spng_ihdr.p("ihdr")
    )
    int(
        "set_plte",

        spng_ctx.p("ctx"),
        spng_plte.p("plte")
    )
    int(
        "set_trns",

        spng_ctx.p("ctx"),
        spng_trns.p("trns")
    )
    int(
        "set_chrm",

        spng_ctx.p("ctx"),
        spng_chrm.p("chrm")
    )
    int(
        "set_chrm_int",

        spng_ctx.p("ctx"),
        spng_chrm_int.p("chrm_int")
    )
    int(
        "set_gama",

        spng_ctx.p("ctx"),
        double("gamma")
    )
    int(
        "set_gama_int",

        spng_ctx.p("ctx"),
        uint32_t("gamma")
    )
    int(
        "set_iccp",

        spng_ctx.p("ctx"),
        spng_iccp.p("iccp")
    )
    int(
        "set_sbit",

        spng_ctx.p("ctx"),
        spng_sbit.p("sbit")
    )
    int(
        "set_srgb",

        spng_ctx.p("ctx"),
        uint8_t("rendering_intent")
    )
    int(
        "set_text",

        spng_ctx.p("ctx"),
        spng_text.p("text"),
        uint32_t("n_text")
    )
    int(
        "set_bkgd",

        spng_ctx.p("ctx"),
        spng_bkgd.p("bkgd")
    )
    int(
        "set_hist",

        spng_ctx.p("ctx"),
        spng_hist.p("hist")
    )
    int(
        "set_phys",

        spng_ctx.p("ctx"),
        spng_phys.p("phys")
    )
    int(
        "set_splt",

        spng_ctx.p("ctx"),
        spng_splt.p("splt"),
        uint32_t("n_splt")
    )
    int(
        "set_time",

        spng_ctx.p("ctx"),
        spng_time.p("time")
    )
    int(
        "set_unknown_chunks",

        spng_ctx.p("ctx"),
        spng_unknown_chunk.p("chunks"),
        AutoSize("chunks")..uint32_t("n_chunks")
    )

    /* Official extensions */
    int(
        "set_offs",

        spng_ctx.p("ctx"),
        spng_offs.p("offs")
    )
    int(
        "set_exif",

        spng_ctx.p("ctx"),
        spng_exif.p("exif")
    )

    charASCII.const.p("strerror", int("err"))
    charASCII.const.p("version_string", void())
}
