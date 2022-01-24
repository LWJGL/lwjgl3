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
 * struct StdVideoH264PictureParameterSet {
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint8_t num_ref_idx_l0_default_active_minus1;
 *     uint8_t num_ref_idx_l1_default_active_minus1;
 *     StdVideoH264WeightedBipredIdc weighted_bipred_idc;
 *     int8_t pic_init_qp_minus26;
 *     int8_t pic_init_qs_minus26;
 *     int8_t chroma_qp_index_offset;
 *     int8_t second_chroma_qp_index_offset;
 *     {@link StdVideoH264PpsFlags StdVideoH264PpsFlags} flags;
 *     {@link StdVideoH264ScalingLists StdVideoH264ScalingLists} * {@link #pScalingLists};
 * }</code></pre>
 */
public class StdVideoH264PictureParameterSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SEQ_PARAMETER_SET_ID,
        PIC_PARAMETER_SET_ID,
        NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1,
        WEIGHTED_BIPRED_IDC,
        PIC_INIT_QP_MINUS26,
        PIC_INIT_QS_MINUS26,
        CHROMA_QP_INDEX_OFFSET,
        SECOND_CHROMA_QP_INDEX_OFFSET,
        FLAGS,
        PSCALINGLISTS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(StdVideoH264PpsFlags.SIZEOF, StdVideoH264PpsFlags.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SEQ_PARAMETER_SET_ID = layout.offsetof(0);
        PIC_PARAMETER_SET_ID = layout.offsetof(1);
        NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(2);
        NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(3);
        WEIGHTED_BIPRED_IDC = layout.offsetof(4);
        PIC_INIT_QP_MINUS26 = layout.offsetof(5);
        PIC_INIT_QS_MINUS26 = layout.offsetof(6);
        CHROMA_QP_INDEX_OFFSET = layout.offsetof(7);
        SECOND_CHROMA_QP_INDEX_OFFSET = layout.offsetof(8);
        FLAGS = layout.offsetof(9);
        PSCALINGLISTS = layout.offsetof(10);
    }

    /**
     * Creates a {@code StdVideoH264PictureParameterSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264PictureParameterSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte seq_parameter_set_id() { return nseq_parameter_set_id(address()); }
    /** @return the value of the {@code pic_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pic_parameter_set_id() { return npic_parameter_set_id(address()); }
    /** @return the value of the {@code num_ref_idx_l0_default_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_default_active_minus1() { return nnum_ref_idx_l0_default_active_minus1(address()); }
    /** @return the value of the {@code num_ref_idx_l1_default_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_default_active_minus1() { return nnum_ref_idx_l1_default_active_minus1(address()); }
    /** @return the value of the {@code weighted_bipred_idc} field. */
    @NativeType("StdVideoH264WeightedBipredIdc")
    public int weighted_bipred_idc() { return nweighted_bipred_idc(address()); }
    /** @return the value of the {@code pic_init_qp_minus26} field. */
    @NativeType("int8_t")
    public byte pic_init_qp_minus26() { return npic_init_qp_minus26(address()); }
    /** @return the value of the {@code pic_init_qs_minus26} field. */
    @NativeType("int8_t")
    public byte pic_init_qs_minus26() { return npic_init_qs_minus26(address()); }
    /** @return the value of the {@code chroma_qp_index_offset} field. */
    @NativeType("int8_t")
    public byte chroma_qp_index_offset() { return nchroma_qp_index_offset(address()); }
    /** @return the value of the {@code second_chroma_qp_index_offset} field. */
    @NativeType("int8_t")
    public byte second_chroma_qp_index_offset() { return nsecond_chroma_qp_index_offset(address()); }
    /** @return a {@link StdVideoH264PpsFlags} view of the {@code flags} field. */
    public StdVideoH264PpsFlags flags() { return nflags(address()); }
    /** must be a valid pointer if  StdVideoH264PpsFlags::pic_scaling_matrix_present_flag is set */
    @NativeType("StdVideoH264ScalingLists *")
    public StdVideoH264ScalingLists pScalingLists() { return npScalingLists(address()); }

    /** Sets the specified value to the {@code seq_parameter_set_id} field. */
    public StdVideoH264PictureParameterSet seq_parameter_set_id(@NativeType("uint8_t") byte value) { nseq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pic_parameter_set_id} field. */
    public StdVideoH264PictureParameterSet pic_parameter_set_id(@NativeType("uint8_t") byte value) { npic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l0_default_active_minus1} field. */
    public StdVideoH264PictureParameterSet num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_default_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l1_default_active_minus1} field. */
    public StdVideoH264PictureParameterSet num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_default_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code weighted_bipred_idc} field. */
    public StdVideoH264PictureParameterSet weighted_bipred_idc(@NativeType("StdVideoH264WeightedBipredIdc") int value) { nweighted_bipred_idc(address(), value); return this; }
    /** Sets the specified value to the {@code pic_init_qp_minus26} field. */
    public StdVideoH264PictureParameterSet pic_init_qp_minus26(@NativeType("int8_t") byte value) { npic_init_qp_minus26(address(), value); return this; }
    /** Sets the specified value to the {@code pic_init_qs_minus26} field. */
    public StdVideoH264PictureParameterSet pic_init_qs_minus26(@NativeType("int8_t") byte value) { npic_init_qs_minus26(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_qp_index_offset} field. */
    public StdVideoH264PictureParameterSet chroma_qp_index_offset(@NativeType("int8_t") byte value) { nchroma_qp_index_offset(address(), value); return this; }
    /** Sets the specified value to the {@code second_chroma_qp_index_offset} field. */
    public StdVideoH264PictureParameterSet second_chroma_qp_index_offset(@NativeType("int8_t") byte value) { nsecond_chroma_qp_index_offset(address(), value); return this; }
    /** Copies the specified {@link StdVideoH264PpsFlags} to the {@code flags} field. */
    public StdVideoH264PictureParameterSet flags(StdVideoH264PpsFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH264PictureParameterSet flags(java.util.function.Consumer<StdVideoH264PpsFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the address of the specified {@link StdVideoH264ScalingLists} to the {@link #pScalingLists} field. */
    public StdVideoH264PictureParameterSet pScalingLists(@NativeType("StdVideoH264ScalingLists *") StdVideoH264ScalingLists value) { npScalingLists(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264PictureParameterSet set(
        byte seq_parameter_set_id,
        byte pic_parameter_set_id,
        byte num_ref_idx_l0_default_active_minus1,
        byte num_ref_idx_l1_default_active_minus1,
        int weighted_bipred_idc,
        byte pic_init_qp_minus26,
        byte pic_init_qs_minus26,
        byte chroma_qp_index_offset,
        byte second_chroma_qp_index_offset,
        StdVideoH264PpsFlags flags,
        StdVideoH264ScalingLists pScalingLists
    ) {
        seq_parameter_set_id(seq_parameter_set_id);
        pic_parameter_set_id(pic_parameter_set_id);
        num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1);
        num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1);
        weighted_bipred_idc(weighted_bipred_idc);
        pic_init_qp_minus26(pic_init_qp_minus26);
        pic_init_qs_minus26(pic_init_qs_minus26);
        chroma_qp_index_offset(chroma_qp_index_offset);
        second_chroma_qp_index_offset(second_chroma_qp_index_offset);
        flags(flags);
        pScalingLists(pScalingLists);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264PictureParameterSet set(StdVideoH264PictureParameterSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264PictureParameterSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264PictureParameterSet malloc() {
        return wrap(StdVideoH264PictureParameterSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264PictureParameterSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264PictureParameterSet calloc() {
        return wrap(StdVideoH264PictureParameterSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264PictureParameterSet} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264PictureParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264PictureParameterSet.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264PictureParameterSet} instance for the specified memory address. */
    public static StdVideoH264PictureParameterSet create(long address) {
        return wrap(StdVideoH264PictureParameterSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264PictureParameterSet createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264PictureParameterSet.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264PictureParameterSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PictureParameterSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264PictureParameterSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PictureParameterSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264PictureParameterSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PictureParameterSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264PictureParameterSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PictureParameterSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264PictureParameterSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264PictureParameterSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264PictureParameterSet malloc(MemoryStack stack) {
        return wrap(StdVideoH264PictureParameterSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264PictureParameterSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264PictureParameterSet calloc(MemoryStack stack) {
        return wrap(StdVideoH264PictureParameterSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264PictureParameterSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PictureParameterSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264PictureParameterSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264PictureParameterSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #seq_parameter_set_id}. */
    public static byte nseq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pic_parameter_set_id}. */
    public static byte npic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #num_ref_idx_l0_default_active_minus1}. */
    public static byte nnum_ref_idx_l0_default_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_default_active_minus1}. */
    public static byte nnum_ref_idx_l1_default_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #weighted_bipred_idc}. */
    public static int nweighted_bipred_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264PictureParameterSet.WEIGHTED_BIPRED_IDC); }
    /** Unsafe version of {@link #pic_init_qp_minus26}. */
    public static byte npic_init_qp_minus26(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.PIC_INIT_QP_MINUS26); }
    /** Unsafe version of {@link #pic_init_qs_minus26}. */
    public static byte npic_init_qs_minus26(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.PIC_INIT_QS_MINUS26); }
    /** Unsafe version of {@link #chroma_qp_index_offset}. */
    public static byte nchroma_qp_index_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.CHROMA_QP_INDEX_OFFSET); }
    /** Unsafe version of {@link #second_chroma_qp_index_offset}. */
    public static byte nsecond_chroma_qp_index_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264PictureParameterSet.SECOND_CHROMA_QP_INDEX_OFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoH264PpsFlags nflags(long struct) { return StdVideoH264PpsFlags.create(struct + StdVideoH264PictureParameterSet.FLAGS); }
    /** Unsafe version of {@link #pScalingLists}. */
    public static StdVideoH264ScalingLists npScalingLists(long struct) { return StdVideoH264ScalingLists.create(memGetAddress(struct + StdVideoH264PictureParameterSet.PSCALINGLISTS)); }

    /** Unsafe version of {@link #seq_parameter_set_id(byte) seq_parameter_set_id}. */
    public static void nseq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pic_parameter_set_id(byte) pic_parameter_set_id}. */
    public static void npic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #num_ref_idx_l0_default_active_minus1(byte) num_ref_idx_l0_default_active_minus1}. */
    public static void nnum_ref_idx_l0_default_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_default_active_minus1(byte) num_ref_idx_l1_default_active_minus1}. */
    public static void nnum_ref_idx_l1_default_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #weighted_bipred_idc(int) weighted_bipred_idc}. */
    public static void nweighted_bipred_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264PictureParameterSet.WEIGHTED_BIPRED_IDC, value); }
    /** Unsafe version of {@link #pic_init_qp_minus26(byte) pic_init_qp_minus26}. */
    public static void npic_init_qp_minus26(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.PIC_INIT_QP_MINUS26, value); }
    /** Unsafe version of {@link #pic_init_qs_minus26(byte) pic_init_qs_minus26}. */
    public static void npic_init_qs_minus26(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.PIC_INIT_QS_MINUS26, value); }
    /** Unsafe version of {@link #chroma_qp_index_offset(byte) chroma_qp_index_offset}. */
    public static void nchroma_qp_index_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.CHROMA_QP_INDEX_OFFSET, value); }
    /** Unsafe version of {@link #second_chroma_qp_index_offset(byte) second_chroma_qp_index_offset}. */
    public static void nsecond_chroma_qp_index_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264PictureParameterSet.SECOND_CHROMA_QP_INDEX_OFFSET, value); }
    /** Unsafe version of {@link #flags(StdVideoH264PpsFlags) flags}. */
    public static void nflags(long struct, StdVideoH264PpsFlags value) { memCopy(value.address(), struct + StdVideoH264PictureParameterSet.FLAGS, StdVideoH264PpsFlags.SIZEOF); }
    /** Unsafe version of {@link #pScalingLists(StdVideoH264ScalingLists) pScalingLists}. */
    public static void npScalingLists(long struct, StdVideoH264ScalingLists value) { memPutAddress(struct + StdVideoH264PictureParameterSet.PSCALINGLISTS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH264PictureParameterSet.PSCALINGLISTS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoH264PictureParameterSet} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264PictureParameterSet, Buffer> implements NativeResource {

        private static final StdVideoH264PictureParameterSet ELEMENT_FACTORY = StdVideoH264PictureParameterSet.create(-1L);

        /**
         * Creates a new {@code StdVideoH264PictureParameterSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264PictureParameterSet#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264PictureParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte seq_parameter_set_id() { return StdVideoH264PictureParameterSet.nseq_parameter_set_id(address()); }
        /** @return the value of the {@code pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pic_parameter_set_id() { return StdVideoH264PictureParameterSet.npic_parameter_set_id(address()); }
        /** @return the value of the {@code num_ref_idx_l0_default_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_default_active_minus1() { return StdVideoH264PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address()); }
        /** @return the value of the {@code num_ref_idx_l1_default_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_default_active_minus1() { return StdVideoH264PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address()); }
        /** @return the value of the {@code weighted_bipred_idc} field. */
        @NativeType("StdVideoH264WeightedBipredIdc")
        public int weighted_bipred_idc() { return StdVideoH264PictureParameterSet.nweighted_bipred_idc(address()); }
        /** @return the value of the {@code pic_init_qp_minus26} field. */
        @NativeType("int8_t")
        public byte pic_init_qp_minus26() { return StdVideoH264PictureParameterSet.npic_init_qp_minus26(address()); }
        /** @return the value of the {@code pic_init_qs_minus26} field. */
        @NativeType("int8_t")
        public byte pic_init_qs_minus26() { return StdVideoH264PictureParameterSet.npic_init_qs_minus26(address()); }
        /** @return the value of the {@code chroma_qp_index_offset} field. */
        @NativeType("int8_t")
        public byte chroma_qp_index_offset() { return StdVideoH264PictureParameterSet.nchroma_qp_index_offset(address()); }
        /** @return the value of the {@code second_chroma_qp_index_offset} field. */
        @NativeType("int8_t")
        public byte second_chroma_qp_index_offset() { return StdVideoH264PictureParameterSet.nsecond_chroma_qp_index_offset(address()); }
        /** @return a {@link StdVideoH264PpsFlags} view of the {@code flags} field. */
        public StdVideoH264PpsFlags flags() { return StdVideoH264PictureParameterSet.nflags(address()); }
        /** @return a {@link StdVideoH264ScalingLists} view of the struct pointed to by the {@link StdVideoH264PictureParameterSet#pScalingLists} field. */
        @NativeType("StdVideoH264ScalingLists *")
        public StdVideoH264ScalingLists pScalingLists() { return StdVideoH264PictureParameterSet.npScalingLists(address()); }

        /** Sets the specified value to the {@code seq_parameter_set_id} field. */
        public StdVideoH264PictureParameterSet.Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH264PictureParameterSet.nseq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pic_parameter_set_id} field. */
        public StdVideoH264PictureParameterSet.Buffer pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH264PictureParameterSet.npic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l0_default_active_minus1} field. */
        public StdVideoH264PictureParameterSet.Buffer num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) { StdVideoH264PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l1_default_active_minus1} field. */
        public StdVideoH264PictureParameterSet.Buffer num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) { StdVideoH264PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code weighted_bipred_idc} field. */
        public StdVideoH264PictureParameterSet.Buffer weighted_bipred_idc(@NativeType("StdVideoH264WeightedBipredIdc") int value) { StdVideoH264PictureParameterSet.nweighted_bipred_idc(address(), value); return this; }
        /** Sets the specified value to the {@code pic_init_qp_minus26} field. */
        public StdVideoH264PictureParameterSet.Buffer pic_init_qp_minus26(@NativeType("int8_t") byte value) { StdVideoH264PictureParameterSet.npic_init_qp_minus26(address(), value); return this; }
        /** Sets the specified value to the {@code pic_init_qs_minus26} field. */
        public StdVideoH264PictureParameterSet.Buffer pic_init_qs_minus26(@NativeType("int8_t") byte value) { StdVideoH264PictureParameterSet.npic_init_qs_minus26(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_qp_index_offset} field. */
        public StdVideoH264PictureParameterSet.Buffer chroma_qp_index_offset(@NativeType("int8_t") byte value) { StdVideoH264PictureParameterSet.nchroma_qp_index_offset(address(), value); return this; }
        /** Sets the specified value to the {@code second_chroma_qp_index_offset} field. */
        public StdVideoH264PictureParameterSet.Buffer second_chroma_qp_index_offset(@NativeType("int8_t") byte value) { StdVideoH264PictureParameterSet.nsecond_chroma_qp_index_offset(address(), value); return this; }
        /** Copies the specified {@link StdVideoH264PpsFlags} to the {@code flags} field. */
        public StdVideoH264PictureParameterSet.Buffer flags(StdVideoH264PpsFlags value) { StdVideoH264PictureParameterSet.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH264PictureParameterSet.Buffer flags(java.util.function.Consumer<StdVideoH264PpsFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the address of the specified {@link StdVideoH264ScalingLists} to the {@link StdVideoH264PictureParameterSet#pScalingLists} field. */
        public StdVideoH264PictureParameterSet.Buffer pScalingLists(@NativeType("StdVideoH264ScalingLists *") StdVideoH264ScalingLists value) { StdVideoH264PictureParameterSet.npScalingLists(address(), value); return this; }

    }

}