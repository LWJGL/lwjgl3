/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bgfx

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.BGFX,
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

val BGFX_BINDING = simpleBinding(
    Module.BGFX,
    libraryExpression = """Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx"))""",
    bundledWithLWJGL = true
)
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
val bgfx_view_mode_t = "bgfx_view_mode_t".enumType

val bgfx_view_id_t = typedef(uint16_t, "bgfx_view_id_t")

val bgfx_encoder_s = "struct bgfx_encoder_s".opaque

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

val bgfx_release_fn_t = Module.BGFX.callback {
    void(
        "BGFXReleaseFunctionCallback",
        "Memory release callback.",

        opaque_p.IN("_ptr", "pointer to allocated data"),
        nullable..void.p.IN("_userData", "user defined data if needed"),

        nativeType = "bgfx_release_fn_t"
    ) {
        documentation = "Instances of this interface may be passed to the #make_ref_release() method."
    }
}
val bgfx_memory_t = struct(Module.BGFX, "BGFXMemory", nativeName = "bgfx_memory_t") {
    documentation = "Memory obtained by calling #alloc(), #copy(), or #make_ref()."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
}

val bgfx_transform_t = struct(Module.BGFX, "BGFXTransform", nativeName = "bgfx_transform_t", mutable = false) {
    documentation = "Transform data."

    float.p.member("data", "pointer to first 4x4 matrix")
    AutoSizeShl("4", "data")..uint16_t.member("num", "number of matrices")
}

val bgfx_hmd_eye_t = struct(Module.BGFX, "BGFXHmdEye", nativeName = "bgfx_hmd_eye_t", mutable = false) {
    documentation = "Eye."

    float.array("rotation", "eye rotation represented as quaternion", size = 4)
    float.array("translation", "eye translation", size = 3)
    float.array("fov", "field of view (up, down, left, right)", size = 4)
    float.array("viewOffset", "eye view matrix translation adjustment", size = 3)
    float.array("projection", "eye projection matrix", size = 16)
    float.array("pixelsPerTanAngle", "number of pixels that fit in tan(angle) = 1.", size = 2)
}

val bgfx_hmd_t = struct(Module.BGFX, "BGFXHmd", nativeName = "bgfx_hmd_t", mutable = false) {
    documentation = "HMD info."

    bgfx_hmd_eye_t.array("eye", "", size = 2)
    uint16_t.member("width", "frame buffer width")
    uint16_t.member("height", "frame buffer height")
    uint32_t.member("deviceWidth", "device resolution width")
    uint32_t.member("deviceHeight", "device resolution height")
    uint8_t.member("flags", "status flags")
}

val bgfx_view_stats_t = struct(Module.BGFX, "BGFXViewStats", nativeName = "bgfx_view_stats_t", mutable = false) {
    documentation = "View stats."

    charASCII.array("name", "view name", size = 256)
    bgfx_view_id_t.member("view", "view id")
    int64_t.member("cpuTimeElapsed", "CPU (submit) time elapsed")
    int64_t.member("gpuTimeElapsed", "GPU time elapsed")
}

val bgfx_encoder_stats_t = struct(Module.BGFX, "BGFXEncoderStats", nativeName = "bgfx_encoder_stats_t", mutable = false) {
    documentation = "Encoder stats."

    int64_t.member("cpuTimeBegin", "encoder thread CPU submit begin time")
    int64_t.member("cpuTimeEnd", "encoder thread CPU submit end time")
}

