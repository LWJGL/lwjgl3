/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_LINEAR_DISTANCE = "EXTLinearDistance".nativeClassAL("EXT_LINEAR_DISTANCE") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        An OpenAL 1.1 implementation will always support the $extensionName extension. This allows an application written to the OpenAL 1.0 specification to
        access the offset abilities.
        """

    IntConstant(
        "$extensionName tokens.",

        "LINEAR_DISTANCE"..0xd003,
        "LINEAR_DISTANCE_CLAMPED"..0xd004
    )
}