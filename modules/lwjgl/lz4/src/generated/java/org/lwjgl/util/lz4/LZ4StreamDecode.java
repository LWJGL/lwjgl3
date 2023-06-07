/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.lz4.LZ4.LZ4_STREAMDECODE_MINSIZE;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union LZ4_streamDecode_t {
 *     char minStateSize[LZ4_STREAMDECODE_MINSIZE];
 *     {@link LZ4StreamDecodeInternal LZ4_streamDecode_t_internal} internal_donotuse;
 * }</code></pre>
 */
@NativeType("union LZ4_streamDecode_t")
public class LZ4StreamDecode extends Struct<LZ4StreamDecode> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MINSTATESIZE,
        INTERNAL_DONOTUSE;

    static {
        Layout layout = __union(
            __array(1, LZ4_STREAMDECODE_MINSIZE),
            __member(LZ4StreamDecodeInternal.SIZEOF, LZ4StreamDecodeInternal.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MINSTATESIZE = layout.offsetof(0);
        INTERNAL_DONOTUSE = layout.offsetof(1);
    }

    protected LZ4StreamDecode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4StreamDecode create(long address, @Nullable ByteBuffer container) {
        return new LZ4StreamDecode(address, container);
    }

    /**
     * Creates a {@code LZ4StreamDecode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamDecode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code minStateSize} field. */
    @NativeType("char[LZ4_STREAMDECODE_MINSIZE]")
    public ByteBuffer minStateSize() { return nminStateSize(address()); }
    /** @return the value at the specified index of the {@code minStateSize} field. */
    @NativeType("char")
    public byte minStateSize(int index) { return nminStateSize(address(), index); }
    /** @return a {@link LZ4StreamDecodeInternal} view of the {@code internal_donotuse} field. */
    @NativeType("LZ4_streamDecode_t_internal")
    public LZ4StreamDecodeInternal internal_donotuse() { return ninternal_donotuse(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4StreamDecode} instance for the specified memory address. */
    public static LZ4StreamDecode create(long address) {
        return new LZ4StreamDecode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamDecode createSafe(long address) {
        return address == NULL ? null : new LZ4StreamDecode(address, null);
    }

    /**
     * Create a {@link LZ4StreamDecode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4StreamDecode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamDecode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #minStateSize}. */
    public static ByteBuffer nminStateSize(long struct) { return memByteBuffer(struct + LZ4StreamDecode.MINSTATESIZE, LZ4_STREAMDECODE_MINSIZE); }
    /** Unsafe version of {@link #minStateSize(int) minStateSize}. */
    public static byte nminStateSize(long struct, int index) {
        return UNSAFE.getByte(null, struct + LZ4StreamDecode.MINSTATESIZE + check(index, LZ4_STREAMDECODE_MINSIZE) * 1);
    }
    /** Unsafe version of {@link #internal_donotuse}. */
    public static LZ4StreamDecodeInternal ninternal_donotuse(long struct) { return LZ4StreamDecodeInternal.create(struct + LZ4StreamDecode.INTERNAL_DONOTUSE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamDecode} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamDecode, Buffer> {

        private static final LZ4StreamDecode ELEMENT_FACTORY = LZ4StreamDecode.create(-1L);

        /**
         * Creates a new {@code LZ4StreamDecode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamDecode#SIZEOF}, and its mark will be undefined.</p>
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
        protected LZ4StreamDecode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code minStateSize} field. */
        @NativeType("char[LZ4_STREAMDECODE_MINSIZE]")
        public ByteBuffer minStateSize() { return LZ4StreamDecode.nminStateSize(address()); }
        /** @return the value at the specified index of the {@code minStateSize} field. */
        @NativeType("char")
        public byte minStateSize(int index) { return LZ4StreamDecode.nminStateSize(address(), index); }
        /** @return a {@link LZ4StreamDecodeInternal} view of the {@code internal_donotuse} field. */
        @NativeType("LZ4_streamDecode_t_internal")
        public LZ4StreamDecodeInternal internal_donotuse() { return LZ4StreamDecode.ninternal_donotuse(address()); }

    }

}