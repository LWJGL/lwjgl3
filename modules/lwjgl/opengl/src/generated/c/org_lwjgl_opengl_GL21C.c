/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glUniformMatrix2x3fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix3x2fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix2x4fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix4x2fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix3x4fvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix4x3fvPROC) (jint, jint, jboolean, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21C_nglUniformMatrix2x3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2x3fvPROC glUniformMatrix2x3fv = (glUniformMatrix2x3fvPROC)tlsGetFunction(545);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2x3fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21C_nglUniformMatrix3x2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3x2fvPROC glUniformMatrix3x2fv = (glUniformMatrix3x2fvPROC)tlsGetFunction(546);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21C_nglUniformMatrix2x4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2x4fvPROC glUniformMatrix2x4fv = (glUniformMatrix2x4fvPROC)tlsGetFunction(547);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21C_nglUniformMatrix4x2fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4x2fvPROC glUniformMatrix4x2fv = (glUniformMatrix4x2fvPROC)tlsGetFunction(548);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4x2fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21C_nglUniformMatrix3x4fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3x4fvPROC glUniformMatrix3x4fv = (glUniformMatrix3x4fvPROC)tlsGetFunction(549);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3x4fv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL21C_nglUniformMatrix4x3fv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4x3fvPROC glUniformMatrix4x3fv = (glUniformMatrix4x3fvPROC)tlsGetFunction(550);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4x3fv(location, count, transpose, value);
}

EXTERN_C_EXIT
