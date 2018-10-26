/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meow;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meow_u128 {
 *     meow_u64 hi;
 *     meow_u64 lo;
 * }</code></pre>
 */
@NativeType("struct meow_u128")
public class MeowU128 extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HI,
        LO;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, 16,
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HI = layout.offsetof(0);
        LO = layout.offsetof(1);
    }

    /**
     * Creates a {@link MeowU128} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeowU128(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@link MeowU128} instance for the specified memory address. */
    public static MeowU128 create(long address) {
        return wrap(MeowU128.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowU128 createSafe(long address) {
        return address == NULL ? null : wrap(MeowU128.class, address);
    }

    /**
     * Create a {@link MeowU128.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeowU128.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowU128.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    public static long nhi(long struct) { return UNSAFE.getLong(null, struct + MeowU128.HI); }
    public static long nlo(long struct) { return UNSAFE.getLong(null, struct + MeowU128.LO); }

    // -----------------------------------

    /** An array of {@link MeowU128} structs. */
    public static class Buffer extends StructBuffer<MeowU128, Buffer> {

        private static final MeowU128 ELEMENT_FACTORY = MeowU128.create(-1L);

        /**
         * Creates a new {@link MeowU128.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeowU128#SIZEOF}, and its mark will be undefined.
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
        protected MeowU128 getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}