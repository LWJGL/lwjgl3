/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTTextureBufferObject {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_BUFFER_EXT = 0x8C2A;

    public static final int
        GL_MAX_TEXTURE_BUFFER_SIZE_EXT           = 0x8C2B,
        GL_TEXTURE_BINDING_BUFFER_EXT            = 0x8C2C,
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 0x8C2D,
        GL_TEXTURE_BUFFER_FORMAT_EXT             = 0x8C2E;

    protected EXTTextureBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferEXT ] ---

    /** {@code void glTexBufferEXT(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTexBufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

}