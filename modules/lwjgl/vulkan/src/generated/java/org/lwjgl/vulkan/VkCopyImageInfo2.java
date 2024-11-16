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
 * Structure specifying parameters of an image copy command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK11#VK_FORMAT_FEATURE_TRANSFER_SRC_BIT FORMAT_FEATURE_TRANSFER_SRC_BIT}</li>
 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code srcImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}, or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>If {@code srcImage} and {@code dstImage} are the same, and any elements of {@code pRegions} contains the {@code srcSubresource} and {@code dstSubresource} with matching {@code mipLevel} and overlapping array layers, then the {@code srcImageLayout} and {@code dstImageLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}</li>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain {@link VK11#VK_FORMAT_FEATURE_TRANSFER_DST_BIT FORMAT_FEATURE_TRANSFER_DST_BIT}</li>
 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code dstImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}, or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>If the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} is not a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion"><em>multi-planar format</em></a>, the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-size-compatibility">size-compatible</a></li>
 * <li>In a copy to or from a plane of a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image</a>, the {@code VkFormat} of the image and plane <b>must</b> be compatible according to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatible-planes">the description of compatible planes</a> for the plane being copied</li>
 * <li>If the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} is a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#compressed_image_formats">compressed image format</a>, the formats <b>must</b> have the same texel block extent</li>
 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
 * <li>The {@code srcOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}’s command pool’s queue family, as described in {@link VkQueueFamilyProperties}</li>
 * <li>The {@code dstOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}’s command pool’s queue family, as described in {@link VkQueueFamilyProperties}</li>
 * <li>If neither {@code srcImage} nor {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} and {@code dstSubresource.aspectMask} <b>must</b> match</li>
 * <li>If {@code srcImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If {@code srcImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> and the {@code dstImage} does not have a multi-planar image format, then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> and the {@code srcImage} does not have a multi-planar image format, then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If the {@link KHRMaintenance1 VK_KHR_maintenance1} extension is not enabled, or {@link VkPhysicalDeviceProperties}{@code ::apiVersion} is less than Vulkan 1.1, and either {@code srcImage} or {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} and {@code dstSubresource.baseArrayLayer} <b>must</b> both be 0, and {@code srcSubresource.layerCount} and {@code dstSubresource.layerCount} <b>must</b> both be 1</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} <b>must</b> be 0 and {@code srcSubresource.layerCount} <b>must</b> be 1</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> specify aspects present in {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.x} and <code>(extent.width + srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.y} and <code>(extent.height + srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code srcOffset.z} and <code>(extent.depth + srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0</li>
 * <li>If the {@link KHRMaintenance1 VK_KHR_maintenance1} extension is not enabled, and {@link VkPhysicalDeviceProperties}{@code ::apiVersion} is less than Vulkan 1.1, {@code srcImage} and {@code dstImage} <b>must</b> have the same {@code VkImageType}</li>
 * <li>If the {@link KHRMaintenance1 VK_KHR_maintenance1} extension is not enabled, and {@link VkPhysicalDeviceProperties}{@code ::apiVersion} is less than Vulkan 1.1, {@code srcImage} or {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code srcImage} and {@code dstImage} have a different {@code VkImageType}, and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance5">{@code maintenance5}</a> is not enabled, one <b>must</b> be {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} and the other <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If {@code srcImage} and {@code dstImage} have the same {@code VkImageType}, for each element of {@code pRegions}, if neither of the {@code layerCount} members of {@code srcSubresource} or {@code dstSubresource} are {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, the {@code layerCount} members of {@code srcSubresource} or {@code dstSubresource} <b>must</b> match</li>
 * <li>If {@code srcImage} and {@code dstImage} have the same {@code VkImageType}, and one of the {@code layerCount} members of {@code srcSubresource} or {@code dstSubresource} is {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, the other member <b>must</b> be either {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} or equal to the {@code arrayLayers} member of the {@link VkImageCreateInfo} used to create the image minus {@code baseArrayLayer}</li>
 * <li>If {@code srcImage} and {@code dstImage} are both of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> equal {@code srcSubresource.layerCount}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> equal {@code dstSubresource.layerCount}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.x} and <code>(extent.width + dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.y} and <code>(extent.height + dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code dstOffset.z} and <code>(extent.depth + dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.x} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.y} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.x} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code srcOffset.x} and {@code extent.width} does not equal the width of the subresource specified by {@code srcSubresource}, {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code srcOffset.y} and {@code extent.height} does not equal the height of the subresource specified by {@code srcSubresource}, {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code srcOffset.z} and {@code extent.depth} does not equal the depth of the subresource specified by {@code srcSubresource}, {@code extent.depth} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.x} and {@code extent.width} does not equal the width of the subresource specified by {@code dstSubresource}, {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.y} and {@code extent.height} does not equal the height of the subresource specified by {@code dstSubresource}, {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.z} and {@code extent.depth} does not equal the depth of the subresource specified by {@code dstSubresource}, {@code extent.depth} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>If the {@code aspect} member of any element of {@code pRegions} includes any flag other than {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} or {@code srcImage} was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} <b>must</b> have been included in the {@link VkImageCreateInfo}{@code ::usage} used to create {@code srcImage}</li>
 * <li>If the {@code aspect} member of any element of {@code pRegions} includes any flag other than {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} or {@code dstImage} was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} <b>must</b> have been included in the {@link VkImageCreateInfo}{@code ::usage} used to create {@code dstImage}</li>
 * <li>If the {@code aspect} member of any element of {@code pRegions} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, and {@code srcImage} was created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} <b>must</b> have been included in the {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage} used to create {@code srcImage}</li>
 * <li>If the {@code aspect} member of any element of {@code pRegions} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, and {@code dstImage} was created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} <b>must</b> have been included in the {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage} used to create {@code dstImage}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code srcImage} is non-sparse then the image or the specified <em>disjoint</em> plane <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>If {@code srcSubresource.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>{@code srcSubresource.baseArrayLayer} + {@code srcSubresource.layerCount}</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>{@code srcImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} is non-sparse then the image or the specified <em>disjoint</em> plane <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>If {@code dstSubresource.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>{@code dstSubresource.baseArrayLayer} + {@code dstSubresource.layerCount}</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>{@code dstImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkImageCopy2} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageCopy2}, {@link VK13#vkCmdCopyImage2 CmdCopyImage2}, {@link KHRCopyCommands2#vkCmdCopyImage2KHR CmdCopyImage2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyImageInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #srcImage};
 *     VkImageLayout {@link #srcImageLayout};
 *     VkImage {@link #dstImage};
 *     VkImageLayout {@link #dstImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkImageCopy2 VkImageCopy2} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkCopyImageInfo2 extends Struct<VkCopyImageInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCIMAGE,
        SRCIMAGELAYOUT,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTIMAGE = layout.offsetof(4);
        DSTIMAGELAYOUT = layout.offsetof(5);
        REGIONCOUNT = layout.offsetof(6);
        PREGIONS = layout.offsetof(7);
    }

    protected VkCopyImageInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageInfo2(address, container);
    }

    /**
     * Creates a {@code VkCopyImageInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageInfo2(ByteBuffer container) {
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
    /** the source image. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** the current layout of the source image subresource. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** the destination image. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** the current layout of the destination image subresource. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** the number of regions to copy. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkImageCopy2} structures specifying the regions to copy. */
    @NativeType("VkImageCopy2 const *")
    public VkImageCopy2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyImageInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_INFO_2} value to the {@link #sType} field. */
    public VkCopyImageInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyImageInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImage} field. */
    public VkCopyImageInfo2 srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImageLayout} field. */
    public VkCopyImageInfo2 srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImage} field. */
    public VkCopyImageInfo2 dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImageLayout} field. */
    public VkCopyImageInfo2 dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCopy2.Buffer} to the {@link #pRegions} field. */
    public VkCopyImageInfo2 pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageInfo2 set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyImageInfo2 set(VkCopyImageInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageInfo2 malloc() {
        return new VkCopyImageInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageInfo2 calloc() {
        return new VkCopyImageInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageInfo2} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageInfo2} instance for the specified memory address. */
    public static VkCopyImageInfo2 create(long address) {
        return new VkCopyImageInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyImageInfo2 createSafe(long address) {
        return address == NULL ? null : new VkCopyImageInfo2(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyImageInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageInfo2 malloc(MemoryStack stack) {
        return new VkCopyImageInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageInfo2 calloc(MemoryStack stack) {
        return new VkCopyImageInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyImageInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageInfo2.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return memGetLong(struct + VkCopyImageInfo2.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return memGetInt(struct + VkCopyImageInfo2.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return memGetLong(struct + VkCopyImageInfo2.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return memGetInt(struct + VkCopyImageInfo2.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyImageInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageCopy2.Buffer npRegions(long struct) { return VkImageCopy2.create(memGetAddress(struct + VkCopyImageInfo2.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyImageInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { memPutLong(struct + VkCopyImageInfo2.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { memPutInt(struct + VkCopyImageInfo2.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { memPutLong(struct + VkCopyImageInfo2.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { memPutInt(struct + VkCopyImageInfo2.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyImageInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageCopy2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageCopy2.Buffer value) { memPutAddress(struct + VkCopyImageInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyImageInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageInfo2} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageInfo2, Buffer> implements NativeResource {

        private static final VkCopyImageInfo2 ELEMENT_FACTORY = VkCopyImageInfo2.create(-1L);

        /**
         * Creates a new {@code VkCopyImageInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyImageInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageInfo2.nsType(address()); }
        /** @return the value of the {@link VkCopyImageInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageInfo2.npNext(address()); }
        /** @return the value of the {@link VkCopyImageInfo2#srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageInfo2.nsrcImage(address()); }
        /** @return the value of the {@link VkCopyImageInfo2#srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageInfo2.nsrcImageLayout(address()); }
        /** @return the value of the {@link VkCopyImageInfo2#dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyImageInfo2.ndstImage(address()); }
        /** @return the value of the {@link VkCopyImageInfo2#dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyImageInfo2.ndstImageLayout(address()); }
        /** @return the value of the {@link VkCopyImageInfo2#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageInfo2.nregionCount(address()); }
        /** @return a {@link VkImageCopy2.Buffer} view of the struct array pointed to by the {@link VkCopyImageInfo2#pRegions} field. */
        @NativeType("VkImageCopy2 const *")
        public VkImageCopy2.Buffer pRegions() { return VkCopyImageInfo2.npRegions(address()); }

        /** Sets the specified value to the {@link VkCopyImageInfo2#sType} field. */
        public VkCopyImageInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_INFO_2} value to the {@link VkCopyImageInfo2#sType} field. */
        public VkCopyImageInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2); }
        /** Sets the specified value to the {@link VkCopyImageInfo2#pNext} field. */
        public VkCopyImageInfo2.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageInfo2#srcImage} field. */
        public VkCopyImageInfo2.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageInfo2.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageInfo2#srcImageLayout} field. */
        public VkCopyImageInfo2.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageInfo2.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageInfo2#dstImage} field. */
        public VkCopyImageInfo2.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyImageInfo2.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageInfo2#dstImageLayout} field. */
        public VkCopyImageInfo2.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageInfo2.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCopy2.Buffer} to the {@link VkCopyImageInfo2#pRegions} field. */
        public VkCopyImageInfo2.Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) { VkCopyImageInfo2.npRegions(address(), value); return this; }

    }

}