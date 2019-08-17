/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define STB_PERLIN_IMPLEMENTATION
#include "stb_perlin.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1noise3(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jint x_wrap, jint y_wrap, jint z_wrap) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_perlin_noise3(x, y, z, x_wrap, y_wrap, z_wrap);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1noise3_1seed(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jint x_wrap, jint y_wrap, jint z_wrap, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_perlin_noise3_seed(x, y, z, x_wrap, y_wrap, z_wrap, seed);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1ridge_1noise3(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat lacunarity, jfloat gain, jfloat offset, jint octaves) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_perlin_ridge_noise3(x, y, z, lacunarity, gain, offset, octaves);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1fbm_1noise3(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat lacunarity, jfloat gain, jint octaves) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_perlin_fbm_noise3(x, y, z, lacunarity, gain, octaves);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1turbulence_1noise3(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat lacunarity, jfloat gain, jint octaves) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_perlin_turbulence_noise3(x, y, z, lacunarity, gain, octaves);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBPerlin_stb_1perlin_1noise3_1wrap_1nonpow2(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat z, jint x_wrap, jint y_wrap, jint z_wrap, jbyte seed) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_perlin_noise3_wrap_nonpow2(x, y, z, x_wrap, y_wrap, z_wrap, (unsigned char)seed);
}

EXTERN_C_EXIT
