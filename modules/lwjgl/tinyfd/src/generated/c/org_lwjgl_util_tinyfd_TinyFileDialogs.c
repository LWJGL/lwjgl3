/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "tinyfiledialogs.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1getGlobalChar(JNIEnv *__env, jclass clazz, jlong aCharVariableNameAddress) {
    char const *aCharVariableName = (char const *)(uintptr_t)aCharVariableNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)tinyfd_getGlobalChar(aCharVariableName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1getGlobalInt(JNIEnv *__env, jclass clazz, jlong aIntVariableNameAddress) {
    char const *aIntVariableName = (char const *)(uintptr_t)aIntVariableNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)tinyfd_getGlobalInt(aIntVariableName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1setGlobalInt(JNIEnv *__env, jclass clazz, jlong aIntVariableNameAddress, jint aValue) {
    char const *aIntVariableName = (char const *)(uintptr_t)aIntVariableNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)tinyfd_setGlobalInt(aIntVariableName, aValue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_tinyfd_1beep(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    tinyfd_beep();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1notifyPopup(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aIconTypeAddress) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aMessage = (char const *)(uintptr_t)aMessageAddress;
    char const *aIconType = (char const *)(uintptr_t)aIconTypeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)tinyfd_notifyPopup(aTitle, aMessage, aIconType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1messageBox(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aDialogTypeAddress, jlong aIconTypeAddress, jint aDefaultButton) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aMessage = (char const *)(uintptr_t)aMessageAddress;
    char const *aDialogType = (char const *)(uintptr_t)aDialogTypeAddress;
    char const *aIconType = (char const *)(uintptr_t)aIconTypeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)tinyfd_messageBox(aTitle, aMessage, aDialogType, aIconType, aDefaultButton);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1inputBox(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aMessageAddress, jlong aDefaultInputAddress) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aMessage = (char const *)(uintptr_t)aMessageAddress;
    char const *aDefaultInput = (char const *)(uintptr_t)aDefaultInputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)tinyfd_inputBox(aTitle, aMessage, aDefaultInput);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1saveFileDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aDefaultPathAndFile = (char const *)(uintptr_t)aDefaultPathAndFileAddress;
    char const * const *aFilterPatterns = (char const * const *)(uintptr_t)aFilterPatternsAddress;
    char const *aSingleFilterDescription = (char const *)(uintptr_t)aSingleFilterDescriptionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)tinyfd_saveFileDialog(aTitle, aDefaultPathAndFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1openFileDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAndFileAddress, jint aNumOfFilterPatterns, jlong aFilterPatternsAddress, jlong aSingleFilterDescriptionAddress, jint aAllowMultipleSelects) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aDefaultPathAndFile = (char const *)(uintptr_t)aDefaultPathAndFileAddress;
    char const * const *aFilterPatterns = (char const * const *)(uintptr_t)aFilterPatternsAddress;
    char const *aSingleFilterDescription = (char const *)(uintptr_t)aSingleFilterDescriptionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)tinyfd_openFileDialog(aTitle, aDefaultPathAndFile, aNumOfFilterPatterns, aFilterPatterns, aSingleFilterDescription, aAllowMultipleSelects);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1selectFolderDialog(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultPathAddress) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aDefaultPath = (char const *)(uintptr_t)aDefaultPathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)tinyfd_selectFolderDialog(aTitle, aDefaultPath);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyfd_TinyFileDialogs_ntinyfd_1colorChooser(JNIEnv *__env, jclass clazz, jlong aTitleAddress, jlong aDefaultHexRGBAddress, jlong aDefaultRGBAddress, jlong aoResultRGBAddress) {
    char const *aTitle = (char const *)(uintptr_t)aTitleAddress;
    char const *aDefaultHexRGB = (char const *)(uintptr_t)aDefaultHexRGBAddress;
    unsigned char *aDefaultRGB = (unsigned char *)(uintptr_t)aDefaultRGBAddress;
    unsigned char *aoResultRGB = (unsigned char *)(uintptr_t)aoResultRGBAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)tinyfd_colorChooser(aTitle, aDefaultHexRGB, aDefaultRGB, aoResultRGB);
}

EXTERN_C_EXIT
