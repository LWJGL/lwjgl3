/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_instanced_arrays = "NVInstancedArrays".nativeClassGLES("NV_instanced_arrays", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
        count and type, multiple times. This extension provides a means of accelerating such use cases while limiting the number of required API calls, and
        keeping the amount of duplicate data to a minimum.

        In particular, this extension specifies an alternative to the read-only shader variable introduced by NV_draw_instanced. It uses the same draw calls
        introduced by that extension, but redefines them so that a vertex shader can instead use vertex array attributes as a source of instance data.

        This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced." An
        instanced attribute does not advance per-vertex as usual, but rather after every {@code divisor} conceptual draw calls.

        (Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)

        By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw
        calls, draw multiple instances of an object with one draw call.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetVertexAttribfv, and GetVertexAttribiv.",

        "VERTEX_ATTRIB_ARRAY_DIVISOR_NV"..0x88FE
    )

    void(
        "VertexAttribDivisorNV",
        "",

        GLuint.IN("index", ""),
        GLuint.IN("divisor", "")
    )
}