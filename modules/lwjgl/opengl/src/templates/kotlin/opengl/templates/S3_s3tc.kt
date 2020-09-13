/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val S3_s3tc = "S3S3TC".nativeClassGL("S3_s3tc", postfix = S3TC) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows specifying texture data in compressed S3TC format.
        """

    IntConstant(
        "Accepted by the ??? parameter of ??? (presumably by the {@code format} argument of TexImage2D?.",

        "RGB_S3TC"..0x83A0,
        "RGB4_S3TC"..0x83A1,
        "RGBA_S3TC"..0x83A2,
        "RGBA4_S3TC"..0x83A3,
        "RGBA_DXT5_S3TC"..0x83A4,
        "RGBA4_DXT5_S3TC"..0x83A5
    )
}
