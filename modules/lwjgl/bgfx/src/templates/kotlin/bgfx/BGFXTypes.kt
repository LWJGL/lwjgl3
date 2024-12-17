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
val bgfx_native_window_handle_type_t = "bgfx_native_window_handle_type_t".enumType
val bgfx_occlusion_query_result_t = "bgfx_occlusion_query_result_t".enumType
val bgfx_renderer_type_t = "bgfx_renderer_type_t".enumType
val bgfx_texture_format_t = "bgfx_texture_format_t".enumType
val bgfx_topology_convert_t = "bgfx_topology_convert_t".enumType
val bgfx_topology_sort_t = "bgfx_topology_sort_t".enumType
val bgfx_uniform_type_t = "bgfx_uniform_type_t".enumType
val bgfx_view_mode_t = "bgfx_view_mode_t".enumType

val bgfx_view_id_t = typedef(uint16_t, "bgfx_view_id_t")

val bgfx_encoder_t = "bgfx_encoder_t".opaque

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

        opaque_p("_ptr"),
        nullable..void.p("_userData"),

        nativeType = "bgfx_release_fn_t"
    )
}
val bgfx_memory_t = struct(Module.BGFX, "BGFXMemory", nativeName = "bgfx_memory_t") {
    uint8_t.p("data")
    AutoSize("data")..uint32_t("size")
}

val bgfx_transform_t = struct(Module.BGFX, "BGFXTransform", nativeName = "bgfx_transform_t", mutable = false) {
    float.p("data")
    AutoSizeShl("4", "data")..uint16_t("num")
}

val bgfx_view_stats_t = struct(Module.BGFX, "BGFXViewStats", nativeName = "bgfx_view_stats_t", mutable = false) {
    charASCII("name")[256]
    bgfx_view_id_t("view")
    int64_t("cpuTimeBegin")
    int64_t("cpuTimeEnd")
    int64_t("gpuTimeBegin")
    int64_t("gpuTimeEnd")
    uint32_t("gpuFrameNum")
}

val bgfx_encoder_stats_t = struct(Module.BGFX, "BGFXEncoderStats", nativeName = "bgfx_encoder_stats_t", mutable = false) {
    int64_t("cpuTimeBegin")
    int64_t("cpuTimeEnd")
}

val bgfx_stats_t = struct(Module.BGFX, "BGFXStats", nativeName = "bgfx_stats_t", mutable = false) {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TOPOLOGY_COUNT")

    int64_t("cpuTimeFrame")
    int64_t("cpuTimeBegin")
    int64_t("cpuTimeEnd")
    int64_t("cpuTimerFreq")

    int64_t("gpuTimeBegin")
    int64_t("gpuTimeEnd")
    int64_t("gpuTimerFreq")

    int64_t("waitRender")
    int64_t("waitSubmit")

    uint32_t("numDraw")
    uint32_t("numCompute")
    uint32_t("numBlit")
    uint32_t("maxGpuLatency")
    uint32_t("gpuFrameNum")

    uint16_t("numDynamicIndexBuffers")
    uint16_t("numDynamicVertexBuffers")
    uint16_t("numFrameBuffers")
    uint16_t("numIndexBuffers")
    uint16_t("numOcclusionQueries")
    uint16_t("numPrograms")
    uint16_t("numShaders")
    uint16_t("numTextures")
    uint16_t("numUniforms")
    uint16_t("numVertexBuffers")
    uint16_t("numVertexLayouts")

    int64_t("textureMemoryUsed")
    int64_t("rtMemoryUsed")
    int32_t("transientVbUsed")
    int32_t("transientIbUsed")

    uint32_t("numPrims")["BGFX_TOPOLOGY_COUNT"]

    int64_t("gpuMemoryMax")
    int64_t("gpuMemoryUsed")

    uint16_t("width")
    uint16_t("height")
    uint16_t("textWidth")
    uint16_t("textHeight")

    AutoSize("viewStats")..uint16_t("numViews")
    bgfx_view_stats_t.p("viewStats")

    AutoSize("encoderStats")..uint16_t("numEncoders")
    bgfx_encoder_stats_t.p("encoderStats")
}

