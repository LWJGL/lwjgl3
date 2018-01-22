/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_device_drm = "EXTDeviceDRM".nativeClassEGL("EXT_device_drm", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        These extensions define how to map device and output handles between EGL and DRM/KMS. An EGL implementation which provides these extensions must have
        access to sufficient knowledge of the DRM implementation to be able to perform these mappings. No requirements are imposed on how this information is
        obtained, nor does this support have any implications for how EGL devices and outputs are implemented. Among the possibilities, support may be
        implemented in a generic fashion by layering on top of DRM, or EGL and DRM backends may be provided by the same vendor and share privileged lower level
        resources. An implementation which supports these extensions may support other low level device interfaces, such as OpenWF Display, as well.

        Requires ${EXT_device_base.link}.
        """

    IntConstant(
        "",

        "DRM_DEVICE_FILE_EXT"..0x3233
    )
}

val EXT_output_drm = "EXTOutputDRM".nativeClassEGL("EXT_output_drm", postfix = EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "EGL_EXT_device_drm")} extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        These extensions define how to map device and output handles between EGL and DRM/KMS. An EGL implementation which provides these extensions must have
        access to sufficient knowledge of the DRM implementation to be able to perform these mappings. No requirements are imposed on how this information is
        obtained, nor does this support have any implications for how EGL devices and outputs are implemented. Among the possibilities, support may be
        implemented in a generic fashion by layering on top of DRM, or EGL and DRM backends may be provided by the same vendor and share privileged lower level
        resources. An implementation which supports these extensions may support other low level device interfaces, such as OpenWF Display, as well.

        Requires ${EXT_output_base.link}.
        """

    IntConstant(
        "",

        "DRM_CRTC_EXT"..0x3234,
        "DRM_PLANE_EXT"..0x3235,
        "DRM_CONNECTOR_EXT"..0x3236
    )
}