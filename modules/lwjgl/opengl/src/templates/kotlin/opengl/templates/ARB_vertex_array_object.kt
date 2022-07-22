/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_array_object = "ARBVertexArrayObject".nativeClassGL("ARB_vertex_array_object") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces named vertex array objects which encapsulate vertex array state on the client side. These objects allow applications to
        rapidly switch between large sets of array state. In addition, layered libraries can return to the default array state by simply creating and binding a
        new vertex array object.

        This extension differs from GL_APPLE_vertex_array_object in that client memory cannot be accessed through a non-zero vertex array object. It also
        differs in that vertex array objects are explicitly not sharable between contexts.

        ${GL30.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "VERTEX_ARRAY_BINDING"..0x85B5
    )

    reuse(GL30C, "BindVertexArray")
    reuse(GL30C, "DeleteVertexArrays")
    reuse(GL30C, "GenVertexArrays")
    reuse(GL30C, "IsVertexArray")
}