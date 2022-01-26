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
 * Structure specifying physical device properties for functionality promoted to Vulkan 1.3.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan13Properties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These properties correspond to Vulkan 1.3 functionality.</p>
 * 
 * <p>The members of {@link VkPhysicalDeviceVulkan13Properties} <b>must</b> have the same values as the corresponding members of {@link VkPhysicalDeviceInlineUniformBlockProperties} and {@link VkPhysicalDeviceSubgroupSizeControlProperties}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan13Properties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #minSubgroupSize};
 *     uint32_t {@link #maxSubgroupSize};
 *     uint32_t {@link #maxComputeWorkgroupSubgroups};
 *     VkShaderStageFlags {@link #requiredSubgroupSizeStages};
 *     uint32_t {@link #maxInlineUniformBlockSize};
 *     uint32_t maxPerStageDescriptorInlineUniformBlocks;
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks};
 *     uint32_t {@link #maxDescriptorSetInlineUniformBlocks};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks};
 *     uint32_t {@link #maxInlineUniformTotalSize};
 *     VkBool32 {@link #integerDotProduct8BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct8BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct8BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct4x8BitPackedUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct4x8BitPackedSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct16BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct16BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct16BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct32BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct32BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct32BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProduct64BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProduct64BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProduct64BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated};
 *     VkBool32 {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated};
 *     VkDeviceSize {@link #storageTexelBufferOffsetAlignmentBytes};
 *     VkBool32 {@link #storageTexelBufferOffsetSingleTexelAlignment};
 *     VkDeviceSize {@link #uniformTexelBufferOffsetAlignmentBytes};
 *     VkBool32 {@link #uniformTexelBufferOffsetSingleTexelAlignment};
 *     VkDeviceSize {@link #maxBufferSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan13Properties extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the minimum subgroup size supported by this device. {@code minSubgroupSize} is at least one if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code minSubgroupSize} is a power-of-two. {@code minSubgroupSize} is less than or equal to {@code maxSubgroupSize}. {@code minSubgroupSize} is less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-subgroup-size">subgroupSize</a>. */
    @NativeType("uint32_t")
    public int minSubgroupSize() { return nminSubgroupSize(address()); }
    /** the maximum subgroup size supported by this device. {@code maxSubgroupSize} is at least one if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code maxSubgroupSize} is a power-of-two. {@code maxSubgroupSize} is greater than or equal to {@code minSubgroupSize}. {@code maxSubgroupSize} is greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-subgroup-size">subgroupSize</a>. */
    @NativeType("uint32_t")
    public int maxSubgroupSize() { return nmaxSubgroupSize(address()); }
    /** the maximum number of subgroups supported by the implementation within a workgroup. */
    @NativeType("uint32_t")
    public int maxComputeWorkgroupSubgroups() { return nmaxComputeWorkgroupSubgroups(address()); }
    /** a bitfield of what shader stages support having a required subgroup size specified. */
    @NativeType("VkShaderStageFlags")
    public int requiredSubgroupSizeStages() { return nrequiredSubgroupSizeStages(address()); }
    /** the maximum size in bytes of an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-inlineuniformblock">inline uniform block</a> binding. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockSize() { return nmaxInlineUniformBlockSize(address()); }
    /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInlineUniformBlocks() { return nmaxPerStageDescriptorInlineUniformBlocks(address()); }
    /** similar to {@code maxPerStageDescriptorInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
    /** the maximum number of inline uniform block bindings that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInlineUniformBlocks() { return nmaxDescriptorSetInlineUniformBlocks(address()); }
    /** similar to {@code maxDescriptorSetInlineUniformBlocks} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }
    /** the maximum total size in bytes of all inline uniform block bindings, across all pipeline shader stages and descriptor set numbers, that <b>can</b> be included in a pipeline layout. Descriptor bindings with a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} count against this limit. */
    @NativeType("uint32_t")
    public int maxInlineUniformTotalSize() { return nmaxInlineUniformTotalSize(address()); }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() { return nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() { return nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() { return nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned dot product operations from operands packed into 32-bit integers using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed dot product operations from operands packed into 32-bit integers using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness dot product operations from operands packed into 32-bit integers using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() { return nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() { return nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() { return nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() { return nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() { return nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() { return nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit unsigned dot product operations using the {@code OpUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() { return nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit signed dot product operations using the {@code OpSDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() { return nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit mixed signedness dot product operations using the {@code OpSUDotKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() { return nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit unsigned accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit signed accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 8-bit mixed signedness accumulating saturating dot product operations from operands packed into 32-bit integers using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 16-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 32-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit unsigned accumulating saturating dot product operations using the {@code OpUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit signed accumulating saturating dot product operations using the {@code OpSDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
    /** a boolean that will be {@link VK10#VK_TRUE TRUE} if the support for 64-bit mixed signedness accumulating saturating dot product operations using the {@code OpSUDotAccSatKHR} SPIR-V instruction is accelerated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-integer-dot-product-accelerated">as defined below</a>. */
    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }
    /** a byte alignment that is sufficient for a storage texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long storageTexelBufferOffsetAlignmentBytes() { return nstorageTexelBufferOffsetAlignmentBytes(address()); }
    /** indicates whether single texel alignment is sufficient for a storage texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkBool32")
    public boolean storageTexelBufferOffsetSingleTexelAlignment() { return nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
    /** a byte alignment that is sufficient for a uniform texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long uniformTexelBufferOffsetAlignmentBytes() { return nuniformTexelBufferOffsetAlignmentBytes(address()); }
    /** indicates whether single texel alignment is sufficient for a uniform texel buffer of any format. The value <b>must</b> be a power of two. */
    @NativeType("VkBool32")
    public boolean uniformTexelBufferOffsetSingleTexelAlignment() { return nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
    /** the maximum size {@code VkBuffer} that <b>can</b> be created. */
    @NativeType("VkDeviceSize")
    public long maxBufferSize() { return nmaxBufferSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan13Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan13Properties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
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
        return wrap(VkPhysicalDeviceVulkan13Properties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Properties calloc() {
        return wrap(VkPhysicalDeviceVulkan13Properties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan13Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkan13Properties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan13Properties create(long address) {
        return wrap(VkPhysicalDeviceVulkan13Properties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan13Properties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkan13Properties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan13Properties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Properties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan13Properties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Properties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan13Properties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan13Properties.PNEXT); }
    /** Unsafe version of {@link #minSubgroupSize}. */
    public static int nminSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MINSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxSubgroupSize}. */
    public static int nmaxSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxComputeWorkgroupSubgroups}. */
    public static int nmaxComputeWorkgroupSubgroups(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXCOMPUTEWORKGROUPSUBGROUPS); }
    /** Unsafe version of {@link #requiredSubgroupSizeStages}. */
    public static int nrequiredSubgroupSizeStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.REQUIREDSUBGROUPSIZESTAGES); }
    /** Unsafe version of {@link #maxInlineUniformBlockSize}. */
    public static int nmaxInlineUniformBlockSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXINLINEUNIFORMBLOCKSIZE); }
    /** Unsafe version of {@link #maxPerStageDescriptorInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetInlineUniformBlocks}. */
    public static int nmaxDescriptorSetInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXDESCRIPTORSETINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindInlineUniformBlocks}. */
    public static int nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS); }
    /** Unsafe version of {@link #maxInlineUniformTotalSize}. */
    public static int nmaxInlineUniformTotalSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.MAXINLINEUNIFORMTOTALSIZE); }
    /** Unsafe version of {@link #integerDotProduct8BitUnsignedAccelerated}. */
    public static int nintegerDotProduct8BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitSignedAccelerated}. */
    public static int nintegerDotProduct8BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitUnsignedAccelerated}. */
    public static int nintegerDotProduct16BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitSignedAccelerated}. */
    public static int nintegerDotProduct16BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitUnsignedAccelerated}. */
    public static int nintegerDotProduct32BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitSignedAccelerated}. */
    public static int nintegerDotProduct32BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitUnsignedAccelerated}. */
    public static int nintegerDotProduct64BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitSignedAccelerated}. */
    public static int nintegerDotProduct64BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProduct64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitSignedAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED); }
    /** Unsafe version of {@link #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated}. */
    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED); }
    /** Unsafe version of {@link #storageTexelBufferOffsetAlignmentBytes}. */
    public static long nstorageTexelBufferOffsetAlignmentBytes(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceVulkan13Properties.STORAGETEXELBUFFEROFFSETALIGNMENTBYTES); }
    /** Unsafe version of {@link #storageTexelBufferOffsetSingleTexelAlignment}. */
    public static int nstorageTexelBufferOffsetSingleTexelAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT); }
    /** Unsafe version of {@link #uniformTexelBufferOffsetAlignmentBytes}. */
    public static long nuniformTexelBufferOffsetAlignmentBytes(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceVulkan13Properties.UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES); }
    /** Unsafe version of {@link #uniformTexelBufferOffsetSingleTexelAlignment}. */
    public static int nuniformTexelBufferOffsetSingleTexelAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan13Properties.UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT); }
    /** Unsafe version of {@link #maxBufferSize}. */
    public static long nmaxBufferSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceVulkan13Properties.MAXBUFFERSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan13Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan13Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan13Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan13Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan13Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan13Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan13Properties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan13Properties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkan13Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan13Properties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan13Properties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#minSubgroupSize} field. */
        @NativeType("uint32_t")
        public int minSubgroupSize() { return VkPhysicalDeviceVulkan13Properties.nminSubgroupSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxSubgroupSize} field. */
        @NativeType("uint32_t")
        public int maxSubgroupSize() { return VkPhysicalDeviceVulkan13Properties.nmaxSubgroupSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxComputeWorkgroupSubgroups} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkgroupSubgroups() { return VkPhysicalDeviceVulkan13Properties.nmaxComputeWorkgroupSubgroups(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#requiredSubgroupSizeStages} field. */
        @NativeType("VkShaderStageFlags")
        public int requiredSubgroupSizeStages() { return VkPhysicalDeviceVulkan13Properties.nrequiredSubgroupSizeStages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxInlineUniformBlockSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockSize() { return VkPhysicalDeviceVulkan13Properties.nmaxInlineUniformBlockSize(address()); }
        /** @return the value of the {@code maxPerStageDescriptorInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxPerStageDescriptorInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxDescriptorSetInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxDescriptorSetInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxDescriptorSetUpdateAfterBindInlineUniformBlocks} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxInlineUniformTotalSize} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformTotalSize() { return VkPhysicalDeviceVulkan13Properties.nmaxInlineUniformTotalSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProduct64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating8BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating16BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating32BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating64BitSignedAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated} field. */
        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#storageTexelBufferOffsetAlignmentBytes} field. */
        @NativeType("VkDeviceSize")
        public long storageTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceVulkan13Properties.nstorageTexelBufferOffsetAlignmentBytes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#storageTexelBufferOffsetSingleTexelAlignment} field. */
        @NativeType("VkBool32")
        public boolean storageTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceVulkan13Properties.nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#uniformTexelBufferOffsetAlignmentBytes} field. */
        @NativeType("VkDeviceSize")
        public long uniformTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceVulkan13Properties.nuniformTexelBufferOffsetAlignmentBytes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#uniformTexelBufferOffsetSingleTexelAlignment} field. */
        @NativeType("VkBool32")
        public boolean uniformTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceVulkan13Properties.nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan13Properties#maxBufferSize} field. */
        @NativeType("VkDeviceSize")
        public long maxBufferSize() { return VkPhysicalDeviceVulkan13Properties.nmaxBufferSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Properties#sType} field. */
        public VkPhysicalDeviceVulkan13Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES} value to the {@link VkPhysicalDeviceVulkan13Properties#sType} field. */
        public VkPhysicalDeviceVulkan13Properties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan13Properties#pNext} field. */
        public VkPhysicalDeviceVulkan13Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan13Properties.npNext(address(), value); return this; }

    }

}