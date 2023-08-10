/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_motion_estimation.txt">QCOM_motion_estimation</a> extension.
 * 
 * <p>Motion estimation, also referred to as optical flow, is the process of producing motion vectors that convey the 2D transformation from a reference
 * image to a target image. There are various uses of motion estimation, such as frame extrapolation, compression, object tracking, etc.</p>
 * 
 * <p>This extension adds support for motion estimation in OpenGL ES by adding functions which take the reference and target images and populate an output
 * texture containing the corresponding motion vectors.</p>
 */
public class QCOMMotionEstimation {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetInteger64v, and GetFloatv. */
    public static final int
        GL_MOTION_ESTIMATION_SEARCH_BLOCK_X_QCOM = 0x8C90,
        GL_MOTION_ESTIMATION_SEARCH_BLOCK_Y_QCOM = 0x8C91;

    protected QCOMMotionEstimation() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexEstimateMotionQCOM ] ---

    public static native void glTexEstimateMotionQCOM(@NativeType("GLuint") int ref, @NativeType("GLuint") int target, @NativeType("GLuint") int output);

    // --- [ glTexEstimateMotionRegionsQCOM ] ---

    public static native void glTexEstimateMotionRegionsQCOM(@NativeType("GLuint") int ref, @NativeType("GLuint") int target, @NativeType("GLuint") int output, @NativeType("GLuint") int mask);

}