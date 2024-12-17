/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSparseMemoryBind {
 *     VkDeviceSize resourceOffset;
 *     VkDeviceSize size;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkSparseMemoryBindFlags flags;
 * }}</pre>
 */
public class VkSparseMemoryBind extends Struct<VkSparseMemoryBind> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESOURCEOFFSET,
        SIZE,
        MEMORY,
        MEMORYOFFSET,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESOURCEOFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        MEMORYOFFSET = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected VkSparseMemoryBind(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseMemoryBind create(long address, @Nullable ByteBuffer container) {
        return new VkSparseMemoryBind(address, container);
    }

    /**
     * Creates a {@code VkSparseMemoryBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseMemoryBind(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code resourceOffset} field. */
    @NativeType("VkDeviceSize")
    public long resourceOffset() { return nresourceOffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkSparseMemoryBindFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code resourceOffset} field. */
    public VkSparseMemoryBind resourceOffset(@NativeType("VkDeviceSize") long value) { nresourceOffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkSparseMemoryBind size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkSparseMemoryBind memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkSparseMemoryBind memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSparseMemoryBind flags(@NativeType("VkSparseMemoryBindFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseMemoryBind set(
        long resourceOffset,
        long size,
        long memory,
        long memoryOffset,
        int flags
    ) {
        resourceOffset(resourceOffset);
        size(size);
        memory(memory);
        memoryOffset(memoryOffset);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSparseMemoryBind set(VkSparseMemoryBind src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseMemoryBind malloc() {
        return new VkSparseMemoryBind(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseMemoryBind calloc() {
        return new VkSparseMemoryBind(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseMemoryBind} instance allocated with {@link BufferUtils}. */
    public static VkSparseMemoryBind create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseMemoryBind(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseMemoryBind} instance for the specified memory address. */
    public static VkSparseMemoryBind create(long address) {
        return new VkSparseMemoryBind(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseMemoryBind createSafe(long address) {
        return address == NULL ? null : new VkSparseMemoryBind(address, null);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseMemoryBind.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseMemoryBind.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseMemoryBind} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseMemoryBind malloc(MemoryStack stack) {
        return new VkSparseMemoryBind(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseMemoryBind} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseMemoryBind calloc(MemoryStack stack) {
        return new VkSparseMemoryBind(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resourceOffset}. */
    public static long nresourceOffset(long struct) { return memGetLong(struct + VkSparseMemoryBind.RESOURCEOFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkSparseMemoryBind.SIZE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkSparseMemoryBind.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkSparseMemoryBind.MEMORYOFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSparseMemoryBind.FLAGS); }

    /** Unsafe version of {@link #resourceOffset(long) resourceOffset}. */
    public static void nresourceOffset(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.RESOURCEOFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.SIZE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkSparseMemoryBind.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSparseMemoryBind.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkSparseMemoryBind} structs. */
    public static class Buffer extends StructBuffer<VkSparseMemoryBind, Buffer> implements NativeResource {

        private static final VkSparseMemoryBind ELEMENT_FACTORY = VkSparseMemoryBind.create(-1L);

        /**
         * Creates a new {@code VkSparseMemoryBind.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseMemoryBind#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkSparseMemoryBind getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code resourceOffset} field. */
        @NativeType("VkDeviceSize")
        public long resourceOffset() { return VkSparseMemoryBind.nresourceOffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSparseMemoryBind.nsize(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkSparseMemoryBind.nmemory(address()); }
        /** @return the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkSparseMemoryBind.nmemoryOffset(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSparseMemoryBindFlags")
        public int flags() { return VkSparseMemoryBind.nflags(address()); }

        /** Sets the specified value to the {@code resourceOffset} field. */
        public VkSparseMemoryBind.Buffer resourceOffset(@NativeType("VkDeviceSize") long value) { VkSparseMemoryBind.nresourceOffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkSparseMemoryBind.Buffer size(@NativeType("VkDeviceSize") long value) { VkSparseMemoryBind.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkSparseMemoryBind.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkSparseMemoryBind.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkSparseMemoryBind.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkSparseMemoryBind.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSparseMemoryBind.Buffer flags(@NativeType("VkSparseMemoryBindFlags") int value) { VkSparseMemoryBind.nflags(address(), value); return this; }

    }

}