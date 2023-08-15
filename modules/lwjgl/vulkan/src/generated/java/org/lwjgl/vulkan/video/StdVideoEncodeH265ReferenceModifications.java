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
 * struct StdVideoEncodeH265ReferenceModifications {
 *     {@link StdVideoEncodeH265ReferenceModificationFlags StdVideoEncodeH265ReferenceModificationFlags} flags;
 *     uint8_t num_ref_idx_l0_active_minus1;
 *     uint8_t num_ref_idx_l1_active_minus1;
 *     uint16_t reserved1;
 *     uint8_t RefPicList0[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     uint8_t RefPicList1[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     uint8_t list_entry_l0[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     uint8_t list_entry_l1[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 * }</code></pre>
 */
public class StdVideoEncodeH265ReferenceModifications extends Struct<StdVideoEncodeH265ReferenceModifications> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        NUM_REF_IDX_L0_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_ACTIVE_MINUS1,
        RESERVED1,
        REFPICLIST0,
        REFPICLIST1,
        LIST_ENTRY_L0,
        LIST_ENTRY_L1;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265ReferenceModificationFlags.SIZEOF, StdVideoEncodeH265ReferenceModificationFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(2),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(1);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        REFPICLIST0 = layout.offsetof(4);
        REFPICLIST1 = layout.offsetof(5);
        LIST_ENTRY_L0 = layout.offsetof(6);
        LIST_ENTRY_L1 = layout.offsetof(7);
    }

    protected StdVideoEncodeH265ReferenceModifications(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265ReferenceModifications create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceModifications(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265ReferenceModifications} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265ReferenceModifications(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH265ReferenceModificationFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265ReferenceModificationFlags flags() { return nflags(address()); }
    /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() { return nnum_ref_idx_l0_active_minus1(address()); }
    /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() { return nnum_ref_idx_l1_active_minus1(address()); }
    /** @return the value of the {@code reserved1} field. */
    @NativeType("uint16_t")
    public short reserved1() { return nreserved1(address()); }
    /** @return a {@link ByteBuffer} view of the {@code RefPicList0} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList0() { return nRefPicList0(address()); }
    /** @return the value at the specified index of the {@code RefPicList0} field. */
    @NativeType("uint8_t")
    public byte RefPicList0(int index) { return nRefPicList0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code RefPicList1} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList1() { return nRefPicList1(address()); }
    /** @return the value at the specified index of the {@code RefPicList1} field. */
    @NativeType("uint8_t")
    public byte RefPicList1(int index) { return nRefPicList1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code list_entry_l0} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer list_entry_l0() { return nlist_entry_l0(address()); }
    /** @return the value at the specified index of the {@code list_entry_l0} field. */
    @NativeType("uint8_t")
    public byte list_entry_l0(int index) { return nlist_entry_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code list_entry_l1} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer list_entry_l1() { return nlist_entry_l1(address()); }
    /** @return the value at the specified index of the {@code list_entry_l1} field. */
    @NativeType("uint8_t")
    public byte list_entry_l1(int index) { return nlist_entry_l1(address(), index); }

    /** Copies the specified {@link StdVideoEncodeH265ReferenceModificationFlags} to the {@code flags} field. */
    public StdVideoEncodeH265ReferenceModifications flags(StdVideoEncodeH265ReferenceModificationFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265ReferenceModifications flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
    public StdVideoEncodeH265ReferenceModifications num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
    public StdVideoEncodeH265ReferenceModifications num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code reserved1} field. */
    public StdVideoEncodeH265ReferenceModifications reserved1(@NativeType("uint16_t") short value) { nreserved1(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code RefPicList0} field. */
    public StdVideoEncodeH265ReferenceModifications RefPicList0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { nRefPicList0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code RefPicList0} field. */
    public StdVideoEncodeH265ReferenceModifications RefPicList0(int index, @NativeType("uint8_t") byte value) { nRefPicList0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code RefPicList1} field. */
    public StdVideoEncodeH265ReferenceModifications RefPicList1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { nRefPicList1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code RefPicList1} field. */
    public StdVideoEncodeH265ReferenceModifications RefPicList1(int index, @NativeType("uint8_t") byte value) { nRefPicList1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code list_entry_l0} field. */
    public StdVideoEncodeH265ReferenceModifications list_entry_l0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { nlist_entry_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code list_entry_l0} field. */
    public StdVideoEncodeH265ReferenceModifications list_entry_l0(int index, @NativeType("uint8_t") byte value) { nlist_entry_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code list_entry_l1} field. */
    public StdVideoEncodeH265ReferenceModifications list_entry_l1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { nlist_entry_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code list_entry_l1} field. */
    public StdVideoEncodeH265ReferenceModifications list_entry_l1(int index, @NativeType("uint8_t") byte value) { nlist_entry_l1(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265ReferenceModifications set(
        StdVideoEncodeH265ReferenceModificationFlags flags,
        byte num_ref_idx_l0_active_minus1,
        byte num_ref_idx_l1_active_minus1,
        short reserved1,
        ByteBuffer RefPicList0,
        ByteBuffer RefPicList1,
        ByteBuffer list_entry_l0,
        ByteBuffer list_entry_l1
    ) {
        flags(flags);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        reserved1(reserved1);
        RefPicList0(RefPicList0);
        RefPicList1(RefPicList1);
        list_entry_l0(list_entry_l0);
        list_entry_l1(list_entry_l1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265ReferenceModifications set(StdVideoEncodeH265ReferenceModifications src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModifications malloc() {
        return new StdVideoEncodeH265ReferenceModifications(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModifications calloc() {
        return new StdVideoEncodeH265ReferenceModifications(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265ReferenceModifications create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceModifications(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance for the specified memory address. */
    public static StdVideoEncodeH265ReferenceModifications create(long address) {
        return new StdVideoEncodeH265ReferenceModifications(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModifications createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265ReferenceModifications(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModifications.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModifications malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModifications(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModifications} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModifications calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModifications(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModifications.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModifications.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265ReferenceModificationFlags nflags(long struct) { return StdVideoEncodeH265ReferenceModificationFlags.create(struct + StdVideoEncodeH265ReferenceModifications.FLAGS); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1}. */
    public static byte nnum_ref_idx_l0_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L0_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1}. */
    public static byte nnum_ref_idx_l1_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L1_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #reserved1}. */
    public static short nreserved1(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH265ReferenceModifications.RESERVED1); }
    /** Unsafe version of {@link #RefPicList0}. */
    public static ByteBuffer nRefPicList0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST0, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #RefPicList0(int) RefPicList0}. */
    public static byte nRefPicList0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #RefPicList1}. */
    public static ByteBuffer nRefPicList1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST1, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #RefPicList1(int) RefPicList1}. */
    public static byte nRefPicList1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #list_entry_l0}. */
    public static ByteBuffer nlist_entry_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L0, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #list_entry_l0(int) list_entry_l0}. */
    public static byte nlist_entry_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #list_entry_l1}. */
    public static ByteBuffer nlist_entry_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L1, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #list_entry_l1(int) list_entry_l1}. */
    public static byte nlist_entry_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265ReferenceModificationFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265ReferenceModificationFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265ReferenceModifications.FLAGS, StdVideoEncodeH265ReferenceModificationFlags.SIZEOF); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1(byte) num_ref_idx_l0_active_minus1}. */
    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L0_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1(byte) num_ref_idx_l1_active_minus1}. */
    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.NUM_REF_IDX_L1_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #reserved1(short) reserved1}. */
    public static void nreserved1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH265ReferenceModifications.RESERVED1, value); }
    /** Unsafe version of {@link #RefPicList0(ByteBuffer) RefPicList0}. */
    public static void nRefPicList0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicList0(int, byte) RefPicList0}. */
    public static void nRefPicList0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #RefPicList1(ByteBuffer) RefPicList1}. */
    public static void nRefPicList1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicList1(int, byte) RefPicList1}. */
    public static void nRefPicList1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.REFPICLIST1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #list_entry_l0(ByteBuffer) list_entry_l0}. */
    public static void nlist_entry_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #list_entry_l0(int, byte) list_entry_l0}. */
    public static void nlist_entry_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #list_entry_l1(ByteBuffer) list_entry_l1}. */
    public static void nlist_entry_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #list_entry_l1(int, byte) list_entry_l1}. */
    public static void nlist_entry_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceModifications.LIST_ENTRY_L1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265ReferenceModifications} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceModifications, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265ReferenceModifications ELEMENT_FACTORY = StdVideoEncodeH265ReferenceModifications.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265ReferenceModifications.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265ReferenceModifications#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265ReferenceModifications getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH265ReferenceModificationFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265ReferenceModificationFlags flags() { return StdVideoEncodeH265ReferenceModifications.nflags(address()); }
        /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l0_active_minus1(address()); }
        /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l1_active_minus1(address()); }
        /** @return the value of the {@code reserved1} field. */
        @NativeType("uint16_t")
        public short reserved1() { return StdVideoEncodeH265ReferenceModifications.nreserved1(address()); }
        /** @return a {@link ByteBuffer} view of the {@code RefPicList0} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList0() { return StdVideoEncodeH265ReferenceModifications.nRefPicList0(address()); }
        /** @return the value at the specified index of the {@code RefPicList0} field. */
        @NativeType("uint8_t")
        public byte RefPicList0(int index) { return StdVideoEncodeH265ReferenceModifications.nRefPicList0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code RefPicList1} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList1() { return StdVideoEncodeH265ReferenceModifications.nRefPicList1(address()); }
        /** @return the value at the specified index of the {@code RefPicList1} field. */
        @NativeType("uint8_t")
        public byte RefPicList1(int index) { return StdVideoEncodeH265ReferenceModifications.nRefPicList1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code list_entry_l0} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer list_entry_l0() { return StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address()); }
        /** @return the value at the specified index of the {@code list_entry_l0} field. */
        @NativeType("uint8_t")
        public byte list_entry_l0(int index) { return StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code list_entry_l1} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer list_entry_l1() { return StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address()); }
        /** @return the value at the specified index of the {@code list_entry_l1} field. */
        @NativeType("uint8_t")
        public byte list_entry_l1(int index) { return StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address(), index); }

        /** Copies the specified {@link StdVideoEncodeH265ReferenceModificationFlags} to the {@code flags} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer flags(StdVideoEncodeH265ReferenceModificationFlags value) { StdVideoEncodeH265ReferenceModifications.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265ReferenceModifications.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceModificationFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l0_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nnum_ref_idx_l1_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code reserved1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer reserved1(@NativeType("uint16_t") short value) { StdVideoEncodeH265ReferenceModifications.nreserved1(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code RefPicList0} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer RefPicList0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.nRefPicList0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code RefPicList0} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer RefPicList0(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nRefPicList0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code RefPicList1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer RefPicList1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.nRefPicList1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code RefPicList1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer RefPicList1(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nRefPicList1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code list_entry_l0} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer list_entry_l0(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code list_entry_l0} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer list_entry_l0(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nlist_entry_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code list_entry_l1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer list_entry_l1(@NativeType("uint8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code list_entry_l1} field. */
        public StdVideoEncodeH265ReferenceModifications.Buffer list_entry_l1(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceModifications.nlist_entry_l1(address(), index, value); return this; }

    }

}