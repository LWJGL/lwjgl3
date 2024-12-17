/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDVertexShaderTessellator {

    static { GL.initialize(); }

    public static final int
        GL_SAMPLER_BUFFER_AMD              = 0x9001,
        GL_INT_SAMPLER_BUFFER_AMD          = 0x9002,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;

    public static final int
        GL_DISCRETE_AMD   = 0x9006,
        GL_CONTINUOUS_AMD = 0x9007;

    public static final int GL_TESSELLATION_MODE_AMD = 0x9004;

    public static final int GL_TESSELLATION_FACTOR_AMD = 0x9005;

    protected AMDVertexShaderTessellator() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTessellationFactorAMD ] ---

    /** {@code void glTessellationFactorAMD(GLfloat factor)} */
    public static native void glTessellationFactorAMD(@NativeType("GLfloat") float factor);

    // --- [ glTessellationModeAMD ] ---

    /** {@code void glTessellationModeAMD(GLenum mode)} */
    public static native void glTessellationModeAMD(@NativeType("GLenum") int mode);

}