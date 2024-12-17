/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_provoking_vertex = "ARBProvokingVertex".nativeClassGL("ARB_provoking_vertex") {
    IntConstant(
        "FIRST_VERTEX_CONVENTION"..0x8E4D,
        "LAST_VERTEX_CONVENTION"..0x8E4E
    )

    IntConstant(
        "PROVOKING_VERTEX"..0x8E4F,
        "QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION"..0x8E4C
    )

    reuse(GL32C, "ProvokingVertex")
}