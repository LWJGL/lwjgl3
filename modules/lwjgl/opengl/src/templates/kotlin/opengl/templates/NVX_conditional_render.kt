/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NVX_conditional_render = "NVXConditionalRender".nativeClassGL("NVX_conditional_render", postfix = NVX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides support for conditional rendering based on the
        results of an occlusion query.  This mechanism allows an application to
        potentially reduce the latency between the completion of an occlusion
        query and the rendering commands depending on its result.  It additionally
        allows the decision of whether to render to be made without application
        intervention.
    
        Requires ${GL15.core} or ${ARB_occlusion_query.link}
        """

    void(
        "BeginConditionalRenderNVX",
        "",

        GLuint.IN("id", "")
    )

    void(
        "EndConditionalRenderNVX",
        ""
    )
}
