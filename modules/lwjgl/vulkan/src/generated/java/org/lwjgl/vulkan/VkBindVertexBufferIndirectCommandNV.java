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
 * struct VkBindVertexBufferIndirectCommandNV {
 *     VkDeviceAddress bufferAddress;
 *     uint32_t size;
 *     uint32_t stride;
 * }}</pre>
 */
public class VkBindVertexBufferIndirectCommandNV extends Struct<VkBindVertexBufferIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFERADDRESS,
        SIZE,
        STRIDE;

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
        STRIDE = layout.offsetof(2);
    }

    protected VkBindVertexBufferIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindVertexBufferIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkBindVertexBufferIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkBindVertexBufferIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindVertexBufferIndirectCommandNV(ByteBuffer container) {
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
    /** @return the value of the {@code stride} field. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }

    /** Sets the specified value to the {@code bufferAddress} field. */
    public VkBindVertexBufferIndirectCommandNV bufferAddress(@NativeType("VkDeviceAddress") long value) { nbufferAddress(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkBindVertexBufferIndirectCommandNV size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkBindVertexBufferIndirectCommandNV stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindVertexBufferIndirectCommandNV set(
        long bufferAddress,
        int size,
        int stride
    ) {
        bufferAddress(bufferAddress);
        size(size);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindVertexBufferIndirectCommandNV set(VkBindVertexBufferIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindVertexBufferIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindVertexBufferIndirectCommandNV malloc() {
        return new VkBindVertexBufferIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindVertexBufferIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindVertexBufferIndirectCommandNV calloc() {
        return new VkBindVertexBufferIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindVertexBufferIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkBindVertexBufferIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVertexBufferIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkBindVertexBufferIndirectCommandNV} instance for the specified memory address. */
    public static VkBindVertexBufferIndirectCommandNV create(long address) {
        return new VkBindVertexBufferIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindVertexBufferIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkBindVertexBufferIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkBindVertexBufferIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBufferIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindVertexBufferIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBufferIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVertexBufferIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBufferIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindVertexBufferIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBufferIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindVertexBufferIndirectCommandNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindVertexBufferIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVertexBufferIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBindVertexBufferIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindVertexBufferIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVertexBufferIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBindVertexBufferIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindVertexBufferIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBufferIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVertexBufferIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBufferIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferAddress}. */
    public static long nbufferAddress(long struct) { return memGetLong(struct + VkBindVertexBufferIndirectCommandNV.BUFFERADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + VkBindVertexBufferIndirectCommandNV.SIZE); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + VkBindVertexBufferIndirectCommandNV.STRIDE); }

    /** Unsafe version of {@link #bufferAddress(long) bufferAddress}. */
    public static void nbufferAddress(long struct, long value) { memPutLong(struct + VkBindVertexBufferIndirectCommandNV.BUFFERADDRESS, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + VkBindVertexBufferIndirectCommandNV.SIZE, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + VkBindVertexBufferIndirectCommandNV.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkBindVertexBufferIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkBindVertexBufferIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkBindVertexBufferIndirectCommandNV ELEMENT_FACTORY = VkBindVertexBufferIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkBindVertexBufferIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindVertexBufferIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindVertexBufferIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bufferAddress} field. */
        @NativeType("VkDeviceAddress")
        public long bufferAddress() { return VkBindVertexBufferIndirectCommandNV.nbufferAddress(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return VkBindVertexBufferIndirectCommandNV.nsize(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkBindVertexBufferIndirectCommandNV.nstride(address()); }

        /** Sets the specified value to the {@code bufferAddress} field. */
        public VkBindVertexBufferIndirectCommandNV.Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) { VkBindVertexBufferIndirectCommandNV.nbufferAddress(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkBindVertexBufferIndirectCommandNV.Buffer size(@NativeType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkBindVertexBufferIndirectCommandNV.Buffer stride(@NativeType("uint32_t") int value) { VkBindVertexBufferIndirectCommandNV.nstride(address(), value); return this; }

    }

}