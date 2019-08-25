/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <CoreGraphics/CoreGraphics.h>

typedef intptr_t (*CGEventCreateMouseEventPROC) (intptr_t, jint, CGPoint, jint);
typedef CGPoint (*CGEventGetLocationPROC) (intptr_t);
typedef CGPoint (*CGEventGetUnflippedLocationPROC) (intptr_t);
typedef void (*CGEventSetLocationPROC) (intptr_t, CGPoint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventCreateMouseEvent(JNIEnv *__env, jclass clazz, jlong sourceAddress, jint mouseType, jlong mouseCursorPositionAddress, jint mouseButton, jlong __functionAddress) {
    CGEventCreateMouseEventPROC CGEventCreateMouseEvent = (CGEventCreateMouseEventPROC)(intptr_t)__functionAddress;
    intptr_t source = (intptr_t)sourceAddress;
    CGPoint *mouseCursorPosition = (CGPoint *)(intptr_t)mouseCursorPositionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)CGEventCreateMouseEvent(source, mouseType, *mouseCursorPosition, mouseButton);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventGetLocation(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong __functionAddress, jlong __result) {
    CGEventGetLocationPROC CGEventGetLocation = (CGEventGetLocationPROC)(intptr_t)__functionAddress;
    intptr_t event = (intptr_t)eventAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CGPoint*)(intptr_t)__result) = CGEventGetLocation(event);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventGetUnflippedLocation(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong __functionAddress, jlong __result) {
    CGEventGetUnflippedLocationPROC CGEventGetUnflippedLocation = (CGEventGetUnflippedLocationPROC)(intptr_t)__functionAddress;
    intptr_t event = (intptr_t)eventAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CGPoint*)(intptr_t)__result) = CGEventGetUnflippedLocation(event);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventSetLocation(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong locationAddress, jlong __functionAddress) {
    CGEventSetLocationPROC CGEventSetLocation = (CGEventSetLocationPROC)(intptr_t)__functionAddress;
    intptr_t event = (intptr_t)eventAddress;
    CGPoint *location = (CGPoint *)(intptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    CGEventSetLocation(event, *location);
}

EXTERN_C_EXIT
