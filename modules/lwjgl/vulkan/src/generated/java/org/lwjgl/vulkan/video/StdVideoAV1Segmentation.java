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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*;

/**
 * <pre>{@code
 * struct StdVideoAV1Segmentation {
 *     uint8_t FeatureEnabled[STD_VIDEO_AV1_MAX_SEGMENTS];
 *     int16_t FeatureData[STD_VIDEO_AV1_SEG_LVL_MAX];
 * }}</pre>
 */
public class StdVideoAV1Segmentation extends Struct<StdVideoAV1Segmentation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FEATUREENABLED,
        FEATUREDATA;

    static {
        Layout layout = __struct(
            __array(1, STD_VIDEO_AV1_MAX_SEGMENTS),
            __array(2, STD_VIDEO_AV1_SEG_LVL_MAX)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FEATUREENABLED = layout.offsetof(0);
        FEATUREDATA = layout.offsetof(1);
    }

    protected StdVideoAV1Segmentation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1Segmentation create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1Segmentation(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1Segmentation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1Segmentation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code FeatureEnabled} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]")
    public ByteBuffer FeatureEnabled() { return nFeatureEnabled(address()); }
    /** @return the value at the specified index of the {@code FeatureEnabled} field. */
    @NativeType("uint8_t")
    public byte FeatureEnabled(int index) { return nFeatureEnabled(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code FeatureData} field. */
    @NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]")
    public ShortBuffer FeatureData() { return nFeatureData(address()); }
    /** @return the value at the specified index of the {@code FeatureData} field. */
    @NativeType("int16_t")
    public short FeatureData(int index) { return nFeatureData(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code FeatureEnabled} field. */
    public StdVideoAV1Segmentation FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]") ByteBuffer value) { nFeatureEnabled(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code FeatureEnabled} field. */
    public StdVideoAV1Segmentation FeatureEnabled(int index, @NativeType("uint8_t") byte value) { nFeatureEnabled(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code FeatureData} field. */
    public StdVideoAV1Segmentation FeatureData(@NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]") ShortBuffer value) { nFeatureData(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code FeatureData} field. */
    public StdVideoAV1Segmentation FeatureData(int index, @NativeType("int16_t") short value) { nFeatureData(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1Segmentation set(
        ByteBuffer FeatureEnabled,
        ShortBuffer FeatureData
    ) {
        FeatureEnabled(FeatureEnabled);
        FeatureData(FeatureData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1Segmentation set(StdVideoAV1Segmentation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1Segmentation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1Segmentation malloc() {
        return new StdVideoAV1Segmentation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1Segmentation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1Segmentation calloc() {
        return new StdVideoAV1Segmentation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1Segmentation} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1Segmentation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1Segmentation(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1Segmentation} instance for the specified memory address. */
    public static StdVideoAV1Segmentation create(long address) {
        return new StdVideoAV1Segmentation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1Segmentation createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1Segmentation(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1Segmentation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Segmentation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1Segmentation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Segmentation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1Segmentation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Segmentation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1Segmentation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Segmentation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1Segmentation.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1Segmentation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1Segmentation malloc(MemoryStack stack) {
        return new StdVideoAV1Segmentation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1Segmentation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1Segmentation calloc(MemoryStack stack) {
        return new StdVideoAV1Segmentation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1Segmentation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Segmentation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1Segmentation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Segmentation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FeatureEnabled}. */
    public static ByteBuffer nFeatureEnabled(long struct) { return memByteBuffer(struct + StdVideoAV1Segmentation.FEATUREENABLED, STD_VIDEO_AV1_MAX_SEGMENTS); }
    /** Unsafe version of {@link #FeatureEnabled(int) FeatureEnabled}. */
    public static byte nFeatureEnabled(long struct, int index) {
        return memGetByte(struct + StdVideoAV1Segmentation.FEATUREENABLED + check(index, STD_VIDEO_AV1_MAX_SEGMENTS) * 1);
    }
    /** Unsafe version of {@link #FeatureData}. */
    public static ShortBuffer nFeatureData(long struct) { return memShortBuffer(struct + StdVideoAV1Segmentation.FEATUREDATA, STD_VIDEO_AV1_SEG_LVL_MAX); }
    /** Unsafe version of {@link #FeatureData(int) FeatureData}. */
    public static short nFeatureData(long struct, int index) {
        return memGetShort(struct + StdVideoAV1Segmentation.FEATUREDATA + check(index, STD_VIDEO_AV1_SEG_LVL_MAX) * 2);
    }

    /** Unsafe version of {@link #FeatureEnabled(ByteBuffer) FeatureEnabled}. */
    public static void nFeatureEnabled(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_SEGMENTS); }
        memCopy(memAddress(value), struct + StdVideoAV1Segmentation.FEATUREENABLED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #FeatureEnabled(int, byte) FeatureEnabled}. */
    public static void nFeatureEnabled(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1Segmentation.FEATUREENABLED + check(index, STD_VIDEO_AV1_MAX_SEGMENTS) * 1, value);
    }
    /** Unsafe version of {@link #FeatureData(ShortBuffer) FeatureData}. */
    public static void nFeatureData(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_SEG_LVL_MAX); }
        memCopy(memAddress(value), struct + StdVideoAV1Segmentation.FEATUREDATA, value.remaining() * 2);
    }
    /** Unsafe version of {@link #FeatureData(int, short) FeatureData}. */
    public static void nFeatureData(long struct, int index, short value) {
        memPutShort(struct + StdVideoAV1Segmentation.FEATUREDATA + check(index, STD_VIDEO_AV1_SEG_LVL_MAX) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1Segmentation} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1Segmentation, Buffer> implements NativeResource {

        private static final StdVideoAV1Segmentation ELEMENT_FACTORY = StdVideoAV1Segmentation.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1Segmentation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1Segmentation#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1Segmentation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code FeatureEnabled} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]")
        public ByteBuffer FeatureEnabled() { return StdVideoAV1Segmentation.nFeatureEnabled(address()); }
        /** @return the value at the specified index of the {@code FeatureEnabled} field. */
        @NativeType("uint8_t")
        public byte FeatureEnabled(int index) { return StdVideoAV1Segmentation.nFeatureEnabled(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code FeatureData} field. */
        @NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]")
        public ShortBuffer FeatureData() { return StdVideoAV1Segmentation.nFeatureData(address()); }
        /** @return the value at the specified index of the {@code FeatureData} field. */
        @NativeType("int16_t")
        public short FeatureData(int index) { return StdVideoAV1Segmentation.nFeatureData(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code FeatureEnabled} field. */
        public StdVideoAV1Segmentation.Buffer FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_AV1_MAX_SEGMENTS]") ByteBuffer value) { StdVideoAV1Segmentation.nFeatureEnabled(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code FeatureEnabled} field. */
        public StdVideoAV1Segmentation.Buffer FeatureEnabled(int index, @NativeType("uint8_t") byte value) { StdVideoAV1Segmentation.nFeatureEnabled(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code FeatureData} field. */
        public StdVideoAV1Segmentation.Buffer FeatureData(@NativeType("int16_t[STD_VIDEO_AV1_SEG_LVL_MAX]") ShortBuffer value) { StdVideoAV1Segmentation.nFeatureData(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code FeatureData} field. */
        public StdVideoAV1Segmentation.Buffer FeatureData(int index, @NativeType("int16_t") short value) { StdVideoAV1Segmentation.nFeatureData(address(), index, value); return this; }

    }

}