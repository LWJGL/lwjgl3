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
    public static VkAllocationFunction create(long functionPointer) {
        VkAllocationFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VkAllocationFunction
            ? (VkAllocationFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkAllocationFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkAllocationFunction} instance that delegates to the specified {@code VkAllocationFunctionI} instance. */
    public static VkAllocationFunction create(VkAllocationFunctionI instance) {
        return instance instanceof VkAllocationFunction
            ? (VkAllocationFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VkAllocationFunction() {
        super(CIF);
    }

    VkAllocationFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkAllocationFunction {

        private final VkAllocationFunctionI delegate;

        Container(long functionPointer, VkAllocationFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pUserData, long size, long alignment, int allocationScope) {
            return delegate.invoke(pUserData, size, alignment, allocationScope);
        }

    }

}