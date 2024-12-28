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
 * struct SDL_GPUColorTargetInfo {
 *     SDL_GPUTexture * texture;
 *     Uint32 mip_level;
 *     Uint32 layer_or_depth_plane;
 *     {@link SDL_FColor SDL_FColor} clear_color;
 *     SDL_GPULoadOp load_op;
 *     SDL_GPUStoreOp store_op;
 *     SDL_GPUTexture * resolve_texture;
 *     Uint32 resolve_mip_level;
 *     Uint32 resolve_layer;
 *     bool cycle;
 *     bool cycle_resolve_texture;
 *     Uint8 padding1;
 *     Uint8 padding2;
 * }}</pre>
 */
public class SDL_GPUColorTargetInfo extends Struct<SDL_GPUColorTargetInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        MIP_LEVEL,
        LAYER_OR_DEPTH_PLANE,
        CLEAR_COLOR,
        LOAD_OP,
        STORE_OP,
        RESOLVE_TEXTURE,
        RESOLVE_MIP_LEVEL,
        RESOLVE_LAYER,
        CYCLE,
        CYCLE_RESOLVE_TEXTURE,
        PADDING1,
        PADDING2;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(SDL_FColor.SIZEOF, SDL_FColor.ALIGNOF),
            __member(4),
            __member(4),
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

        TEXTURE = layout.offsetof(0);
        MIP_LEVEL = layout.offsetof(1);
        LAYER_OR_DEPTH_PLANE = layout.offsetof(2);
        CLEAR_COLOR = layout.offsetof(3);
        LOAD_OP = layout.offsetof(4);
        STORE_OP = layout.offsetof(5);
        RESOLVE_TEXTURE = layout.offsetof(6);
        RESOLVE_MIP_LEVEL = layout.offsetof(7);
        RESOLVE_LAYER = layout.offsetof(8);
        CYCLE = layout.offsetof(9);
        CYCLE_RESOLVE_TEXTURE = layout.offsetof(10);
        PADDING1 = layout.offsetof(11);
        PADDING2 = layout.offsetof(12);
    }

    protected SDL_GPUColorTargetInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUColorTargetInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUColorTargetInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUColorTargetInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUColorTargetInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code texture} field. */
    @NativeType("SDL_GPUTexture *")
    public long texture() { return ntexture(address()); }
    /** @return the value of the {@code mip_level} field. */
    @NativeType("Uint32")
    public int mip_level() { return nmip_level(address()); }
    /** @return the value of the {@code layer_or_depth_plane} field. */
    @NativeType("Uint32")
    public int layer_or_depth_plane() { return nlayer_or_depth_plane(address()); }
    /** @return a {@link SDL_FColor} view of the {@code clear_color} field. */
    public SDL_FColor clear_color() { return nclear_color(address()); }
    /** @return the value of the {@code load_op} field. */
    @NativeType("SDL_GPULoadOp")
    public int load_op() { return nload_op(address()); }
    /** @return the value of the {@code store_op} field. */
    @NativeType("SDL_GPUStoreOp")
    public int store_op() { return nstore_op(address()); }
    /** @return the value of the {@code resolve_texture} field. */
    @NativeType("SDL_GPUTexture *")
    public long resolve_texture() { return nresolve_texture(address()); }
    /** @return the value of the {@code resolve_mip_level} field. */
    @NativeType("Uint32")
    public int resolve_mip_level() { return nresolve_mip_level(address()); }
    /** @return the value of the {@code resolve_layer} field. */
    @NativeType("Uint32")
    public int resolve_layer() { return nresolve_layer(address()); }
    /** @return the value of the {@code cycle} field. */
    @NativeType("bool")
    public boolean cycle() { return ncycle(address()); }
    /** @return the value of the {@code cycle_resolve_texture} field. */
    @NativeType("bool")
    public boolean cycle_resolve_texture() { return ncycle_resolve_texture(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUColorTargetInfo texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code mip_level} field. */
    public SDL_GPUColorTargetInfo mip_level(@NativeType("Uint32") int value) { nmip_level(address(), value); return this; }
    /** Sets the specified value to the {@code layer_or_depth_plane} field. */
    public SDL_GPUColorTargetInfo layer_or_depth_plane(@NativeType("Uint32") int value) { nlayer_or_depth_plane(address(), value); return this; }
    /** Copies the specified {@link SDL_FColor} to the {@code clear_color} field. */
    public SDL_GPUColorTargetInfo clear_color(SDL_FColor value) { nclear_color(address(), value); return this; }
    /** Passes the {@code clear_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUColorTargetInfo clear_color(java.util.function.Consumer<SDL_FColor> consumer) { consumer.accept(clear_color()); return this; }
    /** Sets the specified value to the {@code load_op} field. */
    public SDL_GPUColorTargetInfo load_op(@NativeType("SDL_GPULoadOp") int value) { nload_op(address(), value); return this; }
    /** Sets the specified value to the {@code store_op} field. */
    public SDL_GPUColorTargetInfo store_op(@NativeType("SDL_GPUStoreOp") int value) { nstore_op(address(), value); return this; }
    /** Sets the specified value to the {@code resolve_texture} field. */
    public SDL_GPUColorTargetInfo resolve_texture(@NativeType("SDL_GPUTexture *") long value) { nresolve_texture(address(), value); return this; }
    /** Sets the specified value to the {@code resolve_mip_level} field. */
    public SDL_GPUColorTargetInfo resolve_mip_level(@NativeType("Uint32") int value) { nresolve_mip_level(address(), value); return this; }
    /** Sets the specified value to the {@code resolve_layer} field. */
    public SDL_GPUColorTargetInfo resolve_layer(@NativeType("Uint32") int value) { nresolve_layer(address(), value); return this; }
    /** Sets the specified value to the {@code cycle} field. */
    public SDL_GPUColorTargetInfo cycle(@NativeType("bool") boolean value) { ncycle(address(), value); return this; }
    /** Sets the specified value to the {@code cycle_resolve_texture} field. */
    public SDL_GPUColorTargetInfo cycle_resolve_texture(@NativeType("bool") boolean value) { ncycle_resolve_texture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUColorTargetInfo set(
        long texture,
        int mip_level,
        int layer_or_depth_plane,
        SDL_FColor clear_color,
        int load_op,
        int store_op,
        long resolve_texture,
        int resolve_mip_level,
        int resolve_layer,
        boolean cycle,
        boolean cycle_resolve_texture
    ) {
        texture(texture);
        mip_level(mip_level);
        layer_or_depth_plane(layer_or_depth_plane);
        clear_color(clear_color);
        load_op(load_op);
        store_op(store_op);
        resolve_texture(resolve_texture);
        resolve_mip_level(resolve_mip_level);
        resolve_layer(resolve_layer);
        cycle(cycle);
        cycle_resolve_texture(cycle_resolve_texture);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUColorTargetInfo set(SDL_GPUColorTargetInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUColorTargetInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUColorTargetInfo malloc() {
        return new SDL_GPUColorTargetInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUColorTargetInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUColorTargetInfo calloc() {
        return new SDL_GPUColorTargetInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUColorTargetInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUColorTargetInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUColorTargetInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUColorTargetInfo} instance for the specified memory address. */
    public static SDL_GPUColorTargetInfo create(long address) {
        return new SDL_GPUColorTargetInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUColorTargetInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUColorTargetInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUColorTargetInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUColorTargetInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUColorTargetInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUColorTargetInfo malloc(MemoryStack stack) {
        return new SDL_GPUColorTargetInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUColorTargetInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUColorTargetInfo calloc(MemoryStack stack) {
        return new SDL_GPUColorTargetInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUColorTargetInfo.TEXTURE); }
    /** Unsafe version of {@link #mip_level}. */
    public static int nmip_level(long struct) { return memGetInt(struct + SDL_GPUColorTargetInfo.MIP_LEVEL); }
    /** Unsafe version of {@link #layer_or_depth_plane}. */
    public static int nlayer_or_depth_plane(long struct) { return memGetInt(struct + SDL_GPUColorTargetInfo.LAYER_OR_DEPTH_PLANE); }
    /** Unsafe version of {@link #clear_color}. */
    public static SDL_FColor nclear_color(long struct) { return SDL_FColor.create(struct + SDL_GPUColorTargetInfo.CLEAR_COLOR); }
    /** Unsafe version of {@link #load_op}. */
    public static int nload_op(long struct) { return memGetInt(struct + SDL_GPUColorTargetInfo.LOAD_OP); }
    /** Unsafe version of {@link #store_op}. */
    public static int nstore_op(long struct) { return memGetInt(struct + SDL_GPUColorTargetInfo.STORE_OP); }
    /** Unsafe version of {@link #resolve_texture}. */
    public static long nresolve_texture(long struct) { return memGetAddress(struct + SDL_GPUColorTargetInfo.RESOLVE_TEXTURE); }
    /** Unsafe version of {@link #resolve_mip_level}. */
    public static int nresolve_mip_level(long struct) { return memGetInt(struct + SDL_GPUColorTargetInfo.RESOLVE_MIP_LEVEL); }
    /** Unsafe version of {@link #resolve_layer}. */
    public static int nresolve_layer(long struct) { return memGetInt(struct + SDL_GPUColorTargetInfo.RESOLVE_LAYER); }
    /** Unsafe version of {@link #cycle}. */
    public static boolean ncycle(long struct) { return memGetByte(struct + SDL_GPUColorTargetInfo.CYCLE) != 0; }
    /** Unsafe version of {@link #cycle_resolve_texture}. */
    public static boolean ncycle_resolve_texture(long struct) { return memGetByte(struct + SDL_GPUColorTargetInfo.CYCLE_RESOLVE_TEXTURE) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUColorTargetInfo.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUColorTargetInfo.PADDING2); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUColorTargetInfo.TEXTURE, check(value)); }
    /** Unsafe version of {@link #mip_level(int) mip_level}. */
    public static void nmip_level(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetInfo.MIP_LEVEL, value); }
    /** Unsafe version of {@link #layer_or_depth_plane(int) layer_or_depth_plane}. */
    public static void nlayer_or_depth_plane(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetInfo.LAYER_OR_DEPTH_PLANE, value); }
    /** Unsafe version of {@link #clear_color(SDL_FColor) clear_color}. */
    public static void nclear_color(long struct, SDL_FColor value) { memCopy(value.address(), struct + SDL_GPUColorTargetInfo.CLEAR_COLOR, SDL_FColor.SIZEOF); }
    /** Unsafe version of {@link #load_op(int) load_op}. */
    public static void nload_op(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetInfo.LOAD_OP, value); }
    /** Unsafe version of {@link #store_op(int) store_op}. */
    public static void nstore_op(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetInfo.STORE_OP, value); }
    /** Unsafe version of {@link #resolve_texture(long) resolve_texture}. */
    public static void nresolve_texture(long struct, long value) { memPutAddress(struct + SDL_GPUColorTargetInfo.RESOLVE_TEXTURE, value); }
    /** Unsafe version of {@link #resolve_mip_level(int) resolve_mip_level}. */
    public static void nresolve_mip_level(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetInfo.RESOLVE_MIP_LEVEL, value); }
    /** Unsafe version of {@link #resolve_layer(int) resolve_layer}. */
    public static void nresolve_layer(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetInfo.RESOLVE_LAYER, value); }
    /** Unsafe version of {@link #cycle(boolean) cycle}. */
    public static void ncycle(long struct, boolean value) { memPutByte(struct + SDL_GPUColorTargetInfo.CYCLE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #cycle_resolve_texture(boolean) cycle_resolve_texture}. */
    public static void ncycle_resolve_texture(long struct, boolean value) { memPutByte(struct + SDL_GPUColorTargetInfo.CYCLE_RESOLVE_TEXTURE, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUColorTargetInfo.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUColorTargetInfo.PADDING2, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUColorTargetInfo.TEXTURE));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUColorTargetInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUColorTargetInfo, Buffer> implements NativeResource {

        private static final SDL_GPUColorTargetInfo ELEMENT_FACTORY = SDL_GPUColorTargetInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUColorTargetInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUColorTargetInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUColorTargetInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUColorTargetInfo.ntexture(address()); }
        /** @return the value of the {@code mip_level} field. */
        @NativeType("Uint32")
        public int mip_level() { return SDL_GPUColorTargetInfo.nmip_level(address()); }
        /** @return the value of the {@code layer_or_depth_plane} field. */
        @NativeType("Uint32")
        public int layer_or_depth_plane() { return SDL_GPUColorTargetInfo.nlayer_or_depth_plane(address()); }
        /** @return a {@link SDL_FColor} view of the {@code clear_color} field. */
        public SDL_FColor clear_color() { return SDL_GPUColorTargetInfo.nclear_color(address()); }
        /** @return the value of the {@code load_op} field. */
        @NativeType("SDL_GPULoadOp")
        public int load_op() { return SDL_GPUColorTargetInfo.nload_op(address()); }
        /** @return the value of the {@code store_op} field. */
        @NativeType("SDL_GPUStoreOp")
        public int store_op() { return SDL_GPUColorTargetInfo.nstore_op(address()); }
        /** @return the value of the {@code resolve_texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long resolve_texture() { return SDL_GPUColorTargetInfo.nresolve_texture(address()); }
        /** @return the value of the {@code resolve_mip_level} field. */
        @NativeType("Uint32")
        public int resolve_mip_level() { return SDL_GPUColorTargetInfo.nresolve_mip_level(address()); }
        /** @return the value of the {@code resolve_layer} field. */
        @NativeType("Uint32")
        public int resolve_layer() { return SDL_GPUColorTargetInfo.nresolve_layer(address()); }
        /** @return the value of the {@code cycle} field. */
        @NativeType("bool")
        public boolean cycle() { return SDL_GPUColorTargetInfo.ncycle(address()); }
        /** @return the value of the {@code cycle_resolve_texture} field. */
        @NativeType("bool")
        public boolean cycle_resolve_texture() { return SDL_GPUColorTargetInfo.ncycle_resolve_texture(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUColorTargetInfo.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUColorTargetInfo.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code mip_level} field. */
        public SDL_GPUColorTargetInfo.Buffer mip_level(@NativeType("Uint32") int value) { SDL_GPUColorTargetInfo.nmip_level(address(), value); return this; }
        /** Sets the specified value to the {@code layer_or_depth_plane} field. */
        public SDL_GPUColorTargetInfo.Buffer layer_or_depth_plane(@NativeType("Uint32") int value) { SDL_GPUColorTargetInfo.nlayer_or_depth_plane(address(), value); return this; }
        /** Copies the specified {@link SDL_FColor} to the {@code clear_color} field. */
        public SDL_GPUColorTargetInfo.Buffer clear_color(SDL_FColor value) { SDL_GPUColorTargetInfo.nclear_color(address(), value); return this; }
        /** Passes the {@code clear_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUColorTargetInfo.Buffer clear_color(java.util.function.Consumer<SDL_FColor> consumer) { consumer.accept(clear_color()); return this; }
        /** Sets the specified value to the {@code load_op} field. */
        public SDL_GPUColorTargetInfo.Buffer load_op(@NativeType("SDL_GPULoadOp") int value) { SDL_GPUColorTargetInfo.nload_op(address(), value); return this; }
        /** Sets the specified value to the {@code store_op} field. */
        public SDL_GPUColorTargetInfo.Buffer store_op(@NativeType("SDL_GPUStoreOp") int value) { SDL_GPUColorTargetInfo.nstore_op(address(), value); return this; }
        /** Sets the specified value to the {@code resolve_texture} field. */
        public SDL_GPUColorTargetInfo.Buffer resolve_texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUColorTargetInfo.nresolve_texture(address(), value); return this; }
        /** Sets the specified value to the {@code resolve_mip_level} field. */
        public SDL_GPUColorTargetInfo.Buffer resolve_mip_level(@NativeType("Uint32") int value) { SDL_GPUColorTargetInfo.nresolve_mip_level(address(), value); return this; }
        /** Sets the specified value to the {@code resolve_layer} field. */
        public SDL_GPUColorTargetInfo.Buffer resolve_layer(@NativeType("Uint32") int value) { SDL_GPUColorTargetInfo.nresolve_layer(address(), value); return this; }
        /** Sets the specified value to the {@code cycle} field. */
        public SDL_GPUColorTargetInfo.Buffer cycle(@NativeType("bool") boolean value) { SDL_GPUColorTargetInfo.ncycle(address(), value); return this; }
        /** Sets the specified value to the {@code cycle_resolve_texture} field. */
        public SDL_GPUColorTargetInfo.Buffer cycle_resolve_texture(@NativeType("bool") boolean value) { SDL_GPUColorTargetInfo.ncycle_resolve_texture(address(), value); return this; }

    }

}