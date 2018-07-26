/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glInsertEventMarkerEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glPushGroupMarkerEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glPopGroupMarkerEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDebugMarker_nglInsertEventMarkerEXT(JNIEnv *__env, jclass clazz, jint length, jlong markerAddress) {
    glInsertEventMarkerEXTPROC glInsertEventMarkerEXT = (glInsertEventMarkerEXTPROC)tlsGetFunction(402);
    intptr_t marker = (intptr_t)markerAddress;
    UNUSED_PARAM(clazz)
    glInsertEventMarkerEXT(length, marker);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDebugMarker_nglPushGroupMarkerEXT(JNIEnv *__env, jclass clazz, jint length, jlong markerAddress) {
    glPushGroupMarkerEXTPROC glPushGroupMarkerEXT = (glPushGroupMarkerEXTPROC)tlsGetFunction(403);
    intptr_t marker = (intptr_t)markerAddress;
    UNUSED_PARAM(clazz)
    glPushGroupMarkerEXT(length, marker);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDebugMarker_glPopGroupMarkerEXT(JNIEnv *__env, jclass clazz) {
    glPopGroupMarkerEXTPROC glPopGroupMarkerEXT = (glPopGroupMarkerEXTPROC)tlsGetFunction(404);
    UNUSED_PARAM(clazz)
    glPopGroupMarkerEXT();
}

EXTERN_C_EXIT
