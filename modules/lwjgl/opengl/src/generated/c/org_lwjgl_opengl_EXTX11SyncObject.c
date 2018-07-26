/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef intptr_t (APIENTRY *glImportSyncEXTPROC) (jint, intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTX11SyncObject_glImportSyncEXT(JNIEnv *__env, jclass clazz, jint external_sync_type, jlong external_sync, jint flags) {
    glImportSyncEXTPROC glImportSyncEXT = (glImportSyncEXTPROC)tlsGetFunction(1848);
    UNUSED_PARAM(clazz)
    return (jlong)glImportSyncEXT(external_sync_type, (intptr_t)external_sync, flags);
}

EXTERN_C_EXIT
