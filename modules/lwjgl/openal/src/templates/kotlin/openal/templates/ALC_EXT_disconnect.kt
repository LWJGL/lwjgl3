/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_disconnect = "EXTDisconnect".nativeClassALC("EXT_disconnect") {
    IntConstant(
        "CONNECTED"..0x313
    )
}