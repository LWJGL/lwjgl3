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
 * This iterator object is needed for {@link FreeType#FT_Get_Colorline_Stops Get_Colorline_Stops}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ColorStopIterator {
 *     FT_UInt num_color_stops;
 *     FT_UInt current_color_stop;
 *     FT_Byte * p;
 *     FT_Bool read_variable;
 * }</code></pre>
 */
public class FT_ColorStopIterator extends Struct<FT_ColorStopIterator> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_COLOR_STOPS,
        CURRENT_COLOR_STOP,
        P,
        READ_VARIABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_COLOR_STOPS = layout.offsetof(0);
        CURRENT_COLOR_STOP = layout.offsetof(1);
        P = layout.offsetof(2);
        READ_VARIABLE = layout.offsetof(3);
    }

    protected FT_ColorStopIterator(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_ColorStopIterator create(long address, @Nullable ByteBuffer container) {
        return new FT_ColorStopIterator(address, container);
    }

    /**
     * Creates a {@code FT_ColorStopIterator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_ColorStopIterator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_color_stops} field. */
    @NativeType("FT_UInt")
    public int num_color_stops() { return nnum_color_stops(address()); }
    /** @return the value of the {@code current_color_stop} field. */
    @NativeType("FT_UInt")
    public int current_color_stop() { return ncurrent_color_stop(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code p} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("FT_Byte *")
    public ByteBuffer p(int capacity) { return np(address(), capacity); }
    /** @return the value of the {@code read_variable} field. */
    @NativeType("FT_Bool")
    public boolean read_variable() { return nread_variable(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_ColorStopIterator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_ColorStopIterator malloc() {
        return new FT_ColorStopIterator(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_ColorStopIterator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_ColorStopIterator calloc() {
        return new FT_ColorStopIterator(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_ColorStopIterator} instance allocated with {@link BufferUtils}. */
    public static FT_ColorStopIterator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_ColorStopIterator(memAddress(container), container);
    }

    /** Returns a new {@code FT_ColorStopIterator} instance for the specified memory address. */
    public static FT_ColorStopIterator create(long address) {
        return new FT_ColorStopIterator(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorStopIterator createSafe(long address) {
        return address == NULL ? null : new FT_ColorStopIterator(address, null);
    }

    /**
     * Returns a new {@link FT_ColorStopIterator.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ColorStopIterator.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_ColorStopIterator.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ColorStopIterator.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_ColorStopIterator.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ColorStopIterator.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_ColorStopIterator.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_ColorStopIterator.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorStopIterator.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_ColorStopIterator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_ColorStopIterator malloc(MemoryStack stack) {
        return new FT_ColorStopIterator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_ColorStopIterator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_ColorStopIterator calloc(MemoryStack stack) {
        return new FT_ColorStopIterator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_ColorStopIterator.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_ColorStopIterator.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_ColorStopIterator.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_ColorStopIterator.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_color_stops}. */
    public static int nnum_color_stops(long struct) { return UNSAFE.getInt(null, struct + FT_ColorStopIterator.NUM_COLOR_STOPS); }
    /** Unsafe version of {@link #current_color_stop}. */
    public static int ncurrent_color_stop(long struct) { return UNSAFE.getInt(null, struct + FT_ColorStopIterator.CURRENT_COLOR_STOP); }
    /** Unsafe version of {@link #p(int) p}. */
    @Nullable public static ByteBuffer np(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_ColorStopIterator.P), capacity); }
    /** Unsafe version of {@link #read_variable}. */
    public static boolean nread_variable(long struct) { return UNSAFE.getByte(null, struct + FT_ColorStopIterator.READ_VARIABLE) != 0; }

    // -----------------------------------

    /** An array of {@link FT_ColorStopIterator} structs. */
    public static class Buffer extends StructBuffer<FT_ColorStopIterator, Buffer> implements NativeResource {

        private static final FT_ColorStopIterator ELEMENT_FACTORY = FT_ColorStopIterator.create(-1L);

        /**
         * Creates a new {@code FT_ColorStopIterator.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_ColorStopIterator#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_ColorStopIterator getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_color_stops} field. */
        @NativeType("FT_UInt")
        public int num_color_stops() { return FT_ColorStopIterator.nnum_color_stops(address()); }
        /** @return the value of the {@code current_color_stop} field. */
        @NativeType("FT_UInt")
        public int current_color_stop() { return FT_ColorStopIterator.ncurrent_color_stop(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code p} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("FT_Byte *")
        public ByteBuffer p(int capacity) { return FT_ColorStopIterator.np(address(), capacity); }
        /** @return the value of the {@code read_variable} field. */
        @NativeType("FT_Bool")
        public boolean read_variable() { return FT_ColorStopIterator.nread_variable(address()); }

    }

}