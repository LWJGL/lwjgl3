/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCurrentPaletteMatrixARBPROC) (jint);
typedef void (APIENTRY *glMatrixIndexuivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixIndexubvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixIndexusvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixIndexPointerARBPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_glCurrentPaletteMatrixARB(JNIEnv *__env, jclass clazz, jint index) {
    glCurrentPaletteMatrixARBPROC glCurrentPaletteMatrixARB = (glCurrentPaletteMatrixARBPROC)tlsGetFunction(1241);
    UNUSED_PARAM(clazz)
    glCurrentPaletteMatrixARB(index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexuivARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong indicesAddress) {
    glMatrixIndexuivARBPROC glMatrixIndexuivARB = (glMatrixIndexuivARBPROC)tlsGetFunction(1242);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMatrixIndexuivARB(size, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexubvARB(JNIEnv *__env, jclass clazz, jint size, jlong indicesAddress) {
    glMatrixIndexubvARBPROC glMatrixIndexubvARB = (glMatrixIndexubvARBPROC)tlsGetFunction(1243);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMatrixIndexubvARB(size, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexusvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong indicesAddress) {
    glMatrixIndexusvARBPROC glMatrixIndexusvARB = (glMatrixIndexusvARBPROC)tlsGetFunction(1244);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMatrixIndexusvARB(size, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMatrixPalette_nglMatrixIndexPointerARB(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glMatrixIndexPointerARBPROC glMatrixIndexPointerARB = (glMatrixIndexPointerARBPROC)tlsGetFunction(1245);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glMatrixIndexPointerARB(size, type, stride, pointer);
}

EXTERN_C_EXIT
