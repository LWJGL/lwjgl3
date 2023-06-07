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
 * A simple structure used to store a 2x2 matrix. Coefficients are in 16.16 fixed-point format.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Matrix {
 *     FT_Fixed xx;
 *     FT_Fixed xy;
 *     FT_Fixed yx;
 *     FT_Fixed yy;
 * }</code></pre>
 */
public class FT_Matrix extends Struct<FT_Matrix> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XX,
        XY,
        YX,
        YY;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XX = layout.offsetof(0);
        XY = layout.offsetof(1);
        YX = layout.offsetof(2);
        YY = layout.offsetof(3);
    }

    protected FT_Matrix(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Matrix create(long address, @Nullable ByteBuffer container) {
        return new FT_Matrix(address, container);
    }

    /**
     * Creates a {@code FT_Matrix} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Matrix(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code xx} field. */
    @NativeType("FT_Fixed")
    public long xx() { return nxx(address()); }
    /** @return the value of the {@code xy} field. */
    @NativeType("FT_Fixed")
    public long xy() { return nxy(address()); }
    /** @return the value of the {@code yx} field. */
    @NativeType("FT_Fixed")
    public long yx() { return nyx(address()); }
    /** @return the value of the {@code yy} field. */
    @NativeType("FT_Fixed")
    public long yy() { return nyy(address()); }

    /** Sets the specified value to the {@code xx} field. */
    public FT_Matrix xx(@NativeType("FT_Fixed") long value) { nxx(address(), value); return this; }
    /** Sets the specified value to the {@code xy} field. */
    public FT_Matrix xy(@NativeType("FT_Fixed") long value) { nxy(address(), value); return this; }
    /** Sets the specified value to the {@code yx} field. */
    public FT_Matrix yx(@NativeType("FT_Fixed") long value) { nyx(address(), value); return this; }
    /** Sets the specified value to the {@code yy} field. */
    public FT_Matrix yy(@NativeType("FT_Fixed") long value) { nyy(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Matrix set(
        long xx,
        long xy,
        long yx,
        long yy
    ) {
        xx(xx);
        xy(xy);
        yx(yx);
        yy(yy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Matrix set(FT_Matrix src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Matrix} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Matrix malloc() {
        return new FT_Matrix(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Matrix} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Matrix calloc() {
        return new FT_Matrix(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Matrix} instance allocated with {@link BufferUtils}. */
    public static FT_Matrix create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Matrix(memAddress(container), container);
    }

    /** Returns a new {@code FT_Matrix} instance for the specified memory address. */
    public static FT_Matrix create(long address) {
        return new FT_Matrix(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Matrix createSafe(long address) {
        return address == NULL ? null : new FT_Matrix(address, null);
    }

    /**
     * Returns a new {@link FT_Matrix.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Matrix.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Matrix.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Matrix.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Matrix.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Matrix.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Matrix.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Matrix.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Matrix.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Matrix} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Matrix malloc(MemoryStack stack) {
        return new FT_Matrix(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Matrix} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Matrix calloc(MemoryStack stack) {
        return new FT_Matrix(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Matrix.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Matrix.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Matrix.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Matrix.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xx}. */
    public static long nxx(long struct) { return memGetCLong(struct + FT_Matrix.XX); }
    /** Unsafe version of {@link #xy}. */
    public static long nxy(long struct) { return memGetCLong(struct + FT_Matrix.XY); }
    /** Unsafe version of {@link #yx}. */
    public static long nyx(long struct) { return memGetCLong(struct + FT_Matrix.YX); }
    /** Unsafe version of {@link #yy}. */
    public static long nyy(long struct) { return memGetCLong(struct + FT_Matrix.YY); }

    /** Unsafe version of {@link #xx(long) xx}. */
    public static void nxx(long struct, long value) { memPutCLong(struct + FT_Matrix.XX, value); }
    /** Unsafe version of {@link #xy(long) xy}. */
    public static void nxy(long struct, long value) { memPutCLong(struct + FT_Matrix.XY, value); }
    /** Unsafe version of {@link #yx(long) yx}. */
    public static void nyx(long struct, long value) { memPutCLong(struct + FT_Matrix.YX, value); }
    /** Unsafe version of {@link #yy(long) yy}. */
    public static void nyy(long struct, long value) { memPutCLong(struct + FT_Matrix.YY, value); }

    // -----------------------------------

    /** An array of {@link FT_Matrix} structs. */
    public static class Buffer extends StructBuffer<FT_Matrix, Buffer> implements NativeResource {

        private static final FT_Matrix ELEMENT_FACTORY = FT_Matrix.create(-1L);

        /**
         * Creates a new {@code FT_Matrix.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Matrix#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Matrix getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code xx} field. */
        @NativeType("FT_Fixed")
        public long xx() { return FT_Matrix.nxx(address()); }
        /** @return the value of the {@code xy} field. */
        @NativeType("FT_Fixed")
        public long xy() { return FT_Matrix.nxy(address()); }
        /** @return the value of the {@code yx} field. */
        @NativeType("FT_Fixed")
        public long yx() { return FT_Matrix.nyx(address()); }
        /** @return the value of the {@code yy} field. */
        @NativeType("FT_Fixed")
        public long yy() { return FT_Matrix.nyy(address()); }

        /** Sets the specified value to the {@code xx} field. */
        public FT_Matrix.Buffer xx(@NativeType("FT_Fixed") long value) { FT_Matrix.nxx(address(), value); return this; }
        /** Sets the specified value to the {@code xy} field. */
        public FT_Matrix.Buffer xy(@NativeType("FT_Fixed") long value) { FT_Matrix.nxy(address(), value); return this; }
        /** Sets the specified value to the {@code yx} field. */
        public FT_Matrix.Buffer yx(@NativeType("FT_Fixed") long value) { FT_Matrix.nyx(address(), value); return this; }
        /** Sets the specified value to the {@code yy} field. */
        public FT_Matrix.Buffer yy(@NativeType("FT_Fixed") long value) { FT_Matrix.nyy(address(), value); return this; }

    }

}