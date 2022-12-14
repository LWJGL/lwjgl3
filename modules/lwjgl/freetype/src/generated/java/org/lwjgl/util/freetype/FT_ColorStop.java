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
 * A structure representing a {@code ColorStop} value of the 'COLR' v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ColorStop {
 *     FT_Fixed stop_offset;
 *     {@link FT_ColorIndex FT_ColorIndex} color;
 * }</code></pre>
 */
public class FT_ColorStop extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STOP_OFFSET,
        COLOR;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(FT_ColorIndex.SIZEOF, FT_ColorIndex.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STOP_OFFSET = layout.offsetof(0);
        COLOR = layout.offsetof(1);
    }

    /**
     * Creates a {@code FT_ColorStop} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_ColorStop(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code stop_offset} field. */
    @NativeType("FT_Fixed")
    public long stop_offset() { return nstop_offset(address()); }
    /** @return a {@link FT_ColorIndex} view of the {@code color} field. */
    public FT_ColorIndex color() { return ncolor(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_ColorStop} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_ColorStop malloc() {
        return wrap(FT_ColorStop.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FT_ColorStop} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_ColorStop calloc() {
        return wrap(FT_ColorStop.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FT_ColorStop} instance allocated with {@link BufferUtils}. */
    public static FT_ColorStop create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FT_ColorStop.class, memAddress(container), container);
    }

    /** Returns a new {@code FT_ColorStop} instance for the specified memory address. */
    public static FT_ColorStop create(long address) {
        return wrap(FT_ColorStop.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorStop createSafe(long address) {
        return address == NULL ? null : wrap(FT_ColorStop.class, address);
    }

    /**
     * Returns a new {@link FT_ColorStop.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ColorStop.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_ColorStop.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ColorStop.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_ColorStop.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ColorStop.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FT_ColorStop.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_ColorStop.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorStop.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code FT_ColorStop} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_ColorStop malloc(MemoryStack stack) {
        return wrap(FT_ColorStop.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FT_ColorStop} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_ColorStop calloc(MemoryStack stack) {
        return wrap(FT_ColorStop.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FT_ColorStop.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_ColorStop.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_ColorStop.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_ColorStop.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stop_offset}. */
    public static long nstop_offset(long struct) { return memGetCLong(struct + FT_ColorStop.STOP_OFFSET); }
    /** Unsafe version of {@link #color}. */
    public static FT_ColorIndex ncolor(long struct) { return FT_ColorIndex.create(struct + FT_ColorStop.COLOR); }

    // -----------------------------------

    /** An array of {@link FT_ColorStop} structs. */
    public static class Buffer extends StructBuffer<FT_ColorStop, Buffer> implements NativeResource {

        private static final FT_ColorStop ELEMENT_FACTORY = FT_ColorStop.create(-1L);

        /**
         * Creates a new {@code FT_ColorStop.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_ColorStop#SIZEOF}, and its mark will be undefined.
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
        protected FT_ColorStop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code stop_offset} field. */
        @NativeType("FT_Fixed")
        public long stop_offset() { return FT_ColorStop.nstop_offset(address()); }
        /** @return a {@link FT_ColorIndex} view of the {@code color} field. */
        public FT_ColorIndex color() { return FT_ColorStop.ncolor(address()); }

    }

}