/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bgfx

import org.lwjgl.generator.*

val BGFX_BINDING = simpleBinding(
    Module.BGFX,
    libraryExpression = """Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx"))""",
    bundledWithLWJGL = true
)
val BGFX_BINDING_DELEGATE = BGFX_BINDING.delegate("BGFX.getLibrary()")

val bgfx_access_t = "bgfx_access_t".enumType
val bgfx_attrib_t = "bgfx_attrib_t".enumType
val bgfx_attrib_type_t = "bgfx_attrib_type_t".enumType
val bgfx_backbuffer_ratio_t = "bgfx_backbuffer_ratio_t".enumType
val bgfx_occlusion_query_result_t = "bgfx_occlusion_query_result_t".enumType
val bgfx_render_frame_t = "bgfx_render_frame_t".enumType
val bgfx_renderer_type_t = "bgfx_renderer_type_t".enumType
val bgfx_texture_format_t = "bgfx_texture_format_t".enumType
val bgfx_topology_convert_t = "bgfx_topology_convert_t".enumType
val bgfx_topology_sort_t = "bgfx_topology_sort_t".enumType
val bgfx_uniform_type_t = "bgfx_uniform_type_t".enumType
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
val bgfx_vertex_layout_handle_t = BGFX_HANDLE_T("vertex_layout")

val bgfx_release_fn_t = Module.BGFX.callback {
    void(
        "BGFXReleaseFunctionCallback",
        "Memory release callback.",

        opaque_p("_ptr", "pointer to allocated data"),
        nullable..void.p("_userData", "user defined data if needed"),

        nativeType = "bgfx_release_fn_t"
    ) {
        documentation = "Instances of this interface may be passed to the #make_ref_release() method."
    }
}
val bgfx_memory_t = struct(Module.BGFX, "BGFXMemory", nativeName = "bgfx_memory_t") {
    documentation =
        """
        Memory must be obtained by calling #alloc(), #copy(), or #make_ref().

        It is illegal to create this structure on stack and pass it to any bgfx API.
        """

    uint8_t.p("data", "pointer to data")
    AutoSize("data")..uint32_t("size", "data size")
}

val bgfx_transform_t = struct(Module.BGFX, "BGFXTransform", nativeName = "bgfx_transform_t", mutable = false) {
    documentation = "Transform data."

    float.p("data", "pointer to first 4x4 matrix")
    AutoSizeShl("4", "data")..uint16_t("num", "number of matrices")
}

val bgfx_view_stats_t = struct(Module.BGFX, "BGFXViewStats", nativeName = "bgfx_view_stats_t", mutable = false) {
    documentation = "View stats."

    charASCII("name", "view name")[256]
    bgfx_view_id_t("view", "view id")
    int64_t("cpuTimeBegin", "CPU (submit) begin time")
    int64_t("cpuTimeEnd", "CPU (submit) end time")
    int64_t("gpuTimeBegin", "GPU begin time")
    int64_t("gpuTimeEnd", "GPU end time")
}

val bgfx_encoder_stats_t = struct(Module.BGFX, "BGFXEncoderStats", nativeName = "bgfx_encoder_stats_t", mutable = false) {
    documentation = "Encoder stats."

    int64_t("cpuTimeBegin", "encoder thread CPU submit begin time")
    int64_t("cpuTimeEnd", "encoder thread CPU submit end time")
}

