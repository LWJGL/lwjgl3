/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTTextureBuffer {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_BUFFER_EXT = 0x8C2A;

    public static final int
        GL_TEXTURE_BUFFER_BINDING_EXT          = 0x8C2A,
        GL_MAX_TEXTURE_BUFFER_SIZE_EXT         = 0x8C2B,
        GL_TEXTURE_BINDING_BUFFER_EXT          = 0x8C2C,
        GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT_EXT = 0x919F;

    public static final int
        GL_SAMPLER_BUFFER_EXT              = 0x8DC2,
        GL_INT_SAMPLER_BUFFER_EXT          = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 0x8DD8,
        GL_IMAGE_BUFFER_EXT                = 0x9051,
        GL_INT_IMAGE_BUFFER_EXT            = 0x905C,
        GL_UNSIGNED_INT_IMAGE_BUFFER_EXT   = 0x9067;

    public static final int
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 0x8C2D,
        GL_TEXTURE_BUFFER_OFFSET_EXT             = 0x919D,
        GL_TEXTURE_BUFFER_SIZE_EXT               = 0x919E;

    protected EXTTextureBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferEXT ] ---

    /** {@code void glTexBufferEXT(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTexBufferEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTexBufferRangeEXT ] ---

    /** {@code void glTexBufferRangeEXT(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTexBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

}