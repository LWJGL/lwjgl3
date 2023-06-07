/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Statistics of current memory usage and available budget for a specific memory heap.
 * 
 * <p>These are fast to calculate.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaBudget {
 *     {@link VmaStatistics VmaStatistics} {@link #statistics};
 *     VkDeviceSize {@link #usage};
 *     VkDeviceSize {@link #budget};
 * }</code></pre>
 *
 * @see Vma#vmaGetHeapBudgets
 */
public class VmaBudget extends Struct<VmaBudget> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STATISTICS,
        USAGE,
        BUDGET;

    static {
        Layout layout = __struct(
            __member(VmaStatistics.SIZEOF, VmaStatistics.ALIGNOF),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STATISTICS = layout.offsetof(0);
        USAGE = layout.offsetof(1);
        BUDGET = layout.offsetof(2);
    }

    protected VmaBudget(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaBudget create(long address, @Nullable ByteBuffer container) {
        return new VmaBudget(address, container);
    }

    /**
     * Creates a {@code VmaBudget} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaBudget(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** statistics fetched from the library */
    public VmaStatistics statistics() { return nstatistics(address()); }
    /**
     * Estimated current memory usage of the program, in bytes.
     * 
     * <p>Fetched from system using {@code VK_EXT_memory_budget} extension if enabled.</p>
     * 
     * <p>It might be different than {@code statistics.blockBytes} (usually higher) due to additional implicit objects also occupying the memory, like swapchain,
     * pipelines, descriptor heaps, command buffers, or {@code VkDeviceMemory} blocks allocated outside of this library, if any.</p>
     */
    @NativeType("VkDeviceSize")
    public long usage() { return nusage(address()); }
    /**
     * Estimated amount of memory available to the program, in bytes.
     * 
     * <p>Fetched from system using {@code VK_EXT_memory_budget} extension if enabled.</p>
     * 
     * <p>It might be different (most probably smaller) than {@code VkMemoryHeap::size[heapIndex]} due to factors external to the program, decided by the
     * operating system. Difference {@code budget - usage} is the amount of additional memory that can probably be allocated without problems. Exceeding
     * the budget may result in various problems.</p>
     */
    @NativeType("VkDeviceSize")
    public long budget() { return nbudget(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaBudget} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaBudget malloc() {
        return new VmaBudget(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaBudget} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaBudget calloc() {
        return new VmaBudget(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaBudget} instance allocated with {@link BufferUtils}. */
    public static VmaBudget create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaBudget(memAddress(container), container);
    }

    /** Returns a new {@code VmaBudget} instance for the specified memory address. */
    public static VmaBudget create(long address) {
        return new VmaBudget(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaBudget createSafe(long address) {
        return address == NULL ? null : new VmaBudget(address, null);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaBudget.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaBudget.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaBudget} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaBudget malloc(MemoryStack stack) {
        return new VmaBudget(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaBudget} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaBudget calloc(MemoryStack stack) {
        return new VmaBudget(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #statistics}. */
    public static VmaStatistics nstatistics(long struct) { return VmaStatistics.create(struct + VmaBudget.STATISTICS); }
    /** Unsafe version of {@link #usage}. */
    public static long nusage(long struct) { return UNSAFE.getLong(null, struct + VmaBudget.USAGE); }
    /** Unsafe version of {@link #budget}. */
    public static long nbudget(long struct) { return UNSAFE.getLong(null, struct + VmaBudget.BUDGET); }

    // -----------------------------------

    /** An array of {@link VmaBudget} structs. */
    public static class Buffer extends StructBuffer<VmaBudget, Buffer> implements NativeResource {

        private static final VmaBudget ELEMENT_FACTORY = VmaBudget.create(-1L);

        /**
         * Creates a new {@code VmaBudget.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaBudget#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VmaBudget getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VmaStatistics} view of the {@link VmaBudget#statistics} field. */
        public VmaStatistics statistics() { return VmaBudget.nstatistics(address()); }
        /** @return the value of the {@link VmaBudget#usage} field. */
        @NativeType("VkDeviceSize")
        public long usage() { return VmaBudget.nusage(address()); }
        /** @return the value of the {@link VmaBudget#budget} field. */
        @NativeType("VkDeviceSize")
        public long budget() { return VmaBudget.nbudget(address()); }

    }

}