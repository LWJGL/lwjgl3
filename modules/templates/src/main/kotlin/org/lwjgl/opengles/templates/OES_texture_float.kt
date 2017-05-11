/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_texture_float = EXT_FLAG.nativeClassGLES("OES_texture_float", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        These extensions add texture formats with 16- (aka half float) and 32-bit floating-point components. The 32-bit floating-point components are in the
        standard IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are
        clamped to the limits of the range representable by their format.

        The OES_texture_float extension string indicates that the implementation supports 32-bit floating pt texture formats.

        Both these extensions only require NEAREST magnification filter and NEAREST, and NEAREST_MIPMAP_NEAREST minification filters to be supported.
        """
}

val OES_texture_half_float = "OESTextureHalfFloat".nativeClassGLES("OES_texture_half_float", postfix = OES) {
    documentation =
        """
        Native bindings to the ${registryLink("OES", "OES_texture_float")} extension.

        These extensions add texture formats with 16- (aka half float) and 32-bit floating-point components. The 32-bit floating-point components are in the
        standard IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are
        clamped to the limits of the range representable by their format.

         The OES_texture_half_float extension string indicates that the implementation supports 16-bit floating pt texture formats.

        Both these extensions only require NEAREST magnification filter and NEAREST, and NEAREST_MIPMAP_NEAREST minification filters to be supported.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of TexImage2D, TexSubImage2D, TexImage3D, and TexSubImage3D.",

        "HALF_FLOAT_OES"..0x8D61
    )
}