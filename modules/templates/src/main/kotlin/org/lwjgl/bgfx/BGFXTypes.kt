/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.bgfx

import org.lwjgl.generator.*

val BGFX_PACKAGE = "org.lwjgl.bgfx"

fun config() {
	packageInfo(
		BGFX_PACKAGE,
		"""
		Contains bindings to the <a href="https://github.com/bkaradzic/bgfx">bgfx</a> library.

		The bgfx documentation can be found <a href="https://bkaradzic.github.io/bgfx/">here</a>.
		"""
	)
}

val BGFX_BINDING = simpleBinding("bgfx", """Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx"))""")

val bgfx_renderer_type_t = "bgfx_renderer_type_t".enumType
val bgfx_access_t = "bgfx_access_t".enumType
val bgfx_attrib_t = "bgfx_attrib_t".enumType
val bgfx_attrib_type_t = "bgfx_attrib_type_t".enumType
val bgfx_texture_format_t = "bgfx_texture_format_t".enumType
val bgfx_uniform_type_t = "bgfx_uniform_type_t".enumType
val bgfx_backbuffer_ratio_t = "bgfx_backbuffer_ratio_t".enumType
val bgfx_occlusion_query_result_t = "bgfx_occlusion_query_result_t".enumType
val bgfx_topology_convert_t = "bgfx_topology_convert_t".enumType
val bgfx_topology_sort_t = "bgfx_topology_sort_t".enumType

