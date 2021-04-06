/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#include "vpx_decoder.h"
#include "vpx_image.h"
#include "vpx_codec.h"
#include "vp8dx.h"


EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_vpx_VPXDecoder_vpx_1codec_1vp8_1dx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)vpx_codec_vp8_dx();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_vpx_VPXDecoder_vpx_1codec_1vp9_1dx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)vpx_codec_vp9_dx();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXDecoder_nvpx_1codec_1dec_1init_1ver(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong ifaceAddress, jlong cfgAddress, jlong flags, jint ver) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    vpx_codec_iface_t *iface = (vpx_codec_iface_t *)(intptr_t)ifaceAddress;
    vpx_codec_dec_cfg_t const *cfg = (vpx_codec_dec_cfg_t const *)(intptr_t)cfgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_dec_init_ver(ctx, iface, cfg, flags, ver);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXDecoder_nvpx_1codec_1decode(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong dataAddress, jint data_sz, jlong user_privAddress, jlong deadline) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    uint8_t const *data = (uint8_t const *)(intptr_t)dataAddress;
    void *user_priv = (void *)(intptr_t)user_privAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_decode(ctx, data, (unsigned int)data_sz, user_priv, deadline);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_vpx_VPXDecoder_nvpx_1codec_1get_1frame(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong iterAddress) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    void *iter = (void *)(intptr_t)iterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)vpx_codec_get_frame(ctx, iter);
}

EXTERN_C_EXIT
