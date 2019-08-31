/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "dyncall.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_dcNewCallVM(JNIEnv *__env, jclass clazz, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcNewCallVM((DCsize)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcFree(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcFree(vm);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcReset(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcReset(vm);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcMode(JNIEnv *__env, jclass clazz, jlong vmAddress, jint mode) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcMode(vm, (DCint)mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgBool(JNIEnv *__env, jclass clazz, jlong vmAddress, jint value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgBool(vm, (DCbool)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgChar(JNIEnv *__env, jclass clazz, jlong vmAddress, jbyte value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgChar(vm, (DCchar)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgShort(JNIEnv *__env, jclass clazz, jlong vmAddress, jshort value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgShort(vm, (DCshort)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgInt(JNIEnv *__env, jclass clazz, jlong vmAddress, jint value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgInt(vm, (DCint)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgLong(vm, (DClong)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgLongLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgLongLong(vm, (DClonglong)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgFloat(JNIEnv *__env, jclass clazz, jlong vmAddress, jfloat value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgFloat(vm, (DCfloat)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgDouble(JNIEnv *__env, jclass clazz, jlong vmAddress, jdouble value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgDouble(vm, (DCdouble)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgPointer(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong valueAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer value = (DCpointer)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgPointer(vm, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgStruct(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong sAddress, jlong valueAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    DCpointer value = (DCpointer)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    dcArgStruct(vm, s, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallVoid(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    dcCallVoid(vm, funcptr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallBool(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dcCallBool(vm, funcptr);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallChar(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)dcCallChar(vm, funcptr);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallShort(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)dcCallShort(vm, funcptr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallInt(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dcCallInt(vm, funcptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcCallLong(vm, funcptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallLongLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcCallLongLong(vm, funcptr);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallFloat(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)dcCallFloat(vm, funcptr);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallDouble(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)dcCallDouble(vm, funcptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallPointer(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcCallPointer(vm, funcptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallStruct(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress, jlong sAddress, jlong returnValueAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    DCpointer returnValue = (DCpointer)(intptr_t)returnValueAddress;
    UNUSED_PARAMS(__env, clazz)
    dcCallStruct(vm, funcptr, s, returnValue);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcGetError(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dcGetError(vm);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_dcNewStruct(JNIEnv *__env, jclass clazz, jlong fieldCount, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcNewStruct((DCsize)fieldCount, (DCint)alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcStructField(JNIEnv *__env, jclass clazz, jlong sAddress, jint type, jint alignment, jlong arrayLength) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    dcStructField(s, (DCint)type, (DCint)alignment, (DCsize)arrayLength);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcSubStruct(JNIEnv *__env, jclass clazz, jlong sAddress, jlong fieldCount, jint alignment, jlong arrayLength) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    dcSubStruct(s, (DCsize)fieldCount, (DCint)alignment, (DCsize)arrayLength);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCloseStruct(JNIEnv *__env, jclass clazz, jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    dcCloseStruct(s);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcStructSize(JNIEnv *__env, jclass clazz, jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcStructSize(s);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcStructAlignment(JNIEnv *__env, jclass clazz, jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcStructAlignment(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcFreeStruct(JNIEnv *__env, jclass clazz, jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    dcFreeStruct(s);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcDefineStruct(JNIEnv *__env, jclass clazz, jlong signatureAddress) {
    char const *signature = (char const *)(intptr_t)signatureAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcDefineStruct(signature);
}

EXTERN_C_EXIT
