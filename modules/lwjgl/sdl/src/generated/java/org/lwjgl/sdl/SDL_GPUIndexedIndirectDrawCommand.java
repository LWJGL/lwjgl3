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
 * struct SDL_GPUIndexedIndirectDrawCommand {
 *     Uint32 num_indices;
 *     Uint32 num_instances;
 *     Uint32 first_index;
 *     Sint32 vertex_offset;
 *     Uint32 first_instance;
 * }}</pre>
 */
public class SDL_GPUIndexedIndirectDrawCommand extends Struct<SDL_GPUIndexedIndirectDrawCommand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_INDICES,
        NUM_INSTANCES,
        FIRST_INDEX,
        VERTEX_OFFSET,
        FIRST_INSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_INDICES = layout.offsetof(0);
        NUM_INSTANCES = layout.offsetof(1);
        FIRST_INDEX = layout.offsetof(2);
        VERTEX_OFFSET = layout.offsetof(3);
        FIRST_INSTANCE = layout.offsetof(4);
    }

    protected SDL_GPUIndexedIndirectDrawCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUIndexedIndirectDrawCommand create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUIndexedIndirectDrawCommand(address, container);
    }

    /**
     * Creates a {@code SDL_GPUIndexedIndirectDrawCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUIndexedIndirectDrawCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_indices} field. */
    @NativeType("Uint32")
    public int num_indices() { return nnum_indices(address()); }
    /** @return the value of the {@code num_instances} field. */
    @NativeType("Uint32")
    public int num_instances() { return nnum_instances(address()); }
    /** @return the value of the {@code first_index} field. */
    @NativeType("Uint32")
    public int first_index() { return nfirst_index(address()); }
    /** @return the value of the {@code vertex_offset} field. */
    @NativeType("Sint32")
    public int vertex_offset() { return nvertex_offset(address()); }
    /** @return the value of the {@code first_instance} field. */
    @NativeType("Uint32")
    public int first_instance() { return nfirst_instance(address()); }

    /** Sets the specified value to the {@code num_indices} field. */
    public SDL_GPUIndexedIndirectDrawCommand num_indices(@NativeType("Uint32") int value) { nnum_indices(address(), value); return this; }
    /** Sets the specified value to the {@code num_instances} field. */
    public SDL_GPUIndexedIndirectDrawCommand num_instances(@NativeType("Uint32") int value) { nnum_instances(address(), value); return this; }
    /** Sets the specified value to the {@code first_index} field. */
    public SDL_GPUIndexedIndirectDrawCommand first_index(@NativeType("Uint32") int value) { nfirst_index(address(), value); return this; }
    /** Sets the specified value to the {@code vertex_offset} field. */
    public SDL_GPUIndexedIndirectDrawCommand vertex_offset(@NativeType("Sint32") int value) { nvertex_offset(address(), value); return this; }
    /** Sets the specified value to the {@code first_instance} field. */
    public SDL_GPUIndexedIndirectDrawCommand first_instance(@NativeType("Uint32") int value) { nfirst_instance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUIndexedIndirectDrawCommand set(
        int num_indices,
        int num_instances,
        int first_index,
        int vertex_offset,
        int first_instance
    ) {
        num_indices(num_indices);
        num_instances(num_instances);
        first_index(first_index);
        vertex_offset(vertex_offset);
        first_instance(first_instance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUIndexedIndirectDrawCommand set(SDL_GPUIndexedIndirectDrawCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUIndexedIndirectDrawCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUIndexedIndirectDrawCommand malloc() {
        return new SDL_GPUIndexedIndirectDrawCommand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUIndexedIndirectDrawCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUIndexedIndirectDrawCommand calloc() {
        return new SDL_GPUIndexedIndirectDrawCommand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUIndexedIndirectDrawCommand} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUIndexedIndirectDrawCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUIndexedIndirectDrawCommand(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUIndexedIndirectDrawCommand} instance for the specified memory address. */
    public static SDL_GPUIndexedIndirectDrawCommand create(long address) {
        return new SDL_GPUIndexedIndirectDrawCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUIndexedIndirectDrawCommand createSafe(long address) {
        return address == NULL ? null : new SDL_GPUIndexedIndirectDrawCommand(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUIndexedIndirectDrawCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndexedIndirectDrawCommand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndexedIndirectDrawCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndexedIndirectDrawCommand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndexedIndirectDrawCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndexedIndirectDrawCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUIndexedIndirectDrawCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndexedIndirectDrawCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUIndexedIndirectDrawCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUIndexedIndirectDrawCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUIndexedIndirectDrawCommand malloc(MemoryStack stack) {
        return new SDL_GPUIndexedIndirectDrawCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUIndexedIndirectDrawCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUIndexedIndirectDrawCommand calloc(MemoryStack stack) {
        return new SDL_GPUIndexedIndirectDrawCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUIndexedIndirectDrawCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndexedIndirectDrawCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndexedIndirectDrawCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndexedIndirectDrawCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_indices}. */
    public static int nnum_indices(long struct) { return memGetInt(struct + SDL_GPUIndexedIndirectDrawCommand.NUM_INDICES); }
    /** Unsafe version of {@link #num_instances}. */
    public static int nnum_instances(long struct) { return memGetInt(struct + SDL_GPUIndexedIndirectDrawCommand.NUM_INSTANCES); }
    /** Unsafe version of {@link #first_index}. */
    public static int nfirst_index(long struct) { return memGetInt(struct + SDL_GPUIndexedIndirectDrawCommand.FIRST_INDEX); }
    /** Unsafe version of {@link #vertex_offset}. */
    public static int nvertex_offset(long struct) { return memGetInt(struct + SDL_GPUIndexedIndirectDrawCommand.VERTEX_OFFSET); }
    /** Unsafe version of {@link #first_instance}. */
    public static int nfirst_instance(long struct) { return memGetInt(struct + SDL_GPUIndexedIndirectDrawCommand.FIRST_INSTANCE); }

    /** Unsafe version of {@link #num_indices(int) num_indices}. */
    public static void nnum_indices(long struct, int value) { memPutInt(struct + SDL_GPUIndexedIndirectDrawCommand.NUM_INDICES, value); }
    /** Unsafe version of {@link #num_instances(int) num_instances}. */
    public static void nnum_instances(long struct, int value) { memPutInt(struct + SDL_GPUIndexedIndirectDrawCommand.NUM_INSTANCES, value); }
    /** Unsafe version of {@link #first_index(int) first_index}. */
    public static void nfirst_index(long struct, int value) { memPutInt(struct + SDL_GPUIndexedIndirectDrawCommand.FIRST_INDEX, value); }
    /** Unsafe version of {@link #vertex_offset(int) vertex_offset}. */
    public static void nvertex_offset(long struct, int value) { memPutInt(struct + SDL_GPUIndexedIndirectDrawCommand.VERTEX_OFFSET, value); }
    /** Unsafe version of {@link #first_instance(int) first_instance}. */
    public static void nfirst_instance(long struct, int value) { memPutInt(struct + SDL_GPUIndexedIndirectDrawCommand.FIRST_INSTANCE, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUIndexedIndirectDrawCommand} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUIndexedIndirectDrawCommand, Buffer> implements NativeResource {

        private static final SDL_GPUIndexedIndirectDrawCommand ELEMENT_FACTORY = SDL_GPUIndexedIndirectDrawCommand.create(-1L);

        /**
         * Creates a new {@code SDL_GPUIndexedIndirectDrawCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUIndexedIndirectDrawCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUIndexedIndirectDrawCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_indices} field. */
        @NativeType("Uint32")
        public int num_indices() { return SDL_GPUIndexedIndirectDrawCommand.nnum_indices(address()); }
        /** @return the value of the {@code num_instances} field. */
        @NativeType("Uint32")
        public int num_instances() { return SDL_GPUIndexedIndirectDrawCommand.nnum_instances(address()); }
        /** @return the value of the {@code first_index} field. */
        @NativeType("Uint32")
        public int first_index() { return SDL_GPUIndexedIndirectDrawCommand.nfirst_index(address()); }
        /** @return the value of the {@code vertex_offset} field. */
        @NativeType("Sint32")
        public int vertex_offset() { return SDL_GPUIndexedIndirectDrawCommand.nvertex_offset(address()); }
        /** @return the value of the {@code first_instance} field. */
        @NativeType("Uint32")
        public int first_instance() { return SDL_GPUIndexedIndirectDrawCommand.nfirst_instance(address()); }

        /** Sets the specified value to the {@code num_indices} field. */
        public SDL_GPUIndexedIndirectDrawCommand.Buffer num_indices(@NativeType("Uint32") int value) { SDL_GPUIndexedIndirectDrawCommand.nnum_indices(address(), value); return this; }
        /** Sets the specified value to the {@code num_instances} field. */
        public SDL_GPUIndexedIndirectDrawCommand.Buffer num_instances(@NativeType("Uint32") int value) { SDL_GPUIndexedIndirectDrawCommand.nnum_instances(address(), value); return this; }
        /** Sets the specified value to the {@code first_index} field. */
        public SDL_GPUIndexedIndirectDrawCommand.Buffer first_index(@NativeType("Uint32") int value) { SDL_GPUIndexedIndirectDrawCommand.nfirst_index(address(), value); return this; }
        /** Sets the specified value to the {@code vertex_offset} field. */
        public SDL_GPUIndexedIndirectDrawCommand.Buffer vertex_offset(@NativeType("Sint32") int value) { SDL_GPUIndexedIndirectDrawCommand.nvertex_offset(address(), value); return this; }
        /** Sets the specified value to the {@code first_instance} field. */
        public SDL_GPUIndexedIndirectDrawCommand.Buffer first_instance(@NativeType("Uint32") int value) { SDL_GPUIndexedIndirectDrawCommand.nfirst_instance(address(), value); return this; }

    }

}