/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct HmdColor_t {
 *     float r;
 *     float g;
 *     float b;
 *     float a;
 * }</code></pre>
 */
@NativeType("struct HmdColor_t")
public class HmdColor extends Struct<HmdColor> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected HmdColor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HmdColor create(long address, @Nullable ByteBuffer container) {
        return new HmdColor(address, container);
    }

    /**
     * Creates a {@code HmdColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdColor(ByteBuffer container) {
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
    /** @return the value of the {@code a} field. */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public HmdColor r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public HmdColor g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public HmdColor b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public HmdColor a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public HmdColor set(
        float r,
        float g,
        float b,
        float a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdColor set(HmdColor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdColor malloc() {
        return new HmdColor(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HmdColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdColor calloc() {
        return new HmdColor(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HmdColor} instance allocated with {@link BufferUtils}. */
    public static HmdColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HmdColor(memAddress(container), container);
    }

    /** Returns a new {@code HmdColor} instance for the specified memory address. */
    public static HmdColor create(long address) {
        return new HmdColor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable HmdColor createSafe(long address) {
        return address == NULL ? null : new HmdColor(address, null);
    }

    /**
     * Returns a new {@link HmdColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdColor.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdColor.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdColor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdColor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HmdColor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdColor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static HmdColor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdColor mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdColor callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdColor mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdColor callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdColor.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdColor.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdColor.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdColor.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdColor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdColor malloc(MemoryStack stack) {
        return new HmdColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HmdColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdColor calloc(MemoryStack stack) {
        return new HmdColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HmdColor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdColor.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdColor.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return memGetFloat(struct + HmdColor.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return memGetFloat(struct + HmdColor.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + HmdColor.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return memGetFloat(struct + HmdColor.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { memPutFloat(struct + HmdColor.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { memPutFloat(struct + HmdColor.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + HmdColor.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { memPutFloat(struct + HmdColor.A, value); }

    // -----------------------------------

    /** An array of {@link HmdColor} structs. */
    public static class Buffer extends StructBuffer<HmdColor, Buffer> implements NativeResource {

        private static final HmdColor ELEMENT_FACTORY = HmdColor.create(-1L);

        /**
         * Creates a new {@code HmdColor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdColor#SIZEOF}, and its mark will be undefined.</p>
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
        protected HmdColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code r} field. */
        public float r() { return HmdColor.nr(address()); }
        /** @return the value of the {@code g} field. */
        public float g() { return HmdColor.ng(address()); }
        /** @return the value of the {@code b} field. */
        public float b() { return HmdColor.nb(address()); }
        /** @return the value of the {@code a} field. */
        public float a() { return HmdColor.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public HmdColor.Buffer r(float value) { HmdColor.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public HmdColor.Buffer g(float value) { HmdColor.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public HmdColor.Buffer b(float value) { HmdColor.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public HmdColor.Buffer a(float value) { HmdColor.na(address(), value); return this; }

    }

}