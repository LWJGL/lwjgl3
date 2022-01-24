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
 * struct StdVideoDecodeH265ReferenceInfoFlags {
 *     uint32_t is_long_term : 1;
 *     uint32_t is_non_existing : 1;
 * }</code></pre>
 */
public class StdVideoDecodeH265ReferenceInfoFlags extends Struct implements NativeResource {

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

    /**
     * Creates a {@code StdVideoDecodeH265ReferenceInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH265ReferenceInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code is_long_term} field. */
    @NativeType("uint32_t")
    public int is_long_term() { return nis_long_term(address()); }
    /** @return the value of the {@code is_non_existing} field. */
    @NativeType("uint32_t")
    public int is_non_existing() { return nis_non_existing(address()); }

    /** Sets the specified value to the {@code is_long_term} field. */
    public StdVideoDecodeH265ReferenceInfoFlags is_long_term(@NativeType("uint32_t") int value) { nis_long_term(address(), value); return this; }
    /** Sets the specified value to the {@code is_non_existing} field. */
    public StdVideoDecodeH265ReferenceInfoFlags is_non_existing(@NativeType("uint32_t") int value) { nis_non_existing(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH265ReferenceInfoFlags set(
        int is_long_term,
        int is_non_existing
    ) {
        is_long_term(is_long_term);
        is_non_existing(is_non_existing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH265ReferenceInfoFlags set(StdVideoDecodeH265ReferenceInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265ReferenceInfoFlags malloc() {
        return wrap(StdVideoDecodeH265ReferenceInfoFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265ReferenceInfoFlags calloc() {
        return wrap(StdVideoDecodeH265ReferenceInfoFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH265ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH265ReferenceInfoFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeH265ReferenceInfoFlags create(long address) {
        return wrap(StdVideoDecodeH265ReferenceInfoFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265ReferenceInfoFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH265ReferenceInfoFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH265ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265ReferenceInfoFlags malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH265ReferenceInfoFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH265ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265ReferenceInfoFlags calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH265ReferenceInfoFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH265ReferenceInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #is_long_term}. */
    public static int nis_long_term(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #is_non_existing}. */
    public static int nis_non_existing(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH265ReferenceInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #is_long_term(int) is_long_term}. */
    public static void nis_long_term(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #is_non_existing(int) is_non_existing}. */
    public static void nis_non_existing(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH265ReferenceInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265ReferenceInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeH265ReferenceInfoFlags ELEMENT_FACTORY = StdVideoDecodeH265ReferenceInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH265ReferenceInfoFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH265ReferenceInfoFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH265ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code is_long_term} field. */
        @NativeType("uint32_t")
        public int is_long_term() { return StdVideoDecodeH265ReferenceInfoFlags.nis_long_term(address()); }
        /** @return the value of the {@code is_non_existing} field. */
        @NativeType("uint32_t")
        public int is_non_existing() { return StdVideoDecodeH265ReferenceInfoFlags.nis_non_existing(address()); }

        /** Sets the specified value to the {@code is_long_term} field. */
        public StdVideoDecodeH265ReferenceInfoFlags.Buffer is_long_term(@NativeType("uint32_t") int value) { StdVideoDecodeH265ReferenceInfoFlags.nis_long_term(address(), value); return this; }
        /** Sets the specified value to the {@code is_non_existing} field. */
        public StdVideoDecodeH265ReferenceInfoFlags.Buffer is_non_existing(@NativeType("uint32_t") int value) { StdVideoDecodeH265ReferenceInfoFlags.nis_non_existing(address(), value); return this; }

    }

}