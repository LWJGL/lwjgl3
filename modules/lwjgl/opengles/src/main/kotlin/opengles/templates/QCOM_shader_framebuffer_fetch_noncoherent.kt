/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_shader_framebuffer_fetch_noncoherent = "QCOMShaderFramebufferFetchNoncoherent".nativeClassGLES("QCOM_shader_framebuffer_fetch_noncoherent", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Existing extensions such as ${EXT_shader_framebuffer_fetch.link} and ARM_shader_framebuffer_fetch_depth_stencil allow fragment shaders to read existing
        framebuffer color or depth/stencil data as input. This extension adds support for reading those same inputs with relaxed coherency requirements. This
        mode can avoid expensive per-primitive flushes of the pixel pipeline and may offer performance improvements in some implementations.

        When the relaxed coherency mode is enabled, reads of the framebuffer data by the fragment shader will guarantee defined results only if each sample is
        touched no more than once in any single rendering pass. The command #FramebufferFetchBarrierQCOM() is provided to indicate a boundary between passes.
        """

    void(
        "FramebufferFetchBarrierQCOM",
        ""
    )
}