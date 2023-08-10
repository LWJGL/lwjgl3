/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_frame_extrapolation.txt">QCOM_frame_extrapolation</a> extension.
 * 
 * <p>Frame extrapolation is the process of producing a new, future frame based on the contents of two previously rendered frames. It may be used to produce
 * high frame rate display updates without incurring the full cost of traditional rendering at the higher framerate.</p>
 * 
 * <p>This extension adds support for frame extrapolation in OpenGL ES by adding a function which takes three textures. The first two are used in sequence as
 * the source frames, from which the extrapolated frame is derived. The extrapolated frame is stored in the third texture.</p>
 */
public class QCOMFrameExtrapolation {

    static { GLES.initialize(); }

    protected QCOMFrameExtrapolation() {
        throw new UnsupportedOperationException();
    }

    // --- [ glExtrapolateTex2DQCOM ] ---

    public static native void glExtrapolateTex2DQCOM(@NativeType("GLuint") int src1, @NativeType("GLuint") int src2, @NativeType("GLuint") int output, @NativeType("GLfloat") float scaleFactor);

}