/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_instanced_arrays = "ARBInstancedArrays".nativeClassGL("ARB_instanced_arrays", postfix = ARB) {
    IntConstant(
        "VERTEX_ATTRIB_ARRAY_DIVISOR_ARB"..0x88FE
    )

    void(
        "VertexAttribDivisorARB",

        GLuint("index"),
        GLuint("divisor")
    )

    DependsOn("GL_EXT_direct_state_access")..IgnoreMissing..void(
        "VertexArrayVertexAttribDivisorEXT",

        GLuint("vaobj"),
        GLuint("index"),
        GLuint("divisor")
    )
}
