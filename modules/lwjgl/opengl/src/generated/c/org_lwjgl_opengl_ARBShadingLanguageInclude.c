/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glNamedStringARBPROC) (jint, jint, uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glDeleteNamedStringARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glCompileShaderIncludeARBPROC) (jint, jint, uintptr_t, uintptr_t);
typedef jboolean (APIENTRY *glIsNamedStringARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetNamedStringARBPROC) (jint, uintptr_t, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetNamedStringivARBPROC) (jint, uintptr_t, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglNamedStringARB(JNIEnv *__env, jclass clazz, jint type, jint namelen, jlong nameAddress, jint stringlen, jlong stringAddress) {
    glNamedStringARBPROC glNamedStringARB = (glNamedStringARBPROC)tlsGetFunction(1355);
    uintptr_t name = (uintptr_t)nameAddress;
    uintptr_t string = (uintptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glNamedStringARB(type, namelen, name, stringlen, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglDeleteNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress) {
    glDeleteNamedStringARBPROC glDeleteNamedStringARB = (glDeleteNamedStringARBPROC)tlsGetFunction(1356);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glDeleteNamedStringARB(namelen, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglCompileShaderIncludeARB__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong pathAddress, jlong lengthAddress) {
    glCompileShaderIncludeARBPROC glCompileShaderIncludeARB = (glCompileShaderIncludeARBPROC)tlsGetFunction(1357);
    uintptr_t path = (uintptr_t)pathAddress;
    uintptr_t length = (uintptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glCompileShaderIncludeARB(shader, count, path, length);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglIsNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress) {
    glIsNamedStringARBPROC glIsNamedStringARB = (glIsNamedStringARBPROC)tlsGetFunction(1358);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glIsNamedStringARB(namelen, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglGetNamedStringARB__IJIJJ(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jint bufSize, jlong stringlenAddress, jlong stringAddress) {
    glGetNamedStringARBPROC glGetNamedStringARB = (glGetNamedStringARBPROC)tlsGetFunction(1359);
    uintptr_t name = (uintptr_t)nameAddress;
    uintptr_t stringlen = (uintptr_t)stringlenAddress;
    uintptr_t string = (uintptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glGetNamedStringARB(namelen, name, bufSize, stringlen, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglGetNamedStringivARB__IJIJ(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jint pname, jlong paramsAddress) {
    glGetNamedStringivARBPROC glGetNamedStringivARB = (glGetNamedStringivARBPROC)tlsGetFunction(1360);
    uintptr_t name = (uintptr_t)nameAddress;
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedStringivARB(namelen, name, pname, params);
}

EXTERN_C_EXIT
