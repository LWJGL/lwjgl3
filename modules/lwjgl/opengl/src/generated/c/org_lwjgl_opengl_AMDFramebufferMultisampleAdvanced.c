/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleAdvancedAMDPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleAdvancedAMDPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDFramebufferMultisampleAdvanced_glRenderbufferStorageMultisampleAdvancedAMD(JNIEnv *__env, jclass clazz, jint target, jint samples, jint storageSamples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisampleAdvancedAMDPROC glRenderbufferStorageMultisampleAdvancedAMD = (glRenderbufferStorageMultisampleAdvancedAMDPROC)tlsGetFunction(1056);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisampleAdvancedAMD(target, samples, storageSamples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDFramebufferMultisampleAdvanced_glNamedRenderbufferStorageMultisampleAdvancedAMD(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint storageSamples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisampleAdvancedAMDPROC glNamedRenderbufferStorageMultisampleAdvancedAMD = (glNamedRenderbufferStorageMultisampleAdvancedAMDPROC)tlsGetFunction(1057);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisampleAdvancedAMD(renderbuffer, samples, storageSamples, internalformat, width, height);
}

EXTERN_C_EXIT
