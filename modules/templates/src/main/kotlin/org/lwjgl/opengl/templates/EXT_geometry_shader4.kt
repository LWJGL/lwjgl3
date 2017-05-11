/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_geometry_shader4 = "EXTGeometryShader4".nativeClassGL("EXT_geometry_shader4", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_geometry_shader4 defines a new shader type available to be run on the GPU, called a geometry shader. Geometry shaders are run after vertices are
        transformed, but prior to color clamping, flat shading and clipping.

        A geometry shader begins with a single primitive (point, line, triangle). It can read the attributes of any of the vertices in the primitive and use
        them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices to
        define a new primitive. A geometry shader can emit multiple disconnected primitives. The primitives emitted by the geometry shader are clipped and then
        processed like an equivalent OpenGL primitive specified by the application.

        Furthermore, EXT_geometry_shader4 provides four additional primitive types: lines with adjacency, line strips with adjacency, separate triangles with
        adjacency, and triangle strips with adjacency. Some of the vertices specified in these new primitive types are not part of the ordinary primitives,
        instead they represent neighboring vertices that are adjacent to the two line segment end points (lines/strips) or the three triangle edges
        (triangles/tstrips). These vertices can be accessed by geometry shaders and used to match up the vertices emitted by the geometry shader with those of
        neighboring primitives.

        Since geometry shaders expect a specific input primitive type, an error will occur if the application presents primitives of a different type. For
        example, if a geometry shader expects points, an error will occur at Begin() time, if a primitive mode of TRIANGLES is specified.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "GEOMETRY_SHADER_EXT"..0x8DD9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of ProgramParameteriEXT and GetProgramiv.",

        "GEOMETRY_VERTICES_OUT_EXT"..0x8DDA,
        "GEOMETRY_INPUT_TYPE_EXT"..0x8DDB,
        "GEOMETRY_OUTPUT_TYPE_EXT"..0x8DDC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT"..0x8C29,
        "MAX_GEOMETRY_VARYING_COMPONENTS_EXT"..0x8DDD,
        "MAX_VERTEX_VARYING_COMPONENTS_EXT"..0x8DDE,
        "MAX_VARYING_COMPONENTS_EXT"..0x8B4B,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT"..0x8DDF,
        "MAX_GEOMETRY_OUTPUT_VERTICES_EXT"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT"..0x8DE1
    )

    IntConstant(
        "Accepted by the {@code mode} parameter of Begin, DrawArrays, MultiDrawArrays, DrawElements, MultiDrawElements, and DrawRangeElements.",

        "LINES_ADJACENCY_EXT"..0xA,
        "LINE_STRIP_ADJACENCY_EXT"..0xB,
        "TRIANGLES_ADJACENCY_EXT"..0xC,
        "TRIANGLE_STRIP_ADJACENCY_EXT"..0xD
    )

    IntConstant(
        "Returned by CheckFramebufferStatusEXT.",

        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT"..0x8DA8,
        "FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT"..0x8DA9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachment- ParameterivEXT.",

        "FRAMEBUFFER_ATTACHMENT_LAYERED_EXT"..0x8DA7,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT"..0x8CD4
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetFloatv, GetDoublev, and
        GetBooleanv.
        """,

        "PROGRAM_POINT_SIZE_EXT"..0x8642
    )

    void(
        "ProgramParameteriEXT",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("pname", ""),
        GLint.IN("value", "")
    )

    void(
        "FramebufferTextureEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )

    void(
        "FramebufferTextureLayerEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLint.IN("layer", "")
    )

    void(
        "FramebufferTextureFaceEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLenum.IN("face", "")
    )
}