/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_ycbcr_degamma = "QCOMYCBCRDegamma".nativeClassGLES("QCOM_ycbcr_degamma", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The OpenGL ES extensions ${OES_EGL_image_external.link} and ${EXT_EGL_image_storage.link} provide a mechanism for creating GL textures sharing storage
        with EGLImage objects which can encapsulate an external YCbCr buffer. The YCbCr data is stored according to the colorspace standards like ITU BT.601,
        BT.709, or BT.2020, and a transfer function like ITU OETF or sRGB EOTF, which translates the YCbCr data into non-linear space Y'CbCr. When sampling a
        Y'CbCr texture containing texels encoded, the conversion back to linear RGB requires conversion from non-linear RGB space to linear RGB space using an
        inverse transfer function. This operation of applying the inverse transfer function is also called "degamma". Currently, degamma operation is not
        executed as part of texture sampling, and instead application's shader code is expected to perform it separately. This computation can be somewhat
        expensive in the shader.

        This extension allows implementations to use "sRGB EOTF" inverse transform function defined in Khronos data format 1.3 specification, for degamma
        operation. The degamma is performed during texture filtering, allowing texture filtering to operate in a linear space. The extension provides this
        functionality by selectively enabling degamma for both the {@code luminance{Y}} and/or chrominance {@code {CbCr}} components of any 8 bit YCbCr format.
        This new functionality is layered on top of the {@code OES_EGL_image_external} and {@code EXT_EGL_image_storage} extensions.

        Requires ${GLES30.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of TexParameteri and TexGetParameteri.",

        "TEXTURE_Y_DEGAMMA_QCOM"..0x9710,
        "TEXTURE_CBCR_DEGAMMA_QCOM"..0x9711
    )
}