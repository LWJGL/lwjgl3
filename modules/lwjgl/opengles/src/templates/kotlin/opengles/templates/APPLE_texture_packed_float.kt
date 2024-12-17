/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_texture_packed_float = "APPLETexturePackedFloat".nativeClassGLES("APPLE_texture_packed_float", postfix = APPLE) {
    IntConstant(
        "UNSIGNED_INT_10F_11F_11F_REV_APPLE"..0x8C3B,
        "UNSIGNED_INT_5_9_9_9_REV_APPLE"..0x8C3E
    )

    IntConstant(
        "R11F_G11F_B10F_APPLE"..0x8C3A,
        "RGB9_E5_APPLE"..0x8C3D
    )
}