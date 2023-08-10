/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension enables fixed-rate image compression and adds the ability to control when this kind of compression can be applied. Many implementations support some form of framebuffer compression. This is typically transparent to applications as lossless compression schemes are used. With fixed-rate compression, the compression is done at a defined bitrate. Such compression algorithms generally produce results that are visually lossless, but the results are typically not bit-exact when compared to a non-compressed result. The implementation may not be able to use the requested compression rate in all cases. This extension adds a query that can be used to determine the compression scheme and rate that was applied to an image.
 * 
 * <h5>VK_EXT_image_compression_control</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_image_compression_control}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>339</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_image_compression_control]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_image_compression_control%20extension*">janharaldfredriksen-arm</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_image_compression_control.adoc">VK_EXT_image_compression_control</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-05-02</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Andrew Garrard, Imagination</li>
 * <li>Lisa Wu, Arm</li>
 * <li>Peter Kohaut, Arm</li>
 * </ul></dd>
 * </dl>
 */
public class EXTImageCompressionControl {

    /** The extension specification version. */
    public static final int VK_EXT_IMAGE_COMPRESSION_CONTROL_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_IMAGE_COMPRESSION_CONTROL_EXTENSION_NAME = "VK_EXT_image_compression_control";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT = 1000338000,
        VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT                          = 1000338001,
        VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_EXT                               = 1000338002,
        VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_EXT                                = 1000338003,
        VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT                       = 1000338004;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;

    /**
     * VkImageCompressionFlagBitsEXT - Bitmask specifying image compression controls
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_COMPRESSION_DEFAULT_EXT IMAGE_COMPRESSION_DEFAULT_EXT} specifies that the default image compression setting is used. Implementations <b>must</b> not apply fixed-rate compression.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT} specifies that the implementation <b>may</b> choose any supported fixed-rate compression setting in an implementation-defined manner based on the properties of the image.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT} specifies that fixed-rate compression <b>may</b> be used and that the allowed compression rates are specified by {@link VkImageCompressionControlEXT}{@code ::pFixedRateFlags}.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_DISABLED_EXT IMAGE_COMPRESSION_DISABLED_EXT} specifies that all lossless and fixed-rate compression <b>should</b> be disabled.</li>
     * </ul>
     * 
     * <p>If {@link VkImageCompressionControlEXT}{@code ::flags} is {@link #VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT}, then the {@code i}<sup>th</sup> member of the {@code pFixedRateFlags} array specifies the allowed compression rates for the image’s {@code i}<sup>th</sup> plane.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If {@link #VK_IMAGE_COMPRESSION_DISABLED_EXT IMAGE_COMPRESSION_DISABLED_EXT} is included in {@link VkImageCompressionControlEXT}{@code ::flags}, both lossless and fixed-rate compression will be disabled. This is likely to have a negative impact on performance and is only intended to be used for debugging purposes.</p>
     * </div>
     */
    public static final int
        VK_IMAGE_COMPRESSION_DEFAULT_EXT             = 0,
        VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT  = 0x1,
        VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 0x2,
        VK_IMAGE_COMPRESSION_DISABLED_EXT            = 0x4;

