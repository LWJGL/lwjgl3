/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_shader_multisample_interpolation = "OESShaderMultisampleInterpolation".nativeClassGLES("OES_shader_multisample_interpolation", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In standard multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample. This can cause
        aliasing where the fragment shader input values are used to generate a result that doesn't antialias itself, for example with alpha-tested
        transparency.

        This extension adds the "sample" qualifier that can be used on vertex outputs and fragment inputs. When the "sample" qualifier is used, the fragment
        shader is invoked separately for each covered sample and all such qualified interpolants must be evaluated at the corresponding sample point.

        This extension provides built-in fragment shader functions to provide fine-grained control over interpolation, including interpolating a fragment
        shader input at a programmable offset relative to the pixel center, a specific sample number, or at the centroid.

        Requires ${GLES30.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v.",

        "MIN_FRAGMENT_INTERPOLATION_OFFSET_OES"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET_OES"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS_OES"..0x8E5D
    )
}