/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_conditional_render_inverted = "ARBConditionalRenderInverted".nativeClassGL("ARB_conditional_render_inverted") {
    IntConstant(
        "QUERY_WAIT_INVERTED"..0x8E17,
        "QUERY_NO_WAIT_INVERTED"..0x8E18,
        "QUERY_BY_REGION_WAIT_INVERTED"..0x8E19,
        "QUERY_BY_REGION_NO_WAIT_INVERTED"..0x8E1A
    )
}