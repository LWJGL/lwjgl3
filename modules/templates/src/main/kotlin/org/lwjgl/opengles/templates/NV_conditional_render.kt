/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_conditional_render = "NVConditionalRender".nativeClassGLES("NV_conditional_render", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "conditional_render")} extension.

        This extension provides support for conditional rendering based on the results of an occlusion query. This mechanism allows an application to
        potentially reduce the latency between the completion of an occlusion query and the rendering commands depending on its result. It additionally allows
        the decision of whether to render to be made without application intervention.

        This extension defines two new functions, BeginConditionalRenderNV and EndConditionalRenderNV, between which rendering commands may be discarded based
        on the results of an occlusion query. If the specified occlusion query returns a non-zero value, rendering commands between these calls are executed.
        If the occlusion query returns a value of zero, all rendering commands between the calls are discarded.

        If the occlusion query results are not available when BeginConditionalRenderNV is executed, the {@code mode} parameter specifies whether the GL should
        wait for the query to complete or should simply render the subsequent geometry unconditionally.

        Additionally, the extension provides a set of "by region" modes, allowing for implementations that divide rendering work by screen regions to perform
        the conditional query test on a region-by-region basis without checking the query results from other regions. Such a mode is useful for cases like
        split-frame SLI, where a frame is divided between multiple GPUs, each of which has its own occlusion query hardware.

        Requires ${GLES30.core} or ${EXT_occlusion_query_boolean.link}.
        """

    IntConstant(
        "Accepted by the {@code mode} parameter of BeginConditionalRenderNV.",

        "QUERY_WAIT_NV"..0x8E13,
        "QUERY_NO_WAIT_NV"..0x8E14,
        "QUERY_BY_REGION_WAIT_NV"..0x8E15,
        "QUERY_BY_REGION_NO_WAIT_NV"..0x8E16
    )

    void(
        "BeginConditionalRenderNV",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("mode", "")
    )

    void(
        "EndConditionalRenderNV",
        ""
    )
}