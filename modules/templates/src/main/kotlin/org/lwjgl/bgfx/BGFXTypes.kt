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
        Contains bindings to the ${url("https://github.com/bkaradzic/bgfx", "bgfx")} library.

        The bgfx documentation can be found online ${url("https://bkaradzic.github.io/bgfx/", "here")}. The API reference is available
        ${url("https://bkaradzic.github.io/bgfx/bgfx.html", "here")}.

        The bgfx library is very customizable and can be tailored to specific needs. For this reason, the {@code lwjgl-bgfx} artifact does not include any
        prebuilt native libraries.

        To compile your own version, follow the ${url("https://bkaradzic.github.io/bgfx/build.html", "build instructions")} for Windows, Linux and MacOS.
        Please ensure to use the {@code --with-shared-lib} configuration to create a shared library. Just copy the compiled library found in
        {@code <bgfx>/.build/<platform>/bin/} to the classpath of your LWJGL application.

        By default, lwjgl-bgfx searches for bgfx[32].dll (Windows), libbgfx.so (Linux) or libbgfx.dylib (MacOS). This can be customized by defining
        {@code org.lwjgl.bgfx.libname}.
        """
    )
}

val BGFX_BINDING = simpleBinding("bgfx", """Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx"))""", bundledWithLWJGL = true)
val BGFX_BINDING_DELEGATE = BGFX_BINDING.delegate("BGFX.getLibrary()")

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
    "Memory release callback.",

    opaque_p.IN("_ptr", ""),
    nullable..void_p.IN("_userData", "")
) {
    documentation = "Instances of this interface may be passed to the #make_ref_release() method."
}

val bgfx_memory_t_p = struct(BGFX_PACKAGE, "BGFXMemory", nativeName = "bgfx_memory_t") {
    documentation = "Memory obtained by calling #alloc(), #copy(), or #make_ref()."

    uint8_t.p.member("data", "pointer to allocated memory")
    AutoSize("data")..uint32_t.member("size", "size of {@code data}, in bytes")
}.p

val bgfx_transform_t_p = struct(BGFX_PACKAGE, "BGFXTransform", nativeName = "bgfx_transform_t", mutable = false) {
    documentation = "Transform data."

    float_p.member("data", "pointer to first 4x4 matrix")
    AutoSizeShl("4", "data")..uint16_t.member("num", "number of matrices")
}.p

val bgfx_hmd_eye_t = struct(BGFX_PACKAGE, "BGFXHmdEye", nativeName = "bgfx_hmd_eye_t", mutable = false) {
    documentation = "Eye."

    float.array("rotation", "eye rotation represented as quaternion", size = 4)
    float.array("translation", "eye translation", size = 3)
    float.array("fov", "field of view (up, down, left, right)", size = 4)
    float.array("viewOffset", "eye view matrix translation adjustment", size = 3)
    float.array("projection", "eye projection matrix", size = 16)
    float.array("pixelsPerTanAngle", "number of pixels that fit in tan(angle) = 1.", size = 2)
}

val bgfx_hmd_t_p = struct(BGFX_PACKAGE, "BGFXHmd", nativeName = "bgfx_hmd_t", mutable = false) {
    documentation = "HMD info."

    bgfx_hmd_eye_t.array("eye", "", size = 2)
    uint16_t.member("width", "frame buffer width")
    uint16_t.member("height", "frame buffer height")
    uint32_t.member("deviceWidth", "device resolution width")
    uint32_t.member("deviceHeight", "device resolution height")
    uint8_t.member("flags", "status flags")
}.p

val bgfx_stats_t_p = struct(BGFX_PACKAGE, "BGFXStats", nativeName = "bgfx_stats_t", mutable = false) {
    documentation = "Renderer statistics data."

    uint64_t.member("cpuTimeBegin", "CPU frame begin time")
    uint64_t.member("cpuTimeEnd", "CPU frame end time")
    uint64_t.member("cpuTimerFreq", "CPU timer frequency")

    uint64_t.member("gpuTimeBegin", "GPU frame begin time")
    uint64_t.member("gpuTimeEnd", "GPU frame end time")
    uint64_t.member("gpuTimerFreq", "GPU timer frequency")

    int64_t.member("waitRender", "time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API")
    int64_t.member("waitSubmit", "time spent waiting for submit thread to advance to next frame")

    uint32_t.member("numDraw", "number of draw calls submitted")
    uint32_t.member("numCompute", "number of compute calls submitted")
    uint32_t.member("maxGpuLatency", "GPU driver latency")

    uint16_t.member("width", "backbuffer width in pixels")
    uint16_t.member("height", "backbuffer height in pixels")
    uint16_t.member("textWidth", "debug text width in characters")
    uint16_t.member("textHeight", "debug text height in characters")
}.p

