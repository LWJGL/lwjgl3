/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_lod_bias = "QCOMTextureLODBias".nativeClassGLES("QCOM_texture_lod_bias", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension reintroduces the texture LOD bias operation from {@code EXT_texture_lod_bias} which is written based on OpenGL ES 1.1. It provides a
        mean to bias the lambda computation by a constant (signed) value. This bias can provide a way to blur or pseudo-sharpen OpenGL ES's standard texture
        filtering.

        This blurring or pseudo-sharpening may be useful for special effects (such as depth-of-field effects) or image processing techniques (where the mipmap
        levels act as pre-downsampled image versions). On some implementations, increasing the texture LOD bias may improve texture filtering performance (at
        the cost of texture blurriness).
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of #TexParameterf(), #SamplerParameterf(), #GetTexParameterfv() and #GetSamplerParameterfv().",

        "TEXTURE_LOD_BIAS_QCOM"..0x8C96
    )
}