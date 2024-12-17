/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassGL("EXT_debug_marker", postfix = EXT) {
    void(
        "InsertEventMarkerEXT",

        AutoSize("marker")..GLsizei("length"),
        GLcharUTF8.const.p("marker")
    )

    void(
        "PushGroupMarkerEXT",

        AutoSize("marker")..GLsizei("length"),
        GLcharUTF8.const.p("marker")
    )

    void("PopGroupMarkerEXT")
}