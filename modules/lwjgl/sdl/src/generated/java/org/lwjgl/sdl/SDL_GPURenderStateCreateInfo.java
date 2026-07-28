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
 * <pre><code>
 * struct SDL_GPURenderStateCreateInfo {
 *     SDL_GPUShader * fragment_shader;
 *     Sint32 num_sampler_bindings;
 *     {@link SDL_GPUTextureSamplerBinding SDL_GPUTextureSamplerBinding} const * sampler_bindings;
 *     Sint32 num_storage_textures;
 *     SDL_GPUTexture const ** storage_textures;
 *     Sint32 num_storage_buffers;
 *     SDL_GPUBuffer const ** storage_buffers;
 *     SDL_PropertiesID props;
 * }</code></pre>
 */
public class SDL_GPURenderStateCreateInfo extends Struct<SDL_GPURenderStateCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAGMENT_SHADER,
        NUM_SAMPLER_BINDINGS,
        SAMPLER_BINDINGS,
        NUM_STORAGE_TEXTURES,
        STORAGE_TEXTURES,
        NUM_STORAGE_BUFFERS,
        STORAGE_BUFFERS,
        PROPS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAGMENT_SHADER = layout.offsetof(0);
        NUM_SAMPLER_BINDINGS = layout.offsetof(1);
        SAMPLER_BINDINGS = layout.offsetof(2);
        NUM_STORAGE_TEXTURES = layout.offsetof(3);
        STORAGE_TEXTURES = layout.offsetof(4);
        NUM_STORAGE_BUFFERS = layout.offsetof(5);
        STORAGE_BUFFERS = layout.offsetof(6);
        PROPS = layout.offsetof(7);
    }

    protected SDL_GPURenderStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPURenderStateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPURenderStateCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPURenderStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPURenderStateCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fragment_shader} field. */
    @NativeType("SDL_GPUShader *")
    public long fragment_shader() { return nfragment_shader(address()); }
    /** @return the value of the {@code num_sampler_bindings} field. */
    @NativeType("Sint32")
    public int num_sampler_bindings() { return nnum_sampler_bindings(address()); }
    /** @return a {@link SDL_GPUTextureSamplerBinding.Buffer} view of the struct array pointed to by the {@code sampler_bindings} field. */
    @NativeType("SDL_GPUTextureSamplerBinding const *")
    public SDL_GPUTextureSamplerBinding.@Nullable Buffer sampler_bindings() { return nsampler_bindings(address()); }
    /** @return the value of the {@code num_storage_textures} field. */
    @NativeType("Sint32")
    public int num_storage_textures() { return nnum_storage_textures(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code storage_textures} field. */
    @NativeType("SDL_GPUTexture const **")
    public @Nullable PointerBuffer storage_textures() { return nstorage_textures(address()); }
    /** @return the value of the {@code num_storage_buffers} field. */
    @NativeType("Sint32")
    public int num_storage_buffers() { return nnum_storage_buffers(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code storage_buffers} field. */
    @NativeType("SDL_GPUBuffer const **")
    public @Nullable PointerBuffer storage_buffers() { return nstorage_buffers(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the specified value to the {@code fragment_shader} field. */
    public SDL_GPURenderStateCreateInfo fragment_shader(@NativeType("SDL_GPUShader *") long value) { nfragment_shader(address(), value); return this; }
    /** Sets the specified value to the {@code num_sampler_bindings} field. */
    public SDL_GPURenderStateCreateInfo num_sampler_bindings(@NativeType("Sint32") int value) { nnum_sampler_bindings(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_GPUTextureSamplerBinding.Buffer} to the {@code sampler_bindings} field. */
    public SDL_GPURenderStateCreateInfo sampler_bindings(@NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer value) { nsampler_bindings(address(), value); return this; }
    /** Sets the specified value to the {@code num_storage_textures} field. */
    public SDL_GPURenderStateCreateInfo num_storage_textures(@NativeType("Sint32") int value) { nnum_storage_textures(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code storage_textures} field. */
    public SDL_GPURenderStateCreateInfo storage_textures(@Nullable @NativeType("SDL_GPUTexture const **") PointerBuffer value) { nstorage_textures(address(), value); return this; }
    /** Sets the specified value to the {@code num_storage_buffers} field. */
    public SDL_GPURenderStateCreateInfo num_storage_buffers(@NativeType("Sint32") int value) { nnum_storage_buffers(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code storage_buffers} field. */
    public SDL_GPURenderStateCreateInfo storage_buffers(@Nullable @NativeType("SDL_GPUBuffer const **") PointerBuffer value) { nstorage_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPURenderStateCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPURenderStateCreateInfo set(
        long fragment_shader,
        int num_sampler_bindings,
        SDL_GPUTextureSamplerBinding.@Nullable Buffer sampler_bindings,
        int num_storage_textures,
        @Nullable PointerBuffer storage_textures,
        int num_storage_buffers,
        @Nullable PointerBuffer storage_buffers,
        int props
    ) {
        fragment_shader(fragment_shader);
        num_sampler_bindings(num_sampler_bindings);
        sampler_bindings(sampler_bindings);
        num_storage_textures(num_storage_textures);
        storage_textures(storage_textures);
        num_storage_buffers(num_storage_buffers);
        storage_buffers(storage_buffers);
        props(props);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPURenderStateCreateInfo set(SDL_GPURenderStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPURenderStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPURenderStateCreateInfo malloc() {
        return new SDL_GPURenderStateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPURenderStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPURenderStateCreateInfo calloc() {
        return new SDL_GPURenderStateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPURenderStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPURenderStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPURenderStateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPURenderStateCreateInfo} instance for the specified memory address. */
    public static SDL_GPURenderStateCreateInfo create(long address) {
        return new SDL_GPURenderStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPURenderStateCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPURenderStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPURenderStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPURenderStateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPURenderStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPURenderStateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPURenderStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPURenderStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPURenderStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPURenderStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPURenderStateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPURenderStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPURenderStateCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPURenderStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPURenderStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPURenderStateCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPURenderStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPURenderStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPURenderStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPURenderStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPURenderStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fragment_shader}. */
    public static long nfragment_shader(long struct) { return memGetAddress(struct + SDL_GPURenderStateCreateInfo.FRAGMENT_SHADER); }
    /** Unsafe version of {@link #num_sampler_bindings}. */
    public static int nnum_sampler_bindings(long struct) { return memGetInt(struct + SDL_GPURenderStateCreateInfo.NUM_SAMPLER_BINDINGS); }
    /** Unsafe version of {@link #sampler_bindings}. */
    public static SDL_GPUTextureSamplerBinding.@Nullable Buffer nsampler_bindings(long struct) { return SDL_GPUTextureSamplerBinding.createSafe(memGetAddress(struct + SDL_GPURenderStateCreateInfo.SAMPLER_BINDINGS), nnum_sampler_bindings(struct)); }
    /** Unsafe version of {@link #num_storage_textures}. */
    public static int nnum_storage_textures(long struct) { return memGetInt(struct + SDL_GPURenderStateCreateInfo.NUM_STORAGE_TEXTURES); }
    /** Unsafe version of {@link #storage_textures() storage_textures}. */
    public static @Nullable PointerBuffer nstorage_textures(long struct) { return memPointerBufferSafe(memGetAddress(struct + SDL_GPURenderStateCreateInfo.STORAGE_TEXTURES), nnum_storage_textures(struct)); }
    /** Unsafe version of {@link #num_storage_buffers}. */
    public static int nnum_storage_buffers(long struct) { return memGetInt(struct + SDL_GPURenderStateCreateInfo.NUM_STORAGE_BUFFERS); }
    /** Unsafe version of {@link #storage_buffers() storage_buffers}. */
    public static @Nullable PointerBuffer nstorage_buffers(long struct) { return memPointerBufferSafe(memGetAddress(struct + SDL_GPURenderStateCreateInfo.STORAGE_BUFFERS), nnum_storage_buffers(struct)); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPURenderStateCreateInfo.PROPS); }

    /** Unsafe version of {@link #fragment_shader(long) fragment_shader}. */
    public static void nfragment_shader(long struct, long value) { memPutAddress(struct + SDL_GPURenderStateCreateInfo.FRAGMENT_SHADER, check(value)); }
    /** Sets the specified value to the {@code num_sampler_bindings} field of the specified {@code struct}. */
    public static void nnum_sampler_bindings(long struct, int value) { memPutInt(struct + SDL_GPURenderStateCreateInfo.NUM_SAMPLER_BINDINGS, value); }
    /** Unsafe version of {@link #sampler_bindings(SDL_GPUTextureSamplerBinding.Buffer) sampler_bindings}. */
    public static void nsampler_bindings(long struct, SDL_GPUTextureSamplerBinding.@Nullable Buffer value) { memPutAddress(struct + SDL_GPURenderStateCreateInfo.SAMPLER_BINDINGS, memAddressSafe(value)); nnum_sampler_bindings(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code num_storage_textures} field of the specified {@code struct}. */
    public static void nnum_storage_textures(long struct, int value) { memPutInt(struct + SDL_GPURenderStateCreateInfo.NUM_STORAGE_TEXTURES, value); }
    /** Unsafe version of {@link #storage_textures(PointerBuffer) storage_textures}. */
    public static void nstorage_textures(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + SDL_GPURenderStateCreateInfo.STORAGE_TEXTURES, memAddressSafe(value)); nnum_storage_textures(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code num_storage_buffers} field of the specified {@code struct}. */
    public static void nnum_storage_buffers(long struct, int value) { memPutInt(struct + SDL_GPURenderStateCreateInfo.NUM_STORAGE_BUFFERS, value); }
    /** Unsafe version of {@link #storage_buffers(PointerBuffer) storage_buffers}. */
    public static void nstorage_buffers(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + SDL_GPURenderStateCreateInfo.STORAGE_BUFFERS, memAddressSafe(value)); nnum_storage_buffers(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPURenderStateCreateInfo.PROPS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPURenderStateCreateInfo.FRAGMENT_SHADER));
        int num_sampler_bindings = nnum_sampler_bindings(struct);
        long sampler_bindings = memGetAddress(struct + SDL_GPURenderStateCreateInfo.SAMPLER_BINDINGS);
        if (sampler_bindings != NULL) {
            validate(sampler_bindings, num_sampler_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link SDL_GPURenderStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPURenderStateCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPURenderStateCreateInfo ELEMENT_FACTORY = SDL_GPURenderStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPURenderStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPURenderStateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPURenderStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fragment_shader} field. */
        @NativeType("SDL_GPUShader *")
        public long fragment_shader() { return SDL_GPURenderStateCreateInfo.nfragment_shader(address()); }
        /** @return the value of the {@code num_sampler_bindings} field. */
        @NativeType("Sint32")
        public int num_sampler_bindings() { return SDL_GPURenderStateCreateInfo.nnum_sampler_bindings(address()); }
        /** @return a {@link SDL_GPUTextureSamplerBinding.Buffer} view of the struct array pointed to by the {@code sampler_bindings} field. */
        @NativeType("SDL_GPUTextureSamplerBinding const *")
        public SDL_GPUTextureSamplerBinding.@Nullable Buffer sampler_bindings() { return SDL_GPURenderStateCreateInfo.nsampler_bindings(address()); }
        /** @return the value of the {@code num_storage_textures} field. */
        @NativeType("Sint32")
        public int num_storage_textures() { return SDL_GPURenderStateCreateInfo.nnum_storage_textures(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code storage_textures} field. */
        @NativeType("SDL_GPUTexture const **")
        public @Nullable PointerBuffer storage_textures() { return SDL_GPURenderStateCreateInfo.nstorage_textures(address()); }
        /** @return the value of the {@code num_storage_buffers} field. */
        @NativeType("Sint32")
        public int num_storage_buffers() { return SDL_GPURenderStateCreateInfo.nnum_storage_buffers(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code storage_buffers} field. */
        @NativeType("SDL_GPUBuffer const **")
        public @Nullable PointerBuffer storage_buffers() { return SDL_GPURenderStateCreateInfo.nstorage_buffers(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPURenderStateCreateInfo.nprops(address()); }

        /** Sets the specified value to the {@code fragment_shader} field. */
        public SDL_GPURenderStateCreateInfo.Buffer fragment_shader(@NativeType("SDL_GPUShader *") long value) { SDL_GPURenderStateCreateInfo.nfragment_shader(address(), value); return this; }
        /** Sets the specified value to the {@code num_sampler_bindings} field. */
        public SDL_GPURenderStateCreateInfo.Buffer num_sampler_bindings(@NativeType("Sint32") int value) { SDL_GPURenderStateCreateInfo.nnum_sampler_bindings(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_GPUTextureSamplerBinding.Buffer} to the {@code sampler_bindings} field. */
        public SDL_GPURenderStateCreateInfo.Buffer sampler_bindings(@NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer value) { SDL_GPURenderStateCreateInfo.nsampler_bindings(address(), value); return this; }
        /** Sets the specified value to the {@code num_storage_textures} field. */
        public SDL_GPURenderStateCreateInfo.Buffer num_storage_textures(@NativeType("Sint32") int value) { SDL_GPURenderStateCreateInfo.nnum_storage_textures(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code storage_textures} field. */
        public SDL_GPURenderStateCreateInfo.Buffer storage_textures(@Nullable @NativeType("SDL_GPUTexture const **") PointerBuffer value) { SDL_GPURenderStateCreateInfo.nstorage_textures(address(), value); return this; }
        /** Sets the specified value to the {@code num_storage_buffers} field. */
        public SDL_GPURenderStateCreateInfo.Buffer num_storage_buffers(@NativeType("Sint32") int value) { SDL_GPURenderStateCreateInfo.nnum_storage_buffers(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code storage_buffers} field. */
        public SDL_GPURenderStateCreateInfo.Buffer storage_buffers(@Nullable @NativeType("SDL_GPUBuffer const **") PointerBuffer value) { SDL_GPURenderStateCreateInfo.nstorage_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPURenderStateCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPURenderStateCreateInfo.nprops(address(), value); return this; }

    }

}