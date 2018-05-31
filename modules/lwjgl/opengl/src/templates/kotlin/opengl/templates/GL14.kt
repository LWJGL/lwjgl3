/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL14 = "GL14".nativeClassGL("GL14") {
    extends = GL13
    documentation =
        """
        The OpenGL functionality up to version 1.4. Includes the deprecated symbols of the Compatibility Profile.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("SGIS", "generate_mipmap"),
            registryLinkTo("NV", "blend_square"),
            "${registryLinkTo("ARB", "depth_texture")} and ${registryLinkTo("ARB", "shadow")}",
            registryLinkTo("EXT", "fog_coord"),
            registryLinkTo("EXT", "multi_draw_arrays"),
            registryLinkTo("ARB", "point_parameters"),
            registryLinkTo("EXT", "secondary_color"),
            registryLinkTo("EXT", "blend_func_separate"),
            registryLinkTo("EXT", "stencil_wrap"),
            registryLinkTo("ARB", "texture_env_crossbar"),
            registryLinkTo("EXT", "texture_lod_bias"),
            registryLinkTo("ARB", "texture_mirrored_repeat"),
            registryLinkTo("ARB", "window_pos")
        )}
        """

    // SGIS_generate_mipmap

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

        "GENERATE_MIPMAP"..0x8191
    )

    IntConstant(
        "Accepted by the {@code target} parameter of Hint, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "GENERATE_MIPMAP_HINT"..0x8192
    )

    // EXT_blend_color

    IntConstant(
        "Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc.",

        "CONSTANT_COLOR"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR"..0x8002,
        "CONSTANT_ALPHA"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA"..0x8004
    )

    GL14C reuse "BlendColor"

    // EXT_blend_minmax

    IntConstant(
        "Accepted by the {@code mode} parameter of BlendEquation.",

        "FUNC_ADD"..0x8006,
        "MIN"..0x8007,
        "MAX"..0x8008
    )

    GL14C reuse "BlendEquation"

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

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

        "DEPTH_TEXTURE_MODE"..0x884B
    )

    // ARB_shadow

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv.",

        "TEXTURE_COMPARE_MODE"..0x884C,
        "TEXTURE_COMPARE_FUNC"..0x884D
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
        TEXTURE_COMPARE_MODE.
        """,

        "COMPARE_R_TO_TEXTURE"..0x884E
    )

    // EXT_fog_coord

    IntConstant(
        "Accepted by the {@code pname} parameter of Fogi and Fogf.",

        "FOG_COORDINATE_SOURCE"..0x8450
    )

    IntConstant(
        "Accepted by the {@code param} parameter of Fogi and Fogf.",

        "FOG_COORDINATE"..0x8451,
        "FRAGMENT_DEPTH"..0x8452
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CURRENT_FOG_COORDINATE"..0x8453,
        "FOG_COORDINATE_ARRAY_TYPE"..0x8454,
        "FOG_COORDINATE_ARRAY_STRIDE"..0x8455
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetPointerv.",

        "FOG_COORDINATE_ARRAY_POINTER"..0x8456
    )

    IntConstant(
        "Accepted by the {@code array} parameter of EnableClientState and DisableClientState.",

        "FOG_COORDINATE_ARRAY"..0x8457
    )

    DeprecatedGL..void(
        "FogCoordf",
        "Sets the current fog coordinate.",

        GLfloat.IN("coord", "the fog coordinate value")
    )

    DeprecatedGL..void(
        "FogCoordd",
        "Double version of #FogCoordf().",

        GLdouble.IN("coord", "the fog coordinate value")
    )

    DeprecatedGL..void(
        "FogCoordfv",
        "Pointer version of #FogCoordf().",

        Check(1)..GLfloat.const.p.IN("coord", "the fog coordinate value")
    )

    DeprecatedGL..void(
        "FogCoorddv",
        "Pointer version of #FogCoordd().",

        Check(1)..GLdouble.const.p.IN("coord", "the fog coordinate value")
    )

    OffHeapOnly..DeprecatedGL..void(
        "FogCoordPointer",
        "Specifies the location and organization of a fog coordinate array.",

        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            "#HALF_FLOAT #FLOAT #DOUBLE"
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the fog coordinate array data")
    )

    // EXT_multi_draw_arrays

    GL14C reuse "MultiDrawArrays"
    GL14C reuse "MultiDrawElements"

    // ARB_point_parameters

    IntConstant(
        "Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get.",

        "POINT_SIZE_MIN"..0x8126,
        "POINT_SIZE_MAX"..0x8127,
        "POINT_FADE_THRESHOLD_SIZE"..0x8128,
        "POINT_DISTANCE_ATTENUATION"..0x8129
    )

    GL14C reuse "PointParameterf"
    GL14C reuse "PointParameteri"
    GL14C reuse "PointParameterfv"
    GL14C reuse "PointParameteriv"

    // EXT_secondary_color

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "COLOR_SUM"..0x8458
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CURRENT_SECONDARY_COLOR"..0x8459,
        "SECONDARY_COLOR_ARRAY_SIZE"..0x845A,
        "SECONDARY_COLOR_ARRAY_TYPE"..0x845B,
        "SECONDARY_COLOR_ARRAY_STRIDE"..0x845C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetPointerv.",

        "SECONDARY_COLOR_ARRAY_POINTER"..0x845D
    )

    IntConstant(
        "Accepted by the {@code array} parameter of EnableClientState and DisableClientState.",

        "SECONDARY_COLOR_ARRAY"..0x845E
    )

    // Secondary color functions javadoc
    val colorRed = "the red component of the current secondary color"
    val colorGreen = "the green component of the current secondary color"
    val colorBlue = "the blue component of the current secondary color"
    val colorBuffer = "the secondary color buffer"

    DeprecatedGL..void(
        "SecondaryColor3b",
        "Sets the R, G, and B components of the current secondary color. The alpha component is set to 1.0.",

        GLbyte.IN("red", colorRed),
        GLbyte.IN("green", colorGreen),
        GLbyte.IN("blue", colorBlue)
    )
    DeprecatedGL..void("SecondaryColor3s", "Short version of #SecondaryColor3b()", GLshort.IN("red", colorRed), GLshort.IN("green", colorGreen), GLshort.IN("blue", colorBlue))
    DeprecatedGL..void("SecondaryColor3i", "Integer version of #SecondaryColor3b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))
    DeprecatedGL..void("SecondaryColor3f", "Float version of #SecondaryColor3b()", GLfloat.IN("red", colorRed), GLfloat.IN("green", colorGreen), GLfloat.IN("blue", colorBlue))
    DeprecatedGL..void("SecondaryColor3d", "Double version of #SecondaryColor3b()", GLdouble.IN("red", colorRed), GLdouble.IN("green", colorGreen), GLdouble.IN("blue", colorBlue))
    DeprecatedGL..void("SecondaryColor3ub", "Unsigned version of #SecondaryColor3b()", GLubyte.IN("red", colorRed), GLubyte.IN("green", colorGreen), GLubyte.IN("blue", colorBlue))
    DeprecatedGL..void("SecondaryColor3us", "Unsigned short version of #SecondaryColor3b()", GLushort.IN("red", colorRed), GLushort.IN("green", colorGreen), GLushort.IN("blue", colorBlue))
    DeprecatedGL..void("SecondaryColor3ui", "Unsigned int version of #SecondaryColor3b()", GLint.IN("red", colorRed), GLint.IN("green", colorGreen), GLint.IN("blue", colorBlue))

    DeprecatedGL..void("SecondaryColor3bv", "Byte pointer version of #SecondaryColor3b().", Check(3)..GLbyte.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3sv", "Pointer version of #SecondaryColor3s().", Check(3)..GLshort.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3iv", "Pointer version of #SecondaryColor3i().", Check(3)..GLint.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3fv", "Pointer version of #SecondaryColor3f().", Check(3)..GLfloat.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3dv", "Pointer version of #SecondaryColor3d().", Check(3)..GLdouble.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3ubv", "Pointer version of #SecondaryColor3ub().", Check(3)..GLubyte.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3usv", "Pointer version of #SecondaryColor3us().", Check(3)..GLushort.const.p.IN("v", colorBuffer))
    DeprecatedGL..void("SecondaryColor3uiv", "Pointer version of #SecondaryColor3ui().", Check(3)..GLuint.const.p.IN("v", colorBuffer))

    OffHeapOnly..DeprecatedGL..void(
        "SecondaryColorPointer",
        "Specifies the location and organization of a secondary color array.",

        GLint.IN("size", "the number of values per vertex that are stored in the array, as well as their component ordering", "3"),
        GLenum.IN(
            "type",
            "the data type of the values stored in the array",
            """
            #BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT #HALF_FLOAT #FLOAT
            #DOUBLE #UNSIGNED_INT_2_10_10_10_REV #INT_2_10_10_10_REV
            """
        ),
        GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..ARRAY_BUFFER..void.const.p.IN("pointer", "the secondary color array data")
    )

    // EXT_blend_func_separate

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "BLEND_DST_RGB"..0x80C8,
        "BLEND_SRC_RGB"..0x80C9,
        "BLEND_DST_ALPHA"..0x80CA,
        "BLEND_SRC_ALPHA"..0x80CB
    )

    GL14C reuse "BlendFuncSeparate"

    // EXT_stencil_wrap

    IntConstant(
        "Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp.",

        "INCR_WRAP"..0x8507,
        "DECR_WRAP"..0x8508
    )

    // EXT_texture_lod_bias

    IntConstant(
        "Accepted by the {@code target} parameters of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, Texenviv, and TexEnvfv.",

        "TEXTURE_FILTER_CONTROL"..0x8500
    )

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

    // ARB_window_pos

    DeprecatedGL..void(
        "WindowPos2i",
        "Alternate way to set the current raster position. {@code z} is implictly set to 0.",

        GLint.IN("x", "the x value"),
        GLint.IN("y", "the y value")
    )

    DeprecatedGL..void("WindowPos2s", "Short version of #WindowPos2i().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"))
    DeprecatedGL..void("WindowPos2f", "Float version of #WindowPos2i().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"))
    DeprecatedGL..void("WindowPos2d", "Double version of #WindowPos2i().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"))

    DeprecatedGL..void("WindowPos2iv", "Pointer version of #WindowPos2i().", Check(2)..GLint.const.p.IN("p", "the position value"))
    DeprecatedGL..void("WindowPos2sv", "Pointer version of #WindowPos2s().", Check(2)..GLshort.const.p.IN("p", "the position value"))
    DeprecatedGL..void("WindowPos2fv", "Pointer version of #WindowPos2f().", Check(2)..GLfloat.const.p.IN("p", "the position value"))
    DeprecatedGL..void("WindowPos2dv", "Pointer version of #WindowPos2d().", Check(2)..GLdouble.const.p.IN("p", "the position value"))

    DeprecatedGL..void(
        "WindowPos3i",
        "Alternate way to set the current raster position.",

        GLint.IN("x", "the x value"),
        GLint.IN("y", "the y value"),
        GLint.IN("z", "the z value")
    )

    DeprecatedGL..void("WindowPos3s", "Short version of #WindowPos3i().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"), GLshort.IN("z", "the z value"))
    DeprecatedGL..void("WindowPos3f", "Float version of #WindowPos3i().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"), GLfloat.IN("z", "the z value"))
    DeprecatedGL..void("WindowPos3d", "Double version of #WindowPos3i().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"), GLdouble.IN("z", "the z value"))

    DeprecatedGL..void("WindowPos3iv", "Pointer version of #WindowPos3i().", Check(3)..GLint.const.p.IN("p", "the position value"))
    DeprecatedGL..void("WindowPos3sv", "Pointer version of #WindowPos3s().", Check(3)..GLshort.const.p.IN("p", "the position value"))
    DeprecatedGL..void("WindowPos3fv", "Pointer version of #WindowPos3f().", Check(3)..GLfloat.const.p.IN("p", "the position value"))
    DeprecatedGL..void("WindowPos3dv", "Pointer version of #WindowPos3d().", Check(3)..GLdouble.const.p.IN("p", "the position value"))

}