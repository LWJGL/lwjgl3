/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_uniform_buffer_unified_memory.txt">NV_uniform_buffer_unified_memory</a> extension.
 * 
 * <p>This extension provides a mechanism to specify uniform buffers
 * using GPU addresses.</p>
 * 
 * <p>Binding uniform buffers is one of the most frequent and expensive
 * operations in many GL applications, due to the cost of chasing 
 * pointers and binding objects described in the overview of 
 * NV_shader_buffer_load. The intent of this extension is to enable a 
 * way for the application to specify uniform buffer state that alleviates
 * the overhead of object binds and driver memory management.</p>
 */
public final class NVUniformBufferUnifiedMemory {

    /** Accepted by the {@code cap} parameter of DisableClientState, EnableClientState, IsEnabled. */
    public static final int GL_UNIFORM_BUFFER_UNIFIED_NV = 0x936E;

    /** Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64i_vNV. */
    public static final int GL_UNIFORM_BUFFER_ADDRESS_NV = 0x936F;

    /** Accepted by the {@code target} parameter of GetIntegeri_vNV. */
    public static final int GL_UNIFORM_BUFFER_LENGTH_NV = 0x9370;

    private NVUniformBufferUnifiedMemory() {}

}