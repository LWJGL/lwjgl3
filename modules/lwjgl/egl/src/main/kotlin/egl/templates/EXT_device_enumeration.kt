/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_device_enumeration = "EXTDeviceEnumeration".nativeClassEGL("EXT_device_enumeration", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
        native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
        solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
        without the use of any underlying "native" APIs or functionality.

        The original EGL_EXT_device_base extension combined the conceptually separate operations of querying the underlying device used by a given EGLDisplay
        and enumerating devices from scratch. It was later identified that the former is useful even in EGL implementations that have no need or ability to
        allow enumerating all the devices available on a system. To accommodate this, the extension was split in two.

        Requires ${EGL15.core} or an earlier verison of EGL with the ${registryLink("EXT", "EGL_EXT_client_extensions")} extension.
        """

    EGLBoolean(
        "QueryDevicesEXT",
        "",

        AutoSize("devices")..EGLint.IN("max_devices", ""),
        nullable..EGLDeviceEXT_p.OUT("devices", ""),
        Check(1)..EGLint_p.OUT("num_devices", "")
    )
}