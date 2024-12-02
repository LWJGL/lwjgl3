/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_host_image_copy = "EXTHostImageCopy".nativeClassVK("EXT_host_image_copy", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows applications to copy data between host memory and images on the host processor, without staging the data through a GPU-accessible buffer. This removes the need to allocate and manage the buffer and its associated memory. On some architectures it may also eliminate an extra copy operation. This extension additionally allows applications to copy data between images on the host.

        To support initializing a new image in preparation for a host copy, it is now possible to transition a new image to #IMAGE_LAYOUT_GENERAL or other host-copyable layouts via #TransitionImageLayoutEXT(). Additionally, it is possible to perform copies that preserve the swizzling layout of the image by using the #HOST_IMAGE_COPY_MEMCPY_EXT flag. In that case, the memory size needed for copies to or from a buffer can be retrieved by chaining ##VkSubresourceHostMemcpySizeEXT to {@code pLayout} in #GetImageSubresourceLayout2EXT().

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4, with the EXT suffix omitted. However, the feature is made optional in Vulkan 1.4. The original type, enum and command names are still available as aliases of the core functionality.

        A Vulkan 1.4 implementation that has a #QUEUE_GRAPHICS_BIT queue must support either:

        <ul>
            <li>the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-hostImageCopy">{@code hostImageCopy}</a> feature; or</li>
            <li>an additional queue that supports #QUEUE_TRANSFER_BIT.</li>
        </ul>

        Additionally, all queues supporting #QUEUE_GRAPHICS_BIT or #QUEUE_COMPUTE_BIT must also advertise #QUEUE_TRANSFER_BIT.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_host_image_copy}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>271</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a> and {@link KHRCopyCommands2 VK_KHR_copy_commands2} and {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.3">Version 1.3</a></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_host_image_copy]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_host_image_copy%20extension*">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_host_image_copy.adoc">VK_EXT_host_image_copy</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-04-26</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi, Google</li>
                <li>Faith Ekstrand, Collabora</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>James Fitzpatrick, Imagination</li>
                <li>Daniel Story, Nintendo</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_HOST_IMAGE_COPY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_HOST_IMAGE_COPY_EXTENSION_NAME".."VK_EXT_host_image_copy"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT".."1000270000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT".."1000270001",
        "STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT".."1000270002",
        "STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT".."1000270003",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT".."1000270004",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT".."1000270005",
        "STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT".."1000270006",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT".."1000270007",
        "STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT".."1000270008",
        "STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT".."1000270009"
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_HOST_TRANSFER_BIT_EXT".enum(0x00400000)
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT".enum(0x400000000000L)
    )

    EnumConstant(
        "Extends {@code VkHostImageCopyFlagBits}.",

        "HOST_IMAGE_COPY_MEMCPY_EXT".enum(0x00000001)
    )

    VkResult(
        "CopyMemoryToImageEXT",
        "See #CopyMemoryToImage().",

        VkDevice("device", "the device which owns {@code pCopyMemoryToImageInfo→dstImage}."),
        VkCopyMemoryToImageInfo.const.p("pCopyMemoryToImageInfo", "a pointer to a ##VkCopyMemoryToImageInfo structure describing the copy parameters.")
    )

    VkResult(
        "CopyImageToMemoryEXT",
        "See #CopyImageToMemory().",

        VkDevice("device", "the device which owns {@code pCopyImageToMemoryInfo→srcImage}."),
        VkCopyImageToMemoryInfo.const.p("pCopyImageToMemoryInfo", "a pointer to a ##VkCopyImageToMemoryInfo structure describing the copy parameters.")
    )

    VkResult(
        "CopyImageToImageEXT",
        "See #CopyImageToImage().",

        VkDevice("device", "the device which owns {@code pCopyImageToImageInfo→srcImage} and {@code pCopyImageToImageInfo→dstImage}."),
        VkCopyImageToImageInfo.const.p("pCopyImageToImageInfo", "a pointer to a ##VkCopyImageToImageInfo structure describing the copy parameters.")
    )

    VkResult(
        "TransitionImageLayoutEXT",
        "See #TransitionImageLayout().",

        VkDevice("device", "the device which owns {@code pTransitions}[i].{@code image}."),
        AutoSize("pTransitions")..uint32_t("transitionCount", "the number of image layout transitions to perform."),
        VkHostImageLayoutTransitionInfo.const.p("pTransitions", "a pointer to an array of ##VkHostImageLayoutTransitionInfo structures specifying the image and <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#resources-image-views\">subresource ranges</a> within them to transition.")
    )

    void(
        "GetImageSubresourceLayout2EXT",
        "See #GetImageSubresourceLayout2().",

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource2.const.p("pSubresource", "a pointer to a ##VkImageSubresource2 structure selecting a specific image for the image subresource."),
        VkSubresourceLayout2.p("pLayout", "a pointer to a ##VkSubresourceLayout2 structure in which the layout is returned.")
    )
}