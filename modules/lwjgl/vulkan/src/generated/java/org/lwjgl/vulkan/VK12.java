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
 * The core Vulkan 1.2 functionality.
 * 
 * <p>Vulkan Version 1.2 <em>promoted</em> a number of key extensions into the core API:</p>
 * 
 * <ul>
 * <li>{@link KHR8bitStorage KHR_8bit_storage}</li>
 * <li>{@link KHRBufferDeviceAddress KHR_buffer_device_address}</li>
 * <li>{@link KHRCreateRenderpass2 KHR_create_renderpass2}</li>
 * <li>{@link KHRDepthStencilResolve KHR_depth_stencil_resolve}</li>
 * <li>{@link KHRDrawIndirectCount KHR_draw_indirect_count}</li>
 * <li>{@link KHRDriverProperties KHR_driver_properties}</li>
 * <li>{@link KHRImageFormatList KHR_image_format_list}</li>
 * <li>{@link KHRImagelessFramebuffer KHR_imageless_framebuffer}</li>
 * <li>{@link KHRSamplerMirrorClampToEdge KHR_sampler_mirror_clamp_to_edge}</li>
 * <li>{@link KHRSeparateDepthStencilLayouts KHR_separate_depth_stencil_layouts}</li>
 * <li>{@link KHRShaderAtomicInt64 KHR_shader_atomic_int64}</li>
 * <li>{@link KHRShaderFloat16Int8 KHR_shader_float16_int8}</li>
 * <li>{@link KHRShaderFloatControls KHR_shader_float_controls}</li>
 * <li>{@link KHRShaderSubgroupExtendedTypes KHR_shader_subgroup_extended_types}</li>
 * <li>{@link KHRSpirv14 KHR_spirv_1_4}</li>
 * <li>{@link KHRTimelineSemaphore KHR_timeline_semaphore}</li>
 * <li>{@link KHRUniformBufferStandardLayout KHR_uniform_buffer_standard_layout}</li>
 * <li>{@link KHRVulkanMemoryModel KHR_vulkan_memory_model}</li>
 * <li>{@link EXTDescriptorIndexing EXT_descriptor_indexing}</li>
 * <li>{@link EXTHostQueryReset EXT_host_query_reset}</li>
 * <li>{@link EXTSamplerFilterMinmax EXT_sampler_filter_minmax}</li>
 * <li>{@link EXTScalarBlockLayout EXT_scalar_block_layout}</li>
 * <li>{@link EXTSeparateStencilUsage EXT_separate_stencil_usage}</li>
 * <li>{@link EXTShaderViewportIndexLayer EXT_shader_viewport_index_layer}</li>
 * </ul>
 * 
 * <p>All differences in behavior between these extensions and the corresponding Vulkan 1.2 functionality are summarized below.</p>
 * 
 * <h3>Differences relative to {@code VK_KHR_8bit_storage}</h3>
 * 
 * <p>If the {@code VK_KHR_8bit_storage} extension is not supported, support for the SPIR-V {@code StorageBuffer8BitAccess} capability in shader modules
 * is optional. Support for this feature is defined by {@link VkPhysicalDeviceVulkan12Features}{@code ::storageBuffer8BitAccess} when queried via
 * {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.</p>
 * 
 * <h3>Differences relative to {@code VK_KHR_draw_indirect_count}</h3>
 * 
 * <p>If the {@code VK_KHR_draw_indirect_count} extension is not supported, support for the entry points {@link #vkCmdDrawIndirectCount CmdDrawIndirectCount} and
 * {@link #vkCmdDrawIndexedIndirectCount CmdDrawIndexedIndirectCount} is optional. Support for this feature is defined by {@link VkPhysicalDeviceVulkan12Features}{@code ::drawIndirectCount}
 * when queried via {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.</p>
 * 
 * <h3>Differences relative to {@code VK_KHR_sampler_mirror_clamp_to_edge}</h3>
 * 
 * <p>If the {@code VK_KHR_sampler_mirror_clamp_to_edge} extension is not supported, support for the {@code VkSamplerAddressMode}
 * {@link #VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE} is optional. Support for this feature is defined by
 * {@link VkPhysicalDeviceVulkan12Features}{@code ::samplerMirrorClampToEdge} when queried via {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_descriptor_indexing}</h3>
 * 
 * <p>If the {@code VK_EXT_descriptor_indexing} extension is not supported, support for the {@code descriptorIndexing} feature is optional. Support for
 * this feature is defined by {@link VkPhysicalDeviceVulkan12Features}{@code ::descriptorIndexing} when queried via {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_scalar_block_layout}</h3>
 * 
 * <p>If the {@code VK_EXT_scalar_block_layout} extension is not supported, support for the {@code scalarBlockLayout} feature is optional. Support for
 * this feature is defined by {@link VkPhysicalDeviceVulkan12Features}{@code ::scalarBlockLayout} when queried via {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.</p>
 * 
 * <h3>Differences relative to {@code VK_EXT_shader_viewport_index_layer}</h3>
 * 
 * <p>If the {@code VK_EXT_shader_viewport_index_layer} extension is not supported, support for the {@code ShaderViewportIndexLayerEXT} SPIR-V capability
 * is optional. Support for this feature is defined by {@link VkPhysicalDeviceVulkan12Features}{@code ::shaderOutputViewportIndex} and
 * {@link VkPhysicalDeviceVulkan12Features}{@code ::shaderOutputLayer} when queried via {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}.</p>
 * 
 * <h3>Additional Vulkan 1.2 Feature Support</h3>
 * 
 * <p>In addition to the promoted extensions described above, Vulkan 1.2 added support for:</p>
 * 
 * <ul>
 * <li>SPIR-V version 1.4.</li>
 * <li>SPIR-V version 1.5.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-samplerMirrorClampToEdge">samplerMirrorClampToEdge</a>
 * feature which indicates whether the implementation supports the {@link #VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE} sampler address mode.</li>
 * <li>The {@code ShaderNonUniform} capability in SPIR-V version 1.5.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderOutputViewportIndex">shaderOutputViewportIndex</a>
 * feature which indicates that the
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-capabilities-table-shader-viewport-index">{@code ShaderViewportIndex}</a>
 * capability can be used.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderOutputLayer">shaderOutputLayer</a>
 * feature which indicates that the
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-capabilities-table-shader-layer">{@code ShaderLayer}</a>
 * capability can be used.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-subgroupBroadcastDynamicId">subgroupBroadcastDynamicId</a> 
 * feature which allows the "{@code Id}" operand of {@code OpGroupNonUniformBroadcast} to be dynamically uniform within a subgroup, and the
 * "{@code Index}" operand of {@code OpGroupNonUniformQuadBroadcast} to be dynamically uniform within a derivative group, in shader modules of
 * version 1.5 or higher.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-drawIndirectCount">drawIndirectCount</a>
 * feature which indicates whether the {@link #vkCmdDrawIndirectCount CmdDrawIndirectCount} and {@link #vkCmdDrawIndexedIndirectCount CmdDrawIndexedIndirectCount} functions can be used.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-descriptorIndexing">descriptorIndexing</a>
 * feature which indicates the implementation supports the minimum number of descriptor indexing features as defined in the
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-requirements">Feature Requirements</a>
 * section.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-samplerFilterMinmax">samplerFilterMinmax</a>
 * feature which indicates whether the implementation supports the minimum number of image formats that support the
 * {@link #VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT} feature bit as defined by the
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-filterMinmaxSingleComponentFormats-minimum-requirements">{@code filterMinmaxSingleComponentFormats}</a>
 * property minimum requirements.</li>
 * <li>The <a href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-framebufferIntegerColorSampleCounts">framebufferIntegerColorSampleCounts</a>
 * limit which indicates the color sample counts that are supported for all framebuffer color attachments with integer formats.</li>
 * </ul>
 */
public class VK12 extends VK11 {

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES   = 49,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES = 50,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES   = 51,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES = 52;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO = 1000147000;

    /** Extends {@code VkSamplerAddressMode}. */
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2 STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO STRUCTURE_TYPE_SUBPASS_BEGIN_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_END_INFO STRUCTURE_TYPE_SUBPASS_END_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2  = 1000109000,
        VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2    = 1000109001,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2     = 1000109002,
        VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2      = 1000109003,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 = 1000109004,
        VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO        = 1000109005,
        VK_STRUCTURE_TYPE_SUBPASS_END_INFO          = 1000109006;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES = 1000177000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES = 1000196000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES = 1000180000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES = 1000082000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES = 1000197000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO         = 1000161000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES            = 1000161001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES          = 1000161002,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO  = 1000161003,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT = 1000161004;

    /** Extends {@code VkDescriptorPoolCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT = 0x2;

    /** Extends {@code VkDescriptorSetLayoutCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT = 0x2;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_FRAGMENTATION = -1000161000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES = 1000199000,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE        = 1000199001;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES = 1000221000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO = 1000246000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES = 1000130000,
        VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO               = 1000130001;

    /** Extends {@code VkFormatFeatureFlagBits}. */
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 0x10000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES = 1000211000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES = 1000108000,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO            = 1000108001,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO              = 1000108002,
        VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO              = 1000108003;

    /** Extends {@code VkFramebufferCreateFlagBits}. */
    public static final int VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT = 0x1;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES = 1000253000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES = 1000175000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES = 1000241000,
        VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT                     = 1000241001,
        VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT                   = 1000241002;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL   = 1000241000,
        VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL    = 1000241001,
        VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL = 1000241002,
        VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL  = 1000241003;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES = 1000261000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES   = 1000207000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES = 1000207001,
        VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO                    = 1000207002,
        VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO                = 1000207003,
        VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO                           = 1000207004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO                         = 1000207005;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES = 1000257000,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO                     = 1000244001,
        VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO      = 1000257002,
        VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO    = 1000257003,
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO      = 1000257004;

    /** Extends {@code VkBufferUsageFlagBits}. */
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT = 0x20000;

    /** Extends {@code VkBufferCreateFlagBits}. */
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 0x10;

    /**
     * Extends {@code VkMemoryAllocateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT}</li>
     * <li>{@link #VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}</li>
     * </ul>
     */
    public static final int
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT                = 0x2,
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 0x4;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = -1000257000;

    /**
     * VkDriverId - Khronos driver IDs
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Khronos driver IDs may be allocated by vendors at any time. There may be multiple driver IDs for the same vendor, representing different drivers (for e.g. different platforms, proprietary or open source, etc.). Only the latest canonical versions of this Specification, of the corresponding {@code vk.xml} API Registry, and of the corresponding {@code vulkan_core.h} header file <b>must</b> contain all reserved Khronos driver IDs.</p>
     * 
     * <p>Only driver IDs registered with Khronos are given symbolic names. There <b>may</b> be unregistered driver IDs returned.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceDriverProperties}, {@link VkPhysicalDeviceVulkan12Properties}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DRIVER_ID_AMD_PROPRIETARY DRIVER_ID_AMD_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_AMD_OPEN_SOURCE DRIVER_ID_AMD_OPEN_SOURCE}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_RADV DRIVER_ID_MESA_RADV}</li>
     * <li>{@link #VK_DRIVER_ID_NVIDIA_PROPRIETARY DRIVER_ID_NVIDIA_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS DRIVER_ID_INTEL_PROPRIETARY_WINDOWS}</li>
     * <li>{@link #VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA DRIVER_ID_INTEL_OPEN_SOURCE_MESA}</li>
     * <li>{@link #VK_DRIVER_ID_IMAGINATION_PROPRIETARY DRIVER_ID_IMAGINATION_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_QUALCOMM_PROPRIETARY DRIVER_ID_QUALCOMM_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_ARM_PROPRIETARY DRIVER_ID_ARM_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_GOOGLE_SWIFTSHADER DRIVER_ID_GOOGLE_SWIFTSHADER}</li>
     * <li>{@link #VK_DRIVER_ID_GGP_PROPRIETARY DRIVER_ID_GGP_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_BROADCOM_PROPRIETARY DRIVER_ID_BROADCOM_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_LLVMPIPE DRIVER_ID_MESA_LLVMPIPE}</li>
     * <li>{@link #VK_DRIVER_ID_MOLTENVK DRIVER_ID_MOLTENVK}</li>
     * <li>{@link #VK_DRIVER_ID_COREAVI_PROPRIETARY DRIVER_ID_COREAVI_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_JUICE_PROPRIETARY DRIVER_ID_JUICE_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_VERISILICON_PROPRIETARY DRIVER_ID_VERISILICON_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_TURNIP DRIVER_ID_MESA_TURNIP}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_V3DV DRIVER_ID_MESA_V3DV}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_PANVK DRIVER_ID_MESA_PANVK}</li>
     * <li>{@link #VK_DRIVER_ID_SAMSUNG_PROPRIETARY DRIVER_ID_SAMSUNG_PROPRIETARY}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_VENUS DRIVER_ID_MESA_VENUS}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_DOZEN DRIVER_ID_MESA_DOZEN}</li>
     * <li>{@link #VK_DRIVER_ID_MESA_NVK DRIVER_ID_MESA_NVK}</li>
     * <li>{@link #VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA}</li>
     * </ul>
     */
    public static final int
        VK_DRIVER_ID_AMD_PROPRIETARY              = 1,
        VK_DRIVER_ID_AMD_OPEN_SOURCE              = 2,
        VK_DRIVER_ID_MESA_RADV                    = 3,
        VK_DRIVER_ID_NVIDIA_PROPRIETARY           = 4,
        VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS    = 5,
        VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA       = 6,
        VK_DRIVER_ID_IMAGINATION_PROPRIETARY      = 7,
        VK_DRIVER_ID_QUALCOMM_PROPRIETARY         = 8,
        VK_DRIVER_ID_ARM_PROPRIETARY              = 9,
        VK_DRIVER_ID_GOOGLE_SWIFTSHADER           = 10,
        VK_DRIVER_ID_GGP_PROPRIETARY              = 11,
        VK_DRIVER_ID_BROADCOM_PROPRIETARY         = 12,
        VK_DRIVER_ID_MESA_LLVMPIPE                = 13,
        VK_DRIVER_ID_MOLTENVK                     = 14,
        VK_DRIVER_ID_COREAVI_PROPRIETARY          = 15,
        VK_DRIVER_ID_JUICE_PROPRIETARY            = 16,
        VK_DRIVER_ID_VERISILICON_PROPRIETARY      = 17,
        VK_DRIVER_ID_MESA_TURNIP                  = 18,
        VK_DRIVER_ID_MESA_V3DV                    = 19,
        VK_DRIVER_ID_MESA_PANVK                   = 20,
        VK_DRIVER_ID_SAMSUNG_PROPRIETARY          = 21,
        VK_DRIVER_ID_MESA_VENUS                   = 22,
        VK_DRIVER_ID_MESA_DOZEN                   = 23,
        VK_DRIVER_ID_MESA_NVK                     = 24,
        VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA = 25;

    /**
     * VkShaderFloatControlsIndependence - Bitmask specifying whether, and how, shader float controls can be set separately
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY} specifies that shader float controls for 32-bit floating point <b>can</b> be set independently; other bit widths <b>must</b> be set identically to each other.</li>
     * <li>{@link #VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL} specifies that shader float controls for all bit widths <b>can</b> be set independently.</li>
     * <li>{@link #VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE} specifies that shader float controls for all bit widths <b>must</b> be set identically.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceFloatControlsProperties}, {@link VkPhysicalDeviceVulkan12Properties}</p>
     */
    public static final int
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY = 0,
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL         = 1,
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE        = 2;

    /**
     * VkResolveModeFlagBits - Bitmask indicating supported depth and stencil resolve modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE} indicates that no resolve operation is done.</li>
     * <li>{@link #VK_RESOLVE_MODE_SAMPLE_ZERO_BIT RESOLVE_MODE_SAMPLE_ZERO_BIT} indicates that result of the resolve operation is equal to the value of sample 0.</li>
     * <li>{@link #VK_RESOLVE_MODE_AVERAGE_BIT RESOLVE_MODE_AVERAGE_BIT} indicates that result of the resolve operation is the average of the sample values.</li>
     * <li>{@link #VK_RESOLVE_MODE_MIN_BIT RESOLVE_MODE_MIN_BIT} indicates that result of the resolve operation is the minimum of the sample values.</li>
     * <li>{@link #VK_RESOLVE_MODE_MAX_BIT RESOLVE_MODE_MAX_BIT} indicates that result of the resolve operation is the maximum of the sample values.</li>
     * </ul>
     * 
     * <p>When no resolve mode is specified, {@link #VK_RESOLVE_MODE_AVERAGE_BIT RESOLVE_MODE_AVERAGE_BIT} is used.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderingAttachmentInfo}, {@link VkSubpassDescriptionDepthStencilResolve}</p>
     */
    public static final int
        VK_RESOLVE_MODE_NONE            = 0,
        VK_RESOLVE_MODE_SAMPLE_ZERO_BIT = 0x1,
        VK_RESOLVE_MODE_AVERAGE_BIT     = 0x2,
        VK_RESOLVE_MODE_MIN_BIT         = 0x4,
        VK_RESOLVE_MODE_MAX_BIT         = 0x8;

    /**
     * VkDescriptorBindingFlagBits - Bitmask specifying descriptor set layout binding properties
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} indicates that if descriptors in this binding are updated between when the descriptor set is bound in a command buffer and when that command buffer is submitted to a queue, then the submission will use the most recently set descriptors for this binding and the updates do not invalidate the command buffer. Descriptor bindings created with this flag are also partially exempt from the external synchronization requirement in {@link KHRDescriptorUpdateTemplate#vkUpdateDescriptorSetWithTemplateKHR UpdateDescriptorSetWithTemplateKHR} and {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets}. Multiple descriptors with this flag set <b>can</b> be updated concurrently in different threads, though the same descriptor <b>must</b> not be updated concurrently by two threads. Descriptors with this flag set <b>can</b> be updated concurrently with the set being bound to a command buffer in another thread, but not concurrently with the set being reset or freed.</li>
     * <li>{@link #VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT} indicates that descriptors in this binding that are not <em>dynamically used</em> need not contain valid descriptors at the time the descriptors are consumed. A descriptor is dynamically used if any shader invocation executes an instruction that performs any memory access using the descriptor. If a descriptor is not dynamically used, any resource referenced by the descriptor is not considered to be referenced during command execution.</li>
     * <li>{@link #VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT} indicates that descriptors in this binding <b>can</b> be updated after a command buffer has bound this descriptor set, or while a command buffer that uses this descriptor set is pending execution, as long as the descriptors that are updated are not used by those command buffers. Descriptor bindings created with this flag are also partially exempt from the external synchronization requirement in {@link KHRDescriptorUpdateTemplate#vkUpdateDescriptorSetWithTemplateKHR UpdateDescriptorSetWithTemplateKHR} and {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} in the same way as for {@link #VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}. If {@link #VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT} is also set, then descriptors <b>can</b> be updated as long as they are not dynamically used by any shader invocations. If {@link #VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT} is not set, then descriptors <b>can</b> be updated as long as they are not statically used by any shader invocations.</li>
     * <li>{@link #VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT} indicates that this is a <em>variable-sized descriptor binding</em> whose size will be specified when a descriptor set is allocated using this layout. The value of {@code descriptorCount} is treated as an upper bound on the size of the binding. This <b>must</b> only be used for the last binding in the descriptor set layout (i.e. the binding with the largest value of {@code binding}). For the purposes of counting against limits such as {@code maxDescriptorSet}* and {@code maxPerStageDescriptor}*, the full value of {@code descriptorCount} is counted, except for descriptor bindings with a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, when {@link VkDescriptorSetLayoutCreateInfo}{@code ::flags} does not contain {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}. In this case, {@code descriptorCount} specifies the upper bound on the byte size of the binding; thus it counts against the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxInlineUniformBlockSize">{@code maxInlineUniformBlockSize}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxInlineUniformTotalSize">{@code maxInlineUniformTotalSize}</a> limits instead.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Note that while {@link #VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} and {@link #VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT} both involve updates to descriptor sets after they are bound, {@link #VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT} is a weaker requirement since it is only about descriptors that are not used, whereas {@link #VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} requires the implementation to observe updates to descriptors that are used.</p>
     * </div>
     */
    public static final int
        VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT           = 0x1,
        VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT = 0x2,
        VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT             = 0x4,
        VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT   = 0x8;

    /**
     * VkSamplerReductionMode - Specify reduction mode for texture filtering
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE} specifies that texel values are combined by computing a weighted average of values in the footprint, using weights as specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-unnormalized-to-integer">the image operations chapter</a>.</li>
     * <li>{@link #VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} specifies that texel values are combined by taking the component-wise minimum of values in the footprint with non-zero weights.</li>
     * <li>{@link #VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} specifies that texel values are combined by taking the component-wise maximum of values in the footprint with non-zero weights.</li>
     * <li>{@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} specifies values are combined as described by {@link #VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, followed by a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-texel-range-clamp">texel range clamp</a>.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSamplerReductionModeCreateInfo}</p>
     */
    public static final int
        VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE = 0,
        VK_SAMPLER_REDUCTION_MODE_MIN              = 1,
        VK_SAMPLER_REDUCTION_MODE_MAX              = 2;

    /**
     * VkSemaphoreType - Specifies the type of a semaphore object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_TYPE_BINARY SEMAPHORE_TYPE_BINARY} specifies a <em>binary semaphore</em> type that has a boolean payload indicating whether the semaphore is currently signaled or unsignaled. When created, the semaphore is in the unsignaled state.</li>
     * <li>{@link #VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} specifies a <em>timeline semaphore</em> type that has a strictly increasing 64-bit unsigned integer payload indicating whether the semaphore is signaled with respect to a particular reference value. When created, the semaphore payload has the value given by the {@code initialValue} field of {@link VkSemaphoreTypeCreateInfo}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSemaphoreTypeCreateInfo}</p>
     */
    public static final int
        VK_SEMAPHORE_TYPE_BINARY   = 0,
        VK_SEMAPHORE_TYPE_TIMELINE = 1;

    /**
     * VkSemaphoreWaitFlagBits - Bitmask specifying additional parameters of a semaphore wait operation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SEMAPHORE_WAIT_ANY_BIT SEMAPHORE_WAIT_ANY_BIT} specifies that the semaphore wait condition is that at least one of the semaphores in {@link VkSemaphoreWaitInfo}{@code ::pSemaphores} has reached the value specified by the corresponding element of {@link VkSemaphoreWaitInfo}{@code ::pValues}. If {@link #VK_SEMAPHORE_WAIT_ANY_BIT SEMAPHORE_WAIT_ANY_BIT} is not set, the semaphore wait condition is that all of the semaphores in {@link VkSemaphoreWaitInfo}{@code ::pSemaphores} have reached the value specified by the corresponding element of {@link VkSemaphoreWaitInfo}{@code ::pValues}.</li>
     * </ul>
     */
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT = 0x1;

    /** The API version number for Vulkan 1.2. */
    public static final int VK_API_VERSION_1_2 = VK_MAKE_API_VERSION(0, 1, 2, 0);

    protected VK12() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDrawIndirectCount ] ---

    /**
     * Draw primitives with indirect parameters and draw count.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a non-indexed draw call with a draw call count sourced from a buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndirectCount(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndirectCountKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndirectCountAMD(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdDrawIndirectCount} behaves similarly to {@link VK10#vkCmdDrawIndirect CmdDrawIndirect} except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-buffer-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link #VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link #VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command
     * 
     * <dl>
     * <dt><b>must</b> not have a {@link VkSamplerReductionModeCreateInfo}</dt>
     * <dd>{@code reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM}</dd>
     * </dl>
     * </li>
     * <li>Any {@code VkImageView} being sampled with a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} as a result of this command <b>must</b> sample with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have {@link VkSamplerCubicWeightsCreateInfoQCOM}{@code ::cubicWeights} equal to {@link QCOMFilterCubicWeights#VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} array that was used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, the bound {@code VkPipeline} <b>must</b> have been created without {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, the bound {@code VkPipeline} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If a descriptor is dynamically used with a {@code VkPipeline} created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and {@link VK10#VK_NULL_HANDLE NULL_HANDLE} shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
     * <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-operation-validation">textures-operation-validation</a></li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
     * <li>If a {@code VkImageView} created with a format other than {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkImageView} created with the format {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format.</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-termination">terminate</a></li>
     * <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
     * <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
     * <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
     * <li>If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
     * <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
     * <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
     * <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-stencil">all stencil ops</a> <b>must</b> be {@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled then {@link VK10#vkCmdSetViewport CmdSetViewport} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} dynamic state enabled then {@link VK10#vkCmdSetScissor CmdSetScissor} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} dynamic state enabled then {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object that outputs line primitives is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} dynamic state enabled then {@link VK10#vkCmdSetDepthBias CmdSetDepthBias} or {@link EXTDepthBiasControl#vkCmdSetDepthBias2EXT CmdSetDepthBias2EXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} in the current command buffer set {@code depthBiasEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetDepthBias CmdSetDepthBias} or {@link EXTDepthBiasControl#vkCmdSetDepthBias2EXT CmdSetDepthBias2EXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} dynamic state enabled then {@link VK10#vkCmdSetBlendConstants CmdSetBlendConstants} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} in the current command buffer set any element of {@code pColorBlendEnables} to {@link VK10#VK_TRUE TRUE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} in the current command buffer set the same element of {@code pColorBlendEquations} to a {@link VkColorBlendEquationEXT} structure with any {@code VkBlendFactor} member with a value of {@link VK10#VK_BLEND_FACTOR_CONSTANT_COLOR BLEND_FACTOR_CONSTANT_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR}, {@link VK10#VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}, {@link VK10#vkCmdSetBlendConstants CmdSetBlendConstants} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} dynamic state enabled then {@link VK10#vkCmdSetDepthBounds CmdSetDepthBounds} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} in the current command buffer set {@code depthBoundsTestEnable} to {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetDepthBounds CmdSetDepthBounds} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} dynamic state enabled then {@link VK10#vkCmdSetStencilCompareMask CmdSetStencilCompareMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetStencilCompareMask CmdSetStencilCompareMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} dynamic state enabled then {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} dynamic state enabled then {@link VK10#vkCmdSetStencilReference CmdSetStencilReference} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetStencilReference CmdSetStencilReference} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} dynamic state enabled then {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} in the current command buffer set {@code sampleLocationsEnable} to {@link VK10#VK_TRUE TRUE}, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} member of the {@link VkPipelineMultisampleStateCreateInfo} structure the bound graphics pipeline has been created with</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_CULL_MODE DYNAMIC_STATE_CULL_MODE} dynamic state enabled then {@link VK13#vkCmdSetCullMode CmdSetCullMode} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetCullMode CmdSetCullMode} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_FRONT_FACE DYNAMIC_STATE_FRONT_FACE} dynamic state enabled then {@link VK13#vkCmdSetFrontFace CmdSetFrontFace} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetFrontFace CmdSetFrontFace} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE DYNAMIC_STATE_DEPTH_TEST_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_COMPARE_OP DYNAMIC_STATE_DEPTH_COMPARE_OP} dynamic state enabled then {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} in the current command buffer set {@code depthTestEnable} to {@link VK10#VK_TRUE TRUE}, then {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthBounds">{@code depthBounds}</a> feature is enabled, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then the {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE DYNAMIC_STATE_STENCIL_TEST_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_STENCIL_OP DYNAMIC_STATE_STENCIL_OP} dynamic state enabled then {@link VK13#vkCmdSetStencilOp CmdSetStencilOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, then {@link VK13#vkCmdSetStencilOp CmdSetStencilOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::scissorCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::viewportCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with both the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic states enabled then both {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} and {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If a shader object is bound to any graphics stage, then both {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} and {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set rasterizerDiscardEnable to {@link VK10#VK_FALSE FALSE}, then {@link NVShadingRateImage#vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set rasterizerDiscardEnable to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} in the current command buffer set shadingRateImageEnable to {@link VK10#VK_TRUE TRUE}, then {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportSwizzleStateCreateInfoNV} structure chained from {@link VkPipelineViewportStateCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure chained from {@link VkPipelineViewportStateCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV} dynamic state enabled then {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV} dynamic state enabled then {@link NVScissorExclusive#vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, then {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} in the current command buffer set any element of {@code pExclusiveScissorEnables} to {@link VK10#VK_TRUE TRUE}, then {@link NVScissorExclusive#vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is enabled on the device, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been {@link VK10#VK_FALSE FALSE}</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then the most recent call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments</li>
     * <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link #VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::viewMask} equal to {@link VkRenderingInfo}{@code ::viewMask}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount} equal to {@link VkRenderingInfo}{@code ::colorAttachmentCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} dynamic state enabled then {@link EXTColorWriteEnable#vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTColorWriteEnable#vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the {@link VkPipelineColorBlendStateCreateInfo}{@code ::attachmentCount} of the currently bound graphics pipeline</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command for each discard rectangle in {@link VkPipelineDiscardRectangleStateCreateInfoEXT}{@code ::discardRectangleCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} in the current command buffer set {@code discardRectangleEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}, the value of the format <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}, the value of the format <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentDensityMapAttachmentInfoEXT}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
     * <li>If the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the value of {@code rasterizationSamples} for the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If this command has been called inside a render pass instance started with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, and the {@code pNext} chain of {@link VkRenderingInfo} includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to {@link VkMultisampledRenderToSingleSampledInfoEXT}{@code ::rasterizationSamples}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline <b>must</b> have been created with a {@link VkGraphicsPipelineCreateInfo}{@code ::renderPass} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the {@link VkRenderingInfo}{@code ::pColorAttachments→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound, stencil test is enabled and the {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetTessellationDomainOriginEXT CmdSetTessellationDomainOriginEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetDepthClampEnableEXT CmdSetDepthClampEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage, then {@link EXTShaderObject#vkCmdSetTessellationDomainOriginEXT CmdSetTessellationDomainOriginEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClamp">{@code depthClamp}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetDepthClampEnableEXT CmdSetDepthClampEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} dynamic state enabled, and {@code alphaToCoverageEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} in the current command buffer set {@code alphaToCoverageEnable} to {@link VK10#VK_TRUE TRUE}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetAlphaToOneEnableEXT CmdSetAlphaToOneEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetAlphaToOneEnableEXT CmdSetAlphaToOneEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLogicOpEnableEXT CmdSetLogicOpEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLogicOpEnableEXT CmdSetLogicOpEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} for any attachment set that attachment’s value in {@code pColorBlendEnables} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, then {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetExtraPrimitiveOverestimationSizeEXT CmdSetExtraPrimitiveOverestimationSizeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} in the current command buffer set {@code conservativeRasterizationMode} to {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}, then {@link EXTShaderObject#vkCmdSetExtraPrimitiveOverestimationSizeEXT CmdSetExtraPrimitiveOverestimationSizeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetDepthClipEnableEXT CmdSetDepthClipEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetDepthClipEnableEXT CmdSetDepthClipEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetProvokingVertexModeEXT CmdSetProvokingVertexModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, then {@link EXTShaderObject#vkCmdSetProvokingVertexModeEXT CmdSetProvokingVertexModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTLineRasterization#VK_DYNAMIC_STATE_LINE_STIPPLE_EXT DYNAMIC_STATE_LINE_STIPPLE_EXT} dynamic state enabled then {@link EXTLineRasterization#vkCmdSetLineStippleEXT CmdSetLineStippleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} in the current command buffer set {@code stippledLineEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTLineRasterization#vkCmdSetLineStippleEXT CmdSetLineStippleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetDepthClipNegativeOneToOneEXT CmdSetDepthClipNegativeOneToOneEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetDepthClipNegativeOneToOneEXT CmdSetDepthClipNegativeOneToOneEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetViewportWScalingEnableNV CmdSetViewportWScalingEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetViewportWScalingEnableNV CmdSetViewportWScalingEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} in the current command buffer set {@code coverageToColorEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} in the current command buffer set coverageModulationMode to any value other than {@link NVFramebufferMixedSamples#VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV}, then {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} in the current command buffer set {@code coverageModulationTableEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set rasterizerDiscardEnable to {@link VK10#VK_FALSE FALSE}, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetRepresentativeFragmentTestEnableNV CmdSetRepresentativeFragmentTestEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetRepresentativeFragmentTestEnableNV CmdSetRepresentativeFragmentTestEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageReductionModeNV CmdSetCoverageReductionModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageReductionModeNV CmdSetCoverageReductionModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} state enabled and the last call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} set {@code pColorBlendEnables} for any attachment to {@link VK10#VK_TRUE TRUE}, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-noattachments">zero-attachment subpass</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state disabled, then the {@code samples} parameter in the last call to {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> be greater or equal to the {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} state and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} states enabled, then the {@code samples} parameter in the last call to {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic states enabled and the last calls to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} and {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, and the bound graphics pipeline was created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} state enabled, the last call to {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have set the {@code rasterizationStream} to zero</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state disabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} member of the {@link VkPipelineMultisampleStateCreateInfo} structure the bound graphics pipeline has been created with</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} in the bound graphics pipeline is {@link VK10#VK_TRUE TRUE} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} in the bound graphics pipeline is {@link VK10#VK_TRUE TRUE} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} in the bound graphics pipeline is {@link VK10#VK_TRUE TRUE} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, then, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} state enabled and the last call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} set {@code coverageModulationTableEnable} to {@link VK10#VK_TRUE TRUE}, then the {@code coverageModulationTableCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} state enabled and the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} set the {@code coverageToColorEnable} to {@link VK10#VK_TRUE TRUE}, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} {@code coverageToColorLocation}, with a {@code VkFormat} of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}, {@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}, {@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}, {@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}, {@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}, or {@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</li>
     * <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by {@link NVCoverageReductionMode#vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT LINE_RASTERIZATION_MODE_DEFAULT_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and {@link VkPhysicalDeviceLimits}{@code ::strictLines} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> be {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT}</li>
     * <li>If the currently bound pipeline was created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} dynamic state {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If dynamic state was inherited from {@link VkCommandBufferInheritanceViewportScissorInfoNV}, it <b>must</b> be set in the current command buffer prior to this drawing command</li>
     * <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
     * <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
     * <li>If there is no bound graphics pipeline, and at least one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> features is enabled, one of the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stages <b>must</b> have a valid {@code VkShaderEXT} bound, and the other <b>must</b> have no {@code VkShaderEXT} bound</li>
     * <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage, and that {@code VkShaderEXT} was created without the {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} flag, a valid {@code VkShaderEXT} <b>must</b> be bound to the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage</li>
     * <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage, and that {@code VkShaderEXT} was created with the {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} flag, there <b>must</b> be no {@code VkShaderEXT} bound to the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage</li>
     * <li>If there is no bound graphics pipeline, and a valid {@code VkShaderEXT} is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, there <b>must</b> be no {@code VkShaderEXT} bound to either the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage or the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage</li>
     * <li>If any graphics shader is bound which was created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag, then all shaders created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag in the same {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT} call <b>must</b> also be bound</li>
     * <li>If any graphics shader is bound which was created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag, any stages in between stages whose shaders which did not create a shader with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag as part of the same {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT} call <b>must</b> not have any {@code VkShaderEXT} bound</li>
     * <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined push constant ranges</li>
     * <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined arrays of descriptor set layouts</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopDynamicState">attachmentFeedbackLoopDynamicState</a> feature is enabled on the device, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE} {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state includes a fragment shader stage, was created with {@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If the bound graphics pipeline state includes a fragment shader stage, was created with {@link VK10#VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> be 0</li>
     * <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT}, and the format of any color attachment is {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}, the corresponding element of the {@code pColorWriteMasks} parameter of {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> either include all of {@link VK10#VK_COLOR_COMPONENT_R_BIT COLOR_COMPONENT_R_BIT}, {@link VK10#VK_COLOR_COMPONENT_G_BIT COLOR_COMPONENT_G_BIT}, and {@link VK10#VK_COLOR_COMPONENT_B_BIT COLOR_COMPONENT_B_BIT}, or none of them</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
     * </ul>
     * 
     * <ul>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} buffers bound</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY} dynamic state enabled then {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY} dynamic state enabled and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-dynamicPrimitiveTopologyUnrestricted">{@code dynamicPrimitiveTopologyUnrestricted}</a> is {@link VK10#VK_FALSE FALSE}, then the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopology} <b>must</b> be of the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-topology-class">topology class</a> as the pipeline {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::topology} state</li>
     * <li>If the bound graphics pipeline was created with both the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} and {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic states enabled, then {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline was created with the {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic state enabled, but not the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of {@link EXTShaderObject#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> not be {@code NULL}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, then {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then all variables with the {@code Input} storage class decorated with {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> contain a location in {@link VkVertexInputAttributeDescription2EXT}{@code ::location}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then the numeric type associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be the same as {@link VkVertexInputAttributeDescription2EXT}{@code ::format}</li>
     * <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, and {@link VkVertexInputAttributeDescription2EXT}{@code ::format} has a 64-bit component, then the scalar width associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be 64-bit</li>
     * <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, and the scalar width associated with a {@code Location} decorated {@code Input} variable in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} is 64-bit, then the corresponding {@link VkVertexInputAttributeDescription2EXT}{@code ::format} <b>must</b> have a 64-bit component</li>
     * <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, and {@link VkVertexInputAttributeDescription2EXT}{@code ::format} has a 64-bit component, then all {@code Input} variables at the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> not use components that are not present in the format</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, then {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetPatchControlPointsEXT CmdSetPatchControlPointsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage, then {@link EXTShaderObject#vkCmdSetPatchControlPointsEXT CmdSetPatchControlPointsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetPrimitiveRestartEnable CmdSetPrimitiveRestartEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, {@link VK13#vkCmdSetPrimitiveRestartEnable CmdSetPrimitiveRestartEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>The bound graphics pipeline <b>must</b> not have been created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
     * <li>There <b>must</b> be no shader object bound to either of the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stages</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code offset} <b>must</b> be a multiple of 4</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code countBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
     * <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
     * <li><code>(countBufferOffset + sizeof(uint32_t))</code> <b>must</b> be less than or equal to the size of {@code countBuffer}</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-drawIndirectCount">{@code drawIndirectCount}</a> is not enabled this function <b>must</b> not be used</li>
     * <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof({@link VkDrawIndirectCommand})</li>
     * <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command is recorded.
     * @param buffer            the buffer containing draw parameters.
     * @param offset            the byte offset into {@code buffer} where parameters begin.
     * @param countBuffer       the buffer containing the draw count.
     * @param countBufferOffset the byte offset into {@code countBuffer} where the draw count begins.
     * @param maxDrawCount      specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}.
     * @param stride            the byte stride between successive sets of draw parameters.
     */
    public static void vkCmdDrawIndirectCount(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

    // --- [ vkCmdDrawIndexedIndirectCount ] ---

    /**
     * Draw parameters with indirect parameters, indexed vertices, and draw count.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record an indexed draw call with a draw call count sourced from a buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndexedIndirectCount(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndexedIndirectCountKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndexedIndirectCountAMD(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdDrawIndexedIndirectCount} behaves similarly to {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect} except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-buffer-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link #VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link #VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command
     * 
     * <dl>
     * <dt><b>must</b> not have a {@link VkSamplerReductionModeCreateInfo}</dt>
     * <dd>{@code reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM}</dd>
     * </dl>
     * </li>
     * <li>Any {@code VkImageView} being sampled with a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} as a result of this command <b>must</b> sample with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have {@link VkSamplerCubicWeightsCreateInfoQCOM}{@code ::cubicWeights} equal to {@link QCOMFilterCubicWeights#VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} array that was used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, the bound {@code VkPipeline} <b>must</b> have been created without {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, the bound {@code VkPipeline} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If a descriptor is dynamically used with a {@code VkPipeline} created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and {@link VK10#VK_NULL_HANDLE NULL_HANDLE} shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
     * <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-operation-validation">textures-operation-validation</a></li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
     * <li>If a {@code VkImageView} created with a format other than {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkImageView} created with the format {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format.</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-termination">terminate</a></li>
     * <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
     * <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
     * <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
     * <li>If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
     * <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
     * <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
     * <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-stencil">all stencil ops</a> <b>must</b> be {@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled then {@link VK10#vkCmdSetViewport CmdSetViewport} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} dynamic state enabled then {@link VK10#vkCmdSetScissor CmdSetScissor} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} dynamic state enabled then {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object that outputs line primitives is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} dynamic state enabled then {@link VK10#vkCmdSetDepthBias CmdSetDepthBias} or {@link EXTDepthBiasControl#vkCmdSetDepthBias2EXT CmdSetDepthBias2EXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} in the current command buffer set {@code depthBiasEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetDepthBias CmdSetDepthBias} or {@link EXTDepthBiasControl#vkCmdSetDepthBias2EXT CmdSetDepthBias2EXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} dynamic state enabled then {@link VK10#vkCmdSetBlendConstants CmdSetBlendConstants} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} in the current command buffer set any element of {@code pColorBlendEnables} to {@link VK10#VK_TRUE TRUE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} in the current command buffer set the same element of {@code pColorBlendEquations} to a {@link VkColorBlendEquationEXT} structure with any {@code VkBlendFactor} member with a value of {@link VK10#VK_BLEND_FACTOR_CONSTANT_COLOR BLEND_FACTOR_CONSTANT_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR}, {@link VK10#VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}, {@link VK10#vkCmdSetBlendConstants CmdSetBlendConstants} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} dynamic state enabled then {@link VK10#vkCmdSetDepthBounds CmdSetDepthBounds} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} in the current command buffer set {@code depthBoundsTestEnable} to {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetDepthBounds CmdSetDepthBounds} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} dynamic state enabled then {@link VK10#vkCmdSetStencilCompareMask CmdSetStencilCompareMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetStencilCompareMask CmdSetStencilCompareMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} dynamic state enabled then {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} dynamic state enabled then {@link VK10#vkCmdSetStencilReference CmdSetStencilReference} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, {@link VK10#vkCmdSetStencilReference CmdSetStencilReference} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} dynamic state enabled then {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} in the current command buffer set {@code sampleLocationsEnable} to {@link VK10#VK_TRUE TRUE}, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} member of the {@link VkPipelineMultisampleStateCreateInfo} structure the bound graphics pipeline has been created with</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_CULL_MODE DYNAMIC_STATE_CULL_MODE} dynamic state enabled then {@link VK13#vkCmdSetCullMode CmdSetCullMode} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetCullMode CmdSetCullMode} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_FRONT_FACE DYNAMIC_STATE_FRONT_FACE} dynamic state enabled then {@link VK13#vkCmdSetFrontFace CmdSetFrontFace} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetFrontFace CmdSetFrontFace} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE DYNAMIC_STATE_DEPTH_TEST_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_COMPARE_OP DYNAMIC_STATE_DEPTH_COMPARE_OP} dynamic state enabled then {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} in the current command buffer set {@code depthTestEnable} to {@link VK10#VK_TRUE TRUE}, then {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthBounds">{@code depthBounds}</a> feature is enabled, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then the {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE DYNAMIC_STATE_STENCIL_TEST_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_STENCIL_OP DYNAMIC_STATE_STENCIL_OP} dynamic state enabled then {@link VK13#vkCmdSetStencilOp CmdSetStencilOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} in the current command buffer set {@code stencilTestEnable} to {@link VK10#VK_TRUE TRUE}, then {@link VK13#vkCmdSetStencilOp CmdSetStencilOp} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::scissorCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::viewportCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with both the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic states enabled then both {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} and {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If a shader object is bound to any graphics stage, then both {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} and {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set rasterizerDiscardEnable to {@link VK10#VK_FALSE FALSE}, then {@link NVShadingRateImage#vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set rasterizerDiscardEnable to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} in the current command buffer set shadingRateImageEnable to {@link VK10#VK_TRUE TRUE}, then {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportSwizzleStateCreateInfoNV} structure chained from {@link VkPipelineViewportStateCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure chained from {@link VkPipelineViewportStateCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV} dynamic state enabled then {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV} dynamic state enabled then {@link NVScissorExclusive#vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, then {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} in the current command buffer set any element of {@code pExclusiveScissorEnables} to {@link VK10#VK_TRUE TRUE}, then {@link NVScissorExclusive#vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is enabled on the device, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been {@link VK10#VK_FALSE FALSE}</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then the most recent call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments</li>
     * <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link #VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::viewMask} equal to {@link VkRenderingInfo}{@code ::viewMask}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount} equal to {@link VkRenderingInfo}{@code ::colorAttachmentCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} dynamic state enabled then {@link EXTColorWriteEnable#vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTColorWriteEnable#vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the {@link VkPipelineColorBlendStateCreateInfo}{@code ::attachmentCount} of the currently bound graphics pipeline</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command for each discard rectangle in {@link VkPipelineDiscardRectangleStateCreateInfoEXT}{@code ::discardRectangleCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} in the current command buffer set {@code discardRectangleEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}, the value of the format <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}, the value of the format <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentDensityMapAttachmentInfoEXT}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
     * <li>If the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the value of {@code rasterizationSamples} for the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If this command has been called inside a render pass instance started with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, and the {@code pNext} chain of {@link VkRenderingInfo} includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to {@link VkMultisampledRenderToSingleSampledInfoEXT}{@code ::rasterizationSamples}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline <b>must</b> have been created with a {@link VkGraphicsPipelineCreateInfo}{@code ::renderPass} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the {@link VkRenderingInfo}{@code ::pColorAttachments→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound, stencil test is enabled and the {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetTessellationDomainOriginEXT CmdSetTessellationDomainOriginEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetDepthClampEnableEXT CmdSetDepthClampEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage, then {@link EXTShaderObject#vkCmdSetTessellationDomainOriginEXT CmdSetTessellationDomainOriginEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClamp">{@code depthClamp}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetDepthClampEnableEXT CmdSetDepthClampEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} dynamic state enabled, and {@code alphaToCoverageEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} in the current command buffer set {@code alphaToCoverageEnable} to {@link VK10#VK_TRUE TRUE}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetAlphaToOneEnableEXT CmdSetAlphaToOneEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetAlphaToOneEnableEXT CmdSetAlphaToOneEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLogicOpEnableEXT CmdSetLogicOpEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLogicOpEnableEXT CmdSetLogicOpEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} for any attachment set that attachment’s value in {@code pColorBlendEnables} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, then {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetExtraPrimitiveOverestimationSizeEXT CmdSetExtraPrimitiveOverestimationSizeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} in the current command buffer set {@code conservativeRasterizationMode} to {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}, then {@link EXTShaderObject#vkCmdSetExtraPrimitiveOverestimationSizeEXT CmdSetExtraPrimitiveOverestimationSizeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetDepthClipEnableEXT CmdSetDepthClipEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetDepthClipEnableEXT CmdSetDepthClipEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetProvokingVertexModeEXT CmdSetProvokingVertexModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, then {@link EXTShaderObject#vkCmdSetProvokingVertexModeEXT CmdSetProvokingVertexModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTLineRasterization#VK_DYNAMIC_STATE_LINE_STIPPLE_EXT DYNAMIC_STATE_LINE_STIPPLE_EXT} dynamic state enabled then {@link EXTLineRasterization#vkCmdSetLineStippleEXT CmdSetLineStippleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} in the current command buffer set {@code stippledLineEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTLineRasterization#vkCmdSetLineStippleEXT CmdSetLineStippleEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetDepthClipNegativeOneToOneEXT CmdSetDepthClipNegativeOneToOneEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetDepthClipNegativeOneToOneEXT CmdSetDepthClipNegativeOneToOneEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetViewportWScalingEnableNV CmdSetViewportWScalingEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetViewportWScalingEnableNV CmdSetViewportWScalingEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} in the current command buffer set {@code coverageToColorEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} in the current command buffer set coverageModulationMode to any value other than {@link NVFramebufferMixedSamples#VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV}, then {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} in the current command buffer set {@code coverageModulationTableEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set rasterizerDiscardEnable to {@link VK10#VK_FALSE FALSE}, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} must have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetRepresentativeFragmentTestEnableNV CmdSetRepresentativeFragmentTestEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetRepresentativeFragmentTestEnableNV CmdSetRepresentativeFragmentTestEnableNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV} dynamic state enabled then {@link EXTShaderObject#vkCmdSetCoverageReductionModeNV CmdSetCoverageReductionModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageReductionModeNV CmdSetCoverageReductionModeNV} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} state enabled and the last call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} set {@code pColorBlendEnables} for any attachment to {@link VK10#VK_TRUE TRUE}, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-noattachments">zero-attachment subpass</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state disabled, then the {@code samples} parameter in the last call to {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> be greater or equal to the {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} state and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} states enabled, then the {@code samples} parameter in the last call to {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic states enabled and the last calls to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} and {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, and the bound graphics pipeline was created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} state enabled, the last call to {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have set the {@code rasterizationStream} to zero</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state disabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} member of the {@link VkPipelineMultisampleStateCreateInfo} structure the bound graphics pipeline has been created with</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} in the bound graphics pipeline is {@link VK10#VK_TRUE TRUE} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} in the bound graphics pipeline is {@link VK10#VK_TRUE TRUE} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, the {@code sampleLocationsEnable} member of a {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} in the bound graphics pipeline is {@link VK10#VK_TRUE TRUE} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, then, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} state enabled and the last call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} set {@code coverageModulationTableEnable} to {@link VK10#VK_TRUE TRUE}, then the {@code coverageModulationTableCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} state enabled and the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} set the {@code coverageToColorEnable} to {@link VK10#VK_TRUE TRUE}, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} {@code coverageToColorLocation}, with a {@code VkFormat} of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}, {@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}, {@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}, {@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}, {@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}, or {@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</li>
     * <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by {@link NVCoverageReductionMode#vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT LINE_RASTERIZATION_MODE_DEFAULT_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and {@link VkPhysicalDeviceLimits}{@code ::strictLines} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> be {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT}</li>
     * <li>If the currently bound pipeline was created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} dynamic state {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If dynamic state was inherited from {@link VkCommandBufferInheritanceViewportScissorInfoNV}, it <b>must</b> be set in the current command buffer prior to this drawing command</li>
     * <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
     * <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
     * <li>If there is no bound graphics pipeline, and at least one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> features is enabled, one of the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stages <b>must</b> have a valid {@code VkShaderEXT} bound, and the other <b>must</b> have no {@code VkShaderEXT} bound</li>
     * <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage, and that {@code VkShaderEXT} was created without the {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} flag, a valid {@code VkShaderEXT} <b>must</b> be bound to the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage</li>
     * <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage, and that {@code VkShaderEXT} was created with the {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} flag, there <b>must</b> be no {@code VkShaderEXT} bound to the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage</li>
     * <li>If there is no bound graphics pipeline, and a valid {@code VkShaderEXT} is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, there <b>must</b> be no {@code VkShaderEXT} bound to either the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage or the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage</li>
     * <li>If any graphics shader is bound which was created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag, then all shaders created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag in the same {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT} call <b>must</b> also be bound</li>
     * <li>If any graphics shader is bound which was created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag, any stages in between stages whose shaders which did not create a shader with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag as part of the same {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT} call <b>must</b> not have any {@code VkShaderEXT} bound</li>
     * <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined push constant ranges</li>
     * <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined arrays of descriptor set layouts</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopDynamicState">attachmentFeedbackLoopDynamicState</a> feature is enabled on the device, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE} {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state includes a fragment shader stage, was created with {@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If the bound graphics pipeline state includes a fragment shader stage, was created with {@link VK10#VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> be 0</li>
     * <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT}, and the format of any color attachment is {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}, the corresponding element of the {@code pColorWriteMasks} parameter of {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> either include all of {@link VK10#VK_COLOR_COMPONENT_R_BIT COLOR_COMPONENT_R_BIT}, {@link VK10#VK_COLOR_COMPONENT_G_BIT COLOR_COMPONENT_G_BIT}, and {@link VK10#VK_COLOR_COMPONENT_B_BIT COLOR_COMPONENT_B_BIT}, or none of them</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
     * </ul>
     * 
     * <ul>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} buffers bound</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY} dynamic state enabled then {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY DYNAMIC_STATE_PRIMITIVE_TOPOLOGY} dynamic state enabled and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-dynamicPrimitiveTopologyUnrestricted">{@code dynamicPrimitiveTopologyUnrestricted}</a> is {@link VK10#VK_FALSE FALSE}, then the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopology} <b>must</b> be of the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-topology-class">topology class</a> as the pipeline {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::topology} state</li>
     * <li>If the bound graphics pipeline was created with both the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} and {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic states enabled, then {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline was created with the {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic state enabled, but not the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of {@link EXTShaderObject#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> not be {@code NULL}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, then {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then all variables with the {@code Input} storage class decorated with {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> contain a location in {@link VkVertexInputAttributeDescription2EXT}{@code ::location}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then the numeric type associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be the same as {@link VkVertexInputAttributeDescription2EXT}{@code ::format}</li>
     * <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, and {@link VkVertexInputAttributeDescription2EXT}{@code ::format} has a 64-bit component, then the scalar width associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be 64-bit</li>
     * <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, and the scalar width associated with a {@code Location} decorated {@code Input} variable in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} is 64-bit, then the corresponding {@link VkVertexInputAttributeDescription2EXT}{@code ::format} <b>must</b> have a 64-bit component</li>
     * <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, and {@link VkVertexInputAttributeDescription2EXT}{@code ::format} has a 64-bit component, then all {@code Input} variables at the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> not use components that are not present in the format</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, then {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetPatchControlPointsEXT CmdSetPatchControlPointsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage, then {@link EXTShaderObject#vkCmdSetPatchControlPointsEXT CmdSetPatchControlPointsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetPrimitiveRestartEnable CmdSetPrimitiveRestartEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, {@link VK13#vkCmdSetPrimitiveRestartEnable CmdSetPrimitiveRestartEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>The bound graphics pipeline <b>must</b> not have been created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
     * <li>There <b>must</b> be no shader object bound to either of the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stages</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code offset} <b>must</b> be a multiple of 4</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code countBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
     * <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
     * <li><code>(countBufferOffset + sizeof(uint32_t))</code> <b>must</b> be less than or equal to the size of {@code countBuffer}</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-drawIndirectCount">{@code drawIndirectCount}</a> is not enabled this function <b>must</b> not be used</li>
     * </ul>
     * 
     * <ul>
     * <li>An index buffer <b>must</b> be bound</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is not enabled, <code>(indexSize × (firstIndex + indexCount) + offset)</code> <b>must</b> be less than or equal to the size of the bound index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via {@code vkCmdBindIndexBuffer}</li>
     * <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof({@link VkDrawIndexedIndirectCommand})</li>
     * <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command is recorded.
     * @param buffer            the buffer containing draw parameters.
     * @param offset            the byte offset into {@code buffer} where parameters begin.
     * @param countBuffer       the buffer containing the draw count.
     * @param countBufferOffset the byte offset into {@code countBuffer} where the draw count begins.
     * @param maxDrawCount      specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}.
     * @param stride            the byte stride between successive sets of draw parameters.
     */
    public static void vkCmdDrawIndexedIndirectCount(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

    // --- [ vkCreateRenderPass2 ] ---

    /** Unsafe version of: {@link #vkCreateRenderPass2 CreateRenderPass2} */
    public static int nvkCreateRenderPass2(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderPassCreateInfo2.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pRenderPass, __functionAddress);
    }

    /**
     * Create a new render pass object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a render pass, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateRenderPass2(
     *     VkDevice                                    device,
     *     const VkRenderPassCreateInfo2*              pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkRenderPass*                               pRenderPass);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkCreateRenderPass2KHR(
     *     VkDevice                                    device,
     *     const VkRenderPassCreateInfo2*              pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkRenderPass*                               pRenderPass);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally identical to {@link VK10#vkCreateRenderPass CreateRenderPass}, but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkRenderPassCreateInfo2} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pRenderPass} <b>must</b> be a valid pointer to a {@code VkRenderPass} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkRenderPassCreateInfo2}</p>
     *
     * @param device      the logical device that creates the render pass.
     * @param pCreateInfo a pointer to a {@link VkRenderPassCreateInfo2} structure describing the parameters of the render pass.
     * @param pAllocator  controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pRenderPass a pointer to a {@code VkRenderPass} handle in which the resulting render pass object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
        if (CHECKS) {
            check(pRenderPass, 1);
        }
        return nvkCreateRenderPass2(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pRenderPass));
    }

    // --- [ vkCmdBeginRenderPass2 ] ---

    /** Unsafe version of: {@link #vkCmdBeginRenderPass2 CmdBeginRenderPass2} */
    public static void nvkCmdBeginRenderPass2(VkCommandBuffer commandBuffer, long pRenderPassBegin, long pSubpassBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pRenderPassBegin, pSubpassBeginInfo, __functionAddress);
    }

    /**
     * Begin a new render pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively to begin a render pass, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginRenderPass2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderPassBeginInfo*                pRenderPassBegin,
     *     const VkSubpassBeginInfo*                   pSubpassBeginInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdBeginRenderPass2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkRenderPassBeginInfo*                pRenderPassBegin,
     *     const VkSubpassBeginInfo*                   pSubpassBeginInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>Both the {@code framebuffer} and {@code renderPass} members of {@code pRenderPassBegin} <b>must</b> have been created on the same {@code VkDevice} that {@code commandBuffer} was allocated on</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, or {@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link #VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link #VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code stencilInitialLayout} or {@code stencilFinalLayout} member of the {@link VkAttachmentDescriptionStencilLayout} structures or the {@code stencilLayout} member of the {@link VkAttachmentReferenceStencilLayout} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link #VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link #VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</li>
     * <li>If the {@code initialLayout} member of any of the {@link VkAttachmentDescription} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
     * <li>The {@code srcStageMask} members of any element of the {@code pDependencies} member of {@link VkRenderPassCreateInfo} used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the {@link VkCommandPoolCreateInfo} used to create the command pool which {@code commandBuffer} was allocated from</li>
     * <li>The {@code dstStageMask} members of any element of the {@code pDependencies} member of {@link VkRenderPassCreateInfo} used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the {@link VkCommandPoolCreateInfo} used to create the command pool which {@code commandBuffer} was allocated from</li>
     * <li>For any attachment in {@code framebuffer} that is used by {@code renderPass} and is bound to memory locations that are also bound to another attachment used by {@code renderPass}, and if at least one of those uses causes either attachment to be written to, both attachments <b>must</b> have had the {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} set</li>
     * <li>If any attachments specified in {@code framebuffer} are used by {@code renderPass} and are bound to overlapping memory locations, there <b>must</b> be only one that is used as a color attachment, depth/stencil, or resolve attachment in any subpass</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including either the {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} and either the {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} usage bits</li>
     * <li>If any of the {@code initialLayout} or {@code finalLayout} member of the {@link VkAttachmentDescription} structures or the {@code layout} member of the {@link VkAttachmentReference} structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} usage bit</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pRenderPassBegin} <b>must</b> be a valid pointer to a valid {@link VkRenderPassBeginInfo} structure</li>
     * <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassBeginInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics</td><td>Action State Synchronization</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderPassBeginInfo}, {@link VkSubpassBeginInfo}</p>
     *
     * @param commandBuffer     the command buffer in which to record the command.
     * @param pRenderPassBegin  a pointer to a {@link VkRenderPassBeginInfo} structure specifying the render pass to begin an instance of, and the framebuffer the instance uses.
     * @param pSubpassBeginInfo a pointer to a {@link VkSubpassBeginInfo} structure containing information about the subpass which is about to begin rendering.
     */
    public static void vkCmdBeginRenderPass2(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo) {
        nvkCmdBeginRenderPass2(commandBuffer, pRenderPassBegin.address(), pSubpassBeginInfo.address());
    }

    // --- [ vkCmdNextSubpass2 ] ---

    /** Unsafe version of: {@link #vkCmdNextSubpass2 CmdNextSubpass2} */
    public static void nvkCmdNextSubpass2(VkCommandBuffer commandBuffer, long pSubpassBeginInfo, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pSubpassBeginInfo, pSubpassEndInfo, __functionAddress);
    }

    /**
     * Transition to the next subpass of a render pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:</p>
     * 
     * <pre><code>
     * void vkCmdNextSubpass2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSubpassBeginInfo*                   pSubpassBeginInfo,
     *     const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdNextSubpass2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSubpassBeginInfo*                   pSubpassBeginInfo,
     *     const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdNextSubpass2} is semantically identical to {@link VK10#vkCmdNextSubpass CmdNextSubpass}, except that it is extensible, and that {@code contents} is provided as part of an extensible structure instead of as a flat parameter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
     * <li>This command <b>must</b> not be recorded when transform feedback is active</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassBeginInfo} structure</li>
     * <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassEndInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action State Synchronization</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSubpassBeginInfo}, {@link VkSubpassEndInfo}</p>
     *
     * @param commandBuffer     the command buffer in which to record the command.
     * @param pSubpassBeginInfo a pointer to a {@link VkSubpassBeginInfo} structure containing information about the subpass which is about to begin rendering.
     * @param pSubpassEndInfo   a pointer to a {@link VkSubpassEndInfo} structure containing information about how the previous subpass will be ended.
     */
    public static void vkCmdNextSubpass2(VkCommandBuffer commandBuffer, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdNextSubpass2(commandBuffer, pSubpassBeginInfo.address(), pSubpassEndInfo.address());
    }

    // --- [ vkCmdEndRenderPass2 ] ---

    /** Unsafe version of: {@link #vkCmdEndRenderPass2 CmdEndRenderPass2} */
    public static void nvkCmdEndRenderPass2(VkCommandBuffer commandBuffer, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pSubpassEndInfo, __functionAddress);
    }

    /**
     * End the current render pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a command to end a render pass instance after recording the commands for the last subpass, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndRenderPass2(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkCmdEndRenderPass2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdEndRenderPass2} is semantically identical to {@link VK10#vkCmdEndRenderPass CmdEndRenderPass}, except that it is extensible.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
     * <li>This command <b>must</b> not be recorded when transform feedback is active</li>
     * <li>The current render pass instance <b>must</b> not have been begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}</li>
     * <li>If {@code vkCmdBeginQuery}* was called within a subpass of the render pass, the corresponding {@code vkCmdEndQuery}* <b>must</b> have been called subsequently within the same subpass</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid {@link VkSubpassEndInfo} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action State Synchronization</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSubpassEndInfo}</p>
     *
     * @param commandBuffer   the command buffer in which to end the current render pass instance.
     * @param pSubpassEndInfo a pointer to a {@link VkSubpassEndInfo} structure containing information about how the last subpass will be ended.
     */
    public static void vkCmdEndRenderPass2(VkCommandBuffer commandBuffer, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdEndRenderPass2(commandBuffer, pSubpassEndInfo.address());
    }

    // --- [ vkResetQueryPool ] ---

    /**
     * Reset queries in a query pool.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To reset a range of queries in a query pool on the host, call:</p>
     * 
     * <pre><code>
     * void vkResetQueryPool(
     *     VkDevice                                    device,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    firstQuery,
     *     uint32_t                                    queryCount);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * void vkResetQueryPoolEXT(
     *     VkDevice                                    device,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    firstQuery,
     *     uint32_t                                    queryCount);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable.</p>
     * 
     * <p>If {@code queryPool} is {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR} this command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable for each pass.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-hostQueryReset">{@code hostQueryReset}</a> feature <b>must</b> be enabled</li>
     * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * <li>Submitted commands that refer to the range specified by {@code firstQuery} and {@code queryCount} in {@code queryPool} <b>must</b> have completed execution</li>
     * <li>The range of queries specified by {@code firstQuery} and {@code queryCount} in {@code queryPool} <b>must</b> not be in use by calls to {@link VK10#vkGetQueryPoolResults GetQueryPoolResults} or {@code vkResetQueryPool} in other threads</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device     the logical device that owns the query pool.
     * @param queryPool  the handle of the query pool managing the queries being reset.
     * @param firstQuery the initial query index to reset.
     * @param queryCount the number of queries to reset.
     */
    public static void vkResetQueryPool(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount) {
        long __functionAddress = device.getCapabilities().vkResetQueryPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), queryPool, firstQuery, queryCount, __functionAddress);
    }

    // --- [ vkGetSemaphoreCounterValue ] ---

    /** Unsafe version of: {@link #vkGetSemaphoreCounterValue GetSemaphoreCounterValue} */
    public static int nvkGetSemaphoreCounterValue(VkDevice device, long semaphore, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValue;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

    /**
     * Query the current state of a timeline semaphore.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the current counter value of a semaphore created with a {@code VkSemaphoreType} of {@link #VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} from the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetSemaphoreCounterValue(
     *     VkDevice                                    device,
     *     VkSemaphore                                 semaphore,
     *     uint64_t*                                   pValue);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkGetSemaphoreCounterValueKHR(
     *     VkDevice                                    device,
     *     VkSemaphore                                 semaphore,
     *     uint64_t*                                   pValue);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-submission">queue submission</a> command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreType} of {@link #VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
     * <li>{@code pValue} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>{@code semaphore} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device    the logical device that owns the semaphore.
     * @param semaphore the handle of the semaphore to query.
     * @param pValue    a pointer to a 64-bit integer value in which the current counter value of the semaphore is returned.
     */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValue(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") LongBuffer pValue) {
        if (CHECKS) {
            check(pValue, 1);
        }
        return nvkGetSemaphoreCounterValue(device, semaphore, memAddress(pValue));
    }

    // --- [ vkWaitSemaphores ] ---

    /** Unsafe version of: {@link #vkWaitSemaphores WaitSemaphores} */
    public static int nvkWaitSemaphores(VkDevice device, long pWaitInfo, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitSemaphores;
        if (CHECKS) {
            check(__functionAddress);
            VkSemaphoreWaitInfo.validate(pWaitInfo);
        }
        return callPPJI(device.address(), pWaitInfo, timeout, __functionAddress);
    }

    /**
     * Wait for timeline semaphores on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To wait for a set of semaphores created with a {@code VkSemaphoreType} of {@link #VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} to reach particular counter values on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkWaitSemaphores(
     *     VkDevice                                    device,
     *     const VkSemaphoreWaitInfo*                  pWaitInfo,
     *     uint64_t                                    timeout);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkWaitSemaphoresKHR(
     *     VkDevice                                    device,
     *     const VkSemaphoreWaitInfo*                  pWaitInfo,
     *     uint64_t                                    timeout);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the condition is satisfied when {@code vkWaitSemaphores} is called, then {@code vkWaitSemaphores} returns immediately. If the condition is not satisfied at the time {@code vkWaitSemaphores} is called, then {@code vkWaitSemaphores} will block and wait until the condition is satisfied or the {@code timeout} has expired, whichever is sooner.</p>
     * 
     * <p>If {@code timeout} is zero, then {@code vkWaitSemaphores} does not wait, but simply returns information about the current state of the semaphores. {@link VK10#VK_TIMEOUT TIMEOUT} will be returned in this case if the condition is not satisfied, even though no actual wait was performed.</p>
     * 
     * <p>If the condition is satisfied before the {@code timeout} has expired, {@code vkWaitSemaphores} returns {@link VK10#VK_SUCCESS SUCCESS}. Otherwise, {@code vkWaitSemaphores} returns {@link VK10#VK_TIMEOUT TIMEOUT} after the {@code timeout} has expired.</p>
     * 
     * <p>If device loss occurs (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-lost-device">Lost Device</a>) before the timeout has expired, {@code vkWaitSemaphores} <b>must</b> return in finite time with either {@link VK10#VK_SUCCESS SUCCESS} or {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pWaitInfo} <b>must</b> be a valid pointer to a valid {@link VkSemaphoreWaitInfo} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
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
     * <p>{@link VkSemaphoreWaitInfo}</p>
     *
     * @param device    the logical device that owns the semaphores.
     * @param pWaitInfo a pointer to a {@link VkSemaphoreWaitInfo} structure containing information about the wait condition.
     * @param timeout   the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.
     */
    @NativeType("VkResult")
    public static int vkWaitSemaphores(VkDevice device, @NativeType("VkSemaphoreWaitInfo const *") VkSemaphoreWaitInfo pWaitInfo, @NativeType("uint64_t") long timeout) {
        return nvkWaitSemaphores(device, pWaitInfo.address(), timeout);
    }

    // --- [ vkSignalSemaphore ] ---

    /** Unsafe version of: {@link #vkSignalSemaphore SignalSemaphore} */
    public static int nvkSignalSemaphore(VkDevice device, long pSignalInfo) {
        long __functionAddress = device.getCapabilities().vkSignalSemaphore;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pSignalInfo, __functionAddress);
    }

    /**
     * Signal a timeline semaphore on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To signal a semaphore created with a {@code VkSemaphoreType} of {@link #VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} with a particular counter value, on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkSignalSemaphore(
     *     VkDevice                                    device,
     *     const VkSemaphoreSignalInfo*                pSignalInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkResult vkSignalSemaphoreKHR(
     *     VkDevice                                    device,
     *     const VkSemaphoreSignalInfo*                pSignalInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@code vkSignalSemaphore} is executed on the host, it defines and immediately executes a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling"><em>semaphore signal operation</em></a> which sets the timeline semaphore to the given value.</p>
     * 
     * <p>The first synchronization scope is defined by the host execution model, but includes execution of {@code vkSignalSemaphore} on the host and anything that happened-before it.</p>
     * 
     * <p>The second synchronization scope is empty.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pSignalInfo} <b>must</b> be a valid pointer to a valid {@link VkSemaphoreSignalInfo} structure</li>
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
     * <p>{@link VkSemaphoreSignalInfo}</p>
     *
     * @param device      the logical device that owns the semaphore.
     * @param pSignalInfo a pointer to a {@link VkSemaphoreSignalInfo} structure containing information about the signal operation.
     */
    @NativeType("VkResult")
    public static int vkSignalSemaphore(VkDevice device, @NativeType("VkSemaphoreSignalInfo const *") VkSemaphoreSignalInfo pSignalInfo) {
        return nvkSignalSemaphore(device, pSignalInfo.address());
    }

    // --- [ vkGetBufferDeviceAddress ] ---

    /** Unsafe version of: {@link #vkGetBufferDeviceAddress GetBufferDeviceAddress} */
    public static long nvkGetBufferDeviceAddress(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferDeviceAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Query an address of a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a 64-bit buffer device address value through which buffer memory <b>can</b> be accessed in a shader, call:</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetBufferDeviceAddress(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfo*            pInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetBufferDeviceAddressKHR(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfo*            pInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetBufferDeviceAddressEXT(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfo*            pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an address of the start of {@code pInfo→buffer}. The address range starting at this value and whose size is the size of the buffer <b>can</b> be used in a shader to access the memory bound to that buffer, using the {@code SPV_KHR_physical_storage_buffer} extension or the equivalent {@code SPV_EXT_physical_storage_buffer} extension and the {@code PhysicalStorageBuffer} storage class. For example, this value <b>can</b> be stored in a uniform buffer, and the shader <b>can</b> read the value from the uniform buffer and use it to do a dependent read/write to this buffer. A value of zero is reserved as a “{@code null}” pointer and <b>must</b> not be returned as a valid buffer device address. All loads, stores, and atomics in a shader through {@code PhysicalStorageBuffer} pointers <b>must</b> access addresses in the address range of some buffer.</p>
     * 
     * <p>If the buffer was created with a non-zero value of {@link VkBufferOpaqueCaptureAddressCreateInfo}{@code ::opaqueCaptureAddress} or {@link VkBufferDeviceAddressCreateInfoEXT}{@code ::deviceAddress}, the return value will be the same address that was returned at capture time.</p>
     * 
     * <p>The returned address <b>must</b> satisfy the alignment requirement specified by {@link VkMemoryRequirements}{@code ::alignment} for the buffer in {@link VkBufferDeviceAddressInfo}{@code ::buffer}.</p>
     * 
     * <p>If multiple {@code VkBuffer} objects are bound to overlapping ranges of {@code VkDeviceMemory}, implementations <b>may</b> return address ranges which overlap. In this case, it is ambiguous which {@code VkBuffer} is associated with any given device address. For purposes of valid usage, if multiple {@code VkBuffer} objects <b>can</b> be attributed to a device address, a {@code VkBuffer} is selected such that valid usage passes, if it exists.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressEXT">{@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}{@code ::bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDeviceEXT">{@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}{@code ::bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferDeviceAddressInfo} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferDeviceAddressInfo}</p>
     *
     * @param device the logical device that the buffer was created on.
     * @param pInfo  a pointer to a {@link VkBufferDeviceAddressInfo} structure specifying the buffer to retrieve an address for.
     */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddress(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferDeviceAddress(device, pInfo.address());
    }

    // --- [ vkGetBufferOpaqueCaptureAddress ] ---

    /** Unsafe version of: {@link #vkGetBufferOpaqueCaptureAddress GetBufferOpaqueCaptureAddress} */
    public static long nvkGetBufferOpaqueCaptureAddress(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Query an opaque capture address of a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a 64-bit buffer opaque capture address, call:</p>
     * 
     * <pre><code>
     * uint64_t vkGetBufferOpaqueCaptureAddress(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfo*            pInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * uint64_t vkGetBufferOpaqueCaptureAddressKHR(
     *     VkDevice                                    device,
     *     const VkBufferDeviceAddressInfo*            pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an opaque capture address of the start of {@code pInfo→buffer}.</p>
     * 
     * <p>If the buffer was created with a non-zero value of {@link VkBufferOpaqueCaptureAddressCreateInfo}{@code ::opaqueCaptureAddress} the return value <b>must</b> be the same address.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkBufferDeviceAddressInfo} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBufferDeviceAddressInfo}</p>
     *
     * @param device the logical device that the buffer was created on.
     * @param pInfo  a pointer to a {@link VkBufferDeviceAddressInfo} structure specifying the buffer to retrieve an address for.
     */
    @NativeType("uint64_t")
    public static long vkGetBufferOpaqueCaptureAddress(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferOpaqueCaptureAddress(device, pInfo.address());
    }

    // --- [ vkGetDeviceMemoryOpaqueCaptureAddress ] ---

    /** Unsafe version of: {@link #vkGetDeviceMemoryOpaqueCaptureAddress GetDeviceMemoryOpaqueCaptureAddress} */
    public static long nvkGetDeviceMemoryOpaqueCaptureAddress(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryOpaqueCaptureAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Query an opaque capture address of a memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a 64-bit opaque capture address value from a memory object, call:</p>
     * 
     * <pre><code>
     * uint64_t vkGetDeviceMemoryOpaqueCaptureAddress(
     *     VkDevice                                    device,
     *     const VkDeviceMemoryOpaqueCaptureAddressInfo* pInfo);</code></pre>
     * 
     * <p>or the equivalent command</p>
     * 
     * <pre><code>
     * uint64_t vkGetDeviceMemoryOpaqueCaptureAddressKHR(
     *     VkDevice                                    device,
     *     const VkDeviceMemoryOpaqueCaptureAddressInfo* pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The 64-bit return value is an opaque address representing the start of {@code pInfo→memory}.</p>
     * 
     * <p>If the memory object was allocated with a non-zero value of {@link VkMemoryOpaqueCaptureAddressAllocateInfo}{@code ::opaqueCaptureAddress}, the return value <b>must</b> be the same address.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The expected usage for these opaque addresses is only for trace capture/replay tools to store these addresses in a trace and subsequently specify them during replay.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceMemoryOpaqueCaptureAddressInfo} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceMemoryOpaqueCaptureAddressInfo}</p>
     *
     * @param device the logical device that the memory object was allocated on.
     * @param pInfo  a pointer to a {@link VkDeviceMemoryOpaqueCaptureAddressInfo} structure specifying the memory object to retrieve an address for.
     */
    @NativeType("uint64_t")
    public static long vkGetDeviceMemoryOpaqueCaptureAddress(VkDevice device, @NativeType("VkDeviceMemoryOpaqueCaptureAddressInfo const *") VkDeviceMemoryOpaqueCaptureAddressInfo pInfo) {
        return nvkGetDeviceMemoryOpaqueCaptureAddress(device, pInfo.address());
    }

    /** Array version of: {@link #vkCreateRenderPass2 CreateRenderPass2} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
            check(pRenderPass, 1);
            VkRenderPassCreateInfo2.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass, __functionAddress);
    }

    /** Array version of: {@link #vkGetSemaphoreCounterValue GetSemaphoreCounterValue} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValue(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") long[] pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValue;
        if (CHECKS) {
            check(__functionAddress);
            check(pValue, 1);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

}