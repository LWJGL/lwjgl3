/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_drm = "EXTDeviceDRM".nativeClassEGL("EXT_device_drm", postfix = EXT) {
    IntConstant(
        "DRM_DEVICE_FILE_EXT"..0x3233
    )
}

val EXT_output_drm = "EXTOutputDRM".nativeClassEGL("EXT_output_drm", postfix = EXT) {
    IntConstant(
        "DRM_CRTC_EXT"..0x3234,
        "DRM_PLANE_EXT"..0x3235,
        "DRM_CONNECTOR_EXT"..0x3236
    )
}