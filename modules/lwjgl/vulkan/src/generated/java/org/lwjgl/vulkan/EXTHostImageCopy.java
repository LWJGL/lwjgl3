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
 * <h5>VK_EXT_host_image_copy</h5>
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
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRCopyCommands2 VK_KHR_copy_commands2} and {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2}</dd>
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

    /**
     * VkHostImageCopyFlagBitsEXT - Bitmask specifying additional copy parameters
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_HOST_IMAGE_COPY_MEMCPY_EXT HOST_IMAGE_COPY_MEMCPY_EXT} specifies that no memory layout swizzling is to be applied during data copy. For copies between memory and images, this flag indicates that image data in host memory is swizzled in exactly the same way as the image data on the device. Using this flag indicates that the implementations <b>may</b> use a simple memory copy to transfer the data between the host memory and the device memory. The format of the swizzled data in host memory is platform dependent and is not defined in this specification.</li>
     * </ul>
     */
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
            VkCopyMemoryToImageInfoEXT.validate(pCopyMemoryToImageInfo);
        }
        return callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    /**
     * Copy data from host memory into an image.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from host memory to an image object, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyMemoryToImageEXT(
     *     VkDevice                                    device,
     *     const VkCopyMemoryToImageInfoEXT*           pCopyMemoryToImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally similar to {@link VK13#vkCmdCopyBufferToImage2 CmdCopyBufferToImage2}, except it is executed on the host and reads from host memory instead of a buffer.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-hostImageCopy">{@code hostImageCopy}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCopyMemoryToImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMemoryToImageInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMemoryToImageInfoEXT}</p>
     *
     * @param device                 the device which owns {@code pCopyMemoryToImageInfo→dstImage}.
     * @param pCopyMemoryToImageInfo a pointer to a {@link VkCopyMemoryToImageInfoEXT} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyMemoryToImageEXT(VkDevice device, @NativeType("VkCopyMemoryToImageInfoEXT const *") VkCopyMemoryToImageInfoEXT pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImageEXT(device, pCopyMemoryToImageInfo.address());
    }

    // --- [ vkCopyImageToMemoryEXT ] ---

    /** Unsafe version of: {@link #vkCopyImageToMemoryEXT CopyImageToMemoryEXT} */
    public static int nvkCopyImageToMemoryEXT(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToMemoryInfoEXT.validate(pCopyImageToMemoryInfo);
        }
        return callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    /**
     * Copy image data into host memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from an image object to host memory, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyImageToMemoryEXT(
     *     VkDevice                                    device,
     *     const VkCopyImageToMemoryInfoEXT*           pCopyImageToMemoryInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally similar to {@link VK13#vkCmdCopyImageToBuffer2 CmdCopyImageToBuffer2}, except it is executed on the host and writes to host memory instead of a buffer.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-hostImageCopy">{@code hostImageCopy}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCopyImageToMemoryInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageToMemoryInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageToMemoryInfoEXT}</p>
     *
     * @param device                 the device which owns {@code pCopyImageToMemoryInfo→srcImage}.
     * @param pCopyImageToMemoryInfo a pointer to a {@link VkCopyImageToMemoryInfoEXT} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyImageToMemoryEXT(VkDevice device, @NativeType("VkCopyImageToMemoryInfoEXT const *") VkCopyImageToMemoryInfoEXT pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemoryEXT(device, pCopyImageToMemoryInfo.address());
    }

    // --- [ vkCopyImageToImageEXT ] ---

    /** Unsafe version of: {@link #vkCopyImageToImageEXT CopyImageToImageEXT} */
    public static int nvkCopyImageToImageEXT(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImageEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToImageInfoEXT.validate(pCopyImageToImageInfo);
        }
        return callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    /**
     * Copy image data using the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy data from an image object to another image object using the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyImageToImageEXT(
     *     VkDevice                                    device,
     *     const VkCopyImageToImageInfoEXT*            pCopyImageToImageInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command is functionally similar to {@link VK13#vkCmdCopyImage2 CmdCopyImage2}, except it is executed on the host.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-hostImageCopy">{@code hostImageCopy}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCopyImageToImageInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyImageToImageInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyImageToImageInfoEXT}</p>
     *
     * @param device                the device which owns {@code pCopyImageToMemoryInfo→srcImage}.
     * @param pCopyImageToImageInfo a pointer to a {@link VkCopyImageToImageInfoEXT} structure describing the copy parameters.
     */
    @NativeType("VkResult")
    public static int vkCopyImageToImageEXT(VkDevice device, @NativeType("VkCopyImageToImageInfoEXT const *") VkCopyImageToImageInfoEXT pCopyImageToImageInfo) {
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
     * Perform an image layout transition on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To perform an image layout transition on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkTransitionImageLayoutEXT(
     *     VkDevice                                    device,
     *     uint32_t                                    transitionCount,
     *     const VkHostImageLayoutTransitionInfoEXT*   pTransitions);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pTransitions} <b>must</b> be a valid pointer to an array of {@code transitionCount} valid {@link VkHostImageLayoutTransitionInfoEXT} structures</li>
     * <li>{@code transitionCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkHostImageLayoutTransitionInfoEXT}</p>
     *
     * @param device       the device which owns {@code pTransitions}[i].{@code image}.
     * @param pTransitions a pointer to an array of {@link VkHostImageLayoutTransitionInfoEXT} structures specifying the image and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">subresource ranges</a> within them to transition.
     */
    @NativeType("VkResult")
    public static int vkTransitionImageLayoutEXT(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfoEXT const *") VkHostImageLayoutTransitionInfoEXT.Buffer pTransitions) {
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
     * See {@link KHRMaintenance5#vkGetImageSubresourceLayout2KHR GetImageSubresourceLayout2KHR}.
     *
     * @param device       the logical device that owns the image.
     * @param image        the image whose layout is being queried.
     * @param pSubresource a pointer to a {@link VkImageSubresource2KHR} structure selecting a specific image for the image subresource.
     * @param pLayout      a pointer to a {@link VkSubresourceLayout2KHR} structure in which the layout is returned.
     */
    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2KHR const *") VkImageSubresource2KHR pSubresource, @NativeType("VkSubresourceLayout2KHR *") VkSubresourceLayout2KHR pLayout) {
        nvkGetImageSubresourceLayout2EXT(device, image, pSubresource.address(), pLayout.address());
    }

}