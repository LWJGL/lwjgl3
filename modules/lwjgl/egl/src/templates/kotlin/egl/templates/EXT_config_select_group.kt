/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_config_select_group = "EXTConfigSelectGroup".nativeClassEGL("EXT_config_select_group", postfix = EXT) {
    IntConstant(
        "CONFIG_SELECT_GROUP_EXT"..0x34C0
    )
}