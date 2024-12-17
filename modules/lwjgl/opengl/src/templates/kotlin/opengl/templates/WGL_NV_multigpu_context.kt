/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_NV_multigpu_context = "WGLNVMultigpuContext".nativeClassWGL("WGL_NV_multigpu_context", NV) {
    IntConstant(
        "CONTEXT_MULTIGPU_ATTRIB_NV"..0x20AA
    )

    IntConstant(
        "CONTEXT_MULTIGPU_ATTRIB_SINGLE_NV"..0x20AB,
        "CONTEXT_MULTIGPU_ATTRIB_AFR_NV"..0x20AC,
        "CONTEXT_MULTIGPU_ATTRIB_MULTICAST_NV"..0x20AD,
        "CONTEXT_MULTIGPU_ATTRIB_MULTI_DISPLAY_MULTICAST_NV"..0x20AE
    )
}