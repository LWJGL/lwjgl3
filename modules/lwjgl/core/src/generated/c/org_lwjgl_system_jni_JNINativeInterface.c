/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_GetVersion(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAM(clazz)
    return (*__env)->GetVersion(__env);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_FromReflectedMethod(JNIEnv *__env, jclass clazz, jobject method) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->FromReflectedMethod(__env, method);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_FromReflectedField(JNIEnv *__env, jclass clazz, jobject field) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->FromReflectedField(__env, field);
}

JNIEXPORT jobject JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nToReflectedMethod(JNIEnv *__env, jclass clazz, jclass cls, jlong methodIDAddress, jboolean isStatic) {
    jmethodID methodID = (jmethodID)(intptr_t)methodIDAddress;
    UNUSED_PARAM(clazz)
    return (*__env)->ToReflectedMethod(__env, cls, methodID, isStatic);
}

JNIEXPORT jobject JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nToReflectedField(JNIEnv *__env, jclass clazz, jclass cls, jlong fieldIDAddress, jboolean isStatic) {
    jfieldID fieldID = (jfieldID)(intptr_t)fieldIDAddress;
    UNUSED_PARAM(clazz)
    return (*__env)->ToReflectedField(__env, cls, fieldID, isStatic);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_NewGlobalRef(JNIEnv *__env, jclass clazz, jobject obj) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->NewGlobalRef(__env, obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nDeleteGlobalRef(JNIEnv *__env, jclass clazz, jlong globalRefAddress) {
    void *globalRef = (void *)(intptr_t)globalRefAddress;
    UNUSED_PARAM(clazz)
    (*__env)->DeleteGlobalRef(__env, globalRef);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetBooleanArrayElements(JNIEnv *__env, jclass clazz, jbooleanArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetBooleanArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseBooleanArrayElements(JNIEnv *__env, jclass clazz, jbooleanArray array, jlong elemsAddress, jint mode) {
    jboolean *elems = (jboolean *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseBooleanArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetByteArrayElements(JNIEnv *__env, jclass clazz, jbyteArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetByteArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseByteArrayElements(JNIEnv *__env, jclass clazz, jbyteArray array, jlong elemsAddress, jint mode) {
    jbyte *elems = (jbyte *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseByteArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetCharArrayElements(JNIEnv *__env, jclass clazz, jcharArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetCharArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseCharArrayElements(JNIEnv *__env, jclass clazz, jcharArray array, jlong elemsAddress, jint mode) {
    jchar *elems = (jchar *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseCharArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetShortArrayElements(JNIEnv *__env, jclass clazz, jshortArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetShortArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseShortArrayElements(JNIEnv *__env, jclass clazz, jshortArray array, jlong elemsAddress, jint mode) {
    jshort *elems = (jshort *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseShortArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetIntArrayElements(JNIEnv *__env, jclass clazz, jintArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetIntArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseIntArrayElements(JNIEnv *__env, jclass clazz, jintArray array, jlong elemsAddress, jint mode) {
    jint *elems = (jint *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseIntArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetLongArrayElements(JNIEnv *__env, jclass clazz, jlongArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetLongArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseLongArrayElements(JNIEnv *__env, jclass clazz, jlongArray array, jlong elemsAddress, jint mode) {
    jlong *elems = (jlong *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseLongArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetFloatArrayElements(JNIEnv *__env, jclass clazz, jfloatArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetFloatArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseFloatArrayElements(JNIEnv *__env, jclass clazz, jfloatArray array, jlong elemsAddress, jint mode) {
    jfloat *elems = (jfloat *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseFloatArrayElements(__env, array, elems, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetDoubleArrayElements(JNIEnv *__env, jclass clazz, jdoubleArray array, jlong isCopyAddress) {
    jboolean *isCopy = (jboolean *)(intptr_t)isCopyAddress;
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetDoubleArrayElements(__env, array, isCopy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nReleaseDoubleArrayElements(JNIEnv *__env, jclass clazz, jdoubleArray array, jlong elemsAddress, jint mode) {
    jdouble *elems = (jdouble *)(intptr_t)elemsAddress;
    UNUSED_PARAM(clazz)
    (*__env)->ReleaseDoubleArrayElements(__env, array, elems, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetBooleanArrayRegion(JNIEnv *__env, jclass clazz, jbooleanArray array, jint start, jint len, jlong bufAddress) {
    jboolean *buf = (jboolean *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetBooleanArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetBooleanArrayRegion(JNIEnv *__env, jclass clazz, jbooleanArray array, jint start, jint len, jlong bufAddress) {
    jboolean const *buf = (jboolean const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetBooleanArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetByteArrayRegion(JNIEnv *__env, jclass clazz, jbyteArray array, jint start, jint len, jlong bufAddress) {
    jbyte *buf = (jbyte *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetByteArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetByteArrayRegion(JNIEnv *__env, jclass clazz, jbyteArray array, jint start, jint len, jlong bufAddress) {
    jbyte const *buf = (jbyte const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetByteArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetCharArrayRegion(JNIEnv *__env, jclass clazz, jcharArray array, jint start, jint len, jlong bufAddress) {
    jchar *buf = (jchar *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetCharArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetCharArrayRegion(JNIEnv *__env, jclass clazz, jcharArray array, jint start, jint len, jlong bufAddress) {
    jchar const *buf = (jchar const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetCharArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetShortArrayRegion(JNIEnv *__env, jclass clazz, jshortArray array, jint start, jint len, jlong bufAddress) {
    jshort *buf = (jshort *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetShortArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetShortArrayRegion(JNIEnv *__env, jclass clazz, jshortArray array, jint start, jint len, jlong bufAddress) {
    jshort const *buf = (jshort const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetShortArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetIntArrayRegion(JNIEnv *__env, jclass clazz, jintArray array, jint start, jint len, jlong bufAddress) {
    jint *buf = (jint *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetIntArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetIntArrayRegion(JNIEnv *__env, jclass clazz, jintArray array, jint start, jint len, jlong bufAddress) {
    jint const *buf = (jint const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetIntArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetLongArrayRegion(JNIEnv *__env, jclass clazz, jlongArray array, jint start, jint len, jlong bufAddress) {
    jlong *buf = (jlong *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetLongArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetLongArrayRegion(JNIEnv *__env, jclass clazz, jlongArray array, jint start, jint len, jlong bufAddress) {
    jlong const *buf = (jlong const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetLongArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetFloatArrayRegion(JNIEnv *__env, jclass clazz, jfloatArray array, jint start, jint len, jlong bufAddress) {
    jfloat *buf = (jfloat *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetFloatArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetFloatArrayRegion(JNIEnv *__env, jclass clazz, jfloatArray array, jint start, jint len, jlong bufAddress) {
    jfloat const *buf = (jfloat const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetFloatArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetDoubleArrayRegion(JNIEnv *__env, jclass clazz, jdoubleArray array, jint start, jint len, jlong bufAddress) {
    jdouble *buf = (jdouble *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetDoubleArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nSetDoubleArrayRegion(JNIEnv *__env, jclass clazz, jdoubleArray array, jint start, jint len, jlong bufAddress) {
    jdouble const *buf = (jdouble const *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->SetDoubleArrayRegion(__env, array, (jsize)start, (jsize)len, buf);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nRegisterNatives(JNIEnv *__env, jclass clazz, jclass targetClass, jlong methodsAddress, jint nMethods) {
    JNINativeMethod const *methods = (JNINativeMethod const *)(intptr_t)methodsAddress;
    UNUSED_PARAM(clazz)
    return (*__env)->RegisterNatives(__env, targetClass, methods, nMethods);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_UnregisterNatives(JNIEnv *__env, jclass clazz, jclass targetClass) {
    UNUSED_PARAM(clazz)
    return (*__env)->UnregisterNatives(__env, targetClass);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetJavaVM(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    JavaVM **vm = (JavaVM **)(intptr_t)vmAddress;
    UNUSED_PARAM(clazz)
    return (*__env)->GetJavaVM(__env, vm);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetStringRegion(JNIEnv *__env, jclass clazz, jstring str, jint start, jint len, jlong bufAddress) {
    jchar *buf = (jchar *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetStringRegion(__env, str, (jsize)start, (jsize)len, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nGetStringUTFRegion(JNIEnv *__env, jclass clazz, jstring str, jint start, jint len, jlong bufAddress) {
    char *buf = (char *)(intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    (*__env)->GetStringUTFRegion(__env, str, (jsize)start, (jsize)len, buf);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_NewWeakGlobalRef(JNIEnv *__env, jclass clazz, jobject obj) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->NewWeakGlobalRef(__env, obj);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nDeleteWeakGlobalRef(JNIEnv *__env, jclass clazz, jlong weakGlobalRefAddress) {
    void *weakGlobalRef = (void *)(intptr_t)weakGlobalRefAddress;
    UNUSED_PARAM(clazz)
    (*__env)->DeleteWeakGlobalRef(__env, weakGlobalRef);
}

JNIEXPORT jobject JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_nNewDirectByteBuffer(JNIEnv *__env, jclass clazz, jlong addressAddress, jlong capacity) {
    void *address = (void *)(intptr_t)addressAddress;
    UNUSED_PARAM(clazz)
    return (*__env)->NewDirectByteBuffer(__env, address, capacity);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_GetDirectBufferAddress(JNIEnv *__env, jclass clazz, jobject buf) {
    UNUSED_PARAM(clazz)
    return (jlong)(intptr_t)(*__env)->GetDirectBufferAddress(__env, buf);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_jni_JNINativeInterface_GetObjectRefType(JNIEnv *__env, jclass clazz, jobject obj) {
    UNUSED_PARAM(clazz)
    return (jint)(*__env)->GetObjectRefType(__env, obj);
}

EXTERN_C_EXIT
