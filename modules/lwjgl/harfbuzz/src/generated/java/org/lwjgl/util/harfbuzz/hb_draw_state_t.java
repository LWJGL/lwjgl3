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
 * Current drawing state.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_draw_state_t {
 *     hb_bool_t {@link #path_open};
 *     float {@link #path_start_x};
 *     float {@link #path_start_y};
 *     float {@link #current_x};
 *     float {@link #current_y};
 *     {@link hb_var_num_t hb_var_num_t} reserved1;
 *     {@link hb_var_num_t hb_var_num_t} reserved2;
 *     {@link hb_var_num_t hb_var_num_t} reserved3;
 *     {@link hb_var_num_t hb_var_num_t} reserved4;
 *     {@link hb_var_num_t hb_var_num_t} reserved5;
 *     {@link hb_var_num_t hb_var_num_t} reserved6;
 *     {@link hb_var_num_t hb_var_num_t} reserved7;
 * }</code></pre>
 */
public class hb_draw_state_t extends Struct<hb_draw_state_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PATH_OPEN,
        PATH_START_X,
        PATH_START_Y,
        CURRENT_X,
        CURRENT_Y,
        RESERVED1,
        RESERVED2,
        RESERVED3,
        RESERVED4,
        RESERVED5,
        RESERVED6,
        RESERVED7;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF),
            __member(hb_var_num_t.SIZEOF, hb_var_num_t.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PATH_OPEN = layout.offsetof(0);
        PATH_START_X = layout.offsetof(1);
        PATH_START_Y = layout.offsetof(2);
        CURRENT_X = layout.offsetof(3);
        CURRENT_Y = layout.offsetof(4);
        RESERVED1 = layout.offsetof(5);
        RESERVED2 = layout.offsetof(6);
        RESERVED3 = layout.offsetof(7);
        RESERVED4 = layout.offsetof(8);
        RESERVED5 = layout.offsetof(9);
        RESERVED6 = layout.offsetof(10);
        RESERVED7 = layout.offsetof(11);
    }

    protected hb_draw_state_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_draw_state_t create(long address, @Nullable ByteBuffer container) {
        return new hb_draw_state_t(address, container);
    }

    /**
     * Creates a {@code hb_draw_state_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_draw_state_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** whether there is an open path */
    @NativeType("hb_bool_t")
    public boolean path_open() { return npath_open(address()) != 0; }
    /** X component of the start of current path */
    public float path_start_x() { return npath_start_x(address()); }
    /** Y component of the start of current path */
    public float path_start_y() { return npath_start_y(address()); }
    /** X component of current point */
    public float current_x() { return ncurrent_x(address()); }
    /** Y component of current point */
    public float current_y() { return ncurrent_y(address()); }

    /** Sets the specified value to the {@link #path_open} field. */
    public hb_draw_state_t path_open(@NativeType("hb_bool_t") boolean value) { npath_open(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #path_start_x} field. */
    public hb_draw_state_t path_start_x(float value) { npath_start_x(address(), value); return this; }
    /** Sets the specified value to the {@link #path_start_y} field. */
    public hb_draw_state_t path_start_y(float value) { npath_start_y(address(), value); return this; }
    /** Sets the specified value to the {@link #current_x} field. */
    public hb_draw_state_t current_x(float value) { ncurrent_x(address(), value); return this; }
    /** Sets the specified value to the {@link #current_y} field. */
    public hb_draw_state_t current_y(float value) { ncurrent_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_draw_state_t set(
        boolean path_open,
        float path_start_x,
        float path_start_y,
        float current_x,
        float current_y
    ) {
        path_open(path_open);
        path_start_x(path_start_x);
        path_start_y(path_start_y);
        current_x(current_x);
        current_y(current_y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_draw_state_t set(hb_draw_state_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_draw_state_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_draw_state_t malloc() {
        return new hb_draw_state_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_draw_state_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_draw_state_t calloc() {
        return new hb_draw_state_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_draw_state_t} instance allocated with {@link BufferUtils}. */
    public static hb_draw_state_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_draw_state_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_draw_state_t} instance for the specified memory address. */
    public static hb_draw_state_t create(long address) {
        return new hb_draw_state_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_draw_state_t createSafe(long address) {
        return address == NULL ? null : new hb_draw_state_t(address, null);
    }

    /**
     * Returns a new {@link hb_draw_state_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_draw_state_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_draw_state_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_draw_state_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_draw_state_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_draw_state_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_draw_state_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_draw_state_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_draw_state_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_draw_state_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_draw_state_t malloc(MemoryStack stack) {
        return new hb_draw_state_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_draw_state_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_draw_state_t calloc(MemoryStack stack) {
        return new hb_draw_state_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_draw_state_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_draw_state_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_draw_state_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_draw_state_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #path_open}. */
    public static int npath_open(long struct) { return UNSAFE.getInt(null, struct + hb_draw_state_t.PATH_OPEN); }
    /** Unsafe version of {@link #path_start_x}. */
    public static float npath_start_x(long struct) { return UNSAFE.getFloat(null, struct + hb_draw_state_t.PATH_START_X); }
    /** Unsafe version of {@link #path_start_y}. */
    public static float npath_start_y(long struct) { return UNSAFE.getFloat(null, struct + hb_draw_state_t.PATH_START_Y); }
    /** Unsafe version of {@link #current_x}. */
    public static float ncurrent_x(long struct) { return UNSAFE.getFloat(null, struct + hb_draw_state_t.CURRENT_X); }
    /** Unsafe version of {@link #current_y}. */
    public static float ncurrent_y(long struct) { return UNSAFE.getFloat(null, struct + hb_draw_state_t.CURRENT_Y); }
    public static hb_var_num_t nreserved1(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED1); }
    public static hb_var_num_t nreserved2(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED2); }
    public static hb_var_num_t nreserved3(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED3); }
    public static hb_var_num_t nreserved4(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED4); }
    public static hb_var_num_t nreserved5(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED5); }
    public static hb_var_num_t nreserved6(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED6); }
    public static hb_var_num_t nreserved7(long struct) { return hb_var_num_t.create(struct + hb_draw_state_t.RESERVED7); }

    /** Unsafe version of {@link #path_open(boolean) path_open}. */
    public static void npath_open(long struct, int value) { UNSAFE.putInt(null, struct + hb_draw_state_t.PATH_OPEN, value); }
    /** Unsafe version of {@link #path_start_x(float) path_start_x}. */
    public static void npath_start_x(long struct, float value) { UNSAFE.putFloat(null, struct + hb_draw_state_t.PATH_START_X, value); }
    /** Unsafe version of {@link #path_start_y(float) path_start_y}. */
    public static void npath_start_y(long struct, float value) { UNSAFE.putFloat(null, struct + hb_draw_state_t.PATH_START_Y, value); }
    /** Unsafe version of {@link #current_x(float) current_x}. */
    public static void ncurrent_x(long struct, float value) { UNSAFE.putFloat(null, struct + hb_draw_state_t.CURRENT_X, value); }
    /** Unsafe version of {@link #current_y(float) current_y}. */
    public static void ncurrent_y(long struct, float value) { UNSAFE.putFloat(null, struct + hb_draw_state_t.CURRENT_Y, value); }
    public static void nreserved1(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED1, hb_var_num_t.SIZEOF); }
    public static void nreserved2(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED2, hb_var_num_t.SIZEOF); }
    public static void nreserved3(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED3, hb_var_num_t.SIZEOF); }
    public static void nreserved4(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED4, hb_var_num_t.SIZEOF); }
    public static void nreserved5(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED5, hb_var_num_t.SIZEOF); }
    public static void nreserved6(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED6, hb_var_num_t.SIZEOF); }
    public static void nreserved7(long struct, hb_var_num_t value) { memCopy(value.address(), struct + hb_draw_state_t.RESERVED7, hb_var_num_t.SIZEOF); }

    // -----------------------------------

    /** An array of {@link hb_draw_state_t} structs. */
    public static class Buffer extends StructBuffer<hb_draw_state_t, Buffer> implements NativeResource {

        private static final hb_draw_state_t ELEMENT_FACTORY = hb_draw_state_t.create(-1L);

        /**
         * Creates a new {@code hb_draw_state_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_draw_state_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_draw_state_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_draw_state_t#path_open} field. */
        @NativeType("hb_bool_t")
        public boolean path_open() { return hb_draw_state_t.npath_open(address()) != 0; }
        /** @return the value of the {@link hb_draw_state_t#path_start_x} field. */
        public float path_start_x() { return hb_draw_state_t.npath_start_x(address()); }
        /** @return the value of the {@link hb_draw_state_t#path_start_y} field. */
        public float path_start_y() { return hb_draw_state_t.npath_start_y(address()); }
        /** @return the value of the {@link hb_draw_state_t#current_x} field. */
        public float current_x() { return hb_draw_state_t.ncurrent_x(address()); }
        /** @return the value of the {@link hb_draw_state_t#current_y} field. */
        public float current_y() { return hb_draw_state_t.ncurrent_y(address()); }

        /** Sets the specified value to the {@link hb_draw_state_t#path_open} field. */
        public hb_draw_state_t.Buffer path_open(@NativeType("hb_bool_t") boolean value) { hb_draw_state_t.npath_open(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link hb_draw_state_t#path_start_x} field. */
        public hb_draw_state_t.Buffer path_start_x(float value) { hb_draw_state_t.npath_start_x(address(), value); return this; }
        /** Sets the specified value to the {@link hb_draw_state_t#path_start_y} field. */
        public hb_draw_state_t.Buffer path_start_y(float value) { hb_draw_state_t.npath_start_y(address(), value); return this; }
        /** Sets the specified value to the {@link hb_draw_state_t#current_x} field. */
        public hb_draw_state_t.Buffer current_x(float value) { hb_draw_state_t.ncurrent_x(address(), value); return this; }
        /** Sets the specified value to the {@link hb_draw_state_t#current_y} field. */
        public hb_draw_state_t.Buffer current_y(float value) { hb_draw_state_t.ncurrent_y(address(), value); return this; }

    }

}