val bgfx_stats_t = struct(Module.BGFX, "BGFXStats", nativeName = "bgfx_stats_t", mutable = false) {
    documentation =
        """
        Renderer statistics data.

        All time values are high-resolution timestamps, while time frequencies define timestamps-per-second for that hardware.
        """

    int64_t.member("cpuTimeFrame", "CPU time between two #frame() calls")
    int64_t.member("cpuTimeBegin", "Render thread CPU submit begin time")
    int64_t.member("cpuTimeEnd", "Render thread CPU submit end time")
    int64_t.member("cpuTimerFreq", "CPU timer frequency. Timestamps-per-second.")

    int64_t.member("gpuTimeBegin", "GPU frame begin time")
    int64_t.member("gpuTimeEnd", "GPU frame end time")
    int64_t.member("gpuTimerFreq", "GPU timer frequency")

    int64_t.member("waitRender", "time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API")
    int64_t.member("waitSubmit", "time spent waiting for submit thread to advance to next frame")

    uint32_t.member("numDraw", "number of draw calls submitted")
    uint32_t.member("numCompute", "number of compute calls submitted")
    uint32_t.member("maxGpuLatency", "GPU driver latency")

    uint16_t.member("numDynamicIndexBuffers", "number of used dynamic index buffers")
    uint16_t.member("numDynamicVertexBuffers", "number of used dynamic vertex buffers")
    uint16_t.member("numFrameBuffers", "number of used frame buffers")
    uint16_t.member("numIndexBuffers", "number of used index buffers")
    uint16_t.member("numOcclusionQueries", "number of used occlusion queries")
    uint16_t.member("numPrograms", "number of used programs")
    uint16_t.member("numShaders", "number of used shaders")
    uint16_t.member("numTextures", "number of used textures")
    uint16_t.member("numUniforms", "number of used uniforms")
    uint16_t.member("numVertexBuffers", "number of used vertex buffers")
    uint16_t.member("numVertexDecls", "number of used vertex declarations")

    int64_t.member("textureMemoryUsed", "")
    int64_t.member("rtMemoryUsed", "")

    int64_t.member("gpuMemoryMax", "maximum available GPU memory for application")
    int64_t.member("gpuMemoryUsed", "amount of GPU memory used by the application")

    uint16_t.member("width", "backbuffer width in pixels")
    uint16_t.member("height", "backbuffer height in pixels")
    uint16_t.member("textWidth", "debug text width in characters")
    uint16_t.member("textHeight", "debug text height in characters")

    AutoSize("viewStats")..uint16_t.member("numViews", "number of view stats")
    bgfx_view_stats_t.p.buffer("viewStats", "array of view stats")

    AutoSize("encoderStats")..uint16_t.member("numEncoder", "number of encoders used during frame")
    bgfx_encoder_stats_t.p.buffer("encoderStats", "array of encoder stats")
}

val bgfx_vertex_decl_t = struct(Module.BGFX, "BGFXVertexDecl", nativeName = "bgfx_vertex_decl_t") {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT")
    documentation = "Vertex declaration."

    uint32_t.member("hash", "")
    uint16_t.member("stride", "vertex stride")
    uint16_t.array("offset", "relative attribute offset from the vertex", size = "BGFX_ATTRIB_COUNT")
    uint16_t.array("attributes", "", size = "BGFX_ATTRIB_COUNT")
}

val bgfx_transient_index_buffer_t = struct(Module.BGFX, "BGFXTransientIndexBuffer", nativeName = "bgfx_transient_index_buffer_t") {
    documentation = "Transient index buffer."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
    bgfx_index_buffer_handle_t.member("handle", "index buffer handle")
    uint32_t.member("startIndex", "first index")
}

val bgfx_transient_vertex_buffer_t = struct(Module.BGFX, "BGFXTransientVertexBuffer", nativeName = "bgfx_transient_vertex_buffer_t") {
    documentation = "Transient vertex buffer."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
    uint32_t.member("startVertex", "first vertex")
    uint16_t.member("stride", "vertex stride")
    bgfx_vertex_buffer_handle_t.member("handle", "vertex buffer handle")
    bgfx_vertex_decl_handle_t.member("decl", "vertex declaration handle")
}

val bgfx_instance_data_buffer_t = struct(Module.BGFX, "BGFXInstanceDataBuffer", nativeName = "bgfx_instance_data_buffer_t") {
    documentation = "Instance data buffer info."

    uint8_t.p.member("data", "pointer to data")
    AutoSize("data")..uint32_t.member("size", "data size")
    uint32_t.member("offset", "offset in vertex buffer")
    uint32_t.member("num", "number of instances")
    uint16_t.member("stride", "vertex stride")
    bgfx_vertex_buffer_handle_t.member("handle", "vertex buffer object handle")
}

