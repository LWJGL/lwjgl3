/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_hdr_metadata = "EXTHdrMetadata".nativeClassVK("EXT_hdr_metadata", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension defines two new structures and a function to assign SMPTE (the Society of Motion Picture and Television Engineers) 2086 metadata and CTA (Consumer Technology Association) 861.3 metadata to a swapchain.

        SMPTE 2086 metadata defines the color volume of the display on which the content was optimized for viewing and includes the color primaries, white point, and luminance range. When such content is reproduced on another display, this metadata can be used by the presentation engine to improve processing of images. For instance, values in the image can first be clamped to the color volume described in the metadata, and then what remains can be remapped to the color volume of the presentation engine.

        CTA 861.3 metadata additionally includes the maximum intended luminance for the content and the maximum average light level across frames.

        This extension does not define exactly how this metadata is used, however, it simply provides a mechanism to provide it to the presentation engine. Presentation engines may process the image based on the metadata before displaying it, resulting in the image being modified outside of Vulkan. For example, the clamping of colors in the image to the color volume may change those values in the image itself.

        The metadata does not override or otherwise influence the color space and color encoding.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_hdr_metadata}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>106</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRSwapchain VK_KHR_swapchain}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_hdr_metadata]%20@courtney-g%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_hdr_metadata%20extension*">courtney-g</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-03-26</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter, Google</li>
                <li>Sebastian Wick, Red Hat Inc.</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_HDR_METADATA_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_HDR_METADATA_EXTENSION_NAME".."VK_EXT_hdr_metadata"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_HDR_METADATA_EXT".."1000105000"
    )

    void(
        "SetHdrMetadataEXT",
        """
        Set HDR metadata.

        <h5>C Specification</h5>
        To provide HDR metadata to an implementation, call:

        <pre><code>
￿void vkSetHdrMetadataEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    swapchainCount,
￿    const VkSwapchainKHR*                       pSwapchains,
￿    const VkHdrMetadataEXT*                     pMetadata);</code></pre>

        <h5>Description</h5>
        The metadata will be applied to the specified {@code VkSwapchainKHR} objects at the next #QueuePresentKHR() call using that {@code VkSwapchainKHR} object. The metadata will persist until a subsequent {@code vkSetHdrMetadataEXT} changes it.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pSwapchains} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
            <li>{@code pMetadata} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid ##VkHdrMetadataEXT structures</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pSwapchains} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkHdrMetadataEXT
        """,

        VkDevice("device", "the logical device where the swapchain(s) were created."),
        AutoSize("pSwapchains", "pMetadata")..uint32_t("swapchainCount", "the number of swapchains included in {@code pSwapchains}."),
        VkSwapchainKHR.const.p("pSwapchains", "a pointer to an array of {@code swapchainCount} {@code VkSwapchainKHR} handles."),
        VkHdrMetadataEXT.const.p("pMetadata", "a pointer to an array of {@code swapchainCount} ##VkHdrMetadataEXT structures.")
    )
}