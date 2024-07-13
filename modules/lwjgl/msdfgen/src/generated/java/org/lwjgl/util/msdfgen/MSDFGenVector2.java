/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

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
 * struct msdf_vector2 {
 *     double {@link #x};
 *     double {@link #y};
 * }</code></pre>
 */
@NativeType("struct msdf_vector2")
public class MSDFGenVector2 extends Struct<MSDFGenVector2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected MSDFGenVector2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenVector2 create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenVector2(address, container);
    }

    /**
     * Creates a {@code MSDFGenVector2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenVector2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x-coordinate of this vector */
    public double x() { return nx(address()); }
    /** the y-coordinate of this vector */
    public double y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public MSDFGenVector2 x(double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public MSDFGenVector2 y(double value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenVector2 set(
        double x,
        double y
    ) {
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenVector2 set(MSDFGenVector2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenVector2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenVector2 malloc() {
        return new MSDFGenVector2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenVector2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenVector2 calloc() {
        return new MSDFGenVector2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenVector2} instance allocated with {@link BufferUtils}. */
    public static MSDFGenVector2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenVector2(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenVector2} instance for the specified memory address. */
    public static MSDFGenVector2 create(long address) {
        return new MSDFGenVector2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MSDFGenVector2 createSafe(long address) {
        return address == NULL ? null : new MSDFGenVector2(address, null);
    }

    /**
     * Returns a new {@link MSDFGenVector2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenVector2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenVector2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenVector2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenVector2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenVector2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenVector2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenVector2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MSDFGenVector2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenVector2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenVector2 malloc(MemoryStack stack) {
        return new MSDFGenVector2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenVector2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenVector2 calloc(MemoryStack stack) {
        return new MSDFGenVector2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenVector2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenVector2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenVector2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenVector2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static double nx(long struct) { return UNSAFE.getDouble(null, struct + MSDFGenVector2.X); }
    /** Unsafe version of {@link #y}. */
    public static double ny(long struct) { return UNSAFE.getDouble(null, struct + MSDFGenVector2.Y); }

    /** Unsafe version of {@link #x(double) x}. */
    public static void nx(long struct, double value) { UNSAFE.putDouble(null, struct + MSDFGenVector2.X, value); }
    /** Unsafe version of {@link #y(double) y}. */
    public static void ny(long struct, double value) { UNSAFE.putDouble(null, struct + MSDFGenVector2.Y, value); }

    // -----------------------------------

    /** An array of {@link MSDFGenVector2} structs. */
    public static class Buffer extends StructBuffer<MSDFGenVector2, Buffer> implements NativeResource {

        private static final MSDFGenVector2 ELEMENT_FACTORY = MSDFGenVector2.create(-1L);

        /**
         * Creates a new {@code MSDFGenVector2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenVector2#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenVector2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link MSDFGenVector2#x} field. */
        public double x() { return MSDFGenVector2.nx(address()); }
        /** @return the value of the {@link MSDFGenVector2#y} field. */
        public double y() { return MSDFGenVector2.ny(address()); }

        /** Sets the specified value to the {@link MSDFGenVector2#x} field. */
        public MSDFGenVector2.Buffer x(double value) { MSDFGenVector2.nx(address(), value); return this; }
        /** Sets the specified value to the {@link MSDFGenVector2#y} field. */
        public MSDFGenVector2.Buffer y(double value) { MSDFGenVector2.ny(address(), value); return this; }

    }

}