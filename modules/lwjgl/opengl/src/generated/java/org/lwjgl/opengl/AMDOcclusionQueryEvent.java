/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDOcclusionQueryEvent {

    static { GL.initialize(); }

    public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 0x874F;

    public static final int
        GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD        = 0x1,
        GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD        = 0x2,
        GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD      = 0x4,
        GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 0x8,
        GL_QUERY_ALL_EVENT_BITS_AMD              = 0xFFFFFFFF;

    protected AMDOcclusionQueryEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ glQueryObjectParameteruiAMD ] ---

    /** {@code void glQueryObjectParameteruiAMD(GLenum target, GLuint id, GLenum pname, GLuint param)} */
    public static native void glQueryObjectParameteruiAMD(@NativeType("GLenum") int target, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint") int param);

}