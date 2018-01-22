/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_vertex_shader_tessellator = "AMDVertexShaderTessellator".nativeClassGL("AMD_vertex_shader_tessellator", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The vertex shader tessellator gives new flexibility to the shader author to shade at a tessellated vertex, rather than just at a provided vertex.

        In unextended vertex shading, the built-in attributes such as gl_Vertex, gl_Normal, and gl_MultiTexcoord0, together with the user defined attributes,
        are system provided values which are initialized prior to vertex shader invocation.

        With vertex shading tessellation, additional vertex shader special values are available:
        ${codeBlock("""
        ivec3 gl_VertexTriangleIndex; // indices of the three control
                                      // points for the vertex
        vec3 gl_BarycentricCoord;     // barycentric coordinates
                                      // of the vertex

    i o
      |\
      | \
      *--*
      |\ |\
      | \| \
      *--*--*
      |\ |\ |\
      | \| \| \
    j o--*--*--o k

    Figure 1  A Tessellated Triangle
    o = control point (and tessellated vertex)
    * = tessellated vertex

        ivec4 gl_VertexQuadIndex;   // indices for the four control
                                    // points for the vertex
        vec2 gl_UVCoord;            // UV coordinates of the vertex

    i o--*--*--o k
      |\ |\ |\ |
      | \| \| \|
      *--*--*--*
      |\ |\ |\ |
      | \| \| \|
      *--*--*--*
      |\ |\ |\ |
      | \| \| \|
    j o--*--*--o l

    Figure 2  A Tessellated Quad
    o = control point (and tessellated vertex)
    * = tessellated vertex""")}
        When this extension is enabled, conventional built-in attributes and user defined attributes are uninitialized. The shader writer is responsible for
        explicitly fetching all other vertex data either from textures, uniform buffers, or vertex buffers.

        The shader writer is further responsible for interpolating the vertex data at the given barycentric coordinates or uv coordinates of the vertex.

        Requires ${GL20.core}.
        """

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_BUFFER_AMD"..0x9001,
        "INT_SAMPLER_BUFFER_AMD"..0x9002,
        "UNSIGNED_INT_SAMPLER_BUFFER_AMD"..0x9003
    )

    IntConstant(
        "Accepted by TessellationModeAMD.",

        "DISCRETE_AMD"..0x9006,
        "CONTINUOUS_AMD"..0x9007
    )

    IntConstant(
        "Accepted by GetIntegerv.",

        "TESSELLATION_MODE_AMD"..0x9004
    )

    IntConstant(
        "Accepted by GetFloatv.",

        "TESSELLATION_FACTOR_AMD"..0x9005
    )

    void(
        "TessellationFactorAMD",
        "",

        GLfloat.IN("factor", "")
    )

    void(
        "TessellationModeAMD",
        "",

        GLenum.IN("mode", "")
    )
}