/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef intptr_t (APIENTRY *glMapBufferOESPROC) (jint, jint);
typedef jboolean (APIENTRY *glUnmapBufferOESPROC) (jint);
typedef void (APIENTRY *glGetBufferPointervOESPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglMapBufferOES(JNIEnv *__env, jclass clazz, jint target, jint access) {
    glMapBufferOESPROC glMapBufferOES = (glMapBufferOESPROC)tlsGetFunction(790);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferOES(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESMapbuffer_glUnmapBufferOES(JNIEnv *__env, jclass clazz, jint target) {
    glUnmapBufferOESPROC glUnmapBufferOES = (glUnmapBufferOESPROC)tlsGetFunction(791);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapBufferOES(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglGetBufferPointervOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferPointervOESPROC glGetBufferPointervOES = (glGetBufferPointervOESPROC)tlsGetFunction(792);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferPointervOES(target, pname, params);
}

EXTERN_C_EXIT
