/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class QCOMTiledRendering {

    static { GLES.initialize(); }

    public static final int
        GL_COLOR_BUFFER_BIT0_QCOM       = 0x1,
        GL_COLOR_BUFFER_BIT1_QCOM       = 0x2,
        GL_COLOR_BUFFER_BIT2_QCOM       = 0x4,
        GL_COLOR_BUFFER_BIT3_QCOM       = 0x8,
        GL_COLOR_BUFFER_BIT4_QCOM       = 0x10,
        GL_COLOR_BUFFER_BIT5_QCOM       = 0x20,
        GL_COLOR_BUFFER_BIT6_QCOM       = 0x40,
        GL_COLOR_BUFFER_BIT7_QCOM       = 0x80,
        GL_DEPTH_BUFFER_BIT0_QCOM       = 0x100,
        GL_DEPTH_BUFFER_BIT1_QCOM       = 0x200,
        GL_DEPTH_BUFFER_BIT2_QCOM       = 0x400,
        GL_DEPTH_BUFFER_BIT3_QCOM       = 0x800,
        GL_DEPTH_BUFFER_BIT4_QCOM       = 0x1000,
        GL_DEPTH_BUFFER_BIT5_QCOM       = 0x2000,
        GL_DEPTH_BUFFER_BIT6_QCOM       = 0x4000,
        GL_DEPTH_BUFFER_BIT7_QCOM       = 0x8000,
        GL_STENCIL_BUFFER_BIT0_QCOM     = 0x10000,
        GL_STENCIL_BUFFER_BIT1_QCOM     = 0x20000,
        GL_STENCIL_BUFFER_BIT2_QCOM     = 0x40000,
        GL_STENCIL_BUFFER_BIT3_QCOM     = 0x80000,
        GL_STENCIL_BUFFER_BIT4_QCOM     = 0x100000,
        GL_STENCIL_BUFFER_BIT5_QCOM     = 0x200000,
        GL_STENCIL_BUFFER_BIT6_QCOM     = 0x400000,
        GL_STENCIL_BUFFER_BIT7_QCOM     = 0x800000,
        GL_MULTISAMPLE_BUFFER_BIT0_QCOM = 0x1000000,
        GL_MULTISAMPLE_BUFFER_BIT1_QCOM = 0x2000000,
        GL_MULTISAMPLE_BUFFER_BIT2_QCOM = 0x4000000,
        GL_MULTISAMPLE_BUFFER_BIT3_QCOM = 0x8000000,
        GL_MULTISAMPLE_BUFFER_BIT4_QCOM = 0x10000000,
        GL_MULTISAMPLE_BUFFER_BIT5_QCOM = 0x20000000,
        GL_MULTISAMPLE_BUFFER_BIT6_QCOM = 0x40000000,
        GL_MULTISAMPLE_BUFFER_BIT7_QCOM = 0x80000000;

    protected QCOMTiledRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ glStartTilingQCOM ] ---

    /** {@code void glStartTilingQCOM(GLuint x, GLuint y, GLuint width, GLuint height, GLbitfield preserveMask)} */
    public static native void glStartTilingQCOM(@NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int width, @NativeType("GLuint") int height, @NativeType("GLbitfield") int preserveMask);

    // --- [ glEndTilingQCOM ] ---

    /** {@code void glEndTilingQCOM(GLbitfield preserveMask)} */
    public static native void glEndTilingQCOM(@NativeType("GLbitfield") int preserveMask);

}