    /**
     * VkImageCompressionFixedRateFlagBitsEXT - Bitmask specifying fixed rate image compression rates
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT} specifies that fixed-rate compression <b>must</b> not be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[1,2)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[2,3)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[3,4)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[4,5)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[5,6)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[6,7)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[7,8)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[8,9)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[9,10)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[10,11)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of <code>[11,12)</code> bits per component <b>may</b> be used.</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT} specifies that fixed-rate compression with a bitrate of at least 12 bits per component <b>may</b> be used.</li>
     * </ul>
     * 
     * <p>If the format has a different bit rate for different components, {@link VkImageCompressionControlEXT}{@code ::pFixedRateFlags} describes the rate of the component with the largest number of bits assigned to it, scaled pro rata. For example, to request that a {@link VK10#VK_FORMAT_A2R10G10B10_UNORM_PACK32 FORMAT_A2R10G10B10_UNORM_PACK32} format be stored at a rate of 8 bits per pixel, use {@link #VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT} (10 bits for the largest component, stored at quarter the original size, 2.5 bits, rounded down).</p>
     * 
     * <p>If {@code flags} includes {@link #VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT}, and multiple bits are set in {@link VkImageCompressionControlEXT}{@code ::pFixedRateFlags} for a plane, implementations <b>should</b> apply the lowest allowed bitrate that is supported.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The choice of “{@code bits per component}” terminology was chosen so that the same compression rate describes the same degree of compression applied to formats that differ only in the number of components. For example, {@link VK10#VK_FORMAT_R8G8_UNORM FORMAT_R8G8_UNORM} compressed to half its original size is a rate of 4 bits per component, 8 bits per pixel. {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} compressed to half <em>its</em> original size is 4 bits per component, 16 bits per pixel. Both of these cases can be requested with {@link #VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT}.</p>
     * </div>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT      = 0,
        VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT  = 0x1,
        VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT  = 0x2,
        VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT  = 0x4,
        VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT  = 0x8,
        VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT  = 0x10,
        VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT  = 0x20,
        VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT  = 0x40,
        VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT  = 0x80,
        VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT  = 0x100,
        VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 0x200,
        VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 0x400,
        VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 0x800,
        VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 0x1000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 0x2000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 0x4000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 0x8000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 0x10000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 0x20000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 0x40000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 0x80000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 0x100000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 0x200000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 0x400000,
        VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 0x800000;

    protected EXTImageCompressionControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageSubresourceLayout2EXT ] ---

    /** Unsafe version of: {@link #vkGetImageSubresourceLayout2EXT GetImageSubresourceLayout2EXT} */
    public static void nvkGetImageSubresourceLayout2EXT(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /**
     * Retrieve information about an image subresource.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the memory layout of an image subresource, call:</p>
     * 
     * <pre><code>
     * void vkGetImageSubresourceLayout2EXT(
     *     VkDevice                                    device,
     *     VkImage                                     image,
     *     const VkImageSubresource2EXT*               pSubresource,
     *     VkSubresourceLayout2EXT*                    pLayout);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetImageSubresourceLayout2EXT} behaves similarly to {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}, with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.</p>
     * 
     * <p>It is legal to call {@code vkGetImageSubresourceLayout2EXT} with a {@code image} created with {@code tiling} equal to {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, but the members of {@link VkSubresourceLayout2EXT}{@code ::subresourceLayout} will have undefined values in this case.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Structures chained from {@link VkImageSubresource2EXT}{@code ::pNext} will also be updated when {@code tiling} is equal to {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
     * <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
     * <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
     * <li>If {@code format} of the {@code image} is a color format, {@code tiling} of the {@code image} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and does not have a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
     * <li>If {@code format} of the {@code image} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</li>
     * <li>If {@code format} of the {@code image} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
     * <li>If {@code format} of the {@code image} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
     * <li>If the {@code tiling} of the {@code image} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a></li>
     * <li>If {@code image} was created with the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID} external memory handle type, then {@code image} <b>must</b> be bound to memory</li>
     * <li>If the {@code tiling} of the {@code image} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> and the index <em>i</em> <b>must</b> be less than the {@link VkDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and {@link VkImageDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifier}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
     * <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid {@link VkImageSubresource2EXT} structure</li>
     * <li>{@code pLayout} <b>must</b> be a valid pointer to a {@link VkSubresourceLayout2EXT} structure</li>
     * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageSubresource2EXT}, {@link VkSubresourceLayout2EXT}</p>
     *
     * @param device       the logical device that owns the image.
     * @param image        the image whose layout is being queried.
     * @param pSubresource a pointer to a {@link VkImageSubresource2EXT} structure selecting a specific image for the image subresource.
     * @param pLayout      a pointer to a {@link VkSubresourceLayout2EXT} structure in which the layout is returned.
     */
    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2EXT const *") VkImageSubresource2EXT pSubresource, @NativeType("VkSubresourceLayout2EXT *") VkSubresourceLayout2EXT pLayout) {
        nvkGetImageSubresourceLayout2EXT(device, image, pSubresource.address(), pLayout.address());
    }

}