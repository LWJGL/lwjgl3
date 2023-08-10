/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_cuda_event.txt">NV_cuda_event</a> extension.
 * 
 * <p>This extension allows creating an EGL sync object linked to a CUDA event object, potentially improving efficiency of sharing images and compute results
 * between the two APIs.</p>
 * 
 * <p>Requires {@link EGL15 EGL 1.5} or {@link KHRFenceSync KHR_fence_sync}.</p>
 */
public final class NVCUDAEvent {

    public static final int
        EGL_CUDA_EVENT_HANDLE_NV        = 0x323B,
        EGL_SYNC_CUDA_EVENT_NV          = 0x323C,
        EGL_SYNC_CUDA_EVENT_COMPLETE_NV = 0x323D;

    private NVCUDAEvent() {}

}