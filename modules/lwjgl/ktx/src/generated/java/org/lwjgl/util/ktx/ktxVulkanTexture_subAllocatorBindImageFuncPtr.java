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
    public static ktxVulkanTexture_subAllocatorBindImageFuncPtr create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorBindImageFuncPtr createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxVulkanTexture_subAllocatorBindImageFuncPtr} instance that delegates to the specified {@code ktxVulkanTexture_subAllocatorBindImageFuncPtrI} instance. */
    public static ktxVulkanTexture_subAllocatorBindImageFuncPtr create(ktxVulkanTexture_subAllocatorBindImageFuncPtrI instance) { return create(instance, instance.address()); }

    private static ktxVulkanTexture_subAllocatorBindImageFuncPtr create(ktxVulkanTexture_subAllocatorBindImageFuncPtrI instance, long functionPointer) {
        return instance instanceof ktxVulkanTexture_subAllocatorBindImageFuncPtr
            ? (ktxVulkanTexture_subAllocatorBindImageFuncPtr)instance
            : new ktxVulkanTexture_subAllocatorBindImageFuncPtr(functionPointer) {
                @Override public long invoke(long image, long allocId) {
                    return instance.invoke(image, allocId);
                }
            };
    }

    protected ktxVulkanTexture_subAllocatorBindImageFuncPtr() {
        super(DESCRIPTOR);
    }

    ktxVulkanTexture_subAllocatorBindImageFuncPtr(long functionPointer) {
        super(functionPointer);
    }

}