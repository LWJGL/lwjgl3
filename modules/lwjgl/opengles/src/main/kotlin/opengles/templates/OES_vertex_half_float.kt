/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_vertex_half_float = "OESVertexHalfFloat".nativeClassGLES("OES_vertex_half_float", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a 16-bit floating pt data type (aka half float) to vertex data specified using vertex arrays. The 16-bit floating-point components
        have 1 sign bit, 5 exponent bits, and 10 mantissa bits.

        The half float data type can be very useful in specifying vertex attribute data such as color, normals, texture coordinates etc. By using half floats
        instead of floats, we reduce the memory requirements by half. Not only does the memory footprint reduce by half, but the memory bandwidth required for
        vertex transformations also reduces by the same amount approximately. Another advantage of using half floats over short/byte data types is that we do
        not needto scale the data. For example, using SHORT for texture coordinates implies that we need to scale the input texture coordinates in the shader
        or set an appropriate scale matrix as the texture matrix for fixed function pipeline. Doing these additional scaling operations impacts vertex
        transformation performance.
        """

    IntConstant(
        """
        Accepted by the {@code type} parameter of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, IndexPointer, FogCoordPointer,
        TexCoordPointer, and VertexAttribPointer.
        """,

        "HALF_FLOAT_OES"..0x8D61
    )
}