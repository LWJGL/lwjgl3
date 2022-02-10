/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glUniformMatrix2x3fvNVPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix3x2fvNVPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix2x4fvNVPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix4x2fvNVPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix3x4fvNVPROC) (jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUniformMatrix4x3fvNVPROC) (jint, jint, jboolean, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix2x3fvNV__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2x3fvNVPROC glUniformMatrix2x3fvNV = (glUniformMatrix2x3fvNVPROC)tlsGetFunction(690);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2x3fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix3x2fvNV__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3x2fvNVPROC glUniformMatrix3x2fvNV = (glUniformMatrix3x2fvNVPROC)tlsGetFunction(691);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3x2fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix2x4fvNV__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2x4fvNVPROC glUniformMatrix2x4fvNV = (glUniformMatrix2x4fvNVPROC)tlsGetFunction(692);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2x4fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix4x2fvNV__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4x2fvNVPROC glUniformMatrix4x2fvNV = (glUniformMatrix4x2fvNVPROC)tlsGetFunction(693);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4x2fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix3x4fvNV__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3x4fvNVPROC glUniformMatrix3x4fvNV = (glUniformMatrix3x4fvNVPROC)tlsGetFunction(694);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3x4fvNV(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVNonSquareMatrices_nglUniformMatrix4x3fvNV__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4x3fvNVPROC glUniformMatrix4x3fvNV = (glUniformMatrix4x3fvNVPROC)tlsGetFunction(695);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4x3fvNV(location, count, transpose, value);
}

EXTERN_C_EXIT
