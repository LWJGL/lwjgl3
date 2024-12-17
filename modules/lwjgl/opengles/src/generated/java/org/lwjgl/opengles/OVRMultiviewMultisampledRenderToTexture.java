/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OVRMultiviewMultisampledRenderToTexture {

    static { GLES.initialize(); }

    protected OVRMultiviewMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureMultisampleMultiviewOVR ] ---

    /** {@code void glFramebufferTextureMultisampleMultiviewOVR(GLenum target, GLenum attachment, GLuint texture, GLint level, GLsizei samples, GLint baseViewIndex, GLsizei numViews)} */
    public static native void glFramebufferTextureMultisampleMultiviewOVR(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int samples, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews);

}