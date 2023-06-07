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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoDecodeH265PictureInfo {
 *     {@link StdVideoDecodeH265PictureInfoFlags StdVideoDecodeH265PictureInfoFlags} flags;
 *     uint8_t sps_seq_parameter_set_id;
 *     uint8_t pps_pic_parameter_set_id;
 *     uint8_t NumDeltaPocsOfRefRpsIdx;
 *     int32_t PicOrderCntVal;
 *     uint16_t {@link #NumBitsForSTRefPicSetInSlice};
 *     uint16_t reserved;
 *     uint8_t {@link #RefPicSetStCurrBefore}[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE];
 *     uint8_t {@link #RefPicSetStCurrAfter}[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE];
 *     uint8_t {@link #RefPicSetLtCurr}[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE];
 * }</code></pre>
 */
public class StdVideoDecodeH265PictureInfo extends Struct<StdVideoDecodeH265PictureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        SPS_SEQ_PARAMETER_SET_ID,
        PPS_PIC_PARAMETER_SET_ID,
        NUMDELTAPOCSOFREFRPSIDX,
        PICORDERCNTVAL,
        NUMBITSFORSTREFPICSETINSLICE,
        RESERVED,
        REFPICSETSTCURRBEFORE,
        REFPICSETSTCURRAFTER,
        REFPICSETLTCURR;

    static {
        Layout layout = __struct(
            __member(StdVideoDecodeH265PictureInfoFlags.SIZEOF, StdVideoDecodeH265PictureInfoFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(2),
            __member(2),
            __array(1, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE),
            __array(1, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE),
            __array(1, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        SPS_SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        PPS_PIC_PARAMETER_SET_ID = layout.offsetof(2);
        NUMDELTAPOCSOFREFRPSIDX = layout.offsetof(3);
        PICORDERCNTVAL = layout.offsetof(4);
        NUMBITSFORSTREFPICSETINSLICE = layout.offsetof(5);
        RESERVED = layout.offsetof(6);
        REFPICSETSTCURRBEFORE = layout.offsetof(7);
        REFPICSETSTCURRAFTER = layout.offsetof(8);
        REFPICSETLTCURR = layout.offsetof(9);
    }

    protected StdVideoDecodeH265PictureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeH265PictureInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeH265PictureInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeH265PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH265PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoDecodeH265PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeH265PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code sps_seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte sps_seq_parameter_set_id() { return nsps_seq_parameter_set_id(address()); }
    /** @return the value of the {@code pps_pic_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() { return npps_pic_parameter_set_id(address()); }
    /** @return the value of the {@code NumDeltaPocsOfRefRpsIdx} field. */
    @NativeType("uint8_t")
    public byte NumDeltaPocsOfRefRpsIdx() { return nNumDeltaPocsOfRefRpsIdx(address()); }
    /** @return the value of the {@code PicOrderCntVal} field. */
    @NativeType("int32_t")
    public int PicOrderCntVal() { return nPicOrderCntVal(address()); }
    /** number of bits used in st_ref_pic_set() when short_term_ref_pic_set_sps_flag is 0; otherwise set to 0 */
    @NativeType("uint16_t")
    public short NumBitsForSTRefPicSetInSlice() { return nNumBitsForSTRefPicSetInSlice(address()); }
    /** slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex */
    @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
    public ByteBuffer RefPicSetStCurrBefore() { return nRefPicSetStCurrBefore(address()); }
    /** slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex */
    @NativeType("uint8_t")
    public byte RefPicSetStCurrBefore(int index) { return nRefPicSetStCurrBefore(address(), index); }
    /** slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex */
    @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
    public ByteBuffer RefPicSetStCurrAfter() { return nRefPicSetStCurrAfter(address()); }
    /** slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex */
    @NativeType("uint8_t")
    public byte RefPicSetStCurrAfter(int index) { return nRefPicSetStCurrAfter(address(), index); }
    /** slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex */
    @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
    public ByteBuffer RefPicSetLtCurr() { return nRefPicSetLtCurr(address()); }
    /** slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex */
    @NativeType("uint8_t")
    public byte RefPicSetLtCurr(int index) { return nRefPicSetLtCurr(address(), index); }

    /** Copies the specified {@link StdVideoDecodeH265PictureInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeH265PictureInfo flags(StdVideoDecodeH265PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeH265PictureInfo flags(java.util.function.Consumer<StdVideoDecodeH265PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code sps_seq_parameter_set_id} field. */
    public StdVideoDecodeH265PictureInfo sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { nsps_seq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pps_pic_parameter_set_id} field. */
    public StdVideoDecodeH265PictureInfo pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) { npps_pic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code NumDeltaPocsOfRefRpsIdx} field. */
    public StdVideoDecodeH265PictureInfo NumDeltaPocsOfRefRpsIdx(@NativeType("uint8_t") byte value) { nNumDeltaPocsOfRefRpsIdx(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCntVal} field. */
    public StdVideoDecodeH265PictureInfo PicOrderCntVal(@NativeType("int32_t") int value) { nPicOrderCntVal(address(), value); return this; }
    /** Sets the specified value to the {@link #NumBitsForSTRefPicSetInSlice} field. */
    public StdVideoDecodeH265PictureInfo NumBitsForSTRefPicSetInSlice(@NativeType("uint16_t") short value) { nNumBitsForSTRefPicSetInSlice(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #RefPicSetStCurrBefore} field. */
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) { nRefPicSetStCurrBefore(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #RefPicSetStCurrBefore} field. */
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrBefore(int index, @NativeType("uint8_t") byte value) { nRefPicSetStCurrBefore(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #RefPicSetStCurrAfter} field. */
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) { nRefPicSetStCurrAfter(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #RefPicSetStCurrAfter} field. */
    public StdVideoDecodeH265PictureInfo RefPicSetStCurrAfter(int index, @NativeType("uint8_t") byte value) { nRefPicSetStCurrAfter(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #RefPicSetLtCurr} field. */
    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) { nRefPicSetLtCurr(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #RefPicSetLtCurr} field. */
    public StdVideoDecodeH265PictureInfo RefPicSetLtCurr(int index, @NativeType("uint8_t") byte value) { nRefPicSetLtCurr(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH265PictureInfo set(
        StdVideoDecodeH265PictureInfoFlags flags,
        byte sps_seq_parameter_set_id,
        byte pps_pic_parameter_set_id,
        byte NumDeltaPocsOfRefRpsIdx,
        int PicOrderCntVal,
        short NumBitsForSTRefPicSetInSlice,
        ByteBuffer RefPicSetStCurrBefore,
        ByteBuffer RefPicSetStCurrAfter,
        ByteBuffer RefPicSetLtCurr
    ) {
        flags(flags);
        sps_seq_parameter_set_id(sps_seq_parameter_set_id);
        pps_pic_parameter_set_id(pps_pic_parameter_set_id);
        NumDeltaPocsOfRefRpsIdx(NumDeltaPocsOfRefRpsIdx);
        PicOrderCntVal(PicOrderCntVal);
        NumBitsForSTRefPicSetInSlice(NumBitsForSTRefPicSetInSlice);
        RefPicSetStCurrBefore(RefPicSetStCurrBefore);
        RefPicSetStCurrAfter(RefPicSetStCurrAfter);
        RefPicSetLtCurr(RefPicSetLtCurr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH265PictureInfo set(StdVideoDecodeH265PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH265PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265PictureInfo malloc() {
        return new StdVideoDecodeH265PictureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeH265PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265PictureInfo calloc() {
        return new StdVideoDecodeH265PictureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeH265PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH265PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH265PictureInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH265PictureInfo} instance for the specified memory address. */
    public static StdVideoDecodeH265PictureInfo create(long address) {
        return new StdVideoDecodeH265PictureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265PictureInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeH265PictureInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeH265PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265PictureInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH265PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeH265PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeH265PictureInfoFlags nflags(long struct) { return StdVideoDecodeH265PictureInfoFlags.create(struct + StdVideoDecodeH265PictureInfo.FLAGS); }
    /** Unsafe version of {@link #sps_seq_parameter_set_id}. */
    public static byte nsps_seq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoDecodeH265PictureInfo.SPS_SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pps_pic_parameter_set_id}. */
    public static byte npps_pic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoDecodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #NumDeltaPocsOfRefRpsIdx}. */
    public static byte nNumDeltaPocsOfRefRpsIdx(long struct) { return UNSAFE.getByte(null, struct + StdVideoDecodeH265PictureInfo.NUMDELTAPOCSOFREFRPSIDX); }
    /** Unsafe version of {@link #PicOrderCntVal}. */
    public static int nPicOrderCntVal(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH265PictureInfo.PICORDERCNTVAL); }
    /** Unsafe version of {@link #NumBitsForSTRefPicSetInSlice}. */
    public static short nNumBitsForSTRefPicSetInSlice(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH265PictureInfo.NUMBITSFORSTREFPICSETINSLICE); }
    public static short nreserved(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH265PictureInfo.RESERVED); }
    /** Unsafe version of {@link #RefPicSetStCurrBefore}. */
    public static ByteBuffer nRefPicSetStCurrBefore(long struct) { return memByteBuffer(struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRBEFORE, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE); }
    /** Unsafe version of {@link #RefPicSetStCurrBefore(int) RefPicSetStCurrBefore}. */
    public static byte nRefPicSetStCurrBefore(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRBEFORE + check(index, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #RefPicSetStCurrAfter}. */
    public static ByteBuffer nRefPicSetStCurrAfter(long struct) { return memByteBuffer(struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRAFTER, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE); }
    /** Unsafe version of {@link #RefPicSetStCurrAfter(int) RefPicSetStCurrAfter}. */
    public static byte nRefPicSetStCurrAfter(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRAFTER + check(index, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #RefPicSetLtCurr}. */
    public static ByteBuffer nRefPicSetLtCurr(long struct) { return memByteBuffer(struct + StdVideoDecodeH265PictureInfo.REFPICSETLTCURR, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE); }
    /** Unsafe version of {@link #RefPicSetLtCurr(int) RefPicSetLtCurr}. */
    public static byte nRefPicSetLtCurr(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoDecodeH265PictureInfo.REFPICSETLTCURR + check(index, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoDecodeH265PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeH265PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeH265PictureInfo.FLAGS, StdVideoDecodeH265PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #sps_seq_parameter_set_id(byte) sps_seq_parameter_set_id}. */
    public static void nsps_seq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoDecodeH265PictureInfo.SPS_SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pps_pic_parameter_set_id(byte) pps_pic_parameter_set_id}. */
    public static void npps_pic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoDecodeH265PictureInfo.PPS_PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #NumDeltaPocsOfRefRpsIdx(byte) NumDeltaPocsOfRefRpsIdx}. */
    public static void nNumDeltaPocsOfRefRpsIdx(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoDecodeH265PictureInfo.NUMDELTAPOCSOFREFRPSIDX, value); }
    /** Unsafe version of {@link #PicOrderCntVal(int) PicOrderCntVal}. */
    public static void nPicOrderCntVal(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH265PictureInfo.PICORDERCNTVAL, value); }
    /** Unsafe version of {@link #NumBitsForSTRefPicSetInSlice(short) NumBitsForSTRefPicSetInSlice}. */
    public static void nNumBitsForSTRefPicSetInSlice(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH265PictureInfo.NUMBITSFORSTREFPICSETINSLICE, value); }
    public static void nreserved(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH265PictureInfo.RESERVED, value); }
    /** Unsafe version of {@link #RefPicSetStCurrBefore(ByteBuffer) RefPicSetStCurrBefore}. */
    public static void nRefPicSetStCurrBefore(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRBEFORE, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicSetStCurrBefore(int, byte) RefPicSetStCurrBefore}. */
    public static void nRefPicSetStCurrBefore(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRBEFORE + check(index, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #RefPicSetStCurrAfter(ByteBuffer) RefPicSetStCurrAfter}. */
    public static void nRefPicSetStCurrAfter(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRAFTER, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicSetStCurrAfter(int, byte) RefPicSetStCurrAfter}. */
    public static void nRefPicSetStCurrAfter(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoDecodeH265PictureInfo.REFPICSETSTCURRAFTER + check(index, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #RefPicSetLtCurr(ByteBuffer) RefPicSetLtCurr}. */
    public static void nRefPicSetLtCurr(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoDecodeH265PictureInfo.REFPICSETLTCURR, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicSetLtCurr(int, byte) RefPicSetLtCurr}. */
    public static void nRefPicSetLtCurr(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoDecodeH265PictureInfo.REFPICSETLTCURR + check(index, STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH265PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeH265PictureInfo ELEMENT_FACTORY = StdVideoDecodeH265PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH265PictureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH265PictureInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeH265PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoDecodeH265PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeH265PictureInfoFlags flags() { return StdVideoDecodeH265PictureInfo.nflags(address()); }
        /** @return the value of the {@code sps_seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte sps_seq_parameter_set_id() { return StdVideoDecodeH265PictureInfo.nsps_seq_parameter_set_id(address()); }
        /** @return the value of the {@code pps_pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() { return StdVideoDecodeH265PictureInfo.npps_pic_parameter_set_id(address()); }
        /** @return the value of the {@code NumDeltaPocsOfRefRpsIdx} field. */
        @NativeType("uint8_t")
        public byte NumDeltaPocsOfRefRpsIdx() { return StdVideoDecodeH265PictureInfo.nNumDeltaPocsOfRefRpsIdx(address()); }
        /** @return the value of the {@code PicOrderCntVal} field. */
        @NativeType("int32_t")
        public int PicOrderCntVal() { return StdVideoDecodeH265PictureInfo.nPicOrderCntVal(address()); }
        /** @return the value of the {@link StdVideoDecodeH265PictureInfo#NumBitsForSTRefPicSetInSlice} field. */
        @NativeType("uint16_t")
        public short NumBitsForSTRefPicSetInSlice() { return StdVideoDecodeH265PictureInfo.nNumBitsForSTRefPicSetInSlice(address()); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrBefore} field. */
        @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
        public ByteBuffer RefPicSetStCurrBefore() { return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address()); }
        /** @return the value at the specified index of the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrBefore} field. */
        @NativeType("uint8_t")
        public byte RefPicSetStCurrBefore(int index) { return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrAfter} field. */
        @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
        public ByteBuffer RefPicSetStCurrAfter() { return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address()); }
        /** @return the value at the specified index of the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrAfter} field. */
        @NativeType("uint8_t")
        public byte RefPicSetStCurrAfter(int index) { return StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoDecodeH265PictureInfo#RefPicSetLtCurr} field. */
        @NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]")
        public ByteBuffer RefPicSetLtCurr() { return StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address()); }
        /** @return the value at the specified index of the {@link StdVideoDecodeH265PictureInfo#RefPicSetLtCurr} field. */
        @NativeType("uint8_t")
        public byte RefPicSetLtCurr(int index) { return StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address(), index); }

        /** Copies the specified {@link StdVideoDecodeH265PictureInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeH265PictureInfo.Buffer flags(StdVideoDecodeH265PictureInfoFlags value) { StdVideoDecodeH265PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeH265PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeH265PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code sps_seq_parameter_set_id} field. */
        public StdVideoDecodeH265PictureInfo.Buffer sps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.nsps_seq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pps_pic_parameter_set_id} field. */
        public StdVideoDecodeH265PictureInfo.Buffer pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.npps_pic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code NumDeltaPocsOfRefRpsIdx} field. */
        public StdVideoDecodeH265PictureInfo.Buffer NumDeltaPocsOfRefRpsIdx(@NativeType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.nNumDeltaPocsOfRefRpsIdx(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCntVal} field. */
        public StdVideoDecodeH265PictureInfo.Buffer PicOrderCntVal(@NativeType("int32_t") int value) { StdVideoDecodeH265PictureInfo.nPicOrderCntVal(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH265PictureInfo#NumBitsForSTRefPicSetInSlice} field. */
        public StdVideoDecodeH265PictureInfo.Buffer NumBitsForSTRefPicSetInSlice(@NativeType("uint16_t") short value) { StdVideoDecodeH265PictureInfo.nNumBitsForSTRefPicSetInSlice(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrBefore} field. */
        public StdVideoDecodeH265PictureInfo.Buffer RefPicSetStCurrBefore(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) { StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrBefore} field. */
        public StdVideoDecodeH265PictureInfo.Buffer RefPicSetStCurrBefore(int index, @NativeType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.nRefPicSetStCurrBefore(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrAfter} field. */
        public StdVideoDecodeH265PictureInfo.Buffer RefPicSetStCurrAfter(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) { StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoDecodeH265PictureInfo#RefPicSetStCurrAfter} field. */
        public StdVideoDecodeH265PictureInfo.Buffer RefPicSetStCurrAfter(int index, @NativeType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.nRefPicSetStCurrAfter(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoDecodeH265PictureInfo#RefPicSetLtCurr} field. */
        public StdVideoDecodeH265PictureInfo.Buffer RefPicSetLtCurr(@NativeType("uint8_t[STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE]") ByteBuffer value) { StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoDecodeH265PictureInfo#RefPicSetLtCurr} field. */
        public StdVideoDecodeH265PictureInfo.Buffer RefPicSetLtCurr(int index, @NativeType("uint8_t") byte value) { StdVideoDecodeH265PictureInfo.nRefPicSetLtCurr(address(), index, value); return this; }

    }

}