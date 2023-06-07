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
 * More detailed statistics than {@link VmaStatistics}.
 * 
 * <p>These are slower to calculate. Use for debugging purposes.</p>
 * 
 * <p>Previous version of the statistics API provided averages, but they have been removed because they can be easily calculated as:</p>
 * 
 * <pre><code>
 * VkDeviceSize allocationSizeAvg = detailedStats.statistics.allocationBytes / detailedStats.statistics.allocationCount;
 * VkDeviceSize unusedBytes = detailedStats.statistics.blockBytes - detailedStats.statistics.allocationBytes;
 * VkDeviceSize unusedRangeSizeAvg = unusedBytes / detailedStats.unusedRangeCount;</code></pre>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDetailedStatistics {
 *     {@link VmaStatistics VmaStatistics} {@link #statistics};
 *     uint32_t {@link #unusedRangeCount};
 *     VkDeviceSize {@link #allocationSizeMin};
 *     VkDeviceSize {@link #allocationSizeMax};
 *     VkDeviceSize {@link #unusedRangeSizeMin};
 *     VkDeviceSize {@link #unusedRangeSizeMax};
 * }</code></pre>
 *
 * @see Vma#vmaCalculateStatistics
 * @see Vma#vmaCalculatePoolStatistics
 */
public class VmaDetailedStatistics extends Struct<VmaDetailedStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STATISTICS,
        UNUSEDRANGECOUNT,
        ALLOCATIONSIZEMIN,
        ALLOCATIONSIZEMAX,
        UNUSEDRANGESIZEMIN,
        UNUSEDRANGESIZEMAX;

    static {
        Layout layout = __struct(
            __member(VmaStatistics.SIZEOF, VmaStatistics.ALIGNOF),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STATISTICS = layout.offsetof(0);
        UNUSEDRANGECOUNT = layout.offsetof(1);
        ALLOCATIONSIZEMIN = layout.offsetof(2);
        ALLOCATIONSIZEMAX = layout.offsetof(3);
        UNUSEDRANGESIZEMIN = layout.offsetof(4);
        UNUSEDRANGESIZEMAX = layout.offsetof(5);
    }

    protected VmaDetailedStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaDetailedStatistics create(long address, @Nullable ByteBuffer container) {
        return new VmaDetailedStatistics(address, container);
    }

    /**
     * Creates a {@code VmaDetailedStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDetailedStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** basic statistics */
    public VmaStatistics statistics() { return nstatistics(address()); }
    /** number of free ranges of memory between allocations */
    @NativeType("uint32_t")
    public int unusedRangeCount() { return nunusedRangeCount(address()); }
    /** smallest allocation size. {@code VK_WHOLE_SIZE} if there are 0 allocations. */
    @NativeType("VkDeviceSize")
    public long allocationSizeMin() { return nallocationSizeMin(address()); }
    /** largest allocation size. 0 if there are 0 allocations. */
    @NativeType("VkDeviceSize")
    public long allocationSizeMax() { return nallocationSizeMax(address()); }
    /** smallest empty range size. {@code VK_WHOLE_SIZE} if there are 0 empty ranges. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMin() { return nunusedRangeSizeMin(address()); }
    /** largest empty range size. 0 if there are 0 empty ranges. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMax() { return nunusedRangeSizeMax(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaDetailedStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDetailedStatistics malloc() {
        return new VmaDetailedStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaDetailedStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDetailedStatistics calloc() {
        return new VmaDetailedStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaDetailedStatistics} instance allocated with {@link BufferUtils}. */
    public static VmaDetailedStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaDetailedStatistics(memAddress(container), container);
    }

    /** Returns a new {@code VmaDetailedStatistics} instance for the specified memory address. */
    public static VmaDetailedStatistics create(long address) {
        return new VmaDetailedStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDetailedStatistics createSafe(long address) {
        return address == NULL ? null : new VmaDetailedStatistics(address, null);
    }

    /**
     * Returns a new {@link VmaDetailedStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDetailedStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDetailedStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDetailedStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDetailedStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDetailedStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaDetailedStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDetailedStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDetailedStatistics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaDetailedStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDetailedStatistics malloc(MemoryStack stack) {
        return new VmaDetailedStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaDetailedStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDetailedStatistics calloc(MemoryStack stack) {
        return new VmaDetailedStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaDetailedStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDetailedStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDetailedStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDetailedStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #statistics}. */
    public static VmaStatistics nstatistics(long struct) { return VmaStatistics.create(struct + VmaDetailedStatistics.STATISTICS); }
    /** Unsafe version of {@link #unusedRangeCount}. */
    public static int nunusedRangeCount(long struct) { return UNSAFE.getInt(null, struct + VmaDetailedStatistics.UNUSEDRANGECOUNT); }
    /** Unsafe version of {@link #allocationSizeMin}. */
    public static long nallocationSizeMin(long struct) { return UNSAFE.getLong(null, struct + VmaDetailedStatistics.ALLOCATIONSIZEMIN); }
    /** Unsafe version of {@link #allocationSizeMax}. */
    public static long nallocationSizeMax(long struct) { return UNSAFE.getLong(null, struct + VmaDetailedStatistics.ALLOCATIONSIZEMAX); }
    /** Unsafe version of {@link #unusedRangeSizeMin}. */
    public static long nunusedRangeSizeMin(long struct) { return UNSAFE.getLong(null, struct + VmaDetailedStatistics.UNUSEDRANGESIZEMIN); }
    /** Unsafe version of {@link #unusedRangeSizeMax}. */
    public static long nunusedRangeSizeMax(long struct) { return UNSAFE.getLong(null, struct + VmaDetailedStatistics.UNUSEDRANGESIZEMAX); }

    // -----------------------------------

    /** An array of {@link VmaDetailedStatistics} structs. */
    public static class Buffer extends StructBuffer<VmaDetailedStatistics, Buffer> implements NativeResource {

        private static final VmaDetailedStatistics ELEMENT_FACTORY = VmaDetailedStatistics.create(-1L);

        /**
         * Creates a new {@code VmaDetailedStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDetailedStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaDetailedStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VmaStatistics} view of the {@link VmaDetailedStatistics#statistics} field. */
        public VmaStatistics statistics() { return VmaDetailedStatistics.nstatistics(address()); }
        /** @return the value of the {@link VmaDetailedStatistics#unusedRangeCount} field. */
        @NativeType("uint32_t")
        public int unusedRangeCount() { return VmaDetailedStatistics.nunusedRangeCount(address()); }
        /** @return the value of the {@link VmaDetailedStatistics#allocationSizeMin} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeMin() { return VmaDetailedStatistics.nallocationSizeMin(address()); }
        /** @return the value of the {@link VmaDetailedStatistics#allocationSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeMax() { return VmaDetailedStatistics.nallocationSizeMax(address()); }
        /** @return the value of the {@link VmaDetailedStatistics#unusedRangeSizeMin} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMin() { return VmaDetailedStatistics.nunusedRangeSizeMin(address()); }
        /** @return the value of the {@link VmaDetailedStatistics#unusedRangeSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMax() { return VmaDetailedStatistics.nunusedRangeSizeMax(address()); }

    }

}