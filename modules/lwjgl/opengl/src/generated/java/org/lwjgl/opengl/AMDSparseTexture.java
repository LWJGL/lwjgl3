/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDSparseTexture {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x1;

    public static final int
        GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195,
        GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196,
        GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;

    public static final int
        GL_MAX_SPARSE_TEXTURE_SIZE_AMD     = 0x9198,
        GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD  = 0x9199,
        GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;

    public static final int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;

    public static final int GL_MIN_LOD_WARNING_AMD = 0x919C;

    protected AMDSparseTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexStorageSparseAMD ] ---

    /** {@code void glTexStorageSparseAMD(GLenum target, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLsizei layers, GLbitfield flags)} */
    public static native void glTexStorageSparseAMD(@NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int layers, @NativeType("GLbitfield") int flags);

    // --- [ glTextureStorageSparseAMD ] ---

    /** {@code void glTextureStorageSparseAMD(GLuint texture, GLenum target, GLenum internalFormat, GLsizei width, GLsizei height, GLsizei depth, GLsizei layers, GLbitfield flags)} */
    public static native void glTextureStorageSparseAMD(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int layers, @NativeType("GLbitfield") int flags);

}