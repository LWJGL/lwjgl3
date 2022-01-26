/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_diagnostics_config = "NVDeviceDiagnosticsConfig".nativeClassVK("NV_device_diagnostics_config", type = "device", postfix = "NV") {
    documentation =
        """
        Applications using Nvidia Nsight™ Aftermath SDK for Vulkan to integrate device crash dumps into their error reporting mechanisms, <b>may</b> use this extension to configure options related to device crash dump creation.

        <h5>VK_NV_device_diagnostics_config</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_device_diagnostics_config}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>301</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kedarnath Thangudu <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_device_diagnostics_config]%20@kthangudu%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_device_diagnostics_config%20extension%3E%3E">kthangudu</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-12-15</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Kedarnath Thangudu, NVIDIA</li>
                <li>Thomas Klein, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DEVICE_DIAGNOSTICS_CONFIG_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_DEVICE_DIAGNOSTICS_CONFIG_EXTENSION_NAME".."VK_NV_device_diagnostics_config"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV".."1000300000",
        "STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV".."1000300001"
    )

    EnumConstant(
        """
        VkDeviceDiagnosticsConfigFlagBitsNV - Bitmask specifying diagnostics flags

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_DIAGNOSTICS_CONFIG_ENABLE_SHADER_DEBUG_INFO_BIT_NV enables the generation of debug information for shaders.</li>
            <li>#DEVICE_DIAGNOSTICS_CONFIG_ENABLE_RESOURCE_TRACKING_BIT_NV enables driver side tracking of resources (images, buffers, etc.) used to augment the device fault information.</li>
            <li>#DEVICE_DIAGNOSTICS_CONFIG_ENABLE_AUTOMATIC_CHECKPOINTS_BIT_NV enables automatic insertion of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#device-diagnostic-checkpoints">diagnostic checkpoints</a> for draw calls, dispatches, trace rays, and copies. The CPU call stack at the time of the command will be associated as the marker data for the automatically inserted checkpoints.</li>
        </ul>
        """,

        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_SHADER_DEBUG_INFO_BIT_NV".enum(0x00000001),
        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_RESOURCE_TRACKING_BIT_NV".enum(0x00000002),
        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_AUTOMATIC_CHECKPOINTS_BIT_NV".enum(0x00000004)
    )
}