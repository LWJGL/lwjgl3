/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glLoadTransposeMatrixfARBPROC) (uintptr_t);
typedef void (APIENTRY *glLoadTransposeMatrixdARBPROC) (uintptr_t);
typedef void (APIENTRY *glMultTransposeMatrixfARBPROC) (uintptr_t);
typedef void (APIENTRY *glMultTransposeMatrixdARBPROC) (uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglLoadTransposeMatrixfARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glLoadTransposeMatrixfARBPROC glLoadTransposeMatrixfARB = (glLoadTransposeMatrixfARBPROC)tlsGetFunction(1380);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glLoadTransposeMatrixfARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglLoadTransposeMatrixdARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glLoadTransposeMatrixdARBPROC glLoadTransposeMatrixdARB = (glLoadTransposeMatrixdARBPROC)tlsGetFunction(1381);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glLoadTransposeMatrixdARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglMultTransposeMatrixfARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glMultTransposeMatrixfARBPROC glMultTransposeMatrixfARB = (glMultTransposeMatrixfARBPROC)tlsGetFunction(1382);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMultTransposeMatrixfARB(m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransposeMatrix_nglMultTransposeMatrixdARB__J(JNIEnv *__env, jclass clazz, jlong mAddress) {
    glMultTransposeMatrixdARBPROC glMultTransposeMatrixdARB = (glMultTransposeMatrixdARBPROC)tlsGetFunction(1383);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMultTransposeMatrixdARB(m);
}

EXTERN_C_EXIT
