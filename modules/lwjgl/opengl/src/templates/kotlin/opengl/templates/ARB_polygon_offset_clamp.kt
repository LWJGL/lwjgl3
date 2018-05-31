/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_polygon_offset_clamp = "ARBPolygonOffsetClamp".nativeClassGL("ARB_polygon_offset_clamp", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new parameter to the polygon offset function that clamps the calculated offset to a minimum or maximum value. The clamping
        functionality is useful when polygons are nearly parallel to the view direction because their high slopes can result in arbitrarily large polygon
        offsets. In the particular case of shadow mapping, the lack of clamping can produce the appearance of unwanted holes when the shadow casting polygons
        are offset beyond the shadow receiving polygons, and this problem can be alleviated by enforcing a maximum offset value.

        Requires ${GL33.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "POLYGON_OFFSET_CLAMP"..0x8E1B
    )

    GL46C reuse "PolygonOffsetClamp"
}