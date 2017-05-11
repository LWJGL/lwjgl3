/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_viewport_swizzle = "NVViewportSwizzle".nativeClassGL("NV_viewport_swizzle", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new per-viewport swizzle that can modify the position of primitives sent to each viewport. New viewport swizzle state is
        added for each viewport, and a new position vector is computed for each vertex by selecting from and optionally negating any of the four components of
        the original position vector.

        This new viewport swizzle is useful for a number of algorithms, including single-pass cubemap rendering (broadcasting a primitive to multiple faces and
        reorienting the vertex position for each face) and voxel rasterization. The per-viewport component remapping and negation provided by the swizzle
        allows application code to re-orient three-dimensional geometry with a view along any of the X, Y, or Z axes. If a perspective projection and depth
        buffering is required, 1/W buffering should be used, as described in the single-pass cubemap rendering example in the "Issues" section below.
        """

    val SwizzleStates = IntConstant(
        "Accepted by the {@code swizzlex}, {@code swizzley}, {@code swizzlez}, and {@code swizzlew} parameters of ViewportSwizzleNV.",

        "VIEWPORT_SWIZZLE_POSITIVE_X_NV"..0x9350,
        "VIEWPORT_SWIZZLE_NEGATIVE_X_NV"..0x9351,
        "VIEWPORT_SWIZZLE_POSITIVE_Y_NV"..0x9352,
        "VIEWPORT_SWIZZLE_NEGATIVE_Y_NV"..0x9353,
        "VIEWPORT_SWIZZLE_POSITIVE_Z_NV"..0x9354,
        "VIEWPORT_SWIZZLE_NEGATIVE_Z_NV"..0x9355,
        "VIEWPORT_SWIZZLE_POSITIVE_W_NV"..0x9356,
        "VIEWPORT_SWIZZLE_NEGATIVE_W_NV"..0x9357
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleani_v, GetDoublei_v, GetIntegeri_v, GetFloati_v, and GetInteger64i_v.",

        "VIEWPORT_SWIZZLE_X_NV"..0x9358,
        "VIEWPORT_SWIZZLE_Y_NV"..0x9359,
        "VIEWPORT_SWIZZLE_Z_NV"..0x935A,
        "VIEWPORT_SWIZZLE_W_NV"..0x935B
    )

    void(
        "ViewportSwizzleNV",
        "Sets the swizzle state for the specified viewport.",

        GLuint.IN("index", "the viewport index"),
        GLenum.IN("swizzlex", "the x swizzle state", SwizzleStates),
        GLenum.IN("swizzley", "the y swizzle state", SwizzleStates),
        GLenum.IN("swizzlez", "the z swizzle state", SwizzleStates),
        GLenum.IN("swizzlew", "the w swizzle state", SwizzleStates)
    )
}