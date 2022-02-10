/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef uintptr_t (APIENTRY *glMapBufferOESPROC) (jint, jint);
typedef jboolean (APIENTRY *glUnmapBufferOESPROC) (jint);
typedef void (APIENTRY *glGetBufferPointervOESPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglMapBufferOES(JNIEnv *__env, jclass clazz, jint target, jint access) {
    glMapBufferOESPROC glMapBufferOES = (glMapBufferOESPROC)tlsGetFunction(801);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferOES(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESMapbuffer_glUnmapBufferOES(JNIEnv *__env, jclass clazz, jint target) {
    glUnmapBufferOESPROC glUnmapBufferOES = (glUnmapBufferOESPROC)tlsGetFunction(802);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapBufferOES(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESMapbuffer_nglGetBufferPointervOES(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferPointervOESPROC glGetBufferPointervOES = (glGetBufferPointervOESPROC)tlsGetFunction(803);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferPointervOES(target, pname, params);
}

EXTERN_C_EXIT
