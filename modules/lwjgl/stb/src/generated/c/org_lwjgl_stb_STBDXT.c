/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define STB_DXT_IMPLEMENTATION
#define STB_DXT_STATIC
#include "stb_dxt.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBDXT_nstb_1compress_1dxt_1block(JNIEnv *__env, jclass clazz, jlong destAddress, jlong src_rgba_four_bytes_per_pixelAddress, jint alpha, jint mode) {
    unsigned char *dest = (unsigned char *)(intptr_t)destAddress;
    unsigned char const *src_rgba_four_bytes_per_pixel = (unsigned char const *)(intptr_t)src_rgba_four_bytes_per_pixelAddress;
    UNUSED_PARAMS(__env, clazz)
    stb_compress_dxt_block(dest, src_rgba_four_bytes_per_pixel, alpha, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBDXT_nstb_1compress_1bc4_1block(JNIEnv *__env, jclass clazz, jlong destAddress, jlong src_r_one_byte_per_pixelAddress) {
    unsigned char *dest = (unsigned char *)(intptr_t)destAddress;
    unsigned char const *src_r_one_byte_per_pixel = (unsigned char const *)(intptr_t)src_r_one_byte_per_pixelAddress;
    UNUSED_PARAMS(__env, clazz)
    stb_compress_bc4_block(dest, src_r_one_byte_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBDXT_nstb_1compress_1bc5_1block(JNIEnv *__env, jclass clazz, jlong destAddress, jlong src_rg_two_byte_per_pixelAddress) {
    unsigned char *dest = (unsigned char *)(intptr_t)destAddress;
    unsigned char const *src_rg_two_byte_per_pixel = (unsigned char const *)(intptr_t)src_rg_two_byte_per_pixelAddress;
    UNUSED_PARAMS(__env, clazz)
    stb_compress_bc5_block(dest, src_rg_two_byte_per_pixel);
}

EXTERN_C_EXIT
