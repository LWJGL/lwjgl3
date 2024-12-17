/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBTextureBufferObject {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;

    public static final int
        GL_MAX_TEXTURE_BUFFER_SIZE_ARB           = 0x8C2B,
        GL_TEXTURE_BINDING_BUFFER_ARB            = 0x8C2C,
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D,
        GL_TEXTURE_BUFFER_FORMAT_ARB             = 0x8C2E;

    protected ARBTextureBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferARB ] ---

    /** {@code void glTexBufferARB(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTexBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

}