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
 * struct SDL_GPUIndirectDispatchCommand {
 *     Uint32 groupcount_x;
 *     Uint32 groupcount_y;
 *     Uint32 groupcount_z;
 * }}</pre>
 */
public class SDL_GPUIndirectDispatchCommand extends Struct<SDL_GPUIndirectDispatchCommand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GROUPCOUNT_X,
        GROUPCOUNT_Y,
        GROUPCOUNT_Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GROUPCOUNT_X = layout.offsetof(0);
        GROUPCOUNT_Y = layout.offsetof(1);
        GROUPCOUNT_Z = layout.offsetof(2);
    }

    protected SDL_GPUIndirectDispatchCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUIndirectDispatchCommand create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUIndirectDispatchCommand(address, container);
    }

    /**
     * Creates a {@code SDL_GPUIndirectDispatchCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUIndirectDispatchCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code groupcount_x} field. */
    @NativeType("Uint32")
    public int groupcount_x() { return ngroupcount_x(address()); }
    /** @return the value of the {@code groupcount_y} field. */
    @NativeType("Uint32")
    public int groupcount_y() { return ngroupcount_y(address()); }
    /** @return the value of the {@code groupcount_z} field. */
    @NativeType("Uint32")
    public int groupcount_z() { return ngroupcount_z(address()); }

    /** Sets the specified value to the {@code groupcount_x} field. */
    public SDL_GPUIndirectDispatchCommand groupcount_x(@NativeType("Uint32") int value) { ngroupcount_x(address(), value); return this; }
    /** Sets the specified value to the {@code groupcount_y} field. */
    public SDL_GPUIndirectDispatchCommand groupcount_y(@NativeType("Uint32") int value) { ngroupcount_y(address(), value); return this; }
    /** Sets the specified value to the {@code groupcount_z} field. */
    public SDL_GPUIndirectDispatchCommand groupcount_z(@NativeType("Uint32") int value) { ngroupcount_z(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUIndirectDispatchCommand set(
        int groupcount_x,
        int groupcount_y,
        int groupcount_z
    ) {
        groupcount_x(groupcount_x);
        groupcount_y(groupcount_y);
        groupcount_z(groupcount_z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUIndirectDispatchCommand set(SDL_GPUIndirectDispatchCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUIndirectDispatchCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUIndirectDispatchCommand malloc() {
        return new SDL_GPUIndirectDispatchCommand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUIndirectDispatchCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUIndirectDispatchCommand calloc() {
        return new SDL_GPUIndirectDispatchCommand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUIndirectDispatchCommand} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUIndirectDispatchCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUIndirectDispatchCommand(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUIndirectDispatchCommand} instance for the specified memory address. */
    public static SDL_GPUIndirectDispatchCommand create(long address) {
        return new SDL_GPUIndirectDispatchCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUIndirectDispatchCommand createSafe(long address) {
        return address == NULL ? null : new SDL_GPUIndirectDispatchCommand(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDispatchCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDispatchCommand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDispatchCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDispatchCommand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDispatchCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDispatchCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUIndirectDispatchCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDispatchCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUIndirectDispatchCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUIndirectDispatchCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUIndirectDispatchCommand malloc(MemoryStack stack) {
        return new SDL_GPUIndirectDispatchCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUIndirectDispatchCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUIndirectDispatchCommand calloc(MemoryStack stack) {
        return new SDL_GPUIndirectDispatchCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDispatchCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDispatchCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUIndirectDispatchCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUIndirectDispatchCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #groupcount_x}. */
    public static int ngroupcount_x(long struct) { return memGetInt(struct + SDL_GPUIndirectDispatchCommand.GROUPCOUNT_X); }
    /** Unsafe version of {@link #groupcount_y}. */
    public static int ngroupcount_y(long struct) { return memGetInt(struct + SDL_GPUIndirectDispatchCommand.GROUPCOUNT_Y); }
    /** Unsafe version of {@link #groupcount_z}. */
    public static int ngroupcount_z(long struct) { return memGetInt(struct + SDL_GPUIndirectDispatchCommand.GROUPCOUNT_Z); }

    /** Unsafe version of {@link #groupcount_x(int) groupcount_x}. */
    public static void ngroupcount_x(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDispatchCommand.GROUPCOUNT_X, value); }
    /** Unsafe version of {@link #groupcount_y(int) groupcount_y}. */
    public static void ngroupcount_y(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDispatchCommand.GROUPCOUNT_Y, value); }
    /** Unsafe version of {@link #groupcount_z(int) groupcount_z}. */
    public static void ngroupcount_z(long struct, int value) { memPutInt(struct + SDL_GPUIndirectDispatchCommand.GROUPCOUNT_Z, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUIndirectDispatchCommand} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUIndirectDispatchCommand, Buffer> implements NativeResource {

        private static final SDL_GPUIndirectDispatchCommand ELEMENT_FACTORY = SDL_GPUIndirectDispatchCommand.create(-1L);

        /**
         * Creates a new {@code SDL_GPUIndirectDispatchCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUIndirectDispatchCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUIndirectDispatchCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code groupcount_x} field. */
        @NativeType("Uint32")
        public int groupcount_x() { return SDL_GPUIndirectDispatchCommand.ngroupcount_x(address()); }
        /** @return the value of the {@code groupcount_y} field. */
        @NativeType("Uint32")
        public int groupcount_y() { return SDL_GPUIndirectDispatchCommand.ngroupcount_y(address()); }
        /** @return the value of the {@code groupcount_z} field. */
        @NativeType("Uint32")
        public int groupcount_z() { return SDL_GPUIndirectDispatchCommand.ngroupcount_z(address()); }

        /** Sets the specified value to the {@code groupcount_x} field. */
        public SDL_GPUIndirectDispatchCommand.Buffer groupcount_x(@NativeType("Uint32") int value) { SDL_GPUIndirectDispatchCommand.ngroupcount_x(address(), value); return this; }
        /** Sets the specified value to the {@code groupcount_y} field. */
        public SDL_GPUIndirectDispatchCommand.Buffer groupcount_y(@NativeType("Uint32") int value) { SDL_GPUIndirectDispatchCommand.ngroupcount_y(address(), value); return this; }
        /** Sets the specified value to the {@code groupcount_z} field. */
        public SDL_GPUIndirectDispatchCommand.Buffer groupcount_z(@NativeType("Uint32") int value) { SDL_GPUIndirectDispatchCommand.ngroupcount_z(address(), value); return this; }

    }

}