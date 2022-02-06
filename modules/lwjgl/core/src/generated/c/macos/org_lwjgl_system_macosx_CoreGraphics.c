/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <CoreGraphics/CoreGraphics.h>

typedef uintptr_t (*CGEventCreateMouseEventPROC) (uintptr_t, jint, CGPoint, jint);
typedef CGPoint (*CGEventGetLocationPROC) (uintptr_t);
typedef CGPoint (*CGEventGetUnflippedLocationPROC) (uintptr_t);
typedef void (*CGEventSetLocationPROC) (uintptr_t, CGPoint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventCreateMouseEvent(JNIEnv *__env, jclass clazz, jlong sourceAddress, jint mouseType, jlong mouseCursorPositionAddress, jint mouseButton, jlong __functionAddress) {
    CGEventCreateMouseEventPROC CGEventCreateMouseEvent = (CGEventCreateMouseEventPROC)(uintptr_t)__functionAddress;
    uintptr_t source = (uintptr_t)sourceAddress;
    CGPoint *mouseCursorPosition = (CGPoint *)(uintptr_t)mouseCursorPositionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)CGEventCreateMouseEvent(source, mouseType, *mouseCursorPosition, mouseButton);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventGetLocation(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong __functionAddress, jlong __result) {
    CGEventGetLocationPROC CGEventGetLocation = (CGEventGetLocationPROC)(uintptr_t)__functionAddress;
    uintptr_t event = (uintptr_t)eventAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CGPoint*)(uintptr_t)__result) = CGEventGetLocation(event);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventGetUnflippedLocation(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong __functionAddress, jlong __result) {
    CGEventGetUnflippedLocationPROC CGEventGetUnflippedLocation = (CGEventGetUnflippedLocationPROC)(uintptr_t)__functionAddress;
    uintptr_t event = (uintptr_t)eventAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CGPoint*)(uintptr_t)__result) = CGEventGetUnflippedLocation(event);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreGraphics_nCGEventSetLocation(JNIEnv *__env, jclass clazz, jlong eventAddress, jlong locationAddress, jlong __functionAddress) {
    CGEventSetLocationPROC CGEventSetLocation = (CGEventSetLocationPROC)(uintptr_t)__functionAddress;
    uintptr_t event = (uintptr_t)eventAddress;
    CGPoint *location = (CGPoint *)(uintptr_t)locationAddress;
    UNUSED_PARAMS(__env, clazz)
    CGEventSetLocation(event, *location);
}

EXTERN_C_EXIT
