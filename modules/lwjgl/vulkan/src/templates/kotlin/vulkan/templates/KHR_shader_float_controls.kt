/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_float_controls = "KHRShaderFloatControls".nativeClassVK("KHR_shader_float_controls", type = "device", postfix = KHR) {
    documentation =
        """
        <h5>Description</h5>
        The {@code VK_KHR_shader_float_controls} extension enables efficient use of floating-point computations through the ability to query and override the implementation's default behavior for rounding modes, denormals, signed zero, and infinity.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_float_controls}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>198</dd>

            <dt><b>Revision</b></dt>
            <dd>4</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Alexander Galazin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_float_controls:%20&amp;body=@alegal-arm%20">alegal-arm</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-09-11</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_float_controls.html">{@code SPV_KHR_float_controls}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexander Galazin, Arm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_FLOAT_CONTROLS_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_FLOAT_CONTROLS_EXTENSION_NAME".."VK_KHR_shader_float_controls"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR".."1000197000"
    )

    EnumConstant(
        "Extends {@code VkShaderFloatControlsIndependence}.",

        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR".."0",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR".."1",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR".."2"
    )
}