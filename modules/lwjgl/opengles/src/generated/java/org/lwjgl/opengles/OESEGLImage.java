/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class OESEGLImage {

    static { GLES.initialize(); }

    protected OESEGLImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEGLImageTargetTexture2DOES ] ---

    /** {@code void glEGLImageTargetTexture2DOES(GLenum target, GLeglImageOES image)} */
    public static native void nglEGLImageTargetTexture2DOES(int target, long image);

    /** {@code void glEGLImageTargetTexture2DOES(GLenum target, GLeglImageOES image)} */
    public static void glEGLImageTargetTexture2DOES(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image) {
        if (CHECKS) {
            check(image);
        }
        nglEGLImageTargetTexture2DOES(target, image);
    }

    // --- [ glEGLImageTargetRenderbufferStorageOES ] ---

    /** {@code void glEGLImageTargetRenderbufferStorageOES(GLenum target, GLeglImageOES image)} */
    public static native void nglEGLImageTargetRenderbufferStorageOES(int target, long image);

    /** {@code void glEGLImageTargetRenderbufferStorageOES(GLenum target, GLeglImageOES image)} */
    public static void glEGLImageTargetRenderbufferStorageOES(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image) {
        if (CHECKS) {
            check(image);
        }
        nglEGLImageTargetRenderbufferStorageOES(target, image);
    }

}