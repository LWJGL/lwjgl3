/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_image_view_handle = "NVXImageViewHandle".nativeClassVK("NVX_image_view_handle", type = "device", postfix = "NVX") {
    documentation =
        """
        This extension allows applications to query an opaque handle from an image view for use as a sampled image or storage image. This provides no direct functionality itself.

        <h5>VK_NVX_image_view_handle</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NVX_image_view_handle}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>31</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Eric Werness <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_image_view_handle]%20@ewerness-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_image_view_handle%20extension%3E%3E">ewerness-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-04-03</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME".."VK_NVX_image_view_handle"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX".."1000030000",
        "STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX".."1000030001"
    )

    uint32_t(
        "GetImageViewHandleNVX",
        """
        Get the handle for an image view for a specific descriptor type.

        <h5>C Specification</h5>
        To get the handle for an image view, call:

        <pre><code>
￿uint32_t vkGetImageViewHandleNVX(
￿    VkDevice                                    device,
￿    const VkImageViewHandleInfoNVX*             pInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkImageViewHandleInfoNVX structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageViewHandleInfoNVX
        """,

        VkDevice("device", "the logical device that owns the image view."),
        VkImageViewHandleInfoNVX.const.p("pInfo", "describes the image view to query and type of handle.")
    )

    VkResult(
        "GetImageViewAddressNVX",
        """
        Get the device address of an image view.

        <h5>C Specification</h5>
        To get the device address for an image view, call:

        <pre><code>
￿VkResult vkGetImageViewAddressNVX(
￿    VkDevice                                    device,
￿    VkImageView                                 imageView,
￿    VkImageViewAddressPropertiesNVX*            pProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
            <li>{@code pProperties} <b>must</b> be a valid pointer to a ##VkImageViewAddressPropertiesNVX structure</li>
            <li>{@code imageView} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_UNKNOWN</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkImageViewAddressPropertiesNVX
        """,

        VkDevice("device", "the logical device that owns the image view."),
        VkImageView("imageView", "a handle to the image view."),
        VkImageViewAddressPropertiesNVX.p("pProperties", "contains the device address and size when the call returns.")
    )
}