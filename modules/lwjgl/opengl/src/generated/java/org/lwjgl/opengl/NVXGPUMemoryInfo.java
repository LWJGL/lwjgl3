/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NVX/NVX_gpu_memory_info.txt">NVX_gpu_memory_info</a> extension.
 * 
 * <p>GL_NVX_gpu_memory_info provides applications visibility into GPU hardware memory utilization in order to allow the application to effectively manage
 * its resource allocations in the scope of the current available GPU memory.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}</p>
 */
public final class NVXGPUMemoryInfo {

    /** Accepted by the {@code param} parameter of GetIntegerv. */
    public static final int
        GL_GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX         = 0x9047,
        GL_GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX   = 0x9048,
        GL_GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX = 0x9049,
        GL_GPU_MEMORY_INFO_EVICTION_COUNT_NVX           = 0x904A,
        GL_GPU_MEMORY_INFO_EVICTED_MEMORY_NVX           = 0x904B;

    private NVXGPUMemoryInfo() {}

}