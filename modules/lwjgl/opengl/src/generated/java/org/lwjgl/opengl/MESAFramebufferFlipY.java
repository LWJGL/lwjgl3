/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/MESA/MESA_framebuffer_flip_y.txt">MESA_framebuffer_flip_y</a> extension.
 * 
 * <p>This extension defines a new framebuffer parameter, {@link #GL_FRAMEBUFFER_FLIP_Y_MESA FRAMEBUFFER_FLIP_Y_MESA}, that changes the behavior of the reads and writes to the framebuffer
 * attachment points. When {@code GL_FRAMEBUFFER_FLIP_Y_MESA} is {@link GL11#GL_TRUE TRUE}, render commands and pixel transfer operations access the backing store of each
 * attachment point with an y-inverted coordinate system. This y-inversion is relative to the coordinate system set when
 * {@code GL_FRAMEBUFFER_FLIP_Y_MESA} is {@link GL11#GL_FALSE FALSE}.</p>
 * 
 * <p>Access through {@link GL11C#glTexSubImage2D TexSubImage2D} and similar calls will notice the effect of the flip when they are not attached to framebuffer objects because
 * {@code GL_FRAMEBUFFER_FLIP_Y_MESA} is associated with the framebuffer object and not the attachment points.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3} or {@link ARBFramebufferNoAttachments ARB_framebuffer_no_attachments}.</p>
 */
public class MESAFramebufferFlipY {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} argument of {@link #glFramebufferParameteriMESA FramebufferParameteriMESA} and {@link #glGetFramebufferParameterivMESA GetFramebufferParameterivMESA}. */
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;

    protected MESAFramebufferFlipY() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferParameteriMESA ] ---

    public static native void glFramebufferParameteriMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetFramebufferParameterivMESA ] ---

    public static native void nglGetFramebufferParameterivMESA(int target, int pname, long params);

    public static void glGetFramebufferParameterivMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferParameterivMESA(target, pname, memAddress(params));
    }

    /** Array version of: {@link #glGetFramebufferParameterivMESA GetFramebufferParameterivMESA} */
    public static void glGetFramebufferParameterivMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferParameterivMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}