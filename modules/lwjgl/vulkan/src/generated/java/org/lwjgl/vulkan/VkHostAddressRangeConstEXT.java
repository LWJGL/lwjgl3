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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkHostAddressRangeConstEXT {
 *     void const * address;
 *     size_t size;
 * }}</pre>
 */
public class VkHostAddressRangeConstEXT extends Struct<VkHostAddressRangeConstEXT> implements NativeResource {

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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    protected VkHostAddressRangeConstEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostAddressRangeConstEXT create(long address, @Nullable ByteBuffer container) {
        return new VkHostAddressRangeConstEXT(address, container);
    }

    /**
     * Creates a {@code VkHostAddressRangeConstEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostAddressRangeConstEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code address} field. */
    @NativeType("void const *")
    public ByteBuffer address$() { return naddress$(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code address} field. */
    public VkHostAddressRangeConstEXT address$(@NativeType("void const *") ByteBuffer value) { naddress$(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHostAddressRangeConstEXT set(VkHostAddressRangeConstEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostAddressRangeConstEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostAddressRangeConstEXT malloc() {
        return new VkHostAddressRangeConstEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostAddressRangeConstEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostAddressRangeConstEXT calloc() {
        return new VkHostAddressRangeConstEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostAddressRangeConstEXT} instance allocated with {@link BufferUtils}. */
    public static VkHostAddressRangeConstEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostAddressRangeConstEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkHostAddressRangeConstEXT} instance for the specified memory address. */
    public static VkHostAddressRangeConstEXT create(long address) {
        return new VkHostAddressRangeConstEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHostAddressRangeConstEXT createSafe(long address) {
        return address == NULL ? null : new VkHostAddressRangeConstEXT(address, null);
    }

    /**
     * Returns a new {@link VkHostAddressRangeConstEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostAddressRangeConstEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostAddressRangeConstEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostAddressRangeConstEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostAddressRangeConstEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostAddressRangeConstEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostAddressRangeConstEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostAddressRangeConstEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHostAddressRangeConstEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostAddressRangeConstEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostAddressRangeConstEXT malloc(MemoryStack stack) {
        return new VkHostAddressRangeConstEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostAddressRangeConstEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostAddressRangeConstEXT calloc(MemoryStack stack) {
        return new VkHostAddressRangeConstEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostAddressRangeConstEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostAddressRangeConstEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostAddressRangeConstEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostAddressRangeConstEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #address$() address$}. */
    public static ByteBuffer naddress$(long struct) { return memByteBuffer(memGetAddress(struct + VkHostAddressRangeConstEXT.ADDRESS), (int)nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + VkHostAddressRangeConstEXT.SIZE); }

    /** Unsafe version of {@link #address$(ByteBuffer) address$}. */
    public static void naddress$(long struct, ByteBuffer value) { memPutAddress(struct + VkHostAddressRangeConstEXT.ADDRESS, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + VkHostAddressRangeConstEXT.SIZE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkHostAddressRangeConstEXT.ADDRESS));
    }

    // -----------------------------------

    /** An array of {@link VkHostAddressRangeConstEXT} structs. */
    public static class Buffer extends StructBuffer<VkHostAddressRangeConstEXT, Buffer> implements NativeResource {

        private static final VkHostAddressRangeConstEXT ELEMENT_FACTORY = VkHostAddressRangeConstEXT.create(-1L);

        /**
         * Creates a new {@code VkHostAddressRangeConstEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostAddressRangeConstEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostAddressRangeConstEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code address} field. */
        @NativeType("void const *")
        public ByteBuffer address$() { return VkHostAddressRangeConstEXT.naddress$(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return VkHostAddressRangeConstEXT.nsize(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code address} field. */
        public VkHostAddressRangeConstEXT.Buffer address$(@NativeType("void const *") ByteBuffer value) { VkHostAddressRangeConstEXT.naddress$(address(), value); return this; }

    }

}