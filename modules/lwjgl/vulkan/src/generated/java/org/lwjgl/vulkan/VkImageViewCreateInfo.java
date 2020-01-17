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
 * Structure specifying parameters of a newly created image view.
 * 
 * <h5>Description</h5>
 * 
 * <p>Some of the {@code image} creation parameters are inherited by the view. In particular, image view creation inherits the implicit parameter {@code usage} specifying the allowed usages of the image view that, by default, takes the value of the corresponding {@code usage} parameter specified in {@link VkImageCreateInfo} at image creation time. If the image was has a depth-stencil format and was created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, the usage is calculated based on the {@code subresource.aspectMask} provided:</p>
 * 
 * <ul>
 * <li>If {@code aspectMask} includes only {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, the implicit {@code usage} is equal to {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage}.</li>
 * <li>If {@code aspectMask} includes only {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}, the implicit {@code usage} is equal to {@link VkImageCreateInfo}{@code ::usage}.</li>
 * <li>If both aspects are included in {@code aspectMask}, the implicit {@code usage} is equal to the intersection of {@link VkImageCreateInfo}{@code ::usage} and {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage}. The implicit {@code usage} <b>can</b> be overriden by adding a {@link VkImageViewUsageCreateInfo} structure to the {@code pNext} chain.</li>
 * </ul>
 * 
 * <p>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, and if the {@code format} of the image is not <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a>, {@code format} <b>can</b> be different from the image's format, but if {@code image} was created without the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag and they are not equal they <b>must</b> be <em>compatible</em>. Image format compatibility is defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatibility-classes">Format Compatibility Classes</a> section. Views of compatible formats will have the same mapping between texel coordinates and memory locations irrespective of the {@code format}, with only the interpretation of the bit pattern changing.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Values intended to be used with one view format <b>may</b> not be exactly preserved when written or read through a different format. For example, an integer value that happens to have the bit pattern of a floating point denorm or NaN <b>may</b> be flushed or canonicalized when written or read through a view with a floating point format. Similarly, a value written through a signed normalized format that has a bit pattern exactly equal to <code>-2<sup>b</sup></code> <b>may</b> be changed to <code>-2<sup>b</sup> + 1</code> as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fundamentals-fixedfpconv">Conversion from Normalized Fixed-Point to Floating-Point</a>.</p>
 * </div>
 * 
 * <p>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, {@code format} <b>must</b> be <em>compatible</em> with the image's format as described above, or <b>must</b> be an uncompressed format in which case it <b>must</b> be <em>size-compatible</em> with the image's format, as defined for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies-images-format-size-compatibility">copying data between images</a> In this case the resulting image view's texel dimensions equal the dimensions of the selected mip level divided by the compressed texel block size and rounded up.</p>
 * 
 * <p>If the image view is to be used with a sampler which supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, an <em>identically defined object</em> of type {@code VkSamplerYcbcrConversion} to that used to create the sampler <b>must</b> be passed to {@link VK10#vkCreateImageView CreateImageView} in a {@link VkSamplerYcbcrConversionInfo} included in the {@code pNext} chain of {@link VkImageViewCreateInfo}. Conversely, if a {@code VkSamplerYcbcrConversion} object is passed to {@link VK10#vkCreateImageView CreateImageView}, an identically defined {@code VkSamplerYcbcrConversion} object <b>must</b> be used when sampling the image.</p>
 * 
 * <p>If the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> {@code format} and {@code subresourceRange.aspectMask} is {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, {@code format} <b>must</b> be identical to the image {@code format}, and the sampler to be used with the image view <b>must</b> enable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>.</p>
 * 
 * <p>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} and the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> {@code format}, and if {@code subresourceRange.aspectMask} is {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}, {@code format} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatible-planes">compatible</a> with the corresponding plane of the image, and the sampler to be used with the image view <b>must</b> not enable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>. The {@code width} and {@code height} of the single-plane image view <b>must</b> be derived from the multi-planar image's dimensions in the manner listed for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatible-planes">plane compatibility</a> for the plane.</p>
 * 
 * <p>Any view of an image plane will have the same mapping between texel coordinates and memory locations as used by the channels of the color aspect, subject to the formulae relating texel coordinates to lower-resolution planes as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-chroma-reconstruction">Chroma Reconstruction</a>. That is, if an R or B plane has a reduced resolution relative to the G plane of the multi-planar image, the image view operates using the (<em>u<sub>plane</sub></em>, <em>v<sub>plane</sub></em>) unnormalized coordinates of the reduced-resolution plane, and these coordinates access the same memory locations as the (<em>u<sub>color</sub></em>, <em>v<sub>color</sub></em>) unnormalized coordinates of the color aspect for which chroma reconstruction operations operate on the same (<em>u<sub>plane</sub></em>, <em>v<sub>plane</sub></em>) or (<em>i<sub>plane</sub></em>, <em>j<sub>plane</sub></em>) coordinates.</p>
 * 
 * <h6>Image and image view parameter compatibility requirements</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Dim, Arrayed, MS</th><th>Image parameters</th><th>View parameters</th></tr></thead>
 * <tbody>
 * <tr><td></td><td>{@code imageType} = ci.{@code imageType} {@code width} = ci.{@code extent.width} {@code height} = ci.{@code extent.height} {@code depth} = ci.{@code extent.depth} {@code arrayLayers} = ci.{@code arrayLayers} {@code samples} = ci.{@code samples} {@code flags} = ci.{@code flags} where ci is the {@link VkImageCreateInfo} used to create {@code image}.</td><td>{@code baseArrayLayer}, {@code layerCount}, and {@code levelCount} are members of the {@code subresourceRange} member.</td></tr>
 * <tr><td>1D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} {@code width} ≥ 1 {@code height} = 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>1D, 1, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} {@code width} ≥ 1 {@code height} = 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * <tr><td>2D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>2D, 1, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * <tr><td>2D, 0, 1</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} &gt; 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>2D, 1, 1</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} = 1 {@code arrayLayers} ≥ 1 {@code samples} &gt; 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * <tr><td>CUBE, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} = {@code width} {@code depth} = 1 {@code arrayLayers} ≥ 6 {@code samples} = 1 {@code flags} includes {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 6</td></tr>
 * <tr><td>CUBE, 1, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} {@code width} ≥ 1 {@code height} = width {@code depth} = 1 <em>N</em> ≥ 1 {@code arrayLayers} ≥ 6 × <em>N</em> {@code samples} = 1 {@code flags} includes {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} {@code baseArrayLayer} ≥ 0 {@code layerCount} = 6 × <em>N</em>, <em>N</em> ≥ 1</td></tr>
 * <tr><td>3D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D} {@code baseArrayLayer} = 0 {@code layerCount} = 1</td></tr>
 * <tr><td>3D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1 {@code flags} includes {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} {@code flags} does not include {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} {@code levelCount} = 1 {@code baseArrayLayer} ≥ 0 {@code layerCount} = 1</td></tr>
 * <tr><td>3D, 0, 0</td><td>{@code imageType} = {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} {@code width} ≥ 1 {@code height} ≥ 1 {@code depth} ≥ 1 {@code arrayLayers} = 1 {@code samples} = 1 {@code flags} includes {@link KHRMaintenance1#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR} {@code flags} does not include {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</td><td>{@code viewType} = {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} {@code levelCount} = 1 {@code baseArrayLayer} ≥ 0 {@code layerCount} ≥ 1</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code image} was not created with {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} then {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-imageCubeArray">image cubemap arrays</a> feature is not enabled, {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} but without {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set then {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
 * <li>{@code image} <b>must</b> have been created with a {@code usage} value containing at least one of {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, {@link NVShadingRateImage#VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV}, or {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> of the resultant image view <b>must</b> contain at least one bit.</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> of the resultant image view <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}.</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}.</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}.</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}.</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain at least one of {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}.</li>
 * <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} was created with {@code usage} containing {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, {@code subresourceRange.levelCount} <b>must</b> be 1</li>
 * <li>If {@code image} is not a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, or {@code viewType} is not {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code image} is not a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, or {@code viewType} is not {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.layerCount} <b>must</b> be non-zero and <code>subresourceRange.baseArrayLayer subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} is a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.baseArrayLayer} <b>must</b> be less than the depth computed from {@code baseMipLevel} and {@code extent.depth} specified in {@link VkImageCreateInfo} when {@code image} was created, according to the formula defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-miplevel-sizing">Image Miplevel Sizing</a>.</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code image} is a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.layerCount} <b>must</b> be non-zero and <code>subresourceRange.baseArrayLayer subresourceRange.layerCount</code> <b>must</b> be less than or equal to the depth computed from {@code baseMipLevel} and {@code extent.depth} specified in {@link VkImageCreateInfo} when {@code image} was created, according to the formula defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-miplevel-sizing">Image Miplevel Sizing</a>.</li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, {@code format} <b>must</b> be compatible with the {@code format} used to create {@code image}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatibility-classes">Format Compatibility Classes</a></li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, but without the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, and if the {@code format} of the {@code image} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> format, {@code format} <b>must</b> be compatible with the {@code format} used to create {@code image}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatibility-classes">Format Compatibility Classes</a></li>
 * <li>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, {@code format} <b>must</b> be compatible with, or <b>must</b> be an uncompressed format that is size-compatible with, the {@code format} used to create {@code image}.</li>
 * <li>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, the {@code levelCount} and {@code layerCount} members of {@code subresourceRange} <b>must</b> both be 1.</li>
 * <li>If a {@link VkImageFormatListCreateInfo} structure was included in the {@code pNext} chain of the {@link VkImageCreateInfo} structure used when creating {@code image} and the {@code viewFormatCount} field of {@link VkImageFormatListCreateInfo} is not zero then {@code format} <b>must</b> be one of the formats in {@link VkImageFormatListCreateInfo}{@code ::pViewFormats}.</li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, if the {@code format} of the {@code image} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> format, and if {@code subresourceRange.aspectMask} is one of {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}, then {@code format} <b>must</b> be compatible with the {@code VkFormat} for the plane of the {@code image} {@code format} indicated by {@code subresourceRange.aspectMask}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
 * <li>If {@code image} was not created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, or if the {@code format} of the {@code image} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> format and if {@code subresourceRange.aspectMask} is {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, {@code format} <b>must</b> be identical to the {@code format} used to create {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkSamplerYcbcrConversionInfo} structure with a {@code conversion} value other than {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, all members of {@code components} <b>must</b> have the value {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}.</li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code subresourceRange} and {@code viewType} <b>must</b> be compatible with the image, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-views-compatibility">compatibility table</a></li>
 * <li>If {@code image} was created with {@code usage} containing {@link NVShadingRateImage#VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV}, {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
 * <li>If {@code image} was created with {@code usage} containing {@link NVShadingRateImage#VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV}, {@code format} <b>must</b> be {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentdensitymapdynamic">dynamic fragment density map</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link EXTFragmentDensityMap#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentdensitymapdynamic">dynamic fragment density map</a> feature is not enabled and {@code image} was created with {@code usage} containing {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, {@code flags} <b>must</b> not contain any of {@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageViewUsageCreateInfo} structure, and {@code image} was not created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, its {@code usage} member <b>must</b> not include any bits that were not set in the {@code usage} member of the {@link VkImageCreateInfo} structure used to create {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageViewUsageCreateInfo} structure, {@code image} was created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, and {@code subResourceRange.aspectMask} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, the {@code usage} member of the {@link VkImageViewUsageCreateInfo} instance <b>must</b> not include any bits that were not set in the {@code usage} member of the {@link VkImageStencilUsageCreateInfo} structure used to create {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageViewUsageCreateInfo} structure, {@code image} was created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, and {@code subResourceRange.aspectMask} includes bits other than {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, the {@code usage} member of the {@link VkImageViewUsageCreateInfo} structure <b>must</b> not include any bits that were not set in the {@code usage} member of the {@link VkImageCreateInfo} structure used to create {@code image}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkImageViewASTCDecodeModeEXT}, {@link VkImageViewUsageCreateInfo}, or {@link VkSamplerYcbcrConversionInfo}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageViewCreateFlagBits} values</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code viewType} <b>must</b> be a valid {@code VkImageViewType} value</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code components} <b>must</b> be a valid {@link VkComponentMapping} structure</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}, {@link VkImageSubresourceRange}, {@link VK10#vkCreateImageView CreateImageView}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkImageViewCreateFlagBits} describing additional parameters of the image view.</li>
 * <li>{@code image} &ndash; a {@code VkImage} on which the view will be created.</li>
 * <li>{@code viewType} &ndash; a {@code VkImageViewType} value specifying the type of the image view.</li>
 * <li>{@code format} &ndash; a {@code VkFormat} describing the format and type used to interpret texel blocks in the image.</li>
 * <li>{@code components} &ndash; a {@link VkComponentMapping} specifies a remapping of color components (or of depth or stencil components after they have been converted into color components).</li>
 * <li>{@code subresourceRange} &ndash; a {@link VkImageSubresourceRange} selecting the set of mipmap levels and array layers to be accessible to the view.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageViewCreateFlags flags;
 *     VkImage image;
 *     VkImageViewType viewType;
 *     VkFormat format;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageViewCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        IMAGE,
        VIEWTYPE,
        FORMAT,
        COMPONENTS,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGE = layout.offsetof(3);
        VIEWTYPE = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        COMPONENTS = layout.offsetof(6);
        SUBRESOURCERANGE = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkImageViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkImageViewCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** Returns the value of the {@code viewType} field. */
    @NativeType("VkImageViewType")
    public int viewType() { return nviewType(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageViewCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageViewCreateInfo flags(@NativeType("VkImageViewCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageViewCreateInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code viewType} field. */
    public VkImageViewCreateInfo viewType(@NativeType("VkImageViewType") int value) { nviewType(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkImageViewCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkImageViewCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewCreateInfo components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewCreateInfo subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long image,
        int viewType,
        int format,
        VkComponentMapping components,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        image(image);
        viewType(viewType);
        format(format);
        components(components);
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
    public VkImageViewCreateInfo set(VkImageViewCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewCreateInfo malloc() {
        return wrap(VkImageViewCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewCreateInfo calloc() {
        return wrap(VkImageViewCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageViewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageViewCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance for the specified memory address. */
    public static VkImageViewCreateInfo create(long address) {
        return wrap(VkImageViewCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkImageViewCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageViewCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageViewCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageViewCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageViewCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkImageViewCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkImageViewCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkImageViewCreateInfo.FLAGS); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkImageViewCreateInfo.IMAGE); }
    /** Unsafe version of {@link #viewType}. */
    public static int nviewType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewCreateInfo.VIEWTYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkImageViewCreateInfo.FORMAT); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkImageViewCreateInfo.COMPONENTS); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageViewCreateInfo.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkImageViewCreateInfo.IMAGE, value); }
    /** Unsafe version of {@link #viewType(int) viewType}. */
    public static void nviewType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewCreateInfo.VIEWTYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkImageViewCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageViewCreateInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageViewCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageViewCreateInfo, Buffer> implements NativeResource {

        private static final VkImageViewCreateInfo ELEMENT_FACTORY = VkImageViewCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageViewCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkImageViewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkImageViewCreateFlags")
        public int flags() { return VkImageViewCreateInfo.nflags(address()); }
        /** Returns the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageViewCreateInfo.nimage(address()); }
        /** Returns the value of the {@code viewType} field. */
        @NativeType("VkImageViewType")
        public int viewType() { return VkImageViewCreateInfo.nviewType(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageViewCreateInfo.nformat(address()); }
        /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkImageViewCreateInfo.ncomponents(address()); }
        /** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageViewCreateInfo.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageViewCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageViewCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageViewCreateInfo.Buffer flags(@NativeType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageViewCreateInfo.Buffer image(@NativeType("VkImage") long value) { VkImageViewCreateInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code viewType} field. */
        public VkImageViewCreateInfo.Buffer viewType(@NativeType("VkImageViewType") int value) { VkImageViewCreateInfo.nviewType(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkImageViewCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageViewCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkImageViewCreateInfo.Buffer components(VkComponentMapping value) { VkImageViewCreateInfo.ncomponents(address(), value); return this; }
        /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewCreateInfo.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkImageViewCreateInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageViewCreateInfo.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewCreateInfo.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}