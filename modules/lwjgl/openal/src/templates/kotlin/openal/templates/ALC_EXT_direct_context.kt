/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_direct_context = "EXTDirectContext".nativeClassALC("EXT_direct_context") {
    "ALCvoid".opaque.p(
        "GetProcAddress2",

        nullable..ALCdevice.p("device"),
        ALcharASCII.const.p("funcName")
    )

}