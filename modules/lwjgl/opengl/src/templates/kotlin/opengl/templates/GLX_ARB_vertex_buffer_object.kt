/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_vertex_buffer_object = "GLXARBVertexBufferObject".nativeClassGLX("GLX_ARB_vertex_buffer_object", ARB) {
    IntConstant(
        "CONTEXT_ALLOW_BUFFER_BYTE_ORDER_MISMATCH_ARB"..0x2095
    )
}