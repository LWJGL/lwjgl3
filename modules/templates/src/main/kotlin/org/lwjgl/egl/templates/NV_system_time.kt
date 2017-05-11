/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*

val NV_system_time = "NVSystemTime".nativeClassEGL("NV_system_time", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension exposes an alternative method of querying the system time from the driver instead of the operating system.

        Requires ${EGL12.core}.
        """

    EGLuint64NV(
        "GetSystemTimeFrequencyNV",
        ""
    )

    EGLuint64NV(
        "GetSystemTimeNV",
        ""
    )
}