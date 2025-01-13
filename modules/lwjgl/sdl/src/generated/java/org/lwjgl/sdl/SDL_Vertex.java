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
 * struct SDL_Vertex {
 *     {@link SDL_FPoint SDL_FPoint} position;
 *     {@link SDL_FColor SDL_FColor} color;
 *     {@link SDL_FPoint SDL_FPoint} tex_coord;
 * }}</pre>
 */
public class SDL_Vertex extends Struct<SDL_Vertex> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITION,
        COLOR,
        TEX_COORD;

    static {
        Layout layout = __struct(
            __member(SDL_FPoint.SIZEOF, SDL_FPoint.ALIGNOF),
            __member(SDL_FColor.SIZEOF, SDL_FColor.ALIGNOF),
            __member(SDL_FPoint.SIZEOF, SDL_FPoint.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITION = layout.offsetof(0);
        COLOR = layout.offsetof(1);
        TEX_COORD = layout.offsetof(2);
    }

    protected SDL_Vertex(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Vertex create(long address, @Nullable ByteBuffer container) {
        return new SDL_Vertex(address, container);
    }

    /**
     * Creates a {@code SDL_Vertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Vertex(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SDL_FPoint} view of the {@code position} field. */
    public SDL_FPoint position$() { return nposition$(address()); }
    /** @return a {@link SDL_FColor} view of the {@code color} field. */
    public SDL_FColor color() { return ncolor(address()); }
    /** @return a {@link SDL_FPoint} view of the {@code tex_coord} field. */
    public SDL_FPoint tex_coord() { return ntex_coord(address()); }

    /** Copies the specified {@link SDL_FPoint} to the {@code position} field. */
    public SDL_Vertex position$(SDL_FPoint value) { nposition$(address(), value); return this; }
    /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Vertex position$(java.util.function.Consumer<SDL_FPoint> consumer) { consumer.accept(position$()); return this; }
    /** Copies the specified {@link SDL_FColor} to the {@code color} field. */
    public SDL_Vertex color(SDL_FColor value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Vertex color(java.util.function.Consumer<SDL_FColor> consumer) { consumer.accept(color()); return this; }
    /** Copies the specified {@link SDL_FPoint} to the {@code tex_coord} field. */
    public SDL_Vertex tex_coord(SDL_FPoint value) { ntex_coord(address(), value); return this; }
    /** Passes the {@code tex_coord} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Vertex tex_coord(java.util.function.Consumer<SDL_FPoint> consumer) { consumer.accept(tex_coord()); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Vertex set(
        SDL_FPoint position$,
        SDL_FColor color,
        SDL_FPoint tex_coord
    ) {
        position$(position$);
        color(color);
        tex_coord(tex_coord);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Vertex set(SDL_Vertex src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Vertex} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Vertex malloc() {
        return new SDL_Vertex(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Vertex} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Vertex calloc() {
        return new SDL_Vertex(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Vertex} instance allocated with {@link BufferUtils}. */
    public static SDL_Vertex create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Vertex(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Vertex} instance for the specified memory address. */
    public static SDL_Vertex create(long address) {
        return new SDL_Vertex(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Vertex createSafe(long address) {
        return address == NULL ? null : new SDL_Vertex(address, null);
    }

    /**
     * Returns a new {@link SDL_Vertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Vertex.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Vertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Vertex.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Vertex.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Vertex.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Vertex.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Vertex.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Vertex.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Vertex} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Vertex malloc(MemoryStack stack) {
        return new SDL_Vertex(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Vertex} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Vertex calloc(MemoryStack stack) {
        return new SDL_Vertex(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Vertex.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Vertex.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Vertex.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Vertex.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #position$}. */
    public static SDL_FPoint nposition$(long struct) { return SDL_FPoint.create(struct + SDL_Vertex.POSITION); }
    /** Unsafe version of {@link #color}. */
    public static SDL_FColor ncolor(long struct) { return SDL_FColor.create(struct + SDL_Vertex.COLOR); }
    /** Unsafe version of {@link #tex_coord}. */
    public static SDL_FPoint ntex_coord(long struct) { return SDL_FPoint.create(struct + SDL_Vertex.TEX_COORD); }

    /** Unsafe version of {@link #position$(SDL_FPoint) position$}. */
    public static void nposition$(long struct, SDL_FPoint value) { memCopy(value.address(), struct + SDL_Vertex.POSITION, SDL_FPoint.SIZEOF); }
    /** Unsafe version of {@link #color(SDL_FColor) color}. */
    public static void ncolor(long struct, SDL_FColor value) { memCopy(value.address(), struct + SDL_Vertex.COLOR, SDL_FColor.SIZEOF); }
    /** Unsafe version of {@link #tex_coord(SDL_FPoint) tex_coord}. */
    public static void ntex_coord(long struct, SDL_FPoint value) { memCopy(value.address(), struct + SDL_Vertex.TEX_COORD, SDL_FPoint.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SDL_Vertex} structs. */
    public static class Buffer extends StructBuffer<SDL_Vertex, Buffer> implements NativeResource {

        private static final SDL_Vertex ELEMENT_FACTORY = SDL_Vertex.create(-1L);

        /**
         * Creates a new {@code SDL_Vertex.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Vertex#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Vertex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SDL_FPoint} view of the {@code position} field. */
        public SDL_FPoint position$() { return SDL_Vertex.nposition$(address()); }
        /** @return a {@link SDL_FColor} view of the {@code color} field. */
        public SDL_FColor color() { return SDL_Vertex.ncolor(address()); }
        /** @return a {@link SDL_FPoint} view of the {@code tex_coord} field. */
        public SDL_FPoint tex_coord() { return SDL_Vertex.ntex_coord(address()); }

        /** Copies the specified {@link SDL_FPoint} to the {@code position} field. */
        public SDL_Vertex.Buffer position$(SDL_FPoint value) { SDL_Vertex.nposition$(address(), value); return this; }
        /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Vertex.Buffer position$(java.util.function.Consumer<SDL_FPoint> consumer) { consumer.accept(position$()); return this; }
        /** Copies the specified {@link SDL_FColor} to the {@code color} field. */
        public SDL_Vertex.Buffer color(SDL_FColor value) { SDL_Vertex.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Vertex.Buffer color(java.util.function.Consumer<SDL_FColor> consumer) { consumer.accept(color()); return this; }
        /** Copies the specified {@link SDL_FPoint} to the {@code tex_coord} field. */
        public SDL_Vertex.Buffer tex_coord(SDL_FPoint value) { SDL_Vertex.ntex_coord(address(), value); return this; }
        /** Passes the {@code tex_coord} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Vertex.Buffer tex_coord(java.util.function.Consumer<SDL_FPoint> consumer) { consumer.accept(tex_coord()); return this; }

    }

}