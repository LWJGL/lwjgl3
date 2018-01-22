/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_EXPONENT_DISTANCE = "EXTExponentDistance".nativeClassAL("EXT_EXPONENT_DISTANCE") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        An OpenAL 1.1 implementation will always support the $extensionName extension. This allows an application written to the OpenAL 1.0 specification to
        access the exponent distance abilities.
        """

    IntConstant(
        "$extensionName tokens.",

        "EXPONENT_DISTANCE"..0xd005,
        "EXPONENT_DISTANCE_CLAMPED"..0xd006
    )
}