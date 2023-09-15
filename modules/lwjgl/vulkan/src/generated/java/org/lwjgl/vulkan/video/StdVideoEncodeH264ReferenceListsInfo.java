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
 * struct StdVideoEncodeH264ReferenceListsInfo {
 *     {@link StdVideoEncodeH264ReferenceListsInfoFlags StdVideoEncodeH264ReferenceListsInfoFlags} flags;
 *     uint8_t num_ref_idx_l0_active_minus1;
 *     uint8_t num_ref_idx_l1_active_minus1;
 *     uint8_t RefPicList0[STD_VIDEO_H264_MAX_NUM_LIST_REF];
 *     uint8_t RefPicList1[STD_VIDEO_H264_MAX_NUM_LIST_REF];
 *     uint8_t refList0ModOpCount;
 *     uint8_t refList1ModOpCount;
 *     uint8_t refPicMarkingOpCount;
 *     uint8_t reserved1[7];
 *     {@link StdVideoEncodeH264RefListModEntry StdVideoEncodeH264RefListModEntry} const * pRefList0ModOperations;
 *     {@link StdVideoEncodeH264RefListModEntry StdVideoEncodeH264RefListModEntry} const * pRefList1ModOperations;
 *     {@link StdVideoEncodeH264RefPicMarkingEntry StdVideoEncodeH264RefPicMarkingEntry} const * pRefPicMarkingOperations;
 * }</code></pre>
 */
