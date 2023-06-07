/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Data type to hold math kerning (cut-in) information for a glyph.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_ot_math_kern_entry_t {
 *     hb_position_t {@link #max_correction_height};
 *     hb_position_t {@link #kern_value};
 * }</code></pre>
 */
public class hb_ot_math_kern_entry_t extends Struct<hb_ot_math_kern_entry_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAX_CORRECTION_HEIGHT,
        KERN_VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAX_CORRECTION_HEIGHT = layout.offsetof(0);
        KERN_VALUE = layout.offsetof(1);
    }

    protected hb_ot_math_kern_entry_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_ot_math_kern_entry_t create(long address, @Nullable ByteBuffer container) {
        return new hb_ot_math_kern_entry_t(address, container);
    }

    /**
     * Creates a {@code hb_ot_math_kern_entry_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_ot_math_kern_entry_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the maximum height at which this entry should be used */
    @NativeType("hb_position_t")
    public int max_correction_height() { return nmax_correction_height(address()); }
    /** the kern value of the entry */
    @NativeType("hb_position_t")
    public int kern_value() { return nkern_value(address()); }

    /** Sets the specified value to the {@link #max_correction_height} field. */
    public hb_ot_math_kern_entry_t max_correction_height(@NativeType("hb_position_t") int value) { nmax_correction_height(address(), value); return this; }
    /** Sets the specified value to the {@link #kern_value} field. */
    public hb_ot_math_kern_entry_t kern_value(@NativeType("hb_position_t") int value) { nkern_value(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_ot_math_kern_entry_t set(
        int max_correction_height,
        int kern_value
    ) {
        max_correction_height(max_correction_height);
        kern_value(kern_value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_ot_math_kern_entry_t set(hb_ot_math_kern_entry_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_ot_math_kern_entry_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_ot_math_kern_entry_t malloc() {
        return new hb_ot_math_kern_entry_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_math_kern_entry_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_ot_math_kern_entry_t calloc() {
        return new hb_ot_math_kern_entry_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_math_kern_entry_t} instance allocated with {@link BufferUtils}. */
    public static hb_ot_math_kern_entry_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_ot_math_kern_entry_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_ot_math_kern_entry_t} instance for the specified memory address. */
    public static hb_ot_math_kern_entry_t create(long address) {
        return new hb_ot_math_kern_entry_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_math_kern_entry_t createSafe(long address) {
        return address == NULL ? null : new hb_ot_math_kern_entry_t(address, null);
    }

    /**
     * Returns a new {@link hb_ot_math_kern_entry_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_kern_entry_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_ot_math_kern_entry_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_kern_entry_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_math_kern_entry_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_kern_entry_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_ot_math_kern_entry_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_kern_entry_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_math_kern_entry_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_ot_math_kern_entry_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_math_kern_entry_t malloc(MemoryStack stack) {
        return new hb_ot_math_kern_entry_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_ot_math_kern_entry_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_math_kern_entry_t calloc(MemoryStack stack) {
        return new hb_ot_math_kern_entry_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_ot_math_kern_entry_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_kern_entry_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_math_kern_entry_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_kern_entry_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #max_correction_height}. */
    public static int nmax_correction_height(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_kern_entry_t.MAX_CORRECTION_HEIGHT); }
    /** Unsafe version of {@link #kern_value}. */
    public static int nkern_value(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_kern_entry_t.KERN_VALUE); }

    /** Unsafe version of {@link #max_correction_height(int) max_correction_height}. */
    public static void nmax_correction_height(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_kern_entry_t.MAX_CORRECTION_HEIGHT, value); }
    /** Unsafe version of {@link #kern_value(int) kern_value}. */
    public static void nkern_value(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_kern_entry_t.KERN_VALUE, value); }

    // -----------------------------------

    /** An array of {@link hb_ot_math_kern_entry_t} structs. */
    public static class Buffer extends StructBuffer<hb_ot_math_kern_entry_t, Buffer> implements NativeResource {

        private static final hb_ot_math_kern_entry_t ELEMENT_FACTORY = hb_ot_math_kern_entry_t.create(-1L);

        /**
         * Creates a new {@code hb_ot_math_kern_entry_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_ot_math_kern_entry_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_ot_math_kern_entry_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_ot_math_kern_entry_t#max_correction_height} field. */
        @NativeType("hb_position_t")
        public int max_correction_height() { return hb_ot_math_kern_entry_t.nmax_correction_height(address()); }
        /** @return the value of the {@link hb_ot_math_kern_entry_t#kern_value} field. */
        @NativeType("hb_position_t")
        public int kern_value() { return hb_ot_math_kern_entry_t.nkern_value(address()); }

        /** Sets the specified value to the {@link hb_ot_math_kern_entry_t#max_correction_height} field. */
        public hb_ot_math_kern_entry_t.Buffer max_correction_height(@NativeType("hb_position_t") int value) { hb_ot_math_kern_entry_t.nmax_correction_height(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_math_kern_entry_t#kern_value} field. */
        public hb_ot_math_kern_entry_t.Buffer kern_value(@NativeType("hb_position_t") int value) { hb_ot_math_kern_entry_t.nkern_value(address(), value); return this; }

    }

}