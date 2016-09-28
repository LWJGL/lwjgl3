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

		The bgfx documentation can be found online <a href="https://bkaradzic.github.io/bgfx/">here</a>. The API reference is available
		<a href="https://bkaradzic.github.io/bgfx/bgfx.html">here</a>.

		The bgfx library is very customizable and can be tailored to specific needs. For this reason, the {@code lwjgl-bgfx} artifact does not include any
		prebuilt native libraries.

		To compile your own version, follow the <a href="https://bkaradzic.github.io/bgfx/build.html">build instructions</a> for Windows, Linux and MacOS.
		Please ensure to use the {@code --with-shared-lib} configuration to create a shared library. Just copy the compiled library found in
		{@code <bgfx>/.build/<platform>/bin/} to the classpath of your LWJGL application.

		By default, lwjgl-bgfx searches for bgfx[32].dll (Windows), libbgfx.so (Linux) or libbgfx.dylib (MacOS). This can be customized by defining
		{@code org.lwjgl.bgfx.libname}.
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

/*
#define BGFX_HANDLE_T(_name) \
    typedef struct _name { uint16_t idx; } _name##_t
 */
private fun BGFX_HANDLE_T(type: String) = typedef(uint16_t, "bgfx_${type}_handle_t")

val bgfx_dynamic_index_buffer_handle_t = BGFX_HANDLE_T("dynamic_index_buffer")
val bgfx_dynamic_vertex_buffer_handle_t = BGFX_HANDLE_T("dynamic_vertex_buffer")
val bgfx_frame_buffer_handle_t = BGFX_HANDLE_T("frame_buffer")
val bgfx_index_buffer_handle_t = BGFX_HANDLE_T("index_buffer")
val bgfx_indirect_buffer_handle_t = BGFX_HANDLE_T("indirect_buffer")
val bgfx_occlusion_query_handle_t = BGFX_HANDLE_T("occlusion_query")
val bgfx_program_handle_t = BGFX_HANDLE_T("program")
val bgfx_shader_handle_t = BGFX_HANDLE_T("shader")
val bgfx_texture_handle_t = BGFX_HANDLE_T("texture")
val bgfx_uniform_handle_t = BGFX_HANDLE_T("uniform")
val bgfx_vertex_buffer_handle_t = BGFX_HANDLE_T("vertex_buffer")
val bgfx_vertex_decl_handle_t = BGFX_HANDLE_T("vertex_decl")

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

val bgfx_transform_t = struct_p(BGFX_PACKAGE, "BGFXTransform", nativeName = "bgfx_transform_t", mutable = false) {
	documentation = "Transform data."

	float_p.member("data", "pointer to first matrix")
	AutoSizeShl("4", "data")..uint16_t.member("num", "number of matrices")
}

val bgfx_hmd_eye_t = struct(BGFX_PACKAGE, "BGFXHmdEye", nativeName = "bgfx_hmd_eye_t", mutable = false) {
	documentation = "Eye."

	float.array("rotation", "eye rotation represented as quaternion", size = 4)
	float.array("translation", "eye translation", size = 3)
	float.array("fov", "field of view (up, down, left, right)", size = 4)
	float.array("viewOffset", "eye view matrix translation adjustment", size = 3)
	float.array("projection", "eye projection matrix", size = 16)
	float.array("pixelsPerTanAngle", "", size = 2)
}.nativeType

val bgfx_hmd_t = struct_p(BGFX_PACKAGE, "BGFXHmd", nativeName = "bgfx_hmd_t", mutable = false) {
	documentation = "HMD info."

	bgfx_hmd_eye_t.array("eye", "", size = 2)
	uint16_t.member("width", "framebuffer width")
	uint16_t.member("height", "framebuffer height")
	uint32_t.member("deviceWidth", "device resolution width")
	uint32_t.member("deviceHeight", "device resolution height")
	uint8_t.member("flags", "status flags")
}

val bgfx_stats_t = struct_p(BGFX_PACKAGE, "BGFXStats", nativeName = "bgfx_stats_t", mutable = false) {
	documentation = "Renderer statistics data."

	uint64_t.member("cpuTimeBegin", "CPU frame begin time")
	uint64_t.member("cpuTimeEnd", "CPU frame end time")
	uint64_t.member("cpuTimerFreq", "CPU timer frequency")

	uint64_t.member("gpuTimeBegin", "GPU frame begin time")
	uint64_t.member("gpuTimeEnd", "GPU frame end time")
	uint64_t.member("gpuTimerFreq", "GPU timer frequency")

	int64_t.member("waitRender", "time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API")
	int64_t.member("waitSubmit", "time spent waiting for submit thread to advance to next frame")
}

val bgfx_vertex_decl_t = struct_p(BGFX_PACKAGE, "BGFXVertexDecl", nativeName = "bgfx_vertex_decl_t") {
	javaImport("static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT")
	documentation = "Vertex declaration."

	uint32_t.member("hash", "")
	uint16_t.member("stride", "vertex stride")
	uint16_t.array("offset", "relative attribute offset from the vertex", size = "BGFX_ATTRIB_COUNT")
	uint16_t.array("attributes", "", size = "BGFX_ATTRIB_COUNT")
}

