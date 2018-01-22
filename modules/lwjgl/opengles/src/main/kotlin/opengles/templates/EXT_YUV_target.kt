/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_YUV_target = "EXTYUVTarget".nativeClassGLES("EXT_YUV_target", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for three new YUV related items: first rendering to YUV images, second sampling from YUV images while keeping the data in
        YUV space, third it defines a new built in function that does conversion from RGB to YUV with controls to choose ITU-R BT.601-7, ITU-R BT.601-7 Full
        range (JFIF images), or ITU-R BT.709-5 standard.

        This new functionality is layered on top of the OES_EGL_image_external extension.

        To perform the YUV rendering capability in this extension an application will attach a texture to the framebuffer object as the color attachment. If
        the texture has a target type of TEXTURE_EXTERNAL_OES with YUV color format then the GL driver can use this framebuffer object as the render target,
        TEXTURE_EXTERNAL_OES target with RGB color format are not allowed with this extension.

        Requires ${GLES30.core}.
        """

    IntConstant(
        "Returned in the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_EXTERNAL_2D_Y2Y_EXT"..0x8BE7
    )

    IntConstant(
        """
        Reuse tokens as in extension "OES_EGL_image_external." Accepted as a target in the {@code target} parameter of BindTexture, EGLImageTargetTexture2DOES,
        and FramebufferTexture2D.
        """,

        "TEXTURE_EXTERNAL_OES"..0x8D65
    )

    IntConstant(
        "Accepted as {@code value} in GetIntegerv() and GetFloatv() queries.",

        "TEXTURE_BINDING_EXTERNAL_OES"..0x8D67
    )

    IntConstant(
        "Accepted as {@code value} in GetTexParameter*() queries.",

        "REQUIRED_TEXTURE_IMAGE_UNITS_OES"..0x8D68
    )
}