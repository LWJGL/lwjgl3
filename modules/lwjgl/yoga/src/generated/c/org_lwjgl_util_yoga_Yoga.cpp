/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

DISABLE_WARNINGS()
#include <yoga/Yoga.h>
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGConfigNew(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGConfigNew();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigFree(JNIEnv *__env, jclass clazz, jlong configAddress) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigFree(config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGConfigGetDefault(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGConfigGetDefault();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetUseWebDefaults(JNIEnv *__env, jclass clazz, jlong configAddress, jboolean enabled) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetUseWebDefaults(config, (bool)enabled);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigGetUseWebDefaults(JNIEnv *__env, jclass clazz, jlong configAddress) {
    YGConfigConstRef config = (YGConfigConstRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGConfigGetUseWebDefaults(config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetPointScaleFactor(JNIEnv *__env, jclass clazz, jlong configAddress, jfloat pixelsInPoint) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetPointScaleFactor(config, pixelsInPoint);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigGetPointScaleFactor(JNIEnv *__env, jclass clazz, jlong configAddress) {
    YGConfigConstRef config = (YGConfigConstRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGConfigGetPointScaleFactor(config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetErrata(JNIEnv *__env, jclass clazz, jlong configAddress, jint errata) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetErrata(config, (YGErrata)errata);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigGetErrata(JNIEnv *__env, jclass clazz, jlong configAddress) {
    YGConfigConstRef config = (YGConfigConstRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGConfigGetErrata(config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetLogger(JNIEnv *__env, jclass clazz, jlong configAddress, jlong loggerAddress) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    YGLogger logger = (YGLogger)(uintptr_t)loggerAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetLogger(config, logger);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetContext(JNIEnv *__env, jclass clazz, jlong configAddress, jlong contextAddress) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    void *context = (void *)(uintptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetContext(config, context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigGetContext(JNIEnv *__env, jclass clazz, jlong configAddress) {
    YGConfigConstRef config = (YGConfigConstRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGConfigGetContext(config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetExperimentalFeatureEnabled(JNIEnv *__env, jclass clazz, jlong configAddress, jint feature, jboolean enabled) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetExperimentalFeatureEnabled(config, (YGExperimentalFeature)feature, (bool)enabled);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigIsExperimentalFeatureEnabled(JNIEnv *__env, jclass clazz, jlong configAddress, jint feature) {
    YGConfigConstRef config = (YGConfigConstRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGConfigIsExperimentalFeatureEnabled(config, (YGExperimentalFeature)feature);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGConfigSetCloneNodeFunc(JNIEnv *__env, jclass clazz, jlong configAddress, jlong callbackAddress) {
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    YGCloneNodeFunc callback = (YGCloneNodeFunc)(uintptr_t)callbackAddress;
    UNUSED_PARAMS(__env, clazz)
    YGConfigSetCloneNodeFunc(config, callback);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_YGNodeNew(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeNew();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeNewWithConfig(JNIEnv *__env, jclass clazz, jlong configAddress) {
    YGConfigConstRef config = (YGConfigConstRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeNewWithConfig(config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeClone(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeClone(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFree(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeFree(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFreeRecursive(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeFreeRecursive(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeFinalize(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeFinalize(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeReset(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeReset(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCalculateLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat availableWidth, jfloat availableHeight, jint ownerDirection) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeCalculateLayout(node, availableWidth, availableHeight, (YGDirection)ownerDirection);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetHasNewLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeGetHasNewLayout(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetHasNewLayout(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean hasNewLayout) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetHasNewLayout(node, (bool)hasNewLayout);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeIsDirty(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeIsDirty(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeMarkDirty(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeMarkDirty(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetDirtiedFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong dirtiedFuncAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGDirtiedFunc dirtiedFunc = (YGDirtiedFunc)(uintptr_t)dirtiedFuncAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetDirtiedFunc(node, dirtiedFunc);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetDirtiedFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeGetDirtiedFunc(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeInsertChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress, jlong index) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGNodeRef child = (YGNodeRef)(uintptr_t)childAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeInsertChild(node, child, (size_t)index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSwapChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress, jlong index) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGNodeRef child = (YGNodeRef)(uintptr_t)childAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSwapChild(node, child, (size_t)index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong childAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGNodeRef child = (YGNodeRef)(uintptr_t)childAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeRemoveChild(node, child);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeRemoveAllChildren(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeRemoveAllChildren(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetChildren(JNIEnv *__env, jclass clazz, jlong ownerAddress, jlong childrenAddress, jlong count) {
    YGNodeRef owner = (YGNodeRef)(uintptr_t)ownerAddress;
    YGNodeRef const *children = (YGNodeRef const *)(uintptr_t)childrenAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetChildren(owner, children, (size_t)count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetChild(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong index) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeGetChild(node, (size_t)index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetChildCount(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)YGNodeGetChildCount(node);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetOwner(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeGetOwner(node);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetParent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeGetParent(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetConfig(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong configAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGConfigRef config = (YGConfigRef)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetConfig(node, config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetConfig(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeGetConfig(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetContext(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong contextAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    void *context = (void *)(uintptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetContext(node, context);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetContext(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeGetContext(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetMeasureFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong measureFuncAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGMeasureFunc measureFunc = (YGMeasureFunc)(uintptr_t)measureFuncAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetMeasureFunc(node, measureFunc);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeHasMeasureFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeHasMeasureFunc(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetBaselineFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong baselineFuncAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    YGBaselineFunc baselineFunc = (YGBaselineFunc)(uintptr_t)baselineFuncAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetBaselineFunc(node, baselineFunc);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeHasBaselineFunc(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeHasBaselineFunc(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetIsReferenceBaseline(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean isReferenceBaseline) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetIsReferenceBaseline(node, (bool)isReferenceBaseline);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeIsReferenceBaseline(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeIsReferenceBaseline(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetNodeType(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint nodeType) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetNodeType(node, (YGNodeType)nodeType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetNodeType(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeGetNodeType(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeSetAlwaysFormsContainingBlock(JNIEnv *__env, jclass clazz, jlong nodeAddress, jboolean alwaysFormsContainingBlock) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeSetAlwaysFormsContainingBlock(node, (bool)alwaysFormsContainingBlock);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeGetAlwaysFormsContainingBlock(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeGetAlwaysFormsContainingBlock(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetLeft(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetLeft(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetTop(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetTop(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetRight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetRight(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBottom(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetBottom(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetWidth(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetHeight(node);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeLayoutGetDirection(node);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetHadOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGNodeLayoutGetHadOverflow(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetMargin(node, (YGEdge)edge);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetBorder(node, (YGEdge)edge);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeLayoutGetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeLayoutGetPadding(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeCopyStyle(JNIEnv *__env, jclass clazz, jlong dstNodeAddress, jlong srcNodeAddress) {
    YGNodeRef dstNode = (YGNodeRef)(uintptr_t)dstNodeAddress;
    YGNodeConstRef srcNode = (YGNodeConstRef)(uintptr_t)srcNodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeCopyStyle(dstNode, srcNode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint direction) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetDirection(node, (YGDirection)direction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetDirection(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint flexDirection) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexDirection(node, (YGFlexDirection)flexDirection);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexDirection(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetFlexDirection(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetJustifyContent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint justifyContent) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetJustifyContent(node, (YGJustify)justifyContent);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetJustifyContent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetJustifyContent(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignContent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignContent) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetAlignContent(node, (YGAlign)alignContent);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignContent(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetAlignContent(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignItems(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignItems) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetAlignItems(node, (YGAlign)alignItems);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignItems(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetAlignItems(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAlignSelf(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint alignSelf) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetAlignSelf(node, (YGAlign)alignSelf);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAlignSelf(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetAlignSelf(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionType(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint positionType) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetPositionType(node, (YGPositionType)positionType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPositionType(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetPositionType(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetPositionAuto(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexWrap(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint flexWrap) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexWrap(node, (YGWrap)flexWrap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexWrap(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetFlexWrap(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint overflow) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetOverflow(node, (YGOverflow)overflow);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetOverflow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetOverflow(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetDisplay(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint display) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetDisplay(node, (YGDisplay)display);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetDisplay(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetDisplay(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlex(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flex) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlex(node, flex);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlex(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeStyleGetFlex(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexGrow(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexGrow) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexGrow(node, flexGrow);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexGrow(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeStyleGetFlexGrow(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexShrink(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexShrink) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexShrink(node, flexShrink);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexShrink(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeStyleGetFlexShrink(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasis(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexBasis) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexBasis(node, flexBasis);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat flexBasis) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexBasisPercent(node, flexBasis);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetFlexBasisAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetFlexBasisAuto(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetFlexBasis(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetFlexBasis(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPosition(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat position) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetPosition(node, (YGEdge)edge, position);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPositionPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat position) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetPositionPercent(node, (YGEdge)edge, position);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPosition(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetPosition(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat margin) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMargin(node, (YGEdge)edge, margin);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat margin) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMarginPercent(node, (YGEdge)edge, margin);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMarginAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMarginAuto(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMargin(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetMargin(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat padding) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetPadding(node, (YGEdge)edge, padding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetPaddingPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat padding) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetPaddingPercent(node, (YGEdge)edge, padding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetPadding(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetPadding(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge, jfloat border) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetBorder(node, (YGEdge)edge, border);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetBorder(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint edge) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeStyleGetBorder(node, (YGEdge)edge);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetGap(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint gutter, jfloat gapLength) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetGap(node, (YGGutter)gutter, gapLength);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetGapPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint gutter, jfloat gapLength) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetGapPercent(node, (YGGutter)gutter, gapLength);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetGap(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint gutter) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeStyleGetGap(node, (YGGutter)gutter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetBoxSizing(JNIEnv *__env, jclass clazz, jlong nodeAddress, jint boxSizing) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetBoxSizing(node, (YGBoxSizing)boxSizing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetBoxSizing(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)YGNodeStyleGetBoxSizing(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat width) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetWidth(node, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat width) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetWidthPercent(node, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetWidthAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetWidthAuto(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetWidth(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat height) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetHeight(node, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat height) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetHeightPercent(node, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetHeightAuto(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetHeightAuto(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetHeight(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minWidth) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMinWidth(node, minWidth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinWidthPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minWidth) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMinWidthPercent(node, minWidth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetMinWidth(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minHeight) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMinHeight(node, minHeight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMinHeightPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat minHeight) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMinHeightPercent(node, minHeight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMinHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetMinHeight(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxWidth) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMaxWidth(node, maxWidth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxWidthPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxWidth) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMaxWidthPercent(node, maxWidth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxWidth(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetMaxWidth(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxHeight) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMaxHeight(node, maxHeight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetMaxHeightPercent(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat maxHeight) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetMaxHeightPercent(node, maxHeight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetMaxHeight(JNIEnv *__env, jclass clazz, jlong nodeAddress, jlong __result) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGNodeStyleGetMaxHeight(node);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleSetAspectRatio(JNIEnv *__env, jclass clazz, jlong nodeAddress, jfloat aspectRatio) {
    YGNodeRef node = (YGNodeRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    YGNodeStyleSetAspectRatio(node, aspectRatio);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeStyleGetAspectRatio(JNIEnv *__env, jclass clazz, jlong nodeAddress) {
    YGNodeConstRef node = (YGNodeConstRef)(uintptr_t)nodeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGNodeStyleGetAspectRatio(node);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_yoga_Yoga_YGRoundValueToPixelGrid(JNIEnv *__env, jclass clazz, jdouble value, jdouble pointScaleFactor, jboolean forceCeil, jboolean forceFloor) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)YGRoundValueToPixelGrid(value, pointScaleFactor, (bool)forceCeil, (bool)forceFloor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGValueAuto(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGValueAuto;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGValueUndefined(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGValueUndefined;
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGValueZero(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((YGValue*)(uintptr_t)__result) = YGValueZero;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_Yoga_YGFloatIsUndefined(JNIEnv *__env, jclass clazz, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)YGFloatIsUndefined(value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGAlignToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGAlignToString((YGAlign)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGDimensionToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGDimensionToString((YGDimension)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGDirectionToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGDirectionToString((YGDirection)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGDisplayToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGDisplayToString((YGDisplay)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGEdgeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGEdgeToString((YGEdge)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGErrataToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGErrataToString((YGErrata)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGExperimentalFeatureToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGExperimentalFeatureToString((YGExperimentalFeature)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGFlexDirectionToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGFlexDirectionToString((YGFlexDirection)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGGutterToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGGutterToString((YGGutter)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGJustifyToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGJustifyToString((YGJustify)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGLogLevelToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGLogLevelToString((YGLogLevel)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGMeasureModeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGMeasureModeToString((YGMeasureMode)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGNodeTypeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGNodeTypeToString((YGNodeType)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGOverflowToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGOverflowToString((YGOverflow)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGPositionTypeToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGPositionTypeToString((YGPositionType)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGUnitToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGUnitToString((YGUnit)value);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_yoga_Yoga_nYGWrapToString(JNIEnv *__env, jclass clazz, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)YGWrapToString((YGWrap)value);
}

EXTERN_C_EXIT
