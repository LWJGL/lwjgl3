/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL14C = "GL14C".nativeClassGL("GL14C") {
    extends = GL13C
    documentation =
        """
        The OpenGL functionality of a forward compatible context, up to version 1.4.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("NV", "blend_square"),
            "${registryLinkTo("ARB", "depth_texture")} and ${registryLinkTo("ARB", "shadow")}",
            registryLinkTo("EXT", "fog_coord"),
            registryLinkTo("EXT", "multi_draw_arrays"),
            registryLinkTo("ARB", "point_parameters"),
            registryLinkTo("EXT", "blend_func_separate"),
            registryLinkTo("EXT", "stencil_wrap"),
            registryLinkTo("ARB", "texture_env_crossbar"),
            registryLinkTo("EXT", "texture_lod_bias"),
            registryLinkTo("ARB", "texture_mirrored_repeat")
        )}
        """

    // EXT_blend_color

    IntConstant(
        "Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.",

        "CONSTANT_COLOR"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR"..0x8002,
        "CONSTANT_ALPHA"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA"..0x8004
    )

    void(
        "BlendColor",
        "Specifies the constant color C<sub>c</sub> to be used in blending.",

        GLfloat.IN("red", "the red color component"),
        GLfloat.IN("green", "the green color component"),
        GLfloat.IN("blue", "the blue color component"),
        GLfloat.IN("alpha", "the alpha color component")
    )

    // EXT_blend_minmax

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation.",

        "FUNC_ADD"..0x8006,
        "MIN"..0x8007,
        "MAX"..0x8008
    )

    void(
        "BlendEquation",
        "Controls the blend equations used for per-fragment blending.",

        GLenum.IN("mode", "the blend equation", "#FUNC_ADD #FUNC_SUBTRACT #FUNC_REVERSE_SUBTRACT #MIN #MAX")
    )

    // EXT_blend_subtract

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation.",

        "FUNC_SUBTRACT"..0x800A,
        "FUNC_REVERSE_SUBTRACT"..0x800B
    )

    // ARB_depth_texture

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D.",

        "DEPTH_COMPONENT16"..0x81A5,
        "DEPTH_COMPONENT24"..0x81A6,
        "DEPTH_COMPONENT32"..0x81A7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

        "TEXTURE_DEPTH_SIZE"..0x884A
    )

    // ARB_shadow

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

        "TEXTURE_COMPARE_MODE"..0x884C,
        "TEXTURE_COMPARE_FUNC"..0x884D
    )

    // EXT_multi_draw_arrays

    void(
        "MultiDrawArrays",
        "Renders multiple sets of primitives from array data.",

        GLenum.IN("mode", "the kind of primitives to render", CORE_PRIMITIVE_TYPES),
        GLint.const.p.IN("first", "an array of starting indices in the enabled arrays"),
        GLsizei.const.p.IN("count", "an array of the number of indices to be rendered"),
        AutoSize("first", "count")..GLsizei.IN("primcount", "the size of {@code first} and {@code count}")
    )

    void(
        "MultiDrawElements",
        """
        Renders multiple sets of primitives by specifying indices of array data elements.

        <b>LWJGL note</b>: Use org.lwjgl.system.MemoryUtil#memAddress() to retrieve pointers to the index buffers.
        """,

        GLenum.IN("mode", "the kind of primitives to render", CORE_PRIMITIVE_TYPES),
        GLsizei.p.IN("count", "an array of the elements counts"),
        GLenum.IN("type", "the type of the values in indices", "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"),
        void.const.p.p.IN("indices", "a pointer to the location where the indices are stored"),
        AutoSize("count", "indices")..GLsizei.IN("primcount", "the size of the {@code count} array")
    )

    // ARB_point_parameters

    IntConstant(
        "Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.",

        "POINT_FADE_THRESHOLD_SIZE"..0x8128
    )

    void(
        "PointParameterf",
        "Sets the float value of a pointer parameter.",

        GLenum.IN("pname", "the parameter to set", "#POINT_FADE_THRESHOLD_SIZE"),
        GLfloat.IN("param", "the parameter value")
    )

    void(
        "PointParameteri",
        "Integer version of #PointParameterf().",

        GLenum.IN("pname", "the parameter to set", "#POINT_FADE_THRESHOLD_SIZE"),
        GLint.IN("param", "the parameter value")
    )

    void(
        "PointParameterfv",
        "Pointer version of #PointParameterf().",

        GLenum.IN("pname", "the parameter to set"),
        Check(3)..GLfloat.const.p.IN("params", "the parameter value")
    )

    void(
        "PointParameteriv",
        "Pointer version of #PointParameteri().",

        GLenum.IN("pname", "the parameter to set"),
        Check(3)..GLint.const.p.IN("params", "the parameter value")
    )

    // EXT_blend_func_separate

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_DST_RGB"..0x80C8,
        "BLEND_SRC_RGB"..0x80C9,
        "BLEND_DST_ALPHA"..0x80CA,
        "BLEND_SRC_ALPHA"..0x80CB
    )

    void(
        "BlendFuncSeparate",
        "Specifies pixel arithmetic for RGB and alpha components separately.",

        GLenum.IN("sfactorRGB", "how the red, green, and blue blending factors are computed. The initial value is GL_ONE."),
        GLenum.IN("dfactorRGB", "how the red, green, and blue destination blending factors are computed. The initial value is GL_ZERO."),
        GLenum.IN("sfactorAlpha", "how the alpha source blending factor is computed. The initial value is GL_ONE."),
        GLenum.IN("dfactorAlpha", "how the alpha destination blending factor is computed. The initial value is GL_ZERO.")
    )

    // EXT_stencil_wrap

    IntConstant(
        "Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.",

        "INCR_WRAP"..0x8507,
        "DECR_WRAP"..0x8508
    )

    // EXT_texture_lod_bias

    IntConstant(
        """
        When the {@code target} parameter of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, TexEnviv, and TexEnvfv is TEXTURE_FILTER_CONTROL, then the value of
        {@code pname} may be.
        """,

        "TEXTURE_LOD_BIAS"..0x8501
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_TEXTURE_LOD_BIAS"..0x84FD
    )

    // ARB_texture_mirrored_repeat

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
        when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
        """,

        "MIRRORED_REPEAT"..0x8370
    )

}