/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val INTEL_framebuffer_CMAA = "INTELFramebufferCMAA".nativeClassGLES("INTEL_framebuffer_CMAA", postfix = INTEL) {
    void("ApplyFramebufferAttachmentCMAAINTEL")
}