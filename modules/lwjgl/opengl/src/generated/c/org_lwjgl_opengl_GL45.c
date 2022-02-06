/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetnMapdvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnMapfvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnMapivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPixelMapfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPixelMapuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPixelMapusvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPolygonStipplePROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetnColorTablePROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnConvolutionFilterPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnSeparableFilterPROC) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetnHistogramPROC) (jint, jboolean, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnMinmaxPROC) (jint, jboolean, jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapdv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapdvPROC glGetnMapdv = (glGetnMapdvPROC)tlsGetFunction(1025);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapdv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapfv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapfvPROC glGetnMapfv = (glGetnMapfvPROC)tlsGetFunction(1026);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapfv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMapiv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapivPROC glGetnMapiv = (glGetnMapivPROC)tlsGetFunction(1027);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapiv(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapfv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapfvPROC glGetnPixelMapfv = (glGetnPixelMapfvPROC)tlsGetFunction(1028);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapfv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapuiv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapuivPROC glGetnPixelMapuiv = (glGetnPixelMapuivPROC)tlsGetFunction(1029);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapuiv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPixelMapusv__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapusvPROC glGetnPixelMapusv = (glGetnPixelMapusvPROC)tlsGetFunction(1030);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapusv(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnPolygonStipple(JNIEnv *__env, jclass clazz, jint bufSize, jlong patternAddress) {
    glGetnPolygonStipplePROC glGetnPolygonStipple = (glGetnPolygonStipplePROC)tlsGetFunction(1031);
    uintptr_t pattern = (uintptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glGetnPolygonStipple(bufSize, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnColorTable__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong tableAddress) {
    glGetnColorTablePROC glGetnColorTable = (glGetnColorTablePROC)tlsGetFunction(1034);
    uintptr_t table = (uintptr_t)tableAddress;
    UNUSED_PARAM(clazz)
    glGetnColorTable(target, format, type, bufSize, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnConvolutionFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong imageAddress) {
    glGetnConvolutionFilterPROC glGetnConvolutionFilter = (glGetnConvolutionFilterPROC)tlsGetFunction(1035);
    uintptr_t image = (uintptr_t)imageAddress;
    UNUSED_PARAM(clazz)
    glGetnConvolutionFilter(target, format, type, bufSize, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnSeparableFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint rowBufSize, jlong rowAddress, jint columnBufSize, jlong columnAddress, jlong spanAddress) {
    glGetnSeparableFilterPROC glGetnSeparableFilter = (glGetnSeparableFilterPROC)tlsGetFunction(1036);
    uintptr_t row = (uintptr_t)rowAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t span = (uintptr_t)spanAddress;
    UNUSED_PARAM(clazz)
    glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnHistogram(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress) {
    glGetnHistogramPROC glGetnHistogram = (glGetnHistogramPROC)tlsGetFunction(1037);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetnHistogram(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45_nglGetnMinmax(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress) {
    glGetnMinmaxPROC glGetnMinmax = (glGetnMinmaxPROC)tlsGetFunction(1038);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetnMinmax(target, reset, format, type, bufSize, values);
}

EXTERN_C_EXIT
