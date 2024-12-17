/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OESSampleShading {

    static { GLES.initialize(); }

    public static final int GL_SAMPLE_SHADING_OES = 0x8C36;

    public static final int GL_MIN_SAMPLE_SHADING_VALUE_OES = 0x8C37;

    protected OESSampleShading() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMinSampleShadingOES ] ---

    /** {@code void glMinSampleShadingOES(GLfloat value)} */
    public static native void glMinSampleShadingOES(@NativeType("GLfloat") float value);

}