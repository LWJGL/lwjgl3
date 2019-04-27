/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define FB_ASSERTIONS_ENABLED 0
#define YG_ASSERT(X, message)
DISABLE_WARNINGS()
#include "Yoga.h"
#include "YGMarker.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGNodeNew(void) {
    return (jlong)(intptr_t)YGNodeNew();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGNodeNew(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGNodeNew();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeNewWithConfig(jlong configAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    return (jlong)(intptr_t)YGNodeNewWithConfig(config);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeNewWithConfig(JNIEnv *__env, jclass clazz, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeNewWithConfig(configAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeClone(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jlong)(intptr_t)YGNodeClone(node);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeClone(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeClone(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeFree(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeFree(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFree(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeFree(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursiveWithCleanupFunc(jlong nodeAddress, jlong cleanupAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeCleanupFunc cleanup = (YGNodeCleanupFunc)(intptr_t)cleanupAddress;
    YGNodeFreeRecursiveWithCleanupFunc(node, cleanup);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursiveWithCleanupFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong cleanupAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursiveWithCleanupFunc(nodeAddress, cleanupAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursive(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeFreeRecursive(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursive(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursive(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeReset(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeReset(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeReset(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeReset(nodeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGNodeGetInstanceCount(void) {
    return (jint)YGNodeGetInstanceCount();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_YGNodeGetInstanceCount(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGNodeGetInstanceCount();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeInsertChild(jlong nodeAddress, jlong childAddress, jint index) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeRef const child = (YGNodeRef const)(intptr_t)childAddress;
    YGNodeInsertChild(node, child, (uint32_t)index);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeInsertChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress, jint index) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeInsertChild(nodeAddress, childAddress, index);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveChild(jlong nodeAddress, jlong childAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeRef const child = (YGNodeRef const)(intptr_t)childAddress;
    YGNodeRemoveChild(node, child);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveChild(nodeAddress, childAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveAllChildren(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeRemoveAllChildren(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveAllChildren(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveAllChildren(nodeAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetChild(jlong nodeAddress, jint index) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jlong)(intptr_t)YGNodeGetChild(node, (uint32_t)index);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint index) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetChild(nodeAddress, index);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetOwner(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jlong)(intptr_t)YGNodeGetOwner(node);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetOwner(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetOwner(nodeAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetParent(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jlong)(intptr_t)YGNodeGetParent(node);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetParent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetParent(nodeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetChildCount(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeGetChildCount(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetChildCount(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetChildCount(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetChildren(jlong ownerAddress, jlong childrenAddress, jint count) {
    YGNodeRef const owner = (YGNodeRef const)(intptr_t)ownerAddress;
    YGNodeRef const *children = (YGNodeRef const *)(intptr_t)childrenAddress;
    YGNodeSetChildren(owner, children, (uint32_t)count);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetChildren(JNIEnv *__env, jclass clazz, jlong ownerAddress, jlong childrenAddress, jint count) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetChildren(ownerAddress, childrenAddress, count);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetIsReferenceBaseline(jlong nodeAddress, jboolean isReferenceBaseline) {
    YGNodeRef node = (YGNodeRef)(intptr_t)nodeAddress;
    YGNodeSetIsReferenceBaseline(node, (bool)isReferenceBaseline);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetIsReferenceBaseline(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean isReferenceBaseline) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetIsReferenceBaseline(nodeAddress, isReferenceBaseline);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeIsReferenceBaseline(jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(intptr_t)nodeAddress;
    return (jboolean)YGNodeIsReferenceBaseline(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeIsReferenceBaseline(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeIsReferenceBaseline(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeCalculateLayout(jlong nodeAddress, jfloat availableWidth, jfloat availableHeight, jint ownerDirection) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeCalculateLayout(node, availableWidth, availableHeight, (YGDirection)ownerDirection);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCalculateLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat availableWidth, jfloat availableHeight, jint ownerDirection) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeCalculateLayout(nodeAddress, availableWidth, availableHeight, ownerDirection);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirty(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeMarkDirty(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirty(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirty(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirtyAndPropogateToDescendants(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeMarkDirtyAndPropogateToDescendants(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirtyAndPropogateToDescendants(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirtyAndPropogateToDescendants(nodeAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGFloatIsUndefined(jfloat value) {
    return (jboolean)YGFloatIsUndefined(value);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_YGFloatIsUndefined(JNIEnv *__env, jclass clazz, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGFloatIsUndefined(value);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeCanUseCachedMeasurement(jint widthMode, jfloat width, jint heightMode, jfloat height, jint lastWidthMode, jfloat lastWidth, jint lastHeightMode, jfloat lastHeight, jfloat lastComputedWidth, jfloat lastComputedHeight, jfloat marginRow, jfloat marginColumn, jlong configAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    return (jboolean)YGNodeCanUseCachedMeasurement((YGMeasureMode)widthMode, width, (YGMeasureMode)heightMode, height, (YGMeasureMode)lastWidthMode, lastWidth, (YGMeasureMode)lastHeightMode, lastHeight, lastComputedWidth, lastComputedHeight, marginRow, marginColumn, config);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCanUseCachedMeasurement(JNIEnv *__env, jclass clazz, jint widthMode, jfloat width, jint heightMode, jfloat height, jint lastWidthMode, jfloat lastWidth, jint lastHeightMode, jfloat lastHeight, jfloat lastComputedWidth, jfloat lastComputedHeight, jfloat marginRow, jfloat marginColumn, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeCanUseCachedMeasurement(widthMode, width, heightMode, height, lastWidthMode, lastWidth, lastHeightMode, lastHeight, lastComputedWidth, lastComputedHeight, marginRow, marginColumn, configAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeCopyStyle(jlong dstNodeAddress, jlong srcNodeAddress) {
    YGNodeRef const dstNode = (YGNodeRef const)(intptr_t)dstNodeAddress;
    YGNodeRef const srcNode = (YGNodeRef const)(intptr_t)srcNodeAddress;
    YGNodeCopyStyle(dstNode, srcNode);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCopyStyle(JNIEnv *__env, jclass clazz, jlong dstNodeAddress, jlong srcNodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeCopyStyle(dstNodeAddress, srcNodeAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetContext(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jlong)(intptr_t)YGNodeGetContext(node);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetContext(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetContext(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetContext(jlong nodeAddress, jlong contextAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    void *context = (void *)(intptr_t)contextAddress;
    YGNodeSetContext(node, context);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetContext(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong contextAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetContext(nodeAddress, contextAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetPrintTreeFlag(jlong configAddress, jboolean enabled) {
    YGConfigRef config = (YGConfigRef)(intptr_t)configAddress;
    YGConfigSetPrintTreeFlag(config, (bool)enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetPrintTreeFlag(JNIEnv *__env, jclass clazz, jlong configAddress, jboolean enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetPrintTreeFlag(configAddress, enabled);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeHasMeasureFunc(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeHasMeasureFunc(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeHasMeasureFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeHasMeasureFunc(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetMeasureFunc(jlong nodeAddress, jlong measureFuncAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGMeasureFunc measureFunc = (YGMeasureFunc)(intptr_t)measureFuncAddress;
    YGNodeSetMeasureFunc(node, measureFunc);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetMeasureFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong measureFuncAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetMeasureFunc(nodeAddress, measureFuncAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeHasBaselineFunc(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeHasBaselineFunc(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeHasBaselineFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeHasBaselineFunc(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetBaselineFunc(jlong nodeAddress, jlong baselineFuncAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGBaselineFunc baselineFunc = (YGBaselineFunc)(intptr_t)baselineFuncAddress;
    YGNodeSetBaselineFunc(node, baselineFunc);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetBaselineFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong baselineFuncAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetBaselineFunc(nodeAddress, baselineFuncAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetDirtiedFunc(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jlong)(intptr_t)YGNodeGetDirtiedFunc(node);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetDirtiedFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetDirtiedFunc(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetDirtiedFunc(jlong nodeAddress, jlong dirtiedFuncAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGDirtiedFunc dirtiedFunc = (YGDirtiedFunc)(intptr_t)dirtiedFuncAddress;
    YGNodeSetDirtiedFunc(node, dirtiedFunc);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetDirtiedFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong dirtiedFuncAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetDirtiedFunc(nodeAddress, dirtiedFuncAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetPrintFunc(jlong nodeAddress, jlong printFuncAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGPrintFunc printFunc = (YGPrintFunc)(intptr_t)printFuncAddress;
    YGNodeSetPrintFunc(node, printFunc);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetPrintFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong printFuncAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetPrintFunc(nodeAddress, printFuncAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetHasNewLayout(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeGetHasNewLayout(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetHasNewLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetHasNewLayout(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetHasNewLayout(jlong nodeAddress, jboolean hasNewLayout) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeSetHasNewLayout(node, (bool)hasNewLayout);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetHasNewLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean hasNewLayout) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetHasNewLayout(nodeAddress, hasNewLayout);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetNodeType(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeGetNodeType(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetNodeType(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeGetNodeType(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetNodeType(jlong nodeAddress, jint nodeType) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeSetNodeType(node, (YGNodeType)nodeType);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetNodeType(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint nodeType) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeSetNodeType(nodeAddress, nodeType);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeIsDirty(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeIsDirty(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeIsDirty(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeIsDirty(nodeAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDidUseLegacyFlag(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeLayoutGetDidUseLegacyFlag(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDidUseLegacyFlag(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDidUseLegacyFlag(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDirection(jlong nodeAddress, jint direction) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetDirection(node, (YGDirection)direction);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint direction) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDirection(nodeAddress, direction);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDirection(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetDirection(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDirection(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexDirection(jlong nodeAddress, jint flexDirection) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexDirection(node, (YGFlexDirection)flexDirection);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint flexDirection) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexDirection(nodeAddress, flexDirection);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexDirection(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetFlexDirection(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexDirection(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetJustifyContent(jlong nodeAddress, jint justifyContent) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetJustifyContent(node, (YGJustify)justifyContent);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetJustifyContent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint justifyContent) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetJustifyContent(nodeAddress, justifyContent);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetJustifyContent(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetJustifyContent(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetJustifyContent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetJustifyContent(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignContent(jlong nodeAddress, jint alignContent) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetAlignContent(node, (YGAlign)alignContent);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignContent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignContent) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignContent(nodeAddress, alignContent);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignContent(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetAlignContent(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignContent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignContent(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignItems(jlong nodeAddress, jint alignItems) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetAlignItems(node, (YGAlign)alignItems);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignItems(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignItems) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignItems(nodeAddress, alignItems);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignItems(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetAlignItems(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignItems(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignItems(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignSelf(jlong nodeAddress, jint alignSelf) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetAlignSelf(node, (YGAlign)alignSelf);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignSelf(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignSelf) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignSelf(nodeAddress, alignSelf);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignSelf(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetAlignSelf(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignSelf(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignSelf(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionType(jlong nodeAddress, jint positionType) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetPositionType(node, (YGPositionType)positionType);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionType(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint positionType) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionType(nodeAddress, positionType);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPositionType(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetPositionType(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPositionType(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPositionType(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexWrap(jlong nodeAddress, jint flexWrap) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexWrap(node, (YGWrap)flexWrap);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexWrap(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint flexWrap) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexWrap(nodeAddress, flexWrap);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexWrap(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetFlexWrap(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexWrap(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexWrap(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetOverflow(jlong nodeAddress, jint overflow) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetOverflow(node, (YGOverflow)overflow);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint overflow) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetOverflow(nodeAddress, overflow);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetOverflow(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetOverflow(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetOverflow(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDisplay(jlong nodeAddress, jint display) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetDisplay(node, (YGDisplay)display);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDisplay(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint display) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDisplay(nodeAddress, display);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDisplay(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeStyleGetDisplay(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDisplay(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDisplay(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlex(jlong nodeAddress, jfloat flex) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlex(node, flex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlex(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flex) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlex(nodeAddress, flex);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlex(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeStyleGetFlex(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlex(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlex(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexGrow(jlong nodeAddress, jfloat flexGrow) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexGrow(node, flexGrow);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexGrow(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexGrow) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexGrow(nodeAddress, flexGrow);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexGrow(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeStyleGetFlexGrow(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexGrow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexGrow(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexShrink(jlong nodeAddress, jfloat flexShrink) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexShrink(node, flexShrink);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexShrink(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexShrink) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexShrink(nodeAddress, flexShrink);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexShrink(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeStyleGetFlexShrink(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexShrink(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexShrink(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasis(jlong nodeAddress, jfloat flexBasis) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexBasis(node, flexBasis);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasis(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexBasis) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasis(nodeAddress, flexBasis);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisPercent(jlong nodeAddress, jfloat flexBasis) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexBasisPercent(node, flexBasis);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexBasis) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisPercent(nodeAddress, flexBasis);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisAuto(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetFlexBasisAuto(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisAuto(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexBasis(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetFlexBasis(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexBasis(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexBasis(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPosition(jlong nodeAddress, jint edge, jfloat position) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetPosition(node, (YGEdge)edge, position);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPosition(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat position) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPosition(nodeAddress, edge, position);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionPercent(jlong nodeAddress, jint edge, jfloat position) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetPositionPercent(node, (YGEdge)edge, position);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat position) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionPercent(nodeAddress, edge, position);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPosition(jlong nodeAddress, jint edge, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetPosition(node, (YGEdge)edge);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPosition(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPosition(nodeAddress, edge, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMargin(jlong nodeAddress, jint edge, jfloat margin) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMargin(node, (YGEdge)edge, margin);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat margin) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMargin(nodeAddress, edge, margin);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginPercent(jlong nodeAddress, jint edge, jfloat margin) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMarginPercent(node, (YGEdge)edge, margin);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat margin) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginPercent(nodeAddress, edge, margin);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginAuto(jlong nodeAddress, jint edge) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMarginAuto(node, (YGEdge)edge);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginAuto(nodeAddress, edge);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMargin(jlong nodeAddress, jint edge, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetMargin(node, (YGEdge)edge);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMargin(nodeAddress, edge, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPadding(jlong nodeAddress, jint edge, jfloat padding) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetPadding(node, (YGEdge)edge, padding);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat padding) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPadding(nodeAddress, edge, padding);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPaddingPercent(jlong nodeAddress, jint edge, jfloat padding) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetPaddingPercent(node, (YGEdge)edge, padding);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPaddingPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat padding) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPaddingPercent(nodeAddress, edge, padding);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPadding(jlong nodeAddress, jint edge, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetPadding(node, (YGEdge)edge);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPadding(nodeAddress, edge, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetBorder(jlong nodeAddress, jint edge, jfloat border) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetBorder(node, (YGEdge)edge, border);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat border) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetBorder(nodeAddress, edge, border);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetBorder(jlong nodeAddress, jint edge) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeStyleGetBorder(node, (YGEdge)edge);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetBorder(nodeAddress, edge);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidth(jlong nodeAddress, jfloat width) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetWidth(node, width);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat width) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidth(nodeAddress, width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthPercent(jlong nodeAddress, jfloat width) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetWidthPercent(node, width);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat width) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthPercent(nodeAddress, width);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthAuto(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetWidthAuto(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthAuto(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetWidth(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetWidth(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetWidth(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeight(jlong nodeAddress, jfloat height) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetHeight(node, height);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat height) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeight(nodeAddress, height);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightPercent(jlong nodeAddress, jfloat height) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetHeightPercent(node, height);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat height) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightPercent(nodeAddress, height);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightAuto(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetHeightAuto(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightAuto(nodeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetHeight(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetHeight(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetHeight(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidth(jlong nodeAddress, jfloat minWidth) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMinWidth(node, minWidth);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minWidth) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidth(nodeAddress, minWidth);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidthPercent(jlong nodeAddress, jfloat minWidth) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMinWidthPercent(node, minWidth);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidthPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minWidth) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidthPercent(nodeAddress, minWidth);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinWidth(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetMinWidth(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinWidth(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeight(jlong nodeAddress, jfloat minHeight) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMinHeight(node, minHeight);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minHeight) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeight(nodeAddress, minHeight);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeightPercent(jlong nodeAddress, jfloat minHeight) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMinHeightPercent(node, minHeight);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeightPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minHeight) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeightPercent(nodeAddress, minHeight);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinHeight(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetMinHeight(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinHeight(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidth(jlong nodeAddress, jfloat maxWidth) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMaxWidth(node, maxWidth);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxWidth) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidth(nodeAddress, maxWidth);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidthPercent(jlong nodeAddress, jfloat maxWidth) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMaxWidthPercent(node, maxWidth);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidthPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxWidth) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidthPercent(nodeAddress, maxWidth);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxWidth(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetMaxWidth(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxWidth(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeight(jlong nodeAddress, jfloat maxHeight) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMaxHeight(node, maxHeight);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxHeight) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeight(nodeAddress, maxHeight);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeightPercent(jlong nodeAddress, jfloat maxHeight) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetMaxHeightPercent(node, maxHeight);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeightPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxHeight) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeightPercent(nodeAddress, maxHeight);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxHeight(jlong nodeAddress, jlong __result) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    *((YGValue*)(intptr_t)__result) = YGNodeStyleGetMaxHeight(node);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxHeight(nodeAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAspectRatio(jlong nodeAddress, jfloat aspectRatio) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    YGNodeStyleSetAspectRatio(node, aspectRatio);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAspectRatio(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat aspectRatio) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAspectRatio(nodeAddress, aspectRatio);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAspectRatio(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeStyleGetAspectRatio(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAspectRatio(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAspectRatio(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetLeft(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetLeft(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetLeft(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetLeft(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetTop(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetTop(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetTop(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetTop(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetRight(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetRight(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetRight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetRight(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBottom(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetBottom(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBottom(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBottom(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetWidth(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetWidth(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetWidth(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHeight(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetHeight(node);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHeight(nodeAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDirection(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jint)YGNodeLayoutGetDirection(node);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDirection(nodeAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHadOverflow(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeLayoutGetHadOverflow(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHadOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHadOverflow(nodeAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDidLegacyStretchFlagAffectLayout(jlong nodeAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jboolean)YGNodeLayoutGetDidLegacyStretchFlagAffectLayout(node);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDidLegacyStretchFlagAffectLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDidLegacyStretchFlagAffectLayout(nodeAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetMargin(jlong nodeAddress, jint edge) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetMargin(node, (YGEdge)edge);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetMargin(nodeAddress, edge);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBorder(jlong nodeAddress, jint edge) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetBorder(node, (YGEdge)edge);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBorder(nodeAddress, edge);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetPadding(jlong nodeAddress, jint edge) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    return (jfloat)YGNodeLayoutGetPadding(node, (YGEdge)edge);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetPadding(nodeAddress, edge);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetLogger(jlong configAddress, jlong loggerAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGLogger logger = (YGLogger)(intptr_t)loggerAddress;
    YGConfigSetLogger(config, logger);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetLogger(JNIEnv *__env, jclass clazz, jlong configAddress, jlong loggerAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetLogger(configAddress, loggerAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAssert(jboolean condition, jlong messageAddress) {
    char const *message = (char const *)(intptr_t)messageAddress;
    YGAssert((bool)condition, message);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGAssert(JNIEnv *__env, jclass clazz, jboolean condition, jlong messageAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAssert(condition, messageAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAssertWithNode(jlong nodeAddress, jboolean condition, jlong messageAddress) {
    YGNodeRef const node = (YGNodeRef const)(intptr_t)nodeAddress;
    char const *message = (char const *)(intptr_t)messageAddress;
    YGAssertWithNode(node, (bool)condition, message);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGAssertWithNode(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean condition, jlong messageAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAssertWithNode(nodeAddress, condition, messageAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAssertWithConfig(jlong configAddress, jboolean condition, jlong messageAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    char const *message = (char const *)(intptr_t)messageAddress;
    YGAssertWithConfig(config, (bool)condition, message);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGAssertWithConfig(JNIEnv *__env, jclass clazz, jlong configAddress, jboolean condition, jlong messageAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAssertWithConfig(configAddress, condition, messageAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetPointScaleFactor(jlong configAddress, jfloat pixelsInPoint) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGConfigSetPointScaleFactor(config, pixelsInPoint);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetPointScaleFactor(JNIEnv *__env, jclass clazz, jlong configAddress, jfloat pixelsInPoint) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetPointScaleFactor(configAddress, pixelsInPoint);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(jlong configAddress, jboolean shouldDiffLayout) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(config, (bool)shouldDiffLayout);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(JNIEnv *__env, jclass clazz, jlong configAddress, jboolean shouldDiffLayout) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(configAddress, shouldDiffLayout);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseLegacyStretchBehaviour(jlong configAddress, jboolean useLegacyStretchBehaviour) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGConfigSetUseLegacyStretchBehaviour(config, (bool)useLegacyStretchBehaviour);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseLegacyStretchBehaviour(JNIEnv *__env, jclass clazz, jlong configAddress, jboolean useLegacyStretchBehaviour) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseLegacyStretchBehaviour(configAddress, useLegacyStretchBehaviour);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGConfigNew(void) {
    return (jlong)(intptr_t)YGConfigNew();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGConfigNew(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGConfigNew();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigFree(jlong configAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGConfigFree(config);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigFree(JNIEnv *__env, jclass clazz, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigFree(configAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigCopy(jlong destAddress, jlong srcAddress) {
    YGConfigRef const dest = (YGConfigRef const)(intptr_t)destAddress;
    YGConfigRef const src = (YGConfigRef const)(intptr_t)srcAddress;
    YGConfigCopy(dest, src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigCopy(JNIEnv *__env, jclass clazz, jlong destAddress, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigCopy(destAddress, srcAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGConfigGetInstanceCount(void) {
    return (jint)YGConfigGetInstanceCount();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_YGConfigGetInstanceCount(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGConfigGetInstanceCount();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetExperimentalFeatureEnabled(jlong configAddress, jint feature, jboolean enabled) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGConfigSetExperimentalFeatureEnabled(config, (YGExperimentalFeature)feature, (bool)enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetExperimentalFeatureEnabled(JNIEnv *__env, jclass clazz, jlong configAddress, jint feature, jboolean enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetExperimentalFeatureEnabled(configAddress, feature, enabled);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigIsExperimentalFeatureEnabled(jlong configAddress, jint feature) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    return (jboolean)YGConfigIsExperimentalFeatureEnabled(config, (YGExperimentalFeature)feature);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigIsExperimentalFeatureEnabled(JNIEnv *__env, jclass clazz, jlong configAddress, jint feature) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigIsExperimentalFeatureEnabled(configAddress, feature);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseWebDefaults(jlong configAddress, jboolean enabled) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGConfigSetUseWebDefaults(config, (bool)enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseWebDefaults(JNIEnv *__env, jclass clazz, jlong configAddress, jboolean enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseWebDefaults(configAddress, enabled);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigGetUseWebDefaults(jlong configAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    return (jboolean)YGConfigGetUseWebDefaults(config);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigGetUseWebDefaults(JNIEnv *__env, jclass clazz, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigGetUseWebDefaults(configAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetCloneNodeFunc(jlong configAddress, jlong callbackAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    YGCloneNodeFunc callback = (YGCloneNodeFunc)(intptr_t)callbackAddress;
    YGConfigSetCloneNodeFunc(config, callback);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetCloneNodeFunc(JNIEnv *__env, jclass clazz, jlong configAddress, jlong callbackAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetCloneNodeFunc(configAddress, callbackAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGConfigGetDefault(void) {
    return (jlong)(intptr_t)YGConfigGetDefault();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGConfigGetDefault(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGConfigGetDefault();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetContext(jlong configAddress, jlong contextAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    void *context = (void *)(intptr_t)contextAddress;
    YGConfigSetContext(config, context);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetContext(JNIEnv *__env, jclass clazz, jlong configAddress, jlong contextAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetContext(configAddress, contextAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigGetContext(jlong configAddress) {
    YGConfigRef const config = (YGConfigRef const)(intptr_t)configAddress;
    return (jlong)(intptr_t)YGConfigGetContext(config);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigGetContext(JNIEnv *__env, jclass clazz, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigGetContext(configAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetMarkerCallbacks(jlong configAddress, jlong callbacksAddress) {
    YGConfigRef config = (YGConfigRef)(intptr_t)configAddress;
    YGMarkerCallbacks *callbacks = (YGMarkerCallbacks *)(intptr_t)callbacksAddress;
    YGConfigSetMarkerCallbacks(config, *callbacks);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetMarkerCallbacks(JNIEnv *__env, jclass clazz, jlong configAddress, jlong callbacksAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGConfigSetMarkerCallbacks(configAddress, callbacksAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_YGRoundValueToPixelGrid(jfloat value, jfloat pointScaleFactor, jboolean forceCeil, jboolean forceFloor) {
    return (jfloat)YGRoundValueToPixelGrid(value, pointScaleFactor, (bool)forceCeil, (bool)forceFloor);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_YGRoundValueToPixelGrid(JNIEnv *__env, jclass clazz, jfloat value, jfloat pointScaleFactor, jboolean forceCeil, jboolean forceFloor) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_YGRoundValueToPixelGrid(value, pointScaleFactor, forceCeil, forceFloor);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAlignToString(jint value) {
    return (jlong)(intptr_t)YGAlignToString((YGAlign)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGAlignToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGAlignToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGDimensionToString(jint value) {
    return (jlong)(intptr_t)YGDimensionToString((YGDimension)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGDimensionToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGDimensionToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGDirectionToString(jint value) {
    return (jlong)(intptr_t)YGDirectionToString((YGDirection)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGDirectionToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGDirectionToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGDisplayToString(jint value) {
    return (jlong)(intptr_t)YGDisplayToString((YGDisplay)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGDisplayToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGDisplayToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGEdgeToString(jint value) {
    return (jlong)(intptr_t)YGEdgeToString((YGEdge)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGEdgeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGEdgeToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGExperimentalFeatureToString(jint value) {
    return (jlong)(intptr_t)YGExperimentalFeatureToString((YGExperimentalFeature)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGExperimentalFeatureToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGExperimentalFeatureToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGFlexDirectionToString(jint value) {
    return (jlong)(intptr_t)YGFlexDirectionToString((YGFlexDirection)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGFlexDirectionToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGFlexDirectionToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGJustifyToString(jint value) {
    return (jlong)(intptr_t)YGJustifyToString((YGJustify)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGJustifyToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGJustifyToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGLogLevelToString(jint value) {
    return (jlong)(intptr_t)YGLogLevelToString((YGLogLevel)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGLogLevelToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGLogLevelToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGMeasureModeToString(jint value) {
    return (jlong)(intptr_t)YGMeasureModeToString((YGMeasureMode)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGMeasureModeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGMeasureModeToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeTypeToString(jint value) {
    return (jlong)(intptr_t)YGNodeTypeToString((YGNodeType)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeTypeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGNodeTypeToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGOverflowToString(jint value) {
    return (jlong)(intptr_t)YGOverflowToString((YGOverflow)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGOverflowToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGOverflowToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGPositionTypeToString(jint value) {
    return (jlong)(intptr_t)YGPositionTypeToString((YGPositionType)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGPositionTypeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGPositionTypeToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGUnitToString(jint value) {
    return (jlong)(intptr_t)YGUnitToString((YGUnit)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGUnitToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGUnitToString(value);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGWrapToString(jint value) {
    return (jlong)(intptr_t)YGWrapToString((YGWrap)value);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGWrapToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_yoga_Yoga_nYGWrapToString(value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGValueAuto(jlong __result) {
    *((YGValue*)(intptr_t)__result) = YGValueAuto;
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGValueAuto(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGValueAuto(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGValueUndefined(jlong __result) {
    *((YGValue*)(intptr_t)__result) = YGValueUndefined;
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGValueUndefined(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGValueUndefined(__result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_yoga_Yoga_nYGValueZero(jlong __result) {
    *((YGValue*)(intptr_t)__result) = YGValueZero;
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGValueZero(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_yoga_Yoga_nYGValueZero(__result);
}

EXTERN_C_EXIT
