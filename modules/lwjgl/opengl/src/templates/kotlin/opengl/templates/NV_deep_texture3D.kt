/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_deep_texture3D = "NVDeepTexture3D".nativeClassGL("NV_deep_texture3D", postfix = NV) {
    IntConstant(
        "MAX_DEEP_3D_TEXTURE_WIDTH_HEIGHT_NV"..0x90D0,
        "MAX_DEEP_3D_TEXTURE_DEPTH_NV"..0x90D1
    )
}