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

/**
 * Structure specifies H.264 encode frame parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT}</li>
 * <li>{@code pRefDefaultFinalList0Entries} <b>must</b> be a valid pointer to an array of {@code refDefaultFinalList0EntryCount} valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structures</li>
 * <li>{@code pRefDefaultFinalList1Entries} <b>must</b> be a valid pointer to an array of {@code refDefaultFinalList1EntryCount} valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structures</li>
 * <li>{@code pNaluSliceEntries} <b>must</b> be a valid pointer to an array of {@code naluSliceEntryCount} valid {@link VkVideoEncodeH264NaluSliceEXT} structures</li>
 * <li>{@code pCurrentPictureInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH264DpbSlotInfoEXT} structure</li>
 * <li>{@code refDefaultFinalList0EntryCount} <b>must</b> be greater than 0</li>
 * <li>{@code refDefaultFinalList1EntryCount} <b>must</b> be greater than 0</li>
 * <li>{@code naluSliceEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264DpbSlotInfoEXT}, {@link VkVideoEncodeH264NaluSliceEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264VclFrameInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t {@link #refDefaultFinalList0EntryCount};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pRefDefaultFinalList0Entries};
 *     uint8_t {@link #refDefaultFinalList1EntryCount};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pRefDefaultFinalList1Entries};
 *     uint32_t {@link #naluSliceEntryCount};
 *     {@link VkVideoEncodeH264NaluSliceEXT VkVideoEncodeH264NaluSliceEXT} const * {@link #pNaluSliceEntries};
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * {@link #pCurrentPictureInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH264VclFrameInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REFDEFAULTFINALLIST0ENTRYCOUNT,
        PREFDEFAULTFINALLIST0ENTRIES,
        REFDEFAULTFINALLIST1ENTRYCOUNT,
        PREFDEFAULTFINALLIST1ENTRIES,
        NALUSLICEENTRYCOUNT,
        PNALUSLICEENTRIES,
        PCURRENTPICTUREINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REFDEFAULTFINALLIST0ENTRYCOUNT = layout.offsetof(2);
        PREFDEFAULTFINALLIST0ENTRIES = layout.offsetof(3);
        REFDEFAULTFINALLIST1ENTRYCOUNT = layout.offsetof(4);
        PREFDEFAULTFINALLIST1ENTRIES = layout.offsetof(5);
        NALUSLICEENTRYCOUNT = layout.offsetof(6);
        PNALUSLICEENTRIES = layout.offsetof(7);
        PCURRENTPICTUREINFO = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkVideoEncodeH264VclFrameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264VclFrameInfoEXT(ByteBuffer container) {
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
    /** the default number of reference List0 entries for all slices of this frame. Each slice <b>may</b> override this by providing its own List0 entries. */
    @NativeType("uint8_t")
    public byte refDefaultFinalList0EntryCount() { return nrefDefaultFinalList0EntryCount(address()); }
    /** a pointer to an array of {@link VkVideoEncodeH264DpbSlotInfoEXT} structures providing information for each reference List0 entry. The entries provided <b>must</b> be ordered after all reference List0 modification operations are applied (i.e. final list order). The entires provided <b>must</b> not reflect decoded picture marking operations in this frame that are applicable to references; the impact of such operations <b>must</b> be reflected in future frame encode cmds. The slot index in each entry <b>must</b> match one of the slot indexes provided in {@code pReferenceSlots} of the {@link VkVideoEncodeInfoKHR} structure to which this structure is chained. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefDefaultFinalList0Entries() { return npRefDefaultFinalList0Entries(address()); }
    /** the default number of reference List1 entries for all slices of this frame. Each slice <b>may</b> override this by providing its own List1 entries. */
    @NativeType("uint8_t")
    public byte refDefaultFinalList1EntryCount() { return nrefDefaultFinalList1EntryCount(address()); }
    /** a pointer to an array of {@link VkVideoEncodeH264DpbSlotInfoEXT} structures providing information related to each reference List1 entry. The entries provided <b>must</b> be ordered after all reference List1 modification operations are applied (i.e. final list order). The entires provided <b>must</b> not reflect decoded picture marking operations in this frame that are applicable to references; the impact of such operations <b>must</b> be reflected in future frame encode cmds. The slot index in each entry <b>must</b> match one of the slot indexes provided in {@code pReferenceSlots} of the {@link VkVideoEncodeInfoKHR} structure to which this structure is chained. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefDefaultFinalList1Entries() { return npRefDefaultFinalList1Entries(address()); }
    /** the number of NALUs in this frame. */
    @NativeType("uint32_t")
    public int naluSliceEntryCount() { return nnaluSliceEntryCount(address()); }
    /** a pointer to an array of {@code naluCount} {@link VkVideoEncodeH264NaluSliceEXT} structures that make up the frame. This is an ordered sequence; the NALUs are generated consecutively in the bitstream buffer (provided in {@code bitstreamBuffer} in {@link VkVideoBeginCodingInfoKHR}) in the same order as in this array. */
    @NativeType("VkVideoEncodeH264NaluSliceEXT const *")
    public VkVideoEncodeH264NaluSliceEXT.Buffer pNaluSliceEntries() { return npNaluSliceEntries(address()); }
    /** a pointer to a {@link VkVideoEncodeH264DpbSlotInfoEXT} structure specifying information for the reconstructed picture for this frame. Info provided <b>must</b> reflect decoded picture marking operations in this frame that are applicable to this frame. The slot index in pCurrentPictureInfo <b>must</b> match the slot index provided in {@code pSetupReferenceSlot} of {@link VkVideoEncodeInfoKHR} structure to which this structure is chained to. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT pCurrentPictureInfo() { return npCurrentPictureInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264VclFrameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link #pRefDefaultFinalList0Entries} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pRefDefaultFinalList0Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npRefDefaultFinalList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link #pRefDefaultFinalList1Entries} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pRefDefaultFinalList1Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npRefDefaultFinalList1Entries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceEXT.Buffer} to the {@link #pNaluSliceEntries} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceEXT const *") VkVideoEncodeH264NaluSliceEXT.Buffer value) { npNaluSliceEntries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT} to the {@link #pCurrentPictureInfo} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pCurrentPictureInfo(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT value) { npCurrentPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264VclFrameInfoEXT set(
        int sType,
        long pNext,
        VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefDefaultFinalList0Entries,
        VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefDefaultFinalList1Entries,
        VkVideoEncodeH264NaluSliceEXT.Buffer pNaluSliceEntries,
        VkVideoEncodeH264DpbSlotInfoEXT pCurrentPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        pRefDefaultFinalList0Entries(pRefDefaultFinalList0Entries);
        pRefDefaultFinalList1Entries(pRefDefaultFinalList1Entries);
        pNaluSliceEntries(pNaluSliceEntries);
        pCurrentPictureInfo(pCurrentPictureInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264VclFrameInfoEXT set(VkVideoEncodeH264VclFrameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264VclFrameInfoEXT malloc() {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264VclFrameInfoEXT calloc() {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264VclFrameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264VclFrameInfoEXT create(long address) {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264VclFrameInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264VclFrameInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkVideoEncodeH264VclFrameInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkVideoEncodeH264VclFrameInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264VclFrameInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264VclFrameInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #refDefaultFinalList0EntryCount}. */
    public static byte nrefDefaultFinalList0EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264VclFrameInfoEXT.REFDEFAULTFINALLIST0ENTRYCOUNT); }
    /** Unsafe version of {@link #pRefDefaultFinalList0Entries}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer npRefDefaultFinalList0Entries(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.create(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFDEFAULTFINALLIST0ENTRIES), Byte.toUnsignedInt(nrefDefaultFinalList0EntryCount(struct))); }
    /** Unsafe version of {@link #refDefaultFinalList1EntryCount}. */
    public static byte nrefDefaultFinalList1EntryCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264VclFrameInfoEXT.REFDEFAULTFINALLIST1ENTRYCOUNT); }
    /** Unsafe version of {@link #pRefDefaultFinalList1Entries}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT.Buffer npRefDefaultFinalList1Entries(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.create(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFDEFAULTFINALLIST1ENTRIES), Byte.toUnsignedInt(nrefDefaultFinalList1EntryCount(struct))); }
    /** Unsafe version of {@link #naluSliceEntryCount}. */
    public static int nnaluSliceEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.NALUSLICEENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceEntries}. */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer npNaluSliceEntries(long struct) { return VkVideoEncodeH264NaluSliceEXT.create(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNALUSLICEENTRIES), nnaluSliceEntryCount(struct)); }
    /** Unsafe version of {@link #pCurrentPictureInfo}. */
    public static VkVideoEncodeH264DpbSlotInfoEXT npCurrentPictureInfo(long struct) { return VkVideoEncodeH264DpbSlotInfoEXT.create(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PCURRENTPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code refDefaultFinalList0EntryCount} field of the specified {@code struct}. */
    public static void nrefDefaultFinalList0EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264VclFrameInfoEXT.REFDEFAULTFINALLIST0ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pRefDefaultFinalList0Entries(VkVideoEncodeH264DpbSlotInfoEXT.Buffer) pRefDefaultFinalList0Entries}. */
    public static void npRefDefaultFinalList0Entries(long struct, VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFDEFAULTFINALLIST0ENTRIES, value.address()); nrefDefaultFinalList0EntryCount(struct, (byte)value.remaining()); }
    /** Sets the specified value to the {@code refDefaultFinalList1EntryCount} field of the specified {@code struct}. */
    public static void nrefDefaultFinalList1EntryCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264VclFrameInfoEXT.REFDEFAULTFINALLIST1ENTRYCOUNT, value); }
    /** Unsafe version of {@link #pRefDefaultFinalList1Entries(VkVideoEncodeH264DpbSlotInfoEXT.Buffer) pRefDefaultFinalList1Entries}. */
    public static void npRefDefaultFinalList1Entries(long struct, VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFDEFAULTFINALLIST1ENTRIES, value.address()); nrefDefaultFinalList1EntryCount(struct, (byte)value.remaining()); }
    /** Sets the specified value to the {@code naluSliceEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.NALUSLICEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceEntries(VkVideoEncodeH264NaluSliceEXT.Buffer) pNaluSliceEntries}. */
    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNALUSLICEENTRIES, value.address()); nnaluSliceEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pCurrentPictureInfo(VkVideoEncodeH264DpbSlotInfoEXT) pCurrentPictureInfo}. */
    public static void npCurrentPictureInfo(long struct, VkVideoEncodeH264DpbSlotInfoEXT value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PCURRENTPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        byte refDefaultFinalList0EntryCount = nrefDefaultFinalList0EntryCount(struct);
        long pRefDefaultFinalList0Entries = memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFDEFAULTFINALLIST0ENTRIES);
        check(pRefDefaultFinalList0Entries);
        VkVideoEncodeH264DpbSlotInfoEXT.validate(pRefDefaultFinalList0Entries, refDefaultFinalList0EntryCount);
        byte refDefaultFinalList1EntryCount = nrefDefaultFinalList1EntryCount(struct);
        long pRefDefaultFinalList1Entries = memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFDEFAULTFINALLIST1ENTRIES);
        check(pRefDefaultFinalList1Entries);
        VkVideoEncodeH264DpbSlotInfoEXT.validate(pRefDefaultFinalList1Entries, refDefaultFinalList1EntryCount);
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNALUSLICEENTRIES);
        check(pNaluSliceEntries);
        VkVideoEncodeH264NaluSliceEXT.validate(pNaluSliceEntries, naluSliceEntryCount);
        long pCurrentPictureInfo = memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PCURRENTPICTUREINFO);
        check(pCurrentPictureInfo);
        VkVideoEncodeH264DpbSlotInfoEXT.validate(pCurrentPictureInfo);
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264VclFrameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264VclFrameInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264VclFrameInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264VclFrameInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264VclFrameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264VclFrameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264VclFrameInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264VclFrameInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#refDefaultFinalList0EntryCount} field. */
        @NativeType("uint8_t")
        public byte refDefaultFinalList0EntryCount() { return VkVideoEncodeH264VclFrameInfoEXT.nrefDefaultFinalList0EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pRefDefaultFinalList0Entries} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefDefaultFinalList0Entries() { return VkVideoEncodeH264VclFrameInfoEXT.npRefDefaultFinalList0Entries(address()); }
        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#refDefaultFinalList1EntryCount} field. */
        @NativeType("uint8_t")
        public byte refDefaultFinalList1EntryCount() { return VkVideoEncodeH264VclFrameInfoEXT.nrefDefaultFinalList1EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pRefDefaultFinalList1Entries} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefDefaultFinalList1Entries() { return VkVideoEncodeH264VclFrameInfoEXT.npRefDefaultFinalList1Entries(address()); }
        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#naluSliceEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceEntryCount() { return VkVideoEncodeH264VclFrameInfoEXT.nnaluSliceEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264NaluSliceEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pNaluSliceEntries} field. */
        @NativeType("VkVideoEncodeH264NaluSliceEXT const *")
        public VkVideoEncodeH264NaluSliceEXT.Buffer pNaluSliceEntries() { return VkVideoEncodeH264VclFrameInfoEXT.npNaluSliceEntries(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT} view of the struct pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pCurrentPictureInfo} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT pCurrentPictureInfo() { return VkVideoEncodeH264VclFrameInfoEXT.npCurrentPictureInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264VclFrameInfoEXT#sType} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264VclFrameInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264VclFrameInfoEXT#pNext} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264VclFrameInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pRefDefaultFinalList0Entries} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pRefDefaultFinalList0Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264VclFrameInfoEXT.npRefDefaultFinalList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pRefDefaultFinalList1Entries} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pRefDefaultFinalList1Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264VclFrameInfoEXT.npRefDefaultFinalList1Entries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceEXT.Buffer} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pNaluSliceEntries} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceEXT const *") VkVideoEncodeH264NaluSliceEXT.Buffer value) { VkVideoEncodeH264VclFrameInfoEXT.npNaluSliceEntries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pCurrentPictureInfo} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pCurrentPictureInfo(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT value) { VkVideoEncodeH264VclFrameInfoEXT.npCurrentPictureInfo(address(), value); return this; }

    }

}