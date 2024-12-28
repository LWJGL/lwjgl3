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
 * struct SDL_GPUTextureRegion {
 *     SDL_GPUTexture * texture;
 *     Uint32 mip_level;
 *     Uint32 layer;
 *     Uint32 x;
 *     Uint32 y;
 *     Uint32 z;
 *     Uint32 w;
 *     Uint32 h;
 *     Uint32 d;
 * }}</pre>
 */
public class SDL_GPUTextureRegion extends Struct<SDL_GPUTextureRegion> implements NativeResource {

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
        Z,
        W,
        H,
        D;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
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
        LAYER = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        Z = layout.offsetof(5);
        W = layout.offsetof(6);
        H = layout.offsetof(7);
        D = layout.offsetof(8);
    }

    protected SDL_GPUTextureRegion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTextureRegion create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTextureRegion(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTextureRegion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTextureRegion(ByteBuffer container) {
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
    /** @return the value of the {@code w} field. */
    @NativeType("Uint32")
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    @NativeType("Uint32")
    public int h() { return nh(address()); }
    /** @return the value of the {@code d} field. */
    @NativeType("Uint32")
    public int d() { return nd(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUTextureRegion texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code mip_level} field. */
    public SDL_GPUTextureRegion mip_level(@NativeType("Uint32") int value) { nmip_level(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public SDL_GPUTextureRegion layer(@NativeType("Uint32") int value) { nlayer(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_GPUTextureRegion x(@NativeType("Uint32") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_GPUTextureRegion y(@NativeType("Uint32") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public SDL_GPUTextureRegion z(@NativeType("Uint32") int value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_GPUTextureRegion w(@NativeType("Uint32") int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_GPUTextureRegion h(@NativeType("Uint32") int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code d} field. */
    public SDL_GPUTextureRegion d(@NativeType("Uint32") int value) { nd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTextureRegion set(
        long texture,
        int mip_level,
        int layer,
        int x,
        int y,
        int z,
        int w,
        int h,
        int d
    ) {
        texture(texture);
        mip_level(mip_level);
        layer(layer);
        x(x);
        y(y);
        z(z);
        w(w);
        h(h);
        d(d);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUTextureRegion set(SDL_GPUTextureRegion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTextureRegion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureRegion malloc() {
        return new SDL_GPUTextureRegion(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureRegion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureRegion calloc() {
        return new SDL_GPUTextureRegion(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureRegion} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTextureRegion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureRegion(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTextureRegion} instance for the specified memory address. */
    public static SDL_GPUTextureRegion create(long address) {
        return new SDL_GPUTextureRegion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTextureRegion createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTextureRegion(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureRegion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureRegion.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureRegion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureRegion.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureRegion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureRegion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTextureRegion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureRegion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTextureRegion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTextureRegion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureRegion malloc(MemoryStack stack) {
        return new SDL_GPUTextureRegion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTextureRegion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureRegion calloc(MemoryStack stack) {
        return new SDL_GPUTextureRegion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureRegion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureRegion.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureRegion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureRegion.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUTextureRegion.TEXTURE); }
    /** Unsafe version of {@link #mip_level}. */
    public static int nmip_level(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.MIP_LEVEL); }
    /** Unsafe version of {@link #layer}. */
    public static int nlayer(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.LAYER); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.Z); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.H); }
    /** Unsafe version of {@link #d}. */
    public static int nd(long struct) { return memGetInt(struct + SDL_GPUTextureRegion.D); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUTextureRegion.TEXTURE, check(value)); }
    /** Unsafe version of {@link #mip_level(int) mip_level}. */
    public static void nmip_level(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.MIP_LEVEL, value); }
    /** Unsafe version of {@link #layer(int) layer}. */
    public static void nlayer(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.LAYER, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.Y, value); }
    /** Unsafe version of {@link #z(int) z}. */
    public static void nz(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.Z, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.H, value); }
    /** Unsafe version of {@link #d(int) d}. */
    public static void nd(long struct, int value) { memPutInt(struct + SDL_GPUTextureRegion.D, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUTextureRegion.TEXTURE));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUTextureRegion} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTextureRegion, Buffer> implements NativeResource {

        private static final SDL_GPUTextureRegion ELEMENT_FACTORY = SDL_GPUTextureRegion.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTextureRegion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTextureRegion#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTextureRegion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUTextureRegion.ntexture(address()); }
        /** @return the value of the {@code mip_level} field. */
        @NativeType("Uint32")
        public int mip_level() { return SDL_GPUTextureRegion.nmip_level(address()); }
        /** @return the value of the {@code layer} field. */
        @NativeType("Uint32")
        public int layer() { return SDL_GPUTextureRegion.nlayer(address()); }
        /** @return the value of the {@code x} field. */
        @NativeType("Uint32")
        public int x() { return SDL_GPUTextureRegion.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("Uint32")
        public int y() { return SDL_GPUTextureRegion.ny(address()); }
        /** @return the value of the {@code z} field. */
        @NativeType("Uint32")
        public int z() { return SDL_GPUTextureRegion.nz(address()); }
        /** @return the value of the {@code w} field. */
        @NativeType("Uint32")
        public int w() { return SDL_GPUTextureRegion.nw(address()); }
        /** @return the value of the {@code h} field. */
        @NativeType("Uint32")
        public int h() { return SDL_GPUTextureRegion.nh(address()); }
        /** @return the value of the {@code d} field. */
        @NativeType("Uint32")
        public int d() { return SDL_GPUTextureRegion.nd(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUTextureRegion.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUTextureRegion.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code mip_level} field. */
        public SDL_GPUTextureRegion.Buffer mip_level(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nmip_level(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public SDL_GPUTextureRegion.Buffer layer(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nlayer(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_GPUTextureRegion.Buffer x(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_GPUTextureRegion.Buffer y(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public SDL_GPUTextureRegion.Buffer z(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nz(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_GPUTextureRegion.Buffer w(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_GPUTextureRegion.Buffer h(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nh(address(), value); return this; }
        /** Sets the specified value to the {@code d} field. */
        public SDL_GPUTextureRegion.Buffer d(@NativeType("Uint32") int value) { SDL_GPUTextureRegion.nd(address(), value); return this; }

    }

}