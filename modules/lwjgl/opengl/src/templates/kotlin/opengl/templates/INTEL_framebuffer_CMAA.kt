/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val INTEL_framebuffer_CMAA = "INTELFramebufferCMAA".nativeClassGL("INTEL_framebuffer_CMAA", postfix = INTEL) {
    void("ApplyFramebufferAttachmentCMAAINTEL")
}