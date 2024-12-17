/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeH265PictureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t naluSliceSegmentEntryCount;
 *     {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR VkVideoEncodeH265NaluSliceSegmentInfoKHR} const * pNaluSliceSegmentEntries;
 *     {@link StdVideoEncodeH265PictureInfo StdVideoEncodeH265PictureInfo} const * pStdPictureInfo;
 * }}</pre>
 */
public class VkVideoEncodeH265PictureInfoKHR extends Struct<VkVideoEncodeH265PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NALUSLICESEGMENTENTRYCOUNT,
        PNALUSLICESEGMENTENTRIES,
        PSTDPICTUREINFO;

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
        NALUSLICESEGMENTENTRYCOUNT = layout.offsetof(2);
        PNALUSLICESEGMENTENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
    }

    protected VkVideoEncodeH265PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265PictureInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code naluSliceSegmentEntryCount} field. */
    @NativeType("uint32_t")
    public int naluSliceSegmentEntryCount() { return nnaluSliceSegmentEntryCount(address()); }
    /** @return a {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} view of the struct array pointed to by the {@code pNaluSliceSegmentEntries} field. */
    @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *")
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries() { return npNaluSliceSegmentEntries(address()); }
    /** @return a {@link StdVideoEncodeH265PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoEncodeH265PictureInfo const *")
    public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265PictureInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} to the {@code pNaluSliceSegmentEntries} field. */
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *") VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) { npNaluSliceSegmentEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { npStdPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265PictureInfoKHR set(
        int sType,
        long pNext,
        VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries,
        StdVideoEncodeH265PictureInfo pStdPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        pNaluSliceSegmentEntries(pNaluSliceSegmentEntries);
        pStdPictureInfo(pStdPictureInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265PictureInfoKHR set(VkVideoEncodeH265PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265PictureInfoKHR malloc() {
        return new VkVideoEncodeH265PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265PictureInfoKHR calloc() {
        return new VkVideoEncodeH265PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265PictureInfoKHR create(long address) {
        return new VkVideoEncodeH265PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #naluSliceSegmentEntryCount}. */
    public static int nnaluSliceSegmentEntryCount(long struct) { return memGetInt(struct + VkVideoEncodeH265PictureInfoKHR.NALUSLICESEGMENTENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer npNaluSliceSegmentEntries(long struct) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.create(memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNALUSLICESEGMENTENTRIES), nnaluSliceSegmentEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH265PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH265PictureInfo.create(memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PSTDPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code naluSliceSegmentEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceSegmentEntryCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265PictureInfoKHR.NALUSLICESEGMENTENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries(VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer) pNaluSliceSegmentEntries}. */
    public static void npNaluSliceSegmentEntries(long struct, VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNALUSLICESEGMENTENTRIES, value.address()); nnaluSliceSegmentEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH265PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH265PictureInfo value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoKHR.PSTDPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int naluSliceSegmentEntryCount = nnaluSliceSegmentEntryCount(struct);
        long pNaluSliceSegmentEntries = memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNALUSLICESEGMENTENTRIES);
        check(pNaluSliceSegmentEntries);
        validate(pNaluSliceSegmentEntries, naluSliceSegmentEntryCount, VkVideoEncodeH265NaluSliceSegmentInfoKHR.SIZEOF, VkVideoEncodeH265NaluSliceSegmentInfoKHR::validate);
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeH265PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkVideoEncodeH265PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265PictureInfoKHR.npNext(address()); }
        /** @return the value of the {@code naluSliceSegmentEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceSegmentEntryCount() { return VkVideoEncodeH265PictureInfoKHR.nnaluSliceSegmentEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} view of the struct array pointed to by the {@code pNaluSliceSegmentEntries} field. */
        @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *")
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries() { return VkVideoEncodeH265PictureInfoKHR.npNaluSliceSegmentEntries(address()); }
        /** @return a {@link StdVideoEncodeH265PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH265PictureInfo const *")
        public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return VkVideoEncodeH265PictureInfoKHR.npStdPictureInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} to the {@code pNaluSliceSegmentEntries} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *") VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) { VkVideoEncodeH265PictureInfoKHR.npNaluSliceSegmentEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { VkVideoEncodeH265PictureInfoKHR.npStdPictureInfo(address(), value); return this; }

    }

}