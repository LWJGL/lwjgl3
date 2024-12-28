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
 * struct SDL_GPUVertexAttribute {
 *     Uint32 location;
 *     Uint32 buffer_slot;
 *     SDL_GPUVertexElementFormat format;
 *     Uint32 offset;
 * }}</pre>
 */
public class SDL_GPUVertexAttribute extends Struct<SDL_GPUVertexAttribute> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        BUFFER_SLOT,
        FORMAT,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        BUFFER_SLOT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
    }

    protected SDL_GPUVertexAttribute(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUVertexAttribute create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUVertexAttribute(address, container);
    }

    /**
     * Creates a {@code SDL_GPUVertexAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUVertexAttribute(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code location} field. */
    @NativeType("Uint32")
    public int location() { return nlocation(address()); }
    /** @return the value of the {@code buffer_slot} field. */
    @NativeType("Uint32")
    public int buffer_slot() { return nbuffer_slot(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("SDL_GPUVertexElementFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("Uint32")
    public int offset() { return noffset(address()); }

    /** Sets the specified value to the {@code location} field. */
    public SDL_GPUVertexAttribute location(@NativeType("Uint32") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code buffer_slot} field. */
    public SDL_GPUVertexAttribute buffer_slot(@NativeType("Uint32") int value) { nbuffer_slot(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SDL_GPUVertexAttribute format(@NativeType("SDL_GPUVertexElementFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public SDL_GPUVertexAttribute offset(@NativeType("Uint32") int value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUVertexAttribute set(
        int location,
        int buffer_slot,
        int format,
        int offset
    ) {
        location(location);
        buffer_slot(buffer_slot);
        format(format);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUVertexAttribute set(SDL_GPUVertexAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUVertexAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUVertexAttribute malloc() {
        return new SDL_GPUVertexAttribute(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVertexAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUVertexAttribute calloc() {
        return new SDL_GPUVertexAttribute(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVertexAttribute} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUVertexAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVertexAttribute(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUVertexAttribute} instance for the specified memory address. */
    public static SDL_GPUVertexAttribute create(long address) {
        return new SDL_GPUVertexAttribute(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUVertexAttribute createSafe(long address) {
        return address == NULL ? null : new SDL_GPUVertexAttribute(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUVertexAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexAttribute.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexAttribute.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexAttribute.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUVertexAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexAttribute.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUVertexAttribute.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUVertexAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVertexAttribute malloc(MemoryStack stack) {
        return new SDL_GPUVertexAttribute(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUVertexAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVertexAttribute calloc(MemoryStack stack) {
        return new SDL_GPUVertexAttribute(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUVertexAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexAttribute.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexAttribute.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + SDL_GPUVertexAttribute.LOCATION); }
    /** Unsafe version of {@link #buffer_slot}. */
    public static int nbuffer_slot(long struct) { return memGetInt(struct + SDL_GPUVertexAttribute.BUFFER_SLOT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_GPUVertexAttribute.FORMAT); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + SDL_GPUVertexAttribute.OFFSET); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + SDL_GPUVertexAttribute.LOCATION, value); }
    /** Unsafe version of {@link #buffer_slot(int) buffer_slot}. */
    public static void nbuffer_slot(long struct, int value) { memPutInt(struct + SDL_GPUVertexAttribute.BUFFER_SLOT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_GPUVertexAttribute.FORMAT, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + SDL_GPUVertexAttribute.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUVertexAttribute} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUVertexAttribute, Buffer> implements NativeResource {

        private static final SDL_GPUVertexAttribute ELEMENT_FACTORY = SDL_GPUVertexAttribute.create(-1L);

        /**
         * Creates a new {@code SDL_GPUVertexAttribute.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUVertexAttribute#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUVertexAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code location} field. */
        @NativeType("Uint32")
        public int location() { return SDL_GPUVertexAttribute.nlocation(address()); }
        /** @return the value of the {@code buffer_slot} field. */
        @NativeType("Uint32")
        public int buffer_slot() { return SDL_GPUVertexAttribute.nbuffer_slot(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("SDL_GPUVertexElementFormat")
        public int format() { return SDL_GPUVertexAttribute.nformat(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("Uint32")
        public int offset() { return SDL_GPUVertexAttribute.noffset(address()); }

        /** Sets the specified value to the {@code location} field. */
        public SDL_GPUVertexAttribute.Buffer location(@NativeType("Uint32") int value) { SDL_GPUVertexAttribute.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code buffer_slot} field. */
        public SDL_GPUVertexAttribute.Buffer buffer_slot(@NativeType("Uint32") int value) { SDL_GPUVertexAttribute.nbuffer_slot(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SDL_GPUVertexAttribute.Buffer format(@NativeType("SDL_GPUVertexElementFormat") int value) { SDL_GPUVertexAttribute.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public SDL_GPUVertexAttribute.Buffer offset(@NativeType("Uint32") int value) { SDL_GPUVertexAttribute.noffset(address(), value); return this; }

    }

}