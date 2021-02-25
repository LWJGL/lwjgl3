/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link VmaDeviceMemoryCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     VmaAllocator allocator,
 *     uint32_t memoryType,
 *     VkDeviceMemory memory,
 *     VkDeviceSize size
 * )</code></pre>
 */
public abstract class VmaAllocateDeviceMemoryFunction extends Callback implements VmaAllocateDeviceMemoryFunctionI {

    /**
     * Creates a {@code VmaAllocateDeviceMemoryFunction} instance from the specified function pointer.
     *
     * @return the new {@code VmaAllocateDeviceMemoryFunction}
     */
    public static VmaAllocateDeviceMemoryFunction create(long functionPointer) {
        VmaAllocateDeviceMemoryFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VmaAllocateDeviceMemoryFunction
            ? (VmaAllocateDeviceMemoryFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VmaAllocateDeviceMemoryFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VmaAllocateDeviceMemoryFunction} instance that delegates to the specified {@code VmaAllocateDeviceMemoryFunctionI} instance. */
    public static VmaAllocateDeviceMemoryFunction create(VmaAllocateDeviceMemoryFunctionI instance) {
        return instance instanceof VmaAllocateDeviceMemoryFunction
            ? (VmaAllocateDeviceMemoryFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VmaAllocateDeviceMemoryFunction() {
        super(CIF);
    }

    VmaAllocateDeviceMemoryFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VmaAllocateDeviceMemoryFunction {

        private final VmaAllocateDeviceMemoryFunctionI delegate;

        Container(long functionPointer, VmaAllocateDeviceMemoryFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long allocator, int memoryType, long memory, long size) {
            delegate.invoke(allocator, memoryType, memory, size);
        }

    }

}