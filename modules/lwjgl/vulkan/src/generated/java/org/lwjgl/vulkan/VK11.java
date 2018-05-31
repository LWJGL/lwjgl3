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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core Vulkan 1.1 functionality.
 * 
 * <p>Vulkan Version 1.1 <em>promoted</em> a number of key extensions into the core API:</p>
 * 
 * <ul>
 * <li>{@link KHR16bitStorage KHR_16bit_storage}</li>
 * <li>{@link KHRBindMemory2 KHR_bind_memory2}</li>
 * <li>{@link KHRDedicatedAllocation KHR_dedicated_allocation}</li>
 * <li>{@link KHRDescriptorUpdateTemplate KHR_descriptor_update_template}</li>
 * <li>{@link KHRDeviceGroup KHR_device_group}</li>
 * <li>{@link KHRDeviceGroupCreation KHR_device_group_creation}</li>
 * <li>{@link KHRExternalMemory KHR_external_memory}</li>
 * <li>{@link KHRExternalMemoryCapabilities KHR_external_memory_capabilities}</li>
 * <li>{@link KHRExternalSemaphore KHR_external_semaphore}</li>
 * <li>{@link KHRExternalSemaphoreCapabilities KHR_external_semaphore_capabilities}</li>
 * <li>{@link KHRExternalFence KHR_external_fence}</li>
 * <li>{@link KHRExternalFenceCapabilities KHR_external_fence_capabilities}</li>
 * <li>{@link KHRGetMemoryRequirements2 KHR_get_memory_requirements2}</li>
 * <li>{@link KHRGetPhysicalDeviceProperties2 KHR_get_physical_device_properties2}</li>
 * <li>{@link KHRMaintenance1 KHR_maintenance1}</li>
 * <li>{@link KHRMaintenance2 KHR_maintenance2}</li>
 * <li>{@link KHRMaintenance3 KHR_maintenance3}</li>
 * <li>{@link KHRMultiview KHR_multiview}</li>
 * <li>{@link KHRRelaxedBlockLayout KHR_relaxed_block_layout}</li>
 * <li>{@link KHRSamplerYcbcrConversion KHR_sampler_ycbcr_conversion}</li>
 * <li>{@link KHRShaderDrawParameters KHR_shader_draw_parameters}</li>
 * <li>{@link KHRStorageBufferStorageClass KHR_storage_buffer_storage_class}</li>
 * <li>{@link KHRVariablePointers KHR_variable_pointers}</li>
 * </ul>
 * 
 * <p>The only changes to the functionality added by these extensions were to {@code VK_KHR_shader_draw_parameters}, which had a
 * <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-features-shaderDrawParameters">feature bit</a>
 * added to determine support in the core API, and
 * <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-features-variablePointersStorageBuffer">{@code variablePointersStorageBuffer}</a>
 * from {@code VK_KHR_variable_pointers} was made optional.</p>
 * 
 * <p>Additionally, Vulkan 1.1 added support for {@link VkPhysicalDeviceSubgroupProperties subgroup operations},
 * {@link VkPhysicalDeviceProtectedMemoryFeatures protected memory}, and a new command to {@link VK11#vkEnumerateInstanceVersion enumerate the
 * instance version}.</p>
 */
