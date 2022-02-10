/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glEGLImageTargetTexture2DOESPROC) (jint, uintptr_t);
typedef void (APIENTRY *glEGLImageTargetRenderbufferStorageOESPROC) (jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESEGLImage_nglEGLImageTargetTexture2DOES(JNIEnv *__env, jclass clazz, jint target, jlong imageAddress) {
    glEGLImageTargetTexture2DOESPROC glEGLImageTargetTexture2DOES = (glEGLImageTargetTexture2DOESPROC)tlsGetFunction(796);
    uintptr_t image = (uintptr_t)imageAddress;
    UNUSED_PARAM(clazz)
    glEGLImageTargetTexture2DOES(target, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESEGLImage_nglEGLImageTargetRenderbufferStorageOES(JNIEnv *__env, jclass clazz, jint target, jlong imageAddress) {
    glEGLImageTargetRenderbufferStorageOESPROC glEGLImageTargetRenderbufferStorageOES = (glEGLImageTargetRenderbufferStorageOESPROC)tlsGetFunction(797);
    uintptr_t image = (uintptr_t)imageAddress;
    UNUSED_PARAM(clazz)
    glEGLImageTargetRenderbufferStorageOES(target, image);
}

EXTERN_C_EXIT
