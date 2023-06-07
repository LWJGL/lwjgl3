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
 * struct StdVideoEncodeH264SliceHeader {
 *     {@link StdVideoEncodeH264SliceHeaderFlags StdVideoEncodeH264SliceHeaderFlags} flags;
 *     uint32_t first_mb_in_slice;
 *     StdVideoH264SliceType slice_type;
 *     uint16_t idr_pic_id;
 *     uint8_t num_ref_idx_l0_active_minus1;
 *     uint8_t num_ref_idx_l1_active_minus1;
 *     StdVideoH264CabacInitIdc cabac_init_idc;
 *     StdVideoH264DisableDeblockingFilterIdc disable_deblocking_filter_idc;
 *     int8_t slice_alpha_c0_offset_div2;
 *     int8_t slice_beta_offset_div2;
 *     uint16_t reserved1;
 *     uint32_t reserved2;
 *     {@link StdVideoEncodeH264WeightTable StdVideoEncodeH264WeightTable} const * pWeightTable;
 * }</code></pre>
 */
public class StdVideoEncodeH264SliceHeader extends Struct<StdVideoEncodeH264SliceHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FIRST_MB_IN_SLICE,
        SLICE_TYPE,
        IDR_PIC_ID,
        NUM_REF_IDX_L0_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_ACTIVE_MINUS1,
        CABAC_INIT_IDC,
        DISABLE_DEBLOCKING_FILTER_IDC,
        SLICE_ALPHA_C0_OFFSET_DIV2,
        SLICE_BETA_OFFSET_DIV2,
        RESERVED1,
        RESERVED2,
        PWEIGHTTABLE;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264SliceHeaderFlags.SIZEOF, StdVideoEncodeH264SliceHeaderFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(2),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(2),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        FIRST_MB_IN_SLICE = layout.offsetof(1);
        SLICE_TYPE = layout.offsetof(2);
        IDR_PIC_ID = layout.offsetof(3);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(4);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(5);
        CABAC_INIT_IDC = layout.offsetof(6);
        DISABLE_DEBLOCKING_FILTER_IDC = layout.offsetof(7);
        SLICE_ALPHA_C0_OFFSET_DIV2 = layout.offsetof(8);
        SLICE_BETA_OFFSET_DIV2 = layout.offsetof(9);
        RESERVED1 = layout.offsetof(10);
        RESERVED2 = layout.offsetof(11);
        PWEIGHTTABLE = layout.offsetof(12);
    }

    protected StdVideoEncodeH264SliceHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264SliceHeader create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264SliceHeader(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264SliceHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264SliceHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264SliceHeaderFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264SliceHeaderFlags flags() { return nflags(address()); }
    /** @return the value of the {@code first_mb_in_slice} field. */
    @NativeType("uint32_t")
    public int first_mb_in_slice() { return nfirst_mb_in_slice(address()); }
    /** @return the value of the {@code slice_type} field. */
    @NativeType("StdVideoH264SliceType")
    public int slice_type() { return nslice_type(address()); }
    /** @return the value of the {@code idr_pic_id} field. */
    @NativeType("uint16_t")
    public short idr_pic_id() { return nidr_pic_id(address()); }
    /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() { return nnum_ref_idx_l0_active_minus1(address()); }
    /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() { return nnum_ref_idx_l1_active_minus1(address()); }
    /** @return the value of the {@code cabac_init_idc} field. */
    @NativeType("StdVideoH264CabacInitIdc")
    public int cabac_init_idc() { return ncabac_init_idc(address()); }
    /** @return the value of the {@code disable_deblocking_filter_idc} field. */
    @NativeType("StdVideoH264DisableDeblockingFilterIdc")
    public int disable_deblocking_filter_idc() { return ndisable_deblocking_filter_idc(address()); }
    /** @return the value of the {@code slice_alpha_c0_offset_div2} field. */
    @NativeType("int8_t")
    public byte slice_alpha_c0_offset_div2() { return nslice_alpha_c0_offset_div2(address()); }
    /** @return the value of the {@code slice_beta_offset_div2} field. */
    @NativeType("int8_t")
    public byte slice_beta_offset_div2() { return nslice_beta_offset_div2(address()); }
    /** @return the value of the {@code reserved1} field. */
    @NativeType("uint16_t")
    public short reserved1() { return nreserved1(address()); }
    /** @return the value of the {@code reserved2} field. */
    @NativeType("uint32_t")
    public int reserved2() { return nreserved2(address()); }
    /** @return a {@link StdVideoEncodeH264WeightTable} view of the struct pointed to by the {@code pWeightTable} field. */
    @NativeType("StdVideoEncodeH264WeightTable const *")
    public StdVideoEncodeH264WeightTable pWeightTable() { return npWeightTable(address()); }

    /** Copies the specified {@link StdVideoEncodeH264SliceHeaderFlags} to the {@code flags} field. */
    public StdVideoEncodeH264SliceHeader flags(StdVideoEncodeH264SliceHeaderFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264SliceHeader flags(java.util.function.Consumer<StdVideoEncodeH264SliceHeaderFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code first_mb_in_slice} field. */
    public StdVideoEncodeH264SliceHeader first_mb_in_slice(@NativeType("uint32_t") int value) { nfirst_mb_in_slice(address(), value); return this; }
    /** Sets the specified value to the {@code slice_type} field. */
    public StdVideoEncodeH264SliceHeader slice_type(@NativeType("StdVideoH264SliceType") int value) { nslice_type(address(), value); return this; }
    /** Sets the specified value to the {@code idr_pic_id} field. */
    public StdVideoEncodeH264SliceHeader idr_pic_id(@NativeType("uint16_t") short value) { nidr_pic_id(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
    public StdVideoEncodeH264SliceHeader num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
    public StdVideoEncodeH264SliceHeader num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code cabac_init_idc} field. */
    public StdVideoEncodeH264SliceHeader cabac_init_idc(@NativeType("StdVideoH264CabacInitIdc") int value) { ncabac_init_idc(address(), value); return this; }
    /** Sets the specified value to the {@code disable_deblocking_filter_idc} field. */
    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idc(@NativeType("StdVideoH264DisableDeblockingFilterIdc") int value) { ndisable_deblocking_filter_idc(address(), value); return this; }
    /** Sets the specified value to the {@code slice_alpha_c0_offset_div2} field. */
    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2(@NativeType("int8_t") byte value) { nslice_alpha_c0_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@code slice_beta_offset_div2} field. */
    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2(@NativeType("int8_t") byte value) { nslice_beta_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@code reserved1} field. */
    public StdVideoEncodeH264SliceHeader reserved1(@NativeType("uint16_t") short value) { nreserved1(address(), value); return this; }
    /** Sets the specified value to the {@code reserved2} field. */
    public StdVideoEncodeH264SliceHeader reserved2(@NativeType("uint32_t") int value) { nreserved2(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264WeightTable} to the {@code pWeightTable} field. */
    public StdVideoEncodeH264SliceHeader pWeightTable(@NativeType("StdVideoEncodeH264WeightTable const *") StdVideoEncodeH264WeightTable value) { npWeightTable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264SliceHeader set(
        StdVideoEncodeH264SliceHeaderFlags flags,
        int first_mb_in_slice,
        int slice_type,
        short idr_pic_id,
        byte num_ref_idx_l0_active_minus1,
        byte num_ref_idx_l1_active_minus1,
        int cabac_init_idc,
        int disable_deblocking_filter_idc,
        byte slice_alpha_c0_offset_div2,
        byte slice_beta_offset_div2,
        short reserved1,
        int reserved2,
        StdVideoEncodeH264WeightTable pWeightTable
    ) {
        flags(flags);
        first_mb_in_slice(first_mb_in_slice);
        slice_type(slice_type);
        idr_pic_id(idr_pic_id);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        cabac_init_idc(cabac_init_idc);
        disable_deblocking_filter_idc(disable_deblocking_filter_idc);
        slice_alpha_c0_offset_div2(slice_alpha_c0_offset_div2);
        slice_beta_offset_div2(slice_beta_offset_div2);
        reserved1(reserved1);
        reserved2(reserved2);
        pWeightTable(pWeightTable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264SliceHeader set(StdVideoEncodeH264SliceHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264SliceHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264SliceHeader malloc() {
        return new StdVideoEncodeH264SliceHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264SliceHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264SliceHeader calloc() {
        return new StdVideoEncodeH264SliceHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264SliceHeader} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264SliceHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264SliceHeader(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264SliceHeader} instance for the specified memory address. */
    public static StdVideoEncodeH264SliceHeader create(long address) {
        return new StdVideoEncodeH264SliceHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264SliceHeader createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264SliceHeader(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264SliceHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264SliceHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264SliceHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264SliceHeader malloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264SliceHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264SliceHeader calloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264SliceHeaderFlags nflags(long struct) { return StdVideoEncodeH264SliceHeaderFlags.create(struct + StdVideoEncodeH264SliceHeader.FLAGS); }
    /** Unsafe version of {@link #first_mb_in_slice}. */
    public static int nfirst_mb_in_slice(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264SliceHeader.FIRST_MB_IN_SLICE); }
    /** Unsafe version of {@link #slice_type}. */
    public static int nslice_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264SliceHeader.SLICE_TYPE); }
    /** Unsafe version of {@link #idr_pic_id}. */
    public static short nidr_pic_id(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264SliceHeader.IDR_PIC_ID); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1}. */
    public static byte nnum_ref_idx_l0_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264SliceHeader.NUM_REF_IDX_L0_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1}. */
    public static byte nnum_ref_idx_l1_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264SliceHeader.NUM_REF_IDX_L1_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #cabac_init_idc}. */
    public static int ncabac_init_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264SliceHeader.CABAC_INIT_IDC); }
    /** Unsafe version of {@link #disable_deblocking_filter_idc}. */
    public static int ndisable_deblocking_filter_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264SliceHeader.DISABLE_DEBLOCKING_FILTER_IDC); }
    /** Unsafe version of {@link #slice_alpha_c0_offset_div2}. */
    public static byte nslice_alpha_c0_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264SliceHeader.SLICE_ALPHA_C0_OFFSET_DIV2); }
    /** Unsafe version of {@link #slice_beta_offset_div2}. */
    public static byte nslice_beta_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264SliceHeader.SLICE_BETA_OFFSET_DIV2); }
    /** Unsafe version of {@link #reserved1}. */
    public static short nreserved1(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264SliceHeader.RESERVED1); }
    /** Unsafe version of {@link #reserved2}. */
    public static int nreserved2(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264SliceHeader.RESERVED2); }
    /** Unsafe version of {@link #pWeightTable}. */
    public static StdVideoEncodeH264WeightTable npWeightTable(long struct) { return StdVideoEncodeH264WeightTable.create(memGetAddress(struct + StdVideoEncodeH264SliceHeader.PWEIGHTTABLE)); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264SliceHeaderFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264SliceHeaderFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264SliceHeader.FLAGS, StdVideoEncodeH264SliceHeaderFlags.SIZEOF); }
    /** Unsafe version of {@link #first_mb_in_slice(int) first_mb_in_slice}. */
    public static void nfirst_mb_in_slice(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264SliceHeader.FIRST_MB_IN_SLICE, value); }
    /** Unsafe version of {@link #slice_type(int) slice_type}. */
    public static void nslice_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264SliceHeader.SLICE_TYPE, value); }
    /** Unsafe version of {@link #idr_pic_id(short) idr_pic_id}. */
    public static void nidr_pic_id(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264SliceHeader.IDR_PIC_ID, value); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1(byte) num_ref_idx_l0_active_minus1}. */
    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264SliceHeader.NUM_REF_IDX_L0_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1(byte) num_ref_idx_l1_active_minus1}. */
    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264SliceHeader.NUM_REF_IDX_L1_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #cabac_init_idc(int) cabac_init_idc}. */
    public static void ncabac_init_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264SliceHeader.CABAC_INIT_IDC, value); }
    /** Unsafe version of {@link #disable_deblocking_filter_idc(int) disable_deblocking_filter_idc}. */
    public static void ndisable_deblocking_filter_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264SliceHeader.DISABLE_DEBLOCKING_FILTER_IDC, value); }
    /** Unsafe version of {@link #slice_alpha_c0_offset_div2(byte) slice_alpha_c0_offset_div2}. */
    public static void nslice_alpha_c0_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264SliceHeader.SLICE_ALPHA_C0_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #slice_beta_offset_div2(byte) slice_beta_offset_div2}. */
    public static void nslice_beta_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264SliceHeader.SLICE_BETA_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #reserved1(short) reserved1}. */
    public static void nreserved1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264SliceHeader.RESERVED1, value); }
    /** Unsafe version of {@link #reserved2(int) reserved2}. */
    public static void nreserved2(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264SliceHeader.RESERVED2, value); }
    /** Unsafe version of {@link #pWeightTable(StdVideoEncodeH264WeightTable) pWeightTable}. */
    public static void npWeightTable(long struct, StdVideoEncodeH264WeightTable value) { memPutAddress(struct + StdVideoEncodeH264SliceHeader.PWEIGHTTABLE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH264SliceHeader.PWEIGHTTABLE));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264SliceHeader} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264SliceHeader, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264SliceHeader ELEMENT_FACTORY = StdVideoEncodeH264SliceHeader.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264SliceHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264SliceHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264SliceHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264SliceHeaderFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264SliceHeaderFlags flags() { return StdVideoEncodeH264SliceHeader.nflags(address()); }
        /** @return the value of the {@code first_mb_in_slice} field. */
        @NativeType("uint32_t")
        public int first_mb_in_slice() { return StdVideoEncodeH264SliceHeader.nfirst_mb_in_slice(address()); }
        /** @return the value of the {@code slice_type} field. */
        @NativeType("StdVideoH264SliceType")
        public int slice_type() { return StdVideoEncodeH264SliceHeader.nslice_type(address()); }
        /** @return the value of the {@code idr_pic_id} field. */
        @NativeType("uint16_t")
        public short idr_pic_id() { return StdVideoEncodeH264SliceHeader.nidr_pic_id(address()); }
        /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH264SliceHeader.nnum_ref_idx_l0_active_minus1(address()); }
        /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH264SliceHeader.nnum_ref_idx_l1_active_minus1(address()); }
        /** @return the value of the {@code cabac_init_idc} field. */
        @NativeType("StdVideoH264CabacInitIdc")
        public int cabac_init_idc() { return StdVideoEncodeH264SliceHeader.ncabac_init_idc(address()); }
        /** @return the value of the {@code disable_deblocking_filter_idc} field. */
        @NativeType("StdVideoH264DisableDeblockingFilterIdc")
        public int disable_deblocking_filter_idc() { return StdVideoEncodeH264SliceHeader.ndisable_deblocking_filter_idc(address()); }
        /** @return the value of the {@code slice_alpha_c0_offset_div2} field. */
        @NativeType("int8_t")
        public byte slice_alpha_c0_offset_div2() { return StdVideoEncodeH264SliceHeader.nslice_alpha_c0_offset_div2(address()); }
        /** @return the value of the {@code slice_beta_offset_div2} field. */
        @NativeType("int8_t")
        public byte slice_beta_offset_div2() { return StdVideoEncodeH264SliceHeader.nslice_beta_offset_div2(address()); }
        /** @return the value of the {@code reserved1} field. */
        @NativeType("uint16_t")
        public short reserved1() { return StdVideoEncodeH264SliceHeader.nreserved1(address()); }
        /** @return the value of the {@code reserved2} field. */
        @NativeType("uint32_t")
        public int reserved2() { return StdVideoEncodeH264SliceHeader.nreserved2(address()); }
        /** @return a {@link StdVideoEncodeH264WeightTable} view of the struct pointed to by the {@code pWeightTable} field. */
        @NativeType("StdVideoEncodeH264WeightTable const *")
        public StdVideoEncodeH264WeightTable pWeightTable() { return StdVideoEncodeH264SliceHeader.npWeightTable(address()); }

        /** Copies the specified {@link StdVideoEncodeH264SliceHeaderFlags} to the {@code flags} field. */
        public StdVideoEncodeH264SliceHeader.Buffer flags(StdVideoEncodeH264SliceHeaderFlags value) { StdVideoEncodeH264SliceHeader.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264SliceHeader.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264SliceHeaderFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code first_mb_in_slice} field. */
        public StdVideoEncodeH264SliceHeader.Buffer first_mb_in_slice(@NativeType("uint32_t") int value) { StdVideoEncodeH264SliceHeader.nfirst_mb_in_slice(address(), value); return this; }
        /** Sets the specified value to the {@code slice_type} field. */
        public StdVideoEncodeH264SliceHeader.Buffer slice_type(@NativeType("StdVideoH264SliceType") int value) { StdVideoEncodeH264SliceHeader.nslice_type(address(), value); return this; }
        /** Sets the specified value to the {@code idr_pic_id} field. */
        public StdVideoEncodeH264SliceHeader.Buffer idr_pic_id(@NativeType("uint16_t") short value) { StdVideoEncodeH264SliceHeader.nidr_pic_id(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
        public StdVideoEncodeH264SliceHeader.Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH264SliceHeader.nnum_ref_idx_l0_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
        public StdVideoEncodeH264SliceHeader.Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH264SliceHeader.nnum_ref_idx_l1_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code cabac_init_idc} field. */
        public StdVideoEncodeH264SliceHeader.Buffer cabac_init_idc(@NativeType("StdVideoH264CabacInitIdc") int value) { StdVideoEncodeH264SliceHeader.ncabac_init_idc(address(), value); return this; }
        /** Sets the specified value to the {@code disable_deblocking_filter_idc} field. */
        public StdVideoEncodeH264SliceHeader.Buffer disable_deblocking_filter_idc(@NativeType("StdVideoH264DisableDeblockingFilterIdc") int value) { StdVideoEncodeH264SliceHeader.ndisable_deblocking_filter_idc(address(), value); return this; }
        /** Sets the specified value to the {@code slice_alpha_c0_offset_div2} field. */
        public StdVideoEncodeH264SliceHeader.Buffer slice_alpha_c0_offset_div2(@NativeType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.nslice_alpha_c0_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@code slice_beta_offset_div2} field. */
        public StdVideoEncodeH264SliceHeader.Buffer slice_beta_offset_div2(@NativeType("int8_t") byte value) { StdVideoEncodeH264SliceHeader.nslice_beta_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@code reserved1} field. */
        public StdVideoEncodeH264SliceHeader.Buffer reserved1(@NativeType("uint16_t") short value) { StdVideoEncodeH264SliceHeader.nreserved1(address(), value); return this; }
        /** Sets the specified value to the {@code reserved2} field. */
        public StdVideoEncodeH264SliceHeader.Buffer reserved2(@NativeType("uint32_t") int value) { StdVideoEncodeH264SliceHeader.nreserved2(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264WeightTable} to the {@code pWeightTable} field. */
        public StdVideoEncodeH264SliceHeader.Buffer pWeightTable(@NativeType("StdVideoEncodeH264WeightTable const *") StdVideoEncodeH264WeightTable value) { StdVideoEncodeH264SliceHeader.npWeightTable(address(), value); return this; }

    }

}