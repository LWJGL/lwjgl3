/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_framebuffer_blit.txt">NV_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies OpenGL ES 2.0 by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows copying
 * directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some data
 * conversion where allowed.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class NVFramebufferBlit {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferRenderbuffer, and
     * GetFramebufferAttachmentParameteriv.
     */
    public static final int
        GL_READ_FRAMEBUFFER_NV = 0x8CA8,
        GL_DRAW_FRAMEBUFFER_NV = 0x8CA9;

    /** Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv. */
    public static final int
        GL_DRAW_FRAMEBUFFER_BINDING_NV = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING_NV = 0x8CAA;

    protected NVFramebufferBlit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlitFramebufferNV ] ---

    public static native void glBlitFramebufferNV(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

}