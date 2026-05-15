/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vmaAllocateDeviceMemoryFunction} */
public abstract class VmaAllocateDeviceMemoryFunction extends Callback implements VmaAllocateDeviceMemoryFunctionI {

    /**
     * Creates a {@code VmaAllocateDeviceMemoryFunction} instance from the specified function pointer.
     *
     * @return the new {@code VmaAllocateDeviceMemoryFunction}
     */
    public static VmaAllocateDeviceMemoryFunction create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VmaAllocateDeviceMemoryFunction createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VmaAllocateDeviceMemoryFunction} instance that delegates to the specified {@code VmaAllocateDeviceMemoryFunctionI} instance. */
    public static VmaAllocateDeviceMemoryFunction create(VmaAllocateDeviceMemoryFunctionI instance) { return create(instance, instance.address()); }

    private static VmaAllocateDeviceMemoryFunction create(VmaAllocateDeviceMemoryFunctionI instance, long functionPointer) {
        return instance instanceof VmaAllocateDeviceMemoryFunction
            ? (VmaAllocateDeviceMemoryFunction)instance
            : new VmaAllocateDeviceMemoryFunction(functionPointer) {
                @Override public void invoke(long allocator, int memoryType, long memory, long size, long pUserData) {
                    instance.invoke(allocator, memoryType, memory, size, pUserData);
                }
            };
    }

    protected VmaAllocateDeviceMemoryFunction() {
        super(DESCRIPTOR);
    }

    VmaAllocateDeviceMemoryFunction(long functionPointer) {
        super(functionPointer);
    }

}