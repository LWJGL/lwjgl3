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
public abstract class ktxVulkanTexture_subAllocatorMemoryMapFuncPtr extends Callback implements ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI {

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorMemoryMapFuncPtr} instance from the specified function pointer.
     *
     * @return the new {@code ktxVulkanTexture_subAllocatorMemoryMapFuncPtr}
     */
    public static ktxVulkanTexture_subAllocatorMemoryMapFuncPtr create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorMemoryMapFuncPtr createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxVulkanTexture_subAllocatorMemoryMapFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorMemoryMapFuncPtr create(ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI instance) { return create(instance, instance.address()); }

    private static ktxVulkanTexture_subAllocatorMemoryMapFuncPtr create(ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI instance, long functionPointer) {
        return instance instanceof ktxVulkanTexture_subAllocatorMemoryMapFuncPtr
            ? (ktxVulkanTexture_subAllocatorMemoryMapFuncPtr)instance
            : new ktxVulkanTexture_subAllocatorMemoryMapFuncPtr(functionPointer) {
                @Override public long invoke(long allocId, long pageNumber, long mapLength, long dataPtr) {
                    return instance.invoke(allocId, pageNumber, mapLength, dataPtr);
                }
            };
    }

    protected ktxVulkanTexture_subAllocatorMemoryMapFuncPtr() {
        super(DESCRIPTOR);
    }

    ktxVulkanTexture_subAllocatorMemoryMapFuncPtr(long functionPointer) {
        super(functionPointer);
    }

}