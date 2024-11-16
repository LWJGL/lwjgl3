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
 * struct HmdQuaternion_t {
 *     double w;
 *     double x;
 *     double y;
 *     double z;
 * }</code></pre>
 */
@NativeType("struct HmdQuaternion_t")
public class HmdQuaternion extends Struct<HmdQuaternion> implements NativeResource {

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
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        Z = layout.offsetof(3);
    }

    protected HmdQuaternion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HmdQuaternion create(long address, @Nullable ByteBuffer container) {
        return new HmdQuaternion(address, container);
    }

    /**
     * Creates a {@code HmdQuaternion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdQuaternion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code w} field. */
    public double w() { return nw(address()); }
    /** @return the value of the {@code x} field. */
    public double x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public double y() { return ny(address()); }
    /** @return the value of the {@code z} field. */
    public double z() { return nz(address()); }

    /** Sets the specified value to the {@code w} field. */
    public HmdQuaternion w(double value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public HmdQuaternion x(double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public HmdQuaternion y(double value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public HmdQuaternion z(double value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public HmdQuaternion set(
        double w,
        double x,
        double y,
        double z
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
    public HmdQuaternion set(HmdQuaternion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdQuaternion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdQuaternion malloc() {
        return new HmdQuaternion(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HmdQuaternion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdQuaternion calloc() {
        return new HmdQuaternion(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HmdQuaternion} instance allocated with {@link BufferUtils}. */
    public static HmdQuaternion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HmdQuaternion(memAddress(container), container);
    }

    /** Returns a new {@code HmdQuaternion} instance for the specified memory address. */
    public static HmdQuaternion create(long address) {
        return new HmdQuaternion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable HmdQuaternion createSafe(long address) {
        return address == NULL ? null : new HmdQuaternion(address, null);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HmdQuaternion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static HmdQuaternion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdQuaternion.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdQuaternion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternion malloc(MemoryStack stack) {
        return new HmdQuaternion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HmdQuaternion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternion calloc(MemoryStack stack) {
        return new HmdQuaternion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static double nw(long struct) { return memGetDouble(struct + HmdQuaternion.W); }
    /** Unsafe version of {@link #x}. */
    public static double nx(long struct) { return memGetDouble(struct + HmdQuaternion.X); }
    /** Unsafe version of {@link #y}. */
    public static double ny(long struct) { return memGetDouble(struct + HmdQuaternion.Y); }
    /** Unsafe version of {@link #z}. */
    public static double nz(long struct) { return memGetDouble(struct + HmdQuaternion.Z); }

    /** Unsafe version of {@link #w(double) w}. */
    public static void nw(long struct, double value) { memPutDouble(struct + HmdQuaternion.W, value); }
    /** Unsafe version of {@link #x(double) x}. */
    public static void nx(long struct, double value) { memPutDouble(struct + HmdQuaternion.X, value); }
    /** Unsafe version of {@link #y(double) y}. */
    public static void ny(long struct, double value) { memPutDouble(struct + HmdQuaternion.Y, value); }
    /** Unsafe version of {@link #z(double) z}. */
    public static void nz(long struct, double value) { memPutDouble(struct + HmdQuaternion.Z, value); }

    // -----------------------------------

    /** An array of {@link HmdQuaternion} structs. */
    public static class Buffer extends StructBuffer<HmdQuaternion, Buffer> implements NativeResource {

        private static final HmdQuaternion ELEMENT_FACTORY = HmdQuaternion.create(-1L);

        /**
         * Creates a new {@code HmdQuaternion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdQuaternion#SIZEOF}, and its mark will be undefined.</p>
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
        protected HmdQuaternion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code w} field. */
        public double w() { return HmdQuaternion.nw(address()); }
        /** @return the value of the {@code x} field. */
        public double x() { return HmdQuaternion.nx(address()); }
        /** @return the value of the {@code y} field. */
        public double y() { return HmdQuaternion.ny(address()); }
        /** @return the value of the {@code z} field. */
        public double z() { return HmdQuaternion.nz(address()); }

        /** Sets the specified value to the {@code w} field. */
        public HmdQuaternion.Buffer w(double value) { HmdQuaternion.nw(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public HmdQuaternion.Buffer x(double value) { HmdQuaternion.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public HmdQuaternion.Buffer y(double value) { HmdQuaternion.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public HmdQuaternion.Buffer z(double value) { HmdQuaternion.nz(address(), value); return this; }

    }

}