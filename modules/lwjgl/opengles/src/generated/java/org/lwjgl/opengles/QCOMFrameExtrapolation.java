/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class QCOMFrameExtrapolation {

    static { GLES.initialize(); }

    protected QCOMFrameExtrapolation() {
        throw new UnsupportedOperationException();
    }

    // --- [ glExtrapolateTex2DQCOM ] ---

    /** {@code void glExtrapolateTex2DQCOM(GLuint src1, GLuint src2, GLuint output, GLfloat scaleFactor)} */
    public static native void glExtrapolateTex2DQCOM(@NativeType("GLuint") int src1, @NativeType("GLuint") int src2, @NativeType("GLuint") int output, @NativeType("GLfloat") float scaleFactor);

}