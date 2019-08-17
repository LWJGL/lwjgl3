/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "Yoga.h"
#include "YGLayout.h"
#include "YGStyle.h"
#include <stddef.h>

typedef YGSize (*MeasureWithContextFn)(YGNode*, float, YGMeasureMode, float, YGMeasureMode, void*);
typedef float (*BaselineWithContextFn)(YGNode*, float, float, void*);
typedef void (*PrintWithContextFn)(YGNode*, void*);

typedef struct YGNodeLWJGL {
  void* context;
  bool hasNewLayout : 1;
  bool isReferenceBaseline : 1;
  bool isDirty : 1;
  YGNodeType nodeType : 1;
  bool measureUsesContext : 1;
  bool baselineUsesContext : 1;
  bool printUsesContext : 1;
  union {
    YGMeasureFunc noContext;
    MeasureWithContextFn withContext;
  } measure;
  union {
    YGBaselineFunc noContext;
    BaselineWithContextFn withContext;
  } baseline;
  union {
    YGPrintFunc noContext;
    PrintWithContextFn withContext;
  } print;
  YGDirtiedFunc dirtied;
  YGStyle style;
  YGLayout layout;
  uint32_t lineIndex;
  YGNodeRef owner;
  YGVector children;
  YGConfigRef config;
  std::array<YGValue, 2> resolvedDimensions;
} YGNodeLWJGL;
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGNode_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(intptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = (jint)offsetof(YGNodeLWJGL, context);
    buffer[1] = (jint)offsetof(YGNodeLWJGL, measure);
    buffer[2] = (jint)offsetof(YGNodeLWJGL, measure.noContext);
    buffer[3] = (jint)offsetof(YGNodeLWJGL, measure.withContext);
    buffer[4] = (jint)offsetof(YGNodeLWJGL, baseline);
    buffer[5] = (jint)offsetof(YGNodeLWJGL, baseline.noContext);
    buffer[6] = (jint)offsetof(YGNodeLWJGL, baseline.withContext);
    buffer[7] = (jint)offsetof(YGNodeLWJGL, print);
    buffer[8] = (jint)offsetof(YGNodeLWJGL, print.noContext);
    buffer[9] = (jint)offsetof(YGNodeLWJGL, print.withContext);
    buffer[10] = (jint)offsetof(YGNodeLWJGL, dirtied);
    buffer[11] = (jint)offsetof(YGNodeLWJGL, style);
    buffer[12] = (jint)offsetof(YGNodeLWJGL, layout);
    buffer[13] = (jint)offsetof(YGNodeLWJGL, lineIndex);
    buffer[14] = (jint)offsetof(YGNodeLWJGL, owner);
    buffer[15] = (jint)offsetof(YGNodeLWJGL, children);
    buffer[16] = (jint)offsetof(YGNodeLWJGL, config);
    buffer[17] = (jint)offsetof(YGNodeLWJGL, resolvedDimensions);

    buffer[18] = alignof(YGNodeLWJGL);

    return sizeof(YGNodeLWJGL);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGNode_nhasNewLayout__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jboolean)buffer->hasNewLayout;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGNode_nisReferenceBaseline__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jboolean)buffer->isReferenceBaseline;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGNode_nisDirty__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jboolean)buffer->isDirty;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGNode_nnodeType__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jint)buffer->nodeType;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGNode_nmeasureUsesContext__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jboolean)buffer->measureUsesContext;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGNode_nbaselineUsesContext__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jboolean)buffer->baselineUsesContext;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGNode_nprintUsesContext__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    return (jboolean)buffer->printUsesContext;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nhasNewLayout__JZ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->hasNewLayout = (bool)value;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nisReferenceBaseline__JZ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->isReferenceBaseline = (bool)value;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nisDirty__JZ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->isDirty = (bool)value;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nnodeType__JI(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->nodeType = (YGNodeType)value;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nmeasureUsesContext__JZ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->measureUsesContext = (bool)value;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nbaselineUsesContext__JZ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->baselineUsesContext = (bool)value;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_YGNode_nprintUsesContext__JZ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    YGNodeLWJGL *buffer = (YGNodeLWJGL *)(intptr_t)bufferAddress;
    buffer->printUsesContext = (bool)value;
}

EXTERN_C_EXIT
