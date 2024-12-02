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
 * This extension allows applications to copy data between host memory and images on the host processor, without staging the data through a GPU-accessible buffer. This removes the need to allocate and manage the buffer and its associated memory. On some architectures it may also eliminate an extra copy operation. This extension additionally allows applications to copy data between images on the host.
 * 
 * <p>To support initializing a new image in preparation for a host copy, it is now possible to transition a new image to {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or other host-copyable layouts via {@link #vkTransitionImageLayoutEXT TransitionImageLayoutEXT}. Additionally, it is possible to perform copies that preserve the swizzling layout of the image by using the {@link #VK_HOST_IMAGE_COPY_MEMCPY_EXT HOST_IMAGE_COPY_MEMCPY_EXT} flag. In that case, the memory size needed for copies to or from a buffer can be retrieved by chaining {@link VkSubresourceHostMemcpySizeEXT} to {@code pLayout} in {@link #vkGetImageSubresourceLayout2EXT GetImageSubresourceLayout2EXT}.</p>
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4, with the EXT suffix omitted. However, the feature is made optional in Vulkan 1.4. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <p>A Vulkan 1.4 implementation that has a {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} queue must support either:</p>
 * 
 * <ul>
 * <li>the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-hostImageCopy">{@code hostImageCopy}</a> feature; or</li>
 * <li>an additional queue that supports {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}.</li>
 * </ul>
 * 
 * <p>Additionally, all queues supporting {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} must also advertise {@link VK10#VK_QUEUE_TRANSFER_BIT QUEUE_TRANSFER_BIT}.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_host_image_copy}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>271</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a> and {@link KHRCopyCommands2 VK_KHR_copy_commands2} and {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_host_image_copy]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_host_image_copy%20extension*">syoussefi</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_host_image_copy.adoc">VK_EXT_host_image_copy</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-04-26</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>James Fitzpatrick, Imagination</li>
 * <li>Daniel Story, Nintendo</li>
 * </ul></dd>
 * </dl>
 */
public class EXTHostImageCopy {

    /** The extension specification version. */
    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT   = 1000270000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = 1000270001,
        VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT                       = 1000270002,
        VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT                       = 1000270003,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT                  = 1000270004,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT                  = 1000270005,
        VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT          = 1000270006,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT                   = 1000270007,
        VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT               = 1000270008,
        VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT   = 1000270009;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 0x400000;

    /** Extends {@code VkFormatFeatureFlagBits2}. */
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 0x400000000000L;

    /** Extends {@code VkHostImageCopyFlagBits}. */
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 0x1;

    protected EXTHostImageCopy() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCopyMemoryToImageEXT ] ---

    /** Unsafe version of: {@link #vkCopyMemoryToImageEXT CopyMemoryToImageEXT} */
    public static int nvkCopyMemoryToImageEXT(VkDevice device, long pCopyMemoryToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyMemoryToImageInfo.validate(pCopyMemoryToImageInfo);
        }
        return callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    /**
     * See {@link VK14#vkCopyMemoryToImage CopyMemoryToImage}.
     *
     * @param device                 the device which owns {@code pCopyMemoryToImageInfo→dstImage}.
     * @param pCopyMemoryToImageInfo a pointer to a {@link VkCopyMemoryToImageInfo} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyMemoryToImageEXT(VkDevice device, @NativeType("VkCopyMemoryToImageInfo const *") VkCopyMemoryToImageInfo pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImageEXT(device, pCopyMemoryToImageInfo.address());
    }

    // --- [ vkCopyImageToMemoryEXT ] ---

    /** Unsafe version of: {@link #vkCopyImageToMemoryEXT CopyImageToMemoryEXT} */
    public static int nvkCopyImageToMemoryEXT(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToMemoryInfo.validate(pCopyImageToMemoryInfo);
        }
        return callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    /**
     * See {@link VK14#vkCopyImageToMemory CopyImageToMemory}.
     *
     * @param device                 the device which owns {@code pCopyImageToMemoryInfo→srcImage}.
     * @param pCopyImageToMemoryInfo a pointer to a {@link VkCopyImageToMemoryInfo} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyImageToMemoryEXT(VkDevice device, @NativeType("VkCopyImageToMemoryInfo const *") VkCopyImageToMemoryInfo pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemoryEXT(device, pCopyImageToMemoryInfo.address());
    }

    // --- [ vkCopyImageToImageEXT ] ---

    /** Unsafe version of: {@link #vkCopyImageToImageEXT CopyImageToImageEXT} */
    public static int nvkCopyImageToImageEXT(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToImageInfo.validate(pCopyImageToImageInfo);
        }
        return callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    /**
     * See {@link VK14#vkCopyImageToImage CopyImageToImage}.
     *
     * @param device                the device which owns {@code pCopyImageToImageInfo→srcImage} and {@code pCopyImageToImageInfo→dstImage}.
     * @param pCopyImageToImageInfo a pointer to a {@link VkCopyImageToImageInfo} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyImageToImageEXT(VkDevice device, @NativeType("VkCopyImageToImageInfo const *") VkCopyImageToImageInfo pCopyImageToImageInfo) {
        return nvkCopyImageToImageEXT(device, pCopyImageToImageInfo.address());
    }

    // --- [ vkTransitionImageLayoutEXT ] ---

    /**
     * Unsafe version of: {@link #vkTransitionImageLayoutEXT TransitionImageLayoutEXT}
     *
     * @param transitionCount the number of image layout transitions to perform.
     */
    public static int nvkTransitionImageLayoutEXT(VkDevice device, int transitionCount, long pTransitions) {
        long __functionAddress = device.getCapabilities().vkTransitionImageLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), transitionCount, pTransitions, __functionAddress);
    }

    /**
     * See {@link VK14#vkTransitionImageLayout TransitionImageLayout}.
     *
     * @param device       the device which owns {@code pTransitions}[i].{@code image}.
     * @param pTransitions a pointer to an array of {@link VkHostImageLayoutTransitionInfo} structures specifying the image and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-views">subresource ranges</a> within them to transition.
     */
    @NativeType("VkResult")
    public static int vkTransitionImageLayoutEXT(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfo const *") VkHostImageLayoutTransitionInfo.Buffer pTransitions) {
        return nvkTransitionImageLayoutEXT(device, pTransitions.remaining(), pTransitions.address());
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
     * See {@link VK14#vkGetImageSubresourceLayout2 GetImageSubresourceLayout2}.
     *
     * @param device       the logical device that owns the image.
     * @param image        the image whose layout is being queried.
     * @param pSubresource a pointer to a {@link VkImageSubresource2} structure selecting a specific image for the image subresource.
     * @param pLayout      a pointer to a {@link VkSubresourceLayout2} structure in which the layout is returned.
     */
    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2EXT(device, image, pSubresource.address(), pLayout.address());
    }

}