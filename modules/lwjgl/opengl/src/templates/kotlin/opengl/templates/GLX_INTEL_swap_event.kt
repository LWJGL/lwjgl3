/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_INTEL_swap_event = "GLXINTELSwapEvent".nativeClassGLX("GLX_INTEL_swap_event", INTEL) {
    IntConstant(
        "BUFFER_SWAP_COMPLETE_INTEL_MASK"..0x04000000
    )

    IntConstant(
        "EXCHANGE_COMPLETE_INTEL"..0x8180,
        "COPY_COMPLETE_INTEL"..0x8181,
        "FLIP_COMPLETE_INTEL"..0x8182
    )

}