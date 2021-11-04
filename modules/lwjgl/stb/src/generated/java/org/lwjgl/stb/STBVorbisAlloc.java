/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A buffer to use for allocations by {@link STBVorbis}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stb_vorbis_alloc {
 *     char * alloc_buffer;
 *     int alloc_buffer_length_in_bytes;
 * }</code></pre>
 */
@NativeType("struct stb_vorbis_alloc")
public class STBVorbisAlloc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC_BUFFER,
        ALLOC_BUFFER_LENGTH_IN_BYTES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOC_BUFFER = layout.offsetof(0);
        ALLOC_BUFFER_LENGTH_IN_BYTES = layout.offsetof(1);
    }

    /**
     * Creates a {@code STBVorbisAlloc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBVorbisAlloc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field. */
    @NativeType("char *")
    public ByteBuffer alloc_buffer() { return nalloc_buffer(address()); }
    /** @return the value of the {@code alloc_buffer_length_in_bytes} field. */
    public int alloc_buffer_length_in_bytes() { return nalloc_buffer_length_in_bytes(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
    public STBVorbisAlloc alloc_buffer(@NativeType("char *") ByteBuffer value) { nalloc_buffer(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBVorbisAlloc set(STBVorbisAlloc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBVorbisAlloc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBVorbisAlloc malloc() {
        return wrap(STBVorbisAlloc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBVorbisAlloc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBVorbisAlloc calloc() {
        return wrap(STBVorbisAlloc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBVorbisAlloc} instance allocated with {@link BufferUtils}. */
    public static STBVorbisAlloc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBVorbisAlloc.class, memAddress(container), container);
    }

    /** Returns a new {@code STBVorbisAlloc} instance for the specified memory address. */
    public static STBVorbisAlloc create(long address) {
        return wrap(STBVorbisAlloc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBVorbisAlloc createSafe(long address) {
        return address == NULL ? null : wrap(STBVorbisAlloc.class, address);
    }

    /**
     * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBVorbisAlloc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBVorbisAlloc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBVorbisAlloc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBVorbisAlloc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBVorbisAlloc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBVorbisAlloc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBVorbisAlloc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBVorbisAlloc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBVorbisAlloc malloc(MemoryStack stack) {
        return wrap(STBVorbisAlloc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBVorbisAlloc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBVorbisAlloc calloc(MemoryStack stack) {
        return wrap(STBVorbisAlloc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBVorbisAlloc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBVorbisAlloc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBVorbisAlloc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc_buffer() alloc_buffer}. */
    public static ByteBuffer nalloc_buffer(long struct) { return memByteBuffer(memGetAddress(struct + STBVorbisAlloc.ALLOC_BUFFER), nalloc_buffer_length_in_bytes(struct)); }
    /** Unsafe version of {@link #alloc_buffer_length_in_bytes}. */
    public static int nalloc_buffer_length_in_bytes(long struct) { return UNSAFE.getInt(null, struct + STBVorbisAlloc.ALLOC_BUFFER_LENGTH_IN_BYTES); }

    /** Unsafe version of {@link #alloc_buffer(ByteBuffer) alloc_buffer}. */
    public static void nalloc_buffer(long struct, ByteBuffer value) { memPutAddress(struct + STBVorbisAlloc.ALLOC_BUFFER, memAddress(value)); nalloc_buffer_length_in_bytes(struct, value.remaining()); }
    /** Sets the specified value to the {@code alloc_buffer_length_in_bytes} field of the specified {@code struct}. */
    public static void nalloc_buffer_length_in_bytes(long struct, int value) { UNSAFE.putInt(null, struct + STBVorbisAlloc.ALLOC_BUFFER_LENGTH_IN_BYTES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBVorbisAlloc.ALLOC_BUFFER));
    }

    // -----------------------------------

    /** An array of {@link STBVorbisAlloc} structs. */
    public static class Buffer extends StructBuffer<STBVorbisAlloc, Buffer> implements NativeResource {

        private static final STBVorbisAlloc ELEMENT_FACTORY = STBVorbisAlloc.create(-1L);

        /**
         * Creates a new {@code STBVorbisAlloc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBVorbisAlloc#SIZEOF}, and its mark will be undefined.
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
        protected STBVorbisAlloc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code alloc_buffer} field. */
        @NativeType("char *")
        public ByteBuffer alloc_buffer() { return STBVorbisAlloc.nalloc_buffer(address()); }
        /** @return the value of the {@code alloc_buffer_length_in_bytes} field. */
        public int alloc_buffer_length_in_bytes() { return STBVorbisAlloc.nalloc_buffer_length_in_bytes(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code alloc_buffer} field. */
        public STBVorbisAlloc.Buffer alloc_buffer(@NativeType("char *") ByteBuffer value) { STBVorbisAlloc.nalloc_buffer(address(), value); return this; }

    }

}