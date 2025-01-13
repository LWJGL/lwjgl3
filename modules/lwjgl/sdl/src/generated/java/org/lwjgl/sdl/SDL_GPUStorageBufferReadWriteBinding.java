/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_GPUStorageBufferReadWriteBinding {
 *     SDL_GPUBuffer * buffer;
 *     bool cycle;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_GPUStorageBufferReadWriteBinding extends Struct<SDL_GPUStorageBufferReadWriteBinding> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER,
        CYCLE,
        PADDING1,
        PADDING2,
        PADDING3;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER = layout.offsetof(0);
        CYCLE = layout.offsetof(1);
        PADDING1 = layout.offsetof(2);
        PADDING2 = layout.offsetof(3);
        PADDING3 = layout.offsetof(4);
    }

    protected SDL_GPUStorageBufferReadWriteBinding(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUStorageBufferReadWriteBinding create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUStorageBufferReadWriteBinding(address, container);
    }

    /**
     * Creates a {@code SDL_GPUStorageBufferReadWriteBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUStorageBufferReadWriteBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code buffer} field. */
    @NativeType("SDL_GPUBuffer *")
    public long buffer() { return nbuffer(address()); }
    /** @return the value of the {@code cycle} field. */
    @NativeType("bool")
    public boolean cycle() { return ncycle(address()); }

    /** Sets the specified value to the {@code buffer} field. */
    public SDL_GPUStorageBufferReadWriteBinding buffer(@NativeType("SDL_GPUBuffer *") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code cycle} field. */
    public SDL_GPUStorageBufferReadWriteBinding cycle(@NativeType("bool") boolean value) { ncycle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUStorageBufferReadWriteBinding set(
        long buffer,
        boolean cycle
    ) {
        buffer(buffer);
        cycle(cycle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUStorageBufferReadWriteBinding set(SDL_GPUStorageBufferReadWriteBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUStorageBufferReadWriteBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUStorageBufferReadWriteBinding malloc() {
        return new SDL_GPUStorageBufferReadWriteBinding(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUStorageBufferReadWriteBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUStorageBufferReadWriteBinding calloc() {
        return new SDL_GPUStorageBufferReadWriteBinding(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUStorageBufferReadWriteBinding} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUStorageBufferReadWriteBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUStorageBufferReadWriteBinding(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUStorageBufferReadWriteBinding} instance for the specified memory address. */
    public static SDL_GPUStorageBufferReadWriteBinding create(long address) {
        return new SDL_GPUStorageBufferReadWriteBinding(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUStorageBufferReadWriteBinding createSafe(long address) {
        return address == NULL ? null : new SDL_GPUStorageBufferReadWriteBinding(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUStorageBufferReadWriteBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageBufferReadWriteBinding.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStorageBufferReadWriteBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageBufferReadWriteBinding.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStorageBufferReadWriteBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageBufferReadWriteBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUStorageBufferReadWriteBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageBufferReadWriteBinding.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUStorageBufferReadWriteBinding.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUStorageBufferReadWriteBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUStorageBufferReadWriteBinding malloc(MemoryStack stack) {
        return new SDL_GPUStorageBufferReadWriteBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUStorageBufferReadWriteBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUStorageBufferReadWriteBinding calloc(MemoryStack stack) {
        return new SDL_GPUStorageBufferReadWriteBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUStorageBufferReadWriteBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageBufferReadWriteBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStorageBufferReadWriteBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageBufferReadWriteBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetAddress(struct + SDL_GPUStorageBufferReadWriteBinding.BUFFER); }
    /** Unsafe version of {@link #cycle}. */
    public static boolean ncycle(long struct) { return memGetByte(struct + SDL_GPUStorageBufferReadWriteBinding.CYCLE) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUStorageBufferReadWriteBinding.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUStorageBufferReadWriteBinding.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GPUStorageBufferReadWriteBinding.PADDING3); }

    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutAddress(struct + SDL_GPUStorageBufferReadWriteBinding.BUFFER, check(value)); }
    /** Unsafe version of {@link #cycle(boolean) cycle}. */
    public static void ncycle(long struct, boolean value) { memPutByte(struct + SDL_GPUStorageBufferReadWriteBinding.CYCLE, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUStorageBufferReadWriteBinding.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUStorageBufferReadWriteBinding.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GPUStorageBufferReadWriteBinding.PADDING3, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUStorageBufferReadWriteBinding.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUStorageBufferReadWriteBinding} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUStorageBufferReadWriteBinding, Buffer> implements NativeResource {

        private static final SDL_GPUStorageBufferReadWriteBinding ELEMENT_FACTORY = SDL_GPUStorageBufferReadWriteBinding.create(-1L);

        /**
         * Creates a new {@code SDL_GPUStorageBufferReadWriteBinding.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUStorageBufferReadWriteBinding#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUStorageBufferReadWriteBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code buffer} field. */
        @NativeType("SDL_GPUBuffer *")
        public long buffer() { return SDL_GPUStorageBufferReadWriteBinding.nbuffer(address()); }
        /** @return the value of the {@code cycle} field. */
        @NativeType("bool")
        public boolean cycle() { return SDL_GPUStorageBufferReadWriteBinding.ncycle(address()); }

        /** Sets the specified value to the {@code buffer} field. */
        public SDL_GPUStorageBufferReadWriteBinding.Buffer buffer(@NativeType("SDL_GPUBuffer *") long value) { SDL_GPUStorageBufferReadWriteBinding.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code cycle} field. */
        public SDL_GPUStorageBufferReadWriteBinding.Buffer cycle(@NativeType("bool") boolean value) { SDL_GPUStorageBufferReadWriteBinding.ncycle(address(), value); return this; }

    }

}