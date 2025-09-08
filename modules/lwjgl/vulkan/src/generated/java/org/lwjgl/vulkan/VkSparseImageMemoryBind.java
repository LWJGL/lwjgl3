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
 * <pre><code>
 * struct VkSparseImageMemoryBind {
 *     {@link VkImageSubresource VkImageSubresource} subresource;
 *     {@link VkOffset3D VkOffset3D} offset;
 *     {@link VkExtent3D VkExtent3D} extent;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkSparseMemoryBindFlags flags;
 * }</code></pre>
 */
public class VkSparseImageMemoryBind extends Struct<VkSparseImageMemoryBind> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUBRESOURCE,
        OFFSET,
        EXTENT,
        MEMORY,
        MEMORYOFFSET,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(VkImageSubresource.SIZEOF, VkImageSubresource.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBRESOURCE = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        EXTENT = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected VkSparseImageMemoryBind(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseImageMemoryBind create(long address, @Nullable ByteBuffer container) {
        return new VkSparseImageMemoryBind(address, container);
    }

    /**
     * Creates a {@code VkSparseImageMemoryBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageMemoryBind(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkImageSubresource} view of the {@code subresource} field. */
    public VkImageSubresource subresource() { return nsubresource(address()); }
    /** @return a {@link VkOffset3D} view of the {@code offset} field. */
    public VkOffset3D offset() { return noffset(address()); }
    /** @return a {@link VkExtent3D} view of the {@code extent} field. */
    public VkExtent3D extent() { return nextent(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkSparseMemoryBindFlags")
    public int flags() { return nflags(address()); }

    /** Copies the specified {@link VkImageSubresource} to the {@code subresource} field. */
    public VkSparseImageMemoryBind subresource(VkImageSubresource value) { nsubresource(address(), value); return this; }
    /** Passes the {@code subresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSparseImageMemoryBind subresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(subresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code offset} field. */
    public VkSparseImageMemoryBind offset(VkOffset3D value) { noffset(address(), value); return this; }
    /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSparseImageMemoryBind offset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(offset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
    public VkSparseImageMemoryBind extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSparseImageMemoryBind extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkSparseImageMemoryBind memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkSparseImageMemoryBind memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSparseImageMemoryBind flags(@NativeType("VkSparseMemoryBindFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseImageMemoryBind set(
        VkImageSubresource subresource,
        VkOffset3D offset,
        VkExtent3D extent,
        long memory,
        long memoryOffset,
        int flags
    ) {
        subresource(subresource);
        offset(offset);
        extent(extent);
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
    public VkSparseImageMemoryBind set(VkSparseImageMemoryBind src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageMemoryBind} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryBind malloc() {
        return new VkSparseImageMemoryBind(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageMemoryBind} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryBind calloc() {
        return new VkSparseImageMemoryBind(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageMemoryBind} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageMemoryBind create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageMemoryBind(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageMemoryBind} instance for the specified memory address. */
    public static VkSparseImageMemoryBind create(long address) {
        return new VkSparseImageMemoryBind(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseImageMemoryBind createSafe(long address) {
        return address == NULL ? null : new VkSparseImageMemoryBind(address, null);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryBind.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryBind.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryBind.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseImageMemoryBind.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryBind.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseImageMemoryBind.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryBind.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageMemoryBind} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryBind malloc(MemoryStack stack) {
        return new VkSparseImageMemoryBind(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseImageMemoryBind} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryBind calloc(MemoryStack stack) {
        return new VkSparseImageMemoryBind(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryBind.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryBind.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subresource}. */
    public static VkImageSubresource nsubresource(long struct) { return VkImageSubresource.create(struct + VkSparseImageMemoryBind.SUBRESOURCE); }
    /** Unsafe version of {@link #offset}. */
    public static VkOffset3D noffset(long struct) { return VkOffset3D.create(struct + VkSparseImageMemoryBind.OFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkSparseImageMemoryBind.EXTENT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkSparseImageMemoryBind.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkSparseImageMemoryBind.MEMORYOFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSparseImageMemoryBind.FLAGS); }

    /** Unsafe version of {@link #subresource(VkImageSubresource) subresource}. */
    public static void nsubresource(long struct, VkImageSubresource value) { memCopy(value.address(), struct + VkSparseImageMemoryBind.SUBRESOURCE, VkImageSubresource.SIZEOF); }
    /** Unsafe version of {@link #offset(VkOffset3D) offset}. */
    public static void noffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkSparseImageMemoryBind.OFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkSparseImageMemoryBind.EXTENT, VkExtent3D.SIZEOF); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkSparseImageMemoryBind.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkSparseImageMemoryBind.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSparseImageMemoryBind.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkSparseImageMemoryBind} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryBind, Buffer> implements NativeResource {

        private static final VkSparseImageMemoryBind ELEMENT_FACTORY = VkSparseImageMemoryBind.create(-1L);

        /**
         * Creates a new {@code VkSparseImageMemoryBind.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageMemoryBind#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSparseImageMemoryBind getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkImageSubresource} view of the {@code subresource} field. */
        public VkImageSubresource subresource() { return VkSparseImageMemoryBind.nsubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code offset} field. */
        public VkOffset3D offset() { return VkSparseImageMemoryBind.noffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@code extent} field. */
        public VkExtent3D extent() { return VkSparseImageMemoryBind.nextent(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkSparseImageMemoryBind.nmemory(address()); }
        /** @return the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkSparseImageMemoryBind.nmemoryOffset(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSparseMemoryBindFlags")
        public int flags() { return VkSparseImageMemoryBind.nflags(address()); }

        /** Copies the specified {@link VkImageSubresource} to the {@code subresource} field. */
        public VkSparseImageMemoryBind.Buffer subresource(VkImageSubresource value) { VkSparseImageMemoryBind.nsubresource(address(), value); return this; }
        /** Passes the {@code subresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSparseImageMemoryBind.Buffer subresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(subresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code offset} field. */
        public VkSparseImageMemoryBind.Buffer offset(VkOffset3D value) { VkSparseImageMemoryBind.noffset(address(), value); return this; }
        /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSparseImageMemoryBind.Buffer offset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(offset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
        public VkSparseImageMemoryBind.Buffer extent(VkExtent3D value) { VkSparseImageMemoryBind.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSparseImageMemoryBind.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkSparseImageMemoryBind.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkSparseImageMemoryBind.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkSparseImageMemoryBind.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkSparseImageMemoryBind.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSparseImageMemoryBind.Buffer flags(@NativeType("VkSparseMemoryBindFlags") int value) { VkSparseImageMemoryBind.nflags(address(), value); return this; }

    }

}