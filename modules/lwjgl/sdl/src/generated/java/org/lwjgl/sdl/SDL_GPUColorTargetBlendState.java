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
 * struct SDL_GPUColorTargetBlendState {
 *     SDL_GPUBlendFactor src_color_blendfactor;
 *     SDL_GPUBlendFactor dst_color_blendfactor;
 *     SDL_GPUBlendOp color_blend_op;
 *     SDL_GPUBlendFactor src_alpha_blendfactor;
 *     SDL_GPUBlendFactor dst_alpha_blendfactor;
 *     SDL_GPUBlendOp alpha_blend_op;
 *     SDL_GPUColorComponentFlags color_write_mask;
 *     bool enable_blend;
 *     bool enable_color_write_mask;
 *     Uint8 padding1;
 *     Uint8 padding2;
 * }}</pre>
 */
public class SDL_GPUColorTargetBlendState extends Struct<SDL_GPUColorTargetBlendState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRC_COLOR_BLENDFACTOR,
        DST_COLOR_BLENDFACTOR,
        COLOR_BLEND_OP,
        SRC_ALPHA_BLENDFACTOR,
        DST_ALPHA_BLENDFACTOR,
        ALPHA_BLEND_OP,
        COLOR_WRITE_MASK,
        ENABLE_BLEND,
        ENABLE_COLOR_WRITE_MASK,
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
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRC_COLOR_BLENDFACTOR = layout.offsetof(0);
        DST_COLOR_BLENDFACTOR = layout.offsetof(1);
        COLOR_BLEND_OP = layout.offsetof(2);
        SRC_ALPHA_BLENDFACTOR = layout.offsetof(3);
        DST_ALPHA_BLENDFACTOR = layout.offsetof(4);
        ALPHA_BLEND_OP = layout.offsetof(5);
        COLOR_WRITE_MASK = layout.offsetof(6);
        ENABLE_BLEND = layout.offsetof(7);
        ENABLE_COLOR_WRITE_MASK = layout.offsetof(8);
        PADDING1 = layout.offsetof(9);
        PADDING2 = layout.offsetof(10);
    }

    protected SDL_GPUColorTargetBlendState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUColorTargetBlendState create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUColorTargetBlendState(address, container);
    }

    /**
     * Creates a {@code SDL_GPUColorTargetBlendState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUColorTargetBlendState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code src_color_blendfactor} field. */
    @NativeType("SDL_GPUBlendFactor")
    public int src_color_blendfactor() { return nsrc_color_blendfactor(address()); }
    /** @return the value of the {@code dst_color_blendfactor} field. */
    @NativeType("SDL_GPUBlendFactor")
    public int dst_color_blendfactor() { return ndst_color_blendfactor(address()); }
    /** @return the value of the {@code color_blend_op} field. */
    @NativeType("SDL_GPUBlendOp")
    public int color_blend_op() { return ncolor_blend_op(address()); }
    /** @return the value of the {@code src_alpha_blendfactor} field. */
    @NativeType("SDL_GPUBlendFactor")
    public int src_alpha_blendfactor() { return nsrc_alpha_blendfactor(address()); }
    /** @return the value of the {@code dst_alpha_blendfactor} field. */
    @NativeType("SDL_GPUBlendFactor")
    public int dst_alpha_blendfactor() { return ndst_alpha_blendfactor(address()); }
    /** @return the value of the {@code alpha_blend_op} field. */
    @NativeType("SDL_GPUBlendOp")
    public int alpha_blend_op() { return nalpha_blend_op(address()); }
    /** @return the value of the {@code color_write_mask} field. */
    @NativeType("SDL_GPUColorComponentFlags")
    public byte color_write_mask() { return ncolor_write_mask(address()); }
    /** @return the value of the {@code enable_blend} field. */
    @NativeType("bool")
    public boolean enable_blend() { return nenable_blend(address()); }
    /** @return the value of the {@code enable_color_write_mask} field. */
    @NativeType("bool")
    public boolean enable_color_write_mask() { return nenable_color_write_mask(address()); }

    /** Sets the specified value to the {@code src_color_blendfactor} field. */
    public SDL_GPUColorTargetBlendState src_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { nsrc_color_blendfactor(address(), value); return this; }
    /** Sets the specified value to the {@code dst_color_blendfactor} field. */
    public SDL_GPUColorTargetBlendState dst_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { ndst_color_blendfactor(address(), value); return this; }
    /** Sets the specified value to the {@code color_blend_op} field. */
    public SDL_GPUColorTargetBlendState color_blend_op(@NativeType("SDL_GPUBlendOp") int value) { ncolor_blend_op(address(), value); return this; }
    /** Sets the specified value to the {@code src_alpha_blendfactor} field. */
    public SDL_GPUColorTargetBlendState src_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { nsrc_alpha_blendfactor(address(), value); return this; }
    /** Sets the specified value to the {@code dst_alpha_blendfactor} field. */
    public SDL_GPUColorTargetBlendState dst_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { ndst_alpha_blendfactor(address(), value); return this; }
    /** Sets the specified value to the {@code alpha_blend_op} field. */
    public SDL_GPUColorTargetBlendState alpha_blend_op(@NativeType("SDL_GPUBlendOp") int value) { nalpha_blend_op(address(), value); return this; }
    /** Sets the specified value to the {@code color_write_mask} field. */
    public SDL_GPUColorTargetBlendState color_write_mask(@NativeType("SDL_GPUColorComponentFlags") byte value) { ncolor_write_mask(address(), value); return this; }
    /** Sets the specified value to the {@code enable_blend} field. */
    public SDL_GPUColorTargetBlendState enable_blend(@NativeType("bool") boolean value) { nenable_blend(address(), value); return this; }
    /** Sets the specified value to the {@code enable_color_write_mask} field. */
    public SDL_GPUColorTargetBlendState enable_color_write_mask(@NativeType("bool") boolean value) { nenable_color_write_mask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUColorTargetBlendState set(
        int src_color_blendfactor,
        int dst_color_blendfactor,
        int color_blend_op,
        int src_alpha_blendfactor,
        int dst_alpha_blendfactor,
        int alpha_blend_op,
        byte color_write_mask,
        boolean enable_blend,
        boolean enable_color_write_mask
    ) {
        src_color_blendfactor(src_color_blendfactor);
        dst_color_blendfactor(dst_color_blendfactor);
        color_blend_op(color_blend_op);
        src_alpha_blendfactor(src_alpha_blendfactor);
        dst_alpha_blendfactor(dst_alpha_blendfactor);
        alpha_blend_op(alpha_blend_op);
        color_write_mask(color_write_mask);
        enable_blend(enable_blend);
        enable_color_write_mask(enable_color_write_mask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUColorTargetBlendState set(SDL_GPUColorTargetBlendState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUColorTargetBlendState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUColorTargetBlendState malloc() {
        return new SDL_GPUColorTargetBlendState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUColorTargetBlendState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUColorTargetBlendState calloc() {
        return new SDL_GPUColorTargetBlendState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUColorTargetBlendState} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUColorTargetBlendState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUColorTargetBlendState(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUColorTargetBlendState} instance for the specified memory address. */
    public static SDL_GPUColorTargetBlendState create(long address) {
        return new SDL_GPUColorTargetBlendState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUColorTargetBlendState createSafe(long address) {
        return address == NULL ? null : new SDL_GPUColorTargetBlendState(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetBlendState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetBlendState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetBlendState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetBlendState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetBlendState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetBlendState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUColorTargetBlendState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetBlendState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUColorTargetBlendState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUColorTargetBlendState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUColorTargetBlendState malloc(MemoryStack stack) {
        return new SDL_GPUColorTargetBlendState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUColorTargetBlendState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUColorTargetBlendState calloc(MemoryStack stack) {
        return new SDL_GPUColorTargetBlendState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetBlendState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetBlendState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetBlendState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetBlendState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #src_color_blendfactor}. */
    public static int nsrc_color_blendfactor(long struct) { return memGetInt(struct + SDL_GPUColorTargetBlendState.SRC_COLOR_BLENDFACTOR); }
    /** Unsafe version of {@link #dst_color_blendfactor}. */
    public static int ndst_color_blendfactor(long struct) { return memGetInt(struct + SDL_GPUColorTargetBlendState.DST_COLOR_BLENDFACTOR); }
    /** Unsafe version of {@link #color_blend_op}. */
    public static int ncolor_blend_op(long struct) { return memGetInt(struct + SDL_GPUColorTargetBlendState.COLOR_BLEND_OP); }
    /** Unsafe version of {@link #src_alpha_blendfactor}. */
    public static int nsrc_alpha_blendfactor(long struct) { return memGetInt(struct + SDL_GPUColorTargetBlendState.SRC_ALPHA_BLENDFACTOR); }
    /** Unsafe version of {@link #dst_alpha_blendfactor}. */
    public static int ndst_alpha_blendfactor(long struct) { return memGetInt(struct + SDL_GPUColorTargetBlendState.DST_ALPHA_BLENDFACTOR); }
    /** Unsafe version of {@link #alpha_blend_op}. */
    public static int nalpha_blend_op(long struct) { return memGetInt(struct + SDL_GPUColorTargetBlendState.ALPHA_BLEND_OP); }
    /** Unsafe version of {@link #color_write_mask}. */
    public static byte ncolor_write_mask(long struct) { return memGetByte(struct + SDL_GPUColorTargetBlendState.COLOR_WRITE_MASK); }
    /** Unsafe version of {@link #enable_blend}. */
    public static boolean nenable_blend(long struct) { return memGetByte(struct + SDL_GPUColorTargetBlendState.ENABLE_BLEND) != 0; }
    /** Unsafe version of {@link #enable_color_write_mask}. */
    public static boolean nenable_color_write_mask(long struct) { return memGetByte(struct + SDL_GPUColorTargetBlendState.ENABLE_COLOR_WRITE_MASK) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUColorTargetBlendState.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUColorTargetBlendState.PADDING2); }

    /** Unsafe version of {@link #src_color_blendfactor(int) src_color_blendfactor}. */
    public static void nsrc_color_blendfactor(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetBlendState.SRC_COLOR_BLENDFACTOR, value); }
    /** Unsafe version of {@link #dst_color_blendfactor(int) dst_color_blendfactor}. */
    public static void ndst_color_blendfactor(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetBlendState.DST_COLOR_BLENDFACTOR, value); }
    /** Unsafe version of {@link #color_blend_op(int) color_blend_op}. */
    public static void ncolor_blend_op(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetBlendState.COLOR_BLEND_OP, value); }
    /** Unsafe version of {@link #src_alpha_blendfactor(int) src_alpha_blendfactor}. */
    public static void nsrc_alpha_blendfactor(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetBlendState.SRC_ALPHA_BLENDFACTOR, value); }
    /** Unsafe version of {@link #dst_alpha_blendfactor(int) dst_alpha_blendfactor}. */
    public static void ndst_alpha_blendfactor(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetBlendState.DST_ALPHA_BLENDFACTOR, value); }
    /** Unsafe version of {@link #alpha_blend_op(int) alpha_blend_op}. */
    public static void nalpha_blend_op(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetBlendState.ALPHA_BLEND_OP, value); }
    /** Unsafe version of {@link #color_write_mask(byte) color_write_mask}. */
    public static void ncolor_write_mask(long struct, byte value) { memPutByte(struct + SDL_GPUColorTargetBlendState.COLOR_WRITE_MASK, value); }
    /** Unsafe version of {@link #enable_blend(boolean) enable_blend}. */
    public static void nenable_blend(long struct, boolean value) { memPutByte(struct + SDL_GPUColorTargetBlendState.ENABLE_BLEND, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #enable_color_write_mask(boolean) enable_color_write_mask}. */
    public static void nenable_color_write_mask(long struct, boolean value) { memPutByte(struct + SDL_GPUColorTargetBlendState.ENABLE_COLOR_WRITE_MASK, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUColorTargetBlendState.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUColorTargetBlendState.PADDING2, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUColorTargetBlendState} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUColorTargetBlendState, Buffer> implements NativeResource {

        private static final SDL_GPUColorTargetBlendState ELEMENT_FACTORY = SDL_GPUColorTargetBlendState.create(-1L);

        /**
         * Creates a new {@code SDL_GPUColorTargetBlendState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUColorTargetBlendState#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUColorTargetBlendState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code src_color_blendfactor} field. */
        @NativeType("SDL_GPUBlendFactor")
        public int src_color_blendfactor() { return SDL_GPUColorTargetBlendState.nsrc_color_blendfactor(address()); }
        /** @return the value of the {@code dst_color_blendfactor} field. */
        @NativeType("SDL_GPUBlendFactor")
        public int dst_color_blendfactor() { return SDL_GPUColorTargetBlendState.ndst_color_blendfactor(address()); }
        /** @return the value of the {@code color_blend_op} field. */
        @NativeType("SDL_GPUBlendOp")
        public int color_blend_op() { return SDL_GPUColorTargetBlendState.ncolor_blend_op(address()); }
        /** @return the value of the {@code src_alpha_blendfactor} field. */
        @NativeType("SDL_GPUBlendFactor")
        public int src_alpha_blendfactor() { return SDL_GPUColorTargetBlendState.nsrc_alpha_blendfactor(address()); }
        /** @return the value of the {@code dst_alpha_blendfactor} field. */
        @NativeType("SDL_GPUBlendFactor")
        public int dst_alpha_blendfactor() { return SDL_GPUColorTargetBlendState.ndst_alpha_blendfactor(address()); }
        /** @return the value of the {@code alpha_blend_op} field. */
        @NativeType("SDL_GPUBlendOp")
        public int alpha_blend_op() { return SDL_GPUColorTargetBlendState.nalpha_blend_op(address()); }
        /** @return the value of the {@code color_write_mask} field. */
        @NativeType("SDL_GPUColorComponentFlags")
        public byte color_write_mask() { return SDL_GPUColorTargetBlendState.ncolor_write_mask(address()); }
        /** @return the value of the {@code enable_blend} field. */
        @NativeType("bool")
        public boolean enable_blend() { return SDL_GPUColorTargetBlendState.nenable_blend(address()); }
        /** @return the value of the {@code enable_color_write_mask} field. */
        @NativeType("bool")
        public boolean enable_color_write_mask() { return SDL_GPUColorTargetBlendState.nenable_color_write_mask(address()); }

        /** Sets the specified value to the {@code src_color_blendfactor} field. */
        public SDL_GPUColorTargetBlendState.Buffer src_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { SDL_GPUColorTargetBlendState.nsrc_color_blendfactor(address(), value); return this; }
        /** Sets the specified value to the {@code dst_color_blendfactor} field. */
        public SDL_GPUColorTargetBlendState.Buffer dst_color_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { SDL_GPUColorTargetBlendState.ndst_color_blendfactor(address(), value); return this; }
        /** Sets the specified value to the {@code color_blend_op} field. */
        public SDL_GPUColorTargetBlendState.Buffer color_blend_op(@NativeType("SDL_GPUBlendOp") int value) { SDL_GPUColorTargetBlendState.ncolor_blend_op(address(), value); return this; }
        /** Sets the specified value to the {@code src_alpha_blendfactor} field. */
        public SDL_GPUColorTargetBlendState.Buffer src_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { SDL_GPUColorTargetBlendState.nsrc_alpha_blendfactor(address(), value); return this; }
        /** Sets the specified value to the {@code dst_alpha_blendfactor} field. */
        public SDL_GPUColorTargetBlendState.Buffer dst_alpha_blendfactor(@NativeType("SDL_GPUBlendFactor") int value) { SDL_GPUColorTargetBlendState.ndst_alpha_blendfactor(address(), value); return this; }
        /** Sets the specified value to the {@code alpha_blend_op} field. */
        public SDL_GPUColorTargetBlendState.Buffer alpha_blend_op(@NativeType("SDL_GPUBlendOp") int value) { SDL_GPUColorTargetBlendState.nalpha_blend_op(address(), value); return this; }
        /** Sets the specified value to the {@code color_write_mask} field. */
        public SDL_GPUColorTargetBlendState.Buffer color_write_mask(@NativeType("SDL_GPUColorComponentFlags") byte value) { SDL_GPUColorTargetBlendState.ncolor_write_mask(address(), value); return this; }
        /** Sets the specified value to the {@code enable_blend} field. */
        public SDL_GPUColorTargetBlendState.Buffer enable_blend(@NativeType("bool") boolean value) { SDL_GPUColorTargetBlendState.nenable_blend(address(), value); return this; }
        /** Sets the specified value to the {@code enable_color_write_mask} field. */
        public SDL_GPUColorTargetBlendState.Buffer enable_color_write_mask(@NativeType("bool") boolean value) { SDL_GPUColorTargetBlendState.nenable_color_write_mask(address(), value); return this; }

    }

}