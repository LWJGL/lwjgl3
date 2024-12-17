/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_vertex_array_range2 = "NVVertexArrayRange2".nativeClassGL("NV_vertex_array_range2", postfix = NV) {
    IntConstant(
        "VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV"..0x8533
    )
}