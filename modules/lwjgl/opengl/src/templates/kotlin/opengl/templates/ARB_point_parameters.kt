/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_point_parameters = "ARBPointParameters".nativeClassGL("ARB_point_parameters", postfix = ARB) {
    IntConstant(
        "POINT_SIZE_MIN_ARB"..0x8126,
        "POINT_SIZE_MAX_ARB"..0x8127,
        "POINT_FADE_THRESHOLD_SIZE_ARB"..0x8128,
        "POINT_DISTANCE_ATTENUATION_ARB"..0x8129
    )

    void(
        "PointParameterfARB",

        GLenum("pname"),
        GLfloat("param")
    )

    void(
        "PointParameterfvARB",

        GLenum("pname"),
        Check(3)..GLfloat.const.p("params")
    )

}