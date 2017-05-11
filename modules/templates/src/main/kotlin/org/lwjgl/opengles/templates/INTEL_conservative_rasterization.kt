/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val INTEL_conservative_rasterization = "INTELConservativeRasterization".nativeClassGLES("INTEL_conservative_rasterization", postfix = INTEL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Regular rasterization includes fragments with at least one sample covered by a polygon. Conservative rasterization includes all fragments that are at
        least partially covered by the polygon.

        In some use cases, it is also important to know if a fragment is fully covered by a polygon, i.e. if all parts of the fragment are within the polygon.
        An application may, for example, want to process fully covered fragments different from the "edge" pixels. This extension adds an option for the
        fragment shader to receive this information via {@code gl_SampleMaskIn[]}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of #Enable(), #Disable(), #IsEnabled().",

        "CONSERVATIVE_RASTERIZATION_INTEL"..0x83FE
    )
}