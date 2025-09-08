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

import static org.lwjgl.vulkan.KHRVideoDecodeVP9.*;

/**
 * <pre><code>
 * struct VkVideoDecodeVP9PictureInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoDecodeVP9PictureInfo StdVideoDecodeVP9PictureInfo} const * pStdPictureInfo;
 *     int32_t referenceNameSlotIndices[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR];
 *     uint32_t uncompressedHeaderOffset;
 *     uint32_t compressedHeaderOffset;
 *     uint32_t tilesOffset;
 * }</code></pre>
 */
public class VkVideoDecodeVP9PictureInfoKHR extends Struct<VkVideoDecodeVP9PictureInfoKHR> implements NativeResource {

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
        UNCOMPRESSEDHEADEROFFSET,
        COMPRESSEDHEADEROFFSET,
        TILESOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        REFERENCENAMESLOTINDICES = layout.offsetof(3);
        UNCOMPRESSEDHEADEROFFSET = layout.offsetof(4);
        COMPRESSEDHEADEROFFSET = layout.offsetof(5);
        TILESOFFSET = layout.offsetof(6);
    }

    protected VkVideoDecodeVP9PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeVP9PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeVP9PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeVP9PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeVP9PictureInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoDecodeVP9PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
    @NativeType("StdVideoDecodeVP9PictureInfo const *")
    public StdVideoDecodeVP9PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** @return a {@link IntBuffer} view of the {@code referenceNameSlotIndices} field. */
    @NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() { return nreferenceNameSlotIndices(address()); }
    /** @return the value at the specified index of the {@code referenceNameSlotIndices} field. */
    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) { return nreferenceNameSlotIndices(address(), index); }
    /** @return the value of the {@code uncompressedHeaderOffset} field. */
    @NativeType("uint32_t")
    public int uncompressedHeaderOffset() { return nuncompressedHeaderOffset(address()); }
    /** @return the value of the {@code compressedHeaderOffset} field. */
    @NativeType("uint32_t")
    public int compressedHeaderOffset() { return ncompressedHeaderOffset(address()); }
    /** @return the value of the {@code tilesOffset} field. */
    @NativeType("uint32_t")
    public int tilesOffset() { return ntilesOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeVP9PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeVP9#VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoDecodeVP9PictureInfoKHR sType$Default() { return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeVP9PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeVP9PictureInfo} to the {@code pStdPictureInfo} field. */
    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeVP9PictureInfo const *") StdVideoDecodeVP9PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code referenceNameSlotIndices} field. */
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { nreferenceNameSlotIndices(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code referenceNameSlotIndices} field. */
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { nreferenceNameSlotIndices(address(), index, value); return this; }
    /** Sets the specified value to the {@code uncompressedHeaderOffset} field. */
    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffset(@NativeType("uint32_t") int value) { nuncompressedHeaderOffset(address(), value); return this; }
    /** Sets the specified value to the {@code compressedHeaderOffset} field. */
    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffset(@NativeType("uint32_t") int value) { ncompressedHeaderOffset(address(), value); return this; }
    /** Sets the specified value to the {@code tilesOffset} field. */
    public VkVideoDecodeVP9PictureInfoKHR tilesOffset(@NativeType("uint32_t") int value) { ntilesOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeVP9PictureInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeVP9PictureInfo pStdPictureInfo,
        IntBuffer referenceNameSlotIndices,
        int uncompressedHeaderOffset,
        int compressedHeaderOffset,
        int tilesOffset
    ) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        uncompressedHeaderOffset(uncompressedHeaderOffset);
        compressedHeaderOffset(compressedHeaderOffset);
        tilesOffset(tilesOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeVP9PictureInfoKHR set(VkVideoDecodeVP9PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeVP9PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeVP9PictureInfoKHR malloc() {
        return new VkVideoDecodeVP9PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeVP9PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeVP9PictureInfoKHR calloc() {
        return new VkVideoDecodeVP9PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeVP9PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeVP9PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeVP9PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeVP9PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeVP9PictureInfoKHR create(long address) {
        return new VkVideoDecodeVP9PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeVP9PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeVP9PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeVP9PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeVP9PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeVP9PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeVP9PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeVP9PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeVP9PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeVP9PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeVP9PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeVP9PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeVP9PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeVP9PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeVP9PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeVP9PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeVP9PictureInfo.create(memGetAddress(struct + VkVideoDecodeVP9PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #referenceNameSlotIndices}. */
    public static IntBuffer nreferenceNameSlotIndices(long struct) { return memIntBuffer(struct + VkVideoDecodeVP9PictureInfoKHR.REFERENCENAMESLOTINDICES, VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR); }
    /** Unsafe version of {@link #referenceNameSlotIndices(int) referenceNameSlotIndices}. */
    public static int nreferenceNameSlotIndices(long struct, int index) {
        return memGetInt(struct + VkVideoDecodeVP9PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR) * 4);
    }
    /** Unsafe version of {@link #uncompressedHeaderOffset}. */
    public static int nuncompressedHeaderOffset(long struct) { return memGetInt(struct + VkVideoDecodeVP9PictureInfoKHR.UNCOMPRESSEDHEADEROFFSET); }
    /** Unsafe version of {@link #compressedHeaderOffset}. */
    public static int ncompressedHeaderOffset(long struct) { return memGetInt(struct + VkVideoDecodeVP9PictureInfoKHR.COMPRESSEDHEADEROFFSET); }
    /** Unsafe version of {@link #tilesOffset}. */
    public static int ntilesOffset(long struct) { return memGetInt(struct + VkVideoDecodeVP9PictureInfoKHR.TILESOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeVP9PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeVP9PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeVP9PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeVP9PictureInfo value) { memPutAddress(struct + VkVideoDecodeVP9PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #referenceNameSlotIndices(IntBuffer) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR); }
        memCopy(memAddress(value), struct + VkVideoDecodeVP9PictureInfoKHR.REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #referenceNameSlotIndices(int, int) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        memPutInt(struct + VkVideoDecodeVP9PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR) * 4, value);
    }
    /** Unsafe version of {@link #uncompressedHeaderOffset(int) uncompressedHeaderOffset}. */
    public static void nuncompressedHeaderOffset(long struct, int value) { memPutInt(struct + VkVideoDecodeVP9PictureInfoKHR.UNCOMPRESSEDHEADEROFFSET, value); }
    /** Unsafe version of {@link #compressedHeaderOffset(int) compressedHeaderOffset}. */
    public static void ncompressedHeaderOffset(long struct, int value) { memPutInt(struct + VkVideoDecodeVP9PictureInfoKHR.COMPRESSEDHEADEROFFSET, value); }
    /** Unsafe version of {@link #tilesOffset(int) tilesOffset}. */
    public static void ntilesOffset(long struct, int value) { memPutInt(struct + VkVideoDecodeVP9PictureInfoKHR.TILESOFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdPictureInfo = memGetAddress(struct + VkVideoDecodeVP9PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoDecodeVP9PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeVP9PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeVP9PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeVP9PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeVP9PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeVP9PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeVP9PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeVP9PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeVP9PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeVP9PictureInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeVP9PictureInfo} view of the struct pointed to by the {@code pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeVP9PictureInfo const *")
        public StdVideoDecodeVP9PictureInfo pStdPictureInfo() { return VkVideoDecodeVP9PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return a {@link IntBuffer} view of the {@code referenceNameSlotIndices} field. */
        @NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() { return VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address()); }
        /** @return the value at the specified index of the {@code referenceNameSlotIndices} field. */
        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) { return VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address(), index); }
        /** @return the value of the {@code uncompressedHeaderOffset} field. */
        @NativeType("uint32_t")
        public int uncompressedHeaderOffset() { return VkVideoDecodeVP9PictureInfoKHR.nuncompressedHeaderOffset(address()); }
        /** @return the value of the {@code compressedHeaderOffset} field. */
        @NativeType("uint32_t")
        public int compressedHeaderOffset() { return VkVideoDecodeVP9PictureInfoKHR.ncompressedHeaderOffset(address()); }
        /** @return the value of the {@code tilesOffset} field. */
        @NativeType("uint32_t")
        public int tilesOffset() { return VkVideoDecodeVP9PictureInfoKHR.ntilesOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeVP9PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeVP9#VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeVP9PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeVP9PictureInfo} to the {@code pStdPictureInfo} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeVP9PictureInfo const *") StdVideoDecodeVP9PictureInfo value) { VkVideoDecodeVP9PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code referenceNameSlotIndices} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code referenceNameSlotIndices} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { VkVideoDecodeVP9PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value); return this; }
        /** Sets the specified value to the {@code uncompressedHeaderOffset} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer uncompressedHeaderOffset(@NativeType("uint32_t") int value) { VkVideoDecodeVP9PictureInfoKHR.nuncompressedHeaderOffset(address(), value); return this; }
        /** Sets the specified value to the {@code compressedHeaderOffset} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer compressedHeaderOffset(@NativeType("uint32_t") int value) { VkVideoDecodeVP9PictureInfoKHR.ncompressedHeaderOffset(address(), value); return this; }
        /** Sets the specified value to the {@code tilesOffset} field. */
        public VkVideoDecodeVP9PictureInfoKHR.Buffer tilesOffset(@NativeType("uint32_t") int value) { VkVideoDecodeVP9PictureInfoKHR.ntilesOffset(address(), value); return this; }

    }

}