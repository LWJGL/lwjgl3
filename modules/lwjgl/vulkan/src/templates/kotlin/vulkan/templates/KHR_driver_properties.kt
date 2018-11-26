/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_driver_properties = "KHRDriverProperties".nativeClassVK("KHR_driver_properties", type = "device", postfix = KHR) {
    documentation =
        """
        This extension provides a new physical device query which allows retrieving information about the driver implementation, allowing applications to determine which physical device corresponds to which particular vendor's driver, and which conformance test suite version the driver implementation is compliant with.

        <h5>Examples</h5>
        None.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_driver_properties}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>197</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_driver_properties:%20&amp;body=@drakos-amd%20">drakos-amd</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-04-11</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Baldur Karlsson</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Alexander Galazin, Arm</li>
                <li>Jesse Hall, Google</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DRIVER_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DRIVER_PROPERTIES_EXTENSION_NAME".."VK_KHR_driver_properties"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR".."1000196000"
    )

    EnumConstant(
        "VK_MAX_DRIVER_NAME_SIZE_KHR",

        "MAX_DRIVER_NAME_SIZE_KHR".."256"
    )

    EnumConstant(
        "VK_MAX_DRIVER_INFO_SIZE_KHR",

        "MAX_DRIVER_INFO_SIZE_KHR".."256"
    )

    EnumConstant(
        """
        VkDriverIdKHR - Khronos driver IDs

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Khronos driver IDs may be allocated by vendors at any time. There may be multiple driver IDs for the same vendor, representing different drivers (for e.g. different platforms, proprietary or open source, etc.). Only the latest canonical versions of this Specification, of the corresponding {@code vk.xml} API Registry, and of the corresponding {@code vulkan_core.h} header file <b>must</b> contain all reserved Khronos driver IDs.

        Only driver IDs registered with Khronos are given symbolic names. There <b>may</b> be unregistered driver IDs returned.
        </div>

        <h5>See Also</h5>
        ##VkPhysicalDeviceDriverPropertiesKHR
        """,

        "DRIVER_ID_AMD_PROPRIETARY_KHR".."1",
        "DRIVER_ID_AMD_OPEN_SOURCE_KHR".."2",
        "DRIVER_ID_MESA_RADV_KHR".."3",
        "DRIVER_ID_NVIDIA_PROPRIETARY_KHR".."4",
        "DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR".."5",
        "DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR".."6",
        "DRIVER_ID_IMAGINATION_PROPRIETARY_KHR".."7",
        "DRIVER_ID_QUALCOMM_PROPRIETARY_KHR".."8",
        "DRIVER_ID_ARM_PROPRIETARY_KHR".."9",
        "DRIVER_ID_GOOGLE_PASTEL_KHR".."10"
    )
}