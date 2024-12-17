/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OESTextureStorageMultisample2DArray {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY_OES = 0x9102;

    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES = 0x9105;

    public static final int
        GL_SAMPLER_2D_MULTISAMPLE_ARRAY_OES              = 0x910B,
        GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES          = 0x910C,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = 0x910D;

    protected OESTextureStorageMultisample2DArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexStorage3DMultisampleOES ] ---

    /** {@code void glTexStorage3DMultisampleOES(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static native void glTexStorage3DMultisampleOES(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations);

}