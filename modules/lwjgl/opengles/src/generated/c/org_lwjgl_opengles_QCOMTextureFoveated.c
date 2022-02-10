/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTextureFoveationParametersQCOMPROC) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMTextureFoveated_glTextureFoveationParametersQCOM(JNIEnv *__env, jclass clazz, jint texture, jint layer, jint focalPoint, jfloat focalX, jfloat focalY, jfloat gainX, jfloat gainY, jfloat foveaArea) {
    glTextureFoveationParametersQCOMPROC glTextureFoveationParametersQCOM = (glTextureFoveationParametersQCOMPROC)tlsGetFunction(863);
    UNUSED_PARAM(clazz)
    glTextureFoveationParametersQCOM(texture, layer, focalPoint, focalX, focalY, gainX, gainY, foveaArea);
}

EXTERN_C_EXIT
