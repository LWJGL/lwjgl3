/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val AMD_compressed_3DC_texture = "AMDCompressed3DCTexture".nativeClassGLES("AMD_compressed_3DC_texture", postfix = AMD) {
    IntConstant(
        "3DC_X_AMD"..0x87F9,
        "3DC_XY_AMD"..0x87FA
    )
}