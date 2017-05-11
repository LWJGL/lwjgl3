/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_occlusion_query_event = "AMDOcclusionQueryEvent".nativeClassGL("AMD_occlusion_query_event", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the concept of occlusion query events and changes the concept of an occlusion query from counting passed fragments to counting
        fragments that generate any of a user-selectable set of events. Provided events include passing the depth test, and passing or failing the stencil test.
        For a given occlusion query object, counting of these events may be enabled or disabled, allowing any combination to be counted.

        Requires ${GL15.core}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} argument to #QueryObjectParameteruiAMD(), #GetQueryObjectiv(), #GetQueryObjectuiv(),
        #GetQueryObjecti64v(), and #GetQueryObjectui64v().
        """,

        "OCCLUSION_QUERY_EVENT_MASK_AMD"..0x874F
    )

    val params = IntConstant(
        "Accepted by the {@code param} argument to #QueryObjectParameteruiAMD().",

        "QUERY_DEPTH_PASS_EVENT_BIT_AMD"..0x00000001,
        "QUERY_DEPTH_FAIL_EVENT_BIT_AMD"..0x00000002,
        "QUERY_STENCIL_FAIL_EVENT_BIT_AMD"..0x00000004,
        "QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD"..0x00000008,
        "QUERY_ALL_EVENT_BITS_AMD".."0xFFFFFFFF"
    ).javaDocLinks

    void(
        "QueryObjectParameteruiAMD",
        "Changes the value of a query object parameter.",

        GLenum.IN("target", "a valid query target", QUERY_TARGETS),
        GLuint.IN("id", "a value returned from a previous call to #GenQueries()"),
        GLenum.IN("pname", "the parameter to modify", "#OCCLUSION_QUERY_EVENT_MASK_AMD"),
        GLuint.IN("param", "the new value", params)
    )
}