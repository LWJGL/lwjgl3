/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glNamedStringARBPROC) (jint, jint, intptr_t, jint, intptr_t);
typedef void (APIENTRY *glDeleteNamedStringARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glCompileShaderIncludeARBPROC) (jint, jint, intptr_t, intptr_t);
typedef jboolean (APIENTRY *glIsNamedStringARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetNamedStringARBPROC) (jint, intptr_t, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetNamedStringivARBPROC) (jint, intptr_t, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglNamedStringARB(JNIEnv *__env, jclass clazz, jint type, jint namelen, jlong nameAddress, jint stringlen, jlong stringAddress) {
    glNamedStringARBPROC glNamedStringARB = (glNamedStringARBPROC)tlsGetFunction(1321);
    intptr_t name = (intptr_t)nameAddress;
    intptr_t string = (intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glNamedStringARB(type, namelen, name, stringlen, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglDeleteNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress) {
    glDeleteNamedStringARBPROC glDeleteNamedStringARB = (glDeleteNamedStringARBPROC)tlsGetFunction(1322);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glDeleteNamedStringARB(namelen, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglCompileShaderIncludeARB__IIJJ(JNIEnv *__env, jclass clazz, jint shader, jint count, jlong pathAddress, jlong lengthAddress) {
    glCompileShaderIncludeARBPROC glCompileShaderIncludeARB = (glCompileShaderIncludeARBPROC)tlsGetFunction(1323);
    intptr_t path = (intptr_t)pathAddress;
    intptr_t length = (intptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glCompileShaderIncludeARB(shader, count, path, length);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglIsNamedStringARB(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress) {
    glIsNamedStringARBPROC glIsNamedStringARB = (glIsNamedStringARBPROC)tlsGetFunction(1324);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glIsNamedStringARB(namelen, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglGetNamedStringARB__IJIJJ(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jint bufSize, jlong stringlenAddress, jlong stringAddress) {
    glGetNamedStringARBPROC glGetNamedStringARB = (glGetNamedStringARBPROC)tlsGetFunction(1325);
    intptr_t name = (intptr_t)nameAddress;
    intptr_t stringlen = (intptr_t)stringlenAddress;
    intptr_t string = (intptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glGetNamedStringARB(namelen, name, bufSize, stringlen, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShadingLanguageInclude_nglGetNamedStringivARB__IJIJ(JNIEnv *__env, jclass clazz, jint namelen, jlong nameAddress, jint pname, jlong paramsAddress) {
    glGetNamedStringivARBPROC glGetNamedStringivARB = (glGetNamedStringivARBPROC)tlsGetFunction(1326);
    intptr_t name = (intptr_t)nameAddress;
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedStringivARB(namelen, name, pname, params);
}

EXTERN_C_EXIT
