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
    documentation = "Image IO callbacks, used by #load_from_callbacks()."

    Module.STB.callback {
        int(
            "STBIReadCallback",
            "The {@code stbi_io_callbacks.read} callback.",
            void.p("user", "a pointer to user data"),
            char.p("data", "the data buffer to fill"),
            AutoSize("data")..int("size", "the number of bytes to read"),
            returnDoc = "the number of bytes actually read"
        ) {
            documentation = "Instances of this interface may be set to the {@code read} field of the ##STBIIOCallbacks struct."
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
    }("read", "fill {@code data} with {@code size} bytes. Return number of bytes actually read.")
    Module.STB.callback {
        void(
            "STBISkipCallback",
            "The {@code stbi_io_callbacks.skip} callback.",

            void.p("user", "a pointer to user data"),
            int("n", "the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative")
        ) {
            documentation = "Instances of this interface may be set to the {@code skip} field of the ##STBIIOCallbacks struct."
        }
    }("skip", "skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative")
    Module.STB.callback {
        int(
            "STBIEOFCallback",
            "The {@code stbi_io_callbacks.eof} callback.",

            void.p("user", "a pointer to user data"),
            returnDoc = "nonzero if we are at the end of file/data"
        ) {
            documentation = "Instances of this interface may be set to the {@code eof} field of the ##STBIIOCallbacks struct."
        }
    }("eof", "returns nonzero if we are at end of file/data")
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
        "Callback used for input scanlines.",

        nullable..void.p("optional_output", ""),
        void.const.p("input_ptr", ""),
        int("num_pixels", ""),
        int("x", ""),
        int("y", ""),
        nullable..opaque_p("context", ""),

        nativeType = "stbir_input_callback *"
    ) {}
}

val stbir_output_callback = Module.STB.callback {
    void(
        "STBIROutputCallback",
        "Callback used for output scanlines.",

        void.const.p("output_ptr", ""),
        int("num_pixels", ""),
        int("x", ""),
        int("y", ""),
        nullable..opaque_p("context", ""),

        nativeType = "stbir_output_callback *"
    ) {}
}