val bgfx_transient_index_buffer_t = struct_p(BGFX_PACKAGE, "BGFXTransientIndexBuffer", nativeName = "bgfx_transient_index_buffer_t") {
	documentation = "Transient index buffer."

	uint8_t.p.member("data", "pointer to data")
	AutoSize("data")..uint32_t.member("size", "data size")
	bgfx_index_buffer_handle_t.member("handle", "index buffer handle")
	uint32_t.member("startIndex", "first index")
}

val bgfx_transient_vertex_buffer_t = struct_p(BGFX_PACKAGE, "BGFXTransientVertexBuffer", nativeName = "bgfx_transient_vertex_buffer_t") {
	documentation = "Transient vertex buffer."

	uint8_t.p.member("data", "pointer to data")
	AutoSize("data")..uint32_t.member("size", "data size")
	uint32_t.member("startVertex", "first vertex")
	uint16_t.member("stride", "vertex stride")
	bgfx_vertex_buffer_handle_t.member("handle", "vertex buffer handle")
	bgfx_vertex_decl_handle_t.member("decl", "vertex declaration handle")
}

val bgfx_instance_data_buffer_t = struct_p(BGFX_PACKAGE, "BGFXInstanceDataBuffer", nativeName = "bgfx_instance_data_buffer_t") {
	documentation = "Instance data buffer info."

	uint8_t.p.member("data", "pointer to data")
	AutoSize("data")..uint32_t.member("size", "data size")
	uint32_t.member("offset", "offset in vertex buffer")
	uint32_t.member("num", "number of instances")
	uint16_t.member("stride", "vertex stride")
	bgfx_vertex_buffer_handle_t.member("handle", "vertex buffer object handle")
}

val bgfx_texture_info_t = struct(BGFX_PACKAGE, "BGFXTextureInfo", nativeName = "bgfx_texture_info_t", mutable = false) {
	documentation = "Texture info."

	bgfx_texture_format_t.member("format", "texture format").links("TEXTURE_FORMAT_(?!COUNT)\\w+")
	uint32_t.member("storageSize", "total amount of bytes required to store texture")
	uint16_t.member("width", "texture width")
	uint16_t.member("height", "texture height")
	uint16_t.member("depth", "texture depth")
	uint16_t.member("numLayers", "number of layers in texture array")
	uint8_t.member("numMips", "number of MIP maps")
	uint8_t.member("bitsPerPixel", "format bits per pixel")
	bool.member("cubeMap", "texture is cubemap")
}.nativeType

val bgfx_attachment_t = struct_p(BGFX_PACKAGE, "BGFXAttachment", nativeName = "bgfx_attachment_t") {
	documentation = "Frame buffer texture attachemnt info."

	bgfx_texture_handle_t.member("handle", "texture handle")
	uint16_t.member("mip", "mip level")
	uint16_t.member("layer", "cubemap side or depth layer/slice")
}

val bgfx_caps_gpu_t = struct(BGFX_PACKAGE, "BGFXCapsGPU", nativeName = "bgfx_caps_gpu_t", mutable = false) {
	documentation = "GPU info."

	uint16_t.member("vendorId", "")
	uint16_t.member("deviceId", "")
}.nativeType

val bgfx_caps_limits_t = struct(BGFX_PACKAGE, "BGFXCapsLimits", nativeName = "bgfx_caps_limits_t", mutable = false) {
	documentation = "Rendering limits."

	uint32_t.member("maxDrawCalls", "maximum draw calls")
	uint32_t.member("maxBlits", "")
	uint32_t.member("maxTextureSize", "maximum texture size")
	uint32_t.member("maxViews", "maximum views")
	uint32_t.member("maxFrameBuffers", "")
	uint32_t.member("maxFBAttachments", "maximum frame buffer attachments")
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

val bgfx_caps_t = struct_p(BGFX_PACKAGE, "BGFXCaps", nativeName = "bgfx_caps_t", mutable = false) {
	javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT")
	documentation = "Renderer capabilities."

	bgfx_renderer_type_t.member("rendererType", "renderer backend type").links("RENDERER_TYPE_(?!COUNT)\\w+")

	uint64_t.member("supported", "supported functionality").links("CAPS_(?!FORMAT_)\\w+", LinkMode.BITFIELD)

	uint16_t.member("vendorId", "selected GPU vendor id")
	uint16_t.member("deviceId", "selected GPU device id")
	bool.member("homogeneousDepth", "true when NDC depth is in [-1, 1] range")
	bool.member("originBottomLeft", "true when NDC origin is at bottom left")
	AutoSize("gpu")..uint8_t.member("numGPUs", "number of enumerated GPUs")

	bgfx_caps_gpu_t.array("gpu", "enumerated GPUs", size = 4)
	bgfx_caps_limits_t.member("limits", "rendering limits")

	uint16_t.array("formats", "supported texture formats", size = "BGFX_TEXTURE_FORMAT_COUNT")
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