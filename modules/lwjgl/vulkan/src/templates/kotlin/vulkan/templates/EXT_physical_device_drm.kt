/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_physical_device_drm = "EXTPhysicalDeviceDrm".nativeClassVK("EXT_physical_device_drm", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension provides new facilities to query DRM properties for physical devices, enabling users to match Vulkan physical devices with DRM nodes on Linux.

        Its functionality closely overlaps with {@code EGL_EXT_device_drm}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VK_EXT_physical_device_drm-fn1">1</a></sup>. Unlike the EGL extension, this extension does not expose a string containing the name of the device file and instead exposes device minor numbers.

        DRM defines multiple device node types. Each physical device may have one primary node and one render node associated. Physical devices may have no primary node (e.g. if the device does not have a display subsystem), may have no render node (e.g. if it is a software rendering engine), or may have neither (e.g. if it is a software rendering engine without a display subsystem).

        To query DRM properties for a physical device, chain ##VkPhysicalDeviceDrmPropertiesEXT to ##VkPhysicalDeviceProperties2.

        <h5>References</h5>
        <ul>
            <li><a target="_blank" href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_drm.txt">{@code EGL_EXT_device_drm}</a></li>
        </ul>

        <h5>VK_EXT_physical_device_drm</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_physical_device_drm}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>354</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Simon Ser <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_physical_device_drm]%20@emersion%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_physical_device_drm%20extension%3E%3E">emersion</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-09</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Simon Ser</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PHYSICAL_DEVICE_DRM_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PHYSICAL_DEVICE_DRM_EXTENSION_NAME".."VK_EXT_physical_device_drm"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT".."1000353000"
    )
}