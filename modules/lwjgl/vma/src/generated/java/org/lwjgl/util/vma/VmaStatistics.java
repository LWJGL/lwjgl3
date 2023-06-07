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
 * Calculated statistics of memory usage e.g. in a specific memory type, heap, custom pool, or total.
 * 
 * <p>These are fast to calculate.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaStatistics {
 *     uint32_t {@link #blockCount};
 *     uint32_t {@link #allocationCount};
 *     VkDeviceSize {@link #blockBytes};
 *     VkDeviceSize {@link #allocationBytes};
 * }</code></pre>
 *
 * @see Vma#vmaGetHeapBudgets
 * @see Vma#vmaGetPoolStatistics
 */
public class VmaStatistics extends Struct<VmaStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKCOUNT,
        ALLOCATIONCOUNT,
        BLOCKBYTES,
        ALLOCATIONBYTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKCOUNT = layout.offsetof(0);
        ALLOCATIONCOUNT = layout.offsetof(1);
        BLOCKBYTES = layout.offsetof(2);
        ALLOCATIONBYTES = layout.offsetof(3);
    }

    protected VmaStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaStatistics create(long address, @Nullable ByteBuffer container) {
        return new VmaStatistics(address, container);
    }

    /**
     * Creates a {@code VmaStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** number of {@code VkDeviceMemory} objects - Vulkan memory blocks allocated */
    @NativeType("uint32_t")
    public int blockCount() { return nblockCount(address()); }
    /**
     * number of {@code VmaAllocation} objects allocated.
     * 
     * <p>Dedicated allocations have their own blocks, so each one adds 1 to {@code allocationCount} as well as {@code blockCount}.</p>
     */
    @NativeType("uint32_t")
    public int allocationCount() { return nallocationCount(address()); }
    /**
     * number of bytes allocated in {@code VkDeviceMemory} blocks.
     * 
     * <p>To avoid confusion, please be aware that what Vulkan calls an "allocation" - a whole {@code VkDeviceMemory} object (e.g. as in
     * {@code VkPhysicalDeviceLimits::maxMemoryAllocationCount}) is called a "block" in VMA, while VMA calls "allocation" a {@code VmaAllocation} object that
     * represents a memory region sub-allocated from such block, usually for a single buffer or image.</p>
     */
    @NativeType("VkDeviceSize")
    public long blockBytes() { return nblockBytes(address()); }
    /**
     * total number of bytes occupied by all {@code VmaAllocation} objects.
     * 
     * <p>Always less or equal than {@code blockBytes}. Difference {@code (blockBytes - allocationBytes)} is the amount of memory allocated from Vulkan but
     * unused by any {@code VmaAllocation}.</p>
     */
    @NativeType("VkDeviceSize")
    public long allocationBytes() { return nallocationBytes(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaStatistics malloc() {
        return new VmaStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaStatistics calloc() {
        return new VmaStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaStatistics} instance allocated with {@link BufferUtils}. */
    public static VmaStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaStatistics(memAddress(container), container);
    }

    /** Returns a new {@code VmaStatistics} instance for the specified memory address. */
    public static VmaStatistics create(long address) {
        return new VmaStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaStatistics createSafe(long address) {
        return address == NULL ? null : new VmaStatistics(address, null);
    }

    /**
     * Returns a new {@link VmaStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaStatistics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaStatistics malloc(MemoryStack stack) {
        return new VmaStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaStatistics calloc(MemoryStack stack) {
        return new VmaStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockCount}. */
    public static int nblockCount(long struct) { return UNSAFE.getInt(null, struct + VmaStatistics.BLOCKCOUNT); }
    /** Unsafe version of {@link #allocationCount}. */
    public static int nallocationCount(long struct) { return UNSAFE.getInt(null, struct + VmaStatistics.ALLOCATIONCOUNT); }
    /** Unsafe version of {@link #blockBytes}. */
    public static long nblockBytes(long struct) { return UNSAFE.getLong(null, struct + VmaStatistics.BLOCKBYTES); }
    /** Unsafe version of {@link #allocationBytes}. */
    public static long nallocationBytes(long struct) { return UNSAFE.getLong(null, struct + VmaStatistics.ALLOCATIONBYTES); }

    // -----------------------------------

    /** An array of {@link VmaStatistics} structs. */
    public static class Buffer extends StructBuffer<VmaStatistics, Buffer> implements NativeResource {

        private static final VmaStatistics ELEMENT_FACTORY = VmaStatistics.create(-1L);

        /**
         * Creates a new {@code VmaStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaStatistics#blockCount} field. */
        @NativeType("uint32_t")
        public int blockCount() { return VmaStatistics.nblockCount(address()); }
        /** @return the value of the {@link VmaStatistics#allocationCount} field. */
        @NativeType("uint32_t")
        public int allocationCount() { return VmaStatistics.nallocationCount(address()); }
        /** @return the value of the {@link VmaStatistics#blockBytes} field. */
        @NativeType("VkDeviceSize")
        public long blockBytes() { return VmaStatistics.nblockBytes(address()); }
        /** @return the value of the {@link VmaStatistics#allocationBytes} field. */
        @NativeType("VkDeviceSize")
        public long allocationBytes() { return VmaStatistics.nallocationBytes(address()); }

    }

}