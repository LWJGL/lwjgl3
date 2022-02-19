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
 * <li>If {@code pReferenceFinalLists} is not {@code NULL}, {@code pReferenceFinalLists} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH264ReferenceListsEXT} structure</li>
 * <li>{@code pSliceHeaderStd} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264SliceHeader} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264ReferenceListsEXT}, {@link VkVideoEncodeH264VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264NaluSliceEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #mbCount};
 *     {@link VkVideoEncodeH264ReferenceListsEXT VkVideoEncodeH264ReferenceListsEXT} const * {@link #pReferenceFinalLists};
 *     {@link StdVideoEncodeH264SliceHeader StdVideoEncodeH264SliceHeader} const * {@link #pSliceHeaderStd};
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
        MBCOUNT,
        PREFERENCEFINALLISTS,
        PSLICEHEADERSTD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MBCOUNT = layout.offsetof(2);
        PREFERENCEFINALLISTS = layout.offsetof(3);
        PSLICEHEADERSTD = layout.offsetof(4);
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
    /** the number of macroblocks in this slice. */
    @NativeType("uint32_t")
    public int mbCount() { return nmbCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH264ReferenceListsEXT} structure specifying the reference lists to be used for the current slice. If {@code pReferenceFinalLists} is not {@code NULL}, these reference lists override the reference lists provided in {@link VkVideoEncodeH264VclFrameInfoEXT}{@code ::pReferenceFinalLists}. */
    @Nullable
    @NativeType("VkVideoEncodeH264ReferenceListsEXT const *")
    public VkVideoEncodeH264ReferenceListsEXT pReferenceFinalLists() { return npReferenceFinalLists(address()); }
    /** a pointer to a {@code StdVideoEncodeH264SliceHeader} structure specifying the slice header for the current slice. */
    @NativeType("StdVideoEncodeH264SliceHeader const *")
    public StdVideoEncodeH264SliceHeader pSliceHeaderStd() { return npSliceHeaderStd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264NaluSliceEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264NaluSliceEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264NaluSliceEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mbCount} field. */
    public VkVideoEncodeH264NaluSliceEXT mbCount(@NativeType("uint32_t") int value) { nmbCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264ReferenceListsEXT} to the {@link #pReferenceFinalLists} field. */
    public VkVideoEncodeH264NaluSliceEXT pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH264ReferenceListsEXT const *") VkVideoEncodeH264ReferenceListsEXT value) { npReferenceFinalLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@link #pSliceHeaderStd} field. */
    public VkVideoEncodeH264NaluSliceEXT pSliceHeaderStd(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { npSliceHeaderStd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264NaluSliceEXT set(
        int sType,
        long pNext,
        int mbCount,
        @Nullable VkVideoEncodeH264ReferenceListsEXT pReferenceFinalLists,
        StdVideoEncodeH264SliceHeader pSliceHeaderStd
    ) {
        sType(sType);
        pNext(pNext);
        mbCount(mbCount);
        pReferenceFinalLists(pReferenceFinalLists);
        pSliceHeaderStd(pSliceHeaderStd);

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
    /** Unsafe version of {@link #mbCount}. */
    public static int nmbCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264NaluSliceEXT.MBCOUNT); }
    /** Unsafe version of {@link #pReferenceFinalLists}. */
    @Nullable public static VkVideoEncodeH264ReferenceListsEXT npReferenceFinalLists(long struct) { return VkVideoEncodeH264ReferenceListsEXT.createSafe(memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFERENCEFINALLISTS)); }
    /** Unsafe version of {@link #pSliceHeaderStd}. */
    public static StdVideoEncodeH264SliceHeader npSliceHeaderStd(long struct) { return StdVideoEncodeH264SliceHeader.create(memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PSLICEHEADERSTD)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PNEXT, value); }
    /** Unsafe version of {@link #mbCount(int) mbCount}. */
    public static void nmbCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceEXT.MBCOUNT, value); }
    /** Unsafe version of {@link #pReferenceFinalLists(VkVideoEncodeH264ReferenceListsEXT) pReferenceFinalLists}. */
    public static void npReferenceFinalLists(long struct, @Nullable VkVideoEncodeH264ReferenceListsEXT value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFERENCEFINALLISTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pSliceHeaderStd(StdVideoEncodeH264SliceHeader) pSliceHeaderStd}. */
    public static void npSliceHeaderStd(long struct, StdVideoEncodeH264SliceHeader value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceEXT.PSLICEHEADERSTD, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pReferenceFinalLists = memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PREFERENCEFINALLISTS);
        if (pReferenceFinalLists != NULL) {
            VkVideoEncodeH264ReferenceListsEXT.validate(pReferenceFinalLists);
        }
        check(memGetAddress(struct + VkVideoEncodeH264NaluSliceEXT.PSLICEHEADERSTD));
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
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceEXT#mbCount} field. */
        @NativeType("uint32_t")
        public int mbCount() { return VkVideoEncodeH264NaluSliceEXT.nmbCount(address()); }
        /** @return a {@link VkVideoEncodeH264ReferenceListsEXT} view of the struct pointed to by the {@link VkVideoEncodeH264NaluSliceEXT#pReferenceFinalLists} field. */
        @Nullable
        @NativeType("VkVideoEncodeH264ReferenceListsEXT const *")
        public VkVideoEncodeH264ReferenceListsEXT pReferenceFinalLists() { return VkVideoEncodeH264NaluSliceEXT.npReferenceFinalLists(address()); }
        /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@link VkVideoEncodeH264NaluSliceEXT#pSliceHeaderStd} field. */
        @NativeType("StdVideoEncodeH264SliceHeader const *")
        public StdVideoEncodeH264SliceHeader pSliceHeaderStd() { return VkVideoEncodeH264NaluSliceEXT.npSliceHeaderStd(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceEXT#sType} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT} value to the {@link VkVideoEncodeH264NaluSliceEXT#sType} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceEXT#pNext} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264NaluSliceEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceEXT#mbCount} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer mbCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264NaluSliceEXT.nmbCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264ReferenceListsEXT} to the {@link VkVideoEncodeH264NaluSliceEXT#pReferenceFinalLists} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH264ReferenceListsEXT const *") VkVideoEncodeH264ReferenceListsEXT value) { VkVideoEncodeH264NaluSliceEXT.npReferenceFinalLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@link VkVideoEncodeH264NaluSliceEXT#pSliceHeaderStd} field. */
        public VkVideoEncodeH264NaluSliceEXT.Buffer pSliceHeaderStd(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { VkVideoEncodeH264NaluSliceEXT.npSliceHeaderStd(address(), value); return this; }

    }

}