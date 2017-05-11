/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_transform_feedback = "EXTTransformFeedback".nativeClassGL("EXT_transform_feedback", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new mode to the GL, called transform feedback, which records selected vertex attributes for each primitive processed by the
        GL. The selected attributes are written into buffer objects, and can be written with each attribute in a separate buffer object or with all attributes
        interleaved into a single buffer object. If a geometry shader is active, the primitives recorded are those emitted by the geometry shader. Otherwise,
        transform feedback captures primitives whose vertices are transformed by a vertex shader. In either case, the primitives captured are those generated
        prior to clipping. Transform feedback mode captures the values of specified varying variables emitted from GLSL vertex or geometry shaders.

        The vertex data recorded in transform feedback mode is stored into buffer objects as an array of vertex attributes. The regular representation and the
        use of buffer objects allows the recorded data to be processed directly by the GL without requiring CPU intervention to copy data. In particular,
        transform feedback data can be used for vertex arrays (via vertex buffer objects), as the source for pixel data (via pixel buffer objects), as shader
        constant data (via the ${registryLinkTo("NV", "parameter_buffer_object")} or ${EXT_bindable_uniform.link} extensions), or via any other extension that
        makes use of buffer objects.

        This extension introduces new query object support to allow transform feedback mode to operate asynchronously. Query objects allow applications to
        determine when transform feedback results are complete, as well as the number of primitives processed and written back to buffer objects while in
        transform feedback mode. This extension also provides a new rasterizer discard enable, which allows applications to use transform feedback to capture
        vertex attributes without rendering anything.

        Requires ${GL20.core} or ${ARB_shader_objects.link}. ${GL30.promoted}
        """

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
        BindBufferRangeEXT, BindBufferOffsetEXT and BindBufferBaseEXT.
        """,

        "TRANSFORM_FEEDBACK_BUFFER_EXT"..0x8C8E
    )

    IntConstant(
        "Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT.",

        "TRANSFORM_FEEDBACK_BUFFER_START_EXT"..0x8C84,
        "TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT"..0x8C85
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT, and by the {@code pname} parameter of GetBooleanv,
        GetDoublev, GetIntegerv, and GetFloatv.
        """,

        "TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT"..0x8C8F
    )

    IntConstant(
        "Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryingsEXT.",

        "INTERLEAVED_ATTRIBS_EXT"..0x8C8C,
        "SEPARATE_ATTRIBS_EXT"..0x8C8D
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "PRIMITIVES_GENERATED_EXT"..0x8C87,
        "TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT"..0x8C88
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "RASTERIZER_DISCARD_EXT"..0x8C89
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT"..0x8C8A,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT"..0x8C8B,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT"..0x8C80
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "TRANSFORM_FEEDBACK_VARYINGS_EXT"..0x8C83,
        "TRANSFORM_FEEDBACK_BUFFER_MODE_EXT"..0x8C7F,
        "TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT"..0x8C76
    )

    void(
        "BindBufferRangeEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        GLsizeiptr.IN("size", "")
    )

    void(
        "BindBufferOffsetEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", "")
    )

    void(
        "BindBufferBaseEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        GLuint.IN("buffer", "")
    )

    void(
        "BeginTransformFeedbackEXT",
        "",

        GLenum.IN("primitiveMode", "")
    )

    void(
        "EndTransformFeedbackEXT",
        ""
    )

    void(
        "TransformFeedbackVaryingsEXT",
        "",

        GLuint.IN("program", ""),
        AutoSize("varyings")..GLsizei.IN("count", ""),
        PointerArray(GLcharASCII_p, "varying")..const..GLcharASCII_p.const.p.IN("varyings", ""),
        GLenum.IN("bufferMode", "")
    )

    void(
        "GetTransformFeedbackVaryingEXT",
        "",

        GLuint.IN("program", ""),
        GLuint.IN("index", ""),
        AutoSize("name")..GLsizei.IN("bufSize", ""),
        Check(1)..nullable..GLsizei_p.OUT("length", ""),
        Check(1)..GLsizei_p.OUT("size", ""),
        Check(1)..GLenum_p.OUT("type", ""),
        Return("length", """GL.getCapabilities().OpenGL20
            ? GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)
            : ARBShaderObjects.glGetObjectParameteriARB(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)""")..GLcharASCII_p.OUT("name", "")
    )

    void(
        "GetIntegerIndexedvEXT",
        "",

        GLenum.IN("param", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLint_p.OUT("values", "")
    )

    void(
        "GetBooleanIndexedvEXT",
        "",

        GLenum.IN("param", ""),
        GLuint.IN("index", ""),
        Check(1)..ReturnParam..GLboolean_p.OUT("values", "")
    )
}