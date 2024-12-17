/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkReallocationFunction} */
public abstract class VkReallocationFunction extends Callback implements VkReallocationFunctionI {

    /**
     * Creates a {@code VkReallocationFunction} instance from the specified function pointer.
     *
     * @return the new {@code VkReallocationFunction}
     */
    public static VkReallocationFunction create(long functionPointer) {
        VkReallocationFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VkReallocationFunction
            ? (VkReallocationFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkReallocationFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkReallocationFunction} instance that delegates to the specified {@code VkReallocationFunctionI} instance. */
    public static VkReallocationFunction create(VkReallocationFunctionI instance) {
        return instance instanceof VkReallocationFunction
            ? (VkReallocationFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VkReallocationFunction() {
        super(CIF);
    }

    VkReallocationFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkReallocationFunction {

        private final VkReallocationFunctionI delegate;

        Container(long functionPointer, VkReallocationFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pUserData, long pOriginal, long size, long alignment, int allocationScope) {
            return delegate.invoke(pUserData, pOriginal, size, alignment, allocationScope);
        }

    }

}