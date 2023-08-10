/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_binning_control.txt">QCOM_binning_control</a> extension.
 * 
 * <p>This extension adds some new hints to give more control to application developers over the driver's binning algorithm.</p>
 * 
 * <p>Only change this state right before changing rendertargets or right after a swap or there will be a large performance penalty.</p>
 */
public final class QCOMBinningControl {

    /** Accepted by the {@code target} parameter of Hint. */
    public static final int GL_BINNING_CONTROL_HINT_QCOM = 0x8FB0;

    /** Accepted by the {@code hint} parameter of Hint. */
    public static final int
        GL_CPU_OPTIMIZED_QCOM                = 0x8FB1,
        GL_GPU_OPTIMIZED_QCOM                = 0x8FB2,
        GL_RENDER_DIRECT_TO_FRAMEBUFFER_QCOM = 0x8FB3,
        GL_DONT_CARE                         = 0x1100;

    private QCOMBinningControl() {}

}