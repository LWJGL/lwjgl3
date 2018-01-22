/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val INTEL_conservative_rasterization = "INTELConservativeRasterization".nativeClassGL("INTEL_conservative_rasterization", postfix = INTEL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Regular rasterization includes fragments with at least one sample covered by a polygon. Conservative rasterization includes all fragments that are at
        least partially covered by the polygon.

        In some use cases, it is also important to know if a fragment is fully covered by a polygon, i.e. if all parts of the fragment are within the polygon.
        An application may, for example, want to process fully covered fragments different from the "edge" pixels. This extension adds an option for the
        fragment shader to receive this information via {@code gl_SampleMaskIn[]}.

        This extension affects only polygons in #FILL mode and specifically does not imply any changes in processing of lines or points.

        Conservative rasterization automatically disables polygon antialiasing rasterization if enabled by #POLYGON_SMOOTH.

        Requires ${GL42.core}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of GL11#glEnable(), GL11#glDisable(), GL11#glIsEnabled().",

        "CONSERVATIVE_RASTERIZATION_INTEL"..0x83FE
    )
}