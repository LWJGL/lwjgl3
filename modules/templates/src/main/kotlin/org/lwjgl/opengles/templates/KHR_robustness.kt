/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val KHR_robustness = "KHRRobustness".nativeClassGLES("KHR_robustness", postfix = KHR) {
    documentation =
        """
        Native bindings to the ${registryLink("KHR", "robustness")} extension.

        Several recent trends in how OpenGL ES integrates into modern computer systems have created new requirements for robustness and security for GL
        rendering contexts.

        Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
        detection. GL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such hardware
        faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software failures can
        be due to device changes or driver failures.

        GL queries that return (write) some number of bytes to a buffer indicated by a pointer parameter introduce risk of buffer overflows that might be
        exploitable by malware. To address this, queries with return value sizes that are not expressed directly by the parameters to the query itself are
        given additional API functions with an additional parameter that specifies the number of bytes in the buffer and never writing bytes beyond that limit.
        This is particularly useful for multi-threaded usage of GL contexts in a "share group" where one context can change objects in ways that can cause
        buffer overflows for another context's GL queries.

        The original ARB_vertex_buffer_object extension includes an issue that explicitly states program termination is allowed when out-of-bounds vertex
        buffer object fetches occur. Modern graphics hardware is capable of well-defined behavior in the case of out-of- bounds vertex buffer object fetches.
        Older hardware may require extra checks to enforce well-defined (and termination free) behavior, but this expense is warranted when processing
        potentially untrusted content.

        The intent of this extension is to address some specific robustness goals:
        ${ul(
            """
            For all existing GL queries, provide additional "safe" APIs that limit data written to user pointers to a buffer size in bytes that is an explicit
            additional parameter of the query.
            """,
            """
            Provide a mechanism for a GL application to learn about graphics resets that affect the context. When a graphics reset occurs, the GL context
            becomes unusable and the application must create a new context to continue operation. Detecting a graphics reset happens through an inexpensive query.
            """,
            "Define behavior of OpenGL calls made after a graphics reset.",
            """
            Provide an enable to guarantee that out-of-bounds buffer object accesses by the GPU will have deterministic behavior and preclude application
            instability or termination due to an incorrect buffer access. Such accesses include vertex buffer fetches of attributes and indices, and indexed
            reads of uniforms or parameters from buffers.
            """
        )}

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Returned by #GetGraphicsResetStatusKHR().",

        "GUILTY_CONTEXT_RESET_KHR"..0x8253,
        "INNOCENT_CONTEXT_RESET_KHR"..0x8254,
        "UNKNOWN_CONTEXT_RESET_KHR"..0x8255
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "CONTEXT_ROBUST_ACCESS_KHR"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY_KHR"..0x8256
    )

    IntConstant(
        "Returned by GetIntegerv and related simple queries when {@code value} is #RESET_NOTIFICATION_STRATEGY_KHR.",

        "LOSE_CONTEXT_ON_RESET_KHR"..0x8252,
        "NO_RESET_NOTIFICATION_KHR"..0x8261
    )

    IntConstant(
        "Returned by #GetError().",

        "CONTEXT_LOST_KHR"..0x0507
    )

    GLenum(
        "GetGraphicsResetStatusKHR",
        """
        Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
        ${ul(
            "#NO_ERROR indicates that the GL context has not been in a reset state since the last call.",
            "#GUILTY_CONTEXT_RESET_KHR indicates that a reset has been detected that is attributable to the current GL context.",
            "#INNOCENT_CONTEXT_RESET_KHR indicates a reset has been detected that is not attributable to the current GL context.",
            "#UNKNOWN_CONTEXT_RESET_KHR indicates a detected graphics reset whose cause is unknown."
        )}
        If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
        status is repeatedly returned, the context may be in the process of resetting.

        Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
        #RESET_NOTIFICATION_STRATEGY_KHR.

        If the reset notification behavior is #NO_RESET_NOTIFICATION_KHR, then the implementation will never deliver notification of reset events, and
        GetGraphicsResetStatus will always return NO_ERROR.

        If the behavior is #LOSE_CONTEXT_ON_RESET_KHR, a graphics reset will result in a lost context and require creating a new context as described
        above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.

        If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.

        After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
        #CONTEXT_LOST_KHR error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
        and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:
        ${ul(
            """
            #GetError() and #GetGraphicsResetStatusKHR() behave normally following a graphics reset, so that the application can determine a reset has
            occurred, and when it is safe to destroy and recreate the context.
            """,
            """
            Any commands which might cause a polling application to block indefinitely will generate a #CONTEXT_LOST_KHR error, but will also return a value
            indicating completion to the application.
            """
        )}
        """
    )

    void(
        "ReadnPixelsKHR",
        "Behaves identically to #ReadPixels() except that it does not write more than {@code bufSize} bytes into {@code data}",

        GLint.IN("x", "the left pixel coordinate"),
        GLint.IN("y", "the lower pixel coordinate"),
        GLsizei.IN("width", "the number of pixels to read in the x-dimension"),
        GLsizei.IN("height", "the number of pixels to read in the y-dimension"),
        GLenum.IN("format", "the pixel format"),
        GLenum.IN("type", "the pixel type"),
        AutoSize("pixels")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        PIXEL_PACK_BUFFER..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..void_p.OUT("pixels", "a buffer in which to place the returned pixel data")
    )

    void(
        "GetnUniformfvKHR",
        "Returns the value or values of a uniform of the default uniform block.",

        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the uniform location"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat_p.OUT("params", "the buffer in which to place the returned data")
    )

    void(
        "GetnUniformivKHR",
        "Integer version of #GetnUniformfvKHR().",

        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the uniform location"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat_p.OUT("params", "the buffer in which to place the returned data")
    )

    void(
        "GetnUniformuivKHR",
        "Unsigned version of #GetnUniformivKHR().",

        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the uniform location"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat_p.OUT("params", "the buffer in which to place the returned data")
    )
}