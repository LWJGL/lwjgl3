/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_debug_label = "EXTDebugLabel".nativeClassGL("EXT_debug_label", postfix = EXT) {
    IntConstant(
        "BUFFER_OBJECT_EXT"..0x9151,
        "SHADER_OBJECT_EXT"..0x8B48,
        "PROGRAM_OBJECT_EXT"..0x8B40,
        "VERTEX_ARRAY_OBJECT_EXT"..0x9154,
        "QUERY_OBJECT_EXT"..0x9153,
        "PROGRAM_PIPELINE_OBJECT_EXT"..0x8A4F
    )

    void(
        "LabelObjectEXT",

        GLenum("type"),
        GLuint("object"),
        AutoSize("label")..GLsizei("length"),
        GLcharUTF8.const.p("label")
    )

    void(
        "GetObjectLabelEXT",

        GLenum("type"),
        GLuint("object"),
        AutoSize("label")..GLsizei("bufSize"),
        Check(1)..GLsizei.p("length"),
        Return("length")..GLcharUTF8.p("label")
    )
}