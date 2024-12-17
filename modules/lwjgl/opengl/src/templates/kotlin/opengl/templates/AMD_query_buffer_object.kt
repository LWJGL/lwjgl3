/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_query_buffer_object = "AMDQueryBufferObject".nativeClassGL("AMD_query_buffer_object", postfix = AMD) {
    IntConstant(
        "QUERY_RESULT_NO_WAIT_AMD"..0x9194
    )

    IntConstant(
        "QUERY_BUFFER_AMD"..0x9192
    )

    IntConstant(
        "QUERY_BUFFER_BINDING_AMD"..0x9193
    )
}