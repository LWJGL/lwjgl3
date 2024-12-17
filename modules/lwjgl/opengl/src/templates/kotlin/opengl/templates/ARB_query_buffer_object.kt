/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_query_buffer_object = "ARBQueryBufferObject".nativeClassGL("ARB_query_buffer_object") {
    IntConstant(
        "QUERY_RESULT_NO_WAIT"..0x9194
    )

    IntConstant(
        "QUERY_BUFFER"..0x9192
    )

    IntConstant(
        "QUERY_BUFFER_BINDING"..0x9193
    )

    IntConstant(
        "QUERY_BUFFER_BARRIER_BIT"..0x00008000
    )

}