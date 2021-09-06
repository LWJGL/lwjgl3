/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Immutable configuration for a streamlines context.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct parsl_config {
 *     float thickness;
 *     uint32_t {@link #flags};
 *     int {@link #u_mode};
 *     float curves_max_flatness;
 *     float streamlines_seed_spacing;
 *     {@link ParSLViewport parsl_viewport} streamlines_seed_viewport;
 *     float miter_limit;
 * }</code></pre>
 */
@NativeType("struct parsl_config")
public class ParSLConfig extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        THICKNESS,
        FLAGS,
        U_MODE,
        CURVES_MAX_FLATNESS,
        STREAMLINES_SEED_SPACING,
        STREAMLINES_SEED_VIEWPORT,
        MITER_LIMIT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(ParSLViewport.SIZEOF, ParSLViewport.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        THICKNESS = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        U_MODE = layout.offsetof(2);
        CURVES_MAX_FLATNESS = layout.offsetof(3);
        STREAMLINES_SEED_SPACING = layout.offsetof(4);
        STREAMLINES_SEED_VIEWPORT = layout.offsetof(5);
        MITER_LIMIT = layout.offsetof(6);
    }

    /**
     * Creates a {@code ParSLConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParSLConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code thickness} field. */
    public float thickness() { return nthickness(address()); }
    /** one or more of:<br><table><tr><td>{@link ParStreamlines#PARSL_FLAG_WIREFRAME FLAG_WIREFRAME}</td><td>{@link ParStreamlines#PARSL_FLAG_ANNOTATIONS FLAG_ANNOTATIONS}</td><td>{@link ParStreamlines#PARSL_FLAG_SPINE_LENGTHS FLAG_SPINE_LENGTHS}</td><td>{@link ParStreamlines#PARSL_FLAG_RANDOM_OFFSETS FLAG_RANDOM_OFFSETS}</td></tr><tr><td>{@link ParStreamlines#PARSL_FLAG_CURVE_GUIPARSL_FLAG_DES FLAG_CURVE_GUIPARSL_FLAG_DES}</td></tr></table> */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }
    /** one of:<br><table><tr><td>{@link ParStreamlines#PAR_U_MODE_NORMALIZED_DISTANCE}</td><td>{@link ParStreamlines#PAR_U_MODE_DISTANCE}</td><td>{@link ParStreamlines#PAR_U_MODE_SEGMENT_INDEX}</td></tr><tr><td>{@link ParStreamlines#PAR_U_MODE_SEGMENT_FRACTION}</td></tr></table> */
    public int u_mode() { return nu_mode(address()); }
    /** @return the value of the {@code curves_max_flatness} field. */
    public float curves_max_flatness() { return ncurves_max_flatness(address()); }
    /** @return the value of the {@code streamlines_seed_spacing} field. */
    public float streamlines_seed_spacing() { return nstreamlines_seed_spacing(address()); }
    /** @return a {@link ParSLViewport} view of the {@code streamlines_seed_viewport} field. */
    @NativeType("parsl_viewport")
    public ParSLViewport streamlines_seed_viewport() { return nstreamlines_seed_viewport(address()); }
    /** @return the value of the {@code miter_limit} field. */
    public float miter_limit() { return nmiter_limit(address()); }

    /** Sets the specified value to the {@code thickness} field. */
    public ParSLConfig thickness(float value) { nthickness(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public ParSLConfig flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #u_mode} field. */
    public ParSLConfig u_mode(int value) { nu_mode(address(), value); return this; }
    /** Sets the specified value to the {@code curves_max_flatness} field. */
    public ParSLConfig curves_max_flatness(float value) { ncurves_max_flatness(address(), value); return this; }
    /** Sets the specified value to the {@code streamlines_seed_spacing} field. */
    public ParSLConfig streamlines_seed_spacing(float value) { nstreamlines_seed_spacing(address(), value); return this; }
    /** Copies the specified {@link ParSLViewport} to the {@code streamlines_seed_viewport} field. */
    public ParSLConfig streamlines_seed_viewport(@NativeType("parsl_viewport") ParSLViewport value) { nstreamlines_seed_viewport(address(), value); return this; }
    /** Passes the {@code streamlines_seed_viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ParSLConfig streamlines_seed_viewport(java.util.function.Consumer<ParSLViewport> consumer) { consumer.accept(streamlines_seed_viewport()); return this; }
    /** Sets the specified value to the {@code miter_limit} field. */
    public ParSLConfig miter_limit(float value) { nmiter_limit(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ParSLConfig set(
        float thickness,
        int flags,
        int u_mode,
        float curves_max_flatness,
        float streamlines_seed_spacing,
        ParSLViewport streamlines_seed_viewport,
        float miter_limit
    ) {
        thickness(thickness);
        flags(flags);
        u_mode(u_mode);
        curves_max_flatness(curves_max_flatness);
        streamlines_seed_spacing(streamlines_seed_spacing);
        streamlines_seed_viewport(streamlines_seed_viewport);
        miter_limit(miter_limit);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ParSLConfig set(ParSLConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ParSLConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ParSLConfig malloc() {
        return wrap(ParSLConfig.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ParSLConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ParSLConfig calloc() {
        return wrap(ParSLConfig.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ParSLConfig} instance allocated with {@link BufferUtils}. */
    public static ParSLConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ParSLConfig.class, memAddress(container), container);
    }

    /** Returns a new {@code ParSLConfig} instance for the specified memory address. */
    public static ParSLConfig create(long address) {
        return wrap(ParSLConfig.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLConfig createSafe(long address) {
        return address == NULL ? null : wrap(ParSLConfig.class, address);
    }

    /**
     * Returns a new {@link ParSLConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLConfig.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ParSLConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLConfig.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParSLConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ParSLConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParSLConfig.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ParSLConfig mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ParSLConfig callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ParSLConfig mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ParSLConfig callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLConfig.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLConfig.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLConfig.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLConfig.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ParSLConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ParSLConfig malloc(MemoryStack stack) {
        return wrap(ParSLConfig.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ParSLConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ParSLConfig calloc(MemoryStack stack) {
        return wrap(ParSLConfig.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ParSLConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParSLConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParSLConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParSLConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #thickness}. */
    public static float nthickness(long struct) { return UNSAFE.getFloat(null, struct + ParSLConfig.THICKNESS); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + ParSLConfig.FLAGS); }
    /** Unsafe version of {@link #u_mode}. */
    public static int nu_mode(long struct) { return UNSAFE.getInt(null, struct + ParSLConfig.U_MODE); }
    /** Unsafe version of {@link #curves_max_flatness}. */
    public static float ncurves_max_flatness(long struct) { return UNSAFE.getFloat(null, struct + ParSLConfig.CURVES_MAX_FLATNESS); }
    /** Unsafe version of {@link #streamlines_seed_spacing}. */
    public static float nstreamlines_seed_spacing(long struct) { return UNSAFE.getFloat(null, struct + ParSLConfig.STREAMLINES_SEED_SPACING); }
    /** Unsafe version of {@link #streamlines_seed_viewport}. */
    public static ParSLViewport nstreamlines_seed_viewport(long struct) { return ParSLViewport.create(struct + ParSLConfig.STREAMLINES_SEED_VIEWPORT); }
    /** Unsafe version of {@link #miter_limit}. */
    public static float nmiter_limit(long struct) { return UNSAFE.getFloat(null, struct + ParSLConfig.MITER_LIMIT); }

    /** Unsafe version of {@link #thickness(float) thickness}. */
    public static void nthickness(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLConfig.THICKNESS, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + ParSLConfig.FLAGS, value); }
    /** Unsafe version of {@link #u_mode(int) u_mode}. */
    public static void nu_mode(long struct, int value) { UNSAFE.putInt(null, struct + ParSLConfig.U_MODE, value); }
    /** Unsafe version of {@link #curves_max_flatness(float) curves_max_flatness}. */
    public static void ncurves_max_flatness(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLConfig.CURVES_MAX_FLATNESS, value); }
    /** Unsafe version of {@link #streamlines_seed_spacing(float) streamlines_seed_spacing}. */
    public static void nstreamlines_seed_spacing(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLConfig.STREAMLINES_SEED_SPACING, value); }
    /** Unsafe version of {@link #streamlines_seed_viewport(ParSLViewport) streamlines_seed_viewport}. */
    public static void nstreamlines_seed_viewport(long struct, ParSLViewport value) { memCopy(value.address(), struct + ParSLConfig.STREAMLINES_SEED_VIEWPORT, ParSLViewport.SIZEOF); }
    /** Unsafe version of {@link #miter_limit(float) miter_limit}. */
    public static void nmiter_limit(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLConfig.MITER_LIMIT, value); }

    // -----------------------------------

    /** An array of {@link ParSLConfig} structs. */
    public static class Buffer extends StructBuffer<ParSLConfig, Buffer> implements NativeResource {

        private static final ParSLConfig ELEMENT_FACTORY = ParSLConfig.create(-1L);

        /**
         * Creates a new {@code ParSLConfig.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParSLConfig#SIZEOF}, and its mark will be undefined.
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
        protected ParSLConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code thickness} field. */
        public float thickness() { return ParSLConfig.nthickness(address()); }
        /** @return the value of the {@link ParSLConfig#flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ParSLConfig.nflags(address()); }
        /** @return the value of the {@link ParSLConfig#u_mode} field. */
        public int u_mode() { return ParSLConfig.nu_mode(address()); }
        /** @return the value of the {@code curves_max_flatness} field. */
        public float curves_max_flatness() { return ParSLConfig.ncurves_max_flatness(address()); }
        /** @return the value of the {@code streamlines_seed_spacing} field. */
        public float streamlines_seed_spacing() { return ParSLConfig.nstreamlines_seed_spacing(address()); }
        /** @return a {@link ParSLViewport} view of the {@code streamlines_seed_viewport} field. */
        @NativeType("parsl_viewport")
        public ParSLViewport streamlines_seed_viewport() { return ParSLConfig.nstreamlines_seed_viewport(address()); }
        /** @return the value of the {@code miter_limit} field. */
        public float miter_limit() { return ParSLConfig.nmiter_limit(address()); }

        /** Sets the specified value to the {@code thickness} field. */
        public ParSLConfig.Buffer thickness(float value) { ParSLConfig.nthickness(address(), value); return this; }
        /** Sets the specified value to the {@link ParSLConfig#flags} field. */
        public ParSLConfig.Buffer flags(@NativeType("uint32_t") int value) { ParSLConfig.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link ParSLConfig#u_mode} field. */
        public ParSLConfig.Buffer u_mode(int value) { ParSLConfig.nu_mode(address(), value); return this; }
        /** Sets the specified value to the {@code curves_max_flatness} field. */
        public ParSLConfig.Buffer curves_max_flatness(float value) { ParSLConfig.ncurves_max_flatness(address(), value); return this; }
        /** Sets the specified value to the {@code streamlines_seed_spacing} field. */
        public ParSLConfig.Buffer streamlines_seed_spacing(float value) { ParSLConfig.nstreamlines_seed_spacing(address(), value); return this; }
        /** Copies the specified {@link ParSLViewport} to the {@code streamlines_seed_viewport} field. */
        public ParSLConfig.Buffer streamlines_seed_viewport(@NativeType("parsl_viewport") ParSLViewport value) { ParSLConfig.nstreamlines_seed_viewport(address(), value); return this; }
        /** Passes the {@code streamlines_seed_viewport} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ParSLConfig.Buffer streamlines_seed_viewport(java.util.function.Consumer<ParSLViewport> consumer) { consumer.accept(streamlines_seed_viewport()); return this; }
        /** Sets the specified value to the {@code miter_limit} field. */
        public ParSLConfig.Buffer miter_limit(float value) { ParSLConfig.nmiter_limit(address(), value); return this; }

    }

}