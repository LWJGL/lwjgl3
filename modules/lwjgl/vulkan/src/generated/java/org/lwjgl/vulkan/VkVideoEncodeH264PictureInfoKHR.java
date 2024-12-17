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
 * struct VkVideoEncodeH264PictureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t naluSliceEntryCount;
 *     {@link VkVideoEncodeH264NaluSliceInfoKHR VkVideoEncodeH264NaluSliceInfoKHR} const * pNaluSliceEntries;
 *     {@link StdVideoEncodeH264PictureInfo StdVideoEncodeH264PictureInfo} const * pStdPictureInfo;
 *     VkBool32 generatePrefixNalu;
 * }}</pre>
 */
public class VkVideoEncodeH264PictureInfoKHR extends Struct<VkVideoEncodeH264PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NALUSLICEENTRYCOUNT,
        PNALUSLICEENTRIES,
        PSTDPICTUREINFO,
        GENERATEPREFIXNALU;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICEENTRYCOUNT = layout.offsetof(2);
        PNALUSLICEENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
        GENERATEPREFIXNALU = layout.offsetof(5);
    }

    protected VkVideoEncodeH264PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264PictureInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code naluSliceEntryCount} field. */
    @NativeType("uint32_t")
    public int naluSliceEntryCount() { return nnaluSliceEntryCount(address()); }
    /** @return a {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} view of the struct array pointed to by the {@code pNaluSliceEntries} field. */
    @NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *")
    public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries() { return npNaluSliceEntries(address()); }
    /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoEncodeH264PictureInfo const *")
    public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** @return the value of the {@code generatePrefixNalu} field. */
    @NativeType("VkBool32")
    public boolean generatePrefixNalu() { return ngeneratePrefixNalu(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264PictureInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} to the {@code pNaluSliceEntries} field. */
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *") VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) { npNaluSliceEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the specified value to the {@code generatePrefixNalu} field. */
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(@NativeType("VkBool32") boolean value) { ngeneratePrefixNalu(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264PictureInfoKHR set(
        int sType,
        long pNext,
        VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries,
        StdVideoEncodeH264PictureInfo pStdPictureInfo,
        boolean generatePrefixNalu
    ) {
        sType(sType);
        pNext(pNext);
        pNaluSliceEntries(pNaluSliceEntries);
        pStdPictureInfo(pStdPictureInfo);
        generatePrefixNalu(generatePrefixNalu);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264PictureInfoKHR set(VkVideoEncodeH264PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264PictureInfoKHR malloc() {
        return new VkVideoEncodeH264PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264PictureInfoKHR calloc() {
        return new VkVideoEncodeH264PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264PictureInfoKHR create(long address) {
        return new VkVideoEncodeH264PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #naluSliceEntryCount}. */
    public static int nnaluSliceEntryCount(long struct) { return memGetInt(struct + VkVideoEncodeH264PictureInfoKHR.NALUSLICEENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceEntries}. */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer npNaluSliceEntries(long struct) { return VkVideoEncodeH264NaluSliceInfoKHR.create(memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNALUSLICEENTRIES), nnaluSliceEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH264PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH264PictureInfo.create(memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #generatePrefixNalu}. */
    public static int ngeneratePrefixNalu(long struct) { return memGetInt(struct + VkVideoEncodeH264PictureInfoKHR.GENERATEPREFIXNALU); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code naluSliceEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceEntryCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264PictureInfoKHR.NALUSLICEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceEntries(VkVideoEncodeH264NaluSliceInfoKHR.Buffer) pNaluSliceEntries}. */
    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNALUSLICEENTRIES, value.address()); nnaluSliceEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH264PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #generatePrefixNalu(boolean) generatePrefixNalu}. */
    public static void ngeneratePrefixNalu(long struct, int value) { memPutInt(struct + VkVideoEncodeH264PictureInfoKHR.GENERATEPREFIXNALU, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNALUSLICEENTRIES);
        check(pNaluSliceEntries);
        validate(pNaluSliceEntries, naluSliceEntryCount, VkVideoEncodeH264NaluSliceInfoKHR.SIZEOF, VkVideoEncodeH264NaluSliceInfoKHR::validate);
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeH264PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264PictureInfoKHR.npNext(address()); }
        /** @return the value of the {@code naluSliceEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceEntryCount() { return VkVideoEncodeH264PictureInfoKHR.nnaluSliceEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} view of the struct array pointed to by the {@code pNaluSliceEntries} field. */
        @NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *")
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries() { return VkVideoEncodeH264PictureInfoKHR.npNaluSliceEntries(address()); }
        /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return VkVideoEncodeH264PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return the value of the {@code generatePrefixNalu} field. */
        @NativeType("VkBool32")
        public boolean generatePrefixNalu() { return VkVideoEncodeH264PictureInfoKHR.ngeneratePrefixNalu(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} to the {@code pNaluSliceEntries} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *") VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) { VkVideoEncodeH264PictureInfoKHR.npNaluSliceEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { VkVideoEncodeH264PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Sets the specified value to the {@code generatePrefixNalu} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer generatePrefixNalu(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264PictureInfoKHR.ngeneratePrefixNalu(address(), value ? 1 : 0); return this; }

    }

}