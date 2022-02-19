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
 * Structure specifying render pass instance begin info.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code viewMask} is not 0, multiview is enabled.</p>
 * 
 * <p>If there is an instance of {@link VkDeviceGroupRenderPassBeginInfo} included in the {@code pNext} chain and its {@code deviceCount} member is not 0, then {@code renderArea} is ignored, and the render area is defined per-device by that structure.</p>
 * 
 * <p>Each element of the {@code pColorAttachments} array corresponds to an output location in the shader, i.e. if the shader declares an output variable decorated with a {@code Location} value of <b>X</b>, then it uses the attachment provided in {@code pColorAttachments}[<b>X</b>]. If the {@code imageView} member of any element of {@code pColorAttachments} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, writes to the corresponding location by a fragment are discarded.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code viewMask} is 0, {@code layerCount} <b>must</b> not be 0</li>
 * <li>If neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, {@code imageView} members of {@code pDepthAttachment}, {@code pStencilAttachment}, and elements of {@code pColorAttachments} that are not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with the same {@code sampleCount}</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, {@code renderArea.offset.x} <b>must</b> be greater than or equal to 0</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, {@code renderArea.offset.y} <b>must</b> be greater than or equal to 0</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, the width of the {@code imageView} member of any element of {@code pColorAttachments}, {@code pDepthAttachment}, or {@code pStencilAttachment} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> be greater than or equal to <code>renderArea.offset.x + renderArea.extent.width</code></li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0, the height of the {@code imageView} member of any element of {@code pColorAttachments}, {@code pDepthAttachment}, or {@code pStencilAttachment} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> be greater than or equal to <code>renderArea.offset.y + renderArea.extent.height</code></li>
 * <li>If the {@code pNext} chain contains {@link VkDeviceGroupRenderPassBeginInfo}, the width of the {@code imageView} member of any element of {@code pColorAttachments}, {@code pDepthAttachment}, or {@code pStencilAttachment} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> be greater than or equal to the sum of the {@code offset.x} and {@code extent.width} members of each element of {@code pDeviceRenderAreas}</li>
 * <li>If the {@code pNext} chain contains {@link VkDeviceGroupRenderPassBeginInfo}, the height of the {@code imageView} member of any element of {@code pColorAttachments}, {@code pDepthAttachment}, or {@code pStencilAttachment} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> be greater than or equal to the sum of the {@code offset.y} and {@code extent.height} members of each element of {@code pDeviceRenderAreas}</li>
 * <li>If neither {@code pDepthAttachment} or {@code pStencilAttachment} are {@code NULL} and the {@code imageView} member of either structure is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code imageView} member of each structure <b>must</b> be the same</li>
 * <li>If neither {@code pDepthAttachment} or {@code pStencilAttachment} are {@code NULL}, and the {@code resolveMode} member of each is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, the {@code resolveImageView} member of each structure <b>must</b> be the same</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, that {@code imageView} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL} and {@code pDepthAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pDepthAttachment→imageView} <b>must</b> have been created with a format that includes a depth aspect</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL} and {@code pDepthAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pDepthAttachment→imageView} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL} and {@code pStencilAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pStencilAttachment→imageView} <b>must</b> have been created with a format that includes a stencil aspect</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL} and {@code pStencilAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pStencilAttachment→imageView} <b>must</b> have been created with a stencil usage including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code layout} member of that element of {@code pColorAttachments} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, if the {@code resolveMode} member of that element of {@code pColorAttachments} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, its {@code resolveImageLayout} member <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL} and {@code pDepthAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pDepthAttachment→layout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL}, {@code pDepthAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code pDepthAttachment→resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code pDepthAttachment→resolveImageLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL} and {@code pStencilAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pStencilAttachment→layout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL}, {@code pStencilAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code pStencilAttachment→resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code pStencilAttachment→resolveImageLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code layout} member of that element of {@code pColorAttachments} <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, if the {@code resolveMode} member of that element of {@code pColorAttachments} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, its {@code resolveImageLayout} member <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL}, {@code pDepthAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code pDepthAttachment→resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code pDepthAttachment→resolveImageLayout} <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL}, {@code pStencilAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code pStencilAttachment→resolveMode} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, {@code pStencilAttachment→resolveImageLayout} <b>must</b> not be {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code layout} member of that element of {@code pColorAttachments} <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code colorAttachmentCount} is not 0 and the {@code imageView} member of an element of {@code pColorAttachments} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, if the {@code resolveMode} member of that element of {@code pColorAttachments} is not {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, its {@code resolveImageLayout} member <b>must</b> not be {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL} and {@code pDepthAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pDepthAttachment→resolveMode} <b>must</b> be one of the bits set in {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::supportedDepthResolveModes}</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL} and {@code pStencilAttachment→imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pStencilAttachment→resolveMode} <b>must</b> be one of the bits set in {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::supportedStencilResolveModes}</li>
 * <li>If {@code pDepthAttachment} or {@code pStencilAttachment} are both not {@code NULL}, {@code pDepthAttachment→imageView} and {@code pStencilAttachment→imageView} are both not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::independentResolveNone} is {@link VK10#VK_FALSE FALSE}, the {@code resolveMode} of both structures <b>must</b> be the same value</li>
 * <li>If {@code pDepthAttachment} or {@code pStencilAttachment} are both not {@code NULL}, {@code pDepthAttachment→imageView} and {@code pStencilAttachment→imageView} are both not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@link VkPhysicalDeviceDepthStencilResolveProperties}{@code ::independentResolve} is {@link VK10#VK_FALSE FALSE}, and the {@code resolveMode} of neither structure is {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, the {@code resolveMode} of both structures <b>must</b> be the same value</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxColorAttachments}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapNonSubsampledImages">non-subsample image feature</a> is not enabled, valid {@code imageView} and {@code resolveImageView} members of {@code pDepthAttachment}, {@code pStencilAttachment}, and each element of {@code pColorAttachments} <b>must</b> be a {@code VkImageView} created with {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code viewMask} is not 0, {@code imageView} <b>must</b> have a {@code layerCount} greater than or equal to the index of the most significant bit in {@code viewMask}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code viewMask} is 0, {@code imageView} <b>must</b> have a {@code layerCount} equal to 1</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0 and the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a width greater than or equal to <code>ceil((renderArea<sub>x</sub>+renderArea<sub>width</sub>) / maxFragmentDensityTexelSize<sub>width</sub>)</code></li>
 * <li>If the {@code pNext} chain contains a {@link VkDeviceGroupRenderPassBeginInfo} structure, its {@code deviceRenderAreaCount} member is not 0, and the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a width greater than or equal to <code>ceil((pDeviceRenderAreas<sub>x</sub>+pDeviceRenderAreas<sub>width</sub>) / maxFragmentDensityTexelSize<sub>width</sub>)</code> for each element of {@code pDeviceRenderAreas}</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0 and the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a height greater than or equal to <code>ceil((renderArea<sub>y</sub>+renderArea<sub>height</sub>) / maxFragmentDensityTexelSize<sub>height</sub>)</code></li>
 * <li>If the {@code pNext} chain contains a {@link VkDeviceGroupRenderPassBeginInfo} structure, its {@code deviceRenderAreaCount} member is not 0, and the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a height greater than or equal to <code>ceil((pDeviceRenderAreas<sub>y</sub>+pDeviceRenderAreas<sub>height</sub>) / maxFragmentDensityTexelSize<sub>height</sub>)</code> for each element of {@code pDeviceRenderAreas}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> not be equal to the {@code imageView} or {@code resolveImageView} member of {@code pDepthAttachment}, {@code pStencilAttachment}, or any element of {@code pColorAttachments}</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0 and the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a width greater than or equal to <code>ceil((renderArea<sub>x</sub>+renderArea<sub>width</sub>) / shadingRateAttachmentTexelSize<sub>width</sub>)</code></li>
 * <li>If the {@code pNext} chain contains a {@link VkDeviceGroupRenderPassBeginInfo} structure, its {@code deviceRenderAreaCount} member is not 0, and the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a width greater than or equal to <code>ceil((pDeviceRenderAreas<sub>x</sub>+pDeviceRenderAreas<sub>width</sub>) / shadingRateAttachmentTexelSize<sub>width</sub>)</code> for each element of {@code pDeviceRenderAreas}</li>
 * <li>If the {@code pNext} chain does not contain {@link VkDeviceGroupRenderPassBeginInfo} or its {@code deviceRenderAreaCount} member is equal to 0 and the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a height greater than or equal to <code>ceil((renderArea<sub>y</sub>+renderArea<sub>height</sub>) / shadingRateAttachmentTexelSize<sub>height</sub>)</code></li>
 * <li>If the {@code pNext} chain contains a {@link VkDeviceGroupRenderPassBeginInfo} structure, its {@code deviceRenderAreaCount} member is not 0, and the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> have a height greater than or equal to <code>ceil((pDeviceRenderAreas<sub>y</sub>+pDeviceRenderAreas<sub>height</sub>) / shadingRateAttachmentTexelSize<sub>height</sub>)</code> for each element of {@code pDeviceRenderAreas}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code viewMask} is 0, {@code imageView} <b>must</b> have a {@code layerCount} that is either equal to 1 or greater than or equal to {@code layerCount}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and {@code viewMask} is not 0, {@code imageView} <b>must</b> have a {@code layerCount} that either equal to 1 or greater than or equal to the index of the most significant bit in {@code viewMask}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> not be equal to the {@code imageView} or {@code resolveImageView} member of {@code pDepthAttachment}, {@code pStencilAttachment}, or any element of {@code pColorAttachments}</li>
 * <li>If the {@code imageView} member of a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structure included in the {@code pNext} chain is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> not be equal to the {@code imageView} member of a {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} structure included in the {@code pNext} chain</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiview">{@code multiview}</a> feature is not enabled, {@code viewMask} <b>must</b> be 0</li>
 * <li>The index of the most significant bit in {@code viewMask} <b>must</b> be less than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxMultiviewViewCount">{@code maxMultiviewViewCount}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupRenderPassBeginInfo}, {@link VkMultiviewPerViewAttributesInfoNVX}, {@link VkRenderingFragmentDensityMapAttachmentInfoEXT}, or {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkRenderingFlagBits} values</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkRenderingAttachmentInfo} structures</li>
 * <li>If {@code pDepthAttachment} is not {@code NULL}, {@code pDepthAttachment} <b>must</b> be a valid pointer to a valid {@link VkRenderingAttachmentInfo} structure</li>
 * <li>If {@code pStencilAttachment} is not {@code NULL}, {@code pStencilAttachment} <b>must</b> be a valid pointer to a valid {@link VkRenderingAttachmentInfo} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}, {@link VkRenderingAttachmentInfo}, {@link VK13#vkCmdBeginRendering CmdBeginRendering}, {@link KHRDynamicRendering#vkCmdBeginRenderingKHR CmdBeginRenderingKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderingFlags {@link #flags};
 *     {@link VkRect2D VkRect2D} {@link #renderArea};
 *     uint32_t {@link #layerCount};
 *     uint32_t {@link #viewMask};
 *     uint32_t {@link #colorAttachmentCount};
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * {@link #pColorAttachments};
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * {@link #pDepthAttachment};
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * {@link #pStencilAttachment};
 * }</code></pre>
 */
public class VkRenderingInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RENDERAREA,
        LAYERCOUNT,
        VIEWMASK,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PDEPTHATTACHMENT,
        PSTENCILATTACHMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RENDERAREA = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        VIEWMASK = layout.offsetof(5);
        COLORATTACHMENTCOUNT = layout.offsetof(6);
        PCOLORATTACHMENTS = layout.offsetof(7);
        PDEPTHATTACHMENT = layout.offsetof(8);
        PSTENCILATTACHMENT = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkRenderingInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkRenderingFlagBits}. */
    @NativeType("VkRenderingFlags")
    public int flags() { return nflags(address()); }
    /** the render area that is affected by the render pass instance. */
    public VkRect2D renderArea() { return nrenderArea(address()); }
    /** the number of layers rendered to in each attachment when {@code viewMask} is 0. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** the view mask indicating the indices of attachment layers that will be rendered when it is not 0. */
    @NativeType("uint32_t")
    public int viewMask() { return nviewMask(address()); }
    /** the number of elements in {@code pColorAttachments}. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** a pointer to an array of {@code colorAttachmentCount} {@link VkRenderingAttachmentInfo} structures describing any color attachments used. */
    @Nullable
    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo.Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** a pointer to a {@link VkRenderingAttachmentInfo} structure describing a depth attachment. */
    @Nullable
    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo pDepthAttachment() { return npDepthAttachment(address()); }
    /** a pointer to a {@link VkRenderingAttachmentInfo} structure describing a stencil attachment. */
    @Nullable
    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo pStencilAttachment() { return npStencilAttachment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderingInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO} value to the {@link #sType} field. */
    public VkRenderingInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderingInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkRenderingFragmentDensityMapAttachmentInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
    public VkRenderingInfo pNext(VkRenderingFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkRenderingInfo flags(@NativeType("VkRenderingFlags") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@link #renderArea} field. */
    public VkRenderingInfo renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@link #renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderingInfo renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
    /** Sets the specified value to the {@link #layerCount} field. */
    public VkRenderingInfo layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the specified value to the {@link #viewMask} field. */
    public VkRenderingInfo viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo.Buffer} to the {@link #pColorAttachments} field. */
    public VkRenderingInfo pColorAttachments(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@link #pDepthAttachment} field. */
    public VkRenderingInfo pDepthAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { npDepthAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@link #pStencilAttachment} field. */
    public VkRenderingInfo pStencilAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { npStencilAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingInfo set(
        int sType,
        long pNext,
        int flags,
        VkRect2D renderArea,
        int layerCount,
        int viewMask,
        @Nullable VkRenderingAttachmentInfo.Buffer pColorAttachments,
        @Nullable VkRenderingAttachmentInfo pDepthAttachment,
        @Nullable VkRenderingAttachmentInfo pStencilAttachment
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderArea(renderArea);
        layerCount(layerCount);
        viewMask(viewMask);
        pColorAttachments(pColorAttachments);
        pDepthAttachment(pDepthAttachment);
        pStencilAttachment(pStencilAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingInfo set(VkRenderingInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingInfo malloc() {
        return wrap(VkRenderingInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderingInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingInfo calloc() {
        return wrap(VkRenderingInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderingInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderingInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingInfo} instance for the specified memory address. */
    public static VkRenderingInfo create(long address) {
        return wrap(VkRenderingInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderingInfo.class, address);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderingInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInfo malloc(MemoryStack stack) {
        return wrap(VkRenderingInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderingInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInfo calloc(MemoryStack stack) {
        return wrap(VkRenderingInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderingInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkRenderingInfo.FLAGS); }
    /** Unsafe version of {@link #renderArea}. */
    public static VkRect2D nrenderArea(long struct) { return VkRect2D.create(struct + VkRenderingInfo.RENDERAREA); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderingInfo.LAYERCOUNT); }
    /** Unsafe version of {@link #viewMask}. */
    public static int nviewMask(long struct) { return UNSAFE.getInt(null, struct + VkRenderingInfo.VIEWMASK); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkRenderingInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    @Nullable public static VkRenderingAttachmentInfo.Buffer npColorAttachments(long struct) { return VkRenderingAttachmentInfo.createSafe(memGetAddress(struct + VkRenderingInfo.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthAttachment}. */
    @Nullable public static VkRenderingAttachmentInfo npDepthAttachment(long struct) { return VkRenderingAttachmentInfo.createSafe(memGetAddress(struct + VkRenderingInfo.PDEPTHATTACHMENT)); }
    /** Unsafe version of {@link #pStencilAttachment}. */
    @Nullable public static VkRenderingAttachmentInfo npStencilAttachment(long struct) { return VkRenderingAttachmentInfo.createSafe(memGetAddress(struct + VkRenderingInfo.PSTENCILATTACHMENT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingInfo.FLAGS, value); }
    /** Unsafe version of {@link #renderArea(VkRect2D) renderArea}. */
    public static void nrenderArea(long struct, VkRect2D value) { memCopy(value.address(), struct + VkRenderingInfo.RENDERAREA, VkRect2D.SIZEOF); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingInfo.LAYERCOUNT, value); }
    /** Unsafe version of {@link #viewMask(int) viewMask}. */
    public static void nviewMask(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingInfo.VIEWMASK, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkRenderingAttachmentInfo.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, @Nullable VkRenderingAttachmentInfo.Buffer value) { memPutAddress(struct + VkRenderingInfo.PCOLORATTACHMENTS, memAddressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #pDepthAttachment(VkRenderingAttachmentInfo) pDepthAttachment}. */
    public static void npDepthAttachment(long struct, @Nullable VkRenderingAttachmentInfo value) { memPutAddress(struct + VkRenderingInfo.PDEPTHATTACHMENT, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStencilAttachment(VkRenderingAttachmentInfo) pStencilAttachment}. */
    public static void npStencilAttachment(long struct, @Nullable VkRenderingAttachmentInfo value) { memPutAddress(struct + VkRenderingInfo.PSTENCILATTACHMENT, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderingInfo.PCOLORATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderingInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderingInfo, Buffer> implements NativeResource {

        private static final VkRenderingInfo ELEMENT_FACTORY = VkRenderingInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderingInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderingInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingInfo.nsType(address()); }
        /** @return the value of the {@link VkRenderingInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingInfo.npNext(address()); }
        /** @return the value of the {@link VkRenderingInfo#flags} field. */
        @NativeType("VkRenderingFlags")
        public int flags() { return VkRenderingInfo.nflags(address()); }
        /** @return a {@link VkRect2D} view of the {@link VkRenderingInfo#renderArea} field. */
        public VkRect2D renderArea() { return VkRenderingInfo.nrenderArea(address()); }
        /** @return the value of the {@link VkRenderingInfo#layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkRenderingInfo.nlayerCount(address()); }
        /** @return the value of the {@link VkRenderingInfo#viewMask} field. */
        @NativeType("uint32_t")
        public int viewMask() { return VkRenderingInfo.nviewMask(address()); }
        /** @return the value of the {@link VkRenderingInfo#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkRenderingInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link VkRenderingAttachmentInfo.Buffer} view of the struct array pointed to by the {@link VkRenderingInfo#pColorAttachments} field. */
        @Nullable
        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo.Buffer pColorAttachments() { return VkRenderingInfo.npColorAttachments(address()); }
        /** @return a {@link VkRenderingAttachmentInfo} view of the struct pointed to by the {@link VkRenderingInfo#pDepthAttachment} field. */
        @Nullable
        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo pDepthAttachment() { return VkRenderingInfo.npDepthAttachment(address()); }
        /** @return a {@link VkRenderingAttachmentInfo} view of the struct pointed to by the {@link VkRenderingInfo#pStencilAttachment} field. */
        @Nullable
        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo pStencilAttachment() { return VkRenderingInfo.npStencilAttachment(address()); }

        /** Sets the specified value to the {@link VkRenderingInfo#sType} field. */
        public VkRenderingInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO} value to the {@link VkRenderingInfo#sType} field. */
        public VkRenderingInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
        /** Sets the specified value to the {@link VkRenderingInfo#pNext} field. */
        public VkRenderingInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderingInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfo} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupRenderPassBeginInfoKHR} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkDeviceGroupRenderPassBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMultiviewPerViewAttributesInfoNVX} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingFragmentDensityMapAttachmentInfoEXT} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkRenderingFragmentDensityMapAttachmentInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} value to the {@code pNext} chain. */
        public VkRenderingInfo.Buffer pNext(VkRenderingFragmentShadingRateAttachmentInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkRenderingInfo#flags} field. */
        public VkRenderingInfo.Buffer flags(@NativeType("VkRenderingFlags") int value) { VkRenderingInfo.nflags(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@link VkRenderingInfo#renderArea} field. */
        public VkRenderingInfo.Buffer renderArea(VkRect2D value) { VkRenderingInfo.nrenderArea(address(), value); return this; }
        /** Passes the {@link VkRenderingInfo#renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderingInfo.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
        /** Sets the specified value to the {@link VkRenderingInfo#layerCount} field. */
        public VkRenderingInfo.Buffer layerCount(@NativeType("uint32_t") int value) { VkRenderingInfo.nlayerCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingInfo#viewMask} field. */
        public VkRenderingInfo.Buffer viewMask(@NativeType("uint32_t") int value) { VkRenderingInfo.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo.Buffer} to the {@link VkRenderingInfo#pColorAttachments} field. */
        public VkRenderingInfo.Buffer pColorAttachments(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) { VkRenderingInfo.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@link VkRenderingInfo#pDepthAttachment} field. */
        public VkRenderingInfo.Buffer pDepthAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { VkRenderingInfo.npDepthAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@link VkRenderingInfo#pStencilAttachment} field. */
        public VkRenderingInfo.Buffer pStencilAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { VkRenderingInfo.npStencilAttachment(address(), value); return this; }

    }

}