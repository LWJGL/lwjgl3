/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265ReferenceInfoFlags {
 *     uint32_t used_for_long_term_reference : 1;
 *     uint32_t unused_for_reference : 1;
 *     uint32_t reserved : 30;
 * }</code></pre>
 */
public class StdVideoEncodeH265ReferenceInfoFlags extends Struct<StdVideoEncodeH265ReferenceInfoFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoEncodeH265ReferenceInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265ReferenceInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265ReferenceInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265ReferenceInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code used_for_long_term_reference} field. */
    @NativeType("uint32_t")
    public boolean used_for_long_term_reference() { return nused_for_long_term_reference(address()) != 0; }
    /** @return the value of the {@code unused_for_reference} field. */
    @NativeType("uint32_t")
    public boolean unused_for_reference() { return nunused_for_reference(address()) != 0; }

    /** Sets the specified value to the {@code used_for_long_term_reference} field. */
    public StdVideoEncodeH265ReferenceInfoFlags used_for_long_term_reference(@NativeType("uint32_t") boolean value) { nused_for_long_term_reference(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code unused_for_reference} field. */
    public StdVideoEncodeH265ReferenceInfoFlags unused_for_reference(@NativeType("uint32_t") boolean value) { nunused_for_reference(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265ReferenceInfoFlags set(
        boolean used_for_long_term_reference,
        boolean unused_for_reference
    ) {
        used_for_long_term_reference(used_for_long_term_reference);
        unused_for_reference(unused_for_reference);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265ReferenceInfoFlags set(StdVideoEncodeH265ReferenceInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceInfoFlags malloc() {
        return new StdVideoEncodeH265ReferenceInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceInfoFlags calloc() {
        return new StdVideoEncodeH265ReferenceInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfoFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265ReferenceInfoFlags create(long address) {
        return new StdVideoEncodeH265ReferenceInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265ReferenceInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265ReferenceInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #used_for_long_term_reference}. */
    public static int nused_for_long_term_reference(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #unused_for_reference}. */
    public static int nunused_for_reference(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    public static int nbitfield1(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265ReferenceInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x3F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265ReferenceInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #used_for_long_term_reference(boolean) used_for_long_term_reference}. */
    public static void nused_for_long_term_reference(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #unused_for_reference(boolean) unused_for_reference}. */
    public static void nunused_for_reference(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    public static void nbitfield1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265ReferenceInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xC0_00_00_00) | (value & 0x3F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265ReferenceInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265ReferenceInfoFlags ELEMENT_FACTORY = StdVideoEncodeH265ReferenceInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265ReferenceInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265ReferenceInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code used_for_long_term_reference} field. */
        @NativeType("uint32_t")
        public boolean used_for_long_term_reference() { return StdVideoEncodeH265ReferenceInfoFlags.nused_for_long_term_reference(address()) != 0; }
        /** @return the value of the {@code unused_for_reference} field. */
        @NativeType("uint32_t")
        public boolean unused_for_reference() { return StdVideoEncodeH265ReferenceInfoFlags.nunused_for_reference(address()) != 0; }

        /** Sets the specified value to the {@code used_for_long_term_reference} field. */
        public StdVideoEncodeH265ReferenceInfoFlags.Buffer used_for_long_term_reference(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265ReferenceInfoFlags.nused_for_long_term_reference(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code unused_for_reference} field. */
        public StdVideoEncodeH265ReferenceInfoFlags.Buffer unused_for_reference(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265ReferenceInfoFlags.nunused_for_reference(address(), value ? 1 : 0); return this; }

    }

}