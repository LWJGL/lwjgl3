/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_SOURCE_RADIUS = "EXTSourceRadius".nativeClassAL("EXT_SOURCE_RADIUS") {
    IntConstant(
        "SOURCE_RADIUS"..0x1031
    )
}