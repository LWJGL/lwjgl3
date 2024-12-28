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
 * struct SDL_GPUIndirectDrawCommand {
 *     Uint32 num_vertices;
 *     Uint32 num_instances;
 *     Uint32 first_vertex;
 *     Uint32 first_instance;
 * }}</pre>
 */
public class SDL_GPUIndirectDrawCommand extends Struct<SDL_GPUIndirectDrawCommand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_VERTICES,
        NUM_INSTANCES,
        FIRST_VERTEX,
        FIRST_INSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_VERTICES = layout.offsetof(0);
        NUM_INSTANCES = layout.offsetof(1);
        FIRST_VERTEX = layout.offsetof(2);
        FIRST_INSTANCE = layout.offsetof(3);
    }

    protected SDL_GPUIndirectDrawCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUIndirectDrawCommand create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUIndirectDrawCommand(address, container);
    }

    /**
     * Creates a {@code SDL_GPUIndirectDrawCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUIndirectDrawCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_vertices} field. */
    @NativeType("Uint32")
    public int num_vertices() { return nnum_vertices(address()); }
    /** @return the value of the {@code num_instances} field. */
    @NativeType("Uint32")
    public int num_instances() { return nnum_instances(address()); }
    /** @return the value of the {@code first_vertex} field. */
    @NativeType("Uint32")
    public int first_vertex() { return nfirst_vertex(address()); }
    /** @return the value of the {@code first_instance} field. */
    @NativeType("Uint32")
    public int first_instance() { return nfirst_instance(address()); }

    /** Sets the specified value to the {@code num_vertices} field. */
    public SDL_GPUIndirectDrawCommand num_vertices(@NativeType("Uint32") int value) { nnum_vertices(address(), value); return this; }
    /** Sets the specified value to the {@code num_instances} field. */
    public SDL_GPUIndirectDrawCommand num_instances(@NativeType("Uint32") int value) { nnum_instances(address(), value); return this; }
    /** Sets the specified value to the {@code first_vertex} field. */
    public SDL_GPUIndirectDrawCommand first_vertex(@NativeType("Uint32") int value) { nfirst_vertex(address(), value); return this; }
    /** Sets the specified value to the {@code first_instance} field. */
    public SDL_GPUIndirectDrawCommand first_instance(@NativeType("Uint32") int value) { nfirst_instance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUIndirectDrawCommand set(
        int num_vertices,
        int num_instances,
        int first_vertex,
        int first_instance
    ) {
        num_vertices(num_vertices);
        num_instances(num_instances);
        first_vertex(first_vertex);
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
    public SDL_GPUIndirectDrawCommand set(SDL_GPUIndirectDrawCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUIndirectDrawCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUIndirectDrawCommand malloc() {
        return new SDL_GPUIndirectDrawCommand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUIndirectDrawCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUIndirectDrawCommand calloc() {
        return new SDL_GPUIndirectDrawCommand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUIndirectDrawCommand} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUIndirectDrawCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUIndirectDrawCommand(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUIndirectDrawCommand} instance for the specified memory address. */
    public static SDL_GPUIndirectDrawCommand create(long address) {
        return new SDL_GPUIndirectDrawCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUIndirectDrawCommand createSafe(long address) {
        return address == NULL ? null : new SDL_GPUIndirectDrawCommand(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDrawCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDrawCommand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDrawCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDrawCommand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDrawCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDrawCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUIndirectDrawCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDrawCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUIndirectDrawCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUIndirectDrawCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUIndirectDrawCommand malloc(MemoryStack stack) {
        return new SDL_GPUIndirectDrawCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUIndirectDrawCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUIndirectDrawCommand calloc(MemoryStack stack) {
        return new SDL_GPUIndirectDrawCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDrawCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDrawCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDrawCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDrawCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_vertices}. */
    public static int nnum_vertices(long struct) { return memGetInt(struct + SDL_GPUIndirectDrawCommand.NUM_VERTICES); }
    /** Unsafe version of {@link #num_instances}. */
    public static int nnum_instances(long struct) { return memGetInt(struct + SDL_GPUIndirectDrawCommand.NUM_INSTANCES); }
    /** Unsafe version of {@link #first_vertex}. */
    public static int nfirst_vertex(long struct) { return memGetInt(struct + SDL_GPUIndirectDrawCommand.FIRST_VERTEX); }
    /** Unsafe version of {@link #first_instance}. */
    public static int nfirst_instance(long struct) { return memGetInt(struct + SDL_GPUIndirectDrawCommand.FIRST_INSTANCE); }

    /** Unsafe version of {@link #num_vertices(int) num_vertices}. */
    public static void nnum_vertices(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDrawCommand.NUM_VERTICES, value); }
    /** Unsafe version of {@link #num_instances(int) num_instances}. */
    public static void nnum_instances(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDrawCommand.NUM_INSTANCES, value); }
    /** Unsafe version of {@link #first_vertex(int) first_vertex}. */
    public static void nfirst_vertex(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDrawCommand.FIRST_VERTEX, value); }
    /** Unsafe version of {@link #first_instance(int) first_instance}. */
    public static void nfirst_instance(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDrawCommand.FIRST_INSTANCE, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUIndirectDrawCommand} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUIndirectDrawCommand, Buffer> implements NativeResource {

        private static final SDL_GPUIndirectDrawCommand ELEMENT_FACTORY = SDL_GPUIndirectDrawCommand.create(-1L);

        /**
         * Creates a new {@code SDL_GPUIndirectDrawCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUIndirectDrawCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUIndirectDrawCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_vertices} field. */
        @NativeType("Uint32")
        public int num_vertices() { return SDL_GPUIndirectDrawCommand.nnum_vertices(address()); }
        /** @return the value of the {@code num_instances} field. */
        @NativeType("Uint32")
        public int num_instances() { return SDL_GPUIndirectDrawCommand.nnum_instances(address()); }
        /** @return the value of the {@code first_vertex} field. */
        @NativeType("Uint32")
        public int first_vertex() { return SDL_GPUIndirectDrawCommand.nfirst_vertex(address()); }
        /** @return the value of the {@code first_instance} field. */
        @NativeType("Uint32")
        public int first_instance() { return SDL_GPUIndirectDrawCommand.nfirst_instance(address()); }

        /** Sets the specified value to the {@code num_vertices} field. */
        public SDL_GPUIndirectDrawCommand.Buffer num_vertices(@NativeType("Uint32") int value) { SDL_GPUIndirectDrawCommand.nnum_vertices(address(), value); return this; }
        /** Sets the specified value to the {@code num_instances} field. */
        public SDL_GPUIndirectDrawCommand.Buffer num_instances(@NativeType("Uint32") int value) { SDL_GPUIndirectDrawCommand.nnum_instances(address(), value); return this; }
        /** Sets the specified value to the {@code first_vertex} field. */
        public SDL_GPUIndirectDrawCommand.Buffer first_vertex(@NativeType("Uint32") int value) { SDL_GPUIndirectDrawCommand.nfirst_vertex(address(), value); return this; }
        /** Sets the specified value to the {@code first_instance} field. */
        public SDL_GPUIndirectDrawCommand.Buffer first_instance(@NativeType("Uint32") int value) { SDL_GPUIndirectDrawCommand.nfirst_instance(address(), value); return this; }

    }

}