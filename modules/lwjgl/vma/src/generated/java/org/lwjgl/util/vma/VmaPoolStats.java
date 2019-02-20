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
 * Describes parameter of existing {@code VmaPool}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code size} &ndash; total amount of {@code VkDeviceMemory} allocated from Vulkan for this pool, in bytes</li>
 * <li>{@code unusedSize} &ndash; total number of bytes in the pool not used by any {@code VmaAllocation}</li>
 * <li>{@code allocationCount} &ndash; number of {@code VmaAllocation} objects created from this pool that were not destroyed or lost</li>
 * <li>{@code unusedRangeCount} &ndash; number of continuous memory ranges in the pool not used by any {@code VmaAllocation}</li>
 * <li>{@code unusedRangeSizeMax} &ndash; 
 * size of the largest continuous free memory region available for new allocation.
 * 
 * <p>Making a new allocation of that size is not guaranteed to succeed because of possible additional margin required to respect alignment and buffer/imag
 * granularity.</p></li>
 * <li>{@code blockCount} &ndash; number of {@code VkDeviceMemory} blocks allocated for this pool</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaPoolStats {
 *     VkDeviceSize size;
 *     VkDeviceSize unusedSize;
 *     size_t allocationCount;
 *     size_t unusedRangeCount;
 *     VkDeviceSize unusedRangeSizeMax;
 *     size_t blockCount;
 * }</code></pre>
 */
public class VmaPoolStats extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        UNUSEDSIZE,
        ALLOCATIONCOUNT,
        UNUSEDRANGECOUNT,
        UNUSEDRANGESIZEMAX,
        BLOCKCOUNT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        UNUSEDSIZE = layout.offsetof(1);
        ALLOCATIONCOUNT = layout.offsetof(2);
        UNUSEDRANGECOUNT = layout.offsetof(3);
        UNUSEDRANGESIZEMAX = layout.offsetof(4);
        BLOCKCOUNT = layout.offsetof(5);
    }

    /**
     * Creates a {@code VmaPoolStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaPoolStats(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code unusedSize} field. */
    @NativeType("VkDeviceSize")
    public long unusedSize() { return nunusedSize(address()); }
    /** Returns the value of the {@code allocationCount} field. */
    @NativeType("size_t")
    public long allocationCount() { return nallocationCount(address()); }
    /** Returns the value of the {@code unusedRangeCount} field. */
    @NativeType("size_t")
    public long unusedRangeCount() { return nunusedRangeCount(address()); }
    /** Returns the value of the {@code unusedRangeSizeMax} field. */
    @NativeType("VkDeviceSize")
    public long unusedRangeSizeMax() { return nunusedRangeSizeMax(address()); }
    /** Returns the value of the {@code blockCount} field. */
    @NativeType("size_t")
    public long blockCount() { return nblockCount(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaPoolStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaPoolStats malloc() {
        return wrap(VmaPoolStats.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaPoolStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaPoolStats calloc() {
        return wrap(VmaPoolStats.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaPoolStats} instance allocated with {@link BufferUtils}. */
    public static VmaPoolStats create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaPoolStats.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaPoolStats} instance for the specified memory address. */
    public static VmaPoolStats create(long address) {
        return wrap(VmaPoolStats.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaPoolStats createSafe(long address) {
        return address == NULL ? null : wrap(VmaPoolStats.class, address);
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaPoolStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaPoolStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VmaPoolStats} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaPoolStats mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VmaPoolStats} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaPoolStats callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VmaPoolStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolStats mallocStack(MemoryStack stack) {
        return wrap(VmaPoolStats.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaPoolStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolStats callocStack(MemoryStack stack) {
        return wrap(VmaPoolStats.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VmaPoolStats.SIZE); }
    /** Unsafe version of {@link #unusedSize}. */
    public static long nunusedSize(long struct) { return UNSAFE.getLong(null, struct + VmaPoolStats.UNUSEDSIZE); }
    /** Unsafe version of {@link #allocationCount}. */
    public static long nallocationCount(long struct) { return memGetAddress(struct + VmaPoolStats.ALLOCATIONCOUNT); }
    /** Unsafe version of {@link #unusedRangeCount}. */
    public static long nunusedRangeCount(long struct) { return memGetAddress(struct + VmaPoolStats.UNUSEDRANGECOUNT); }
    /** Unsafe version of {@link #unusedRangeSizeMax}. */
    public static long nunusedRangeSizeMax(long struct) { return UNSAFE.getLong(null, struct + VmaPoolStats.UNUSEDRANGESIZEMAX); }
    /** Unsafe version of {@link #blockCount}. */
    public static long nblockCount(long struct) { return memGetAddress(struct + VmaPoolStats.BLOCKCOUNT); }

    // -----------------------------------

    /** An array of {@link VmaPoolStats} structs. */
    public static class Buffer extends StructBuffer<VmaPoolStats, Buffer> implements NativeResource {

        private static final VmaPoolStats ELEMENT_FACTORY = VmaPoolStats.create(-1L);

        /**
         * Creates a new {@code VmaPoolStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaPoolStats#SIZEOF}, and its mark will be undefined.
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
        protected VmaPoolStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VmaPoolStats.nsize(address()); }
        /** Returns the value of the {@code unusedSize} field. */
        @NativeType("VkDeviceSize")
        public long unusedSize() { return VmaPoolStats.nunusedSize(address()); }
        /** Returns the value of the {@code allocationCount} field. */
        @NativeType("size_t")
        public long allocationCount() { return VmaPoolStats.nallocationCount(address()); }
        /** Returns the value of the {@code unusedRangeCount} field. */
        @NativeType("size_t")
        public long unusedRangeCount() { return VmaPoolStats.nunusedRangeCount(address()); }
        /** Returns the value of the {@code unusedRangeSizeMax} field. */
        @NativeType("VkDeviceSize")
        public long unusedRangeSizeMax() { return VmaPoolStats.nunusedRangeSizeMax(address()); }
        /** Returns the value of the {@code blockCount} field. */
        @NativeType("size_t")
        public long blockCount() { return VmaPoolStats.nblockCount(address()); }

    }

}