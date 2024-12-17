/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTSparseTexture {

    static { GLES.initialize(); }

    public static final int
        GL_TEXTURE_SPARSE_EXT          = 0x91A6,
        GL_VIRTUAL_PAGE_SIZE_INDEX_EXT = 0x91A7;

    public static final int GL_NUM_SPARSE_LEVELS_EXT = 0x91AA;

    public static final int
        GL_NUM_VIRTUAL_PAGE_SIZES_EXT = 0x91A8,
        GL_VIRTUAL_PAGE_SIZE_X_EXT    = 0x9195,
        GL_VIRTUAL_PAGE_SIZE_Y_EXT    = 0x9196,
        GL_VIRTUAL_PAGE_SIZE_Z_EXT    = 0x9197;

    public static final int
        GL_TEXTURE_2D                 = 0xDE1,
        GL_TEXTURE_2D_ARRAY           = 0x8C1A,
        GL_TEXTURE_CUBE_MAP           = 0x8513,
        GL_TEXTURE_CUBE_MAP_ARRAY_OES = 0x9009,
        GL_TEXTURE_3D                 = 0x806F;

    public static final int
        GL_MAX_SPARSE_TEXTURE_SIZE_EXT                = 0x9198,
        GL_MAX_SPARSE_3D_TEXTURE_SIZE_EXT             = 0x9199,
        GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_EXT        = 0x919A,
        GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_EXT = 0x91A9;

    protected EXTSparseTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexPageCommitmentARB ] ---

    /** {@code void glTexPageCommitmentARB(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLboolean commit)} */
    public static native void glTexPageCommitmentARB(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean commit);

}