/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package spng;

import org.lwjgl.generator.*

val spng_ctx = "spng_ctx".opaque

val spng_option = "enum spng_option".enumType
val spng_location = "spng_location".enumType

val spng_ihdr = struct(Module.SPNG, "spng_ihdr", nativeName = "struct spng_ihdr") {
    uint32_t("width")
    uint32_t("height")
    uint8_t("bit_depth")
    uint8_t("color_type")
    uint8_t("compression_method")
    uint8_t("filter_method")
    uint8_t("interlace_method")
}

val spng_plte_entry = struct(Module.SPNG, "spng_plte_entry", nativeName = "struct spng_plte_entry") {
    uint8_t("red")
    uint8_t("green")
    uint8_t("blue")

    uint8_t("alpha") /* Reserved for internal use */
}

val spng_plte = struct(Module.SPNG, "spng_plte", nativeName = "struct spng_plte") {
    AutoSize("entries")..uint32_t("n_entries")
    spng_plte_entry("entries")[256]
}

val spng_trns = struct(Module.SPNG, "spng_trns", nativeName = "struct spng_trns") {
    uint16_t("gray")

    uint16_t("red")
    uint16_t("green")
    uint16_t("blue")

    AutoSize("type3_alpha")..uint32_t("n_type3_entries")
    uint8_t("type3_alpha")[256]
}

val spng_chrm_int = struct(Module.SPNG, "spng_chrm_int", nativeName = "struct spng_chrm_int") {
    uint32_t("white_point_x")
    uint32_t("white_point_y")
    uint32_t("red_x")
    uint32_t("red_y")
    uint32_t("green_x")
    uint32_t("green_y")
    uint32_t("blue_x")
    uint32_t("blue_y")
}

val spng_chrm = struct(Module.SPNG, "spng_chrm", nativeName = "struct spng_chrm") {
    double("white_point_x")
    double("white_point_y")
    double("red_x")
    double("red_y")
    double("green_x")
    double("green_y")
    double("blue_x")
    double("blue_y")
}

val spng_iccp = struct(Module.SPNG, "spng_iccp", nativeName = "struct spng_iccp") {
    charASCII("profile_name")[80]
    AutoSize("profile")..size_t("profile_len")
    char.p("profile")
}

val spng_sbit = struct(Module.SPNG, "spng_sbit", nativeName = "struct spng_sbit") {
    uint8_t("grayscale_bits")
    uint8_t("red_bits")
    uint8_t("green_bits")
    uint8_t("blue_bits")
    uint8_t("alpha_bits")
}

val spng_text = struct(Module.SPNG, "spng_text", nativeName = "struct spng_text") {
    charASCII("keyword")[80]
    int("type")

    AutoSize("text")..size_t("length")
    charASCII.p("text")

    uint8_t("compression_flag") /* iTXt only */
    uint8_t("compression_method") /* iTXt, ztXt only */
    charASCII.p("language_tag") /* iTXt only */
    charASCII.p("translated_keyword") /* iTXt only */
}

val spng_bkgd = struct(Module.SPNG, "spng_bkgd", nativeName = "struct spng_bkgd") {
    uint16_t("gray") /* Only for gray/gray alpha */
    uint16_t("red")
    uint16_t("green")
    uint16_t("blue")
    uint16_t("plte_index") /* Only for indexed color */
}

val spng_hist = struct(Module.SPNG, "spng_hist", nativeName = "struct spng_hist") {
    uint16_t("frequency")[256]
}

val spng_phys = struct(Module.SPNG, "spng_phys", nativeName = "struct spng_phys") {
    uint32_t("ppu_x")
    uint32_t("ppu_y")
    uint8_t("unit_specifier")
}

val spng_splt_entry = struct(Module.SPNG, "spng_splt_entry", nativeName = "struct spng_splt_entry") {
    uint16_t("red")
    uint16_t("green")
    uint16_t("blue")
    uint16_t("alpha")
    uint16_t("frequency")
}

val spng_splt = struct(Module.SPNG, "spng_splt", nativeName = "struct spng_splt") {
    charASCII("name")[80]
    uint8_t("sample_depth")
    AutoSize("entries")..uint32_t("n_entries")
    spng_splt_entry.p("entries")
}

val spng_time = struct(Module.SPNG, "spng_time", nativeName = "struct spng_time") {
    uint16_t("year")
    uint8_t("month")
    uint8_t("day")
    uint8_t("hour")
    uint8_t("minute")
    uint8_t("second")
}

val spng_offs = struct(Module.SPNG, "spng_offs", nativeName = "struct spng_offs") {
    int32_t("x")
    int32_t("y")
    uint8_t("unit_specifier")
}

val spng_exif = struct(Module.SPNG, "spng_exif", nativeName = "struct spng_exif") {
    AutoSize("data")..size_t("length")
    char.p("data")
}

val spng_chunk = struct(Module.SPNG, "spng_chunk", nativeName = "struct spng_chunk") {
    size_t("offset")
    uint32_t("length")
    uint8_t("type")[4]
    uint32_t("crc")
}


val spng_unknown_chunk = struct(Module.SPNG, "spng_unknown_chunk", nativeName = "struct spng_unknown_chunk") {
    uint8_t("type")[4]
    AutoSize("data")..size_t("length")
    void.p("data")
    spng_location("location")
}

val spng_malloc_fn = Module.SPNG.callback {
    void.p(
        "spng_malloc_fn",

        AutoSizeResult..size_t("size"),

        nativeType = "spng_malloc_fn"
    )
}

val spng_realloc_fn = Module.SPNG.callback {
    void.p(
        "spng_realloc_fn",

        nullable..void.p("ptr"),
        AutoSizeResult..size_t("size"),

        nativeType = "spng_realloc_fn"
    )
}

val spng_calloc_fn = Module.SPNG.callback {
    void.p(
        "spng_calloc_fn",

        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size"),

        nativeType = "spng_calloc_fn"
    )
}

val spng_free_fn = Module.SPNG.callback {
    void(
        "spng_free_fn",

        opaque_p("ptr"),

        nativeType = "spng_free_fn"
    )
}

val spng_alloc = struct(Module.SPNG, "spng_alloc", nativeName = "struct spng_alloc") {
    spng_malloc_fn.p("malloc_fn")
    spng_realloc_fn.p("realloc_fn")
    spng_calloc_fn.p("calloc_fn")
    spng_free_fn.p("free_fn")
}

val spng_row_info = struct(Module.SPNG, "spng_row_info", nativeName = "struct spng_row_info", mutable = false) {
    uint32_t("scanline_idx")
    uint32_t("row_num") /* deinterlaced row index */
    int("pass")
    uint8_t("filter")
}

val spng_rw_fn = Module.SPNG.callback {
    void(
        "spng_rw_fn",

        spng_ctx.p("ctx"),
        nullable..opaque_p("user"),
        void.p("dest"),
        AutoSize("dest")..size_t("length"),

        nativeType = "spng_rw_fn *"
    )
}
