/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "macOSLWJGL.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorDefault(void) {
    return (jlong)(intptr_t)kCFAllocatorDefault;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorDefault(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorDefault();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorSystemDefault(void) {
    return (jlong)(intptr_t)kCFAllocatorSystemDefault;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorSystemDefault(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorSystemDefault();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMalloc(void) {
    return (jlong)(intptr_t)kCFAllocatorMalloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMalloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMalloc();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMallocZone(void) {
    return (jlong)(intptr_t)kCFAllocatorMallocZone;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMallocZone(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorMallocZone();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorNull(void) {
    return (jlong)(intptr_t)kCFAllocatorNull;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorNull(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorNull();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorUseContext(void) {
    return (jlong)(intptr_t)kCFAllocatorUseContext;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorUseContext(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_kCFAllocatorUseContext();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFRetain(jlong cfAddress) {
    CFTypeRef cf = (CFTypeRef)(intptr_t)cfAddress;
    return (jlong)(intptr_t)CFRetain(cf);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFRetain(JNIEnv *__env, jclass clazz, jlong cfAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFRetain(cfAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFRelease(jlong cfAddress) {
    CFTypeRef cf = (CFTypeRef)(intptr_t)cfAddress;
    CFRelease(cf);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFRelease(JNIEnv *__env, jclass clazz, jlong cfAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFRelease(cfAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFBundleCreate(jlong allocatorAddress, jlong bundleURLAddress) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    CFURLRef bundleURL = (CFURLRef)(intptr_t)bundleURLAddress;
    return (jlong)(intptr_t)CFBundleCreate(allocator, bundleURL);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFBundleCreate(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong bundleURLAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFBundleCreate(allocatorAddress, bundleURLAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetBundleWithIdentifier(jlong bundleIDAddress) {
    CFStringRef bundleID = (CFStringRef)(intptr_t)bundleIDAddress;
    return (jlong)(intptr_t)CFBundleGetBundleWithIdentifier(bundleID);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetBundleWithIdentifier(JNIEnv *__env, jclass clazz, jlong bundleIDAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetBundleWithIdentifier(bundleIDAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetFunctionPointerForName(jlong bundleAddress, jlong functionNameAddress) {
    CFBundleRef bundle = (CFBundleRef)(intptr_t)bundleAddress;
    CFStringRef functionName = (CFStringRef)(intptr_t)functionNameAddress;
    return (jlong)(intptr_t)CFBundleGetFunctionPointerForName(bundle, functionName);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetFunctionPointerForName(JNIEnv *__env, jclass clazz, jlong bundleAddress, jlong functionNameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFBundleGetFunctionPointerForName(bundleAddress, functionNameAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCString(jlong allocatorAddress, jlong cStrAddress, jint encoding) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    char const *cStr = (char const *)(intptr_t)cStrAddress;
    return (jlong)(intptr_t)CFStringCreateWithCString(allocator, cStr, (CFStringEncoding)encoding);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong cStrAddress, jint encoding) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCString(allocatorAddress, cStrAddress, encoding);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCStringNoCopy(jlong allocatorAddress, jlong cStrAddress, jint encoding, jlong contentsDeallocatorAddress) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    char const *cStr = (char const *)(intptr_t)cStrAddress;
    CFAllocatorRef contentsDeallocator = (CFAllocatorRef)(intptr_t)contentsDeallocatorAddress;
    return (jlong)(intptr_t)CFStringCreateWithCStringNoCopy(allocator, cStr, (CFStringEncoding)encoding, contentsDeallocator);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCStringNoCopy(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong cStrAddress, jint encoding, jlong contentsDeallocatorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFStringCreateWithCStringNoCopy(allocatorAddress, cStrAddress, encoding, contentsDeallocatorAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFURLCreateWithFileSystemPath(jlong allocatorAddress, jlong filePathAddress, jlong pathStyle, jboolean isDirectory) {
    CFAllocatorRef allocator = (CFAllocatorRef)(intptr_t)allocatorAddress;
    CFStringRef filePath = (CFStringRef)(intptr_t)filePathAddress;
    return (jlong)(intptr_t)CFURLCreateWithFileSystemPath(allocator, filePath, (CFURLPathStyle)pathStyle, (Boolean)isDirectory);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreFoundation_nCFURLCreateWithFileSystemPath(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong filePathAddress, jlong pathStyle, jboolean isDirectory) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_macosx_CoreFoundation_nCFURLCreateWithFileSystemPath(allocatorAddress, filePathAddress, pathStyle, isDirectory);
}

EXTERN_C_EXIT
