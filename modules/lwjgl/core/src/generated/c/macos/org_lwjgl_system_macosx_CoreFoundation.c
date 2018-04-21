/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "macOSLWJGL.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorDefault(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)kCFAllocatorDefault;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorSystemDefault(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)kCFAllocatorSystemDefault;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMalloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)kCFAllocatorMalloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMallocZone(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)kCFAllocatorMallocZone;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorNull(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)kCFAllocatorNull;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorUseContext(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)kCFAllocatorUseContext;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFRetain(JNIEnv *__env, jclass clazz, jlong cfAddress) {
    CFTypeRef cf = (CFTypeRef)(intptr_t)cfAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFRetain(cf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFRelease(JNIEnv *__env, jclass clazz, jlong cfAddress) {
    CFTypeRef cf = (CFTypeRef)(intptr_t)cfAddress;
    UNUSED_PARAMS(__env, clazz)
    CFRelease(cf);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFBundleCreate(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong bundleURLAddress) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    CFURLRef bundleURL = (CFURLRef)(intptr_t)bundleURLAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFBundleCreate(allocator, bundleURL);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetBundleWithIdentifier(JNIEnv *__env, jclass clazz, jlong bundleIDAddress) {
    CFStringRef bundleID = (CFStringRef)(intptr_t)bundleIDAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFBundleGetBundleWithIdentifier(bundleID);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetFunctionPointerForName(JNIEnv *__env, jclass clazz, jlong bundleAddress, jlong functionNameAddress) {
    CFBundleRef bundle = (CFBundleRef)(intptr_t)bundleAddress;
    CFStringRef functionName = (CFStringRef)(intptr_t)functionNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFBundleGetFunctionPointerForName(bundle, functionName);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong cStrAddress, jint encoding) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    char const *cStr = (char const *)(intptr_t)cStrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFStringCreateWithCString(allocator, cStr, (CFStringEncoding)encoding);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCStringNoCopy(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong cStrAddress, jint encoding, jlong contentsDeallocatorAddress) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    char const *cStr = (char const *)(intptr_t)cStrAddress;
    CFAllocatorRef contentsDeallocator = (CFAllocatorRef)(intptr_t)contentsDeallocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFStringCreateWithCStringNoCopy(allocator, cStr, (CFStringEncoding)encoding, contentsDeallocator);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFURLCreateWithFileSystemPath(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong filePathAddress, jlong pathStyle, jboolean isDirectory) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    CFStringRef filePath = (CFStringRef)(intptr_t)filePathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)CFURLCreateWithFileSystemPath(allocator, filePath, (CFURLPathStyle)pathStyle, (Boolean)isDirectory);
}

EXTERN_C_EXIT
