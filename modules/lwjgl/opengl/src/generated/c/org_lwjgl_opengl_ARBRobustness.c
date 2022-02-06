/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glGetGraphicsResetStatusARBPROC) (void);
typedef void (APIENTRY *glGetnMapdvARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnMapfvARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnMapivARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPixelMapfvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPixelMapuivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPixelMapusvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnPolygonStippleARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetnTexImageARBPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glReadnPixelsARBPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnColorTableARBPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnConvolutionFilterARBPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnSeparableFilterARBPROC) (jint, jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetnHistogramARBPROC) (jint, jboolean, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnMinmaxARBPROC) (jint, jboolean, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnCompressedTexImageARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformfvARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformivARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformuivARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformdvARBPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBRobustness_glGetGraphicsResetStatusARB(JNIEnv *__env, jclass clazz) {
    glGetGraphicsResetStatusARBPROC glGetGraphicsResetStatusARB = (glGetGraphicsResetStatusARBPROC)tlsGetFunction(1292);
    UNUSED_PARAM(clazz)
    return (jint)glGetGraphicsResetStatusARB();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMapdvARB__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapdvARBPROC glGetnMapdvARB = (glGetnMapdvARBPROC)tlsGetFunction(1293);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapdvARB(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMapfvARB__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapfvARBPROC glGetnMapfvARB = (glGetnMapfvARBPROC)tlsGetFunction(1294);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapfvARB(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMapivARB__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint query, jint bufSize, jlong dataAddress) {
    glGetnMapivARBPROC glGetnMapivARB = (glGetnMapivARBPROC)tlsGetFunction(1295);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnMapivARB(target, query, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPixelMapfvARB__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapfvARBPROC glGetnPixelMapfvARB = (glGetnPixelMapfvARBPROC)tlsGetFunction(1296);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapfvARB(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPixelMapuivARB__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapuivARBPROC glGetnPixelMapuivARB = (glGetnPixelMapuivARBPROC)tlsGetFunction(1297);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapuivARB(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPixelMapusvARB__IIJ(JNIEnv *__env, jclass clazz, jint map, jint bufSize, jlong dataAddress) {
    glGetnPixelMapusvARBPROC glGetnPixelMapusvARB = (glGetnPixelMapusvARBPROC)tlsGetFunction(1298);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetnPixelMapusvARB(map, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnPolygonStippleARB(JNIEnv *__env, jclass clazz, jint bufSize, jlong patternAddress) {
    glGetnPolygonStippleARBPROC glGetnPolygonStippleARB = (glGetnPolygonStippleARBPROC)tlsGetFunction(1299);
    uintptr_t pattern = (uintptr_t)patternAddress;
    UNUSED_PARAM(clazz)
    glGetnPolygonStippleARB(bufSize, pattern);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnTexImageARB__IIIIIJ(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jint bufSize, jlong imgAddress) {
    glGetnTexImageARBPROC glGetnTexImageARB = (glGetnTexImageARBPROC)tlsGetFunction(1300);
    uintptr_t img = (uintptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetnTexImageARB(tex, level, format, type, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglReadnPixelsARB__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong dataAddress) {
    glReadnPixelsARBPROC glReadnPixelsARB = (glReadnPixelsARBPROC)tlsGetFunction(1301);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glReadnPixelsARB(x, y, width, height, format, type, bufSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnColorTableARB__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong tableAddress) {
    glGetnColorTableARBPROC glGetnColorTableARB = (glGetnColorTableARBPROC)tlsGetFunction(1302);
    uintptr_t table = (uintptr_t)tableAddress;
    UNUSED_PARAM(clazz)
    glGetnColorTableARB(target, format, type, bufSize, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnConvolutionFilterARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint bufSize, jlong imageAddress) {
    glGetnConvolutionFilterARBPROC glGetnConvolutionFilterARB = (glGetnConvolutionFilterARBPROC)tlsGetFunction(1303);
    uintptr_t image = (uintptr_t)imageAddress;
    UNUSED_PARAM(clazz)
    glGetnConvolutionFilterARB(target, format, type, bufSize, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnSeparableFilterARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint type, jint rowBufSize, jlong rowAddress, jint columnBufSize, jlong columnAddress, jlong spanAddress) {
    glGetnSeparableFilterARBPROC glGetnSeparableFilterARB = (glGetnSeparableFilterARBPROC)tlsGetFunction(1304);
    uintptr_t row = (uintptr_t)rowAddress;
    uintptr_t column = (uintptr_t)columnAddress;
    uintptr_t span = (uintptr_t)spanAddress;
    UNUSED_PARAM(clazz)
    glGetnSeparableFilterARB(target, format, type, rowBufSize, row, columnBufSize, column, span);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnHistogramARB(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress) {
    glGetnHistogramARBPROC glGetnHistogramARB = (glGetnHistogramARBPROC)tlsGetFunction(1305);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetnHistogramARB(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnMinmaxARB(JNIEnv *__env, jclass clazz, jint target, jboolean reset, jint format, jint type, jint bufSize, jlong valuesAddress) {
    glGetnMinmaxARBPROC glGetnMinmaxARB = (glGetnMinmaxARBPROC)tlsGetFunction(1306);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetnMinmaxARB(target, reset, format, type, bufSize, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnCompressedTexImageARB(JNIEnv *__env, jclass clazz, jint target, jint level, jint bufSize, jlong imgAddress) {
    glGetnCompressedTexImageARBPROC glGetnCompressedTexImageARB = (glGetnCompressedTexImageARBPROC)tlsGetFunction(1307);
    uintptr_t img = (uintptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetnCompressedTexImageARB(target, level, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformfvARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformfvARBPROC glGetnUniformfvARB = (glGetnUniformfvARBPROC)tlsGetFunction(1308);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformfvARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformivARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformivARBPROC glGetnUniformivARB = (glGetnUniformivARBPROC)tlsGetFunction(1309);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformivARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformuivARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformuivARBPROC glGetnUniformuivARB = (glGetnUniformuivARBPROC)tlsGetFunction(1310);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformuivARB(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBRobustness_nglGetnUniformdvARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformdvARBPROC glGetnUniformdvARB = (glGetnUniformdvARBPROC)tlsGetFunction(1311);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformdvARB(program, location, bufSize, params);
}

EXTERN_C_EXIT
