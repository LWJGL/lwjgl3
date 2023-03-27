/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_pack_subimage = "NVPackSubimage".nativeClassGLES("NV_pack_subimage", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This OpenGL ES 2.0 extension adds support for #PACK_ROW_LENGTH_NV, #PACK_SKIP_ROWS_NV and #PACK_SKIP_PIXELS_NV as valid enums to #PixelStorei().

        The functionality is the same as in OpenGL. These are useful to update a sub-rectangle in host memory with data that can be read from the framebuffer
        or a texture (using FBO and texture attachments).
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of #PixelStorei(), #GetIntegerv(), and #GetFloatv().",

        "PACK_ROW_LENGTH_NV"..0x0D02,
        "PACK_SKIP_ROWS_NV"..0x0D03,
        "PACK_SKIP_PIXELS_NV"..0x0D04
    )
}