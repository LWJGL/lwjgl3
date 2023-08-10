/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_path_rendering_shared_edge.txt">NV_path_rendering_shared_edge</a> extension.
 * 
 * <p>This extension introduces a new path command modifier to the NV_path_rendering extension to indicate that a path command represents an edge (either
 * straight or curved) that is shared with another path.</p>
 * 
 * <p>When used in conjunction with {@link NVFramebufferMixedSamples NV_framebuffer_mixed_samples}, a shared edge (or a whole path including shared edges) will use modified
 * rasterization rules in order to ensure that groups of raster samples associated with a given coverage sample will all produce consistent coverage
 * results, in order to avoid artifacts described further in the issues section at the end of this document.</p>
 * 
 * <p>Requires {@link NVPathRendering NV_path_rendering}.</p>
 */
public final class NVPathRenderingSharedEdge {

    /** Allowed to be added to command tokens in elements of the {@code commands} array parameter of PathCommandsNV and PathSubCommandsNV. */
    public static final int GL_SHARED_EDGE_NV = 0xC0;

    private NVPathRenderingSharedEdge() {}

}