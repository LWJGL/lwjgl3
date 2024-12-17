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
    public static ktxVulkanTexture_subAllocatorMemoryMapFuncPtr create(long functionPointer) {
        ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI instance = Callback.get(functionPointer);
        return instance instanceof ktxVulkanTexture_subAllocatorMemoryMapFuncPtr
            ? (ktxVulkanTexture_subAllocatorMemoryMapFuncPtr)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorMemoryMapFuncPtr createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxVulkanTexture_subAllocatorMemoryMapFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorMemoryMapFuncPtr create(ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI instance) {
        return instance instanceof ktxVulkanTexture_subAllocatorMemoryMapFuncPtr
            ? (ktxVulkanTexture_subAllocatorMemoryMapFuncPtr)instance
            : new Container(instance.address(), instance);
    }

    protected ktxVulkanTexture_subAllocatorMemoryMapFuncPtr() {
        super(CIF);
    }

    ktxVulkanTexture_subAllocatorMemoryMapFuncPtr(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxVulkanTexture_subAllocatorMemoryMapFuncPtr {

        private final ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI delegate;

        Container(long functionPointer, ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long allocId, long pageNumber, long mapLength, long dataPtr) {
            return delegate.invoke(allocId, pageNumber, mapLength, dataPtr);
        }

    }

}