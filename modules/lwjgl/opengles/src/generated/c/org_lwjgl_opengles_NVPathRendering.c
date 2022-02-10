/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glPathCommandsNVPROC) (jint, jint, uintptr_t, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathCoordsNVPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathSubCommandsNVPROC) (jint, jint, jint, jint, uintptr_t, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathSubCoordsNVPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathStringNVPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathGlyphsNVPROC) (jint, jint, uintptr_t, jint, jint, jint, uintptr_t, jint, jint, jfloat);
typedef void (APIENTRY *glPathGlyphRangeNVPROC) (jint, jint, uintptr_t, jint, jint, jint, jint, jint, jfloat);
typedef jint (APIENTRY *glPathGlyphIndexArrayNVPROC) (jint, jint, uintptr_t, jint, jint, jint, jint, jfloat);
typedef jint (APIENTRY *glPathMemoryGlyphIndexArrayNVPROC) (jint, jint, uintptr_t, uintptr_t, jint, jint, jint, jint, jfloat);
typedef void (APIENTRY *glCopyPathNVPROC) (jint, jint);
typedef void (APIENTRY *glWeightPathsNVPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glInterpolatePathsNVPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glTransformPathNVPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathParameterivNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glPathParameteriNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glPathParameterfvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glPathParameterfNVPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glPathDashArrayNVPROC) (jint, jint, uintptr_t);
typedef jint (APIENTRY *glGenPathsNVPROC) (jint);
typedef void (APIENTRY *glDeletePathsNVPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsPathNVPROC) (jint);
typedef void (APIENTRY *glPathStencilFuncNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glPathStencilDepthOffsetNVPROC) (jfloat, jfloat);
typedef void (APIENTRY *glStencilFillPathNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilStrokePathNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilFillPathInstancedNVPROC) (jint, jint, uintptr_t, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glStencilStrokePathInstancedNVPROC) (jint, jint, uintptr_t, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPathCoverDepthFuncNVPROC) (jint);
typedef void (APIENTRY *glCoverFillPathNVPROC) (jint, jint);
typedef void (APIENTRY *glCoverStrokePathNVPROC) (jint, jint);
typedef void (APIENTRY *glCoverFillPathInstancedNVPROC) (jint, jint, uintptr_t, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCoverStrokePathInstancedNVPROC) (jint, jint, uintptr_t, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glStencilThenCoverFillPathNVPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilThenCoverStrokePathNVPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilThenCoverFillPathInstancedNVPROC) (jint, jint, uintptr_t, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glStencilThenCoverStrokePathInstancedNVPROC) (jint, jint, uintptr_t, jint, jint, jint, jint, jint, uintptr_t);
typedef jint (APIENTRY *glPathGlyphIndexRangeNVPROC) (jint, uintptr_t, jint, jint, jfloat, jint);
typedef void (APIENTRY *glProgramPathFragmentInputGenNVPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPathParameterivNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPathParameterfvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPathCommandsNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetPathCoordsNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetPathDashArrayNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetPathMetricsNVPROC) (jint, jint, jint, uintptr_t, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPathMetricRangeNVPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPathSpacingNVPROC) (jint, jint, jint, uintptr_t, jint, jfloat, jfloat, jint, uintptr_t);
typedef jboolean (APIENTRY *glIsPointInFillPathNVPROC) (jint, jint, jfloat, jfloat);
typedef jboolean (APIENTRY *glIsPointInStrokePathNVPROC) (jint, jfloat, jfloat);
typedef jfloat (APIENTRY *glGetPathLengthNVPROC) (jint, jint, jint);
typedef jboolean (APIENTRY *glPointAlongPathNVPROC) (jint, jint, jint, jfloat, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glMatrixLoad3x2fNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixLoad3x3fNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixLoadTranspose3x3fNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMult3x2fNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMult3x3fNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMultTranspose3x3fNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetProgramResourcefvNVPROC) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathCommandsNV__IIJIIJ(JNIEnv *__env, jclass clazz, jint path, jint numCommands, jlong commandsAddress, jint numCoords, jint coordType, jlong coordsAddress) {
    glPathCommandsNVPROC glPathCommandsNV = (glPathCommandsNVPROC)tlsGetFunction(696);
    uintptr_t commands = (uintptr_t)commandsAddress;
    uintptr_t coords = (uintptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glPathCommandsNV(path, numCommands, commands, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathCoordsNV__IIIJ(JNIEnv *__env, jclass clazz, jint path, jint numCoords, jint coordType, jlong coordsAddress) {
    glPathCoordsNVPROC glPathCoordsNV = (glPathCoordsNVPROC)tlsGetFunction(697);
    uintptr_t coords = (uintptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glPathCoordsNV(path, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathSubCommandsNV__IIIIJIIJ(JNIEnv *__env, jclass clazz, jint path, jint commandStart, jint commandsToDelete, jint numCommands, jlong commandsAddress, jint numCoords, jint coordType, jlong coordsAddress) {
    glPathSubCommandsNVPROC glPathSubCommandsNV = (glPathSubCommandsNVPROC)tlsGetFunction(698);
    uintptr_t commands = (uintptr_t)commandsAddress;
    uintptr_t coords = (uintptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glPathSubCommandsNV(path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathSubCoordsNV__IIIIJ(JNIEnv *__env, jclass clazz, jint path, jint coordStart, jint numCoords, jint coordType, jlong coordsAddress) {
    glPathSubCoordsNVPROC glPathSubCoordsNV = (glPathSubCoordsNVPROC)tlsGetFunction(699);
    uintptr_t coords = (uintptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glPathSubCoordsNV(path, coordStart, numCoords, coordType, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathStringNV(JNIEnv *__env, jclass clazz, jint path, jint format, jint length, jlong pathStringAddress) {
    glPathStringNVPROC glPathStringNV = (glPathStringNVPROC)tlsGetFunction(700);
    uintptr_t pathString = (uintptr_t)pathStringAddress;
    UNUSED_PARAM(clazz)
    glPathStringNV(path, format, length, pathString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathGlyphsNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint numGlyphs, jint type, jlong charcodesAddress, jint handleMissingGlyphs, jint pathParameterTemplate, jfloat emScale) {
    glPathGlyphsNVPROC glPathGlyphsNV = (glPathGlyphsNVPROC)tlsGetFunction(701);
    uintptr_t fontName = (uintptr_t)fontNameAddress;
    uintptr_t charcodes = (uintptr_t)charcodesAddress;
    UNUSED_PARAM(clazz)
    glPathGlyphsNV(firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathGlyphRangeNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint firstGlyph, jint numGlyphs, jint handleMissingGlyphs, jint pathParameterTemplate, jfloat emScale) {
    glPathGlyphRangeNVPROC glPathGlyphRangeNV = (glPathGlyphRangeNVPROC)tlsGetFunction(702);
    uintptr_t fontName = (uintptr_t)fontNameAddress;
    UNUSED_PARAM(clazz)
    glPathGlyphRangeNV(firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathGlyphIndexArrayNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint firstGlyphIndex, jint numGlyphs, jint pathParameterTemplate, jfloat emScale) {
    glPathGlyphIndexArrayNVPROC glPathGlyphIndexArrayNV = (glPathGlyphIndexArrayNVPROC)tlsGetFunction(703);
    uintptr_t fontName = (uintptr_t)fontNameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glPathGlyphIndexArrayNV(firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathMemoryGlyphIndexArrayNV(JNIEnv *__env, jclass clazz, jint firstPathName, jint fontTarget, jlong fontSize, jlong fontDataAddress, jint faceIndex, jint firstGlyphIndex, jint numGlyphs, jint pathParameterTemplate, jfloat emScale) {
    glPathMemoryGlyphIndexArrayNVPROC glPathMemoryGlyphIndexArrayNV = (glPathMemoryGlyphIndexArrayNVPROC)tlsGetFunction(704);
    uintptr_t fontData = (uintptr_t)fontDataAddress;
    UNUSED_PARAM(clazz)
    return (jint)glPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, (uintptr_t)fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glCopyPathNV(JNIEnv *__env, jclass clazz, jint resultPath, jint srcPath) {
    glCopyPathNVPROC glCopyPathNV = (glCopyPathNVPROC)tlsGetFunction(705);
    UNUSED_PARAM(clazz)
    glCopyPathNV(resultPath, srcPath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglWeightPathsNV__IIJJ(JNIEnv *__env, jclass clazz, jint resultPath, jint numPaths, jlong pathsAddress, jlong weightsAddress) {
    glWeightPathsNVPROC glWeightPathsNV = (glWeightPathsNVPROC)tlsGetFunction(706);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightPathsNV(resultPath, numPaths, paths, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glInterpolatePathsNV(JNIEnv *__env, jclass clazz, jint resultPath, jint pathA, jint pathB, jfloat weight) {
    glInterpolatePathsNVPROC glInterpolatePathsNV = (glInterpolatePathsNVPROC)tlsGetFunction(707);
    UNUSED_PARAM(clazz)
    glInterpolatePathsNV(resultPath, pathA, pathB, weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglTransformPathNV__IIIJ(JNIEnv *__env, jclass clazz, jint resultPath, jint srcPath, jint transformType, jlong transformValuesAddress) {
    glTransformPathNVPROC glTransformPathNV = (glTransformPathNVPROC)tlsGetFunction(708);
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glTransformPathNV(resultPath, srcPath, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathParameterivNV__IIJ(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress) {
    glPathParameterivNVPROC glPathParameterivNV = (glPathParameterivNVPROC)tlsGetFunction(709);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glPathParameterivNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glPathParameteriNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jint value) {
    glPathParameteriNVPROC glPathParameteriNV = (glPathParameteriNVPROC)tlsGetFunction(710);
    UNUSED_PARAM(clazz)
    glPathParameteriNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathParameterfvNV__IIJ(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress) {
    glPathParameterfvNVPROC glPathParameterfvNV = (glPathParameterfvNVPROC)tlsGetFunction(711);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glPathParameterfvNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glPathParameterfNV(JNIEnv *__env, jclass clazz, jint path, jint pname, jfloat value) {
    glPathParameterfNVPROC glPathParameterfNV = (glPathParameterfNVPROC)tlsGetFunction(712);
    UNUSED_PARAM(clazz)
    glPathParameterfNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathDashArrayNV__IIJ(JNIEnv *__env, jclass clazz, jint path, jint dashCount, jlong dashArrayAddress) {
    glPathDashArrayNVPROC glPathDashArrayNV = (glPathDashArrayNVPROC)tlsGetFunction(713);
    uintptr_t dashArray = (uintptr_t)dashArrayAddress;
    UNUSED_PARAM(clazz)
    glPathDashArrayNV(path, dashCount, dashArray);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_NVPathRendering_glGenPathsNV(JNIEnv *__env, jclass clazz, jint range) {
    glGenPathsNVPROC glGenPathsNV = (glGenPathsNVPROC)tlsGetFunction(714);
    UNUSED_PARAM(clazz)
    return (jint)glGenPathsNV(range);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glDeletePathsNV(JNIEnv *__env, jclass clazz, jint path, jint range) {
    glDeletePathsNVPROC glDeletePathsNV = (glDeletePathsNVPROC)tlsGetFunction(715);
    UNUSED_PARAM(clazz)
    glDeletePathsNV(path, range);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVPathRendering_glIsPathNV(JNIEnv *__env, jclass clazz, jint path) {
    glIsPathNVPROC glIsPathNV = (glIsPathNVPROC)tlsGetFunction(716);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsPathNV(path);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glPathStencilFuncNV(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask) {
    glPathStencilFuncNVPROC glPathStencilFuncNV = (glPathStencilFuncNVPROC)tlsGetFunction(717);
    UNUSED_PARAM(clazz)
    glPathStencilFuncNV(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glPathStencilDepthOffsetNV(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units) {
    glPathStencilDepthOffsetNVPROC glPathStencilDepthOffsetNV = (glPathStencilDepthOffsetNVPROC)tlsGetFunction(718);
    UNUSED_PARAM(clazz)
    glPathStencilDepthOffsetNV(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glStencilFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint fillMode, jint mask) {
    glStencilFillPathNVPROC glStencilFillPathNV = (glStencilFillPathNVPROC)tlsGetFunction(719);
    UNUSED_PARAM(clazz)
    glStencilFillPathNV(path, fillMode, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glStencilStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jint reference, jint mask) {
    glStencilStrokePathNVPROC glStencilStrokePathNV = (glStencilStrokePathNVPROC)tlsGetFunction(720);
    UNUSED_PARAM(clazz)
    glStencilStrokePathNV(path, reference, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglStencilFillPathInstancedNV__IIJIIIIJ(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint fillMode, jint mask, jint transformType, jlong transformValuesAddress) {
    glStencilFillPathInstancedNVPROC glStencilFillPathInstancedNV = (glStencilFillPathInstancedNVPROC)tlsGetFunction(721);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glStencilFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglStencilStrokePathInstancedNV__IIJIIIIJ(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint reference, jint mask, jint transformType, jlong transformValuesAddress) {
    glStencilStrokePathInstancedNVPROC glStencilStrokePathInstancedNV = (glStencilStrokePathInstancedNVPROC)tlsGetFunction(722);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glStencilStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glPathCoverDepthFuncNV(JNIEnv *__env, jclass clazz, jint zfunc) {
    glPathCoverDepthFuncNVPROC glPathCoverDepthFuncNV = (glPathCoverDepthFuncNVPROC)tlsGetFunction(723);
    UNUSED_PARAM(clazz)
    glPathCoverDepthFuncNV(zfunc);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glCoverFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint coverMode) {
    glCoverFillPathNVPROC glCoverFillPathNV = (glCoverFillPathNVPROC)tlsGetFunction(724);
    UNUSED_PARAM(clazz)
    glCoverFillPathNV(path, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glCoverStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jint coverMode) {
    glCoverStrokePathNVPROC glCoverStrokePathNV = (glCoverStrokePathNVPROC)tlsGetFunction(725);
    UNUSED_PARAM(clazz)
    glCoverStrokePathNV(path, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglCoverFillPathInstancedNV__IIJIIIJ(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint coverMode, jint transformType, jlong transformValuesAddress) {
    glCoverFillPathInstancedNVPROC glCoverFillPathInstancedNV = (glCoverFillPathInstancedNVPROC)tlsGetFunction(726);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glCoverFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglCoverStrokePathInstancedNV__IIJIIIJ(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint coverMode, jint transformType, jlong transformValuesAddress) {
    glCoverStrokePathInstancedNVPROC glCoverStrokePathInstancedNV = (glCoverStrokePathInstancedNVPROC)tlsGetFunction(727);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glCoverStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glStencilThenCoverFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint fillMode, jint mask, jint coverMode) {
    glStencilThenCoverFillPathNVPROC glStencilThenCoverFillPathNV = (glStencilThenCoverFillPathNVPROC)tlsGetFunction(728);
    UNUSED_PARAM(clazz)
    glStencilThenCoverFillPathNV(path, fillMode, mask, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_glStencilThenCoverStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jint reference, jint mask, jint coverMode) {
    glStencilThenCoverStrokePathNVPROC glStencilThenCoverStrokePathNV = (glStencilThenCoverStrokePathNVPROC)tlsGetFunction(729);
    UNUSED_PARAM(clazz)
    glStencilThenCoverStrokePathNV(path, reference, mask, coverMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglStencilThenCoverFillPathInstancedNV__IIJIIIIIJ(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint fillMode, jint mask, jint coverMode, jint transformType, jlong transformValuesAddress) {
    glStencilThenCoverFillPathInstancedNVPROC glStencilThenCoverFillPathInstancedNV = (glStencilThenCoverFillPathInstancedNVPROC)tlsGetFunction(730);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglStencilThenCoverStrokePathInstancedNV__IIJIIIIIJ(JNIEnv *__env, jclass clazz, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint reference, jint mask, jint coverMode, jint transformType, jlong transformValuesAddress) {
    glStencilThenCoverStrokePathInstancedNVPROC glStencilThenCoverStrokePathInstancedNV = (glStencilThenCoverStrokePathInstancedNVPROC)tlsGetFunction(731);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t transformValues = (uintptr_t)transformValuesAddress;
    UNUSED_PARAM(clazz)
    glStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPathGlyphIndexRangeNV(JNIEnv *__env, jclass clazz, jint fontTarget, jlong fontNameAddress, jint fontStyle, jint pathParameterTemplate, jfloat emScale, jint baseAndCount) {
    glPathGlyphIndexRangeNVPROC glPathGlyphIndexRangeNV = (glPathGlyphIndexRangeNVPROC)tlsGetFunction(732);
    uintptr_t fontName = (uintptr_t)fontNameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glPathGlyphIndexRangeNV(fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglProgramPathFragmentInputGenNV__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint genMode, jint components, jlong coeffsAddress) {
    glProgramPathFragmentInputGenNVPROC glProgramPathFragmentInputGenNV = (glProgramPathFragmentInputGenNVPROC)tlsGetFunction(733);
    uintptr_t coeffs = (uintptr_t)coeffsAddress;
    UNUSED_PARAM(clazz)
    glProgramPathFragmentInputGenNV(program, location, genMode, components, coeffs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathParameterivNV__IIJ(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress) {
    glGetPathParameterivNVPROC glGetPathParameterivNV = (glGetPathParameterivNVPROC)tlsGetFunction(734);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glGetPathParameterivNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathParameterfvNV__IIJ(JNIEnv *__env, jclass clazz, jint path, jint pname, jlong valueAddress) {
    glGetPathParameterfvNVPROC glGetPathParameterfvNV = (glGetPathParameterfvNVPROC)tlsGetFunction(735);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glGetPathParameterfvNV(path, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathCommandsNV(JNIEnv *__env, jclass clazz, jint path, jlong commandsAddress) {
    glGetPathCommandsNVPROC glGetPathCommandsNV = (glGetPathCommandsNVPROC)tlsGetFunction(736);
    uintptr_t commands = (uintptr_t)commandsAddress;
    UNUSED_PARAM(clazz)
    glGetPathCommandsNV(path, commands);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathCoordsNV__IJ(JNIEnv *__env, jclass clazz, jint path, jlong coordsAddress) {
    glGetPathCoordsNVPROC glGetPathCoordsNV = (glGetPathCoordsNVPROC)tlsGetFunction(737);
    uintptr_t coords = (uintptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glGetPathCoordsNV(path, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathDashArrayNV__IJ(JNIEnv *__env, jclass clazz, jint path, jlong dashArrayAddress) {
    glGetPathDashArrayNVPROC glGetPathDashArrayNV = (glGetPathDashArrayNVPROC)tlsGetFunction(738);
    uintptr_t dashArray = (uintptr_t)dashArrayAddress;
    UNUSED_PARAM(clazz)
    glGetPathDashArrayNV(path, dashArray);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathMetricsNV__IIIJIIJ(JNIEnv *__env, jclass clazz, jint metricQueryMask, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jint stride, jlong metricsAddress) {
    glGetPathMetricsNVPROC glGetPathMetricsNV = (glGetPathMetricsNVPROC)tlsGetFunction(739);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t metrics = (uintptr_t)metricsAddress;
    UNUSED_PARAM(clazz)
    glGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathMetricRangeNV__IIIIJ(JNIEnv *__env, jclass clazz, jint metricQueryMask, jint firstPathName, jint numPaths, jint stride, jlong metricsAddress) {
    glGetPathMetricRangeNVPROC glGetPathMetricRangeNV = (glGetPathMetricRangeNVPROC)tlsGetFunction(740);
    uintptr_t metrics = (uintptr_t)metricsAddress;
    UNUSED_PARAM(clazz)
    glGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, metrics);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetPathSpacingNV__IIIJIFFIJ(JNIEnv *__env, jclass clazz, jint pathListMode, jint numPaths, jint pathNameType, jlong pathsAddress, jint pathBase, jfloat advanceScale, jfloat kerningScale, jint transformType, jlong returnedSpacingAddress) {
    glGetPathSpacingNVPROC glGetPathSpacingNV = (glGetPathSpacingNVPROC)tlsGetFunction(741);
    uintptr_t paths = (uintptr_t)pathsAddress;
    uintptr_t returnedSpacing = (uintptr_t)returnedSpacingAddress;
    UNUSED_PARAM(clazz)
    glGetPathSpacingNV(pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVPathRendering_glIsPointInFillPathNV(JNIEnv *__env, jclass clazz, jint path, jint mask, jfloat x, jfloat y) {
    glIsPointInFillPathNVPROC glIsPointInFillPathNV = (glIsPointInFillPathNVPROC)tlsGetFunction(742);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsPointInFillPathNV(path, mask, x, y);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVPathRendering_glIsPointInStrokePathNV(JNIEnv *__env, jclass clazz, jint path, jfloat x, jfloat y) {
    glIsPointInStrokePathNVPROC glIsPointInStrokePathNV = (glIsPointInStrokePathNVPROC)tlsGetFunction(743);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsPointInStrokePathNV(path, x, y);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_opengles_NVPathRendering_glGetPathLengthNV(JNIEnv *__env, jclass clazz, jint path, jint startSegment, jint numSegments) {
    glGetPathLengthNVPROC glGetPathLengthNV = (glGetPathLengthNVPROC)tlsGetFunction(744);
    UNUSED_PARAM(clazz)
    return (jfloat)glGetPathLengthNV(path, startSegment, numSegments);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglPointAlongPathNV__IIIFJJJJ(JNIEnv *__env, jclass clazz, jint path, jint startSegment, jint numSegments, jfloat distance, jlong xAddress, jlong yAddress, jlong tangentXAddress, jlong tangentYAddress) {
    glPointAlongPathNVPROC glPointAlongPathNV = (glPointAlongPathNVPROC)tlsGetFunction(745);
    uintptr_t x = (uintptr_t)xAddress;
    uintptr_t y = (uintptr_t)yAddress;
    uintptr_t tangentX = (uintptr_t)tangentXAddress;
    uintptr_t tangentY = (uintptr_t)tangentYAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glPointAlongPathNV(path, startSegment, numSegments, distance, x, y, tangentX, tangentY);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglMatrixLoad3x2fNV__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoad3x2fNVPROC glMatrixLoad3x2fNV = (glMatrixLoad3x2fNVPROC)tlsGetFunction(746);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoad3x2fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglMatrixLoad3x3fNV__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoad3x3fNVPROC glMatrixLoad3x3fNV = (glMatrixLoad3x3fNVPROC)tlsGetFunction(747);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoad3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglMatrixLoadTranspose3x3fNV__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadTranspose3x3fNVPROC glMatrixLoadTranspose3x3fNV = (glMatrixLoadTranspose3x3fNVPROC)tlsGetFunction(748);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadTranspose3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglMatrixMult3x2fNV__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMult3x2fNVPROC glMatrixMult3x2fNV = (glMatrixMult3x2fNVPROC)tlsGetFunction(749);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMult3x2fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglMatrixMult3x3fNV__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMult3x3fNVPROC glMatrixMult3x3fNV = (glMatrixMult3x3fNVPROC)tlsGetFunction(750);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMult3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglMatrixMultTranspose3x3fNV__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultTranspose3x3fNVPROC glMatrixMultTranspose3x3fNV = (glMatrixMultTranspose3x3fNVPROC)tlsGetFunction(751);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultTranspose3x3fNV(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPathRendering_nglGetProgramResourcefvNV__IIIIJIJJ(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jint index, jint propCount, jlong propsAddress, jint bufSize, jlong lengthAddress, jlong paramsAddress) {
    glGetProgramResourcefvNVPROC glGetProgramResourcefvNV = (glGetProgramResourcefvNVPROC)tlsGetFunction(752);
    uintptr_t props = (uintptr_t)propsAddress;
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramResourcefvNV(program, programInterface, index, propCount, props, bufSize, length, params);
}

EXTERN_C_EXIT
