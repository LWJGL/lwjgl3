/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr.templates

import org.lwjgl.generator.*
import tinyexr.*

val tinyexr = "TinyEXR".nativeClass(Module.TINYEXR, prefix = "EXR", prefixMethod = "exr_") {
    nativeDirective("""DISABLE_WARNINGS()
#include "tinyexr_c.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "TINYEXR_C_API_VERSION_MAJOR".."3",
        "TINYEXR_C_API_VERSION_MINOR".."0",
        "TINYEXR_C_API_VERSION_PATCH".."0",
        "TINYEXR_C_API_VERSION".."((TINYEXR_C_API_VERSION_MAJOR << 22) | (TINYEXR_C_API_VERSION_MINOR << 12) | TINYEXR_C_API_VERSION_PATCH)"
    ).noPrefix()

    EnumConstant(
        "SUCCESS".."0",
        "INCOMPLETE".."1",
        "WOULD_BLOCK".."2",
        "SUSPENDED".."3",

        "ERROR_INVALID_HANDLE".."-1",
        "ERROR_INVALID_ARGUMENT".."-2",
        "ERROR_OUT_OF_MEMORY".."-3",
        "ERROR_INVALID_MAGIC".."-4",
        "ERROR_INVALID_VERSION".."-5",
        "ERROR_INVALID_DATA".."-6",
        "ERROR_UNSUPPORTED_FORMAT".."-7",
        "ERROR_UNSUPPORTED_COMPRESSION".."-8",
        "ERROR_DECOMPRESSION_FAILED".."-9",
        "ERROR_COMPRESSION_FAILED".."-10",
        "ERROR_IO".."-11",
        "ERROR_BUFFER_TOO_SMALL".."-12",
        "ERROR_TIMEOUT".."-13",
        "ERROR_CANCELLED".."-14",
        "ERROR_NOT_READY".."-15",
        "ERROR_MISSING_ATTRIBUTE".."-16",
        "ERROR_FETCH_FAILED".."-17",
        "ERROR_OUT_OF_BOUNDS".."-18",
        "ERROR_ALREADY_INITIALIZED".."-19",
        "ERROR_NOT_INITIALIZED".."-20",
        "ERROR_INVALID_STATE".."-21"
    )

    customMethod("""
    public static boolean EXR_SUCCEEDED(int result) {
        return 0 <= result;
    }

    public static boolean EXR_FAILED(int result) {
        return result < 0;
    }
    """)

    LongConstant(
        "NULL_HANDLE".."0L"
    )

    EnumConstant(
        "PIXEL_UINT".enum("0"),
        "PIXEL_HALF".enum,
        "PIXEL_FLOAT".enum
    )

    EnumConstant(
        "COMPRESSION_NONE".enum("0"),
        "COMPRESSION_RLE".enum,
        "COMPRESSION_ZIPS".enum,
        "COMPRESSION_ZIP".enum,
        "COMPRESSION_PIZ".enum,
        "COMPRESSION_PXR24".enum,
        "COMPRESSION_B44".enum,
        "COMPRESSION_B44A".enum,
        "COMPRESSION_DWAA".enum,
        "COMPRESSION_DWAB".enum
    )

    EnumConstant(
        "LINE_ORDER_INCREASING_Y".enum("0"),
        "LINE_ORDER_DECREASING_Y".enum,
        "LINE_ORDER_RANDOM_Y".enum
    )

    EnumConstant(
        "TILE_ONE_LEVEL".enum("0"),
        "TILE_MIPMAP_LEVELS".enum,
        "TILE_RIPMAP_LEVELS".enum
    )

    EnumConstant(
        "TILE_ROUND_DOWN".enum("0"),
        "TILE_ROUND_UP".enum
    )

    EnumConstant(
        "PART_SCANLINE".enum("0"),
        "PART_TILED".enum,
        "PART_DEEP_SCANLINE".enum,
        "PART_DEEP_TILED".enum
    )

    EnumConstant(
        "LAYOUT_PLANAR".enum("0"),
        "LAYOUT_INTERLEAVED".enum,
        "LAYOUT_NATIVE".enum
    )

    EnumConstant(
        "DATA_SOURCE_SEEKABLE".enum("0x0001"),
        "DATA_SOURCE_ASYNC".enum("0x0002"),
        "DATA_SOURCE_STREAMING".enum("0x0004"),
        "DATA_SOURCE_SIZE_KNOWN".enum("0x0008")
    )

    EnumConstant(
        "CONTEXT_ENABLE_VALIDATION".enum("0x0001"),
        "CONTEXT_ENABLE_DEBUG_INFO".enum("0x0002"),
        "CONTEXT_SINGLE_THREADED".enum("0x0004"),
        "CONTEXT_SIMD_DISABLED".enum("0x0008")
    )

    EnumConstant(
        "MEMORY_POOL_THREAD_LOCAL".enum("0x0001"),
        "MEMORY_POOL_PERSISTENT".enum("0x0002")
    )

    EnumConstant(
        "DECODER_LAZY_LOAD".enum("0x0001"),
        "DECODER_VALIDATE_CHUNKS".enum("0x0002"),
        "DECODER_ALLOW_TRUNCATED".enum("0x0004")
    )

    EnumConstant(
        "IMAGE_TILED".enum("0x0001"),
        "IMAGE_MULTIPART".enum("0x0002"),
        "IMAGE_DEEP".enum("0x0004"),
        "IMAGE_LONG_NAMES".enum("0x0008")
    )

    EnumConstant(
        "ATTR_UNKNOWN".enum("0"),
        "ATTR_INT".enum,
        "ATTR_FLOAT".enum,
        "ATTR_DOUBLE".enum,
        "ATTR_STRING".enum,
        "ATTR_BOX2I".enum,
        "ATTR_BOX2F".enum,
        "ATTR_V2I".enum,
        "ATTR_V2F".enum,
        "ATTR_V3I".enum,
        "ATTR_V3F".enum,
        "ATTR_M33F".enum,
        "ATTR_M44F".enum,
        "ATTR_CHLIST".enum,
        "ATTR_COMPRESSION".enum,
        "ATTR_LINEORDER".enum,
        "ATTR_TILEDESC".enum,
        "ATTR_PREVIEW".enum,
        "ATTR_RATIONAL".enum,
        "ATTR_KEYCODE".enum,
        "ATTR_TIMECODE".enum,
        "ATTR_CHROMATICITIES".enum,
        "ATTR_ENVMAP".enum,
        "ATTR_DEEPIMAGETYPE".enum,
        "ATTR_OPAQUE".enum
    )

    EnumConstant(
        "CMD_ONE_TIME_SUBMIT".enum("0x0001"),
        "CMD_SIMULTANEOUS_USE".enum("0x0002")
    )

    EnumConstant(
        "FENCE_SIGNALED".enum("0x0001")
    )

    EnumConstant(
        "ENCODER_PARALLEL".enum("0x0001")
    )

    EnumConstant(
        "WRITE_TILED".enum("0x0001"),
        "WRITE_MULTIPART".enum("0x0002"),
        "WRITE_MIPMAP".enum("0x0004"),
        "WRITE_RIPMAP".enum("0x0008"),
        "WRITE_DEEP".enum("0x0010")
    )

    EnumConstant(
        "SIMD_NONE".enum("0"),
        "SIMD_SSE2".enum("0x0001"),
        "SIMD_SSE4_1".enum("0x0002"),
        "SIMD_AVX".enum("0x0004"),
        "SIMD_AVX2".enum("0x0008"),
        "SIMD_AVX512".enum("0x0010"),
        "SIMD_NEON".enum("0x0020"),
        "SIMD_BMI1".enum("0x0040"),
        "SIMD_BMI2".enum("0x0080")
    )

    ExrAllocator.const.p(
        "get_default_allocator",

        void()
    )

    ExrResult(
        "data_source_from_memory",

        void.const.p("data"),
        AutoSize("data")..size_t("size"),
        ExrDataSource.p("out_source")
    )

    ExrResult(
        "data_sink_to_memory",

        ExrContext("ctx"),
        ExrDataSink.p("out_sink"),
        Check(1)..void.p.p("out_data"),
        Check(1)..size_t.p("out_size")
    )

    ExrResult(
        "get_last_error",

        ExrContext("ctx"),
        ExrErrorInfo.p("out_info")
    )

    uint32_t(
        "get_error_count",

        ExrContext("ctx")
    )

    ExrResult(
        "get_error_at",

        ExrContext("ctx"),
        uint32_t("index"),
        ExrErrorInfo.p("out_info")
    )

    void(
        "clear_errors",

        ExrContext("ctx")
    )

    charASCII.const.p(
        "result_to_string",

        ExrResult("result")
    )

    ExrResult(
        "context_create",

        ExrContextCreateInfo.const.p("create_info"),
        Check(1)..ExrContext.p("out_ctx")
    )

    void(
        "context_destroy",

        ExrContext("ctx")
    )

    void(
        "context_add_ref",

        ExrContext("ctx")
    )

    void(
        "context_release",

        ExrContext("ctx")
    )

    ExrResult(
        "memory_pool_create",

        ExrContext("ctx"),
        ExrMemoryPoolCreateInfo.const.p("create_info"),
        Check(1)..ExrMemoryPool.p("out_pool")
    )

    void(
        "memory_pool_destroy",

        ExrMemoryPool("pool")
    )

    void(
        "memory_pool_reset",

        ExrMemoryPool("pool")
    )

    size_t(
        "memory_pool_get_used",

        ExrMemoryPool("pool")
    )

    ExrResult(
        "decoder_create",

        ExrContext("ctx"),
        ExrDecoderCreateInfo.const.p("create_info"),
        Check(1)..ExrDecoder.p("out_decoder")
    )

    void(
        "decoder_destroy",

        ExrDecoder("decoder")
    )

    ExrResult(
        "decoder_parse_header",

        ExrDecoder("decoder"),
        Check(1)..ExrImage.p("out_image")
    )

    ExrResult(
        "decoder_wait_idle",

        ExrDecoder("decoder")
    )

    ExrResult(
        "decoder_get_suspend_state",

        ExrDecoder("decoder"),
        Check(1)..ExrSuspendState.p("out_state")
    )

    ExrResult(
        "suspend_get_pending_fetch",

        ExrSuspendState("state"),
        ExrPendingFetch.p("out_fetch")
    )

    ExrResult(
        "suspend_complete_fetch",

        ExrSuspendState("state"),
        void.const.p("data"),
        AutoSize("data")..size_t("size")
    )

    ExrResult(
        "decoder_resume",

        ExrDecoder("decoder")
    )

    ExrResult(
        "image_get_info",

        ExrImage("image"),
        ExrImageInfo.p("out_info")
    )

    void(
        "image_destroy",

        ExrImage("image")
    )

    ExrResult(
        "image_get_channel_count",

        ExrImage("image"),
        Check(1)..uint32_t.p("out_count")
    )

    ExrResult(
        "image_get_channel",

        ExrImage("image"),
        uint32_t("index"),
        ExrChannelInfo.p("out_info")
    )

    ExrResult(
        "image_find_channel",

        ExrImage("image"),
        charASCII.const.p("name"),
        Check(1)..uint32_t.p("out_index")
    )

    ExrResult(
        "image_get_part_count",

        ExrImage("image"),
        Check(1)..uint32_t.p("out_count")
    )

    ExrResult(
        "image_get_part",

        ExrImage("image"),
        uint32_t("index"),
        Check(1)..ExrPart.p("out_part")
    )

    ExrResult(
        "image_find_part_by_name",

        ExrImage("image"),
        charASCII.const.p("name"),
        Check(1)..ExrPart.p("out_part")
    )

    void(
        "part_destroy",

        ExrPart("part")
    )

    ExrResult(
        "part_get_info",

        ExrPart("part"),
        ExrPartInfo.p("out_info")
    )

    ExrResult(
        "part_get_channel",

        ExrPart("part"),
        uint32_t("index"),
        ExrChannelInfo.p("out_info")
    )

    ExrResult(
        "part_get_attribute_count",

        ExrPart("part"),
        Check(1)..uint32_t.p("out_count")
    )

    ExrResult(
        "part_get_attribute",

        ExrPart("part"),
        charASCII.const.p("name"),
        ExrAttribute.p("out_attr")
    )

    ExrResult(
        "part_get_attribute_at",

        ExrPart("part"),
        uint32_t("index"),
        ExrAttribute.p("out_attr")
    )

    int(
        "part_has_attribute",

        ExrPart("part"),
        charASCII.const.p("name")
    )

    ExrResult(
        "part_get_chunk_count",

        ExrPart("part"),
        Check(1)..uint32_t.p("out_count")
    )

    /*ExrResult(
        "part_get_chunk_info",

        ExrPart("part"),
        uint32_t("chunk_index"),
        ExrChunkInfo.p("out_info")
    )

    ExrResult(
        "part_get_tile_count",

        ExrPart("part"),
        int32_t("level_x"),
        int32_t("level_y"),
        Check(1)..uint32_t.p("out_x_tiles"),
        Check(1)..uint32_t.p("out_y_tiles")
    )

    ExrResult(
        "part_get_scanline_block_count",

        ExrPart("part"),
        Check(1)..uint32_t.p("out_count")
    )*/

    ExrResult(
        "command_buffer_create",

        ExrContext("ctx"),
        ExrCommandBufferCreateInfo.const.p("create_info"),
        Check(1)..ExrCommandBuffer.p("out_cmd")
    )

    void(
        "command_buffer_destroy",

        ExrCommandBuffer("cmd")
    )

    ExrResult(
        "command_buffer_reset",

        ExrCommandBuffer("cmd")
    )

    ExrResult(
        "command_buffer_begin",

        ExrCommandBuffer("cmd")
    )

    ExrResult(
        "command_buffer_end",

        ExrCommandBuffer("cmd")
    )

    ExrResult(
        "cmd_request_tile",

        ExrCommandBuffer("cmd"),
        ExrTileRequest.const.p("request")
    )

    ExrResult(
        "cmd_request_tiles",

        ExrCommandBuffer("cmd"),
        uint32_t("count"),
        ExrTileRequest.const.p("requests")
    )

    ExrResult(
        "cmd_request_scanlines",

        ExrCommandBuffer("cmd"),
        ExrScanlineRequest.const.p("request")
    )

    ExrResult(
        "cmd_request_scanline_blocks",

        ExrCommandBuffer("cmd"),
        AutoSize("requests")..uint32_t("count"),
        ExrScanlineRequest.const.p("requests")
    )

    ExrResult(
        "part_get_deep_sample_counts",

        ExrDecoder("decoder"),
        ExrPart("part"),
        int32_t("y_start"),
        int32_t("num_lines"),
        ExrDeepSampleInfo.p("out_info")
    )

    void(
        "deep_sample_info_free",

        ExrContext("ctx"),
        ExrDeepSampleInfo.p("info")
    )

    ExrResult(
        "cmd_request_deep_scanlines",

        ExrCommandBuffer("cmd"),
        ExrDeepScanlineRequest.const.p("request")
    )

    ExrResult(
        "part_get_deep_tile_sample_counts",

        ExrDecoder("decoder"),
        ExrPart("part"),
        int32_t("tile_x"),
        int32_t("tile_y"),
        int32_t("level_x"),
        int32_t("level_y"),
        ExrDeepTileSampleInfo.p("out_info")
    )

    void(
        "deep_tile_sample_info_free",

        ExrContext("ctx"),
        ExrDeepTileSampleInfo.p("info")
    )

    ExrResult(
        "cmd_request_deep_tiles",

        ExrCommandBuffer("cmd"),
        ExrDeepTileRequest.const.p("request")
    )

    ExrResult(
        "cmd_request_deep_tile_batch",

        ExrCommandBuffer("cmd"),
        AutoSize("requests")..uint32_t("count"),
        ExrDeepTileRequest.const.p("requests")
    )

    ExrResult(
        "cmd_request_full_image",

        ExrCommandBuffer("cmd"),
        ExrFullImageRequest.const.p("request")
    )

    ExrResult(
        "submit",

        ExrDecoder("decoder"),
        ExrSubmitInfo.const.p("submit_info")
    )

    ExrResult(
        "fence_create",

        ExrContext("ctx"),
        ExrFenceCreateInfo.const.p("create_info"),
        Check(1)..ExrFence.p("out_fence")
    )

    void(
        "fence_destroy",

        ExrFence("fence")
    )

    ExrResult(
        "fence_wait",

        ExrFence("fence"),
        uint64_t("timeout_ns")
    )

    ExrResult(
        "fence_get_status",

        ExrFence("fence")
    )

    ExrResult(
        "fence_reset",

        ExrFence("fence")
    )

    ExrResult(
        "get_suspend_state",

        ExrDecoder("decoder"),
        Check(1)..ExrSuspendState.p("out_state")
    )

    ExrResult(
        "resume",

        ExrDecoder("decoder"),
        ExrSuspendState("state")
    )

    void(
        "suspend_state_destroy",

        ExrSuspendState("state")
    )

    ExrResult(
        "decoder_set_progress_callback",

        ExrDecoder("decoder"),
        ExrProgressCallback("callback"),
        nullable..opaque_p("userdata"),
        int32_t("interval_ms")
    )

    ExrResult(
        "encoder_create",

        ExrContext("ctx"),
        ExrEncoderCreateInfo.const.p("create_info"),
        Check(1)..ExrEncoder.p("out_encoder")
    )

    void(
        "encoder_destroy",

        ExrEncoder("encoder")
    )

    ExrResult(
        "write_image_create",

        ExrEncoder("encoder"),
        ExrWriteImageCreateInfo.const.p("create_info"),
        Check(1)..ExrWriteImage.p("out_image")
    )

    void(
        "write_image_destroy",

        ExrWriteImage("image")
    )

    ExrResult(
        "write_image_set_attribute",

        ExrWriteImage("image"),
        charASCII.const.p("name"),
        charASCII.const.p("type"),
        void.const.p("value"),
        AutoSize("value")..uint32_t("size")
    )

    ExrResult(
        "write_image_set_int_attribute",

        ExrWriteImage("image"),
        charASCII.const.p("name"),
        int32_t("value")
    )

    ExrResult(
        "write_image_set_float_attribute",

        ExrWriteImage("image"),
        charASCII.const.p("name"),
        float("value")
    )

    ExrResult(
        "write_image_set_string_attribute",

        ExrWriteImage("image"),
        charASCII.const.p("name"),
        charASCII.const.p("value")
    )

    ExrResult(
        "cmd_write_tile",

        ExrCommandBuffer("cmd"),
        ExrTileWrite.const.p("write")
    )

    ExrResult(
        "cmd_write_tiles",

        ExrCommandBuffer("cmd"),
        AutoSize("writes")..uint32_t("count"),
        ExrTileWrite.const.p("writes")
    )

    ExrResult(
        "cmd_write_scanlines",

        ExrCommandBuffer("cmd"),
        ExrScanlineWrite.const.p("write")
    )

    ExrResult(
        "cmd_write_deep_scanlines",

        ExrCommandBuffer("cmd"),
        ExrDeepScanlineWrite.const.p("write")
    )

    ExrResult(
        "cmd_write_deep_tiles",

        ExrCommandBuffer("cmd"),
        ExrDeepTileWrite.const.p("write")
    )

    ExrResult(
        "submit_write",

        ExrEncoder("encoder"),
        ExrSubmitInfo.const.p("submit_info")
    )

    ExrResult(
        "encoder_finalize",

        ExrEncoder("encoder")
    )

    ExrResult(
        "decompress_chunk",

        ExrContext("ctx"),
        ExrDecompressInfo.const.p("info")
    )

    ExrResult(
        "compress_chunk",

        ExrContext("ctx"),
        ExrCompressInfo.const.p("info")
    )

    void(
        "convert_half_to_float",

        uint16_t.const.p("src"),
        float.p("dst"),
        AutoSize("src", "dst")..size_t("count")
    )

    void(
        "convert_float_to_half",

        float.const.p("src"),
        uint16_t.p("dst"),
        AutoSize("src", "dst")..size_t("count")
    )

    Code(
        javaInit = statement(
            code = "$t${t}int pixel_count = rgba.remaining() >> 2;",
            applyTo = ApplyTo.ALTERNATIVE
        )
    )..void(
        "interleave_rgba",

        Check("pixel_count")..float.const.p("r"),
        Check("pixel_count")..float.const.p("g"),
        Check("pixel_count")..float.const.p("b"),
        Check("pixel_count")..float.const.p("a"),
        Unsafe..float.p("rgba"),
        Expression("pixel_count", skipNormal = true)..size_t("pixel_count")
    )

    Code(
        javaInit = statement(
            code = "$t${t}int pixel_count = rgba.remaining() >> 2;",
            applyTo = ApplyTo.ALTERNATIVE
        )
    )..void(
        "deinterleave_rgba",

        Unsafe..float.const.p("rgba"),
        Check("pixel_count")..float.p("r"),
        Check("pixel_count")..float.p("g"),
        Check("pixel_count")..float.p("b"),
        Check("pixel_count")..float.p("a"),
        Expression("pixel_count", skipNormal = true)..size_t("pixel_count")
    )

    uint32_t("get_simd_capabilities", void())
    charASCII.p("get_simd_info", void())

    void(
        "get_version",

        Check(1)..int.p("major"),
        Check(1)..int.p("minor"),
        Check(1)..int.p("patch")
    )

    charASCII.const.p(
        "get_version_string",

        void()
    )
}