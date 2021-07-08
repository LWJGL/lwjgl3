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

import static org.lwjgl.util.lz4.LZ4.LZ4_HASH_SIZE_U32;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LZ4_stream_t_internal {
 *     LZ4_u32 hashTable[LZ4_HASH_SIZE_U32];
 *     LZ4_u32 currentOffset;
 *     LZ4_u32 tableType;
 *     LZ4_byte const * dictionary;
 *     {@link LZ4StreamInternal LZ4_stream_t_internal} * const dictCtx;
 *     LZ4_u32 dictSize;
 * }</code></pre>
 */
@NativeType("struct LZ4_stream_t_internal")
public class LZ4StreamInternal extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASHTABLE,
        CURRENTOFFSET,
        TABLETYPE,
        DICTIONARY,
        DICTCTX,
        DICTSIZE;

    static {
        Layout layout = __struct(
            __array(4, LZ4_HASH_SIZE_U32),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HASHTABLE = layout.offsetof(0);
        CURRENTOFFSET = layout.offsetof(1);
        TABLETYPE = layout.offsetof(2);
        DICTIONARY = layout.offsetof(3);
        DICTCTX = layout.offsetof(4);
        DICTSIZE = layout.offsetof(5);
    }

    /**
     * Creates a {@code LZ4StreamInternal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamInternal(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code hashTable} field. */
    @NativeType("LZ4_u32[LZ4_HASH_SIZE_U32]")
    public IntBuffer hashTable() { return nhashTable(address()); }
    /** @return the value at the specified index of the {@code hashTable} field. */
    @NativeType("LZ4_u32")
    public int hashTable(int index) { return nhashTable(address(), index); }
    /** @return the value of the {@code currentOffset} field. */
    @NativeType("LZ4_u32")
    public int currentOffset() { return ncurrentOffset(address()); }
    /** @return the value of the {@code tableType} field. */
    @NativeType("LZ4_u32")
    public int tableType() { return ntableType(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code dictionary} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("LZ4_byte const *")
    public ByteBuffer dictionary(int capacity) { return ndictionary(address(), capacity); }
    /** @return a {@link LZ4StreamInternal} view of the struct pointed to by the {@code dictCtx} field. */
    @NativeType("LZ4_stream_t_internal * const")
    public LZ4StreamInternal dictCtx() { return ndictCtx(address()); }
    /** @return the value of the {@code dictSize} field. */
    @NativeType("LZ4_u32")
    public int dictSize() { return ndictSize(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4StreamInternal} instance for the specified memory address. */
    public static LZ4StreamInternal create(long address) {
        return wrap(LZ4StreamInternal.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamInternal createSafe(long address) {
        return address == NULL ? null : wrap(LZ4StreamInternal.class, address);
    }

    /**
     * Create a {@link LZ4StreamInternal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4StreamInternal.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamInternal.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hashTable}. */
    public static IntBuffer nhashTable(long struct) { return memIntBuffer(struct + LZ4StreamInternal.HASHTABLE, LZ4_HASH_SIZE_U32); }
    /** Unsafe version of {@link #hashTable(int) hashTable}. */
    public static int nhashTable(long struct, int index) {
        return UNSAFE.getInt(null, struct + LZ4StreamInternal.HASHTABLE + check(index, LZ4_HASH_SIZE_U32) * 4);
    }
    /** Unsafe version of {@link #currentOffset}. */
    public static int ncurrentOffset(long struct) { return UNSAFE.getInt(null, struct + LZ4StreamInternal.CURRENTOFFSET); }
    /** Unsafe version of {@link #tableType}. */
    public static int ntableType(long struct) { return UNSAFE.getInt(null, struct + LZ4StreamInternal.TABLETYPE); }
    /** Unsafe version of {@link #dictionary(int) dictionary}. */
    public static ByteBuffer ndictionary(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4StreamInternal.DICTIONARY), capacity); }
    /** Unsafe version of {@link #dictCtx}. */
    public static LZ4StreamInternal ndictCtx(long struct) { return LZ4StreamInternal.create(memGetAddress(struct + LZ4StreamInternal.DICTCTX)); }
    /** Unsafe version of {@link #dictSize}. */
    public static int ndictSize(long struct) { return UNSAFE.getInt(null, struct + LZ4StreamInternal.DICTSIZE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamInternal} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamInternal, Buffer> {

        private static final LZ4StreamInternal ELEMENT_FACTORY = LZ4StreamInternal.create(-1L);

        /**
         * Creates a new {@code LZ4StreamInternal.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamInternal#SIZEOF}, and its mark will be undefined.
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
        protected LZ4StreamInternal getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code hashTable} field. */
        @NativeType("LZ4_u32[LZ4_HASH_SIZE_U32]")
        public IntBuffer hashTable() { return LZ4StreamInternal.nhashTable(address()); }
        /** @return the value at the specified index of the {@code hashTable} field. */
        @NativeType("LZ4_u32")
        public int hashTable(int index) { return LZ4StreamInternal.nhashTable(address(), index); }
        /** @return the value of the {@code currentOffset} field. */
        @NativeType("LZ4_u32")
        public int currentOffset() { return LZ4StreamInternal.ncurrentOffset(address()); }
        /** @return the value of the {@code tableType} field. */
        @NativeType("LZ4_u32")
        public int tableType() { return LZ4StreamInternal.ntableType(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code dictionary} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("LZ4_byte const *")
        public ByteBuffer dictionary(int capacity) { return LZ4StreamInternal.ndictionary(address(), capacity); }
        /** @return a {@link LZ4StreamInternal} view of the struct pointed to by the {@code dictCtx} field. */
        @NativeType("LZ4_stream_t_internal * const")
        public LZ4StreamInternal dictCtx() { return LZ4StreamInternal.ndictCtx(address()); }
        /** @return the value of the {@code dictSize} field. */
        @NativeType("LZ4_u32")
        public int dictSize() { return LZ4StreamInternal.ndictSize(address()); }

    }

}