/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb

import org.lwjgl.generator.*

const val STB_LIBRARY = "LibSTB.initialize();"

fun config() {
    packageInfo(
        Module.STB,
        """
        Contains bindings to ${url("https://github.com/nothings/stb", "stb")}, a set of single-file public domain libraries.

        The functionality provided by stb includes:
        ${ul(
            "Parsing TrueType files, extract glyph metrics and rendering packed font textures.",
            "Easy rendering of bitmap fonts.",
            "Reading/writing image files and resizing images (e.g. for gamma-correct MIP map creation).",
            "Decoding Ogg Vorbis audio files.",
            "Compressing DXT textures at runtime.",
            "Packing rectangular textures into texture atlases.",
            "Computing Perlin noise."
        )}
        """
    )

    Generator.registerLibraryInit(Module.STB, "LibSTB", "stb", setupAllocator = true)
}

fun GeneratorTargetNative.includeSTBAPI(directives: String) = nativeDirective(
    """DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4701 4702 4738))
#endif
$directives
ENABLE_WARNINGS()""")

// stb_image.h

val stbi_uc_p = typedef(unsigned_char, "stbi_uc").p
val stbi_us_p = typedef(unsigned_short, "stbi_us").p

val stbi_io_callbacks_read = callback(
    Module.STB, int, "STBIReadCallback",
    "The {@code stbi_io_callbacks.read} callback.",
    void_p.IN("user", "a pointer to user data"),
    char_p.IN("data", "the data buffer to fill"),
    AutoSize("data")..int.IN("size", "the number of bytes to read"),
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

val stbi_io_callbacks_skip = callback(
    Module.STB, void, "STBISkipCallback",
    "The {@code stbi_io_callbacks.skip} callback.",
    void_p.IN("user", "a pointer to user data"),
    int.IN("n", "the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative")
) {
    documentation = "Instances of this interface may be set to the {@code skip} field of the ##STBIIOCallbacks struct."
}

val stbi_io_callbacks_eof = callback(
    Module.STB, int, "STBIEOFCallback",
    "The {@code stbi_io_callbacks.eof} callback.",
    void_p.IN("user", "a pointer to user data"),
    returnDoc = "nonzero if we are at the end of file/data"
) {
    documentation = "Instances of this interface may be set to the {@code eof} field of the ##STBIIOCallbacks struct."
}

val stbi_io_callbacks_p = struct(Module.STB, "STBIIOCallbacks", nativeName = "stbi_io_callbacks") {
    documentation = "Image IO callbacks, used by #load_from_callbacks()."

    stbi_io_callbacks_read.member("read", "fill {@code data} with {@code size} bytes. Return number of bytes actually read.")
    stbi_io_callbacks_skip.member("skip", "skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative")
    stbi_io_callbacks_eof.member("eof", "returns nonzero if we are at end of file/data")
}.p

// stb_image_resize.h

val stbir_uint16 = typedef(unsigned_short, "stbir_uint16")
val stbir_uint16_p = stbir_uint16.p

val stbir_edge = "stbir_edge".enumType
val stbir_filter = "stbir_filter".enumType
val stbir_colorspace = "stbir_colorspace".enumType
val stbir_datatype = "stbir_datatype".enumType

// stb_image_write.h

val stbi_write_func = "stbi_write_func *".callback(
    Module.STB, void, "STBIWriteCallback",
    "The {@code stbi_write_func} callback.",
    void_p.IN("context", "the context passed to the write function"),
    void_p.IN("data", "the data to write"),
    AutoSize("data")..int.IN("size", "the number of bytes in {@code data}")
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

val stbi_zlib_compress = callback(
    Module.STB, unsigned_char_p, "STBIZlibCompress",
    """
    Compresses a block of data using Zlib compression.

    The returned data will be freed with MemoryUtil#memFree() so it must be heap allocated with MemoryUtil#memAlloc().
    """,

    unsigned_char_p.IN("data", "the data to compress"),
    AutoSize("data")..int.IN("data_len", "the data length, in bytes"),
    AutoSizeResult..Check(1)..int_p.OUT("out_len", "returns the compressed data length, in bytes"),
    int.IN("quality", "the compression quality to use"),

    returnDoc = "the compressed data"
) {
    documentation = "Instances of this interface may be set to STBImageWrite#stbi_zlib_compress()."
}

// stb_rect_pack.h

val stbrp_coord = typedef(unsigned_short, "stbrp_coord") // int is also supported if STBRP_LARGE_RECTS is defined

val stbrp_rect_p = struct(Module.STB, "STBRPRect", nativeName = "stbrp_rect") {
    documentation = "A packed rectangle."

    int.member("id", "reserved for your use")
    stbrp_coord.member("w", "input width")
    stbrp_coord.member("h", "input height")
    stbrp_coord.member("x", "output x coordinate")
    stbrp_coord.member("y", "output y coordinate")
    intb.member("was_packed", "non-zero if valid packing")
}.p

val stbrp_node_p = struct(Module.STB, "STBRPNode", nativeName = "stbrp_node").p
val stbrp_node = struct(Module.STB, "STBRPNode", nativeName = "stbrp_node", mutable = false) {
    documentation = "The opaque {@code stbrp_node} struct."

    stbrp_coord.member("x", "")
    stbrp_coord.member("y", "")
    nullable..stbrp_node_p.member("next", "")
}

val stbrp_context_p = struct(Module.STB, "STBRPContext", nativeName = "stbrp_context", mutable = false) {
    documentation = "The opaque {@code stbrp_context} struct."

    int.member("width", "")
    int.member("height", "")
    int.member("align", "")
    int.member("init_mode", "")
    int.member("heuristic", "")
    int.member("num_nodes", "")
    nullable..stbrp_node_p.member("active_head", "")
    nullable..stbrp_node_p.member("free_head", "")
    stbrp_node.array("extra", "we allocate two extra nodes so optimal user-node-count is {@code width} not {@code width+2}", size = 2)
}.p

// stb_truetype.h

val stbtt_bakedchar_p = struct(Module.STB, "STBTTBakedChar", nativeName = "stbtt_bakedchar", mutable = false) {
    documentation = "Baked character data, returned by #BakeFontBitmap()."

    unsigned_short.member("x0", "")
    unsigned_short.member("y0", "")
    unsigned_short.member("x1", "")
    unsigned_short.member("y1", "")
    float.member("xoff", "")
    float.member("yoff", "")
    float.member("xadvance", "")
}.p

val stbtt_aligned_quad_p = struct(Module.STB, "STBTTAlignedQuad", nativeName = "stbtt_aligned_quad", mutable = false) {
    documentation = "Quad used for drawing a baked character, returned by #GetBakedQuad()."

    float.member("x0", "")
    float.member("y0", "")
    float.member("s0", "")
    float.member("t0", "")
    float.member("x1", "")
    float.member("y1", "")
    float.member("s1", "")
    float.member("t1", "")
}.p

val stbtt_pack_context_p = struct(Module.STB, "STBTTPackContext", nativeName = "stbtt_pack_context", mutable = false) {
    documentation = "An opaque structure which holds all the context needed from #PackBegin() to #PackEnd()."

    nullable..opaque_p.member("user_allocator_context", "")
    stbrp_context_p.member("pack_info", "")
    int.member("width", "")
    int.member("height", "")
    int.member("stride_in_bytes", "")
    int.member("padding", "")
    unsigned_int.member("h_oversample", "")
    unsigned_int.member("v_oversample", "")
    unsigned_char_p.member("pixels", "")
    stbrp_node_p.buffer("nodes", "")
}.p

val stbtt_packedchar_p = struct(Module.STB, "STBTTPackedchar", nativeName = "stbtt_packedchar") {
    documentation = "Packed character data, returned by #PackFontRange()"

    unsigned_short.member("x0", "")
    unsigned_short.member("y0", "")
    unsigned_short.member("x1", "")
    unsigned_short.member("y1", "")
    float.member("xoff", "")
    float.member("yoff", "")
    float.member("xadvance", "")
    float.member("xoff2", "")
    float.member("yoff2", "")
}.p

val stbtt_pack_range_p = struct(Module.STB, "STBTTPackRange", nativeName = "stbtt_pack_range") {
    documentation = "A range of packed character data, used by #PackFontRanges()"

    float.member("font_size", "the font size")
    int.member("first_unicode_codepoint_in_range", "if non-zero, then the chars are continuous, and this is the first codepoint")
    nullable..int_p.member("array_of_unicode_codepoints", "if non-zero, then this is an array of unicode codepoints")
    AutoSize("array_of_unicode_codepoints", "chardata_for_range")..int.member("num_chars", "the number of codepoints in the range")
    stbtt_packedchar_p.buffer("chardata_for_range", "output")
    unsigned_char.member("h_oversample", "used internally")
    unsigned_char.member("v_oversample", "used internally")
}.p

val stbtt_fontinfo_p = struct(Module.STB, "STBTTFontinfo", nativeName = "stbtt_fontinfo", mutable = false) {
    documentation = "An opaque structure that contains font information."
    includeSTBAPI("#include \"stb_truetype.h\"")
    static(STB_LIBRARY)
}.p

val stbtt_vertex_type = IntegerType("stbtt_vertex_type", PrimitiveMapping.SHORT)

val stbtt_vertex_p = struct(Module.STB, "STBTTVertex", nativeName = "stbtt_vertex", mutable = false) {
    documentation = "Vertex data."

    stbtt_vertex_type.member("x", "")
    stbtt_vertex_type.member("y", "")
    stbtt_vertex_type.member("cx", "")
    stbtt_vertex_type.member("cy", "")
    stbtt_vertex_type.member("cx1", "")
    stbtt_vertex_type.member("cy1", "")
    unsigned_char.member("type", "")
}.p
val stbtt_vertex_pp = stbtt_vertex_p.p

val stbtt__bitmap_p = struct(Module.STB, "STBTTBitmap", nativeName = "stbtt__bitmap") {
    documentation = "Bitmap data."

    int.member("w", "the bitmap width")
    int.member("h", "the bitmap height")
    int.member("stride", "the row stride, in bytes")
    unsigned_char_p.member("pixels", "the bitmap data")
}.p

// stb_vorbis.c

val stb_vorbis_p = "stb_vorbis".p

val float_ppp = float_pp.p

val stb_vorbis_alloc_p = struct(Module.STB, "STBVorbisAlloc", nativeName = "stb_vorbis_alloc") {
    documentation = "A buffer to use for allocations by ##STBVorbis"

    char_p.member("alloc_buffer", "")
    AutoSize("alloc_buffer")..int.member("alloc_buffer_length_in_bytes", "")
}.p

val stb_vorbis_info = struct(Module.STB, "STBVorbisInfo", nativeName = "stb_vorbis_info", mutable = false) {
    documentation = "Information about a Vorbis stream."

    unsigned_int.member("sample_rate", "")
    int.member("channels", "")
    unsigned_int.member("setup_memory_required", "")
    unsigned_int.member("setup_temp_memory_required", "")
    unsigned_int.member("temp_memory_required", "")
    int.member("max_frame_size", "")
}