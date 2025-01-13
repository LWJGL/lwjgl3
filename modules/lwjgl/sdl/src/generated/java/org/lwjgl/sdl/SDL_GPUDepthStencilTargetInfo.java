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
 * struct SDL_GPUDepthStencilTargetInfo {
 *     SDL_GPUTexture * texture;
 *     float clear_depth;
 *     SDL_GPULoadOp load_op;
 *     SDL_GPUStoreOp store_op;
 *     SDL_GPULoadOp stencil_load_op;
 *     SDL_GPUStoreOp stencil_store_op;
 *     bool cycle;
 *     Uint8 clear_stencil;
 *     Uint8 padding1;
 *     Uint8 padding2;
 * }}</pre>
 */
public class SDL_GPUDepthStencilTargetInfo extends Struct<SDL_GPUDepthStencilTargetInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        CLEAR_DEPTH,
        LOAD_OP,
        STORE_OP,
        STENCIL_LOAD_OP,
        STENCIL_STORE_OP,
        CYCLE,
        CLEAR_STENCIL,
        PADDING1,
        PADDING2;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
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

        TEXTURE = layout.offsetof(0);
        CLEAR_DEPTH = layout.offsetof(1);
        LOAD_OP = layout.offsetof(2);
        STORE_OP = layout.offsetof(3);
        STENCIL_LOAD_OP = layout.offsetof(4);
        STENCIL_STORE_OP = layout.offsetof(5);
        CYCLE = layout.offsetof(6);
        CLEAR_STENCIL = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
    }

    protected SDL_GPUDepthStencilTargetInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUDepthStencilTargetInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUDepthStencilTargetInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUDepthStencilTargetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUDepthStencilTargetInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code texture} field. */
    @NativeType("SDL_GPUTexture *")
    public long texture() { return ntexture(address()); }
    /** @return the value of the {@code clear_depth} field. */
    public float clear_depth() { return nclear_depth(address()); }
    /** @return the value of the {@code load_op} field. */
    @NativeType("SDL_GPULoadOp")
    public int load_op() { return nload_op(address()); }
    /** @return the value of the {@code store_op} field. */
    @NativeType("SDL_GPUStoreOp")
    public int store_op() { return nstore_op(address()); }
    /** @return the value of the {@code stencil_load_op} field. */
    @NativeType("SDL_GPULoadOp")
    public int stencil_load_op() { return nstencil_load_op(address()); }
    /** @return the value of the {@code stencil_store_op} field. */
    @NativeType("SDL_GPUStoreOp")
    public int stencil_store_op() { return nstencil_store_op(address()); }
    /** @return the value of the {@code cycle} field. */
    @NativeType("bool")
    public boolean cycle() { return ncycle(address()); }
    /** @return the value of the {@code clear_stencil} field. */
    @NativeType("Uint8")
    public byte clear_stencil() { return nclear_stencil(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUDepthStencilTargetInfo texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code clear_depth} field. */
    public SDL_GPUDepthStencilTargetInfo clear_depth(float value) { nclear_depth(address(), value); return this; }
    /** Sets the specified value to the {@code load_op} field. */
    public SDL_GPUDepthStencilTargetInfo load_op(@NativeType("SDL_GPULoadOp") int value) { nload_op(address(), value); return this; }
    /** Sets the specified value to the {@code store_op} field. */
    public SDL_GPUDepthStencilTargetInfo store_op(@NativeType("SDL_GPUStoreOp") int value) { nstore_op(address(), value); return this; }
    /** Sets the specified value to the {@code stencil_load_op} field. */
    public SDL_GPUDepthStencilTargetInfo stencil_load_op(@NativeType("SDL_GPULoadOp") int value) { nstencil_load_op(address(), value); return this; }
    /** Sets the specified value to the {@code stencil_store_op} field. */
    public SDL_GPUDepthStencilTargetInfo stencil_store_op(@NativeType("SDL_GPUStoreOp") int value) { nstencil_store_op(address(), value); return this; }
    /** Sets the specified value to the {@code cycle} field. */
    public SDL_GPUDepthStencilTargetInfo cycle(@NativeType("bool") boolean value) { ncycle(address(), value); return this; }
    /** Sets the specified value to the {@code clear_stencil} field. */
    public SDL_GPUDepthStencilTargetInfo clear_stencil(@NativeType("Uint8") byte value) { nclear_stencil(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUDepthStencilTargetInfo set(
        long texture,
        float clear_depth,
        int load_op,
        int store_op,
        int stencil_load_op,
        int stencil_store_op,
        boolean cycle,
        byte clear_stencil
    ) {
        texture(texture);
        clear_depth(clear_depth);
        load_op(load_op);
        store_op(store_op);
        stencil_load_op(stencil_load_op);
        stencil_store_op(stencil_store_op);
        cycle(cycle);
        clear_stencil(clear_stencil);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUDepthStencilTargetInfo set(SDL_GPUDepthStencilTargetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUDepthStencilTargetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUDepthStencilTargetInfo malloc() {
        return new SDL_GPUDepthStencilTargetInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUDepthStencilTargetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUDepthStencilTargetInfo calloc() {
        return new SDL_GPUDepthStencilTargetInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUDepthStencilTargetInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUDepthStencilTargetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUDepthStencilTargetInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUDepthStencilTargetInfo} instance for the specified memory address. */
    public static SDL_GPUDepthStencilTargetInfo create(long address) {
        return new SDL_GPUDepthStencilTargetInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUDepthStencilTargetInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUDepthStencilTargetInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilTargetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilTargetInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilTargetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilTargetInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilTargetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilTargetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUDepthStencilTargetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilTargetInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUDepthStencilTargetInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUDepthStencilTargetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUDepthStencilTargetInfo malloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilTargetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUDepthStencilTargetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUDepthStencilTargetInfo calloc(MemoryStack stack) {
        return new SDL_GPUDepthStencilTargetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilTargetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilTargetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUDepthStencilTargetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUDepthStencilTargetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUDepthStencilTargetInfo.TEXTURE); }
    /** Unsafe version of {@link #clear_depth}. */
    public static float nclear_depth(long struct) { return memGetFloat(struct + SDL_GPUDepthStencilTargetInfo.CLEAR_DEPTH); }
    /** Unsafe version of {@link #load_op}. */
    public static int nload_op(long struct) { return memGetInt(struct + SDL_GPUDepthStencilTargetInfo.LOAD_OP); }
    /** Unsafe version of {@link #store_op}. */
    public static int nstore_op(long struct) { return memGetInt(struct + SDL_GPUDepthStencilTargetInfo.STORE_OP); }
    /** Unsafe version of {@link #stencil_load_op}. */
    public static int nstencil_load_op(long struct) { return memGetInt(struct + SDL_GPUDepthStencilTargetInfo.STENCIL_LOAD_OP); }
    /** Unsafe version of {@link #stencil_store_op}. */
    public static int nstencil_store_op(long struct) { return memGetInt(struct + SDL_GPUDepthStencilTargetInfo.STENCIL_STORE_OP); }
    /** Unsafe version of {@link #cycle}. */
    public static boolean ncycle(long struct) { return memGetByte(struct + SDL_GPUDepthStencilTargetInfo.CYCLE) != 0; }
    /** Unsafe version of {@link #clear_stencil}. */
    public static byte nclear_stencil(long struct) { return memGetByte(struct + SDL_GPUDepthStencilTargetInfo.CLEAR_STENCIL); }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUDepthStencilTargetInfo.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUDepthStencilTargetInfo.PADDING2); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUDepthStencilTargetInfo.TEXTURE, check(value)); }
    /** Unsafe version of {@link #clear_depth(float) clear_depth}. */
    public static void nclear_depth(long struct, float value) { memPutFloat(struct + SDL_GPUDepthStencilTargetInfo.CLEAR_DEPTH, value); }
    /** Unsafe version of {@link #load_op(int) load_op}. */
    public static void nload_op(long struct, int value) { memPutInt(struct + SDL_GPUDepthStencilTargetInfo.LOAD_OP, value); }
    /** Unsafe version of {@link #store_op(int) store_op}. */
    public static void nstore_op(long struct, int value) { memPutInt(struct + SDL_GPUDepthStencilTargetInfo.STORE_OP, value); }
    /** Unsafe version of {@link #stencil_load_op(int) stencil_load_op}. */
    public static void nstencil_load_op(long struct, int value) { memPutInt(struct + SDL_GPUDepthStencilTargetInfo.STENCIL_LOAD_OP, value); }
    /** Unsafe version of {@link #stencil_store_op(int) stencil_store_op}. */
    public static void nstencil_store_op(long struct, int value) { memPutInt(struct + SDL_GPUDepthStencilTargetInfo.STENCIL_STORE_OP, value); }
    /** Unsafe version of {@link #cycle(boolean) cycle}. */
    public static void ncycle(long struct, boolean value) { memPutByte(struct + SDL_GPUDepthStencilTargetInfo.CYCLE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #clear_stencil(byte) clear_stencil}. */
    public static void nclear_stencil(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilTargetInfo.CLEAR_STENCIL, value); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilTargetInfo.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUDepthStencilTargetInfo.PADDING2, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUDepthStencilTargetInfo.TEXTURE));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUDepthStencilTargetInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUDepthStencilTargetInfo, Buffer> implements NativeResource {

        private static final SDL_GPUDepthStencilTargetInfo ELEMENT_FACTORY = SDL_GPUDepthStencilTargetInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUDepthStencilTargetInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUDepthStencilTargetInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUDepthStencilTargetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUDepthStencilTargetInfo.ntexture(address()); }
        /** @return the value of the {@code clear_depth} field. */
        public float clear_depth() { return SDL_GPUDepthStencilTargetInfo.nclear_depth(address()); }
        /** @return the value of the {@code load_op} field. */
        @NativeType("SDL_GPULoadOp")
        public int load_op() { return SDL_GPUDepthStencilTargetInfo.nload_op(address()); }
        /** @return the value of the {@code store_op} field. */
        @NativeType("SDL_GPUStoreOp")
        public int store_op() { return SDL_GPUDepthStencilTargetInfo.nstore_op(address()); }
        /** @return the value of the {@code stencil_load_op} field. */
        @NativeType("SDL_GPULoadOp")
        public int stencil_load_op() { return SDL_GPUDepthStencilTargetInfo.nstencil_load_op(address()); }
        /** @return the value of the {@code stencil_store_op} field. */
        @NativeType("SDL_GPUStoreOp")
        public int stencil_store_op() { return SDL_GPUDepthStencilTargetInfo.nstencil_store_op(address()); }
        /** @return the value of the {@code cycle} field. */
        @NativeType("bool")
        public boolean cycle() { return SDL_GPUDepthStencilTargetInfo.ncycle(address()); }
        /** @return the value of the {@code clear_stencil} field. */
        @NativeType("Uint8")
        public byte clear_stencil() { return SDL_GPUDepthStencilTargetInfo.nclear_stencil(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUDepthStencilTargetInfo.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code clear_depth} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer clear_depth(float value) { SDL_GPUDepthStencilTargetInfo.nclear_depth(address(), value); return this; }
        /** Sets the specified value to the {@code load_op} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer load_op(@NativeType("SDL_GPULoadOp") int value) { SDL_GPUDepthStencilTargetInfo.nload_op(address(), value); return this; }
        /** Sets the specified value to the {@code store_op} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer store_op(@NativeType("SDL_GPUStoreOp") int value) { SDL_GPUDepthStencilTargetInfo.nstore_op(address(), value); return this; }
        /** Sets the specified value to the {@code stencil_load_op} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer stencil_load_op(@NativeType("SDL_GPULoadOp") int value) { SDL_GPUDepthStencilTargetInfo.nstencil_load_op(address(), value); return this; }
        /** Sets the specified value to the {@code stencil_store_op} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer stencil_store_op(@NativeType("SDL_GPUStoreOp") int value) { SDL_GPUDepthStencilTargetInfo.nstencil_store_op(address(), value); return this; }
        /** Sets the specified value to the {@code cycle} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer cycle(@NativeType("bool") boolean value) { SDL_GPUDepthStencilTargetInfo.ncycle(address(), value); return this; }
        /** Sets the specified value to the {@code clear_stencil} field. */
        public SDL_GPUDepthStencilTargetInfo.Buffer clear_stencil(@NativeType("Uint8") byte value) { SDL_GPUDepthStencilTargetInfo.nclear_stencil(address(), value); return this; }

    }

}