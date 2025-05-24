/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package spng;

import org.lwjgl.generator.*

val spng_errno = "spng_errno".enumType
val spng_text_type = "spng_text_type".enumType
val spng_color_type = "spng_color_type".enumType
val spng_filter = "spng_filter".enumType
val spng_filter_choice = "spng_filter_choice".enumType
val spng_interlace_method = "spng_interlace_method".enumType
val spng_format = "spng_format".enumType
val spng_ctx_flags = "spng_ctx_flags".enumType
val spng_decode_flags = "spng_decode_flags".enumType
val spng_crc_action = "spng_crc_action".enumType
val spng_encode_flags = "spng_encode_flags".enumType

val spng_ihdr = struct(Module.SPNG, "SpngIhdr", nativeName = "spng_ihdr") {
    uint32_t("width")
    uint32_t("height")
    uint8_t("bit_depth")
    uint8_t("color_type")
    uint8_t("compression_method")
    uint8_t("filter_method")
    uint8_t("interlace_method")
}

val spng_plte_entry = struct(Module.SPNG, "SpngPlteEntry", nativeName = "spng_plte_entry") {
    uint8_t("red")
    uint8_t("green")
    uint8_t("blue")

    uint8_t("alpha") /* Reserved for internal use */
}

val spng_plte = struct(Module.SPNG, "SpngPlte", nativeName = "spng_plte") {
    uint32_t("n_entries")
    spng_plte_entry("entries")[256]
}

val spng_trns = struct(Module.SPNG, "SpngTrns", nativeName = "spng_trns") {
    uint16_t("gray")

    uint16_t("red")
    uint16_t("green")
    uint16_t("blue")

    uint32_t("n_type3_entries")
    uint8_t("type3_alpha")[256]
}

val spng_chrm_int = struct(Module.SPNG, "SpngChrmInt", nativeName = "spng_chrm_int") {
    uint32_t("white_point_x")
    uint32_t("white_point_y")
    uint32_t("red_x")
    uint32_t("red_y")
    uint32_t("green_x")
    uint32_t("green_y")
    uint32_t("blue_x")
    uint32_t("blue_y")
}

val spng_chrm = struct(Module.SPNG, "SpngChrm", nativeName = "spng_chrm") {
    double("white_point_x")
    double("white_point_y")
    double("red_x")
    double("red_y")
    double("green_x")
    double("green_y")
    double("blue_x")
    double("blue_y")
}

val spng_iccp = struct(Module.SPNG, "SpngIccp", nativeName = "spng_iccp") {
    char("profile_name")[80]
    size_t("profile_len")
    char.p("profile")
}

val spng_sbit = struct(Module.SPNG, "SpngSbit", nativeName = "spng_sbit") {
    uint8_t("grayscale_bits")
    uint8_t("red_bits")
    uint8_t("green_bits")
    uint8_t("blue_bits")
    uint8_t("alpha_bits")
}

val spng_text = struct(Module.SPNG, "SpngText", nativeName = "spng_text") {
    char("keyword")[80]
    int("type")

    size_t("length")
    char.p("text")

    uint8_t("compression_flag") /* iTXt only */
    uint8_t("compression_method") /* iTXt, ztXt only */
    char.p("language_tag") /* iTXt only */
    char.p("translated_keyword") /* iTXt only */
}

val spng_bkgd = struct(Module.SPNG, "SpngBkgd", nativeName = "spng_bkgd") {
    uint16_t("gray") /* Only for gray/gray alpha */
    uint16_t("red")
    uint16_t("green")
    uint16_t("blue")
    uint16_t("plte_index") /* Only for indexed color */
}

val spng_hist = struct(Module.SPNG, "SpngHist", nativeName = "spng_hist") {
    uint16_t("frequency")[256]
}

val spng_phys = struct(Module.SPNG, "SpngPhys", nativeName = "spng_phys") {
    uint32_t("ppu_x")
    uint32_t("ppu_y")
    uint8_t("unit_specifier")
}

