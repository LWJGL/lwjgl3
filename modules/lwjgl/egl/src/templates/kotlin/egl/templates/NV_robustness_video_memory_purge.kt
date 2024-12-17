/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_robustness_video_memory_purge = "NVRobustnessVideoMemoryPurge".nativeClassEGL("NV_robustness_video_memory_purge", postfix = NV) {
    IntConstant(
        "GENERATE_RESET_ON_VIDEO_MEMORY_PURGE_NV"..0x334C
    )
}