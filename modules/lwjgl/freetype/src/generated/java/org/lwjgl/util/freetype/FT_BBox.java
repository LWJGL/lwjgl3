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
 * A structure used to hold an outline's bounding box, i.e., the coordinates of its extrema in the horizontal and vertical directions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_BBox {
 *     FT_Pos xMin;
 *     FT_Pos yMin;
 *     FT_Pos xMax;
 *     FT_Pos yMax;
 * }</code></pre>
 */
public class FT_BBox extends Struct<FT_BBox> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XMIN,
        YMIN,
        XMAX,
        YMAX;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XMIN = layout.offsetof(0);
        YMIN = layout.offsetof(1);
        XMAX = layout.offsetof(2);
        YMAX = layout.offsetof(3);
    }

    protected FT_BBox(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_BBox create(long address, @Nullable ByteBuffer container) {
        return new FT_BBox(address, container);
    }

    /**
     * Creates a {@code FT_BBox} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_BBox(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code xMin} field. */
    @NativeType("FT_Pos")
    public long xMin() { return nxMin(address()); }
    /** @return the value of the {@code yMin} field. */
    @NativeType("FT_Pos")
    public long yMin() { return nyMin(address()); }
    /** @return the value of the {@code xMax} field. */
    @NativeType("FT_Pos")
    public long xMax() { return nxMax(address()); }
    /** @return the value of the {@code yMax} field. */
    @NativeType("FT_Pos")
    public long yMax() { return nyMax(address()); }

    /** Sets the specified value to the {@code xMin} field. */
    public FT_BBox xMin(@NativeType("FT_Pos") long value) { nxMin(address(), value); return this; }
    /** Sets the specified value to the {@code yMin} field. */
    public FT_BBox yMin(@NativeType("FT_Pos") long value) { nyMin(address(), value); return this; }
    /** Sets the specified value to the {@code xMax} field. */
    public FT_BBox xMax(@NativeType("FT_Pos") long value) { nxMax(address(), value); return this; }
    /** Sets the specified value to the {@code yMax} field. */
    public FT_BBox yMax(@NativeType("FT_Pos") long value) { nyMax(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_BBox set(
        long xMin,
        long yMin,
        long xMax,
        long yMax
    ) {
        xMin(xMin);
        yMin(yMin);
        xMax(xMax);
        yMax(yMax);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_BBox set(FT_BBox src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_BBox} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_BBox malloc() {
        return new FT_BBox(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_BBox} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_BBox calloc() {
        return new FT_BBox(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_BBox} instance allocated with {@link BufferUtils}. */
    public static FT_BBox create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_BBox(memAddress(container), container);
    }

    /** Returns a new {@code FT_BBox} instance for the specified memory address. */
    public static FT_BBox create(long address) {
        return new FT_BBox(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_BBox createSafe(long address) {
        return address == NULL ? null : new FT_BBox(address, null);
    }

    /**
     * Returns a new {@link FT_BBox.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_BBox.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_BBox.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_BBox.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_BBox.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_BBox.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_BBox.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_BBox.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_BBox.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_BBox} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_BBox malloc(MemoryStack stack) {
        return new FT_BBox(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_BBox} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_BBox calloc(MemoryStack stack) {
        return new FT_BBox(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_BBox.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_BBox.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_BBox.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_BBox.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xMin}. */
    public static long nxMin(long struct) { return memGetCLong(struct + FT_BBox.XMIN); }
    /** Unsafe version of {@link #yMin}. */
    public static long nyMin(long struct) { return memGetCLong(struct + FT_BBox.YMIN); }
    /** Unsafe version of {@link #xMax}. */
    public static long nxMax(long struct) { return memGetCLong(struct + FT_BBox.XMAX); }
    /** Unsafe version of {@link #yMax}. */
    public static long nyMax(long struct) { return memGetCLong(struct + FT_BBox.YMAX); }

    /** Unsafe version of {@link #xMin(long) xMin}. */
    public static void nxMin(long struct, long value) { memPutCLong(struct + FT_BBox.XMIN, value); }
    /** Unsafe version of {@link #yMin(long) yMin}. */
    public static void nyMin(long struct, long value) { memPutCLong(struct + FT_BBox.YMIN, value); }
    /** Unsafe version of {@link #xMax(long) xMax}. */
    public static void nxMax(long struct, long value) { memPutCLong(struct + FT_BBox.XMAX, value); }
    /** Unsafe version of {@link #yMax(long) yMax}. */
    public static void nyMax(long struct, long value) { memPutCLong(struct + FT_BBox.YMAX, value); }

    // -----------------------------------

    /** An array of {@link FT_BBox} structs. */
    public static class Buffer extends StructBuffer<FT_BBox, Buffer> implements NativeResource {

        private static final FT_BBox ELEMENT_FACTORY = FT_BBox.create(-1L);

        /**
         * Creates a new {@code FT_BBox.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_BBox#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_BBox getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code xMin} field. */
        @NativeType("FT_Pos")
        public long xMin() { return FT_BBox.nxMin(address()); }
        /** @return the value of the {@code yMin} field. */
        @NativeType("FT_Pos")
        public long yMin() { return FT_BBox.nyMin(address()); }
        /** @return the value of the {@code xMax} field. */
        @NativeType("FT_Pos")
        public long xMax() { return FT_BBox.nxMax(address()); }
        /** @return the value of the {@code yMax} field. */
        @NativeType("FT_Pos")
        public long yMax() { return FT_BBox.nyMax(address()); }

        /** Sets the specified value to the {@code xMin} field. */
        public FT_BBox.Buffer xMin(@NativeType("FT_Pos") long value) { FT_BBox.nxMin(address(), value); return this; }
        /** Sets the specified value to the {@code yMin} field. */
        public FT_BBox.Buffer yMin(@NativeType("FT_Pos") long value) { FT_BBox.nyMin(address(), value); return this; }
        /** Sets the specified value to the {@code xMax} field. */
        public FT_BBox.Buffer xMax(@NativeType("FT_Pos") long value) { FT_BBox.nxMax(address(), value); return this; }
        /** Sets the specified value to the {@code yMax} field. */
        public FT_BBox.Buffer yMax(@NativeType("FT_Pos") long value) { FT_BBox.nyMax(address(), value); return this; }

    }

}