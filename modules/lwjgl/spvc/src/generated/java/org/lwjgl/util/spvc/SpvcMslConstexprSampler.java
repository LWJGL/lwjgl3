/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_msl_constexpr_sampler {
 *     spvc_msl_sampler_coord coord;
 *     spvc_msl_sampler_filter min_filter;
 *     spvc_msl_sampler_filter mag_filter;
 *     spvc_msl_sampler_mip_filter mip_filter;
 *     spvc_msl_sampler_address s_address;
 *     spvc_msl_sampler_address t_address;
 *     spvc_msl_sampler_address r_address;
 *     spvc_msl_sampler_compare_func compare_func;
 *     spvc_msl_sampler_border_color border_color;
 *     float lod_clamp_min;
 *     float lod_clamp_max;
 *     int max_anisotropy;
 *     spvc_bool compare_enable;
 *     spvc_bool lod_clamp_enable;
 *     spvc_bool anisotropy_enable;
 * }</code></pre>
 */
@NativeType("struct spvc_msl_constexpr_sampler")
public class SpvcMslConstexprSampler extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COORD,
        MIN_FILTER,
        MAG_FILTER,
        MIP_FILTER,
        S_ADDRESS,
        T_ADDRESS,
        R_ADDRESS,
        COMPARE_FUNC,
        BORDER_COLOR,
        LOD_CLAMP_MIN,
        LOD_CLAMP_MAX,
        MAX_ANISOTROPY,
        COMPARE_ENABLE,
        LOD_CLAMP_ENABLE,
        ANISOTROPY_ENABLE;

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
            __member(4),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COORD = layout.offsetof(0);
        MIN_FILTER = layout.offsetof(1);
        MAG_FILTER = layout.offsetof(2);
        MIP_FILTER = layout.offsetof(3);
        S_ADDRESS = layout.offsetof(4);
        T_ADDRESS = layout.offsetof(5);
        R_ADDRESS = layout.offsetof(6);
        COMPARE_FUNC = layout.offsetof(7);
        BORDER_COLOR = layout.offsetof(8);
        LOD_CLAMP_MIN = layout.offsetof(9);
        LOD_CLAMP_MAX = layout.offsetof(10);
        MAX_ANISOTROPY = layout.offsetof(11);
        COMPARE_ENABLE = layout.offsetof(12);
        LOD_CLAMP_ENABLE = layout.offsetof(13);
        ANISOTROPY_ENABLE = layout.offsetof(14);
    }

    /**
     * Creates a {@code SpvcMslConstexprSampler} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslConstexprSampler(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code coord} field. */
    @NativeType("spvc_msl_sampler_coord")
    public int coord() { return ncoord(address()); }
    /** @return the value of the {@code min_filter} field. */
    @NativeType("spvc_msl_sampler_filter")
    public int min_filter() { return nmin_filter(address()); }
    /** @return the value of the {@code mag_filter} field. */
    @NativeType("spvc_msl_sampler_filter")
    public int mag_filter() { return nmag_filter(address()); }
    /** @return the value of the {@code mip_filter} field. */
    @NativeType("spvc_msl_sampler_mip_filter")
    public int mip_filter() { return nmip_filter(address()); }
    /** @return the value of the {@code s_address} field. */
    @NativeType("spvc_msl_sampler_address")
    public int s_address() { return ns_address(address()); }
    /** @return the value of the {@code t_address} field. */
    @NativeType("spvc_msl_sampler_address")
    public int t_address() { return nt_address(address()); }
    /** @return the value of the {@code r_address} field. */
    @NativeType("spvc_msl_sampler_address")
    public int r_address() { return nr_address(address()); }
    /** @return the value of the {@code compare_func} field. */
    @NativeType("spvc_msl_sampler_compare_func")
    public int compare_func() { return ncompare_func(address()); }
    /** @return the value of the {@code border_color} field. */
    @NativeType("spvc_msl_sampler_border_color")
    public int border_color() { return nborder_color(address()); }
    /** @return the value of the {@code lod_clamp_min} field. */
    public float lod_clamp_min() { return nlod_clamp_min(address()); }
    /** @return the value of the {@code lod_clamp_max} field. */
    public float lod_clamp_max() { return nlod_clamp_max(address()); }
    /** @return the value of the {@code max_anisotropy} field. */
    public int max_anisotropy() { return nmax_anisotropy(address()); }
    /** @return the value of the {@code compare_enable} field. */
    @NativeType("spvc_bool")
    public boolean compare_enable() { return ncompare_enable(address()); }
    /** @return the value of the {@code lod_clamp_enable} field. */
    @NativeType("spvc_bool")
    public boolean lod_clamp_enable() { return nlod_clamp_enable(address()); }
    /** @return the value of the {@code anisotropy_enable} field. */
    @NativeType("spvc_bool")
    public boolean anisotropy_enable() { return nanisotropy_enable(address()); }

    /** Sets the specified value to the {@code coord} field. */
    public SpvcMslConstexprSampler coord(@NativeType("spvc_msl_sampler_coord") int value) { ncoord(address(), value); return this; }
    /** Sets the specified value to the {@code min_filter} field. */
    public SpvcMslConstexprSampler min_filter(@NativeType("spvc_msl_sampler_filter") int value) { nmin_filter(address(), value); return this; }
    /** Sets the specified value to the {@code mag_filter} field. */
    public SpvcMslConstexprSampler mag_filter(@NativeType("spvc_msl_sampler_filter") int value) { nmag_filter(address(), value); return this; }
    /** Sets the specified value to the {@code mip_filter} field. */
    public SpvcMslConstexprSampler mip_filter(@NativeType("spvc_msl_sampler_mip_filter") int value) { nmip_filter(address(), value); return this; }
    /** Sets the specified value to the {@code s_address} field. */
    public SpvcMslConstexprSampler s_address(@NativeType("spvc_msl_sampler_address") int value) { ns_address(address(), value); return this; }
    /** Sets the specified value to the {@code t_address} field. */
    public SpvcMslConstexprSampler t_address(@NativeType("spvc_msl_sampler_address") int value) { nt_address(address(), value); return this; }
    /** Sets the specified value to the {@code r_address} field. */
    public SpvcMslConstexprSampler r_address(@NativeType("spvc_msl_sampler_address") int value) { nr_address(address(), value); return this; }
    /** Sets the specified value to the {@code compare_func} field. */
    public SpvcMslConstexprSampler compare_func(@NativeType("spvc_msl_sampler_compare_func") int value) { ncompare_func(address(), value); return this; }
    /** Sets the specified value to the {@code border_color} field. */
    public SpvcMslConstexprSampler border_color(@NativeType("spvc_msl_sampler_border_color") int value) { nborder_color(address(), value); return this; }
    /** Sets the specified value to the {@code lod_clamp_min} field. */
    public SpvcMslConstexprSampler lod_clamp_min(float value) { nlod_clamp_min(address(), value); return this; }
    /** Sets the specified value to the {@code lod_clamp_max} field. */
    public SpvcMslConstexprSampler lod_clamp_max(float value) { nlod_clamp_max(address(), value); return this; }
    /** Sets the specified value to the {@code max_anisotropy} field. */
    public SpvcMslConstexprSampler max_anisotropy(int value) { nmax_anisotropy(address(), value); return this; }
    /** Sets the specified value to the {@code compare_enable} field. */
    public SpvcMslConstexprSampler compare_enable(@NativeType("spvc_bool") boolean value) { ncompare_enable(address(), value); return this; }
    /** Sets the specified value to the {@code lod_clamp_enable} field. */
    public SpvcMslConstexprSampler lod_clamp_enable(@NativeType("spvc_bool") boolean value) { nlod_clamp_enable(address(), value); return this; }
    /** Sets the specified value to the {@code anisotropy_enable} field. */
    public SpvcMslConstexprSampler anisotropy_enable(@NativeType("spvc_bool") boolean value) { nanisotropy_enable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslConstexprSampler set(
        int coord,
        int min_filter,
        int mag_filter,
        int mip_filter,
        int s_address,
        int t_address,
        int r_address,
        int compare_func,
        int border_color,
        float lod_clamp_min,
        float lod_clamp_max,
        int max_anisotropy,
        boolean compare_enable,
        boolean lod_clamp_enable,
        boolean anisotropy_enable
    ) {
        coord(coord);
        min_filter(min_filter);
        mag_filter(mag_filter);
        mip_filter(mip_filter);
        s_address(s_address);
        t_address(t_address);
        r_address(r_address);
        compare_func(compare_func);
        border_color(border_color);
        lod_clamp_min(lod_clamp_min);
        lod_clamp_max(lod_clamp_max);
        max_anisotropy(max_anisotropy);
        compare_enable(compare_enable);
        lod_clamp_enable(lod_clamp_enable);
        anisotropy_enable(anisotropy_enable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcMslConstexprSampler set(SpvcMslConstexprSampler src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslConstexprSampler} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslConstexprSampler malloc() {
        return wrap(SpvcMslConstexprSampler.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcMslConstexprSampler} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslConstexprSampler calloc() {
        return wrap(SpvcMslConstexprSampler.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcMslConstexprSampler} instance allocated with {@link BufferUtils}. */
    public static SpvcMslConstexprSampler create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcMslConstexprSampler.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslConstexprSampler} instance for the specified memory address. */
    public static SpvcMslConstexprSampler create(long address) {
        return wrap(SpvcMslConstexprSampler.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslConstexprSampler createSafe(long address) {
        return address == NULL ? null : wrap(SpvcMslConstexprSampler.class, address);
    }

    /**
     * Returns a new {@link SpvcMslConstexprSampler.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslConstexprSampler.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslConstexprSampler.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslConstexprSampler.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslConstexprSampler.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslConstexprSampler.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcMslConstexprSampler.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslConstexprSampler.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslConstexprSampler.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslConstexprSampler} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslConstexprSampler malloc(MemoryStack stack) {
        return wrap(SpvcMslConstexprSampler.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcMslConstexprSampler} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslConstexprSampler calloc(MemoryStack stack) {
        return wrap(SpvcMslConstexprSampler.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcMslConstexprSampler.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslConstexprSampler.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslConstexprSampler.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslConstexprSampler.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #coord}. */
    public static int ncoord(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.COORD); }
    /** Unsafe version of {@link #min_filter}. */
    public static int nmin_filter(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.MIN_FILTER); }
    /** Unsafe version of {@link #mag_filter}. */
    public static int nmag_filter(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.MAG_FILTER); }
    /** Unsafe version of {@link #mip_filter}. */
    public static int nmip_filter(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.MIP_FILTER); }
    /** Unsafe version of {@link #s_address}. */
    public static int ns_address(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.S_ADDRESS); }
    /** Unsafe version of {@link #t_address}. */
    public static int nt_address(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.T_ADDRESS); }
    /** Unsafe version of {@link #r_address}. */
    public static int nr_address(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.R_ADDRESS); }
    /** Unsafe version of {@link #compare_func}. */
    public static int ncompare_func(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.COMPARE_FUNC); }
    /** Unsafe version of {@link #border_color}. */
    public static int nborder_color(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.BORDER_COLOR); }
    /** Unsafe version of {@link #lod_clamp_min}. */
    public static float nlod_clamp_min(long struct) { return UNSAFE.getFloat(null, struct + SpvcMslConstexprSampler.LOD_CLAMP_MIN); }
    /** Unsafe version of {@link #lod_clamp_max}. */
    public static float nlod_clamp_max(long struct) { return UNSAFE.getFloat(null, struct + SpvcMslConstexprSampler.LOD_CLAMP_MAX); }
    /** Unsafe version of {@link #max_anisotropy}. */
    public static int nmax_anisotropy(long struct) { return UNSAFE.getInt(null, struct + SpvcMslConstexprSampler.MAX_ANISOTROPY); }
    /** Unsafe version of {@link #compare_enable}. */
    public static boolean ncompare_enable(long struct) { return UNSAFE.getByte(null, struct + SpvcMslConstexprSampler.COMPARE_ENABLE) != 0; }
    /** Unsafe version of {@link #lod_clamp_enable}. */
    public static boolean nlod_clamp_enable(long struct) { return UNSAFE.getByte(null, struct + SpvcMslConstexprSampler.LOD_CLAMP_ENABLE) != 0; }
    /** Unsafe version of {@link #anisotropy_enable}. */
    public static boolean nanisotropy_enable(long struct) { return UNSAFE.getByte(null, struct + SpvcMslConstexprSampler.ANISOTROPY_ENABLE) != 0; }

    /** Unsafe version of {@link #coord(int) coord}. */
    public static void ncoord(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.COORD, value); }
    /** Unsafe version of {@link #min_filter(int) min_filter}. */
    public static void nmin_filter(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.MIN_FILTER, value); }
    /** Unsafe version of {@link #mag_filter(int) mag_filter}. */
    public static void nmag_filter(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.MAG_FILTER, value); }
    /** Unsafe version of {@link #mip_filter(int) mip_filter}. */
    public static void nmip_filter(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.MIP_FILTER, value); }
    /** Unsafe version of {@link #s_address(int) s_address}. */
    public static void ns_address(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.S_ADDRESS, value); }
    /** Unsafe version of {@link #t_address(int) t_address}. */
    public static void nt_address(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.T_ADDRESS, value); }
    /** Unsafe version of {@link #r_address(int) r_address}. */
    public static void nr_address(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.R_ADDRESS, value); }
    /** Unsafe version of {@link #compare_func(int) compare_func}. */
    public static void ncompare_func(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.COMPARE_FUNC, value); }
    /** Unsafe version of {@link #border_color(int) border_color}. */
    public static void nborder_color(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.BORDER_COLOR, value); }
    /** Unsafe version of {@link #lod_clamp_min(float) lod_clamp_min}. */
    public static void nlod_clamp_min(long struct, float value) { UNSAFE.putFloat(null, struct + SpvcMslConstexprSampler.LOD_CLAMP_MIN, value); }
    /** Unsafe version of {@link #lod_clamp_max(float) lod_clamp_max}. */
    public static void nlod_clamp_max(long struct, float value) { UNSAFE.putFloat(null, struct + SpvcMslConstexprSampler.LOD_CLAMP_MAX, value); }
    /** Unsafe version of {@link #max_anisotropy(int) max_anisotropy}. */
    public static void nmax_anisotropy(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslConstexprSampler.MAX_ANISOTROPY, value); }
    /** Unsafe version of {@link #compare_enable(boolean) compare_enable}. */
    public static void ncompare_enable(long struct, boolean value) { UNSAFE.putByte(null, struct + SpvcMslConstexprSampler.COMPARE_ENABLE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #lod_clamp_enable(boolean) lod_clamp_enable}. */
    public static void nlod_clamp_enable(long struct, boolean value) { UNSAFE.putByte(null, struct + SpvcMslConstexprSampler.LOD_CLAMP_ENABLE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #anisotropy_enable(boolean) anisotropy_enable}. */
    public static void nanisotropy_enable(long struct, boolean value) { UNSAFE.putByte(null, struct + SpvcMslConstexprSampler.ANISOTROPY_ENABLE, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link SpvcMslConstexprSampler} structs. */
    public static class Buffer extends StructBuffer<SpvcMslConstexprSampler, Buffer> implements NativeResource {

        private static final SpvcMslConstexprSampler ELEMENT_FACTORY = SpvcMslConstexprSampler.create(-1L);

        /**
         * Creates a new {@code SpvcMslConstexprSampler.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslConstexprSampler#SIZEOF}, and its mark will be undefined.
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
        protected SpvcMslConstexprSampler getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code coord} field. */
        @NativeType("spvc_msl_sampler_coord")
        public int coord() { return SpvcMslConstexprSampler.ncoord(address()); }
        /** @return the value of the {@code min_filter} field. */
        @NativeType("spvc_msl_sampler_filter")
        public int min_filter() { return SpvcMslConstexprSampler.nmin_filter(address()); }
        /** @return the value of the {@code mag_filter} field. */
        @NativeType("spvc_msl_sampler_filter")
        public int mag_filter() { return SpvcMslConstexprSampler.nmag_filter(address()); }
        /** @return the value of the {@code mip_filter} field. */
        @NativeType("spvc_msl_sampler_mip_filter")
        public int mip_filter() { return SpvcMslConstexprSampler.nmip_filter(address()); }
        /** @return the value of the {@code s_address} field. */
        @NativeType("spvc_msl_sampler_address")
        public int s_address() { return SpvcMslConstexprSampler.ns_address(address()); }
        /** @return the value of the {@code t_address} field. */
        @NativeType("spvc_msl_sampler_address")
        public int t_address() { return SpvcMslConstexprSampler.nt_address(address()); }
        /** @return the value of the {@code r_address} field. */
        @NativeType("spvc_msl_sampler_address")
        public int r_address() { return SpvcMslConstexprSampler.nr_address(address()); }
        /** @return the value of the {@code compare_func} field. */
        @NativeType("spvc_msl_sampler_compare_func")
        public int compare_func() { return SpvcMslConstexprSampler.ncompare_func(address()); }
        /** @return the value of the {@code border_color} field. */
        @NativeType("spvc_msl_sampler_border_color")
        public int border_color() { return SpvcMslConstexprSampler.nborder_color(address()); }
        /** @return the value of the {@code lod_clamp_min} field. */
        public float lod_clamp_min() { return SpvcMslConstexprSampler.nlod_clamp_min(address()); }
        /** @return the value of the {@code lod_clamp_max} field. */
        public float lod_clamp_max() { return SpvcMslConstexprSampler.nlod_clamp_max(address()); }
        /** @return the value of the {@code max_anisotropy} field. */
        public int max_anisotropy() { return SpvcMslConstexprSampler.nmax_anisotropy(address()); }
        /** @return the value of the {@code compare_enable} field. */
        @NativeType("spvc_bool")
        public boolean compare_enable() { return SpvcMslConstexprSampler.ncompare_enable(address()); }
        /** @return the value of the {@code lod_clamp_enable} field. */
        @NativeType("spvc_bool")
        public boolean lod_clamp_enable() { return SpvcMslConstexprSampler.nlod_clamp_enable(address()); }
        /** @return the value of the {@code anisotropy_enable} field. */
        @NativeType("spvc_bool")
        public boolean anisotropy_enable() { return SpvcMslConstexprSampler.nanisotropy_enable(address()); }

        /** Sets the specified value to the {@code coord} field. */
        public SpvcMslConstexprSampler.Buffer coord(@NativeType("spvc_msl_sampler_coord") int value) { SpvcMslConstexprSampler.ncoord(address(), value); return this; }
        /** Sets the specified value to the {@code min_filter} field. */
        public SpvcMslConstexprSampler.Buffer min_filter(@NativeType("spvc_msl_sampler_filter") int value) { SpvcMslConstexprSampler.nmin_filter(address(), value); return this; }
        /** Sets the specified value to the {@code mag_filter} field. */
        public SpvcMslConstexprSampler.Buffer mag_filter(@NativeType("spvc_msl_sampler_filter") int value) { SpvcMslConstexprSampler.nmag_filter(address(), value); return this; }
        /** Sets the specified value to the {@code mip_filter} field. */
        public SpvcMslConstexprSampler.Buffer mip_filter(@NativeType("spvc_msl_sampler_mip_filter") int value) { SpvcMslConstexprSampler.nmip_filter(address(), value); return this; }
        /** Sets the specified value to the {@code s_address} field. */
        public SpvcMslConstexprSampler.Buffer s_address(@NativeType("spvc_msl_sampler_address") int value) { SpvcMslConstexprSampler.ns_address(address(), value); return this; }
        /** Sets the specified value to the {@code t_address} field. */
        public SpvcMslConstexprSampler.Buffer t_address(@NativeType("spvc_msl_sampler_address") int value) { SpvcMslConstexprSampler.nt_address(address(), value); return this; }
        /** Sets the specified value to the {@code r_address} field. */
        public SpvcMslConstexprSampler.Buffer r_address(@NativeType("spvc_msl_sampler_address") int value) { SpvcMslConstexprSampler.nr_address(address(), value); return this; }
        /** Sets the specified value to the {@code compare_func} field. */
        public SpvcMslConstexprSampler.Buffer compare_func(@NativeType("spvc_msl_sampler_compare_func") int value) { SpvcMslConstexprSampler.ncompare_func(address(), value); return this; }
        /** Sets the specified value to the {@code border_color} field. */
        public SpvcMslConstexprSampler.Buffer border_color(@NativeType("spvc_msl_sampler_border_color") int value) { SpvcMslConstexprSampler.nborder_color(address(), value); return this; }
        /** Sets the specified value to the {@code lod_clamp_min} field. */
        public SpvcMslConstexprSampler.Buffer lod_clamp_min(float value) { SpvcMslConstexprSampler.nlod_clamp_min(address(), value); return this; }
        /** Sets the specified value to the {@code lod_clamp_max} field. */
        public SpvcMslConstexprSampler.Buffer lod_clamp_max(float value) { SpvcMslConstexprSampler.nlod_clamp_max(address(), value); return this; }
        /** Sets the specified value to the {@code max_anisotropy} field. */
        public SpvcMslConstexprSampler.Buffer max_anisotropy(int value) { SpvcMslConstexprSampler.nmax_anisotropy(address(), value); return this; }
        /** Sets the specified value to the {@code compare_enable} field. */
        public SpvcMslConstexprSampler.Buffer compare_enable(@NativeType("spvc_bool") boolean value) { SpvcMslConstexprSampler.ncompare_enable(address(), value); return this; }
        /** Sets the specified value to the {@code lod_clamp_enable} field. */
        public SpvcMslConstexprSampler.Buffer lod_clamp_enable(@NativeType("spvc_bool") boolean value) { SpvcMslConstexprSampler.nlod_clamp_enable(address(), value); return this; }
        /** Sets the specified value to the {@code anisotropy_enable} field. */
        public SpvcMslConstexprSampler.Buffer anisotropy_enable(@NativeType("spvc_bool") boolean value) { SpvcMslConstexprSampler.nanisotropy_enable(address(), value); return this; }

    }

}