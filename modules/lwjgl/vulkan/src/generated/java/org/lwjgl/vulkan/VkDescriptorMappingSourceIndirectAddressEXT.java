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
 * struct VkDescriptorMappingSourceIndirectAddressEXT {
 *     uint32_t pushOffset;
 *     uint32_t addressOffset;
 * }}</pre>
 */
public class VkDescriptorMappingSourceIndirectAddressEXT extends Struct<VkDescriptorMappingSourceIndirectAddressEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PUSHOFFSET,
        ADDRESSOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PUSHOFFSET = layout.offsetof(0);
        ADDRESSOFFSET = layout.offsetof(1);
    }

    protected VkDescriptorMappingSourceIndirectAddressEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorMappingSourceIndirectAddressEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(address, container);
    }

    /**
     * Creates a {@code VkDescriptorMappingSourceIndirectAddressEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorMappingSourceIndirectAddressEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pushOffset} field. */
    @NativeType("uint32_t")
    public int pushOffset() { return npushOffset(address()); }
    /** @return the value of the {@code addressOffset} field. */
    @NativeType("uint32_t")
    public int addressOffset() { return naddressOffset(address()); }

    /** Sets the specified value to the {@code pushOffset} field. */
    public VkDescriptorMappingSourceIndirectAddressEXT pushOffset(@NativeType("uint32_t") int value) { npushOffset(address(), value); return this; }
    /** Sets the specified value to the {@code addressOffset} field. */
    public VkDescriptorMappingSourceIndirectAddressEXT addressOffset(@NativeType("uint32_t") int value) { naddressOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorMappingSourceIndirectAddressEXT set(
        int pushOffset,
        int addressOffset
    ) {
        pushOffset(pushOffset);
        addressOffset(addressOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorMappingSourceIndirectAddressEXT set(VkDescriptorMappingSourceIndirectAddressEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorMappingSourceIndirectAddressEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceIndirectAddressEXT malloc() {
        return new VkDescriptorMappingSourceIndirectAddressEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectAddressEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorMappingSourceIndirectAddressEXT calloc() {
        return new VkDescriptorMappingSourceIndirectAddressEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectAddressEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorMappingSourceIndirectAddressEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceIndirectAddressEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorMappingSourceIndirectAddressEXT} instance for the specified memory address. */
    public static VkDescriptorMappingSourceIndirectAddressEXT create(long address) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorMappingSourceIndirectAddressEXT createSafe(long address) {
        return address == NULL ? null : new VkDescriptorMappingSourceIndirectAddressEXT(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorMappingSourceIndirectAddressEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceIndirectAddressEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorMappingSourceIndirectAddressEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceIndirectAddressEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorMappingSourceIndirectAddressEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pushOffset}. */
    public static int npushOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectAddressEXT.PUSHOFFSET); }
    /** Unsafe version of {@link #addressOffset}. */
    public static int naddressOffset(long struct) { return memGetInt(struct + VkDescriptorMappingSourceIndirectAddressEXT.ADDRESSOFFSET); }

    /** Unsafe version of {@link #pushOffset(int) pushOffset}. */
    public static void npushOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectAddressEXT.PUSHOFFSET, value); }
    /** Unsafe version of {@link #addressOffset(int) addressOffset}. */
    public static void naddressOffset(long struct, int value) { memPutInt(struct + VkDescriptorMappingSourceIndirectAddressEXT.ADDRESSOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorMappingSourceIndirectAddressEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceIndirectAddressEXT, Buffer> implements NativeResource {

        private static final VkDescriptorMappingSourceIndirectAddressEXT ELEMENT_FACTORY = VkDescriptorMappingSourceIndirectAddressEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorMappingSourceIndirectAddressEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorMappingSourceIndirectAddressEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorMappingSourceIndirectAddressEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pushOffset} field. */
        @NativeType("uint32_t")
        public int pushOffset() { return VkDescriptorMappingSourceIndirectAddressEXT.npushOffset(address()); }
        /** @return the value of the {@code addressOffset} field. */
        @NativeType("uint32_t")
        public int addressOffset() { return VkDescriptorMappingSourceIndirectAddressEXT.naddressOffset(address()); }

        /** Sets the specified value to the {@code pushOffset} field. */
        public VkDescriptorMappingSourceIndirectAddressEXT.Buffer pushOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectAddressEXT.npushOffset(address(), value); return this; }
        /** Sets the specified value to the {@code addressOffset} field. */
        public VkDescriptorMappingSourceIndirectAddressEXT.Buffer addressOffset(@NativeType("uint32_t") int value) { VkDescriptorMappingSourceIndirectAddressEXT.naddressOffset(address(), value); return this; }

    }

}