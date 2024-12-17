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
 * struct StdVideoDecodeAV1ReferenceInfo {
 *     {@link StdVideoDecodeAV1ReferenceInfoFlags StdVideoDecodeAV1ReferenceInfoFlags} flags;
 *     uint8_t frame_type;
 *     uint8_t RefFrameSignBias;
 *     uint8_t OrderHint;
 *     uint8_t SavedOrderHints[STD_VIDEO_AV1_NUM_REF_FRAMES];
 * }}</pre>
 */
public class StdVideoDecodeAV1ReferenceInfo extends Struct<StdVideoDecodeAV1ReferenceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FRAME_TYPE,
        REFFRAMESIGNBIAS,
        ORDERHINT,
        SAVEDORDERHINTS;

    static {
        Layout layout = __struct(
            __member(StdVideoDecodeAV1ReferenceInfoFlags.SIZEOF, StdVideoDecodeAV1ReferenceInfoFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_AV1_NUM_REF_FRAMES)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        FRAME_TYPE = layout.offsetof(1);
        REFFRAMESIGNBIAS = layout.offsetof(2);
        ORDERHINT = layout.offsetof(3);
        SAVEDORDERHINTS = layout.offsetof(4);
    }

    protected StdVideoDecodeAV1ReferenceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeAV1ReferenceInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeAV1ReferenceInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeAV1ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeAV1ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoDecodeAV1ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeAV1ReferenceInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code frame_type} field. */
    @NativeType("uint8_t")
    public byte frame_type() { return nframe_type(address()); }
    /** @return the value of the {@code RefFrameSignBias} field. */
    @NativeType("uint8_t")
    public byte RefFrameSignBias() { return nRefFrameSignBias(address()); }
    /** @return the value of the {@code OrderHint} field. */
    @NativeType("uint8_t")
    public byte OrderHint() { return nOrderHint(address()); }
    /** @return a {@link ByteBuffer} view of the {@code SavedOrderHints} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer SavedOrderHints() { return nSavedOrderHints(address()); }
    /** @return the value at the specified index of the {@code SavedOrderHints} field. */
    @NativeType("uint8_t")
    public byte SavedOrderHints(int index) { return nSavedOrderHints(address(), index); }

    /** Copies the specified {@link StdVideoDecodeAV1ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeAV1ReferenceInfo flags(StdVideoDecodeAV1ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeAV1ReferenceInfo flags(java.util.function.Consumer<StdVideoDecodeAV1ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code frame_type} field. */
    public StdVideoDecodeAV1ReferenceInfo frame_type(@NativeType("uint8_t") byte value) { nframe_type(address(), value); return this; }
    /** Sets the specified value to the {@code RefFrameSignBias} field. */
    public StdVideoDecodeAV1ReferenceInfo RefFrameSignBias(@NativeType("uint8_t") byte value) { nRefFrameSignBias(address(), value); return this; }
    /** Sets the specified value to the {@code OrderHint} field. */
    public StdVideoDecodeAV1ReferenceInfo OrderHint(@NativeType("uint8_t") byte value) { nOrderHint(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code SavedOrderHints} field. */
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { nSavedOrderHints(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code SavedOrderHints} field. */
    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(int index, @NativeType("uint8_t") byte value) { nSavedOrderHints(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeAV1ReferenceInfo set(
        StdVideoDecodeAV1ReferenceInfoFlags flags,
        byte frame_type,
        byte RefFrameSignBias,
        byte OrderHint,
        ByteBuffer SavedOrderHints
    ) {
        flags(flags);
        frame_type(frame_type);
        RefFrameSignBias(RefFrameSignBias);
        OrderHint(OrderHint);
        SavedOrderHints(SavedOrderHints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeAV1ReferenceInfo set(StdVideoDecodeAV1ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1ReferenceInfo malloc() {
        return new StdVideoDecodeAV1ReferenceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1ReferenceInfo calloc() {
        return new StdVideoDecodeAV1ReferenceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeAV1ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1ReferenceInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfo} instance for the specified memory address. */
    public static StdVideoDecodeAV1ReferenceInfo create(long address) {
        return new StdVideoDecodeAV1ReferenceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoDecodeAV1ReferenceInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeAV1ReferenceInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeAV1ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoDecodeAV1ReferenceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeAV1ReferenceInfoFlags nflags(long struct) { return StdVideoDecodeAV1ReferenceInfoFlags.create(struct + StdVideoDecodeAV1ReferenceInfo.FLAGS); }
    /** Unsafe version of {@link #frame_type}. */
    public static byte nframe_type(long struct) { return memGetByte(struct + StdVideoDecodeAV1ReferenceInfo.FRAME_TYPE); }
    /** Unsafe version of {@link #RefFrameSignBias}. */
    public static byte nRefFrameSignBias(long struct) { return memGetByte(struct + StdVideoDecodeAV1ReferenceInfo.REFFRAMESIGNBIAS); }
    /** Unsafe version of {@link #OrderHint}. */
    public static byte nOrderHint(long struct) { return memGetByte(struct + StdVideoDecodeAV1ReferenceInfo.ORDERHINT); }
    /** Unsafe version of {@link #SavedOrderHints}. */
    public static ByteBuffer nSavedOrderHints(long struct) { return memByteBuffer(struct + StdVideoDecodeAV1ReferenceInfo.SAVEDORDERHINTS, STD_VIDEO_AV1_NUM_REF_FRAMES); }
    /** Unsafe version of {@link #SavedOrderHints(int) SavedOrderHints}. */
    public static byte nSavedOrderHints(long struct, int index) {
        return memGetByte(struct + StdVideoDecodeAV1ReferenceInfo.SAVEDORDERHINTS + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoDecodeAV1ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeAV1ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeAV1ReferenceInfo.FLAGS, StdVideoDecodeAV1ReferenceInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #frame_type(byte) frame_type}. */
    public static void nframe_type(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1ReferenceInfo.FRAME_TYPE, value); }
    /** Unsafe version of {@link #RefFrameSignBias(byte) RefFrameSignBias}. */
    public static void nRefFrameSignBias(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1ReferenceInfo.REFFRAMESIGNBIAS, value); }
    /** Unsafe version of {@link #OrderHint(byte) OrderHint}. */
    public static void nOrderHint(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1ReferenceInfo.ORDERHINT, value); }
    /** Unsafe version of {@link #SavedOrderHints(ByteBuffer) SavedOrderHints}. */
    public static void nSavedOrderHints(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_NUM_REF_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoDecodeAV1ReferenceInfo.SAVEDORDERHINTS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #SavedOrderHints(int, byte) SavedOrderHints}. */
    public static void nSavedOrderHints(long struct, int index, byte value) {
        memPutByte(struct + StdVideoDecodeAV1ReferenceInfo.SAVEDORDERHINTS + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeAV1ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeAV1ReferenceInfo ELEMENT_FACTORY = StdVideoDecodeAV1ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeAV1ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeAV1ReferenceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeAV1ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoDecodeAV1ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeAV1ReferenceInfoFlags flags() { return StdVideoDecodeAV1ReferenceInfo.nflags(address()); }
        /** @return the value of the {@code frame_type} field. */
        @NativeType("uint8_t")
        public byte frame_type() { return StdVideoDecodeAV1ReferenceInfo.nframe_type(address()); }
        /** @return the value of the {@code RefFrameSignBias} field. */
        @NativeType("uint8_t")
        public byte RefFrameSignBias() { return StdVideoDecodeAV1ReferenceInfo.nRefFrameSignBias(address()); }
        /** @return the value of the {@code OrderHint} field. */
        @NativeType("uint8_t")
        public byte OrderHint() { return StdVideoDecodeAV1ReferenceInfo.nOrderHint(address()); }
        /** @return a {@link ByteBuffer} view of the {@code SavedOrderHints} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer SavedOrderHints() { return StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address()); }
        /** @return the value at the specified index of the {@code SavedOrderHints} field. */
        @NativeType("uint8_t")
        public byte SavedOrderHints(int index) { return StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address(), index); }

        /** Copies the specified {@link StdVideoDecodeAV1ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer flags(StdVideoDecodeAV1ReferenceInfoFlags value) { StdVideoDecodeAV1ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeAV1ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code frame_type} field. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer frame_type(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.nframe_type(address(), value); return this; }
        /** Sets the specified value to the {@code RefFrameSignBias} field. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer RefFrameSignBias(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.nRefFrameSignBias(address(), value); return this; }
        /** Sets the specified value to the {@code OrderHint} field. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer OrderHint(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.nOrderHint(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code SavedOrderHints} field. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer SavedOrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code SavedOrderHints} field. */
        public StdVideoDecodeAV1ReferenceInfo.Buffer SavedOrderHints(int index, @NativeType("uint8_t") byte value) { StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address(), index, value); return this; }

    }

}