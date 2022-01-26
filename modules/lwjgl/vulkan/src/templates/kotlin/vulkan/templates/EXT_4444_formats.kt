/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_4444_formats = "EXT4444Formats".nativeClassVK("EXT_4444_formats", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension defines the #FORMAT_A4R4G4B4_UNORM_PACK16_EXT and #FORMAT_A4B4G4R4_UNORM_PACK16_EXT formats which are defined in other current graphics APIs.

        This extension may be useful for building translation layers for those APIs or for porting applications that use these formats without having to resort to swizzles.

        When VK_EXT_custom_border_color is used, these formats are not subject to the same restrictions for border color without format as with VK_FORMAT_B4G4R4A4_UNORM_PACK16.

        <h5>Promotion to Vulkan 1.3</h5>
        This extension has been partially promoted. The format enumerants introduced by the extension are included in core Vulkan 1.3, with the EXT suffix omitted. However, runtime support for these formats is optional in core Vulkan 1.3, while if this extension is supported, runtime support is mandatory. The feature structure is not promoted. The original enum names are still available as aliases of the core functionality.

        <h5>VK_EXT_4444_formats</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_4444_formats}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>341</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Joshua Ashton <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_4444_formats]%20@Joshua-Ashton%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_4444_formats%20extension%3E%3E">Joshua-Ashton</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-07-28</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Joshua Ashton, Valve</li>
                <li>Jason Ekstrand, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_4444_FORMATS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_4444_FORMATS_EXTENSION_NAME".."VK_EXT_4444_formats"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT".."1000340000"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_A4R4G4B4_UNORM_PACK16_EXT".."1000340000",
        "FORMAT_A4B4G4R4_UNORM_PACK16_EXT".."1000340001"
    )
}