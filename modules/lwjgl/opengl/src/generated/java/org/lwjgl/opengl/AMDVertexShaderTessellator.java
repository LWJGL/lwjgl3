/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_tessellator.txt">AMD_vertex_shader_tessellator</a> extension.
 * 
 * <p>The vertex shader tessellator gives new flexibility to the shader author to shade at a tessellated vertex, rather than just at a provided vertex.</p>
 * 
 * <p>In unextended vertex shading, the built-in attributes such as gl_Vertex, gl_Normal, and gl_MultiTexcoord0, together with the user defined attributes,
 * are system provided values which are initialized prior to vertex shader invocation.</p>
 * 
 * <p>With vertex shading tessellation, additional vertex shader special values are available:</p>
 * 
 * <pre><code>
 *         ivec3 gl_VertexTriangleIndex; // indices of the three control
 *                                       // points for the vertex
 *         vec3 gl_BarycentricCoord;     // barycentric coordinates
 *                                       // of the vertex
 * 
 *     i o
 *       |\
 *       | \
 *       *--*
 *       |\ |\
 *       | \| \
 *       *--*--*
 *       |\ |\ |\
 *       | \| \| \
 *     j o--*--*--o k
 * 
 *     Figure 1  A Tessellated Triangle
 *     o = control point (and tessellated vertex)
 *     * = tessellated vertex
 * 
 *         ivec4 gl_VertexQuadIndex;   // indices for the four control
 *                                     // points for the vertex
 *         vec2 gl_UVCoord;            // UV coordinates of the vertex
 * 
 *     i o--*--*--o k
 *       |\ |\ |\ |
 *       | \| \| \|
 *       *--*--*--*
 *       |\ |\ |\ |
 *       | \| \| \|
 *       *--*--*--*
 *       |\ |\ |\ |
 *       | \| \| \|
 *     j o--*--*--o l
 * 
 *     Figure 2  A Tessellated Quad
 *     o = control point (and tessellated vertex)
 *     * = tessellated vertex</code></pre>
 * 
 * <p>When this extension is enabled, conventional built-in attributes and user defined attributes are uninitialized. The shader writer is responsible for
 * explicitly fetching all other vertex data either from textures, uniform buffers, or vertex buffers.</p>
 * 
 * <p>The shader writer is further responsible for interpolating the vertex data at the given barycentric coordinates or uv coordinates of the vertex.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class AMDVertexShaderTessellator {

    static { GL.initialize(); }

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_BUFFER_AMD              = 0x9001,
        GL_INT_SAMPLER_BUFFER_AMD          = 0x9002,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;

    /** Accepted by TessellationModeAMD. */
    public static final int
        GL_DISCRETE_AMD   = 0x9006,
        GL_CONTINUOUS_AMD = 0x9007;

    /** Accepted by GetIntegerv. */
    public static final int GL_TESSELLATION_MODE_AMD = 0x9004;

    /** Accepted by GetFloatv. */
    public static final int GL_TESSELLATION_FACTOR_AMD = 0x9005;

    protected AMDVertexShaderTessellator() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTessellationFactorAMD ] ---

    public static native void glTessellationFactorAMD(@NativeType("GLfloat") float factor);

    // --- [ glTessellationModeAMD ] ---

    public static native void glTessellationModeAMD(@NativeType("GLenum") int mode);

}