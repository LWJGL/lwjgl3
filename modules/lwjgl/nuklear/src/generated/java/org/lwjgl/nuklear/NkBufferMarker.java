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
 * struct nk_buffer_marker {
 *     nk_bool active;
 *     nk_size offset;
 * }</code></pre>
 */
@NativeType("struct nk_buffer_marker")
public class NkBufferMarker extends Struct<NkBufferMarker> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACTIVE,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACTIVE = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected NkBufferMarker(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkBufferMarker create(long address, @Nullable ByteBuffer container) {
        return new NkBufferMarker(address, container);
    }

    /**
     * Creates a {@code NkBufferMarker} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkBufferMarker(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code active} field. */
    @NativeType("nk_bool")
    public boolean active() { return nactive(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("nk_size")
    public long offset() { return noffset(address()); }

    // -----------------------------------

    /** Returns a new {@code NkBufferMarker} instance for the specified memory address. */
    public static NkBufferMarker create(long address) {
        return new NkBufferMarker(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkBufferMarker createSafe(long address) {
        return address == NULL ? null : new NkBufferMarker(address, null);
    }

    /**
     * Create a {@link NkBufferMarker.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkBufferMarker.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkBufferMarker.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #active}. */
    public static boolean nactive(long struct) { return memGetByte(struct + NkBufferMarker.ACTIVE) != 0; }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + NkBufferMarker.OFFSET); }

    // -----------------------------------

    /** An array of {@link NkBufferMarker} structs. */
    public static class Buffer extends StructBuffer<NkBufferMarker, Buffer> {

        private static final NkBufferMarker ELEMENT_FACTORY = NkBufferMarker.create(-1L);

        /**
         * Creates a new {@code NkBufferMarker.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkBufferMarker#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkBufferMarker getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code active} field. */
        @NativeType("nk_bool")
        public boolean active() { return NkBufferMarker.nactive(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("nk_size")
        public long offset() { return NkBufferMarker.noffset(address()); }

    }

}