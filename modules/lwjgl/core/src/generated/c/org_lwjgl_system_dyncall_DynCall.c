/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "dyncall.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_dcNewCallVM(jlong size) {
    return (jlong)(intptr_t)dcNewCallVM((DCsize)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_dcNewCallVM(JNIEnv *__env, jclass clazz, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_dcNewCallVM(size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcFree(jlong vmAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcFree(vm);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcFree(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcFree(vmAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcReset(jlong vmAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcReset(vm);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcReset(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcReset(vmAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcMode(jlong vmAddress, jint mode) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcMode(vm, (DCint)mode);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcMode(JNIEnv *__env, jclass clazz, jlong vmAddress, jint mode) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcMode(vmAddress, mode);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgBool(jlong vmAddress, jint value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgBool(vm, (DCbool)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgBool(JNIEnv *__env, jclass clazz, jlong vmAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgBool(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgChar(jlong vmAddress, jbyte value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgChar(vm, (DCchar)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgChar(JNIEnv *__env, jclass clazz, jlong vmAddress, jbyte value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgChar(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgShort(jlong vmAddress, jshort value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgShort(vm, (DCshort)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgShort(JNIEnv *__env, jclass clazz, jlong vmAddress, jshort value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgShort(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgInt(jlong vmAddress, jint value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgInt(vm, (DCint)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgInt(JNIEnv *__env, jclass clazz, jlong vmAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgInt(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgLong(jlong vmAddress, jint value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgLong(vm, (DClong)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgLong(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgLongLong(jlong vmAddress, jlong value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgLongLong(vm, (DClonglong)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgLongLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgLongLong(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgFloat(jlong vmAddress, jfloat value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgFloat(vm, (DCfloat)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgFloat(JNIEnv *__env, jclass clazz, jlong vmAddress, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgFloat(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgDouble(jlong vmAddress, jdouble value) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    dcArgDouble(vm, (DCdouble)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgDouble(JNIEnv *__env, jclass clazz, jlong vmAddress, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgDouble(vmAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgPointer(jlong vmAddress, jlong valueAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer value = (DCpointer)(intptr_t)valueAddress;
    dcArgPointer(vm, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgPointer(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgPointer(vmAddress, valueAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgStruct(jlong vmAddress, jlong sAddress, jlong valueAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    DCpointer value = (DCpointer)(intptr_t)valueAddress;
    dcArgStruct(vm, s, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcArgStruct(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong sAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcArgStruct(vmAddress, sAddress, valueAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallVoid(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    dcCallVoid(vm, funcptr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallVoid(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallVoid(vmAddress, funcptrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallBool(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jint)dcCallBool(vm, funcptr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallBool(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallBool(vmAddress, funcptrAddress);
}

JNIEXPORT jbyte JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallChar(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jbyte)dcCallChar(vm, funcptr);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallChar(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallChar(vmAddress, funcptrAddress);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallShort(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jshort)dcCallShort(vm, funcptr);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallShort(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallShort(vmAddress, funcptrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallInt(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jint)dcCallInt(vm, funcptr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallInt(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallInt(vmAddress, funcptrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallLong(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jint)dcCallLong(vm, funcptr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallLong(vmAddress, funcptrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallLongLong(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jlong)dcCallLongLong(vm, funcptr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallLongLong(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallLongLong(vmAddress, funcptrAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallFloat(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jfloat)dcCallFloat(vm, funcptr);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallFloat(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallFloat(vmAddress, funcptrAddress);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallDouble(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jdouble)dcCallDouble(vm, funcptr);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallDouble(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallDouble(vmAddress, funcptrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallPointer(jlong vmAddress, jlong funcptrAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    return (jlong)(intptr_t)dcCallPointer(vm, funcptr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallPointer(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallPointer(vmAddress, funcptrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallStruct(jlong vmAddress, jlong funcptrAddress, jlong sAddress, jlong returnValueAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    DCpointer funcptr = (DCpointer)(intptr_t)funcptrAddress;
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    DCpointer returnValue = (DCpointer)(intptr_t)returnValueAddress;
    dcCallStruct(vm, funcptr, s, returnValue);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCallStruct(JNIEnv *__env, jclass clazz, jlong vmAddress, jlong funcptrAddress, jlong sAddress, jlong returnValueAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCallStruct(vmAddress, funcptrAddress, sAddress, returnValueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcGetError(jlong vmAddress) {
    DCCallVM *vm = (DCCallVM *)(intptr_t)vmAddress;
    return (jint)dcGetError(vm);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcGetError(JNIEnv *__env, jclass clazz, jlong vmAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcGetError(vmAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_dcNewStruct(jlong fieldCount, jint alignment) {
    return (jlong)(intptr_t)dcNewStruct((DCsize)fieldCount, (DCint)alignment);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_dcNewStruct(JNIEnv *__env, jclass clazz, jlong fieldCount, jint alignment) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_dcNewStruct(fieldCount, alignment);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcStructField(jlong sAddress, jint type, jint alignment, jlong arrayLength) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    dcStructField(s, (DCint)type, (DCint)alignment, (DCsize)arrayLength);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcStructField(JNIEnv *__env, jclass clazz, jlong sAddress, jint type, jint alignment, jlong arrayLength) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcStructField(sAddress, type, alignment, arrayLength);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcSubStruct(jlong sAddress, jlong fieldCount, jint alignment, jlong arrayLength) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    dcSubStruct(s, (DCsize)fieldCount, (DCint)alignment, (DCsize)arrayLength);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcSubStruct(JNIEnv *__env, jclass clazz, jlong sAddress, jlong fieldCount, jint alignment, jlong arrayLength) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcSubStruct(sAddress, fieldCount, alignment, arrayLength);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCloseStruct(jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    dcCloseStruct(s);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcCloseStruct(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcCloseStruct(sAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcStructSize(jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    return (jlong)dcStructSize(s);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcStructSize(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcStructSize(sAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcStructAlignment(jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    return (jlong)dcStructAlignment(s);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcStructAlignment(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcStructAlignment(sAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcFreeStruct(jlong sAddress) {
    DCstruct *s = (DCstruct *)(intptr_t)sAddress;
    dcFreeStruct(s);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcFreeStruct(JNIEnv *__env, jclass clazz, jlong sAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcFreeStruct(sAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcDefineStruct(jlong signatureAddress) {
    char const *signature = (char const *)(intptr_t)signatureAddress;
    return (jlong)(intptr_t)dcDefineStruct(signature);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCall_ndcDefineStruct(JNIEnv *__env, jclass clazz, jlong signatureAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCall_ndcDefineStruct(signatureAddress);
}

EXTERN_C_EXIT
