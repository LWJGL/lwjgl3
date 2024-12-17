/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_clear_buffer_object = "ARBClearBufferObject".nativeClassGL("ARB_clear_buffer_object") {
    val ClearBufferData = reuse(GL43C, "ClearBufferData")
    val ClearBufferSubData = reuse(GL43C, "ClearBufferSubData")

    DependsOn("GL_EXT_direct_state_access")..void(
        "ClearNamedBufferDataEXT",

        GLuint("buffer"),
        ClearBufferData["internalformat"],
        ClearBufferData["format"],
        ClearBufferData["type"],
        ClearBufferData["data"]
    )

    DependsOn("GL_EXT_direct_state_access")..void(
        "ClearNamedBufferSubDataEXT",

        GLuint("buffer"),
        ClearBufferSubData["internalformat"],
        ClearBufferSubData["offset"],
        ClearBufferSubData["size"],
        ClearBufferSubData["format"],
        ClearBufferSubData["type"],
        ClearBufferSubData["data"]
    )
}