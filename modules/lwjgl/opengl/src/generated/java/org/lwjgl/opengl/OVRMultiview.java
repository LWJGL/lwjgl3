/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class OVRMultiview {

    static { GL.initialize(); }

    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR       = 0x9630,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;

    public static final int GL_MAX_VIEWS_OVR = 0x9631;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

    protected OVRMultiview() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferTextureMultiviewOVR ] ---

    /** {@code void glFramebufferTextureMultiviewOVR(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint baseViewIndex, GLsizei numViews)} */
    public static native void glFramebufferTextureMultiviewOVR(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews);

    // --- [ glNamedFramebufferTextureMultiviewOVR ] ---

    /** {@code void glNamedFramebufferTextureMultiviewOVR(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level, GLint baseViewIndex, GLsizei numViews)} */
    public static native void glNamedFramebufferTextureMultiviewOVR(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int baseViewIndex, @NativeType("GLsizei") int numViews);

}