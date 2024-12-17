/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb

import org.lwjgl.generator.*

fun GeneratorTargetNative.includeSTBAPI(directives: String) = nativeDirective(
    """DISABLE_WARNINGS()
$directives
ENABLE_WARNINGS()""")

// stb_image.h

val stbi_uc = typedef(unsigned_char, "stbi_uc")
val stbi_us = typedef(unsigned_short, "stbi_us")

val stbi_io_callbacks = struct(Module.STB, "STBIIOCallbacks", nativeName = "stbi_io_callbacks") {
    Module.STB.callback {
        int(
            "STBIReadCallback",

            void.p("user"),
            char.p("data"),
            AutoSize("data")..int("size")
        ) {
            javaImport("java.nio.*")
            additionalCode = """
    /**
     * Converts the specified {@link STBIReadCallback} arguments to a ByteBuffer.
     *
     * <p>This method may only be used inside a STBIReadCallback invocation.</p>
     *
     * @param data the STBIReadCallback {@code data} argument
     * @param size the STBIReadCallback {@code size} argument
     *
     * @return the data as a ByteBuffer
     */
    public static ByteBuffer getData(long data, int size) {
        return memByteBuffer(data, size);
    }
    """
        }
    }("read")
    Module.STB.callback {
        void(
            "STBISkipCallback",

            void.p("user"),
            int("n")
        ) {}
    }("skip")
    Module.STB.callback {
        int(
            "STBIEOFCallback",

            void.p("user")
        ) {}
    }("eof")
}

// stb_image_resize.h

val  stbir_uint8 = typedef( uint8_t, "stbir_uint8")
val stbir_uint16 = typedef(uint16_t, "stbir_uint16")
val stbir_uint32 = typedef(uint32_t, "stbir_uint32")
val stbir_uint64 = typedef(uint64_t, "stbir_uint64")

val stbir_datatype = "stbir_datatype".enumType
val stbir_edge = "stbir_edge".enumType
val stbir_filter = "stbir_filter".enumType
val stbir_pixel_layout = "stbir_pixel_layout".enumType

val stbir_input_callback = Module.STB.callback {
    void(
        "STBIRInputCallback",

        nullable..void.p("optional_output"),
        void.const.p("input_ptr"),
        int("num_pixels"),
        int("x"),
        int("y"),
        nullable..opaque_p("context"),

        nativeType = "stbir_input_callback *"
    ) {}
}

val stbir_output_callback = Module.STB.callback {
    void(
        "STBIROutputCallback",

        void.const.p("output_ptr"),
        int("num_pixels"),
        int("x"),
        int("y"),
        nullable..opaque_p("context"),

        nativeType = "stbir_output_callback *"
    ) {}
}

val stbir__kernel_callback = Module.STB.callback {
    float(
        "STBIRKernelCallback",

        float("x"),
        float("scale"),
        nullable..opaque_p("user_data"),

        nativeType = "stbir__kernel_callback *"
    ) {}

}

val stbir__support_callback = Module.STB.callback {
    float(
        "STBIRSupportCallback",

        float("scale"),
        nullable..opaque_p("user_data"),

        nativeType = "stbir__support_callback *"
    ) {}
}

val STBIR_RESIZE = struct(Module.STB, "STBIR_RESIZE") {
    nullable..opaque_p("user_data")
    void.const.p("input_pixels")
    int("input_w")
    int("input_h")
    double("input_s0")
    double("input_t0")
    double("input_s1")
    double("input_t1")
    nullable..stbir_input_callback.p("input_cb")
    nullable..void.p("output_pixels")
    int("output_w")
    int("output_h")
    int("output_subx")
    int("output_suby")
    int("output_subw")
    int("output_subh")
    nullable..stbir_output_callback.p("output_cb")
    int("input_stride_in_bytes")
    int("output_stride_in_bytes")
    int("splits")
    intb("fast_alpha")
    intb("needs_rebuild")
    intb("called_alloc")
    stbir_pixel_layout("input_pixel_layout_public")
    stbir_pixel_layout("output_pixel_layout_public")
    stbir_datatype("input_data_type")
    stbir_datatype("output_data_type")
    stbir_filter("horizontal_filter")
    stbir_filter("vertical_filter")
    stbir_edge("horizontal_edge")
    stbir_edge("vertical_edge")
    nullable..stbir__kernel_callback.p("horizontal_filter_kernel")
    nullable..stbir__support_callback.p("horizontal_filter_support")
    nullable..stbir__kernel_callback.p("vertical_filter_kernel")
    nullable..stbir__support_callback.p("vertical_filter_support")
    "stbir__info".opaque.p("samplers")
}

// stb_image_write.h

val stbi_write_func = Module.STB.callback {
    void(
        "STBIWriteCallback",

        void.p("context"),
        void.p("data"),
        AutoSize("data")..int("size"),

        nativeType = "stbi_write_func *"
    ) {
        javaImport("java.nio.*")
        additionalCode = """
    /**
     * Converts the specified {@link STBIWriteCallback} arguments to a ByteBuffer.
     *
     * <p>This method may only be used inside a STBIWriteCallback invocation.</p>
     *
     * @param data the STBIWriteCallback {@code data} argument
     * @param size the STBIWriteCallback {@code size} argument
     *
     * @return the data as a ByteBuffer
     */
    public static ByteBuffer getData(long data, int size) {
        return memByteBuffer(data, size);
    }
    """
    }
}
val stbi_zlib_compress = Module.STB.callback {
    unsigned_char.p(
        "STBIZlibCompress",

        unsigned_char.p("data"),
        AutoSize("data")..int("data_len"),
        AutoSizeResult..Check(1)..int.p("out_len"),
        int("quality")
    ) {}
}

