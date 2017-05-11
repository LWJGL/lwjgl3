/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_shadow_samplers_cube = "NVShadowSamplersCube".nativeClassGLES("NV_shadow_samplers_cube", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension expands the shadow map capability described in EXT_shadow_samplers to include support for shadow samplers of cube map textures.

        Requires ${GLES20.core}, ${OES_depth_texture_cube_map.link} and ${EXT_shadow_samplers.link}.
        """

    IntConstant(
        "Returned in {@code type} by glGetActiveUniform.",

        "SAMPLER_CUBE_SHADOW_NV"..0x8DC5
    )
}