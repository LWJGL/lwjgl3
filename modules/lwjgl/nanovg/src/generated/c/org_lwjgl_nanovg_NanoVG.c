/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"
#define NVG_MALLOC(sz)     org_lwjgl_malloc(sz)
#define NVG_REALLOC(p,sz)  org_lwjgl_realloc(p,sz)
#define NVG_FREE(p)        org_lwjgl_free(p)
DISABLE_WARNINGS()
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

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgBeginFrame(jlong ctxAddress, jfloat windowWidth, jfloat windowHeight, jfloat devicePixelRatio) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBeginFrame(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat windowWidth, jfloat windowHeight, jfloat devicePixelRatio) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgBeginFrame(ctxAddress, windowWidth, windowHeight, devicePixelRatio);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCancelFrame(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgCancelFrame(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCancelFrame(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCancelFrame(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgEndFrame(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgEndFrame(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgEndFrame(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgEndFrame(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeOperation(jlong ctxAddress, jint op) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgGlobalCompositeOperation(ctx, op);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeOperation(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint op) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeOperation(ctxAddress, op);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFunc(jlong ctxAddress, jint sfactor, jint dfactor) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgGlobalCompositeBlendFunc(ctx, sfactor, dfactor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFunc(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint sfactor, jint dfactor) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFunc(ctxAddress, sfactor, dfactor);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFuncSeparate(jlong ctxAddress, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgGlobalCompositeBlendFuncSeparate(ctx, srcRGB, dstRGB, srcAlpha, dstAlpha);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFuncSeparate(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalCompositeBlendFuncSeparate(ctxAddress, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGB(jbyte r, jbyte g, jbyte b, jlong __result) {
    *((NVGcolor*)(intptr_t)__result) = nvgRGB((unsigned char)r, (unsigned char)g, (unsigned char)b);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGB(JNIEnv *__env, jclass clazz, jbyte r, jbyte g, jbyte b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGB(r, g, b, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGBf(jfloat r, jfloat g, jfloat b, jlong __result) {
    *((NVGcolor*)(intptr_t)__result) = nvgRGBf(r, g, b);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGBf(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGBf(r, g, b, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGBA(jbyte r, jbyte g, jbyte b, jbyte a, jlong __result) {
    *((NVGcolor*)(intptr_t)__result) = nvgRGBA((unsigned char)r, (unsigned char)g, (unsigned char)b, (unsigned char)a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGBA(JNIEnv *__env, jclass clazz, jbyte r, jbyte g, jbyte b, jbyte a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGBA(r, g, b, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGBAf(jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    *((NVGcolor*)(intptr_t)__result) = nvgRGBAf(r, g, b, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRGBAf(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRGBAf(r, g, b, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLerpRGBA(jlong c0Address, jlong c1Address, jfloat u, jlong __result) {
    NVGcolor *c0 = (NVGcolor *)(intptr_t)c0Address;
    NVGcolor *c1 = (NVGcolor *)(intptr_t)c1Address;
    *((NVGcolor*)(intptr_t)__result) = nvgLerpRGBA(*c0, *c1, u);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLerpRGBA(JNIEnv *__env, jclass clazz, jlong c0Address, jlong c1Address, jfloat u, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLerpRGBA(c0Address, c1Address, u, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransRGBA(jlong c0Address, jbyte a, jlong __result) {
    NVGcolor *c0 = (NVGcolor *)(intptr_t)c0Address;
    *((NVGcolor*)(intptr_t)__result) = nvgTransRGBA(*c0, (unsigned char)a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransRGBA(JNIEnv *__env, jclass clazz, jlong c0Address, jbyte a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransRGBA(c0Address, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransRGBAf(jlong c0Address, jfloat a, jlong __result) {
    NVGcolor *c0 = (NVGcolor *)(intptr_t)c0Address;
    *((NVGcolor*)(intptr_t)__result) = nvgTransRGBAf(*c0, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransRGBAf(JNIEnv *__env, jclass clazz, jlong c0Address, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransRGBAf(c0Address, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgHSL(jfloat h, jfloat s, jfloat l, jlong __result) {
    *((NVGcolor*)(intptr_t)__result) = nvgHSL(h, s, l);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgHSL(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat l, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgHSL(h, s, l, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgHSLA(jfloat h, jfloat s, jfloat l, jbyte a, jlong __result) {
    *((NVGcolor*)(intptr_t)__result) = nvgHSLA(h, s, l, (unsigned char)a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgHSLA(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat l, jbyte a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgHSLA(h, s, l, a, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgSave(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgSave(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgSave(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgSave(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRestore(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgRestore(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRestore(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRestore(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgReset(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgReset(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgReset(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgReset(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgShapeAntiAlias(jlong ctxAddress, jint enabled) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgShapeAntiAlias(ctx, enabled);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgShapeAntiAlias(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint enabled) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgShapeAntiAlias(ctxAddress, enabled);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStrokeColor(jlong ctxAddress, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    nvgStrokeColor(ctx, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStrokeColor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStrokeColor(ctxAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStrokePaint(jlong ctxAddress, jlong paintAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGpaint *paint = (NVGpaint *)(intptr_t)paintAddress;
    nvgStrokePaint(ctx, *paint);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStrokePaint(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong paintAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStrokePaint(ctxAddress, paintAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFillColor(jlong ctxAddress, jlong colorAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *color = (NVGcolor *)(intptr_t)colorAddress;
    nvgFillColor(ctx, *color);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFillColor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFillColor(ctxAddress, colorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFillPaint(jlong ctxAddress, jlong paintAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGpaint *paint = (NVGpaint *)(intptr_t)paintAddress;
    nvgFillPaint(ctx, *paint);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFillPaint(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong paintAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFillPaint(ctxAddress, paintAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgMiterLimit(jlong ctxAddress, jfloat limit) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgMiterLimit(ctx, limit);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgMiterLimit(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat limit) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgMiterLimit(ctxAddress, limit);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStrokeWidth(jlong ctxAddress, jfloat size) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgStrokeWidth(ctx, size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStrokeWidth(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStrokeWidth(ctxAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLineCap(jlong ctxAddress, jint cap) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgLineCap(ctx, cap);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLineCap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint cap) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLineCap(ctxAddress, cap);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLineJoin(jlong ctxAddress, jint join) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgLineJoin(ctx, join);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLineJoin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint join) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLineJoin(ctxAddress, join);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalAlpha(jlong ctxAddress, jfloat alpha) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgGlobalAlpha(ctx, alpha);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgGlobalAlpha(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat alpha) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgGlobalAlpha(ctxAddress, alpha);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgResetTransform(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgResetTransform(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgResetTransform(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgResetTransform(ctxAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTransform)(jlong ctxAddress, jfloat a, jfloat b, jfloat c, jfloat d, jfloat e, jfloat f) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgTransform(ctx, a, b, c, d, e, f);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransform(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat a, jfloat b, jfloat c, jfloat d, jfloat e, jfloat f) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTransform)(ctxAddress, a, b, c, d, e, f);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTranslate(jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgTranslate(ctx, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTranslate(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTranslate(ctxAddress, x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRotate(jlong ctxAddress, jfloat angle) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgRotate(ctx, angle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRotate(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat angle) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRotate(ctxAddress, angle);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgSkewX(jlong ctxAddress, jfloat angle) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgSkewX(ctx, angle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgSkewX(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat angle) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgSkewX(ctxAddress, angle);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgSkewY(jlong ctxAddress, jfloat angle) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgSkewY(ctx, angle);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgSkewY(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat angle) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgSkewY(ctxAddress, angle);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgScale(jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgScale(ctx, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgScale(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgScale(ctxAddress, x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__JJ(jlong ctxAddress, jlong xformAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    float *xform = (float *)(intptr_t)xformAddress;
    nvgCurrentTransform(ctx, xform);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__JJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong xformAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__JJ(ctxAddress, xformAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity__J(jlong dstAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    nvgTransformIdentity(dst);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity__J(JNIEnv *__env, jclass clazz, jlong dstAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity__J(dstAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF(jlong dstAddress, jfloat tx, jfloat ty) {
    float *dst = (float *)(intptr_t)dstAddress;
    nvgTransformTranslate(dst, tx, ty);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat tx, jfloat ty) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF(dstAddress, tx, ty);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF(jlong dstAddress, jfloat sx, jfloat sy) {
    float *dst = (float *)(intptr_t)dstAddress;
    nvgTransformScale(dst, sx, sy);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat sx, jfloat sy) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF(dstAddress, sx, sy);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate__JF(jlong dstAddress, jfloat a) {
    float *dst = (float *)(intptr_t)dstAddress;
    nvgTransformRotate(dst, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate__JF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat a) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate__JF(dstAddress, a);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX__JF(jlong dstAddress, jfloat a) {
    float *dst = (float *)(intptr_t)dstAddress;
    nvgTransformSkewX(dst, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX__JF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat a) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX__JF(dstAddress, a);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY__JF(jlong dstAddress, jfloat a) {
    float *dst = (float *)(intptr_t)dstAddress;
    nvgTransformSkewY(dst, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY__JF(JNIEnv *__env, jclass clazz, jlong dstAddress, jfloat a) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY__JF(dstAddress, a);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply__JJ(jlong dstAddress, jlong srcAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    float const *src = (float const *)(intptr_t)srcAddress;
    nvgTransformMultiply(dst, src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply__JJ(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply__JJ(dstAddress, srcAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply__JJ(jlong dstAddress, jlong srcAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    float const *src = (float const *)(intptr_t)srcAddress;
    nvgTransformPremultiply(dst, src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply__JJ(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply__JJ(dstAddress, srcAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse__JJ(jlong dstAddress, jlong srcAddress) {
    float *dst = (float *)(intptr_t)dstAddress;
    float const *src = (float const *)(intptr_t)srcAddress;
    return (jint)nvgTransformInverse(dst, src);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse__JJ(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse__JJ(dstAddress, srcAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint__JJJFF(jlong dstxAddress, jlong dstyAddress, jlong xformAddress, jfloat srcx, jfloat srcy) {
    float *dstx = (float *)(intptr_t)dstxAddress;
    float *dsty = (float *)(intptr_t)dstyAddress;
    float const *xform = (float const *)(intptr_t)xformAddress;
    nvgTransformPoint(dstx, dsty, xform, srcx, srcy);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint__JJJFF(JNIEnv *__env, jclass clazz, jlong dstxAddress, jlong dstyAddress, jlong xformAddress, jfloat srcx, jfloat srcy) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint__JJJFF(dstxAddress, dstyAddress, xformAddress, srcx, srcy);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nvgDegToRad(jfloat deg) {
    return (jfloat)nvgDegToRad(deg);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nvgDegToRad(JNIEnv *__env, jclass clazz, jfloat deg) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nvgDegToRad(deg);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nvgRadToDeg(jfloat rad) {
    return (jfloat)nvgRadToDeg(rad);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nvgRadToDeg(JNIEnv *__env, jclass clazz, jfloat rad) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nvgRadToDeg(rad);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateImage(jlong ctxAddress, jlong filenameAddress, jint imageFlags) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    return (jint)nvgCreateImage(ctx, filename, imageFlags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateImage(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong filenameAddress, jint imageFlags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateImage(ctxAddress, filenameAddress, imageFlags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateImageMem(jlong ctxAddress, jint imageFlags, jlong dataAddress, jint ndata) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    unsigned char *data = (unsigned char *)(intptr_t)dataAddress;
    return (jint)nvgCreateImageMem(ctx, imageFlags, data, ndata);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateImageMem(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint imageFlags, jlong dataAddress, jint ndata) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateImageMem(ctxAddress, imageFlags, dataAddress, ndata);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateImageRGBA(jlong ctxAddress, jint w, jint h, jint imageFlags, jlong dataAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    return (jint)nvgCreateImageRGBA(ctx, w, h, imageFlags, data);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateImageRGBA(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint w, jint h, jint imageFlags, jlong dataAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateImageRGBA(ctxAddress, w, h, imageFlags, dataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgUpdateImage(jlong ctxAddress, jint image, jlong dataAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    nvgUpdateImage(ctx, image, data);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgUpdateImage(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image, jlong dataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgUpdateImage(ctxAddress, image, dataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JIJJ(jlong ctxAddress, jint image, jlong wAddress, jlong hAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    int *w = (int *)(intptr_t)wAddress;
    int *h = (int *)(intptr_t)hAddress;
    nvgImageSize(ctx, image, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JIJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image, jlong wAddress, jlong hAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JIJJ(ctxAddress, image, wAddress, hAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgDeleteImage(jlong ctxAddress, jint image) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgDeleteImage(ctx, image);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgDeleteImage(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgDeleteImage(ctxAddress, image);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgLinearGradient)(jlong ctxAddress, jfloat sx, jfloat sy, jfloat ex, jfloat ey, jlong icolAddress, jlong ocolAddress, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *icol = (NVGcolor *)(intptr_t)icolAddress;
    NVGcolor *ocol = (NVGcolor *)(intptr_t)ocolAddress;
    *((NVGpaint*)(intptr_t)__result) = nvgLinearGradient(ctx, sx, sy, ex, ey, *icol, *ocol);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLinearGradient(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat sx, jfloat sy, jfloat ex, jfloat ey, jlong icolAddress, jlong ocolAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgLinearGradient)(ctxAddress, sx, sy, ex, ey, icolAddress, ocolAddress, __result);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgBoxGradient)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r, jfloat f, jlong icolAddress, jlong ocolAddress, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *icol = (NVGcolor *)(intptr_t)icolAddress;
    NVGcolor *ocol = (NVGcolor *)(intptr_t)ocolAddress;
    *((NVGpaint*)(intptr_t)__result) = nvgBoxGradient(ctx, x, y, w, h, r, f, *icol, *ocol);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBoxGradient(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r, jfloat f, jlong icolAddress, jlong ocolAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgBoxGradient)(ctxAddress, x, y, w, h, r, f, icolAddress, ocolAddress, __result);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgRadialGradient)(jlong ctxAddress, jfloat cx, jfloat cy, jfloat inr, jfloat outr, jlong icolAddress, jlong ocolAddress, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    NVGcolor *icol = (NVGcolor *)(intptr_t)icolAddress;
    NVGcolor *ocol = (NVGcolor *)(intptr_t)ocolAddress;
    *((NVGpaint*)(intptr_t)__result) = nvgRadialGradient(ctx, cx, cy, inr, outr, *icol, *ocol);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRadialGradient(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat inr, jfloat outr, jlong icolAddress, jlong ocolAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgRadialGradient)(ctxAddress, cx, cy, inr, outr, icolAddress, ocolAddress, __result);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgImagePattern)(jlong ctxAddress, jfloat ox, jfloat oy, jfloat ex, jfloat ey, jfloat angle, jint image, jfloat alpha, jlong __result) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    *((NVGpaint*)(intptr_t)__result) = nvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgImagePattern(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat ox, jfloat oy, jfloat ex, jfloat ey, jfloat angle, jint image, jfloat alpha, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgImagePattern)(ctxAddress, ox, oy, ex, ey, angle, image, alpha, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgScissor(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgScissor(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgScissor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgScissor(ctxAddress, x, y, w, h);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgIntersectScissor(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgIntersectScissor(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgIntersectScissor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgIntersectScissor(ctxAddress, x, y, w, h);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgResetScissor(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgResetScissor(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgResetScissor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgResetScissor(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgBeginPath(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgBeginPath(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBeginPath(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgBeginPath(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgMoveTo(jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgMoveTo(ctx, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgMoveTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgMoveTo(ctxAddress, x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLineTo(jlong ctxAddress, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgLineTo(ctx, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgLineTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgLineTo(ctxAddress, x, y);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgBezierTo)(jlong ctxAddress, jfloat c1x, jfloat c1y, jfloat c2x, jfloat c2y, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgBezierTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat c1x, jfloat c1y, jfloat c2x, jfloat c2y, jfloat x, jfloat y) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgBezierTo)(ctxAddress, c1x, c1y, c2x, c2y, x, y);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgQuadTo(jlong ctxAddress, jfloat cx, jfloat cy, jfloat x, jfloat y) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgQuadTo(ctx, cx, cy, x, y);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgQuadTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat x, jfloat y) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgQuadTo(ctxAddress, cx, cy, x, y);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgArcTo)(jlong ctxAddress, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat radius) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgArcTo(ctx, x1, y1, x2, y2, radius);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgArcTo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat radius) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgArcTo)(ctxAddress, x1, y1, x2, y2, radius);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgClosePath(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgClosePath(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgClosePath(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgClosePath(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgPathWinding(jlong ctxAddress, jint dir) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgPathWinding(ctx, dir);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgPathWinding(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint dir) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgPathWinding(ctxAddress, dir);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgArc)(jlong ctxAddress, jfloat cx, jfloat cy, jfloat r, jfloat a0, jfloat a1, jint dir) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgArc(ctx, cx, cy, r, a0, a1, dir);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgArc(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat r, jfloat a0, jfloat a1, jint dir) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgArc)(ctxAddress, cx, cy, r, a0, a1, dir);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRect(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgRect(ctx, x, y, w, h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRect(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgRect(ctxAddress, x, y, w, h);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgRoundedRect)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgRoundedRect(ctx, x, y, w, h, r);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRoundedRect(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat r) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgRoundedRect)(ctxAddress, x, y, w, h, r);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgRoundedRectVarying)(jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat radTopLeft, jfloat radTopRight, jfloat radBottomRight, jfloat radBottomLeft) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgRoundedRectVarying(ctx, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgRoundedRectVarying(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat w, jfloat h, jfloat radTopLeft, jfloat radTopRight, jfloat radBottomRight, jfloat radBottomLeft) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgRoundedRectVarying)(ctxAddress, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgEllipse(jlong ctxAddress, jfloat cx, jfloat cy, jfloat rx, jfloat ry) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgEllipse(ctx, cx, cy, rx, ry);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgEllipse(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat rx, jfloat ry) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgEllipse(ctxAddress, cx, cy, rx, ry);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCircle(jlong ctxAddress, jfloat cx, jfloat cy, jfloat r) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgCircle(ctx, cx, cy, r);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCircle(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat cx, jfloat cy, jfloat r) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCircle(ctxAddress, cx, cy, r);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFill(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgFill(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFill(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFill(ctxAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStroke(jlong ctxAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgStroke(ctx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgStroke(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgStroke(ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateFont(jlong ctxAddress, jlong nameAddress, jlong filenameAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    return (jint)nvgCreateFont(ctx, name, filename);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateFont(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong filenameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateFont(ctxAddress, nameAddress, filenameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateFontMem(jlong ctxAddress, jlong nameAddress, jlong dataAddress, jint ndata, jint freeData) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    unsigned char *data = (unsigned char *)(intptr_t)dataAddress;
    return (jint)nvgCreateFontMem(ctx, name, data, ndata, freeData);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCreateFontMem(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong dataAddress, jint ndata, jint freeData) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCreateFontMem(ctxAddress, nameAddress, dataAddress, ndata, freeData);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFindFont(jlong ctxAddress, jlong nameAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    return (jint)nvgFindFont(ctx, name);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFindFont(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFindFont(ctxAddress, nameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFontId(jlong ctxAddress, jint baseFont, jint fallbackFont) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    return (jint)nvgAddFallbackFontId(ctx, baseFont, fallbackFont);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFontId(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint baseFont, jint fallbackFont) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFontId(ctxAddress, baseFont, fallbackFont);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFont(jlong ctxAddress, jlong baseFontAddress, jlong fallbackFontAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *baseFont = (char const *)(intptr_t)baseFontAddress;
    char const *fallbackFont = (char const *)(intptr_t)fallbackFontAddress;
    return (jint)nvgAddFallbackFont(ctx, baseFont, fallbackFont);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFont(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong baseFontAddress, jlong fallbackFontAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgAddFallbackFont(ctxAddress, baseFontAddress, fallbackFontAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontSize(jlong ctxAddress, jfloat size) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgFontSize(ctx, size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontSize(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontSize(ctxAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontBlur(jlong ctxAddress, jfloat blur) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgFontBlur(ctx, blur);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontBlur(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat blur) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontBlur(ctxAddress, blur);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextLetterSpacing(jlong ctxAddress, jfloat spacing) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgTextLetterSpacing(ctx, spacing);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextLetterSpacing(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat spacing) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextLetterSpacing(ctxAddress, spacing);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextLineHeight(jlong ctxAddress, jfloat lineHeight) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgTextLineHeight(ctx, lineHeight);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextLineHeight(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat lineHeight) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextLineHeight(ctxAddress, lineHeight);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextAlign(jlong ctxAddress, jint align) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgTextAlign(ctx, align);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextAlign(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint align) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextAlign(ctxAddress, align);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontFaceId(jlong ctxAddress, jint font) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    nvgFontFaceId(ctx, font);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontFaceId(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint font) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontFaceId(ctxAddress, font);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontFace(jlong ctxAddress, jlong fontAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *font = (char const *)(intptr_t)fontAddress;
    nvgFontFace(ctx, font);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgFontFace(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgFontFace(ctxAddress, fontAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgText(jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    return (jfloat)nvgText(ctx, x, y, string, end);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgText(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgText(ctxAddress, x, y, stringAddress, endAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBox)(jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    nvgTextBox(ctx, x, y, breakRowWidth, string, end);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBox(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBox)(ctxAddress, x, y, breakRowWidth, stringAddress, endAddress);
}

JNIEXPORT_CRITICAL jfloat JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJJ)(jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jlong boundsAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    float *bounds = (float *)(intptr_t)boundsAddress;
    return (jfloat)nvgTextBounds(ctx, x, y, string, end, bounds);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jlong boundsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJJ)(ctxAddress, x, y, stringAddress, endAddress, boundsAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJJ)(jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jlong boundsAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    float *bounds = (float *)(intptr_t)boundsAddress;
    nvgTextBoxBounds(ctx, x, y, breakRowWidth, string, end, bounds);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jlong boundsAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJJ)(ctxAddress, x, y, breakRowWidth, stringAddress, endAddress, boundsAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextGlyphPositions)(jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jlong positionsAddress, jint maxPositions) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    NVGglyphPosition *positions = (NVGglyphPosition *)(intptr_t)positionsAddress;
    return (jint)nvgTextGlyphPositions(ctx, x, y, string, end, positions, maxPositions);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextGlyphPositions(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jlong positionsAddress, jint maxPositions) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextGlyphPositions)(ctxAddress, x, y, stringAddress, endAddress, positionsAddress, maxPositions);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__JJJJ(jlong ctxAddress, jlong ascenderAddress, jlong descenderAddress, jlong linehAddress) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    float *ascender = (float *)(intptr_t)ascenderAddress;
    float *descender = (float *)(intptr_t)descenderAddress;
    float *lineh = (float *)(intptr_t)linehAddress;
    nvgTextMetrics(ctx, ascender, descender, lineh);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__JJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong ascenderAddress, jlong descenderAddress, jlong linehAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__JJJJ(ctxAddress, ascenderAddress, descenderAddress, linehAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBreakLines)(jlong ctxAddress, jlong stringAddress, jlong endAddress, jfloat breakRowWidth, jlong rowsAddress, jint maxRows) {
    NVGcontext *ctx = (NVGcontext *)(intptr_t)ctxAddress;
    char const *string = (char const *)(intptr_t)stringAddress;
    char const *end = (char const *)(intptr_t)endAddress;
    NVGtextRow *rows = (NVGtextRow *)(intptr_t)rowsAddress;
    return (jint)nvgTextBreakLines(ctx, string, end, breakRowWidth, rows, maxRows);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBreakLines(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong stringAddress, jlong endAddress, jfloat breakRowWidth, jlong rowsAddress, jint maxRows) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBreakLines)(ctxAddress, stringAddress, endAddress, breakRowWidth, rowsAddress, maxRows);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__J_3F(jlong ctxAddress, jint xform__length, jfloat* xform) {
    UNUSED_PARAM(xform__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__JJ(ctxAddress, (intptr_t)xform);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__J_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray xformAddress) {
    jfloat *xform = (*__env)->GetPrimitiveArrayCritical(__env, xformAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgCurrentTransform__JJ(ctxAddress, (intptr_t)xform);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xformAddress, xform, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity___3F(jint dst__length, jfloat* dst) {
    UNUSED_PARAM(dst__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity__J((intptr_t)dst);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity___3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformIdentity__J((intptr_t)dst);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate___3FFF(jint dst__length, jfloat* dst, jfloat tx, jfloat ty) {
    UNUSED_PARAM(dst__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF((intptr_t)dst, tx, ty);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate___3FFF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat tx, jfloat ty) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF((intptr_t)dst, tx, ty);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformScale___3FFF(jint dst__length, jfloat* dst, jfloat sx, jfloat sy) {
    UNUSED_PARAM(dst__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF((intptr_t)dst, sx, sy);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformScale___3FFF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat sx, jfloat sy) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF((intptr_t)dst, sx, sy);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate___3FF(jint dst__length, jfloat* dst, jfloat a) {
    UNUSED_PARAM(dst__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate__JF((intptr_t)dst, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate___3FF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat a) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformRotate__JF((intptr_t)dst, a);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX___3FF(jint dst__length, jfloat* dst, jfloat a) {
    UNUSED_PARAM(dst__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX__JF((intptr_t)dst, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX___3FF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat a) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewX__JF((intptr_t)dst, a);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY___3FF(jint dst__length, jfloat* dst, jfloat a) {
    UNUSED_PARAM(dst__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY__JF((intptr_t)dst, a);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY___3FF(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloat a) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformSkewY__JF((intptr_t)dst, a);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply___3F_3F(jint dst__length, jfloat* dst, jint src__length, jfloat* src) {
    UNUSED_PARAM(dst__length)
    UNUSED_PARAM(src__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply__JJ((intptr_t)dst, (intptr_t)src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply___3F_3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloatArray srcAddress) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformMultiply__JJ((intptr_t)dst, (intptr_t)src);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply___3F_3F(jint dst__length, jfloat* dst, jint src__length, jfloat* src) {
    UNUSED_PARAM(dst__length)
    UNUSED_PARAM(src__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply__JJ((intptr_t)dst, (intptr_t)src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply___3F_3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloatArray srcAddress) {
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPremultiply__JJ((intptr_t)dst, (intptr_t)src);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse___3F_3F(jint dst__length, jfloat* dst, jint src__length, jfloat* src) {
    UNUSED_PARAM(dst__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse__JJ((intptr_t)dst, (intptr_t)src);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse___3F_3F(JNIEnv *__env, jclass clazz, jfloatArray dstAddress, jfloatArray srcAddress) {
    jint __result;
    jfloat *dst = (*__env)->GetPrimitiveArrayCritical(__env, dstAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformInverse__JJ((intptr_t)dst, (intptr_t)src);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstAddress, dst, 0);
    return __result;
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint___3F_3F_3FFF(jint dstx__length, jfloat* dstx, jint dsty__length, jfloat* dsty, jint xform__length, jfloat* xform, jfloat srcx, jfloat srcy) {
    UNUSED_PARAM(dstx__length)
    UNUSED_PARAM(dsty__length)
    UNUSED_PARAM(xform__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint__JJJFF((intptr_t)dstx, (intptr_t)dsty, (intptr_t)xform, srcx, srcy);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint___3F_3F_3FFF(JNIEnv *__env, jclass clazz, jfloatArray dstxAddress, jfloatArray dstyAddress, jfloatArray xformAddress, jfloat srcx, jfloat srcy) {
    jfloat *dstx = (*__env)->GetPrimitiveArrayCritical(__env, dstxAddress, 0);
    jfloat *dsty = (*__env)->GetPrimitiveArrayCritical(__env, dstyAddress, 0);
    jfloat *xform = (*__env)->GetPrimitiveArrayCritical(__env, xformAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTransformPoint__JJJFF((intptr_t)dstx, (intptr_t)dsty, (intptr_t)xform, srcx, srcy);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xformAddress, xform, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstyAddress, dsty, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dstxAddress, dstx, 0);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JI_3I_3I(jlong ctxAddress, jint image, jint w__length, jint* w, jint h__length, jint* h) {
    UNUSED_PARAM(w__length)
    UNUSED_PARAM(h__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JIJJ(ctxAddress, image, (intptr_t)w, (intptr_t)h);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JI_3I_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint image, jintArray wAddress, jintArray hAddress) {
    jint *w = (*__env)->GetPrimitiveArrayCritical(__env, wAddress, 0);
    jint *h = (*__env)->GetPrimitiveArrayCritical(__env, hAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgImageSize__JIJJ(ctxAddress, image, (intptr_t)w, (intptr_t)h);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hAddress, h, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, wAddress, w, 0);
}

JNIEXPORT_CRITICAL jfloat JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJ_3F)(jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jint bounds__length, jfloat* bounds) {
    UNUSED_PARAM(bounds__length)
    return CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJJ)(ctxAddress, x, y, stringAddress, endAddress, (intptr_t)bounds);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJ_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jlong stringAddress, jlong endAddress, jfloatArray boundsAddress) {
    jfloat __result;
    jfloat *bounds = boundsAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, boundsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBounds__JFFJJJ)(ctxAddress, x, y, stringAddress, endAddress, (intptr_t)bounds);
    if (bounds != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, boundsAddress, bounds, 0); }
    return __result;
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJ_3F)(jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jint bounds__length, jfloat* bounds) {
    UNUSED_PARAM(bounds__length)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJJ)(ctxAddress, x, y, breakRowWidth, stringAddress, endAddress, (intptr_t)bounds);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJ_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat x, jfloat y, jfloat breakRowWidth, jlong stringAddress, jlong endAddress, jfloatArray boundsAddress) {
    jfloat *bounds = boundsAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, boundsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_nanovg_NanoVG_nnvgTextBoxBounds__JFFFJJJ)(ctxAddress, x, y, breakRowWidth, stringAddress, endAddress, (intptr_t)bounds);
    if (bounds != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, boundsAddress, bounds, 0); }
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__J_3F_3F_3F(jlong ctxAddress, jint ascender__length, jfloat* ascender, jint descender__length, jfloat* descender, jint lineh__length, jfloat* lineh) {
    UNUSED_PARAM(ascender__length)
    UNUSED_PARAM(descender__length)
    UNUSED_PARAM(lineh__length)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__JJJJ(ctxAddress, (intptr_t)ascender, (intptr_t)descender, (intptr_t)lineh);
}
JNIEXPORT void JNICALL Java_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__J_3F_3F_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray ascenderAddress, jfloatArray descenderAddress, jfloatArray linehAddress) {
    jfloat *ascender = ascenderAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ascenderAddress, 0);
    jfloat *descender = descenderAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, descenderAddress, 0);
    jfloat *lineh = linehAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, linehAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_nanovg_NanoVG_nnvgTextMetrics__JJJJ(ctxAddress, (intptr_t)ascender, (intptr_t)descender, (intptr_t)lineh);
    if (lineh != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, linehAddress, lineh, 0); }
    if (descender != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, descenderAddress, descender, 0); }
    if (ascender != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ascenderAddress, ascender, 0); }
}

EXTERN_C_EXIT
