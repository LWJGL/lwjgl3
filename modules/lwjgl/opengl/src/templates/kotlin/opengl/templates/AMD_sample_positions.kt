/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_sample_positions = "AMDSamplePositions".nativeClassGL("AMD_sample_positions", postfix = AMD) {
    IntConstant(
        "SUBSAMPLE_DISTANCE_AMD"..0x883F
    )

    void(
        "SetMultisamplefvAMD",

        GLenum("pname"),
        GLuint("index"),
        Check(2)..GLfloat.const.p("val")
    )
}