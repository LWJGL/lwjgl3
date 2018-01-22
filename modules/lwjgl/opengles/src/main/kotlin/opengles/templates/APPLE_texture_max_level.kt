/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_texture_max_level = "APPLETextureMaxLevel".nativeClassGLES("APPLE_texture_max_level", postfix = APPLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an application to specify the maximum (coarsest) mipmap level that may be selected for the specified texture. This maximum level
        is also used to determine which mip levels are considered when determining texture completeness.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv.",

        "TEXTURE_MAX_LEVEL_APPLE"..0x813D
    )
}