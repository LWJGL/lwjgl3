/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Implementation of the NanoVG API using OpenGL ES 2.0. */
public class NanoVGGLES2 {

    static { LibNanoVG.initialize(); }

    /**
     * Create flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_ANTIALIAS ANTIALIAS} - Flag indicating if geometry based anti-aliasing is used (may not be needed when using MSAA).</li>
     * <li>{@link #NVG_STENCIL_STROKES STENCIL_STROKES} - 
     * Flag indicating if strokes should be drawn using stencil buffer. The rendering will be a little slower, but path overlaps (i.e. self-intersecting
     * or sharp turns) will be drawn just once.
     * </li>
     * <li>{@link #NVG_DEBUG DEBUG} - Flag indicating that additional debug checks are done.</li>
     * </ul>
     */
    public static final int
        NVG_ANTIALIAS       = 1<<0,
        NVG_STENCIL_STROKES = 1<<1,
        NVG_DEBUG           = 1<<2;

    /**
     * These are additional flags on top of NVGimageFlags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NVG_IMAGE_NODELETE IMAGE_NODELETE} - Do not delete GL texture handle.</li>
     * </ul>
     */
    public static final int NVG_IMAGE_NODELETE = 1<<16;

    protected NanoVGGLES2() {
        throw new UnsupportedOperationException();
    }

    // --- [ nvglCreateImageFromHandle ] ---

    /** Unsafe version of: {@link #nvglCreateImageFromHandle lCreateImageFromHandle} */
    public static native int nnvglCreateImageFromHandle(long ctx, int textureId, int w, int h, int flags);

    /**
     * Creates a NanoVG image from an OpenGL texture.
     *
     * @param ctx       the NanoVG context
     * @param textureId the OpenGL texture id
     * @param w         the image width
     * @param h         the image height
     * @param flags     the image flags
     *
     * @return a handle to the image
     */
    public static int nvglCreateImageFromHandle(@NativeType("NVGcontext *") long ctx, @NativeType("GLuint") int textureId, int w, int h, int flags) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvglCreateImageFromHandle(ctx, textureId, w, h, flags);
    }

    // --- [ nvglImageHandle ] ---

    /** Unsafe version of: {@link #nvglImageHandle lImageHandle} */
    public static native int nnvglImageHandle(long ctx, int image);

    /**
     * Returns the OpenGL texture id associated with a NanoVG image.
     *
     * @param ctx   the NanoVG context
     * @param image the image handle
     */
    @NativeType("GLuint")
    public static int nvglImageHandle(@NativeType("NVGcontext *") long ctx, int image) {
        if (CHECKS) {
            check(ctx);
        }
        return nnvglImageHandle(ctx, image);
    }

    // --- [ nvgCreate ] ---

    /** Unsafe version of: {@link #nvgCreate Create} */
    public static native long nnvgCreate(int flags);

    /**
     * Creates a NanoVG context with an OpenGL ES 2.0 rendering back-end.
     * 
     * <p>An OpenGL ES 2.0+ context must be current in the current thread when this function is called and the returned NanoVG context may only be used in
     * the thread in which that OpenGL context is current.</p>
     *
     * @param flags the context flags. One of:<br><table><tr><td>{@link #NVG_ANTIALIAS ANTIALIAS}</td><td>{@link #NVG_STENCIL_STROKES STENCIL_STROKES}</td><td>{@link #NVG_DEBUG DEBUG}</td></tr></table>
     */
    @NativeType("NVGcontext *")
    public static long nvgCreate(int flags) {
        return nnvgCreate(flags);
    }

    // --- [ nvgDelete ] ---

    /** Unsafe version of: {@link #nvgDelete Delete} */
    public static native void nnvgDelete(long ctx);

    /**
     * Deletes a NanoVG context created with {@link #nvgCreate Create}.
     *
     * @param ctx the NanoVG context
     */
    public static void nvgDelete(@NativeType("NVGcontext *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgDelete(ctx);
    }

    // --- [ nvgluCreateFramebuffer ] ---

    /** Unsafe version of: {@link #nvgluCreateFramebuffer luCreateFramebuffer} */
    public static native long nnvgluCreateFramebuffer(long ctx, int w, int h, int imageFlags);

    /**
     * Creates a framebuffer object to render to.
     *
     * @param ctx        the NanoVG context
     * @param w          the framebuffer width
     * @param h          the framebuffer height
     * @param imageFlags the image flags
     */
    @Nullable
    @NativeType("NVGLUframebuffer *")
    public static NVGLUFramebuffer nvgluCreateFramebuffer(@NativeType("NVGcontext *") long ctx, int w, int h, int imageFlags) {
        if (CHECKS) {
            check(ctx);
        }
        long __result = nnvgluCreateFramebuffer(ctx, w, h, imageFlags);
        return NVGLUFramebuffer.createSafe(__result);
    }

    // --- [ nvgluBindFramebuffer ] ---

    /** Unsafe version of: {@link #nvgluBindFramebuffer luBindFramebuffer} */
    public static native void nnvgluBindFramebuffer(long ctx, long fb);

    /**
     * Binds the framebuffer object associated with the specified {@link NVGLUFramebuffer}.
     *
     * @param ctx the NanoVG context
     * @param fb  the framebuffer to bind
     */
    public static void nvgluBindFramebuffer(@NativeType("NVGcontext *") long ctx, @Nullable @NativeType("NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgluBindFramebuffer(ctx, memAddressSafe(fb));
    }

    // --- [ nvgluDeleteFramebuffer ] ---

    /** Unsafe version of: {@link #nvgluDeleteFramebuffer luDeleteFramebuffer} */
    public static native void nnvgluDeleteFramebuffer(long ctx, long fb);

    /**
     * Deletes an {@link NVGLUFramebuffer}.
     *
     * @param ctx the NanoVG context
     * @param fb  the framebuffer to delete
     */
    public static void nvgluDeleteFramebuffer(@NativeType("NVGcontext *") long ctx, @NativeType("NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (CHECKS) {
            check(ctx);
        }
        nnvgluDeleteFramebuffer(ctx, fb.address());
    }

}