val bgfx_vertex_layout_t = struct(Module.BGFX, "BGFXVertexLayout", nativeName = "bgfx_vertex_layout_t") {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT")

    uint32_t("hash")
    uint16_t("stride")
    uint16_t("offset")["BGFX_ATTRIB_COUNT"]
    uint16_t("attributes")["BGFX_ATTRIB_COUNT"]
}

val bgfx_transient_index_buffer_t = struct(Module.BGFX, "BGFXTransientIndexBuffer", nativeName = "bgfx_transient_index_buffer_t") {
    uint8_t.p("data")
    AutoSize("data")..uint32_t("size")
    uint32_t("startIndex")
    bgfx_index_buffer_handle_t("handle")
    bool("isIndex16")
}

val bgfx_transient_vertex_buffer_t = struct(Module.BGFX, "BGFXTransientVertexBuffer", nativeName = "bgfx_transient_vertex_buffer_t") {
    uint8_t.p("data")
    AutoSize("data")..uint32_t("size")
    uint32_t("startVertex")
    uint16_t("stride")
    bgfx_vertex_buffer_handle_t("handle")
    bgfx_vertex_layout_handle_t("layoutHandle")
}

val bgfx_instance_data_buffer_t = struct(Module.BGFX, "BGFXInstanceDataBuffer", nativeName = "bgfx_instance_data_buffer_t") {
    uint8_t.p("data")
    AutoSize("data")..uint32_t("size")
    uint32_t("offset")
    uint32_t("num")
    uint16_t("stride")
    bgfx_vertex_buffer_handle_t("handle")
}

val bgfx_texture_info_t_p = struct(Module.BGFX, "BGFXTextureInfo", nativeName = "bgfx_texture_info_t", mutable = false) {
    bgfx_texture_format_t("format")
    uint32_t("storageSize")
    uint16_t("width")
    uint16_t("height")
    uint16_t("depth")
    uint16_t("numLayers")
    uint8_t("numMips")
    uint8_t("bitsPerPixel")
    bool("cubeMap")
}.p

val bgfx_uniform_info_t_p = struct(Module.BGFX, "BGFXUniformInfo", nativeName = "bgfx_uniform_info_t") {
    charASCII("name")[256]
    bgfx_uniform_type_t("type")
    uint16_t("num")
}.p

val bgfx_attachment_t = struct(Module.BGFX, "BGFXAttachment", nativeName = "bgfx_attachment_t") {
    bgfx_access_t("access")
    bgfx_texture_handle_t("handle")
    uint16_t("mip")
    uint16_t("layer")
    uint16_t("numLayers")
    uint8_t("resolve")
}

val bgfx_caps_gpu_t = struct(Module.BGFX, "BGFXCapsGPU", nativeName = "bgfx_caps_gpu_t", mutable = false) {
    uint16_t("vendorId")
    uint16_t("deviceId")
}

val bgfx_caps_limits_t = struct(Module.BGFX, "BGFXCapsLimits", nativeName = "bgfx_caps_limits_t", mutable = false) {
    uint32_t("maxDrawCalls")
    uint32_t("maxBlits")
    uint32_t("maxTextureSize")
    uint32_t("maxTextureLayers")
    uint32_t("maxViews")
    uint32_t("maxFrameBuffers")
    uint32_t("maxFBAttachments")
    uint32_t("maxPrograms")
    uint32_t("maxShaders")
    uint32_t("maxTextures")
    uint32_t("maxTextureSamplers")
    uint32_t("maxComputeBindings")
    uint32_t("maxVertexLayouts")
    uint32_t("maxVertexStreams")
    uint32_t("maxIndexBuffers")
    uint32_t("maxVertexBuffers")
    uint32_t("maxDynamicIndexBuffers")
    uint32_t("maxDynamicVertexBuffers")
    uint32_t("maxUniforms")
    uint32_t("maxOcclusionQueries")
    uint32_t("maxEncoders")
    uint32_t("minResourceCbSize")
    uint32_t("transientVbSize")
    uint32_t("transientIbSize")
}

