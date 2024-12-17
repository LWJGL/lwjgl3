/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val INTEL_blackhole_render = "INTELBlackholeRender".nativeClassGL("INTEL_blackhole_render", postfix = INTEL) {
    IntConstant(
        "BLACKHOLE_RENDER_INTEL"..0x83FC
    )
}