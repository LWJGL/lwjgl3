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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of an image memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>The first <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified image subresource range, via access types in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}. If {@code srcAccessMask} includes {@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT}, memory writes performed by that access type are also made visible, as that access type is not performed through a resource.</p>
 * 
 * <p>The second <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified image subresource range, via access types in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}. If {@code dstAccessMask} includes {@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT} or {@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}, available memory writes are also made visible to accesses of those types, as those access types are not performed through a resource.</p>
 * 
 * <p>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, and {@code srcQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> for the specified image subresource range, and the second access scope includes no access, as if {@code dstAccessMask} was 0.</p>
 * 
 * <p>If {@code dstQueueFamilyIndex} is not equal to {@code srcQueueFamilyIndex}, and {@code dstQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified image subresource range, and the first access scope includes no access, as if {@code srcAccessMask} was 0.</p>
 * 
 * <p>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled or {@code oldLayout} is not equal to {@code newLayout}, {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a> for the specified image subresource range.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is enabled, when the old and new layout are equal, the layout values are ignored - data is preserved no matter what values are specified, or what layout the image is currently in.</p>
 * </div>
 * 
 * <p>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then including {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} in the {@code aspectMask} member of {@code subresourceRange} is equivalent to including {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, and (for three-plane formats only) {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, {@code oldLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or the current layout of the image subresources affected by the barrier</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, {@code newLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with at least one of {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with at least one of {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code oldLayout} <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR} or {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code newLayout} <b>must</b> not be {@link KHRSynchronization2#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR} or {@link KHRSynchronization2#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK13#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_ATTACHMENT_OPTIMAL}, {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK13#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL IMAGE_LAYOUT_READ_ONLY_OPTIMAL}, {@code image} <b>must</b> have been created with at least one of {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRFragmentShadingRate#VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR} then {@code image} <b>must</b> have been created with {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} set</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code srcQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL}, {@link EXTQueueFamilyForeign#VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT}, or a valid queue family</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code dstQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL}, {@link EXTQueueFamilyForeign#VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT}, or a valid queue family</li>
 * <li>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, at least one of {@code srcQueueFamilyIndex} or {@code dstQueueFamilyIndex} <b>must</b> not be {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL} or {@link EXTQueueFamilyForeign#VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT}</li>
 * <li>If the {@link KHRExternalMemory VK_KHR_external_memory} extension is not enabled, and the value of {@link VkApplicationInfo}{@code ::apiVersion} used to create the {@code VkInstance} is not greater than or equal to Version 1.1, {@code srcQueueFamilyIndex} <b>must</b> not be {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL}</li>
 * <li>If the {@link KHRExternalMemory VK_KHR_external_memory} extension is not enabled, and the value of {@link VkApplicationInfo}{@code ::apiVersion} used to create the {@code VkInstance} is not greater than or equal to Version 1.1, {@code dstQueueFamilyIndex} <b>must</b> not be {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL}</li>
 * <li>If the {@link EXTQueueFamilyForeign VK_EXT_queue_family_foreign} extension is not enabled {@code srcQueueFamilyIndex} <b>must</b> not be {@link EXTQueueFamilyForeign#VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT}</li>
 * <li>If the {@link EXTQueueFamilyForeign VK_EXT_queue_family_foreign} extension is not enabled {@code dstQueueFamilyIndex} <b>must</b> not be {@link EXTQueueFamilyForeign#VK_QUEUE_FAMILY_FOREIGN_EXT QUEUE_FAMILY_FOREIGN_EXT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRVideoDecodeQueue#VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR} then {@code image} <b>must</b> have been created with {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRVideoDecodeQueue#VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR} then {@code image} <b>must</b> have been created with {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRVideoDecodeQueue#VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR} then {@code image} <b>must</b> have been created with {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRVideoEncodeQueue#VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR} then {@code image} <b>must</b> have been created with {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRVideoEncodeQueue#VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR} then {@code image} <b>must</b> have been created with {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRVideoEncodeQueue#VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR} then {@code image} <b>must</b> have been created with {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} then {@code image} <b>must</b> have been created with either the {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} usage bits, and the {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} usage bits, and the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} usage bit</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFeedbackLoopLayout">{@code attachmentFeedbackLoopLayout}</a> feature is not enabled, {@code newLayout} <b>must</b> not be {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT}</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>{@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>subresourceRange.baseArrayLayer + subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code image} has a color format that is single-plane, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a color format and is not <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include at least one <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit or {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either or both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If the {@code aspectMask} member of {@code subresourceRange} includes {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}, {@code oldLayout} and {@code newLayout} <b>must</b> not be one of {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code aspectMask} member of {@code subresourceRange} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, {@code oldLayout} and {@code newLayout} <b>must</b> not be one of {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, and {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, at least one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, and {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code srcQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED} or {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, and {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code dstQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED} or {@link VK10#VK_QUEUE_FAMILY_EXTERNAL QUEUE_FAMILY_EXTERNAL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkExternalMemoryAcquireUnmodifiedEXT} or {@link VkSampleLocationsInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageSubresourceRange}, {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier}, {@link VK10#vkCmdWaitEvents CmdWaitEvents}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageMemoryBarrier {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccessFlags {@link #srcAccessMask};
 *     VkAccessFlags {@link #dstAccessMask};
 *     VkImageLayout {@link #oldLayout};
 *     VkImageLayout {@link #newLayout};
 *     uint32_t {@link #srcQueueFamilyIndex};
 *     uint32_t {@link #dstQueueFamilyIndex};
 *     VkImage {@link #image};
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} {@link #subresourceRange};
 * }</code></pre>
 */
public class VkImageMemoryBarrier extends Struct<VkImageMemoryBarrier> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCACCESSMASK,
        DSTACCESSMASK,
        OLDLAYOUT,
        NEWLAYOUT,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        IMAGE,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
        OLDLAYOUT = layout.offsetof(4);
        NEWLAYOUT = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        IMAGE = layout.offsetof(8);
        SUBRESOURCERANGE = layout.offsetof(9);
    }

    protected VkImageMemoryBarrier(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageMemoryBarrier create(long address, @Nullable ByteBuffer container) {
        return new VkImageMemoryBarrier(address, container);
    }

    /**
     * Creates a {@code VkImageMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryBarrier(ByteBuffer container) {
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
    /** a bitmask of {@code VkAccessFlagBits} specifying a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a>. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** a bitmask of {@code VkAccessFlagBits} specifying a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a>. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
    /** the old layout in an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** the new layout in an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** the source queue family for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** the destination queue family for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** a handle to the image affected by this barrier. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** describes the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">image subresource range</a> within {@code image} that is affected by this barrier. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageMemoryBarrier sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER} value to the {@link #sType} field. */
    public VkImageMemoryBarrier sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageMemoryBarrier pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkImageMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccessMask} field. */
    public VkImageMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #oldLayout} field. */
    public VkImageMemoryBarrier oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #newLayout} field. */
    public VkImageMemoryBarrier newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #srcQueueFamilyIndex} field. */
    public VkImageMemoryBarrier srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #dstQueueFamilyIndex} field. */
    public VkImageMemoryBarrier dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkImageMemoryBarrier image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@link #subresourceRange} field. */
    public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@link #subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageMemoryBarrier subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageMemoryBarrier set(
        int sType,
        long pNext,
        int srcAccessMask,
        int dstAccessMask,
        int oldLayout,
        int newLayout,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long image,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryBarrier set(VkImageMemoryBarrier src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier malloc() {
        return new VkImageMemoryBarrier(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier calloc() {
        return new VkImageMemoryBarrier(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryBarrier(memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance for the specified memory address. */
    public static VkImageMemoryBarrier create(long address) {
        return new VkImageMemoryBarrier(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier createSafe(long address) {
        return address == NULL ? null : new VkImageMemoryBarrier(address, null);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageMemoryBarrier.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier malloc(MemoryStack stack) {
        return new VkImageMemoryBarrier(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier calloc(MemoryStack stack) {
        return new VkImageMemoryBarrier(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier.PNEXT); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.DSTACCESSMASK); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.NEWLAYOUT); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier.IMAGE); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier.PNEXT, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.NEWLAYOUT, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier.IMAGE, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageMemoryBarrier} structs. */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier, Buffer> implements NativeResource {

        private static final VkImageMemoryBarrier ELEMENT_FACTORY = VkImageMemoryBarrier.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryBarrier.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryBarrier#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageMemoryBarrier#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageMemoryBarrier.nsType(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageMemoryBarrier.npNext(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkImageMemoryBarrier.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkImageMemoryBarrier.ndstAccessMask(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkImageMemoryBarrier.noldLayout(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkImageMemoryBarrier.nnewLayout(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkImageMemoryBarrier.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkImageMemoryBarrier.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier#image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageMemoryBarrier.nimage(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@link VkImageMemoryBarrier#subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier.nsubresourceRange(address()); }

        /** Sets the specified value to the {@link VkImageMemoryBarrier#sType} field. */
        public VkImageMemoryBarrier.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryBarrier.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER} value to the {@link VkImageMemoryBarrier#sType} field. */
        public VkImageMemoryBarrier.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER); }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#pNext} field. */
        public VkImageMemoryBarrier.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryBarrier.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier.Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier.Buffer pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#srcAccessMask} field. */
        public VkImageMemoryBarrier.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkImageMemoryBarrier.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#dstAccessMask} field. */
        public VkImageMemoryBarrier.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkImageMemoryBarrier.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#oldLayout} field. */
        public VkImageMemoryBarrier.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#newLayout} field. */
        public VkImageMemoryBarrier.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier.nnewLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#srcQueueFamilyIndex} field. */
        public VkImageMemoryBarrier.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#dstQueueFamilyIndex} field. */
        public VkImageMemoryBarrier.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier#image} field. */
        public VkImageMemoryBarrier.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryBarrier.nimage(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@link VkImageMemoryBarrier#subresourceRange} field. */
        public VkImageMemoryBarrier.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier.nsubresourceRange(address(), value); return this; }
        /** Passes the {@link VkImageMemoryBarrier#subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageMemoryBarrier.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}