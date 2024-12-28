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
 * struct SDL_GPUComputePipelineCreateInfo {
 *     size_t code_size;
 *     Uint8 const * code;
 *     char const * entrypoint;
 *     SDL_GPUShaderFormat format;
 *     Uint32 num_samplers;
 *     Uint32 num_readonly_storage_textures;
 *     Uint32 num_readonly_storage_buffers;
 *     Uint32 num_readwrite_storage_textures;
 *     Uint32 num_readwrite_storage_buffers;
 *     Uint32 num_uniform_buffers;
 *     Uint32 threadcount_x;
 *     Uint32 threadcount_y;
 *     Uint32 threadcount_z;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUComputePipelineCreateInfo extends Struct<SDL_GPUComputePipelineCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CODE_SIZE,
        CODE,
        ENTRYPOINT,
        FORMAT,
        NUM_SAMPLERS,
        NUM_READONLY_STORAGE_TEXTURES,
        NUM_READONLY_STORAGE_BUFFERS,
        NUM_READWRITE_STORAGE_TEXTURES,
        NUM_READWRITE_STORAGE_BUFFERS,
        NUM_UNIFORM_BUFFERS,
        THREADCOUNT_X,
        THREADCOUNT_Y,
        THREADCOUNT_Z,
        PROPS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
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

        CODE_SIZE = layout.offsetof(0);
        CODE = layout.offsetof(1);
        ENTRYPOINT = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        NUM_SAMPLERS = layout.offsetof(4);
        NUM_READONLY_STORAGE_TEXTURES = layout.offsetof(5);
        NUM_READONLY_STORAGE_BUFFERS = layout.offsetof(6);
        NUM_READWRITE_STORAGE_TEXTURES = layout.offsetof(7);
        NUM_READWRITE_STORAGE_BUFFERS = layout.offsetof(8);
        NUM_UNIFORM_BUFFERS = layout.offsetof(9);
        THREADCOUNT_X = layout.offsetof(10);
        THREADCOUNT_Y = layout.offsetof(11);
        THREADCOUNT_Z = layout.offsetof(12);
        PROPS = layout.offsetof(13);
    }

    protected SDL_GPUComputePipelineCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUComputePipelineCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUComputePipelineCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUComputePipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUComputePipelineCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code code_size} field. */
    @NativeType("size_t")
    public long code_size() { return ncode_size(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code code} field. */
    @NativeType("Uint8 const *")
    public ByteBuffer code() { return ncode(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code entrypoint} field. */
    @NativeType("char const *")
    public ByteBuffer entrypoint() { return nentrypoint(address()); }
    /** @return the null-terminated string pointed to by the {@code entrypoint} field. */
    @NativeType("char const *")
    public String entrypointString() { return nentrypointString(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("SDL_GPUShaderFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code num_samplers} field. */
    @NativeType("Uint32")
    public int num_samplers() { return nnum_samplers(address()); }
    /** @return the value of the {@code num_readonly_storage_textures} field. */
    @NativeType("Uint32")
    public int num_readonly_storage_textures() { return nnum_readonly_storage_textures(address()); }
    /** @return the value of the {@code num_readonly_storage_buffers} field. */
    @NativeType("Uint32")
    public int num_readonly_storage_buffers() { return nnum_readonly_storage_buffers(address()); }
    /** @return the value of the {@code num_readwrite_storage_textures} field. */
    @NativeType("Uint32")
    public int num_readwrite_storage_textures() { return nnum_readwrite_storage_textures(address()); }
    /** @return the value of the {@code num_readwrite_storage_buffers} field. */
    @NativeType("Uint32")
    public int num_readwrite_storage_buffers() { return nnum_readwrite_storage_buffers(address()); }
    /** @return the value of the {@code num_uniform_buffers} field. */
    @NativeType("Uint32")
    public int num_uniform_buffers() { return nnum_uniform_buffers(address()); }
    /** @return the value of the {@code threadcount_x} field. */
    @NativeType("Uint32")
    public int threadcount_x() { return nthreadcount_x(address()); }
    /** @return the value of the {@code threadcount_y} field. */
    @NativeType("Uint32")
    public int threadcount_y() { return nthreadcount_y(address()); }
    /** @return the value of the {@code threadcount_z} field. */
    @NativeType("Uint32")
    public int threadcount_z() { return nthreadcount_z(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code code} field. */
    public SDL_GPUComputePipelineCreateInfo code(@NativeType("Uint8 const *") ByteBuffer value) { ncode(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code entrypoint} field. */
    public SDL_GPUComputePipelineCreateInfo entrypoint(@NativeType("char const *") ByteBuffer value) { nentrypoint(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SDL_GPUComputePipelineCreateInfo format(@NativeType("SDL_GPUShaderFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code num_samplers} field. */
    public SDL_GPUComputePipelineCreateInfo num_samplers(@NativeType("Uint32") int value) { nnum_samplers(address(), value); return this; }
    /** Sets the specified value to the {@code num_readonly_storage_textures} field. */
    public SDL_GPUComputePipelineCreateInfo num_readonly_storage_textures(@NativeType("Uint32") int value) { nnum_readonly_storage_textures(address(), value); return this; }
    /** Sets the specified value to the {@code num_readonly_storage_buffers} field. */
    public SDL_GPUComputePipelineCreateInfo num_readonly_storage_buffers(@NativeType("Uint32") int value) { nnum_readonly_storage_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code num_readwrite_storage_textures} field. */
    public SDL_GPUComputePipelineCreateInfo num_readwrite_storage_textures(@NativeType("Uint32") int value) { nnum_readwrite_storage_textures(address(), value); return this; }
    /** Sets the specified value to the {@code num_readwrite_storage_buffers} field. */
    public SDL_GPUComputePipelineCreateInfo num_readwrite_storage_buffers(@NativeType("Uint32") int value) { nnum_readwrite_storage_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code num_uniform_buffers} field. */
    public SDL_GPUComputePipelineCreateInfo num_uniform_buffers(@NativeType("Uint32") int value) { nnum_uniform_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code threadcount_x} field. */
    public SDL_GPUComputePipelineCreateInfo threadcount_x(@NativeType("Uint32") int value) { nthreadcount_x(address(), value); return this; }
    /** Sets the specified value to the {@code threadcount_y} field. */
    public SDL_GPUComputePipelineCreateInfo threadcount_y(@NativeType("Uint32") int value) { nthreadcount_y(address(), value); return this; }
    /** Sets the specified value to the {@code threadcount_z} field. */
    public SDL_GPUComputePipelineCreateInfo threadcount_z(@NativeType("Uint32") int value) { nthreadcount_z(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUComputePipelineCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUComputePipelineCreateInfo set(
        ByteBuffer code,
        ByteBuffer entrypoint,
        int format,
        int num_samplers,
        int num_readonly_storage_textures,
        int num_readonly_storage_buffers,
        int num_readwrite_storage_textures,
        int num_readwrite_storage_buffers,
        int num_uniform_buffers,
        int threadcount_x,
        int threadcount_y,
        int threadcount_z,
        int props
    ) {
        code(code);
        entrypoint(entrypoint);
        format(format);
        num_samplers(num_samplers);
        num_readonly_storage_textures(num_readonly_storage_textures);
        num_readonly_storage_buffers(num_readonly_storage_buffers);
        num_readwrite_storage_textures(num_readwrite_storage_textures);
        num_readwrite_storage_buffers(num_readwrite_storage_buffers);
        num_uniform_buffers(num_uniform_buffers);
        threadcount_x(threadcount_x);
        threadcount_y(threadcount_y);
        threadcount_z(threadcount_z);
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
    public SDL_GPUComputePipelineCreateInfo set(SDL_GPUComputePipelineCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUComputePipelineCreateInfo malloc() {
        return new SDL_GPUComputePipelineCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUComputePipelineCreateInfo calloc() {
        return new SDL_GPUComputePipelineCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUComputePipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUComputePipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUComputePipelineCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUComputePipelineCreateInfo} instance for the specified memory address. */
    public static SDL_GPUComputePipelineCreateInfo create(long address) {
        return new SDL_GPUComputePipelineCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUComputePipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUComputePipelineCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUComputePipelineCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUComputePipelineCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUComputePipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUComputePipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUComputePipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUComputePipelineCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUComputePipelineCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUComputePipelineCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUComputePipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUComputePipelineCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUComputePipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUComputePipelineCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUComputePipelineCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #code_size}. */
    public static long ncode_size(long struct) { return memGetAddress(struct + SDL_GPUComputePipelineCreateInfo.CODE_SIZE); }
    /** Unsafe version of {@link #code() code}. */
    public static ByteBuffer ncode(long struct) { return memByteBuffer(memGetAddress(struct + SDL_GPUComputePipelineCreateInfo.CODE), (int)ncode_size(struct)); }
    /** Unsafe version of {@link #entrypoint}. */
    public static ByteBuffer nentrypoint(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_GPUComputePipelineCreateInfo.ENTRYPOINT)); }
    /** Unsafe version of {@link #entrypointString}. */
    public static String nentrypointString(long struct) { return memUTF8(memGetAddress(struct + SDL_GPUComputePipelineCreateInfo.ENTRYPOINT)); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.FORMAT); }
    /** Unsafe version of {@link #num_samplers}. */
    public static int nnum_samplers(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_SAMPLERS); }
    /** Unsafe version of {@link #num_readonly_storage_textures}. */
    public static int nnum_readonly_storage_textures(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READONLY_STORAGE_TEXTURES); }
    /** Unsafe version of {@link #num_readonly_storage_buffers}. */
    public static int nnum_readonly_storage_buffers(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READONLY_STORAGE_BUFFERS); }
    /** Unsafe version of {@link #num_readwrite_storage_textures}. */
    public static int nnum_readwrite_storage_textures(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READWRITE_STORAGE_TEXTURES); }
    /** Unsafe version of {@link #num_readwrite_storage_buffers}. */
    public static int nnum_readwrite_storage_buffers(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READWRITE_STORAGE_BUFFERS); }
    /** Unsafe version of {@link #num_uniform_buffers}. */
    public static int nnum_uniform_buffers(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_UNIFORM_BUFFERS); }
    /** Unsafe version of {@link #threadcount_x}. */
    public static int nthreadcount_x(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.THREADCOUNT_X); }
    /** Unsafe version of {@link #threadcount_y}. */
    public static int nthreadcount_y(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.THREADCOUNT_Y); }
    /** Unsafe version of {@link #threadcount_z}. */
    public static int nthreadcount_z(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.THREADCOUNT_Z); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUComputePipelineCreateInfo.PROPS); }

    /** Sets the specified value to the {@code code_size} field of the specified {@code struct}. */
    public static void ncode_size(long struct, long value) { memPutAddress(struct + SDL_GPUComputePipelineCreateInfo.CODE_SIZE, value); }
    /** Unsafe version of {@link #code(ByteBuffer) code}. */
    public static void ncode(long struct, ByteBuffer value) { memPutAddress(struct + SDL_GPUComputePipelineCreateInfo.CODE, memAddress(value)); ncode_size(struct, value.remaining()); }
    /** Unsafe version of {@link #entrypoint(ByteBuffer) entrypoint}. */
    public static void nentrypoint(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_GPUComputePipelineCreateInfo.ENTRYPOINT, memAddress(value));
    }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #num_samplers(int) num_samplers}. */
    public static void nnum_samplers(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_SAMPLERS, value); }
    /** Unsafe version of {@link #num_readonly_storage_textures(int) num_readonly_storage_textures}. */
    public static void nnum_readonly_storage_textures(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READONLY_STORAGE_TEXTURES, value); }
    /** Unsafe version of {@link #num_readonly_storage_buffers(int) num_readonly_storage_buffers}. */
    public static void nnum_readonly_storage_buffers(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READONLY_STORAGE_BUFFERS, value); }
    /** Unsafe version of {@link #num_readwrite_storage_textures(int) num_readwrite_storage_textures}. */
    public static void nnum_readwrite_storage_textures(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READWRITE_STORAGE_TEXTURES, value); }
    /** Unsafe version of {@link #num_readwrite_storage_buffers(int) num_readwrite_storage_buffers}. */
    public static void nnum_readwrite_storage_buffers(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_READWRITE_STORAGE_BUFFERS, value); }
    /** Unsafe version of {@link #num_uniform_buffers(int) num_uniform_buffers}. */
    public static void nnum_uniform_buffers(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.NUM_UNIFORM_BUFFERS, value); }
    /** Unsafe version of {@link #threadcount_x(int) threadcount_x}. */
    public static void nthreadcount_x(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.THREADCOUNT_X, value); }
    /** Unsafe version of {@link #threadcount_y(int) threadcount_y}. */
    public static void nthreadcount_y(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.THREADCOUNT_Y, value); }
    /** Unsafe version of {@link #threadcount_z(int) threadcount_z}. */
    public static void nthreadcount_z(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.THREADCOUNT_Z, value); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUComputePipelineCreateInfo.PROPS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUComputePipelineCreateInfo.CODE));
        check(memGetAddress(struct + SDL_GPUComputePipelineCreateInfo.ENTRYPOINT));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUComputePipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUComputePipelineCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUComputePipelineCreateInfo ELEMENT_FACTORY = SDL_GPUComputePipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUComputePipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUComputePipelineCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUComputePipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code code_size} field. */
        @NativeType("size_t")
        public long code_size() { return SDL_GPUComputePipelineCreateInfo.ncode_size(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code code} field. */
        @NativeType("Uint8 const *")
        public ByteBuffer code() { return SDL_GPUComputePipelineCreateInfo.ncode(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code entrypoint} field. */
        @NativeType("char const *")
        public ByteBuffer entrypoint() { return SDL_GPUComputePipelineCreateInfo.nentrypoint(address()); }
        /** @return the null-terminated string pointed to by the {@code entrypoint} field. */
        @NativeType("char const *")
        public String entrypointString() { return SDL_GPUComputePipelineCreateInfo.nentrypointString(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("SDL_GPUShaderFormat")
        public int format() { return SDL_GPUComputePipelineCreateInfo.nformat(address()); }
        /** @return the value of the {@code num_samplers} field. */
        @NativeType("Uint32")
        public int num_samplers() { return SDL_GPUComputePipelineCreateInfo.nnum_samplers(address()); }
        /** @return the value of the {@code num_readonly_storage_textures} field. */
        @NativeType("Uint32")
        public int num_readonly_storage_textures() { return SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_textures(address()); }
        /** @return the value of the {@code num_readonly_storage_buffers} field. */
        @NativeType("Uint32")
        public int num_readonly_storage_buffers() { return SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_buffers(address()); }
        /** @return the value of the {@code num_readwrite_storage_textures} field. */
        @NativeType("Uint32")
        public int num_readwrite_storage_textures() { return SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_textures(address()); }
        /** @return the value of the {@code num_readwrite_storage_buffers} field. */
        @NativeType("Uint32")
        public int num_readwrite_storage_buffers() { return SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_buffers(address()); }
        /** @return the value of the {@code num_uniform_buffers} field. */
        @NativeType("Uint32")
        public int num_uniform_buffers() { return SDL_GPUComputePipelineCreateInfo.nnum_uniform_buffers(address()); }
        /** @return the value of the {@code threadcount_x} field. */
        @NativeType("Uint32")
        public int threadcount_x() { return SDL_GPUComputePipelineCreateInfo.nthreadcount_x(address()); }
        /** @return the value of the {@code threadcount_y} field. */
        @NativeType("Uint32")
        public int threadcount_y() { return SDL_GPUComputePipelineCreateInfo.nthreadcount_y(address()); }
        /** @return the value of the {@code threadcount_z} field. */
        @NativeType("Uint32")
        public int threadcount_z() { return SDL_GPUComputePipelineCreateInfo.nthreadcount_z(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUComputePipelineCreateInfo.nprops(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code code} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer code(@NativeType("Uint8 const *") ByteBuffer value) { SDL_GPUComputePipelineCreateInfo.ncode(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code entrypoint} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer entrypoint(@NativeType("char const *") ByteBuffer value) { SDL_GPUComputePipelineCreateInfo.nentrypoint(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer format(@NativeType("SDL_GPUShaderFormat") int value) { SDL_GPUComputePipelineCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code num_samplers} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer num_samplers(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nnum_samplers(address(), value); return this; }
        /** Sets the specified value to the {@code num_readonly_storage_textures} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer num_readonly_storage_textures(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_textures(address(), value); return this; }
        /** Sets the specified value to the {@code num_readonly_storage_buffers} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer num_readonly_storage_buffers(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nnum_readonly_storage_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code num_readwrite_storage_textures} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer num_readwrite_storage_textures(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_textures(address(), value); return this; }
        /** Sets the specified value to the {@code num_readwrite_storage_buffers} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer num_readwrite_storage_buffers(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nnum_readwrite_storage_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code num_uniform_buffers} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer num_uniform_buffers(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nnum_uniform_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code threadcount_x} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer threadcount_x(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nthreadcount_x(address(), value); return this; }
        /** Sets the specified value to the {@code threadcount_y} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer threadcount_y(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nthreadcount_y(address(), value); return this; }
        /** Sets the specified value to the {@code threadcount_z} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer threadcount_z(@NativeType("Uint32") int value) { SDL_GPUComputePipelineCreateInfo.nthreadcount_z(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUComputePipelineCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUComputePipelineCreateInfo.nprops(address(), value); return this; }

    }

}