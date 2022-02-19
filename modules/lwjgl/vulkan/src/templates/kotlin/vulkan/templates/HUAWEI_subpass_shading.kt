/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val HUAWEI_subpass_shading = "HUAWEISubpassShading".nativeClassVK("HUAWEI_subpass_shading", type = "device", postfix = "HUAWEI") {
    documentation =
        """
        This extension allows applications to execute a subpass shading pipeline in a subpass of a render pass in order to save memory bandwidth for algorithms like tile-based deferred rendering and forward plus. A subpass shading pipeline is a pipeline with the compute pipeline ability, allowed to read values from input attachments, and only allowed to be dispatched inside a stand-alone subpass. Its work dimension is defined by the render pass’s render area size. Its workgroup size (width, height) shall be a power-of-two number in width or height, with minimum value from 8, and maximum value shall be decided from the render pass attachments and sample counts but depends on implementation.

        The {@code GlobalInvocationId.xy} of a subpass shading pipeline is equal to the {@code FragCoord.xy} of a graphic pipeline in the same render pass subtracted the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkRect2D">{@code offset}</a> of the ##VkRenderPassBeginInfo{@code ::renderArea}. {@code GlobalInvocationId.z} is mapped to the Layer if {@link EXTShaderViewportIndexLayer VK_EXT_shader_viewport_index_layer} is supported. The {@code GlobalInvocationId.xy} is equal to the index of the local workgroup multiplied by the size of the local workgroup plus the {@code LocalInvocationId} and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkRect2D">{@code offset}</a> of the ##VkRenderPassBeginInfo{@code ::renderArea}.

        This extension allows a subpass’s pipeline bind point to be #PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI.

        <h5>Sample Code</h5>
        Example of subpass shading in a GLSL shader

        <pre><code>
￿\#extension GL_HUAWEI_subpass_shading: enable
￿\#extension GL_KHR_shader_subgroup_arithmetic: enable
￿
￿layout(constant_id = 0) const uint tileWidth = 8;
￿layout(constant_id = 1) const uint tileHeight = 8;
￿layout(local_size_x_id = 0, local_size_y_id = 1, local_size_z = 1) in;
￿layout (set=0, binding=0, input_attachment_index=0) uniform subpassInput depth;
￿
￿void main()
￿{
￿  float d = subpassLoad(depth).x;
￿  float minD = subgroupMin(d);
￿  float maxD = subgroupMax(d);
￿}</code></pre>

        Example of subpass shading dispatching in a subpass

        <pre><code>
￿vkCmdNextSubpass(commandBuffer, VK_SUBPASS_CONTENTS_INLINE);
￿vkCmdBindPipeline(commandBuffer, VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI, subpassShadingPipeline);
￿vkCmdBindDescriptorSets(commandBuffer, VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI, subpassShadingPipelineLayout,
￿  firstSet, descriptorSetCount, pDescriptorSets, dynamicOffsetCount, pDynamicOffsets);
￿vkCmdSubpassShadingHUAWEI(commandBuffer)
￿vkCmdEndRenderPass(commandBuffer);</code></pre>

        Example of subpass shading render pass creation

        <pre><code>
￿VkAttachmentDescription2 attachments[] = {
￿  {
￿    VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2, NULL,
￿    0, VK_FORMAT_R8G8B8A8_UNORM, VK_SAMPLE_COUNT_1_BIT,
￿    VK_ATTACHMENT_LOAD_OP_CLEAR, VK_ATTACHMENT_STORE_OP_DONT_CARE,
￿    VK_ATTACHMENT_LOAD_OP_DONT_CARE, VK_ATTACHMENT_LOAD_OP_DONT_CARE,
￿    VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2, NULL,
￿    0, VK_FORMAT_R8G8B8A8_UNORM, VK_SAMPLE_COUNT_1_BIT,
￿    VK_ATTACHMENT_LOAD_OP_CLEAR, VK_ATTACHMENT_STORE_OP_DONT_CARE,
￿    VK_ATTACHMENT_LOAD_OP_DONT_CARE, VK_ATTACHMENT_LOAD_OP_DONT_CARE,
￿    VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2, NULL,
￿    0, VK_FORMAT_R8G8B8A8_UNORM, VK_SAMPLE_COUNT_1_BIT,
￿    VK_ATTACHMENT_LOAD_OP_CLEAR, VK_ATTACHMENT_STORE_OP_DONT_CARE,
￿    VK_ATTACHMENT_LOAD_OP_DONT_CARE, VK_ATTACHMENT_LOAD_OP_DONT_CARE,
￿    VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2, NULL,
￿    0, VK_FORMAT_D24_UNORM_S8_UINT, VK_SAMPLE_COUNT_1_BIT,
￿    VK_ATTACHMENT_LOAD_OP_CLEAR, VK_ATTACHMENT_STORE_OP_DONT_CARE,
￿    VK_ATTACHMENT_LOAD_OP_CLEAR, VK_ATTACHMENT_LOAD_OP_DONT_CARE,
￿    VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL, VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2, NULL,
￿    0, VK_FORMAT_R8G8B8A8_UNORM, VK_SAMPLE_COUNT_1_BIT,
￿    VK_ATTACHMENT_LOAD_OP_CLEAR, VK_ATTACHMENT_STORE_OP_STORE,
￿    VK_ATTACHMENT_LOAD_OP_DONT_CARE, VK_ATTACHMENT_LOAD_OP_DONT_CARE,
￿    VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL
￿  }
￿};
￿
￿VkAttachmentReference2 gBufferAttachmentReferences[] = {
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 0, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT },
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 1, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT },
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 2, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT }
￿};
￿VkAttachmentReference2 gBufferDepthStencilAttachmentReferences =
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 3, VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_DEPTH_BIT|VK_IMAGE_ASPECT_STENCIL_BIT };
￿VkAttachmentReference2 depthInputAttachmentReferences[] = {
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 3, VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, VK_IMAGE_ASPECT_DEPTH_BIT|VK_IMAGE_ASPECT_STENCIL_BIT };
￿};
￿VkAttachmentReference2 preserveAttachmentReferences[] = {
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 0, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT },
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 1, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT },
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 2, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT },
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 3, VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_DEPTH_BIT|VK_IMAGE_ASPECT_STENCIL_BIT }
￿}; // G buffer including depth/stencil
￿VkAttachmentReference2 colorAttachmentReferences[] = {
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 4, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT }
￿};
￿VkAttachmentReference2 resolveAttachmentReference =
￿  { VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2, NULL, 4, VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL, VK_IMAGE_ASPECT_COLOR_BIT };
￿
￿VkSubpassDescription2 subpasses[] = {
￿  {
￿    VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2, NULL, 0, VK_PIPELINE_BIND_POINT_GRAPHICS, 0,
￿    0, NULL, // input
￿    sizeof(gBufferAttachmentReferences)/sizeof(gBufferAttachmentReferences[0]), gBufferAttachmentReferences, // color
￿    NULL, &amp;gBufferDepthStencilAttachmentReferences, // resolve &amp; DS
￿    0, NULL
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2, NULL, 0, VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI , 0,
￿    sizeof(depthInputAttachmentReferences)/sizeof(depthInputAttachmentReferences[0]), depthInputAttachmentReferences, // input
￿    0, NULL, // color
￿    NULL, NULL, // resolve &amp; DS
￿    sizeof(preserveAttachmentReferences)/sizeof(preserveAttachmentReferences[0]), preserveAttachmentReferences,
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2, NULL, 0, VK_PIPELINE_BIND_POINT_GRAPHICS, 0,
￿    sizeof(gBufferAttachmentReferences)/sizeof(gBufferAttachmentReferences[0]), gBufferAttachmentReferences, // input
￿    sizeof(colorAttachmentReferences)/sizeof(colorAttachmentReferences[0]), colorAttachmentReferences, // color
￿    &amp;resolveAttachmentReference, &amp;gBufferDepthStencilAttachmentReferences, // resolve &amp; DS
￿    0, NULL
￿  },
￿};
￿
￿VkMemoryBarrier2KHR fragmentToSubpassShading = {
￿  VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR, NULL,
￿  VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT|VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT,
￿  VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI, VK_ACCESS_INPUT_ATTACHMENT_READ_BIT
￿};
￿
￿VkMemoryBarrier2KHR subpassShadingToFragment = {
￿  VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR, NULL,
￿  VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI, VK_ACCESS_SHADER_WRITE_BIT,
￿  VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR, VK_ACCESS_SHADER_READ_BIT
￿};
￿
￿VkSubpassDependency2 dependencies[] = {
￿  {
￿    VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2, &amp;fragmentToSubpassShading,
￿    0, 1,
￿    0, 0, 0, 0,
￿    0, 0
￿  },
￿  {
￿    VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2, &amp;subpassShadingToFragment,
￿    1, 2,
￿    0, 0, 0, 0,
￿    0, 0
￿  },
￿};
￿
￿VkRenderPassCreateInfo2 renderPassCreateInfo = {
￿  VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2, NULL, 0,
￿    sizeof(attachments)/sizeof(attachments[0]), attachments,
￿    sizeof(subpasses)/sizeof(subpasses[0]), subpasses,
￿    sizeof(dependencies)/sizeof(dependencies[0]), dependencies,
￿    0, NULL
￿};
￿VKRenderPass renderPass;
￿vkCreateRenderPass2(device, &amp;renderPassCreateInfo, NULL, &amp;renderPass);</code></pre>

        Example of subpass shading pipeline creation

        <pre><code>
￿VkExtent2D maxWorkgroupSize;
￿
￿VkSpecializationMapEntry subpassShadingConstantMapEntries[] = {
￿  { 0, 0 * sizeof(uint32_t), sizeof(uint32_t) },
￿  { 1, 1 * sizeof(uint32_t), sizeof(uint32_t) }
￿};
￿
￿VkSpecializationInfo subpassShadingConstants = {
￿  2, subpassShadingConstantMapEntries,
￿  sizeof(VkExtent2D), &amp;maxWorkgroupSize
￿};
￿
￿VkSubpassShadingPipelineCreateInfoHUAWEI subpassShadingPipelineCreateInfo {
￿  VK_STRUCTURE_TYPE_SUBPASSS_SHADING_PIPELINE_CREATE_INFO_HUAWEI, NULL,
￿  renderPass, 1
￿};
￿
￿VkPipelineShaderStageCreateInfo subpassShadingPipelineStageCreateInfo {
￿  VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO, NULL,
￿  0, VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI,
￿  shaderModule, "main",
￿  &amp;subpassShadingConstants
￿};
￿
￿VkComputePipelineCreateInfo subpassShadingComputePipelineCreateInfo = {
￿  VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO, &amp;subpassShadingPipelineCreateInfo,
￿  0, &amp;subpassShadingPipelineStageCreateInfo,
￿  pipelineLayout, basePipelineHandle, basePipelineIndex
￿};
￿
￿VKPipeline pipeline;
￿
￿vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(device, renderPass, &amp;maxWorkgroupSize);
￿vkCreateComputePipelines(device, pipelineCache, 1, &amp;subpassShadingComputePipelineCreateInfo, NULL, &amp;pipeline);</code></pre>

        <h5>VK_HUAWEI_subpass_shading</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_HUAWEI_subpass_shading}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>370</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
                <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hueilong Wang <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_HUAWEI_subpass_shading]%20@wyvernathuawei%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_HUAWEI_subpass_shading%20extension%3E%3E">wyvernathuawei</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-01</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/HUAWEI/SPV_HUAWEI_subpass_shading.html">{@code SPV_HUAWEI_subpass_shading}</a>.</li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/huawei/GLSL_HUAWEI_subpass_shading.txt">{@code GL_HUAWEI_subpass_shading}</a>.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hueilong Wang</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "HUAWEI_SUBPASS_SHADING_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "HUAWEI_SUBPASS_SHADING_EXTENSION_NAME".."VK_HUAWEI_subpass_shading"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI".."1000369000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI".."1000369001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI".."1000369002"
    )

    EnumConstant(
        "Extends {@code VkPipelineBindPoint}.",

        "PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI".."1000369003"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI".enum(0x8000000000L)
    )

    EnumConstant(
        "Extends {@code VkShaderStageFlagBits}.",

        "SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI".enum(0x00004000)
    )

    VkResult(
        "GetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI",
        """
        Query maximum supported subpass shading workgroup size for a give render pass.

        <h5>C Specification</h5>
        A subpass shading pipeline’s workgroup size is a 2D vector with number of power-of-two in width and height. The maximum number of width and height is implementation dependent, and <b>may</b> vary for different formats and sample counts of attachments in a render pass.

        To query the maximum workgroup size, call:

        <pre><code>
￿VkResult vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
￿    VkDevice                                    device,
￿    VkRenderPass                                renderpass,
￿    VkExtent2D*                                 pMaxWorkgroupSize);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code renderpass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
            <li>{@code pMaxWorkgroupSize} <b>must</b> be a valid pointer to a ##VkExtent2D structure</li>
            <li>{@code renderpass} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExtent2D
        """,

        VkDevice("device", "a handle to a local device object that was used to create the given render pass."),
        VkRenderPass("renderpass", ""),
        VkExtent2D.p("pMaxWorkgroupSize", "a pointer to a ##VkExtent2D structure.")
    )

    void(
        "CmdSubpassShadingHUAWEI",
        """
        Dispatch compute work items.

        <h5>C Specification</h5>
        A subpass shading dispatches a compute pipeline work with the work dimension of render area of the calling subpass and work groups are partitioned by specified work group size. Subpass operations like subpassLoad and subpassLoadMS are allowed to be used.

        To record a subpass shading, call:

        <pre><code>
￿void vkCmdSubpassShadingHUAWEI(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        <h5>Description</h5>
        When the command is executed, a global workgroup consisting of ceil (render area size / local workgroup size) local workgroups is assembled.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is sampled with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-depth-compare-operation">depth comparison</a>, the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE</li>
            <li>Any {@code VkImageView} or {@code VkBufferView} being written as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>Any {@code VkImageView} or {@code VkBufferView} being read as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
            <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set or inherited (if the {@link NVInheritedViewportScissor VK_NV_inherited_viewport_scissor} extension is enabled) for {@code commandBuffer}, and done so after any previously bound pipeline with the corresponding state not specified as dynamic</li>
            <li>There <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
            <li>If a {@code VkImageView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
            <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the #BUFFER_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>This command must be called in a subpass with bind point #PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI. No draw commands can be called in the same subpass. Only one #CmdSubpassShadingHUAWEI() command can be called in a subpass</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded.")
    )
}