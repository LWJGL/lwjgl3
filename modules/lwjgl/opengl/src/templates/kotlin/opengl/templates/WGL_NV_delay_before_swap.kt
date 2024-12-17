/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_NV_delay_before_swap = "WGLNVDelayBeforeSwap".nativeClassWGL("WGL_NV_delay_before_swap", NV) {
    javaImport(
        "org.lwjgl.system.windows.WinBase"
    )

    BOOL(
        "DelayBeforeSwapNV",

        HDC("hDC"),
        GLfloat("seconds")
    )
}