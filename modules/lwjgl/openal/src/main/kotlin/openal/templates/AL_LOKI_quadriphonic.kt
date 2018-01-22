/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_LOKI_quadriphonic = "LOKIQuadriphonic".nativeClassAL("LOKI_quadriphonic") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_QUAD8_LOKI"..0x10004,
        "FORMAT_QUAD16_LOKI"..0x10005
    )
}