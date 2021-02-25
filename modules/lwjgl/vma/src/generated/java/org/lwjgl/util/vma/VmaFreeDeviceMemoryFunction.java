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
    @Nullable
    public static VmaFreeDeviceMemoryFunction createSafe(long functionPointer) {
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
        public void invoke(long allocator, int memoryType, long memory, long size) {
            delegate.invoke(allocator, memoryType, memory, size);
        }

    }

}