val bgfx_stats_t = struct(Module.BGFX, "BGFXStats", nativeName = "bgfx_stats_t", mutable = false) {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TOPOLOGY_COUNT")
    documentation =
        """
        Renderer statistics data.

        All time values are high-resolution timestamps, while time frequencies define timestamps-per-second for that hardware.
        """

    int64_t("cpuTimeFrame", "CPU time between two #frame() calls")
    int64_t("cpuTimeBegin", "Render thread CPU submit begin time")
    int64_t("cpuTimeEnd", "Render thread CPU submit end time")
    int64_t("cpuTimerFreq", "CPU timer frequency. Timestamps-per-second.")

    int64_t("gpuTimeBegin", "GPU frame begin time")
    int64_t("gpuTimeEnd", "GPU frame end time")
    int64_t("gpuTimerFreq", "GPU timer frequency")

    int64_t("waitRender", "time spent waiting for render backend thread to finish issuing draw commands to underlying graphics API")
    int64_t("waitSubmit", "time spent waiting for submit thread to advance to next frame")

    uint32_t("numDraw", "number of draw calls submitted")
    uint32_t("numCompute", "number of compute calls submitted")
    uint32_t("numBlit", "number of blit calls submitted")
    uint32_t("maxGpuLatency", "GPU driver latency")

    uint16_t("numDynamicIndexBuffers", "number of used dynamic index buffers")
    uint16_t("numDynamicVertexBuffers", "number of used dynamic vertex buffers")
    uint16_t("numFrameBuffers", "number of used frame buffers")
    uint16_t("numIndexBuffers", "number of used index buffers")
    uint16_t("numOcclusionQueries", "number of used occlusion queries")
    uint16_t("numPrograms", "number of used programs")
    uint16_t("numShaders", "number of used shaders")
    uint16_t("numTextures", "number of used textures")
    uint16_t("numUniforms", "number of used uniforms")
    uint16_t("numVertexBuffers", "number of used vertex buffers")
    uint16_t("numVertexLayouts", "number of used vertex layouts")

    int64_t("textureMemoryUsed", "estimate of texture memory used")
    int64_t("rtMemoryUsed", "estimate of render target memory used")
    int32_t("transientVbUsed", "amount of transient vertex buffer used")
    int32_t("transientIbUsed", "amount of transient index buffer used")

    uint32_t("numPrims", "number of primitives rendered")["BGFX_TOPOLOGY_COUNT"]

    int64_t("gpuMemoryMax", "maximum available GPU memory for application")
    int64_t("gpuMemoryUsed", "amount of GPU memory used by the application")

    uint16_t("width", "backbuffer width in pixels")
    uint16_t("height", "backbuffer height in pixels")
    uint16_t("textWidth", "debug text width in characters")
    uint16_t("textHeight", "debug text height in characters")

    AutoSize("viewStats")..uint16_t("numViews", "number of view stats")
    bgfx_view_stats_t.p("viewStats", "array of view stats")

    AutoSize("encoderStats")..uint16_t("numEncoders", "number of encoders used during frame")
    bgfx_encoder_stats_t.p("encoderStats", "array of encoder stats")
}

val bgfx_vertex_layout_t = struct(Module.BGFX, "BGFXVertexLayout", nativeName = "bgfx_vertex_layout_t") {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT")
    documentation = "Vertex layout."

    uint32_t("hash", "")
    uint16_t("stride", "vertex stride")
    uint16_t("offset", "relative attribute offset from the vertex")["BGFX_ATTRIB_COUNT"]
    uint16_t("attributes", "")["BGFX_ATTRIB_COUNT"]
}

val bgfx_transient_index_buffer_t = struct(Module.BGFX, "BGFXTransientIndexBuffer", nativeName = "bgfx_transient_index_buffer_t") {
    documentation = "Transient index buffer."

    uint8_t.p("data", "pointer to data")
    AutoSize("data")..uint32_t("size", "data size")
    uint32_t("startIndex", "first index")
    bgfx_index_buffer_handle_t("handle", "index buffer handle")
    bool("isIndex16", "index buffer format is 16-bits if true, otherwise it is 32-bit")
}

val bgfx_transient_vertex_buffer_t = struct(Module.BGFX, "BGFXTransientVertexBuffer", nativeName = "bgfx_transient_vertex_buffer_t") {
    documentation = "Transient vertex buffer."

    uint8_t.p("data", "pointer to data")
    AutoSize("data")..uint32_t("size", "data size")
    uint32_t("startVertex", "first vertex")
    uint16_t("stride", "vertex stride")
    bgfx_vertex_buffer_handle_t("handle", "vertex buffer handle")
    bgfx_vertex_layout_handle_t("layoutHandle", "vertex layout handle")
}

val bgfx_instance_data_buffer_t = struct(Module.BGFX, "BGFXInstanceDataBuffer", nativeName = "bgfx_instance_data_buffer_t") {
    documentation = "Instance data buffer info."

    uint8_t.p("data", "pointer to data")
    AutoSize("data")..uint32_t("size", "data size")
    uint32_t("offset", "offset in vertex buffer")
    uint32_t("num", "number of instances")
    uint16_t("stride", "vertex stride")
    bgfx_vertex_buffer_handle_t("handle", "vertex buffer object handle")
}

