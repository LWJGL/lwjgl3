/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_sample_shading = "OESSampleShading".nativeClassGLES("OES_sample_shading", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In standard multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample. This can cause
        aliasing where the fragment shader input values are used to generate a result that doesn't antialias itself, for example with alpha-tested
        transparency.

        This extension adds the ability to explicitly request that an implementation use a minimum number of unique set of fragment computation inputs when
        multisampling a pixel. Specifying such a requirement can reduce aliasing that results from evaluating the fragment computations too few times per
        pixel.

        This extension adds new global state that controls the minimum number of samples for which attribute data is independently interpolated. When enabled,
        all fragment-shading operations are executed independently on each sample.

        Requires ${GLES30.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetInteger64v.
        """,

        "SAMPLE_SHADING_OES"..0x8C36
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv.",

        "MIN_SAMPLE_SHADING_VALUE_OES"..0x8C37
    )

    void(
        "MinSampleShadingOES",
        "",

        GLfloat.IN("value", "")
    )
}