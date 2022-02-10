/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexStorage3DMultisampleOESPROC) (jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureStorageMultisample2DArray_glTexStorage3DMultisampleOES(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexStorage3DMultisampleOESPROC glTexStorage3DMultisampleOES = (glTexStorage3DMultisampleOESPROC)tlsGetFunction(823);
    UNUSED_PARAM(clazz)
    glTexStorage3DMultisampleOES(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
