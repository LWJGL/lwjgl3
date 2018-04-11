/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_occlusion_query2 = "ARBOcclusionQuery2".nativeClassGL("ARB_occlusion_query2") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension trivially adds a boolean occlusion query to ${ARB_occlusion_query.link}.

        While the counter-based occlusion query provided by ARB_occlusion_query is flexible, there is still value to a simple boolean, which is often sufficient
        for applications.

        ${GL33.promoted}
        """

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "ANY_SAMPLES_PASSED"..0x8C2F
    )
}