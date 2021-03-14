/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

EXTERN_C_ENTER

// memGlobalRefToObject(J)Ljava/lang/Object;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefToObject(JNIEnv *env, jclass clazz,
    jlong globalRef
) {
    UNUSED_PARAMS(env, clazz)
    return (jobject)(intptr_t)globalRef;
}

// static native long getInstanceFieldOffset(String className, String fieldName, String fieldDescriptor, Unsafe unsafeInstance) throws NoSuchFieldError;
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_getInstanceFieldOffset(JNIEnv *env, jclass clazz,
    jstring className, jstring fieldName, jstring fieldDescriptor, jobject unsafeInstance
) {
    UNUSED_PARAMS(env, clazz)

    const char* className_chars = NULL;
    const char* fieldName_chars = NULL;
    const char* fieldDescriptor_chars = NULL;

    jclass targetClass = NULL;
    jclass unsafeClass = NULL;
    jfieldID targetFieldID = NULL;
    jmethodID objectFieldOffsetID = NULL;
    jobject targetField = NULL;

    jlong targetFieldOffset = -1;

    className_chars = (*env)->GetStringUTFChars(env, className, NULL);
    fieldName_chars = (*env)->GetStringUTFChars(env, fieldName, NULL);
    fieldDescriptor_chars = (*env)->GetStringUTFChars(env, fieldDescriptor, NULL);

    fprintf(stdout, "native (before) getInstanceFieldOffset %s %s\n", className_chars, fieldName_chars);

    targetClass = (*env)->FindClass(env, className_chars);
    if ((*env)->ExceptionOccurred(env)) {
        goto cleanup;
    }

    targetFieldID = (*env)->GetFieldID(env, targetClass, fieldName_chars, fieldDescriptor_chars);
    if ((*env)->ExceptionOccurred(env)) {
        goto cleanup;
    }

    targetField = (*env)->ToReflectedField(env, targetClass, targetFieldID, JNI_FALSE);

    unsafeClass = (*env)->GetObjectClass(env, unsafeInstance);
    objectFieldOffsetID = (*env)->GetMethodID(env, unsafeClass, "objectFieldOffset", "(Ljava/lang/reflect/Field;)J");
    targetFieldOffset = (*env)->CallLongMethod(env, unsafeInstance, objectFieldOffsetID, targetField);

    fprintf(stdout, "native (after) getInstanceFieldOffset %s %ld\n", fieldName_chars, targetFieldOffset);
    fflush(stdout);

cleanup:
    if (className_chars != NULL) {
        (*env)->ReleaseStringUTFChars(env, className, className_chars);
    }
    if (fieldName_chars != NULL) {
        (*env)->ReleaseStringUTFChars(env, fieldName, fieldName_chars);
    }
    if (fieldDescriptor_chars != NULL) {
        (*env)->ReleaseStringUTFChars(env, fieldDescriptor, fieldDescriptor_chars);
    }

    return targetFieldOffset;
}

EXTERN_C_EXIT
