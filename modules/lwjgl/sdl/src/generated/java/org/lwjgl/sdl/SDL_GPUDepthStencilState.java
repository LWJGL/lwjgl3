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
 * struct SDL_GPUDepthStencilState {
 *     SDL_GPUCompareOp compare_op;
 *     {@link SDL_GPUStencilOpState SDL_GPUStencilOpState} back_stencil_state;
 *     {@link SDL_GPUStencilOpState SDL_GPUStencilOpState} front_stencil_state;
 *     Uint8 compare_mask;
 *     Uint8 write_mask;
 *     bool enable_depth_test;
 *     bool enable_depth_write;
 *     bool enable_stencil_test;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_GPUDepthStencilState extends Struct<SDL_GPUDepthStencilState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMPARE_OP,
        BACK_STENCIL_STATE,
        FRONT_STENCIL_STATE,
        COMPARE_MASK,
        WRITE_MASK,
        ENABLE_DEPTH_TEST,
        ENABLE_DEPTH_WRITE,
        ENABLE_STENCIL_TEST,
        PADDING1,
        PADDING2,
        PADDING3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(SDL_GPUStencilOpState.SIZEOF, SDL_GPUStencilOpState.ALIGNOF),
            __member(SDL_GPUStencilOpState.SIZEOF, SDL_GPUStencilOpState.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMPARE_OP = layout.offsetof(0);
        BACK_STENCIL_STATE = layout.offsetof(1);
        FRONT_STENCIL_STATE = layout.offsetof(2);
        COMPARE_MASK = layout.offsetof(3);
        WRITE_MASK = layout.offsetof(4);
        ENABLE_DEPTH_TEST = layout.offsetof(5);
        ENABLE_DEPTH_WRITE = layout.offsetof(6);
        ENABLE_STENCIL_TEST = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
        PADDING3 = layout.offsetof(10);
    }

    protected SDL_GPUDepthStencilState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUDepthStencilState create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUDepthStencilState(address, container);
    }

    /**
     * Creates a {@code SDL_GPUDepthStencilState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUDepthStencilState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code compare_op} field. */
    @NativeType("SDL_GPUCompareOp")
    public int compare_op() { return ncompare_op(address()); }
    /** @return a {@link SDL_GPUStencilOpState} view of the {@code back_stencil_state} field. */
    public SDL_GPUStencilOpState back_stencil_state() { return nback_stencil_state(address()); }
    /** @return a {@link SDL_GPUStencilOpState} view of the {@code front_stencil_state} field. */
    public SDL_GPUStencilOpState front_stencil_state() { return nfront_stencil_state(address()); }
    /** @return the value of the {@code compare_mask} field. */
    @NativeType("Uint8")
    public byte compare_mask() { return ncompare_mask(address()); }
    /** @return the value of the {@code write_mask} field. */
    @NativeType("Uint8")
    public byte write_mask() { return nwrite_mask(address()); }
    /** @return the value of the {@code enable_depth_test} field. */
    @NativeType("bool")
    public boolean enable_depth_test() { return nenable_depth_test(address()); }
    /** @return the value of the {@code enable_depth_write} field. */
    @NativeType("bool")
    public boolean enable_depth_write() { return nenable_depth_write(address()); }
    /** @return the value of the {@code enable_stencil_test} field. */
    @NativeType("bool")
    public boolean enable_stencil_test() { return nenable_stencil_test(address()); }

    /** Sets the specified value to the {@code compare_op} field. */
    public SDL_GPUDepthStencilState compare_op(@NativeType("SDL_GPUCompareOp") int value) { ncompare_op(address(), value); return this; }
    /** Copies the specified {@link SDL_GPUStencilOpState} to the {@code back_stencil_state} field. */
    public SDL_GPUDepthStencilState back_stencil_state(SDL_GPUStencilOpState value) { nback_stencil_state(address(), value); return this; }
    /** Passes the {@code back_stencil_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUDepthStencilState back_stencil_state(java.util.function.Consumer<SDL_GPUStencilOpState> consumer) { consumer.accept(back_stencil_state()); return this; }
    /** Copies the specified {@link SDL_GPUStencilOpState} to the {@code front_stencil_state} field. */
    public SDL_GPUDepthStencilState front_stencil_state(SDL_GPUStencilOpState value) { nfront_stencil_state(address(), value); return this; }
    /** Passes the {@code front_stencil_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUDepthStencilState front_stencil_state(java.util.function.Consumer<SDL_GPUStencilOpState> consumer) { consumer.accept(front_stencil_state()); return this; }
    /** Sets the specified value to the {@code compare_mask} field. */
    public SDL_GPUDepthStencilState compare_mask(@NativeType("Uint8") byte value) { ncompare_mask(address(), value); return this; }
    /** Sets the specified value to the {@code write_mask} field. */
    public SDL_GPUDepthStencilState write_mask(@NativeType("Uint8") byte value) { nwrite_mask(address(), value); return this; }
    /** Sets the specified value to the {@code enable_depth_test} field. */
    public SDL_GPUDepthStencilState enable_depth_test(@NativeType("bool") boolean value) { nenable_depth_test(address(), value); return this; }
    /** Sets the specified value to the {@code enable_depth_write} field. */
    public SDL_GPUDepthStencilState enable_depth_write(@NativeType("bool") boolean value) { nenable_depth_write(address(), value); return this; }
    /** Sets the specified value to the {@code enable_stencil_test} field. */
    public SDL_GPUDepthStencilState enable_stencil_test(@NativeType("bool") boolean value) { nenable_stencil_test(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUDepthStencilState set(
        int compare_op,
        SDL_GPUStencilOpState back_stencil_state,
        SDL_GPUStencilOpState front_stencil_state,
        byte compare_mask,
        byte write_mask,
        boolean enable_depth_test,
        boolean enable_depth_write,
        boolean enable_stencil_test
    ) {
        compare_op(compare_op);
        back_stencil_state(back_stencil_state);
        front_stencil_state(front_stencil_state);
        compare_mask(compare_mask);
        write_mask(write_mask);
        enable_depth_test(enable_depth_test);
        enable_depth_write(enable_depth_write);
        enable_stencil_test(enable_stencil_test);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUDepthStencilState set(SDL_GPUDepthStencilState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUDepthStencilState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUDepthStencilState malloc() {
        return new SDL_GPUDepthStencilState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUDepthStencilState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUDepthStencilState calloc() {
        return new SDL_GPUDepthStencilState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUDepthStencilState} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUDepthStencilState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUDepthStencilState(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUDepthStencilState} instance for the specified memory address. */
    public static SDL_GPUDepthStencilState create(long address) {
        return new SDL_GPUDepthStencilState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUDepthStencilState createSafe(long address) {
        return address == NULL ? null : new SDL_GPUDepthStencilState(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUDepthStencilState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUDepthStencilState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUDepthStencilState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUDepthStencilState malloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUDepthStencilState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUDepthStencilState calloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #compare_op}. */
    public static int ncompare_op(long struct) { return memGetInt(struct + SDL_GPUDepthStencilState.COMPARE_OP); }
    /** Unsafe version of {@link #back_stencil_state}. */
    public static SDL_GPUStencilOpState nback_stencil_state(long struct) { return SDL_GPUStencilOpState.create(struct + SDL_GPUDepthStencilState.BACK_STENCIL_STATE); }
    /** Unsafe version of {@link #front_stencil_state}. */
    public static SDL_GPUStencilOpState nfront_stencil_state(long struct) { return SDL_GPUStencilOpState.create(struct + SDL_GPUDepthStencilState.FRONT_STENCIL_STATE); }
    /** Unsafe version of {@link #compare_mask}. */
    public static byte ncompare_mask(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.COMPARE_MASK); }
    /** Unsafe version of {@link #write_mask}. */
    public static byte nwrite_mask(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.WRITE_MASK); }
    /** Unsafe version of {@link #enable_depth_test}. */
    public static boolean nenable_depth_test(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.ENABLE_DEPTH_TEST) != 0; }
    /** Unsafe version of {@link #enable_depth_write}. */
    public static boolean nenable_depth_write(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.ENABLE_DEPTH_WRITE) != 0; }
    /** Unsafe version of {@link #enable_stencil_test}. */
    public static boolean nenable_stencil_test(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.ENABLE_STENCIL_TEST) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GPUDepthStencilState.PADDING3); }

    /** Unsafe version of {@link #compare_op(int) compare_op}. */
    public static void ncompare_op(long struct, int value) { memPutInt(struct + SDL_GPUDepthStencilState.COMPARE_OP, value); }
    /** Unsafe version of {@link #back_stencil_state(SDL_GPUStencilOpState) back_stencil_state}. */
    public static void nback_stencil_state(long struct, SDL_GPUStencilOpState value) { memCopy(value.address(), struct + SDL_GPUDepthStencilState.BACK_STENCIL_STATE, SDL_GPUStencilOpState.SIZEOF); }
    /** Unsafe version of {@link #front_stencil_state(SDL_GPUStencilOpState) front_stencil_state}. */
    public static void nfront_stencil_state(long struct, SDL_GPUStencilOpState value) { memCopy(value.address(), struct + SDL_GPUDepthStencilState.FRONT_STENCIL_STATE, SDL_GPUStencilOpState.SIZEOF); }
    /** Unsafe version of {@link #compare_mask(byte) compare_mask}. */
    public static void ncompare_mask(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilState.COMPARE_MASK, value); }
    /** Unsafe version of {@link #write_mask(byte) write_mask}. */
    public static void nwrite_mask(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilState.WRITE_MASK, value); }
    /** Unsafe version of {@link #enable_depth_test(boolean) enable_depth_test}. */
    public static void nenable_depth_test(long struct, boolean value) { memPutByte(struct + SDL_GPUDepthStencilState.ENABLE_DEPTH_TEST, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #enable_depth_write(boolean) enable_depth_write}. */
    public static void nenable_depth_write(long struct, boolean value) { memPutByte(struct + SDL_GPUDepthStencilState.ENABLE_DEPTH_WRITE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #enable_stencil_test(boolean) enable_stencil_test}. */
    public static void nenable_stencil_test(long struct, boolean value) { memPutByte(struct + SDL_GPUDepthStencilState.ENABLE_STENCIL_TEST, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilState.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilState.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilState.PADDING3, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUDepthStencilState} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUDepthStencilState, Buffer> implements NativeResource {

        private static final SDL_GPUDepthStencilState ELEMENT_FACTORY = SDL_GPUDepthStencilState.create(-1L);

        /**
         * Creates a new {@code SDL_GPUDepthStencilState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUDepthStencilState#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUDepthStencilState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code compare_op} field. */
        @NativeType("SDL_GPUCompareOp")
        public int compare_op() { return SDL_GPUDepthStencilState.ncompare_op(address()); }
        /** @return a {@link SDL_GPUStencilOpState} view of the {@code back_stencil_state} field. */
        public SDL_GPUStencilOpState back_stencil_state() { return SDL_GPUDepthStencilState.nback_stencil_state(address()); }
        /** @return a {@link SDL_GPUStencilOpState} view of the {@code front_stencil_state} field. */
        public SDL_GPUStencilOpState front_stencil_state() { return SDL_GPUDepthStencilState.nfront_stencil_state(address()); }
        /** @return the value of the {@code compare_mask} field. */
        @NativeType("Uint8")
        public byte compare_mask() { return SDL_GPUDepthStencilState.ncompare_mask(address()); }
        /** @return the value of the {@code write_mask} field. */
        @NativeType("Uint8")
        public byte write_mask() { return SDL_GPUDepthStencilState.nwrite_mask(address()); }
        /** @return the value of the {@code enable_depth_test} field. */
        @NativeType("bool")
        public boolean enable_depth_test() { return SDL_GPUDepthStencilState.nenable_depth_test(address()); }
        /** @return the value of the {@code enable_depth_write} field. */
        @NativeType("bool")
        public boolean enable_depth_write() { return SDL_GPUDepthStencilState.nenable_depth_write(address()); }
        /** @return the value of the {@code enable_stencil_test} field. */
        @NativeType("bool")
        public boolean enable_stencil_test() { return SDL_GPUDepthStencilState.nenable_stencil_test(address()); }

        /** Sets the specified value to the {@code compare_op} field. */
        public SDL_GPUDepthStencilState.Buffer compare_op(@NativeType("SDL_GPUCompareOp") int value) { SDL_GPUDepthStencilState.ncompare_op(address(), value); return this; }
        /** Copies the specified {@link SDL_GPUStencilOpState} to the {@code back_stencil_state} field. */
        public SDL_GPUDepthStencilState.Buffer back_stencil_state(SDL_GPUStencilOpState value) { SDL_GPUDepthStencilState.nback_stencil_state(address(), value); return this; }
        /** Passes the {@code back_stencil_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUDepthStencilState.Buffer back_stencil_state(java.util.function.Consumer<SDL_GPUStencilOpState> consumer) { consumer.accept(back_stencil_state()); return this; }
        /** Copies the specified {@link SDL_GPUStencilOpState} to the {@code front_stencil_state} field. */
        public SDL_GPUDepthStencilState.Buffer front_stencil_state(SDL_GPUStencilOpState value) { SDL_GPUDepthStencilState.nfront_stencil_state(address(), value); return this; }
        /** Passes the {@code front_stencil_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUDepthStencilState.Buffer front_stencil_state(java.util.function.Consumer<SDL_GPUStencilOpState> consumer) { consumer.accept(front_stencil_state()); return this; }
        /** Sets the specified value to the {@code compare_mask} field. */
        public SDL_GPUDepthStencilState.Buffer compare_mask(@NativeType("Uint8") byte value) { SDL_GPUDepthStencilState.ncompare_mask(address(), value); return this; }
        /** Sets the specified value to the {@code write_mask} field. */
        public SDL_GPUDepthStencilState.Buffer write_mask(@NativeType("Uint8") byte value) { SDL_GPUDepthStencilState.nwrite_mask(address(), value); return this; }
        /** Sets the specified value to the {@code enable_depth_test} field. */
        public SDL_GPUDepthStencilState.Buffer enable_depth_test(@NativeType("bool") boolean value) { SDL_GPUDepthStencilState.nenable_depth_test(address(), value); return this; }
        /** Sets the specified value to the {@code enable_depth_write} field. */
        public SDL_GPUDepthStencilState.Buffer enable_depth_write(@NativeType("bool") boolean value) { SDL_GPUDepthStencilState.nenable_depth_write(address(), value); return this; }
        /** Sets the specified value to the {@code enable_stencil_test} field. */
        public SDL_GPUDepthStencilState.Buffer enable_stencil_test(@NativeType("bool") boolean value) { SDL_GPUDepthStencilState.nenable_stencil_test(address(), value); return this; }

    }

}