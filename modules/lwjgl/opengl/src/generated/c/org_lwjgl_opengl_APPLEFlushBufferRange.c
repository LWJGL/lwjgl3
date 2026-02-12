/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferParameteriAPPLEPROC) (jint, jint, jint);
typedef void (APIENTRY *glFlushMappedBufferRangeAPPLEPROC) (jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFlushBufferRange_glBufferParameteriAPPLE(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glBufferParameteriAPPLEPROC glBufferParameteriAPPLE = (glBufferParameteriAPPLEPROC)tlsGetFunction(1124);
    UNUSED_PARAM(clazz)
    glBufferParameteriAPPLE(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFlushBufferRange_glFlushMappedBufferRangeAPPLE(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size) {
    glFlushMappedBufferRangeAPPLEPROC glFlushMappedBufferRangeAPPLE = (glFlushMappedBufferRangeAPPLEPROC)tlsGetFunction(1125);
    UNUSED_PARAM(clazz)
    glFlushMappedBufferRangeAPPLE(target, (uintptr_t)offset, (uintptr_t)size);
}

EXTERN_C_EXIT
