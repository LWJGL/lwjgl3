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

/**
 * Structure specifying the parameters of a newly created pipeline layout object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code setLayoutCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxBoundDescriptorSets}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} and {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageDescriptorSamplers}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} and {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageDescriptorUniformBuffers}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageDescriptorStorageBuffers}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageDescriptorSampledImages}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageDescriptorStorageImages}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageDescriptorInputAttachments}</li>
 * <li>The total number of bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceInlineUniformBlockProperties}{@code ::maxPerStageDescriptorInlineUniformBlocks}</li>
 * <li>The total number of descriptors with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} and {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxPerStageDescriptorUpdateAfterBindSamplers}</li>
 * <li>The total number of descriptors with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} and {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxPerStageDescriptorUpdateAfterBindUniformBuffers}</li>
 * <li>The total number of descriptors with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxPerStageDescriptorUpdateAfterBindStorageBuffers}</li>
 * <li>The total number of descriptors with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxPerStageDescriptorUpdateAfterBindSampledImages}</li>
 * <li>The total number of descriptors with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxPerStageDescriptorUpdateAfterBindStorageImages}</li>
 * <li>The total number of descriptors with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxPerStageDescriptorUpdateAfterBindInputAttachments}</li>
 * <li>The total number of bindings with a {@code descriptorType} of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceInlineUniformBlockProperties}{@code ::maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} and {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetSamplers}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetUniformBuffers}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetUniformBuffersDynamic}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetStorageBuffers}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetStorageBuffersDynamic}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetSampledImages}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetStorageImages}</li>
 * <li>The total number of descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDescriptorSetInputAttachments}</li>
 * <li>The total number of bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceInlineUniformBlockProperties}{@code ::maxDescriptorSetInlineUniformBlocks}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} and {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindSamplers}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindUniformBuffers}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindUniformBuffersDynamic}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindStorageBuffers}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindStorageBuffersDynamic}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindSampledImages}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, and {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindStorageImages}</li>
 * <li>The total number of descriptors of the type {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDescriptorIndexingProperties}{@code ::maxDescriptorSetUpdateAfterBindInputAttachments}</li>
 * <li>The total number of bindings with a {@code descriptorType} of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceInlineUniformBlockProperties}{@code ::maxDescriptorSetUpdateAfterBindInlineUniformBlocks}</li>
 * <li>Any two elements of {@code pPushConstantRanges} <b>must</b> not include the same stage in {@code stageFlags}</li>
 * <li>{@code pSetLayouts} <b>must</b> not contain more than one descriptor set layout that was created with {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR} set</li>
 * <li>The total number of bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxPerStageDescriptorAccelerationStructures}</li>
 * <li>The total number of bindings with a {@code descriptorType} of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} accessible to any given shader stage across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxPerStageDescriptorUpdateAfterBindAccelerationStructures}</li>
 * <li>The total number of bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set with a {@code descriptorType} of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxDescriptorSetAccelerationStructures}</li>
 * <li>The total number of bindings with a {@code descriptorType} of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::maxDescriptorSetUpdateAfterBindAccelerationStructures}</li>
 * <li>The total number of bindings with a {@code descriptorType} of {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV} accessible across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxDescriptorSetAccelerationStructures}</li>
 * <li>The total number of {@code pImmutableSamplers} created with {@code flags} containing {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT} or {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT} across all shader stages and across all elements of {@code pSetLayouts} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxDescriptorSetSubsampledSamplers">{@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT}{@code ::maxDescriptorSetSubsampledSamplers}</a></li>
 * <li>Any element of {@code pSetLayouts} <b>must</b> not have been created with the {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE} bit set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code setLayoutCount} is not 0, {@code pSetLayouts} <b>must</b> be a valid pointer to an array of {@code setLayoutCount} valid {@code VkDescriptorSetLayout} handles</li>
 * <li>If {@code pushConstantRangeCount} is not 0, {@code pPushConstantRanges} <b>must</b> be a valid pointer to an array of {@code pushConstantRangeCount} valid {@link VkPushConstantRange} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPushConstantRange}, {@link VK10#vkCreatePipelineLayout CreatePipelineLayout}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineLayoutCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineLayoutCreateFlags {@link #flags};
 *     uint32_t {@link #setLayoutCount};
 *     VkDescriptorSetLayout const * {@link #pSetLayouts};
 *     uint32_t {@link #pushConstantRangeCount};
 *     {@link VkPushConstantRange VkPushConstantRange} const * {@link #pPushConstantRanges};
 * }</code></pre>
 */
