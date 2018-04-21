/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexStorage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTexStorage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureStorage2DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureStorage3DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorageMultisample_glTexStorage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTexStorage2DMultisamplePROC glTexStorage2DMultisample = (glTexStorage2DMultisamplePROC)tlsGetFunction(904);
    UNUSED_PARAM(clazz)
    glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorageMultisample_glTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)tlsGetFunction(905);
    UNUSED_PARAM(clazz)
    glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorageMultisample_glTextureStorage2DMultisampleEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTextureStorage2DMultisampleEXTPROC glTextureStorage2DMultisampleEXT = (glTextureStorage2DMultisampleEXTPROC)tlsGetFunction(1342);
    UNUSED_PARAM(clazz)
    glTextureStorage2DMultisampleEXT(texture, target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorageMultisample_glTextureStorage3DMultisampleEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTextureStorage3DMultisampleEXTPROC glTextureStorage3DMultisampleEXT = (glTextureStorage3DMultisampleEXTPROC)tlsGetFunction(1343);
    UNUSED_PARAM(clazz)
    glTextureStorage3DMultisampleEXT(texture, target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
