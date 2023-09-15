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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265PictureInfo {
 *     {@link StdVideoEncodeH265PictureInfoFlags StdVideoEncodeH265PictureInfoFlags} flags;
 *     StdVideoH265PictureType pic_type;
 *     uint8_t sps_video_parameter_set_id;
 *     uint8_t pps_seq_parameter_set_id;
 *     uint8_t pps_pic_parameter_set_id;
 *     uint8_t short_term_ref_pic_set_idx;
 *     int32_t PicOrderCntVal;
 *     uint8_t TemporalId;
 *     uint8_t reserved1[7];
 *     {@link StdVideoEncodeH265ReferenceModifications StdVideoEncodeH265ReferenceModifications} const * pRefLists;
 *     {@link StdVideoH265ShortTermRefPicSet StdVideoH265ShortTermRefPicSet} const * pShortTermRefPicSet;
 *     {@link StdVideoEncodeH265LongTermRefPics StdVideoEncodeH265LongTermRefPics} const * pLongTermRefPics;
 * }</code></pre>
 */
public class StdVideoEncodeH265PictureInfo extends Struct<StdVideoEncodeH265PictureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PIC_TYPE,
        SPS_VIDEO_PARAMETER_SET_ID,
        PPS_SEQ_PARAMETER_SET_ID,
        PPS_PIC_PARAMETER_SET_ID,
        SHORT_TERM_REF_PIC_SET_IDX,
        PICORDERCNTVAL,
        TEMPORALID,
        RESERVED1,
        PREFLISTS,
        PSHORTTERMREFPICSET,
        PLONGTERMREFPICS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265PictureInfoFlags.SIZEOF, StdVideoEncodeH265PictureInfoFlags.ALIGNOF),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __array(1, 7),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PIC_TYPE = layout.offsetof(1);
        SPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(2);
        PPS_SEQ_PARAMETER_SET_ID = layout.offsetof(3);
        PPS_PIC_PARAMETER_SET_ID = layout.offsetof(4);
        SHORT_TERM_REF_PIC_SET_IDX = layout.offsetof(5);
        PICORDERCNTVAL = layout.offsetof(6);
        TEMPORALID = layout.offsetof(7);
        RESERVED1 = layout.offsetof(8);
        PREFLISTS = layout.offsetof(9);
        PSHORTTERMREFPICSET = layout.offsetof(10);
        PLONGTERMREFPICS = layout.offsetof(11);
    }

    protected StdVideoEncodeH265PictureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265PictureInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265PictureInfo(address, container);
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

    /** @return a {@link StdVideoEncodeH265PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code pic_type} field. */
    @NativeType("StdVideoH265PictureType")
    public int pic_type() { return npic_type(address()); }
    /** @return the value of the {@code sps_video_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte sps_video_parameter_set_id() { return nsps_video_parameter_set_id(address()); }
    /** @return the value of the {@code pps_seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() { return npps_seq_parameter_set_id(address()); }
    /** @return the value of the {@code pps_pic_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() { return npps_pic_parameter_set_id(address()); }
    /** @return the value of the {@code short_term_ref_pic_set_idx} field. */
    @NativeType("uint8_t")
    public byte short_term_ref_pic_set_idx() { return nshort_term_ref_pic_set_idx(address()); }
    /** @return the value of the {@code PicOrderCntVal} field. */
    @NativeType("int32_t")
    public int PicOrderCntVal() { return nPicOrderCntVal(address()); }
    /** @return the value of the {@code TemporalId} field. */
    @NativeType("uint8_t")
    public byte TemporalId() { return nTemporalId(address()); }
    /** @return a {@link StdVideoEncodeH265ReferenceModifications} view of the struct pointed to by the {@code pRefLists} field. */
    @NativeType("StdVideoEncodeH265ReferenceModifications const *")
    public StdVideoEncodeH265ReferenceModifications pRefLists() { return npRefLists(address()); }
    /** @return a {@link StdVideoH265ShortTermRefPicSet} view of the struct pointed to by the {@code pShortTermRefPicSet} field. */
    @NativeType("StdVideoH265ShortTermRefPicSet const *")
    public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() { return npShortTermRefPicSet(address()); }
    /** @return a {@link StdVideoEncodeH265LongTermRefPics} view of the struct pointed to by the {@code pLongTermRefPics} field. */
    @NativeType("StdVideoEncodeH265LongTermRefPics const *")
    public StdVideoEncodeH265LongTermRefPics pLongTermRefPics() { return npLongTermRefPics(address()); }

    /** Copies the specified {@link StdVideoEncodeH265PictureInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH265PictureInfo flags(StdVideoEncodeH265PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265PictureInfo flags(java.util.function.Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code pic_type} field. */
    public StdVideoEncodeH265PictureInfo pic_type(@NativeType("StdVideoH265PictureType") int value) { npic_type(address(), value); return this; }
    /** Sets the specified value to the {@code sps_video_parameter_set_id} field. */
    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(@NativeType("uint8_t") byte value) { nsps_video_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pps_seq_parameter_set_id} field. */
    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { npps_seq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pps_pic_parameter_set_id} field. */
    public StdVideoEncodeH265PictureInfo pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) { npps_pic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_idx} field. */
    public StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) { nshort_term_ref_pic_set_idx(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCntVal} field. */
    public StdVideoEncodeH265PictureInfo PicOrderCntVal(@NativeType("int32_t") int value) { nPicOrderCntVal(address(), value); return this; }
    /** Sets the specified value to the {@code TemporalId} field. */
    public StdVideoEncodeH265PictureInfo TemporalId(@NativeType("uint8_t") byte value) { nTemporalId(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceModifications} to the {@code pRefLists} field. */
    public StdVideoEncodeH265PictureInfo pRefLists(@NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) { npRefLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265ShortTermRefPicSet} to the {@code pShortTermRefPicSet} field. */
    public StdVideoEncodeH265PictureInfo pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) { npShortTermRefPicSet(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265LongTermRefPics} to the {@code pLongTermRefPics} field. */
    public StdVideoEncodeH265PictureInfo pLongTermRefPics(@NativeType("StdVideoEncodeH265LongTermRefPics const *") StdVideoEncodeH265LongTermRefPics value) { npLongTermRefPics(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265PictureInfo set(
        StdVideoEncodeH265PictureInfoFlags flags,
        int pic_type,
        byte sps_video_parameter_set_id,
        byte pps_seq_parameter_set_id,
        byte pps_pic_parameter_set_id,
        byte short_term_ref_pic_set_idx,
        int PicOrderCntVal,
        byte TemporalId,
        StdVideoEncodeH265ReferenceModifications pRefLists,
        StdVideoH265ShortTermRefPicSet pShortTermRefPicSet,
        StdVideoEncodeH265LongTermRefPics pLongTermRefPics
    ) {
        flags(flags);
        pic_type(pic_type);
        sps_video_parameter_set_id(sps_video_parameter_set_id);
        pps_seq_parameter_set_id(pps_seq_parameter_set_id);
        pps_pic_parameter_set_id(pps_pic_parameter_set_id);
        short_term_ref_pic_set_idx(short_term_ref_pic_set_idx);
        PicOrderCntVal(PicOrderCntVal);
        TemporalId(TemporalId);
        pRefLists(pRefLists);
        pShortTermRefPicSet(pShortTermRefPicSet);
        pLongTermRefPics(pLongTermRefPics);

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
        return new StdVideoEncodeH265PictureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfo calloc() {
        return new StdVideoEncodeH265PictureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265PictureInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfo} instance for the specified memory address. */
    public static StdVideoEncodeH265PictureInfo create(long address) {
        return new StdVideoEncodeH265PictureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265PictureInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH265PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265PictureInfoFlags nflags(long struct) { return StdVideoEncodeH265PictureInfoFlags.create(struct + StdVideoEncodeH265PictureInfo.FLAGS); }
    /** Unsafe version of {@link #pic_type}. */
    public static int npic_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfo.PIC_TYPE); }
    /** Unsafe version of {@link #sps_video_parameter_set_id}. */
    public static byte nsps_video_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pps_seq_parameter_set_id}. */
    public static byte npps_seq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pps_pic_parameter_set_id}. */
    public static byte npps_pic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #short_term_ref_pic_set_idx}. */
    public static byte nshort_term_ref_pic_set_idx(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.SHORT_TERM_REF_PIC_SET_IDX); }
    /** Unsafe version of {@link #PicOrderCntVal}. */
    public static int nPicOrderCntVal(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfo.PICORDERCNTVAL); }
    /** Unsafe version of {@link #TemporalId}. */
    public static byte nTemporalId(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.TEMPORALID); }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265PictureInfo.RESERVED1, 7); }
    public static byte nreserved1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265PictureInfo.RESERVED1 + check(index, 7) * 1);
    }
    /** Unsafe version of {@link #pRefLists}. */
    public static StdVideoEncodeH265ReferenceModifications npRefLists(long struct) { return StdVideoEncodeH265ReferenceModifications.create(memGetAddress(struct + StdVideoEncodeH265PictureInfo.PREFLISTS)); }
    /** Unsafe version of {@link #pShortTermRefPicSet}. */
    public static StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long struct) { return StdVideoH265ShortTermRefPicSet.create(memGetAddress(struct + StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET)); }
    /** Unsafe version of {@link #pLongTermRefPics}. */
    public static StdVideoEncodeH265LongTermRefPics npLongTermRefPics(long struct) { return StdVideoEncodeH265LongTermRefPics.create(memGetAddress(struct + StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS)); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265PictureInfo.FLAGS, StdVideoEncodeH265PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #pic_type(int) pic_type}. */
    public static void npic_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfo.PIC_TYPE, value); }
    /** Unsafe version of {@link #sps_video_parameter_set_id(byte) sps_video_parameter_set_id}. */
    public static void nsps_video_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.SPS_VIDEO_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pps_seq_parameter_set_id(byte) pps_seq_parameter_set_id}. */
    public static void npps_seq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.PPS_SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pps_pic_parameter_set_id(byte) pps_pic_parameter_set_id}. */
    public static void npps_pic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #short_term_ref_pic_set_idx(byte) short_term_ref_pic_set_idx}. */
    public static void nshort_term_ref_pic_set_idx(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.SHORT_TERM_REF_PIC_SET_IDX, value); }
    /** Unsafe version of {@link #PicOrderCntVal(int) PicOrderCntVal}. */
    public static void nPicOrderCntVal(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfo.PICORDERCNTVAL, value); }
    /** Unsafe version of {@link #TemporalId(byte) TemporalId}. */
    public static void nTemporalId(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.TEMPORALID, value); }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265PictureInfo.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265PictureInfo.RESERVED1 + check(index, 7) * 1, value);
    }
    /** Unsafe version of {@link #pRefLists(StdVideoEncodeH265ReferenceModifications) pRefLists}. */
    public static void npRefLists(long struct, StdVideoEncodeH265ReferenceModifications value) { memPutAddress(struct + StdVideoEncodeH265PictureInfo.PREFLISTS, value.address()); }
    /** Unsafe version of {@link #pShortTermRefPicSet(StdVideoH265ShortTermRefPicSet) pShortTermRefPicSet}. */
    public static void npShortTermRefPicSet(long struct, StdVideoH265ShortTermRefPicSet value) { memPutAddress(struct + StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET, value.address()); }
    /** Unsafe version of {@link #pLongTermRefPics(StdVideoEncodeH265LongTermRefPics) pLongTermRefPics}. */
    public static void npLongTermRefPics(long struct, StdVideoEncodeH265LongTermRefPics value) { memPutAddress(struct + StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH265PictureInfo.PREFLISTS));
        check(memGetAddress(struct + StdVideoEncodeH265PictureInfo.PSHORTTERMREFPICSET));
        check(memGetAddress(struct + StdVideoEncodeH265PictureInfo.PLONGTERMREFPICS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265PictureInfo ELEMENT_FACTORY = StdVideoEncodeH265PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265PictureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265PictureInfo#SIZEOF}, and its mark will be undefined.</p>
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

        /** @return a {@link StdVideoEncodeH265PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265PictureInfoFlags flags() { return StdVideoEncodeH265PictureInfo.nflags(address()); }
        /** @return the value of the {@code pic_type} field. */
        @NativeType("StdVideoH265PictureType")
        public int pic_type() { return StdVideoEncodeH265PictureInfo.npic_type(address()); }
        /** @return the value of the {@code sps_video_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte sps_video_parameter_set_id() { return StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(address()); }
        /** @return the value of the {@code pps_seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() { return StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(address()); }
        /** @return the value of the {@code pps_pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() { return StdVideoEncodeH265PictureInfo.npps_pic_parameter_set_id(address()); }
        /** @return the value of the {@code short_term_ref_pic_set_idx} field. */
        @NativeType("uint8_t")
        public byte short_term_ref_pic_set_idx() { return StdVideoEncodeH265PictureInfo.nshort_term_ref_pic_set_idx(address()); }
        /** @return the value of the {@code PicOrderCntVal} field. */
        @NativeType("int32_t")
        public int PicOrderCntVal() { return StdVideoEncodeH265PictureInfo.nPicOrderCntVal(address()); }
        /** @return the value of the {@code TemporalId} field. */
        @NativeType("uint8_t")
        public byte TemporalId() { return StdVideoEncodeH265PictureInfo.nTemporalId(address()); }
        /** @return a {@link StdVideoEncodeH265ReferenceModifications} view of the struct pointed to by the {@code pRefLists} field. */
        @NativeType("StdVideoEncodeH265ReferenceModifications const *")
        public StdVideoEncodeH265ReferenceModifications pRefLists() { return StdVideoEncodeH265PictureInfo.npRefLists(address()); }
        /** @return a {@link StdVideoH265ShortTermRefPicSet} view of the struct pointed to by the {@code pShortTermRefPicSet} field. */
        @NativeType("StdVideoH265ShortTermRefPicSet const *")
        public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() { return StdVideoEncodeH265PictureInfo.npShortTermRefPicSet(address()); }
        /** @return a {@link StdVideoEncodeH265LongTermRefPics} view of the struct pointed to by the {@code pLongTermRefPics} field. */
        @NativeType("StdVideoEncodeH265LongTermRefPics const *")
        public StdVideoEncodeH265LongTermRefPics pLongTermRefPics() { return StdVideoEncodeH265PictureInfo.npLongTermRefPics(address()); }

        /** Copies the specified {@link StdVideoEncodeH265PictureInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH265PictureInfo.Buffer flags(StdVideoEncodeH265PictureInfoFlags value) { StdVideoEncodeH265PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code pic_type} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pic_type(@NativeType("StdVideoH265PictureType") int value) { StdVideoEncodeH265PictureInfo.npic_type(address(), value); return this; }
        /** Sets the specified value to the {@code sps_video_parameter_set_id} field. */
        public StdVideoEncodeH265PictureInfo.Buffer sps_video_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.nsps_video_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pps_seq_parameter_set_id} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.npps_seq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pps_pic_parameter_set_id} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.npps_pic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_idx} field. */
        public StdVideoEncodeH265PictureInfo.Buffer short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.nshort_term_ref_pic_set_idx(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCntVal} field. */
        public StdVideoEncodeH265PictureInfo.Buffer PicOrderCntVal(@NativeType("int32_t") int value) { StdVideoEncodeH265PictureInfo.nPicOrderCntVal(address(), value); return this; }
        /** Sets the specified value to the {@code TemporalId} field. */
        public StdVideoEncodeH265PictureInfo.Buffer TemporalId(@NativeType("uint8_t") byte value) { StdVideoEncodeH265PictureInfo.nTemporalId(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceModifications} to the {@code pRefLists} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pRefLists(@NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) { StdVideoEncodeH265PictureInfo.npRefLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265ShortTermRefPicSet} to the {@code pShortTermRefPicSet} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) { StdVideoEncodeH265PictureInfo.npShortTermRefPicSet(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265LongTermRefPics} to the {@code pLongTermRefPics} field. */
        public StdVideoEncodeH265PictureInfo.Buffer pLongTermRefPics(@NativeType("StdVideoEncodeH265LongTermRefPics const *") StdVideoEncodeH265LongTermRefPics value) { StdVideoEncodeH265PictureInfo.npLongTermRefPics(address(), value); return this; }

    }

}