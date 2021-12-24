/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.264 encode slice NALU parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pSliceHeaderStd} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264SliceHeader} value</li>
 * <li>{@code pRefFinalList0Entries} <b>must</b> be a valid pointer to an array of {@code refFinalList0EntryCount} valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structures</li>
 * <li>{@code pRefFinalList1Entries} <b>must</b> be a valid pointer to an array of {@code refFinalList1EntryCount} valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structures</li>
 * <li>{@code refFinalList0EntryCount} <b>must</b> be greater than 0</li>
 * <li>{@code refFinalList1EntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264DpbSlotInfoEXT}, {@link VkVideoEncodeH264VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264NaluSliceEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoEncodeH264SliceHeader StdVideoEncodeH264SliceHeader} const * {@link #pSliceHeaderStd};
 *     uint32_t {@link #mbCount};
 *     uint8_t {@link #refFinalList0EntryCount};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pRefFinalList0Entries};
 *     uint8_t {@link #refFinalList1EntryCount};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pRefFinalList1Entries};
 * }</code></pre>
 */
public class VkVideoEncodeH264NaluSliceEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSLICEHEADERSTD,
        MBCOUNT,
        REFFINALLIST0ENTRYCOUNT,
        PREFFINALLIST0ENTRIES,
        REFFINALLIST1ENTRYCOUNT,
        PREFFINALLIST1ENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSLICEHEADERSTD = layout.offsetof(2);
        MBCOUNT = layout.offsetof(3);
        REFFINALLIST0ENTRYCOUNT = layout.offsetof(4);
        PREFFINALLIST0ENTRIES = layout.offsetof(5);
        REFFINALLIST1ENTRYCOUNT = layout.offsetof(6);
        PREFFINALLIST1ENTRIES = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkVideoEncodeH264NaluSliceEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264NaluSliceEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a {@code StdVideoEncodeH264SliceHeader} specifying the standard slice header from the H.264 specification. */
    @NativeType("StdVideoEncodeH264SliceHeader const *")
    public StdVideoEncodeH264SliceHeader pSliceHeaderStd() { return npSliceHeaderStd(address()); }
    /** the number of macroblocks in this slice. */
    @NativeType("uint32_t")
    public int mbCount() { return nmbCount(address()); }
    /** the number of active references in List0. If zero, the default frame List0 provided in the enclosing {@link VkVideoEncodeH264VclFrameInfoEXT} is used. If non-zero, it overrides the default frame List0 for this slice. */
    @NativeType("uint8_t")
    public byte refFinalList0EntryCount() { return nrefFinalList0EntryCount(address()); }
    /** a pointer to a {@link VkVideoEncodeH264DpbSlotInfoEXT} specifying DPB information for the active List0 references. The same restrictions related to order of entries and decoded picture marking operations described for List0 in {@link VkVideoEncodeH264VclFrameInfoEXT} apply here. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList0Entries() { return npRefFinalList0Entries(address()); }
    /** the number of active references in List1. If zero, the default frame List1 provided in the enclosing {@link VkVideoEncodeH264VclFrameInfoEXT} is used. If non-zero, it overrides the default frame List1 for this slice. */
    @NativeType("uint8_t")
    public byte refFinalList1EntryCount() { return nrefFinalList1EntryCount(address()); }
    /** a pointer to a {@link VkVideoEncodeH264DpbSlotInfoEXT} structure specifying DPB information for the active List1 references. The same restrictions related to order of entries and decoded picture marking operations described for List1 in {@link VkVideoEncodeH264VclFrameInfoEXT} apply here. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList1Entries() { return npRefFinalList1Entries(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264NaluSliceEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264NaluSliceEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264NaluSliceEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@link #pSliceHeaderStd} field. */
    public VkVideoEncodeH264NaluSliceEXT pSliceHeaderStd(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { npSliceHeaderStd(address(), value); return this; }
    /** Sets the specified value to the {@link #mbCount} field. */
    public VkVideoEncodeH264NaluSliceEXT mbCount(@NativeType("uint32_t") int value) { nmbCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link #pRefFinalList0Entries} field. */
    public VkVideoEncodeH264NaluSliceEXT pRefFinalList0Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npRefFinalList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link #pRefFinalList1Entries} field. */
    public VkVideoEncodeH264NaluSliceEXT pRefFinalList1Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npRefFinalList1Entries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264NaluSliceEXT set(
        int sType,
        long pNext,
        StdVideoEncodeH264SliceHeader pSliceHeaderStd,
        int mbCount,
        VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList0Entries,
        VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList1Entries
    ) {
        sType(sType);
        pNext(pNext);
        pSliceHeaderStd(pSliceHeaderStd);
        mbCount(mbCount);
        pRefFinalList0Entries(pRefFinalList0Entries);
        pRefFinalList1Entries(pRefFinalList1Entries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264NaluSliceEXT set(VkVideoEncodeH264NaluSliceEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264NaluSliceEXT malloc() {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264NaluSliceEXT calloc() {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264NaluSliceEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264NaluSliceEXT create(long address) {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264NaluSliceEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264NaluSliceEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264NaluSliceEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264NaluSliceEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PNEXT); }
    /** Unsafe version of {@link #pSliceHeaderStd}. */
    public static StdVideoEncodeH264SliceHeader npSliceHeaderStd(long struct) { return StdVideoEncodeH264SliceHeader.create(memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PSLICEHEADERSTD)); }
    /** Unsafe version of {@link #mbCount}. */
    public static int nmbCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264NaluSliceEXT.MBCOUNT); }
    /** Unsafe version of {@link #refFinalList0EntryCount}. */
    public static byte nrefFinalList0EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264NaluSliceEXT.REFFINALLIST0ENTRYCOUNT); }
    /** Unsafe version of {@link #pRefFinalList0Entries}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer npRefFinalList0Entries(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.create(memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST0ENTRIES), Byte.toUnsignedInt(nrefFinalList0EntryCount(struct))); }
    /** Unsafe version of {@link #refFinalList1EntryCount}. */
    public static byte nrefFinalList1EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264NaluSliceEXT.REFFINALLIST1ENTRYCOUNT); }
    /** Unsafe version of {@link #pRefFinalList1Entries}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer npRefFinalList1Entries(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.create(memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST1ENTRIES), Byte.toUnsignedInt(nrefFinalList1EntryCount(struct))); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PNEXT, value); }
    /** Unsafe version of {@link #pSliceHeaderStd(StdVideoEncodeH264SliceHeader) pSliceHeaderStd}. */
    public static void npSliceHeaderStd(long struct, StdVideoEncodeH264SliceHeader value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PSLICEHEADERSTD, value.address()); }
    /** Unsafe version of {@link #mbCount(int) mbCount}. */
    public static void nmbCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceEXT.MBCOUNT, value); }
    /** Sets the specified value to the {@code refFinalList0EntryCount} field of the specified {@code struct}. */
    public static void nrefFinalList0EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264NaluSliceEXT.REFFINALLIST0ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pRefFinalList0Entries(VkVideoEncodeH264DpbSlotInfoEXT.Buffer) pRefFinalList0Entries}. */
    public static void npRefFinalList0Entries(long struct, VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST0ENTRIES, value.address()); nrefFinalList0EntryCount(struct, (byte)value.remaining()); }
    /** Sets the specified value to the {@code refFinalList1EntryCount} field of the specified {@code struct}. */
    public static void nrefFinalList1EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264NaluSliceEXT.REFFINALLIST1ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pRefFinalList1Entries(VkVideoEncodeH264DpbSlotInfoEXT.Buffer) pRefFinalList1Entries}. */
    public static void npRefFinalList1Entries(long struct, VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST1ENTRIES, value.address()); nrefFinalList1EntryCount(struct, (byte)value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pSliceHeaderStd = memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PSLICEHEADERSTD);
        check(pSliceHeaderStd);
        StdVideoEncodeH264SliceHeader.validate(pSliceHeaderStd);
        byte refFinalList0EntryCount = nrefFinalList0EntryCount(struct);
        long pRefFinalList0Entries = memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST0ENTRIES);
        check(pRefFinalList0Entries);
        validate(pRefFinalList0Entries, refFinalList0EntryCount, VkVideoEncodeH264DpbSlotInfoEXT.SIZEOF, VkVideoEncodeH264DpbSlotInfoEXT::validate);
        byte refFinalList1EntryCount = nrefFinalList1EntryCount(struct);
        long pRefFinalList1Entries = memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST1ENTRIES);
        check(pRefFinalList1Entries);
        validate(pRefFinalList1Entries, refFinalList1EntryCount, VkVideoEncodeH264DpbSlotInfoEXT.SIZEOF, VkVideoEncodeH264DpbSlotInfoEXT::validate);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264NaluSliceEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264NaluSliceEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264NaluSliceEXT ELEMENT_FACTORY = VkVideoEncodeH264NaluSliceEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264NaluSliceEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264NaluSliceEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264NaluSliceEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264NaluSliceEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264NaluSliceEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264NaluSliceEXT.npNext(address()); }
        /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@link VkVideoEncodeH264NaluSliceEXT#pSliceHeaderStd} field. */
        @NativeType("StdVideoEncodeH264SliceHeader const *")
        public StdVideoEncodeH264SliceHeader pSliceHeaderStd() { return VkVideoEncodeH264NaluSliceEXT.npSliceHeaderStd(address()); }
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceEXT#mbCount} field. */
        @NativeType("uint32_t")
        public int mbCount() { return VkVideoEncodeH264NaluSliceEXT.nmbCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceEXT#refFinalList0EntryCount} field. */
        @NativeType("uint8_t")
        public byte refFinalList0EntryCount() { return VkVideoEncodeH264NaluSliceEXT.nrefFinalList0EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264NaluSliceEXT#pRefFinalList0Entries} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList0Entries() { return VkVideoEncodeH264NaluSliceEXT.npRefFinalList0Entries(address()); }
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceEXT#refFinalList1EntryCount} field. */
        @NativeType("uint8_t")
        public byte refFinalList1EntryCount() { return VkVideoEncodeH264NaluSliceEXT.nrefFinalList1EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264NaluSliceEXT#pRefFinalList1Entries} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList1Entries() { return VkVideoEncodeH264NaluSliceEXT.npRefFinalList1Entries(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceEXT#sType} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT} value to the {@link VkVideoEncodeH264NaluSliceEXT#sType} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceEXT#pNext} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264NaluSliceEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@link VkVideoEncodeH264NaluSliceEXT#pSliceHeaderStd} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pSliceHeaderStd(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { VkVideoEncodeH264NaluSliceEXT.npSliceHeaderStd(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceEXT#mbCount} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer mbCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264NaluSliceEXT.nmbCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH264NaluSliceEXT#pRefFinalList0Entries} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pRefFinalList0Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264NaluSliceEXT.npRefFinalList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH264NaluSliceEXT#pRefFinalList1Entries} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pRefFinalList1Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264NaluSliceEXT.npRefFinalList1Entries(address(), value); return this; }

    }

}