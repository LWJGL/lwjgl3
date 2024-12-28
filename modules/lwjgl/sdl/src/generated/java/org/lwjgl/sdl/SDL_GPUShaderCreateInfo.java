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
 * struct SDL_GPUShaderCreateInfo {
 *     size_t code_size;
 *     Uint8 const * code;
 *     char const * entrypoint;
 *     SDL_GPUShaderFormat format;
 *     SDL_GPUShaderStage stage;
 *     Uint32 num_samplers;
 *     Uint32 num_storage_textures;
 *     Uint32 num_storage_buffers;
 *     Uint32 num_uniform_buffers;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUShaderCreateInfo extends Struct<SDL_GPUShaderCreateInfo> implements NativeResource {

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
        STAGE,
        NUM_SAMPLERS,
        NUM_STORAGE_TEXTURES,
        NUM_STORAGE_BUFFERS,
        NUM_UNIFORM_BUFFERS,
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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CODE_SIZE = layout.offsetof(0);
        CODE = layout.offsetof(1);
        ENTRYPOINT = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        STAGE = layout.offsetof(4);
        NUM_SAMPLERS = layout.offsetof(5);
        NUM_STORAGE_TEXTURES = layout.offsetof(6);
        NUM_STORAGE_BUFFERS = layout.offsetof(7);
        NUM_UNIFORM_BUFFERS = layout.offsetof(8);
        PROPS = layout.offsetof(9);
    }

    protected SDL_GPUShaderCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUShaderCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUShaderCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUShaderCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUShaderCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code stage} field. */
    @NativeType("SDL_GPUShaderStage")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code num_samplers} field. */
    @NativeType("Uint32")
    public int num_samplers() { return nnum_samplers(address()); }
    /** @return the value of the {@code num_storage_textures} field. */
    @NativeType("Uint32")
    public int num_storage_textures() { return nnum_storage_textures(address()); }
    /** @return the value of the {@code num_storage_buffers} field. */
    @NativeType("Uint32")
    public int num_storage_buffers() { return nnum_storage_buffers(address()); }
    /** @return the value of the {@code num_uniform_buffers} field. */
    @NativeType("Uint32")
    public int num_uniform_buffers() { return nnum_uniform_buffers(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code code} field. */
    public SDL_GPUShaderCreateInfo code(@NativeType("Uint8 const *") ByteBuffer value) { ncode(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code entrypoint} field. */
    public SDL_GPUShaderCreateInfo entrypoint(@NativeType("char const *") ByteBuffer value) { nentrypoint(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SDL_GPUShaderCreateInfo format(@NativeType("SDL_GPUShaderFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code stage} field. */
    public SDL_GPUShaderCreateInfo stage(@NativeType("SDL_GPUShaderStage") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code num_samplers} field. */
    public SDL_GPUShaderCreateInfo num_samplers(@NativeType("Uint32") int value) { nnum_samplers(address(), value); return this; }
    /** Sets the specified value to the {@code num_storage_textures} field. */
    public SDL_GPUShaderCreateInfo num_storage_textures(@NativeType("Uint32") int value) { nnum_storage_textures(address(), value); return this; }
    /** Sets the specified value to the {@code num_storage_buffers} field. */
    public SDL_GPUShaderCreateInfo num_storage_buffers(@NativeType("Uint32") int value) { nnum_storage_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code num_uniform_buffers} field. */
    public SDL_GPUShaderCreateInfo num_uniform_buffers(@NativeType("Uint32") int value) { nnum_uniform_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUShaderCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUShaderCreateInfo set(
        ByteBuffer code,
        ByteBuffer entrypoint,
        int format,
        int stage,
        int num_samplers,
        int num_storage_textures,
        int num_storage_buffers,
        int num_uniform_buffers,
        int props
    ) {
        code(code);
        entrypoint(entrypoint);
        format(format);
        stage(stage);
        num_samplers(num_samplers);
        num_storage_textures(num_storage_textures);
        num_storage_buffers(num_storage_buffers);
        num_uniform_buffers(num_uniform_buffers);
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
    public SDL_GPUShaderCreateInfo set(SDL_GPUShaderCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUShaderCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUShaderCreateInfo malloc() {
        return new SDL_GPUShaderCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUShaderCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUShaderCreateInfo calloc() {
        return new SDL_GPUShaderCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUShaderCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUShaderCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUShaderCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUShaderCreateInfo} instance for the specified memory address. */
    public static SDL_GPUShaderCreateInfo create(long address) {
        return new SDL_GPUShaderCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUShaderCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUShaderCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUShaderCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUShaderCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUShaderCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUShaderCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUShaderCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUShaderCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUShaderCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUShaderCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUShaderCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUShaderCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUShaderCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUShaderCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUShaderCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUShaderCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUShaderCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUShaderCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUShaderCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUShaderCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUShaderCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #code_size}. */
    public static long ncode_size(long struct) { return memGetAddress(struct + SDL_GPUShaderCreateInfo.CODE_SIZE); }
    /** Unsafe version of {@link #code() code}. */
    public static ByteBuffer ncode(long struct) { return memByteBuffer(memGetAddress(struct + SDL_GPUShaderCreateInfo.CODE), (int)ncode_size(struct)); }
    /** Unsafe version of {@link #entrypoint}. */
    public static ByteBuffer nentrypoint(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_GPUShaderCreateInfo.ENTRYPOINT)); }
    /** Unsafe version of {@link #entrypointString}. */
    public static String nentrypointString(long struct) { return memUTF8(memGetAddress(struct + SDL_GPUShaderCreateInfo.ENTRYPOINT)); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.FORMAT); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.STAGE); }
    /** Unsafe version of {@link #num_samplers}. */
    public static int nnum_samplers(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.NUM_SAMPLERS); }
    /** Unsafe version of {@link #num_storage_textures}. */
    public static int nnum_storage_textures(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.NUM_STORAGE_TEXTURES); }
    /** Unsafe version of {@link #num_storage_buffers}. */
    public static int nnum_storage_buffers(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.NUM_STORAGE_BUFFERS); }
    /** Unsafe version of {@link #num_uniform_buffers}. */
    public static int nnum_uniform_buffers(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.NUM_UNIFORM_BUFFERS); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUShaderCreateInfo.PROPS); }

    /** Sets the specified value to the {@code code_size} field of the specified {@code struct}. */
    public static void ncode_size(long struct, long value) { memPutAddress(struct + SDL_GPUShaderCreateInfo.CODE_SIZE, value); }
    /** Unsafe version of {@link #code(ByteBuffer) code}. */
    public static void ncode(long struct, ByteBuffer value) { memPutAddress(struct + SDL_GPUShaderCreateInfo.CODE, memAddress(value)); ncode_size(struct, value.remaining()); }
    /** Unsafe version of {@link #entrypoint(ByteBuffer) entrypoint}. */
    public static void nentrypoint(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_GPUShaderCreateInfo.ENTRYPOINT, memAddress(value));
    }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.STAGE, value); }
    /** Unsafe version of {@link #num_samplers(int) num_samplers}. */
    public static void nnum_samplers(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.NUM_SAMPLERS, value); }
    /** Unsafe version of {@link #num_storage_textures(int) num_storage_textures}. */
    public static void nnum_storage_textures(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.NUM_STORAGE_TEXTURES, value); }
    /** Unsafe version of {@link #num_storage_buffers(int) num_storage_buffers}. */
    public static void nnum_storage_buffers(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.NUM_STORAGE_BUFFERS, value); }
    /** Unsafe version of {@link #num_uniform_buffers(int) num_uniform_buffers}. */
    public static void nnum_uniform_buffers(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.NUM_UNIFORM_BUFFERS, value); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUShaderCreateInfo.PROPS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUShaderCreateInfo.CODE));
        check(memGetAddress(struct + SDL_GPUShaderCreateInfo.ENTRYPOINT));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUShaderCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUShaderCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUShaderCreateInfo ELEMENT_FACTORY = SDL_GPUShaderCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUShaderCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUShaderCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUShaderCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code code_size} field. */
        @NativeType("size_t")
        public long code_size() { return SDL_GPUShaderCreateInfo.ncode_size(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code code} field. */
        @NativeType("Uint8 const *")
        public ByteBuffer code() { return SDL_GPUShaderCreateInfo.ncode(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code entrypoint} field. */
        @NativeType("char const *")
        public ByteBuffer entrypoint() { return SDL_GPUShaderCreateInfo.nentrypoint(address()); }
        /** @return the null-terminated string pointed to by the {@code entrypoint} field. */
        @NativeType("char const *")
        public String entrypointString() { return SDL_GPUShaderCreateInfo.nentrypointString(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("SDL_GPUShaderFormat")
        public int format() { return SDL_GPUShaderCreateInfo.nformat(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("SDL_GPUShaderStage")
        public int stage() { return SDL_GPUShaderCreateInfo.nstage(address()); }
        /** @return the value of the {@code num_samplers} field. */
        @NativeType("Uint32")
        public int num_samplers() { return SDL_GPUShaderCreateInfo.nnum_samplers(address()); }
        /** @return the value of the {@code num_storage_textures} field. */
        @NativeType("Uint32")
        public int num_storage_textures() { return SDL_GPUShaderCreateInfo.nnum_storage_textures(address()); }
        /** @return the value of the {@code num_storage_buffers} field. */
        @NativeType("Uint32")
        public int num_storage_buffers() { return SDL_GPUShaderCreateInfo.nnum_storage_buffers(address()); }
        /** @return the value of the {@code num_uniform_buffers} field. */
        @NativeType("Uint32")
        public int num_uniform_buffers() { return SDL_GPUShaderCreateInfo.nnum_uniform_buffers(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUShaderCreateInfo.nprops(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code code} field. */
        public SDL_GPUShaderCreateInfo.Buffer code(@NativeType("Uint8 const *") ByteBuffer value) { SDL_GPUShaderCreateInfo.ncode(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code entrypoint} field. */
        public SDL_GPUShaderCreateInfo.Buffer entrypoint(@NativeType("char const *") ByteBuffer value) { SDL_GPUShaderCreateInfo.nentrypoint(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SDL_GPUShaderCreateInfo.Buffer format(@NativeType("SDL_GPUShaderFormat") int value) { SDL_GPUShaderCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code stage} field. */
        public SDL_GPUShaderCreateInfo.Buffer stage(@NativeType("SDL_GPUShaderStage") int value) { SDL_GPUShaderCreateInfo.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code num_samplers} field. */
        public SDL_GPUShaderCreateInfo.Buffer num_samplers(@NativeType("Uint32") int value) { SDL_GPUShaderCreateInfo.nnum_samplers(address(), value); return this; }
        /** Sets the specified value to the {@code num_storage_textures} field. */
        public SDL_GPUShaderCreateInfo.Buffer num_storage_textures(@NativeType("Uint32") int value) { SDL_GPUShaderCreateInfo.nnum_storage_textures(address(), value); return this; }
        /** Sets the specified value to the {@code num_storage_buffers} field. */
        public SDL_GPUShaderCreateInfo.Buffer num_storage_buffers(@NativeType("Uint32") int value) { SDL_GPUShaderCreateInfo.nnum_storage_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code num_uniform_buffers} field. */
        public SDL_GPUShaderCreateInfo.Buffer num_uniform_buffers(@NativeType("Uint32") int value) { SDL_GPUShaderCreateInfo.nnum_uniform_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUShaderCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUShaderCreateInfo.nprops(address(), value); return this; }

    }

}