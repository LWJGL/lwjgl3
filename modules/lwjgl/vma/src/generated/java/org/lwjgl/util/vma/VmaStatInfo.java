/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Calculated statistics of memory usage in entire allocator.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code blockCount} &ndash; number of {@code VkDeviceMemory} Vulkan memory blocks allocated</li>
 * <li>{@code allocationCount} &ndash; number of {@code VmaAllocation} allocation objects allocated</li>
 * <li>{@code unusedRangeCount} &ndash; number of free ranges of memory between allocations</li>
 * <li>{@code usedBytes} &ndash; total number of bytes occupied by all allocations</li>
 * <li>{@code unusedBytes} &ndash; total number of bytes occupied by unused ranges</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaStatInfo {
 *     uint32_t blockCount;
 *     uint32_t allocationCount;
 *     uint32_t unusedRangeCount;
 *     VkDeviceSize usedBytes;
 *     VkDeviceSize unusedBytes;
 *     VkDeviceSize allocationSizeMin;
 *     VkDeviceSize allocationSizeAvg;
 *     VkDeviceSize allocationSizeMax;
 *     VkDeviceSize unusedRangeSizeMin;
 *     VkDeviceSize unusedRangeSizeAvg;
 *     VkDeviceSize unusedRangeSizeMax;
 * }</code></pre>
 */
