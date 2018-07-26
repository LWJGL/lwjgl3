/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetTranslatedShaderSourceANGLEPROC) (jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ANGLETranslatedShaderSource_nglGetTranslatedShaderSourceANGLE__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint bufsize, jlong lengthAddress, jlong sourceAddress) {
    glGetTranslatedShaderSourceANGLEPROC glGetTranslatedShaderSourceANGLE = (glGetTranslatedShaderSourceANGLEPROC)tlsGetFunction(376);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t source = (intptr_t)sourceAddress;
    UNUSED_PARAM(clazz)
    glGetTranslatedShaderSourceANGLE(shader, bufsize, length, source);
}

EXTERN_C_EXIT
