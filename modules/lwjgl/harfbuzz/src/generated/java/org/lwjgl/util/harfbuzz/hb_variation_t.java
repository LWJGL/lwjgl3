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
 * Data type for holding variation data.
 * 
 * <p>Registered OpenType variation-axis tags are listed in
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg">OpenType Axis Tag Registry</a>.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_variation_t {
 *     hb_tag_t {@link #tag};
 *     float {@link #value};
 * }</code></pre>
 */
public class hb_variation_t extends Struct<hb_variation_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TAG,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TAG = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    protected hb_variation_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_variation_t create(long address, @Nullable ByteBuffer container) {
        return new hb_variation_t(address, container);
    }

    /**
     * Creates a {@code hb_variation_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_variation_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code hb_tag_t} tag of the variation-axis name */
    @NativeType("hb_tag_t")
    public int tag() { return ntag(address()); }
    /** the value of the variation axis */
    public float value() { return nvalue(address()); }

    /** Sets the specified value to the {@link #tag} field. */
    public hb_variation_t tag(@NativeType("hb_tag_t") int value) { ntag(address(), value); return this; }
    /** Sets the specified value to the {@link #value} field. */
    public hb_variation_t value(float value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_variation_t set(
        int tag,
        float value
    ) {
        tag(tag);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_variation_t set(hb_variation_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_variation_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_variation_t malloc() {
        return new hb_variation_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_variation_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_variation_t calloc() {
        return new hb_variation_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_variation_t} instance allocated with {@link BufferUtils}. */
    public static hb_variation_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_variation_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_variation_t} instance for the specified memory address. */
    public static hb_variation_t create(long address) {
        return new hb_variation_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_variation_t createSafe(long address) {
        return address == NULL ? null : new hb_variation_t(address, null);
    }

    /**
     * Returns a new {@link hb_variation_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_variation_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_variation_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_variation_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_variation_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_variation_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_variation_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_variation_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_variation_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_variation_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_variation_t malloc(MemoryStack stack) {
        return new hb_variation_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_variation_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_variation_t calloc(MemoryStack stack) {
        return new hb_variation_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_variation_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_variation_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_variation_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_variation_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tag}. */
    public static int ntag(long struct) { return UNSAFE.getInt(null, struct + hb_variation_t.TAG); }
    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return UNSAFE.getFloat(null, struct + hb_variation_t.VALUE); }

    /** Unsafe version of {@link #tag(int) tag}. */
    public static void ntag(long struct, int value) { UNSAFE.putInt(null, struct + hb_variation_t.TAG, value); }
    /** Unsafe version of {@link #value(float) value}. */
    public static void nvalue(long struct, float value) { UNSAFE.putFloat(null, struct + hb_variation_t.VALUE, value); }

    // -----------------------------------

    /** An array of {@link hb_variation_t} structs. */
    public static class Buffer extends StructBuffer<hb_variation_t, Buffer> implements NativeResource {

        private static final hb_variation_t ELEMENT_FACTORY = hb_variation_t.create(-1L);

        /**
         * Creates a new {@code hb_variation_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_variation_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_variation_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_variation_t#tag} field. */
        @NativeType("hb_tag_t")
        public int tag() { return hb_variation_t.ntag(address()); }
        /** @return the value of the {@link hb_variation_t#value} field. */
        public float value() { return hb_variation_t.nvalue(address()); }

        /** Sets the specified value to the {@link hb_variation_t#tag} field. */
        public hb_variation_t.Buffer tag(@NativeType("hb_tag_t") int value) { hb_variation_t.ntag(address(), value); return this; }
        /** Sets the specified value to the {@link hb_variation_t#value} field. */
        public hb_variation_t.Buffer value(float value) { hb_variation_t.nvalue(address(), value); return this; }

    }

}