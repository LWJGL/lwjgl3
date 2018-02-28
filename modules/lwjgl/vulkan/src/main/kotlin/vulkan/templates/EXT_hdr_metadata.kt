/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_hdr_metadata = "EXTHdrMetadata".nativeClassVK("EXT_hdr_metadata", type = "device", postfix = EXT) {
    documentation =
        """
        This extension defines two new structures and a function to assign SMPTE (the Society of Motion Picture and Television Engineers) 2086 metadata and CTA (Consumer Technology Assocation) 861.3 metadata to a swapchain. The metadata includes the color primaries, white point, and luminance range of the mastering display, which all together define the color volume that contains all the possible colors the mastering display can produce. The mastering display is the display where creative work is done and creative intent is established. To preserve such creative intent as much as possible and achieve consistent color reproduction on different viewing displays, it is useful for the display pipeline to know the color volume of the original mastering display where content was created or tuned. This avoids performing unnecessary mapping of colors that are not displayable on the original mastering display. The metadata also includes the {@code maxContentLightLevel} and {@code maxFrameAverageLightLevel} as defined by CTA 861.3.

        While the general purpose of the metadata is to assist in the transformation between different color volumes of different displays and help achieve better color reproduction, it is not in the scope of this extension to define how exactly the metadata should be used in such a process. It is up to the implementation to determine how to make use of the metadata.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_hdr_metadata}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>106</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter @courtneygo</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-04</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Courtney Goeltzenleuchter, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_HDR_METADATA_SPEC_VERSION".."1"
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
        function to set Hdr metadata.

        <h5>C Specification</h5>
        <code><pre>
￿void vkSetHdrMetadataEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    swapchainCount,
￿    const VkSwapchainKHR*                       pSwapchains,
￿    const VkHdrMetadataEXT*                     pMetadata);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pSwapchains} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles</li>
            <li>{@code pMetadata} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid ##VkHdrMetadataEXT structures</li>
            <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code device}, and the elements of {@code pSwapchains} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>See Also</h5>
        ##VkHdrMetadataEXT
        """,

        VkDevice.IN("device", "the logical device where the swapchain(s) were created."),
        AutoSize("pSwapchains", "pMetadata")..uint32_t.IN("swapchainCount", "the number of swapchains included in {@code pSwapchains}."),
        VkSwapchainKHR.const.p.IN("pSwapchains", "a pointer to the array of {@code swapchainCount} {@code VkSwapchainKHR} handles."),
        VkHdrMetadataEXT.const.p.IN("pMetadata", "a pointer to the array of {@code swapchainCount} ##VkHdrMetadataEXT structures.")
    )
}