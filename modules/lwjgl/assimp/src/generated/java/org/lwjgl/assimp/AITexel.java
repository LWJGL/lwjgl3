/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Helper structure to represent a texel in a ARGB8888 format. Used by aiTexture.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiTexel {
 *     unsigned char {@link #b};
 *     unsigned char {@link #g};
 *     unsigned char {@link #r};
 *     unsigned char {@link #a};
 * }</code></pre>
 */
@NativeType("struct aiTexel")
public class AITexel extends Struct {

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

    /** The blue color component */
    @NativeType("unsigned char")
    public byte b() { return nb(address()); }
    /** The green color component */
    @NativeType("unsigned char")
    public byte g() { return ng(address()); }
    /** The red color component */
    @NativeType("unsigned char")
    public byte r() { return nr(address()); }
    /** The alpha color component */
    @NativeType("unsigned char")
    public byte a() { return na(address()); }

    // -----------------------------------

    /** Returns a new {@code AITexel} instance for the specified memory address. */
    public static AITexel create(long address) {
        return wrap(AITexel.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AITexel createSafe(long address) {
        return address == NULL ? null : wrap(AITexel.class, address);
    }

    /**
     * Create a {@link AITexel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AITexel.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AITexel.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #b}. */
    public static byte nb(long struct) { return UNSAFE.getByte(null, struct + AITexel.B); }
    /** Unsafe version of {@link #g}. */
    public static byte ng(long struct) { return UNSAFE.getByte(null, struct + AITexel.G); }
    /** Unsafe version of {@link #r}. */
    public static byte nr(long struct) { return UNSAFE.getByte(null, struct + AITexel.R); }
    /** Unsafe version of {@link #a}. */
    public static byte na(long struct) { return UNSAFE.getByte(null, struct + AITexel.A); }

    // -----------------------------------

    /** An array of {@link AITexel} structs. */
    public static class Buffer extends StructBuffer<AITexel, Buffer> {

        private static final AITexel ELEMENT_FACTORY = AITexel.create(-1L);

        /**
         * Creates a new {@code AITexel.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AITexel#SIZEOF}, and its mark will be undefined.
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
        protected AITexel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AITexel#b} field. */
        @NativeType("unsigned char")
        public byte b() { return AITexel.nb(address()); }
        /** @return the value of the {@link AITexel#g} field. */
        @NativeType("unsigned char")
        public byte g() { return AITexel.ng(address()); }
        /** @return the value of the {@link AITexel#r} field. */
        @NativeType("unsigned char")
        public byte r() { return AITexel.nr(address()); }
        /** @return the value of the {@link AITexel#a} field. */
        @NativeType("unsigned char")
        public byte a() { return AITexel.na(address()); }

    }

}