val bgfx_dynamic_index_buffer_handle_t = IntegerType("bgfx_dynamic_index_buffer_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_dynamic_vertex_buffer_handle_t = IntegerType("bgfx_dynamic_vertex_buffer_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_frame_buffer_handle_t = IntegerType("bgfx_frame_buffer_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_index_buffer_handle_t = IntegerType("bgfx_index_buffer_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_indirect_buffer_handle_t = IntegerType("bgfx_indirect_buffer_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_occlusion_query_handle_t = IntegerType("bgfx_occlusion_query_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_program_handle_t = IntegerType("bgfx_program_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_shader_handle_t = IntegerType("bgfx_shader_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_texture_handle_t = IntegerType("bgfx_texture_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_uniform_handle_t = IntegerType("bgfx_uniform_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_vertex_buffer_handle_t = IntegerType("bgfx_vertex_buffer_handle_t", PrimitiveMapping.SHORT, unsigned = true)
val bgfx_vertex_decl_handle_t = IntegerType("bgfx_vertex_decl_handle_t", PrimitiveMapping.SHORT, unsigned = true)

val bgfx_release_fn_t = "bgfx_release_fn_t".callback(
	BGFX_PACKAGE, void, "BGFXReleaseFunctionCallback",
	"",

	void_p.IN("_ptr", ""),
	nullable..void_p.IN("_userData", "")
) {
	documentation =
		"""
	"""
}

val bgfx_memory_t = struct_p(BGFX_PACKAGE, "BGFXMemory", nativeName = "bgfx_memory_t") {
	documentation =
	"""
	"""

	uint8_t.p.member("data", "")
	uint32_t.member("size", "")
}

val bgfx_transform_t = struct_p(BGFX_PACKAGE, "BGFXTransform", nativeName = "bgfx_transform_t") {
	documentation =
	"""
	"""

	float_p.member("data", "")
	uint16_t.member("num", "")
}

val bgfx_hmd_eye_t = struct(BGFX_PACKAGE, "BGFXHmdEye", nativeName = "bgfx_hmd_eye_t") {
	documentation =
	"""
	"""

	float.array("rotation", "", 4)
	float.array("translation", "", 3)
	float.array("fov", "", 4)
	float.array("viewOffset", "", 3)
	float.array("projection", "", 16)
	float.array("pixelsPerTanAngle", "", 2)
}.nativeType

val bgfx_hmd_t = struct_p(BGFX_PACKAGE, "BGFXHmd", nativeName = "bgfx_hmd_t") {
	documentation =
	"""
	"""

	bgfx_hmd_eye_t.array("eye", "", 2)
	uint16_t.member("width", "")
	uint16_t.member("height", "")
	uint32_t.member("deviceWidth", "")
	uint32_t.member("deviceHeight", "")
	uint8_t.member("flags", "")
}

val bgfx_stats_t = struct_p(BGFX_PACKAGE, "BGFXStats", nativeName = "bgfx_stats_t") {
	documentation =
	"""
	"""

	uint64_t.member("cpuTimeBegin", "")
	uint64_t.member("cpuTimeEnd", "")
	uint64_t.member("cpuTimerFreq", "")

	uint64_t.member("gpuTimeBegin", "")
	uint64_t.member("gpuTimeEnd", "")
	uint64_t.member("gpuTimerFreq", "")

	int64_t.member("waitRender", "")
	int64_t.member("waitSubmit", "")
}

val bgfx_vertex_decl_t = struct_p(BGFX_PACKAGE, "BGFXVertexDecl", nativeName = "bgfx_vertex_decl_t") {
	documentation =
	"""
	"""

	uint32_t.member("hash", "")
	uint16_t.member("stride", "")
	uint16_t.array("offset", "", 16)
	uint16_t.array("attributes", "", 16)
}

val bgfx_transient_index_buffer_t = struct_p(BGFX_PACKAGE, "BGFXTransientIndexBuffer", nativeName = "bgfx_transient_index_buffer_t") {
	documentation =
	"""
	"""

	nullable..uint8_t.p.member("data", "")
	uint32_t.member("size", "")
	bgfx_index_buffer_handle_t.member("handle", "")
	uint32_t.member("startIndex", "")
}

val bgfx_transient_vertex_buffer_t = struct_p(BGFX_PACKAGE, "BGFXTransientVertexBuffer", nativeName = "bgfx_transient_vertex_buffer_t") {
	documentation =
	"""
	"""

	nullable..uint8_t.p.member("data", "")
	uint32_t.member("size", "")
	uint32_t.member("startVertex", "")
	uint16_t.member("stride", "")
	bgfx_vertex_buffer_handle_t.member("handle", "")
	bgfx_vertex_decl_handle_t.member("decl", "")
}

val bgfx_instance_data_buffer_t = struct_p(BGFX_PACKAGE, "BGFXInstanceDataBuffer", nativeName = "bgfx_instance_data_buffer_t") {
	documentation =
	"""
	"""

	uint8_t.p.member("data", "")
	uint32_t.member("size", "")
	uint32_t.member("offset", "")
	uint32_t.member("num", "")
	uint16_t.member("stride", "")
	bgfx_vertex_buffer_handle_t.member("handle", "")
}

val bgfx_texture_info_t = struct(BGFX_PACKAGE, "BGFXTextureInfo", nativeName = "bgfx_texture_info_t") {
	documentation =
	"""
	"""

	bgfx_texture_format_t.member("format", "")
	uint32_t.member("storageSize", "")
	uint16_t.member("width", "")
	uint16_t.member("height", "")
	uint16_t.member("depth", "")
	uint16_t.member("numLayers", "")
	uint8_t.member("numMips", "")
	uint8_t.member("bitsPerPixel", "")
	bool.member("cubeMap", "")
}.nativeType

val bgfx_attachment_t = struct_p(BGFX_PACKAGE, "BGFXAttachment", nativeName = "bgfx_attachment_t") {
	documentation =
	"""
	"""

	bgfx_texture_handle_t.member("handle", "")
	uint16_t.member("mip", "")
	uint16_t.member("layer", "")
}

val bgfx_caps_gpu_t = struct(BGFX_PACKAGE, "BGFXCapsGPU", nativeName = "bgfx_caps_gpu_t", mutable = false) {
	documentation =
	"""
	"""

	uint16_t.member("vendorId", "")
	uint16_t.member("deviceId", "")
}.nativeType

val bgfx_caps_limits_t = struct(BGFX_PACKAGE, "BGFXCapsLimits", nativeName = "bgfx_caps_limits_t", mutable = false) {
	documentation =
	"""
	"""

	uint32_t.member("maxDrawCalls", "")
	uint32_t.member("maxBlits", "")
	uint32_t.member("maxTextureSize", "")
	uint32_t.member("maxViews", "")
	uint32_t.member("maxFrameBuffers", "")
	uint32_t.member("maxFBAttachments", "")
	uint32_t.member("maxPrograms", "")
	uint32_t.member("maxShaders", "")
	uint32_t.member("maxTextures", "")
	uint32_t.member("maxTextureSamplers", "")
	uint32_t.member("maxVertexDecls", "")
	uint32_t.member("maxVertexStreams", "")
	uint32_t.member("maxIndexBuffers", "")
	uint32_t.member("maxVertexBuffers", "")
	uint32_t.member("maxDynamicIndexBuffers", "")
	uint32_t.member("maxDynamicVertexBuffers", "")
	uint32_t.member("maxUniforms", "")
	uint32_t.member("maxOcclusionQueries", "")
}.nativeType

val BGFX_TEXTURE_FORMATS_COUNT = 76
val bgfx_caps_t = struct_p(BGFX_PACKAGE, "BGFXCaps", nativeName = "bgfx_caps_t", mutable = false) {
	documentation =
	"""
	"""

	bgfx_renderer_type_t.member("rendererType", "")

	uint64_t.member("supported", "")

	uint16_t.member("vendorId", "")
	uint16_t.member("deviceId", "")
	bool.member("homogeneousDepth", "")
	bool.member("originBottomLeft", "")

	bgfx_caps_gpu_t.array("gpu", "", 4)
	bgfx_caps_limits_t.member("limits", "")

	uint16_t.array("formats", "", size = BGFX_TEXTURE_FORMATS_COUNT)
}

val bgfx_fatal_t = "bgfx_fatal_t".enumType

val fatal = "fatal".callback(
	BGFX_PACKAGE, void, "BGFXFatalCallback",
	"",

	voidptr.IN("_this", ""),
	bgfx_fatal_t.IN("_code", ""),
	NullTerminated..charUTF8_p.IN("_str", "")
) {
	documentation =
	"""
	"""
}

val trace_vargs = "trace_vargs".callback(
	BGFX_PACKAGE, void, "BGFXTraceVarArgsCallback",
	"",

	voidptr.IN("_this", ""),
	NullTerminated..charUTF8_p.IN("_filePath", ""),
	uint16_t.IN("_line", ""),
	NullTerminated..charUTF8_p.IN("_format", ""),
	va_list.IN("_argList", "")
) {
	documentation =
	"""
	"""
}

val cache_read_size = "cache_read_size".callback(
	BGFX_PACKAGE, uint32_t, "BGFXCacheReadSizeCallback",
	"",

	voidptr.IN("_this", ""),
	uint64_t.IN("_id", "")
) {
	documentation =
	"""
	"""
}

val cache_read = "cache_read".callback(
	BGFX_PACKAGE, void, "BGFXCacheReadCallback",
	"",

	voidptr.IN("_this", ""),
	uint64_t.IN("_id", ""),
	void_p.IN("_data", ""),
	uint32_t.IN("_size", "")
) {
	documentation =
	"""
	"""
}

val cache_write = "cache_write".callback(
	BGFX_PACKAGE, void, "BGFXCacheWriteCallback",
	"",

	voidptr.IN("_this", ""),
	uint64_t.IN("_id", ""),
	void_p.const_p.IN("_data", ""),
	uint32_t.IN("_size", "")
) {
	documentation =
	"""
	"""
}

val screen_shot = "screen_shot".callback(
	BGFX_PACKAGE, void, "BGFXScreenShotCallback",
	"",

	voidptr.IN("_this", ""),
	NullTerminated..charUTF8_p.IN("_filePath", ""),
	uint32_t.IN("_width", ""),
	uint32_t.IN("_height", ""),
	uint32_t.IN("_pitch", ""),
	void_p.const_p.IN("_data", ""),
	uint32_t.IN("_size", ""),
	bool.IN("_yflip", "")
) {
	documentation =
	"""
	"""
}

val capture_begin = "capture_begin".callback(
	BGFX_PACKAGE, void, "BGFXCaptureBeginCallback",
	"",

	voidptr.IN("_this", ""),
	uint32_t.IN("_width", ""),
	uint32_t.IN("_height", ""),
	uint32_t.IN("_pitch", ""),
	bgfx_texture_format_t.IN("_format", ""),
	bool.IN("_yflip", "")
) {
	documentation =
	"""
	"""
}

val capture_end = "capture_end".callback(
	BGFX_PACKAGE, void, "BGFXCaptureEndCallback",
	"",

	voidptr.IN("_this", "")
) {
	documentation =
	"""
	"""
}

val capture_frame = "capture_frame".callback(
	BGFX_PACKAGE, void, "BGFXCaptureFrameCallback",
	"",

	voidptr.IN("_this", ""),
	void_p.const_p.IN("_data", ""),
	uint32_t.IN("_size", "")
) {
	documentation =
	"""
	"""
}

val bgfx_callback_vtbl_t = struct(BGFX_PACKAGE, "BGFXCallbackVtbl", nativeName = "bgfx_callback_vtbl_t") {
	documentation =
	"""
	"""

	fatal.member("fatal", "")
	trace_vargs.member("trace_vargs", "")
	cache_read_size.member("cache_read_size", "")
	cache_read.member("cache_read", "")
	cache_write.member("cache_write", "")
	screen_shot.member("screen_shot", "")
	capture_begin.member("capture_begin", "")
	capture_end.member("capture_end", "")
	capture_frame.member("capture_frame", "")
}.nativeType

val bgfx_callback_interface_t = struct_p(BGFX_PACKAGE, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t") {
	documentation =
	"""
	"""

	bgfx_callback_vtbl_t.const_p.member("vtbl", "")
}

val realloc = "realloc".callback(
	BGFX_PACKAGE, void_p, "BGFXReallocCallback",
	"",

	voidptr.IN("_this", ""),
	nullable..void_p.IN("_ptr", ""),
	size_t.IN("_size", ""),
	size_t.IN("_align", ""),
	NullTerminated..charUTF8_p.IN("_file", ""),
	uint32_t.IN("_line", "")
) {
	documentation =
	"""
	"""
}

val bgfx_allocator_vtbl_t = struct(BGFX_PACKAGE, "BGFXAllocatorVtbl", nativeName = "bgfx_allocator_vtbl_t") {
	documentation =
	"""
	"""

	realloc.member("realloc", "")
}.nativeType

val bgfx_allocator_interface_t = struct_p(BGFX_PACKAGE, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t") {
	documentation =
	"""
	"""

	bgfx_allocator_vtbl_t.const_p.member("vtbl", "")
}

val bgfx_platform_data_t = struct_p(BGFX_PACKAGE, "BGFXPlatformData", nativeName = "bgfx_platform_data_t") {
	documentation =
	"""
	"""

	nullable..voidptr.member("ndt", "")
	nullable..voidptr.member("nwh", "")
	nullable..voidptr.member("context", "")
	nullable..voidptr.member("backBuffer", "")
	nullable..voidptr.member("backBufferDS", "")
}