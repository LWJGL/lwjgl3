/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Vertex attribute stream.
 * 
 * <p>Each element takes size bytes, beginning at data, with stride controlling the spacing between successive elements ({@code stride} &ge; {@code size}).</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meshopt_Stream {
 *     void const * data;
 *     size_t size;
 *     size_t stride;
 * }</code></pre>
 */
@NativeType("struct meshopt_Stream")
public class MeshoptStream extends Struct<MeshoptStream> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
    }

    protected MeshoptStream(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MeshoptStream create(long address, @Nullable ByteBuffer container) {
        return new MeshoptStream(address, container);
    }

    /**
     * Creates a {@code MeshoptStream} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptStream(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void const *")
    public ByteBuffer data(int capacity) { return ndata(address(), capacity); }
    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("size_t")
    public long stride() { return nstride(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public MeshoptStream data(@NativeType("void const *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public MeshoptStream size(@NativeType("size_t") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public MeshoptStream stride(@NativeType("size_t") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MeshoptStream set(
        ByteBuffer data,
        long size,
        long stride
    ) {
        data(data);
        size(size);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MeshoptStream set(MeshoptStream src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MeshoptStream} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptStream malloc() {
        return new MeshoptStream(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MeshoptStream} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptStream calloc() {
        return new MeshoptStream(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MeshoptStream} instance allocated with {@link BufferUtils}. */
    public static MeshoptStream create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MeshoptStream(memAddress(container), container);
    }

    /** Returns a new {@code MeshoptStream} instance for the specified memory address. */
    public static MeshoptStream create(long address) {
        return new MeshoptStream(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MeshoptStream createSafe(long address) {
        return address == NULL ? null : new MeshoptStream(address, null);
    }

    /**
     * Returns a new {@link MeshoptStream.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptStream.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptStream.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptStream.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptStream.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptStream.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MeshoptStream.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptStream.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MeshoptStream.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MeshoptStream} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptStream malloc(MemoryStack stack) {
        return new MeshoptStream(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MeshoptStream} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptStream calloc(MemoryStack stack) {
        return new MeshoptStream(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MeshoptStream.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptStream.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptStream.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptStream.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data(int) data}. */
    public static ByteBuffer ndata(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + MeshoptStream.DATA), capacity); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + MeshoptStream.SIZE); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetAddress(struct + MeshoptStream.STRIDE); }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + MeshoptStream.DATA, memAddress(value)); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + MeshoptStream.SIZE, value); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { memPutAddress(struct + MeshoptStream.STRIDE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + MeshoptStream.DATA));
    }

    // -----------------------------------

    /** An array of {@link MeshoptStream} structs. */
    public static class Buffer extends StructBuffer<MeshoptStream, Buffer> implements NativeResource {

        private static final MeshoptStream ELEMENT_FACTORY = MeshoptStream.create(-1L);

        /**
         * Creates a new {@code MeshoptStream.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptStream#SIZEOF}, and its mark will be undefined.</p>
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
        protected MeshoptStream getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void const *")
        public ByteBuffer data(int capacity) { return MeshoptStream.ndata(address(), capacity); }
        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return MeshoptStream.nsize(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("size_t")
        public long stride() { return MeshoptStream.nstride(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public MeshoptStream.Buffer data(@NativeType("void const *") ByteBuffer value) { MeshoptStream.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public MeshoptStream.Buffer size(@NativeType("size_t") long value) { MeshoptStream.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public MeshoptStream.Buffer stride(@NativeType("size_t") long value) { MeshoptStream.nstride(address(), value); return this; }

    }

}