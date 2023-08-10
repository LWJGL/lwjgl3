/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_cull_distance.txt">ARB_cull_distance</a> extension.
 * 
 * <p>This extension adds a new GLSL {@code gl_CullDistance} shader output, similar to {@code gl_ClipDistance}, but used for whole primitive culling.</p>
 * 
 * <p>This new stage in the pipeline is added as part of the primitive clipping stage.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public final class ARBCullDistance {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
    public static final int
        GL_MAX_CULL_DISTANCES                   = 0x82F9,
        GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;

    private ARBCullDistance() {}

}