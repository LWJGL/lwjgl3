/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL33 = "GL33".nativeClassGL("GL33") {
    extends = GL32
    documentation =
        """
        The OpenGL functionality up to version 3.3. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 3.3 implementations support revision 3.30 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "shader_bit_encoding"),
            registryLinkTo("ARB", "blend_func_extended"),
            registryLinkTo("ARB", "explicit_attrib_location"),
            registryLinkTo("ARB", "occlusion_query2"),
            registryLinkTo("ARB", "sampler_objects"),
            registryLinkTo("ARB", "texture_rgb10_a2ui"),
            registryLinkTo("ARB", "texture_swizzle"),
            registryLinkTo("ARB", "timer_query"),
            registryLinkTo("ARB", "instanced_arrays"),
            registryLinkTo("ARB", "vertex_type_2_10_10_10_rev")
        )}
        """

    // ARB_blend_func_extended

    IntConstant(
        """
        Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
        {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
        """,

        "SRC1_COLOR"..0x88F9,
        "ONE_MINUS_SRC1_COLOR"..0x88FA,
        "ONE_MINUS_SRC1_ALPHA"..0x88FB
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

        "MAX_DUAL_SOURCE_DRAW_BUFFERS"..0x88FC
    )

    reuse(GL33C, "BindFragDataLocationIndexed")
    reuse(GL33C, "GetFragDataIndex")

    // ARB_occlusion_query2

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "ANY_SAMPLES_PASSED"..0x8C2F
    )

    // ARB_sampler_objects

    IntConstant(
        "Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions.",

        "SAMPLER_BINDING"..0x8919
    )

    reuse(GL33C, "GenSamplers")
    reuse(GL33C, "DeleteSamplers")
    reuse(GL33C, "IsSampler")
    reuse(GL33C, "BindSampler")
    reuse(GL33C, "SamplerParameteri")
    reuse(GL33C, "SamplerParameterf")
    reuse(GL33C, "SamplerParameteriv")
    reuse(GL33C, "SamplerParameterfv")
    reuse(GL33C, "SamplerParameterIiv")
    reuse(GL33C, "SamplerParameterIuiv")
    reuse(GL33C, "GetSamplerParameteriv")
    reuse(GL33C, "GetSamplerParameterfv")
    reuse(GL33C, "GetSamplerParameterIiv")
    reuse(GL33C, "GetSamplerParameterIuiv")

    // ARB_texture_rgb10_a2ui

    IntConstant(
        """
        Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
        RenderbufferStorageMultisample.
        """,

        "RGB10_A2UI"..0x906F
    )

    // ARB_texture_swizzle

    IntConstant(
        "Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.",

        "TEXTURE_SWIZZLE_R"..0x8E42,
        "TEXTURE_SWIZZLE_G"..0x8E43,
        "TEXTURE_SWIZZLE_B"..0x8E44,
        "TEXTURE_SWIZZLE_A"..0x8E45
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv.",

        "TEXTURE_SWIZZLE_RGBA"..0x8E46
    )

    // ARB_timer_query

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "TIME_ELAPSED"..0x88BF
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
        GetInteger64v, GetFloatv, and GetDoublev.
        """,

        "TIMESTAMP"..0x8E28
    )

    reuse(GL33C, "QueryCounter")
    reuse(GL33C, "GetQueryObjecti64v")
    reuse(GL33C, "GetQueryObjectui64v")

    // ARB_instanced_arrays

    IntConstant(
        "Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv.",

        "VERTEX_ATTRIB_ARRAY_DIVISOR"..0x88FE
    )

    reuse(GL33C, "VertexAttribDivisor")

    // ARB_vertex_type_2_10_10_10_rev

    IntConstant(
        """
        Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
        VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.
        """,

        "INT_2_10_10_10_REV"..0x8D9F
    )

    // Packed functions javadoc
    val packedType = "type of packing used on the data"
    val packedTypes = "#INT_2_10_10_10_REV #UNSIGNED_INT_2_10_10_10_REV"
    val packedValue = "the packed value"

    DeprecatedGL..void("VertexP2ui", "Packed component version of #Vertex2f().", GLenum("type", packedType, packedTypes), GLuint("value", "the packed value"))
    DeprecatedGL..void("VertexP3ui", "Packed component version of #Vertex3f().", GLenum("type", packedType, packedTypes), GLuint("value", "the packed value"))
    DeprecatedGL..void("VertexP4ui", "Packed component version of #Vertex4f().", GLenum("type", packedType, packedTypes), GLuint("value", "the packed value"))

    DeprecatedGL..void("VertexP2uiv", "Pointer version of #VertexP2ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("value", packedValue))
    DeprecatedGL..void("VertexP3uiv", "Pointer version of #VertexP3ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("value", packedValue))
    DeprecatedGL..void("VertexP4uiv", "Pointer version of #VertexP4ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("value", packedValue))

    DeprecatedGL..void("TexCoordP1ui", "Packed component version of #TexCoord1f().", GLenum("type", packedType, packedTypes), GLuint("coords", packedValue))
    DeprecatedGL..void("TexCoordP2ui", "Packed component version of #TexCoord2f().", GLenum("type", packedType, packedTypes), GLuint("coords", packedValue))
    DeprecatedGL..void("TexCoordP3ui", "Packed component version of #TexCoord3f().", GLenum("type", packedType, packedTypes), GLuint("coords", packedValue))
    DeprecatedGL..void("TexCoordP4ui", "Packed component version of #TexCoord4f().", GLenum("type", packedType, packedTypes), GLuint("coords", packedValue))

    DeprecatedGL..void("TexCoordP1uiv", "Pointer version of #TexCoordP1ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))
    DeprecatedGL..void("TexCoordP2uiv", "Pointer version of #TexCoordP2ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))
    DeprecatedGL..void("TexCoordP3uiv", "Pointer version of #TexCoordP3ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))
    DeprecatedGL..void("TexCoordP4uiv", "Pointer version of #TexCoordP4ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))

    val texCoordTex = "the coordinate set to be modified"

    DeprecatedGL..void("MultiTexCoordP1ui", "Packed component version of #MultiTexCoord1f().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedType), GLuint("coords", packedValue))
    DeprecatedGL..void("MultiTexCoordP2ui", "Packed component version of #MultiTexCoord2f().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedType), GLuint("coords", packedValue))
    DeprecatedGL..void("MultiTexCoordP3ui", "Packed component version of #MultiTexCoord3f().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedType), GLuint("coords", packedValue))
    DeprecatedGL..void("MultiTexCoordP4ui", "Packed component version of #MultiTexCoord4f().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedType), GLuint("coords", packedValue))

    DeprecatedGL..void("MultiTexCoordP1uiv", "Pointer version of #MultiTexCoordP1ui().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))
    DeprecatedGL..void("MultiTexCoordP2uiv", "Pointer version of #MultiTexCoordP2ui().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))
    DeprecatedGL..void("MultiTexCoordP3uiv", "Pointer version of #MultiTexCoordP3ui().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))
    DeprecatedGL..void("MultiTexCoordP4uiv", "Pointer version of #MultiTexCoordP4ui().", GLenum("texture", texCoordTex), GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))

    DeprecatedGL..void("NormalP3ui", "Packed component version of #Normal3f().", GLenum("type", packedType, packedTypes), GLuint("coords", packedValue))

    DeprecatedGL..void("NormalP3uiv", "Pointer version #NormalP3ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("coords", packedValue))

    DeprecatedGL..void("ColorP3ui", "Packed component version of #Color3f().", GLenum("type", packedType, packedTypes), GLuint("color", packedValue))
    DeprecatedGL..void("ColorP4ui", "Packed component version of #Color4f().", GLenum("type", packedType, packedTypes), GLuint("color", packedValue))

    DeprecatedGL..void("ColorP3uiv", "Pointer version of #ColorP3ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("color", packedValue))
    DeprecatedGL..void("ColorP4uiv", "Pointer version of #ColorP4ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("color", packedValue))

    DeprecatedGL..void("SecondaryColorP3ui", "Packed component version of #SecondaryColor3f().", GLenum("type", packedType, packedTypes), GLuint("color", packedValue))
    DeprecatedGL..void("SecondaryColorP3uiv", "Pointer version of #SecondaryColorP3ui().", GLenum("type", packedType, packedTypes), Check(1)..GLuint.const.p("color", packedValue))

    reuse(GL33C, "VertexAttribP1ui")
    reuse(GL33C, "VertexAttribP2ui")
    reuse(GL33C, "VertexAttribP3ui")
    reuse(GL33C, "VertexAttribP4ui")

    reuse(GL33C, "VertexAttribP1uiv")
    reuse(GL33C, "VertexAttribP2uiv")
    reuse(GL33C, "VertexAttribP3uiv")
    reuse(GL33C, "VertexAttribP4uiv")
}