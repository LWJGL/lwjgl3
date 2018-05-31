/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val GLES32 = "GLES32".nativeClassGLES("GLES32", postfix = "") {
    extends = GLES31
    documentation =
        "The core OpenGL ES 3.2 functionality."

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.",

        "MULTISAMPLE_LINE_WIDTH_RANGE_ARB"..0x9381,
        "MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB"..0x9382
    )

    // KHR_blend_equation_advanced


    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation and BlendEquationi.",

        "MULTIPLY"..0x9294,
        "SCREEN"..0x9295,
        "OVERLAY"..0x9296,
        "DARKEN"..0x9297,
        "LIGHTEN"..0x9298,
        "COLORDODGE"..0x9299,
        "COLORBURN"..0x929A,
        "HARDLIGHT"..0x929B,
        "SOFTLIGHT"..0x929C,
        "DIFFERENCE"..0x929E,
        "EXCLUSION"..0x92A0,
        "HSL_HUE"..0x92AD,
        "HSL_SATURATION"..0x92AE,
        "HSL_COLOR"..0x92AF,
        "HSL_LUMINOSITY"..0x92B0
    )

    void(
        "BlendBarrier",
        """
        Specifies a boundary between passes when using advanced blend equations.

        When using advanced blending equations, applications should split their rendering into a collection of blending passes, none of which touch an
        individual sample in the framebuffer more than once. The results of blending are undefined if the sample being blended has been touched previously in
        the same pass. Any command that causes the value of a sample to be modified using the framebuffer is considered to touch the sample, including clears,
        blended or unblended primitives, and #BlitFramebuffer() copies.
        """
    )

    // OES_copy_image

    void(
        "CopyImageSubData",
        "",

        GLuint.IN("srcName", ""),
        GLenum.IN("srcTarget", ""),
        GLint.IN("srcLevel", ""),
        GLint.IN("srcX", ""),
        GLint.IN("srcY", ""),
        GLint.IN("srcZ", ""),
        GLuint.IN("dstName", ""),
        GLenum.IN("dstTarget", ""),
        GLint.IN("dstLevel", ""),
        GLint.IN("dstX", ""),
        GLint.IN("dstY", ""),
        GLint.IN("dstZ", ""),
        GLsizei.IN("srcWidth", ""),
        GLsizei.IN("srcHeight", ""),
        GLsizei.IN("srcDepth", "")
    )

    // KHR_debug

    IntConstant(
        "Tokens accepted by the {@code target} parameters of Enable, Disable, and  IsEnabled.",

        "DEBUG_OUTPUT"..0x92E0,
        "DEBUG_OUTPUT_SYNCHRONOUS"..0x8242
    )

    IntConstant(
        "Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.",

        "CONTEXT_FLAG_DEBUG_BIT"..0x00000002
    )

    IntConstant(
        "Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv,  GetFloatv, GetDoublev and GetInteger64v.",

        "MAX_DEBUG_MESSAGE_LENGTH"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES"..0x9144,
        "DEBUG_LOGGED_MESSAGES"..0x9145,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH"..0x8243,
        "MAX_DEBUG_GROUP_STACK_DEPTH"..0x826C,
        "DEBUG_GROUP_STACK_DEPTH"..0x826D,
        "MAX_LABEL_LENGTH"..0x82E8
    )

    IntConstant(
        "Tokens accepted by the {@code pname} parameter of GetPointerv.",

        "DEBUG_CALLBACK_FUNCTION"..0x8244,
        "DEBUG_CALLBACK_USER_PARAM"..0x8245
    )

    val DebugSources = IntConstant(
        """
        Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter
        of GetDebugMessageLog.
        """,

        "DEBUG_SOURCE_API"..0x8246,
        "DEBUG_SOURCE_WINDOW_SYSTEM"..0x8247,
        "DEBUG_SOURCE_SHADER_COMPILER"..0x8248,
        "DEBUG_SOURCE_THIRD_PARTY"..0x8249,
        "DEBUG_SOURCE_APPLICATION"..0x824A,
        "DEBUG_SOURCE_OTHER"..0x824B
    ).javaDocLinks

    val DebugTypes = IntConstant(
        """
        Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of
        GetDebugMessageLog.
        """,

        "DEBUG_TYPE_ERROR"..0x824C,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR"..0x824D,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR"..0x824E,
        "DEBUG_TYPE_PORTABILITY"..0x824F,
        "DEBUG_TYPE_PERFORMANCE"..0x8250,
        "DEBUG_TYPE_OTHER"..0x8251,
        "DEBUG_TYPE_MARKER"..0x8268
    ).javaDocLinks

    IntConstant(
        """
        Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.
        """,

        "DEBUG_TYPE_PUSH_GROUP"..0x8269,
        "DEBUG_TYPE_POP_GROUP"..0x826A
    )

    val DebugSeverities = IntConstant(
        """
        Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the
        {@code severities} parameter of GetDebugMessageLog.
        """,

        "DEBUG_SEVERITY_HIGH"..0x9146,
        "DEBUG_SEVERITY_MEDIUM"..0x9147,
        "DEBUG_SEVERITY_LOW"..0x9148,
        "DEBUG_SEVERITY_NOTIFICATION"..0x826B
    ).javaDocLinks

    IntConstant(
        "Returned by GetError.",

        "STACK_UNDERFLOW"..0x0504,
        "STACK_OVERFLOW"..0x0503
    )

    val DebugIdentifiers = IntConstant(
        "Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.",

        "BUFFER"..0x82E0,
        "SHADER"..0x82E1,
        "PROGRAM"..0x82E2,
        "QUERY"..0x82E3,
        "PROGRAM_PIPELINE"..0x82E4,
        "SAMPLER"..0x82E6
    ).javaDocLinks

    void(
        "DebugMessageControl",
        """
        Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.

        If {@code enabled} is #TRUE, the referenced subset of messages will be enabled. If #FALSE, then those messages will be disabled.

        This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
        ways:
        ${ul(
            """
            If {@code source}, {@code type}, or {@code severity} is #DONT_CARE, the messages from all sources, of all types, or of all severities are
            referenced respectively.
            """,
            """
            When values other than #DONT_CARE are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
            or {@code severity} respectively will be referenced.
            """,
            """
            If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
            {@code type}. In this case, if {@code source} or {@code type} is #DONT_CARE, or {@code severity} is not #DONT_CARE, the error
            #INVALID_OPERATION is generated.
            """
        )}
        Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.

        Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
        state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
        single call, and individually disabling all messages from that source using their types and IDs.

        If the #DEBUG_OUTPUT state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are
        disabled.
        """,

        GLenum.IN("source", "the source of debug messages to enable or disable", DebugSources),
        GLenum.IN("type", "the type of debug messages to enable or disable", DebugTypes),
        GLenum.IN("severity", "the severity of debug messages to enable or disable", DebugSeverities),
        AutoSize("ids")..GLsizei.IN("count", "the length of the array {@code ids}"),
        SingleValue("id")..GLuint.const.p.IN("ids", "an array of unsigned integers containing the ids of the messages to enable or disable"),
        GLboolean.IN("enabled", "whether the selected messages should be enabled or disabled")
    )

    void(
        "DebugMessageInsert",
        """
        This function can be called by applications and third-party libraries to generate their own messages, such as ones containing timestamp information or
        signals about specific render system events.

        The value of {@code id} specifies the ID for the message and {@code severity} indicates its severity level as defined by the caller. The string
        {@code buf} contains the string representation of the message. The parameter {@code length} contains the number of characters in {@code buf}. If
        {@code length} is negative, it is implied that {@code buf} contains a null terminated string. The error #INVALID_VALUE will be generated if the
        number of characters in {@code buf}, excluding the null terminator when {@code length} is negative, is not less than the value of
        #MAX_DEBUG_MESSAGE_LENGTH.

        If the #DEBUG_OUTPUT state is disabled calls to DebugMessageInsert are discarded and do not generate an error.
        """,

        GLenum.IN("source", "the source of the debug message to insert", DebugSources),
        GLenum.IN("type", "the type of the debug message insert", DebugTypes),
        GLuint.IN("id", "the user-supplied identifier of the message to insert", DebugSeverities),
        GLenum.IN("severity", "the severity of the debug messages to insert"),
        AutoSize("message")..GLsizei.IN("length", "the length of the string contained in the character array whose address is given by {@code message}"),
        GLcharUTF8.const.p.IN("message", "a character array containing the message to insert")
    )

    void(
        "DebugMessageCallback",
        """
        Specifies a callback to receive debugging messages from the GL.

        The function's prototype must follow the type definition of DEBUGPROC including its platform-dependent calling convention. Anything else will result in
        undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying
        #NULL as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide
        user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call
        to the callback function.

        If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message
        is generated.  The source, type, ID, and severity of the message are specified by the DEBUGPROC parameters {@code source}, {@code type}, {@code id}, and
        {@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is
        stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallback.

        Applications can query the current callback function and the current user-specified parameter by obtaining the values of #DEBUG_CALLBACK_FUNCTION
        and #DEBUG_CALLBACK_USER_PARAM, respectively.

        Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the
        GL, regardless of the debug source.

        The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.

        The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.

        Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.

        If the #DEBUG_OUTPUT state is disabled then the GL will not call the callback function.
        """,

        nullable..GLDEBUGPROC.IN("callback", "a callback function that will be called when a debug message is generated"),
        nullable..opaque_const_p.IN(
            "userParam",
            "a user supplied pointer that will be passed on each invocation of {@code callback}"
        )
    )

    GLuint(
        "GetDebugMessageLog",
        """
        Retrieves messages from the debug message log.

        This function fetches a maximum of {@code count} messages from the message log, and will return the number of messages successfully fetched.

        Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.

        The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
        {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
        array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
        messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
        string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
        {@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not #NULL, an #INVALID_VALUE error will be generated. If a message's
        string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent
        messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.

        Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
        pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
        log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
        null pointers for all attribute arrays.

        If the context was created without the #CONTEXT_FLAG_DEBUG_BIT, then the GL can opt to never add messages to the message log so GetDebugMessageLog will
        always return zero.
        """,

        GLuint.IN("count", "the number of debug messages to retrieve from the log"),
        AutoSize("messageLog")..GLsizei.IN("bufsize", "the size of the buffer whose address is given by {@code messageLog}"),
        Check("count")..nullable..GLenum.p.OUT("sources", "an array of variables to receive the sources of the retrieved messages"),
        Check("count")..nullable..GLenum.p.OUT("types", "an array of variables to receive the types of the retrieved messages"),
        Check("count")..nullable..GLuint.p.OUT("ids", "an array of unsigned integers to receive the ids of the retrieved messages"),
        Check("count")..nullable..GLenum.p.OUT("severities", "an array of variables to receive the severites of the retrieved messages"),
        Check("count")..nullable..GLsizei.p.OUT("lengths", "an array of variables to receive the lengths of the received messages"),
        nullable..GLcharUTF8.p.OUT("messageLog", "an array of characters that will receive the messages")
    )

    void(
        "GetPointerv",
        "",

        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..void.p.p.OUT("params", "")
    )

    void(
        "PushDebugGroup",
        """
        Pushes a debug group described by the string {@code message} into the command stream. The value of {@code id} specifies the ID of messages generated.
        The parameter {@code length} contains the number of characters in {@code message}. If {@code length} is negative, it is implied that {@code message}
        contains a null terminated string. The message has the specified {@code source} and {@code id}, {@code type} #DEBUG_TYPE_PUSH_GROUP, and
        {@code severity} #DEBUG_SEVERITY_NOTIFICATION. The GL will put a new debug group on top of the debug group stack which inherits the control of the
        volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any
        additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug
        group.

        An #INVALID_ENUM error is generated if the value of {@code source} is neither #DEBUG_SOURCE_APPLICATION nor #DEBUG_SOURCE_THIRD_PARTY. An
        #INVALID_VALUE error is generated if {@code length} is negative and the number of characters in {@code message}, excluding the null-terminator,
        is not less than the value of #MAX_DEBUG_MESSAGE_LENGTH.
        """,

        GLenum.IN("source", "the source of the debug message", "#DEBUG_SOURCE_APPLICATION #DEBUG_SOURCE_THIRD_PARTY"),
        GLuint.IN("id", "the identifier of the message"),
        AutoSize("message")..GLsizei.IN("length", "the length of the message to be sent to the debug output stream"),
        GLcharUTF8.const.p.IN("message", "a string containing the message to be sent to the debug output stream")
    )

    void(
        "PopDebugGroup",
        """
        Pops the active debug group. When a debug group is popped, the GL will also generate a debug output message describing its cause based on the
        {@code message} string, the source {@code source}, and an ID {@code id} submitted to the associated #PushDebugGroup() command.
        #DEBUG_TYPE_PUSH_GROUP and #DEBUG_TYPE_POP_GROUP share a single namespace for message {@code id}. {@code severity} has the value
        #DEBUG_SEVERITY_NOTIFICATION. The {@code type} has the value #DEBUG_TYPE_POP_GROUP. Popping a debug group restores the debug output volume
        control of the parent debug group.

        Attempting to pop the default debug group off the stack generates a #STACK_UNDERFLOW error; pushing a debug group onto a stack containing
        #MAX_DEBUG_GROUP_STACK_DEPTH minus one elements will generate a #STACK_OVERFLOW error.
        """
    )

    void(
        "ObjectLabel",
        "Labels a named object identified within a namespace.",

        GLenum.IN(
            "identifier",
            "the namespace from which the name of the object is allocated",
            DebugIdentifiers + " #TEXTURE #RENDERBUFFER #FRAMEBUFFER #TRANSFORM_FEEDBACK"
        ),
        GLuint.IN("name", "the name of the object to label"),
        AutoSize("label")..GLsizei.IN("length", "the length of the label to be used for the object"),
        GLcharUTF8.const.p.IN("label", "a string containing the label to assign to the object")
    )

    void(
        "GetObjectLabel",
        "Retrieves the label of a named object identified within a namespace.",

        GLenum.IN(
            "identifier",
            "the namespace from which the name of the object is allocated",
            DebugIdentifiers + " #TEXTURE #RENDERBUFFER #FRAMEBUFFER #TRANSFORM_FEEDBACK"
        ),
        GLuint.IN("name", "the name of the object whose label to retrieve"),
        AutoSize("label")..GLsizei.IN("bufSize", "the length of the buffer whose address is in {@code label}"),
        Check(1)..nullable..GLsizei.p.OUT("length", "the address of a variable to receive the length of the object label"),
        Return("length", "GLES20.glGetInteger(GL_MAX_LABEL_LENGTH)")..GLcharUTF8.p.OUT("label", "a string that will receive the object label")
    )

    void(
        "ObjectPtrLabel",
        "Labels a sync object identified by a pointer.",

        opaque_p.IN("ptr", "a pointer identifying a sync object"),
        AutoSize("label")..GLsizei.IN("length", "the length of the label to be used for the object"),
        GLcharUTF8.const.p.IN("label", "a string containing the label to assign to the object")
    )

    void(
        "GetObjectPtrLabel",
        "Retrieves the label of a sync object identified by a pointer.",

        opaque_p.IN("ptr", "the name of the sync object whose label to retrieve"),
        AutoSize("label")..GLsizei.IN("bufSize", "the length of the buffer whose address is in {@code label}"),
        Check(1)..nullable..GLsizei.p.OUT("length", "a variable to receive the length of the object label"),
        Return("length", "GLES20.glGetInteger(GL_MAX_LABEL_LENGTH)")..GLcharUTF8.p.OUT("label", "a string that will receive the object label")
    )

    // OES_draw_buffers_indexed

    void(
        "Enablei",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    void(
        "Disablei",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    void(
        "BlendEquationi",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("mode", "")
    )

    void(
        "BlendEquationSeparatei",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("modeRGB", ""),
        GLenum.IN("modeAlpha", "")
    )

    void(
        "BlendFunci",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("src", ""),
        GLenum.IN("dst", "")
    )

    void(
        "BlendFuncSeparatei",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("srcRGB", ""),
        GLenum.IN("dstRGB", ""),
        GLenum.IN("srcAlpha", ""),
        GLenum.IN("dstAlpha", "")
    )

    void(
        "ColorMaski",
        "",

        GLuint.IN("index", ""),
        GLboolean.IN("r", ""),
        GLboolean.IN("g", ""),
        GLboolean.IN("b", ""),
        GLboolean.IN("a", "")
    )

    GLboolean(
        "IsEnabledi",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    // OES_draw_elements_base_vertex

    void(
        "DrawElementsBaseVertex",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLint.IN("basevertex", "")
    )

    void(
        "DrawRangeElementsBaseVertex",
        "",

        GLenum.IN("mode", ""),
        GLuint.IN("start", ""),
        GLuint.IN("end", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLint.IN("basevertex", "")
    )

    void(
        "DrawElementsInstancedBaseVertex",
        "",

        GLenum.IN("mode", ""),
        AutoSizeShr("GLESChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", ""),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN("type", ""),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", ""),
        GLsizei.IN("instancecount", ""),
        GLint.IN("basevertex", "")
    )

    // OES_geometry_shader

    IntConstant(
        """
        Accepted by the {@code type} parameter of CreateShader and CreateShaderProgramv, by the {@code pname} parameter of GetProgramPipelineiv and returned in
        the {@code params} parameter of GetShaderiv when {@code pname} is SHADER_TYPE.
        """,

        "GEOMETRY_SHADER"..0x8DD9
    )

    IntConstant(
        "Accepted by the {@code stages} parameter of UseProgramStages.",

        "GEOMETRY_SHADER_BIT"..0x00000004
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "GEOMETRY_LINKED_VERTICES_OUT"..0x8916,
        "GEOMETRY_LINKED_INPUT_TYPE"..0x8917,
        "GEOMETRY_LINKED_OUTPUT_TYPE"..0x8918,
        "GEOMETRY_SHADER_INVOCATIONS"..0x887F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v.",

        "LAYER_PROVOKING_VERTEX"..0x825E,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS"..0x8DDF,
        "MAX_GEOMETRY_UNIFORM_BLOCKS"..0x8A2C,
        "MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS"..0x8A32,
        "MAX_GEOMETRY_INPUT_COMPONENTS"..0x9123,
        "MAX_GEOMETRY_OUTPUT_COMPONENTS"..0x9124,
        "MAX_GEOMETRY_OUTPUT_VERTICES"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS"..0x8DE1,
        "MAX_GEOMETRY_SHADER_INVOCATIONS"..0x8E5A,
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS"..0x8C29,
        "MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS"..0x92CF,
        "MAX_GEOMETRY_ATOMIC_COUNTERS"..0x92D5,
        "MAX_GEOMETRY_IMAGE_UNIFORMS"..0x90CD,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS"..0x90D7
    )

    IntConstant(
        "Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX.",

        "FIRST_VERTEX_CONVENTION"..0x8E4D,
        "LAST_VERTEX_CONVENTION"..0x8E4E,
        "UNDEFINED_VERTEX"..0x8260
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryiv, and GetQueryObjectuiv.",

        "PRIMITIVES_GENERATED"..0x8C87
    )

    IntConstant(
        "Accepted by the {@code mode} parameter of DrawArrays, DrawElements, and other commands which draw primitives.",

        "LINES_ADJACENCY"..0xA,
        "LINE_STRIP_ADJACENCY"..0xB,
        "TRIANGLES_ADJACENCY"..0xC,
        "TRIANGLE_STRIP_ADJACENCY"..0xD
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of FramebufferParameteri, and GetFramebufferParameteriv.",

        "FRAMEBUFFER_DEFAULT_LAYERS"..0x9312
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, and GetFloatv.",

        "MAX_FRAMEBUFFER_LAYERS"..0x9317
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS"..0x8DA8
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_LAYERED"..0x8DA7
    )

    IntConstant(
        "Accepted by the {@code props} parameter of GetProgramResourceiv.",

        "REFERENCED_BY_GEOMETRY_SHADER"..0x9309
    )

    void(
        "FramebufferTexture",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", "")
    )

    // OES_primitive_bounding_box

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.",

        "PRIMITIVE_BOUNDING_BOX_ARB"..0x92BE
    )

    void(
        "PrimitiveBoundingBox",
        """
        Specifies the primitive bounding box.

        Implementations may be able to optimize performance if the application provides bounds of primitives that will be generated by the tessellation
        primitive generator or the geometry shader prior to executing those stages. If the provided bounds are incorrect and primitives extend beyond them, the
        rasterizer may or may not generate fragments for the portions of primitives outside the bounds.
        """,

        GLfloat.IN("minX", "the minimum x clip space coordinate"),
        GLfloat.IN("minY", "the minimum y clip space coordinate"),
        GLfloat.IN("minZ", "the minimum z clip space coordinate"),
        GLfloat.IN("minW", "the minimum w clip space coordinate"),
        GLfloat.IN("maxX", "the maximum x clip space coordinate"),
        GLfloat.IN("maxY", "the maximum y clip space coordinate"),
        GLfloat.IN("maxZ", "the maximum z clip space coordinate"),
        GLfloat.IN("maxW", "the maximum w clip space coordinate")
    )

    // KHR_robustness

    IntConstant(
        "Returned by #GetGraphicsResetStatus().",

        "GUILTY_CONTEXT_RESET"..0x8253,
        "INNOCENT_CONTEXT_RESET"..0x8254,
        "UNKNOWN_CONTEXT_RESET"..0x8255
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "CONTEXT_ROBUST_ACCESS"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY"..0x8256
    )

    IntConstant(
        "Returned by GetIntegerv and related simple queries when {@code value} is #RESET_NOTIFICATION_STRATEGY.",

        "LOSE_CONTEXT_ON_RESET"..0x8252,
        "NO_RESET_NOTIFICATION"..0x8261
    )

    IntConstant(
        "Returned by #GetError().",

        "CONTEXT_LOST"..0x0507
    )

    GLenum(
        "GetGraphicsResetStatus",
        """
        Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
        ${ul(
            "#NO_ERROR indicates that the GL context has not been in a reset state since the last call.",
            "#GUILTY_CONTEXT_RESET indicates that a reset has been detected that is attributable to the current GL context.",
            "#INNOCENT_CONTEXT_RESET indicates a reset has been detected that is not attributable to the current GL context.",
            "#UNKNOWN_CONTEXT_RESET indicates a detected graphics reset whose cause is unknown."
        )}
        If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
        status is repeatedly returned, the context may be in the process of resetting.

        Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
        #RESET_NOTIFICATION_STRATEGY.

        If the reset notification behavior is #NO_RESET_NOTIFICATION, then the implementation will never deliver notification of reset events, and
        GetGraphicsResetStatus will always return NO_ERROR.

        If the behavior is #LOSE_CONTEXT_ON_RESET, a graphics reset will result in a lost context and require creating a new context as described
        above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.

        If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.

        After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
        #CONTEXT_LOST error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
        and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:
        ${ul(
            """
            #GetError() and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
            occurred, and when it is safe to destroy and recreate the context.
            """,
            """
            Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
            indicating completion to the application.
            """
        )}
        """
    )

    void(
        "ReadnPixels",
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
        )..void.p.OUT("pixels", "a buffer in which to place the returned pixel data")
    )

    void(
        "GetnUniformfv",
        "Returns the value or values of a uniform of the default uniform block.",

        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the uniform location"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat.p.OUT("params", "the buffer in which to place the returned data")
    )

    void(
        "GetnUniformiv",
        "Integer version of #GetnUniformfv().",

        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the uniform location"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat.p.OUT("params", "the buffer in which to place the returned data")
    )

    void(
        "GetnUniformuiv",
        "Unsigned version of #GetnUniformiv().",

        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the uniform location"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of bytes to write to {@code params}"),
        ReturnParam..GLfloat.p.OUT("params", "the buffer in which to place the returned data")
    )

    // OES_sample_shading

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetInteger64v.
        """,

        "SAMPLE_SHADING"..0x8C36
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv.",

        "MIN_SAMPLE_SHADING_VALUE"..0x8C37
    )

    void(
        "MinSampleShading",
        "",

        GLfloat.IN("value", "")
    )

    // OES_multisample_interpolation_features

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v.",

        "MIN_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS"..0x8E5D
    )

    // OES_tessellation_shader

    IntConstant(
        "Accepted by the {@code mode} parameter of DrawArrays, DrawElements, and other commands which draw primitives.",

        "PATCHES"..0xE
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.",

        "PATCH_VERTICES"..0x8E72
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "TESS_CONTROL_OUTPUT_VERTICES"..0x8E75,
        "TESS_GEN_MODE"..0x8E76,
        "TESS_GEN_SPACING"..0x8E77,
        "TESS_GEN_VERTEX_ORDER"..0x8E78,
        "TESS_GEN_POINT_MODE"..0x8E79
    )

    IntConstant(
        "Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE.",

        "ISOLINES"..0x8E7A,
        "QUADS"..0x0007
    )

    IntConstant(
        "Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING.",

        "FRACTIONAL_ODD"..0x8E7B,
        "FRACTIONAL_EVEN"..0x8E7C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.",

        "MAX_PATCH_VERTICES"..0x8E7D,
        "MAX_TESS_GEN_LEVEL"..0x8E7E,
        "MAX_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E7F,
        "MAX_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E80,
        "MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS"..0x8E81,
        "MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS"..0x8E82,
        "MAX_TESS_CONTROL_OUTPUT_COMPONENTS"..0x8E83,
        "MAX_TESS_PATCH_COMPONENTS"..0x8E84,
        "MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS"..0x8E85,
        "MAX_TESS_EVALUATION_OUTPUT_COMPONENTS"..0x8E86,
        "MAX_TESS_CONTROL_UNIFORM_BLOCKS"..0x8E89,
        "MAX_TESS_EVALUATION_UNIFORM_BLOCKS"..0x8E8A,
        "MAX_TESS_CONTROL_INPUT_COMPONENTS"..0x886C,
        "MAX_TESS_EVALUATION_INPUT_COMPONENTS"..0x886D,
        "MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E1E,
        "MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E1F,
        "MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS"..0x92CD,
        "MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS"..0x92CE,
        "MAX_TESS_CONTROL_ATOMIC_COUNTERS"..0x92D3,
        "MAX_TESS_EVALUATION_ATOMIC_COUNTERS"..0x92D4,
        "MAX_TESS_CONTROL_IMAGE_UNIFORMS"..0x90CB,
        "MAX_TESS_EVALUATION_IMAGE_UNIFORMS"..0x90CC,
        "MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS"..0x90D8,
        "MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS"..0x90D9,
        "PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED"..0x8221
    )

    IntConstant(
        "Accepted by the {@code props} parameter of GetProgramResourceiv.",

        "IS_PER_PATCH"..0x92E7,
        "REFERENCED_BY_TESS_CONTROL_SHADER"..0x9307,
        "REFERENCED_BY_TESS_EVALUATION_SHADER"..0x9308
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of CreateShader, by the {@code pname} parameter of GetProgramPipelineiv, and returned by the {@code params}
        parameter of GetShaderiv.
        """,

        "TESS_EVALUATION_SHADER"..0x8E87,
        "TESS_CONTROL_SHADER"..0x8E88
    )

    IntConstant(
        "Accepted by the {@code stages} parameter of UseProgramStages.",

        "TESS_CONTROL_SHADER_BIT"..0x00000008,
        "TESS_EVALUATION_SHADER_BIT"..0x00000010
    )

    void(
        "PatchParameteri",
        "",

        GLenum.IN("pname", ""),
        GLint.IN("value", "")
    )

    // OES_texture_border_clamp

    IntConstant(
        """
        Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIiv,
        TexParameterIuiv, SamplerParameterIiv, SamplerParameterIuiv, GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv,
        GetTexParameterIuiv, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv.
        """,

        "TEXTURE_BORDER_COLOR"..0x1004
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
        TexParameteriv, TexParameterfv, TexParameterIiv, TexParameterIuiv, SamplerParameterIiv, SamplerParameterIuiv and returned by the
        {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, GetTexParameterIuiv, GetSamplerParameteriv,
        GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
        or TEXTURE_WRAP_R.
        """,

        "CLAMP_TO_BORDER"..0x812D
    )

    void(
        "TexParameterIiv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..GLint.const.p.IN("params", "")
    )

    void(
        "TexParameterIuiv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..GLuint.const.p.IN("params", "")
    )

    void(
        "GetTexParameterIiv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetTexParameterIuiv",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint.p.OUT("params", "")
    )

    void(
        "SamplerParameterIiv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..GLint.const.p.IN("params", "")
    )

    void(
        "SamplerParameterIuiv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        SingleValue("param")..Check(1)..GLuint.const.p.IN("params", "")
    )

    void(
        "GetSamplerParameterIiv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint.p.OUT("params", "")
    )

    void(
        "GetSamplerParameterIuiv",
        "",

        GLuint.IN("sampler", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint.p.OUT("params", "")
    )

    // OES_texture_buffer

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBufferRange, BindTexture, UnmapBuffer, GetBufferParameteriv,
        GetBufferPointerv, TexBuffer, and TexBufferRange.
        """,

        "TEXTURE_BUFFER"..0x8C2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetFloatv, and GetIntegerv.",

        "TEXTURE_BUFFER_BINDING"..0x8C2A
    )

    IntConstant(
        """
        (note that this token name is an alias for TEXTURE_BUFFER, and is used for naming consistency with queries for the buffers bound to other buffer
        binding points). MAX_TEXTURE_BUFFER_SIZE 0x8C2B TEXTURE_BINDING_BUFFER 0x8C2C TEXTURE_BUFFER_OFFSET_ALIGNMENT 0x919F Returned in the
        {@code type} parameter of GetActiveUniform, the {@code params} parameter of GetActiveUniformsiv, and the {@code params} parameter of
        GetProgramResourceiv when the TYPE property is queried on the UNIFORM interface.
        """,

        "SAMPLER_BUFFER"..0x8DC2,
        "INT_SAMPLER_BUFFER"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_BUFFER"..0x8DD8,
        "IMAGE_BUFFER"..0x9051,
        "INT_IMAGE_BUFFER"..0x905C,
        "UNSIGNED_INT_IMAGE_BUFFER"..0x9067
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameter.",

        "TEXTURE_BUFFER_DATA_STORE_BINDING"..0x8C2D,
        "TEXTURE_BUFFER_OFFSET"..0x919D,
        "TEXTURE_BUFFER_SIZE"..0x919E
    )

    void(
        "TexBuffer",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLuint.IN("buffer", "")
    )

    void(
        "TexBufferRange",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("internalformat", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("size", "")
    )

    // KHR_texture_compression_astc_ldr

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of CompressedTexImage2D, CompressedTexSubImage2D, TexStorage2D, TextureStorage2D, TexStorage3D, and
        TextureStorage3D.
        """,

        "COMPRESSED_RGBA_ASTC_4x4"..0x93B0,
        "COMPRESSED_RGBA_ASTC_5x4"..0x93B1,
        "COMPRESSED_RGBA_ASTC_5x5"..0x93B2,
        "COMPRESSED_RGBA_ASTC_6x5"..0x93B3,
        "COMPRESSED_RGBA_ASTC_6x6"..0x93B4,
        "COMPRESSED_RGBA_ASTC_8x5"..0x93B5,
        "COMPRESSED_RGBA_ASTC_8x6"..0x93B6,
        "COMPRESSED_RGBA_ASTC_8x8"..0x93B7,
        "COMPRESSED_RGBA_ASTC_10x5"..0x93B8,
        "COMPRESSED_RGBA_ASTC_10x6"..0x93B9,
        "COMPRESSED_RGBA_ASTC_10x8"..0x93BA,
        "COMPRESSED_RGBA_ASTC_10x10"..0x93BB,
        "COMPRESSED_RGBA_ASTC_12x10"..0x93BC,
        "COMPRESSED_RGBA_ASTC_12x12"..0x93BD,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4"..0x93D0,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x4"..0x93D1,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5"..0x93D2,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x5"..0x93D3,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6"..0x93D4,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x5"..0x93D5,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x6"..0x93D6,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x8"..0x93D7,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x5"..0x93D8,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x6"..0x93D9,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x8"..0x93DA,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x10"..0x93DB,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x10"..0x93DC,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x12"..0x93DD
    )

    // OES_texture_cube_map_array

    IntConstant(
        """
        Accepted by the {@code target} parameter of TexParameter{if}, TexParameter{if}v, TexParameterI{i ui}v, BindTexture, GenerateMipmap, TexImage3D,
        TexSubImage3D, TexStorage3D, GetTexParameter{if}v, GetTexParameter{i ui}v, GetTexLevelParameter{if}v, CompressedTexImage3D, CompressedTexSubImage3D
        and CopyTexSubImage3D.
        """,

        "TEXTURE_CUBE_MAP_ARRAY"..0x9009
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv.",

        "TEXTURE_BINDING_CUBE_MAP_ARRAY"..0x900A
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform, and by the {@code params} parameter of GetProgramResourceiv when {@code props} is TYPE.",

        "SAMPLER_CUBE_MAP_ARRAY"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY"..0x900F,
        "IMAGE_CUBE_MAP_ARRAY"..0x9054,
        "INT_IMAGE_CUBE_MAP_ARRAY"..0x905F,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY"..0x906A
    )

    // OES_texture_storage_multisample_2d_array

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindTexture, TexStorage3DMultisample, GetInternalformativ, TexParameter{if}*, GetTexParameter{if}v and
        GetTexLevelParameter{if}v. Also, the texture object indicated by the {@code texture} argument to FramebufferTextureLayer can be
        TEXTURE_2D_MULTISAMPLE_ARRAY.
        """,

        "TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9102
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY"..0x9105
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910B,
        "INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910C,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910D
    )

    void(
        "TexStorage3DMultisample",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", ""),
        GLsizei.IN("depth", ""),
        GLboolean.IN("fixedsamplelocations", "")
    )
}