val bgfx_texture_info_t_p = struct(Module.BGFX, "BGFXTextureInfo", nativeName = "bgfx_texture_info_t", mutable = false) {
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

val bgfx_uniform_info_t_p = struct(Module.BGFX, "BGFXUniformInfo", nativeName = "bgfx_uniform_info_t") {
    documentation = "Uniform info."

    charASCII.array("name", "uniform name", size = 256)
    bgfx_uniform_type_t.member("type", "uniform type")
    uint16_t.member("num", "number of elements in array")
}.p

val bgfx_attachment_t = struct(Module.BGFX, "BGFXAttachment", nativeName = "bgfx_attachment_t") {
    documentation = "Frame buffer texture attachment info."

    bgfx_texture_handle_t.member("handle", "texture handle")
    uint16_t.member("mip", "mip level")
    uint16_t.member("layer", "cubemap side or depth layer/slice")
}

val bgfx_caps_gpu_t = struct(Module.BGFX, "BGFXCapsGPU", nativeName = "bgfx_caps_gpu_t", mutable = false) {
    documentation = "GPU info."

    uint16_t.member("vendorId", "vendor PCI id").links("PCI_ID_\\w+")
    uint16_t.member("deviceId", "device id")
}

val bgfx_caps_limits_t = struct(Module.BGFX, "BGFXCapsLimits", nativeName = "bgfx_caps_limits_t", mutable = false) {
    documentation = "Rendering limits."

    uint32_t.member("maxDrawCalls", "maximum number of draw calls")
    uint32_t.member("maxBlits", "maximum number of blit calls")
    uint32_t.member("maxTextureSize", "maximum texture size")
    uint32_t.member("maxTextureLayers", "maximum texture layers")
    uint32_t.member("maxViews", "maximum number of views")
    uint32_t.member("maxFrameBuffers", "maximum number of frame buffer handles")
    uint32_t.member("maxFBAttachments", "maximum number of frame buffer attachments")
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
    uint32_t.member("maxEncoders", "maximum number of encoder threads")
}

val bgfx_caps_t = struct(Module.BGFX, "BGFXCaps", nativeName = "bgfx_caps_t", mutable = false) {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT")
    documentation = "Renderer capabilities."

    bgfx_renderer_type_t.member("rendererType", "renderer backend type").links("RENDERER_TYPE_(?!COUNT)\\w+")

    uint64_t.member("supported", "supported functionality").links("CAPS_(?!FORMAT_)\\w+", LinkMode.BITFIELD)

    uint16_t.member("vendorId", "selected GPU vendor PCI id").links("PCI_ID_\\w+")
    uint16_t.member("deviceId", "selected GPU device id")
    bool.member("homogeneousDepth", "true when NDC depth is in [-1, 1] range, otherwise its [0, 1]")
    bool.member("originBottomLeft", "true when NDC origin is at bottom left")
    AutoSize("gpu")..uint8_t.member("numGPUs", "number of enumerated GPUs")

    bgfx_caps_gpu_t.array("gpu", "enumerated GPUs", size = 4)
    bgfx_caps_limits_t.member("limits", "rendering limits")

    uint16_t.array("formats", "supported texture formats", size = "BGFX_TEXTURE_FORMAT_COUNT")
}

// Callback interface

val bgfx_fatal_t = "bgfx_fatal_t".enumType

private val _bgfx_callback_interface_t = struct(Module.BGFX, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t")
val bgfx_callback_vtbl_t = struct(Module.BGFX, "BGFXCallbackVtbl", nativeName = "bgfx_callback_vtbl_t") {
    documentation = "Callback virtual table."

    Module.BGFX.callback {
        void(
            "BGFXFatalCallback",
            "This callback is called on unrecoverable errors.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            bgfx_fatal_t.IN("_code", "the error code"),
            charASCII.p.IN("_str", "the error message")
        ) {
            documentation =
                """
                If fatal code is not #FATAL_DEBUG_CHECK this callback is called on unrecoverable error. It's not safe to continue, inform user and terminate
                application from this call.

                Not thread safe and it can be called from any thread.
                """
        }
    }.member("fatal", "the fatal error callback")
    Module.BGFX.callback {
        void(
            "BGFXTraceVarArgsCallback",
            "Will be called when a debug message is produced.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            charASCII.const.p.IN("_filePath", "file path where debug message was generated"),
            uint16_t.IN("_line", "line where debug message was generated"),
            NullTerminated..charUTF8.const.p.IN("_format", "{@code printf} style format"),
            va_list.IN("_argList", "variable arguments list initialized with {@code va_start}")
        ) {
            documentation =
                """
            Prints a debug message.

            Not thread safe and it can be called from any thread.
            """
        }
    }.member("trace_vargs", "the debug message callback")
    Module.BGFX.callback {
        void(
            "BGFXProfilerBegin",
            """
            Will be called when a profiler region begins.

            Not thread safe and it can be called from any thread.
            """,

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            charASCII.const.p.IN("_name", "region name, contains dynamic string"),
            uint32_t.IN("_abgr", "color of profiler region"),
            charASCII.const.p.IN("_filePath", "file path where {@code profiler_begin} was called"),
            uint16_t.IN("_line", "line where {@code profiler_begin} was called")
        ) {
            documentation = "Profiler region begin."
        }
    }.member("profiler_begin", "the profiler begin callback")
    Module.BGFX.callback {
        void(
            "BGFXProfilerBeginLiteral",
            """
            Will be called when a profiler region with string literal begins.

            Not thread safe and it can be called from any thread.
            """,

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            charASCII.const.p.IN("_name", "region name, contains string literal"),
            uint32_t.IN("_abgr", "color of profiler region"),
            charASCII.const.p.IN("_filePath", "file path where {@code profiler_begin_literal} was called"),
            uint16_t.IN("_line", "line where {@code profiler_begin_literal} was called")
        ) {
            documentation = "Profiler region begin with string literal name."
        }
    }.member("profiler_begin_literal", "the profiler begin literal callback")
    Module.BGFX.callback {
        void(
            "BGFXProfilerEnd",
            """
            Will be called when a profiler region ends.

            Not thread safe and it can be called from any thread.
            """,

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface")
        ) {
            documentation = "Profiler region end."
        }
    }.member("profiler_end", "the profiler end callback")
    Module.BGFX.callback {
        uint32_t(
            "BGFXCacheReadSizeCallback",
            "Will be called to determine size of cached item.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            uint64_t.IN("_id", "cache id"),

            returnDoc = "number of bytes to read"
        ) {
            documentation = "Returns the size of a cached item. Returns 0 if no cached item was found."
        }
    }.member("cache_read_size", "the cache read size callback")
    Module.BGFX.callback {
        bool(
            "BGFXCacheReadCallback",
            "Will be called to read a cached item.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            uint64_t.IN("_id", "cache id"),
            void.p.IN("_data", "buffer where to read data"),
            AutoSize("_data")..uint32_t.IN("_size", "size of data to read"),

            returnDoc = "true if data is read"
        ) {
            documentation = "Reads cached item."
        }
    }.member("cache_read", "the cache read callback")
    Module.BGFX.callback {
        void(
            "BGFXCacheWriteCallback",
            "Will be called to writes a cached item.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            uint64_t.IN("_id", "cache id"),
            void.const.p.IN("_data", "data to write"),
            AutoSize("_data")..uint32_t.IN("_size", "size of data to write")
        ) {
            documentation = "Writes cached item."
        }
    }.member("cache_write", "the cache write callback")
    Module.BGFX.callback {
        void(
            "BGFXScreenShotCallback",
            "",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            charASCII.const.p.IN("_filePath", "file path"),
            uint32_t.IN("_width", "image width"),
            uint32_t.IN("_height", "image height"),
            uint32_t.IN("_pitch", "number of bytes to skip between the start of each horizontal line of the image"),
            void.const.p.IN("_data", "image data"),
            uint32_t.IN("_size", "image size"),
            bool.IN("_yflip", "if true, image origin is bottom left")
        ) {
            documentation = "Screenshot captured. Screenshot format is always 4-byte BGRA."
        }
    }.member("screen_shot", "the screenshot callback")
    Module.BGFX.callback {
        void(
            "BGFXCaptureBeginCallback",
            "Will be called when video capture begins.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            uint32_t.IN("_width", "image width"),
            uint32_t.IN("_height", "image height"),
            uint32_t.IN("_pitch", "number of bytes to skip to next line"),
            bgfx_texture_format_t.IN("_format", "texture format"),
            bool.IN("_yflip", "if true image origin is bottom left")
        ) {
            documentation = "Called when video capture begins."
        }
    }.member("capture_begin", "the capture begin callback")
    Module.BGFX.callback {
        void(
            "BGFXCaptureEndCallback",
            "Will be called when video capture ends.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface")
        ) {
            documentation = "Called when video capture ends."
        }
    }.member("capture_end", "the capture end callback")
    Module.BGFX.callback {
        void(
            "BGFXCaptureFrameCallback",
            "Will be called when a frame is captured.",

            _bgfx_callback_interface_t.p.IN("_this", "the callback interface"),
            void.const.p.IN("_data", "image data"),
            AutoSize("_data")..uint32_t.IN("_size", "image size")
        ) {
            documentation = "Captured frame."
        }
    }.member("capture_frame", "the capture framecallback")
}

val bgfx_callback_interface_t = struct(Module.BGFX, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t") {
    documentation =
        """
    Callback interface to implement application specific behavior.

    Cached items are currently used for OpenGL and Direct3D 12 binary shaders.

    {@code fatal} and {@code trace_vargs} callbacks can be called from any thread. Other callbacks are called from the render thread.
    """

    bgfx_callback_vtbl_t.const.p.member("vtbl", "the callback virtual table")
}

// Allocator interface

private val _bgfx_allocator_interface_t = struct(Module.BGFX, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t")
val bgfx_allocator_vtbl_t = struct(Module.BGFX, "BGFXAllocatorVtbl", nativeName = "bgfx_allocator_vtbl_t") {
    documentation = "Allocator virtual table"

    Module.BGFX.callback {
        opaque_p(
            "BGFXReallocCallback",
            "Will be called when an allocation is requested.",

            _bgfx_allocator_interface_t.p.IN("_this", "the allocator interface"),
            nullable..opaque_p.IN("_ptr", "the previously allocated memory or #NULL"),
            size_t.IN("_size", "the number of bytes to allocate"),
            size_t.IN("_align", "the allocation alignment, in bytes"),
            charASCII.p.IN("_file", "file path where allocation was generated"),
            uint32_t.IN("_line", "line where allocation was generated")
        ) {
            documentation = "Allocates memory."
        }
    }.member("realloc", "the reallocation callback")
}

val bgfx_allocator_interface_t = struct(Module.BGFX, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t") {
    documentation =
        "Custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe."

    bgfx_allocator_vtbl_t.const.p.member("vtbl", "the allocator virtual table")
}

val bgfx_resolution_t = struct(Module.BGFX, "BGFXResolution", nativeName = "bgfx_resolution_t") {
    documentation = "Backbuffer resolution and reset parameters."

    uint32_t.member("width", "backbuffer width")
    uint32_t.member("height", "backbuffer height")
    uint32_t.member("flags", "reset parameters")
}

val bgfx_init_limits_t = struct(Module.BGFX, "BGFXInitLimits", nativeName = "bgfx_init_limits_t")  {
    uint16_t.member("maxEncoders", "maximum number of encoder threads")
}

val bgfx_init_t = struct(Module.BGFX, "BGFXInit", nativeName = "bgfx_init_t") {
    documentation = "Initialization parameters used by #init()."

    bgfx_renderer_type_t.member(
        "type",
        "select rendering backend. When set to #RENDERER_TYPE_COUNT a default rendering backend will be selected appropriate to the platform."
    ).links("RENDERER_TYPE_\\w+")
    uint16_t.member("vendorId", "vendor PCI id. If set to #PCI_ID_NONE it will select the first device.").links("PCI_ID_\\w+")
    uint16_t.member("deviceId", "device id. If set to 0 it will select first device, or device with matching id.")

    bgfx_resolution_t.member("resolution", "backbuffer resolution and reset parameters")
    bgfx_init_limits_t.member("limits", "")

    nullable..bgfx_callback_interface_t.p.member("callback", "provide application specific callback interface")
    nullable..bgfx_allocator_interface_t.p.member(
        "allocator",
        "custom allocator. When a custom allocator is not specified, bgfx uses the CRT allocator. Bgfx assumes	custom allocator is thread safe."
    )
}

// Platform API

val bgfx_renderer_frame_t = "bgfx_renderer_frame_t".enumType

val bgfx_platform_data_t = struct(Module.BGFX, "BGFXPlatformData", nativeName = "bgfx_platform_data_t") {
    documentation = "Platform data."

    nullable..opaque_p.member("ndt", "native display type")
    nullable..opaque_p.member("nwh", "native window handle")
    nullable..opaque_p.member("context", "GL context, or D3D device")
    nullable..opaque_p.member("backBuffer", "GL backbuffer, or D3D render target view")
    nullable..opaque_p.member("backBufferDS", "Backbuffer depth/stencil")
    nullable..opaque_p.member("session", "{@code ovrSession}, for Oculus SDK")
}

val bgfx_internal_data_t = struct(Module.BGFX, "BGFXInternalData", nativeName = "bgfx_internal_data_t", mutable = false) {
    documentation = "Internal data."

    bgfx_caps_t.p.member("caps", "renderer capabilities")
    opaque_p.member("context", "GL context, or D3D device")
}