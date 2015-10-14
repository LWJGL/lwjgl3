/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb

import org.lwjgl.generator.*

val STB_PACKAGE = "org.lwjgl.stb"

fun GeneratorTargetNative.includeSTBAPI(directives: String) = nativeDirective(
	"""DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4701 4702 4711 4738 4996))
#endif
$directives
ENABLE_WARNINGS()""")

// stb_image.h

val stbi_uc = typedef(unsigned_char, "stbi_uc")
val stbi_uc_p = stbi_uc.p

val stbi_io_callbacks_read = "stbi_io_callbacks.read".callback(
	STB_PACKAGE, int, "STBIReadCallback",
	"The {@code stbi_io_callbacks.read} callback.",
	void_p.IN("user", "a pointer to user data"),
	char_p.IN("data", "the data buffer to fill"),
	AutoSize("data")..int.IN("size", "the number of bytes to read"),
	returnDoc = "the number of bytes actually read"
) {
	documentation = "Instances of this interface may be set to the {@code read} field of the ##STBIIOCallbacks struct."
	additionalCode = """
	/**
	 * Converts the specified {@link STBIReadCallback} arguments to a ByteBuffer.
	 *
	 * <p>This method may only be used inside a STBIReadCallback invocation.</p>
	 *
	 * @param data the the STBIReadCallback {@code data} argument
	 * @param size the STBIReadCallback {@code size} argument
	 *
	 * @return the data as a ByteBuffer
	 */
	public static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

	/** A functional interface for {@link STBIReadCallback}. */
	public interface SAMBuffer {
		int invoke(long user, ByteBuffer data);
	}

	/**
	 * Creates a {@link STBIReadCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIReadCallback} instance
	 */
	public static STBIReadCallback createBuffer(final SAMBuffer sam) {
		return new STBIReadCallback() {
			@Override
			public int invoke(long user, long data, int size) {
				return sam.invoke(user, getData(data, size));
			}
		};
	}
	"""
}

val stbi_io_callbacks_skip = "stbi_io_callbacks.skip".callback(
	STB_PACKAGE, void, "STBISkipCallback",
	"The {@code stbi_io_callbacks.skip} callback.",
	void_p.IN("user", "a pointer to user data"),
	int.IN("n", "the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative")
) {
	documentation = "Instances of this interface may be set to the {@code skip} field of the ##STBIIOCallbacks struct."
}

val stbi_io_callbacks_eof = "stbi_io_callbacks.eof".callback(
	STB_PACKAGE, int, "STBIEOFCallback",
	"The {@code stbi_io_callbacks.eof} callback.",
	void_p.IN("user", "a pointer to user data"),
	returnDoc = "nonzero if we are at the end of file/data"
) {
	documentation = "Instances of this interface may be set to the {@code eof} field of the ##STBIIOCallbacks struct."
}

val stbi_io_callbacks_p = struct_p(STB_PACKAGE, "STBIIOCallbacks", structName = "stbi_io_callbacks") {
	documentation = "Image IO callbacks, used by STBImage##stbi_load_from_callbacks()."
	includeSTBAPI("#include \"stb_image.h\"")
	stbi_io_callbacks_read.member("read")
	stbi_io_callbacks_skip.member("skip")
	stbi_io_callbacks_eof.member("eof")
}

// stb_image_resize.h

val stbir_uint16 = typedef(unsigned_short, "stbir_uint16")
val stbir_uint16_p = stbir_uint16.p

val stbir_edge = typedef(int, "stbir_edge")
val stbir_filter = typedef(int, "stbir_filter")
val stbir_colorspace = typedef(int, "stbir_colorspace")
val stbir_datatype = typedef(int, "stbir_datatype")

// stb_image_write.h

val stbi_write_func = "stbi_write_func_p".callback(
	STB_PACKAGE, void, "STBIWriteCallback",
	"The {@code stbi_write_func} callback.",
	void_p.IN("context", "the context passed to the write function"),
	void_p.IN("data", "the data to write"),
	AutoSize("data")..int.IN("size", "the number of bytes in {@code data}")
) {
	documentation = "Instances of this interface may be used with the ##STBImageWrite {@code write_type_to_func} functions."
	additionalCode = """
	/**
	 * Converts the specified {@link STBIWriteCallback} arguments to a ByteBuffer.
	 *
	 * <p>This method may only be used inside a STBIWriteCallback invocation.</p>
	 *
	 * @param data the the STBIWriteCallback {@code data} argument
	 * @param size the STBIWriteCallback {@code size} argument
	 *
	 * @return the data as a ByteBuffer
	 */
	public static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

	/** A functional interface for {@link STBIWriteCallback}. */
	public interface SAMBuffer {
		int invoke(long context, ByteBuffer data);
	}

	/**
	 * Creates a {@link STBIWriteCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIWriteCallback} instance
	 */
	public static STBIWriteCallback createBuffer(final SAMBuffer sam) {
		return new STBIWriteCallback() {
			@Override
			public void invoke(long context, long data, int size) {
				sam.invoke(context, getData(data, size));
			}
		};
	}
	"""
}

// stb_rect_pack.h

val stbrp_coord = typedef(unsigned_short, "stbrp_coord") // int is also supported if STBRP_LARGE_RECTS is defined

val stbrp_context_p = struct_p(STB_PACKAGE, "STBRPContext", structName = "stbrp_context", mutable = false) {
	documentation = "The opaque {@code stbrp_context} struct."
	includeSTBAPI("#include \"stb_rect_pack.h\"")
}

