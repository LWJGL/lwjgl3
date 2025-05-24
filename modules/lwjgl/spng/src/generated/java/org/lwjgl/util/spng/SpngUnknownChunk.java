/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_unknown_chunk {
 *     uint8_t type[4];
 *     size_t length;
 *     void * data;
 *     spng_location location;
 * }}</pre>
 */
@NativeType("struct spng_unknown_chunk")
public class SpngUnknownChunk extends Struct<SpngUnknownChunk> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        LENGTH,
        DATA,
        LOCATION;

    static {
        Layout layout = __struct(
            __array(1, 4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
        DATA = layout.offsetof(2);
        LOCATION = layout.offsetof(3);
    }

    protected SpngUnknownChunk(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngUnknownChunk create(long address, @Nullable ByteBuffer container) {
        return new SpngUnknownChunk(address, container);
    }

    /**
     * Creates a {@code SpngUnknownChunk} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngUnknownChunk(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code type} field. */
    @NativeType("uint8_t[4]")
    public ByteBuffer type() { return ntype(address()); }
    /** @return the value at the specified index of the {@code type} field. */
    @NativeType("uint8_t")
    public byte type(int index) { return ntype(address(), index); }
    /** @return the value of the {@code length} field. */
    @NativeType("size_t")
    public long length() { return nlength(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("void *")
    public ByteBuffer data(int capacity) { return ndata(address(), capacity); }
    /** @return the value of the {@code location} field. */
    @NativeType("spng_location")
    public int location() { return nlocation(address()); }

    /** Copies the specified {@link ByteBuffer} to the {@code type} field. */
    public SpngUnknownChunk type(@NativeType("uint8_t[4]") ByteBuffer value) { ntype(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code type} field. */
    public SpngUnknownChunk type(int index, @NativeType("uint8_t") byte value) { ntype(address(), index, value); return this; }
    /** Sets the specified value to the {@code length} field. */
    public SpngUnknownChunk length(@NativeType("size_t") long value) { nlength(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public SpngUnknownChunk data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code location} field. */
    public SpngUnknownChunk location(@NativeType("spng_location") int value) { nlocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngUnknownChunk set(
        ByteBuffer type,
        long length,
        ByteBuffer data,
        int location
    ) {
        type(type);
        length(length);
        data(data);
        location(location);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpngUnknownChunk set(SpngUnknownChunk src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngUnknownChunk} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngUnknownChunk malloc() {
        return new SpngUnknownChunk(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngUnknownChunk} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngUnknownChunk calloc() {
        return new SpngUnknownChunk(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngUnknownChunk} instance allocated with {@link BufferUtils}. */
    public static SpngUnknownChunk create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngUnknownChunk(memAddress(container), container);
    }

    /** Returns a new {@code SpngUnknownChunk} instance for the specified memory address. */
    public static SpngUnknownChunk create(long address) {
        return new SpngUnknownChunk(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngUnknownChunk createSafe(long address) {
        return address == NULL ? null : new SpngUnknownChunk(address, null);
    }

    /**
     * Returns a new {@link SpngUnknownChunk.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngUnknownChunk.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngUnknownChunk.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngUnknownChunk.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngUnknownChunk.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngUnknownChunk.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngUnknownChunk.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngUnknownChunk.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngUnknownChunk.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngUnknownChunk} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngUnknownChunk malloc(MemoryStack stack) {
        return new SpngUnknownChunk(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngUnknownChunk} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngUnknownChunk calloc(MemoryStack stack) {
        return new SpngUnknownChunk(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngUnknownChunk.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngUnknownChunk.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngUnknownChunk.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngUnknownChunk.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static ByteBuffer ntype(long struct) { return memByteBuffer(struct + SpngUnknownChunk.TYPE, 4); }
    /** Unsafe version of {@link #type(int) type}. */
    public static byte ntype(long struct, int index) {
        return memGetByte(struct + SpngUnknownChunk.TYPE + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + SpngUnknownChunk.LENGTH); }
    /** Unsafe version of {@link #data(int) data}. */
    public static ByteBuffer ndata(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SpngUnknownChunk.DATA), capacity); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + SpngUnknownChunk.LOCATION); }

    /** Unsafe version of {@link #type(ByteBuffer) type}. */
    public static void ntype(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + SpngUnknownChunk.TYPE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #type(int, byte) type}. */
    public static void ntype(long struct, int index, byte value) {
        memPutByte(struct + SpngUnknownChunk.TYPE + check(index, 4) * 1, value);
    }
    /** Unsafe version of {@link #length(long) length}. */
    public static void nlength(long struct, long value) { memPutAddress(struct + SpngUnknownChunk.LENGTH, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + SpngUnknownChunk.DATA, memAddress(value)); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + SpngUnknownChunk.LOCATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpngUnknownChunk.DATA));
    }

    // -----------------------------------

    /** An array of {@link SpngUnknownChunk} structs. */
    public static class Buffer extends StructBuffer<SpngUnknownChunk, Buffer> implements NativeResource {

        private static final SpngUnknownChunk ELEMENT_FACTORY = SpngUnknownChunk.create(-1L);

        /**
         * Creates a new {@code SpngUnknownChunk.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngUnknownChunk#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngUnknownChunk getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code type} field. */
        @NativeType("uint8_t[4]")
        public ByteBuffer type() { return SpngUnknownChunk.ntype(address()); }
        /** @return the value at the specified index of the {@code type} field. */
        @NativeType("uint8_t")
        public byte type(int index) { return SpngUnknownChunk.ntype(address(), index); }
        /** @return the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return SpngUnknownChunk.nlength(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("void *")
        public ByteBuffer data(int capacity) { return SpngUnknownChunk.ndata(address(), capacity); }
        /** @return the value of the {@code location} field. */
        @NativeType("spng_location")
        public int location() { return SpngUnknownChunk.nlocation(address()); }

        /** Copies the specified {@link ByteBuffer} to the {@code type} field. */
        public SpngUnknownChunk.Buffer type(@NativeType("uint8_t[4]") ByteBuffer value) { SpngUnknownChunk.ntype(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code type} field. */
        public SpngUnknownChunk.Buffer type(int index, @NativeType("uint8_t") byte value) { SpngUnknownChunk.ntype(address(), index, value); return this; }
        /** Sets the specified value to the {@code length} field. */
        public SpngUnknownChunk.Buffer length(@NativeType("size_t") long value) { SpngUnknownChunk.nlength(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public SpngUnknownChunk.Buffer data(@NativeType("void *") ByteBuffer value) { SpngUnknownChunk.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code location} field. */
        public SpngUnknownChunk.Buffer location(@NativeType("spng_location") int value) { SpngUnknownChunk.nlocation(address(), value); return this; }

    }

}