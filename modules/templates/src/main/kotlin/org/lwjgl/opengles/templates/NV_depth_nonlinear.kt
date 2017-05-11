/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_depth_nonlinear = "NVDepthNonlinear".nativeClassGLES("NV_depth_nonlinear", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "EGL_NV_depth_nonlinear")} extension.

        Due to the perspective divide, conventional integer Z-buffers have a hyperbolic distribution of encodings between the near plane and the far plane.
        This can result in inaccurate depth testing, particularly when the number of depth buffer bits is small and objects are rendered near the far plane.

        Particularly when the number of depth buffer bits is limited (desirable and/or required in low-memory environments), artifacts due to this loss of
        precision may occur even with relatively modest far plane-to-near plane ratios (e.g., greater than 100:1).

        Many attempts have been made to provide alternate encodings for Z-buffer (or alternate formulations for the stored depth) to reduce the artifacts
        caused by perspective division, such as W-buffers, Z-complement buffers and floating-point 1-Z buffers.

        This extension adds a non-linear encoded Z buffer to OpenGL, which can improve the practically useful range of, e.g. 16-bit depth buffers by up to a
        factor of 16, greatly improving depth test quality in applications where the ratio between the near and far planes can not be as tightly controlled.
        """

    IntConstant(
        "Accepted as a valid sized internal format by all functions accepting sized internal formats with a base format of DEPTH_COMPONENT.",

        "DEPTH_COMPONENT16_NONLINEAR_NV"..0x8E2C
    )
}