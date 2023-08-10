/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_provoking_vertex.txt">ARB_provoking_vertex</a> extension.
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
 * <p>Alternatively the provoking vertex could be the first vertex of the primitive. Other APIs with flat-shading functionality such as Reality Lab and
 * Direct3D have adopted the "first vertex of the primitive" convention to determine the provoking vertex. However, these APIs lack quads so do not have a
 * defined provoking vertex convention for quads.</p>
 * 
 * <p>The motivation for this extension is to allow applications developed for APIs with a "first vertex of the primitive" provoking vertex to be easily
 * converted to OpenGL.</p>
 * 
 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public class ARBProvokingVertex {

    static { GL.initialize(); }

    /** Accepted by the {@code mode} parameter of ProvokingVertex. */
    public static final int
        GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION  = 0x8E4E;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_PROVOKING_VERTEX                         = 0x8E4F,
        GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;

    protected ARBProvokingVertex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProvokingVertex ] ---

    /**
     * Specifies the vertex to be used as the source of data for flat shaded varyings.
     *
     * @param mode the provoking vertex mode. One of:<br><table><tr><td>{@link GL32C#GL_FIRST_VERTEX_CONVENTION FIRST_VERTEX_CONVENTION}</td><td>{@link GL32C#GL_LAST_VERTEX_CONVENTION LAST_VERTEX_CONVENTION}</td></tr></table>
     */
    public static void glProvokingVertex(@NativeType("GLenum") int mode) {
        GL32C.glProvokingVertex(mode);
    }

}