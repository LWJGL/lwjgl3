/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val APPLE_element_array = "APPLEElementArray".nativeClassGL("APPLE_element_array") {
    IntConstant(
        "ELEMENT_ARRAY_APPLE"..0x8A0C
    )

    IntConstant(
        "ELEMENT_ARRAY_TYPE_APPLE"..0x8A0D
    )

    IntConstant(
        "ELEMENT_ARRAY_POINTER_APPLE"..0x8A0E
    )

    void(
        "ElementPointerAPPLE",

        AutoType("pointer", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "DrawElementArrayAPPLE",

        GLenum("mode"),
        GLint("first"),
        GLsizei("count")
    )

    void(
        "DrawRangeElementArrayAPPLE",

        GLenum("mode"),
        GLuint("start"),
        GLuint("end"),
        GLint("first"),
        GLsizei("count")
    )

    void(
        "MultiDrawElementArrayAPPLE",

        GLenum("mode"),
        GLint.const.p("first"),
        GLsizei.const.p("count"),
        AutoSize("first", "count")..GLsizei("primcount")
    )

    void(
        "MultiDrawRangeElementArrayAPPLE",

        GLenum("mode"),
        GLuint("start"),
        GLuint("end"),
        GLint.const.p("first"),
        GLsizei.const.p("count"),
        AutoSize("first", "count")..GLsizei("primcount")
    )
}