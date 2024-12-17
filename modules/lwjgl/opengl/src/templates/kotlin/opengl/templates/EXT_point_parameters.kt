/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_point_parameters = "EXTPointParameters".nativeClassGL("EXT_point_parameters", postfix = EXT) {
    IntConstant(
        "POINT_SIZE_MIN_EXT"..0x8126,
        "POINT_SIZE_MAX_EXT"..0x8127,
        "POINT_FADE_THRESHOLD_SIZE_EXT"..0x8128,
        "DISTANCE_ATTENUATION_EXT"..0x8129
    )

    void(
        "PointParameterfEXT",

        GLenum("pname"),
        GLfloat("param")
    )

    void(
        "PointParameterfvEXT",

        GLenum("pname"),
        Check(1)..GLfloat.const.p("params")
    )
}