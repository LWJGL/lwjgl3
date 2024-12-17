/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBMultisample {

    static { GL.initialize(); }

    public static final int
        GL_MULTISAMPLE_ARB              = 0x809D,
        GL_SAMPLE_ALPHA_TO_COVERAGE_ARB = 0x809E,
        GL_SAMPLE_ALPHA_TO_ONE_ARB      = 0x809F,
        GL_SAMPLE_COVERAGE_ARB          = 0x80A0;

    public static final int GL_MULTISAMPLE_BIT_ARB = 0x20000000;

    public static final int
        GL_SAMPLE_BUFFERS_ARB         = 0x80A8,
        GL_SAMPLES_ARB                = 0x80A9,
        GL_SAMPLE_COVERAGE_VALUE_ARB  = 0x80AA,
        GL_SAMPLE_COVERAGE_INVERT_ARB = 0x80AB;

    protected ARBMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSampleCoverageARB ] ---

    /** {@code void glSampleCoverageARB(GLfloat value, GLboolean invert)} */
    public static native void glSampleCoverageARB(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert);

}