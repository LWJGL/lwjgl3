/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassGLES("EXT_debug_marker", postfix = EXT) {
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