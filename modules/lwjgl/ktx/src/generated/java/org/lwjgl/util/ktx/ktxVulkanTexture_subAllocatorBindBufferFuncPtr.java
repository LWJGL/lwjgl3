/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class ktxVulkanTexture_subAllocatorBindBufferFuncPtr extends Callback implements ktxVulkanTexture_subAllocatorBindBufferFuncPtrI {

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorBindBufferFuncPtr} instance from the specified function pointer.
     *
     * @return the new {@code ktxVulkanTexture_subAllocatorBindBufferFuncPtr}
     */
    public static ktxVulkanTexture_subAllocatorBindBufferFuncPtr create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorBindBufferFuncPtr createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxVulkanTexture_subAllocatorBindBufferFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorBindBufferFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorBindBufferFuncPtr create(ktxVulkanTexture_subAllocatorBindBufferFuncPtrI instance) { return create(instance, instance.address()); }

    private static ktxVulkanTexture_subAllocatorBindBufferFuncPtr create(ktxVulkanTexture_subAllocatorBindBufferFuncPtrI instance, long functionPointer) {
        return instance instanceof ktxVulkanTexture_subAllocatorBindBufferFuncPtr
            ? (ktxVulkanTexture_subAllocatorBindBufferFuncPtr)instance
            : new ktxVulkanTexture_subAllocatorBindBufferFuncPtr(functionPointer) {
                @Override public long invoke(long buffer, long allocId) {
                    return instance.invoke(buffer, allocId);
                }
            };
    }

    protected ktxVulkanTexture_subAllocatorBindBufferFuncPtr() {
        super(DESCRIPTOR);
    }

    ktxVulkanTexture_subAllocatorBindBufferFuncPtr(long functionPointer) {
        super(functionPointer);
    }

}