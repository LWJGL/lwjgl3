/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoAV1ColorConfig {
 *     {@link StdVideoAV1ColorConfigFlags StdVideoAV1ColorConfigFlags} flags;
 *     uint8_t BitDepth;
 *     uint8_t subsampling_x;
 *     uint8_t subsampling_y;
 *     uint8_t reserved1;
 *     StdVideoAV1ColorPrimaries color_primaries;
 *     StdVideoAV1TransferCharacteristics transfer_characteristics;
 *     StdVideoAV1MatrixCoefficients matrix_coefficients;
 *     StdVideoAV1ChromaSamplePosition chroma_sample_position;
 * }}</pre>
 */
public class StdVideoAV1ColorConfig extends Struct<StdVideoAV1ColorConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        BITDEPTH,
        SUBSAMPLING_X,
        SUBSAMPLING_Y,
        RESERVED1,
        COLOR_PRIMARIES,
        TRANSFER_CHARACTERISTICS,
        MATRIX_COEFFICIENTS,
        CHROMA_SAMPLE_POSITION;

    static {
        Layout layout = __struct(
            __member(StdVideoAV1ColorConfigFlags.SIZEOF, StdVideoAV1ColorConfigFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        BITDEPTH = layout.offsetof(1);
        SUBSAMPLING_X = layout.offsetof(2);
        SUBSAMPLING_Y = layout.offsetof(3);
        RESERVED1 = layout.offsetof(4);
        COLOR_PRIMARIES = layout.offsetof(5);
        TRANSFER_CHARACTERISTICS = layout.offsetof(6);
        MATRIX_COEFFICIENTS = layout.offsetof(7);
        CHROMA_SAMPLE_POSITION = layout.offsetof(8);
    }

    protected StdVideoAV1ColorConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1ColorConfig create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1ColorConfig(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1ColorConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1ColorConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1ColorConfigFlags} view of the {@code flags} field. */
    public StdVideoAV1ColorConfigFlags flags() { return nflags(address()); }
    /** @return the value of the {@code BitDepth} field. */
    @NativeType("uint8_t")
    public byte BitDepth() { return nBitDepth(address()); }
    /** @return the value of the {@code subsampling_x} field. */
    @NativeType("uint8_t")
    public byte subsampling_x() { return nsubsampling_x(address()); }
    /** @return the value of the {@code subsampling_y} field. */
    @NativeType("uint8_t")
    public byte subsampling_y() { return nsubsampling_y(address()); }
    /** @return the value of the {@code color_primaries} field. */
    @NativeType("StdVideoAV1ColorPrimaries")
    public int color_primaries() { return ncolor_primaries(address()); }
    /** @return the value of the {@code transfer_characteristics} field. */
    @NativeType("StdVideoAV1TransferCharacteristics")
    public int transfer_characteristics() { return ntransfer_characteristics(address()); }
    /** @return the value of the {@code matrix_coefficients} field. */
    @NativeType("StdVideoAV1MatrixCoefficients")
    public int matrix_coefficients() { return nmatrix_coefficients(address()); }
    /** @return the value of the {@code chroma_sample_position} field. */
    @NativeType("StdVideoAV1ChromaSamplePosition")
    public int chroma_sample_position() { return nchroma_sample_position(address()); }

    /** Copies the specified {@link StdVideoAV1ColorConfigFlags} to the {@code flags} field. */
    public StdVideoAV1ColorConfig flags(StdVideoAV1ColorConfigFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1ColorConfig flags(java.util.function.Consumer<StdVideoAV1ColorConfigFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code BitDepth} field. */
    public StdVideoAV1ColorConfig BitDepth(@NativeType("uint8_t") byte value) { nBitDepth(address(), value); return this; }
    /** Sets the specified value to the {@code subsampling_x} field. */
    public StdVideoAV1ColorConfig subsampling_x(@NativeType("uint8_t") byte value) { nsubsampling_x(address(), value); return this; }
    /** Sets the specified value to the {@code subsampling_y} field. */
    public StdVideoAV1ColorConfig subsampling_y(@NativeType("uint8_t") byte value) { nsubsampling_y(address(), value); return this; }
    /** Sets the specified value to the {@code color_primaries} field. */
    public StdVideoAV1ColorConfig color_primaries(@NativeType("StdVideoAV1ColorPrimaries") int value) { ncolor_primaries(address(), value); return this; }
    /** Sets the specified value to the {@code transfer_characteristics} field. */
    public StdVideoAV1ColorConfig transfer_characteristics(@NativeType("StdVideoAV1TransferCharacteristics") int value) { ntransfer_characteristics(address(), value); return this; }
    /** Sets the specified value to the {@code matrix_coefficients} field. */
    public StdVideoAV1ColorConfig matrix_coefficients(@NativeType("StdVideoAV1MatrixCoefficients") int value) { nmatrix_coefficients(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_sample_position} field. */
    public StdVideoAV1ColorConfig chroma_sample_position(@NativeType("StdVideoAV1ChromaSamplePosition") int value) { nchroma_sample_position(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1ColorConfig set(
        StdVideoAV1ColorConfigFlags flags,
        byte BitDepth,
        byte subsampling_x,
        byte subsampling_y,
        int color_primaries,
        int transfer_characteristics,
        int matrix_coefficients,
        int chroma_sample_position
    ) {
        flags(flags);
        BitDepth(BitDepth);
        subsampling_x(subsampling_x);
        subsampling_y(subsampling_y);
        color_primaries(color_primaries);
        transfer_characteristics(transfer_characteristics);
        matrix_coefficients(matrix_coefficients);
        chroma_sample_position(chroma_sample_position);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1ColorConfig set(StdVideoAV1ColorConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1ColorConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1ColorConfig malloc() {
        return new StdVideoAV1ColorConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1ColorConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1ColorConfig calloc() {
        return new StdVideoAV1ColorConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1ColorConfig} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1ColorConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1ColorConfig(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1ColorConfig} instance for the specified memory address. */
    public static StdVideoAV1ColorConfig create(long address) {
        return new StdVideoAV1ColorConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1ColorConfig createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1ColorConfig(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1ColorConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1ColorConfig.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1ColorConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1ColorConfig malloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1ColorConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1ColorConfig calloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1ColorConfigFlags nflags(long struct) { return StdVideoAV1ColorConfigFlags.create(struct + StdVideoAV1ColorConfig.FLAGS); }
    /** Unsafe version of {@link #BitDepth}. */
    public static byte nBitDepth(long struct) { return memGetByte(struct + StdVideoAV1ColorConfig.BITDEPTH); }
    /** Unsafe version of {@link #subsampling_x}. */
    public static byte nsubsampling_x(long struct) { return memGetByte(struct + StdVideoAV1ColorConfig.SUBSAMPLING_X); }
    /** Unsafe version of {@link #subsampling_y}. */
    public static byte nsubsampling_y(long struct) { return memGetByte(struct + StdVideoAV1ColorConfig.SUBSAMPLING_Y); }
    public static byte nreserved1(long struct) { return memGetByte(struct + StdVideoAV1ColorConfig.RESERVED1); }
    /** Unsafe version of {@link #color_primaries}. */
    public static int ncolor_primaries(long struct) { return memGetInt(struct + StdVideoAV1ColorConfig.COLOR_PRIMARIES); }
    /** Unsafe version of {@link #transfer_characteristics}. */
    public static int ntransfer_characteristics(long struct) { return memGetInt(struct + StdVideoAV1ColorConfig.TRANSFER_CHARACTERISTICS); }
    /** Unsafe version of {@link #matrix_coefficients}. */
    public static int nmatrix_coefficients(long struct) { return memGetInt(struct + StdVideoAV1ColorConfig.MATRIX_COEFFICIENTS); }
    /** Unsafe version of {@link #chroma_sample_position}. */
    public static int nchroma_sample_position(long struct) { return memGetInt(struct + StdVideoAV1ColorConfig.CHROMA_SAMPLE_POSITION); }

    /** Unsafe version of {@link #flags(StdVideoAV1ColorConfigFlags) flags}. */
    public static void nflags(long struct, StdVideoAV1ColorConfigFlags value) { memCopy(value.address(), struct + StdVideoAV1ColorConfig.FLAGS, StdVideoAV1ColorConfigFlags.SIZEOF); }
    /** Unsafe version of {@link #BitDepth(byte) BitDepth}. */
    public static void nBitDepth(long struct, byte value) { memPutByte(struct + StdVideoAV1ColorConfig.BITDEPTH, value); }
    /** Unsafe version of {@link #subsampling_x(byte) subsampling_x}. */
    public static void nsubsampling_x(long struct, byte value) { memPutByte(struct + StdVideoAV1ColorConfig.SUBSAMPLING_X, value); }
    /** Unsafe version of {@link #subsampling_y(byte) subsampling_y}. */
    public static void nsubsampling_y(long struct, byte value) { memPutByte(struct + StdVideoAV1ColorConfig.SUBSAMPLING_Y, value); }
    public static void nreserved1(long struct, byte value) { memPutByte(struct + StdVideoAV1ColorConfig.RESERVED1, value); }
    /** Unsafe version of {@link #color_primaries(int) color_primaries}. */
    public static void ncolor_primaries(long struct, int value) { memPutInt(struct + StdVideoAV1ColorConfig.COLOR_PRIMARIES, value); }
    /** Unsafe version of {@link #transfer_characteristics(int) transfer_characteristics}. */
    public static void ntransfer_characteristics(long struct, int value) { memPutInt(struct + StdVideoAV1ColorConfig.TRANSFER_CHARACTERISTICS, value); }
    /** Unsafe version of {@link #matrix_coefficients(int) matrix_coefficients}. */
    public static void nmatrix_coefficients(long struct, int value) { memPutInt(struct + StdVideoAV1ColorConfig.MATRIX_COEFFICIENTS, value); }
    /** Unsafe version of {@link #chroma_sample_position(int) chroma_sample_position}. */
    public static void nchroma_sample_position(long struct, int value) { memPutInt(struct + StdVideoAV1ColorConfig.CHROMA_SAMPLE_POSITION, value); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1ColorConfig} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1ColorConfig, Buffer> implements NativeResource {

        private static final StdVideoAV1ColorConfig ELEMENT_FACTORY = StdVideoAV1ColorConfig.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1ColorConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1ColorConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1ColorConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1ColorConfigFlags} view of the {@code flags} field. */
        public StdVideoAV1ColorConfigFlags flags() { return StdVideoAV1ColorConfig.nflags(address()); }
        /** @return the value of the {@code BitDepth} field. */
        @NativeType("uint8_t")
        public byte BitDepth() { return StdVideoAV1ColorConfig.nBitDepth(address()); }
        /** @return the value of the {@code subsampling_x} field. */
        @NativeType("uint8_t")
        public byte subsampling_x() { return StdVideoAV1ColorConfig.nsubsampling_x(address()); }
        /** @return the value of the {@code subsampling_y} field. */
        @NativeType("uint8_t")
        public byte subsampling_y() { return StdVideoAV1ColorConfig.nsubsampling_y(address()); }
        /** @return the value of the {@code color_primaries} field. */
        @NativeType("StdVideoAV1ColorPrimaries")
        public int color_primaries() { return StdVideoAV1ColorConfig.ncolor_primaries(address()); }
        /** @return the value of the {@code transfer_characteristics} field. */
        @NativeType("StdVideoAV1TransferCharacteristics")
        public int transfer_characteristics() { return StdVideoAV1ColorConfig.ntransfer_characteristics(address()); }
        /** @return the value of the {@code matrix_coefficients} field. */
        @NativeType("StdVideoAV1MatrixCoefficients")
        public int matrix_coefficients() { return StdVideoAV1ColorConfig.nmatrix_coefficients(address()); }
        /** @return the value of the {@code chroma_sample_position} field. */
        @NativeType("StdVideoAV1ChromaSamplePosition")
        public int chroma_sample_position() { return StdVideoAV1ColorConfig.nchroma_sample_position(address()); }

        /** Copies the specified {@link StdVideoAV1ColorConfigFlags} to the {@code flags} field. */
        public StdVideoAV1ColorConfig.Buffer flags(StdVideoAV1ColorConfigFlags value) { StdVideoAV1ColorConfig.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1ColorConfig.Buffer flags(java.util.function.Consumer<StdVideoAV1ColorConfigFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code BitDepth} field. */
        public StdVideoAV1ColorConfig.Buffer BitDepth(@NativeType("uint8_t") byte value) { StdVideoAV1ColorConfig.nBitDepth(address(), value); return this; }
        /** Sets the specified value to the {@code subsampling_x} field. */
        public StdVideoAV1ColorConfig.Buffer subsampling_x(@NativeType("uint8_t") byte value) { StdVideoAV1ColorConfig.nsubsampling_x(address(), value); return this; }
        /** Sets the specified value to the {@code subsampling_y} field. */
        public StdVideoAV1ColorConfig.Buffer subsampling_y(@NativeType("uint8_t") byte value) { StdVideoAV1ColorConfig.nsubsampling_y(address(), value); return this; }
        /** Sets the specified value to the {@code color_primaries} field. */
        public StdVideoAV1ColorConfig.Buffer color_primaries(@NativeType("StdVideoAV1ColorPrimaries") int value) { StdVideoAV1ColorConfig.ncolor_primaries(address(), value); return this; }
        /** Sets the specified value to the {@code transfer_characteristics} field. */
        public StdVideoAV1ColorConfig.Buffer transfer_characteristics(@NativeType("StdVideoAV1TransferCharacteristics") int value) { StdVideoAV1ColorConfig.ntransfer_characteristics(address(), value); return this; }
        /** Sets the specified value to the {@code matrix_coefficients} field. */
        public StdVideoAV1ColorConfig.Buffer matrix_coefficients(@NativeType("StdVideoAV1MatrixCoefficients") int value) { StdVideoAV1ColorConfig.nmatrix_coefficients(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_sample_position} field. */
        public StdVideoAV1ColorConfig.Buffer chroma_sample_position(@NativeType("StdVideoAV1ChromaSamplePosition") int value) { StdVideoAV1ColorConfig.nchroma_sample_position(address(), value); return this; }

    }

}