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
    public static VkFreeFunction create(long functionPointer) {
        VkFreeFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VkFreeFunction
            ? (VkFreeFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkFreeFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkFreeFunction} instance that delegates to the specified {@code VkFreeFunctionI} instance. */
    public static VkFreeFunction create(VkFreeFunctionI instance) {
        return instance instanceof VkFreeFunction
            ? (VkFreeFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VkFreeFunction() {
        super(CIF);
    }

    VkFreeFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkFreeFunction {

        private final VkFreeFunctionI delegate;

        Container(long functionPointer, VkFreeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pUserData, long pMemory) {
            delegate.invoke(pUserData, pMemory);
        }

    }

}