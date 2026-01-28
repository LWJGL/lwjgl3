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
 * struct VkDeviceAddressRangeEXT {
 *     VkDeviceAddress address;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkDeviceAddressRangeEXT extends Struct<VkDeviceAddressRangeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDRESS,
        SIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    protected VkDeviceAddressRangeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceAddressRangeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceAddressRangeEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceAddressRangeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceAddressRangeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code address} field. */
    @NativeType("VkDeviceAddress")
    public long address$() { return naddress$(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code address} field. */
    public VkDeviceAddressRangeEXT address$(@NativeType("VkDeviceAddress") long value) { naddress$(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkDeviceAddressRangeEXT size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceAddressRangeEXT set(
        long address$,
        long size
    ) {
        address$(address$);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceAddressRangeEXT set(VkDeviceAddressRangeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceAddressRangeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceAddressRangeEXT malloc() {
        return new VkDeviceAddressRangeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceAddressRangeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceAddressRangeEXT calloc() {
        return new VkDeviceAddressRangeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceAddressRangeEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceAddressRangeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceAddressRangeEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceAddressRangeEXT} instance for the specified memory address. */
    public static VkDeviceAddressRangeEXT create(long address) {
        return new VkDeviceAddressRangeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceAddressRangeEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceAddressRangeEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceAddressRangeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressRangeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceAddressRangeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressRangeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceAddressRangeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressRangeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceAddressRangeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressRangeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceAddressRangeEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceAddressRangeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceAddressRangeEXT malloc(MemoryStack stack) {
        return new VkDeviceAddressRangeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceAddressRangeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceAddressRangeEXT calloc(MemoryStack stack) {
        return new VkDeviceAddressRangeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceAddressRangeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressRangeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceAddressRangeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressRangeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #address$}. */
    public static long naddress$(long struct) { return memGetLong(struct + VkDeviceAddressRangeEXT.ADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkDeviceAddressRangeEXT.SIZE); }

    /** Unsafe version of {@link #address$(long) address$}. */
    public static void naddress$(long struct, long value) { memPutLong(struct + VkDeviceAddressRangeEXT.ADDRESS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkDeviceAddressRangeEXT.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceAddressRangeEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceAddressRangeEXT, Buffer> implements NativeResource {

        private static final VkDeviceAddressRangeEXT ELEMENT_FACTORY = VkDeviceAddressRangeEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceAddressRangeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceAddressRangeEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceAddressRangeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code address} field. */
        @NativeType("VkDeviceAddress")
        public long address$() { return VkDeviceAddressRangeEXT.naddress$(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkDeviceAddressRangeEXT.nsize(address()); }

        /** Sets the specified value to the {@code address} field. */
        public VkDeviceAddressRangeEXT.Buffer address$(@NativeType("VkDeviceAddress") long value) { VkDeviceAddressRangeEXT.naddress$(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkDeviceAddressRangeEXT.Buffer size(@NativeType("VkDeviceSize") long value) { VkDeviceAddressRangeEXT.nsize(address(), value); return this; }

    }

}