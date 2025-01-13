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
 * struct SDL_GPUStorageTextureReadWriteBinding {
 *     SDL_GPUTexture * texture;
 *     Uint32 mip_level;
 *     Uint32 layer;
 *     bool cycle;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_GPUStorageTextureReadWriteBinding extends Struct<SDL_GPUStorageTextureReadWriteBinding> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        MIP_LEVEL,
        LAYER,
        CYCLE,
        PADDING1,
        PADDING2,
        PADDING3;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER = layout.offsetof(2);
        CYCLE = layout.offsetof(3);
        PADDING1 = layout.offsetof(4);
        PADDING2 = layout.offsetof(5);
        PADDING3 = layout.offsetof(6);
    }

    protected SDL_GPUStorageTextureReadWriteBinding(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUStorageTextureReadWriteBinding create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUStorageTextureReadWriteBinding(address, container);
    }

    /**
     * Creates a {@code SDL_GPUStorageTextureReadWriteBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUStorageTextureReadWriteBinding(ByteBuffer container) {
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
    /** @return the value of the {@code cycle} field. */
    @NativeType("bool")
    public boolean cycle() { return ncycle(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUStorageTextureReadWriteBinding texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code mip_level} field. */
    public SDL_GPUStorageTextureReadWriteBinding mip_level(@NativeType("Uint32") int value) { nmip_level(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public SDL_GPUStorageTextureReadWriteBinding layer(@NativeType("Uint32") int value) { nlayer(address(), value); return this; }
    /** Sets the specified value to the {@code cycle} field. */
    public SDL_GPUStorageTextureReadWriteBinding cycle(@NativeType("bool") boolean value) { ncycle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUStorageTextureReadWriteBinding set(
        long texture,
        int mip_level,
        int layer,
        boolean cycle
    ) {
        texture(texture);
        mip_level(mip_level);
        layer(layer);
        cycle(cycle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUStorageTextureReadWriteBinding set(SDL_GPUStorageTextureReadWriteBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUStorageTextureReadWriteBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUStorageTextureReadWriteBinding malloc() {
        return new SDL_GPUStorageTextureReadWriteBinding(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUStorageTextureReadWriteBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUStorageTextureReadWriteBinding calloc() {
        return new SDL_GPUStorageTextureReadWriteBinding(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUStorageTextureReadWriteBinding} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUStorageTextureReadWriteBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUStorageTextureReadWriteBinding(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUStorageTextureReadWriteBinding} instance for the specified memory address. */
    public static SDL_GPUStorageTextureReadWriteBinding create(long address) {
        return new SDL_GPUStorageTextureReadWriteBinding(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUStorageTextureReadWriteBinding createSafe(long address) {
        return address == NULL ? null : new SDL_GPUStorageTextureReadWriteBinding(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUStorageTextureReadWriteBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageTextureReadWriteBinding.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStorageTextureReadWriteBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageTextureReadWriteBinding.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStorageTextureReadWriteBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageTextureReadWriteBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUStorageTextureReadWriteBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageTextureReadWriteBinding.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUStorageTextureReadWriteBinding.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUStorageTextureReadWriteBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUStorageTextureReadWriteBinding malloc(MemoryStack stack) {
        return new SDL_GPUStorageTextureReadWriteBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUStorageTextureReadWriteBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUStorageTextureReadWriteBinding calloc(MemoryStack stack) {
        return new SDL_GPUStorageTextureReadWriteBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUStorageTextureReadWriteBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageTextureReadWriteBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStorageTextureReadWriteBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStorageTextureReadWriteBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUStorageTextureReadWriteBinding.TEXTURE); }
    /** Unsafe version of {@link #mip_level}. */
    public static int nmip_level(long struct) { return memGetInt(struct + SDL_GPUStorageTextureReadWriteBinding.MIP_LEVEL); }
    /** Unsafe version of {@link #layer}. */
    public static int nlayer(long struct) { return memGetInt(struct + SDL_GPUStorageTextureReadWriteBinding.LAYER); }
    /** Unsafe version of {@link #cycle}. */
    public static boolean ncycle(long struct) { return memGetByte(struct + SDL_GPUStorageTextureReadWriteBinding.CYCLE) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUStorageTextureReadWriteBinding.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUStorageTextureReadWriteBinding.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GPUStorageTextureReadWriteBinding.PADDING3); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUStorageTextureReadWriteBinding.TEXTURE, check(value)); }
    /** Unsafe version of {@link #mip_level(int) mip_level}. */
    public static void nmip_level(long struct, int value) { memPutInt(struct + SDL_GPUStorageTextureReadWriteBinding.MIP_LEVEL, value); }
    /** Unsafe version of {@link #layer(int) layer}. */
    public static void nlayer(long struct, int value) { memPutInt(struct + SDL_GPUStorageTextureReadWriteBinding.LAYER, value); }
    /** Unsafe version of {@link #cycle(boolean) cycle}. */
    public static void ncycle(long struct, boolean value) { memPutByte(struct + SDL_GPUStorageTextureReadWriteBinding.CYCLE, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUStorageTextureReadWriteBinding.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUStorageTextureReadWriteBinding.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GPUStorageTextureReadWriteBinding.PADDING3, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUStorageTextureReadWriteBinding.TEXTURE));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUStorageTextureReadWriteBinding} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUStorageTextureReadWriteBinding, Buffer> implements NativeResource {

        private static final SDL_GPUStorageTextureReadWriteBinding ELEMENT_FACTORY = SDL_GPUStorageTextureReadWriteBinding.create(-1L);

        /**
         * Creates a new {@code SDL_GPUStorageTextureReadWriteBinding.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUStorageTextureReadWriteBinding#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUStorageTextureReadWriteBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUStorageTextureReadWriteBinding.ntexture(address()); }
        /** @return the value of the {@code mip_level} field. */
        @NativeType("Uint32")
        public int mip_level() { return SDL_GPUStorageTextureReadWriteBinding.nmip_level(address()); }
        /** @return the value of the {@code layer} field. */
        @NativeType("Uint32")
        public int layer() { return SDL_GPUStorageTextureReadWriteBinding.nlayer(address()); }
        /** @return the value of the {@code cycle} field. */
        @NativeType("bool")
        public boolean cycle() { return SDL_GPUStorageTextureReadWriteBinding.ncycle(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUStorageTextureReadWriteBinding.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUStorageTextureReadWriteBinding.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code mip_level} field. */
        public SDL_GPUStorageTextureReadWriteBinding.Buffer mip_level(@NativeType("Uint32") int value) { SDL_GPUStorageTextureReadWriteBinding.nmip_level(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public SDL_GPUStorageTextureReadWriteBinding.Buffer layer(@NativeType("Uint32") int value) { SDL_GPUStorageTextureReadWriteBinding.nlayer(address(), value); return this; }
        /** Sets the specified value to the {@code cycle} field. */
        public SDL_GPUStorageTextureReadWriteBinding.Buffer cycle(@NativeType("bool") boolean value) { SDL_GPUStorageTextureReadWriteBinding.ncycle(address(), value); return this; }

    }

}