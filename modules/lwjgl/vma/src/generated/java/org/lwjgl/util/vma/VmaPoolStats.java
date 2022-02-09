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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaPoolStats {
 *     VkDeviceSize {@link #size};
 *     VkDeviceSize {@link #unusedSize};
 *     size_t {@link #allocationCount};
 *     size_t {@link #unusedRangeCount};
 *     size_t {@link #blockCount};
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
        BLOCKCOUNT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        UNUSEDSIZE = layout.offsetof(1);
        ALLOCATIONCOUNT = layout.offsetof(2);
        UNUSEDRANGECOUNT = layout.offsetof(3);
        BLOCKCOUNT = layout.offsetof(4);
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

    /** total amount of {@code VkDeviceMemory} allocated from Vulkan for this pool, in bytes */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** total number of bytes in the pool not used by any {@code VmaAllocation} */
    @NativeType("VkDeviceSize")
    public long unusedSize() { return nunusedSize(address()); }
    /** number of {@code VmaAllocation} objects created from this pool that were not destroyed */
    @NativeType("size_t")
    public long allocationCount() { return nallocationCount(address()); }
    /** number of continuous memory ranges in the pool not used by any {@code VmaAllocation} */
    @NativeType("size_t")
    public long unusedRangeCount() { return nunusedRangeCount(address()); }
    /** number of {@code VkDeviceMemory} blocks allocated for this pool */
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

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaPoolStats.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaPoolStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolStats malloc(MemoryStack stack) {
        return wrap(VmaPoolStats.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaPoolStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaPoolStats calloc(MemoryStack stack) {
        return wrap(VmaPoolStats.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaPoolStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaPoolStats.Buffer calloc(int capacity, MemoryStack stack) {
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

        /** @return the value of the {@link VmaPoolStats#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VmaPoolStats.nsize(address()); }
        /** @return the value of the {@link VmaPoolStats#unusedSize} field. */
        @NativeType("VkDeviceSize")
        public long unusedSize() { return VmaPoolStats.nunusedSize(address()); }
        /** @return the value of the {@link VmaPoolStats#allocationCount} field. */
        @NativeType("size_t")
        public long allocationCount() { return VmaPoolStats.nallocationCount(address()); }
        /** @return the value of the {@link VmaPoolStats#unusedRangeCount} field. */
        @NativeType("size_t")
        public long unusedRangeCount() { return VmaPoolStats.nunusedRangeCount(address()); }
        /** @return the value of the {@link VmaPoolStats#blockCount} field. */
        @NativeType("size_t")
        public long blockCount() { return VmaPoolStats.nblockCount(address()); }

    }

}