/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core Vulkan 1.3 functionality.
 * 
 * <p>Vulkan Version 1.3 <em>promoted</em> a number of key extensions into the core API:</p>
 * 
 * <ul>
 * <li>{@link KHRCopyCommands2 KHR_copy_commands2}</li>
 * <li>{@link KHRDynamicRendering KHR_dynamic_rendering}</li>
 * <li>{@link KHRFormatFeatureFlags2 KHR_format_feature_flags2}</li>
 * <li>{@link KHRMaintenance4 KHR_maintenance4}</li>
 * <li>{@link KHRShaderIntegerDotProduct KHR_shader_integer_dot_product}</li>
 * <li>{@link KHRShaderNonSemanticInfo KHR_shader_non_semantic_info}</li>
 * <li>{@link KHRShaderTerminateInvocation KHR_shader_terminate_invocation}</li>
 * <li>{@link KHRSynchronization2 KHR_synchronization2}</li>
 * <li>{@link KHRZeroInitializeWorkgroupMemory KHR_zero_initialize_workgroup_memory}</li>
 * <li>{@link EXT4444Formats EXT_4444_formats}</li>
 * <li>{@link EXTExtendedDynamicState EXT_extended_dynamic_state}</li>
 * <li>{@link EXTExtendedDynamicState2 EXT_extended_dynamic_state2}</li>
 * <li>{@link EXTImageRobustness EXT_image_robustness}</li>
 * <li>{@link EXTInlineUniformBlock EXT_inline_uniform_block}</li>
 * <li>{@link EXTPipelineCreationCacheControl EXT_pipeline_creation_cache_control}</li>
 * <li>{@link EXTPipelineCreationFeedback EXT_pipeline_creation_feedback}</li>
 * <li>{@link EXTPrivateData EXT_private_data}</li>
 * <li>{@link EXTShaderDemoteToHelperInvocation EXT_shader_demote_to_helper_invocation}</li>
 * <li>{@link EXTSubgroupSizeControl EXT_subgroup_size_control}</li>
 * <li>{@link EXTTexelBufferAlignment EXT_texel_buffer_alignment}</li>
 * <li>{@link EXTTextureCompressionAstcHdr EXT_texture_compression_astc_hdr}</li>
 * <li>{@link EXTToolingInfo EXT_tooling_info}</li>
 * <li>{@link EXTYcbcr2plane444Formats EXT_ycbcr_2plane_444_formats}</li>
 * </ul>
 * 
 * <p>All differences in behavior between these extensions and the corresponding Vulkan 1.3 functionality are summarized below.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_4444_formats}</h3>
 * 
 * <p>If the {@code VK_EXT_4444_formats} extension is not supported, support for all formats defined by it are optional in Vulkan 1.3. There are no
 * members in the {@link VkPhysicalDeviceVulkan13Features} structure corresponding to the {@link VkPhysicalDevice4444FormatsFeaturesEXT} structure.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_extended_dynamic_state}</h3>
 * 
 * <p>All dynamic state enumerants and entry points defined by {@code VK_EXT_extended_dynamic_state} are required in Vulkan 1.3. There are no members in
 * the {@link VkPhysicalDeviceVulkan13Features} structure corresponding to the {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} structure.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_extended_dynamic_state2}</h3>
 * 
 * <p>The optional dynamic state enumerants and entry points defined by {@code VK_EXT_extended_dynamic_state2} for patch control points and logic op are
 * not promoted in Vulkan 1.3. There are no members in the {@link VkPhysicalDeviceVulkan13Features} structure corresponding to the
 * {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} structure.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_texel_buffer_alignment}</h3>
 * 
 * <p>The more specific alignment requirements defined by {@link VkPhysicalDeviceTexelBufferAlignmentProperties} are required in Vulkan 1.3. There are no
 * members in the {@link VkPhysicalDeviceVulkan13Features} structure corresponding to the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} structure.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_texture_compression_astc_hdr}</h3>
 * 
 * <p>If the {@code VK_EXT_texture_compression_astc_hdr} extension is not supported, support for all formats defined by it are optional in Vulkan 1.3.
 * The {@code textureCompressionASTC_HDR} member of {@link VkPhysicalDeviceVulkan13Features} indicates whether a Vulkan 1.3 implementation supports these
 * formats.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_ycbcr_2plane_444_formats}</h3>
 * 
 * <p>If the {@code VK_EXT_ycbcr_2plane_444_formats} extension is not supported, support for all formats defined by it are optional in Vulkan 1.3. There
 * are no members in the {@link VkPhysicalDeviceVulkan13Features} structure corresponding to the {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT}
 * structure.</p>
 * 
 * <h3>Additional Vulkan 1.3 Feature Support</h3>
 * 
 * <p>In addition to the promoted extensions described above, Vulkan 1.3 added required support for:</p>
 * 
 * <ul>
 * <li>SPIR-V version 1.6. SPIR-V 1.6 deprecates (but does not remove) the WorkgroupSize decoration.</li>
 * <li>The {@code bufferDeviceAddress} feature which indicates support for accessing memory in shaders as storage buffers via
 * {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}.</li>
 * <li>The {@code vulkanMemoryModel}, {@code vulkanMemoryModelDeviceScope}, and {@code vulkanMemoryModelAvailabilityVisibilityChains} features, which
 * indicate support for the corresponding Vulkan Memory Model capabilities.</li>
 * <li>The {@code maxInlineUniformTotalSize} limit is added to provide the total size of all inline uniform block bindings in a pipeline layout.</li>
 * </ul>
 */
public class VK13 extends VK12 {

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES   = 53,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES = 54;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO = 1000192000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES = 1000215000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES = 1000245000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES = 1000295000,
        VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO       = 1000295001,
        VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO         = 1000295002;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES = 1000297000;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x100,
        VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT           = 0x200;

    /** Extends {@code VkResult}. */
    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;

    /** Extends {@code VkPipelineCacheCreateFlagBits}. */
    public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 0x1;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 STRUCTURE_TYPE_MEMORY_BARRIER_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_BARRIER_2                           = 1000314000,
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2                    = 1000314001,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2                     = 1000314002,
        VK_STRUCTURE_TYPE_DEPENDENCY_INFO                            = 1000314003,
        VK_STRUCTURE_TYPE_SUBMIT_INFO_2                              = 1000314004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO                      = 1000314005,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO                 = 1000314006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES = 1000314007;

