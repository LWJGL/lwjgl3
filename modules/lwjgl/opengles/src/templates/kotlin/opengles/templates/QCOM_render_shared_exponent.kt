/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_render_shared_exponent = "QCOMRenderSharedExponent".nativeClassGLES("QCOM_render_shared_exponent", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL ES 3.2 supports a packed, shared exponent floating format {@code RGB9_E5} which is not color-renderable.

        This extension enables the packed, shared exponent floating type format {@code RGB9_E5} to be color-renderable using framebuffer objects.
    
        Requires ${GLES30.core}
        """

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of #RenderbufferStorage().",

        "RGB9_E5"..0x8C3D
    )
}