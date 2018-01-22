/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_OFFSET = "EXTOffset".nativeClassAL("EXT_OFFSET") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        An OpenAL 1.1 implementation will always support the $extensionName extension. This allows an application written to the OpenAL 1.0 specification to
        access the offset abilities.
        """

    IntConstant(
        "$extensionName tokens.",

        "SEC_OFFSET"..0x1024,
        "SAMPLE_OFFSET"..0x1025,
        "BYTE_OFFSET"..0x1026
    )
}