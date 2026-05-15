/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkAllocationFunction} */
public abstract class VkAllocationFunction extends Callback implements VkAllocationFunctionI {

    /**
     * Creates a {@code VkAllocationFunction} instance from the specified function pointer.
     *
     * @return the new {@code VkAllocationFunction}
     */
    public static VkAllocationFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkAllocationFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VkAllocationFunction} instance that delegates to the specified {@code VkAllocationFunctionI} instance. */
    public static VkAllocationFunction create(VkAllocationFunctionI instance) { return create(instance, instance.address()); }

    private static VkAllocationFunction create(VkAllocationFunctionI instance, long functionPointer) {
        return instance instanceof VkAllocationFunction
            ? (VkAllocationFunction)instance
            : new VkAllocationFunction(functionPointer) {
                @Override public long invoke(long pUserData, long size, long alignment, int allocationScope) {
                    return instance.invoke(pUserData, size, alignment, allocationScope);
                }
            };
    }

    protected VkAllocationFunction() {
        super(DESCRIPTOR);
    }

    VkAllocationFunction(long functionPointer) {
        super(functionPointer);
    }

}