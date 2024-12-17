/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_blend = "ARBVertexBlend".nativeClassGL("ARB_vertex_blend", postfix = ARB) {
    IntConstant(
        "MAX_VERTEX_UNITS_ARB"..0x86A4,
        "ACTIVE_VERTEX_UNITS_ARB"..0x86A5
    )

    IntConstant(
        "WEIGHT_SUM_UNITY_ARB"..0x86A6,
        "VERTEX_BLEND_ARB"..0x86A7
    )

    IntConstant(
        "MODELVIEW0_ARB"..0x1700,
        "MODELVIEW1_ARB"..0x850a,
        "MODELVIEW2_ARB"..0x8722,
        "MODELVIEW3_ARB"..0x8723,
        "MODELVIEW4_ARB"..0x8724,
        "MODELVIEW5_ARB"..0x8725,
        "MODELVIEW6_ARB"..0x8726,
        "MODELVIEW7_ARB"..0x8727,
        "MODELVIEW8_ARB"..0x8728,
        "MODELVIEW9_ARB"..0x8729,
        "MODELVIEW10_ARB"..0x872A,
        "MODELVIEW11_ARB"..0x872B,
        "MODELVIEW12_ARB"..0x872C,
        "MODELVIEW13_ARB"..0x872D,
        "MODELVIEW14_ARB"..0x872E,
        "MODELVIEW15_ARB"..0x872F,
        "MODELVIEW16_ARB"..0x8730,
        "MODELVIEW17_ARB"..0x8731,
        "MODELVIEW18_ARB"..0x8732,
        "MODELVIEW19_ARB"..0x8733,
        "MODELVIEW20_ARB"..0x8734,
        "MODELVIEW21_ARB"..0x8735,
        "MODELVIEW22_ARB"..0x8736,
        "MODELVIEW23_ARB"..0x8737,
        "MODELVIEW24_ARB"..0x8738,
        "MODELVIEW25_ARB"..0x8739,
        "MODELVIEW26_ARB"..0x873A,
        "MODELVIEW27_ARB"..0x873B,
        "MODELVIEW28_ARB"..0x873C,
        "MODELVIEW29_ARB"..0x873D,
        "MODELVIEW30_ARB"..0x873E,
        "MODELVIEW31_ARB"..0x873F
    )

    IntConstant(
        "CURRENT_WEIGHT_ARB"..0x86A8
    )

    IntConstant(
        "WEIGHT_ARRAY_TYPE_ARB"..0x86A9,
        "WEIGHT_ARRAY_STRIDE_ARB"..0x86AA,
        "WEIGHT_ARRAY_SIZE_ARB"..0x86AB
    )

    IntConstant(
        "WEIGHT_ARRAY_POINTER_ARB"..0x86AC
    )

    IntConstant(
        "WEIGHT_ARRAY_ARB"..0x86AD
    )

    val size = AutoSize("weights")..GLint("size")

    void("WeightfvARB", size, GLfloat.p("weights"))

    void("WeightbvARB", size, GLbyte.p("weights"))
    void("WeightubvARB", size, GLubyte.p("weights"))

    void("WeightsvARB", size, GLshort.p("weights"))
    void("WeightusvARB", size, GLushort.p("weights"))

    void("WeightivARB", size, GLint.p("weights"))
    void("WeightuivARB", size, GLuint.p("weights"))

    void("WeightdvARB", size, GLdouble.p("weights"))

    void(
        "WeightPointerARB",

        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "VertexBlendARB",

        GLint("count")
    )

}