val bgfx_texture_info_t_p = struct(Module.BGFX, "BGFXTextureInfo", nativeName = "bgfx_texture_info_t", mutable = false) {
    documentation = "Texture info."

    bgfx_texture_format_t("format", "texture format").links("TEXTURE_FORMAT_(?!COUNT)\\w+")
    uint32_t("storageSize", "total amount of bytes required to store texture")
    uint16_t("width", "texture width")
    uint16_t("height", "texture height")
    uint16_t("depth", "texture depth")
    uint16_t("numLayers", "number of layers in texture array")
    uint8_t("numMips", "number of MIP maps")
    uint8_t("bitsPerPixel", "format bits per pixel")
    bool("cubeMap", "texture is cubemap")
}.p

val bgfx_uniform_info_t_p = struct(Module.BGFX, "BGFXUniformInfo", nativeName = "bgfx_uniform_info_t") {
    documentation = "Uniform info."

    charASCII("name", "uniform name")[256]
    bgfx_uniform_type_t("type", "uniform type")
    uint16_t("num", "number of elements in array")
}.p

val bgfx_attachment_t = struct(Module.BGFX, "BGFXAttachment", nativeName = "bgfx_attachment_t") {
    documentation = "Frame buffer texture attachment info."

    bgfx_access_t("access", "attachment access")
    bgfx_texture_handle_t("handle", "render target texture handle")
    uint16_t("mip", "mip level")
    uint16_t("layer", "cubemap side or depth layer/slice to use")
    uint16_t("numLayers", "number of texture layer/slice(s) in array to use")
    uint8_t("resolve", "resolve flags").links("RESOLVE_\\w+")
}

val bgfx_caps_gpu_t = struct(Module.BGFX, "BGFXCapsGPU", nativeName = "bgfx_caps_gpu_t", mutable = false) {
    documentation = "GPU info."

    uint16_t("vendorId", "vendor PCI id").links("PCI_ID_\\w+")
    uint16_t("deviceId", "device id")
}

val bgfx_caps_limits_t = struct(Module.BGFX, "BGFXCapsLimits", nativeName = "bgfx_caps_limits_t", mutable = false) {
    documentation = "Renderer runtime limits."

    uint32_t("maxDrawCalls", "maximum number of draw calls")
    uint32_t("maxBlits", "maximum number of blit calls")
    uint32_t("maxTextureSize", "maximum texture size")
    uint32_t("maxTextureLayers", "maximum texture layers")
    uint32_t("maxViews", "maximum number of views")
    uint32_t("maxFrameBuffers", "maximum number of frame buffer handles")
    uint32_t("maxFBAttachments", "maximum number of frame buffer attachments")
    uint32_t("maxPrograms", "maximum number of program handles")
    uint32_t("maxShaders", "maximum number of shader handles")
    uint32_t("maxTextures", "maximum number of texture handles")
    uint32_t("maxTextureSamplers", "maximum number of texture samplers")
    uint32_t("maxComputeBindings", "maximum number of compute bindings")
    uint32_t("maxVertexLayouts", "maximum number of vertex format layouts")
    uint32_t("maxVertexStreams", "maximum number of vertex streams")
    uint32_t("maxIndexBuffers", "maximum number of index buffer handles")
    uint32_t("maxVertexBuffers", "maximum number of vertex buffer handles")
    uint32_t("maxDynamicIndexBuffers", "maximum number of dynamic index buffer handles")
    uint32_t("maxDynamicVertexBuffers", "maximum number of vertex buffer handles")
    uint32_t("maxUniforms", "maximum number of uniform handles")
    uint32_t("maxOcclusionQueries", "maximum number of occlusion query handles")
    uint32_t("maxEncoders", "maximum number of encoder threads")
    uint32_t("minResourceCbSize", "minimum resource command buffer size")
    uint32_t("transientVbSize", "maximum transient vertex buffer size")
    uint32_t("transientIbSize", "maximum transient index buffer size")
}

