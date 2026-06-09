/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr

import org.lwjgl.generator.*

val ExrContext = "ExrContext".handle
val ExrDecoder = "ExrDecoder".handle
val ExrEncoder = "ExrEncoder".handle
val ExrImage = "ExrImage".handle
val ExrPart = "ExrPart".handle
val ExrCommandBuffer = "ExrCommandBuffer".handle
val ExrFence = "ExrFence".handle
val ExrMemoryPool = "ExrMemoryPool".handle
val ExrSuspendState = "ExrSuspendState".handle

val ExrWriteImage = "ExrWriteImage".handle

val ExrAttributeType = "ExrAttributeType".enumType
val ExrCommandBufferFlags = "ExrCommandBufferFlags".enumType
val ExrCompression = "ExrCompression".enumType
val ExrContextFlags = "ExrContextFlags".enumType
val ExrDataSourceFlags = "ExrDataSourceFlags".enumType
val ExrDecoderFlags = "ExrDecoderFlags".enumType
val ExrEncoderFlags = "ExrEncoderFlags".enumType
val ExrFenceFlags = "ExrFenceFlags".enumType
val ExrImageFlags = "ExrImageFlags".enumType
val ExrLineOrder = "ExrLineOrder".enumType
val ExrMemoryPoolFlags = "ExrMemoryPoolFlags".enumType
val ExrOutputLayout = "ExrOutputLayout".enumType
val ExrPartType = "ExrPartType".enumType
val ExrPixelType = "ExrPixelType".enumType
val ExrResult = "ExrResult".enumType
val ExrSIMDCapability = "ExrSIMDCapability".enumType
val ExrTileLevelMode = "ExrTileLevelMode".enumType
val ExrTileRoundingMode = "ExrTileRoundingMode".enumType
val ExrWriteImageFlags = "ExrWriteImageFlags".enumType

val ExrBox2i = struct(Module.TINYEXR, "ExrBox2i") {
    int32_t("min_x")
    int32_t("min_y")
    int32_t("max_x")
    int32_t("max_y")
}

val ExrVec2i = struct(Module.TINYEXR, "ExrVec2i") {
    int32_t("x")
    int32_t("y")
}

val ExrVec2f = struct(Module.TINYEXR, "ExrVec2f") {
    float("x")
    float("y")
}

val ExrAllocator = struct(Module.TINYEXR, "ExrAllocator") {
    nullable..opaque_p("userdata")
    Module.TINYEXR.callback {
        void.p(
            "ExrAlloc",

            nullable..opaque_p("userdata"),
            AutoSizeResult..size_t("size"),
            size_t("alignment")
        ) {}
    }("alloc")
    Module.TINYEXR.callback {
        void.p(
            "ExrRealloc",

            nullable..opaque_p("userdata"),
            void.p("ptr"),
            AutoSize("ptr")..size_t("old_size"),
            AutoSizeResult..size_t("new_size"),
            size_t("alignment")
        ) {}
    }("realloc")
    Module.TINYEXR.callback {
        void(
            "ExrFree",

            nullable..opaque_p("userdata"),
            void.p("ptr"),
            AutoSize("ptr")..size_t("size")
        ) {}
    }("free")
}

val ExrFetchComplete = Module.TINYEXR.callback {
    void(
        "ExrFetchComplete",

        nullable..opaque_p("userdata"),
        ExrResult("result"),
        size_t("bytes_read"),

        nativeType = "ExrFetchComplete"
    )
}

val ExrFetchCallback = Module.TINYEXR.callback {
    ExrResult(
        "ExrFetchCallback",

        nullable..opaque_p("userdata"),
        uint64_t("offset"),
        AutoSize("dst")..uint64_t("size"),
        void.p("dst"),
        nullable..ExrFetchComplete("on_complete"),
        nullable..opaque_p("complete_userdata"),

        nativeType = "ExrFetchCallback"
    )
}

val ExrFetchCancel = Module.TINYEXR.callback {
    void(
        "ExrFetchCancel",

        nullable..opaque_p("userdata"),
        uint64_t("offset"),
        uint64_t("size"),

        nativeType = "ExrFetchCancel"
    )
}

