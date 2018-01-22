/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_3dvision_surface = "NV3dvisionSurface".nativeClassEGL("NV_3dvision_surface", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        NVIDIA 3D Vision provides stereoscopic 3d rendering without requiring applications to change their rendering methods. However there are cases where
        applications can benefit from adjusting 3D vision parameters directly to experiment with this functionality in applications not yet known to 3D Vision,
        to assist 3D Vision in setting parameters correctly for unusual situations, or to present application-specific user-accessible controls for 3D Vision
        parameters.

        This extension provides the ability to explicitly create a surface with 3D Vision support regardless of application detection.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "AUTO_STEREO_NV"..0x3136
    )
}