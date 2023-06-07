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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_color_stop_t {
 *     float offset;
 *     hb_bool_t is_foreground;
 *     hb_color_t color;
 * }</code></pre>
 */
public class hb_color_stop_t extends Struct<hb_color_stop_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        IS_FOREGROUND,
        COLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        IS_FOREGROUND = layout.offsetof(1);
        COLOR = layout.offsetof(2);
    }

    protected hb_color_stop_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_color_stop_t create(long address, @Nullable ByteBuffer container) {
        return new hb_color_stop_t(address, container);
    }

    /**
     * Creates a {@code hb_color_stop_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_color_stop_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code offset} field. */
    public float offset() { return noffset(address()); }
    /** @return the value of the {@code is_foreground} field. */
    @NativeType("hb_bool_t")
    public boolean is_foreground() { return nis_foreground(address()) != 0; }
    /** @return the value of the {@code color} field. */
    @NativeType("hb_color_t")
    public int color() { return ncolor(address()); }

    /** Sets the specified value to the {@code offset} field. */
    public hb_color_stop_t offset(float value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code is_foreground} field. */
    public hb_color_stop_t is_foreground(@NativeType("hb_bool_t") boolean value) { nis_foreground(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code color} field. */
    public hb_color_stop_t color(@NativeType("hb_color_t") int value) { ncolor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_color_stop_t set(
        float offset,
        boolean is_foreground,
        int color
    ) {
        offset(offset);
        is_foreground(is_foreground);
        color(color);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_color_stop_t set(hb_color_stop_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_color_stop_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_color_stop_t malloc() {
        return new hb_color_stop_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_color_stop_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_color_stop_t calloc() {
        return new hb_color_stop_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_color_stop_t} instance allocated with {@link BufferUtils}. */
    public static hb_color_stop_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_color_stop_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_color_stop_t} instance for the specified memory address. */
    public static hb_color_stop_t create(long address) {
        return new hb_color_stop_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_color_stop_t createSafe(long address) {
        return address == NULL ? null : new hb_color_stop_t(address, null);
    }

    /**
     * Returns a new {@link hb_color_stop_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_color_stop_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_color_stop_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_color_stop_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_color_stop_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_color_stop_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_color_stop_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_color_stop_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_color_stop_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_color_stop_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_color_stop_t malloc(MemoryStack stack) {
        return new hb_color_stop_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_color_stop_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_color_stop_t calloc(MemoryStack stack) {
        return new hb_color_stop_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_color_stop_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_color_stop_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_color_stop_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_color_stop_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static float noffset(long struct) { return UNSAFE.getFloat(null, struct + hb_color_stop_t.OFFSET); }
    /** Unsafe version of {@link #is_foreground}. */
    public static int nis_foreground(long struct) { return UNSAFE.getInt(null, struct + hb_color_stop_t.IS_FOREGROUND); }
    /** Unsafe version of {@link #color}. */
    public static int ncolor(long struct) { return UNSAFE.getInt(null, struct + hb_color_stop_t.COLOR); }

    /** Unsafe version of {@link #offset(float) offset}. */
    public static void noffset(long struct, float value) { UNSAFE.putFloat(null, struct + hb_color_stop_t.OFFSET, value); }
    /** Unsafe version of {@link #is_foreground(boolean) is_foreground}. */
    public static void nis_foreground(long struct, int value) { UNSAFE.putInt(null, struct + hb_color_stop_t.IS_FOREGROUND, value); }
    /** Unsafe version of {@link #color(int) color}. */
    public static void ncolor(long struct, int value) { UNSAFE.putInt(null, struct + hb_color_stop_t.COLOR, value); }

    // -----------------------------------

    /** An array of {@link hb_color_stop_t} structs. */
    public static class Buffer extends StructBuffer<hb_color_stop_t, Buffer> implements NativeResource {

        private static final hb_color_stop_t ELEMENT_FACTORY = hb_color_stop_t.create(-1L);

        /**
         * Creates a new {@code hb_color_stop_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_color_stop_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_color_stop_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code offset} field. */
        public float offset() { return hb_color_stop_t.noffset(address()); }
        /** @return the value of the {@code is_foreground} field. */
        @NativeType("hb_bool_t")
        public boolean is_foreground() { return hb_color_stop_t.nis_foreground(address()) != 0; }
        /** @return the value of the {@code color} field. */
        @NativeType("hb_color_t")
        public int color() { return hb_color_stop_t.ncolor(address()); }

        /** Sets the specified value to the {@code offset} field. */
        public hb_color_stop_t.Buffer offset(float value) { hb_color_stop_t.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code is_foreground} field. */
        public hb_color_stop_t.Buffer is_foreground(@NativeType("hb_bool_t") boolean value) { hb_color_stop_t.nis_foreground(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code color} field. */
        public hb_color_stop_t.Buffer color(@NativeType("hb_color_t") int value) { hb_color_stop_t.ncolor(address(), value); return this; }

    }

}