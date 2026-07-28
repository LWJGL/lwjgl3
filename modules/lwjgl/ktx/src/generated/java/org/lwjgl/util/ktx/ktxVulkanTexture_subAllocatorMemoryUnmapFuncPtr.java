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
public abstract class ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr extends Callback implements ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI {

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr} instance from the specified function pointer.
     *
     * @return the new {@code ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr}
     */
    public static ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr create(ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI instance) { return create(instance, instance.address()); }

    private static ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr create(ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI instance, long functionPointer) {
        return instance instanceof ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr
            ? (ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr)instance
            : new ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr(functionPointer) {
                @Override public long invoke(long allocId, long pageNumber) {
                    return instance.invoke(allocId, pageNumber);
                }
            };
    }

    protected ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr() {
        super(DESCRIPTOR);
    }

    ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr(long functionPointer) {
        super(functionPointer);
    }

}