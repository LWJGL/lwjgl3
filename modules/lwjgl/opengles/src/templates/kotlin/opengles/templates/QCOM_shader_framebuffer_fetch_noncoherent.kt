/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_shader_framebuffer_fetch_noncoherent = "QCOMShaderFramebufferFetchNoncoherent".nativeClassGLES("QCOM_shader_framebuffer_fetch_noncoherent", postfix = QCOM) {
    void("FramebufferFetchBarrierQCOM", void())
}