val spng_splt_entry = struct(Module.SPNG, "SpngSpltEntry", nativeName = "spng_splt_entry") {
    uint16_t("red")
    uint16_t("green")
    uint16_t("blue")
    uint16_t("alpha")
    uint16_t("frequency")
}

val spng_splt = struct(Module.SPNG, "SpngSplt", nativeName = "spng_splt") {
    char("name")[80]
    uint8_t("sample_depth")
    uint32_t("n_entries")
    spng_splt_entry.p("entries")
}

val spng_time = struct(Module.SPNG, "SpngTime", nativeName = "spng_time") {
    uint16_t("year")
    uint8_t("month")
    uint8_t("day")
    uint8_t("hour")
    uint8_t("minute")
    uint8_t("second")
}

val spng_offs = struct(Module.SPNG, "SpngOffs", nativeName = "spng_offs") {
    int32_t("x")
    int32_t("y")
    uint8_t("unit_specifier")
}

val spng_exif = struct(Module.SPNG, "SpngExif", nativeName = "spng_exif") {
    size_t("length")
    char.p("data")
}

val spng_chunk = struct(Module.SPNG, "SpngChunk", nativeName = "spng_chunk") {
    size_t("offset")
    uint32_t("length")
    uint8_t("type")[4]
    uint32_t("crc")
}

val spng_location = "spng_location".enumType

val spng_unknown_chunk = struct(Module.SPNG, "SpngUnknownChunk", nativeName = "spng_unknown_chunk") {
    uint8_t("type")[4]
    size_t("length")
    void.p("data")
    spng_location("location")
}

val spng_option = "spng_option".enumType

val spng_malloc_fn = Module.SPNG.callback {
    void.p(
        "SpngMallocFn",

        size_t("size"),

        nativeType = "spng_malloc_fn"
    )
}

val spng_realloc_fn = Module.SPNG.callback {
    void.p(
        "SpngReallocFn",

        void.p("ptr"),
        size_t("size"),

        nativeType = "spng_realloc_fn"
    )
}

val spng_calloc_fn = Module.SPNG.callback {
    void.p(
        "SpngCallocFn",

        size_t("count"),
        size_t("size"),

        nativeType = "spng_calloc_fn"
    )
}

val spng_free_fn = Module.SPNG.callback {
    void(
        "SpngFreeFn",

        void.p("ptr"),

        nativeType = "spng_free_fn"
    )
}

val spng_alloc = struct(Module.SPNG, "SpngAlloc", nativeName = "spng_alloc") {
    spng_malloc_fn.p("malloc_fn")
    spng_realloc_fn.p("realloc_fn")
    spng_calloc_fn.p("calloc_fn")
    spng_free_fn.p("free_fn")
}

val spng_row_info = struct(Module.SPNG, "SpngRowInfo", nativeName = "spng_row_info") {
    uint32_t("scanline_idx")
    uint32_t("row_num") /* deinterlaced row index */
    int("pass")
    uint8_t("filter")
}

val spng_ctx = "spng_ctx".opaque

val spng_read_fn = Module.SPNG.callback {
    void(
        "SpngReadFn",

        spng_ctx.p("ctx"),
        void.p("user"),
        void.p("dest"),
        size_t("length"),

        nativeType = "spng_read_fn"
    )
}

val spng_write_fn = Module.SPNG.callback {
    void(
        "SpngWriteFn",

        spng_ctx.p("ctx"),
        void.p("user"),
        void.p("dest"),
        size_t("length"),

        nativeType = "spng_write_fn"
    )
}

val spng_rw_fn = Module.SPNG.callback {
    void(
        "SpngRwFn",

        spng_ctx.p("ctx"),
        void.p("user"),
        void.p("dest"),
        size_t("length"),

        nativeType = "spng_rw_fn"
    )
}
