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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_GPUMultisampleState {
 *     SDL_GPUSampleCount sample_count;
 *     Uint32 sample_mask;
 *     bool enable_mask;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_GPUMultisampleState extends Struct<SDL_GPUMultisampleState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLE_COUNT,
        SAMPLE_MASK,
        ENABLE_MASK,
        PADDING1,
        PADDING2,
        PADDING3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLE_COUNT = layout.offsetof(0);
        SAMPLE_MASK = layout.offsetof(1);
        ENABLE_MASK = layout.offsetof(2);
        PADDING1 = layout.offsetof(3);
        PADDING2 = layout.offsetof(4);
        PADDING3 = layout.offsetof(5);
    }

    protected SDL_GPUMultisampleState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUMultisampleState create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUMultisampleState(address, container);
    }

    /**
     * Creates a {@code SDL_GPUMultisampleState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUMultisampleState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sample_count} field. */
    @NativeType("SDL_GPUSampleCount")
    public int sample_count() { return nsample_count(address()); }
    /** @return the value of the {@code sample_mask} field. */
    @NativeType("Uint32")
    public int sample_mask() { return nsample_mask(address()); }
    /** @return the value of the {@code enable_mask} field. */
    @NativeType("bool")
    public boolean enable_mask() { return nenable_mask(address()); }

    /** Sets the specified value to the {@code sample_count} field. */
    public SDL_GPUMultisampleState sample_count(@NativeType("SDL_GPUSampleCount") int value) { nsample_count(address(), value); return this; }
    /** Sets the specified value to the {@code sample_mask} field. */
    public SDL_GPUMultisampleState sample_mask(@NativeType("Uint32") int value) { nsample_mask(address(), value); return this; }
    /** Sets the specified value to the {@code enable_mask} field. */
    public SDL_GPUMultisampleState enable_mask(@NativeType("bool") boolean value) { nenable_mask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUMultisampleState set(
        int sample_count,
        int sample_mask,
        boolean enable_mask
    ) {
        sample_count(sample_count);
        sample_mask(sample_mask);
        enable_mask(enable_mask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUMultisampleState set(SDL_GPUMultisampleState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUMultisampleState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUMultisampleState malloc() {
        return new SDL_GPUMultisampleState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUMultisampleState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUMultisampleState calloc() {
        return new SDL_GPUMultisampleState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUMultisampleState} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUMultisampleState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUMultisampleState(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUMultisampleState} instance for the specified memory address. */
    public static SDL_GPUMultisampleState create(long address) {
        return new SDL_GPUMultisampleState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUMultisampleState createSafe(long address) {
        return address == NULL ? null : new SDL_GPUMultisampleState(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUMultisampleState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUMultisampleState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUMultisampleState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUMultisampleState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUMultisampleState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUMultisampleState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUMultisampleState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUMultisampleState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUMultisampleState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUMultisampleState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUMultisampleState malloc(MemoryStack stack) {
        return new SDL_GPUMultisampleState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUMultisampleState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUMultisampleState calloc(MemoryStack stack) {
        return new SDL_GPUMultisampleState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUMultisampleState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUMultisampleState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUMultisampleState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUMultisampleState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sample_count}. */
    public static int nsample_count(long struct) { return memGetInt(struct + SDL_GPUMultisampleState.SAMPLE_COUNT); }
    /** Unsafe version of {@link #sample_mask}. */
    public static int nsample_mask(long struct) { return memGetInt(struct + SDL_GPUMultisampleState.SAMPLE_MASK); }
    /** Unsafe version of {@link #enable_mask}. */
    public static boolean nenable_mask(long struct) { return memGetByte(struct + SDL_GPUMultisampleState.ENABLE_MASK) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUMultisampleState.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUMultisampleState.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GPUMultisampleState.PADDING3); }

    /** Unsafe version of {@link #sample_count(int) sample_count}. */
    public static void nsample_count(long struct, int value) { memPutInt(struct + SDL_GPUMultisampleState.SAMPLE_COUNT, value); }
    /** Unsafe version of {@link #sample_mask(int) sample_mask}. */
    public static void nsample_mask(long struct, int value) { memPutInt(struct + SDL_GPUMultisampleState.SAMPLE_MASK, value); }
    /** Unsafe version of {@link #enable_mask(boolean) enable_mask}. */
    public static void nenable_mask(long struct, boolean value) { memPutByte(struct + SDL_GPUMultisampleState.ENABLE_MASK, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUMultisampleState.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUMultisampleState.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GPUMultisampleState.PADDING3, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUMultisampleState} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUMultisampleState, Buffer> implements NativeResource {

        private static final SDL_GPUMultisampleState ELEMENT_FACTORY = SDL_GPUMultisampleState.create(-1L);

        /**
         * Creates a new {@code SDL_GPUMultisampleState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUMultisampleState#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUMultisampleState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sample_count} field. */
        @NativeType("SDL_GPUSampleCount")
        public int sample_count() { return SDL_GPUMultisampleState.nsample_count(address()); }
        /** @return the value of the {@code sample_mask} field. */
        @NativeType("Uint32")
        public int sample_mask() { return SDL_GPUMultisampleState.nsample_mask(address()); }
        /** @return the value of the {@code enable_mask} field. */
        @NativeType("bool")
        public boolean enable_mask() { return SDL_GPUMultisampleState.nenable_mask(address()); }

        /** Sets the specified value to the {@code sample_count} field. */
        public SDL_GPUMultisampleState.Buffer sample_count(@NativeType("SDL_GPUSampleCount") int value) { SDL_GPUMultisampleState.nsample_count(address(), value); return this; }
        /** Sets the specified value to the {@code sample_mask} field. */
        public SDL_GPUMultisampleState.Buffer sample_mask(@NativeType("Uint32") int value) { SDL_GPUMultisampleState.nsample_mask(address(), value); return this; }
        /** Sets the specified value to the {@code enable_mask} field. */
        public SDL_GPUMultisampleState.Buffer enable_mask(@NativeType("bool") boolean value) { SDL_GPUMultisampleState.nenable_mask(address(), value); return this; }

    }

}