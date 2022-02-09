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
 * Statistics returned by function {@link Vma#vmaDefragment Defragment}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationStats {
 *     VkDeviceSize {@link #bytesMoved};
 *     VkDeviceSize {@link #bytesFreed};
 *     uint32_t {@link #allocationsMoved};
 *     uint32_t {@link #deviceMemoryBlocksFreed};
 * }</code></pre>
 */
public class VmaDefragmentationStats extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BYTESMOVED,
        BYTESFREED,
        ALLOCATIONSMOVED,
        DEVICEMEMORYBLOCKSFREED;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BYTESMOVED = layout.offsetof(0);
        BYTESFREED = layout.offsetof(1);
        ALLOCATIONSMOVED = layout.offsetof(2);
        DEVICEMEMORYBLOCKSFREED = layout.offsetof(3);
    }

    /**
     * Creates a {@code VmaDefragmentationStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationStats(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** total number of bytes that have been copied while moving allocations to different places */
    @NativeType("VkDeviceSize")
    public long bytesMoved() { return nbytesMoved(address()); }
    /** total number of bytes that have been released to the system by freeing empty {@code VkDeviceMemory} objects */
    @NativeType("VkDeviceSize")
    public long bytesFreed() { return nbytesFreed(address()); }
    /** number of allocations that have been moved to different places */
    @NativeType("uint32_t")
    public int allocationsMoved() { return nallocationsMoved(address()); }
    /** number of empty {@code VkDeviceMemory} objects that have been released to the system */
    @NativeType("uint32_t")
    public int deviceMemoryBlocksFreed() { return ndeviceMemoryBlocksFreed(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationStats malloc() {
        return wrap(VmaDefragmentationStats.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationStats calloc() {
        return wrap(VmaDefragmentationStats.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationStats} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationStats create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaDefragmentationStats.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationStats} instance for the specified memory address. */
    public static VmaDefragmentationStats create(long address) {
        return wrap(VmaDefragmentationStats.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationStats createSafe(long address) {
        return address == NULL ? null : wrap(VmaDefragmentationStats.class, address);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaDefragmentationStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationStats.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaDefragmentationStats} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationStats malloc(MemoryStack stack) {
        return wrap(VmaDefragmentationStats.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaDefragmentationStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationStats calloc(MemoryStack stack) {
        return wrap(VmaDefragmentationStats.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationStats.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bytesMoved}. */
    public static long nbytesMoved(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationStats.BYTESMOVED); }
    /** Unsafe version of {@link #bytesFreed}. */
    public static long nbytesFreed(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationStats.BYTESFREED); }
    /** Unsafe version of {@link #allocationsMoved}. */
    public static int nallocationsMoved(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationStats.ALLOCATIONSMOVED); }
    /** Unsafe version of {@link #deviceMemoryBlocksFreed}. */
    public static int ndeviceMemoryBlocksFreed(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationStats.DEVICEMEMORYBLOCKSFREED); }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationStats} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationStats, Buffer> implements NativeResource {

        private static final VmaDefragmentationStats ELEMENT_FACTORY = VmaDefragmentationStats.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationStats#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaDefragmentationStats#bytesMoved} field. */
        @NativeType("VkDeviceSize")
        public long bytesMoved() { return VmaDefragmentationStats.nbytesMoved(address()); }
        /** @return the value of the {@link VmaDefragmentationStats#bytesFreed} field. */
        @NativeType("VkDeviceSize")
        public long bytesFreed() { return VmaDefragmentationStats.nbytesFreed(address()); }
        /** @return the value of the {@link VmaDefragmentationStats#allocationsMoved} field. */
        @NativeType("uint32_t")
        public int allocationsMoved() { return VmaDefragmentationStats.nallocationsMoved(address()); }
        /** @return the value of the {@link VmaDefragmentationStats#deviceMemoryBlocksFreed} field. */
        @NativeType("uint32_t")
        public int deviceMemoryBlocksFreed() { return VmaDefragmentationStats.ndeviceMemoryBlocksFreed(address()); }

    }

}