val bgfx_vertex_decl_t_p = struct(BGFX_PACKAGE, "BGFXVertexDecl", nativeName = "bgfx_vertex_decl_t") {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT")
    documentation = "Vertex declaration."

    uint32_t.member("hash", "")
    uint16_t.member("stride", "vertex stride")
    uint16_t.array("offset", "relative attribute offset from the vertex", size = "BGFX_ATTRIB_COUNT")
    uint16_t.array("attributes", "", size = "BGFX_ATTRIB_COUNT")
}.p

val bgfx_transient_index_buffer_t_p = struct(BGFX_PACKAGE, "BGFXTransientIndexBuffer", nativeName = "bgfx_transient_index_buffer_t") {
    documentation = "Transient index buffer."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
    bgfx_index_buffer_handle_t.member("handle", "index buffer handle")
    uint32_t.member("startIndex", "first index")
}.p

val bgfx_transient_vertex_buffer_t_p = struct(BGFX_PACKAGE, "BGFXTransientVertexBuffer", nativeName = "bgfx_transient_vertex_buffer_t") {
    documentation = "Transient vertex buffer."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
    uint32_t.member("startVertex", "first vertex")
    uint16_t.member("stride", "vertex stride")
    bgfx_vertex_buffer_handle_t.member("handle", "vertex buffer handle")
    bgfx_vertex_decl_handle_t.member("decl", "vertex declaration handle")
}.p

val bgfx_instance_data_buffer_t_p = struct(BGFX_PACKAGE, "BGFXInstanceDataBuffer", nativeName = "bgfx_instance_data_buffer_t") {
    documentation = "Instance data buffer info."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
    uint32_t.member("offset", "offset in vertex buffer")
    uint32_t.member("num", "number of instances")
    uint16_t.member("stride", "vertex stride")
    bgfx_vertex_buffer_handle_t.member("handle", "vertex buffer object handle")
}.p

val bgfx_texture_info_t_p = struct(BGFX_PACKAGE, "BGFXTextureInfo", nativeName = "bgfx_texture_info_t", mutable = false) {
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
}.p

val bgfx_uniform_info_t_p = struct(BGFX_PACKAGE, "BGFXUniformInfo", nativeName = "bgfx_uniform_info_t") {
    documentation = "Uniform info."

    charASCII.array("name", "uniform name", size = 256)
    bgfx_uniform_type_t.member("type", "uniform type")
    uint16_t.member("num", "number of elements in array")
}.p

val bgfx_attachment_t_p = struct(BGFX_PACKAGE, "BGFXAttachment", nativeName = "bgfx_attachment_t") {
    documentation = "Frame buffer texture attachemnt info."

    bgfx_texture_handle_t.member("handle", "texture handle")
    uint16_t.member("mip", "mip level")
    uint16_t.member("layer", "cubemap side or depth layer/slice")
}.p

val bgfx_caps_gpu_t = struct(BGFX_PACKAGE, "BGFXCapsGPU", nativeName = "bgfx_caps_gpu_t", mutable = false) {
    documentation = "GPU info."

    uint16_t.member("vendorId", "vendor PCI id").links("PCI_ID_\\w+")
    uint16_t.member("deviceId", "device id")
}

val bgfx_caps_limits_t = struct(BGFX_PACKAGE, "BGFXCapsLimits", nativeName = "bgfx_caps_limits_t", mutable = false) {
    documentation = "Rendering limits."

    uint32_t.member("maxDrawCalls", "maximum draw calls")
    uint32_t.member("maxBlits", "maximum number of blit calls")
    uint32_t.member("maxTextureSize", "maximum texture size")
    uint32_t.member("maxViews", "maximum views")
    uint32_t.member("maxFrameBuffers", "maximum number of frame buffer handles")
    uint32_t.member("maxFBAttachments", "maximum frame buffer attachments")
    uint32_t.member("maxPrograms", "maximum number of program handles")
    uint32_t.member("maxShaders", "maximum number of shader handles")
    uint32_t.member("maxTextures", "maximum number of texture handles")
    uint32_t.member("maxTextureSamplers", "maximum number of texture samplers")
    uint32_t.member("maxVertexDecls", "maximum number of vertex format declarations")
    uint32_t.member("maxVertexStreams", "maximum number of vertex streams")
    uint32_t.member("maxIndexBuffers", "maximum number of index buffer handles")
    uint32_t.member("maxVertexBuffers", "maximum number of vertex buffer handles")
    uint32_t.member("maxDynamicIndexBuffers", "maximum number of dynamic index buffer handles")
    uint32_t.member("maxDynamicVertexBuffers", "maximum number of vertex buffer handles")
    uint32_t.member("maxUniforms", "maximum number of uniform handles")
    uint32_t.member("maxOcclusionQueries", "maximum number of occlusion query handles")
}

