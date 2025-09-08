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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecVP9.*;

/**
 * <pre><code>
 * struct StdVideoVP9Segmentation {
 *     {@link StdVideoVP9SegmentationFlags StdVideoVP9SegmentationFlags} flags;
 *     uint8_t segmentation_tree_probs[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS];
 *     uint8_t segmentation_pred_prob[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB];
 *     uint8_t FeatureEnabled[STD_VIDEO_VP9_MAX_SEGMENTS];
 *     int16_t FeatureData[STD_VIDEO_VP9_SEG_LVL_MAX];
 * }</code></pre>
 */
public class StdVideoVP9Segmentation extends Struct<StdVideoVP9Segmentation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        SEGMENTATION_TREE_PROBS,
        SEGMENTATION_PRED_PROB,
        FEATUREENABLED,
        FEATUREDATA;

    static {
        Layout layout = __struct(
            __member(StdVideoVP9SegmentationFlags.SIZEOF, StdVideoVP9SegmentationFlags.ALIGNOF),
            __array(1, STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS),
            __array(1, STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB),
            __array(1, STD_VIDEO_VP9_MAX_SEGMENTS),
            __array(2, STD_VIDEO_VP9_SEG_LVL_MAX)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        SEGMENTATION_TREE_PROBS = layout.offsetof(1);
        SEGMENTATION_PRED_PROB = layout.offsetof(2);
        FEATUREENABLED = layout.offsetof(3);
        FEATUREDATA = layout.offsetof(4);
    }

    protected StdVideoVP9Segmentation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoVP9Segmentation create(long address, @Nullable ByteBuffer container) {
        return new StdVideoVP9Segmentation(address, container);
    }

    /**
     * Creates a {@code StdVideoVP9Segmentation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoVP9Segmentation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoVP9SegmentationFlags} view of the {@code flags} field. */
    public StdVideoVP9SegmentationFlags flags() { return nflags(address()); }
    /** @return a {@link ByteBuffer} view of the {@code segmentation_tree_probs} field. */
    @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]")
    public ByteBuffer segmentation_tree_probs() { return nsegmentation_tree_probs(address()); }
    /** @return the value at the specified index of the {@code segmentation_tree_probs} field. */
    @NativeType("uint8_t")
    public byte segmentation_tree_probs(int index) { return nsegmentation_tree_probs(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code segmentation_pred_prob} field. */
    @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]")
    public ByteBuffer segmentation_pred_prob() { return nsegmentation_pred_prob(address()); }
    /** @return the value at the specified index of the {@code segmentation_pred_prob} field. */
    @NativeType("uint8_t")
    public byte segmentation_pred_prob(int index) { return nsegmentation_pred_prob(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code FeatureEnabled} field. */
    @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]")
    public ByteBuffer FeatureEnabled() { return nFeatureEnabled(address()); }
    /** @return the value at the specified index of the {@code FeatureEnabled} field. */
    @NativeType("uint8_t")
    public byte FeatureEnabled(int index) { return nFeatureEnabled(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code FeatureData} field. */
    @NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]")
    public ShortBuffer FeatureData() { return nFeatureData(address()); }
    /** @return the value at the specified index of the {@code FeatureData} field. */
    @NativeType("int16_t")
    public short FeatureData(int index) { return nFeatureData(address(), index); }

    /** Copies the specified {@link StdVideoVP9SegmentationFlags} to the {@code flags} field. */
    public StdVideoVP9Segmentation flags(StdVideoVP9SegmentationFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoVP9Segmentation flags(java.util.function.Consumer<StdVideoVP9SegmentationFlags> consumer) { consumer.accept(flags()); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code segmentation_tree_probs} field. */
    public StdVideoVP9Segmentation segmentation_tree_probs(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]") ByteBuffer value) { nsegmentation_tree_probs(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code segmentation_tree_probs} field. */
    public StdVideoVP9Segmentation segmentation_tree_probs(int index, @NativeType("uint8_t") byte value) { nsegmentation_tree_probs(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code segmentation_pred_prob} field. */
    public StdVideoVP9Segmentation segmentation_pred_prob(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]") ByteBuffer value) { nsegmentation_pred_prob(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code segmentation_pred_prob} field. */
    public StdVideoVP9Segmentation segmentation_pred_prob(int index, @NativeType("uint8_t") byte value) { nsegmentation_pred_prob(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code FeatureEnabled} field. */
    public StdVideoVP9Segmentation FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]") ByteBuffer value) { nFeatureEnabled(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code FeatureEnabled} field. */
    public StdVideoVP9Segmentation FeatureEnabled(int index, @NativeType("uint8_t") byte value) { nFeatureEnabled(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code FeatureData} field. */
    public StdVideoVP9Segmentation FeatureData(@NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]") ShortBuffer value) { nFeatureData(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code FeatureData} field. */
    public StdVideoVP9Segmentation FeatureData(int index, @NativeType("int16_t") short value) { nFeatureData(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoVP9Segmentation set(
        StdVideoVP9SegmentationFlags flags,
        ByteBuffer segmentation_tree_probs,
        ByteBuffer segmentation_pred_prob,
        ByteBuffer FeatureEnabled,
        ShortBuffer FeatureData
    ) {
        flags(flags);
        segmentation_tree_probs(segmentation_tree_probs);
        segmentation_pred_prob(segmentation_pred_prob);
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
    public StdVideoVP9Segmentation set(StdVideoVP9Segmentation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoVP9Segmentation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoVP9Segmentation malloc() {
        return new StdVideoVP9Segmentation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9Segmentation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoVP9Segmentation calloc() {
        return new StdVideoVP9Segmentation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9Segmentation} instance allocated with {@link BufferUtils}. */
    public static StdVideoVP9Segmentation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9Segmentation(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoVP9Segmentation} instance for the specified memory address. */
    public static StdVideoVP9Segmentation create(long address) {
        return new StdVideoVP9Segmentation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoVP9Segmentation createSafe(long address) {
        return address == NULL ? null : new StdVideoVP9Segmentation(address, null);
    }

    /**
     * Returns a new {@link StdVideoVP9Segmentation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9Segmentation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9Segmentation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9Segmentation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9Segmentation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9Segmentation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoVP9Segmentation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9Segmentation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoVP9Segmentation.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoVP9Segmentation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9Segmentation malloc(MemoryStack stack) {
        return new StdVideoVP9Segmentation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoVP9Segmentation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9Segmentation calloc(MemoryStack stack) {
        return new StdVideoVP9Segmentation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoVP9Segmentation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9Segmentation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9Segmentation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9Segmentation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoVP9SegmentationFlags nflags(long struct) { return StdVideoVP9SegmentationFlags.create(struct + StdVideoVP9Segmentation.FLAGS); }
    /** Unsafe version of {@link #segmentation_tree_probs}. */
    public static ByteBuffer nsegmentation_tree_probs(long struct) { return memByteBuffer(struct + StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS, STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS); }
    /** Unsafe version of {@link #segmentation_tree_probs(int) segmentation_tree_probs}. */
    public static byte nsegmentation_tree_probs(long struct, int index) {
        return memGetByte(struct + StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS + check(index, STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS) * 1);
    }
    /** Unsafe version of {@link #segmentation_pred_prob}. */
    public static ByteBuffer nsegmentation_pred_prob(long struct) { return memByteBuffer(struct + StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB, STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB); }
    /** Unsafe version of {@link #segmentation_pred_prob(int) segmentation_pred_prob}. */
    public static byte nsegmentation_pred_prob(long struct, int index) {
        return memGetByte(struct + StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB + check(index, STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB) * 1);
    }
    /** Unsafe version of {@link #FeatureEnabled}. */
    public static ByteBuffer nFeatureEnabled(long struct) { return memByteBuffer(struct + StdVideoVP9Segmentation.FEATUREENABLED, STD_VIDEO_VP9_MAX_SEGMENTS); }
    /** Unsafe version of {@link #FeatureEnabled(int) FeatureEnabled}. */
    public static byte nFeatureEnabled(long struct, int index) {
        return memGetByte(struct + StdVideoVP9Segmentation.FEATUREENABLED + check(index, STD_VIDEO_VP9_MAX_SEGMENTS) * 1);
    }
    /** Unsafe version of {@link #FeatureData}. */
    public static ShortBuffer nFeatureData(long struct) { return memShortBuffer(struct + StdVideoVP9Segmentation.FEATUREDATA, STD_VIDEO_VP9_SEG_LVL_MAX); }
    /** Unsafe version of {@link #FeatureData(int) FeatureData}. */
    public static short nFeatureData(long struct, int index) {
        return memGetShort(struct + StdVideoVP9Segmentation.FEATUREDATA + check(index, STD_VIDEO_VP9_SEG_LVL_MAX) * 2);
    }

    /** Unsafe version of {@link #flags(StdVideoVP9SegmentationFlags) flags}. */
    public static void nflags(long struct, StdVideoVP9SegmentationFlags value) { memCopy(value.address(), struct + StdVideoVP9Segmentation.FLAGS, StdVideoVP9SegmentationFlags.SIZEOF); }
    /** Unsafe version of {@link #segmentation_tree_probs(ByteBuffer) segmentation_tree_probs}. */
    public static void nsegmentation_tree_probs(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS); }
        memCopy(memAddress(value), struct + StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #segmentation_tree_probs(int, byte) segmentation_tree_probs}. */
    public static void nsegmentation_tree_probs(long struct, int index, byte value) {
        memPutByte(struct + StdVideoVP9Segmentation.SEGMENTATION_TREE_PROBS + check(index, STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS) * 1, value);
    }
    /** Unsafe version of {@link #segmentation_pred_prob(ByteBuffer) segmentation_pred_prob}. */
    public static void nsegmentation_pred_prob(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB); }
        memCopy(memAddress(value), struct + StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB, value.remaining() * 1);
    }
    /** Unsafe version of {@link #segmentation_pred_prob(int, byte) segmentation_pred_prob}. */
    public static void nsegmentation_pred_prob(long struct, int index, byte value) {
        memPutByte(struct + StdVideoVP9Segmentation.SEGMENTATION_PRED_PROB + check(index, STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB) * 1, value);
    }
    /** Unsafe version of {@link #FeatureEnabled(ByteBuffer) FeatureEnabled}. */
    public static void nFeatureEnabled(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_VP9_MAX_SEGMENTS); }
        memCopy(memAddress(value), struct + StdVideoVP9Segmentation.FEATUREENABLED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #FeatureEnabled(int, byte) FeatureEnabled}. */
    public static void nFeatureEnabled(long struct, int index, byte value) {
        memPutByte(struct + StdVideoVP9Segmentation.FEATUREENABLED + check(index, STD_VIDEO_VP9_MAX_SEGMENTS) * 1, value);
    }
    /** Unsafe version of {@link #FeatureData(ShortBuffer) FeatureData}. */
    public static void nFeatureData(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_VP9_SEG_LVL_MAX); }
        memCopy(memAddress(value), struct + StdVideoVP9Segmentation.FEATUREDATA, value.remaining() * 2);
    }
    /** Unsafe version of {@link #FeatureData(int, short) FeatureData}. */
    public static void nFeatureData(long struct, int index, short value) {
        memPutShort(struct + StdVideoVP9Segmentation.FEATUREDATA + check(index, STD_VIDEO_VP9_SEG_LVL_MAX) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoVP9Segmentation} structs. */
    public static class Buffer extends StructBuffer<StdVideoVP9Segmentation, Buffer> implements NativeResource {

        private static final StdVideoVP9Segmentation ELEMENT_FACTORY = StdVideoVP9Segmentation.create(-1L);

        /**
         * Creates a new {@code StdVideoVP9Segmentation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoVP9Segmentation#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoVP9Segmentation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoVP9SegmentationFlags} view of the {@code flags} field. */
        public StdVideoVP9SegmentationFlags flags() { return StdVideoVP9Segmentation.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the {@code segmentation_tree_probs} field. */
        @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]")
        public ByteBuffer segmentation_tree_probs() { return StdVideoVP9Segmentation.nsegmentation_tree_probs(address()); }
        /** @return the value at the specified index of the {@code segmentation_tree_probs} field. */
        @NativeType("uint8_t")
        public byte segmentation_tree_probs(int index) { return StdVideoVP9Segmentation.nsegmentation_tree_probs(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code segmentation_pred_prob} field. */
        @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]")
        public ByteBuffer segmentation_pred_prob() { return StdVideoVP9Segmentation.nsegmentation_pred_prob(address()); }
        /** @return the value at the specified index of the {@code segmentation_pred_prob} field. */
        @NativeType("uint8_t")
        public byte segmentation_pred_prob(int index) { return StdVideoVP9Segmentation.nsegmentation_pred_prob(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code FeatureEnabled} field. */
        @NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]")
        public ByteBuffer FeatureEnabled() { return StdVideoVP9Segmentation.nFeatureEnabled(address()); }
        /** @return the value at the specified index of the {@code FeatureEnabled} field. */
        @NativeType("uint8_t")
        public byte FeatureEnabled(int index) { return StdVideoVP9Segmentation.nFeatureEnabled(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code FeatureData} field. */
        @NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]")
        public ShortBuffer FeatureData() { return StdVideoVP9Segmentation.nFeatureData(address()); }
        /** @return the value at the specified index of the {@code FeatureData} field. */
        @NativeType("int16_t")
        public short FeatureData(int index) { return StdVideoVP9Segmentation.nFeatureData(address(), index); }

        /** Copies the specified {@link StdVideoVP9SegmentationFlags} to the {@code flags} field. */
        public StdVideoVP9Segmentation.Buffer flags(StdVideoVP9SegmentationFlags value) { StdVideoVP9Segmentation.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoVP9Segmentation.Buffer flags(java.util.function.Consumer<StdVideoVP9SegmentationFlags> consumer) { consumer.accept(flags()); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code segmentation_tree_probs} field. */
        public StdVideoVP9Segmentation.Buffer segmentation_tree_probs(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS]") ByteBuffer value) { StdVideoVP9Segmentation.nsegmentation_tree_probs(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code segmentation_tree_probs} field. */
        public StdVideoVP9Segmentation.Buffer segmentation_tree_probs(int index, @NativeType("uint8_t") byte value) { StdVideoVP9Segmentation.nsegmentation_tree_probs(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code segmentation_pred_prob} field. */
        public StdVideoVP9Segmentation.Buffer segmentation_pred_prob(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB]") ByteBuffer value) { StdVideoVP9Segmentation.nsegmentation_pred_prob(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code segmentation_pred_prob} field. */
        public StdVideoVP9Segmentation.Buffer segmentation_pred_prob(int index, @NativeType("uint8_t") byte value) { StdVideoVP9Segmentation.nsegmentation_pred_prob(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code FeatureEnabled} field. */
        public StdVideoVP9Segmentation.Buffer FeatureEnabled(@NativeType("uint8_t[STD_VIDEO_VP9_MAX_SEGMENTS]") ByteBuffer value) { StdVideoVP9Segmentation.nFeatureEnabled(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code FeatureEnabled} field. */
        public StdVideoVP9Segmentation.Buffer FeatureEnabled(int index, @NativeType("uint8_t") byte value) { StdVideoVP9Segmentation.nFeatureEnabled(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code FeatureData} field. */
        public StdVideoVP9Segmentation.Buffer FeatureData(@NativeType("int16_t[STD_VIDEO_VP9_SEG_LVL_MAX]") ShortBuffer value) { StdVideoVP9Segmentation.nFeatureData(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code FeatureData} field. */
        public StdVideoVP9Segmentation.Buffer FeatureData(int index, @NativeType("int16_t") short value) { StdVideoVP9Segmentation.nFeatureData(address(), index, value); return this; }

    }

}