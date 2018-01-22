/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_robustness_video_memory_purge = "NVRobustnessVideoMemoryPurge".nativeClassEGL("NV_robustness_video_memory_purge", postfix = NV) {
    documentation =
        "Native bindings to the {@code EGL_NV_robustness_video_memory_purge} extension."

    IntConstant(
        "Accepted as an attribute name in the {@code *attrib_list} argument of eglCreateContext.",

        "GENERATE_RESET_ON_VIDEO_MEMORY_PURGE_NV"..0x334C
    )
}