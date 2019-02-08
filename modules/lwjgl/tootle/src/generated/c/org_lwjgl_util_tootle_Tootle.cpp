/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "tootlelib.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tootle_Tootle_TootleInit(void) {
    return (jint)TootleInit();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_TootleInit(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tootle_Tootle_TootleInit();
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimizeVCache__JIIIJJI)(jlong pnIBAddress, jint nFaces, jint nVertices, jint nCacheSize, jlong pnIBOutAddress, jlong pnFaceRemapOutAddress, jint eVCacheOptimizer) {
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnFaceRemapOut = (unsigned int *)(intptr_t)pnFaceRemapOutAddress;
    return (jint)TootleOptimizeVCache(pnIB, (unsigned int)nFaces, (unsigned int)nVertices, (unsigned int)nCacheSize, pnIBOut, pnFaceRemapOut, (TootleVCacheOptimizer)eVCacheOptimizer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleOptimizeVCache__JIIIJJI(JNIEnv *__env, jclass clazz, jlong pnIBAddress, jint nFaces, jint nVertices, jint nCacheSize, jlong pnIBOutAddress, jlong pnFaceRemapOutAddress, jint eVCacheOptimizer) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimizeVCache__JIIIJJI)(pnIBAddress, nFaces, nVertices, nCacheSize, pnIBOutAddress, pnFaceRemapOutAddress, eVCacheOptimizer);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleClusterMesh__JJIIIIJJJ)(jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jint nTargetClusters, jlong pnClusteredIBOutAddress, jlong pnFaceClustersOutAddress, jlong pnFaceRemapOutAddress) {
    void const *pVB = (void const *)(intptr_t)pVBAddress;
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    unsigned int *pnClusteredIBOut = (unsigned int *)(intptr_t)pnClusteredIBOutAddress;
    unsigned int *pnFaceClustersOut = (unsigned int *)(intptr_t)pnFaceClustersOutAddress;
    unsigned int *pnFaceRemapOut = (unsigned int *)(intptr_t)pnFaceRemapOutAddress;
    return (jint)TootleClusterMesh(pVB, pnIB, (unsigned int)nVertices, (unsigned int)nFaces, (unsigned int)nVBStride, (unsigned int)nTargetClusters, pnClusteredIBOut, pnFaceClustersOut, pnFaceRemapOut);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleClusterMesh__JJIIIIJJJ(JNIEnv *__env, jclass clazz, jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jint nTargetClusters, jlong pnClusteredIBOutAddress, jlong pnFaceClustersOutAddress, jlong pnFaceRemapOutAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleClusterMesh__JJIIIIJJJ)(pVBAddress, pnIBAddress, nVertices, nFaces, nVBStride, nTargetClusters, pnClusteredIBOutAddress, pnFaceClustersOutAddress, pnFaceRemapOutAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleFastOptimizeVCacheAndClusterMesh__JIIIJJJF)(jlong pnIBAddress, jint nFaces, jint nVertices, jint nCacheSize, jlong pnIBOutAddress, jlong pnClustersOutAddress, jlong pnNumClustersOutAddress, jfloat fAlpha) {
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnClustersOut = (unsigned int *)(intptr_t)pnClustersOutAddress;
    unsigned int *pnNumClustersOut = (unsigned int *)(intptr_t)pnNumClustersOutAddress;
    return (jint)TootleFastOptimizeVCacheAndClusterMesh(pnIB, (unsigned int)nFaces, (unsigned int)nVertices, (unsigned int)nCacheSize, pnIBOut, pnClustersOut, pnNumClustersOut, fAlpha);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleFastOptimizeVCacheAndClusterMesh__JIIIJJJF(JNIEnv *__env, jclass clazz, jlong pnIBAddress, jint nFaces, jint nVertices, jint nCacheSize, jlong pnIBOutAddress, jlong pnClustersOutAddress, jlong pnNumClustersOutAddress, jfloat fAlpha) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleFastOptimizeVCacheAndClusterMesh__JIIIJJJF)(pnIBAddress, nFaces, nVertices, nCacheSize, pnIBOutAddress, pnClustersOutAddress, pnNumClustersOutAddress, fAlpha);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimizeOverdraw__JJIIIJIIJJJI)(jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jlong pfViewpointAddress, jint nViewpoints, jint eFrontWinding, jlong pnFaceClustersAddress, jlong pnIBOutAddress, jlong pnClusterRemapOutAddress, jint eOverdrawOptimizer) {
    void const *pVB = (void const *)(intptr_t)pVBAddress;
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    float const *pfViewpoint = (float const *)(intptr_t)pfViewpointAddress;
    unsigned int const *pnFaceClusters = (unsigned int const *)(intptr_t)pnFaceClustersAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnClusterRemapOut = (unsigned int *)(intptr_t)pnClusterRemapOutAddress;
    return (jint)TootleOptimizeOverdraw(pVB, pnIB, (unsigned int)nVertices, (unsigned int)nFaces, (unsigned int)nVBStride, pfViewpoint, (unsigned int)nViewpoints, (TootleFaceWinding)eFrontWinding, pnFaceClusters, pnIBOut, pnClusterRemapOut, (TootleOverdrawOptimizer)eOverdrawOptimizer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleOptimizeOverdraw__JJIIIJIIJJJI(JNIEnv *__env, jclass clazz, jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jlong pfViewpointAddress, jint nViewpoints, jint eFrontWinding, jlong pnFaceClustersAddress, jlong pnIBOutAddress, jlong pnClusterRemapOutAddress, jint eOverdrawOptimizer) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimizeOverdraw__JJIIIJIIJJJI)(pVBAddress, pnIBAddress, nVertices, nFaces, nVBStride, pfViewpointAddress, nViewpoints, eFrontWinding, pnFaceClustersAddress, pnIBOutAddress, pnClusterRemapOutAddress, eOverdrawOptimizer);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_tootle_Tootle_TootleCleanup(void) {
    TootleCleanup();
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_tootle_Tootle_TootleCleanup(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_tootle_Tootle_TootleCleanup();
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimize__JJIIIIJIIJJII)(jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jint nCacheSize, jlong pViewpointsAddress, jint nViewpoints, jint eFrontWinding, jlong pnIBOutAddress, jlong pnNumClustersOutAddress, jint eVCacheOptimizer, jint eOverdrawOptimizer) {
    void const *pVB = (void const *)(intptr_t)pVBAddress;
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    float const *pViewpoints = (float const *)(intptr_t)pViewpointsAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnNumClustersOut = (unsigned int *)(intptr_t)pnNumClustersOutAddress;
    return (jint)TootleOptimize(pVB, pnIB, (unsigned int)nVertices, (unsigned int)nFaces, (unsigned int)nVBStride, (unsigned int)nCacheSize, pViewpoints, (unsigned int)nViewpoints, (TootleFaceWinding)eFrontWinding, pnIBOut, pnNumClustersOut, (TootleVCacheOptimizer)eVCacheOptimizer, (TootleOverdrawOptimizer)eOverdrawOptimizer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleOptimize__JJIIIIJIIJJII(JNIEnv *__env, jclass clazz, jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jint nCacheSize, jlong pViewpointsAddress, jint nViewpoints, jint eFrontWinding, jlong pnIBOutAddress, jlong pnNumClustersOutAddress, jint eVCacheOptimizer, jint eOverdrawOptimizer) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimize__JJIIIIJIIJJII)(pVBAddress, pnIBAddress, nVertices, nFaces, nVBStride, nCacheSize, pViewpointsAddress, nViewpoints, eFrontWinding, pnIBOutAddress, pnNumClustersOutAddress, eVCacheOptimizer, eOverdrawOptimizer);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleFastOptimize__JJIIIIIJJF)(jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jint nCacheSize, jint eFrontWinding, jlong pnIBOutAddress, jlong pnNumClustersOutAddress, jfloat fAlpha) {
    void const *pVB = (void const *)(intptr_t)pVBAddress;
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnNumClustersOut = (unsigned int *)(intptr_t)pnNumClustersOutAddress;
    return (jint)TootleFastOptimize(pVB, pnIB, (unsigned int)nVertices, (unsigned int)nFaces, (unsigned int)nVBStride, (unsigned int)nCacheSize, (TootleFaceWinding)eFrontWinding, pnIBOut, pnNumClustersOut, fAlpha);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleFastOptimize__JJIIIIIJJF(JNIEnv *__env, jclass clazz, jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jint nCacheSize, jint eFrontWinding, jlong pnIBOutAddress, jlong pnNumClustersOutAddress, jfloat fAlpha) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleFastOptimize__JJIIIIIJJF)(pVBAddress, pnIBAddress, nVertices, nFaces, nVBStride, nCacheSize, eFrontWinding, pnIBOutAddress, pnNumClustersOutAddress, fAlpha);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleVCacheClusters__JIIIJJJI)(jlong pnIBAddress, jint nFaces, jint nVertices, jint nCacheSize, jlong pnFaceClustersAddress, jlong pnIBOutAddress, jlong pnFaceRemapOutAddress, jint eVCacheOptimizer) {
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    unsigned int const *pnFaceClusters = (unsigned int const *)(intptr_t)pnFaceClustersAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnFaceRemapOut = (unsigned int *)(intptr_t)pnFaceRemapOutAddress;
    return (jint)TootleVCacheClusters(pnIB, (unsigned int)nFaces, (unsigned int)nVertices, (unsigned int)nCacheSize, pnFaceClusters, pnIBOut, pnFaceRemapOut, (TootleVCacheOptimizer)eVCacheOptimizer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleVCacheClusters__JIIIJJJI(JNIEnv *__env, jclass clazz, jlong pnIBAddress, jint nFaces, jint nVertices, jint nCacheSize, jlong pnFaceClustersAddress, jlong pnIBOutAddress, jlong pnFaceRemapOutAddress, jint eVCacheOptimizer) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleVCacheClusters__JIIIJJJI)(pnIBAddress, nFaces, nVertices, nCacheSize, pnFaceClustersAddress, pnIBOutAddress, pnFaceRemapOutAddress, eVCacheOptimizer);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tootle_Tootle_nTootleMeasureCacheEfficiency__JIIJ(jlong pnIBAddress, jint nFaces, jint nCacheSize, jlong pfEfficiencyOutAddress) {
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    float *pfEfficiencyOut = (float *)(intptr_t)pfEfficiencyOutAddress;
    return (jint)TootleMeasureCacheEfficiency(pnIB, (unsigned int)nFaces, (unsigned int)nCacheSize, pfEfficiencyOut);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleMeasureCacheEfficiency__JIIJ(JNIEnv *__env, jclass clazz, jlong pnIBAddress, jint nFaces, jint nCacheSize, jlong pfEfficiencyOutAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tootle_Tootle_nTootleMeasureCacheEfficiency__JIIJ(pnIBAddress, nFaces, nCacheSize, pfEfficiencyOutAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleMeasureOverdraw__JJIIIJIIJJI)(jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jlong pfViewpointAddress, jint nViewpoints, jint eFrontWinding, jlong pfAvgODOutAddress, jlong pfMaxODOutAddress, jint eOverdrawOptimizer) {
    void const *pVB = (void const *)(intptr_t)pVBAddress;
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    float const *pfViewpoint = (float const *)(intptr_t)pfViewpointAddress;
    float *pfAvgODOut = (float *)(intptr_t)pfAvgODOutAddress;
    float *pfMaxODOut = (float *)(intptr_t)pfMaxODOutAddress;
    return (jint)TootleMeasureOverdraw(pVB, pnIB, (unsigned int)nVertices, (unsigned int)nFaces, (unsigned int)nVBStride, pfViewpoint, (unsigned int)nViewpoints, (TootleFaceWinding)eFrontWinding, pfAvgODOut, pfMaxODOut, (TootleOverdrawOptimizer)eOverdrawOptimizer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleMeasureOverdraw__JJIIIJIIJJI(JNIEnv *__env, jclass clazz, jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jlong pfViewpointAddress, jint nViewpoints, jint eFrontWinding, jlong pfAvgODOutAddress, jlong pfMaxODOutAddress, jint eOverdrawOptimizer) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleMeasureOverdraw__JJIIIJIIJJI)(pVBAddress, pnIBAddress, nVertices, nFaces, nVBStride, pfViewpointAddress, nViewpoints, eFrontWinding, pfAvgODOutAddress, pfMaxODOutAddress, eOverdrawOptimizer);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimizeVertexMemory__JJIIIJJJ)(jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jlong pVBOutAddress, jlong pnIBOutAddress, jlong pnVertexRemapOutAddress) {
    void const *pVB = (void const *)(intptr_t)pVBAddress;
    unsigned int const *pnIB = (unsigned int const *)(intptr_t)pnIBAddress;
    void *pVBOut = (void *)(intptr_t)pVBOutAddress;
    unsigned int *pnIBOut = (unsigned int *)(intptr_t)pnIBOutAddress;
    unsigned int *pnVertexRemapOut = (unsigned int *)(intptr_t)pnVertexRemapOutAddress;
    return (jint)TootleOptimizeVertexMemory(pVB, pnIB, (unsigned int)nVertices, (unsigned int)nFaces, (unsigned int)nVBStride, pVBOut, pnIBOut, pnVertexRemapOut);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tootle_Tootle_nTootleOptimizeVertexMemory__JJIIIJJJ(JNIEnv *__env, jclass clazz, jlong pVBAddress, jlong pnIBAddress, jint nVertices, jint nFaces, jint nVBStride, jlong pVBOutAddress, jlong pnIBOutAddress, jlong pnVertexRemapOutAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tootle_Tootle_nTootleOptimizeVertexMemory__JJIIIJJJ)(pVBAddress, pnIBAddress, nVertices, nFaces, nVBStride, pVBOutAddress, pnIBOutAddress, pnVertexRemapOutAddress);
}

EXTERN_C_EXIT
