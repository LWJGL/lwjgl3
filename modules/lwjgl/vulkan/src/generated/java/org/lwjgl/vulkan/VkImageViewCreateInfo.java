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
 * <p>Some of the {@code image} creation parameters are inherited by the view. In particular, image view creation inherits the implicit parameter {@code usage} specifying the allowed usages of the image view that, by default, takes the value of the corresponding {@code usage} parameter specified in {@link VkImageCreateInfo} at image creation time. The implicit {@code usage} <b>can</b> be overriden by adding a {@link VkImageViewUsageCreateInfo} structure to the {@code pNext} chain, but the view usage <b>must</b> be a subset of the image usage. If {@code image} has a depth-stencil format and was created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, the usage is calculated based on the {@code subresource.aspectMask} provided:</p>
 * 
 * <ul>
 * <li>If {@code aspectMask} includes only {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, the implicit {@code usage} is equal to {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage}.</li>
 * <li>If {@code aspectMask} includes only {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}, the implicit {@code usage} is equal to {@link VkImageCreateInfo}{@code ::usage}.</li>
 * <li>If both aspects are included in {@code aspectMask}, the implicit {@code usage} is equal to the intersection of {@link VkImageCreateInfo}{@code ::usage} and {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage}.</li>
 * </ul>
 * 
 * <p>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, and if the {@code format} of the image is not <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a>, {@code format} <b>can</b> be different from the image’s format, but if {@code image} was created without the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag and they are not equal they <b>must</b> be <em>compatible</em>. Image format compatibility is defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">Format Compatibility Classes</a> section. Views of compatible formats will have the same mapping between texel coordinates and memory locations irrespective of the {@code format}, with only the interpretation of the bit pattern changing.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Values intended to be used with one view format <b>may</b> not be exactly preserved when written or read through a different format. For example, an integer value that happens to have the bit pattern of a floating point denorm or NaN <b>may</b> be flushed or canonicalized when written or read through a view with a floating point format. Similarly, a value written through a signed normalized format that has a bit pattern exactly equal to <code>-2<sup>b</sup></code> <b>may</b> be changed to <code>-2<sup>b</sup> + 1</code> as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-fixedfpconv">Conversion from Normalized Fixed-Point to Floating-Point</a>.</p>
 * </div>
 * 
 * <p>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, {@code format} <b>must</b> be <em>compatible</em> with the image’s format as described above, or <b>must</b> be an uncompressed format in which case it <b>must</b> be <em>size-compatible</em> with the image’s format, as defined for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#copies-images-format-size-compatibility">copying data between images</a>. In this case, the resulting image view’s texel dimensions equal the dimensions of the selected mip level divided by the compressed texel block size and rounded up.</p>
 * 
 * <p>The {@link VkComponentMapping} {@code components} member describes a remapping from components of the image to components of the vector returned by shader image instructions. This remapping <b>must</b> be the identity swizzle for storage image descriptors, input attachment descriptors, framebuffer attachments, and any {@code VkImageView} used with a combined image sampler that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>.</p>
 * 
 * <p>If the image view is to be used with a sampler which supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, an <em>identically defined object</em> of type {@code VkSamplerYcbcrConversion} to that used to create the sampler <b>must</b> be passed to {@link VK10#vkCreateImageView CreateImageView} in a {@link VkSamplerYcbcrConversionInfo} included in the {@code pNext} chain of {@link VkImageViewCreateInfo}. Conversely, if a {@code VkSamplerYcbcrConversion} object is passed to {@link VK10#vkCreateImageView CreateImageView}, an identically defined {@code VkSamplerYcbcrConversion} object <b>must</b> be used when sampling the image.</p>
 * 
 * <p>If the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> {@code format} and {@code subresourceRange.aspectMask} is {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, and {@code image} has been created with a {@code usage} value <b>not</b> containing any of the {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}, and {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR} flags, then the {@code format} <b>must</b> be identical to the image {@code format}, and the sampler to be used with the image view <b>must</b> enable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>.</p>
 * 
 * <p>If the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> {@code format} and the {@code image} has been created with a {@code usage} value containing any of the {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR}, and {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR} flags, then all of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-decode-operations">video decode operations</a> would ignore the {@link VkSamplerYcbcrConversionInfo} structure and/or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a> object, associated with the image view. If the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> {@code format} and the {@code image} has been created with a {@code usage} value containing any of the {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}, and {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR} flags, then all of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operations</a> would ignore the {@link VkSamplerYcbcrConversionInfo} structure and/or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a> object, associated with the image view.</p>
 * 
 * <p>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} and the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> {@code format}, and if {@code subresourceRange.aspectMask} is {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}, {@code format} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatible-planes">compatible</a> with the corresponding plane of the image, and the sampler to be used with the image view <b>must</b> not enable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>. The {@code width} and {@code height} of the single-plane image view <b>must</b> be derived from the multi-planar image’s dimensions in the manner listed for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatible-planes">plane compatibility</a> for the plane.</p>
 * 
 * <p>Any view of an image plane will have the same mapping between texel coordinates and memory locations as used by the components of the color aspect, subject to the formulae relating texel coordinates to lower-resolution planes as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-chroma-reconstruction">Chroma Reconstruction</a>. That is, if an R or B plane has a reduced resolution relative to the G plane of the multi-planar image, the image view operates using the (<em>u<sub>plane</sub></em>, <em>v<sub>plane</sub></em>) unnormalized coordinates of the reduced-resolution plane, and these coordinates access the same memory locations as the (<em>u<sub>color</sub></em>, <em>v<sub>color</sub></em>) unnormalized coordinates of the color aspect for which chroma reconstruction operations operate on the same (<em>u<sub>plane</sub></em>, <em>v<sub>plane</sub></em>) or (<em>i<sub>plane</sub></em>, <em>j<sub>plane</sub></em>) coordinates.</p>
 * 
 * <h6>Image type and image view type compatibility requirements</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Image View Type</th><th>Compatible Image Types</th></tr></thead>
 * <tbody>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D}</td><td>{@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td></tr>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}</td><td>{@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}</td></tr>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</td><td>{@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} , {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</td><td>{@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} , {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}</td><td>{@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td></tr>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</td><td>{@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</td></tr>
 * <tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}</td><td>{@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code image} was not created with {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} then {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-imageCubeArray">image cube map arrays</a> feature is not enabled, {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} but without {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set then {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} then {@code subresourceRange.levelCount} <b>must</b> be 1</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} then {@link VkImageCreateInfo}{@code ::flags} <b>must</b> not contain any of {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If {@code image} was created with a {@code samples} value not equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} then {@code viewType} <b>must</b> be either {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
 * <li>{@code image} <b>must</b> have been created with a {@code usage} value containing at least one of the usages defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#valid-imageview-imageusage">valid image usage</a> list for image views</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> of the resultant image view <b>must</b> contain at least one bit</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> of the resultant image view <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}, if the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> must contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}, if the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled</li>
 * <li>If {@code usage} contains {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain at least one of {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} was created with {@code usage} containing {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, {@code subresourceRange.levelCount} <b>must</b> be 1</li>
 * <li>If {@code image} is not a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, or {@code viewType} is not {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code image} is not a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, or {@code viewType} is not {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.layerCount} <b>must</b> be non-zero and <code>subresourceRange.baseArrayLayer + subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} is a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.baseArrayLayer} <b>must</b> be less than the depth computed from {@code baseMipLevel} and {@code extent.depth} specified in {@link VkImageCreateInfo} when {@code image} was created, according to the formula defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-miplevel-sizing">Image Miplevel Sizing</a></li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code image} is a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT} set, and {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}, {@code subresourceRange.layerCount} <b>must</b> be non-zero and <code>subresourceRange.baseArrayLayer + subresourceRange.layerCount</code> <b>must</b> be less than or equal to the depth computed from {@code baseMipLevel} and {@code extent.depth} specified in {@link VkImageCreateInfo} when {@code image} was created, according to the formula defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-miplevel-sizing">Image Miplevel Sizing</a></li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, but without the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, and if the {@code format} of the {@code image} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> format, {@code format} <b>must</b> be compatible with the {@code format} used to create {@code image}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">Format Compatibility Classes</a></li>
 * <li>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, {@code format} <b>must</b> be compatible with, or <b>must</b> be an uncompressed format that is size-compatible with, the {@code format} used to create {@code image}</li>
 * <li>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag, the {@code levelCount} and {@code layerCount} members of {@code subresourceRange} <b>must</b> both be 1</li>
 * <li>If {@code image} was created with the {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} flag and {@code format} is a non-compressed format, {@code viewType} <b>must</b> not be {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}</li>
 * <li>If a {@link VkImageFormatListCreateInfo} structure was included in the {@code pNext} chain of the {@link VkImageCreateInfo} structure used when creating {@code image} and {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} is not zero then {@code format} <b>must</b> be one of the formats in {@link VkImageFormatListCreateInfo}{@code ::pViewFormats}</li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, if the {@code format} of the {@code image} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> format, and if {@code subresourceRange.aspectMask} is one of {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}, then {@code format} <b>must</b> be compatible with the {@code VkFormat} for the plane of the {@code image} {@code format} indicated by {@code subresourceRange.aspectMask}, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
 * <li>If {@code image} was not created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, or if the {@code format} of the {@code image} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a> format and if {@code subresourceRange.aspectMask} is {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, {@code format} <b>must</b> be identical to the {@code format} used to create {@code image}</li>
 * <li>If the image {@code format} is one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a>, then the {@code pNext} chain <b>must</b> include a {@link VkSamplerYcbcrConversionInfo} structure with a conversion value other than {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code format} has a {@code _422} or {@code _420} suffix then {@code image} <b>must</b> have been created with a width that is a multiple of 2</li>
 * <li>If {@code format} has a {@code _420} suffix then {@code image} <b>must</b> have been created with a height that is a multiple of 2</li>
 * <li>If the {@code pNext} chain includes a {@link VkSamplerYcbcrConversionInfo} structure with a {@code conversion} value other than {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, all members of {@code components} <b>must</b> have the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a></li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code viewType} <b>must</b> be compatible with the type of {@code image} as shown in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-compatibility">view type compatibility table</a></li>
 * <li>If {@code image} was created with {@code usage} containing {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}, {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage} feature</a> is enabled, and If {@code image} was created with {@code usage} containing {@link NVShadingRateImage#VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV}, {@code format} <b>must</b> be {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is enabled, and the {@code usage} for the image view includes {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link KHRFragmentShadingRate#VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is enabled, the {@code usage} for the image view includes {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-layeredShadingRateAttachments">{@code layeredShadingRateAttachments}</a> is {@link VK10#VK_FALSE FALSE}, {@code subresourceRange.layerCount} <b>must</b> be 1</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapDynamic">dynamic fragment density map</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link EXTFragmentDensityMap#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMapDeferred">deferred fragment density map</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link EXTFragmentDensityMap2#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT}</li>
 * <li>If {@code flags} contains {@link EXTFragmentDensityMap2#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT}, {@code flags} <b>must</b> not contain {@link EXTFragmentDensityMap#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT}</li>
 * <li>If {@code image} was created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@code subresourceRange.layerCount} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxSubsampledArrayLayers">{@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT}{@code ::maxSubsampledArrayLayers}</a></li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">{@code invocationMask} feature</a> is enabled, and if {@code image} was created with {@code usage} containing {@link HUAWEIInvocationMask#VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI}, {@code format} <b>must</b> be {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</li>
 * <li>If {@code flags} does not contain {@link EXTFragmentDensityMap#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT} and {@code image} was created with {@code usage} containing {@link EXTFragmentDensityMap#VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT}, its {@code flags} <b>must</b> not contain any of {@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageViewUsageCreateInfo} structure, and {@code image} was not created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, its {@code usage} member <b>must</b> not include any bits that were not set in the {@code usage} member of the {@link VkImageCreateInfo} structure used to create {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageViewUsageCreateInfo} structure, {@code image} was created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, and {@code subresourceRange.aspectMask} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, the {@code usage} member of the {@link VkImageViewUsageCreateInfo} structure <b>must</b> not include any bits that were not set in the {@code usage} member of the {@link VkImageStencilUsageCreateInfo} structure used to create {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkImageViewUsageCreateInfo} structure, {@code image} was created with a {@link VkImageStencilUsageCreateInfo} structure included in the {@code pNext} chain of {@link VkImageCreateInfo}, and {@code subresourceRange.aspectMask} includes bits other than {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, the {@code usage} member of the {@link VkImageViewUsageCreateInfo} structure <b>must</b> not include any bits that were not set in the {@code usage} member of the {@link VkImageCreateInfo} structure used to create {@code image}</li>
 * <li>If {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}, or {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}; and {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, then {@code subresourceRange.layerCount} <b>must</b> be 1</li>
 * <li>If {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}, or {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}; and {@code subresourceRange.layerCount} is {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, then the remaining number of layers <b>must</b> be 1</li>
 * <li>If {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} and {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code subresourceRange.layerCount} <b>must</b> be 6</li>
 * <li>If {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} and {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, {@code subresourceRange.layerCount} <b>must</b> be a multiple of 6</li>
 * <li>If {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} and {@code subresourceRange.layerCount} is {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, the remaining number of layers <b>must</b> be 6</li>
 * <li>If {@code viewType} is {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} and {@code subresourceRange.layerCount} is {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, the remaining number of layers <b>must</b> be a multiple of 6</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::imageViewFormatSwizzle} is {@link VK10#VK_FALSE FALSE}, all elements of {@code components} <b>must</b> have the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a></li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::imageViewFormatReinterpretation} is {@link VK10#VK_FALSE FALSE}, the {@code VkFormat} in {@code format} <b>must</b> not contain a different number of components, or a different number of bits in each component, than the format of the {@code VkImage} in {@code image}</li>
 * <li>If {@code image} was created with {@code usage} containing {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}, then the {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} and all members of {@code components} <b>must</b> have the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a></li>
 * <li>If {@code image} was created with {@code usage} containing {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}, then the {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} and all members of {@code components} <b>must</b> have the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkImageViewASTCDecodeModeEXT}, {@link VkImageViewMinLodCreateInfoEXT}, {@link VkImageViewUsageCreateInfo}, {@link VkSamplerYcbcrConversionInfo}, {@link VkVideoDecodeH264ProfileEXT}, {@link VkVideoDecodeH265ProfileEXT}, {@link VkVideoEncodeH264ProfileEXT}, {@link VkVideoEncodeH265ProfileEXT}, {@link VkVideoProfileKHR}, or {@link VkVideoProfilesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageViewCreateFlags {@link #flags};
 *     VkImage {@link #image};
 *     VkImageViewType {@link #viewType};
 *     VkFormat {@link #format};
 *     {@link VkComponentMapping VkComponentMapping} {@link #components};
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} {@link #subresourceRange};
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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkImageViewCreateFlagBits} describing additional parameters of the image view. */
    @NativeType("VkImageViewCreateFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkImage} on which the view will be created. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** a {@code VkImageViewType} value specifying the type of the image view. */
    @NativeType("VkImageViewType")
    public int viewType() { return nviewType(address()); }
    /** a {@code VkFormat} describing the format and type used to interpret texel blocks in the image. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** a {@link VkComponentMapping} structure specifying a remapping of color components (or of depth or stencil components after they have been converted into color components). */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** a {@link VkImageSubresourceRange} structure selecting the set of mipmap levels and array layers to be accessible to the view. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO} value to the {@link #sType} field. */
    public VkImageViewCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImageViewASTCDecodeModeEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewASTCDecodeModeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewMinLodCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewMinLodCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewUsageCreateInfo} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageViewUsageCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkImageViewUsageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfilesKHR} value to the {@code pNext} chain. */
    public VkImageViewCreateInfo pNext(VkVideoProfilesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkImageViewCreateInfo flags(@NativeType("VkImageViewCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkImageViewCreateInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #viewType} field. */
    public VkImageViewCreateInfo viewType(@NativeType("VkImageViewType") int value) { nviewType(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkImageViewCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@link #components} field. */
    public VkImageViewCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@link #components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewCreateInfo components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@link #subresourceRange} field. */
    public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@link #subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
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

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageViewCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo malloc(MemoryStack stack) {
        return wrap(VkImageViewCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewCreateInfo calloc(MemoryStack stack) {
        return wrap(VkImageViewCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
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

        /** @return the value of the {@link VkImageViewCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkImageViewCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkImageViewCreateInfo#flags} field. */
        @NativeType("VkImageViewCreateFlags")
        public int flags() { return VkImageViewCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkImageViewCreateInfo#image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageViewCreateInfo.nimage(address()); }
        /** @return the value of the {@link VkImageViewCreateInfo#viewType} field. */
        @NativeType("VkImageViewType")
        public int viewType() { return VkImageViewCreateInfo.nviewType(address()); }
        /** @return the value of the {@link VkImageViewCreateInfo#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageViewCreateInfo.nformat(address()); }
        /** @return a {@link VkComponentMapping} view of the {@link VkImageViewCreateInfo#components} field. */
        public VkComponentMapping components() { return VkImageViewCreateInfo.ncomponents(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@link VkImageViewCreateInfo#subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageViewCreateInfo.nsubresourceRange(address()); }

        /** Sets the specified value to the {@link VkImageViewCreateInfo#sType} field. */
        public VkImageViewCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO} value to the {@link VkImageViewCreateInfo#sType} field. */
        public VkImageViewCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO); }
        /** Sets the specified value to the {@link VkImageViewCreateInfo#pNext} field. */
        public VkImageViewCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageViewCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImageViewASTCDecodeModeEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewASTCDecodeModeEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewMinLodCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewMinLodCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewUsageCreateInfo} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageViewUsageCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkImageViewUsageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfilesKHR} value to the {@code pNext} chain. */
        public VkImageViewCreateInfo.Buffer pNext(VkVideoProfilesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkImageViewCreateInfo#flags} field. */
        public VkImageViewCreateInfo.Buffer flags(@NativeType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewCreateInfo#image} field. */
        public VkImageViewCreateInfo.Buffer image(@NativeType("VkImage") long value) { VkImageViewCreateInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewCreateInfo#viewType} field. */
        public VkImageViewCreateInfo.Buffer viewType(@NativeType("VkImageViewType") int value) { VkImageViewCreateInfo.nviewType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageViewCreateInfo#format} field. */
        public VkImageViewCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageViewCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@link VkImageViewCreateInfo#components} field. */
        public VkImageViewCreateInfo.Buffer components(VkComponentMapping value) { VkImageViewCreateInfo.ncomponents(address(), value); return this; }
        /** Passes the {@link VkImageViewCreateInfo#components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewCreateInfo.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@link VkImageViewCreateInfo#subresourceRange} field. */
        public VkImageViewCreateInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageViewCreateInfo.nsubresourceRange(address(), value); return this; }
        /** Passes the {@link VkImageViewCreateInfo#subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewCreateInfo.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}