/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_writeonly_rendering = "QCOMWriteonlyRendering".nativeClassGLES("QCOM_writeonly_rendering", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a specialized "write-only" rendering mode that may offer a performance boost for simple 2D rendering.

        Some applications render large frame buffers with simple geometry, very little overdraw, and no need for the following per-fragment stages:
        depth/stencil testing, Multisampling, blending, and Logic Operations. Applications rendering a windowed desktop or other 2D GUI might fit into this
        profile.

        Applications that match this profile can enable �write-only� rendering mode. Performance may be improved in this mode through single-pass rendering
        directly to system memory as compared with multipass tile-based rendering into on-chip memory. However, since the write-path to system memory is
        generally lower bandwidth, any gains are most likely for 2D applications rendering to large frame buffers with little overdraw.

        On some HW, the GPU is not able to simultaneously read and write to system memory framebuffers, so enabling this mode also implicitly disables any per-
        fragment operations that may read from the frame buffer. In addition, this mode implicitly disables any reads and writes from the depth buffer.

        To enable write-only rendering, an OpenGL application will call glEnable(GL_WRITEONLY_RENDERING_QCOM). When write-only rendering is enabled, the
        following per-fragment stages are disabled regardless of the associated GL enables: multisample, depth_test, stencil_test, blending, and
        color_logic_Op. In addition, write-only rendering will implicitly disable all depth writes regardless of the value set via glDepthMask(). The
        alpha_test and scissor_test stages function as normal.

        To disable fast-rendering, call glDisable(GL_ WRITEONLY_RENDERING_QCOM). Any stages previously disabled by write-only rendering will return to their
        current GL state.
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable.",

        "WRITEONLY_RENDERING_QCOM"..0x8823
    )
}