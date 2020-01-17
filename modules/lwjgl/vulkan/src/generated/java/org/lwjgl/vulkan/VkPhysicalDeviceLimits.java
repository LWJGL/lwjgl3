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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure reporting implementation-dependent physical device limits.
 * 
 * <h5>Description</h5>
 * 
 * <dl>
 * <dt>1</dt>
 * <dd>For all bitmasks of {@code VkSampleCountFlagBits}, the sample count limits defined above represent the minimum supported sample counts for each image type. Individual images <b>may</b> support additional sample counts, which are queried using {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-supported-sample-counts">Supported Sample Counts</a>.</dd>
 * </dl>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code maxImageDimension1D} &ndash; the maximum dimension ({@code width}) supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}.</li>
 * <li>{@code maxImageDimension2D} &ndash; the maximum dimension ({@code width} or {@code height}) supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and without {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} set in {@code flags}.</li>
 * <li>{@code maxImageDimension3D} &ndash; the maximum dimension ({@code width}, {@code height}, or {@code depth}) supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}.</li>
 * <li>{@code maxImageDimensionCube} &ndash; the maximum dimension ({@code width} or {@code height}) supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and with {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} set in {@code flags}.</li>
 * <li>{@code maxImageArrayLayers} &ndash; the maximum number of layers ({@code arrayLayers}) for an image.</li>
 * <li>{@code maxTexelBufferElements} &ndash; the maximum number of addressable texels for a buffer view created on a buffer which was created with the {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} or {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT} set in the {@code usage} member of the {@link VkBufferCreateInfo} structure.</li>
 * <li>{@code maxUniformBufferRange} &ndash; the maximum value that <b>can</b> be specified in the {@code range} member of any {@link VkDescriptorBufferInfo} structures passed to a call to {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} for descriptors of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}.</li>
 * <li>{@code maxStorageBufferRange} &ndash; the maximum value that <b>can</b> be specified in the {@code range} member of any {@link VkDescriptorBufferInfo} structures passed to a call to {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} for descriptors of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}.</li>
 * <li>{@code maxPushConstantsSize} &ndash; the maximum size, in bytes, of the pool of push constant memory. For each of the push constant ranges indicated by the {@code pPushConstantRanges} member of the {@link VkPipelineLayoutCreateInfo} structure, <code>(offset + size)</code> <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxMemoryAllocationCount} &ndash; the maximum number of device memory allocations, as created by {@link VK10#vkAllocateMemory AllocateMemory}, which <b>can</b> simultaneously exist.</li>
 * <li>{@code maxSamplerAllocationCount} &ndash; the maximum number of sampler objects, as created by {@link VK10#vkCreateSampler CreateSampler}, which <b>can</b> simultaneously exist on a device.</li>
 * <li>{@code bufferImageGranularity} &ndash; the granularity, in bytes, at which buffer or linear image resources, and optimal image resources <b>can</b> be bound to adjacent offsets in the same {@code VkDeviceMemory} object without aliasing. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-bufferimagegranularity">Buffer-Image Granularity</a> for more details.</li>
 * <li>{@code sparseAddressSpaceSize} &ndash; the total amount of address space available, in bytes, for sparse memory resources. This is an upper bound on the sum of the size of all sparse resources, regardless of whether any memory is bound to them.</li>
 * <li>{@code maxBoundDescriptorSets} &ndash; the maximum number of descriptor sets that <b>can</b> be simultaneously used by a pipeline. All {@code DescriptorSet} decorations in shader modules <b>must</b> have a value less than {@code maxBoundDescriptorSets}. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-sets">Descriptor Sets</a>.</li>
 * <li>{@code maxPerStageDescriptorSamplers} &ndash; the maximum number of samplers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-sampler">Sampler</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>.</li>
 * <li>{@code maxPerStageDescriptorUniformBuffers} &ndash; the maximum number of uniform buffers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformbuffer">Uniform Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>.</li>
 * <li>{@code maxPerStageDescriptorStorageBuffers} &ndash; the maximum number of storage buffers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebuffer">Storage Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>.</li>
 * <li>{@code maxPerStageDescriptorSampledImages} &ndash; the maximum number of sampled images that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-sampledimage">Sampled Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformtexelbuffer">Uniform Texel Buffer</a>.</li>
 * <li>{@code maxPerStageDescriptorStorageImages} &ndash; the maximum number of storage images that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storageimage">Storage Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">Storage Texel Buffer</a>.</li>
 * <li>{@code maxPerStageDescriptorInputAttachments} &ndash; the maximum number of input attachments that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. These are only supported for the fragment stage. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-inputattachment">Input Attachment</a>.</li>
 * <li>{@code maxPerStageResources} &ndash; the maximum number of resources that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. For the fragment shader stage the framebuffer color attachments also count against this limit.</li>
 * <li>{@code maxDescriptorSetSamplers} &ndash; the maximum number of samplers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-sampler">Sampler</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>.</li>
 * <li>{@code maxDescriptorSetUniformBuffers} &ndash; the maximum number of uniform buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformbuffer">Uniform Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>.</li>
 * <li>{@code maxDescriptorSetUniformBuffersDynamic} &ndash; the maximum number of dynamic uniform buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>.</li>
 * <li>{@code maxDescriptorSetStorageBuffers} &ndash; the maximum number of storage buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebuffer">Storage Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>.</li>
 * <li>{@code maxDescriptorSetStorageBuffersDynamic} &ndash; the maximum number of dynamic storage buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>.</li>
 * <li>{@code maxDescriptorSetSampledImages} &ndash; the maximum number of sampled images that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-sampledimage">Sampled Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformtexelbuffer">Uniform Texel Buffer</a>.</li>
 * <li>{@code maxDescriptorSetStorageImages} &ndash; the maximum number of storage images that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storageimage">Storage Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">Storage Texel Buffer</a>.</li>
 * <li>{@code maxDescriptorSetInputAttachments} &ndash; the maximum number of input attachments that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-inputattachment">Input Attachment</a>.</li>
 * <li>{@code maxVertexInputAttributes} &ndash; the maximum number of vertex input attributes that <b>can</b> be specified for a graphics pipeline. These are described in the array of {@link VkVertexInputAttributeDescription} structures that are provided at graphics pipeline creation time via the {@code pVertexAttributeDescriptions} member of the {@link VkPipelineVertexInputStateCreateInfo} structure. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fxvertex-attrib">Vertex Attributes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>.</li>
 * <li>{@code maxVertexInputBindings} &ndash; the maximum number of vertex buffers that <b>can</b> be specified for providing vertex attributes to a graphics pipeline. These are described in the array of {@link VkVertexInputBindingDescription} structures that are provided at graphics pipeline creation time via the {@code pVertexBindingDescriptions} member of the {@link VkPipelineVertexInputStateCreateInfo} structure. The {@code binding} member of {@link VkVertexInputBindingDescription} <b>must</b> be less than this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>.</li>
 * <li>{@code maxVertexInputAttributeOffset} &ndash; the maximum vertex input attribute offset that <b>can</b> be added to the vertex input binding stride. The {@code offset} member of the {@link VkVertexInputAttributeDescription} structure <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>.</li>
 * <li>{@code maxVertexInputBindingStride} &ndash; the maximum vertex input binding stride that <b>can</b> be specified in a vertex input binding. The {@code stride} member of the {@link VkVertexInputBindingDescription} structure <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>.</li>
 * <li>{@code maxVertexOutputComponents} &ndash; the maximum number of components of output variables which <b>can</b> be output by a vertex shader. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#shaders-vertex">Vertex Shaders</a>.</li>
 * <li>{@code maxTessellationGenerationLevel} &ndash; the maximum tessellation generation level supported by the fixed-function tessellation primitive generator. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#tessellation">Tessellation</a>.</li>
 * <li>{@code maxTessellationPatchSize} &ndash; the maximum patch size, in vertices, of patches that <b>can</b> be processed by the tessellation control shader and tessellation primitive generator. The {@code patchControlPoints} member of the {@link VkPipelineTessellationStateCreateInfo} structure specified at pipeline creation time and the value provided in the {@code OutputVertices} execution mode of shader modules <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#tessellation">Tessellation</a>.</li>
 * <li>{@code maxTessellationControlPerVertexInputComponents} &ndash; the maximum number of components of input variables which <b>can</b> be provided as per-vertex inputs to the tessellation control shader stage.</li>
 * <li>{@code maxTessellationControlPerVertexOutputComponents} &ndash; the maximum number of components of per-vertex output variables which <b>can</b> be output from the tessellation control shader stage.</li>
 * <li>{@code maxTessellationControlPerPatchOutputComponents} &ndash; the maximum number of components of per-patch output variables which <b>can</b> be output from the tessellation control shader stage.</li>
 * <li>{@code maxTessellationControlTotalOutputComponents} &ndash; the maximum total number of components of per-vertex and per-patch output variables which <b>can</b> be output from the tessellation control shader stage.</li>
 * <li>{@code maxTessellationEvaluationInputComponents} &ndash; the maximum number of components of input variables which <b>can</b> be provided as per-vertex inputs to the tessellation evaluation shader stage.</li>
 * <li>{@code maxTessellationEvaluationOutputComponents} &ndash; the maximum number of components of per-vertex output variables which <b>can</b> be output from the tessellation evaluation shader stage.</li>
 * <li>{@code maxGeometryShaderInvocations} &ndash; the maximum invocation count supported for instanced geometry shaders. The value provided in the {@code Invocations} execution mode of shader modules <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#geometry">Geometry Shading</a>.</li>
 * <li>{@code maxGeometryInputComponents} &ndash; the maximum number of components of input variables which <b>can</b> be provided as inputs to the geometry shader stage.</li>
 * <li>{@code maxGeometryOutputComponents} &ndash; the maximum number of components of output variables which <b>can</b> be output from the geometry shader stage.</li>
 * <li>{@code maxGeometryOutputVertices} &ndash; the maximum number of vertices which <b>can</b> be emitted by any geometry shader.</li>
 * <li>{@code maxGeometryTotalOutputComponents} &ndash; the maximum total number of components of output, across all emitted vertices, which <b>can</b> be output from the geometry shader stage.</li>
 * <li>{@code maxFragmentInputComponents} &ndash; the maximum number of components of input variables which <b>can</b> be provided as inputs to the fragment shader stage.</li>
 * <li>{@code maxFragmentOutputAttachments} &ndash; the maximum number of output attachments which <b>can</b> be written to by the fragment shader stage.</li>
 * <li>{@code maxFragmentDualSrcAttachments} &ndash; the maximum number of output attachments which <b>can</b> be written to by the fragment shader stage when blending is enabled and one of the dual source blend modes is in use. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#framebuffer-dsb">Dual-Source Blending</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-dualSrcBlend">dualSrcBlend</a>.</li>
 * <li>{@code maxFragmentCombinedOutputResources} &ndash; the total number of storage buffers, storage images, and output buffers which <b>can</b> be used in the fragment shader stage.</li>
 * <li>{@code maxComputeSharedMemorySize} &ndash; the maximum total storage size, in bytes, available for variables declared with the {@code Workgroup} storage class in shader modules (or with the {@code shared} storage qualifier in GLSL) in the compute shader stage. The amount of storage consumed by the variables declared with the {@code Workgroup} storage class is implementation-dependent. However, the amount of storage consumed may not exceed the largest block size that would be obtained if all active variables declared with {@code Workgroup} storage class were assigned offsets in an arbitrary order by successively taking the smallest valid offset according to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#interfaces-resources-standard-layout">Standard Storage Buffer Layout</a> rules. (This is equivalent to using the GLSL std430 layout rules.)</li>
 * <li>{@code maxComputeWorkGroupCount[3]} &ndash; the maximum number of local workgroups that <b>can</b> be dispatched by a single dispatch command. These three values represent the maximum number of local workgroups for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the dispatch commands <b>must</b> be less than or equal to the corresponding limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#dispatch">Dispatching Commands</a>.</li>
 * <li>{@code maxComputeWorkGroupInvocations} &ndash; the maximum total number of compute shader invocations in a single local workgroup. The product of the X, Y, and Z sizes, as specified by the {@code LocalSize} execution mode in shader modules or by the object decorated by the {@code WorkgroupSize} decoration, <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxComputeWorkGroupSize[3]} &ndash; the maximum size of a local compute workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit.</li>
 * <li>{@code subPixelPrecisionBits} &ndash; the number of bits of subpixel precision in framebuffer coordinates <code>x<sub>f</sub></code> and <code>y<sub>f</sub></code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast">Rasterization</a>.</li>
 * <li>{@code subTexelPrecisionBits} &ndash; the number of bits of precision in the division along an axis of an image used for minification and magnification filters. <code>2<sup>subTexelPrecisionBits</sup></code> is the actual number of divisions along each axis of the image represented. Sub-texel values calculated during image sampling will snap to these locations when generating the filtered results.</li>
 * <li>{@code mipmapPrecisionBits} &ndash; the number of bits of division that the LOD calculation for mipmap fetching get snapped to when determining the contribution from each mip level to the mip filtered results. <code>2<sup>mipmapPrecisionBits</sup></code> is the actual number of divisions.</li>
 * <li>{@code maxDrawIndexedIndexValue} &ndash; the maximum index value that <b>can</b> be used for indexed draw calls when using 32-bit indices. This excludes the primitive restart index value of 0xFFFFFFFF. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fullDrawIndexUint32">fullDrawIndexUint32</a>.</li>
 * <li>{@code maxDrawIndirectCount} &ndash; the maximum draw count that is supported for indirect draw calls. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiDrawIndirect">multiDrawIndirect</a>.</li>
 * <li>{@code maxSamplerLodBias} &ndash; the maximum absolute sampler LOD bias. The sum of the {@code mipLodBias} member of the {@link VkSamplerCreateInfo} structure and the {@code Bias} operand of image sampling operations in shader modules (or 0 if no {@code Bias} operand is provided to an image sampling operation) are clamped to the range <code>[-maxSamplerLodBias,+maxSamplerLodBias]</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-mipLodBias">samplers-mipLodBias</a>.</li>
 * <li>{@code maxSamplerAnisotropy} &ndash; the maximum degree of sampler anisotropy. The maximum degree of anisotropic filtering used for an image sampling operation is the minimum of the {@code maxAnisotropy} member of the {@link VkSamplerCreateInfo} structure and this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-maxAnisotropy">samplers-maxAnisotropy</a>.</li>
 * <li>{@code maxViewports} &ndash; the maximum number of active viewports. The {@code viewportCount} member of the {@link VkPipelineViewportStateCreateInfo} structure that is provided at pipeline creation <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxViewportDimensions[2]} &ndash; are the maximum viewport dimensions in the X (width) and Y (height) dimensions, respectively. The maximum viewport dimensions <b>must</b> be greater than or equal to the largest image which <b>can</b> be created and used as a framebuffer attachment. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>.</li>
 * <li>{@code viewportBoundsRange[2]} &ndash; the <code>[minimum, maximum]</code> range that the corners of a viewport <b>must</b> be contained in. This range <b>must</b> be at least <code>[-2 × size, 2 × size - 1]</code>, where <code>size = max(maxViewportDimensions[0], maxViewportDimensions[1])</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The intent of the {@code viewportBoundsRange} limit is to allow a maximum sized viewport to be arbitrarily shifted relative to the output target as long as at least some portion intersects. This would give a bounds limit of <code>[-size + 1, 2 × size - 1]</code> which would allow all possible non-empty-set intersections of the output target and the viewport. Since these numbers are typically powers of two, picking the signed number range using the smallest possible number of bits ends up with the specified range.</p>
 * </div></li>
 * <li>{@code viewportSubPixelBits} &ndash; the number of bits of subpixel precision for viewport bounds. The subpixel precision that floating-point viewport bounds are interpreted at is given by this limit.</li>
 * <li>{@code minMemoryMapAlignment} &ndash; the minimum required: alignment, in bytes, of host visible memory allocations within the host address space. When mapping a memory allocation with {@link VK10#vkMapMemory MapMemory}, subtracting {@code offset} bytes from the returned pointer will always produce an integer multiple of this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-device-hostaccess">Host Access to Device Memory Objects</a>.</li>
 * <li>{@code minTexelBufferOffsetAlignment} &ndash; the minimum required: alignment, in bytes, for the {@code offset} member of the {@link VkBufferViewCreateInfo} structure for texel buffers. If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-texelBufferAlignment">texelBufferAlignment</a> is enabled, this limit is equivalent to the maximum of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-uniformTexelBufferOffsetAlignmentBytes">{@code uniformTexelBufferOffsetAlignmentBytes}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-storageTexelBufferOffsetAlignmentBytes">{@code storageTexelBufferOffsetAlignmentBytes}</a> members of {@link VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT}, but smaller alignment is optionally: allowed by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-storageTexelBufferOffsetSingleTexelAlignment">{@code storageTexelBufferOffsetSingleTexelAlignment}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-uniformTexelBufferOffsetSingleTexelAlignment">{@code uniformTexelBufferOffsetSingleTexelAlignment}</a>. If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-texelBufferAlignment">texelBufferAlignment</a> is not enabled, {@link VkBufferViewCreateInfo}{@code ::offset} <b>must</b> be a multiple of this value.</li>
 * <li>{@code minUniformBufferOffsetAlignment} &ndash; the minimum required: alignment, in bytes, for the {@code offset} member of the {@link VkDescriptorBufferInfo} structure for uniform buffers. When a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} is updated, the {@code offset} <b>must</b> be an integer multiple of this limit. Similarly, dynamic offsets for uniform buffers <b>must</b> be multiples of this limit.</li>
 * <li>{@code minStorageBufferOffsetAlignment} &ndash; the minimum required: alignment, in bytes, for the {@code offset} member of the {@link VkDescriptorBufferInfo} structure for storage buffers. When a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} is updated, the {@code offset} <b>must</b> be an integer multiple of this limit. Similarly, dynamic offsets for storage buffers <b>must</b> be multiples of this limit.</li>
 * <li>{@code minTexelOffset} &ndash; the minimum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample}* or {@code OpImageFetch}* image instructions.</li>
 * <li>{@code maxTexelOffset} &ndash; the maximum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample}* or {@code OpImageFetch}* image instructions.</li>
 * <li>{@code minTexelGatherOffset} &ndash; the minimum offset value for the {@code Offset}, {@code ConstOffset}, or {@code ConstOffsets} image operands of any of the {@code OpImage}*{@code Gather} image instructions.</li>
 * <li>{@code maxTexelGatherOffset} &ndash; the maximum offset value for the {@code Offset}, {@code ConstOffset}, or {@code ConstOffsets} image operands of any of the {@code OpImage}*{@code Gather} image instructions.</li>
 * <li>{@code minInterpolationOffset} &ndash; the minimum negative offset value for the {@code offset} operand of the {@code InterpolateAtOffset} extended instruction.</li>
 * <li>{@code maxInterpolationOffset} &ndash; the maximum positive offset value for the {@code offset} operand of the {@code InterpolateAtOffset} extended instruction.</li>
 * <li>{@code subPixelInterpolationOffsetBits} &ndash; the number of subpixel fractional bits that the {@code x} and {@code y} offsets to the {@code InterpolateAtOffset} extended instruction <b>may</b> be rounded to as fixed-point values.</li>
 * <li>{@code maxFramebufferWidth} &ndash; the maximum width for a framebuffer. The {@code width} member of the {@link VkFramebufferCreateInfo} structure <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxFramebufferHeight} &ndash; the maximum height for a framebuffer. The {@code height} member of the {@link VkFramebufferCreateInfo} structure <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxFramebufferLayers} &ndash; the maximum layer count for a layered framebuffer. The {@code layers} member of the {@link VkFramebufferCreateInfo} structure <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code framebufferColorSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the color sample counts that are supported for all framebuffer color attachments with floating- or fixed-point formats. There is no limit that specifies the color sample counts that are supported for all color attachments with integer formats.</li>
 * <li>{@code framebufferDepthSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported depth sample counts for all framebuffer depth/stencil attachments, when the format includes a depth component.</li>
 * <li>{@code framebufferStencilSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported stencil sample counts for all framebuffer depth/stencil attachments, when the format includes a stencil component.</li>
 * <li>{@code framebufferNoAttachmentsSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported sample counts for a framebuffer with no attachments.</li>
 * <li>{@code maxColorAttachments} &ndash; the maximum number of color attachments that <b>can</b> be used by a subpass in a render pass. The {@code colorAttachmentCount} member of the {@link VkSubpassDescription} structure <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code sampledImageColorSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and a non-integer color format.</li>
 * <li>{@code sampledImageIntegerSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and an integer color format.</li>
 * <li>{@code sampledImageDepthSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and a depth format.</li>
 * <li>{@code sampledImageStencilSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and a stencil format.</li>
 * <li>{@code storageImageSampleCounts} &ndash; a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}.</li>
 * <li>{@code maxSampleMaskWords} &ndash; the maximum number of array elements of a variable decorated with the {@code SampleMask} built-in decoration.</li>
 * <li>{@code timestampComputeAndGraphics} &ndash; specifies support for timestamps on all graphics and compute queues. If this limit is set to {@link VK10#VK_TRUE TRUE}, all queues that advertise the {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} in the {@link VkQueueFamilyProperties}{@code ::queueFlags} support {@link VkQueueFamilyProperties}{@code ::timestampValidBits} of at least 36. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#queries-timestamps">Timestamp Queries</a>.</li>
 * <li>{@code timestampPeriod} &ndash; the number of nanoseconds required: for a timestamp query to be incremented by 1. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#queries-timestamps">Timestamp Queries</a>.</li>
 * <li>{@code maxClipDistances} &ndash; the maximum number of clip distances that <b>can</b> be used in a single shader stage. The size of any array declared with the {@code ClipDistance} built-in decoration in a shader module <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxCullDistances} &ndash; the maximum number of cull distances that <b>can</b> be used in a single shader stage. The size of any array declared with the {@code CullDistance} built-in decoration in a shader module <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxCombinedClipAndCullDistances} &ndash; the maximum combined number of clip and cull distances that <b>can</b> be used in a single shader stage. The sum of the sizes of any pair of arrays declared with the {@code ClipDistance} and {@code CullDistance} built-in decoration used by a single shader stage in a shader module <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code discreteQueuePriorities} &ndash; the number of discrete priorities that <b>can</b> be assigned to a queue based on the value of each member of {@link VkDeviceQueueCreateInfo}{@code ::pQueuePriorities}. This <b>must</b> be at least 2, and levels <b>must</b> be spread evenly over the range, with at least one level at 1.0, and another at 0.0. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-priority">Queue Priority</a>.</li>
 * <li>{@code pointSizeRange[2]} &ndash; the range <code>[minimum,maximum]</code> of supported sizes for points. Values written to variables decorated with the {@code PointSize} built-in decoration are clamped to this range.</li>
 * <li>{@code lineWidthRange[2]} &ndash; the range <code>[minimum,maximum]</code> of supported widths for lines. Values specified by the {@code lineWidth} member of the {@link VkPipelineRasterizationStateCreateInfo} or the {@code lineWidth} parameter to {@code vkCmdSetLineWidth} are clamped to this range.</li>
 * <li>{@code pointSizeGranularity} &ndash; the granularity of supported point sizes. Not all point sizes in the range defined by {@code pointSizeRange} are supported. This limit specifies the granularity (or increment) between successive supported point sizes.</li>
 * <li>{@code lineWidthGranularity} &ndash; the granularity of supported line widths. Not all line widths in the range defined by {@code lineWidthRange} are supported. This limit specifies the granularity (or increment) between successive supported line widths.</li>
 * <li>{@code strictLines} &ndash; specifies whether lines are rasterized according to the preferred method of rasterization. If set to {@link VK10#VK_FALSE FALSE}, lines <b>may</b> be rasterized under a relaxed set of rules. If set to {@link VK10#VK_TRUE TRUE}, lines are rasterized as per the strict definition. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-lines-basic">Basic Line Segment Rasterization</a>.</li>
 * <li>{@code standardSampleLocations} &ndash; specifies whether rasterization uses the standard sample locations as documented in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-multisampling">Multisampling</a>. If set to {@link VK10#VK_TRUE TRUE}, the implementation uses the documented sample locations. If set to {@link VK10#VK_FALSE FALSE}, the implementation <b>may</b> use different sample locations.</li>
 * <li>{@code optimalBufferCopyOffsetAlignment} &ndash; the optimal buffer offset alignment in bytes for {@code vkCmdCopyBufferToImage} and {@code vkCmdCopyImageToBuffer}. The per texel alignment requirements are enforced, but applications <b>should</b> use the optimal alignment for optimal performance and power use.</li>
 * <li>{@code optimalBufferCopyRowPitchAlignment} &ndash; the optimal buffer row pitch alignment in bytes for {@code vkCmdCopyBufferToImage} and {@code vkCmdCopyImageToBuffer}. Row pitch is the number of bytes between texels with the same X coordinate in adjacent rows (Y coordinates differ by one). The per texel alignment requirements are enforced, but applications <b>should</b> use the optimal alignment for optimal performance and power use.</li>
 * <li>{@code nonCoherentAtomSize} &ndash; the size and alignment in bytes that bounds concurrent access to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-device-hostaccess">host-mapped device memory</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLimits {
 *     uint32_t maxImageDimension1D;
 *     uint32_t maxImageDimension2D;
 *     uint32_t maxImageDimension3D;
 *     uint32_t maxImageDimensionCube;
 *     uint32_t maxImageArrayLayers;
 *     uint32_t maxTexelBufferElements;
 *     uint32_t maxUniformBufferRange;
 *     uint32_t maxStorageBufferRange;
 *     uint32_t maxPushConstantsSize;
 *     uint32_t maxMemoryAllocationCount;
 *     uint32_t maxSamplerAllocationCount;
 *     VkDeviceSize bufferImageGranularity;
 *     VkDeviceSize sparseAddressSpaceSize;
 *     uint32_t maxBoundDescriptorSets;
 *     uint32_t maxPerStageDescriptorSamplers;
 *     uint32_t maxPerStageDescriptorUniformBuffers;
 *     uint32_t maxPerStageDescriptorStorageBuffers;
 *     uint32_t maxPerStageDescriptorSampledImages;
 *     uint32_t maxPerStageDescriptorStorageImages;
 *     uint32_t maxPerStageDescriptorInputAttachments;
 *     uint32_t maxPerStageResources;
 *     uint32_t maxDescriptorSetSamplers;
 *     uint32_t maxDescriptorSetUniformBuffers;
 *     uint32_t maxDescriptorSetUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetStorageBuffers;
 *     uint32_t maxDescriptorSetStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetSampledImages;
 *     uint32_t maxDescriptorSetStorageImages;
 *     uint32_t maxDescriptorSetInputAttachments;
 *     uint32_t maxVertexInputAttributes;
 *     uint32_t maxVertexInputBindings;
 *     uint32_t maxVertexInputAttributeOffset;
 *     uint32_t maxVertexInputBindingStride;
 *     uint32_t maxVertexOutputComponents;
 *     uint32_t maxTessellationGenerationLevel;
 *     uint32_t maxTessellationPatchSize;
 *     uint32_t maxTessellationControlPerVertexInputComponents;
 *     uint32_t maxTessellationControlPerVertexOutputComponents;
 *     uint32_t maxTessellationControlPerPatchOutputComponents;
 *     uint32_t maxTessellationControlTotalOutputComponents;
 *     uint32_t maxTessellationEvaluationInputComponents;
 *     uint32_t maxTessellationEvaluationOutputComponents;
 *     uint32_t maxGeometryShaderInvocations;
 *     uint32_t maxGeometryInputComponents;
 *     uint32_t maxGeometryOutputComponents;
 *     uint32_t maxGeometryOutputVertices;
 *     uint32_t maxGeometryTotalOutputComponents;
 *     uint32_t maxFragmentInputComponents;
 *     uint32_t maxFragmentOutputAttachments;
 *     uint32_t maxFragmentDualSrcAttachments;
 *     uint32_t maxFragmentCombinedOutputResources;
 *     uint32_t maxComputeSharedMemorySize;
 *     uint32_t maxComputeWorkGroupCount[3];
 *     uint32_t maxComputeWorkGroupInvocations;
 *     uint32_t maxComputeWorkGroupSize[3];
 *     uint32_t subPixelPrecisionBits;
 *     uint32_t subTexelPrecisionBits;
 *     uint32_t mipmapPrecisionBits;
 *     uint32_t maxDrawIndexedIndexValue;
 *     uint32_t maxDrawIndirectCount;
 *     float maxSamplerLodBias;
 *     float maxSamplerAnisotropy;
 *     uint32_t maxViewports;
 *     uint32_t maxViewportDimensions[2];
 *     float viewportBoundsRange[2];
 *     uint32_t viewportSubPixelBits;
 *     size_t minMemoryMapAlignment;
 *     VkDeviceSize minTexelBufferOffsetAlignment;
 *     VkDeviceSize minUniformBufferOffsetAlignment;
 *     VkDeviceSize minStorageBufferOffsetAlignment;
 *     int32_t minTexelOffset;
 *     uint32_t maxTexelOffset;
 *     int32_t minTexelGatherOffset;
 *     uint32_t maxTexelGatherOffset;
 *     float minInterpolationOffset;
 *     float maxInterpolationOffset;
 *     uint32_t subPixelInterpolationOffsetBits;
 *     uint32_t maxFramebufferWidth;
 *     uint32_t maxFramebufferHeight;
 *     uint32_t maxFramebufferLayers;
 *     VkSampleCountFlags framebufferColorSampleCounts;
 *     VkSampleCountFlags framebufferDepthSampleCounts;
 *     VkSampleCountFlags framebufferStencilSampleCounts;
 *     VkSampleCountFlags framebufferNoAttachmentsSampleCounts;
 *     uint32_t maxColorAttachments;
 *     VkSampleCountFlags sampledImageColorSampleCounts;
 *     VkSampleCountFlags sampledImageIntegerSampleCounts;
 *     VkSampleCountFlags sampledImageDepthSampleCounts;
 *     VkSampleCountFlags sampledImageStencilSampleCounts;
 *     VkSampleCountFlags storageImageSampleCounts;
 *     uint32_t maxSampleMaskWords;
 *     VkBool32 timestampComputeAndGraphics;
 *     float timestampPeriod;
 *     uint32_t maxClipDistances;
 *     uint32_t maxCullDistances;
 *     uint32_t maxCombinedClipAndCullDistances;
 *     uint32_t discreteQueuePriorities;
 *     float pointSizeRange[2];
 *     float lineWidthRange[2];
 *     float pointSizeGranularity;
 *     float lineWidthGranularity;
 *     VkBool32 strictLines;
 *     VkBool32 standardSampleLocations;
 *     VkDeviceSize optimalBufferCopyOffsetAlignment;
 *     VkDeviceSize optimalBufferCopyRowPitchAlignment;
 *     VkDeviceSize nonCoherentAtomSize;
 * }</code></pre>
 */
public class VkPhysicalDeviceLimits extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXIMAGEDIMENSION1D,
        MAXIMAGEDIMENSION2D,
        MAXIMAGEDIMENSION3D,
        MAXIMAGEDIMENSIONCUBE,
        MAXIMAGEARRAYLAYERS,
        MAXTEXELBUFFERELEMENTS,
        MAXUNIFORMBUFFERRANGE,
        MAXSTORAGEBUFFERRANGE,
        MAXPUSHCONSTANTSSIZE,
        MAXMEMORYALLOCATIONCOUNT,
        MAXSAMPLERALLOCATIONCOUNT,
        BUFFERIMAGEGRANULARITY,
        SPARSEADDRESSSPACESIZE,
        MAXBOUNDDESCRIPTORSETS,
        MAXPERSTAGEDESCRIPTORSAMPLERS,
        MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS,
        MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS,
        MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES,
        MAXPERSTAGEDESCRIPTORSTORAGEIMAGES,
        MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS,
        MAXPERSTAGERESOURCES,
        MAXDESCRIPTORSETSAMPLERS,
        MAXDESCRIPTORSETUNIFORMBUFFERS,
        MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC,
        MAXDESCRIPTORSETSTORAGEBUFFERS,
        MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC,
        MAXDESCRIPTORSETSAMPLEDIMAGES,
        MAXDESCRIPTORSETSTORAGEIMAGES,
        MAXDESCRIPTORSETINPUTATTACHMENTS,
        MAXVERTEXINPUTATTRIBUTES,
        MAXVERTEXINPUTBINDINGS,
        MAXVERTEXINPUTATTRIBUTEOFFSET,
        MAXVERTEXINPUTBINDINGSTRIDE,
        MAXVERTEXOUTPUTCOMPONENTS,
        MAXTESSELLATIONGENERATIONLEVEL,
        MAXTESSELLATIONPATCHSIZE,
        MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS,
        MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS,
        MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS,
        MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS,
        MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS,
        MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS,
        MAXGEOMETRYSHADERINVOCATIONS,
        MAXGEOMETRYINPUTCOMPONENTS,
        MAXGEOMETRYOUTPUTCOMPONENTS,
        MAXGEOMETRYOUTPUTVERTICES,
        MAXGEOMETRYTOTALOUTPUTCOMPONENTS,
        MAXFRAGMENTINPUTCOMPONENTS,
        MAXFRAGMENTOUTPUTATTACHMENTS,
        MAXFRAGMENTDUALSRCATTACHMENTS,
        MAXFRAGMENTCOMBINEDOUTPUTRESOURCES,
        MAXCOMPUTESHAREDMEMORYSIZE,
        MAXCOMPUTEWORKGROUPCOUNT,
        MAXCOMPUTEWORKGROUPINVOCATIONS,
        MAXCOMPUTEWORKGROUPSIZE,
        SUBPIXELPRECISIONBITS,
        SUBTEXELPRECISIONBITS,
        MIPMAPPRECISIONBITS,
        MAXDRAWINDEXEDINDEXVALUE,
        MAXDRAWINDIRECTCOUNT,
        MAXSAMPLERLODBIAS,
        MAXSAMPLERANISOTROPY,
        MAXVIEWPORTS,
        MAXVIEWPORTDIMENSIONS,
        VIEWPORTBOUNDSRANGE,
        VIEWPORTSUBPIXELBITS,
        MINMEMORYMAPALIGNMENT,
        MINTEXELBUFFEROFFSETALIGNMENT,
        MINUNIFORMBUFFEROFFSETALIGNMENT,
        MINSTORAGEBUFFEROFFSETALIGNMENT,
        MINTEXELOFFSET,
        MAXTEXELOFFSET,
        MINTEXELGATHEROFFSET,
        MAXTEXELGATHEROFFSET,
        MININTERPOLATIONOFFSET,
        MAXINTERPOLATIONOFFSET,
        SUBPIXELINTERPOLATIONOFFSETBITS,
        MAXFRAMEBUFFERWIDTH,
        MAXFRAMEBUFFERHEIGHT,
        MAXFRAMEBUFFERLAYERS,
        FRAMEBUFFERCOLORSAMPLECOUNTS,
        FRAMEBUFFERDEPTHSAMPLECOUNTS,
        FRAMEBUFFERSTENCILSAMPLECOUNTS,
        FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS,
        MAXCOLORATTACHMENTS,
        SAMPLEDIMAGECOLORSAMPLECOUNTS,
        SAMPLEDIMAGEINTEGERSAMPLECOUNTS,
        SAMPLEDIMAGEDEPTHSAMPLECOUNTS,
        SAMPLEDIMAGESTENCILSAMPLECOUNTS,
        STORAGEIMAGESAMPLECOUNTS,
        MAXSAMPLEMASKWORDS,
        TIMESTAMPCOMPUTEANDGRAPHICS,
        TIMESTAMPPERIOD,
        MAXCLIPDISTANCES,
        MAXCULLDISTANCES,
        MAXCOMBINEDCLIPANDCULLDISTANCES,
        DISCRETEQUEUEPRIORITIES,
        POINTSIZERANGE,
        LINEWIDTHRANGE,
        POINTSIZEGRANULARITY,
        LINEWIDTHGRANULARITY,
        STRICTLINES,
        STANDARDSAMPLELOCATIONS,
        OPTIMALBUFFERCOPYOFFSETALIGNMENT,
        OPTIMALBUFFERCOPYROWPITCHALIGNMENT,
        NONCOHERENTATOMSIZE;

    static {
        Layout layout = __struct(
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
            __member(8),
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
            __array(4, 3),
            __member(4),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 2),
            __array(4, 2),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
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
            __array(4, 2),
            __array(4, 2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXIMAGEDIMENSION1D = layout.offsetof(0);
        MAXIMAGEDIMENSION2D = layout.offsetof(1);
        MAXIMAGEDIMENSION3D = layout.offsetof(2);
        MAXIMAGEDIMENSIONCUBE = layout.offsetof(3);
        MAXIMAGEARRAYLAYERS = layout.offsetof(4);
        MAXTEXELBUFFERELEMENTS = layout.offsetof(5);
        MAXUNIFORMBUFFERRANGE = layout.offsetof(6);
        MAXSTORAGEBUFFERRANGE = layout.offsetof(7);
        MAXPUSHCONSTANTSSIZE = layout.offsetof(8);
        MAXMEMORYALLOCATIONCOUNT = layout.offsetof(9);
        MAXSAMPLERALLOCATIONCOUNT = layout.offsetof(10);
        BUFFERIMAGEGRANULARITY = layout.offsetof(11);
        SPARSEADDRESSSPACESIZE = layout.offsetof(12);
        MAXBOUNDDESCRIPTORSETS = layout.offsetof(13);
        MAXPERSTAGEDESCRIPTORSAMPLERS = layout.offsetof(14);
        MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS = layout.offsetof(15);
        MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS = layout.offsetof(16);
        MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES = layout.offsetof(17);
        MAXPERSTAGEDESCRIPTORSTORAGEIMAGES = layout.offsetof(18);
        MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS = layout.offsetof(19);
        MAXPERSTAGERESOURCES = layout.offsetof(20);
        MAXDESCRIPTORSETSAMPLERS = layout.offsetof(21);
        MAXDESCRIPTORSETUNIFORMBUFFERS = layout.offsetof(22);
        MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC = layout.offsetof(23);
        MAXDESCRIPTORSETSTORAGEBUFFERS = layout.offsetof(24);
        MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC = layout.offsetof(25);
        MAXDESCRIPTORSETSAMPLEDIMAGES = layout.offsetof(26);
        MAXDESCRIPTORSETSTORAGEIMAGES = layout.offsetof(27);
        MAXDESCRIPTORSETINPUTATTACHMENTS = layout.offsetof(28);
        MAXVERTEXINPUTATTRIBUTES = layout.offsetof(29);
        MAXVERTEXINPUTBINDINGS = layout.offsetof(30);
        MAXVERTEXINPUTATTRIBUTEOFFSET = layout.offsetof(31);
        MAXVERTEXINPUTBINDINGSTRIDE = layout.offsetof(32);
        MAXVERTEXOUTPUTCOMPONENTS = layout.offsetof(33);
        MAXTESSELLATIONGENERATIONLEVEL = layout.offsetof(34);
        MAXTESSELLATIONPATCHSIZE = layout.offsetof(35);
        MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS = layout.offsetof(36);
        MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS = layout.offsetof(37);
        MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS = layout.offsetof(38);
        MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS = layout.offsetof(39);
        MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS = layout.offsetof(40);
        MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS = layout.offsetof(41);
        MAXGEOMETRYSHADERINVOCATIONS = layout.offsetof(42);
        MAXGEOMETRYINPUTCOMPONENTS = layout.offsetof(43);
        MAXGEOMETRYOUTPUTCOMPONENTS = layout.offsetof(44);
        MAXGEOMETRYOUTPUTVERTICES = layout.offsetof(45);
        MAXGEOMETRYTOTALOUTPUTCOMPONENTS = layout.offsetof(46);
        MAXFRAGMENTINPUTCOMPONENTS = layout.offsetof(47);
        MAXFRAGMENTOUTPUTATTACHMENTS = layout.offsetof(48);
        MAXFRAGMENTDUALSRCATTACHMENTS = layout.offsetof(49);
        MAXFRAGMENTCOMBINEDOUTPUTRESOURCES = layout.offsetof(50);
        MAXCOMPUTESHAREDMEMORYSIZE = layout.offsetof(51);
        MAXCOMPUTEWORKGROUPCOUNT = layout.offsetof(52);
        MAXCOMPUTEWORKGROUPINVOCATIONS = layout.offsetof(53);
        MAXCOMPUTEWORKGROUPSIZE = layout.offsetof(54);
        SUBPIXELPRECISIONBITS = layout.offsetof(55);
        SUBTEXELPRECISIONBITS = layout.offsetof(56);
        MIPMAPPRECISIONBITS = layout.offsetof(57);
        MAXDRAWINDEXEDINDEXVALUE = layout.offsetof(58);
        MAXDRAWINDIRECTCOUNT = layout.offsetof(59);
        MAXSAMPLERLODBIAS = layout.offsetof(60);
        MAXSAMPLERANISOTROPY = layout.offsetof(61);
        MAXVIEWPORTS = layout.offsetof(62);
        MAXVIEWPORTDIMENSIONS = layout.offsetof(63);
        VIEWPORTBOUNDSRANGE = layout.offsetof(64);
        VIEWPORTSUBPIXELBITS = layout.offsetof(65);
        MINMEMORYMAPALIGNMENT = layout.offsetof(66);
        MINTEXELBUFFEROFFSETALIGNMENT = layout.offsetof(67);
        MINUNIFORMBUFFEROFFSETALIGNMENT = layout.offsetof(68);
        MINSTORAGEBUFFEROFFSETALIGNMENT = layout.offsetof(69);
        MINTEXELOFFSET = layout.offsetof(70);
        MAXTEXELOFFSET = layout.offsetof(71);
        MINTEXELGATHEROFFSET = layout.offsetof(72);
        MAXTEXELGATHEROFFSET = layout.offsetof(73);
        MININTERPOLATIONOFFSET = layout.offsetof(74);
        MAXINTERPOLATIONOFFSET = layout.offsetof(75);
        SUBPIXELINTERPOLATIONOFFSETBITS = layout.offsetof(76);
        MAXFRAMEBUFFERWIDTH = layout.offsetof(77);
        MAXFRAMEBUFFERHEIGHT = layout.offsetof(78);
        MAXFRAMEBUFFERLAYERS = layout.offsetof(79);
        FRAMEBUFFERCOLORSAMPLECOUNTS = layout.offsetof(80);
        FRAMEBUFFERDEPTHSAMPLECOUNTS = layout.offsetof(81);
        FRAMEBUFFERSTENCILSAMPLECOUNTS = layout.offsetof(82);
        FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS = layout.offsetof(83);
        MAXCOLORATTACHMENTS = layout.offsetof(84);
        SAMPLEDIMAGECOLORSAMPLECOUNTS = layout.offsetof(85);
        SAMPLEDIMAGEINTEGERSAMPLECOUNTS = layout.offsetof(86);
        SAMPLEDIMAGEDEPTHSAMPLECOUNTS = layout.offsetof(87);
        SAMPLEDIMAGESTENCILSAMPLECOUNTS = layout.offsetof(88);
        STORAGEIMAGESAMPLECOUNTS = layout.offsetof(89);
        MAXSAMPLEMASKWORDS = layout.offsetof(90);
        TIMESTAMPCOMPUTEANDGRAPHICS = layout.offsetof(91);
        TIMESTAMPPERIOD = layout.offsetof(92);
        MAXCLIPDISTANCES = layout.offsetof(93);
        MAXCULLDISTANCES = layout.offsetof(94);
        MAXCOMBINEDCLIPANDCULLDISTANCES = layout.offsetof(95);
        DISCRETEQUEUEPRIORITIES = layout.offsetof(96);
        POINTSIZERANGE = layout.offsetof(97);
        LINEWIDTHRANGE = layout.offsetof(98);
        POINTSIZEGRANULARITY = layout.offsetof(99);
        LINEWIDTHGRANULARITY = layout.offsetof(100);
        STRICTLINES = layout.offsetof(101);
        STANDARDSAMPLELOCATIONS = layout.offsetof(102);
        OPTIMALBUFFERCOPYOFFSETALIGNMENT = layout.offsetof(103);
        OPTIMALBUFFERCOPYROWPITCHALIGNMENT = layout.offsetof(104);
        NONCOHERENTATOMSIZE = layout.offsetof(105);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLimits(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code maxImageDimension1D} field. */
    @NativeType("uint32_t")
    public int maxImageDimension1D() { return nmaxImageDimension1D(address()); }
    /** Returns the value of the {@code maxImageDimension2D} field. */
    @NativeType("uint32_t")
    public int maxImageDimension2D() { return nmaxImageDimension2D(address()); }
    /** Returns the value of the {@code maxImageDimension3D} field. */
    @NativeType("uint32_t")
    public int maxImageDimension3D() { return nmaxImageDimension3D(address()); }
    /** Returns the value of the {@code maxImageDimensionCube} field. */
    @NativeType("uint32_t")
    public int maxImageDimensionCube() { return nmaxImageDimensionCube(address()); }
    /** Returns the value of the {@code maxImageArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** Returns the value of the {@code maxTexelBufferElements} field. */
    @NativeType("uint32_t")
    public int maxTexelBufferElements() { return nmaxTexelBufferElements(address()); }
    /** Returns the value of the {@code maxUniformBufferRange} field. */
    @NativeType("uint32_t")
    public int maxUniformBufferRange() { return nmaxUniformBufferRange(address()); }
    /** Returns the value of the {@code maxStorageBufferRange} field. */
    @NativeType("uint32_t")
    public int maxStorageBufferRange() { return nmaxStorageBufferRange(address()); }
    /** Returns the value of the {@code maxPushConstantsSize} field. */
    @NativeType("uint32_t")
    public int maxPushConstantsSize() { return nmaxPushConstantsSize(address()); }
    /** Returns the value of the {@code maxMemoryAllocationCount} field. */
    @NativeType("uint32_t")
    public int maxMemoryAllocationCount() { return nmaxMemoryAllocationCount(address()); }
    /** Returns the value of the {@code maxSamplerAllocationCount} field. */
    @NativeType("uint32_t")
    public int maxSamplerAllocationCount() { return nmaxSamplerAllocationCount(address()); }
    /** Returns the value of the {@code bufferImageGranularity} field. */
    @NativeType("VkDeviceSize")
    public long bufferImageGranularity() { return nbufferImageGranularity(address()); }
    /** Returns the value of the {@code sparseAddressSpaceSize} field. */
    @NativeType("VkDeviceSize")
    public long sparseAddressSpaceSize() { return nsparseAddressSpaceSize(address()); }
    /** Returns the value of the {@code maxBoundDescriptorSets} field. */
    @NativeType("uint32_t")
    public int maxBoundDescriptorSets() { return nmaxBoundDescriptorSets(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorSamplers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSamplers() { return nmaxPerStageDescriptorSamplers(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUniformBuffers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUniformBuffers() { return nmaxPerStageDescriptorUniformBuffers(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorStorageBuffers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageBuffers() { return nmaxPerStageDescriptorStorageBuffers(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorSampledImages} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSampledImages() { return nmaxPerStageDescriptorSampledImages(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorStorageImages} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageImages() { return nmaxPerStageDescriptorStorageImages(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorInputAttachments} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInputAttachments() { return nmaxPerStageDescriptorInputAttachments(address()); }
    /** Returns the value of the {@code maxPerStageResources} field. */
    @NativeType("uint32_t")
    public int maxPerStageResources() { return nmaxPerStageResources(address()); }
    /** Returns the value of the {@code maxDescriptorSetSamplers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSamplers() { return nmaxDescriptorSetSamplers(address()); }
    /** Returns the value of the {@code maxDescriptorSetUniformBuffers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffers() { return nmaxDescriptorSetUniformBuffers(address()); }
    /** Returns the value of the {@code maxDescriptorSetUniformBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffersDynamic() { return nmaxDescriptorSetUniformBuffersDynamic(address()); }
    /** Returns the value of the {@code maxDescriptorSetStorageBuffers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffers() { return nmaxDescriptorSetStorageBuffers(address()); }
    /** Returns the value of the {@code maxDescriptorSetStorageBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffersDynamic() { return nmaxDescriptorSetStorageBuffersDynamic(address()); }
    /** Returns the value of the {@code maxDescriptorSetSampledImages} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSampledImages() { return nmaxDescriptorSetSampledImages(address()); }
    /** Returns the value of the {@code maxDescriptorSetStorageImages} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageImages() { return nmaxDescriptorSetStorageImages(address()); }
    /** Returns the value of the {@code maxDescriptorSetInputAttachments} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInputAttachments() { return nmaxDescriptorSetInputAttachments(address()); }
    /** Returns the value of the {@code maxVertexInputAttributes} field. */
    @NativeType("uint32_t")
    public int maxVertexInputAttributes() { return nmaxVertexInputAttributes(address()); }
    /** Returns the value of the {@code maxVertexInputBindings} field. */
    @NativeType("uint32_t")
    public int maxVertexInputBindings() { return nmaxVertexInputBindings(address()); }
    /** Returns the value of the {@code maxVertexInputAttributeOffset} field. */
    @NativeType("uint32_t")
    public int maxVertexInputAttributeOffset() { return nmaxVertexInputAttributeOffset(address()); }
    /** Returns the value of the {@code maxVertexInputBindingStride} field. */
    @NativeType("uint32_t")
    public int maxVertexInputBindingStride() { return nmaxVertexInputBindingStride(address()); }
    /** Returns the value of the {@code maxVertexOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxVertexOutputComponents() { return nmaxVertexOutputComponents(address()); }
    /** Returns the value of the {@code maxTessellationGenerationLevel} field. */
    @NativeType("uint32_t")
    public int maxTessellationGenerationLevel() { return nmaxTessellationGenerationLevel(address()); }
    /** Returns the value of the {@code maxTessellationPatchSize} field. */
    @NativeType("uint32_t")
    public int maxTessellationPatchSize() { return nmaxTessellationPatchSize(address()); }
    /** Returns the value of the {@code maxTessellationControlPerVertexInputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexInputComponents() { return nmaxTessellationControlPerVertexInputComponents(address()); }
    /** Returns the value of the {@code maxTessellationControlPerVertexOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexOutputComponents() { return nmaxTessellationControlPerVertexOutputComponents(address()); }
    /** Returns the value of the {@code maxTessellationControlPerPatchOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerPatchOutputComponents() { return nmaxTessellationControlPerPatchOutputComponents(address()); }
    /** Returns the value of the {@code maxTessellationControlTotalOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlTotalOutputComponents() { return nmaxTessellationControlTotalOutputComponents(address()); }
    /** Returns the value of the {@code maxTessellationEvaluationInputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationEvaluationInputComponents() { return nmaxTessellationEvaluationInputComponents(address()); }
    /** Returns the value of the {@code maxTessellationEvaluationOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationEvaluationOutputComponents() { return nmaxTessellationEvaluationOutputComponents(address()); }
    /** Returns the value of the {@code maxGeometryShaderInvocations} field. */
    @NativeType("uint32_t")
    public int maxGeometryShaderInvocations() { return nmaxGeometryShaderInvocations(address()); }
    /** Returns the value of the {@code maxGeometryInputComponents} field. */
    @NativeType("uint32_t")
    public int maxGeometryInputComponents() { return nmaxGeometryInputComponents(address()); }
    /** Returns the value of the {@code maxGeometryOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxGeometryOutputComponents() { return nmaxGeometryOutputComponents(address()); }
    /** Returns the value of the {@code maxGeometryOutputVertices} field. */
    @NativeType("uint32_t")
    public int maxGeometryOutputVertices() { return nmaxGeometryOutputVertices(address()); }
    /** Returns the value of the {@code maxGeometryTotalOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxGeometryTotalOutputComponents() { return nmaxGeometryTotalOutputComponents(address()); }
    /** Returns the value of the {@code maxFragmentInputComponents} field. */
    @NativeType("uint32_t")
    public int maxFragmentInputComponents() { return nmaxFragmentInputComponents(address()); }
    /** Returns the value of the {@code maxFragmentOutputAttachments} field. */
    @NativeType("uint32_t")
    public int maxFragmentOutputAttachments() { return nmaxFragmentOutputAttachments(address()); }
    /** Returns the value of the {@code maxFragmentDualSrcAttachments} field. */
    @NativeType("uint32_t")
    public int maxFragmentDualSrcAttachments() { return nmaxFragmentDualSrcAttachments(address()); }
    /** Returns the value of the {@code maxFragmentCombinedOutputResources} field. */
    @NativeType("uint32_t")
    public int maxFragmentCombinedOutputResources() { return nmaxFragmentCombinedOutputResources(address()); }
    /** Returns the value of the {@code maxComputeSharedMemorySize} field. */
    @NativeType("uint32_t")
    public int maxComputeSharedMemorySize() { return nmaxComputeSharedMemorySize(address()); }
    /** Returns a {@link IntBuffer} view of the {@code maxComputeWorkGroupCount} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupCount() { return nmaxComputeWorkGroupCount(address()); }
    /** Returns the value at the specified index of the {@code maxComputeWorkGroupCount} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupCount(int index) { return nmaxComputeWorkGroupCount(address(), index); }
    /** Returns the value of the {@code maxComputeWorkGroupInvocations} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupInvocations() { return nmaxComputeWorkGroupInvocations(address()); }
    /** Returns a {@link IntBuffer} view of the {@code maxComputeWorkGroupSize} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupSize() { return nmaxComputeWorkGroupSize(address()); }
    /** Returns the value at the specified index of the {@code maxComputeWorkGroupSize} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupSize(int index) { return nmaxComputeWorkGroupSize(address(), index); }
    /** Returns the value of the {@code subPixelPrecisionBits} field. */
    @NativeType("uint32_t")
    public int subPixelPrecisionBits() { return nsubPixelPrecisionBits(address()); }
    /** Returns the value of the {@code subTexelPrecisionBits} field. */
    @NativeType("uint32_t")
    public int subTexelPrecisionBits() { return nsubTexelPrecisionBits(address()); }
    /** Returns the value of the {@code mipmapPrecisionBits} field. */
    @NativeType("uint32_t")
    public int mipmapPrecisionBits() { return nmipmapPrecisionBits(address()); }
    /** Returns the value of the {@code maxDrawIndexedIndexValue} field. */
    @NativeType("uint32_t")
    public int maxDrawIndexedIndexValue() { return nmaxDrawIndexedIndexValue(address()); }
    /** Returns the value of the {@code maxDrawIndirectCount} field. */
    @NativeType("uint32_t")
    public int maxDrawIndirectCount() { return nmaxDrawIndirectCount(address()); }
    /** Returns the value of the {@code maxSamplerLodBias} field. */
    public float maxSamplerLodBias() { return nmaxSamplerLodBias(address()); }
    /** Returns the value of the {@code maxSamplerAnisotropy} field. */
    public float maxSamplerAnisotropy() { return nmaxSamplerAnisotropy(address()); }
    /** Returns the value of the {@code maxViewports} field. */
    @NativeType("uint32_t")
    public int maxViewports() { return nmaxViewports(address()); }
    /** Returns a {@link IntBuffer} view of the {@code maxViewportDimensions} field. */
    @NativeType("uint32_t[2]")
    public IntBuffer maxViewportDimensions() { return nmaxViewportDimensions(address()); }
    /** Returns the value at the specified index of the {@code maxViewportDimensions} field. */
    @NativeType("uint32_t")
    public int maxViewportDimensions(int index) { return nmaxViewportDimensions(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code viewportBoundsRange} field. */
    @NativeType("float[2]")
    public FloatBuffer viewportBoundsRange() { return nviewportBoundsRange(address()); }
    /** Returns the value at the specified index of the {@code viewportBoundsRange} field. */
    public float viewportBoundsRange(int index) { return nviewportBoundsRange(address(), index); }
    /** Returns the value of the {@code viewportSubPixelBits} field. */
    @NativeType("uint32_t")
    public int viewportSubPixelBits() { return nviewportSubPixelBits(address()); }
    /** Returns the value of the {@code minMemoryMapAlignment} field. */
    @NativeType("size_t")
    public long minMemoryMapAlignment() { return nminMemoryMapAlignment(address()); }
    /** Returns the value of the {@code minTexelBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minTexelBufferOffsetAlignment() { return nminTexelBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minUniformBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minUniformBufferOffsetAlignment() { return nminUniformBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minStorageBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minStorageBufferOffsetAlignment() { return nminStorageBufferOffsetAlignment(address()); }
    /** Returns the value of the {@code minTexelOffset} field. */
    @NativeType("int32_t")
    public int minTexelOffset() { return nminTexelOffset(address()); }
    /** Returns the value of the {@code maxTexelOffset} field. */
    @NativeType("uint32_t")
    public int maxTexelOffset() { return nmaxTexelOffset(address()); }
    /** Returns the value of the {@code minTexelGatherOffset} field. */
    @NativeType("int32_t")
    public int minTexelGatherOffset() { return nminTexelGatherOffset(address()); }
    /** Returns the value of the {@code maxTexelGatherOffset} field. */
    @NativeType("uint32_t")
    public int maxTexelGatherOffset() { return nmaxTexelGatherOffset(address()); }
    /** Returns the value of the {@code minInterpolationOffset} field. */
    public float minInterpolationOffset() { return nminInterpolationOffset(address()); }
    /** Returns the value of the {@code maxInterpolationOffset} field. */
    public float maxInterpolationOffset() { return nmaxInterpolationOffset(address()); }
    /** Returns the value of the {@code subPixelInterpolationOffsetBits} field. */
    @NativeType("uint32_t")
    public int subPixelInterpolationOffsetBits() { return nsubPixelInterpolationOffsetBits(address()); }
    /** Returns the value of the {@code maxFramebufferWidth} field. */
    @NativeType("uint32_t")
    public int maxFramebufferWidth() { return nmaxFramebufferWidth(address()); }
    /** Returns the value of the {@code maxFramebufferHeight} field. */
    @NativeType("uint32_t")
    public int maxFramebufferHeight() { return nmaxFramebufferHeight(address()); }
    /** Returns the value of the {@code maxFramebufferLayers} field. */
    @NativeType("uint32_t")
    public int maxFramebufferLayers() { return nmaxFramebufferLayers(address()); }
    /** Returns the value of the {@code framebufferColorSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferColorSampleCounts() { return nframebufferColorSampleCounts(address()); }
    /** Returns the value of the {@code framebufferDepthSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferDepthSampleCounts() { return nframebufferDepthSampleCounts(address()); }
    /** Returns the value of the {@code framebufferStencilSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferStencilSampleCounts() { return nframebufferStencilSampleCounts(address()); }
    /** Returns the value of the {@code framebufferNoAttachmentsSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferNoAttachmentsSampleCounts() { return nframebufferNoAttachmentsSampleCounts(address()); }
    /** Returns the value of the {@code maxColorAttachments} field. */
    @NativeType("uint32_t")
    public int maxColorAttachments() { return nmaxColorAttachments(address()); }
    /** Returns the value of the {@code sampledImageColorSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageColorSampleCounts() { return nsampledImageColorSampleCounts(address()); }
    /** Returns the value of the {@code sampledImageIntegerSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageIntegerSampleCounts() { return nsampledImageIntegerSampleCounts(address()); }
    /** Returns the value of the {@code sampledImageDepthSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageDepthSampleCounts() { return nsampledImageDepthSampleCounts(address()); }
    /** Returns the value of the {@code sampledImageStencilSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageStencilSampleCounts() { return nsampledImageStencilSampleCounts(address()); }
    /** Returns the value of the {@code storageImageSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int storageImageSampleCounts() { return nstorageImageSampleCounts(address()); }
    /** Returns the value of the {@code maxSampleMaskWords} field. */
    @NativeType("uint32_t")
    public int maxSampleMaskWords() { return nmaxSampleMaskWords(address()); }
    /** Returns the value of the {@code timestampComputeAndGraphics} field. */
    @NativeType("VkBool32")
    public boolean timestampComputeAndGraphics() { return ntimestampComputeAndGraphics(address()) != 0; }
    /** Returns the value of the {@code timestampPeriod} field. */
    public float timestampPeriod() { return ntimestampPeriod(address()); }
    /** Returns the value of the {@code maxClipDistances} field. */
    @NativeType("uint32_t")
    public int maxClipDistances() { return nmaxClipDistances(address()); }
    /** Returns the value of the {@code maxCullDistances} field. */
    @NativeType("uint32_t")
    public int maxCullDistances() { return nmaxCullDistances(address()); }
    /** Returns the value of the {@code maxCombinedClipAndCullDistances} field. */
    @NativeType("uint32_t")
    public int maxCombinedClipAndCullDistances() { return nmaxCombinedClipAndCullDistances(address()); }
    /** Returns the value of the {@code discreteQueuePriorities} field. */
    @NativeType("uint32_t")
    public int discreteQueuePriorities() { return ndiscreteQueuePriorities(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code pointSizeRange} field. */
    @NativeType("float[2]")
    public FloatBuffer pointSizeRange() { return npointSizeRange(address()); }
    /** Returns the value at the specified index of the {@code pointSizeRange} field. */
    public float pointSizeRange(int index) { return npointSizeRange(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code lineWidthRange} field. */
    @NativeType("float[2]")
    public FloatBuffer lineWidthRange() { return nlineWidthRange(address()); }
    /** Returns the value at the specified index of the {@code lineWidthRange} field. */
    public float lineWidthRange(int index) { return nlineWidthRange(address(), index); }
    /** Returns the value of the {@code pointSizeGranularity} field. */
    public float pointSizeGranularity() { return npointSizeGranularity(address()); }
    /** Returns the value of the {@code lineWidthGranularity} field. */
    public float lineWidthGranularity() { return nlineWidthGranularity(address()); }
    /** Returns the value of the {@code strictLines} field. */
    @NativeType("VkBool32")
    public boolean strictLines() { return nstrictLines(address()) != 0; }
    /** Returns the value of the {@code standardSampleLocations} field. */
    @NativeType("VkBool32")
    public boolean standardSampleLocations() { return nstandardSampleLocations(address()) != 0; }
    /** Returns the value of the {@code optimalBufferCopyOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long optimalBufferCopyOffsetAlignment() { return noptimalBufferCopyOffsetAlignment(address()); }
    /** Returns the value of the {@code optimalBufferCopyRowPitchAlignment} field. */
    @NativeType("VkDeviceSize")
    public long optimalBufferCopyRowPitchAlignment() { return noptimalBufferCopyRowPitchAlignment(address()); }
    /** Returns the value of the {@code nonCoherentAtomSize} field. */
    @NativeType("VkDeviceSize")
    public long nonCoherentAtomSize() { return nnonCoherentAtomSize(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLimits} instance for the specified memory address. */
    public static VkPhysicalDeviceLimits create(long address) {
        return wrap(VkPhysicalDeviceLimits.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLimits createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceLimits.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceLimits.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLimits.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLimits.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxImageDimension1D}. */
    public static int nmaxImageDimension1D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION1D); }
    /** Unsafe version of {@link #maxImageDimension2D}. */
    public static int nmaxImageDimension2D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION2D); }
    /** Unsafe version of {@link #maxImageDimension3D}. */
    public static int nmaxImageDimension3D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION3D); }
    /** Unsafe version of {@link #maxImageDimensionCube}. */
    public static int nmaxImageDimensionCube(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSIONCUBE); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #maxTexelBufferElements}. */
    public static int nmaxTexelBufferElements(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTEXELBUFFERELEMENTS); }
    /** Unsafe version of {@link #maxUniformBufferRange}. */
    public static int nmaxUniformBufferRange(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXUNIFORMBUFFERRANGE); }
    /** Unsafe version of {@link #maxStorageBufferRange}. */
    public static int nmaxStorageBufferRange(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXSTORAGEBUFFERRANGE); }
    /** Unsafe version of {@link #maxPushConstantsSize}. */
    public static int nmaxPushConstantsSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPUSHCONSTANTSSIZE); }
    /** Unsafe version of {@link #maxMemoryAllocationCount}. */
    public static int nmaxMemoryAllocationCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXMEMORYALLOCATIONCOUNT); }
    /** Unsafe version of {@link #maxSamplerAllocationCount}. */
    public static int nmaxSamplerAllocationCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXSAMPLERALLOCATIONCOUNT); }
    /** Unsafe version of {@link #bufferImageGranularity}. */
    public static long nbufferImageGranularity(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.BUFFERIMAGEGRANULARITY); }
    /** Unsafe version of {@link #sparseAddressSpaceSize}. */
    public static long nsparseAddressSpaceSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.SPARSEADDRESSSPACESIZE); }
    /** Unsafe version of {@link #maxBoundDescriptorSets}. */
    public static int nmaxBoundDescriptorSets(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXBOUNDDESCRIPTORSETS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSamplers}. */
    public static int nmaxPerStageDescriptorSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUniformBuffers}. */
    public static int nmaxPerStageDescriptorUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorStorageBuffers}. */
    public static int nmaxPerStageDescriptorStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSampledImages}. */
    public static int nmaxPerStageDescriptorSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorStorageImages}. */
    public static int nmaxPerStageDescriptorStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorInputAttachments}. */
    public static int nmaxPerStageDescriptorInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxPerStageResources}. */
    public static int nmaxPerStageResources(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGERESOURCES); }
    /** Unsafe version of {@link #maxDescriptorSetSamplers}. */
    public static int nmaxDescriptorSetSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLERS); }
    /** Unsafe version of {@link #maxDescriptorSetUniformBuffers}. */
    public static int nmaxDescriptorSetUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetUniformBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetStorageBuffers}. */
    public static int nmaxDescriptorSetStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetStorageBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetSampledImages}. */
    public static int nmaxDescriptorSetSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetStorageImages}. */
    public static int nmaxDescriptorSetStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetInputAttachments}. */
    public static int nmaxDescriptorSetInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxVertexInputAttributes}. */
    public static int nmaxVertexInputAttributes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTES); }
    /** Unsafe version of {@link #maxVertexInputBindings}. */
    public static int nmaxVertexInputBindings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGS); }
    /** Unsafe version of {@link #maxVertexInputAttributeOffset}. */
    public static int nmaxVertexInputAttributeOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTEOFFSET); }
    /** Unsafe version of {@link #maxVertexInputBindingStride}. */
    public static int nmaxVertexInputBindingStride(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGSTRIDE); }
    /** Unsafe version of {@link #maxVertexOutputComponents}. */
    public static int nmaxVertexOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationGenerationLevel}. */
    public static int nmaxTessellationGenerationLevel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONGENERATIONLEVEL); }
    /** Unsafe version of {@link #maxTessellationPatchSize}. */
    public static int nmaxTessellationPatchSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONPATCHSIZE); }
    /** Unsafe version of {@link #maxTessellationControlPerVertexInputComponents}. */
    public static int nmaxTessellationControlPerVertexInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlPerVertexOutputComponents}. */
    public static int nmaxTessellationControlPerVertexOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlPerPatchOutputComponents}. */
    public static int nmaxTessellationControlPerPatchOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlTotalOutputComponents}. */
    public static int nmaxTessellationControlTotalOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationEvaluationInputComponents}. */
    public static int nmaxTessellationEvaluationInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationEvaluationOutputComponents}. */
    public static int nmaxTessellationEvaluationOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryShaderInvocations}. */
    public static int nmaxGeometryShaderInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYSHADERINVOCATIONS); }
    /** Unsafe version of {@link #maxGeometryInputComponents}. */
    public static int nmaxGeometryInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryOutputComponents}. */
    public static int nmaxGeometryOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryOutputVertices}. */
    public static int nmaxGeometryOutputVertices(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTVERTICES); }
    /** Unsafe version of {@link #maxGeometryTotalOutputComponents}. */
    public static int nmaxGeometryTotalOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYTOTALOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxFragmentInputComponents}. */
    public static int nmaxFragmentInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxFragmentOutputAttachments}. */
    public static int nmaxFragmentOutputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTOUTPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxFragmentDualSrcAttachments}. */
    public static int nmaxFragmentDualSrcAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTDUALSRCATTACHMENTS); }
    /** Unsafe version of {@link #maxFragmentCombinedOutputResources}. */
    public static int nmaxFragmentCombinedOutputResources(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTCOMBINEDOUTPUTRESOURCES); }
    /** Unsafe version of {@link #maxComputeSharedMemorySize}. */
    public static int nmaxComputeSharedMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTESHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxComputeWorkGroupCount}. */
    public static IntBuffer nmaxComputeWorkGroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxComputeWorkGroupCount(int) maxComputeWorkGroupCount}. */
    public static int nmaxComputeWorkGroupCount(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxComputeWorkGroupInvocations}. */
    public static int nmaxComputeWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxComputeWorkGroupSize}. */
    public static IntBuffer nmaxComputeWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxComputeWorkGroupSize(int) maxComputeWorkGroupSize}. */
    public static int nmaxComputeWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #subPixelPrecisionBits}. */
    public static int nsubPixelPrecisionBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SUBPIXELPRECISIONBITS); }
    /** Unsafe version of {@link #subTexelPrecisionBits}. */
    public static int nsubTexelPrecisionBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SUBTEXELPRECISIONBITS); }
    /** Unsafe version of {@link #mipmapPrecisionBits}. */
    public static int nmipmapPrecisionBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MIPMAPPRECISIONBITS); }
    /** Unsafe version of {@link #maxDrawIndexedIndexValue}. */
    public static int nmaxDrawIndexedIndexValue(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDRAWINDEXEDINDEXVALUE); }
    /** Unsafe version of {@link #maxDrawIndirectCount}. */
    public static int nmaxDrawIndirectCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDRAWINDIRECTCOUNT); }
    /** Unsafe version of {@link #maxSamplerLodBias}. */
    public static float nmaxSamplerLodBias(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MAXSAMPLERLODBIAS); }
    /** Unsafe version of {@link #maxSamplerAnisotropy}. */
    public static float nmaxSamplerAnisotropy(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MAXSAMPLERANISOTROPY); }
    /** Unsafe version of {@link #maxViewports}. */
    public static int nmaxViewports(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVIEWPORTS); }
    /** Unsafe version of {@link #maxViewportDimensions}. */
    public static IntBuffer nmaxViewportDimensions(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS, 2); }
    /** Unsafe version of {@link #maxViewportDimensions(int) maxViewportDimensions}. */
    public static int nmaxViewportDimensions(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #viewportBoundsRange}. */
    public static FloatBuffer nviewportBoundsRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE, 2); }
    /** Unsafe version of {@link #viewportBoundsRange(int) viewportBoundsRange}. */
    public static float nviewportBoundsRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #viewportSubPixelBits}. */
    public static int nviewportSubPixelBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.VIEWPORTSUBPIXELBITS); }
    /** Unsafe version of {@link #minMemoryMapAlignment}. */
    public static long nminMemoryMapAlignment(long struct) { return memGetAddress(struct + VkPhysicalDeviceLimits.MINMEMORYMAPALIGNMENT); }
    /** Unsafe version of {@link #minTexelBufferOffsetAlignment}. */
    public static long nminTexelBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.MINTEXELBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minUniformBufferOffsetAlignment}. */
    public static long nminUniformBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.MINUNIFORMBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minStorageBufferOffsetAlignment}. */
    public static long nminStorageBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.MINSTORAGEBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minTexelOffset}. */
    public static int nminTexelOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MINTEXELOFFSET); }
    /** Unsafe version of {@link #maxTexelOffset}. */
    public static int nmaxTexelOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTEXELOFFSET); }
    /** Unsafe version of {@link #minTexelGatherOffset}. */
    public static int nminTexelGatherOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MINTEXELGATHEROFFSET); }
    /** Unsafe version of {@link #maxTexelGatherOffset}. */
    public static int nmaxTexelGatherOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTEXELGATHEROFFSET); }
    /** Unsafe version of {@link #minInterpolationOffset}. */
    public static float nminInterpolationOffset(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MININTERPOLATIONOFFSET); }
    /** Unsafe version of {@link #maxInterpolationOffset}. */
    public static float nmaxInterpolationOffset(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MAXINTERPOLATIONOFFSET); }
    /** Unsafe version of {@link #subPixelInterpolationOffsetBits}. */
    public static int nsubPixelInterpolationOffsetBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SUBPIXELINTERPOLATIONOFFSETBITS); }
    /** Unsafe version of {@link #maxFramebufferWidth}. */
    public static int nmaxFramebufferWidth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERWIDTH); }
    /** Unsafe version of {@link #maxFramebufferHeight}. */
    public static int nmaxFramebufferHeight(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERHEIGHT); }
    /** Unsafe version of {@link #maxFramebufferLayers}. */
    public static int nmaxFramebufferLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERLAYERS); }
    /** Unsafe version of {@link #framebufferColorSampleCounts}. */
    public static int nframebufferColorSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERCOLORSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferDepthSampleCounts}. */
    public static int nframebufferDepthSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERDEPTHSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferStencilSampleCounts}. */
    public static int nframebufferStencilSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERSTENCILSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferNoAttachmentsSampleCounts}. */
    public static int nframebufferNoAttachmentsSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS); }
    /** Unsafe version of {@link #maxColorAttachments}. */
    public static int nmaxColorAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOLORATTACHMENTS); }
    /** Unsafe version of {@link #sampledImageColorSampleCounts}. */
    public static int nsampledImageColorSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGECOLORSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageIntegerSampleCounts}. */
    public static int nsampledImageIntegerSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGEINTEGERSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageDepthSampleCounts}. */
    public static int nsampledImageDepthSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGEDEPTHSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageStencilSampleCounts}. */
    public static int nsampledImageStencilSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGESTENCILSAMPLECOUNTS); }
    /** Unsafe version of {@link #storageImageSampleCounts}. */
    public static int nstorageImageSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.STORAGEIMAGESAMPLECOUNTS); }
    /** Unsafe version of {@link #maxSampleMaskWords}. */
    public static int nmaxSampleMaskWords(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXSAMPLEMASKWORDS); }
    /** Unsafe version of {@link #timestampComputeAndGraphics}. */
    public static int ntimestampComputeAndGraphics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.TIMESTAMPCOMPUTEANDGRAPHICS); }
    /** Unsafe version of {@link #timestampPeriod}. */
    public static float ntimestampPeriod(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.TIMESTAMPPERIOD); }
    /** Unsafe version of {@link #maxClipDistances}. */
    public static int nmaxClipDistances(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCLIPDISTANCES); }
    /** Unsafe version of {@link #maxCullDistances}. */
    public static int nmaxCullDistances(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCULLDISTANCES); }
    /** Unsafe version of {@link #maxCombinedClipAndCullDistances}. */
    public static int nmaxCombinedClipAndCullDistances(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMBINEDCLIPANDCULLDISTANCES); }
    /** Unsafe version of {@link #discreteQueuePriorities}. */
    public static int ndiscreteQueuePriorities(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.DISCRETEQUEUEPRIORITIES); }
    /** Unsafe version of {@link #pointSizeRange}. */
    public static FloatBuffer npointSizeRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.POINTSIZERANGE, 2); }
    /** Unsafe version of {@link #pointSizeRange(int) pointSizeRange}. */
    public static float npointSizeRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.POINTSIZERANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #lineWidthRange}. */
    public static FloatBuffer nlineWidthRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.LINEWIDTHRANGE, 2); }
    /** Unsafe version of {@link #lineWidthRange(int) lineWidthRange}. */
    public static float nlineWidthRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.LINEWIDTHRANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #pointSizeGranularity}. */
    public static float npointSizeGranularity(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.POINTSIZEGRANULARITY); }
    /** Unsafe version of {@link #lineWidthGranularity}. */
    public static float nlineWidthGranularity(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.LINEWIDTHGRANULARITY); }
    /** Unsafe version of {@link #strictLines}. */
    public static int nstrictLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.STRICTLINES); }
    /** Unsafe version of {@link #standardSampleLocations}. */
    public static int nstandardSampleLocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.STANDARDSAMPLELOCATIONS); }
    /** Unsafe version of {@link #optimalBufferCopyOffsetAlignment}. */
    public static long noptimalBufferCopyOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYOFFSETALIGNMENT); }
    /** Unsafe version of {@link #optimalBufferCopyRowPitchAlignment}. */
    public static long noptimalBufferCopyRowPitchAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYROWPITCHALIGNMENT); }
    /** Unsafe version of {@link #nonCoherentAtomSize}. */
    public static long nnonCoherentAtomSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.NONCOHERENTATOMSIZE); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLimits} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLimits, Buffer> {

        private static final VkPhysicalDeviceLimits ELEMENT_FACTORY = VkPhysicalDeviceLimits.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLimits.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLimits#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code maxImageDimension1D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension1D() { return VkPhysicalDeviceLimits.nmaxImageDimension1D(address()); }
        /** Returns the value of the {@code maxImageDimension2D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension2D() { return VkPhysicalDeviceLimits.nmaxImageDimension2D(address()); }
        /** Returns the value of the {@code maxImageDimension3D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension3D() { return VkPhysicalDeviceLimits.nmaxImageDimension3D(address()); }
        /** Returns the value of the {@code maxImageDimensionCube} field. */
        @NativeType("uint32_t")
        public int maxImageDimensionCube() { return VkPhysicalDeviceLimits.nmaxImageDimensionCube(address()); }
        /** Returns the value of the {@code maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkPhysicalDeviceLimits.nmaxImageArrayLayers(address()); }
        /** Returns the value of the {@code maxTexelBufferElements} field. */
        @NativeType("uint32_t")
        public int maxTexelBufferElements() { return VkPhysicalDeviceLimits.nmaxTexelBufferElements(address()); }
        /** Returns the value of the {@code maxUniformBufferRange} field. */
        @NativeType("uint32_t")
        public int maxUniformBufferRange() { return VkPhysicalDeviceLimits.nmaxUniformBufferRange(address()); }
        /** Returns the value of the {@code maxStorageBufferRange} field. */
        @NativeType("uint32_t")
        public int maxStorageBufferRange() { return VkPhysicalDeviceLimits.nmaxStorageBufferRange(address()); }
        /** Returns the value of the {@code maxPushConstantsSize} field. */
        @NativeType("uint32_t")
        public int maxPushConstantsSize() { return VkPhysicalDeviceLimits.nmaxPushConstantsSize(address()); }
        /** Returns the value of the {@code maxMemoryAllocationCount} field. */
        @NativeType("uint32_t")
        public int maxMemoryAllocationCount() { return VkPhysicalDeviceLimits.nmaxMemoryAllocationCount(address()); }
        /** Returns the value of the {@code maxSamplerAllocationCount} field. */
        @NativeType("uint32_t")
        public int maxSamplerAllocationCount() { return VkPhysicalDeviceLimits.nmaxSamplerAllocationCount(address()); }
        /** Returns the value of the {@code bufferImageGranularity} field. */
        @NativeType("VkDeviceSize")
        public long bufferImageGranularity() { return VkPhysicalDeviceLimits.nbufferImageGranularity(address()); }
        /** Returns the value of the {@code sparseAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long sparseAddressSpaceSize() { return VkPhysicalDeviceLimits.nsparseAddressSpaceSize(address()); }
        /** Returns the value of the {@code maxBoundDescriptorSets} field. */
        @NativeType("uint32_t")
        public int maxBoundDescriptorSets() { return VkPhysicalDeviceLimits.nmaxBoundDescriptorSets(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorSamplers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSamplers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSamplers(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUniformBuffers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorUniformBuffers(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageBuffers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageBuffers(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorSampledImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSampledImages() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSampledImages(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorStorageImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageImages() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageImages(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInputAttachments() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorInputAttachments(address()); }
        /** Returns the value of the {@code maxPerStageResources} field. */
        @NativeType("uint32_t")
        public int maxPerStageResources() { return VkPhysicalDeviceLimits.nmaxPerStageResources(address()); }
        /** Returns the value of the {@code maxDescriptorSetSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSamplers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetSamplers(address()); }
        /** Returns the value of the {@code maxDescriptorSetUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffers(address()); }
        /** Returns the value of the {@code maxDescriptorSetUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffersDynamic() { return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffersDynamic(address()); }
        /** Returns the value of the {@code maxDescriptorSetStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffers(address()); }
        /** Returns the value of the {@code maxDescriptorSetStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffersDynamic() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffersDynamic(address()); }
        /** Returns the value of the {@code maxDescriptorSetSampledImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSampledImages() { return VkPhysicalDeviceLimits.nmaxDescriptorSetSampledImages(address()); }
        /** Returns the value of the {@code maxDescriptorSetStorageImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageImages() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageImages(address()); }
        /** Returns the value of the {@code maxDescriptorSetInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInputAttachments() { return VkPhysicalDeviceLimits.nmaxDescriptorSetInputAttachments(address()); }
        /** Returns the value of the {@code maxVertexInputAttributes} field. */
        @NativeType("uint32_t")
        public int maxVertexInputAttributes() { return VkPhysicalDeviceLimits.nmaxVertexInputAttributes(address()); }
        /** Returns the value of the {@code maxVertexInputBindings} field. */
        @NativeType("uint32_t")
        public int maxVertexInputBindings() { return VkPhysicalDeviceLimits.nmaxVertexInputBindings(address()); }
        /** Returns the value of the {@code maxVertexInputAttributeOffset} field. */
        @NativeType("uint32_t")
        public int maxVertexInputAttributeOffset() { return VkPhysicalDeviceLimits.nmaxVertexInputAttributeOffset(address()); }
        /** Returns the value of the {@code maxVertexInputBindingStride} field. */
        @NativeType("uint32_t")
        public int maxVertexInputBindingStride() { return VkPhysicalDeviceLimits.nmaxVertexInputBindingStride(address()); }
        /** Returns the value of the {@code maxVertexOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxVertexOutputComponents() { return VkPhysicalDeviceLimits.nmaxVertexOutputComponents(address()); }
        /** Returns the value of the {@code maxTessellationGenerationLevel} field. */
        @NativeType("uint32_t")
        public int maxTessellationGenerationLevel() { return VkPhysicalDeviceLimits.nmaxTessellationGenerationLevel(address()); }
        /** Returns the value of the {@code maxTessellationPatchSize} field. */
        @NativeType("uint32_t")
        public int maxTessellationPatchSize() { return VkPhysicalDeviceLimits.nmaxTessellationPatchSize(address()); }
        /** Returns the value of the {@code maxTessellationControlPerVertexInputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexInputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexInputComponents(address()); }
        /** Returns the value of the {@code maxTessellationControlPerVertexOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexOutputComponents(address()); }
        /** Returns the value of the {@code maxTessellationControlPerPatchOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerPatchOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerPatchOutputComponents(address()); }
        /** Returns the value of the {@code maxTessellationControlTotalOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlTotalOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlTotalOutputComponents(address()); }
        /** Returns the value of the {@code maxTessellationEvaluationInputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationEvaluationInputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationEvaluationInputComponents(address()); }
        /** Returns the value of the {@code maxTessellationEvaluationOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationEvaluationOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationEvaluationOutputComponents(address()); }
        /** Returns the value of the {@code maxGeometryShaderInvocations} field. */
        @NativeType("uint32_t")
        public int maxGeometryShaderInvocations() { return VkPhysicalDeviceLimits.nmaxGeometryShaderInvocations(address()); }
        /** Returns the value of the {@code maxGeometryInputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryInputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryInputComponents(address()); }
        /** Returns the value of the {@code maxGeometryOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryOutputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryOutputComponents(address()); }
        /** Returns the value of the {@code maxGeometryOutputVertices} field. */
        @NativeType("uint32_t")
        public int maxGeometryOutputVertices() { return VkPhysicalDeviceLimits.nmaxGeometryOutputVertices(address()); }
        /** Returns the value of the {@code maxGeometryTotalOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryTotalOutputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryTotalOutputComponents(address()); }
        /** Returns the value of the {@code maxFragmentInputComponents} field. */
        @NativeType("uint32_t")
        public int maxFragmentInputComponents() { return VkPhysicalDeviceLimits.nmaxFragmentInputComponents(address()); }
        /** Returns the value of the {@code maxFragmentOutputAttachments} field. */
        @NativeType("uint32_t")
        public int maxFragmentOutputAttachments() { return VkPhysicalDeviceLimits.nmaxFragmentOutputAttachments(address()); }
        /** Returns the value of the {@code maxFragmentDualSrcAttachments} field. */
        @NativeType("uint32_t")
        public int maxFragmentDualSrcAttachments() { return VkPhysicalDeviceLimits.nmaxFragmentDualSrcAttachments(address()); }
        /** Returns the value of the {@code maxFragmentCombinedOutputResources} field. */
        @NativeType("uint32_t")
        public int maxFragmentCombinedOutputResources() { return VkPhysicalDeviceLimits.nmaxFragmentCombinedOutputResources(address()); }
        /** Returns the value of the {@code maxComputeSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxComputeSharedMemorySize() { return VkPhysicalDeviceLimits.nmaxComputeSharedMemorySize(address()); }
        /** Returns a {@link IntBuffer} view of the {@code maxComputeWorkGroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupCount() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address()); }
        /** Returns the value at the specified index of the {@code maxComputeWorkGroupCount} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupCount(int index) { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address(), index); }
        /** Returns the value of the {@code maxComputeWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupInvocations() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupInvocations(address()); }
        /** Returns a {@link IntBuffer} view of the {@code maxComputeWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupSize() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address()); }
        /** Returns the value at the specified index of the {@code maxComputeWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupSize(int index) { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address(), index); }
        /** Returns the value of the {@code subPixelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int subPixelPrecisionBits() { return VkPhysicalDeviceLimits.nsubPixelPrecisionBits(address()); }
        /** Returns the value of the {@code subTexelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int subTexelPrecisionBits() { return VkPhysicalDeviceLimits.nsubTexelPrecisionBits(address()); }
        /** Returns the value of the {@code mipmapPrecisionBits} field. */
        @NativeType("uint32_t")
        public int mipmapPrecisionBits() { return VkPhysicalDeviceLimits.nmipmapPrecisionBits(address()); }
        /** Returns the value of the {@code maxDrawIndexedIndexValue} field. */
        @NativeType("uint32_t")
        public int maxDrawIndexedIndexValue() { return VkPhysicalDeviceLimits.nmaxDrawIndexedIndexValue(address()); }
        /** Returns the value of the {@code maxDrawIndirectCount} field. */
        @NativeType("uint32_t")
        public int maxDrawIndirectCount() { return VkPhysicalDeviceLimits.nmaxDrawIndirectCount(address()); }
        /** Returns the value of the {@code maxSamplerLodBias} field. */
        public float maxSamplerLodBias() { return VkPhysicalDeviceLimits.nmaxSamplerLodBias(address()); }
        /** Returns the value of the {@code maxSamplerAnisotropy} field. */
        public float maxSamplerAnisotropy() { return VkPhysicalDeviceLimits.nmaxSamplerAnisotropy(address()); }
        /** Returns the value of the {@code maxViewports} field. */
        @NativeType("uint32_t")
        public int maxViewports() { return VkPhysicalDeviceLimits.nmaxViewports(address()); }
        /** Returns a {@link IntBuffer} view of the {@code maxViewportDimensions} field. */
        @NativeType("uint32_t[2]")
        public IntBuffer maxViewportDimensions() { return VkPhysicalDeviceLimits.nmaxViewportDimensions(address()); }
        /** Returns the value at the specified index of the {@code maxViewportDimensions} field. */
        @NativeType("uint32_t")
        public int maxViewportDimensions(int index) { return VkPhysicalDeviceLimits.nmaxViewportDimensions(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code viewportBoundsRange} field. */
        @NativeType("float[2]")
        public FloatBuffer viewportBoundsRange() { return VkPhysicalDeviceLimits.nviewportBoundsRange(address()); }
        /** Returns the value at the specified index of the {@code viewportBoundsRange} field. */
        public float viewportBoundsRange(int index) { return VkPhysicalDeviceLimits.nviewportBoundsRange(address(), index); }
        /** Returns the value of the {@code viewportSubPixelBits} field. */
        @NativeType("uint32_t")
        public int viewportSubPixelBits() { return VkPhysicalDeviceLimits.nviewportSubPixelBits(address()); }
        /** Returns the value of the {@code minMemoryMapAlignment} field. */
        @NativeType("size_t")
        public long minMemoryMapAlignment() { return VkPhysicalDeviceLimits.nminMemoryMapAlignment(address()); }
        /** Returns the value of the {@code minTexelBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minTexelBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminTexelBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minUniformBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minUniformBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminUniformBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minStorageBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minStorageBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminStorageBufferOffsetAlignment(address()); }
        /** Returns the value of the {@code minTexelOffset} field. */
        @NativeType("int32_t")
        public int minTexelOffset() { return VkPhysicalDeviceLimits.nminTexelOffset(address()); }
        /** Returns the value of the {@code maxTexelOffset} field. */
        @NativeType("uint32_t")
        public int maxTexelOffset() { return VkPhysicalDeviceLimits.nmaxTexelOffset(address()); }
        /** Returns the value of the {@code minTexelGatherOffset} field. */
        @NativeType("int32_t")
        public int minTexelGatherOffset() { return VkPhysicalDeviceLimits.nminTexelGatherOffset(address()); }
        /** Returns the value of the {@code maxTexelGatherOffset} field. */
        @NativeType("uint32_t")
        public int maxTexelGatherOffset() { return VkPhysicalDeviceLimits.nmaxTexelGatherOffset(address()); }
        /** Returns the value of the {@code minInterpolationOffset} field. */
        public float minInterpolationOffset() { return VkPhysicalDeviceLimits.nminInterpolationOffset(address()); }
        /** Returns the value of the {@code maxInterpolationOffset} field. */
        public float maxInterpolationOffset() { return VkPhysicalDeviceLimits.nmaxInterpolationOffset(address()); }
        /** Returns the value of the {@code subPixelInterpolationOffsetBits} field. */
        @NativeType("uint32_t")
        public int subPixelInterpolationOffsetBits() { return VkPhysicalDeviceLimits.nsubPixelInterpolationOffsetBits(address()); }
        /** Returns the value of the {@code maxFramebufferWidth} field. */
        @NativeType("uint32_t")
        public int maxFramebufferWidth() { return VkPhysicalDeviceLimits.nmaxFramebufferWidth(address()); }
        /** Returns the value of the {@code maxFramebufferHeight} field. */
        @NativeType("uint32_t")
        public int maxFramebufferHeight() { return VkPhysicalDeviceLimits.nmaxFramebufferHeight(address()); }
        /** Returns the value of the {@code maxFramebufferLayers} field. */
        @NativeType("uint32_t")
        public int maxFramebufferLayers() { return VkPhysicalDeviceLimits.nmaxFramebufferLayers(address()); }
        /** Returns the value of the {@code framebufferColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferColorSampleCounts() { return VkPhysicalDeviceLimits.nframebufferColorSampleCounts(address()); }
        /** Returns the value of the {@code framebufferDepthSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferDepthSampleCounts() { return VkPhysicalDeviceLimits.nframebufferDepthSampleCounts(address()); }
        /** Returns the value of the {@code framebufferStencilSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferStencilSampleCounts() { return VkPhysicalDeviceLimits.nframebufferStencilSampleCounts(address()); }
        /** Returns the value of the {@code framebufferNoAttachmentsSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferNoAttachmentsSampleCounts() { return VkPhysicalDeviceLimits.nframebufferNoAttachmentsSampleCounts(address()); }
        /** Returns the value of the {@code maxColorAttachments} field. */
        @NativeType("uint32_t")
        public int maxColorAttachments() { return VkPhysicalDeviceLimits.nmaxColorAttachments(address()); }
        /** Returns the value of the {@code sampledImageColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageColorSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageColorSampleCounts(address()); }
        /** Returns the value of the {@code sampledImageIntegerSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageIntegerSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageIntegerSampleCounts(address()); }
        /** Returns the value of the {@code sampledImageDepthSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageDepthSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageDepthSampleCounts(address()); }
        /** Returns the value of the {@code sampledImageStencilSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageStencilSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageStencilSampleCounts(address()); }
        /** Returns the value of the {@code storageImageSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int storageImageSampleCounts() { return VkPhysicalDeviceLimits.nstorageImageSampleCounts(address()); }
        /** Returns the value of the {@code maxSampleMaskWords} field. */
        @NativeType("uint32_t")
        public int maxSampleMaskWords() { return VkPhysicalDeviceLimits.nmaxSampleMaskWords(address()); }
        /** Returns the value of the {@code timestampComputeAndGraphics} field. */
        @NativeType("VkBool32")
        public boolean timestampComputeAndGraphics() { return VkPhysicalDeviceLimits.ntimestampComputeAndGraphics(address()) != 0; }
        /** Returns the value of the {@code timestampPeriod} field. */
        public float timestampPeriod() { return VkPhysicalDeviceLimits.ntimestampPeriod(address()); }
        /** Returns the value of the {@code maxClipDistances} field. */
        @NativeType("uint32_t")
        public int maxClipDistances() { return VkPhysicalDeviceLimits.nmaxClipDistances(address()); }
        /** Returns the value of the {@code maxCullDistances} field. */
        @NativeType("uint32_t")
        public int maxCullDistances() { return VkPhysicalDeviceLimits.nmaxCullDistances(address()); }
        /** Returns the value of the {@code maxCombinedClipAndCullDistances} field. */
        @NativeType("uint32_t")
        public int maxCombinedClipAndCullDistances() { return VkPhysicalDeviceLimits.nmaxCombinedClipAndCullDistances(address()); }
        /** Returns the value of the {@code discreteQueuePriorities} field. */
        @NativeType("uint32_t")
        public int discreteQueuePriorities() { return VkPhysicalDeviceLimits.ndiscreteQueuePriorities(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code pointSizeRange} field. */
        @NativeType("float[2]")
        public FloatBuffer pointSizeRange() { return VkPhysicalDeviceLimits.npointSizeRange(address()); }
        /** Returns the value at the specified index of the {@code pointSizeRange} field. */
        public float pointSizeRange(int index) { return VkPhysicalDeviceLimits.npointSizeRange(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code lineWidthRange} field. */
        @NativeType("float[2]")
        public FloatBuffer lineWidthRange() { return VkPhysicalDeviceLimits.nlineWidthRange(address()); }
        /** Returns the value at the specified index of the {@code lineWidthRange} field. */
        public float lineWidthRange(int index) { return VkPhysicalDeviceLimits.nlineWidthRange(address(), index); }
        /** Returns the value of the {@code pointSizeGranularity} field. */
        public float pointSizeGranularity() { return VkPhysicalDeviceLimits.npointSizeGranularity(address()); }
        /** Returns the value of the {@code lineWidthGranularity} field. */
        public float lineWidthGranularity() { return VkPhysicalDeviceLimits.nlineWidthGranularity(address()); }
        /** Returns the value of the {@code strictLines} field. */
        @NativeType("VkBool32")
        public boolean strictLines() { return VkPhysicalDeviceLimits.nstrictLines(address()) != 0; }
        /** Returns the value of the {@code standardSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean standardSampleLocations() { return VkPhysicalDeviceLimits.nstandardSampleLocations(address()) != 0; }
        /** Returns the value of the {@code optimalBufferCopyOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long optimalBufferCopyOffsetAlignment() { return VkPhysicalDeviceLimits.noptimalBufferCopyOffsetAlignment(address()); }
        /** Returns the value of the {@code optimalBufferCopyRowPitchAlignment} field. */
        @NativeType("VkDeviceSize")
        public long optimalBufferCopyRowPitchAlignment() { return VkPhysicalDeviceLimits.noptimalBufferCopyRowPitchAlignment(address()); }
        /** Returns the value of the {@code nonCoherentAtomSize} field. */
        @NativeType("VkDeviceSize")
        public long nonCoherentAtomSize() { return VkPhysicalDeviceLimits.nnonCoherentAtomSize(address()); }

    }

}