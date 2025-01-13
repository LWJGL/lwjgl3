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
 * struct SDL_GPUSamplerCreateInfo {
 *     SDL_GPUFilter min_filter;
 *     SDL_GPUFilter mag_filter;
 *     SDL_GPUSamplerMipmapMode mipmap_mode;
 *     SDL_GPUSamplerAddressMode address_mode_u;
 *     SDL_GPUSamplerAddressMode address_mode_v;
 *     SDL_GPUSamplerAddressMode address_mode_w;
 *     float mip_lod_bias;
 *     float max_anisotropy;
 *     SDL_GPUCompareOp compare_op;
 *     float min_lod;
 *     float max_lod;
 *     bool enable_anisotropy;
 *     bool enable_compare;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     SDL_PropertiesID props;
 * }}</pre>
 */
public class SDL_GPUSamplerCreateInfo extends Struct<SDL_GPUSamplerCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MIN_FILTER,
        MAG_FILTER,
        MIPMAP_MODE,
        ADDRESS_MODE_U,
        ADDRESS_MODE_V,
        ADDRESS_MODE_W,
        MIP_LOD_BIAS,
        MAX_ANISOTROPY,
        COMPARE_OP,
        MIN_LOD,
        MAX_LOD,
        ENABLE_ANISOTROPY,
        ENABLE_COMPARE,
        PADDING1,
        PADDING2,
        PROPS;

    static {
        Layout layout = __struct(
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
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MIN_FILTER = layout.offsetof(0);
        MAG_FILTER = layout.offsetof(1);
        MIPMAP_MODE = layout.offsetof(2);
        ADDRESS_MODE_U = layout.offsetof(3);
        ADDRESS_MODE_V = layout.offsetof(4);
        ADDRESS_MODE_W = layout.offsetof(5);
        MIP_LOD_BIAS = layout.offsetof(6);
        MAX_ANISOTROPY = layout.offsetof(7);
        COMPARE_OP = layout.offsetof(8);
        MIN_LOD = layout.offsetof(9);
        MAX_LOD = layout.offsetof(10);
        ENABLE_ANISOTROPY = layout.offsetof(11);
        ENABLE_COMPARE = layout.offsetof(12);
        PADDING1 = layout.offsetof(13);
        PADDING2 = layout.offsetof(14);
        PROPS = layout.offsetof(15);
    }

    protected SDL_GPUSamplerCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUSamplerCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUSamplerCreateInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUSamplerCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUSamplerCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code min_filter} field. */
    @NativeType("SDL_GPUFilter")
    public int min_filter() { return nmin_filter(address()); }
    /** @return the value of the {@code mag_filter} field. */
    @NativeType("SDL_GPUFilter")
    public int mag_filter() { return nmag_filter(address()); }
    /** @return the value of the {@code mipmap_mode} field. */
    @NativeType("SDL_GPUSamplerMipmapMode")
    public int mipmap_mode() { return nmipmap_mode(address()); }
    /** @return the value of the {@code address_mode_u} field. */
    @NativeType("SDL_GPUSamplerAddressMode")
    public int address_mode_u() { return naddress_mode_u(address()); }
    /** @return the value of the {@code address_mode_v} field. */
    @NativeType("SDL_GPUSamplerAddressMode")
    public int address_mode_v() { return naddress_mode_v(address()); }
    /** @return the value of the {@code address_mode_w} field. */
    @NativeType("SDL_GPUSamplerAddressMode")
    public int address_mode_w() { return naddress_mode_w(address()); }
    /** @return the value of the {@code mip_lod_bias} field. */
    public float mip_lod_bias() { return nmip_lod_bias(address()); }
    /** @return the value of the {@code max_anisotropy} field. */
    public float max_anisotropy() { return nmax_anisotropy(address()); }
    /** @return the value of the {@code compare_op} field. */
    @NativeType("SDL_GPUCompareOp")
    public int compare_op() { return ncompare_op(address()); }
    /** @return the value of the {@code min_lod} field. */
    public float min_lod() { return nmin_lod(address()); }
    /** @return the value of the {@code max_lod} field. */
    public float max_lod() { return nmax_lod(address()); }
    /** @return the value of the {@code enable_anisotropy} field. */
    @NativeType("bool")
    public boolean enable_anisotropy() { return nenable_anisotropy(address()); }
    /** @return the value of the {@code enable_compare} field. */
    @NativeType("bool")
    public boolean enable_compare() { return nenable_compare(address()); }
    /** @return the value of the {@code props} field. */
    @NativeType("SDL_PropertiesID")
    public int props() { return nprops(address()); }

    /** Sets the specified value to the {@code min_filter} field. */
    public SDL_GPUSamplerCreateInfo min_filter(@NativeType("SDL_GPUFilter") int value) { nmin_filter(address(), value); return this; }
    /** Sets the specified value to the {@code mag_filter} field. */
    public SDL_GPUSamplerCreateInfo mag_filter(@NativeType("SDL_GPUFilter") int value) { nmag_filter(address(), value); return this; }
    /** Sets the specified value to the {@code mipmap_mode} field. */
    public SDL_GPUSamplerCreateInfo mipmap_mode(@NativeType("SDL_GPUSamplerMipmapMode") int value) { nmipmap_mode(address(), value); return this; }
    /** Sets the specified value to the {@code address_mode_u} field. */
    public SDL_GPUSamplerCreateInfo address_mode_u(@NativeType("SDL_GPUSamplerAddressMode") int value) { naddress_mode_u(address(), value); return this; }
    /** Sets the specified value to the {@code address_mode_v} field. */
    public SDL_GPUSamplerCreateInfo address_mode_v(@NativeType("SDL_GPUSamplerAddressMode") int value) { naddress_mode_v(address(), value); return this; }
    /** Sets the specified value to the {@code address_mode_w} field. */
    public SDL_GPUSamplerCreateInfo address_mode_w(@NativeType("SDL_GPUSamplerAddressMode") int value) { naddress_mode_w(address(), value); return this; }
    /** Sets the specified value to the {@code mip_lod_bias} field. */
    public SDL_GPUSamplerCreateInfo mip_lod_bias(float value) { nmip_lod_bias(address(), value); return this; }
    /** Sets the specified value to the {@code max_anisotropy} field. */
    public SDL_GPUSamplerCreateInfo max_anisotropy(float value) { nmax_anisotropy(address(), value); return this; }
    /** Sets the specified value to the {@code compare_op} field. */
    public SDL_GPUSamplerCreateInfo compare_op(@NativeType("SDL_GPUCompareOp") int value) { ncompare_op(address(), value); return this; }
    /** Sets the specified value to the {@code min_lod} field. */
    public SDL_GPUSamplerCreateInfo min_lod(float value) { nmin_lod(address(), value); return this; }
    /** Sets the specified value to the {@code max_lod} field. */
    public SDL_GPUSamplerCreateInfo max_lod(float value) { nmax_lod(address(), value); return this; }
    /** Sets the specified value to the {@code enable_anisotropy} field. */
    public SDL_GPUSamplerCreateInfo enable_anisotropy(@NativeType("bool") boolean value) { nenable_anisotropy(address(), value); return this; }
    /** Sets the specified value to the {@code enable_compare} field. */
    public SDL_GPUSamplerCreateInfo enable_compare(@NativeType("bool") boolean value) { nenable_compare(address(), value); return this; }
    /** Sets the specified value to the {@code props} field. */
    public SDL_GPUSamplerCreateInfo props(@NativeType("SDL_PropertiesID") int value) { nprops(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUSamplerCreateInfo set(
        int min_filter,
        int mag_filter,
        int mipmap_mode,
        int address_mode_u,
        int address_mode_v,
        int address_mode_w,
        float mip_lod_bias,
        float max_anisotropy,
        int compare_op,
        float min_lod,
        float max_lod,
        boolean enable_anisotropy,
        boolean enable_compare,
        int props
    ) {
        min_filter(min_filter);
        mag_filter(mag_filter);
        mipmap_mode(mipmap_mode);
        address_mode_u(address_mode_u);
        address_mode_v(address_mode_v);
        address_mode_w(address_mode_w);
        mip_lod_bias(mip_lod_bias);
        max_anisotropy(max_anisotropy);
        compare_op(compare_op);
        min_lod(min_lod);
        max_lod(max_lod);
        enable_anisotropy(enable_anisotropy);
        enable_compare(enable_compare);
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
    public SDL_GPUSamplerCreateInfo set(SDL_GPUSamplerCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUSamplerCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUSamplerCreateInfo malloc() {
        return new SDL_GPUSamplerCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUSamplerCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUSamplerCreateInfo calloc() {
        return new SDL_GPUSamplerCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUSamplerCreateInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUSamplerCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUSamplerCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUSamplerCreateInfo} instance for the specified memory address. */
    public static SDL_GPUSamplerCreateInfo create(long address) {
        return new SDL_GPUSamplerCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUSamplerCreateInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUSamplerCreateInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUSamplerCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUSamplerCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUSamplerCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUSamplerCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUSamplerCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUSamplerCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUSamplerCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUSamplerCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUSamplerCreateInfo malloc(MemoryStack stack) {
        return new SDL_GPUSamplerCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUSamplerCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUSamplerCreateInfo calloc(MemoryStack stack) {
        return new SDL_GPUSamplerCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUSamplerCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUSamplerCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #min_filter}. */
    public static int nmin_filter(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.MIN_FILTER); }
    /** Unsafe version of {@link #mag_filter}. */
    public static int nmag_filter(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.MAG_FILTER); }
    /** Unsafe version of {@link #mipmap_mode}. */
    public static int nmipmap_mode(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.MIPMAP_MODE); }
    /** Unsafe version of {@link #address_mode_u}. */
    public static int naddress_mode_u(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.ADDRESS_MODE_U); }
    /** Unsafe version of {@link #address_mode_v}. */
    public static int naddress_mode_v(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.ADDRESS_MODE_V); }
    /** Unsafe version of {@link #address_mode_w}. */
    public static int naddress_mode_w(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.ADDRESS_MODE_W); }
    /** Unsafe version of {@link #mip_lod_bias}. */
    public static float nmip_lod_bias(long struct) { return memGetFloat(struct + SDL_GPUSamplerCreateInfo.MIP_LOD_BIAS); }
    /** Unsafe version of {@link #max_anisotropy}. */
    public static float nmax_anisotropy(long struct) { return memGetFloat(struct + SDL_GPUSamplerCreateInfo.MAX_ANISOTROPY); }
    /** Unsafe version of {@link #compare_op}. */
    public static int ncompare_op(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.COMPARE_OP); }
    /** Unsafe version of {@link #min_lod}. */
    public static float nmin_lod(long struct) { return memGetFloat(struct + SDL_GPUSamplerCreateInfo.MIN_LOD); }
    /** Unsafe version of {@link #max_lod}. */
    public static float nmax_lod(long struct) { return memGetFloat(struct + SDL_GPUSamplerCreateInfo.MAX_LOD); }
    /** Unsafe version of {@link #enable_anisotropy}. */
    public static boolean nenable_anisotropy(long struct) { return memGetByte(struct + SDL_GPUSamplerCreateInfo.ENABLE_ANISOTROPY) != 0; }
    /** Unsafe version of {@link #enable_compare}. */
    public static boolean nenable_compare(long struct) { return memGetByte(struct + SDL_GPUSamplerCreateInfo.ENABLE_COMPARE) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GPUSamplerCreateInfo.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GPUSamplerCreateInfo.PADDING2); }
    /** Unsafe version of {@link #props}. */
    public static int nprops(long struct) { return memGetInt(struct + SDL_GPUSamplerCreateInfo.PROPS); }

    /** Unsafe version of {@link #min_filter(int) min_filter}. */
    public static void nmin_filter(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.MIN_FILTER, value); }
    /** Unsafe version of {@link #mag_filter(int) mag_filter}. */
    public static void nmag_filter(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.MAG_FILTER, value); }
    /** Unsafe version of {@link #mipmap_mode(int) mipmap_mode}. */
    public static void nmipmap_mode(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.MIPMAP_MODE, value); }
    /** Unsafe version of {@link #address_mode_u(int) address_mode_u}. */
    public static void naddress_mode_u(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.ADDRESS_MODE_U, value); }
    /** Unsafe version of {@link #address_mode_v(int) address_mode_v}. */
    public static void naddress_mode_v(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.ADDRESS_MODE_V, value); }
    /** Unsafe version of {@link #address_mode_w(int) address_mode_w}. */
    public static void naddress_mode_w(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.ADDRESS_MODE_W, value); }
    /** Unsafe version of {@link #mip_lod_bias(float) mip_lod_bias}. */
    public static void nmip_lod_bias(long struct, float value) { memPutFloat(struct + SDL_GPUSamplerCreateInfo.MIP_LOD_BIAS, value); }
    /** Unsafe version of {@link #max_anisotropy(float) max_anisotropy}. */
    public static void nmax_anisotropy(long struct, float value) { memPutFloat(struct + SDL_GPUSamplerCreateInfo.MAX_ANISOTROPY, value); }
    /** Unsafe version of {@link #compare_op(int) compare_op}. */
    public static void ncompare_op(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.COMPARE_OP, value); }
    /** Unsafe version of {@link #min_lod(float) min_lod}. */
    public static void nmin_lod(long struct, float value) { memPutFloat(struct + SDL_GPUSamplerCreateInfo.MIN_LOD, value); }
    /** Unsafe version of {@link #max_lod(float) max_lod}. */
    public static void nmax_lod(long struct, float value) { memPutFloat(struct + SDL_GPUSamplerCreateInfo.MAX_LOD, value); }
    /** Unsafe version of {@link #enable_anisotropy(boolean) enable_anisotropy}. */
    public static void nenable_anisotropy(long struct, boolean value) { memPutByte(struct + SDL_GPUSamplerCreateInfo.ENABLE_ANISOTROPY, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #enable_compare(boolean) enable_compare}. */
    public static void nenable_compare(long struct, boolean value) { memPutByte(struct + SDL_GPUSamplerCreateInfo.ENABLE_COMPARE, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GPUSamplerCreateInfo.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GPUSamplerCreateInfo.PADDING2, value); }
    /** Unsafe version of {@link #props(int) props}. */
    public static void nprops(long struct, int value) { memPutInt(struct + SDL_GPUSamplerCreateInfo.PROPS, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUSamplerCreateInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUSamplerCreateInfo, Buffer> implements NativeResource {

        private static final SDL_GPUSamplerCreateInfo ELEMENT_FACTORY = SDL_GPUSamplerCreateInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUSamplerCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUSamplerCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUSamplerCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code min_filter} field. */
        @NativeType("SDL_GPUFilter")
        public int min_filter() { return SDL_GPUSamplerCreateInfo.nmin_filter(address()); }
        /** @return the value of the {@code mag_filter} field. */
        @NativeType("SDL_GPUFilter")
        public int mag_filter() { return SDL_GPUSamplerCreateInfo.nmag_filter(address()); }
        /** @return the value of the {@code mipmap_mode} field. */
        @NativeType("SDL_GPUSamplerMipmapMode")
        public int mipmap_mode() { return SDL_GPUSamplerCreateInfo.nmipmap_mode(address()); }
        /** @return the value of the {@code address_mode_u} field. */
        @NativeType("SDL_GPUSamplerAddressMode")
        public int address_mode_u() { return SDL_GPUSamplerCreateInfo.naddress_mode_u(address()); }
        /** @return the value of the {@code address_mode_v} field. */
        @NativeType("SDL_GPUSamplerAddressMode")
        public int address_mode_v() { return SDL_GPUSamplerCreateInfo.naddress_mode_v(address()); }
        /** @return the value of the {@code address_mode_w} field. */
        @NativeType("SDL_GPUSamplerAddressMode")
        public int address_mode_w() { return SDL_GPUSamplerCreateInfo.naddress_mode_w(address()); }
        /** @return the value of the {@code mip_lod_bias} field. */
        public float mip_lod_bias() { return SDL_GPUSamplerCreateInfo.nmip_lod_bias(address()); }
        /** @return the value of the {@code max_anisotropy} field. */
        public float max_anisotropy() { return SDL_GPUSamplerCreateInfo.nmax_anisotropy(address()); }
        /** @return the value of the {@code compare_op} field. */
        @NativeType("SDL_GPUCompareOp")
        public int compare_op() { return SDL_GPUSamplerCreateInfo.ncompare_op(address()); }
        /** @return the value of the {@code min_lod} field. */
        public float min_lod() { return SDL_GPUSamplerCreateInfo.nmin_lod(address()); }
        /** @return the value of the {@code max_lod} field. */
        public float max_lod() { return SDL_GPUSamplerCreateInfo.nmax_lod(address()); }
        /** @return the value of the {@code enable_anisotropy} field. */
        @NativeType("bool")
        public boolean enable_anisotropy() { return SDL_GPUSamplerCreateInfo.nenable_anisotropy(address()); }
        /** @return the value of the {@code enable_compare} field. */
        @NativeType("bool")
        public boolean enable_compare() { return SDL_GPUSamplerCreateInfo.nenable_compare(address()); }
        /** @return the value of the {@code props} field. */
        @NativeType("SDL_PropertiesID")
        public int props() { return SDL_GPUSamplerCreateInfo.nprops(address()); }

        /** Sets the specified value to the {@code min_filter} field. */
        public SDL_GPUSamplerCreateInfo.Buffer min_filter(@NativeType("SDL_GPUFilter") int value) { SDL_GPUSamplerCreateInfo.nmin_filter(address(), value); return this; }
        /** Sets the specified value to the {@code mag_filter} field. */
        public SDL_GPUSamplerCreateInfo.Buffer mag_filter(@NativeType("SDL_GPUFilter") int value) { SDL_GPUSamplerCreateInfo.nmag_filter(address(), value); return this; }
        /** Sets the specified value to the {@code mipmap_mode} field. */
        public SDL_GPUSamplerCreateInfo.Buffer mipmap_mode(@NativeType("SDL_GPUSamplerMipmapMode") int value) { SDL_GPUSamplerCreateInfo.nmipmap_mode(address(), value); return this; }
        /** Sets the specified value to the {@code address_mode_u} field. */
        public SDL_GPUSamplerCreateInfo.Buffer address_mode_u(@NativeType("SDL_GPUSamplerAddressMode") int value) { SDL_GPUSamplerCreateInfo.naddress_mode_u(address(), value); return this; }
        /** Sets the specified value to the {@code address_mode_v} field. */
        public SDL_GPUSamplerCreateInfo.Buffer address_mode_v(@NativeType("SDL_GPUSamplerAddressMode") int value) { SDL_GPUSamplerCreateInfo.naddress_mode_v(address(), value); return this; }
        /** Sets the specified value to the {@code address_mode_w} field. */
        public SDL_GPUSamplerCreateInfo.Buffer address_mode_w(@NativeType("SDL_GPUSamplerAddressMode") int value) { SDL_GPUSamplerCreateInfo.naddress_mode_w(address(), value); return this; }
        /** Sets the specified value to the {@code mip_lod_bias} field. */
        public SDL_GPUSamplerCreateInfo.Buffer mip_lod_bias(float value) { SDL_GPUSamplerCreateInfo.nmip_lod_bias(address(), value); return this; }
        /** Sets the specified value to the {@code max_anisotropy} field. */
        public SDL_GPUSamplerCreateInfo.Buffer max_anisotropy(float value) { SDL_GPUSamplerCreateInfo.nmax_anisotropy(address(), value); return this; }
        /** Sets the specified value to the {@code compare_op} field. */
        public SDL_GPUSamplerCreateInfo.Buffer compare_op(@NativeType("SDL_GPUCompareOp") int value) { SDL_GPUSamplerCreateInfo.ncompare_op(address(), value); return this; }
        /** Sets the specified value to the {@code min_lod} field. */
        public SDL_GPUSamplerCreateInfo.Buffer min_lod(float value) { SDL_GPUSamplerCreateInfo.nmin_lod(address(), value); return this; }
        /** Sets the specified value to the {@code max_lod} field. */
        public SDL_GPUSamplerCreateInfo.Buffer max_lod(float value) { SDL_GPUSamplerCreateInfo.nmax_lod(address(), value); return this; }
        /** Sets the specified value to the {@code enable_anisotropy} field. */
        public SDL_GPUSamplerCreateInfo.Buffer enable_anisotropy(@NativeType("bool") boolean value) { SDL_GPUSamplerCreateInfo.nenable_anisotropy(address(), value); return this; }
        /** Sets the specified value to the {@code enable_compare} field. */
        public SDL_GPUSamplerCreateInfo.Buffer enable_compare(@NativeType("bool") boolean value) { SDL_GPUSamplerCreateInfo.nenable_compare(address(), value); return this; }
        /** Sets the specified value to the {@code props} field. */
        public SDL_GPUSamplerCreateInfo.Buffer props(@NativeType("SDL_PropertiesID") int value) { SDL_GPUSamplerCreateInfo.nprops(address(), value); return this; }

    }

}