/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_blit.txt">EXT_framebuffer_blit</a> extension.
 * 
 * <p>This extension modifies EXT_framebuffer_object by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows
 * copying directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some
 * data conversion where allowed.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class EXTFramebufferBlit {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
     * and GetFramebufferAttachmentParameterivEXT.
     */
    public static final int
        GL_READ_FRAMEBUFFER_EXT = 0x8CA8,
        GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;

    protected EXTFramebufferBlit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlitFramebufferEXT ] ---

    public static native void glBlitFramebufferEXT(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

}