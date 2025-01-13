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
 * struct SDL_GPURasterizerState {
 *     SDL_GPUFillMode fill_mode;
 *     SDL_GPUCullMode cull_mode;
 *     SDL_GPUFrontFace front_face;
 *     float depth_bias_constant_factor;
 *     float depth_bias_clamp;
 *     float depth_bias_slope_factor;
 *     bool enable_depth_bias;
 *     bool enable_depth_clip;
 *     Uint8 padding1;
 *     Uint8 padding2;
 * }}</pre>
 */
public class SDL_GPURasterizerState extends Struct<SDL_GPURasterizerState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILL_MODE,
        CULL_MODE,
        FRONT_FACE,
        DEPTH_BIAS_CONSTANT_FACTOR,
        DEPTH_BIAS_CLAMP,
        DEPTH_BIAS_SLOPE_FACTOR,
        ENABLE_DEPTH_BIAS,
        ENABLE_DEPTH_CLIP,
        PADDING1,
        PADDING2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILL_MODE = layout.offsetof(0);
        CULL_MODE = layout.offsetof(1);
        FRONT_FACE = layout.offsetof(2);
        DEPTH_BIAS_CONSTANT_FACTOR = layout.offsetof(3);
        DEPTH_BIAS_CLAMP = layout.offsetof(4);
        DEPTH_BIAS_SLOPE_FACTOR = layout.offsetof(5);
        ENABLE_DEPTH_BIAS = layout.offsetof(6);
        ENABLE_DEPTH_CLIP = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
    }

    protected SDL_GPURasterizerState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPURasterizerState create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPURasterizerState(address, container);
    }

    /**
     * Creates a {@code SDL_GPURasterizerState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPURasterizerState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fill_mode} field. */
    @NativeType("SDL_GPUFillMode")
    public int fill_mode() { return nfill_mode(address()); }
    /** @return the value of the {@code cull_mode} field. */
    @NativeType("SDL_GPUCullMode")
    public int cull_mode() { return ncull_mode(address()); }
    /** @return the value of the {@code front_face} field. */
    @NativeType("SDL_GPUFrontFace")
    public int front_face() { return nfront_face(address()); }
    /** @return the value of the {@code depth_bias_constant_factor} field. */
    public float depth_bias_constant_factor() { return ndepth_bias_constant_factor(address()); }
    /** @return the value of the {@code depth_bias_clamp} field. */
    public float depth_bias_clamp() { return ndepth_bias_clamp(address()); }
    /** @return the value of the {@code depth_bias_slope_factor} field. */
    public float depth_bias_slope_factor() { return ndepth_bias_slope_factor(address()); }
    /** @return the value of the {@code enable_depth_bias} field. */
    @NativeType("bool")
    public boolean enable_depth_bias() { return nenable_depth_bias(address()); }
    /** @return the value of the {@code enable_depth_clip} field. */
    @NativeType("bool")
    public boolean enable_depth_clip() { return nenable_depth_clip(address()); }

    /** Sets the specified value to the {@code fill_mode} field. */
    public SDL_GPURasterizerState fill_mode(@NativeType("SDL_GPUFillMode") int value) { nfill_mode(address(), value); return this; }
    /** Sets the specified value to the {@code cull_mode} field. */
    public SDL_GPURasterizerState cull_mode(@NativeType("SDL_GPUCullMode") int value) { ncull_mode(address(), value); return this; }
    /** Sets the specified value to the {@code front_face} field. */
    public SDL_GPURasterizerState front_face(@NativeType("SDL_GPUFrontFace") int value) { nfront_face(address(), value); return this; }
    /** Sets the specified value to the {@code depth_bias_constant_factor} field. */
    public SDL_GPURasterizerState depth_bias_constant_factor(float value) { ndepth_bias_constant_factor(address(), value); return this; }
    /** Sets the specified value to the {@code depth_bias_clamp} field. */
    public SDL_GPURasterizerState depth_bias_clamp(float value) { ndepth_bias_clamp(address(), value); return this; }
    /** Sets the specified value to the {@code depth_bias_slope_factor} field. */
    public SDL_GPURasterizerState depth_bias_slope_factor(float value) { ndepth_bias_slope_factor(address(), value); return this; }
    /** Sets the specified value to the {@code enable_depth_bias} field. */
    public SDL_GPURasterizerState enable_depth_bias(@NativeType("bool") boolean value) { nenable_depth_bias(address(), value); return this; }
    /** Sets the specified value to the {@code enable_depth_clip} field. */
    public SDL_GPURasterizerState enable_depth_clip(@NativeType("bool") boolean value) { nenable_depth_clip(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPURasterizerState set(
        int fill_mode,
        int cull_mode,
        int front_face,
        float depth_bias_constant_factor,
        float depth_bias_clamp,
        float depth_bias_slope_factor,
        boolean enable_depth_bias,
        boolean enable_depth_clip
    ) {
        fill_mode(fill_mode);
        cull_mode(cull_mode);
        front_face(front_face);
        depth_bias_constant_factor(depth_bias_constant_factor);
        depth_bias_clamp(depth_bias_clamp);
        depth_bias_slope_factor(depth_bias_slope_factor);
        enable_depth_bias(enable_depth_bias);
        enable_depth_clip(enable_depth_clip);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPURasterizerState set(SDL_GPURasterizerState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPURasterizerState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPURasterizerState malloc() {
        return new SDL_GPURasterizerState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPURasterizerState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPURasterizerState calloc() {
        return new SDL_GPURasterizerState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPURasterizerState} instance allocated with {@link BufferUtils}. */
    public static SDL_GPURasterizerState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPURasterizerState(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPURasterizerState} instance for the specified memory address. */
    public static SDL_GPURasterizerState create(long address) {
        return new SDL_GPURasterizerState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPURasterizerState createSafe(long address) {
        return address == NULL ? null : new SDL_GPURasterizerState(address, null);
    }

    /**
     * Returns a new {@link SDL_GPURasterizerState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPURasterizerState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPURasterizerState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPURasterizerState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPURasterizerState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPURasterizerState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPURasterizerState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPURasterizerState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPURasterizerState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPURasterizerState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPURasterizerState malloc(MemoryStack stack) {
        return new SDL_GPURasterizerState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPURasterizerState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPURasterizerState calloc(MemoryStack stack) {
        return new SDL_GPURasterizerState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPURasterizerState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPURasterizerState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPURasterizerState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPURasterizerState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fill_mode}. */
    public static int nfill_mode(long struct) { return memGetInt(struct + SDL_GPURasterizerState.FILL_MODE); }
    /** Unsafe version of {@link #cull_mode}. */
    public static int ncull_mode(long struct) { return memGetInt(struct + SDL_GPURasterizerState.CULL_MODE); }
    /** Unsafe version of {@link #front_face}. */
    public static int nfront_face(long struct) { return memGetInt(struct + SDL_GPURasterizerState.FRONT_FACE); }
    /** Unsafe version of {@link #depth_bias_constant_factor}. */
    public static float ndepth_bias_constant_factor(long struct) { return memGetFloat(struct + SDL_GPURasterizerState.DEPTH_BIAS_CONSTANT_FACTOR); }
    /** Unsafe version of {@link #depth_bias_clamp}. */
    public static float ndepth_bias_clamp(long struct) { return memGetFloat(struct + SDL_GPURasterizerState.DEPTH_BIAS_CLAMP); }
    /** Unsafe version of {@link #depth_bias_slope_factor}. */
    public static float ndepth_bias_slope_factor(long struct) { return memGetFloat(struct + SDL_GPURasterizerState.DEPTH_BIAS_SLOPE_FACTOR); }
    /** Unsafe version of {@link #enable_depth_bias}. */
    public static boolean nenable_depth_bias(long struct) { return memGetByte(struct + SDL_GPURasterizerState.ENABLE_DEPTH_BIAS) != 0; }
    /** Unsafe version of {@link #enable_depth_clip}. */
    public static boolean nenable_depth_clip(long struct) { return memGetByte(struct + SDL_GPURasterizerState.ENABLE_DEPTH_CLIP) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPURasterizerState.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPURasterizerState.PADDING2); }

    /** Unsafe version of {@link #fill_mode(int) fill_mode}. */
    public static void nfill_mode(long struct, int value) { memPutInt(struct + SDL_GPURasterizerState.FILL_MODE, value); }
    /** Unsafe version of {@link #cull_mode(int) cull_mode}. */
    public static void ncull_mode(long struct, int value) { memPutInt(struct + SDL_GPURasterizerState.CULL_MODE, value); }
    /** Unsafe version of {@link #front_face(int) front_face}. */
    public static void nfront_face(long struct, int value) { memPutInt(struct + SDL_GPURasterizerState.FRONT_FACE, value); }
    /** Unsafe version of {@link #depth_bias_constant_factor(float) depth_bias_constant_factor}. */
    public static void ndepth_bias_constant_factor(long struct, float value) { memPutFloat(struct + SDL_GPURasterizerState.DEPTH_BIAS_CONSTANT_FACTOR, value); }
    /** Unsafe version of {@link #depth_bias_clamp(float) depth_bias_clamp}. */
    public static void ndepth_bias_clamp(long struct, float value) { memPutFloat(struct + SDL_GPURasterizerState.DEPTH_BIAS_CLAMP, value); }
    /** Unsafe version of {@link #depth_bias_slope_factor(float) depth_bias_slope_factor}. */
    public static void ndepth_bias_slope_factor(long struct, float value) { memPutFloat(struct + SDL_GPURasterizerState.DEPTH_BIAS_SLOPE_FACTOR, value); }
    /** Unsafe version of {@link #enable_depth_bias(boolean) enable_depth_bias}. */
    public static void nenable_depth_bias(long struct, boolean value) { memPutByte(struct + SDL_GPURasterizerState.ENABLE_DEPTH_BIAS, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #enable_depth_clip(boolean) enable_depth_clip}. */
    public static void nenable_depth_clip(long struct, boolean value) { memPutByte(struct + SDL_GPURasterizerState.ENABLE_DEPTH_CLIP, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPURasterizerState.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPURasterizerState.PADDING2, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPURasterizerState} structs. */
    public static class Buffer extends StructBuffer<SDL_GPURasterizerState, Buffer> implements NativeResource {

        private static final SDL_GPURasterizerState ELEMENT_FACTORY = SDL_GPURasterizerState.create(-1L);

        /**
         * Creates a new {@code SDL_GPURasterizerState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPURasterizerState#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPURasterizerState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fill_mode} field. */
        @NativeType("SDL_GPUFillMode")
        public int fill_mode() { return SDL_GPURasterizerState.nfill_mode(address()); }
        /** @return the value of the {@code cull_mode} field. */
        @NativeType("SDL_GPUCullMode")
        public int cull_mode() { return SDL_GPURasterizerState.ncull_mode(address()); }
        /** @return the value of the {@code front_face} field. */
        @NativeType("SDL_GPUFrontFace")
        public int front_face() { return SDL_GPURasterizerState.nfront_face(address()); }
        /** @return the value of the {@code depth_bias_constant_factor} field. */
        public float depth_bias_constant_factor() { return SDL_GPURasterizerState.ndepth_bias_constant_factor(address()); }
        /** @return the value of the {@code depth_bias_clamp} field. */
        public float depth_bias_clamp() { return SDL_GPURasterizerState.ndepth_bias_clamp(address()); }
        /** @return the value of the {@code depth_bias_slope_factor} field. */
        public float depth_bias_slope_factor() { return SDL_GPURasterizerState.ndepth_bias_slope_factor(address()); }
        /** @return the value of the {@code enable_depth_bias} field. */
        @NativeType("bool")
        public boolean enable_depth_bias() { return SDL_GPURasterizerState.nenable_depth_bias(address()); }
        /** @return the value of the {@code enable_depth_clip} field. */
        @NativeType("bool")
        public boolean enable_depth_clip() { return SDL_GPURasterizerState.nenable_depth_clip(address()); }

        /** Sets the specified value to the {@code fill_mode} field. */
        public SDL_GPURasterizerState.Buffer fill_mode(@NativeType("SDL_GPUFillMode") int value) { SDL_GPURasterizerState.nfill_mode(address(), value); return this; }
        /** Sets the specified value to the {@code cull_mode} field. */
        public SDL_GPURasterizerState.Buffer cull_mode(@NativeType("SDL_GPUCullMode") int value) { SDL_GPURasterizerState.ncull_mode(address(), value); return this; }
        /** Sets the specified value to the {@code front_face} field. */
        public SDL_GPURasterizerState.Buffer front_face(@NativeType("SDL_GPUFrontFace") int value) { SDL_GPURasterizerState.nfront_face(address(), value); return this; }
        /** Sets the specified value to the {@code depth_bias_constant_factor} field. */
        public SDL_GPURasterizerState.Buffer depth_bias_constant_factor(float value) { SDL_GPURasterizerState.ndepth_bias_constant_factor(address(), value); return this; }
        /** Sets the specified value to the {@code depth_bias_clamp} field. */
        public SDL_GPURasterizerState.Buffer depth_bias_clamp(float value) { SDL_GPURasterizerState.ndepth_bias_clamp(address(), value); return this; }
        /** Sets the specified value to the {@code depth_bias_slope_factor} field. */
        public SDL_GPURasterizerState.Buffer depth_bias_slope_factor(float value) { SDL_GPURasterizerState.ndepth_bias_slope_factor(address(), value); return this; }
        /** Sets the specified value to the {@code enable_depth_bias} field. */
        public SDL_GPURasterizerState.Buffer enable_depth_bias(@NativeType("bool") boolean value) { SDL_GPURasterizerState.nenable_depth_bias(address(), value); return this; }
        /** Sets the specified value to the {@code enable_depth_clip} field. */
        public SDL_GPURasterizerState.Buffer enable_depth_clip(@NativeType("bool") boolean value) { SDL_GPURasterizerState.nenable_depth_clip(address(), value); return this; }

    }

}