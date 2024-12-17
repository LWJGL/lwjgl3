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
 * struct VkVideoDecodeH264PictureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoDecodeH264PictureInfo StdVideoDecodeH264PictureInfo} const * pStdPictureInfo;
 *     uint32_t sliceCount;
 *     uint32_t const * pSliceOffsets;
 * }}</pre>
 */
public class VkVideoDecodeH264PictureInfoKHR extends Struct<VkVideoDecodeH264PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDPICTUREINFO,
        SLICECOUNT,
        PSLICEOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        SLICECOUNT = layout.offsetof(3);
        PSLICEOFFSETS = layout.offsetof(4);
    }

    protected VkVideoDecodeH264PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264PictureInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoDecodeH264PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoDecodeH264PictureInfo const *")
    public StdVideoDecodeH264PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** @return the value of the {@code sliceCount} field. */
    @NativeType("uint32_t")
    public int sliceCount() { return nsliceCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pSliceOffsets} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pSliceOffsets() { return npSliceOffsets(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeH264PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoDecodeH264PictureInfoKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeH264PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH264PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeH264PictureInfo const *") StdVideoDecodeH264PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pSliceOffsets} field. */
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsets(@NativeType("uint32_t const *") IntBuffer value) { npSliceOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264PictureInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeH264PictureInfo pStdPictureInfo,
        IntBuffer pSliceOffsets
    ) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        pSliceOffsets(pSliceOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264PictureInfoKHR set(VkVideoDecodeH264PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264PictureInfoKHR malloc() {
        return new VkVideoDecodeH264PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264PictureInfoKHR calloc() {
        return new VkVideoDecodeH264PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264PictureInfoKHR create(long address) {
        return new VkVideoDecodeH264PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeH264PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeH264PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeH264PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeH264PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeH264PictureInfo.create(memGetAddress(struct + VkVideoDecodeH264PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #sliceCount}. */
    public static int nsliceCount(long struct) { return memGetInt(struct + VkVideoDecodeH264PictureInfoKHR.SLICECOUNT); }
    /** Unsafe version of {@link #pSliceOffsets() pSliceOffsets}. */
    public static IntBuffer npSliceOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeH264PictureInfoKHR.PSLICEOFFSETS), nsliceCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeH264PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeH264PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeH264PictureInfo value) { memPutAddress(struct + VkVideoDecodeH264PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Sets the specified value to the {@code sliceCount} field of the specified {@code struct}. */
    public static void nsliceCount(long struct, int value) { memPutInt(struct + VkVideoDecodeH264PictureInfoKHR.SLICECOUNT, value); }
    /** Unsafe version of {@link #pSliceOffsets(IntBuffer) pSliceOffsets}. */
    public static void npSliceOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeH264PictureInfoKHR.PSLICEOFFSETS, memAddress(value)); nsliceCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH264PictureInfoKHR.PSTDPICTUREINFO));
        check(memGetAddress(struct + VkVideoDecodeH264PictureInfoKHR.PSLICEOFFSETS));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264PictureInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeH264PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeH264PictureInfo const *")
        public StdVideoDecodeH264PictureInfo pStdPictureInfo() { return VkVideoDecodeH264PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return the value of the {@code sliceCount} field. */
        @NativeType("uint32_t")
        public int sliceCount() { return VkVideoDecodeH264PictureInfoKHR.nsliceCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pSliceOffsets} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pSliceOffsets() { return VkVideoDecodeH264PictureInfoKHR.npSliceOffsets(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeH264PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoDecodeH264PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeH264PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH264PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoDecodeH264PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeH264PictureInfo const *") StdVideoDecodeH264PictureInfo value) { VkVideoDecodeH264PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pSliceOffsets} field. */
        public VkVideoDecodeH264PictureInfoKHR.Buffer pSliceOffsets(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeH264PictureInfoKHR.npSliceOffsets(address(), value); return this; }

    }

}