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
 * struct SDL_GPUGraphicsPipelineCreateInfo {
 *     SDL_GPUShader * vertex_shader;
 *     SDL_GPUShader * fragment_shader;
 *     {@link SDL_GPUVertexInputState SDL_GPUVertexInputState} vertex_input_state;
 *     SDL_GPUPrimitiveType primitive_type;
 *     {@link SDL_GPURasterizerState SDL_GPURasterizerState} rasterizer_state;
 *     {@link SDL_GPUMultisampleState SDL_GPUMultisampleState} multisample_state;
 *     {@link SDL_GPUDepthStencilState SDL_GPUDepthStencilState} depth_stencil_state;
 *     {@link SDL_GPUGraphicsPipelineTargetInfo SDL_GPUGraphicsPipelineTargetInfo} target_info;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUGraphicsPipelineCreateInfo extends Struct<SDL_GPUGraphicsPipelineCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEX_SHADER,
        FRAGMENT_SHADER,
        VERTEX_INPUT_STATE,
        PRIMITIVE_TYPE,
        RASTERIZER_STATE,
        MULTISAMPLE_STATE,
        DEPTH_STENCIL_STATE,
        TARGET_INFO,
        PROPS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(SDL_GPUVertexInputState.SIZEOF, SDL_GPUVertexInputState.ALIGNOF),
            __member(4),
            __member(SDL_GPURasterizerState.SIZEOF, SDL_GPURasterizerState.ALIGNOF),
            __member(SDL_GPUMultisampleState.SIZEOF, SDL_GPUMultisampleState.ALIGNOF),
            __member(SDL_GPUDepthStencilState.SIZEOF, SDL_GPUDepthStencilState.ALIGNOF),
            __member(SDL_GPUGraphicsPipelineTargetInfo.SIZEOF, SDL_GPUGraphicsPipelineTargetInfo.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEX_SHADER = layout.offsetof(0);
        FRAGMENT_SHADER = layout.offsetof(1);
        VERTEX_INPUT_STATE = layout.offsetof(2);
        PRIMITIVE_TYPE = layout.offsetof(3);
        RASTERIZER_STATE = layout.offsetof(4);
        MULTISAMPLE_STATE = layout.offsetof(5);
        DEPTH_STENCIL_STATE = layout.offsetof(6);
        TARGET_INFO = layout.offsetof(7);
        PROPS = layout.offsetof(8);
    }

    protected SDL_GPUGraphicsPipelineCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUGraphicsPipelineCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUGraphicsPipelineCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUGraphicsPipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUGraphicsPipelineCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vertex_shader} field. */
    @NativeType("SDL_GPUShader *")
    public long vertex_shader() { return nvertex_shader(address()); }
    /** @return the value of the {@code fragment_shader} field. */
    @NativeType("SDL_GPUShader *")
    public long fragment_shader() { return nfragment_shader(address()); }
    /** @return a {@link SDL_GPUVertexInputState} view of the {@code vertex_input_state} field. */
    public SDL_GPUVertexInputState vertex_input_state() { return nvertex_input_state(address()); }
    /** @return the value of the {@code primitive_type} field. */
    @NativeType("SDL_GPUPrimitiveType")
    public int primitive_type() { return nprimitive_type(address()); }
    /** @return a {@link SDL_GPURasterizerState} view of the {@code rasterizer_state} field. */
    public SDL_GPURasterizerState rasterizer_state() { return nrasterizer_state(address()); }
    /** @return a {@link SDL_GPUMultisampleState} view of the {@code multisample_state} field. */
    public SDL_GPUMultisampleState multisample_state() { return nmultisample_state(address()); }
    /** @return a {@link SDL_GPUDepthStencilState} view of the {@code depth_stencil_state} field. */
    public SDL_GPUDepthStencilState depth_stencil_state() { return ndepth_stencil_state(address()); }
    /** @return a {@link SDL_GPUGraphicsPipelineTargetInfo} view of the {@code target_info} field. */
    public SDL_GPUGraphicsPipelineTargetInfo target_info() { return ntarget_info(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the specified value to the {@code vertex_shader} field. */
    public SDL_GPUGraphicsPipelineCreateInfo vertex_shader(@NativeType("SDL_GPUShader *") long value) { nvertex_shader(address(), value); return this; }
    /** Sets the specified value to the {@code fragment_shader} field. */
    public SDL_GPUGraphicsPipelineCreateInfo fragment_shader(@NativeType("SDL_GPUShader *") long value) { nfragment_shader(address(), value); return this; }
    /** Copies the specified {@link SDL_GPUVertexInputState} to the {@code vertex_input_state} field. */
    public SDL_GPUGraphicsPipelineCreateInfo vertex_input_state(SDL_GPUVertexInputState value) { nvertex_input_state(address(), value); return this; }
    /** Passes the {@code vertex_input_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUGraphicsPipelineCreateInfo vertex_input_state(java.util.function.Consumer<SDL_GPUVertexInputState> consumer) { consumer.accept(vertex_input_state()); return this; }
    /** Sets the specified value to the {@code primitive_type} field. */
    public SDL_GPUGraphicsPipelineCreateInfo primitive_type(@NativeType("SDL_GPUPrimitiveType") int value) { nprimitive_type(address(), value); return this; }
    /** Copies the specified {@link SDL_GPURasterizerState} to the {@code rasterizer_state} field. */
    public SDL_GPUGraphicsPipelineCreateInfo rasterizer_state(SDL_GPURasterizerState value) { nrasterizer_state(address(), value); return this; }
    /** Passes the {@code rasterizer_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUGraphicsPipelineCreateInfo rasterizer_state(java.util.function.Consumer<SDL_GPURasterizerState> consumer) { consumer.accept(rasterizer_state()); return this; }
    /** Copies the specified {@link SDL_GPUMultisampleState} to the {@code multisample_state} field. */
    public SDL_GPUGraphicsPipelineCreateInfo multisample_state(SDL_GPUMultisampleState value) { nmultisample_state(address(), value); return this; }
    /** Passes the {@code multisample_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUGraphicsPipelineCreateInfo multisample_state(java.util.function.Consumer<SDL_GPUMultisampleState> consumer) { consumer.accept(multisample_state()); return this; }
    /** Copies the specified {@link SDL_GPUDepthStencilState} to the {@code depth_stencil_state} field. */
    public SDL_GPUGraphicsPipelineCreateInfo depth_stencil_state(SDL_GPUDepthStencilState value) { ndepth_stencil_state(address(), value); return this; }
    /** Passes the {@code depth_stencil_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUGraphicsPipelineCreateInfo depth_stencil_state(java.util.function.Consumer<SDL_GPUDepthStencilState> consumer) { consumer.accept(depth_stencil_state()); return this; }
    /** Copies the specified {@link SDL_GPUGraphicsPipelineTargetInfo} to the {@code target_info} field. */
    public SDL_GPUGraphicsPipelineCreateInfo target_info(SDL_GPUGraphicsPipelineTargetInfo value) { ntarget_info(address(), value); return this; }
    /** Passes the {@code target_info} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUGraphicsPipelineCreateInfo target_info(java.util.function.Consumer<SDL_GPUGraphicsPipelineTargetInfo> consumer) { consumer.accept(target_info()); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUGraphicsPipelineCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUGraphicsPipelineCreateInfo set(
        long vertex_shader,
        long fragment_shader,
        SDL_GPUVertexInputState vertex_input_state,
        int primitive_type,
        SDL_GPURasterizerState rasterizer_state,
        SDL_GPUMultisampleState multisample_state,
        SDL_GPUDepthStencilState depth_stencil_state,
        SDL_GPUGraphicsPipelineTargetInfo target_info,
        int props
    ) {
        vertex_shader(vertex_shader);
        fragment_shader(fragment_shader);
        vertex_input_state(vertex_input_state);
        primitive_type(primitive_type);
        rasterizer_state(rasterizer_state);
        multisample_state(multisample_state);
        depth_stencil_state(depth_stencil_state);
        target_info(target_info);
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
    public SDL_GPUGraphicsPipelineCreateInfo set(SDL_GPUGraphicsPipelineCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUGraphicsPipelineCreateInfo malloc() {
        return new SDL_GPUGraphicsPipelineCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUGraphicsPipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUGraphicsPipelineCreateInfo calloc() {
        return new SDL_GPUGraphicsPipelineCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUGraphicsPipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUGraphicsPipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUGraphicsPipelineCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUGraphicsPipelineCreateInfo} instance for the specified memory address. */
    public static SDL_GPUGraphicsPipelineCreateInfo create(long address) {
        return new SDL_GPUGraphicsPipelineCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUGraphicsPipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUGraphicsPipelineCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUGraphicsPipelineCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUGraphicsPipelineCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUGraphicsPipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUGraphicsPipelineCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUGraphicsPipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUGraphicsPipelineCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertex_shader}. */
    public static long nvertex_shader(long struct) { return memGetAddress(struct + SDL_GPUGraphicsPipelineCreateInfo.VERTEX_SHADER); }
    /** Unsafe version of {@link #fragment_shader}. */
    public static long nfragment_shader(long struct) { return memGetAddress(struct + SDL_GPUGraphicsPipelineCreateInfo.FRAGMENT_SHADER); }
    /** Unsafe version of {@link #vertex_input_state}. */
    public static SDL_GPUVertexInputState nvertex_input_state(long struct) { return SDL_GPUVertexInputState.create(struct + SDL_GPUGraphicsPipelineCreateInfo.VERTEX_INPUT_STATE); }
    /** Unsafe version of {@link #primitive_type}. */
    public static int nprimitive_type(long struct) { return memGetInt(struct + SDL_GPUGraphicsPipelineCreateInfo.PRIMITIVE_TYPE); }
    /** Unsafe version of {@link #rasterizer_state}. */
    public static SDL_GPURasterizerState nrasterizer_state(long struct) { return SDL_GPURasterizerState.create(struct + SDL_GPUGraphicsPipelineCreateInfo.RASTERIZER_STATE); }
    /** Unsafe version of {@link #multisample_state}. */
    public static SDL_GPUMultisampleState nmultisample_state(long struct) { return SDL_GPUMultisampleState.create(struct + SDL_GPUGraphicsPipelineCreateInfo.MULTISAMPLE_STATE); }
    /** Unsafe version of {@link #depth_stencil_state}. */
    public static SDL_GPUDepthStencilState ndepth_stencil_state(long struct) { return SDL_GPUDepthStencilState.create(struct + SDL_GPUGraphicsPipelineCreateInfo.DEPTH_STENCIL_STATE); }
    /** Unsafe version of {@link #target_info}. */
    public static SDL_GPUGraphicsPipelineTargetInfo ntarget_info(long struct) { return SDL_GPUGraphicsPipelineTargetInfo.create(struct + SDL_GPUGraphicsPipelineCreateInfo.TARGET_INFO); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUGraphicsPipelineCreateInfo.PROPS); }

    /** Unsafe version of {@link #vertex_shader(long) vertex_shader}. */
    public static void nvertex_shader(long struct, long value) { memPutAddress(struct + SDL_GPUGraphicsPipelineCreateInfo.VERTEX_SHADER, value); }
    /** Unsafe version of {@link #fragment_shader(long) fragment_shader}. */
    public static void nfragment_shader(long struct, long value) { memPutAddress(struct + SDL_GPUGraphicsPipelineCreateInfo.FRAGMENT_SHADER, value); }
    /** Unsafe version of {@link #vertex_input_state(SDL_GPUVertexInputState) vertex_input_state}. */
    public static void nvertex_input_state(long struct, SDL_GPUVertexInputState value) { memCopy(value.address(), struct + SDL_GPUGraphicsPipelineCreateInfo.VERTEX_INPUT_STATE, SDL_GPUVertexInputState.SIZEOF); }
    /** Unsafe version of {@link #primitive_type(int) primitive_type}. */
    public static void nprimitive_type(long struct, int value) { memPutInt(struct + SDL_GPUGraphicsPipelineCreateInfo.PRIMITIVE_TYPE, value); }
    /** Unsafe version of {@link #rasterizer_state(SDL_GPURasterizerState) rasterizer_state}. */
    public static void nrasterizer_state(long struct, SDL_GPURasterizerState value) { memCopy(value.address(), struct + SDL_GPUGraphicsPipelineCreateInfo.RASTERIZER_STATE, SDL_GPURasterizerState.SIZEOF); }
    /** Unsafe version of {@link #multisample_state(SDL_GPUMultisampleState) multisample_state}. */
    public static void nmultisample_state(long struct, SDL_GPUMultisampleState value) { memCopy(value.address(), struct + SDL_GPUGraphicsPipelineCreateInfo.MULTISAMPLE_STATE, SDL_GPUMultisampleState.SIZEOF); }
    /** Unsafe version of {@link #depth_stencil_state(SDL_GPUDepthStencilState) depth_stencil_state}. */
    public static void ndepth_stencil_state(long struct, SDL_GPUDepthStencilState value) { memCopy(value.address(), struct + SDL_GPUGraphicsPipelineCreateInfo.DEPTH_STENCIL_STATE, SDL_GPUDepthStencilState.SIZEOF); }
    /** Unsafe version of {@link #target_info(SDL_GPUGraphicsPipelineTargetInfo) target_info}. */
    public static void ntarget_info(long struct, SDL_GPUGraphicsPipelineTargetInfo value) { memCopy(value.address(), struct + SDL_GPUGraphicsPipelineCreateInfo.TARGET_INFO, SDL_GPUGraphicsPipelineTargetInfo.SIZEOF); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUGraphicsPipelineCreateInfo.PROPS, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUGraphicsPipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUGraphicsPipelineCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUGraphicsPipelineCreateInfo ELEMENT_FACTORY = SDL_GPUGraphicsPipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUGraphicsPipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUGraphicsPipelineCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUGraphicsPipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vertex_shader} field. */
        @NativeType("SDL_GPUShader *")
        public long vertex_shader() { return SDL_GPUGraphicsPipelineCreateInfo.nvertex_shader(address()); }
        /** @return the value of the {@code fragment_shader} field. */
        @NativeType("SDL_GPUShader *")
        public long fragment_shader() { return SDL_GPUGraphicsPipelineCreateInfo.nfragment_shader(address()); }
        /** @return a {@link SDL_GPUVertexInputState} view of the {@code vertex_input_state} field. */
        public SDL_GPUVertexInputState vertex_input_state() { return SDL_GPUGraphicsPipelineCreateInfo.nvertex_input_state(address()); }
        /** @return the value of the {@code primitive_type} field. */
        @NativeType("SDL_GPUPrimitiveType")
        public int primitive_type() { return SDL_GPUGraphicsPipelineCreateInfo.nprimitive_type(address()); }
        /** @return a {@link SDL_GPURasterizerState} view of the {@code rasterizer_state} field. */
        public SDL_GPURasterizerState rasterizer_state() { return SDL_GPUGraphicsPipelineCreateInfo.nrasterizer_state(address()); }
        /** @return a {@link SDL_GPUMultisampleState} view of the {@code multisample_state} field. */
        public SDL_GPUMultisampleState multisample_state() { return SDL_GPUGraphicsPipelineCreateInfo.nmultisample_state(address()); }
        /** @return a {@link SDL_GPUDepthStencilState} view of the {@code depth_stencil_state} field. */
        public SDL_GPUDepthStencilState depth_stencil_state() { return SDL_GPUGraphicsPipelineCreateInfo.ndepth_stencil_state(address()); }
        /** @return a {@link SDL_GPUGraphicsPipelineTargetInfo} view of the {@code target_info} field. */
        public SDL_GPUGraphicsPipelineTargetInfo target_info() { return SDL_GPUGraphicsPipelineCreateInfo.ntarget_info(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUGraphicsPipelineCreateInfo.nprops(address()); }

        /** Sets the specified value to the {@code vertex_shader} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer vertex_shader(@NativeType("SDL_GPUShader *") long value) { SDL_GPUGraphicsPipelineCreateInfo.nvertex_shader(address(), value); return this; }
        /** Sets the specified value to the {@code fragment_shader} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer fragment_shader(@NativeType("SDL_GPUShader *") long value) { SDL_GPUGraphicsPipelineCreateInfo.nfragment_shader(address(), value); return this; }
        /** Copies the specified {@link SDL_GPUVertexInputState} to the {@code vertex_input_state} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer vertex_input_state(SDL_GPUVertexInputState value) { SDL_GPUGraphicsPipelineCreateInfo.nvertex_input_state(address(), value); return this; }
        /** Passes the {@code vertex_input_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer vertex_input_state(java.util.function.Consumer<SDL_GPUVertexInputState> consumer) { consumer.accept(vertex_input_state()); return this; }
        /** Sets the specified value to the {@code primitive_type} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer primitive_type(@NativeType("SDL_GPUPrimitiveType") int value) { SDL_GPUGraphicsPipelineCreateInfo.nprimitive_type(address(), value); return this; }
        /** Copies the specified {@link SDL_GPURasterizerState} to the {@code rasterizer_state} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer rasterizer_state(SDL_GPURasterizerState value) { SDL_GPUGraphicsPipelineCreateInfo.nrasterizer_state(address(), value); return this; }
        /** Passes the {@code rasterizer_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer rasterizer_state(java.util.function.Consumer<SDL_GPURasterizerState> consumer) { consumer.accept(rasterizer_state()); return this; }
        /** Copies the specified {@link SDL_GPUMultisampleState} to the {@code multisample_state} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer multisample_state(SDL_GPUMultisampleState value) { SDL_GPUGraphicsPipelineCreateInfo.nmultisample_state(address(), value); return this; }
        /** Passes the {@code multisample_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer multisample_state(java.util.function.Consumer<SDL_GPUMultisampleState> consumer) { consumer.accept(multisample_state()); return this; }
        /** Copies the specified {@link SDL_GPUDepthStencilState} to the {@code depth_stencil_state} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer depth_stencil_state(SDL_GPUDepthStencilState value) { SDL_GPUGraphicsPipelineCreateInfo.ndepth_stencil_state(address(), value); return this; }
        /** Passes the {@code depth_stencil_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer depth_stencil_state(java.util.function.Consumer<SDL_GPUDepthStencilState> consumer) { consumer.accept(depth_stencil_state()); return this; }
        /** Copies the specified {@link SDL_GPUGraphicsPipelineTargetInfo} to the {@code target_info} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer target_info(SDL_GPUGraphicsPipelineTargetInfo value) { SDL_GPUGraphicsPipelineCreateInfo.ntarget_info(address(), value); return this; }
        /** Passes the {@code target_info} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer target_info(java.util.function.Consumer<SDL_GPUGraphicsPipelineTargetInfo> consumer) { consumer.accept(target_info()); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUGraphicsPipelineCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUGraphicsPipelineCreateInfo.nprops(address(), value); return this; }

    }

}