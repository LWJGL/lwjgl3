/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ARM_pixmap_multisample_discard = "ARMPixmapMultisampleDiscard".nativeClassEGL("ARM_pixmap_multisample_discard", postfix = ARM) {
    IntConstant(
        "DISCARD_SAMPLES_ARM"..0x3286
    )
}