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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoDecodeH264PictureInfo {
 *     uint8_t {@link #seq_parameter_set_id};
 *     uint8_t {@link #pic_parameter_set_id};
 *     uint16_t {@link #reserved};
 *     uint16_t {@link #frame_num};
 *     uint16_t {@link #idr_pic_id};
 *     int32_t {@link #PicOrderCnt}[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE];
 *     {@link StdVideoDecodeH264PictureInfoFlags StdVideoDecodeH264PictureInfoFlags} flags;
 * }</code></pre>
 */
public class StdVideoDecodeH264PictureInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SEQ_PARAMETER_SET_ID,
        PIC_PARAMETER_SET_ID,
        RESERVED,
        FRAME_NUM,
        IDR_PIC_ID,
        PICORDERCNT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(2),
            __member(2),
            __member(2),
            __array(4, STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE),
            __member(StdVideoDecodeH264PictureInfoFlags.SIZEOF, StdVideoDecodeH264PictureInfoFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SEQ_PARAMETER_SET_ID = layout.offsetof(0);
        PIC_PARAMETER_SET_ID = layout.offsetof(1);
        RESERVED = layout.offsetof(2);
        FRAME_NUM = layout.offsetof(3);
        IDR_PIC_ID = layout.offsetof(4);
        PICORDERCNT = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
    }

    /**
     * Creates a {@code StdVideoDecodeH264PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** selecting SPS from the Picture Parameters */
    @NativeType("uint8_t")
    public byte seq_parameter_set_id() { return nseq_parameter_set_id(address()); }
    /** selecting PPS from the Picture Parameters and the SPS */
    @NativeType("uint8_t")
    public byte pic_parameter_set_id() { return npic_parameter_set_id(address()); }
    /** for structure members 32-bit packing/alignment */
    @NativeType("uint16_t")
    public short reserved() { return nreserved(address()); }
    /** 7.4.3 Slice header semantics */
    @NativeType("uint16_t")
    public short frame_num() { return nframe_num(address()); }
    /** 7.4.3 Slice header semantics */
    @NativeType("uint16_t")
    public short idr_pic_id() { return nidr_pic_id(address()); }
    /** topFieldOrderCnt and BottomFieldOrderCnt fields */
    @NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
    public IntBuffer PicOrderCnt() { return nPicOrderCnt(address()); }
    /** topFieldOrderCnt and BottomFieldOrderCnt fields */
    @NativeType("int32_t")
    public int PicOrderCnt(int index) { return nPicOrderCnt(address(), index); }
    /** @return a {@link StdVideoDecodeH264PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeH264PictureInfoFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #seq_parameter_set_id} field. */
    public StdVideoDecodeH264PictureInfo seq_parameter_set_id(@NativeType("uint8_t") byte value) { nseq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@link #pic_parameter_set_id} field. */
    public StdVideoDecodeH264PictureInfo pic_parameter_set_id(@NativeType("uint8_t") byte value) { npic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@link #reserved} field. */
    public StdVideoDecodeH264PictureInfo reserved(@NativeType("uint16_t") short value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@link #frame_num} field. */
    public StdVideoDecodeH264PictureInfo frame_num(@NativeType("uint16_t") short value) { nframe_num(address(), value); return this; }
    /** Sets the specified value to the {@link #idr_pic_id} field. */
    public StdVideoDecodeH264PictureInfo idr_pic_id(@NativeType("uint16_t") short value) { nidr_pic_id(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@link #PicOrderCnt} field. */
    public StdVideoDecodeH264PictureInfo PicOrderCnt(@NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") IntBuffer value) { nPicOrderCnt(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #PicOrderCnt} field. */
    public StdVideoDecodeH264PictureInfo PicOrderCnt(int index, @NativeType("int32_t") int value) { nPicOrderCnt(address(), index, value); return this; }
    /** Copies the specified {@link StdVideoDecodeH264PictureInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeH264PictureInfo flags(StdVideoDecodeH264PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeH264PictureInfo flags(java.util.function.Consumer<StdVideoDecodeH264PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264PictureInfo set(
        byte seq_parameter_set_id,
        byte pic_parameter_set_id,
        short reserved,
        short frame_num,
        short idr_pic_id,
        IntBuffer PicOrderCnt,
        StdVideoDecodeH264PictureInfoFlags flags
    ) {
        seq_parameter_set_id(seq_parameter_set_id);
        pic_parameter_set_id(pic_parameter_set_id);
        reserved(reserved);
        frame_num(frame_num);
        idr_pic_id(idr_pic_id);
        PicOrderCnt(PicOrderCnt);
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
    public StdVideoDecodeH264PictureInfo set(StdVideoDecodeH264PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264PictureInfo malloc() {
        return wrap(StdVideoDecodeH264PictureInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264PictureInfo calloc() {
        return wrap(StdVideoDecodeH264PictureInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264PictureInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264PictureInfo} instance for the specified memory address. */
    public static StdVideoDecodeH264PictureInfo create(long address) {
        return wrap(StdVideoDecodeH264PictureInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264PictureInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264PictureInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264PictureInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264PictureInfo malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264PictureInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264PictureInfo calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264PictureInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #seq_parameter_set_id}. */
    public static byte nseq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoDecodeH264PictureInfo.SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pic_parameter_set_id}. */
    public static byte npic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoDecodeH264PictureInfo.PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #reserved}. */
    public static short nreserved(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264PictureInfo.RESERVED); }
    /** Unsafe version of {@link #frame_num}. */
    public static short nframe_num(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264PictureInfo.FRAME_NUM); }
    /** Unsafe version of {@link #idr_pic_id}. */
    public static short nidr_pic_id(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264PictureInfo.IDR_PIC_ID); }
    /** Unsafe version of {@link #PicOrderCnt}. */
    public static IntBuffer nPicOrderCnt(long struct) { return memIntBuffer(struct + StdVideoDecodeH264PictureInfo.PICORDERCNT, STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE); }
    /** Unsafe version of {@link #PicOrderCnt(int) PicOrderCnt}. */
    public static int nPicOrderCnt(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoDecodeH264PictureInfo.PICORDERCNT + check(index, STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeH264PictureInfoFlags nflags(long struct) { return StdVideoDecodeH264PictureInfoFlags.create(struct + StdVideoDecodeH264PictureInfo.FLAGS); }

    /** Unsafe version of {@link #seq_parameter_set_id(byte) seq_parameter_set_id}. */
    public static void nseq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoDecodeH264PictureInfo.SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pic_parameter_set_id(byte) pic_parameter_set_id}. */
    public static void npic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoDecodeH264PictureInfo.PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #reserved(short) reserved}. */
    public static void nreserved(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264PictureInfo.RESERVED, value); }
    /** Unsafe version of {@link #frame_num(short) frame_num}. */
    public static void nframe_num(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264PictureInfo.FRAME_NUM, value); }
    /** Unsafe version of {@link #idr_pic_id(short) idr_pic_id}. */
    public static void nidr_pic_id(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264PictureInfo.IDR_PIC_ID, value); }
    /** Unsafe version of {@link #PicOrderCnt(IntBuffer) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH264PictureInfo.PICORDERCNT, value.remaining() * 4);
    }
    /** Unsafe version of {@link #PicOrderCnt(int, int) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoDecodeH264PictureInfo.PICORDERCNT + check(index, STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #flags(StdVideoDecodeH264PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeH264PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeH264PictureInfo.FLAGS, StdVideoDecodeH264PictureInfoFlags.SIZEOF); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264PictureInfo ELEMENT_FACTORY = StdVideoDecodeH264PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264PictureInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264PictureInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link StdVideoDecodeH264PictureInfo#seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte seq_parameter_set_id() { return StdVideoDecodeH264PictureInfo.nseq_parameter_set_id(address()); }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfo#pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pic_parameter_set_id() { return StdVideoDecodeH264PictureInfo.npic_parameter_set_id(address()); }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfo#reserved} field. */
        @NativeType("uint16_t")
        public short reserved() { return StdVideoDecodeH264PictureInfo.nreserved(address()); }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfo#frame_num} field. */
        @NativeType("uint16_t")
        public short frame_num() { return StdVideoDecodeH264PictureInfo.nframe_num(address()); }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfo#idr_pic_id} field. */
        @NativeType("uint16_t")
        public short idr_pic_id() { return StdVideoDecodeH264PictureInfo.nidr_pic_id(address()); }
        /** @return a {@link IntBuffer} view of the {@link StdVideoDecodeH264PictureInfo#PicOrderCnt} field. */
        @NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
        public IntBuffer PicOrderCnt() { return StdVideoDecodeH264PictureInfo.nPicOrderCnt(address()); }
        /** @return the value at the specified index of the {@link StdVideoDecodeH264PictureInfo#PicOrderCnt} field. */
        @NativeType("int32_t")
        public int PicOrderCnt(int index) { return StdVideoDecodeH264PictureInfo.nPicOrderCnt(address(), index); }
        /** @return a {@link StdVideoDecodeH264PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeH264PictureInfoFlags flags() { return StdVideoDecodeH264PictureInfo.nflags(address()); }

        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfo#seq_parameter_set_id} field. */
        public StdVideoDecodeH264PictureInfo.Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.nseq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfo#pic_parameter_set_id} field. */
        public StdVideoDecodeH264PictureInfo.Buffer pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoDecodeH264PictureInfo.npic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfo#reserved} field. */
        public StdVideoDecodeH264PictureInfo.Buffer reserved(@NativeType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfo#frame_num} field. */
        public StdVideoDecodeH264PictureInfo.Buffer frame_num(@NativeType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.nframe_num(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfo#idr_pic_id} field. */
        public StdVideoDecodeH264PictureInfo.Buffer idr_pic_id(@NativeType("uint16_t") short value) { StdVideoDecodeH264PictureInfo.nidr_pic_id(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@link StdVideoDecodeH264PictureInfo#PicOrderCnt} field. */
        public StdVideoDecodeH264PictureInfo.Buffer PicOrderCnt(@NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") IntBuffer value) { StdVideoDecodeH264PictureInfo.nPicOrderCnt(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoDecodeH264PictureInfo#PicOrderCnt} field. */
        public StdVideoDecodeH264PictureInfo.Buffer PicOrderCnt(int index, @NativeType("int32_t") int value) { StdVideoDecodeH264PictureInfo.nPicOrderCnt(address(), index, value); return this; }
        /** Copies the specified {@link StdVideoDecodeH264PictureInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeH264PictureInfo.Buffer flags(StdVideoDecodeH264PictureInfoFlags value) { StdVideoDecodeH264PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeH264PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeH264PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }

    }

}