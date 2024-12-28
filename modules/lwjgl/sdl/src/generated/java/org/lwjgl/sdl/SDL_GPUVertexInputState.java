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
 * struct SDL_GPUVertexInputState {
 *     {@link SDL_GPUVertexBufferDescription SDL_GPUVertexBufferDescription} const * vertex_buffer_descriptions;
 *     Uint32 num_vertex_buffers;
 *     {@link SDL_GPUVertexAttribute SDL_GPUVertexAttribute} const * vertex_attributes;
 *     Uint32 num_vertex_attributes;
 * }}</pre>
 */
public class SDL_GPUVertexInputState extends Struct<SDL_GPUVertexInputState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEX_BUFFER_DESCRIPTIONS,
        NUM_VERTEX_BUFFERS,
        VERTEX_ATTRIBUTES,
        NUM_VERTEX_ATTRIBUTES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEX_BUFFER_DESCRIPTIONS = layout.offsetof(0);
        NUM_VERTEX_BUFFERS = layout.offsetof(1);
        VERTEX_ATTRIBUTES = layout.offsetof(2);
        NUM_VERTEX_ATTRIBUTES = layout.offsetof(3);
    }

    protected SDL_GPUVertexInputState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUVertexInputState create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUVertexInputState(address, container);
    }

    /**
     * Creates a {@code SDL_GPUVertexInputState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUVertexInputState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SDL_GPUVertexBufferDescription.Buffer} view of the struct array pointed to by the {@code vertex_buffer_descriptions} field. */
    @NativeType("SDL_GPUVertexBufferDescription const *")
    public SDL_GPUVertexBufferDescription.@Nullable Buffer vertex_buffer_descriptions() { return nvertex_buffer_descriptions(address()); }
    /** @return the value of the {@code num_vertex_buffers} field. */
    @NativeType("Uint32")
    public int num_vertex_buffers() { return nnum_vertex_buffers(address()); }
    /** @return a {@link SDL_GPUVertexAttribute.Buffer} view of the struct array pointed to by the {@code vertex_attributes} field. */
    @NativeType("SDL_GPUVertexAttribute const *")
    public SDL_GPUVertexAttribute.@Nullable Buffer vertex_attributes() { return nvertex_attributes(address()); }
    /** @return the value of the {@code num_vertex_attributes} field. */
    @NativeType("Uint32")
    public int num_vertex_attributes() { return nnum_vertex_attributes(address()); }

    /** Sets the address of the specified {@link SDL_GPUVertexBufferDescription.Buffer} to the {@code vertex_buffer_descriptions} field. */
    public SDL_GPUVertexInputState vertex_buffer_descriptions(@NativeType("SDL_GPUVertexBufferDescription const *") SDL_GPUVertexBufferDescription.@Nullable Buffer value) { nvertex_buffer_descriptions(address(), value); return this; }
    /** Sets the specified value to the {@code num_vertex_buffers} field. */
    public SDL_GPUVertexInputState num_vertex_buffers(@NativeType("Uint32") int value) { nnum_vertex_buffers(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_GPUVertexAttribute.Buffer} to the {@code vertex_attributes} field. */
    public SDL_GPUVertexInputState vertex_attributes(@NativeType("SDL_GPUVertexAttribute const *") SDL_GPUVertexAttribute.@Nullable Buffer value) { nvertex_attributes(address(), value); return this; }
    /** Sets the specified value to the {@code num_vertex_attributes} field. */
    public SDL_GPUVertexInputState num_vertex_attributes(@NativeType("Uint32") int value) { nnum_vertex_attributes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUVertexInputState set(
        SDL_GPUVertexBufferDescription.@Nullable Buffer vertex_buffer_descriptions,
        int num_vertex_buffers,
        SDL_GPUVertexAttribute.@Nullable Buffer vertex_attributes,
        int num_vertex_attributes
    ) {
        vertex_buffer_descriptions(vertex_buffer_descriptions);
        num_vertex_buffers(num_vertex_buffers);
        vertex_attributes(vertex_attributes);
        num_vertex_attributes(num_vertex_attributes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUVertexInputState set(SDL_GPUVertexInputState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUVertexInputState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUVertexInputState malloc() {
        return new SDL_GPUVertexInputState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVertexInputState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUVertexInputState calloc() {
        return new SDL_GPUVertexInputState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVertexInputState} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUVertexInputState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVertexInputState(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUVertexInputState} instance for the specified memory address. */
    public static SDL_GPUVertexInputState create(long address) {
        return new SDL_GPUVertexInputState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUVertexInputState createSafe(long address) {
        return address == NULL ? null : new SDL_GPUVertexInputState(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUVertexInputState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexInputState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexInputState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexInputState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexInputState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexInputState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUVertexInputState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexInputState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUVertexInputState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUVertexInputState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVertexInputState malloc(MemoryStack stack) {
        return new SDL_GPUVertexInputState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUVertexInputState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVertexInputState calloc(MemoryStack stack) {
        return new SDL_GPUVertexInputState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUVertexInputState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexInputState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexInputState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexInputState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertex_buffer_descriptions}. */
    public static SDL_GPUVertexBufferDescription.@Nullable Buffer nvertex_buffer_descriptions(long struct) { return SDL_GPUVertexBufferDescription.createSafe(memGetAddress(struct + SDL_GPUVertexInputState.VERTEX_BUFFER_DESCRIPTIONS), nnum_vertex_buffers(struct)); }
    /** Unsafe version of {@link #num_vertex_buffers}. */
    public static int nnum_vertex_buffers(long struct) { return memGetInt(struct + SDL_GPUVertexInputState.NUM_VERTEX_BUFFERS); }
    /** Unsafe version of {@link #vertex_attributes}. */
    public static SDL_GPUVertexAttribute.@Nullable Buffer nvertex_attributes(long struct) { return SDL_GPUVertexAttribute.createSafe(memGetAddress(struct + SDL_GPUVertexInputState.VERTEX_ATTRIBUTES), nnum_vertex_attributes(struct)); }
    /** Unsafe version of {@link #num_vertex_attributes}. */
    public static int nnum_vertex_attributes(long struct) { return memGetInt(struct + SDL_GPUVertexInputState.NUM_VERTEX_ATTRIBUTES); }

    /** Unsafe version of {@link #vertex_buffer_descriptions(SDL_GPUVertexBufferDescription.Buffer) vertex_buffer_descriptions}. */
    public static void nvertex_buffer_descriptions(long struct, SDL_GPUVertexBufferDescription.@Nullable Buffer value) { memPutAddress(struct + SDL_GPUVertexInputState.VERTEX_BUFFER_DESCRIPTIONS, memAddressSafe(value)); nnum_vertex_buffers(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code num_vertex_buffers} field of the specified {@code struct}. */
    public static void nnum_vertex_buffers(long struct, int value) { memPutInt(struct + SDL_GPUVertexInputState.NUM_VERTEX_BUFFERS, value); }
    /** Unsafe version of {@link #vertex_attributes(SDL_GPUVertexAttribute.Buffer) vertex_attributes}. */
    public static void nvertex_attributes(long struct, SDL_GPUVertexAttribute.@Nullable Buffer value) { memPutAddress(struct + SDL_GPUVertexInputState.VERTEX_ATTRIBUTES, memAddressSafe(value)); nnum_vertex_attributes(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code num_vertex_attributes} field of the specified {@code struct}. */
    public static void nnum_vertex_attributes(long struct, int value) { memPutInt(struct + SDL_GPUVertexInputState.NUM_VERTEX_ATTRIBUTES, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUVertexInputState} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUVertexInputState, Buffer> implements NativeResource {

        private static final SDL_GPUVertexInputState ELEMENT_FACTORY = SDL_GPUVertexInputState.create(-1L);

        /**
         * Creates a new {@code SDL_GPUVertexInputState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUVertexInputState#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUVertexInputState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SDL_GPUVertexBufferDescription.Buffer} view of the struct array pointed to by the {@code vertex_buffer_descriptions} field. */
        @NativeType("SDL_GPUVertexBufferDescription const *")
        public SDL_GPUVertexBufferDescription.@Nullable Buffer vertex_buffer_descriptions() { return SDL_GPUVertexInputState.nvertex_buffer_descriptions(address()); }
        /** @return the value of the {@code num_vertex_buffers} field. */
        @NativeType("Uint32")
        public int num_vertex_buffers() { return SDL_GPUVertexInputState.nnum_vertex_buffers(address()); }
        /** @return a {@link SDL_GPUVertexAttribute.Buffer} view of the struct array pointed to by the {@code vertex_attributes} field. */
        @NativeType("SDL_GPUVertexAttribute const *")
        public SDL_GPUVertexAttribute.@Nullable Buffer vertex_attributes() { return SDL_GPUVertexInputState.nvertex_attributes(address()); }
        /** @return the value of the {@code num_vertex_attributes} field. */
        @NativeType("Uint32")
        public int num_vertex_attributes() { return SDL_GPUVertexInputState.nnum_vertex_attributes(address()); }

        /** Sets the address of the specified {@link SDL_GPUVertexBufferDescription.Buffer} to the {@code vertex_buffer_descriptions} field. */
        public SDL_GPUVertexInputState.Buffer vertex_buffer_descriptions(@NativeType("SDL_GPUVertexBufferDescription const *") SDL_GPUVertexBufferDescription.@Nullable Buffer value) { SDL_GPUVertexInputState.nvertex_buffer_descriptions(address(), value); return this; }
        /** Sets the specified value to the {@code num_vertex_buffers} field. */
        public SDL_GPUVertexInputState.Buffer num_vertex_buffers(@NativeType("Uint32") int value) { SDL_GPUVertexInputState.nnum_vertex_buffers(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_GPUVertexAttribute.Buffer} to the {@code vertex_attributes} field. */
        public SDL_GPUVertexInputState.Buffer vertex_attributes(@NativeType("SDL_GPUVertexAttribute const *") SDL_GPUVertexAttribute.@Nullable Buffer value) { SDL_GPUVertexInputState.nvertex_attributes(address(), value); return this; }
        /** Sets the specified value to the {@code num_vertex_attributes} field. */
        public SDL_GPUVertexInputState.Buffer num_vertex_attributes(@NativeType("Uint32") int value) { SDL_GPUVertexInputState.nnum_vertex_attributes(address(), value); return this; }

    }

}