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

        <h5>VK_EXT_host_image_copy</h5>
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
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRCopyCommands2 VK_KHR_copy_commands2} and {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2}</dd>

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
        """
        VkHostImageCopyFlagBitsEXT - Bitmask specifying additional copy parameters

        <h5>Description</h5>
        <ul>
            <li>#HOST_IMAGE_COPY_MEMCPY_EXT specifies that no memory layout swizzling is to be applied during data copy. For copies between memory and images, this flag indicates that image data in host memory is swizzled in exactly the same way as the image data on the device. Using this flag indicates that the implementations <b>may</b> use a simple memory copy to transfer the data between the host memory and the device memory. The format of the swizzled data in host memory is platform dependent and is not defined in this specification.</li>
        </ul>
        """,

        "HOST_IMAGE_COPY_MEMCPY_EXT".enum(0x00000001)
    )

    VkResult(
        "CopyMemoryToImageEXT",
        """
        Copy data from host memory into an image.

        <h5>C Specification</h5>
        To copy data from host memory to an image object, call:

        <pre><code>
￿VkResult vkCopyMemoryToImageEXT(
￿    VkDevice                                    device,
￿    const VkCopyMemoryToImageInfoEXT*           pCopyMemoryToImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally similar to #CmdCopyBufferToImage2(), except it is executed on the host and reads from host memory instead of a buffer.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-hostImageCopy">{@code hostImageCopy}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCopyMemoryToImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMemoryToImageInfoEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyMemoryToImageInfoEXT
        """,

        VkDevice("device", "the device which owns {@code pCopyMemoryToImageInfo→dstImage}."),
        VkCopyMemoryToImageInfoEXT.const.p("pCopyMemoryToImageInfo", "a pointer to a ##VkCopyMemoryToImageInfoEXT structure describing the copy parameters.")
    )

    VkResult(
        "CopyImageToMemoryEXT",
        """
        Copy image data into host memory.

        <h5>C Specification</h5>
        To copy data from an image object to host memory, call:

        <pre><code>
￿VkResult vkCopyImageToMemoryEXT(
￿    VkDevice                                    device,
￿    const VkCopyImageToMemoryInfoEXT*           pCopyImageToMemoryInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally similar to #CmdCopyImageToBuffer2(), except it is executed on the host and writes to host memory instead of a buffer.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-hostImageCopy">{@code hostImageCopy}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCopyImageToMemoryInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageToMemoryInfoEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyImageToMemoryInfoEXT
        """,

        VkDevice("device", "the device which owns {@code pCopyImageToMemoryInfo→srcImage}."),
        VkCopyImageToMemoryInfoEXT.const.p("pCopyImageToMemoryInfo", "a pointer to a ##VkCopyImageToMemoryInfoEXT structure describing the copy parameters.")
    )

    VkResult(
        "CopyImageToImageEXT",
        """
        Copy image data using the host.

        <h5>C Specification</h5>
        To copy data from an image object to another image object using the host, call:

        <pre><code>
￿VkResult vkCopyImageToImageEXT(
￿    VkDevice                                    device,
￿    const VkCopyImageToImageInfoEXT*            pCopyImageToImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally similar to #CmdCopyImage2(), except it is executed on the host.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-hostImageCopy">{@code hostImageCopy}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCopyImageToImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageToImageInfoEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyImageToImageInfoEXT
        """,

        VkDevice("device", "the device which owns {@code pCopyImageToMemoryInfo→srcImage}."),
        VkCopyImageToImageInfoEXT.const.p("pCopyImageToImageInfo", "a pointer to a ##VkCopyImageToImageInfoEXT structure describing the copy parameters.")
    )

    VkResult(
        "TransitionImageLayoutEXT",
        """
        Perform an image layout transition on the host.

        <h5>C Specification</h5>
        To perform an image layout transition on the host, call:

        <pre><code>
￿VkResult vkTransitionImageLayoutEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    transitionCount,
￿    const VkHostImageLayoutTransitionInfoEXT*   pTransitions);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pTransitions} <b>must</b> be a valid pointer to an array of {@code transitionCount} valid ##VkHostImageLayoutTransitionInfoEXT structures</li>
            <li>{@code transitionCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkHostImageLayoutTransitionInfoEXT
        """,

        VkDevice("device", "the device which owns {@code pTransitions}[i].{@code image}."),
        AutoSize("pTransitions")..uint32_t("transitionCount", "the number of image layout transitions to perform."),
        VkHostImageLayoutTransitionInfoEXT.const.p("pTransitions", "a pointer to an array of ##VkHostImageLayoutTransitionInfoEXT structures specifying the image and <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#resources-image-views\">subresource ranges</a> within them to transition.")
    )

    void(
        "GetImageSubresourceLayout2EXT",
        "See #GetImageSubresourceLayout2KHR().",

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource2KHR.const.p("pSubresource", "a pointer to a ##VkImageSubresource2KHR structure selecting a specific image for the image subresource."),
        VkSubresourceLayout2KHR.p("pLayout", "a pointer to a ##VkSubresourceLayout2KHR structure in which the layout is returned.")
    )
}