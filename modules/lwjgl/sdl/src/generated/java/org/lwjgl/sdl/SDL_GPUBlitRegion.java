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
 * struct SDL_GPUBlitRegion {
 *     SDL_GPUTexture * texture;
 *     Uint32 mip_level;
 *     Uint32 layer_or_depth_plane;
 *     Uint32 x;
 *     Uint32 y;
 *     Uint32 w;
 *     Uint32 h;
 * }}</pre>
 */
public class SDL_GPUBlitRegion extends Struct<SDL_GPUBlitRegion> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        MIP_LEVEL,
        LAYER_OR_DEPTH_PLANE,
        X,
        Y,
        W,
        H;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
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
        LAYER_OR_DEPTH_PLANE = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        W = layout.offsetof(5);
        H = layout.offsetof(6);
    }

    protected SDL_GPUBlitRegion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUBlitRegion create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUBlitRegion(address, container);
    }

    /**
     * Creates a {@code SDL_GPUBlitRegion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUBlitRegion(ByteBuffer container) {
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
    /** @return the value of the {@code layer_or_depth_plane} field. */
    @NativeType("Uint32")
    public int layer_or_depth_plane() { return nlayer_or_depth_plane(address()); }
    /** @return the value of the {@code x} field. */
    @NativeType("Uint32")
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("Uint32")
    public int y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    @NativeType("Uint32")
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    @NativeType("Uint32")
    public int h() { return nh(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUBlitRegion texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code mip_level} field. */
    public SDL_GPUBlitRegion mip_level(@NativeType("Uint32") int value) { nmip_level(address(), value); return this; }
    /** Sets the specified value to the {@code layer_or_depth_plane} field. */
    public SDL_GPUBlitRegion layer_or_depth_plane(@NativeType("Uint32") int value) { nlayer_or_depth_plane(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_GPUBlitRegion x(@NativeType("Uint32") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_GPUBlitRegion y(@NativeType("Uint32") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_GPUBlitRegion w(@NativeType("Uint32") int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_GPUBlitRegion h(@NativeType("Uint32") int value) { nh(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUBlitRegion set(
        long texture,
        int mip_level,
        int layer_or_depth_plane,
        int x,
        int y,
        int w,
        int h
    ) {
        texture(texture);
        mip_level(mip_level);
        layer_or_depth_plane(layer_or_depth_plane);
        x(x);
        y(y);
        w(w);
        h(h);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUBlitRegion set(SDL_GPUBlitRegion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUBlitRegion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUBlitRegion malloc() {
        return new SDL_GPUBlitRegion(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBlitRegion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUBlitRegion calloc() {
        return new SDL_GPUBlitRegion(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBlitRegion} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUBlitRegion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBlitRegion(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUBlitRegion} instance for the specified memory address. */
    public static SDL_GPUBlitRegion create(long address) {
        return new SDL_GPUBlitRegion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUBlitRegion createSafe(long address) {
        return address == NULL ? null : new SDL_GPUBlitRegion(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUBlitRegion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitRegion.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBlitRegion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitRegion.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBlitRegion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitRegion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUBlitRegion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitRegion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUBlitRegion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUBlitRegion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBlitRegion malloc(MemoryStack stack) {
        return new SDL_GPUBlitRegion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUBlitRegion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBlitRegion calloc(MemoryStack stack) {
        return new SDL_GPUBlitRegion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUBlitRegion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitRegion.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBlitRegion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBlitRegion.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUBlitRegion.TEXTURE); }
    /** Unsafe version of {@link #mip_level}. */
    public static int nmip_level(long struct) { return memGetInt(struct + SDL_GPUBlitRegion.MIP_LEVEL); }
    /** Unsafe version of {@link #layer_or_depth_plane}. */
    public static int nlayer_or_depth_plane(long struct) { return memGetInt(struct + SDL_GPUBlitRegion.LAYER_OR_DEPTH_PLANE); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + SDL_GPUBlitRegion.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + SDL_GPUBlitRegion.Y); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + SDL_GPUBlitRegion.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + SDL_GPUBlitRegion.H); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUBlitRegion.TEXTURE, check(value)); }
    /** Unsafe version of {@link #mip_level(int) mip_level}. */
    public static void nmip_level(long struct, int value) { memPutInt(struct + SDL_GPUBlitRegion.MIP_LEVEL, value); }
    /** Unsafe version of {@link #layer_or_depth_plane(int) layer_or_depth_plane}. */
    public static void nlayer_or_depth_plane(long struct, int value) { memPutInt(struct + SDL_GPUBlitRegion.LAYER_OR_DEPTH_PLANE, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + SDL_GPUBlitRegion.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + SDL_GPUBlitRegion.Y, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + SDL_GPUBlitRegion.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + SDL_GPUBlitRegion.H, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUBlitRegion.TEXTURE));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUBlitRegion} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUBlitRegion, Buffer> implements NativeResource {

        private static final SDL_GPUBlitRegion ELEMENT_FACTORY = SDL_GPUBlitRegion.create(-1L);

        /**
         * Creates a new {@code SDL_GPUBlitRegion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUBlitRegion#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUBlitRegion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUBlitRegion.ntexture(address()); }
        /** @return the value of the {@code mip_level} field. */
        @NativeType("Uint32")
        public int mip_level() { return SDL_GPUBlitRegion.nmip_level(address()); }
        /** @return the value of the {@code layer_or_depth_plane} field. */
        @NativeType("Uint32")
        public int layer_or_depth_plane() { return SDL_GPUBlitRegion.nlayer_or_depth_plane(address()); }
        /** @return the value of the {@code x} field. */
        @NativeType("Uint32")
        public int x() { return SDL_GPUBlitRegion.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("Uint32")
        public int y() { return SDL_GPUBlitRegion.ny(address()); }
        /** @return the value of the {@code w} field. */
        @NativeType("Uint32")
        public int w() { return SDL_GPUBlitRegion.nw(address()); }
        /** @return the value of the {@code h} field. */
        @NativeType("Uint32")
        public int h() { return SDL_GPUBlitRegion.nh(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUBlitRegion.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUBlitRegion.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code mip_level} field. */
        public SDL_GPUBlitRegion.Buffer mip_level(@NativeType("Uint32") int value) { SDL_GPUBlitRegion.nmip_level(address(), value); return this; }
        /** Sets the specified value to the {@code layer_or_depth_plane} field. */
        public SDL_GPUBlitRegion.Buffer layer_or_depth_plane(@NativeType("Uint32") int value) { SDL_GPUBlitRegion.nlayer_or_depth_plane(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_GPUBlitRegion.Buffer x(@NativeType("Uint32") int value) { SDL_GPUBlitRegion.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_GPUBlitRegion.Buffer y(@NativeType("Uint32") int value) { SDL_GPUBlitRegion.ny(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_GPUBlitRegion.Buffer w(@NativeType("Uint32") int value) { SDL_GPUBlitRegion.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_GPUBlitRegion.Buffer h(@NativeType("Uint32") int value) { SDL_GPUBlitRegion.nh(address(), value); return this; }

    }

}