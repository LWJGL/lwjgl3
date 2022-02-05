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
 * Structure specifies H.265 reference frame lists.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code referenceList0EntryCount} is not 0, {@code pReferenceList0Entries} <b>must</b> be a valid pointer to an array of {@code referenceList0EntryCount} valid {@link VkVideoEncodeH265DpbSlotInfoEXT} structures</li>
 * <li>If {@code referenceList1EntryCount} is not 0, {@code pReferenceList1Entries} <b>must</b> be a valid pointer to an array of {@code referenceList1EntryCount} valid {@link VkVideoEncodeH265DpbSlotInfoEXT} structures</li>
 * <li>{@code pReferenceModifications} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265ReferenceModifications} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265DpbSlotInfoEXT}, {@link VkVideoEncodeH265NaluSliceSegmentEXT}, {@link VkVideoEncodeH265VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265ReferenceListsEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t {@link #referenceList0EntryCount};
 *     {@link VkVideoEncodeH265DpbSlotInfoEXT VkVideoEncodeH265DpbSlotInfoEXT} const * {@link #pReferenceList0Entries};
 *     uint8_t {@link #referenceList1EntryCount};
 *     {@link VkVideoEncodeH265DpbSlotInfoEXT VkVideoEncodeH265DpbSlotInfoEXT} const * {@link #pReferenceList1Entries};
 *     {@link StdVideoEncodeH265ReferenceModifications StdVideoEncodeH265ReferenceModifications} const * {@link #pReferenceModifications};
 * }</code></pre>
 */
public class VkVideoEncodeH265ReferenceListsEXT extends Struct implements NativeResource {

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
        PREFERENCEMODIFICATIONS;

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
        PREFERENCEMODIFICATIONS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkVideoEncodeH265ReferenceListsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265ReferenceListsEXT(ByteBuffer container) {
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
    /** the number of reference pictures in reference list L0 and is identical to {@code StdVideoEncodeH265SliceSegmentHeader}{@code ::num_ref_idx_l0_active_minus1} + 1. */
    @NativeType("uint8_t")
    public byte referenceList0EntryCount() { return nreferenceList0EntryCount(address()); }
    /** a pointer to an array of {@code referenceList0EntryCount} {@link VkVideoEncodeH265DpbSlotInfoEXT} structures specifying the reference list L0 entries for the current picture. */
    @Nullable
    @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *")
    public VkVideoEncodeH265DpbSlotInfoEXT.Buffer pReferenceList0Entries() { return npReferenceList0Entries(address()); }
    /** the number of reference pictures in reference list L1 and is identical to {@code StdVideoEncodeH265SliceSegmentHeader}{@code ::num_ref_idx_l1_active_minus1} + 1. */
    @NativeType("uint8_t")
    public byte referenceList1EntryCount() { return nreferenceList1EntryCount(address()); }
    /** a pointer to an array of {@code referenceList1EntryCount} {@link VkVideoEncodeH265DpbSlotInfoEXT} structures specifying the reference list L1 entries for the current picture. */
    @Nullable
    @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *")
    public VkVideoEncodeH265DpbSlotInfoEXT.Buffer pReferenceList1Entries() { return npReferenceList1Entries(address()); }
    /** a pointer to a {@code StdVideoEncodeH265ReferenceModifications} structure specifying reference list modifications. */
    @NativeType("StdVideoEncodeH265ReferenceModifications const *")
    public StdVideoEncodeH265ReferenceModifications pReferenceModifications() { return npReferenceModifications(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265ReferenceListsEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265ReferenceListsEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265ReferenceListsEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} to the {@link #pReferenceList0Entries} field. */
    public VkVideoEncodeH265ReferenceListsEXT pReferenceList0Entries(@Nullable @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *") VkVideoEncodeH265DpbSlotInfoEXT.Buffer value) { npReferenceList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} to the {@link #pReferenceList1Entries} field. */
    public VkVideoEncodeH265ReferenceListsEXT pReferenceList1Entries(@Nullable @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *") VkVideoEncodeH265DpbSlotInfoEXT.Buffer value) { npReferenceList1Entries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceModifications} to the {@link #pReferenceModifications} field. */
    public VkVideoEncodeH265ReferenceListsEXT pReferenceModifications(@NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) { npReferenceModifications(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265ReferenceListsEXT set(
        int sType,
        long pNext,
        @Nullable VkVideoEncodeH265DpbSlotInfoEXT.Buffer pReferenceList0Entries,
        @Nullable VkVideoEncodeH265DpbSlotInfoEXT.Buffer pReferenceList1Entries,
        StdVideoEncodeH265ReferenceModifications pReferenceModifications
    ) {
        sType(sType);
        pNext(pNext);
        pReferenceList0Entries(pReferenceList0Entries);
        pReferenceList1Entries(pReferenceList1Entries);
        pReferenceModifications(pReferenceModifications);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265ReferenceListsEXT set(VkVideoEncodeH265ReferenceListsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265ReferenceListsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265ReferenceListsEXT malloc() {
        return wrap(VkVideoEncodeH265ReferenceListsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265ReferenceListsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265ReferenceListsEXT calloc() {
        return wrap(VkVideoEncodeH265ReferenceListsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265ReferenceListsEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265ReferenceListsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265ReferenceListsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265ReferenceListsEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265ReferenceListsEXT create(long address) {
        return wrap(VkVideoEncodeH265ReferenceListsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265ReferenceListsEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265ReferenceListsEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265ReferenceListsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265ReferenceListsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265ReferenceListsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265ReferenceListsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265ReferenceListsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265ReferenceListsEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265ReferenceListsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265ReferenceListsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265ReferenceListsEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265ReferenceListsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265ReferenceListsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265ReferenceListsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265ReferenceListsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265ReferenceListsEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PNEXT); }
    /** Unsafe version of {@link #referenceList0EntryCount}. */
    public static byte nreferenceList0EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265ReferenceListsEXT.REFERENCELIST0ENTRYCOUNT); }
    /** Unsafe version of {@link #pReferenceList0Entries}. */
    @Nullable public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer npReferenceList0Entries(long struct) { return VkVideoEncodeH265DpbSlotInfoEXT.createSafe(memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCELIST0ENTRIES), Byte.toUnsignedInt(nreferenceList0EntryCount(struct))); }
    /** Unsafe version of {@link #referenceList1EntryCount}. */
    public static byte nreferenceList1EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265ReferenceListsEXT.REFERENCELIST1ENTRYCOUNT); }
    /** Unsafe version of {@link #pReferenceList1Entries}. */
    @Nullable public static VkVideoEncodeH265DpbSlotInfoEXT.Buffer npReferenceList1Entries(long struct) { return VkVideoEncodeH265DpbSlotInfoEXT.createSafe(memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCELIST1ENTRIES), Byte.toUnsignedInt(nreferenceList1EntryCount(struct))); }
    /** Unsafe version of {@link #pReferenceModifications}. */
    public static StdVideoEncodeH265ReferenceModifications npReferenceModifications(long struct) { return StdVideoEncodeH265ReferenceModifications.create(memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCEMODIFICATIONS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265ReferenceListsEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PNEXT, value); }
    /** Sets the specified value to the {@code referenceList0EntryCount} field of the specified {@code struct}. */
    public static void nreferenceList0EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265ReferenceListsEXT.REFERENCELIST0ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pReferenceList0Entries(VkVideoEncodeH265DpbSlotInfoEXT.Buffer) pReferenceList0Entries}. */
    public static void npReferenceList0Entries(long struct, @Nullable VkVideoEncodeH265DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCELIST0ENTRIES, memAddressSafe(value)); nreferenceList0EntryCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Sets the specified value to the {@code referenceList1EntryCount} field of the specified {@code struct}. */
    public static void nreferenceList1EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265ReferenceListsEXT.REFERENCELIST1ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pReferenceList1Entries(VkVideoEncodeH265DpbSlotInfoEXT.Buffer) pReferenceList1Entries}. */
    public static void npReferenceList1Entries(long struct, @Nullable VkVideoEncodeH265DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCELIST1ENTRIES, memAddressSafe(value)); nreferenceList1EntryCount(struct, value == null ? 0 : (byte)value.remaining()); }
    /** Unsafe version of {@link #pReferenceModifications(StdVideoEncodeH265ReferenceModifications) pReferenceModifications}. */
    public static void npReferenceModifications(long struct, StdVideoEncodeH265ReferenceModifications value) { memPutAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCEMODIFICATIONS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        byte referenceList0EntryCount = nreferenceList0EntryCount(struct);
        if (referenceList0EntryCount != 0) {
            long pReferenceList0Entries = memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCELIST0ENTRIES);
            check(pReferenceList0Entries);
            validate(pReferenceList0Entries, referenceList0EntryCount, VkVideoEncodeH265DpbSlotInfoEXT.SIZEOF, VkVideoEncodeH265DpbSlotInfoEXT::validate);
        }
        byte referenceList1EntryCount = nreferenceList1EntryCount(struct);
        if (referenceList1EntryCount != 0) {
            long pReferenceList1Entries = memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCELIST1ENTRIES);
            check(pReferenceList1Entries);
            validate(pReferenceList1Entries, referenceList1EntryCount, VkVideoEncodeH265DpbSlotInfoEXT.SIZEOF, VkVideoEncodeH265DpbSlotInfoEXT::validate);
        }
        long pReferenceModifications = memGetAddress(struct + VkVideoEncodeH265ReferenceListsEXT.PREFERENCEMODIFICATIONS);
        check(pReferenceModifications);
        StdVideoEncodeH265ReferenceModifications.validate(pReferenceModifications);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265ReferenceListsEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265ReferenceListsEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265ReferenceListsEXT ELEMENT_FACTORY = VkVideoEncodeH265ReferenceListsEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265ReferenceListsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265ReferenceListsEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265ReferenceListsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265ReferenceListsEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265ReferenceListsEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265ReferenceListsEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265ReferenceListsEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265ReferenceListsEXT#referenceList0EntryCount} field. */
        @NativeType("uint8_t")
        public byte referenceList0EntryCount() { return VkVideoEncodeH265ReferenceListsEXT.nreferenceList0EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265ReferenceListsEXT#pReferenceList0Entries} field. */
        @Nullable
        @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *")
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer pReferenceList0Entries() { return VkVideoEncodeH265ReferenceListsEXT.npReferenceList0Entries(address()); }
        /** @return the value of the {@link VkVideoEncodeH265ReferenceListsEXT#referenceList1EntryCount} field. */
        @NativeType("uint8_t")
        public byte referenceList1EntryCount() { return VkVideoEncodeH265ReferenceListsEXT.nreferenceList1EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265ReferenceListsEXT#pReferenceList1Entries} field. */
        @Nullable
        @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *")
        public VkVideoEncodeH265DpbSlotInfoEXT.Buffer pReferenceList1Entries() { return VkVideoEncodeH265ReferenceListsEXT.npReferenceList1Entries(address()); }
        /** @return a {@link StdVideoEncodeH265ReferenceModifications} view of the struct pointed to by the {@link VkVideoEncodeH265ReferenceListsEXT#pReferenceModifications} field. */
        @NativeType("StdVideoEncodeH265ReferenceModifications const *")
        public StdVideoEncodeH265ReferenceModifications pReferenceModifications() { return VkVideoEncodeH265ReferenceListsEXT.npReferenceModifications(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265ReferenceListsEXT#sType} field. */
        public VkVideoEncodeH265ReferenceListsEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265ReferenceListsEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT} value to the {@link VkVideoEncodeH265ReferenceListsEXT#sType} field. */
        public VkVideoEncodeH265ReferenceListsEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265ReferenceListsEXT#pNext} field. */
        public VkVideoEncodeH265ReferenceListsEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265ReferenceListsEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH265ReferenceListsEXT#pReferenceList0Entries} field. */
        public VkVideoEncodeH265ReferenceListsEXT.Buffer pReferenceList0Entries(@Nullable @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *") VkVideoEncodeH265DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH265ReferenceListsEXT.npReferenceList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH265ReferenceListsEXT#pReferenceList1Entries} field. */
        public VkVideoEncodeH265ReferenceListsEXT.Buffer pReferenceList1Entries(@Nullable @NativeType("VkVideoEncodeH265DpbSlotInfoEXT const *") VkVideoEncodeH265DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH265ReferenceListsEXT.npReferenceList1Entries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceModifications} to the {@link VkVideoEncodeH265ReferenceListsEXT#pReferenceModifications} field. */
        public VkVideoEncodeH265ReferenceListsEXT.Buffer pReferenceModifications(@NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) { VkVideoEncodeH265ReferenceListsEXT.npReferenceModifications(address(), value); return this; }

    }

}