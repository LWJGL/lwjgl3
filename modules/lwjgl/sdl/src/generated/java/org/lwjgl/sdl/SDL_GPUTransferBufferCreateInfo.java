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
 * struct SDL_GPUTransferBufferCreateInfo {
 *     SDL_GPUTransferBufferUsage usage;
 *     Uint32 size;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUTransferBufferCreateInfo extends Struct<SDL_GPUTransferBufferCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USAGE,
        SIZE,
        PROPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USAGE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        PROPS = layout.offsetof(2);
    }

    protected SDL_GPUTransferBufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTransferBufferCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTransferBufferCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTransferBufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTransferBufferCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code usage} field. */
    @NativeType("SDL_GPUTransferBufferUsage")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("Uint32")
    public int size() { return nsize(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the specified value to the {@code usage} field. */
    public SDL_GPUTransferBufferCreateInfo usage(@NativeType("SDL_GPUTransferBufferUsage") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public SDL_GPUTransferBufferCreateInfo size(@NativeType("Uint32") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUTransferBufferCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTransferBufferCreateInfo set(
        int usage,
        int size,
        int props
    ) {
        usage(usage);
        size(size);
        props(props);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUTransferBufferCreateInfo set(SDL_GPUTransferBufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTransferBufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTransferBufferCreateInfo malloc() {
        return new SDL_GPUTransferBufferCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTransferBufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTransferBufferCreateInfo calloc() {
        return new SDL_GPUTransferBufferCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTransferBufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTransferBufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTransferBufferCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTransferBufferCreateInfo} instance for the specified memory address. */
    public static SDL_GPUTransferBufferCreateInfo create(long address) {
        return new SDL_GPUTransferBufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTransferBufferCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTransferBufferCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTransferBufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTransferBufferCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTransferBufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTransferBufferCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUTransferBufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTransferBufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTransferBufferCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUTransferBufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + SDL_GPUTransferBufferCreateInfo.USAGE); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + SDL_GPUTransferBufferCreateInfo.SIZE); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUTransferBufferCreateInfo.PROPS); }

    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + SDL_GPUTransferBufferCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + SDL_GPUTransferBufferCreateInfo.SIZE, value); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUTransferBufferCreateInfo.PROPS, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUTransferBufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTransferBufferCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUTransferBufferCreateInfo ELEMENT_FACTORY = SDL_GPUTransferBufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTransferBufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTransferBufferCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTransferBufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code usage} field. */
        @NativeType("SDL_GPUTransferBufferUsage")
        public int usage() { return SDL_GPUTransferBufferCreateInfo.nusage(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("Uint32")
        public int size() { return SDL_GPUTransferBufferCreateInfo.nsize(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUTransferBufferCreateInfo.nprops(address()); }

        /** Sets the specified value to the {@code usage} field. */
        public SDL_GPUTransferBufferCreateInfo.Buffer usage(@NativeType("SDL_GPUTransferBufferUsage") int value) { SDL_GPUTransferBufferCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public SDL_GPUTransferBufferCreateInfo.Buffer size(@NativeType("Uint32") int value) { SDL_GPUTransferBufferCreateInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUTransferBufferCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUTransferBufferCreateInfo.nprops(address(), value); return this; }

    }

}