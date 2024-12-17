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
public abstract class ktxVulkanTexture_subAllocatorFreeMemFuncPtr extends Callback implements ktxVulkanTexture_subAllocatorFreeMemFuncPtrI {

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorFreeMemFuncPtr} instance from the specified function pointer.
     *
     * @return the new {@code ktxVulkanTexture_subAllocatorFreeMemFuncPtr}
     */
    public static ktxVulkanTexture_subAllocatorFreeMemFuncPtr create(long functionPointer) {
        ktxVulkanTexture_subAllocatorFreeMemFuncPtrI instance = Callback.get(functionPointer);
        return instance instanceof ktxVulkanTexture_subAllocatorFreeMemFuncPtr
            ? (ktxVulkanTexture_subAllocatorFreeMemFuncPtr)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorFreeMemFuncPtr createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxVulkanTexture_subAllocatorFreeMemFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorFreeMemFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorFreeMemFuncPtr create(ktxVulkanTexture_subAllocatorFreeMemFuncPtrI instance) {
        return instance instanceof ktxVulkanTexture_subAllocatorFreeMemFuncPtr
            ? (ktxVulkanTexture_subAllocatorFreeMemFuncPtr)instance
            : new Container(instance.address(), instance);
    }

    protected ktxVulkanTexture_subAllocatorFreeMemFuncPtr() {
        super(CIF);
    }

    ktxVulkanTexture_subAllocatorFreeMemFuncPtr(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxVulkanTexture_subAllocatorFreeMemFuncPtr {

        private final ktxVulkanTexture_subAllocatorFreeMemFuncPtrI delegate;

        Container(long functionPointer, ktxVulkanTexture_subAllocatorFreeMemFuncPtrI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long allocId) {
            return delegate.invoke(allocId);
        }

    }

}