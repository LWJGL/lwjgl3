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
 * Structure specifying the parameters of a newly created image object.
 * 
 * <h5>Description</h5>
 * 
 * <p>Images created with {@code tiling} equal to {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} have further restrictions on their limits and capabilities compared to images created with {@code tiling} equal to {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. Creation of images with tiling {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} <b>may</b> not be supported unless other parameters meet all of the constraints:</p>
 * 
 * <ul>
 * <li>{@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>{@code format} is not a depth/stencil format</li>
 * <li>{@code mipLevels} is 1</li>
 * <li>{@code arrayLayers} is 1</li>
 * <li>{@code samples} is {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>{@code usage} only includes {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} and/or {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</li>
 * </ul>
 * 
 * <p>Images created with one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>, have further restrictions on their limits and capabilities compared to images created with other formats. Creation of images with a format requiring <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">Y′C<sub>B</sub>C<sub>R</sub> conversion</a> <b>may</b> not be supported unless other parameters meet all of the constraints:</p>
 * 
 * <ul>
 * <li>{@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>{@code mipLevels} is 1</li>
 * <li>{@code arrayLayers} is 1</li>
 * <li>{@code samples} is {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * </ul>
 * 
 * <p>Implementations <b>may</b> support additional limits and capabilities beyond those listed above.</p>
 * 
 * <p>To determine the set of valid {@code usage} bits for a given format, call {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}.</p>
 * 
 * <p>If the size of the resultant image would exceed {@code maxResourceSize}, then {@link VK10#vkCreateImage CreateImage} <b>must</b> fail and return {@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}. This failure <b>may</b> occur even when all image creation parameters satisfy their valid usage requirements.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For images created without {@link VK11#VK_IMAGE_CREATE_EXTENDED_USAGE_BIT IMAGE_CREATE_EXTENDED_USAGE_BIT} a {@code usage} bit is valid if it is supported for the format the image is created with.</p>
 * 
 * <p>For images created with {@link VK11#VK_IMAGE_CREATE_EXTENDED_USAGE_BIT IMAGE_CREATE_EXTENDED_USAGE_BIT} a {@code usage} bit is valid if it is supported for at least one of the formats a {@code VkImageView} created from the image <b>can</b> have (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">Image Views</a> for more detail).</p>
 * </div>
 * 
 * <h5>Image Creation Limits</h5>
 * 
 * <p>Valid values for some image creation parameters are limited by a numerical upper bound or by inclusion in a bitset. For example, {@link VkImageCreateInfo}{@code ::arrayLayers} is limited by {@code imageCreateMaxArrayLayers}, defined below; and {@link VkImageCreateInfo}{@code ::samples} is limited by {@code imageCreateSampleCounts}, also defined below.</p>
 * 
 * <p>Several limiting values are defined below, as well as assisting values from which the limiting values are derived. The limiting values are referenced by the relevant valid usage statements of {@link VkImageCreateInfo}.</p>
 * 
 * <ul>
 * <li>Let {@code uint64_t imageCreateDrmFormatModifiers[]} be the set of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-drm-format-modifier">Linux DRM format modifiers</a> that the resultant image <b>may</b> have.
 * 
 * <ul>
 * <li>If {@code tiling} is not {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then {@code imageCreateDrmFormatModifiers} is empty.</li>
 * <li>If {@link VkImageCreateInfo}{@code ::pNext} contains {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}, then {@code imageCreateDrmFormatModifiers} contains exactly one modifier, {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}{@code ::drmFormatModifier}.</li>
 * <li>If {@link VkImageCreateInfo}{@code ::pNext} contains {@link VkImageDrmFormatModifierListCreateInfoEXT}, then {@code imageCreateDrmFormatModifiers} contains the entire array {@link VkImageDrmFormatModifierListCreateInfoEXT}{@code ::pDrmFormatModifiers}.</li>
 * </ul>
 * </li>
 * <li>Let {@code VkBool32 imageCreateMaybeLinear} indicate if the resultant image may be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-resource">linear</a>.
 * 
 * <ul>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, then {@code imageCreateMaybeLinear} is {@link VK10#VK_TRUE TRUE}.</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, then {@code imageCreateMaybeLinear} is {@link VK10#VK_FALSE FALSE}.</li>
 * <li>If {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then {@code imageCreateMaybeLinear} is {@link VK10#VK_TRUE TRUE} if and only if {@code imageCreateDrmFormatModifiers} contains {@code DRM_FORMAT_MOD_LINEAR}.</li>
 * </ul>
 * </li>
 * <li>Let {@code VkFormatFeatureFlags imageCreateFormatFeatures} be the set of valid <em>format features</em> available during image creation.
 * 
 * <ul>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, then {@code imageCreateFormatFeatures} is the value of {@link VkFormatProperties}{@code ::linearTilingFeatures} found by calling {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with parameter {@code format} equal to {@link VkImageCreateInfo}{@code ::format}.</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, then {@code imageCreateFormatFeatures} is the value of {@link VkFormatProperties}{@code ::optimalTilingFeatures} found by calling {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} with parameter {@code format} equal to {@link VkImageCreateInfo}{@code ::format}.</li>
 * <li>If {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the value of {@code imageCreateFormatFeatures} is found by calling {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} with {@link VkImageFormatProperties}{@code ::format} equal to {@link VkImageCreateInfo}{@code ::format} and with {@link VkDrmFormatModifierPropertiesListEXT} chained into {@link VkFormatProperties2}; by collecting all members of the returned array {@link VkDrmFormatModifierPropertiesListEXT}{@code ::pDrmFormatModifierProperties} whose {@code drmFormatModifier} belongs to {@code imageCreateDrmFormatModifiers}; and by taking the bitwise intersection, over the collected array members, of {@code drmFormatModifierTilingFeatures}. (The resultant {@code imageCreateFormatFeatures} <b>may</b> be empty).</li>
 * </ul>
 * </li>
 * <li>Let {@code VkImageFormatProperties2 imageCreateImageFormatPropertiesList[]} be the list of structures obtained by calling {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}, possibly multiple times, as follows:
 * 
 * <ul>
 * <li>The parameters {@link VkPhysicalDeviceImageFormatInfo2}{@code ::format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} <b>must</b> be equal to those in {@link VkImageCreateInfo}.</li>
 * <li>If {@link VkImageCreateInfo}{@code ::pNext} contains a {@link VkExternalMemoryImageCreateInfo} structure whose {@code handleTypes} is not 0, then {@link VkPhysicalDeviceImageFormatInfo2}{@code ::pNext} <b>must</b> contain a {@link VkPhysicalDeviceExternalImageFormatInfo} structure whose {@code handleType} is not 0; and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} <b>must</b> be called for each handle type in {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes}, successively setting {@link VkPhysicalDeviceExternalImageFormatInfo}{@code ::handleType} on each call.</li>
 * <li>If {@link VkImageCreateInfo}{@code ::pNext} contains no {@link VkExternalMemoryImageCreateInfo} structure, or contains a structure whose {@code handleTypes} is 0, then {@link VkPhysicalDeviceImageFormatInfo2}{@code ::pNext} <b>must</b> either contain no {@link VkPhysicalDeviceExternalImageFormatInfo} structure, or contain a structure whose {@code handleType} is 0.</li>
 * <li>If {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then {@link VkPhysicalDeviceImageFormatInfo2}{@code ::pNext} <b>must</b> contain a {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} structure where {@code sharingMode} is equal to {@link VkImageCreateInfo}{@code ::sharingMode}; and, if {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, then {@code queueFamilyIndexCount} and {@code pQueueFamilyIndices} <b>must</b> be equal to those in {@link VkImageCreateInfo}; and, if {@code flags} contains {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}, then the {@link VkImageFormatListCreateInfo} structure included in the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2} <b>must</b> be equivalent to the one included in the {@code pNext} chain of {@link VkImageCreateInfo}; and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} <b>must</b> be called for each modifier in {@code imageCreateDrmFormatModifiers}, successively setting {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT}{@code ::drmFormatModifier} on each call.</li>
 * <li>If {@code tiling} is not {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then {@link VkPhysicalDeviceImageFormatInfo2}{@code ::pNext} <b>must</b> contain no {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} structure.</li>
 * <li>If any call to {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} returns an error, then {@code imageCreateImageFormatPropertiesList} is defined to be the empty list.</li>
 * </ul>
 * </li>
 * <li>Let {@code uint32_t imageCreateMaxMipLevels} be the minimum value of {@link VkImageFormatProperties}{@code ::maxMipLevels} in {@code imageCreateImageFormatPropertiesList}. The value is undefined if {@code imageCreateImageFormatPropertiesList} is empty.</li>
 * <li>Let {@code uint32_t imageCreateMaxArrayLayers} be the minimum value of {@link VkImageFormatProperties}{@code ::maxArrayLayers} in {@code imageCreateImageFormatPropertiesList}. The value is undefined if {@code imageCreateImageFormatPropertiesList} is empty.</li>
 * <li>Let {@code VkExtent3D imageCreateMaxExtent} be the component-wise minimum over all {@link VkImageFormatProperties}{@code ::maxExtent} values in {@code imageCreateImageFormatPropertiesList}. The value is undefined if {@code imageCreateImageFormatPropertiesList} is empty.</li>
 * <li>Let {@code VkSampleCountFlags imageCreateSampleCounts} be the intersection of each {@link VkImageFormatProperties}{@code ::sampleCounts} in {@code imageCreateImageFormatPropertiesList}. The value is undefined if {@code imageCreateImageFormatPropertiesList} is empty.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each of the following values (as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>) <b>must</b> not be undefined : {@code imageCreateMaxMipLevels}, {@code imageCreateMaxArrayLayers}, {@code imageCreateMaxExtent}, and {@code imageCreateSampleCounts}</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} or {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} for the {@code physicalDevice} that was used to create {@code device}</li>
 * <li>{@code format} <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>{@code extent.width} <b>must</b> be greater than 0</li>
 * <li>{@code extent.height} <b>must</b> be greater than 0</li>
 * <li>{@code extent.depth} <b>must</b> be greater than 0</li>
 * <li>{@code mipLevels} <b>must</b> be greater than 0</li>
 * <li>{@code arrayLayers} <b>must</b> be greater than 0</li>
 * <li>If {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If {@code flags} contains {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If {@code flags} contains {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</li>
 * <li>{@code extent.width} <b>must</b> be less than or equal to {@code imageCreateMaxExtent.width} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>)</li>
 * <li>{@code extent.height} <b>must</b> be less than or equal to {@code imageCreateMaxExtent.height} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>)</li>
 * <li>{@code extent.depth} <b>must</b> be less than or equal to {@code imageCreateMaxExtent.depth} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>)</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code extent.width} and {@code extent.height} <b>must</b> be equal and {@code arrayLayers} <b>must</b> be greater than or equal to 6</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, both {@code extent.height} and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code extent.depth} <b>must</b> be 1</li>
 * <li>{@code mipLevels} <b>must</b> be less than or equal to the number of levels in the complete mipmap chain based on <code>extent.width</code>, <code>extent.height</code>, and <code>extent.depth</code></li>
 * <li>{@code mipLevels} <b>must</b> be less than or equal to {@code imageCreateMaxMipLevels} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>)</li>
 * <li>{@code arrayLayers} <b>must</b> be less than or equal to {@code imageCreateMaxArrayLayers} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>)</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code arrayLayers} <b>must</b> be 1</li>
 * <li>If {@code samples} is not {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}, then {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}, {@code mipLevels} <b>must</b> be equal to 1, and {@code imageCreateMaybeLinear} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>) <b>must</b> be {@link VK10#VK_FALSE FALSE},</li>
 * <li>If {@code samples} is not {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}, {@code usage} <b>must</b> not contain {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, then bits other than {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} <b>must</b> not be set</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferWidth}</li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferHeight}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapOffset">{@code fragmentDensityMapOffset}</a> is not enabled and {@code usage} includes {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, {@code extent.width} <b>must</b> be less than or equal to <code>ceil(maxFramebufferWidth / minFragmentDensityTexelSize<sub>width</sub>)</code></li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapOffset">{@code fragmentDensityMapOffset}</a> is not enabled and {@code usage} includes {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, {@code extent.height} <b>must</b> be less than or equal to <code>ceil(maxFramebufferHeight / minFragmentDensityTexelSize<sub>height</sub>)</code></li>
 * <li>If {@code usage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, {@code usage} <b>must</b> also contain at least one of {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>{@code samples} <b>must</b> be a bit value that is set in {@code imageCreateSampleCounts} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>)</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderStorageImageMultisample">multisampled storage images</a> feature is not enabled, and {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code samples} <b>must</b> be {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseBinding">sparse bindings</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidencyAliased">sparse aliased residency</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If {@code imageType} is {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidencyImage2D">sparse residency for 2D images</a> feature is not enabled, and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidencyImage3D">sparse residency for 3D images</a> feature is not enabled, and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidency2Samples">sparse residency for images with 2 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidency4Samples">sparse residency for images with 4 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidency8Samples">sparse residency for images with 8 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseResidency16Samples">sparse residency for images with 16 samples</a> feature is not enabled, {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code samples} is {@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If {@code flags} contains {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}, it <b>must</b> also contain {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If any of the bits {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT} are set, {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT} <b>must</b> not also be set</li>
 * <li>If the protected memory feature is not enabled, {@code flags} <b>must</b> not contain {@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT}</li>
 * <li>If any of the bits {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT} are set, {@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT} <b>must</b> not also be set</li>
 * <li>If the {@code pNext} chain includes a {@link VkExternalMemoryImageCreateInfoNV} structure, it <b>must</b> not contain a {@link VkExternalMemoryImageCreateInfo} structure</li>
 * <li>If the {@code pNext} chain includes a {@link VkExternalMemoryImageCreateInfo} structure, its {@code handleTypes} member <b>must</b> only contain bits that are also in {@link VkExternalImageFormatProperties}{@code ::externalMemoryProperties.compatibleHandleTypes}, as returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure, and with a {@link VkPhysicalDeviceExternalImageFormatInfo} structure included in the {@code pNext} chain, with a {@code handleType} equal to any one of the handle types specified in {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExternalMemoryImageCreateInfoNV} structure, its {@code handleTypes} member <b>must</b> only contain bits that are also in {@link VkExternalImageFormatPropertiesNV}{@code ::externalMemoryProperties.compatibleHandleTypes}, as returned by {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV} with {@code format}, {@code imageType}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure, and with {@code externalHandleType} equal to any one of the handle types specified in {@link VkExternalMemoryImageCreateInfoNV}{@code ::handleTypes}</li>
 * <li>If the logical device was created with {@link VkDeviceGroupDeviceCreateInfo}{@code ::physicalDeviceCount} equal to 1, {@code flags} <b>must</b> not contain {@link VK11#VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT}</li>
 * <li>If {@code flags} contains {@link VK11#VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT}, then {@code mipLevels} <b>must</b> be one, {@code arrayLayers} <b>must</b> be one, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}. and {@code imageCreateMaybeLinear} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>) <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code flags} contains {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT}, then {@code format} <b>must</b> be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#compressed_image_formats">compressed image format</a></li>
 * <li>If {@code flags} contains {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT}, then {@code flags} <b>must</b> also contain {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}</li>
 * <li>{@code initialLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExternalMemoryImageCreateInfo} or {@link VkExternalMemoryImageCreateInfoNV} structure whose {@code handleTypes} member is not 0, {@code initialLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}</li>
 * <li>If the image {@code format} is one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>, {@code mipLevels} <b>must</b> be 1</li>
 * <li>If the image {@code format} is one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>, {@code samples} <b>must</b> be {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If the image {@code format} is one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If the image {@code format} is one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>, and the {@code ycbcrImageArrays} feature is not enabled, {@code arrayLayers} <b>must</b> be 1</li>
 * <li>If {@code format} is a <em>multi-planar</em> format, and if {@code imageCreateFormatFeatures} (as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-creation-limits">Image Creation Limits</a>) does not contain {@link VK11#VK_FORMAT_FEATURE_DISJOINT_BIT FORMAT_FEATURE_DISJOINT_BIT}, then {@code flags} <b>must</b> not contain {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT}</li>
 * <li>If {@code format} is not a <em>multi-planar</em> format, and {@code flags} does not include {@link VK11#VK_IMAGE_CREATE_ALIAS_BIT IMAGE_CREATE_ALIAS_BIT}, {@code flags} <b>must</b> not contain {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT}</li>
 * <li>If {@code format} has a {@code _422} or {@code _420} suffix, {@code width} <b>must</b> be a multiple of 2</li>
 * <li>If {@code format} has a {@code _420} suffix, {@code height} <b>must</b> be a multiple of 2</li>
 * <li>If {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the {@code pNext} chain <b>must</b> include exactly one of {@link VkImageDrmFormatModifierListCreateInfoEXT} or {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} structures</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageDrmFormatModifierListCreateInfoEXT} or {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} structure, then {@code tiling} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}</li>
 * <li>If {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}, then the {@code pNext} chain <b>must</b> include a {@link VkImageFormatListCreateInfo} structure with non-zero {@code viewFormatCount}</li>
 * <li>If {@code flags} contains {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} {@code format} <b>must</b> be a depth or depth/stencil format</li>
 * <li>If {@code format} is a depth-stencil format, {@code usage} includes {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure, then its {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage} member <b>must</b> also include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code format} is a depth-stencil format, {@code usage} does not include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure, then its {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage} member <b>must</b> also not include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code format} is a depth-stencil format, {@code usage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure, then its {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage} member <b>must</b> also include {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</li>
 * <li>If {@code format} is a depth-stencil format, {@code usage} does not include {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure, then its {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage} member <b>must</b> also not include {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</li>
 * <li>If {@code Format} is a depth-stencil format and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure with its {@code stencilUsage} member including {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferWidth}</li>
 * <li>If {@code format} is a depth-stencil format and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure with its {@code stencilUsage} member including {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@code extent.height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferHeight}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderStorageImageMultisample">multisampled storage images</a> feature is not enabled, {@code format} is a depth-stencil format and the {@code pNext} chain includes a {@link VkImageStencilUsageCreateInfo} structure with its {@code stencilUsage} including {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code samples} <b>must</b> be {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code flags} contains {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} or {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</li>
 * <li>If {@code flags} contains {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV}, it <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} and the {@code format} <b>must</b> not be a depth/stencil format</li>
 * <li>If {@code flags} contains {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, {@code extent.width} and {@code extent.height} <b>must</b> be greater than 1</li>
 * <li>If {@code flags} contains {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} and {@code imageType} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, {@code extent.width}, {@code extent.height}, and {@code extent.depth} <b>must</b> be greater than 1</li>
 * <li>If {@code usage} includes {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If {@code usage} includes {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}, {@code samples} <b>must</b> be {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code usage} includes {@link NVShadingRateImage#VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV}, {@code tiling} <b>must</b> be {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</li>
 * <li>If {@code flags} contains {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}, {@code tiling} <b>must</b> be {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}</li>
 * <li>If {@code flags} contains {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}, {@code imageType} <b>must</b> be {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If {@code flags} contains {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}, {@code flags} <b>must</b> not contain {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</li>
 * <li>If {@code flags} contains {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}, {@code mipLevels} <b>must</b> be 1</li>
 * <li>If {@code usage} includes {@link HUAWEIInvocationMask#VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI}, {@code tiling} <b>must</b> be {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::imageView2DOn3DImage} is {@link VK10#VK_FALSE FALSE}, {@code flags} <b>must</b> not contain {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::multisampleArrayImage} is {@link VK10#VK_FALSE FALSE}, and {@code samples} is not {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}, then {@code arrayLayers} <b>must</b> be 1</li>
 * <li>If a {@link VkImageFormatListCreateInfo} structure was included in the {@code pNext} chain and {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} is not zero, then all of the formats in {@link VkImageFormatListCreateInfo}{@code ::pViewFormats} <b>must</b> be compatible with the {@code format} as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility">compatibility table</a></li>
 * <li>If {@code flags} does not contain {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} and the {@code pNext} chain includes a {@link VkImageFormatListCreateInfo} structure, then {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} <b>must</b> be 0 or 1</li>
 * <li>If {@code usage} includes {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a valid {@link VkVideoProfilesKHR} structure which includes at least one {@link VkVideoProfileKHR} with a decode codec-operation</li>
 * <li>If {@code usage} includes {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a valid {@link VkVideoProfilesKHR} structure which includes at least one {@link VkVideoProfileKHR} with a encode codec-operation</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDedicatedAllocationImageCreateInfoNV}, {@link VkExternalMemoryImageCreateInfo}, {@link VkExternalMemoryImageCreateInfoNV}, {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}, {@link VkImageDrmFormatModifierListCreateInfoEXT}, {@link VkImageFormatListCreateInfo}, {@link VkImageStencilUsageCreateInfo}, {@link VkImageSwapchainCreateInfoKHR}, {@link VkVideoDecodeH264ProfileEXT}, {@link VkVideoDecodeH265ProfileEXT}, {@link VkVideoEncodeH264ProfileEXT}, {@link VkVideoEncodeH265ProfileEXT}, {@link VkVideoProfileKHR}, or {@link VkVideoProfilesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * <li>{@code imageType} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code samples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * <li>{@code initialLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceImageMemoryRequirements}, {@link VkExtent3D}, {@link VK10#vkCreateImage CreateImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageCreateFlags {@link #flags};
 *     VkImageType {@link #imageType};
 *     VkFormat {@link #format};
 *     {@link VkExtent3D VkExtent3D} {@link #extent};
 *     uint32_t {@link #mipLevels};
 *     uint32_t {@link #arrayLayers};
 *     VkSampleCountFlagBits {@link #samples};
 *     VkImageTiling {@link #tiling};
 *     VkImageUsageFlags {@link #usage};
 *     VkSharingMode {@link #sharingMode};
 *     uint32_t {@link #queueFamilyIndexCount};
 *     uint32_t const * {@link #pQueueFamilyIndices};
 *     VkImageLayout {@link #initialLayout};
 * }</code></pre>
 */
public class VkImageCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        IMAGETYPE,
        FORMAT,
        EXTENT,
        MIPLEVELS,
        ARRAYLAYERS,
        SAMPLES,
        TILING,
        USAGE,
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES,
        INITIALLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGETYPE = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        EXTENT = layout.offsetof(5);
        MIPLEVELS = layout.offsetof(6);
        ARRAYLAYERS = layout.offsetof(7);
        SAMPLES = layout.offsetof(8);
        TILING = layout.offsetof(9);
        USAGE = layout.offsetof(10);
        SHARINGMODE = layout.offsetof(11);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(12);
        PQUEUEFAMILYINDICES = layout.offsetof(13);
        INITIALLAYOUT = layout.offsetof(14);
    }

    /**
     * Creates a {@code VkImageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkImageCreateFlagBits} describing additional parameters of the image. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkImageType} value specifying the basic dimensionality of the image. Layers in array textures do not count as a dimension for the purposes of the image type. */
    @NativeType("VkImageType")
    public int imageType() { return nimageType(address()); }
    /** a {@code VkFormat} describing the format and type of the texel blocks that will be contained in the image. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** a {@link VkExtent3D} describing the number of data elements in each dimension of the base level. */
    public VkExtent3D extent() { return nextent(address()); }
    /** describes the number of levels of detail available for minified sampling of the image. */
    @NativeType("uint32_t")
    public int mipLevels() { return nmipLevels(address()); }
    /** the number of layers in the image. */
    @NativeType("uint32_t")
    public int arrayLayers() { return narrayLayers(address()); }
    /** a {@code VkSampleCountFlagBits} value specifying the number of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling">samples per texel</a>. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** a {@code VkImageTiling} value specifying the tiling arrangement of the texel blocks in memory. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the image. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** a {@code VkSharingMode} value specifying the sharing mode of the image when it will be accessed by multiple queue families. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** the number of entries in the {@code pQueueFamilyIndices} array. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** a pointer to an array of queue families that will access this image. It is ignored if {@code sharingMode} is not {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
    /** a {@code VkImageLayout} value specifying the initial {@code VkImageLayout} of all image subresources of the image. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-layouts">Image Layouts</a>. */
    @NativeType("VkImageLayout")
    public int initialLayout() { return ninitialLayout(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO} value to the {@link #sType} field. */
    public VkImageCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDedicatedAllocationImageCreateInfoNV} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkDedicatedAllocationImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryImageCreateInfo} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryImageCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryImageCreateInfoNV} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageDrmFormatModifierExplicitCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageDrmFormatModifierListCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageDrmFormatModifierListCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfilesKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoProfilesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkImageCreateInfo flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #imageType} field. */
    public VkImageCreateInfo imageType(@NativeType("VkImageType") int value) { nimageType(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkImageCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #extent} field. */
    public VkImageCreateInfo extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@link #extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCreateInfo extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }
    /** Sets the specified value to the {@link #mipLevels} field. */
    public VkImageCreateInfo mipLevels(@NativeType("uint32_t") int value) { nmipLevels(address(), value); return this; }
    /** Sets the specified value to the {@link #arrayLayers} field. */
    public VkImageCreateInfo arrayLayers(@NativeType("uint32_t") int value) { narrayLayers(address(), value); return this; }
    /** Sets the specified value to the {@link #samples} field. */
    public VkImageCreateInfo samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@link #tiling} field. */
    public VkImageCreateInfo tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkImageCreateInfo usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #sharingMode} field. */
    public VkImageCreateInfo sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndexCount} field. */
    public VkImageCreateInfo queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pQueueFamilyIndices} field. */
    public VkImageCreateInfo pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
    /** Sets the specified value to the {@link #initialLayout} field. */
    public VkImageCreateInfo initialLayout(@NativeType("VkImageLayout") int value) { ninitialLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int imageType,
        int format,
        VkExtent3D extent,
        int mipLevels,
        int arrayLayers,
        int samples,
        int tiling,
        int usage,
        int sharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices,
        int initialLayout
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        imageType(imageType);
        format(format);
        extent(extent);
        mipLevels(mipLevels);
        arrayLayers(arrayLayers);
        samples(samples);
        tiling(tiling);
        usage(usage);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        initialLayout(initialLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCreateInfo set(VkImageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCreateInfo malloc() {
        return wrap(VkImageCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCreateInfo calloc() {
        return wrap(VkImageCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageCreateInfo} instance for the specified memory address. */
    public static VkImageCreateInfo create(long address) {
        return wrap(VkImageCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkImageCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCreateInfo malloc(MemoryStack stack) {
        return wrap(VkImageCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCreateInfo calloc(MemoryStack stack) {
        return wrap(VkImageCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.FLAGS); }
    /** Unsafe version of {@link #imageType}. */
    public static int nimageType(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.IMAGETYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.FORMAT); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCreateInfo.EXTENT); }
    /** Unsafe version of {@link #mipLevels}. */
    public static int nmipLevels(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.MIPLEVELS); }
    /** Unsafe version of {@link #arrayLayers}. */
    public static int narrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.ARRAYLAYERS); }
    /** Unsafe version of {@link #samples}. */
    public static int nsamples(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.SAMPLES); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.TILING); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.USAGE); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    @Nullable public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
    /** Unsafe version of {@link #initialLayout}. */
    public static int ninitialLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageCreateInfo.INITIALLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #imageType(int) imageType}. */
    public static void nimageType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.IMAGETYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCreateInfo.EXTENT, VkExtent3D.SIZEOF); }
    /** Unsafe version of {@link #mipLevels(int) mipLevels}. */
    public static void nmipLevels(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.MIPLEVELS, value); }
    /** Unsafe version of {@link #arrayLayers(int) arrayLayers}. */
    public static void narrayLayers(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.ARRAYLAYERS, value); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static void nsamples(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.SAMPLES, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.TILING, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #initialLayout(int) initialLayout}. */
    public static void ninitialLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCreateInfo.INITIALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkImageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageCreateInfo, Buffer> implements NativeResource {

        private static final VkImageCreateInfo ELEMENT_FACTORY = VkImageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkImageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkImageCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkImageCreateInfo#flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkImageCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkImageCreateInfo#imageType} field. */
        @NativeType("VkImageType")
        public int imageType() { return VkImageCreateInfo.nimageType(address()); }
        /** @return the value of the {@link VkImageCreateInfo#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageCreateInfo.nformat(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkImageCreateInfo#extent} field. */
        public VkExtent3D extent() { return VkImageCreateInfo.nextent(address()); }
        /** @return the value of the {@link VkImageCreateInfo#mipLevels} field. */
        @NativeType("uint32_t")
        public int mipLevels() { return VkImageCreateInfo.nmipLevels(address()); }
        /** @return the value of the {@link VkImageCreateInfo#arrayLayers} field. */
        @NativeType("uint32_t")
        public int arrayLayers() { return VkImageCreateInfo.narrayLayers(address()); }
        /** @return the value of the {@link VkImageCreateInfo#samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkImageCreateInfo.nsamples(address()); }
        /** @return the value of the {@link VkImageCreateInfo#tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkImageCreateInfo.ntiling(address()); }
        /** @return the value of the {@link VkImageCreateInfo#usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkImageCreateInfo.nusage(address()); }
        /** @return the value of the {@link VkImageCreateInfo#sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkImageCreateInfo.nsharingMode(address()); }
        /** @return the value of the {@link VkImageCreateInfo#queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkImageCreateInfo.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkImageCreateInfo#pQueueFamilyIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() { return VkImageCreateInfo.npQueueFamilyIndices(address()); }
        /** @return the value of the {@link VkImageCreateInfo#initialLayout} field. */
        @NativeType("VkImageLayout")
        public int initialLayout() { return VkImageCreateInfo.ninitialLayout(address()); }

        /** Sets the specified value to the {@link VkImageCreateInfo#sType} field. */
        public VkImageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO} value to the {@link VkImageCreateInfo#sType} field. */
        public VkImageCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkImageCreateInfo#pNext} field. */
        public VkImageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDedicatedAllocationImageCreateInfoNV} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkDedicatedAllocationImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryImageCreateInfo} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalMemoryImageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryImageCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalMemoryImageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryImageCreateInfoNV} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalMemoryImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageDrmFormatModifierExplicitCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageDrmFormatModifierListCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageDrmFormatModifierListCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfilesKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoProfilesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkImageCreateInfo#flags} field. */
        public VkImageCreateInfo.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkImageCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#imageType} field. */
        public VkImageCreateInfo.Buffer imageType(@NativeType("VkImageType") int value) { VkImageCreateInfo.nimageType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#format} field. */
        public VkImageCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkImageCreateInfo#extent} field. */
        public VkImageCreateInfo.Buffer extent(VkExtent3D value) { VkImageCreateInfo.nextent(address(), value); return this; }
        /** Passes the {@link VkImageCreateInfo#extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCreateInfo.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#mipLevels} field. */
        public VkImageCreateInfo.Buffer mipLevels(@NativeType("uint32_t") int value) { VkImageCreateInfo.nmipLevels(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#arrayLayers} field. */
        public VkImageCreateInfo.Buffer arrayLayers(@NativeType("uint32_t") int value) { VkImageCreateInfo.narrayLayers(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#samples} field. */
        public VkImageCreateInfo.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkImageCreateInfo.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#tiling} field. */
        public VkImageCreateInfo.Buffer tiling(@NativeType("VkImageTiling") int value) { VkImageCreateInfo.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#usage} field. */
        public VkImageCreateInfo.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkImageCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#sharingMode} field. */
        public VkImageCreateInfo.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkImageCreateInfo.nsharingMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#queueFamilyIndexCount} field. */
        public VkImageCreateInfo.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkImageCreateInfo.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkImageCreateInfo#pQueueFamilyIndices} field. */
        public VkImageCreateInfo.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkImageCreateInfo.npQueueFamilyIndices(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageCreateInfo#initialLayout} field. */
        public VkImageCreateInfo.Buffer initialLayout(@NativeType("VkImageLayout") int value) { VkImageCreateInfo.ninitialLayout(address(), value); return this; }

    }

}