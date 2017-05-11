/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_multisample_filter_hint = "NVMultisampleFilterHint".nativeClassGL("NV_multisample_filter_hint", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL multisampling typically assumes that the samples of a given pixel are weighted uniformly and averaged to compute the pixel's resolved color.
        This extension provides a hint that permits implementations to provide an alternative method of resolving the color of multisampled pixels.

        As an example of such an alternative method, NVIDIA's GeForce3 GPU provides a technique known as Quincunx filtering. This technique is used in
        two-sample multisampling, but it blends the pixel's two samples and three additional samples from adjacent pixels. The sample pattern is analogous to
        the 5 pattern on a die. The quality of this technique is widely regarded as comparable to 4 sample multisampling.

        Requires ${ARB_multisample.link}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of Hint and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MULTISAMPLE_FILTER_HINT_NV"..0x8534
    )
}