val stbrp_rect_p = struct_p(STB_PACKAGE, "STBRPRect", structName = "stbrp_rect") {
	documentation = "A packed rectangle."
	includeSTBAPI("#include \"stb_rect_pack.h\"")
	int.member("id")
	stbrp_coord.member("w")
	stbrp_coord.member("h")
	stbrp_coord.member("x")
	stbrp_coord.member("y")
	int.member("was_packed")
}

val stbrp_node_p = struct_p(STB_PACKAGE, "STBRPNode", structName = "stbrp_node") {
	documentation = "The opaque {@code stbrp_node} struct."
	includeSTBAPI("#include \"stb_rect_pack.h\"")
}

// stb_truetype.h

val stbtt_bakedchar_p = struct_p(STB_PACKAGE, "STBTTBakedChar", structName = "stbtt_bakedchar", mutable = false) {
	documentation = "Baked character data, returned by STBTruetype#stbtt_BakeFontBitmap()."
	includeSTBAPI("#include \"stb_truetype.h\"")
	unsigned_short.member("x0")
	unsigned_short.member("y0")
	unsigned_short.member("x1")
	unsigned_short.member("y1")
	float.member("xoff")
	float.member("yoff")
	float.member("xadvance")
}

val stbtt_aligned_quad_p = struct_p(STB_PACKAGE, "STBTTAlignedQuad", structName = "stbtt_aligned_quad", mutable = false) {
	documentation = "Quad used for drawing a baked character, returned by STBTruetype#stbtt_GetBakedQuad()."
	includeSTBAPI("#include \"stb_truetype.h\"")
	float.member("x0")
	float.member("y0")
	float.member("s0")
	float.member("t0")
	float.member("x1")
	float.member("y1")
	float.member("s1")
	float.member("t1")
}

val stbtt_pack_context_p = struct_p(STB_PACKAGE, "STBTTPackContext", structName = "stbtt_pack_context", mutable = false) {
	documentation = "An opaque structure which holds all the context needed from STBTruetype#stbtt_PackBegin to STBTruetype#stbtt_PackEnd."
	includeSTBAPI("#include \"stb_truetype.h\"")
}

val stbtt_packedchar_p = struct_p(STB_PACKAGE, "STBTTPackedchar", structName = "stbtt_packedchar", mutable = false) {
	documentation = "Packed character data, returned by STBTruetype#stbtt_PackFontRange()"
	includeSTBAPI("#include \"stb_truetype.h\"")
	unsigned_short.member("x0")
	unsigned_short.member("y0")
	unsigned_short.member("x1")
	unsigned_short.member("y1")
	float.member("xoff")
	float.member("yoff")
	float.member("xadvance")
	float.member("xoff2")
	float.member("yoff2")
}

val stbtt_pack_range_p = struct_p(STB_PACKAGE, "STBTTPackRange", structName = "stbtt_pack_range", mutable = false) {
	documentation = "A range of packed character data, returned by STBTruetype#stbtt_PackFontRanges()"
	includeSTBAPI("#include \"stb_truetype.h\"")
	float.member("font_size")
	int.member("first_unicode_codepoint_in_range")
	int_p.member("array_of_unicode_codepoints")
	int.member("num_chars")
	stbtt_packedchar_p.member("chardata_for_range")
}

val stbtt_fontinfo_p = struct_p(STB_PACKAGE, "STBTTFontinfo", structName = "stbtt_fontinfo", mutable = false) {
	documentation = "An opaque structure that contains font information."
	includeSTBAPI("#include \"stb_truetype.h\"")
}

val stbtt_vertex_type = PrimitiveType("stbtt_vertex_type", PrimitiveMapping.SHORT)

val stbtt_vertex_p = struct_p(STB_PACKAGE, "STBTTVertex", structName = "stbtt_vertex", mutable = false) {
	documentation = "Vertex data."
	includeSTBAPI("#include \"stb_truetype.h\"")
	stbtt_vertex_type.member("x")
	stbtt_vertex_type.member("y")
	stbtt_vertex_type.member("cx")
	stbtt_vertex_type.member("cy")
	unsigned_char.member("type")
}
val stbtt_vertex_pp = stbtt_vertex_p.p

// stb_vorbis.c

val stb_vorbis_p = "stb_vorbis".p

val float_ppp = float_pp.p

val stb_vorbis_alloc_p = struct_p(STB_PACKAGE, "STBVorbisAlloc", structName = "stb_vorbis_alloc") {
	documentation = "A buffer to use for allocations by ##STBVorbis"
	includeSTBAPI("""#define STB_VORBIS_HEADER_ONLY
#include "stb_vorbis.c"""")
	char_p.member("alloc_buffer")
	int.member("alloc_buffer_length_in_bytes")
}

val stb_vorbis_info = struct(STB_PACKAGE, "STBVorbisInfo", structName = "stb_vorbis_info", mutable = false) {
	documentation = "Information about a Vorbis stream."
	includeSTBAPI("""#define STB_VORBIS_HEADER_ONLY
#include "stb_vorbis.c"""")
	unsigned_int.member("sample_rate")
	int.member("channels")
	unsigned_int.member("setup_memory_required")
	unsigned_int.member("setup_temp_memory_required")
	unsigned_int.member("temp_memory_required")
	int.member("max_frame_size")
}.nativeType