public class VkPipelineLayoutCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SETLAYOUTCOUNT,
        PSETLAYOUTS,
        PUSHCONSTANTRANGECOUNT,
        PPUSHCONSTANTRANGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SETLAYOUTCOUNT = layout.offsetof(3);
        PSETLAYOUTS = layout.offsetof(4);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(5);
        PPUSHCONSTANTRANGES = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPipelineLayoutCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineLayoutCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineLayoutCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of descriptor sets included in the pipeline layout. */
    @NativeType("uint32_t")
    public int setLayoutCount() { return nsetLayoutCount(address()); }
    /** a pointer to an array of {@code VkDescriptorSetLayout} objects. */
    @Nullable
    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() { return npSetLayouts(address()); }
    /** the number of push constant ranges included in the pipeline layout. */
    @NativeType("uint32_t")
    public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
    /**
     * a pointer to an array of {@link VkPushConstantRange} structures defining a set of push constant ranges for use in a single pipeline layout. In addition to descriptor set layouts, a pipeline layout also describes how many push constants <b>can</b> be accessed by each stage of the pipeline.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Push constants represent a high speed path to modify constant data in pipelines that is expected to outperform memory-backed resource updates.</p>
     * </div>
     */
    @Nullable
    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineLayoutCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineLayoutCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineLayoutCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineLayoutCreateInfo flags(@NativeType("VkPipelineLayoutCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSetLayouts} field. */
    public VkPipelineLayoutCreateInfo pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { npSetLayouts(address(), value); return this; }
    /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@link #pPushConstantRanges} field. */
    public VkPipelineLayoutCreateInfo pPushConstantRanges(@Nullable @NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) { npPushConstantRanges(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineLayoutCreateInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable LongBuffer pSetLayouts,
        @Nullable VkPushConstantRange.Buffer pPushConstantRanges
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pSetLayouts(pSetLayouts);
        pPushConstantRanges(pPushConstantRanges);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineLayoutCreateInfo set(VkPipelineLayoutCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineLayoutCreateInfo malloc() {
        return wrap(VkPipelineLayoutCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineLayoutCreateInfo calloc() {
        return wrap(VkPipelineLayoutCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineLayoutCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineLayoutCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineLayoutCreateInfo} instance for the specified memory address. */
    public static VkPipelineLayoutCreateInfo create(long address) {
        return wrap(VkPipelineLayoutCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineLayoutCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineLayoutCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineLayoutCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineLayoutCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineLayoutCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineLayoutCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineLayoutCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineLayoutCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineLayoutCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineLayoutCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineLayoutCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineLayoutCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineLayoutCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineLayoutCreateInfo.FLAGS); }
    /** Unsafe version of {@link #setLayoutCount}. */
    public static int nsetLayoutCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT); }
    /** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
    @Nullable public static LongBuffer npSetLayouts(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS), nsetLayoutCount(struct)); }
    /** Unsafe version of {@link #pushConstantRangeCount}. */
    public static int npushConstantRangeCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT); }
    /** Unsafe version of {@link #pPushConstantRanges}. */
    @Nullable public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.createSafe(memGetAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineLayoutCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineLayoutCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code setLayoutCount} field of the specified {@code struct}. */
    public static void nsetLayoutCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineLayoutCreateInfo.SETLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
    public static void npSetLayouts(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS, memAddressSafe(value)); nsetLayoutCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
    public static void npushConstantRangeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineLayoutCreateInfo.PUSHCONSTANTRANGECOUNT, value); }
    /** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
    public static void npPushConstantRanges(long struct, @Nullable VkPushConstantRange.Buffer value) { memPutAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES, memAddressSafe(value)); npushConstantRangeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nsetLayoutCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineLayoutCreateInfo.PSETLAYOUTS));
        }
        if (npushConstantRangeCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineLayoutCreateInfo.PPUSHCONSTANTRANGES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineLayoutCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineLayoutCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineLayoutCreateInfo ELEMENT_FACTORY = VkPipelineLayoutCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineLayoutCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineLayoutCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineLayoutCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineLayoutCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineLayoutCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineLayoutCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineLayoutCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineLayoutCreateInfo#flags} field. */
        @NativeType("VkPipelineLayoutCreateFlags")
        public int flags() { return VkPipelineLayoutCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkPipelineLayoutCreateInfo#setLayoutCount} field. */
        @NativeType("uint32_t")
        public int setLayoutCount() { return VkPipelineLayoutCreateInfo.nsetLayoutCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkPipelineLayoutCreateInfo#pSetLayouts} field. */
        @Nullable
        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() { return VkPipelineLayoutCreateInfo.npSetLayouts(address()); }
        /** @return the value of the {@link VkPipelineLayoutCreateInfo#pushConstantRangeCount} field. */
        @NativeType("uint32_t")
        public int pushConstantRangeCount() { return VkPipelineLayoutCreateInfo.npushConstantRangeCount(address()); }
        /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@link VkPipelineLayoutCreateInfo#pPushConstantRanges} field. */
        @Nullable
        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.Buffer pPushConstantRanges() { return VkPipelineLayoutCreateInfo.npPushConstantRanges(address()); }

        /** Sets the specified value to the {@link VkPipelineLayoutCreateInfo#sType} field. */
        public VkPipelineLayoutCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineLayoutCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO} value to the {@link VkPipelineLayoutCreateInfo#sType} field. */
        public VkPipelineLayoutCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineLayoutCreateInfo#pNext} field. */
        public VkPipelineLayoutCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineLayoutCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineLayoutCreateInfo#flags} field. */
        public VkPipelineLayoutCreateInfo.Buffer flags(@NativeType("VkPipelineLayoutCreateFlags") int value) { VkPipelineLayoutCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkPipelineLayoutCreateInfo#pSetLayouts} field. */
        public VkPipelineLayoutCreateInfo.Buffer pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { VkPipelineLayoutCreateInfo.npSetLayouts(address(), value); return this; }
        /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@link VkPipelineLayoutCreateInfo#pPushConstantRanges} field. */
        public VkPipelineLayoutCreateInfo.Buffer pPushConstantRanges(@Nullable @NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) { VkPipelineLayoutCreateInfo.npPushConstantRanges(address(), value); return this; }

    }

}