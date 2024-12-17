/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_base_instance = "ARBBaseInstance".nativeClassGL("ARB_base_instance") {
    reuse(GL42C, "DrawArraysInstancedBaseInstance")
    reuse(GL42C, "DrawElementsInstancedBaseInstance")
    reuse(GL42C, "DrawElementsInstancedBaseVertexBaseInstance")
}