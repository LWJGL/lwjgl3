/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_timeline_semaphore = "NVTimelineSemaphore".nativeClassGLES("NV_timeline_semaphore", postfix = NV) {
    IntConstant(
        "SEMAPHORE_TYPE_NV"..0x95B3
    )

    IntConstant(
        "SEMAPHORE_TYPE_BINARY_NV"..0x95B4,
        "SEMAPHORE_TYPE_TIMELINE_NV"..0x95B5
    )

    IntConstant(
        "TIMELINE_SEMAPHORE_VALUE_NV"..0x9595
    )

    IntConstant(
        "MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV"..0x95B6
    )

    void(
        "CreateSemaphoresNV",

        AutoSize("semaphores")..GLsizei("n"),
        ReturnParam..GLuint.p("semaphores")
    )

    void(
        "SemaphoreParameterivNV",

        GLuint("semaphore"),
        GLenum("pname"),
        Check(1)..GLint.const.p("params")
    )

    void(
        "GetSemaphoreParameterivNV",

        GLuint("semaphore"),
        GLenum("pname"),
        Check(1)..GLint.p("params")
    )
}