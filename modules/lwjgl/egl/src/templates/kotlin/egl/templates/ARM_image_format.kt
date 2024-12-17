/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ARM_image_format = "ARMImageFormat".nativeClassEGL("ARM_image_format", postfix = ARM) {
    IntConstant(
        "COLOR_COMPONENT_TYPE_EXT"..0x3339
    )

    IntConstant(
        "COLOR_COMPONENT_TYPE_FIXED_EXT"..0x333A,
        "COLOR_COMPONENT_TYPE_FLOAT_EXT"..0x333B,
        "COLOR_COMPONENT_TYPE_UNSIGNED_INTEGER_ARM"..0x3287,
        "COLOR_COMPONENT_TYPE_INTEGER_ARM"..0x3288
    )
}