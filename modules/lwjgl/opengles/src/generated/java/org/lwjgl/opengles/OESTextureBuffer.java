/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OESTextureBuffer {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_BUFFER_OES = 0x8C2A;

    public static final int GL_TEXTURE_BUFFER_BINDING_OES = 0x8C2A;

    public static final int
        GL_SAMPLER_BUFFER_OES              = 0x8DC2,
        GL_INT_SAMPLER_BUFFER_OES          = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_OES = 0x8DD8,
        GL_IMAGE_BUFFER_OES                = 0x9051,
        GL_INT_IMAGE_BUFFER_OES            = 0x905C,
        GL_UNSIGNED_INT_IMAGE_BUFFER_OES   = 0x9067;

    public static final int
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING_OES = 0x8C2D,
        GL_TEXTURE_BUFFER_OFFSET_OES             = 0x919D,
        GL_TEXTURE_BUFFER_SIZE_OES               = 0x919E;

    protected OESTextureBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferOES ] ---

    /** {@code void glTexBufferOES(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTexBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTexBufferRangeOES ] ---

    /** {@code void glTexBufferRangeOES(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTexBufferRangeOES(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

}