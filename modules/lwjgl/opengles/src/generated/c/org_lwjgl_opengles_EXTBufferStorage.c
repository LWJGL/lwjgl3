/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBufferStorageEXTPROC) (jint, uintptr_t, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBufferStorage_nglBufferStorageEXT__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint flags) {
    glBufferStorageEXTPROC glBufferStorageEXT = (glBufferStorageEXTPROC)tlsGetFunction(395);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferStorageEXT(target, (uintptr_t)size, data, flags);
}

EXTERN_C_EXIT
