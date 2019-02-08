/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "tinyfiledialogs.h"
#ifndef LWJGL_WINDOWS
    static int tinyfd_winUtf8;
#endif

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1version(void) {
    return (jlong)(intptr_t)tinyfd_version;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1version(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1version();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1needs(void) {
    return (jlong)(intptr_t)tinyfd_needs;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1needs(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1needs();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1verbose(void) {
    return (jlong)(intptr_t)&tinyfd_verbose;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1verbose(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1verbose();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1silent(void) {
    return (jlong)(intptr_t)&tinyfd_silent;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1silent(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1silent();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1winUtf8(void) {
    return (jlong)(intptr_t)&tinyfd_winUtf8;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1winUtf8(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1winUtf8();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1forceConsole(void) {
    return (jlong)(intptr_t)&tinyfd_forceConsole;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1forceConsole(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1forceConsole();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1response(void) {
    return (jlong)(intptr_t)tinyfd_response;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1response(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1response();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_tinyfd_1beep(void) {
    tinyfd_beep();
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_tinyfd_1beep(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_tinyfd_1beep();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1notifyPopup(jlong aTitleAddress, jlong aMessageAddress, jlong aIconTypeAddress) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aMessage = (char const *)(intptr_t)aMessageAddress;
    char const *aIconType = (char const *)(intptr_t)aIconTypeAddress;
    return (jint)tinyfd_notifyPopup(aTitle, aMessage, aIconType);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1notifyPopup(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aIconTypeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1notifyPopup(aTitleAddress, aMessageAddress, aIconTypeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1messageBox(jlong aTitleAddress, jlong aMessageAddress, jlong aDialogTypeAddress, jlong aIconTypeAddress, jint aDefaultButton) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aMessage = (char const *)(intptr_t)aMessageAddress;
    char const *aDialogType = (char const *)(intptr_t)aDialogTypeAddress;
    char const *aIconType = (char const *)(intptr_t)aIconTypeAddress;
    return (jint)tinyfd_messageBox(aTitle, aMessage, aDialogType, aIconType, aDefaultButton);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1messageBox(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aDialogTypeAddress, jlong aIconTypeAddress, jint aDefaultButton) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1messageBox(aTitleAddress, aMessageAddress, aDialogTypeAddress, aIconTypeAddress, aDefaultButton);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1inputBox(jlong aTitleAddress, jlong aMessageAddress, jlong aDefaultInputAddress) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aMessage = (char const *)(intptr_t)aMessageAddress;
    char const *aDefaultInput = (char const *)(intptr_t)aDefaultInputAddress;
    return (jlong)(intptr_t)tinyfd_inputBox(aTitle, aMessage, aDefaultInput);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1inputBox(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aDefaultInputAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1inputBox(aTitleAddress, aMessageAddress, aDefaultInputAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1saveFileDialog(jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aDefaultPathAndFile = (char const *)(intptr_t)aDefaultPathAndFileAddress;
    char const * const *aFilterPatterns = (char const * const *)(intptr_t)aFilterPatternsAddress;
    char const *aSingleFilterDescription = (char const *)(intptr_t)aSingleFilterDescriptionAddress;
    return (jlong)(intptr_t)tinyfd_saveFileDialog(aTitle, aDefaultPathAndFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1saveFileDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1saveFileDialog(aTitleAddress, aDefaultPathAndFileAddress, aNumOfFilterPatterns, aFilterPatternsAddress, aSingleFilterDescriptionAddress);
}

JNIEXPORT_CRITICAL jlong JNICALL CRITICAL(org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1openFileDialog)(jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress, jint aAllowMultipleSelects) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aDefaultPathAndFile = (char const *)(intptr_t)aDefaultPathAndFileAddress;
    char const * const *aFilterPatterns = (char const * const *)(intptr_t)aFilterPatternsAddress;
    char const *aSingleFilterDescription = (char const *)(intptr_t)aSingleFilterDescriptionAddress;
    return (jlong)(intptr_t)tinyfd_openFileDialog(aTitle, aDefaultPathAndFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1openFileDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress, jint aAllowMultipleSelects) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1openFileDialog)(aTitleAddress, aDefaultPathAndFileAddress, aNumOfFilterPatterns, aFilterPatternsAddress, aSingleFilterDescriptionAddress, aAllowMultipleSelects);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1selectFolderDialog(jlong aTitleAddress, jlong aDefaultPathAddress) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aDefaultPath = (char const *)(intptr_t)aDefaultPathAddress;
    return (jlong)(intptr_t)tinyfd_selectFolderDialog(aTitle, aDefaultPath);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1selectFolderDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1selectFolderDialog(aTitleAddress, aDefaultPathAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1colorChooser(jlong aTitleAddress, jlong aDefaultHexRGBAddress, jlong aDefaultRGBAddress, jlong aoResultRGBAddress) {
    char const *aTitle = (char const *)(intptr_t)aTitleAddress;
    char const *aDefaultHexRGB = (char const *)(intptr_t)aDefaultHexRGBAddress;
    unsigned char *aDefaultRGB = (unsigned char *)(intptr_t)aDefaultRGBAddress;
    unsigned char *aoResultRGB = (unsigned char *)(intptr_t)aoResultRGBAddress;
    return (jlong)(intptr_t)tinyfd_colorChooser(aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1colorChooser(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultHexRGBAddress, jlong aDefaultRGBAddress, jlong aoResultRGBAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1colorChooser(aTitleAddress, aDefaultHexRGBAddress, aDefaultRGBAddress, aoResultRGBAddress);
}

EXTERN_C_EXIT
