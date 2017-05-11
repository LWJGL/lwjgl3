/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_coverage_sample_resolve = "NVCoverageSampleResolve".nativeClassEGL("NV_coverage_sample_resolve", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        NV_coverage_sample introduced a method to improve rendering quality using a separate buffer to store coverage information for pixels in the color
        buffers. It also provided a mechanism to disable writing to the coverage buffer when coverage sample filtering was not needed or undesirable. However,
        it did not provide a way to disable reading data from the coverage buffer at resolve time. In some cases performance can be improved by eliminating
        these memory reads. To that end, this extension exposes a surface attribute that allows applications to specify when no coverage sample resolve is
        desired.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "",

        "COVERAGE_SAMPLE_RESOLVE_NV"..0x3131,
        "COVERAGE_SAMPLE_RESOLVE_DEFAULT_NV"..0x3132,
        "COVERAGE_SAMPLE_RESOLVE_NONE_NV"..0x3133
    )
}