public class VmaStatInfo extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKCOUNT,
        ALLOCATIONCOUNT,
        UNUSEDRANGECOUNT,
        USEDBYTES,
        UNUSEDBYTES,
        ALLOCATIONSIZEMIN,
        ALLOCATIONSIZEAVG,
        ALLOCATIONSIZEMAX,
        UNUSEDRANGESIZEMIN,
        UNUSEDRANGESIZEAVG,
        UNUSEDRANGESIZEMAX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKCOUNT = layout.offsetof(0);
        ALLOCATIONCOUNT = layout.offsetof(1);
        UNUSEDRANGECOUNT = layout.offsetof(2);
        USEDBYTES = layout.offsetof(3);
        UNUSEDBYTES = layout.offsetof(4);
        ALLOCATIONSIZEMIN = layout.offsetof(5);
        ALLOCATIONSIZEAVG = layout.offsetof(6);
        ALLOCATIONSIZEMAX = layout.offsetof(7);
        UNUSEDRANGESIZEMIN = layout.offsetof(8);
        UNUSEDRANGESIZEAVG = layout.offsetof(9);
        UNUSEDRANGESIZEMAX = layout.offsetof(10);
    }

    /**
     * Creates a {@code VmaStatInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaStatInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code blockCount} field. */
    @NativeType("uint32_t")
    public int blockCount() { return nblockCount(address()); }
    /** Returns the value of the {@code allocationCount} field. */
    @NativeType("uint32_t")
    public int allocationCount() { return nallocationCount(address()); }
    /** Returns the value of the {@code unusedRangeCount} field. */
    @NativeType("uint32_t")
    public int unusedRangeCount() { return nunusedRangeCount(address()); }
    /** Returns the value of the {@code usedBytes} field. */
    @NativeType("VkDeviceSize")
    public long usedBytes() { return nusedBytes(address()); }
    /** Returns the value of the {@code unusedBytes} field. */
    @NativeType("VkDeviceSize")
    public long unusedBytes() { return nunusedBytes(address()); }
    /** Returns the value of the {@code allocationSizeMin} field. */
    @NativeType("VkDeviceSize")
    public long allocationSizeMin() { return nallocationSizeMin(address()); }
    /** Returns the value of the {@code allocationSizeAvg} field. */
    @NativeType("VkDeviceSize")
    public long allocationSizeAvg() { return nallocationSizeAvg(address()); }
    /** Returns the value of the {@code allocationSizeMax} field. */
    @NativeType("VkDeviceSize")
    public long allocationSizeMax() { return nallocationSizeMax(address()); }
    /** Returns the value of the {@code unusedRangeSizeMin} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMin() { return nunusedRangeSizeMin(address()); }
    /** Returns the value of the {@code unusedRangeSizeAvg} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeAvg() { return nunusedRangeSizeAvg(address()); }
    /** Returns the value of the {@code unusedRangeSizeMax} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMax() { return nunusedRangeSizeMax(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaStatInfo} instance for the specified memory address. */
    public static VmaStatInfo create(long address) {
        return wrap(VmaStatInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaStatInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaStatInfo.class, address);
    }

    /**
     * Create a {@link VmaStatInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaStatInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaStatInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockCount}. */
    public static int nblockCount(long struct) { return UNSAFE.getInt(null, struct + VmaStatInfo.BLOCKCOUNT); }
    /** Unsafe version of {@link #allocationCount}. */
    public static int nallocationCount(long struct) { return UNSAFE.getInt(null, struct + VmaStatInfo.ALLOCATIONCOUNT); }
    /** Unsafe version of {@link #unusedRangeCount}. */
    public static int nunusedRangeCount(long struct) { return UNSAFE.getInt(null, struct + VmaStatInfo.UNUSEDRANGECOUNT); }
    /** Unsafe version of {@link #usedBytes}. */
    public static long nusedBytes(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.USEDBYTES); }
    /** Unsafe version of {@link #unusedBytes}. */
    public static long nunusedBytes(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.UNUSEDBYTES); }
    /** Unsafe version of {@link #allocationSizeMin}. */
    public static long nallocationSizeMin(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.ALLOCATIONSIZEMIN); }
    /** Unsafe version of {@link #allocationSizeAvg}. */
    public static long nallocationSizeAvg(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.ALLOCATIONSIZEAVG); }
    /** Unsafe version of {@link #allocationSizeMax}. */
    public static long nallocationSizeMax(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.ALLOCATIONSIZEMAX); }
    /** Unsafe version of {@link #unusedRangeSizeMin}. */
    public static long nunusedRangeSizeMin(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.UNUSEDRANGESIZEMIN); }
    /** Unsafe version of {@link #unusedRangeSizeAvg}. */
    public static long nunusedRangeSizeAvg(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.UNUSEDRANGESIZEAVG); }
    /** Unsafe version of {@link #unusedRangeSizeMax}. */
    public static long nunusedRangeSizeMax(long struct) { return UNSAFE.getLong(null, struct + VmaStatInfo.UNUSEDRANGESIZEMAX); }

    // -----------------------------------

    /** An array of {@link VmaStatInfo} structs. */
    public static class Buffer extends StructBuffer<VmaStatInfo, Buffer> {

        private static final VmaStatInfo ELEMENT_FACTORY = VmaStatInfo.create(-1L);

        /**
         * Creates a new {@code VmaStatInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaStatInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaStatInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code blockCount} field. */
        @NativeType("uint32_t")
        public int blockCount() { return VmaStatInfo.nblockCount(address()); }
        /** Returns the value of the {@code allocationCount} field. */
        @NativeType("uint32_t")
        public int allocationCount() { return VmaStatInfo.nallocationCount(address()); }
        /** Returns the value of the {@code unusedRangeCount} field. */
        @NativeType("uint32_t")
        public int unusedRangeCount() { return VmaStatInfo.nunusedRangeCount(address()); }
        /** Returns the value of the {@code usedBytes} field. */
        @NativeType("VkDeviceSize")
        public long usedBytes() { return VmaStatInfo.nusedBytes(address()); }
        /** Returns the value of the {@code unusedBytes} field. */
        @NativeType("VkDeviceSize")
        public long unusedBytes() { return VmaStatInfo.nunusedBytes(address()); }
        /** Returns the value of the {@code allocationSizeMin} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeMin() { return VmaStatInfo.nallocationSizeMin(address()); }
        /** Returns the value of the {@code allocationSizeAvg} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeAvg() { return VmaStatInfo.nallocationSizeAvg(address()); }
        /** Returns the value of the {@code allocationSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeMax() { return VmaStatInfo.nallocationSizeMax(address()); }
        /** Returns the value of the {@code unusedRangeSizeMin} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMin() { return VmaStatInfo.nunusedRangeSizeMin(address()); }
        /** Returns the value of the {@code unusedRangeSizeAvg} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeAvg() { return VmaStatInfo.nunusedRangeSizeAvg(address()); }
        /** Returns the value of the {@code unusedRangeSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMax() { return VmaStatInfo.nunusedRangeSizeMax(address()); }

    }

}