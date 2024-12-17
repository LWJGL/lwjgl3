/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val INTEL_blackhole_render = "INTELBlackholeRender".nativeClassGLES("INTEL_blackhole_render", postfix = INTEL) {
    IntConstant(
        "BLACKHOLE_RENDER_INTEL"..0x83FC
    )
}