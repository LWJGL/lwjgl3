/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_foveated2 = "QCOMTextureFoveated2".nativeClassGLES("QCOM_texture_foveated2", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new texture parameter that specifies a pixel density below which rendering can be discarded during foveated rendering.
    
        Requires ${QCOM_texture_foveated.link}.
        """

    IntConstant(
        """
        Accepted as a value for {@code pname} for the {@code TexParameter{if}} and {@code TexParameter{if}v} commands and for the {@code pname} parameter of
        {@code GetTexParameter{if}v}.
        """,

        "TEXTURE_FOVEATED_CUTOFF_DENSITY_QCOM"..0x96A0
    )
}