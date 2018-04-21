/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_image_gl_colorspace = "EXTImageGLColorspace".nativeClassEGL("EXT_image_gl_colorspace", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension relaxes the restriction that only the {@code eglCreate*Surface} functions can accept the #GL_COLORSPACE attribute. With this change,
        {@code eglCreateImage} can also accept this attribute.
        """

    IntConstant(
        "",

        "GL_COLORSPACE_DEFAULT_EXT"..0x314D
    )
}