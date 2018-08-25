/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

typedef jint (*opus_custom_encoder_ctlPROC) (intptr_t, jint);
typedef jint (*opus_custom_encoder_ctl1iPROC) (intptr_t, jint, jint);
typedef jint (*opus_custom_encoder_ctl1pPROC) (intptr_t, jint, intptr_t);
typedef jint (*opus_custom_decoder_ctlPROC) (intptr_t, jint);
typedef jint (*opus_custom_decoder_ctl1iPROC) (intptr_t, jint, jint);
typedef jint (*opus_custom_decoder_ctl1pPROC) (intptr_t, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_opus_OpusCustom_nopus_1custom_1encoder_1ctl(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong stAddress, jint request) {
    opus_custom_encoder_ctlPROC opus_custom_encoder_ctl = (opus_custom_encoder_ctlPROC)(intptr_t)__functionAddress;
    intptr_t st = (intptr_t)stAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)opus_custom_encoder_ctl(st, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_opus_OpusCustom_nopus_1custom_1encoder_1ctl1i(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong stAddress, jint request, jint arg0) {
    opus_custom_encoder_ctl1iPROC opus_custom_encoder_ctl1i = (opus_custom_encoder_ctl1iPROC)(intptr_t)__functionAddress;
    intptr_t st = (intptr_t)stAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)opus_custom_encoder_ctl(st, request, arg0);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_opus_OpusCustom_nopus_1custom_1encoder_1ctl1p__JJIJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong stAddress, jint request, jlong arg0Address) {
    opus_custom_encoder_ctl1pPROC opus_custom_encoder_ctl1p = (opus_custom_encoder_ctl1pPROC)(intptr_t)__functionAddress;
    intptr_t st = (intptr_t)stAddress;
    intptr_t arg0 = (intptr_t)arg0Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)opus_custom_encoder_ctl(st, request, arg0);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_opus_OpusCustom_nopus_1custom_1decoder_1ctl(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong stAddress, jint request) {
    opus_custom_decoder_ctlPROC opus_custom_decoder_ctl = (opus_custom_decoder_ctlPROC)(intptr_t)__functionAddress;
    intptr_t st = (intptr_t)stAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)opus_custom_decoder_ctl(st, request);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_opus_OpusCustom_nopus_1custom_1decoder_1ctl1i(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong stAddress, jint request, jint arg0) {
    opus_custom_decoder_ctl1iPROC opus_custom_decoder_ctl1i = (opus_custom_decoder_ctl1iPROC)(intptr_t)__functionAddress;
    intptr_t st = (intptr_t)stAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)opus_custom_decoder_ctl(st, request, arg0);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_opus_OpusCustom_nopus_1custom_1decoder_1ctl1p__JJIJ(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong stAddress, jint request, jlong arg0Address) {
    opus_custom_decoder_ctl1pPROC opus_custom_decoder_ctl1p = (opus_custom_decoder_ctl1pPROC)(intptr_t)__functionAddress;
    intptr_t st = (intptr_t)stAddress;
    intptr_t arg0 = (intptr_t)arg0Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)opus_custom_decoder_ctl(st, request, arg0);
}

EXTERN_C_EXIT
