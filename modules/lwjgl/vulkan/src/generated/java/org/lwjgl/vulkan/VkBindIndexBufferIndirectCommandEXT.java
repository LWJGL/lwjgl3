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
 * struct VkBindIndexBufferIndirectCommandEXT {
 *     VkDeviceAddress bufferAddress;
 *     uint32_t size;
 *     VkIndexType indexType;
 * }}</pre>
 */
public class VkBindIndexBufferIndirectCommandEXT extends Struct<VkBindIndexBufferIndirectCommandEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFERADDRESS,
        SIZE,
        INDEXTYPE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFERADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        INDEXTYPE = layout.offsetof(2);
    }

    protected VkBindIndexBufferIndirectCommandEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindIndexBufferIndirectCommandEXT create(long address, @Nullable ByteBuffer container) {
        return new VkBindIndexBufferIndirectCommandEXT(address, container);
    }

    /**
     * Creates a {@code VkBindIndexBufferIndirectCommandEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindIndexBufferIndirectCommandEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bufferAddress} field. */
    @NativeType("VkDeviceAddress")
    public long bufferAddress() { return nbufferAddress(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }

    /** Sets the specified value to the {@code bufferAddress} field. */
    public VkBindIndexBufferIndirectCommandEXT bufferAddress(@NativeType("VkDeviceAddress") long value) { nbufferAddress(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkBindIndexBufferIndirectCommandEXT size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkBindIndexBufferIndirectCommandEXT indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindIndexBufferIndirectCommandEXT set(
        long bufferAddress,
        int size,
        int indexType
    ) {
        bufferAddress(bufferAddress);
        size(size);
        indexType(indexType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindIndexBufferIndirectCommandEXT set(VkBindIndexBufferIndirectCommandEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindIndexBufferIndirectCommandEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindIndexBufferIndirectCommandEXT malloc() {
        return new VkBindIndexBufferIndirectCommandEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindIndexBufferIndirectCommandEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindIndexBufferIndirectCommandEXT calloc() {
        return new VkBindIndexBufferIndirectCommandEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindIndexBufferIndirectCommandEXT} instance allocated with {@link BufferUtils}. */
    public static VkBindIndexBufferIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindIndexBufferIndirectCommandEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkBindIndexBufferIndirectCommandEXT} instance for the specified memory address. */
    public static VkBindIndexBufferIndirectCommandEXT create(long address) {
        return new VkBindIndexBufferIndirectCommandEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindIndexBufferIndirectCommandEXT createSafe(long address) {
        return address == NULL ? null : new VkBindIndexBufferIndirectCommandEXT(address, null);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindIndexBufferIndirectCommandEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindIndexBufferIndirectCommandEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindIndexBufferIndirectCommandEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindIndexBufferIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkBindIndexBufferIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindIndexBufferIndirectCommandEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindIndexBufferIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkBindIndexBufferIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferAddress}. */
    public static long nbufferAddress(long struct) { return memGetLong(struct + VkBindIndexBufferIndirectCommandEXT.BUFFERADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + VkBindIndexBufferIndirectCommandEXT.SIZE); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkBindIndexBufferIndirectCommandEXT.INDEXTYPE); }

    /** Unsafe version of {@link #bufferAddress(long) bufferAddress}. */
    public static void nbufferAddress(long struct, long value) { memPutLong(struct + VkBindIndexBufferIndirectCommandEXT.BUFFERADDRESS, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + VkBindIndexBufferIndirectCommandEXT.SIZE, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkBindIndexBufferIndirectCommandEXT.INDEXTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkBindIndexBufferIndirectCommandEXT} structs. */
    public static class Buffer extends StructBuffer<VkBindIndexBufferIndirectCommandEXT, Buffer> implements NativeResource {

        private static final VkBindIndexBufferIndirectCommandEXT ELEMENT_FACTORY = VkBindIndexBufferIndirectCommandEXT.create(-1L);

        /**
         * Creates a new {@code VkBindIndexBufferIndirectCommandEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindIndexBufferIndirectCommandEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindIndexBufferIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bufferAddress} field. */
        @NativeType("VkDeviceAddress")
        public long bufferAddress() { return VkBindIndexBufferIndirectCommandEXT.nbufferAddress(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return VkBindIndexBufferIndirectCommandEXT.nsize(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkBindIndexBufferIndirectCommandEXT.nindexType(address()); }

        /** Sets the specified value to the {@code bufferAddress} field. */
        public VkBindIndexBufferIndirectCommandEXT.Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandEXT.nbufferAddress(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkBindIndexBufferIndirectCommandEXT.Buffer size(@NativeType("uint32_t") int value) { VkBindIndexBufferIndirectCommandEXT.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkBindIndexBufferIndirectCommandEXT.Buffer indexType(@NativeType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandEXT.nindexType(address(), value); return this; }

    }

}