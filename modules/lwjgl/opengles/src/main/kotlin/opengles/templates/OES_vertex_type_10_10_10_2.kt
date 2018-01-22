/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_vertex_type_10_10_10_2 = "OESVertexType1010102".nativeClassGLES("OES_vertex_type_10_10_10_2", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds the following data formats:

        Two new vertex attribute data formats: a signed 10.10.10.2 and an unsigned 10.10.10.2 vertex data format. These vertex data formats describe a 3- or
        4-tuple stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex attributes can
        often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of VertexAttribPointer.",

        "UNSIGNED_INT_10_10_10_2_OES"..0x8DF6,
        "INT_10_10_10_2_OES"..0x8DF7
    )
}