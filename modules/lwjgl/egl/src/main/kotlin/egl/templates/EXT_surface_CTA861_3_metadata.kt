/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_surface_CTA861_3_metadata = "EXTSurfaceCTA861_3Metadata".nativeClassEGL("EXT_surface_CTA861_3_metadata", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds additional EGL surface attributes for the metadata defined by the CTA (Consumer Technology Association) 861.3 standard. This
        metadata, in addition to the SMPTE 2086 metadata, is used to define the color volume of the mastering display as well as the content (CTA-861.3), The
        mastering display is the display where creative work is done and creative intent is established. To preserve such creative intent as much as possible
        and achieve consistent color reproduction on different viewing displays, it is useful for the display pipeline to know the color volume of the original
        mastering display where content is created or tuned. This avoids performing unnecessary mapping of colors that are not displayable on the original
        mastering display.

        This extension adds the ability to pass the CTA-861.3 metadata via EGL, from which the color volume can be derived. While the general purpose of the
        metadata is to assist in the transformation between different color volumes of different displays and help achieve better color reproduction, it is not
        in the scope of this extension to define how exactly the metadata should be used in such a process. It is up to the implementation to determine how to
        make use of the metadata.

        Requires ${EGL15.core} and ${EXT_surface_SMPTE2086_metadata.link}.
        """

    IntConstant(
        "Accepted as attribute by #SurfaceAttrib() and #QuerySurface().",

        "CTA861_3_MAX_CONTENT_LIGHT_LEVEL_EXT"..0x3360,
        "CTA861_3_MAX_FRAME_AVERAGE_LEVEL_EXT"..0x3361
    )
}