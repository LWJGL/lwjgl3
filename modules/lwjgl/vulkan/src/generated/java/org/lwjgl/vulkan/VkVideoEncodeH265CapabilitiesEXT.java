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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying H.265 encode capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeH265CapabilityFlagsEXT {@link #flags};
 *     VkVideoEncodeH265CtbSizeFlagsEXT {@link #ctbSizes};
 *     VkVideoEncodeH265TransformBlockSizeFlagsEXT {@link #transformBlockSizes};
 *     uint32_t {@link #maxPPictureL0ReferenceCount};
 *     uint32_t {@link #maxBPictureL0ReferenceCount};
 *     uint32_t {@link #maxL1ReferenceCount};
 *     uint32_t {@link #maxSubLayersCount};
 *     uint32_t {@link #minLog2MinLumaCodingBlockSizeMinus3};
 *     uint32_t {@link #maxLog2MinLumaCodingBlockSizeMinus3};
 *     uint32_t {@link #minLog2MinLumaTransformBlockSizeMinus2};
 *     uint32_t {@link #maxLog2MinLumaTransformBlockSizeMinus2};
 *     uint32_t {@link #minMaxTransformHierarchyDepthInter};
 *     uint32_t {@link #maxMaxTransformHierarchyDepthInter};
 *     uint32_t {@link #minMaxTransformHierarchyDepthIntra};
 *     uint32_t {@link #maxMaxTransformHierarchyDepthIntra};
 *     uint32_t {@link #maxDiffCuQpDeltaDepth};
 *     uint32_t {@link #minMaxNumMergeCand};
 *     uint32_t {@link #maxMaxNumMergeCand};
 * }</code></pre>
 */
public class VkVideoEncodeH265CapabilitiesEXT extends Struct<VkVideoEncodeH265CapabilitiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CTBSIZES,
        TRANSFORMBLOCKSIZES,
        MAXPPICTUREL0REFERENCECOUNT,
        MAXBPICTUREL0REFERENCECOUNT,
        MAXL1REFERENCECOUNT,
        MAXSUBLAYERSCOUNT,
        MINLOG2MINLUMACODINGBLOCKSIZEMINUS3,
        MAXLOG2MINLUMACODINGBLOCKSIZEMINUS3,
        MINLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2,
        MAXLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2,
        MINMAXTRANSFORMHIERARCHYDEPTHINTER,
        MAXMAXTRANSFORMHIERARCHYDEPTHINTER,
        MINMAXTRANSFORMHIERARCHYDEPTHINTRA,
        MAXMAXTRANSFORMHIERARCHYDEPTHINTRA,
        MAXDIFFCUQPDELTADEPTH,
        MINMAXNUMMERGECAND,
        MAXMAXNUMMERGECAND;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CTBSIZES = layout.offsetof(3);
        TRANSFORMBLOCKSIZES = layout.offsetof(4);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(5);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(6);
        MAXL1REFERENCECOUNT = layout.offsetof(7);
        MAXSUBLAYERSCOUNT = layout.offsetof(8);
        MINLOG2MINLUMACODINGBLOCKSIZEMINUS3 = layout.offsetof(9);
        MAXLOG2MINLUMACODINGBLOCKSIZEMINUS3 = layout.offsetof(10);
        MINLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2 = layout.offsetof(11);
        MAXLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2 = layout.offsetof(12);
        MINMAXTRANSFORMHIERARCHYDEPTHINTER = layout.offsetof(13);
        MAXMAXTRANSFORMHIERARCHYDEPTHINTER = layout.offsetof(14);
        MINMAXTRANSFORMHIERARCHYDEPTHINTRA = layout.offsetof(15);
        MAXMAXTRANSFORMHIERARCHYDEPTHINTRA = layout.offsetof(16);
        MAXDIFFCUQPDELTADEPTH = layout.offsetof(17);
        MINMAXNUMMERGECAND = layout.offsetof(18);
        MAXMAXNUMMERGECAND = layout.offsetof(19);
    }

    protected VkVideoEncodeH265CapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265CapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265CapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265CapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265CapabilitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CapabilityFlagBitsEXT} describing supported encoding tools. */
    @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CtbSizeFlagBitsEXT} describing the supported CTB sizes. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
    public int ctbSizes() { return nctbSizes(address()); }
    /** a bitmask of {@code VkVideoEncodeH265TransformBlockSizeFlagBitsEXT} describing the supported transform block sizes. */
    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
    public int transformBlockSizes() { return ntransformBlockSizes(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for P pictures. */
    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for B pictures. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of B pictures is supported. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint32_t")
    public int maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** reports the maximum number of sublayers. */
    @NativeType("uint32_t")
    public int maxSubLayersCount() { return nmaxSubLayersCount(address()); }
    /** reports the minimum value that may be set for log2_min_luma_coding_block_size_minus3 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int minLog2MinLumaCodingBlockSizeMinus3() { return nminLog2MinLumaCodingBlockSizeMinus3(address()); }
    /** reports the maximum value that may be set for log2_min_luma_coding_block_size_minus3 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int maxLog2MinLumaCodingBlockSizeMinus3() { return nmaxLog2MinLumaCodingBlockSizeMinus3(address()); }
    /** reports the minimum value that may be set for log2_min_luma_transform_block_size_minus2 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int minLog2MinLumaTransformBlockSizeMinus2() { return nminLog2MinLumaTransformBlockSizeMinus2(address()); }
    /** reports the maximum value that may be set for log2_min_luma_transform_block_size_minus2 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int maxLog2MinLumaTransformBlockSizeMinus2() { return nmaxLog2MinLumaTransformBlockSizeMinus2(address()); }
    /** reports the minimum value that may be set for max_transform_hierarchy_depth_inter in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int minMaxTransformHierarchyDepthInter() { return nminMaxTransformHierarchyDepthInter(address()); }
    /** reports the maximum value that may be set for max_transform_hierarchy_depth_inter in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int maxMaxTransformHierarchyDepthInter() { return nmaxMaxTransformHierarchyDepthInter(address()); }
    /** reports the minimum value that may be set for max_transform_hierarchy_depth_intra in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int minMaxTransformHierarchyDepthIntra() { return nminMaxTransformHierarchyDepthIntra(address()); }
    /** reports the maximum value that may be set for max_transform_hierarchy_depth_intra in StdVideoH265SequenceParameterSet. */
    @NativeType("uint32_t")
    public int maxMaxTransformHierarchyDepthIntra() { return nmaxMaxTransformHierarchyDepthIntra(address()); }
    /** reports the maximum value that may be set for diff_cu_qp_delta_depth in StdVideoH265PictureParameterSet. */
    @NativeType("uint32_t")
    public int maxDiffCuQpDeltaDepth() { return nmaxDiffCuQpDeltaDepth(address()); }
    /** reports the minimum value that may be set for MaxNumMergeCand in StdVideoEncodeH265SliceHeader. */
    @NativeType("uint32_t")
    public int minMaxNumMergeCand() { return nminMaxNumMergeCand(address()); }
    /** reports the maximum value that may be set for MaxNumMergeCand in StdVideoEncodeH265SliceHeader. */
    @NativeType("uint32_t")
    public int maxMaxNumMergeCand() { return nmaxMaxNumMergeCand(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265CapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265CapabilitiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265CapabilitiesEXT set(VkVideoEncodeH265CapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT malloc() {
        return new VkVideoEncodeH265CapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT calloc() {
        return new VkVideoEncodeH265CapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265CapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265CapabilitiesEXT create(long address) {
        return new VkVideoEncodeH265CapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265CapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #ctbSizes}. */
    public static int nctbSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.CTBSIZES); }
    /** Unsafe version of {@link #transformBlockSizes}. */
    public static int ntransformBlockSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.TRANSFORMBLOCKSIZES); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static int nmaxPPictureL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static int nmaxBPictureL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static int nmaxL1ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxSubLayersCount}. */
    public static int nmaxSubLayersCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXSUBLAYERSCOUNT); }
    /** Unsafe version of {@link #minLog2MinLumaCodingBlockSizeMinus3}. */
    public static int nminLog2MinLumaCodingBlockSizeMinus3(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINLOG2MINLUMACODINGBLOCKSIZEMINUS3); }
    /** Unsafe version of {@link #maxLog2MinLumaCodingBlockSizeMinus3}. */
    public static int nmaxLog2MinLumaCodingBlockSizeMinus3(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLOG2MINLUMACODINGBLOCKSIZEMINUS3); }
    /** Unsafe version of {@link #minLog2MinLumaTransformBlockSizeMinus2}. */
    public static int nminLog2MinLumaTransformBlockSizeMinus2(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2); }
    /** Unsafe version of {@link #maxLog2MinLumaTransformBlockSizeMinus2}. */
    public static int nmaxLog2MinLumaTransformBlockSizeMinus2(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2); }
    /** Unsafe version of {@link #minMaxTransformHierarchyDepthInter}. */
    public static int nminMaxTransformHierarchyDepthInter(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXTRANSFORMHIERARCHYDEPTHINTER); }
    /** Unsafe version of {@link #maxMaxTransformHierarchyDepthInter}. */
    public static int nmaxMaxTransformHierarchyDepthInter(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXTRANSFORMHIERARCHYDEPTHINTER); }
    /** Unsafe version of {@link #minMaxTransformHierarchyDepthIntra}. */
    public static int nminMaxTransformHierarchyDepthIntra(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXTRANSFORMHIERARCHYDEPTHINTRA); }
    /** Unsafe version of {@link #maxMaxTransformHierarchyDepthIntra}. */
    public static int nmaxMaxTransformHierarchyDepthIntra(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXTRANSFORMHIERARCHYDEPTHINTRA); }
    /** Unsafe version of {@link #maxDiffCuQpDeltaDepth}. */
    public static int nmaxDiffCuQpDeltaDepth(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXDIFFCUQPDELTADEPTH); }
    /** Unsafe version of {@link #minMaxNumMergeCand}. */
    public static int nminMaxNumMergeCand(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXNUMMERGECAND); }
    /** Unsafe version of {@link #maxMaxNumMergeCand}. */
    public static int nmaxMaxNumMergeCand(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXNUMMERGECAND); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265CapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265CapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH265CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#ctbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
        public int ctbSizes() { return VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#transformBlockSizes} field. */
        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
        public int transformBlockSizes() { return VkVideoEncodeH265CapabilitiesEXT.ntransformBlockSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxL1ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxSubLayersCount} field. */
        @NativeType("uint32_t")
        public int maxSubLayersCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxSubLayersCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minLog2MinLumaCodingBlockSizeMinus3} field. */
        @NativeType("uint32_t")
        public int minLog2MinLumaCodingBlockSizeMinus3() { return VkVideoEncodeH265CapabilitiesEXT.nminLog2MinLumaCodingBlockSizeMinus3(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxLog2MinLumaCodingBlockSizeMinus3} field. */
        @NativeType("uint32_t")
        public int maxLog2MinLumaCodingBlockSizeMinus3() { return VkVideoEncodeH265CapabilitiesEXT.nmaxLog2MinLumaCodingBlockSizeMinus3(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minLog2MinLumaTransformBlockSizeMinus2} field. */
        @NativeType("uint32_t")
        public int minLog2MinLumaTransformBlockSizeMinus2() { return VkVideoEncodeH265CapabilitiesEXT.nminLog2MinLumaTransformBlockSizeMinus2(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxLog2MinLumaTransformBlockSizeMinus2} field. */
        @NativeType("uint32_t")
        public int maxLog2MinLumaTransformBlockSizeMinus2() { return VkVideoEncodeH265CapabilitiesEXT.nmaxLog2MinLumaTransformBlockSizeMinus2(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxTransformHierarchyDepthInter} field. */
        @NativeType("uint32_t")
        public int minMaxTransformHierarchyDepthInter() { return VkVideoEncodeH265CapabilitiesEXT.nminMaxTransformHierarchyDepthInter(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxTransformHierarchyDepthInter} field. */
        @NativeType("uint32_t")
        public int maxMaxTransformHierarchyDepthInter() { return VkVideoEncodeH265CapabilitiesEXT.nmaxMaxTransformHierarchyDepthInter(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxTransformHierarchyDepthIntra} field. */
        @NativeType("uint32_t")
        public int minMaxTransformHierarchyDepthIntra() { return VkVideoEncodeH265CapabilitiesEXT.nminMaxTransformHierarchyDepthIntra(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxTransformHierarchyDepthIntra} field. */
        @NativeType("uint32_t")
        public int maxMaxTransformHierarchyDepthIntra() { return VkVideoEncodeH265CapabilitiesEXT.nmaxMaxTransformHierarchyDepthIntra(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxDiffCuQpDeltaDepth} field. */
        @NativeType("uint32_t")
        public int maxDiffCuQpDeltaDepth() { return VkVideoEncodeH265CapabilitiesEXT.nmaxDiffCuQpDeltaDepth(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxNumMergeCand} field. */
        @NativeType("uint32_t")
        public int minMaxNumMergeCand() { return VkVideoEncodeH265CapabilitiesEXT.nminMaxNumMergeCand(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxNumMergeCand} field. */
        @NativeType("uint32_t")
        public int maxMaxNumMergeCand() { return VkVideoEncodeH265CapabilitiesEXT.nmaxMaxNumMergeCand(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265CapabilitiesEXT.npNext(address(), value); return this; }

    }

}