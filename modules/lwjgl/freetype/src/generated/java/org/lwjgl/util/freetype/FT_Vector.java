/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A simple structure used to store a 2D vector; coordinates are of the {@code FT_Pos} type.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Vector {
 *     FT_Pos x;
 *     FT_Pos y;
 * }</code></pre>
 */
public class FT_Vector extends Struct<FT_Vector> implements NativeResource {

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
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected FT_Vector(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Vector create(long address, @Nullable ByteBuffer container) {
        return new FT_Vector(address, container);
    }

    /**
     * Creates a {@code FT_Vector} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Vector(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    @NativeType("FT_Pos")
    public long x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("FT_Pos")
    public long y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public FT_Vector x(@NativeType("FT_Pos") long value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public FT_Vector y(@NativeType("FT_Pos") long value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Vector set(
        long x,
        long y
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
    public FT_Vector set(FT_Vector src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Vector} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Vector malloc() {
        return new FT_Vector(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Vector} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Vector calloc() {
        return new FT_Vector(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Vector} instance allocated with {@link BufferUtils}. */
    public static FT_Vector create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Vector(memAddress(container), container);
    }

    /** Returns a new {@code FT_Vector} instance for the specified memory address. */
    public static FT_Vector create(long address) {
        return new FT_Vector(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Vector createSafe(long address) {
        return address == NULL ? null : new FT_Vector(address, null);
    }

    /**
     * Returns a new {@link FT_Vector.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Vector.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Vector.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Vector.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Vector.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Vector.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Vector.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Vector.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Vector.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Vector} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Vector malloc(MemoryStack stack) {
        return new FT_Vector(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Vector} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Vector calloc(MemoryStack stack) {
        return new FT_Vector(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Vector.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Vector.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Vector.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Vector.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static long nx(long struct) { return memGetCLong(struct + FT_Vector.X); }
    /** Unsafe version of {@link #y}. */
    public static long ny(long struct) { return memGetCLong(struct + FT_Vector.Y); }

    /** Unsafe version of {@link #x(long) x}. */
    public static void nx(long struct, long value) { memPutCLong(struct + FT_Vector.X, value); }
    /** Unsafe version of {@link #y(long) y}. */
    public static void ny(long struct, long value) { memPutCLong(struct + FT_Vector.Y, value); }

    // -----------------------------------

    /** An array of {@link FT_Vector} structs. */
    public static class Buffer extends StructBuffer<FT_Vector, Buffer> implements NativeResource {

        private static final FT_Vector ELEMENT_FACTORY = FT_Vector.create(-1L);

        /**
         * Creates a new {@code FT_Vector.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Vector#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Vector getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        @NativeType("FT_Pos")
        public long x() { return FT_Vector.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("FT_Pos")
        public long y() { return FT_Vector.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public FT_Vector.Buffer x(@NativeType("FT_Pos") long value) { FT_Vector.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public FT_Vector.Buffer y(@NativeType("FT_Pos") long value) { FT_Vector.ny(address(), value); return this; }

    }

}