val ExrDataSource = struct(Module.TINYEXR, "ExrDataSource") {
    nullable..opaque_p("userdata")
    ExrFetchCallback("fetch")
    nullable..ExrFetchCancel("cancel")
    uint64_t("total_size")
    uint32_t("flags")
}

val ExrWriteCallback = Module.TINYEXR.callback {
    ExrResult(
        "ExrWriteCallback",

        nullable..opaque_p("userdata"),
        uint64_t("offset"),
        void.const.p("data"),
        AutoSize("data")..uint64_t("size"),
        ExrFetchComplete("on_complete"),
        nullable..opaque_p("complete_userdata"),

        nativeType = "ExrWriteCallback"
    )
}

val ExrDataSink = struct(Module.TINYEXR, "ExrDataSink") {
    nullable..opaque_p("userdata")
    ExrWriteCallback("write")
    nullable..ExrFetchCancel("cancel")
    uint32_t("flags")
}

val ExrErrorInfo = struct(Module.TINYEXR, "ExrErrorInfo") {
    ExrResult("code")
    charASCII.const.p("message")
    nullable..charASCII.const.p("context")
    uint64_t("byte_position")
    int32_t("line_number")
    charUTF8.const.p("source_file")
}

val ExrErrorCallback = Module.TINYEXR.callback {
    void(
        "ExrErrorCallback",

        nullable..opaque_p("userdata"),
        ExrErrorInfo.const.p("error"),

        nativeType = "ExrErrorCallback"
    )
}

val ExrContextCreateInfo = struct(Module.TINYEXR, "ExrContextCreateInfo") {
    uint32_t("api_version")
    nullable..ExrAllocator.const.p("allocator")
    nullable..ExrErrorCallback("error_callback")
    nullable..opaque_p("error_userdata")
    uint32_t("flags")
    uint32_t("max_threads")
}

val ExrMemoryPoolCreateInfo = struct(Module.TINYEXR, "ExrMemoryPoolCreateInfo") {
    size_t("initial_size")
    size_t("max_size")
    uint32_t("flags")
}

val ExrDecoderCreateInfo = struct(Module.TINYEXR, "ExrDecoderCreateInfo") {
    ExrDataSource("source")
    nullable..ExrMemoryPool("scratch_pool")
    uint32_t("flags")
}

val ExrPendingFetch = struct(Module.TINYEXR, "ExrPendingFetch") {
    uint64_t("offset")
    AutoSize("destination", optional = true)..uint64_t("size")
    nullable..void.p("destination")
}

val ExrImageInfo = struct(Module.TINYEXR, "ExrImageInfo") {
    int32_t("width")
    int32_t("height")
    ExrBox2i("data_window")
    ExrBox2i("display_window")
    uint32_t("num_channels")
    uint32_t("num_parts")
    uint32_t("compression")
    uint32_t("flags")
    uint32_t("tile_size_x")
    uint32_t("tile_size_y")
    uint32_t("num_x_levels")
    uint32_t("num_y_levels")
    float("pixel_aspect_ratio")
    ExrVec2f("screen_window_center")
    float("screen_window_width")
}

val ExrChannelInfo = struct(Module.TINYEXR, "ExrChannelInfo") {
    charASCII.const.p("name")
    uint32_t("pixel_type")
    int32_t("x_sampling")
    int32_t("y_sampling")
    uint8_t("p_linear")
    uint8_t("reserved")[3].private()
}

val ExrPartInfo = struct(Module.TINYEXR, "ExrPartInfo") {
    nullable..charASCII.const.p("name")
    charASCII.const.p("type_string")
    uint32_t("part_type")
    int32_t("width")
    int32_t("height")
    uint32_t("num_channels")
    uint32_t("compression")
    uint32_t("flags")
}

val ExrAttribute = struct(Module.TINYEXR, "ExrAttribute") {
    charASCII.const.p("name")
    charASCII.const.p("type_name")
    ExrAttributeType("type")
    void.const.p("value")
    AutoSize("value")..uint32_t("size")
}

