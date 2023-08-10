/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_buffer_store.txt">NV_shader_buffer_store</a> extension.
 * 
 * <p>This extension builds upon the mechanisms added by the NV_shader_buffer_load extension to allow shaders to perform random-access
 * reads to buffer object memory without using dedicated buffer object binding points.  Instead, it allowed an application to make a buffer
 * object resident, query a GPU address (pointer) for the buffer object, and then use that address as a pointer in shader code.  This approach allows
 * shaders to access a large number of buffer objects without needing to repeatedly bind buffers to a limited number of fixed-functionality binding
 * points.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}, GLSL 1.30, {@link NVShaderBufferLoad NV_shader_buffer_load}, <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_gpu_program5.txt">NV_gpu_program5</a> and/or {@link NVGPUShader5 NV_gpu_shader5}.</p>
 */
public final class NVShaderBufferStore {

    /** Accepted by the {@code barriers} parameter of MemoryBarrierNV. */
    public static final int GL_SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV = 0x10;

    private NVShaderBufferStore() {}

}