val bgfx_caps_t_p = struct(BGFX_PACKAGE, "BGFXCaps", nativeName = "bgfx_caps_t", mutable = false) {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT")
    documentation = "Renderer capabilities."

    bgfx_renderer_type_t.member("rendererType", "renderer backend type").links("RENDERER_TYPE_(?!COUNT)\\w+")

    uint64_t.member("supported", "supported functionality").links("CAPS_(?!FORMAT_)\\w+", LinkMode.BITFIELD)

    uint16_t.member("vendorId", "selected GPU vendor PCI id").links("PCI_ID_\\w+")
    uint16_t.member("deviceId", "selected GPU device id")
    bool.member("homogeneousDepth", "true when NDC depth is in [-1, 1] range")
    bool.member("originBottomLeft", "true when NDC origin is at bottom left")
    AutoSize("gpu")..uint8_t.member("numGPUs", "number of enumerated GPUs")

    bgfx_caps_gpu_t.array("gpu", "enumerated GPUs", size = 4)
    bgfx_caps_limits_t.member("limits", "rendering limits")

    uint16_t.array("formats", "supported texture formats", size = "BGFX_TEXTURE_FORMAT_COUNT")
}.p

// Callback interface

val bgfx_callback_interface_t_p = struct(BGFX_PACKAGE, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t").p

val bgfx_fatal_t = "bgfx_fatal_t".enumType
val fatal = "fatal".callback(
    BGFX_PACKAGE, void, "BGFXFatalCallback",
    "Will be called when a fatal error occurs.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    bgfx_fatal_t.IN("_code", "the error code"),
    charASCII_p.IN("_str", "the error message")
) {
    documentation =
        """
    If fatal code is not #FATAL_DEBUG_CHECK this callback is called on unrecoverable error. It's not safe to continue, inform user and terminate application
    from this call.

    Not thread safe and it can be called from any thread.
    """
}

val trace_vargs = "trace_vargs".callback(
    BGFX_PACKAGE, void, "BGFXTraceVarArgsCallback",
    "Will be called when a debug message is produced.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    charASCII_p.IN("_filePath", "file path where debug message was generated"),
    uint16_t.IN("_line", "line where debug message was generated"),
    NullTerminated..charUTF8_p.IN("_format", "{@code printf} style format"),
    va_list.IN("_argList", "variable arguments list initialized with {@code va_start}")
) {
    documentation =
        """
    Prints a debug message.

    Not thread safe and it can be called from any thread.
    """
}

val cache_read_size = "cache_read_size".callback(
    BGFX_PACKAGE, uint32_t, "BGFXCacheReadSizeCallback",
    "Will be called to determine size of cached item.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    uint64_t.IN("_id", "cache id"),

    returnDoc = "number of bytes to read"
) {
    documentation = "Returns size of cached item. Returns 0 if no cached item was found."
}

val cache_read = "cache_read".callback(
    BGFX_PACKAGE, bool, "BGFXCacheReadCallback",
    "Will be called to read a cached item.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    uint64_t.IN("_id", "cache id"),
    void_p.IN("_data", "buffer where to read data"),
    AutoSize("_data")..uint32_t.IN("_size", "size of data to read"),

    returnDoc = "true if data is read"
) {
    documentation = "Reads cached item."
}

val cache_write = "cache_write".callback(
    BGFX_PACKAGE, void, "BGFXCacheWriteCallback",
    "Will be called to writes a cached item.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    uint64_t.IN("_id", "cache id"),
    const..void_p.IN("_data", "data to write"),
    AutoSize("_data")..uint32_t.IN("_size", "size of data to write")
) {
    documentation = "Writes cached item."
}

val screen_shot = "screen_shot".callback(
    BGFX_PACKAGE, void, "BGFXScreenShotCallback",
    "",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    charASCII_p.IN("_filePath", "file path"),
    uint32_t.IN("_width", "image width"),
    uint32_t.IN("_height", "image height"),
    uint32_t.IN("_pitch", "number of bytes to skip to next line"),
    const..void_p.IN("_data", "image data"),
    uint32_t.IN("_size", "image size"),
    bool.IN("_yflip", "if true image origin is bottom left")
) {
    documentation = "Screenshot captured. Screenshot format is always 4-byte BGRA."
}

val capture_begin = "capture_begin".callback(
    BGFX_PACKAGE, void, "BGFXCaptureBeginCallback",
    "Will be called when capture begins.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    uint32_t.IN("_width", "image width"),
    uint32_t.IN("_height", "image height"),
    uint32_t.IN("_pitch", "number of bytes to skip to next line"),
    bgfx_texture_format_t.IN("_format", "texture format"),
    bool.IN("_yflip", "if true image origin is bottom left")
) {
    documentation = "Called when capture begins."
}

val capture_end = "capture_end".callback(
    BGFX_PACKAGE, void, "BGFXCaptureEndCallback",
    "Will be called when capture ends.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface")
) {
    documentation = "Called when capture ends."
}

