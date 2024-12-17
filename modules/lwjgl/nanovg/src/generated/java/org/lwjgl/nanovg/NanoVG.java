/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NanoVG {

    static { LibNanoVG.initialize(); }

    public static final float NVG_PI = 3.1415927f;

    public static final int
        NVG_CCW = 0x1,
        NVG_CW  = 0x2;

    public static final int
        NVG_SOLID = 0x1,
        NVG_HOLE  = 0x2;

    public static final int
        NVG_BUTT   = 0,
        NVG_ROUND  = 1,
        NVG_SQUARE = 2,
        NVG_BEVEL  = 3,
        NVG_MITER  = 4;

    public static final int
        NVG_ALIGN_LEFT     = 1<<0,
        NVG_ALIGN_CENTER   = 1<<1,
        NVG_ALIGN_RIGHT    = 1<<2,
        NVG_ALIGN_TOP      = 1<<3,
        NVG_ALIGN_MIDDLE   = 1<<4,
        NVG_ALIGN_BOTTOM   = 1<<5,
        NVG_ALIGN_BASELINE = 1<<6;

    public static final int
        NVG_ZERO                = 1<<0,
        NVG_ONE                 = 1<<1,
        NVG_SRC_COLOR           = 1<<2,
        NVG_ONE_MINUS_SRC_COLOR = 1<<3,
        NVG_DST_COLOR           = 1<<4,
        NVG_ONE_MINUS_DST_COLOR = 1<<5,
        NVG_SRC_ALPHA           = 1<<6,
        NVG_ONE_MINUS_SRC_ALPHA = 1<<7,
        NVG_DST_ALPHA           = 1<<8,
        NVG_ONE_MINUS_DST_ALPHA = 1<<9,
        NVG_SRC_ALPHA_SATURATE  = 1<<10;

    public static final int
        NVG_SOURCE_OVER      = 0,
        NVG_SOURCE_IN        = 1,
        NVG_SOURCE_OUT       = 2,
        NVG_ATOP             = 3,
        NVG_DESTINATION_OVER = 4,
        NVG_DESTINATION_IN   = 5,
        NVG_DESTINATION_OUT  = 6,
        NVG_DESTINATION_ATOP = 7,
        NVG_LIGHTER          = 8,
        NVG_COPY             = 9,
        NVG_XOR              = 10;

    public static final int
        NVG_IMAGE_GENERATE_MIPMAPS = 1<<0,
        NVG_IMAGE_REPEATX          = 1<<1,
        NVG_IMAGE_REPEATY          = 1<<2,
        NVG_IMAGE_FLIPY            = 1<<3,
        NVG_IMAGE_PREMULTIPLIED    = 1<<4,
        NVG_IMAGE_NEAREST          = 1<<5;

    protected NanoVG() {
        throw new UnsupportedOperationException();
    }

    // --- [ nvgBeginFrame ] ---

    /** {@code void nvgBeginFrame(NVGcontext * ctx, float windowWidth, float windowHeight, float devicePixelRatio)} */
    public static native void nnvgBeginFrame(long ctx, float windowWidth, float windowHeight, float devicePixelRatio);

    /** {@code void nvgBeginFrame(NVGcontext * ctx, float windowWidth, float windowHeight, float devicePixelRatio)} */
    public static void nvgBeginFrame(@NativeType("NVGcontext *") long ctx, float windowWidth, float windowHeight, float devicePixelRatio) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
    }

    // --- [ nvgCancelFrame ] ---

    /** {@code void nvgCancelFrame(NVGcontext * ctx)} */
    public static native void nnvgCancelFrame(long ctx);

    /** {@code void nvgCancelFrame(NVGcontext * ctx)} */
    public static void nvgCancelFrame(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgCancelFrame(ctx);
    }

    // --- [ nvgEndFrame ] ---

    /** {@code void nvgEndFrame(NVGcontext * ctx)} */
    public static native void nnvgEndFrame(long ctx);

    /** {@code void nvgEndFrame(NVGcontext * ctx)} */
    public static void nvgEndFrame(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgEndFrame(ctx);
    }

    // --- [ nvgGlobalCompositeOperation ] ---

    /** {@code void nvgGlobalCompositeOperation(NVGcontext * ctx, int op)} */
    public static native void nnvgGlobalCompositeOperation(long ctx, int op);

    /** {@code void nvgGlobalCompositeOperation(NVGcontext * ctx, int op)} */
    public static void nvgGlobalCompositeOperation(@NativeType("NVGcontext *") long ctx, int op) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalCompositeOperation(ctx, op);
    }

    // --- [ nvgGlobalCompositeBlendFunc ] ---

    /** {@code void nvgGlobalCompositeBlendFunc(NVGcontext * ctx, int sfactor, int dfactor)} */
    public static native void nnvgGlobalCompositeBlendFunc(long ctx, int sfactor, int dfactor);

    /** {@code void nvgGlobalCompositeBlendFunc(NVGcontext * ctx, int sfactor, int dfactor)} */
    public static void nvgGlobalCompositeBlendFunc(@NativeType("NVGcontext *") long ctx, int sfactor, int dfactor) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalCompositeBlendFunc(ctx, sfactor, dfactor);
    }

    // --- [ nvgGlobalCompositeBlendFuncSeparate ] ---

    /** {@code void nvgGlobalCompositeBlendFuncSeparate(NVGcontext * ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha)} */
    public static native void nnvgGlobalCompositeBlendFuncSeparate(long ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    /** {@code void nvgGlobalCompositeBlendFuncSeparate(NVGcontext * ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha)} */
    public static void nvgGlobalCompositeBlendFuncSeparate(@NativeType("NVGcontext *") long ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalCompositeBlendFuncSeparate(ctx, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    // --- [ nvgRGB ] ---

    /** {@code NVGcolor nvgRGB(unsigned char r, unsigned char g, unsigned char b)} */
    public static native void nnvgRGB(byte r, byte g, byte b, long __result);

    /** {@code NVGcolor nvgRGB(unsigned char r, unsigned char g, unsigned char b)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGB(@NativeType("unsigned char") byte r, @NativeType("unsigned char") byte g, @NativeType("unsigned char") byte b, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGB(r, g, b, __result.address());
        return __result;
    }

    // --- [ nvgRGBf ] ---

    /** {@code NVGcolor nvgRGBf(float r, float g, float b)} */
    public static native void nnvgRGBf(float r, float g, float b, long __result);

    /** {@code NVGcolor nvgRGBf(float r, float g, float b)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGBf(float r, float g, float b, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBf(r, g, b, __result.address());
        return __result;
    }

    // --- [ nvgRGBA ] ---

    /** {@code NVGcolor nvgRGBA(unsigned char r, unsigned char g, unsigned char b, unsigned char a)} */
    public static native void nnvgRGBA(byte r, byte g, byte b, byte a, long __result);

    /** {@code NVGcolor nvgRGBA(unsigned char r, unsigned char g, unsigned char b, unsigned char a)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGBA(@NativeType("unsigned char") byte r, @NativeType("unsigned char") byte g, @NativeType("unsigned char") byte b, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBA(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nvgRGBAf ] ---

    /** {@code NVGcolor nvgRGBAf(float r, float g, float b, float a)} */
    public static native void nnvgRGBAf(float r, float g, float b, float a, long __result);

    /** {@code NVGcolor nvgRGBAf(float r, float g, float b, float a)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgRGBAf(float r, float g, float b, float a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgRGBAf(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nvgLerpRGBA ] ---

    /** {@code NVGcolor nvgLerpRGBA(NVGcolor c0, NVGcolor c1, float u)} */
    public static native void nnvgLerpRGBA(long c0, long c1, float u, long __result);

    /** {@code NVGcolor nvgLerpRGBA(NVGcolor c0, NVGcolor c1, float u)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgLerpRGBA(@NativeType("NVGcolor") NVGColor c0, @NativeType("NVGcolor") NVGColor c1, float u, @NativeType("NVGcolor") NVGColor __result) {
        nnvgLerpRGBA(c0.address(), c1.address(), u, __result.address());
        return __result;
    }

    // --- [ nvgTransRGBA ] ---

    /** {@code NVGcolor nvgTransRGBA(NVGcolor c0, unsigned char a)} */
    public static native void nnvgTransRGBA(long c0, byte a, long __result);

    /** {@code NVGcolor nvgTransRGBA(NVGcolor c0, unsigned char a)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBA(@NativeType("NVGcolor") NVGColor c0, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgTransRGBA(c0.address(), a, __result.address());
        return __result;
    }

    // --- [ nvgTransRGBAf ] ---

    /** {@code NVGcolor nvgTransRGBAf(NVGcolor c0, float a)} */
    public static native void nnvgTransRGBAf(long c0, float a, long __result);

    /** {@code NVGcolor nvgTransRGBAf(NVGcolor c0, float a)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgTransRGBAf(@NativeType("NVGcolor") NVGColor c0, float a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgTransRGBAf(c0.address(), a, __result.address());
        return __result;
    }

    // --- [ nvgHSL ] ---

    /** {@code NVGcolor nvgHSL(float h, float s, float l)} */
    public static native void nnvgHSL(float h, float s, float l, long __result);

    /** {@code NVGcolor nvgHSL(float h, float s, float l)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgHSL(float h, float s, float l, @NativeType("NVGcolor") NVGColor __result) {
        nnvgHSL(h, s, l, __result.address());
        return __result;
    }

    // --- [ nvgHSLA ] ---

    /** {@code NVGcolor nvgHSLA(float h, float s, float l, unsigned char a)} */
    public static native void nnvgHSLA(float h, float s, float l, byte a, long __result);

    /** {@code NVGcolor nvgHSLA(float h, float s, float l, unsigned char a)} */
    @NativeType("NVGcolor")
    public static NVGColor nvgHSLA(float h, float s, float l, @NativeType("unsigned char") byte a, @NativeType("NVGcolor") NVGColor __result) {
        nnvgHSLA(h, s, l, a, __result.address());
        return __result;
    }

    // --- [ nvgSave ] ---

    /** {@code void nvgSave(NVGcontext * ctx)} */
    public static native void nnvgSave(long ctx);

    /** {@code void nvgSave(NVGcontext * ctx)} */
    public static void nvgSave(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgSave(ctx);
    }

    // --- [ nvgRestore ] ---

    /** {@code void nvgRestore(NVGcontext * ctx)} */
    public static native void nnvgRestore(long ctx);

    /** {@code void nvgRestore(NVGcontext * ctx)} */
    public static void nvgRestore(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRestore(ctx);
    }

    // --- [ nvgReset ] ---

    /** {@code void nvgReset(NVGcontext * ctx)} */
    public static native void nnvgReset(long ctx);

    /** {@code void nvgReset(NVGcontext * ctx)} */
    public static void nvgReset(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgReset(ctx);
    }

    // --- [ nvgShapeAntiAlias ] ---

    /** {@code void nvgShapeAntiAlias(NVGcontext * ctx, int enabled)} */
    public static native void nnvgShapeAntiAlias(long ctx, int enabled);

    /** {@code void nvgShapeAntiAlias(NVGcontext * ctx, int enabled)} */
    public static void nvgShapeAntiAlias(@NativeType("NVGcontext *") long ctx, @NativeType("int") boolean enabled) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgShapeAntiAlias(ctx, enabled ? 1 : 0);
    }

    // --- [ nvgStrokeColor ] ---

    /** {@code void nvgStrokeColor(NVGcontext * ctx, NVGcolor color)} */
    public static native void nnvgStrokeColor(long ctx, long color);

    /** {@code void nvgStrokeColor(NVGcontext * ctx, NVGcolor color)} */
    public static void nvgStrokeColor(@NativeType("NVGcontext *") long ctx, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStrokeColor(ctx, color.address());
    }

    // --- [ nvgStrokePaint ] ---

    /** {@code void nvgStrokePaint(NVGcontext * ctx, NVGpaint paint)} */
    public static native void nnvgStrokePaint(long ctx, long paint);

    /** {@code void nvgStrokePaint(NVGcontext * ctx, NVGpaint paint)} */
    public static void nvgStrokePaint(@NativeType("NVGcontext *") long ctx, @NativeType("NVGpaint") NVGPaint paint) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStrokePaint(ctx, paint.address());
    }

    // --- [ nvgFillColor ] ---

    /** {@code void nvgFillColor(NVGcontext * ctx, NVGcolor color)} */
    public static native void nnvgFillColor(long ctx, long color);

    /** {@code void nvgFillColor(NVGcontext * ctx, NVGcolor color)} */
    public static void nvgFillColor(@NativeType("NVGcontext *") long ctx, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFillColor(ctx, color.address());
    }

    // --- [ nvgFillPaint ] ---

    /** {@code void nvgFillPaint(NVGcontext * ctx, NVGpaint paint)} */
    public static native void nnvgFillPaint(long ctx, long paint);

    /** {@code void nvgFillPaint(NVGcontext * ctx, NVGpaint paint)} */
    public static void nvgFillPaint(@NativeType("NVGcontext *") long ctx, @NativeType("NVGpaint") NVGPaint paint) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFillPaint(ctx, paint.address());
    }

    // --- [ nvgMiterLimit ] ---

    /** {@code void nvgMiterLimit(NVGcontext * ctx, float limit)} */
    public static native void nnvgMiterLimit(long ctx, float limit);

    /** {@code void nvgMiterLimit(NVGcontext * ctx, float limit)} */
    public static void nvgMiterLimit(@NativeType("NVGcontext *") long ctx, float limit) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgMiterLimit(ctx, limit);
    }

    // --- [ nvgStrokeWidth ] ---

    /** {@code void nvgStrokeWidth(NVGcontext * ctx, float size)} */
    public static native void nnvgStrokeWidth(long ctx, float size);

    /** {@code void nvgStrokeWidth(NVGcontext * ctx, float size)} */
    public static void nvgStrokeWidth(@NativeType("NVGcontext *") long ctx, float size) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStrokeWidth(ctx, size);
    }

    // --- [ nvgLineCap ] ---

    /** {@code void nvgLineCap(NVGcontext * ctx, int cap)} */
    public static native void nnvgLineCap(long ctx, int cap);

    /** {@code void nvgLineCap(NVGcontext * ctx, int cap)} */
    public static void nvgLineCap(@NativeType("NVGcontext *") long ctx, int cap) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLineCap(ctx, cap);
    }

    // --- [ nvgLineJoin ] ---

    /** {@code void nvgLineJoin(NVGcontext * ctx, int join)} */
    public static native void nnvgLineJoin(long ctx, int join);

    /** {@code void nvgLineJoin(NVGcontext * ctx, int join)} */
    public static void nvgLineJoin(@NativeType("NVGcontext *") long ctx, int join) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLineJoin(ctx, join);
    }

    // --- [ nvgGlobalAlpha ] ---

    /** {@code void nvgGlobalAlpha(NVGcontext * ctx, float alpha)} */
    public static native void nnvgGlobalAlpha(long ctx, float alpha);

    /** {@code void nvgGlobalAlpha(NVGcontext * ctx, float alpha)} */
    public static void nvgGlobalAlpha(@NativeType("NVGcontext *") long ctx, float alpha) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgGlobalAlpha(ctx, alpha);
    }

    // --- [ nvgResetTransform ] ---

    /** {@code void nvgResetTransform(NVGcontext * ctx)} */
    public static native void nnvgResetTransform(long ctx);

    /** {@code void nvgResetTransform(NVGcontext * ctx)} */
    public static void nvgResetTransform(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgResetTransform(ctx);
    }

    // --- [ nvgTransform ] ---

    /** {@code void nvgTransform(NVGcontext * ctx, float a, float b, float c, float d, float e, float f)} */
    public static native void nnvgTransform(long ctx, float a, float b, float c, float d, float e, float f);

    /** {@code void nvgTransform(NVGcontext * ctx, float a, float b, float c, float d, float e, float f)} */
    public static void nvgTransform(@NativeType("NVGcontext *") long ctx, float a, float b, float c, float d, float e, float f) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTransform(ctx, a, b, c, d, e, f);
    }

    // --- [ nvgTranslate ] ---

    /** {@code void nvgTranslate(NVGcontext * ctx, float x, float y)} */
    public static native void nnvgTranslate(long ctx, float x, float y);

    /** {@code void nvgTranslate(NVGcontext * ctx, float x, float y)} */
    public static void nvgTranslate(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTranslate(ctx, x, y);
    }

    // --- [ nvgRotate ] ---

    /** {@code void nvgRotate(NVGcontext * ctx, float angle)} */
    public static native void nnvgRotate(long ctx, float angle);

    /** {@code void nvgRotate(NVGcontext * ctx, float angle)} */
    public static void nvgRotate(@NativeType("NVGcontext *") long ctx, float angle) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRotate(ctx, angle);
    }

    // --- [ nvgSkewX ] ---

    /** {@code void nvgSkewX(NVGcontext * ctx, float angle)} */
    public static native void nnvgSkewX(long ctx, float angle);

    /** {@code void nvgSkewX(NVGcontext * ctx, float angle)} */
    public static void nvgSkewX(@NativeType("NVGcontext *") long ctx, float angle) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgSkewX(ctx, angle);
    }

    // --- [ nvgSkewY ] ---

    /** {@code void nvgSkewY(NVGcontext * ctx, float angle)} */
    public static native void nnvgSkewY(long ctx, float angle);

    /** {@code void nvgSkewY(NVGcontext * ctx, float angle)} */
    public static void nvgSkewY(@NativeType("NVGcontext *") long ctx, float angle) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgSkewY(ctx, angle);
    }

    // --- [ nvgScale ] ---

    /** {@code void nvgScale(NVGcontext * ctx, float x, float y)} */
    public static native void nnvgScale(long ctx, float x, float y);

    /** {@code void nvgScale(NVGcontext * ctx, float x, float y)} */
    public static void nvgScale(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgScale(ctx, x, y);
    }

    // --- [ nvgCurrentTransform ] ---

    /** {@code void nvgCurrentTransform(NVGcontext * ctx, float * xform)} */
    public static native void nnvgCurrentTransform(long ctx, long xform);

    /** {@code void nvgCurrentTransform(NVGcontext * ctx, float * xform)} */
    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long ctx, @NativeType("float *") FloatBuffer xform) {
        if (CHECKS) {
            check(ctx);
            check(xform, 6);
        }
        nnvgCurrentTransform(ctx, memAddress(xform));
    }

    // --- [ nvgTransformIdentity ] ---

    /** {@code void nvgTransformIdentity(float * dst)} */
    public static native void nnvgTransformIdentity(long dst);

    /** {@code void nvgTransformIdentity(float * dst)} */
    public static void nvgTransformIdentity(@NativeType("float *") FloatBuffer dst) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformIdentity(memAddress(dst));
    }

    // --- [ nvgTransformTranslate ] ---

    /** {@code void nvgTransformTranslate(float * dst, float tx, float ty)} */
    public static native void nnvgTransformTranslate(long dst, float tx, float ty);

    /** {@code void nvgTransformTranslate(float * dst, float tx, float ty)} */
    public static void nvgTransformTranslate(@NativeType("float *") FloatBuffer dst, float tx, float ty) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformTranslate(memAddress(dst), tx, ty);
    }

    // --- [ nvgTransformScale ] ---

    /** {@code void nvgTransformScale(float * dst, float sx, float sy)} */
    public static native void nnvgTransformScale(long dst, float sx, float sy);

    /** {@code void nvgTransformScale(float * dst, float sx, float sy)} */
    public static void nvgTransformScale(@NativeType("float *") FloatBuffer dst, float sx, float sy) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformScale(memAddress(dst), sx, sy);
    }

    // --- [ nvgTransformRotate ] ---

    /** {@code void nvgTransformRotate(float * dst, float a)} */
    public static native void nnvgTransformRotate(long dst, float a);

    /** {@code void nvgTransformRotate(float * dst, float a)} */
    public static void nvgTransformRotate(@NativeType("float *") FloatBuffer dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformRotate(memAddress(dst), a);
    }

    // --- [ nvgTransformSkewX ] ---

    /** {@code void nvgTransformSkewX(float * dst, float a)} */
    public static native void nnvgTransformSkewX(long dst, float a);

    /** {@code void nvgTransformSkewX(float * dst, float a)} */
    public static void nvgTransformSkewX(@NativeType("float *") FloatBuffer dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewX(memAddress(dst), a);
    }

    // --- [ nvgTransformSkewY ] ---

    /** {@code void nvgTransformSkewY(float * dst, float a)} */
    public static native void nnvgTransformSkewY(long dst, float a);

    /** {@code void nvgTransformSkewY(float * dst, float a)} */
    public static void nvgTransformSkewY(@NativeType("float *") FloatBuffer dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewY(memAddress(dst), a);
    }

    // --- [ nvgTransformMultiply ] ---

    /** {@code void nvgTransformMultiply(float * dst, float const * src)} */
    public static native void nnvgTransformMultiply(long dst, long src);

    /** {@code void nvgTransformMultiply(float * dst, float const * src)} */
    public static void nvgTransformMultiply(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformMultiply(memAddress(dst), memAddress(src));
    }

    // --- [ nvgTransformPremultiply ] ---

    /** {@code void nvgTransformPremultiply(float * dst, float const * src)} */
    public static native void nnvgTransformPremultiply(long dst, long src);

    /** {@code void nvgTransformPremultiply(float * dst, float const * src)} */
    public static void nvgTransformPremultiply(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformPremultiply(memAddress(dst), memAddress(src));
    }

    // --- [ nvgTransformInverse ] ---

    /** {@code int nvgTransformInverse(float * dst, float const * src)} */
    public static native int nnvgTransformInverse(long dst, long src);

    /** {@code int nvgTransformInverse(float * dst, float const * src)} */
    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") FloatBuffer dst, @NativeType("float const *") FloatBuffer src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        return nnvgTransformInverse(memAddress(dst), memAddress(src)) != 0;
    }

    // --- [ nvgTransformPoint ] ---

    /** {@code void nvgTransformPoint(float * dstx, float * dsty, float const * xform, float srcx, float srcy)} */
    public static native void nnvgTransformPoint(long dstx, long dsty, long xform, float srcx, float srcy);

    /** {@code void nvgTransformPoint(float * dstx, float * dsty, float const * xform, float srcx, float srcy)} */
    public static void nvgTransformPoint(@NativeType("float *") FloatBuffer dstx, @NativeType("float *") FloatBuffer dsty, @NativeType("float const *") FloatBuffer xform, float srcx, float srcy) {
        if (CHECKS) {
            check(dstx, 1);
            check(dsty, 1);
            check(xform, 6);
        }
        nnvgTransformPoint(memAddress(dstx), memAddress(dsty), memAddress(xform), srcx, srcy);
    }

    // --- [ nvgDegToRad ] ---

    /** {@code float nvgDegToRad(float deg)} */
    public static native float nvgDegToRad(float deg);

    // --- [ nvgRadToDeg ] ---

    /** {@code float nvgRadToDeg(float rad)} */
    public static native float nvgRadToDeg(float rad);

    // --- [ nvgCreateImage ] ---

    /** {@code int nvgCreateImage(NVGcontext * ctx, char const * filename, int imageFlags)} */
    public static native int nnvgCreateImage(long ctx, long filename, int imageFlags);

    /** {@code int nvgCreateImage(NVGcontext * ctx, char const * filename, int imageFlags)} */
    public static int nvgCreateImage(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer filename, int imageFlags) {
        if (CHECKS) {
            check(ctx);
            checkNT1(filename);
        }
        return nnvgCreateImage(ctx, memAddress(filename), imageFlags);
    }

    /** {@code int nvgCreateImage(NVGcontext * ctx, char const * filename, int imageFlags)} */
    public static int nvgCreateImage(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence filename, int imageFlags) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nnvgCreateImage(ctx, filenameEncoded, imageFlags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateImageMem ] ---

    /** {@code int nvgCreateImageMem(NVGcontext * ctx, int imageFlags, unsigned char * data, int ndata)} */
    public static native int nnvgCreateImageMem(long ctx, int imageFlags, long data, int ndata);

    /** {@code int nvgCreateImageMem(NVGcontext * ctx, int imageFlags, unsigned char * data, int ndata)} */
    public static int nvgCreateImageMem(@NativeType("NVGcontext *") long ctx, int imageFlags, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgCreateImageMem(ctx, imageFlags, memAddress(data), data.remaining());
    }

    // --- [ nvgCreateImageRGBA ] ---

    /** {@code int nvgCreateImageRGBA(NVGcontext * ctx, int w, int h, int imageFlags, unsigned char const * data)} */
    public static native int nnvgCreateImageRGBA(long ctx, int w, int h, int imageFlags, long data);

    /** {@code int nvgCreateImageRGBA(NVGcontext * ctx, int w, int h, int imageFlags, unsigned char const * data)} */
    public static int nvgCreateImageRGBA(@NativeType("NVGcontext *") long ctx, int w, int h, int imageFlags, @NativeType("unsigned char const *") ByteBuffer data) {
        if (CHECKS) {
            check(ctx);
            check(data, w * h * 4);
        }
        return nnvgCreateImageRGBA(ctx, w, h, imageFlags, memAddress(data));
    }

    // --- [ nvgUpdateImage ] ---

    /** {@code void nvgUpdateImage(NVGcontext * ctx, int image, unsigned char const * data)} */
    public static native void nnvgUpdateImage(long ctx, int image, long data);

    /** {@code void nvgUpdateImage(NVGcontext * ctx, int image, unsigned char const * data)} */
    public static void nvgUpdateImage(@NativeType("NVGcontext *") long ctx, int image, @NativeType("unsigned char const *") ByteBuffer data) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgUpdateImage(ctx, image, memAddress(data));
    }

    // --- [ nvgImageSize ] ---

    /** {@code void nvgImageSize(NVGcontext * ctx, int image, int * w, int * h)} */
    public static native void nnvgImageSize(long ctx, int image, long w, long h);

    /** {@code void nvgImageSize(NVGcontext * ctx, int image, int * w, int * h)} */
    public static void nvgImageSize(@NativeType("NVGcontext *") long ctx, int image, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(ctx);
            check(w, 1);
            check(h, 1);
        }
        nnvgImageSize(ctx, image, memAddress(w), memAddress(h));
    }

    // --- [ nvgDeleteImage ] ---

    /** {@code void nvgDeleteImage(NVGcontext * ctx, int image)} */
    public static native void nnvgDeleteImage(long ctx, int image);

    /** {@code void nvgDeleteImage(NVGcontext * ctx, int image)} */
    public static void nvgDeleteImage(@NativeType("NVGcontext *") long ctx, int image) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgDeleteImage(ctx, image);
    }

    // --- [ nvgLinearGradient ] ---

    /** {@code NVGpaint nvgLinearGradient(NVGcontext * ctx, float sx, float sy, float ex, float ey, NVGcolor icol, NVGcolor ocol)} */
    public static native void nnvgLinearGradient(long ctx, float sx, float sy, float ex, float ey, long icol, long ocol, long __result);

    /** {@code NVGpaint nvgLinearGradient(NVGcontext * ctx, float sx, float sy, float ex, float ey, NVGcolor icol, NVGcolor ocol)} */
    @NativeType("NVGpaint")
    public static NVGPaint nvgLinearGradient(@NativeType("NVGcontext *") long ctx, float sx, float sy, float ex, float ey, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLinearGradient(ctx, sx, sy, ex, ey, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    // --- [ nvgBoxGradient ] ---

    /** {@code NVGpaint nvgBoxGradient(NVGcontext * ctx, float x, float y, float w, float h, float r, float f, NVGcolor icol, NVGcolor ocol)} */
    public static native void nnvgBoxGradient(long ctx, float x, float y, float w, float h, float r, float f, long icol, long ocol, long __result);

    /** {@code NVGpaint nvgBoxGradient(NVGcontext * ctx, float x, float y, float w, float h, float r, float f, NVGcolor icol, NVGcolor ocol)} */
    @NativeType("NVGpaint")
    public static NVGPaint nvgBoxGradient(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r, float f, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBoxGradient(ctx, x, y, w, h, r, f, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    // --- [ nvgRadialGradient ] ---

    /** {@code NVGpaint nvgRadialGradient(NVGcontext * ctx, float cx, float cy, float inr, float outr, NVGcolor icol, NVGcolor ocol)} */
    public static native void nnvgRadialGradient(long ctx, float cx, float cy, float inr, float outr, long icol, long ocol, long __result);

    /** {@code NVGpaint nvgRadialGradient(NVGcontext * ctx, float cx, float cy, float inr, float outr, NVGcolor icol, NVGcolor ocol)} */
    @NativeType("NVGpaint")
    public static NVGPaint nvgRadialGradient(@NativeType("NVGcontext *") long ctx, float cx, float cy, float inr, float outr, @NativeType("NVGcolor") NVGColor icol, @NativeType("NVGcolor") NVGColor ocol, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRadialGradient(ctx, cx, cy, inr, outr, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    // --- [ nvgImagePattern ] ---

    /** {@code NVGpaint nvgImagePattern(NVGcontext * ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha)} */
    public static native void nnvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, long __result);

    /** {@code NVGpaint nvgImagePattern(NVGcontext * ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha)} */
    @NativeType("NVGpaint")
    public static NVGPaint nvgImagePattern(@NativeType("NVGcontext *") long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, @NativeType("NVGpaint") NVGPaint __result) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
        return __result;
    }

    // --- [ nvgScissor ] ---

    /** {@code void nvgScissor(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nnvgScissor(long ctx, float x, float y, float w, float h);

    /** {@code void nvgScissor(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void nvgScissor(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgScissor(ctx, x, y, w, h);
    }

    // --- [ nvgIntersectScissor ] ---

    /** {@code void nvgIntersectScissor(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nnvgIntersectScissor(long ctx, float x, float y, float w, float h);

    /** {@code void nvgIntersectScissor(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void nvgIntersectScissor(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgIntersectScissor(ctx, x, y, w, h);
    }

    // --- [ nvgResetScissor ] ---

    /** {@code void nvgResetScissor(NVGcontext * ctx)} */
    public static native void nnvgResetScissor(long ctx);

    /** {@code void nvgResetScissor(NVGcontext * ctx)} */
    public static void nvgResetScissor(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgResetScissor(ctx);
    }

    // --- [ nvgBeginPath ] ---

    /** {@code void nvgBeginPath(NVGcontext * ctx)} */
    public static native void nnvgBeginPath(long ctx);

    /** {@code void nvgBeginPath(NVGcontext * ctx)} */
    public static void nvgBeginPath(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBeginPath(ctx);
    }

    // --- [ nvgMoveTo ] ---

    /** {@code void nvgMoveTo(NVGcontext * ctx, float x, float y)} */
    public static native void nnvgMoveTo(long ctx, float x, float y);

    /** {@code void nvgMoveTo(NVGcontext * ctx, float x, float y)} */
    public static void nvgMoveTo(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgMoveTo(ctx, x, y);
    }

    // --- [ nvgLineTo ] ---

    /** {@code void nvgLineTo(NVGcontext * ctx, float x, float y)} */
    public static native void nnvgLineTo(long ctx, float x, float y);

    /** {@code void nvgLineTo(NVGcontext * ctx, float x, float y)} */
    public static void nvgLineTo(@NativeType("NVGcontext *") long ctx, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgLineTo(ctx, x, y);
    }

    // --- [ nvgBezierTo ] ---

    /** {@code void nvgBezierTo(NVGcontext * ctx, float c1x, float c1y, float c2x, float c2y, float x, float y)} */
    public static native void nnvgBezierTo(long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y);

    /** {@code void nvgBezierTo(NVGcontext * ctx, float c1x, float c1y, float c2x, float c2y, float x, float y)} */
    public static void nvgBezierTo(@NativeType("NVGcontext *") long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
    }

    // --- [ nvgQuadTo ] ---

    /** {@code void nvgQuadTo(NVGcontext * ctx, float cx, float cy, float x, float y)} */
    public static native void nnvgQuadTo(long ctx, float cx, float cy, float x, float y);

    /** {@code void nvgQuadTo(NVGcontext * ctx, float cx, float cy, float x, float y)} */
    public static void nvgQuadTo(@NativeType("NVGcontext *") long ctx, float cx, float cy, float x, float y) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgQuadTo(ctx, cx, cy, x, y);
    }

    // --- [ nvgArcTo ] ---

    /** {@code void nvgArcTo(NVGcontext * ctx, float x1, float y1, float x2, float y2, float radius)} */
    public static native void nnvgArcTo(long ctx, float x1, float y1, float x2, float y2, float radius);

    /** {@code void nvgArcTo(NVGcontext * ctx, float x1, float y1, float x2, float y2, float radius)} */
    public static void nvgArcTo(@NativeType("NVGcontext *") long ctx, float x1, float y1, float x2, float y2, float radius) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgArcTo(ctx, x1, y1, x2, y2, radius);
    }

    // --- [ nvgClosePath ] ---

    /** {@code void nvgClosePath(NVGcontext * ctx)} */
    public static native void nnvgClosePath(long ctx);

    /** {@code void nvgClosePath(NVGcontext * ctx)} */
    public static void nvgClosePath(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgClosePath(ctx);
    }

    // --- [ nvgPathWinding ] ---

    /** {@code void nvgPathWinding(NVGcontext * ctx, int dir)} */
    public static native void nnvgPathWinding(long ctx, int dir);

    /** {@code void nvgPathWinding(NVGcontext * ctx, int dir)} */
    public static void nvgPathWinding(@NativeType("NVGcontext *") long ctx, int dir) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgPathWinding(ctx, dir);
    }

    // --- [ nvgArc ] ---

    /** {@code void nvgArc(NVGcontext * ctx, float cx, float cy, float r, float a0, float a1, int dir)} */
    public static native void nnvgArc(long ctx, float cx, float cy, float r, float a0, float a1, int dir);

    /** {@code void nvgArc(NVGcontext * ctx, float cx, float cy, float r, float a0, float a1, int dir)} */
    public static void nvgArc(@NativeType("NVGcontext *") long ctx, float cx, float cy, float r, float a0, float a1, int dir) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgArc(ctx, cx, cy, r, a0, a1, dir);
    }

    // --- [ nvgRect ] ---

    /** {@code void nvgRect(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nnvgRect(long ctx, float x, float y, float w, float h);

    /** {@code void nvgRect(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void nvgRect(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRect(ctx, x, y, w, h);
    }

    // --- [ nvgRoundedRect ] ---

    /** {@code void nvgRoundedRect(NVGcontext * ctx, float x, float y, float w, float h, float r)} */
    public static native void nnvgRoundedRect(long ctx, float x, float y, float w, float h, float r);

    /** {@code void nvgRoundedRect(NVGcontext * ctx, float x, float y, float w, float h, float r)} */
    public static void nvgRoundedRect(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRoundedRect(ctx, x, y, w, h, r);
    }

    // --- [ nvgRoundedRectVarying ] ---

    /** {@code void nvgRoundedRectVarying(NVGcontext * ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft)} */
    public static native void nnvgRoundedRectVarying(long ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft);

    /** {@code void nvgRoundedRectVarying(NVGcontext * ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft)} */
    public static void nvgRoundedRectVarying(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgRoundedRectVarying(ctx, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
    }

    // --- [ nvgEllipse ] ---

    /** {@code void nvgEllipse(NVGcontext * ctx, float cx, float cy, float rx, float ry)} */
    public static native void nnvgEllipse(long ctx, float cx, float cy, float rx, float ry);

    /** {@code void nvgEllipse(NVGcontext * ctx, float cx, float cy, float rx, float ry)} */
    public static void nvgEllipse(@NativeType("NVGcontext *") long ctx, float cx, float cy, float rx, float ry) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgEllipse(ctx, cx, cy, rx, ry);
    }

    // --- [ nvgCircle ] ---

    /** {@code void nvgCircle(NVGcontext * ctx, float cx, float cy, float r)} */
    public static native void nnvgCircle(long ctx, float cx, float cy, float r);

    /** {@code void nvgCircle(NVGcontext * ctx, float cx, float cy, float r)} */
    public static void nvgCircle(@NativeType("NVGcontext *") long ctx, float cx, float cy, float r) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgCircle(ctx, cx, cy, r);
    }

    // --- [ nvgFill ] ---

    /** {@code void nvgFill(NVGcontext * ctx)} */
    public static native void nnvgFill(long ctx);

    /** {@code void nvgFill(NVGcontext * ctx)} */
    public static void nvgFill(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFill(ctx);
    }

    // --- [ nvgStroke ] ---

    /** {@code void nvgStroke(NVGcontext * ctx)} */
    public static native void nnvgStroke(long ctx);

    /** {@code void nvgStroke(NVGcontext * ctx)} */
    public static void nvgStroke(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgStroke(ctx);
    }

    // --- [ nvgCreateFont ] ---

    /** {@code int nvgCreateFont(NVGcontext * ctx, char const * name, char const * filename)} */
    public static native int nnvgCreateFont(long ctx, long name, long filename);

    /** {@code int nvgCreateFont(NVGcontext * ctx, char const * name, char const * filename)} */
    public static int nvgCreateFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
            checkNT1(filename);
        }
        return nnvgCreateFont(ctx, memAddress(name), memAddress(filename));
    }

    /** {@code int nvgCreateFont(NVGcontext * ctx, char const * name, char const * filename)} */
    public static int nvgCreateFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence filename) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nnvgCreateFont(ctx, nameEncoded, filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateFontAtIndex ] ---

    /** {@code int nvgCreateFontAtIndex(NVGcontext * ctx, char const * name, char const * filename, int fontIndex)} */
    public static native int nnvgCreateFontAtIndex(long ctx, long name, long filename, int fontIndex);

    /** {@code int nvgCreateFontAtIndex(NVGcontext * ctx, char const * name, char const * filename, int fontIndex)} */
    public static int nvgCreateFontAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer filename, int fontIndex) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
            checkNT1(filename);
        }
        return nnvgCreateFontAtIndex(ctx, memAddress(name), memAddress(filename), fontIndex);
    }

    /** {@code int nvgCreateFontAtIndex(NVGcontext * ctx, char const * name, char const * filename, int fontIndex)} */
    public static int nvgCreateFontAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence filename, int fontIndex) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nnvgCreateFontAtIndex(ctx, nameEncoded, filenameEncoded, fontIndex);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateFontMem ] ---

    /** {@code int nvgCreateFontMem(NVGcontext * ctx, char const * name, unsigned char * data, int ndata, int freeData)} */
    public static native int nnvgCreateFontMem(long ctx, long name, long data, int ndata, int freeData);

    /** {@code int nvgCreateFontMem(NVGcontext * ctx, char const * name, unsigned char * data, int ndata, int freeData)} */
    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
        }
        return nnvgCreateFontMem(ctx, memAddress(name), memAddress(data), data.remaining(), freeData ? 1 : 0);
    }

    /** {@code int nvgCreateFontMem(NVGcontext * ctx, char const * name, unsigned char * data, int ndata, int freeData)} */
    public static int nvgCreateFontMem(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnvgCreateFontMem(ctx, nameEncoded, memAddress(data), data.remaining(), freeData ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateFontMemAtIndex ] ---

    /** {@code int nvgCreateFontMemAtIndex(NVGcontext * ctx, char const * name, unsigned char * data, int ndata, int freeData, int fontIndex)} */
    public static native int nnvgCreateFontMemAtIndex(long ctx, long name, long data, int ndata, int freeData, int fontIndex);

    /** {@code int nvgCreateFontMemAtIndex(NVGcontext * ctx, char const * name, unsigned char * data, int ndata, int freeData, int fontIndex)} */
    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData, int fontIndex) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
        }
        return nnvgCreateFontMemAtIndex(ctx, memAddress(name), memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
    }

    /** {@code int nvgCreateFontMemAtIndex(NVGcontext * ctx, char const * name, unsigned char * data, int ndata, int freeData, int fontIndex)} */
    public static int nvgCreateFontMemAtIndex(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name, @NativeType("unsigned char *") ByteBuffer data, @NativeType("int") boolean freeData, int fontIndex) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnvgCreateFontMemAtIndex(ctx, nameEncoded, memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgFindFont ] ---

    /** {@code int nvgFindFont(NVGcontext * ctx, char const * name)} */
    public static native int nnvgFindFont(long ctx, long name);

    /** {@code int nvgFindFont(NVGcontext * ctx, char const * name)} */
    public static int nvgFindFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(ctx);
            checkNT1(name);
        }
        return nnvgFindFont(ctx, memAddress(name));
    }

    /** {@code int nvgFindFont(NVGcontext * ctx, char const * name)} */
    public static int nvgFindFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnvgFindFont(ctx, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgAddFallbackFontId ] ---

    /** {@code int nvgAddFallbackFontId(NVGcontext * ctx, int baseFont, int fallbackFont)} */
    public static native int nnvgAddFallbackFontId(long ctx, int baseFont, int fallbackFont);

    /** {@code int nvgAddFallbackFontId(NVGcontext * ctx, int baseFont, int fallbackFont)} */
    public static int nvgAddFallbackFontId(@NativeType("NVGcontext *") long ctx, int baseFont, int fallbackFont) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgAddFallbackFontId(ctx, baseFont, fallbackFont);
    }

    // --- [ nvgAddFallbackFont ] ---

    /** {@code int nvgAddFallbackFont(NVGcontext * ctx, char const * baseFont, char const * fallbackFont)} */
    public static native int nnvgAddFallbackFont(long ctx, long baseFont, long fallbackFont);

    /** {@code int nvgAddFallbackFont(NVGcontext * ctx, char const * baseFont, char const * fallbackFont)} */
    public static int nvgAddFallbackFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer baseFont, @NativeType("char const *") ByteBuffer fallbackFont) {
        if (CHECKS) {
            check(ctx);
            checkNT1(baseFont);
            checkNT1(fallbackFont);
        }
        return nnvgAddFallbackFont(ctx, memAddress(baseFont), memAddress(fallbackFont));
    }

    /** {@code int nvgAddFallbackFont(NVGcontext * ctx, char const * baseFont, char const * fallbackFont)} */
    public static int nvgAddFallbackFont(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence baseFont, @NativeType("char const *") CharSequence fallbackFont) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            stack.nASCII(fallbackFont, true);
            long fallbackFontEncoded = stack.getPointerAddress();
            return nnvgAddFallbackFont(ctx, baseFontEncoded, fallbackFontEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgResetFallbackFontsId ] ---

    /** {@code void nvgResetFallbackFontsId(NVGcontext * ctx, int baseFont)} */
    public static native void nnvgResetFallbackFontsId(long ctx, int baseFont);

    /** {@code void nvgResetFallbackFontsId(NVGcontext * ctx, int baseFont)} */
    public static void nvgResetFallbackFontsId(@NativeType("NVGcontext *") long ctx, int baseFont) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgResetFallbackFontsId(ctx, baseFont);
    }

    // --- [ nvgResetFallbackFonts ] ---

    /** {@code void nvgResetFallbackFonts(NVGcontext * ctx, char const * baseFont)} */
    public static native void nnvgResetFallbackFonts(long ctx, long baseFont);

    /** {@code void nvgResetFallbackFonts(NVGcontext * ctx, char const * baseFont)} */
    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer baseFont) {
        if (CHECKS) {
            check(ctx);
            checkNT1(baseFont);
        }
        nnvgResetFallbackFonts(ctx, memAddress(baseFont));
    }

    /** {@code void nvgResetFallbackFonts(NVGcontext * ctx, char const * baseFont)} */
    public static void nvgResetFallbackFonts(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence baseFont) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            nnvgResetFallbackFonts(ctx, baseFontEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgFontSize ] ---

    /** {@code void nvgFontSize(NVGcontext * ctx, float size)} */
    public static native void nnvgFontSize(long ctx, float size);

    /** {@code void nvgFontSize(NVGcontext * ctx, float size)} */
    public static void nvgFontSize(@NativeType("NVGcontext *") long ctx, float size) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFontSize(ctx, size);
    }

    // --- [ nvgFontBlur ] ---

    /** {@code void nvgFontBlur(NVGcontext * ctx, float blur)} */
    public static native void nnvgFontBlur(long ctx, float blur);

    /** {@code void nvgFontBlur(NVGcontext * ctx, float blur)} */
    public static void nvgFontBlur(@NativeType("NVGcontext *") long ctx, float blur) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFontBlur(ctx, blur);
    }

    // --- [ nvgTextLetterSpacing ] ---

    /** {@code void nvgTextLetterSpacing(NVGcontext * ctx, float spacing)} */
    public static native void nnvgTextLetterSpacing(long ctx, float spacing);

    /** {@code void nvgTextLetterSpacing(NVGcontext * ctx, float spacing)} */
    public static void nvgTextLetterSpacing(@NativeType("NVGcontext *") long ctx, float spacing) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextLetterSpacing(ctx, spacing);
    }

    // --- [ nvgTextLineHeight ] ---

    /** {@code void nvgTextLineHeight(NVGcontext * ctx, float lineHeight)} */
    public static native void nnvgTextLineHeight(long ctx, float lineHeight);

    /** {@code void nvgTextLineHeight(NVGcontext * ctx, float lineHeight)} */
    public static void nvgTextLineHeight(@NativeType("NVGcontext *") long ctx, float lineHeight) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextLineHeight(ctx, lineHeight);
    }

    // --- [ nvgTextAlign ] ---

    /** {@code void nvgTextAlign(NVGcontext * ctx, int align)} */
    public static native void nnvgTextAlign(long ctx, int align);

    /** {@code void nvgTextAlign(NVGcontext * ctx, int align)} */
    public static void nvgTextAlign(@NativeType("NVGcontext *") long ctx, int align) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextAlign(ctx, align);
    }

    // --- [ nvgFontFaceId ] ---

    /** {@code void nvgFontFaceId(NVGcontext * ctx, int font)} */
    public static native void nnvgFontFaceId(long ctx, int font);

    /** {@code void nvgFontFaceId(NVGcontext * ctx, int font)} */
    public static void nvgFontFaceId(@NativeType("NVGcontext *") long ctx, int font) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgFontFaceId(ctx, font);
    }

    // --- [ nvgFontFace ] ---

    /** {@code void nvgFontFace(NVGcontext * ctx, char const * font)} */
    public static native void nnvgFontFace(long ctx, long font);

    /** {@code void nvgFontFace(NVGcontext * ctx, char const * font)} */
    public static void nvgFontFace(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer font) {
        if (CHECKS) {
            check(ctx);
            checkNT1(font);
        }
        nnvgFontFace(ctx, memAddress(font));
    }

    /** {@code void nvgFontFace(NVGcontext * ctx, char const * font)} */
    public static void nvgFontFace(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence font) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(font, true);
            long fontEncoded = stack.getPointerAddress();
            nnvgFontFace(ctx, fontEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgText ] ---

    /** {@code float nvgText(NVGcontext * ctx, float x, float y, char const * string, char const * end)} */
    public static native float nnvgText(long ctx, float x, float y, long string, long end);

    /** {@code float nvgText(NVGcontext * ctx, float x, float y, char const * string, char const * end)} */
    public static float nvgText(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgText(ctx, x, y, memAddress(string), memAddress(string) + string.remaining());
    }

    /** {@code float nvgText(NVGcontext * ctx, float x, float y, char const * string, char const * end)} */
    public static float nvgText(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgText(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextBox ] ---

    /** {@code void nvgTextBox(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end)} */
    public static native void nnvgTextBox(long ctx, float x, float y, float breakRowWidth, long string, long end);

    /** {@code void nvgTextBox(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end)} */
    public static void nvgTextBox(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgTextBox(ctx, x, y, breakRowWidth, memAddress(string), memAddress(string) + string.remaining());
    }

    /** {@code void nvgTextBox(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end)} */
    public static void nvgTextBox(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBox(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextBounds ] ---

    /** {@code float nvgTextBounds(NVGcontext * ctx, float x, float y, char const * string, char const * end, float * bounds)} */
    public static native float nnvgTextBounds(long ctx, float x, float y, long string, long end, long bounds);

    /** {@code float nvgTextBounds(NVGcontext * ctx, float x, float y, char const * string, char const * end, float * bounds)} */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("float *") @Nullable FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        return nnvgTextBounds(ctx, x, y, memAddress(string), memAddress(string) + string.remaining(), memAddressSafe(bounds));
    }

    /** {@code float nvgTextBounds(NVGcontext * ctx, float x, float y, char const * string, char const * end, float * bounds)} */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("float *") @Nullable FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, memAddressSafe(bounds));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextBoxBounds ] ---

    /** {@code void nvgTextBoxBounds(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end, float * bounds)} */
    public static native void nnvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, long string, long end, long bounds);

    /** {@code void nvgTextBoxBounds(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end, float * bounds)} */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string, @NativeType("float *") @Nullable FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), memAddress(string) + string.remaining(), memAddressSafe(bounds));
    }

    /** {@code void nvgTextBoxBounds(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end, float * bounds)} */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string, @NativeType("float *") @Nullable FloatBuffer bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength, memAddressSafe(bounds));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextGlyphPositions ] ---

    /** {@code int nvgTextGlyphPositions(NVGcontext * ctx, float x, float y, char const * string, char const * end, NVGglyphPosition * positions, int maxPositions)} */
    public static native int nnvgTextGlyphPositions(long ctx, float x, float y, long string, long end, long positions, int maxPositions);

    /** {@code int nvgTextGlyphPositions(NVGcontext * ctx, float x, float y, char const * string, char const * end, NVGglyphPosition * positions, int maxPositions)} */
    public static int nvgTextGlyphPositions(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgTextGlyphPositions(ctx, x, y, memAddress(string), memAddress(string) + string.remaining(), positions.address(), positions.remaining());
    }

    /** {@code int nvgTextGlyphPositions(NVGcontext * ctx, float x, float y, char const * string, char const * end, NVGglyphPosition * positions, int maxPositions)} */
    public static int nvgTextGlyphPositions(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextGlyphPositions(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, positions.address(), positions.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgTextMetrics ] ---

    /** {@code void nvgTextMetrics(NVGcontext * ctx, float * ascender, float * descender, float * lineh)} */
    public static native void nnvgTextMetrics(long ctx, long ascender, long descender, long lineh);

    /** {@code void nvgTextMetrics(NVGcontext * ctx, float * ascender, float * descender, float * lineh)} */
    public static void nvgTextMetrics(@NativeType("NVGcontext *") long ctx, @NativeType("float *") @Nullable FloatBuffer ascender, @NativeType("float *") @Nullable FloatBuffer descender, @NativeType("float *") @Nullable FloatBuffer lineh) {
        if (CHECKS) {
            check(ctx);
            checkSafe(ascender, 1);
            checkSafe(descender, 1);
            checkSafe(lineh, 1);
        }
        nnvgTextMetrics(ctx, memAddressSafe(ascender), memAddressSafe(descender), memAddressSafe(lineh));
    }

    // --- [ nvgTextBreakLines ] ---

    /** {@code int nvgTextBreakLines(NVGcontext * ctx, char const * string, char const * end, float breakRowWidth, NVGtextRow * rows, int maxRows)} */
    public static native int nnvgTextBreakLines(long ctx, long string, long end, float breakRowWidth, long rows, int maxRows);

    /** {@code int nvgTextBreakLines(NVGcontext * ctx, char const * string, char const * end, float breakRowWidth, NVGtextRow * rows, int maxRows)} */
    public static int nvgTextBreakLines(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") ByteBuffer string, float breakRowWidth, @NativeType("NVGtextRow *") NVGTextRow.Buffer rows) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvgTextBreakLines(ctx, memAddress(string), memAddress(string) + string.remaining(), breakRowWidth, rows.address(), rows.remaining());
    }

    /** {@code int nvgTextBreakLines(NVGcontext * ctx, char const * string, char const * end, float breakRowWidth, NVGtextRow * rows, int maxRows)} */
    public static int nvgTextBreakLines(@NativeType("NVGcontext *") long ctx, @NativeType("char const *") CharSequence string, float breakRowWidth, @NativeType("NVGtextRow *") NVGTextRow.Buffer rows) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextBreakLines(ctx, stringEncoded, stringEncoded + stringEncodedLength, breakRowWidth, rows.address(), rows.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nvgCreateInternal ] ---

    @NativeType("void *")
    private static native long nvgCreateInternal();

    /** {@code void * nvgCreateInternal(void)} */
    static final long nvgCreateInternal = nvgCreateInternal();

    // --- [ nvgInternalParams ] ---

    @NativeType("void *")
    private static native long nvgInternalParams();

    /** {@code void * nvgInternalParams(void)} */
    static final long nvgInternalParams = nvgInternalParams();

    // --- [ nvgDeleteInternal ] ---

    @NativeType("void *")
    private static native long nvgDeleteInternal();

    /** {@code void * nvgDeleteInternal(void)} */
    static final long nvgDeleteInternal = nvgDeleteInternal();

    /** {@code void nvgCurrentTransform(NVGcontext * ctx, float * xform)} */
    public static native void nnvgCurrentTransform(long ctx, float[] xform);

    /** {@code void nvgCurrentTransform(NVGcontext * ctx, float * xform)} */
    public static void nvgCurrentTransform(@NativeType("NVGcontext *") long ctx, @NativeType("float *") float[] xform) {
        if (CHECKS) {
            check(ctx);
            check(xform, 6);
        }
        nnvgCurrentTransform(ctx, xform);
    }

    /** {@code void nvgTransformIdentity(float * dst)} */
    public static native void nnvgTransformIdentity(float[] dst);

    /** {@code void nvgTransformIdentity(float * dst)} */
    public static void nvgTransformIdentity(@NativeType("float *") float[] dst) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformIdentity(dst);
    }

    /** {@code void nvgTransformTranslate(float * dst, float tx, float ty)} */
    public static native void nnvgTransformTranslate(float[] dst, float tx, float ty);

    /** {@code void nvgTransformTranslate(float * dst, float tx, float ty)} */
    public static void nvgTransformTranslate(@NativeType("float *") float[] dst, float tx, float ty) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformTranslate(dst, tx, ty);
    }

    /** {@code void nvgTransformScale(float * dst, float sx, float sy)} */
    public static native void nnvgTransformScale(float[] dst, float sx, float sy);

    /** {@code void nvgTransformScale(float * dst, float sx, float sy)} */
    public static void nvgTransformScale(@NativeType("float *") float[] dst, float sx, float sy) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformScale(dst, sx, sy);
    }

    /** {@code void nvgTransformRotate(float * dst, float a)} */
    public static native void nnvgTransformRotate(float[] dst, float a);

    /** {@code void nvgTransformRotate(float * dst, float a)} */
    public static void nvgTransformRotate(@NativeType("float *") float[] dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformRotate(dst, a);
    }

    /** {@code void nvgTransformSkewX(float * dst, float a)} */
    public static native void nnvgTransformSkewX(float[] dst, float a);

    /** {@code void nvgTransformSkewX(float * dst, float a)} */
    public static void nvgTransformSkewX(@NativeType("float *") float[] dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewX(dst, a);
    }

    /** {@code void nvgTransformSkewY(float * dst, float a)} */
    public static native void nnvgTransformSkewY(float[] dst, float a);

    /** {@code void nvgTransformSkewY(float * dst, float a)} */
    public static void nvgTransformSkewY(@NativeType("float *") float[] dst, float a) {
        if (CHECKS) {
            check(dst, 6);
        }
        nnvgTransformSkewY(dst, a);
    }

    /** {@code void nvgTransformMultiply(float * dst, float const * src)} */
    public static native void nnvgTransformMultiply(float[] dst, float[] src);

    /** {@code void nvgTransformMultiply(float * dst, float const * src)} */
    public static void nvgTransformMultiply(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformMultiply(dst, src);
    }

    /** {@code void nvgTransformPremultiply(float * dst, float const * src)} */
    public static native void nnvgTransformPremultiply(float[] dst, float[] src);

    /** {@code void nvgTransformPremultiply(float * dst, float const * src)} */
    public static void nvgTransformPremultiply(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        nnvgTransformPremultiply(dst, src);
    }

    /** {@code int nvgTransformInverse(float * dst, float const * src)} */
    public static native int nnvgTransformInverse(float[] dst, float[] src);

    /** {@code int nvgTransformInverse(float * dst, float const * src)} */
    @NativeType("int")
    public static boolean nvgTransformInverse(@NativeType("float *") float[] dst, @NativeType("float const *") float[] src) {
        if (CHECKS) {
            check(dst, 6);
            check(src, 6);
        }
        return nnvgTransformInverse(dst, src) != 0;
    }

    /** {@code void nvgTransformPoint(float * dstx, float * dsty, float const * xform, float srcx, float srcy)} */
    public static native void nnvgTransformPoint(float[] dstx, float[] dsty, float[] xform, float srcx, float srcy);

    /** {@code void nvgTransformPoint(float * dstx, float * dsty, float const * xform, float srcx, float srcy)} */
    public static void nvgTransformPoint(@NativeType("float *") float[] dstx, @NativeType("float *") float[] dsty, @NativeType("float const *") float[] xform, float srcx, float srcy) {
        if (CHECKS) {
            check(dstx, 1);
            check(dsty, 1);
            check(xform, 6);
        }
        nnvgTransformPoint(dstx, dsty, xform, srcx, srcy);
    }

    /** {@code void nvgImageSize(NVGcontext * ctx, int image, int * w, int * h)} */
    public static native void nnvgImageSize(long ctx, int image, int[] w, int[] h);

    /** {@code void nvgImageSize(NVGcontext * ctx, int image, int * w, int * h)} */
    public static void nvgImageSize(@NativeType("NVGcontext *") long ctx, int image, @NativeType("int *") int[] w, @NativeType("int *") int[] h) {
        if (CHECKS) {
            check(ctx);
            check(w, 1);
            check(h, 1);
        }
        nnvgImageSize(ctx, image, w, h);
    }

    /** {@code float nvgTextBounds(NVGcontext * ctx, float x, float y, char const * string, char const * end, float * bounds)} */
    public static native float nnvgTextBounds(long ctx, float x, float y, long string, long end, float[] bounds);

    /** {@code float nvgTextBounds(NVGcontext * ctx, float x, float y, char const * string, char const * end, float * bounds)} */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") ByteBuffer string, @NativeType("float *") float @Nullable [] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        return nnvgTextBounds(ctx, x, y, memAddress(string), memAddress(string) + string.remaining(), bounds);
    }

    /** {@code float nvgTextBounds(NVGcontext * ctx, float x, float y, char const * string, char const * end, float * bounds)} */
    public static float nvgTextBounds(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("char const *") CharSequence string, @NativeType("float *") float @Nullable [] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            return nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + stringEncodedLength, bounds);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void nvgTextBoxBounds(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end, float * bounds)} */
    public static native void nnvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, long string, long end, float[] bounds);

    /** {@code void nvgTextBoxBounds(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end, float * bounds)} */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") ByteBuffer string, @NativeType("float *") float @Nullable [] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), memAddress(string) + string.remaining(), bounds);
    }

    /** {@code void nvgTextBoxBounds(NVGcontext * ctx, float x, float y, float breakRowWidth, char const * string, char const * end, float * bounds)} */
    public static void nvgTextBoxBounds(@NativeType("NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType("char const *") CharSequence string, @NativeType("float *") float @Nullable [] bounds) {
        if (CHECKS) {
            check(ctx);
            checkSafe(bounds, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + stringEncodedLength, bounds);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void nvgTextMetrics(NVGcontext * ctx, float * ascender, float * descender, float * lineh)} */
    public static native void nnvgTextMetrics(long ctx, float[] ascender, float[] descender, float[] lineh);

    /** {@code void nvgTextMetrics(NVGcontext * ctx, float * ascender, float * descender, float * lineh)} */
    public static void nvgTextMetrics(@NativeType("NVGcontext *") long ctx, @NativeType("float *") float @Nullable [] ascender, @NativeType("float *") float @Nullable [] descender, @NativeType("float *") float @Nullable [] lineh) {
        if (CHECKS) {
            check(ctx);
            checkSafe(ascender, 1);
            checkSafe(descender, 1);
            checkSafe(lineh, 1);
        }
        nnvgTextMetrics(ctx, ascender, descender, lineh);
    }

}