/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glElementPointerAPPLEPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDrawElementArrayAPPLEPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawRangeElementArrayAPPLEPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glMultiDrawElementArrayAPPLEPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glMultiDrawRangeElementArrayAPPLEPROC) (jint, jint, jint, uintptr_t, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEElementArray_nglElementPointerAPPLE(JNIEnv *__env, jclass clazz, jint type, jlong pointerAddress) {
    glElementPointerAPPLEPROC glElementPointerAPPLE = (glElementPointerAPPLEPROC)tlsGetFunction(1111);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glElementPointerAPPLE(type, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEElementArray_glDrawElementArrayAPPLE(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count) {
    glDrawElementArrayAPPLEPROC glDrawElementArrayAPPLE = (glDrawElementArrayAPPLEPROC)tlsGetFunction(1112);
    UNUSED_PARAM(clazz)
    glDrawElementArrayAPPLE(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEElementArray_glDrawRangeElementArrayAPPLE(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint first, jint count) {
    glDrawRangeElementArrayAPPLEPROC glDrawRangeElementArrayAPPLE = (glDrawRangeElementArrayAPPLEPROC)tlsGetFunction(1113);
    UNUSED_PARAM(clazz)
    glDrawRangeElementArrayAPPLE(mode, start, end, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEElementArray_nglMultiDrawElementArrayAPPLE__IJJI(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint primcount) {
    glMultiDrawElementArrayAPPLEPROC glMultiDrawElementArrayAPPLE = (glMultiDrawElementArrayAPPLEPROC)tlsGetFunction(1114);
    uintptr_t first = (uintptr_t)firstAddress;
    uintptr_t count = (uintptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementArrayAPPLE(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEElementArray_nglMultiDrawRangeElementArrayAPPLE__IIIJJI(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jlong firstAddress, jlong countAddress, jint primcount) {
    glMultiDrawRangeElementArrayAPPLEPROC glMultiDrawRangeElementArrayAPPLE = (glMultiDrawRangeElementArrayAPPLEPROC)tlsGetFunction(1115);
    uintptr_t first = (uintptr_t)firstAddress;
    uintptr_t count = (uintptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawRangeElementArrayAPPLE(mode, start, end, first, count, primcount);
}

EXTERN_C_EXIT
