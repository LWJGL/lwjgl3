/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVViewportSwizzle {

    static { GLES.initialize(); }

    public static final int
        GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 0x9350,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 0x9351,
        GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 0x9352,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 0x9353,
        GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 0x9354,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 0x9355,
        GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 0x9356,
        GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 0x9357;

    public static final int
        GL_VIEWPORT_SWIZZLE_X_NV = 0x9358,
        GL_VIEWPORT_SWIZZLE_Y_NV = 0x9359,
        GL_VIEWPORT_SWIZZLE_Z_NV = 0x935A,
        GL_VIEWPORT_SWIZZLE_W_NV = 0x935B;

    protected NVViewportSwizzle() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportSwizzleNV ] ---

    /** {@code void glViewportSwizzleNV(GLuint index, GLenum swizzlex, GLenum swizzley, GLenum swizzlez, GLenum swizzlew)} */
    public static native void glViewportSwizzleNV(@NativeType("GLuint") int index, @NativeType("GLenum") int swizzlex, @NativeType("GLenum") int swizzley, @NativeType("GLenum") int swizzlez, @NativeType("GLenum") int swizzlew);

}