/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_copy_depth_to_color = "NVCopyDepthToColor".nativeClassGL("NV_copy_depth_to_color", postfix = NV) {
    IntConstant(
        "DEPTH_STENCIL_TO_RGBA_NV"..0x886E,
        "DEPTH_STENCIL_TO_BGRA_NV"..0x886F
    )
}