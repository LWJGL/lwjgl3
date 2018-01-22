/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ARM_pixmap_multisample_discard = "ARMPixmapMultisampleDiscard".nativeClassEGL("ARM_pixmap_multisample_discard", postfix = ARM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        ARM_pixmap_multisample_discard adds an attribute to eglCreatePixmapSurface that allows the client API implementation to resolve a multisampled pixmap
        surface, therefore allowing the multisample buffer to be discarded.

        Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
        high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
        out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
        most cases.

        The extension provides the EGL_DISCARD_SAMPLES_ARM attribute that allows for implicit resolution when rendering to a pixmap surface. This complements
        the OpenGL ES EXT_multisampled_render_to_texture extension which provides similar functionality for rendering to an OpenGL ES texture.
        """

    IntConstant(
        "",

        "DISCARD_SAMPLES_ARM"..0x3286
    )
}