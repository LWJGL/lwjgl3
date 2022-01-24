/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

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
 * struct StdVideoEncodeH265PictureInfo {
 *     StdVideoH265PictureType PictureType;
 *     uint8_t sps_video_parameter_set_id;
 *     uint8_t pps_seq_parameter_set_id;
 *     int32_t PicOrderCntVal;
 *     uint8_t TemporalId;
 *     {@link StdVideoEncodeH265PictureInfoFlags StdVideoEncodeH265PictureInfoFlags} flags;
 * }</code></pre>
 */
public class StdVideoEncodeH265PictureInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PICTURETYPE,
        SPS_VIDEO_PARAMETER_SET_ID,
        PPS_SEQ_PARAMETER_SET_ID,
        PICORDERCNTVAL,
        TEMPORALID,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(StdVideoEncodeH265PictureInfoFlags.SIZEOF, StdVideoEncodeH265PictureInfoFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PICTURETYPE = layout.offsetof(0);
        SPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(1);
        PPS_SEQ_PARAMETER_SET_ID = layout.offsetof(2);
        PICORDERCNTVAL = layout.offsetof(3);
        TEMPORALID = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    /**
     * Creates a {@code StdVideoEncodeH265PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code PictureType} field. */
    @NativeType("StdVideoH265PictureType")
    public int PictureType() { return nPictureType(address()); }
    /** @return the value of the {@code sps_video_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte sps_video_parameter_set_id() { return nsps_video_parameter_set_id(address()); }
    /** @return the value of the {@code pps_seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() { return npps_seq_parameter_set_id(address()); }
    /** @return the value of the {@code PicOrderCntVal} field. */
    @NativeType("int32_t")
    public int PicOrderCntVal() { return nPicOrderCntVal(address()); }
    /** @return the value of the {@code TemporalId} field. */
    @NativeType("uint8_t")
    public byte TemporalId() { return nTemporalId(address()); }
    /** @return a {@link StdVideoEncodeH265PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265PictureInfoFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@code PictureType} field. */
    public StdVideoEncodeH265PictureInfo PictureType(@NativeType("StdVideoH265PictureType") int value) { nPictureType(address(), value); return this; }
    /** Sets the specified value to the {@code sps_video_parameter_set_id} field. */
    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(@NativeType("uint8_t") byte value) { nsps_video_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pps_seq_parameter_set_id} field. */
    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { npps_seq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCntVal} field. */
    public StdVideoEncodeH265PictureInfo PicOrderCntVal(@NativeType("int32_t") int value) { nPicOrderCntVal(address(), value); return this; }
    /** Sets the specified value to the {@code TemporalId} field. */
    public StdVideoEncodeH265PictureInfo TemporalId(@NativeType("uint8_t") byte value) { nTemporalId(address(), value); return this; }
    /** Copies the specified {@link StdVideoEncodeH265PictureInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH265PictureInfo flags(StdVideoEncodeH265PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265PictureInfo flags(java.util.function.Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265PictureInfo set(
        int PictureType,
        byte sps_video_parameter_set_id,
        byte pps_seq_parameter_set_id,
        int PicOrderCntVal,
        byte TemporalId,
        StdVideoEncodeH265PictureInfoFlags flags
    ) {
        PictureType(PictureType);
        sps_video_parameter_set_id(sps_video_parameter_set_id);
        pps_seq_parameter_set_id(pps_seq_parameter_set_id);
        PicOrderCntVal(PicOrderCntVal);
        TemporalId(TemporalId);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265PictureInfo set(StdVideoEncodeH265PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfo malloc() {
        return wrap(StdVideoEncodeH265PictureInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfo calloc() {
        return wrap(StdVideoEncodeH265PictureInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265PictureInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance for the specified memory address. */
    public static StdVideoEncodeH265PictureInfo create(long address) {
        return wrap(StdVideoEncodeH265PictureInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265PictureInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfo malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265PictureInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfo calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265PictureInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #PictureType}. */
    public static int nPictureType(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfo.PICTURETYPE); }
    /** Unsafe version of {@link #sps_video_parameter_set_id}. */
    public static byte nsps_video_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pps_seq_parameter_set_id}. */
    public static byte npps_seq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #PicOrderCntVal}. */
    public static int nPicOrderCntVal(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfo.PICORDERCNTVAL); }
    /** Unsafe version of {@link #TemporalId}. */
    public static byte nTemporalId(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.TEMPORALID); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265PictureInfoFlags nflags(long struct) { return StdVideoEncodeH265PictureInfoFlags.create(struct + StdVideoEncodeH265PictureInfo.FLAGS); }

    /** Unsafe version of {@link #PictureType(int) PictureType}. */
    public static void nPictureType(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfo.PICTURETYPE, value); }
    /** Unsafe version of {@link #sps_video_parameter_set_id(byte) sps_video_parameter_set_id}. */
    public static void nsps_video_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pps_seq_parameter_set_id(byte) pps_seq_parameter_set_id}. */
    public static void npps_seq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #PicOrderCntVal(int) PicOrderCntVal}. */
    public static void nPicOrderCntVal(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfo.PICORDERCNTVAL, value); }
    /** Unsafe version of {@link #TemporalId(byte) TemporalId}. */
    public static void nTemporalId(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.TEMPORALID, value); }
    /** Unsafe version of {@link #flags(StdVideoEncodeH265PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265PictureInfo.FLAGS, StdVideoEncodeH265PictureInfoFlags.SIZEOF); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265PictureInfo ELEMENT_FACTORY = StdVideoEncodeH265PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265PictureInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265PictureInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH265PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code PictureType} field. */
        @NativeType("StdVideoH265PictureType")
        public int PictureType() { return StdVideoEncodeH265PictureInfo.nPictureType(address()); }
        /** @return the value of the {@code sps_video_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte sps_video_parameter_set_id() { return StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(address()); }
        /** @return the value of the {@code pps_seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() { return StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(address()); }
        /** @return the value of the {@code PicOrderCntVal} field. */
        @NativeType("int32_t")
        public int PicOrderCntVal() { return StdVideoEncodeH265PictureInfo.nPicOrderCntVal(address()); }
        /** @return the value of the {@code TemporalId} field. */
        @NativeType("uint8_t")
        public byte TemporalId() { return StdVideoEncodeH265PictureInfo.nTemporalId(address()); }
        /** @return a {@link StdVideoEncodeH265PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265PictureInfoFlags flags() { return StdVideoEncodeH265PictureInfo.nflags(address()); }

        /** Sets the specified value to the {@code PictureType} field. */
        public StdVideoEncodeH265PictureInfo.Buffer PictureType(@NativeType("StdVideoH265PictureType") int value) { StdVideoEncodeH265PictureInfo.nPictureType(address(), value); return this; }
        /** Sets the specified value to the {@code sps_video_parameter_set_id} field. */
        public StdVideoEncodeH265PictureInfo.Buffer sps_video_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pps_seq_parameter_set_id} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCntVal} field. */
        public StdVideoEncodeH265PictureInfo.Buffer PicOrderCntVal(@NativeType("int32_t") int value) { StdVideoEncodeH265PictureInfo.nPicOrderCntVal(address(), value); return this; }
        /** Sets the specified value to the {@code TemporalId} field. */
        public StdVideoEncodeH265PictureInfo.Buffer TemporalId(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.nTemporalId(address(), value); return this; }
        /** Copies the specified {@link StdVideoEncodeH265PictureInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH265PictureInfo.Buffer flags(StdVideoEncodeH265PictureInfoFlags value) { StdVideoEncodeH265PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }

    }

}