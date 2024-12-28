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
 * struct SDL_GPUGraphicsPipelineTargetInfo {
 *     {@link SDL_GPUColorTargetDescription SDL_GPUColorTargetDescription} const * color_target_descriptions;
 *     Uint32 num_color_targets;
 *     SDL_GPUTextureFormat depth_stencil_format;
 *     bool has_depth_stencil_target;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_GPUGraphicsPipelineTargetInfo extends Struct<SDL_GPUGraphicsPipelineTargetInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR_TARGET_DESCRIPTIONS,
        NUM_COLOR_TARGETS,
        DEPTH_STENCIL_FORMAT,
        HAS_DEPTH_STENCIL_TARGET,
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

        COLOR_TARGET_DESCRIPTIONS = layout.offsetof(0);
        NUM_COLOR_TARGETS = layout.offsetof(1);
        DEPTH_STENCIL_FORMAT = layout.offsetof(2);
        HAS_DEPTH_STENCIL_TARGET = layout.offsetof(3);
        PADDING1 = layout.offsetof(4);
        PADDING2 = layout.offsetof(5);
        PADDING3 = layout.offsetof(6);
    }

    protected SDL_GPUGraphicsPipelineTargetInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUGraphicsPipelineTargetInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUGraphicsPipelineTargetInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUGraphicsPipelineTargetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUGraphicsPipelineTargetInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SDL_GPUColorTargetDescription.Buffer} view of the struct array pointed to by the {@code color_target_descriptions} field. */
    @NativeType("SDL_GPUColorTargetDescription const *")
    public SDL_GPUColorTargetDescription.@Nullable Buffer color_target_descriptions() { return ncolor_target_descriptions(address()); }
    /** @return the value of the {@code num_color_targets} field. */
    @NativeType("Uint32")
    public int num_color_targets() { return nnum_color_targets(address()); }
    /** @return the value of the {@code depth_stencil_format} field. */
    @NativeType("SDL_GPUTextureFormat")
    public int depth_stencil_format() { return ndepth_stencil_format(address()); }
    /** @return the value of the {@code has_depth_stencil_target} field. */
    @NativeType("bool")
    public boolean has_depth_stencil_target() { return nhas_depth_stencil_target(address()); }

    /** Sets the address of the specified {@link SDL_GPUColorTargetDescription.Buffer} to the {@code color_target_descriptions} field. */
    public SDL_GPUGraphicsPipelineTargetInfo color_target_descriptions(@NativeType("SDL_GPUColorTargetDescription const *") SDL_GPUColorTargetDescription.@Nullable Buffer value) { ncolor_target_descriptions(address(), value); return this; }
    /** Sets the specified value to the {@code num_color_targets} field. */
    public SDL_GPUGraphicsPipelineTargetInfo num_color_targets(@NativeType("Uint32") int value) { nnum_color_targets(address(), value); return this; }
    /** Sets the specified value to the {@code depth_stencil_format} field. */
    public SDL_GPUGraphicsPipelineTargetInfo depth_stencil_format(@NativeType("SDL_GPUTextureFormat") int value) { ndepth_stencil_format(address(), value); return this; }
    /** Sets the specified value to the {@code has_depth_stencil_target} field. */
    public SDL_GPUGraphicsPipelineTargetInfo has_depth_stencil_target(@NativeType("bool") boolean value) { nhas_depth_stencil_target(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUGraphicsPipelineTargetInfo set(
        SDL_GPUColorTargetDescription.@Nullable Buffer color_target_descriptions,
        int num_color_targets,
        int depth_stencil_format,
        boolean has_depth_stencil_target
    ) {
        color_target_descriptions(color_target_descriptions);
        num_color_targets(num_color_targets);
        depth_stencil_format(depth_stencil_format);
        has_depth_stencil_target(has_depth_stencil_target);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUGraphicsPipelineTargetInfo set(SDL_GPUGraphicsPipelineTargetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUGraphicsPipelineTargetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUGraphicsPipelineTargetInfo malloc() {
        return new SDL_GPUGraphicsPipelineTargetInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUGraphicsPipelineTargetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUGraphicsPipelineTargetInfo calloc() {
        return new SDL_GPUGraphicsPipelineTargetInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUGraphicsPipelineTargetInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUGraphicsPipelineTargetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUGraphicsPipelineTargetInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUGraphicsPipelineTargetInfo} instance for the specified memory address. */
    public static SDL_GPUGraphicsPipelineTargetInfo create(long address) {
        return new SDL_GPUGraphicsPipelineTargetInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUGraphicsPipelineTargetInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUGraphicsPipelineTargetInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineTargetInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineTargetInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineTargetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineTargetInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUGraphicsPipelineTargetInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUGraphicsPipelineTargetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUGraphicsPipelineTargetInfo malloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineTargetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUGraphicsPipelineTargetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUGraphicsPipelineTargetInfo calloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineTargetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineTargetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineTargetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color_target_descriptions}. */
    public static SDL_GPUColorTargetDescription.@Nullable Buffer ncolor_target_descriptions(long struct) { return SDL_GPUColorTargetDescription.createSafe(memGetAddress(struct + SDL_GPUGraphicsPipelineTargetInfo.COLOR_TARGET_DESCRIPTIONS), nnum_color_targets(struct)); }
    /** Unsafe version of {@link #num_color_targets}. */
    public static int nnum_color_targets(long struct) { return memGetInt(struct + SDL_GPUGraphicsPipelineTargetInfo.NUM_COLOR_TARGETS); }
    /** Unsafe version of {@link #depth_stencil_format}. */
    public static int ndepth_stencil_format(long struct) { return memGetInt(struct + SDL_GPUGraphicsPipelineTargetInfo.DEPTH_STENCIL_FORMAT); }
    /** Unsafe version of {@link #has_depth_stencil_target}. */
    public static boolean nhas_depth_stencil_target(long struct) { return memGetByte(struct + SDL_GPUGraphicsPipelineTargetInfo.HAS_DEPTH_STENCIL_TARGET) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUGraphicsPipelineTargetInfo.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUGraphicsPipelineTargetInfo.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GPUGraphicsPipelineTargetInfo.PADDING3); }

    /** Unsafe version of {@link #color_target_descriptions(SDL_GPUColorTargetDescription.Buffer) color_target_descriptions}. */
    public static void ncolor_target_descriptions(long struct, SDL_GPUColorTargetDescription.@Nullable Buffer value) { memPutAddress(struct + SDL_GPUGraphicsPipelineTargetInfo.COLOR_TARGET_DESCRIPTIONS, memAddressSafe(value)); nnum_color_targets(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code num_color_targets} field of the specified {@code struct}. */
    public static void nnum_color_targets(long struct, int value) { memPutInt(struct + SDL_GPUGraphicsPipelineTargetInfo.NUM_COLOR_TARGETS, value); }
    /** Unsafe version of {@link #depth_stencil_format(int) depth_stencil_format}. */
    public static void ndepth_stencil_format(long struct, int value) { memPutInt(struct + SDL_GPUGraphicsPipelineTargetInfo.DEPTH_STENCIL_FORMAT, value); }
    /** Unsafe version of {@link #has_depth_stencil_target(boolean) has_depth_stencil_target}. */
    public static void nhas_depth_stencil_target(long struct, boolean value) { memPutByte(struct + SDL_GPUGraphicsPipelineTargetInfo.HAS_DEPTH_STENCIL_TARGET, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUGraphicsPipelineTargetInfo.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUGraphicsPipelineTargetInfo.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GPUGraphicsPipelineTargetInfo.PADDING3, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUGraphicsPipelineTargetInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUGraphicsPipelineTargetInfo, Buffer> implements NativeResource {

        private static final SDL_GPUGraphicsPipelineTargetInfo ELEMENT_FACTORY = SDL_GPUGraphicsPipelineTargetInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUGraphicsPipelineTargetInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUGraphicsPipelineTargetInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUGraphicsPipelineTargetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SDL_GPUColorTargetDescription.Buffer} view of the struct array pointed to by the {@code color_target_descriptions} field. */
        @NativeType("SDL_GPUColorTargetDescription const *")
        public SDL_GPUColorTargetDescription.@Nullable Buffer color_target_descriptions() { return SDL_GPUGraphicsPipelineTargetInfo.ncolor_target_descriptions(address()); }
        /** @return the value of the {@code num_color_targets} field. */
        @NativeType("Uint32")
        public int num_color_targets() { return SDL_GPUGraphicsPipelineTargetInfo.nnum_color_targets(address()); }
        /** @return the value of the {@code depth_stencil_format} field. */
        @NativeType("SDL_GPUTextureFormat")
        public int depth_stencil_format() { return SDL_GPUGraphicsPipelineTargetInfo.ndepth_stencil_format(address()); }
        /** @return the value of the {@code has_depth_stencil_target} field. */
        @NativeType("bool")
        public boolean has_depth_stencil_target() { return SDL_GPUGraphicsPipelineTargetInfo.nhas_depth_stencil_target(address()); }

        /** Sets the address of the specified {@link SDL_GPUColorTargetDescription.Buffer} to the {@code color_target_descriptions} field. */
        public SDL_GPUGraphicsPipelineTargetInfo.Buffer color_target_descriptions(@NativeType("SDL_GPUColorTargetDescription const *") SDL_GPUColorTargetDescription.@Nullable Buffer value) { SDL_GPUGraphicsPipelineTargetInfo.ncolor_target_descriptions(address(), value); return this; }
        /** Sets the specified value to the {@code num_color_targets} field. */
        public SDL_GPUGraphicsPipelineTargetInfo.Buffer num_color_targets(@NativeType("Uint32") int value) { SDL_GPUGraphicsPipelineTargetInfo.nnum_color_targets(address(), value); return this; }
        /** Sets the specified value to the {@code depth_stencil_format} field. */
        public SDL_GPUGraphicsPipelineTargetInfo.Buffer depth_stencil_format(@NativeType("SDL_GPUTextureFormat") int value) { SDL_GPUGraphicsPipelineTargetInfo.ndepth_stencil_format(address(), value); return this; }
        /** Sets the specified value to the {@code has_depth_stencil_target} field. */
        public SDL_GPUGraphicsPipelineTargetInfo.Buffer has_depth_stencil_target(@NativeType("bool") boolean value) { SDL_GPUGraphicsPipelineTargetInfo.nhas_depth_stencil_target(address(), value); return this; }

    }

}