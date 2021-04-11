/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#include "vpx_codec.h"
#include "vp8cx.h"


EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXCodec_nvpx_1codec_1destroy(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_destroy(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXCodec_nvpx_1codec_1control_1(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint ctrl_id, jint data) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_control_(ctx, ctrl_id, data);
}

EXTERN_C_EXIT
