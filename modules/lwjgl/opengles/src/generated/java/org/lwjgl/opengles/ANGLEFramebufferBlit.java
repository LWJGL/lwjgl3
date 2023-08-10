/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ANGLE/ANGLE_framebuffer_blit.txt">ANGLE_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies framebuffer objects by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows copying
 * directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some data
 * conversion where allowed.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class ANGLEFramebufferBlit {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferTexture3DOES,
     * FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.
     */
    public static final int
        GL_READ_FRAMEBUFFER_ANGLE = 0x8CA8,
        GL_DRAW_FRAMEBUFFER_ANGLE = 0x8CA9;

    /** Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv. */
    public static final int
        GL_DRAW_FRAMEBUFFER_BINDING_ANGLE = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING_ANGLE = 0x8CAA;

    protected ANGLEFramebufferBlit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlitFramebufferANGLE ] ---

    public static native void glBlitFramebufferANGLE(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

}