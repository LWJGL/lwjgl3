/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val MSFT_layered_driver = "MSFTLayeredDriver".nativeClassVK("MSFT_layered_driver", type = "device", postfix = "MSFT") {
    documentation =
        """
        This extension adds new physical device properties to allow applications and the Vulkan ICD loader to understand when a physical device is implemented as a layered driver on top of another underlying API.

        <h5>Examples</h5>
        None.

        <h5>VK_MSFT_layered_driver</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_MSFT_layered_driver}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>531</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Natalie <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_MSFT_layered_driver]%20@jenatali%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_MSFT_layered_driver%20extension*">jenatali</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_MSFT_layered_driver.adoc">VK_MSFT_layered_driver</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-06-21</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Natalie, Microsoft</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_LAYERED_DRIVER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_LAYERED_DRIVER_EXTENSION_NAME".."VK_MSFT_layered_driver"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT".."1000530000"
    )

    EnumConstant(
        """
        VkLayeredDriverUnderlyingApiMSFT - Layered driver underlying APIs

        <h5>See Also</h5>
        ##VkPhysicalDeviceLayeredDriverPropertiesMSFT
        """,

        "LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT".."0",
        "LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT".."1"
    )
}