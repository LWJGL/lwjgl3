/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_stencil_two_side = "EXTStencilTwoSide".nativeClassGL("EXT_stencil_two_side", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides two-sided stencil testing where the stencil-related state (stencil operations, reference value, compare mask, and write mask)
        may be different for front- and back-facing polygons. Two-sided stencil testing may improve the performance of stenciled shadow volume and Constructive
        Solid Geometry (CSG) rendering algorithms.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "STENCIL_TEST_TWO_SIDE_EXT"..0x8910
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "ACTIVE_STENCIL_FACE_EXT"..0x8911
    )

    void(
        "ActiveStencilFaceEXT",
        "",

        GLenum.IN("face", "")
    )
}