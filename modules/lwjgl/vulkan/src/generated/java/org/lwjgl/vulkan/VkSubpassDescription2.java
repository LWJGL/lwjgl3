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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a subpass description.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkSubpassDescription} have the identical effect to those parameters.</p>
 * 
 * <p>{@code viewMask} has the same effect for the described subpass as {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewMasks} has on each corresponding subpass.</p>
 * 
 * <p>If a {@link VkFragmentShadingRateAttachmentInfoKHR} structure is included in the {@code pNext} chain, {@code pFragmentShadingRateAttachment} is not {@code NULL}, and its {@code attachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the identified attachment defines a fragment shading rate attachment for that subpass.</p>
 * 
 * <p>If any element of {@code pResolveAttachments} is an image specified with an {@link VkExternalFormatANDROID}, values in the corresponding color attachment will be resolved to the resolve attachment in the same manner as specified for {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID} ({@code VkResolveModeFlagBits}).</p>
 * 
 * <p>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> limit is {@link VK10#VK_TRUE TRUE}, values in the color attachment will be loaded from the resolve attachment at the start of rendering, and <b>may</b> also be reloaded any time after a resolve occurs or the resolve attachment is written to; if this occurs it <b>must</b> happen-before any writes to the color attachment are performed which happen-after the resolve that triggers this. If any color component in the external format is subsampled, values will be read from the nearest sample in the image when they are loaded. If the color attachment is also used as an input attachment, the same behavior applies.</p>
 * 
 * <p>Setting the color attachment to {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} when an external resolve attachment is used and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> limit is {@link VK10#VK_TRUE TRUE} will not result in color attachment writes to be discarded for that attachment.</p>
 * 
 * <p>When <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> is {@link VK10#VK_TRUE TRUE}, the color output from the subpass can still be read via an input attachment; but the application cannot bind an image view for the color attachment as there is no such image view bound. Instead to access the data as an input attachment applications <b>can</b> use the resolve attachment in its place - using the resolve attachment image for the descriptor, and setting the corresponding element of {@code pInputAttachments} to the index of the resolve attachment.</p>
 * 
 * <p>Loads or input attachment reads from the resolve attachment are performed as if using a {@link VkSamplerYcbcrConversionCreateInfo} with the following parameters:</p>
 * 
 * <pre><code>
 * VkSamplerYcbcrConversionCreateInfo createInfo = {
 *     .sType = VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO,
 *     .pNext = NULL,
 *     .format = VK_FORMAT_UNDEFINED,
 *     .ycbcrModel = VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY,
 *     .ycbcrRange = VK_SAMPLER_YCBCR_RANGE_ITU_FULL,
 *     .components = {
 *         .r = VK_COMPONENT_SWIZZLE_B
 *         .g = VK_COMPONENT_SWIZZLE_R
 *         .b = VK_COMPONENT_SWIZZLE_G
 *         .a = VK_COMPONENT_SWIZZLE_IDENTITY},
 *     .xChromaOffset = properties.chromaOffsetX,
 *     .yChromaOffset = properties.chromaOffsetY,
 *     .chromaFilter = VK_FILTER_NEAREST,
 *     .forceExplicitReconstruction = ... };</code></pre>
 * 
 * <p>where {@code properties} is equal to {@link VkPhysicalDeviceExternalFormatResolvePropertiesANDROID} returned by the device and {@code forceExplicitReconstruction} is effectively ignored as the {@link VK11#VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY} model is used. The applied swizzle is the same effective swizzle that would be applied by the {@link VK11#VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY} model, but no range expansion is applied.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code attachment} member of an element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pColorAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code attachment} member of {@code pDepthStencilAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, ts {@code layout} member <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pColorAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pColorAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code attachment} member of an element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR}</li>
 * <li>If the {@code attachment} member of an element of {@code pColorAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If the {@code attachment} member of an element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, its {@code layout} member <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If the {@code attachment} member of {@code pDepthStencilAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and its {@code pNext} chain includes a {@link VkAttachmentReferenceStencilLayout} structure, the {@code layout} member of {@code pDepthStencilAttachment} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} or {@link HUAWEISubpassShading#VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI}</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxColorAttachments}</li>
 * <li>If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil attachment in the same subpass, then {@code loadOp} <b>must</b> not be {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, each resolve attachment that is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is not enabled and {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the corresponding color attachment <b>must</b> not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> property is {@link VK10#VK_FALSE FALSE} and {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, the corresponding color attachment <b>must</b> not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> property is {@link VK10#VK_TRUE TRUE} and {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, the corresponding color attachment <b>must</b> have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is not enabled and {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the corresponding color attachment <b>must</b> not have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is not enabled, each element of {@code pResolveAttachments} <b>must</b> have the same {@code VkFormat} as its corresponding color attachment</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, all attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have the same sample count</li>
 * <li>All attachments in {@code pInputAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and any of the following is true:
 * 
 * <ul>
 * <li>the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is not enabled</li>
 * <li>the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> property is {@link VK10#VK_FALSE FALSE}</li>
 * <li>does not have a non-zero value of {@link VkExternalFormatANDROID}{@code ::externalFormat}</li>
 * </ul>
 * 
 * <p><b>must</b> have image formats whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> contain at least {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</p>
 * </li>
 * <li>All attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>All attachments in {@code pResolveAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and do not have an image format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} <b>must</b> have image formats whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code pDepthStencilAttachment} is not {@code NULL} and the attachment is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} then it <b>must</b> have an image format whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled and the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, all attachments in {@code pInputAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled and the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, all attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled and the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, all attachments in {@code pResolveAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#potential-format-features">potential format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If either of the following is enabled:
 * 
 * <ul>
 * <li>The {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension</li>
 * <li>The {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension</li>
 * </ul>
 * 
 * <p>all attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count that is smaller than or equal to the sample count of {@code pDepthStencilAttachment} if it is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</p>
 * </li>
 * <li>If the {@code pNext} chain includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then all attachments in {@code pColorAttachments} and {@code pDepthStencilAttachment} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count that is either {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} or equal to {@link VkMultisampledRenderToSingleSampledInfoEXT}{@code ::rasterizationSamples}</li>
 * <li>If the {@code pNext} chain includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, and {@code pDepthStencilAttachment} is not {@code NULL}, does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, and has a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}, the {@code pNext} chain <b>must</b> also include a {@link VkSubpassDescriptionDepthStencilResolve} structure with {@code pDepthStencilResolveAttachment} that is either {@code NULL} or has the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>All attachments in {@code pDepthStencilAttachment} or {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have the same sample count , if none of the following are enabled:
 * 
 * <ul>
 * <li>The {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension</li>
 * <li>The {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension</li>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature,</li>
 * </ul>
 * </li>
 * <li>Each element of {@code pPreserveAttachments} <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>Each element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
 * <li>If any attachment is used by more than one {@link VkAttachmentReference2} member, then each use <b>must</b> use the same {@code layout}</li>
 * <li>If {@code flags} includes {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX}, it <b>must</b> also include {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then the {@code aspectMask} member <b>must</b> be a valid combination of {@code VkImageAspectFlagBits}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then the {@code aspectMask} member <b>must</b> not be 0</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then the {@code aspectMask} member <b>must</b> not include {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then the {@code aspectMask} member <b>must</b> not include <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> for any index <em>i</em></li>
 * <li>An attachment <b>must</b> not be used in both {@code pDepthStencilAttachment} and {@code pColorAttachments}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multiview">{@code multiview}</a> feature is not enabled, {@code viewMask} <b>must</b> be 0</li>
 * <li>The index of the most significant bit in {@code viewMask} <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-maxMultiviewViewCount">{@code maxMultiviewViewCount}</a></li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is enabled, {@code pResolveAttachments} is not {@code NULL}, and {@code colorAttachmentCount} is not 1, any element of {@code pResolveAttachments} that is not {@code VK_ATTACHMENT_UNUSED}, <b>must</b> not have a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is enabled, {@code pResolveAttachments} is not {@code NULL}, any element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, and the corresponding element of {@code pColorAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the color attachment <b>must</b> have a {@code samples} value of 1</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is enabled, {@code pResolveAttachments} is not {@code NULL}, and any element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@code viewMask} <b>must</b> be 0</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is enabled, {@code pResolveAttachments} is not {@code NULL}, and any element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@link VkFragmentShadingRateAttachmentInfoKHR}{@code ::pFragmentShadingRateAttachment} <b>must</b> either be {@code NULL} or a {@link VkAttachmentReference2} structure with an {@code attachment} value of {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-externalFormatResolve">{@code externalFormatResolve}</a> feature is enabled, {@code pResolveAttachments} is not {@code NULL}, and any element of {@code pResolveAttachments} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, elements of {@code pInputAttachments} referencing either a color attachment or resolve attachment used in this subpass <b>must</b> not include <code>VK_IMAGE_ASPECT_PLANE<em>_i_</em>BIT</code> for any index <em>i</em> in its {@code aspectMask}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkFragmentShadingRateAttachmentInfoKHR}, {@link VkMultisampledRenderToSingleSampledInfoEXT}, {@link VkRenderPassCreationControlEXT}, {@link VkRenderPassSubpassFeedbackCreateInfoEXT}, or {@link VkSubpassDescriptionDepthStencilResolve}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubpassDescriptionFlagBits} values</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} <b>must</b> be a valid pointer to an array of {@code inputAttachmentCount} valid {@link VkAttachmentReference2} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference2} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not {@code NULL}, {@code pResolveAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference2} structures</li>
 * <li>If {@code pDepthStencilAttachment} is not {@code NULL}, {@code pDepthStencilAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference2} structure</li>
 * <li>If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} <b>must</b> be a valid pointer to an array of {@code preserveAttachmentCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference2}, {@link VkRenderPassCreateInfo2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescription2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSubpassDescriptionFlags {@link #flags};
 *     VkPipelineBindPoint {@link #pipelineBindPoint};
 *     uint32_t {@link #viewMask};
 *     uint32_t {@link #inputAttachmentCount};
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * {@link #pInputAttachments};
 *     uint32_t {@link #colorAttachmentCount};
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * {@link #pColorAttachments};
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * {@link #pResolveAttachments};
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * {@link #pDepthStencilAttachment};
 *     uint32_t {@link #preserveAttachmentCount};
 *     uint32_t const * {@link #pPreserveAttachments};
 * }</code></pre>
 */
public class VkSubpassDescription2 extends Struct<VkSubpassDescription2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PIPELINEBINDPOINT,
        VIEWMASK,
        INPUTATTACHMENTCOUNT,
        PINPUTATTACHMENTS,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PRESOLVEATTACHMENTS,
        PDEPTHSTENCILATTACHMENT,
        PRESERVEATTACHMENTCOUNT,
        PPRESERVEATTACHMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        VIEWMASK = layout.offsetof(4);
        INPUTATTACHMENTCOUNT = layout.offsetof(5);
        PINPUTATTACHMENTS = layout.offsetof(6);
        COLORATTACHMENTCOUNT = layout.offsetof(7);
        PCOLORATTACHMENTS = layout.offsetof(8);
        PRESOLVEATTACHMENTS = layout.offsetof(9);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(10);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(11);
        PPRESERVEATTACHMENTS = layout.offsetof(12);
    }

    protected VkSubpassDescription2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassDescription2 create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassDescription2(address, container);
    }

    /**
     * Creates a {@code VkSubpassDescription2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass. */
    @NativeType("VkSubpassDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkPipelineBindPoint} value specifying the pipeline type supported for this subpass. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** a bitfield of view indices describing which views rendering is broadcast to in this subpass, when multiview is enabled. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** the number of input attachments. */
    @NativeType("uint32_t")
    public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
    /** a pointer to an array of {@link VkAttachmentReference2} structures defining the input attachments for this subpass and their layouts. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.@Nullable Buffer pInputAttachments() { return npInputAttachments(address()); }
    /** the number of color attachments. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** a pointer to an array of {@code colorAttachmentCount} {@link VkAttachmentReference2} structures defining the color attachments for this subpass and their layouts. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.@Nullable Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** {@code NULL} or a pointer to an array of {@code colorAttachmentCount} {@link VkAttachmentReference2} structures defining the resolve attachments for this subpass and their layouts. */
    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.@Nullable Buffer pResolveAttachments() { return npResolveAttachments(address()); }
    /** a pointer to a {@link VkAttachmentReference2} structure specifying the depth/stencil attachment for this subpass and its layout. */
    @NativeType("VkAttachmentReference2 const *")
    public @Nullable VkAttachmentReference2 pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
    /** the number of preserved attachments. */
    @NativeType("uint32_t")
    public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
    /** a pointer to an array of {@code preserveAttachmentCount} render pass attachment indices identifying attachments that are not used by this subpass, but whose contents <b>must</b> be preserved throughout the subpass. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassDescription2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2} value to the {@link #sType} field. */
    public VkSubpassDescription2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassDescription2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultisampledRenderToSingleSampledInfoEXT} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkMultisampledRenderToSingleSampledInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassSubpassFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkRenderPassSubpassFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolve} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkSubpassDescriptionDepthStencilResolve value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolveKHR} value to the {@code pNext} chain. */
    public VkSubpassDescription2 pNext(VkSubpassDescriptionDepthStencilResolveKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSubpassDescription2 flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineBindPoint} field. */
    public VkSubpassDescription2 pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@link #viewMask} field. */
    public VkSubpassDescription2 viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@link #pInputAttachments} field. */
    public VkSubpassDescription2 pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@link #colorAttachmentCount} field. */
    public VkSubpassDescription2 colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@link #pColorAttachments} field. */
    public VkSubpassDescription2 pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@link #pResolveAttachments} field. */
    public VkSubpassDescription2 pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@link #pDepthStencilAttachment} field. */
    public VkSubpassDescription2 pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pPreserveAttachments} field. */
    public VkSubpassDescription2 pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescription2 set(
        int sType,
        long pNext,
        int flags,
        int pipelineBindPoint,
        int viewMask,
        VkAttachmentReference2.@Nullable Buffer pInputAttachments,
        int colorAttachmentCount,
        VkAttachmentReference2.@Nullable Buffer pColorAttachments,
        VkAttachmentReference2.@Nullable Buffer pResolveAttachments,
        @Nullable VkAttachmentReference2 pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        viewMask(viewMask);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescription2 set(VkSubpassDescription2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescription2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2 malloc() {
        return new VkSubpassDescription2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescription2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription2 calloc() {
        return new VkSubpassDescription2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescription2} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescription2(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescription2} instance for the specified memory address. */
    public static VkSubpassDescription2 create(long address) {
        return new VkSubpassDescription2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassDescription2 createSafe(long address) {
        return address == NULL ? null : new VkSubpassDescription2(address, null);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassDescription2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassDescription2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassDescription2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2 malloc(MemoryStack stack) {
        return new VkSubpassDescription2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassDescription2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription2 calloc(MemoryStack stack) {
        return new VkSubpassDescription2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassDescription2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDescription2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSubpassDescription2.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkSubpassDescription2.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return memGetInt(struct + VkSubpassDescription2.VIEWMASK); }
    /** Unsafe version of {@link #inputAttachmentCount}. */
    public static int ninputAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription2.INPUTATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pInputAttachments}. */
    public static VkAttachmentReference2.@Nullable Buffer npInputAttachments(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription2.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    public static VkAttachmentReference2.@Nullable Buffer npColorAttachments(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pResolveAttachments}. */
    public static VkAttachmentReference2.@Nullable Buffer npResolveAttachments(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthStencilAttachment}. */
    public static @Nullable VkAttachmentReference2 npDepthStencilAttachment(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescription2.PDEPTHSTENCILATTACHMENT)); }
    /** Unsafe version of {@link #preserveAttachmentCount}. */
    public static int npreserveAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription2.PRESERVEATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
    public static @Nullable IntBuffer npPreserveAttachments(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubpassDescription2.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassDescription2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDescription2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSubpassDescription2.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkSubpassDescription2.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { memPutInt(struct + VkSubpassDescription2.VIEWMASK, value); }
    /** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
    public static void ninputAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription2.INPUTATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pInputAttachments(VkAttachmentReference2.Buffer) pInputAttachments}. */
    public static void npInputAttachments(long struct, VkAttachmentReference2.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription2.PINPUTATTACHMENTS, memAddressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription2.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkAttachmentReference2.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, VkAttachmentReference2.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription2.PCOLORATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference2.Buffer) pResolveAttachments}. */
    public static void npResolveAttachments(long struct, VkAttachmentReference2.@Nullable Buffer value) { memPutAddress(struct + VkSubpassDescription2.PRESOLVEATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference2) pDepthStencilAttachment}. */
    public static void npDepthStencilAttachment(long struct, @Nullable VkAttachmentReference2 value) { memPutAddress(struct + VkSubpassDescription2.PDEPTHSTENCILATTACHMENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
    public static void npreserveAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription2.PRESERVEATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
    public static void npPreserveAttachments(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubpassDescription2.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2.PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2.PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription2.PPRESERVEATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription2} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescription2, Buffer> implements NativeResource {

        private static final VkSubpassDescription2 ELEMENT_FACTORY = VkSubpassDescription2.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescription2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassDescription2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassDescription2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDescription2.nsType(address()); }
        /** @return the value of the {@link VkSubpassDescription2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDescription2.npNext(address()); }
        /** @return the value of the {@link VkSubpassDescription2#flags} field. */
        @NativeType("VkSubpassDescriptionFlags")
        public int flags() { return VkSubpassDescription2.nflags(address()); }
        /** @return the value of the {@link VkSubpassDescription2#pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkSubpassDescription2.npipelineBindPoint(address()); }
        /** @return the value of the {@link VkSubpassDescription2#viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkSubpassDescription2.nviewMask(address()); }
        /** @return the value of the {@link VkSubpassDescription2#inputAttachmentCount} field. */
        @NativeType("uint32_t")
        public int inputAttachmentCount() { return VkSubpassDescription2.ninputAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@link VkSubpassDescription2#pInputAttachments} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.@Nullable Buffer pInputAttachments() { return VkSubpassDescription2.npInputAttachments(address()); }
        /** @return the value of the {@link VkSubpassDescription2#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkSubpassDescription2.ncolorAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@link VkSubpassDescription2#pColorAttachments} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.@Nullable Buffer pColorAttachments() { return VkSubpassDescription2.npColorAttachments(address()); }
        /** @return a {@link VkAttachmentReference2.Buffer} view of the struct array pointed to by the {@link VkSubpassDescription2#pResolveAttachments} field. */
        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.@Nullable Buffer pResolveAttachments() { return VkSubpassDescription2.npResolveAttachments(address()); }
        /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@link VkSubpassDescription2#pDepthStencilAttachment} field. */
        @NativeType("VkAttachmentReference2 const *")
        public @Nullable VkAttachmentReference2 pDepthStencilAttachment() { return VkSubpassDescription2.npDepthStencilAttachment(address()); }
        /** @return the value of the {@link VkSubpassDescription2#preserveAttachmentCount} field. */
        @NativeType("uint32_t")
        public int preserveAttachmentCount() { return VkSubpassDescription2.npreserveAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkSubpassDescription2#pPreserveAttachments} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pPreserveAttachments() { return VkSubpassDescription2.npPreserveAttachments(address()); }

        /** Sets the specified value to the {@link VkSubpassDescription2#sType} field. */
        public VkSubpassDescription2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescription2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2 STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2} value to the {@link VkSubpassDescription2#sType} field. */
        public VkSubpassDescription2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2); }
        /** Sets the specified value to the {@link VkSubpassDescription2#pNext} field. */
        public VkSubpassDescription2.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescription2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultisampledRenderToSingleSampledInfoEXT} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkMultisampledRenderToSingleSampledInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassSubpassFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkRenderPassSubpassFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolve} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkSubpassDescriptionDepthStencilResolve value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubpassDescriptionDepthStencilResolveKHR} value to the {@code pNext} chain. */
        public VkSubpassDescription2.Buffer pNext(VkSubpassDescriptionDepthStencilResolveKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSubpassDescription2#flags} field. */
        public VkSubpassDescription2.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescription2#pipelineBindPoint} field. */
        public VkSubpassDescription2.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription2.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescription2#viewMask} field. */
        public VkSubpassDescription2.Buffer viewMask(@NativeType("uint32_t") int value) { VkSubpassDescription2.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@link VkSubpassDescription2#pInputAttachments} field. */
        public VkSubpassDescription2.Buffer pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { VkSubpassDescription2.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescription2#colorAttachmentCount} field. */
        public VkSubpassDescription2.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription2.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@link VkSubpassDescription2#pColorAttachments} field. */
        public VkSubpassDescription2.Buffer pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { VkSubpassDescription2.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2.Buffer} to the {@link VkSubpassDescription2#pResolveAttachments} field. */
        public VkSubpassDescription2.Buffer pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.@Nullable Buffer value) { VkSubpassDescription2.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@link VkSubpassDescription2#pDepthStencilAttachment} field. */
        public VkSubpassDescription2.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkSubpassDescription2.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkSubpassDescription2#pPreserveAttachments} field. */
        public VkSubpassDescription2.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription2.npPreserveAttachments(address(), value); return this; }

    }

}