/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_pack_reverse_row_order = "ANGLEPackReverseRowOrder".nativeClassGLES("ANGLE_pack_reverse_row_order", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces a mechanism to allow reversing the order in which image rows are written into a pack destination. This effectively allows an
        application to flip the results of a ReadPixels in the y direction operation without having to render upside down.

        The coordinate system of OpenGL is vertically reversed in comparison to a number of other graphics systems such as native windowing APIs. Applications
        that perform ReadPixels may have to either render to an intermediate color buffer before calling ReadPixels or perform a flip in software after
        ReadPixels. In some systems the GL can perform the row reversal during ReadPixels without incurring additional cost.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of PixelStore{if}, GetIntegerv(), GetBooleanv(), and GetFloatv().",

        "PACK_REVERSE_ROW_ORDER_ANGLE"..0x93A4
    )
}