/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_geometry_shader = "EXTGeometryShader".nativeClassGLES("EXT_geometry_shader", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_geometry_shader defines a new shader type available to be run on the GPU, called a geometry shader. Geometry shaders are run after vertices are
        transformed, but prior to color clamping, flatshading and clipping.

        A geometry shader begins with a single primitive (point, line, triangle). It can read the attributes of any of the vertices in the primitive and use
        them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices to
        define a new primitive. A geometry shader can emit multiple disconnected primitives. The primitives emitted by the geometry shader are clipped and then
        processed like an equivalent primitive specified by the application.

        Furthermore, EXT_geometry_shader provides four additional primitive types: lines with adjacency, line strips with adjacency, separate triangles with
        adjacency, and triangle strips with adjacency. Some of the vertices specified in these new primitive types are not part of the ordinary primitives,
        instead they represent neighboring vertices that are adjacent to the two line segment end points (lines/strips) or the three triangle edges
        (triangles/tstrips). These vertices can be accessed by geometry shaders and used to match up the vertices emitted by the geometry shader with those of
        neighboring primitives.

        Since geometry shaders expect a specific input primitive type, an error will occur if the application presents primitives of a different type. For
        example, if a geometry shader expects points, an error will occur at drawing time if a primitive mode of TRIANGLES is specified.

        This extension also adds the notion of layered framebuffer attachments and framebuffers that can be used in conjunction with geometry shaders to allow
        programs to direct primitives to a face of a cube map or layer of a three-dimensional texture or two-dimensional array texture. The layer used for
        rendering can be selected by the geometry shader at run time. The framebuffer layer count present in GL 4.x and removed from ES 3.1 is restored.

        Not all geometry shader implementations have the ability to write the point size from a geometry shader. Thus a second extension string and shading
        language enable are provided for implementations which do support geometry shader point size.

        This extension relies on the EXT_shader_io_blocks extension to provide the required functionality for declaring input and output blocks and interfacing
        between shaders.

        Requires ${GLES31.core}.
        """

    IntConstant(
        """
        Accepted by the {@code type} parameter of CreateShader and CreateShaderProgramv, by the {@code pname} parameter of GetProgramPipelineiv and returned in
        the {@code params} parameter of GetShaderiv when {@code pname} is SHADER_TYPE.
        """,

        "GEOMETRY_SHADER_EXT"..0x8DD9
    )

    IntConstant(
        "Accepted by the {@code stages} parameter of UseProgramStages.",

        "GEOMETRY_SHADER_BIT_EXT"..0x00000004
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "GEOMETRY_LINKED_VERTICES_OUT_EXT"..0x8916,
        "GEOMETRY_LINKED_INPUT_TYPE_EXT"..0x8917,
        "GEOMETRY_LINKED_OUTPUT_TYPE_EXT"..0x8918,
        "GEOMETRY_SHADER_INVOCATIONS_EXT"..0x887F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v.",

        "LAYER_PROVOKING_VERTEX_EXT"..0x825E,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT"..0x8DDF,
        "MAX_GEOMETRY_UNIFORM_BLOCKS_EXT"..0x8A2C,
        "MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_EXT"..0x8A32,
        "MAX_GEOMETRY_INPUT_COMPONENTS_EXT"..0x9123,
        "MAX_GEOMETRY_OUTPUT_COMPONENTS_EXT"..0x9124,
        "MAX_GEOMETRY_OUTPUT_VERTICES_EXT"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT"..0x8DE1,
        "MAX_GEOMETRY_SHADER_INVOCATIONS_EXT"..0x8E5A,
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT"..0x8C29,
        "MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_EXT"..0x92CF,
        "MAX_GEOMETRY_ATOMIC_COUNTERS_EXT"..0x92D5,
        "MAX_GEOMETRY_IMAGE_UNIFORMS_EXT"..0x90CD,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_EXT"..0x90D7
    )

    IntConstant(
        "Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX_EXT.",

        "FIRST_VERTEX_CONVENTION_EXT"..0x8E4D,
        "LAST_VERTEX_CONVENTION_EXT"..0x8E4E,
        "UNDEFINED_VERTEX_EXT"..0x8260
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryiv, and GetQueryObjectuiv.",

        "PRIMITIVES_GENERATED_EXT"..0x8C87
    )

    IntConstant(
        "Accepted by the {@code mode} parameter of DrawArrays, DrawElements, and other commands which draw primitives.",

        "LINES_ADJACENCY_EXT"..0xA,
        "LINE_STRIP_ADJACENCY_EXT"..0xB,
        "TRIANGLES_ADJACENCY_EXT"..0xC,
        "TRIANGLE_STRIP_ADJACENCY_EXT"..0xD
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of FramebufferParameteri, and GetFramebufferParameteriv.",

        "FRAMEBUFFER_DEFAULT_LAYERS_EXT"..0x9312
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, and GetFloatv.",

        "MAX_FRAMEBUFFER_LAYERS_EXT"..0x9317
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT"..0x8DA8
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_LAYERED_EXT"..0x8DA7
    )

    IntConstant(
        "Accepted by the {@code props} parameter of GetProgramResourceiv.",

        "REFERENCED_BY_GEOMETRY_SHADER_EXT"..0x9309
    )

    void(
        "FramebufferTextureEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )
}

val EXT_geometry_point_size = EXT_FLAG.nativeClassGLES("EXT_geometry_point_size", postfix = EXT) {
    documentation =
        "When true, the ${registryLink("EXT", "EXT_geometry_shader")} extension is supported."
}