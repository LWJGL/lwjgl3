/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class ANGLEFramebufferMultisample {

    static { GLES.initialize(); }

    public static final int GL_RENDERBUFFER_SAMPLES_ANGLE = 0x8CAB;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE = 0x8D56;

    public static final int GL_MAX_SAMPLES_ANGLE = 0x8D57;

    protected ANGLEFramebufferMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderbufferStorageMultisampleANGLE ] ---

    /** {@code void glRenderbufferStorageMultisampleANGLE(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisampleANGLE(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

}