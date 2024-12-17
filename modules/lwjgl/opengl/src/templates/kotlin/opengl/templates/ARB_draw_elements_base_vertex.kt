/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_draw_elements_base_vertex = "ARBDrawElementsBaseVertex".nativeClassGL("ARB_draw_elements_base_vertex") {
    reuse(GL32C, "DrawElementsBaseVertex")
    reuse(GL32C, "DrawRangeElementsBaseVertex")
    reuse(GL32C, "DrawElementsInstancedBaseVertex")
    reuse(GL32C, "MultiDrawElementsBaseVertex")
}