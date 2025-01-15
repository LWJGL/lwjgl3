/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokePB__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jbyte (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeC__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeC__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePC__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCC__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCC__SZJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, jboolean))(uintptr_t)__functionAddress)((uint16_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePC__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeJC__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCUC__SBJ(JNIEnv *__env, jclass clazz, jshort param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint8_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCC__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCC__SSZJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, jboolean))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCC__IJSJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, uintptr_t, uint16_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCC__JISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeUPC__BJZJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint8_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCJC__IZSIJJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jshort param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, jboolean, uint16_t, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCPCC__SJSJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCPPC__SJJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePPCC__JJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCJC__SSIJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, jint, jlong))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCCC__JSSIIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uint16_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCCCC__SSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePJUPC__JJBJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jbyte param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, jlong, uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint8_t)param2, (uintptr_t)param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCJPC__SZSIJJJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jshort param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, jboolean, uint16_t, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, param1, (uint16_t)param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCCCCC__JSSSSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, (uint16_t)param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCCJPC__SSSZIJJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jboolean param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, uint16_t, jboolean, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCCJPC__SSZSIJJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jboolean param2, jshort param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, jboolean, uint16_t, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, (uint16_t)param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokeD__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokeD__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokePD__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokePD__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokePD__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokePPD__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokeF__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokeF__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__FJJ(JNIEnv *__env, jclass clazz, jfloat param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (jfloat, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__FFJJ(JNIEnv *__env, jclass clazz, jfloat param0, jfloat param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__IJFJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (jint, uintptr_t, jfloat))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__JFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePPF__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePPF__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePPF__JFJIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, jfloat, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IZJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jboolean))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeJI__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jlong))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCI__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JZJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCI__ISZJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uint16_t, jboolean))(uintptr_t)__functionAddress)(param0, (uint16_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPI__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePCI__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePJI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePJI__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNI__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (long)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNI__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JZJJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jboolean, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIJZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIZJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jboolean param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__IJIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JIIIIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__SJBJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uint16_t, uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uint8_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeJPPI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePCPI__JSJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNPI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPCI__JJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPJI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNPI__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNPI__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNI__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (long)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNI__JJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, long, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJJIZFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jboolean param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIIIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JIIJIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jint param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNPPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNNI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, long, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (long)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPNI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (long)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePUUUI__JBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jbyte param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint8_t)param2, (uint8_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPI__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, jint, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2, (long)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPNI__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (long)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JIIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JIIJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJIIIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jint param5, jint param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JIIJIJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6, jint param7, jint param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNNPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, long, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (long)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPNNI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, long, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (long)param3, (long)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPNI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (long)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPUUUI__JJBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jbyte param2, jbyte param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint8_t)param2, (uint8_t)param3, (uint8_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePUUUUI__JBBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jbyte param2, jbyte param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint8_t)param2, (uint8_t)param3, (uint8_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePJPPNI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jlong, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (long)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNPPI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (long)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNPPI__JJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, long, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPNJI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, long, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (long)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPNNI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, long, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (long)param4, (long)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPNPI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (long)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPNI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (long)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPNI__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (long)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNPPPI__JIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, long, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (long)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJJIJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__JJJIIIFJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jfloat param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, jfloat, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPI__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPUUUUI__JJBBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jbyte param2, jbyte param3, jbyte param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint8_t)param2, (uint8_t)param3, (uint8_t)param4, (uint8_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePJJJJPI__JJJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jlong, jlong, jlong, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPNPPPI__JIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, long, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (long)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPI__JIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPI__JJJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPPPI__JJJIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, long, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPI__IIJJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPI__JIIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPI__JIIJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPI__JJJIJFFJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jfloat param5, jfloat param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jfloat, jfloat, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPI__JJJIIJJIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jint param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10, param11);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JIIJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJ__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJ__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJ__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJ__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJ__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJJ__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPJ__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJJ__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (jint, uintptr_t, jlong))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJJ__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJJ__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPJ__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeNN__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (long))(uintptr_t)__functionAddress)((long)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePN__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePN__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeNNN__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (long, long))(uintptr_t)__functionAddress)((long)param0, (long)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPN__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeNNNN__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (long, long, long))(uintptr_t)__functionAddress)((long)param0, (long)param1, (long)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNPN__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNPN__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, long, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPNN__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, jint, jint, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (long)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNPNN__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, long, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, (long)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNPNPN__JJIIIIIIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jlong param9, jlong param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, long, jint, jint, jint, jint, jint, jint, jint, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9, (long)param10, (uintptr_t)param11);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCP__SJ(JNIEnv *__env, jclass clazz, jshort param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJP__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jlong))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JDJ(JNIEnv *__env, jclass clazz, jlong param0, jdouble param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jdouble))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JZJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__IZJJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__IIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__IIIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JFIFIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jint param2, jfloat param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jfloat, jint, jfloat, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCCP__SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCPP__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJPP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jlong, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePUP__JBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCPP__ISJJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, uint16_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePCP__JSZJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uint16_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJP__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJP__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJP__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JZZJJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jboolean param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jboolean, jboolean, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJP__JIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__IIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePUP__JIBIZZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jbyte param2, jint param3, jboolean param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uint8_t, jint, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint8_t)param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__IIIIJIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCCPP__SSJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJJP__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPJP__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPUP__JJBJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint8_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__IJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJZJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jboolean, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPUP__JJIBJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uint8_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__IIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJPPP__IIIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JIJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJIIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__IIIJJIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJIIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, param5, param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePBPPP__JBJJJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jbyte, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNNPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, long, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPJPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPNNP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, long, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (long)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPJP__IJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, uintptr_t, uintptr_t, uintptr_t, jlong))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPJP__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJPPP__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJPPP__JJIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jlong, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPJP__JJJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jlong, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__IIIJJJIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJPJPP__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jlong, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNNNPP__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, long, long, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, (long)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPBPPP__JJBJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jbyte param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jbyte, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCCCUJP__SSSBIJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jbyte param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t, uint16_t, uint16_t, uint8_t, jint, jlong))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint8_t)param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPNP__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (long)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPJPPP__JJJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJJJIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jint param6, jint param7, jint param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, param8);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPJJPPP__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jlong, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePSSCCPP__JSSSSJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jshort, jshort, uint16_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uint16_t)param3, (uint16_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJIJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJIJIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jint param6, jlong param7, jint param8, jint param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPP__JJJJJIJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jint param8, jint param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7, param8, param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPP__JJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPP__JJJJIJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jint param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPP__JJJJJIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPP__JJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPP__JJJJJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPP__JJJJIJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPJJPPP__JJJJIJIJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jint param6, jlong param7, jint param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jint, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, param6, param7, param8, (uintptr_t)param9, (uintptr_t)param10);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJJPP__JJJJJIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jint, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, param8, param9, (uintptr_t)param10);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJPPP__JJJJJIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPP__JJJJJIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJPPP__JIJJJJIIJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jint param7, jlong param8, jint param9, jlong param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, param7, param8, param9, (uintptr_t)param10, (uintptr_t)param11);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJPPP__JIJJJJIIJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jint param7, jlong param8, jint param9, jint param10, jlong param11, jlong param12, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, param7, param8, param9, param10, (uintptr_t)param11, (uintptr_t)param12);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPP__JJJJJJJIJIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong param8, jint param9, jint param10, jint param11, jint param12, jint param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, param10, param11, param12, param13);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJJJPP__JJJJJIJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jlong, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, param8, param9, (uintptr_t)param10);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPPP__JJJJIJJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, param9, (uintptr_t)param10);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPPP__JJJJJJJIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jint param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10, param11);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJPPPP__JJJJJIJIIJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jint param8, jlong param9, jint param10, jint param11, jlong param12, jlong param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jint, jint, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, param8, (uintptr_t)param9, param10, param11, (uintptr_t)param12, (uintptr_t)param13);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPPPP__JJJJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPPPP__JJJJJJJIJIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong param11, jint param12, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10, (uintptr_t)param11, param12);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJPPPPPP__JJJJJIJIIJJIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jint param8, jlong param9, jlong param10, jint param11, jint param12, jlong param13, jlong param14, jlong param15, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, param8, (uintptr_t)param9, (uintptr_t)param10, param11, param12, (uintptr_t)param13, (uintptr_t)param14, (uintptr_t)param15);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPPPPPP__JIJJJIJJIJJIIIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jint param11, jint param12, jint param13, jint param14, jlong param15, jlong param16, jlong param17, jlong param18, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, jint, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)param9, (uintptr_t)param10, param11, param12, param13, param14, (uintptr_t)param15, (uintptr_t)param16, (uintptr_t)param17, (uintptr_t)param18);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPJJPPPPPPP__JJJJJIJIJIJJIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong param11, jint param12, jlong param13, jlong param14, jlong param15, jlong param16, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jlong, jint, jlong, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7, param8, param9, (uintptr_t)param10, (uintptr_t)param11, param12, (uintptr_t)param13, (uintptr_t)param14, (uintptr_t)param15, (uintptr_t)param16);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePS__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokeU__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)((uint8_t (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokePU__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)((uint8_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokeUPU__BJJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)((uint8_t (*) (uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__DJ(JNIEnv *__env, jclass clazz, jdouble param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jdouble))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__FJ(JNIEnv *__env, jclass clazz, jfloat param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jfloat))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jfloat))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IZJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jboolean))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IFFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIDDDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdouble param2, jdouble param3, jdouble param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIFFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SJ(JNIEnv *__env, jclass clazz, jshort param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJV__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jlong))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t))(uintptr_t)__functionAddress)((uint8_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SIJ(JNIEnv *__env, jclass clazz, jshort param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jint))(uintptr_t)__functionAddress)((uint16_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SZJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jboolean))(uintptr_t)__functionAddress)((uint16_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJV__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jlong))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJV__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jlong, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JZJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BIJ(JNIEnv *__env, jclass clazz, jbyte param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, jint))(uintptr_t)__functionAddress)((uint8_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BZJ(JNIEnv *__env, jclass clazz, jbyte param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, jboolean))(uintptr_t)__functionAddress)((uint8_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SIIJ(JNIEnv *__env, jclass clazz, jshort param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jint, jint))(uintptr_t)__functionAddress)((uint16_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJV__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IJZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JDDJ(JNIEnv *__env, jclass clazz, jlong param0, jdouble param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jdouble, jdouble))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIDJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jdouble))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JFFIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat, jfloat, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIDJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jdouble param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jdouble))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIJIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BFFFFJ(JNIEnv *__env, jclass clazz, jbyte param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uint8_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIJZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIDDDJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jdouble param3, jdouble param4, jdouble param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIIIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCV__SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPV__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUV__JBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPV__BJJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPV__SIJJ(JNIEnv *__env, jclass clazz, jshort param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPV__SJIJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint16_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSZJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, jlong))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCV__BSIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePBV__JIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jbyte))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JIISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uint16_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSIIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__IIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__IJJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIJZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePSV__JIISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUV__JIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uint8_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCV__BSIIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPV__BJIIJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__IIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JFJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__IIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__IIIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIIIJZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jboolean param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJFFFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCPV__SSJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__SJSJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPPV__SJJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJPPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNNV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPNV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCV__SSSIJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUV__SSIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, (uint8_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJPV__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPJV__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__IJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCV__JBSIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCCV__BSSIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUV__SSIFBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jfloat param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jint, jfloat, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJJJV__IIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jlong, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNNV__JJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long, jint, jint, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2, param3, (long)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__IIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJFFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jboolean param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCV__JBSIIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUPV__JBJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCCV__BSIISJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jint param2, jint param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, param2, param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCUV__BSBIIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jbyte param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, uint8_t, jint, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, (uint8_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPCV__BJIISJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jint param2, jint param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uintptr_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1, param2, param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUV__SSIIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jint param3, jint param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, param3, param4, (uint8_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__IIJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJIZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jboolean param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JZIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jboolean, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJFFFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJIIIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jboolean param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJIIIJIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jboolean param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJFFFFFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, param6, param7, (uintptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJFFFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUPV__SSBJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JSJSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, (uint16_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCUV__SSSIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCUV__JSSIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJJPV__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPCPV__JJSIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uint16_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPCV__JJIJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCCV__JBSSIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jshort param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, (uint16_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCUV__SSSIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jint param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, (uint8_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJJJV__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jlong, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCCV__JBSIISJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jint param3, jint param4, jshort param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, param3, param4, (uint16_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCUV__JBSBIIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jbyte param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, uint8_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, (uint8_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUPCV__JBJIISJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong param2, jint param3, jint param4, jshort param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uintptr_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uintptr_t)param2, param3, param4, (uint16_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCUV__SSSIIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jint param4, jint param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCUV__JSSIIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jint param4, jint param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJFFFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJIIIFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jfloat param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJFFFFFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCCCV__SSSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUPPV__SSBJJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPCPPV__JJSJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uint16_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCUV__JSSSIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, (uint8_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__IJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCUV__JSSSIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jint param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJIJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jboolean param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCCV__JSSSZZSIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jboolean param4, jboolean param5, jshort param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jboolean, jboolean, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, param5, (uint16_t)param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCUV__JSSSIIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jint param5, jint param6, jbyte param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, param5, param6, (uint8_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJIJJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCCUV__SSSISIIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jshort param4, jint param5, jint param6, jint param7, jbyte param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, (uint16_t)param4, param5, param6, param7, (uint8_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__IJIJJJIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCCPCV__SSSSJSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jlong param4, jshort param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, (uintptr_t)param4, (uint16_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPV__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCCUV__JSISSSBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jint param2, jshort param3, jshort param4, jshort param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jint, uint16_t, uint16_t, uint16_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPV__IJJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCCUV__JSSSISIIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jshort param5, jint param6, jint param7, jint param8, jbyte param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, (uint16_t)param5, param6, param7, param8, (uint8_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPV__JJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPV__JIJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUCCCCPCV__SSBSSSSJSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jshort param3, jshort param4, jshort param5, jshort param6, jlong param7, jshort param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uintptr_t)param7, (uint16_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCUCCCCCCPV__SBSSSSSSJJ(JNIEnv *__env, jclass clazz, jshort param0, jbyte param1, jshort param2, jshort param3, jshort param4, jshort param5, jshort param6, jshort param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint8_t)param1, (uint16_t)param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint16_t)param7, (uintptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUUCCCCPCV__SSBBSSSSJSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jbyte param3, jshort param4, jshort param5, jshort param6, jshort param7, jlong param8, jshort param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uint8_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint16_t)param7, (uintptr_t)param8, (uint16_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUUUUUUUUUV__SSFBBBBBBBBBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jfloat param2, jbyte param3, jbyte param4, jbyte param5, jbyte param6, jbyte param7, jbyte param8, jbyte param9, jbyte param10, jbyte param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jfloat, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, (uint8_t)param3, (uint8_t)param4, (uint8_t)param5, (uint8_t)param6, (uint8_t)param7, (uint8_t)param8, (uint8_t)param9, (uint8_t)param10, (uint8_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUCCCCUCCCCCCV__SSBSSSSBSSSSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jshort param3, jshort param4, jshort param5, jshort param6, jbyte param7, jshort param8, jshort param9, jshort param10, jshort param11, jshort param12, jshort param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint8_t)param7, (uint16_t)param8, (uint16_t)param9, (uint16_t)param10, (uint16_t)param11, (uint16_t)param12, (uint16_t)param13);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCUCCCCUCCCCCCV__JSSBSSSSBSSSSSSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jbyte param3, jshort param4, jshort param5, jshort param6, jshort param7, jbyte param8, jshort param9, jshort param10, jshort param11, jshort param12, jshort param13, jshort param14, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint8_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint16_t)param7, (uint8_t)param8, (uint16_t)param9, (uint16_t)param10, (uint16_t)param11, (uint16_t)param12, (uint16_t)param13, (uint16_t)param14);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeZ__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeZ__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeZ__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeZ__FFJ(JNIEnv *__env, jclass clazz, jfloat param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeZ__IFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, jfloat))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeZ__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeJZ__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jlong, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JZJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeJZ__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jlong, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__IJFJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, jfloat))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__IJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__IJZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JFIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JZIJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jboolean, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__IIIFZJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jboolean param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, jint, jint, jfloat, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIIFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIIZFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jboolean param3, jfloat param4, jfloat param5, jfloat param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, jboolean, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePBZ__JBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jbyte))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePCZ__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJZ__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePSZ__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePUZ__JBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeUPZ__BJJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeJPZ__JJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jlong, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJZ__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, jlong))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePSZ__JISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePUZ__JIBJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint8_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JZJIJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jboolean, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJIIFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint, jint, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__IIIJIIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, jint, jint, uintptr_t, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, (uintptr_t)param6, param7);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__IIIJIIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jlong param6, jint param7, jboolean param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, jint, jint, uintptr_t, jint, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, (uintptr_t)param6, param7, param8);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__IIIIIJIIIIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jint param7, jint param8, jint param9, jlong param10, jint param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, jint, jint, jint, jint, uintptr_t, jint, jint, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5, param6, param7, param8, param9, (uintptr_t)param10, param11);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePCCZ__JSSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePCCZ__JSSIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJJZ__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJPZ__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__IJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JZJJJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jboolean, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePSSZ__JISSJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jshort, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeCCJZ__SZSIJJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jshort param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uint16_t, jboolean, uint16_t, jint, jlong))(uintptr_t)__functionAddress)((uint16_t)param0, param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJPZ__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JFFJJJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jfloat, jfloat, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJJZIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jboolean param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jboolean, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJIJIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPJZ__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePUUUZ__JBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jbyte param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint8_t)param2, (uint8_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__IJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJJFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JZJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jboolean, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJPPZ__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJFIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jfloat, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJJFFFFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jfloat, jfloat, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, param7, (uintptr_t)param8);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJIIIIFIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jfloat param6, jint param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint, jint, jint, jint, jfloat, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, param6, param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPUPZ__JJJBJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jbyte param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uint8_t)param3, (uintptr_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePUUUUZ__JBBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jbyte param2, jbyte param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint8_t)param2, (uint8_t)param3, (uint8_t)param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__IJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JJJJDJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jdouble param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jdouble, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JJJJJZIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jboolean param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jboolean, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePUUUUZ__JIIBBBBJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jbyte param3, jbyte param4, jbyte param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint, jint, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uint8_t)param3, (uint8_t)param4, (uint8_t)param5, (uint8_t)param6);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPZ__JJJIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPJJPPZ__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jlong, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPZ__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPZ__JJJIJIJIIJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong param6, jint param7, jint param8, jlong param9, jint param10, jint param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7, param8, (uintptr_t)param9, param10, param11);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callC__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_callF__IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (APIENTRY *) (jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_callPF__JFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (APIENTRY *) (uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JFIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callJI__IJIIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jlong, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIFFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIFFIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IJIIFIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jfloat param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, jint, jint, jfloat, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIJIIIIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jfloat param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JFFFFFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJI__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJI__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJI__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JFJJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__IIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIFJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJFFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJFIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jfloat, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJIIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__IJIIFJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jfloat param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, jint, jint, jfloat, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIFFFJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIFFFIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat, jfloat, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIFFFFIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat, jfloat, jfloat, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__IIJJIIIIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint param6, jint param7, jfloat param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint, jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, param6, param7, param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIFFFFFIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jint param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIFFFFFIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jint param8, jlong param9, jint param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9, param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIIIIIIJIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, jint, uintptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, (uintptr_t)param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJI__JJJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJI__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPNI__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (long)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJI__JJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__IJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JFFIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jfloat, jfloat, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJIIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callJPPI__IIIIIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, jint, jint, jint, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callJJPPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jlong, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPNPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJI__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jlong, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__IJJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__IJJIIIIIIIIIIIIIIIIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16, jint param17, jint param18, jint param19, jint param20, jlong param21, jlong param22, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, (uintptr_t)param21, (uintptr_t)param22);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJPPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJPI__JJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPI__JIJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPI__JJIJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JIJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JIJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callJPPPPI__IIJJIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, jlong, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJIIJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JIJIJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPJPI__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJPPPI__JJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPPI__JIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPJPPI__JJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPPI__JIJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jlong, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPJPPI__JIJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__IIJJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JIJIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__JIJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JIJIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JIJJIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJIJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJIJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPJPPI__JJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPI__JJJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPI__JJJJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPI__JJJJIJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jint param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPI__JIIJJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJIJJJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)param9, (uintptr_t)param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPI__JJJJJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jlong param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPI__JJJJIJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)param9, (uintptr_t)param10, (uintptr_t)param11);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJJJJJJJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jint param10, jlong param11, jlong param12, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, param10, (uintptr_t)param11, (uintptr_t)param12);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJIJJJJJJJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jint param11, jlong param12, jlong param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10, param11, (uintptr_t)param12, (uintptr_t)param13);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPPPI__JJJJJJJJJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jint param11, jlong param12, jlong param13, jlong param14, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10, param11, (uintptr_t)param12, (uintptr_t)param13, (uintptr_t)param14);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJ__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (APIENTRY *) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJ__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJ__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (APIENTRY *) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJ__IIZIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (APIENTRY *) (jint, jint, jboolean, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJ__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJ__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (APIENTRY *) (uintptr_t, jlong, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPN__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callP__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callP__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callP__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callP__IFFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJP__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jlong))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__IJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__IIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJJP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jlong, jlong))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPNP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__IJJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__IIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPNP__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__IJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callJJPPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jlong, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPNPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPJPP__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPP__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPP__JJJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJPPPP__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPP__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPP__JIJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPP__JJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPJPPP__JJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPP__JIJJIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPP__IJJIIIIJJJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jlong param8, jlong param9, jint param10, jlong param11, jlong param12, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, param10, (uintptr_t)param11, (uintptr_t)param12);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJIJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jlong, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJIJJJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)param9, (uintptr_t)param10, (uintptr_t)param11);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callS__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPS__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCS__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPS__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPSS__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callSPS__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPS__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPS__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPS__JSJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPCS__JJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPPS__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSS__JJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPSPS__JSJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callSPPS__SJJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jshort, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callSPSS__SJSJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPPS__JIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPJCCS__JJSSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jlong, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint16_t)param2, (uint16_t)param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSPS__JJSJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPSSPS__JSSJIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jshort, jshort, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPPPS__JJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPPPS__JSJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPSPS__JSJSJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPSSPPS__JSSJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jshort, jshort, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPPPPS__JSJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCSPPPS__JSSJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, jshort, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSPSPS__JJSJSJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCCPSPPS__JSSJSJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jlong param3, jshort param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uint16_t, uintptr_t, jshort, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSPSPSS__JJSJSJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callSPSSPSPS__SJSSJSJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jshort param3, jlong param4, jshort param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jshort, uintptr_t, jshort, jshort, uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPSPPSPS__JSJSJJSJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong param5, jshort param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t, jshort, uintptr_t, uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPPSPSPCS__JJJSJSJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jshort param3, jlong param4, jshort param5, jlong param6, jshort param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uint16_t)param7);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callSPSPPPSPS__SJSJJJSJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jlong param3, jlong param4, jlong param5, jshort param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jshort, uintptr_t, jshort, uintptr_t, uintptr_t, uintptr_t, jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPSPPPPPS__JSJSJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t, jshort, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSPSPSCCS__JJSJSJSSSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jshort param7, jshort param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uint16_t)param7, (uint16_t)param8);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSPSPSPSS__JJSJSJSJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jlong param7, jshort param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7, param8);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCPSPSPSCCS__JSJSJSJSSSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jshort param5, jlong param6, jshort param7, jshort param8, jshort param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, param7, (uint16_t)param8, (uint16_t)param9);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPCSSSPSPPPS__JSSSSJSJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong param5, jshort param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uint16_t, jshort, jshort, jshort, uintptr_t, jshort, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPSSSPSSPPPS__JSSSJSSJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jlong param4, jshort param5, jshort param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jshort, jshort, jshort, uintptr_t, jshort, jshort, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPSPSPPPPPPPS__JSJSJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, jshort, uintptr_t, jshort, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callPPSPSPSPSPSPSS__JJSJSJSJSJSJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jshort param4, jlong param5, jshort param6, jlong param7, jshort param8, jlong param9, jshort param10, jlong param11, jshort param12, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (uintptr_t, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, (uintptr_t)param9, param10, (uintptr_t)param11, param12);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__DJ(JNIEnv *__env, jclass clazz, jdouble param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jdouble))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__FJ(JNIEnv *__env, jclass clazz, jfloat param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jfloat))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__DDJ(JNIEnv *__env, jclass clazz, jdouble param0, jdouble param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__FFJ(JNIEnv *__env, jclass clazz, jfloat param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__FZJ(JNIEnv *__env, jclass clazz, jfloat param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jfloat, jboolean))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IDJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IZJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jboolean))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__DDDJ(JNIEnv *__env, jclass clazz, jdouble param0, jdouble param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__FFFJ(JNIEnv *__env, jclass clazz, jfloat param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IDDJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__DDDDJ(JNIEnv *__env, jclass clazz, jdouble param0, jdouble param1, jdouble param2, jdouble param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jdouble, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__FFFFJ(JNIEnv *__env, jclass clazz, jfloat param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IDDDJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jdouble param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IFFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIDDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdouble param2, jdouble param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIFIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jdouble param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIZIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jboolean, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__ZZZZJ(JNIEnv *__env, jclass clazz, jboolean param0, jboolean param1, jboolean param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jboolean, jboolean, jboolean, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IDDDDJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jdouble param3, jdouble param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IFFFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIDDDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdouble param2, jdouble param3, jdouble param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIFFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIFIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jfloat, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIZIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jboolean, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IZZZZJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jboolean param2, jboolean param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jboolean, jboolean, jboolean, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__DDDDDDJ(JNIEnv *__env, jclass clazz, jdouble param0, jdouble param1, jdouble param2, jdouble param3, jdouble param4, jdouble param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jdouble, jdouble, jdouble, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IDDIDDJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jint param3, jdouble param4, jdouble param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IFFIFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jint param3, jfloat param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIDDDDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdouble param2, jdouble param3, jdouble param4, jdouble param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jdouble, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIFFFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIZIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jboolean param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jboolean, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IDDDDDDJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jdouble param3, jdouble param4, jdouble param5, jdouble param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIDDDDJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jdouble param3, jdouble param4, jdouble param5, jdouble param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jdouble, jdouble, jdouble, jdouble))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIFFFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jboolean param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIZIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__FFFFFFFFJ(JNIEnv *__env, jclass clazz, jfloat param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIFFFFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jboolean param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jboolean param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIFFFFFFFFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jfloat param9, jfloat param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callV__IIIIIIIIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jlong))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSV__SJ(JNIEnv *__env, jclass clazz, jshort param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jshort))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callUV__BJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uint8_t))(uintptr_t)__functionAddress)((uint8_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callCV__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jlong))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jlong, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSV__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jshort))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IJIIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jlong, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callNV__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (long, jint, jint, jint))(uintptr_t)__functionAddress)((long)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIZJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IJIIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIJZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIJIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IJIIIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IZIIJJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jboolean, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IDDIIJJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IFFIIJJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIJZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIJIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIJIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IZIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jboolean, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIFFFFJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jfloat, jfloat, jfloat, jfloat, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIJIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIJIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIIIIZIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIZIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jboolean, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIIIIIZIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jboolean param6, jint param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jboolean, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (uintptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIJIIIIIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloat param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IDDIIDDIIJJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IFFIIFFIIJJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__JIFFFFFFFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloat param2, jfloat param3, jfloat param4, jfloat param5, jfloat param6, jfloat param7, jfloat param8, jfloat param9, jfloat param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jlong, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (uintptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__JIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJV__IIIIIIIIIIJZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jlong param10, jboolean param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jlong, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (uintptr_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSSV__SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jshort, jshort))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJJV__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPCV__JISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint16_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSSV__ISSJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jshort, jshort))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJJV__IIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJPV__IIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJPV__IJIJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__IJIJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, jlong))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJIJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJJZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJV__JJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJIJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJJIIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJJIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJJIIIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIJIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJJIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIIIIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIIJIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIJIFFIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, jfloat, jfloat, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, param6, param7, (uintptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIIIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6, param7, (uintptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIIJIIFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jint param8, jfloat param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, uintptr_t, jint, jint, jfloat))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6, param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callBBBV__BBBJ(JNIEnv *__env, jclass clazz, jbyte param0, jbyte param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jbyte, jbyte, jbyte))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callCCCV__SSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPNV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSSSV__SSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jshort, jshort, jshort))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callUUUV__BBBJ(JNIEnv *__env, jclass clazz, jbyte param0, jbyte param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uint8_t)param1, (uint8_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJJJV__IJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jlong, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJV__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSSSV__ISSSJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jshort, jshort, jshort))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJJJV__IIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jlong, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJV__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJV__JJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJIJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JIJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPJV__IJJIJZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jint param3, jlong param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jlong, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPJV__JIJIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJIJIJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJV__JIIJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jlong, jlong, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIIIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJIIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJIIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIIIJIJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIIIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJIIIIIIJIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jlong param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16, jint param17, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint, jint, jint, jint, uintptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, param6, param7, (uintptr_t)param8, param9, param10, param11, param12, param13, param14, param15, param16, param17);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callBBBBV__BBBBJ(JNIEnv *__env, jclass clazz, jbyte param0, jbyte param1, jbyte param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jbyte, jbyte, jbyte, jbyte))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callCCCCV__SSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPNV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (long)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSSSSV__SSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jshort, jshort, jshort, jshort))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callUUUUV__BBBBJ(JNIEnv *__env, jclass clazz, jbyte param0, jbyte param1, jbyte param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uint8_t)param1, (uint8_t)param2, (uint8_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJJJJV__IJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jlong, jlong, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJV__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callSSSSV__ISSSSJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jshort, jshort, jshort, jshort))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callUUUUV__IBBBBJ(JNIEnv *__env, jclass clazz, jint param0, jbyte param1, jbyte param2, jbyte param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)(param0, (uint8_t)param1, (uint8_t)param2, (uint8_t)param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callJJJJV__IIJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jlong, jlong, jlong, jlong))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__IJIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__IJJJJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJIIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJIJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jint param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jlong, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JIJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__IIIJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__IIJJJJIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JJIJIIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jint param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jlong, jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JIJIIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jint param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jint, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIIIIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jlong param7, jint param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, (uintptr_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJJV__JJJJJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, jlong, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JIIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJJV__JJIIJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jlong, jlong, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPPV__JIIJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, jint, jlong, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JJJJJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jint param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JIJIIIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPJV__JJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPPV__JJJIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPV__IIIJIJJJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPJJJJJJV__JJJJIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, uintptr_t, jlong, jlong, jint, jlong, jlong, jlong, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, param5, param6, param7, param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJJJJJJJJJV__JJJJJJJJJJJJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jlong param11, jint param12, jint param13, jint param14, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, jlong, jlong, jlong, jlong, jlong, jlong, jlong, jlong, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callZ__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callZ__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callZ__IFFJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callZ__IIFFJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, jint, jfloat, jfloat))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callJZ__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jlong))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPZ__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callJZ__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, jlong))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPZ__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callJZ__IJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, jlong, jint))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPZ__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPPPZ__IIIFJJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (APIENTRY *) (jint, jint, jint, jfloat, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeUPC__B_3SZJ(JNIEnv *__env, jclass clazz, jbyte param0, jshortArray param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    jshort __result = (jshort)((uint16_t (*) (jbyte, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCPCC__S_3SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshortArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    jshort __result = (jshort)((uint16_t (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPI__S_3IJ(JNIEnv *__env, jclass clazz, jshort param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePCI___3FSJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    jint __result = ((jint (*) (uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__I_3II_3IIZJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jintArray param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (*) (jint, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__I_3SI_3SIZJ(JNIEnv *__env, jclass clazz, jint param0, jshortArray param1, jint param2, jshortArray param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    jint __result = ((jint (*) (jint, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__S_3FBJ(JNIEnv *__env, jclass clazz, jshort param0, jfloatArray param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t, jbyte))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__S_3IBJ(JNIEnv *__env, jclass clazz, jshort param0, jintArray param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t, jbyte))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__S_3SBJ(JNIEnv *__env, jclass clazz, jshort param0, jshortArray param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t, jbyte))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPCI__J_3FSJ(JNIEnv *__env, jclass clazz, jlong param0, jfloatArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI___3IJJIZFJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong param1, jlong param2, jint param3, jboolean param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jfloat))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI___3SJJIZFJ(JNIEnv *__env, jclass clazz, jshortArray param0, jlong param1, jlong param2, jint param3, jboolean param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param0, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jfloat))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
    if (param0 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJII_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jfloatArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPI__J_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jintArray param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPPPI__JJJII_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jintArray param5, jintArray param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (*) (uintptr_t, long, long, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, param3, param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)param7);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPI__II_3I_3I_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)param7);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPI__JII_3I_3I_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6, jintArray param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jint __result = ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)paramArray7, (uintptr_t)param8);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JIIJ_3I_3I_3F_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jintArray param5, jfloatArray param6, jintArray param7, jintArray param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jint __result = ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)paramArray7, (uintptr_t)paramArray8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3DIJ(JNIEnv *__env, jclass clazz, jdoubleArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3FIJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3IIJ(JNIEnv *__env, jclass clazz, jintArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3JIJ(JNIEnv *__env, jclass clazz, jlongArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3SIJ(JNIEnv *__env, jclass clazz, jshortArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokeUPU__B_3IJ(JNIEnv *__env, jclass clazz, jbyte param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jbyte __result = (jbyte)((uint8_t (*) (jbyte, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__I_3DJ(JNIEnv *__env, jclass clazz, jint param0, jdoubleArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param1, NULL);
    ((void (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__I_3FJ(JNIEnv *__env, jclass clazz, jint param0, jfloatArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdoubleArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__I_3IZJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (*) (jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3FIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloatArray param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__II_3SIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jshortArray param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jdoubleArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param5, NULL);
    ((void (*) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (*) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (*) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jshortArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    ((void (*) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIII_3IZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (*) (jint, jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jdoubleArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param6, NULL);
    ((void (*) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jfloatArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    ((void (*) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    ((void (*) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jshortArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param6, NULL);
    ((void (*) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPV__B_3FJ(JNIEnv *__env, jclass clazz, jbyte param0, jfloatArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (*) (jbyte, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (*) (jint, uintptr_t, jlong))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JI_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jdoubleArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JI_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__J_3FIJ(JNIEnv *__env, jclass clazz, jlong param0, jfloatArray param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__J_3IIJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__J_3SIJ(JNIEnv *__env, jclass clazz, jlong param0, jshortArray param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    ((void (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jdoubleArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JI_3IZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__III_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (*) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3FIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloatArray param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3IIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JII_3SIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jshortArray param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIIII_3IZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jintArray param5, jboolean param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (*) (uintptr_t, jint, jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5, param6);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCPV__SS_3SJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshortArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (jshort, jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3DSJ(JNIEnv *__env, jclass clazz, jshort param0, jdoubleArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3FSJ(JNIEnv *__env, jclass clazz, jshort param0, jfloatArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3ISJ(JNIEnv *__env, jclass clazz, jshort param0, jintArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3JSJ(JNIEnv *__env, jclass clazz, jshort param0, jlongArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshortArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPPV__S_3F_3FJ(JNIEnv *__env, jclass clazz, jshort param0, jfloatArray param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (jshort, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPV__JJ_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshortArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3D_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jdoubleArray param1, jdoubleArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3F_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jfloatArray param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__J_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV___3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jintArray param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPJV__JI_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__I_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jint param0, jfloatArray param1, jfloatArray param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (*) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jintArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (*) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__II_3D_3D_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdoubleArray param2, jdoubleArray param3, jdoubleArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    ((void (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__II_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloatArray param2, jfloatArray param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__II_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__II_3J_3J_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlongArray param2, jlongArray param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    ((void (*) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV___3FIJJIJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIII_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (*) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV___3FZIJJIJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    ((void (*) (uintptr_t, jboolean, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3DSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jdoubleArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3FSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jfloatArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3ISJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jintArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlongArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3SSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshortArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPPV__JJJ_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jshortArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JI_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloatArray param2, jfloatArray param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JI_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JII_3D_3D_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jdoubleArray param3, jdoubleArray param4, jdoubleArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param5, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JII_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jfloatArray param3, jfloatArray param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JII_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JII_3J_3J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jlongArray param4, jlongArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    ((void (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJJ_3FJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloatArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__J_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jintArray param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIJ_3IJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4, (uintptr_t)param5);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__IJI_3F_3FJIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, param9);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__I_3II_3F_3FJI_3IIZJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jintArray param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, param8, param9);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__I_3SI_3F_3FJI_3SIZJ(JNIEnv *__env, jclass clazz, jint param0, jshortArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jshortArray param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param7, NULL);
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, param8, param9);
    if (param7 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param7, paramArray7, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__I_3IZJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jboolean __result = ((jboolean (*) (jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jboolean __result = ((jboolean (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jboolean __result = ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI___3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI___3IIJ(JNIEnv *__env, jclass clazz, jintArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__II_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__I_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__III_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI___3IJJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)param1);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JI_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jdoubleArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JI_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JI_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JI_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshortArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JII_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__IJIIF_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jint param3, jfloat param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (jint, uintptr_t, jint, jint, jfloat, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__J_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__J_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__J_3J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI___3IJ_3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPI__JJI_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJ_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jdoubleArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJ_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIJ_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jshortArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JI_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JI_3I_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJI_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JJ_3IIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJI__JI_3JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlongArray param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIII_3I_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPI__JIII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJ_3I_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPNPI__JJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJ_3JJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlongArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJ_3J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlongArray param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JI_3IJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3, (uintptr_t)param4);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJI_3JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlongArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__J_3IJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__J_3JIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIIJ_3JJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlongArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JII_3J_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPI__JJIIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JIJIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlong param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, (uintptr_t)param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__I_3I_3JIIIIIIIIIIIIIIIIII_3I_3JJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlongArray param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jint param11, jint param12, jint param13, jint param14, jint param15, jint param16, jint param17, jint param18, jint param19, jint param20, jintArray param21, jlongArray param22, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray21 = param21 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param21, NULL);
    void *paramArray22 = param22 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param22, NULL);
    jint __result = ((jint (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, (uintptr_t)paramArray21, (uintptr_t)paramArray22);
    if (param22 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param22, paramArray22, 0); }
    if (param21 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param21, paramArray21, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPI__JJJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJ_3I_3I_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jintArray param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__J_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jintArray param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPPI__JJIJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlongArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJIJ_3JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlongArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jintArray param3, jintArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JJJ_3II_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__J_3I_3FI_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jfloatArray param2, jint param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__II_3I_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)param6);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JIJ_3JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlongArray param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, param4, (uintptr_t)param5, (uintptr_t)param6);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPI__JI_3JIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlongArray param2, jint param3, jlong param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJIIJ_3IJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)paramArray5, param6, param7);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJPPJI__JJIIJ_3JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlongArray param5, jlong param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)paramArray5, param6, param7);
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJJJPI__JJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__J_3I_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPJJPPPI__JJJIJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong param5, jlongArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param6, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, jlong, jlong, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPI__II_3I_3I_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)param7);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJJJIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong param5, jintArray param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)paramArray6, (uintptr_t)param7);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJ_3FJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloatArray param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJ_3IJJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJIJJ_3DIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jdoubleArray param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, param6, (uintptr_t)param7, (uintptr_t)param8);
    if (param5 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJIJJ_3FIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jfloatArray param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, param6, (uintptr_t)param7, (uintptr_t)param8);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJIJJ_3IIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jintArray param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, param6, (uintptr_t)param7, (uintptr_t)param8);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPI__JJIJJ_3SIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jshortArray param5, jint param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, param6, (uintptr_t)param7, (uintptr_t)param8);
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPI__J_3JJJJIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jlong param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8);
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPI__J_3JJJJIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jint param5, jlong param6, jintArray param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, param5, (uintptr_t)param6, (uintptr_t)paramArray7, (uintptr_t)param8);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJJJJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jint param6, jintArray param7, jintArray param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, (uintptr_t)paramArray8, (uintptr_t)param9);
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJ_3FJJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloatArray param3, jlong param4, jlong param5, jint param6, jintArray param7, jintArray param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, (uintptr_t)paramArray8, (uintptr_t)param9);
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJJ_3IJJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jlong param4, jlong param5, jint param6, jintArray param7, jintArray param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, (uintptr_t)paramArray8, (uintptr_t)param9);
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJIJJJJ_3DIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jdoubleArray param7, jint param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param7, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)paramArray7, param8, (uintptr_t)param9, (uintptr_t)param10);
    if (param7 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param7, paramArray7, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJIJJJJ_3FIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jfloatArray param7, jint param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param7, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)paramArray7, param8, (uintptr_t)param9, (uintptr_t)param10);
    if (param7 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param7, paramArray7, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJIJJJJ_3IIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jintArray param7, jint param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)paramArray7, param8, (uintptr_t)param9, (uintptr_t)param10);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPI__JJIJJJJ_3SIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jshortArray param7, jint param8, jlong param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param7, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)paramArray7, param8, (uintptr_t)param9, (uintptr_t)param10);
    if (param7 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param7, paramArray7, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPI__JJJJJJJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jint param7, jintArray param8, jintArray param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, param7, (uintptr_t)paramArray8, (uintptr_t)paramArray9, (uintptr_t)param10);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPI__JJ_3JJIJJJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlongArray param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jint param8, jintArray param9, jintArray param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param10, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)paramArray9, (uintptr_t)paramArray10, (uintptr_t)param11);
    if (param10 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param10, paramArray10, 0); }
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJIJJJJJJJ_3DIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jdoubleArray param10, jint param11, jlong param12, jlong param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param10, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)paramArray10, param11, (uintptr_t)param12, (uintptr_t)param13);
    if (param10 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param10, paramArray10, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJIJJJJJJJ_3FIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jfloatArray param10, jint param11, jlong param12, jlong param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param10, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)paramArray10, param11, (uintptr_t)param12, (uintptr_t)param13);
    if (param10 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param10, paramArray10, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJIJJJJJJJ_3IIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jintArray param10, jint param11, jlong param12, jlong param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param10, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)paramArray10, param11, (uintptr_t)param12, (uintptr_t)param13);
    if (param10 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param10, paramArray10, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPI__JJIJJJJJJJ_3SIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jshortArray param10, jint param11, jlong param12, jlong param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param10, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)paramArray10, param11, (uintptr_t)param12, (uintptr_t)param13);
    if (param10 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param10, paramArray10, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPPPPPPPPI__JJJJJJJJJJJI_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong param10, jint param11, jintArray param12, jintArray param13, jlong param14, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray12 = param12 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param12, NULL);
    void *paramArray13 = param13 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param13, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, (uintptr_t)param10, param11, (uintptr_t)paramArray12, (uintptr_t)paramArray13, (uintptr_t)param14);
    if (param13 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param13, paramArray13, 0); }
    if (param12 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param12, paramArray12, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP___3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__III_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPP__JIII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__J_3J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__IJ_3J_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlongArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JI_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JJII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPP__JJIII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPP__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPNPP__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (long)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJ_3J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlongArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJ_3II_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JIJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__J_3JJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPP__JJIIJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJ_3D_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jdoubleArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloatArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPP__JJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jshortArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPP__JIJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPP__JJ_3JJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlongArray param2, jlong param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJPPPP__JJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJPPPP__JJJJ_3D_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jdoubleArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJPPPP__JJJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJPPPP__JJJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJJPPPP__JJJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPP__JJJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPP__J_3JJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPP__J_3JJJ_3D_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jdoubleArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPP__J_3JJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jfloatArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPP__J_3JJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPP__J_3JJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jshortArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param4, paramArray4, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPJPPP__JJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPP__JIJJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jintArray param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPP__J_3JJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jlong param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPP__J_3JJJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jfloatArray param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPP__J_3JJJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jintArray param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPP__J_3JJJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlongArray param1, jlong param2, jlong param3, jlong param4, jshortArray param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPP__JIJJIJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong param5, jlong param6, jlong param7, jintArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPP__I_3I_3JIIIIJJJI_3I_3JJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlongArray param2, jint param3, jint param4, jint param5, jint param6, jlong param7, jlong param8, jlong param9, jint param10, jintArray param11, jlongArray param12, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param11, NULL);
    void *paramArray12 = param12 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param12, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, param3, param4, param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9, param10, (uintptr_t)paramArray11, (uintptr_t)paramArray12);
    if (param12 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param12, paramArray12, 0); }
    if (param11 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param11, paramArray11, 0); }
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jfloatArray param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)paramArray6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jintArray param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)paramArray6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPP__JJJJJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jshortArray param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)paramArray6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param6, paramArray6, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPP__JJIJJJIJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jlong param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jlong, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJ_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jfloatArray param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)paramArray8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param8, paramArray8, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJ_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jintArray param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)paramArray8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPJPPPPPPPPP__JJJJJJJJ_3S_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jshortArray param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)paramArray8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param8, paramArray8, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPJPPPPPPPP__JJIJJJJJIJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jint param8, jlong param9, jlong param10, jintArray param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param11, NULL);
    jlong __result = (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, jlong, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, param8, (uintptr_t)param9, (uintptr_t)param10, (uintptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param11, paramArray11, 0); }
    return __result;
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV___3DJ(JNIEnv *__env, jclass clazz, jdoubleArray param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param0, NULL);
    ((void (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV___3FJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    ((void (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV___3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    ((void (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV___3SJ(JNIEnv *__env, jclass clazz, jshortArray param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param0, NULL);
    ((void (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0);
    if (param0 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3DJ(JNIEnv *__env, jclass clazz, jint param0, jdoubleArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3FJ(JNIEnv *__env, jclass clazz, jint param0, jfloatArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3JJ(JNIEnv *__env, jclass clazz, jint param0, jlongArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3SJ(JNIEnv *__env, jclass clazz, jint param0, jshortArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jdoubleArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jshortArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__III_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jdoubleArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__III_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__III_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__III_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__III_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jshortArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIZ_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jdoubleArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIZ_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIZ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jboolean param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__I_3IIIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, param3);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jdoubleArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIII_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jshortArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZ_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jdoubleArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZ_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jboolean, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__III_3IZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3IIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, param4);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IZII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jint param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jboolean, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IDDII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdoubleArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IFFII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jdoubleArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jshortArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIII_3IZJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZI_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jint param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZI_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIZI_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jboolean param3, jint param4, jshortArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jboolean, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jdoubleArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jfloatArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jshortArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__II_3IIIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jint param3, jint param4, jint param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, param4, param5, param6);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jdoubleArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jfloatArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jshortArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jdoubleArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param8, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloatArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param8, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jintArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jshortArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param8, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IDDIIDDII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jdouble param1, jdouble param2, jint param3, jint param4, jdouble param5, jdouble param6, jint param7, jint param8, jdoubleArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param9, NULL);
    ((void (APIENTRY *) (jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IFFIIFFII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jfloat param1, jfloat param2, jint param3, jint param4, jfloat param5, jfloat param6, jint param7, jint param8, jfloatArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param9, NULL);
    ((void (APIENTRY *) (jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jdoubleArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param9, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jfloatArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param9, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jshortArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param9, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param9, paramArray9, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jdoubleArray param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param10, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (uintptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jfloatArray param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param10, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (uintptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jintArray param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param10, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (uintptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jshortArray param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param10, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, (uintptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param10, paramArray10, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIII_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jdoubleArray param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param11, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (uintptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jfloatArray param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param11, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (uintptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jintArray param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param11, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (uintptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPV__IIIIIIIIIII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jint param9, jint param10, jshortArray param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray11 = param11 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param11, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, (uintptr_t)paramArray11);
    if (param11 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param11, paramArray11, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jfloatArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV___3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray param0, jdoubleArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param0, NULL);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV___3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jfloatArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV___3I_3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV___3S_3SJ(JNIEnv *__env, jclass clazz, jshortArray param0, jshortArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param0, NULL);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3I_3FJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3I_3JJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV___3II_3IJ(JNIEnv *__env, jclass clazz, jintArray param0, jint param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__II_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__II_3I_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__II_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__II_3I_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJI_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJ_3DIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jdoubleArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJ_3FIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jfloatArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJ_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJ_3JIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlongArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IJ_3SIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jshortArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3I_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jintArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3J_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jlongArray param1, jintArray param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__III_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__III_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJ_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jintArray param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__II_3II_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3IIJIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, param4);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3II_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jintArray param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__I_3IJIIJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)param2, param3, param4);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__JIII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIII_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jshortArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__II_3IJIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlong param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3, param4, param5);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIJII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jint param5, jfloatArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jfloatArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIIJII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jfloatArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIIJII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jshortArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jfloatArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param7, paramArray7, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIIJIFFI_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jfloat param5, jfloat param6, jint param7, jfloatArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param8, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, jfloat, jfloat, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, param5, param6, param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPV__IIJIIIII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jint param6, jint param7, jfloatArray param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param8, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, jint, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, param3, param4, param5, param6, param7, (uintptr_t)paramArray8);
    if (param8 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param8, paramArray8, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlongArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__J_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, (uintptr_t)param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJI_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJ_3DJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jdoubleArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJ_3FJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jfloatArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJ_3JJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJJ_3SJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jshortArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3I_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jintArray param2, jlongArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JI_3JJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlongArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JJI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jintArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJ_3DJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jdoubleArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJ_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJ_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jshortArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__II_3IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__II_3I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJI_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IJI_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__I_3I_3II_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jintArray param2, jint param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jintArray param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JII_3J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIII_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jdoubleArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIII_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jfloatArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIII_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlongArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPV__JJIII_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jshortArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPJV__JI_3JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlongArray param2, jint param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3, param4, param5);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__III_3IJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4, (uintptr_t)param5);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__III_3IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jlong param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__II_3II_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jintArray param2, jint param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__I_3IIJI_3IJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jlong param3, jint param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)param3, param4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJII_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jfloatArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJII_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIJJII_3SJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong param3, jint param4, jint param5, jshortArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIJIII_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jint param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3, param4, param5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIII_3II_3I_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jint param5, jintArray param6, jfloatArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4, param5, (uintptr_t)paramArray6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__IIII_3II_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jintArray param4, jint param5, jintArray param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4, param5, (uintptr_t)paramArray6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPV__JIIIII_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jintArray param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, jint, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5, (uintptr_t)paramArray6, (uintptr_t)param7);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jintArray param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJPV__JIJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JIJ_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV___3J_3I_3I_3IIJ(JNIEnv *__env, jclass clazz, jlongArray param0, jintArray param1, jintArray param2, jintArray param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param0, NULL);
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)paramArray1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, param4);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    if (param0 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__IJ_3I_3I_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jintArray param3, jintArray param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__JII_3J_3J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jlongArray param4, jlongArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JIJII_3I_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jintArray param5, jlongArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__III_3I_3I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jintArray param3, jintArray param4, jintArray param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)param6);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPV__IIJ_3I_3I_3IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jintArray param3, jintArray param4, jintArray param5, jint param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, param6);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJPPV__JIJII_3JI_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jint param4, jlongArray param5, jint param6, jintArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jlong, jint, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, (uintptr_t)paramArray5, param6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJ_3DJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jdoubleArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJ_3FJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jfloatArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJ_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jintArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJ_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlongArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPJJJPV__JJJJ_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jshortArray param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jlong, jlong, jlong, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)paramArray4);
    if (param4 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param4, paramArray4, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JIJ_3J_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlongArray param3, jintArray param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5);
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__IIJ_3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jintArray param3, jintArray param4, jintArray param5, jintArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JII_3J_3J_3J_3JJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlongArray param3, jlongArray param4, jlongArray param5, jlongArray param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param6, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6);
    if (param6 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPV__JI_3JIIIJIJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlongArray param2, jint param3, jint param4, jint param5, jlong param6, jint param7, jlong param8, jint param9, jlong param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (APIENTRY *) (uintptr_t, jint, uintptr_t, jint, jint, jint, uintptr_t, jint, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3, param4, param5, (uintptr_t)param6, param7, (uintptr_t)param8, param9, (uintptr_t)param10);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_callPPPPPPPV__IIIJIJ_3I_3I_3I_3I_3JJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jint param4, jlong param5, jintArray param6, jintArray param7, jintArray param8, jintArray param9, jlongArray param10, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    void *paramArray10 = param10 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param10, NULL);
    ((void (APIENTRY *) (jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, (uintptr_t)param3, param4, (uintptr_t)param5, (uintptr_t)paramArray6, (uintptr_t)paramArray7, (uintptr_t)paramArray8, (uintptr_t)paramArray9, (uintptr_t)paramArray10);
    if (param10 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param10, paramArray10, 0); }
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPZ__I_3IJJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jboolean __result = ((jboolean (APIENTRY *) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_callPPPPZ__IIIF_3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jfloat param3, jfloatArray param4, jfloatArray param5, jfloatArray param6, jfloatArray param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param7, NULL);
    jboolean __result = ((jboolean (APIENTRY *) (jint, jint, jint, jfloat, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)paramArray7);
    if (param7 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}

EXTERN_C_EXIT
