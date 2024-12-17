/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrColor3f {
 *     float r;
 *     float g;
 *     float b;
 * }}</pre>
 */
public class XrColor3f extends Struct<XrColor3f> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
    }

    protected XrColor3f(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColor3f create(long address, @Nullable ByteBuffer container) {
        return new XrColor3f(address, container);
    }

    /**
     * Creates a {@code XrColor3f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColor3f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code r} field. */
    public float r() { return nr(address()); }
    /** @return the value of the {@code g} field. */
    public float g() { return ng(address()); }
    /** @return the value of the {@code b} field. */
    public float b() { return nb(address()); }

    /** Sets the specified value to the {@code r} field. */
    public XrColor3f r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public XrColor3f g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public XrColor3f b(float value) { nb(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColor3f set(
        float r,
        float g,
        float b
    ) {
        r(r);
        g(g);
        b(b);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrColor3f set(XrColor3f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColor3f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColor3f malloc() {
        return new XrColor3f(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColor3f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColor3f calloc() {
        return new XrColor3f(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColor3f} instance allocated with {@link BufferUtils}. */
    public static XrColor3f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColor3f(memAddress(container), container);
    }

    /** Returns a new {@code XrColor3f} instance for the specified memory address. */
    public static XrColor3f create(long address) {
        return new XrColor3f(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColor3f createSafe(long address) {
        return address == NULL ? null : new XrColor3f(address, null);
    }

    /**
     * Returns a new {@link XrColor3f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor3f.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColor3f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor3f.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColor3f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor3f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColor3f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColor3f.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColor3f.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColor3f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColor3f malloc(MemoryStack stack) {
        return new XrColor3f(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColor3f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColor3f calloc(MemoryStack stack) {
        return new XrColor3f(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColor3f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColor3f.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColor3f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColor3f.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return memGetFloat(struct + XrColor3f.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return memGetFloat(struct + XrColor3f.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + XrColor3f.B); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { memPutFloat(struct + XrColor3f.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { memPutFloat(struct + XrColor3f.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + XrColor3f.B, value); }

    // -----------------------------------

    /** An array of {@link XrColor3f} structs. */
    public static class Buffer extends StructBuffer<XrColor3f, Buffer> implements NativeResource {

        private static final XrColor3f ELEMENT_FACTORY = XrColor3f.create(-1L);

        /**
         * Creates a new {@code XrColor3f.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColor3f#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColor3f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code r} field. */
        public float r() { return XrColor3f.nr(address()); }
        /** @return the value of the {@code g} field. */
        public float g() { return XrColor3f.ng(address()); }
        /** @return the value of the {@code b} field. */
        public float b() { return XrColor3f.nb(address()); }

        /** Sets the specified value to the {@code r} field. */
        public XrColor3f.Buffer r(float value) { XrColor3f.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public XrColor3f.Buffer g(float value) { XrColor3f.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public XrColor3f.Buffer b(float value) { XrColor3f.nb(address(), value); return this; }

    }

}