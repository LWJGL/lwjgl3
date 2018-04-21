/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fog_distance.txt">NV_fog_distance</a> extension.
 * 
 * <p>Ideally, the fog distance (used to compute the fog factor as described in Section 3.10) should be computed as the per-fragment Euclidean distance to
 * the fragment center from the eye. In practice, implementations "may choose to approximate the eye-coordinate distance from the eye to each fragment
 * center by abs(ze). Further, [the fog factor] f need not be computed at each fragment, but may be computed at each vertex and interpolated as other data
 * are."</p>
 * 
 * <p>This extension provides the application specific control over how OpenGL computes the distance used in computing the fog factor.</p>
 * 
 * <p>The extension supports three fog distance modes: "eye plane absolute", where the fog distance is the absolute planar distance from the eye plane (i.e.,
 * OpenGL's standard implementation allowance as cited above); "eye plane", where the fog distance is the signed planar distance from the eye plane; and
 * "eye radial", where the fog distance is computed as a Euclidean distance. In the case of the eye radial fog distance mode, the distance may be computed
 * per-vertex and then interpolated per-fragment.</p>
 * 
 * <p>The intent of this extension is to provide applications with better control over the tradeoff between performance and fog quality. The "eye planar"
 * modes (signed or absolute) are straightforward to implement with good performance, but scenes are consistently under-fogged at the edges of the field
 * of view. The "eye radial" mode can provide for more accurate fog at the edges of the field of view, but this assumes that either the eye radial fog
 * distance is computed per-fragment, or if the fog distance is computed per-vertex and then interpolated per-fragment, then the scene must be
 * sufficiently tessellated.</p>
 */
public final class NVFogDistance {

    /** Accepted by the {@code pname} parameters of Fogf, Fogi, Fogfv, Fogiv, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_FOG_DISTANCE_MODE_NV = 0x855A;

    /**
     * When the {@code pname} parameter of Fogf, Fogi, Foggv, and Fogiv, is FOG_DISTANCE_MODE_NV, then the value of {@code param} or the value pointed to by
     * {@code params} may be.
     */
    public static final int
        GL_EYE_RADIAL_NV         = 0x855B,
        GL_EYE_PLANE_ABSOLUTE_NV = 0x855C;

    private NVFogDistance() {}

}