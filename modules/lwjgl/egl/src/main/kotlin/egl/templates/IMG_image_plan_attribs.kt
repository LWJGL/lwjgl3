/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val IMG_image_plane_attribs = "IMGImagePlaneAttribs".nativeClassEGL("IMG_image_plane_attribs", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an EGLImage from a single plane of a multi-planar Android native image buffer (ANativeWindowBuffer) or a native pixmap
        (EGLNativePixmap).
        """

    IntConstant(
        "Accepted by the {@code attrib_list} parameter of eglCreateImageKHR.",

        "NATIVE_BUFFER_MULTIPLANE_SEPARATE_IMG"..0x3105,
        "NATIVE_BUFFER_PLANE_OFFSET_IMG"..0x3106
    )
}