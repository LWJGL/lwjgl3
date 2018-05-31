/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_robustness = "ARBRobustness".nativeClassGL("ARB_robustness", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Several recent trends in how OpenGL integrates into modern computer systems have created new requirements for robustness and security for OpenGL
        rendering contexts.

        Additionally GPU architectures now support hardware fault detection; for example, video memory supporting ECC (error correcting codes) and error
        detection. OpenGL contexts should be capable of recovering from hardware faults such as uncorrectable memory errors. Along with recovery from such
        hardware faults, the recovery mechanism can also allow recovery from video memory access exceptions and system software failures. System software
        failures can be due to device changes or driver failures.

        Demands for increased software robustness and concerns about malware exploiting buffer overflows have lead API designers to provide additional "safe"
        APIs that bound the amount of data returned by an API query. For example, the safer "snprintf" or "_snprintf" routines are prefered over "sprintf".

        The OpenGL API has many such robustness perils. OpenGL queries return (write) some number of bytes to a buffer indicated by a pointer parameter. The
        exact number of bytes written by existing OpenGL queries is not expressed directly by any specific parameter; instead the number of bytes returned is a
        complex function of one or more query arguments, sometimes context state such as pixel store modes or the active texture selector, and the current state
        of an object (such as a texture level's number of total texels). By the standards of modern API design, such queries are not "safe". Making these
        queries safer involves introducing a new query API with an additional parameter that specifies the number of bytes in the buffer and never writing bytes
        beyond that limit.

        Multi-threaded use of OpenGL contexts in a "share group" allow sharing of objects such as textures and programs. Such sharing in conjunction with
        concurrent OpenGL commands stream execution by two or more contexts introduces hazards whereby one context can change objects in ways that can cause
        buffer overflows for another context's OpenGL queries.

        The original ${ARB_vertex_buffer_object.link} extension includes an issue that explicitly states program termination is allowed when out-of-bounds
        vertex buffer object fetches occur. Modern GPUs capable of DirectX 10 enforce the well-defined behavior of always returning zero values for indices or
        non-fixed components in this case. Older GPUs may require extra checks to enforce well-defined (and termination free) behavior, but this expense is
        warranted when processing potentially untrusted content.

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

        In one anticipated usage model, WebGL contexts may make use of these robust features to grant greater stability when using untrusted code. WebGL
        contexts cannot call OpenGL commands directly but rather must route all OpenGL API calls through the web browser. It is then the web browser that
        configures the context, using the commands in this extension, to enforce safe behavior. In this scenario, the WebGL content cannot specify or change the
        use of this extension's features itself; the web browser enforces this policy.

        There are other well-known robustness issues with the OpenGL API which this extension does not address. For example, selector-based OpenGL commands are
        a well-known source of programming errors. Code to manipulate texture state may assume the active texture selector is set appropriately when an
        intervening function call obscures a change to the active texture state resulting in incorrectly updated or queried state. The
        ${EXT_direct_state_access.link} extension introduces selector-free OpenGL commands and queries to address that particular issue so this extension does
        not.

        The intent of this extension is NOT to deprecate any existing API and thereby introduce compatibility issues and coding burdens on existing code, but
        rather to provide new APIs to ensure a level of robustness commensurate with the expectations of modern applications of OpenGL.
        """

    IntConstant(
        "Returned by GetGraphicsResetStatusARB.",

        "GUILTY_CONTEXT_RESET_ARB"..0x8253,
        "INNOCENT_CONTEXT_RESET_ARB"..0x8254,
        "UNKNOWN_CONTEXT_RESET_ARB"..0x8255
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "RESET_NOTIFICATION_STRATEGY_ARB"..0x8256
    )

    IntConstant(
        "Returned by GetIntegerv and related simple queries when {@code value} is RESET_NOTIFICATION_STRATEGY_ARB.",

        "LOSE_CONTEXT_ON_RESET_ARB"..0x8252,
        "NO_RESET_NOTIFICATION_ARB"..0x8261
    )

    IntConstant(
        "Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.",

        "CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB"..0x00000004
    )

    GLenum(
        "GetGraphicsResetStatusARB",
        """
        The symbolic constant returned indicates if the GL context has been in a reset state at any point since the last call to {@code GetGraphicsResetStatusARB}.
        #NO_ERROR indicates that the GL context has not been in a reset state since the last call. #GUILTY_CONTEXT_RESET_ARB indicates that a reset has
        been detected that is attributable to the current GL context. #INNOCENT_CONTEXT_RESET_ARB indicates a reset has been detected that is not attributable
        to the current GL context. #UNKNOWN_CONTEXT_RESET_ARB indicates a detected graphics reset whose cause is unknown.

        If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
        status is repeatedly returned, the context may be in the process of resetting.

        Reset notification behavior is determined at context creation time, and may be queried by calling #GetIntegerv() with the symbolic constant
        #RESET_NOTIFICATION_STRATEGY_ARB.

        If the reset notification behavior is #NO_RESET_NOTIFICATION_ARB, then the implementation will never deliver notification of reset events, and
        {@code GetGraphicsResetStatusARB} will always return NO_ERROR.

        If the behavior is #LOSE_CONTEXT_ON_RESET_ARB, a graphics reset will result in the loss of all context state, requiring the recreation of all associated
        objects. In this case {@code GetGraphicsResetStatusARB}. may return any of the values described above.

        If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.
        """
    )

    var src = GL11["GetMapdv"]
    DependsOn("caps.glGetMapdv != NULL")..void(
        "GetnMapdvARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLdouble.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetMapfv"]
    DependsOn("caps.glGetMapfv != NULL")..void(
        "GetnMapfvARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLfloat.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetMapiv"]
    DependsOn("caps.glGetMapiv != NULL")..void(
        "GetnMapivARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["query"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        ReturnParam..GLint.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapfv"]
    DependsOn("caps.glGetPixelMapfv != NULL")..void(
        "GetnPixelMapfvARB",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLfloat.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapuiv"]
    DependsOn("caps.glGetPixelMapuiv != NULL")..void(
        "GetnPixelMapuivARB",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLuint.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPixelMapusv"]
    DependsOn("caps.glGetPixelMapusv != NULL")..void(
        "GetnPixelMapusvARB",
        "Robust version of ${src.javaDocLink}",

        src["map"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        GLushort.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = GL11["GetPolygonStipple"]
    DependsOn("caps.glGetPolygonStipple != NULL")..void(
        "GetnPolygonStippleARB",
        "Robust version of ${src.javaDocLink}",

        AutoSize("pattern")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code pattern}"),
        PIXEL_PACK_BUFFER..GLubyte.p.OUT("pattern", "a buffer in which to place the returned pattern")
    )

    src = GL11C["GetTexImage"]
    void(
        "GetnTexImageARB",
        "Robust version of ${src.javaDocLink}",

        src["tex"],
        src["level"],
        src["format"],
        src["type"],
        AutoSize("img")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code img}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE)..PIXEL_PACK_BUFFER..void.p.OUT("img", "a buffer in which to place the returned data")
    )

    src = GL11C["ReadPixels"]
    void(
        "ReadnPixelsARB",
        "Robust version of ${src.javaDocLink}",

        src["x"],
        src["y"],
        src["width"],
        src["height"],
        src["format"],
        src["type"],
        AutoSize("data")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code data}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..PIXEL_PACK_BUFFER..void.p.OUT("data", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetColorTable"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetColorTable != NULL")..void(
        "GetnColorTableARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("table")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code table}"),
        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..PIXEL_PACK_BUFFER..void.p.OUT("table", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetConvolutionFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetConvolutionFilter != NULL")..void(
        "GetnConvolutionFilterARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("image")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code image}"),
        PIXEL_PACK_BUFFER..void.p.OUT("image", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetSeparableFilter"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetSeparableFilter != NULL")..void(
        "GetnSeparableFilterARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["format"],
        src["type"],
        AutoSize("row")..GLsizei.IN("rowBufSize", "the maximum number of bytes to write into {@code row}"),
        PIXEL_PACK_BUFFER..void.p.OUT("row", "a buffer in which to return the filter row"),
        AutoSize("column")..GLsizei.IN("columnBufSize", "the maximum number of bytes to write into {@code column}"),
        PIXEL_PACK_BUFFER..void.p.OUT("column", "a buffer in which to return the filter column"),
        Unsafe..nullable..void.p.IN("span", "")
    )

    src = ARB_imaging["GetHistogram"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetHistogram != NULL")..void(
        "GetnHistogramARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code values}"),
        PIXEL_PACK_BUFFER..void.p.OUT("values", "a buffer in which to place the returned data")
    )

    src = ARB_imaging["GetMinmax"]
    DependsOn("ext.contains(\"GL_ARB_imaging\") && caps.glGetMinmax != NULL")..void(
        "GetnMinmaxARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["reset"],
        src["format"],
        src["type"],
        AutoSize("values")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code values}"),
        PIXEL_PACK_BUFFER..void.p.OUT("values", "a buffer in which to place the returned data")
    )

    src = GL13C["GetCompressedTexImage"]
    DependsOn("OpenGL13")..void(
        "GetnCompressedTexImageARB",
        "Robust version of ${src.javaDocLink}",

        src["target"],
        src["level"],
        AutoSize("img")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code img}"),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..PIXEL_PACK_BUFFER..void.p.OUT("img", "a buffer in which to place the returned data")
    )

    src = GL20["GetUniformfv"]
    DependsOn("OpenGL20")..void(
        "GetnUniformfvARB",
        "Robust version of ${src.javaDocLink}",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code params}"),
        ReturnParam..GLfloat.p.OUT("params", "a buffer in which to place the returned data")
    )

    src = GL20["GetUniformiv"]
    DependsOn("OpenGL20")..void(
        "GetnUniformivARB",
        "Robust version of ${src.javaDocLink}",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code params}"),
        ReturnParam..GLint.p.OUT("params", "a buffer in which to place the returned data")
    )

    src = GL30["GetUniformuiv"]
    DependsOn("OpenGL30")..void(
        "GetnUniformuivARB",
        "Robust version of ${src.javaDocLink}",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code params}"),
        ReturnParam..GLuint.p.OUT("params", "a buffer in which to place the returned data")
    )

    src = GL40["GetUniformdv"]
    DependsOn("OpenGL40")..void(
        "GetnUniformdvARB",
        "Robust version of ${src.javaDocLink}",

        src["program"],
        src["location"],
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write into {@code params}"),
        ReturnParam..GLdouble.p.OUT("params", "a buffer in which to place the returned data")
    )
}