    /** Extends {@code VkEventCreateFlagBits}. */
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 0x1;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL IMAGE_LAYOUT_READ_ONLY_OPTIMAL}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_ATTACHMENT_OPTIMAL}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL  = 1000314000,
        VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_NONE = 0;

    /** Extends {@code VkAccessFlagBits}. */
    public static final int VK_ACCESS_NONE = 0;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES = 1000325000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES = 1000335000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 STRUCTURE_TYPE_BLIT_IMAGE_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2 STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_COPY_2 STRUCTURE_TYPE_BUFFER_COPY_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_COPY_2 STRUCTURE_TYPE_IMAGE_COPY_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_BLIT_2 STRUCTURE_TYPE_IMAGE_BLIT_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 STRUCTURE_TYPE_IMAGE_RESOLVE_2}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2          = 1000337000,
        VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2           = 1000337001,
        VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 = 1000337002,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 = 1000337003,
        VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2           = 1000337004,
        VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2        = 1000337005,
        VK_STRUCTURE_TYPE_BUFFER_COPY_2               = 1000337006,
        VK_STRUCTURE_TYPE_IMAGE_COPY_2                = 1000337007,
        VK_STRUCTURE_TYPE_IMAGE_BLIT_2                = 1000337008,
        VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2         = 1000337009,
        VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2             = 1000337010;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES         = 1000225000,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO = 1000225001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES           = 1000225002;

    /**
     * Extends {@code VkPipelineShaderStageCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT}</li>
     * <li>{@link #VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 0x1,
        VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT      = 0x2;

    /** Extends {@code VkDescriptorType}. */
    public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES    = 1000138000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES  = 1000138001,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK        = 1000138002,
        VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO = 1000138003;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_G8_B8R8_2PLANE_444_UNORM FORMAT_G8_B8R8_2PLANE_444_UNORM}</li>
     * <li>{@link #VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16}</li>
     * <li>{@link #VK_FORMAT_G16_B16R16_2PLANE_444_UNORM FORMAT_G16_B16R16_2PLANE_444_UNORM}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_G8_B8R8_2PLANE_444_UNORM                  = 1000330000,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002,
        VK_FORMAT_G16_B16R16_2PLANE_444_UNORM               = 1000330003;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_A4R4G4B4_UNORM_PACK16 FORMAT_A4R4G4B4_UNORM_PACK16}</li>
     * <li>{@link #VK_FORMAT_A4B4G4R4_UNORM_PACK16 FORMAT_A4B4G4R4_UNORM_PACK16}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_A4R4G4B4_UNORM_PACK16 = 1000340000,
        VK_FORMAT_A4B4G4R4_UNORM_PACK16 = 1000340001;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES = 1000066000;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK FORMAT_ASTC_4x4_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK FORMAT_ASTC_5x4_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK FORMAT_ASTC_5x5_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK FORMAT_ASTC_6x5_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK FORMAT_ASTC_6x6_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK FORMAT_ASTC_8x5_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK FORMAT_ASTC_8x6_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK FORMAT_ASTC_8x8_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK FORMAT_ASTC_10x5_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK FORMAT_ASTC_10x6_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK FORMAT_ASTC_10x8_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK FORMAT_ASTC_10x10_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK FORMAT_ASTC_12x10_SFLOAT_BLOCK}</li>
     * <li>{@link #VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK FORMAT_ASTC_12x12_SFLOAT_BLOCK}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK   = 1000066000,
        VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK   = 1000066001,
        VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK   = 1000066002,
        VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK   = 1000066003,
        VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK   = 1000066004,
        VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK   = 1000066005,
        VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK   = 1000066006,
        VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK   = 1000066007,
        VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK  = 1000066008,
        VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK  = 1000066009,
        VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK  = 1000066010,
        VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK = 1000066011,
        VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK = 1000066012,
        VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK = 1000066013;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_RENDERING_INFO                             = 1000044000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO                  = 1000044001,
        VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO             = 1000044002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES = 1000044003,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO  = 1000044004;

    /** Extends {@code VkAttachmentStoreOp}. */
    public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_CULL_MODE DYNAMIC_STATE_CULL_MODE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_FRONT_FACE DYNAMIC_STATE_FRONT_FACE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE DYNAMIC_STATE_DEPTH_TEST_ENABLE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_COMPARE_OP DYNAMIC_STATE_DEPTH_COMPARE_OP}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE DYNAMIC_STATE_STENCIL_TEST_ENABLE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_STENCIL_OP DYNAMIC_STATE_STENCIL_OP}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_CULL_MODE                   = 1000267000,
        VK_DYNAMIC_STATE_FRONT_FACE                  = 1000267001,
        VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY          = 1000267002,
        VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT         = 1000267003,
        VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT          = 1000267004,
        VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE = 1000267005,
        VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE           = 1000267006,
        VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE          = 1000267007,
        VK_DYNAMIC_STATE_DEPTH_COMPARE_OP            = 1000267008,
        VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE    = 1000267009,
        VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE         = 1000267010,
        VK_DYNAMIC_STATE_STENCIL_OP                  = 1000267011;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES   = 1000280000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES = 1000280001;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES = 1000281001;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 = 1000360000;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE}</li>
     * <li>{@link #VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE = 1000377001,
        VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE         = 1000377002,
        VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE  = 1000377004;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES   = 1000413000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES = 1000413001,
        VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS        = 1000413002,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS         = 1000413003;

    /** Extends {@code VkImageAspectFlagBits}. */
    public static final int VK_IMAGE_ASPECT_NONE = 0;

    /**
     * VkPipelineCreationFeedbackFlagBits - Bitmask specifying pipeline or pipeline stage creation feedback
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT PIPELINE_CREATION_FEEDBACK_VALID_BIT} indicates that the feedback information is valid.</li>
     * <li>{@link #VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT} indicates that a readily usable pipeline or pipeline stage was found in the {@code pipelineCache} specified by the application in the pipeline creation command.
     * An implementation <b>should</b> set the {@link #VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT} bit if it was able to avoid the large majority of pipeline or pipeline stage creation work by using the {@code pipelineCache} parameter of {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines}, {@link KHRRayTracingPipeline#vkCreateRayTracingPipelinesKHR CreateRayTracingPipelinesKHR}, {@link NVRayTracing#vkCreateRayTracingPipelinesNV CreateRayTracingPipelinesNV}, or {@link VK10#vkCreateComputePipelines CreateComputePipelines}. When an implementation sets this bit for the entire pipeline, it <b>may</b> leave it unset for any stage.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Implementations are encouraged to provide a meaningful signal to applications using this bit. The intention is to communicate to the application that the pipeline or pipeline stage was created "as fast as it gets" using the pipeline cache provided by the application. If an implementation uses an internal cache, it is discouraged from setting this bit as the feedback would be unactionable.</p>
     * </div>
     * </li>
     * <li>{@link #VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT} indicates that the base pipeline specified by the {@code basePipelineHandle} or {@code basePipelineIndex} member of the stext:Vk*PipelineCreateInfo structure was used to accelerate the creation of the pipeline.
     * An implementation <b>should</b> set the {@link #VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT} bit if it was able to avoid a significant amount of work by using the base pipeline.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>While "significant amount of work" is subjective, implementations are encouraged to provide a meaningful signal to applications using this bit. For example, a 1% reduction in duration may not warrant setting this bit, while a 50% reduction would.</p>
     * </div>
     * </li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineCreationFeedback}, {@link VkPipelineCreationFeedbackCreateInfo}</p>
     */
    public static final int
        VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT                          = 0x1,
        VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 0x2,
        VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT     = 0x4;

    /**
     * VkToolPurposeFlagBits - Bitmask specifying the purposes of an active tool
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_TOOL_PURPOSE_VALIDATION_BIT TOOL_PURPOSE_VALIDATION_BIT} specifies that the tool provides validation of API usage.</li>
     * <li>{@link #VK_TOOL_PURPOSE_PROFILING_BIT TOOL_PURPOSE_PROFILING_BIT} specifies that the tool provides profiling of API usage.</li>
     * <li>{@link #VK_TOOL_PURPOSE_TRACING_BIT TOOL_PURPOSE_TRACING_BIT} specifies that the tool is capturing data about the application’s API usage, including anything from simple logging to capturing data for later replay.</li>
     * <li>{@link #VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT} specifies that the tool provides additional API features/extensions on top of the underlying implementation.</li>
     * <li>{@link #VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT TOOL_PURPOSE_MODIFYING_FEATURES_BIT} specifies that the tool modifies the API features/limits/extensions presented to the application.</li>
     * <li>{@link EXTToolingInfo#VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT} specifies that the tool reports additional information to the application via callbacks specified by {@link EXTDebugReport#vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} or {@link EXTDebugUtils#vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</li>
     * <li>{@link EXTToolingInfo#VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT} specifies that the tool consumes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-debug-markers">debug markers</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-object-debug-annotation">object debug annotation</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-queue-labels">queue labels</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-command-buffer-labels">command buffer labels</a></li>
     * </ul>
     */
    public static final int
        VK_TOOL_PURPOSE_VALIDATION_BIT          = 0x1,
        VK_TOOL_PURPOSE_PROFILING_BIT           = 0x2,
        VK_TOOL_PURPOSE_TRACING_BIT             = 0x4,
        VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 0x8,
        VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT  = 0x10;

    /**
     * VkPipelineStageFlagBits2 - Pipeline stage flags for VkPipelineStageFlags2
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_NONE PIPELINE_STAGE_2_NONE} specifies no stages of execution.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT} specifies the stage of the pipeline where indirect command parameters are consumed. This stage also includes reading commands written by {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV}.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV} specifies the task shader stage.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV} specifies the mesh shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT PIPELINE_STAGE_2_INDEX_INPUT_BIT} specifies the stage of the pipeline where index buffers are consumed.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT} specifies the stage of the pipeline where vertex buffers are consumed.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT PIPELINE_STAGE_2_VERTEX_INPUT_BIT} is equivalent to the logical OR of:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT PIPELINE_STAGE_2_INDEX_INPUT_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT PIPELINE_STAGE_2_VERTEX_SHADER_BIT} specifies the vertex shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT} specifies the tessellation control shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT} specifies the tessellation evaluation shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT} specifies the geometry shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT} is equivalent to specifying all supported <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stages</a>:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT PIPELINE_STAGE_2_VERTEX_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT} specifies the fragment shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT} specifies the stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load operations</a> for framebuffer attachments with a depth/stencil format.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT} specifies the stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass store operations</a> for framebuffer attachments with a depth/stencil format.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} specifies the stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load and store operations</a> and multisample resolve operations for framebuffer attachments with a color or depth/stencil format.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT PIPELINE_STAGE_2_COMPUTE_SHADER_BIT} specifies the compute shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT} specifies a pseudo-stage indicating execution on the host of reads/writes of device memory. This stage is not invoked by any commands recorded in a command buffer.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT} specifies the execution of all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#copies">copy commands</a>, including {@link VK10#vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT} specifies the execution of {@link VK10#vkCmdBlitImage CmdBlitImage}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT} specifies the execution of {@link VK10#vkCmdResolveImage CmdResolveImage}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CLEAR_BIT PIPELINE_STAGE_2_CLEAR_BIT} specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#clears">clear commands</a>, with the exception of {@link VK10#vkCmdClearAttachments CmdClearAttachments}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT PIPELINE_STAGE_2_ALL_TRANSFER_BIT} is equivalent to specifying all of:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CLEAR_BIT PIPELINE_STAGE_2_CLEAR_BIT}</li>
     * </ul>
     * </li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR} specifies the execution of the ray tracing shader stages.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure">acceleration structure commands</a>.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT} specifies the execution of all graphics pipeline stages, and is equivalent to the logical OR of:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT PIPELINE_STAGE_2_VERTEX_INPUT_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT PIPELINE_STAGE_2_VERTEX_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>{@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT} specifies all operations performed by all commands supported on the queue it is used with.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT} specifies the stage of the pipeline where the predicate of conditional rendering is consumed.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} specifies the stage of the pipeline where vertex attribute output values are written to the transform feedback buffers.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} specifies the stage of the pipeline where device-side generation of commands via {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV} is handled.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} specifies the stage of the pipeline where the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-shading-rate-image">shading rate image</a> is read to determine the fragment shading rate for portions of a rasterized primitive.</li>
     * <li>{@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT} specifies the stage of the pipeline where the fragment density map is read to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragmentdensitymapops">generate the fragment areas</a>.</li>
     * <li>{@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI} specifies the stage of the pipeline where the invocation mask image is read by the implementation to optimize the ray dispatch.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR} specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-decode-operations">video decode operation</a> are performed.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR} specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operation</a> are performed.</li>
     * <li>{@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI} specifies the subpass shading shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT PIPELINE_STAGE_2_TOP_OF_PIPE_BIT} is equivalent to {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT} with {@code VkAccessFlags2} set to 0 when specified in the second synchronization scope, but equivalent to {@link #VK_PIPELINE_STAGE_2_NONE PIPELINE_STAGE_2_NONE} in the first scope.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT} is equivalent to {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT} with {@code VkAccessFlags2} set to 0 when specified in the first synchronization scope, but equivalent to {@link #VK_PIPELINE_STAGE_2_NONE PIPELINE_STAGE_2_NONE} in the second scope.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code TOP} and {@code BOTTOM} pipeline stages are deprecated, and applications should prefer {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT} and {@link #VK_PIPELINE_STAGE_2_NONE PIPELINE_STAGE_2_NONE}.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code VkPipelineStageFlags2} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkPipelineStageFlagBits} is defined. The first 31 values are common to both, and are interchangeable.</p>
     * </div>
     */
    public static final long
        VK_PIPELINE_STAGE_2_NONE                               = 0L,
        VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT                    = 0x1L,
        VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT                  = 0x2L,
        VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT                   = 0x4L,
        VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT                  = 0x8L,
        VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT    = 0x10L,
        VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 0x20L,
        VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT                = 0x40L,
        VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT                = 0x80L,
        VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT           = 0x100L,
        VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT            = 0x200L,
        VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT        = 0x400L,
        VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT                 = 0x800L,
        VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT                   = 0x1000L,
        VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT                 = 0x2000L,
        VK_PIPELINE_STAGE_2_HOST_BIT                           = 0x4000L,
        VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT                   = 0x8000L,
        VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT                   = 0x10000L,
        VK_PIPELINE_STAGE_2_COPY_BIT                           = 0x100000000L,
        VK_PIPELINE_STAGE_2_RESOLVE_BIT                        = 0x200000000L,
        VK_PIPELINE_STAGE_2_BLIT_BIT                           = 0x400000000L,
        VK_PIPELINE_STAGE_2_CLEAR_BIT                          = 0x800000000L,
        VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT                    = 0x1000000000L,
        VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT         = 0x2000000000L,
        VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT      = 0x4000000000L;

    /**
     * VkAccessFlagBits2 - Access flags for VkAccessFlags2
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_NONE ACCESS_2_NONE} specifies no accesses.</li>
     * <li>{@link #VK_ACCESS_2_MEMORY_READ_BIT ACCESS_2_MEMORY_READ_BIT} specifies all read accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code READ} access flags that are valid where it is used.</li>
     * <li>{@link #VK_ACCESS_2_MEMORY_WRITE_BIT ACCESS_2_MEMORY_WRITE_BIT} specifies all write accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code WRITE} access flags that are valid where it is used.</li>
     * <li>{@link #VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT ACCESS_2_INDIRECT_COMMAND_READ_BIT} specifies read access to command data read from indirect buffers as part of an indirect build, trace, drawing or dispatch command. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_INDEX_READ_BIT ACCESS_2_INDEX_READ_BIT} specifies read access to an index buffer as part of an indexed drawing command, bound by {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT PIPELINE_STAGE_2_INDEX_INPUT_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT} specifies read access to a vertex buffer as part of a drawing command, bound by {@link VK10#vkCmdBindVertexBuffers CmdBindVertexBuffers}. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_UNIFORM_READ_BIT ACCESS_2_UNIFORM_READ_BIT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbuffer">uniform buffer</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT ACCESS_2_INPUT_ATTACHMENT_READ_BIT} specifies read access to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">input attachment</a> within a render pass during subpass shading or fragment shading. Such access occurs in the {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI} or {@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_SAMPLED_READ_BIT ACCESS_2_SHADER_SAMPLED_READ_BIT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformtexelbuffer">uniform texel buffer</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampledimage">sampled image</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_READ_BIT ACCESS_2_SHADER_STORAGE_READ_BIT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_READ_BIT ACCESS_2_SHADER_READ_BIT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shader-binding-table">shader binding table</a> in any shader pipeline. In addition, it is equivalent to the logical OR of:
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_UNIFORM_READ_BIT ACCESS_2_UNIFORM_READ_BIT}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_SAMPLED_READ_BIT ACCESS_2_SHADER_SAMPLED_READ_BIT}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_READ_BIT ACCESS_2_SHADER_STORAGE_READ_BIT}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT ACCESS_2_SHADER_STORAGE_WRITE_BIT} specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_WRITE_BIT ACCESS_2_SHADER_WRITE_BIT} is equivalent to {@link #VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT ACCESS_2_SHADER_STORAGE_WRITE_BIT}.</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT ACCESS_2_COLOR_ATTACHMENT_READ_BIT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">color attachment</a>, such as via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blending">blending</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-logicop">logic operations</a>, or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load operations</a>. It does not include <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT} specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">color, resolve, or depth/stencil resolve attachment</a> during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">render pass</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT} or {@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT} specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT} or {@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFER_READ_BIT ACCESS_2_TRANSFER_READ_BIT} specifies read access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#copies">copy</a> operation. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}, {@link #VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}, or {@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFER_WRITE_BIT ACCESS_2_TRANSFER_WRITE_BIT} specifies write access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#clears">clear</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#copies">copy</a> operation. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}, {@link #VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}, {@link #VK_PIPELINE_STAGE_2_CLEAR_BIT PIPELINE_STAGE_2_CLEAR_BIT}, or {@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_HOST_READ_BIT ACCESS_2_HOST_READ_BIT} specifies read access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_HOST_WRITE_BIT ACCESS_2_HOST_WRITE_BIT} specifies write access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT} specifies read access to a predicate as part of conditional rendering. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT} specifies write access to a transform feedback buffer made when transform feedback is active. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT} specifies read access to a transform feedback counter buffer which is read when {@link EXTTransformFeedback#vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} executes. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT} specifies write access to a transform feedback counter buffer which is written when {@link EXTTransformFeedback#vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT} executes. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV} specifies reads from buffer inputs to {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV}. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV} specifies writes to the target command buffer preprocess outputs. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT} specifies read access to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass">color attachments</a>, including <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} pipeline stage.</li>
     * <li>{@link HUAWEIInvocationMask#VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI} specifies read access to a invocation mask image in the {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR} specifies read access to an acceleration structure as part of a trace, build, or copy command, or to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build command. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR} pipeline stage or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR} specifies write access to an acceleration structure or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build or copy command. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-fragmentdensitymapattachment">fragment density map attachment</a> during dynamic <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragmentdensitymapops">fragment density map operations</a>. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR} specifies read access to a fragment shading rate attachment during rasterization. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRSynchronization2#VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV} specifies read access to a shading rate image during rasterization. Such access occurs in the {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV} pipeline stage. It is equivalent to {@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR}.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR ACCESS_2_VIDEO_DECODE_READ_BIT_KHR} specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-decode-operations">video decode operation</a>. Such access occurs in the {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR} specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-decode-operations">video decode operation</a>. Such access occurs in the {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR} specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operation</a>. Such access occurs in the {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR} specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operation</a>. Such access occurs in the {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR} pipeline stage.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In situations where an application wishes to select all access types for a given set of pipeline stages, {@link #VK_ACCESS_2_MEMORY_READ_BIT ACCESS_2_MEMORY_READ_BIT} or {@link #VK_ACCESS_2_MEMORY_WRITE_BIT ACCESS_2_MEMORY_WRITE_BIT} can be used. This is particularly useful when specifying stages that only have a single access type.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code VkAccessFlags2} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkAccessFlagBits} is defined. The first 31 values are common to both, and are interchangeable.</p>
     * </div>
     */
    public static final long
        VK_ACCESS_2_NONE                               = 0L,
        VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT          = 0x1L,
        VK_ACCESS_2_INDEX_READ_BIT                     = 0x2L,
        VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT          = 0x4L,
        VK_ACCESS_2_UNIFORM_READ_BIT                   = 0x8L,
        VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT          = 0x10L,
        VK_ACCESS_2_SHADER_READ_BIT                    = 0x20L,
        VK_ACCESS_2_SHADER_WRITE_BIT                   = 0x40L,
        VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT          = 0x80L,
        VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT         = 0x100L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT  = 0x200L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x400L,
        VK_ACCESS_2_TRANSFER_READ_BIT                  = 0x800L,
        VK_ACCESS_2_TRANSFER_WRITE_BIT                 = 0x1000L,
        VK_ACCESS_2_HOST_READ_BIT                      = 0x2000L,
        VK_ACCESS_2_HOST_WRITE_BIT                     = 0x4000L,
        VK_ACCESS_2_MEMORY_READ_BIT                    = 0x8000L,
        VK_ACCESS_2_MEMORY_WRITE_BIT                   = 0x10000L,
        VK_ACCESS_2_SHADER_SAMPLED_READ_BIT            = 0x100000000L,
        VK_ACCESS_2_SHADER_STORAGE_READ_BIT            = 0x200000000L,
        VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT           = 0x400000000L;

    /**
     * VkSubmitFlagBits - Bitmask specifying behavior of a submission
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBMIT_PROTECTED_BIT SUBMIT_PROTECTED_BIT} specifies that this batch is a protected submission.</li>
     * </ul>
     */
    public static final int VK_SUBMIT_PROTECTED_BIT = 0x1;

    /**
     * VkRenderingFlagBits - Bitmask specifying additional properties of a dynamic render pass instance
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT} specifies that draw calls for the render pass instance will be recorded in secondary command buffers.</li>
     * <li>{@link #VK_RENDERING_RESUMING_BIT RENDERING_RESUMING_BIT} specifies that the render pass instance is resuming an earlier suspended render pass instance.</li>
     * <li>{@link #VK_RENDERING_SUSPENDING_BIT RENDERING_SUSPENDING_BIT} specifies that the render pass instance will be suspended.</li>
     * </ul>
     * 
     * <p>The contents of {@code pRenderingInfo} <b>must</b> match between suspended render pass instances and the render pass instances that resume them, other than the presence or absence of the {@link #VK_RENDERING_RESUMING_BIT RENDERING_RESUMING_BIT}, {@link #VK_RENDERING_SUSPENDING_BIT RENDERING_SUSPENDING_BIT}, and {@link #VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT} flags. No action or synchronization commands, or other render pass instances, are allowed between suspending and resuming render pass instances.</p>
     */
    public static final int
        VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 0x1,
        VK_RENDERING_SUSPENDING_BIT                         = 0x2,
        VK_RENDERING_RESUMING_BIT                           = 0x4;

    /**
     * VkFormatFeatureFlagBits2 - Bitmask specifying features supported by a buffer
     * 
     * <h5>Description</h5>
     * 
     * <p>The following bits <b>may</b> be set in {@code linearTilingFeatures} and {@code optimalTilingFeatures}, specifying that the features are supported by images ({@code VkImage}) or image views ({@code VkImageView}) or sampler Y′C<sub>B</sub>C<sub>R</sub> conversion objects ({@code VkSamplerYcbcrConversion}) created with the queried {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2}{@code ::format}:</p>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT} specifies that an image view <b>can</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampledimage">sampled from</a>.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT FORMAT_FEATURE_2_STORAGE_IMAGE_BIT} specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">storage image</a>.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT} specifies that an image view <b>can</b> be used as storage image that supports atomic operations.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT} specifies that an image view <b>can</b> be used as a framebuffer color attachment and as an input attachment.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT} specifies that an image view <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT} specifies that an image view <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_BLIT_SRC_BIT FORMAT_FEATURE_2_BLIT_SRC_BIT} specifies that an image <b>can</b> be used as the {@code srcImage} for {@link #vkCmdBlitImage2 CmdBlitImage2} and {@link VK10#vkCmdBlitImage CmdBlitImage}.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_BLIT_DST_BIT FORMAT_FEATURE_2_BLIT_DST_BIT} specifies that an image <b>can</b> be used as the {@code dstImage} for {@link #vkCmdBlitImage2 CmdBlitImage2} and {@link VK10#vkCmdBlitImage CmdBlitImage}.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT} specifies that if {@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT} is also set, an image view <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}, or {@code mipmapMode} set to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}. If {@link #VK_FORMAT_FEATURE_2_BLIT_SRC_BIT FORMAT_FEATURE_2_BLIT_SRC_BIT} is also set, an image can be used as the {@code srcImage} for {@link #vkCmdBlitImage2 CmdBlitImage2} and {@code vkCmdBlitImage} with a {@code filter} of {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}. This bit <b>must</b> only be exposed for formats that also support the {@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT} or {@link #VK_FORMAT_FEATURE_2_BLIT_SRC_BIT FORMAT_FEATURE_2_BLIT_SRC_BIT}.
     * If the format being queried is a depth/stencil format, this bit only specifies that the depth aspect (not the stencil aspect) of an image of this format supports linear filtering. Where depth comparison is supported it <b>may</b> be linear filtered whether this bit is present or not, but where this bit is not present the filtered value <b>may</b> be computed in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in the range <code>[0,1]</code> and <b>should</b> be proportional to, or a weighted average of, the number of comparison passes or failures.
     * </li>
     * <li>{@link #VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT FORMAT_FEATURE_2_TRANSFER_SRC_BIT} specifies that an image <b>can</b> be used as a source image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#copies">copy commands</a>.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT FORMAT_FEATURE_2_TRANSFER_DST_BIT} specifies that an image <b>can</b> be used as a destination image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#copies">copy commands</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#clears">clear commands</a>.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT} specifies {@code VkImage} <b>can</b> be used as a sampled image with a min or max {@code VkSamplerReductionMode}. This bit <b>must</b> only be exposed for formats that also support the {@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT}.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT} specifies that {@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}, or be the source image for a blit with {@code filter} set to {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}. This bit <b>must</b> only be exposed for formats that also support the {@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT}. If the format being queried is a depth/stencil format, this only specifies that the depth aspect is cubic filterable.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT} specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a {@link VkSamplerYcbcrConversionCreateInfo} {@code xChromaOffset} and/or {@code yChromaOffset} of {@link VK11#VK_CHROMA_LOCATION_MIDPOINT CHROMA_LOCATION_MIDPOINT}. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be {@link VK11#VK_CHROMA_LOCATION_COSITED_EVEN CHROMA_LOCATION_COSITED_EVEN}. If a format does not incorporate chroma downsampling (it is not a “422” or “420” format) but the implementation supports sampler Y′C<sub>B</sub>C<sub>R</sub> conversion for this format, the implementation <b>must</b> set {@link #VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT}.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT} specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a {@link VkSamplerYcbcrConversionCreateInfo} {@code xChromaOffset} and/or {@code yChromaOffset} of {@link VK11#VK_CHROMA_LOCATION_COSITED_EVEN CHROMA_LOCATION_COSITED_EVEN}. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be {@link VK11#VK_CHROMA_LOCATION_MIDPOINT CHROMA_LOCATION_MIDPOINT}. If neither {@link #VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT} nor {@link #VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT} is set, the application <b>must</b> not define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT} specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source with {@code chromaFilter} set to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT} specifies that the format can have different chroma, min, and mag filters.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT} specifies that reconstruction is explicit, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-chroma-reconstruction">Chroma Reconstruction</a>. If this bit is not present, reconstruction is implicit by default.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT} specifies that reconstruction <b>can</b> be forcibly made explicit by setting {@link VkSamplerYcbcrConversionCreateInfo}{@code ::forceExplicitReconstruction} to {@link VK10#VK_TRUE TRUE}. If the format being queried supports {@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT} it <b>must</b> also support {@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT}.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_DISJOINT_BIT FORMAT_FEATURE_2_DISJOINT_BIT} specifies that a multi-planar image <b>can</b> have the {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} set during image creation. An implementation <b>must</b> not set {@link #VK_FORMAT_FEATURE_2_DISJOINT_BIT FORMAT_FEATURE_2_DISJOINT_BIT} for <em>single-plane formats</em>.</li>
     * <li>{@link EXTFragmentDensityMap#VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT} specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-fragmentdensitymapattachment">fragment density map attachment</a>.</li>
     * <li>{@link KHRFragmentShadingRate#VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a>. An implementation <b>must</b> not set this feature for formats with numeric type other than {@code *UINT}, or set it as a buffer feature.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR} specifies that an image view with this format <b>can</b> be used as an output for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-decode-operations">video decode operations</a></li>
     * <li>{@link KHRVideoDecodeQueue#VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR} specifies that an image view with this format <b>can</b> be used as a DPB for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-decode-operations">video decode operations</a></li>
     * <li>{@link KHRVideoEncodeQueue#VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR} specifies that an image view with this format <b>can</b> be used as an input to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operations</a></li>
     * <li>{@link KHRVideoEncodeQueue#VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR} specifies that an image view with this format <b>can</b> be used as a DPB for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operations</a></li>
     * <li>{@link #VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT} specifies that image views created with this format <b>can</b> be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">storage images</a> for read operations without specifying a format.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT} specifies that image views created with this format <b>can</b> be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">storage images</a> for write operations without specifying a format.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT} specifies that image views created with this format <b>can</b> be used for depth comparison performed by {@code OpImage*Dref} instructions.</li>
     * <li>{@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV} specifies that the format is supported as a renderable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary">Linear Color Attachment</a>. This bit will be set for renderable color formats in the {@code linearTilingFeatures}. This <b>must</b> not be set in the {@code optimalTilingFeatures} or {@code bufferFeatures} members.</li>
     * </ul>
     * 
     * <p>The following bits <b>may</b> be set in {@code bufferFeatures}, specifying that the features are supported by buffers ({@code VkBuffer}) or buffer views ({@code VkBufferView}) created with the queried {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2}{@code ::format}:</p>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT} specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} descriptor.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT} specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT} specifies that atomic operations are supported on {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} with this format.</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT FORMAT_FEATURE_2_VERTEX_BUFFER_BIT} specifies that the format <b>can</b> be used as a vertex attribute format ({@link VkVertexInputAttributeDescription}{@code ::format}).</li>
     * <li>{@link KHRAccelerationStructure#VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR} specifies that the format <b>can</b> be used as the vertex format when creating an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure">acceleration structure</a> ({@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::vertexFormat}). This format <b>can</b> also be used as the vertex format in host memory when doing <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#host-acceleration-structure">host acceleration structure</a> builds.</li>
     * </ul>
     */
    public static final long
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT                                                           = 0x1L,
        VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT                                                           = 0x2L,
        VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT                                                    = 0x4L,
        VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT                                                    = 0x8L,
        VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT                                                    = 0x10L,
        VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT                                             = 0x20L,
        VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT                                                           = 0x40L,
        VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT                                                        = 0x80L,
        VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT                                                  = 0x100L,
        VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT                                                = 0x200L,
        VK_FORMAT_FEATURE_2_BLIT_SRC_BIT                                                                = 0x400L,
        VK_FORMAT_FEATURE_2_BLIT_DST_BIT                                                                = 0x800L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT                                             = 0x1000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT                                              = 0x2000L,
        VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT                                                            = 0x4000L,
        VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT                                                            = 0x8000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT                                             = 0x10000L,
        VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT                                                 = 0x20000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                            = 0x40000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT           = 0x80000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT           = 0x100000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x200000L,
        VK_FORMAT_FEATURE_2_DISJOINT_BIT                                                                = 0x400000L,
        VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT                                                  = 0x800000L,
        VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT                                             = 0x80000000L,
        VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT                                            = 0x100000000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT                                          = 0x200000000L;

    /** The API version number for Vulkan 1.3. */
    public static final int VK_API_VERSION_1_3 = VK_MAKE_API_VERSION(0, 1, 3, 0);

    protected VK13() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceToolProperties ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceToolProperties GetPhysicalDeviceToolProperties}
     *
     * @param pToolCount a pointer to an integer describing the number of tools active on {@code physicalDevice}.
     */
    public static int nvkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, long pToolCount, long pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pToolCount, pToolProperties, __functionAddress);
    }

    /**
     * Reports properties of tools active on the specified physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Information about tools providing debugging, profiling, or similar services, active for a given physical device, can be obtained by calling:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceToolProperties(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pToolCount,
     *     VkPhysicalDeviceToolProperties*             pToolProperties);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceToolPropertiesEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pToolCount,
     *     VkPhysicalDeviceToolProperties*             pToolProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pToolProperties} is {@code NULL}, then the number of tools currently active on {@code physicalDevice} is returned in {@code pToolCount}. Otherwise, {@code pToolCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pToolProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pToolProperties}. If {@code pToolCount} is less than the number of currently active tools, at most {@code pToolCount} structures will be written.</p>
     * 
     * <p>The count and properties of active tools <b>may</b> change in response to events outside the scope of the specification. An application <b>should</b> assume these properties might change at any given time.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pToolCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pToolCount} is not 0, and {@code pToolProperties} is not {@code NULL}, {@code pToolProperties} <b>must</b> be a valid pointer to an array of {@code pToolCount} {@link VkPhysicalDeviceToolProperties} structures</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceToolProperties}</p>
     *
     * @param physicalDevice  the handle to the physical device to query for active tools.
     * @param pToolCount      a pointer to an integer describing the number of tools active on {@code physicalDevice}.
     * @param pToolProperties either {@code NULL} or a pointer to an array of {@link VkPhysicalDeviceToolProperties} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pToolCount, @Nullable @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        if (CHECKS) {
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount.get(pToolCount.position()));
        }
        return nvkGetPhysicalDeviceToolProperties(physicalDevice, memAddress(pToolCount), memAddressSafe(pToolProperties));
    }

    // --- [ vkCreatePrivateDataSlot ] ---

    /** Unsafe version of: {@link #vkCreatePrivateDataSlot CreatePrivateDataSlot} */
    public static int nvkCreatePrivateDataSlot(VkDevice device, long pCreateInfo, long pAllocator, long pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPrivateDataSlot, __functionAddress);
    }

    /**
     * Create a slot for private data storage.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a private data slot, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreatePrivateDataSlot(
     *     VkDevice                                    device,
     *     const VkPrivateDataSlotCreateInfo*          pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPrivateDataSlot*                          pPrivateDataSlot);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkCreatePrivateDataSlotEXT(
     *     VkDevice                                    device,
     *     const VkPrivateDataSlotCreateInfo*          pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPrivateDataSlot*                          pPrivateDataSlot);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-privateData">{@code privateData}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkPrivateDataSlotCreateInfo} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pPrivateDataSlot} <b>must</b> be a valid pointer to a {@code VkPrivateDataSlot} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkPrivateDataSlotCreateInfo}</p>
     *
     * @param device           the logical device associated with the creation of the object(s) holding the private data slot.
     * @param pCreateInfo      a pointer to a {@link VkPrivateDataSlotCreateInfo}
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pPrivateDataSlot a pointer to a {@code VkPrivateDataSlot} handle in which the resulting private data slot is returned
     */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") LongBuffer pPrivateDataSlot) {
        if (CHECKS) {
            check(pPrivateDataSlot, 1);
        }
        return nvkCreatePrivateDataSlot(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPrivateDataSlot));
    }

    // --- [ vkDestroyPrivateDataSlot ] ---

    /** Unsafe version of: {@link #vkDestroyPrivateDataSlot DestroyPrivateDataSlot} */
    public static void nvkDestroyPrivateDataSlot(VkDevice device, long privateDataSlot, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPrivateDataSlot;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), privateDataSlot, pAllocator, __functionAddress);
    }

    /**
     * Destroy a private data slot.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a private data slot, call:</p>
     * 
     * <pre><code>
     * void vkDestroyPrivateDataSlot(
     *     VkDevice                                    device,
     *     VkPrivateDataSlot                           privateDataSlot,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkDestroyPrivateDataSlotEXT(
     *     VkDevice                                    device,
     *     VkPrivateDataSlot                           privateDataSlot,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code privateDataSlot} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code privateDataSlot} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code privateDataSlot} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlot} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code privateDataSlot} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code privateDataSlot} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device          the logical device associated with the creation of the object(s) holding the private data slot.
     * @param privateDataSlot the private data slot to destroy.
     * @param pAllocator      controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyPrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlot") long privateDataSlot, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyPrivateDataSlot(device, privateDataSlot, memAddressSafe(pAllocator));
    }

    // --- [ vkSetPrivateData ] ---

    /**
     * Associate data with a Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To store user defined data in a slot associated with a Vulkan object, call:</p>
     * 
     * <pre><code>
     * VkResult vkSetPrivateData(
     *     VkDevice                                    device,
     *     VkObjectType                                objectType,
     *     uint64_t                                    objectHandle,
     *     VkPrivateDataSlot                           privateDataSlot,
     *     uint64_t                                    data);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkSetPrivateDataEXT(
     *     VkDevice                                    device,
     *     VkObjectType                                objectType,
     *     uint64_t                                    objectHandle,
     *     VkPrivateDataSlot                           privateDataSlot,
     *     uint64_t                                    data);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code objectHandle} <b>must</b> be {@code device} or a child of {@code device}</li>
     * <li>{@code objectHandle} <b>must</b> be a valid handle to an object of type {@code objectType}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
     * <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlot} handle</li>
     * <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * </ul></dd>
     * </dl>
     *
     * @param device          the device that created the object.
     * @param objectType      a {@code VkObjectType} specifying the type of object to associate data with.
     * @param objectHandle    a handle to the object to associate data with.
     * @param privateDataSlot a handle to a {@code VkPrivateDataSlot} specifying location of private data storage.
     * @param data            user defined data to associate the object with. This data will be stored at {@code privateDataSlot}.
     */
    @NativeType("VkResult")
    public static int vkSetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t") long data) {
        long __functionAddress = device.getCapabilities().vkSetPrivateData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJI(device.address(), objectType, objectHandle, privateDataSlot, data, __functionAddress);
    }

    // --- [ vkGetPrivateData ] ---

    /** Unsafe version of: {@link #vkGetPrivateData GetPrivateData} */
    public static void nvkGetPrivateData(VkDevice device, int objectType, long objectHandle, long privateDataSlot, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    /**
     * Retrieve data associated with a Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To retrieve user defined data from a slot associated with a Vulkan object, call:</p>
     * 
     * <pre><code>
     * void vkGetPrivateData(
     *     VkDevice                                    device,
     *     VkObjectType                                objectType,
     *     uint64_t                                    objectHandle,
     *     VkPrivateDataSlot                           privateDataSlot,
     *     uint64_t*                                   pData);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetPrivateDataEXT(
     *     VkDevice                                    device,
     *     VkObjectType                                objectType,
     *     uint64_t                                    objectHandle,
     *     VkPrivateDataSlot                           privateDataSlot,
     *     uint64_t*                                   pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Due to platform details on Android, implementations might not be able to reliably return 0 from calls to {@code vkGetPrivateData} for {@code VkSwapchainKHR} objects on which {@code vkSetPrivateData} has not previously been called. This erratum is exclusive to the Android platform and objects of type {@code VkSwapchainKHR}.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code objectType} <b>must</b> be {@link VK10#VK_OBJECT_TYPE_DEVICE OBJECT_TYPE_DEVICE}, or an object type whose parent is {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
     * <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlot} handle</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device          the device that created the object
     * @param objectType      a {@code VkObjectType} specifying the type of object data is associated with.
     * @param objectHandle    a handle to the object data is associated with.
     * @param privateDataSlot a handle to a {@code VkPrivateDataSlot} specifying location of private data pointer storage.
     * @param pData           a pointer to specify where user data is returned. 0 will be written in the absence of a previous call to {@code vkSetPrivateData} using the object specified by {@code objectHandle}.
     */
    public static void vkGetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") LongBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        nvkGetPrivateData(device, objectType, objectHandle, privateDataSlot, memAddress(pData));
    }

    // --- [ vkCmdSetEvent2 ] ---

    /** Unsafe version of: {@link #vkCmdSetEvent2 CmdSetEvent2} */
    public static void nvkCmdSetEvent2(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    /**
     * Set an event object to signaled state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To signal an event from a device, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetEvent2(
     *     VkCommandBuffer                             commandBuffer,
     *     VkEvent                                     event,
     *     const VkDependencyInfo*                     pDependencyInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetEvent2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkEvent                                     event,
     *     const VkDependencyInfo*                     pDependencyInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@link #vkCmdSetEvent2 CmdSetEvent2} is submitted to a queue, it defines the first half of memory dependencies defined by {@code pDependencyInfo}, as well as an event signal operation which sets the event to the signaled state. A memory dependency is defined between the event signal operation and commands that occur earlier in submission order.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> are defined by the union of all the memory dependencies defined by {@code pDependencyInfo}, and are applied to all operations that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>. <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo} are also included in the first scopes.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes only the event signal operation, and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo}.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> includes only <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a>.</p>
     * 
     * <p>Future {@link #vkCmdWaitEvents2 CmdWaitEvents2} commands rely on all values of each element in {@code pDependencyInfo} matching exactly with those used to signal the corresponding event. {@link VK10#vkCmdWaitEvents CmdWaitEvents} <b>must</b> not be used to wait on the result of a signal operation defined by {@code vkCmdSetEvent2}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The extra information provided by {@link #vkCmdSetEvent2 CmdSetEvent2} compared to {@link VK10#vkCmdSetEvent CmdSetEvent} allows implementations to more efficiently schedule the operations required to satisfy the requested dependencies. With {@link VK10#vkCmdSetEvent CmdSetEvent}, the full dependency information is not known until {@link VK10#vkCmdWaitEvents CmdWaitEvents} is recorded, forcing implementations to insert the required operations at that point and not before.</p>
     * </div>
     * 
     * <p>If {@code event} is already in the signaled state when {@link #vkCmdSetEvent2 CmdSetEvent2} is executed on the device, then {@link #vkCmdSetEvent2 CmdSetEvent2} has no effect, no event signal operation occurs, and no dependency is generated.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code dependencyFlags} member of {@code pDependencyInfo} <b>must</b> be 0</li>
     * <li>The current device mask of {@code commandBuffer} <b>must</b> include exactly one physical device</li>
     * <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
     * <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid {@link VkDependencyInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDependencyInfo}</p>
     *
     * @param commandBuffer   the command buffer into which the command is recorded.
     * @param event           the event that will be signaled.
     * @param pDependencyInfo a pointer to a {@link VkDependencyInfo} structure defining the first scopes of this operation.
     */
    public static void vkCmdSetEvent2(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdSetEvent2(commandBuffer, event, pDependencyInfo.address());
    }

    // --- [ vkCmdResetEvent2 ] ---

    /**
     * Reset an event object to non-signaled state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To unsignal the event from a device, call:</p>
     * 
     * <pre><code>
     * void vkCmdResetEvent2(
     *     VkCommandBuffer                             commandBuffer,
     *     VkEvent                                     event,
     *     VkPipelineStageFlags2                       stageMask);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdResetEvent2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkEvent                                     event,
     *     VkPipelineStageFlags2                       stageMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@link #vkCmdResetEvent2 CmdResetEvent2} is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event unsignal operation which resets the event to the unsignaled state.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations by {@code stageMask} or stages that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically earlier</a> than {@code stageMask}.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes only the event unsignal operation.</p>
     * 
     * <p>If {@code event} is already in the unsignaled state when {@link #vkCmdResetEvent2 CmdResetEvent2} is executed on the device, then this command has no effect, no event unsignal operation occurs, and no execution dependency is generated.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>{@code stageMask} <b>must</b> not include {@link #VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}</li>
     * <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2} and the execution of any {@link VK10#vkCmdWaitEvents CmdWaitEvents} that includes {@code event} in its {@code pEvents} parameter</li>
     * <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2} and the execution of any {@link #vkCmdWaitEvents2 CmdWaitEvents2} that includes {@code event} in its {@code pEvents} parameter</li>
     * <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
     * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param event         the event that will be unsignaled.
     * @param stageMask     a {@code VkPipelineStageFlags2} mask of pipeline stages used to determine the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a>.
     */
    public static void vkCmdResetEvent2(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2") long stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    // --- [ vkCmdWaitEvents2 ] ---

    /**
     * Unsafe version of: {@link #vkCmdWaitEvents2 CmdWaitEvents2}
     *
     * @param eventCount the length of the {@code pEvents} array.
     */
    public static void nvkCmdWaitEvents2(VkCommandBuffer commandBuffer, int eventCount, long pEvents, long pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pDependencyInfos, eventCount, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    /**
     * Wait for one or more events.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To wait for one or more events to enter the signaled state on a device, call:</p>
     * 
     * <pre><code>
     * void vkCmdWaitEvents2(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    eventCount,
     *     const VkEvent*                              pEvents,
     *     const VkDependencyInfo*                     pDependencyInfos);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdWaitEvents2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    eventCount,
     *     const VkEvent*                              pEvents,
     *     const VkDependencyInfo*                     pDependencyInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@code vkCmdWaitEvents2} is submitted to a queue, it inserts memory dependencies according to the elements of {@code pDependencyInfos} and each corresponding element of {@code pEvents}. {@code vkCmdWaitEvents2} <b>must</b> not be used to wait on event signal operations occurring on other queues, or signal operations executed by {@link VK10#vkCmdSetEvent CmdSetEvent}.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> than the last event signal operation on element <code>i</code> of {@code pEvents}.</p>
     * 
     * <p>Signal operations for an event at index <code>i</code> are only included if:</p>
     * 
     * <ul>
     * <li>The event was signaled by a {@link #vkCmdSetEvent2 CmdSetEvent2} command that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> with a {@code dependencyInfo} parameter exactly equal to the element of {@code pDependencyInfos} at index <code>i</code> ; or</li>
     * <li>The event was created without {@link #VK_EVENT_CREATE_DEVICE_ONLY_BIT EVENT_CREATE_DEVICE_ONLY_BIT}, and the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> defined by the element of {@code pDependencyInfos} at index <code>i</code> only includes host operations ({@link #VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}).</li>
     * </ul>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> than {@code vkCmdWaitEvents2}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@link #vkCmdWaitEvents2 CmdWaitEvents2} is used with {@link #vkCmdSetEvent2 CmdSetEvent2} to define a memory dependency between two sets of action commands, roughly in the same way as pipeline barriers, but split into two commands such that work between the two <b>may</b> execute unhindered.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications should be careful to avoid race conditions when using events. There is no direct ordering guarantee between {@code vkCmdSetEvent2} and {@link #vkCmdResetEvent2 CmdResetEvent2}, {@link VK10#vkCmdResetEvent CmdResetEvent}, or {@link VK10#vkCmdSetEvent CmdSetEvent}. Another execution dependency (e.g. a pipeline barrier or semaphore with {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}) is needed to prevent such a race condition.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>Members of {@code pEvents} <b>must</b> not have been signaled by {@link VK10#vkCmdSetEvent CmdSetEvent}</li>
     * <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by {@link #vkCmdSetEvent2 CmdSetEvent2}, that command’s {@code dependencyInfo} parameter <b>must</b> be exactly equal to the <code>i</code>th element of {@code pDependencyInfos}</li>
     * <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by {@link VK10#vkSetEvent SetEvent}, barriers in the <code>i</code>th element of {@code pDependencyInfos} <b>must</b> include only host operations in their first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a></li>
     * <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} include only host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled before {@link #vkCmdWaitEvents2 CmdWaitEvents2} is executed</li>
     * <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} do not include host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled by a corresponding {@link #vkCmdSetEvent2 CmdSetEvent2} that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a></li>
     * <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> either include only pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from, or include only {@link #VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}</li>
     * <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>The {@code dependencyFlags} member of any element of {@code pDependencyInfo} <b>must</b> be 0</li>
     * <li>If {@code pEvents} includes one or more events that will be signaled by {@link VK10#vkSetEvent SetEvent} after {@code commandBuffer} has been submitted to a queue, then {@code vkCmdWaitEvents2} <b>must</b> not be called inside a render pass instance</li>
     * <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEvents} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
     * <li>{@code pDependencyInfos} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@link VkDependencyInfo} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>{@code eventCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pEvents} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDependencyInfo}</p>
     *
     * @param commandBuffer    the command buffer into which the command is recorded.
     * @param pEvents          a pointer to an array of {@code eventCount} events to wait on.
     * @param pDependencyInfos a pointer to an array of {@code eventCount} {@link VkDependencyInfo} structures, defining the second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a>.
     */
    public static void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        if (CHECKS) {
            check(pDependencyInfos, pEvents.remaining());
        }
        nvkCmdWaitEvents2(commandBuffer, pEvents.remaining(), memAddress(pEvents), pDependencyInfos.address());
    }

    // --- [ vkCmdPipelineBarrier2 ] ---

    /** Unsafe version of: {@link #vkCmdPipelineBarrier2 CmdPipelineBarrier2} */
    public static void nvkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier2;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    /**
     * Insert a memory dependency.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a pipeline barrier, call:</p>
     * 
     * <pre><code>
     * void vkCmdPipelineBarrier2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDependencyInfo*                     pDependencyInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdPipelineBarrier2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDependencyInfo*                     pDependencyInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@link #vkCmdPipelineBarrier2 CmdPipelineBarrier2} is submitted to a queue, it defines memory dependencies between commands that were submitted before it, and those submitted after it.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by {@code pDependencyInfo} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by {@code pDependencyInfo} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <p>If {@code vkCmdPipelineBarrier2} is recorded within a render pass instance, the synchronization scopes are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-barriers-subpass-self-dependencies">limited to operations within the same subpass</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the render pass <b>must</b> have been created with at least one {@link VkSubpassDependency} instance in {@link VkRenderPassCreateInfo}{@code ::pDependencies} that expresses a dependency from the current subpass to itself, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scopes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scopes</a> that are all supersets of the scopes defined in this command</li>
     * <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, it <b>must</b> not include any buffer memory barriers</li>
     * <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the {@code image} member of any image memory barrier included in this command <b>must</b> be an attachment used in the current subpass both as an input attachment, and as either a color or depth/stencil attachment</li>
     * <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any image memory barrier included in this command <b>must</b> be equal</li>
     * <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any image memory barrier included in this command <b>must</b> be equal</li>
     * <li>If {@code vkCmdPipelineBarrier2} is called outside of a render pass instance, {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT} <b>must</b> not be included in the dependency flags</li>
     * <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the render pass <b>must</b> not have been started with {@link #vkCmdBeginRendering CmdBeginRendering}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid {@link VkDependencyInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDependencyInfo}</p>
     *
     * @param commandBuffer   the command buffer into which the command is recorded.
     * @param pDependencyInfo a pointer to a {@link VkDependencyInfo} structure defining the scopes of this operation.
     */
    public static void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdPipelineBarrier2(commandBuffer, pDependencyInfo.address());
    }

    // --- [ vkCmdWriteTimestamp2 ] ---

    /**
     * Write a device timestamp into a query object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To request a timestamp, call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteTimestamp2(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineStageFlags2                       stage,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdWriteTimestamp2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineStageFlags2                       stage,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@code vkCmdWriteTimestamp2} is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and writes a timestamp to a query pool.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations on the pipeline stage specified by {@code stage}.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes only the timestamp write operation.</p>
     * 
     * <p>When the timestamp value is written, the availability status of the query is set to available.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.</p>
     * </div>
     * 
     * <p>Comparisons between timestamps are not meaningful if the timestamps are written by commands submitted to different queues.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>An example of such a comparison is subtracting an older timestamp from a newer one to determine the execution time of a sequence of commands.</p>
     * </div>
     * 
     * <p>If {@code vkCmdWriteTimestamp2} is called while executing a render pass instance that has multiview enabled, the timestamp uses <code>N</code> consecutive query indices in the query pool (starting at {@code query}) where <code>N</code> is the number of bits set in the view mask of the subpass the command is executed in. The resulting query values are determined by an implementation-dependent choice of one of the following behaviors:</p>
     * 
     * <ul>
     * <li>The first query is a timestamp value and (if more than one bit is set in the view mask) zero is written to the remaining queries. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the difference between the first query written by each command.</li>
     * <li>All <code>N</code> queries are timestamp values. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the sum of the difference between corresponding queries written by each command. The difference between corresponding queries <b>may</b> be the execution time of a single view.</li>
     * </ul>
     * 
     * <p>In either case, the application <b>can</b> sum the differences between all <code>N</code> queries to determine the total execution time.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT} or {@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>{@code stage} <b>must</b> only include a single pipeline stage</li>
     * <li>{@code stage} <b>must</b> only include stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} of {@link VK10#VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}</li>
     * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
     * <li>The command pool’s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
     * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>All queries used by the command <b>must</b> be unavailable</li>
     * <li>If {@code vkCmdWriteTimestamp2} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, compute, decode, or encode operations</li>
     * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute Decode Encode</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param stage         specifies a stage of the pipeline.
     * @param queryPool     the query pool that will manage the timestamp.
     * @param query         the query within the query pool that will contain the timestamp.
     */
    public static void vkCmdWriteTimestamp2(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
    }

    // --- [ vkQueueSubmit2 ] ---

    /**
     * Unsafe version of: {@link #vkQueueSubmit2 QueueSubmit2}
     *
     * @param submitCount the number of elements in the {@code pSubmits} array.
     */
    public static int nvkQueueSubmit2(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit2;
        if (CHECKS) {
            check(__functionAddress);
            if (pSubmits != NULL) { Struct.validate(pSubmits, submitCount, VkSubmitInfo2.SIZEOF, VkSubmitInfo2::validate); }
        }
        return callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    /**
     * Submits command buffers to a queue.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To submit command buffers to a queue, call:</p>
     * 
     * <pre><code>
     * VkResult vkQueueSubmit2(
     *     VkQueue                                     queue,
     *     uint32_t                                    submitCount,
     *     const VkSubmitInfo2*                        pSubmits,
     *     VkFence                                     fence);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkQueueSubmit2KHR(
     *     VkQueue                                     queue,
     *     uint32_t                                    submitCount,
     *     const VkSubmitInfo2*                        pSubmits,
     *     VkFence                                     fence);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkQueueSubmit2} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits}.</p>
     * 
     * <p>Semaphore operations submitted with {@link #vkQueueSubmit2 QueueSubmit2} have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores">semaphore</a> section of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization">the synchronization chapter</a>.</p>
     * 
     * <p>If any command buffer submitted to this queue is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">executable state</a>, it is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a>. Once execution of all submissions of a command buffer complete, it moves from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a>, back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">executable state</a>. If a command buffer was recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT} flag, it instead moves back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">invalid state</a>.</p>
     * 
     * <p>If {@code vkQueueSubmit2} fails, it <b>may</b> return {@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY} or {@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced by the submitted command buffers and any semaphores referenced by {@code pSubmits} is unaffected by the call or its failure. If {@code vkQueueSubmit2} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-lost-device">Lost Device</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} referenced an {@code VkEvent}, that event <b>must</b> not be referenced by a command that has been submitted to another queue and is still in the <em>pending state</em></li>
     * <li>The {@code semaphore} member of any binary semaphore element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
     * <li>The {@code stageMask} member of any element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
     * <li>The {@code stageMask} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
     * <li>When a semaphore wait operation for a binary semaphore is executed, as defined by the {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits}, there <b>must</b> be no other queues waiting on the same semaphore</li>
     * <li>The {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution</li>
     * <li>Any {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} that was created with a {@code VkSemaphoreTypeKHR} of {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_BINARY_KHR SEMAPHORE_TYPE_BINARY_KHR} <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
     * <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending or executable state</a></li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a></li>
     * <li>Any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending or executable state</a></li>
     * <li>If any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a></li>
     * <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family {@code queue} belongs to</li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} includes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">Queue Family Transfer Acquire Operation</a>, there <b>must</b> exist a previously submitted <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">Queue Family Transfer Release Operation</a> on a queue in the queue family identified by the acquire operation, with parameters matching the acquire operation as defined in the definition of such <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">acquire operations</a>, and which happens before the acquire operation</li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was a {@link VK10#vkCmdBeginQuery CmdBeginQuery} whose {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#profiling-lock">profiling lock</a> <b>must</b> have been held continuously on the {@code VkDevice} that {@code queue} was retrieved from, throughout recording of those command buffers</li>
     * <li>If {@code queue} was not created with {@link VK11#VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT DEVICE_QUEUE_CREATE_PROTECTED_BIT}, the {@code flags} member of any element of {@code pSubmits} <b>must</b> not include {@link KHRSynchronization2#VK_SUBMIT_PROTECTED_BIT_KHR SUBMIT_PROTECTED_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a valid pointer to an array of {@code submitCount} valid {@link VkSubmitInfo2} structures</li>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
     * <li>Both of {@code fence}, and {@code queue} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
     * </table>
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
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSubmitInfo2}</p>
     *
     * @param queue    the queue that the command buffers will be submitted to.
     * @param pSubmits a pointer to an array of {@link VkSubmitInfo2} structures, each specifying a command buffer submission batch.
     * @param fence    an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
     */
    @NativeType("VkResult")
    public static int vkQueueSubmit2(VkQueue queue, @Nullable @NativeType("VkSubmitInfo2 const *") VkSubmitInfo2.Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
    }

    // --- [ vkCmdCopyBuffer2 ] ---

    /** Unsafe version of: {@link #vkCmdCopyBuffer2 CmdCopyBuffer2} */
    public static void nvkCmdCopyBuffer2(VkCommandBuffer commandBuffer, long pCopyBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferInfo2.validate(pCopyBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    /**
     * Copy data between buffer regions.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data between buffer objects, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyBuffer2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyBufferInfo2*                    pCopyBufferInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdCopyBuffer2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyBufferInfo2*                    pCopyBufferInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyBuffer CmdCopyBuffer}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyBufferInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyBufferInfo2} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyBufferInfo2}</p>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param pCopyBufferInfo a pointer to a {@link VkCopyBufferInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2 const *") VkCopyBufferInfo2 pCopyBufferInfo) {
        nvkCmdCopyBuffer2(commandBuffer, pCopyBufferInfo.address());
    }

    // --- [ vkCmdCopyImage2 ] ---

    /** Unsafe version of: {@link #vkCmdCopyImage2 CmdCopyImage2} */
    public static void nvkCmdCopyImage2(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageInfo2.validate(pCopyImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    /**
     * Copy data between images.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data between image objects, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyImage2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyImageInfo2*                     pCopyImageInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdCopyImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyImageInfo2*                     pCopyImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyImage CmdCopyImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageInfo2} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageInfo2}</p>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pCopyImageInfo a pointer to a {@link VkCopyImageInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyImage2(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2 const *") VkCopyImageInfo2 pCopyImageInfo) {
        nvkCmdCopyImage2(commandBuffer, pCopyImageInfo.address());
    }

    // --- [ vkCmdCopyBufferToImage2 ] ---

    /** Unsafe version of: {@link #vkCmdCopyBufferToImage2 CmdCopyBufferToImage2} */
    public static void nvkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferToImageInfo2.validate(pCopyBufferToImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    /**
     * Copy data from a buffer into an image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from a buffer object to an image object, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyBufferToImage2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyBufferToImageInfo2*             pCopyBufferToImageInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdCopyBufferToImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyBufferToImageInfo2*             pCopyBufferToImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyBufferToImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyBufferToImageInfo2} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyBufferToImageInfo2}</p>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param pCopyBufferToImageInfo a pointer to a {@link VkCopyBufferToImageInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2 const *") VkCopyBufferToImageInfo2 pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2(commandBuffer, pCopyBufferToImageInfo.address());
    }

    // --- [ vkCmdCopyImageToBuffer2 ] ---

    /** Unsafe version of: {@link #vkCmdCopyImageToBuffer2 CmdCopyImageToBuffer2} */
    public static void nvkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToBufferInfo2.validate(pCopyImageToBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    /**
     * Copy image data into a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from an image object to a buffer object, call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyImageToBuffer2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyImageToBufferInfo2*             pCopyImageToBufferInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdCopyImageToBuffer2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyImageToBufferInfo2*             pCopyImageToBufferInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCopyImageToBufferInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageToBufferInfo2} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageToBufferInfo2}</p>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param pCopyImageToBufferInfo a pointer to a {@link VkCopyImageToBufferInfo2} structure describing the copy parameters.
     */
    public static void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2 const *") VkCopyImageToBufferInfo2 pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2(commandBuffer, pCopyImageToBufferInfo.address());
    }

    // --- [ vkCmdBlitImage2 ] ---

    /** Unsafe version of: {@link #vkCmdBlitImage2 CmdBlitImage2} */
    public static void nvkCmdBlitImage2(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkBlitImageInfo2.validate(pBlitImageInfo);
        }
        callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    /**
     * Copy regions of an image, potentially performing format conversion,.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:</p>
     * 
     * <pre><code>
     * void vkCmdBlitImage2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkBlitImageInfo2*                     pBlitImageInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdBlitImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkBlitImageInfo2*                     pBlitImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdBlitImage CmdBlitImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBlitImageInfo} <b>must</b> be a valid pointer to a valid {@link VkBlitImageInfo2} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBlitImageInfo2}</p>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param pBlitImageInfo a pointer to a {@link VkBlitImageInfo2} structure describing the blit parameters.
     */
    public static void vkCmdBlitImage2(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2 const *") VkBlitImageInfo2 pBlitImageInfo) {
        nvkCmdBlitImage2(commandBuffer, pBlitImageInfo.address());
    }

    // --- [ vkCmdResolveImage2 ] ---

    /** Unsafe version of: {@link #vkCmdResolveImage2 CmdResolveImage2} */
    public static void nvkCmdResolveImage2(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkResolveImageInfo2.validate(pResolveImageInfo);
        }
        callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    /**
     * Resolve regions of an image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To resolve a multisample image to a non-multisample image, call:</p>
     * 
     * <pre><code>
     * void vkCmdResolveImage2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkResolveImageInfo2*                  pResolveImageInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdResolveImage2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkResolveImageInfo2*                  pResolveImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCmdResolveImage CmdResolveImage}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pResolveImageInfo} <b>must</b> be a valid pointer to a valid {@link VkResolveImageInfo2} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkResolveImageInfo2}</p>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param pResolveImageInfo a pointer to a {@link VkResolveImageInfo2} structure describing the resolve parameters.
     */
    public static void vkCmdResolveImage2(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2 const *") VkResolveImageInfo2 pResolveImageInfo) {
        nvkCmdResolveImage2(commandBuffer, pResolveImageInfo.address());
    }

    // --- [ vkCmdBeginRendering ] ---

    /** Unsafe version of: {@link #vkCmdBeginRendering CmdBeginRendering} */
    public static void nvkCmdBeginRendering(VkCommandBuffer commandBuffer, long pRenderingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRendering;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        callPPV(commandBuffer.address(), pRenderingInfo, __functionAddress);
    }

    /**
     * Begin a dynamic render pass instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To begin a render pass instance, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginRendering(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingInfo*                      pRenderingInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdBeginRenderingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderingInfo*                      pRenderingInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After beginning a render pass instance, the command buffer is ready to record <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing">draw commands</a>.</p>
     * 
     * <p>If {@code pRenderingInfo→flags} includes {@link #VK_RENDERING_RESUMING_BIT RENDERING_RESUMING_BIT} then this render pass is resumed from a render pass instance that has been suspended earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRendering">{@code dynamicRendering}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code commandBuffer} is a secondary command buffer, {@code pRenderingInfo→flags} <b>must</b> not include {@link #VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pRenderingInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderingInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingInfo}</p>
     *
     * @param commandBuffer  the command buffer in which to record the command.
     * @param pRenderingInfo a pointer to a {@link VkRenderingInfo} structure specifying details of the render pass instance to begin.
     */
    public static void vkCmdBeginRendering(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo) {
        nvkCmdBeginRendering(commandBuffer, pRenderingInfo.address());
    }

    // --- [ vkCmdEndRendering ] ---

    /**
     * End a dynamic render pass instance.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end a render pass instance, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndRendering(
     *     VkCommandBuffer                             commandBuffer);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdEndRenderingKHR(
     *     VkCommandBuffer                             commandBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the value of {@code pRenderingInfo→flags} used to begin this render pass instance included {@link #VK_RENDERING_SUSPENDING_BIT RENDERING_SUSPENDING_BIT}, then this render pass is suspended and will be resumed later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The current render pass instance <b>must</b> have been begun with {@link #vkCmdBeginRendering CmdBeginRendering}</li>
     * <li>The current render pass instance <b>must</b> have been begun in {@code commandBuffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer in which to record the command.
     */
    public static void vkCmdEndRendering(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdSetCullMode ] ---

    /**
     * Set cull mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the cull mode, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetCullMode(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCullModeFlags                             cullMode);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetCullModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCullModeFlags                             cullMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the cull mode for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_CULL_MODE DYNAMIC_STATE_CULL_MODE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::cullMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param cullMode      specifies the cull mode property to use for drawing.
     */
    public static void vkCmdSetCullMode(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    // --- [ vkCmdSetFrontFace ] ---

    /**
     * Set front face orientation dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the front face orientation, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetFrontFace(
     *     VkCommandBuffer                             commandBuffer,
     *     VkFrontFace                                 frontFace);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetFrontFaceEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkFrontFace                                 frontFace);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the front face orientation for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_FRONT_FACE DYNAMIC_STATE_FRONT_FACE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::frontFace} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param frontFace     a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.
     */
    public static void vkCmdSetFrontFace(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveTopology ] ---

    /**
     * Set primitive topology state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> primitive topology, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetPrimitiveTopology(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPrimitiveTopology                         primitiveTopology);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetPrimitiveTopologyEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPrimitiveTopology                         primitiveTopology);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the primitive topology for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::topology} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code primitiveTopology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param primitiveTopology specifies the primitive topology to use for drawing.
     */
    public static void vkCmdSetPrimitiveTopology(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopology;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    // --- [ vkCmdSetViewportWithCount ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportWithCount CmdSetViewportWithCount}
     *
     * @param viewportCount specifies the viewport count.
     */
    public static void nvkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    /**
     * Set the viewport count and viewports dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the viewport count and viewports, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportWithCount(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    viewportCount,
     *     const VkViewport*                           pViewports);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetViewportWithCountEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    viewportCount,
     *     const VkViewport*                           pViewports);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the viewport count and viewports state for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the corresponding {@link VkPipelineViewportStateCreateInfo}{@code ::viewportCount} and {@code pViewports} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code viewportCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
     * <li>{@code commandBuffer} <b>must</b> not have {@link VkCommandBufferInheritanceViewportScissorInfoNV}{@code ::viewportScissor2D} enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pViewports} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid {@link VkViewport} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkViewport}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pViewports    specifies the viewports to use for drawing.
     */
    public static void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCount(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissorWithCount ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetScissorWithCount CmdSetScissorWithCount}
     *
     * @param scissorCount specifies the scissor count.
     */
    public static void nvkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    /**
     * Set the scissor count and scissor rectangular bounds dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the scissor count and scissor rectangular bounds, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetScissorWithCount(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    scissorCount,
     *     const VkRect2D*                             pScissors);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetScissorWithCountEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    scissorCount,
     *     const VkRect2D*                             pScissors);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the scissor count and scissor rectangular bounds state for subsequence drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the corresponding {@link VkPipelineViewportStateCreateInfo}{@code ::scissorCount} and {@code pScissors} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code scissorCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceLimits}{@code ::maxViewports}, inclusive</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
     * <li>The {@code x} and {@code y} members of {@code offset} member of any element of {@code pScissors} <b>must</b> be greater than or equal to 0</li>
     * <li>Evaluation of <code>(offset.x + extent.width)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
     * <li>Evaluation of <code>(offset.y + extent.height)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
     * <li>{@code commandBuffer} <b>must</b> not have {@link VkCommandBufferInheritanceViewportScissorInfoNV}{@code ::viewportScissor2D} enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pScissors} <b>must</b> be a valid pointer to an array of {@code scissorCount} {@link VkRect2D} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code scissorCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pScissors     specifies the scissors to use for drawing.
     */
    public static void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCount(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdBindVertexBuffers2 ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindVertexBuffers2 CmdBindVertexBuffers2}
     *
     * @param bindingCount the number of vertex input bindings whose state is updated by the command.
     */
    public static void nvkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /**
     * Bind vertex buffers to a command buffer and dynamically set strides.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to bind vertex buffers, along with their sizes and strides, to a command buffer for use in subsequent drawing commands, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindVertexBuffers2(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstBinding,
     *     uint32_t                                    bindingCount,
     *     const VkBuffer*                             pBuffers,
     *     const VkDeviceSize*                         pOffsets,
     *     const VkDeviceSize*                         pSizes,
     *     const VkDeviceSize*                         pStrides);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdBindVertexBuffers2EXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstBinding,
     *     uint32_t                                    bindingCount,
     *     const VkBuffer*                             pBuffers,
     *     const VkDeviceSize*                         pOffsets,
     *     const VkDeviceSize*                         pSizes,
     *     const VkDeviceSize*                         pStrides);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. If {@code pSizes} is not {@code NULL} then {@code pSizes}[i] specifies the bound size of the vertex buffer starting from the corresponding elements of {@code pBuffers}[i] plus {@code pOffsets}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent drawing commands. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is enabled, elements of {@code pBuffers} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and <b>can</b> be used by the vertex shader. If a vertex input attribute is bound to a vertex input binding that is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the values taken from memory are considered to be zero, and missing G, B, or A components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input-extraction">filled with <code>(0,0,1)</code></a>.</p>
     * 
     * <p>This command also <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically sets</a> the byte strides between consecutive elements within buffer {@code pBuffers}[i] to the corresponding {@code pStrides}[i] value when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, strides are specified by the {@link VkVertexInputBindingDescription}{@code ::stride} values used to create the currently active pipeline.</p>
     * 
     * <p>If the bound pipeline state object was also created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled then {@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>can</b> be used instead of {@code vkCmdBindVertexBuffers2} to set the stride.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
     * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
     * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
     * <li>If {@code pSizes} is not {@code NULL}, all elements of {@code pOffsets} plus {@code pSizes} <b>must</b> be less than or equal to the size of the corresponding element in {@code pBuffers}</li>
     * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_VERTEX_BUFFER_BIT BUFFER_USAGE_VERTEX_BUFFER_BIT} flag</li>
     * <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, all elements of {@code pBuffers} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If an element of {@code pBuffers} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the corresponding element of {@code pOffsets} <b>must</b> be zero</li>
     * <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindingStride}</li>
     * <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be either 0 or greater than or equal to the maximum extent of all vertex input attributes fetched from the corresponding binding, where the extent is calculated as the {@link VkVertexInputAttributeDescription}{@code ::offset} plus {@link VkVertexInputAttributeDescription}{@code ::format} size</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} {@code VkBuffer} handles</li>
     * <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>If {@code pSizes} is not {@code NULL}, {@code pSizes} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>If {@code pStrides} is not {@code NULL}, {@code pStrides} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If any of {@code pSizes}, or {@code pStrides} are not {@code NULL}, {@code bindingCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param firstBinding  the index of the first vertex input binding whose state is updated by the command.
     * @param pBuffers      a pointer to an array of buffer handles.
     * @param pOffsets      a pointer to an array of buffer offsets.
     * @param pSizes        {@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}.
     * @param pStrides      {@code NULL} or a pointer to an array of buffer strides.
     */
    public static void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pSizes, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pStrides) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
            checkSafe(pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes), memAddressSafe(pStrides));
    }

    // --- [ vkCmdSetDepthTestEnable ] ---

    /**
     * Set depth test enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically enable or disable</a> the depth test, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthTestEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthTestEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthTestEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the depth test enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE DYNAMIC_STATE_DEPTH_TEST_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDepthStencilStateCreateInfo}{@code ::depthTestEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthTestEnable specifies if the depth test is enabled.
     */
    public static void vkCmdSetDepthTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthWriteEnable ] ---

    /**
     * Set depth write enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the depth write enable, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthWriteEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthWriteEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthWriteEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthWriteEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the depth write enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDepthStencilStateCreateInfo}{@code ::depthWriteEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthWriteEnable specifies if depth writes are enabled.
     */
    public static void vkCmdSetDepthWriteEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthCompareOp ] ---

    /**
     * Set depth comparison operator dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the depth compare operator, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthCompareOp(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCompareOp                                 depthCompareOp);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthCompareOpEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkCompareOp                                 depthCompareOp);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the depth comparison operator for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_COMPARE_OP DYNAMIC_STATE_DEPTH_COMPARE_OP} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDepthStencilStateCreateInfo}{@code ::depthCompareOp} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code depthCompareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param depthCompareOp specifies the depth comparison operator.
     */
    public static void vkCmdSetDepthCompareOp(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    // --- [ vkCmdSetDepthBoundsTestEnable ] ---

    /**
     * Set depth bounds test enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically enable or disable</a> the depth bounds test, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthBoundsTestEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthBoundsTestEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthBoundsTestEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthBoundsTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the depth bounds enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDepthStencilStateCreateInfo}{@code ::depthBoundsTestEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param depthBoundsTestEnable specifies if the depth bounds test is enabled.
     */
    public static void vkCmdSetDepthBoundsTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilTestEnable ] ---

    /**
     * Set stencil test enable dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically enable or disable</a> the stencil test, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetStencilTestEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    stencilTestEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetStencilTestEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    stencilTestEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the stencil test enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE DYNAMIC_STATE_STENCIL_TEST_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDepthStencilStateCreateInfo}{@code ::stencilTestEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param stencilTestEnable specifies if the stencil test is enabled.
     */
    public static void vkCmdSetStencilTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilOp ] ---

    /**
     * Set stencil operation dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the stencil operation, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetStencilOp(
     *     VkCommandBuffer                             commandBuffer,
     *     VkStencilFaceFlags                          faceMask,
     *     VkStencilOp                                 failOp,
     *     VkStencilOp                                 passOp,
     *     VkStencilOp                                 depthFailOp,
     *     VkCompareOp                                 compareOp);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetStencilOpEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkStencilFaceFlags                          faceMask,
     *     VkStencilOp                                 failOp,
     *     VkStencilOp                                 passOp,
     *     VkStencilOp                                 depthFailOp,
     *     VkCompareOp                                 compareOp);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the stencil operation for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_STENCIL_OP DYNAMIC_STATE_STENCIL_OP} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the corresponding {@link VkPipelineDepthStencilStateCreateInfo}{@code ::failOp}, {@code passOp}, {@code depthFailOp}, and {@code compareOp} values used to create the currently active pipeline, for both front and back faces.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
     * <li>{@code faceMask} <b>must</b> not be 0</li>
     * <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
     * <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
     * <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
     * <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation.
     * @param failOp        a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test.
     * @param passOp        a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests.
     * @param depthFailOp   a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test.
     * @param compareOp     a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.
     */
    public static void vkCmdSetStencilOp(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    // --- [ vkCmdSetRasterizerDiscardEnable ] ---

    /**
     * Control whether primitives are discarded before the rasterization stage dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically enable</a> whether primitives are discarded before the rasterization stage, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetRasterizerDiscardEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    rasterizerDiscardEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetRasterizerDiscardEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    rasterizerDiscardEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the discard enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::rasterizerDiscardEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer           the command buffer into which the command will be recorded.
     * @param rasterizerDiscardEnable controls whether primitives are discarded immediately before the rasterization stage.
     */
    public static void vkCmdSetRasterizerDiscardEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthBiasEnable ] ---

    /**
     * Control whether to bias fragment depth values dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically enable</a> whether to bias fragment depth values, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthBiasEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthBiasEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetDepthBiasEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    depthBiasEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the depth bias enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineRasterizationStateCreateInfo}{@code ::depthBiasEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthBiasEnable controls whether to bias fragment depth values.
     */
    public static void vkCmdSetDepthBiasEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveRestartEnable ] ---

    /**
     * Set primitive assembly restart state dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically control</a> whether a special vertex index value is treated as restarting the assembly of primitives, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetPrimitiveRestartEnable(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    primitiveRestartEnable);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdSetPrimitiveRestartEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    primitiveRestartEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the primitive restart enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::primitiveRestartEnable} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param primitiveRestartEnable controls whether a special vertex index value is treated as restarting the assembly of primitives. It behaves in the same way as {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::primitiveRestartEnable}
     */
    public static void vkCmdSetPrimitiveRestartEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkGetDeviceBufferMemoryRequirements ] ---

    /** Unsafe version of: {@link #vkGetDeviceBufferMemoryRequirements GetDeviceBufferMemoryRequirements} */
    public static void nvkGetDeviceBufferMemoryRequirements(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceBufferMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceBufferMemoryRequirements.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for a buffer resource without creating an object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceBufferMemoryRequirements(
     *     VkDevice                                    device,
     *     const VkDeviceBufferMemoryRequirements*     pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetDeviceBufferMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     const VkDeviceBufferMemoryRequirements*     pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceBufferMemoryRequirements} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceBufferMemoryRequirements}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device intended to own the buffer.
     * @param pInfo               a pointer to a {@link VkDeviceBufferMemoryRequirements} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetDeviceBufferMemoryRequirements(VkDevice device, @NativeType("VkDeviceBufferMemoryRequirements const *") VkDeviceBufferMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceBufferMemoryRequirements(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageMemoryRequirements ] ---

    /** Unsafe version of: {@link #vkGetDeviceImageMemoryRequirements GetDeviceImageMemoryRequirements} */
    public static void nvkGetDeviceImageMemoryRequirements(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Returns the memory requirements for specified Vulkan object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for an image resource without creating an object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageMemoryRequirements(
     *     VkDevice                                    device,
     *     const VkDeviceImageMemoryRequirements*      pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     const VkDeviceImageMemoryRequirements*      pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceImageMemoryRequirements} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceImageMemoryRequirements}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device intended to own the image.
     * @param pInfo               a pointer to a {@link VkDeviceImageMemoryRequirements} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the image object are returned.
     */
    public static void vkGetDeviceImageMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceImageMemoryRequirements(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageSparseMemoryRequirements ] ---

    /**
     * Unsafe version of: {@link #vkGetDeviceImageSparseMemoryRequirements GetDeviceImageSparseMemoryRequirements}
     *
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     */
    public static void nvkGetDeviceImageSparseMemoryRequirements(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /**
     * Query the memory requirements for a sparse image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the sparse memory requirements for an image resource without creating an object, call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageSparseMemoryRequirements(
     *     VkDevice                                    device,
     *     const VkDeviceImageMemoryRequirements*      pInfo,
     *     uint32_t*                                   pSparseMemoryRequirementCount,
     *     VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkGetDeviceImageSparseMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     const VkDeviceImageMemoryRequirements*      pInfo,
     *     uint32_t*                                   pSparseMemoryRequirementCount,
     *     VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceImageMemoryRequirements} structure</li>
     * <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} {@link VkSparseImageMemoryRequirements2} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceImageMemoryRequirements}, {@link VkSparseImageMemoryRequirements2}</p>
     *
     * @param device                        the logical device intended to own the image.
     * @param pInfo                         a pointer to a {@link VkDeviceImageMemoryRequirements} structure containing parameters required for the memory requirements query.
     * @param pSparseMemoryRequirementCount a pointer to an integer related to the number of sparse memory requirements available or queried, as described below.
     * @param pSparseMemoryRequirements     either {@code NULL} or a pointer to an array of {@link VkSparseImageMemoryRequirements2} structures.
     */
    public static void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetDeviceImageSparseMemoryRequirements(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceToolProperties GetPhysicalDeviceToolProperties} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pToolCount, @Nullable @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount[0]);
        }
        return callPPPI(physicalDevice.address(), pToolCount, memAddressSafe(pToolProperties), __functionAddress);
    }

    /** Array version of: {@link #vkCreatePrivateDataSlot CreatePrivateDataSlot} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") long[] pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlot;
        if (CHECKS) {
            check(__functionAddress);
            check(pPrivateDataSlot, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPrivateDataSlot, __functionAddress);
    }

    /** Array version of: {@link #vkGetPrivateData GetPrivateData} */
    public static void vkGetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateData;
        if (CHECKS) {
            check(__functionAddress);
            check(pData, 1);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    /** Array version of: {@link #vkCmdWaitEvents2 CmdWaitEvents2} */
    public static void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2;
        if (CHECKS) {
            check(__functionAddress);
            check(pDependencyInfos, pEvents.length);
            Struct.validate(pDependencyInfos.address(), pEvents.length, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }

    /** Array version of: {@link #vkCmdBindVertexBuffers2 CmdBindVertexBuffers2} */
    public static void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @Nullable @NativeType("VkDeviceSize const *") long[] pSizes, @Nullable @NativeType("VkDeviceSize const *") long[] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
            checkSafe(pStrides, pBuffers.length);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /** Array version of: {@link #vkGetDeviceImageSparseMemoryRequirements GetDeviceImageSparseMemoryRequirements} */
    public static void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @Nullable @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
            VkDeviceImageMemoryRequirements.validate(pInfo.address());
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

}