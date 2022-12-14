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
 * This structure is used to describe an outline to the scan-line converter.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Outline {
 *     short {@link #n_contours};
 *     short {@link #n_points};
 *     {@link FT_Vector FT_Vector} * {@link #points};
 *     char * {@link #tags};
 *     short * {@link #contours};
 *     int {@link #flags};
 * }</code></pre>
 */
public class FT_Outline extends Struct implements NativeResource {

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

    /** number of contours in glyph */
    public short n_contours() { return nn_contours(address()); }
    /** number of points in the glyph */
    public short n_points() { return nn_points(address()); }
    /** the outline's points */
    @NativeType("FT_Vector *")
    public FT_Vector.Buffer points() { return npoints(address()); }
    /** the points flags */
    @NativeType("char *")
    public ByteBuffer tags() { return ntags(address()); }
    /** the contour end points */
    @NativeType("short *")
    public ShortBuffer contours() { return ncontours(address()); }
    /** outline masks */
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Outline} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Outline malloc() {
        return wrap(FT_Outline.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FT_Outline} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Outline calloc() {
        return wrap(FT_Outline.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FT_Outline} instance allocated with {@link BufferUtils}. */
    public static FT_Outline create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FT_Outline.class, memAddress(container), container);
    }

    /** Returns a new {@code FT_Outline} instance for the specified memory address. */
    public static FT_Outline create(long address) {
        return wrap(FT_Outline.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Outline createSafe(long address) {
        return address == NULL ? null : wrap(FT_Outline.class, address);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FT_Outline.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Outline.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code FT_Outline} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Outline malloc(MemoryStack stack) {
        return wrap(FT_Outline.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FT_Outline} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Outline calloc(MemoryStack stack) {
        return wrap(FT_Outline.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Outline.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Outline.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #n_contours}. */
    public static short nn_contours(long struct) { return UNSAFE.getShort(null, struct + FT_Outline.N_CONTOURS); }
    /** Unsafe version of {@link #n_points}. */
    public static short nn_points(long struct) { return UNSAFE.getShort(null, struct + FT_Outline.N_POINTS); }
    /** Unsafe version of {@link #points}. */
    public static FT_Vector.Buffer npoints(long struct) { return FT_Vector.create(memGetAddress(struct + FT_Outline.POINTS), nn_points(struct)); }
    /** Unsafe version of {@link #tags() tags}. */
    public static ByteBuffer ntags(long struct) { return memByteBuffer(memGetAddress(struct + FT_Outline.TAGS), nn_points(struct)); }
    /** Unsafe version of {@link #contours() contours}. */
    public static ShortBuffer ncontours(long struct) { return memShortBuffer(memGetAddress(struct + FT_Outline.CONTOURS), nn_contours(struct)); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + FT_Outline.FLAGS); }

    // -----------------------------------

    /** An array of {@link FT_Outline} structs. */
    public static class Buffer extends StructBuffer<FT_Outline, Buffer> implements NativeResource {

        private static final FT_Outline ELEMENT_FACTORY = FT_Outline.create(-1L);

        /**
         * Creates a new {@code FT_Outline.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Outline#SIZEOF}, and its mark will be undefined.
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
        protected FT_Outline getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link FT_Outline#n_contours} field. */
        public short n_contours() { return FT_Outline.nn_contours(address()); }
        /** @return the value of the {@link FT_Outline#n_points} field. */
        public short n_points() { return FT_Outline.nn_points(address()); }
        /** @return a {@link FT_Vector.Buffer} view of the struct array pointed to by the {@link FT_Outline#points} field. */
        @NativeType("FT_Vector *")
        public FT_Vector.Buffer points() { return FT_Outline.npoints(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link FT_Outline#tags} field. */
        @NativeType("char *")
        public ByteBuffer tags() { return FT_Outline.ntags(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@link FT_Outline#contours} field. */
        @NativeType("short *")
        public ShortBuffer contours() { return FT_Outline.ncontours(address()); }
        /** @return the value of the {@link FT_Outline#flags} field. */
        public int flags() { return FT_Outline.nflags(address()); }

    }

}