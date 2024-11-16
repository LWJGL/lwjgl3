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
 * struct nk_memory {
 *     void * ptr;
 *     nk_size size;
 * }</code></pre>
 */
@NativeType("struct nk_memory")
public class NkMemory extends Struct<NkMemory> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PTR,
        SIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PTR = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    protected NkMemory(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkMemory create(long address, @Nullable ByteBuffer container) {
        return new NkMemory(address, container);
    }

    /**
     * Creates a {@code NkMemory} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkMemory(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code ptr} field. */
    @NativeType("void *")
    public @Nullable ByteBuffer ptr() { return nptr(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("nk_size")
    public long size() { return nsize(address()); }

    // -----------------------------------

    /** Returns a new {@code NkMemory} instance for the specified memory address. */
    public static NkMemory create(long address) {
        return new NkMemory(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkMemory createSafe(long address) {
        return address == NULL ? null : new NkMemory(address, null);
    }

    /**
     * Create a {@link NkMemory.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkMemory.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkMemory.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ptr() ptr}. */
    public static @Nullable ByteBuffer nptr(long struct) { return memByteBufferSafe(memGetAddress(struct + NkMemory.PTR), (int)nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + NkMemory.SIZE); }

    // -----------------------------------

    /** An array of {@link NkMemory} structs. */
    public static class Buffer extends StructBuffer<NkMemory, Buffer> {

        private static final NkMemory ELEMENT_FACTORY = NkMemory.create(-1L);

        /**
         * Creates a new {@code NkMemory.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkMemory#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkMemory getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code ptr} field. */
        @NativeType("void *")
        public @Nullable ByteBuffer ptr() { return NkMemory.nptr(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("nk_size")
        public long size() { return NkMemory.nsize(address()); }

    }

}