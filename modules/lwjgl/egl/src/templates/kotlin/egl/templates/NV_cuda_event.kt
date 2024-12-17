/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_cuda_event = "NVCUDAEvent".nativeClassEGL("NV_cuda_event", postfix = NV) {
    IntConstant(
        "CUDA_EVENT_HANDLE_NV"..0x323B,
        "SYNC_CUDA_EVENT_NV"..0x323C,
        "SYNC_CUDA_EVENT_COMPLETE_NV"..0x323D
    )
}