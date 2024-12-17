/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_easy_font = "STBEasyFont".nativeClass(Module.STB, prefix = "STB", prefixMethod = "stb_") {
    includeSTBAPI("#include \"stb_easy_font.h\"")

    int(
        "easy_font_width",

        Input..charASCII.p("text")
    )

    int(
        "easy_font_height",

        Input..charASCII.p("text")
    )

    int(
        "easy_font_print",

        float("x"),
        float("y"),
        Input..charASCII.p("text"),
        nullable..Check(4)..unsigned_char.p("color"),
        void.p("vertex_buffer"),
        AutoSize("vertex_buffer")..int("vbuf_size")
    )

    void(
        "easy_font_spacing",

        float("spacing")
    )
}