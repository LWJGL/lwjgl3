/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.lz4.LZ4HC.LZ4_STREAMHC_MINSIZE;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union LZ4_streamHC_t {
 *     char minStateSize[LZ4_STREAMHC_MINSIZE];
 *     {@link LZ4HCCCtxInternal struct LZ4HC_CCtx_internal} internal_donotuse;
 * }</code></pre>
 */
@NativeType("union LZ4_streamHC_t")
public class LZ4StreamHC extends Struct<LZ4StreamHC> {

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
            __array(1, LZ4_STREAMHC_MINSIZE),
            __member(LZ4HCCCtxInternal.SIZEOF, LZ4HCCCtxInternal.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MINSTATESIZE = layout.offsetof(0);
        INTERNAL_DONOTUSE = layout.offsetof(1);
    }

    protected LZ4StreamHC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4StreamHC create(long address, @Nullable ByteBuffer container) {
        return new LZ4StreamHC(address, container);
    }

    /**
     * Creates a {@code LZ4StreamHC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamHC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code minStateSize} field. */
    @NativeType("char[LZ4_STREAMHC_MINSIZE]")
    public ByteBuffer minStateSize() { return nminStateSize(address()); }
    /** @return the value at the specified index of the {@code minStateSize} field. */
    @NativeType("char")
    public byte minStateSize(int index) { return nminStateSize(address(), index); }
    /** @return a {@link LZ4HCCCtxInternal} view of the {@code internal_donotuse} field. */
    @NativeType("struct LZ4HC_CCtx_internal")
    public LZ4HCCCtxInternal internal_donotuse() { return ninternal_donotuse(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4StreamHC} instance for the specified memory address. */
    public static LZ4StreamHC create(long address) {
        return new LZ4StreamHC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LZ4StreamHC createSafe(long address) {
        return address == NULL ? null : new LZ4StreamHC(address, null);
    }

    /**
     * Create a {@link LZ4StreamHC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4StreamHC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LZ4StreamHC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #minStateSize}. */
    public static ByteBuffer nminStateSize(long struct) { return memByteBuffer(struct + LZ4StreamHC.MINSTATESIZE, LZ4_STREAMHC_MINSIZE); }
    /** Unsafe version of {@link #minStateSize(int) minStateSize}. */
    public static byte nminStateSize(long struct, int index) {
        return memGetByte(struct + LZ4StreamHC.MINSTATESIZE + check(index, LZ4_STREAMHC_MINSIZE) * 1);
    }
    /** Unsafe version of {@link #internal_donotuse}. */
    public static LZ4HCCCtxInternal ninternal_donotuse(long struct) { return LZ4HCCCtxInternal.create(struct + LZ4StreamHC.INTERNAL_DONOTUSE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamHC} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamHC, Buffer> {

        private static final LZ4StreamHC ELEMENT_FACTORY = LZ4StreamHC.create(-1L);

        /**
         * Creates a new {@code LZ4StreamHC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamHC#SIZEOF}, and its mark will be undefined.</p>
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
        protected LZ4StreamHC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code minStateSize} field. */
        @NativeType("char[LZ4_STREAMHC_MINSIZE]")
        public ByteBuffer minStateSize() { return LZ4StreamHC.nminStateSize(address()); }
        /** @return the value at the specified index of the {@code minStateSize} field. */
        @NativeType("char")
        public byte minStateSize(int index) { return LZ4StreamHC.nminStateSize(address(), index); }
        /** @return a {@link LZ4HCCCtxInternal} view of the {@code internal_donotuse} field. */
        @NativeType("struct LZ4HC_CCtx_internal")
        public LZ4HCCCtxInternal internal_donotuse() { return LZ4StreamHC.ninternal_donotuse(address()); }

    }

}