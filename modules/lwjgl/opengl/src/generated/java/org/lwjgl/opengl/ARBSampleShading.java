/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBSampleShading {

    static { GL.initialize(); }

    public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;

    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;

    protected ARBSampleShading() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMinSampleShadingARB ] ---

    /** {@code void glMinSampleShadingARB(GLfloat value)} */
    public static native void glMinSampleShadingARB(@NativeType("GLfloat") float value);

}