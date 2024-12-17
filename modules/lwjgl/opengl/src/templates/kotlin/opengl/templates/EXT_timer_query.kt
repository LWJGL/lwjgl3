/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_timer_query = "EXTTimerQuery".nativeClassGL("EXT_timer_query", postfix = EXT) {
    IntConstant(
        "TIME_ELAPSED_EXT"..0x88BF
    )

    void(
        "GetQueryObjecti64vEXT",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..ReturnParam..Check(1)..GLint64.p("params")
    )

    void(
        "GetQueryObjectui64vEXT",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..ReturnParam..Check(1)..GLuint64.p("params")
    )
}