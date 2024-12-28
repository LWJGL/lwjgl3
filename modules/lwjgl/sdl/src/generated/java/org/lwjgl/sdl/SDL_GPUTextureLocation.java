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
 * struct SDL_GPUTextureLocation {
 *     SDL_GPUTexture * texture;
 *     Uint32 mip_level;
 *     Uint32 layer;
 *     Uint32 x;
 *     Uint32 y;
 *     Uint32 z;
 * }}</pre>
 */
public class SDL_GPUTextureLocation extends Struct<SDL_GPUTextureLocation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        MIP_LEVEL,
        LAYER,
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        Z = layout.offsetof(5);
    }

    protected SDL_GPUTextureLocation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTextureLocation create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTextureLocation(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTextureLocation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTextureLocation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code texture} field. */
    @NativeType("SDL_GPUTexture *")
    public long texture() { return ntexture(address()); }
    /** @return the value of the {@code mip_level} field. */
    @NativeType("Uint32")
    public int mip_level() { return nmip_level(address()); }
    /** @return the value of the {@code layer} field. */
    @NativeType("Uint32")
    public int layer() { return nlayer(address()); }
    /** @return the value of the {@code x} field. */
    @NativeType("Uint32")
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("Uint32")
    public int y() { return ny(address()); }
    /** @return the value of the {@code z} field. */
    @NativeType("Uint32")
    public int z() { return nz(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUTextureLocation texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code mip_level} field. */
    public SDL_GPUTextureLocation mip_level(@NativeType("Uint32") int value) { nmip_level(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public SDL_GPUTextureLocation layer(@NativeType("Uint32") int value) { nlayer(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_GPUTextureLocation x(@NativeType("Uint32") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_GPUTextureLocation y(@NativeType("Uint32") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public SDL_GPUTextureLocation z(@NativeType("Uint32") int value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTextureLocation set(
        long texture,
        int mip_level,
        int layer,
        int x,
        int y,
        int z
    ) {
        texture(texture);
        mip_level(mip_level);
        layer(layer);
        x(x);
        y(y);
        z(z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUTextureLocation set(SDL_GPUTextureLocation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTextureLocation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureLocation malloc() {
        return new SDL_GPUTextureLocation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureLocation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureLocation calloc() {
        return new SDL_GPUTextureLocation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureLocation} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTextureLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureLocation(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTextureLocation} instance for the specified memory address. */
    public static SDL_GPUTextureLocation create(long address) {
        return new SDL_GPUTextureLocation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTextureLocation createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTextureLocation(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureLocation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureLocation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureLocation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureLocation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureLocation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureLocation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTextureLocation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureLocation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTextureLocation.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTextureLocation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureLocation malloc(MemoryStack stack) {
        return new SDL_GPUTextureLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTextureLocation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureLocation calloc(MemoryStack stack) {
        return new SDL_GPUTextureLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureLocation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureLocation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureLocation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureLocation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUTextureLocation.TEXTURE); }
    /** Unsafe version of {@link #mip_level}. */
    public static int nmip_level(long struct) { return memGetInt(struct + SDL_GPUTextureLocation.MIP_LEVEL); }
    /** Unsafe version of {@link #layer}. */
    public static int nlayer(long struct) { return memGetInt(struct + SDL_GPUTextureLocation.LAYER); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + SDL_GPUTextureLocation.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + SDL_GPUTextureLocation.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return memGetInt(struct + SDL_GPUTextureLocation.Z); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUTextureLocation.TEXTURE, check(value)); }
    /** Unsafe version of {@link #mip_level(int) mip_level}. */
    public static void nmip_level(long struct, int value) { memPutInt(struct + SDL_GPUTextureLocation.MIP_LEVEL, value); }
    /** Unsafe version of {@link #layer(int) layer}. */
    public static void nlayer(long struct, int value) { memPutInt(struct + SDL_GPUTextureLocation.LAYER, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + SDL_GPUTextureLocation.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + SDL_GPUTextureLocation.Y, value); }
    /** Unsafe version of {@link #z(int) z}. */
    public static void nz(long struct, int value) { memPutInt(struct + SDL_GPUTextureLocation.Z, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUTextureLocation.TEXTURE));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUTextureLocation} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTextureLocation, Buffer> implements NativeResource {

        private static final SDL_GPUTextureLocation ELEMENT_FACTORY = SDL_GPUTextureLocation.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTextureLocation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTextureLocation#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTextureLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUTextureLocation.ntexture(address()); }
        /** @return the value of the {@code mip_level} field. */
        @NativeType("Uint32")
        public int mip_level() { return SDL_GPUTextureLocation.nmip_level(address()); }
        /** @return the value of the {@code layer} field. */
        @NativeType("Uint32")
        public int layer() { return SDL_GPUTextureLocation.nlayer(address()); }
        /** @return the value of the {@code x} field. */
        @NativeType("Uint32")
        public int x() { return SDL_GPUTextureLocation.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("Uint32")
        public int y() { return SDL_GPUTextureLocation.ny(address()); }
        /** @return the value of the {@code z} field. */
        @NativeType("Uint32")
        public int z() { return SDL_GPUTextureLocation.nz(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUTextureLocation.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUTextureLocation.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code mip_level} field. */
        public SDL_GPUTextureLocation.Buffer mip_level(@NativeType("Uint32") int value) { SDL_GPUTextureLocation.nmip_level(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public SDL_GPUTextureLocation.Buffer layer(@NativeType("Uint32") int value) { SDL_GPUTextureLocation.nlayer(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_GPUTextureLocation.Buffer x(@NativeType("Uint32") int value) { SDL_GPUTextureLocation.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_GPUTextureLocation.Buffer y(@NativeType("Uint32") int value) { SDL_GPUTextureLocation.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public SDL_GPUTextureLocation.Buffer z(@NativeType("Uint32") int value) { SDL_GPUTextureLocation.nz(address(), value); return this; }

    }

}