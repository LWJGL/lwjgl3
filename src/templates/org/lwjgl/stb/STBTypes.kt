/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb

import org.lwjgl.generator.*

val STB_PACKAGE = "org.lwjgl.stb"

private fun GeneratorTargetNative.includeSTBAPI(directives: String) = nativeDirective(
	"""DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4702 4711 4738 4820 4996))
#endif
$directives
ENABLE_WARNINGS()""")

// stb_image.h

val stbi_uc = typedef(unsigned_char, "stbi_uc")
val stbi_uc_p = PointerType(stbi_uc)

val STBIReadCallback = CallbackType(callback(
	STB_PACKAGE, int, "STBIReadCallback",
	"The {@code stbi_io_callbacks.read} callback.",
	void_p.IN("user", "a pointer to user data"),
	char_p.IN("data", "the data buffer to fill"),
	int.IN("size", "the number of bytes to read"),
	returnDoc = "the number of bytes actually read",
	samConstructor = "STBImage"
) {
	documentation = "Instances of this interface may be set to the {@code read} field of the ##STBIIOCallbacks struct."
}, "stbi_io_callbacks.read")

val STBISkipCallback = CallbackType(callback(
	STB_PACKAGE, int, "STBISkipCallback",
	"The {@code stbi_io_callbacks.skip} callback.",
	void_p.IN("user", "a pointer to user data"),
	int.IN("n", "the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative"),
	samConstructor = "STBImage"
) {
	documentation = "Instances of this interface may be set to the {@code skip} field of the ##STBIIOCallbacks struct."
}, "stbi_io_callbacks.read")

val STBIEOFCallback = CallbackType(callback(
	STB_PACKAGE, int, "STBIEOFCallback",
	"The {@code stbi_io_callbacks.eof} callback.",
	void_p.IN("user", "a pointer to user data"),
	returnDoc = "nonzero if we are at the end of file/data",
	samConstructor = "STBImage"
) {
	documentation = "Instances of this interface may be set to the {@code eof} field of the ##STBIIOCallbacks struct."
}, "stbi_io_callbacks.read")

val stbi_io_callbacks = struct(STB_PACKAGE, "STBIIOCallbacks", structName = "stbi_io_callbacks") {
	documentation = "Image IO callbacks, used by STBImage##stb_load_from_callbacks()."
	includeSTBAPI("#include \"stb_image.h\"")
	STBIReadCallback.member("read")
	STBISkipCallback.member("skip")
	STBIEOFCallback.member("eof")
}.nativeType
val stbi_io_callbacks_p = StructType(stbi_io_callbacks)

// stb_image_resize.h

val stbir_uint16 = typedef(unsigned_short, "stbir_uint16")
val stbir_uint16_p = PointerType(stbir_uint16)

val stbir_edge = typedef(int, "stbir_edge")
val stbir_filter = typedef(int, "stbir_filter")
val stbir_colorspace = typedef(int, "stbir_colorspace")
val stbir_datatype = typedef(int, "stbir_datatype")

// stb_rect_pack.h

val stbrp_coord = typedef(unsigned_short, "stbrp_coord") // int is also supported if STBRP_LARGE_RECTS is defined

val stbrp_context = struct(STB_PACKAGE, "STBRPContext", structName = "stbrp_context") {
	documentation = "The opaque {@code stbrp_context} struct."
	includeSTBAPI("#include \"stb_rect_pack.h\"")
}.nativeType
val stbrp_context_p = StructType(stbrp_context)

val stbrp_rect = struct(STB_PACKAGE, "STBRPContext", structName = "stbrp_rect") {
	documentation = "A packed rectangle."
	includeSTBAPI("#include \"stb_rect_pack.h\"")
	int.member("id")
	stbrp_coord.member("w")
	stbrp_coord.member("h")
	stbrp_coord.member("x")
	stbrp_coord.member("y")
	int.member("was_packed")
}.nativeType
val stbrp_rect_p = StructType(stbrp_rect)

val stbrp_node = struct(STB_PACKAGE, "STBRPNode", structName = "stbrp_node") {
	documentation = "The opaque {@code stbrp_node} struct."
	includeSTBAPI("#include \"stb_rect_pack.h\"")
}.nativeType
val stbrp_node_p = StructType(stbrp_node)

