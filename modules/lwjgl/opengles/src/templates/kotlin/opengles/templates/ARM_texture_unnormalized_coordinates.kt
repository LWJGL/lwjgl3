/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_texture_unnormalized_coordinates = "ARMTextureUnnormalizedCoordinates".nativeClassGLES("ARM_texture_unnormalized_coordinates", postfix = ARM) {
    IntConstant(
        "TEXTURE_UNNORMALIZED_COORDINATES_ARM"..0x8F6A
    )
}
