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
 * Structure specifying parameters of a newly created framebuffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>It is legal for a subpass to use no color or depth/stencil attachments, either because it has no attachment references or because all of them are {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}. This kind of subpass <b>can</b> use shader side effects such as image stores and atomics to produce an output. In this case, the subpass continues to use the {@code width}, {@code height}, and {@code layers} of the framebuffer to define the dimensions of the rendering area, and the {@code rasterizationSamples} from each pipeline’s {@link VkPipelineMultisampleStateCreateInfo} to define the number of samples used in rasterization; however, if {@link VkPhysicalDeviceFeatures}{@code ::variableMultisampleRate} is {@link VK10#VK_FALSE FALSE}, then all pipelines to be bound with the subpass <b>must</b> have the same value for {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples}. In all such cases, {@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value that is set in {@link VkPhysicalDeviceLimits}{@code ::framebufferNoAttachmentsSampleCounts}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code attachmentCount} <b>must</b> be equal to the attachment count specified in {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT} and {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@code VkImageView} handles</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a color attachment or resolve attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a depth/stencil resolve attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code renderpass} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as an input attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>Each element of {@code pAttachments} that is used as a fragment density map attachment by {@code renderPass} <b>must</b> not have been created with a {@code flags} value including {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * <li>If {@code renderPass} has a fragment density map attachment and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapNonSubsampledImages">{@code fragmentDensityMapNonSubsampledImages}</a> feature is not enabled, each element of {@code pAttachments} <b>must</b> have been created with a {@code flags} value including {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT} unless that element is the fragment density map attachment</li>
 * <li>If {@code renderPass} was created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-fragmentdensitymapoffsets">fragment density map offsets</a> other than <code>(0,0)</code>, each element of {@code pAttachments} <b>must</b> have been created with a {@code flags} value including {@link QCOMFragmentDensityMapOffset#VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with a {@code VkFormat} value that matches the {@code VkFormat} specified by the corresponding {@link VkAttachmentDescription} in {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with a {@code samples} value that matches the {@code samples} value specified by the corresponding {@link VkAttachmentDescription} in {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as an input, color, resolve, or depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a {@link VkImageCreateInfo}{@code ::extent.width} greater than or equal to {@code width}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as an input, color, resolve, or depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a {@link VkImageCreateInfo}{@code ::extent.height} greater than or equal to {@code height}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as an input, color, resolve, or depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a {@link VkImageViewCreateInfo}{@code ::subresourceRange.layerCount} greater than or equal to {@code layers}</li>
 * <li>If {@code renderPass} was specified with non-zero view masks, each element of {@code pAttachments} that is used as an input, color, resolve, or depth/stencil attachment by {@code renderPass} <b>must</b> have a {@code layerCount} greater than the index of the most significant bit set in any of those view masks</li>
 * <li>Each element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a {@code layerCount} equal to 1 or if {@code renderPass} was specified with non-zero view masks, greater than the index of the most significant bit set in any of those view masks</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, an element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a width at least as large as <code>ceil(width / maxFragmentDensityTexelSize<sub>width</sub>)</code></li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, an element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a height at least as large as <code>ceil(height / maxFragmentDensityTexelSize<sub>height</sub>)</code></li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, and {@code renderPass} was specified with non-zero view masks, each element of {@code pAttachments} that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> by {@code renderPass} <b>must</b> have a {@code layerCount} that is either 1, or greater than the index of the most significant bit set in any of those view masks</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, and {@code renderPass} was not specified with non-zero view masks, each element of {@code pAttachments} that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> by {@code renderPass} <b>must</b> have a {@code layerCount} that is either 1, or greater than {@code layers}</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance7">{@code maintenance7}</a> is not enabled or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustFragmentShadingRateAttachmentAccess">{@code robustFragmentShadingRateAttachmentAccess}</a> limit is {@link VK10#VK_FALSE FALSE} or the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure was created with {@link VkImageSubresourceRange}{@code ::baseMipLevel} greater than 0, {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, an element of {@code pAttachments} that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> <b>must</b> have a width at least as large as <code>⌈width / texelWidth⌉</code>, where {@code texelWidth} is the largest value of {@code shadingRateAttachmentTexelSize.width} in a {@link VkFragmentShadingRateAttachmentInfoKHR} which references that attachment</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance7">{@code maintenance7}</a> is not enabled or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustFragmentShadingRateAttachmentAccess">{@code robustFragmentShadingRateAttachmentAccess}</a> limit is {@link VK10#VK_FALSE FALSE} or the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure was created with {@link VkImageSubresourceRange}{@code ::baseMipLevel} greater than 0, {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, an element of {@code pAttachments} that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> <b>must</b> have a height at least as large as <code>⌈height / texelHeight⌉</code>, where {@code texelHeight} is the largest value of {@code shadingRateAttachmentTexelSize.height} in a {@link VkFragmentShadingRateAttachmentInfoKHR} which references that attachment</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> only specify a single mip level</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with the identity swizzle</li>
 * <li>{@code width} <b>must</b> be greater than 0</li>
 * <li>{@code width} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFramebufferWidth">{@code maxFramebufferWidth}</a></li>
 * <li>{@code height} <b>must</b> be greater than 0</li>
 * <li>{@code height} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFramebufferHeight">{@code maxFramebufferHeight}</a></li>
 * <li>{@code layers} <b>must</b> be greater than 0</li>
 * <li>{@code layers} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFramebufferLayers">{@code maxFramebufferLayers}</a></li>
 * <li>If {@code renderPass} was specified with non-zero view masks, {@code layers} <b>must</b> be 1</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is a 2D or 2D array image view taken from a 3D image <b>must</b> not be a depth/stencil format</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-imagelessFramebuffer">{@code imagelessFramebuffer}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code pNext} chain <b>must</b> include a {@link VkFramebufferAttachmentsCreateInfo} structure</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code attachmentImageInfoCount} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain <b>must</b> be equal to either zero or {@code attachmentCount}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code width} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is used as an input, color, resolve or depth/stencil attachment in {@code renderPass} <b>must</b> be greater than or equal to {@code width}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code height} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is used as an input, color, resolve or depth/stencil attachment in {@code renderPass} <b>must</b> be greater than or equal to {@code height}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code width} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is referenced by {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment} in {@code renderPass} <b>must</b> be greater than or equal to <code>ceil(width / maxFragmentDensityTexelSize<sub>width</sub>)</code></li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code height} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that is referenced by {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment} in {@code renderPass} <b>must</b> be greater than or equal to <code>ceil(height / maxFragmentDensityTexelSize<sub>height</sub>)</code></li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance7">{@code maintenance7}</a> is not enabled or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustFragmentShadingRateAttachmentAccess">{@code robustFragmentShadingRateAttachmentAccess}</a> limit is {@link VK10#VK_FALSE FALSE} or the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure was created with {@link VkImageSubresourceRange}{@code ::baseMipLevel} greater than 0, and {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code width} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> <b>must</b> be greater than or equal to <code>⌈width / texelWidth⌉</code>, where {@code texelWidth} is the largest value of {@code shadingRateAttachmentTexelSize.width} in a {@link VkFragmentShadingRateAttachmentInfoKHR} which references that attachment</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance7">{@code maintenance7}</a> is not enabled or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustFragmentShadingRateAttachmentAccess">{@code robustFragmentShadingRateAttachmentAccess}</a> limit is {@link VK10#VK_FALSE FALSE} or the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure was created with {@link VkImageSubresourceRange}{@code ::baseMipLevel} greater than 0, and {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code height} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> <b>must</b> be greater than or equal to <code>⌈height / texelHeight⌉</code>, where {@code texelHeight} is the largest value of {@code shadingRateAttachmentTexelSize.height} in a {@link VkFragmentShadingRateAttachmentInfoKHR} which references that attachment</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code layerCount} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> <b>must</b> be either 1, or greater than or equal to {@code layers}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT} and {@code renderPass} was specified with non-zero view masks, the {@code layerCount} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure in the {@code pNext} chain that is used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> <b>must</b> be either 1, or greater than the index of the most significant bit set in any of those view masks</li>
 * <li>If multiview is enabled for {@code renderPass} and {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code layerCount} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain used as an input, color, resolve, or depth/stencil attachment in {@code renderPass} <b>must</b> be greater than the maximum bit index set in the view mask in the subpasses in which it is used in {@code renderPass}</li>
 * <li>If multiview is not enabled for {@code renderPass} and {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code layerCount} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain used as an input, color, resolve, or depth/stencil attachment in {@code renderPass} <b>must</b> be greater than or equal to {@code layers}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a color attachment or resolve attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a depth/stencil attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a depth/stencil resolve attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as an input attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, at least one element of the {@code pViewFormats} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be equal to the corresponding value of {@link VkAttachmentDescription}{@code ::format} used to create {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with {@link VkImageViewCreateInfo}{@code ::viewType} not equal to {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a fragment shading rate attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a fragment shading rate attachment by {@code renderPass} <b>must</b> include {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#subpass-multisampledrendertosinglesampled">multisampled-render-to-single-sampled</a> is enabled for any subpass, all color, depth/stencil and input attachments used in that subpass which have {@link VkAttachmentDescription}{@code ::samples} or {@link VkAttachmentDescription2}{@code ::samples} equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} <b>must</b> have been created with {@link EXTMultisampledRenderToSingleSampled#VK_IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT} in their {@link VkImageCreateInfo}{@code ::flags}</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#subpass-multisampledrendertosinglesampled">multisampled-render-to-single-sampled</a> is enabled for any subpass, all color, depth/stencil and input attachments used in that subpass which have {@link VkAttachmentDescription}{@code ::samples} or {@link VkAttachmentDescription2}{@code ::samples} equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} <b>must</b> have a format that supports the sample count specified in {@link VkMultisampledRenderToSingleSampledInfoEXT}{@code ::rasterizationSamples}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-nullColorAttachmentWithExternalFormatResolve">{@code nullColorAttachmentWithExternalFormatResolve}</a> is {@link VK10#VK_FALSE FALSE}, and {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the format of the color attachment for each subpass in {@code renderPass} that includes an external format image as a resolve attachment <b>must</b> have a format equal to the value of {@link VkAndroidHardwareBufferFormatResolvePropertiesANDROID}{@code ::colorAttachmentFormat} as returned by a call to {@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID} for the Android hardware buffer that was used to create the image view use as its resolve attachment</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, then if an element of {@code pAttachments} has a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, it <b>must</b> have been created with a {@link VkExternalFormatANDROID}{@code ::externalFormat} value identical to that provided in the {@link VkExternalFormatANDROID}{@code ::externalFormat} specified by the corresponding {@link VkAttachmentDescription2} in {@code renderPass}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkFramebufferAttachmentsCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkFramebufferCreateFlagBits} values</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>Both of {@code renderPass}, and the elements of {@code pAttachments} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateFramebuffer CreateFramebuffer}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFramebufferCreateFlags {@link #flags};
 *     VkRenderPass {@link #renderPass};
 *     uint32_t {@link #attachmentCount};
 *     VkImageView const * {@link #pAttachments};
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 *     uint32_t {@link #layers};
 * }</code></pre>
 */
public class VkFramebufferCreateInfo extends Struct<VkFramebufferCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RENDERPASS,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        WIDTH,
        HEIGHT,
        LAYERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RENDERPASS = layout.offsetof(3);
        ATTACHMENTCOUNT = layout.offsetof(4);
        PATTACHMENTS = layout.offsetof(5);
        WIDTH = layout.offsetof(6);
        HEIGHT = layout.offsetof(7);
        LAYERS = layout.offsetof(8);
    }

    protected VkFramebufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFramebufferCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkFramebufferCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkFramebufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkFramebufferCreateFlagBits} */
    @NativeType("VkFramebufferCreateFlags")
    public int flags() { return nflags(address()); }
    /** a render pass defining what render passes the framebuffer will be compatible with. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">Render Pass Compatibility</a> for details. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** the number of attachments. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** a pointer to an array of {@code VkImageView} handles, each of which will be used as the corresponding attachment in a render pass instance. If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, this parameter is ignored. */
    @NativeType("VkImageView const *")
    public @Nullable LongBuffer pAttachments() { return npAttachments(address()); }
    /** {@code width}, {@code height} and {@code layers} define the dimensions of the framebuffer. If the render pass uses multiview, then {@code layers} <b>must</b> be one and each attachment requires a number of layers that is greater than the maximum bit index set in the view mask in the subpasses in which it is used. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** see {@code width} */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** see {@code width} */
    @NativeType("uint32_t")
    public int layers() { return nlayers(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFramebufferCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO} value to the {@link #sType} field. */
    public VkFramebufferCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFramebufferCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfo} value to the {@code pNext} chain. */
    public VkFramebufferCreateInfo pNext(VkFramebufferAttachmentsCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfoKHR} value to the {@code pNext} chain. */
    public VkFramebufferCreateInfo pNext(VkFramebufferAttachmentsCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkFramebufferCreateInfo flags(@NativeType("VkFramebufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #renderPass} field. */
    public VkFramebufferCreateInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the specified value to the {@link #attachmentCount} field. */
    public VkFramebufferCreateInfo attachmentCount(@NativeType("uint32_t") int value) { nattachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pAttachments} field. */
    public VkFramebufferCreateInfo pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { npAttachments(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public VkFramebufferCreateInfo width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public VkFramebufferCreateInfo height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #layers} field. */
    public VkFramebufferCreateInfo layers(@NativeType("uint32_t") int value) { nlayers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long renderPass,
        int attachmentCount,
        @Nullable LongBuffer pAttachments,
        int width,
        int height,
        int layers
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderPass(renderPass);
        attachmentCount(attachmentCount);
        pAttachments(pAttachments);
        width(width);
        height(height);
        layers(layers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferCreateInfo set(VkFramebufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferCreateInfo malloc() {
        return new VkFramebufferCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferCreateInfo calloc() {
        return new VkFramebufferCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance for the specified memory address. */
    public static VkFramebufferCreateInfo create(long address) {
        return new VkFramebufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFramebufferCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkFramebufferCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFramebufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFramebufferCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferCreateInfo malloc(MemoryStack stack) {
        return new VkFramebufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferCreateInfo calloc(MemoryStack stack) {
        return new VkFramebufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.FLAGS); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return memGetLong(struct + VkFramebufferCreateInfo.RENDERPASS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments() pAttachments}. */
    public static @Nullable LongBuffer npAttachments(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.HEIGHT); }
    /** Unsafe version of {@link #layers}. */
    public static int nlayers(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.LAYERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { memPutLong(struct + VkFramebufferCreateInfo.RENDERPASS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(LongBuffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS, memAddressSafe(value)); if (value != null) { nattachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.HEIGHT, value); }
    /** Unsafe version of {@link #layers(int) layers}. */
    public static void nlayers(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.LAYERS, value); }

    // -----------------------------------

    /** An array of {@link VkFramebufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferCreateInfo, Buffer> implements NativeResource {

        private static final VkFramebufferCreateInfo ELEMENT_FACTORY = VkFramebufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkFramebufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFramebufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFramebufferCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#flags} field. */
        @NativeType("VkFramebufferCreateFlags")
        public int flags() { return VkFramebufferCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkFramebufferCreateInfo.nrenderPass(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkFramebufferCreateInfo.nattachmentCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkFramebufferCreateInfo#pAttachments} field. */
        @NativeType("VkImageView const *")
        public @Nullable LongBuffer pAttachments() { return VkFramebufferCreateInfo.npAttachments(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#width} field. */
        @NativeType("uint32_t")
        public int width() { return VkFramebufferCreateInfo.nwidth(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#height} field. */
        @NativeType("uint32_t")
        public int height() { return VkFramebufferCreateInfo.nheight(address()); }
        /** @return the value of the {@link VkFramebufferCreateInfo#layers} field. */
        @NativeType("uint32_t")
        public int layers() { return VkFramebufferCreateInfo.nlayers(address()); }

        /** Sets the specified value to the {@link VkFramebufferCreateInfo#sType} field. */
        public VkFramebufferCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO} value to the {@link VkFramebufferCreateInfo#sType} field. */
        public VkFramebufferCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO); }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#pNext} field. */
        public VkFramebufferCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfo} value to the {@code pNext} chain. */
        public VkFramebufferCreateInfo.Buffer pNext(VkFramebufferAttachmentsCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFramebufferAttachmentsCreateInfoKHR} value to the {@code pNext} chain. */
        public VkFramebufferCreateInfo.Buffer pNext(VkFramebufferAttachmentsCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#flags} field. */
        public VkFramebufferCreateInfo.Buffer flags(@NativeType("VkFramebufferCreateFlags") int value) { VkFramebufferCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#renderPass} field. */
        public VkFramebufferCreateInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkFramebufferCreateInfo.nrenderPass(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#attachmentCount} field. */
        public VkFramebufferCreateInfo.Buffer attachmentCount(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nattachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkFramebufferCreateInfo#pAttachments} field. */
        public VkFramebufferCreateInfo.Buffer pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { VkFramebufferCreateInfo.npAttachments(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#width} field. */
        public VkFramebufferCreateInfo.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#height} field. */
        public VkFramebufferCreateInfo.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferCreateInfo#layers} field. */
        public VkFramebufferCreateInfo.Buffer layers(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nlayers(address(), value); return this; }

    }

}