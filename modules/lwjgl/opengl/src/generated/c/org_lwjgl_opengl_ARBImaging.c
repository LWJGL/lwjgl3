/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glColorTablePROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyColorTablePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glColorTableParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glColorTableParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetColorTablePROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetColorTableParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetColorTableParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glColorSubTablePROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyColorSubTablePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glConvolutionFilter1DPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glConvolutionFilter2DPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyConvolutionFilter1DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyConvolutionFilter2DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetConvolutionFilterPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glSeparableFilter2DPROC) (jint, jint, jint, jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetSeparableFilterPROC) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glConvolutionParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glConvolutionParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glConvolutionParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glConvolutionParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetConvolutionParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetConvolutionParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glHistogramPROC) (jint, jint, jint, jboolean);
typedef void (APIENTRY *glResetHistogramPROC) (jint);
typedef void (APIENTRY *glGetHistogramPROC) (jint, jboolean, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetHistogramParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetHistogramParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glMinmaxPROC) (jint, jint, jboolean);
typedef void (APIENTRY *glResetMinmaxPROC) (jint);
typedef void (APIENTRY *glGetMinmaxPROC) (jint, jboolean, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMinmaxParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMinmaxParameterfvPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorTable__IIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint format, jint type, jlong tableAddress) {
    glColorTablePROC glColorTable = (glColorTablePROC)tlsGetFunction(1239);
    uintptr_t table = (uintptr_t)tableAddress;
    UNUSED_PARAM(clazz)
    glColorTable(target, internalformat, width, format, type, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glCopyColorTable(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint x, jint y, jint width) {
    glCopyColorTablePROC glCopyColorTable = (glCopyColorTablePROC)tlsGetFunction(1240);
    UNUSED_PARAM(clazz)
    glCopyColorTable(target, internalformat, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorTableParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glColorTableParameterivPROC glColorTableParameteriv = (glColorTableParameterivPROC)tlsGetFunction(1241);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glColorTableParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorTableParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glColorTableParameterfvPROC glColorTableParameterfv = (glColorTableParameterfvPROC)tlsGetFunction(1242);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glColorTableParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetColorTable__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jlong tableAddress) {
    glGetColorTablePROC glGetColorTable = (glGetColorTablePROC)tlsGetFunction(1243);
    uintptr_t table = (uintptr_t)tableAddress;
    UNUSED_PARAM(clazz)
    glGetColorTable(target, format, type, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetColorTableParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetColorTableParameterivPROC glGetColorTableParameteriv = (glGetColorTableParameterivPROC)tlsGetFunction(1244);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetColorTableParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetColorTableParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetColorTableParameterfvPROC glGetColorTableParameterfv = (glGetColorTableParameterfvPROC)tlsGetFunction(1245);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetColorTableParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglColorSubTable(JNIEnv *__env, jclass clazz, jint target, jint start, jint count, jint format, jint type, jlong dataAddress) {
    glColorSubTablePROC glColorSubTable = (glColorSubTablePROC)tlsGetFunction(1246);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glColorSubTable(target, start, count, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glCopyColorSubTable(JNIEnv *__env, jclass clazz, jint target, jint start, jint x, jint y, jint width) {
    glCopyColorSubTablePROC glCopyColorSubTable = (glCopyColorSubTablePROC)tlsGetFunction(1247);
    UNUSED_PARAM(clazz)
    glCopyColorSubTable(target, start, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionFilter1D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint format, jint type, jlong dataAddress) {
    glConvolutionFilter1DPROC glConvolutionFilter1D = (glConvolutionFilter1DPROC)tlsGetFunction(1248);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glConvolutionFilter1D(target, internalformat, width, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionFilter2D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jint format, jint type, jlong dataAddress) {
    glConvolutionFilter2DPROC glConvolutionFilter2D = (glConvolutionFilter2DPROC)tlsGetFunction(1249);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glConvolutionFilter2D(target, internalformat, width, height, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glCopyConvolutionFilter1D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint x, jint y, jint width) {
    glCopyConvolutionFilter1DPROC glCopyConvolutionFilter1D = (glCopyConvolutionFilter1DPROC)tlsGetFunction(1250);
    UNUSED_PARAM(clazz)
    glCopyConvolutionFilter1D(target, internalformat, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glCopyConvolutionFilter2D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint x, jint y, jint width, jint height) {
    glCopyConvolutionFilter2DPROC glCopyConvolutionFilter2D = (glCopyConvolutionFilter2DPROC)tlsGetFunction(1251);
    UNUSED_PARAM(clazz)
    glCopyConvolutionFilter2D(target, internalformat, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetConvolutionFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jlong imageAddress) {
    glGetConvolutionFilterPROC glGetConvolutionFilter = (glGetConvolutionFilterPROC)tlsGetFunction(1252);
    uintptr_t image = (uintptr_t)imageAddress;
    UNUSED_PARAM(clazz)
    glGetConvolutionFilter(target, format, type, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglSeparableFilter2D(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height, jint format, jint type, jlong rowAddress, jlong columnAddress) {
    glSeparableFilter2DPROC glSeparableFilter2D = (glSeparableFilter2DPROC)tlsGetFunction(1253);
    uintptr_t row = (uintptr_t)rowAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    UNUSED_PARAM(clazz)
    glSeparableFilter2D(target, internalformat, width, height, format, type, row, column);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetSeparableFilter(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jlong rowAddress, jlong columnAddress, jlong spanAddress) {
    glGetSeparableFilterPROC glGetSeparableFilter = (glGetSeparableFilterPROC)tlsGetFunction(1254);
    uintptr_t row = (uintptr_t)rowAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t span = (uintptr_t)spanAddress;
    UNUSED_PARAM(clazz)
    glGetSeparableFilter(target, format, type, row, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glConvolutionParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glConvolutionParameteriPROC glConvolutionParameteri = (glConvolutionParameteriPROC)tlsGetFunction(1255);
    UNUSED_PARAM(clazz)
    glConvolutionParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glConvolutionParameterivPROC glConvolutionParameteriv = (glConvolutionParameterivPROC)tlsGetFunction(1256);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glConvolutionParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glConvolutionParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
    glConvolutionParameterfPROC glConvolutionParameterf = (glConvolutionParameterfPROC)tlsGetFunction(1257);
    UNUSED_PARAM(clazz)
    glConvolutionParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglConvolutionParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glConvolutionParameterfvPROC glConvolutionParameterfv = (glConvolutionParameterfvPROC)tlsGetFunction(1258);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glConvolutionParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetConvolutionParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetConvolutionParameterivPROC glGetConvolutionParameteriv = (glGetConvolutionParameterivPROC)tlsGetFunction(1259);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetConvolutionParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetConvolutionParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetConvolutionParameterfvPROC glGetConvolutionParameterfv = (glGetConvolutionParameterfvPROC)tlsGetFunction(1260);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetConvolutionParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glHistogram(JNIEnv *__env, jclass clazz, jint target, jint width, jint internalformat, jboolean sink) {
    glHistogramPROC glHistogram = (glHistogramPROC)tlsGetFunction(1261);
    UNUSED_PARAM(clazz)
    glHistogram(target, width, internalformat, sink);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glResetHistogram(JNIEnv *__env, jclass clazz, jint target) {
    glResetHistogramPROC glResetHistogram = (glResetHistogramPROC)tlsGetFunction(1262);
    UNUSED_PARAM(clazz)
    glResetHistogram(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetHistogram(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jlong valuesAddress) {
    glGetHistogramPROC glGetHistogram = (glGetHistogramPROC)tlsGetFunction(1263);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetHistogram(target, reset, format, type, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetHistogramParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetHistogramParameterivPROC glGetHistogramParameteriv = (glGetHistogramParameterivPROC)tlsGetFunction(1264);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetHistogramParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetHistogramParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetHistogramParameterfvPROC glGetHistogramParameterfv = (glGetHistogramParameterfvPROC)tlsGetFunction(1265);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetHistogramParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glMinmax(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jboolean sink) {
    glMinmaxPROC glMinmax = (glMinmaxPROC)tlsGetFunction(1266);
    UNUSED_PARAM(clazz)
    glMinmax(target, internalformat, sink);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_glResetMinmax(JNIEnv *__env, jclass clazz, jint target) {
    glResetMinmaxPROC glResetMinmax = (glResetMinmaxPROC)tlsGetFunction(1267);
    UNUSED_PARAM(clazz)
    glResetMinmax(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetMinmax(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jlong valuesAddress) {
    glGetMinmaxPROC glGetMinmax = (glGetMinmaxPROC)tlsGetFunction(1268);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetMinmax(target, reset, format, type, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetMinmaxParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetMinmaxParameterivPROC glGetMinmaxParameteriv = (glGetMinmaxParameterivPROC)tlsGetFunction(1269);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMinmaxParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBImaging_nglGetMinmaxParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetMinmaxParameterfvPROC glGetMinmaxParameterfv = (glGetMinmaxParameterfvPROC)tlsGetFunction(1270);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMinmaxParameterfv(target, pname, params);
}

EXTERN_C_EXIT
