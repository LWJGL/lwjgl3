/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_persistent_id = "EXTDevicePersistentID".nativeClassEGL("EXT_device_persistent_id", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications can query a list of {@code EGLDeviceEXT} handles, but those handles are only valid within the process that queried them. An application
        has no way, for example, to record its selection and select the same device when run again later.

        This extension provides a vendor name and a set of UUID's, which provide a unique, persistent identifier for {@code EGLDeviceEXT} handles. This allows
        applications to find the {@code EGLDeviceEXT} for the same device across multiple processes, and across multiple APIs.
        
        Requires ${EXT_device_query.link}.
        """

    IntConstant(
        "Accepted by the {@code name} parameter of #QueryDeviceStringEXT().",

        "DRIVER_NAME_EXT"..0x335E
    )

    IntConstant(
        "Accepted by the {@code name} parameter of #QueryDeviceBinaryEXT().",

        "DEVICE_UUID_EXT"..0x335C,
        "DRIVER_UUID_EXT"..0x335D
    )

    EGLBoolean(
        "QueryDeviceBinaryEXT",
        "",

        EGLDeviceEXT("device", ""),
        EGLint("name", ""),
        AutoSize("value")..EGLint("max_size", ""),
        nullable..void.p("value", ""),
        Check(1)..EGLint.p("size", "")
    )
}