public class VK11 extends VK10 {

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES = 1000094000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO = 1000157000,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO  = 1000157001;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = 0x400;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES = 1000083000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS  = 1000127000,
        VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO = 1000127001;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO             = 1000060000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO    = 1000060003,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO = 1000060004,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO               = 1000060005,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO          = 1000060006;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_DISPATCH_BASE PIPELINE_CREATE_DISPATCH_BASE}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x8,
        VK_PIPELINE_CREATE_DISPATCH_BASE                    = 0x10;

    /** Extends {@code VkDependencyFlagBits}. */
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 0x4;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO = 1000060013,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO  = 1000060014;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 0x40;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES = 1000070000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO  = 1000070001;

    /** Extends {@code VkMemoryHeapFlagBits}. */
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 0x2;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2       = 1000146000,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2        = 1000146001,
        VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 = 1000146002,
        VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2                   = 1000146003,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2      = 1000146004;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_FORMAT_PROPERTIES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2                 = 1000059000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2               = 1000059001,
        VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2                        = 1000059002,
        VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2                  = 1000059003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2        = 1000059004,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2                  = 1000059005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2        = 1000059006,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2           = 1000059007,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 = 1000059008;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = -1000069000;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_TRANSFER_SRC_BIT FORMAT_FEATURE_TRANSFER_SRC_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_TRANSFER_DST_BIT FORMAT_FEATURE_TRANSFER_DST_BIT}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 0x4000,
        VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 0x8000;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 0x20;

    /**
     * Extends {@code VkImageCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT}</li>
     * <li>{@link #VK_IMAGE_CREATE_EXTENDED_USAGE_BIT IMAGE_CREATE_EXTENDED_USAGE_BIT}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 0x80,
        VK_IMAGE_CREATE_EXTENDED_USAGE_BIT              = 0x100;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES             = 1000117000,
        VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO       = 1000117001,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO                          = 1000117002,
        VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = 1000117003;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000,
        VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO    = 1000053000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES   = 1000053001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES = 1000053002;

    /** Extends {@code VkDependencyFlagBits}. */
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 0x2;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES = 1000120000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO                       = 1000145000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES   = 1000145001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES = 1000145002,
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2                         = 1000145003;

    /** Extends {@code VkQueueFlagBits}. */
    public static final int VK_QUEUE_PROTECTED_BIT = 0x10;

    /** Extends {@code VkDeviceQueueCreateFlagBits}. */
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x1;

    /** Extends {@code VkMemoryPropertyFlagBits}. */
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 0x20;

    /** Extends {@code VkBufferCreateFlagBits}. */
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 0x8;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 0x800;

    /** Extends {@code VkCommandPoolCreateFlagBits}. */
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 0x4;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO              = 1000156000,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO                     = 1000156001,
        VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO                      = 1000156002,
        VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO              = 1000156003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES = 1000156004,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES  = 1000156005;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION = 1000156000;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_G8B8G8R8_422_UNORM FORMAT_G8B8G8R8_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_B8G8R8G8_422_UNORM FORMAT_B8G8R8G8_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM FORMAT_G8_B8_R8_3PLANE_420_UNORM}</li>
     * <li>{@link #VK_FORMAT_G8_B8R8_2PLANE_420_UNORM FORMAT_G8_B8R8_2PLANE_420_UNORM}</li>
     * <li>{@link #VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM FORMAT_G8_B8_R8_3PLANE_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_G8_B8R8_2PLANE_422_UNORM FORMAT_G8_B8R8_2PLANE_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM FORMAT_G8_B8_R8_3PLANE_444_UNORM}</li>
     * <li>{@link #VK_FORMAT_R10X6_UNORM_PACK16 FORMAT_R10X6_UNORM_PACK16}</li>
     * <li>{@link #VK_FORMAT_R10X6G10X6_UNORM_2PACK16 FORMAT_R10X6G10X6_UNORM_2PACK16}</li>
     * <li>{@link #VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16}</li>
     * <li>{@link #VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16}</li>
     * <li>{@link #VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_R12X4_UNORM_PACK16 FORMAT_R12X4_UNORM_PACK16}</li>
     * <li>{@link #VK_FORMAT_R12X4G12X4_UNORM_2PACK16 FORMAT_R12X4G12X4_UNORM_2PACK16}</li>
     * <li>{@link #VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16}</li>
     * <li>{@link #VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G16B16G16R16_422_UNORM FORMAT_G16B16G16R16_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_B16G16R16G16_422_UNORM FORMAT_B16G16R16G16_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM FORMAT_G16_B16_R16_3PLANE_420_UNORM}</li>
     * <li>{@link #VK_FORMAT_G16_B16R16_2PLANE_420_UNORM FORMAT_G16_B16R16_2PLANE_420_UNORM}</li>
     * <li>{@link #VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM FORMAT_G16_B16_R16_3PLANE_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_G16_B16R16_2PLANE_422_UNORM FORMAT_G16_B16R16_2PLANE_422_UNORM}</li>
     * <li>{@link #VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM FORMAT_G16_B16_R16_3PLANE_444_UNORM}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_G8B8G8R8_422_UNORM                         = 1000156000,
        VK_FORMAT_B8G8R8G8_422_UNORM                         = 1000156001,
        VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM                  = 1000156002,
        VK_FORMAT_G8_B8R8_2PLANE_420_UNORM                   = 1000156003,
        VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM                  = 1000156004,
        VK_FORMAT_G8_B8R8_2PLANE_422_UNORM                   = 1000156005,
        VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM                  = 1000156006,
        VK_FORMAT_R10X6_UNORM_PACK16                         = 1000156007,
        VK_FORMAT_R10X6G10X6_UNORM_2PACK16                   = 1000156008,
        VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16         = 1000156009,
        VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16     = 1000156010,
        VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16     = 1000156011,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = 1000156012,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16  = 1000156013,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = 1000156014,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16  = 1000156015,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = 1000156016,
        VK_FORMAT_R12X4_UNORM_PACK16                         = 1000156017,
        VK_FORMAT_R12X4G12X4_UNORM_2PACK16                   = 1000156018,
        VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16         = 1000156019,
        VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16     = 1000156020,
        VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16     = 1000156021,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = 1000156022,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16  = 1000156023,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = 1000156024,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16  = 1000156025,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = 1000156026,
        VK_FORMAT_G16B16G16R16_422_UNORM                     = 1000156027,
        VK_FORMAT_B16G16R16G16_422_UNORM                     = 1000156028,
        VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM               = 1000156029,
        VK_FORMAT_G16_B16R16_2PLANE_420_UNORM                = 1000156030,
        VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM               = 1000156031,
        VK_FORMAT_G16_B16R16_2PLANE_422_UNORM                = 1000156032,
        VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM               = 1000156033;

    /**
     * Extends {@code VkImageAspectFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}</li>
     * <li>{@link #VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}</li>
     * <li>{@link #VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_ASPECT_PLANE_0_BIT = 0x10,
        VK_IMAGE_ASPECT_PLANE_1_BIT = 0x20,
        VK_IMAGE_ASPECT_PLANE_2_BIT = 0x40;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 0x200;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_DISJOINT_BIT FORMAT_FEATURE_DISJOINT_BIT}</li>
     * <li>{@link #VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT                                                 = 0x20000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                            = 0x40000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT           = 0x80000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT           = 0x100000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x200000,
        VK_FORMAT_FEATURE_DISJOINT_BIT                                                                = 0x400000,
        VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT                                                  = 0x800000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO = 1000085000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO = 1000071000,
        VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES           = 1000071001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO       = 1000071002,
        VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES                 = 1000071003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES              = 1000071004;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO = 1000072000,
        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO  = 1000072001,
        VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO        = 1000072002;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO = 1000112000,
        VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES           = 1000112001;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO = 1000113000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO = 1000077000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO = 1000076000,
        VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES           = 1000076001;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES = 1000168000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT            = 1000168001;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES = 1000063000;

    /**
     * VkSubgroupFeatureFlagBits - Enum describing what subgroup operations are supported
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBGROUP_FEATURE_BASIC_BIT SUBGROUP_FEATURE_BASIC_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniform} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_VOTE_BIT SUBGROUP_FEATURE_VOTE_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformVote} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_ARITHMETIC_BIT SUBGROUP_FEATURE_ARITHMETIC_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformArithmetic} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_BALLOT_BIT SUBGROUP_FEATURE_BALLOT_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformBallot} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_SHUFFLE_BIT SUBGROUP_FEATURE_SHUFFLE_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformShuffle} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformShuffleRelative} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_CLUSTERED_BIT SUBGROUP_FEATURE_CLUSTERED_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformClustered} capability.</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_QUAD_BIT SUBGROUP_FEATURE_QUAD_BIT} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformQuad} capability.</li>
     * <li>{@link NVShaderSubgroupPartitioned#VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV SUBGROUP_FEATURE_PARTITIONED_BIT_NV} specifies the device will accept SPIR-V shader modules that contain the {@code GroupNonUniformPartitionedNV} capability.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkSubgroupFeatureFlags}</p>
     */
    public static final int
        VK_SUBGROUP_FEATURE_BASIC_BIT            = 0x1,
        VK_SUBGROUP_FEATURE_VOTE_BIT             = 0x2,
        VK_SUBGROUP_FEATURE_ARITHMETIC_BIT       = 0x4,
        VK_SUBGROUP_FEATURE_BALLOT_BIT           = 0x8,
        VK_SUBGROUP_FEATURE_SHUFFLE_BIT          = 0x10,
        VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 0x20,
        VK_SUBGROUP_FEATURE_CLUSTERED_BIT        = 0x40,
        VK_SUBGROUP_FEATURE_QUAD_BIT             = 0x80;

    /**
     * VkPeerMemoryFeatureFlagBits - Bitmask specifying supported peer memory features
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT PEER_MEMORY_FEATURE_COPY_SRC_BIT} specifies that the memory <b>can</b> be accessed as the source of a ftext:vkCmdCopyBuffer, ftext:vkCmdCopyImage, ftext:vkCmdCopyBufferToImage, or ftext:vkCmdCopyImageToBuffer command.</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_COPY_DST_BIT PEER_MEMORY_FEATURE_COPY_DST_BIT} specifies that the memory <b>can</b> be accessed as the destination of a ftext:vkCmdCopyBuffer, ftext:vkCmdCopyImage, ftext:vkCmdCopyBufferToImage, or ftext:vkCmdCopyImageToBuffer command.</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT PEER_MEMORY_FEATURE_GENERIC_SRC_BIT} specifies that the memory <b>can</b> be read as any memory access type.</li>
     * <li>{@link #VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT PEER_MEMORY_FEATURE_GENERIC_DST_BIT} specifies that the memory <b>can</b> be written as any memory access type. Shader atomics are considered to be writes.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The peer memory features of a memory heap also apply to any accesses that <b>may</b> be performed during <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a>.</p>
     * </div>
     * 
     * <p>{@link #VK_PEER_MEMORY_FEATURE_COPY_DST_BIT PEER_MEMORY_FEATURE_COPY_DST_BIT} <b>must</b> be supported for all host local heaps and for at least one device local heap.</p>
     * 
     * <p>If a device does not support a peer memory feature, it is still valid to use a resource that includes both local and peer memory bindings with the corresponding access type as long as only the local bindings are actually accessed. For example, an application doing split-frame rendering would use framebuffer attachments that include both local and peer memory bindings, but would scissor the rendering to only update local memory.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkPeerMemoryFeatureFlags}</p>
     */
    public static final int
        VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT    = 0x1,
        VK_PEER_MEMORY_FEATURE_COPY_DST_BIT    = 0x2,
        VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 0x4,
        VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 0x8;

    /**
     * VkMemoryAllocateFlagBits - Bitmask specifying flags for a device memory allocation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT MEMORY_ALLOCATE_DEVICE_MASK_BIT} specifies that memory will be allocated for the devices in {@link VkMemoryAllocateFlagsInfo}{@code ::deviceMask}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkMemoryAllocateFlags}</p>
     */
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 0x1;

    /**
     * VkPointClippingBehavior - Enum specifying the point clipping behaviour
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES} specifies that the primitive is discarded if the vertex lies outside any clip plane, including the planes bounding the view volume.</li>
     * <li>{@link #VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY} specifies that the primitive is discarded only if the vertex lies outside any user clip plane.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDevicePointClippingProperties}</p>
     */
    public static final int
        VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES       = 0,
        VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;

    /**
     * VkTessellationDomainOrigin - Enum describing tessellation domain origin
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT} specifies that the origin of the domain space is in the upper left corner, as shown in figure <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#img-tessellation-topology-ul">Domain parameterization for tessellation primitive modes (upper-left origin)</a>.</li>
     * <li>{@link #VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT} specifies that the origin of the domain space is in the lower left corner, as shown in figure <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#img-tessellation-topology-ll">Domain parameterization for tessellation primitive modes (lower-left origin)</a>.</li>
     * </ul>
     * 
     * <p>This enum affects how the {@code VertexOrderCw} and {@code VertexOrderCcw} tessellation execution modes are interpreted, since the winding is defined relative to the orientation of the domain.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineTessellationDomainOriginStateCreateInfo}</p>
     */
    public static final int
        VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0,
        VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;

    /**
     * VkSamplerYcbcrModelConversion - Color model component of a color space
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY} specifies that the input values to the conversion are unmodified.</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY} specifies no model conversion but the inputs are range expanded as for Y&#8217;C<sub>B</sub>C<sub>R</sub>.</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709} specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.709 and described in the “BT.709 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#data-format">Khronos Data Format Specification</a>.</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601} specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.601 and described in the “BT.601 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#data-format">Khronos Data Format Specification</a>.</li>
     * <li>{@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020} specifies the color model conversion from Y&#8217;C<sub>B</sub>C<sub>R</sub> to R&#8217;G&#8217;B' defined in BT.2020 and described in the “BT.2020 Y’C<sub>B</sub>C<sub>R</sub> conversion” section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#data-format">Khronos Data Format Specification</a>.</li>
     * </ul>
     * 
     * <p>In the {@code VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_*} color models, for the input to the sampler Y'C<sub>B</sub>C<sub>R</sub> range expansion and model conversion:</p>
     * 
     * <ul>
     * <li>the Y (Y' luma) channel corresponds to the G channel of an RGB image.</li>
     * <li>the CB (C<sub>B</sub> or “U” blue color difference) channel corresponds to the B channel of an RGB image.</li>
     * <li>the CR (C<sub>R</sub> or “V” red color difference) channel corresponds to the R channel of an RGB image.</li>
     * <li>the alpha channel, if present, is not modified by color model conversion.</li>
     * </ul>
     * 
     * <p>These rules reflect the mapping of channels after the channel swizzle operation (controlled by {@link VkSamplerYcbcrConversionCreateInfo}{@code ::components}).</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For example, an "{@code YUVA}" 32-bit format comprising four 8-bit channels can be implemented as {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} with a component mapping:</p>
     * 
     * <ul>
     * <li>{@code components.a} = {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}</li>
     * <li>{@code components.r} = {@link VK10#VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}</li>
     * <li>{@code components.g} = {@link VK10#VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}</li>
     * <li>{@code components.b} = {@link VK10#VK_COMPONENT_SWIZZLE_G COMPONENT_SWIZZLE_G}</li>
     * </ul>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSamplerYcbcrConversionCreateInfo}</p>
     */
    public static final int
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY   = 0,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709      = 2,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601      = 3,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020     = 4;

    /**
     * VkSamplerYcbcrRange - Range of encoded values in a color space
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SAMPLER_YCBCR_RANGE_ITU_FULL SAMPLER_YCBCR_RANGE_ITU_FULL} specifies that the full range of the encoded values are valid and interpreted according to the ITU “full range” quantization rules.</li>
     * <li>{@link #VK_SAMPLER_YCBCR_RANGE_ITU_NARROW SAMPLER_YCBCR_RANGE_ITU_NARROW} specifies that headroom and foot room are reserved in the numerical range of encoded values, and the remaining values are expanded according to the ITU “narrow range” quantization rules.</li>
     * </ul>
     * 
     * <p>The formulae for these conversions is described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-sampler-YCbCr-conversion-rangeexpand">Sampler Y'C<sub>B</sub>C<sub>R</sub> Range Expansion</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures">Image Operations</a> chapter.</p>
     * 
     * <p>No range modification takes place if {@code ycbcrModel} is {@link #VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY}; the {@code ycbcrRange} field of {@link VkSamplerYcbcrConversionCreateInfo} is ignored in this case.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSamplerYcbcrConversionCreateInfo}</p>
     */
    public static final int
        VK_SAMPLER_YCBCR_RANGE_ITU_FULL   = 0,
        VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;

    /**
     * VkChromaLocation - Position of downsampled chroma samples
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_CHROMA_LOCATION_COSITED_EVEN CHROMA_LOCATION_COSITED_EVEN} specifies that downsampled chroma samples are aligned with luma samples with even coordinates.</li>
     * <li>{@link #VK_CHROMA_LOCATION_MIDPOINT CHROMA_LOCATION_MIDPOINT} specifies that downsampled chroma samples are located half way between each even luma sample and the nearest higher odd luma sample.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSamplerYcbcrConversionCreateInfo}</p>
     */
    public static final int
        VK_CHROMA_LOCATION_COSITED_EVEN = 0,
        VK_CHROMA_LOCATION_MIDPOINT     = 1;

    /**
     * VkDescriptorUpdateTemplateType - Indicates the valid usage of the descriptor update template
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET} specifies that the descriptor update template will be used for descriptor set updates only.</li>
     * <li>{@link KHRPushDescriptor#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR} specifies that the descriptor update template will be used for push descriptor updates only.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDescriptorUpdateTemplateCreateInfo}</p>
     */
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;

    /**
     * VkExternalMemoryHandleTypeFlagBits - Bit specifying external memory handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT} specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls ftext:dup, ftext:dup2, ftext:close, and the non-standard system call ftext:dup3. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT} specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions ftext:DuplicateHandle, ftext:CloseHandle, ftext:CompareObjectHandles, ftext:GetHandleInformation, and ftext:SetHandleInformation. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT} specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying memory resource represented its Vulkan memory object, and will therefore become invalid when all Vulkan memory objects associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT} specifies an NT handle returned by {@code IDXGIResource1}::{@code CreateSharedHandle} referring to a Direct3D 10 or 11 texture resource. It owns a reference to the memory used by the Direct3D resource.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT} specifies a global share handle returned by {@code IDXGIResource}::{@code GetSharedHandle} referring to a Direct3D 10 or 11 texture resource. It does not own a reference to the underlying Direct3D resource, and will therefore become invalid when all Vulkan memory objects and Direct3D resources associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT} specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 heap resource. It owns a reference to the resources used by the Direct3D heap.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT} specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 committed resource. It owns a reference to the memory used by the Direct3D resource.</li>
     * <li>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT} specifies a host pointer returned by a host memory allocation command. It does not own a reference to the underlying memory resource, and will therefore become invalid if the host memory is freed.</li>
     * <li>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT} specifies a host pointer to <em>host mapped foreign memory</em>. It does not own a reference to the underlying memory resource, and will therefore become invalid if the foreign memory is unmapped or otherwise becomes no longer available.</li>
     * <li>{@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT} is a file descriptor for a Linux dma_buf. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
     * </ul>
     * 
     * <p>Some external memory handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:</p>
     * 
     * <h6>External memory handle types compatibility</h6>
     * 
     * <table class="lwjgl">
     * <tbody>
     * <tr><td>Handle type</td><td>{@link VkPhysicalDeviceIDProperties}{@code ::driverUUID}</td><td>{@link VkPhysicalDeviceIDProperties}{@code ::deviceUUID}</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT}</td><td>No restriction</td><td>No restriction</td></tr>
     * <tr><td>{@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT}</td><td>No restriction</td><td>No restriction</td></tr>
     * <tr><td>{@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT}</td><td>No restriction</td><td>No restriction</td></tr>
     * </tbody>
     * </table>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The above table does not restrict the drivers and devices with which {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT} and {@link EXTExternalMemoryHost#VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT} <b>may</b> be shared, as these handle types inherently mean memory that does not come from the same device, as they import memory from the host or a foreign device, respectively.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Even though the above table does not restrict the drivers and devices with which {@link EXTExternalMemoryDmaBuf#VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT} <b>may</b> be shared, query mechanisms exist in the Vulkan API that prevent the import of incompatible dma-bufs (such as {@link KHRExternalMemoryFd#vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR}) and that prevent incompatible usage of dma-bufs (such as {@link VkPhysicalDeviceExternalBufferInfoKHR} and {@link VkPhysicalDeviceExternalImageFormatInfoKHR}).</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalMemoryHandleTypeFlags}, {@link VkImportMemoryFdInfoKHR}, {@link VkImportMemoryHostPointerInfoEXT}, {@link VkImportMemoryWin32HandleInfoKHR}, {@link VkMemoryGetFdInfoKHR}, {@link VkMemoryGetWin32HandleInfoKHR}, {@link VkPhysicalDeviceExternalBufferInfo}, {@link VkPhysicalDeviceExternalImageFormatInfo}, {@link KHRExternalMemoryFd#vkGetMemoryFdPropertiesKHR GetMemoryFdPropertiesKHR}, {@link EXTExternalMemoryHost#vkGetMemoryHostPointerPropertiesEXT GetMemoryHostPointerPropertiesEXT}, {@link KHRExternalMemoryWin32#vkGetMemoryWin32HandlePropertiesKHR GetMemoryWin32HandlePropertiesKHR}</p>
     */
    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT         = 0x1,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT      = 0x2,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT  = 0x4,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT     = 0x8,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = 0x10,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT        = 0x20,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT    = 0x40;

    /**
     * VkExternalMemoryFeatureFlagBits - Bitmask specifying features of an external memory handle type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT} specifies that images or buffers created with the specified parameters and handle type <b>must</b> use the mechanisms defined in the {@link NVDedicatedAllocation VK_NV_dedicated_allocation} extension to create (or import) a dedicated allocation for the image or buffer.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT} specifies that handles of this type <b>can</b> be exported from Vulkan memory objects.</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT} specifies that handles of this type <b>can</b> be imported as Vulkan memory objects.</li>
     * </ul>
     * 
     * <p>Because their semantics in external APIs roughly align with that of an image or buffer with a dedicated allocation in Vulkan, implementations are required: to report {@link #VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT} for the following external handle types:</p>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT}</li>
     * <li>{@link #VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalMemoryFeatureFlags}</p>
     */
    public static final int
        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 0x1,
        VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT     = 0x2,
        VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT     = 0x4;

    /**
     * VkExternalFenceHandleTypeFlagBits - Bitmask of valid external fence handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT} specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan fence object.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT} specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan fence object.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT} specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented by its Vulkan fence object, and will therefore become invalid when all Vulkan fence objects associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT} specifies a POSIX file descriptor handle to a Linux Sync File or Android Fence. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
     * </ul>
     * 
     * <p>Some external fence handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:</p>
     * 
     * <h6>External fence handle types compatibility</h6>
     * 
     * <table class="lwjgl">
     * <tbody>
     * <tr><td>Handle type</td><td>{@link VkPhysicalDeviceIDProperties}{@code ::driverUUID}</td><td>{@link VkPhysicalDeviceIDProperties}{@code ::deviceUUID}</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT}</td><td>No restriction</td><td>No restriction</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalFenceHandleTypeFlags}, {@link VkFenceGetFdInfoKHR}, {@link VkFenceGetWin32HandleInfoKHR}, {@link VkImportFenceFdInfoKHR}, {@link VkImportFenceWin32HandleInfoKHR}, {@link VkPhysicalDeviceExternalFenceInfo}</p>
     */
    public static final int
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT        = 0x1,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT     = 0x2,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x4,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT          = 0x8;

    /**
     * VkExternalFenceFeatureFlagBits - Bitfield describing features of an external fence handle type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT} specifies handles of this type <b>can</b> be exported from Vulkan fence objects.</li>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT} specifies handles of this type <b>can</b> be imported to Vulkan fence objects.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalFenceFeatureFlags}</p>
     */
    public static final int
        VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 0x1,
        VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 0x2;

    /**
     * VkFenceImportFlagBits - Bitmask specifying additional parameters of fence payload import
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_FENCE_IMPORT_TEMPORARY_BIT FENCE_IMPORT_TEMPORARY_BIT} specifies that the fence payload will be imported only temporarily, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-fences-importing">Importing Fence Payloads</a>, regardless of the permanence of {@code handleType}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkFenceImportFlags}</p>
     */
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 0x1;

    /**
     * VkSemaphoreImportFlagBits - Bitmask specifying additional parameters of semaphore payload import
     * 
     * <h5>Description</h5>
     * 
     * <p>These bits have the following meanings:</p>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_IMPORT_TEMPORARY_BIT SEMAPHORE_IMPORT_TEMPORARY_BIT} specifies that the semaphore payload will be imported only temporarily, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-importing">Importing Semaphore Payloads</a>, regardless of the permanence of {@code handleType}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkSemaphoreImportFlags}</p>
     */
    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 0x1;

    /**
     * VkExternalSemaphoreHandleTypeFlagBits - Bitmask of valid external semaphore handle types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT} specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT} specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT} specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented its Vulkan semaphore object, and will therefore become invalid when all Vulkan semaphore objects associated with it are destroyed.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT} specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 fence. It owns a reference to the underlying synchronization primitive associated with the Direct3D fence.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT} specifies a POSIX file descriptor handle to a Linux Sync File or Android Fence object. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Handles of type {@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT} generated by the implementation may represent either Linux Sync Files or Android Fences at the implementation's discretion. Applications <b>should</b> only use operations defined for both types of file descriptors, unless they know via means external to Vulkan the type of the file descriptor, or are prepared to deal with the system-defined operation failures resulting from using the wrong type.</p>
     * </div>
     * 
     * <p>Some external semaphore handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:</p>
     * 
     * <h6>External semaphore handle types compatibility</h6>
     * 
     * <table class="lwjgl">
     * <tbody>
     * <tr><td>Handle type</td><td>{@link VkPhysicalDeviceIDProperties}{@code ::driverUUID}</td><td>{@link VkPhysicalDeviceIDProperties}{@code ::deviceUUID}</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT}</td><td>Must match</td><td>Must match</td></tr>
     * <tr><td>{@link #VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT}</td><td>No restriction</td><td>No restriction</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalSemaphoreHandleTypeFlags}, {@link VkImportSemaphoreFdInfoKHR}, {@link VkImportSemaphoreWin32HandleInfoKHR}, {@link VkPhysicalDeviceExternalSemaphoreInfo}, {@link VkSemaphoreGetFdInfoKHR}, {@link VkSemaphoreGetWin32HandleInfoKHR}</p>
     */
    public static final int
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT        = 0x1,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT     = 0x2,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x4,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT      = 0x8,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT          = 0x10;

    /**
     * VkExternalSemaphoreFeatureFlagBits - Bitfield describing features of an external semaphore handle type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT} specifies that handles of this type <b>can</b> be exported from Vulkan semaphore objects.</li>
     * <li>{@link #VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT} specifies that handles of this type <b>can</b> be imported as Vulkan semaphore objects.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkExternalSemaphoreFeatureFlags}</p>
     */
    public static final int
        VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = 0x1,
        VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = 0x2;

    /** The API version number for Vulkan 1.1. */
    public static final int VK_API_VERSION_1_1 = VK10.VK_MAKE_VERSION(1, 1, 0);

    /** API Constants */
    public static final int
        VK_LUID_SIZE             = 8,
        VK_QUEUE_FAMILY_EXTERNAL = (~0-1),
        VK_MAX_DEVICE_GROUP_SIZE = 32;

    protected VK11() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsInstance(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("Vulkan11") && VK.checkExtension("Vulkan11",
               VK.isSupported(provider, "vkEnumeratePhysicalDeviceGroups", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFeatures2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceFormatProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceImageFormatProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceQueueFamilyProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceMemoryProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceSparseImageFormatProperties2", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalBufferProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalFenceProperties", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceExternalSemaphoreProperties", caps)
        );
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("Vulkan11") && VK.checkExtension("Vulkan11",
               VK.isSupported(provider, "vkBindBufferMemory2", caps)
            && VK.isSupported(provider, "vkBindImageMemory2", caps)
            && VK.isSupported(provider, "vkGetDeviceGroupPeerMemoryFeatures", caps)
            && VK.isSupported(provider, "vkCmdSetDeviceMask", caps)
            && VK.isSupported(provider, "vkCmdDispatchBase", caps)
            && VK.isSupported(provider, "vkGetImageMemoryRequirements2", caps)
            && VK.isSupported(provider, "vkGetBufferMemoryRequirements2", caps)
            && VK.isSupported(provider, "vkGetImageSparseMemoryRequirements2", caps)
            && VK.isSupported(provider, "vkTrimCommandPool", caps)
            && VK.isSupported(provider, "vkGetDeviceQueue2", caps)
            && VK.isSupported(provider, "vkCreateSamplerYcbcrConversion", caps)
            && VK.isSupported(provider, "vkDestroySamplerYcbcrConversion", caps)
            && VK.isSupported(provider, "vkCreateDescriptorUpdateTemplate", caps)
            && VK.isSupported(provider, "vkDestroyDescriptorUpdateTemplate", caps)
            && VK.isSupported(provider, "vkUpdateDescriptorSetWithTemplate", caps)
            && VK.isSupported(provider, "vkGetDescriptorSetLayoutSupport", caps)
        );
    }

    // --- [ vkEnumerateInstanceVersion ] ---

    /** Unsafe version of: {@link #vkEnumerateInstanceVersion EnumerateInstanceVersion} */
    public static int nvkEnumerateInstanceVersion(long pApiVersion) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, pApiVersion);
    }

    /**
     * Query instance-level version before instance creation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The version of Vulkan that is supported by an instance <b>may</b> be different than the version of Vulkan supported by a device or physical device. To query properties that <b>can</b> be used in creating an instance, call:</p>
     * 
     * <pre><code>
     * VkResult vkEnumerateInstanceVersion(
     *     uint32_t*                                   pApiVersion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code pApiVersion} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * </dl>
     *
     * @param pApiVersion points to a {@code uint32_t}, which is the version of Vulkan supported by instance-level functionality, encoded as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#fundamentals-versionnum">API Version Numbers and Semantics</a> section.
     */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@NativeType("uint32_t *") IntBuffer pApiVersion) {
        if (CHECKS) {
            check(pApiVersion, 1);
        }
        return nvkEnumerateInstanceVersion(memAddress(pApiVersion));
    }

    // --- [ vkBindBufferMemory2 ] ---

    /**
     * Unsafe version of: {@link #vkBindBufferMemory2 BindBufferMemory2}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindBufferMemory2(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * Bind device memory to buffer objects.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to buffer objects for one or more buffers at a time, call:</p>
     * 
     * <pre><code>
     * VkResult vkBindBufferMemory2(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindBufferMemoryInfo*               pBindInfos);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkBindBufferMemory2KHR(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindBufferMemoryInfo*               pBindInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid {@link VkBindBufferMemoryInfo} structures</li>
     * <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindBufferMemoryInfo}</p>
     *
     * @param device     the logical device that owns the buffers and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindBufferMemoryInfo}, describing buffers and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindBufferMemory2(VkDevice device, @NativeType("VkBindBufferMemoryInfo const *") VkBindBufferMemoryInfo.Buffer pBindInfos) {
        return nvkBindBufferMemory2(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkBindImageMemory2 ] ---

    /**
     * Unsafe version of: {@link #vkBindImageMemory2 BindImageMemory2}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindImageMemory2(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * Bind device memory to image objects.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to image objects for one or more images at a time, call:</p>
     * 
     * <pre><code>
     * VkResult vkBindImageMemory2(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindImageMemoryInfo*                pBindInfos);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkBindImageMemory2KHR(
     *     VkDevice                                    device,
     *     uint32_t                                    bindInfoCount,
     *     const VkBindImageMemoryInfo*                pBindInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>On some implementations, it <b>may</b> be more efficient to batch memory bindings into a single command.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pBindInfos} <b>must</b> be a valid pointer to an array of {@code bindInfoCount} valid {@link VkBindImageMemoryInfo} structures</li>
     * <li>{@code bindInfoCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindImageMemoryInfo}</p>
     *
     * @param device     the logical device that owns the images and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindImageMemoryInfo}, describing images and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindImageMemory2(VkDevice device, @NativeType("VkBindImageMemoryInfo const *") VkBindImageMemoryInfo.Buffer pBindInfos) {
        return nvkBindImageMemory2(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkGetDeviceGroupPeerMemoryFeatures ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupPeerMemoryFeatures GetDeviceGroupPeerMemoryFeatures} */
    public static void nvkGetDeviceGroupPeerMemoryFeatures(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeatures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }

    /**
     * Query supported peer memory features of a device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p><em>Peer memory</em> is memory that is allocated for a given physical device and then bound to a resource and accessed by a different physical device, in a logical device that represents multiple physical devices. Some ways of reading and writing peer memory <b>may</b> not be supported by a device.</p>
     * 
     * <p>To determine how peer memory <b>can</b> be accessed, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceGroupPeerMemoryFeatures(
     *     VkDevice                                    device,
     *     uint32_t                                    heapIndex,
     *     uint32_t                                    localDeviceIndex,
     *     uint32_t                                    remoteDeviceIndex,
     *     VkPeerMemoryFeatureFlags*                   pPeerMemoryFeatures);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetDeviceGroupPeerMemoryFeaturesKHR(
     *     VkDevice                                    device,
     *     uint32_t                                    heapIndex,
     *     uint32_t                                    localDeviceIndex,
     *     uint32_t                                    remoteDeviceIndex,
     *     VkPeerMemoryFeatureFlags*                   pPeerMemoryFeatures);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code heapIndex} <b>must</b> be less than {@code memoryHeapCount}</li>
     * <li>{@code localDeviceIndex} <b>must</b> be a valid device index</li>
     * <li>{@code remoteDeviceIndex} <b>must</b> be a valid device index</li>
     * <li>{@code localDeviceIndex} <b>must</b> not equal remoteDeviceIndex</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pPeerMemoryFeatures} <b>must</b> be a valid pointer to a {@code VkPeerMemoryFeatureFlags} value</li>
     * <li>{@code pPeerMemoryFeatures} <b>must</b> not be 0</li>
     * </ul>
     *
     * @param device              the logical device that owns the memory.
     * @param heapIndex           the index of the memory heap from which the memory is allocated.
     * @param localDeviceIndex    the device index of the physical device that performs the memory access.
     * @param remoteDeviceIndex   the device index of the physical device that the memory is allocated for.
     * @param pPeerMemoryFeatures a pointer to a bitmask of {@code VkPeerMemoryFeatureFlagBits} indicating which types of memory accesses are supported for the combination of heap, local, and remote devices.
     */
    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") IntBuffer pPeerMemoryFeatures) {
        if (CHECKS) {
            check(pPeerMemoryFeatures, 1);
        }
        nvkGetDeviceGroupPeerMemoryFeatures(device, heapIndex, localDeviceIndex, remoteDeviceIndex, memAddress(pPeerMemoryFeatures));
    }

    // --- [ vkCmdSetDeviceMask ] ---

    /**
     * Modify device mask of a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To update the current device mask of a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDeviceMask(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    deviceMask);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetDeviceMaskKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    deviceMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code deviceMask} is used to filter out subsequent commands from executing on all physical devices whose bit indices are not set in the mask.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
     * <li>{@code deviceMask} <b>must</b> not be zero</li>
     * <li>{@code deviceMask} <b>must</b> not include any set bits that were not in the {@link VkDeviceGroupCommandBufferBeginInfo}{@code ::deviceMask} value when the command buffer began recording.</li>
     * <li>If {@link #vkCmdSetDeviceMask CmdSetDeviceMask} is called inside a render pass instance, {@code deviceMask} <b>must</b> not include any set bits that were not in the {@link VkDeviceGroupRenderPassBeginInfo}{@code ::deviceMask} value when the render pass instance began recording.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer command buffer whose current device mask is modified.
     * @param deviceMask    the new value of the current device mask.
     */
    public static void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int deviceMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDeviceMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, commandBuffer.address(), deviceMask);
    }

    // --- [ vkCmdDispatchBase ] ---

    /**
     * Dispatch compute work items.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a dispatch using non-zero base values for the components of {@code WorkgroupId}, call:</p>
     * 
     * <pre><code>
     * void vkCmdDispatchBase(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    baseGroupX,
     *     uint32_t                                    baseGroupY,
     *     uint32_t                                    baseGroupZ,
     *     uint32_t                                    groupCountX,
     *     uint32_t                                    groupCountY,
     *     uint32_t                                    groupCountZ);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdDispatchBaseKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    baseGroupX,
     *     uint32_t                                    baseGroupY,
     *     uint32_t                                    baseGroupZ,
     *     uint32_t                                    groupCountX,
     *     uint32_t                                    groupCountY,
     *     uint32_t                                    groupCountZ);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, a global workgroup consisting of <code>groupCountX × groupCountY × groupCountZ</code> local workgroups is assembled, with {@code WorkgroupId} values ranging from <code>[baseGroup, baseGroup + groupCount)</code> in each component. {@link VK10#vkCmdDispatch CmdDispatch} is equivalent to vkCmdDispatchBase(0,0,0,groupCountX,groupCountY,groupCountZ).</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All valid usage rules from {@link VK10#vkCmdDispatch CmdDispatch} apply</li>
     * <li>{@code baseGroupX} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
     * <li>{@code baseGroupX} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
     * <li>{@code baseGroupZ} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
     * <li>{@code groupCountX} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0] minus {@code baseGroupX}</li>
     * <li>{@code groupCountY} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1] minus {@code baseGroupY}</li>
     * <li>{@code groupCountZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2] minus {@code baseGroupZ}</li>
     * <li>If any of {@code baseGroupX}, {@code baseGroupY}, or {@code baseGroupZ} are not zero, then the bound compute pipeline <b>must</b> have been created with the {@link #VK_PIPELINE_CREATE_DISPATCH_BASE PIPELINE_CREATE_DISPATCH_BASE} flag.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Compute</td><td></td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param baseGroupX    the start value for the X component of {@code WorkgroupId}.
     * @param baseGroupY    the start value for the Y component of {@code WorkgroupId}.
     * @param baseGroupZ    the start value for the Z component of {@code WorkgroupId}.
     * @param groupCountX   the number of local workgroups to dispatch in the X dimension.
     * @param groupCountY   the number of local workgroups to dispatch in the Y dimension.
     * @param groupCountZ   the number of local workgroups to dispatch in the Z dimension.
     */
    public static void vkCmdDispatchBase(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int baseGroupX, @NativeType("uint32_t") int baseGroupY, @NativeType("uint32_t") int baseGroupZ, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, commandBuffer.address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ);
    }

    // --- [ vkEnumeratePhysicalDeviceGroups ] ---

    /**
     * Unsafe version of: {@link #vkEnumeratePhysicalDeviceGroups EnumeratePhysicalDeviceGroups}
     *
     * @param pPhysicalDeviceGroupCount a pointer to an integer related to the number of device groups available or queried, as described below.
     */
    public static int nvkEnumeratePhysicalDeviceGroups(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroups;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
    }

    /**
     * Enumerates groups of physical devices that can be used to create a single logical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To retrieve a list of the device groups present in the system, call:</p>
     * 
     * <pre><code>
     * VkResult vkEnumeratePhysicalDeviceGroups(
     *     VkInstance                                  instance,
     *     uint32_t*                                   pPhysicalDeviceGroupCount,
     *     VkPhysicalDeviceGroupProperties*            pPhysicalDeviceGroupProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkEnumeratePhysicalDeviceGroupsKHR(
     *     VkInstance                                  instance,
     *     uint32_t*                                   pPhysicalDeviceGroupCount,
     *     VkPhysicalDeviceGroupProperties*            pPhysicalDeviceGroupProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pPhysicalDeviceGroupProperties} is {@code NULL}, then the number of device groups available is returned in {@code pPhysicalDeviceGroupCount}. Otherwise, {@code pPhysicalDeviceGroupCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDeviceGroupProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pPhysicalDeviceGroupProperties}. If {@code pPhysicalDeviceGroupCount} is less than the number of device groups available, at most {@code pPhysicalDeviceGroupCount} structures will be written. If {@code pPhysicalDeviceGroupCount} is smaller than the number of device groups available, {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available device groups were returned.</p>
     * 
     * <p>Every physical device <b>must</b> be in exactly one device group.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pPhysicalDeviceGroupCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPhysicalDeviceGroupCount} is not 0, and {@code pPhysicalDeviceGroupProperties} is not {@code NULL}, {@code pPhysicalDeviceGroupProperties} <b>must</b> be a valid pointer to an array of {@code pPhysicalDeviceGroupCount} {@link VkPhysicalDeviceGroupProperties} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceGroupProperties}</p>
     *
     * @param instance                       a handle to a Vulkan instance previously created with {@link VK10#vkCreateInstance CreateInstance}.
     * @param pPhysicalDeviceGroupCount      a pointer to an integer related to the number of device groups available or queried, as described below.
     * @param pPhysicalDeviceGroupProperties either {@code NULL} or a pointer to an array of {@link VkPhysicalDeviceGroupProperties} structures.
     */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceGroupCount, @Nullable @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        if (CHECKS) {
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroups(instance, memAddress(pPhysicalDeviceGroupCount), memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    // --- [ vkGetImageMemoryRequirements2 ] ---

    /** Unsafe version of: {@link #vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} */
    public static void nvkGetImageMemoryRequirements2(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pInfo, pMemoryRequirements);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for an image resource, call:</p>
     * 
     * <pre><code>
     * void vkGetImageMemoryRequirements2(
     *     VkDevice                                    device,
     *     const VkImageMemoryRequirementsInfo2*       pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetImageMemoryRequirements2KHR(
     *     VkDevice                                    device,
     *     const VkImageMemoryRequirementsInfo2*       pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkImageMemoryRequirementsInfo2} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageMemoryRequirementsInfo2}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device that owns the image.
     * @param pInfo               a pointer to an instance of the {@link VkImageMemoryRequirementsInfo2} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements2} structure in which the memory requirements of the image object are returned.
     */
    public static void vkGetImageMemoryRequirements2(VkDevice device, @NativeType("VkImageMemoryRequirementsInfo2 const *") VkImageMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetImageMemoryRequirements2(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetBufferMemoryRequirements2 ] ---

    /** Unsafe version of: {@link #vkGetBufferMemoryRequirements2 GetBufferMemoryRequirements2} */
    public static void nvkGetBufferMemoryRequirements2(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pInfo, pMemoryRequirements);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for a buffer resource, call:</p>
     * 
     * <pre><code>
     * void vkGetBufferMemoryRequirements2(
     *     VkDevice                                    device,
     *     const VkBufferMemoryRequirementsInfo2*      pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetBufferMemoryRequirements2KHR(
     *     VkDevice                                    device,
     *     const VkBufferMemoryRequirementsInfo2*      pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferMemoryRequirementsInfo2} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferMemoryRequirementsInfo2}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device that owns the buffer.
     * @param pInfo               a pointer to an instance of the {@link VkBufferMemoryRequirementsInfo2} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements points to an instance of the {@link VkMemoryRequirements2} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetBufferMemoryRequirements2(VkDevice device, @NativeType("VkBufferMemoryRequirementsInfo2 const *") VkBufferMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetBufferMemoryRequirements2(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetImageSparseMemoryRequirements2 ] ---

    /**
     * Unsafe version of: {@link #vkGetImageSparseMemoryRequirements2 GetImageSparseMemoryRequirements2}
     *
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     */
    public static void nvkGetImageSparseMemoryRequirements2(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(__functionAddress, device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements);
    }

    /**
     * Query the memory requirements for a sparse image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query sparse memory requirements for an image, call:</p>
     * 
     * <pre><code>
     * void vkGetImageSparseMemoryRequirements2(
     *     VkDevice                                    device,
     *     const VkImageSparseMemoryRequirementsInfo2* pInfo,
     *     uint32_t*                                   pSparseMemoryRequirementCount,
     *     VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetImageSparseMemoryRequirements2KHR(
     *     VkDevice                                    device,
     *     const VkImageSparseMemoryRequirementsInfo2* pInfo,
     *     uint32_t*                                   pSparseMemoryRequirementCount,
     *     VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkImageSparseMemoryRequirementsInfo2} structure</li>
     * <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} {@link VkSparseImageMemoryRequirements2} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageSparseMemoryRequirementsInfo2}, {@link VkSparseImageMemoryRequirements2}</p>
     *
     * @param device                        the logical device that owns the image.
     * @param pInfo                         a pointer to an instance of the {@link VkImageSparseMemoryRequirementsInfo2} structure containing parameters required for the memory requirements query.
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements2} structures.
     */
    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements2(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    // --- [ vkGetPhysicalDeviceFeatures2 ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2} */
    public static void nvkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, physicalDevice.address(), pFeatures);
    }

    /**
     * Reports capabilities of a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query supported features defined by the core or extensions, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceFeatures2(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceFeatures2*                  pFeatures);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceFeatures2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceFeatures2*                  pFeatures);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each structure in {@code pFeatures} and its {@code pNext} chain contain members corresponding to fine-grained features. {@link #vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2} writes each member to a boolean value indicating whether that feature is supported.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pFeatures} <b>must</b> be a valid pointer to a {@link VkPhysicalDeviceFeatures2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceFeatures2}</p>
     *
     * @param physicalDevice the physical device from which to query the supported features.
     * @param pFeatures      a pointer to a {@link VkPhysicalDeviceFeatures2} structure in which the physical device features are returned.
     */
    public static void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures2 *") VkPhysicalDeviceFeatures2 pFeatures) {
        nvkGetPhysicalDeviceFeatures2(physicalDevice, pFeatures.address());
    }

    // --- [ vkGetPhysicalDeviceProperties2 ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2} */
    public static void nvkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, physicalDevice.address(), pProperties);
    }

    /**
     * Returns properties of a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query general properties of physical devices once enumerated, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceProperties2(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceProperties2*                pProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceProperties2*                pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each structure in {@code pProperties} and its {@code pNext} chain contain members corresponding to properties or implementation-dependent limits. {@link #vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2} writes each member to a value indicating the value of that property or limit.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pProperties} <b>must</b> be a valid pointer to a {@link VkPhysicalDeviceProperties2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceProperties2}</p>
     *
     * @param physicalDevice the handle to the physical device whose properties will be queried.
     * @param pProperties    points to an instance of the {@link VkPhysicalDeviceProperties2} structure, that will be filled with returned information.
     */
    public static void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties2 *") VkPhysicalDeviceProperties2 pProperties) {
        nvkGetPhysicalDeviceProperties2(physicalDevice, pProperties.address());
    }

    // --- [ vkGetPhysicalDeviceFormatProperties2 ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} */
    public static void nvkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, physicalDevice.address(), format, pFormatProperties);
    }

    /**
     * Lists physical device's format capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query supported format features which are properties of the physical device, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceFormatProperties2(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkFormat                                    format,
     *     VkFormatProperties2*                        pFormatProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceFormatProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkFormat                                    format,
     *     VkFormatProperties2*                        pFormatProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} behaves similarly to {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
     * <li>{@code pFormatProperties} <b>must</b> be a valid pointer to a {@link VkFormatProperties2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkFormatProperties2}</p>
     *
     * @param physicalDevice    the physical device from which to query the format properties.
     * @param format            the format whose properties are queried.
     * @param pFormatProperties a pointer to a {@link VkFormatProperties2} structure in which physical device properties for {@code format} are returned.
     */
    public static void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties2 *") VkFormatProperties2 pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties2(physicalDevice, format, pFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceImageFormatProperties2 ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} */
    public static int nvkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, long pImageFormatInfo, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, physicalDevice.address(), pImageFormatInfo, pImageFormatProperties);
    }

    /**
     * Lists physical device's image format capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query additional capabilities specific to image types, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceImageFormatProperties2(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceImageFormatInfo2*     pImageFormatInfo,
     *     VkImageFormatProperties2*                   pImageFormatProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceImageFormatInfo2*     pImageFormatInfo,
     *     VkImageFormatProperties2*                   pImageFormatProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} behaves similarly to {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pImageFormatInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceImageFormatInfo2} structure</li>
     * <li>{@code pImageFormatProperties} <b>must</b> be a valid pointer to a {@link VkImageFormatProperties2} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageFormatProperties2}, {@link VkPhysicalDeviceImageFormatInfo2}</p>
     *
     * @param physicalDevice         the physical device from which to query the image capabilities.
     * @param pImageFormatInfo       points to an instance of the {@link VkPhysicalDeviceImageFormatInfo2} structure, describing the parameters that would be consumed by {@link VK10#vkCreateImage CreateImage}.
     * @param pImageFormatProperties points to an instance of the {@link VkImageFormatProperties2} structure in which capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceImageFormatInfo2 const *") VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, @NativeType("VkImageFormatProperties2 *") VkImageFormatProperties2 pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties2(physicalDevice, pImageFormatInfo.address(), pImageFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyProperties2 ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2}
     *
     * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}.
     */
    public static void nvkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties);
    }

    /**
     * Reports properties of the queues of the specified physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query properties of queues available on a physical device, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceQueueFamilyProperties2(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pQueueFamilyPropertyCount,
     *     VkQueueFamilyProperties2*                   pQueueFamilyProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceQueueFamilyProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pQueueFamilyPropertyCount,
     *     VkQueueFamilyProperties2*                   pQueueFamilyProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} behaves similarly to {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pQueueFamilyPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not {@code NULL}, {@code pQueueFamilyProperties} <b>must</b> be a valid pointer to an array of {@code pQueueFamilyPropertyCount} {@link VkQueueFamilyProperties2} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkQueueFamilyProperties2}</p>
     *
     * @param physicalDevice            the handle to the physical device whose properties will be queried.
     * @param pQueueFamilyPropertyCount a pointer to an integer related to the number of queue families available or queried, as described in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}.
     * @param pQueueFamilyProperties    either {@code NULL} or a pointer to an array of {@link VkQueueFamilyProperties2} structures.
     */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @Nullable @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.Buffer pQueueFamilyProperties) {
        if (CHECKS) {
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
    }

    // --- [ vkGetPhysicalDeviceMemoryProperties2 ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceMemoryProperties2 GetPhysicalDeviceMemoryProperties2} */
    public static void nvkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, physicalDevice.address(), pMemoryProperties);
    }

    /**
     * Reports memory information for the specified physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query memory properties, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceMemoryProperties2(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceMemoryProperties2*          pMemoryProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceMemoryProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceMemoryProperties2*          pMemoryProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceMemoryProperties2 GetPhysicalDeviceMemoryProperties2} behaves similarly to {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties}, with the ability to return extended information in a {@code pNext} chain of output structures.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pMemoryProperties} <b>must</b> be a valid pointer to a {@link VkPhysicalDeviceMemoryProperties2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceMemoryProperties2}</p>
     *
     * @param physicalDevice    the handle to the device to query.
     * @param pMemoryProperties points to an instance of {@link VkPhysicalDeviceMemoryProperties2} structure in which the properties are returned.
     */
    public static void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties2 *") VkPhysicalDeviceMemoryProperties2 pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties2(physicalDevice, pMemoryProperties.address());
    }

    // --- [ vkGetPhysicalDeviceSparseImageFormatProperties2 ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2}
     *
     * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
     */
    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(__functionAddress, physicalDevice.address(), pFormatInfo, pPropertyCount, pProperties);
    }

    /**
     * Retrieve properties of an image format applied to sparse images.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2} returns an array of {@link VkSparseImageFormatProperties2}. Each element will describe properties for one set of image aspects that are bound simultaneously in the image. This is usually one element for each aspect in the image, but for interleaved depth/stencil images there is only one element describing the combined aspects.</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceSparseImageFormatProperties2(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo,
     *     uint32_t*                                   pPropertyCount,
     *     VkSparseImageFormatProperties2*             pProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo,
     *     uint32_t*                                   pPropertyCount,
     *     VkSparseImageFormatProperties2*             pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2} behaves identically to {@link VK10#vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}, with the ability to return extended information by adding extension structures to the {@code pNext} chain of its {@code pProperties} parameter.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pFormatInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceSparseImageFormatInfo2} structure</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkSparseImageFormatProperties2} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceSparseImageFormatInfo2}, {@link VkSparseImageFormatProperties2}</p>
     *
     * @param physicalDevice the physical device from which to query the sparse image capabilities.
     * @param pFormatInfo    a pointer to a structure of type {@link VkPhysicalDeviceSparseImageFormatInfo2} containing input parameters to the command.
     * @param pPropertyCount a pointer to an integer related to the number of sparse format properties available or queried, as described below.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkSparseImageFormatProperties2} structures.
     */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties2(physicalDevice, pFormatInfo.address(), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkTrimCommandPool ] ---

    /**
     * Trim a command pool.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To trim a command pool, call:</p>
     * 
     * <pre><code>
     * void vkTrimCommandPool(
     *     VkDevice                                    device,
     *     VkCommandPool                               commandPool,
     *     VkCommandPoolTrimFlags                      flags);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkTrimCommandPoolKHR(
     *     VkDevice                                    device,
     *     VkCommandPool                               commandPool,
     *     VkCommandPoolTrimFlags                      flags);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Trimming a command pool recycles unused memory from the command pool back to the system. Command buffers allocated from the pool are not affected by the command.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This command provides applications with some control over the internal memory allocations used by command pools.</p>
     * 
     * <p>Unused memory normally arises from command buffers that have been recorded and later reset, such that they are no longer using the memory. On reset, a command buffer can return memory to its command pool, but the only way to release memory from a command pool to the system requires calling {@link VK10#vkResetCommandPool ResetCommandPool}, which cannot be executed while any command buffers from that pool are still in use. Subsequent recording operations into command buffers will re-use this memory but since total memory requirements fluctuate over time, unused memory can accumulate.</p>
     * 
     * <p>In this situation, trimming a command pool <b>may</b> be useful to return unused memory back to the system, returning the total outstanding memory allocated by the pool back to a more "{@code average}" value.</p>
     * 
     * <p>Implementations utilize many internal allocation strategies that make it impossible to guarantee that all unused memory is released back to the system. For instance, an implementation of a command pool <b>may</b> involve allocating memory in bulk from the system and sub-allocating from that memory. In such an implementation any live command buffer that holds a reference to a bulk allocation would prevent that allocation from being freed, even if only a small proportion of the bulk allocation is in use.</p>
     * 
     * <p>In most cases trimming will result in a reduction in allocated but unused memory, but it does not guarantee the "{@code ideal}" behaviour.</p>
     * 
     * <p>Trimming <b>may</b> be an expensive operation, and <b>should</b> not be called frequently. Trimming <b>should</b> be treated as a way to relieve memory pressure after application-known points when there exists enough unused memory that the cost of trimming is "{@code worth}" it.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code commandPool} <b>must</b> be a valid {@code VkCommandPool} handle</li>
     * <li>{@code flags} <b>must</b> be 0</li>
     * <li>{@code commandPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandPool} <b>must</b> be externally synchronized</li>
     * </ul>
     *
     * @param device      the logical device that owns the command pool.
     * @param commandPool the command pool to trim.
     * @param flags       reserved for future use.
     */
    public static void vkTrimCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolTrimFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkTrimCommandPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(__functionAddress, device.address(), commandPool, flags);
    }

    // --- [ vkGetDeviceQueue2 ] ---

    /** Unsafe version of: {@link #vkGetDeviceQueue2 GetDeviceQueue2} */
    public static void nvkGetDeviceQueue2(VkDevice device, long pQueueInfo, long pQueue) {
        long __functionAddress = device.getCapabilities().vkGetDeviceQueue2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, device.address(), pQueueInfo, pQueue);
    }

    /**
     * Get a queue handle from a device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To retrieve a handle to a VkQueue object with specific {@code VkDeviceQueueCreateFlags} creation flags, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceQueue2(
     *     VkDevice                                    device,
     *     const VkDeviceQueueInfo2*                   pQueueInfo,
     *     VkQueue*                                    pQueue);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pQueueInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceQueueInfo2} structure</li>
     * <li>{@code pQueue} <b>must</b> be a valid pointer to a {@code VkQueue} handle</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceQueueInfo2}</p>
     *
     * @param device     the logical device that owns the queue.
     * @param pQueueInfo points to an instance of the {@link VkDeviceQueueInfo2} structure, describing the parameters used to create the device queue.
     * @param pQueue     a pointer to a {@code VkQueue} object that will be filled with the handle for the requested queue.
     */
    public static void vkGetDeviceQueue2(VkDevice device, @NativeType("VkDeviceQueueInfo2 const *") VkDeviceQueueInfo2 pQueueInfo, @NativeType("VkQueue *") PointerBuffer pQueue) {
        if (CHECKS) {
            check(pQueue, 1);
        }
        nvkGetDeviceQueue2(device, pQueueInfo.address(), memAddress(pQueue));
    }

    // --- [ vkCreateSamplerYcbcrConversion ] ---

    /** Unsafe version of: {@link #vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion} */
    public static int nvkCreateSamplerYcbcrConversion(VkDevice device, long pCreateInfo, long pAllocator, long pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversion;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pYcbcrConversion);
    }

    /**
     * Create a new Ycbcr conversion.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a {@code VkSamplerYcbcrConversion}, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateSamplerYcbcrConversion(
     *     VkDevice                                    device,
     *     const VkSamplerYcbcrConversionCreateInfo*   pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSamplerYcbcrConversion*                   pYcbcrConversion);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkCreateSamplerYcbcrConversionKHR(
     *     VkDevice                                    device,
     *     const VkSamplerYcbcrConversionCreateInfo*   pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSamplerYcbcrConversion*                   pYcbcrConversion);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The interpretation of the configured sampler Y'C<sub>B</sub>C<sub>R</sub> conversion is described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-sampler-YCbCr-conversion">the description of sampler Y'C<sub>B</sub>C<sub>R</sub> conversion</a> in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures">Image Operations</a> chapter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-sampler-YCbCr-conversion">sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion feature</a> <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkSamplerYcbcrConversionCreateInfo} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pYcbcrConversion} <b>must</b> be a valid pointer to a {@code VkSamplerYcbcrConversion} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkSamplerYcbcrConversionCreateInfo}</p>
     *
     * @param device           the logical device that creates the sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion.
     * @param pCreateInfo      a pointer to an instance of the {@link VkSamplerYcbcrConversionCreateInfo} specifying the requested sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion.
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pYcbcrConversion points to a {@code VkSamplerYcbcrConversion} handle in which the resulting sampler Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") LongBuffer pYcbcrConversion) {
        if (CHECKS) {
            check(pYcbcrConversion, 1);
        }
        return nvkCreateSamplerYcbcrConversion(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pYcbcrConversion));
    }

    // --- [ vkDestroySamplerYcbcrConversion ] ---

    /** Unsafe version of: {@link #vkDestroySamplerYcbcrConversion DestroySamplerYcbcrConversion} */
    public static void nvkDestroySamplerYcbcrConversion(VkDevice device, long ycbcrConversion, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySamplerYcbcrConversion;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, device.address(), ycbcrConversion, pAllocator);
    }

    /**
     * Destroy a created Y'CbCr conversion.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a sampler Y'C<sub>B</sub>C<sub>R</sub> conversion, call:</p>
     * 
     * <pre><code>
     * void vkDestroySamplerYcbcrConversion(
     *     VkDevice                                    device,
     *     VkSamplerYcbcrConversion                    ycbcrConversion,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkDestroySamplerYcbcrConversionKHR(
     *     VkDevice                                    device,
     *     VkSamplerYcbcrConversion                    ycbcrConversion,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code ycbcrConversion} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code ycbcrConversion} <b>must</b> be a valid {@code VkSamplerYcbcrConversion} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code ycbcrConversion} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code ycbcrConversion} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device          the logical device that destroys the Y&#8217;C<sub>B</sub>C<sub>R</sub> conversion.
     * @param ycbcrConversion the conversion to destroy.
     * @param pAllocator      controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroySamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversion") long ycbcrConversion, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroySamplerYcbcrConversion(device, ycbcrConversion, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateDescriptorUpdateTemplate ] ---

    /** Unsafe version of: {@link #vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate} */
    public static int nvkCreateDescriptorUpdateTemplate(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplate;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate);
    }

    /**
     * Create a new descriptor update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Updating a large {@code VkDescriptorSet} array <b>can</b> be an expensive operation since an application <b>must</b> specify one {@link VkWriteDescriptorSet} structure for each descriptor or descriptor array to update, each of which re-specifies the same state when updating the same descriptor in multiple descriptor sets. For cases when an application wishes to update the same set of descriptors in multiple descriptor sets allocated using the same {@code VkDescriptorSetLayout}, {@link #vkUpdateDescriptorSetWithTemplate UpdateDescriptorSetWithTemplate} <b>can</b> be used as a replacement for {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets}.</p>
     * 
     * <p>{@code VkDescriptorUpdateTemplate} allows implementations to convert a set of descriptor update operations on a single descriptor set to an internal format that, in conjunction with {@link #vkUpdateDescriptorSetWithTemplate UpdateDescriptorSetWithTemplate} or {@link KHRPushDescriptor#vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} , <b>can</b> be more efficient compared to calling {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} or {@link KHRPushDescriptor#vkCmdPushDescriptorSetKHR CmdPushDescriptorSetKHR} . The descriptors themselves are not specified in the {@code VkDescriptorUpdateTemplate}, rather, offsets into an application provided pointer to host memory are specified, which are combined with a pointer passed to {@link #vkUpdateDescriptorSetWithTemplate UpdateDescriptorSetWithTemplate} or {@link KHRPushDescriptor#vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} . This allows large batches of updates to be executed without having to convert application data structures into a strictly-defined Vulkan data structure.</p>
     * 
     * <p>To create a descriptor update template, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateDescriptorUpdateTemplate(
     *     VkDevice                                    device,
     *     const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDescriptorUpdateTemplate*                 pDescriptorUpdateTemplate);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkCreateDescriptorUpdateTemplateKHR(
     *     VkDevice                                    device,
     *     const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDescriptorUpdateTemplate*                 pDescriptorUpdateTemplate);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDescriptorUpdateTemplateCreateInfo} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pDescriptorUpdateTemplate} <b>must</b> be a valid pointer to a {@code VkDescriptorUpdateTemplate} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDescriptorUpdateTemplateCreateInfo}</p>
     *
     * @param device                    the logical device that creates the descriptor update template.
     * @param pCreateInfo               a pointer to an instance of the {@link VkDescriptorUpdateTemplateCreateInfo} structure specifying the set of descriptors to update with a single call to {@link KHRPushDescriptor#vkCmdPushDescriptorSetWithTemplateKHR CmdPushDescriptorSetWithTemplateKHR} or {@link #vkUpdateDescriptorSetWithTemplate UpdateDescriptorSetWithTemplate}.
     * @param pAllocator                controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pDescriptorUpdateTemplate points to a {@code VkDescriptorUpdateTemplate} handle in which the resulting descriptor update template object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") LongBuffer pDescriptorUpdateTemplate) {
        if (CHECKS) {
            check(pDescriptorUpdateTemplate, 1);
        }
        return nvkCreateDescriptorUpdateTemplate(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDescriptorUpdateTemplate));
    }

    // --- [ vkDestroyDescriptorUpdateTemplate ] ---

    /** Unsafe version of: {@link #vkDestroyDescriptorUpdateTemplate DestroyDescriptorUpdateTemplate} */
    public static void nvkDestroyDescriptorUpdateTemplate(VkDevice device, long descriptorUpdateTemplate, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorUpdateTemplate;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(__functionAddress, device.address(), descriptorUpdateTemplate, pAllocator);
    }

    /**
     * Destroy a descriptor update template object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a descriptor update template, call:</p>
     * 
     * <pre><code>
     * void vkDestroyDescriptorUpdateTemplate(
     *     VkDevice                                    device,
     *     VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkDestroyDescriptorUpdateTemplateKHR(
     *     VkDevice                                    device,
     *     VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code descriptorUpdateTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code descriptorUpdateTemplate} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code descriptorUpdateTemplate} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                   the logical device that has been used to create the descriptor update template
     * @param descriptorUpdateTemplate the descriptor update template to destroy.
     * @param pAllocator               controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorUpdateTemplate(device, descriptorUpdateTemplate, memAddressSafe(pAllocator));
    }

    // --- [ vkUpdateDescriptorSetWithTemplate ] ---

    /**
     * Update the contents of a descriptor set object using an update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Once a {@code VkDescriptorUpdateTemplate} has been created, descriptor sets <b>can</b> be updated by calling:</p>
     * 
     * <pre><code>
     * void vkUpdateDescriptorSetWithTemplate(
     *     VkDevice                                    device,
     *     VkDescriptorSet                             descriptorSet,
     *     VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
     *     const void*                                 pData);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkUpdateDescriptorSetWithTemplateKHR(
     *     VkDevice                                    device,
     *     VkDescriptorSet                             descriptorSet,
     *     VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
     *     const void*                                 pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pData} <b>must</b> be a valid pointer to a memory that contains one or more valid instances of {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with {@link #vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code descriptorSet} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <pre><code>
     * struct AppBufferView {
     *     VkBufferView bufferView;
     *     uint32_t     applicationRelatedInformation;
     * };
     * 
     * struct AppDataStructure
     * {
     *     VkDescriptorImageInfo  imageInfo;          // a single image info
     *     VkDescriptorBufferInfo bufferInfoArray[3]; // 3 buffer infos in an array
     *     AppBufferView          bufferView[2];      // An application defined structure containing a bufferView
     *     // ... some more application related data
     * };
     * 
     * const VkDescriptorUpdateTemplateEntry descriptorUpdateTemplateEntries[] =
     * {
     *     // binding to a single image descriptor
     *     {
     *         0,                                           // binding
     *         0,                                           // dstArrayElement
     *         1,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,   // descriptorType
     *         offsetof(AppDataStructure, imageInfo),       // offset
     *         0                                            // stride is not required if descriptorCount is 1.
     *     },
     * 
     *     // binding to an array of buffer descriptors
     *     {
     *         0,                                           // binding
     *         0,                                           // dstArrayElement
     *         3,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER,           // descriptorType
     *         offsetof(AppDataStructure, bufferInfoArray), // offset
     *         sizeof(VkDescriptorBufferInfo)               // stride, descriptor buffer infos are compact
     *     },
     * 
     *     // binding to an array of buffer views
     *     {
     *         0,                                           // binding
     *         3,                                           // dstArrayElement
     *         1,                                           // descriptorCount
     *         VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER,     // descriptorType
     *         offsetof(AppDataStructure, bufferView),      // offset
     *         sizeof(AppBufferView)                        // stride, bufferViews do not have to be compact
     *     },
     * };
     * 
     * // create an descriptor update template for descriptor set updates
     * const VkDescriptorUpdateTemplateCreateInfo createInfo =
     * {
     *     VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO,  // sType
     *     NULL,                                                          // pNext
     *     0,                                                             // flags
     *     3,                                                             // descriptorUpdateEntryCount
     *     descriptorUpdateTemplateEntries,                               // pDescriptorUpdateEntries
     *     VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET,         // templateType
     *     myLayout,                                                      // descriptorSetLayout
     *     0,                                                             // pipelineBindPoint, ignored by given templateType
     *     0,                                                             // pipelineLayout, ignored by given templateType
     *     0,                                                             // set, ignored by given templateType
     * };
     * 
     * VkDescriptorUpdateTemplate myDescriptorUpdateTemplate;
     * myResult = vkCreateDescriptorUpdateTemplate(
     *     myDevice,
     *     &amp;createInfo,
     *     NULL,
     *     &amp;myDescriptorUpdateTemplate);
     * }
     * 
     * 
     * AppDataStructure appData;
     * 
     * // fill appData here or cache it in your engine
     * vkUpdateDescriptorSetWithTemplate(myDevice, myDescriptorSet, myDescriptorUpdateTemplate, &amp;appData);</code></pre>
     *
     * @param device                   the logical device that updates the descriptor sets.
     * @param descriptorSet            the descriptor set to update
     * @param descriptorUpdateTemplate the {@code VkDescriptorUpdateTemplate} which specifies the update mapping between {@code pData} and the descriptor set to update.
     * @param pData                    a pointer to memory which contains one or more structures of {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} used to write the descriptors.
     */
    public static void vkUpdateDescriptorSetWithTemplate(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("void const *") long pData) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSetWithTemplate;
        if (CHECKS) {
            check(__functionAddress);
            check(pData);
        }
        callPJJPV(__functionAddress, device.address(), descriptorSet, descriptorUpdateTemplate, pData);
    }

    // --- [ vkGetPhysicalDeviceExternalBufferProperties ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties} */
    public static void nvkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalBufferProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalBufferInfo, pExternalBufferProperties);
    }

    /**
     * Query external handle types supported by buffers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the external handle types supported by buffers, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceExternalBufferProperties(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalBufferInfo*   pExternalBufferInfo,
     *     VkExternalBufferProperties*                 pExternalBufferProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceExternalBufferPropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalBufferInfo*   pExternalBufferInfo,
     *     VkExternalBufferProperties*                 pExternalBufferProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalBufferInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceExternalBufferInfo} structure</li>
     * <li>{@code pExternalBufferProperties} <b>must</b> be a valid pointer to a {@link VkExternalBufferProperties} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalBufferProperties}, {@link VkPhysicalDeviceExternalBufferInfo}</p>
     *
     * @param physicalDevice            the physical device from which to query the buffer capabilities.
     * @param pExternalBufferInfo       points to an instance of the {@link VkPhysicalDeviceExternalBufferInfo} structure, describing the parameters that would be consumed by {@link VK10#vkCreateBuffer CreateBuffer}.
     * @param pExternalBufferProperties points to an instance of the {@link VkExternalBufferProperties} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalBufferInfo const *") VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, @NativeType("VkExternalBufferProperties *") VkExternalBufferProperties pExternalBufferProperties) {
        nvkGetPhysicalDeviceExternalBufferProperties(physicalDevice, pExternalBufferInfo.address(), pExternalBufferProperties.address());
    }

    // --- [ vkGetPhysicalDeviceExternalFenceProperties ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalFenceProperties GetPhysicalDeviceExternalFenceProperties} */
    public static void nvkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalFenceProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalFenceInfo, pExternalFenceProperties);
    }

    /**
     * Function for querying external fence handle capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Fences <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-fences-payloads">payload</a> to external handles. To query the external handle types supported by fences, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceExternalFenceProperties(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalFenceInfo*    pExternalFenceInfo,
     *     VkExternalFenceProperties*                  pExternalFenceProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceExternalFencePropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalFenceInfo*    pExternalFenceInfo,
     *     VkExternalFenceProperties*                  pExternalFenceProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalFenceInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceExternalFenceInfo} structure</li>
     * <li>{@code pExternalFenceProperties} <b>must</b> be a valid pointer to a {@link VkExternalFenceProperties} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalFenceProperties}, {@link VkPhysicalDeviceExternalFenceInfo}</p>
     *
     * @param physicalDevice           the physical device from which to query the fence capabilities.
     * @param pExternalFenceInfo       points to an instance of the {@link VkPhysicalDeviceExternalFenceInfo} structure, describing the parameters that would be consumed by {@link VK10#vkCreateFence CreateFence}.
     * @param pExternalFenceProperties points to an instance of the {@link VkExternalFenceProperties} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalFenceInfo const *") VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, @NativeType("VkExternalFenceProperties *") VkExternalFenceProperties pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFenceProperties(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

    // --- [ vkGetPhysicalDeviceExternalSemaphoreProperties ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalSemaphoreProperties GetPhysicalDeviceExternalSemaphoreProperties} */
    public static void nvkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalSemaphoreProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pExternalSemaphoreInfo, pExternalSemaphoreProperties);
    }

    /**
     * Function for querying external semaphore handle capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Semaphores <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-payloads">payload</a> to external handles. To query the external handle types supported by semaphores, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceExternalSemaphoreProperties(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalSemaphoreInfo* pExternalSemaphoreInfo,
     *     VkExternalSemaphoreProperties*              pExternalSemaphoreProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceExternalSemaphoreInfo* pExternalSemaphoreInfo,
     *     VkExternalSemaphoreProperties*              pExternalSemaphoreProperties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pExternalSemaphoreInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceExternalSemaphoreInfo} structure</li>
     * <li>{@code pExternalSemaphoreProperties} <b>must</b> be a valid pointer to a {@link VkExternalSemaphoreProperties} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExternalSemaphoreProperties}, {@link VkPhysicalDeviceExternalSemaphoreInfo}</p>
     *
     * @param physicalDevice               the physical device from which to query the semaphore capabilities.
     * @param pExternalSemaphoreInfo       points to an instance of the {@link VkPhysicalDeviceExternalSemaphoreInfo} structure, describing the parameters that would be consumed by {@link VK10#vkCreateSemaphore CreateSemaphore}.
     * @param pExternalSemaphoreProperties points to an instance of the {@link VkExternalSemaphoreProperties} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalSemaphoreInfo const *") VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, @NativeType("VkExternalSemaphoreProperties *") VkExternalSemaphoreProperties pExternalSemaphoreProperties) {
        nvkGetPhysicalDeviceExternalSemaphoreProperties(physicalDevice, pExternalSemaphoreInfo.address(), pExternalSemaphoreProperties.address());
    }

    // --- [ vkGetDescriptorSetLayoutSupport ] ---

    /** Unsafe version of: {@link #vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport} */
    public static void nvkGetDescriptorSetLayoutSupport(VkDevice device, long pCreateInfo, long pSupport) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSupport;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        callPPPV(__functionAddress, device.address(), pCreateInfo, pSupport);
    }

    /**
     * Query whether a descriptor set layout can be created.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query information about whether a descriptor set layout <b>can</b> be created, call:</p>
     * 
     * <pre><code>
     * void vkGetDescriptorSetLayoutSupport(
     *     VkDevice                                    device,
     *     const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
     *     VkDescriptorSetLayoutSupport*               pSupport);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetDescriptorSetLayoutSupportKHR(
     *     VkDevice                                    device,
     *     const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
     *     VkDescriptorSetLayoutSupport*               pSupport);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Some implementations have limitations on what fits in a descriptor set which are not easily expressible in terms of existing limits like {@code maxDescriptorSet}*, for example if all descriptor types share a limited space in memory but each descriptor is a different size or alignment. This command returns information about whether a descriptor set satisfies this limit. If the descriptor set layout satisfies the {@link VkPhysicalDeviceMaintenance3Properties}{@code ::maxPerSetDescriptors} limit, this command is guaranteed to return {@link VK10#VK_TRUE TRUE} in {@link VkDescriptorSetLayoutSupport}{@code ::supported}. If the descriptor set layout exceeds the {@link VkPhysicalDeviceMaintenance3Properties}{@code ::maxPerSetDescriptors} limit, whether the descriptor set layout is supported is implementation-dependent and <b>may</b> depend on whether the descriptor sizes and alignments cause the layout to exceed an internal limit.</p>
     * 
     * <p>This command does not consider other limits such as {@code maxPerStageDescriptor}*, and so a descriptor set layout that is supported according to this command <b>must</b> still satisfy the pipeline layout limits such as {@code maxPerStageDescriptor}* in order to be used in a pipeline layout.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This is a {@code VkDevice} query rather than {@code VkPhysicalDevice} because the answer <b>may</b> depend on enabled features.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkDescriptorSetLayoutCreateInfo} structure</li>
     * <li>{@code pSupport} <b>must</b> be a valid pointer to a {@link VkDescriptorSetLayoutSupport} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDescriptorSetLayoutCreateInfo}, {@link VkDescriptorSetLayoutSupport}</p>
     *
     * @param device      the logical device that would create the descriptor set layout.
     * @param pCreateInfo a pointer to an instance of the {@link VkDescriptorSetLayoutCreateInfo} structure specifying the state of the descriptor set layout object.
     * @param pSupport    points to a {@link VkDescriptorSetLayoutSupport} structure in which information about support for the descriptor set layout object is returned.
     */
    public static void vkGetDescriptorSetLayoutSupport(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkDescriptorSetLayoutSupport *") VkDescriptorSetLayoutSupport pSupport) {
        nvkGetDescriptorSetLayoutSupport(device, pCreateInfo.address(), pSupport.address());
    }

    /** Array version of: {@link #vkEnumerateInstanceVersion EnumerateInstanceVersion} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@NativeType("uint32_t *") int[] pApiVersion) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceVersion;
        if (CHECKS) {
            check(__functionAddress);
            check(pApiVersion, 1);
        }
        return callPI(__functionAddress, pApiVersion);
    }

    /** Array version of: {@link #vkGetDeviceGroupPeerMemoryFeatures GetDeviceGroupPeerMemoryFeatures} */
    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") int[] pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeatures;
        if (CHECKS) {
            check(__functionAddress);
            check(pPeerMemoryFeatures, 1);
        }
        callPPV(__functionAddress, device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures);
    }

    /** Array version of: {@link #vkEnumeratePhysicalDeviceGroups EnumeratePhysicalDeviceGroups} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceGroupCount, @Nullable @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroups;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return callPPPI(__functionAddress, instance.address(), pPhysicalDeviceGroupCount, memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    /** Array version of: {@link #vkGetImageSparseMemoryRequirements2 GetImageSparseMemoryRequirements2} */
    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        callPPPPV(__functionAddress, device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @Nullable @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2;
        if (CHECKS) {
            check(__functionAddress);
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        callPPPV(__functionAddress, physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSparseImageFormatProperties2 GetPhysicalDeviceSparseImageFormatProperties2} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        callPPPPV(__functionAddress, physicalDevice.address(), pFormatInfo.address(), pPropertyCount, memAddressSafe(pProperties));
    }

    /** Array version of: {@link #vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion} */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") long[] pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversion;
        if (CHECKS) {
            check(__functionAddress);
            check(pYcbcrConversion, 1);
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pYcbcrConversion);
    }

    /** Array version of: {@link #vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") long[] pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplate;
        if (CHECKS) {
            check(__functionAddress);
            check(pDescriptorUpdateTemplate, 1);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pDescriptorUpdateTemplate);
    }

}