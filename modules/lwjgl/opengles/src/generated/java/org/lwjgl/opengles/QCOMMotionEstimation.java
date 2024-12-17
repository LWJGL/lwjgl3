/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class QCOMMotionEstimation {

    static { GLES.initialize(); }

    public static final int
        GL_MOTION_ESTIMATION_SEARCH_BLOCK_X_QCOM = 0x8C90,
        GL_MOTION_ESTIMATION_SEARCH_BLOCK_Y_QCOM = 0x8C91;

    protected QCOMMotionEstimation() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexEstimateMotionQCOM ] ---

    /** {@code void glTexEstimateMotionQCOM(GLuint ref, GLuint target, GLuint output)} */
    public static native void glTexEstimateMotionQCOM(@NativeType("GLuint") int ref, @NativeType("GLuint") int target, @NativeType("GLuint") int output);

    // --- [ glTexEstimateMotionRegionsQCOM ] ---

    /** {@code void glTexEstimateMotionRegionsQCOM(GLuint ref, GLuint target, GLuint output, GLuint mask)} */
    public static native void glTexEstimateMotionRegionsQCOM(@NativeType("GLuint") int ref, @NativeType("GLuint") int target, @NativeType("GLuint") int output, @NativeType("GLuint") int mask);

}