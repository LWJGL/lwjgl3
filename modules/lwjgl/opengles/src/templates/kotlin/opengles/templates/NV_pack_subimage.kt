/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_pack_subimage = "NVPackSubimage".nativeClassGLES("NV_pack_subimage", postfix = NV) {
    IntConstant(
        "PACK_ROW_LENGTH_NV"..0x0D02,
        "PACK_SKIP_ROWS_NV"..0x0D03,
        "PACK_SKIP_PIXELS_NV"..0x0D04
    )
}