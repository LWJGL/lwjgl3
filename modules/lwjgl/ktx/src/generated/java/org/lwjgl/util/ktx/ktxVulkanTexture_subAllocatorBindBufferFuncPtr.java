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
    public static ktxVulkanTexture_subAllocatorBindBufferFuncPtr create(long functionPointer) {
        ktxVulkanTexture_subAllocatorBindBufferFuncPtrI instance = Callback.get(functionPointer);
        return instance instanceof ktxVulkanTexture_subAllocatorBindBufferFuncPtr
            ? (ktxVulkanTexture_subAllocatorBindBufferFuncPtr)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorBindBufferFuncPtr createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxVulkanTexture_subAllocatorBindBufferFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorBindBufferFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorBindBufferFuncPtr create(ktxVulkanTexture_subAllocatorBindBufferFuncPtrI instance) {
        return instance instanceof ktxVulkanTexture_subAllocatorBindBufferFuncPtr
            ? (ktxVulkanTexture_subAllocatorBindBufferFuncPtr)instance
            : new Container(instance.address(), instance);
    }

    protected ktxVulkanTexture_subAllocatorBindBufferFuncPtr() {
        super(CIF);
    }

    ktxVulkanTexture_subAllocatorBindBufferFuncPtr(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxVulkanTexture_subAllocatorBindBufferFuncPtr {

        private final ktxVulkanTexture_subAllocatorBindBufferFuncPtrI delegate;

        Container(long functionPointer, ktxVulkanTexture_subAllocatorBindBufferFuncPtrI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long buffer, long allocId) {
            return delegate.invoke(buffer, allocId);
        }

    }

}