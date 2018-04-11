/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL13 = "GL13".nativeClassGL("GL13") {
    documentation =
        """
        The core OpenGL 1.3 functionality.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "texture_compression"),
            registryLinkTo("ARB", "texture_cube_map"),
            registryLinkTo("ARB", "multisample"),
            registryLinkTo("ARB", "multitexture"),
            registryLinkTo("ARB", "texture_env_add"),
            registryLinkTo("ARB", "texture_env_combine"),
            registryLinkTo("ARB", "texture_env_dot3"),
            registryLinkTo("ARB", "texture_border_clamp"),
            registryLinkTo("ARB", "transpose_matrix")
        )}
        """

    // ARB_texture_compression

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.",

        "COMPRESSED_ALPHA"..0x84E9,
        "COMPRESSED_LUMINANCE"..0x84EA,
        "COMPRESSED_LUMINANCE_ALPHA"..0x84EB,
        "COMPRESSED_INTENSITY"..0x84EC,
        "COMPRESSED_RGB"..0x84ED,
        "COMPRESSED_RGBA"..0x84EE
    )

    IntConstant(
        "Accepted by the {@code target} parameter of Hint and the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

        "TEXTURE_COMPRESSION_HINT"..0x84EF
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexLevelParameter.",

        "TEXTURE_COMPRESSED_IMAGE_SIZE"..0x86A0,
        "TEXTURE_COMPRESSED"..0x86A1
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

        "NUM_COMPRESSED_TEXTURE_FORMATS"..0x86A2,
        "COMPRESSED_TEXTURE_FORMATS"..0x86A3
    )

    // KHR_texture_compression_astc_ldr formats are only accepted in CompressedTexImage* functions
    val CompressTexImageFormats = "$SPECIFIC_COMPRESSED_TEXTURE_INTERNAL_FORMATS @##KHRTextureCompressionASTCLDR"

    void(
        "CompressedTexImage3D",
        "Specifies a three-dimensional texture image in a compressed format.",

        GLenum.IN("target", "the target texture", "$TEXTURE_3D_TARGETS $PROXY_TEXTURE_3D_TARGETS"),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        GLenum.IN("internalformat", "the format of the compressed image data", CompressTexImageFormats),
        GLsizei.IN("width", "the width of the texture image"),
        GLsizei.IN("height", "the height of the texture image"),
        GLsizei.IN("depth", "the depth of the texture image"),
        GLint.IN("border", "must be 0"),
        AutoSize("data")..GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
        PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("data", "a pointer to the compressed image data")
    )

    void(
        "CompressedTexImage2D",
        "Specifies a two-dimensional texture image in a compressed format.",

        GLenum.IN("target", "the target texture", "$TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS"),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        GLenum.IN("internalformat", "the format of the compressed image data", CompressTexImageFormats),
        GLsizei.IN("width", "the width of the texture image"),
        GLsizei.IN("height", "the height of the texture image"),
        GLint.IN("border", "must be 0"),
        AutoSize("data")..GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
        PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("data", "a pointer to the compressed image data")
    )

    void(
        "CompressedTexImage1D",
        "Specifies a one-dimensional texture image in a compressed format.",

        GLenum.IN("target", "the target texture", "#TEXTURE_1D #PROXY_TEXTURE_1D"),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        GLenum.IN("internalformat", "the format of the compressed image data", CompressTexImageFormats),
        GLsizei.IN("width", "the width of the texture image"),
        GLint.IN("border", "must be 0"),
        AutoSize("data")..GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
        PIXEL_UNPACK_BUFFER..nullable..void.const.p.IN("data", "a pointer to the compressed image data")
    )

    void(
        "CompressedTexSubImage3D",
        "Respecifies only a cubic subregion of an existing 3D texel array, with incoming data stored in a specific compressed image format.",

        GLenum.IN("target", "the target texture", TEXTURE_3D_TARGETS),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        GLint.IN("xoffset", "a texel offset in the x direction within the texture array"),
        GLint.IN("yoffset", "a texel offset in the y direction within the texture array"),
        GLint.IN("zoffset", "a texel offset in the z direction within the texture array"),
        GLsizei.IN("width", "the width of the texture subimage"),
        GLsizei.IN("height", "the height of the texture subimage"),
        GLsizei.IN("depth", "the depth of the texture subimage"),
        GLenum.IN("format", "the format of the compressed image data stored at address {@code data}", CompressTexImageFormats),
        AutoSize("data")..GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
        PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "a pointer to the compressed image data")
    )

    void(
        "CompressedTexSubImage2D",
        "Respecifies only a rectangular subregion of an existing 2D texel array, with incoming data stored in a specific compressed image format.",

        GLenum.IN("target", "the target texture", TEXTURE_2D_TARGETS),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        GLint.IN("xoffset", "a texel offset in the x direction within the texture array"),
        GLint.IN("yoffset", "a texel offset in the y direction within the texture array"),
        GLsizei.IN("width", "the width of the texture subimage"),
        GLsizei.IN("height", "the height of the texture subimage"),
        GLenum.IN("format", "the format of the compressed image data stored at address {@code data}", CompressTexImageFormats),
        AutoSize("data")..GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
        PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "a pointer to the compressed image data")
    )

    void(
        "CompressedTexSubImage1D",
        "Respecifies only a subregion of an existing 1D texel array, with incoming data stored in a specific compressed image format.",

        GLenum.IN("target", "the target texture", "#TEXTURE_1D"),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        GLint.IN("xoffset", "a texel offset in the x direction within the texture array"),
        GLsizei.IN("width", "the width of the texture subimage"),
        GLenum.IN("format", "the format of the compressed image data stored at address {@code data}", CompressTexImageFormats),
        AutoSize("data")..GLsizei.IN("imageSize", "the number of unsigned bytes of image data starting at the address specified by {@code data}"),
        PIXEL_UNPACK_BUFFER..void.const.p.IN("data", "a pointer to the compressed image data")
    )

    void(
        "GetCompressedTexImage",
        "Returns a compressed texture image.",

        GLenum.IN("target", "the target texture", "#TEXTURE_1D $TEXTURE_2D_FACE_TARGETS $TEXTURE_3D_TARGETS"),
        GLint.IN("level", "the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image."),
        Check(
            expression = "GL11.glGetTexLevelParameteri(target, level, GL_TEXTURE_COMPRESSED_IMAGE_SIZE)", debug = true
        )..PIXEL_PACK_BUFFER..void.p.OUT("pixels", "a buffer in which to return the compressed texture image")
    )

    // ARB_texture_cube_map

    IntConstant(
        "Accepted by the {@code param} parameters of TexGend, TexGenf, and TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE.",

        "NORMAL_MAP"..0x8511,
        "REFLECTION_MAP"..0x8512
    )

    IntConstant(
        """
        When the {@code pname} parameter of TexGendv, TexGenfv, and TexGeniv is TEXTURE_GEN_MODE, then the array {@code params} may also contain NORMAL_MAP
        or REFLECTION_MAP. Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled, and by the {@code pname} parameter of GetBooleanv,
        GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf,
        TexParameteri, TexParameterfv, and TexParameteriv.
        """,

        "TEXTURE_CUBE_MAP"..0x8513
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "TEXTURE_BINDING_CUBE_MAP"..0x8514
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and
        CopySubTexImage2D.
        """,

        "TEXTURE_CUBE_MAP_POSITIVE_X"..0x8515,
        "TEXTURE_CUBE_MAP_NEGATIVE_X"..0x8516,
        "TEXTURE_CUBE_MAP_POSITIVE_Y"..0x8517,
        "TEXTURE_CUBE_MAP_NEGATIVE_Y"..0x8518,
        "TEXTURE_CUBE_MAP_POSITIVE_Z"..0x8519,
        "TEXTURE_CUBE_MAP_NEGATIVE_Z"..0x851A
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and TexImage2D.",

        "PROXY_TEXTURE_CUBE_MAP"..0x851B
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MAX_CUBE_MAP_TEXTURE_SIZE"..0x851C
    )

    // ARB_multisample

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "MULTISAMPLE"..0x809D,
        "SAMPLE_ALPHA_TO_COVERAGE"..0x809E,
        "SAMPLE_ALPHA_TO_ONE"..0x809F,
        "SAMPLE_COVERAGE"..0x80A0
    )

    IntConstant(
        "Accepted by the {@code mask} parameter of PushAttrib.",

        "MULTISAMPLE_BIT"..0x20000000
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "SAMPLE_BUFFERS"..0x80A8,
        "SAMPLES"..0x80A9,
        "SAMPLE_COVERAGE_VALUE"..0x80AA,
        "SAMPLE_COVERAGE_INVERT"..0x80AB
    )

    void(
        "SampleCoverage",
        """
        Specifies multisample coverage parameters.

        Multisampling samples a pixel multiple times at various implementation-dependent subpixel locations to generate antialiasing effects. Multisampling
        transparently antialiases points, lines, polygons, and images if it is enabled.

        {@code value} is used in constructing a temporary mask used in determining which samples will be used in resolving the final fragment color. This mask
        is bitwise-ANDed with the coverage mask generated from the multisampling computation. If the {@code invert} flag is set, the temporary mask is inverted
        (all bits flipped) and then the bitwise-AND is computed.

        If an implementation does not have any multisample buffers available, or multisampling is disabled, rasterization occurs with only a single sample
        computing a pixel's final RGB color.

        Provided an implementation supports multisample buffers, and multisampling is enabled, then a pixel's final color is generated by combining several
        samples per pixel. Each sample contains color, depth, and stencil information, allowing those operations to be performed on each sample.
        """,

        GLfloat.IN("value", "a sample coverage value. The value is clamped to the range [0, 1]. The initial value is 1.0."),
        GLboolean.IN("invert", "if the coverage masks should be inverted. The initial value is false.")
    )

    // ARB_multitexture

    IntConstant(
        "Accepted by the {@code texture} parameter of ActiveTexture and MultiTexCoord.",

        "TEXTURE0"..0x84C0,
        "TEXTURE1"..0x84C1,
        "TEXTURE2"..0x84C2,
        "TEXTURE3"..0x84C3,
        "TEXTURE4"..0x84C4,
        "TEXTURE5"..0x84C5,
        "TEXTURE6"..0x84C6,
        "TEXTURE7"..0x84C7,
        "TEXTURE8"..0x84C8,
        "TEXTURE9"..0x84C9,
        "TEXTURE10"..0x84CA,
        "TEXTURE11"..0x84CB,
        "TEXTURE12"..0x84CC,
        "TEXTURE13"..0x84CD,
        "TEXTURE14"..0x84CE,
        "TEXTURE15"..0x84CF,
        "TEXTURE16"..0x84D0,
        "TEXTURE17"..0x84D1,
        "TEXTURE18"..0x84D2,
        "TEXTURE19"..0x84D3,
        "TEXTURE20"..0x84D4,
        "TEXTURE21"..0x84D5,
        "TEXTURE22"..0x84D6,
        "TEXTURE23"..0x84D7,
        "TEXTURE24"..0x84D8,
        "TEXTURE25"..0x84D9,
        "TEXTURE26"..0x84DA,
        "TEXTURE27"..0x84DB,
        "TEXTURE28"..0x84DC,
        "TEXTURE29"..0x84DD,
        "TEXTURE30"..0x84DE,
        "TEXTURE31"..0x84DF
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "ACTIVE_TEXTURE"..0x84E0,
        "CLIENT_ACTIVE_TEXTURE"..0x84E1,
        "MAX_TEXTURE_UNITS"..0x84E2
    )

    void(
        "ActiveTexture",
        """
        Selects which texture unit subsequent texture state calls will affect. The number of texture units an implementation supports is implementation
        dependent.
        """,

        GLenum.IN("texture", "which texture unit to make active", "#TEXTURE0 GL_TEXTURE[1-31]")
    )

    DeprecatedGL..void(
        "ClientActiveTexture",
        """
        Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
        DisableClientState with parameter TEXTURE_COORD_ARRAY.
        """,

        GLenum.IN("texture", "which texture coordinate array to make active", "#TEXTURE0 GL_TEXTURE[1-31]")
    )

    // MultiTexCoord functions javadoc
    val texCoordTex = "the coordinate set to be modified"
    val texCoordS = "the s component of the current texture coordinates"
    val texCoordT = "the t component of the current texture coordinates"
    val texCoordR = "the r component of the current texture coordinates"
    val texCoordQ = "the q component of the current texture coordinates"
    val texCoordBuffer = "the texture coordinate buffer"

    DeprecatedGL..void(
        "MultiTexCoord1f",
        "Sets the current one-dimensional texture coordinate for the specified texture coordinate set. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.",

        GLenum.IN("texture", texCoordTex),
        GLfloat.IN("s", texCoordS)
    )

    DeprecatedGL..void("MultiTexCoord1s", "Short version of #MultiTexCoord1f().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS))
    DeprecatedGL..void("MultiTexCoord1i", "Integer version of #MultiTexCoord1f().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS))
    DeprecatedGL..void("MultiTexCoord1d", "Double version of #MultiTexCoord1f().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS))

    DeprecatedGL..void("MultiTexCoord1fv", "Pointer version of #MultiTexCoord1f().", GLenum.IN("texture", texCoordTex), Check(1)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord1sv", "Pointer version of #MultiTexCoord1s().", GLenum.IN("texture", texCoordTex), Check(1)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord1iv", "Pointer version of #MultiTexCoord1i().", GLenum.IN("texture", texCoordTex), Check(1)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord1dv", "Pointer version of #MultiTexCoord1d().", GLenum.IN("texture", texCoordTex), Check(1)..GLdouble.const.p.IN("v", texCoordBuffer))

    DeprecatedGL..void(
        "MultiTexCoord2f",
        "Sets the current two-dimensional texture coordinate for the specified texture coordinate set. {@code r} is implicitly set to 0 and {@code q} to 1.",

        GLenum.IN("texture", texCoordTex),
        GLfloat.IN("s", texCoordS),
        GLfloat.IN("t", texCoordT)
    )

    DeprecatedGL..void("MultiTexCoord2s", "Short version of #MultiTexCoord2f().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT))
    DeprecatedGL..void("MultiTexCoord2i", "Integer version of #MultiTexCoord2f().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS), GLint.IN("t", texCoordT))
    DeprecatedGL..void("MultiTexCoord2d", "Double version of #MultiTexCoord2f().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT))

    DeprecatedGL..void("MultiTexCoord2fv", "Pointer version of #MultiTexCoord2f().", GLenum.IN("texture", texCoordTex), Check(2)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord2sv", "Pointer version of #MultiTexCoord2s().", GLenum.IN("texture", texCoordTex), Check(2)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord2iv", "Pointer version of #MultiTexCoord2i().", GLenum.IN("texture", texCoordTex), Check(2)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord2dv", "Pointer version of #MultiTexCoord2d().", GLenum.IN("texture", texCoordTex), Check(2)..GLdouble.const.p.IN("v", texCoordBuffer))

    DeprecatedGL..void(
        "MultiTexCoord3f",
        "Sets the current three-dimensional texture coordinate for the specified texture coordinate set. {@code q} is implicitly set to 1.",

        GLenum.IN("texture", texCoordTex),
        GLfloat.IN("s", texCoordS),
        GLfloat.IN("t", texCoordT),
        GLfloat.IN("r", texCoordR)
    )

    DeprecatedGL..void("MultiTexCoord3s", "Short version of #MultiTexCoord3f().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR))
    DeprecatedGL..void("MultiTexCoord3i", "Integer version of #MultiTexCoord3f().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR))
    DeprecatedGL..void("MultiTexCoord3d", "Double version of #MultiTexCoord3f().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR))

    DeprecatedGL..void("MultiTexCoord3fv", "Pointer version of #MultiTexCoord3f().", GLenum.IN("texture", texCoordTex), Check(3)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord3sv", "Pointer version of #MultiTexCoord3s().", GLenum.IN("texture", texCoordTex), Check(3)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord3iv", "Pointer version of #MultiTexCoord3i().", GLenum.IN("texture", texCoordTex), Check(3)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord3dv", "Pointer version of #MultiTexCoord3d().", GLenum.IN("texture", texCoordTex), Check(3)..GLdouble.const.p.IN("v", texCoordBuffer))

    DeprecatedGL..void(
        "MultiTexCoord4f",
        "Sets the current four-dimensional texture coordinate for the specified texture coordinate set.",

        GLenum.IN("texture", texCoordTex),
        GLfloat.IN("s", texCoordS),
        GLfloat.IN("t", texCoordT),
        GLfloat.IN("r", texCoordR),
        GLfloat.IN("q", texCoordQ)
    )

    DeprecatedGL..void("MultiTexCoord4s", "Short version of #MultiTexCoord4f().", GLenum.IN("texture", texCoordTex), GLshort.IN("s", texCoordS), GLshort.IN("t", texCoordT), GLshort.IN("r", texCoordR), GLshort.IN("q", texCoordQ))
    DeprecatedGL..void("MultiTexCoord4i", "Integer version of #MultiTexCoord4f().", GLenum.IN("texture", texCoordTex), GLint.IN("s", texCoordS), GLint.IN("t", texCoordT), GLint.IN("r", texCoordR), GLint.IN("q", texCoordQ))
    DeprecatedGL..void("MultiTexCoord4d", "Double version of #MultiTexCoord4f().", GLenum.IN("texture", texCoordTex), GLdouble.IN("s", texCoordS), GLdouble.IN("t", texCoordT), GLdouble.IN("r", texCoordR), GLdouble.IN("q", texCoordQ))

    DeprecatedGL..void("MultiTexCoord4fv", "Pointer version of #MultiTexCoord4f().", GLenum.IN("texture", texCoordTex), Check(4)..GLfloat.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord4sv", "Pointer version of #MultiTexCoord4s().", GLenum.IN("texture", texCoordTex), Check(4)..GLshort.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord4iv", "Pointer version of #MultiTexCoord4i().", GLenum.IN("texture", texCoordTex), Check(4)..GLint.const.p.IN("v", texCoordBuffer))
    DeprecatedGL..void("MultiTexCoord4dv", "Pointer version of #MultiTexCoord4d().", GLenum.IN("texture", texCoordTex), Check(4)..GLdouble.const.p.IN("v", texCoordBuffer))

    // ARB_texture_env_combine

    IntConstant(
        "Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is TEXTURE_ENV_MODE.",

        "COMBINE"..0x8570
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code target} parameter value is TEXTURE_ENV.",

        "COMBINE_RGB"..0x8571,
        "COMBINE_ALPHA"..0x8572,
        "SOURCE0_RGB"..0x8580,
        "SOURCE1_RGB"..0x8581,
        "SOURCE2_RGB"..0x8582,
        "SOURCE0_ALPHA"..0x8588,
        "SOURCE1_ALPHA"..0x8589,
        "SOURCE2_ALPHA"..0x858A,
        "OPERAND0_RGB"..0x8590,
        "OPERAND1_RGB"..0x8591,
        "OPERAND2_RGB"..0x8592,
        "OPERAND0_ALPHA"..0x8598,
        "OPERAND1_ALPHA"..0x8599,
        "OPERAND2_ALPHA"..0x859A,
        "RGB_SCALE"..0x8573
    )

    IntConstant(
        """
        Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB or
        COMBINE_ALPHA.
        """,

        "ADD_SIGNED"..0x8574,
        "INTERPOLATE"..0x8575,
        "SUBTRACT"..0x84E7
    )

    IntConstant(
        """
        Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is SOURCE0_RGB,
        SOURCE1_RGB, SOURCE2_RGB, SOURCE0_ALPHA, SOURCE1_ALPHA, or SOURCE2_ALPHA.
        """,

        "CONSTANT"..0x8576,
        "PRIMARY_COLOR"..0x8577,
        "PREVIOUS"..0x8578
    )

    // ARB_texture_env_dot3

    IntConstant(
        "Accepted by the {@code params} parameter of TexEnvf, TexEnvi, TexEnvfv, and TexEnviv when the {@code pname} parameter value is COMBINE_RGB_ARB.",

        "DOT3_RGB"..0x86AE,
        "DOT3_RGBA"..0x86AF
    )

    // ARB_texture_border_clamp

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
        when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
        """,

        "CLAMP_TO_BORDER"..0x812D
    )

    // ARB_transpose_matrix

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "TRANSPOSE_MODELVIEW_MATRIX"..0x84E3,
        "TRANSPOSE_PROJECTION_MATRIX"..0x84E4,
        "TRANSPOSE_TEXTURE_MATRIX"..0x84E5,
        "TRANSPOSE_COLOR_MATRIX"..0x84E6
    )

    DeprecatedGL..void(
        "LoadTransposeMatrixf",
        """
        Sets the current matrix to a 4 &times; 4 matrix in row-major order.

        The matrix is stored as 16 consecutive values, i.e. as:
        ${table(
            tr(td("a1"), td("a2"), td("a3"), td("a4")),
            tr(td("a5"), td("a6"), td("a7"), td("a8")),
            tr(td("a9"), td("a10"), td("a11"), td("a12")),
            tr(td("a13"), td("a14"), td("a15"), td("a16")),
            matrix = true
        )}
        """,

        Check(16)..GLfloat.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "LoadTransposeMatrixd",
        "Double version of #LoadTransposeMatrixf().",

        Check(16)..GLdouble.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "MultTransposeMatrixf",
        "Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See #LoadTransposeMatrixf() for details.",

        Check(16)..GLfloat.const.p.IN("m", "the matrix data")
    )

    DeprecatedGL..void(
        "MultTransposeMatrixd",
        "Double version of #MultTransposeMatrixf().",

        Check(16)..GLdouble.const.p.IN("m", "the matrix data")
    )

}