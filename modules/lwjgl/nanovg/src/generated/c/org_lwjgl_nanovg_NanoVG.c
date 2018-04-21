/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
    __pragma(warning(disable : 4710 4738))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#include <stdlib.h>
#include <string.h>
#include "lwjgl_malloc.h"
#define STBI_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBI_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBI_FREE(p)       org_lwjgl_free(p)
#define STBI_FAILURE_USERMSG
#define STBI_ASSERT(x)
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#define STBTT_malloc(x,u)  ((void)(u),org_lwjgl_malloc(x))
#define STBTT_free(x,u)    ((void)(u),org_lwjgl_free(x))
#define STBTT_assert
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "nanovg.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBeginFrame(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint windowWidth, jint windowHeight, jfloat devicePixelRatio) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCancelFrame(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgCancelFrame(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgEndFrame(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgEndFrame(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeOperation(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint op) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgGlobalCompositeOperation(ctx, op);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFunc(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint sfactor, jint dfactor) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgGlobalCompositeBlendFunc(ctx, sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFuncSeparate(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgGlobalCompositeBlendFuncSeparate(ctx, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGB(JNIEnv *__env, jclass clazz, jbyte r, jbyte g, jbyte b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgRGB((unsigned char)r, (unsigned char)g, (unsigned char)b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGBf(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgRGBf(r, g, b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGBA(JNIEnv *__env, jclass clazz, jbyte r, jbyte g, jbyte b, jbyte a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgRGBA((unsigned char)r, (unsigned char)g, (unsigned char)b, (unsigned char)a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGBAf(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgRGBAf(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLerpRGBA(JNIEnv *__env, jclass clazz, jlong c0Address, jlong c1Address, jfloat u, jlong __result) {
    NVGcolor *c0 = (NVGcolor *)(intptr_t)c0Address;
    NVGcolor *c1 = (NVGcolor *)(intptr_t)c1Address;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgLerpRGBA(*c0, *c1, u);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransRGBA(JNIEnv *__env, jclass clazz, jlong c0Address, jbyte a, jlong __result) {
    NVGcolor *c0 = (NVGcolor *)(intptr_t)c0Address;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgTransRGBA(*c0, (unsigned char)a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransRGBAf(JNIEnv *__env, jclass clazz, jlong c0Address, jfloat a, jlong __result) {
    NVGcolor *c0 = (NVGcolor *)(intptr_t)c0Address;
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgTransRGBAf(*c0, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgHSL(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat l, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgHSL(h, s, l);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgHSLA(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat l, jbyte a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((NVGcolor*)(intptr_t)__result) = nvgHSLA(h, s, l, (unsigned char)a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgSave(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgSave(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRestore(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgRestore(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgReset(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgReset(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgShapeAntiAlias(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint enabled) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgShapeAntiAlias(ctx, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStrokeColor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgStrokeColor(ctx, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStrokePaint(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong paintAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGpaint *paint = (NVGpaint *)(intptr_t)paintAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgStrokePaint(ctx, *paint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFillColor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFillColor(ctx, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFillPaint(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong paintAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGpaint *paint = (NVGpaint *)(intptr_t)paintAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFillPaint(ctx, *paint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgMiterLimit(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat limit) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgMiterLimit(ctx, limit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStrokeWidth(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat size) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgStrokeWidth(ctx, size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLineCap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint cap) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgLineCap(ctx, cap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLineJoin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint join) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgLineJoin(ctx, join);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalAlpha(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat alpha) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgGlobalAlpha(ctx, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgResetTransform(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgResetTransform(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransform(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat a, jfloat b, jfloat c, jfloat d, jfloat e, jfloat f) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransform(ctx, a, b, c, d, e, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTranslate(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTranslate(ctx, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRotate(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat angle) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgRotate(ctx, angle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgSkewX(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat angle) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgSkewX(ctx, angle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgSkewY(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat angle) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgSkewY(ctx, angle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgScale(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgScale(ctx, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__JJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong xformAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    float *xform = (float *)(intptr_t)xformAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgCurrentTransform(ctx, xform);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity__J(JNIEnv *__env, jclass clazz, jlong dstAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformIdentity(dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat tx, jfloat ty) {
    float *dst = (float *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformTranslate(dst, tx, ty);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat sx, jfloat sy) {
    float *dst = (float *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformScale(dst, sx, sy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate__JF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat a) {
    float *dst = (float *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformRotate(dst, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX__JF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat a) {
    float *dst = (float *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformSkewX(dst, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY__JF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat a) {
    float *dst = (float *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformSkewY(dst, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply__JJ(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    float const *src = (float const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformMultiply(dst, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply__JJ(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    float const *src = (float const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformPremultiply(dst, src);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse__JJ(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    float const *src = (float const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgTransformInverse(dst, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint__JJJFF(JNIEnv *__env, jclass clazz, jlong dstxAddress, jlong dstyAddress, jlong xformAddress, jfloat srcx, jfloat srcy) {
    float *dstx = (float *)(intptr_t)dstxAddress;
    float *dsty = (float *)(intptr_t)dstyAddress;
    float const *xform = (float const *)(intptr_t)xformAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTransformPoint(dstx, dsty, xform, srcx, srcy);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nvgDegToRad(JNIEnv *__env, jclass clazz, jfloat deg) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nvgDegToRad(deg);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nvgRadToDeg(JNIEnv *__env, jclass clazz, jfloat rad) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nvgRadToDeg(rad);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateImage(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong filenameAddress, jint imageFlags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgCreateImage(ctx, filename, imageFlags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateImageMem(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint imageFlags, jlong dataAddress, jint ndata) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    unsigned char *data = (unsigned char *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgCreateImageMem(ctx, imageFlags, data, ndata);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateImageRGBA(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint w, jint h, jint imageFlags, jlong dataAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgCreateImageRGBA(ctx, w, h, imageFlags, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgUpdateImage(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image, jlong dataAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgUpdateImage(ctx, image, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JIJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image, jlong wAddress, jlong hAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    int *w = (int *)(intptr_t)wAddress;
    int *h = (int *)(intptr_t)hAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgImageSize(ctx, image, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgDeleteImage(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgDeleteImage(ctx, image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLinearGradient(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat sx, jfloat sy, jfloat ex, jfloat ey, jlong icolAddress, jlong ocolAddress, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *icol = (NVGcolor *)(intptr_t)icolAddress;
    NVGcolor *ocol = (NVGcolor *)(intptr_t)ocolAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGpaint*)(intptr_t)__result) = nvgLinearGradient(ctx, sx, sy, ex, ey, *icol, *ocol);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBoxGradient(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r, jfloat f, jlong icolAddress, jlong ocolAddress, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *icol = (NVGcolor *)(intptr_t)icolAddress;
    NVGcolor *ocol = (NVGcolor *)(intptr_t)ocolAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGpaint*)(intptr_t)__result) = nvgBoxGradient(ctx, x, y, w, h, r, f, *icol, *ocol);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRadialGradient(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat inr, jfloat outr, jlong icolAddress, jlong ocolAddress, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *icol = (NVGcolor *)(intptr_t)icolAddress;
    NVGcolor *ocol = (NVGcolor *)(intptr_t)ocolAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGpaint*)(intptr_t)__result) = nvgRadialGradient(ctx, cx, cy, inr, outr, *icol, *ocol);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgImagePattern(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat ox, jfloat oy, jfloat ex, jfloat ey, jfloat angle, jint image, jfloat alpha, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((NVGpaint*)(intptr_t)__result) = nvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgScissor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgScissor(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgIntersectScissor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgIntersectScissor(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgResetScissor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgResetScissor(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBeginPath(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgBeginPath(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgMoveTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgMoveTo(ctx, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLineTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgLineTo(ctx, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBezierTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat c1x, jfloat c1y, jfloat c2x, jfloat c2y, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgQuadTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgQuadTo(ctx, cx, cy, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgArcTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat radius) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgArcTo(ctx, x1, y1, x2, y2, radius);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgClosePath(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgClosePath(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgPathWinding(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint dir) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgPathWinding(ctx, dir);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgArc(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat r, jfloat a0, jfloat a1, jint dir) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgArc(ctx, cx, cy, r, a0, a1, dir);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRect(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgRect(ctx, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRoundedRect(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgRoundedRect(ctx, x, y, w, h, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRoundedRectVarying(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat radTopLeft, jfloat radTopRight, jfloat radBottomRight, jfloat radBottomLeft) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgRoundedRectVarying(ctx, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgEllipse(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat rx, jfloat ry) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgEllipse(ctx, cx, cy, rx, ry);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCircle(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat r) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgCircle(ctx, cx, cy, r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFill(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFill(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStroke(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgStroke(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateFont(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong filenameAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgCreateFont(ctx, name, filename);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateFontMem(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong dataAddress, jint ndata, jint freeData) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    unsigned char *data = (unsigned char *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgCreateFontMem(ctx, name, data, ndata, freeData);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFindFont(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgFindFont(ctx, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFontId(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint baseFont, jint fallbackFont) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgAddFallbackFontId(ctx, baseFont, fallbackFont);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFont(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong baseFontAddress, jlong fallbackFontAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *baseFont = (char const *)(intptr_t)baseFontAddress;
    char const *fallbackFont = (char const *)(intptr_t)fallbackFontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgAddFallbackFont(ctx, baseFont, fallbackFont);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontSize(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat size) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFontSize(ctx, size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontBlur(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat blur) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFontBlur(ctx, blur);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextLetterSpacing(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat spacing) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTextLetterSpacing(ctx, spacing);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextLineHeight(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat lineHeight) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTextLineHeight(ctx, lineHeight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextAlign(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint align) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTextAlign(ctx, align);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontFaceId(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint font) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFontFaceId(ctx, font);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontFace(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *font = (char const *)(intptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgFontFace(ctx, font);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgText(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nvgText(ctx, x, y, string, end);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTextBox(ctx, x, y, breakRowWidth, string, end);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jlong boundsAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    float *bounds = (float *)(intptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nvgTextBounds(ctx, x, y, string, end, bounds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jlong boundsAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    float *bounds = (float *)(intptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTextBoxBounds(ctx, x, y, breakRowWidth, string, end, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextGlyphPositions(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jlong positionsAddress, jint maxPositions) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    NVGglyphPosition *positions = (NVGglyphPosition *)(intptr_t)positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgTextGlyphPositions(ctx, x, y, string, end, positions, maxPositions);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__JJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong ascenderAddress, jlong descenderAddress, jlong linehAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    float *ascender = (float *)(intptr_t)ascenderAddress;
    float *descender = (float *)(intptr_t)descenderAddress;
    float *lineh = (float *)(intptr_t)linehAddress;
    UNUSED_PARAMS(__env, clazz)
    nvgTextMetrics(ctx, ascender, descender, lineh);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBreakLines(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong stringAddress, jlong endAddress, jfloat breakRowWidth, jlong rowsAddress, jint maxRows) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    NVGtextRow *rows = (NVGtextRow *)(intptr_t)rowsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nvgTextBreakLines(ctx, string, end, breakRowWidth, rows, maxRows);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__J_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray xformAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    jfloat *xform = (*__env)->GetPrimitiveArrayCritical(__env, xformAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgCurrentTransform(ctx, (float *)xform);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xformAddress, xform, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__J_3F(jlong ctxAddress, jint xform__length, jfloat* xform) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAM(xform__length)
    nvgCurrentTransform(ctx, (float *)xform);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity___3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformIdentity((float *)dst);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity___3F(jint dst__length, jfloat* dst) {
    UNUSED_PARAM(dst__length)
    nvgTransformIdentity((float *)dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate___3FFF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat tx, jfloat ty) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformTranslate((float *)dst, tx, ty);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate___3FFF(jint dst__length, jfloat* dst, jfloat tx, jfloat ty) {
    UNUSED_PARAM(dst__length)
    nvgTransformTranslate((float *)dst, tx, ty);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformScale___3FFF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat sx, jfloat sy) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformScale((float *)dst, sx, sy);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformScale___3FFF(jint dst__length, jfloat* dst, jfloat sx, jfloat sy) {
    UNUSED_PARAM(dst__length)
    nvgTransformScale((float *)dst, sx, sy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate___3FF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat a) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformRotate((float *)dst, a);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate___3FF(jint dst__length, jfloat* dst, jfloat a) {
    UNUSED_PARAM(dst__length)
    nvgTransformRotate((float *)dst, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX___3FF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat a) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformSkewX((float *)dst, a);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX___3FF(jint dst__length, jfloat* dst, jfloat a) {
    UNUSED_PARAM(dst__length)
    nvgTransformSkewX((float *)dst, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY___3FF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat a) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformSkewY((float *)dst, a);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY___3FF(jint dst__length, jfloat* dst, jfloat a) {
    UNUSED_PARAM(dst__length)
    nvgTransformSkewY((float *)dst, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply___3F_3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloatArray srcAddress) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformMultiply((float *)dst, (float const *)src);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply___3F_3F(jint dst__length, jfloat* dst, jint src__length, jfloat* src) {
    UNUSED_PARAM(dst__length)
    UNUSED_PARAM(src__length)
    nvgTransformMultiply((float *)dst, (float const *)src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply___3F_3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloatArray srcAddress) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformPremultiply((float *)dst, (float const *)src);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply___3F_3F(jint dst__length, jfloat* dst, jint src__length, jfloat* src) {
    UNUSED_PARAM(dst__length)
    UNUSED_PARAM(src__length)
    nvgTransformPremultiply((float *)dst, (float const *)src);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse___3F_3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloatArray srcAddress) {
    jint __result;
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nvgTransformInverse((float *)dst, (float const *)src);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse___3F_3F(jint dst__length, jfloat* dst, jint src__length, jfloat* src) {
    UNUSED_PARAM(dst__length)
    UNUSED_PARAM(src__length)
    return (jint)nvgTransformInverse((float *)dst, (float const *)src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint___3F_3F_3FFF(JNIEnv *__env, jclass clazz, jfloatArray dstxAddress, jfloatArray dstyAddress, jfloatArray xformAddress, jfloat srcx, jfloat srcy) {
    jfloat *dstx = (*__env)->GetPrimitiveArrayCritical(__env, dstxAddress, 0);
    jfloat *dsty = (*__env)->GetPrimitiveArrayCritical(__env, dstyAddress, 0);
    jfloat *xform = (*__env)->GetPrimitiveArrayCritical(__env, xformAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTransformPoint((float *)dstx, (float *)dsty, (float const *)xform, srcx, srcy);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xformAddress, xform, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstyAddress, dsty, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstxAddress, dstx, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint___3F_3F_3FFF(jint dstx__length, jfloat* dstx, jint dsty__length, jfloat* dsty, jint xform__length, jfloat* xform, jfloat srcx, jfloat srcy) {
    UNUSED_PARAM(dstx__length)
    UNUSED_PARAM(dsty__length)
    UNUSED_PARAM(xform__length)
    nvgTransformPoint((float *)dstx, (float *)dsty, (float const *)xform, srcx, srcy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JI_3I_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image, jintArray wAddress, jintArray hAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    jint *w = (*__env)->GetPrimitiveArrayCritical(__env, wAddress, 0);
    jint *h = (*__env)->GetPrimitiveArrayCritical(__env, hAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgImageSize(ctx, image, (int *)w, (int *)h);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hAddress, h, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, wAddress, w, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JI_3I_3I(jlong ctxAddress, jint image, jint w__length, jint* w, jint h__length, jint* h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAM(w__length)
    UNUSED_PARAM(h__length)
    nvgImageSize(ctx, image, (int *)w, (int *)h);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJ_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jfloatArray boundsAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    jfloat __result;
    jfloat *bounds = boundsAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, boundsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jfloat)nvgTextBounds(ctx, x, y, string, end, (float *)bounds);
    if (bounds != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, boundsAddress, bounds, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJ_3F(jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jint bounds__length, jfloat* bounds) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    UNUSED_PARAM(bounds__length)
    return (jfloat)nvgTextBounds(ctx, x, y, string, end, (float *)bounds);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJ_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jfloatArray boundsAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    jfloat *bounds = boundsAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, boundsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTextBoxBounds(ctx, x, y, breakRowWidth, string, end, (float *)bounds);
    if (bounds != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, boundsAddress, bounds, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJ_3F(jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jint bounds__length, jfloat* bounds) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    UNUSED_PARAM(bounds__length)
    nvgTextBoxBounds(ctx, x, y, breakRowWidth, string, end, (float *)bounds);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__J_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray ascenderAddress, jfloatArray descenderAddress, jfloatArray linehAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    jfloat *ascender = ascenderAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ascenderAddress, 0);
    jfloat *descender = descenderAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, descenderAddress, 0);
    jfloat *lineh = linehAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, linehAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nvgTextMetrics(ctx, (float *)ascender, (float *)descender, (float *)lineh);
    if (lineh != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, linehAddress, lineh, 0); }
    if (descender != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, descenderAddress, descender, 0); }
    if (ascender != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ascenderAddress, ascender, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__J_3F_3F_3F(jlong ctxAddress, jint ascender__length, jfloat* ascender, jint descender__length, jfloat* descender, jint lineh__length, jfloat* lineh) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    UNUSED_PARAM(ascender__length)
    UNUSED_PARAM(descender__length)
    UNUSED_PARAM(lineh__length)
    nvgTextMetrics(ctx, (float *)ascender, (float *)descender, (float *)lineh);
}

EXTERN_C_EXIT
