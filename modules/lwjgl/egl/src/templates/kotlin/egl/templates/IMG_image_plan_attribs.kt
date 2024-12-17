/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val IMG_image_plane_attribs = "IMGImagePlaneAttribs".nativeClassEGL("IMG_image_plane_attribs", postfix = IMG) {
    IntConstant(
        "NATIVE_BUFFER_MULTIPLANE_SEPARATE_IMG"..0x3105,
        "NATIVE_BUFFER_PLANE_OFFSET_IMG"..0x3106
    )
}