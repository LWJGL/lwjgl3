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
 * <h5>Description</h5>
 * 
 * <p>When rate control is disabled, {@code minQp} and {@code maxQp} <b>must</b> be set to the same QP value.</p>
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
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoEncodeH264SliceHeader StdVideoEncodeH264SliceHeader} const * pSliceHeaderStd;
 *     uint32_t mbCount;
 *     uint8_t refFinalList0EntryCount;
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * pRefFinalList0Entries;
 *     uint8_t refFinalList1EntryCount;
 *     {@link VkVideoEncodeH264DpbSlotInfoEXT VkVideoEncodeH264DpbSlotInfoEXT} const * pRefFinalList1Entries;
 *     uint32_t precedingNaluBytes;
 *     uint8_t minQp;
 *     uint8_t maxQp;
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
        PREFFINALLIST1ENTRIES,
        PRECEDINGNALUBYTES,
        MINQP,
        MAXQP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(1),
            __member(POINTER_SIZE),
            __member(1),
            __member(POINTER_SIZE),
            __member(4),
            __member(1),
            __member(1)
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
        PRECEDINGNALUBYTES = layout.offsetof(8);
        MINQP = layout.offsetof(9);
        MAXQP = layout.offsetof(10);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@code pSliceHeaderStd} field. */
    @NativeType("StdVideoEncodeH264SliceHeader const *")
    public StdVideoEncodeH264SliceHeader pSliceHeaderStd() { return npSliceHeaderStd(address()); }
    /** @return the value of the {@code mbCount} field. */
    @NativeType("uint32_t")
    public int mbCount() { return nmbCount(address()); }
    /** @return the value of the {@code refFinalList0EntryCount} field. */
    @NativeType("uint8_t")
    public byte refFinalList0EntryCount() { return nrefFinalList0EntryCount(address()); }
    /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@code pRefFinalList0Entries} field. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList0Entries() { return npRefFinalList0Entries(address()); }
    /** @return the value of the {@code refFinalList1EntryCount} field. */
    @NativeType("uint8_t")
    public byte refFinalList1EntryCount() { return nrefFinalList1EntryCount(address()); }
    /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@code pRefFinalList1Entries} field. */
    @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
    public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList1Entries() { return npRefFinalList1Entries(address()); }
    /** @return the value of the {@code precedingNaluBytes} field. */
    @NativeType("uint32_t")
    public int precedingNaluBytes() { return nprecedingNaluBytes(address()); }
    /** @return the value of the {@code minQp} field. */
    @NativeType("uint8_t")
    public byte minQp() { return nminQp(address()); }
    /** @return the value of the {@code maxQp} field. */
    @NativeType("uint8_t")
    public byte maxQp() { return nmaxQp(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264NaluSliceEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264NaluSliceEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@code pSliceHeaderStd} field. */
    public VkVideoEncodeH264NaluSliceEXT pSliceHeaderStd(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { npSliceHeaderStd(address(), value); return this; }
    /** Sets the specified value to the {@code mbCount} field. */
    public VkVideoEncodeH264NaluSliceEXT mbCount(@NativeType("uint32_t") int value) { nmbCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@code pRefFinalList0Entries} field. */
    public VkVideoEncodeH264NaluSliceEXT pRefFinalList0Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npRefFinalList0Entries(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@code pRefFinalList1Entries} field. */
    public VkVideoEncodeH264NaluSliceEXT pRefFinalList1Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { npRefFinalList1Entries(address(), value); return this; }
    /** Sets the specified value to the {@code precedingNaluBytes} field. */
    public VkVideoEncodeH264NaluSliceEXT precedingNaluBytes(@NativeType("uint32_t") int value) { nprecedingNaluBytes(address(), value); return this; }
    /** Sets the specified value to the {@code minQp} field. */
    public VkVideoEncodeH264NaluSliceEXT minQp(@NativeType("uint8_t") byte value) { nminQp(address(), value); return this; }
    /** Sets the specified value to the {@code maxQp} field. */
    public VkVideoEncodeH264NaluSliceEXT maxQp(@NativeType("uint8_t") byte value) { nmaxQp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264NaluSliceEXT set(
        int sType,
        long pNext,
        StdVideoEncodeH264SliceHeader pSliceHeaderStd,
        int mbCount,
        VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList0Entries,
        VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList1Entries,
        int precedingNaluBytes,
        byte minQp,
        byte maxQp
    ) {
        sType(sType);
        pNext(pNext);
        pSliceHeaderStd(pSliceHeaderStd);
        mbCount(mbCount);
        pRefFinalList0Entries(pRefFinalList0Entries);
        pRefFinalList1Entries(pRefFinalList1Entries);
        precedingNaluBytes(precedingNaluBytes);
        minQp(minQp);
        maxQp(maxQp);

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

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkVideoEncodeH264NaluSliceEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkVideoEncodeH264NaluSliceEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceEXT mallocStack(MemoryStack stack) {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceEXT callocStack(MemoryStack stack) {
        return wrap(VkVideoEncodeH264NaluSliceEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer callocStack(int capacity, MemoryStack stack) {
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
    /** Unsafe version of {@link #precedingNaluBytes}. */
    public static int nprecedingNaluBytes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264NaluSliceEXT.PRECEDINGNALUBYTES); }
    /** Unsafe version of {@link #minQp}. */
    public static byte nminQp(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264NaluSliceEXT.MINQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static byte nmaxQp(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264NaluSliceEXT.MAXQP); }

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
    /** Unsafe version of {@link #precedingNaluBytes(int) precedingNaluBytes}. */
    public static void nprecedingNaluBytes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceEXT.PRECEDINGNALUBYTES, value); }
    /** Unsafe version of {@link #minQp(byte) minQp}. */
    public static void nminQp(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264NaluSliceEXT.MINQP, value); }
    /** Unsafe version of {@link #maxQp(byte) maxQp}. */
    public static void nmaxQp(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264NaluSliceEXT.MAXQP, value); }

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
        VkVideoEncodeH264DpbSlotInfoEXT.validate(pRefFinalList0Entries, refFinalList0EntryCount);
        byte refFinalList1EntryCount = nrefFinalList1EntryCount(struct);
        long pRefFinalList1Entries = memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFFINALLIST1ENTRIES);
        check(pRefFinalList1Entries);
        VkVideoEncodeH264DpbSlotInfoEXT.validate(pRefFinalList1Entries, refFinalList1EntryCount);
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

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264NaluSliceEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264NaluSliceEXT.npNext(address()); }
        /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@code pSliceHeaderStd} field. */
        @NativeType("StdVideoEncodeH264SliceHeader const *")
        public StdVideoEncodeH264SliceHeader pSliceHeaderStd() { return VkVideoEncodeH264NaluSliceEXT.npSliceHeaderStd(address()); }
        /** @return the value of the {@code mbCount} field. */
        @NativeType("uint32_t")
        public int mbCount() { return VkVideoEncodeH264NaluSliceEXT.nmbCount(address()); }
        /** @return the value of the {@code refFinalList0EntryCount} field. */
        @NativeType("uint8_t")
        public byte refFinalList0EntryCount() { return VkVideoEncodeH264NaluSliceEXT.nrefFinalList0EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@code pRefFinalList0Entries} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList0Entries() { return VkVideoEncodeH264NaluSliceEXT.npRefFinalList0Entries(address()); }
        /** @return the value of the {@code refFinalList1EntryCount} field. */
        @NativeType("uint8_t")
        public byte refFinalList1EntryCount() { return VkVideoEncodeH264NaluSliceEXT.nrefFinalList1EntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} view of the struct array pointed to by the {@code pRefFinalList1Entries} field. */
        @NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *")
        public VkVideoEncodeH264DpbSlotInfoEXT.Buffer pRefFinalList1Entries() { return VkVideoEncodeH264NaluSliceEXT.npRefFinalList1Entries(address()); }
        /** @return the value of the {@code precedingNaluBytes} field. */
        @NativeType("uint32_t")
        public int precedingNaluBytes() { return VkVideoEncodeH264NaluSliceEXT.nprecedingNaluBytes(address()); }
        /** @return the value of the {@code minQp} field. */
        @NativeType("uint8_t")
        public byte minQp() { return VkVideoEncodeH264NaluSliceEXT.nminQp(address()); }
        /** @return the value of the {@code maxQp} field. */
        @NativeType("uint8_t")
        public byte maxQp() { return VkVideoEncodeH264NaluSliceEXT.nmaxQp(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264NaluSliceEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@code pSliceHeaderStd} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pSliceHeaderStd(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { VkVideoEncodeH264NaluSliceEXT.npSliceHeaderStd(address(), value); return this; }
        /** Sets the specified value to the {@code mbCount} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer mbCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264NaluSliceEXT.nmbCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@code pRefFinalList0Entries} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pRefFinalList0Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264NaluSliceEXT.npRefFinalList0Entries(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264DpbSlotInfoEXT.Buffer} to the {@code pRefFinalList1Entries} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pRefFinalList1Entries(@NativeType("VkVideoEncodeH264DpbSlotInfoEXT const *") VkVideoEncodeH264DpbSlotInfoEXT.Buffer value) { VkVideoEncodeH264NaluSliceEXT.npRefFinalList1Entries(address(), value); return this; }
        /** Sets the specified value to the {@code precedingNaluBytes} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer precedingNaluBytes(@NativeType("uint32_t") int value) { VkVideoEncodeH264NaluSliceEXT.nprecedingNaluBytes(address(), value); return this; }
        /** Sets the specified value to the {@code minQp} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer minQp(@NativeType("uint8_t") byte value) { VkVideoEncodeH264NaluSliceEXT.nminQp(address(), value); return this; }
        /** Sets the specified value to the {@code maxQp} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer maxQp(@NativeType("uint8_t") byte value) { VkVideoEncodeH264NaluSliceEXT.nmaxQp(address(), value); return this; }

    }

}