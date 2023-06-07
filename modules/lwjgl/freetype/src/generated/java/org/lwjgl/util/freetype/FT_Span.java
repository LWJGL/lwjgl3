/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure to model a single span of consecutive pixels when rendering an anti-aliased bitmap.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Span {
 *     short x;
 *     unsigned short len;
 *     unsigned char coverage;
 * }</code></pre>
 */
public class FT_Span extends Struct<FT_Span> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        LEN,
        COVERAGE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        LEN = layout.offsetof(1);
        COVERAGE = layout.offsetof(2);
    }

    protected FT_Span(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Span create(long address, @Nullable ByteBuffer container) {
        return new FT_Span(address, container);
    }

    /**
     * Creates a {@code FT_Span} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Span(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public short x() { return nx(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("unsigned short")
    public short len() { return nlen(address()); }
    /** @return the value of the {@code coverage} field. */
    @NativeType("unsigned char")
    public byte coverage() { return ncoverage(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Span} instance for the specified memory address. */
    public static FT_Span create(long address) {
        return new FT_Span(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Span createSafe(long address) {
        return address == NULL ? null : new FT_Span(address, null);
    }

    /**
     * Create a {@link FT_Span.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Span.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Span.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + FT_Span.X); }
    /** Unsafe version of {@link #len}. */
    public static short nlen(long struct) { return UNSAFE.getShort(null, struct + FT_Span.LEN); }
    /** Unsafe version of {@link #coverage}. */
    public static byte ncoverage(long struct) { return UNSAFE.getByte(null, struct + FT_Span.COVERAGE); }

    // -----------------------------------

    /** An array of {@link FT_Span} structs. */
    public static class Buffer extends StructBuffer<FT_Span, Buffer> {

        private static final FT_Span ELEMENT_FACTORY = FT_Span.create(-1L);

        /**
         * Creates a new {@code FT_Span.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Span#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Span getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public short x() { return FT_Span.nx(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("unsigned short")
        public short len() { return FT_Span.nlen(address()); }
        /** @return the value of the {@code coverage} field. */
        @NativeType("unsigned char")
        public byte coverage() { return FT_Span.ncoverage(address()); }

    }

}