val bgfx_caps_t = struct(Module.BGFX, "BGFXCaps", nativeName = "bgfx_caps_t", mutable = false, skipBuffer = true) {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT")
    documentation = "Renderer capabilities."

    bgfx_renderer_type_t("rendererType", "renderer backend type").links("RENDERER_TYPE_(?!COUNT)\\w+")

    uint64_t("supported", "supported functionality").links("CAPS_(?!FORMAT_)\\w+", LinkMode.BITFIELD)

    uint16_t("vendorId", "selected GPU vendor PCI id").links("PCI_ID_\\w+")
    uint16_t("deviceId", "selected GPU device id")
    bool("homogeneousDepth", "true when NDC depth is in [-1, 1] range, otherwise its [0, 1]")
    bool("originBottomLeft", "true when NDC origin is at bottom left")
    AutoSize("gpu")..uint8_t("numGPUs", "number of enumerated GPUs")

    bgfx_caps_gpu_t("gpu", "enumerated GPUs")[4]
    bgfx_caps_limits_t("limits", "renderer runtime limits")

    uint16_t("formats", "supported texture formats")["BGFX_TEXTURE_FORMAT_COUNT"]
}

// Callback interface

val bgfx_fatal_t = "bgfx_fatal_t".enumType

private val _bgfx_callback_interface_t = struct(Module.BGFX, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t")
val bgfx_callback_vtbl_t = struct(Module.BGFX, "BGFXCallbackVtbl", nativeName = "bgfx_callback_vtbl_t", skipBuffer = true) {
    documentation =
        """
        Callback virtual table.
        
        <b>LWJGL note</b>: The bgfx build bundled with LWJGL will never invoke the {@code fatal}, {@code trace_vargs}, {@code profiler_begin},
        {@code profiler_begin_literal}, {@code profiler_end} callbacks, so they may be #NULL. When using a custom build with {@code BGFX_CONFIG_DEBUG}
        ({@code Debug} configuration) and/or {@code BGFX_CONFIG_PROFILER} ({@code --with-profiler} build option), the corresponding callbacks should not be
        #NULL.
        """

    nullable..Module.BGFX.callback {
        void(
            "BGFXFatalCallback",
            "This callback is called on unrecoverable errors.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            charASCII.const.p("_filePath", "file path where fatal message was generated"),
			uint16_t("_line", "line where fatal message was generated"),
            bgfx_fatal_t("_code", "the error code"),
            charASCII.const.p("_str", "the error message")
        ) {
            documentation =
                """
                If fatal code is not #FATAL_DEBUG_CHECK this callback is called on unrecoverable error. It's not safe to continue, inform user and terminate
                application from this call.

                Not thread safe and it can be called from any thread.
                """
        }
    }("fatal", "the fatal error callback")
    nullable..Module.BGFX.callback {
        void(
            "BGFXTraceVarArgsCallback",
            "Will be called when a debug message is produced.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            charASCII.const.p("_filePath", "file path where debug message was generated"),
            uint16_t("_line", "line where debug message was generated"),
            NullTerminated..charUTF8.const.p("_format", "{@code printf} style format"),
            va_list("_argList", "variable arguments list initialized with {@code va_start}")
        ) {
            documentation =
                """
                Prints a debug message.
    
                Not thread safe and it can be called from any thread.
                """
        }
    }("trace_vargs", "the debug message callback")
    nullable..Module.BGFX.callback {
        void(
            "BGFXProfilerBegin",
            """
            Will be called when a profiler region begins.

            Not thread safe and it can be called from any thread.
            """,

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            charASCII.const.p("_name", "region name, contains dynamic string"),
            uint32_t("_abgr", "color of profiler region"),
            charASCII.const.p("_filePath", "file path where {@code profiler_begin} was called"),
            uint16_t("_line", "line where {@code profiler_begin} was called")
        ) {
            documentation = "Profiler region begin."
        }
    }("profiler_begin", "the profiler begin callback")
    nullable..Module.BGFX.callback {
        void(
            "BGFXProfilerBeginLiteral",
            """
            Will be called when a profiler region with string literal begins.

            Not thread safe and it can be called from any thread.
            """,

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            charASCII.const.p("_name", "region name, contains string literal"),
            uint32_t("_abgr", "color of profiler region"),
            charASCII.const.p("_filePath", "file path where {@code profiler_begin_literal} was called"),
            uint16_t("_line", "line where {@code profiler_begin_literal} was called")
        ) {
            documentation = "Profiler region begin with string literal name."
        }
    }("profiler_begin_literal", "the profiler begin literal callback")
    nullable..Module.BGFX.callback {
        void(
            "BGFXProfilerEnd",
            """
            Will be called when a profiler region ends.

            Not thread safe and it can be called from any thread.
            """,

            _bgfx_callback_interface_t.p("_this", "the callback interface")
        ) {
            documentation = "Profiler region end."
        }
    }("profiler_end", "the profiler end callback")
    Module.BGFX.callback {
        uint32_t(
            "BGFXCacheReadSizeCallback",
            "Will be called to determine size of cached item.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            uint64_t("_id", "cache id"),

            returnDoc = "number of bytes to read"
        ) {
            documentation = "Returns the size of a cached item. Returns 0 if no cached item was found."
        }
    }("cache_read_size", "the cache read size callback")
    Module.BGFX.callback {
        bool(
            "BGFXCacheReadCallback",
            "Will be called to read a cached item.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            uint64_t("_id", "cache id"),
            void.p("_data", "buffer where to read data"),
            AutoSize("_data")..uint32_t("_size", "size of data to read"),

            returnDoc = "true if data is read"
        ) {
            documentation = "Reads cached item."
        }
    }("cache_read", "the cache read callback")
    Module.BGFX.callback {
        void(
            "BGFXCacheWriteCallback",
            "Will be called to writes a cached item.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            uint64_t("_id", "cache id"),
            void.const.p("_data", "data to write"),
            AutoSize("_data")..uint32_t("_size", "size of data to write")
        ) {
            documentation = "Writes cached item."
        }
    }("cache_write", "the cache write callback")
    Module.BGFX.callback {
        void(
            "BGFXScreenShotCallback",
            "",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            charASCII.const.p("_filePath", "file path"),
            uint32_t("_width", "image width"),
            uint32_t("_height", "image height"),
            uint32_t("_pitch", "number of bytes to skip between the start of each horizontal line of the image"),
            void.const.p("_data", "image data"),
            uint32_t("_size", "image size"),
            bool("_yflip", "if true, image origin is bottom left")
        ) {
            documentation = "Screenshot captured. Screenshot format is always 4-byte BGRA."
        }
    }("screen_shot", "the screenshot callback")
    Module.BGFX.callback {
        void(
            "BGFXCaptureBeginCallback",
            "Will be called when video capture begins.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            uint32_t("_width", "image width"),
            uint32_t("_height", "image height"),
            uint32_t("_pitch", "number of bytes to skip between the start of each horizontal line of the image"),
            bgfx_texture_format_t("_format", "texture format"),
            bool("_yflip", "if true, image origin is bottom left")
        ) {
            documentation = "Called when video capture begins."
        }
    }("capture_begin", "the capture begin callback")
    Module.BGFX.callback {
        void(
            "BGFXCaptureEndCallback",
            "Will be called when video capture ends.",

            _bgfx_callback_interface_t.p("_this", "the callback interface")
        ) {
            documentation = "Called when video capture ends."
        }
    }("capture_end", "the capture end callback")
    Module.BGFX.callback {
        void(
            "BGFXCaptureFrameCallback",
            "Will be called when a frame is captured.",

            _bgfx_callback_interface_t.p("_this", "the callback interface"),
            void.const.p("_data", "image data"),
            AutoSize("_data")..uint32_t("_size", "image size")
        ) {
            documentation = "Captured frame."
        }
    }("capture_frame", "the capture framecallback")
}

val bgfx_callback_interface_t = struct(Module.BGFX, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t", skipBuffer = true) {
    documentation =
        """
    Callback interface to implement application specific behavior.

    Cached items are currently used for OpenGL and Direct3D 12 binary shaders.

    {@code fatal} and {@code trace_vargs} callbacks can be called from any thread. Other callbacks are called from the render thread.
    """

    bgfx_callback_vtbl_t.const.p("vtbl", "the callback virtual table")
}

// Allocator interface

private val _bgfx_allocator_interface_t = struct(Module.BGFX, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t")
val bgfx_allocator_vtbl_t = struct(Module.BGFX, "BGFXAllocatorVtbl", nativeName = "bgfx_allocator_vtbl_t") {
    documentation = "Allocator virtual table"

    Module.BGFX.callback {
        opaque_p(
            "BGFXReallocCallback",
            "Will be called when an allocation is requested.",

            _bgfx_allocator_interface_t.p("_this", "the allocator interface"),
            nullable..opaque_p("_ptr", "the previously allocated memory or #NULL"),
            size_t("_size", "the number of bytes to allocate"),
            size_t("_align", "the allocation alignment, in bytes"),
            charASCII.p("_file", "file path where allocation was generated"),
            uint32_t("_line", "line where allocation was generated")
        ) {
            documentation = "Allocates memory."
        }
    }("realloc", "the reallocation callback")
}

val bgfx_allocator_interface_t = struct(Module.BGFX, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t", skipBuffer = true) {
    documentation =
        "Custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe."

    bgfx_allocator_vtbl_t.const.p("vtbl", "the allocator virtual table")
}

val bgfx_resolution_t = struct(Module.BGFX, "BGFXResolution", nativeName = "bgfx_resolution_t", skipBuffer = true) {
    documentation = "Backbuffer resolution and reset parameters."

    bgfx_texture_format_t("format", "backbuffer format")
    uint32_t("width", "backbuffer width")
    uint32_t("height", "backbuffer height")
    uint32_t("reset", "reset parameters")
    uint8_t("numBackBuffers", "number of back buffers")
    uint8_t("maxFrameLatency", "maximum frame latency")
}

val bgfx_init_limits_t = struct(Module.BGFX, "BGFXInitLimits", nativeName = "bgfx_init_limits_t", skipBuffer = true)  {
    documentation = "Configurable runtime limits parameters."

    uint16_t("maxEncoders", "maximum number of encoder threads")
    uint32_t("minResourceCbSize", "minimum resource command buffer size")
    uint32_t("transientVbSize", "maximum transient vertex buffer size")
    uint32_t("transientIbSize", "maximum transient index buffer size")
}

val bgfx_platform_data_t = struct(Module.BGFX, "BGFXPlatformData", nativeName = "bgfx_platform_data_t", skipBuffer = true) {
    documentation = "Platform data."

    nullable..opaque_p("ndt", "native display type (*nix specific)")
    nullable..opaque_p("nwh", "native window handle. If #NULL bgfx will create headless context/device if renderer API supports it.")
    nullable..opaque_p("context", "GL context, or D3D device. If #NULL, bgfx will create context/device.")
    nullable..opaque_p("backBuffer", "GL back-buffer, or D3D render target view. If #NULL bgfx will create back-buffer color surface.")
    nullable..opaque_p("backBufferDS", "backbuffer depth/stencil. If #NULL bgfx will create back-buffer depth/stencil surface.")
}

val bgfx_init_t = struct(Module.BGFX, "BGFXInit", nativeName = "bgfx_init_t", skipBuffer = true) {
    documentation = "Initialization parameters used by #init()."

    bgfx_renderer_type_t(
        "type",
        "select rendering backend. When set to #RENDERER_TYPE_COUNT a default rendering backend will be selected appropriate to the platform."
    ).links("RENDERER_TYPE_\\w+")
    uint16_t("vendorId", "vendor PCI id. If set to #PCI_ID_NONE it will select the first device.").links("PCI_ID_\\w+")
    uint16_t("deviceId", "device id. If set to 0 it will select first device, or device with matching id.")
    uint64_t("capabilities", "capabilities initialization mask (default: {@code UINT64_MAX})")
    bool("debug", "enable device for debugging")
    bool("profile", "enable device for profiling")

    bgfx_platform_data_t("platformData", "platform data")
    bgfx_resolution_t("resolution", "backbuffer resolution and reset parameters")
    bgfx_init_limits_t("limits", "configurable runtime limits parameters")

    nullable..bgfx_callback_interface_t.p("callback", "provide application specific callback interface")
    nullable..bgfx_allocator_interface_t.p(
        "allocator",
        "custom allocator. When a custom allocator is not specified, bgfx uses the CRT allocator. Bgfx assumes	custom allocator is thread safe."
    )
}

// Platform API

val bgfx_renderer_frame_t = "bgfx_renderer_frame_t".enumType

val bgfx_internal_data_t = struct(Module.BGFX, "BGFXInternalData", nativeName = "bgfx_internal_data_t", mutable = false, skipBuffer = true) {
    documentation = "Internal data."

    bgfx_caps_t.p("caps", "renderer capabilities")
    opaque_p("context", "GL context, or D3D device")
}