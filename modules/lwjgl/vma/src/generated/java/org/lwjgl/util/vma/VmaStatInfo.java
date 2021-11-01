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
 * Calculated statistics of memory usage in entire allocator.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaStatInfo {
 *     uint32_t {@link #blockCount};
 *     uint32_t {@link #allocationCount};
 *     uint32_t {@link #unusedRangeCount};
 *     VkDeviceSize {@link #usedBytes};
 *     VkDeviceSize {@link #unusedBytes};
 *     VkDeviceSize allocationSizeMin;
 *     VkDeviceSize allocationSizeAvg;
 *     VkDeviceSize allocationSizeMax;
 *     VkDeviceSize unusedRangeSizeMin;
 *     VkDeviceSize unusedRangeSizeAvg;
 *     VkDeviceSize unusedRangeSizeMax;
 * }</code></pre>
 */
public class VmaStatInfo extends Struct implements NativeResource {

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

    /** number of {@code VkDeviceMemory} Vulkan memory blocks allocated */
    @NativeType("uint32_t")
    public int blockCount() { return nblockCount(address()); }
    /** number of {@code VmaAllocation} allocation objects allocated */
    @NativeType("uint32_t")
    public int allocationCount() { return nallocationCount(address()); }
    /** number of free ranges of memory between allocations */
    @NativeType("uint32_t")
    public int unusedRangeCount() { return nunusedRangeCount(address()); }
    /** total number of bytes occupied by all allocations */
    @NativeType("VkDeviceSize")
    public long usedBytes() { return nusedBytes(address()); }
    /** total number of bytes occupied by unused ranges */
    @NativeType("VkDeviceSize")
    public long unusedBytes() { return nunusedBytes(address()); }
    /** @return the value of the {@code allocationSizeMin} field. */
    @NativeType("VkDeviceSize")
    public long allocationSizeMin() { return nallocationSizeMin(address()); }
    /** @return the value of the {@code allocationSizeAvg} field. */
    @NativeType("VkDeviceSize")
    public long allocationSizeAvg() { return nallocationSizeAvg(address()); }
    /** @return the value of the {@code allocationSizeMax} field. */
    @NativeType("VkDeviceSize")
    public long allocationSizeMax() { return nallocationSizeMax(address()); }
    /** @return the value of the {@code unusedRangeSizeMin} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMin() { return nunusedRangeSizeMin(address()); }
    /** @return the value of the {@code unusedRangeSizeAvg} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeAvg() { return nunusedRangeSizeAvg(address()); }
    /** @return the value of the {@code unusedRangeSizeMax} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMax() { return nunusedRangeSizeMax(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaStatInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaStatInfo malloc() {
        return wrap(VmaStatInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaStatInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaStatInfo calloc() {
        return wrap(VmaStatInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaStatInfo} instance allocated with {@link BufferUtils}. */
    public static VmaStatInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaStatInfo.class, memAddress(container), container);
    }

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
     * Returns a new {@link VmaStatInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStatInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaStatInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStatInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStatInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaStatInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
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

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaStatInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaStatInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaStatInfo malloc(MemoryStack stack) {
        return wrap(VmaStatInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaStatInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaStatInfo calloc(MemoryStack stack) {
        return wrap(VmaStatInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaStatInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaStatInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaStatInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaStatInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static class Buffer extends StructBuffer<VmaStatInfo, Buffer> implements NativeResource {

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

        /** @return the value of the {@link VmaStatInfo#blockCount} field. */
        @NativeType("uint32_t")
        public int blockCount() { return VmaStatInfo.nblockCount(address()); }
        /** @return the value of the {@link VmaStatInfo#allocationCount} field. */
        @NativeType("uint32_t")
        public int allocationCount() { return VmaStatInfo.nallocationCount(address()); }
        /** @return the value of the {@link VmaStatInfo#unusedRangeCount} field. */
        @NativeType("uint32_t")
        public int unusedRangeCount() { return VmaStatInfo.nunusedRangeCount(address()); }
        /** @return the value of the {@link VmaStatInfo#usedBytes} field. */
        @NativeType("VkDeviceSize")
        public long usedBytes() { return VmaStatInfo.nusedBytes(address()); }
        /** @return the value of the {@link VmaStatInfo#unusedBytes} field. */
        @NativeType("VkDeviceSize")
        public long unusedBytes() { return VmaStatInfo.nunusedBytes(address()); }
        /** @return the value of the {@code allocationSizeMin} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeMin() { return VmaStatInfo.nallocationSizeMin(address()); }
        /** @return the value of the {@code allocationSizeAvg} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeAvg() { return VmaStatInfo.nallocationSizeAvg(address()); }
        /** @return the value of the {@code allocationSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long allocationSizeMax() { return VmaStatInfo.nallocationSizeMax(address()); }
        /** @return the value of the {@code unusedRangeSizeMin} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMin() { return VmaStatInfo.nunusedRangeSizeMin(address()); }
        /** @return the value of the {@code unusedRangeSizeAvg} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeAvg() { return VmaStatInfo.nunusedRangeSizeAvg(address()); }
        /** @return the value of the {@code unusedRangeSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMax() { return VmaStatInfo.nunusedRangeSizeMax(address()); }

    }

}