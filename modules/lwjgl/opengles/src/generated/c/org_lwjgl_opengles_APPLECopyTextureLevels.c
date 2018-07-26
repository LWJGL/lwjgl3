/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glCopyTextureLevelsAPPLEPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLECopyTextureLevels_glCopyTextureLevelsAPPLE(JNIEnv *__env, jclass clazz, jint destinationTexture, jint sourceTexture, jint sourceBaseLevel, jint sourceLevelCount) {
    glCopyTextureLevelsAPPLEPROC glCopyTextureLevelsAPPLE = (glCopyTextureLevelsAPPLEPROC)tlsGetFunction(377);
    UNUSED_PARAM(clazz)
    glCopyTextureLevelsAPPLE(destinationTexture, sourceTexture, sourceBaseLevel, sourceLevelCount);
}

EXTERN_C_EXIT
