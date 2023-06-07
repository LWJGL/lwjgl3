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
 * A simple structure used to store a 2D vector unit vector. Uses {@code FT_F2Dot14} types.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_UnitVector {
 *     FT_F2Dot14 x;
 *     FT_F2Dot14 y;
 * }</code></pre>
 */
public class FT_UnitVector extends Struct<FT_UnitVector> implements NativeResource {

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
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected FT_UnitVector(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_UnitVector create(long address, @Nullable ByteBuffer container) {
        return new FT_UnitVector(address, container);
    }

    /**
     * Creates a {@code FT_UnitVector} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_UnitVector(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    @NativeType("FT_F2Dot14")
    public short x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("FT_F2Dot14")
    public short y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public FT_UnitVector x(@NativeType("FT_F2Dot14") short value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public FT_UnitVector y(@NativeType("FT_F2Dot14") short value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_UnitVector set(
        short x,
        short y
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
    public FT_UnitVector set(FT_UnitVector src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_UnitVector} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_UnitVector malloc() {
        return new FT_UnitVector(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_UnitVector} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_UnitVector calloc() {
        return new FT_UnitVector(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_UnitVector} instance allocated with {@link BufferUtils}. */
    public static FT_UnitVector create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_UnitVector(memAddress(container), container);
    }

    /** Returns a new {@code FT_UnitVector} instance for the specified memory address. */
    public static FT_UnitVector create(long address) {
        return new FT_UnitVector(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_UnitVector createSafe(long address) {
        return address == NULL ? null : new FT_UnitVector(address, null);
    }

    /**
     * Returns a new {@link FT_UnitVector.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_UnitVector.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_UnitVector.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_UnitVector.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_UnitVector.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_UnitVector.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_UnitVector.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_UnitVector.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_UnitVector.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_UnitVector} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_UnitVector malloc(MemoryStack stack) {
        return new FT_UnitVector(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_UnitVector} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_UnitVector calloc(MemoryStack stack) {
        return new FT_UnitVector(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_UnitVector.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_UnitVector.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_UnitVector.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_UnitVector.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + FT_UnitVector.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + FT_UnitVector.Y); }

    /** Unsafe version of {@link #x(short) x}. */
    public static void nx(long struct, short value) { UNSAFE.putShort(null, struct + FT_UnitVector.X, value); }
    /** Unsafe version of {@link #y(short) y}. */
    public static void ny(long struct, short value) { UNSAFE.putShort(null, struct + FT_UnitVector.Y, value); }

    // -----------------------------------

    /** An array of {@link FT_UnitVector} structs. */
    public static class Buffer extends StructBuffer<FT_UnitVector, Buffer> implements NativeResource {

        private static final FT_UnitVector ELEMENT_FACTORY = FT_UnitVector.create(-1L);

        /**
         * Creates a new {@code FT_UnitVector.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_UnitVector#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_UnitVector getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        @NativeType("FT_F2Dot14")
        public short x() { return FT_UnitVector.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("FT_F2Dot14")
        public short y() { return FT_UnitVector.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public FT_UnitVector.Buffer x(@NativeType("FT_F2Dot14") short value) { FT_UnitVector.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public FT_UnitVector.Buffer y(@NativeType("FT_F2Dot14") short value) { FT_UnitVector.ny(address(), value); return this; }

    }

}