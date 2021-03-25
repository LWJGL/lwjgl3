/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LZ4_streamDecode_t_internal {
 *     LZ4_byte const * externalDict;
 *     size_t extDictSize;
 *     LZ4_byte const * prefixEnd;
 *     size_t prefixSize;
 * }</code></pre>
 */
@NativeType("struct LZ4_streamDecode_t_internal")
public class LZ4StreamDecodeInternal extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTERNALDICT,
        EXTDICTSIZE,
        PREFIXEND,
        PREFIXSIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTERNALDICT = layout.offsetof(0);
        EXTDICTSIZE = layout.offsetof(1);
        PREFIXEND = layout.offsetof(2);
        PREFIXSIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code LZ4StreamDecodeInternal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4StreamDecodeInternal(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code externalDict} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("LZ4_byte const *")
    public ByteBuffer externalDict(int capacity) { return nexternalDict(address(), capacity); }
    /** @return the value of the {@code extDictSize} field. */
    @NativeType("size_t")
    public long extDictSize() { return nextDictSize(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code prefixEnd} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("LZ4_byte const *")
    public ByteBuffer prefixEnd(int capacity) { return nprefixEnd(address(), capacity); }
    /** @return the value of the {@code prefixSize} field. */
    @NativeType("size_t")
    public long prefixSize() { return nprefixSize(address()); }

    // -----------------------------------

    /** Returns a new {@code LZ4StreamDecodeInternal} instance for the specified memory address. */
    public static LZ4StreamDecodeInternal create(long address) {
        return wrap(LZ4StreamDecodeInternal.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamDecodeInternal createSafe(long address) {
        return address == NULL ? null : wrap(LZ4StreamDecodeInternal.class, address);
    }

    /**
     * Create a {@link LZ4StreamDecodeInternal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4StreamDecodeInternal.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4StreamDecodeInternal.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #externalDict(int) externalDict}. */
    public static ByteBuffer nexternalDict(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4StreamDecodeInternal.EXTERNALDICT), capacity); }
    /** Unsafe version of {@link #extDictSize}. */
    public static long nextDictSize(long struct) { return memGetAddress(struct + LZ4StreamDecodeInternal.EXTDICTSIZE); }
    /** Unsafe version of {@link #prefixEnd(int) prefixEnd}. */
    public static ByteBuffer nprefixEnd(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + LZ4StreamDecodeInternal.PREFIXEND), capacity); }
    /** Unsafe version of {@link #prefixSize}. */
    public static long nprefixSize(long struct) { return memGetAddress(struct + LZ4StreamDecodeInternal.PREFIXSIZE); }

    // -----------------------------------

    /** An array of {@link LZ4StreamDecodeInternal} structs. */
    public static class Buffer extends StructBuffer<LZ4StreamDecodeInternal, Buffer> {

        private static final LZ4StreamDecodeInternal ELEMENT_FACTORY = LZ4StreamDecodeInternal.create(-1L);

        /**
         * Creates a new {@code LZ4StreamDecodeInternal.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4StreamDecodeInternal#SIZEOF}, and its mark will be undefined.
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
        protected LZ4StreamDecodeInternal getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code externalDict} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("LZ4_byte const *")
        public ByteBuffer externalDict(int capacity) { return LZ4StreamDecodeInternal.nexternalDict(address(), capacity); }
        /** @return the value of the {@code extDictSize} field. */
        @NativeType("size_t")
        public long extDictSize() { return LZ4StreamDecodeInternal.nextDictSize(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code prefixEnd} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("LZ4_byte const *")
        public ByteBuffer prefixEnd(int capacity) { return LZ4StreamDecodeInternal.nprefixEnd(address(), capacity); }
        /** @return the value of the {@code prefixSize} field. */
        @NativeType("size_t")
        public long prefixSize() { return LZ4StreamDecodeInternal.nprefixSize(address()); }

    }

}