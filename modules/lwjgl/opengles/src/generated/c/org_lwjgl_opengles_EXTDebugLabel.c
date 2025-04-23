/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glLabelObjectEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetObjectLabelEXTPROC) (jint, jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDebugLabel_nglLabelObjectEXT(JNIEnv *__env, jclass clazz, jint type, jint object, jint length, jlong labelAddress) {
    glLabelObjectEXTPROC glLabelObjectEXT = (glLabelObjectEXTPROC)tlsGetFunction(400);
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glLabelObjectEXT(type, object, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDebugLabel_nglGetObjectLabelEXT__IIIJJ(JNIEnv *__env, jclass clazz, jint type, jint object, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelEXTPROC glGetObjectLabelEXT = (glGetObjectLabelEXTPROC)tlsGetFunction(401);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabelEXT(type, object, bufSize, length, label);
}

EXTERN_C_EXIT
