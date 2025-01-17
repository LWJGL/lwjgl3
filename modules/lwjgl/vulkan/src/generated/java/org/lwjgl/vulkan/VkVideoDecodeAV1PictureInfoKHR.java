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

import static org.lwjgl.vulkan.KHRVideoEncodeAV1.*;

/**
 * <pre>{@code
 * struct VkVideoDecodeAV1PictureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoDecodeAV1PictureInfo StdVideoDecodeAV1PictureInfo} const * pStdPictureInfo;
 *     int32_t referenceNameSlotIndices[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR];
 *     uint32_t frameHeaderOffset;
 *     uint32_t tileCount;
 *     uint32_t const * pTileOffsets;
 *     uint32_t const * pTileSizes;
 * }}</pre>
 */
public class VkVideoDecodeAV1PictureInfoKHR extends Struct<VkVideoDecodeAV1PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDPICTUREINFO,
        REFERENCENAMESLOTINDICES,
        FRAMEHEADEROFFSET,
        TILECOUNT,
        PTILEOFFSETS,
        PTILESIZES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        REFERENCENAMESLOTINDICES = layout.offsetof(3);
        FRAMEHEADEROFFSET = layout.offsetof(4);
        TILECOUNT = layout.offsetof(5);
        PTILEOFFSETS = layout.offsetof(6);
        PTILESIZES = layout.offsetof(7);
    }

    protected VkVideoDecodeAV1PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeAV1PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeAV1PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeAV1PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeAV1PictureInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoDecodeAV1PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoDecodeAV1PictureInfo const *")
    public StdVideoDecodeAV1PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** @return a {@link IntBuffer} view of the {@code referenceNameSlotIndices} field. */
    @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() { return nreferenceNameSlotIndices(address()); }
    /** @return the value at the specified index of the {@code referenceNameSlotIndices} field. */
    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) { return nreferenceNameSlotIndices(address(), index); }
    /** @return the value of the {@code frameHeaderOffset} field. */
    @NativeType("uint32_t")
    public int frameHeaderOffset() { return nframeHeaderOffset(address()); }
    /** @return the value of the {@code tileCount} field. */
    @NativeType("uint32_t")
    public int tileCount() { return ntileCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pTileOffsets} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pTileOffsets() { return npTileOffsets(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pTileSizes} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pTileSizes() { return npTileSizes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeAV1PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoDecodeAV1PictureInfoKHR sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeAV1PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeAV1PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeAV1PictureInfo const *") StdVideoDecodeAV1PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code referenceNameSlotIndices} field. */
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { nreferenceNameSlotIndices(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code referenceNameSlotIndices} field. */
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { nreferenceNameSlotIndices(address(), index, value); return this; }
    /** Sets the specified value to the {@code frameHeaderOffset} field. */
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(@NativeType("uint32_t") int value) { nframeHeaderOffset(address(), value); return this; }
    /** Sets the specified value to the {@code tileCount} field. */
    public VkVideoDecodeAV1PictureInfoKHR tileCount(@NativeType("uint32_t") int value) { ntileCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pTileOffsets} field. */
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(@NativeType("uint32_t const *") IntBuffer value) { npTileOffsets(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pTileSizes} field. */
    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(@NativeType("uint32_t const *") IntBuffer value) { npTileSizes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeAV1PictureInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeAV1PictureInfo pStdPictureInfo,
        IntBuffer referenceNameSlotIndices,
        int frameHeaderOffset,
        int tileCount,
        IntBuffer pTileOffsets,
        IntBuffer pTileSizes
    ) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        frameHeaderOffset(frameHeaderOffset);
        tileCount(tileCount);
        pTileOffsets(pTileOffsets);
        pTileSizes(pTileSizes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeAV1PictureInfoKHR set(VkVideoDecodeAV1PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1PictureInfoKHR malloc() {
        return new VkVideoDecodeAV1PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1PictureInfoKHR calloc() {
        return new VkVideoDecodeAV1PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeAV1PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeAV1PictureInfoKHR create(long address) {
        return new VkVideoDecodeAV1PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeAV1PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeAV1PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeAV1PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeAV1PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeAV1PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeAV1PictureInfo.create(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #referenceNameSlotIndices}. */
    public static IntBuffer nreferenceNameSlotIndices(long struct) { return memIntBuffer(struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
    /** Unsafe version of {@link #referenceNameSlotIndices(int) referenceNameSlotIndices}. */
    public static int nreferenceNameSlotIndices(long struct, int index) {
        return memGetInt(struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4);
    }
    /** Unsafe version of {@link #frameHeaderOffset}. */
    public static int nframeHeaderOffset(long struct) { return memGetInt(struct + VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET); }
    /** Unsafe version of {@link #tileCount}. */
    public static int ntileCount(long struct) { return memGetInt(struct + VkVideoDecodeAV1PictureInfoKHR.TILECOUNT); }
    /** Unsafe version of {@link #pTileOffsets() pTileOffsets}. */
    public static IntBuffer npTileOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS), ntileCount(struct)); }
    /** Unsafe version of {@link #pTileSizes() pTileSizes}. */
    public static IntBuffer npTileSizes(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILESIZES), ntileCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeAV1PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeAV1PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeAV1PictureInfo value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #referenceNameSlotIndices(IntBuffer) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
        memCopy(memAddress(value), struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #referenceNameSlotIndices(int, int) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        memPutInt(struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4, value);
    }
    /** Unsafe version of {@link #frameHeaderOffset(int) frameHeaderOffset}. */
    public static void nframeHeaderOffset(long struct, int value) { memPutInt(struct + VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET, value); }
    /** Sets the specified value to the {@code tileCount} field of the specified {@code struct}. */
    public static void ntileCount(long struct, int value) { memPutInt(struct + VkVideoDecodeAV1PictureInfoKHR.TILECOUNT, value); }
    /** Unsafe version of {@link #pTileOffsets(IntBuffer) pTileOffsets}. */
    public static void npTileOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS, memAddress(value)); }
    /** Unsafe version of {@link #pTileSizes(IntBuffer) pTileSizes}. */
    public static void npTileSizes(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILESIZES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdPictureInfo = memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoDecodeAV1PictureInfo.validate(pStdPictureInfo);
        check(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS));
        check(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILESIZES));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeAV1PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeAV1PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeAV1PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeAV1PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeAV1PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeAV1PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeAV1PictureInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeAV1PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeAV1PictureInfo const *")
        public StdVideoDecodeAV1PictureInfo pStdPictureInfo() { return VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return a {@link IntBuffer} view of the {@code referenceNameSlotIndices} field. */
        @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() { return VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address()); }
        /** @return the value at the specified index of the {@code referenceNameSlotIndices} field. */
        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) { return VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index); }
        /** @return the value of the {@code frameHeaderOffset} field. */
        @NativeType("uint32_t")
        public int frameHeaderOffset() { return VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(address()); }
        /** @return the value of the {@code tileCount} field. */
        @NativeType("uint32_t")
        public int tileCount() { return VkVideoDecodeAV1PictureInfoKHR.ntileCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pTileOffsets} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pTileOffsets() { return VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pTileSizes} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pTileSizes() { return VkVideoDecodeAV1PictureInfoKHR.npTileSizes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeAV1PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeAV1PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeAV1PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeAV1PictureInfo const *") StdVideoDecodeAV1PictureInfo value) { VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code referenceNameSlotIndices} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code referenceNameSlotIndices} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value); return this; }
        /** Sets the specified value to the {@code frameHeaderOffset} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer frameHeaderOffset(@NativeType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(address(), value); return this; }
        /** Sets the specified value to the {@code tileCount} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer tileCount(@NativeType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.ntileCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pTileOffsets} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pTileOffsets(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pTileSizes} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pTileSizes(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeAV1PictureInfoKHR.npTileSizes(address(), value); return this; }

    }

}