val ExrChunkInfo = struct(Module.TINYEXR, "ExrChunkInfo") {
    uint64_t("file_offset")
    uint32_t("compressed_size")
    uint32_t("uncompressed_size")
    int32_t("y_start")
    int32_t("tile_x")
    int32_t("tile_y")
    int32_t("level_x")
    int32_t("level_y")
    uint32_t("chunk_type")
}

val ExrCommandBufferCreateInfo = struct(Module.TINYEXR, "ExrCommandBufferCreateInfo") {
    ExrDecoder("decoder")
    nullable..ExrEncoder("encoder")
    uint32_t("max_commands")
    uint32_t("flags")
}

val ExrBuffer = struct(Module.TINYEXR, "ExrBuffer") {
    void.p("data")
    AutoSize("data")..size_t("size")
    size_t("offset")
}

val ExrTileRequest = struct(Module.TINYEXR, "ExrTileRequest") {
    ExrPart("part")
    int32_t("tile_x")
    int32_t("tile_y")
    int32_t("level_x")
    int32_t("level_y")
    ExrBuffer("output")
    uint32_t("channels_mask")
    uint32_t("output_pixel_type")
    uint32_t("output_layout")
}

val ExrScanlineRequest = struct(Module.TINYEXR, "ExrScanlineRequest") {
    ExrPart("part")
    int32_t("y_start")
    int32_t("num_lines")
    ExrBuffer("output")
    uint32_t("channels_mask")
    uint32_t("output_pixel_type")
    uint32_t("output_layout")
}

val ExrDeepSampleInfo = struct(Module.TINYEXR, "ExrDeepSampleInfo") {
    int32_t("y_start")
    int32_t("num_lines")
    int32_t("width")
    uint64_t("total_samples")
    Check("width * num_lines")..uint32_t.p("sample_counts")
    Check("width * num_lines + 1")..uint64_t.p("sample_offsets")
}

val ExrDeepScanlineRequest = struct(Module.TINYEXR, "ExrDeepScanlineRequest") {
    ExrPart("part")
    int32_t("y_start")
    int32_t("num_lines")
    ExrDeepSampleInfo.p("sample_info")
    ExrBuffer("output")
    uint32_t("channels_mask")
    uint32_t("output_pixel_type")
}

val ExrDeepTileSampleInfo = struct(Module.TINYEXR, "ExrDeepTileSampleInfo") {
    int32_t("tile_x")
    int32_t("tile_y")
    int32_t("level_x")
    int32_t("level_y")
    int32_t("width")
    int32_t("height")
    uint64_t("total_samples")
    Check("width * height")..uint32_t.p("sample_counts")
    Check("width * height + 1")..uint64_t.p("sample_offsets")
}

val ExrDeepTileRequest = struct(Module.TINYEXR, "ExrDeepTileRequest") {
    ExrPart("part")
    int32_t("tile_x")
    int32_t("tile_y")
    int32_t("level_x")
    int32_t("level_y")
    ExrDeepTileSampleInfo.p("sample_info")
    ExrBuffer("output")
    uint32_t("channels_mask")
    uint32_t("output_pixel_type")
}

val ExrFullImageRequest = struct(Module.TINYEXR, "ExrFullImageRequest") {
    ExrPart("part")
    ExrBuffer("output")
    uint32_t("channels_mask")
    uint32_t("output_pixel_type")
    uint32_t("output_layout")
    int32_t("target_level")
}

val ExrSubmitComplete = Module.TINYEXR.callback {
    void(
        "ExrSubmitComplete",

        nullable..opaque_p("userdata"),
        ExrResult("result"),

        nativeType = "ExrSubmitComplete"
    )
}

val ExrSubmitInfo = struct(Module.TINYEXR, "ExrSubmitInfo") {
    AutoSize("command_buffers")..uint32_t("command_buffer_count")
    ExrCommandBuffer.const.p("command_buffers")
    nullable..ExrFence("signal_fence")
    nullable..ExrSubmitComplete("on_complete")
    nullable..opaque_p("userdata")
}

val ExrFenceCreateInfo = struct(Module.TINYEXR, "ExrFenceCreateInfo") {
    uint32_t("flags")
}

val ExrProgressInfo = struct(Module.TINYEXR, "ExrProgressInfo") {
    int32_t("percent_complete")
    int32_t("current_block")
    int32_t("total_blocks")
    uint64_t("bytes_processed")
    uint64_t("bytes_total")
}

