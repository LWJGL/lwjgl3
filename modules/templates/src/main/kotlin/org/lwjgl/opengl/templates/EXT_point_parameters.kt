/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_point_parameters = "EXTPointParameters".nativeClassGL("EXT_point_parameters", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred as
        "Light points".

        The raster brightness of a point is a function of the point area, point color, point transparency, and the response of the display's electron gun and
        phosphor. The point area and the point transparency are derived from the point size, currently provided with the {@code size} parameter of
        #PointSize().

        The primary motivation is to allow the size of a point to be affected by distance attenuation. When distance attenuation has an effect, the final point
        size decreases as the distance of the point from the eye increases.

        The secondary motivation is a mean to control the mapping from the point size to the raster point area and point transparency. This is done in order to
        increase the dynamic range of the raster brightness of points. In other words, the alpha component of a point may be decreased (and its transparency
        increased) as its area shrinks below a defined threshold.

        This extension defines a derived point size to be closely related to point brightness. The brightness of a point is given by:
        ${codeBlock("""
                        1
dist_atten(d) = -------------------
                a + b * d + c * d^2

brightness(Pe) = Brightness * dist_atten(|Pe|)""")}
        where 'Pe' is the point in eye coordinates, and 'Brightness' is some initial value proportional to the square of the size provided with glPointSize.
        Here we simplify the raster brightness to be a function of the rasterized point area and point transparency.
        ${codeBlock("""
            brightness(Pe)      brightness(Pe) >= Threshold_Area
area(Pe) =
            Threshold_Area      Otherwise

factor(Pe) = brightness(Pe)/Threshold_Area

alpha(Pe) = Alpha * factor(Pe)""")}
        where 'Alpha' comes with the point color (possibly modified by lighting).

        'Threshold_Area' above is in area units. Thus, it is proportional to the square of the threshold provided by the programmer through this extension.

        The new point size derivation method applies to all points, while the threshold applies to multisample points only.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of glPointParameterfvEXT, and the {@code pname} of glGet.",

        "POINT_SIZE_MIN_EXT"..0x8126,
        "POINT_SIZE_MAX_EXT"..0x8127,
        "POINT_FADE_THRESHOLD_SIZE_EXT"..0x8128,
        "DISTANCE_ATTENUATION_EXT"..0x8129
    )

    void(
        "PointParameterfEXT",
        "",

        GLenum.IN("pname", ""),
        GLfloat.IN("param", "")
    )

    void(
        "PointParameterfvEXT",
        "",

        GLenum.IN("pname", ""),
        Check(1)..const..GLfloat_p.IN("params", "")
    )
}