val capture_frame = "capture_frame".callback(
    BGFX_PACKAGE, void, "BGFXCaptureFrameCallback",
    "Will be called when a frame is captured.",

    bgfx_callback_interface_t_p.IN("_this", "the callback interface"),
    const..void_p.IN("_data", "image data"),
    AutoSize("_data")..uint32_t.IN("_size", "image size")
) {
    documentation = "Captured frame."
}

val bgfx_callback_vtbl_t = struct(BGFX_PACKAGE, "BGFXCallbackVtbl", nativeName = "bgfx_callback_vtbl_t") {
    documentation = "Callback virtual table."

    fatal.member("fatal", "the fatal error callback")
    trace_vargs.member("trace_vargs", "the debug message callback")
    cache_read_size.member("cache_read_size", "the cache read size callback")
    cache_read.member("cache_read", "the cache read callback")
    cache_write.member("cache_write", "the cache write callback")
    screen_shot.member("screen_shot", "the screenshot callback")
    capture_begin.member("capture_begin", "the capture begin callback")
    capture_end.member("capture_end", "the capture end callback")
    capture_frame.member("capture_frame", "the capture framecallback")
}

val bgfx_callback_interface_t = struct(BGFX_PACKAGE, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t") {
    documentation =
        """
    Callback interface to implement application specific behavior.

    Cached items are currently used for OpenGL and Direct3D 12 binary shaders.

    {@code fatal} and {@code trace_vargs} callbacks can be called from any thread. Other callbacks are called from the render thread.
    """

    const..bgfx_callback_vtbl_t.p.member("vtbl", "the callback virtual table")
}

// Allocator interface

val bgfx_allocator_interface_t_p = struct(BGFX_PACKAGE, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t").p

val realloc = "realloc".callback(
    BGFX_PACKAGE, opaque_p, "BGFXReallocCallback",
    "Will be called when an allocation is requested.",

    bgfx_allocator_interface_t_p.IN("_this", "the allocator interface"),
    nullable..opaque_p.IN("_ptr", "the previously allocated memory or #NULL"),
    size_t.IN("_size", "the number of bytes to allocate"),
    size_t.IN("_align", "the allocation alignment, in bytes"),
    charASCII_p.IN("_file", "file path where allocation was generated"),
    uint32_t.IN("_line", "line where allocation was generated")
) {
    documentation = "Allocates memory."
}

val bgfx_allocator_vtbl_t = struct(BGFX_PACKAGE, "BGFXAllocatorVtbl", nativeName = "bgfx_allocator_vtbl_t") {
    documentation = "Allocator virtual table"

    realloc.member("realloc", "the reallocation callback")
}

val bgfx_allocator_interface_t = struct(BGFX_PACKAGE, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t") {
    documentation =
        "Custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe."

    const..bgfx_allocator_vtbl_t.p.member("vtbl", "the allocator virtual table")
}

// Platform API

val bgfx_renderer_frame_t = "bgfx_renderer_frame_t".enumType

val bgfx_platform_data_t_p = struct(BGFX_PACKAGE, "BGFXPlatformData", nativeName = "bgfx_platform_data_t") {
    documentation = "Platform data."

    nullable..opaque_p.member("ndt", "native display type")
    nullable..opaque_p.member("nwh", "native window handle")
    nullable..opaque_p.member("context", "GL context, or D3D device")
    nullable..opaque_p.member("backBuffer", "GL backbuffer, or D3D render target view")
    nullable..opaque_p.member("backBufferDS", "Backbuffer depth/stencil")
    nullable..opaque_p.member("session", "{@code ovrSession}, for Oculus SDK")
}.p

val bgfx_internal_data_t_p = struct(BGFX_PACKAGE, "BGFXInternalData", nativeName = "bgfx_internal_data_t", mutable = false) {
    documentation = "Internal data."

    bgfx_caps_t_p.member("caps", "renderer capabilities")
    opaque_p.IN("context", "GL context, or D3D device")
}.p