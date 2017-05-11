/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_vertex_array_range2 = "NVVertexArrayRange2".nativeClassGL("NV_vertex_array_range2", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Enabling and disabling the vertex array range is specified by the original NV_vertex_array_range extension specification to flush the vertex array
        range implicitly. In retrospect, this semantic is extremely misconceived and creates terrible performance problems for any application that wishes to
        mix conventional vertex arrays with vertex arrange range-enabled vertex arrays.

        This extension provides a new token for enabling/disabling the vertex array range that does NOT perform an implicit vertex array range flush when the
        enable/disable is performed.

        Requires ${NV_vertex_array_range.link}.
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of EnableClientState, DisableClientState.",

        "VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV"..0x8533
    )
}