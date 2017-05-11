/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ARM_shader_framebuffer_fetch = "ARMShaderFramebufferFetch".nativeClassGLES("ARM_shader_framebuffer_fetch", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables fragment shaders to read existing framebuffer data as input. This permits use-cases such as programmable blending, and other
        operations that may not be possible to implement with fixed-function blending.

        This extension also adds the ability to indicate that a shader should be run once per sample instead of once per pixel.

        Reading framebuffer data as input in combination with multiple render targets (MRT) may not be supported by all implementations. This extension allows
        applications to query for this capability.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.
        """,

        "FETCH_PER_SAMPLE_ARM"..0x8F65
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "FRAGMENT_SHADER_FRAMEBUFFER_FETCH_MRT_ARM"..0x8F66
    )
}