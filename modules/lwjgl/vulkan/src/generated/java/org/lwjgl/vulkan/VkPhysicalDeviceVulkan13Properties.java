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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceVulkan13Properties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t minSubgroupSize;
 *     uint32_t maxSubgroupSize;
 *     uint32_t maxComputeWorkgroupSubgroups;
 *     VkShaderStageFlags requiredSubgroupSizeStages;
 *     uint32_t maxInlineUniformBlockSize;
 *     uint32_t maxPerStageDescriptorInlineUniformBlocks;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
 *     uint32_t maxDescriptorSetInlineUniformBlocks;
 *     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
 *     uint32_t maxInlineUniformTotalSize;
 *     VkBool32 integerDotProduct8BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct8BitSignedAccelerated;
 *     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
 *     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct16BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct16BitSignedAccelerated;
 *     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct32BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct32BitSignedAccelerated;
 *     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProduct64BitUnsignedAccelerated;
 *     VkBool32 integerDotProduct64BitSignedAccelerated;
 *     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
 *     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
 *     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
 *     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
 *     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
 *     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
 *     VkDeviceSize maxBufferSize;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan13Properties extends Struct<VkPhysicalDeviceVulkan13Properties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINSUBGROUPSIZE,
        MAXSUBGROUPSIZE,
        MAXCOMPUTEWORKGROUPSUBGROUPS,
        REQUIREDSUBGROUPSIZESTAGES,
        MAXINLINEUNIFORMBLOCKSIZE,
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS,
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS,
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS,
        MAXINLINEUNIFORMTOTALSIZE,
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED,
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED,
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED,
        STORAGETEXELBUFFEROFFSETALIGNMENTBYTES,
        STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT,
        UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES,
        UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT,
        MAXBUFFERSIZE;

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
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINSUBGROUPSIZE = layout.offsetof(2);
        MAXSUBGROUPSIZE = layout.offsetof(3);
        MAXCOMPUTEWORKGROUPSUBGROUPS = layout.offsetof(4);
        REQUIREDSUBGROUPSIZESTAGES = layout.offsetof(5);
        MAXINLINEUNIFORMBLOCKSIZE = layout.offsetof(6);
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS = layout.offsetof(7);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(8);
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS = layout.offsetof(9);
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(10);
        MAXINLINEUNIFORMTOTALSIZE = layout.offsetof(11);
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = layout.offsetof(12);
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = layout.offsetof(13);
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(14);
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(15);
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(16);
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(17);
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = layout.offsetof(18);
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = layout.offsetof(19);
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(20);
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = layout.offsetof(21);
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = layout.offsetof(22);
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(23);
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = layout.offsetof(24);
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = layout.offsetof(25);
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(26);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = layout.offsetof(27);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = layout.offsetof(28);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(29);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(30);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(31);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(32);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = layout.offsetof(33);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = layout.offsetof(34);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(35);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = layout.offsetof(36);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = layout.offsetof(37);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(38);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = layout.offsetof(39);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = layout.offsetof(40);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(41);
        STORAGETEXELBUFFEROFFSETALIGNMENTBYTES = layout.offsetof(42);
        STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT = layout.offsetof(43);
        UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES = layout.offsetof(44);
        UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT = layout.offsetof(45);
        MAXBUFFERSIZE = layout.offsetof(46);
    }

    protected VkPhysicalDeviceVulkan13Properties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan13Properties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan13Properties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan13Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan13Properties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code minSubgroupSize} field. */
    @NativeType("uint32_t")
    public int minSubgroupSize() { return nminSubgroupSize(address()); }
    /** @return the value of the {@code maxSubgroupSize} field. */
    @NativeType("uint32_t")
    public int maxSubgroupSize() { return nmaxSubgroupSize(address()); }
    /** @return the value of the {@code maxComputeWorkgroupSubgroups} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkgroupSubgroups() { return nmaxComputeWorkgroupSubgroups(address()); }
    /** @return the value of the {@code requiredSubgroupSizeStages} field. */
    @NativeType("VkShaderStageFlags")
    public int requiredSubgroupSizeStages() { return nrequiredSubgroupSizeStages(address()); }
    /** @return the value of the {@code maxInlineUniformBlockSize} field. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockSize() { return nmaxInlineUniformBlockSize(address()); }
    /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInlineUniformBlocks() { return nmaxPerStageDescriptorInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxDescriptorSetInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInlineUniformBlocks() { return nmaxDescriptorSetInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }
    /** @return the value of the {@code maxInlineUniformTotalSize} field. */
    @NativeType("uint32_t")
    public int maxInlineUniformTotalSize() { return nmaxInlineUniformTotalSize(address()); }
    /** @return the value of the {@code integerDotProduct8BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() { return nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct8BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() { return nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct8BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() { return nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct4x8BitPackedSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct16BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() { return nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct16BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() { return nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct16BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() { return nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct32BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() { return nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct32BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() { return nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct32BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() { return nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct64BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() { return nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct64BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() { return nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProduct64BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() { return nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
    /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }
    /** @return the value of the {@code storageTexelBufferOffsetAlignmentBytes} field. */
    @NativeType("VkDeviceSize")
    public long storageTexelBufferOffsetAlignmentBytes() { return nstorageTexelBufferOffsetAlignmentBytes(address()); }
    /** @return the value of the {@code storageTexelBufferOffsetSingleTexelAlignment} field. */
    @NativeType("VkBool32")
    public boolean storageTexelBufferOffsetSingleTexelAlignment() { return nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
    /** @return the value of the {@code uniformTexelBufferOffsetAlignmentBytes} field. */
    @NativeType("VkDeviceSize")
    public long uniformTexelBufferOffsetAlignmentBytes() { return nuniformTexelBufferOffsetAlignmentBytes(address()); }
    /** @return the value of the {@code uniformTexelBufferOffsetSingleTexelAlignment} field. */
    @NativeType("VkBool32")
    public boolean uniformTexelBufferOffsetSingleTexelAlignment() { return nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
    /** @return the value of the {@code maxBufferSize} field. */
    @NativeType("VkDeviceSize")
    public long maxBufferSize() { return nmaxBufferSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan13Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan13Properties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan13Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan13Properties set(
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
    public VkPhysicalDeviceVulkan13Properties set(VkPhysicalDeviceVulkan13Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Properties malloc() {
        return new VkPhysicalDeviceVulkan13Properties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Properties calloc() {
        return new VkPhysicalDeviceVulkan13Properties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan13Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan13Properties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan13Properties create(long address) {
        return new VkPhysicalDeviceVulkan13Properties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan13Properties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan13Properties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan13Properties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan13Properties.PNEXT); }
    /** Unsafe version of {@link #minSubgroupSize}. */
    public static int nminSubgroupSize(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MINSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxSubgroupSize}. */
    public static int nmaxSubgroupSize(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxComputeWorkgroupSubgroups}. */
    public static int nmaxComputeWorkgroupSubgroups(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXCOMPUTEWORKGROUPSUBGROUPS); }
    /** Unsafe version of {@link #requiredSubgroupSizeStages}. */
    public static int nrequiredSubgroupSizeStages(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.REQUIREDSUBGROUPSIZESTAGES); }
    /** Unsafe version of {@link #maxInlineUniformBlockSize}. */
    public static int nmaxInlineUniformBlockSize(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXINLINEUNIFORMBLOCKSIZE); }
    /** Unsafe version of {@link #maxPerStageDescriptorInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetInlineUniformBlocks}. */
    public static int nmaxDescriptorSetInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxInlineUniformTotalSize}. */
    public static int nmaxInlineUniformTotalSize(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.MAXINLINEUNIFORMTOTALSIZE); }
    /** Unsafe version of {@link #integerDotProduct8BitUnsignedAccelerated}. */
    public static int nintegerDotProduct8BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitSignedAccelerated}. */
    public static int nintegerDotProduct8BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitUnsignedAccelerated}. */
    public static int nintegerDotProduct16BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitSignedAccelerated}. */
    public static int nintegerDotProduct16BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitUnsignedAccelerated}. */
    public static int nintegerDotProduct32BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitSignedAccelerated}. */
    public static int nintegerDotProduct32BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitUnsignedAccelerated}. */
    public static int nintegerDotProduct64BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitSignedAccelerated}. */
    public static int nintegerDotProduct64BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #storageTexelBufferOffsetAlignmentBytes}. */
    public static long nstorageTexelBufferOffsetAlignmentBytes(long struct) { return memGetLong(struct + VkPhysicalDeviceVulkan13Properties.STORAGETEXELBUFFEROFFSETALIGNMENTBYTES); }
    /** Unsafe version of {@link #storageTexelBufferOffsetSingleTexelAlignment}. */
    public static int nstorageTexelBufferOffsetSingleTexelAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT); }
    /** Unsafe version of {@link #uniformTexelBufferOffsetAlignmentBytes}. */
    public static long nuniformTexelBufferOffsetAlignmentBytes(long struct) { return memGetLong(struct + VkPhysicalDeviceVulkan13Properties.UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES); }
    /** Unsafe version of {@link #uniformTexelBufferOffsetSingleTexelAlignment}. */
    public static int nuniformTexelBufferOffsetSingleTexelAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Properties.UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT); }
    /** Unsafe version of {@link #maxBufferSize}. */
    public static long nmaxBufferSize(long struct) { return memGetLong(struct + VkPhysicalDeviceVulkan13Properties.MAXBUFFERSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan13Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan13Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan13Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan13Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan13Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan13Properties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan13Properties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan13Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan13Properties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan13Properties.npNext(address()); }
        /** @return the value of the {@code minSubgroupSize} field. */
        @NativeType("uint32_t")
        public int minSubgroupSize() { return VkPhysicalDeviceVulkan13Properties.nminSubgroupSize(address()); }
        /** @return the value of the {@code maxSubgroupSize} field. */
        @NativeType("uint32_t")
        public int maxSubgroupSize() { return VkPhysicalDeviceVulkan13Properties.nmaxSubgroupSize(address()); }
        /** @return the value of the {@code maxComputeWorkgroupSubgroups} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkgroupSubgroups() { return VkPhysicalDeviceVulkan13Properties.nmaxComputeWorkgroupSubgroups(address()); }
        /** @return the value of the {@code requiredSubgroupSizeStages} field. */
        @NativeType("VkShaderStageFlags")
        public int requiredSubgroupSizeStages() { return VkPhysicalDeviceVulkan13Properties.nrequiredSubgroupSizeStages(address()); }
        /** @return the value of the {@code maxInlineUniformBlockSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockSize() { return VkPhysicalDeviceVulkan13Properties.nmaxInlineUniformBlockSize(address()); }
        /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxPerStageDescriptorInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxDescriptorSetInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxDescriptorSetInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }
        /** @return the value of the {@code maxInlineUniformTotalSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformTotalSize() { return VkPhysicalDeviceVulkan13Properties.nmaxInlineUniformTotalSize(address()); }
        /** @return the value of the {@code integerDotProduct8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProduct64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@code integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@code storageTexelBufferOffsetAlignmentBytes} field. */
        @NativeType("VkDeviceSize")
        public long storageTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceVulkan13Properties.nstorageTexelBufferOffsetAlignmentBytes(address()); }
        /** @return the value of the {@code storageTexelBufferOffsetSingleTexelAlignment} field. */
        @NativeType("VkBool32")
        public boolean storageTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceVulkan13Properties.nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
        /** @return the value of the {@code uniformTexelBufferOffsetAlignmentBytes} field. */
        @NativeType("VkDeviceSize")
        public long uniformTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceVulkan13Properties.nuniformTexelBufferOffsetAlignmentBytes(address()); }
        /** @return the value of the {@code uniformTexelBufferOffsetSingleTexelAlignment} field. */
        @NativeType("VkBool32")
        public boolean uniformTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceVulkan13Properties.nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
        /** @return the value of the {@code maxBufferSize} field. */
        @NativeType("VkDeviceSize")
        public long maxBufferSize() { return VkPhysicalDeviceVulkan13Properties.nmaxBufferSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan13Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan13Properties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan13Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan13Properties.npNext(address(), value); return this; }

    }

}