val ExrProgressCallback = Module.TINYEXR.callback {
    void(
        "ExrProgressCallback",

        nullable..opaque_p("userdata"),
        ExrProgressInfo.const.p("info"),

        nativeType = "ExrProgressCallback"
    )
}

val ExrEncoderCreateInfo = struct(Module.TINYEXR, "ExrEncoderCreateInfo") {
    ExrDataSink("sink")
    nullable..ExrMemoryPool("scratch_pool")
    uint32_t("flags")
}

val ExrWriteChannelInfo = struct(Module.TINYEXR, "ExrWriteChannelInfo") {
    charASCII.const.p("name")
    uint32_t("pixel_type")
    int32_t("x_sampling")
    int32_t("y_sampling")
    uint8_t("p_linear")
}

val ExrWriteImageCreateInfo = struct(Module.TINYEXR, "ExrWriteImageCreateInfo") {
    int32_t("width")
    int32_t("height")
    AutoSize("channels")..uint32_t("num_channels")
    ExrWriteChannelInfo.const.p("channels")
    uint32_t("compression")
    int32_t("compression_level")
    uint32_t("flags")
    int32_t("tile_size_x")
    int32_t("tile_size_y")
    nullable..ExrBox2i.const.p("data_window")
    nullable..ExrBox2i.const.p("display_window")
    nullable..charASCII.const.p("part_name")
}

val ExrTileWrite = struct(Module.TINYEXR, "ExrTileWrite") {
    ExrWriteImage("image")
    int32_t("tile_x")
    int32_t("tile_y")
    int32_t("level_x")
    int32_t("level_y")
    ExrBuffer("input")
    uint32_t("input_layout")
    uint32_t("input_pixel_type")
}

val ExrScanlineWrite = struct(Module.TINYEXR, "ExrScanlineWrite") {
    ExrWriteImage("image")
    int32_t("y_start")
    int32_t("num_lines")
    ExrBuffer("input")
    uint32_t("input_layout")
    uint32_t("input_pixel_type")
}

val ExrDeepScanlineWrite = struct(Module.TINYEXR, "ExrDeepScanlineWrite") {
    ExrWriteImage("image")
    int32_t("y_start")
    int32_t("num_lines")
    int32_t("width")
    Check("width * num_lines")..uint32_t.const.p("sample_counts")
    uint64_t("total_samples")
    ExrBuffer("input")
    uint32_t("input_layout")
    uint32_t("input_pixel_type")
}

val ExrDeepTileWrite = struct(Module.TINYEXR, "ExrDeepTileWrite") {
    ExrWriteImage("image")
    int32_t("tile_x")
    int32_t("tile_y")
    int32_t("level_x")
    int32_t("level_y")
    int32_t("width")
    int32_t("height")
    Check("width * height")..uint32_t.const.p("sample_counts")
    uint64_t("total_samples")
    ExrBuffer("input")
    uint32_t("input_layout")
    uint32_t("input_pixel_type")
}

val ExrDecompressInfo = struct(Module.TINYEXR, "ExrDecompressInfo") {
    void.const.p("src")
    AutoSize("src")..size_t("src_size")
    void.p("dst")
    AutoSize("dst")..size_t("dst_capacity")
    Check(1)..size_t.p("out_size")
    uint32_t("compression")
    int32_t("width")
    int32_t("num_lines")
    AutoSize("channels")..uint32_t("num_channels")
    ExrChannelInfo.const.p("channels")
    nullable..ExrMemoryPool("scratch")
}

val ExrCompressInfo = struct(Module.TINYEXR, "ExrCompressInfo") {
    void.const.p("src")
    AutoSize("src")..size_t("src_size")
    void.p("dst")
    AutoSize("dst")..size_t("dst_capacity")
    Check(1)..size_t.p("out_size")
    uint32_t("compression")
    int32_t("compression_level")
    int32_t("width")
    int32_t("num_lines")
    AutoSize("channels")..uint32_t("num_channels")
    ExrChannelInfo.const.p("channels")
    ExrMemoryPool("scratch")
}