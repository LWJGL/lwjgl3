/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_multiview_window = "EXTMultiviewWindow".nativeClassEGL("EXT_multiview_window", postfix = EXT) {
    IntConstant(
        "MULTIVIEW_VIEW_COUNT_EXT"..0x3134
    )
}