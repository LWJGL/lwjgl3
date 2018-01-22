/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_depth_clamp_separate = "AMDDepthClampSeparate".nativeClassGL("AMD_depth_clamp_separate", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The extension ${ARB_depth_clamp.link} introduced the ability to control the clamping of the depth value for both the near and far plane. One limitation
        is that the control was for both planes at the same time; some applications can benefit from having clamping enabled for only one of the two planes, in
        order to save fillrate for the other plane by clipping the geometry.

        This extension provides exactly such functionality.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "DEPTH_CLAMP_NEAR_AMD"..0x901E,
        "DEPTH_CLAMP_FAR_AMD"..0x901F
    )
}