public class StdVideoEncodeH264ReferenceListsInfo extends Struct<StdVideoEncodeH264ReferenceListsInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        NUM_REF_IDX_L0_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_ACTIVE_MINUS1,
        REFPICLIST0,
        REFPICLIST1,
        REFLIST0MODOPCOUNT,
        REFLIST1MODOPCOUNT,
        REFPICMARKINGOPCOUNT,
        RESERVED1,
        PREFLIST0MODOPERATIONS,
        PREFLIST1MODOPERATIONS,
        PREFPICMARKINGOPERATIONS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF, StdVideoEncodeH264ReferenceListsInfoFlags.ALIGNOF),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H264_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H264_MAX_NUM_LIST_REF),
            __member(1),
            __member(1),
            __member(1),
            __array(1, 7),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(1);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(2);
        REFPICLIST0 = layout.offsetof(3);
        REFPICLIST1 = layout.offsetof(4);
        REFLIST0MODOPCOUNT = layout.offsetof(5);
        REFLIST1MODOPCOUNT = layout.offsetof(6);
        REFPICMARKINGOPCOUNT = layout.offsetof(7);
        RESERVED1 = layout.offsetof(8);
        PREFLIST0MODOPERATIONS = layout.offsetof(9);
        PREFLIST1MODOPERATIONS = layout.offsetof(10);
        PREFPICMARKINGOPERATIONS = layout.offsetof(11);
    }

    protected StdVideoEncodeH264ReferenceListsInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264ReferenceListsInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264ReferenceListsInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264ReferenceListsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264ReferenceListsInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264ReferenceListsInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264ReferenceListsInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() { return nnum_ref_idx_l0_active_minus1(address()); }
    /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() { return nnum_ref_idx_l1_active_minus1(address()); }
    /** @return a {@link ByteBuffer} view of the {@code RefPicList0} field. */
    @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList0() { return nRefPicList0(address()); }
    /** @return the value at the specified index of the {@code RefPicList0} field. */
    @NativeType("uint8_t")
    public byte RefPicList0(int index) { return nRefPicList0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code RefPicList1} field. */
    @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer RefPicList1() { return nRefPicList1(address()); }
    /** @return the value at the specified index of the {@code RefPicList1} field. */
    @NativeType("uint8_t")
    public byte RefPicList1(int index) { return nRefPicList1(address(), index); }
    /** @return the value of the {@code refList0ModOpCount} field. */
    @NativeType("uint8_t")
    public byte refList0ModOpCount() { return nrefList0ModOpCount(address()); }
    /** @return the value of the {@code refList1ModOpCount} field. */
    @NativeType("uint8_t")
    public byte refList1ModOpCount() { return nrefList1ModOpCount(address()); }
    /** @return the value of the {@code refPicMarkingOpCount} field. */
    @NativeType("uint8_t")
    public byte refPicMarkingOpCount() { return nrefPicMarkingOpCount(address()); }
    /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList0ModOperations} field. */
    @Nullable
    @NativeType("StdVideoEncodeH264RefListModEntry const *")
    public StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations() { return npRefList0ModOperations(address()); }
    /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList1ModOperations} field. */
    @Nullable
    @NativeType("StdVideoEncodeH264RefListModEntry const *")
    public StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations() { return npRefList1ModOperations(address()); }
    /** @return a {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} view of the struct array pointed to by the {@code pRefPicMarkingOperations} field. */
    @NativeType("StdVideoEncodeH264RefPicMarkingEntry const *")
    public StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations() { return npRefPicMarkingOperations(address()); }

    /** Copies the specified {@link StdVideoEncodeH264ReferenceListsInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH264ReferenceListsInfo flags(StdVideoEncodeH264ReferenceListsInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264ReferenceListsInfo flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_active_minus1(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code RefPicList0} field. */
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { nRefPicList0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code RefPicList0} field. */
    public StdVideoEncodeH264ReferenceListsInfo RefPicList0(int index, @NativeType("uint8_t") byte value) { nRefPicList0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code RefPicList1} field. */
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { nRefPicList1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code RefPicList1} field. */
    public StdVideoEncodeH264ReferenceListsInfo RefPicList1(int index, @NativeType("uint8_t") byte value) { nRefPicList1(address(), index, value); return this; }
    /** Sets the specified value to the {@code refList0ModOpCount} field. */
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCount(@NativeType("uint8_t") byte value) { nrefList0ModOpCount(address(), value); return this; }
    /** Sets the specified value to the {@code refList1ModOpCount} field. */
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCount(@NativeType("uint8_t") byte value) { nrefList1ModOpCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList0ModOperations} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { npRefList0ModOperations(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList1ModOperations} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { npRefList1ModOperations(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} to the {@code pRefPicMarkingOperations} field. */
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry const *") StdVideoEncodeH264RefPicMarkingEntry.Buffer value) { npRefPicMarkingOperations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264ReferenceListsInfo set(
        StdVideoEncodeH264ReferenceListsInfoFlags flags,
        byte num_ref_idx_l0_active_minus1,
        byte num_ref_idx_l1_active_minus1,
        ByteBuffer RefPicList0,
        ByteBuffer RefPicList1,
        byte refList0ModOpCount,
        byte refList1ModOpCount,
        @Nullable StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations,
        @Nullable StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations,
        StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations
    ) {
        flags(flags);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        RefPicList0(RefPicList0);
        RefPicList1(RefPicList1);
        refList0ModOpCount(refList0ModOpCount);
        refList1ModOpCount(refList1ModOpCount);
        pRefList0ModOperations(pRefList0ModOperations);
        pRefList1ModOperations(pRefList1ModOperations);
        pRefPicMarkingOperations(pRefPicMarkingOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264ReferenceListsInfo set(StdVideoEncodeH264ReferenceListsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceListsInfo malloc() {
        return new StdVideoEncodeH264ReferenceListsInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceListsInfo calloc() {
        return new StdVideoEncodeH264ReferenceListsInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264ReferenceListsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264ReferenceListsInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance for the specified memory address. */
    public static StdVideoEncodeH264ReferenceListsInfo create(long address) {
        return new StdVideoEncodeH264ReferenceListsInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264ReferenceListsInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264ReferenceListsInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceListsInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceListsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceListsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceListsInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceListsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceListsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceListsInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264ReferenceListsInfoFlags nflags(long struct) { return StdVideoEncodeH264ReferenceListsInfoFlags.create(struct + StdVideoEncodeH264ReferenceListsInfo.FLAGS); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1}. */
    public static byte nnum_ref_idx_l0_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.NUM_REF_IDX_L0_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1}. */
    public static byte nnum_ref_idx_l1_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.NUM_REF_IDX_L1_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #RefPicList0}. */
    public static ByteBuffer nRefPicList0(long struct) { return memByteBuffer(struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST0, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #RefPicList0(int) RefPicList0}. */
    public static byte nRefPicList0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST0 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #RefPicList1}. */
    public static ByteBuffer nRefPicList1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST1, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #RefPicList1(int) RefPicList1}. */
    public static byte nRefPicList1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST1 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #refList0ModOpCount}. */
    public static byte nrefList0ModOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST0MODOPCOUNT); }
    /** Unsafe version of {@link #refList1ModOpCount}. */
    public static byte nrefList1ModOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST1MODOPCOUNT); }
    /** Unsafe version of {@link #refPicMarkingOpCount}. */
    public static byte nrefPicMarkingOpCount(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICMARKINGOPCOUNT); }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1, 7); }
    public static byte nreserved1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1 + check(index, 7) * 1);
    }
    /** Unsafe version of {@link #pRefList0ModOperations}. */
    @Nullable public static StdVideoEncodeH264RefListModEntry.Buffer npRefList0ModOperations(long struct) { return StdVideoEncodeH264RefListModEntry.createSafe(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST0MODOPERATIONS), Byte.toUnsignedInt(nrefList0ModOpCount(struct))); }
    /** Unsafe version of {@link #pRefList1ModOperations}. */
    @Nullable public static StdVideoEncodeH264RefListModEntry.Buffer npRefList1ModOperations(long struct) { return StdVideoEncodeH264RefListModEntry.createSafe(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST1MODOPERATIONS), Byte.toUnsignedInt(nrefList1ModOpCount(struct))); }
    /** Unsafe version of {@link #pRefPicMarkingOperations}. */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer npRefPicMarkingOperations(long struct) { return StdVideoEncodeH264RefPicMarkingEntry.create(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICMARKINGOPERATIONS), Byte.toUnsignedInt(nrefPicMarkingOpCount(struct))); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264ReferenceListsInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264ReferenceListsInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264ReferenceListsInfo.FLAGS, StdVideoEncodeH264ReferenceListsInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1(byte) num_ref_idx_l0_active_minus1}. */
    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.NUM_REF_IDX_L0_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1(byte) num_ref_idx_l1_active_minus1}. */
    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.NUM_REF_IDX_L1_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #RefPicList0(ByteBuffer) RefPicList0}. */
    public static void nRefPicList0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicList0(int, byte) RefPicList0}. */
    public static void nRefPicList0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST0 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #RefPicList1(ByteBuffer) RefPicList1}. */
    public static void nRefPicList1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #RefPicList1(int, byte) RefPicList1}. */
    public static void nRefPicList1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICLIST1 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Sets the specified value to the {@code refList0ModOpCount} field of the specified {@code struct}. */
    public static void nrefList0ModOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST0MODOPCOUNT, value); }
    /** Sets the specified value to the {@code refList1ModOpCount} field of the specified {@code struct}. */
    public static void nrefList1ModOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFLIST1MODOPCOUNT, value); }
    /** Sets the specified value to the {@code refPicMarkingOpCount} field of the specified {@code struct}. */
    public static void nrefPicMarkingOpCount(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.REFPICMARKINGOPCOUNT, value); }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264ReferenceListsInfo.RESERVED1 + check(index, 7) * 1, value);
    }
    /** Unsafe version of {@link #pRefList0ModOperations(StdVideoEncodeH264RefListModEntry.Buffer) pRefList0ModOperations}. */
    public static void npRefList0ModOperations(long struct, @Nullable StdVideoEncodeH264RefListModEntry.Buffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST0MODOPERATIONS, memAddressSafe(value)); nrefList0ModOpCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pRefList1ModOperations(StdVideoEncodeH264RefListModEntry.Buffer) pRefList1ModOperations}. */
    public static void npRefList1ModOperations(long struct, @Nullable StdVideoEncodeH264RefListModEntry.Buffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFLIST1MODOPERATIONS, memAddressSafe(value)); nrefList1ModOpCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pRefPicMarkingOperations(StdVideoEncodeH264RefPicMarkingEntry.Buffer) pRefPicMarkingOperations}. */
    public static void npRefPicMarkingOperations(long struct, StdVideoEncodeH264RefPicMarkingEntry.Buffer value) { memPutAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICMARKINGOPERATIONS, value.address()); nrefPicMarkingOpCount(struct, (byte)value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH264ReferenceListsInfo.PREFPICMARKINGOPERATIONS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264ReferenceListsInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceListsInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264ReferenceListsInfo ELEMENT_FACTORY = StdVideoEncodeH264ReferenceListsInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264ReferenceListsInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264ReferenceListsInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264ReferenceListsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264ReferenceListsInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264ReferenceListsInfoFlags flags() { return StdVideoEncodeH264ReferenceListsInfo.nflags(address()); }
        /** @return the value of the {@code num_ref_idx_l0_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l0_active_minus1(address()); }
        /** @return the value of the {@code num_ref_idx_l1_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l1_active_minus1(address()); }
        /** @return a {@link ByteBuffer} view of the {@code RefPicList0} field. */
        @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList0() { return StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address()); }
        /** @return the value at the specified index of the {@code RefPicList0} field. */
        @NativeType("uint8_t")
        public byte RefPicList0(int index) { return StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code RefPicList1} field. */
        @NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer RefPicList1() { return StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address()); }
        /** @return the value at the specified index of the {@code RefPicList1} field. */
        @NativeType("uint8_t")
        public byte RefPicList1(int index) { return StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address(), index); }
        /** @return the value of the {@code refList0ModOpCount} field. */
        @NativeType("uint8_t")
        public byte refList0ModOpCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefList0ModOpCount(address()); }
        /** @return the value of the {@code refList1ModOpCount} field. */
        @NativeType("uint8_t")
        public byte refList1ModOpCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefList1ModOpCount(address()); }
        /** @return the value of the {@code refPicMarkingOpCount} field. */
        @NativeType("uint8_t")
        public byte refPicMarkingOpCount() { return StdVideoEncodeH264ReferenceListsInfo.nrefPicMarkingOpCount(address()); }
        /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList0ModOperations} field. */
        @Nullable
        @NativeType("StdVideoEncodeH264RefListModEntry const *")
        public StdVideoEncodeH264RefListModEntry.Buffer pRefList0ModOperations() { return StdVideoEncodeH264ReferenceListsInfo.npRefList0ModOperations(address()); }
        /** @return a {@link StdVideoEncodeH264RefListModEntry.Buffer} view of the struct array pointed to by the {@code pRefList1ModOperations} field. */
        @Nullable
        @NativeType("StdVideoEncodeH264RefListModEntry const *")
        public StdVideoEncodeH264RefListModEntry.Buffer pRefList1ModOperations() { return StdVideoEncodeH264ReferenceListsInfo.npRefList1ModOperations(address()); }
        /** @return a {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} view of the struct array pointed to by the {@code pRefPicMarkingOperations} field. */
        @NativeType("StdVideoEncodeH264RefPicMarkingEntry const *")
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer pRefPicMarkingOperations() { return StdVideoEncodeH264ReferenceListsInfo.npRefPicMarkingOperations(address()); }

        /** Copies the specified {@link StdVideoEncodeH264ReferenceListsInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer flags(StdVideoEncodeH264ReferenceListsInfoFlags value) { StdVideoEncodeH264ReferenceListsInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l0_active_minus1} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l0_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l1_active_minus1} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nnum_ref_idx_l1_active_minus1(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code RefPicList0} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer RefPicList0(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code RefPicList0} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer RefPicList0(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nRefPicList0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code RefPicList1} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer RefPicList1(@NativeType("uint8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code RefPicList1} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer RefPicList1(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nRefPicList1(address(), index, value); return this; }
        /** Sets the specified value to the {@code refList0ModOpCount} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer refList0ModOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nrefList0ModOpCount(address(), value); return this; }
        /** Sets the specified value to the {@code refList1ModOpCount} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer refList1ModOpCount(@NativeType("uint8_t") byte value) { StdVideoEncodeH264ReferenceListsInfo.nrefList1ModOpCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList0ModOperations} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefList0ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefList0ModOperations(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefListModEntry.Buffer} to the {@code pRefList1ModOperations} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefList1ModOperations(@Nullable @NativeType("StdVideoEncodeH264RefListModEntry const *") StdVideoEncodeH264RefListModEntry.Buffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefList1ModOperations(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} to the {@code pRefPicMarkingOperations} field. */
        public StdVideoEncodeH264ReferenceListsInfo.Buffer pRefPicMarkingOperations(@NativeType("StdVideoEncodeH264RefPicMarkingEntry const *") StdVideoEncodeH264RefPicMarkingEntry.Buffer value) { StdVideoEncodeH264ReferenceListsInfo.npRefPicMarkingOperations(address(), value); return this; }

    }

}