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
 * struct SDL_GPUStencilOpState {
 *     SDL_GPUStencilOp fail_op;
 *     SDL_GPUStencilOp pass_op;
 *     SDL_GPUStencilOp depth_fail_op;
 *     SDL_GPUCompareOp compare_op;
 * }}</pre>
 */
public class SDL_GPUStencilOpState extends Struct<SDL_GPUStencilOpState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FAIL_OP,
        PASS_OP,
        DEPTH_FAIL_OP,
        COMPARE_OP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FAIL_OP = layout.offsetof(0);
        PASS_OP = layout.offsetof(1);
        DEPTH_FAIL_OP = layout.offsetof(2);
        COMPARE_OP = layout.offsetof(3);
    }

    protected SDL_GPUStencilOpState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUStencilOpState create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUStencilOpState(address, container);
    }

    /**
     * Creates a {@code SDL_GPUStencilOpState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUStencilOpState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fail_op} field. */
    @NativeType("SDL_GPUStencilOp")
    public int fail_op() { return nfail_op(address()); }
    /** @return the value of the {@code pass_op} field. */
    @NativeType("SDL_GPUStencilOp")
    public int pass_op() { return npass_op(address()); }
    /** @return the value of the {@code depth_fail_op} field. */
    @NativeType("SDL_GPUStencilOp")
    public int depth_fail_op() { return ndepth_fail_op(address()); }
    /** @return the value of the {@code compare_op} field. */
    @NativeType("SDL_GPUCompareOp")
    public int compare_op() { return ncompare_op(address()); }

    /** Sets the specified value to the {@code fail_op} field. */
    public SDL_GPUStencilOpState fail_op(@NativeType("SDL_GPUStencilOp") int value) { nfail_op(address(), value); return this; }
    /** Sets the specified value to the {@code pass_op} field. */
    public SDL_GPUStencilOpState pass_op(@NativeType("SDL_GPUStencilOp") int value) { npass_op(address(), value); return this; }
    /** Sets the specified value to the {@code depth_fail_op} field. */
    public SDL_GPUStencilOpState depth_fail_op(@NativeType("SDL_GPUStencilOp") int value) { ndepth_fail_op(address(), value); return this; }
    /** Sets the specified value to the {@code compare_op} field. */
    public SDL_GPUStencilOpState compare_op(@NativeType("SDL_GPUCompareOp") int value) { ncompare_op(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUStencilOpState set(
        int fail_op,
        int pass_op,
        int depth_fail_op,
        int compare_op
    ) {
        fail_op(fail_op);
        pass_op(pass_op);
        depth_fail_op(depth_fail_op);
        compare_op(compare_op);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUStencilOpState set(SDL_GPUStencilOpState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUStencilOpState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUStencilOpState malloc() {
        return new SDL_GPUStencilOpState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUStencilOpState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUStencilOpState calloc() {
        return new SDL_GPUStencilOpState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUStencilOpState} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUStencilOpState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUStencilOpState(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUStencilOpState} instance for the specified memory address. */
    public static SDL_GPUStencilOpState create(long address) {
        return new SDL_GPUStencilOpState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUStencilOpState createSafe(long address) {
        return address == NULL ? null : new SDL_GPUStencilOpState(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUStencilOpState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStencilOpState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStencilOpState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStencilOpState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStencilOpState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStencilOpState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUStencilOpState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStencilOpState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUStencilOpState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUStencilOpState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUStencilOpState malloc(MemoryStack stack) {
        return new SDL_GPUStencilOpState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUStencilOpState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUStencilOpState calloc(MemoryStack stack) {
        return new SDL_GPUStencilOpState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStencilOpState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUStencilOpState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fail_op}. */
    public static int nfail_op(long struct) { return memGetInt(struct + SDL_GPUStencilOpState.FAIL_OP); }
    /** Unsafe version of {@link #pass_op}. */
    public static int npass_op(long struct) { return memGetInt(struct + SDL_GPUStencilOpState.PASS_OP); }
    /** Unsafe version of {@link #depth_fail_op}. */
    public static int ndepth_fail_op(long struct) { return memGetInt(struct + SDL_GPUStencilOpState.DEPTH_FAIL_OP); }
    /** Unsafe version of {@link #compare_op}. */
    public static int ncompare_op(long struct) { return memGetInt(struct + SDL_GPUStencilOpState.COMPARE_OP); }

    /** Unsafe version of {@link #fail_op(int) fail_op}. */
    public static void nfail_op(long struct, int value) { memPutInt(struct + SDL_GPUStencilOpState.FAIL_OP, value); }
    /** Unsafe version of {@link #pass_op(int) pass_op}. */
    public static void npass_op(long struct, int value) { memPutInt(struct + SDL_GPUStencilOpState.PASS_OP, value); }
    /** Unsafe version of {@link #depth_fail_op(int) depth_fail_op}. */
    public static void ndepth_fail_op(long struct, int value) { memPutInt(struct + SDL_GPUStencilOpState.DEPTH_FAIL_OP, value); }
    /** Unsafe version of {@link #compare_op(int) compare_op}. */
    public static void ncompare_op(long struct, int value) { memPutInt(struct + SDL_GPUStencilOpState.COMPARE_OP, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUStencilOpState} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUStencilOpState, Buffer> implements NativeResource {

        private static final SDL_GPUStencilOpState ELEMENT_FACTORY = SDL_GPUStencilOpState.create(-1L);

        /**
         * Creates a new {@code SDL_GPUStencilOpState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUStencilOpState#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUStencilOpState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fail_op} field. */
        @NativeType("SDL_GPUStencilOp")
        public int fail_op() { return SDL_GPUStencilOpState.nfail_op(address()); }
        /** @return the value of the {@code pass_op} field. */
        @NativeType("SDL_GPUStencilOp")
        public int pass_op() { return SDL_GPUStencilOpState.npass_op(address()); }
        /** @return the value of the {@code depth_fail_op} field. */
        @NativeType("SDL_GPUStencilOp")
        public int depth_fail_op() { return SDL_GPUStencilOpState.ndepth_fail_op(address()); }
        /** @return the value of the {@code compare_op} field. */
        @NativeType("SDL_GPUCompareOp")
        public int compare_op() { return SDL_GPUStencilOpState.ncompare_op(address()); }

        /** Sets the specified value to the {@code fail_op} field. */
        public SDL_GPUStencilOpState.Buffer fail_op(@NativeType("SDL_GPUStencilOp") int value) { SDL_GPUStencilOpState.nfail_op(address(), value); return this; }
        /** Sets the specified value to the {@code pass_op} field. */
        public SDL_GPUStencilOpState.Buffer pass_op(@NativeType("SDL_GPUStencilOp") int value) { SDL_GPUStencilOpState.npass_op(address(), value); return this; }
        /** Sets the specified value to the {@code depth_fail_op} field. */
        public SDL_GPUStencilOpState.Buffer depth_fail_op(@NativeType("SDL_GPUStencilOp") int value) { SDL_GPUStencilOpState.ndepth_fail_op(address(), value); return this; }
        /** Sets the specified value to the {@code compare_op} field. */
        public SDL_GPUStencilOpState.Buffer compare_op(@NativeType("SDL_GPUCompareOp") int value) { SDL_GPUStencilOpState.ncompare_op(address(), value); return this; }

    }

}