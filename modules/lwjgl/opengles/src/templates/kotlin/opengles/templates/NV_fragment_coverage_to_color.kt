/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_fragment_coverage_to_color = "NVFragmentCoverageToColor".nativeClassGLES("NV_fragment_coverage_to_color", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows the fragment coverage value, represented as an integer bitfield, to be substituted for a color output being written to a
        single-component color buffer with integer components (e.g., R8UI). The capability provided by this extension is different from simply writing the
        gl_SampleMask fragment shader output in that the coverage value written to the framebuffer is taken after alpha test, stencil test, and depth test, as
        well as after the multisample fragment operations such as alpha-to-coverage.

        This functionality may be useful for deferred rendering algorithms, where the second pass needs to know which samples belong to which original
        fragments.
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled.",

        "FRAGMENT_COVERAGE_TO_COLOR_NV"..0x92DD
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "FRAGMENT_COVERAGE_COLOR_NV"..0x92DE
    )

    void(
        "FragmentCoverageColorNV",
        "",

        GLuint("color", "")
    )
}