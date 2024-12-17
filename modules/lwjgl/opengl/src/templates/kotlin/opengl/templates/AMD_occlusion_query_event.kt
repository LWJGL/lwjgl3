/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_occlusion_query_event = "AMDOcclusionQueryEvent".nativeClassGL("AMD_occlusion_query_event", postfix = AMD) {
    IntConstant(
        "OCCLUSION_QUERY_EVENT_MASK_AMD"..0x874F
    )

    IntConstant(
        "QUERY_DEPTH_PASS_EVENT_BIT_AMD"..0x00000001,
        "QUERY_DEPTH_FAIL_EVENT_BIT_AMD"..0x00000002,
        "QUERY_STENCIL_FAIL_EVENT_BIT_AMD"..0x00000004,
        "QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD"..0x00000008,
        "QUERY_ALL_EVENT_BITS_AMD".."0xFFFFFFFF"
    )

    void(
        "QueryObjectParameteruiAMD",

        GLenum("target"),
        GLuint("id"),
        GLenum("pname"),
        GLuint("param")
    )
}