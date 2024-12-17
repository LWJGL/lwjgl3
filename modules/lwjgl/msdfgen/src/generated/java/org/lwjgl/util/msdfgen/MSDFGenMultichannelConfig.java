/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct msdf_multichannel_config {
 *     int overlap_support;
 *     int mode;
 *     int distance_check_mode;
 *     double min_deviation_ratio;
 *     double min_improve_ratio;
 * }}</pre>
 */
@NativeType("struct msdf_multichannel_config")
public class MSDFGenMultichannelConfig extends Struct<MSDFGenMultichannelConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OVERLAP_SUPPORT,
        MODE,
        DISTANCE_CHECK_MODE,
        MIN_DEVIATION_RATIO,
        MIN_IMPROVE_RATIO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OVERLAP_SUPPORT = layout.offsetof(0);
        MODE = layout.offsetof(1);
        DISTANCE_CHECK_MODE = layout.offsetof(2);
        MIN_DEVIATION_RATIO = layout.offsetof(3);
        MIN_IMPROVE_RATIO = layout.offsetof(4);
    }

    protected MSDFGenMultichannelConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenMultichannelConfig create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenMultichannelConfig(address, container);
    }

    /**
     * Creates a {@code MSDFGenMultichannelConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenMultichannelConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code overlap_support} field. */
    public int overlap_support() { return noverlap_support(address()); }
    /** @return the value of the {@code mode} field. */
    public int mode() { return nmode(address()); }
    /** @return the value of the {@code distance_check_mode} field. */
    public int distance_check_mode() { return ndistance_check_mode(address()); }
    /** @return the value of the {@code min_deviation_ratio} field. */
    public double min_deviation_ratio() { return nmin_deviation_ratio(address()); }
    /** @return the value of the {@code min_improve_ratio} field. */
    public double min_improve_ratio() { return nmin_improve_ratio(address()); }

    /** Sets the specified value to the {@code overlap_support} field. */
    public MSDFGenMultichannelConfig overlap_support(int value) { noverlap_support(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public MSDFGenMultichannelConfig mode(int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code distance_check_mode} field. */
    public MSDFGenMultichannelConfig distance_check_mode(int value) { ndistance_check_mode(address(), value); return this; }
    /** Sets the specified value to the {@code min_deviation_ratio} field. */
    public MSDFGenMultichannelConfig min_deviation_ratio(double value) { nmin_deviation_ratio(address(), value); return this; }
    /** Sets the specified value to the {@code min_improve_ratio} field. */
    public MSDFGenMultichannelConfig min_improve_ratio(double value) { nmin_improve_ratio(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenMultichannelConfig set(
        int overlap_support,
        int mode,
        int distance_check_mode,
        double min_deviation_ratio,
        double min_improve_ratio
    ) {
        overlap_support(overlap_support);
        mode(mode);
        distance_check_mode(distance_check_mode);
        min_deviation_ratio(min_deviation_ratio);
        min_improve_ratio(min_improve_ratio);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenMultichannelConfig set(MSDFGenMultichannelConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenMultichannelConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenMultichannelConfig malloc() {
        return new MSDFGenMultichannelConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenMultichannelConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenMultichannelConfig calloc() {
        return new MSDFGenMultichannelConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenMultichannelConfig} instance allocated with {@link BufferUtils}. */
    public static MSDFGenMultichannelConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenMultichannelConfig(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenMultichannelConfig} instance for the specified memory address. */
    public static MSDFGenMultichannelConfig create(long address) {
        return new MSDFGenMultichannelConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MSDFGenMultichannelConfig createSafe(long address) {
        return address == NULL ? null : new MSDFGenMultichannelConfig(address, null);
    }

    /**
     * Returns a new {@link MSDFGenMultichannelConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenMultichannelConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenMultichannelConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenMultichannelConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenMultichannelConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenMultichannelConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenMultichannelConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenMultichannelConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MSDFGenMultichannelConfig.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenMultichannelConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenMultichannelConfig malloc(MemoryStack stack) {
        return new MSDFGenMultichannelConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenMultichannelConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenMultichannelConfig calloc(MemoryStack stack) {
        return new MSDFGenMultichannelConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenMultichannelConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenMultichannelConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenMultichannelConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenMultichannelConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlap_support}. */
    public static int noverlap_support(long struct) { return memGetInt(struct + MSDFGenMultichannelConfig.OVERLAP_SUPPORT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + MSDFGenMultichannelConfig.MODE); }
    /** Unsafe version of {@link #distance_check_mode}. */
    public static int ndistance_check_mode(long struct) { return memGetInt(struct + MSDFGenMultichannelConfig.DISTANCE_CHECK_MODE); }
    /** Unsafe version of {@link #min_deviation_ratio}. */
    public static double nmin_deviation_ratio(long struct) { return memGetDouble(struct + MSDFGenMultichannelConfig.MIN_DEVIATION_RATIO); }
    /** Unsafe version of {@link #min_improve_ratio}. */
    public static double nmin_improve_ratio(long struct) { return memGetDouble(struct + MSDFGenMultichannelConfig.MIN_IMPROVE_RATIO); }

    /** Unsafe version of {@link #overlap_support(int) overlap_support}. */
    public static void noverlap_support(long struct, int value) { memPutInt(struct + MSDFGenMultichannelConfig.OVERLAP_SUPPORT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + MSDFGenMultichannelConfig.MODE, value); }
    /** Unsafe version of {@link #distance_check_mode(int) distance_check_mode}. */
    public static void ndistance_check_mode(long struct, int value) { memPutInt(struct + MSDFGenMultichannelConfig.DISTANCE_CHECK_MODE, value); }
    /** Unsafe version of {@link #min_deviation_ratio(double) min_deviation_ratio}. */
    public static void nmin_deviation_ratio(long struct, double value) { memPutDouble(struct + MSDFGenMultichannelConfig.MIN_DEVIATION_RATIO, value); }
    /** Unsafe version of {@link #min_improve_ratio(double) min_improve_ratio}. */
    public static void nmin_improve_ratio(long struct, double value) { memPutDouble(struct + MSDFGenMultichannelConfig.MIN_IMPROVE_RATIO, value); }

    // -----------------------------------

    /** An array of {@link MSDFGenMultichannelConfig} structs. */
    public static class Buffer extends StructBuffer<MSDFGenMultichannelConfig, Buffer> implements NativeResource {

        private static final MSDFGenMultichannelConfig ELEMENT_FACTORY = MSDFGenMultichannelConfig.create(-1L);

        /**
         * Creates a new {@code MSDFGenMultichannelConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenMultichannelConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenMultichannelConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code overlap_support} field. */
        public int overlap_support() { return MSDFGenMultichannelConfig.noverlap_support(address()); }
        /** @return the value of the {@code mode} field. */
        public int mode() { return MSDFGenMultichannelConfig.nmode(address()); }
        /** @return the value of the {@code distance_check_mode} field. */
        public int distance_check_mode() { return MSDFGenMultichannelConfig.ndistance_check_mode(address()); }
        /** @return the value of the {@code min_deviation_ratio} field. */
        public double min_deviation_ratio() { return MSDFGenMultichannelConfig.nmin_deviation_ratio(address()); }
        /** @return the value of the {@code min_improve_ratio} field. */
        public double min_improve_ratio() { return MSDFGenMultichannelConfig.nmin_improve_ratio(address()); }

        /** Sets the specified value to the {@code overlap_support} field. */
        public MSDFGenMultichannelConfig.Buffer overlap_support(int value) { MSDFGenMultichannelConfig.noverlap_support(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public MSDFGenMultichannelConfig.Buffer mode(int value) { MSDFGenMultichannelConfig.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code distance_check_mode} field. */
        public MSDFGenMultichannelConfig.Buffer distance_check_mode(int value) { MSDFGenMultichannelConfig.ndistance_check_mode(address(), value); return this; }
        /** Sets the specified value to the {@code min_deviation_ratio} field. */
        public MSDFGenMultichannelConfig.Buffer min_deviation_ratio(double value) { MSDFGenMultichannelConfig.nmin_deviation_ratio(address(), value); return this; }
        /** Sets the specified value to the {@code min_improve_ratio} field. */
        public MSDFGenMultichannelConfig.Buffer min_improve_ratio(double value) { MSDFGenMultichannelConfig.nmin_improve_ratio(address(), value); return this; }

    }

}