/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core Vulkan 1.4 functionality.
 * 
 * <p>Vulkan Version 1.4 <em>promoted</em> a number of key extensions into the core API:</p>
 * 
 * <ul>
 * <li>{@link KHRDynamicRenderingLocalRead KHR_dynamic_rendering_local_read}</li>
 * <li>{@link KHRGlobalPriority KHR_global_priority}</li>
 * <li>{@link KHRIndexTypeUint8 KHR_index_type_uint8}</li>
 * <li>{@link KHRLineRasterization KHR_line_rasterization}</li>
 * <li>{@link KHRLoadStoreOpNone KHR_load_store_op_none}</li>
 * <li>{@link KHRMaintenance5 KHR_maintenance5}</li>
 * <li>{@link KHRMaintenance6 KHR_maintenance6}</li>
 * <li>{@link KHRMapMemory2 KHR_map_memory2}</li>
 * <li>{@link KHRPushDescriptor KHR_push_descriptor}</li>
 * <li>{@link KHRShaderExpectAssume KHR_shader_expect_assume}</li>
 * <li>{@link KHRShaderFloatControls2 KHR_shader_float_controls2}</li>
 * <li>{@link KHRShaderSubgroupRotate KHR_shader_subgroup_rotate}</li>
 * <li>{@link KHRVertexAttributeDivisor KHR_vertex_attribute_divisor}</li>
 * <li>{@link EXTHostImageCopy EXT_host_image_copy}</li>
 * <li>{@link EXTPipelineProtectedAccess EXT_pipeline_protected_access}</li>
 * <li>{@link EXTPipelineRobustness EXT_pipeline_robustness}</li>
 * </ul>
 * 
 * <p>All differences in behavior between these extensions and the corresponding Vulkan 1.4 functionality are summarized below.</p>
 * 
 * <h3>Differences Relative to VK_KHR_dynamic_rendering_local_read</h3>
 * 
 * <p>If the {@code VK_KHR_dynamic_rendering_local_read} extension is not supported, Vulkan 1.4 implementations must support local read only for storage
 * resources and single sampled color attachments.</p>
 * 
 * <p>Support for reading depth/stencil attachments and multi-sampled attachments are respectively gated behind the new boolean
 * {@code dynamicRenderingLocalReadDepthStencilAttachments} and {@code dynamicRenderingLocalReadMultisampledAttachments} properties.</p>
 * 
 * <p>If {@code dynamicRenderingLocalReadDepthStencilAttachments} is {@link VK10#VK_FALSE FALSE}, implementations do not support depth/stencil attachment access within
 * dynamic rendering.</p>
 * 
 * <p>If {@code dynamicRenderingLocalReadMultisampledAttachments} is {@link VK10#VK_FALSE FALSE}, implementations do not support multisampled attachment access within dynamic
 * rendering.</p>
 * 
 * <p>If both properties are {@link VK10#VK_TRUE TRUE}, the full functionality of the extension is supported.</p>
 * 
 * <h3>Differences Relative to VK_EXT_host_image_copy</h3>
 * 
 * <p>If the {@code VK_EXT_host_image_copy} extension is not supported, support for it is optional in Vulkan 1.4.</p>
 * 
 * <p>An implementation that has a {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} queue must support either:</p>
 * 
 * <ul>
 * <li>the {@code hostImageCopy} feature; or</li>
 * <li>an additional queue that supports {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}.</li>
 * </ul>
 * 
 * <h3>Differences Relative to VK_KHR_push_descriptor</h3>
 * 
 * <p>{@code VK_KHR_push_descriptor} did not include a feature bit, so a new feature bit has been added to {@link VkPhysicalDeviceVulkan14Features} to gate its
 * functionality: {@code pushDescriptor}. Enabling this new feature has the same effect as enabling the extension.</p>
 * 
 * <h3>Differences Relative to VK_EXT_pipeline_protected_access</h3>
 * 
 * <p>{@code VK_EXT_pipeline_protected_access} is only useful when the {@code protectedMemory} feature is supported. As {@code protectedMemory} is
 * optional in core Vulkan, {@code pipelineProtectedAccess} is only required when {@code protectedMemory} is supported.</p>
 * 
 * <h3>Differences Relative to VK_KHR_line_rasterization</h3>
 * 
 * <p>The {@code bresenhamLines} feature is required, rather than just any one of the line style features.</p>
 * 
 * <h3>Differences Relative to VK_KHR_shader_subgroup_rotate</h3>
 * 
 * <p>The {@code shaderSubgroupRotateClustered} feature is required in addition to {@code shaderSubgroupRotate}.</p>
 * 
 * <h3>Additional Vulkan 1.4 Feature Support</h3>
 * 
 * <p>In addition to the promoted extensions described above, Vulkan 1.4 added required support for:</p>
 * 
 * <ul>
 * <li>All queues supporting {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} must also advertise {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}.</li>
 * <li>Clustered subgroup operations must be advertised in Vulkan 1.4 via setting both {@link VK11#VK_SUBGROUP_FEATURE_CLUSTERED_BIT SUBGROUP_FEATURE_CLUSTERED_BIT} and
 * {@link #VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT} (as an interaction with the promoted {@code VK_KHR_shader_subgroup_rotate} functionality) in
 * {@code supportedOperations}.</li>
 * <li>The following features that were optional in earlier versions:
 * 
 * <ul>
 * <li>{@code fullDrawIndexUint32}</li>
 * <li>{@code imageCubeArray}</li>
 * <li>{@code independentBlend}</li>
 * <li>{@code sampleRateShading}</li>
 * <li>{@code drawIndirectFirstInstance}</li>
 * <li>{@code depthClamp}</li>
 * <li>{@code depthBiasClamp}</li>
 * <li>{@code samplerAnisotropy}</li>
 * <li>{@code fragmentStoresAndAtomics}</li>
 * <li>{@code shaderStorageImageExtendedFormats}</li>
 * <li>{@code shaderUniformBufferArrayDynamicIndexing}</li>
 * <li>{@code shaderSampledImageArrayDynamicIndexing}</li>
 * <li>{@code shaderStorageBufferArrayDynamicIndexing}</li>
 * <li>{@code shaderStorageImageArrayDynamicIndexing}</li>
 * <li>{@code shaderImageGatherExtended}</li>
 * <li>{@code shaderInt16}</li>
 * <li>{@code largePoints}</li>
 * <li>{@code samplerYcbcrConversion}</li>
 * <li>{@code storageBuffer16BitAccess}</li>
 * <li>{@code variablePointers}</li>
 * <li>{@code variablePointersStorageBuffer}</li>
 * <li>{@code samplerMirrorClampToEdge}</li>
 * <li>{@code scalarBlockLayout}</li>
 * <li>{@code shaderUniformTexelBufferArrayDynamicIndexing}</li>
 * <li>{@code shaderStorageTexelBufferArrayDynamicIndexing}</li>
 * <li>{@code shaderInt8}</li>
 * <li>{@code storageBuffer8BitAccess}</li>
 * </ul></li>
 * </ul>
 */
public class VK14 extends VK13 {

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES   = 55,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES = 56;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO       = 1000174000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES = 1000388000,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES        = 1000388001;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;

    /** Extends {@code VkAttachmentLoadOp}. */
    public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES = 1000416000;

    /**
     * Extends {@code VkSubgroupFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBGROUP_FEATURE_ROTATE_BIT SUBGROUP_FEATURE_ROTATE_BIT}</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT}</li>
     * </ul>
     */
    public static final int
        VK_SUBGROUP_FEATURE_ROTATE_BIT           = 0x200,
        VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 0x400;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES = 1000528000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES = 1000544000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES   = 1000259000,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO = 1000259001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES = 1000259002;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES = 1000525000,
        VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO     = 1000190001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES   = 1000190002;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES = 1000265000;

    /** Extends {@code VkIndexType}. */
    public static final int VK_INDEX_TYPE_UINT8 = 1000265000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_MAP_INFO STRUCTURE_TYPE_MEMORY_MAP_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO STRUCTURE_TYPE_MEMORY_UNMAP_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_MAP_INFO   = 1000271000,
        VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO = 1000271001;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_AREA_INFO STRUCTURE_TYPE_RENDERING_AREA_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES   = 1000470000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES = 1000470001,
        VK_STRUCTURE_TYPE_RENDERING_AREA_INFO                      = 1000470003,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO            = 1000470004,
        VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2                     = 1000338002,
        VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2                      = 1000338003,
        VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO      = 1000470005,
        VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO         = 1000470006;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_A1B5G5R5_UNORM_PACK16 FORMAT_A1B5G5R5_UNORM_PACK16}</li>
     * <li>{@link #VK_FORMAT_A8_UNORM FORMAT_A8_UNORM}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000,
        VK_FORMAT_A8_UNORM              = 1000470001;

    /** Extends {@code VkBufferUsageFlagBits2}. */
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 0x20000L;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES = 1000080000;

    /** Extends {@code VkDescriptorSetLayoutCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 0x1;

    /** Extends {@code VkDescriptorUpdateTemplateType}. */
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO                    = 1000232001,
        VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO                 = 1000232002;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS STRUCTURE_TYPE_BIND_MEMORY_STATUS}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO STRUCTURE_TYPE_PUSH_CONSTANTS_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES   = 1000545000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES = 1000545001,
        VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS                       = 1000545002,
        VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO                = 1000545003,
        VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO                      = 1000545004,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO                 = 1000545005,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO   = 1000545006;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES = 1000466000;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT   = 0x8000000,
        VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 0x40000000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO                = 1000068000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES   = 1000068001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES = 1000068002;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES   = 1000270000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES = 1000270001,
        VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY                       = 1000270002,
        VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY                       = 1000270003,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO                  = 1000270004,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO                  = 1000270005,
        VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO          = 1000270006,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO                   = 1000270007,
        VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE               = 1000270008,
        VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY   = 1000270009;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 0x400000;

    /** Extends {@code VkFormatFeatureFlagBits2}. */
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 0x400000000000L;

    /**
     * VkPipelineRobustnessBufferBehavior - Enum controlling the robustness of buffer accesses in a pipeline stage
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT} specifies that this pipeline stage follows the behavior of robustness features that are enabled that created this pipeline</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED} specifies that buffer accesses by this pipeline stage to the relevant resource types <b>must</b> not be out of bounds</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS} specifies that out of bounds accesses by this pipeline stage to the relevant resource types behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2} specifies that out of bounds accesses by this pipeline stage to the relevant resource types behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> feature is enabled</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDevicePipelineRobustnessProperties}, {@link VkPhysicalDeviceVulkan14Properties}, {@link VkPipelineRobustnessCreateInfo}</p>
     */
    public static final int
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT         = 0,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED               = 1,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS   = 2,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;

    /**
     * VkPipelineRobustnessImageBehavior - Enum controlling the robustness of image accesses in a pipeline stage
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT} specifies that this pipeline stage follows the behavior of robustness features that are enabled on the device that created this pipeline</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED} specifies that image accesses by this pipeline stage to the relevant resource types <b>must</b> not be out of bounds</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS} specifies that out of bounds accesses by this pipeline stage to images behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustImageAccess">{@code robustImageAccess}</a> feature is enabled</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2} specifies that out of bounds accesses by this pipeline stage to images behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustImageAccess2">{@code robustImageAccess2}</a> feature is enabled</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDevicePipelineRobustnessProperties}, {@link VkPhysicalDeviceVulkan14Properties}, {@link VkPipelineRobustnessCreateInfo}</p>
     */
    public static final int
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT        = 0,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED              = 1,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS   = 2,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;

    /**
     * VkQueueGlobalPriority - Values specifying a system-wide queue priority
     * 
     * <h5>Description</h5>
     * 
     * <p>Priority values are sorted in ascending order. A comparison operation on the enum values can be used to determine the priority order.</p>
     * 
     * <ul>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_LOW QUEUE_GLOBAL_PRIORITY_LOW} is below the system default. Useful for non-interactive tasks.</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_MEDIUM QUEUE_GLOBAL_PRIORITY_MEDIUM} is the system default priority.</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_HIGH QUEUE_GLOBAL_PRIORITY_HIGH} is above the system default.</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_REALTIME QUEUE_GLOBAL_PRIORITY_REALTIME} is the highest priority. Useful for critical tasks.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceQueueGlobalPriorityCreateInfo}, {@link VkQueueFamilyGlobalPriorityProperties}</p>
     */
    public static final int
        VK_QUEUE_GLOBAL_PRIORITY_LOW      = 128,
        VK_QUEUE_GLOBAL_PRIORITY_MEDIUM   = 256,
        VK_QUEUE_GLOBAL_PRIORITY_HIGH     = 512,
        VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;

    /**
     * VkLineRasterizationMode - Line rasterization modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_DEFAULT LINE_RASTERIZATION_MODE_DEFAULT} is equivalent to {@link #VK_LINE_RASTERIZATION_MODE_RECTANGULAR LINE_RASTERIZATION_MODE_RECTANGULAR} if {@link VkPhysicalDeviceLimits}{@code ::strictLines} is {@link VK10#VK_TRUE TRUE}, otherwise lines are drawn as non-{@code strictLines} parallelograms. Both of these modes are defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-basic">Basic Line Segment Rasterization</a>.</li>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_RECTANGULAR LINE_RASTERIZATION_MODE_RECTANGULAR} specifies lines drawn as if they were rectangles extruded from the line</li>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_BRESENHAM LINE_RASTERIZATION_MODE_BRESENHAM} specifies lines drawn by determining which pixel diamonds the line intersects and exits, as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-bresenham">Bresenham Line Segment Rasterization</a>.</li>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH} specifies lines drawn if they were rectangles extruded from the line, with alpha falloff, as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-smooth">Smooth Lines</a>.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineRasterizationLineStateCreateInfo}, {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT}</p>
     */
    public static final int
        VK_LINE_RASTERIZATION_MODE_DEFAULT            = 0,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR        = 1,
        VK_LINE_RASTERIZATION_MODE_BRESENHAM          = 2,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;

    /**
     * VkPipelineCreateFlagBits2 - Bitmask controlling how a pipeline is created
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT} specifies that the created pipeline will not be optimized. Using this flag <b>may</b> reduce the time taken to create the pipeline.</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT} specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent pipeline creation call.</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_DERIVATIVE_BIT PIPELINE_CREATE_2_DERIVATIVE_BIT} specifies that the pipeline to be created will be a child of a previously created parent pipeline.</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT} specifies that any shader input variables decorated as {@code ViewIndex} will be assigned values as if they were decorated as {@code DeviceIndex}.</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT PIPELINE_CREATE_2_DISPATCH_BASE_BIT} specifies that a compute pipeline <b>can</b> be used with {@link VK11#vkCmdDispatchBase CmdDispatchBase} with a non-zero base workgroup.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV} specifies that a pipeline is created with all shaders in the deferred state. Before using the pipeline the application <b>must</b> call {@link NVRayTracing#vkCompileDeferredNV CompileDeferredNV} exactly once on each shader in the pipeline before using the pipeline.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR} specifies that the shader compiler should capture statistics for the pipeline executables produced by the compile process which <b>can</b> later be retrieved by calling {@link KHRPipelineExecutableProperties#vkGetPipelineExecutableStatisticsKHR GetPipelineExecutableStatisticsKHR}. Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR} specifies that the shader compiler should capture the internal representations of pipeline executables produced by the compile process which <b>can</b> later be retrieved by calling {@link KHRPipelineExecutableProperties#vkGetPipelineExecutableInternalRepresentationsKHR GetPipelineExecutableInternalRepresentationsKHR}. Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time. When capturing IR from pipelines created with pipeline libraries, there is no guarantee that IR from libraries <b>can</b> be retrieved from the linked pipeline. Applications <b>should</b> retrieve IR from each library, and any linked pipelines, separately.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR PIPELINE_CREATE_2_LIBRARY_BIT_KHR} specifies that the pipeline <b>cannot</b> be used directly, and instead defines a <em>pipeline library</em> that <b>can</b> be combined with other pipelines using the {@link VkPipelineLibraryCreateInfoKHR} structure. This is available in ray tracing and graphics pipelines.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR} specifies that an any-hit shader will always be present when an any-hit shader would be executed. A NULL any-hit shader is an any-hit shader which is effectively {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}, such as from a shader group consisting entirely of zeros.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR} specifies that a closest hit shader will always be present when a closest hit shader would be executed. A NULL closest hit shader is a closest hit shader which is effectively {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}, such as from a shader group consisting entirely of zeros.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR} specifies that a miss shader will always be present when a miss shader would be executed. A NULL miss shader is a miss shader which is effectively {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}, such as from a shader group consisting entirely of zeros.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR} specifies that an intersection shader will always be present when an intersection shader would be executed. A NULL intersection shader is an intersection shader which is effectively {@link KHRRayTracingPipeline#VK_SHADER_UNUSED_KHR SHADER_UNUSED_KHR}, such as from a shader group consisting entirely of zeros.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR} specifies that triangle primitives will be skipped during traversal using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#glossary-pipeline-trace-ray">pipeline trace ray</a> instructions.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR} specifies that AABB primitives will be skipped during traversal using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#glossary-pipeline-trace-ray">pipeline trace ray</a> instructions.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR} specifies that the shader group handles <b>can</b> be saved and reused on a subsequent run (e.g. for trace capture and replay).</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV} specifies that the pipeline can be used in combination with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#device-generated-commands">Device-Generated Commands</a>.</li>
     * <li>{@link EXTDeviceGeneratedCommands#VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT} specifies that the pipeline <b>can</b> be used in a {@code VkIndirectExecutionSetEXT}.</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} specifies that pipeline creation will fail if a compile is required for creation of a valid {@code VkPipeline} object; {@link VK13#VK_PIPELINE_COMPILE_REQUIRED PIPELINE_COMPILE_REQUIRED} will be returned by pipeline creation, and the {@code VkPipeline} will be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</li>
     * <li>When creating multiple pipelines, {@link #VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT} specifies that control will be returned to the application if any individual pipeline returns a result which is not {@link VK10#VK_SUCCESS SUCCESS} rather than continuing to create additional pipelines.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV} specifies that the pipeline is allowed to use {@code OpTraceRayMotionNV}.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} specifies that the pipeline will be used with a fragment shading rate attachment.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT} specifies that the pipeline will be used with a fragment density map attachment.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT} specifies that pipeline libraries being linked into this library <b>should</b> have link time optimizations applied. If this bit is omitted, implementations <b>should</b> instead perform linking as rapidly as possible.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT} specifies that pipeline libraries should retain any information necessary to later perform an optimal link with {@link KHRMaintenance5#VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT}.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT} specifies that a pipeline will be used with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorbuffers">descriptor buffers</a>, rather than <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets">descriptor sets</a>.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} specifies that the pipeline <b>may</b> be used with an attachment feedback loop including color attachments.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} specifies that the pipeline <b>may</b> be used with an attachment feedback loop including depth-stencil attachments.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT} specifies that the ray tracing pipeline <b>can</b> be used with acceleration structures which reference an opacity micromap array.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV} specifies that the ray tracing pipeline <b>can</b> be used with acceleration structures which reference a displacement micromap array.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT} specifies that the pipeline <b>must</b> not be bound to a protected command buffer.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT} specifies that the pipeline <b>must</b> not be bound to an unprotected command buffer.</li>
     * <li>{@link KHRPipelineBinary#VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR} specifies that {@code VkPipelineBinaryKHR} objects <b>can</b> be created from the pipeline. If {@link KHRPipelineBinary#VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR} is used, implementations <b>should</b> not store pipeline data to an internal cache, if such a cache exists as stated by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-pipelineBinaryInternalCache">{@code pipelineBinaryInternalCache}</a>. If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-pipelineBinaryPrefersInternalCache">{@code pipelineBinaryPrefersInternalCache}</a> is {@link VK10#VK_TRUE TRUE}, applications <b>should</b> not use {@link KHRPipelineBinary#VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR}.</li>
     * <li>{@link KHRMaintenance5#VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT} specifies that the pipeline will be used in a render pass that is begun with {@link EXTLegacyDithering#VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT}.</li>
     * <li>{@link AMDXShaderEnqueue#VK_PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX} specifies that the pipeline will be used in an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#executiongraphs">execution graph</a></li>
     * </ul>
     * 
     * <p>It is valid to set both {@link #VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT} and {@link #VK_PIPELINE_CREATE_2_DERIVATIVE_BIT PIPELINE_CREATE_2_DERIVATIVE_BIT}. This allows a pipeline to be both a parent and possibly a child in a pipeline hierarchy. See <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a> for more information.</p>
     * 
     * <p>When an implementation is looking up a pipeline in a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#pipelines-cache">pipeline cache</a>, if that pipeline is being created using linked libraries, implementations <b>should</b> always return an equivalent pipeline created with {@link KHRMaintenance5#VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT} if available, whether or not that bit was specified.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Using {@link KHRMaintenance5#VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT} (or not) when linking pipeline libraries is intended as a performance tradeoff between host and device. If the bit is omitted, linking should be faster and produce a pipeline more rapidly, but performance of the pipeline on the target device may be reduced. If the bit is included, linking may be slower but should produce a pipeline with device performance comparable to a monolithically created pipeline. Using both options can allow latency-sensitive applications to generate a suboptimal but usable pipeline quickly, and then perform an optimal link in the background, substituting the result for the suboptimally linked pipeline as soon as it is available.</p>
     * </div>
     */
    public static final long
        VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT              = 0x1L,
        VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT                 = 0x2L,
        VK_PIPELINE_CREATE_2_DERIVATIVE_BIT                        = 0x4L,
        VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT      = 0x8L,
        VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT                     = 0x10L,
        VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x100L,
        VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT           = 0x200L,
        VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT               = 0x8000000L,
        VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT             = 0x40000000L;

    /**
     * VkBufferUsageFlagBits2 - Bitmask controlling how a pipeline is created
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT BUFFER_USAGE_2_TRANSFER_SRC_BIT} specifies that the buffer <b>can</b> be used as the source of a <em>transfer command</em> (see the definition of <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-pipeline-stages-transfer">{@link VK10#VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}</a>).</li>
     * <li>{@link #VK_BUFFER_USAGE_2_TRANSFER_DST_BIT BUFFER_USAGE_2_TRANSFER_DST_BIT} specifies that the buffer <b>can</b> be used as the destination of a transfer command.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT} specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT} specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT BUFFER_USAGE_2_UNIFORM_BUFFER_BIT} specifies that the buffer <b>can</b> be used in a {@link VkDescriptorBufferInfo} suitable for occupying a {@code VkDescriptorSet} slot either of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT BUFFER_USAGE_2_STORAGE_BUFFER_BIT} specifies that the buffer <b>can</b> be used in a {@link VkDescriptorBufferInfo} suitable for occupying a {@code VkDescriptorSet} slot either of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT BUFFER_USAGE_2_INDEX_BUFFER_BIT} specifies that the buffer is suitable for passing as the {@code buffer} parameter to {@link #vkCmdBindIndexBuffer2 CmdBindIndexBuffer2} and {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT BUFFER_USAGE_2_VERTEX_BUFFER_BIT} specifies that the buffer is suitable for passing as an element of the {@code pBuffers} array to {@link VK10#vkCmdBindVertexBuffers CmdBindVertexBuffers}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT BUFFER_USAGE_2_INDIRECT_BUFFER_BIT} specifies that the buffer is suitable for passing as the {@code buffer} parameter to {@link VK10#vkCmdDrawIndirect CmdDrawIndirect}, {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}, {@link NVMeshShader#vkCmdDrawMeshTasksIndirectNV CmdDrawMeshTasksIndirectNV}, {@link NVMeshShader#vkCmdDrawMeshTasksIndirectCountNV CmdDrawMeshTasksIndirectCountNV}, {@code vkCmdDrawMeshTasksIndirectEXT}, {@code vkCmdDrawMeshTasksIndirectCountEXT}, {@link HUAWEIClusterCullingShader#vkCmdDrawClusterIndirectHUAWEI CmdDrawClusterIndirectHUAWEI}, or {@link VK10#vkCmdDispatchIndirect CmdDispatchIndirect}. It is also suitable for passing as the {@code buffer} member of {@link VkIndirectCommandsStreamNV}, or {@code sequencesCountBuffer} or {@code sequencesIndexBuffer} or {@code preprocessedBuffer} member of {@link VkGeneratedCommandsInfoNV}. It is also suitable for passing as the underlying buffer of either the {@code preprocessAddress} or {@code sequenceCountAddress} members of {@link VkGeneratedCommandsInfoEXT}.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT} specifies that the buffer is suitable for passing as the {@code buffer} parameter to {@link EXTConditionalRendering#vkCmdBeginConditionalRenderingEXT CmdBeginConditionalRenderingEXT}.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT} specifies that the buffer is suitable for using for binding as a transform feedback buffer with {@link EXTTransformFeedback#vkCmdBindTransformFeedbackBuffersEXT CmdBindTransformFeedbackBuffersEXT}.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT} specifies that the buffer is suitable for using as a counter buffer with {@link EXTTransformFeedback#vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} and {@link EXTTransformFeedback#vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT}.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT} specifies that the buffer is suitable to contain sampler and combined image sampler descriptors when bound as a descriptor buffer. Buffers containing combined image sampler descriptors <b>must</b> also specify {@link KHRMaintenance5#VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT} specifies that the buffer is suitable to contain resource descriptors when bound as a descriptor buffer.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT} specifies that the buffer, when bound, <b>can</b> be used by the implementation to support push descriptors when using descriptor buffers.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV BUFFER_USAGE_2_RAY_TRACING_BIT_NV} specifies that the buffer is suitable for use in {@link NVRayTracing#vkCmdTraceRaysNV CmdTraceRaysNV}.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR} specifies that the buffer is suitable for use as a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shader-binding-table">Shader Binding Table</a>.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR} specifies that the buffer is suitable for use as a read-only input to an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#acceleration-structure-building">acceleration structure build</a>.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR} specifies that the buffer is suitable for storage space for a {@code VkAccelerationStructureKHR}.</li>
     * <li>{@link #VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT} specifies that the buffer <b>can</b> be used to retrieve a buffer device address via {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress} and use that address to access the buffer’s memory from a shader.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR} specifies that the buffer <b>can</b> be used as the source video bitstream buffer in a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-decode-operations">video decode operation</a>.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR} is reserved for future use.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR} specifies that the buffer <b>can</b> be used as the destination video bitstream buffer in a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-encode-operations">video encode operation</a>.</li>
     * <li>{@link KHRMaintenance5#VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR} is reserved for future use.</li>
     * <li>{@link AMDXShaderEnqueue#VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX} specifies that the buffer <b>can</b> be used for as scratch memory for <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#executiongraphs">execution graph dispatch</a>.</li>
     * <li>{@link EXTDeviceGeneratedCommands#VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT} specifies that the buffer <b>can</b> be used as a preprocess buffer for <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#device-generated-commands">Device-Generated Commands</a>.</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT         = 0x1L,
        VK_BUFFER_USAGE_2_TRANSFER_DST_BIT         = 0x2L,
        VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT = 0x4L,
        VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT = 0x8L,
        VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT       = 0x10L,
        VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT       = 0x20L,
        VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT         = 0x40L,
        VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT        = 0x80L,
        VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT      = 0x100L;

    /**
     * VkHostImageCopyFlagBits - Bitmask specifying additional copy parameters
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_HOST_IMAGE_COPY_MEMCPY HOST_IMAGE_COPY_MEMCPY} specifies that no memory layout swizzling is to be applied during data copy. For copies between memory and images, this flag indicates that image data in host memory is swizzled in exactly the same way as the image data on the device. Using this flag indicates that the implementations <b>may</b> use a simple memory copy to transfer the data between the host memory and the device memory. The format of the swizzled data in host memory is platform dependent and is not defined in this specification.</li>
     * </ul>
     */
    public static final int VK_HOST_IMAGE_COPY_MEMCPY = 0x1;

    /** The API version number for Vulkan 1.4. */
    public static final int VK_API_VERSION_1_4 = VK_MAKE_API_VERSION(0, 1, 4, 0);

    protected VK14() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetLineStipple ] ---

    /**
     * Set line stipple dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the line stipple state, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetLineStippleKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    lineStippleFactor,
     *     uint16_t                                    lineStipplePattern);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetLineStippleEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    lineStippleFactor,
     *     uint16_t                                    lineStipplePattern);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the line stipple state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-objects">shader objects</a>, or when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_LINE_STIPPLE DYNAMIC_STATE_LINE_STIPPLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationLineStateCreateInfo}{@code ::lineStippleFactor} and {@link VkPipelineRasterizationLineStateCreateInfo}{@code ::lineStipplePattern} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code lineStippleFactor} <b>must</b> be in the range <code>[1,256]</code></li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param lineStippleFactor  the repeat factor used in stippled line rasterization.
     * @param lineStipplePattern the bit pattern used in stippled line rasterization.
     */
    public static void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStipple;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }

    // --- [ vkMapMemory2 ] ---

    /** Unsafe version of: {@link #vkMapMemory2 MapMemory2} */
    public static int nvkMapMemory2(VkDevice device, long pMemoryMapInfo, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pMemoryMapInfo, ppData, __functionAddress);
    }

    /**
     * Map a memory object into application address space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to retrieve a host virtual address pointer to a region of a mappable memory object, call:</p>
     * 
     * <pre><code>
     * VkResult vkMapMemory2KHR(
     *     VkDevice                                    device,
     *     const VkMemoryMapInfo*                      pMemoryMapInfo,
     *     void**                                      ppData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function behaves identically to {@link VK10#vkMapMemory MapMemory} except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMemoryMapInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryMapInfo} structure</li>
     * <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
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
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryMapInfo}</p>
     *
     * @param device         the logical device that owns the memory.
     * @param pMemoryMapInfo a pointer to a {@link VkMemoryMapInfo} structure describing parameters of the map.
     * @param ppData         a pointer to a {@code void *} variable in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus {@link VkMemoryMapInfo}{@code ::offset} <b>must</b> be aligned to at least {@link VkPhysicalDeviceLimits}{@code ::minMemoryMapAlignment}.
     */
    @NativeType("VkResult")
    public static int vkMapMemory2(VkDevice device, @NativeType("VkMemoryMapInfo const *") VkMemoryMapInfo pMemoryMapInfo, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(ppData, 1);
        }
        return nvkMapMemory2(device, pMemoryMapInfo.address(), memAddress(ppData));
    }

    // --- [ vkUnmapMemory2 ] ---

    /** Unsafe version of: {@link #vkUnmapMemory2 UnmapMemory2} */
    public static int nvkUnmapMemory2(VkDevice device, long pMemoryUnmapInfo) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pMemoryUnmapInfo, __functionAddress);
    }

    /**
     * Unmap a previously mapped memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to unmap a memory object once host access to it is no longer needed by the application, call:</p>
     * 
     * <pre><code>
     * VkResult vkUnmapMemory2KHR(
     *     VkDevice                                    device,
     *     const VkMemoryUnmapInfo*                    pMemoryUnmapInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function behaves identically to {@link VK10#vkUnmapMemory UnmapMemory} except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMemoryUnmapInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryUnmapInfo} structure</li>
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
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryUnmapInfo}</p>
     *
     * @param device           the logical device that owns the memory.
     * @param pMemoryUnmapInfo a pointer to a {@link VkMemoryUnmapInfo} structure describing parameters of the unmap.
     */
    @NativeType("VkResult")
    public static int vkUnmapMemory2(VkDevice device, @NativeType("VkMemoryUnmapInfo const *") VkMemoryUnmapInfo pMemoryUnmapInfo) {
        return nvkUnmapMemory2(device, pMemoryUnmapInfo.address());
    }

    // --- [ vkCmdBindIndexBuffer2 ] ---

    /**
     * Bind an index buffer to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To bind an index buffer, along with its size, to a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindIndexBuffer2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkDeviceSize                                size,
     *     VkIndexType                                 indexType);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code size} specifies the bound size of the index buffer starting from {@code offset}. If {@code size} is {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} then the bound size is from {@code offset} to the end of the {@code buffer}.</p>
     * 
     * <p>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-maintenance6">{@code maintenance6}</a> feature is enabled, {@code buffer} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. If {@code buffer} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, every index fetched results in a value of zero.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
     * <li>The sum of {@code offset} and the base address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, <b>must</b> be a multiple of the size of the type indicated by {@code indexType}</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDEX_BUFFER_BIT BUFFER_USAGE_INDEX_BUFFER_BIT} flag</li>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code indexType} <b>must</b> not be {@link KHRAccelerationStructure#VK_INDEX_TYPE_NONE_KHR INDEX_TYPE_NONE_KHR}</li>
     * <li>If {@code indexType} is {@link #VK_INDEX_TYPE_UINT8 INDEX_TYPE_UINT8}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-indexTypeUint8">{@code indexTypeUint8}</a> feature <b>must</b> be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-maintenance6">{@code maintenance6}</a> feature is not enabled, {@code buffer} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If {@code buffer} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, offset <b>must</b> be zero</li>
     * <li>If {@code size} is not {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be a multiple of the size of the type indicated by {@code indexType}</li>
     * <li>If {@code size} is not {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, the sum of {@code offset} and {@code size} <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>Both of {@code buffer}, and {@code commandBuffer} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param buffer        the buffer being bound.
     * @param offset        the starting offset in bytes within {@code buffer} used in index buffer address calculations.
     * @param size          the size in bytes of index data bound from {@code buffer}.
     * @param indexType     a {@code VkIndexType} value specifying the size of the indices.
     */
    public static void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), buffer, offset, size, indexType, __functionAddress);
    }

    // --- [ vkGetRenderingAreaGranularity ] ---

    /** Unsafe version of: {@link #vkGetRenderingAreaGranularity GetRenderingAreaGranularity} */
    public static void nvkGetRenderingAreaGranularity(VkDevice device, long pRenderingAreaInfo, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderingAreaGranularity;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pRenderingAreaInfo, pGranularity, __functionAddress);
    }

    /**
     * Returns the granularity for dynamic rendering optimal render area.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the render area granularity for a render pass instance, call:</p>
     * 
     * <pre><code>
     * void vkGetRenderingAreaGranularityKHR(
     *     VkDevice                                    device,
     *     const VkRenderingAreaInfo*                  pRenderingAreaInfo,
     *     VkExtent2D*                                 pGranularity);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The conditions leading to an optimal {@code renderArea} are:</p>
     * 
     * <ul>
     * <li>the {@code offset.x} member in {@code renderArea} is a multiple of the {@code width} member of the returned {@link VkExtent2D} (the horizontal granularity).</li>
     * <li>the {@code offset.y} member in {@code renderArea} is a multiple of the {@code height} member of the returned {@link VkExtent2D} (the vertical granularity).</li>
     * <li>either the {@code extent.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x}+{@code extent.width} is equal to the {@code width} of each attachment used in the render pass instance.</li>
     * <li>either the {@code extent.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y}+{@code extent.height} is equal to the {@code height} of each attachment used in the render pass instance.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pRenderingAreaInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingAreaInfo} structure</li>
     * <li>{@code pGranularity} <b>must</b> be a valid pointer to a {@link VkExtent2D} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExtent2D}, {@link VkRenderingAreaInfo}</p>
     *
     * @param device             the logical device that owns the render pass instance.
     * @param pRenderingAreaInfo a pointer to a {@link VkRenderingAreaInfo} structure specifying details of the render pass instance to query the render area granularity for.
     * @param pGranularity       a pointer to a {@link VkExtent2D} structure in which the granularity is returned.
     */
    public static void vkGetRenderingAreaGranularity(VkDevice device, @NativeType("VkRenderingAreaInfo const *") VkRenderingAreaInfo pRenderingAreaInfo, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderingAreaGranularity(device, pRenderingAreaInfo.address(), pGranularity.address());
    }

    // --- [ vkGetDeviceImageSubresourceLayout ] ---

    /** Unsafe version of: {@link #vkGetDeviceImageSubresourceLayout GetDeviceImageSubresourceLayout} */
    public static void nvkGetDeviceImageSubresourceLayout(VkDevice device, long pInfo, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSubresourceLayout;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageSubresourceInfo.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pLayout, __functionAddress);
    }

    /**
     * Retrieve information about an image subresource without an image object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the memory layout of an image subresource, without an image object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageSubresourceLayoutKHR(
     *     VkDevice                                    device,
     *     const VkDeviceImageSubresourceInfo*         pInfo,
     *     VkSubresourceLayout2*                       pLayout);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetDeviceImageSubresourceLayout} behaves similarly to {@link #vkGetImageSubresourceLayout2 GetImageSubresourceLayout2}, but uses a {@link VkImageCreateInfo} structure to specify the image rather than a {@code VkImage} object.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceImageSubresourceInfo} structure</li>
     * <li>{@code pLayout} <b>must</b> be a valid pointer to a {@link VkSubresourceLayout2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceImageSubresourceInfo}, {@link VkSubresourceLayout2}</p>
     *
     * @param device  the logical device that owns the image.
     * @param pInfo   a pointer to a {@link VkDeviceImageSubresourceInfo} structure containing parameters required for the subresource layout query.
     * @param pLayout a pointer to a {@link VkSubresourceLayout2} structure in which the layout is returned.
     */
    public static void vkGetDeviceImageSubresourceLayout(VkDevice device, @NativeType("VkDeviceImageSubresourceInfo const *") VkDeviceImageSubresourceInfo pInfo, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetDeviceImageSubresourceLayout(device, pInfo.address(), pLayout.address());
    }

    // --- [ vkGetImageSubresourceLayout2 ] ---

    /** Unsafe version of: {@link #vkGetImageSubresourceLayout2 GetImageSubresourceLayout2} */
    public static void nvkGetImageSubresourceLayout2(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /**
     * Retrieve information about an image subresource.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the memory layout of an image subresource, call:</p>
     * 
     * <pre><code>
     * void vkGetImageSubresourceLayout2KHR(
     *     VkDevice                                    device,
     *     VkImage                                     image,
     *     const VkImageSubresource2*                  pSubresource,
     *     VkSubresourceLayout2*                       pLayout);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetImageSubresourceLayout2EXT(
     *     VkDevice                                    device,
     *     VkImage                                     image,
     *     const VkImageSubresource2*                  pSubresource,
     *     VkSubresourceLayout2*                       pLayout);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetImageSubresourceLayout2} behaves similarly to {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}, with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.</p>
     * 
     * <p>It is legal to call {@code vkGetImageSubresourceLayout2} with an {@code image} created with {@code tiling} equal to {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, but the members of {@link VkSubresourceLayout2}{@code ::subresourceLayout} will have undefined values in this case.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Structures chained from {@link VkImageSubresource2}{@code ::pNext} will also be updated when {@code tiling} is equal to {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
     * <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in {@code image}</li>
     * <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in {@code image}</li>
     * <li>If {@code format} of the {@code image} is a color format that is not a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, and {@code tiling} of the {@code image} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
     * <li>If {@code format} of the {@code image} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</li>
     * <li>If {@code format} of the {@code image} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
     * <li>If {@code format} of the {@code image} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
     * <li>If the {@code tiling} of the {@code image} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and has a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
     * <li>If {@code image} was created with the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID} external memory handle type, then {@code image} <b>must</b> be bound to memory</li>
     * <li>If the {@code tiling} of the {@code image} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> and the index <em>i</em> <b>must</b> be less than the {@link VkDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and {@link VkImageDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifier}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
     * <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid {@link VkImageSubresource2} structure</li>
     * <li>{@code pLayout} <b>must</b> be a valid pointer to a {@link VkSubresourceLayout2} structure</li>
     * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageSubresource2}, {@link VkSubresourceLayout2}</p>
     *
     * @param device       the logical device that owns the image.
     * @param image        the image whose layout is being queried.
     * @param pSubresource a pointer to a {@link VkImageSubresource2} structure selecting a specific image for the image subresource.
     * @param pLayout      a pointer to a {@link VkSubresourceLayout2} structure in which the layout is returned.
     */
    public static void vkGetImageSubresourceLayout2(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2(device, image, pSubresource.address(), pLayout.address());
    }

    // --- [ vkCmdPushDescriptorSet ] ---

    /**
     * Unsafe version of: {@link #vkCmdPushDescriptorSet CmdPushDescriptorSet}
     *
     * @param descriptorWriteCount the number of elements in the {@code pDescriptorWrites} array.
     */
    public static void nvkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, long pDescriptorWrites) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(commandBuffer.address(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites, __functionAddress);
    }

    /**
     * Pushes descriptor updates into a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>In addition to allocating descriptor sets and binding them to a command buffer, an application <b>can</b> record descriptor updates into the command buffer.</p>
     * 
     * <p>To push descriptor updates into a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushDescriptorSetKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineBindPoint                         pipelineBindPoint,
     *     VkPipelineLayout                            layout,
     *     uint32_t                                    set,
     *     uint32_t                                    descriptorWriteCount,
     *     const VkWriteDescriptorSet*                 pDescriptorWrites);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p><em>Push descriptors</em> are a small bank of descriptors whose storage is internally managed by the command buffer rather than being written into a descriptor set and later bound to a command buffer. Push descriptors allow for incremental updates of descriptors without managing the lifetime of descriptor sets.</p>
     * 
     * <p>When a command buffer begins recording, all push descriptors are undefined. Push descriptors <b>can</b> be updated incrementally and cause shaders to use the updated descriptors for subsequent <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#pipelines-bindpoint-commands">bound pipeline commands</a> with the pipeline type set by {@code pipelineBindPoint} until the descriptor is overwritten, or else until the set is disturbed as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a>. When the set is disturbed or push descriptors with a different descriptor set layout are set, all push descriptors are undefined.</p>
     * 
     * <p>Push descriptors that are <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-staticuse">statically used</a> by a pipeline <b>must</b> not be undefined at the time that a drawing or dispatching command is recorded to execute using that pipeline. This includes immutable sampler descriptors, which <b>must</b> be pushed before they are accessed by a pipeline (the immutable samplers are pushed, rather than the samplers in {@code pDescriptorWrites}). Push descriptors that are not statically used <b>can</b> remain undefined.</p>
     * 
     * <p>Push descriptors do not use dynamic offsets. Instead, the corresponding non-dynamic descriptor types <b>can</b> be used and the {@code offset} member of {@link VkDescriptorBufferInfo} <b>can</b> be changed each time the descriptor is written.</p>
     * 
     * <p>Each element of {@code pDescriptorWrites} is interpreted as in {@link VkWriteDescriptorSet}, except the {@code dstSet} member is ignored.</p>
     * 
     * <p>To push an immutable sampler, use a {@link VkWriteDescriptorSet} with {@code dstBinding} and {@code dstArrayElement} selecting the immutable sampler’s binding. If the descriptor type is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout. If the descriptor type is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, the {@code sampler} member of the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code set} <b>must</b> be less than {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
     * <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with {@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT}</li>
     * <li>For each element <code>i</code> where {@code pDescriptorWrites}[i].{@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, {@code pDescriptorWrites}[i].{@code pImageInfo} <b>must</b> be a valid pointer to an array of {@code pDescriptorWrites}[i].{@code descriptorCount} valid {@link VkDescriptorImageInfo} structures</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
     * <li>{@code pDescriptorWrites} <b>must</b> be a valid pointer to an array of {@code descriptorWriteCount} valid {@link VkWriteDescriptorSet} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code descriptorWriteCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkWriteDescriptorSet}</p>
     *
     * @param commandBuffer     the command buffer that the descriptors will be recorded in.
     * @param pipelineBindPoint a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors. There is a separate set of push descriptor bindings for each pipeline type, so binding one does not disturb the others.
     * @param layout            a {@code VkPipelineLayout} object used to program the bindings.
     * @param set               the set number of the descriptor set in the pipeline layout that will be updated.
     * @param pDescriptorWrites a pointer to an array of {@link VkWriteDescriptorSet} structures describing the descriptors to be updated.
     */
    public static void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer pDescriptorWrites) {
        nvkCmdPushDescriptorSet(commandBuffer, pipelineBindPoint, layout, set, pDescriptorWrites.remaining(), pDescriptorWrites.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplate ] ---

    /**
     * Pushes descriptor updates into a command buffer using a descriptor update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>It is also possible to use a descriptor update template to specify the push descriptors to update. To do so, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushDescriptorSetWithTemplateKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
     *     VkPipelineLayout                            layout,
     *     uint32_t                                    set,
     *     const void*                                 pData);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code pipelineBindPoint} specified during the creation of the descriptor update template <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to a memory containing one or more valid instances of {@link VkDescriptorImageInfo}, {@link VkDescriptorBufferInfo}, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with {@link VK11#vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate}</li>
     * <li>{@code layout} <b>must</b> be compatible with the layout used to create {@code descriptorUpdateTemplate}</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> have been created with a {@code templateType} of {@link #VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS}</li>
     * <li>{@code set} <b>must</b> be the same value used to create {@code descriptorUpdateTemplate}</li>
     * <li>{@code set} <b>must</b> be less than {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
     * <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with {@link #VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>Each of {@code commandBuffer}, {@code descriptorUpdateTemplate}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <pre><code>
     * struct AppDataStructure
     * {
     *     VkDescriptorImageInfo  imageInfo;          // a single image info
     *     // ... some more application-related data
     * };
     * 
     * const VkDescriptorUpdateTemplateEntry descriptorUpdateTemplateEntries[] =
     * {
     *     // binding to a single image descriptor
     *     {
     *         .binding = 0,
     *         .dstArrayElement = 0,
     *         .descriptorCount = 1,
     *         .descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,
     *         .offset = offsetof(AppDataStructure, imageInfo),
     *         .stride = 0     // not required if descriptorCount is 1
     *     }
     * };
     * 
     * // create a descriptor update template for push descriptor set updates
     * const VkDescriptorUpdateTemplateCreateInfo createInfo =
     * {
     *     .sType = VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO,
     *     .pNext = NULL,
     *     .flags = 0,
     *     .descriptorUpdateEntryCount = 1,
     *     .pDescriptorUpdateEntries = descriptorUpdateTemplateEntries,
     *     .templateType = VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS,
     *     .descriptorSetLayout = 0,   // ignored by given templateType
     *     .pipelineBindPoint = VK_PIPELINE_BIND_POINT_GRAPHICS,
     *     .pipelineLayout = myPipelineLayout,
     *     .set = 0,
     * };
     * 
     * VkDescriptorUpdateTemplate myDescriptorUpdateTemplate;
     * myResult = vkCreateDescriptorUpdateTemplate(
     *     myDevice,
     *     &amp;createInfo,
     *     NULL,
     *     &amp;myDescriptorUpdateTemplate);
     * 
     * AppDataStructure appData;
     * // fill appData here or cache it in your engine
     * vkCmdPushDescriptorSetWithTemplate(myCmdBuffer, myDescriptorUpdateTemplate, myPipelineLayout, 0,&amp;appData);</code></pre>
     *
     * @param commandBuffer            the command buffer that the descriptors will be recorded in.
     * @param descriptorUpdateTemplate a descriptor update template defining how to interpret the descriptor information in {@code pData}.
     * @param layout                   a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle.
     * @param set                      the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle.
     * @param pData                    a pointer to memory containing descriptors for the templated update.
     */
    public static void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("void const *") long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(commandBuffer.address(), descriptorUpdateTemplate, layout, set, pData, __functionAddress);
    }

    // --- [ vkCmdSetRenderingAttachmentLocations ] ---

    /** Unsafe version of: {@link #vkCmdSetRenderingAttachmentLocations CmdSetRenderingAttachmentLocations} */
    public static void nvkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, long pLocationInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingAttachmentLocations;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLocationInfo, __functionAddress);
    }

    /**
     * Set color attachment location mappings for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set the fragment output location mappings during rendering, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRenderingAttachmentLocationsKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingAttachmentLocationInfo*    pLocationInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the attachment location mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the bound pipeline, if one is bound, which <b>can</b> be set by chaining {@link VkRenderingAttachmentLocationInfo} to {@link VkGraphicsPipelineCreateInfo}.</p>
     * 
     * <p>Until this command is called, mappings in the command buffer state are treated as each color attachment specified in {@link VK13#vkCmdBeginRendering CmdBeginRendering} having a location equal to its index in {@link VkRenderingInfo}{@code ::pColorAttachments}. This state is reset whenever {@link VK13#vkCmdBeginRendering CmdBeginRendering} is called.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
     * <li>{@code pLocationInfo→colorAttachmentCount} <b>must</b> be equal to the value of {@link VkRenderingInfo}{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
     * <li>The current render pass instance <b>must</b> have been started or resumed by {@link VK13#vkCmdBeginRendering CmdBeginRendering} in this {@code commandBuffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pLocationInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingAttachmentLocationInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingAttachmentLocationInfo}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pLocationInfo a {@link VkRenderingAttachmentLocationInfo} structure indicating the new mappings.
     */
    public static void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, @NativeType("VkRenderingAttachmentLocationInfo const *") VkRenderingAttachmentLocationInfo pLocationInfo) {
        nvkCmdSetRenderingAttachmentLocations(commandBuffer, pLocationInfo.address());
    }

    // --- [ vkCmdSetRenderingInputAttachmentIndices ] ---

    /** Unsafe version of: {@link #vkCmdSetRenderingInputAttachmentIndices CmdSetRenderingInputAttachmentIndices} */
    public static void nvkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, long pInputAttachmentIndexInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingInputAttachmentIndices;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInputAttachmentIndexInfo, __functionAddress);
    }

    /**
     * Set input attachment index mappings for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set the input attachment index mappings during dynamic rendering, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRenderingInputAttachmentIndicesKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingInputAttachmentIndexInfo*  pInputAttachmentIndexInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the input attachment index mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the bound pipeline, if one is bound, which <b>can</b> be set by chaining {@link VkRenderingInputAttachmentIndexInfo} to {@link VkGraphicsPipelineCreateInfo}.</p>
     * 
     * <p>Until this command is called, mappings in the command buffer state are treated as each color attachment specified in {@link VK13#vkCmdBeginRendering CmdBeginRendering} mapping to subpass inputs with a {@code InputAttachmentIndex} equal to its index in {@link VkRenderingInfo}{@code ::pColorAttachments}, and depth/stencil attachments mapping to input attachments without these decorations. This state is reset whenever {@link VK13#vkCmdBeginRendering CmdBeginRendering} is called.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
     * <li>{@code pInputAttachmentIndexInfo→colorAttachmentCount} <b>must</b> be equal to the value of {@link VkRenderingInfo}{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
     * <li>The current render pass instance <b>must</b> have been started or resumed by {@link VK13#vkCmdBeginRendering CmdBeginRendering} in this {@code commandBuffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInputAttachmentIndexInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingInputAttachmentIndexInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingInputAttachmentIndexInfo}</p>
     *
     * @param commandBuffer             the command buffer into which the command will be recorded.
     * @param pInputAttachmentIndexInfo a {@link VkRenderingInputAttachmentIndexInfo} structure indicating the new mappings.
     */
    public static void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInputAttachmentIndexInfo const *") VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo) {
        nvkCmdSetRenderingInputAttachmentIndices(commandBuffer, pInputAttachmentIndexInfo.address());
    }

    // --- [ vkCmdBindDescriptorSets2 ] ---

    /** Unsafe version of: {@link #vkCmdBindDescriptorSets2 CmdBindDescriptorSets2} */
    public static void nvkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, long pBindDescriptorSetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets2;
        if (CHECKS) {
            check(__functionAddress);
            VkBindDescriptorSetsInfo.validate(pBindDescriptorSetsInfo);
        }
        callPPV(commandBuffer.address(), pBindDescriptorSetsInfo, __functionAddress);
    }

    /**
     * Binds descriptor sets to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to bind one or more descriptor sets to a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindDescriptorSets2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkBindDescriptorSetsInfo*             pBindDescriptorSetsInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Each bit in {@code pBindDescriptorSetsInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBindDescriptorSetsInfo} <b>must</b> be a valid pointer to a valid {@link VkBindDescriptorSetsInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindDescriptorSetsInfo}</p>
     *
     * @param commandBuffer           the command buffer that the descriptor sets will be bound to.
     * @param pBindDescriptorSetsInfo a pointer to a {@link VkBindDescriptorSetsInfo} structure.
     */
    public static void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorSetsInfo const *") VkBindDescriptorSetsInfo pBindDescriptorSetsInfo) {
        nvkCmdBindDescriptorSets2(commandBuffer, pBindDescriptorSetsInfo.address());
    }

    // --- [ vkCmdPushConstants2 ] ---

    /** Unsafe version of: {@link #vkCmdPushConstants2 CmdPushConstants2} */
    public static void nvkCmdPushConstants2(VkCommandBuffer commandBuffer, long pPushConstantsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants2;
        if (CHECKS) {
            check(__functionAddress);
            VkPushConstantsInfo.validate(pPushConstantsInfo);
        }
        callPPV(commandBuffer.address(), pPushConstantsInfo, __functionAddress);
    }

    /**
     * Update the values of push constants.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to update push constants, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushConstants2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPushConstantsInfo*                  pPushConstantsInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pPushConstantsInfo} <b>must</b> be a valid pointer to a valid {@link VkPushConstantsInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPushConstantsInfo}</p>
     *
     * @param commandBuffer      the command buffer in which the push constant update will be recorded.
     * @param pPushConstantsInfo a pointer to a {@link VkPushConstantsInfo} structure.
     */
    public static void vkCmdPushConstants2(VkCommandBuffer commandBuffer, @NativeType("VkPushConstantsInfo const *") VkPushConstantsInfo pPushConstantsInfo) {
        nvkCmdPushConstants2(commandBuffer, pPushConstantsInfo.address());
    }

    // --- [ vkCmdPushDescriptorSet2 ] ---

    /** Unsafe version of: {@link #vkCmdPushDescriptorSet2 CmdPushDescriptorSet2} */
    public static void nvkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, long pPushDescriptorSetInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet2;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetInfo.validate(pPushDescriptorSetInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetInfo, __functionAddress);
    }

    /**
     * Pushes descriptor updates into a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to push descriptor updates into a command buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushDescriptorSet2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPushDescriptorSetInfo*              pPushDescriptorSetInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Each bit in {@code pPushDescriptorSetInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pPushDescriptorSetInfo} <b>must</b> be a valid pointer to a valid {@link VkPushDescriptorSetInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPushDescriptorSetInfo}</p>
     *
     * @param commandBuffer          the command buffer that the descriptors will be recorded in.
     * @param pPushDescriptorSetInfo a pointer to a {@link VkPushDescriptorSetInfo} structure.
     */
    public static void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetInfo const *") VkPushDescriptorSetInfo pPushDescriptorSetInfo) {
        nvkCmdPushDescriptorSet2(commandBuffer, pPushDescriptorSetInfo.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplate2 ] ---

    /** Unsafe version of: {@link #vkCmdPushDescriptorSetWithTemplate2 CmdPushDescriptorSetWithTemplate2} */
    public static void nvkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, long pPushDescriptorSetWithTemplateInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate2;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetWithTemplateInfo.validate(pPushDescriptorSetWithTemplateInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetWithTemplateInfo, __functionAddress);
    }

    /**
     * Pushes descriptor updates into a command buffer using a descriptor update template.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to use a descriptor update template to specify the push descriptors to update, call:</p>
     * 
     * <pre><code>
     * void vkCmdPushDescriptorSetWithTemplate2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPushDescriptorSetWithTemplateInfo*  pPushDescriptorSetWithTemplateInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pPushDescriptorSetWithTemplateInfo} <b>must</b> be a valid pointer to a valid {@link VkPushDescriptorSetWithTemplateInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPushDescriptorSetWithTemplateInfo}</p>
     *
     * @param commandBuffer                      the command buffer that the descriptors will be recorded in.
     * @param pPushDescriptorSetWithTemplateInfo a pointer to a {@link VkPushDescriptorSetWithTemplateInfo} structure.
     */
    public static void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetWithTemplateInfo const *") VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo) {
        nvkCmdPushDescriptorSetWithTemplate2(commandBuffer, pPushDescriptorSetWithTemplateInfo.address());
    }

    // --- [ vkCopyMemoryToImage ] ---

    /** Unsafe version of: {@link #vkCopyMemoryToImage CopyMemoryToImage} */
    public static int nvkCopyMemoryToImage(VkDevice device, long pCopyMemoryToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToImage;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyMemoryToImageInfo.validate(pCopyMemoryToImageInfo);
        }
        return callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    /**
     * Copy data from host memory into an image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from host memory to an image object, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyMemoryToImageEXT(
     *     VkDevice                                    device,
     *     const VkCopyMemoryToImageInfo*              pCopyMemoryToImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally similar to {@link VK13#vkCmdCopyBufferToImage2 CmdCopyBufferToImage2}, except it is executed on the host and reads from host memory instead of a buffer. The memory of {@code pCopyMemoryToImageInfo→dstImage} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-coherent">coherent</a>.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Because queue submissions <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-submission-host-writes">automatically make host memory visible to the device</a>, there would not be a need for a memory barrier before using the results of this copy operation on the device.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCopyMemoryToImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMemoryToImageInfo} structure</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMemoryToImageInfo}</p>
     *
     * @param device                 the device which owns {@code pCopyMemoryToImageInfo→dstImage}.
     * @param pCopyMemoryToImageInfo a pointer to a {@link VkCopyMemoryToImageInfo} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyMemoryToImage(VkDevice device, @NativeType("VkCopyMemoryToImageInfo const *") VkCopyMemoryToImageInfo pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImage(device, pCopyMemoryToImageInfo.address());
    }

    // --- [ vkCopyImageToMemory ] ---

    /** Unsafe version of: {@link #vkCopyImageToMemory CopyImageToMemory} */
    public static int nvkCopyImageToMemory(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemory;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToMemoryInfo.validate(pCopyImageToMemoryInfo);
        }
        return callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    /**
     * Copy image data into host memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from an image object to host memory, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyImageToMemoryEXT(
     *     VkDevice                                    device,
     *     const VkCopyImageToMemoryInfo*              pCopyImageToMemoryInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally similar to {@link VK13#vkCmdCopyImageToBuffer2 CmdCopyImageToBuffer2}, except it is executed on the host and writes to host memory instead of a buffer. The memory of {@code pCopyImageToMemoryInfo→srcImage} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-coherent">coherent</a>.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If the device has written to the image memory, it is not automatically made available to the host. Before this copy command can be called, a memory barrier for this image <b>must</b> have been issued on the device with the second <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> including {@link VK10#VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} and {@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCopyImageToMemoryInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageToMemoryInfo} structure</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageToMemoryInfo}</p>
     *
     * @param device                 the device which owns {@code pCopyImageToMemoryInfo→srcImage}.
     * @param pCopyImageToMemoryInfo a pointer to a {@link VkCopyImageToMemoryInfo} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyImageToMemory(VkDevice device, @NativeType("VkCopyImageToMemoryInfo const *") VkCopyImageToMemoryInfo pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemory(device, pCopyImageToMemoryInfo.address());
    }

    // --- [ vkCopyImageToImage ] ---

    /** Unsafe version of: {@link #vkCopyImageToImage CopyImageToImage} */
    public static int nvkCopyImageToImage(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImage;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToImageInfo.validate(pCopyImageToImageInfo);
        }
        return callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    /**
     * Copy image data using the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from an image object to another image object using the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyImageToImageEXT(
     *     VkDevice                                    device,
     *     const VkCopyImageToImageInfo*               pCopyImageToImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally similar to {@link VK13#vkCmdCopyImage2 CmdCopyImage2}, except it is executed on the host. The memory of {@code pCopyImageToImageInfo→srcImage} and {@code pCopyImageToImageInfo→dstImage} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-coherent">coherent</a>.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If the device has written to the memory of {@code pCopyImageToImageInfo→srcImage}, it is not automatically made available to the host. Before this copy command can be called, a memory barrier for this image <b>must</b> have been issued on the device with the second <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> including {@link VK10#VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} and {@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}.</p>
     * 
     * <p>Because queue submissions <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-submission-host-writes">automatically make host memory visible to the device</a>, there would not be a need for a memory barrier before using the results of this copy operation in {@code pCopyMemoryToImageInfo→dstImage} on the device.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCopyImageToImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageToImageInfo} structure</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageToImageInfo}</p>
     *
     * @param device                the device which owns {@code pCopyImageToImageInfo→srcImage} and {@code pCopyImageToImageInfo→dstImage}.
     * @param pCopyImageToImageInfo a pointer to a {@link VkCopyImageToImageInfo} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyImageToImage(VkDevice device, @NativeType("VkCopyImageToImageInfo const *") VkCopyImageToImageInfo pCopyImageToImageInfo) {
        return nvkCopyImageToImage(device, pCopyImageToImageInfo.address());
    }

    // --- [ vkTransitionImageLayout ] ---

    /**
     * Unsafe version of: {@link #vkTransitionImageLayout TransitionImageLayout}
     *
     * @param transitionCount the number of image layout transitions to perform.
     */
    public static int nvkTransitionImageLayout(VkDevice device, int transitionCount, long pTransitions) {
        long __functionAddress = device.getCapabilities().vkTransitionImageLayout;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), transitionCount, pTransitions, __functionAddress);
    }

    /**
     * Perform an image layout transition on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To perform an image layout transition on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkTransitionImageLayoutEXT(
     *     VkDevice                                    device,
     *     uint32_t                                    transitionCount,
     *     const VkHostImageLayoutTransitionInfo*      pTransitions);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pTransitions} <b>must</b> be a valid pointer to an array of {@code transitionCount} valid {@link VkHostImageLayoutTransitionInfo} structures</li>
     * <li>{@code transitionCount} <b>must</b> be greater than 0</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkHostImageLayoutTransitionInfo}</p>
     *
     * @param device       the device which owns {@code pTransitions}[i].{@code image}.
     * @param pTransitions a pointer to an array of {@link VkHostImageLayoutTransitionInfo} structures specifying the image and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-views">subresource ranges</a> within them to transition.
     */
    @NativeType("VkResult")
    public static int vkTransitionImageLayout(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfo const *") VkHostImageLayoutTransitionInfo.Buffer pTransitions) {
        return nvkTransitionImageLayout(device, pTransitions.remaining(), pTransitions.address());
    }

}