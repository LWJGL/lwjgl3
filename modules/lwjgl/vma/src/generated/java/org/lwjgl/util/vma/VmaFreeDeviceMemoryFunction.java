/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vmaFreeDeviceMemoryFunction} */
public abstract class VmaFreeDeviceMemoryFunction extends Callback implements VmaFreeDeviceMemoryFunctionI {

    /**
     * Creates a {@code VmaFreeDeviceMemoryFunction} instance from the specified function pointer.
     *
     * @return the new {@code VmaFreeDeviceMemoryFunction}
     */
    public static VmaFreeDeviceMemoryFunction create(long functionPointer) {
        VmaFreeDeviceMemoryFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VmaFreeDeviceMemoryFunction
            ? (VmaFreeDeviceMemoryFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VmaFreeDeviceMemoryFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VmaFreeDeviceMemoryFunction} instance that delegates to the specified {@code VmaFreeDeviceMemoryFunctionI} instance. */
    public static VmaFreeDeviceMemoryFunction create(VmaFreeDeviceMemoryFunctionI instance) {
        return instance instanceof VmaFreeDeviceMemoryFunction
            ? (VmaFreeDeviceMemoryFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VmaFreeDeviceMemoryFunction() {
        super(CIF);
    }

    VmaFreeDeviceMemoryFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VmaFreeDeviceMemoryFunction {

        private final VmaFreeDeviceMemoryFunctionI delegate;

        Container(long functionPointer, VmaFreeDeviceMemoryFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long allocator, int memoryType, long memory, long size, long pUserData) {
            delegate.invoke(allocator, memoryType, memory, size, pUserData);
        }

    }

}