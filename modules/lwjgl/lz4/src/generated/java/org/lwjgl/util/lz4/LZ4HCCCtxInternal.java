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

import static org.lwjgl.util.lz4.LZ4HC.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LZ4HC_CCtx_internal {
 *     LZ4_u32 hashTable[LZ4HC_HASHTABLESIZE];
 *     LZ4_u16 chainTable[LZ4HC_MAXD];
 *     LZ4_byte const * {@link #end};
 *     LZ4_byte const * {@link #base};
 *     LZ4_byte const * {@link #dictBase};
 *     LZ4_u32 {@link #dictLimit};
 *     LZ4_u32 {@link #lowLimit};
 *     LZ4_u32 {@link #nextToUpdate};
 *     short compressionLevel;
 *     LZ4_i8 {@link #favorDecSpeed};
 *     LZ4_i8 {@link #dirty};
 *     {@link LZ4HCCCtxInternal LZ4HC_CCtx_internal} * const dictCtx;
 * }</code></pre>
 */
@NativeType("struct LZ4HC_CCtx_internal")
public class LZ4HCCCtxInternal extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASHTABLE,
        CHAINTABLE,
        END,
        BASE,
        DICTBASE,
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
        BASE = layout.offsetof(3);
        DICTBASE = layout.offsetof(4);
        DICTLIMIT = layout.offsetof(5);
        LOWLIMIT = layout.offsetof(6);
        NEXTTOUPDATE = layout.offsetof(7);
        COMPRESSIONLEVEL = layout.offsetof(8);
        FAVORDECSPEED = layout.offsetof(9);
        DIRTY = layout.offsetof(10);
        DICTCTX = layout.offsetof(11);
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
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return next block here to continue on current prefix
     */
    @NativeType("LZ4_byte const *")
    public ByteBuffer end(int capacity) { return nend(address(), capacity); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return All index relative to this position
     */
    @NativeType("LZ4_byte const *")
    public ByteBuffer base(int capacity) { return nbase(address(), capacity); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return alternate base for {@code extDict}
     */
    @NativeType("LZ4_byte const *")
    public ByteBuffer dictBase(int capacity) { return ndictBase(address(), capacity); }
    /** below that point, need {@code extDict} */
    @NativeType("LZ4_u32")
    public int dictLimit() { return ndictLimit(address()); }
    /** below that point, no more {@code dict} */
    @NativeType("LZ4_u32")
    public int lowLimit() { return nlowLimit(address()); }
    /** index from which to continue dictionary update */
    @NativeType("LZ4_u32")
    public int nextToUpdate() { return nnextToUpdate(address()); }
    /** @return the value of the {@code compressionLevel} field. */
    public short compressionLevel() { return ncompressionLevel(address()); }
    /** favor decompression speed if this flag set, otherwise, favor compression ratio */
    @NativeType("LZ4_i8")
    public byte favorDecSpeed() { return nfavorDecSpeed(address()); }
    /** stream has to be fully reset if this flag is set */
    @NativeType("LZ4_i8")
    public byte dirty() { return ndirty(address()); }
    /** @return a {@link LZ4HCCCtxInternal} view of the struct pointed to by the {@code dictCtx} field. */
    @NativeType("LZ4HC_CCtx_internal * const")
    public LZ4HCCCtxInternal dictCtx() { return ndictCtx(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4HCCCtxInternal} instance for the specified memory address. */
    public static LZ4HCCCtxInternal create(long address) {
        return wrap(LZ4HCCCtxInternal.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4HCCCtxInternal createSafe(long address) {
        return address == NULL ? null : wrap(LZ4HCCCtxInternal.class, address);
    }

    /**
     * Create a {@link LZ4HCCCtxInternal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4HCCCtxInternal.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4HCCCtxInternal.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hashTable}. */
    public static IntBuffer nhashTable(long struct) { return memIntBuffer(struct + LZ4HCCCtxInternal.HASHTABLE, LZ4HC_HASHTABLESIZE); }
    /** Unsafe version of {@link #hashTable(int) hashTable}. */
    public static int nhashTable(long struct, int index) {
        return UNSAFE.getInt(null, struct + LZ4HCCCtxInternal.HASHTABLE + check(index, LZ4HC_HASHTABLESIZE) * 4);
    }
    /** Unsafe version of {@link #chainTable}. */
    public static ShortBuffer nchainTable(long struct) { return memShortBuffer(struct + LZ4HCCCtxInternal.CHAINTABLE, LZ4HC_MAXD); }
    /** Unsafe version of {@link #chainTable(int) chainTable}. */
    public static short nchainTable(long struct, int index) {
        return UNSAFE.getShort(null, struct + LZ4HCCCtxInternal.CHAINTABLE + check(index, LZ4HC_MAXD) * 2);
    }
    /** Unsafe version of {@link #end(int) end}. */
    public static ByteBuffer nend(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.END), capacity); }
    /** Unsafe version of {@link #base(int) base}. */
    public static ByteBuffer nbase(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.BASE), capacity); }
    /** Unsafe version of {@link #dictBase(int) dictBase}. */
    public static ByteBuffer ndictBase(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4HCCCtxInternal.DICTBASE), capacity); }
    /** Unsafe version of {@link #dictLimit}. */
    public static int ndictLimit(long struct) { return UNSAFE.getInt(null, struct + LZ4HCCCtxInternal.DICTLIMIT); }
    /** Unsafe version of {@link #lowLimit}. */
    public static int nlowLimit(long struct) { return UNSAFE.getInt(null, struct + LZ4HCCCtxInternal.LOWLIMIT); }
    /** Unsafe version of {@link #nextToUpdate}. */
    public static int nnextToUpdate(long struct) { return UNSAFE.getInt(null, struct + LZ4HCCCtxInternal.NEXTTOUPDATE); }
    /** Unsafe version of {@link #compressionLevel}. */
    public static short ncompressionLevel(long struct) { return UNSAFE.getShort(null, struct + LZ4HCCCtxInternal.COMPRESSIONLEVEL); }
    /** Unsafe version of {@link #favorDecSpeed}. */
    public static byte nfavorDecSpeed(long struct) { return UNSAFE.getByte(null, struct + LZ4HCCCtxInternal.FAVORDECSPEED); }
    /** Unsafe version of {@link #dirty}. */
    public static byte ndirty(long struct) { return UNSAFE.getByte(null, struct + LZ4HCCCtxInternal.DIRTY); }
    /** Unsafe version of {@link #dictCtx}. */
    public static LZ4HCCCtxInternal ndictCtx(long struct) { return LZ4HCCCtxInternal.create(memGetAddress(struct + LZ4HCCCtxInternal.DICTCTX)); }

    // -----------------------------------

    /** An array of {@link LZ4HCCCtxInternal} structs. */
    public static class Buffer extends StructBuffer<LZ4HCCCtxInternal, Buffer> {

        private static final LZ4HCCCtxInternal ELEMENT_FACTORY = LZ4HCCCtxInternal.create(-1L);

        /**
         * Creates a new {@code LZ4HCCCtxInternal.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4HCCCtxInternal#SIZEOF}, and its mark will be undefined.
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
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link LZ4HCCCtxInternal#end} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("LZ4_byte const *")
        public ByteBuffer end(int capacity) { return LZ4HCCCtxInternal.nend(address(), capacity); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link LZ4HCCCtxInternal#base} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("LZ4_byte const *")
        public ByteBuffer base(int capacity) { return LZ4HCCCtxInternal.nbase(address(), capacity); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link LZ4HCCCtxInternal#dictBase} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("LZ4_byte const *")
        public ByteBuffer dictBase(int capacity) { return LZ4HCCCtxInternal.ndictBase(address(), capacity); }
        /** @return the value of the {@link LZ4HCCCtxInternal#dictLimit} field. */
        @NativeType("LZ4_u32")
        public int dictLimit() { return LZ4HCCCtxInternal.ndictLimit(address()); }
        /** @return the value of the {@link LZ4HCCCtxInternal#lowLimit} field. */
        @NativeType("LZ4_u32")
        public int lowLimit() { return LZ4HCCCtxInternal.nlowLimit(address()); }
        /** @return the value of the {@link LZ4HCCCtxInternal#nextToUpdate} field. */
        @NativeType("LZ4_u32")
        public int nextToUpdate() { return LZ4HCCCtxInternal.nnextToUpdate(address()); }
        /** @return the value of the {@code compressionLevel} field. */
        public short compressionLevel() { return LZ4HCCCtxInternal.ncompressionLevel(address()); }
        /** @return the value of the {@link LZ4HCCCtxInternal#favorDecSpeed} field. */
        @NativeType("LZ4_i8")
        public byte favorDecSpeed() { return LZ4HCCCtxInternal.nfavorDecSpeed(address()); }
        /** @return the value of the {@link LZ4HCCCtxInternal#dirty} field. */
        @NativeType("LZ4_i8")
        public byte dirty() { return LZ4HCCCtxInternal.ndirty(address()); }
        /** @return a {@link LZ4HCCCtxInternal} view of the struct pointed to by the {@code dictCtx} field. */
        @NativeType("LZ4HC_CCtx_internal * const")
        public LZ4HCCCtxInternal dictCtx() { return LZ4HCCCtxInternal.ndictCtx(address()); }

    }

}