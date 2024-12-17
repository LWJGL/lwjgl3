/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_draw_buffers2 = "EXTDrawBuffers2".nativeClassGL("EXT_draw_buffers2", postfix = EXT) {
    void(
        "ColorMaskIndexedEXT",

        GLuint("index"),
        GLboolean("r"),
        GLboolean("g"),
        GLboolean("b"),
        GLboolean("a")
    )

    void(
        "GetBooleanIndexedvEXT",

        GLenum("target"),
        GLuint("index"),
        Check(1)..ReturnParam..GLboolean.p("data")
    )

    void(
        "GetIntegerIndexedvEXT",

        GLenum("target"),
        GLuint("index"),
        Check(1)..ReturnParam..GLint.p("data")
    )

    void(
        "EnableIndexedEXT",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "DisableIndexedEXT",

        GLenum("target"),
        GLuint("index")
    )

    GLboolean(
        "IsEnabledIndexedEXT",

        GLenum("target"),
        GLuint("index")
    )
}