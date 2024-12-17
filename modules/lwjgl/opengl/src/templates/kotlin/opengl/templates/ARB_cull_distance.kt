/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_cull_distance = "ARBCullDistance".nativeClassGL("ARB_cull_distance") {
    IntConstant(
        "MAX_CULL_DISTANCES"..0x82F9,
        "MAX_COMBINED_CLIP_AND_CULL_DISTANCES"..0x82FA
    )
}