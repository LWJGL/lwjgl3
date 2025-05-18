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
public class spng_unknown_chunk extends Struct<spng_unknown_chunk> implements NativeResource {

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

    protected spng_unknown_chunk(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_unknown_chunk create(long address, @Nullable ByteBuffer container) {
        return new spng_unknown_chunk(address, container);
    }

    /**
     * Creates a {@code spng_unknown_chunk} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_unknown_chunk(ByteBuffer container) {
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
    public ByteBuffer data() { return ndata(address()); }
    /** @return the value of the {@code location} field. */
    @NativeType("spng_location")
    public int location() { return nlocation(address()); }

    /** Copies the specified {@link ByteBuffer} to the {@code type} field. */
    public spng_unknown_chunk type(@NativeType("uint8_t[4]") ByteBuffer value) { ntype(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code type} field. */
    public spng_unknown_chunk type(int index, @NativeType("uint8_t") byte value) { ntype(address(), index, value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public spng_unknown_chunk data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code location} field. */
    public spng_unknown_chunk location(@NativeType("spng_location") int value) { nlocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_unknown_chunk set(
        ByteBuffer type,
        ByteBuffer data,
        int location
    ) {
        type(type);
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
    public spng_unknown_chunk set(spng_unknown_chunk src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_unknown_chunk} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_unknown_chunk malloc() {
        return new spng_unknown_chunk(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_unknown_chunk} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_unknown_chunk calloc() {
        return new spng_unknown_chunk(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_unknown_chunk} instance allocated with {@link BufferUtils}. */
    public static spng_unknown_chunk create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_unknown_chunk(memAddress(container), container);
    }

    /** Returns a new {@code spng_unknown_chunk} instance for the specified memory address. */
    public static spng_unknown_chunk create(long address) {
        return new spng_unknown_chunk(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_unknown_chunk createSafe(long address) {
        return address == NULL ? null : new spng_unknown_chunk(address, null);
    }

    /**
     * Returns a new {@link spng_unknown_chunk.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_unknown_chunk.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_unknown_chunk.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_unknown_chunk.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_unknown_chunk.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_unknown_chunk.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_unknown_chunk.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_unknown_chunk.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_unknown_chunk.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_unknown_chunk} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_unknown_chunk malloc(MemoryStack stack) {
        return new spng_unknown_chunk(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_unknown_chunk} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_unknown_chunk calloc(MemoryStack stack) {
        return new spng_unknown_chunk(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_unknown_chunk.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_unknown_chunk.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_unknown_chunk.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_unknown_chunk.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static ByteBuffer ntype(long struct) { return memByteBuffer(struct + spng_unknown_chunk.TYPE, 4); }
    /** Unsafe version of {@link #type(int) type}. */
    public static byte ntype(long struct, int index) {
        return memGetByte(struct + spng_unknown_chunk.TYPE + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + spng_unknown_chunk.LENGTH); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + spng_unknown_chunk.DATA), (int)nlength(struct)); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + spng_unknown_chunk.LOCATION); }

    /** Unsafe version of {@link #type(ByteBuffer) type}. */
    public static void ntype(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + spng_unknown_chunk.TYPE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #type(int, byte) type}. */
    public static void ntype(long struct, int index, byte value) {
        memPutByte(struct + spng_unknown_chunk.TYPE + check(index, 4) * 1, value);
    }
    /** Sets the specified value to the {@code length} field of the specified {@code struct}. */
    public static void nlength(long struct, long value) { memPutAddress(struct + spng_unknown_chunk.LENGTH, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + spng_unknown_chunk.DATA, memAddress(value)); nlength(struct, value.remaining()); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + spng_unknown_chunk.LOCATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + spng_unknown_chunk.DATA));
    }

    // -----------------------------------

    /** An array of {@link spng_unknown_chunk} structs. */
    public static class Buffer extends StructBuffer<spng_unknown_chunk, Buffer> implements NativeResource {

        private static final spng_unknown_chunk ELEMENT_FACTORY = spng_unknown_chunk.create(-1L);

        /**
         * Creates a new {@code spng_unknown_chunk.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_unknown_chunk#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_unknown_chunk getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code type} field. */
        @NativeType("uint8_t[4]")
        public ByteBuffer type() { return spng_unknown_chunk.ntype(address()); }
        /** @return the value at the specified index of the {@code type} field. */
        @NativeType("uint8_t")
        public byte type(int index) { return spng_unknown_chunk.ntype(address(), index); }
        /** @return the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return spng_unknown_chunk.nlength(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("void *")
        public ByteBuffer data() { return spng_unknown_chunk.ndata(address()); }
        /** @return the value of the {@code location} field. */
        @NativeType("spng_location")
        public int location() { return spng_unknown_chunk.nlocation(address()); }

        /** Copies the specified {@link ByteBuffer} to the {@code type} field. */
        public spng_unknown_chunk.Buffer type(@NativeType("uint8_t[4]") ByteBuffer value) { spng_unknown_chunk.ntype(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code type} field. */
        public spng_unknown_chunk.Buffer type(int index, @NativeType("uint8_t") byte value) { spng_unknown_chunk.ntype(address(), index, value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public spng_unknown_chunk.Buffer data(@NativeType("void *") ByteBuffer value) { spng_unknown_chunk.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code location} field. */
        public spng_unknown_chunk.Buffer location(@NativeType("spng_location") int value) { spng_unknown_chunk.nlocation(address(), value); return this; }

    }

}