// stb_rect_pack.h

val stbrp_coord = typedef(int, "stbrp_coord")

val stbrp_rect = struct(Module.STB, "STBRPRect", nativeName = "stbrp_rect") {
    int("id")
    stbrp_coord("w")
    stbrp_coord("h")
    stbrp_coord("x")
    stbrp_coord("y")
    intb("was_packed")
}

private val _stbrp_node = struct(Module.STB, "STBRPNode", nativeName = "stbrp_node")
val stbrp_node = struct(Module.STB, "STBRPNode", nativeName = "stbrp_node", mutable = false) {
    stbrp_coord("x")
    stbrp_coord("y")
    nullable.._stbrp_node.p("next")
}

val stbrp_context = struct(Module.STB, "STBRPContext", nativeName = "stbrp_context", mutable = false) {
    int("width")
    int("height")
    int("align")
    int("init_mode")
    int("heuristic")
    int("num_nodes")
    nullable..stbrp_node.p("active_head")
    nullable..stbrp_node.p("free_head")
    stbrp_node("extra")[2]
}

// stb_truetype.h

val stbtt_bakedchar = struct(Module.STB, "STBTTBakedChar", nativeName = "stbtt_bakedchar", mutable = false) {
    unsigned_short("x0")
    unsigned_short("y0")
    unsigned_short("x1")
    unsigned_short("y1")
    float("xoff")
    float("yoff")
    float("xadvance")
}

val stbtt_aligned_quad = struct(Module.STB, "STBTTAlignedQuad", nativeName = "stbtt_aligned_quad", mutable = false) {
    float("x0")
    float("y0")
    float("s0")
    float("t0")
    float("x1")
    float("y1")
    float("s1")
    float("t1")
}

val stbtt_pack_context = struct(Module.STB, "STBTTPackContext", nativeName = "stbtt_pack_context", mutable = false) {
    nullable..opaque_p("user_allocator_context")
    stbrp_context.p("pack_info")
    int("width")
    int("height")
    int("stride_in_bytes")
    int("padding")
    intb("skip_missing")
    unsigned_int("h_oversample")
    unsigned_int("v_oversample")
    unsigned_char.p("pixels")
    Unsafe..stbrp_node.p("nodes")
}

val stbtt_packedchar = struct(Module.STB, "STBTTPackedchar", nativeName = "stbtt_packedchar") {
    unsigned_short("x0")
    unsigned_short("y0")
    unsigned_short("x1")
    unsigned_short("y1")
    float("xoff")
    float("yoff")
    float("xadvance")
    float("xoff2")
    float("yoff2")
}

val stbtt_pack_range = struct(Module.STB, "STBTTPackRange", nativeName = "stbtt_pack_range") {
    float("font_size")
    int("first_unicode_codepoint_in_range")
    nullable..int.p("array_of_unicode_codepoints")
    AutoSize("array_of_unicode_codepoints", "chardata_for_range")..int("num_chars")
    Unsafe..stbtt_packedchar.p("chardata_for_range")
    unsigned_char("h_oversample")
    unsigned_char("v_oversample")
}

val stbtt_fontinfo = struct(Module.STB, "STBTTFontinfo", nativeName = "stbtt_fontinfo", mutable = false) {
    includeSTBAPI("#include \"stb_truetype.h\"")
}

val stbtt_kerningentry = struct(Module.STB, "STBTTKerningentry", nativeName = "stbtt_kerningentry", mutable = false) {
    int("glyph1")
    int("glyph2")
    int("advance")
}

val stbtt_vertex_type = IntegerType("stbtt_vertex_type", PrimitiveMapping.SHORT)

val stbtt_vertex = struct(Module.STB, "STBTTVertex", nativeName = "stbtt_vertex", mutable = false) {
    stbtt_vertex_type("x")
    stbtt_vertex_type("y")
    stbtt_vertex_type("cx")
    stbtt_vertex_type("cy")
    stbtt_vertex_type("cx1")
    stbtt_vertex_type("cy1")
    unsigned_char("type")
}

val stbtt__bitmap = struct(Module.STB, "STBTTBitmap", nativeName = "stbtt__bitmap") {
    int("w")
    int("h")
    int("stride")
    unsigned_char.p("pixels")
}

// stb_vorbis.c

val stb_vorbis = "stb_vorbis".opaque

val stb_vorbis_alloc = struct(Module.STB, "STBVorbisAlloc", nativeName = "stb_vorbis_alloc") {
    char.p("alloc_buffer")
    AutoSize("alloc_buffer")..int("alloc_buffer_length_in_bytes")
}

val stb_vorbis_info = struct(Module.STB, "STBVorbisInfo", nativeName = "stb_vorbis_info", mutable = false) {
    unsigned_int("sample_rate")
    int("channels")
    unsigned_int("setup_memory_required")
    unsigned_int("setup_temp_memory_required")
    unsigned_int("temp_memory_required")
    int("max_frame_size")
}

val stb_vorbis_comment = struct(Module.STB, "STBVorbisComment", nativeName = "stb_vorbis_comment", mutable = false) {
    charASCII.p("vendor")

    AutoSize("comment_list")..int("comment_list_length")
    charASCII.p.p("comment_list")
}