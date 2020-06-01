/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glImportMemoryFdEXTPROC) (jint, jlong, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObjectFD_glImportMemoryFdEXT(JNIEnv *__env, jclass clazz, jint memory, jlong size, jint handleType, jint fd) {
    glImportMemoryFdEXTPROC glImportMemoryFdEXT = (glImportMemoryFdEXTPROC)tlsGetFunction(460);
    UNUSED_PARAM(clazz)
    glImportMemoryFdEXT(memory, size, handleType, fd);
}

EXTERN_C_EXIT
