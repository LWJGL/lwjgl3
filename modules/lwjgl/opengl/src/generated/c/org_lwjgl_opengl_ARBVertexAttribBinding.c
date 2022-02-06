/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexArrayBindVertexBufferEXTPROC) (jint, jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribFormatEXTPROC) (jint, jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribIFormatEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribLFormatEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribBindingEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexBindingDivisorEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_glVertexArrayBindVertexBufferEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint buffer, jlong offset, jint stride) {
    glVertexArrayBindVertexBufferEXTPROC glVertexArrayBindVertexBufferEXT = (glVertexArrayBindVertexBufferEXTPROC)tlsGetFunction(1385);
    UNUSED_PARAM(clazz)
    glVertexArrayBindVertexBufferEXT(vaobj, bindingindex, buffer, (uintptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_glVertexArrayVertexAttribFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
    glVertexArrayVertexAttribFormatEXTPROC glVertexArrayVertexAttribFormatEXT = (glVertexArrayVertexAttribFormatEXTPROC)tlsGetFunction(1386);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribFormatEXT(vaobj, attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_glVertexArrayVertexAttribIFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexArrayVertexAttribIFormatEXTPROC glVertexArrayVertexAttribIFormatEXT = (glVertexArrayVertexAttribIFormatEXTPROC)tlsGetFunction(1387);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribIFormatEXT(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_glVertexArrayVertexAttribLFormatEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexArrayVertexAttribLFormatEXTPROC glVertexArrayVertexAttribLFormatEXT = (glVertexArrayVertexAttribLFormatEXTPROC)tlsGetFunction(1388);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribLFormatEXT(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_glVertexArrayVertexAttribBindingEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint bindingindex) {
    glVertexArrayVertexAttribBindingEXTPROC glVertexArrayVertexAttribBindingEXT = (glVertexArrayVertexAttribBindingEXTPROC)tlsGetFunction(1389);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribBindingEXT(vaobj, attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexAttribBinding_glVertexArrayVertexBindingDivisorEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint divisor) {
    glVertexArrayVertexBindingDivisorEXTPROC glVertexArrayVertexBindingDivisorEXT = (glVertexArrayVertexBindingDivisorEXTPROC)tlsGetFunction(1390);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexBindingDivisorEXT(vaobj, bindingindex, divisor);
}

EXTERN_C_EXIT
