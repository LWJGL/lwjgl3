/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexImage3DOESPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTexSubImage3DOESPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyTexSubImage3DOESPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCompressedTexImage3DOESPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTexSubImage3DOESPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glFramebufferTexture3DOESPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglTexImage3DOES__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage3DOESPROC glTexImage3DOES = (glTexImage3DOESPROC)tlsGetFunction(807);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglTexSubImage3DOES__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage3DOESPROC glTexSubImage3DOES = (glTexSubImage3DOESPROC)tlsGetFunction(808);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_glCopyTexSubImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTexSubImage3DOESPROC glCopyTexSubImage3DOES = (glCopyTexSubImage3DOESPROC)tlsGetFunction(809);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglCompressedTexImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTexImage3DOESPROC glCompressedTexImage3DOES = (glCompressedTexImage3DOESPROC)tlsGetFunction(810);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_nglCompressedTexSubImage3DOES(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTexSubImage3DOESPROC glCompressedTexSubImage3DOES = (glCompressedTexSubImage3DOESPROC)tlsGetFunction(811);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTexture3D_glFramebufferTexture3DOES(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint zoffset) {
    glFramebufferTexture3DOESPROC glFramebufferTexture3DOES = (glFramebufferTexture3DOESPROC)tlsGetFunction(812);
    UNUSED_PARAM(clazz)
    glFramebufferTexture3DOES(target, attachment, textarget, texture, level, zoffset);
}

EXTERN_C_EXIT
