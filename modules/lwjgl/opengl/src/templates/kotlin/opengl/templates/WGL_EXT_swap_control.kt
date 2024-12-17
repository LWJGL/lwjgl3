/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_EXT_swap_control = "WGLEXTSwapControl".nativeClassWGL("WGL_EXT_swap_control", EXT) {
    BOOL(
        "SwapIntervalEXT",

        int("interval")
    )

    int("GetSwapIntervalEXT", void())
}