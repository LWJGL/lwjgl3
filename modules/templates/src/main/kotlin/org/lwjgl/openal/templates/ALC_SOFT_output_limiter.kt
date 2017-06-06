/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_SOFT_output_limiter = "SOFTOutputLimiter".nativeClassALC("SOFT_output_limiter") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows an application to control OpenAL Soft's output limiter. OpenAL Soft 1.18 adds an output limiter to prevent excessive clipping on
        the output, and this extension allows applications to turn it off or on.
        """

    IntConstant(
        """
        Accepted as part of the {@code attrList} parameter of #CreateContext() and #ResetDeviceSOFT(), and as the {@code paramName} parameter of #GetIntegerv().
        """,

        "OUTPUT_LIMITER_SOFT"..0x199A
    )
}