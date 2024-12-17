/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GREMEDY_string_marker = "GREMEDYStringMarker".nativeClassGL("GREMEDY_string_marker", postfix = GREMEDY) {
    void(
        "StringMarkerGREMEDY",

        AutoSize("string")..GLsizei("len"),
        GLcharUTF8.const.p("string")
    )
}