val bgfx_caps_t = struct(Module.BGFX, "BGFXCaps", nativeName = "bgfx_caps_t", mutable = false, skipBuffer = true) {
    javaImport("static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT")

    bgfx_renderer_type_t("rendererType")

    uint64_t("supported")

    uint16_t("vendorId")
    uint16_t("deviceId")
    bool("homogeneousDepth")
    bool("originBottomLeft")
    AutoSize("gpu")..uint8_t("numGPUs")

    bgfx_caps_gpu_t("gpu")[4]
    bgfx_caps_limits_t("limits")

    uint16_t("formats")["BGFX_TEXTURE_FORMAT_COUNT"]
}

// Callback interface

val bgfx_fatal_t = "bgfx_fatal_t".enumType

private val _bgfx_callback_interface_t = struct(Module.BGFX, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t")
val bgfx_callback_vtbl_t = struct(Module.BGFX, "BGFXCallbackVtbl", nativeName = "bgfx_callback_vtbl_t", skipBuffer = true) {
    nullable..Module.BGFX.callback {
        void(
            "BGFXFatalCallback",

            _bgfx_callback_interface_t.p("_this"),
            charASCII.const.p("_filePath"),
            uint16_t("_line"),
            bgfx_fatal_t("_code"),
            charASCII.const.p("_str")
        ) {}
    }("fatal")
    nullable..Module.BGFX.callback {
        void(
            "BGFXTraceVarArgsCallback",

            _bgfx_callback_interface_t.p("_this"),
            charASCII.const.p("_filePath"),
            uint16_t("_line"),
            NullTerminated..charUTF8.const.p("_format"),
            va_list("_argList")
        ) {}
    }("trace_vargs")
    nullable..Module.BGFX.callback {
        void(
            "BGFXProfilerBegin",

            _bgfx_callback_interface_t.p("_this"),
            charASCII.const.p("_name"),
            uint32_t("_abgr"),
            charASCII.const.p("_filePath"),
            uint16_t("_line")
        ) {}
    }("profiler_begin")
    nullable..Module.BGFX.callback {
        void(
            "BGFXProfilerBeginLiteral",

            _bgfx_callback_interface_t.p("_this"),
            charASCII.const.p("_name"),
            uint32_t("_abgr"),
            charASCII.const.p("_filePath"),
            uint16_t("_line")
        ) {}
    }("profiler_begin_literal")
    nullable..Module.BGFX.callback {
        void(
            "BGFXProfilerEnd",

            _bgfx_callback_interface_t.p("_this")
        ) {}
    }("profiler_end")
    Module.BGFX.callback {
        uint32_t(
            "BGFXCacheReadSizeCallback",

            _bgfx_callback_interface_t.p("_this"),
            uint64_t("_id")
        ) {}
    }("cache_read_size")
    Module.BGFX.callback {
        bool(
            "BGFXCacheReadCallback",

            _bgfx_callback_interface_t.p("_this"),
            uint64_t("_id"),
            void.p("_data"),
            AutoSize("_data")..uint32_t("_size")
        ) {}
    }("cache_read")
    Module.BGFX.callback {
        void(
            "BGFXCacheWriteCallback",

            _bgfx_callback_interface_t.p("_this"),
            uint64_t("_id"),
            void.const.p("_data"),
            AutoSize("_data")..uint32_t("_size")
        ) {}
    }("cache_write")
    Module.BGFX.callback {
        void(
            "BGFXScreenShotCallback",

            _bgfx_callback_interface_t.p("_this"),
            charASCII.const.p("_filePath"),
            uint32_t("_width"),
            uint32_t("_height"),
            uint32_t("_pitch"),
            void.const.p("_data"),
            uint32_t("_size"),
            bool("_yflip")
        ) {}
    }("screen_shot")
    Module.BGFX.callback {
        void(
            "BGFXCaptureBeginCallback",

            _bgfx_callback_interface_t.p("_this"),
            uint32_t("_width"),
            uint32_t("_height"),
            uint32_t("_pitch"),
            bgfx_texture_format_t("_format"),
            bool("_yflip")
        ) {}
    }("capture_begin")
    Module.BGFX.callback {
        void(
            "BGFXCaptureEndCallback",

            _bgfx_callback_interface_t.p("_this")
        ) {}
    }("capture_end")
    Module.BGFX.callback {
        void(
            "BGFXCaptureFrameCallback",

            _bgfx_callback_interface_t.p("_this"),
            void.const.p("_data"),
            AutoSize("_data")..uint32_t("_size")
        ) {}
    }("capture_frame")
}

val bgfx_callback_interface_t = struct(Module.BGFX, "BGFXCallbackInterface", nativeName = "bgfx_callback_interface_t", skipBuffer = true) {
    bgfx_callback_vtbl_t.const.p("vtbl")
}

// Allocator interface

private val _bgfx_allocator_interface_t = struct(Module.BGFX, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t")
val bgfx_allocator_vtbl_t = struct(Module.BGFX, "BGFXAllocatorVtbl", nativeName = "bgfx_allocator_vtbl_t") {
    Module.BGFX.callback {
        opaque_p(
            "BGFXReallocCallback",

            _bgfx_allocator_interface_t.p("_this"),
            nullable..opaque_p("_ptr"),
            size_t("_size"),
            size_t("_align"),
            charASCII.p("_file"),
            uint32_t("_line")
        ) {}
    }("realloc")
}

val bgfx_allocator_interface_t = struct(Module.BGFX, "BGFXAllocatorInterface", nativeName = "bgfx_allocator_interface_t", skipBuffer = true) {
    bgfx_allocator_vtbl_t.const.p("vtbl")
}

val bgfx_resolution_t = struct(Module.BGFX, "BGFXResolution", nativeName = "bgfx_resolution_t", skipBuffer = true) {
    bgfx_texture_format_t("format")
    uint32_t("width")
    uint32_t("height")
    uint32_t("reset")
    uint8_t("numBackBuffers")
    uint8_t("maxFrameLatency")
    uint8_t("debugTextScale")
}

val bgfx_init_limits_t = struct(Module.BGFX, "BGFXInitLimits", nativeName = "bgfx_init_limits_t", skipBuffer = true)  {
    uint16_t("maxEncoders")
    uint32_t("minResourceCbSize")
    uint32_t("transientVbSize")
    uint32_t("transientIbSize")
}

val bgfx_platform_data_t = struct(Module.BGFX, "BGFXPlatformData", nativeName = "bgfx_platform_data_t", skipBuffer = true) {
    nullable..opaque_p("ndt")
    nullable..opaque_p("nwh")
    nullable..opaque_p("context")
    nullable..opaque_p("backBuffer")
    nullable..opaque_p("backBufferDS")
    bgfx_native_window_handle_type_t("type")
}

val bgfx_init_t = struct(Module.BGFX, "BGFXInit", nativeName = "bgfx_init_t", skipBuffer = true) {
    bgfx_renderer_type_t("type")
    uint16_t("vendorId")
    uint16_t("deviceId")
    uint64_t("capabilities")
    bool("debug")
    bool("profile")

    bgfx_platform_data_t("platformData")
    bgfx_resolution_t("resolution")
    bgfx_init_limits_t("limits")

    nullable..bgfx_callback_interface_t.p("callback")
    nullable..bgfx_allocator_interface_t.p("allocator")
}

// Platform API

val bgfx_render_frame_t = "bgfx_render_frame_t".enumType

val bgfx_internal_data_t = struct(Module.BGFX, "BGFXInternalData", nativeName = "bgfx_internal_data_t", mutable = false, skipBuffer = true) {
    bgfx_caps_t.p("caps")
    opaque_p("context")
}