/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPixelDataRangeNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glFlushPixelDataRangeNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPixelDataRange_nglPixelDataRangeNV(JNIEnv *__env, jclass clazz, jint target, jint length, jlong pointerAddress) {
    glPixelDataRangeNVPROC glPixelDataRangeNV = (glPixelDataRangeNVPROC)tlsGetFunction(2111);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glPixelDataRangeNV(target, length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPixelDataRange_glFlushPixelDataRangeNV(JNIEnv *__env, jclass clazz, jint target) {
    glFlushPixelDataRangeNVPROC glFlushPixelDataRangeNV = (glFlushPixelDataRangeNVPROC)tlsGetFunction(2112);
    UNUSED_PARAM(clazz)
    glFlushPixelDataRangeNV(target);
}

EXTERN_C_EXIT
