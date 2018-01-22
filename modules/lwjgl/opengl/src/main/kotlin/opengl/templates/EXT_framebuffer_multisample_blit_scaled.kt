/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_framebuffer_multisample_blit_scaled = "EXTFramebufferMultisampleBlitScaled".nativeClassGL("EXT_framebuffer_multisample_blit_scaled", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension relaxes some of the restrictions associated with multisample resolve operations, specifically to allow a combined resolve and scale
        operation through a single call to BlitFramebuffer. It also adds two new filter types to control the quality of the combined scaled resolve operation.

        In traditional multisampled framebuffer rendering, color samples must be explicitly resolved via BlitFramebuffer before any other operation on the
        resulting pixel values can be performed. This multisample resolve operation must be done using a BlitFramebuffer call where the dimensions of the source
        and destination rectangles are identical. If the resulting pixel values need to be copied to a texture with different dimensions, these resolved values
        can then be scaled with a second call to BlitFramebuffer.

        By requiring two separate calls to BlitFramebuffer, the quality of final image can be maintained to a certain degree. The samples are first resolved,
        and then these resolved values can be filtered to produce the final image. This image quality comes at the price of increased memory usage and lower
        performance. However, the scaling blit can still introduce artifacts, particularly if it is done with a simple bilinear filter.

        The new filter types introduced by this extension allow the scaled resolve to be done with a single call to BlitFramebuffer. Not all samples from the
        read framebuffer are required to be be used when producing the final pixel values, and there may be a loss in quality when compared to an image produced
        by a separate resolve and scale. However, the single-pass scaled resolve blit should be faster than the traditional two-pass resolve then scale blits.

        Requires ${ARB_framebuffer_object.link}.
        """

    IntConstant(
        "Accepted by the {@code filter} parameter of BlitFramebuffer.",

        "SCALED_RESOLVE_FASTEST_EXT"..0x90BA,
        "SCALED_RESOLVE_NICEST_EXT"..0x90BB
    )
}