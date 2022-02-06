/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexArrayVertexAttribLOffsetEXTPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttrib64Bit_glVertexArrayVertexAttribLOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayVertexAttribLOffsetEXTPROC glVertexArrayVertexAttribLOffsetEXT = (glVertexArrayVertexAttribLOffsetEXTPROC)tlsGetFunction(1384);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, (uintptr_t)offset);
}

EXTERN_C_EXIT
