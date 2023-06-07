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
 * A structure to hold various function pointers used during outline decomposition in order to emit segments, conic, and cubic Beziers.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Outline_Funcs {
 *     {@link FT_Outline_MoveToFuncI FT_Outline_MoveToFunc} move_to;
 *     {@link FT_Outline_LineToFuncI FT_Outline_LineToFunc} line_to;
 *     {@link FT_Outline_ConicToFuncI FT_Outline_ConicToFunc} conic_to;
 *     {@link FT_Outline_CubicToFuncI FT_Outline_CubicToFunc} cubic_to;
 *     int shift;
 *     FT_Pos delta;
 * }</code></pre>
 */
public class FT_Outline_Funcs extends Struct<FT_Outline_Funcs> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MOVE_TO,
        LINE_TO,
        CONIC_TO,
        CUBIC_TO,
        SHIFT,
        DELTA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MOVE_TO = layout.offsetof(0);
        LINE_TO = layout.offsetof(1);
        CONIC_TO = layout.offsetof(2);
        CUBIC_TO = layout.offsetof(3);
        SHIFT = layout.offsetof(4);
        DELTA = layout.offsetof(5);
    }

    protected FT_Outline_Funcs(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Outline_Funcs create(long address, @Nullable ByteBuffer container) {
        return new FT_Outline_Funcs(address, container);
    }

    /**
     * Creates a {@code FT_Outline_Funcs} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Outline_Funcs(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code move_to} field. */
    @Nullable
    public FT_Outline_MoveToFunc move_to() { return nmove_to(address()); }
    /** @return the value of the {@code line_to} field. */
    @Nullable
    public FT_Outline_LineToFunc line_to() { return nline_to(address()); }
    /** @return the value of the {@code conic_to} field. */
    @Nullable
    public FT_Outline_ConicToFunc conic_to() { return nconic_to(address()); }
    /** @return the value of the {@code cubic_to} field. */
    @Nullable
    public FT_Outline_CubicToFunc cubic_to() { return ncubic_to(address()); }
    /** @return the value of the {@code shift} field. */
    public int shift() { return nshift(address()); }
    /** @return the value of the {@code delta} field. */
    @NativeType("FT_Pos")
    public long delta() { return ndelta(address()); }

    /** Sets the specified value to the {@code move_to} field. */
    public FT_Outline_Funcs move_to(@Nullable @NativeType("FT_Outline_MoveToFunc") FT_Outline_MoveToFuncI value) { nmove_to(address(), value); return this; }
    /** Sets the specified value to the {@code line_to} field. */
    public FT_Outline_Funcs line_to(@Nullable @NativeType("FT_Outline_LineToFunc") FT_Outline_LineToFuncI value) { nline_to(address(), value); return this; }
    /** Sets the specified value to the {@code conic_to} field. */
    public FT_Outline_Funcs conic_to(@Nullable @NativeType("FT_Outline_ConicToFunc") FT_Outline_ConicToFuncI value) { nconic_to(address(), value); return this; }
    /** Sets the specified value to the {@code cubic_to} field. */
    public FT_Outline_Funcs cubic_to(@Nullable @NativeType("FT_Outline_CubicToFunc") FT_Outline_CubicToFuncI value) { ncubic_to(address(), value); return this; }
    /** Sets the specified value to the {@code shift} field. */
    public FT_Outline_Funcs shift(int value) { nshift(address(), value); return this; }
    /** Sets the specified value to the {@code delta} field. */
    public FT_Outline_Funcs delta(@NativeType("FT_Pos") long value) { ndelta(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Outline_Funcs set(
        FT_Outline_MoveToFuncI move_to,
        FT_Outline_LineToFuncI line_to,
        FT_Outline_ConicToFuncI conic_to,
        FT_Outline_CubicToFuncI cubic_to,
        int shift,
        long delta
    ) {
        move_to(move_to);
        line_to(line_to);
        conic_to(conic_to);
        cubic_to(cubic_to);
        shift(shift);
        delta(delta);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Outline_Funcs set(FT_Outline_Funcs src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Outline_Funcs} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Outline_Funcs malloc() {
        return new FT_Outline_Funcs(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Outline_Funcs} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Outline_Funcs calloc() {
        return new FT_Outline_Funcs(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Outline_Funcs} instance allocated with {@link BufferUtils}. */
    public static FT_Outline_Funcs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Outline_Funcs(memAddress(container), container);
    }

    /** Returns a new {@code FT_Outline_Funcs} instance for the specified memory address. */
    public static FT_Outline_Funcs create(long address) {
        return new FT_Outline_Funcs(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Outline_Funcs createSafe(long address) {
        return address == NULL ? null : new FT_Outline_Funcs(address, null);
    }

    /**
     * Returns a new {@link FT_Outline_Funcs.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline_Funcs.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Outline_Funcs.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline_Funcs.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Outline_Funcs.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline_Funcs.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Outline_Funcs.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Outline_Funcs.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Outline_Funcs.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Outline_Funcs} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Outline_Funcs malloc(MemoryStack stack) {
        return new FT_Outline_Funcs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Outline_Funcs} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Outline_Funcs calloc(MemoryStack stack) {
        return new FT_Outline_Funcs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Outline_Funcs.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Outline_Funcs.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Outline_Funcs.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Outline_Funcs.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #move_to}. */
    @Nullable public static FT_Outline_MoveToFunc nmove_to(long struct) { return FT_Outline_MoveToFunc.createSafe(memGetAddress(struct + FT_Outline_Funcs.MOVE_TO)); }
    /** Unsafe version of {@link #line_to}. */
    @Nullable public static FT_Outline_LineToFunc nline_to(long struct) { return FT_Outline_LineToFunc.createSafe(memGetAddress(struct + FT_Outline_Funcs.LINE_TO)); }
    /** Unsafe version of {@link #conic_to}. */
    @Nullable public static FT_Outline_ConicToFunc nconic_to(long struct) { return FT_Outline_ConicToFunc.createSafe(memGetAddress(struct + FT_Outline_Funcs.CONIC_TO)); }
    /** Unsafe version of {@link #cubic_to}. */
    @Nullable public static FT_Outline_CubicToFunc ncubic_to(long struct) { return FT_Outline_CubicToFunc.createSafe(memGetAddress(struct + FT_Outline_Funcs.CUBIC_TO)); }
    /** Unsafe version of {@link #shift}. */
    public static int nshift(long struct) { return UNSAFE.getInt(null, struct + FT_Outline_Funcs.SHIFT); }
    /** Unsafe version of {@link #delta}. */
    public static long ndelta(long struct) { return memGetCLong(struct + FT_Outline_Funcs.DELTA); }

    /** Unsafe version of {@link #move_to(FT_Outline_MoveToFuncI) move_to}. */
    public static void nmove_to(long struct, @Nullable FT_Outline_MoveToFuncI value) { memPutAddress(struct + FT_Outline_Funcs.MOVE_TO, memAddressSafe(value)); }
    /** Unsafe version of {@link #line_to(FT_Outline_LineToFuncI) line_to}. */
    public static void nline_to(long struct, @Nullable FT_Outline_LineToFuncI value) { memPutAddress(struct + FT_Outline_Funcs.LINE_TO, memAddressSafe(value)); }
    /** Unsafe version of {@link #conic_to(FT_Outline_ConicToFuncI) conic_to}. */
    public static void nconic_to(long struct, @Nullable FT_Outline_ConicToFuncI value) { memPutAddress(struct + FT_Outline_Funcs.CONIC_TO, memAddressSafe(value)); }
    /** Unsafe version of {@link #cubic_to(FT_Outline_CubicToFuncI) cubic_to}. */
    public static void ncubic_to(long struct, @Nullable FT_Outline_CubicToFuncI value) { memPutAddress(struct + FT_Outline_Funcs.CUBIC_TO, memAddressSafe(value)); }
    /** Unsafe version of {@link #shift(int) shift}. */
    public static void nshift(long struct, int value) { UNSAFE.putInt(null, struct + FT_Outline_Funcs.SHIFT, value); }
    /** Unsafe version of {@link #delta(long) delta}. */
    public static void ndelta(long struct, long value) { memPutCLong(struct + FT_Outline_Funcs.DELTA, value); }

    // -----------------------------------

    /** An array of {@link FT_Outline_Funcs} structs. */
    public static class Buffer extends StructBuffer<FT_Outline_Funcs, Buffer> implements NativeResource {

        private static final FT_Outline_Funcs ELEMENT_FACTORY = FT_Outline_Funcs.create(-1L);

        /**
         * Creates a new {@code FT_Outline_Funcs.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Outline_Funcs#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Outline_Funcs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code move_to} field. */
        @Nullable
        public FT_Outline_MoveToFunc move_to() { return FT_Outline_Funcs.nmove_to(address()); }
        /** @return the value of the {@code line_to} field. */
        @Nullable
        public FT_Outline_LineToFunc line_to() { return FT_Outline_Funcs.nline_to(address()); }
        /** @return the value of the {@code conic_to} field. */
        @Nullable
        public FT_Outline_ConicToFunc conic_to() { return FT_Outline_Funcs.nconic_to(address()); }
        /** @return the value of the {@code cubic_to} field. */
        @Nullable
        public FT_Outline_CubicToFunc cubic_to() { return FT_Outline_Funcs.ncubic_to(address()); }
        /** @return the value of the {@code shift} field. */
        public int shift() { return FT_Outline_Funcs.nshift(address()); }
        /** @return the value of the {@code delta} field. */
        @NativeType("FT_Pos")
        public long delta() { return FT_Outline_Funcs.ndelta(address()); }

        /** Sets the specified value to the {@code move_to} field. */
        public FT_Outline_Funcs.Buffer move_to(@Nullable @NativeType("FT_Outline_MoveToFunc") FT_Outline_MoveToFuncI value) { FT_Outline_Funcs.nmove_to(address(), value); return this; }
        /** Sets the specified value to the {@code line_to} field. */
        public FT_Outline_Funcs.Buffer line_to(@Nullable @NativeType("FT_Outline_LineToFunc") FT_Outline_LineToFuncI value) { FT_Outline_Funcs.nline_to(address(), value); return this; }
        /** Sets the specified value to the {@code conic_to} field. */
        public FT_Outline_Funcs.Buffer conic_to(@Nullable @NativeType("FT_Outline_ConicToFunc") FT_Outline_ConicToFuncI value) { FT_Outline_Funcs.nconic_to(address(), value); return this; }
        /** Sets the specified value to the {@code cubic_to} field. */
        public FT_Outline_Funcs.Buffer cubic_to(@Nullable @NativeType("FT_Outline_CubicToFunc") FT_Outline_CubicToFuncI value) { FT_Outline_Funcs.ncubic_to(address(), value); return this; }
        /** Sets the specified value to the {@code shift} field. */
        public FT_Outline_Funcs.Buffer shift(int value) { FT_Outline_Funcs.nshift(address(), value); return this; }
        /** Sets the specified value to the {@code delta} field. */
        public FT_Outline_Funcs.Buffer delta(@NativeType("FT_Pos") long value) { FT_Outline_Funcs.ndelta(address(), value); return this; }

    }

}