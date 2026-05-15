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
    public static VmaFreeDeviceMemoryFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VmaFreeDeviceMemoryFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VmaFreeDeviceMemoryFunction} instance that delegates to the specified {@code VmaFreeDeviceMemoryFunctionI} instance. */
    public static VmaFreeDeviceMemoryFunction create(VmaFreeDeviceMemoryFunctionI instance) { return create(instance, instance.address()); }

    private static VmaFreeDeviceMemoryFunction create(VmaFreeDeviceMemoryFunctionI instance, long functionPointer) {
        return instance instanceof VmaFreeDeviceMemoryFunction
            ? (VmaFreeDeviceMemoryFunction)instance
            : new VmaFreeDeviceMemoryFunction(functionPointer) {
                @Override public void invoke(long allocator, int memoryType, long memory, long size, long pUserData) {
                    instance.invoke(allocator, memoryType, memory, size, pUserData);
                }
            };
    }

    protected VmaFreeDeviceMemoryFunction() {
        super(DESCRIPTOR);
    }

    VmaFreeDeviceMemoryFunction(long functionPointer) {
        super(functionPointer);
    }

}