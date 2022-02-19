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
 * <li>{@code inputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265InputModeFlagBitsEXT} values</li>
 * <li>{@code inputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code outputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH265OutputModeFlagBitsEXT} values</li>
 * <li>{@code outputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code ctbSizes} <b>must</b> be a valid combination of {@code VkVideoEncodeH265CtbSizeFlagBitsEXT} values</li>
 * <li>{@code ctbSizes} <b>must</b> not be 0</li>
 * <li>{@code transformBlockSizes} <b>must</b> be a valid combination of {@code VkVideoEncodeH265TransformBlockSizeFlagBitsEXT} values</li>
 * <li>{@code transformBlockSizes} <b>must</b> not be 0</li>
 * <li>{@code stdExtensionVersion} <b>must</b> be a valid {@link VkExtensionProperties} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH265CapabilityFlagsEXT {@link #flags};
 *     VkVideoEncodeH265InputModeFlagsEXT {@link #inputModeFlags};
 *     VkVideoEncodeH265OutputModeFlagsEXT {@link #outputModeFlags};
 *     VkVideoEncodeH265CtbSizeFlagsEXT {@link #ctbSizes};
 *     VkVideoEncodeH265TransformBlockSizeFlagsEXT {@link #transformBlockSizes};
 *     uint8_t {@link #maxPPictureL0ReferenceCount};
 *     uint8_t {@link #maxBPictureL0ReferenceCount};
 *     uint8_t {@link #maxL1ReferenceCount};
 *     uint8_t {@link #maxSubLayersCount};
 *     uint8_t {@link #minLog2MinLumaCodingBlockSizeMinus3};
 *     uint8_t {@link #maxLog2MinLumaCodingBlockSizeMinus3};
 *     uint8_t {@link #minLog2MinLumaTransformBlockSizeMinus2};
 *     uint8_t {@link #maxLog2MinLumaTransformBlockSizeMinus2};
 *     uint8_t {@link #minMaxTransformHierarchyDepthInter};
 *     uint8_t {@link #maxMaxTransformHierarchyDepthInter};
 *     uint8_t {@link #minMaxTransformHierarchyDepthIntra};
 *     uint8_t {@link #maxMaxTransformHierarchyDepthIntra};
 *     uint8_t {@link #maxDiffCuQpDeltaDepth};
 *     uint8_t {@link #minMaxNumMergeCand};
 *     uint8_t {@link #maxMaxNumMergeCand};
 *     {@link VkExtensionProperties VkExtensionProperties} {@link #stdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoEncodeH265CapabilitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INPUTMODEFLAGS,
        OUTPUTMODEFLAGS,
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
        MAXMAXNUMMERGECAND,
        STDEXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INPUTMODEFLAGS = layout.offsetof(3);
        OUTPUTMODEFLAGS = layout.offsetof(4);
        CTBSIZES = layout.offsetof(5);
        TRANSFORMBLOCKSIZES = layout.offsetof(6);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(7);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(8);
        MAXL1REFERENCECOUNT = layout.offsetof(9);
        MAXSUBLAYERSCOUNT = layout.offsetof(10);
        MINLOG2MINLUMACODINGBLOCKSIZEMINUS3 = layout.offsetof(11);
        MAXLOG2MINLUMACODINGBLOCKSIZEMINUS3 = layout.offsetof(12);
        MINLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2 = layout.offsetof(13);
        MAXLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2 = layout.offsetof(14);
        MINMAXTRANSFORMHIERARCHYDEPTHINTER = layout.offsetof(15);
        MAXMAXTRANSFORMHIERARCHYDEPTHINTER = layout.offsetof(16);
        MINMAXTRANSFORMHIERARCHYDEPTHINTRA = layout.offsetof(17);
        MAXMAXTRANSFORMHIERARCHYDEPTHINTRA = layout.offsetof(18);
        MAXDIFFCUQPDELTADEPTH = layout.offsetof(19);
        MINMAXNUMMERGECAND = layout.offsetof(20);
        MAXMAXNUMMERGECAND = layout.offsetof(21);
        STDEXTENSIONVERSION = layout.offsetof(22);
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
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CapabilityFlagBitsEXT} describing supported encoding tools. */
    @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265InputModeFlagBitsEXT} describing the command buffer input granularities/modes supported by the implementation. */
    @NativeType("VkVideoEncodeH265InputModeFlagsEXT")
    public int inputModeFlags() { return ninputModeFlags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265OutputModeFlagBitsEXT} describing the output (bitstream size reporting) granularities/modes supported by the implementation. */
    @NativeType("VkVideoEncodeH265OutputModeFlagsEXT")
    public int outputModeFlags() { return noutputModeFlags(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CtbSizeFlagBitsEXT} describing the supported CTB sizes. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
    public int ctbSizes() { return nctbSizes(address()); }
    /** a bitmask of {@code VkVideoEncodeH265TransformBlockSizeFlagBitsEXT} describing the supported transform block sizes. */
    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
    public int transformBlockSizes() { return ntransformBlockSizes(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for P pictures. */
    @NativeType("uint8_t")
    public byte maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for B pictures. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint8_t")
    public byte maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of B pictures is supported. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint8_t")
    public byte maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** reports the maximum number of sublayers. */
    @NativeType("uint8_t")
    public byte maxSubLayersCount() { return nmaxSubLayersCount(address()); }
    /** reports the minimum value that may be set for log2_min_luma_coding_block_size_minus3 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte minLog2MinLumaCodingBlockSizeMinus3() { return nminLog2MinLumaCodingBlockSizeMinus3(address()); }
    /** reports the maximum value that may be set for log2_min_luma_coding_block_size_minus3 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte maxLog2MinLumaCodingBlockSizeMinus3() { return nmaxLog2MinLumaCodingBlockSizeMinus3(address()); }
    /** reports the minimum value that may be set for log2_min_luma_transform_block_size_minus2 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte minLog2MinLumaTransformBlockSizeMinus2() { return nminLog2MinLumaTransformBlockSizeMinus2(address()); }
    /** reports the maximum value that may be set for log2_min_luma_transform_block_size_minus2 in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte maxLog2MinLumaTransformBlockSizeMinus2() { return nmaxLog2MinLumaTransformBlockSizeMinus2(address()); }
    /** reports the minimum value that may be set for max_transform_hierarchy_depth_inter in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte minMaxTransformHierarchyDepthInter() { return nminMaxTransformHierarchyDepthInter(address()); }
    /** reports the maximum value that may be set for max_transform_hierarchy_depth_inter in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte maxMaxTransformHierarchyDepthInter() { return nmaxMaxTransformHierarchyDepthInter(address()); }
    /** reports the minimum value that may be set for max_transform_hierarchy_depth_intra in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte minMaxTransformHierarchyDepthIntra() { return nminMaxTransformHierarchyDepthIntra(address()); }
    /** reports the maximum value that may be set for max_transform_hierarchy_depth_intra in StdVideoH265SequenceParameterSet. */
    @NativeType("uint8_t")
    public byte maxMaxTransformHierarchyDepthIntra() { return nmaxMaxTransformHierarchyDepthIntra(address()); }
    /** reports the maximum value that may be set for diff_cu_qp_delta_depth in StdVideoH265PictureParameterSet. */
    @NativeType("uint8_t")
    public byte maxDiffCuQpDeltaDepth() { return nmaxDiffCuQpDeltaDepth(address()); }
    /** reports the minimum value that may be set for MaxNumMergeCand in StdVideoEncodeH265SliceHeader. */
    @NativeType("uint8_t")
    public byte minMaxNumMergeCand() { return nminMaxNumMergeCand(address()); }
    /** reports the maximum value that may be set for MaxNumMergeCand in StdVideoEncodeH265SliceHeader. */
    @NativeType("uint8_t")
    public byte maxMaxNumMergeCand() { return nmaxMaxNumMergeCand(address()); }
    /** a {@link VkExtensionProperties} structure in which the H.265 extension name and version supported by the implementation are returned. */
    public VkExtensionProperties stdExtensionVersion() { return nstdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265CapabilitiesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH265CapabilitiesEXT flags(@NativeType("VkVideoEncodeH265CapabilityFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #inputModeFlags} field. */
    public VkVideoEncodeH265CapabilitiesEXT inputModeFlags(@NativeType("VkVideoEncodeH265InputModeFlagsEXT") int value) { ninputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #outputModeFlags} field. */
    public VkVideoEncodeH265CapabilitiesEXT outputModeFlags(@NativeType("VkVideoEncodeH265OutputModeFlagsEXT") int value) { noutputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #ctbSizes} field. */
    public VkVideoEncodeH265CapabilitiesEXT ctbSizes(@NativeType("VkVideoEncodeH265CtbSizeFlagsEXT") int value) { nctbSizes(address(), value); return this; }
    /** Sets the specified value to the {@link #transformBlockSizes} field. */
    public VkVideoEncodeH265CapabilitiesEXT transformBlockSizes(@NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT") int value) { ntransformBlockSizes(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPPictureL0ReferenceCount} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxPPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { nmaxPPictureL0ReferenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxBPictureL0ReferenceCount} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxBPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { nmaxBPictureL0ReferenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxL1ReferenceCount} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxL1ReferenceCount(@NativeType("uint8_t") byte value) { nmaxL1ReferenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSubLayersCount} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxSubLayersCount(@NativeType("uint8_t") byte value) { nmaxSubLayersCount(address(), value); return this; }
    /** Sets the specified value to the {@link #minLog2MinLumaCodingBlockSizeMinus3} field. */
    public VkVideoEncodeH265CapabilitiesEXT minLog2MinLumaCodingBlockSizeMinus3(@NativeType("uint8_t") byte value) { nminLog2MinLumaCodingBlockSizeMinus3(address(), value); return this; }
    /** Sets the specified value to the {@link #maxLog2MinLumaCodingBlockSizeMinus3} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxLog2MinLumaCodingBlockSizeMinus3(@NativeType("uint8_t") byte value) { nmaxLog2MinLumaCodingBlockSizeMinus3(address(), value); return this; }
    /** Sets the specified value to the {@link #minLog2MinLumaTransformBlockSizeMinus2} field. */
    public VkVideoEncodeH265CapabilitiesEXT minLog2MinLumaTransformBlockSizeMinus2(@NativeType("uint8_t") byte value) { nminLog2MinLumaTransformBlockSizeMinus2(address(), value); return this; }
    /** Sets the specified value to the {@link #maxLog2MinLumaTransformBlockSizeMinus2} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxLog2MinLumaTransformBlockSizeMinus2(@NativeType("uint8_t") byte value) { nmaxLog2MinLumaTransformBlockSizeMinus2(address(), value); return this; }
    /** Sets the specified value to the {@link #minMaxTransformHierarchyDepthInter} field. */
    public VkVideoEncodeH265CapabilitiesEXT minMaxTransformHierarchyDepthInter(@NativeType("uint8_t") byte value) { nminMaxTransformHierarchyDepthInter(address(), value); return this; }
    /** Sets the specified value to the {@link #maxMaxTransformHierarchyDepthInter} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxMaxTransformHierarchyDepthInter(@NativeType("uint8_t") byte value) { nmaxMaxTransformHierarchyDepthInter(address(), value); return this; }
    /** Sets the specified value to the {@link #minMaxTransformHierarchyDepthIntra} field. */
    public VkVideoEncodeH265CapabilitiesEXT minMaxTransformHierarchyDepthIntra(@NativeType("uint8_t") byte value) { nminMaxTransformHierarchyDepthIntra(address(), value); return this; }
    /** Sets the specified value to the {@link #maxMaxTransformHierarchyDepthIntra} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxMaxTransformHierarchyDepthIntra(@NativeType("uint8_t") byte value) { nmaxMaxTransformHierarchyDepthIntra(address(), value); return this; }
    /** Sets the specified value to the {@link #maxDiffCuQpDeltaDepth} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxDiffCuQpDeltaDepth(@NativeType("uint8_t") byte value) { nmaxDiffCuQpDeltaDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #minMaxNumMergeCand} field. */
    public VkVideoEncodeH265CapabilitiesEXT minMaxNumMergeCand(@NativeType("uint8_t") byte value) { nminMaxNumMergeCand(address(), value); return this; }
    /** Sets the specified value to the {@link #maxMaxNumMergeCand} field. */
    public VkVideoEncodeH265CapabilitiesEXT maxMaxNumMergeCand(@NativeType("uint8_t") byte value) { nmaxMaxNumMergeCand(address(), value); return this; }
    /** Copies the specified {@link VkExtensionProperties} to the {@link #stdExtensionVersion} field. */
    public VkVideoEncodeH265CapabilitiesEXT stdExtensionVersion(VkExtensionProperties value) { nstdExtensionVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265CapabilitiesEXT set(
        int sType,
        long pNext,
        int flags,
        int inputModeFlags,
        int outputModeFlags,
        int ctbSizes,
        int transformBlockSizes,
        byte maxPPictureL0ReferenceCount,
        byte maxBPictureL0ReferenceCount,
        byte maxL1ReferenceCount,
        byte maxSubLayersCount,
        byte minLog2MinLumaCodingBlockSizeMinus3,
        byte maxLog2MinLumaCodingBlockSizeMinus3,
        byte minLog2MinLumaTransformBlockSizeMinus2,
        byte maxLog2MinLumaTransformBlockSizeMinus2,
        byte minMaxTransformHierarchyDepthInter,
        byte maxMaxTransformHierarchyDepthInter,
        byte minMaxTransformHierarchyDepthIntra,
        byte maxMaxTransformHierarchyDepthIntra,
        byte maxDiffCuQpDeltaDepth,
        byte minMaxNumMergeCand,
        byte maxMaxNumMergeCand,
        VkExtensionProperties stdExtensionVersion
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        inputModeFlags(inputModeFlags);
        outputModeFlags(outputModeFlags);
        ctbSizes(ctbSizes);
        transformBlockSizes(transformBlockSizes);
        maxPPictureL0ReferenceCount(maxPPictureL0ReferenceCount);
        maxBPictureL0ReferenceCount(maxBPictureL0ReferenceCount);
        maxL1ReferenceCount(maxL1ReferenceCount);
        maxSubLayersCount(maxSubLayersCount);
        minLog2MinLumaCodingBlockSizeMinus3(minLog2MinLumaCodingBlockSizeMinus3);
        maxLog2MinLumaCodingBlockSizeMinus3(maxLog2MinLumaCodingBlockSizeMinus3);
        minLog2MinLumaTransformBlockSizeMinus2(minLog2MinLumaTransformBlockSizeMinus2);
        maxLog2MinLumaTransformBlockSizeMinus2(maxLog2MinLumaTransformBlockSizeMinus2);
        minMaxTransformHierarchyDepthInter(minMaxTransformHierarchyDepthInter);
        maxMaxTransformHierarchyDepthInter(maxMaxTransformHierarchyDepthInter);
        minMaxTransformHierarchyDepthIntra(minMaxTransformHierarchyDepthIntra);
        maxMaxTransformHierarchyDepthIntra(maxMaxTransformHierarchyDepthIntra);
        maxDiffCuQpDeltaDepth(maxDiffCuQpDeltaDepth);
        minMaxNumMergeCand(minMaxNumMergeCand);
        maxMaxNumMergeCand(maxMaxNumMergeCand);
        stdExtensionVersion(stdExtensionVersion);

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
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT calloc() {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265CapabilitiesEXT create(long address) {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265CapabilitiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265CapabilitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #inputModeFlags}. */
    public static int ninputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.INPUTMODEFLAGS); }
    /** Unsafe version of {@link #outputModeFlags}. */
    public static int noutputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.OUTPUTMODEFLAGS); }
    /** Unsafe version of {@link #ctbSizes}. */
    public static int nctbSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.CTBSIZES); }
    /** Unsafe version of {@link #transformBlockSizes}. */
    public static int ntransformBlockSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.TRANSFORMBLOCKSIZES); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static byte nmaxPPictureL0ReferenceCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static byte nmaxBPictureL0ReferenceCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static byte nmaxL1ReferenceCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxSubLayersCount}. */
    public static byte nmaxSubLayersCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXSUBLAYERSCOUNT); }
    /** Unsafe version of {@link #minLog2MinLumaCodingBlockSizeMinus3}. */
    public static byte nminLog2MinLumaCodingBlockSizeMinus3(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINLOG2MINLUMACODINGBLOCKSIZEMINUS3); }
    /** Unsafe version of {@link #maxLog2MinLumaCodingBlockSizeMinus3}. */
    public static byte nmaxLog2MinLumaCodingBlockSizeMinus3(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLOG2MINLUMACODINGBLOCKSIZEMINUS3); }
    /** Unsafe version of {@link #minLog2MinLumaTransformBlockSizeMinus2}. */
    public static byte nminLog2MinLumaTransformBlockSizeMinus2(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2); }
    /** Unsafe version of {@link #maxLog2MinLumaTransformBlockSizeMinus2}. */
    public static byte nmaxLog2MinLumaTransformBlockSizeMinus2(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2); }
    /** Unsafe version of {@link #minMaxTransformHierarchyDepthInter}. */
    public static byte nminMaxTransformHierarchyDepthInter(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXTRANSFORMHIERARCHYDEPTHINTER); }
    /** Unsafe version of {@link #maxMaxTransformHierarchyDepthInter}. */
    public static byte nmaxMaxTransformHierarchyDepthInter(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXTRANSFORMHIERARCHYDEPTHINTER); }
    /** Unsafe version of {@link #minMaxTransformHierarchyDepthIntra}. */
    public static byte nminMaxTransformHierarchyDepthIntra(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXTRANSFORMHIERARCHYDEPTHINTRA); }
    /** Unsafe version of {@link #maxMaxTransformHierarchyDepthIntra}. */
    public static byte nmaxMaxTransformHierarchyDepthIntra(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXTRANSFORMHIERARCHYDEPTHINTRA); }
    /** Unsafe version of {@link #maxDiffCuQpDeltaDepth}. */
    public static byte nmaxDiffCuQpDeltaDepth(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXDIFFCUQPDELTADEPTH); }
    /** Unsafe version of {@link #minMaxNumMergeCand}. */
    public static byte nminMaxNumMergeCand(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXNUMMERGECAND); }
    /** Unsafe version of {@link #maxMaxNumMergeCand}. */
    public static byte nmaxMaxNumMergeCand(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXNUMMERGECAND); }
    /** Unsafe version of {@link #stdExtensionVersion}. */
    public static VkExtensionProperties nstdExtensionVersion(long struct) { return VkExtensionProperties.create(struct + VkVideoEncodeH265CapabilitiesEXT.STDEXTENSIONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.FLAGS, value); }
    /** Unsafe version of {@link #inputModeFlags(int) inputModeFlags}. */
    public static void ninputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.INPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #outputModeFlags(int) outputModeFlags}. */
    public static void noutputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.OUTPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #ctbSizes(int) ctbSizes}. */
    public static void nctbSizes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.CTBSIZES, value); }
    /** Unsafe version of {@link #transformBlockSizes(int) transformBlockSizes}. */
    public static void ntransformBlockSizes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.TRANSFORMBLOCKSIZES, value); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount(byte) maxPPictureL0ReferenceCount}. */
    public static void nmaxPPictureL0ReferenceCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT, value); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount(byte) maxBPictureL0ReferenceCount}. */
    public static void nmaxBPictureL0ReferenceCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT, value); }
    /** Unsafe version of {@link #maxL1ReferenceCount(byte) maxL1ReferenceCount}. */
    public static void nmaxL1ReferenceCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXL1REFERENCECOUNT, value); }
    /** Unsafe version of {@link #maxSubLayersCount(byte) maxSubLayersCount}. */
    public static void nmaxSubLayersCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXSUBLAYERSCOUNT, value); }
    /** Unsafe version of {@link #minLog2MinLumaCodingBlockSizeMinus3(byte) minLog2MinLumaCodingBlockSizeMinus3}. */
    public static void nminLog2MinLumaCodingBlockSizeMinus3(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINLOG2MINLUMACODINGBLOCKSIZEMINUS3, value); }
    /** Unsafe version of {@link #maxLog2MinLumaCodingBlockSizeMinus3(byte) maxLog2MinLumaCodingBlockSizeMinus3}. */
    public static void nmaxLog2MinLumaCodingBlockSizeMinus3(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLOG2MINLUMACODINGBLOCKSIZEMINUS3, value); }
    /** Unsafe version of {@link #minLog2MinLumaTransformBlockSizeMinus2(byte) minLog2MinLumaTransformBlockSizeMinus2}. */
    public static void nminLog2MinLumaTransformBlockSizeMinus2(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2, value); }
    /** Unsafe version of {@link #maxLog2MinLumaTransformBlockSizeMinus2(byte) maxLog2MinLumaTransformBlockSizeMinus2}. */
    public static void nmaxLog2MinLumaTransformBlockSizeMinus2(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLOG2MINLUMATRANSFORMBLOCKSIZEMINUS2, value); }
    /** Unsafe version of {@link #minMaxTransformHierarchyDepthInter(byte) minMaxTransformHierarchyDepthInter}. */
    public static void nminMaxTransformHierarchyDepthInter(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXTRANSFORMHIERARCHYDEPTHINTER, value); }
    /** Unsafe version of {@link #maxMaxTransformHierarchyDepthInter(byte) maxMaxTransformHierarchyDepthInter}. */
    public static void nmaxMaxTransformHierarchyDepthInter(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXTRANSFORMHIERARCHYDEPTHINTER, value); }
    /** Unsafe version of {@link #minMaxTransformHierarchyDepthIntra(byte) minMaxTransformHierarchyDepthIntra}. */
    public static void nminMaxTransformHierarchyDepthIntra(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXTRANSFORMHIERARCHYDEPTHINTRA, value); }
    /** Unsafe version of {@link #maxMaxTransformHierarchyDepthIntra(byte) maxMaxTransformHierarchyDepthIntra}. */
    public static void nmaxMaxTransformHierarchyDepthIntra(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXTRANSFORMHIERARCHYDEPTHINTRA, value); }
    /** Unsafe version of {@link #maxDiffCuQpDeltaDepth(byte) maxDiffCuQpDeltaDepth}. */
    public static void nmaxDiffCuQpDeltaDepth(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXDIFFCUQPDELTADEPTH, value); }
    /** Unsafe version of {@link #minMaxNumMergeCand(byte) minMaxNumMergeCand}. */
    public static void nminMaxNumMergeCand(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINMAXNUMMERGECAND, value); }
    /** Unsafe version of {@link #maxMaxNumMergeCand(byte) maxMaxNumMergeCand}. */
    public static void nmaxMaxNumMergeCand(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXMAXNUMMERGECAND, value); }
    /** Unsafe version of {@link #stdExtensionVersion(VkExtensionProperties) stdExtensionVersion}. */
    public static void nstdExtensionVersion(long struct, VkExtensionProperties value) { memCopy(value.address(), struct + VkVideoEncodeH265CapabilitiesEXT.STDEXTENSIONVERSION, VkExtensionProperties.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265CapabilitiesEXT#SIZEOF}, and its mark will be undefined.
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
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH265CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#inputModeFlags} field. */
        @NativeType("VkVideoEncodeH265InputModeFlagsEXT")
        public int inputModeFlags() { return VkVideoEncodeH265CapabilitiesEXT.ninputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#outputModeFlags} field. */
        @NativeType("VkVideoEncodeH265OutputModeFlagsEXT")
        public int outputModeFlags() { return VkVideoEncodeH265CapabilitiesEXT.noutputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#ctbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
        public int ctbSizes() { return VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#transformBlockSizes} field. */
        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
        public int transformBlockSizes() { return VkVideoEncodeH265CapabilitiesEXT.ntransformBlockSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        @NativeType("uint8_t")
        public byte maxPPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        @NativeType("uint8_t")
        public byte maxBPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxL1ReferenceCount} field. */
        @NativeType("uint8_t")
        public byte maxL1ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxSubLayersCount} field. */
        @NativeType("uint8_t")
        public byte maxSubLayersCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxSubLayersCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minLog2MinLumaCodingBlockSizeMinus3} field. */
        @NativeType("uint8_t")
        public byte minLog2MinLumaCodingBlockSizeMinus3() { return VkVideoEncodeH265CapabilitiesEXT.nminLog2MinLumaCodingBlockSizeMinus3(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxLog2MinLumaCodingBlockSizeMinus3} field. */
        @NativeType("uint8_t")
        public byte maxLog2MinLumaCodingBlockSizeMinus3() { return VkVideoEncodeH265CapabilitiesEXT.nmaxLog2MinLumaCodingBlockSizeMinus3(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minLog2MinLumaTransformBlockSizeMinus2} field. */
        @NativeType("uint8_t")
        public byte minLog2MinLumaTransformBlockSizeMinus2() { return VkVideoEncodeH265CapabilitiesEXT.nminLog2MinLumaTransformBlockSizeMinus2(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxLog2MinLumaTransformBlockSizeMinus2} field. */
        @NativeType("uint8_t")
        public byte maxLog2MinLumaTransformBlockSizeMinus2() { return VkVideoEncodeH265CapabilitiesEXT.nmaxLog2MinLumaTransformBlockSizeMinus2(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxTransformHierarchyDepthInter} field. */
        @NativeType("uint8_t")
        public byte minMaxTransformHierarchyDepthInter() { return VkVideoEncodeH265CapabilitiesEXT.nminMaxTransformHierarchyDepthInter(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxTransformHierarchyDepthInter} field. */
        @NativeType("uint8_t")
        public byte maxMaxTransformHierarchyDepthInter() { return VkVideoEncodeH265CapabilitiesEXT.nmaxMaxTransformHierarchyDepthInter(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxTransformHierarchyDepthIntra} field. */
        @NativeType("uint8_t")
        public byte minMaxTransformHierarchyDepthIntra() { return VkVideoEncodeH265CapabilitiesEXT.nminMaxTransformHierarchyDepthIntra(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxTransformHierarchyDepthIntra} field. */
        @NativeType("uint8_t")
        public byte maxMaxTransformHierarchyDepthIntra() { return VkVideoEncodeH265CapabilitiesEXT.nmaxMaxTransformHierarchyDepthIntra(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxDiffCuQpDeltaDepth} field. */
        @NativeType("uint8_t")
        public byte maxDiffCuQpDeltaDepth() { return VkVideoEncodeH265CapabilitiesEXT.nmaxDiffCuQpDeltaDepth(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxNumMergeCand} field. */
        @NativeType("uint8_t")
        public byte minMaxNumMergeCand() { return VkVideoEncodeH265CapabilitiesEXT.nminMaxNumMergeCand(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxNumMergeCand} field. */
        @NativeType("uint8_t")
        public byte maxMaxNumMergeCand() { return VkVideoEncodeH265CapabilitiesEXT.nmaxMaxNumMergeCand(address()); }
        /** @return a {@link VkExtensionProperties} view of the {@link VkVideoEncodeH265CapabilitiesEXT#stdExtensionVersion} field. */
        public VkExtensionProperties stdExtensionVersion() { return VkVideoEncodeH265CapabilitiesEXT.nstdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265CapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#flags} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer flags(@NativeType("VkVideoEncodeH265CapabilityFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#inputModeFlags} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer inputModeFlags(@NativeType("VkVideoEncodeH265InputModeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.ninputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#outputModeFlags} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer outputModeFlags(@NativeType("VkVideoEncodeH265OutputModeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.noutputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#ctbSizes} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer ctbSizes(@NativeType("VkVideoEncodeH265CtbSizeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#transformBlockSizes} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer transformBlockSizes(@NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT") int value) { VkVideoEncodeH265CapabilitiesEXT.ntransformBlockSizes(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxPPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxBPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxL1ReferenceCount} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxL1ReferenceCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxL1ReferenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxSubLayersCount} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxSubLayersCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxSubLayersCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#minLog2MinLumaCodingBlockSizeMinus3} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer minLog2MinLumaCodingBlockSizeMinus3(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nminLog2MinLumaCodingBlockSizeMinus3(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxLog2MinLumaCodingBlockSizeMinus3} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxLog2MinLumaCodingBlockSizeMinus3(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxLog2MinLumaCodingBlockSizeMinus3(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#minLog2MinLumaTransformBlockSizeMinus2} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer minLog2MinLumaTransformBlockSizeMinus2(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nminLog2MinLumaTransformBlockSizeMinus2(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxLog2MinLumaTransformBlockSizeMinus2} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxLog2MinLumaTransformBlockSizeMinus2(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxLog2MinLumaTransformBlockSizeMinus2(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxTransformHierarchyDepthInter} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer minMaxTransformHierarchyDepthInter(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nminMaxTransformHierarchyDepthInter(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxTransformHierarchyDepthInter} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxMaxTransformHierarchyDepthInter(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxMaxTransformHierarchyDepthInter(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxTransformHierarchyDepthIntra} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer minMaxTransformHierarchyDepthIntra(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nminMaxTransformHierarchyDepthIntra(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxTransformHierarchyDepthIntra} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxMaxTransformHierarchyDepthIntra(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxMaxTransformHierarchyDepthIntra(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxDiffCuQpDeltaDepth} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxDiffCuQpDeltaDepth(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxDiffCuQpDeltaDepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#minMaxNumMergeCand} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer minMaxNumMergeCand(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nminMaxNumMergeCand(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#maxMaxNumMergeCand} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer maxMaxNumMergeCand(@NativeType("uint8_t") byte value) { VkVideoEncodeH265CapabilitiesEXT.nmaxMaxNumMergeCand(address(), value); return this; }
        /** Copies the specified {@link VkExtensionProperties} to the {@link VkVideoEncodeH265CapabilitiesEXT#stdExtensionVersion} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer stdExtensionVersion(VkExtensionProperties value) { VkVideoEncodeH265CapabilitiesEXT.nstdExtensionVersion(address(), value); return this; }

    }

}