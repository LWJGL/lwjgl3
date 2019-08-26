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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Alexander Galazin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_float_controls:%20&amp;body=@alegal-arm%20">alegal-arm</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-09-11</dd>

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
        """
        VkShaderFloatControlsIndependenceKHR - Enum specifying whether, and how, shader float controls can be set separately

        <h5>Description</h5>
        <ul>
            <li>#SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR specifies that shader float controls for 32-bit floating point <b>can</b> be set independently; other bit widths <b>must</b> be set identically to each other.</li>
            <li>#SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR specifies that shader float controls for all bit widths <b>can</b> be set independently.</li>
            <li>#SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR specifies that shader float controls for all bit widths <b>must</b> be set identically.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFloatControlsPropertiesKHR
        """,

        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR".."0",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR".."1",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR".."2"
    )
}