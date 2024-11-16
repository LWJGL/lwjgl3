/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_menu_state {
 *     float x;
 *     float y;
 *     float w;
 *     float h;
 *     {@link NkScroll struct nk_scroll} offset;
 * }</code></pre>
 */
@NativeType("struct nk_menu_state")
public class NkMenuState extends Struct<NkMenuState> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        W,
        H,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkScroll.SIZEOF, NkScroll.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
    }

    protected NkMenuState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkMenuState create(long address, @Nullable ByteBuffer container) {
        return new NkMenuState(address, container);
    }

    /**
     * Creates a {@code NkMenuState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkMenuState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    public float w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public float h() { return nh(address()); }
    /** @return a {@link NkScroll} view of the {@code offset} field. */
    @NativeType("struct nk_scroll")
    public NkScroll offset() { return noffset(address()); }

    // -----------------------------------

    /** Returns a new {@code NkMenuState} instance for the specified memory address. */
    public static NkMenuState create(long address) {
        return new NkMenuState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkMenuState createSafe(long address) {
        return address == NULL ? null : new NkMenuState(address, null);
    }

    /**
     * Create a {@link NkMenuState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkMenuState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkMenuState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + NkMenuState.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + NkMenuState.Y); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return memGetFloat(struct + NkMenuState.W); }
    /** Unsafe version of {@link #h}. */
    public static float nh(long struct) { return memGetFloat(struct + NkMenuState.H); }
    /** Unsafe version of {@link #offset}. */
    public static NkScroll noffset(long struct) { return NkScroll.create(struct + NkMenuState.OFFSET); }

    // -----------------------------------

    /** An array of {@link NkMenuState} structs. */
    public static class Buffer extends StructBuffer<NkMenuState, Buffer> {

        private static final NkMenuState ELEMENT_FACTORY = NkMenuState.create(-1L);

        /**
         * Creates a new {@code NkMenuState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkMenuState#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkMenuState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public float x() { return NkMenuState.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return NkMenuState.ny(address()); }
        /** @return the value of the {@code w} field. */
        public float w() { return NkMenuState.nw(address()); }
        /** @return the value of the {@code h} field. */
        public float h() { return NkMenuState.nh(address()); }
        /** @return a {@link NkScroll} view of the {@code offset} field. */
        @NativeType("struct nk_scroll")
        public NkScroll offset() { return NkMenuState.noffset(address()); }

    }

}