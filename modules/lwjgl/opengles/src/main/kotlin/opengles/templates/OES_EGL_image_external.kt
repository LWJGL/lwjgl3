/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_EGL_image_external = "OESEGLImageExternal".nativeClassGLES("OES_EGL_image_external", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism for creating EGLImage texture targets from EGLImages. This extension defines a new texture target,
        TEXTURE_EXTERNAL_OES. This texture target can only be specified using an EGLImage. There is no support for most of the functions that manipulate other
        texture targets (e.g. you cannot use gl*Tex*Image*() functions with TEXTURE_EXTERNAL_OES). Also, TEXTURE_EXTERNAL_OES targets never have more than a
        single LOD level. Because of these restrictions, it is possible to bind EGLImages which have internal formats not otherwise supported by OpenGL ES. For
        example some implementations may allow EGLImages with planar or interleaved YUV data to be GLES texture target siblings. It is up to the implementation
        exactly what formats are accepted.
        """

    IntConstant(
        "Accepted as a target in the {@code target} parameter of BindTexture and EGLImageTargetTexture2DOES.",

        "TEXTURE_EXTERNAL_OES"..0x8D65
    )

    IntConstant(
        "Returned in the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_EXTERNAL_OES"..0x8D66
    )

    IntConstant(
        "Accepted as the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetFixedv.",

        "TEXTURE_BINDING_EXTERNAL_OES"..0x8D67
    )

    IntConstant(
        "Accepted as {@code value} in GetTexParameter*() queries.",

        "REQUIRED_TEXTURE_IMAGE_UNITS_OES"..0x8D68
    )
}