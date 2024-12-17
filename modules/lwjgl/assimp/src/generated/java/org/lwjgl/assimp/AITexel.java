/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct aiTexel {
 *     unsigned char b;
 *     unsigned char g;
 *     unsigned char r;
 *     unsigned char a;
 * }}</pre>
 */
@NativeType("struct aiTexel")
public class AITexel extends Struct<AITexel> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        B,
        G,
        R,
        A;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        B = layout.offsetof(0);
        G = layout.offsetof(1);
        R = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected AITexel(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AITexel create(long address, @Nullable ByteBuffer container) {
        return new AITexel(address, container);
    }

    /**
     * Creates a {@code AITexel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AITexel(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code b} field. */
    @NativeType("unsigned char")
    public byte b() { return nb(address()); }
    /** @return the value of the {@code g} field. */
    @NativeType("unsigned char")
    public byte g() { return ng(address()); }
    /** @return the value of the {@code r} field. */
    @NativeType("unsigned char")
    public byte r() { return nr(address()); }
    /** @return the value of the {@code a} field. */
    @NativeType("unsigned char")
    public byte a() { return na(address()); }

    // -----------------------------------

    /** Returns a new {@code AITexel} instance for the specified memory address. */
    public static AITexel create(long address) {
        return new AITexel(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AITexel createSafe(long address) {
        return address == NULL ? null : new AITexel(address, null);
    }

    /**
     * Create a {@link AITexel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AITexel.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AITexel.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #b}. */
    public static byte nb(long struct) { return memGetByte(struct + AITexel.B); }
    /** Unsafe version of {@link #g}. */
    public static byte ng(long struct) { return memGetByte(struct + AITexel.G); }
    /** Unsafe version of {@link #r}. */
    public static byte nr(long struct) { return memGetByte(struct + AITexel.R); }
    /** Unsafe version of {@link #a}. */
    public static byte na(long struct) { return memGetByte(struct + AITexel.A); }

    // -----------------------------------

    /** An array of {@link AITexel} structs. */
    public static class Buffer extends StructBuffer<AITexel, Buffer> {

        private static final AITexel ELEMENT_FACTORY = AITexel.create(-1L);

        /**
         * Creates a new {@code AITexel.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AITexel#SIZEOF}, and its mark will be undefined.</p>
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
        protected AITexel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code b} field. */
        @NativeType("unsigned char")
        public byte b() { return AITexel.nb(address()); }
        /** @return the value of the {@code g} field. */
        @NativeType("unsigned char")
        public byte g() { return AITexel.ng(address()); }
        /** @return the value of the {@code r} field. */
        @NativeType("unsigned char")
        public byte r() { return AITexel.nr(address()); }
        /** @return the value of the {@code a} field. */
        @NativeType("unsigned char")
        public byte a() { return AITexel.na(address()); }

    }

}