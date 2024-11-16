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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264ReferenceInfo {
 *     {@link StdVideoEncodeH264ReferenceInfoFlags StdVideoEncodeH264ReferenceInfoFlags} flags;
 *     StdVideoH264PictureType primary_pic_type;
 *     uint32_t FrameNum;
 *     int32_t PicOrderCnt;
 *     uint16_t long_term_pic_num;
 *     uint16_t long_term_frame_idx;
 *     uint8_t temporal_id;
 * }</code></pre>
 */
public class StdVideoEncodeH264ReferenceInfo extends Struct<StdVideoEncodeH264ReferenceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PRIMARY_PIC_TYPE,
        FRAMENUM,
        PICORDERCNT,
        LONG_TERM_PIC_NUM,
        LONG_TERM_FRAME_IDX,
        TEMPORAL_ID;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264ReferenceInfoFlags.SIZEOF, StdVideoEncodeH264ReferenceInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PRIMARY_PIC_TYPE = layout.offsetof(1);
        FRAMENUM = layout.offsetof(2);
        PICORDERCNT = layout.offsetof(3);
        LONG_TERM_PIC_NUM = layout.offsetof(4);
        LONG_TERM_FRAME_IDX = layout.offsetof(5);
        TEMPORAL_ID = layout.offsetof(6);
    }

    protected StdVideoEncodeH264ReferenceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264ReferenceInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264ReferenceInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264ReferenceInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code primary_pic_type} field. */
    @NativeType("StdVideoH264PictureType")
    public int primary_pic_type() { return nprimary_pic_type(address()); }
    /** @return the value of the {@code FrameNum} field. */
    @NativeType("uint32_t")
    public int FrameNum() { return nFrameNum(address()); }
    /** @return the value of the {@code PicOrderCnt} field. */
    @NativeType("int32_t")
    public int PicOrderCnt() { return nPicOrderCnt(address()); }
    /** @return the value of the {@code long_term_pic_num} field. */
    @NativeType("uint16_t")
    public short long_term_pic_num() { return nlong_term_pic_num(address()); }
    /** @return the value of the {@code long_term_frame_idx} field. */
    @NativeType("uint16_t")
    public short long_term_frame_idx() { return nlong_term_frame_idx(address()); }
    /** @return the value of the {@code temporal_id} field. */
    @NativeType("uint8_t")
    public byte temporal_id() { return ntemporal_id(address()); }

    /** Copies the specified {@link StdVideoEncodeH264ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH264ReferenceInfo flags(StdVideoEncodeH264ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264ReferenceInfo flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code primary_pic_type} field. */
    public StdVideoEncodeH264ReferenceInfo primary_pic_type(@NativeType("StdVideoH264PictureType") int value) { nprimary_pic_type(address(), value); return this; }
    /** Sets the specified value to the {@code FrameNum} field. */
    public StdVideoEncodeH264ReferenceInfo FrameNum(@NativeType("uint32_t") int value) { nFrameNum(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCnt} field. */
    public StdVideoEncodeH264ReferenceInfo PicOrderCnt(@NativeType("int32_t") int value) { nPicOrderCnt(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_pic_num} field. */
    public StdVideoEncodeH264ReferenceInfo long_term_pic_num(@NativeType("uint16_t") short value) { nlong_term_pic_num(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_frame_idx} field. */
    public StdVideoEncodeH264ReferenceInfo long_term_frame_idx(@NativeType("uint16_t") short value) { nlong_term_frame_idx(address(), value); return this; }
    /** Sets the specified value to the {@code temporal_id} field. */
    public StdVideoEncodeH264ReferenceInfo temporal_id(@NativeType("uint8_t") byte value) { ntemporal_id(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264ReferenceInfo set(
        StdVideoEncodeH264ReferenceInfoFlags flags,
        int primary_pic_type,
        int FrameNum,
        int PicOrderCnt,
        short long_term_pic_num,
        short long_term_frame_idx,
        byte temporal_id
    ) {
        flags(flags);
        primary_pic_type(primary_pic_type);
        FrameNum(FrameNum);
        PicOrderCnt(PicOrderCnt);
        long_term_pic_num(long_term_pic_num);
        long_term_frame_idx(long_term_frame_idx);
        temporal_id(temporal_id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264ReferenceInfo set(StdVideoEncodeH264ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceInfo malloc() {
        return new StdVideoEncodeH264ReferenceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceInfo calloc() {
        return new StdVideoEncodeH264ReferenceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264ReferenceInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance for the specified memory address. */
    public static StdVideoEncodeH264ReferenceInfo create(long address) {
        return new StdVideoEncodeH264ReferenceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeH264ReferenceInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264ReferenceInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeH264ReferenceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264ReferenceInfoFlags nflags(long struct) { return StdVideoEncodeH264ReferenceInfoFlags.create(struct + StdVideoEncodeH264ReferenceInfo.FLAGS); }
    /** Unsafe version of {@link #primary_pic_type}. */
    public static int nprimary_pic_type(long struct) { return memGetInt(struct + StdVideoEncodeH264ReferenceInfo.PRIMARY_PIC_TYPE); }
    /** Unsafe version of {@link #FrameNum}. */
    public static int nFrameNum(long struct) { return memGetInt(struct + StdVideoEncodeH264ReferenceInfo.FRAMENUM); }
    /** Unsafe version of {@link #PicOrderCnt}. */
    public static int nPicOrderCnt(long struct) { return memGetInt(struct + StdVideoEncodeH264ReferenceInfo.PICORDERCNT); }
    /** Unsafe version of {@link #long_term_pic_num}. */
    public static short nlong_term_pic_num(long struct) { return memGetShort(struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_PIC_NUM); }
    /** Unsafe version of {@link #long_term_frame_idx}. */
    public static short nlong_term_frame_idx(long struct) { return memGetShort(struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_FRAME_IDX); }
    /** Unsafe version of {@link #temporal_id}. */
    public static byte ntemporal_id(long struct) { return memGetByte(struct + StdVideoEncodeH264ReferenceInfo.TEMPORAL_ID); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264ReferenceInfo.FLAGS, StdVideoEncodeH264ReferenceInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #primary_pic_type(int) primary_pic_type}. */
    public static void nprimary_pic_type(long struct, int value) { memPutInt(struct + StdVideoEncodeH264ReferenceInfo.PRIMARY_PIC_TYPE, value); }
    /** Unsafe version of {@link #FrameNum(int) FrameNum}. */
    public static void nFrameNum(long struct, int value) { memPutInt(struct + StdVideoEncodeH264ReferenceInfo.FRAMENUM, value); }
    /** Unsafe version of {@link #PicOrderCnt(int) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, int value) { memPutInt(struct + StdVideoEncodeH264ReferenceInfo.PICORDERCNT, value); }
    /** Unsafe version of {@link #long_term_pic_num(short) long_term_pic_num}. */
    public static void nlong_term_pic_num(long struct, short value) { memPutShort(struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_PIC_NUM, value); }
    /** Unsafe version of {@link #long_term_frame_idx(short) long_term_frame_idx}. */
    public static void nlong_term_frame_idx(long struct, short value) { memPutShort(struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_FRAME_IDX, value); }
    /** Unsafe version of {@link #temporal_id(byte) temporal_id}. */
    public static void ntemporal_id(long struct, byte value) { memPutByte(struct + StdVideoEncodeH264ReferenceInfo.TEMPORAL_ID, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeH264ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264ReferenceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264ReferenceInfoFlags flags() { return StdVideoEncodeH264ReferenceInfo.nflags(address()); }
        /** @return the value of the {@code primary_pic_type} field. */
        @NativeType("StdVideoH264PictureType")
        public int primary_pic_type() { return StdVideoEncodeH264ReferenceInfo.nprimary_pic_type(address()); }
        /** @return the value of the {@code FrameNum} field. */
        @NativeType("uint32_t")
        public int FrameNum() { return StdVideoEncodeH264ReferenceInfo.nFrameNum(address()); }
        /** @return the value of the {@code PicOrderCnt} field. */
        @NativeType("int32_t")
        public int PicOrderCnt() { return StdVideoEncodeH264ReferenceInfo.nPicOrderCnt(address()); }
        /** @return the value of the {@code long_term_pic_num} field. */
        @NativeType("uint16_t")
        public short long_term_pic_num() { return StdVideoEncodeH264ReferenceInfo.nlong_term_pic_num(address()); }
        /** @return the value of the {@code long_term_frame_idx} field. */
        @NativeType("uint16_t")
        public short long_term_frame_idx() { return StdVideoEncodeH264ReferenceInfo.nlong_term_frame_idx(address()); }
        /** @return the value of the {@code temporal_id} field. */
        @NativeType("uint8_t")
        public byte temporal_id() { return StdVideoEncodeH264ReferenceInfo.ntemporal_id(address()); }

        /** Copies the specified {@link StdVideoEncodeH264ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer flags(StdVideoEncodeH264ReferenceInfoFlags value) { StdVideoEncodeH264ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code primary_pic_type} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer primary_pic_type(@NativeType("StdVideoH264PictureType") int value) { StdVideoEncodeH264ReferenceInfo.nprimary_pic_type(address(), value); return this; }
        /** Sets the specified value to the {@code FrameNum} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer FrameNum(@NativeType("uint32_t") int value) { StdVideoEncodeH264ReferenceInfo.nFrameNum(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCnt} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer PicOrderCnt(@NativeType("int32_t") int value) { StdVideoEncodeH264ReferenceInfo.nPicOrderCnt(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_pic_num} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer long_term_pic_num(@NativeType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.nlong_term_pic_num(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_frame_idx} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer long_term_frame_idx(@NativeType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.nlong_term_frame_idx(address(), value); return this; }
        /** Sets the specified value to the {@code temporal_id} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer temporal_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceInfo.ntemporal_id(address(), value); return this; }

    }

}