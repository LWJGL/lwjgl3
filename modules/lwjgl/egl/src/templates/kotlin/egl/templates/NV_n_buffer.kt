/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_triple_buffer = "NVTripleBuffer".nativeClassEGL("NV_triple_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Allows applications to request additional back buffers, in order to produce greater and less variable frame rates.
        """

    IntConstant(
        "Accepted as a value for #RENDER_BUFFER in the {@code attrib_list} parameter of #CreateWindowSurface().",

        "TRIPLE_BUFFER_NV"..0x3230
    )
}

val NV_quadruple_buffer = "NVQuadrupleBuffer".nativeClassEGL("NV_quadruple_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Allows applications to request additional back buffers, in order to produce greater and less variable frame rates.

        Requires ${NV_triple_buffer.link}.
        """

    IntConstant(
        "Accepted as a value for #RENDER_BUFFER in the {@code attrib_list} parameter of #CreateWindowSurface().",

        "QUADRUPLE_BUFFER_NV"..0x3231
    )
}