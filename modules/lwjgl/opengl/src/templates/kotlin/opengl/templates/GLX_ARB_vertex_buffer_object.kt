/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_vertex_buffer_object = "GLXARBVertexBufferObject".nativeClassGLX("GLX_ARB_vertex_buffer_object", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("ARB_vertex_buffer_object")} extension.

        It is the client's responsibility to convert buffer data to and from the server's byte order. Since only the client knows the correct format of the
        data, and there may be multiple clients with different byte orderings sharing a single buffer object, it is unreasonable to ask the GL to handle buffer
        object byte-swapping. To avoid errors caused by naive clients attempting to use buffer objects without performing the appropriate byte swapping, clients
        must opt in to buffer object support at context creation time using the #CONTEXT_ALLOW_BUFFER_BYTE_ORDER_MISMATCH_ARB context attrib. If this attribute
        is not specified and the byte ordering of the client and server differ, the VBO extension must not be exposed and the maximum context version that can
        be reported is 1.4.

        Requires ${GLX_ARB_create_context.link} and ${ARB_vertex_buffer_object.link}.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} parameter of GLXARBCreateContext#glXCreateContextAttribsARB().",

        "CONTEXT_ALLOW_BUFFER_BYTE_ORDER_MISMATCH_ARB"..0x2095
    )
}