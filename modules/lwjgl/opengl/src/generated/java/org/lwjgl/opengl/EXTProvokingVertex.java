/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_provoking_vertex.txt">EXT_provoking_vertex</a> extension.
 * 
 * <p>This extension provides an alternative provoking vertex convention for rendering lines, triangles, and (optionally depending on the implementation)
 * quads.</p>
 * 
 * <p>The provoking vertex of a primitive is the vertex that determines the constant primary and secondary colors when flat shading is enabled.</p>
 * 
 * <p>In OpenGL, the provoking vertex for triangle, quad, line, and (trivially) point primitives is the last vertex used to assemble the primitive. The
 * polygon primitive is an exception in OpenGL where the first vertex of a polygon primitive determines the color of the polygon, even if actually broken
 * into triangles and/or quads.</p>
 * 
 * <p>See section 2.14.7 (Flatshading) of the OpenGL 2.1 specification, particularly Table 2.12 for more details.</p>
 * 
 * <p>Alternatively the provoking vertex could be the first vertex of the primitive. Other APIs with flat-shading functionality such as Reality Lab and
 * Direct3D have adopted the "first vertex of the primitive" convention to determine the provoking vertex. However, these APIs lack quads so do not have a
 * defined provoking vertex convention for quads.</p>
 * 
 * <p>The motivation for this extension is to allow applications developed for APIs with a "first vertex of the primitive" provoking vertex to be easily
 * converted to OpenGL.</p>
 */
public class EXTProvokingVertex {

    static { GL.initialize(); }

    /** Accepted by the {@code mode} parameter of ProvokingVertexEXT. */
    public static final int
        GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION_EXT  = 0x8E4E;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_PROVOKING_VERTEX_EXT                         = 0x8E4F,
        GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;

    protected EXTProvokingVertex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProvokingVertexEXT ] ---

    public static native void glProvokingVertexEXT(@NativeType("GLenum") int mode);

}