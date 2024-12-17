/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val IMG_context_priority = "IMGContextPriority".nativeClassEGL("IMG_context_priority", postfix = IMG) {
    IntConstant(
        "CONTEXT_PRIORITY_LEVEL_IMG"..0x3100,
        "CONTEXT_PRIORITY_HIGH_IMG"..0x3101,
        "CONTEXT_PRIORITY_MEDIUM_IMG"..0x3102,
        "CONTEXT_PRIORITY_LOW_IMG"..0x3103
    )
}