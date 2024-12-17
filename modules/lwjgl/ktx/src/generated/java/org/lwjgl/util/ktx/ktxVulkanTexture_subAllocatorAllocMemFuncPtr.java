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
public abstract class ktxVulkanTexture_subAllocatorAllocMemFuncPtr extends Callback implements ktxVulkanTexture_subAllocatorAllocMemFuncPtrI {

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorAllocMemFuncPtr} instance from the specified function pointer.
     *
     * @return the new {@code ktxVulkanTexture_subAllocatorAllocMemFuncPtr}
     */
    public static ktxVulkanTexture_subAllocatorAllocMemFuncPtr create(long functionPointer) {
        ktxVulkanTexture_subAllocatorAllocMemFuncPtrI instance = Callback.get(functionPointer);
        return instance instanceof ktxVulkanTexture_subAllocatorAllocMemFuncPtr
            ? (ktxVulkanTexture_subAllocatorAllocMemFuncPtr)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorAllocMemFuncPtr createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxVulkanTexture_subAllocatorAllocMemFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorAllocMemFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorAllocMemFuncPtr create(ktxVulkanTexture_subAllocatorAllocMemFuncPtrI instance) {
        return instance instanceof ktxVulkanTexture_subAllocatorAllocMemFuncPtr
            ? (ktxVulkanTexture_subAllocatorAllocMemFuncPtr)instance
            : new Container(instance.address(), instance);
    }

    protected ktxVulkanTexture_subAllocatorAllocMemFuncPtr() {
        super(CIF);
    }

    ktxVulkanTexture_subAllocatorAllocMemFuncPtr(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxVulkanTexture_subAllocatorAllocMemFuncPtr {

        private final ktxVulkanTexture_subAllocatorAllocMemFuncPtrI delegate;

        Container(long functionPointer, ktxVulkanTexture_subAllocatorAllocMemFuncPtrI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long allocInfo, long memReq, long pageCount) {
            return delegate.invoke(allocInfo, memReq, pageCount);
        }

    }

}