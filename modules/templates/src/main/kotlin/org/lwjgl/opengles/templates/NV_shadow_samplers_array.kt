/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_shadow_samplers_array = "NVShadowSamplersArray".nativeClassGLES("NV_shadow_samplers_array", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension expands the shadow map capability described in EXT_shadow_samplers to include support for shadow samplers of 2D array textures.

        Requires ${GLES20.core}, ${NV_texture_array.link} and ${EXT_shadow_samplers.link}.
        """

    IntConstant(
        "Returned in {@code type} by glGetActiveUniform.",

        "SAMPLER_2D_ARRAY_SHADOW_NV"..0x8DC4
    )
}