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
 * Statistics of current memory usage and available budget, in bytes, for specific memory heap.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaBudget {
 *     VkDeviceSize {@link #blockBytes};
 *     VkDeviceSize {@link #allocationBytes};
 *     VkDeviceSize {@link #usage};
 *     VkDeviceSize {@link #budget};
 * }</code></pre>
 */
public class VmaBudget extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKBYTES,
        ALLOCATIONBYTES,
        USAGE,
        BUDGET;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKBYTES = layout.offsetof(0);
        ALLOCATIONBYTES = layout.offsetof(1);
        USAGE = layout.offsetof(2);
        BUDGET = layout.offsetof(3);
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

    /** Sum size of all {@code VkDeviceMemory} blocks allocated from particular heap, in bytes. */
    @NativeType("VkDeviceSize")
    public long blockBytes() { return nblockBytes(address()); }
    /**
     * Sum size of all allocations created in particular heap, in bytes.
     * 
     * <p>Usually less or equal than {@code blockBytes}. Difference {@code blockBytes - allocationBytes} is the amount of memory allocated but unused - available
     * for new allocations or wasted due to fragmentation.</p>
     */
    @NativeType("VkDeviceSize")
    public long allocationBytes() { return nallocationBytes(address()); }
    /**
     * Estimated current memory usage of the program, in bytes.
     * 
     * <p>Fetched from system using {@code VK_EXT_memory_budget} extension if enabled.</p>
     * 
     * <p>It might be different than {@code blockBytes} (usually higher) due to additional implicit objects also occupying the memory, like swapchain, pipelines,
     * descriptor heaps, command buffers, or {@code VkDeviceMemory} blocks allocated outside of this library, if any.</p>
     */
    @NativeType("VkDeviceSize")
    public long usage() { return nusage(address()); }
    /**
     * Estimated amount of memory available to the program, in bytes.
     * 
     * <p>Fetched from system using {@code VK_EXT_memory_budget} extension if enabled.</p>
     * 
     * <p>It might be different (most probably smaller) than {@code VkMemoryHeap::size[heapIndex]} due to factors external to the program, like other programs
     * also consuming system resources. Difference {@code budget - usage} is the amount of additional memory that can probably be allocated without problems.
     * Exceeding the budget may result in various problems.</p>
     */
    @NativeType("VkDeviceSize")
    public long budget() { return nbudget(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaBudget} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaBudget malloc() {
        return wrap(VmaBudget.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaBudget} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaBudget calloc() {
        return wrap(VmaBudget.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaBudget} instance allocated with {@link BufferUtils}. */
    public static VmaBudget create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaBudget.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaBudget} instance for the specified memory address. */
    public static VmaBudget create(long address) {
        return wrap(VmaBudget.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaBudget createSafe(long address) {
        return address == NULL ? null : wrap(VmaBudget.class, address);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaBudget.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaBudget.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VmaBudget} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaBudget malloc(MemoryStack stack) {
        return wrap(VmaBudget.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaBudget} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaBudget calloc(MemoryStack stack) {
        return wrap(VmaBudget.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaBudget.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaBudget.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockBytes}. */
    public static long nblockBytes(long struct) { return UNSAFE.getLong(null, struct + VmaBudget.BLOCKBYTES); }
    /** Unsafe version of {@link #allocationBytes}. */
    public static long nallocationBytes(long struct) { return UNSAFE.getLong(null, struct + VmaBudget.ALLOCATIONBYTES); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaBudget#SIZEOF}, and its mark will be undefined.
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

        /** @return the value of the {@link VmaBudget#blockBytes} field. */
        @NativeType("VkDeviceSize")
        public long blockBytes() { return VmaBudget.nblockBytes(address()); }
        /** @return the value of the {@link VmaBudget#allocationBytes} field. */
        @NativeType("VkDeviceSize")
        public long allocationBytes() { return VmaBudget.nallocationBytes(address()); }
        /** @return the value of the {@link VmaBudget#usage} field. */
        @NativeType("VkDeviceSize")
        public long usage() { return VmaBudget.nusage(address()); }
        /** @return the value of the {@link VmaBudget#budget} field. */
        @NativeType("VkDeviceSize")
        public long budget() { return VmaBudget.nbudget(address()); }

    }

}