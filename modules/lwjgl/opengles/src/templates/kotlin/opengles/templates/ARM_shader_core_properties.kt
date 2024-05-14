/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_shader_core_properties = "ARMShaderCoreProperties".nativeClassGLES("ARM_shader_core_properties", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications may wish to know and/or control certain GPU shader core properties to select the optimal logic. This extension allows application to query
        and set the number of active GPU shader cores, and query other shader core properties for the optimal logic and performance profiling, including:
        ${ul(
            "The maximum number of physical shader cores available on the device;",
            "The number of active shader cores specified on the device;",
            "A bitfield indicating the presence of shader cores on the device;",
            "The maximum warp count per shader core available on the device;",
            "The maximum number of pixels output per clock per shader core;",
            "The maximum number of texels per clock per shader core;",
            "The maximum number of single-precision fused multiply-add operations per clock per shader core;"
        )}

        Requires ${GLES32.core}.
        """

    IntConstant(
        "New attributes accepted by the {@code pname} argument of #GetIntegerv(), #GetInteger64v().",

        "SHADER_CORE_COUNT_ARM"..0x96F0,
        "SHADER_CORE_ACTIVE_COUNT_ARM"..0x96F1,
        "SHADER_CORE_PRESENT_MASK_ARM"..0x96F2,
        "SHADER_CORE_MAX_WARP_COUNT_ARM"..0x96F3,
        "SHADER_CORE_PIXEL_RATE_ARM"..0x96F4,
        "SHADER_CORE_TEXEL_RATE_ARM"..0x96F5,
        "SHADER_CORE_FMA_RATE_ARM"..0x96F6
    )

    void(
        "MaxActiveShaderCoresARM",
        "",

        GLuint("count", "")
    )
}