val stbir__kernel_callback = Module.STB.callback {
    float(
        "STBIRKernelCallback",
        "",

        float("x", ""),
        float("scale", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "stbir__kernel_callback *"
    ) {}

}

val stbir__support_callback = Module.STB.callback {
    float(
        "STBIRSupportCallback",
        "",

        float("scale", ""),
        nullable..opaque_p("user_data", ""),

        nativeType = "stbir__support_callback *"
    ) {}
}

val STBIR_RESIZE = struct(Module.STB, "STBIR_RESIZE") {
    nullable..opaque_p("user_data", "")
    void.const.p("input_pixels", "")
    int("input_w", "")
    int("input_h", "")
    double("input_s0", "")
    double("input_t0", "")
    double("input_s1", "")
    double("input_t1", "")
    nullable..stbir_input_callback.p("input_cb", "")
    nullable..void.p("output_pixels", "")
    int("output_w", "")
    int("output_h", "")
    int("output_subx", "")
    int("output_suby", "")
    int("output_subw", "")
    int("output_subh", "")
    nullable..stbir_output_callback.p("output_cb", "")
    int("input_stride_in_bytes", "")
    int("output_stride_in_bytes", "")
    int("splits", "")
    intb("fast_alpha", "")
    intb("needs_rebuild", "")
    intb("called_alloc", "")
    stbir_pixel_layout("input_pixel_layout_public", "")
    stbir_pixel_layout("output_pixel_layout_public", "")
    stbir_datatype("input_data_type", "")
    stbir_datatype("output_data_type", "")
    stbir_filter("horizontal_filter", "")
    stbir_filter("vertical_filter", "")
    stbir_edge("horizontal_edge", "")
    stbir_edge("vertical_edge", "")
    nullable..stbir__kernel_callback.p("horizontal_filter_kernel", "")
    nullable..stbir__support_callback.p("horizontal_filter_support", "")
    nullable..stbir__kernel_callback.p("vertical_filter_kernel", "")
    nullable..stbir__support_callback.p("vertical_filter_support", "")
    "stbir__info".opaque.p("samplers", "")
}

// stb_image_write.h

val stbi_write_func = Module.STB.callback {
    void(
        "STBIWriteCallback",
        "The {@code stbi_write_func} callback.",

        void.p("context", "the context passed to the write function"),
        void.p("data", "the data to write"),
        AutoSize("data")..int("size", "the number of bytes in {@code data}"),

        nativeType = "stbi_write_func *"
    ) {
        documentation = "Instances of this interface may be used with the ##STBImageWrite {@code write_type_to_func} functions."
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
        """
        Compresses a block of data using Zlib compression.

        The returned data will be freed with MemoryUtil#memFree() so it must be heap allocated with MemoryUtil#memAlloc().
        """,

        unsigned_char.p("data", "the data to compress"),
        AutoSize("data")..int("data_len", "the data length, in bytes"),
        AutoSizeResult..Check(1)..int.p("out_len", "returns the compressed data length, in bytes"),
        int("quality", "the compression quality to use"),

        returnDoc = "the compressed data"
    ) {
        documentation = "Instances of this interface may be set to STBImageWrite#stbi_zlib_compress()."
    }
}

// stb_rect_pack.h

val stbrp_coord = typedef(int, "stbrp_coord")

val stbrp_rect = struct(Module.STB, "STBRPRect", nativeName = "stbrp_rect") {
    documentation = "A packed rectangle."

    int("id", "reserved for your use")
    stbrp_coord("w", "input width")
    stbrp_coord("h", "input height")
    stbrp_coord("x", "output x coordinate")
    stbrp_coord("y", "output y coordinate")
    intb("was_packed", "non-zero if valid packing")
}

private val _stbrp_node = struct(Module.STB, "STBRPNode", nativeName = "stbrp_node")
val stbrp_node = struct(Module.STB, "STBRPNode", nativeName = "stbrp_node", mutable = false) {
    documentation = "The opaque {@code stbrp_node} struct."

    stbrp_coord("x", "")
    stbrp_coord("y", "")
    nullable.._stbrp_node.p("next", "")
}

val stbrp_context = struct(Module.STB, "STBRPContext", nativeName = "stbrp_context", mutable = false) {
    documentation = "The opaque {@code stbrp_context} struct."

    int("width", "")
    int("height", "")
    int("align", "")
    int("init_mode", "")
    int("heuristic", "")
    int("num_nodes", "")
    nullable..stbrp_node.p("active_head", "")
    nullable..stbrp_node.p("free_head", "")
    stbrp_node("extra", "we allocate two extra nodes so optimal user-node-count is {@code width} not {@code width+2}")[2]
}

// stb_truetype.h

val stbtt_bakedchar = struct(Module.STB, "STBTTBakedChar", nativeName = "stbtt_bakedchar", mutable = false) {
    documentation = "Baked character data, returned by #BakeFontBitmap()."

    unsigned_short("x0", "")
    unsigned_short("y0", "")
    unsigned_short("x1", "")
    unsigned_short("y1", "")
    float("xoff", "")
    float("yoff", "")
    float("xadvance", "")
}

val stbtt_aligned_quad = struct(Module.STB, "STBTTAlignedQuad", nativeName = "stbtt_aligned_quad", mutable = false) {
    documentation = "Quad used for drawing a baked character, returned by #GetBakedQuad()."

    float("x0", "")
    float("y0", "")
    float("s0", "")
    float("t0", "")
    float("x1", "")
    float("y1", "")
    float("s1", "")
    float("t1", "")
}

val stbtt_pack_context = struct(Module.STB, "STBTTPackContext", nativeName = "stbtt_pack_context", mutable = false) {
    documentation = "An opaque structure which holds all the context needed from #PackBegin() to #PackEnd()."

    nullable..opaque_p("user_allocator_context", "")
    stbrp_context.p("pack_info", "")
    int("width", "")
    int("height", "")
    int("stride_in_bytes", "")
    int("padding", "")
    intb("skip_missing", "")
    unsigned_int("h_oversample", "")
    unsigned_int("v_oversample", "")
    unsigned_char.p("pixels", "")
    Unsafe..stbrp_node.p("nodes", "")
}

val stbtt_packedchar = struct(Module.STB, "STBTTPackedchar", nativeName = "stbtt_packedchar") {
    documentation = "Packed character data, returned by #PackFontRange()"

    unsigned_short("x0", "")
    unsigned_short("y0", "")
    unsigned_short("x1", "")
    unsigned_short("y1", "")
    float("xoff", "")
    float("yoff", "")
    float("xadvance", "")
    float("xoff2", "")
    float("yoff2", "")
}

val stbtt_pack_range = struct(Module.STB, "STBTTPackRange", nativeName = "stbtt_pack_range") {
    documentation = "A range of packed character data, used by #PackFontRanges()"

    float("font_size", "the font size")
    int("first_unicode_codepoint_in_range", "if non-zero, then the chars are continuous, and this is the first codepoint")
    nullable..int.p("array_of_unicode_codepoints", "if non-zero, then this is an array of unicode codepoints")
    AutoSize("array_of_unicode_codepoints", "chardata_for_range")..int("num_chars", "the number of codepoints in the range")
    Unsafe..stbtt_packedchar.p("chardata_for_range", "output")
    unsigned_char("h_oversample", "used internally")
    unsigned_char("v_oversample", "used internally")
}

val stbtt_fontinfo = struct(Module.STB, "STBTTFontinfo", nativeName = "stbtt_fontinfo", mutable = false) {
    documentation = "An opaque structure that contains font information."
    includeSTBAPI("#include \"stb_truetype.h\"")
}

val stbtt_kerningentry = struct(Module.STB, "STBTTKerningentry", nativeName = "stbtt_kerningentry", mutable = false) {
    int("glyph1", "")
    int("glyph2", "")
    int("advance", "")
}

val stbtt_vertex_type = IntegerType("stbtt_vertex_type", PrimitiveMapping.SHORT)

val stbtt_vertex = struct(Module.STB, "STBTTVertex", nativeName = "stbtt_vertex", mutable = false) {
    documentation = "Vertex data."

    stbtt_vertex_type("x", "")
    stbtt_vertex_type("y", "")
    stbtt_vertex_type("cx", "")
    stbtt_vertex_type("cy", "")
    stbtt_vertex_type("cx1", "")
    stbtt_vertex_type("cy1", "")
    unsigned_char("type", "")
}

val stbtt__bitmap = struct(Module.STB, "STBTTBitmap", nativeName = "stbtt__bitmap") {
    documentation = "Bitmap data."

    int("w", "the bitmap width")
    int("h", "the bitmap height")
    int("stride", "the row stride, in bytes")
    unsigned_char.p("pixels", "the bitmap data")
}

// stb_vorbis.c

val stb_vorbis = "stb_vorbis".opaque

val stb_vorbis_alloc = struct(Module.STB, "STBVorbisAlloc", nativeName = "stb_vorbis_alloc") {
    documentation = "A buffer to use for allocations by ##STBVorbis"

    char.p("alloc_buffer", "")
    AutoSize("alloc_buffer")..int("alloc_buffer_length_in_bytes", "")
}

val stb_vorbis_info = struct(Module.STB, "STBVorbisInfo", nativeName = "stb_vorbis_info", mutable = false) {
    documentation = "Information about a Vorbis stream."

    unsigned_int("sample_rate", "")
    int("channels", "")
    unsigned_int("setup_memory_required", "")
    unsigned_int("setup_temp_memory_required", "")
    unsigned_int("temp_memory_required", "")
    int("max_frame_size", "")
}

val stb_vorbis_comment = struct(Module.STB, "STBVorbisComment", nativeName = "stb_vorbis_comment", mutable = false) {
    charASCII.p("vendor", "");

    AutoSize("comment_list")..int("comment_list_length", "")
    charASCII.p.p("comment_list", "")
}