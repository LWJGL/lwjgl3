/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_query_buffer_object = "AMDQueryBufferObject".nativeClassGL("AMD_query_buffer_object", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Statistics about the operation of the OpenGL pipeline, such as the number of samples that passed the depth test, the elapsed time between two events or
        the number of vertices written to a transform feedback buffer may be retrieved from the GL through query objects. The current value of a query object
        may be retrieved by the application through the OpenGL API. Should the result returned by the API be required for use in a shader, it must be passed
        back to the GL via a program uniform or some other mechanism. This requires a round-trip from the GPU to the CPU and back.

        This extension introduces a mechanism whereby the current value of a query result may be retrieved into a buffer object instead of client memory. This
        allows the query result to be made available to a shader without a round-trip to the CPU for example by subsequently using the buffer object as a
        uniform buffer, texture buffer or other data store visible to the shader. This functionality may also be used to place the results of many query
        objects into a single, large buffer and then map or otherwise read back the entire buffer at a later point in time, avoiding a per-query CPU-GPU
        synchronization event.

        The result of any query object type supported by the GL implementation may be retrieved into a buffer object. The implementation will determine the
        most efficient method of copying the query result to the buffer.

        Requires ${GL15.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectiv, GetQueryObjectuiv, GetQueryObjecti64v and GetQueryObjectui64v.",

        "QUERY_RESULT_NO_WAIT_AMD"..0x9194
    )

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, MapBufferRange, GetBufferSubData,
        GetBufferParameteriv and GetBufferPointerv.
        """,

        "QUERY_BUFFER_AMD"..0x9192
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "QUERY_BUFFER_BINDING_AMD"..0x9193
    )
}