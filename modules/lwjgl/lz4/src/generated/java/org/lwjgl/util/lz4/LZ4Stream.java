/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.lz4.LZ4.LZ4_STREAMSIZE_VOIDP;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union LZ4_stream_t {
 *     void * table[LZ4_STREAMSIZE_VOIDP];
 *     {@link LZ4StreamInternal struct LZ4_stream_t_internal} internal_donotuse;
 * }</code></pre>
 */
@NativeType("union LZ4_stream_t")
public class LZ4Stream extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TABLE,
        INTERNAL_DONOTUSE;

    static {
        Layout layout = __union(
            __array(POINTER_SIZE, LZ4_STREAMSIZE_VOIDP),
            __member(LZ4StreamInternal.SIZEOF, LZ4StreamInternal.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TABLE = layout.offsetof(0);
        INTERNAL_DONOTUSE = layout.offsetof(1);
    }

    /**
     * Creates a {@code LZ4Stream} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4Stream(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the {@code table} field. */
    @NativeType("void *[LZ4_STREAMSIZE_VOIDP]")
    public PointerBuffer table() { return ntable(address()); }
    /** @return the value at the specified index of the {@code table} field. */
    @NativeType("void *")
    public long table(int index) { return ntable(address(), index); }
    /** @return a {@link LZ4StreamInternal} view of the {@code internal_donotuse} field. */
    @NativeType("struct LZ4_stream_t_internal")
    public LZ4StreamInternal internal_donotuse() { return ninternal_donotuse(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4Stream} instance for the specified memory address. */
    public static LZ4Stream create(long address) {
        return wrap(LZ4Stream.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4Stream createSafe(long address) {
        return address == NULL ? null : wrap(LZ4Stream.class, address);
    }

    /**
     * Create a {@link LZ4Stream.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4Stream.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4Stream.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #table}. */
    public static PointerBuffer ntable(long struct) { return memPointerBuffer(struct + LZ4Stream.TABLE, LZ4_STREAMSIZE_VOIDP); }
    /** Unsafe version of {@link #table(int) table}. */
    public static long ntable(long struct, int index) {
        return memGetAddress(struct + LZ4Stream.TABLE + check(index, LZ4_STREAMSIZE_VOIDP) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #internal_donotuse}. */
    public static LZ4StreamInternal ninternal_donotuse(long struct) { return LZ4StreamInternal.create(struct + LZ4Stream.INTERNAL_DONOTUSE); }

    // -----------------------------------

    /** An array of {@link LZ4Stream} structs. */
    public static class Buffer extends StructBuffer<LZ4Stream, Buffer> {

        private static final LZ4Stream ELEMENT_FACTORY = LZ4Stream.create(-1L);

        /**
         * Creates a new {@code LZ4Stream.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4Stream#SIZEOF}, and its mark will be undefined.
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
        protected LZ4Stream getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the {@code table} field. */
        @NativeType("void *[LZ4_STREAMSIZE_VOIDP]")
        public PointerBuffer table() { return LZ4Stream.ntable(address()); }
        /** @return the value at the specified index of the {@code table} field. */
        @NativeType("void *")
        public long table(int index) { return LZ4Stream.ntable(address(), index); }
        /** @return a {@link LZ4StreamInternal} view of the {@code internal_donotuse} field. */
        @NativeType("struct LZ4_stream_t_internal")
        public LZ4StreamInternal internal_donotuse() { return LZ4Stream.ninternal_donotuse(address()); }

    }

}