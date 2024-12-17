/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL14 = "GL14".nativeClassGL("GL14") {
    extends = GL13

    // SGIS_generate_mipmap

    IntConstant(
        "GENERATE_MIPMAP"..0x8191
    )

    IntConstant(
        "GENERATE_MIPMAP_HINT"..0x8192
    )

    // EXT_blend_color

    IntConstant(
        "CONSTANT_COLOR"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR"..0x8002,
        "CONSTANT_ALPHA"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA"..0x8004
    )

    IntConstant(
        "BLEND_COLOR"..0x8005
    )

    reuse(GL14C, "BlendColor")

    // EXT_blend_minmax

    IntConstant(
        "FUNC_ADD"..0x8006,
        "MIN"..0x8007,
        "MAX"..0x8008
    )

    IntConstant(
        "BLEND_EQUATION"..0x8009
    )

    reuse(GL14C, "BlendEquation")

    // EXT_blend_subtract

    IntConstant(
        "FUNC_SUBTRACT"..0x800A,
        "FUNC_REVERSE_SUBTRACT"..0x800B
    )

    // ARB_depth_texture

    IntConstant(
        "DEPTH_COMPONENT16"..0x81A5,
        "DEPTH_COMPONENT24"..0x81A6,
        "DEPTH_COMPONENT32"..0x81A7
    )

    IntConstant(
        "TEXTURE_DEPTH_SIZE"..0x884A
    )

    IntConstant(
        "DEPTH_TEXTURE_MODE"..0x884B
    )

    // ARB_shadow

    IntConstant(
        "TEXTURE_COMPARE_MODE"..0x884C,
        "TEXTURE_COMPARE_FUNC"..0x884D
    )

    IntConstant(
        "COMPARE_R_TO_TEXTURE"..0x884E
    )

    // EXT_fog_coord

    IntConstant(
        "FOG_COORDINATE_SOURCE"..0x8450
    )

    IntConstant(
        "FOG_COORDINATE"..0x8451,
        "FRAGMENT_DEPTH"..0x8452
    )

    IntConstant(
        "CURRENT_FOG_COORDINATE"..0x8453,
        "FOG_COORDINATE_ARRAY_TYPE"..0x8454,
        "FOG_COORDINATE_ARRAY_STRIDE"..0x8455
    )

    IntConstant(
        "FOG_COORDINATE_ARRAY_POINTER"..0x8456
    )

    IntConstant(
        "FOG_COORDINATE_ARRAY"..0x8457
    )

    DeprecatedGL..void(
        "FogCoordf",

        GLfloat("coord")
    )

    DeprecatedGL..void(
        "FogCoordd",

        GLdouble("coord")
    )

    DeprecatedGL..void(
        "FogCoordfv",

        Check(1)..GLfloat.const.p("coord")
    )

    DeprecatedGL..void(
        "FogCoorddv",

        Check(1)..GLdouble.const.p("coord")
    )

    OffHeapOnly..DeprecatedGL..void(
        "FogCoordPointer",

        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    // EXT_multi_draw_arrays

    reuse(GL14C, "MultiDrawArrays")
    reuse(GL14C, "MultiDrawElements")

    // ARB_point_parameters

    IntConstant(
        "POINT_SIZE_MIN"..0x8126,
        "POINT_SIZE_MAX"..0x8127,
        "POINT_FADE_THRESHOLD_SIZE"..0x8128,
        "POINT_DISTANCE_ATTENUATION"..0x8129
    )

    reuse(GL14C, "PointParameterf")
    reuse(GL14C, "PointParameteri")
    reuse(GL14C, "PointParameterfv")
    reuse(GL14C, "PointParameteriv")

    // EXT_secondary_color

    IntConstant(
        "COLOR_SUM"..0x8458
    )

    IntConstant(
        "CURRENT_SECONDARY_COLOR"..0x8459,
        "SECONDARY_COLOR_ARRAY_SIZE"..0x845A,
        "SECONDARY_COLOR_ARRAY_TYPE"..0x845B,
        "SECONDARY_COLOR_ARRAY_STRIDE"..0x845C
    )

    IntConstant(
        "SECONDARY_COLOR_ARRAY_POINTER"..0x845D
    )

    IntConstant(
        "SECONDARY_COLOR_ARRAY"..0x845E
    )

    DeprecatedGL..void(
        "SecondaryColor3b",

        GLbyte("red"),
        GLbyte("green"),
        GLbyte("blue")
    )
    DeprecatedGL..void("SecondaryColor3s", GLshort("red"), GLshort("green"), GLshort("blue"))
    DeprecatedGL..void("SecondaryColor3i", GLint("red"), GLint("green"), GLint("blue"))
    DeprecatedGL..void("SecondaryColor3f", GLfloat("red"), GLfloat("green"), GLfloat("blue"))
    DeprecatedGL..void("SecondaryColor3d", GLdouble("red"), GLdouble("green"), GLdouble("blue"))
    DeprecatedGL..void("SecondaryColor3ub", GLubyte("red"), GLubyte("green"), GLubyte("blue"))
    DeprecatedGL..void("SecondaryColor3us", GLushort("red"), GLushort("green"), GLushort("blue"))
    DeprecatedGL..void("SecondaryColor3ui", GLint("red"), GLint("green"), GLint("blue"))

    DeprecatedGL..void("SecondaryColor3bv", Check(3)..GLbyte.const.p("v"))
    DeprecatedGL..void("SecondaryColor3sv", Check(3)..GLshort.const.p("v"))
    DeprecatedGL..void("SecondaryColor3iv", Check(3)..GLint.const.p("v"))
    DeprecatedGL..void("SecondaryColor3fv", Check(3)..GLfloat.const.p("v"))
    DeprecatedGL..void("SecondaryColor3dv", Check(3)..GLdouble.const.p("v"))
    DeprecatedGL..void("SecondaryColor3ubv", Check(3)..GLubyte.const.p("v"))
    DeprecatedGL..void("SecondaryColor3usv", Check(3)..GLushort.const.p("v"))
    DeprecatedGL..void("SecondaryColor3uiv", Check(3)..GLuint.const.p("v"))

    OffHeapOnly..DeprecatedGL..void(
        "SecondaryColorPointer",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    // EXT_blend_func_separate

    IntConstant(
        "BLEND_DST_RGB"..0x80C8,
        "BLEND_SRC_RGB"..0x80C9,
        "BLEND_DST_ALPHA"..0x80CA,
        "BLEND_SRC_ALPHA"..0x80CB
    )

    reuse(GL14C, "BlendFuncSeparate")

    // EXT_stencil_wrap

    IntConstant(
        "INCR_WRAP"..0x8507,
        "DECR_WRAP"..0x8508
    )

    // EXT_texture_lod_bias

    IntConstant(
        "TEXTURE_FILTER_CONTROL"..0x8500
    )

    IntConstant(
        "TEXTURE_LOD_BIAS"..0x8501
    )

    IntConstant(
        "MAX_TEXTURE_LOD_BIAS"..0x84FD
    )

    // ARB_texture_mirrored_repeat

    IntConstant(
        "MIRRORED_REPEAT"..0x8370
    )

    // ARB_window_pos

    DeprecatedGL..void(
        "WindowPos2i",

        GLint("x"),
        GLint("y")
    )

    DeprecatedGL..void("WindowPos2s", GLshort("x"), GLshort("y"))
    DeprecatedGL..void("WindowPos2f", GLfloat("x"), GLfloat("y"))
    DeprecatedGL..void("WindowPos2d", GLdouble("x"), GLdouble("y"))

    DeprecatedGL..void("WindowPos2iv", Check(2)..GLint.const.p("p"))
    DeprecatedGL..void("WindowPos2sv", Check(2)..GLshort.const.p("p"))
    DeprecatedGL..void("WindowPos2fv", Check(2)..GLfloat.const.p("p"))
    DeprecatedGL..void("WindowPos2dv", Check(2)..GLdouble.const.p("p"))

    DeprecatedGL..void(
        "WindowPos3i",

        GLint("x"),
        GLint("y"),
        GLint("z")
    )

    DeprecatedGL..void("WindowPos3s", GLshort("x"), GLshort("y"), GLshort("z"))
    DeprecatedGL..void("WindowPos3f", GLfloat("x"), GLfloat("y"), GLfloat("z"))
    DeprecatedGL..void("WindowPos3d", GLdouble("x"), GLdouble("y"), GLdouble("z"))

    DeprecatedGL..void("WindowPos3iv", Check(3)..GLint.const.p("p"))
    DeprecatedGL..void("WindowPos3sv", Check(3)..GLshort.const.p("p"))
    DeprecatedGL..void("WindowPos3fv", Check(3)..GLfloat.const.p("p"))
    DeprecatedGL..void("WindowPos3dv", Check(3)..GLdouble.const.p("p"))

}