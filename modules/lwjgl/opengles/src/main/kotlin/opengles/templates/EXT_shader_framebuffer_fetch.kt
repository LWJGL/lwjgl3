/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_shader_framebuffer_fetch = "EXTShaderFramebufferFetch".nativeClassGLES("EXT_shader_framebuffer_fetch", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Conventional OpenGL blending provides a configurable series of operations that can be used to combine the output values from a fragment shader with the
        values already in the framebuffer. While these operations are suitable for basic image compositing, other compositing operations or operations that
        treat fragment output as something other than a color (normals, for instance) may not be expressible without multiple passes or render-to-texture
        operations.

        This extension provides a mechanism whereby a fragment shader may read existing framebuffer data as input. This can be used to implement compositing
        operations that would have been inconvenient or impossible with fixed-function blending. It can also be used to apply a function to the framebuffer
        color, by writing a shader which uses the existing framebuffer color as its only input.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT"..0x8A52
    )
}