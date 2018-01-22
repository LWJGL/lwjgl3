/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_cuda_event = "NVCUDAEvent".nativeClassEGL("NV_cuda_event", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an EGL sync object linked to a CUDA event object, potentially improving efficiency of sharing images and compute results
        between the two APIs.

        Requires ${EGL15.core} or ${KHR_fence_sync.link}.
        """

    IntConstant(
        "",

        "CUDA_EVENT_HANDLE_NV"..0x323B,
        "SYNC_CUDA_EVENT_NV"..0x323C,
        "SYNC_CUDA_EVENT_COMPLETE_NV"..0x323D
    )
}