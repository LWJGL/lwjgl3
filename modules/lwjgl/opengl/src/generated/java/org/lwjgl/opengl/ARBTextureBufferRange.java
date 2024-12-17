/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBTextureBufferRange {

    static { GL.initialize(); }

    public static final int
        GL_TEXTURE_BUFFER_OFFSET = 0x919D,
        GL_TEXTURE_BUFFER_SIZE   = 0x919E;

    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;

    protected ARBTextureBufferRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferRange ] ---

    /** {@code void glTexBufferRange(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL43C.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    // --- [ glTextureBufferRangeEXT ] ---

    /** {@code void glTextureBufferRangeEXT(GLuint texture, GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTextureBufferRangeEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

}