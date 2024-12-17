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

import static org.lwjgl.util.lz4.LZ4HC.*;

/**
 * <pre>{@code
 * struct LZ4HC_CCtx_internal {
 *     LZ4_u32 hashTable[LZ4HC_HASHTABLESIZE];
 *     LZ4_u16 chainTable[LZ4HC_MAXD];
 *     LZ4_byte const * end;
 *     LZ4_byte const * prefixStart;
 *     LZ4_byte const * dictStart;
 *     LZ4_u32 dictLimit;
 *     LZ4_u32 lowLimit;
 *     LZ4_u32 nextToUpdate;
 *     short compressionLevel;
 *     LZ4_i8 favorDecSpeed;
 *     LZ4_i8 dirty;
 *     {@link LZ4HCCCtxInternal LZ4HC_CCtx_internal} * const dictCtx;
 * }}</pre>
 */
@NativeType("struct LZ4HC_CCtx_internal")
public class LZ4HCCCtxInternal extends Struct<LZ4HCCCtxInternal> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASHTABLE,
        CHAINTABLE,
        END,
        PREFIXSTART,
        DICTSTART,
        DICTLIMIT,
        LOWLIMIT,
        NEXTTOUPDATE,
        COMPRESSIONLEVEL,
        FAVORDECSPEED,
        DIRTY,
        DICTCTX;

    static {
        Layout layout = __struct(
            __array(4, LZ4HC_HASHTABLESIZE),
            __array(2, LZ4HC_MAXD),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(1),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HASHTABLE = layout.offsetof(0);
        CHAINTABLE = layout.offsetof(1);
        END = layout.offsetof(2);
        PREFIXSTART = layout.offsetof(3);
        DICTSTART = layout.offsetof(4);
        DICTLIMIT = layout.offsetof(5);
        LOWLIMIT = layout.offsetof(6);
        NEXTTOUPDATE = layout.offsetof(7);
        COMPRESSIONLEVEL = layout.offsetof(8);
        FAVORDECSPEED = layout.offsetof(9);
        DIRTY = layout.offsetof(10);
        DICTCTX = layout.offsetof(11);
    }

    protected LZ4HCCCtxInternal(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4HCCCtxInternal create(long address, @Nullable ByteBuffer container) {
        return new LZ4HCCCtxInternal(address, container);
    }

    /**
     * Creates a {@code LZ4HCCCtxInternal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4HCCCtxInternal(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code hashTable} field. */
    @NativeType("LZ4_u32[LZ4HC_HASHTABLESIZE]")
    public IntBuffer hashTable() { return nhashTable(address()); }
    /** @return the value at the specified index of the {@code hashTable} field. */
    @NativeType("LZ4_u32")
    public int hashTable(int index) { return nhashTable(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code chainTable} field. */
    @NativeType("LZ4_u16[LZ4HC_MAXD]")
    public ShortBuffer chainTable() { return nchainTable(address()); }
    /** @return the value at the specified index of the {@code chainTable} field. */
    @NativeType("LZ4_u16")
    public short chainTable(int index) { return nchainTable(address(), index); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code end} field. */
    @NativeType("LZ4_byte const *")
    public ByteBuffer end(int capacity) { return nend(address(), capacity); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code prefixStart} field. */
    @NativeType("LZ4_byte const *")
    public ByteBuffer prefixStart(int capacity) { return nprefixStart(address(), capacity); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code dictStart} field. */
    @NativeType("LZ4_byte const *")
    public ByteBuffer dictStart(int capacity) { return ndictStart(address(), capacity); }
    /** @return the value of the {@code dictLimit} field. */
    @NativeType("LZ4_u32")
    public int dictLimit() { return ndictLimit(address()); }
    /** @return the value of the {@code lowLimit} field. */
    @NativeType("LZ4_u32")
    public int lowLimit() { return nlowLimit(address()); }
    /** @return the value of the {@code nextToUpdate} field. */
    @NativeType("LZ4_u32")
    public int nextToUpdate() { return nnextToUpdate(address()); }
    /** @return the value of the {@code compressionLevel} field. */
    public short compressionLevel() { return ncompressionLevel(address()); }
    /** @return the value of the {@code favorDecSpeed} field. */
    @NativeType("LZ4_i8")
    public byte favorDecSpeed() { return nfavorDecSpeed(address()); }
    /** @return the value of the {@code dirty} field. */
    @NativeType("LZ4_i8")
    public byte dirty() { return ndirty(address()); }
    /** @return a {@link LZ4HCCCtxInternal} view of the struct pointed to by the {@code dictCtx} field. */
    @NativeType("LZ4HC_CCtx_internal * const")
    public LZ4HCCCtxInternal dictCtx() { return ndictCtx(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4HCCCtxInternal} instance for the specified memory address. */
    public static LZ4HCCCtxInternal create(long address) {
        return new LZ4HCCCtxInternal(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LZ4HCCCtxInternal createSafe(long address) {
        return address == NULL ? null : new LZ4HCCCtxInternal(address, null);
    }

    /**
     * Create a {@link LZ4HCCCtxInternal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4HCCCtxInternal.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LZ4HCCCtxInternal.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hashTable}. */
    public static IntBuffer nhashTable(long struct) { return memIntBuffer(struct + LZ4HCCCtxInternal.HASHTABLE, LZ4HC_HASHTABLESIZE); }
    /** Unsafe version of {@link #hashTable(int) hashTable}. */
    public static int nhashTable(long struct, int index) {
        return memGetInt(struct + LZ4HCCCtxInternal.HASHTABLE + check(index, LZ4HC_HASHTABLESIZE) * 4);
    }
    /** Unsafe version of {@link #chainTable}. */
    public static ShortBuffer nchainTable(long struct) { return memShortBuffer(struct + LZ4HCCCtxInternal.CHAINTABLE, LZ4HC_MAXD); }
    /** Unsafe version of {@link #chainTable(int) chainTable}. */
    public static short nchainTable(long struct, int index) {
        return memGetShort(struct + LZ4HCCCtxInternal.CHAINTABLE + check(index, LZ4HC_MAXD) * 2);
    }
    /** Unsafe version of {@link #end(int) end}. */
    public static ByteBuffer nend(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.END), capacity); }
    /** Unsafe version of {@link #prefixStart(int) prefixStart}. */
    public static ByteBuffer nprefixStart(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.PREFIXSTART), capacity); }
    /** Unsafe version of {@link #dictStart(int) dictStart}. */
    public static ByteBuffer ndictStart(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.DICTSTART), capacity); }
    /** Unsafe version of {@link #dictLimit}. */
    public static int ndictLimit(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.DICTLIMIT); }
    /** Unsafe version of {@link #lowLimit}. */
    public static int nlowLimit(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.LOWLIMIT); }
    /** Unsafe version of {@link #nextToUpdate}. */
    public static int nnextToUpdate(long struct) { return memGetInt(struct + LZ4HCCCtxInternal.NEXTTOUPDATE); }
    /** Unsafe version of {@link #compressionLevel}. */
    public static short ncompressionLevel(long struct) { return memGetShort(struct + LZ4HCCCtxInternal.COMPRESSIONLEVEL); }
    /** Unsafe version of {@link #favorDecSpeed}. */
    public static byte nfavorDecSpeed(long struct) { return memGetByte(struct + LZ4HCCCtxInternal.FAVORDECSPEED); }
    /** Unsafe version of {@link #dirty}. */
    public static byte ndirty(long struct) { return memGetByte(struct + LZ4HCCCtxInternal.DIRTY); }
    /** Unsafe version of {@link #dictCtx}. */
    public static LZ4HCCCtxInternal ndictCtx(long struct) { return LZ4HCCCtxInternal.create(memGetAddress(struct + LZ4HCCCtxInternal.DICTCTX)); }

    // -----------------------------------

    /** An array of {@link LZ4HCCCtxInternal} structs. */
    public static class Buffer extends StructBuffer<LZ4HCCCtxInternal, Buffer> {

        private static final LZ4HCCCtxInternal ELEMENT_FACTORY = LZ4HCCCtxInternal.create(-1L);

        /**
         * Creates a new {@code LZ4HCCCtxInternal.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4HCCCtxInternal#SIZEOF}, and its mark will be undefined.</p>
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
        protected LZ4HCCCtxInternal getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code hashTable} field. */
        @NativeType("LZ4_u32[LZ4HC_HASHTABLESIZE]")
        public IntBuffer hashTable() { return LZ4HCCCtxInternal.nhashTable(address()); }
        /** @return the value at the specified index of the {@code hashTable} field. */
        @NativeType("LZ4_u32")
        public int hashTable(int index) { return LZ4HCCCtxInternal.nhashTable(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code chainTable} field. */
        @NativeType("LZ4_u16[LZ4HC_MAXD]")
        public ShortBuffer chainTable() { return LZ4HCCCtxInternal.nchainTable(address()); }
        /** @return the value at the specified index of the {@code chainTable} field. */
        @NativeType("LZ4_u16")
        public short chainTable(int index) { return LZ4HCCCtxInternal.nchainTable(address(), index); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code end} field. */
        @NativeType("LZ4_byte const *")
        public ByteBuffer end(int capacity) { return LZ4HCCCtxInternal.nend(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code prefixStart} field. */
        @NativeType("LZ4_byte const *")
        public ByteBuffer prefixStart(int capacity) { return LZ4HCCCtxInternal.nprefixStart(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code dictStart} field. */
        @NativeType("LZ4_byte const *")
        public ByteBuffer dictStart(int capacity) { return LZ4HCCCtxInternal.ndictStart(address(), capacity); }
        /** @return the value of the {@code dictLimit} field. */
        @NativeType("LZ4_u32")
        public int dictLimit() { return LZ4HCCCtxInternal.ndictLimit(address()); }
        /** @return the value of the {@code lowLimit} field. */
        @NativeType("LZ4_u32")
        public int lowLimit() { return LZ4HCCCtxInternal.nlowLimit(address()); }
        /** @return the value of the {@code nextToUpdate} field. */
        @NativeType("LZ4_u32")
        public int nextToUpdate() { return LZ4HCCCtxInternal.nnextToUpdate(address()); }
        /** @return the value of the {@code compressionLevel} field. */
        public short compressionLevel() { return LZ4HCCCtxInternal.ncompressionLevel(address()); }
        /** @return the value of the {@code favorDecSpeed} field. */
        @NativeType("LZ4_i8")
        public byte favorDecSpeed() { return LZ4HCCCtxInternal.nfavorDecSpeed(address()); }
        /** @return the value of the {@code dirty} field. */
        @NativeType("LZ4_i8")
        public byte dirty() { return LZ4HCCCtxInternal.ndirty(address()); }
        /** @return a {@link LZ4HCCCtxInternal} view of the struct pointed to by the {@code dictCtx} field. */
        @NativeType("LZ4HC_CCtx_internal * const")
        public LZ4HCCCtxInternal dictCtx() { return LZ4HCCCtxInternal.ndictCtx(address()); }

    }

}