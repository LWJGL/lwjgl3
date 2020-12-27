/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#include "vpx_encoder.h"
#include "vpx_image.h"
#include "vpx_codec.h"
#include "vp8cx.h"


EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_vpx_VPXEncoder_vpx_1codec_1vp8_1cx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)vpx_codec_vp8_cx();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_vpx_VPXEncoder_vpx_1codec_1vp9_1cx(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)vpx_codec_vp9_cx();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXEncoder_nvpx_1codec_1enc_1config_1default(JNIEnv *__env, jclass clazz, jlong ifaceAddress, jlong cfgAddress, jint usage) {
    vpx_codec_iface_t *iface = (vpx_codec_iface_t *)(intptr_t)ifaceAddress;
    vpx_codec_enc_cfg_t *cfg = (vpx_codec_enc_cfg_t *)(intptr_t)cfgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_enc_config_default(iface, cfg, (unsigned int)usage);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXEncoder_nvpx_1codec_1enc_1init_1ver(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong ifaceAddress, jlong cfgAddress, jlong flags, jint ver) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    vpx_codec_iface_t *iface = (vpx_codec_iface_t *)(intptr_t)ifaceAddress;
    vpx_codec_enc_cfg_t const *cfg = (vpx_codec_enc_cfg_t const *)(intptr_t)cfgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_enc_init_ver(ctx, iface, cfg, flags, ver);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_vpx_VPXEncoder_nvpx_1codec_1encode(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong pts, jlong duration, jlong flags, jlong deadline) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    vpx_image_t *img = (vpx_image_t *)(intptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vpx_codec_encode(ctx, img, (vpx_codec_pts_t)pts, (unsigned long)duration, flags, (unsigned long)deadline);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_vpx_VPXEncoder_nvpx_1codec_1get_1cx_1data(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong iterAddress) {
    vpx_codec_ctx_t *ctx = (vpx_codec_ctx_t *)(intptr_t)ctxAddress;
    void *iter = (void *)(intptr_t)iterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)vpx_codec_get_cx_data(ctx, iter);
}

EXTERN_C_EXIT
