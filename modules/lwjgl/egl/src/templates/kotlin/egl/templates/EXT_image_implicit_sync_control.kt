/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_image_implicit_sync_control = "EXTImageImplicitSyncControl".nativeClassEGL("EXT_image_implicit_sync_control", postfix = EXT) {
    IntConstant(
        "IMPORT_SYNC_TYPE_EXT"..0x3470
    )

    IntConstant(
        "IMPORT_IMPLICIT_SYNC_EXT"..0x3471,
        "IMPORT_EXPLICIT_SYNC_EXT"..0x3472
    )
}