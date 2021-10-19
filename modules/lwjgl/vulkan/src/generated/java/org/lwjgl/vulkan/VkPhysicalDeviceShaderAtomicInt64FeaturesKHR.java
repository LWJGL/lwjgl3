/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkPhysicalDeviceShaderAtomicInt64Features}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderAtomicInt64FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderBufferInt64Atomics;
 *     VkBool32 shaderSharedInt64Atomics;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderAtomicInt64FeaturesKHR extends VkPhysicalDeviceShaderAtomicInt64Features {

    /**
     * Creates a {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
    @Override
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
    @Override
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderBufferInt64Atomics,
        boolean shaderSharedInt64Atomics
    ) {
        sType(sType);
        pNext(pNext);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR set(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceShaderAtomicInt64Features.Buffer {

        private static final VkPhysicalDeviceShaderAtomicInt64FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceShaderAtomicInt64FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
        @Override
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
        @Override
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    }

}