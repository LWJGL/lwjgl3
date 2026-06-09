/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "tinyexr_c.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1default_1allocator(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)exr_get_default_allocator();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1data_1source_1from_1memory(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong size, jlong out_sourceAddress) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    ExrDataSource *out_source = (ExrDataSource *)(uintptr_t)out_sourceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_data_source_from_memory(data, (size_t)size, out_source);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1data_1sink_1to_1memory(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong out_sinkAddress, jlong out_dataAddress, jlong out_sizeAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrDataSink *out_sink = (ExrDataSink *)(uintptr_t)out_sinkAddress;
    void **out_data = (void **)(uintptr_t)out_dataAddress;
    size_t *out_size = (size_t *)(uintptr_t)out_sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_data_sink_to_memory(ctx, out_sink, out_data, out_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1last_1error(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong out_infoAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrErrorInfo *out_info = (ExrErrorInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_get_last_error(ctx, out_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1error_1count(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_get_error_count(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1error_1at(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint index, jlong out_infoAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrErrorInfo *out_info = (ExrErrorInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_get_error_at(ctx, (uint32_t)index, out_info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1clear_1errors(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_clear_errors(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1result_1to_1string(JNIEnv *__env, jclass clazz, jint result) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)exr_result_to_string((ExrResult)result);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1context_1create(JNIEnv *__env, jclass clazz, jlong create_infoAddress, jlong out_ctxAddress) {
    ExrContextCreateInfo const *create_info = (ExrContextCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrContext *out_ctx = (ExrContext *)(uintptr_t)out_ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_context_create(create_info, out_ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1context_1destroy(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_context_destroy(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1context_1add_1ref(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_context_add_ref(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1context_1release(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_context_release(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1memory_1pool_1create(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong create_infoAddress, jlong out_poolAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrMemoryPoolCreateInfo const *create_info = (ExrMemoryPoolCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrMemoryPool *out_pool = (ExrMemoryPool *)(uintptr_t)out_poolAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_memory_pool_create(ctx, create_info, out_pool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1memory_1pool_1destroy(JNIEnv *__env, jclass clazz, jlong poolAddress) {
    ExrMemoryPool pool = (ExrMemoryPool)(uintptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_memory_pool_destroy(pool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1memory_1pool_1reset(JNIEnv *__env, jclass clazz, jlong poolAddress) {
    ExrMemoryPool pool = (ExrMemoryPool)(uintptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_memory_pool_reset(pool);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1memory_1pool_1get_1used(JNIEnv *__env, jclass clazz, jlong poolAddress) {
    ExrMemoryPool pool = (ExrMemoryPool)(uintptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)exr_memory_pool_get_used(pool);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1create(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong create_infoAddress, jlong out_decoderAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrDecoderCreateInfo const *create_info = (ExrDecoderCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrDecoder *out_decoder = (ExrDecoder *)(uintptr_t)out_decoderAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decoder_create(ctx, create_info, out_decoder);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1destroy(JNIEnv *__env, jclass clazz, jlong decoderAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_decoder_destroy(decoder);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1parse_1header(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong out_imageAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrImage *out_image = (ExrImage *)(uintptr_t)out_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decoder_parse_header(decoder, out_image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1wait_1idle(JNIEnv *__env, jclass clazz, jlong decoderAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decoder_wait_idle(decoder);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1get_1suspend_1state(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong out_stateAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrSuspendState *out_state = (ExrSuspendState *)(uintptr_t)out_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decoder_get_suspend_state(decoder, out_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1suspend_1get_1pending_1fetch(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong out_fetchAddress) {
    ExrSuspendState state = (ExrSuspendState)(uintptr_t)stateAddress;
    ExrPendingFetch *out_fetch = (ExrPendingFetch *)(uintptr_t)out_fetchAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_suspend_get_pending_fetch(state, out_fetch);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1suspend_1complete_1fetch(JNIEnv *__env, jclass clazz, jlong stateAddress, jlong dataAddress, jlong size) {
    ExrSuspendState state = (ExrSuspendState)(uintptr_t)stateAddress;
    void const *data = (void const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_suspend_complete_fetch(state, data, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1resume(JNIEnv *__env, jclass clazz, jlong decoderAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decoder_resume(decoder);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1get_1info(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong out_infoAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    ExrImageInfo *out_info = (ExrImageInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_get_info(image, out_info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1destroy(JNIEnv *__env, jclass clazz, jlong imageAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_image_destroy(image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1get_1channel_1count(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong out_countAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    uint32_t *out_count = (uint32_t *)(uintptr_t)out_countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_get_channel_count(image, out_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1get_1channel(JNIEnv *__env, jclass clazz, jlong imageAddress, jint index, jlong out_infoAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    ExrChannelInfo *out_info = (ExrChannelInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_get_channel(image, (uint32_t)index, out_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1find_1channel(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong nameAddress, jlong out_indexAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    uint32_t *out_index = (uint32_t *)(uintptr_t)out_indexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_find_channel(image, name, out_index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1get_1part_1count(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong out_countAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    uint32_t *out_count = (uint32_t *)(uintptr_t)out_countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_get_part_count(image, out_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1get_1part(JNIEnv *__env, jclass clazz, jlong imageAddress, jint index, jlong out_partAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    ExrPart *out_part = (ExrPart *)(uintptr_t)out_partAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_get_part(image, (uint32_t)index, out_part);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1image_1find_1part_1by_1name(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong nameAddress, jlong out_partAddress) {
    ExrImage image = (ExrImage)(uintptr_t)imageAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    ExrPart *out_part = (ExrPart *)(uintptr_t)out_partAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_image_find_part_by_name(image, name, out_part);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1destroy(JNIEnv *__env, jclass clazz, jlong partAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_part_destroy(part);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1info(JNIEnv *__env, jclass clazz, jlong partAddress, jlong out_infoAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    ExrPartInfo *out_info = (ExrPartInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_info(part, out_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1channel(JNIEnv *__env, jclass clazz, jlong partAddress, jint index, jlong out_infoAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    ExrChannelInfo *out_info = (ExrChannelInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_channel(part, (uint32_t)index, out_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1attribute_1count(JNIEnv *__env, jclass clazz, jlong partAddress, jlong out_countAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    uint32_t *out_count = (uint32_t *)(uintptr_t)out_countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_attribute_count(part, out_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1attribute(JNIEnv *__env, jclass clazz, jlong partAddress, jlong nameAddress, jlong out_attrAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    ExrAttribute *out_attr = (ExrAttribute *)(uintptr_t)out_attrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_attribute(part, name, out_attr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1attribute_1at(JNIEnv *__env, jclass clazz, jlong partAddress, jint index, jlong out_attrAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    ExrAttribute *out_attr = (ExrAttribute *)(uintptr_t)out_attrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_attribute_at(part, (uint32_t)index, out_attr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1has_1attribute(JNIEnv *__env, jclass clazz, jlong partAddress, jlong nameAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_has_attribute(part, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1chunk_1count(JNIEnv *__env, jclass clazz, jlong partAddress, jlong out_countAddress) {
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    uint32_t *out_count = (uint32_t *)(uintptr_t)out_countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_chunk_count(part, out_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1command_1buffer_1create(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong create_infoAddress, jlong out_cmdAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrCommandBufferCreateInfo const *create_info = (ExrCommandBufferCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrCommandBuffer *out_cmd = (ExrCommandBuffer *)(uintptr_t)out_cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_command_buffer_create(ctx, create_info, out_cmd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1command_1buffer_1destroy(JNIEnv *__env, jclass clazz, jlong cmdAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_command_buffer_destroy(cmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1command_1buffer_1reset(JNIEnv *__env, jclass clazz, jlong cmdAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_command_buffer_reset(cmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1command_1buffer_1begin(JNIEnv *__env, jclass clazz, jlong cmdAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_command_buffer_begin(cmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1command_1buffer_1end(JNIEnv *__env, jclass clazz, jlong cmdAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_command_buffer_end(cmd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1tile(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong requestAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrTileRequest const *request = (ExrTileRequest const *)(uintptr_t)requestAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_tile(cmd, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1tiles(JNIEnv *__env, jclass clazz, jlong cmdAddress, jint count, jlong requestsAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrTileRequest const *requests = (ExrTileRequest const *)(uintptr_t)requestsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_tiles(cmd, (uint32_t)count, requests);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1scanlines(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong requestAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrScanlineRequest const *request = (ExrScanlineRequest const *)(uintptr_t)requestAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_scanlines(cmd, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1scanline_1blocks(JNIEnv *__env, jclass clazz, jlong cmdAddress, jint count, jlong requestsAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrScanlineRequest const *requests = (ExrScanlineRequest const *)(uintptr_t)requestsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_scanline_blocks(cmd, (uint32_t)count, requests);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1deep_1sample_1counts(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong partAddress, jint y_start, jint num_lines, jlong out_infoAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    ExrDeepSampleInfo *out_info = (ExrDeepSampleInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_deep_sample_counts(decoder, part, (int32_t)y_start, (int32_t)num_lines, out_info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1deep_1sample_1info_1free(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong infoAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrDeepSampleInfo *info = (ExrDeepSampleInfo *)(uintptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_deep_sample_info_free(ctx, info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1deep_1scanlines(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong requestAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrDeepScanlineRequest const *request = (ExrDeepScanlineRequest const *)(uintptr_t)requestAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_deep_scanlines(cmd, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1part_1get_1deep_1tile_1sample_1counts(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong partAddress, jint tile_x, jint tile_y, jint level_x, jint level_y, jlong out_infoAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrPart part = (ExrPart)(uintptr_t)partAddress;
    ExrDeepTileSampleInfo *out_info = (ExrDeepTileSampleInfo *)(uintptr_t)out_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_part_get_deep_tile_sample_counts(decoder, part, (int32_t)tile_x, (int32_t)tile_y, (int32_t)level_x, (int32_t)level_y, out_info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1deep_1tile_1sample_1info_1free(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong infoAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrDeepTileSampleInfo *info = (ExrDeepTileSampleInfo *)(uintptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_deep_tile_sample_info_free(ctx, info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1deep_1tiles(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong requestAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrDeepTileRequest const *request = (ExrDeepTileRequest const *)(uintptr_t)requestAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_deep_tiles(cmd, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1deep_1tile_1batch(JNIEnv *__env, jclass clazz, jlong cmdAddress, jint count, jlong requestsAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrDeepTileRequest const *requests = (ExrDeepTileRequest const *)(uintptr_t)requestsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_deep_tile_batch(cmd, (uint32_t)count, requests);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1request_1full_1image(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong requestAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrFullImageRequest const *request = (ExrFullImageRequest const *)(uintptr_t)requestAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_request_full_image(cmd, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1submit(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong submit_infoAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrSubmitInfo const *submit_info = (ExrSubmitInfo const *)(uintptr_t)submit_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_submit(decoder, submit_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1fence_1create(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong create_infoAddress, jlong out_fenceAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrFenceCreateInfo const *create_info = (ExrFenceCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrFence *out_fence = (ExrFence *)(uintptr_t)out_fenceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_fence_create(ctx, create_info, out_fence);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1fence_1destroy(JNIEnv *__env, jclass clazz, jlong fenceAddress) {
    ExrFence fence = (ExrFence)(uintptr_t)fenceAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_fence_destroy(fence);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1fence_1wait(JNIEnv *__env, jclass clazz, jlong fenceAddress, jlong timeout_ns) {
    ExrFence fence = (ExrFence)(uintptr_t)fenceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_fence_wait(fence, (uint64_t)timeout_ns);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1fence_1get_1status(JNIEnv *__env, jclass clazz, jlong fenceAddress) {
    ExrFence fence = (ExrFence)(uintptr_t)fenceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_fence_get_status(fence);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1fence_1reset(JNIEnv *__env, jclass clazz, jlong fenceAddress) {
    ExrFence fence = (ExrFence)(uintptr_t)fenceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_fence_reset(fence);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1suspend_1state(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong out_stateAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrSuspendState *out_state = (ExrSuspendState *)(uintptr_t)out_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_get_suspend_state(decoder, out_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1resume(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong stateAddress) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrSuspendState state = (ExrSuspendState)(uintptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_resume(decoder, state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1suspend_1state_1destroy(JNIEnv *__env, jclass clazz, jlong stateAddress) {
    ExrSuspendState state = (ExrSuspendState)(uintptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_suspend_state_destroy(state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decoder_1set_1progress_1callback(JNIEnv *__env, jclass clazz, jlong decoderAddress, jlong callbackAddress, jlong userdataAddress, jint interval_ms) {
    ExrDecoder decoder = (ExrDecoder)(uintptr_t)decoderAddress;
    ExrProgressCallback callback = (ExrProgressCallback)(uintptr_t)callbackAddress;
    void *userdata = (void *)(uintptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decoder_set_progress_callback(decoder, callback, userdata, (int32_t)interval_ms);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1encoder_1create(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong create_infoAddress, jlong out_encoderAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrEncoderCreateInfo const *create_info = (ExrEncoderCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrEncoder *out_encoder = (ExrEncoder *)(uintptr_t)out_encoderAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_encoder_create(ctx, create_info, out_encoder);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1encoder_1destroy(JNIEnv *__env, jclass clazz, jlong encoderAddress) {
    ExrEncoder encoder = (ExrEncoder)(uintptr_t)encoderAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_encoder_destroy(encoder);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1write_1image_1create(JNIEnv *__env, jclass clazz, jlong encoderAddress, jlong create_infoAddress, jlong out_imageAddress) {
    ExrEncoder encoder = (ExrEncoder)(uintptr_t)encoderAddress;
    ExrWriteImageCreateInfo const *create_info = (ExrWriteImageCreateInfo const *)(uintptr_t)create_infoAddress;
    ExrWriteImage *out_image = (ExrWriteImage *)(uintptr_t)out_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_write_image_create(encoder, create_info, out_image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1write_1image_1destroy(JNIEnv *__env, jclass clazz, jlong imageAddress) {
    ExrWriteImage image = (ExrWriteImage)(uintptr_t)imageAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_write_image_destroy(image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1write_1image_1set_1attribute(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong nameAddress, jlong typeAddress, jlong valueAddress, jint size) {
    ExrWriteImage image = (ExrWriteImage)(uintptr_t)imageAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char const *type = (char const *)(uintptr_t)typeAddress;
    void const *value = (void const *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_write_image_set_attribute(image, name, type, value, (uint32_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1write_1image_1set_1int_1attribute(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong nameAddress, jint value) {
    ExrWriteImage image = (ExrWriteImage)(uintptr_t)imageAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_write_image_set_int_attribute(image, name, (int32_t)value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1write_1image_1set_1float_1attribute(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong nameAddress, jfloat value) {
    ExrWriteImage image = (ExrWriteImage)(uintptr_t)imageAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_write_image_set_float_attribute(image, name, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1write_1image_1set_1string_1attribute(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong nameAddress, jlong valueAddress) {
    ExrWriteImage image = (ExrWriteImage)(uintptr_t)imageAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char const *value = (char const *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_write_image_set_string_attribute(image, name, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1write_1tile(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong writeAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrTileWrite const *write = (ExrTileWrite const *)(uintptr_t)writeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_write_tile(cmd, write);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1write_1tiles(JNIEnv *__env, jclass clazz, jlong cmdAddress, jint count, jlong writesAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrTileWrite const *writes = (ExrTileWrite const *)(uintptr_t)writesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_write_tiles(cmd, (uint32_t)count, writes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1write_1scanlines(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong writeAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrScanlineWrite const *write = (ExrScanlineWrite const *)(uintptr_t)writeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_write_scanlines(cmd, write);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1write_1deep_1scanlines(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong writeAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrDeepScanlineWrite const *write = (ExrDeepScanlineWrite const *)(uintptr_t)writeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_write_deep_scanlines(cmd, write);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1cmd_1write_1deep_1tiles(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong writeAddress) {
    ExrCommandBuffer cmd = (ExrCommandBuffer)(uintptr_t)cmdAddress;
    ExrDeepTileWrite const *write = (ExrDeepTileWrite const *)(uintptr_t)writeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_cmd_write_deep_tiles(cmd, write);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1submit_1write(JNIEnv *__env, jclass clazz, jlong encoderAddress, jlong submit_infoAddress) {
    ExrEncoder encoder = (ExrEncoder)(uintptr_t)encoderAddress;
    ExrSubmitInfo const *submit_info = (ExrSubmitInfo const *)(uintptr_t)submit_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_submit_write(encoder, submit_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1encoder_1finalize(JNIEnv *__env, jclass clazz, jlong encoderAddress) {
    ExrEncoder encoder = (ExrEncoder)(uintptr_t)encoderAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_encoder_finalize(encoder);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1decompress_1chunk(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong infoAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrDecompressInfo const *info = (ExrDecompressInfo const *)(uintptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_decompress_chunk(ctx, info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1compress_1chunk(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong infoAddress) {
    ExrContext ctx = (ExrContext)(uintptr_t)ctxAddress;
    ExrCompressInfo const *info = (ExrCompressInfo const *)(uintptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_compress_chunk(ctx, info);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1convert_1half_1to_1float(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jlong count) {
    uint16_t const *src = (uint16_t const *)(uintptr_t)srcAddress;
    float *dst = (float *)(uintptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_convert_half_to_float(src, dst, (size_t)count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1convert_1float_1to_1half(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong dstAddress, jlong count) {
    float const *src = (float const *)(uintptr_t)srcAddress;
    uint16_t *dst = (uint16_t *)(uintptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_convert_float_to_half(src, dst, (size_t)count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1interleave_1rgba(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong rgbaAddress, jlong pixel_count) {
    float const *r = (float const *)(uintptr_t)rAddress;
    float const *g = (float const *)(uintptr_t)gAddress;
    float const *b = (float const *)(uintptr_t)bAddress;
    float const *a = (float const *)(uintptr_t)aAddress;
    float *rgba = (float *)(uintptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_interleave_rgba(r, g, b, a, rgba, (size_t)pixel_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1deinterleave_1rgba(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong pixel_count) {
    float const *rgba = (float const *)(uintptr_t)rgbaAddress;
    float *r = (float *)(uintptr_t)rAddress;
    float *g = (float *)(uintptr_t)gAddress;
    float *b = (float *)(uintptr_t)bAddress;
    float *a = (float *)(uintptr_t)aAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_deinterleave_rgba(rgba, r, g, b, a, (size_t)pixel_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_exr_1get_1simd_1capabilities(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)exr_get_simd_capabilities();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1simd_1info(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)exr_get_simd_info();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1version(JNIEnv *__env, jclass clazz, jlong majorAddress, jlong minorAddress, jlong patchAddress) {
    int *major = (int *)(uintptr_t)majorAddress;
    int *minor = (int *)(uintptr_t)minorAddress;
    int *patch = (int *)(uintptr_t)patchAddress;
    UNUSED_PARAMS(__env, clazz)
    exr_get_version(major, minor, patch);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nexr_1get_1version_1string(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)exr_get_version_string();
}

EXTERN_C_EXIT
