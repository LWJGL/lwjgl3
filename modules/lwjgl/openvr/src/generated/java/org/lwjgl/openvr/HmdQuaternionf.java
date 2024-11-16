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
 * struct HmdQuaternionf_t {
 *     float w;
 *     float x;
 *     float y;
 *     float z;
 * }</code></pre>
 */
@NativeType("struct HmdQuaternionf_t")
public class HmdQuaternionf extends Struct<HmdQuaternionf> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        W,
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        Z = layout.offsetof(3);
    }

    protected HmdQuaternionf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HmdQuaternionf create(long address, @Nullable ByteBuffer container) {
        return new HmdQuaternionf(address, container);
    }

    /**
     * Creates a {@code HmdQuaternionf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdQuaternionf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code w} field. */
    public float w() { return nw(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code z} field. */
    public float z() { return nz(address()); }

    /** Sets the specified value to the {@code w} field. */
    public HmdQuaternionf w(float value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public HmdQuaternionf x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public HmdQuaternionf y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public HmdQuaternionf z(float value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public HmdQuaternionf set(
        float w,
        float x,
        float y,
        float z
    ) {
        w(w);
        x(x);
        y(y);
        z(z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdQuaternionf set(HmdQuaternionf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdQuaternionf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdQuaternionf malloc() {
        return new HmdQuaternionf(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HmdQuaternionf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdQuaternionf calloc() {
        return new HmdQuaternionf(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HmdQuaternionf} instance allocated with {@link BufferUtils}. */
    public static HmdQuaternionf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HmdQuaternionf(memAddress(container), container);
    }

    /** Returns a new {@code HmdQuaternionf} instance for the specified memory address. */
    public static HmdQuaternionf create(long address) {
        return new HmdQuaternionf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable HmdQuaternionf createSafe(long address) {
        return address == NULL ? null : new HmdQuaternionf(address, null);
    }

    /**
     * Returns a new {@link HmdQuaternionf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternionf.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternionf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternionf.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternionf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternionf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HmdQuaternionf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdQuaternionf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static HmdQuaternionf.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternionf.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdQuaternionf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternionf malloc(MemoryStack stack) {
        return new HmdQuaternionf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HmdQuaternionf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternionf calloc(MemoryStack stack) {
        return new HmdQuaternionf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HmdQuaternionf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdQuaternionf.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternionf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdQuaternionf.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return memGetFloat(struct + HmdQuaternionf.W); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + HmdQuaternionf.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + HmdQuaternionf.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return memGetFloat(struct + HmdQuaternionf.Z); }

    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { memPutFloat(struct + HmdQuaternionf.W, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + HmdQuaternionf.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + HmdQuaternionf.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { memPutFloat(struct + HmdQuaternionf.Z, value); }

    // -----------------------------------

    /** An array of {@link HmdQuaternionf} structs. */
    public static class Buffer extends StructBuffer<HmdQuaternionf, Buffer> implements NativeResource {

        private static final HmdQuaternionf ELEMENT_FACTORY = HmdQuaternionf.create(-1L);

        /**
         * Creates a new {@code HmdQuaternionf.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdQuaternionf#SIZEOF}, and its mark will be undefined.</p>
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
        protected HmdQuaternionf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code w} field. */
        public float w() { return HmdQuaternionf.nw(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return HmdQuaternionf.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return HmdQuaternionf.ny(address()); }
        /** @return the value of the {@code z} field. */
        public float z() { return HmdQuaternionf.nz(address()); }

        /** Sets the specified value to the {@code w} field. */
        public HmdQuaternionf.Buffer w(float value) { HmdQuaternionf.nw(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public HmdQuaternionf.Buffer x(float value) { HmdQuaternionf.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public HmdQuaternionf.Buffer y(float value) { HmdQuaternionf.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public HmdQuaternionf.Buffer z(float value) { HmdQuaternionf.nz(address(), value); return this; }

    }

}