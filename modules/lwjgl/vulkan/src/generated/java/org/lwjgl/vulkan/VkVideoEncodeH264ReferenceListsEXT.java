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
 * Structure specifies H.264 reference frame lists.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code referenceList0EntryCount} is not 0, {@code pReferenceList0Entries} <b>must</b> be a valid pointer to an array of {@code referenceList0EntryCount} valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structures</li>
 * <li>If {@code referenceList1EntryCount} is not 0, {@code pReferenceList1Entries} <b>must</b> be a valid pointer to an array of {@code referenceList1EntryCount} valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structures</li>
 * <li>{@code pMemMgmtCtrlOperations} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264DpbSlotInfoEXT}, {@link VkVideoEncodeH264NaluSliceEXT}, {@link VkVideoEncodeH264VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264ReferenceListsEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t {@link #referenceList0EntryCount};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pReferenceList0Entries};
 *     uint8_t {@link #referenceList1EntryCount};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pReferenceList1Entries};
 *     {@link StdVideoEncodeH264RefMemMgmtCtrlOperations StdVideoEncodeH264RefMemMgmtCtrlOperations} const * {@link #pMemMgmtCtrlOperations};
 * }</code></pre>
 */
public class VkVideoEncodeH264ReferenceListsEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REFERENCELIST0ENTRYCOUNT,
        PREFERENCELIST0ENTRIES,
        REFERENCELIST1ENTRYCOUNT,
        PREFERENCELIST1ENTRIES,
        PMEMMGMTCTRLOPERATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REFERENCELIST0ENTRYCOUNT = layout.offsetof(2);
        PREFERENCELIST0ENTRIES = layout.offsetof(3);
        REFERENCELIST1ENTRYCOUNT = layout.offsetof(4);
        PREFERENCELIST1ENTRIES = layout.offsetof(5);
        PMEMMGMTCTRLOPERATIONS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkVideoEncodeH264ReferenceListsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264ReferenceListsEXT(ByteBuffer container) {
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
    /** the number of reference pictures in reference list L0 and is identical to {@code StdVideoEncodeH264SliceHeader}{@code ::num_ref_idx_l0_active_minus1} + 1. */
    @NativeType("uint8_t")
    public byte referenceList0EntryCount() { return nreferenceList0EntryCount(address()); }
    /** a pointer to an array of {@code referenceList0EntryCount} {@link VkVideoEncodeH264DpbSlotInfoEXT} structures specifying the reference list L0 entries for the current picture. The entries provided <b>must</b> be ordered after all reference list L0 modification operations are applied (i.e. final list order). The entries provided <b>must</b> not reflect decoded picture marking operations in this frame that are applicable to references; the impact of such operations <b>must</b> be reflected in future frame encode commands. The slot index in each entry <b>must</b> match one of the slot indexes provided in the {@code pReferenceSlots} of the parent {@link VkVideoEncodeInfoKHR} structure. */
    @Nullable
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pReferenceList0Entries() { return npReferenceList0Entries(address()); }
    /** the number of reference pictures in reference list L1 and is identical to {@code StdVideoEncodeH264SliceHeader}{@code ::num_ref_idx_l1_active_minus1} + 1. */
    @NativeType("uint8_t")
    public byte referenceList1EntryCount() { return nreferenceList1EntryCount(address()); }
    /** a pointer to an array of {@code referenceList1EntryCount} {@link VkVideoEncodeH264DpbSlotInfoEXT} structures specifying the reference list L1 entries for the current picture. The entries provided <b>must</b> be ordered after all reference list L1 modification operations are applied (i.e. final list order). The entries provided <b>must</b> not reflect decoded picture marking operations in this frame that are applicable to references; the impact of such operations <b>must</b> be reflected in future frame encode commands. The slot index in each entry <b>must</b> match one of the slot indexes provided in the {@code pReferenceSlots} of the parent {@link VkVideoEncodeInfoKHR} structure. */
    @Nullable
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pReferenceList1Entries() { return npReferenceList1Entries(address()); }
    /** a pointer to a {@code StdVideoEncodeH264RefMemMgmtCtrlOperations} structure specifying reference lists modifications and decoded picture marking operations. */
    @NativeType("StdVideoEncodeH264RefMemMgmtCtrlOperations const *")
    public StdVideoEncodeH264RefMemMgmtCtrlOperations pMemMgmtCtrlOperations() { return npMemMgmtCtrlOperations(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264ReferenceListsEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264ReferenceListsEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264ReferenceListsEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link #pReferenceList0Entries} field. */
    public VkVideoEncodeH264ReferenceListsEXT pReferenceList0Entries(@Nullable @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npReferenceList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link #pReferenceList1Entries} field. */
    public VkVideoEncodeH264ReferenceListsEXT pReferenceList1Entries(@Nullable @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npReferenceList1Entries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264RefMemMgmtCtrlOperations} to the {@link #pMemMgmtCtrlOperations} field. */
    public VkVideoEncodeH264ReferenceListsEXT pMemMgmtCtrlOperations(@NativeType("StdVideoEncodeH264RefMemMgmtCtrlOperations const *") StdVideoEncodeH264RefMemMgmtCtrlOperations value) { npMemMgmtCtrlOperations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264ReferenceListsEXT set(
        int sType,
        long pNext,
        @Nullable VkVideoEncodeH264DpbSlotInfoEXT.Buffer pReferenceList0Entries,
        @Nullable VkVideoEncodeH264DpbSlotInfoEXT.Buffer pReferenceList1Entries,
        StdVideoEncodeH264RefMemMgmtCtrlOperations pMemMgmtCtrlOperations
    ) {
        sType(sType);
        pNext(pNext);
        pReferenceList0Entries(pReferenceList0Entries);
        pReferenceList1Entries(pReferenceList1Entries);
        pMemMgmtCtrlOperations(pMemMgmtCtrlOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264ReferenceListsEXT set(VkVideoEncodeH264ReferenceListsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264ReferenceListsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264ReferenceListsEXT malloc() {
        return wrap(VkVideoEncodeH264ReferenceListsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264ReferenceListsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264ReferenceListsEXT calloc() {
        return wrap(VkVideoEncodeH264ReferenceListsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264ReferenceListsEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264ReferenceListsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264ReferenceListsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264ReferenceListsEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264ReferenceListsEXT create(long address) {
        return wrap(VkVideoEncodeH264ReferenceListsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264ReferenceListsEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264ReferenceListsEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ReferenceListsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ReferenceListsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ReferenceListsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264ReferenceListsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264ReferenceListsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264ReferenceListsEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264ReferenceListsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264ReferenceListsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264ReferenceListsEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264ReferenceListsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ReferenceListsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264ReferenceListsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264ReferenceListsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264ReferenceListsEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PNEXT); }
    /** Unsafe version of {@link #referenceList0EntryCount}. */
    public static byte nreferenceList0EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264ReferenceListsEXT.REFERENCELIST0ENTRYCOUNT); }
    /** Unsafe version of {@link #pReferenceList0Entries}. */
    @Nullable public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer npReferenceList0Entries(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.createSafe(memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PREFERENCELIST0ENTRIES), Byte.toUnsignedInt(nreferenceList0EntryCount(struct))); }
    /** Unsafe version of {@link #referenceList1EntryCount}. */
    public static byte nreferenceList1EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264ReferenceListsEXT.REFERENCELIST1ENTRYCOUNT); }
    /** Unsafe version of {@link #pReferenceList1Entries}. */
    @Nullable public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer npReferenceList1Entries(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.createSafe(memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PREFERENCELIST1ENTRIES), Byte.toUnsignedInt(nreferenceList1EntryCount(struct))); }
    /** Unsafe version of {@link #pMemMgmtCtrlOperations}. */
    public static StdVideoEncodeH264RefMemMgmtCtrlOperations npMemMgmtCtrlOperations(long struct) { return StdVideoEncodeH264RefMemMgmtCtrlOperations.create(memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PMEMMGMTCTRLOPERATIONS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264ReferenceListsEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PNEXT, value); }
    /** Sets the specified value to the {@code referenceList0EntryCount} field of the specified {@code struct}. */
    public static void nreferenceList0EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264ReferenceListsEXT.REFERENCELIST0ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pReferenceList0Entries(VkVideoEncodeH264DpbSlotInfoEXT.Buffer) pReferenceList0Entries}. */
    public static void npReferenceList0Entries(long struct, @Nullable VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PREFERENCELIST0ENTRIES, memAddressSafe(value)); nreferenceList0EntryCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Sets the specified value to the {@code referenceList1EntryCount} field of the specified {@code struct}. */
    public static void nreferenceList1EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264ReferenceListsEXT.REFERENCELIST1ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pReferenceList1Entries(VkVideoEncodeH264DpbSlotInfoEXT.Buffer) pReferenceList1Entries}. */
    public static void npReferenceList1Entries(long struct, @Nullable VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PREFERENCELIST1ENTRIES, memAddressSafe(value)); nreferenceList1EntryCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pMemMgmtCtrlOperations(StdVideoEncodeH264RefMemMgmtCtrlOperations) pMemMgmtCtrlOperations}. */
    public static void npMemMgmtCtrlOperations(long struct, StdVideoEncodeH264RefMemMgmtCtrlOperations value) { memPutAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PMEMMGMTCTRLOPERATIONS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        byte referenceList0EntryCount = nreferenceList0EntryCount(struct);
        if (referenceList0EntryCount != 0) {
            long pReferenceList0Entries = memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PREFERENCELIST0ENTRIES);
            check(pReferenceList0Entries);
            validate(pReferenceList0Entries, referenceList0EntryCount, VkVideoEncodeH264DpbSlotInfoEXT.SIZEOF, VkVideoEncodeH264DpbSlotInfoEXT::validate);
        }
        byte referenceList1EntryCount = nreferenceList1EntryCount(struct);
        if (referenceList1EntryCount != 0) {
            long pReferenceList1Entries = memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PREFERENCELIST1ENTRIES);
            check(pReferenceList1Entries);
            validate(pReferenceList1Entries, referenceList1EntryCount, VkVideoEncodeH264DpbSlotInfoEXT.SIZEOF, VkVideoEncodeH264DpbSlotInfoEXT::validate);
        }
        long pMemMgmtCtrlOperations = memGetAddress(struct + VkVideoEncodeH264ReferenceListsEXT.PMEMMGMTCTRLOPERATIONS);
        check(pMemMgmtCtrlOperations);
        StdVideoEncodeH264RefMemMgmtCtrlOperations.validate(pMemMgmtCtrlOperations);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264ReferenceListsEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264ReferenceListsEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264ReferenceListsEXT ELEMENT_FACTORY = VkVideoEncodeH264ReferenceListsEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264ReferenceListsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264ReferenceListsEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264ReferenceListsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264ReferenceListsEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264ReferenceListsEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264ReferenceListsEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264ReferenceListsEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264ReferenceListsEXT#referenceList0EntryCount} field. */
        @NativeType("uint8_t")
        public byte referenceList0EntryCount() { return VkVideoEncodeH264ReferenceListsEXT.nreferenceList0EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264ReferenceListsEXT#pReferenceList0Entries} field. */
        @Nullable
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pReferenceList0Entries() { return VkVideoEncodeH264ReferenceListsEXT.npReferenceList0Entries(address()); }
        /** @return the value of the {@link VkVideoEncodeH264ReferenceListsEXT#referenceList1EntryCount} field. */
        @NativeType("uint8_t")
        public byte referenceList1EntryCount() { return VkVideoEncodeH264ReferenceListsEXT.nreferenceList1EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264ReferenceListsEXT#pReferenceList1Entries} field. */
        @Nullable
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pReferenceList1Entries() { return VkVideoEncodeH264ReferenceListsEXT.npReferenceList1Entries(address()); }
        /** @return a {@link StdVideoEncodeH264RefMemMgmtCtrlOperations} view of the struct pointed to by the {@link VkVideoEncodeH264ReferenceListsEXT#pMemMgmtCtrlOperations} field. */
        @NativeType("StdVideoEncodeH264RefMemMgmtCtrlOperations const *")
        public StdVideoEncodeH264RefMemMgmtCtrlOperations pMemMgmtCtrlOperations() { return VkVideoEncodeH264ReferenceListsEXT.npMemMgmtCtrlOperations(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264ReferenceListsEXT#sType} field. */
        public VkVideoEncodeH264ReferenceListsEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264ReferenceListsEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT} value to the {@link VkVideoEncodeH264ReferenceListsEXT#sType} field. */
        public VkVideoEncodeH264ReferenceListsEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_REFERENCE_LISTS_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264ReferenceListsEXT#pNext} field. */
        public VkVideoEncodeH264ReferenceListsEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264ReferenceListsEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH264ReferenceListsEXT#pReferenceList0Entries} field. */
        public VkVideoEncodeH264ReferenceListsEXT.Buffer pReferenceList0Entries(@Nullable @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264ReferenceListsEXT.npReferenceList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH264ReferenceListsEXT#pReferenceList1Entries} field. */
        public VkVideoEncodeH264ReferenceListsEXT.Buffer pReferenceList1Entries(@Nullable @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264ReferenceListsEXT.npReferenceList1Entries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264RefMemMgmtCtrlOperations} to the {@link VkVideoEncodeH264ReferenceListsEXT#pMemMgmtCtrlOperations} field. */
        public VkVideoEncodeH264ReferenceListsEXT.Buffer pMemMgmtCtrlOperations(@NativeType("StdVideoEncodeH264RefMemMgmtCtrlOperations const *") StdVideoEncodeH264RefMemMgmtCtrlOperations value) { VkVideoEncodeH264ReferenceListsEXT.npMemMgmtCtrlOperations(address(), value); return this; }

    }

}