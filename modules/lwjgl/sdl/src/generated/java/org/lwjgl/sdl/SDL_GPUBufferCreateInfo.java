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
 * struct SDL_GPUBufferCreateInfo {
 *     SDL_GPUBufferUsageFlags usage;
 *     Uint32 size;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUBufferCreateInfo extends Struct<SDL_GPUBufferCreateInfo> implements NativeResource {

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

    protected SDL_GPUBufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUBufferCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUBufferCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUBufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUBufferCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code usage} field. */
    @NativeType("SDL_GPUBufferUsageFlags")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("Uint32")
    public int size() { return nsize(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the specified value to the {@code usage} field. */
    public SDL_GPUBufferCreateInfo usage(@NativeType("SDL_GPUBufferUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public SDL_GPUBufferCreateInfo size(@NativeType("Uint32") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUBufferCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUBufferCreateInfo set(
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
    public SDL_GPUBufferCreateInfo set(SDL_GPUBufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUBufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUBufferCreateInfo malloc() {
        return new SDL_GPUBufferCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUBufferCreateInfo calloc() {
        return new SDL_GPUBufferCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUBufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBufferCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUBufferCreateInfo} instance for the specified memory address. */
    public static SDL_GPUBufferCreateInfo create(long address) {
        return new SDL_GPUBufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUBufferCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUBufferCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUBufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUBufferCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUBufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBufferCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUBufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUBufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBufferCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUBufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + SDL_GPUBufferCreateInfo.USAGE); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + SDL_GPUBufferCreateInfo.SIZE); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUBufferCreateInfo.PROPS); }

    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + SDL_GPUBufferCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + SDL_GPUBufferCreateInfo.SIZE, value); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUBufferCreateInfo.PROPS, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUBufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUBufferCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUBufferCreateInfo ELEMENT_FACTORY = SDL_GPUBufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUBufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUBufferCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUBufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code usage} field. */
        @NativeType("SDL_GPUBufferUsageFlags")
        public int usage() { return SDL_GPUBufferCreateInfo.nusage(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("Uint32")
        public int size() { return SDL_GPUBufferCreateInfo.nsize(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUBufferCreateInfo.nprops(address()); }

        /** Sets the specified value to the {@code usage} field. */
        public SDL_GPUBufferCreateInfo.Buffer usage(@NativeType("SDL_GPUBufferUsageFlags") int value) { SDL_GPUBufferCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public SDL_GPUBufferCreateInfo.Buffer size(@NativeType("Uint32") int value) { SDL_GPUBufferCreateInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUBufferCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUBufferCreateInfo.nprops(address(), value); return this; }

    }

}