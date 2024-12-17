/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct NVGcolor {
 *     union {
 *         float rgba[4];
 *         struct {
 *             float r;
 *             float g;
 *             float b;
 *             float a;
 *         };
 *     };
 * }}</pre>
 */
@NativeType("struct NVGcolor")
public class NVGColor extends Struct<NVGColor> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RGBA,
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __union(
                __array(4, 4),
                __struct(
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4)
                )
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RGBA = layout.offsetof(1);
        R = layout.offsetof(3);
        G = layout.offsetof(4);
        B = layout.offsetof(5);
        A = layout.offsetof(6);
    }

    protected NVGColor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NVGColor create(long address, @Nullable ByteBuffer container) {
        return new NVGColor(address, container);
    }

    /**
     * Creates a {@code NVGColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NVGColor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code rgba} field. */
    @NativeType("float[4]")
    public FloatBuffer rgba() { return nrgba(address()); }
    /** @return the value at the specified index of the {@code rgba} field. */
    public float rgba(int index) { return nrgba(address(), index); }
    /** @return the value of the {@code r} field. */
    public float r() { return nr(address()); }
    /** @return the value of the {@code g} field. */
    public float g() { return ng(address()); }
    /** @return the value of the {@code b} field. */
    public float b() { return nb(address()); }
    /** @return the value of the {@code a} field. */
    public float a() { return na(address()); }

    /** Copies the specified {@link FloatBuffer} to the {@code rgba} field. */
    public NVGColor rgba(@NativeType("float[4]") FloatBuffer value) { nrgba(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code rgba} field. */
    public NVGColor rgba(int index, float value) { nrgba(address(), index, value); return this; }
    /** Sets the specified value to the {@code r} field. */
    public NVGColor r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public NVGColor g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public NVGColor b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public NVGColor a(float value) { na(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NVGColor set(NVGColor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NVGColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NVGColor malloc() {
        return new NVGColor(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NVGColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NVGColor calloc() {
        return new NVGColor(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NVGColor} instance allocated with {@link BufferUtils}. */
    public static NVGColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGColor(memAddress(container), container);
    }

    /** Returns a new {@code NVGColor} instance for the specified memory address. */
    public static NVGColor create(long address) {
        return new NVGColor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NVGColor createSafe(long address) {
        return address == NULL ? null : new NVGColor(address, null);
    }

    /**
     * Returns a new {@link NVGColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGColor.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NVGColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGColor.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGColor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NVGColor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NVGColor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NVGColor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NVGColor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NVGColor mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NVGColor callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NVGColor mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NVGColor callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGColor.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGColor.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGColor.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGColor.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NVGColor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGColor malloc(MemoryStack stack) {
        return new NVGColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NVGColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGColor calloc(MemoryStack stack) {
        return new NVGColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NVGColor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGColor.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGColor.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rgba}. */
    public static FloatBuffer nrgba(long struct) { return memFloatBuffer(struct + NVGColor.RGBA, 4); }
    /** Unsafe version of {@link #rgba(int) rgba}. */
    public static float nrgba(long struct, int index) {
        return memGetFloat(struct + NVGColor.RGBA + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return memGetFloat(struct + NVGColor.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return memGetFloat(struct + NVGColor.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + NVGColor.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return memGetFloat(struct + NVGColor.A); }

    /** Unsafe version of {@link #rgba(FloatBuffer) rgba}. */
    public static void nrgba(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + NVGColor.RGBA, value.remaining() * 4);
    }
    /** Unsafe version of {@link #rgba(int, float) rgba}. */
    public static void nrgba(long struct, int index, float value) {
        memPutFloat(struct + NVGColor.RGBA + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { memPutFloat(struct + NVGColor.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { memPutFloat(struct + NVGColor.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + NVGColor.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { memPutFloat(struct + NVGColor.A, value); }

    // -----------------------------------

    /** An array of {@link NVGColor} structs. */
    public static class Buffer extends StructBuffer<NVGColor, Buffer> implements NativeResource {

        private static final NVGColor ELEMENT_FACTORY = NVGColor.create(-1L);

        /**
         * Creates a new {@code NVGColor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NVGColor#SIZEOF}, and its mark will be undefined.</p>
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
        protected NVGColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code rgba} field. */
        @NativeType("float[4]")
        public FloatBuffer rgba() { return NVGColor.nrgba(address()); }
        /** @return the value at the specified index of the {@code rgba} field. */
        public float rgba(int index) { return NVGColor.nrgba(address(), index); }
        /** @return the value of the {@code r} field. */
        public float r() { return NVGColor.nr(address()); }
        /** @return the value of the {@code g} field. */
        public float g() { return NVGColor.ng(address()); }
        /** @return the value of the {@code b} field. */
        public float b() { return NVGColor.nb(address()); }
        /** @return the value of the {@code a} field. */
        public float a() { return NVGColor.na(address()); }

        /** Copies the specified {@link FloatBuffer} to the {@code rgba} field. */
        public NVGColor.Buffer rgba(@NativeType("float[4]") FloatBuffer value) { NVGColor.nrgba(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code rgba} field. */
        public NVGColor.Buffer rgba(int index, float value) { NVGColor.nrgba(address(), index, value); return this; }
        /** Sets the specified value to the {@code r} field. */
        public NVGColor.Buffer r(float value) { NVGColor.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public NVGColor.Buffer g(float value) { NVGColor.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public NVGColor.Buffer b(float value) { NVGColor.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public NVGColor.Buffer a(float value) { NVGColor.na(address(), value); return this; }

    }

}