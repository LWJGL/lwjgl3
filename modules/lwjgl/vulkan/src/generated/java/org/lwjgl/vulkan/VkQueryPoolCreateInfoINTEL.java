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
 * See {@link VkQueryPoolPerformanceQueryCreateInfoINTEL}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryPoolCreateInfoINTEL {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueryPoolSamplingModeINTEL performanceCountersSampling;
 * }</code></pre>
 */
public class VkQueryPoolCreateInfoINTEL extends VkQueryPoolPerformanceQueryCreateInfoINTEL {

    /**
     * Creates a {@code VkQueryPoolCreateInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryPoolCreateInfoINTEL(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkQueryPoolCreateInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL} value to the {@code sType} field. */
    @Override
    public VkQueryPoolCreateInfoINTEL sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkQueryPoolCreateInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code performanceCountersSampling} field. */
    @Override
    public VkQueryPoolCreateInfoINTEL performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) { nperformanceCountersSampling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkQueryPoolCreateInfoINTEL set(
        int sType,
        long pNext,
        int performanceCountersSampling
    ) {
        sType(sType);
        pNext(pNext);
        performanceCountersSampling(performanceCountersSampling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueryPoolCreateInfoINTEL set(VkQueryPoolCreateInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryPoolCreateInfoINTEL malloc() {
        return wrap(VkQueryPoolCreateInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryPoolCreateInfoINTEL calloc() {
        return wrap(VkQueryPoolCreateInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkQueryPoolCreateInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueryPoolCreateInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueryPoolCreateInfoINTEL} instance for the specified memory address. */
    public static VkQueryPoolCreateInfoINTEL create(long address) {
        return wrap(VkQueryPoolCreateInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolCreateInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkQueryPoolCreateInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueryPoolCreateInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolCreateInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolCreateInfoINTEL malloc(MemoryStack stack) {
        return wrap(VkQueryPoolCreateInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueryPoolCreateInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolCreateInfoINTEL calloc(MemoryStack stack) {
        return wrap(VkQueryPoolCreateInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkQueryPoolCreateInfoINTEL} structs. */
    public static class Buffer extends VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer {

        private static final VkQueryPoolCreateInfoINTEL ELEMENT_FACTORY = VkQueryPoolCreateInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkQueryPoolCreateInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryPoolCreateInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkQueryPoolCreateInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkQueryPoolCreateInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryPoolCreateInfoINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL} value to the {@code sType} field. */
        @Override
        public VkQueryPoolCreateInfoINTEL.Buffer sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkQueryPoolCreateInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkQueryPoolCreateInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code performanceCountersSampling} field. */
        @Override
        public VkQueryPoolCreateInfoINTEL.Buffer performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) { VkQueryPoolCreateInfoINTEL.nperformanceCountersSampling(address(), value); return this; }

    }

}