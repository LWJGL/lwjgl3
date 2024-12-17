/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NanoVGGLES2 {

    static { LibNanoVG.initialize(); }

    public static final int
        NVG_ANTIALIAS       = 1<<0,
        NVG_STENCIL_STROKES = 1<<1,
        NVG_DEBUG           = 1<<2;

    public static final int NVG_IMAGE_NODELETE = 1<<16;

    protected NanoVGGLES2() {
        throw new UnsupportedOperationException();
    }

    // --- [ nvglCreateImageFromHandle ] ---

    /** {@code int nvglCreateImageFromHandle(NVGcontext * ctx, GLuint textureId, int w, int h, int flags)} */
    public static native int nnvglCreateImageFromHandle(long ctx, int textureId, int w, int h, int flags);

    /** {@code int nvglCreateImageFromHandle(NVGcontext * ctx, GLuint textureId, int w, int h, int flags)} */
    public static int nvglCreateImageFromHandle(@NativeType("NVGcontext *") long ctx, @NativeType("GLuint") int textureId, int w, int h, int flags) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvglCreateImageFromHandle(ctx, textureId, w, h, flags);
    }

    // --- [ nvglImageHandle ] ---

    /** {@code GLuint nvglImageHandle(NVGcontext * ctx, int image)} */
    public static native int nnvglImageHandle(long ctx, int image);

    /** {@code GLuint nvglImageHandle(NVGcontext * ctx, int image)} */
    @NativeType("GLuint")
    public static int nvglImageHandle(@NativeType("NVGcontext *") long ctx, int image) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvglImageHandle(ctx, image);
    }

    // --- [ nvgCreate ] ---

    /** {@code NVGcontext * nvgCreate(int flags)} */
    public static native long nnvgCreate(int flags);

    /** {@code NVGcontext * nvgCreate(int flags)} */
    @NativeType("NVGcontext *")
    public static long nvgCreate(int flags) {
        return nnvgCreate(flags);
    }

    // --- [ nvgDelete ] ---

    /** {@code void nvgDelete(NVGcontext * ctx)} */
    public static native void nnvgDelete(long ctx);

    /** {@code void nvgDelete(NVGcontext * ctx)} */
    public static void nvgDelete(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgDelete(ctx);
    }

    // --- [ nvgluCreateFramebuffer ] ---

    /** {@code NVGLUframebuffer * nvgluCreateFramebuffer(NVGcontext * ctx, int w, int h, int imageFlags)} */
    public static native long nnvgluCreateFramebuffer(long ctx, int w, int h, int imageFlags);

    /** {@code NVGLUframebuffer * nvgluCreateFramebuffer(NVGcontext * ctx, int w, int h, int imageFlags)} */
    @NativeType("NVGLUframebuffer *")
    public static @Nullable NVGLUFramebuffer nvgluCreateFramebuffer(@NativeType("NVGcontext *") long ctx, int w, int h, int imageFlags) {
        if (CHECKS) {
            check(ctx);
        }
        long __result = nnvgluCreateFramebuffer(ctx, w, h, imageFlags);
        return NVGLUFramebuffer.createSafe(__result);
    }

    // --- [ nvgluBindFramebuffer ] ---

    /** {@code void nvgluBindFramebuffer(NVGcontext * ctx, NVGLUframebuffer * fb)} */
    public static native void nnvgluBindFramebuffer(long ctx, long fb);

    /** {@code void nvgluBindFramebuffer(NVGcontext * ctx, NVGLUframebuffer * fb)} */
    public static void nvgluBindFramebuffer(@NativeType("NVGcontext *") long ctx, @NativeType("NVGLUframebuffer *") @Nullable NVGLUFramebuffer fb) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgluBindFramebuffer(ctx, memAddressSafe(fb));
    }

    // --- [ nvgluDeleteFramebuffer ] ---

    /** {@code void nvgluDeleteFramebuffer(NVGcontext * ctx, NVGLUframebuffer * fb)} */
    public static native void nnvgluDeleteFramebuffer(long ctx, long fb);

    /** {@code void nvgluDeleteFramebuffer(NVGcontext * ctx, NVGLUframebuffer * fb)} */
    public static void nvgluDeleteFramebuffer(@NativeType("NVGcontext *") long ctx, @NativeType("NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgluDeleteFramebuffer(ctx, fb.address());
    }

}