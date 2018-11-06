/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_system_time = "NVSystemTime".nativeClassEGL("NV_system_time", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension exposes an alternative method of querying the system time from the driver instead of the operating system.

        Requires ${EGL12.core}.
        """

    EGLuint64NV("GetSystemTimeFrequencyNV", "", void())

    EGLuint64NV("GetSystemTimeNV", "", void())
}