/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_vg_parent_image = "KHRVGParentImage".nativeClassEGL("KHR_vg_parent_image", postfix = KHR) {
    IntConstant(
        "VG_PARENT_IMAGE_KHR"..0x30BA
    )
}