// stb_truetype.h

val stbtt_bakedchar = struct(STB_PACKAGE, "STBTTBakedChar", structName = "stbtt_bakedchar") {
	documentation = "Baked character data, returned by STBTruetype#stbtt_BakeFontBitmap()."
	includeSTBAPI("#include \"stb_truetype.h\"")
	unsigned_short.member("x0")
	unsigned_short.member("y0")
	unsigned_short.member("x1")
	unsigned_short.member("y1")
	float.member("xoff")
	float.member("yoff")
	float.member("xadvance")
}.nativeType
val stbtt_bakedchar_p = StructType(stbtt_bakedchar)

val stbtt_aligned_quad = struct(STB_PACKAGE, "STBTTAlignedQuad", structName = "stbtt_aligned_quad") {
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
}.nativeType
val stbtt_aligned_quad_p = StructType(stbtt_aligned_quad)

val stbtt_pack_context = struct(STB_PACKAGE, "STBTTPackContext", structName = "stbtt_pack_context") {
	documentation = "An opaque structure which holds all the context needed from STBTruetype#stbtt_PackBegin to STBTruetype#stbtt_STBPackEnd."
	includeSTBAPI("#include \"stb_truetype.h\"")
}.nativeType
val stbtt_pack_context_p = StructType(stbtt_pack_context)

val stbtt_packedchar = struct(STB_PACKAGE, "STBTTPackedchar", structName = "stbtt_packedchar") {
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
}.nativeType
val stbtt_packedchar_p = StructType(stbtt_packedchar)

val stbtt_pack_range = struct(STB_PACKAGE, "STBTTPackRange", structName = "stbtt_pack_range") {
	documentation = "A range of packed character data, returned by STBTruetype#stbtt_PackFontRanges()"
	includeSTBAPI("#include \"stb_truetype.h\"")
	float.member("font_size")
	int.member("first_unicode_char_in_range")
	int.member("num_chars_in_range")
	stbtt_packedchar_p.member("chardata_for_range")
}.nativeType
val stbtt_pack_range_p = StructType(stbtt_pack_range)

val stbtt_fontinfo = struct(STB_PACKAGE, "STBTTFontinfo", structName = "stbtt_fontinfo") {
	documentation = "An opaque structure that contains font information."
	includeSTBAPI("#include \"stb_truetype.h\"")
}.nativeType
val stbtt_fontinfo_p = StructType(stbtt_fontinfo)

val stbtt_vertex_type = PrimitiveType("stbtt_vertex_type", PrimitiveMapping.SHORT)

val stbtt_vertex = struct(STB_PACKAGE, "STBTTVertex", structName = "stbtt_vertex") {
	documentation = "Vertex data."
	includeSTBAPI("#include \"stb_truetype.h\"")
	stbtt_vertex_type.member("x")
	stbtt_vertex_type.member("y")
	stbtt_vertex_type.member("cx")
	stbtt_vertex_type.member("cy")
	unsigned_char.member("type")
}.nativeType
val stbtt_vertex_p = StructType(stbtt_vertex)
val stbtt_vertex_pp = PointerType(stbtt_vertex_p)

// stb_vorbis.c

val stb_vorbis_p = PointerType("stb_vorbis")

val float_ppp = PointerType(float_pp)

val stb_vorbis_alloc = struct(STB_PACKAGE, "STBVorbisAlloc", structName = "stb_vorbis_alloc") {
	documentation = "A buffer to use for allocations by ##STBVorbis"
	includeSTBAPI("""#define STB_VORBIS_HEADER_ONLY
#include "stb_vorbis.c"""")
	char_p.member("alloc_buffer")
	int.member("alloc_buffer_length_in_bytes")
}.nativeType
val stb_vorbis_alloc_p = StructType(stb_vorbis_alloc)

val stb_vorbis_info = struct(STB_PACKAGE, "STBVorbisInfo", structName = "stb_vorbis_info") {
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
val stb_vorbis_info_p = StructType(stb_vorbis_info)