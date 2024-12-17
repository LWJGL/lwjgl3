/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class APPLEFramebufferMultisample {

    static { GLES.initialize(); }

    public static final int GL_RENDERBUFFER_SAMPLES_APPLE = 0x8CAB;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE = 0x8D56;

    public static final int GL_MAX_SAMPLES_APPLE = 0x8D57;

    public static final int
        GL_READ_FRAMEBUFFER_APPLE = 0x8CA8,
        GL_DRAW_FRAMEBUFFER_APPLE = 0x8CA9;

    public static final int
        GL_DRAW_FRAMEBUFFER_BINDING_APPLE = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING_APPLE = 0x8CAA;

    protected APPLEFramebufferMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleAPPLE ] ---

    /** {@code void glRenderbufferStorageMultisampleAPPLE(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisampleAPPLE(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glResolveMultisampleFramebufferAPPLE ] ---

    /** {@code void glResolveMultisampleFramebufferAPPLE(void)} */
    public static native void glResolveMultisampleFramebufferAPPLE();

}