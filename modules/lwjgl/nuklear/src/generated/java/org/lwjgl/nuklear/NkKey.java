/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_key {
 *     nk_bool down;
 *     unsigned int clicked;
 * }</code></pre>
 */
@NativeType("struct nk_key")
public class NkKey extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DOWN,
        CLICKED;

    static {
        Layout layout = __struct(
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DOWN = layout.offsetof(0);
        CLICKED = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkKey} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkKey(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code down} field. */
    @NativeType("nk_bool")
    public boolean down() { return ndown(address()); }
    /** @return the value of the {@code clicked} field. */
    @NativeType("unsigned int")
    public int clicked() { return nclicked(address()); }

    // -----------------------------------

    /** Returns a new {@code NkKey} instance for the specified memory address. */
    public static NkKey create(long address) {
        return wrap(NkKey.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkKey createSafe(long address) {
        return address == NULL ? null : wrap(NkKey.class, address);
    }

    /**
     * Create a {@link NkKey.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkKey.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkKey.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return UNSAFE.getByte(null, struct + NkKey.DOWN) != 0; }
    /** Unsafe version of {@link #clicked}. */
    public static int nclicked(long struct) { return UNSAFE.getInt(null, struct + NkKey.CLICKED); }

    // -----------------------------------

    /** An array of {@link NkKey} structs. */
    public static class Buffer extends StructBuffer<NkKey, Buffer> {

        private static final NkKey ELEMENT_FACTORY = NkKey.create(-1L);

        /**
         * Creates a new {@code NkKey.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkKey#SIZEOF}, and its mark will be undefined.
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
        protected NkKey getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code down} field. */
        @NativeType("nk_bool")
        public boolean down() { return NkKey.ndown(address()); }
        /** @return the value of the {@code clicked} field. */
        @NativeType("unsigned int")
        public int clicked() { return NkKey.nclicked(address()); }

    }

}