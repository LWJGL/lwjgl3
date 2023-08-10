/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_vertex_array_range2.txt">NV_vertex_array_range2</a> extension.
 * 
 * <p>Enabling and disabling the vertex array range is specified by the original NV_vertex_array_range extension specification to flush the vertex array
 * range implicitly. In retrospect, this semantic is extremely misconceived and creates terrible performance problems for any application that wishes to
 * mix conventional vertex arrays with vertex arrange range-enabled vertex arrays.</p>
 * 
 * <p>This extension provides a new token for enabling/disabling the vertex array range that does NOT perform an implicit vertex array range flush when the
 * enable/disable is performed.</p>
 * 
 * <p>Requires {@link NVVertexArrayRange NV_vertex_array_range}.</p>
 */
public final class NVVertexArrayRange2 {

    /** Accepted by the {@code cap} parameter of EnableClientState, DisableClientState. */
    public static final int GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV = 0x8533;

    private NVVertexArrayRange2() {}

}