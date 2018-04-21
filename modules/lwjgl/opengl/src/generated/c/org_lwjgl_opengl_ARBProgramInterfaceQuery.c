/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetProgramInterfaceivPROC) (jint, jint, jint, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceIndexPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramResourceNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetProgramResourceivPROC) (jint, jint, jint, jint, intptr_t, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceLocationPROC) (jint, jint, intptr_t);
typedef jint (APIENTRY *glGetProgramResourceLocationIndexPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBProgramInterfaceQuery_nglGetProgramInterfaceiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint pname, jlong paramsAddress) {
    glGetProgramInterfaceivPROC glGetProgramInterfaceiv = (glGetProgramInterfaceivPROC)tlsGetFunction(896);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramInterfaceiv(program, programInterface, pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBProgramInterfaceQuery_nglGetProgramResourceIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceIndexPROC glGetProgramResourceIndex = (glGetProgramResourceIndexPROC)tlsGetFunction(897);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceIndex(program, programInterface, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBProgramInterfaceQuery_nglGetProgramResourceName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint bufSize, jlong lengthAddress, jlong nameAddress) {
    glGetProgramResourceNamePROC glGetProgramResourceName = (glGetProgramResourceNamePROC)tlsGetFunction(898);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourceName(program, programInterface, index, bufSize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBProgramInterfaceQuery_nglGetProgramResourceiv__IIIIJIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress) {
    glGetProgramResourceivPROC glGetProgramResourceiv = (glGetProgramResourceivPROC)tlsGetFunction(899);
    intptr_t props = (intptr_t)propsAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBProgramInterfaceQuery_nglGetProgramResourceLocation(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceLocationPROC glGetProgramResourceLocation = (glGetProgramResourceLocationPROC)tlsGetFunction(900);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceLocation(program, programInterface, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBProgramInterfaceQuery_nglGetProgramResourceLocationIndex(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceLocationIndexPROC glGetProgramResourceLocationIndex = (glGetProgramResourceLocationIndexPROC)tlsGetFunction(901);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceLocationIndex(program, programInterface, name);
}

EXTERN_C_EXIT
