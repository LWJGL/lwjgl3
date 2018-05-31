/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetnMapdvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnMapfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnMapivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnPixelMapfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetnPixelMapuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetnPixelMapusvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetnPolygonStipplePROC) (jint, intptr_t);
typedef void (APIENTRY *glGetnColorTablePROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnConvolutionFilterPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnSeparableFilterPROC) (jint, jint, jint, jint, intptr_t, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetnHistogramPROC) (jint, jboolean, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnMinmaxPROC) (jint, jboolean, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapdv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapdvPROC glGetnMapdv = (glGetnMapdvPROC)tlsGetFunction(922);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapdv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapfv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapfvPROC glGetnMapfv = (glGetnMapfvPROC)tlsGetFunction(923);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapfv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapiv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapivPROC glGetnMapiv = (glGetnMapivPROC)tlsGetFunction(924);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapiv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapfv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapfvPROC glGetnPixelMapfv = (glGetnPixelMapfvPROC)tlsGetFunction(925);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapfv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapuiv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapuivPROC glGetnPixelMapuiv = (glGetnPixelMapuivPROC)tlsGetFunction(926);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapuiv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapusv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapusvPROC glGetnPixelMapusv = (glGetnPixelMapusvPROC)tlsGetFunction(927);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapusv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPolygonStipple(JNIEnv *__env, jclass clazz, jint bufSize, jlong patternAddress) {
    glGetnPolygonStipplePROC glGetnPolygonStipple = (glGetnPolygonStipplePROC)tlsGetFunction(928);
    intptr_t pattern = (intptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glGetnPolygonStipple(bufSize, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnColorTable__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong tableAddress) {
    glGetnColorTablePROC glGetnColorTable = (glGetnColorTablePROC)tlsGetFunction(929);
    intptr_t table = (intptr_t)tableAddress;
    UNUSED_PARAM(clazz)
    glGetnColorTable(target, format, type, bufSize, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnConvolutionFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong imageAddress) {
    glGetnConvolutionFilterPROC glGetnConvolutionFilter = (glGetnConvolutionFilterPROC)tlsGetFunction(930);
    intptr_t image = (intptr_t)imageAddress;
    UNUSED_PARAM(clazz)
    glGetnConvolutionFilter(target, format, type, bufSize, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnSeparableFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint rowBufSize, jlong rowAddress, jint columnBufSize, jlong columnAddress, jlong spanAddress) {
    glGetnSeparableFilterPROC glGetnSeparableFilter = (glGetnSeparableFilterPROC)tlsGetFunction(931);
    intptr_t row = (intptr_t)rowAddress;
    intptr_t column = (intptr_t)columnAddress;
    intptr_t span = (intptr_t)spanAddress;
    UNUSED_PARAM(clazz)
    glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnHistogram(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress) {
    glGetnHistogramPROC glGetnHistogram = (glGetnHistogramPROC)tlsGetFunction(932);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetnHistogram(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMinmax(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress) {
    glGetnMinmaxPROC glGetnMinmax = (glGetnMinmaxPROC)tlsGetFunction(933);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetnMinmax(target, reset, format, type, bufSize, values);
}

EXTERN_C_EXIT
