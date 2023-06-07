/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A union type used to store either a long or a pointer. This is used to store a file descriptor or a {@code FILE*} in an input stream.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union FT_StreamDesc {
 *     long value;
 *     void * pointer;
 * }</code></pre>
 */
public class FT_StreamDesc extends Struct<FT_StreamDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE,
        POINTER;

    static {
        Layout layout = __union(
            __member(CLONG_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE = layout.offsetof(0);
        POINTER = layout.offsetof(1);
    }

    protected FT_StreamDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_StreamDesc create(long address, @Nullable ByteBuffer container) {
        return new FT_StreamDesc(address, container);
    }

    /**
     * Creates a {@code FT_StreamDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_StreamDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code value} field. */
    public long value() { return nvalue(address()); }
    /** @return the value of the {@code pointer} field. */
    @NativeType("void *")
    public long pointer() { return npointer(address()); }

    /** Sets the specified value to the {@code value} field. */
    public FT_StreamDesc value(long value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code pointer} field. */
    public FT_StreamDesc pointer(@NativeType("void *") long value) { npointer(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_StreamDesc set(FT_StreamDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_StreamDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_StreamDesc malloc() {
        return new FT_StreamDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_StreamDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_StreamDesc calloc() {
        return new FT_StreamDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_StreamDesc} instance allocated with {@link BufferUtils}. */
    public static FT_StreamDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_StreamDesc(memAddress(container), container);
    }

    /** Returns a new {@code FT_StreamDesc} instance for the specified memory address. */
    public static FT_StreamDesc create(long address) {
        return new FT_StreamDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_StreamDesc createSafe(long address) {
        return address == NULL ? null : new FT_StreamDesc(address, null);
    }

    /**
     * Returns a new {@link FT_StreamDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_StreamDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_StreamDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_StreamDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_StreamDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_StreamDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_StreamDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_StreamDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_StreamDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_StreamDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_StreamDesc malloc(MemoryStack stack) {
        return new FT_StreamDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_StreamDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_StreamDesc calloc(MemoryStack stack) {
        return new FT_StreamDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_StreamDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_StreamDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_StreamDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_StreamDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return memGetCLong(struct + FT_StreamDesc.VALUE); }
    /** Unsafe version of {@link #pointer}. */
    public static long npointer(long struct) { return memGetAddress(struct + FT_StreamDesc.POINTER); }

    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { memPutCLong(struct + FT_StreamDesc.VALUE, value); }
    /** Unsafe version of {@link #pointer(long) pointer}. */
    public static void npointer(long struct, long value) { memPutAddress(struct + FT_StreamDesc.POINTER, value); }

    // -----------------------------------

    /** An array of {@link FT_StreamDesc} structs. */
    public static class Buffer extends StructBuffer<FT_StreamDesc, Buffer> implements NativeResource {

        private static final FT_StreamDesc ELEMENT_FACTORY = FT_StreamDesc.create(-1L);

        /**
         * Creates a new {@code FT_StreamDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_StreamDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_StreamDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code value} field. */
        public long value() { return FT_StreamDesc.nvalue(address()); }
        /** @return the value of the {@code pointer} field. */
        @NativeType("void *")
        public long pointer() { return FT_StreamDesc.npointer(address()); }

        /** Sets the specified value to the {@code value} field. */
        public FT_StreamDesc.Buffer value(long value) { FT_StreamDesc.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code pointer} field. */
        public FT_StreamDesc.Buffer pointer(@NativeType("void *") long value) { FT_StreamDesc.npointer(address(), value); return this; }

    }

}