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
    public static ktxVulkanTexture_subAllocatorAllocMemFuncPtr create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorAllocMemFuncPtr createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxVulkanTexture_subAllocatorAllocMemFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorAllocMemFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorAllocMemFuncPtr create(ktxVulkanTexture_subAllocatorAllocMemFuncPtrI instance) { return create(instance, instance.address()); }

    private static ktxVulkanTexture_subAllocatorAllocMemFuncPtr create(ktxVulkanTexture_subAllocatorAllocMemFuncPtrI instance, long functionPointer) {
        return instance instanceof ktxVulkanTexture_subAllocatorAllocMemFuncPtr
            ? (ktxVulkanTexture_subAllocatorAllocMemFuncPtr)instance
            : new ktxVulkanTexture_subAllocatorAllocMemFuncPtr(functionPointer) {
                @Override public long invoke(long allocInfo, long memReq, long pageCount) {
                    return instance.invoke(allocInfo, memReq, pageCount);
                }
            };
    }

    protected ktxVulkanTexture_subAllocatorAllocMemFuncPtr() {
        super(DESCRIPTOR);
    }

    ktxVulkanTexture_subAllocatorAllocMemFuncPtr(long functionPointer) {
        super(functionPointer);
    }

}