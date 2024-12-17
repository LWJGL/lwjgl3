/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_shader_framebuffer_fetch = "EXTShaderFramebufferFetch".nativeClassGL("EXT_shader_framebuffer_fetch", postfix = EXT) {
    IntConstant(
        "FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT"..0x8A52
    )
}

val EXT_shader_framebuffer_fetch_non_coherent = "EXTShaderFramebufferFetchNonCoherent".nativeClassGL("EXT_shader_framebuffer_fetch_non_coherent", postfix = EXT) {
    void(
        "FramebufferFetchBarrierEXT",
        void()
    )
}