/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_robustness = "EXTRobustness".nativeClassGLES("EXT_robustness", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Several recent trends in how OpenGL integrates into modern computer systems have created new requirements for robustness and security for OpenGL
        rendering contexts.

        Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
        detection. OpenGL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such
        hardware faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software
        failures can be due to device changes or driver failures.

        OpenGL queries that that return (write) some number of bytes to a buffer indicated by a pointer parameter introduce risk of buffer overflows that might
        be exploitable by malware. To address this, queries with return value sizes that are not expressed directly by the parameters to the query itself are
        given additional API functions with an additional parameter that specifies the number of bytes in the buffer and never writing bytes beyond that limit.
        This is particularly useful for multi-threaded usage of OpenGL contexts in a "share group" where one context can change objects in ways that can cause
        buffer overflows for another context's OpenGL queries.

        The original ARB_vertex_buffer_object extension includes an issue that explicitly states program termination is allowed when out-of-bounds vertex
        buffer object fetches occur. Modern graphics hardware is capable well-defined behavior in the case of out-of- bounds vertex buffer object fetches.
        Older hardware may require extra checks to enforce well-defined (and termination free) behavior, but this expense is warranted when processing
        potentially untrusted content.

        The intent of this extension is to address some specific robustness goals:
        ${ul(
            """
            For all existing OpenGL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an
            explicit additional parameter of the query.
            """,
            """
            Provide a mechanism for an OpenGL application to learn about graphics resets that affect the context. When a graphics reset occurs, the OpenGL
            context becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an
            inexpensive query.
            """,
            """
            Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
            instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
            reads of uniforms or parameters from buffers.
            """
        )}
        """

    IntConstant(
        "Returned by GetGraphicsResetStatusEXT.",

        "GUILTY_CONTEXT_RESET_EXT"..0x8253,
        "INNOCENT_CONTEXT_RESET_EXT"..0x8254,
        "UNKNOWN_CONTEXT_RESET_EXT"..0x8255
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "CONTEXT_ROBUST_ACCESS_EXT"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY_EXT"..0x8256
    )

    IntConstant(
        "Returned by GetIntegerv and related simple queries when {@code value} is RESET_NOTIFICATION_STRATEGY_EXT .",

        "LOSE_CONTEXT_ON_RESET_EXT"..0x8252,
        "NO_RESET_NOTIFICATION_EXT"..0x8261
    )

    GLenum(
        "GetGraphicsResetStatusEXT",
        ""
    )

    void(
        "ReadnPixelsEXT",
        "",

        GLint.IN("x", ""),
        GLint.IN("y", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLenum.IN("format", ""),
        GLenum.IN("type", ""),
        AutoSize("data")..GLsizei.IN("bufSize", ""),
        PIXEL_PACK_BUFFER..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..void_p.OUT("data", "")
    )

    void(
        "GetnUniformfvEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("params")..GLsizei.IN("bufSize", ""),
        ReturnParam..GLfloat_p.OUT("params", "")
    )

    void(
        "GetnUniformivEXT",
        "",

        GLuint.IN("program", ""),
        GLint.IN("location", ""),
        AutoSize("params")..GLsizei.IN("bufSize", ""),
        ReturnParam..GLint_p.OUT("params", "")
    )
}