/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexStorageAttribs2DEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTexStorageAttribs3DEXTPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorageCompression_nglTexStorageAttribs2DEXT__IIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jlong attrib_listAddress) {
    glTexStorageAttribs2DEXTPROC glTexStorageAttribs2DEXT = (glTexStorageAttribs2DEXTPROC)tlsGetFunction(555);
    uintptr_t attrib_list = (uintptr_t)attrib_listAddress;
    UNUSED_PARAM(clazz)
    glTexStorageAttribs2DEXT(target, levels, internalformat, width, height, attrib_list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureStorageCompression_nglTexStorageAttribs3DEXT__IIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth, jlong attrib_listAddress) {
    glTexStorageAttribs3DEXTPROC glTexStorageAttribs3DEXT = (glTexStorageAttribs3DEXTPROC)tlsGetFunction(556);
    uintptr_t attrib_list = (uintptr_t)attrib_listAddress;
    UNUSED_PARAM(clazz)
    glTexStorageAttribs3DEXT(target, levels, internalformat, width, height, depth, attrib_list);
}

EXTERN_C_EXIT
