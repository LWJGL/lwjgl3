/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val INTEL_framebuffer_CMAA = "INTELFramebufferCMAA".nativeClassGLES("INTEL_framebuffer_CMAA", postfix = INTEL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Multisampling is a mechanism to antialias all GL primitives and is part of the GL specification.

        Better visual quality can be achieved by applying multisampling. However, on certain platforms it comes at a high performance cost. In general, the
        greater number of samples per pixel, the bigger the cost.

        Conservative Morphological Anti-Aliasing (CMAA) is an alternative approach to antialiasing, which operates on the final image. This post processing
        technique results in image quality comparable to multisampling at much lower cost and better performance.

        This extension incorporates an optimized CMAA algorithm implementation into the GL implementation.

        For more information on CMAA refer to ${url("http://software.intel.com", "http://software.intel.com")}.
        """

    void(
        "ApplyFramebufferAttachmentCMAAINTEL",
        """
        Requests the post processing of current draw buffers pertaining to the framebuffer bound to the #DRAW_FRAMEBUFFER target according to the
        Conservative Morphological Anti-Aliasing algorithm.
        """
    )
}