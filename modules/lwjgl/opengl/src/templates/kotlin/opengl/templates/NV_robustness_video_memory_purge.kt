/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_robustness_video_memory_purge = "NVRobustnessVideoMemoryPurge".nativeClassGL("NV_robustness_video_memory_purge", postfix = NV) {
    IntConstant(
        "PURGED_CONTEXT_RESET_NV"..0x92BB
    )
}

val GLX_NV_robustness_video_memory_purge = "GLXNVRobustnessVideoMemoryPurge".nativeClassGLX("GLX_NV_robustness_video_memory_purge", postfix = NV) {
    IntConstant(
        "GENERATE_RESET_ON_VIDEO_MEMORY_PURGE_NV"..0x20F7
    )
}