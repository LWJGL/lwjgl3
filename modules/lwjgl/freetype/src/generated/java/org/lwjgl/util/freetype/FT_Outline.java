/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct FT_Outline {
 *     unsigned short n_contours;
 *     unsigned short n_points;
 *     {@link FT_Vector FT_Vector} * points;
 *     unsigned char * tags;
 *     unsigned short * contours;
 *     int flags;
 * }}</pre>
 */
public class FT_Outline extends Struct<FT_Outline> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        N_CONTOURS,
        N_POINTS,
        POINTS,
        TAGS,
        CONTOURS,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        N_CONTOURS = layout.offsetof(0);
        N_POINTS = layout.offsetof(1);
        POINTS = layout.offsetof(2);
        TAGS = layout.offsetof(3);
        CONTOURS = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected FT_Outline(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Outline create(long address, @Nullable ByteBuffer container) {
        return new FT_Outline(address, container);
    }

    /**
     * Creates a {@code FT_Outline} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Outline(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code n_contours} field. */
    @NativeType("unsigned short")
    public short n_contours() { return nn_contours(address()); }
    /** @return the value of the {@code n_points} field. */
    @NativeType("unsigned short")
    public short n_points() { return nn_points(address()); }
    /** @return a {@link FT_Vector.Buffer} view of the struct array pointed to by the {@code points} field. */
    @NativeType("FT_Vector *")
    public FT_Vector.Buffer points() { return npoints(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code tags} field. */
    @NativeType("unsigned char *")
    public ByteBuffer tags() { return ntags(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code contours} field. */
    @NativeType("unsigned short *")
    public ShortBuffer contours() { return ncontours(address()); }
    /** @return the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Outline} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Outline malloc() {
        return new FT_Outline(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Outline} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Outline calloc() {
        return new FT_Outline(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Outline} instance allocated with {@link BufferUtils}. */
    public static FT_Outline create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Outline(memAddress(container), container);
    }

    /** Returns a new {@code FT_Outline} instance for the specified memory address. */
    public static FT_Outline create(long address) {
        return new FT_Outline(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FT_Outline createSafe(long address) {
        return address == NULL ? null : new FT_Outline(address, null);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Outline.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FT_Outline.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Outline} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Outline malloc(MemoryStack stack) {
        return new FT_Outline(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Outline} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Outline calloc(MemoryStack stack) {
        return new FT_Outline(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #n_contours}. */
    public static short nn_contours(long struct) { return memGetShort(struct + FT_Outline.N_CONTOURS); }
    /** Unsafe version of {@link #n_points}. */
    public static short nn_points(long struct) { return memGetShort(struct + FT_Outline.N_POINTS); }
    /** Unsafe version of {@link #points}. */
    public static FT_Vector.Buffer npoints(long struct) { return FT_Vector.create(memGetAddress(struct + FT_Outline.POINTS), Short.toUnsignedInt(nn_points(struct))); }
    /** Unsafe version of {@link #tags() tags}. */
    public static ByteBuffer ntags(long struct) { return memByteBuffer(memGetAddress(struct + FT_Outline.TAGS), Short.toUnsignedInt(nn_points(struct))); }
    /** Unsafe version of {@link #contours() contours}. */
    public static ShortBuffer ncontours(long struct) { return memShortBuffer(memGetAddress(struct + FT_Outline.CONTOURS), Short.toUnsignedInt(nn_contours(struct))); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + FT_Outline.FLAGS); }

    // -----------------------------------

    /** An array of {@link FT_Outline} structs. */
    public static class Buffer extends StructBuffer<FT_Outline, Buffer> implements NativeResource {

        private static final FT_Outline ELEMENT_FACTORY = FT_Outline.create(-1L);

        /**
         * Creates a new {@code FT_Outline.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Outline#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Outline getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code n_contours} field. */
        @NativeType("unsigned short")
        public short n_contours() { return FT_Outline.nn_contours(address()); }
        /** @return the value of the {@code n_points} field. */
        @NativeType("unsigned short")
        public short n_points() { return FT_Outline.nn_points(address()); }
        /** @return a {@link FT_Vector.Buffer} view of the struct array pointed to by the {@code points} field. */
        @NativeType("FT_Vector *")
        public FT_Vector.Buffer points() { return FT_Outline.npoints(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code tags} field. */
        @NativeType("unsigned char *")
        public ByteBuffer tags() { return FT_Outline.ntags(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code contours} field. */
        @NativeType("unsigned short *")
        public ShortBuffer contours() { return FT_Outline.ncontours(address()); }
        /** @return the value of the {@code flags} field. */
        public int flags() { return FT_Outline.nflags(address()); }

    }

}