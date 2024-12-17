/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_attrib_binding = "ARBVertexAttribBinding".nativeClassGL("ARB_vertex_attrib_binding") {
    IntConstant(
        "VERTEX_ATTRIB_BINDING"..0x82D4,
        "VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D5
    )

    IntConstant(
        "VERTEX_BINDING_DIVISOR"..0x82D6,
        "VERTEX_BINDING_OFFSET"..0x82D7,
        "VERTEX_BINDING_STRIDE"..0x82D8,
        "VERTEX_BINDING_BUFFER"..0x8F4F
    )

    IntConstant(
        "MAX_VERTEX_ATTRIB_RELATIVE_OFFSET"..0x82D9,
        "MAX_VERTEX_ATTRIB_BINDINGS"..0x82DA
    )

    reuse(GL43C, "BindVertexBuffer")
    reuse(GL43C, "VertexAttribFormat")
    reuse(GL43C, "VertexAttribIFormat")
    reuse(GL43C, "VertexAttribLFormat")
    reuse(GL43C, "VertexAttribBinding")
    reuse(GL43C, "VertexBindingDivisor")

    val vaobj = GLuint("vaobj")
    var src = GL43["BindVertexBuffer"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayBindVertexBufferEXT",

        vaobj,
        src["bindingindex"],
        src["buffer"],
        src["offset"],
        src["stride"]
    )

    src = GL43["VertexAttribFormat"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayVertexAttribFormatEXT",

        vaobj,
        src["attribindex"],
        src["size"],
        src["type"],
        src["normalized"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribIFormat"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayVertexAttribIFormatEXT",

        vaobj,
        src["attribindex"],
        src["size"],
        src["type"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribLFormat"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayVertexAttribLFormatEXT",

        vaobj,
        src["attribindex"],
        src["size"],
        src["type"],
        src["relativeoffset"]
    )

    src = GL43["VertexAttribBinding"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayVertexAttribBindingEXT",

        vaobj,
        src["attribindex"],
        src["bindingindex"]
    )

    src = GL43["VertexBindingDivisor"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "VertexArrayVertexBindingDivisorEXT",

        vaobj,
        src["bindingindex"],
        src["divisor"]
    )
}