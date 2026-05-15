/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkFreeFunction} */
public abstract class VkFreeFunction extends Callback implements VkFreeFunctionI {

    /**
     * Creates a {@code VkFreeFunction} instance from the specified function pointer.
     *
     * @return the new {@code VkFreeFunction}
     */
    public static VkFreeFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkFreeFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VkFreeFunction} instance that delegates to the specified {@code VkFreeFunctionI} instance. */
    public static VkFreeFunction create(VkFreeFunctionI instance) { return create(instance, instance.address()); }

    private static VkFreeFunction create(VkFreeFunctionI instance, long functionPointer) {
        return instance instanceof VkFreeFunction
            ? (VkFreeFunction)instance
            : new VkFreeFunction(functionPointer) {
                @Override public void invoke(long pUserData, long pMemory) {
                    instance.invoke(pUserData, pMemory);
                }
            };
    }

    protected VkFreeFunction() {
        super(DESCRIPTOR);
    }

    VkFreeFunction(long functionPointer) {
        super(functionPointer);
    }

}