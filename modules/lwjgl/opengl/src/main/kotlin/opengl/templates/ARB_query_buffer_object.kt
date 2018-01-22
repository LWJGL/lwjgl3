/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_query_buffer_object = "ARBQueryBufferObject".nativeClassGL("ARB_query_buffer_object") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Statistics about the operation of the OpenGL pipeline, such as the number of samples that passed the depth test, the elapsed time between two events or
        the number of vertices written by transform feedback can be retrieved from the GL through query objects. The result of a query object is acquired by the
        application through the OpenGL API into a client provided memory location. Should the result returned by the API be required for use in a shader, it
        must be passed back to the GL via a program uniform or some other mechanism. This requires a round-trip from the GPU to the CPU and back.

        This extension introduces a mechanism whereby the result of a query object may be retrieved into a buffer object instead of client memory. This allows
        the query rsult to be made available to a shader without a round-trip to the CPU for example by subsequently using the buffer object as a uniform
        buffer, texture buffer or other data store visible to the shader. This functionality may also be used to place the results of many query objects into a
        single, large buffer and then map or otherwise read back the entire buffer at a later point in time, avoiding a per-query object CPU-GPU synchronization
        event.

        The extension allows acquiring the result of any query object type supported by the GL implementation into a buffer object. The implementation will
        determine the most efficient method of copying the query result to the buffer.

        Requires ${GL15.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetQueryObjectiv(), #GetQueryObjectuiv(), #GetQueryObjecti64v() and #GetQueryObjectui64v().",

        "QUERY_RESULT_NO_WAIT"..0x9194
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of #BindBuffer(), #BufferData(), #BufferSubData(), #MapBuffer(), #UnmapBuffer(), #MapBufferRange(),
        #GetBufferSubData(), #GetBufferParameteriv(), #GetBufferParameteri64v(), #GetBufferPointerv(), #ClearBufferSubData(), and the {@code readtarget} and
        {@code writetarget} parameters of #CopyBufferSubData().
        """,

        "QUERY_BUFFER"..0x9192
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv(), #GetFloatv(), and #GetDoublev().",

        "QUERY_BUFFER_BINDING"..0x9193
    )

    IntConstant(
        "Accepted in the {@code barriers} bitfield in #MemoryBarrier().",

        "QUERY_BUFFER_BARRIER_BIT"..0x00008000
    )

}