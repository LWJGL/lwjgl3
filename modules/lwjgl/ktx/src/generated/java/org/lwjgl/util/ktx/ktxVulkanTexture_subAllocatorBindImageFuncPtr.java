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
public abstract class ktxVulkanTexture_subAllocatorBindImageFuncPtr extends Callback implements ktxVulkanTexture_subAllocatorBindImageFuncPtrI {

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorBindImageFuncPtr} instance from the specified function pointer.
     *
     * @return the new {@code ktxVulkanTexture_subAllocatorBindImageFuncPtr}
     */
    public static ktxVulkanTexture_subAllocatorBindImageFuncPtr create(long functionPointer) {
        ktxVulkanTexture_subAllocatorBindImageFuncPtrI instance = Callback.get(functionPointer);
        return instance instanceof ktxVulkanTexture_subAllocatorBindImageFuncPtr
            ? (ktxVulkanTexture_subAllocatorBindImageFuncPtr)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorBindImageFuncPtr createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxVulkanTexture_subAllocatorBindImageFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorBindImageFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorBindImageFuncPtr create(ktxVulkanTexture_subAllocatorBindImageFuncPtrI instance) {
        return instance instanceof ktxVulkanTexture_subAllocatorBindImageFuncPtr
            ? (ktxVulkanTexture_subAllocatorBindImageFuncPtr)instance
            : new Container(instance.address(), instance);
    }

    protected ktxVulkanTexture_subAllocatorBindImageFuncPtr() {
        super(CIF);
    }

    ktxVulkanTexture_subAllocatorBindImageFuncPtr(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxVulkanTexture_subAllocatorBindImageFuncPtr {

        private final ktxVulkanTexture_subAllocatorBindImageFuncPtrI delegate;

        Container(long functionPointer, ktxVulkanTexture_subAllocatorBindImageFuncPtrI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long image, long allocId) {
            return delegate.invoke(image, allocId);
        }

    }

}