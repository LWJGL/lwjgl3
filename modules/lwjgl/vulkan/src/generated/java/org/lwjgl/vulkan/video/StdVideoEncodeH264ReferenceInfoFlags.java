/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264ReferenceInfoFlags {
 *     uint32_t used_for_long_term_reference : 1;
 *     uint32_t reserved : 31;
 * }</code></pre>
 */
public class StdVideoEncodeH264ReferenceInfoFlags extends Struct<StdVideoEncodeH264ReferenceInfoFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoEncodeH264ReferenceInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264ReferenceInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264ReferenceInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264ReferenceInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264ReferenceInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code used_for_long_term_reference} field. */
    @NativeType("uint32_t")
    public boolean used_for_long_term_reference() { return nused_for_long_term_reference(address()) != 0; }

    /** Sets the specified value to the {@code used_for_long_term_reference} field. */
    public StdVideoEncodeH264ReferenceInfoFlags used_for_long_term_reference(@NativeType("uint32_t") boolean value) { nused_for_long_term_reference(address(), value ? 1 : 0); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264ReferenceInfoFlags set(StdVideoEncodeH264ReferenceInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceInfoFlags malloc() {
        return new StdVideoEncodeH264ReferenceInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceInfoFlags calloc() {
        return new StdVideoEncodeH264ReferenceInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264ReferenceInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfoFlags} instance for the specified memory address. */
    public static StdVideoEncodeH264ReferenceInfoFlags create(long address) {
        return new StdVideoEncodeH264ReferenceInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeH264ReferenceInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264ReferenceInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeH264ReferenceInfoFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoEncodeH264ReferenceInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #used_for_long_term_reference}. */
    public static int nused_for_long_term_reference(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    public static int nreserved(long struct) { return nbitfield0(struct) >>> 1; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoEncodeH264ReferenceInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #used_for_long_term_reference(boolean) used_for_long_term_reference}. */
    public static void nused_for_long_term_reference(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    public static void nreserved(long struct, int value) { nbitfield0(struct, (value << 1) | (nbitfield0(struct) & 0x00_00_00_01)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264ReferenceInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264ReferenceInfoFlags ELEMENT_FACTORY = StdVideoEncodeH264ReferenceInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264ReferenceInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264ReferenceInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code used_for_long_term_reference} field. */
        @NativeType("uint32_t")
        public boolean used_for_long_term_reference() { return StdVideoEncodeH264ReferenceInfoFlags.nused_for_long_term_reference(address()) != 0; }

        /** Sets the specified value to the {@code used_for_long_term_reference} field. */
        public StdVideoEncodeH264ReferenceInfoFlags.Buffer used_for_long_term_reference(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264ReferenceInfoFlags.nused_for_long_term_reference(address(), value ? 1 : 0); return this; }

    }

}