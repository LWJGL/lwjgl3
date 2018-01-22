/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_fog_distance = "NVFogDistance".nativeClassGL("NV_fog_distance", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Ideally, the fog distance (used to compute the fog factor as described in Section 3.10) should be computed as the per-fragment Euclidean distance to
        the fragment center from the eye. In practice, implementations "may choose to approximate the eye-coordinate distance from the eye to each fragment
        center by abs(ze). Further, [the fog factor] f need not be computed at each fragment, but may be computed at each vertex and interpolated as other data
        are."

        This extension provides the application specific control over how OpenGL computes the distance used in computing the fog factor.

        The extension supports three fog distance modes: "eye plane absolute", where the fog distance is the absolute planar distance from the eye plane (i.e.,
        OpenGL's standard implementation allowance as cited above); "eye plane", where the fog distance is the signed planar distance from the eye plane; and
        "eye radial", where the fog distance is computed as a Euclidean distance. In the case of the eye radial fog distance mode, the distance may be computed
        per-vertex and then interpolated per-fragment.

        The intent of this extension is to provide applications with better control over the tradeoff between performance and fog quality. The "eye planar"
        modes (signed or absolute) are straightforward to implement with good performance, but scenes are consistently under-fogged at the edges of the field
        of view. The "eye radial" mode can provide for more accurate fog at the edges of the field of view, but this assumes that either the eye radial fog
        distance is computed per-fragment, or if the fog distance is computed per-vertex and then interpolated per-fragment, then the scene must be
        sufficiently tessellated.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of Fogf, Fogi, Fogfv, Fogiv, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FOG_DISTANCE_MODE_NV"..0x855A
    )

    IntConstant(
        """
        When the {@code pname} parameter of Fogf, Fogi, Foggv, and Fogiv, is FOG_DISTANCE_MODE_NV, then the value of {@code param} or the value pointed to by
        {@code params} may be.
        """,

        "EYE_RADIAL_NV"..0x855B,
        "EYE_PLANE_ABSOLUTE_NV"..0x855C
    )
}